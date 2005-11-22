/*
 * Copyright (c) 2003, 2005 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *
 * $Id: UML2Operations.java,v 1.23 2005/11/22 22:04:53 khussey Exp $
 */
package org.eclipse.uml2.internal.operation;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.MissingResourceException;
import java.util.PropertyResourceBundle;
import java.util.ResourceBundle;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EModelElement;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.URIConverter;
import org.eclipse.emf.ecore.resource.impl.URIConverterImpl;
import org.eclipse.emf.ecore.util.ECrossReferenceAdapter;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.uml2.util.UML2Resource;
import org.eclipse.uml2.util.UML2Util;
import org.osgi.framework.Bundle;

class UML2Operations
		extends UML2Util {

	protected static class UML2CrossReferenceAdapter
			extends ECrossReferenceAdapter {

		protected void adapt(EObject eObject) {
			Resource resource = eObject.eResource();

			if (resource == null) {
				addAdapter(EcoreUtil.getRootContainer(eObject));
			} else {
				ResourceSet resourceSet = resource.getResourceSet();

				if (resourceSet == null) {
					addAdapter(resource);
				} else {
					addAdapter(resourceSet);
				}
			}
		}

		public Collection getNonNavigableInverseReferences(EObject eObject) {
			adapt(eObject);
			return super.getNonNavigableInverseReferences(eObject);
		}

		public Collection getInverseReferences(EObject eObject) {
			adapt(eObject);
			return super.getInverseReferences(eObject);
		}
	}

	private static final UML2CrossReferenceAdapter CROSS_REFERENCE_ADAPTER = new UML2CrossReferenceAdapter();

	/**
	 * The default URI converter for resource bundle look-ups.
	 */
	private static final URIConverter DEFAULT_URI_CONVERTER = new URIConverterImpl();

	/**
	 * A cache of resource bundles.
	 */
	private static final Map RESOURCE_BUNDLES = Collections
		.synchronizedMap(new HashMap());

	protected static EAnnotation safeGetEAnnotation(
			EModelElement eModelElement, String source) {

		EAnnotation eAnnotation = null == eModelElement
			? null
			: getEAnnotation(eModelElement, source, false);

		return null == eAnnotation
			? EcoreFactory.eINSTANCE.createEAnnotation()
			: eAnnotation;
	}

	/**
	 * Retrieves the candidate resource bundle URIs based on the specified base
	 * URI and base segment in the specified locale.
	 * 
	 * @param baseURI
	 *            The base URI (i.e. without the last segment) for the candidate
	 *            resource bundle URIs.
	 * @param baseSegment
	 *            The base segment (i.e. the last segment without the extension)
	 *            for the candidate resource bundle URIs.
	 * @param locale
	 *            The locale within which to base the candidate resource bundle
	 *            URIs.
	 * @return The candidate resource bundle URIs with the base URI and base
	 *         segment in the locale.
	 */
	private static List getResourceBundleURIs(URI baseURI, String baseSegment,
			Locale locale) {
		List resourceBundleURIs = new ArrayList();

		String language = locale.getLanguage();

		if (language.length() > 0) {
			baseSegment += ('_' + language);
			resourceBundleURIs.add(0, baseURI.appendSegment(baseSegment)
				.appendFileExtension(UML2Resource.PROPERTIES_FILE_EXTENSION));

			String country = locale.getCountry();

			if (country.length() > 0) {
				baseSegment += ('_' + country);
				resourceBundleURIs.add(0,
					baseURI.appendSegment(baseSegment).appendFileExtension(
						UML2Resource.PROPERTIES_FILE_EXTENSION));

				String variant = locale.getVariant();

				if (variant.length() > 0) {
					baseSegment += ('_' + variant);
					resourceBundleURIs.add(0, baseURI
						.appendSegment(baseSegment).appendFileExtension(
							UML2Resource.PROPERTIES_FILE_EXTENSION));
				}
			}
		}

		return resourceBundleURIs;
	}

	/**
	 * Retrieves the candidate resource bundle URIs for the specified URI in the
	 * specified locale (if specified).
	 * 
	 * @param uri
	 *            The URI upon which to base the candidate resource bundle URIs.
	 * @param locale
	 *            The locale within which to base the candidate resource bundle
	 *            URIs, or <code>null</code>.
	 * @return The candidate resource bundle URIs for the URI in the locale (if
	 *         specified).
	 */
	protected static List getResourceBundleURIs(URI uri, Locale locale) {
		List resourceBundleURIs = new ArrayList();

		URI baseURI = uri.trimSegments(1);
		String baseSegment = uri.trimFileExtension().lastSegment();

		resourceBundleURIs.add(baseURI.appendSegment(baseSegment)
			.appendFileExtension(UML2Resource.PROPERTIES_FILE_EXTENSION));

		if (null != locale) {
			Locale defaultLocale = Locale.getDefault();

			resourceBundleURIs.addAll(0, getResourceBundleURIs(baseURI,
				baseSegment, defaultLocale));

			if (!defaultLocale.equals(locale)) {
				resourceBundleURIs.addAll(0, getResourceBundleURIs(baseURI,
					baseSegment, locale));
			}
		}

		return resourceBundleURIs;
	}

	/**
	 * Retrieves the (cached) resource bundle for the specified object in the
	 * specified locale (if specified).
	 * 
	 * @param eObject
	 *            The object for which to retrieve the resource bundle.
	 * @param locale
	 *            The locale in which to retrieve the resource bundle, or
	 *            <code>null</code>.
	 * @return The resource bundle for the object in the locale (if specified).
	 */
	protected static ResourceBundle getResourceBundle(EObject eObject,
			Locale locale) {
		Resource resource = eObject.eResource();

		if (null != resource) {
			Map resourceBundles = (Map) RESOURCE_BUNDLES.get(resource);

			if (null == resourceBundles) {
				RESOURCE_BUNDLES.put(resource, resourceBundles = Collections
					.synchronizedMap(new HashMap()));
			}

			if (!resourceBundles.containsKey(locale)) {
				ResourceSet resourceSet = resource.getResourceSet();
				URIConverter uriConverter = null == resourceSet
					? DEFAULT_URI_CONVERTER
					: resourceSet.getURIConverter();

				URI uri = resource.getURI();
				List resourceBundleURIs = getResourceBundleURIs(uri, locale);

				if (EcorePlugin.IS_ECLIPSE_RUNNING) {
					URI normalizedURI = uriConverter.normalize(uri);
					int segmentCount = normalizedURI.segmentCount();

					if (UML2Resource.URI_SCHEME_PLATFORM.equals(normalizedURI
						.scheme())
						&& segmentCount > 2
						&& UML2Resource.URI_SEGMENT_PLUGIN.equals(normalizedURI
							.segment(0))) {

						Bundle bundle = Platform.getBundle(normalizedURI
							.segment(1));

						if (null != bundle) {
							Bundle[] fragments = Platform.getFragments(bundle);

							if (null != fragments) {
								String[] trailingSegments = (String[]) normalizedURI
									.segmentsList().subList(2, segmentCount)
									.toArray(new String[]{});

								for (int i = 0; i < fragments.length; i++) {
									resourceBundleURIs.addAll(0,
										getResourceBundleURIs(normalizedURI
											.trimSegments(segmentCount - 1)
											.appendSegment(
												fragments[i].getSymbolicName())
											.appendSegments(trailingSegments),
											locale));
								}
							}
						}
					}
				}

				ResourceBundle resourceBundle = null;

				for (Iterator i = resourceBundleURIs.iterator(); i.hasNext();) {

					try {
						InputStream inputStream = uriConverter
							.createInputStream((URI) i.next());
						try {
							resourceBundle = new PropertyResourceBundle(
								inputStream);
						} finally {
							inputStream.close();
						}
						break;
					} catch (IOException ioe) {
						// ignore
					}
				}

				resourceBundles.put(locale, resourceBundle);
			}

			return (ResourceBundle) resourceBundles.get(locale);
		}

		return null;
	}

	/**
	 * Retrieves the (cached) resource bundle for the specified object,
	 * localized in the default locale if indicated.
	 * 
	 * @param eObject
	 *            The object for which to retrieve the resource bundle.
	 * @param localize
	 *            Whether to retrieve the resource bundle based on (the default)
	 *            locale.
	 * @return The resource bundle for the object (in the default locale).
	 */
	protected static ResourceBundle getResourceBundle(EObject eObject,
			boolean localize) {
		return getResourceBundle(eObject, localize
			? Locale.getDefault()
			: null);
	}

	/**
	 * Retrieves a string for the specified object, localized if indicated.
	 * 
	 * @param object
	 *            The object for which to retrieve a (localized) string.
	 * @param key
	 *            The key in the resource bundle.
	 * @param defaultString
	 *            The string to return if no string for the given key can be
	 *            found.
	 * @param localize
	 *            Whether the string should be localized.
	 * @return The (localized) string.
	 */
	protected static String getString(EObject eObject, String key,
			String defaultString, boolean localize) {
		String string = defaultString;

		if (null != eObject) {

			try {
				ResourceBundle resourceBundle = getResourceBundle(eObject,
					localize);

				if (null != resourceBundle) {
					string = resourceBundle.getString(key);
				}
			} catch (MissingResourceException mre) {
				// ignore
			}
		}

		return string;
	}

	protected static Collection getInverseReferences(EObject eObject) {
		return CROSS_REFERENCE_ADAPTER.getInverseReferences(eObject);
	}

	protected static Collection getNonNavigableInverseReferences(EObject eObject) {
		return CROSS_REFERENCE_ADAPTER
			.getNonNavigableInverseReferences(eObject);
	}

}