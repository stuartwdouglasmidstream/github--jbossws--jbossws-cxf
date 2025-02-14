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
package org.jboss.test.ws.jaxws.webfault;

import jakarta.xml.bind.annotation.XmlTransient;
import jakarta.xml.ws.WebFault;

/**
 * A custom exception
 *
 * @author alessio.soldano@jboss.com
 * @since 21-Feb-2008
 */
@WebFault(name = "myCustomFault", targetNamespace= "org.jboss.test.ws.jaxws.webfault.exceptions")
public class CustomException extends Exception
{
   private static final long serialVersionUID = 5054777794472486392L;
   private Integer number;
   @XmlTransient
   private String transientString;

   public CustomException()
   {
      super();
   }

   public CustomException(String message, Integer number)
   {
      super(message);
      this.number = number;
   }

   public CustomException(String message, Integer number, String transientString)
   {
      super(message);
      this.number = number;
      this.transientString = transientString;
   }

   public Integer getNumber()
   {
      return number;
   }

   public void setNumber(Integer number)
   {
      this.number = number;
   }

   @XmlTransient
   public String getTransientString()
   {
      return transientString;
   }

   public void setTransientString(String transientString)
   {
      this.transientString = transientString;
   }
}
