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
 * A representation of the model object '<em><b>Connector</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A Connector specifies links that enables communication between two or more instances. In contrast to Associations, which specify links between any instance of the associated Classifiers, Connectors specify links between instances playing the connected parts only.
 * <p>From package UML::StructuredClassifiers.</p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.Connector#getContracts <em>Contract</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Connector#getEnds <em>End</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Connector#getKind <em>Kind</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Connector#getRedefinedConnectors <em>Redefined Connector</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Connector#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see org.eclipse.uml2.uml.UMLPackage#getConnector()
 * @model
 * @generated
 */
public interface Connector
		extends Feature {

	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An optional Association that classifies links corresponding to this Connector.
	 * <p>From package UML::StructuredClassifiers.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(Association)
	 * @see org.eclipse.uml2.uml.UMLPackage#getConnector_Type()
	 * @model ordered="false"
	 * @generated
	 */
	Association getType();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.uml.Connector#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(Association value);

	/**
	 * Returns the value of the '<em><b>Redefined Connector</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.Connector}.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.eclipse.uml2.uml.RedefinableElement#getRedefinedElements() <em>Redefined Element</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A Connector may be redefined when its containing Classifier is specialized. The redefining Connector may have a type that specializes the type of the redefined Connector. The types of the ConnectorEnds of the redefining Connector may specialize the types of the ConnectorEnds of the redefined Connector. The properties of the ConnectorEnds of the redefining Connector may be replaced.
	 * <p>From package UML::StructuredClassifiers.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Redefined Connector</em>' reference list.
	 * @see org.eclipse.uml2.uml.UMLPackage#getConnector_RedefinedConnector()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Connector> getRedefinedConnectors();

	/**
	 * Retrieves the first {@link org.eclipse.uml2.uml.Connector} with the specified '<em><b>Name</b></em>' from the '<em><b>Redefined Connector</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.Connector} to retrieve, or <code>null</code>.
	 * @return The first {@link org.eclipse.uml2.uml.Connector} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getRedefinedConnectors()
	 * @generated
	 */
	Connector getRedefinedConnector(String name);

	/**
	 * Retrieves the first {@link org.eclipse.uml2.uml.Connector} with the specified '<em><b>Name</b></em>' from the '<em><b>Redefined Connector</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.Connector} to retrieve, or <code>null</code>.
	 * @param ignoreCase Whether to ignore case in {@link java.lang.String} comparisons.
	 * @return The first {@link org.eclipse.uml2.uml.Connector} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getRedefinedConnectors()
	 * @generated
	 */
	Connector getRedefinedConnector(String name, boolean ignoreCase);

	/**
	 * Returns the value of the '<em><b>End</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.ConnectorEnd}.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.eclipse.uml2.uml.Element#getOwnedElements() <em>Owned Element</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A Connector has at least two ConnectorEnds, each representing the participation of instances of the Classifiers typing the ConnectableElements attached to the end. The set of ConnectorEnds is ordered.
	 * <p>From package UML::StructuredClassifiers.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>End</em>' containment reference list.
	 * @see org.eclipse.uml2.uml.UMLPackage#getConnector_End()
	 * @model containment="true" resolveProxies="true" lower="2"
	 * @generated
	 */
	EList<ConnectorEnd> getEnds();

	/**
	 * Creates a new {@link org.eclipse.uml2.uml.ConnectorEnd} and appends it to the '<em><b>End</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return The new {@link org.eclipse.uml2.uml.ConnectorEnd}.
	 * @see #getEnds()
	 * @generated
	 */
	ConnectorEnd createEnd();

	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.uml2.uml.ConnectorKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates the kind of Connector. This is derived: a Connector with one or more ends connected to a Port which is not on a Part and which is not a behavior port is a delegation; otherwise it is an assembly.
	 * <p>From package UML::StructuredClassifiers.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see org.eclipse.uml2.uml.ConnectorKind
	 * @see org.eclipse.uml2.uml.UMLPackage#getConnector_Kind()
	 * @model required="true" transient="true" changeable="false" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	ConnectorKind getKind();

	/**
	 * Returns the value of the '<em><b>Contract</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.Behavior}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The set of Behaviors that specify the valid interaction patterns across the Connector.
	 * <p>From package UML::StructuredClassifiers.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Contract</em>' reference list.
	 * @see org.eclipse.uml2.uml.UMLPackage#getConnector_Contract()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Behavior> getContracts();

	/**
	 * Retrieves the first {@link org.eclipse.uml2.uml.Behavior} with the specified '<em><b>Name</b></em>' from the '<em><b>Contract</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.Behavior} to retrieve, or <code>null</code>.
	 * @return The first {@link org.eclipse.uml2.uml.Behavior} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getContracts()
	 * @generated
	 */
	Behavior getContract(String name);

	/**
	 * Retrieves the first {@link org.eclipse.uml2.uml.Behavior} with the specified '<em><b>Name</b></em>' from the '<em><b>Contract</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.Behavior} to retrieve, or <code>null</code>.
	 * @param ignoreCase Whether to ignore case in {@link java.lang.String} comparisons.
	 * @param eClass The Ecore class of the {@link org.eclipse.uml2.uml.Behavior} to retrieve, or <code>null</code>.
	 * @return The first {@link org.eclipse.uml2.uml.Behavior} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getContracts()
	 * @generated
	 */
	Behavior getContract(String name, boolean ignoreCase, EClass eClass);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The types of the ConnectableElements that the ends of a Connector are attached to must conform to the types of the ends of the Association that types the Connector, if any.
	 * type<>null implies 
	 *   let noOfEnds : Integer = end->size() in 
	 *   (type.memberEnd->size() = noOfEnds) and Sequence{1..noOfEnds}->forAll(i | end->at(i).role.type.conformsTo(type.memberEnd->at(i).type))
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validateTypes(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The ConnectableElements attached as roles to each ConnectorEnd owned by a Connector must be owned or inherited roles of the Classifier that owned the Connector, or they must be Ports of such roles.
	 * structuredClassifier <> null
	 * and
	 *   end->forAll( e | structuredClassifier.allRoles()->includes(e.role)
	 * or
	 *   e.role.oclIsKindOf(Port) and structuredClassifier.allRoles()->includes(e.partWithPort))
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validateRoles(DiagnosticChain diagnostics,
			Map<Object, Object> context);

} // Connector
