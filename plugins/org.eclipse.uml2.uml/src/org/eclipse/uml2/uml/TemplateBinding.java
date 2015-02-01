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

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Template Binding</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A TemplateBinding is a DirectedRelationship between a TemplateableElement and a template. A TemplateBinding specifies the TemplateParameterSubstitutions of actual parameters for the formal parameters of the template.
 * <p>From package UML::CommonStructure.</p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.TemplateBinding#getParameterSubstitutions <em>Parameter Substitution</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.TemplateBinding#getSignature <em>Signature</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.TemplateBinding#getBoundElement <em>Bound Element</em>}</li>
 * </ul>
 *
 * @see org.eclipse.uml2.uml.UMLPackage#getTemplateBinding()
 * @model
 * @generated
 */
public interface TemplateBinding
		extends DirectedRelationship {

	/**
	 * Returns the value of the '<em><b>Signature</b></em>' reference.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.eclipse.uml2.uml.DirectedRelationship#getTargets() <em>Target</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The TemplateSignature for the template that is the target of this TemplateBinding.
	 * <p>From package UML::CommonStructure.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Signature</em>' reference.
	 * @see #setSignature(TemplateSignature)
	 * @see org.eclipse.uml2.uml.UMLPackage#getTemplateBinding_Signature()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	TemplateSignature getSignature();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.uml.TemplateBinding#getSignature <em>Signature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Signature</em>' reference.
	 * @see #getSignature()
	 * @generated
	 */
	void setSignature(TemplateSignature value);

	/**
	 * Returns the value of the '<em><b>Parameter Substitution</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.TemplateParameterSubstitution}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.uml2.uml.TemplateParameterSubstitution#getTemplateBinding <em>Template Binding</em>}'.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.eclipse.uml2.uml.Element#getOwnedElements() <em>Owned Element</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The TemplateParameterSubstitutions owned by this TemplateBinding.
	 * <p>From package UML::CommonStructure.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Parameter Substitution</em>' containment reference list.
	 * @see org.eclipse.uml2.uml.UMLPackage#getTemplateBinding_ParameterSubstitution()
	 * @see org.eclipse.uml2.uml.TemplateParameterSubstitution#getTemplateBinding
	 * @model opposite="templateBinding" containment="true" resolveProxies="true" ordered="false"
	 * @generated
	 */
	EList<TemplateParameterSubstitution> getParameterSubstitutions();

	/**
	 * Creates a new {@link org.eclipse.uml2.uml.TemplateParameterSubstitution} and appends it to the '<em><b>Parameter Substitution</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return The new {@link org.eclipse.uml2.uml.TemplateParameterSubstitution}.
	 * @see #getParameterSubstitutions()
	 * @generated
	 */
	TemplateParameterSubstitution createParameterSubstitution();

	/**
	 * Returns the value of the '<em><b>Bound Element</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.uml2.uml.TemplateableElement#getTemplateBindings <em>Template Binding</em>}'.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.eclipse.uml2.uml.DirectedRelationship#getSources() <em>Source</em>}'</li>
	 *   <li>'{@link org.eclipse.uml2.uml.Element#getOwner() <em>Owner</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The TemplateableElement that is bound by this TemplateBinding.
	 * <p>From package UML::CommonStructure.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Bound Element</em>' container reference.
	 * @see #setBoundElement(TemplateableElement)
	 * @see org.eclipse.uml2.uml.UMLPackage#getTemplateBinding_BoundElement()
	 * @see org.eclipse.uml2.uml.TemplateableElement#getTemplateBindings
	 * @model opposite="templateBinding" required="true" transient="false" ordered="false"
	 * @generated
	 */
	TemplateableElement getBoundElement();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.uml.TemplateBinding#getBoundElement <em>Bound Element</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bound Element</em>' container reference.
	 * @see #getBoundElement()
	 * @generated
	 */
	void setBoundElement(TemplateableElement value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Each parameterSubstitution must refer to a formal TemplateParameter of the target TemplateSignature.
	 * parameterSubstitution->forAll(b | signature.parameter->includes(b.formal))
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validateParameterSubstitutionFormal(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A TemplateBiinding contains at most one TemplateParameterSubstitution for each formal TemplateParameter of the target TemplateSignature.
	 * signature.parameter->forAll(p | parameterSubstitution->select(b | b.formal = p)->size() <= 1)
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validateOneParameterSubstitution(DiagnosticChain diagnostics,
			Map<Object, Object> context);

} // TemplateBinding
