/*
 * Copyright (c) 2011, 2015 CEA and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Kenn Hussey (CEA) - initial API and implementation
 *   Kenn Hussey (CEA) - 375553, 397140, 403365, 212765, 418466, 451350
 *
 */
package org.eclipse.uml2.uml.internal.operations;

import org.eclipse.emf.common.util.UniqueEList;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.uml2.common.util.UnionEObjectEList;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.Enumeration;
import org.eclipse.uml2.uml.EnumerationLiteral;
import org.eclipse.uml2.uml.UMLPackage;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Enumeration Literal</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.EnumerationLiteral#getClassifiers() <em>Get Classifiers</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.EnumerationLiteral#getClassifier() <em>Get Classifier</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EnumerationLiteralOperations
		extends InstanceSpecificationOperations {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EnumerationLiteralOperations() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public static EList<Classifier> getClassifiers(
			EnumerationLiteral enumerationLiteral) {
		EList<Classifier> classifiers = new UniqueEList.FastCompare<Classifier>();

		Classifier classifier = enumerationLiteral.getClassifier();

		if (classifier != null) {
			classifiers.add(classifier);
		}

		return new UnionEObjectEList<Classifier>(
			(InternalEObject) enumerationLiteral,
			UMLPackage.Literals.INSTANCE_SPECIFICATION__CLASSIFIER,
			classifiers.size(), classifiers.toArray());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Derivation of Enumeration::/classifier
	 * result = (enumeration)
	 * <p>From package UML::SimpleClassifiers.</p>
	 * @param enumerationLiteral The receiving '<em><b>Enumeration Literal</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static Enumeration getClassifier(
			EnumerationLiteral enumerationLiteral) {
		return enumerationLiteral.getEnumeration();
	}

} // EnumerationLiteralOperations