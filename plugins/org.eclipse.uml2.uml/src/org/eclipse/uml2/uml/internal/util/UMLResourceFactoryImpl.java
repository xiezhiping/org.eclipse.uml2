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
 * $Id: UMLResourceFactoryImpl.java,v 1.1 2005/11/14 22:26:08 khussey Exp $
 */
package org.eclipse.uml2.uml.internal.util;

import org.eclipse.emf.common.util.URI;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.resource.impl.ResourceFactoryImpl;
import org.eclipse.uml2.uml.util.UMLResource;

/**
 * <!-- begin-user-doc -->
 * The <b>Resource Factory</b> associated with the package.
 * <!-- end-user-doc -->
 * @see org.eclipse.uml2.uml.internal.util.UMLResourceImpl
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
	public Resource createResource(URI uri) {
		UMLResource result = new UMLResourceImpl(uri);
		result.setEncoding(UMLResource.DEFAULT_ENCODING);
		return result;
	}

} //UMLResourceFactoryImpl
