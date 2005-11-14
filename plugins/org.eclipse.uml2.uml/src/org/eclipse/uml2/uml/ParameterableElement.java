/*
 * Copyright (c) 2005 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *
 * $Id: ParameterableElement.java,v 1.1 2005/11/14 22:26:01 khussey Exp $
 */
package org.eclipse.uml2.uml;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameterable Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A ParameterableElement can be referenced by a TemplateParameter when defining a formal template parameter for a template. A ParameterableElement can be referenced by a TemplateParameterSubstitution when used as an actual parameter in a binding of a template.
 * 
 * ParameterableElement is an abstract metaclass.
 * 
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.ParameterableElement#getTemplateParameter <em>Template Parameter</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.ParameterableElement#getOwningTemplateParameter <em>Owning Template Parameter</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.uml2.uml.UMLPackage#getParameterableElement()
 * @model abstract="true"
 * @generated
 */
public interface ParameterableElement
		extends Element {

	/**
	 * Returns the value of the '<em><b>Template Parameter</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.uml2.uml.TemplateParameter#getParameteredElement <em>Parametered Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The template parameter that exposes this element as a formal parameter.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Template Parameter</em>' reference.
	 * @see #setTemplateParameter(TemplateParameter)
	 * @see org.eclipse.uml2.uml.UMLPackage#getParameterableElement_TemplateParameter()
	 * @see org.eclipse.uml2.uml.TemplateParameter#getParameteredElement
	 * @model opposite="parameteredElement" ordered="false"
	 * @generated
	 */
	TemplateParameter getTemplateParameter();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.uml.ParameterableElement#getTemplateParameter <em>Template Parameter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Template Parameter</em>' reference.
	 * @see #getTemplateParameter()
	 * @generated
	 */
	void setTemplateParameter(TemplateParameter value);

	/**
	 * Returns the value of the '<em><b>Owning Template Parameter</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.uml2.uml.TemplateParameter#getOwnedParameteredElement <em>Owned Parametered Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The formal template parameter that owns this element.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owning Template Parameter</em>' container reference.
	 * @see #setOwningTemplateParameter(TemplateParameter)
	 * @see org.eclipse.uml2.uml.UMLPackage#getParameterableElement_OwningTemplateParameter()
	 * @see org.eclipse.uml2.uml.TemplateParameter#getOwnedParameteredElement
	 * @model opposite="ownedParameteredElement" ordered="false"
	 * @generated
	 */
	TemplateParameter getOwningTemplateParameter();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.uml.ParameterableElement#getOwningTemplateParameter <em>Owning Template Parameter</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owning Template Parameter</em>' container reference.
	 * @see #getOwningTemplateParameter()
	 * @generated
	 */
	void setOwningTemplateParameter(TemplateParameter value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The query isCompatibleWith() determines if this parameterable element is compatible with the specified parameterable element. By default parameterable element P is compatible with parameterable element Q if the kind of P is the same or a subtype as the kind of Q. Subclasses should override this operation to specify different compatibility constraints.
	 * result = p->oclIsKindOf(self.oclType)
	 * <!-- end-model-doc -->
	 * @model required="true" ordered="false" pRequired="true" pOrdered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='spec'"
	 * @generated
	 */
	boolean isCompatibleWith(ParameterableElement p);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The query isTemplateParameter() determines if this parameterable element is exposed as a formal template parameter.
	 * result = templateParameter->notEmpty()
	 * <!-- end-model-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='spec'"
	 * @generated
	 */
	boolean isTemplateParameter();

} // ParameterableElement
