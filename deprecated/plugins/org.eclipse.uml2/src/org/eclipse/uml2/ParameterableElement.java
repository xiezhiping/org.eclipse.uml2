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
 * $Id: ParameterableElement.java,v 1.4 2005/03/15 18:44:42 khussey Exp $
 */
package org.eclipse.uml2;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameterable Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A ParameterableElement can be referenced by a TemplateParameter when defining a formal template parameter for a template. A ParameterableElement can be referenced by a TemplateParameterSubstitution when used as an actual parameter in a binding of a template. ParameterableElement is an abstract metaclass. 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2.ParameterableElement#getTemplateParameter <em>Template Parameter</em>}</li>
 *   <li>{@link org.eclipse.uml2.ParameterableElement#getOwningParameter <em>Owning Parameter</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.uml2.UML2Package#getParameterableElement()
 * @model abstract="true"
 * @generated
 */
public interface ParameterableElement extends Element{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) 2003, 2004 IBM Corporation and others."; //$NON-NLS-1$

	/**
	 * Returns the value of the '<em><b>Template Parameter</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.uml2.TemplateParameter#getParameteredElement <em>Parametered Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Template Parameter</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Template Parameter</em>' reference.
	 * @see #setTemplateParameter(TemplateParameter)
	 * @see org.eclipse.uml2.UML2Package#getParameterableElement_TemplateParameter()
	 * @see org.eclipse.uml2.TemplateParameter#getParameteredElement
	 * @model opposite="parameteredElement" volatile="true"
	 * @generated
	 */
	TemplateParameter getTemplateParameter();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.ParameterableElement#getTemplateParameter <em>Template Parameter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Template Parameter</em>' reference.
	 * @see #getTemplateParameter()
	 * @generated
	 */
	void setTemplateParameter(TemplateParameter value);

	/**
	 * Returns the value of the '<em><b>Owning Parameter</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.uml2.TemplateParameter#getOwnedParameteredElement <em>Owned Parametered Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owning Parameter</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owning Parameter</em>' container reference.
	 * @see #setOwningParameter(TemplateParameter)
	 * @see org.eclipse.uml2.UML2Package#getParameterableElement_OwningParameter()
	 * @see org.eclipse.uml2.TemplateParameter#getOwnedParameteredElement
	 * @model opposite="ownedParameteredElement" volatile="true"
	 * @generated
	 */
	TemplateParameter getOwningParameter();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.ParameterableElement#getOwningParameter <em>Owning Parameter</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owning Parameter</em>' container reference.
	 * @see #getOwningParameter()
	 * @generated
	 */
	void setOwningParameter(TemplateParameter value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model parameters=""
	 * @generated
	 */
	Element getOwner();

} // ParameterableElement
