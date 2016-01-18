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

import org.eclipse.uml2.uml.Pseudostate;

import org.eclipse.uml2.uml.util.UMLValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Pseudostate</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.Pseudostate#validateTransitionsOutgoing(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transitions Outgoing</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Pseudostate#validateChoiceVertex(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Choice Vertex</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Pseudostate#validateOutgoingFromInitial(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Outgoing From Initial</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Pseudostate#validateJoinVertex(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Join Vertex</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Pseudostate#validateJunctionVertex(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Junction Vertex</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Pseudostate#validateHistoryVertices(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History Vertices</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Pseudostate#validateInitialVertex(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Initial Vertex</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Pseudostate#validateForkVertex(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Fork Vertex</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Pseudostate#validateTransitionsIncoming(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transitions Incoming</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PseudostateOperations
		extends VertexOperations {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PseudostateOperations() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An initial Vertex can have at most one outgoing Transition.
	 * (kind = PseudostateKind::initial) implies (outgoing->size() <= 1)
	 * @param pseudostate The receiving '<em><b>Pseudostate</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateInitialVertex(Pseudostate pseudostate,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(Diagnostic.ERROR,
					UMLValidator.DIAGNOSTIC_SOURCE,
					UMLValidator.PSEUDOSTATE__INITIAL_VERTEX,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic", //$NON-NLS-1$
						new Object[]{"validateInitialVertex", //$NON-NLS-1$
							org.eclipse.emf.ecore.util.EObjectValidator
								.getObjectLabel(pseudostate, context)}),
					new Object[]{pseudostate}));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * History Vertices can have at most one outgoing Transition.
	 * ((kind = PseudostateKind::deepHistory) or (kind = PseudostateKind::shallowHistory)) implies (outgoing->size() <= 1)
	 * @param pseudostate The receiving '<em><b>Pseudostate</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateHistoryVertices(Pseudostate pseudostate,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(Diagnostic.ERROR,
					UMLValidator.DIAGNOSTIC_SOURCE,
					UMLValidator.PSEUDOSTATE__HISTORY_VERTICES,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic", //$NON-NLS-1$
						new Object[]{"validateHistoryVertices", //$NON-NLS-1$
							org.eclipse.emf.ecore.util.EObjectValidator
								.getObjectLabel(pseudostate, context)}),
					new Object[]{pseudostate}));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * In a complete StateMachine, a join Vertex must have at least two incoming Transitions and exactly one outgoing Transition.
	 * (kind = PseudostateKind::join) implies (outgoing->size() = 1 and incoming->size() >= 2)
	 * @param pseudostate The receiving '<em><b>Pseudostate</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateJoinVertex(Pseudostate pseudostate,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(Diagnostic.ERROR,
					UMLValidator.DIAGNOSTIC_SOURCE,
					UMLValidator.PSEUDOSTATE__JOIN_VERTEX,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic", //$NON-NLS-1$
						new Object[]{"validateJoinVertex", //$NON-NLS-1$
							org.eclipse.emf.ecore.util.EObjectValidator
								.getObjectLabel(pseudostate, context)}),
					new Object[]{pseudostate}));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * All Transitions incoming a join Vertex must originate in different Regions of an orthogonal State.
	 * (kind = PseudostateKind::join) implies
	 * 
	 * -- for any pair of incoming transitions there exists an orthogonal state which contains the source vetices of these transitions 
	 * -- such that these source vertices belong to different regions of that orthogonal state 
	 * 
	 * incoming->forAll(t1:Transition, t2:Transition | let contState:State = containingStateMachine().LCAState(t1.source, t2.source) in
	 * 	((contState <> null) and (contState.region
	 * 		->exists(r1:Region, r2: Region | (r1 <> r2) and t1.source.isContainedInRegion(r1) and t2.source.isContainedInRegion(r2)))))
	 * @param pseudostate The receiving '<em><b>Pseudostate</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateTransitionsIncoming(Pseudostate pseudostate,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(Diagnostic.ERROR,
					UMLValidator.DIAGNOSTIC_SOURCE,
					UMLValidator.PSEUDOSTATE__TRANSITIONS_INCOMING,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic", //$NON-NLS-1$
						new Object[]{"validateTransitionsIncoming", //$NON-NLS-1$
							org.eclipse.emf.ecore.util.EObjectValidator
								.getObjectLabel(pseudostate, context)}),
					new Object[]{pseudostate}));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * In a complete StateMachine, a fork Vertex must have at least two outgoing Transitions and exactly one incoming Transition.
	 * (kind = PseudostateKind::fork) implies (incoming->size() = 1 and outgoing->size() >= 2)
	 * @param pseudostate The receiving '<em><b>Pseudostate</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateForkVertex(Pseudostate pseudostate,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(Diagnostic.ERROR,
					UMLValidator.DIAGNOSTIC_SOURCE,
					UMLValidator.PSEUDOSTATE__FORK_VERTEX,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic", //$NON-NLS-1$
						new Object[]{"validateForkVertex", //$NON-NLS-1$
							org.eclipse.emf.ecore.util.EObjectValidator
								.getObjectLabel(pseudostate, context)}),
					new Object[]{pseudostate}));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * All transitions outgoing a fork vertex must target states in different regions of an orthogonal state.
	 * (kind = PseudostateKind::fork) implies
	 * 
	 * -- for any pair of outgoing transitions there exists an orthogonal state which contains the targets of these transitions 
	 * -- such that these targets belong to different regions of that orthogonal state 
	 * 
	 * outgoing->forAll(t1:Transition, t2:Transition | let contState:State = containingStateMachine().LCAState(t1.target, t2.target) in
	 * 	((contState <> null) and (contState.region
	 * 		->exists(r1:Region, r2: Region | (r1 <> r2) and t1.target.isContainedInRegion(r1) and t2.target.isContainedInRegion(r2)))))
	 * @param pseudostate The receiving '<em><b>Pseudostate</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateTransitionsOutgoing(Pseudostate pseudostate,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(Diagnostic.ERROR,
					UMLValidator.DIAGNOSTIC_SOURCE,
					UMLValidator.PSEUDOSTATE__TRANSITIONS_OUTGOING,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic", //$NON-NLS-1$
						new Object[]{"validateTransitionsOutgoing", //$NON-NLS-1$
							org.eclipse.emf.ecore.util.EObjectValidator
								.getObjectLabel(pseudostate, context)}),
					new Object[]{pseudostate}));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * In a complete StateMachine, a junction Vertex must have at least one incoming and one outgoing Transition.
	 * (kind = PseudostateKind::junction) implies (incoming->size() >= 1 and outgoing->size() >= 1)
	 * @param pseudostate The receiving '<em><b>Pseudostate</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateJunctionVertex(Pseudostate pseudostate,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(Diagnostic.ERROR,
					UMLValidator.DIAGNOSTIC_SOURCE,
					UMLValidator.PSEUDOSTATE__JUNCTION_VERTEX,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic", //$NON-NLS-1$
						new Object[]{"validateJunctionVertex", //$NON-NLS-1$
							org.eclipse.emf.ecore.util.EObjectValidator
								.getObjectLabel(pseudostate, context)}),
					new Object[]{pseudostate}));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * In a complete statemachine, a choice Vertex must have at least one incoming and one outgoing Transition.
	 * (kind = PseudostateKind::choice) implies (incoming->size() >= 1 and outgoing->size() >= 1)
	 * @param pseudostate The receiving '<em><b>Pseudostate</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateChoiceVertex(Pseudostate pseudostate,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(Diagnostic.ERROR,
					UMLValidator.DIAGNOSTIC_SOURCE,
					UMLValidator.PSEUDOSTATE__CHOICE_VERTEX,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic", //$NON-NLS-1$
						new Object[]{"validateChoiceVertex", //$NON-NLS-1$
							org.eclipse.emf.ecore.util.EObjectValidator
								.getObjectLabel(pseudostate, context)}),
					new Object[]{pseudostate}));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The outgoing Transition from an initial vertex may have a behavior, but not a trigger or a guard.
	 * (kind = PseudostateKind::initial) implies (outgoing.guard = null and outgoing.trigger->isEmpty())
	 * @param pseudostate The receiving '<em><b>Pseudostate</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateOutgoingFromInitial(Pseudostate pseudostate,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(Diagnostic.ERROR,
					UMLValidator.DIAGNOSTIC_SOURCE,
					UMLValidator.PSEUDOSTATE__OUTGOING_FROM_INITIAL,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic", //$NON-NLS-1$
						new Object[]{"validateOutgoingFromInitial", //$NON-NLS-1$
							org.eclipse.emf.ecore.util.EObjectValidator
								.getObjectLabel(pseudostate, context)}),
					new Object[]{pseudostate}));
			}
			return false;
		}
		return true;
	}

} // PseudostateOperations