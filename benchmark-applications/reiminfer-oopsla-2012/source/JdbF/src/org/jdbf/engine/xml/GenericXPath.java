
/*
* 03/14/2002 - 23:11:34
*
* $RCSfile: GenericXPath.java,v $ - JDBF Object Relational mapping system
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

 $Id: GenericXPath.java,v 1.6 2004/05/20 22:44:15 gmartone Exp $

*/

package org.jdbf.engine.xml;

import org.w3c.dom.*;

/* project's packages and classes */
import org.jdbf.engine.mapping.MappingException;
import org.jdbf.engine.repository.Repository;

/**
 * 
 * <code>GenericXPath</code> represents a generic interface to parse
 * repository file using XPath feature 
 * 
 * @author Giovanni Martone<br>
 * @version $Revision: 1.6 $<br>
 * last changed by $Author: gmartone $
 */
public interface GenericXPath {

	/**
	 * Create RepositoryView object
	 * @param e
	 * @return Repository
	 * @throws MappingException
	 */
	public Repository createRepositoryView(Element e) 
		throws MappingException;

    /**
     * Return the value of attribute
     * @param xPath
     * @param attribute
     * @param value
     * @return Object
     * @throws MappingException
     */
    public Object getValueOfAttribute(String xPath, String attribute, String value) 
    	throws MappingException;
}

/*

 $Log: GenericXPath.java,v $
 Revision 1.6  2004/05/20 22:44:15  gmartone
 Changed for task 99073 (Coverage Javadocs)

 Revision 1.5  2003/11/15 16:46:10  lechertl
 task 88931, update to SAX 2 ready


*/
