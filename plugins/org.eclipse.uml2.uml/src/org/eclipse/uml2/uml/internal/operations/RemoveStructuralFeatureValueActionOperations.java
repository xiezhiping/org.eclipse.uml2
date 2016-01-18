/*
 * Copyright (c) 2005, 2016 IBM Corporation, CEA, and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *   Kenn Hussey (CEA) - 327039, 418466, 451350, 485756
 *
 */
package org.eclipse.uml2.uml.internal.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.uml2.uml.RemoveStructuralFeatureValueAction;

import org.eclipse.uml2.uml.util.UMLValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Remove Structural Feature Value Action</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.RemoveStructuralFeatureValueAction#validateRemoveAtAndValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Remove At And Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RemoveStructuralFeatureValueActionOperations
		extends WriteStructuralFeatureActionOperations {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RemoveStructuralFeatureValueActionOperations() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * RemoveStructuralFeatureValueActions removing a value from ordered, non-unique StructuralFeatures must have a single removeAt InputPin and no value InputPin, if isRemoveDuplicates is false. The removeAt InputPin must be of type Unlimited Natural with multiplicity 1..1. Otherwise, the Action has a value InputPin and no removeAt InputPin.
	 * if structuralFeature.isOrdered and not structuralFeature.isUnique and  not isRemoveDuplicates then
	 *   value = null and
	 *   removeAt <> null and
	 *   removeAt.type = UnlimitedNatural and
	 *   removeAt.is(1,1)
	 * else
	 *   removeAt = null and value <> null
	 * endif
	 * @param removeStructuralFeatureValueAction The receiving '<em><b>Remove Structural Feature Value Action</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateRemoveAtAndValue(
			RemoveStructuralFeatureValueAction removeStructuralFeatureValueAction,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(Diagnostic.ERROR,
					UMLValidator.DIAGNOSTIC_SOURCE,
					UMLValidator.REMOVE_STRUCTURAL_FEATURE_VALUE_ACTION__REMOVE_AT_AND_VALUE,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic", //$NON-NLS-1$
						new Object[]{"validateRemoveAtAndValue", //$NON-NLS-1$
							org.eclipse.emf.ecore.util.EObjectValidator
								.getObjectLabel(
									removeStructuralFeatureValueAction,
									context)}),
					new Object[]{removeStructuralFeatureValueAction}));
			}
			return false;
		}
		return true;
	}

} // RemoveStructuralFeatureValueActionOperations