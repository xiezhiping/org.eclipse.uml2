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
 * A representation of the model object '<em><b>Exception Handler</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An ExceptionHandler is an Element that specifies a handlerBody ExecutableNode to execute in case the specified exception occurs during the execution of the protected ExecutableNode.
 * <p>From package UML::Activities.</p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.ExceptionHandler#getExceptionInput <em>Exception Input</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.ExceptionHandler#getExceptionTypes <em>Exception Type</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.ExceptionHandler#getHandlerBody <em>Handler Body</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.ExceptionHandler#getProtectedNode <em>Protected Node</em>}</li>
 * </ul>
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
	 * An ExecutableNode that is executed if the ExceptionHandler catches an exception.
	 * <p>From package UML::Activities.</p>
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
	 * An ObjectNode within the handlerBody. When the ExceptionHandler catches an exception, the exception token is placed on this ObjectNode, causing the handlerBody to execute.
	 * <p>From package UML::Activities.</p>
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
	 * The Classifiers whose instances the ExceptionHandler catches as exceptions. If an exception occurs whose type is any exceptionType, the ExceptionHandler catches the exception and executes the handlerBody.
	 * <p>From package UML::Activities.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Exception Type</em>' reference list.
	 * @see org.eclipse.uml2.uml.UMLPackage#getExceptionHandler_ExceptionType()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	EList<Classifier> getExceptionTypes();

	/**
	 * Retrieves the first {@link org.eclipse.uml2.uml.Classifier} with the specified '<em><b>Name</b></em>' from the '<em><b>Exception Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.Classifier} to retrieve, or <code>null</code>.
	 * @return The first {@link org.eclipse.uml2.uml.Classifier} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getExceptionTypes()
	 * @generated
	 */
	Classifier getExceptionType(String name);

	/**
	 * Retrieves the first {@link org.eclipse.uml2.uml.Classifier} with the specified '<em><b>Name</b></em>' from the '<em><b>Exception Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.Classifier} to retrieve, or <code>null</code>.
	 * @param ignoreCase Whether to ignore case in {@link java.lang.String} comparisons.
	 * @param eClass The Ecore class of the {@link org.eclipse.uml2.uml.Classifier} to retrieve, or <code>null</code>.
	 * @return The first {@link org.eclipse.uml2.uml.Classifier} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getExceptionTypes()
	 * @generated
	 */
	Classifier getExceptionType(String name, boolean ignoreCase, EClass eClass);

	/**
	 * Returns the value of the '<em><b>Protected Node</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.uml2.uml.ExecutableNode#getHandlers <em>Handler</em>}'.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.eclipse.uml2.uml.Element#getOwner() <em>Owner</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The ExecutableNode protected by the ExceptionHandler. If an exception propagates out of the protectedNode and has a type matching one of the exceptionTypes, then it is caught by this ExceptionHandler.
	 * <p>From package UML::Activities.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Protected Node</em>' container reference.
	 * @see #setProtectedNode(ExecutableNode)
	 * @see org.eclipse.uml2.uml.UMLPackage#getExceptionHandler_ProtectedNode()
	 * @see org.eclipse.uml2.uml.ExecutableNode#getHandlers
	 * @model opposite="handler" required="true" transient="false" ordered="false"
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
	 * The handlerBody has no incoming or outgoing ActivityEdges and the exceptionInput has no incoming ActivityEdges.
	 * handlerBody.incoming->isEmpty() and handlerBody.outgoing->isEmpty() and exceptionInput.incoming->isEmpty()
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validateHandlerBodyEdges(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If the protectedNode is an Action with OutputPins, then the handlerBody must also be an Action with the same number of OutputPins, which are compatible in type, ordering, and multiplicity to those of the protectedNode.
	 * (protectedNode.oclIsKindOf(Action) and protectedNode.oclAsType(Action).output->notEmpty()) implies
	 * (
	 *   handlerBody.oclIsKindOf(Action) and 
	 *   let protectedNodeOutput : OrderedSet(OutputPin) = protectedNode.oclAsType(Action).output,
	 *         handlerBodyOutput : OrderedSet(OutputPin) =  handlerBody.oclAsType(Action).output in
	 *     protectedNodeOutput->size() = handlerBodyOutput->size() and
	 *     Sequence{1..protectedNodeOutput->size()}->forAll(i |
	 *     	handlerBodyOutput->at(i).type.conformsTo(protectedNodeOutput->at(i).type) and
	 *     	handlerBodyOutput->at(i).isOrdered=protectedNodeOutput->at(i).isOrdered and
	 *     	handlerBodyOutput->at(i).compatibleWith(protectedNodeOutput->at(i)))
	 * )
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validateOutputPins(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The handlerBody is an Action with one InputPin, and that InputPin is the same as the exceptionInput.
	 * handlerBody.oclIsKindOf(Action) and
	 * let inputs: OrderedSet(InputPin) = handlerBody.oclAsType(Action).input in
	 * inputs->size()=1 and inputs->first()=exceptionInput
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validateOneInput(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An ActivityEdge that has a source within the handlerBody of an ExceptionHandler must have its target in the handlerBody also, and vice versa.
	 * let nodes:Set(ActivityNode) = handlerBody.oclAsType(Action).allOwnedNodes() in
	 * nodes.outgoing->forAll(nodes->includes(target)) and
	 * nodes.incoming->forAll(nodes->includes(source))
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validateEdgeSourceTarget(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The handlerBody must have the same owner as the protectedNode.
	 * handlerBody.owner=protectedNode.owner
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validateHandlerBodyOwner(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The exceptionInput must either have no type or every exceptionType must conform to the exceptionInput type.
	 * exceptionInput.type=null or 
	 * exceptionType->forAll(conformsTo(exceptionInput.type.oclAsType(Classifier)))
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validateExceptionInputType(DiagnosticChain diagnostics,
			Map<Object, Object> context);

} // ExceptionHandler
