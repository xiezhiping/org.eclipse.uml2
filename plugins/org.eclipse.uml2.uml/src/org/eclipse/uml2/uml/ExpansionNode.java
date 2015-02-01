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

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Expansion Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An ExpansionNode is an ObjectNode used to indicate a collection input or output for an ExpansionRegion. A collection input of an ExpansionRegion contains a collection that is broken into its individual elements inside the region, whose content is executed once per element. A collection output of an ExpansionRegion combines individual elements produced by the execution of the region into a collection for use outside the region.
 * <p>From package UML::Actions.</p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.ExpansionNode#getRegionAsInput <em>Region As Input</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.ExpansionNode#getRegionAsOutput <em>Region As Output</em>}</li>
 * </ul>
 *
 * @see org.eclipse.uml2.uml.UMLPackage#getExpansionNode()
 * @model
 * @generated
 */
public interface ExpansionNode
		extends ObjectNode {

	/**
	 * Returns the value of the '<em><b>Region As Output</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.uml2.uml.ExpansionRegion#getOutputElements <em>Output Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The ExpansionRegion for which the ExpansionNode is an output.
	 * <p>From package UML::Actions.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Region As Output</em>' reference.
	 * @see #setRegionAsOutput(ExpansionRegion)
	 * @see org.eclipse.uml2.uml.UMLPackage#getExpansionNode_RegionAsOutput()
	 * @see org.eclipse.uml2.uml.ExpansionRegion#getOutputElements
	 * @model opposite="outputElement" ordered="false"
	 * @generated
	 */
	ExpansionRegion getRegionAsOutput();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.uml.ExpansionNode#getRegionAsOutput <em>Region As Output</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Region As Output</em>' reference.
	 * @see #getRegionAsOutput()
	 * @generated
	 */
	void setRegionAsOutput(ExpansionRegion value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * One of regionAsInput or regionAsOutput must be non-empty, but not both.
	 * regionAsInput->notEmpty() xor regionAsOutput->notEmpty()
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validateRegionAsInputOrOutput(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * Returns the value of the '<em><b>Region As Input</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.uml2.uml.ExpansionRegion#getInputElements <em>Input Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The ExpansionRegion for which the ExpansionNode is an input.
	 * <p>From package UML::Actions.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Region As Input</em>' reference.
	 * @see #setRegionAsInput(ExpansionRegion)
	 * @see org.eclipse.uml2.uml.UMLPackage#getExpansionNode_RegionAsInput()
	 * @see org.eclipse.uml2.uml.ExpansionRegion#getInputElements
	 * @model opposite="inputElement" ordered="false"
	 * @generated
	 */
	ExpansionRegion getRegionAsInput();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.uml.ExpansionNode#getRegionAsInput <em>Region As Input</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Region As Input</em>' reference.
	 * @see #getRegionAsInput()
	 * @generated
	 */
	void setRegionAsInput(ExpansionRegion value);

} // ExpansionNode
