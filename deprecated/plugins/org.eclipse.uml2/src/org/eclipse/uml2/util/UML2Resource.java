/*
 * Copyright (c) 2004, 2005 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *
 * $Id: UML2Resource.java,v 1.9 2005/05/18 16:38:32 khussey Exp $
 */
package org.eclipse.uml2.util;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.xmi.XMIResource;

import org.eclipse.uml2.UML2Package;

import org.eclipse.uml2.internal.util.UML2ResourceFactoryImpl;

/**
 * <!-- begin-user-doc -->
 * The resource associated with the '<em><b>uml2</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public interface UML2Resource extends XMIResource {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) IBM Corporation and others."; //$NON-NLS-1$

	/**
	 * <!-- begin-user-doc -->
	 * The factory for '<em><b>uml2</b></em>' resources.
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public interface Factory
			extends Resource.Factory {

		/**
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated NOT
		 */
		public static final Factory INSTANCE = new UML2ResourceFactoryImpl();

	}

	/**
	 * <!-- begin-user-doc -->
	 * The file extension for '<em><b>uml2</b></em>' resources.
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String FILE_EXTENSION = "uml2"; //$NON-NLS-1$

	/**
	 * <!-- begin-user-doc -->
	 * The default encoding for '<em><b>uml2</b></em>' resources.
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String DEFAULT_ENCODING = "UTF-8"; //$NON-NLS-1$

	/**
	 * The scheme for platform URIs.
	 */
	public static final String URI_SCHEME_PLATFORM = "platform"; //$NON-NLS-1$

	/**
	 * The first segment for platform plugin URIs.
	 */
	public static final String URI_SEGMENT_PLUGIN = "plugin"; //$NON-NLS-1$

	/**
	 * @deprecated Use UML2Package.eNS_URI instead.
	 */
	public static final String UML2_NS_URI = UML2Package.eNS_URI; //$NON-NLS-1$

	public static final String METAMODEL_FILE_EXTENSION = "metamodel." //$NON-NLS-1$
		+ FILE_EXTENSION;

	public static final String METAMODELS_PATHMAP = "pathmap://UML2_METAMODELS/"; //$NON-NLS-1$

	public static final String ECORE_METAMODEL_URI = METAMODELS_PATHMAP
		+ "Ecore." + METAMODEL_FILE_EXTENSION; //$NON-NLS-1$

	public static final String UML2_METAMODEL_URI = METAMODELS_PATHMAP
		+ "UML2." + METAMODEL_FILE_EXTENSION; //$NON-NLS-1$

	public static final String LIBRARY_FILE_EXTENSION = "library." //$NON-NLS-1$
		+ FILE_EXTENSION;

	public static final String LIBRARIES_PATHMAP = "pathmap://UML2_LIBRARIES/"; //$NON-NLS-1$

	public static final String ECORE_PRIMITIVE_TYPES_LIBRARY_URI = LIBRARIES_PATHMAP
		+ "EcorePrimitiveTypes." + LIBRARY_FILE_EXTENSION; //$NON-NLS-1$

	public static final String JAVA_PRIMITIVE_TYPES_LIBRARY_URI = LIBRARIES_PATHMAP
		+ "JavaPrimitiveTypes." + LIBRARY_FILE_EXTENSION; //$NON-NLS-1$

	public static final String UML2_PRIMITIVE_TYPES_LIBRARY_URI = LIBRARIES_PATHMAP
		+ "UML2PrimitiveTypes." + LIBRARY_FILE_EXTENSION; //$NON-NLS-1$

	public static final String PROFILE_FILE_EXTENSION = "profile." //$NON-NLS-1$
		+ FILE_EXTENSION;

	public static final String PROFILES_PATHMAP = "pathmap://UML2_PROFILES/"; //$NON-NLS-1$

	public static final String BASIC_PROFILE_URI = PROFILES_PATHMAP + "Basic." //$NON-NLS-1$
		+ PROFILE_FILE_EXTENSION;

	public static final String INTERMEDIATE_PROFILE_URI = PROFILES_PATHMAP
		+ "Intermediate." + PROFILE_FILE_EXTENSION; //$NON-NLS-1$

	public static final String COMPLETE_PROFILE_URI = PROFILES_PATHMAP
		+ "Complete." + PROFILE_FILE_EXTENSION; //$NON-NLS-1$

	public static final String ECORE_PROFILE_URI = PROFILES_PATHMAP
		+ "Ecore." + PROFILE_FILE_EXTENSION; //$NON-NLS-1$

	/**
	 * The standard extension for properties files.
	 */
	public static final String PROPERTIES_FILE_EXTENSION = "properties"; //$NON-NLS-1$

} //UML2Resource