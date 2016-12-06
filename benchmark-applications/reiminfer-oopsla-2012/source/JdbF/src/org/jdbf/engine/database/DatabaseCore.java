/*
* 04/04/2002 - 23:12:27
*
* $RCSfile: DatabaseCore.java,v $ - JDBF Object Relational mapping system
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

 $Id: DatabaseCore.java,v 1.9 2004/06/28 22:11:16 gmartone Exp $

*/

package org.jdbf.engine.database;

import java.sql.*;
import java.util.logging.Logger;

import org.jdbf.engine.caching.CacheManager;
import org.jdbf.engine.sql.SqlInterface;
import org.jdbf.engine.transaction.*;
import org.jdbf.engine.repository.RepositoryFactory;


/**
 * <code>DatabaseCore</code> represents database.
 *
 * @author Giovanni Martone
 * @version $Revision: 1.9 $
 * last changed by $Author: gmartone $
 *
 */
public abstract class DatabaseCore implements Database  {
                        
    /**
     * Factory of Repository
     */    
    protected RepositoryFactory repFactory;

	/**
	 * SqlInterface
	 */
    protected SqlInterface sqlInterface;
    
    /**
     * Class name
     */
    protected String className;

    /**
     * Logger object
     */
    protected Logger logger;
    
	/**
	 * Represents Cache
	 */
	protected CacheManager cacheManager;


    /**
     * Creates a DatabaseCore object from 
     * RepositoryFactory object
     *
     * @param repFactory
     * @param cacheMan
     */
    public DatabaseCore(RepositoryFactory repFactory,
                        CacheManager cacheMan){
		className = this.getClass().getName();
		logger = Logger.getLogger(className);
		this.repFactory = repFactory;
		//default is created a generic sqlInterface
		sqlInterface = new SqlInterface();
		cacheManager = cacheMan;
    }

	   
    /**
     * Open transaction
     * 
     * @throws TransactionException 
     */
    public abstract void begin() throws TransactionException;


    /**
     * Close transaction
     */
    public abstract void close();   
    
    
    /**
     * Commit the operations of transaction
     * 
     * @throws TransactionException
     * 
     */
    public abstract void commit(Connection connection)
	throws TransactionException;

    /**
     * Return RepositoryFactory object
     * @return RepositoryFactory
     */
    public RepositoryFactory getRepositoryFactory(){
		return repFactory;
    }
	
    /**
     * Rollback the operations of transaction
     * 
     * @throws TransactionException
     * 
     */
    public abstract void rollback(Connection connection) 
	throws TransactionException;   
}

/*

  $Log: DatabaseCore.java,v $
  Revision 1.9  2004/06/28 22:11:16  gmartone
  changes for  task 80429 (Enanchement DCS)

  Revision 1.8  2004/05/20 22:37:53  gmartone
  Changed for task 99073 (Coverage Javadocs)

  Revision 1.7  2004/05/18 18:01:10  gmartone
  removed import that alre not needed

  Revision 1.6  2004/04/29 22:35:46  gmartone


  Task 66484 (Logging System)
    
  
*/
