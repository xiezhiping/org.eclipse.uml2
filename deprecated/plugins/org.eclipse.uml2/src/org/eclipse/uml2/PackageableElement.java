/*
 * Copyright (c) 2003, 2004 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *
 * $Id: PackageableElement.java,v 1.9 2005/11/09 22:53:10 khussey Exp $
 */
package org.eclipse.uml2;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Packageable Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A packageable element indicates a named element that may be owned directly by a package. 
 * <!-- end-model-doc -->
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
	String copyright = "Copyright (c) IBM Corporation and others."; //$NON-NLS-1$

	/**
	 * Returns the value of the '<em><b>Packageable Element visibility</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.uml2.VisibilityKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Packageable Element visibility</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates that packageable elements must always have a visibility, i.e., visibility is not optional. Redefines NamedElement::visibility.
	 * <!-- end-model-doc -->
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


} // PackageableElement
