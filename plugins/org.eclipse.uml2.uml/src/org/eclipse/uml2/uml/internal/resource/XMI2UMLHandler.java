/*
 * Copyright (c) 2006, 2011 IBM Corporation, Embarcadero Technologies, CEA, and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *   Kenn Hussey (Embarcadero Technologies) - 199624, 204202
 *   Kenn Hussey (CEA) - 327039
 *
 * $Id: XMI2UMLHandler.java,v 1.9 2008/10/03 20:50:37 jbruck Exp $
 */
package org.eclipse.uml2.uml.internal.resource;

import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.xmi.XMIResource;
import org.eclipse.emf.ecore.xmi.XMLHelper;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.impl.EMOFExtendedMetaData;
import org.eclipse.uml2.uml.resource.UMLResource;
import org.eclipse.uml2.uml.resource.XMI2UMLResource;

public class XMI2UMLHandler
		extends UMLHandler {

	protected static final String PRIMITIVE_TYPE_BOOLEAN = "Boolean"; //$NON-NLS-1$

	protected static final String PRIMITIVE_TYPE_BOOLEAN_URI = UMLResource.UML_PRIMITIVE_TYPES_LIBRARY_URI + '#' + PRIMITIVE_TYPE_BOOLEAN;

	protected static final String PRIMITIVE_TYPE_INTEGER = "Integer"; //$NON-NLS-1$

	protected static final String PRIMITIVE_TYPE_INTEGER_URI = UMLResource.UML_PRIMITIVE_TYPES_LIBRARY_URI + '#' + PRIMITIVE_TYPE_INTEGER;

	protected static final String PRIMITIVE_TYPE_REAL = "Real"; //$NON-NLS-1$

	protected static final String PRIMITIVE_TYPE_REAL_URI = UMLResource.UML_PRIMITIVE_TYPES_LIBRARY_URI + '#' + PRIMITIVE_TYPE_REAL;

	protected static final String PRIMITIVE_TYPE_STRING = "String"; //$NON-NLS-1$

	protected static final String PRIMITIVE_TYPE_STRING_URI = UMLResource.UML_PRIMITIVE_TYPES_LIBRARY_URI + '#' + PRIMITIVE_TYPE_STRING;

	protected static final String PRIMITIVE_TYPE_UNLIMITED_NATURAL = "UnlimitedNatural"; //$NON-NLS-1$

	protected static final String PRIMITIVE_TYPE_UNLIMITED_NATURAL_URI = UMLResource.UML_PRIMITIVE_TYPES_LIBRARY_URI + '#' + PRIMITIVE_TYPE_UNLIMITED_NATURAL;

	protected static final String STEREOTYPE_BUILD_COMPONENT = "BuildComponent"; //$NON-NLS-1$

	protected static final String STEREOTYPE_METAMODEL = "Metamodel"; //$NON-NLS-1$

	protected static final String STEREOTYPE_SYSTEM_MODEL = "SystemModel"; //$NON-NLS-1$

	protected static final String ECORE_EXTENSION_TYPE = "ecoreExtension"; //$NON-NLS-1$

	protected static final String XMI_IDREF = "idref"; //$NON-NLS-1$

	protected static final String IDREF_ATTRIB = XMIResource.XMI_NS + ':' + XMI_IDREF;

	public XMI2UMLHandler(XMLResource xmiResource, XMLHelper helper, Map<?, ?> options) {
		super(xmiResource, helper, options);
	}

	@Override
	protected void handleProxy(InternalEObject proxy, String uriLiteral) {

		if (uriLiteral.startsWith(XMI2UMLResource.UML_METAMODEL_2_3_URI)
			|| uriLiteral.startsWith(XMI2UMLResource.UML_METAMODEL_2_2_URI)
			|| uriLiteral.startsWith(XMI2UMLResource.UML_METAMODEL_2_1_1_URI)
			|| uriLiteral.startsWith(XMI2UMLResource.UML_METAMODEL_2_1_URI)) {

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
		} else if (uriLiteral
			.startsWith(XMI2UMLResource.STANDARD_PROFILE_2_3_URI)
			|| uriLiteral.startsWith(XMI2UMLResource.STANDARD_PROFILE_2_2_URI)
			|| uriLiteral
				.startsWith(XMI2UMLResource.STANDARD_PROFILE_2_1_1_URI)
			|| uriLiteral.startsWith(XMI2UMLResource.STANDARD_PROFILE_2_1_URI)) {

			int index = uriLiteral.indexOf('#');
			uriLiteral = (uriLiteral.endsWith(STEREOTYPE_BUILD_COMPONENT)
				|| uriLiteral.endsWith(STEREOTYPE_METAMODEL)
				|| uriLiteral.endsWith(STEREOTYPE_SYSTEM_MODEL)
				? UMLResource.STANDARD_L3_PROFILE_URI
				: UMLResource.STANDARD_L2_PROFILE_URI)
				+ (index == -1
					? "#_0" //$NON-NLS-1$
					: uriLiteral.substring(index));
		} else if (uriLiteral.startsWith(XMI2UMLResource.UML_METAMODEL_URI)) {
			int index = uriLiteral.indexOf('#');
			uriLiteral = UMLResource.UML_METAMODEL_URI + (index == -1
				? "#_0" //$NON-NLS-1$
				: uriLiteral.substring(index));
		} else if (uriLiteral
			.startsWith(XMI2UMLResource.STANDARD_L2_PROFILE_URI)) {
			int index = uriLiteral.indexOf('#');
			uriLiteral = UMLResource.STANDARD_L2_PROFILE_URI + (index == -1
				? "#_0" //$NON-NLS-1$
				: uriLiteral.substring(index));
		} else if (uriLiteral
			.startsWith(XMI2UMLResource.STANDARD_L3_PROFILE_URI)) {
			int index = uriLiteral.indexOf('#');
			uriLiteral = UMLResource.STANDARD_L3_PROFILE_URI + (index == -1
				? "#_0" //$NON-NLS-1$
				: uriLiteral.substring(index));
		} else if (uriLiteral
			.startsWith(XMI2UMLResource.UML_PRIMITIVE_TYPES_LIBRARY_URI)) {
			int index = uriLiteral.indexOf('#');
			uriLiteral = UMLResource.UML_PRIMITIVE_TYPES_LIBRARY_URI
				+ (index == -1
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
