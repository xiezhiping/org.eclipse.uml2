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
 * $Id: StateOperations.java,v 1.1 2005/11/14 22:25:54 khussey Exp $
 */
package org.eclipse.uml2.uml.internal.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.RedefinableElement;
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
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.State#validateRegions(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Regions</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.State#validateSubmachineStates(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Submachine States</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.State#validateDestinationsOrSourcesOfTransitions(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Destinations Or Sources Of Transitions</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.State#validateSubmachineOrRegions(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Submachine Or Regions</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.State#validateCompositeStates(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Composite States</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.State#validateEntryOrExit(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Entry Or Exit</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.State#isSimple() <em>Is Simple</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.State#isComposite() <em>Is Composite</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.State#isOrthogonal() <em>Is Orthogonal</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.State#isSubmachineState() <em>Is Submachine State</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.State#redefinitionContext() <em>Redefinition Context</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.State#isRedefinitionContextValid() <em>Is Redefinition Context Valid</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.State#isConsistentWith(org.eclipse.uml2.uml.RedefinableElement) <em>Is Consistent With</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.State#containingStateMachine() <em>Containing State Machine</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public final class StateOperations {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private StateOperations() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * There have to be at least two regions in an orthogonal composite state.
	 * (self.isOrthogonal) implies
	 * (self.region->size >= 2)
	 * 
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateRegions(State state,
			DiagnosticChain diagnostics, Map context) {
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
						UMLValidator.STATE__REGIONS,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE
							.getString(
								"_UI_GenericInvariant_diagnostic", new Object[]{"validateRegions", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(state, context)}), //$NON-NLS-1$ //$NON-NLS-2$
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
	 * Only submachine states can have connection point references.
	 * isSubmachineState implies connection->notEmpty ( )
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateSubmachineStates(State state,
			DiagnosticChain diagnostics, Map context) {
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
						UMLValidator.STATE__SUBMACHINE_STATES,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE
							.getString(
								"_UI_GenericInvariant_diagnostic", new Object[]{"validateSubmachineStates", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(state, context)}), //$NON-NLS-1$ //$NON-NLS-2$
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
	 * The connection point references used as destinations/sources of transitions associated with a submachine state must be defined as entry/exit points in the submachine state machine.
	 * true
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateDestinationsOrSourcesOfTransitions(
			State state, DiagnosticChain diagnostics, Map context) {
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
						UMLValidator.STATE__DESTINATIONS_OR_SOURCES_OF_TRANSITIONS,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE
							.getString(
								"_UI_GenericInvariant_diagnostic", new Object[]{"validateDestinationsOrSourcesOfTransitions", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(state, context)}), //$NON-NLS-1$ //$NON-NLS-2$
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
	 * A state is not allowed to have both a submachine and regions.
	 * isComposite implies not isSubmachineState
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateSubmachineOrRegions(State state,
			DiagnosticChain diagnostics, Map context) {
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
						UMLValidator.STATE__SUBMACHINE_OR_REGIONS,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE
							.getString(
								"_UI_GenericInvariant_diagnostic", new Object[]{"validateSubmachineOrRegions", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(state, context)}), //$NON-NLS-1$ //$NON-NLS-2$
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
	 * Only composite states can have entry or exit pseudostates defined.
	 * connectionPoint->notEmpty() implies isComoposite
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateCompositeStates(State state,
			DiagnosticChain diagnostics, Map context) {
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
						UMLValidator.STATE__COMPOSITE_STATES,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE
							.getString(
								"_UI_GenericInvariant_diagnostic", new Object[]{"validateCompositeStates", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(state, context)}), //$NON-NLS-1$ //$NON-NLS-2$
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
	 * Only entry or exit pseudostates can serve as connection points.
	 * connectionPoint->forAll(cp|cp.kind = #entry or cp.kind = #exit)
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateEntryOrExit(State state,
			DiagnosticChain diagnostics, Map context) {
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
						UMLValidator.STATE__ENTRY_OR_EXIT,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE
							.getString(
								"_UI_GenericInvariant_diagnostic", new Object[]{"validateEntryOrExit", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(state, context)}), //$NON-NLS-1$ //$NON-NLS-2$
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
	 * A simple state is a state without any regions.
	 * result = region.isEmpty()
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean isSimple(State state) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A composite state is a state with at least one region.
	 * result = region.notEmpty()
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean isComposite(State state) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An orthogonal state is a composite state with at least 2 regions
	 * result = (region->size () > 1)
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean isOrthogonal(State state) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Only submachine states can have a reference statemachine.
	 * result = submachine.notEmpty()
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean isSubmachineState(State state) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The redefinition context of a state is the nearest containing statemachine.
	 * result = let sm = containingStateMachine() in
	 * if sm.context->isEmpty() or sm.general->notEmpty() then
	 * sm
	 * else
	 * sm.context
	 * endif
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static Classifier redefinitionContext(State state) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The query isRedefinitionContextValid() specifies whether the redefinition contexts of a state are properly related to the redefinition contexts of the specified state to allow this element to redefine the other. The containing region of a redefining state must redefine the containing region of the redefined state.
	 * result = true
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean isRedefinitionContextValid(State state) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The query isConsistentWith() specifies that a redefining state is consistent with a redefined state provided that the redefining state is an extension of the redefined state: A simple state can be redefined (extended) to become a composite state (by adding a region) and a composite state can be redefined (extended) by adding regions and by adding vertices, states, and transitions to inherited regions. All states may add or replace entry, exit, and 'doActivity' actions.
	 * result = true
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean isConsistentWith(State state,
			RedefinableElement redefinee) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The query containingStateMachine() returns the state machine that contains the state either directly or transitively.
	 * result = container.containingStateMachine()
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static StateMachine containingStateMachine(State state) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

} // StateOperations