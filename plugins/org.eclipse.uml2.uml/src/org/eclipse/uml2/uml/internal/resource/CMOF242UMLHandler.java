/*
 * Copyright (c) 2014 CEA and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Kenn Hussey (CEA) - initial API and implementation
 *
 */
package org.eclipse.uml2.uml.internal.resource;

import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.xmi.XMIResource;
import org.eclipse.emf.ecore.xmi.XMLHelper;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.impl.EMOFExtendedMetaData;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.resource.CMOF2UMLResource;
import org.eclipse.uml2.uml.resource.UML402UMLResource;
import org.eclipse.uml2.uml.resource.UMLResource;
import org.eclipse.uml2.uml.resource.XMI2UMLResource;

public class CMOF242UMLHandler
		extends XMI2UMLHandler {

	protected static final String UML_EXTENSION_TYPE = "umlExtension"; //$NON-NLS-1$

	protected static final String XMI_IDREF = "idref"; //$NON-NLS-1$

	protected static final String IDREF_ATTRIB = XMIResource.XMI_NS + ':'
		+ XMI_IDREF;

	public CMOF242UMLHandler(XMLResource xmiResource, XMLHelper helper,
			Map<?, ?> options) {
		super(xmiResource, helper, options);
	}

	@Override
	protected void processElement(String name, String prefix, String localName) {
		String extender = attribs
			.getValue(EMOFExtendedMetaData.XMI_EXTENDER_ATTRIBUTE);

		if (EMOFExtendedMetaData.EXTENSION.equals(localName)
			&& (XMI2UMLResource.XMI_2_4_1_NS_URI.equals(helper.getURI(prefix)) || XMI2UMLResource.XMI_2_4_NS_URI
				.equals(helper.getURI(prefix)))
			&& attribs != null
			&& (UML402UMLResource.UML_METAMODEL_NS_URI.equals(extender) || UMLPackage.eNS_URI
				.equals(extender))) {

			types.push(UML_EXTENSION_TYPE);
		} else {
			super.processElement(name, prefix, localName);
		}
	}

	@Override
	public void endElement(String uri, String localName, String name) {

		if (types.peek() == UML_EXTENSION_TYPE) {
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

	@Override
	protected void handleProxy(InternalEObject proxy, String uriLiteral) {

		if (uriLiteral
			.startsWith(CMOF2UMLResource.UML_PRIMITIVE_TYPES_LIBRARY_2_4_1_URI)
			|| uriLiteral
				.startsWith(CMOF2UMLResource.UML_PRIMITIVE_TYPES_LIBRARY_2_4_URI)) {

			if (uriLiteral.endsWith(PRIMITIVE_TYPE_BOOLEAN)) {
				uriLiteral = PRIMITIVE_TYPE_BOOLEAN_URI;
			} else if (uriLiteral.endsWith(PRIMITIVE_TYPE_INTEGER)) {
				uriLiteral = PRIMITIVE_TYPE_INTEGER_URI;
			} else if (uriLiteral.endsWith(PRIMITIVE_TYPE_REAL)) {
				uriLiteral = PRIMITIVE_TYPE_REAL_URI;
			} else if (uriLiteral.endsWith(PRIMITIVE_TYPE_STRING)) {
				uriLiteral = PRIMITIVE_TYPE_STRING_URI;
			} else if (uriLiteral.endsWith(PRIMITIVE_TYPE_UNLIMITED_NATURAL)) {
				uriLiteral = PRIMITIVE_TYPE_UNLIMITED_NATURAL_URI;
			} else {
				int index = uriLiteral.indexOf('#');
				uriLiteral = UMLResource.UML_PRIMITIVE_TYPES_LIBRARY_URI
					+ (index == -1
						? "#_0" //$NON-NLS-1$
						: uriLiteral.substring(index));
			}
		}

		super.handleProxy(proxy, uriLiteral);
	}

}
