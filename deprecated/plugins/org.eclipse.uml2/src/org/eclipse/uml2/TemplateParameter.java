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
 * $Id: TemplateParameter.java,v 1.2 2004/04/10 04:09:50 khussey Exp $
 */
package org.eclipse.uml2;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Template Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2.TemplateParameter#getSignature <em>Signature</em>}</li>
 *   <li>{@link org.eclipse.uml2.TemplateParameter#getParameteredElement <em>Parametered Element</em>}</li>
 *   <li>{@link org.eclipse.uml2.TemplateParameter#getOwnedParameteredElement <em>Owned Parametered Element</em>}</li>
 *   <li>{@link org.eclipse.uml2.TemplateParameter#getDefault <em>Default</em>}</li>
 *   <li>{@link org.eclipse.uml2.TemplateParameter#getOwnedDefault <em>Owned Default</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.uml2.UML2Package#getTemplateParameter()
 * @model 
 * @generated
 */
public interface TemplateParameter extends Element{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) 2003, 2004 IBM Corporation and others."; //$NON-NLS-1$

	/**
	 * Returns the value of the '<em><b>Signature</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.uml2.TemplateSignature#getOwnedParameters <em>Owned Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Signature</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Signature</em>' container reference.
	 * @see #setSignature(TemplateSignature)
	 * @see org.eclipse.uml2.UML2Package#getTemplateParameter_Signature()
	 * @see org.eclipse.uml2.TemplateSignature#getOwnedParameters
	 * @model opposite="ownedParameter" required="true" volatile="true"
	 * @generated
	 */
	TemplateSignature getSignature();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.TemplateParameter#getSignature <em>Signature</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Signature</em>' container reference.
	 * @see #getSignature()
	 * @generated
	 */
	void setSignature(TemplateSignature value);

	/**
	 * Returns the value of the '<em><b>Parametered Element</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.uml2.ParameterableElement#getTemplateParameter <em>Template Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parametered Element</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parametered Element</em>' reference.
	 * @see #setParameteredElement(ParameterableElement)
	 * @see org.eclipse.uml2.UML2Package#getTemplateParameter_ParameteredElement()
	 * @see org.eclipse.uml2.ParameterableElement#getTemplateParameter
	 * @model opposite="templateParameter" required="true" volatile="true"
	 * @generated
	 */
	ParameterableElement getParameteredElement();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.TemplateParameter#getParameteredElement <em>Parametered Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parametered Element</em>' reference.
	 * @see #getParameteredElement()
	 * @generated
	 */
	void setParameteredElement(ParameterableElement value);

	/**
	 * Returns the value of the '<em><b>Owned Parametered Element</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.uml2.ParameterableElement#getOwningParameter <em>Owning Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Parametered Element</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Parametered Element</em>' containment reference.
	 * @see #setOwnedParameteredElement(ParameterableElement)
	 * @see org.eclipse.uml2.UML2Package#getTemplateParameter_OwnedParameteredElement()
	 * @see org.eclipse.uml2.ParameterableElement#getOwningParameter
	 * @model opposite="owningParameter" containment="true" volatile="true"
	 * @generated
	 */
	ParameterableElement getOwnedParameteredElement();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.TemplateParameter#getOwnedParameteredElement <em>Owned Parametered Element</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owned Parametered Element</em>' containment reference.
	 * @see #getOwnedParameteredElement()
	 * @generated
	 */
	void setOwnedParameteredElement(ParameterableElement value);

    /**
     * Creates a {@link org.eclipse.uml2.ParameterableElement} and sets the '<em><b>Owned Parametered Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param eClass The Ecore class of the {@link org.eclipse.uml2.ParameterableElement} to create.
	 * @return The new {@link org.eclipse.uml2.ParameterableElement}.
	 * @see #getOwnedParameteredElement()
	 * @generated
     */
    ParameterableElement createOwnedParameteredElement(EClass eClass);
     
	/**
	 * Returns the value of the '<em><b>Default</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default</em>' reference.
	 * @see #setDefault(ParameterableElement)
	 * @see org.eclipse.uml2.UML2Package#getTemplateParameter_Default()
	 * @model volatile="true"
	 * @generated
	 */
	ParameterableElement getDefault();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.TemplateParameter#getDefault <em>Default</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default</em>' reference.
	 * @see #getDefault()
	 * @generated
	 */
	void setDefault(ParameterableElement value);

	/**
	 * Returns the value of the '<em><b>Owned Default</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Default</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Default</em>' containment reference.
	 * @see #setOwnedDefault(ParameterableElement)
	 * @see org.eclipse.uml2.UML2Package#getTemplateParameter_OwnedDefault()
	 * @model containment="true" volatile="true"
	 * @generated
	 */
	ParameterableElement getOwnedDefault();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.TemplateParameter#getOwnedDefault <em>Owned Default</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owned Default</em>' containment reference.
	 * @see #getOwnedDefault()
	 * @generated
	 */
	void setOwnedDefault(ParameterableElement value);

    /**
     * Creates a {@link org.eclipse.uml2.ParameterableElement} and sets the '<em><b>Owned Default</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param eClass The Ecore class of the {@link org.eclipse.uml2.ParameterableElement} to create.
	 * @return The new {@link org.eclipse.uml2.ParameterableElement}.
	 * @see #getOwnedDefault()
	 * @generated
     */
    ParameterableElement createOwnedDefault(EClass eClass);
     
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

} // TemplateParameter
