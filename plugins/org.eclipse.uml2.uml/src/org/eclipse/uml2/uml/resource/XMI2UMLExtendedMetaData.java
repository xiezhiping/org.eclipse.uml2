/*
 * Copyright (c) 2006, 2008 IBM Corporation, Embarcadero Technologies, and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *   Kenn Hussey (Embarcadero Technologies) - 204202
 * 
 * $Id: XMI2UMLExtendedMetaData.java,v 1.6 2008/10/03 20:50:37 jbruck Exp $
 */
package org.eclipse.uml2.uml.resource;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.BasicExtendedMetaData;
import org.eclipse.uml2.uml.UMLPackage;

public class XMI2UMLExtendedMetaData
		extends BasicExtendedMetaData {

	protected static Map<URI, URI> uriMap = null;

	public static Map<URI, URI> getURIMap() {

		if (uriMap == null) {
			uriMap = new HashMap<URI, URI>();

			uriMap.put(URI.createURI(XMI2UMLResource.STANDARD_PROFILE_URI), URI
				.createURI(UMLResource.STANDARD_PROFILE_URI));
			uriMap.put(URI.createURI(XMI2UMLResource.STANDARD_PROFILE_2_1_1_URI),
				URI.createURI(UMLResource.STANDARD_PROFILE_URI));
			uriMap.put(URI.createURI(XMI2UMLResource.STANDARD_PROFILE_2_1_URI),
				URI.createURI(UMLResource.STANDARD_PROFILE_URI));
			uriMap.put(URI.createURI(XMI2UMLResource.STANDARD_PROFILE_2_2_URI),
				URI.createURI(UMLResource.STANDARD_PROFILE_URI));
		}

		return uriMap;
	}

	public XMI2UMLExtendedMetaData(EPackage.Registry registry) {
		super(registry);
	}

	@Override
	public String getNamespace(EPackage ePackage) {

		if (ePackage == UMLPackage.eINSTANCE) {
			return XMI2UMLResource.UML_METAMODEL_NS_URI;
		}

		String namespace = super.getNamespace(ePackage);
		return UMLResource.STANDARD_PROFILE_NS_URI.equals(namespace)
			? XMI2UMLResource.STANDARD_PROFILE_NS_URI
			: namespace;
	}

	@Override
	public EPackage getPackage(String namespace) {

		return XMI2UMLResource.UML_METAMODEL_NS_URI.equals(namespace)
			|| XMI2UMLResource.UML_METAMODEL_2_1_1_NS_URI.equals(namespace)
			|| XMI2UMLResource.UML_METAMODEL_2_1_NS_URI.equals(namespace)
			|| XMI2UMLResource.UML_METAMODEL_2_2_NS_URI.equals(namespace)
			? UMLPackage.eINSTANCE
			: super.getPackage(XMI2UMLResource.STANDARD_PROFILE_NS_URI
				.equals(namespace)
				|| XMI2UMLResource.STANDARD_PROFILE_2_1_1_NS_URI
					.equals(namespace)
				|| XMI2UMLResource.STANDARD_PROFILE_2_1_NS_URI
					.equals(namespace)
				|| XMI2UMLResource.STANDARD_PROFILE_2_2_NS_URI
					.equals(namespace)
				? UMLResource.STANDARD_PROFILE_NS_URI
				: namespace);
	}

}
