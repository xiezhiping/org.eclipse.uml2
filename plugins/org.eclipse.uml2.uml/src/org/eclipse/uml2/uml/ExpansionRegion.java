/*
 * Copyright (c) 2005, 2006 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *
 * $Id: ExpansionRegion.java,v 1.5 2006/02/22 20:48:15 khussey Exp $
 */
package org.eclipse.uml2.uml;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Expansion Region</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An expansion region is a strictly nested region of an activity with explicit input and outputs (modeled as ExpansionNodes). Each input is a collection of values. If there are multiple inputs, each of them must hold the same kind of collection, although the types of the elements in the different collections may vary. The expansion region is executed once for each element (or position) in the input collection.
 * 
 * 
 * 
 * The number of output collections can differ from the number of input collections. On each execution of the region, an output value from the region is inserted into an output collection at the same position as the input elements. If the region execution ends with no output, then nothing is added to the output collection. When this happens the output collection will not have the same number of elements as the input collections, the region acts as a filter. If all the executions provide an output to the collection, then the output collections will have the same number of elements as the input collections.
 * 
 * 
 * 
 * The inputs and outputs to an expansion region are modeled as ExpansionNodes. From "outside" of the region, the values on these nodes appear as collections. From "inside" the region the values appear as elements of the collections. Object flow edges connect pins outside the region to input and output expansion nodes as collections. Object flow edges connect pins inside the region to input and output expansion nodes as individual elements. From the inside of the region, these nodes are visible as individual values. If an expansion node has a name, it is the name of the individual element within the region.
 * 
 * 
 * 
 * Any object flow edges that cross the boundary of the region, without passing through expansion nodes, provide values that are fixed within the different executions of the region.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.ExpansionRegion#getMode <em>Mode</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.ExpansionRegion#getInputElements <em>Input Element</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.ExpansionRegion#getOutputElements <em>Output Element</em>}</li>
 * </ul>
 * </p>
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
	 * The way in which the executions interact:
	 * 
	 * parallel: all interactions are independent
	 * 
	 * iterative: the interactions occur in order of the elements
	 * 
	 * stream: a stream of values flows into a single execution
	 * 
	 * 
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
	 * An object node that holds a separate element of the input collection during each of the multiple executions of the region.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Input Element</em>' reference list.
	 * @see org.eclipse.uml2.uml.UMLPackage#getExpansionRegion_InputElement()
	 * @see org.eclipse.uml2.uml.ExpansionNode#getRegionAsInput
	 * @model type="org.eclipse.uml2.uml.ExpansionNode" opposite="regionAsInput" required="true" ordered="false"
	 * @generated
	 */
	EList getInputElements();

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
	 * An object node that accepts a separate element of the output collection during each of the multiple executions of the region. The values are formed into a collection that is available when the execution of the region is complete.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Output Element</em>' reference list.
	 * @see org.eclipse.uml2.uml.UMLPackage#getExpansionRegion_OutputElement()
	 * @see org.eclipse.uml2.uml.ExpansionNode#getRegionAsOutput
	 * @model type="org.eclipse.uml2.uml.ExpansionNode" opposite="regionAsOutput" ordered="false"
	 * @generated
	 */
	EList getOutputElements();

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

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An ExpansionRegion must have one or more argument ExpansionNodes and zero or more result ExpansionNodes.
	 * true
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validateExpansionNodes(DiagnosticChain diagnostics, Map context);

} // ExpansionRegion
