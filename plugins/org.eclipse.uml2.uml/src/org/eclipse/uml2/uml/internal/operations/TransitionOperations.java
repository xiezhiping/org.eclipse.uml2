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
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.UniqueEList;

import org.eclipse.uml2.uml.BehavioredClassifier;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.RedefinableElement;
import org.eclipse.uml2.uml.Region;
import org.eclipse.uml2.uml.StateMachine;
import org.eclipse.uml2.uml.Transition;
import org.eclipse.uml2.uml.Vertex;

import org.eclipse.uml2.uml.util.UMLValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Transition</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.Transition#isConsistentWith(org.eclipse.uml2.uml.RedefinableElement) <em>Is Consistent With</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Transition#validateStateIsExternal(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate State Is External</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Transition#validateJoinSegmentGuards(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Join Segment Guards</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Transition#validateStateIsInternal(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate State Is Internal</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Transition#validateOutgoingPseudostates(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Outgoing Pseudostates</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Transition#validateJoinSegmentState(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Join Segment State</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Transition#validateForkSegmentState(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Fork Segment State</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Transition#validateStateIsLocal(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate State Is Local</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Transition#validateInitialTransition(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Initial Transition</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Transition#validateForkSegmentGuards(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Fork Segment Guards</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Transition#containingStateMachine() <em>Containing State Machine</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Transition#redefinitionContext() <em>Redefinition Context</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TransitionOperations
		extends NamespaceOperations {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransitionOperations() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A fork segment must not have Guards or Triggers.
	 * (source.oclIsKindOf(Pseudostate) and source.oclAsType(Pseudostate).kind = PseudostateKind::fork) implies (guard = null and trigger->isEmpty())
	 * @param transition The receiving '<em><b>Transition</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateForkSegmentGuards(Transition transition,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(Diagnostic.ERROR,
					UMLValidator.DIAGNOSTIC_SOURCE,
					UMLValidator.TRANSITION__FORK_SEGMENT_GUARDS,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic", //$NON-NLS-1$
						new Object[]{"validateForkSegmentGuards", //$NON-NLS-1$
							org.eclipse.emf.ecore.util.EObjectValidator
								.getObjectLabel(transition, context)}),
					new Object[]{transition}));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A join segment must not have Guards or Triggers.
	 * (target.oclIsKindOf(Pseudostate) and target.oclAsType(Pseudostate).kind = PseudostateKind::join) implies (guard = null and trigger->isEmpty())
	 * @param transition The receiving '<em><b>Transition</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateJoinSegmentGuards(Transition transition,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(Diagnostic.ERROR,
					UMLValidator.DIAGNOSTIC_SOURCE,
					UMLValidator.TRANSITION__JOIN_SEGMENT_GUARDS,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic", //$NON-NLS-1$
						new Object[]{"validateJoinSegmentGuards", //$NON-NLS-1$
							org.eclipse.emf.ecore.util.EObjectValidator
								.getObjectLabel(transition, context)}),
					new Object[]{transition}));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A Transition with kind internal must have a State as its source, and its source and target must be equal.
	 * (kind = TransitionKind::internal) implies
	 * 		(source.oclIsKindOf (State) and source = target)
	 * @param transition The receiving '<em><b>Transition</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateStateIsInternal(Transition transition,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(Diagnostic.ERROR,
					UMLValidator.DIAGNOSTIC_SOURCE,
					UMLValidator.TRANSITION__STATE_IS_INTERNAL,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic", //$NON-NLS-1$
						new Object[]{"validateStateIsInternal", //$NON-NLS-1$
							org.eclipse.emf.ecore.util.EObjectValidator
								.getObjectLabel(transition, context)}),
					new Object[]{transition}));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A fork segment must always target a State.
	 * (source.oclIsKindOf(Pseudostate) and  source.oclAsType(Pseudostate).kind = PseudostateKind::fork) implies (target.oclIsKindOf(State))
	 * @param transition The receiving '<em><b>Transition</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateForkSegmentState(Transition transition,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(Diagnostic.ERROR,
					UMLValidator.DIAGNOSTIC_SOURCE,
					UMLValidator.TRANSITION__FORK_SEGMENT_STATE,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic", //$NON-NLS-1$
						new Object[]{"validateForkSegmentState", //$NON-NLS-1$
							org.eclipse.emf.ecore.util.EObjectValidator
								.getObjectLabel(transition, context)}),
					new Object[]{transition}));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A join segment must always originate from a State.
	 * (target.oclIsKindOf(Pseudostate) and target.oclAsType(Pseudostate).kind = PseudostateKind::join) implies (source.oclIsKindOf(State))
	 * @param transition The receiving '<em><b>Transition</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateJoinSegmentState(Transition transition,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(Diagnostic.ERROR,
					UMLValidator.DIAGNOSTIC_SOURCE,
					UMLValidator.TRANSITION__JOIN_SEGMENT_STATE,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic", //$NON-NLS-1$
						new Object[]{"validateJoinSegmentState", //$NON-NLS-1$
							org.eclipse.emf.ecore.util.EObjectValidator
								.getObjectLabel(transition, context)}),
					new Object[]{transition}));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Transitions outgoing Pseudostates may not have a Trigger.
	 * source.oclIsKindOf(Pseudostate) and (source.oclAsType(Pseudostate).kind <> PseudostateKind::initial) implies trigger->isEmpty()
	 * @param transition The receiving '<em><b>Transition</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateOutgoingPseudostates(Transition transition,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(Diagnostic.ERROR,
					UMLValidator.DIAGNOSTIC_SOURCE,
					UMLValidator.TRANSITION__OUTGOING_PSEUDOSTATES,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic", //$NON-NLS-1$
						new Object[]{"validateOutgoingPseudostates", //$NON-NLS-1$
							org.eclipse.emf.ecore.util.EObjectValidator
								.getObjectLabel(transition, context)}),
					new Object[]{transition}));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An initial Transition at the topmost level Region of a StateMachine that has no Trigger.
	 * (source.oclIsKindOf(Pseudostate) and container.stateMachine->notEmpty()) implies
	 * 	trigger->isEmpty()
	 * @param transition The receiving '<em><b>Transition</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateInitialTransition(Transition transition,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(Diagnostic.ERROR,
					UMLValidator.DIAGNOSTIC_SOURCE,
					UMLValidator.TRANSITION__INITIAL_TRANSITION,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic", //$NON-NLS-1$
						new Object[]{"validateInitialTransition", //$NON-NLS-1$
							org.eclipse.emf.ecore.util.EObjectValidator
								.getObjectLabel(transition, context)}),
					new Object[]{transition}));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A Transition with kind local must have a composite State or an entry point as its source.
	 * (kind = TransitionKind::local) implies
	 * 		((source.oclIsKindOf (State) and source.oclAsType(State).isComposite) or
	 * 		(source.oclIsKindOf (Pseudostate) and source.oclAsType(Pseudostate).kind = PseudostateKind::entryPoint))
	 * @param transition The receiving '<em><b>Transition</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateStateIsLocal(Transition transition,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(Diagnostic.ERROR,
					UMLValidator.DIAGNOSTIC_SOURCE,
					UMLValidator.TRANSITION__STATE_IS_LOCAL,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic", //$NON-NLS-1$
						new Object[]{"validateStateIsLocal", //$NON-NLS-1$
							org.eclipse.emf.ecore.util.EObjectValidator
								.getObjectLabel(transition, context)}),
					new Object[]{transition}));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The redefinition context of a Transition is the nearest containing StateMachine.
	 * result = (let sm : StateMachine = containingStateMachine() in
	 * if sm._'context' = null or sm.general->notEmpty() then
	 *   sm
	 * else
	 *   sm._'context'
	 * endif)
	 * <p>From package UML::StateMachines.</p>
	 * @param transition The receiving '<em><b>Transition</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static Classifier redefinitionContext(Transition transition) {
		StateMachine sm = transition.containingStateMachine();

		if (sm != null) {
			BehavioredClassifier context = sm.getContext();
			return context == null || !sm.getGenerals().isEmpty()
				? sm
				: context;
		}

		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The query containingStateMachine() returns the StateMachine that contains the Transition either directly or transitively.
	 * result = (container.containingStateMachine())
	 * <p>From package UML::StateMachines.</p>
	 * @param transition The receiving '<em><b>Transition</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static StateMachine containingStateMachine(Transition transition) {
		Region container = transition.getContainer();
		return container == null
			? null
			: container.containingStateMachine();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The query isConsistentWith() specifies that a redefining Transition is consistent with a redefined Transition provided that the redefining Transition has the following relation to the redefined Transition: A redefining Transition redefines all properties of the corresponding redefined Transition except the source State and the Trigger.
	 * redefiningElement.isRedefinitionContextValid(self)
	 * result = (-- the following is merely a default body; it is expected that the specific form of this constraint will be specified by profiles
	 * true)
	 * <p>From package UML::StateMachines.</p>
	 * @param transition The receiving '<em><b>Transition</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static boolean isConsistentWith(Transition transition,
			RedefinableElement redefiningElement) {

		if (redefiningElement != null
			&& redefiningElement.isRedefinitionContextValid(transition)) {

			Transition redefiningTransition = (Transition) redefiningElement;

			EList<Vertex> sources = new UniqueEList.FastCompare<Vertex>();

			Vertex source = transition.getSource();

			if (source != null) {
				sources.add(source);
			}

			Vertex redefiningSource = redefiningTransition.getSource();

			if (redefiningSource != null) {
				sources.add(redefiningSource);
			}

			return RedefinableElementOperations
				.excludeRedefinedElements(sources).size() < 2
				&& transition.getTriggers()
					.equals(redefiningTransition.getTriggers());
		}

		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A Transition with kind external can source any Vertex except entry points.
	 * (kind = TransitionKind::external) implies
	 * 	not (source.oclIsKindOf(Pseudostate) and source.oclAsType(Pseudostate).kind = PseudostateKind::entryPoint)
	 * @param transition The receiving '<em><b>Transition</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateStateIsExternal(Transition transition,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(Diagnostic.ERROR,
					UMLValidator.DIAGNOSTIC_SOURCE,
					UMLValidator.TRANSITION__STATE_IS_EXTERNAL,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic", //$NON-NLS-1$
						new Object[]{"validateStateIsExternal", //$NON-NLS-1$
							org.eclipse.emf.ecore.util.EObjectValidator
								.getObjectLabel(transition, context)}),
					new Object[]{transition}));
			}
			return false;
		}
		return true;
	}

	protected static EList<Transition> getAllRedefinedTransitions(
			Transition transition, EList<Transition> allRedefinedTransitions) {
		Transition redefinedTransition = transition.getRedefinedTransition();

		if (redefinedTransition != null
			&& allRedefinedTransitions.add(redefinedTransition)) {

			getAllRedefinedTransitions(redefinedTransition,
				allRedefinedTransitions);
		}

		return allRedefinedTransitions;
	}

	protected static EList<Transition> getAllRedefinedTransitions(
			Transition transition) {
		return getAllRedefinedTransitions(transition,
			new UniqueEList.FastCompare<Transition>());
	}

} // TransitionOperations