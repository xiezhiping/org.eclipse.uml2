/*
 * Copyright (c) 2003, 2006 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *
 * $Id: TemplateSignature.java,v 1.12 2006/04/10 20:40:20 khussey Exp $
 */
package org.eclipse.uml2;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Template Signature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A TemplateSignature is owned by a TemplateableElement and has one or more TemplateParameters that define the signature for binding this template. A TemplateSignature may reference a set of nested template signatures to reflect the hierarchical nature of a template. 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2.TemplateSignature#getParameters <em>Parameter</em>}</li>
 *   <li>{@link org.eclipse.uml2.TemplateSignature#getOwnedParameters <em>Owned Parameter</em>}</li>
 *   <li>{@link org.eclipse.uml2.TemplateSignature#getNestedSignatures <em>Nested Signature</em>}</li>
 *   <li>{@link org.eclipse.uml2.TemplateSignature#getNestingSignature <em>Nesting Signature</em>}</li>
 *   <li>{@link org.eclipse.uml2.TemplateSignature#getTemplate <em>Template</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.uml2.UML2Package#getTemplateSignature()
 * @model
 * @generated
 */
public interface TemplateSignature extends Element {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) IBM Corporation and others."; //$NON-NLS-1$

	/**
	 * Returns the value of the '<em><b>Parameter</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.TemplateParameter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameter</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The complete set of formal template parameters for this template signature.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Parameter</em>' reference list.
	 * @see org.eclipse.uml2.UML2Package#getTemplateSignature_Parameter()
	 * @model type="org.eclipse.uml2.TemplateParameter" required="true" ordered="false"
	 * @generated
	 */
	EList getParameters();


	/**
	 * Returns the value of the '<em><b>Owned Parameter</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2.TemplateParameter}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.uml2.TemplateParameter#getSignature <em>Signature</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Parameter</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The formal template parameters that are owned by this template signature. Subsets parameter and Element::ownedElement.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned Parameter</em>' containment reference list.
	 * @see org.eclipse.uml2.UML2Package#getTemplateSignature_OwnedParameter()
	 * @see org.eclipse.uml2.TemplateParameter#getSignature
	 * @model type="org.eclipse.uml2.TemplateParameter" opposite="signature" containment="true" resolveProxies="false" ordered="false"
	 * @generated
	 */
	EList getOwnedParameters();


	/**
	 * Creates a {@link org.eclipse.uml2.TemplateParameter} and appends it to the '<em><b>Owned Parameter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param eClass The Ecore class of the {@link org.eclipse.uml2.TemplateParameter} to create.
	 * @return The new {@link org.eclipse.uml2.TemplateParameter}.
	 * @see #getOwnedParameters()
	 * @generated NOT
	 */
    TemplateParameter createOwnedParameter(EClass eClass);

	/**
	 * Creates a {@link org.eclipse.uml2.TemplateParameter} and appends it to the '<em><b>Owned Parameter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return The new {@link org.eclipse.uml2.TemplateParameter}.
	 * @see #getOwnedParameters()
	 * @generated NOT
	 */
    TemplateParameter createOwnedParameter();

	/**
	 * Returns the value of the '<em><b>Nested Signature</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.TemplateSignature}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.uml2.TemplateSignature#getNestingSignature <em>Nesting Signature</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nested Signature</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nested Signature</em>' reference list.
	 * @see org.eclipse.uml2.UML2Package#getTemplateSignature_NestedSignature()
	 * @see org.eclipse.uml2.TemplateSignature#getNestingSignature
	 * @model type="org.eclipse.uml2.TemplateSignature" opposite="nestingSignature" ordered="false"
	 * @generated
	 */
	EList getNestedSignatures();


	/**
	 * Returns the value of the '<em><b>Nesting Signature</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.uml2.TemplateSignature#getNestedSignatures <em>Nested Signature</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nesting Signature</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nesting Signature</em>' reference.
	 * @see #setNestingSignature(TemplateSignature)
	 * @see org.eclipse.uml2.UML2Package#getTemplateSignature_NestingSignature()
	 * @see org.eclipse.uml2.TemplateSignature#getNestedSignatures
	 * @model opposite="nestedSignature"
	 * @generated
	 */
	TemplateSignature getNestingSignature();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.TemplateSignature#getNestingSignature <em>Nesting Signature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nesting Signature</em>' reference.
	 * @see #getNestingSignature()
	 * @generated
	 */
	void setNestingSignature(TemplateSignature value);


	/**
	 * Returns the value of the '<em><b>Template</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.uml2.TemplateableElement#getOwnedTemplateSignature <em>Owned Template Signature</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Template</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * element that owns this template signature. Subsets Element::owner.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Template</em>' container reference.
	 * @see #setTemplate(TemplateableElement)
	 * @see org.eclipse.uml2.UML2Package#getTemplateSignature_Template()
	 * @see org.eclipse.uml2.TemplateableElement#getOwnedTemplateSignature
	 * @model opposite="ownedTemplateSignature" resolveProxies="false" required="true"
	 * @generated
	 */
	TemplateableElement getTemplate();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.TemplateSignature#getTemplate <em>Template</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Template</em>' container reference.
	 * @see #getTemplate()
	 * @generated
	 */
	void setTemplate(TemplateableElement value);



} // TemplateSignature
