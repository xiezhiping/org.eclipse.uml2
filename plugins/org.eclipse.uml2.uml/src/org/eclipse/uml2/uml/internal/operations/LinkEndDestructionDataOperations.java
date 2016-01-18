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
import org.eclipse.uml2.uml.LinkEndDestructionData;

import org.eclipse.uml2.uml.util.UMLValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Link End Destruction Data</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.LinkEndDestructionData#validateDestroyAtPin(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Destroy At Pin</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.LinkEndDestructionData#allPins() <em>All Pins</em>}</li>
 * </ul>
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
	 * LinkEndDestructionData for ordered, nonunique Association ends must have a single destroyAt InputPin if isDestroyDuplicates is false, which must be of type UnlimitedNatural and have a multiplicity of 1..1. Otherwise, the action has no destroyAt input pin.
	 * if  not end.isOrdered or end.isUnique or isDestroyDuplicates
	 * then destroyAt = null
	 * else
	 * 	destroyAt <> null and 
	 * 	destroyAt->forAll(type=UnlimitedNatural and is(1,1))
	 * endif
	 * @param linkEndDestructionData The receiving '<em><b>Link End Destruction Data</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateDestroyAtPin(
			LinkEndDestructionData linkEndDestructionData,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(Diagnostic.ERROR,
					UMLValidator.DIAGNOSTIC_SOURCE,
					UMLValidator.LINK_END_DESTRUCTION_DATA__DESTROY_AT_PIN,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic", //$NON-NLS-1$
						new Object[]{"validateDestroyAtPin", //$NON-NLS-1$
							org.eclipse.emf.ecore.util.EObjectValidator
								.getObjectLabel(linkEndDestructionData,
									context)}),
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
	 * Adds the destroyAt InputPin (if any) to the set of all Pins.
	 * result = (self.LinkEndData::allPins()->including(destroyAt))
	 * <p>From package UML::Actions.</p>
	 * @param linkEndDestructionData The receiving '<em><b>Link End Destruction Data</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static EList<InputPin> allPins(
			LinkEndDestructionData linkEndDestructionData) {
		EList<InputPin> allPins = new UniqueEList.FastCompare<InputPin>(
			LinkEndDataOperations.allPins(linkEndDestructionData));

		InputPin destroyAt = linkEndDestructionData.getDestroyAt();

		if (destroyAt != null) {
			allPins.add(destroyAt);
		}

		return ECollections.unmodifiableEList(allPins);
	}

} // LinkEndDestructionDataOperations