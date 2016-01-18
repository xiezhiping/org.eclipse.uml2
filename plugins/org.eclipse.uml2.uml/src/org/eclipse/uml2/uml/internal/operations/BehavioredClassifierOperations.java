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
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.UniqueEList;

import org.eclipse.uml2.uml.BehavioredClassifier;

import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.Interface;
import org.eclipse.uml2.uml.InterfaceRealization;

import org.eclipse.uml2.uml.util.UMLValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Behaviored Classifier</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.BehavioredClassifier#validateClassBehavior(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Class Behavior</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.BehavioredClassifier#getAllImplementedInterfaces() <em>Get All Implemented Interfaces</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.BehavioredClassifier#getImplementedInterfaces() <em>Get Implemented Interfaces</em>}</li>
 * </ul>
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
	 * classifierBehavior->notEmpty() implies classifierBehavior.specification->isEmpty()
	 * @param behavioredClassifier The receiving '<em><b>Behaviored Classifier</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateClassBehavior(
			BehavioredClassifier behavioredClassifier,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(Diagnostic.ERROR,
					UMLValidator.DIAGNOSTIC_SOURCE,
					UMLValidator.BEHAVIORED_CLASSIFIER__CLASS_BEHAVIOR,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic", //$NON-NLS-1$
						new Object[]{"validateClassBehavior", //$NON-NLS-1$
							org.eclipse.emf.ecore.util.EObjectValidator
								.getObjectLabel(behavioredClassifier,
									context)}),
					new Object[]{behavioredClassifier}));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Retrieves the interfaces on which this behaviored classifier has an interface realization dependency.
	 * @param behavioredClassifier The receiving '<em><b>Behaviored Classifier</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static EList<Interface> getImplementedInterfaces(
			BehavioredClassifier behavioredClassifier) {
		return getImplementedInterfaces(behavioredClassifier,
			new UniqueEList.FastCompare<Interface>());
	}

	protected static EList<Interface> getImplementedInterfaces(
			BehavioredClassifier behavioredClassifier,
			EList<Interface> implementedInterfaces) {

		for (InterfaceRealization interfaceRealization : behavioredClassifier
			.getInterfaceRealizations()) {

			Interface contract = interfaceRealization.getContract();

			if (contract != null) {
				implementedInterfaces.add(contract);
			}
		}

		return implementedInterfaces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Retrieves all the interfaces on which this behaviored classifier or any of its parents has an interface realization dependency.
	 * @param behavioredClassifier The receiving '<em><b>Behaviored Classifier</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static EList<Interface> getAllImplementedInterfaces(
			BehavioredClassifier behavioredClassifier) {
		return getAllImplementedInterfaces(behavioredClassifier,
			new UniqueEList.FastCompare<Interface>());
	}

	protected static EList<Interface> getAllImplementedInterfaces(
			BehavioredClassifier behavioredClassifier,
			EList<Interface> allImplementedInterfaces) {
		getImplementedInterfaces(behavioredClassifier,
			allImplementedInterfaces);

		for (Classifier parent : behavioredClassifier.allParents()) {

			if (parent instanceof BehavioredClassifier) {
				getImplementedInterfaces((BehavioredClassifier) parent,
					allImplementedInterfaces);
			}
		}

		for (int i = 0, size = allImplementedInterfaces.size(); i < size; i++) {

			for (Classifier parent : allImplementedInterfaces.get(i)
				.allParents()) {

				if (parent instanceof Interface) {
					allImplementedInterfaces.add((Interface) parent);
				}
			}
		}

		return allImplementedInterfaces;
	}

} // BehavioredClassifierOperations
