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
 * $Id: DestructionEventOperations.java,v 1.2 2005/11/30 21:21:16 khussey Exp $
 */
package org.eclipse.uml2.uml.internal.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.uml2.uml.DestructionEvent;

import org.eclipse.uml2.uml.util.UMLValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Destruction Event</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.DestructionEvent#validateNoOccurrenceSpecificationsBelow(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate No Occurrence Specifications Below</em>}</li>
 * </ul>
 * </p>
 *
 * @generated not
 */
public final class DestructionEventOperations extends UMLOperations {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private DestructionEventOperations() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * No other OccurrenceSpecifications may appear below an OccurrenceSpecification which references a DestructionEvent on a given Lifeline in an InteractionOperand.
	 * true
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateNoOccurrenceSpecificationsBelow(
			DestructionEvent destructionEvent, DiagnosticChain diagnostics,
			Map context) {
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
						UMLValidator.DESTRUCTION_EVENT__NO_OCCURRENCE_SPECIFICATIONS_BELOW,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE
							.getString(
								"_UI_GenericInvariant_diagnostic", new Object[]{"validateNoOccurrenceSpecificationsBelow", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(destructionEvent, context)}), //$NON-NLS-1$ //$NON-NLS-2$
						new Object[]{destructionEvent}));
			}
			return false;
		}
		return true;
	}

} // DestructionEventOperations