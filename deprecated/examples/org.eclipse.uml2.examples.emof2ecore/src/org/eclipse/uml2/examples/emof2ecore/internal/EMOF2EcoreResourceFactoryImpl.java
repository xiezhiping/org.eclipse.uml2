/*
 * Copyright (c) 2004, 2006 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 * 
 * $Id: EMOF2EcoreResourceFactoryImpl.java,v 1.9 2006/02/07 16:40:10 khussey Exp $
 */
package org.eclipse.uml2.examples.emof2ecore.internal;

import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.EPackageRegistryImpl;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceFactoryImpl;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.ExtendedMetaData;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.mapping.ecore2xml.Ecore2XMLPackage;
import org.eclipse.emf.mapping.ecore2xml.Ecore2XMLRegistry;
import org.eclipse.emf.mapping.ecore2xml.impl.Ecore2XMLRegistryImpl;
import org.eclipse.emf.mapping.ecore2xml.util.Ecore2XMLExtendedMetaData;
import org.eclipse.uml2.examples.emof2ecore.EMOF2EcoreResource;
import org.eclipse.uml2.examples.emof2ecore.EMOF2EcoreResourceHandler;

/**
 * The <b>Resource Factory </b> associated with the package.
 * 
 */
public class EMOF2EcoreResourceFactoryImpl
		extends ResourceFactoryImpl
		implements EMOF2EcoreResource.Factory {

	public static final String copyright = "Copyright (c) IBM Corporation and others."; //$NON-NLS-1$

	/**
	 * Creates an instance of the resource factory.
	 * 
	 */
	public EMOF2EcoreResourceFactoryImpl() {
		super();
	}

	/**
	 * Creates an instance of the resource.
	 * 
	 */
	public Resource createResource(URI uri) {
		EMOF2EcoreResource resource = new EMOF2EcoreResourceImpl(uri);

		resource.setEncoding(EMOF2EcoreResource.DEFAULT_ENCODING);

		Map defaultLoadOptions = resource.getDefaultLoadOptions();

		defaultLoadOptions.put(XMLResource.OPTION_RECORD_UNKNOWN_FEATURE,
			Boolean.TRUE);

		EPackage.Registry ePackageRegistry = new EPackageRegistryImpl(
			EPackage.Registry.INSTANCE);
		ePackageRegistry.put(EMOF2EcoreResource.EMOF_NS_URI,
			EcorePackage.eINSTANCE);
		ePackageRegistry.put(
			"platform:/plugin/org.eclipse.emf.ecore/model/Ecore.ecore", //$NON-NLS-1$
			EcorePackage.eINSTANCE);

		ResourceSet resourceSet = new ResourceSetImpl();
		resourceSet.setPackageRegistry(ePackageRegistry);

		Ecore2XMLRegistry ecore2xmlRegistry = new Ecore2XMLRegistryImpl(
			Ecore2XMLRegistry.INSTANCE);
		ecore2xmlRegistry
			.put(
				EMOF2EcoreResource.EMOF_NS_URI,
				EcoreUtil
					.getObjectByType(
						resourceSet
							.getResource(
								URI
									.createURI("platform:/plugin/org.eclipse.uml2.examples.emof2ecore/model/EMOF_2_Ecore.ecore2xml"), //$NON-NLS-1$
								true).getContents(), Ecore2XMLPackage.eINSTANCE
							.getXMLMap()));

		ExtendedMetaData extendedMetaData = new Ecore2XMLExtendedMetaData(
			ePackageRegistry, ecore2xmlRegistry);

		resource.getDefaultLoadOptions().put(
			XMLResource.OPTION_EXTENDED_META_DATA, extendedMetaData);

		resource.getDefaultLoadOptions().put(
			XMLResource.OPTION_RESOURCE_HANDLER,
			new EMOF2EcoreResourceHandler());

		return resource;
	}

} // EMOF2EcoreResourceFactoryImpl
