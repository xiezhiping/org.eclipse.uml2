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

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Expansion Region</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An ExpansionRegion is a StructuredActivityNode that executes its content multiple times corresponding to elements of input collection(s).
 * <p>From package UML::Actions.</p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.ExpansionRegion#getMode <em>Mode</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.ExpansionRegion#getOutputElements <em>Output Element</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.ExpansionRegion#getInputElements <em>Input Element</em>}</li>
 * </ul>
 *
 * @see org.eclipse.uml2.uml.UMLPackage#getExpansionRegion()
 * @model
 * @generated
 */
public interface ExpansionRegion
		extends StructuredActivityNode {

	/**
	 * Returns the value of the '<em><b>Mode</b></em>' attribute.
	 * The default value is <code>"iterative"</code>.
	 * The literals are from the enumeration {@link org.eclipse.uml2.uml.ExpansionKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The mode in which the ExpansionRegion executes its contents. If parallel, executions are concurrent. If iterative, executions are sequential. If stream, a stream of values flows into a single execution.
	 * <p>From package UML::Actions.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Mode</em>' attribute.
	 * @see org.eclipse.uml2.uml.ExpansionKind
	 * @see #setMode(ExpansionKind)
	 * @see org.eclipse.uml2.uml.UMLPackage#getExpansionRegion_Mode()
	 * @model default="iterative" required="true" ordered="false"
	 * @generated
	 */
	ExpansionKind getMode();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.uml.ExpansionRegion#getMode <em>Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mode</em>' attribute.
	 * @see org.eclipse.uml2.uml.ExpansionKind
	 * @see #getMode()
	 * @generated
	 */
	void setMode(ExpansionKind value);

	/**
	 * Returns the value of the '<em><b>Input Element</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.ExpansionNode}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.uml2.uml.ExpansionNode#getRegionAsInput <em>Region As Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The ExpansionNodes that hold the input collections for the ExpansionRegion.
	 * <p>From package UML::Actions.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Input Element</em>' reference list.
	 * @see org.eclipse.uml2.uml.UMLPackage#getExpansionRegion_InputElement()
	 * @see org.eclipse.uml2.uml.ExpansionNode#getRegionAsInput
	 * @model opposite="regionAsInput" required="true" ordered="false"
	 * @generated
	 */
	EList<ExpansionNode> getInputElements();

	/**
	 * Retrieves the first {@link org.eclipse.uml2.uml.ExpansionNode} with the specified '<em><b>Name</b></em>', and '<em><b>Type</b></em>' from the '<em><b>Input Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.ExpansionNode} to retrieve, or <code>null</code>.
	 * @param type The '<em><b>Type</b></em>' of the {@link org.eclipse.uml2.uml.ExpansionNode} to retrieve, or <code>null</code>.
	 * @return The first {@link org.eclipse.uml2.uml.ExpansionNode} with the specified '<em><b>Name</b></em>', and '<em><b>Type</b></em>', or <code>null</code>.
	 * @see #getInputElements()
	 * @generated
	 */
	ExpansionNode getInputElement(String name, Type type);

	/**
	 * Retrieves the first {@link org.eclipse.uml2.uml.ExpansionNode} with the specified '<em><b>Name</b></em>', and '<em><b>Type</b></em>' from the '<em><b>Input Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.ExpansionNode} to retrieve, or <code>null</code>.
	 * @param type The '<em><b>Type</b></em>' of the {@link org.eclipse.uml2.uml.ExpansionNode} to retrieve, or <code>null</code>.
	 * @param ignoreCase Whether to ignore case in {@link java.lang.String} comparisons.
	 * @return The first {@link org.eclipse.uml2.uml.ExpansionNode} with the specified '<em><b>Name</b></em>', and '<em><b>Type</b></em>', or <code>null</code>.
	 * @see #getInputElements()
	 * @generated
	 */
	ExpansionNode getInputElement(String name, Type type, boolean ignoreCase);

	/**
	 * Returns the value of the '<em><b>Output Element</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.ExpansionNode}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.uml2.uml.ExpansionNode#getRegionAsOutput <em>Region As Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The ExpansionNodes that form the output collections of the ExpansionRegion.
	 * <p>From package UML::Actions.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Output Element</em>' reference list.
	 * @see org.eclipse.uml2.uml.UMLPackage#getExpansionRegion_OutputElement()
	 * @see org.eclipse.uml2.uml.ExpansionNode#getRegionAsOutput
	 * @model opposite="regionAsOutput" ordered="false"
	 * @generated
	 */
	EList<ExpansionNode> getOutputElements();

	/**
	 * Retrieves the first {@link org.eclipse.uml2.uml.ExpansionNode} with the specified '<em><b>Name</b></em>', and '<em><b>Type</b></em>' from the '<em><b>Output Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.ExpansionNode} to retrieve, or <code>null</code>.
	 * @param type The '<em><b>Type</b></em>' of the {@link org.eclipse.uml2.uml.ExpansionNode} to retrieve, or <code>null</code>.
	 * @return The first {@link org.eclipse.uml2.uml.ExpansionNode} with the specified '<em><b>Name</b></em>', and '<em><b>Type</b></em>', or <code>null</code>.
	 * @see #getOutputElements()
	 * @generated
	 */
	ExpansionNode getOutputElement(String name, Type type);

	/**
	 * Retrieves the first {@link org.eclipse.uml2.uml.ExpansionNode} with the specified '<em><b>Name</b></em>', and '<em><b>Type</b></em>' from the '<em><b>Output Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.ExpansionNode} to retrieve, or <code>null</code>.
	 * @param type The '<em><b>Type</b></em>' of the {@link org.eclipse.uml2.uml.ExpansionNode} to retrieve, or <code>null</code>.
	 * @param ignoreCase Whether to ignore case in {@link java.lang.String} comparisons.
	 * @return The first {@link org.eclipse.uml2.uml.ExpansionNode} with the specified '<em><b>Name</b></em>', and '<em><b>Type</b></em>', or <code>null</code>.
	 * @see #getOutputElements()
	 * @generated
	 */
	ExpansionNode getOutputElement(String name, Type type, boolean ignoreCase);

} // ExpansionRegion
