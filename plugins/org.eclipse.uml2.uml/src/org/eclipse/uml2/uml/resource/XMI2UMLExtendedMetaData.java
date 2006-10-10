/*
 * Copyright (c) 2006 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 * 
 * $Id: XMI2UMLExtendedMetaData.java,v 1.2 2006/10/10 20:41:29 khussey Exp $
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

	protected static Map uriMap = null;

	public static Map getURIMap() {

		if (uriMap == null) {
			uriMap = new HashMap();

			uriMap.put(URI.createURI(XMI2UMLResource.STANDARD_PROFILE_URI), URI
				.createURI(UMLResource.STANDARD_PROFILE_URI));
		}

		return uriMap;
	}

	public XMI2UMLExtendedMetaData(EPackage.Registry registry) {
		super(registry);
	}

	public String getNamespace(EPackage ePackage) {

		if (ePackage == UMLPackage.eINSTANCE) {
			return XMI2UMLResource.UML_METAMODEL_NS_URI;
		}

		String namespace = super.getNamespace(ePackage);
		return UMLResource.STANDARD_PROFILE_NS_URI.equals(namespace)
			? XMI2UMLResource.STANDARD_PROFILE_NS_URI
			: namespace;
	}

	public EPackage getPackage(String namespace) {

		return XMI2UMLResource.UML_METAMODEL_NS_URI.equals(namespace)
			? UMLPackage.eINSTANCE
			: super.getPackage(XMI2UMLResource.STANDARD_PROFILE_NS_URI
				.equals(namespace)
				? UMLResource.STANDARD_PROFILE_NS_URI
				: namespace);
	}

}
