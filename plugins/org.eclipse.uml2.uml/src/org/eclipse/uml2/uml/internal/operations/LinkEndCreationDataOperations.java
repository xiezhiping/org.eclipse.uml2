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
import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.common.util.UniqueEList;

import org.eclipse.emf.common.util.EList;
import org.eclipse.uml2.uml.InputPin;
import org.eclipse.uml2.uml.LinkEndCreationData;

import org.eclipse.uml2.uml.util.UMLValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Link End Creation Data</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.LinkEndCreationData#validateInsertAtPin(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Insert At Pin</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.LinkEndCreationData#allPins() <em>All Pins</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LinkEndCreationDataOperations
		extends LinkEndDataOperations {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LinkEndCreationDataOperations() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * LinkEndCreationData for ordered Association ends must have a single insertAt InputPin for the insertion point with type UnlimitedNatural and multiplicity of 1..1, if isReplaceAll=false, and must have no InputPin for the insertion point when the association ends are unordered.
	 * if  not end.isOrdered
	 * then insertAt = null
	 * else
	 * 	not isReplaceAll=false implies
	 * 	insertAt <> null and insertAt->forAll(type=UnlimitedNatural and is(1,1))
	 * endif
	 * @param linkEndCreationData The receiving '<em><b>Link End Creation Data</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateInsertAtPin(
			LinkEndCreationData linkEndCreationData,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(Diagnostic.ERROR,
					UMLValidator.DIAGNOSTIC_SOURCE,
					UMLValidator.LINK_END_CREATION_DATA__INSERT_AT_PIN,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic", //$NON-NLS-1$
						new Object[]{"validateInsertAtPin", //$NON-NLS-1$
							org.eclipse.emf.ecore.util.EObjectValidator
								.getObjectLabel(linkEndCreationData, context)}),
					new Object[]{linkEndCreationData}));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Adds the insertAt InputPin (if any) to the set of all Pins.
	 * result = (self.LinkEndData::allPins()->including(insertAt))
	 * <p>From package UML::Actions.</p>
	 * @param linkEndCreationData The receiving '<em><b>Link End Creation Data</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static EList<InputPin> allPins(
			LinkEndCreationData linkEndCreationData) {
		EList<InputPin> allPins = new UniqueEList.FastCompare<InputPin>(
			LinkEndDataOperations.allPins(linkEndCreationData));

		InputPin insertAt = linkEndCreationData.getInsertAt();

		if (insertAt != null) {
			allPins.add(insertAt);
		}

		return ECollections.unmodifiableEList(allPins);
	}

} // LinkEndCreationDataOperations