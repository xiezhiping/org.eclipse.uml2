/*
 * Copyright (c) 2005, 2016 IBM Corporation, CEA, and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *   Kenn Hussey (CEA) - 327039, 383550, 386251, 418466, 485756
 *   Christian W. Damus (CEA) - 251963, 451350
 *
 */
package org.eclipse.uml2.uml;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Behavior</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Behavior is a specification of how its context BehavioredClassifier changes state over time. This specification may be either a definition of possible behavior execution or emergent behavior, or a selective illustration of an interesting subset of possible executions. The latter form is typically used for capturing examples, such as a trace of a particular execution.
 * <p>From package UML::CommonBehavior.</p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.Behavior#getSpecification <em>Specification</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Behavior#getContext <em>Context</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Behavior#isReentrant <em>Is Reentrant</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Behavior#getOwnedParameters <em>Owned Parameter</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Behavior#getOwnedParameterSets <em>Owned Parameter Set</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Behavior#getPostconditions <em>Postcondition</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Behavior#getPreconditions <em>Precondition</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Behavior#getRedefinedBehaviors <em>Redefined Behavior</em>}</li>
 * </ul>
 *
 * @see org.eclipse.uml2.uml.UMLPackage#getBehavior()
 * @model abstract="true"
 * @generated
 */
