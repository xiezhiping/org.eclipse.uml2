/*
 * Copyright (c) 2008, 2009 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *
 * $Id: UML2122UMLResourceHandler.java,v 1.3 2009/02/24 23:19:53 jbruck Exp $
 */
package org.eclipse.uml2.uml.resource;

import java.io.InputStream;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.common.util.UniqueEList;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.ExtendedMetaData;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.impl.BasicResourceHandler;
import org.eclipse.emf.ecore.xml.type.AnyType;
import org.eclipse.uml2.common.util.UML2Util;
import org.eclipse.uml2.uml.ClassifierTemplateParameter;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.ParameterableElement;
import org.eclipse.uml2.uml.Profile;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.TimeEvent;
import org.eclipse.uml2.uml.TimeExpression;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.util.UMLSwitch;
import org.eclipse.uml2.uml.util.UMLUtil;

/**
 * Resource handler that converts .uml models.
 * OMG:  UML 2.1.x and UML 2.2 
 * API:  UML2 2.2.x and UML2 3.0.x 
 * 
 * @since 3.0
 */
public class UML2122UMLResourceHandler
		extends BasicResourceHandler {

	protected static final boolean DEBUG = false;
	
	protected boolean resolveProxies = true;

	protected static final String STEREOTYPE__TIME_EVENT = "TimeEvent"; //$NON-NLS-1$

	protected static final String STEREOTYPE__TEMPLATEABLE_ELEMENT = "TemplateableElement"; //$NON-NLS-1$

	protected static final String STEREOTYPE__CLASSIFIER_TEMPLATE_PARAMETER = "ClassifierTemplateParameter"; //$NON-NLS-1$

	protected static final String TAG_DEFINITION__WHEN = "when"; //$NON-NLS-1$

	protected static final String TAG_DEFINITION__DEFAULT_CLASSIFER = "defaultClassifier"; //$NON-NLS-1$

	protected static final String TAG_DEFINITION__TEMPLATE_BINDING = "templateBinding"; //$NON-NLS-1$

	protected static final String TAG_DEFINITION__OWNED_TEMPLATE_SIGNATURE = "ownedTemplateSignature"; //$NON-NLS-1$

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

	private EObject getEObject(AnyType extension, Resource resource,
			String name, boolean remove) {

		if (extension != null) {
			Object value = getValue(extension.getAnyAttribute(), name, remove);

			if (value == null) {
				value = getValue(extension.getMixed(), name, remove);

				if (value instanceof EObject) {
					return (EObject) value;
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

	private Collection<EObject> getEObjects(AnyType extension,
			Resource resource, String name, boolean remove) {
		Collection<EObject> eObjects = new UniqueEList.FastCompare<EObject>();

		if (extension != null) {
			Collection<Object> values = getValues(extension.getAnyAttribute(),
				name, remove);

			if (values.isEmpty()) {
				values = getValues(extension.getMixed(), name, remove);

				for (Object value : values) {

					if (value instanceof EObject) {
						eObjects.add((EObject) value);
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

	protected Profile getUML2Profile(Element element) {
		Resource eResource = element.eResource();

		if (eResource != null) {
			ResourceSet resourceSet = eResource.getResourceSet();

			if (resourceSet != null) {
				return UML2Util.load(resourceSet, URI
					.createURI(UML22UMLResource.UML2_PROFILE_URI),
					UMLPackage.Literals.PROFILE);
			}
		}

		return null;
	}

	protected Stereotype getUML2Stereotype(Element element, String name) {
		Profile uml2Profile = getUML2Profile(element);

		return uml2Profile != null
			? uml2Profile.getOwnedStereotype(name)
			: null;
	}

	@Override
	public void postLoad(final XMLResource resource, InputStream inputStream,
			Map<?, ?> options) {

		final EList<EObject> resourceContents = resource.getContents();

		UMLSwitch<Object> umlSwitch = new UMLSwitch<Object>() {

			@Override
			public Object caseTimeEvent(TimeEvent timeEvent) {

				AnyType extension = getExtension(resource, timeEvent);
				if (extension != null) {
					EObject value = getEObject(extension, resource,
						"when", true); //$NON-NLS-1$

					if (value instanceof TimeExpression) {
						timeEvent.setWhen((TimeExpression) value);

					} else {
						UMLUtil.setTaggedValue(timeEvent, getUML2Stereotype(
							timeEvent, STEREOTYPE__TIME_EVENT),
							TAG_DEFINITION__WHEN, value);
					}
				}

				return super.caseTimeEvent(timeEvent);
			}

			@Override
			public Object caseProperty(Property property) {
				AnyType extension = getExtension(resource, property);
				if (extension != null) {

					EObject ownedTemplateSignature = getEObject(extension,
						resource, "ownedTemplateSignature", true); //$NON-NLS-1$

					UMLUtil.setTaggedValue(property, getUML2Stereotype(
						property, STEREOTYPE__TEMPLATEABLE_ELEMENT),
						TAG_DEFINITION__OWNED_TEMPLATE_SIGNATURE,
						ownedTemplateSignature);

					Collection<EObject> templateBindings = getEObjects(
						extension, resource, "templateBinding", true); //$NON-NLS-1$

					if (!templateBindings.isEmpty()) {
						UMLUtil.setTaggedValue(property, getUML2Stereotype(
							property, STEREOTYPE__TEMPLATEABLE_ELEMENT),
							TAG_DEFINITION__TEMPLATE_BINDING, templateBindings);
					}
				}

				return super.caseProperty(property);
			}

			@Override
			public Object caseClassifierTemplateParameter(
					ClassifierTemplateParameter classifierTemplateParameter) {

				AnyType extension = getExtension(resource,
					classifierTemplateParameter);

				if (extension != null) {
					EObject value = getEObject(extension, resource,
						"defaultClassifier", true); //$NON-NLS-1$

					if (classifierTemplateParameter.getDefault() == null) {

						classifierTemplateParameter
							.setDefault((ParameterableElement) value);

					} else {
						UMLUtil.setTaggedValue(classifierTemplateParameter,
							getUML2Stereotype(classifierTemplateParameter,
								STEREOTYPE__CLASSIFIER_TEMPLATE_PARAMETER),
							TAG_DEFINITION__DEFAULT_CLASSIFER, value);
					}
				}
				return super
					.caseClassifierTemplateParameter(classifierTemplateParameter);
			}

			@Override
			public Object defaultCase(EObject eObject) {
				AnyType extension = getExtension(resource, eObject);

				if (extension != null) {

					if (extension.getAnyAttribute().isEmpty()
						&& extension.getMixed().isEmpty()) {

						removeExtension(resource, eObject);
					} else if (DEBUG) {
						System.out.println(eObject);
						System.out.println("->"); //$NON-NLS-1$
						System.out.println(extension);

						EAnnotation eAnnotation = UML2Util.createEAnnotation(
							null, ExtendedMetaData.ANNOTATION_URI);

						eAnnotation.getContents().add(extension);
						eAnnotation.getReferences().add(eObject);

						resourceContents.add(eAnnotation);
					}
				}

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
			umlSwitch.doSwitch(resourceContents.get(i));
		}

	}
}
