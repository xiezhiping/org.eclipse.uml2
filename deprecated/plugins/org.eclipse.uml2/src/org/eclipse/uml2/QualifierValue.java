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
 * $Id: QualifierValue.java,v 1.6 2005/05/18 16:38:30 khussey Exp $
 */
package org.eclipse.uml2;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Qualifier Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A link cannot be passed as a runtime value to or from an action. Instead, a link is identified by its end objects and qualifier values, as required. This requires more than one piece of data, namely, the end in the user model, the object on the end, and the qualifier values for that end. These pieces are brought together around LinkEndData. Each association end is identified separately with an instance of the LinkEndData class. 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2.QualifierValue#getQualifier <em>Qualifier</em>}</li>
 *   <li>{@link org.eclipse.uml2.QualifierValue#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.uml2.UML2Package#getQualifierValue()
 * @model
 * @generated
 */
public interface QualifierValue extends Element{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) IBM Corporation and others."; //$NON-NLS-1$

	/**
	 * Returns the value of the '<em><b>Qualifier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Qualifier</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Qualifier</em>' reference.
	 * @see #setQualifier(Property)
	 * @see org.eclipse.uml2.UML2Package#getQualifierValue_Qualifier()
	 * @model required="true"
	 * @generated
	 */
	Property getQualifier();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.QualifierValue#getQualifier <em>Qualifier</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Qualifier</em>' reference.
	 * @see #getQualifier()
	 * @generated
	 */
	void setQualifier(Property value);


	/**
	 * Returns the value of the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Input pin from which the specified value for the qualifier is taken.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Value</em>' reference.
	 * @see #setValue(InputPin)
	 * @see org.eclipse.uml2.UML2Package#getQualifierValue_Value()
	 * @model required="true"
	 * @generated
	 */
	InputPin getValue();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.QualifierValue#getValue <em>Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' reference.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(InputPin value);


} // QualifierValue
