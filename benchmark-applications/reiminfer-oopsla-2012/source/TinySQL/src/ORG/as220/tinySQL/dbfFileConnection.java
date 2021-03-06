/*
 *
 * Connection class for the dbfFile/tinySQL
 * JDBC driver
 *
 * A lot of this code is based on or directly taken from
 * George Reese's (borg@imaginary.com) mSQL driver.
 *
 * So, it's probably safe to say:
 *
 * Portions of this code Copyright (c) 1996 George Reese
 *
 * The rest of it:
 *
 * Copyright 1996 John Wiley & Sons, Inc.
 * See the COPYING file for redistribution details.
 *
 * Copyright 1996, Brian C. Jepson
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


import java.sql.Array;
import java.sql.Blob;
import java.sql.CallableStatement;
import java.sql.Clob;
import java.sql.DatabaseMetaData;
import java.sql.Driver;
import java.sql.NClob;
import java.sql.PreparedStatement;
import java.sql.SQLClientInfoException;
import java.sql.SQLException;
import java.sql.SQLXML;
import java.sql.Savepoint;
import java.sql.Statement;
import java.sql.Struct;
import java.util.Map;
import java.util.Properties;
//import checkers.inference.ownership.quals.*;
import java.util.concurrent.Executor;

/**
dBase read/write access <br>
 @author Brian Jepson <bjepson@home.com>
 @author Marcel Ruff <ruff@swand.lake.de> Added write access to dBase and JDK 2 support
 */
public class dbfFileConnection extends tinySQLConnection
{

  private /*@OwnPar*/ dbfFileDatabaseMetaData myMetaData = null;

  /**
   *
   * Constructs a new JDBC Connection object.
   *
   * @exception SQLException in case of an error
   * @param user the user name - not currently used
   * @param u the url to the data source
   * @param d the Driver object
   *
   */
  public dbfFileConnection(String user, String u, Driver d, Properties p)
      throws SQLException
  {
    super(user, u, d, p);
  }

  /**
   *
   * Returns a new dbfFile object which is cast to a tinySQL
   * object.
   *
   */
  public tinySQL createDatabaseEngine()
  {
    // if there's a data directory, it will
    // be everything after the jdbc:dbfFile:
    //
    if (getUrl().length() > 13)
    {
      String dataDir = getUrl().substring(13);
      return (tinySQL) new dbfFile(dataDir, getProperties());
    }

    // if there was no data directory specified in the
    // url, then just use the default constructor
    //
    throw new IllegalArgumentException("You have to specifiy an data directory");
//     return (tinySQL) new dbfFile(encoding);

  }

  /**
   * This method retrieves DatabaseMetaData
   * @see java.sql.Connection#getMetData
   * @exception SQLException
   * @return a DatabaseMetaData object (conforming to JDK 2)
   *
   */
  public DatabaseMetaData getMetaData() throws SQLException
  {
    if (myMetaData == null)
      myMetaData = new dbfFileDatabaseMetaData(( /*@NoRep*/  tinySQLConnection)this);
    return (DatabaseMetaData) myMetaData;
  }

  /**
   * sets this connection readonly.
   *
   * @param b the new readOnly flag
   */
  public void setReadOnly(boolean b)
  {
    dbfFile dbf = (dbfFile) getTinySqlHandle();
    dbf.setReadOnly(b);
  }

  /**
   * Checks whether the database is readonly
   *
   * @return true if no write access is allowed, false otherwise
   */
  public boolean isReadOnly()
  {
    /*@OwnOwn*/ dbfFile dbf = (dbfFile) getTinySqlHandle();
    return dbf.isReadOnly();
  }

@Override
public Array createArrayOf(String typeName, Object[] elements)
		throws SQLException {
	// TODO Auto-generated method stub
	return null;
}

@Override
public Blob createBlob() throws SQLException {
	// TODO Auto-generated method stub
	return null;
}

@Override
public Clob createClob() throws SQLException {
	// TODO Auto-generated method stub
	return null;
}

@Override
public NClob createNClob() throws SQLException {
	// TODO Auto-generated method stub
	return null;
}

@Override
public SQLXML createSQLXML() throws SQLException {
	// TODO Auto-generated method stub
	return null;
}

@Override
public Statement createStatement(int resultSetType, int resultSetConcurrency,
		int resultSetHoldability) throws SQLException {
	// TODO Auto-generated method stub
	return null;
}

@Override
public Struct createStruct(String typeName, Object[] attributes)
		throws SQLException {
	// TODO Auto-generated method stub
	return null;
}

@Override
public Properties getClientInfo() throws SQLException {
	// TODO Auto-generated method stub
	return null;
}

@Override
public String getClientInfo(String name) throws SQLException {
	// TODO Auto-generated method stub
	return null;
}

@Override
public int getHoldability() throws SQLException {
	// TODO Auto-generated method stub
	return 0;
}

@Override
public boolean isValid(int timeout) throws SQLException {
	// TODO Auto-generated method stub
	return false;
}

@Override
public CallableStatement prepareCall(String sql, int resultSetType,
		int resultSetConcurrency, int resultSetHoldability) throws SQLException {
	// TODO Auto-generated method stub
	return null;
}

@Override
public PreparedStatement prepareStatement(String sql, int autoGeneratedKeys)
		throws SQLException {
	// TODO Auto-generated method stub
	return null;
}

@Override
public PreparedStatement prepareStatement(String sql, int[] columnIndexes)
		throws SQLException {
	// TODO Auto-generated method stub
	return null;
}

@Override
public PreparedStatement prepareStatement(String sql, String[] columnNames)
		throws SQLException {
	// TODO Auto-generated method stub
	return null;
}

@Override
public PreparedStatement prepareStatement(String sql, int resultSetType,
		int resultSetConcurrency, int resultSetHoldability) throws SQLException {
	// TODO Auto-generated method stub
	return null;
}

@Override
public void releaseSavepoint(Savepoint savepoint) throws SQLException {
	// TODO Auto-generated method stub
	
}

@Override
public void rollback(Savepoint savepoint) throws SQLException {
	// TODO Auto-generated method stub
	
}

@Override
public void setClientInfo(Properties properties) throws SQLClientInfoException {
	// TODO Auto-generated method stub
	
}

@Override
public void setClientInfo(String name, String value)
		throws SQLClientInfoException {
	// TODO Auto-generated method stub
	
}

@Override
public void setHoldability(int holdability) throws SQLException {
	// TODO Auto-generated method stub
	
}

@Override
public Savepoint setSavepoint() throws SQLException {
	// TODO Auto-generated method stub
	return null;
}

@Override
public Savepoint setSavepoint(String name) throws SQLException {
	// TODO Auto-generated method stub
	return null;
}


@Override
public boolean isWrapperFor(Class<?> iface) throws SQLException {
	// TODO Auto-generated method stub
	return false;
}

@Override
public <T> T unwrap(Class<T> iface) throws SQLException {
	// TODO Auto-generated method stub
	return null;
}

@Override
public void setSchema(String schema) throws SQLException {
	// TODO Auto-generated method stub
	
}

@Override
public String getSchema() throws SQLException {
	// TODO Auto-generated method stub
	return null;
}

@Override
public void abort(Executor executor) throws SQLException {
	// TODO Auto-generated method stub
	
}

@Override
public void setNetworkTimeout(Executor executor, int milliseconds) throws SQLException {
	// TODO Auto-generated method stub
	
}

@Override
public int getNetworkTimeout() throws SQLException {
	// TODO Auto-generated method stub
	return 0;
}

}
