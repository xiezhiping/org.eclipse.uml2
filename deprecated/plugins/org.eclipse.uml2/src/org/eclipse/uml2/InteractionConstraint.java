/*
 * Copyright (c) 2003, 2005 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *
 * $Id: InteractionConstraint.java,v 1.6 2005/05/18 16:38:31 khussey Exp $
 */
package org.eclipse.uml2;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interaction Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An InteractionConstraint is a boolean expression that guards an operand in a CombinedFragment. InteractionConstraint is a specialization of Constraint. Furthermore the InteractionConstraint contains two expressions designating the minimum and maximum number of times a loop CombinedFragment should execute. 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2.InteractionConstraint#getMinint <em>Minint</em>}</li>
 *   <li>{@link org.eclipse.uml2.InteractionConstraint#getMaxint <em>Maxint</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.uml2.UML2Package#getInteractionConstraint()
 * @model
 * @generated
 */
public interface InteractionConstraint extends Constraint{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) IBM Corporation and others."; //$NON-NLS-1$

	/**
	 * Returns the value of the '<em><b>Minint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Minint</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * minimum number of iterations of a loop
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Minint</em>' containment reference.
	 * @see #setMinint(ValueSpecification)
	 * @see org.eclipse.uml2.UML2Package#getInteractionConstraint_Minint()
	 * @model containment="true"
	 * @generated
	 */
	ValueSpecification getMinint();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.InteractionConstraint#getMinint <em>Minint</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Minint</em>' containment reference.
	 * @see #getMinint()
	 * @generated
	 */
	void setMinint(ValueSpecification value);


    /**
     * Creates a {@link org.eclipse.uml2.ValueSpecification} and sets the '<em><b>Minint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param eClass The Ecore class of the {@link org.eclipse.uml2.ValueSpecification} to create.
	 * @return The new {@link org.eclipse.uml2.ValueSpecification}.
	 * @see #getMinint()
	 * @generated
     */
    ValueSpecification createMinint(EClass eClass);

	/**
	 * Returns the value of the '<em><b>Maxint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Maxint</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * maximum number of iterations of a loop
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Maxint</em>' containment reference.
	 * @see #setMaxint(ValueSpecification)
	 * @see org.eclipse.uml2.UML2Package#getInteractionConstraint_Maxint()
	 * @model containment="true"
	 * @generated
	 */
	ValueSpecification getMaxint();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.InteractionConstraint#getMaxint <em>Maxint</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Maxint</em>' containment reference.
	 * @see #getMaxint()
	 * @generated
	 */
	void setMaxint(ValueSpecification value);


    /**
     * Creates a {@link org.eclipse.uml2.ValueSpecification} and sets the '<em><b>Maxint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param eClass The Ecore class of the {@link org.eclipse.uml2.ValueSpecification} to create.
	 * @return The new {@link org.eclipse.uml2.ValueSpecification}.
	 * @see #getMaxint()
	 * @generated
     */
    ValueSpecification createMaxint(EClass eClass);

} // InteractionConstraint
