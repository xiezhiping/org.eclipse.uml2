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

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Expansion Region</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2.ExpansionRegion#getMode <em>Mode</em>}</li>
 *   <li>{@link org.eclipse.uml2.ExpansionRegion#getOutputElements <em>Output Element</em>}</li>
 *   <li>{@link org.eclipse.uml2.ExpansionRegion#getInputElements <em>Input Element</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.uml2.UML2Package#getExpansionRegion()
 * @model 
 * @generated
 */
public interface ExpansionRegion extends StructuredActivityNode{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) 2003, 2004 IBM Corporation and others."; //$NON-NLS-1$

	/**
	 * Returns the value of the '<em><b>Mode</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.uml2.ExpansionKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mode</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mode</em>' attribute.
	 * @see org.eclipse.uml2.ExpansionKind
	 * @see #setMode(ExpansionKind)
	 * @see org.eclipse.uml2.UML2Package#getExpansionRegion_Mode()
	 * @model 
	 * @generated
	 */
	ExpansionKind getMode();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.ExpansionRegion#getMode <em>Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mode</em>' attribute.
	 * @see org.eclipse.uml2.ExpansionKind
	 * @see #getMode()
	 * @generated
	 */
	void setMode(ExpansionKind value);

	/**
	 * Returns the value of the '<em><b>Output Element</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.ExpansionNode}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.uml2.ExpansionNode#getRegionAsOutput <em>Region As Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Output Element</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output Element</em>' reference list.
	 * @see org.eclipse.uml2.UML2Package#getExpansionRegion_OutputElement()
	 * @see org.eclipse.uml2.ExpansionNode#getRegionAsOutput
	 * @model type="org.eclipse.uml2.ExpansionNode" opposite="regionAsOutput"
	 * @generated
	 */
	EList getOutputElements();

    /**
     * Retrieves the {@link org.eclipse.uml2.ExpansionNode} with the specified name from the '<em><b>Output Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param unqualifiedName The unqualified name of the {@link org.eclipse.uml2.ExpansionNode} to retrieve.
	 * @return The {@link org.eclipse.uml2.ExpansionNode} with the specified name, or <code>null</code>.
	 * @see #getOutputElements()
	 * @generated
     */
    ExpansionNode getOutputElement(String unqualifiedName);
      
	/**
	 * Returns the value of the '<em><b>Input Element</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.ExpansionNode}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.uml2.ExpansionNode#getRegionAsInput <em>Region As Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input Element</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input Element</em>' reference list.
	 * @see org.eclipse.uml2.UML2Package#getExpansionRegion_InputElement()
	 * @see org.eclipse.uml2.ExpansionNode#getRegionAsInput
	 * @model type="org.eclipse.uml2.ExpansionNode" opposite="regionAsInput" required="true"
	 * @generated
	 */
	EList getInputElements();

    /**
     * Retrieves the {@link org.eclipse.uml2.ExpansionNode} with the specified name from the '<em><b>Input Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param unqualifiedName The unqualified name of the {@link org.eclipse.uml2.ExpansionNode} to retrieve.
	 * @return The {@link org.eclipse.uml2.ExpansionNode} with the specified name, or <code>null</code>.
	 * @see #getInputElements()
	 * @generated
     */
    ExpansionNode getInputElement(String unqualifiedName);
      
} // ExpansionRegion
