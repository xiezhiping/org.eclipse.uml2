/*
 * Copyright (c) 2014 CEA and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Kenn Hussey (CEA) - initial API and implementation
 *   Christian W. Damus (CEA) - 433149
 *
 */
package org.eclipse.uml2.uml.internal.resource;

import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EPackageRegistryImpl;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.ExtendedMetaData;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.uml2.uml.resource.UML402UMLExtendedMetaData;
import org.eclipse.uml2.uml.resource.UML402UMLResource;
import org.eclipse.uml2.uml.resource.UML402UMLResourceHandler;
import org.eclipse.uml2.uml.resource.UMLResource;

/**
 * Resource factory that converts .uml models.
 * <ul>
 * <li>OMG: UML 2.4.x and UML 2.5</li>
 * <li>API: UML2 4.x and UML2 5.0</li>
 * </ul>
 * 
 * @since 5.0
 */
public class UML402UMLResourceFactoryImpl
		extends UMLResourceFactoryImpl
		implements UML402UMLResource.Factory {

	public UML402UMLResourceFactoryImpl() {
		super();
	}

	@Override
	public Resource createResourceGen(URI uri) {
		UML402UMLResource result = new UML402UMLResourceImpl(uri);
		result.setEncoding(UML402UMLResource.DEFAULT_ENCODING);
		return result;
	}

	@Override
	public Resource createResource(URI uri) {
		UMLResource resource = (UMLResource) super.createResource(uri);

		Map<Object, Object> defaultLoadOptions = resource
			.getDefaultLoadOptions();

		EPackage.Registry ePackageRegistry = new EPackageRegistryImpl(
			EPackage.Registry.INSTANCE);
		ExtendedMetaData extendedMetaData = new UML402UMLExtendedMetaData(
			ePackageRegistry);

		defaultLoadOptions.put(XMLResource.OPTION_EXTENDED_META_DATA,
			extendedMetaData);
		defaultLoadOptions.put(XMLResource.OPTION_LAX_FEATURE_PROCESSING,
			Boolean.FALSE);
		defaultLoadOptions.put(XMLResource.OPTION_RESOURCE_HANDLER,
			new UML402UMLResourceHandler());

		return resource;
	}

}
