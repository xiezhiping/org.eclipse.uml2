/*
 * Copyright (c) 2008 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *
 * $Id: XMI212UMLHandler.java,v 1.2 2008/11/04 14:29:52 khussey Exp $
 */
package org.eclipse.uml2.uml.internal.resource;

import java.util.Map;

import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.xmi.XMIResource;
import org.eclipse.emf.ecore.xmi.XMLHelper;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.impl.EMOFExtendedMetaData;
import org.eclipse.emf.ecore.xml.type.AnyType;
import org.eclipse.uml2.uml.resource.UML212UMLExtendedMetaData;
import org.eclipse.uml2.uml.resource.UMLResource;
import org.eclipse.uml2.uml.resource.XMI2UMLResource;

/**
 * Handler that converts .xmi models.
 * OMG:  UML 2.1.x and UML 2.2 
 * API:  UML2 2.2.x and UML2 3.0.x 
 * 
 * @since 3.0
 */
public class XMI212UMLHandler
		extends UMLHandler {

	
	protected static final String PRIMITIVE_TYPE_BOOLEAN = "Boolean"; //$NON-NLS-1$

	protected static final String PRIMITIVE_TYPE_BOOLEAN_URI = UMLResource.UML_PRIMITIVE_TYPES_LIBRARY_URI + '#' + PRIMITIVE_TYPE_BOOLEAN;

	protected static final String PRIMITIVE_TYPE_INTEGER = "Integer"; //$NON-NLS-1$

	protected static final String PRIMITIVE_TYPE_INTEGER_URI = UMLResource.UML_PRIMITIVE_TYPES_LIBRARY_URI + '#' + PRIMITIVE_TYPE_INTEGER;

	protected static final String PRIMITIVE_TYPE_STRING = "String"; //$NON-NLS-1$

	protected static final String PRIMITIVE_TYPE_STRING_URI = UMLResource.UML_PRIMITIVE_TYPES_LIBRARY_URI + '#' + PRIMITIVE_TYPE_STRING;

	protected static final String PRIMITIVE_TYPE_UNLIMITED_NATURAL = "UnlimitedNatural"; //$NON-NLS-1$

	protected static final String PRIMITIVE_TYPE_UNLIMITED_NATURAL_URI = UMLResource.UML_PRIMITIVE_TYPES_LIBRARY_URI + '#' + PRIMITIVE_TYPE_UNLIMITED_NATURAL;

	protected static final String ECORE_EXTENSION_TYPE = "ecoreExtension"; //$NON-NLS-1$

	protected static final String XMI_IDREF = "idref"; //$NON-NLS-1$

	protected static final String IDREF_ATTRIB = XMIResource.XMI_NS + ':' + XMI_IDREF;

	
	public XMI212UMLHandler(XMLResource xmiResource, XMLHelper helper,
			Map<?, ?> options) {
		super(xmiResource, helper, options);
	}
		
	@Override
	protected void createObject(EObject peekObject, EStructuralFeature feature) {

		if (!isNull()) {
			String xsiType = getXSIType();

			Map<String, Map<EClassifier, String>> featureToTypeMap = xsiType == null
				? UML212UMLExtendedMetaData.getFeatureToTypeMap()
				: null;

			Map<EClassifier, String> typeMap = featureToTypeMap == null
				? null
				: featureToTypeMap.get(feature.getName());

			if (typeMap != null) {
				EObject eObject = peekObject instanceof AnyType
					? (EObject) objects.get(objects.size() - 2)
					: peekObject;

				for (Map.Entry<EClassifier, String> entry : typeMap.entrySet()) {

					if (entry.getKey().isInstance(eObject)) {
						xsiType = entry.getValue();
						break;
					}
				}
			}

			if (xsiType != null) {
				createObjectFromTypeName(peekObject, xsiType, feature);
			} else {
				super.createObject(peekObject, feature);
			}
		}
	}
	

	@Override
	protected void handleProxy(InternalEObject proxy, String uriLiteral) {

		if (uriLiteral.startsWith(XMI2UMLResource.UML_METAMODEL_URI)
			|| uriLiteral.startsWith(XMI2UMLResource.UML_METAMODEL_2_1_1_URI)
			|| uriLiteral.startsWith(XMI2UMLResource.UML_METAMODEL_2_1_URI)
			|| uriLiteral.startsWith(XMI2UMLResource.UML_METAMODEL_2_2_URI)) {

			if (uriLiteral.endsWith(PRIMITIVE_TYPE_BOOLEAN)) {
				uriLiteral = PRIMITIVE_TYPE_BOOLEAN_URI;
			} else if (uriLiteral.endsWith(PRIMITIVE_TYPE_INTEGER)) {
				uriLiteral = PRIMITIVE_TYPE_INTEGER_URI;
			} else if (uriLiteral.endsWith(PRIMITIVE_TYPE_STRING)) {
				uriLiteral = PRIMITIVE_TYPE_STRING_URI;
			} else if (uriLiteral.endsWith(PRIMITIVE_TYPE_UNLIMITED_NATURAL)) {
				uriLiteral = PRIMITIVE_TYPE_UNLIMITED_NATURAL_URI;
			} else {
				int index = uriLiteral.indexOf('#');
				uriLiteral = UMLResource.UML_METAMODEL_URI + (index == -1
					? "#_0" //$NON-NLS-1$
					: uriLiteral.substring(index));
			}
		} else if (uriLiteral.startsWith(XMI2UMLResource.STANDARD_PROFILE_URI)
			|| uriLiteral
				.startsWith(XMI2UMLResource.STANDARD_PROFILE_2_1_1_URI)
			|| uriLiteral.startsWith(XMI2UMLResource.STANDARD_PROFILE_2_1_URI)
			|| uriLiteral.startsWith(XMI2UMLResource.STANDARD_PROFILE_2_2_URI)) {

			int index = uriLiteral.indexOf('#');
			uriLiteral = UMLResource.STANDARD_PROFILE_URI + (index == -1
				? "#_0" //$NON-NLS-1$
				: uriLiteral.substring(index));
		}

		super.handleProxy(proxy, uriLiteral);
	}

	@Override
	protected void processElement(String name, String prefix, String localName) {

		if (EMOFExtendedMetaData.EXTENSION.equals(localName)
			&& XMI2UMLResource.XMI_NS_URI.equals(helper.getURI(prefix))
			&& attribs != null
			&& EcorePackage.eNS_URI.equals(attribs
				.getValue(EMOFExtendedMetaData.XMI_EXTENDER_ATTRIBUTE))) {

			types.push(ECORE_EXTENSION_TYPE);
		} else {
			super.processElement(name, prefix, localName);
		}
	}

	@Override
	public void endElement(String uri, String localName, String name) {

		if (types.peek() == ECORE_EXTENSION_TYPE) {
			elements.pop();
			types.pop();
			helper.popContext();
			mixedTargets.pop();
		} else {
			super.endElement(uri, localName, name);
		}
	}

	@Override
	protected void setAttribValue(EObject object, String name, String value) {

		if (IDREF_ATTRIB.equals(name)
			&& (!recordUnknownFeature || types.peek() != UNKNOWN_FEATURE_TYPE)) {

			handleProxy((InternalEObject) object, '#' + value);
		} else {
			super.setAttribValue(object, name, value);
		}
	}

}
