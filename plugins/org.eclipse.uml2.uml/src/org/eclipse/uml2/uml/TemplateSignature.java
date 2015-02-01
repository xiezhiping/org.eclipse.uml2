/*
 * Copyright (c) 2005, 2015 IBM Corporation, CEA, and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *   Kenn Hussey (CEA) - 327039, 351774, 418466, 451350
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
 * A representation of the model object '<em><b>Template Signature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A Template Signature bundles the set of formal TemplateParameters for a template.
 * <p>From package UML::CommonStructure.</p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.TemplateSignature#getParameters <em>Parameter</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.TemplateSignature#getTemplate <em>Template</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.TemplateSignature#getOwnedParameters <em>Owned Parameter</em>}</li>
 * </ul>
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
	 * The ordered set of all formal TemplateParameters for this TemplateSignature.
	 * <p>From package UML::CommonStructure.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Parameter</em>' reference list.
	 * @see org.eclipse.uml2.uml.UMLPackage#getTemplateSignature_Parameter()
	 * @model required="true"
	 * @generated
	 */
	EList<TemplateParameter> getParameters();

	/**
	 * Returns the value of the '<em><b>Template</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.uml2.uml.TemplateableElement#getOwnedTemplateSignature <em>Owned Template Signature</em>}'.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.eclipse.uml2.uml.Element#getOwner() <em>Owner</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The TemplateableElement that owns this TemplateSignature.
	 * <p>From package UML::CommonStructure.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Template</em>' container reference.
	 * @see #setTemplate(TemplateableElement)
	 * @see org.eclipse.uml2.uml.UMLPackage#getTemplateSignature_Template()
	 * @see org.eclipse.uml2.uml.TemplateableElement#getOwnedTemplateSignature
	 * @model opposite="ownedTemplateSignature" required="true" transient="false" ordered="false"
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
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.eclipse.uml2.uml.Element#getOwnedElements() <em>Owned Element</em>}'</li>
	 *   <li>'{@link org.eclipse.uml2.uml.TemplateSignature#getParameters() <em>Parameter</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The formal parameters that are owned by this TemplateSignature.
	 * <p>From package UML::CommonStructure.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned Parameter</em>' containment reference list.
	 * @see org.eclipse.uml2.uml.UMLPackage#getTemplateSignature_OwnedParameter()
	 * @see org.eclipse.uml2.uml.TemplateParameter#getSignature
	 * @model opposite="signature" containment="true" resolveProxies="true"
	 * @generated
	 */
	EList<TemplateParameter> getOwnedParameters();

	/**
	 * Creates a new {@link org.eclipse.uml2.uml.TemplateParameter} and appends it to the '<em><b>Owned Parameter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param eClass The Ecore class of the {@link org.eclipse.uml2.uml.TemplateParameter} to create.
	 * @return The new {@link org.eclipse.uml2.uml.TemplateParameter}.
	 * @see #getOwnedParameters()
	 * @generated
	 */
	TemplateParameter createOwnedParameter(EClass eClass);

	/**
	 * Creates a new {@link org.eclipse.uml2.uml.TemplateParameter} and appends it to the '<em><b>Owned Parameter</b></em>' containment reference list.
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
	 * Parameters must own the ParameterableElements they parameter or those ParameterableElements must be owned by the TemplateableElement being templated.
	 * template.ownedElement->includesAll(parameter.parameteredElement->asSet() - parameter.ownedParameteredElement->asSet())
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validateOwnElements(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The names of the parameters of a TemplateSignature are unique.
	 * parameter->forAll( p1, p2 | (p1 <> p2 and p1.parameteredElement.oclIsKindOf(NamedElement) and p2.parameteredElement.oclIsKindOf(NamedElement) ) implies
	 *    p1.parameteredElement.oclAsType(NamedElement).name <> p2.parameteredElement.oclAsType(NamedElement).name)
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validateUniqueParameters(DiagnosticChain diagnostics,
			Map<Object, Object> context);

} // TemplateSignature