public interface Behavior
		extends org.eclipse.uml2.uml.Class {

	/**
	 * Returns the value of the '<em><b>Is Reentrant</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Tells whether the Behavior can be invoked while it is still executing from a previous invocation.
	 * <p>From package UML::CommonBehavior.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Reentrant</em>' attribute.
	 * @see #isSetIsReentrant()
	 * @see #unsetIsReentrant()
	 * @see #setIsReentrant(boolean)
	 * @see org.eclipse.uml2.uml.UMLPackage#getBehavior_IsReentrant()
	 * @model default="true" unsettable="true" dataType="org.eclipse.uml2.types.Boolean" ordered="false"
	 * @generated
	 */
	boolean isReentrant();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.uml.Behavior#isReentrant <em>Is Reentrant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Reentrant</em>' attribute.
	 * @see #isSetIsReentrant()
	 * @see #unsetIsReentrant()
	 * @see #isReentrant()
	 * @generated
	 */
	void setIsReentrant(boolean value);

	/**
	 * Unsets the value of the '{@link org.eclipse.uml2.uml.Behavior#isReentrant <em>Is Reentrant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIsReentrant()
	 * @see #isReentrant()
	 * @see #setIsReentrant(boolean)
	 * @generated
	 */
	void unsetIsReentrant();

	/**
	 * Returns whether the value of the '{@link org.eclipse.uml2.uml.Behavior#isReentrant <em>Is Reentrant</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Is Reentrant</em>' attribute is set.
	 * @see #unsetIsReentrant()
	 * @see #isReentrant()
	 * @see #setIsReentrant(boolean)
	 * @generated
	 */
	boolean isSetIsReentrant();

	/**
	 * Returns the value of the '<em><b>Redefined Behavior</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.Behavior}.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.eclipse.uml2.uml.Classifier#getRedefinedClassifiers() <em>Redefined Classifier</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * References the Behavior that this Behavior redefines. A subtype of Behavior may redefine any other subtype of Behavior. If the Behavior implements a BehavioralFeature, it replaces the redefined Behavior. If the Behavior is a classifierBehavior, it extends the redefined Behavior.
	 * <p>From package UML::CommonBehavior.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Redefined Behavior</em>' reference list.
	 * @see org.eclipse.uml2.uml.UMLPackage#getBehavior_RedefinedBehavior()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Behavior> getRedefinedBehaviors();

	/**
	 * Retrieves the first {@link org.eclipse.uml2.uml.Behavior} with the specified '<em><b>Name</b></em>' from the '<em><b>Redefined Behavior</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.Behavior} to retrieve, or <code>null</code>.
	 * @return The first {@link org.eclipse.uml2.uml.Behavior} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getRedefinedBehaviors()
	 * @generated
	 */
	Behavior getRedefinedBehavior(String name);

	/**
	 * Retrieves the first {@link org.eclipse.uml2.uml.Behavior} with the specified '<em><b>Name</b></em>' from the '<em><b>Redefined Behavior</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.Behavior} to retrieve, or <code>null</code>.
	 * @param ignoreCase Whether to ignore case in {@link java.lang.String} comparisons.
	 * @param eClass The Ecore class of the {@link org.eclipse.uml2.uml.Behavior} to retrieve, or <code>null</code>.
	 * @return The first {@link org.eclipse.uml2.uml.Behavior} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getRedefinedBehaviors()
	 * @generated
	 */
	Behavior getRedefinedBehavior(String name, boolean ignoreCase,
			EClass eClass);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * There may be at most one Behavior for a given pairing of BehavioredClassifier (as owner of the Behavior) and BehavioralFeature (as specification of the Behavior).
	 * specification <> null implies _'context'.ownedBehavior->select(specification=self.specification)->size() = 1
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validateMostOneBehavior(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * Returns the value of the '<em><b>Owned Parameter</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.Parameter}.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.eclipse.uml2.uml.Namespace#getOwnedMembers() <em>Owned Member</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * References a list of Parameters to the Behavior which describes the order and type of arguments that can be given when the Behavior is invoked and of the values which will be returned when the Behavior completes its execution.
	 * <p>From package UML::CommonBehavior.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned Parameter</em>' containment reference list.
	 * @see org.eclipse.uml2.uml.UMLPackage#getBehavior_OwnedParameter()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	EList<Parameter> getOwnedParameters();

	/**
	 * Creates a new {@link org.eclipse.uml2.uml.Parameter}, with the specified '<em><b>Name</b></em>', and '<em><b>Type</b></em>', and appends it to the '<em><b>Owned Parameter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' for the new {@link org.eclipse.uml2.uml.Parameter}, or <code>null</code>.
	 * @param type The '<em><b>Type</b></em>' for the new {@link org.eclipse.uml2.uml.Parameter}, or <code>null</code>.
	 * @return The new {@link org.eclipse.uml2.uml.Parameter}.
	 * @see #getOwnedParameters()
	 * @generated
	 */
	Parameter createOwnedParameter(String name, Type type);

	/**
	 * Retrieves the first {@link org.eclipse.uml2.uml.Parameter} with the specified '<em><b>Name</b></em>', and '<em><b>Type</b></em>' from the '<em><b>Owned Parameter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.Parameter} to retrieve, or <code>null</code>.
	 * @param type The '<em><b>Type</b></em>' of the {@link org.eclipse.uml2.uml.Parameter} to retrieve, or <code>null</code>.
	 * @return The first {@link org.eclipse.uml2.uml.Parameter} with the specified '<em><b>Name</b></em>', and '<em><b>Type</b></em>', or <code>null</code>.
	 * @see #getOwnedParameters()
	 * @generated
	 */
	Parameter getOwnedParameter(String name, Type type);

	/**
	 * Retrieves the first {@link org.eclipse.uml2.uml.Parameter} with the specified '<em><b>Name</b></em>', and '<em><b>Type</b></em>' from the '<em><b>Owned Parameter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.Parameter} to retrieve, or <code>null</code>.
	 * @param type The '<em><b>Type</b></em>' of the {@link org.eclipse.uml2.uml.Parameter} to retrieve, or <code>null</code>.
	 * @param ignoreCase Whether to ignore case in {@link java.lang.String} comparisons.
	 * @param createOnDemand Whether to create a {@link org.eclipse.uml2.uml.Parameter} on demand if not found.
	 * @return The first {@link org.eclipse.uml2.uml.Parameter} with the specified '<em><b>Name</b></em>', and '<em><b>Type</b></em>', or <code>null</code>.
	 * @see #getOwnedParameters()
	 * @generated
	 */
	Parameter getOwnedParameter(String name, Type type, boolean ignoreCase,
			boolean createOnDemand);

	/**
	 * Returns the value of the '<em><b>Context</b></em>' reference.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.eclipse.uml2.uml.RedefinableElement#getRedefinitionContexts() <em>Redefinition Context</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The BehavioredClassifier that is the context for the execution of the Behavior. A Behavior that is directly owned as a nestedClassifier does not have a context. Otherwise, to determine the context of a Behavior, find the first BehavioredClassifier reached by following the chain of owner relationships from the Behavior, if any. If there is such a BehavioredClassifier, then it is the context, unless it is itself a Behavior with a non-empty context, in which case that is also the context for the original Behavior. For example, following this algorithm, the context of an entry Behavior in a StateMachine is the BehavioredClassifier that owns the StateMachine. The features of the context BehavioredClassifier as well as the Elements visible to the context Classifier are visible to the Behavior.
	 * <p>From package UML::CommonBehavior.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Context</em>' reference.
	 * @see org.eclipse.uml2.uml.UMLPackage#getBehavior_Context()
	 * @model transient="true" changeable="false" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	BehavioredClassifier getContext();

	/**
	 * Returns the value of the '<em><b>Precondition</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.Constraint}.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.eclipse.uml2.uml.Namespace#getOwnedRules() <em>Owned Rule</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An optional set of Constraints specifying what must be fulfilled before the Behavior is invoked.
	 * <p>From package UML::CommonBehavior.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Precondition</em>' reference list.
	 * @see org.eclipse.uml2.uml.UMLPackage#getBehavior_Precondition()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Constraint> getPreconditions();

	/**
	 * Creates a new {@link org.eclipse.uml2.uml.Constraint}, with the specified '<em><b>Name</b></em>', and appends it to the '<em><b>Precondition</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' for the new {@link org.eclipse.uml2.uml.Constraint}, or <code>null</code>.
	 * @param eClass The Ecore class of the {@link org.eclipse.uml2.uml.Constraint} to create.
	 * @return The new {@link org.eclipse.uml2.uml.Constraint}.
	 * @see #getPreconditions()
	 * @generated
	 */
	Constraint createPrecondition(String name, EClass eClass);

	/**
	 * Creates a new {@link org.eclipse.uml2.uml.Constraint}, with the specified '<em><b>Name</b></em>', and appends it to the '<em><b>Precondition</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' for the new {@link org.eclipse.uml2.uml.Constraint}, or <code>null</code>.
	 * @return The new {@link org.eclipse.uml2.uml.Constraint}.
	 * @see #getPreconditions()
	 * @generated
	 */
	Constraint createPrecondition(String name);

	/**
	 * Retrieves the first {@link org.eclipse.uml2.uml.Constraint} with the specified '<em><b>Name</b></em>' from the '<em><b>Precondition</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.Constraint} to retrieve, or <code>null</code>.
	 * @return The first {@link org.eclipse.uml2.uml.Constraint} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getPreconditions()
	 * @generated
	 */
	Constraint getPrecondition(String name);

	/**
	 * Retrieves the first {@link org.eclipse.uml2.uml.Constraint} with the specified '<em><b>Name</b></em>' from the '<em><b>Precondition</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.Constraint} to retrieve, or <code>null</code>.
	 * @param ignoreCase Whether to ignore case in {@link java.lang.String} comparisons.
	 * @param eClass The Ecore class of the {@link org.eclipse.uml2.uml.Constraint} to retrieve, or <code>null</code>.
	 * @param createOnDemand Whether to create a {@link org.eclipse.uml2.uml.Constraint} on demand if not found.
	 * @return The first {@link org.eclipse.uml2.uml.Constraint} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getPreconditions()
	 * @generated
	 */
	Constraint getPrecondition(String name, boolean ignoreCase, EClass eClass,
			boolean createOnDemand);

	/**
	 * Returns the value of the '<em><b>Postcondition</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.Constraint}.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.eclipse.uml2.uml.Namespace#getOwnedRules() <em>Owned Rule</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An optional set of Constraints specifying what is fulfilled after the execution of the Behavior is completed, if its precondition was fulfilled before its invocation.
	 * <p>From package UML::CommonBehavior.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Postcondition</em>' reference list.
	 * @see org.eclipse.uml2.uml.UMLPackage#getBehavior_Postcondition()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Constraint> getPostconditions();

	/**
	 * Creates a new {@link org.eclipse.uml2.uml.Constraint}, with the specified '<em><b>Name</b></em>', and appends it to the '<em><b>Postcondition</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' for the new {@link org.eclipse.uml2.uml.Constraint}, or <code>null</code>.
	 * @param eClass The Ecore class of the {@link org.eclipse.uml2.uml.Constraint} to create.
	 * @return The new {@link org.eclipse.uml2.uml.Constraint}.
	 * @see #getPostconditions()
	 * @generated
	 */
	Constraint createPostcondition(String name, EClass eClass);

	/**
	 * Creates a new {@link org.eclipse.uml2.uml.Constraint}, with the specified '<em><b>Name</b></em>', and appends it to the '<em><b>Postcondition</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' for the new {@link org.eclipse.uml2.uml.Constraint}, or <code>null</code>.
	 * @return The new {@link org.eclipse.uml2.uml.Constraint}.
	 * @see #getPostconditions()
	 * @generated
	 */
	Constraint createPostcondition(String name);

	/**
	 * Retrieves the first {@link org.eclipse.uml2.uml.Constraint} with the specified '<em><b>Name</b></em>' from the '<em><b>Postcondition</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.Constraint} to retrieve, or <code>null</code>.
	 * @return The first {@link org.eclipse.uml2.uml.Constraint} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getPostconditions()
	 * @generated
	 */
	Constraint getPostcondition(String name);

	/**
	 * Retrieves the first {@link org.eclipse.uml2.uml.Constraint} with the specified '<em><b>Name</b></em>' from the '<em><b>Postcondition</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.Constraint} to retrieve, or <code>null</code>.
	 * @param ignoreCase Whether to ignore case in {@link java.lang.String} comparisons.
	 * @param eClass The Ecore class of the {@link org.eclipse.uml2.uml.Constraint} to retrieve, or <code>null</code>.
	 * @param createOnDemand Whether to create a {@link org.eclipse.uml2.uml.Constraint} on demand if not found.
	 * @return The first {@link org.eclipse.uml2.uml.Constraint} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getPostconditions()
	 * @generated
	 */
	Constraint getPostcondition(String name, boolean ignoreCase, EClass eClass,
			boolean createOnDemand);

	/**
	 * Returns the value of the '<em><b>Owned Parameter Set</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.ParameterSet}.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.eclipse.uml2.uml.Namespace#getOwnedMembers() <em>Owned Member</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The ParameterSets owned by this Behavior.
	 * <p>From package UML::CommonBehavior.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned Parameter Set</em>' containment reference list.
	 * @see org.eclipse.uml2.uml.UMLPackage#getBehavior_OwnedParameterSet()
	 * @model containment="true" resolveProxies="true" ordered="false"
	 * @generated
	 */
	EList<ParameterSet> getOwnedParameterSets();

	/**
	 * Creates a new {@link org.eclipse.uml2.uml.ParameterSet}, with the specified '<em><b>Name</b></em>', and appends it to the '<em><b>Owned Parameter Set</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' for the new {@link org.eclipse.uml2.uml.ParameterSet}, or <code>null</code>.
	 * @return The new {@link org.eclipse.uml2.uml.ParameterSet}.
	 * @see #getOwnedParameterSets()
	 * @generated
	 */
	ParameterSet createOwnedParameterSet(String name);

	/**
	 * Retrieves the first {@link org.eclipse.uml2.uml.ParameterSet} with the specified '<em><b>Name</b></em>' from the '<em><b>Owned Parameter Set</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.ParameterSet} to retrieve, or <code>null</code>.
	 * @return The first {@link org.eclipse.uml2.uml.ParameterSet} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getOwnedParameterSets()
	 * @generated
	 */
	ParameterSet getOwnedParameterSet(String name);

	/**
	 * Retrieves the first {@link org.eclipse.uml2.uml.ParameterSet} with the specified '<em><b>Name</b></em>' from the '<em><b>Owned Parameter Set</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.ParameterSet} to retrieve, or <code>null</code>.
	 * @param ignoreCase Whether to ignore case in {@link java.lang.String} comparisons.
	 * @param createOnDemand Whether to create a {@link org.eclipse.uml2.uml.ParameterSet} on demand if not found.
	 * @return The first {@link org.eclipse.uml2.uml.ParameterSet} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getOwnedParameterSets()
	 * @generated
	 */
	ParameterSet getOwnedParameterSet(String name, boolean ignoreCase,
			boolean createOnDemand);

	/**
	 * Returns the value of the '<em><b>Specification</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.uml2.uml.BehavioralFeature#getMethods <em>Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Designates a BehavioralFeature that the Behavior implements. The BehavioralFeature must be owned by the BehavioredClassifier that owns the Behavior or be inherited by it. The Parameters of the BehavioralFeature and the implementing Behavior must match. A Behavior does not need to have a specification, in which case it either is the classifierBehavior of a BehavioredClassifier or it can only be invoked by another Behavior of the Classifier.
	 * <p>From package UML::CommonBehavior.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Specification</em>' reference.
	 * @see #setSpecification(BehavioralFeature)
	 * @see org.eclipse.uml2.uml.UMLPackage#getBehavior_Specification()
	 * @see org.eclipse.uml2.uml.BehavioralFeature#getMethods
	 * @model opposite="method" ordered="false"
	 * @generated
	 */
	BehavioralFeature getSpecification();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.uml.Behavior#getSpecification <em>Specification</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Specification</em>' reference.
	 * @see #getSpecification()
	 * @generated
	 */
	void setSpecification(BehavioralFeature value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If a Behavior has a specification BehavioralFeature, then it must have the same number of ownedParameters as its specification. The Behavior Parameters must also "match" the BehavioralParameter Parameters, but the exact requirements for this matching are not formalized.
	 * specification <> null implies ownedParameter->size() = specification.ownedParameter->size()
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validateParametersMatch(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The specification BehavioralFeature must be a feature (possibly inherited) of the context BehavioredClassifier of the Behavior.
	 * _'context'.feature->includes(specification)
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validateFeatureOfContextClassifier(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The first BehavioredClassifier reached by following the chain of owner relationships from the Behavior, if any.
	 * if from.oclIsKindOf(BehavioredClassifier) then
	 *     from.oclAsType(BehavioredClassifier)
	 * else if from.owner = null then
	 *     null
	 * else
	 *     self.behavioredClassifier(from.owner)
	 * endif
	 * endif
	 * <p>From package UML::CommonBehavior.</p>
	 * <!-- end-model-doc -->
	 * @model ordered="false" fromRequired="true" fromOrdered="false"
	 * @generated
	 */
	BehavioredClassifier behavioredClassifier(Element from);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The in and inout ownedParameters of the Behavior.
	 * result = (ownedParameter->select(direction=ParameterDirectionKind::_'in' or direction=ParameterDirectionKind::inout))
	 * <p>From package UML::CommonBehavior.</p>
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	EList<Parameter> inputParameters();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The out, inout and return ownedParameters.
	 * result = (ownedParameter->select(direction=ParameterDirectionKind::out or direction=ParameterDirectionKind::inout or direction=ParameterDirectionKind::return))
	 * <p>From package UML::CommonBehavior.</p>
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	EList<Parameter> outputParameters();

} // Behavior
