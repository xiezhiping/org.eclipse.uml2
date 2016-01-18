/*
 * Copyright (c) 2005, 2016 IBM Corporation, CEA, and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *   Kenn Hussey (CEA) - 418466, 451350, 485756
 *
 */
package org.eclipse.uml2.uml.internal.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.uml2.uml.ClassifierTemplateParameter;

import org.eclipse.uml2.uml.util.UMLValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Classifier Template Parameter</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.ClassifierTemplateParameter#validateHasConstrainingClassifier(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Has Constraining Classifier</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.ClassifierTemplateParameter#validateParameteredElementNoFeatures(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Parametered Element No Features</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.ClassifierTemplateParameter#validateMatchingAbstract(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Matching Abstract</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.ClassifierTemplateParameter#validateActualIsClassifier(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Actual Is Classifier</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.ClassifierTemplateParameter#validateConstrainingClassifiersConstrainArgs(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Constraining Classifiers Constrain Args</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.ClassifierTemplateParameter#validateConstrainingClassifiersConstrainParameteredElement(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Constraining Classifiers Constrain Parametered Element</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ClassifierTemplateParameterOperations
		extends TemplateParameterOperations {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClassifierTemplateParameterOperations() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If allowSubstitutable is true, then there must be a constrainingClassifier.
	 * allowSubstitutable implies constrainingClassifier->notEmpty()
	 * @param classifierTemplateParameter The receiving '<em><b>Classifier Template Parameter</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateHasConstrainingClassifier(
			ClassifierTemplateParameter classifierTemplateParameter,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(Diagnostic.ERROR,
					UMLValidator.DIAGNOSTIC_SOURCE,
					UMLValidator.CLASSIFIER_TEMPLATE_PARAMETER__HAS_CONSTRAINING_CLASSIFIER,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic", //$NON-NLS-1$
						new Object[]{"validateHasConstrainingClassifier", //$NON-NLS-1$
							org.eclipse.emf.ecore.util.EObjectValidator
								.getObjectLabel(classifierTemplateParameter,
									context)}),
					new Object[]{classifierTemplateParameter}));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The parameteredElement has no direct features, and if constrainedElement is empty it has no generalizations.
	 * parameteredElement.feature->isEmpty() and (constrainingClassifier->isEmpty() implies  parameteredElement.allParents()->isEmpty())
	 * @param classifierTemplateParameter The receiving '<em><b>Classifier Template Parameter</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateParameteredElementNoFeatures(
			ClassifierTemplateParameter classifierTemplateParameter,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(Diagnostic.ERROR,
					UMLValidator.DIAGNOSTIC_SOURCE,
					UMLValidator.CLASSIFIER_TEMPLATE_PARAMETER__PARAMETERED_ELEMENT_NO_FEATURES,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic", //$NON-NLS-1$
						new Object[]{"validateParameteredElementNoFeatures", //$NON-NLS-1$
							org.eclipse.emf.ecore.util.EObjectValidator
								.getObjectLabel(classifierTemplateParameter,
									context)}),
					new Object[]{classifierTemplateParameter}));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If the parameteredElement is not abstract, then the Classifier used as an argument shall not be abstract.
	 * (not parameteredElement.isAbstract) implies templateParameterSubstitution.actual->forAll(a | not a.oclAsType(Classifier).isAbstract)
	 * @param classifierTemplateParameter The receiving '<em><b>Classifier Template Parameter</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateMatchingAbstract(
			ClassifierTemplateParameter classifierTemplateParameter,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(Diagnostic.ERROR,
					UMLValidator.DIAGNOSTIC_SOURCE,
					UMLValidator.CLASSIFIER_TEMPLATE_PARAMETER__MATCHING_ABSTRACT,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic", //$NON-NLS-1$
						new Object[]{"validateMatchingAbstract", //$NON-NLS-1$
							org.eclipse.emf.ecore.util.EObjectValidator
								.getObjectLabel(classifierTemplateParameter,
									context)}),
					new Object[]{classifierTemplateParameter}));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The argument to a ClassifierTemplateParameter is a Classifier.
	 *  templateParameterSubstitution.actual->forAll(a | a.oclIsKindOf(Classifier))
	 * @param classifierTemplateParameter The receiving '<em><b>Classifier Template Parameter</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateActualIsClassifier(
			ClassifierTemplateParameter classifierTemplateParameter,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(Diagnostic.ERROR,
					UMLValidator.DIAGNOSTIC_SOURCE,
					UMLValidator.CLASSIFIER_TEMPLATE_PARAMETER__ACTUAL_IS_CLASSIFIER,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic", //$NON-NLS-1$
						new Object[]{"validateActualIsClassifier", //$NON-NLS-1$
							org.eclipse.emf.ecore.util.EObjectValidator
								.getObjectLabel(classifierTemplateParameter,
									context)}),
					new Object[]{classifierTemplateParameter}));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If there are any constrainingClassifiers, then every argument must be the same as or a specialization of them, or if allowSubstitutable is true, then it can also be substitutable.
	 * templateParameterSubstitution.actual->forAll( a |
	 *   let arg : Classifier = a.oclAsType(Classifier) in
	 *     constrainingClassifier->forAll(
	 *       cc |  
	 *          arg = cc or arg.conformsTo(cc) or (allowSubstitutable and arg.isSubstitutableFor(cc))
	 *       )
	 * )
	 * @param classifierTemplateParameter The receiving '<em><b>Classifier Template Parameter</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateConstrainingClassifiersConstrainArgs(
			ClassifierTemplateParameter classifierTemplateParameter,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(Diagnostic.ERROR,
					UMLValidator.DIAGNOSTIC_SOURCE,
					UMLValidator.CLASSIFIER_TEMPLATE_PARAMETER__CONSTRAINING_CLASSIFIERS_CONSTRAIN_ARGS,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic", //$NON-NLS-1$
						new Object[]{
							"validateConstrainingClassifiersConstrainArgs", //$NON-NLS-1$
							org.eclipse.emf.ecore.util.EObjectValidator
								.getObjectLabel(classifierTemplateParameter,
									context)}),
					new Object[]{classifierTemplateParameter}));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If there are any constrainingClassifiers, then the parameteredElement must be the same as or a specialization of them, or if allowSubstitutable is true, then it can also be substitutable.
	 * constrainingClassifier->forAll(
	 *      cc |  parameteredElement = cc or parameteredElement.conformsTo(cc) or (allowSubstitutable and parameteredElement.isSubstitutableFor(cc))
	 * )
	 * @param classifierTemplateParameter The receiving '<em><b>Classifier Template Parameter</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateConstrainingClassifiersConstrainParameteredElement(
			ClassifierTemplateParameter classifierTemplateParameter,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(Diagnostic.ERROR,
					UMLValidator.DIAGNOSTIC_SOURCE,
					UMLValidator.CLASSIFIER_TEMPLATE_PARAMETER__CONSTRAINING_CLASSIFIERS_CONSTRAIN_PARAMETERED_ELEMENT,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic", //$NON-NLS-1$
						new Object[]{
							"validateConstrainingClassifiersConstrainParameteredElement", //$NON-NLS-1$
							org.eclipse.emf.ecore.util.EObjectValidator
								.getObjectLabel(classifierTemplateParameter,
									context)}),
					new Object[]{classifierTemplateParameter}));
			}
			return false;
		}
		return true;
	}

} // ClassifierTemplateParameterOperations