/*
 * 25/10/2002 - 09:37:11
 *
 * $RCSfile: UpdateCriteria.java,v $ - JdbF Object Relational mapping system
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
  * $Id: UpdateCriteria.java,v 1.3 2004/05/20 22:37:09 gmartone Exp $
  * 
  */
package org.jdbf.engine.criteria;

/**
 * 
 * <code>UpdateCriteria</code> represent condition to append 
 * to update statement.<br>
 * 
 * @author Giovanni Martone<br>
 * @version $Revision: 1.3 $<br>
 * last changed by $Author: gmartone $
 */
public class UpdateCriteria extends Criteria{
    	
    
	/**
	 * Create UpdateCriteria given repositoryViewName
	 * @param repositoryName
	 */
	public UpdateCriteria(String repositoryName) {
        super(repositoryName);
    }    
}

/*
 * 
 * $Log: UpdateCriteria.java,v $
 * Revision 1.3  2004/05/20 22:37:09  gmartone
 * Changed for task 99073 (Coverage Javadocs)
 *
 * 
 */


