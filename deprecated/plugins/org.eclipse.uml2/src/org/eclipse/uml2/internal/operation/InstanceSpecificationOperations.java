/*
 * Copyright (c) 2004, 2005 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *
 * $Id: InstanceSpecificationOperations.java,v 1.6 2005/05/18 16:38:32 khussey Exp $
 */
package org.eclipse.uml2.internal.operation;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.uml2.Classifier;
import org.eclipse.uml2.InstanceSpecification;
import org.eclipse.uml2.Slot;
import org.eclipse.uml2.StructuralFeature;
import org.eclipse.uml2.UML2Plugin;

import org.eclipse.uml2.util.UML2Validator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Instance Specification</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2.InstanceSpecification#validateSlotsAreDefined(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Slots Are Defined</em>}</li>
 *   <li>{@link org.eclipse.uml2.InstanceSpecification#validateNoDuplicateSlots(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate No Duplicate Slots</em>}</li>
 * </ul>
 * </p>
 *
 * @generated not
 */
public final class InstanceSpecificationOperations extends UML2Operations {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) IBM Corporation and others."; //$NON-NLS-1$

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private InstanceSpecificationOperations() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * The defining feature of each slot is a structural feature (directly or
	 * inherited) of a classifier of the instance specification.
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An invariant constraint based on the following OCL expression:
	 * <code>
	 * slot->forAll(s |
	 *   classifier->exists(c | c.allFeatures()->includes(s.definingFeature))
	 * </code>
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static boolean validateSlotsAreDefined(InstanceSpecification instanceSpecification, DiagnosticChain diagnostics, Map context) {
		boolean result = true;

		slotsLoop: for (Iterator slots = instanceSpecification.getSlots()
			.iterator(); slots.hasNext();) {

			Slot slot = (Slot) slots.next();

			for (Iterator classifiers = instanceSpecification.getClassifiers()
				.iterator(); classifiers.hasNext();) {

				Classifier classifier = (Classifier) classifiers.next();

				if (classifier.allFeatures()
					.contains(slot.getDefiningFeature())) {

					continue slotsLoop;
				}
			}

			result = false;

			if (null == diagnostics) {
				return result;
			} else {
				diagnostics
					.add(new BasicDiagnostic(
							Diagnostic.WARNING,
							UML2Validator.DIAGNOSTIC_SOURCE,
							UML2Validator.INSTANCE_SPECIFICATION__SLOTS_ARE_DEFINED,
							UML2Plugin.INSTANCE
								.getString(
									"_UI_InstanceSpecification_SlotsAreDefined_diagnostic", //$NON-NLS-1$
									getMessageSubstitutions(context, slot,
										instanceSpecification)),
							new Object[] {instanceSpecification, slot}));
			}
		}

		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * One structural feature (including the same feature inherited from
	 * multiple classifiers) is the defining feature of at most one slot in an
	 * instance specification.
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An invariant constraint based on the following OCL expression:
	 * <code>
	 * classifier->forAll(c |
	 * 	(c.allFeatures()->forAll(f | slot->select(s | s.definingFeature = f)->size() <= 1)
	 * 	)
	 * </code>
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static boolean validateNoDuplicateSlots(InstanceSpecification instanceSpecification, DiagnosticChain diagnostics, Map context) {
		boolean result = true;

		Set definingFeatures = new HashSet();

		for (Iterator slots = instanceSpecification.getSlots().iterator(); slots
			.hasNext();) {

			StructuralFeature definingFeature = ((Slot) slots.next())
				.getDefiningFeature();

			if (definingFeatures.contains(definingFeature)) {
				result = false;

				if (null == diagnostics) {
					return result;
				} else {
					diagnostics
						.add(new BasicDiagnostic(
							Diagnostic.WARNING,
							UML2Validator.DIAGNOSTIC_SOURCE,
							UML2Validator.INSTANCE_SPECIFICATION__NO_DUPLICATE_SLOTS,
							UML2Plugin.INSTANCE
								.getString(
									"_UI_InstanceSpecification_NoDuplicateSlots_diagnostic", //$NON-NLS-1$
									getMessageSubstitutions(context,
										definingFeature, instanceSpecification)),
							new Object[]{instanceSpecification, definingFeature}));
				}
			} else {
				definingFeatures.add(definingFeature);
			}
		}

		return result;
	}
} // InstanceSpecificationOperations
