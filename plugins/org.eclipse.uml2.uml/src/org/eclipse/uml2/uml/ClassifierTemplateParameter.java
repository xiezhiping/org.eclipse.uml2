/*
 * Copyright (c) 2005, 2015 IBM Corporation, CEA, and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *   Kenn Hussey (CEA) - 327039, 418466, 451350
 *   Christian W. Damus (CEA) - 251963
 *
 */
package org.eclipse.uml2.uml;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Classifier Template Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A ClassifierTemplateParameter exposes a Classifier as a formal template parameter.
 * <p>From package UML::Classification.</p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.ClassifierTemplateParameter#isAllowSubstitutable <em>Allow Substitutable</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.ClassifierTemplateParameter#getConstrainingClassifiers <em>Constraining Classifier</em>}</li>
 * </ul>
 *
 * @see org.eclipse.uml2.uml.UMLPackage#getClassifierTemplateParameter()
 * @model
 * @generated
 */
public interface ClassifierTemplateParameter
		extends TemplateParameter {

	/**
	 * Returns the value of the '<em><b>Allow Substitutable</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Constrains the required relationship between an actual parameter and the parameteredElement for this formal parameter.
	 * <p>From package UML::Classification.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Allow Substitutable</em>' attribute.
	 * @see #setAllowSubstitutable(boolean)
	 * @see org.eclipse.uml2.uml.UMLPackage#getClassifierTemplateParameter_AllowSubstitutable()
	 * @model default="true" dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isAllowSubstitutable();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.uml.ClassifierTemplateParameter#isAllowSubstitutable <em>Allow Substitutable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Allow Substitutable</em>' attribute.
	 * @see #isAllowSubstitutable()
	 * @generated
	 */
	void setAllowSubstitutable(boolean value);

	/**
	 * Returns the value of the '<em><b>Constraining Classifier</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.Classifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The classifiers that constrain the argument that can be used for the parameter. If the allowSubstitutable attribute is true, then any Classifier that is compatible with this constraining Classifier can be substituted; otherwise, it must be either this Classifier or one of its specializations. If this property is empty, there are no constraints on the Classifier that can be used as an argument.
	 * <p>From package UML::Classification.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Constraining Classifier</em>' reference list.
	 * @see org.eclipse.uml2.uml.UMLPackage#getClassifierTemplateParameter_ConstrainingClassifier()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Classifier> getConstrainingClassifiers();

	/**
	 * Retrieves the first {@link org.eclipse.uml2.uml.Classifier} with the specified '<em><b>Name</b></em>' from the '<em><b>Constraining Classifier</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.Classifier} to retrieve, or <code>null</code>.
	 * @return The first {@link org.eclipse.uml2.uml.Classifier} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getConstrainingClassifiers()
	 * @generated
	 */
	Classifier getConstrainingClassifier(String name);

	/**
	 * Retrieves the first {@link org.eclipse.uml2.uml.Classifier} with the specified '<em><b>Name</b></em>' from the '<em><b>Constraining Classifier</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.Classifier} to retrieve, or <code>null</code>.
	 * @param ignoreCase Whether to ignore case in {@link java.lang.String} comparisons.
	 * @param eClass The Ecore class of the {@link org.eclipse.uml2.uml.Classifier} to retrieve, or <code>null</code>.
	 * @return The first {@link org.eclipse.uml2.uml.Classifier} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getConstrainingClassifiers()
	 * @generated
	 */
	Classifier getConstrainingClassifier(String name, boolean ignoreCase,
			EClass eClass);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If allowSubstitutable is true, then there must be a constrainingClassifier.
	 * allowSubstitutable implies constrainingClassifier->notEmpty()
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validateHasConstrainingClassifier(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The parameteredElement has no direct features, and if constrainedElement is empty it has no generalizations.
	 * parameteredElement.feature->isEmpty() and (constrainingClassifier->isEmpty() implies  parameteredElement.allParents()->isEmpty())
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validateParameteredElementNoFeatures(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If the parameteredElement is not abstract, then the Classifier used as an argument shall not be abstract.
	 * (not parameteredElement.isAbstract) implies templateParameterSubstitution.actual->forAll(a | not a.oclAsType(Classifier).isAbstract)
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validateMatchingAbstract(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The argument to a ClassifierTemplateParameter is a Classifier.
	 *  templateParameterSubstitution.actual->forAll(a | a.oclIsKindOf(Classifier))
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validateActualIsClassifier(DiagnosticChain diagnostics,
			Map<Object, Object> context);

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
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validateConstrainingClassifiersConstrainArgs(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If there are any constrainingClassifiers, then the parameteredElement must be the same as or a specialization of them, or if allowSubstitutable is true, then it can also be substitutable.
	 * constrainingClassifier->forAll(
	 *      cc |  parameteredElement = cc or parameteredElement.conformsTo(cc) or (allowSubstitutable and parameteredElement.isSubstitutableFor(cc))
	 * )
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validateConstrainingClassifiersConstrainParameteredElement(
			DiagnosticChain diagnostics, Map<Object, Object> context);

} // ClassifierTemplateParameter
