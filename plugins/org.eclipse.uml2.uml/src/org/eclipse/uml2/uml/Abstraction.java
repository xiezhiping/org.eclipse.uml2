/*
 * Copyright (c) 2005, 2015 IBM Corporation, CEA, and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *   Christian W. Damus (CEA) - 251963
 *   Kenn Hussey (CEA) - 418466, 451350
 *
 */
package org.eclipse.uml2.uml;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstraction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An Abstraction is a Relationship that relates two Elements or sets of Elements that represent the same concept at different levels of abstraction or from different viewpoints.
 * <p>From package UML::CommonStructure.</p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.Abstraction#getMapping <em>Mapping</em>}</li>
 * </ul>
 *
 * @see org.eclipse.uml2.uml.UMLPackage#getAbstraction()
 * @model
 * @generated
 */
public interface Abstraction
		extends Dependency {

	/**
	 * Returns the value of the '<em><b>Mapping</b></em>' containment reference.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.eclipse.uml2.uml.Element#getOwnedElements() <em>Owned Element</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An OpaqueExpression that states the abstraction relationship between the supplier(s) and the client(s). In some cases, such as derivation, it is usually formal and unidirectional; in other cases, such as trace, it is usually informal and bidirectional. The mapping expression is optional and may be omitted if the precise relationship between the Elements is not specified.
	 * <p>From package UML::CommonStructure.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Mapping</em>' containment reference.
	 * @see #setMapping(OpaqueExpression)
	 * @see org.eclipse.uml2.uml.UMLPackage#getAbstraction_Mapping()
	 * @model containment="true" resolveProxies="true" ordered="false"
	 * @generated
	 */
	OpaqueExpression getMapping();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.uml.Abstraction#getMapping <em>Mapping</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mapping</em>' containment reference.
	 * @see #getMapping()
	 * @generated
	 */
	void setMapping(OpaqueExpression value);

	/**
	 * Creates a new {@link org.eclipse.uml2.uml.OpaqueExpression},with the specified '<em><b>Name</b></em>', and '<em><b>Type</b></em>', and sets the '<em><b>Mapping</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' for the new {@link org.eclipse.uml2.uml.OpaqueExpression}, or <code>null</code>.
	 * @param type The '<em><b>Type</b></em>' for the new {@link org.eclipse.uml2.uml.OpaqueExpression}, or <code>null</code>.
	 * @return The new {@link org.eclipse.uml2.uml.OpaqueExpression}.
	 * @see #getMapping()
	 * @generated
	 */
	OpaqueExpression createMapping(String name, Type type);

} // Abstraction
