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
 * $Id: CacheAdapter.java,v 1.3 2004/05/12 22:21:59 khussey Exp $
 */
package org.eclipse.uml2.util;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EcorePackage;

/**
 *
 */
public class CacheAdapter
	extends AdapterImpl {

	public static final CacheAdapter INSTANCE = new CacheAdapter();

	private static final Map values = new HashMap();

	/* (non-Javadoc)
	 * @see org.eclipse.emf.common.notify.Adapter#notifyChanged(org.eclipse.emf.common.notify.Notification)
	 */
	public void notifyChanged(Notification msg) {
		super.notifyChanged(msg);

		if (EcorePackage.eINSTANCE.getEModelElement_EAnnotations() == msg
			.getFeature()) {

			switch (msg.getEventType()) {
				case Notification.ADD:
					((EAnnotation) msg.getNewValue()).eAdapters().add(this);
					break;
				case Notification.ADD_MANY:
					for (Iterator newValues = ((List) msg.getNewValue())
						.iterator(); newValues.hasNext();) {

						((EAnnotation) newValues.next()).eAdapters().add(this);
					}
					break;
				case Notification.REMOVE:
					((EAnnotation) msg.getOldValue()).eAdapters().remove(this);
					break;
				case Notification.REMOVE_MANY:
					for (Iterator oldValues = ((List) msg.getOldValue())
						.iterator(); oldValues.hasNext();) {

						((EAnnotation) oldValues.next()).eAdapters().remove(
							this);
					}
					break;
			}
		}

		clear();
	}

	public void clear() {
		values.clear();
	}

	public boolean containsKey(EObject eObject, Object key) {
		return values.containsKey(eObject)
			&& ((Map) values.get(eObject)).containsKey(key);
	}

	public Object get(EObject eObject, Object key) {
		return values.containsKey(eObject)
			? ((Map) values.get(eObject)).get(key) : null;
	}

	public Object put(EObject eObject, Object key, Object value) {

		if (!values.containsKey(eObject)) {
			values.put(eObject, new HashMap());
		}

		return ((Map) values.get(eObject)).put(key, value);
	}

}
