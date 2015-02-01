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

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interruptible Activity Region</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An InterruptibleActivityRegion is an ActivityGroup that supports the termination of tokens flowing in the portions of an activity within it.
 * <p>From package UML::Activities.</p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.InterruptibleActivityRegion#getInterruptingEdges <em>Interrupting Edge</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.InterruptibleActivityRegion#getNodes <em>Node</em>}</li>
 * </ul>
 *
 * @see org.eclipse.uml2.uml.UMLPackage#getInterruptibleActivityRegion()
 * @model
 * @generated
 */
public interface InterruptibleActivityRegion
		extends ActivityGroup {

	/**
	 * Returns the value of the '<em><b>Node</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.ActivityNode}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.uml2.uml.ActivityNode#getInInterruptibleRegions <em>In Interruptible Region</em>}'.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.eclipse.uml2.uml.ActivityGroup#getContainedNodes() <em>Contained Node</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ActivityNodes immediately contained in the InterruptibleActivityRegion.
	 * <p>From package UML::Activities.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Node</em>' reference list.
	 * @see org.eclipse.uml2.uml.UMLPackage#getInterruptibleActivityRegion_Node()
	 * @see org.eclipse.uml2.uml.ActivityNode#getInInterruptibleRegions
	 * @model opposite="inInterruptibleRegion" ordered="false"
	 * @generated
	 */
	EList<ActivityNode> getNodes();

	/**
	 * Retrieves the first {@link org.eclipse.uml2.uml.ActivityNode} with the specified '<em><b>Name</b></em>' from the '<em><b>Node</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.ActivityNode} to retrieve, or <code>null</code>.
	 * @return The first {@link org.eclipse.uml2.uml.ActivityNode} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getNodes()
	 * @generated
	 */
	ActivityNode getNode(String name);

	/**
	 * Retrieves the first {@link org.eclipse.uml2.uml.ActivityNode} with the specified '<em><b>Name</b></em>' from the '<em><b>Node</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.ActivityNode} to retrieve, or <code>null</code>.
	 * @param ignoreCase Whether to ignore case in {@link java.lang.String} comparisons.
	 * @param eClass The Ecore class of the {@link org.eclipse.uml2.uml.ActivityNode} to retrieve, or <code>null</code>.
	 * @return The first {@link org.eclipse.uml2.uml.ActivityNode} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getNodes()
	 * @generated
	 */
	ActivityNode getNode(String name, boolean ignoreCase, EClass eClass);

	/**
	 * Returns the value of the '<em><b>Interrupting Edge</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.ActivityEdge}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.uml2.uml.ActivityEdge#getInterrupts <em>Interrupts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The ActivityEdges leaving the InterruptibleActivityRegion on which a traversing token will result in the termination of other tokens flowing in the InterruptibleActivityRegion.
	 * <p>From package UML::Activities.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Interrupting Edge</em>' reference list.
	 * @see org.eclipse.uml2.uml.UMLPackage#getInterruptibleActivityRegion_InterruptingEdge()
	 * @see org.eclipse.uml2.uml.ActivityEdge#getInterrupts
	 * @model opposite="interrupts" ordered="false"
	 * @generated
	 */
	EList<ActivityEdge> getInterruptingEdges();

	/**
	 * Retrieves the first {@link org.eclipse.uml2.uml.ActivityEdge} with the specified '<em><b>Name</b></em>' from the '<em><b>Interrupting Edge</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.ActivityEdge} to retrieve, or <code>null</code>.
	 * @return The first {@link org.eclipse.uml2.uml.ActivityEdge} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getInterruptingEdges()
	 * @generated
	 */
	ActivityEdge getInterruptingEdge(String name);

	/**
	 * Retrieves the first {@link org.eclipse.uml2.uml.ActivityEdge} with the specified '<em><b>Name</b></em>' from the '<em><b>Interrupting Edge</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.ActivityEdge} to retrieve, or <code>null</code>.
	 * @param ignoreCase Whether to ignore case in {@link java.lang.String} comparisons.
	 * @param eClass The Ecore class of the {@link org.eclipse.uml2.uml.ActivityEdge} to retrieve, or <code>null</code>.
	 * @return The first {@link org.eclipse.uml2.uml.ActivityEdge} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getInterruptingEdges()
	 * @generated
	 */
	ActivityEdge getInterruptingEdge(String name, boolean ignoreCase,
			EClass eClass);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The interruptingEdges of an InterruptibleActivityRegion must have their source in the region and their target outside the region, but within the same Activity containing the region.
	 * interruptingEdge->forAll(edge | 
	 *   node->includes(edge.source) and node->excludes(edge.target) and edge.target.containingActivity() = inActivity)
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validateInterruptingEdges(DiagnosticChain diagnostics,
			Map<Object, Object> context);

} // InterruptibleActivityRegion
