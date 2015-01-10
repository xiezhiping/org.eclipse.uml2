/*
 * Copyright (c) 2005, 2015 IBM Corporation, CEA, and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *   Kenn Hussey (CEA) - 394623, 212765, 451350
 *
 */
package org.eclipse.uml2.codegen.ecore.genmodel;

import java.util.List;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gen Package</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.uml2.codegen.ecore.genmodel.GenPackage#isResourceInterfaces <em>Resource Interfaces</em>}</li>
 *   <li>{@link org.eclipse.uml2.codegen.ecore.genmodel.GenPackage#getOperationsPackage <em>Operations Package</em>}</li>
 * </ul>
 *
 * @see org.eclipse.uml2.codegen.ecore.genmodel.GenModelPackage#getGenPackage()
 * @model
 * @generated
 */
public interface GenPackage
		extends org.eclipse.emf.codegen.ecore.genmodel.GenPackage, GenBase {

	/**
	 * Returns the value of the '<em><b>Resource Interfaces</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resource Interfaces</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource Interfaces</em>' attribute.
	 * @see #setResourceInterfaces(boolean)
	 * @see org.eclipse.uml2.codegen.ecore.genmodel.GenModelPackage#getGenPackage_ResourceInterfaces()
	 * @model
	 * @generated
	 */
	boolean isResourceInterfaces();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.codegen.ecore.genmodel.GenPackage#isResourceInterfaces <em>Resource Interfaces</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resource Interfaces</em>' attribute.
	 * @see #isResourceInterfaces()
	 * @generated
	 */
	void setResourceInterfaces(boolean value);

	/**
	 * Returns the value of the '<em><b>Operations Package</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operations Package</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operations Package</em>' attribute.
	 * @see #setOperationsPackage(String)
	 * @see org.eclipse.uml2.codegen.ecore.genmodel.GenModelPackage#getGenPackage_OperationsPackage()
	 * @model
	 * @generated
	 */
	String getOperationsPackage();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.codegen.ecore.genmodel.GenPackage#getOperationsPackage <em>Operations Package</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operations Package</em>' attribute.
	 * @see #getOperationsPackage()
	 * @generated
	 */
	void setOperationsPackage(String value);

	String getOperationsPackageName();

	boolean isOperationsClasses();

	String getResourceInterfaceName();

	String getQualifiedResourceInterfaceName();

	String getImportedResourceInterfaceName();

	String getImportedResourceBaseInterfaceName();

	String getImportedResourceFactoryInterfaceName();

	String getImportedResourceFactoryBaseInterfaceName();

	boolean isXMLResource();

	/**
	 * @since 1.9
	 */
	String getDerivedUnionAdapterClassName();

	/**
	 * @since 1.9
	 */
	String getQualifiedDerivedUnionAdapterClassName();

	/**
	 * @since 1.9
	 */
	List<org.eclipse.emf.codegen.ecore.genmodel.GenClass> getDerivedUnionAdapterGenClasses();

	/**
	 * @since 1.9
	 */
	boolean hasMultiplicityRedefinitions();

} // GenPackage
