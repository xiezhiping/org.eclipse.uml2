/*
 * Copyright (c) 2008 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *
 * $Id: UML212UMLExtendedMetaData.java,v 1.2 2008/11/04 14:29:52 khussey Exp $
 */
package org.eclipse.uml2.uml.resource;

import java.util.HashMap;
import java.util.Map;

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
