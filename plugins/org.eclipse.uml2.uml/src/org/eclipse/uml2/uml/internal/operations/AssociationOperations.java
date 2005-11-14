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
 * $Id: AssociationOperations.java,v 1.1 2005/11/14 22:25:55 khussey Exp $
 */
package org.eclipse.uml2.uml.internal.operations;

import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.uml2.uml.Association;

import org.eclipse.uml2.uml.util.UMLValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Association</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.Association#validateSpecializedEndNumber(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Specialized End Number</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Association#validateSpecializedEndTypes(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Specialized End Types</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Association#validateBinaryAssociations(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Binary Associations</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Association#validateAssociationEnds(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Association Ends</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Association#endType() <em>End Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public final class AssociationOperations {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private AssociationOperations() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An association specializing another association has the same number of ends as the other association.
	 * self.parents()->forAll(p | p.memberEnd.size() = self.memberEnd.size())
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateSpecializedEndNumber(Association association,
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
						UMLValidator.ASSOCIATION__SPECIALIZED_END_NUMBER,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE
							.getString(
								"_UI_GenericInvariant_diagnostic", new Object[]{"validateSpecializedEndNumber", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(association, context)}), //$NON-NLS-1$ //$NON-NLS-2$
						new Object[]{association}));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * When an association specializes another association, every end of the specific association corresponds to an end of the general association, and the specific end reaches the same type or a subtype of the more general end.
	 * true
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateSpecializedEndTypes(Association association,
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
						UMLValidator.ASSOCIATION__SPECIALIZED_END_TYPES,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE
							.getString(
								"_UI_GenericInvariant_diagnostic", new Object[]{"validateSpecializedEndTypes", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(association, context)}), //$NON-NLS-1$ //$NON-NLS-2$
						new Object[]{association}));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Only binary associations can be aggregations.
	 * self.memberEnd->exists(aggregation <> Aggregation::none) implies self.memberEnd->size() = 2
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateBinaryAssociations(Association association,
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
						UMLValidator.ASSOCIATION__BINARY_ASSOCIATIONS,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE
							.getString(
								"_UI_GenericInvariant_diagnostic", new Object[]{"validateBinaryAssociations", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(association, context)}), //$NON-NLS-1$ //$NON-NLS-2$
						new Object[]{association}));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Association ends of associations with more than two ends must be owned by the association.
	 * if memberEnd->size() > 2 then ownedEnd->includesAll(memberEnd)
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateAssociationEnds(Association association,
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
						UMLValidator.ASSOCIATION__ASSOCIATION_ENDS,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE
							.getString(
								"_UI_GenericInvariant_diagnostic", new Object[]{"validateAssociationEnds", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(association, context)}), //$NON-NLS-1$ //$NON-NLS-2$
						new Object[]{association}));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * endType is derived from the types of the member ends.
	 * result = self.memberEnd->collect(e | e.type)
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static List endType(Association association) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

} // AssociationOperations