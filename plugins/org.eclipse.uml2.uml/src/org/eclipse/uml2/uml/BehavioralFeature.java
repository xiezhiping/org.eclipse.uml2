/*
 * Copyright (c) 2005, 2015 IBM Corporation, CEA, and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *   Kenn Hussey (CEA) - 327039, 351774, 418466, 451350
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
 * A representation of the model object '<em><b>Behavioral Feature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A BehavioralFeature is a feature of a Classifier that specifies an aspect of the behavior of its instances.  A BehavioralFeature is implemented (realized) by a Behavior. A BehavioralFeature specifies that a Classifier will respond to a designated request by invoking its implementing method.
 * <p>From package UML::Classification.</p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.BehavioralFeature#getConcurrency <em>Concurrency</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.BehavioralFeature#isAbstract <em>Is Abstract</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.BehavioralFeature#getMethods <em>Method</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.BehavioralFeature#getOwnedParameters <em>Owned Parameter</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.BehavioralFeature#getOwnedParameterSets <em>Owned Parameter Set</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.BehavioralFeature#getRaisedExceptions <em>Raised Exception</em>}</li>
 * </ul>
 *
 * @see org.eclipse.uml2.uml.UMLPackage#getBehavioralFeature()
 * @model abstract="true"
 * @generated
 */
