/*
 * 20/01/2003 - 10:16:37
 *
 * $RCSfile: HsqlInterface.java,v $ - JDBF Object Relational mapping system
 * Copyright (C) 2002 JDBF Developer Team
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
  * $Id: HsqlInterface.java,v 1.3 2004/05/20 22:41:54 gmartone Exp $
  */
package org.jdbf.engine.sql;


/**
 * <code>HsqlInterface</code> overrides SqlInterface's methods 
 * for constructing sql statements where this implementation 
 * differs from ANSI or is not specified by ANSI.<br>
 *
 * @author  Giovanni Martone<br>
 * @version $Revision: 1.3 $<br>
 * last changed by $Author: gmartone $
 *
 */
public class HsqlInterface extends SqlInterface {

    /**
     * Creates an empty object
     *
     */
    public HsqlInterface() {}


    /**
	 * Return the current timestamp
	 *
	 * @return current Timestamp
	 */
	public String getClauseStringCurrentTimeStamp(){
        return 	"NOW()";
    }


	/**
	 * Return the current timeStamp statement
	 *
	 * @return current timestamp statement
	 */
	public String getCurrentTimeStampStatement(){
		return "CALL NOW()";
    }
}
/*
 * 
 * $Log: HsqlInterface.java,v $
 * Revision 1.3  2004/05/20 22:41:54  gmartone
 * Changed for task 99073 (Coverage Javadocs)
 *
 * 
 */
