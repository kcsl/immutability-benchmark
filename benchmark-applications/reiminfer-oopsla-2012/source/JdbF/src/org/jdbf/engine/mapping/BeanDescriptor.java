/*
 * 03/07/2002 - 22:56:11
 *
 * $RCSfile: BeanDescriptor.java,v $ - JdbF Object Relational mapping system
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
  * $Id: BeanDescriptor.java,v 1.10 2004/06/03 21:57:16 gmartone Exp $
  */
package org.jdbf.engine.mapping;

import java.util.ArrayList;

/**
 * <code>BeanDescriptor</code> represents the objects repositoryView 
 * that are specified in the repository.
 *
 * @see ItemDescriptor
 * @see ObjectDescriptor
 * 
 * @author Giovanni Martone
 * @version $Revision
 * last changed by $Author: gmartone $
 * 
 */
public class BeanDescriptor extends ObjectDescriptor{

	/** List of itemDescriptors */
	private ArrayList itemDescriptors;

	/** Name of database */
	private String databaseName;

	/** GeneratorMap object */
	private GeneratorMap generatorMap;
	
	/** PrimaryKeyMap object */
	private PrimaryKeyMap primaryKeyMap;


	/**
	 * Costructs the object
	 */
	public BeanDescriptor(){
	    super();
	    primaryKeyMap = new PrimaryKeyMap();
	    itemDescriptors = new ArrayList();
	    generatorMap = null;
	}


	/**
	 * Return name of database
	 * @return String
	 */
	 public String getDatabaseName(){
	     return databaseName;
	 }


	 /**
	  * Returns a generatorMap
	  * @return GeneratorMap
	  */
	 public GeneratorMap getGeneratorMap(){
		return generatorMap;
	 }


	 /**
	  * Returns a list of itemDescriptors
	  * @return ArrayList
	  */
	 public ArrayList getItemDescriptors(){
		return itemDescriptors;
	 }

	 /**
	  * Returns of itemDescriptors given the property name
	  *  
	  * @param name
	  * @return ItemDescriptor
	  * 
	  */
	 public ItemDescriptor getItemDescriptorFromName(String name){
	     ArrayList pks = (ArrayList)getPrimaryKeyMap().getPrimaryKey();
	     ArrayList itemDesc = getItemDescriptors();
	     ArrayList items = new ArrayList(pks);
	     items.addAll(itemDesc);
	     ItemDescriptor item = null;
	     for(int i = 0; i < items.size(); i++){
	         item = (ItemDescriptor)items.get(i);
		 	 if(name.equals(item.getPropertyName()))
		     	break;
	     }
	     return item;
	 }



	 /**
	  * Sets a database name
	  *
	  * @param databaseName name to set
	  */
	  public void setDatabaseName(String databaseName){
		  this.databaseName = databaseName;
	  }


	  /**
	   * Sets a GeneratorMap specified in generatorMap
	   * @param generatorMap
	   */
	  public void setGeneratorMap(GeneratorMap generatorMap){
	      this.generatorMap = generatorMap;
	  }


	  /**
	   * Sets a list of ItemDescriptor specified in itemDescriptors
	   * @param itemDescriptors
	   */
	  public void setItemDescriptors(ArrayList itemDescriptors){
	      this.itemDescriptors = itemDescriptors;
	  }
	  
	  
	  /**
	   * Return the primaryKey
	   * @return PrimaryKeyMap
	   */
	  public PrimaryKeyMap getPrimaryKeyMap() {
	  	  return primaryKeyMap;
	  }

	  /**
	   * Set a new rimaryKey
	   * @param map
	   */
	  public void setPrimaryKeyMap(PrimaryKeyMap map) {
	  	  primaryKeyMap = map;
	  }


	  /**
	   * Return the object as String
	   * @return String
	   */
	   public String toString(){
	       StringBuffer buff = new StringBuffer();
	       buff.append(classOwn).append("[").append("\n")
		   	   .append("className ").append(className).append("\n")
		       .append("databaseName ").append(databaseName).append("\n")
			   .append("primaryKey ").append(primaryKeyMap.getPrimaryKey()).append("\n")
		       .append("itemDescriptors ").append(itemDescriptors).append("\n")
		       .append("tableName ").append(tableName).append("\n")
		       .append("repositoryItemName ").append(repositoryViewName).append("\n")
		       .append("generatorMap ").append(generatorMap).append("\n")
	           .append("]").append("\n");
		   return buff.toString();
	   }
}
/*
 * 
 * $Log: BeanDescriptor.java,v $
 * Revision 1.10  2004/06/03 21:57:16  gmartone
 * changed for task 99533 (Composite Primary Key)
 *
 * Revision 1.9  2004/05/31 22:39:04  gmartone
 * changed for task 99533 (Composite Primary Key)
 *
 * Revision 1.8  2004/05/20 22:40:24  gmartone
 * Changed for task 99073 (Coverage Javadocs)
 *
 * 
 * 
 */
