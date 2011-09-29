/*
 * Copyright (c) 2008, 2011 IBM Corporation, CEA, and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *   Kenn Hussey (CEA) - 327039
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
			uriMap = new HashMap<URI, URI>();

			// Standard.profile.uml#BuildComponent -> StandardL3.profile.uml#BuildComponent
			uriMap.put(URI.createURI(UML212UMLResource.STANDARD_PROFILE_URI).appendFragment("BuildComponent"), URI.createURI(UMLResource.STANDARD_L3_PROFILE_URI).appendFragment("BuildComponent"));
			uriMap.put(URI.createURI(UML212UMLResource.STANDARD_PROFILE_URI).appendFragment("BuildComponent-base_Component"), URI.createURI(UMLResource.STANDARD_L3_PROFILE_URI).appendFragment("BuildComponent-base_Component"));
			uriMap.put(URI.createURI(UML212UMLResource.STANDARD_PROFILE_URI).appendFragment("Component_BuildComponent"), URI.createURI(UMLResource.STANDARD_L3_PROFILE_URI).appendFragment("Component_BuildComponent"));
			uriMap.put(URI.createURI(UML212UMLResource.STANDARD_PROFILE_URI).appendFragment("Component_BuildComponent-extension_BuildComponent"), URI.createURI(UMLResource.STANDARD_L3_PROFILE_URI).appendFragment("Component_BuildComponent-extension_BuildComponent"));

			// Standard.profile.uml#Metamodel -> StandardL3.profile.uml#Metamodel
			uriMap.put(URI.createURI(UML212UMLResource.STANDARD_PROFILE_URI).appendFragment("Metamodel"), URI.createURI(UMLResource.STANDARD_L3_PROFILE_URI).appendFragment("Metamodel"));
			uriMap.put(URI.createURI(UML212UMLResource.STANDARD_PROFILE_URI).appendFragment("Metamodel-base_Model"), URI.createURI(UMLResource.STANDARD_L3_PROFILE_URI).appendFragment("Metamodel-base_Model"));
			uriMap.put(URI.createURI(UML212UMLResource.STANDARD_PROFILE_URI).appendFragment("Model_Metamodel"), URI.createURI(UMLResource.STANDARD_L3_PROFILE_URI).appendFragment("Model_Metamodel"));
			uriMap.put(URI.createURI(UML212UMLResource.STANDARD_PROFILE_URI).appendFragment("Model_Metamodel-extension_Metamodel"), URI.createURI(UMLResource.STANDARD_L3_PROFILE_URI).appendFragment("Model_Metamodel-extension_Metamodel"));

			// Standard.profile.uml#SystemModel -> StandardL3.profile.uml#SystemModel
			uriMap.put(URI.createURI(UML212UMLResource.STANDARD_PROFILE_URI).appendFragment("SystemModel"), URI.createURI(UMLResource.STANDARD_L3_PROFILE_URI).appendFragment("SystemModel"));
			uriMap.put(URI.createURI(UML212UMLResource.STANDARD_PROFILE_URI).appendFragment("SystemModel-base_Model"), URI.createURI(UMLResource.STANDARD_L3_PROFILE_URI).appendFragment("SystemModel-base_Model"));
			uriMap.put(URI.createURI(UML212UMLResource.STANDARD_PROFILE_URI).appendFragment("Model_SystemModel"), URI.createURI(UMLResource.STANDARD_L3_PROFILE_URI).appendFragment("Model_SystemModel"));
			uriMap.put(URI.createURI(UML212UMLResource.STANDARD_PROFILE_URI).appendFragment("Model_SystemModel-extension_SystemModel"), URI.createURI(UMLResource.STANDARD_L3_PROFILE_URI).appendFragment("Model_SystemModel-extension_SystemModel"));

			// Standard.profile.uml -> StandardL2.profile.uml
			uriMap.put(URI.createURI(UML212UMLResource.STANDARD_PROFILE_URI), URI.createURI(UMLResource.STANDARD_L2_PROFILE_URI));
		}

		return uriMap;
	}

	protected static Map<String, Map<EClassifier, String>> featureToTypeMap = null;

	public static Map<String, Map<EClassifier, String>> getFeatureToTypeMap() {

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

		return featureToTypeMap;
	}

	public UML212UMLExtendedMetaData(EPackage.Registry ePackageRegistry,
			Ecore2XMLRegistry ecore2xmlRegistry) {
		super(ePackageRegistry, ecore2xmlRegistry);
	}

}
