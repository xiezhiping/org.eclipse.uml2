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
 * $Id: TemplateableElement.java,v 1.7 2005/04/04 20:11:15 khussey Exp $
 */
package org.eclipse.uml2;

import java.util.Set;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Templateable Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * TemplateableElement may contain a template signature which specifies the formal template parameters. A TemplateableElement that contains a template signature is often referred to as a template. TemplateableElement may contain bindings to templates that describe how the templateable element is constructed by replacing the formal template parameters with actual parameters. A TemplateableElement containing bindings is often referred to as a bound element. 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2.TemplateableElement#getTemplateBindings <em>Template Binding</em>}</li>
 *   <li>{@link org.eclipse.uml2.TemplateableElement#getOwnedTemplateSignature <em>Owned Template Signature</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.uml2.UML2Package#getTemplateableElement()
 * @model abstract="true"
 * @generated
 */
public interface TemplateableElement extends Element{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) 2003, 2005 IBM Corporation and others."; //$NON-NLS-1$

	/**
	 * Returns the value of the '<em><b>Template Binding</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2.TemplateBinding}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.uml2.TemplateBinding#getBoundElement <em>Bound Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Template Binding</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * optional bindings from this element to templates.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Template Binding</em>' containment reference list.
	 * @see org.eclipse.uml2.UML2Package#getTemplateableElement_TemplateBinding()
	 * @see org.eclipse.uml2.TemplateBinding#getBoundElement
	 * @model type="org.eclipse.uml2.TemplateBinding" opposite="boundElement" containment="true" ordered="false"
	 *        annotation="subsets org.eclipse.uml2.Element#getOwnedElements=''"
	 * @generated
	 */
	EList getTemplateBindings();

    /**
     * Creates a {@link org.eclipse.uml2.TemplateBinding} and appends it to the '<em><b>Template Binding</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param eClass The Ecore class of the {@link org.eclipse.uml2.TemplateBinding} to create.
	 * @return The new {@link org.eclipse.uml2.TemplateBinding}.
	 * @see #getTemplateBindings()
	 * @generated
     */
    TemplateBinding createTemplateBinding(EClass eClass);

	/**
	 * Returns the value of the '<em><b>Owned Template Signature</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.uml2.TemplateSignature#getTemplate <em>Template</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Template Signature</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Template Signature</em>' containment reference.
	 * @see #setOwnedTemplateSignature(TemplateSignature)
	 * @see org.eclipse.uml2.UML2Package#getTemplateableElement_OwnedTemplateSignature()
	 * @see org.eclipse.uml2.TemplateSignature#getTemplate
	 * @model opposite="template" containment="true"
	 *        annotation="subsets org.eclipse.uml2.Element#getOwnedElements=''"
	 * @generated
	 */
	TemplateSignature getOwnedTemplateSignature();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.TemplateableElement#getOwnedTemplateSignature <em>Owned Template Signature</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owned Template Signature</em>' containment reference.
	 * @see #getOwnedTemplateSignature()
	 * @generated
	 */
	void setOwnedTemplateSignature(TemplateSignature value);

    /**
     * Creates a {@link org.eclipse.uml2.TemplateSignature} and sets the '<em><b>Owned Template Signature</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param eClass The Ecore class of the {@link org.eclipse.uml2.TemplateSignature} to create.
	 * @return The new {@link org.eclipse.uml2.TemplateSignature}.
	 * @see #getOwnedTemplateSignature()
	 * @generated
     */
    TemplateSignature createOwnedTemplateSignature(EClass eClass);
     
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.uml2.Set"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='try {\r\n\tjava.lang.reflect.Method method = getClass().getMethod(\"parameterableElements\", null); //$NON-NLS-1$\r\n\tSet result = (Set) getCacheAdapter().get(this, method);\r\n\r\n\tif (null == result) {\r\n\t\tresult = java.util.Collections.unmodifiableSet(org.eclipse.uml2.internal.operation.TemplateableElementOperations.parameterableElements(this));\r\n\t\tgetCacheAdapter().put(this, method, result);\r\n\t}\r\n\r\n\treturn result;\r\n} catch (Exception e) {\r\n\treturn org.eclipse.uml2.internal.operation.TemplateableElementOperations.parameterableElements(this);\r\n}'" 
	 * @generated
	 */
	Set parameterableElements();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model parameters=""
	 *        annotation="feature eOpposite.containment='false' containment='false' name='ownedElement' eOpposite='owner' derived='true' eOpposite.upperBound='1' eType='org.eclipse.uml2.Element' eOpposite.lowerBound='0'" 
	 * @generated
	 */
	EList getOwnedElements();

} // TemplateableElement
