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
 * $Id: InformationItemOperations.java,v 1.7 2007/05/03 21:11:52 khussey Exp $
 */
package org.eclipse.uml2.uml.internal.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.uml2.uml.InformationItem;

import org.eclipse.uml2.uml.util.UMLValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Information Item</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.InformationItem#validateSourcesAndTargets(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Sources And Targets</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.InformationItem#validateHasNo(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Has No</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.InformationItem#validateNotInstantiable(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Not Instantiable</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InformationItemOperations
		extends ClassifierOperations {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InformationItemOperations() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The sources and targets of an information item (its related information flows) must designate subsets of the sources and targets of the representation information item, if any.The Classifiers that can realize an information item can only be of the following kind: Class, Interface, InformationItem, Signal, Component.
	 * (self.represented->select(p | p->oclIsKindOf(InformationItem))->forAll(p |
	 *   p.informationFlow.source->forAll(q | self.informationFlow.source->include(q)) and
	 *     p.informationFlow.target->forAll(q | self.informationFlow.target->include(q)))) and
	 *       (self.represented->forAll(p | p->oclIsKindOf(Class) or oclIsKindOf(Interface) or
	 *         oclIsKindOf(InformationItem) or oclIsKindOf(Signal) or oclIsKindOf(Component)))
	 * @param informationItem The receiving '<em><b>Information Item</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateSourcesAndTargets(
			InformationItem informationItem, DiagnosticChain diagnostics,
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
						UMLValidator.INFORMATION_ITEM__SOURCES_AND_TARGETS,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE
							.getString(
								"_UI_GenericInvariant_diagnostic", new Object[]{"validateSourcesAndTargets", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(informationItem, context)}), //$NON-NLS-1$ //$NON-NLS-2$
						new Object[]{informationItem}));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An informationItem has no feature, no generalization, and no associations.
	 * self.generalization->isEmpty() and self.feature->isEmpty()
	 * @param informationItem The receiving '<em><b>Information Item</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateHasNo(InformationItem informationItem,
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
						UMLValidator.INFORMATION_ITEM__HAS_NO,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE
							.getString(
								"_UI_GenericInvariant_diagnostic", new Object[]{"validateHasNo", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(informationItem, context)}), //$NON-NLS-1$ //$NON-NLS-2$
						new Object[]{informationItem}));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * It is not instantiable.
	 * isAbstract
	 * @param informationItem The receiving '<em><b>Information Item</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateNotInstantiable(
			InformationItem informationItem, DiagnosticChain diagnostics,
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
						UMLValidator.INFORMATION_ITEM__NOT_INSTANTIABLE,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE
							.getString(
								"_UI_GenericInvariant_diagnostic", new Object[]{"validateNotInstantiable", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(informationItem, context)}), //$NON-NLS-1$ //$NON-NLS-2$
						new Object[]{informationItem}));
			}
			return false;
		}
		return true;
	}

} // InformationItemOperations