/*
 * Copyright (c) 2013, 2015 CEA and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Kenn Hussey (CEA) - initial API and implementation
 *   Kenn Hussey (CEA) - 451350
 *
 */
package org.eclipse.uml2.uml.internal.operations;

import org.eclipse.emf.common.util.EList;
import org.eclipse.uml2.uml.Lifeline;
import org.eclipse.uml2.uml.OccurrenceSpecification;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Occurrence Specification</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.OccurrenceSpecification#getCovered() <em>Get Covered</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.OccurrenceSpecification#setCovered(org.eclipse.uml2.uml.Lifeline) <em>Set Covered</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OccurrenceSpecificationOperations
		extends NamedElementOperations {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OccurrenceSpecificationOperations() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Returns the Lifeline on which the OccurrenceSpecification appears.
	 * @param occurrenceSpecification The receiving '<em><b>Occurrence Specification</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static Lifeline getCovered(
			OccurrenceSpecification occurrenceSpecification) {
		EList<Lifeline> covereds = occurrenceSpecification.getCovereds();
		return covereds.size() > 0
			? covereds.get(0)
			: null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Sets the Lifeline on which the OccurrenceSpecification appears.
	 * @param occurrenceSpecification The receiving '<em><b>Occurrence Specification</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static void setCovered(
			OccurrenceSpecification occurrenceSpecification, Lifeline value) {
		EList<Lifeline> covereds = occurrenceSpecification.getCovereds();

		if (value == null) {
			covereds.clear();
		} else {

			if (covereds.size() > 0) {
				covereds.set(0, value);
			} else {
				covereds.add(0, value);
			}
		}
	}

} // OccurrenceSpecificationOperations