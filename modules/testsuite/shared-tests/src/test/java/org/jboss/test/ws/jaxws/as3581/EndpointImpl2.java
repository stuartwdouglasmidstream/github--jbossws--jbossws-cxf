/*
 * JBoss, Home of Professional Open Source.
 * Copyright 2012, Red Hat, Inc., and individual contributors
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

package org.jboss.test.ws.jaxws.as3581;

import jakarta.jws.WebService;

/**
 * @author <a href="mailto:ropalka@redhat.com">Richard Opalka</a>
 */
@WebService(
   endpointInterface = "org.jboss.test.ws.jaxws.as3581.EndpointIface2",
   targetNamespace = "org.jboss.test.ws.jaxws.as3581",
   serviceName = "SimpleService2"
)
public class EndpointImpl2
{

    public String getString()
    {
        for (int i = 0; i < 30; i++)
        {
           if (EndpointImpl.ex != null) throw EndpointImpl.ex;
           if (EndpointImpl.value != null) return EndpointImpl.value;
           try
           {
               Thread.sleep(1000);
           }
           catch (InterruptedException e)
           {
               throw new RuntimeException(e);
           }
        }
        throw new RuntimeException("Timeout: Cannot get injected value");
    }

}
