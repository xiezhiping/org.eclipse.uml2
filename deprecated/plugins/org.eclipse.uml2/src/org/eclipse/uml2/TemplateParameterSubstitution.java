/*
 * Copyright (c) 2003, 2004 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *
 * $Id: TemplateParameterSubstitution.java,v 1.8 2005/04/04 20:11:14 khussey Exp $
 */
package org.eclipse.uml2;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Template Parameter Substitution</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * TemplateParameterSubstitution associates one or more actual parameters with a formal template parameter within the context of a TemplateBinding. 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2.TemplateParameterSubstitution#getFormal <em>Formal</em>}</li>
 *   <li>{@link org.eclipse.uml2.TemplateParameterSubstitution#getTemplateBinding <em>Template Binding</em>}</li>
 *   <li>{@link org.eclipse.uml2.TemplateParameterSubstitution#getActuals <em>Actual</em>}</li>
 *   <li>{@link org.eclipse.uml2.TemplateParameterSubstitution#getOwnedActuals <em>Owned Actual</em>}</li>
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
	String copyright = "Copyright (c) 2003, 2005 IBM Corporation and others."; //$NON-NLS-1$

	/**
	 * Returns the value of the '<em><b>Formal</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Formal</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The formal template parameter that is associated with this substitution.
	 * <!-- end-model-doc -->
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
	 *        annotation="subsets org.eclipse.uml2.Element#getOwner=''"
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
	 * <!-- begin-model-doc -->
	 * elements that are the actual parameters for this substitution.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Actual</em>' reference list.
	 * @see org.eclipse.uml2.UML2Package#getTemplateParameterSubstitution_Actual()
	 * @model type="org.eclipse.uml2.ParameterableElement" required="true" volatile="true" ordered="false"
	 * @generated
	 */
	EList getActuals();

	/**
	 * Returns the value of the '<em><b>Owned Actual</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2.ParameterableElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Actual</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The actual parameters that are owned by this substitution. Subsets Element:: ownedElement and actual.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned Actual</em>' containment reference list.
	 * @see org.eclipse.uml2.UML2Package#getTemplateParameterSubstitution_OwnedActual()
	 * @model type="org.eclipse.uml2.ParameterableElement" containment="true" volatile="true" ordered="false"
	 *        annotation="subsets org.eclipse.uml2.TemplateParameterSubstitution#getActuals='' org.eclipse.uml2.Element#getOwnedElements=''"
	 * @generated
	 */
	EList getOwnedActuals();

    /**
     * Creates a {@link org.eclipse.uml2.ParameterableElement} and appends it to the '<em><b>Owned Actual</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param eClass The Ecore class of the {@link org.eclipse.uml2.ParameterableElement} to create.
	 * @return The new {@link org.eclipse.uml2.ParameterableElement}.
	 * @see #getOwnedActuals()
	 * @generated
     */
    ParameterableElement createOwnedActual(EClass eClass);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model parameters=""
	 *        annotation="feature eOpposite.containment='false' containment='false' name='owner' eOpposite='ownedElement' derived='true' eOpposite.upperBound='-1' eType='org.eclipse.uml2.Element' eOpposite.lowerBound='0'" 
	 * @generated
	 */
	Element getOwner();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model parameters=""
	 *        annotation="feature eOpposite.containment='false' containment='false' name='ownedElement' eOpposite='owner' derived='true' eOpposite.upperBound='1' eType='org.eclipse.uml2.Element' eOpposite.lowerBound='0'" 
	 * @generated
	 */
	EList getOwnedElements();

} // TemplateParameterSubstitution
