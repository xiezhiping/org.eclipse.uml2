/*
 * Copyright (c) 2008, 2015 IBM Corporation, CEA, and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *   Kenn Hussey (CEA) - 327039, 418466, 458656
 *
 */
package org.eclipse.uml2.uml.resource;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.mapping.ecore2xml.Ecore2XMLRegistry;
import org.eclipse.emf.mapping.ecore2xml.util.Ecore2XMLExtendedMetaData;
import org.eclipse.uml2.uml.UMLPackage;

/**
 * Extended meta-data required for model migration.
 * OMG:  UML 2.1.x and UML 2.2 
 * API:  UML2 2.2.x and UML2 3.0.x 
 * 
 * @since 3.0
 */
public class UML212UMLExtendedMetaData
		extends Ecore2XMLExtendedMetaData {

	protected static Map<URI, URI> uriMap = null;

	public static Map<URI, URI> getURIMap() {

		if (uriMap == null) {

			synchronized(UML212UMLExtendedMetaData.class) {

				if (uriMap == null) {
					uriMap = new HashMap<URI, URI>();

					// Standard.profile.uml -> Standard.profile.uml
					uriMap.put(URI.createURI(UML212UMLResource.STANDARD_PROFILE_URI).appendFragment("_yzU58YinEdqtvbnfB2L_5w"), URI.createURI(UMLResource.STANDARD_PROFILE_NS_URI).appendFragment("/"));
				}
			}
		}

		return uriMap;
	}

	protected static Map<String, Map<EClassifier, String>> featureToTypeMap = null;

	public static Map<String, Map<EClassifier, String>> getFeatureToTypeMap() {

		if (featureToTypeMap == null) {

			synchronized(UML212UMLExtendedMetaData.class) {

				if (featureToTypeMap == null) {
					featureToTypeMap = new HashMap<String, Map<EClassifier, String>>();

					Map<EClassifier, String> typeMap = null;

					typeMap = new HashMap<EClassifier, String>();
					typeMap.put(UMLPackage.Literals.PROPERTY, "uml:TemplateSignature"); //$NON-NLS-1$
					featureToTypeMap.put("ownedTemplateSignature", typeMap); //$NON-NLS-1$

					typeMap = new HashMap<EClassifier, String>();
					typeMap.put(UMLPackage.Literals.PROPERTY, "uml:TemplateBinding"); //$NON-NLS-1$
					featureToTypeMap.put("templateBinding", typeMap); //$NON-NLS-1$

					typeMap = new HashMap<EClassifier, String>();
					typeMap.put(UMLPackage.Literals.CLASSIFIER_TEMPLATE_PARAMETER,
						"uml:Classifier"); //$NON-NLS-1$
					featureToTypeMap.put("defaultClassifier", typeMap); //$NON-NLS-1$
				}
			}
		}

		return featureToTypeMap;
	}

	public UML212UMLExtendedMetaData(EPackage.Registry ePackageRegistry,
			Ecore2XMLRegistry ecore2xmlRegistry) {
		super(ePackageRegistry, ecore2xmlRegistry);
	}

}
