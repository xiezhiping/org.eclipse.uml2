/*
 * Copyright (c) 2005, 2007 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *
 * $Id: LifelineOperations.java,v 1.6 2007/05/03 21:11:52 khussey Exp $
 */
package org.eclipse.uml2.uml.internal.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.uml2.uml.Lifeline;

import org.eclipse.uml2.uml.util.UMLValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Lifeline</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.Lifeline#validateInteractionUsesShareLifeline(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Interaction Uses Share Lifeline</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Lifeline#validateSelectorSpecified(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Selector Specified</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Lifeline#validateSameClassifier(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Same Classifier</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LifelineOperations
		extends NamedElementOperations {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LifelineOperations() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If two (or more) InteractionUses within one Interaction, refer to Interactions with 'common Lifelines,' those Lifelines must also appear in the Interaction with the InteractionUses. By common Lifelines we mean Lifelines with the same selector and represents associations.
	 * true
	 * @param lifeline The receiving '<em><b>Lifeline</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateInteractionUsesShareLifeline(
			Lifeline lifeline, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
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
						UMLValidator.LIFELINE__INTERACTION_USES_SHARE_LIFELINE,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE
							.getString(
								"_UI_GenericInvariant_diagnostic", new Object[]{"validateInteractionUsesShareLifeline", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(lifeline, context)}), //$NON-NLS-1$ //$NON-NLS-2$
						new Object[]{lifeline}));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The selector for a Lifeline must only be specified if the referenced Part is multivalued.
	 * (self.selector->isEmpty() implies not self.represents.isMultivalued()) or
	 * (not self.selector->isEmpty() implies self.represents.isMultivalued())
	 * 
	 * @param lifeline The receiving '<em><b>Lifeline</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateSelectorSpecified(Lifeline lifeline,
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
						UMLValidator.LIFELINE__SELECTOR_SPECIFIED,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE
							.getString(
								"_UI_GenericInvariant_diagnostic", new Object[]{"validateSelectorSpecified", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(lifeline, context)}), //$NON-NLS-1$ //$NON-NLS-2$
						new Object[]{lifeline}));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The classifier containing the referenced ConnectableElement must be the same classifier, or an ancestor, of the classifier that contains the interaction enclosing this lifeline.
	 * if (represents->notEmpty()) then
	 * (if selector->notEmpty() then represents.isMultivalued() else not represents.isMultivalued())
	 * 
	 * @param lifeline The receiving '<em><b>Lifeline</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateSameClassifier(Lifeline lifeline,
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
						UMLValidator.LIFELINE__SAME_CLASSIFIER,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE
							.getString(
								"_UI_GenericInvariant_diagnostic", new Object[]{"validateSameClassifier", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(lifeline, context)}), //$NON-NLS-1$ //$NON-NLS-2$
						new Object[]{lifeline}));
			}
			return false;
		}
		return true;
	}

} // LifelineOperations