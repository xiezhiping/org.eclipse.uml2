/*
 * Copyright (c) 2005, 2006 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *
 * $Id: BehavioredClassifierOperations.java,v 1.6 2006/01/05 22:43:25 khussey Exp $
 */
package org.eclipse.uml2.uml.internal.operations;

import java.util.Iterator;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.UniqueEList;

import org.eclipse.uml2.uml.BehavioredClassifier;

import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.Interface;
import org.eclipse.uml2.uml.InterfaceRealization;
import org.eclipse.uml2.uml.UMLPackage;

import org.eclipse.uml2.uml.util.UMLValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Behaviored Classifier</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.BehavioredClassifier#validateClassBehavior(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Class Behavior</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.BehavioredClassifier#createInterfaceRealization(org.eclipse.uml2.uml.Interface) <em>Create Interface Realization</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BehavioredClassifierOperations
		extends ClassifierOperations {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BehavioredClassifierOperations() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If a behavior is classifier behavior, it does not have a specification.
	 * self.classifierBehavior.notEmpty() implies self.specification.isEmpty()
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateClassBehavior(
			BehavioredClassifier behavioredClassifier,
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
						UMLValidator.BEHAVIORED_CLASSIFIER__CLASS_BEHAVIOR,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE
							.getString(
								"_UI_GenericInvariant_diagnostic", new Object[]{"validateClassBehavior", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(behavioredClassifier, context)}), //$NON-NLS-1$ //$NON-NLS-2$
						new Object[]{behavioredClassifier}));
			}
			return false;
		}
		return true;
	}

	protected static EList getRealizedInterfaces(
			BehavioredClassifier behavioredClassifier, EList realizedInterfaces) {

		for (Iterator interfaceRealizations = behavioredClassifier
			.getInterfaceRealizations().iterator(); interfaceRealizations
			.hasNext();) {

			Interface contract = (Interface) ((InterfaceRealization) interfaceRealizations
				.next()).eGet(
				UMLPackage.Literals.INTERFACE_REALIZATION__CONTRACT, false);

			if (contract != null) {
				realizedInterfaces.add(contract);
			}
		}
		return realizedInterfaces;
	}

	protected static EList getAllRealizedInterfaces(
			BehavioredClassifier behavioredClassifier,
			EList allRealizedInterfaces) {
		getRealizedInterfaces(behavioredClassifier, allRealizedInterfaces);

		for (Iterator allParents = behavioredClassifier.allParents().iterator(); allParents
			.hasNext();) {

			Classifier parent = (Classifier) allParents.next();

			if (parent instanceof BehavioredClassifier) {
				getRealizedInterfaces((BehavioredClassifier) parent,
					allRealizedInterfaces);
			}
		}

		return allRealizedInterfaces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public static InterfaceRealization createInterfaceRealization(
			BehavioredClassifier behavioredClassifier, Interface contract) {

		if (contract == null
			|| getAllRealizedInterfaces(behavioredClassifier, new UniqueEList())
				.contains(contract)) {

			throw new IllegalArgumentException(String.valueOf(contract));
		}

		InterfaceRealization interfaceRealization = behavioredClassifier
			.createInterfaceRealization();
		interfaceRealization.setContract(contract);

		return interfaceRealization;
	}

} // BehavioredClassifierOperations
