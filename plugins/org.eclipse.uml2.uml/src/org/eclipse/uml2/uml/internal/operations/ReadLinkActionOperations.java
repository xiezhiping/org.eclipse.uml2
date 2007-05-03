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
 * $Id: ReadLinkActionOperations.java,v 1.6 2007/05/03 21:11:51 khussey Exp $
 */
package org.eclipse.uml2.uml.internal.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.uml2.uml.ReadLinkAction;

import org.eclipse.uml2.uml.util.UMLValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Read Link Action</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.ReadLinkAction#validateOneOpenEnd(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate One Open End</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.ReadLinkAction#validateTypeAndOrdering(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Type And Ordering</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.ReadLinkAction#validateCompatibleMultiplicity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Compatible Multiplicity</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.ReadLinkAction#validateNavigableOpenEnd(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Navigable Open End</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.ReadLinkAction#validateVisibility(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Visibility</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ReadLinkActionOperations
		extends LinkActionOperations {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReadLinkActionOperations() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Exactly one link-end data specification (the 'open' end) must not have an end object input pin.
	 * self.endData->select(ed | ed.value->size() = 0)->size() = 1
	 * @param readLinkAction The receiving '<em><b>Read Link Action</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateOneOpenEnd(ReadLinkAction readLinkAction,
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
						UMLValidator.READ_LINK_ACTION__ONE_OPEN_END,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE
							.getString(
								"_UI_GenericInvariant_diagnostic", new Object[]{"validateOneOpenEnd", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(readLinkAction, context)}), //$NON-NLS-1$ //$NON-NLS-2$
						new Object[]{readLinkAction}));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The type and ordering of the result output pin are same as the type and ordering of the open association end.
	 * let openend : AssociationEnd = self.endData->select(ed | ed.value->size() = 0)->asSequence()->first().end in
	 * self.result.type = openend.type
	 * and self.result.ordering = openend.ordering
	 * 
	 * @param readLinkAction The receiving '<em><b>Read Link Action</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateTypeAndOrdering(
			ReadLinkAction readLinkAction, DiagnosticChain diagnostics,
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
						UMLValidator.READ_LINK_ACTION__TYPE_AND_ORDERING,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE
							.getString(
								"_UI_GenericInvariant_diagnostic", new Object[]{"validateTypeAndOrdering", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(readLinkAction, context)}), //$NON-NLS-1$ //$NON-NLS-2$
						new Object[]{readLinkAction}));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The multiplicity of the open association end must be compatible with the multiplicity of the result output pin.
	 * let openend : AssociationEnd = self.endData->select(ed | ed.value->size() = 0)->asSequence()->first().end in
	 * openend.multiplicity.compatibleWith(self.result.multiplicity)
	 * 
	 * @param readLinkAction The receiving '<em><b>Read Link Action</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateCompatibleMultiplicity(
			ReadLinkAction readLinkAction, DiagnosticChain diagnostics,
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
						UMLValidator.READ_LINK_ACTION__COMPATIBLE_MULTIPLICITY,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE
							.getString(
								"_UI_GenericInvariant_diagnostic", new Object[]{"validateCompatibleMultiplicity", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(readLinkAction, context)}), //$NON-NLS-1$ //$NON-NLS-2$
						new Object[]{readLinkAction}));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The open end must be navigable.
	 * let openend : AssociationEnd = self.endData->select(ed | ed.value->size() = 0)->asSequence()->first().end in
	 * openend.isNavigable()
	 * 
	 * @param readLinkAction The receiving '<em><b>Read Link Action</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateNavigableOpenEnd(
			ReadLinkAction readLinkAction, DiagnosticChain diagnostics,
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
						UMLValidator.READ_LINK_ACTION__NAVIGABLE_OPEN_END,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE
							.getString(
								"_UI_GenericInvariant_diagnostic", new Object[]{"validateNavigableOpenEnd", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(readLinkAction, context)}), //$NON-NLS-1$ //$NON-NLS-2$
						new Object[]{readLinkAction}));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Visibility of the open end must allow access to the object performing the action.
	 * let host : Classifier = self.context in
	 * let openend : AssociationEnd = self.endData->select(ed | ed.value->size() = 0)->asSequence()->first().end in
	 * openend.visibility = #public
	 * or self.endData->exists(oed | not oed.end = openend
	 * and (host = oed.end.participant
	 * or (openend.visibility = #protected
	 * and host.allSupertypes->includes(oed.end.participant))))
	 * 
	 * @param readLinkAction The receiving '<em><b>Read Link Action</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateVisibility(ReadLinkAction readLinkAction,
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
						UMLValidator.READ_LINK_ACTION__VISIBILITY,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE
							.getString(
								"_UI_GenericInvariant_diagnostic", new Object[]{"validateVisibility", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(readLinkAction, context)}), //$NON-NLS-1$ //$NON-NLS-2$
						new Object[]{readLinkAction}));
			}
			return false;
		}
		return true;
	}

} // ReadLinkActionOperations