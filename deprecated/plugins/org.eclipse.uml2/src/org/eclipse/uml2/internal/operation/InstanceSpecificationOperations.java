/*
 * Copyright (c) 2004 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Common Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/cpl-v10.html
 *
 * Contributors:
 *   IBM - Initial API and implementation
 *
 * $Id: InstanceSpecificationOperations.java,v 1.3 2004/04/29 01:38:36 khussey Exp $
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
import org.eclipse.uml2.UML2DiagnosticConstants;
import org.eclipse.uml2.UML2Plugin;


/**
 * A static utility class that provides operations related to instance
 * specifications.
 */
public final class InstanceSpecificationOperations
	extends UML2Operations {

	/**
	 * Constructs a new Instance Specification Operations. This constructor
	 * should never be called because this is a static utility class.
	 */
	private InstanceSpecificationOperations() {
		super();
	}

	/**
	 * The defining feature of each slot is a structural feature (directly or
	 * inherited) of a classifier of the instance specification.
	 *  
	 */
	public static boolean validateSlotsAreDefined(
			InstanceSpecification instanceSpecification,
			DiagnosticChain diagnostics, Map context) {
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
							UML2DiagnosticConstants.PLUGIN_ID,
							UML2DiagnosticConstants.INSTANCE_SPECIFICATION__SLOTS_ARE_DEFINED,
							UML2Plugin.INSTANCE
								.getString(
									"_UI_InstanceSpecification_SlotsAreDefined_diagnostic", //$NON-NLS-1$
									getMessageSubstitutions(context, slot,
										instanceSpecification)),
							new Object[] {slot}));
			}
		}

		return result;
	}

	/**
	 * One structural feature (including the same feature inherited from
	 * multiple classifiers) is the defining feature of at most one slot in an
	 * instance specification.
	 *  
	 */
	public static boolean validateNoDuplicateSlots(
			InstanceSpecification instanceSpecification,
			DiagnosticChain diagnostics, Map context) {
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
								UML2DiagnosticConstants.PLUGIN_ID,
								UML2DiagnosticConstants.INSTANCE_SPECIFICATION__NO_DUPLICATE_SLOTS,
								UML2Plugin.INSTANCE
									.getString(
										"_UI_InstanceSpecification_NoDuplicateSlots_diagnostic", //$NON-NLS-1$
										getMessageSubstitutions(context,
											definingFeature,
											instanceSpecification)),
								new Object[] {definingFeature}));
				}
			} else {
				definingFeatures.add(definingFeature);
			}
		}

		return result;
	}

}