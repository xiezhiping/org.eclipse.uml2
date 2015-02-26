/*
 * Copyright (c) 2011, 2015 CEA and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Kenn Hussey (CEA) - initial API and implementation
 *   Kenn Hussey (CEA) - 418466, 458656
 *
 */
package org.eclipse.uml2.uml.resource;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.uml2.uml.UMLPackage;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.mapping.ecore2xml.Ecore2XMLRegistry;
import org.eclipse.emf.mapping.ecore2xml.util.Ecore2XMLExtendedMetaData;

public class UML302UMLExtendedMetaData
		extends Ecore2XMLExtendedMetaData {

	protected static Map<URI, URI> uriMap = null;

	public static Map<URI, URI> getURIMap() {

		if (uriMap == null) {

			synchronized (UML302UMLExtendedMetaData.class) {

				if (uriMap == null) {
					uriMap = new HashMap<URI, URI>();

					// Standard.profile.uml -> Standard.profile.uml
					uriMap.put(URI.createURI(UML302UMLResource.STANDARD_PROFILE_URI).appendFragment("_yzU58YinEdqtvbnfB2L_5w"), URI.createURI(UMLResource.STANDARD_PROFILE_NS_URI).appendFragment("/"));
				}
			}
		}

		return uriMap;
	}

	protected static Map<String, String> fragmentMap = null;

	public static Map<String, String> getFragmentMap() {

		if (fragmentMap == null) {

			synchronized (UML302UMLExtendedMetaData.class) {

				if (fragmentMap == null) {
					fragmentMap = new HashMap<String, String>();
				}
			}
		}

		return fragmentMap;
	}

	public UML302UMLExtendedMetaData(EPackage.Registry ePackageRegistry,
			Ecore2XMLRegistry ecore2xmlRegistry) {
		super(ePackageRegistry, ecore2xmlRegistry);
	}

	protected static Map<String, Map<EClassifier, String>> featureToTypeMap = null;

	public static Map<String, Map<EClassifier, String>> getFeatureToTypeMap() {

		if (featureToTypeMap == null) {

			synchronized (UML302UMLExtendedMetaData.class) {

				if (featureToTypeMap == null) {
					featureToTypeMap = new HashMap<String, Map<EClassifier, String>>();

					Map<EClassifier, String> typeMap = null;

					typeMap = new HashMap<EClassifier, String>();
					typeMap.put(UMLPackage.Literals.BEHAVIORED_CLASSIFIER, "uml:Trigger"); //$NON-NLS-1$
					featureToTypeMap.put("ownedTrigger", typeMap); //$NON-NLS-1$
				}
			}
		}

		return featureToTypeMap;		
	}

}
