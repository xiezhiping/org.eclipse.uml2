/*
 * Copyright (c) 2004, 2015 IBM Corporation, Embarcadero Technologies, CEA, and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *   Kenn Hussey (Embarcadero Technologies) - 204200, 220065
 *   Kenn Hussey - 335125
 *   Christian W. Damus (CEA) - 389632, 332057
 *   Kenn Hussey (CEA) - 418466, 455572
 *
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

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
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

		private static final long serialVersionUID = 1L;

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

		@Override
		protected URI normalizeURI(URI uri, EObject objectContext) {
			return normalizeURI(uri, objectContext.eResource());
		}

		@Override
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
				List<EObject> proxies = proxyMap.get(uri);

				if (proxies == null) {
					proxyMap.put(uri,
						proxies = new BasicEList.FastCompare<EObject>());
				}

				proxies.add(proxy);
			}
		}

		protected Map<URI, List<EObject>> getProxyMap() {

			if (proxyMap == null) {
				Map<URI, List<EObject>> emptyMap = Collections.emptyMap();
				return Collections.unmodifiableMap(emptyMap);
			}

			return Collections.unmodifiableMap(proxyMap);
		}
	}

	private static final CacheAdapter INSTANCE = createCacheAdapter();

	protected static final ThreadLocal<CacheAdapter> THREAD_LOCAL = System
		.getProperty("org.eclipse.uml2.common.util.CacheAdapter.ThreadLocal") != null //$NON-NLS-1$
		? new ThreadLocal<CacheAdapter>() {

			@Override
			protected CacheAdapter initialValue() {
				return createCacheAdapter();
			}

		}
		: null;

	/**
	 * @since 1.7
	 */
	public static CacheAdapter getInstance() {
		return THREAD_LOCAL == null
			? INSTANCE
			: THREAD_LOCAL.get();
	}

	private static CacheAdapter createCacheAdapter() {
		CacheAdapter cacheAdapter = UML2Util
			.loadClassFromSystemProperty("org.eclipse.uml2.common.util.CacheAdapter.INSTANCE"); //$NON-NLS-1$

		if (cacheAdapter != null) {
			return cacheAdapter;
		}

		return new CacheAdapter();
	}

	private final Map<Resource, Map<EObject, Map<Object, Object>>> values = Collections
		.synchronizedMap(this
			.<Resource, Map<EObject, Map<Object, Object>>> createHashMap());

	protected boolean adapting = false;

	private URIConverter uriConverter = null;

	public static CacheAdapter getCacheAdapter(Notifier notifier) {
		List<Adapter> eAdapters = notifier.eAdapters();

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

		unloadedEObjects = Collections.synchronizedMap(this
			.<EObject, Resource> createHashMap());

		unloadedResources = new Set<Resource>() {

			Map<Resource, Object> map = new WeakHashMap<Resource, Object>();

			public boolean add(Resource o) {

				if (map.containsKey(o)) {
					return false;
				}

				map.put(o, null);
				return true;
			}

			public boolean addAll(Collection<? extends Resource> c) {
				boolean result = false;

				for (Resource resource : c) {

					if (add(resource)) {
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

			public boolean containsAll(Collection<?> c) {
				return map.keySet().containsAll(c);
			}

			public boolean isEmpty() {
				return map.keySet().isEmpty();
			}

			public Iterator<Resource> iterator() {
				return map.keySet().iterator();
			}

			public boolean remove(Object o) {
				return map.keySet().remove(o);
			}

			public boolean removeAll(Collection<?> c) {
				return map.keySet().removeAll(c);
			}

			public boolean retainAll(Collection<?> c) {
				return map.keySet().retainAll(c);
			}

			public int size() {
				return map.keySet().size();
			}

			public Object[] toArray() {
				return map.keySet().toArray();
			}

			public <T> T[] toArray(T[] a) {
				return map.keySet().toArray(a);
			}
		};
	}

	protected <K, V> Map<K, V> createHashMap() {
		return new HashMap<K, V>();
	}

	@Override
	protected ECrossReferenceAdapter.InverseCrossReferencer createInverseCrossReferencer() {
		return new InverseCrossReferencer();
	}

	protected boolean addAdapter(EList<Adapter> adapters) {
		int index = adapters.indexOf(this);

		switch (index) {
			case 0 :
				break;
			case -1 :
				adapters.add(0, this);
				return true;
			default :
				adapters.move(0, index);
				break;
		}

		return false;
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

	@Override
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

	@Override
	public Collection<EStructuralFeature.Setting> getNonNavigableInverseReferences(
			EObject eObject) {
		addAdapter(eObject);

		return super.getNonNavigableInverseReferences(eObject);
	}

	@Override
	public Collection<EStructuralFeature.Setting> getInverseReferences(
			EObject eObject) {
		addAdapter(eObject);

		return super.getInverseReferences(eObject);
	}

	public void handleCrossReference(EObject eObject) {
		synchronized (inverseCrossReferencer) {
			inverseCrossReferencer.add(eObject);
		}
	}

	@Override
	protected void handleCrossReference(EReference reference,
			Notification notification) {

		synchronized (inverseCrossReferencer) {
			super.handleCrossReference(reference, notification);
		}
	}

	@Override
	public void setTarget(Notifier target) {

		if (!adapting) {
			synchronized (inverseCrossReferencer) {
				super.setTarget(target);
			}
		}
	}

	@Override
	protected void unsetTarget(EObject target) {
		synchronized (inverseCrossReferencer) {
			super.unsetTarget(target);
		}

		// clear at resource scope iff not unloading
		if (uriConverter == null) {
			clear(target.eResource());
		}
	}

	@Override
	protected void unsetTarget(Resource target) {
		super.unsetTarget(target);

		clear(target);
	}

	@Override
	public void notifyChanged(Notification msg) {
		super.notifyChanged(msg);

		Object notifier = msg.getNotifier();

		if (notifier instanceof Resource) {

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
		} else if (notifier instanceof EObject) {
			// clear at resource scope iff not touch
			if (!msg.isTouch()) {
				clear(((EObject) notifier).eResource());
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
		Map<EObject, Map<Object, Object>> resourceMap = values.get(resource);

		if (resourceMap != null) {
			Map<Object, Object> eObjectMap = resourceMap.get(eObject);

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
		Map<EObject, Map<Object, Object>> resourceMap = values.get(resource);

		if (resourceMap != null) {
			Map<Object, Object> eObjectMap = resourceMap.get(eObject);

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

		Map<EObject, Map<Object, Object>> resourceMap = values.get(resource);

		if (resourceMap == null) {
			resourceMap = Collections.synchronizedMap(this
				.<EObject, Map<Object, Object>> createHashMap());

			values.put(resource, resourceMap);
		}

		Map<Object, Object> eObjectMap = resourceMap.get(eObject);

		if (eObjectMap == null) {
			eObjectMap = Collections.synchronizedMap(this
				.<Object, Object> createHashMap());

			resourceMap.put(eObject, eObjectMap);
		}

		return eObjectMap.put(key, value);
	}

	@Override
	protected boolean resolve() {
		return false;
	}

	@Override
	protected boolean isIncluded(EReference eReference) {
		return super.isIncluded(eReference) && eReference.isChangeable();
	}

	public Map<URI, List<EObject>> getProxyMap() {
		return ((InverseCrossReferencer) inverseCrossReferencer).getProxyMap();
	}

	@Override
	protected void resolveProxy(Resource resource, EObject eObject,
			EObject proxy, EStructuralFeature.Setting setting) {
		Resource eResource = setting.getEObject().eResource();

		if (eResource != null
			&& eResource.getResourceSet() == resource.getResourceSet()) {

			super.resolveProxy(resource, eObject, proxy, setting);
		}
	}

	@Override
	protected void selfAdapt(Notification notification) {
		Object notifier = notification.getNotifier();

		if (notifier instanceof Resource
			&& notification.getFeatureID(Resource.class) == Resource.RESOURCE__IS_LOADED) {

			if (notification.getNewBooleanValue()) {
				unloadedResources.remove(notifier);

				for (Notifier child : ((Resource) notifier).getContents()) {
					addAdapter(child);
				}
			} else {
				unloadedResources.add((Resource) notifier);

				synchronized (unloadedEObjects) {
					for (Iterator<Map.Entry<EObject, Resource>> i = unloadedEObjects
						.entrySet().iterator(); i.hasNext();) {

						Map.Entry<EObject, Resource> entry = i.next();

						if (entry.getValue() == notifier) {
							i.remove();
							EObject eObject = entry.getKey();

							synchronized (inverseCrossReferencer) {
								Collection<EStructuralFeature.Setting> settings = inverseCrossReferencer
									.get(eObject);

								if (settings != null) {

									for (EStructuralFeature.Setting setting : settings) {
										((InverseCrossReferencer) inverseCrossReferencer)
											.addProxy(eObject,
												setting.getEObject());
									}
								}
							}
						}
					}
				}
			}
		} else {
			super.selfAdapt(notification);
		}
	}

}