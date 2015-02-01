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
 * A representation of the model object '<em><b>Object Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An ObjectNode is an abstract ActivityNode that may hold tokens within the object flow in an Activity. ObjectNodes also support token selection, limitation on the number of tokens held, specification of the state required for tokens being held, and carrying control values.
 * <p>From package UML::Activities.</p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.ObjectNode#getInStates <em>In State</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.ObjectNode#isControlType <em>Is Control Type</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.ObjectNode#getOrdering <em>Ordering</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.ObjectNode#getSelection <em>Selection</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.ObjectNode#getUpperBound <em>Upper Bound</em>}</li>
 * </ul>
 *
 * @see org.eclipse.uml2.uml.UMLPackage#getObjectNode()
 * @model abstract="true"
 * @generated
 */
public interface ObjectNode
		extends ActivityNode, TypedElement {

	/**
	 * Returns the value of the '<em><b>Ordering</b></em>' attribute.
	 * The default value is <code>"FIFO"</code>.
	 * The literals are from the enumeration {@link org.eclipse.uml2.uml.ObjectNodeOrderingKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates how the tokens held by the ObjectNode are ordered for selection to traverse ActivityEdges outgoing from the ObjectNode.
	 * <p>From package UML::Activities.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ordering</em>' attribute.
	 * @see org.eclipse.uml2.uml.ObjectNodeOrderingKind
	 * @see #setOrdering(ObjectNodeOrderingKind)
	 * @see org.eclipse.uml2.uml.UMLPackage#getObjectNode_Ordering()
	 * @model default="FIFO" required="true" ordered="false"
	 * @generated
	 */
	ObjectNodeOrderingKind getOrdering();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.uml.ObjectNode#getOrdering <em>Ordering</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ordering</em>' attribute.
	 * @see org.eclipse.uml2.uml.ObjectNodeOrderingKind
	 * @see #getOrdering()
	 * @generated
	 */
	void setOrdering(ObjectNodeOrderingKind value);

	/**
	 * Returns the value of the '<em><b>Is Control Type</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates whether the type of the ObjectNode is to be treated as representing control values that may traverse ControlFlows.
	 * <p>From package UML::Activities.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Control Type</em>' attribute.
	 * @see #setIsControlType(boolean)
	 * @see org.eclipse.uml2.uml.UMLPackage#getObjectNode_IsControlType()
	 * @model default="false" dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isControlType();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.uml.ObjectNode#isControlType <em>Is Control Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Control Type</em>' attribute.
	 * @see #isControlType()
	 * @generated
	 */
	void setIsControlType(boolean value);

	/**
	 * Returns the value of the '<em><b>Upper Bound</b></em>' containment reference.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.eclipse.uml2.uml.Element#getOwnedElements() <em>Owned Element</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The maximum number of tokens that may be held by this ObjectNode. Tokens cannot flow into the ObjectNode if the upperBound is reached. If no upperBound is specified, then there is no limit on how many tokens the ObjectNode can hold.
	 * <p>From package UML::Activities.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Upper Bound</em>' containment reference.
	 * @see #setUpperBound(ValueSpecification)
	 * @see org.eclipse.uml2.uml.UMLPackage#getObjectNode_UpperBound()
	 * @model containment="true" resolveProxies="true" ordered="false"
	 * @generated
	 */
	ValueSpecification getUpperBound();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.uml.ObjectNode#getUpperBound <em>Upper Bound</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Upper Bound</em>' containment reference.
	 * @see #getUpperBound()
	 * @generated
	 */
	void setUpperBound(ValueSpecification value);

	/**
	 * Creates a new {@link org.eclipse.uml2.uml.ValueSpecification}, with the specified '<em><b>Name</b></em>', and '<em><b>Type</b></em>', and sets the '<em><b>Upper Bound</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' for the new {@link org.eclipse.uml2.uml.ValueSpecification}, or <code>null</code>.
	 * @param type The '<em><b>Type</b></em>' for the new {@link org.eclipse.uml2.uml.ValueSpecification}, or <code>null</code>.
	 * @param eClass The Ecore class of the {@link org.eclipse.uml2.uml.ValueSpecification} to create.
	 * @return The new {@link org.eclipse.uml2.uml.ValueSpecification}.
	 * @see #getUpperBound()
	 * @generated
	 */
	ValueSpecification createUpperBound(String name, Type type, EClass eClass);

	/**
	 * Returns the value of the '<em><b>In State</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.State}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The States required to be associated with the values held by tokens on this ObjectNode.
	 * <p>From package UML::Activities.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>In State</em>' reference list.
	 * @see org.eclipse.uml2.uml.UMLPackage#getObjectNode_InState()
	 * @model ordered="false"
	 * @generated
	 */
	EList<State> getInStates();

	/**
	 * Retrieves the first {@link org.eclipse.uml2.uml.State} with the specified '<em><b>Name</b></em>' from the '<em><b>In State</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.State} to retrieve, or <code>null</code>.
	 * @return The first {@link org.eclipse.uml2.uml.State} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getInStates()
	 * @generated
	 */
	State getInState(String name);

	/**
	 * Retrieves the first {@link org.eclipse.uml2.uml.State} with the specified '<em><b>Name</b></em>' from the '<em><b>In State</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.State} to retrieve, or <code>null</code>.
	 * @param ignoreCase Whether to ignore case in {@link java.lang.String} comparisons.
	 * @param eClass The Ecore class of the {@link org.eclipse.uml2.uml.State} to retrieve, or <code>null</code>.
	 * @return The first {@link org.eclipse.uml2.uml.State} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getInStates()
	 * @generated
	 */
	State getInState(String name, boolean ignoreCase, EClass eClass);

	/**
	 * Returns the value of the '<em><b>Selection</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A Behavior used to select tokens to be offered on outgoing ActivityEdges.
	 * <p>From package UML::Activities.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Selection</em>' reference.
	 * @see #setSelection(Behavior)
	 * @see org.eclipse.uml2.uml.UMLPackage#getObjectNode_Selection()
	 * @model ordered="false"
	 * @generated
	 */
	Behavior getSelection();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.uml.ObjectNode#getSelection <em>Selection</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Selection</em>' reference.
	 * @see #getSelection()
	 * @generated
	 */
	void setSelection(Behavior value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If isControlType=false, the ActivityEdges incoming to or outgoing from an ObjectNode must all be ObjectFlows.
	 * (not isControlType) implies incoming->union(outgoing)->forAll(oclIsKindOf(ObjectFlow))
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validateObjectFlowEdges(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If an ObjectNode has a selection Behavior, then the ordering of the object node is ordered, and vice versa.
	 * (selection<>null) = (ordering=ObjectNodeOrderingKind::ordered)
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validateSelectionBehavior(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A selection Behavior has one input Parameter and one output Parameter. The input Parameter must have the same type as  or a supertype of the type of ObjectNode, be non-unique, and have multiplicity 0..*. The output Parameter must be the same or a subtype of the type of ObjectNode. The Behavior cannot have side effects.
	 * selection<>null implies
	 * 	selection.inputParameters()->size()=1 and
	 * 	selection.inputParameters()->forAll(p | not p.isUnique and p.is(0,*) and self.type.conformsTo(p.type)) and
	 * 	selection.outputParameters()->size()=1 and
	 * 		selection.inputParameters()->forAll(p | self.type.conformsTo(p.type))
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validateInputOutputParameter(DiagnosticChain diagnostics,
			Map<Object, Object> context);

} // ObjectNode
