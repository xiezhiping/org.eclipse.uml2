/*
 * Copyright (c) 2004, 2005 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *
 * $Id: CacheAdapter.java,v 1.9 2005/05/18 16:38:32 khussey Exp $
 */
package org.eclipse.uml2.util;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.Resource;

/**
 * @deprecated Use org.eclipse.uml2.common.util.CacheAdapter instead.
 */
public class CacheAdapter
	extends AdapterImpl {

	public static final CacheAdapter INSTANCE = new CacheAdapter();

	private static final Map values = Collections
		.synchronizedMap(new HashMap());

	public boolean adapt(Notifier notifier) {

		if (null != notifier) {
			EList eAdapters = notifier.eAdapters();

			if (!eAdapters.contains(this)) {
				return eAdapters.add(this);
			}
		}

		return false;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.emf.common.notify.Adapter#notifyChanged(org.eclipse.emf.common.notify.Notification)
	 */
	public void notifyChanged(Notification msg) {
		super.notifyChanged(msg);

		Object notifier = msg.getNotifier();

		if (EObject.class.isInstance(notifier)) {
			Object feature = msg.getFeature();

			if (EcorePackage.eINSTANCE.getEModelElement_EAnnotations() == feature
				|| EcorePackage.eINSTANCE.getEAnnotation_Details() == feature) {

				switch (msg.getEventType()) {
					case Notification.ADD :
						adapt((Notifier) msg.getNewValue());
						break;
					case Notification.ADD_MANY :
						for (Iterator newValues = ((List) msg.getNewValue())
							.iterator(); newValues.hasNext();) {

							adapt((Notifier) newValues.next());
						}
						break;
					case Notification.SET :
						adapt((Notifier) msg.getNewValue());
						break;
				}
			}

			clear(((EObject) notifier).eResource());
		} else if (Resource.class.isInstance(notifier)) {

			if (Resource.RESOURCE__CONTENTS == msg.getFeatureID(Resource.class)) {
				clear();
			}
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.emf.common.notify.Adapter#setTarget(org.eclipse.emf.common.notify.Notifier)
	 */
	public void setTarget(Notifier newTarget) {
		// do nothing
	}

	public void clear() {
		values.clear();
	}

	public void clear(Resource resource) {
		values.remove(resource);

		if (null != resource) {
			values.remove(null);
		}
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

		if (null == key) {
			throw new IllegalArgumentException(String.valueOf(key));
		}

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