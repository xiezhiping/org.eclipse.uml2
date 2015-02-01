/*
 * Copyright (c) 2005, 2015 IBM Corporation, CEA, and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *   Kenn Hussey (CEA) - 351774, 351777, 382718, 418466, 451350
 *   Christian W. Damus (CEA) - 251963
 *
 */
package org.eclipse.uml2.uml;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Executable Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An ExecutableNode is an abstract class for ActivityNodes whose execution may be controlled using ControlFlows and to which ExceptionHandlers may be attached.
 * <p>From package UML::Activities.</p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.ExecutableNode#getHandlers <em>Handler</em>}</li>
 * </ul>
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
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.eclipse.uml2.uml.Element#getOwnedElements() <em>Owned Element</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A set of ExceptionHandlers that are examined if an exception propagates out of the ExceptionNode.
	 * <p>From package UML::Activities.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Handler</em>' containment reference list.
	 * @see org.eclipse.uml2.uml.UMLPackage#getExecutableNode_Handler()
	 * @see org.eclipse.uml2.uml.ExceptionHandler#getProtectedNode
	 * @model opposite="protectedNode" containment="true" resolveProxies="true" ordered="false"
	 * @generated
	 */
	EList<ExceptionHandler> getHandlers();

	/**
	 * Creates a new {@link org.eclipse.uml2.uml.ExceptionHandler} and appends it to the '<em><b>Handler</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return The new {@link org.eclipse.uml2.uml.ExceptionHandler}.
	 * @see #getHandlers()
	 * @generated
	 */
	ExceptionHandler createHandler();

} // ExecutableNode
