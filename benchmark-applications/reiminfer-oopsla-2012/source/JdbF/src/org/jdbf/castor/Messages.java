/**
 * Redistribution and use of this software and associated documentation
 * ("Software"), with or without modification, are permitted provided
 * that the following conditions are met:
 *
 * 1. Redistributions of source code must retain copyright
 *    statements and notices.  Redistributions must also contain a
 *    copy of this document.
 *
 * 2. Redistributions in binary form must reproduce the
 *    above copyright notice, this list of conditions and the
 *    following disclaimer in the documentation and/or other
 *    materials provided with the distribution.
 *
 * 3. The name "Exolab" must not be used to endorse or promote
 *    products derived from this Software without prior written
 *    permission of Exoffice Technologies.  For written permission,
 *    please contact info@exolab.org.
 *
 * 4. Products derived from this Software may not be called "Exolab"
 *    nor may "Exolab" appear in their names without prior written
 *    permission of Exoffice Technologies. Exolab is a registered
 *    trademark of Exoffice Technologies.
 *
 * 5. Due credit should be given to the Exolab Project
 *    (http://www.exolab.org/).
 *
 * THIS SOFTWARE IS PROVIDED BY EXOFFICE TECHNOLOGIES AND CONTRIBUTORS
 * ``AS IS'' AND ANY EXPRESSED OR IMPLIED WARRANTIES, INCLUDING, BUT
 * NOT LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND
 * FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED.  IN NO EVENT SHALL
 * EXOFFICE TECHNOLOGIES OR ITS CONTRIBUTORS BE LIABLE FOR ANY DIRECT,
 * INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 * (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR
 * SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION)
 * HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT,
 * STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE)
 * ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED
 * OF THE POSSIBILITY OF SUCH DAMAGE.
 *
 * Copyright 1999 (C) Exoffice Technologies Inc. All Rights Reserved.
 *
 * $Id: Messages.java,v 1.9 2004/06/28 22:17:41 gmartone Exp $
 */


package org.jdbf.castor;


import java.text.*;
import java.util.*;


/**
 * I18N message formatting class. A static factory for obtaining
 * messages and formatting messages with arguments.
 * <p>
 * The resource file <tt>messages</tt> contains a list of all the messages 
 * in English. Additional resource files can be added for other languages and locales by placing them
 * in the same package with a language/locale prefix. See the I18N
 * documentation and use of resource bundles in the JDK docs.
 *
 * @author <a href="arkin@exoffice.com">Assaf Arkin</a>
 * @version $Revision: 1.9 $
 * last changed by $Author: gmartone $
 *  
 */

/*
 * Made some modifcations to Assaf Arkin's code to remove static for
 * resource name. 
 * George Stewart
 */
public class Messages{
    
    static {
		setLocale("messages");
	
    }

    /**
     * The name of the resource holding all the messages in the English
     * language. Resources for other languages and locales use the same
     * name with a language/locale prefix.
     */

    /**
     * The resource bundle holds all the messages.
     */
    private static ResourceBundle   _messages;
    
    
    /**
     * Once a format has been created once, it is cached here.
     */
    private static Hashtable        _formats;
    

    /**
     * Format the named message using a single argument and return the
     * full message text.
     *
     * @param message The message name
     * @param arg1 The first argument
     * @return The full message text
     */
    public static String format( String message, Object arg1 )
 	{
        return format( message, new Object[] { arg1 } );
    }

    
    /**
     * Format the named message using two argument and return the
     * full message text.
     *
     * @param message The message name
     * @param arg1 The first argument
     * @param arg2 The second argument
     * @return The full message text
     */
    public static String format( String message, Object arg1, Object arg2 )
    {
        return format( message, new Object[] { arg1, arg2 } );
    }

    
    /**
     * Format the named message using three argument and return the
     * full message text.
     *
     * @param message The message name
     * @param arg1 The first argument
     * @param arg2 The second argument
     * @param arg3 The third argument
     * @return The full message text
     */
    public static String format( String message, Object arg1, Object arg2, Object arg3 )
    {
        return format( message, new Object[] { arg1, arg2, arg3 } );
    }

    
    /**
     * Format the named message using any number of arguments and return the
     * full message text.
     *
     * @param message The message name
     * @param args Argument list
     * @return The full message text
     */
    public static String format( String message, Object[] args )
    {
        MessageFormat   mf;
        String          msg;
        
        try {
            mf = (MessageFormat) _formats.get( message );
            if ( mf == null ) {
                try {
                    msg = _messages.getString( message );
                } catch ( MissingResourceException except ) {
                    return message;
                }
                mf = new MessageFormat( msg );
                _formats.put( message, mf );
            }
            return mf.format( args );
        } catch ( Exception except ) {
            return "An internal error occured while processing message " + message;
        }
    }
    

    /**
     * Return the text of the named message without formatting.
     *
     * @param message The message name
     * @return The full message text
     */
    public static String message( String message )
    {
        try {
            return _messages.getString( message );
        } catch ( MissingResourceException except ) {
            return message;
        }
    }

    
    /**
     * Set the locale to use for loading messages. Calling this method
     * will reload all the messages based on the new locale name.
     *
     * @param resourceName 
     * @param locale
     * @return The full message text
     */
    public static void setLocale( String resourceName, Locale locale )
    {
        try {
            if ( locale == null )
                _messages = ResourceBundle.getBundle( resourceName ); 
            else
                _messages = ResourceBundle.getBundle( resourceName, locale ); 
        } catch ( Exception except ) {
	    _messages = new EmptyResourceBundle();
        }
        _formats = new Hashtable();
    }
    
    public static void setLocale( String resourceName )
    {
	setLocale(resourceName, Locale.getDefault());
    }
    

    static class EmptyResourceBundle
        extends ResourceBundle
        implements Enumeration
    {
        
        public Enumeration getKeys()
        {
            return this;
        }
        
        protected Object handleGetObject( String name )
        {
            return "[Missing message " + name + "]";
        }
        
        public boolean hasMoreElements()
        {
            return false;
        }
        
        public Object nextElement()
        {
            return null;
        }
        
    }
    
    
}
