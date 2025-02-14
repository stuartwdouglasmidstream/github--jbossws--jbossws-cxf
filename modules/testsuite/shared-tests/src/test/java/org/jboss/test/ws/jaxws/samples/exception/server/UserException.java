/*
 * JBoss, Home of Professional Open Source.
 * Copyright 2006, Red Hat Middleware LLC, and individual contributors
 * as indicated by the @author tags. See the copyright.txt file in the
 * distribution for a full listing of individual contributors.
 *
 * This is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation; either version 2.1 of
 * the License, or (at your option) any later version.
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this software; if not, write to the Free
 * Software Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA
 * 02110-1301 USA, or see the FSF site: http://www.fsf.org.
 */
package org.jboss.test.ws.jaxws.samples.exception.server;

import jakarta.xml.ws.WebFault;

/**
 * A mach application exception
 *
 * @author <a href="jason.greene@jboss.com">Jason T. Greene</a>
 */
@WebFault(faultBean="org.jboss.test.ws.jaxws.samples.exception.server.jaxws.UserExceptionBean")
public class UserException extends Exception
{

   private static final long serialVersionUID = -4005685987159367861L;
   private final int errorCode;
   private final String errorCategory;

   public UserException(String errorCategory, int errorCode, String message)
   {
      super(message);

      this.errorCategory = errorCategory;
      this.errorCode = errorCode;
   }

   public String getErrorCategory()
   {
      return errorCategory;
   }

   public int getErrorCode()
   {
      return errorCode;
   }
}
