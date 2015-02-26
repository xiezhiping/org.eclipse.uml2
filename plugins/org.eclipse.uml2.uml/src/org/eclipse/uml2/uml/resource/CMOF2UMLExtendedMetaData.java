/*
 * Copyright (c) 2007, 2015 IBM Corporation, Embarcadero Technologies, CEA, and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Kenn Hussey (IBM Corporation, Embarcadero Technologies) - initial API and implementation
 *   Kenn Hussey (Embarcadero Technologies) - 213903
 *   Kenn Hussey (CEA) - 418466, 458656
 *
 */
package org.eclipse.uml2.uml.resource;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.XMLResource.XMLInfo;
import org.eclipse.emf.ecore.xmi.impl.EMOFExtendedMetaData;
import org.eclipse.emf.mapping.ecore2xml.Ecore2XMLRegistry;
import org.eclipse.emf.mapping.ecore2xml.util.Ecore2XMLExtendedMetaData;
import org.eclipse.uml2.uml.UMLPackage;

public class CMOF2UMLExtendedMetaData
		extends Ecore2XMLExtendedMetaData {

	protected static final String TAG = EMOFExtendedMetaData.TAG;

	public static final String CMOF_TAG = CMOF2UMLResource.CMOF_METAMODEL_NS_PREFIX
		+ ':' + TAG;

	public static final String CMOF_TAG_NAME = EMOFExtendedMetaData.EMOF_TAG_NAME;

	public static final String CMOF_TAG_VALUE = EMOFExtendedMetaData.EMOF_TAG_VALUE;

	public static final String CMOF_TAG_ELEMENT = EMOFExtendedMetaData.EMOF_TAG_ELEMENT;

	public static final String EMOF_TAG__OPPOSITE_ROLE_NAME = "org.omg.emof.oppositeRoleName"; //$NON-NLS-1$

	public static final String XMI_TAG__ATTRIBUTE = "org.omg.xmi.attribute"; //$NON-NLS-1$

	public static final String XMI_TAG__ELEMENT = "org.omg.xmi.element"; //$NON-NLS-1$

	public static final String XMI_TAG__ID_PROPERTY = "org.omg.xmi.idProperty"; //$NON-NLS-1$

	public static final String XMI_TAG__NS_PREFIX = "org.omg.xmi.nsPrefix"; //$NON-NLS-1$

	public static final String XMI_TAG__NS_URI = "org.omg.xmi.nsURI"; //$NON-NLS-1$

	public static final String XMI_TAG__SCHEMA_TYPE = "org.omg.xmi.schemaType"; //$NON-NLS-1$

	public static final String XMI_TAG__XMI_NAME = "org.omg.xmi.xmiName"; //$NON-NLS-1$

	public static final String XMI_TAG__CONTENT_TYPE = "org.omg.xmi.contentType"; //$NON-NLS-1$

	protected static Map<URI, URI> uriMap = null;

	public static Map<URI, URI> getURIMap() {

		if (uriMap == null) {

			synchronized (CMOF2UMLExtendedMetaData.class) {

				if (uriMap == null) {
					uriMap = new HashMap<URI, URI>();
				}
			}
		}

		return uriMap;
	}

	public CMOF2UMLExtendedMetaData(EPackage.Registry ePackageRegistry,
			Ecore2XMLRegistry ecore2xmlRegistry) {
		super(ePackageRegistry, ecore2xmlRegistry);
	}

	@Override
	protected XMLInfo getInfo(ENamedElement element) {

		if (xmlMaps.isEmpty()) {

			for (Map.Entry<String, Object> entry : ecore2xmlRegistry.entrySet()) {
				xmlMaps.put(entry.getKey(), (XMLResource.XMLMap) entry
					.getValue());
			}
		}

		return super.getInfo(element);
	}

	@Override
	public String getName(EClassifier eClassifier) {
		return getName(eClassifier, false);
	}

	public String getName(EClassifier eClassifier, boolean allowNull) {

		if (eClassifier == UMLPackage.Literals.MODEL) {
			eClassifier = UMLPackage.Literals.PACKAGE;
		}

		XMLResource.XMLInfo xmlInfo = getInfo(eClassifier);

		if (xmlInfo != null) {
			String name = xmlInfo.getName();

			if (allowNull || name != null) {
				return name;
			}
		}

		return getExtendedMetaData(eClassifier).getName();
	}

	@Override
	public String getName(EStructuralFeature eStructuralFeature) {
		return getName(eStructuralFeature, false);
	}

	public String getName(EStructuralFeature eStructuralFeature,
			boolean allowNull) {

		if (eStructuralFeature == UMLPackage.Literals.NAMED_ELEMENT__NAMESPACE) {
			return null;
		}

		XMLResource.XMLInfo xmlInfo = getInfo(eStructuralFeature);

		if (xmlInfo != null) {
			String name = xmlInfo.getName();

			if (allowNull || name != null) {
				return name;
			}
		}

		return getExtendedMetaData(eStructuralFeature).getName();
	}

}
