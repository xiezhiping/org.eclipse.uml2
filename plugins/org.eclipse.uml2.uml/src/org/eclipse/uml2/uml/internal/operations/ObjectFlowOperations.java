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
 * $Id: ObjectFlowOperations.java,v 1.7 2007/05/03 21:11:52 khussey Exp $
 */
package org.eclipse.uml2.uml.internal.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.uml2.uml.ObjectFlow;

import org.eclipse.uml2.uml.util.UMLValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Object Flow</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.ObjectFlow#validateNoActions(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate No Actions</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.ObjectFlow#validateCompatibleTypes(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Compatible Types</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.ObjectFlow#validateSameUpperBounds(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Same Upper Bounds</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.ObjectFlow#validateTarget(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Target</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.ObjectFlow#validateTransformationBehaviour(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transformation Behaviour</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.ObjectFlow#validateSelectionBehaviour(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Selection Behaviour</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.ObjectFlow#validateInputAndOutputParameter(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Input And Output Parameter</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.ObjectFlow#validateIsMulticastOrIsMultireceive(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Is Multicast Or Is Multireceive</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ObjectFlowOperations
		extends ActivityEdgeOperations {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ObjectFlowOperations() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Object flows may not have actions at either end.
	 * true
	 * @param objectFlow The receiving '<em><b>Object Flow</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateNoActions(ObjectFlow objectFlow,
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
						UMLValidator.OBJECT_FLOW__NO_ACTIONS,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE
							.getString(
								"_UI_GenericInvariant_diagnostic", new Object[]{"validateNoActions", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(objectFlow, context)}), //$NON-NLS-1$ //$NON-NLS-2$
						new Object[]{objectFlow}));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Object nodes connected by an object flow, with optionally intervening control nodes, must have compatible types. In particular, the downstream object node type must be the same or a supertype of the upstream object node type.
	 * 
	 * true
	 * @param objectFlow The receiving '<em><b>Object Flow</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateCompatibleTypes(ObjectFlow objectFlow,
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
						UMLValidator.OBJECT_FLOW__COMPATIBLE_TYPES,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE
							.getString(
								"_UI_GenericInvariant_diagnostic", new Object[]{"validateCompatibleTypes", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(objectFlow, context)}), //$NON-NLS-1$ //$NON-NLS-2$
						new Object[]{objectFlow}));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Object nodes connected by an object flow, with optionally intervening control nodes, must have the same upper bounds.
	 * true
	 * @param objectFlow The receiving '<em><b>Object Flow</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateSameUpperBounds(ObjectFlow objectFlow,
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
						UMLValidator.OBJECT_FLOW__SAME_UPPER_BOUNDS,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE
							.getString(
								"_UI_GenericInvariant_diagnostic", new Object[]{"validateSameUpperBounds", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(objectFlow, context)}), //$NON-NLS-1$ //$NON-NLS-2$
						new Object[]{objectFlow}));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An edge with constant weight may not target an object node, or lead to an object node downstream with no intervening actions, that has an upper bound less than the weight.
	 * true
	 * @param objectFlow The receiving '<em><b>Object Flow</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateTarget(ObjectFlow objectFlow,
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
						UMLValidator.OBJECT_FLOW__TARGET,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE
							.getString(
								"_UI_GenericInvariant_diagnostic", new Object[]{"validateTarget", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(objectFlow, context)}), //$NON-NLS-1$ //$NON-NLS-2$
						new Object[]{objectFlow}));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A transformation behavior has one input parameter and one output parameter. The input parameter must be the same as or a supertype of the type of object token coming from the source end. The output parameter must be the same or a subtype of the type of object token expected downstream. The behavior cannot have side effects.
	 * true
	 * @param objectFlow The receiving '<em><b>Object Flow</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateTransformationBehaviour(
			ObjectFlow objectFlow, DiagnosticChain diagnostics,
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
						UMLValidator.OBJECT_FLOW__TRANSFORMATION_BEHAVIOUR,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE
							.getString(
								"_UI_GenericInvariant_diagnostic", new Object[]{"validateTransformationBehaviour", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(objectFlow, context)}), //$NON-NLS-1$ //$NON-NLS-2$
						new Object[]{objectFlow}));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An object flow may have a selection behavior only if has an object node as a source.
	 * true
	 * @param objectFlow The receiving '<em><b>Object Flow</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateSelectionBehaviour(ObjectFlow objectFlow,
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
						UMLValidator.OBJECT_FLOW__SELECTION_BEHAVIOUR,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE
							.getString(
								"_UI_GenericInvariant_diagnostic", new Object[]{"validateSelectionBehaviour", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(objectFlow, context)}), //$NON-NLS-1$ //$NON-NLS-2$
						new Object[]{objectFlow}));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A selection behavior has one input parameter and one output parameter. The input parameter must be a bag of elements of the same as or a supertype of the type of source object node. The output parameter must be the same or a subtype of the type of source object node. The behavior cannot have side effects.
	 * true
	 * @param objectFlow The receiving '<em><b>Object Flow</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateInputAndOutputParameter(
			ObjectFlow objectFlow, DiagnosticChain diagnostics,
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
						UMLValidator.OBJECT_FLOW__INPUT_AND_OUTPUT_PARAMETER,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE
							.getString(
								"_UI_GenericInvariant_diagnostic", new Object[]{"validateInputAndOutputParameter", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(objectFlow, context)}), //$NON-NLS-1$ //$NON-NLS-2$
						new Object[]{objectFlow}));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * isMulticast and isMultireceive cannot both be true.
	 * true
	 * @param objectFlow The receiving '<em><b>Object Flow</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateIsMulticastOrIsMultireceive(
			ObjectFlow objectFlow, DiagnosticChain diagnostics,
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
						UMLValidator.OBJECT_FLOW__IS_MULTICAST_OR_IS_MULTIRECEIVE,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE
							.getString(
								"_UI_GenericInvariant_diagnostic", new Object[]{"validateIsMulticastOrIsMultireceive", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(objectFlow, context)}), //$NON-NLS-1$ //$NON-NLS-2$
						new Object[]{objectFlow}));
			}
			return false;
		}
		return true;
	}

} // ObjectFlowOperations