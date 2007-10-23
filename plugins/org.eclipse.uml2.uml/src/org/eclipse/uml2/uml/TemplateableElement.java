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
 * $Id: TemplateableElement.java,v 1.11 2007/10/23 15:54:22 jbruck Exp $
 */
package org.eclipse.uml2.uml;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Templateable Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A templateable element is an element that can optionally be defined as a template and bound to other templates.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.TemplateableElement#getTemplateBindings <em>Template Binding</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.TemplateableElement#getOwnedTemplateSignature <em>Owned Template Signature</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.uml2.uml.UMLPackage#getTemplateableElement()
 * @model abstract="true"
 * @generated
 */
public interface TemplateableElement
		extends Element {

	/**
	 * Returns the value of the '<em><b>Template Binding</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.TemplateBinding}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.uml2.uml.TemplateBinding#getBoundElement <em>Bound Element</em>}'.
	 * <p>
	 * This feature subsets the following features:
	 * <ul>
	 *   <li>'{@link org.eclipse.uml2.uml.Element#getOwnedElements() <em>Owned Element</em>}'</li>
	 * </ul>
	 * </p>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The optional bindings from this element to templates.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Template Binding</em>' containment reference list.
	 * @see org.eclipse.uml2.uml.UMLPackage#getTemplateableElement_TemplateBinding()
	 * @see org.eclipse.uml2.uml.TemplateBinding#getBoundElement
	 * @model opposite="boundElement" containment="true" resolveProxies="true" ordered="false"
	 * @generated
	 */
	EList<TemplateBinding> getTemplateBindings();

	/**
	 * Creates a new {@link org.eclipse.uml2.uml.TemplateBinding}, with the specified '<em><b>Signature</b></em>', and appends it to the '<em><b>Template Binding</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param signature The '<em><b>Signature</b></em>' for the new {@link org.eclipse.uml2.uml.TemplateBinding}, or <code>null</code>.
	 * @return The new {@link org.eclipse.uml2.uml.TemplateBinding}.
	 * @see #getTemplateBindings()
	 * @generated
	 */
	TemplateBinding createTemplateBinding(TemplateSignature signature);

	/**
	 * Retrieves the first {@link org.eclipse.uml2.uml.TemplateBinding} with the specified '<em><b>Signature</b></em>' from the '<em><b>Template Binding</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param signature The '<em><b>Signature</b></em>' of the {@link org.eclipse.uml2.uml.TemplateBinding} to retrieve, or <code>null</code>.
	 * @return The first {@link org.eclipse.uml2.uml.TemplateBinding} with the specified '<em><b>Signature</b></em>', or <code>null</code>.
	 * @see #getTemplateBindings()
	 * @generated
	 */
	TemplateBinding getTemplateBinding(TemplateSignature signature);

	/**
	 * Retrieves the first {@link org.eclipse.uml2.uml.TemplateBinding} with the specified '<em><b>Signature</b></em>' from the '<em><b>Template Binding</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param signature The '<em><b>Signature</b></em>' of the {@link org.eclipse.uml2.uml.TemplateBinding} to retrieve, or <code>null</code>.
	 * @param createOnDemand Whether to create a {@link org.eclipse.uml2.uml.TemplateBinding} on demand if not found.
	 * @return The first {@link org.eclipse.uml2.uml.TemplateBinding} with the specified '<em><b>Signature</b></em>', or <code>null</code>.
	 * @see #getTemplateBindings()
	 * @generated
	 */
	TemplateBinding getTemplateBinding(TemplateSignature signature,
			boolean createOnDemand);

	/**
	 * Returns the value of the '<em><b>Owned Template Signature</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.uml2.uml.TemplateSignature#getTemplate <em>Template</em>}'.
	 * <p>
	 * This feature subsets the following features:
	 * <ul>
	 *   <li>'{@link org.eclipse.uml2.uml.Element#getOwnedElements() <em>Owned Element</em>}'</li>
	 * </ul>
	 * </p>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The optional template signature specifying the formal template parameters.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned Template Signature</em>' containment reference.
	 * @see #setOwnedTemplateSignature(TemplateSignature)
	 * @see org.eclipse.uml2.uml.UMLPackage#getTemplateableElement_OwnedTemplateSignature()
	 * @see org.eclipse.uml2.uml.TemplateSignature#getTemplate
	 * @model opposite="template" containment="true" resolveProxies="true" ordered="false"
	 * @generated
	 */
	TemplateSignature getOwnedTemplateSignature();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.uml.TemplateableElement#getOwnedTemplateSignature <em>Owned Template Signature</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owned Template Signature</em>' containment reference.
	 * @see #getOwnedTemplateSignature()
	 * @generated
	 */
	void setOwnedTemplateSignature(TemplateSignature value);

	/**
	 * Creates a new {@link org.eclipse.uml2.uml.TemplateSignature} and sets the '<em><b>Owned Template Signature</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param eClass The Ecore class of the {@link org.eclipse.uml2.uml.TemplateSignature} to create.
	 * @return The new {@link org.eclipse.uml2.uml.TemplateSignature}.
	 * @see #getOwnedTemplateSignature()
	 * @generated
	 */
	TemplateSignature createOwnedTemplateSignature(EClass eClass);

	/**
	 * Creates a new {@link org.eclipse.uml2.uml.TemplateSignature} and sets the '<em><b>Owned Template Signature</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return The new {@link org.eclipse.uml2.uml.TemplateSignature}.
	 * @see #getOwnedTemplateSignature()
	 * @generated
	 */
	TemplateSignature createOwnedTemplateSignature();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The query parameterableElements() returns the set of elements that may be used as the parametered elements for a template parameter of this templateable element. By default, this set includes all the owned elements. Subclasses may override this operation if they choose to restrict the set of parameterable elements.
	 * result = allOwnedElements->select(oclIsKindOf(ParameterableElement))
	 * <!-- end-model-doc -->
	 * @model ordered="false"
	 * @generated
	 */
	EList<ParameterableElement> parameterableElements();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The query isTemplate() returns whether this templateable element is actually a template.
	 * result = ownedTemplateSignature->notEmpty()
	 * <!-- end-model-doc -->
	 * @model kind="operation" dataType="org.eclipse.uml2.uml.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isTemplate();

} // TemplateableElement
