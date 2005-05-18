/*
 * Copyright (c) 2003, 2005 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *
 * $Id: ReadLinkObjectEndQualifierAction.java,v 1.6 2005/05/18 16:38:30 khussey Exp $
 */
package org.eclipse.uml2;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Read Link Object End Qualifier Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This action reads a qualifier value or values on an end of a link object. The association end to retrieve the qualifier from is specified statically, and the link object to read is provided on the input pin at run time. 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2.ReadLinkObjectEndQualifierAction#getObject <em>Object</em>}</li>
 *   <li>{@link org.eclipse.uml2.ReadLinkObjectEndQualifierAction#getResult <em>Result</em>}</li>
 *   <li>{@link org.eclipse.uml2.ReadLinkObjectEndQualifierAction#getQualifier <em>Qualifier</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.uml2.UML2Package#getReadLinkObjectEndQualifierAction()
 * @model
 * @generated
 */
public interface ReadLinkObjectEndQualifierAction extends Action{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) IBM Corporation and others."; //$NON-NLS-1$

	/**
	 * Returns the value of the '<em><b>Object</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Object</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (Specialized from Action:input) Gives the input pin from which the link object is obtained.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Object</em>' containment reference.
	 * @see #setObject(InputPin)
	 * @see org.eclipse.uml2.UML2Package#getReadLinkObjectEndQualifierAction_Object()
	 * @model containment="true" required="true"
	 * @generated
	 */
	InputPin getObject();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.ReadLinkObjectEndQualifierAction#getObject <em>Object</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Object</em>' containment reference.
	 * @see #getObject()
	 * @generated
	 */
	void setObject(InputPin value);


    /**
     * Creates a {@link org.eclipse.uml2.InputPin} and sets the '<em><b>Object</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param eClass The Ecore class of the {@link org.eclipse.uml2.InputPin} to create.
	 * @return The new {@link org.eclipse.uml2.InputPin}.
	 * @see #getObject()
	 * @generated
     */
    InputPin createObject(EClass eClass);

    /**
     * Creates a {@link org.eclipse.uml2.InputPin} and sets the '<em><b>Object</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return The new {@link org.eclipse.uml2.InputPin}.
	 * @see #getObject()
	 * @generated
     */
    InputPin createObject();

	/**
	 * Returns the value of the '<em><b>Result</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Result</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Pin where the result value is placed
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Result</em>' containment reference.
	 * @see #setResult(OutputPin)
	 * @see org.eclipse.uml2.UML2Package#getReadLinkObjectEndQualifierAction_Result()
	 * @model containment="true" required="true"
	 * @generated
	 */
	OutputPin getResult();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.ReadLinkObjectEndQualifierAction#getResult <em>Result</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Result</em>' containment reference.
	 * @see #getResult()
	 * @generated
	 */
	void setResult(OutputPin value);


    /**
     * Creates a {@link org.eclipse.uml2.OutputPin} and sets the '<em><b>Result</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param eClass The Ecore class of the {@link org.eclipse.uml2.OutputPin} to create.
	 * @return The new {@link org.eclipse.uml2.OutputPin}.
	 * @see #getResult()
	 * @generated NOT
	 * @deprecated Use #createResult() instead.
     */
    OutputPin createResult(EClass eClass);

    /**
     * Creates a {@link org.eclipse.uml2.OutputPin} and sets the '<em><b>Result</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return The new {@link org.eclipse.uml2.OutputPin}.
	 * @see #getResult()
	 * @generated
     */
    OutputPin createResult();

	/**
	 * Returns the value of the '<em><b>Qualifier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Qualifier</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The attribute representing the qualifier to be read.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Qualifier</em>' reference.
	 * @see #setQualifier(Property)
	 * @see org.eclipse.uml2.UML2Package#getReadLinkObjectEndQualifierAction_Qualifier()
	 * @model required="true"
	 * @generated
	 */
	Property getQualifier();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.ReadLinkObjectEndQualifierAction#getQualifier <em>Qualifier</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Qualifier</em>' reference.
	 * @see #getQualifier()
	 * @generated
	 */
	void setQualifier(Property value);


} // ReadLinkObjectEndQualifierAction
