/*
 * Copyright (c) 2003, 2004 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Common Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/cpl-v10.html
 *
 * Contributors:
 *   IBM - Initial API and implementation
 *
 * $Id: UML2Operations.java,v 1.11 2004/12/03 22:32:52 khussey Exp $
 */
package org.eclipse.uml2.internal.operation;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import java.util.Map;
import java.util.MissingResourceException;
import java.util.PropertyResourceBundle;
import java.util.ResourceBundle;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EModelElement;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.URIConverter;
import org.eclipse.emf.ecore.resource.impl.URIConverterImpl;
import org.eclipse.emf.ecore.util.EContentsEList;
import org.eclipse.emf.ecore.util.ECrossReferenceEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.uml2.Artifact;
import org.eclipse.uml2.DataType;
import org.eclipse.uml2.Element;
import org.eclipse.uml2.Interface;
import org.eclipse.uml2.NamedElement;
import org.eclipse.uml2.Signal;
import org.eclipse.uml2.StructuredClassifier;
import org.eclipse.uml2.Type;
import org.eclipse.uml2.util.UML2Switch;
import org.osgi.framework.Bundle;

/**
 * The base class for all UML2 operation utility classes.
 */
class UML2Operations {

	protected static class FilteredECrossReferenceEList
			extends ECrossReferenceEList {

		private final FilteredUsageCrossReferencer.Filter filter;

		protected static class FilteredFeatureIteratorImpl
				extends ECrossReferenceEList.FeatureIteratorImpl {

			private final FilteredUsageCrossReferencer.Filter filter;

			public FilteredFeatureIteratorImpl(EObject eObject,
					EStructuralFeature[] eStructuralFeatures,
					FilteredUsageCrossReferencer.Filter filter) {
				super(eObject, eStructuralFeatures);

				this.filter = filter;
			}

			protected boolean isIncluded(EStructuralFeature eStructuralFeature) {
				return super.isIncluded(eStructuralFeature)
					&& filter.accept(eStructuralFeature);
			}

			protected boolean isIncludedEntry(
					EStructuralFeature eStructuralFeature) {
				return super.isIncludedEntry(eStructuralFeature)
					&& filter.accept(eStructuralFeature);
			}
		}

		protected static class FilteredResolvingFeatureIteratorImpl
				extends FilteredFeatureIteratorImpl {

			public FilteredResolvingFeatureIteratorImpl(EObject eObject,
					EStructuralFeature[] eStructuralFeatures,
					FilteredUsageCrossReferencer.Filter filter) {
				super(eObject, eStructuralFeatures, filter);
			}

			protected boolean resolve() {
				return true;
			}
		}

		protected FilteredECrossReferenceEList(EObject eObject,
				FilteredUsageCrossReferencer.Filter filter) {
			super(eObject);

			this.filter = filter;
		}

		protected FilteredECrossReferenceEList(EObject eObject,
				EStructuralFeature[] eStructuralFeatures,
				FilteredUsageCrossReferencer.Filter filter) {
			super(eObject, eStructuralFeatures);

			this.filter = filter;
		}

		protected boolean isIncluded(EStructuralFeature eStructuralFeature) {
			return super.isIncluded(eStructuralFeature)
				&& filter.accept(eStructuralFeature);
		}

		protected ListIterator newListIterator() {
			return this.resolve()
				? new FilteredResolvingFeatureIteratorImpl(eObject,
					eStructuralFeatures, filter)
				: new FilteredFeatureIteratorImpl(eObject, eStructuralFeatures,
					filter);
		}

		public List basicList() {
			return new FilteredECrossReferenceEList(eObject,
				eStructuralFeatures, filter) {

				protected boolean resolve() {
					return false;
				}
			};
		}

		public Iterator basicIterator() {

			if (null == eStructuralFeatures) {
				return FilteredFeatureIteratorImpl.EMPTY_ITERATOR;
			}

			return new FilteredFeatureIteratorImpl(eObject,
				eStructuralFeatures, filter);
		}

		public ListIterator basicListIterator() {

			if (null == eStructuralFeatures) {
				return FeatureIteratorImpl.EMPTY_ITERATOR;
			}

			return new FilteredFeatureIteratorImpl(eObject,
				eStructuralFeatures, filter);
		}

		public ListIterator basicListIterator(int index) {

			if (null == eStructuralFeatures) {

				if (0 > index || 1 < index) {
					throw new IndexOutOfBoundsException("index = " + index //$NON-NLS-1$
						+ ", size = 0"); //$NON-NLS-1$
				}

				return FilteredFeatureIteratorImpl.EMPTY_ITERATOR;
			}

			ListIterator result = new FilteredFeatureIteratorImpl(eObject,
				eStructuralFeatures, filter);

			for (int i = 0; i < index; i++) {
				result.next();
			}

			return result;
		}

	}

