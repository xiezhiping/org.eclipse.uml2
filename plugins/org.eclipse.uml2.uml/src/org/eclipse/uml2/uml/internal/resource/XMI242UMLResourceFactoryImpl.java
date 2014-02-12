/*
 * Copyright (c) 2014 CEA and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   CEA - initial API and implementation
 *
 */
package org.eclipse.uml2.uml.internal.resource;

import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.ExtendedMetaData;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.uml2.uml.resource.CMOF2UMLResourceHandler;
import org.eclipse.uml2.uml.resource.UML402UMLExtendedMetaData;
import org.eclipse.uml2.uml.resource.UML402UMLResourceHandler;
import org.eclipse.uml2.uml.resource.XMI242UMLResource;
import org.eclipse.uml2.uml.resource.XMI2UMLExtendedMetaData;
import org.eclipse.uml2.uml.resource.XMI2UMLResource;

/**
 * Resource factory that converts .xmi models.
 * OMG:  UML 2.4.x and UML 2.5
 * API:  UML2 4.x and UML2 5.0
 * 
 * @since 5.0
 */
public class XMI242UMLResourceFactoryImpl
		extends UMLResourceFactoryImpl
		implements XMI242UMLResource.Factory {

	public XMI242UMLResourceFactoryImpl() {
		super();
	}

	@Override
	public Resource createResourceGen(URI uri) {
		XMI242UMLResource result = new XMI242UMLResourceImpl(uri);
		result.setEncoding(XMI2UMLResource.DEFAULT_ENCODING);
		return result;
	}

	@Override
	public Resource createResource(URI uri) {
		XMI242UMLResource resource = (XMI242UMLResource) super
			.createResource(uri);

		ExtendedMetaData xmiExtendedMetaData = new XMI2UMLExtendedMetaData(
			EPackage.Registry.INSTANCE);

		Map<Object, Object> defaultSaveOptions = resource
			.getDefaultSaveOptions();

		defaultSaveOptions.put(XMLResource.OPTION_EXTENDED_META_DATA,
			xmiExtendedMetaData);
		defaultSaveOptions.put(XMLResource.OPTION_SAVE_TYPE_INFORMATION,
			Boolean.TRUE);

		ExtendedMetaData extendedMetaData = new UML402UMLExtendedMetaData(
			EPackage.Registry.INSTANCE);

		Map<Object, Object> defaultLoadOptions = resource
			.getDefaultLoadOptions();

		defaultLoadOptions.put(XMLResource.OPTION_EXTENDED_META_DATA,
			extendedMetaData);
		defaultLoadOptions.put(XMLResource.OPTION_LAX_FEATURE_PROCESSING,
			Boolean.FALSE);
		defaultLoadOptions.put(XMLResource.OPTION_RESOURCE_HANDLER,
			new CMOF2UMLResourceHandler(new UML402UMLResourceHandler()));

		return resource;
	}
}
