/*
 * Copyright (c) 2003, 2004 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Common Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/cpl-v10.html
 *
 * Contributors:
 *   IBM - Initial API and implementation
 */
package org.eclipse.uml2;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Expansion Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2.ExpansionNode#getRegionAsOutput <em>Region As Output</em>}</li>
 *   <li>{@link org.eclipse.uml2.ExpansionNode#getRegionAsInput <em>Region As Input</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.uml2.UML2Package#getExpansionNode()
 * @model 
 * @generated
 */
public interface ExpansionNode extends ObjectNode{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) 2003, 2004 IBM Corporation and others."; //$NON-NLS-1$

	/**
	 * Returns the value of the '<em><b>Region As Output</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.uml2.ExpansionRegion#getOutputElements <em>Output Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Region As Output</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Region As Output</em>' reference.
	 * @see #setRegionAsOutput(ExpansionRegion)
	 * @see org.eclipse.uml2.UML2Package#getExpansionNode_RegionAsOutput()
	 * @see org.eclipse.uml2.ExpansionRegion#getOutputElements
	 * @model opposite="outputElement"
	 * @generated
	 */
	ExpansionRegion getRegionAsOutput();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.ExpansionNode#getRegionAsOutput <em>Region As Output</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Region As Output</em>' reference.
	 * @see #getRegionAsOutput()
	 * @generated
	 */
	void setRegionAsOutput(ExpansionRegion value);

	/**
	 * Returns the value of the '<em><b>Region As Input</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.uml2.ExpansionRegion#getInputElements <em>Input Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Region As Input</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Region As Input</em>' reference.
	 * @see #setRegionAsInput(ExpansionRegion)
	 * @see org.eclipse.uml2.UML2Package#getExpansionNode_RegionAsInput()
	 * @see org.eclipse.uml2.ExpansionRegion#getInputElements
	 * @model opposite="inputElement"
	 * @generated
	 */
	ExpansionRegion getRegionAsInput();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.ExpansionNode#getRegionAsInput <em>Region As Input</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Region As Input</em>' reference.
	 * @see #getRegionAsInput()
	 * @generated
	 */
	void setRegionAsInput(ExpansionRegion value);

} // ExpansionNode
