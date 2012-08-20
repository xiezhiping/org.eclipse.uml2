/*
 * Copyright (c) 2005, 2012 IBM Corporation, CEA, and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *   Kenn Hussey (CEA) - 327039, 351774, 351777, 382718
 *
 */
package org.eclipse.uml2.uml;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Port</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A port has an associated protocol state machine.
 * A port is a property of a classifier that specifies a distinct interaction point between that classifier and its environment or between the (behavior of the) classifier and its internal parts. Ports are connected to properties of the classifier by connectors through which requests can be made to invoke the behavioral features of a classifier. A Port may specify the services a classifier provides (offers) to its environment as well as the services that a classifier expects (requires) of its environment.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.Port#isBehavior <em>Is Behavior</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Port#isConjugated <em>Is Conjugated</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Port#isService <em>Is Service</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Port#getProtocol <em>Protocol</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Port#getProvideds <em>Provided</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Port#getRedefinedPorts <em>Redefined Port</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Port#getRequireds <em>Required</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.uml2.uml.UMLPackage#getPort()
 * @model
 * @generated
 */
public interface Port
		extends Property {

	/**
	 * Returns the value of the '<em><b>Is Behavior</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies whether requests arriving at this port are sent to the classifier behavior of this classifier. Such ports are referred to as behavior port. Any invocation of a behavioral feature targeted at a behavior port will be handled by the instance of the owning classifier itself, rather than by any instances that this classifier may contain.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Behavior</em>' attribute.
	 * @see #setIsBehavior(boolean)
	 * @see org.eclipse.uml2.uml.UMLPackage#getPort_IsBehavior()
	 * @model default="false" dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isBehavior();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.uml.Port#isBehavior <em>Is Behavior</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Behavior</em>' attribute.
	 * @see #isBehavior()
	 * @generated
	 */
	void setIsBehavior(boolean value);

	/**
	 * Returns the value of the '<em><b>Is Conjugated</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies the way that the provided and required interfaces are derived from the Port’s Type. The default value is false.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Conjugated</em>' attribute.
	 * @see #setIsConjugated(boolean)
	 * @see org.eclipse.uml2.uml.UMLPackage#getPort_IsConjugated()
	 * @model default="false" dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isConjugated();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.uml.Port#isConjugated <em>Is Conjugated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Conjugated</em>' attribute.
	 * @see #isConjugated()
	 * @generated
	 */
	void setIsConjugated(boolean value);

	/**
	 * Returns the value of the '<em><b>Is Service</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If true indicates that this port is used to provide the published functionality of a classifier; if false, this port is used to implement the classifier but is not part of the essential externally-visible functionality of the classifier and can, therefore, be altered or deleted along with the internal implementation of the classifier and other properties that are considered part of its implementation.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Service</em>' attribute.
	 * @see #setIsService(boolean)
	 * @see org.eclipse.uml2.uml.UMLPackage#getPort_IsService()
	 * @model default="true" dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isService();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.uml.Port#isService <em>Is Service</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Service</em>' attribute.
	 * @see #isService()
	 * @generated
	 */
	void setIsService(boolean value);

	/**
	 * Returns the value of the '<em><b>Required</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.Interface}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * References the interfaces specifying the set of operations and receptions that the classifier expects its environment to handle via this port. This association is derived according to the value of isConjugated. If isConjugated is false, required is derived as the union of the sets of interfaces used by the type of the port and its supertypes. If isConjugated is true, it is derived as the union of the sets of interfaces realized by the type of the port and its supertypes, or directly from the type of the port if the port is typed by an interface.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Required</em>' reference list.
	 * @see org.eclipse.uml2.uml.UMLPackage#getPort_Required()
	 * @model transient="true" changeable="false" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	EList<Interface> getRequireds();

	/**
	 * Retrieves the first {@link org.eclipse.uml2.uml.Interface} with the specified '<em><b>Name</b></em>' from the '<em><b>Required</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.Interface} to retrieve, or <code>null</code>.
	 * @return The first {@link org.eclipse.uml2.uml.Interface} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getRequireds()
	 * @generated
	 */
	Interface getRequired(String name);

	/**
	 * Retrieves the first {@link org.eclipse.uml2.uml.Interface} with the specified '<em><b>Name</b></em>' from the '<em><b>Required</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.Interface} to retrieve, or <code>null</code>.
	 * @param ignoreCase Whether to ignore case in {@link java.lang.String} comparisons.
	 * @return The first {@link org.eclipse.uml2.uml.Interface} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getRequireds()
	 * @generated
	 */
	Interface getRequired(String name, boolean ignoreCase);

	/**
	 * Returns the value of the '<em><b>Redefined Port</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.Port}.
	 * <p>
	 * This feature subsets the following features:
	 * <ul>
	 *   <li>'{@link org.eclipse.uml2.uml.Property#getRedefinedProperties() <em>Redefined Property</em>}'</li>
	 * </ul>
	 * </p>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A port may be redefined when its containing classifier is specialized. The redefining port may have additional interfaces to those that are associated with the redefined port or it may replace an interface by one of its subtypes.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Redefined Port</em>' reference list.
	 * @see org.eclipse.uml2.uml.UMLPackage#getPort_RedefinedPort()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Port> getRedefinedPorts();

	/**
	 * Retrieves the first {@link org.eclipse.uml2.uml.Port} with the specified '<em><b>Name</b></em>', and '<em><b>Type</b></em>' from the '<em><b>Redefined Port</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.Port} to retrieve, or <code>null</code>.
	 * @param type The '<em><b>Type</b></em>' of the {@link org.eclipse.uml2.uml.Port} to retrieve, or <code>null</code>.
	 * @return The first {@link org.eclipse.uml2.uml.Port} with the specified '<em><b>Name</b></em>', and '<em><b>Type</b></em>', or <code>null</code>.
	 * @see #getRedefinedPorts()
	 * @generated
	 */
	Port getRedefinedPort(String name, Type type);

	/**
	 * Retrieves the first {@link org.eclipse.uml2.uml.Port} with the specified '<em><b>Name</b></em>', and '<em><b>Type</b></em>' from the '<em><b>Redefined Port</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.Port} to retrieve, or <code>null</code>.
	 * @param type The '<em><b>Type</b></em>' of the {@link org.eclipse.uml2.uml.Port} to retrieve, or <code>null</code>.
	 * @param ignoreCase Whether to ignore case in {@link java.lang.String} comparisons.
	 * @return The first {@link org.eclipse.uml2.uml.Port} with the specified '<em><b>Name</b></em>', and '<em><b>Type</b></em>', or <code>null</code>.
	 * @see #getRedefinedPorts()
	 * @generated
	 */
	Port getRedefinedPort(String name, Type type, boolean ignoreCase);

	/**
	 * Returns the value of the '<em><b>Provided</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.Interface}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * References the interfaces specifying the set of operations and receptions that the classifier offers to its environment via this port, and which it will handle either directly or by forwarding it to a part of its internal structure. This association is derived according to the value of isConjugated. If isConjugated is false, provided is derived as the union of the sets of interfaces realized by the type of the port and its supertypes, or directly from the type of the port if the port is typed by an interface. If isConjugated is true, it is derived as the union of the sets of interfaces used by the type of the port and its supertypes.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Provided</em>' reference list.
	 * @see org.eclipse.uml2.uml.UMLPackage#getPort_Provided()
	 * @model transient="true" changeable="false" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	EList<Interface> getProvideds();

	/**
	 * Retrieves the first {@link org.eclipse.uml2.uml.Interface} with the specified '<em><b>Name</b></em>' from the '<em><b>Provided</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.Interface} to retrieve, or <code>null</code>.
	 * @return The first {@link org.eclipse.uml2.uml.Interface} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getProvideds()
	 * @generated
	 */
	Interface getProvided(String name);

	/**
	 * Retrieves the first {@link org.eclipse.uml2.uml.Interface} with the specified '<em><b>Name</b></em>' from the '<em><b>Provided</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.Interface} to retrieve, or <code>null</code>.
	 * @param ignoreCase Whether to ignore case in {@link java.lang.String} comparisons.
	 * @return The first {@link org.eclipse.uml2.uml.Interface} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getProvideds()
	 * @generated
	 */
	Interface getProvided(String name, boolean ignoreCase);

	/**
	 * Returns the value of the '<em><b>Protocol</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * References an optional protocol state machine which describes valid interactions at this interaction point.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Protocol</em>' reference.
	 * @see #setProtocol(ProtocolStateMachine)
	 * @see org.eclipse.uml2.uml.UMLPackage#getPort_Protocol()
	 * @model ordered="false"
	 * @generated
	 */
	ProtocolStateMachine getProtocol();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.uml.Port#getProtocol <em>Protocol</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Protocol</em>' reference.
	 * @see #getProtocol()
	 * @generated
	 */
	void setProtocol(ProtocolStateMachine value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Port.aggregation must be composite.
	 * true
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validatePortAggregation(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * When a port is destroyed, all connectors attached to this port will be destroyed also.
	 * true
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validatePortDestroyed(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A defaultValue for port cannot be specified when the type of the Port is an Interface
	 * true
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validateDefaultValue(DiagnosticChain diagnostics,
			Map<Object, Object> context);

} // Port
