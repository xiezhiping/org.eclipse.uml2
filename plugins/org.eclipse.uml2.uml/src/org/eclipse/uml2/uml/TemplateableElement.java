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

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Templateable Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A TemplateableElement is an Element that can optionally be defined as a template and bound to other templates.
 * <p>From package UML::CommonStructure.</p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.TemplateableElement#getTemplateBindings <em>Template Binding</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.TemplateableElement#getOwnedTemplateSignature <em>Owned Template Signature</em>}</li>
 * </ul>
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
	 * </p>
	 * <ul>
	 *   <li>'{@link org.eclipse.uml2.uml.Element#getOwnedElements() <em>Owned Element</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The optional TemplateBindings from this TemplateableElement to one or more templates.
	 * <p>From package UML::CommonStructure.</p>
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
	 * </p>
	 * <ul>
	 *   <li>'{@link org.eclipse.uml2.uml.Element#getOwnedElements() <em>Owned Element</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The optional TemplateSignature specifying the formal TemplateParameters for this TemplateableElement. If a TemplateableElement has a TemplateSignature, then it is a template.
	 * <p>From package UML::CommonStructure.</p>
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
	 * The query parameterableElements() returns the set of ParameterableElements that may be used as the parameteredElements for a TemplateParameter of this TemplateableElement. By default, this set includes all the ownedElements. Subclasses may override this operation if they choose to restrict the set of ParameterableElements.
	 * result = (self.allOwnedElements()->select(oclIsKindOf(ParameterableElement)).oclAsType(ParameterableElement)->asSet())
	 * <p>From package UML::CommonStructure.</p>
	 * <!-- end-model-doc -->
	 * @model ordered="false"
	 * @generated
	 */
	EList<ParameterableElement> parameterableElements();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The query isTemplate() returns whether this TemplateableElement is actually a template.
	 * result = (ownedTemplateSignature <> null)
	 * <p>From package UML::CommonStructure.</p>
	 * <!-- end-model-doc -->
	 * @model kind="operation" dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isTemplate();

} // TemplateableElement
