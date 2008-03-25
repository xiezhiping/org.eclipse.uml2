/*
 * Copyright (c) 2005, 2008 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *
 * $Id: RegionOperations.java,v 1.12 2008/03/25 13:41:38 jbruck Exp $
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
import org.eclipse.uml2.uml.ProtocolStateMachine;
import org.eclipse.uml2.uml.RedefinableElement;
import org.eclipse.uml2.uml.Region;
import org.eclipse.uml2.uml.State;
import org.eclipse.uml2.uml.StateMachine;
import org.eclipse.uml2.uml.Transition;
import org.eclipse.uml2.uml.Vertex;

import org.eclipse.uml2.uml.util.UMLValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Region</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.Region#isConsistentWith(org.eclipse.uml2.uml.RedefinableElement) <em>Is Consistent With</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Region#validateInitialVertex(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Initial Vertex</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Region#validateDeepHistoryVertex(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Deep History Vertex</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Region#validateShallowHistoryVertex(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Shallow History Vertex</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Region#validateOwned(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Owned</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Region#redefinitionContext() <em>Redefinition Context</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Region#isRedefinitionContextValid(org.eclipse.uml2.uml.Region) <em>Is Redefinition Context Valid</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Region#containingStateMachine() <em>Containing State Machine</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Region#belongsToPSM() <em>Belongs To PSM</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RegionOperations
		extends NamespaceOperations {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RegionOperations() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A region can have at most one initial vertex
	 * self.subvertex->select (v | v.oclIsKindOf(Pseudostate))->
	 * select(p : Pseudostate | p.kind = #initial)->size() <= 1
	 * 
	 * @param region The receiving '<em><b>Region</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateInitialVertex(Region region,
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
						UMLValidator.REGION__INITIAL_VERTEX,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE
							.getString(
								"_UI_GenericInvariant_diagnostic", new Object[]{"validateInitialVertex", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(region, context)}), //$NON-NLS-1$ //$NON-NLS-2$
						new Object[]{region}));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A region can have at most one deep history vertex
	 * self.subvertex->select (v | v.oclIsKindOf(Pseudostate))->
	 * select(p : Pseudostate | p.kind = #deepHistory)->size() <= 1
	 * 
	 * @param region The receiving '<em><b>Region</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateDeepHistoryVertex(Region region,
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
						UMLValidator.REGION__DEEP_HISTORY_VERTEX,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE
							.getString(
								"_UI_GenericInvariant_diagnostic", new Object[]{"validateDeepHistoryVertex", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(region, context)}), //$NON-NLS-1$ //$NON-NLS-2$
						new Object[]{region}));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A region can have at most one shallow history vertex
	 * self.subvertex->select(v | v.oclIsKindOf(Pseudostate))->
	 * select(p : Pseudostate | p.kind = #shallowHistory)->size() <= 1
	 * 
	 * @param region The receiving '<em><b>Region</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateShallowHistoryVertex(Region region,
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
						UMLValidator.REGION__SHALLOW_HISTORY_VERTEX,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE
							.getString(
								"_UI_GenericInvariant_diagnostic", new Object[]{"validateShallowHistoryVertex", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(region, context)}), //$NON-NLS-1$ //$NON-NLS-2$
						new Object[]{region}));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If a Region is owned by a StateMachine, then it cannot also be owned by a State and vice versa.
	 * (stateMachine->notEmpty() implies state->isEmpty()) and (state->notEmpty() implies stateMachine->isEmpty())
	 * @param region The receiving '<em><b>Region</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateOwned(Region region,
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
						UMLValidator.REGION__OWNED,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE
							.getString(
								"_UI_GenericInvariant_diagnostic", new Object[]{"validateOwned", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(region, context)}), //$NON-NLS-1$ //$NON-NLS-2$
						new Object[]{region}));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The redefinition context of a region is the nearest containing statemachine
	 * result = let sm = containingStateMachine() in
	 * if sm.context->isEmpty() or sm.general->notEmpty() then
	 * sm
	 * else
	 * sm.context
	 * endif
	 * @param region The receiving '<em><b>Region</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static Classifier redefinitionContext(Region region) {
		StateMachine sm = region.containingStateMachine();

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
	 * The query isRedefinitionContextValid() specifies whether the redefinition contexts of a region are properly related to the redefinition contexts of the specified region to allow this element to redefine the other. The containing statemachine/state of a redefining region must redefine the containing statemachine/state of the redefined region.
	 * result = true
	 * @param region The receiving '<em><b>Region</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static boolean isRedefinitionContextValid(Region region,
			Region redefined) {

		if (redefined != null) {
			StateMachine stateMachine = region.getStateMachine();

			if (stateMachine != null) {
				return StateMachineOperations.getAllExtendedStateMachines(
					stateMachine).contains(redefined.getStateMachine());
			} else {
				State state = region.getState();

				return state != null
					&& StateOperations.getAllRedefinedStates(state).contains(
						redefined.getState());
			}
		}

		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The operation containingStateMachine() returns the sate machine in which this Region is defined
	 * result = if stateMachine->isEmpty() 
	 * then
	 * state.containingStateMachine()
	 * else
	 * stateMachine
	 * endif
	 * @param region The receiving '<em><b>Region</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static StateMachine containingStateMachine(Region region) {
		StateMachine stateMachine = region.getStateMachine();

		if (stateMachine == null) {
			State state = region.getState();
			return state == null
				? null
				: state.containingStateMachine();
		} else {
			return stateMachine;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The operation belongsToPSM () checks if the region belongs to a protocol state machine
	 * result = if not stateMachine->isEmpty() then
	 * oclIsTypeOf(ProtocolStateMachine)
	 * else if not state->isEmpty() then
	 * state.container.belongsToPSM ()
	 * else false
	 * @param region The receiving '<em><b>Region</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static boolean belongsToPSM(Region region) {
		StateMachine stateMachine = region.getStateMachine();

		if (stateMachine != null) {
			return stateMachine instanceof ProtocolStateMachine;
		} else {
			State state = region.getState();

			if (state != null) {
				Region container = state.getContainer();
				return container != null && container.belongsToPSM();
			}

			return false;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The query isConsistentWith() specifies that a redefining region is consistent with a redefined region provided that the redefining region is an extension of the redefined region, i.e. it adds vertices and transitions and it redefines states and transitions of the redefined region.
	 * result = true
	 * @param region The receiving '<em><b>Region</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static boolean isConsistentWith(Region region,
			RedefinableElement redefinee) {

		if (redefinee != null && redefinee.isRedefinitionContextValid(region)) {
			Region redefineeRegion = (Region) redefinee;
			EList<Vertex> allSubvertices = getAllSubvertices(region);

			for (Vertex redefineeSubvertex : redefineeRegion.getSubvertices()) {

				if (redefineeSubvertex instanceof State) {
					State redefinedState = ((State) redefineeSubvertex)
						.getRedefinedState();

					if (redefinedState != null
						&& !allSubvertices.contains(redefinedState)) {

						return false;
					}
				}
			}

			EList<Transition> allTransitions = getAllTransitions(region);

			for (Transition redefineeTransition : redefineeRegion
				.getTransitions()) {

				Transition redefinedTransition = redefineeTransition
					.getRedefinedTransition();

				if (redefinedTransition != null
					&& !allTransitions.contains(redefinedTransition)) {

					return false;
				}
			}

			return true;
		}

		return false;
	}

	protected static EList<Region> getAllExtendedRegions(Region region,
			EList<Region> allExtendedRegions) {
		Region extendedRegion = region.getExtendedRegion();

		if (extendedRegion != null && allExtendedRegions.add(extendedRegion)) {
			getAllExtendedRegions(extendedRegion, allExtendedRegions);
		}

		return allExtendedRegions;
	}

	protected static EList<Region> getAllExtendedRegions(Region region) {
		return getAllExtendedRegions(region,
			new UniqueEList.FastCompare<Region>());
	}

	protected static EList<Vertex> getAllSubvertices(Region region) {
		EList<Vertex> allSubvertices = new UniqueEList.FastCompare<Vertex>(
			region.getSubvertices());

		for (Region extendedRegion : getAllExtendedRegions(region)) {
			allSubvertices.addAll(extendedRegion.getSubvertices());
		}

		return RedefinableElementOperations
			.excludeRedefinedElements(allSubvertices);
	}

	protected static EList<Transition> getAllTransitions(Region region) {
		EList<Transition> allTransitions = new UniqueEList.FastCompare<Transition>(
			region.getTransitions());

		for (Region extendedRegion : getAllExtendedRegions(region)) {

			allTransitions.addAll(extendedRegion.getTransitions());
		}

		return RedefinableElementOperations
			.excludeRedefinedElements(allTransitions);
	}

} // RegionOperations
