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
 * $Id: UMLResource.java,v 1.3 2005/12/22 20:20:13 khussey Exp $
 */
package org.eclipse.uml2.uml.resource;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.xmi.XMIResource;
import org.eclipse.uml2.uml.internal.resource.UMLResourceFactoryImpl;

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

	String LIBRARY_FILE_EXTENSION = "library." + FILE_EXTENSION; //$NON-NLS-1$

	String LIBRARIES_PATHMAP = "pathmap://UML_LIBRARIES/"; //$NON-NLS-1$

	String ECORE_PRIMITIVE_TYPES_LIBRARY_URI = LIBRARIES_PATHMAP
		+ "EcorePrimitiveTypes." + LIBRARY_FILE_EXTENSION; //$NON-NLS-1$

	String JAVA_PRIMITIVE_TYPES_LIBRARY_URI = LIBRARIES_PATHMAP
		+ "JavaPrimitiveTypes." + LIBRARY_FILE_EXTENSION; //$NON-NLS-1$

	String UML_PRIMITIVE_TYPES_LIBRARY_URI = LIBRARIES_PATHMAP
		+ "UMLPrimitiveTypes." + LIBRARY_FILE_EXTENSION; //$NON-NLS-1$

	String METAMODEL_FILE_EXTENSION = "metamodel." + FILE_EXTENSION; //$NON-NLS-1$

	String METAMODELS_PATHMAP = "pathmap://UML_METAMODELS/"; //$NON-NLS-1$

	String ECORE_METAMODEL_URI = METAMODELS_PATHMAP + "Ecore." //$NON-NLS-1$
		+ METAMODEL_FILE_EXTENSION;

	String UML_METAMODEL_URI = METAMODELS_PATHMAP + "UML." //$NON-NLS-1$
		+ METAMODEL_FILE_EXTENSION;

	String PROFILE_FILE_EXTENSION = "profile." + FILE_EXTENSION; //$NON-NLS-1$

	String PROFILES_PATHMAP = "pathmap://UML_PROFILES/"; //$NON-NLS-1$

	String UML_PROFILE_URI = PROFILES_PATHMAP + "UML." //$NON-NLS-1$
		+ PROFILE_FILE_EXTENSION;

	String ECORE_PROFILE_URI = PROFILES_PATHMAP + "Ecore." //$NON-NLS-1$
		+ PROFILE_FILE_EXTENSION;

} //UMLResource