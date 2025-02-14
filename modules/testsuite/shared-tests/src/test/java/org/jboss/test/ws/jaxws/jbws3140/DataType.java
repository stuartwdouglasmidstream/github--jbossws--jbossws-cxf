/*
 * JBoss, Home of Professional Open Source.
 * Copyright 2010, Red Hat Middleware LLC, and individual contributors
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
package org.jboss.test.ws.jaxws.jbws3140;

import java.awt.Image;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlMimeType;
import jakarta.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DataType", propOrder =
{"request", "doc"})
public class DataType
{

   @XmlElement(required = true)
   protected String request;

   @XmlElement(required = true)
   @XmlMimeType("image/jpeg")
   protected Image doc;

   /**
    * Gets the value of the request property.
    * 
    * @return
    *     possible object is
    *     {@link String }
    *     
    */
   public String getRequest()
   {
      return request;
   }

   /**
    * Sets the value of the request property.
    * 
    * @param value
    *     allowed object is
    *     {@link String }
    *     
    */
   public void setRequest(String value)
   {
      this.request = value;
   }

   /**
    * Gets the value of the doc property.
    * 
    * @return
    *     possible object is
    *     {@link Image }
    *     
    */
   public Image getDoc()
   {
      return doc;
   }

   /**
    * Sets the value of the doc property.
    * 
    * @param value
    *     allowed object is
    *     {@link Image }
    *     
    */
   public void setDoc(Image value)
   {
      this.doc = value;
   }

}
