/*
 * Copyright (c) 2003, 2006 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *
 * $Id: Slot.java,v 1.12 2006/05/26 18:16:51 khussey Exp $
 */
package org.eclipse.uml2;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Slot</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A slot is owned by an instance specification. It specifies the value or values for its defining feature, which must be a structural feature of a classifier of the instance specification owning the slot. 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2.Slot#getOwningInstance <em>Owning Instance</em>}</li>
 *   <li>{@link org.eclipse.uml2.Slot#getValues <em>Value</em>}</li>
 *   <li>{@link org.eclipse.uml2.Slot#getDefiningFeature <em>Defining Feature</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.uml2.UML2Package#getSlot()
 * @model
 * @generated
 */
public interface Slot extends Element {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) IBM Corporation and others."; //$NON-NLS-1$

	/**
	 * Returns the value of the '<em><b>Owning Instance</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.uml2.InstanceSpecification#getSlots <em>Slot</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owning Instance</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The instance specification that owns this slot. Subsets Element::owner.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owning Instance</em>' container reference.
	 * @see #setOwningInstance(InstanceSpecification)
	 * @see org.eclipse.uml2.UML2Package#getSlot_OwningInstance()
	 * @see org.eclipse.uml2.InstanceSpecification#getSlots
	 * @model opposite="slot" required="true"
	 * @generated
	 */
	InstanceSpecification getOwningInstance();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.Slot#getOwningInstance <em>Owning Instance</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owning Instance</em>' container reference.
	 * @see #getOwningInstance()
	 * @generated
	 */
	void setOwningInstance(InstanceSpecification value);


	/**
	 * Returns the value of the '<em><b>Value</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2.ValueSpecification}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' containment reference list.
	 * @see org.eclipse.uml2.UML2Package#getSlot_Value()
	 * @model type="org.eclipse.uml2.ValueSpecification" containment="true"
	 * @generated
	 */
	EList getValues();


	/**
	 * Retrieves the first {@link org.eclipse.uml2.ValueSpecification} with the specified '<em><b>Name</b></em>' from the '<em><b>Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.ValueSpecification} to retrieve, or <code>null</code>.
	 * @return The first {@link org.eclipse.uml2.ValueSpecification} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getValues()
	 * @generated
	 */
    ValueSpecification getValue(String name);

	/**
	 * Retrieves the first {@link org.eclipse.uml2.ValueSpecification} with the specified '<em><b>Name</b></em>' from the '<em><b>Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.ValueSpecification} to retrieve, or <code>null</code>.
	 * @param ignoreCase Whether to ignore case in {@link java.lang.String} comparisons.
	 * @param eClass The Ecore class of the {@link org.eclipse.uml2.ValueSpecification} to retrieve, or <code>null</code>.
	 * @return The first {@link org.eclipse.uml2.ValueSpecification} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getValues()
	 * @generated
	 */
	ValueSpecification getValue(String name, boolean ignoreCase, EClass eClass);

	/**
	 * Creates a {@link org.eclipse.uml2.ValueSpecification} and appends it to the '<em><b>Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param eClass The Ecore class of the {@link org.eclipse.uml2.ValueSpecification} to create.
	 * @return The new {@link org.eclipse.uml2.ValueSpecification}.
	 * @see #getValues()
	 * @generated NOT
	 */
    ValueSpecification createValue(EClass eClass);

	/**
	 * Returns the value of the '<em><b>Defining Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Defining Feature</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The structural feature that specifies the values that may be held by the slot.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Defining Feature</em>' reference.
	 * @see #setDefiningFeature(StructuralFeature)
	 * @see org.eclipse.uml2.UML2Package#getSlot_DefiningFeature()
	 * @model required="true"
	 * @generated
	 */
	StructuralFeature getDefiningFeature();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.Slot#getDefiningFeature <em>Defining Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Defining Feature</em>' reference.
	 * @see #getDefiningFeature()
	 * @generated
	 */
	void setDefiningFeature(StructuralFeature value);



} // Slot
