/*
 * Copyright (c) 2005 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *
 * $Id: RedefinableTemplateSignature.java,v 1.1 2005/11/14 22:25:59 khussey Exp $
 */
package org.eclipse.uml2.uml;

import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Redefinable Template Signature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * RedefinableTemplateSignature specializes both TemplateSignature and RedefinableElement in order to allow the addition of new formal template parameters in the context of a specializing template Classifier.
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The template signature that is extended by this template signature.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Extended Signature</em>' reference list.
	 * @see org.eclipse.uml2.uml.UMLPackage#getRedefinableTemplateSignature_ExtendedSignature()
	 * @model type="org.eclipse.uml2.uml.RedefinableTemplateSignature" ordered="false"
	 * @generated
	 */
	List getExtendedSignatures();

	/**
	 * Retrieves the {@link org.eclipse.uml2.uml.RedefinableTemplateSignature} with the specified '<em><b>Name</b></em>' from the '<em><b>Extended Signature</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.RedefinableTemplateSignature} to retrieve.
	 * @return The {@link org.eclipse.uml2.uml.RedefinableTemplateSignature} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getExtendedSignatures()
	 * @generated
	 */
	RedefinableTemplateSignature getExtendedSignature(String name);

	/**
	 * Returns the value of the '<em><b>Inherited Parameter</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.TemplateParameter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The formal template parameters of the extendedSignature.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Inherited Parameter</em>' reference list.
	 * @see org.eclipse.uml2.uml.UMLPackage#getRedefinableTemplateSignature_InheritedParameter()
	 * @model type="org.eclipse.uml2.uml.TemplateParameter" transient="true" changeable="false" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	List getInheritedParameters();

	/**
	 * Returns the value of the '<em><b>Classifier</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.uml2.uml.Classifier#getOwnedSignature <em>Owned Signature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The classifier that owns this template signature.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Classifier</em>' container reference.
	 * @see #setClassifier(Classifier)
	 * @see org.eclipse.uml2.uml.UMLPackage#getRedefinableTemplateSignature_Classifier()
	 * @see org.eclipse.uml2.uml.Classifier#getOwnedSignature
	 * @model opposite="ownedSignature" required="true" ordered="false"
	 * @generated
	 */
	Classifier getClassifier();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.uml.RedefinableTemplateSignature#getClassifier <em>Classifier</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Classifier</em>' container reference.
	 * @see #getClassifier()
	 * @generated
	 */
	void setClassifier(Classifier value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The inherited parameters are the parameters of the extended template signature.
	 * if extendedSignature->isEmpty() then Set{} else extendedSignature.parameter endif
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validateInheritedParameters(DiagnosticChain diagnostics, Map context);

} // RedefinableTemplateSignature
