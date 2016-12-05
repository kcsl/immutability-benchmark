// jTDS JDBC Driver for Microsoft SQL Server and Sybase
// Copyright (C) 2004 The jTDS Project
//
// This library is free software; you can redistribute it and/or
// modify it under the terms of the GNU Lesser General Public
// License as published by the Free Software Foundation; either
// version 2.1 of the License, or (at your option) any later version.
//
// This library is distributed in the hope that it will be useful,
// but WITHOUT ANY WARRANTY; without even the implied warranty of
// MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
// Lesser General Public License for more details.
//
// You should have received a copy of the GNU Lesser General Public
// License along with this library; if not, write to the Free Software
// Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA
//
package net.sourceforge.jtds.jdbcx;

import java.sql.*;
import java.util.*;

import javax.sql.*;

import net.sourceforge.jtds.jdbc.*;
import net.sourceforge.jtds.jdbcx.proxy.*;

/**
 * jTDS implementation of the <code>PooledConnection</code> interface.
 *
 * @version $Id: PooledConnection.java,v 1.10 2004/12/19 09:40:23 alin_sinpalean Exp $
 */
public class PooledConnection implements javax.sql.PooledConnection {
    private final ArrayList listeners = new ArrayList();

    protected Connection connection;

    public PooledConnection(Connection connection) {
        this.connection = connection;
    }

    /**
     * Adds the specified listener to the list.
     *
     * @see #fireConnectionEvent
     * @see #removeConnectionEventListener
     */
    public synchronized void addConnectionEventListener(ConnectionEventListener listener) {
        listeners.add(listener);
    }

    /**
     * Closes the database connection.
     *
     * @throws SQLException if an error occurs
     */
    public synchronized void close() throws SQLException {
        connection.close();
        connection = null; // Garbage collect the connection
    }

    /**
     * Fires a new connection event on all listeners.
     *
     * @param closed <code>true</code> if <code>close</code> has been called on the
     *        connection; <code>false</code> if the <code>sqlException</code> represents
     *        an error where the connection may not longer be used.
     * @param sqlException the SQLException to pass to the listeners
     */
    public synchronized void fireConnectionEvent(boolean closed, SQLException sqlException) {
        if (listeners.size() > 0) {
            ConnectionEvent connectionEvent = new ConnectionEvent(this, sqlException);
            Iterator iterator = listeners.iterator();

            while (iterator.hasNext()) {
                ConnectionEventListener listener = (ConnectionEventListener) iterator.next();

                if (closed) {
                    listener.connectionClosed(connectionEvent);
                } else {
                    try {
                        if (connection == null || connection.isClosed()) {
                            listener.connectionErrorOccurred(connectionEvent);
                        }
                    } catch (SQLException ex) {
                        // Will never occur
                    }
                }
            }
        }
    }

    /**
     * Returns a ConnectionProxy.
     *
     * @throws SQLException if an error occurs
     */
    public synchronized Connection getConnection() throws SQLException {
        if (connection == null) {
            fireConnectionEvent(false,
                new SQLException(Messages.get("error.jdbcx.conclosed"),
                                 "08003"));

            return null;
        }

        // Should the SQLException be captured here for safety in the future even though
        // no SQLException is being thrown by the ConnectionProxy at the moment???
        return new ConnectionProxy(this, connection);
    }

    /**
     * Removes the specified listener from the list.
     *
     * @see #addConnectionEventListener
     * @see #fireConnectionEvent
     */
    public synchronized void removeConnectionEventListener(ConnectionEventListener listener) {
        listeners.remove(listener);
    }

	@Override
	public void addStatementEventListener(StatementEventListener arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeStatementEventListener(StatementEventListener arg0) {
		// TODO Auto-generated method stub
		
	}
}
