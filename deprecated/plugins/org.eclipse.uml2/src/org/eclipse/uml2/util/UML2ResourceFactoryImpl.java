/*
 * Copyright (c) 2003, 2004 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Common Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/cpl-v10.html
 *
 * Contributors:
 *   IBM - Initial API and implementation
 *
 * $Id: UML2ResourceFactoryImpl.java,v 1.7 2004/05/20 03:20:08 khussey Exp $
 */
package org.eclipse.uml2.util;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.XMIResource;
import org.eclipse.emf.ecore.xmi.XMLResource;

/**
 * <!-- begin-user-doc -->
 * The <b>Resource Factory</b> associated with the package.
 * <!-- end-user-doc -->
 * @see org.eclipse.uml2.util.UML2ResourceImpl
 * @generated
 */
public class UML2ResourceFactoryImpl extends ResourceFactoryImpl {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2003, 2004 IBM Corporation and others."; //$NON-NLS-1$

	/**
	 * Creates an instance of the resource factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UML2ResourceFactoryImpl() {
		super();
	}

	/**
	 * Creates an instance of the resource.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Resource createResourceGen(URI uri) {
		Resource result = new UML2ResourceImpl(uri);
		return result;
	}
	public Resource createResource(URI uri) {
		XMIResource resource = (XMIResource) createResourceGen(uri);

		resource.setEncoding(UML2Resource.DEFAULT_ENCODING);
		resource.getDefaultSaveOptions().put(
			XMLResource.OPTION_SCHEMA_LOCATION, Boolean.TRUE);

		return resource;
	}

} //UML2ResourceFactoryImpl
