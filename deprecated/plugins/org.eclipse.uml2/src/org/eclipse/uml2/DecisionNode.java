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
 * $Id: DecisionNode.java,v 1.4 2005/03/15 18:44:42 khussey Exp $
 */
package org.eclipse.uml2;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Decision Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A decision node has one incoming edge and multiple outgoing activity edges. 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2.DecisionNode#getDecisionInput <em>Decision Input</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.uml2.UML2Package#getDecisionNode()
 * @model 
 * @generated
 */
public interface DecisionNode extends ControlNode{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) 2003, 2004 IBM Corporation and others."; //$NON-NLS-1$

	/**
	 * Returns the value of the '<em><b>Decision Input</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Decision Input</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Provides input to guard specifications on edges outgoing from the decision node.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Decision Input</em>' reference.
	 * @see #setDecisionInput(Behavior)
	 * @see org.eclipse.uml2.UML2Package#getDecisionNode_DecisionInput()
	 * @model 
	 * @generated
	 */
	Behavior getDecisionInput();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.DecisionNode#getDecisionInput <em>Decision Input</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Decision Input</em>' reference.
	 * @see #getDecisionInput()
	 * @generated
	 */
	void setDecisionInput(Behavior value);

} // DecisionNode
