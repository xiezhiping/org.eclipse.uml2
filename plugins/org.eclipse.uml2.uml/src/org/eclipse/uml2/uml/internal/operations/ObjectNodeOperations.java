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

import org.eclipse.uml2.uml.ObjectNode;

import org.eclipse.uml2.uml.util.UMLValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Object Node</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.ObjectNode#validateInputOutputParameter(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Input Output Parameter</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.ObjectNode#validateSelectionBehavior(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Selection Behavior</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.ObjectNode#validateObjectFlowEdges(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Object Flow Edges</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ObjectNodeOperations
		extends ActivityNodeOperations {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ObjectNodeOperations() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If isControlType=false, the ActivityEdges incoming to or outgoing from an ObjectNode must all be ObjectFlows.
	 * (not isControlType) implies incoming->union(outgoing)->forAll(oclIsKindOf(ObjectFlow))
	 * @param objectNode The receiving '<em><b>Object Node</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateObjectFlowEdges(ObjectNode objectNode,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(Diagnostic.ERROR,
					UMLValidator.DIAGNOSTIC_SOURCE,
					UMLValidator.OBJECT_NODE__OBJECT_FLOW_EDGES,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic", //$NON-NLS-1$
						new Object[]{"validateObjectFlowEdges", //$NON-NLS-1$
							org.eclipse.emf.ecore.util.EObjectValidator
								.getObjectLabel(objectNode, context)}),
					new Object[]{objectNode}));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If an ObjectNode has a selection Behavior, then the ordering of the object node is ordered, and vice versa.
	 * (selection<>null) = (ordering=ObjectNodeOrderingKind::ordered)
	 * @param objectNode The receiving '<em><b>Object Node</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateSelectionBehavior(ObjectNode objectNode,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(Diagnostic.ERROR,
					UMLValidator.DIAGNOSTIC_SOURCE,
					UMLValidator.OBJECT_NODE__SELECTION_BEHAVIOR,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic", //$NON-NLS-1$
						new Object[]{"validateSelectionBehavior", //$NON-NLS-1$
							org.eclipse.emf.ecore.util.EObjectValidator
								.getObjectLabel(objectNode, context)}),
					new Object[]{objectNode}));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A selection Behavior has one input Parameter and one output Parameter. The input Parameter must have the same type as  or a supertype of the type of ObjectNode, be non-unique, and have multiplicity 0..*. The output Parameter must be the same or a subtype of the type of ObjectNode. The Behavior cannot have side effects.
	 * selection<>null implies
	 * 	selection.inputParameters()->size()=1 and
	 * 	selection.inputParameters()->forAll(p | not p.isUnique and p.is(0,*) and self.type.conformsTo(p.type)) and
	 * 	selection.outputParameters()->size()=1 and
	 * 		selection.inputParameters()->forAll(p | self.type.conformsTo(p.type))
	 * @param objectNode The receiving '<em><b>Object Node</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateInputOutputParameter(ObjectNode objectNode,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(Diagnostic.ERROR,
					UMLValidator.DIAGNOSTIC_SOURCE,
					UMLValidator.OBJECT_NODE__INPUT_OUTPUT_PARAMETER,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic", //$NON-NLS-1$
						new Object[]{"validateInputOutputParameter", //$NON-NLS-1$
							org.eclipse.emf.ecore.util.EObjectValidator
								.getObjectLabel(objectNode, context)}),
					new Object[]{objectNode}));
			}
			return false;
		}
		return true;
	}

} // ObjectNodeOperations