public interface BehavioralFeature
		extends Namespace, Feature {

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
	 * The ordered set of formal Parameters of this BehavioralFeature.
	 * <p>From package UML::Classification.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned Parameter</em>' containment reference list.
	 * @see org.eclipse.uml2.uml.UMLPackage#getBehavioralFeature_OwnedParameter()
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
	 * Returns the value of the '<em><b>Is Abstract</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If true, then the BehavioralFeature does not have an implementation, and one must be supplied by a more specific Classifier. If false, the BehavioralFeature must have an implementation in the Classifier or one must be inherited.
	 * <p>From package UML::Classification.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Abstract</em>' attribute.
	 * @see #setIsAbstract(boolean)
	 * @see org.eclipse.uml2.uml.UMLPackage#getBehavioralFeature_IsAbstract()
	 * @model default="false" dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isAbstract();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.uml.BehavioralFeature#isAbstract <em>Is Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Abstract</em>' attribute.
	 * @see #isAbstract()
	 * @generated
	 */
	void setIsAbstract(boolean value);

	/**
	 * Returns the value of the '<em><b>Method</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.Behavior}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.uml2.uml.Behavior#getSpecification <em>Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A Behavior that implements the BehavioralFeature. There may be at most one Behavior for a particular pairing of a Classifier (as owner of the Behavior) and a BehavioralFeature (as specification of the Behavior).
	 * <p>From package UML::Classification.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Method</em>' reference list.
	 * @see org.eclipse.uml2.uml.UMLPackage#getBehavioralFeature_Method()
	 * @see org.eclipse.uml2.uml.Behavior#getSpecification
	 * @model opposite="specification" ordered="false"
	 * @generated
	 */
	EList<Behavior> getMethods();

	/**
	 * Retrieves the first {@link org.eclipse.uml2.uml.Behavior} with the specified '<em><b>Name</b></em>' from the '<em><b>Method</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.Behavior} to retrieve, or <code>null</code>.
	 * @return The first {@link org.eclipse.uml2.uml.Behavior} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getMethods()
	 * @generated
	 */
	Behavior getMethod(String name);

	/**
	 * Retrieves the first {@link org.eclipse.uml2.uml.Behavior} with the specified '<em><b>Name</b></em>' from the '<em><b>Method</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.Behavior} to retrieve, or <code>null</code>.
	 * @param ignoreCase Whether to ignore case in {@link java.lang.String} comparisons.
	 * @param eClass The Ecore class of the {@link org.eclipse.uml2.uml.Behavior} to retrieve, or <code>null</code>.
	 * @return The first {@link org.eclipse.uml2.uml.Behavior} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getMethods()
	 * @generated
	 */
	Behavior getMethod(String name, boolean ignoreCase, EClass eClass);

	/**
	 * Returns the value of the '<em><b>Concurrency</b></em>' attribute.
	 * The default value is <code>"sequential"</code>.
	 * The literals are from the enumeration {@link org.eclipse.uml2.uml.CallConcurrencyKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies the semantics of concurrent calls to the same passive instance (i.e., an instance originating from a Class with isActive being false). Active instances control access to their own BehavioralFeatures.
	 * <p>From package UML::Classification.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Concurrency</em>' attribute.
	 * @see org.eclipse.uml2.uml.CallConcurrencyKind
	 * @see #setConcurrency(CallConcurrencyKind)
	 * @see org.eclipse.uml2.uml.UMLPackage#getBehavioralFeature_Concurrency()
	 * @model default="sequential" required="true" ordered="false"
	 * @generated
	 */
	CallConcurrencyKind getConcurrency();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.uml.BehavioralFeature#getConcurrency <em>Concurrency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Concurrency</em>' attribute.
	 * @see org.eclipse.uml2.uml.CallConcurrencyKind
	 * @see #getConcurrency()
	 * @generated
	 */
	void setConcurrency(CallConcurrencyKind value);

	/**
	 * Returns the value of the '<em><b>Raised Exception</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.Type}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Types representing exceptions that may be raised during an invocation of this BehavioralFeature.
	 * <p>From package UML::Classification.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Raised Exception</em>' reference list.
	 * @see org.eclipse.uml2.uml.UMLPackage#getBehavioralFeature_RaisedException()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Type> getRaisedExceptions();

	/**
	 * Retrieves the first {@link org.eclipse.uml2.uml.Type} with the specified '<em><b>Name</b></em>' from the '<em><b>Raised Exception</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.Type} to retrieve, or <code>null</code>.
	 * @return The first {@link org.eclipse.uml2.uml.Type} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getRaisedExceptions()
	 * @generated
	 */
	Type getRaisedException(String name);

	/**
	 * Retrieves the first {@link org.eclipse.uml2.uml.Type} with the specified '<em><b>Name</b></em>' from the '<em><b>Raised Exception</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.Type} to retrieve, or <code>null</code>.
	 * @param ignoreCase Whether to ignore case in {@link java.lang.String} comparisons.
	 * @param eClass The Ecore class of the {@link org.eclipse.uml2.uml.Type} to retrieve, or <code>null</code>.
	 * @return The first {@link org.eclipse.uml2.uml.Type} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getRaisedExceptions()
	 * @generated
	 */
	Type getRaisedException(String name, boolean ignoreCase, EClass eClass);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * When isAbstract is true there are no methods.
	 * isAbstract implies method->isEmpty()
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validateAbstractNoMethod(DiagnosticChain diagnostics,
			Map<Object, Object> context);

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
	 * The ParameterSets owned by this BehavioralFeature.
	 * <p>From package UML::Classification.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned Parameter Set</em>' containment reference list.
	 * @see org.eclipse.uml2.uml.UMLPackage#getBehavioralFeature_OwnedParameterSet()
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Creates a return result parameter with the specified name and type.
	 * @param name The name for the new return result, or null.
	 * @param type The type for the new return result, or null.
	 * <!-- end-model-doc -->
	 * @model required="true" ordered="false" nameDataType="org.eclipse.uml2.types.String" nameOrdered="false" typeOrdered="false"
	 * @generated
	 */
	Parameter createReturnResult(String name, Type type);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The ownedParameters with direction in and inout.
	 * result = (ownedParameter->select(direction=ParameterDirectionKind::_'in' or direction=ParameterDirectionKind::inout))
	 * <p>From package UML::Classification.</p>
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	EList<Parameter> inputParameters();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The ownedParameters with direction out, inout, or return.
	 * result = (ownedParameter->select(direction=ParameterDirectionKind::out or direction=ParameterDirectionKind::inout or direction=ParameterDirectionKind::return))
	 * <p>From package UML::Classification.</p>
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	EList<Parameter> outputParameters();

} // BehavioralFeature
