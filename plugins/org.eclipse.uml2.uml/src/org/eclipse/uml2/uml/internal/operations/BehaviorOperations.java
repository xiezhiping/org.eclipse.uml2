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
 * $Id: BehaviorOperations.java,v 1.4 2005/11/30 21:21:16 khussey Exp $
 */
package org.eclipse.uml2.uml.internal.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.uml2.uml.Behavior;
import org.eclipse.uml2.uml.Element;

import org.eclipse.uml2.uml.BehavioredClassifier;

import org.eclipse.uml2.uml.util.UMLValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Behavior</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.Behavior#validateParametersMatch(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Parameters Match</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Behavior#validateFeatureOfContextClassifier(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Feature Of Context Classifier</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Behavior#validateMustRealize(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Must Realize</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Behavior#validateMostOneBehaviour(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Most One Behaviour</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Behavior#getContext() <em>Get Context</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Behavior#setContext(org.eclipse.uml2.uml.BehavioredClassifier) <em>Set Context</em>}</li>
 * </ul>
 * </p>
 *
 * @generated not
 */
public final class BehaviorOperations extends UMLOperations {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private BehaviorOperations() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The parameters of the behavior must match the parameters of the implemented behavioral feature.
	 * true
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateParametersMatch(Behavior behavior,
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
						UMLValidator.BEHAVIOR__PARAMETERS_MATCH,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE
							.getString(
								"_UI_GenericInvariant_diagnostic", new Object[]{"validateParametersMatch", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(behavior, context)}), //$NON-NLS-1$ //$NON-NLS-2$
						new Object[]{behavior}));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The implemented behavioral feature must be a feature (possibly inherited) of the context classifier of the behavior.
	 * true
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateFeatureOfContextClassifier(Behavior behavior,
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
						UMLValidator.BEHAVIOR__FEATURE_OF_CONTEXT_CLASSIFIER,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE
							.getString(
								"_UI_GenericInvariant_diagnostic", new Object[]{"validateFeatureOfContextClassifier", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(behavior, context)}), //$NON-NLS-1$ //$NON-NLS-2$
						new Object[]{behavior}));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If the implemented behavioral feature has been redefined in the ancestors of the owner of the behavior, then the behavior must realize the latest redefining behavioral feature.
	 * true
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateMustRealize(Behavior behavior,
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
						UMLValidator.BEHAVIOR__MUST_REALIZE,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE
							.getString(
								"_UI_GenericInvariant_diagnostic", new Object[]{"validateMustRealize", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(behavior, context)}), //$NON-NLS-1$ //$NON-NLS-2$
						new Object[]{behavior}));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * There may be at most one behavior for a given pairing of classifier (as owner of the behavior) and behavioral feature (as specification of the behavior).
	 * true
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateMostOneBehaviour(Behavior behavior,
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
						UMLValidator.BEHAVIOR__MOST_ONE_BEHAVIOUR,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE
							.getString(
								"_UI_GenericInvariant_diagnostic", new Object[]{"validateMostOneBehaviour", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(behavior, context)}), //$NON-NLS-1$ //$NON-NLS-2$
						new Object[]{behavior}));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public static BehavioredClassifier getContext(Behavior behavior) {
		Element owner = behavior.getOwner();

		while (owner != null && !(owner instanceof BehavioredClassifier)) {
			owner = owner.getOwner();
		}

		return (BehavioredClassifier) owner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Object setContext(Behavior behavior,
			BehavioredClassifier newContext) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

} // BehaviorOperations