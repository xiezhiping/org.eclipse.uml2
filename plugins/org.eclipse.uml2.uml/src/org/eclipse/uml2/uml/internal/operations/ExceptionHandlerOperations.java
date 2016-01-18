/*
 * Copyright (c) 2005, 2016 IBM Corporation, CEA, and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *   Kenn Hussey (CEA) - 327039, 351774, 418466, 451350, 485756
 *
 */
package org.eclipse.uml2.uml.internal.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.uml2.uml.ExceptionHandler;

import org.eclipse.uml2.uml.util.UMLValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Exception Handler</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.ExceptionHandler#validateHandlerBodyEdges(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Handler Body Edges</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.ExceptionHandler#validateOutputPins(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Output Pins</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.ExceptionHandler#validateOneInput(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate One Input</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.ExceptionHandler#validateEdgeSourceTarget(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Edge Source Target</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.ExceptionHandler#validateHandlerBodyOwner(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Handler Body Owner</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.ExceptionHandler#validateExceptionInputType(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Exception Input Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExceptionHandlerOperations
		extends ElementOperations {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExceptionHandlerOperations() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The handlerBody has no incoming or outgoing ActivityEdges and the exceptionInput has no incoming ActivityEdges.
	 * handlerBody.incoming->isEmpty() and handlerBody.outgoing->isEmpty() and exceptionInput.incoming->isEmpty()
	 * @param exceptionHandler The receiving '<em><b>Exception Handler</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateHandlerBodyEdges(
			ExceptionHandler exceptionHandler, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(Diagnostic.ERROR,
					UMLValidator.DIAGNOSTIC_SOURCE,
					UMLValidator.EXCEPTION_HANDLER__HANDLER_BODY_EDGES,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic", //$NON-NLS-1$
						new Object[]{"validateHandlerBodyEdges", //$NON-NLS-1$
							org.eclipse.emf.ecore.util.EObjectValidator
								.getObjectLabel(exceptionHandler, context)}),
					new Object[]{exceptionHandler}));
			}
			return false;
		}
		return true;
	}

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
	 * @param exceptionHandler The receiving '<em><b>Exception Handler</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateOutputPins(ExceptionHandler exceptionHandler,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(Diagnostic.ERROR,
					UMLValidator.DIAGNOSTIC_SOURCE,
					UMLValidator.EXCEPTION_HANDLER__OUTPUT_PINS,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic", //$NON-NLS-1$
						new Object[]{"validateOutputPins", //$NON-NLS-1$
							org.eclipse.emf.ecore.util.EObjectValidator
								.getObjectLabel(exceptionHandler, context)}),
					new Object[]{exceptionHandler}));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The handlerBody is an Action with one InputPin, and that InputPin is the same as the exceptionInput.
	 * handlerBody.oclIsKindOf(Action) and
	 * let inputs: OrderedSet(InputPin) = handlerBody.oclAsType(Action).input in
	 * inputs->size()=1 and inputs->first()=exceptionInput
	 * @param exceptionHandler The receiving '<em><b>Exception Handler</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateOneInput(ExceptionHandler exceptionHandler,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(Diagnostic.ERROR,
					UMLValidator.DIAGNOSTIC_SOURCE,
					UMLValidator.EXCEPTION_HANDLER__ONE_INPUT,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic", //$NON-NLS-1$
						new Object[]{"validateOneInput", //$NON-NLS-1$
							org.eclipse.emf.ecore.util.EObjectValidator
								.getObjectLabel(exceptionHandler, context)}),
					new Object[]{exceptionHandler}));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An ActivityEdge that has a source within the handlerBody of an ExceptionHandler must have its target in the handlerBody also, and vice versa.
	 * let nodes:Set(ActivityNode) = handlerBody.oclAsType(Action).allOwnedNodes() in
	 * nodes.outgoing->forAll(nodes->includes(target)) and
	 * nodes.incoming->forAll(nodes->includes(source))
	 * @param exceptionHandler The receiving '<em><b>Exception Handler</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateEdgeSourceTarget(
			ExceptionHandler exceptionHandler, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(Diagnostic.ERROR,
					UMLValidator.DIAGNOSTIC_SOURCE,
					UMLValidator.EXCEPTION_HANDLER__EDGE_SOURCE_TARGET,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic", //$NON-NLS-1$
						new Object[]{"validateEdgeSourceTarget", //$NON-NLS-1$
							org.eclipse.emf.ecore.util.EObjectValidator
								.getObjectLabel(exceptionHandler, context)}),
					new Object[]{exceptionHandler}));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The handlerBody must have the same owner as the protectedNode.
	 * handlerBody.owner=protectedNode.owner
	 * @param exceptionHandler The receiving '<em><b>Exception Handler</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateHandlerBodyOwner(
			ExceptionHandler exceptionHandler, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(Diagnostic.ERROR,
					UMLValidator.DIAGNOSTIC_SOURCE,
					UMLValidator.EXCEPTION_HANDLER__HANDLER_BODY_OWNER,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic", //$NON-NLS-1$
						new Object[]{"validateHandlerBodyOwner", //$NON-NLS-1$
							org.eclipse.emf.ecore.util.EObjectValidator
								.getObjectLabel(exceptionHandler, context)}),
					new Object[]{exceptionHandler}));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The exceptionInput must either have no type or every exceptionType must conform to the exceptionInput type.
	 * exceptionInput.type=null or 
	 * exceptionType->forAll(conformsTo(exceptionInput.type.oclAsType(Classifier)))
	 * @param exceptionHandler The receiving '<em><b>Exception Handler</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateExceptionInputType(
			ExceptionHandler exceptionHandler, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(Diagnostic.ERROR,
					UMLValidator.DIAGNOSTIC_SOURCE,
					UMLValidator.EXCEPTION_HANDLER__EXCEPTION_INPUT_TYPE,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic", //$NON-NLS-1$
						new Object[]{"validateExceptionInputType", //$NON-NLS-1$
							org.eclipse.emf.ecore.util.EObjectValidator
								.getObjectLabel(exceptionHandler, context)}),
					new Object[]{exceptionHandler}));
			}
			return false;
		}
		return true;
	}

} // ExceptionHandlerOperations