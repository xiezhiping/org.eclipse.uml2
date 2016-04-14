/*
 * Copyright (c) 2005, 2016 IBM Corporation, CEA, and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *   Kenn Hussey (CEA) - 327039, 418466, 451350, 485756, 491587
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
 * A representation of the model object '<em><b>Behaviored Classifier</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A BehavioredClassifier may have InterfaceRealizations, and owns a set of Behaviors one of which may specify the behavior of the BehavioredClassifier itself.
 * <p>From package UML::SimpleClassifiers.</p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.BehavioredClassifier#getClassifierBehavior <em>Classifier Behavior</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.BehavioredClassifier#getInterfaceRealizations <em>Interface Realization</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.BehavioredClassifier#getOwnedBehaviors <em>Owned Behavior</em>}</li>
 * </ul>
 *
 * @see org.eclipse.uml2.uml.UMLPackage#getBehavioredClassifier()
 * @model abstract="true"
 * @generated
 */
public interface BehavioredClassifier
		extends Classifier {

	/**
	 * Returns the value of the '<em><b>Owned Behavior</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.Behavior}.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.eclipse.uml2.uml.Namespace#getOwnedMembers() <em>Owned Member</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Behaviors owned by a BehavioredClassifier.
	 * <p>From package UML::SimpleClassifiers.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned Behavior</em>' containment reference list.
	 * @see org.eclipse.uml2.uml.UMLPackage#getBehavioredClassifier_OwnedBehavior()
	 * @model containment="true" resolveProxies="true" ordered="false"
	 * @generated
	 */
	EList<Behavior> getOwnedBehaviors();

	/**
	 * Creates a new {@link org.eclipse.uml2.uml.Behavior}, with the specified '<em><b>Name</b></em>', and appends it to the '<em><b>Owned Behavior</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' for the new {@link org.eclipse.uml2.uml.Behavior}, or <code>null</code>.
	 * @param eClass The Ecore class of the {@link org.eclipse.uml2.uml.Behavior} to create.
	 * @return The new {@link org.eclipse.uml2.uml.Behavior}.
	 * @see #getOwnedBehaviors()
	 * @generated
	 */
	Behavior createOwnedBehavior(String name, EClass eClass);

	/**
	 * Retrieves the first {@link org.eclipse.uml2.uml.Behavior} with the specified '<em><b>Name</b></em>' from the '<em><b>Owned Behavior</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.Behavior} to retrieve, or <code>null</code>.
	 * @return The first {@link org.eclipse.uml2.uml.Behavior} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getOwnedBehaviors()
	 * @generated
	 */
	Behavior getOwnedBehavior(String name);

	/**
	 * Retrieves the first {@link org.eclipse.uml2.uml.Behavior} with the specified '<em><b>Name</b></em>' from the '<em><b>Owned Behavior</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.Behavior} to retrieve, or <code>null</code>.
	 * @param ignoreCase Whether to ignore case in {@link java.lang.String} comparisons.
	 * @param eClass The Ecore class of the {@link org.eclipse.uml2.uml.Behavior} to retrieve, or <code>null</code>.
	 * @param createOnDemand Whether to create a {@link org.eclipse.uml2.uml.Behavior} on demand if not found.
	 * @return The first {@link org.eclipse.uml2.uml.Behavior} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getOwnedBehaviors()
	 * @generated
	 */
	Behavior getOwnedBehavior(String name, boolean ignoreCase, EClass eClass,
			boolean createOnDemand);

	/**
	 * Returns the value of the '<em><b>Classifier Behavior</b></em>' reference.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.eclipse.uml2.uml.BehavioredClassifier#getOwnedBehaviors() <em>Owned Behavior</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A Behavior that specifies the behavior of the BehavioredClassifier itself.
	 * <p>From package UML::SimpleClassifiers.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Classifier Behavior</em>' reference.
	 * @see #setClassifierBehavior(Behavior)
	 * @see org.eclipse.uml2.uml.UMLPackage#getBehavioredClassifier_ClassifierBehavior()
	 * @model ordered="false"
	 * @generated
	 */
	Behavior getClassifierBehavior();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.uml.BehavioredClassifier#getClassifierBehavior <em>Classifier Behavior</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Classifier Behavior</em>' reference.
	 * @see #getClassifierBehavior()
	 * @generated
	 */
	void setClassifierBehavior(Behavior value);

	/**
	 * Creates a new {@link org.eclipse.uml2.uml.Behavior}, with the specified '<em><b>Name</b></em>', and sets the '<em><b>Classifier Behavior</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' for the new {@link org.eclipse.uml2.uml.Behavior}, or <code>null</code>.
	 * @param eClass The Ecore class of the {@link org.eclipse.uml2.uml.Behavior} to create.
	 * @return The new {@link org.eclipse.uml2.uml.Behavior}.
	 * @see #getClassifierBehavior()
	 * @generated
	 */
	Behavior createClassifierBehavior(String name, EClass eClass);

	/**
	 * Returns the value of the '<em><b>Interface Realization</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.InterfaceRealization}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.uml2.uml.InterfaceRealization#getImplementingClassifier <em>Implementing Classifier</em>}'.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.eclipse.uml2.uml.Element#getOwnedElements() <em>Owned Element</em>}'</li>
	 *   <li>'{@link org.eclipse.uml2.uml.NamedElement#getClientDependencies() <em>Client Dependency</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The set of InterfaceRealizations owned by the BehavioredClassifier. Interface realizations reference the Interfaces of which the BehavioredClassifier is an implementation.
	 * <p>From package UML::SimpleClassifiers.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Interface Realization</em>' containment reference list.
	 * @see org.eclipse.uml2.uml.UMLPackage#getBehavioredClassifier_InterfaceRealization()
	 * @see org.eclipse.uml2.uml.InterfaceRealization#getImplementingClassifier
	 * @model opposite="implementingClassifier" containment="true" resolveProxies="true" ordered="false"
	 * @generated
	 */
	EList<InterfaceRealization> getInterfaceRealizations();

	/**
	 * Creates a new {@link org.eclipse.uml2.uml.InterfaceRealization}, with the specified '<em><b>Name</b></em>', and '<em><b>Contract</b></em>', and appends it to the '<em><b>Interface Realization</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' for the new {@link org.eclipse.uml2.uml.InterfaceRealization}, or <code>null</code>.
	 * @param contract The '<em><b>Contract</b></em>' for the new {@link org.eclipse.uml2.uml.InterfaceRealization}, or <code>null</code>.
	 * @return The new {@link org.eclipse.uml2.uml.InterfaceRealization}.
	 * @see #getInterfaceRealizations()
	 * @generated
	 */
	InterfaceRealization createInterfaceRealization(String name,
			Interface contract);

	/**
	 * Retrieves the first {@link org.eclipse.uml2.uml.InterfaceRealization} with the specified '<em><b>Name</b></em>', and '<em><b>Contract</b></em>' from the '<em><b>Interface Realization</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.InterfaceRealization} to retrieve, or <code>null</code>.
	 * @param contract The '<em><b>Contract</b></em>' of the {@link org.eclipse.uml2.uml.InterfaceRealization} to retrieve, or <code>null</code>.
	 * @return The first {@link org.eclipse.uml2.uml.InterfaceRealization} with the specified '<em><b>Name</b></em>', and '<em><b>Contract</b></em>', or <code>null</code>.
	 * @see #getInterfaceRealizations()
	 * @generated
	 */
	InterfaceRealization getInterfaceRealization(String name,
			Interface contract);

	/**
	 * Retrieves the first {@link org.eclipse.uml2.uml.InterfaceRealization} with the specified '<em><b>Name</b></em>', and '<em><b>Contract</b></em>' from the '<em><b>Interface Realization</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.InterfaceRealization} to retrieve, or <code>null</code>.
	 * @param contract The '<em><b>Contract</b></em>' of the {@link org.eclipse.uml2.uml.InterfaceRealization} to retrieve, or <code>null</code>.
	 * @param ignoreCase Whether to ignore case in {@link java.lang.String} comparisons.
	 * @param createOnDemand Whether to create a {@link org.eclipse.uml2.uml.InterfaceRealization} on demand if not found.
	 * @return The first {@link org.eclipse.uml2.uml.InterfaceRealization} with the specified '<em><b>Name</b></em>', and '<em><b>Contract</b></em>', or <code>null</code>.
	 * @see #getInterfaceRealizations()
	 * @generated
	 */
	InterfaceRealization getInterfaceRealization(String name,
			Interface contract, boolean ignoreCase, boolean createOnDemand);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If a behavior is classifier behavior, it does not have a specification.
	 * classifierBehavior->notEmpty() implies classifierBehavior.specification->isEmpty()
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validateClassBehavior(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Retrieves the interfaces on which this behaviored classifier has an interface realization dependency.
	 * <!-- end-model-doc -->
	 * @model kind="operation" ordered="false"
	 * @generated
	 */
	EList<Interface> getImplementedInterfaces();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Retrieves all the interfaces on which this behaviored classifier or any of its parents has an interface realization dependency.
	 * <!-- end-model-doc -->
	 * @model kind="operation" ordered="false"
	 * @generated
	 */
	EList<Interface> getAllImplementedInterfaces();

} // BehavioredClassifier
