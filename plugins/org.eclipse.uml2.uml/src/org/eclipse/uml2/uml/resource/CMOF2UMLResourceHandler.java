/*
 * Copyright (c) 2007, 2014 IBM Corporation, Embarcadero Technologies, CEA, and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Kenn Hussey (IBM Corporation, Embarcadero Technologies) - initial API and implementation
 *   Kenn Hussey (Embarcadero Technologies) - 213903
 *   Kenn Hussey (CEA) - 327039, 418466
 * 
 */
package org.eclipse.uml2.uml.resource;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.common.util.UniqueEList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.impl.BasicResourceHandler;
import org.eclipse.emf.ecore.xml.type.AnyType;
import org.eclipse.uml2.common.util.UML2Util;
import org.eclipse.uml2.uml.Association;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Enumeration;
import org.eclipse.uml2.uml.Profile;
import org.eclipse.uml2.uml.ProfileApplication;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.util.UMLSwitch;
import org.eclipse.uml2.uml.util.UMLUtil;

public class CMOF2UMLResourceHandler
		extends BasicResourceHandler {

	protected boolean resolveProxies = true;

	protected static final boolean DEBUG = false;

	protected final XMLResource.ResourceHandler delegate;

	public CMOF2UMLResourceHandler() {
		this(null);
	}

	public CMOF2UMLResourceHandler(XMLResource.ResourceHandler delegate) {
		super();
		
		this.delegate = delegate;
	}

	protected AnyType getExtension(XMLResource resource, EObject eObject) {
		return resource.getEObjectToExtensionMap().get(eObject);
	}

	protected AnyType putExtension(XMLResource resource, EObject eObject,
			AnyType extension) {
		return resource.getEObjectToExtensionMap().put(eObject, extension);
	}

	protected AnyType removeExtension(XMLResource resource, EObject eObject) {
		return resource.getEObjectToExtensionMap().remove(eObject);
	}

	protected Object getValue(FeatureMap featureMap, String name) {
		return getValue(featureMap, name, false);
	}

	protected Object getValue(FeatureMap featureMap, String name, boolean remove) {

		for (Iterator<FeatureMap.Entry> entries = featureMap.iterator(); entries
			.hasNext();) {

			FeatureMap.Entry entry = entries.next();

			if (name.equals(entry.getEStructuralFeature().getName())) {

				if (remove) {
					entries.remove();
				}

				return entry.getValue();
			}
		}

		return null;
	}

	protected EObject getEObject(AnyType extension, Resource resource,
			String name, boolean remove) {

		if (extension != null) {
			Object value = getValue(extension.getAnyAttribute(), name, remove);

			if (value == null) {
				value = getValue(extension.getMixed(), name, remove);

				if (value instanceof EObject) {
					EObject eObject = (EObject) value;

					if (eObject.eIsProxy() && resolveProxies) {
						eObject = EcoreUtil.resolve(eObject, resource);
					}

					return eObject;
				}
			} else if (value instanceof String && resource != null) {
				return resource.getEObject((String) value);
			}
		}

		return null;
	}

	protected Collection<Object> getValues(FeatureMap featureMap, String name) {
		return getValues(featureMap, name, false);
	}

	protected Collection<Object> getValues(FeatureMap featureMap, String name,
			boolean remove) {
		Collection<Object> values = new UniqueEList.FastCompare<Object>();

		for (Iterator<FeatureMap.Entry> entries = featureMap.iterator(); entries
			.hasNext();) {

			FeatureMap.Entry entry = entries.next();

			if (name.equals(entry.getEStructuralFeature().getName())) {

				if (remove) {
					entries.remove();
				}

				values.add(entry.getValue());
			}
		}

		return values;
	}

	protected Collection<EObject> getEObjects(AnyType extension,
			Resource resource, String name, boolean remove) {
		Collection<EObject> eObjects = new UniqueEList.FastCompare<EObject>();

		if (extension != null) {
			Collection<Object> values = getValues(extension.getAnyAttribute(),
				name, remove);

			if (values.isEmpty()) {
				values = getValues(extension.getMixed(), name, remove);

				for (Object value : values) {

					if (value instanceof EObject) {
						EObject eObject = (EObject) value;

						if (eObject.eIsProxy() && resolveProxies) {
							eObject = EcoreUtil.resolve(eObject, resource);
						}

						eObjects.add(eObject);
					}
				}
			} else if (resource != null) {

				for (Object value : values) {

					if (value instanceof String) {
						EObject eObject = resource.getEObject((String) value);

						if (eObject != null) {
							eObjects.add(eObject);
						}
					}
				}
			}
		}

		return eObjects;
	}

	protected Profile getEcoreProfile(EObject eObject) {
		Resource eResource = eObject.eResource();

		if (eResource != null) {
			ResourceSet resourceSet = eResource.getResourceSet();

			if (resourceSet != null) {
				return UML2Util.load(resourceSet, URI
					.createURI(UMLResource.ECORE_PROFILE_URI),
					UMLPackage.Literals.PROFILE);
			}
		}

		return null;
	}

	protected Stereotype getEcoreStereotype(EObject eObject, String name) {
		Profile ecoreProfile = getEcoreProfile(eObject);

		return ecoreProfile != null
			? ecoreProfile.getOwnedStereotype(name)
			: null;
	}

	public void preLoad(XMLResource resource, InputStream inputStream,
			Map<?, ?> options) {

		if (delegate != null) {
			delegate.preLoad(resource, inputStream, options);
		}
	}

	@Override
	public void postLoad(XMLResource resource, InputStream inputStream,
			Map<?, ?> options) {

		if (delegate != null) {
			delegate.postLoad(resource, inputStream, options);
		}

		EList<EObject> resourceContents = resource.getContents();

		List<AnyType> tagsToRemove = new ArrayList<AnyType>();

		final List<ProfileApplication> profileApplicationsToRemove = new ArrayList<ProfileApplication>();

		UMLSwitch<Object> umlSwitch = new UMLSwitch<Object>() {

			@Override
			public Object caseProfileApplication(
					ProfileApplication profileApplication) {
				Profile appliedProfile = profileApplication.getAppliedProfile();

				if (appliedProfile != null) {
					org.eclipse.uml2.uml.Package applyingPackage = profileApplication
						.getApplyingPackage();

					if (applyingPackage != null
						&& applyingPackage
							.getProfileApplication(appliedProfile) != profileApplication) {
						profileApplicationsToRemove.add(profileApplication);
					}
				}

				return super.caseProfileApplication(profileApplication);
			}

			@Override
			public Object defaultCase(EObject eObject) {
				Iterator<?> contents = resolveProxies
					? eObject.eContents().iterator()
					: ((InternalEList<?>) eObject.eContents()).basicIterator();

				if (contents != null) {

					while (contents.hasNext()) {
						doSwitch((EObject) contents.next());
					}
				}

				return eObject;
			}
		};

		for (int i = 0; i < resourceContents.size(); i++) {
			EObject content = resourceContents.get(i);

			if (content instanceof AnyType
				&& CMOF2UMLExtendedMetaData.TAG.equals(content.eClass()
					.getName())) {

				AnyType tag = (AnyType) content;
				Object name = getValue(tag.getAnyAttribute(),
					CMOF2UMLExtendedMetaData.CMOF_TAG_NAME);

				if (CMOF2UMLExtendedMetaData.EMOF_TAG__OPPOSITE_ROLE_NAME
					.equals(name)) {

					tagsToRemove.add(tag);
				} else if (CMOF2UMLExtendedMetaData.XMI_TAG__XMI_NAME
					.equals(name)) {

					EObject element = getEObject(tag, resource,
						CMOF2UMLExtendedMetaData.CMOF_TAG_ELEMENT, false);

					if (element instanceof org.eclipse.uml2.uml.Class
						|| element instanceof Association) {

						UMLUtil.setTaggedValue(
							(Element) element,
							getEcoreStereotype(element,
								UMLUtil.STEREOTYPE__E_CLASS),
							UMLUtil.TAG_DEFINITION__XML_NAME,
							getValue(tag.getAnyAttribute(),
								CMOF2UMLExtendedMetaData.CMOF_TAG_VALUE));

					} else if (element instanceof Property) {
						UMLUtil
							.setTaggedValue(
								(Element) element,
								getEcoreStereotype(
									element,
									UMLUtil.UML2EcoreConverter
										.isEDataType((Classifier) ((Property) element)
											.getType())
										? UMLUtil.STEREOTYPE__E_ATTRIBUTE
										: UMLUtil.STEREOTYPE__E_REFERENCE),
								UMLUtil.TAG_DEFINITION__XML_NAME,
								getValue(tag.getAnyAttribute(),
									CMOF2UMLExtendedMetaData.CMOF_TAG_VALUE));
					}

					tagsToRemove.add(tag);
				} else if (CMOF2UMLExtendedMetaData.XMI_TAG__ATTRIBUTE
					.equals(name)) {

					EObject element = getEObject(tag, resource,
						CMOF2UMLExtendedMetaData.CMOF_TAG_ELEMENT, false);

					Enumeration featureKindEnumeration = (Enumeration) getEcoreProfile(
						element)
						.getOwnedType(UMLUtil.ENUMERATION__FEATURE_KIND);

					if (featureKindEnumeration != null
						&& element instanceof Property
						&& Boolean.getBoolean(String.valueOf(getValue(
							tag.getAnyAttribute(),
							CMOF2UMLExtendedMetaData.CMOF_TAG_VALUE)))) {

						UMLUtil
							.setTaggedValue(
								(Element) element,
								getEcoreStereotype(element,
									UMLUtil.UML2EcoreConverter
										.isEDataType(((Property) element)
											.getNamespace())
										? UMLUtil.STEREOTYPE__E_ATTRIBUTE
										: UMLUtil.STEREOTYPE__E_REFERENCE),
								UMLUtil.TAG_DEFINITION__XML_FEATURE_KIND,
								featureKindEnumeration
									.getOwnedLiteral(UMLUtil.ENUMERATION_LITERAL__ATTRIBUTE));
					}

					tagsToRemove.add(tag);
				} else if (CMOF2UMLExtendedMetaData.XMI_TAG__ELEMENT
					.equals(name)) {

					EObject element = getEObject(tag, resource,
						CMOF2UMLExtendedMetaData.CMOF_TAG_ELEMENT, false);

					Enumeration featureKindEnumeration = (Enumeration) getEcoreProfile(
						element)
						.getOwnedType(UMLUtil.ENUMERATION__FEATURE_KIND);

					if (featureKindEnumeration != null
						&& element instanceof Property
						&& Boolean.getBoolean(String.valueOf(getValue(
							tag.getAnyAttribute(),
							CMOF2UMLExtendedMetaData.CMOF_TAG_VALUE)))) {

						UMLUtil
							.setTaggedValue(
								(Element) element,
								getEcoreStereotype(element,
									UMLUtil.UML2EcoreConverter
										.isEDataType(((Property) element)
											.getNamespace())
										? UMLUtil.STEREOTYPE__E_ATTRIBUTE
										: UMLUtil.STEREOTYPE__E_REFERENCE),
								UMLUtil.TAG_DEFINITION__XML_FEATURE_KIND,
								featureKindEnumeration
									.getOwnedLiteral(UMLUtil.ENUMERATION_LITERAL__ELEMENT));
					}

					tagsToRemove.add(tag);
				} else if (CMOF2UMLExtendedMetaData.XMI_TAG__SCHEMA_TYPE
					.equals(name)) {

					tagsToRemove.add(tag);
				} else if (CMOF2UMLExtendedMetaData.XMI_TAG__ID_PROPERTY
					.equals(name)) {

					EObject element = getEObject(tag, resource,
						CMOF2UMLExtendedMetaData.CMOF_TAG_ELEMENT, false);

					if (element instanceof Property
						&& Boolean.getBoolean(String.valueOf(getValue(
							tag.getAnyAttribute(),
							CMOF2UMLExtendedMetaData.CMOF_TAG_VALUE)))
						&& UMLUtil.UML2EcoreConverter
							.isEDataType(((Property) element).getNamespace())) {

						((Property) element).setIsID(true);
					}

					tagsToRemove.add(tag);
				} else if (CMOF2UMLExtendedMetaData.XMI_TAG__NS_URI
					.equals(name)) {

					EObject element = getEObject(tag, resource,
						CMOF2UMLExtendedMetaData.CMOF_TAG_ELEMENT, false);

					if (element instanceof org.eclipse.uml2.uml.Package) {
						org.eclipse.uml2.uml.Package package_ = (org.eclipse.uml2.uml.Package) element;
						String packageURI = package_.getURI();

						String nsURI = (String) getValue(tag.getAnyAttribute(),
							CMOF2UMLExtendedMetaData.CMOF_TAG_VALUE);

						if (packageURI == null) {
							package_.setURI(nsURI);
						} else if (!packageURI.equals(nsURI)) {
							UMLUtil.setTaggedValue(
								package_,
								getEcoreStereotype(package_,
									UMLUtil.STEREOTYPE__E_PACKAGE),
								UMLUtil.TAG_DEFINITION__NS_URI, nsURI);
						}
					}

					tagsToRemove.add(tag);
				} else if (CMOF2UMLExtendedMetaData.XMI_TAG__NS_PREFIX
					.equals(name)) {

					EObject element = getEObject(tag, resource,
						CMOF2UMLExtendedMetaData.CMOF_TAG_ELEMENT, false);

					if (element instanceof org.eclipse.uml2.uml.Package) {
						org.eclipse.uml2.uml.Package package_ = (org.eclipse.uml2.uml.Package) element;
						String packageName = package_.getName();

						String nsPrefix = (String) getValue(
							tag.getAnyAttribute(),
							CMOF2UMLExtendedMetaData.CMOF_TAG_VALUE);

						if (packageName == null) {
							package_.setName(nsPrefix);
						} else if (!packageName.equals(nsPrefix)) {
							UMLUtil.setTaggedValue(
								package_,
								getEcoreStereotype(package_,
									UMLUtil.STEREOTYPE__E_PACKAGE),
								UMLUtil.TAG_DEFINITION__NS_PREFIX, nsPrefix);
						}
					}

					tagsToRemove.add(tag);
				} else if (CMOF2UMLExtendedMetaData.XMI_TAG__CONTENT_TYPE
					.equals(name)) {

					EObject element = getEObject(tag, resource,
						CMOF2UMLExtendedMetaData.CMOF_TAG_ELEMENT, false);

					Enumeration contentKindEnumeration = (Enumeration) getEcoreProfile(
						element)
						.getOwnedType(UMLUtil.ENUMERATION__CONTENT_KIND);

					if (contentKindEnumeration != null
						&& element instanceof org.eclipse.uml2.uml.Class) {

						String contentType = (String) getValue(
							tag.getAnyAttribute(),
							CMOF2UMLExtendedMetaData.CMOF_TAG_VALUE);

						Object xmlContentKind = null;

						if ("any".equals(contentType)) { //$NON-NLS-1$
							xmlContentKind = contentKindEnumeration
								.getOwnedLiteral(UMLUtil.ENUMERATION_LITERAL__UNSPECIFIED);
						} else if ("complex".equals(contentType)) { //$NON-NLS-1$
							xmlContentKind = contentKindEnumeration
								.getOwnedLiteral(UMLUtil.ENUMERATION_LITERAL__ELEMENT_ONLY);
						} else if ("empty".equals(contentType)) { //$NON-NLS-1$
							xmlContentKind = contentKindEnumeration
								.getOwnedLiteral(UMLUtil.ENUMERATION_LITERAL__EMPTY);
						} else if ("mixed".equals(contentType)) { //$NON-NLS-1$
							xmlContentKind = contentKindEnumeration
								.getOwnedLiteral(UMLUtil.ENUMERATION_LITERAL__MIXED);
						} else if ("simple".equals(contentType)) { //$NON-NLS-1$
							xmlContentKind = contentKindEnumeration
								.getOwnedLiteral(UMLUtil.ENUMERATION_LITERAL__SIMPLE);
						}

						if (xmlContentKind != null) {
							UMLUtil.setTaggedValue(
								(Element) element,
								getEcoreStereotype(element,
									UMLUtil.STEREOTYPE__E_CLASS),
								UMLUtil.TAG_DEFINITION__XML_CONTENT_KIND,
								xmlContentKind);
						}
					}

					tagsToRemove.add(tag);
				}
			} else {
				umlSwitch.doSwitch(content);
			}
		}

		for (AnyType tag : tagsToRemove) {
			resourceContents.remove(tag);
		}

		for (ProfileApplication profileApplication : profileApplicationsToRemove) {
			profileApplication.getApplyingPackage().getProfileApplications()
				.remove(profileApplication);
		}
	}

	public void preSave(XMLResource resource, OutputStream outputStream,
			Map<?, ?> options) {
		
		if (delegate != null) {
			delegate.preSave(resource, outputStream, options);
		}
	}

	public void postSave(XMLResource resource, OutputStream outputStream,
			Map<?, ?> options) {
		
		if (delegate != null) {
			delegate.postSave(resource, outputStream, options);
		}
	}

}
