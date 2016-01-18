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
import org.eclipse.uml2.uml.RedefinableElement;
import org.eclipse.uml2.uml.Region;
import org.eclipse.uml2.uml.State;
import org.eclipse.uml2.uml.StateMachine;

import org.eclipse.uml2.uml.Vertex;
import org.eclipse.uml2.uml.util.UMLValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>State Machine</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.StateMachine#validateConnectionPoints(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Connection Points</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.StateMachine#validateClassifierContext(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Classifier Context</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.StateMachine#validateMethod(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Method</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.StateMachine#validateContextClassifier(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Context Classifier</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.StateMachine#LCA(org.eclipse.uml2.uml.Vertex, org.eclipse.uml2.uml.Vertex) <em>LCA</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.StateMachine#ancestor(org.eclipse.uml2.uml.Vertex, org.eclipse.uml2.uml.Vertex) <em>Ancestor</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.StateMachine#LCAState(org.eclipse.uml2.uml.Vertex, org.eclipse.uml2.uml.Vertex) <em>LCA State</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.StateMachine#isConsistentWith(org.eclipse.uml2.uml.RedefinableElement) <em>Is Consistent With</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.StateMachine#isRedefinitionContextValid(org.eclipse.uml2.uml.RedefinableElement) <em>Is Redefinition Context Valid</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StateMachineOperations
		extends BehaviorOperations {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StateMachineOperations() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Classifier context of a StateMachine cannot be an Interface.
	 * _'context' <> null implies not _'context'.oclIsKindOf(Interface)
	 * @param stateMachine The receiving '<em><b>State Machine</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateClassifierContext(StateMachine stateMachine,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(Diagnostic.ERROR,
					UMLValidator.DIAGNOSTIC_SOURCE,
					UMLValidator.STATE_MACHINE__CLASSIFIER_CONTEXT,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic", //$NON-NLS-1$
						new Object[]{"validateClassifierContext", //$NON-NLS-1$
							org.eclipse.emf.ecore.util.EObjectValidator
								.getObjectLabel(stateMachine, context)}),
					new Object[]{stateMachine}));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The context Classifier of the method StateMachine of a BehavioralFeature must be the Classifier that owns the BehavioralFeature.
	 * specification <> null implies ( _'context' <> null and specification.featuringClassifier->exists(c | c = _'context'))
	 * @param stateMachine The receiving '<em><b>State Machine</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateContextClassifier(StateMachine stateMachine,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(Diagnostic.ERROR,
					UMLValidator.DIAGNOSTIC_SOURCE,
					UMLValidator.STATE_MACHINE__CONTEXT_CLASSIFIER,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic", //$NON-NLS-1$
						new Object[]{"validateContextClassifier", //$NON-NLS-1$
							org.eclipse.emf.ecore.util.EObjectValidator
								.getObjectLabel(stateMachine, context)}),
					new Object[]{stateMachine}));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The operation LCA(s1,s2) returns the Region that is the least common ancestor of Vertices s1 and s2, based on the StateMachine containment hierarchy.
	 * result = (if ancestor(s1, s2) then 
	 *     s2.container
	 * else
	 * 	if ancestor(s2, s1) then
	 * 	    s1.container 
	 * 	else 
	 * 	    LCA(s1.container.state, s2.container.state)
	 * 	endif
	 * endif)
	 * <p>From package UML::StateMachines.</p>
	 * @param stateMachine The receiving '<em><b>State Machine</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static Region LCA(StateMachine stateMachine, Vertex s1, Vertex s2) {

		if (ancestor(stateMachine, s1, s2)) {
			return s2.getContainer();
		} else if (ancestor(stateMachine, s2, s1)) {
			return s1.getContainer();
		} else {
			Region container1 = s1.getContainer();
			State state1 = container1 == null
				? null
				: container1.getState();

			Region container2 = s2.getContainer();
			State state2 = container2 == null
				? null
				: container2.getState();

			return state1 != null && state2 != null
				? LCA(stateMachine, state1, state2)
				: null;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The query ancestor(s1, s2) checks whether Vertex s2 is an ancestor of Vertex s1.
	 * result = (if (s2 = s1) then 
	 * 	true 
	 * else 
	 * 	if s1.container.stateMachine->notEmpty() then 
	 * 	    true
	 * 	else 
	 * 	    if s2.container.stateMachine->notEmpty() then 
	 * 	        false
	 * 	    else
	 * 	        ancestor(s1, s2.container.state)
	 * 	     endif
	 * 	 endif
	 * endif  )
	 * <p>From package UML::StateMachines.</p>
	 * @param stateMachine The receiving '<em><b>State Machine</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static boolean ancestor(StateMachine stateMachine, Vertex s1,
			Vertex s2) {

		if (s1 == s2) {
			return true;
		} else {
			Region container1 = s1.getContainer();

			if (container1 != null && container1.getStateMachine() != null) {
				return true;
			} else {
				Region container2 = s2.getContainer();

				if (container2 != null) {

					if (container2.getStateMachine() != null) {
						return false;
					} else {
						State state2 = container2.getState();

						if (state2 != null) {
							return ancestor(stateMachine, s1, state2);
						}
					}
				}

				return false;
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This utility funciton is like the LCA, except that it returns the nearest composite State that contains both input Vertices.
	 * result = (if v2.oclIsTypeOf(State) and ancestor(v1, v2) then
	 * 	v2.oclAsType(State)
	 * else if v1.oclIsTypeOf(State) and ancestor(v2, v1) then
	 * 	v1.oclAsType(State)
	 * else if (v1.container.state->isEmpty() or v2.container.state->isEmpty()) then 
	 * 	null.oclAsType(State)
	 * else LCAState(v1.container.state, v2.container.state)
	 * endif endif endif)
	 * <p>From package UML::StateMachines.</p>
	 * @param stateMachine The receiving '<em><b>State Machine</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static State LCAState(StateMachine stateMachine, Vertex v1,
			Vertex v2) {

		if (v2 instanceof State && ancestor(stateMachine, v1, v2)) {
			return (State) v2;
		} else if (v1 instanceof State && ancestor(stateMachine, v2, v1)) {
			return (State) v1;
		} else {
			Region container1 = v1.getContainer();
			State state1 = container1 == null
				? null
				: container1.getState();

			Region container2 = v2.getContainer();
			State state2 = container2 == null
				? null
				: container2.getState();

			return state1 == null || state2 == null
				? null
				: LCAState(stateMachine, state1, state2);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The connection points of a StateMachine are Pseudostates of kind entry point or exit point.
	 * connectionPoint->forAll (kind = PseudostateKind::entryPoint or kind = PseudostateKind::exitPoint)
	 * @param stateMachine The receiving '<em><b>State Machine</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateConnectionPoints(StateMachine stateMachine,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(Diagnostic.ERROR,
					UMLValidator.DIAGNOSTIC_SOURCE,
					UMLValidator.STATE_MACHINE__CONNECTION_POINTS,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic", //$NON-NLS-1$
						new Object[]{"validateConnectionPoints", //$NON-NLS-1$
							org.eclipse.emf.ecore.util.EObjectValidator
								.getObjectLabel(stateMachine, context)}),
					new Object[]{stateMachine}));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A StateMachine as the method for a BehavioralFeature cannot have entry/exit connection points.
	 * specification <> null implies connectionPoint->isEmpty()
	 * @param stateMachine The receiving '<em><b>State Machine</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateMethod(StateMachine stateMachine,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(Diagnostic.ERROR,
					UMLValidator.DIAGNOSTIC_SOURCE,
					UMLValidator.STATE_MACHINE__METHOD,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic", //$NON-NLS-1$
						new Object[]{"validateMethod", //$NON-NLS-1$
							org.eclipse.emf.ecore.util.EObjectValidator
								.getObjectLabel(stateMachine, context)}),
					new Object[]{stateMachine}));
			}
			return false;
		}
		return true;
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
	 * @param stateMachine The receiving '<em><b>State Machine</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static boolean isConsistentWith(StateMachine stateMachine,
			RedefinableElement redefiningElement) {

		if (redefiningElement != null
			&& redefiningElement.isRedefinitionContextValid(stateMachine)) {

			StateMachine redefiningStateMachine = (StateMachine) redefiningElement;
			EList<Region> allRegions = getAllRegions(stateMachine);

			for (Region redefiningRegion : redefiningStateMachine
				.getRegions()) {
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
	 * The query isRedefinitionContextValid() specifies whether the redefinition context of a StateMachine is properly related to the redefinition contexts of the specified StateMachine to allow this element to redefine the other. The context Classifier of a redefining StateMachine must redefine the context Classifier of the redefined StateMachine.
	 * result = (if redefinedElement.oclIsKindOf(StateMachine) then
	 *   let redefinedStateMachine : StateMachine = redefinedElement.oclAsType(StateMachine) in
	 *     self._'context'().oclAsType(BehavioredClassifier).redefinedClassifier->
	 *       includes(redefinedStateMachine._'context'())
	 * else
	 *   false
	 * endif)
	 * <p>From package UML::StateMachines.</p>
	 * @param stateMachine The receiving '<em><b>State Machine</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static boolean isRedefinitionContextValid(StateMachine stateMachine,
			RedefinableElement redefinedElement) {

		if (redefinedElement instanceof StateMachine) {
			BehavioredClassifier context = stateMachine.getContext();

			return context != null && context.getRedefinedClassifiers()
				.contains(((StateMachine) redefinedElement).getContext());
		}

		return false;
	}

	protected static EList<StateMachine> getAllExtendedStateMachines(
			StateMachine stateMachine,
			EList<StateMachine> allExtendedStateMachines) {

		for (StateMachine extendedStateMachine : stateMachine
			.getExtendedStateMachines()) {

			if (allExtendedStateMachines.add(extendedStateMachine)) {
				getAllExtendedStateMachines(extendedStateMachine,
					allExtendedStateMachines);
			}
		}

		return allExtendedStateMachines;
	}

	protected static EList<StateMachine> getAllExtendedStateMachines(
			StateMachine stateMachine) {
		return getAllExtendedStateMachines(stateMachine,
			new UniqueEList.FastCompare<StateMachine>());
	}

	protected static EList<Region> getAllRegions(StateMachine stateMachine) {
		EList<Region> allRegions = new UniqueEList.FastCompare<Region>(
			stateMachine.getRegions());

		for (StateMachine extendedStateMachine : getAllExtendedStateMachines(
			stateMachine)) {
			allRegions.addAll(extendedStateMachine.getRegions());
		}

		return RedefinableElementOperations
			.excludeRedefinedElements(allRegions);
	}

} // StateMachineOperations
