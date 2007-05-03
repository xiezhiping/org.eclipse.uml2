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
 * $Id: LinkEndDestructionDataOperations.java,v 1.4 2007/05/03 21:11:51 khussey Exp $
 */
package org.eclipse.uml2.uml.internal.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.uml2.uml.LinkEndDestructionData;

import org.eclipse.uml2.uml.util.UMLValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Link End Destruction Data</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.LinkEndDestructionData#validateDestroyLinkAction(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Destroy Link Action</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.LinkEndDestructionData#validateUnlimitedNaturalAndMultiplicity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unlimited Natural And Multiplicity</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LinkEndDestructionDataOperations
		extends LinkEndDataOperations {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LinkEndDestructionDataOperations() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * LinkEndDestructionData can only be end data for DestroyLinkAction or one of its specializations.
	 * true
	 * @param linkEndDestructionData The receiving '<em><b>Link End Destruction Data</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateDestroyLinkAction(
			LinkEndDestructionData linkEndDestructionData,
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
						UMLValidator.LINK_END_DESTRUCTION_DATA__DESTROY_LINK_ACTION,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE
							.getString(
								"_UI_GenericInvariant_diagnostic", new Object[]{"validateDestroyLinkAction", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(linkEndDestructionData, context)}), //$NON-NLS-1$ //$NON-NLS-2$
						new Object[]{linkEndDestructionData}));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * LinkEndDestructionData for ordered nonunique association ends must have a single destroyAt input pin if isDestroyDuplicates is false. It must be of type UnlimitedNatural and have a multiplicity of 1..1. Otherwise, the action has no input pin for the removal position.
	 * true
	 * @param linkEndDestructionData The receiving '<em><b>Link End Destruction Data</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateUnlimitedNaturalAndMultiplicity(
			LinkEndDestructionData linkEndDestructionData,
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
						UMLValidator.LINK_END_DESTRUCTION_DATA__UNLIMITED_NATURAL_AND_MULTIPLICITY,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE
							.getString(
								"_UI_GenericInvariant_diagnostic", new Object[]{"validateUnlimitedNaturalAndMultiplicity", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(linkEndDestructionData, context)}), //$NON-NLS-1$ //$NON-NLS-2$
						new Object[]{linkEndDestructionData}));
			}
			return false;
		}
		return true;
	}

} // LinkEndDestructionDataOperations