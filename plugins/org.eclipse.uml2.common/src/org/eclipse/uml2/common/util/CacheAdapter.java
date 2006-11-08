/*
 * Copyright (c) 2004, 2006 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *
 * $Id: CacheAdapter.java,v 1.14 2006/11/08 20:25:42 khussey Exp $
 */
package org.eclipse.uml2.common.util;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.URIConverter;
import org.eclipse.emf.ecore.util.ECrossReferenceAdapter;
import org.eclipse.emf.ecore.util.EcoreUtil;

public class CacheAdapter
		extends ECrossReferenceAdapter {

	protected class InverseCrossReferencer
			extends ECrossReferenceAdapter.InverseCrossReferencer {

		private URI normalizeURI(URI uri, Resource resourceContext) {
			String fragment = uri.fragment();

			if (fragment != null) {
				int length = fragment.length();

				if (length > 0 && fragment.charAt(0) != '/'
					&& fragment.charAt(length - 1) == '?') {

					int index = fragment.lastIndexOf('?', length - 2);

					if (index > 0) {
						uri = uri.trimFragment().appendFragment(
							fragment.substring(0, index));
					}
				}
			}

			if (uriConverter != null) {
				return uriConverter.normalize(uri);
			} else if (resourceContext != null) {
				ResourceSet resourceSetContext = resourceContext
					.getResourceSet();

				if (resourceSetContext != null) {
					return resourceSetContext.getURIConverter().normalize(uri);
				}
			}

			return uri;
		}

		protected URI normalizeURI(URI uri, EObject objectContext) {
			return normalizeURI(uri, objectContext.eResource());
		}

		protected void addProxy(EObject proxy, EObject context) {

			if (proxy.eIsProxy()) {

				if (proxyMap == null) {
					proxyMap = createHashMap();
				}

				Resource resource = context.eResource();

				if (resource != null) {
					addAdapter(resource);
				}

				URI uri = normalizeURI(((InternalEObject) proxy).eProxyURI(),
					resource);
				List proxies = (List) proxyMap.get(uri);

				if (proxies == null) {
					proxyMap.put(uri, proxies = new BasicEList.FastCompare());
				}

				proxies.add(proxy);
			}
		}
	}

	public static final CacheAdapter INSTANCE = createCacheAdapter();

	private static CacheAdapter createCacheAdapter() {
		String property = System
			.getProperty("org.eclipse.uml2.common.util.CacheAdapter.INSTANCE"); //$NON-NLS-1$

		if (!UML2Util.isEmpty(property)) {

			try {
				return (CacheAdapter) Class.forName(property).newInstance();
			} catch (Exception e) {
				// ignore
			}
		}

		return new CacheAdapter();
	}

	private final Map values = Collections.synchronizedMap(createHashMap());

	protected boolean adapting = false;

	private URIConverter uriConverter = null;

	public static CacheAdapter getCacheAdapter(Notifier notifier) {
		List eAdapters = notifier.eAdapters();

		for (int i = 0, size = eAdapters.size(); i < size; i++) {
			Object adapter = eAdapters.get(i);

			if (adapter instanceof CacheAdapter) {
				return (CacheAdapter) adapter;
			}
		}

		return null;
	}

	public CacheAdapter() {
		super();

		unloadedResources = new Set() {

			Map map = new WeakHashMap();

			public boolean add(Object o) {

				if (map.containsKey(o)) {
					return false;
				}

				map.put(o, null);
				return true;
			}

			public boolean addAll(Collection c) {
				boolean result = false;

				for (Iterator i = c.iterator(); i.hasNext();) {

					if (add(i.next())) {
						result = true;
					}
				}

				return result;
			}

			public void clear() {
				map.keySet().clear();
			}

			public boolean contains(Object o) {
				return map.keySet().contains(o);
			}

			public boolean containsAll(Collection c) {
				return map.keySet().containsAll(c);
			}

			public boolean isEmpty() {
				return map.keySet().isEmpty();
			}

			public Iterator iterator() {
				return map.keySet().iterator();
			}

			public boolean remove(Object o) {
				return map.keySet().remove(o);
			}

			public boolean removeAll(Collection c) {
				return map.keySet().removeAll(c);
			}

			public boolean retainAll(Collection c) {
				return map.keySet().retainAll(c);
			}

			public int size() {
				return map.keySet().size();
			}

			public Object[] toArray() {
				return map.keySet().toArray();
			}

			public Object[] toArray(Object[] a) {
				return map.keySet().toArray(a);
			}
		};
	}

	protected Map createHashMap() {
		return new HashMap();
	}

	protected ECrossReferenceAdapter.InverseCrossReferencer createInverseCrossReferencer() {
		return new InverseCrossReferencer();
	}

	protected boolean addAdapter(EList adapters) {
		return adapters.contains(this)
			? false
			: adapters.add(this);
	}

	public boolean adapt(Notifier notifier) {
		boolean result = false;

		if (notifier != null) {
			adapting = true;
			result = addAdapter(notifier.eAdapters());
			adapting = false;
		}

		return result;
	}

	protected void addAdapter(Notifier notifier) {
		addAdapter(notifier.eAdapters());
	}

	protected void addAdapter(EObject eObject) {

		if (eObject != null && !eObject.eIsProxy()) {
			Resource eResource = eObject.eResource();

			if (eResource == null) {
				addAdapter(EcoreUtil.getRootContainer(eObject).eAdapters());
			} else {
				ResourceSet resourceSet = eResource.getResourceSet();

				if (resourceSet == null) {
					addAdapter(eResource.eAdapters());
				} else {
					addAdapter(resourceSet.eAdapters());
				}
			}
		}
	}

	public Collection getNonNavigableInverseReferences(EObject eObject) {
		addAdapter(eObject);

		return super.getNonNavigableInverseReferences(eObject);
	}

	public Collection getInverseReferences(EObject eObject) {
		addAdapter(eObject);

		return super.getInverseReferences(eObject);
	}

	public void handleCrossReference(EObject eObject) {
		inverseCrossReferencer.add(eObject);
	}

	public void setTarget(Notifier target) {

		if (!adapting) {
			super.setTarget(target);
		}
	}

	protected void unsetTarget(EObject target) {
		super.unsetTarget(target);

		// clear at resource scope iff not unloading
		if (uriConverter == null) {
			clear(target.eResource());
		}
	}

	protected void unsetTarget(Resource target) {
		super.unsetTarget(target);

		clear(target);
	}

	public void notifyChanged(Notification msg) {
		super.notifyChanged(msg);

		Object notifier = msg.getNotifier();

		if (notifier instanceof EObject) {
			// clear at resource scope iff not touch
			if (!msg.isTouch()) {
				clear(((EObject) notifier).eResource());
			}
		} else if (notifier instanceof Resource) {

			switch (msg.getFeatureID(Resource.class)) {
				case Resource.RESOURCE__CONTENTS : {
					clear();

					if (uriConverter == null) {
						Resource resource = (Resource) notifier;

						if (!resource.isLoaded()) {
							ResourceSet resourceSet = resource.getResourceSet();

							if (resourceSet != null) {
								// cache URI converter during unload
								uriConverter = resourceSet.getURIConverter();
							}
						}
					}

					break;
				}
				case Resource.RESOURCE__IS_LOADED : {

					if (!msg.getNewBooleanValue()) {
						uriConverter = null;
					}

					break;
				}
			}
		}
	}

	public void clear() {
		values.clear();
	}

	public void clear(Resource resource) {
		values.remove(resource);

		if (resource != null) {
			values.remove(null);
		}
	}

	public boolean containsKey(EObject eObject, Object key) {
		return containsKey(null, eObject, key);
	}

	public boolean containsKey(Resource resource, EObject eObject, Object key) {
		Map resourceMap = (Map) values.get(resource);

		if (resourceMap != null) {
			Map eObjectMap = (Map) resourceMap.get(eObject);

			if (eObjectMap != null) {
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

		if (resourceMap != null) {
			Map eObjectMap = (Map) resourceMap.get(eObject);

			if (eObjectMap != null) {
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

		if (key == null) {
			throw new IllegalArgumentException(String.valueOf(key));
		}

		if (resource != null) {
			addAdapter(resource);
		}

		Map resourceMap = (Map) values.get(resource);

		if (resourceMap == null) {
			resourceMap = createHashMap();

			values.put(resource, resourceMap);
		}

		Map eObjectMap = (Map) resourceMap.get(eObject);

		if (eObjectMap == null) {
			eObjectMap = createHashMap();

			resourceMap.put(eObject, eObjectMap);
		}

		return eObjectMap.put(key, value);
	}

	protected boolean resolve() {
		return false;
	}

	protected boolean isIncluded(EReference eReference) {
		return super.isIncluded(eReference) && eReference.isChangeable();
	}

}