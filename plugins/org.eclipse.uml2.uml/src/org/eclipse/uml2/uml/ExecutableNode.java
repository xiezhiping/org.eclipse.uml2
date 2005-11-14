/*
 * Copyright (c) 2005 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *
 * $Id: ExecutableNode.java,v 1.1 2005/11/14 22:26:01 khussey Exp $
 */
package org.eclipse.uml2.uml;

import java.util.List;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Executable Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An executable node is an abstract class for activity nodes that may be executed. It is used as an attachment point for exception handlers.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.ExecutableNode#getHandlers <em>Handler</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.uml2.uml.UMLPackage#getExecutableNode()
 * @model abstract="true"
 * @generated
 */
public interface ExecutableNode
		extends ActivityNode {

	/**
	 * Returns the value of the '<em><b>Handler</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.ExceptionHandler}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.uml2.uml.ExceptionHandler#getProtectedNode <em>Protected Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A set of exception handlers that are examined if an uncaught exception propagates to the outer level of the executable node.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Handler</em>' containment reference list.
	 * @see org.eclipse.uml2.uml.UMLPackage#getExecutableNode_Handler()
	 * @see org.eclipse.uml2.uml.ExceptionHandler#getProtectedNode
	 * @model type="org.eclipse.uml2.uml.ExceptionHandler" opposite="protectedNode" containment="true" resolveProxies="false" ordered="false"
	 * @generated
	 */
	List getHandlers();

	/**
	 * Creates a {@link org.eclipse.uml2.uml.ExceptionHandler} and appends it to the '<em><b>Handler</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return The new {@link org.eclipse.uml2.uml.ExceptionHandler}.
	 * @see #getHandlers()
	 * @generated
	 */
	ExceptionHandler createHandler();

} // ExecutableNode
