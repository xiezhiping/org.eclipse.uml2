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
 * $Id: UML22UMLResourceFactoryImpl.java,v 1.4 2006/04/13 18:27:01 khussey Exp $
 */
package org.eclipse.uml2.uml.internal.resource;

import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EPackageRegistryImpl;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceFactoryImpl;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.ExtendedMetaData;
import org.eclipse.emf.ecore.xmi.XMIResource;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.mapping.ecore2xml.Ecore2XMLPackage;
import org.eclipse.emf.mapping.ecore2xml.Ecore2XMLRegistry;
import org.eclipse.emf.mapping.ecore2xml.impl.Ecore2XMLRegistryImpl;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.resource.UML22UMLExtendedMetadata;
import org.eclipse.uml2.uml.resource.UML22UMLResource;
import org.eclipse.uml2.uml.resource.UML22UMLResourceHandler;
import org.eclipse.uml2.uml.resource.UMLResource;

public class UML22UMLResourceFactoryImpl
		extends ResourceFactoryImpl
		implements UML22UMLResource.Factory {

	protected static final String UML2Package__eNS_URI = "http://www.eclipse.org/uml2/1.0.0/UML"; //$NON-NLS-1$

	public UML22UMLResourceFactoryImpl() {
		super();
	}

	public Resource createResource(URI uri) {
		UMLResource resource = new UML22UMLResourceImpl(uri);

		resource.setEncoding(UMLResource.DEFAULT_ENCODING);

		resource.setXMIVersion("2.1"); //$NON-NLS-1$

		Map defaultLoadOptions = resource.getDefaultLoadOptions();

		defaultLoadOptions.put(XMLResource.OPTION_DEFER_IDREF_RESOLUTION,
			Boolean.TRUE);

		defaultLoadOptions.put(XMLResource.OPTION_RECORD_UNKNOWN_FEATURE,
			Boolean.TRUE);

		EPackage.Registry ePackageRegistry = new EPackageRegistryImpl(
			EPackage.Registry.INSTANCE);
		ePackageRegistry.put(UML2Package__eNS_URI, UMLPackage.eINSTANCE);
		ePackageRegistry.put(
			"platform:/plugin/org.eclipse.uml2.uml/model/UML.ecore", //$NON-NLS-1$
			UMLPackage.eINSTANCE);

		ResourceSet resourceSet = new ResourceSetImpl();
		resourceSet.setPackageRegistry(ePackageRegistry);

		Ecore2XMLRegistry ecore2xmlRegistry = new Ecore2XMLRegistryImpl(
			Ecore2XMLRegistry.INSTANCE);
		ecore2xmlRegistry
			.put(
				UML2Package__eNS_URI,
				EcoreUtil
					.getObjectByType(
						resourceSet
							.getResource(
								URI
									.createURI("platform:/plugin/org.eclipse.uml2.uml/model/UML2_2_UML.ecore2xml"), //$NON-NLS-1$
								true).getContents(),
						Ecore2XMLPackage.Literals.XML_MAP));

		ExtendedMetaData extendedMetaData = new UML22UMLExtendedMetadata(
			ePackageRegistry, ecore2xmlRegistry);

		defaultLoadOptions.put(XMLResource.OPTION_EXTENDED_META_DATA,
			extendedMetaData);

		defaultLoadOptions.put(XMLResource.OPTION_RESOURCE_HANDLER,
			new UML22UMLResourceHandler());

		Map defaultSaveOptions = resource.getDefaultSaveOptions();

		defaultSaveOptions.put(XMLResource.OPTION_EXTENDED_META_DATA,
			Boolean.TRUE);
		defaultSaveOptions.put(XMLResource.OPTION_SAVE_TYPE_INFORMATION,
			Boolean.TRUE);
		defaultSaveOptions.put(XMIResource.OPTION_USE_XMI_TYPE, Boolean.TRUE);
		defaultSaveOptions
			.put(XMLResource.OPTION_SCHEMA_LOCATION, Boolean.TRUE);

		return resource;
	}

}
