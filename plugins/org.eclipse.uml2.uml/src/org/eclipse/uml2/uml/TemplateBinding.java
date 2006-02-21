/*
 * Copyright (c) 2005, 2006 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *
 * $Id: TemplateBinding.java,v 1.5 2006/02/21 16:12:18 khussey Exp $
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
 * TemplateBinding is a directed relationship from a bound templateable element to the template signature of the target template. A TemplateBinding owns a set of template parameter substitutions.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.TemplateBinding#getSignature <em>Signature</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.TemplateBinding#getParameterSubstitutions <em>Parameter Substitution</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.TemplateBinding#getBoundElement <em>Bound Element</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.uml2.uml.UMLPackage#getTemplateBinding()
 * @model
 * @generated
 */
public interface TemplateBinding
		extends DirectedRelationship {

	/**
	 * Returns the value of the '<em><b>Signature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The template signature for the template that is the target of the binding.
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The parameter substitutions owned by this template binding.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Parameter Substitution</em>' containment reference list.
	 * @see org.eclipse.uml2.uml.UMLPackage#getTemplateBinding_ParameterSubstitution()
	 * @see org.eclipse.uml2.uml.TemplateParameterSubstitution#getTemplateBinding
	 * @model type="org.eclipse.uml2.uml.TemplateParameterSubstitution" opposite="templateBinding" containment="true" ordered="false"
	 * @generated
	 */
	EList getParameterSubstitutions();

	/**
	 * Creates a {@link org.eclipse.uml2.uml.TemplateParameterSubstitution} and appends it to the '<em><b>Parameter Substitution</b></em>' containment reference list.
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The element that is bound by this binding.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Bound Element</em>' container reference.
	 * @see #setBoundElement(TemplateableElement)
	 * @see org.eclipse.uml2.uml.UMLPackage#getTemplateBinding_BoundElement()
	 * @see org.eclipse.uml2.uml.TemplateableElement#getTemplateBindings
	 * @model opposite="templateBinding" resolveProxies="false" required="true" ordered="false"
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
	 * Each parameter substitution must refer to a formal template parameter of the target template signature.
	 * parameterSubstitution->forAll(b | template.parameter->includes(b.formal))
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validateParameterSubstitutionFormal(DiagnosticChain diagnostics,
			Map context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A binding contains at most one parameter substitution for each formal template parameter of the target template signature.
	 * template.parameter->forAll(p | parameterSubstitution->select(b | b.formal = p)->size() <= 1)
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validateOneParameterSubstitution(DiagnosticChain diagnostics,
			Map context);

} // TemplateBinding
