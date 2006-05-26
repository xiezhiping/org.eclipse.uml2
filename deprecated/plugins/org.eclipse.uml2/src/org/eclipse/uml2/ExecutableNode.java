/*
 * Copyright (c) 2003, 2006 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *
 * $Id: ExecutableNode.java,v 1.12 2006/05/26 18:16:52 khussey Exp $
 */
package org.eclipse.uml2;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Executable Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2.ExecutableNode#getHandlers <em>Handler</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.uml2.UML2Package#getExecutableNode()
 * @model abstract="true"
 * @generated
 */
public interface ExecutableNode extends ActivityNode {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) IBM Corporation and others."; //$NON-NLS-1$

	/**
	 * Returns the value of the '<em><b>Handler</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2.ExceptionHandler}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.uml2.ExceptionHandler#getProtectedNode <em>Protected Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Handler</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A set of exception handlers that are examined if an uncaught exception propagates to the outer level of the executable node.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Handler</em>' containment reference list.
	 * @see org.eclipse.uml2.UML2Package#getExecutableNode_Handler()
	 * @see org.eclipse.uml2.ExceptionHandler#getProtectedNode
	 * @model type="org.eclipse.uml2.ExceptionHandler" opposite="protectedNode" containment="true" ordered="false"
	 * @generated
	 */
	EList getHandlers();



    /**
     * Creates a {@link org.eclipse.uml2.ExceptionHandler} and appends it to the '<em><b>Handler</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param eClass The Ecore class of the {@link org.eclipse.uml2.ExceptionHandler} to create.
	 * @return The new {@link org.eclipse.uml2.ExceptionHandler}.
	 * @see #getHandlers()
	 * @generated NOT
	 * @deprecated Use #createHandler() instead.
     */
    ExceptionHandler createHandler(EClass eClass);

	/**
	 * Creates a {@link org.eclipse.uml2.ExceptionHandler} and appends it to the '<em><b>Handler</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return The new {@link org.eclipse.uml2.ExceptionHandler}.
	 * @see #getHandlers()
	 * @generated NOT
	 */
    ExceptionHandler createHandler();


} // ExecutableNode
