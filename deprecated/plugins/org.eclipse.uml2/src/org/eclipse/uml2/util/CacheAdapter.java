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
 * $Id: CacheAdapter.java,v 1.4 2004/06/01 20:05:27 khussey Exp $
 */
package org.eclipse.uml2.util;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.Resource;

/**
 *  
 */
public class CacheAdapter
	extends AdapterImpl {

	public static final CacheAdapter INSTANCE = new CacheAdapter();

	private static final Map values = Collections
		.synchronizedMap(new HashMap());

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.emf.common.notify.Adapter#notifyChanged(org.eclipse.emf.common.notify.Notification)
	 */
	public void notifyChanged(Notification msg) {
		super.notifyChanged(msg);

		if (EcorePackage.eINSTANCE.getEModelElement_EAnnotations() == msg
			.getFeature()) {

			switch (msg.getEventType()) {
				case Notification.ADD :
					((EAnnotation) msg.getNewValue()).eAdapters().add(this);
					break;
				case Notification.ADD_MANY :
					for (Iterator newValues = ((List) msg.getNewValue())
						.iterator(); newValues.hasNext();) {

						((EAnnotation) newValues.next()).eAdapters().add(this);
					}
					break;
				case Notification.REMOVE :
					((EAnnotation) msg.getOldValue()).eAdapters().remove(this);
					break;
				case Notification.REMOVE_MANY :
					for (Iterator oldValues = ((List) msg.getOldValue())
						.iterator(); oldValues.hasNext();) {

						((EAnnotation) oldValues.next()).eAdapters().remove(
							this);
					}
					break;
			}
		}

		Object notifier = msg.getNotifier();

		if (EObject.class.isInstance(notifier)) {
			clear(((EObject) notifier).eResource());
		}

		clear();
	}

	public void clear() {
		clear(null);
	}

	public void clear(Resource resource) {
		values.remove(resource);
	}

	public boolean containsKey(EObject eObject, Object key) {
		return containsKey(null, eObject, key);
	}

	public boolean containsKey(Resource resource, EObject eObject, Object key) {
		Map resourceMap = (Map) values.get(resource);

		if (null != resourceMap) {
			Map eObjectMap = (Map) resourceMap.get(eObject);

			if (null != eObjectMap) {
				return eObjectMap.containsKey(key);
			}
		}

		return false;
	}

	public Object get(EObject eObject, Object key) {
		return get(null, eObject, key);
	}

	public Object get(Resource resource, EObject eObject, Object key) {
		Map resourceMap = (Map) values.get(resource);

		if (null != resourceMap) {
			Map eObjectMap = (Map) resourceMap.get(eObject);

			if (null != eObjectMap) {
				return eObjectMap.get(key);
			}
		}

		return null;
	}

	public Object put(EObject eObject, Object key, Object value) {
		return put(null, eObject, key, value);
	}

	public Object put(Resource resource, EObject eObject, Object key,
			Object value) {
		Map resourceMap = (Map) values.get(resource);

		if (null == resourceMap) {
			resourceMap = new HashMap();

			values.put(resource, resourceMap);
		}

		Map eObjectMap = (Map) resourceMap.get(eObject);

		if (null == eObjectMap) {
			eObjectMap = new HashMap();

			resourceMap.put(eObject, eObjectMap);
		}

		return eObjectMap.put(key, value);
	}

}