/*
* 04/04/2002 - 23:12:27
*
 * $RCSfile: Database.java,v $ - JdbF Object Relational mapping system
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
 * 
 * $Id: Database.java,v 1.3 2004/05/20 22:37:53 gmartone Exp $
 */
package org.jdbf.engine.database;

      
import java.sql.Connection;

import org.jdbf.engine.transaction.*;

/**
 * 
 * <code>Database</code> is the interface that 
 * represents the database.
 * 
 * @author Giovanni Martone<br>
 * @version $Revision: 1.3 $<br>
 * last changed by $Author: gmartone $
 */
public interface Database  {
    
    /** Begin transaction */    
    public void begin() throws TransactionException;
  
    
    /** Close the transaction */
    public void close(); 
    
    
    /** Commit the transaction */
    public void commit(Connection connection) 
		throws TransactionException;
  
    
    /** Rollback the trasanction */
    public void rollback(Connection connection) 
		throws  TransactionException;    
}

/*
 * 
 * 
 * $Log: Database.java,v $
 * Revision 1.3  2004/05/20 22:37:53  gmartone
 * Changed for task 99073 (Coverage Javadocs)
 *
 * 
 */
