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
 * $Id: XMI2UMLResourceFactoryImpl.java,v 1.1 2006/04/26 15:48:53 khussey Exp $
 */
package org.eclipse.uml2.uml.internal.resource;

import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.ExtendedMetaData;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.XMLSave;
import org.eclipse.uml2.uml.resource.XMI2UMLExtendedMetaData;
import org.eclipse.uml2.uml.resource.XMI2UMLResource;

public class XMI2UMLResourceFactoryImpl
		extends UMLResourceFactoryImpl
		implements XMI2UMLResource.Factory {

	public XMI2UMLResourceFactoryImpl() {
		super();
	}

	public Resource createResourceGen(URI uri) {
		XMI2UMLResource result = new XMI2UMLResourceImpl(uri);
		result.setEncoding(XMI2UMLResource.DEFAULT_ENCODING);
		return result;
	}

	public Resource createResource(URI uri) {
		XMI2UMLResource resource = (XMI2UMLResource) super.createResource(uri);

		ExtendedMetaData extendedMetaData = new XMI2UMLExtendedMetaData(
			EPackage.Registry.INSTANCE);

		resource.getDefaultLoadOptions().put(XMLResource.OPTION_EXTENDED_META_DATA, extendedMetaData);

		Map defaultSaveOptions = resource.getDefaultSaveOptions();

		defaultSaveOptions.put(XMLResource.OPTION_EXTENDED_META_DATA, extendedMetaData);
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

		return resource;
	}

}
