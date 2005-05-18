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
 * $Id: InteractionOperand.java,v 1.7 2005/05/18 16:38:29 khussey Exp $
 */
package org.eclipse.uml2;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interaction Operand</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An InteractionOperand is contained in a CombinedFragment. An InteractionOperand represent one operand of the expression given by the enclosing CombinedFragment. An InteractionOperand is an InteractionFragment with an optional guard expression. An InteractionOperand may be guarded by a InteractionConstraint. Only InteractionOperands with a guard that evaluates to true at this point in the interaction will be considered for the production of the traces for the enclosing CombinedFragment. InteractionOperand contains an ordered set of InteractionFragments. 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2.InteractionOperand#getGuard <em>Guard</em>}</li>
 *   <li>{@link org.eclipse.uml2.InteractionOperand#getFragments <em>Fragment</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.uml2.UML2Package#getInteractionOperand()
 * @model
 * @generated
 */
public interface InteractionOperand extends Namespace, InteractionFragment{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) IBM Corporation and others."; //$NON-NLS-1$

	/**
	 * Returns the value of the '<em><b>Guard</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Guard</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * of the operand
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Guard</em>' containment reference.
	 * @see #setGuard(InteractionConstraint)
	 * @see org.eclipse.uml2.UML2Package#getInteractionOperand_Guard()
	 * @model containment="true"
	 * @generated
	 */
	InteractionConstraint getGuard();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.InteractionOperand#getGuard <em>Guard</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Guard</em>' containment reference.
	 * @see #getGuard()
	 * @generated
	 */
	void setGuard(InteractionConstraint value);


    /**
     * Creates a {@link org.eclipse.uml2.InteractionConstraint} and sets the '<em><b>Guard</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param eClass The Ecore class of the {@link org.eclipse.uml2.InteractionConstraint} to create.
	 * @return The new {@link org.eclipse.uml2.InteractionConstraint}.
	 * @see #getGuard()
	 * @generated NOT
	 * @deprecated Use #createGuard() instead.
     */
    InteractionConstraint createGuard(EClass eClass);

    /**
     * Creates a {@link org.eclipse.uml2.InteractionConstraint} and sets the '<em><b>Guard</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return The new {@link org.eclipse.uml2.InteractionConstraint}.
	 * @see #getGuard()
	 * @generated
     */
    InteractionConstraint createGuard();

	/**
	 * Returns the value of the '<em><b>Fragment</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2.InteractionFragment}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.uml2.InteractionFragment#getEnclosingOperand <em>Enclosing Operand</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fragment</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * fragments of the operand.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Fragment</em>' containment reference list.
	 * @see org.eclipse.uml2.UML2Package#getInteractionOperand_Fragment()
	 * @see org.eclipse.uml2.InteractionFragment#getEnclosingOperand
	 * @model type="org.eclipse.uml2.InteractionFragment" opposite="enclosingOperand" containment="true" ordered="false"
	 * @generated
	 */
	EList getFragments();


    /**
     * Retrieves the {@link org.eclipse.uml2.InteractionFragment} with the specified '<em><b>Name</b></em>' from the '<em><b>Fragment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.InteractionFragment} to retrieve.
	 * @return The {@link org.eclipse.uml2.InteractionFragment} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getFragments()
	 * @generated
     */
    InteractionFragment getFragment(String unqualifiedName);
      
    /**
     * Creates a {@link org.eclipse.uml2.InteractionFragment} and appends it to the '<em><b>Fragment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param eClass The Ecore class of the {@link org.eclipse.uml2.InteractionFragment} to create.
	 * @return The new {@link org.eclipse.uml2.InteractionFragment}.
	 * @see #getFragments()
	 * @generated
     */
    InteractionFragment createFragment(EClass eClass);

} // InteractionOperand
