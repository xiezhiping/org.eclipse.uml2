/*
 * Copyright (c) 2005, 2016 IBM Corporation, CEA, and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *   Kenn Hussey - 323181
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
import org.eclipse.uml2.uml.State;
import org.eclipse.uml2.uml.StateMachine;

import org.eclipse.uml2.uml.util.UMLValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>State</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.State#isConsistentWith(org.eclipse.uml2.uml.RedefinableElement) <em>Is Consistent With</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.State#isRedefinitionContextValid(org.eclipse.uml2.uml.RedefinableElement) <em>Is Redefinition Context Valid</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.State#containingStateMachine() <em>Containing State Machine</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.State#validateEntryOrExit(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Entry Or Exit</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.State#validateSubmachineStates(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Submachine States</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.State#validateCompositeStates(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Composite States</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.State#validateDestinationsOrSourcesOfTransitions(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Destinations Or Sources Of Transitions</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.State#validateSubmachineOrRegions(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Submachine Or Regions</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.State#isComposite() <em>Is Composite</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.State#isOrthogonal() <em>Is Orthogonal</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.State#isSimple() <em>Is Simple</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.State#isSubmachineState() <em>Is Submachine State</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.State#redefinitionContext() <em>Redefinition Context</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StateOperations
		extends NamespaceOperations {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StateOperations() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Only submachine States can have connection point references.
	 * isSubmachineState implies connection->notEmpty( )
	 * @param state The receiving '<em><b>State</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateSubmachineStates(State state,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(Diagnostic.ERROR,
					UMLValidator.DIAGNOSTIC_SOURCE,
					UMLValidator.STATE__SUBMACHINE_STATES,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic", //$NON-NLS-1$
						new Object[]{"validateSubmachineStates", //$NON-NLS-1$
							org.eclipse.emf.ecore.util.EObjectValidator
								.getObjectLabel(state, context)}),
					new Object[]{state}));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The connection point references used as destinations/sources of Transitions associated with a submachine State must be defined as entry/exit points in the submachine StateMachine.
	 * self.isSubmachineState implies (self.connection->forAll (cp |
	 *   cp.entry->forAll (ps | ps.stateMachine = self.submachine) and
	 *   cp.exit->forAll (ps | ps.stateMachine = self.submachine)))
	 * @param state The receiving '<em><b>State</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateDestinationsOrSourcesOfTransitions(
			State state, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(Diagnostic.ERROR,
					UMLValidator.DIAGNOSTIC_SOURCE,
					UMLValidator.STATE__DESTINATIONS_OR_SOURCES_OF_TRANSITIONS,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic", //$NON-NLS-1$
						new Object[]{
							"validateDestinationsOrSourcesOfTransitions", //$NON-NLS-1$
							org.eclipse.emf.ecore.util.EObjectValidator
								.getObjectLabel(state, context)}),
					new Object[]{state}));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A State is not allowed to have both a submachine and Regions.
	 * isComposite implies not isSubmachineState
	 * @param state The receiving '<em><b>State</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateSubmachineOrRegions(State state,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(Diagnostic.ERROR,
					UMLValidator.DIAGNOSTIC_SOURCE,
					UMLValidator.STATE__SUBMACHINE_OR_REGIONS,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic", //$NON-NLS-1$
						new Object[]{"validateSubmachineOrRegions", //$NON-NLS-1$
							org.eclipse.emf.ecore.util.EObjectValidator
								.getObjectLabel(state, context)}),
					new Object[]{state}));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Only composite States can have entry or exit Pseudostates defined.
	 * connectionPoint->notEmpty() implies isComposite
	 * @param state The receiving '<em><b>State</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateCompositeStates(State state,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(Diagnostic.ERROR,
					UMLValidator.DIAGNOSTIC_SOURCE,
					UMLValidator.STATE__COMPOSITE_STATES,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic", //$NON-NLS-1$
						new Object[]{"validateCompositeStates", //$NON-NLS-1$
							org.eclipse.emf.ecore.util.EObjectValidator
								.getObjectLabel(state, context)}),
					new Object[]{state}));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Only entry or exit Pseudostates can serve as connection points.
	 * connectionPoint->forAll(kind = PseudostateKind::entryPoint or kind = PseudostateKind::exitPoint)
	 * @param state The receiving '<em><b>State</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateEntryOrExit(State state,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(Diagnostic.ERROR,
					UMLValidator.DIAGNOSTIC_SOURCE,
					UMLValidator.STATE__ENTRY_OR_EXIT,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic", //$NON-NLS-1$
						new Object[]{"validateEntryOrExit", //$NON-NLS-1$
							org.eclipse.emf.ecore.util.EObjectValidator
								.getObjectLabel(state, context)}),
					new Object[]{state}));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A simple State is a State without any regions.
	 * result = ((region->isEmpty()) and not isSubmachineState())
	 * <p>From package UML::StateMachines.</p>
	 * @param state The receiving '<em><b>State</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static boolean isSimple(State state) {
		return state.getRegions().isEmpty() && !isSubmachineState(state);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A composite State is a State with at least one Region.
	 * result = (region->notEmpty())
	 * <p>From package UML::StateMachines.</p>
	 * @param state The receiving '<em><b>State</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static boolean isComposite(State state) {
		return !state.getRegions().isEmpty();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An orthogonal State is a composite state with at least 2 regions.
	 * result = (region->size () > 1)
	 * <p>From package UML::StateMachines.</p>
	 * @param state The receiving '<em><b>State</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static boolean isOrthogonal(State state) {
		return state.getRegions().size() > 1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Only submachine State references another StateMachine.
	 * result = (submachine <> null)
	 * <p>From package UML::StateMachines.</p>
	 * @param state The receiving '<em><b>State</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static boolean isSubmachineState(State state) {
		return state.getSubmachine() != null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The redefinition context of a State is the nearest containing StateMachine.
	 * result = (let sm : StateMachine = containingStateMachine() in
	 * if sm._'context' = null or sm.general->notEmpty() then
	 *   sm
	 * else
	 *   sm._'context'
	 * endif)
	 * <p>From package UML::StateMachines.</p>
	 * @param state The receiving '<em><b>State</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static Classifier redefinitionContext(State state) {
		StateMachine sm = state.containingStateMachine();

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
	 * The query isConsistentWith() specifies that a redefining State is consistent with a redefined State provided that the redefining State is an extension of the redefined State A simple State can be redefined (extended) to become a composite State (by adding one or more Regions) and a composite State can be redefined (extended) by adding Regions and by adding Vertices, States, and Transitions to inherited Regions. All States may add or replace entry, exit, and 'doActivity' Behaviors.
	 * redefiningElement.isRedefinitionContextValid(self)
	 * result = (-- the following is merely a default body; it is expected that the specific form of this constraint will be specified by profiles
	 * true)
	 * <p>From package UML::StateMachines.</p>
	 * @param state The receiving '<em><b>State</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static boolean isConsistentWith(State state,
			RedefinableElement redefiningElement) {

		if (redefiningElement != null
			&& redefiningElement.isRedefinitionContextValid(state)) {

			State redefiningState = (State) redefiningElement;

			EList<Region> allRegions = getAllRegions(state);

			for (Region redefiningRegion : redefiningState.getRegions()) {
				Region extendedRegion = redefiningRegion.getExtendedRegion();

				if (allRegions.contains(extendedRegion)
					&& !extendedRegion.isConsistentWith(redefiningRegion)) {

					return false;
				}
			}

			return true;
		}

		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The query isRedefinitionContextValid() specifies whether the redefinition contexts of a State are properly related to the redefinition contexts of the specified State to allow this element to redefine the other. This means that the containing Region of a redefining State must redefine the containing Region of the redefined State.
	 * result = (if redefinedElement.oclIsKindOf(State) then
	 *   let redefinedState : State = redefinedElement.oclAsType(State) in
	 *     container.redefinedElement.oclAsType(Region)->exists(r:Region |
	 *       r.subvertex->includes(redefinedState))
	 * else
	 *   false
	 * endif)
	 * <p>From package UML::StateMachines.</p>
	 * @param state The receiving '<em><b>State</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static boolean isRedefinitionContextValid(State state,
			RedefinableElement redefinedElement) {

		if (redefinedElement instanceof State) {
			Region container = state.getContainer();

			if (container != null) {

				for (RedefinableElement redefinedRegion : container
					.getRedefinedElements()) {

					if (redefinedRegion instanceof Region
						&& ((Region) redefinedRegion).getSubvertices()
							.contains(redefinedElement)) {

						return true;
					}
				}
			}
		}

		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The query containingStateMachine() returns the StateMachine that contains the State either directly or transitively.
	 * result = (container.containingStateMachine())
	 * <p>From package UML::StateMachines.</p>
	 * @param state The receiving '<em><b>State</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static StateMachine containingStateMachine(State state) {
		Region container = state.getContainer();
		return container == null
			? null
			: container.containingStateMachine();
	}

	protected static EList<State> getAllRedefinedStates(State state,
			EList<State> allRedefinedStates) {
		State redefinedState = state.getRedefinedState();

		if (redefinedState != null && allRedefinedStates.add(redefinedState)) {
			getAllRedefinedStates(redefinedState, allRedefinedStates);
		}

		return allRedefinedStates;
	}

	protected static EList<State> getAllRedefinedStates(State state) {
		return getAllRedefinedStates(state,
			new UniqueEList.FastCompare<State>());
	}

	protected static EList<Region> getAllRegions(State state) {
		EList<Region> allRegions = new UniqueEList.FastCompare<Region>(
			state.getRegions());

		for (State redefinedState : getAllRedefinedStates(state)) {
			allRegions.addAll(redefinedState.getRegions());
		}

		return RedefinableElementOperations
			.excludeRedefinedElements(allRegions);
	}

} // StateOperations
