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

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameterable Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A ParameterableElement is an Element that can be exposed as a formal TemplateParameter for a template, or specified as an actual parameter in a binding of a template.
 * <p>From package UML::CommonStructure.</p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.ParameterableElement#getOwningTemplateParameter <em>Owning Template Parameter</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.ParameterableElement#getTemplateParameter <em>Template Parameter</em>}</li>
 * </ul>
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
	 * The TemplateParameter that exposes this ParameterableElement as a formal parameter.
	 * <p>From package UML::CommonStructure.</p>
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
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.eclipse.uml2.uml.Element#getOwner() <em>Owner</em>}'</li>
	 *   <li>'{@link org.eclipse.uml2.uml.ParameterableElement#getTemplateParameter() <em>Template Parameter</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The formal TemplateParameter that owns this ParameterableElement.
	 * <p>From package UML::CommonStructure.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owning Template Parameter</em>' container reference.
	 * @see #setOwningTemplateParameter(TemplateParameter)
	 * @see org.eclipse.uml2.uml.UMLPackage#getParameterableElement_OwningTemplateParameter()
	 * @see org.eclipse.uml2.uml.TemplateParameter#getOwnedParameteredElement
	 * @model opposite="ownedParameteredElement" transient="false" ordered="false"
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
	 * The query isCompatibleWith() determines if this ParameterableElement is compatible with the specified ParameterableElement. By default, this ParameterableElement is compatible with another ParameterableElement p if the kind of this ParameterableElement is the same as or a subtype of the kind of p. Subclasses of ParameterableElement should override this operation to specify different compatibility constraints.
	 * result = (self.oclIsKindOf(p.oclType()))
	 * <p>From package UML::CommonStructure.</p>
	 * <!-- end-model-doc -->
	 * @model dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false" pRequired="true" pOrdered="false"
	 * @generated
	 */
	boolean isCompatibleWith(ParameterableElement p);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The query isTemplateParameter() determines if this ParameterableElement is exposed as a formal TemplateParameter.
	 * result = (templateParameter->notEmpty())
	 * <p>From package UML::CommonStructure.</p>
	 * <!-- end-model-doc -->
	 * @model kind="operation" dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isTemplateParameter();

} // ParameterableElement
