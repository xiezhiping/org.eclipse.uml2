/*
 * Copyright (c) 2004 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 * 
 * $Id: EMOF2EcoreResourceFactoryImpl.java,v 1.3 2005/03/15 18:54:19 khussey Exp $
 */
package org.eclipse.uml2.examples.emof2ecore.internal;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.EPackageRegistryImpl;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceFactoryImpl;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.ExtendedMetaData;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.uml2.examples.emof2ecore.EMOF2EcorePostProcessor;
import org.eclipse.uml2.examples.emof2ecore.EMOF2EcoreResource;
import org.eclipse.uml2.mapping.ecore2xml.Ecore2XMLPackage;
import org.eclipse.uml2.mapping.ecore2xml.Ecore2XMLRegistry;
import org.eclipse.uml2.mapping.ecore2xml.impl.Ecore2XMLRegistryImpl;
import org.eclipse.uml2.mapping.ecore2xml.util.Ecore2XMLExtendedMetaData;

/**
 * The <b>Resource Factory </b> associated with the package.
 * 
 */
public class EMOF2EcoreResourceFactoryImpl
		extends ResourceFactoryImpl
		implements EMOF2EcoreResource.Factory {

	public static final String copyright = "Copyright (c) 2004 IBM Corporation and others."; //$NON-NLS-1$

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

		resource.getDefaultLoadOptions().put(
			XMLResource.OPTION_RECORD_UNKNOWN_FEATURE, Boolean.TRUE);

		EPackage.Registry ePackageRegistry = new EPackageRegistryImpl(
			EPackage.Registry.INSTANCE);
		ePackageRegistry.put(EMOF2EcoreResource.EMOF_NS_URI,
			EcorePackage.eINSTANCE);

		Ecore2XMLRegistry ecore2xmlRegistry = new Ecore2XMLRegistryImpl(
			Ecore2XMLRegistry.INSTANCE);
		ecore2xmlRegistry
			.put(
				EMOF2EcoreResource.EMOF_NS_URI,
				EcoreUtil
					.getObjectByType(
						new ResourceSetImpl()
							.getResource(
								URI
									.createURI("platform:/plugin/org.eclipse.uml2.examples.emof2ecore/EMOF_2_Ecore.ecore2xml"),
								true).getContents(), Ecore2XMLPackage.eINSTANCE
							.getXMLMap()));

		ExtendedMetaData extendedMetaData = new Ecore2XMLExtendedMetaData(
			ePackageRegistry, ecore2xmlRegistry);

		resource.getDefaultLoadOptions().put(
			XMLResource.OPTION_EXTENDED_META_DATA, extendedMetaData);

		resource.getDefaultLoadOptions().put(
			EMOF2EcoreResource.OPTION_POST_PROCESSOR,
			new EMOF2EcorePostProcessor());

		return resource;
	}

} // EMOF2EcoreResourceFactoryImpl
