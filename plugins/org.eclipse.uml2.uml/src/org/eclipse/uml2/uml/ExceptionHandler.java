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
 * $Id: ExceptionHandler.java,v 1.2 2005/11/22 15:32:38 khussey Exp $
 */
package org.eclipse.uml2.uml;

import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Exception Handler</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An exception handler is an element that specifies a body to execute in case the specified exception occurs during the execution of the protected node.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.ExceptionHandler#getHandlerBody <em>Handler Body</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.ExceptionHandler#getExceptionInput <em>Exception Input</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.ExceptionHandler#getExceptionTypes <em>Exception Type</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.ExceptionHandler#getProtectedNode <em>Protected Node</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.uml2.uml.UMLPackage#getExceptionHandler()
 * @model
 * @generated
 */
public interface ExceptionHandler
		extends Element {

	/**
	 * Returns the value of the '<em><b>Handler Body</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A node that is executed if the handler satisfies an uncaught exception.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Handler Body</em>' reference.
	 * @see #setHandlerBody(ExecutableNode)
	 * @see org.eclipse.uml2.uml.UMLPackage#getExceptionHandler_HandlerBody()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	ExecutableNode getHandlerBody();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.uml.ExceptionHandler#getHandlerBody <em>Handler Body</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Handler Body</em>' reference.
	 * @see #getHandlerBody()
	 * @generated
	 */
	void setHandlerBody(ExecutableNode value);

	/**
	 * Returns the value of the '<em><b>Exception Input</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An object node within the handler body. When the handler catches an exception, the exception token is placed in this node, causing the body to execute.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Exception Input</em>' reference.
	 * @see #setExceptionInput(ObjectNode)
	 * @see org.eclipse.uml2.uml.UMLPackage#getExceptionHandler_ExceptionInput()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	ObjectNode getExceptionInput();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.uml.ExceptionHandler#getExceptionInput <em>Exception Input</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exception Input</em>' reference.
	 * @see #getExceptionInput()
	 * @generated
	 */
	void setExceptionInput(ObjectNode value);

	/**
	 * Returns the value of the '<em><b>Exception Type</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.Classifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The kind of instances that the handler catches. If an exception occurs whose type is any of the classifiers in the set, the handler catches the exception and executes its body.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Exception Type</em>' reference list.
	 * @see org.eclipse.uml2.uml.UMLPackage#getExceptionHandler_ExceptionType()
	 * @model type="org.eclipse.uml2.uml.Classifier" required="true" ordered="false"
	 * @generated
	 */
	List getExceptionTypes();

	/**
	 * Retrieves the {@link org.eclipse.uml2.uml.Classifier} with the specified '<em><b>Name</b></em>' from the '<em><b>Exception Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.Classifier} to retrieve.
	 * @return The {@link org.eclipse.uml2.uml.Classifier} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getExceptionTypes()
	 * @generated
	 */
	Classifier getExceptionType(String name);

	/**
	 * Returns the value of the '<em><b>Protected Node</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.uml2.uml.ExecutableNode#getHandlers <em>Handler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The node protected by the handler. The handler is examined if an exception propagates to the outside of the node.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Protected Node</em>' container reference.
	 * @see #setProtectedNode(ExecutableNode)
	 * @see org.eclipse.uml2.uml.UMLPackage#getExceptionHandler_ProtectedNode()
	 * @see org.eclipse.uml2.uml.ExecutableNode#getHandlers
	 * @model opposite="handler" resolveProxies="false" required="true" ordered="false"
	 * @generated
	 */
	ExecutableNode getProtectedNode();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.uml.ExceptionHandler#getProtectedNode <em>Protected Node</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Protected Node</em>' container reference.
	 * @see #getProtectedNode()
	 * @generated
	 */
	void setProtectedNode(ExecutableNode value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The exception handler and its input object node are not the source or target of any edge.
	 * true
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validateExceptionBody(DiagnosticChain diagnostics, Map context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The result pins of the exception handler body must correspond in number and types to the result pins of the protected node.
	 * true
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validateResultPins(DiagnosticChain diagnostics, Map context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The handler body has one input, and that input is the same as the exception input.
	 * true
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validateOneInput(DiagnosticChain diagnostics, Map context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An edge that has a source in an exception handler structured node must have its target in the handler also, and vice versa.
	 * true
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validateEdgeSourceTarget(DiagnosticChain diagnostics, Map context);

} // ExceptionHandler
