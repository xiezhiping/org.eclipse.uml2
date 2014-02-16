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

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EFactory;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.xmi.XMIResource;
import org.eclipse.emf.ecore.xmi.XMLHelper;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.impl.EMOFExtendedMetaData;

import org.eclipse.uml2.types.TypesPackage;
import org.eclipse.uml2.uml.EnumerationLiteral;
import org.eclipse.uml2.uml.UMLFactory;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.resource.UMLResource;
import org.eclipse.uml2.uml.resource.XMI2UMLResource;

/**
 * Handler that converts .xmi models.
 * OMG:  UML 2.4.x and UML 2.5
 * API:  UML2 4.x and UML2 5.0 
 * 
 * @since 5.0
 */
public class XMI242UMLHandler
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

	protected static final String ECORE_EXTENSION_TYPE = "ecoreExtension"; //$NON-NLS-1$

	protected static final String XMI_IDREF = "idref"; //$NON-NLS-1$

	protected static final String IDREF_ATTRIB = XMIResource.XMI_NS + ':' + XMI_IDREF;

	public XMI242UMLHandler(XMLResource xmiResource, XMLHelper helper, Map<?, ?> options) {
		super(xmiResource, helper, options);
	}

	@Override
	protected void handleProxy(InternalEObject proxy, String uriLiteral) {

		if (uriLiteral.startsWith(XMI2UMLResource.UML_METAMODEL_2_4_1_URI)
			|| uriLiteral.startsWith(XMI2UMLResource.UML_METAMODEL_2_4_URI)) {

			int index = uriLiteral.indexOf('#');
			uriLiteral = UMLResource.UML_METAMODEL_URI + (index == -1
				? "#_0" //$NON-NLS-1$
				: uriLiteral.substring(index));
		} else if (uriLiteral
			.startsWith(XMI2UMLResource.STANDARD_L2_PROFILE_2_4_1_URI)
			|| uriLiteral
				.startsWith(XMI2UMLResource.STANDARD_L2_PROFILE_2_4_URI)
			|| uriLiteral
				.startsWith(XMI2UMLResource.STANDARD_L3_PROFILE_2_4_1_URI)
			|| uriLiteral
				.startsWith(XMI2UMLResource.STANDARD_L3_PROFILE_2_4_URI)) {

			int index = uriLiteral.indexOf('#');
			if (index == -1) {
				uriLiteral = UMLResource.STANDARD_PROFILE_URI + "#_0"; //$NON-NLS-1$
			} else {
				String fragment = uriLiteral.substring(index);

				if ("#_yzU58YinEdqtvbnfB2L_5w".equals(fragment)) { //$NON-NLS-1$
					uriLiteral = UMLResource.STANDARD_PROFILE_NS_URI;
				} else {
					uriLiteral = UMLResource.STANDARD_PROFILE_URI + fragment;
				}
			}
		} else if (uriLiteral
			.startsWith(XMI2UMLResource.UML_PRIMITIVE_TYPES_LIBRARY_2_4_1_URI)
			|| uriLiteral
				.startsWith(XMI2UMLResource.UML_PRIMITIVE_TYPES_LIBRARY_2_4_URI)) {

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
			&& (XMI2UMLResource.XMI_2_4_1_NS_URI.equals(helper.getURI(prefix)) || XMI2UMLResource.XMI_2_4_NS_URI
				.equals(helper.getURI(prefix)))
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

	@Override
	protected void setFeatureValue(EObject object, EStructuralFeature feature,
			Object value, int position) {
		
		if (feature == UMLPackage.Literals.INSTANCE_SPECIFICATION__CLASSIFIER && object instanceof EnumerationLiteral) {
			return;
		}

		super.setFeatureValue(object, feature, value, position);
	}

	@SuppressWarnings("deprecation")
	@Override
	protected EObject validateCreateObjectFromFactory(EFactory factory,
			String typeName, EObject newObject, EStructuralFeature feature) {

		if (newObject == null
			&& feature == UMLPackage.Literals.TYPED_ELEMENT__TYPE) {

			if (attribs != null) {

				for (int i = 0, size = attribs.getLength(); i < size; ++i) {

					if (attribs.getQName(i).equals(hrefAttribute)) {
						String uriLiteral = attribs.getValue(i);

						if (uriLiteral
							.startsWith(XMI2UMLResource.UML_PRIMITIVE_TYPES_LIBRARY_2_4_1_URI)
							|| uriLiteral
								.startsWith(XMI2UMLResource.UML_PRIMITIVE_TYPES_LIBRARY_2_4_URI)) {

							int index = uriLiteral.indexOf('#');

							if (index != -1
								&& TypesPackage.eINSTANCE
									.getEClassifier(uriLiteral
										.substring(index + 1)) instanceof EDataType) {
								factory = UMLFactory.eINSTANCE;
								newObject = createObjectFromFactory(factory,
									UMLPackage.Literals.PRIMITIVE_TYPE
										.getName());
							}
						} else if (uriLiteral
								.startsWith(XMI2UMLResource.UML_METAMODEL_2_4_1_URI)
							|| uriLiteral
								.startsWith(XMI2UMLResource.UML_METAMODEL_2_4_URI)) {

							int index = uriLiteral.indexOf('#');

							if (index != -1
								&& UMLPackage.eINSTANCE
									.getEClassifier(uriLiteral
										.substring(index + 1)) instanceof EClass) {
								factory = UMLFactory.eINSTANCE;
								newObject = createObjectFromFactory(factory,
									UMLPackage.Literals.CLASS.getName());
							}
						}

						break;
					}
				}
			}
		}

		return super.validateCreateObjectFromFactory(factory, typeName,
			newObject, feature);
	}

	@Override
	protected EPackage getPackageForURI(String uriString) {

		if (XMI2UMLResource.STANDARD_L2_PROFILE_2_4_1_NS_URI.equals(uriString)
			|| XMI2UMLResource.STANDARD_L2_PROFILE_2_4_NS_URI.equals(uriString)
			|| XMI2UMLResource.STANDARD_L3_PROFILE_2_4_1_NS_URI
				.equals(uriString)
			|| XMI2UMLResource.STANDARD_L3_PROFILE_2_4_NS_URI.equals(uriString)) {

			uriString = UMLResource.STANDARD_PROFILE_NS_URI;
		}

		return super.getPackageForURI(uriString);
	}

}
