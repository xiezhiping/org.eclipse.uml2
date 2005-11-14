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
 * $Id: UMLResource.java,v 1.1 2005/11/14 22:26:08 khussey Exp $
 */
package org.eclipse.uml2.uml.util;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.xmi.XMIResource;
import org.eclipse.uml2.uml.internal.util.UMLResourceFactoryImpl;

/**
 * <!-- begin-user-doc -->
 * The resource associated with the '<em><b>uml</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public interface UMLResource
		extends XMIResource {

	/**
	 * <!-- begin-user-doc -->
	 * The factory for '<em><b>uml</b></em>' resources.
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public interface Factory
			extends Resource.Factory {

		/**
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final Factory INSTANCE = new UMLResourceFactoryImpl();

	}

	/**
	 * <!-- begin-user-doc -->
	 * The file extension for '<em><b>uml</b></em>' resources.
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String FILE_EXTENSION = "uml"; //$NON-NLS-1$

	/**
	 * <!-- begin-user-doc -->
	 * The default encoding for '<em><b>uml</b></em>' resources.
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String DEFAULT_ENCODING = "UTF-8"; //$NON-NLS-1$

} //UMLResource