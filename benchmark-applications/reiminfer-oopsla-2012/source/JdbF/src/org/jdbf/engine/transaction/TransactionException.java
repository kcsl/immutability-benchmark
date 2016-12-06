/*
* 04/04/2002 - 23:12:27
*
* $RCSfile: TransactionException.java,v $ - JdbF Object Relational mapping system
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
  $Id: TransactionException.java,v 1.5 2004/05/20 22:43:05 gmartone Exp $
*/

package org.jdbf.engine.transaction;

import org.jdbf.engine.JDBFException;

/**
 *
 * <code>TransactionException</code> informs that the user transaction 
 * has been explicitly aborted by the database due to some failure and 
 * the reason for that failure.
 *
 * @author Giovanni Martone<br>
 * @version $Revision: 1.5 $<br>
 * last changed by $Author: gmartone $
 *
 */
public class TransactionException extends JDBFException{

    /**
     * Creates TransactionException matching a message with
     * an exception
     *
     * @param message
     * @param except
     *
     */
    public TransactionException(String message, Exception except){
        super(message, except);
    }

    /**
     * Creates TransactionException with a message
     *
     * @param message
     *
     */
    public TransactionException(String message){
        super(message);
    }
}

/*

 $Log: TransactionException.java,v $
 Revision 1.5  2004/05/20 22:43:05  gmartone
 Changed for task 99073 (Coverage Javadocs)

 Revision 1.4  2004/01/25 11:37:42  gmartone
 cosmetics changes

 Revision 1.3  2003/11/25 22:19:23  lechertl
 vcs keywords added


*/