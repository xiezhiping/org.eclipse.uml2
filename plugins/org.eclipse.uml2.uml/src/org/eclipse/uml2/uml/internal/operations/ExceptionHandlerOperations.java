/*
 * Copyright (c) 2005, 2007 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *
 * $Id: ExceptionHandlerOperations.java,v 1.6 2007/05/03 21:11:52 khussey Exp $
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
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.ExceptionHandler#validateExceptionBody(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Exception Body</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.ExceptionHandler#validateResultPins(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Pins</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.ExceptionHandler#validateOneInput(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate One Input</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.ExceptionHandler#validateEdgeSourceTarget(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Edge Source Target</em>}</li>
 * </ul>
 * </p>
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
	 * The exception handler and its input object node are not the source or target of any edge.
	 * true
	 * @param exceptionHandler The receiving '<em><b>Exception Handler</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateExceptionBody(
			ExceptionHandler exceptionHandler, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics
					.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						UMLValidator.DIAGNOSTIC_SOURCE,
						UMLValidator.EXCEPTION_HANDLER__EXCEPTION_BODY,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE
							.getString(
								"_UI_GenericInvariant_diagnostic", new Object[]{"validateExceptionBody", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(exceptionHandler, context)}), //$NON-NLS-1$ //$NON-NLS-2$
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
	 * The result pins of the exception handler body must correspond in number and types to the result pins of the protected node.
	 * true
	 * @param exceptionHandler The receiving '<em><b>Exception Handler</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateResultPins(ExceptionHandler exceptionHandler,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics
					.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						UMLValidator.DIAGNOSTIC_SOURCE,
						UMLValidator.EXCEPTION_HANDLER__RESULT_PINS,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE
							.getString(
								"_UI_GenericInvariant_diagnostic", new Object[]{"validateResultPins", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(exceptionHandler, context)}), //$NON-NLS-1$ //$NON-NLS-2$
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
	 * The handler body has one input, and that input is the same as the exception input.
	 * true
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
				diagnostics
					.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						UMLValidator.DIAGNOSTIC_SOURCE,
						UMLValidator.EXCEPTION_HANDLER__ONE_INPUT,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE
							.getString(
								"_UI_GenericInvariant_diagnostic", new Object[]{"validateOneInput", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(exceptionHandler, context)}), //$NON-NLS-1$ //$NON-NLS-2$
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
	 * An edge that has a source in an exception handler structured node must have its target in the handler also, and vice versa.
	 * true
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
				diagnostics
					.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						UMLValidator.DIAGNOSTIC_SOURCE,
						UMLValidator.EXCEPTION_HANDLER__EDGE_SOURCE_TARGET,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE
							.getString(
								"_UI_GenericInvariant_diagnostic", new Object[]{"validateEdgeSourceTarget", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(exceptionHandler, context)}), //$NON-NLS-1$ //$NON-NLS-2$
						new Object[]{exceptionHandler}));
			}
			return false;
		}
		return true;
	}

} // ExceptionHandlerOperations