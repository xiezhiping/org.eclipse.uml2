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
 * $Id: Clause.java,v 1.6 2005/04/04 20:11:14 khussey Exp $
 */
package org.eclipse.uml2;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Clause</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2.Clause#getTests <em>Test</em>}</li>
 *   <li>{@link org.eclipse.uml2.Clause#getBodies <em>Body</em>}</li>
 *   <li>{@link org.eclipse.uml2.Clause#getPredecessorClauses <em>Predecessor Clause</em>}</li>
 *   <li>{@link org.eclipse.uml2.Clause#getSuccessorClauses <em>Successor Clause</em>}</li>
 *   <li>{@link org.eclipse.uml2.Clause#getDecider <em>Decider</em>}</li>
 *   <li>{@link org.eclipse.uml2.Clause#getBodyOutputs <em>Body Output</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.uml2.UML2Package#getClause()
 * @model
 * @generated
 */
public interface Clause extends Element{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) 2003, 2005 IBM Corporation and others."; //$NON-NLS-1$

	/**
	 * Returns the value of the '<em><b>Test</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.ActivityNode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Test</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test</em>' reference list.
	 * @see org.eclipse.uml2.UML2Package#getClause_Test()
	 * @model type="org.eclipse.uml2.ActivityNode" ordered="false"
	 * @generated
	 */
	EList getTests();

    /**
     * Retrieves the {@link org.eclipse.uml2.ActivityNode} with the specified name from the '<em><b>Test</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param unqualifiedName The unqualified name of the {@link org.eclipse.uml2.ActivityNode} to retrieve.
	 * @return The {@link org.eclipse.uml2.ActivityNode} with the specified name, or <code>null</code>.
	 * @see #getTests()
	 * @generated
     */
    ActivityNode getTest(String unqualifiedName);
      
	/**
	 * Returns the value of the '<em><b>Body</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.ActivityNode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Body</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Body</em>' reference list.
	 * @see org.eclipse.uml2.UML2Package#getClause_Body()
	 * @model type="org.eclipse.uml2.ActivityNode" ordered="false"
	 * @generated
	 */
	EList getBodies();

    /**
     * Retrieves the {@link org.eclipse.uml2.ActivityNode} with the specified name from the '<em><b>Body</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param unqualifiedName The unqualified name of the {@link org.eclipse.uml2.ActivityNode} to retrieve.
	 * @return The {@link org.eclipse.uml2.ActivityNode} with the specified name, or <code>null</code>.
	 * @see #getBodies()
	 * @generated
     */
    ActivityNode getBody(String unqualifiedName);
      
	/**
	 * Returns the value of the '<em><b>Predecessor Clause</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.Clause}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.uml2.Clause#getSuccessorClauses <em>Successor Clause</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Predecessor Clause</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Predecessor Clause</em>' reference list.
	 * @see org.eclipse.uml2.UML2Package#getClause_PredecessorClause()
	 * @see org.eclipse.uml2.Clause#getSuccessorClauses
	 * @model type="org.eclipse.uml2.Clause" opposite="successorClause" ordered="false"
	 * @generated
	 */
	EList getPredecessorClauses();

	/**
	 * Returns the value of the '<em><b>Successor Clause</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.Clause}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.uml2.Clause#getPredecessorClauses <em>Predecessor Clause</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Successor Clause</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Successor Clause</em>' reference list.
	 * @see org.eclipse.uml2.UML2Package#getClause_SuccessorClause()
	 * @see org.eclipse.uml2.Clause#getPredecessorClauses
	 * @model type="org.eclipse.uml2.Clause" opposite="predecessorClause" ordered="false"
	 * @generated
	 */
	EList getSuccessorClauses();

	/**
	 * Returns the value of the '<em><b>Decider</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Decider</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Decider</em>' reference.
	 * @see #setDecider(OutputPin)
	 * @see org.eclipse.uml2.UML2Package#getClause_Decider()
	 * @model required="true"
	 * @generated
	 */
	OutputPin getDecider();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.Clause#getDecider <em>Decider</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Decider</em>' reference.
	 * @see #getDecider()
	 * @generated
	 */
	void setDecider(OutputPin value);

	/**
	 * Returns the value of the '<em><b>Body Output</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.OutputPin}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Body Output</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A list of output pins within the body fragment whose values are copied to the result pins of the containing conditional node or conditional node after execution of the clause body.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Body Output</em>' reference list.
	 * @see org.eclipse.uml2.UML2Package#getClause_BodyOutput()
	 * @model type="org.eclipse.uml2.OutputPin" ordered="false"
	 * @generated
	 */
	EList getBodyOutputs();

    /**
     * Retrieves the {@link org.eclipse.uml2.OutputPin} with the specified name from the '<em><b>Body Output</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param unqualifiedName The unqualified name of the {@link org.eclipse.uml2.OutputPin} to retrieve.
	 * @return The {@link org.eclipse.uml2.OutputPin} with the specified name, or <code>null</code>.
	 * @see #getBodyOutputs()
	 * @generated
     */
    OutputPin getBodyOutput(String unqualifiedName);
      
} // Clause
