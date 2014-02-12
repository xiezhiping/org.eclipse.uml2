/*
 * Copyright (c) 2005, 2014 IBM Corporation, Embarcadero Technologies, CEA, and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *   Kenn Hussey (Embarcadero Technologies) - 156879, 204200
 *   Kenn Hussey (CEA) - 327039, 418466
 *
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

	String ECORE_PRIMITIVE_TYPES_LIBRARY_URI = LIBRARIES_PATHMAP + "EcorePrimitiveTypes." + LIBRARY_FILE_EXTENSION; //$NON-NLS-1$

	String XML_PRIMITIVE_TYPES_LIBRARY_URI = LIBRARIES_PATHMAP + "XMLPrimitiveTypes." + LIBRARY_FILE_EXTENSION; //$NON-NLS-1$

	String JAVA_PRIMITIVE_TYPES_LIBRARY_URI = LIBRARIES_PATHMAP + "JavaPrimitiveTypes." + LIBRARY_FILE_EXTENSION; //$NON-NLS-1$

	String UML_PRIMITIVE_TYPES_LIBRARY_URI = LIBRARIES_PATHMAP + "UMLPrimitiveTypes." + LIBRARY_FILE_EXTENSION; //$NON-NLS-1$

	String METAMODEL_FILE_EXTENSION = "metamodel." + FILE_EXTENSION; //$NON-NLS-1$

	String METAMODELS_PATHMAP = "pathmap://UML_METAMODELS/"; //$NON-NLS-1$

	String ECORE_METAMODEL_URI = METAMODELS_PATHMAP + "Ecore." + METAMODEL_FILE_EXTENSION; //$NON-NLS-1$

	String UML_METAMODEL_URI = METAMODELS_PATHMAP + "UML." + METAMODEL_FILE_EXTENSION; //$NON-NLS-1$

	String PROFILE_FILE_EXTENSION = "profile." + FILE_EXTENSION; //$NON-NLS-1$

	String PROFILES_PATHMAP = "pathmap://UML_PROFILES/"; //$NON-NLS-1$

	String ECORE_PROFILE_NS_URI = "http://www.eclipse.org/uml2/schemas/Ecore/5"; //$NON-NLS-1$

	String ECORE_PROFILE_URI = PROFILES_PATHMAP + "Ecore." + PROFILE_FILE_EXTENSION; //$NON-NLS-1$

	String STANDARD_PROFILE_NS_URI = "http://www.eclipse.org/uml2/5.0.0/UML/Profile/Standard"; //$NON-NLS-1$

	String STANDARD_PROFILE_URI = PROFILES_PATHMAP + "Standard." + PROFILE_FILE_EXTENSION; //$NON-NLS-1$

	String UML_2_0_0_CONTENT_TYPE_IDENTIFIER = "org.eclipse.uml2.uml_2_0_0"; //$NON-NLS-1$
	
	String UML_2_1_0_CONTENT_TYPE_IDENTIFIER = "org.eclipse.uml2.uml_2_1_0"; //$NON-NLS-1$

	String UML_3_0_0_CONTENT_TYPE_IDENTIFIER = "org.eclipse.uml2.uml_3_0_0"; //$NON-NLS-1$

	String UML_4_0_0_CONTENT_TYPE_IDENTIFIER = "org.eclipse.uml2.uml_4_0_0"; //$NON-NLS-1$

	String UML_5_0_0_CONTENT_TYPE_IDENTIFIER = "org.eclipse.uml2.uml_5_0_0"; //$NON-NLS-1$

	String UML_CONTENT_TYPE_IDENTIFIER = UML_5_0_0_CONTENT_TYPE_IDENTIFIER;

	String UML2_PROFILE_NS_URI = "http://www.eclipse.org/uml2/schemas/UML2/2"; //$NON-NLS-1$

	String UML2_PROFILE_URI = PROFILES_PATHMAP + "UML2." + PROFILE_FILE_EXTENSION; //$NON-NLS-1$

} // UMLResource
