/*
 * Copyright (c) 2003, 2004 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Common Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/cpl-v10.html
 *
 * Contributors:
 *   IBM - Initial API and implementation
 *
 * $Id: TemplateBinding.java,v 1.3 2004/05/11 15:24:00 khussey Exp $
 */
package org.eclipse.uml2;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Template Binding</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2.TemplateBinding#getBoundElement <em>Bound Element</em>}</li>
 *   <li>{@link org.eclipse.uml2.TemplateBinding#getSignature <em>Signature</em>}</li>
 *   <li>{@link org.eclipse.uml2.TemplateBinding#getParameterSubstitutions <em>Parameter Substitution</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.uml2.UML2Package#getTemplateBinding()
 * @model 
 * @generated
 */
public interface TemplateBinding extends DirectedRelationship{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) 2003, 2004 IBM Corporation and others."; //$NON-NLS-1$

	/**
	 * Returns the value of the '<em><b>Bound Element</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.uml2.TemplateableElement#getTemplateBindings <em>Template Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bound Element</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bound Element</em>' container reference.
	 * @see #setBoundElement(TemplateableElement)
	 * @see org.eclipse.uml2.UML2Package#getTemplateBinding_BoundElement()
	 * @see org.eclipse.uml2.TemplateableElement#getTemplateBindings
	 * @model opposite="templateBinding" required="true"
	 * @generated
	 */
	TemplateableElement getBoundElement();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.TemplateBinding#getBoundElement <em>Bound Element</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bound Element</em>' container reference.
	 * @see #getBoundElement()
	 * @generated
	 */
	void setBoundElement(TemplateableElement value);

	/**
	 * Returns the value of the '<em><b>Signature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Signature</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Signature</em>' reference.
	 * @see #setSignature(TemplateSignature)
	 * @see org.eclipse.uml2.UML2Package#getTemplateBinding_Signature()
	 * @model required="true"
	 * @generated
	 */
	TemplateSignature getSignature();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.TemplateBinding#getSignature <em>Signature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Signature</em>' reference.
	 * @see #getSignature()
	 * @generated
	 */
	void setSignature(TemplateSignature value);

	/**
	 * Returns the value of the '<em><b>Parameter Substitution</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2.TemplateParameterSubstitution}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.uml2.TemplateParameterSubstitution#getTemplateBinding <em>Template Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameter Substitution</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter Substitution</em>' containment reference list.
	 * @see org.eclipse.uml2.UML2Package#getTemplateBinding_ParameterSubstitution()
	 * @see org.eclipse.uml2.TemplateParameterSubstitution#getTemplateBinding
	 * @model type="org.eclipse.uml2.TemplateParameterSubstitution" opposite="templateBinding" containment="true" ordered="false"
	 * @generated
	 */
	EList getParameterSubstitutions();

    /**
     * Creates a {@link org.eclipse.uml2.TemplateParameterSubstitution} and appends it to the '<em><b>Parameter Substitution</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param eClass The Ecore class of the {@link org.eclipse.uml2.TemplateParameterSubstitution} to create.
	 * @return The new {@link org.eclipse.uml2.TemplateParameterSubstitution}.
	 * @see #getParameterSubstitutions()
	 * @generated
     */
    TemplateParameterSubstitution createParameterSubstitution(EClass eClass);

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
	EList getSources();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model parameters=""
	 * @generated
	 */
	EList getTargets();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model parameters=""
	 * @generated
	 */
	EList getOwnedElements();

} // TemplateBinding
