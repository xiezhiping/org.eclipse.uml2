/*
 * Copyright (c) 2005 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *
 * $Id: UMLResourceFactoryImpl.java,v 1.1 2005/12/07 14:17:51 khussey Exp $
 */
package org.eclipse.uml2.uml.internal.resource;

import java.util.Map;

import org.eclipse.emf.common.util.URI;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.resource.impl.ResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.XMIResource;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.XMLSave;
import org.eclipse.uml2.uml.resource.UMLResource;

/**
 * <!-- begin-user-doc -->
 * The <b>Resource Factory</b> associated with the package.
 * <!-- end-user-doc -->
 * @see org.eclipse.uml2.uml.internal.resource.UMLResourceImpl
 * @generated
 */
public class UMLResourceFactoryImpl
		extends ResourceFactoryImpl
		implements UMLResource.Factory {

	/**
	 * Creates an instance of the resource factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UMLResourceFactoryImpl() {
		super();
	}

	/**
	 * Creates an instance of the resource.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Resource createResourceGen(URI uri) {
		UMLResource result = new UMLResourceImpl(uri);
		result.setEncoding(UMLResource.DEFAULT_ENCODING);
		return result;
	}

	public Resource createResource(URI uri) {
		UMLResource resource = (UMLResource) createResourceGen(uri);

		resource.setXMIVersion("2.1"); //$NON-NLS-1$

		Map defaultLoadOptions = resource.getDefaultLoadOptions();

		defaultLoadOptions.put(XMIResource.OPTION_EXTENDED_META_DATA,
			Boolean.TRUE);
		defaultLoadOptions.put(XMIResource.OPTION_LAX_FEATURE_PROCESSING,
			Boolean.TRUE);

		Map defaultSaveOptions = resource.getDefaultSaveOptions();

		defaultSaveOptions.put(XMIResource.OPTION_EXTENDED_META_DATA,
			Boolean.TRUE);
		defaultSaveOptions.put(XMLResource.OPTION_SAVE_TYPE_INFORMATION,
			new XMLSave.XMLTypeInfo() {

				public boolean shouldSaveType(EClass objectType,
						EClassifier featureType, EStructuralFeature feature) {
					return true;
				}

				public boolean shouldSaveType(EClass objectType,
						EClass featureType, EStructuralFeature feature) {
					return true;
				}

			});
		defaultSaveOptions.put(XMIResource.OPTION_USE_XMI_TYPE, Boolean.TRUE);
		defaultSaveOptions
			.put(XMLResource.OPTION_SCHEMA_LOCATION, Boolean.TRUE);

		return resource;
	}


	
} //UMLResourceFactoryImpl
