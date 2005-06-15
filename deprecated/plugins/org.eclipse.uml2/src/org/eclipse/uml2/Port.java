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
 * $Id: Port.java,v 1.10 2005/06/15 20:06:01 khussey Exp $
 */
package org.eclipse.uml2;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Port</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Ports represent interaction points between a classifier and its environment. The interfaces associated with a port specify the nature of the interactions that may occur over a port. The required interfaces of a port characterize the requests which may be made from the classifier to its environment through this port. The provided interfaces of a port characterize requests to the classifier that its environment may make through this port. A port has the ability to specify that any requests arriving at this port are handled by the behavior of the instance of the owning classifier, rather than being forwarded to any contained instances, if any. 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2.Port#isBehavior <em>Is Behavior</em>}</li>
 *   <li>{@link org.eclipse.uml2.Port#isService <em>Is Service</em>}</li>
 *   <li>{@link org.eclipse.uml2.Port#getRequireds <em>Required</em>}</li>
 *   <li>{@link org.eclipse.uml2.Port#getRedefinedPorts <em>Redefined Port</em>}</li>
 *   <li>{@link org.eclipse.uml2.Port#getProvideds <em>Provided</em>}</li>
 *   <li>{@link org.eclipse.uml2.Port#getProtocol <em>Protocol</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.uml2.UML2Package#getPort()
 * @model
 * @generated
 */
public interface Port extends Property{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) IBM Corporation and others."; //$NON-NLS-1$

	/**
	 * Returns the value of the '<em><b>Is Behavior</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Behavior</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies whether requests arriving at this port are sent to the classifier behavior of this classifier (see “BehavioredClassifier (from BasicBehaviors)” on page 387). Such ports are referred to as behavior port. Any invocation of a behavioral feature targeted at a behavior port will be handled by the instance of the owning classifier itself, rather than by any instances that this classifier may contain. The default value is false.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Behavior</em>' attribute.
	 * @see #setIsBehavior(boolean)
	 * @see org.eclipse.uml2.UML2Package#getPort_IsBehavior()
	 * @model default="false" dataType="org.eclipse.uml2.Boolean"
	 * @generated
	 */
	boolean isBehavior();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.Port#isBehavior <em>Is Behavior</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Behavior</em>' attribute.
	 * @see #isBehavior()
	 * @generated
	 */
	void setIsBehavior(boolean value);


	/**
	 * Returns the value of the '<em><b>Is Service</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Service</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If true indicates that this port is used to provide the published functionality of a classifier; if false, this port is used to implement the classifier but is not part of the essential externally- visible functionality of the classifier and can, therefore, be altered or deleted along with the internal implementation of the classifier and other properties that are considered part of its implementation. The default value for this attribute is true.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Service</em>' attribute.
	 * @see #setIsService(boolean)
	 * @see org.eclipse.uml2.UML2Package#getPort_IsService()
	 * @model default="true" dataType="org.eclipse.uml2.Boolean"
	 * @generated
	 */
	boolean isService();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.Port#isService <em>Is Service</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Service</em>' attribute.
	 * @see #isService()
	 * @generated
	 */
	void setIsService(boolean value);


	/**
	 * Returns the value of the '<em><b>Required</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.Interface}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Required</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * References the interfaces specifying the set of operations and receptions which the classifier expects its environment to handle. This association is derived as the set of interfaces required by the type of the port or its supertypes.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Required</em>' reference list.
	 * @see org.eclipse.uml2.UML2Package#getPort_Required()
	 * @model type="org.eclipse.uml2.Interface" transient="true" changeable="false" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	EList getRequireds();


	/**
	 * Retrieves the {@link org.eclipse.uml2.Interface} with the specified '<em><b>Name</b></em>' from the '<em><b>Required</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.Interface} to retrieve.
	 * @return The {@link org.eclipse.uml2.Interface} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getRequireds()
	 * @generated
	 */
    Interface getRequired(String name);

	/**
	 * Returns the value of the '<em><b>Redefined Port</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.Port}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Redefined Port</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A port may be redefined when its containing classifier is specialized. The redefining port may have additional interfaces to those that are associated with the redefined port or it may replace an interface by one of its subtypes. (Subsets Element.redefinedElement.)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Redefined Port</em>' reference list.
	 * @see org.eclipse.uml2.UML2Package#getPort_RedefinedPort()
	 * @model type="org.eclipse.uml2.Port" ordered="false"
	 * @generated
	 */
	EList getRedefinedPorts();


	/**
	 * Retrieves the {@link org.eclipse.uml2.Port} with the specified '<em><b>Name</b></em>' from the '<em><b>Redefined Port</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.Port} to retrieve.
	 * @return The {@link org.eclipse.uml2.Port} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getRedefinedPorts()
	 * @generated
	 */
    Port getRedefinedPort(String name);

	/**
	 * Returns the value of the '<em><b>Provided</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.Interface}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Provided</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * References the interfaces specifying the set of operations and receptions which the classifier offers to its environment, and which it will handle either directly or by forwarding it to a part of its internal structure. This association is derived from the interfaces realized by the type of the port or by the type of the port, if the port was typed by an interface.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Provided</em>' reference list.
	 * @see org.eclipse.uml2.UML2Package#getPort_Provided()
	 * @model type="org.eclipse.uml2.Interface" transient="true" changeable="false" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	EList getProvideds();


	/**
	 * Retrieves the {@link org.eclipse.uml2.Interface} with the specified '<em><b>Name</b></em>' from the '<em><b>Provided</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.Interface} to retrieve.
	 * @return The {@link org.eclipse.uml2.Interface} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getProvideds()
	 * @generated
	 */
    Interface getProvided(String name);

	/**
	 * Returns the value of the '<em><b>Protocol</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Protocol</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * References an optional protocol state machine which describes valid interactions at this interaction point.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Protocol</em>' reference.
	 * @see #setProtocol(ProtocolStateMachine)
	 * @see org.eclipse.uml2.UML2Package#getPort_Protocol()
	 * @model
	 * @generated
	 */
	ProtocolStateMachine getProtocol();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.Port#getProtocol <em>Protocol</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Protocol</em>' reference.
	 * @see #getProtocol()
	 * @generated
	 */
	void setProtocol(ProtocolStateMachine value);


} // Port