	protected static class FilteredUsageCrossReferencer
			extends EcoreUtil.UsageCrossReferencer {

		protected static interface Filter {

			boolean accept(EStructuralFeature eStructuralFeature);

		}

		private final Filter filter;

		public static Collection find(EObject eObject, ResourceSet resourceSet,
				Filter filter) {
			return new FilteredUsageCrossReferencer(resourceSet, filter)
				.findUsage(eObject);
		}

		protected static Collection find(EObject eObject, Resource resource,
				Filter filter) {
			return new FilteredUsageCrossReferencer(resource, filter)
				.findUsage(eObject);
		}

		protected FilteredUsageCrossReferencer(ResourceSet resourceSet,
				Filter filter) {
			super(resourceSet);

			this.filter = filter;
		}

		protected FilteredUsageCrossReferencer(Resource resource, Filter filter) {
			super(resource);

			this.filter = filter;
		}

		protected void handleCrossReference(EObject eObject) {
			InternalEList filteredCrossReferences = new FilteredECrossReferenceEList(
				eObject, filter);

			EContentsEList.FeatureIterator crossReferences = (EContentsEList.FeatureIterator) (resolve()
				? filteredCrossReferences.iterator()
				: filteredCrossReferences.basicIterator());

			while (crossReferences.hasNext()) {
				EObject crossReferencedEObject = (EObject) crossReferences
					.next();
				EReference eReference = (EReference) crossReferences.feature();

				if (crossReference(eObject, eReference, crossReferencedEObject)) {
					getCollection(crossReferencedEObject).add(
						((InternalEObject) eObject).eSetting(eReference));
				}
			}
		}

	}

	/**
	 * The empty string.
	 */
	protected static final String EMPTY_STRING = ""; //$NON-NLS-1$

	/**
	 * The standard extension for properties files.
	 */
	protected static final String PROPERTIES_FILE_EXTENSION = "properties"; //$NON-NLS-1$

	/**
	 * The scheme for platform URIs.
	 */
	private static final String URI_SCHEME_PLATFORM = "platform"; //$NON-NLS-1$

	/**
	 * The first segment for platform plugin URIs.
	 */
	private static final String URI_SEGMENT_PLUGIN = "plugin"; //$NON-NLS-1$

	/**
	 * The default URI converter for resource bundle look-ups.
	 */
	private static final URIConverter DEFAULT_URI_CONVERTER = new URIConverterImpl();

	/**
	 * A cache of locales.
	 */
	private static final Map LOCALES = Collections
		.synchronizedMap(new HashMap());

	/**
	 * A cache of resource bundles.
	 */
	private static final Map RESOURCE_BUNDLES = Collections
		.synchronizedMap(new HashMap());

	protected static EAnnotation createEAnnotation(String source,
			EModelElement eModelElement) {

		if (Element.class.isInstance(eModelElement)) {
			return ((Element) eModelElement).createEAnnotation(source);
		} else {
			EAnnotation eAnnotation = EcoreFactory.eINSTANCE
				.createEAnnotation();

			eAnnotation.setSource(source);
			eAnnotation.setEModelElement(eModelElement);

			return eAnnotation;
		}
	}

	protected static EAnnotation getOrCreateEAnnotation(String source,
			EModelElement eModelElement) {
		EAnnotation eAnnotation = eModelElement.getEAnnotation(source);

		return null == eAnnotation
			? createEAnnotation(source, eModelElement)
			: eAnnotation;
	}

	protected static EAnnotation getEAnnotation(String source,
			EModelElement eModelElement) {

		if (null != eModelElement) {
			EAnnotation eAnnotation = eModelElement.getEAnnotation(source);

			if (null != eAnnotation) {
				return eAnnotation;
			}
		}

		return EcoreFactory.eINSTANCE.createEAnnotation();
	}

