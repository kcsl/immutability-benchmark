/*
* 03/07/2002 - 22:56:11
*
* $RCSfile: ObjectMapped.java,v $ - JDBF Object Relational mapping system
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

  $Id: ObjectMapped.java,v 1.13 2004/05/20 22:36:01 gmartone Exp $

 */

package org.jdbf.engine.basic;

import java.lang.reflect.*;


import org.jdbf.engine.reflection.ReflectionManager;
import org.jdbf.engine.xml.Marshaller;
import org.jdbf.engine.xml.Unmarshaller;
import org.jdbf.engine.xml.MarshallException;
import org.jdbf.engine.xml.UnmarshallException;

/**
 * <code>ObjectMapped</code> is the superclass of Java objects that are mapped on 
 * the repository.
 *
 * @author Giovanni Martone<br> 
 * @version $Id: ObjectMapped.java,v 1.13 2004/05/20 22:36:01 gmartone Exp $ $Date: 2004/05/20 22:36:01 $<br>
 * last changed by $Author $
 *
 */
public class ObjectMapped{
	
    /** className */
    protected String className;

    /** name of repository */
    protected String repositoryViewName;

    /** object identifier */
    protected Object OID;
	
	
    public ObjectMapped(){
        className = getClass().getName();
    }


    /**
     * Create the object.
     *
     */
    public ObjectMapped(String repositoryName){
		className = getClass().getName();
		repositoryViewName = repositoryName;
    }
	
	
    /**
     * Return the className
     * @return the className 
     *
     */
	public String getClassName(){
		return className;
	}


	/**
	 * Return the object identifier
     *
     * @return Object
     *
     */
    public final Object getOID(){
        return OID;
    }


    /**
     * Return the name of repository view where it is mapped
     * @return the repositoryViewName
     *
     */
	public String getRepositoryViewName(){
        return repositoryViewName;
	}


    /**
     * Set the object id.
     *
     * @param oid object id	 
     *
     */
	public final void setOID(Object oid){
	    OID = oid;
    }

	 
   /**
    * Set the name of repository view where it is mapped
    *
    * @param repositoryName
    *
    */
    public void setRepositoryViewName(String repositoryName){
		repositoryViewName = repositoryName;
    }
	
			
    /**
     * Return the object as String
     *
     * @return String 
     *
     */
    public String toString(){
		StringBuffer buff = new StringBuffer();
		try{			
			buff.append("[").append(className).append(":")
			    .append("OID=").append(OID).append(" ");				
			Class c = Class.forName(className);
			Field[] fields = c.getDeclaredFields();
			for(int i = 0; i < fields.length; i++){				
				buff.append(fields[i].getName()).append("=")
	                .append(ReflectionManager.getValueByName((/*@checkers.inference.reim.quals.Mutable*/ ObjectMapped)this,
			    fields[i].getName())).append(" ");
			}
			buff.append("]");
			
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return buff.toString();		
    }
    
    
    /**
     * Return the XML representation of object as String
     *
     * @return the XML representation of object as String
     *
     */
    public String marshall() throws MarshallException{
      Marshaller marshaller = new Marshaller();
      return marshaller.getMarshallString(this);
    }
    
    
   /**
    * Return a ObjectMapped object from a String xml representation
    *
    * @param xml representation
    * @return a ObjectMapped object from a String xml representation
    *
    */
    
    public static ObjectMapped unmarshall(String xml)
      throws UnmarshallException{
      
      Unmarshaller unmarshaller = new Unmarshaller();
      return unmarshaller.getUnmarshallObject(xml);
    }
}

/*

$Log: ObjectMapped.java,v $
Revision 1.13  2004/05/20 22:36:01  gmartone
Changed for task 99073 (Coverage Javadocs)

Revision 1.12  2004/05/18 17:53:36  gmartone
adding property OID in toString() method

Revision 1.11  2004/01/25 11:32:54  gmartone
added throw of MarshallException in signature of marshall methods

Revision 1.5  2003/11/15 16:45:15  lechertl
task 88931, update to SAX 2 ready


*/
