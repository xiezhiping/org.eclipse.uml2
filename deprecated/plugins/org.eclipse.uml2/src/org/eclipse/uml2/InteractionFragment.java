/*
 * Copyright (c) 2003, 2004 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Common Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/cpl-v10.html
 *
 * Contributors:
 *   IBM - Initial API and implementation
 *
 * $Id: InteractionFragment.java,v 1.3 2004/05/11 15:24:00 khussey Exp $
 */
package org.eclipse.uml2;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interaction Fragment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An InteractionFragment is a general class that holds the common parts of CompositeFragment, AtomicFragment and InteractionExpressionOperand.
 * Conceptually it is very much the same as a full sequence diagram, but a fragment is not named and must be referred then through structure.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2.InteractionFragment#getCovereds <em>Covered</em>}</li>
 *   <li>{@link org.eclipse.uml2.InteractionFragment#getGeneralOrderings <em>General Ordering</em>}</li>
 *   <li>{@link org.eclipse.uml2.InteractionFragment#getEnclosingInteraction <em>Enclosing Interaction</em>}</li>
 *   <li>{@link org.eclipse.uml2.InteractionFragment#getEnclosingOperand <em>Enclosing Operand</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.uml2.UML2Package#getInteractionFragment()
 * @model abstract="true"
 * @generated
 */
public interface InteractionFragment extends NamedElement{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) 2003, 2004 IBM Corporation and others."; //$NON-NLS-1$

	/**
	 * Returns the value of the '<em><b>Covered</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.Lifeline}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.uml2.Lifeline#getCoveredBys <em>Covered By</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Covered</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Covered</em>' reference list.
	 * @see org.eclipse.uml2.UML2Package#getInteractionFragment_Covered()
	 * @see org.eclipse.uml2.Lifeline#getCoveredBys
	 * @model type="org.eclipse.uml2.Lifeline" opposite="coveredBy" volatile="true" ordered="false"
	 * @generated
	 */
	EList getCovereds();

    /**
     * Retrieves the {@link org.eclipse.uml2.Lifeline} with the specified name from the '<em><b>Covered</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param unqualifiedName The unqualified name of the {@link org.eclipse.uml2.Lifeline} to retrieve.
	 * @return The {@link org.eclipse.uml2.Lifeline} with the specified name, or <code>null</code>.
	 * @see #getCovereds()
	 * @generated
     */
    Lifeline getCovered(String unqualifiedName);
      
	/**
	 * Returns the value of the '<em><b>General Ordering</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2.GeneralOrdering}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>General Ordering</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>General Ordering</em>' containment reference list.
	 * @see org.eclipse.uml2.UML2Package#getInteractionFragment_GeneralOrdering()
	 * @model type="org.eclipse.uml2.GeneralOrdering" containment="true" ordered="false"
	 * @generated
	 */
	EList getGeneralOrderings();

    /**
     * Retrieves the {@link org.eclipse.uml2.GeneralOrdering} with the specified name from the '<em><b>General Ordering</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param unqualifiedName The unqualified name of the {@link org.eclipse.uml2.GeneralOrdering} to retrieve.
	 * @return The {@link org.eclipse.uml2.GeneralOrdering} with the specified name, or <code>null</code>.
	 * @see #getGeneralOrderings()
	 * @generated
     */
    GeneralOrdering getGeneralOrdering(String unqualifiedName);
      
    /**
     * Creates a {@link org.eclipse.uml2.GeneralOrdering} and appends it to the '<em><b>General Ordering</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param eClass The Ecore class of the {@link org.eclipse.uml2.GeneralOrdering} to create.
	 * @return The new {@link org.eclipse.uml2.GeneralOrdering}.
	 * @see #getGeneralOrderings()
	 * @generated
     */
    GeneralOrdering createGeneralOrdering(EClass eClass);

	/**
	 * Returns the value of the '<em><b>Enclosing Interaction</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.uml2.Interaction#getFragments <em>Fragment</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Enclosing Interaction</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enclosing Interaction</em>' container reference.
	 * @see #setEnclosingInteraction(Interaction)
	 * @see org.eclipse.uml2.UML2Package#getInteractionFragment_EnclosingInteraction()
	 * @see org.eclipse.uml2.Interaction#getFragments
	 * @model opposite="fragment"
	 * @generated
	 */
	Interaction getEnclosingInteraction();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.InteractionFragment#getEnclosingInteraction <em>Enclosing Interaction</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enclosing Interaction</em>' container reference.
	 * @see #getEnclosingInteraction()
	 * @generated
	 */
	void setEnclosingInteraction(Interaction value);

	/**
	 * Returns the value of the '<em><b>Enclosing Operand</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.uml2.InteractionOperand#getFragments <em>Fragment</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Enclosing Operand</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enclosing Operand</em>' container reference.
	 * @see #setEnclosingOperand(InteractionOperand)
	 * @see org.eclipse.uml2.UML2Package#getInteractionFragment_EnclosingOperand()
	 * @see org.eclipse.uml2.InteractionOperand#getFragments
	 * @model opposite="fragment"
	 * @generated
	 */
	InteractionOperand getEnclosingOperand();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.InteractionFragment#getEnclosingOperand <em>Enclosing Operand</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enclosing Operand</em>' container reference.
	 * @see #getEnclosingOperand()
	 * @generated
	 */
	void setEnclosingOperand(InteractionOperand value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model parameters=""
	 * @generated
	 */
	EList getOwnedElements();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model parameters=""
	 * @generated
	 */
	Namespace getNamespace();

} // InteractionFragment
