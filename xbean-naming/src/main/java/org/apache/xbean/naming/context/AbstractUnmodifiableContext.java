/**
 *
 * Copyright 2003-2004 The Apache Software Foundation
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

package org.apache.xbean.naming.context;

import javax.naming.Context;
import javax.naming.Name;
import javax.naming.NamingException;
import javax.naming.OperationNotSupportedException;

/**
 * @version $Rev: 355877 $ $Date: 2005-12-10 18:48:27 -0800 (Sat, 10 Dec 2005) $
 */
public abstract class AbstractUnmodifiableContext extends AbstractContext {
    protected AbstractUnmodifiableContext(String nameInNamespace) {
        super(nameInNamespace);
    }

    public final void bind(Name name, Object obj) throws NamingException {
        throw new OperationNotSupportedException("Context is read only");
    }

    public final void bind(String name, Object obj) throws NamingException {
        throw new OperationNotSupportedException("Context is read only");
    }

    public final void close() throws NamingException {
        throw new OperationNotSupportedException("Context is read only");
    }

    public final Context createSubcontext(Name name) throws NamingException {
        throw new OperationNotSupportedException("Context is read only");
    }

    public final Context createSubcontext(String name) throws NamingException {
        throw new OperationNotSupportedException("Context is read only");
    }

    public final void destroySubcontext(Name name) throws NamingException {
        throw new OperationNotSupportedException("Context is read only");
    }

    public final void destroySubcontext(String name) throws NamingException {
        throw new OperationNotSupportedException("Context is read only");
    }

    public final void rebind(Name name, Object obj) throws NamingException {
        throw new OperationNotSupportedException("Context is read only");
    }

    public final void rebind(String name, Object obj) throws NamingException {
        throw new OperationNotSupportedException("Context is read only");
    }

    public final void rename(Name oldName, Name newName) throws NamingException {
        throw new OperationNotSupportedException("Context is read only");
    }

    public final void rename(String oldName, String newName) throws NamingException {
        throw new OperationNotSupportedException("Context is read only");
    }

    public final void unbind(Name name) throws NamingException {
        throw new OperationNotSupportedException("Context is read only");
    }

    public final void unbind(String name) throws NamingException {
        throw new OperationNotSupportedException("Context is read only");
    }
}