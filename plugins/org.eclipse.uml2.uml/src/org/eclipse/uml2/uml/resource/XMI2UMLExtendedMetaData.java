/*
 * Copyright (c) 2006, 2015 IBM Corporation, Embarcadero Technologies, CEA, and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *   Kenn Hussey (Embarcadero Technologies) - 204202
 *   Kenn Hussey (CEA) - 327039, 351774, 418466, 457892, 458656
 * 
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

			synchronized (XMI2UMLExtendedMetaData.class) {

				if (uriMap == null) {
					uriMap = new HashMap<URI, URI>();

					uriMap.put(URI.createURI(XMI2UMLResource.STANDARD_PROFILE_URI),
						URI.createURI(UMLResource.STANDARD_PROFILE_URI));

					uriMap.put(
						URI.createURI(XMI2UMLResource.STANDARD_L3_PROFILE_2_4_1_URI),
						URI.createURI(UMLResource.STANDARD_PROFILE_URI));
					uriMap.put(
						URI.createURI(XMI2UMLResource.STANDARD_L2_PROFILE_2_4_1_URI),
						URI.createURI(UMLResource.STANDARD_PROFILE_URI));

					uriMap.put(
						URI.createURI(XMI2UMLResource.STANDARD_L3_PROFILE_2_4_URI),
						URI.createURI(UMLResource.STANDARD_PROFILE_URI));
					uriMap.put(
						URI.createURI(XMI2UMLResource.STANDARD_L2_PROFILE_2_4_URI),
						URI.createURI(UMLResource.STANDARD_PROFILE_URI));

					uriMap.put(
						URI.createURI(XMI2UMLResource.STANDARD_L3_PROFILE_2_2_URI),
						URI.createURI(UMLResource.STANDARD_PROFILE_URI));
					uriMap.put(
						URI.createURI(XMI2UMLResource.STANDARD_L2_PROFILE_2_2_URI),
						URI.createURI(UMLResource.STANDARD_PROFILE_URI));

					uriMap.put(
						URI.createURI(XMI2UMLResource.STANDARD_L3_PROFILE_2_1_1_URI),
						URI.createURI(UMLResource.STANDARD_PROFILE_URI));
					uriMap.put(
						URI.createURI(XMI2UMLResource.STANDARD_L2_PROFILE_2_1_1_URI),
						URI.createURI(UMLResource.STANDARD_PROFILE_URI));

					uriMap.put(
						URI.createURI(XMI2UMLResource.STANDARD_L3_PROFILE_2_1_URI),
						URI.createURI(UMLResource.STANDARD_PROFILE_URI));
					uriMap.put(
						URI.createURI(XMI2UMLResource.STANDARD_L2_PROFILE_2_1_URI),
						URI.createURI(UMLResource.STANDARD_PROFILE_URI));
				}
			}
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

		if (XMI2UMLResource.XMI_NS_URI.equals(namespace)
			|| XMI2UMLResource.XMI_2_4_1_NS_URI.equals(namespace)
			|| XMI2UMLResource.XMI_2_4_NS_URI.equals(namespace)
			|| XMI2UMLResource.XMI_2_1_NS_URI.equals(namespace)
			|| XMI2UMLResource.MOF_NS_URI.equals(namespace)
			|| XMI2UMLResource.MOF_2_4_1_NS_URI.equals(namespace)
			|| XMI2UMLResource.MOF_2_4_NS_URI.equals(namespace)
			|| XMI2UMLResource.MOF_2_0_NS_URI.equals(namespace)) {

			return demandPackage(namespace);
		}

		return XMI2UMLResource.UML_METAMODEL_NS_URI.equals(namespace)
			|| XMI2UMLResource.UML_METAMODEL_2_4_1_NS_URI.equals(namespace)
			|| XMI2UMLResource.UML_METAMODEL_2_4_NS_URI.equals(namespace)
			|| XMI2UMLResource.UML_METAMODEL_2_2_NS_URI.equals(namespace)
			|| XMI2UMLResource.UML_METAMODEL_2_1_1_NS_URI.equals(namespace)
			|| XMI2UMLResource.UML_METAMODEL_2_1_NS_URI.equals(namespace)
			? UMLPackage.eINSTANCE
			: super.getPackage(XMI2UMLResource.STANDARD_PROFILE_NS_URI
				.equals(namespace)
				|| XMI2UMLResource.STANDARD_L2_PROFILE_2_4_1_NS_URI
					.equals(namespace)
				|| XMI2UMLResource.STANDARD_L2_PROFILE_2_4_NS_URI
					.equals(namespace)
				|| XMI2UMLResource.STANDARD_L2_PROFILE_2_2_NS_URI
					.equals(namespace)
				|| XMI2UMLResource.STANDARD_L2_PROFILE_2_1_1_NS_URI
					.equals(namespace)
				|| XMI2UMLResource.STANDARD_L2_PROFILE_2_1_NS_URI
					.equals(namespace)
				|| XMI2UMLResource.STANDARD_L3_PROFILE_2_4_1_NS_URI
					.equals(namespace)
				|| XMI2UMLResource.STANDARD_L3_PROFILE_2_4_NS_URI
					.equals(namespace)
				|| XMI2UMLResource.STANDARD_L3_PROFILE_2_2_NS_URI
					.equals(namespace)
				|| XMI2UMLResource.STANDARD_L3_PROFILE_2_1_1_NS_URI
					.equals(namespace)
				|| XMI2UMLResource.STANDARD_L3_PROFILE_2_1_NS_URI
					.equals(namespace)
				? UMLResource.STANDARD_PROFILE_NS_URI
				: namespace);
	}

}
