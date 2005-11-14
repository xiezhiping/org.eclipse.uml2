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
 * $Id: RegionOperations.java,v 1.1 2005/11/14 22:25:54 khussey Exp $
 */
package org.eclipse.uml2.uml.internal.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.RedefinableElement;
import org.eclipse.uml2.uml.Region;
import org.eclipse.uml2.uml.StateMachine;

import org.eclipse.uml2.uml.util.UMLValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Region</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.Region#validateInitialVertex(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Initial Vertex</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Region#validateDeepHistoryVertex(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Deep History Vertex</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Region#validateShallowHistoryVertex(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Shallow History Vertex</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Region#validateOwned(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Owned</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Region#redefinitionContext() <em>Redefinition Context</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Region#containingStateMachine() <em>Containing State Machine</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Region#isRedefinitionContextValid() <em>Is Redefinition Context Valid</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Region#isConsistentWith(org.eclipse.uml2.uml.RedefinableElement) <em>Is Consistent With</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public final class RegionOperations {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private RegionOperations() {
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
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateInitialVertex(Region region,
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
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateDeepHistoryVertex(Region region,
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
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateShallowHistoryVertex(Region region,
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
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateOwned(Region region,
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
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static Classifier redefinitionContext(Region region) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
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
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static StateMachine containingStateMachine(Region region) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The query isRedefinitionContextValid() specifies whether the redefinition contexts of a region are properly related to the redefinition contexts of the specified region to allow this element to redefine the other. The containing statemachine/state of a redefining region must redefine the containing statemachine/state of the redefined region.
	 * result = true
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean isRedefinitionContextValid(Region region) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The query isConsistentWith() specifies that a redefining region is consistent with a redefined region provided that the redefining region is an extension of the redefined region, i.e. it adds vertices and transitions and it redefines states and transitions of the redefined region.
	 * result = true
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean isConsistentWith(Region region,
			RedefinableElement redefinee) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

} // RegionOperations