/*
 * Copyright (c) 2005, 2007 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *
 * $Id: RedefinableTemplateSignature.java,v 1.11 2007/10/23 15:54:21 jbruck Exp $
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
 * A redefinable template signature supports the addition of formal template parameters in a specialization of a template classifier.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.RedefinableTemplateSignature#getExtendedSignatures <em>Extended Signature</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.RedefinableTemplateSignature#getInheritedParameters <em>Inherited Parameter</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.RedefinableTemplateSignature#getClassifier <em>Classifier</em>}</li>
 * </ul>
 * </p>
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
	 * <ul>
	 *   <li>'{@link org.eclipse.uml2.uml.RedefinableElement#getRedefinedElements() <em>Redefined Element</em>}'</li>
	 * </ul>
	 * </p>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The template signature that is extended by this template signature.
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
	 * <ul>
	 *   <li>'{@link org.eclipse.uml2.uml.TemplateSignature#getParameters() <em>Parameter</em>}'</li>
	 * </ul>
	 * </p>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The formal template parameters of the extendedSignature.
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
	 * <ul>
	 *   <li>'{@link org.eclipse.uml2.uml.RedefinableElement#getRedefinitionContexts() <em>Redefinition Context</em>}'</li>
	 * </ul>
	 * </p>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The classifier that owns this template signature.
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
	 * The inherited parameters are the parameters of the extended template signature.
	 * if extendedSignature->isEmpty() then Set{} else extendedSignature.parameter endif
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validateInheritedParameters(DiagnosticChain diagnostics,
			Map<Object, Object> context);

} // RedefinableTemplateSignature
