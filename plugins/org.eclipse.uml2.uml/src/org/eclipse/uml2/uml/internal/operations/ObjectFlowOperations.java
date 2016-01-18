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

import org.eclipse.uml2.uml.ObjectFlow;

import org.eclipse.uml2.uml.util.UMLValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Object Flow</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.ObjectFlow#validateInputAndOutputParameter(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Input And Output Parameter</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.ObjectFlow#validateNoExecutableNodes(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate No Executable Nodes</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.ObjectFlow#validateTransformationBehavior(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transformation Behavior</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.ObjectFlow#validateSelectionBehavior(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Selection Behavior</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.ObjectFlow#validateCompatibleTypes(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Compatible Types</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.ObjectFlow#validateSameUpperBounds(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Same Upper Bounds</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.ObjectFlow#validateTarget(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Target</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.ObjectFlow#validateIsMulticastOrIsMultireceive(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Is Multicast Or Is Multireceive</em>}</li>
 * </ul>
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
	 * ObjectNodes connected by an ObjectFlow, with optionally intervening ControlNodes, must have compatible types. In particular, the downstream ObjectNode type must be the same or a supertype of the upstream ObjectNode type.
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
				diagnostics.add(new BasicDiagnostic(Diagnostic.ERROR,
					UMLValidator.DIAGNOSTIC_SOURCE,
					UMLValidator.OBJECT_FLOW__COMPATIBLE_TYPES,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic", //$NON-NLS-1$
						new Object[]{"validateCompatibleTypes", //$NON-NLS-1$
							org.eclipse.emf.ecore.util.EObjectValidator
								.getObjectLabel(objectFlow, context)}),
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
	 * ObjectNodes connected by an ObjectFlow, with optionally intervening ControlNodes, must have the same upperBounds.
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
				diagnostics.add(new BasicDiagnostic(Diagnostic.ERROR,
					UMLValidator.DIAGNOSTIC_SOURCE,
					UMLValidator.OBJECT_FLOW__SAME_UPPER_BOUNDS,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic", //$NON-NLS-1$
						new Object[]{"validateSameUpperBounds", //$NON-NLS-1$
							org.eclipse.emf.ecore.util.EObjectValidator
								.getObjectLabel(objectFlow, context)}),
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
	 * An ObjectFlow with a constant weight may not target an ObjectNode, with optionally intervening ControlNodes, that has an upper bound less than the weight.
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
				diagnostics.add(new BasicDiagnostic(Diagnostic.ERROR,
					UMLValidator.DIAGNOSTIC_SOURCE,
					UMLValidator.OBJECT_FLOW__TARGET,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic", //$NON-NLS-1$
						new Object[]{"validateTarget", //$NON-NLS-1$
							org.eclipse.emf.ecore.util.EObjectValidator
								.getObjectLabel(objectFlow, context)}),
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
	 * A selection Behavior has one input Parameter and one output Parameter. The input Parameter must have the same as or a supertype of the type of the source ObjectNode, be non-unique and have multiplicity 0..*. The output Parameter must be the same or a subtype of the type of source ObjectNode. The Behavior cannot have side effects.
	 * selection<>null implies
	 * 	selection.inputParameters()->size()=1 and
	 * 	selection.inputParameters()->forAll(not isUnique and is(0,*)) and
	 * 	selection.outputParameters()->size()=1
	 * @param objectFlow The receiving '<em><b>Object Flow</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateInputAndOutputParameter(ObjectFlow objectFlow,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(Diagnostic.ERROR,
					UMLValidator.DIAGNOSTIC_SOURCE,
					UMLValidator.OBJECT_FLOW__INPUT_AND_OUTPUT_PARAMETER,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic", //$NON-NLS-1$
						new Object[]{"validateInputAndOutputParameter", //$NON-NLS-1$
							org.eclipse.emf.ecore.util.EObjectValidator
								.getObjectLabel(objectFlow, context)}),
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
	 * ObjectFlows may not have ExecutableNodes at either end.
	 * not (source.oclIsKindOf(ExecutableNode) or target.oclIsKindOf(ExecutableNode))
	 * @param objectFlow The receiving '<em><b>Object Flow</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateNoExecutableNodes(ObjectFlow objectFlow,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(Diagnostic.ERROR,
					UMLValidator.DIAGNOSTIC_SOURCE,
					UMLValidator.OBJECT_FLOW__NO_EXECUTABLE_NODES,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic", //$NON-NLS-1$
						new Object[]{"validateNoExecutableNodes", //$NON-NLS-1$
							org.eclipse.emf.ecore.util.EObjectValidator
								.getObjectLabel(objectFlow, context)}),
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
	 * A transformation Behavior has one input Parameter and one output Parameter. The input Parameter must be the same as or a supertype of the type of object token coming from the source end. The output Parameter must be the same or a subtype of the type of object token expected downstream. The Behavior cannot have side effects.
	 * transformation<>null implies
	 * 	transformation.inputParameters()->size()=1 and
	 * 	transformation.outputParameters()->size()=1
	 * @param objectFlow The receiving '<em><b>Object Flow</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateTransformationBehavior(ObjectFlow objectFlow,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(Diagnostic.ERROR,
					UMLValidator.DIAGNOSTIC_SOURCE,
					UMLValidator.OBJECT_FLOW__TRANSFORMATION_BEHAVIOR,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic", //$NON-NLS-1$
						new Object[]{"validateTransformationBehavior", //$NON-NLS-1$
							org.eclipse.emf.ecore.util.EObjectValidator
								.getObjectLabel(objectFlow, context)}),
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
	 * An ObjectFlow may have a selection Behavior only if it has an ObjectNode as its source.
	 * selection<>null implies source.oclIsKindOf(ObjectNode)
	 * @param objectFlow The receiving '<em><b>Object Flow</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateSelectionBehavior(ObjectFlow objectFlow,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(Diagnostic.ERROR,
					UMLValidator.DIAGNOSTIC_SOURCE,
					UMLValidator.OBJECT_FLOW__SELECTION_BEHAVIOR,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic", //$NON-NLS-1$
						new Object[]{"validateSelectionBehavior", //$NON-NLS-1$
							org.eclipse.emf.ecore.util.EObjectValidator
								.getObjectLabel(objectFlow, context)}),
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
	 * not (isMulticast and isMultireceive)
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
				diagnostics.add(new BasicDiagnostic(Diagnostic.ERROR,
					UMLValidator.DIAGNOSTIC_SOURCE,
					UMLValidator.OBJECT_FLOW__IS_MULTICAST_OR_IS_MULTIRECEIVE,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic", //$NON-NLS-1$
						new Object[]{"validateIsMulticastOrIsMultireceive", //$NON-NLS-1$
							org.eclipse.emf.ecore.util.EObjectValidator
								.getObjectLabel(objectFlow, context)}),
					new Object[]{objectFlow}));
			}
			return false;
		}
		return true;
	}

} // ObjectFlowOperations