/*
 * Copyright (c) 2005, 2016 IBM Corporation, CEA, and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *   Kenn Hussey (CEA) - 327039, 351774, 418466, 451350, 485756
 *
 */
package org.eclipse.uml2.uml.internal.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.uml2.uml.StructuralFeatureAction;

import org.eclipse.uml2.uml.util.UMLValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Structural Feature Action</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.StructuralFeatureAction#validateMultiplicity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Multiplicity</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.StructuralFeatureAction#validateObjectType(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Object Type</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.StructuralFeatureAction#validateVisibility(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Visibility</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.StructuralFeatureAction#validateNotStatic(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Not Static</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.StructuralFeatureAction#validateOneFeaturingClassifier(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate One Featuring Classifier</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StructuralFeatureActionOperations
		extends ActionOperations {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StructuralFeatureActionOperations() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The structuralFeature must not be static.
	 * not structuralFeature.isStatic
	 * @param structuralFeatureAction The receiving '<em><b>Structural Feature Action</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateNotStatic(
			StructuralFeatureAction structuralFeatureAction,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(Diagnostic.ERROR,
					UMLValidator.DIAGNOSTIC_SOURCE,
					UMLValidator.STRUCTURAL_FEATURE_ACTION__NOT_STATIC,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic", //$NON-NLS-1$
						new Object[]{"validateNotStatic", //$NON-NLS-1$
							org.eclipse.emf.ecore.util.EObjectValidator
								.getObjectLabel(structuralFeatureAction,
									context)}),
					new Object[]{structuralFeatureAction}));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The multiplicity of the object InputPin must be 1..1.
	 * object.is(1,1)
	 * @param structuralFeatureAction The receiving '<em><b>Structural Feature Action</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateMultiplicity(
			StructuralFeatureAction structuralFeatureAction,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(Diagnostic.ERROR,
					UMLValidator.DIAGNOSTIC_SOURCE,
					UMLValidator.STRUCTURAL_FEATURE_ACTION__MULTIPLICITY,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic", //$NON-NLS-1$
						new Object[]{"validateMultiplicity", //$NON-NLS-1$
							org.eclipse.emf.ecore.util.EObjectValidator
								.getObjectLabel(structuralFeatureAction,
									context)}),
					new Object[]{structuralFeatureAction}));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The structuralFeature must either be an owned or inherited feature of the type of the object InputPin, or it must be an owned end of a binary Association whose opposite end had as a type to which the type of the object InputPin conforms.
	 * object.type.oclAsType(Classifier).allFeatures()->includes(structuralFeature) or
	 * 	object.type.conformsTo(structuralFeature.oclAsType(Property).opposite.type)
	 * @param structuralFeatureAction The receiving '<em><b>Structural Feature Action</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateObjectType(
			StructuralFeatureAction structuralFeatureAction,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(Diagnostic.ERROR,
					UMLValidator.DIAGNOSTIC_SOURCE,
					UMLValidator.STRUCTURAL_FEATURE_ACTION__OBJECT_TYPE,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic", //$NON-NLS-1$
						new Object[]{"validateObjectType", //$NON-NLS-1$
							org.eclipse.emf.ecore.util.EObjectValidator
								.getObjectLabel(structuralFeatureAction,
									context)}),
					new Object[]{structuralFeatureAction}));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The visibility of the structuralFeature must allow access from the object performing the ReadStructuralFeatureAction.
	 * structuralFeature.visibility = VisibilityKind::public or
	 * _'context'.allFeatures()->includes(structuralFeature) or
	 * structuralFeature.visibility=VisibilityKind::protected and
	 * _'context'.conformsTo(structuralFeature.oclAsType(Property).opposite.type.oclAsType(Classifier))
	 * @param structuralFeatureAction The receiving '<em><b>Structural Feature Action</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateVisibility(
			StructuralFeatureAction structuralFeatureAction,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(Diagnostic.ERROR,
					UMLValidator.DIAGNOSTIC_SOURCE,
					UMLValidator.STRUCTURAL_FEATURE_ACTION__VISIBILITY,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic", //$NON-NLS-1$
						new Object[]{"validateVisibility", //$NON-NLS-1$
							org.eclipse.emf.ecore.util.EObjectValidator
								.getObjectLabel(structuralFeatureAction,
									context)}),
					new Object[]{structuralFeatureAction}));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The structuralFeature must have exactly one featuringClassifier.
	 * structuralFeature.featuringClassifier->size() = 1
	 * @param structuralFeatureAction The receiving '<em><b>Structural Feature Action</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateOneFeaturingClassifier(
			StructuralFeatureAction structuralFeatureAction,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(Diagnostic.ERROR,
					UMLValidator.DIAGNOSTIC_SOURCE,
					UMLValidator.STRUCTURAL_FEATURE_ACTION__ONE_FEATURING_CLASSIFIER,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic", //$NON-NLS-1$
						new Object[]{"validateOneFeaturingClassifier", //$NON-NLS-1$
							org.eclipse.emf.ecore.util.EObjectValidator
								.getObjectLabel(structuralFeatureAction,
									context)}),
					new Object[]{structuralFeatureAction}));
			}
			return false;
		}
		return true;
	}

} // StructuralFeatureActionOperations