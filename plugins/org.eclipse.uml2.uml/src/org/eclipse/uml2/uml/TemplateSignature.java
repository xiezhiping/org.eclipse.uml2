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
 * $Id: TemplateSignature.java,v 1.4 2006/01/24 20:23:44 khussey Exp $
 */
package org.eclipse.uml2.uml;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Template Signature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * TemplateParameterSubstitution associates one or more actual parameters with a formal template parameter within the context of a TemplateBinding.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.TemplateSignature#getParameters <em>Parameter</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.TemplateSignature#getOwnedParameters <em>Owned Parameter</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.TemplateSignature#getTemplate <em>Template</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.uml2.uml.UMLPackage#getTemplateSignature()
 * @model
 * @generated
 */
public interface TemplateSignature
		extends Element {

	/**
	 * Returns the value of the '<em><b>Parameter</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.TemplateParameter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The ordered set of all formal template parameters for this template signature.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Parameter</em>' reference list.
	 * @see org.eclipse.uml2.uml.UMLPackage#getTemplateSignature_Parameter()
	 * @model type="org.eclipse.uml2.uml.TemplateParameter" required="true"
	 * @generated
	 */
	EList getParameters();

	/**
	 * Returns the value of the '<em><b>Template</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.uml2.uml.TemplateableElement#getOwnedTemplateSignature <em>Owned Template Signature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The element that owns this template signature.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Template</em>' container reference.
	 * @see #setTemplate(TemplateableElement)
	 * @see org.eclipse.uml2.uml.UMLPackage#getTemplateSignature_Template()
	 * @see org.eclipse.uml2.uml.TemplateableElement#getOwnedTemplateSignature
	 * @model opposite="ownedTemplateSignature" resolveProxies="false" required="true" ordered="false"
	 * @generated
	 */
	TemplateableElement getTemplate();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.uml.TemplateSignature#getTemplate <em>Template</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Template</em>' container reference.
	 * @see #getTemplate()
	 * @generated
	 */
	void setTemplate(TemplateableElement value);

	/**
	 * Returns the value of the '<em><b>Owned Parameter</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.TemplateParameter}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.uml2.uml.TemplateParameter#getSignature <em>Signature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The formal template parameters that are owned by this template signature.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned Parameter</em>' containment reference list.
	 * @see org.eclipse.uml2.uml.UMLPackage#getTemplateSignature_OwnedParameter()
	 * @see org.eclipse.uml2.uml.TemplateParameter#getSignature
	 * @model type="org.eclipse.uml2.uml.TemplateParameter" opposite="signature" containment="true" resolveProxies="false"
	 * @generated
	 */
	EList getOwnedParameters();

	/**
	 * Creates a {@link org.eclipse.uml2.uml.TemplateParameter} and appends it to the '<em><b>Owned Parameter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param eClass The Ecore class of the {@link org.eclipse.uml2.uml.TemplateParameter} to create.
	 * @return The new {@link org.eclipse.uml2.uml.TemplateParameter}.
	 * @see #getOwnedParameters()
	 * @generated
	 */
	TemplateParameter createOwnedParameter(EClass eClass);

	/**
	 * Creates a {@link org.eclipse.uml2.uml.TemplateParameter} and appends it to the '<em><b>Owned Parameter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return The new {@link org.eclipse.uml2.uml.TemplateParameter}.
	 * @see #getOwnedParameters()
	 * @generated
	 */
	TemplateParameter createOwnedParameter();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Parameters must own the elements they parameter or those elements must be owned by the element being templated.
	 * templatedElement.ownedElement->includesAll(parameter.parameteredElement - parameter.ownedParameteredElement)
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validateOwnElements(DiagnosticChain diagnostics, Map context);

} // TemplateSignature