	protected static boolean safeEquals(Object thisObject, Object thatObject) {
		return null == thisObject
			? null == thatObject
			: thisObject.equals(thatObject);
	}

	protected static boolean isEmpty(String string) {
		return null == string || 0 == string.length();
	}

	protected static EList getOwnedAttributes(Type type) {

		if (null == type) {
			return null;
		}

		return (EList) new UML2Switch() {

			public Object caseArtifact(Artifact object) {
				return object.getOwnedAttributes();
			}

			public Object caseDataType(DataType object) {
				return object.getOwnedAttributes();
			}

			public Object caseInterface(Interface object) {
				return object.getOwnedAttributes();
			}

			public Object caseSignal(Signal object) {
				return object.getOwnedAttributes();
			}

			public Object caseStructuredClassifier(StructuredClassifier object) {
				return object.getOwnedAttributes();
			}
		}.doSwitch(type);
	}

	private static String getMessageSubstitution(Map context, Object object) {

		if (EObject.class.isInstance(object)) {
			EObject eObject = (EObject) object;

			if (NamedElement.class.isInstance(object)) {
				String qualifiedName = ((NamedElement) object)
					.getQualifiedName();

				if (!isEmpty(qualifiedName)) {
					return qualifiedName;
				}
			}

			if (null != context) {

				EValidator.SubstitutionLabelProvider substitutionLabelProvider = (EValidator.SubstitutionLabelProvider) context
					.get(EValidator.SubstitutionLabelProvider.class);

				if (null != substitutionLabelProvider) {
					return substitutionLabelProvider.getObjectLabel(eObject);
				}
			}

			Resource resource = eObject.eResource();

			if (null != resource) {
				return resource.getURI().lastSegment() + '#'
					+ resource.getURIFragment(eObject);
			}

			return EcoreUtil.getIdentification((EObject) object);
		} else {
			return String.valueOf(object);
		}
	}

	protected static Object[] getMessageSubstitutions(Map context,
			Object object0) {
		return new Object[]{getMessageSubstitution(context, object0)};
	}

	protected static Object[] getMessageSubstitutions(Map context,
			Object object0, Object object1) {
		return new Object[]{getMessageSubstitution(context, object0),
			getMessageSubstitution(context, object1)};
	}

	protected static Object[] getMessageSubstitutions(Map context,
			Object object0, Object object1, Object object2) {
		return new Object[]{getMessageSubstitution(context, object0),
			getMessageSubstitution(context, object1),
			getMessageSubstitution(context, object2)};
	}

	/**
	 * Appends a valid (Java) identifier based on the specified name to the
	 * specified buffer.
	 * 
	 * @param validIdentifier
	 *            The buffer to which to append the valid identifier.
	 * @param name
	 *            The name from which to obtain the valid identifier.
	 * 
	 * @return The buffer.
	 */
	protected static StringBuffer appendValidIdentifier(
			StringBuffer validIdentifier, String name) {

		if (!isEmpty(name)) {
			char char_0 = name.charAt(0);

			if (Character.isJavaIdentifierStart(char_0)) {
				validIdentifier.append(char_0);
			} else {
				validIdentifier.append('_');

				if (Character.isJavaIdentifierPart(char_0)) {
					validIdentifier.append(char_0);
				}
			}

			for (int i = 1; i < name.length(); ++i) {
				char char_i = name.charAt(i);

				if (Character.isJavaIdentifierPart(char_i)) {
					validIdentifier.append(char_i);
				}
			}
		}

		return validIdentifier;
	}

	/**
	 * Obtains a valid (Java) identifier based on the specified name.
	 * 
	 * @param name
	 *            The name from which to obtain a valid identifier.
	 * @return A valid (Java) identifier or the empty string.
	 */
	protected static String getValidIdentifier(String name) {
		return appendValidIdentifier(new StringBuffer(), name).toString();
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
				.appendFileExtension(PROPERTIES_FILE_EXTENSION));

			String country = locale.getCountry();

