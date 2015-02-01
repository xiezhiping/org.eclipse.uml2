/*
 * Copyright (c) 2005, 2015 IBM Corporation, CEA, and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *   Kenn Hussey (CEA) - 327039, 418466, 433204, 451350
 *
 */
package org.eclipse.uml2.uml.internal.operations;

import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.UniqueEList;
import org.eclipse.uml2.uml.ConnectableElement;
import org.eclipse.uml2.uml.Feature;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.StructuredClassifier;

import org.eclipse.uml2.uml.Type;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Structured Classifier</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.StructuredClassifier#createOwnedAttribute(java.lang.String, org.eclipse.uml2.uml.Type, int, int) <em>Create Owned Attribute</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.StructuredClassifier#getParts() <em>Get Parts</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.StructuredClassifier#allRoles() <em>All Roles</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StructuredClassifierOperations
		extends ClassifierOperations {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StructuredClassifierOperations() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Creates a property with the specified name, type, lower bound, and upper bound as an owned attribute of this structured classifier.
	 * @param structuredClassifier The receiving '<em><b>Structured Classifier</b></em>' model object.
	 * @param name The name for the new attribute, or null.
	 * @param type The type for the new attribute, or null.
	 * @param lower The lower bound for the new attribute.
	 * @param upper The upper bound for the new attribute.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static Property createOwnedAttribute(
			StructuredClassifier structuredClassifier, String name, Type type,
			int lower, int upper) {
		return TypeOperations.createOwnedAttribute(structuredClassifier, name,
			type, lower, upper);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Derivation for StructuredClassifier::/part
	 * result = (ownedAttribute->select(isComposite)->asSet())
	 * @param structuredClassifier The receiving '<em><b>Structured Classifier</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static EList<Property> getParts(
			StructuredClassifier structuredClassifier) {
		return structuredClassifier.getParts();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * All features of type ConnectableElement, equivalent to all direct and inherited roles.
	 * result = (allFeatures()->select(oclIsKindOf(ConnectableElement))->collect(oclAsType(ConnectableElement))->asSet())
	 * <p>From package UML::StructuredClassifiers.</p>
	 * @param structuredClassifier The receiving '<em><b>Structured Classifier</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static EList<ConnectableElement> allRoles(
			StructuredClassifier structuredClassifier) {
		EList<ConnectableElement> allRoles = new UniqueEList.FastCompare<ConnectableElement>();

		for (Feature feature : structuredClassifier.allFeatures()) {

			if (feature instanceof ConnectableElement) {
				allRoles.add((ConnectableElement) feature);
			}
		}

		return ECollections.unmodifiableEList(allRoles);
	}

} // StructuredClassifierOperations