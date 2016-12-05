/**
 * dbfFileRow
 *
 * Copyright 2002, Brian C. Jepson
 *                 (bjepson@ids.net)
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.

 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.

 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307 USA
 */
package ORG.as220.tinySQL;

import ORG.as220.tinySQL.util.Log;

import java.util.Vector;
//import checkers.inference.ownership.quals.*;

/**
 * Represents a row read from a single dbase-table.
 * This row is an cache for the binary data from dbase.
 * The data-objects are only instantiated when get() is
 * called the first time. Every subsequent call to get
 * will return a cached value.
 */
public class dbfFileRow extends tsRawRow
{
  private byte[] data;

  /**
   * Creates a new dbfFileRow using the columns contained in
   * the vector <code>columns</code> and the specified converter
   * to convert the native data.
   */
  public dbfFileRow(Vector columns, tinySQLConverter conv)
  {
    super(columns, conv);
  }

  /**
   * Copyconstructor: create a new dbfFileRow using the same
   * definitions, but discard the cache and the data.
   */
  public dbfFileRow(dbfFileRow copy)
  {
    super(copy);
    clearCache();
  }

  /**
   * set the data for this row. The cache is now invalid an will be cleared.
   */
  public void setData(byte[] b)
  {
    if (b == null)
      throw new NullPointerException("Data is null");
    data = b;
    clearCache();
  }

  /**
   * returns the data for this row.
   */
  public byte[] getData()
  {
    return data;
  }

  /**
   * convert the object value into a native byte array using the given
   * converter and put the result on the current row.
   */
  protected void nativePut(tsColumn column, Object value)
  {
    try
    {
      byte[] b = (byte[]) value;

      // enforce the correct column length
      if (b == null)
      {
        b = new byte[column.getSize()];
      }
      if (data == null)
      {
        Log.warn("data is null, skipping update of this row.");
      }
      else
      {
        System.arraycopy(( /*@NoRep*/  Object)b, 0, ( /*@NoRep*/  Object)data, column.getBytePosition(), b.length);
      }

    }
    catch (Exception e)
    {
      Log.error("Error on conversion: ", e);
    }
  }

  /**
   * Retrieve a column's string value from the current row.
   *
   * @param column the column name
   * @see tinySQLTable#GetCol
   */
  protected Object nativeGet(tsColumn coldef) throws tinySQLException
  {
    int size = coldef.getSize();
    byte[] retval = new byte[size];

//    System.out.println ("BytePos: " + coldef.getBytePosition());
//    System.out.println ("Size   : " + size);
//    System.out.println ("Length : " + data.length );
//    System.out.println ("retval : " + retval.length);
    System.arraycopy(( /*@NoRep*/  Object)data, coldef.getBytePosition(), ( /*@NoRep*/  Object)retval, 0, size);
    return retval;
  }

}
