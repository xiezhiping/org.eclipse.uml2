/*
 * Copyright (c) 2003, 2004 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Common Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/cpl-v10.html
 *
 * Contributors:
 *   IBM - Initial API and implementation
 */
package org.eclipse.uml2;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Template Parameter Substitution</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2.TemplateParameterSubstitution#getFormal <em>Formal</em>}</li>
 *   <li>{@link org.eclipse.uml2.TemplateParameterSubstitution#getTemplateBinding <em>Template Binding</em>}</li>
 *   <li>{@link org.eclipse.uml2.TemplateParameterSubstitution#getActuals <em>Actual</em>}</li>
 *   <li>{@link org.eclipse.uml2.TemplateParameterSubstitution#getOwnedActual <em>Owned Actual</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.uml2.UML2Package#getTemplateParameterSubstitution()
 * @model 
 * @generated
 */
public interface TemplateParameterSubstitution extends Element{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) 2003, 2004 IBM Corporation and others."; //$NON-NLS-1$

	/**
	 * Returns the value of the '<em><b>Formal</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Formal</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Formal</em>' reference.
	 * @see #setFormal(TemplateParameter)
	 * @see org.eclipse.uml2.UML2Package#getTemplateParameterSubstitution_Formal()
	 * @model required="true"
	 * @generated
	 */
	TemplateParameter getFormal();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.TemplateParameterSubstitution#getFormal <em>Formal</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Formal</em>' reference.
	 * @see #getFormal()
	 * @generated
	 */
	void setFormal(TemplateParameter value);

	/**
	 * Returns the value of the '<em><b>Template Binding</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.uml2.TemplateBinding#getParameterSubstitutions <em>Parameter Substitution</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Template Binding</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Template Binding</em>' container reference.
	 * @see #setTemplateBinding(TemplateBinding)
	 * @see org.eclipse.uml2.UML2Package#getTemplateParameterSubstitution_TemplateBinding()
	 * @see org.eclipse.uml2.TemplateBinding#getParameterSubstitutions
	 * @model opposite="parameterSubstitution" required="true"
	 * @generated
	 */
	TemplateBinding getTemplateBinding();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.TemplateParameterSubstitution#getTemplateBinding <em>Template Binding</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Template Binding</em>' container reference.
	 * @see #getTemplateBinding()
	 * @generated
	 */
	void setTemplateBinding(TemplateBinding value);

	/**
	 * Returns the value of the '<em><b>Actual</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.ParameterableElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actual</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actual</em>' reference list.
	 * @see org.eclipse.uml2.UML2Package#getTemplateParameterSubstitution_Actual()
	 * @model type="org.eclipse.uml2.ParameterableElement" required="true" volatile="true"
	 * @generated
	 */
	EList getActuals();

	/**
	 * Returns the value of the '<em><b>Owned Actual</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Actual</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Actual</em>' containment reference.
	 * @see #setOwnedActual(ParameterableElement)
	 * @see org.eclipse.uml2.UML2Package#getTemplateParameterSubstitution_OwnedActual()
	 * @model containment="true" volatile="true"
	 * @generated
	 */
	ParameterableElement getOwnedActual();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.TemplateParameterSubstitution#getOwnedActual <em>Owned Actual</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owned Actual</em>' containment reference.
	 * @see #getOwnedActual()
	 * @generated
	 */
	void setOwnedActual(ParameterableElement value);

    /**
     * Creates a {@link org.eclipse.uml2.ParameterableElement} and sets the '<em><b>Owned Actual</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param eClass The Ecore class of the {@link org.eclipse.uml2.ParameterableElement} to create.
	 * @return The new {@link org.eclipse.uml2.ParameterableElement}.
	 * @see #getOwnedActual()
	 * @generated
     */
    ParameterableElement createOwnedActual(EClass eClass);
     
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model parameters=""
	 * @generated
	 */
	Element getOwner();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model parameters=""
	 * @generated
	 */
	EList getOwnedElements();

} // TemplateParameterSubstitution
