/*
 * Copyright (c) 2005 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *
 * $Id: InteractionFragment.java,v 1.1 2005/11/14 22:25:58 khussey Exp $
 */
package org.eclipse.uml2.uml;

import java.util.List;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interaction Fragment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * InteractionFragment is an abstract notion of the most general interaction unit. An interaction fragment is a piece of an interaction. Each interaction fragment is conceptually like an interaction by itself. InteractionFragment is an abstract class and a specialization of NamedElement.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.InteractionFragment#getCovereds <em>Covered</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.InteractionFragment#getGeneralOrderings <em>General Ordering</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.InteractionFragment#getEnclosingInteraction <em>Enclosing Interaction</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.InteractionFragment#getEnclosingOperand <em>Enclosing Operand</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.uml2.uml.UMLPackage#getInteractionFragment()
 * @model abstract="true"
 * @generated
 */
public interface InteractionFragment
		extends NamedElement {

	/**
	 * Returns the value of the '<em><b>Covered</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.Lifeline}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.uml2.uml.Lifeline#getCoveredBys <em>Covered By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * References the Lifelines that the InteractionFragment involves.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Covered</em>' reference list.
	 * @see org.eclipse.uml2.uml.UMLPackage#getInteractionFragment_Covered()
	 * @see org.eclipse.uml2.uml.Lifeline#getCoveredBys
	 * @model type="org.eclipse.uml2.uml.Lifeline" opposite="coveredBy" ordered="false"
	 * @generated
	 */
	List getCovereds();

	/**
	 * Retrieves the {@link org.eclipse.uml2.uml.Lifeline} with the specified '<em><b>Name</b></em>' from the '<em><b>Covered</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.Lifeline} to retrieve.
	 * @return The {@link org.eclipse.uml2.uml.Lifeline} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getCovereds()
	 * @generated
	 */
	Lifeline getCovered(String name);

	/**
	 * Returns the value of the '<em><b>General Ordering</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.GeneralOrdering}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The general ordering relationships contained in this fragment.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>General Ordering</em>' containment reference list.
	 * @see org.eclipse.uml2.uml.UMLPackage#getInteractionFragment_GeneralOrdering()
	 * @model type="org.eclipse.uml2.uml.GeneralOrdering" containment="true" resolveProxies="false" ordered="false"
	 * @generated
	 */
	List getGeneralOrderings();

	/**
	 * Creates a {@link org.eclipse.uml2.uml.GeneralOrdering} and appends it to the '<em><b>General Ordering</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return The new {@link org.eclipse.uml2.uml.GeneralOrdering}.
	 * @see #getGeneralOrderings()
	 * @generated
	 */
	GeneralOrdering createGeneralOrdering();

	/**
	 * Retrieves the {@link org.eclipse.uml2.uml.GeneralOrdering} with the specified '<em><b>Name</b></em>' from the '<em><b>General Ordering</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.GeneralOrdering} to retrieve.
	 * @return The {@link org.eclipse.uml2.uml.GeneralOrdering} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getGeneralOrderings()
	 * @generated
	 */
	GeneralOrdering getGeneralOrdering(String name);

	/**
	 * Returns the value of the '<em><b>Enclosing Interaction</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.uml2.uml.Interaction#getFragments <em>Fragment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Interaction enclosing this InteractionFragment.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Enclosing Interaction</em>' container reference.
	 * @see #setEnclosingInteraction(Interaction)
	 * @see org.eclipse.uml2.uml.UMLPackage#getInteractionFragment_EnclosingInteraction()
	 * @see org.eclipse.uml2.uml.Interaction#getFragments
	 * @model opposite="fragment" ordered="false"
	 * @generated
	 */
	Interaction getEnclosingInteraction();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.uml.InteractionFragment#getEnclosingInteraction <em>Enclosing Interaction</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enclosing Interaction</em>' container reference.
	 * @see #getEnclosingInteraction()
	 * @generated
	 */
	void setEnclosingInteraction(Interaction value);

	/**
	 * Returns the value of the '<em><b>Enclosing Operand</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.uml2.uml.InteractionOperand#getFragments <em>Fragment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The operand enclosing this InteractionFragment (they may nest recursively)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Enclosing Operand</em>' container reference.
	 * @see #setEnclosingOperand(InteractionOperand)
	 * @see org.eclipse.uml2.uml.UMLPackage#getInteractionFragment_EnclosingOperand()
	 * @see org.eclipse.uml2.uml.InteractionOperand#getFragments
	 * @model opposite="fragment" ordered="false"
	 * @generated
	 */
	InteractionOperand getEnclosingOperand();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.uml.InteractionFragment#getEnclosingOperand <em>Enclosing Operand</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enclosing Operand</em>' container reference.
	 * @see #getEnclosingOperand()
	 * @generated
	 */
	void setEnclosingOperand(InteractionOperand value);

} // InteractionFragment
