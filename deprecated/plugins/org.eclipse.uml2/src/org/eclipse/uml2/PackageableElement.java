/*
 * Copyright (c) 2003, 2004 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Common Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/cpl-v10.html
 *
 * Contributors:
 *   IBM - Initial API and implementation
 */
package org.eclipse.uml2;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Packageable Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2.PackageableElement#getPackageableElement_visibility <em>Packageable Element visibility</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.uml2.UML2Package#getPackageableElement()
 * @model abstract="true"
 * @generated
 */
public interface PackageableElement extends NamedElement, ParameterableElement{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) 2003, 2004 IBM Corporation and others."; //$NON-NLS-1$

	/**
	 * Returns the value of the '<em><b>Packageable Element visibility</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.uml2.VisibilityKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Packageable Element visibility</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Packageable Element visibility</em>' attribute.
	 * @see org.eclipse.uml2.VisibilityKind
	 * @see #setPackageableElement_visibility(VisibilityKind)
	 * @see org.eclipse.uml2.UML2Package#getPackageableElement_PackageableElement_visibility()
	 * @model volatile="true"
	 * @generated
	 */
	VisibilityKind getPackageableElement_visibility();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.PackageableElement#getPackageableElement_visibility <em>Packageable Element visibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Packageable Element visibility</em>' attribute.
	 * @see org.eclipse.uml2.VisibilityKind
	 * @see #getPackageableElement_visibility()
	 * @generated
	 */
	void setPackageableElement_visibility(VisibilityKind value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model parameters=""
	 * @generated
	 */
	VisibilityKind getVisibility();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model 
	 * @generated
	 */
	void setVisibility(VisibilityKind value);

} // PackageableElement
