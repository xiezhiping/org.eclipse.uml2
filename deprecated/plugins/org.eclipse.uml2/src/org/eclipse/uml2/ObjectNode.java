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
 * $Id: ObjectNode.java,v 1.5 2005/03/15 18:44:43 khussey Exp $
 */
package org.eclipse.uml2;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Object Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2.ObjectNode#getOrdering <em>Ordering</em>}</li>
 *   <li>{@link org.eclipse.uml2.ObjectNode#getUpperBound <em>Upper Bound</em>}</li>
 *   <li>{@link org.eclipse.uml2.ObjectNode#getInStates <em>In State</em>}</li>
 *   <li>{@link org.eclipse.uml2.ObjectNode#getSelection <em>Selection</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.uml2.UML2Package#getObjectNode()
 * @model abstract="true"
 * @generated
 */
public interface ObjectNode extends ActivityNode, TypedElement{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) 2003, 2004 IBM Corporation and others."; //$NON-NLS-1$

	/**
	 * Returns the value of the '<em><b>Ordering</b></em>' attribute.
	 * The default value is <code>"FIFO"</code>.
	 * The literals are from the enumeration {@link org.eclipse.uml2.ObjectNodeOrderingKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ordering</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * = FIFO Tells whether and how the tokens in the object node are ordered for selection to traverse edges outgoing from the object node.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ordering</em>' attribute.
	 * @see org.eclipse.uml2.ObjectNodeOrderingKind
	 * @see #setOrdering(ObjectNodeOrderingKind)
	 * @see org.eclipse.uml2.UML2Package#getObjectNode_Ordering()
	 * @model default="FIFO"
	 * @generated
	 */
	ObjectNodeOrderingKind getOrdering();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.ObjectNode#getOrdering <em>Ordering</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ordering</em>' attribute.
	 * @see org.eclipse.uml2.ObjectNodeOrderingKind
	 * @see #getOrdering()
	 * @generated
	 */
	void setOrdering(ObjectNodeOrderingKind value);

	/**
	 * Returns the value of the '<em><b>Upper Bound</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Upper Bound</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Upper Bound</em>' containment reference.
	 * @see #setUpperBound(ValueSpecification)
	 * @see org.eclipse.uml2.UML2Package#getObjectNode_UpperBound()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ValueSpecification getUpperBound();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.ObjectNode#getUpperBound <em>Upper Bound</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Upper Bound</em>' containment reference.
	 * @see #getUpperBound()
	 * @generated
	 */
	void setUpperBound(ValueSpecification value);

    /**
     * Creates a {@link org.eclipse.uml2.ValueSpecification} and sets the '<em><b>Upper Bound</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param eClass The Ecore class of the {@link org.eclipse.uml2.ValueSpecification} to create.
	 * @return The new {@link org.eclipse.uml2.ValueSpecification}.
	 * @see #getUpperBound()
	 * @generated
     */
    ValueSpecification createUpperBound(EClass eClass);
     
	/**
	 * Returns the value of the '<em><b>In State</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.State}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>In State</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The required states of the object available at this point in the activity.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>In State</em>' reference list.
	 * @see org.eclipse.uml2.UML2Package#getObjectNode_InState()
	 * @model type="org.eclipse.uml2.State" ordered="false"
	 * @generated
	 */
	EList getInStates();

    /**
     * Retrieves the {@link org.eclipse.uml2.State} with the specified name from the '<em><b>In State</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param unqualifiedName The unqualified name of the {@link org.eclipse.uml2.State} to retrieve.
	 * @return The {@link org.eclipse.uml2.State} with the specified name, or <code>null</code>.
	 * @see #getInStates()
	 * @generated
     */
    State getInState(String unqualifiedName);
      
	/**
	 * Returns the value of the '<em><b>Selection</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Selection</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Selection</em>' reference.
	 * @see #setSelection(Behavior)
	 * @see org.eclipse.uml2.UML2Package#getObjectNode_Selection()
	 * @model 
	 * @generated
	 */
	Behavior getSelection();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.ObjectNode#getSelection <em>Selection</em>}' reference.
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
	 * @model parameters=""
	 * @generated
	 */
	EList getOwnedElements();

} // ObjectNode
