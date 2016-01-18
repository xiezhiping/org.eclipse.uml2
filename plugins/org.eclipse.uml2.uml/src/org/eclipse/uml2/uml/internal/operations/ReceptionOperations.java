/*
 * Copyright (c) 2005, 2016 IBM Corporation, CEA, and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *   Kenn Hussey (CEA) - 418466, 451350, 485756
 *
 */
package org.eclipse.uml2.uml.internal.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.uml2.uml.Reception;

import org.eclipse.uml2.uml.util.UMLValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Reception</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.Reception#validateSameNameAsSignal(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Same Name As Signal</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Reception#validateSameStructureAsSignal(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Same Structure As Signal</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ReceptionOperations
		extends BehavioralFeatureOperations {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReceptionOperations() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A Reception has the same name as its signal
	 * name = signal.name
	 * @param reception The receiving '<em><b>Reception</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateSameNameAsSignal(Reception reception,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(Diagnostic.ERROR,
					UMLValidator.DIAGNOSTIC_SOURCE,
					UMLValidator.RECEPTION__SAME_NAME_AS_SIGNAL,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic", //$NON-NLS-1$
						new Object[]{"validateSameNameAsSignal", //$NON-NLS-1$
							org.eclipse.emf.ecore.util.EObjectValidator
								.getObjectLabel(reception, context)}),
					new Object[]{reception}));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A Reception's parameters match the ownedAttributes of its signal by name, type, and multiplicity
	 * signal.ownedAttribute->size() = ownedParameter->size() and
	 * Sequence{1..signal.ownedAttribute->size()}->forAll( i | 
	 *     ownedParameter->at(i).direction = ParameterDirectionKind::_'in' and 
	 *     ownedParameter->at(i).name = signal.ownedAttribute->at(i).name and
	 *     ownedParameter->at(i).type = signal.ownedAttribute->at(i).type and
	 *     ownedParameter->at(i).lowerBound() = signal.ownedAttribute->at(i).lowerBound() and
	 *     ownedParameter->at(i).upperBound() = signal.ownedAttribute->at(i).upperBound()
	 * )
	 * @param reception The receiving '<em><b>Reception</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateSameStructureAsSignal(Reception reception,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(Diagnostic.ERROR,
					UMLValidator.DIAGNOSTIC_SOURCE,
					UMLValidator.RECEPTION__SAME_STRUCTURE_AS_SIGNAL,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic", //$NON-NLS-1$
						new Object[]{"validateSameStructureAsSignal", //$NON-NLS-1$
							org.eclipse.emf.ecore.util.EObjectValidator
								.getObjectLabel(reception, context)}),
					new Object[]{reception}));
			}
			return false;
		}
		return true;
	}

} // ReceptionOperations