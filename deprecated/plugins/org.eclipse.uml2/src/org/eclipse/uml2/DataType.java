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

import java.util.Set;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2.DataType#getOwnedAttributes <em>Owned Attribute</em>}</li>
 *   <li>{@link org.eclipse.uml2.DataType#getOwnedOperations <em>Owned Operation</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.uml2.UML2Package#getDataType()
 * @model 
 * @generated
 */
public interface DataType extends Classifier{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) 2003, 2004 IBM Corporation and others."; //$NON-NLS-1$

	/**
	 * Returns the value of the '<em><b>Owned Attribute</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2.Property}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.uml2.Property#getDatatype <em>Datatype</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Attribute</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Attribute</em>' containment reference list.
	 * @see org.eclipse.uml2.UML2Package#getDataType_OwnedAttribute()
	 * @see org.eclipse.uml2.Property#getDatatype
	 * @model type="org.eclipse.uml2.Property" opposite="datatype" containment="true"
	 * @generated
	 */
	EList getOwnedAttributes();

    /**
     * Retrieves the {@link org.eclipse.uml2.Property} with the specified name from the '<em><b>Owned Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param unqualifiedName The unqualified name of the {@link org.eclipse.uml2.Property} to retrieve.
	 * @return The {@link org.eclipse.uml2.Property} with the specified name, or <code>null</code>.
	 * @see #getOwnedAttributes()
	 * @generated
     */
    Property getOwnedAttribute(String unqualifiedName);
      
    /**
     * Creates a {@link org.eclipse.uml2.Property} and appends it to the '<em><b>Owned Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param eClass The Ecore class of the {@link org.eclipse.uml2.Property} to create.
	 * @return The new {@link org.eclipse.uml2.Property}.
	 * @see #getOwnedAttributes()
	 * @generated
     */
    Property createOwnedAttribute(EClass eClass);

	/**
	 * Returns the value of the '<em><b>Owned Operation</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2.Operation}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.uml2.Operation#getDatatype <em>Datatype</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Operation</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Operation</em>' containment reference list.
	 * @see org.eclipse.uml2.UML2Package#getDataType_OwnedOperation()
	 * @see org.eclipse.uml2.Operation#getDatatype
	 * @model type="org.eclipse.uml2.Operation" opposite="datatype" containment="true"
	 * @generated
	 */
	EList getOwnedOperations();

    /**
     * Retrieves the {@link org.eclipse.uml2.Operation} with the specified name from the '<em><b>Owned Operation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param unqualifiedName The unqualified name of the {@link org.eclipse.uml2.Operation} to retrieve.
	 * @return The {@link org.eclipse.uml2.Operation} with the specified name, or <code>null</code>.
	 * @see #getOwnedOperations()
	 * @generated
     */
    Operation getOwnedOperation(String unqualifiedName);
      
    /**
     * Creates a {@link org.eclipse.uml2.Operation} and appends it to the '<em><b>Owned Operation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param eClass The Ecore class of the {@link org.eclipse.uml2.Operation} to create.
	 * @return The new {@link org.eclipse.uml2.Operation}.
	 * @see #getOwnedOperations()
	 * @generated
     */
    Operation createOwnedOperation(EClass eClass);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A query based on the following OCL expression:
	 * <code>
	 * inhs->excluding(inh |
	 * 	ownedMember->select(oclIsKindOf(RedefinableElement))->select(redefinedElement->includes(inh)))
	 * </code>
	 * <!-- end-model-doc -->
	 * @model dataType="org.eclipse.uml2.Set" parameters="org.eclipse.uml2.Set"
	 * @generated
	 */
	Set inherit(Set inhs);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model parameters=""
	 * @generated
	 */
	EList getOwnedMembers();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model parameters=""
	 * @generated
	 */
	EList getAttributes();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model parameters=""
	 * @generated
	 */
	EList getFeatures();

} // DataType
