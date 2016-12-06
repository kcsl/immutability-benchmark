/*
 * 24/09/2002 - 23:55:27
 *
 * $RCSfile: Cursor.java,v $ - JDBF Object Relational mapping system
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

 $Id: Cursor.java,v 1.15 2004/06/28 22:15:15 gmartone Exp $

*/

package org.jdbf.engine.sql;

import java.util.List;
import java.util.logging.Logger;
import java.util.logging.Level;

import org.jdbf.castor.Messages;
import org.jdbf.engine.basic.ObjectMapped;

/**
 * This subclass of QueryResults provides rows
 * of an sql query form cache.
 *
 * @author Giovanni Martone
 * @version $Revision: 1.15 $
 * last changed by $Author: gmartone $
 *
 */
public class Cursor extends QueryResults{

    /** 
     * List of results 
     */
    private List results;

    /** 
     * Current index 
     */
    private int index = -1;

    /** 
     * Array of results 
     */
    private ObjectMapped[] fields;

	
    
    /**
     * Creates the Cursor object
     *
     * @param results list of results
     * @see SelectStatement#select(String,RepositoryView,Connection) select
     *
     */
    public Cursor(List results){
    	
		this.results = results;
		className = this.getClass().getName();
		logger = Logger.getLogger(className);
    }


    /**
     * Clear cursor
     *
     */
    public void close(){
        logger.log(Level.INFO,Messages.message("Cursor.close"));
		//results.clear();
		index = -1;
    }


    /**
     * Retrieves first object in Cursor.
     *
     * @return ObjectMapped at the index 0
     */
    public ObjectMapped first(){
        logger.log(Level.INFO,Messages.message("Cursor.first"));
		//Fixed bug: #692322 (Giovanni Martone)
		if(results != null){
  	    	fields = new ObjectMapped[1];
	    	fields[0] = (ObjectMapped)results.get(0);
	    	return fields[0];
		}
		else
    	    return null;
    }


    /**
     * Retrieves an object from an sql row.
     *
     * @return ObjectMapped at the given index
     */
    public ObjectMapped getObject(){
		logger.log(Level.INFO,Messages.format("Cursor.getObject",
				   new Integer(index)));
		return fields[index];
    }


    /**
     * Retrieves last object in Cursor
     *
     * @return ObjectMapped at the last index
     */
    public ObjectMapped last(){
        logger.log(Level.INFO,Messages.message("Cursor.last"));
		//Fixed bug: #692323 (Giovanni Martone)
		if(results != null){
	    	fields = new ObjectMapped[1];
	    	fields[0] = (ObjectMapped)results.get(results.size() - 1);
	    	return fields[0];
		}
		else
	    	return null;
    }


    /**
     * The index into the results list is incremented,
     * and true is returned if there is another result.
     *
     * @return true if there is another row.
     */
    public boolean next() {
		fields = new ObjectMapped[results.size()];
		boolean res = (results.size() > ++index);
		if (res) {
	    	fields[index] = (ObjectMapped)results.get(index);
		}
		return res;
    }


           
    /**
     *
     * Return size of collection of ObjectMapped
     *
     * @return int size
     *
     */
    public int size(){
        return results.size();	
    }
}

/*

   $Log: Cursor.java,v $
   Revision 1.15  2004/06/28 22:15:15  gmartone
   remove old implementation of cache for task 80429 (Enanchement DCS)

   Revision 1.14  2004/05/20 22:41:54  gmartone
   Changed for task 99073 (Coverage Javadocs)

   Revision 1.13  2004/05/18 18:16:43  gmartone
   setting value of className in costructor

   Revision 1.12  2004/04/29 22:43:23  gmartone

   Added method size


*/
