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

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Join Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A JoinNode is a ControlNode that synchronizes multiple flows.
 * <p>From package UML::Activities.</p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.JoinNode#isCombineDuplicate <em>Is Combine Duplicate</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.JoinNode#getJoinSpec <em>Join Spec</em>}</li>
 * </ul>
 *
 * @see org.eclipse.uml2.uml.UMLPackage#getJoinNode()
 * @model
 * @generated
 */
public interface JoinNode
		extends ControlNode {

	/**
	 * Returns the value of the '<em><b>Is Combine Duplicate</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates whether incoming tokens having objects with the same identity are combined into one by the JoinNode.
	 * <p>From package UML::Activities.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Combine Duplicate</em>' attribute.
	 * @see #setIsCombineDuplicate(boolean)
	 * @see org.eclipse.uml2.uml.UMLPackage#getJoinNode_IsCombineDuplicate()
	 * @model default="true" dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isCombineDuplicate();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.uml.JoinNode#isCombineDuplicate <em>Is Combine Duplicate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Combine Duplicate</em>' attribute.
	 * @see #isCombineDuplicate()
	 * @generated
	 */
	void setIsCombineDuplicate(boolean value);

	/**
	 * Returns the value of the '<em><b>Join Spec</b></em>' containment reference.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.eclipse.uml2.uml.Element#getOwnedElements() <em>Owned Element</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A ValueSpecification giving the condition under which the JoinNode will offer a token on its outgoing ActivityEdge. If no joinSpec is specified, then the JoinNode will offer an outgoing token if tokens are offered on all of its incoming ActivityEdges (an "and" condition).
	 * <p>From package UML::Activities.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Join Spec</em>' containment reference.
	 * @see #setJoinSpec(ValueSpecification)
	 * @see org.eclipse.uml2.uml.UMLPackage#getJoinNode_JoinSpec()
	 * @model containment="true" resolveProxies="true" ordered="false"
	 * @generated
	 */
	ValueSpecification getJoinSpec();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.uml.JoinNode#getJoinSpec <em>Join Spec</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Join Spec</em>' containment reference.
	 * @see #getJoinSpec()
	 * @generated
	 */
	void setJoinSpec(ValueSpecification value);

	/**
	 * Creates a new {@link org.eclipse.uml2.uml.ValueSpecification}, with the specified '<em><b>Name</b></em>', and '<em><b>Type</b></em>', and sets the '<em><b>Join Spec</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' for the new {@link org.eclipse.uml2.uml.ValueSpecification}, or <code>null</code>.
	 * @param type The '<em><b>Type</b></em>' for the new {@link org.eclipse.uml2.uml.ValueSpecification}, or <code>null</code>.
	 * @param eClass The Ecore class of the {@link org.eclipse.uml2.uml.ValueSpecification} to create.
	 * @return The new {@link org.eclipse.uml2.uml.ValueSpecification}.
	 * @see #getJoinSpec()
	 * @generated
	 */
	ValueSpecification createJoinSpec(String name, Type type, EClass eClass);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A JoinNode has one outgoing ActivityEdge.
	 * outgoing->size() = 1
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validateOneOutgoingEdge(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If one of the incoming ActivityEdges of a JoinNode is an ObjectFlow, then its outgoing ActivityEdge must be an ObjectFlow. Otherwise its outgoing ActivityEdge must be a ControlFlow.
	 * if incoming->exists(oclIsKindOf(ObjectFlow)) then outgoing->forAll(oclIsKindOf(ObjectFlow))
	 * else outgoing->forAll(oclIsKindOf(ControlFlow))
	 * endif
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validateIncomingObjectFlow(DiagnosticChain diagnostics,
			Map<Object, Object> context);

} // JoinNode
