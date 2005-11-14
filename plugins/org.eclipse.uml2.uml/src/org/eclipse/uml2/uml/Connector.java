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
 * $Id: Connector.java,v 1.1 2005/11/14 22:25:59 khussey Exp $
 */
package org.eclipse.uml2.uml;

import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Connector</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Each connector may be attached to two or more connectable elements, each representing a set of instances. Each connector end is distinct in the sense that it plays a distinct role in the communication realized over a connector. The communications realized over a connector may be constrained by various constraints (including type constraints) that apply to the attached connectable elements.
 * In the metamodel, a connector kind attribute is added to the Connector metaclass. Its value is an enumeration type with valid values 'assembly' or 'delegation'.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.Connector#getType <em>Type</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Connector#getRedefinedConnectors <em>Redefined Connector</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Connector#getEnds <em>End</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Connector#getKind <em>Kind</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Connector#getContracts <em>Contract</em>}</li>
 * </ul>
 * </p>
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
	 * An optional association that specifies the link corresponding to this connector.
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A connector may be redefined when its containing classifier is specialized. The redefining connector may have a type that specializes the type of the redefined connector.
	 * 
	 * The types of the connector ends of the redefining connector may specialize the types of the connector ends of the redefined connector. The properties of the connector ends of the redefining connector may be replaced.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Redefined Connector</em>' reference list.
	 * @see org.eclipse.uml2.uml.UMLPackage#getConnector_RedefinedConnector()
	 * @model type="org.eclipse.uml2.uml.Connector" ordered="false"
	 * @generated
	 */
	List getRedefinedConnectors();

	/**
	 * Retrieves the {@link org.eclipse.uml2.uml.Connector} with the specified '<em><b>Name</b></em>' from the '<em><b>Redefined Connector</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.Connector} to retrieve.
	 * @return The {@link org.eclipse.uml2.uml.Connector} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getRedefinedConnectors()
	 * @generated
	 */
	Connector getRedefinedConnector(String name);

	/**
	 * Returns the value of the '<em><b>End</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.ConnectorEnd}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A connector consists of at least two connector ends, each representing the participation of instances of the classifiers typing the connectable elements attached to this end. The set of connector ends is ordered.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>End</em>' containment reference list.
	 * @see org.eclipse.uml2.uml.UMLPackage#getConnector_End()
	 * @model type="org.eclipse.uml2.uml.ConnectorEnd" containment="true" resolveProxies="false" lower="2"
	 * @generated
	 */
	List getEnds();

	/**
	 * Creates a {@link org.eclipse.uml2.uml.ConnectorEnd} and appends it to the '<em><b>End</b></em>' containment reference list.
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
	 * Indicates the kind of connector.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see org.eclipse.uml2.uml.ConnectorKind
	 * @see #setKind(ConnectorKind)
	 * @see org.eclipse.uml2.uml.UMLPackage#getConnector_Kind()
	 * @model ordered="false"
	 * @generated
	 */
	ConnectorKind getKind();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.uml.Connector#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see org.eclipse.uml2.uml.ConnectorKind
	 * @see #getKind()
	 * @generated
	 */
	void setKind(ConnectorKind value);

	/**
	 * Returns the value of the '<em><b>Contract</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.Behavior}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contract</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contract</em>' reference list.
	 * @see org.eclipse.uml2.uml.UMLPackage#getConnector_Contract()
	 * @model type="org.eclipse.uml2.uml.Behavior" ordered="false"
	 * @generated
	 */
	List getContracts();

	/**
	 * Retrieves the {@link org.eclipse.uml2.uml.Behavior} with the specified '<em><b>Name</b></em>' from the '<em><b>Contract</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.Behavior} to retrieve.
	 * @return The {@link org.eclipse.uml2.uml.Behavior} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getContracts()
	 * @generated
	 */
	Behavior getContract(String name);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The types of the connectable elements that the ends of a connector are attached to must conform to the types of the association ends of the association that types the connector, if any.
	 * true
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validateTypes(DiagnosticChain diagnostics, Map context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The connectable elements attached to the ends of a connector must be compatible.
	 * true
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validateCompatible(DiagnosticChain diagnostics, Map context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The ConnectableElements attached as roles to each ConnectorEnd owned by a Connector must be roles of the Classifier that owned the Connector, or they must be ports of such roles.
	 * true
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validateRoles(DiagnosticChain diagnostics, Map context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A delegation connector must only be defined between used Interfaces or Ports of the same kind, e.g. between two provided Ports or between two required Ports.
	 * true
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validateBetweenInterfacesPorts(DiagnosticChain diagnostics,
			Map context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If a delegation connector is defined between a used Interface or Port and an internal Part Classifier, then that Classifier must have an 'implements' relationship to the Interface type of that Port.
	 * true
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validateBetweenInterfacePortImplements(DiagnosticChain diagnostics,
			Map context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If a delegation connector is defined between a source Interface or Port and a target Interface or Port, then the target Interface must support a signature compatible subset of Operations of the source Interface or Port.
	 * true
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validateBetweenInterfacePortSignature(DiagnosticChain diagnostics,
			Map context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * In a complete model, if a source Port has delegation connectors to a set of delegated target Ports, then the union of the Interfaces of these target Ports must be signature compatible with the Interface that types the source Port.
	 * true
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validateUnionSignatureCompatible(DiagnosticChain diagnostics,
			Map context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An assembly connector must only be defined from a required Interface or Ports to a provided Interface or Port.
	 * true
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validateAssemblyConnector(DiagnosticChain diagnostics, Map context);

} // Connector