			if (country.length() > 0) {
				baseSegment += ('_' + country);
				resourceBundleURIs.add(0, baseURI.appendSegment(baseSegment)
					.appendFileExtension(PROPERTIES_FILE_EXTENSION));

				String variant = locale.getVariant();

				if (variant.length() > 0) {
					baseSegment += ('_' + variant);
					resourceBundleURIs.add(0, baseURI
						.appendSegment(baseSegment).appendFileExtension(
							PROPERTIES_FILE_EXTENSION));
				}
			}
		}

		return resourceBundleURIs;
	}

	/**
	 * Retrieves the candidate resource bundle URIs for the specified URI in the
	 * specified locale.
	 * 
	 * @param uri
	 *            The URI upon which to base the candidate resource bundle URIs.
	 * @param locale
	 *            The locale within which to base the candidate resource bundle
	 *            URIs.
	 * @return The candidate resource bundle URIs for the URI in the locale.
	 */
	protected static List getResourceBundleURIs(URI uri, Locale locale) {
		List resourceBundleURIs = new ArrayList();

		URI baseURI = uri.trimSegments(1);
		String baseSegment = uri.trimFileExtension().lastSegment();

		resourceBundleURIs.add(baseURI.appendSegment(baseSegment)
			.appendFileExtension(PROPERTIES_FILE_EXTENSION));

		Locale defaultLocale = Locale.getDefault();

		resourceBundleURIs.addAll(0, getResourceBundleURIs(baseURI,
			baseSegment, defaultLocale));

		if (!defaultLocale.equals(locale)) {
			resourceBundleURIs.addAll(0, getResourceBundleURIs(baseURI,
				baseSegment, defaultLocale));
		}

		return resourceBundleURIs;
	}

	/**
	 * Retrieves the (cached) resource bundle for the specified object in the
	 * specified locale.
	 * 
	 * @param eObject
	 *            The object for which to retrieve the resource bundle.
	 * @param locale
	 *            The locale in which to retrieve the resource bundle.
	 * @return The resource bundle for the object in the locale.
	 */
	protected static ResourceBundle getResourceBundle(EObject eObject,
			Locale locale) {

		eObject = EcoreUtil.getRootContainer(eObject);

		if (!RESOURCE_BUNDLES.containsKey(eObject)
			|| !locale.equals(LOCALES.get(eObject))) {

			ResourceBundle resourceBundle = null;
			Resource resource = eObject.eResource();

			if (null != resource) {
				ResourceSet resourceSet = resource.getResourceSet();
				URIConverter uriConverter = null == resourceSet
					? DEFAULT_URI_CONVERTER
					: resourceSet.getURIConverter();

				List resourceBundleURIs = getResourceBundleURIs(resource
					.getURI(), locale);

				if (null != EcorePlugin.getWorkspaceRoot()) {
					URI normalizedURI = uriConverter.normalize(resource
						.getURI());
					int segmentCount = normalizedURI.segmentCount();

					if (URI_SCHEME_PLATFORM.equals(normalizedURI.scheme())
						&& segmentCount > 2
						&& URI_SEGMENT_PLUGIN.equals(normalizedURI.segment(0))) {

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

				for (Iterator i = resourceBundleURIs.iterator(); i.hasNext();) {

					try {
						resourceBundle = new PropertyResourceBundle(
							uriConverter.createInputStream((URI) i.next()));
						locale = resourceBundle.getLocale();
						break;
					} catch (IOException ioe) {
						// ignore
					}
				}
			}

			LOCALES.put(eObject, locale);
			RESOURCE_BUNDLES.put(eObject, resourceBundle);
		}

		return (ResourceBundle) RESOURCE_BUNDLES.get(eObject);
	}

	/**
	 * Retrieves the (cached) resource bundle for the specified object in the
	 * default locale.
	 * 
	 * @param eObject
	 *            The object for which to retrieve the resource bundle.
	 * @return The resource bundle for the object in the default locale.
	 */
	protected static ResourceBundle getResourceBundle(EObject eObject) {
		return getResourceBundle(eObject, Locale.getDefault());
	}

	/**
	 * Retrieves a (localized) string for the specified object.
	 * 
	 * @param object
	 *            The object for which to retrieve a string.
	 * @param key
	 *            The key in the resource bundle.
	 * @param defaultString
	 *            The string to return if no string for the given key can be
	 *            found.
	 * @return The (localized) string.
	 */
	protected static String getString(EObject eObject, String key,
			String defaultString) {

		String string = defaultString;

		if (null != eObject) {

			try {
				ResourceBundle resourceBundle = getResourceBundle(eObject);

				if (null != resourceBundle) {
					string = resourceBundle.getString(key);
				}
			} catch (MissingResourceException mre) {
				// ignore
			}
		}

		return string;
	}

}