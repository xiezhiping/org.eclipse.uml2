/*
 * Copyright (c) 2004 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Common Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/cpl-v10.html
 *
 * Contributors:
 *   IBM - Initial API and implementation
 * 
 * $Id: EMOF2EcoreResourceFactoryImpl.java,v 1.1 2004/12/21 21:22:00 khussey Exp $
 */
package org.eclipse.uml2.examples.emof2ecore.internal.util;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceFactoryImpl;
import org.eclipse.emf.ecore.util.ExtendedMetaData;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.uml2.examples.emof2ecore.util.EMOF2EcorePostProcessor;
import org.eclipse.uml2.examples.emof2ecore.util.EMOF2EcoreResource;
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

		ExtendedMetaData extendedMetaData = new Ecore2XMLExtendedMetaData();

		resource.getDefaultLoadOptions().put(
			XMLResource.OPTION_EXTENDED_META_DATA, extendedMetaData);

		resource.getDefaultLoadOptions().put(
			EMOF2EcoreResource.OPTION_POST_PROCESSOR,
			new EMOF2EcorePostProcessor());

		return resource;
	}

} // EMOF2EcoreResourceFactoryImpl
