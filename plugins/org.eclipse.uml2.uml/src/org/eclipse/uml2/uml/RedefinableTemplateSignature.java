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

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Redefinable Template Signature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A RedefinableTemplateSignature supports the addition of formal template parameters in a specialization of a template classifier.
 * <p>From package UML::Classification.</p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.RedefinableTemplateSignature#getExtendedSignatures <em>Extended Signature</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.RedefinableTemplateSignature#getInheritedParameters <em>Inherited Parameter</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.RedefinableTemplateSignature#getClassifier <em>Classifier</em>}</li>
 * </ul>
 *
 * @see org.eclipse.uml2.uml.UMLPackage#getRedefinableTemplateSignature()
 * @model
 * @generated
 */
public interface RedefinableTemplateSignature
		extends RedefinableElement, TemplateSignature {

	/**
	 * Returns the value of the '<em><b>Extended Signature</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.RedefinableTemplateSignature}.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.eclipse.uml2.uml.RedefinableElement#getRedefinedElements() <em>Redefined Element</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The signatures extended by this RedefinableTemplateSignature.
	 * <p>From package UML::Classification.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Extended Signature</em>' reference list.
	 * @see org.eclipse.uml2.uml.UMLPackage#getRedefinableTemplateSignature_ExtendedSignature()
	 * @model ordered="false"
	 * @generated
	 */
	EList<RedefinableTemplateSignature> getExtendedSignatures();

	/**
	 * Retrieves the first {@link org.eclipse.uml2.uml.RedefinableTemplateSignature} with the specified '<em><b>Name</b></em>' from the '<em><b>Extended Signature</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.RedefinableTemplateSignature} to retrieve, or <code>null</code>.
	 * @return The first {@link org.eclipse.uml2.uml.RedefinableTemplateSignature} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getExtendedSignatures()
	 * @generated
	 */
	RedefinableTemplateSignature getExtendedSignature(String name);

	/**
	 * Retrieves the first {@link org.eclipse.uml2.uml.RedefinableTemplateSignature} with the specified '<em><b>Name</b></em>' from the '<em><b>Extended Signature</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.RedefinableTemplateSignature} to retrieve, or <code>null</code>.
	 * @param ignoreCase Whether to ignore case in {@link java.lang.String} comparisons.
	 * @return The first {@link org.eclipse.uml2.uml.RedefinableTemplateSignature} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getExtendedSignatures()
	 * @generated
	 */
	RedefinableTemplateSignature getExtendedSignature(String name,
			boolean ignoreCase);

	/**
	 * Returns the value of the '<em><b>Inherited Parameter</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.TemplateParameter}.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.eclipse.uml2.uml.TemplateSignature#getParameters() <em>Parameter</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The formal template parameters of the extended signatures.
	 * <p>From package UML::Classification.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Inherited Parameter</em>' reference list.
	 * @see org.eclipse.uml2.uml.UMLPackage#getRedefinableTemplateSignature_InheritedParameter()
	 * @model transient="true" changeable="false" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	EList<TemplateParameter> getInheritedParameters();

	/**
	 * Returns the value of the '<em><b>Classifier</b></em>' reference.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.eclipse.uml2.uml.RedefinableElement#getRedefinitionContexts() <em>Redefinition Context</em>}'</li>
	 * </ul>
	 * <p>
	 * This feature redefines the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.eclipse.uml2.uml.TemplateSignature#getTemplate() <em>Template</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Classifier that owns this RedefinableTemplateSignature.
	 * <p>From package UML::Classification.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Classifier</em>' reference.
	 * @see org.eclipse.uml2.uml.UMLPackage#getRedefinableTemplateSignature_Classifier()
	 * @model required="true" transient="true" changeable="false" volatile="true" ordered="false"
	 * @generated
	 */
	Classifier getClassifier();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If any of the parent Classifiers are a template, then the extendedSignature must include the signature of that Classifier.
	 * classifier.allParents()->forAll(c | c.ownedTemplateSignature->notEmpty() implies self->closure(extendedSignature)->includes(c.ownedTemplateSignature))
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validateRedefinesParents(DiagnosticChain diagnostics,
			Map<Object, Object> context);

} // RedefinableTemplateSignature
