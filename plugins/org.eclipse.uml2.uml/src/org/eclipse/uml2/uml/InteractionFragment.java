/*
 * Copyright (c) 2005, 2015 IBM Corporation, CEA, and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *   Kenn Hussey (CEA) - 327039, 418466, 451350
 *   Christian W. Damus (CEA) - 251963
 *
 */
package org.eclipse.uml2.uml;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interaction Fragment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * InteractionFragment is an abstract notion of the most general interaction unit. An InteractionFragment is a piece of an Interaction. Each InteractionFragment is conceptually like an Interaction by itself.
 * <p>From package UML::Interactions.</p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.InteractionFragment#getCovereds <em>Covered</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.InteractionFragment#getEnclosingOperand <em>Enclosing Operand</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.InteractionFragment#getEnclosingInteraction <em>Enclosing Interaction</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.InteractionFragment#getGeneralOrderings <em>General Ordering</em>}</li>
 * </ul>
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
	 * <p>From package UML::Interactions.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Covered</em>' reference list.
	 * @see org.eclipse.uml2.uml.UMLPackage#getInteractionFragment_Covered()
	 * @see org.eclipse.uml2.uml.Lifeline#getCoveredBys
	 * @model opposite="coveredBy" ordered="false"
	 * @generated
	 */
	EList<Lifeline> getCovereds();

	/**
	 * Retrieves the first {@link org.eclipse.uml2.uml.Lifeline} with the specified '<em><b>Name</b></em>' from the '<em><b>Covered</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.Lifeline} to retrieve, or <code>null</code>.
	 * @return The first {@link org.eclipse.uml2.uml.Lifeline} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getCovereds()
	 * @generated
	 */
	Lifeline getCovered(String name);

	/**
	 * Retrieves the first {@link org.eclipse.uml2.uml.Lifeline} with the specified '<em><b>Name</b></em>' from the '<em><b>Covered</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.Lifeline} to retrieve, or <code>null</code>.
	 * @param ignoreCase Whether to ignore case in {@link java.lang.String} comparisons.
	 * @return The first {@link org.eclipse.uml2.uml.Lifeline} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getCovereds()
	 * @generated
	 */
	Lifeline getCovered(String name, boolean ignoreCase);

	/**
	 * Returns the value of the '<em><b>General Ordering</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.GeneralOrdering}.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.eclipse.uml2.uml.Element#getOwnedElements() <em>Owned Element</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The general ordering relationships contained in this fragment.
	 * <p>From package UML::Interactions.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>General Ordering</em>' containment reference list.
	 * @see org.eclipse.uml2.uml.UMLPackage#getInteractionFragment_GeneralOrdering()
	 * @model containment="true" resolveProxies="true" ordered="false"
	 * @generated
	 */
	EList<GeneralOrdering> getGeneralOrderings();

	/**
	 * Creates a new {@link org.eclipse.uml2.uml.GeneralOrdering}, with the specified '<em><b>Name</b></em>', and appends it to the '<em><b>General Ordering</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' for the new {@link org.eclipse.uml2.uml.GeneralOrdering}, or <code>null</code>.
	 * @return The new {@link org.eclipse.uml2.uml.GeneralOrdering}.
	 * @see #getGeneralOrderings()
	 * @generated
	 */
	GeneralOrdering createGeneralOrdering(String name);

	/**
	 * Retrieves the first {@link org.eclipse.uml2.uml.GeneralOrdering} with the specified '<em><b>Name</b></em>' from the '<em><b>General Ordering</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.GeneralOrdering} to retrieve, or <code>null</code>.
	 * @return The first {@link org.eclipse.uml2.uml.GeneralOrdering} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getGeneralOrderings()
	 * @generated
	 */
	GeneralOrdering getGeneralOrdering(String name);

	/**
	 * Retrieves the first {@link org.eclipse.uml2.uml.GeneralOrdering} with the specified '<em><b>Name</b></em>' from the '<em><b>General Ordering</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.GeneralOrdering} to retrieve, or <code>null</code>.
	 * @param ignoreCase Whether to ignore case in {@link java.lang.String} comparisons.
	 * @param createOnDemand Whether to create a {@link org.eclipse.uml2.uml.GeneralOrdering} on demand if not found.
	 * @return The first {@link org.eclipse.uml2.uml.GeneralOrdering} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getGeneralOrderings()
	 * @generated
	 */
	GeneralOrdering getGeneralOrdering(String name, boolean ignoreCase,
			boolean createOnDemand);

	/**
	 * Returns the value of the '<em><b>Enclosing Interaction</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.uml2.uml.Interaction#getFragments <em>Fragment</em>}'.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.eclipse.uml2.uml.NamedElement#getNamespace() <em>Namespace</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Interaction enclosing this InteractionFragment.
	 * <p>From package UML::Interactions.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Enclosing Interaction</em>' container reference.
	 * @see #setEnclosingInteraction(Interaction)
	 * @see org.eclipse.uml2.uml.UMLPackage#getInteractionFragment_EnclosingInteraction()
	 * @see org.eclipse.uml2.uml.Interaction#getFragments
	 * @model opposite="fragment" transient="false" ordered="false"
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
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.eclipse.uml2.uml.NamedElement#getNamespace() <em>Namespace</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The operand enclosing this InteractionFragment (they may nest recursively).
	 * <p>From package UML::Interactions.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Enclosing Operand</em>' container reference.
	 * @see #setEnclosingOperand(InteractionOperand)
	 * @see org.eclipse.uml2.uml.UMLPackage#getInteractionFragment_EnclosingOperand()
	 * @see org.eclipse.uml2.uml.InteractionOperand#getFragments
	 * @model opposite="fragment" transient="false" ordered="false"
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
