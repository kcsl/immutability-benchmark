/*
 * 11/14/2002 - 09:40:11
 *
 * $RCSfile: MaxKeyGenerator.java,v $ - JdbF Object Relational mapping system
 * Copyright (C) 2002 JDBF Development Team
 * 
 * http://jdbf.sourceforge.net
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public License
 * as published by the Free Software Foundation; either version 2
 * of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 675 Mass Ave, Cambridge, MA 02139, USA.
 */

 /*

 $Id: MaxKeyGenerator.java,v 1.7 2004/05/31 22:36:13 gmartone Exp $

*/
package org.jdbf.engine.keygen;

import java.math.BigDecimal; 
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Logger;
import java.util.logging.Level;


import org.jdbf.castor.Messages; 
import org.jdbf.engine.mapping.*;
import org.jdbf.engine.repository.RepositoryView;
import org.jdbf.engine.sql.SqlInterface;


/**
 * <code>MaxKeyGenerator</code> representes the key generator that creates OID
 * Obtains a key by adding 1 to the highest key in the table.<br> 
 * 
 * This class has been developed on Max approach described by Scott Ambler in 
 * <a href="http://www.ambysoft.com/mappingObjects.pdf"> Mapping Objects To Relational 
 * Databases</a>. 
 * 
 * @author Giovanni Martone
 * @version $Revision: 1.7 $
 * last changed by $Author: gmartone $
 *
 */
public class MaxKeyGenerator implements KeyGenerator{

	/**
	 * Class name
	 */
	private static final String CLASS_NAME = "org.jdbf.engine.keygen.MaxKeyGenerator";

	/**
	 * Logger object
	 */
	private Logger logger = Logger.getLogger(CLASS_NAME);

	/**
	 * Return true if before insert., false otherwise
	 *
	 * @return boolean
	 */
	public boolean isBeforeInsert() { return true; }


	/**
	 * Obtains a key by adding 1 to the highest key in the table. This method
	 * obtain a key creating a MAX select statement.
	 *
	 * @param view RepositoryView object
	 * @param conn Connection the databas
	 * @param vendor name of database vendor may be null
	 * @return the key
	 * @exception KeyGenerationException if an error occurs
	 * 
	 */
	public synchronized Object generateKey(RepositoryView view, 
										   Connection conn,String vendor,
					   					   SqlInterface sqlInterface)
		throws KeyGenerationException{
		
		logger.log(Level.INFO,Messages.message("MaxKeyGen.generateKey"));
		Object identity = null;
		BeanDescriptor beanDesc = view.getBeanDescriptor();
		String tableName = beanDesc.getTableName();
		String keyName = "";		
		ArrayList itemDescriptors = (ArrayList)beanDesc.getPrimaryKeyMap().getPrimaryKey();

		for(int i = 0; i < itemDescriptors.size(); i++){
			ItemDescriptor item = (ItemDescriptor)itemDescriptors.get(i);
			if(item.isPrimaryKey()){
				keyName = item.getColumnTableName();
				logger.log(Level.FINEST,Messages.message("PrimaryKey " + keyName));
				break;
			}
		}

		// "SELECT MAX(pk) FROM table t"
		StringBuffer condition = new StringBuffer(32);		
		condition.append("SELECT ")
			 .append(SqlInterface.MAX + "(" + keyName + ") ")
			 .append(SqlInterface.FROM).append(tableName);

		String sql = condition.toString();

		logger.log(Level.FINEST,Messages.format("MaxKeyGen.sql",sql));

		ResultSet rs = null;
		Statement stmt = null;
		try {			
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			if (rs.next()) {
				identity = rs.getObject(1);
				if(identity == null){
					identity = ONE;
			}
			else{				
				Class  identClass = identity.getClass();
				if (identClass.equals(Integer.class)) {
					identity = new Integer(((Integer)identity).intValue() + 1);
				} 
				else 
					if (identClass.equals(BigDecimal.class)) {
						identity = ((BigDecimal)identity).add(ONE);
					}
					else{
						logger.throwing(CLASS_NAME,"generateKey()",
							new KeyGenerationException(
							Messages.format("mapping.keyGenWrongType",
							getClass().getName(), 
							identity.getClass())
						));
						
						throw new KeyGenerationException(
									Messages.format("mapping.keyGenWrongType",
									getClass().getName(),identity.getClass()
									));
					}
				}
			}
		}
		catch (SQLException excep) {	    
			logger.throwing(CLASS_NAME,"generateKey()",
					new KeyGenerationException(excep)
			);
			
			throw new KeyGenerationException(excep);
		}		
		finally {
			try {
				rs.close();
				if (stmt != null) {
					stmt.close();
				}
				stmt = null;
			}
			catch (SQLException excep){
				logger.throwing(CLASS_NAME,"generateKey()",
					new KeyGenerationException(excep)
				);
				
				throw new KeyGenerationException(excep);
			}
		}
		logger.log(Level.INFO,Messages.format("MaxKeyGen.generatedKey",identity));
		return identity;		  
	}
}

/*
  $Log: MaxKeyGenerator.java,v $
  Revision 1.7  2004/05/31 22:36:13  gmartone
  changed for task 99533 (Composite Primary Key)

  Revision 1.6  2004/05/20 22:39:38  gmartone
  Changed for task 99073 (Coverage Javadocs) and resolved some errors in compilation

  Revision 1.5  2004/04/29 23:00:03  gmartone
  Changed MappingException in KeyGenerationException in generateKey method signature

  Revision 1.4  2004/04/19 23:49:50  gmartone
  changed type of Exception thrown in generateKey methods from MappingException to KeyGenerationException and added task 66484 (Logging System)


*/