/*
 * Copyright (c) 2011, 2013 CEA and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   CEA - initial API and implementation
 *   Kenn Hussey (CEA) - 375553, 397140, 403365
 *
 */
package org.eclipse.uml2.uml.internal.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.UniqueEList;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.uml2.common.util.UnionEObjectEList;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.Enumeration;
import org.eclipse.uml2.uml.EnumerationLiteral;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.UMLPlugin;

import org.eclipse.uml2.uml.util.UMLValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Enumeration Literal</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.EnumerationLiteral#validateClassifierEqualsOwningEnumeration(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Classifier Equals Owning Enumeration</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.EnumerationLiteral#getClassifiers() <em>Get Classifiers</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.EnumerationLiteral#getClassifier() <em>Get Classifier</em>}</li>
 * </ul>
 * </p>
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
	 * <!-- begin-model-doc -->
	 * classifier = enumeration
	 * @param enumerationLiteral The receiving '<em><b>Enumeration Literal</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static boolean validateClassifierEqualsOwningEnumeration(
			EnumerationLiteral enumerationLiteral, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		boolean result = true;

		if (enumerationLiteral.getClassifier() != enumerationLiteral
			.getEnumeration()) {

			result = false;

			if (diagnostics != null) {
				diagnostics
					.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						UMLValidator.DIAGNOSTIC_SOURCE,
						UMLValidator.ENUMERATION_LITERAL__CLASSIFIER_EQUALS_OWNING_ENUMERATION,
						UMLPlugin.INSTANCE
							.getString(
								"_UI_EnumerationLiteral_ClassifierEqualsOwningEnumeration_diagnostic", //$NON-NLS-1$
								getMessageSubstitutions(context,
									enumerationLiteral)),
						new Object[]{enumerationLiteral}));
			}
		}

		return result;
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
			classifiers.size(), classifiers.toArray()) {

			private static final long serialVersionUID = 1L;

			@Override
			public boolean add(Classifier object) {
				return false;
			}

			@Override
			public void clear() {
				// do nothing
			}

		};
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Missing derivation for EnumerationLiteral::/classifier : Enumeration
	 * true
	 * @param enumerationLiteral The receiving '<em><b>Enumeration Literal</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static Enumeration getClassifier(
			EnumerationLiteral enumerationLiteral) {
		return enumerationLiteral.getEnumeration();
	}

} // EnumerationLiteralOperations