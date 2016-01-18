/*
 * Copyright (c) 2005, 2016 IBM Corporation, CEA, and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *   Kenn Hussey (CEA) - 327039, 351774, 80307, 418466, 451350, 485756
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
import org.eclipse.uml2.uml.ProtocolStateMachine;
import org.eclipse.uml2.uml.Pseudostate;
import org.eclipse.uml2.uml.PseudostateKind;
import org.eclipse.uml2.uml.RedefinableElement;
import org.eclipse.uml2.uml.Region;
import org.eclipse.uml2.uml.State;
import org.eclipse.uml2.uml.StateMachine;
import org.eclipse.uml2.uml.Transition;
import org.eclipse.uml2.uml.UMLPlugin;
import org.eclipse.uml2.uml.Vertex;

import org.eclipse.uml2.uml.util.UMLValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Region</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.Region#isConsistentWith(org.eclipse.uml2.uml.RedefinableElement) <em>Is Consistent With</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Region#isRedefinitionContextValid(org.eclipse.uml2.uml.RedefinableElement) <em>Is Redefinition Context Valid</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Region#validateDeepHistoryVertex(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Deep History Vertex</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Region#validateShallowHistoryVertex(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Shallow History Vertex</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Region#validateOwned(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Owned</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Region#validateInitialVertex(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Initial Vertex</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Region#belongsToPSM() <em>Belongs To PSM</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Region#containingStateMachine() <em>Containing State Machine</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Region#redefinitionContext() <em>Redefinition Context</em>}</li>
 * </ul>
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
	 * A Region can have at most one initial Vertex.
	 * self.subvertex->select (oclIsKindOf(Pseudostate))->collect(oclAsType(Pseudostate))->
	 *   select(kind = PseudostateKind::initial)->size() <= 1
	 * @param region The receiving '<em><b>Region</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static boolean validateInitialVertex(Region region,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		int initialVertexCount = 0;

		for (Vertex subvertex : region.getSubvertices()) {

			if (subvertex instanceof Pseudostate && ((Pseudostate) subvertex)
				.getKind() == PseudostateKind.INITIAL_LITERAL) {

				initialVertexCount++;
			}
		}

		if (initialVertexCount > 1) {

			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(Diagnostic.WARNING,
					UMLValidator.DIAGNOSTIC_SOURCE,
					UMLValidator.REGION__INITIAL_VERTEX,
					UMLPlugin.INSTANCE.getString(
						"_UI_Region_InitialVertex_diagnostic", //$NON-NLS-1$
						getMessageSubstitutions(context, region)),
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
	 * A Region can have at most one deep history Vertex.
	 * self.subvertex->select (oclIsKindOf(Pseudostate))->collect(oclAsType(Pseudostate))->
	 *    select(kind = PseudostateKind::deepHistory)->size() <= 1
	 * @param region The receiving '<em><b>Region</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static boolean validateDeepHistoryVertex(Region region,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		int deepHistoryVertexCount = 0;

		for (Vertex subvertex : region.getSubvertices()) {

			if (subvertex instanceof Pseudostate && ((Pseudostate) subvertex)
				.getKind() == PseudostateKind.DEEP_HISTORY_LITERAL) {

				deepHistoryVertexCount++;
			}
		}

		if (deepHistoryVertexCount > 1) {

			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(Diagnostic.WARNING,
					UMLValidator.DIAGNOSTIC_SOURCE,
					UMLValidator.REGION__DEEP_HISTORY_VERTEX,
					UMLPlugin.INSTANCE.getString(
						"_UI_Region_DeepHistoryVertex_diagnostic", //$NON-NLS-1$
						getMessageSubstitutions(context, region)),
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
	 * A Region can have at most one shallow history Vertex.
	 * subvertex->select(oclIsKindOf(Pseudostate))->collect(oclAsType(Pseudostate))->
	 *   select(kind = PseudostateKind::shallowHistory)->size() <= 1
	 * @param region The receiving '<em><b>Region</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static boolean validateShallowHistoryVertex(Region region,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		int shallowHistoryVertexCount = 0;

		for (Vertex subvertex : region.getSubvertices()) {

			if (subvertex instanceof Pseudostate && ((Pseudostate) subvertex)
				.getKind() == PseudostateKind.SHALLOW_HISTORY_LITERAL) {

				shallowHistoryVertexCount++;
			}
		}

		if (shallowHistoryVertexCount > 1) {

			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(Diagnostic.WARNING,
					UMLValidator.DIAGNOSTIC_SOURCE,
					UMLValidator.REGION__SHALLOW_HISTORY_VERTEX,
					UMLPlugin.INSTANCE.getString(
						"_UI_Region_ShallowHistoryVertex_diagnostic", //$NON-NLS-1$
						getMessageSubstitutions(context, region)),
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
	 * (stateMachine <> null implies state = null) and (state <> null implies stateMachine = null)
	 * @param region The receiving '<em><b>Region</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static boolean validateOwned(Region region,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (region.getStateMachine() != null && region.getState() != null) {

			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(Diagnostic.WARNING,
					UMLValidator.DIAGNOSTIC_SOURCE, UMLValidator.REGION__OWNED,
					UMLPlugin.INSTANCE.getString("_UI_Region_Owned_diagnostic", //$NON-NLS-1$
						getMessageSubstitutions(context, region)),
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
	 * The redefinition context of a Region is the nearest containing StateMachine.
	 * result = (let sm : StateMachine = containingStateMachine() in
	 * if sm._'context' = null or sm.general->notEmpty() then
	 *   sm
	 * else
	 *   sm._'context'
	 * endif)
	 * <p>From package UML::StateMachines.</p>
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
	 * The operation containingStateMachine() returns the StateMachine in which this Region is defined.
	 * result = (if stateMachine = null 
	 * then
	 *   state.containingStateMachine()
	 * else
	 *   stateMachine
	 * endif)
	 * <p>From package UML::StateMachines.</p>
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
	 * The operation belongsToPSM () checks if the Region belongs to a ProtocolStateMachine.
	 * result = (if  stateMachine <> null 
	 * then
	 *   stateMachine.oclIsKindOf(ProtocolStateMachine)
	 * else 
	 *   state <> null  implies  state.container.belongsToPSM()
	 * endif )
	 * <p>From package UML::StateMachines.</p>
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
	 * The query isConsistentWith() specifies that a redefining Region is consistent with a redefined Region provided that the redefining Region is an extension of the Redefined region, i.e., its Vertices and Transitions conform to one of the following: (1) they are equal to corresponding elements of the redefined Region or, (2) they consistently redefine a State or Transition of the redefined region, or (3) they add new States or Transitions.
	 * redefiningElement.isRedefinitionContextValid(self)
	 * result = (-- the following is merely a default body; it is expected that the specific form of this constraint will be specified by profiles
	 * true)
	 * <p>From package UML::StateMachines.</p>
	 * @param region The receiving '<em><b>Region</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static boolean isConsistentWith(Region region,
			RedefinableElement redefiningElement) {

		if (redefiningElement != null
			&& redefiningElement.isRedefinitionContextValid(region)) {

			Region redefiningRegion = (Region) redefiningElement;
			EList<Vertex> allSubvertices = getAllSubvertices(region);

			for (Vertex redefiningSubvertex : redefiningRegion
				.getSubvertices()) {

				if (redefiningSubvertex instanceof State) {
					State redefinedState = ((State) redefiningSubvertex)
						.getRedefinedState();

					if (redefinedState != null
						&& !allSubvertices.contains(redefinedState)) {

						return false;
					}
				}
			}

			EList<Transition> allTransitions = getAllTransitions(region);

			for (Transition redefiningTransition : redefiningRegion
				.getTransitions()) {

				Transition redefinedTransition = redefiningTransition
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

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The query isRedefinitionContextValid() specifies whether the redefinition contexts of a Region are properly related to the redefinition contexts of the specified Region to allow this element to redefine the other. The containing StateMachine or State of a redefining Region must Redefine the containing StateMachine or State of the redefined Region.
	 * result = (if redefinedElement.oclIsKindOf(Region) then
	 *   let redefinedRegion : Region = redefinedElement.oclAsType(Region) in
	 *     if stateMachine->isEmpty() then
	 *     -- the Region is owned by a State
	 *       (state.redefinedState->notEmpty() and state.redefinedState.region->includes(redefinedRegion))
	 *     else -- the region is owned by a StateMachine
	 *       (stateMachine.extendedStateMachine->notEmpty() and
	 *         stateMachine.extendedStateMachine->exists(sm : StateMachine |
	 *           sm.region->includes(redefinedRegion)))
	 *     endif
	 * else
	 *   false
	 * endif)
	 * <p>From package UML::StateMachines.</p>
	 * @param region The receiving '<em><b>Region</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static boolean isRedefinitionContextValid(Region region,
			RedefinableElement redefinedElement) {

		if (redefinedElement instanceof Region) {
			StateMachine stateMachine = region.getStateMachine();

			if (stateMachine == null) {
				State state = region.getState();
				State redefinedState = state == null
					? null
					: state.getRedefinedState();

				return redefinedState != null
					&& redefinedState.getRegions().contains(redefinedElement);
			} else {

				for (StateMachine extendedStateMachine : stateMachine
					.getExtendedStateMachines()) {

					if (extendedStateMachine.getRegions()
						.contains(redefinedElement)) {

						return true;
					}
				}

				return false;
			}
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
