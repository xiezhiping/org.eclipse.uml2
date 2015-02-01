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

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Template Parameter Substitution</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A TemplateParameterSubstitution relates the actual parameter to a formal TemplateParameter as part of a template binding.
 * <p>From package UML::CommonStructure.</p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.TemplateParameterSubstitution#getActual <em>Actual</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.TemplateParameterSubstitution#getFormal <em>Formal</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.TemplateParameterSubstitution#getOwnedActual <em>Owned Actual</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.TemplateParameterSubstitution#getTemplateBinding <em>Template Binding</em>}</li>
 * </ul>
 *
 * @see org.eclipse.uml2.uml.UMLPackage#getTemplateParameterSubstitution()
 * @model
 * @generated
 */
public interface TemplateParameterSubstitution
		extends Element {

	/**
	 * Returns the value of the '<em><b>Formal</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The formal TemplateParameter that is associated with this TemplateParameterSubstitution.
	 * <p>From package UML::CommonStructure.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Formal</em>' reference.
	 * @see #setFormal(TemplateParameter)
	 * @see org.eclipse.uml2.uml.UMLPackage#getTemplateParameterSubstitution_Formal()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	TemplateParameter getFormal();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.uml.TemplateParameterSubstitution#getFormal <em>Formal</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Formal</em>' reference.
	 * @see #getFormal()
	 * @generated
	 */
	void setFormal(TemplateParameter value);

	/**
	 * Returns the value of the '<em><b>Actual</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The ParameterableElement that is the actual parameter for this TemplateParameterSubstitution.
	 * <p>From package UML::CommonStructure.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Actual</em>' reference.
	 * @see #setActual(ParameterableElement)
	 * @see org.eclipse.uml2.uml.UMLPackage#getTemplateParameterSubstitution_Actual()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	ParameterableElement getActual();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.uml.TemplateParameterSubstitution#getActual <em>Actual</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Actual</em>' reference.
	 * @see #getActual()
	 * @generated
	 */
	void setActual(ParameterableElement value);

	/**
	 * Returns the value of the '<em><b>Owned Actual</b></em>' containment reference.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.eclipse.uml2.uml.Element#getOwnedElements() <em>Owned Element</em>}'</li>
	 *   <li>'{@link org.eclipse.uml2.uml.TemplateParameterSubstitution#getActual() <em>Actual</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The ParameterableElement that is owned by this TemplateParameterSubstitution as its actual parameter.
	 * <p>From package UML::CommonStructure.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned Actual</em>' containment reference.
	 * @see #setOwnedActual(ParameterableElement)
	 * @see org.eclipse.uml2.uml.UMLPackage#getTemplateParameterSubstitution_OwnedActual()
	 * @model containment="true" resolveProxies="true" ordered="false"
	 * @generated
	 */
	ParameterableElement getOwnedActual();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.uml.TemplateParameterSubstitution#getOwnedActual <em>Owned Actual</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owned Actual</em>' containment reference.
	 * @see #getOwnedActual()
	 * @generated
	 */
	void setOwnedActual(ParameterableElement value);

	/**
	 * Creates a new {@link org.eclipse.uml2.uml.ParameterableElement} and sets the '<em><b>Owned Actual</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param eClass The Ecore class of the {@link org.eclipse.uml2.uml.ParameterableElement} to create.
	 * @return The new {@link org.eclipse.uml2.uml.ParameterableElement}.
	 * @see #getOwnedActual()
	 * @generated
	 */
	ParameterableElement createOwnedActual(EClass eClass);

	/**
	 * Returns the value of the '<em><b>Template Binding</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.uml2.uml.TemplateBinding#getParameterSubstitutions <em>Parameter Substitution</em>}'.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.eclipse.uml2.uml.Element#getOwner() <em>Owner</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The TemplateBinding that owns this TemplateParameterSubstitution.
	 * <p>From package UML::CommonStructure.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Template Binding</em>' container reference.
	 * @see #setTemplateBinding(TemplateBinding)
	 * @see org.eclipse.uml2.uml.UMLPackage#getTemplateParameterSubstitution_TemplateBinding()
	 * @see org.eclipse.uml2.uml.TemplateBinding#getParameterSubstitutions
	 * @model opposite="parameterSubstitution" required="true" transient="false" ordered="false"
	 * @generated
	 */
	TemplateBinding getTemplateBinding();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.uml.TemplateParameterSubstitution#getTemplateBinding <em>Template Binding</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Template Binding</em>' container reference.
	 * @see #getTemplateBinding()
	 * @generated
	 */
	void setTemplateBinding(TemplateBinding value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The actual ParameterableElement must be compatible with the formal TemplateParameter, e.g., the actual ParameterableElement for a Class TemplateParameter must be a Class.
	 * actual->forAll(a | a.isCompatibleWith(formal.parameteredElement))
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validateMustBeCompatible(DiagnosticChain diagnostics,
			Map<Object, Object> context);

} // TemplateParameterSubstitution
