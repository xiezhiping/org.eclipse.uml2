/*
 * Copyright (c) 2004 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Common Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/cpl-v10.html
 *
 * Contributors:
 *   IBM - Initial API and implementation
 *
 * $Id: CacheAdapter.java,v 1.2 2004/04/10 04:09:50 khussey Exp $
 */
package org.eclipse.uml2.util;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.ecore.EObject;

/**
 *
 */
public class CacheAdapter extends AdapterImpl {

    public static final CacheAdapter INSTANCE = new CacheAdapter();

    private static final Map values = new HashMap();

    /* (non-Javadoc)
     * @see org.eclipse.emf.common.notify.Adapter#notifyChanged(org.eclipse.emf.common.notify.Notification)
     */
    public void notifyChanged(Notification msg) {
        super.notifyChanged(msg);

        clear();
    }

    public void clear() {
        values.clear();
    }

    public boolean containsKey(EObject eObject, Object key) {
        return values.containsKey(eObject) && ((Map) values.get(eObject)).containsKey(key);
    }

    public Object get(EObject eObject, Object key) {
        return values.containsKey(eObject) ? ((Map) values.get(eObject)).get(key) : null;
    }

    public Object put(EObject eObject, Object key, Object value) {

        if (!values.containsKey(eObject)) {
            values.put(eObject, new HashMap());
        }

        return ((Map) values.get(eObject)).put(key, value);
    }

}
