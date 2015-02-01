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

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameter Set</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A ParameterSet designates alternative sets of inputs or outputs that a Behavior may use.
 * <p>From package UML::Classification.</p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.ParameterSet#getConditions <em>Condition</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.ParameterSet#getParameters <em>Parameter</em>}</li>
 * </ul>
 *
 * @see org.eclipse.uml2.uml.UMLPackage#getParameterSet()
 * @model
 * @generated
 */
public interface ParameterSet
		extends NamedElement {

	/**
	 * Returns the value of the '<em><b>Parameter</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.Parameter}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.uml2.uml.Parameter#getParameterSets <em>Parameter Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Parameters in the ParameterSet.
	 * <p>From package UML::Classification.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Parameter</em>' reference list.
	 * @see org.eclipse.uml2.uml.UMLPackage#getParameterSet_Parameter()
	 * @see org.eclipse.uml2.uml.Parameter#getParameterSets
	 * @model opposite="parameterSet" required="true" ordered="false"
	 * @generated
	 */
	EList<Parameter> getParameters();

	/**
	 * Retrieves the first {@link org.eclipse.uml2.uml.Parameter} with the specified '<em><b>Name</b></em>', and '<em><b>Type</b></em>' from the '<em><b>Parameter</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.Parameter} to retrieve, or <code>null</code>.
	 * @param type The '<em><b>Type</b></em>' of the {@link org.eclipse.uml2.uml.Parameter} to retrieve, or <code>null</code>.
	 * @return The first {@link org.eclipse.uml2.uml.Parameter} with the specified '<em><b>Name</b></em>', and '<em><b>Type</b></em>', or <code>null</code>.
	 * @see #getParameters()
	 * @generated
	 */
	Parameter getParameter(String name, Type type);

	/**
	 * Retrieves the first {@link org.eclipse.uml2.uml.Parameter} with the specified '<em><b>Name</b></em>', and '<em><b>Type</b></em>' from the '<em><b>Parameter</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.Parameter} to retrieve, or <code>null</code>.
	 * @param type The '<em><b>Type</b></em>' of the {@link org.eclipse.uml2.uml.Parameter} to retrieve, or <code>null</code>.
	 * @param ignoreCase Whether to ignore case in {@link java.lang.String} comparisons.
	 * @return The first {@link org.eclipse.uml2.uml.Parameter} with the specified '<em><b>Name</b></em>', and '<em><b>Type</b></em>', or <code>null</code>.
	 * @see #getParameters()
	 * @generated
	 */
	Parameter getParameter(String name, Type type, boolean ignoreCase);

	/**
	 * Returns the value of the '<em><b>Condition</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.Constraint}.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.eclipse.uml2.uml.Element#getOwnedElements() <em>Owned Element</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A constraint that should be satisfied for the owner of the Parameters in an input ParameterSet to start execution using the values provided for those Parameters, or the owner of the Parameters in an output ParameterSet to end execution providing the values for those Parameters, if all preconditions and conditions on input ParameterSets were satisfied.
	 * <p>From package UML::Classification.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Condition</em>' containment reference list.
	 * @see org.eclipse.uml2.uml.UMLPackage#getParameterSet_Condition()
	 * @model containment="true" resolveProxies="true" ordered="false"
	 * @generated
	 */
	EList<Constraint> getConditions();

	/**
	 * Creates a new {@link org.eclipse.uml2.uml.Constraint}, with the specified '<em><b>Name</b></em>', and appends it to the '<em><b>Condition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' for the new {@link org.eclipse.uml2.uml.Constraint}, or <code>null</code>.
	 * @param eClass The Ecore class of the {@link org.eclipse.uml2.uml.Constraint} to create.
	 * @return The new {@link org.eclipse.uml2.uml.Constraint}.
	 * @see #getConditions()
	 * @generated
	 */
	Constraint createCondition(String name, EClass eClass);

	/**
	 * Creates a new {@link org.eclipse.uml2.uml.Constraint}, with the specified '<em><b>Name</b></em>', and appends it to the '<em><b>Condition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' for the new {@link org.eclipse.uml2.uml.Constraint}, or <code>null</code>.
	 * @return The new {@link org.eclipse.uml2.uml.Constraint}.
	 * @see #getConditions()
	 * @generated
	 */
	Constraint createCondition(String name);

	/**
	 * Retrieves the first {@link org.eclipse.uml2.uml.Constraint} with the specified '<em><b>Name</b></em>' from the '<em><b>Condition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.Constraint} to retrieve, or <code>null</code>.
	 * @return The first {@link org.eclipse.uml2.uml.Constraint} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getConditions()
	 * @generated
	 */
	Constraint getCondition(String name);

	/**
	 * Retrieves the first {@link org.eclipse.uml2.uml.Constraint} with the specified '<em><b>Name</b></em>' from the '<em><b>Condition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.Constraint} to retrieve, or <code>null</code>.
	 * @param ignoreCase Whether to ignore case in {@link java.lang.String} comparisons.
	 * @param eClass The Ecore class of the {@link org.eclipse.uml2.uml.Constraint} to retrieve, or <code>null</code>.
	 * @param createOnDemand Whether to create a {@link org.eclipse.uml2.uml.Constraint} on demand if not found.
	 * @return The first {@link org.eclipse.uml2.uml.Constraint} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getConditions()
	 * @generated
	 */
	Constraint getCondition(String name, boolean ignoreCase, EClass eClass,
			boolean createOnDemand);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Parameters in a ParameterSet must all be inputs or all be outputs of the same parameterized entity, and the ParameterSet is owned by that entity.
	 * parameter->forAll(p1, p2 | self.owner = p1.owner and self.owner = p2.owner and p1.direction = p2.direction)
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validateSameParameterizedEntity(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If a parameterized entity has input Parameters that are in a ParameterSet, then any inputs that are not in a ParameterSet must be streaming. Same for output Parameters.
	 * ((parameter->exists(direction = ParameterDirectionKind::_'in')) implies 
	 *     behavioralFeature.ownedParameter->select(p | p.direction = ParameterDirectionKind::_'in' and p.parameterSet->isEmpty())->forAll(isStream))
	 *     and
	 * ((parameter->exists(direction = ParameterDirectionKind::out)) implies 
	 *     behavioralFeature.ownedParameter->select(p | p.direction = ParameterDirectionKind::out and p.parameterSet->isEmpty())->forAll(isStream))
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validateInput(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Two ParameterSets cannot have exactly the same set of Parameters.
	 * parameter->forAll(parameterSet->forAll(s1, s2 | s1->size() = s2->size() implies s1.parameter->exists(p | not s2.parameter->includes(p))))
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validateTwoParameterSets(DiagnosticChain diagnostics,
			Map<Object, Object> context);

} // ParameterSet
