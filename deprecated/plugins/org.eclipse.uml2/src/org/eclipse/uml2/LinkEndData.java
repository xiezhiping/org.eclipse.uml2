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
 * $Id: LinkEndData.java,v 1.7 2005/05/18 16:38:30 khussey Exp $
 */
package org.eclipse.uml2;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Link End Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2.LinkEndData#getValue <em>Value</em>}</li>
 *   <li>{@link org.eclipse.uml2.LinkEndData#getEnd <em>End</em>}</li>
 *   <li>{@link org.eclipse.uml2.LinkEndData#getQualifiers <em>Qualifier</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.uml2.UML2Package#getLinkEndData()
 * @model
 * @generated
 */
public interface LinkEndData extends Element{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) IBM Corporation and others."; //$NON-NLS-1$

	/**
	 * Returns the value of the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Input pin that provides the specified object for the given end. This pin is omitted if the link-end data specifies an “open” end for reading.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Value</em>' reference.
	 * @see #setValue(InputPin)
	 * @see org.eclipse.uml2.UML2Package#getLinkEndData_Value()
	 * @model
	 * @generated
	 */
	InputPin getValue();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.LinkEndData#getValue <em>Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' reference.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(InputPin value);


	/**
	 * Returns the value of the '<em><b>End</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Association end for which this link-end data specifies values.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>End</em>' reference.
	 * @see #setEnd(Property)
	 * @see org.eclipse.uml2.UML2Package#getLinkEndData_End()
	 * @model required="true"
	 * @generated
	 */
	Property getEnd();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.LinkEndData#getEnd <em>End</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End</em>' reference.
	 * @see #getEnd()
	 * @generated
	 */
	void setEnd(Property value);


	/**
	 * Returns the value of the '<em><b>Qualifier</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2.QualifierValue}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Qualifier</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Attribute representing the qualifier for which the value is to be specified.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Qualifier</em>' containment reference list.
	 * @see org.eclipse.uml2.UML2Package#getLinkEndData_Qualifier()
	 * @model type="org.eclipse.uml2.QualifierValue" containment="true" required="true"
	 * @generated
	 */
	EList getQualifiers();


    /**
     * Creates a {@link org.eclipse.uml2.QualifierValue} and appends it to the '<em><b>Qualifier</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param eClass The Ecore class of the {@link org.eclipse.uml2.QualifierValue} to create.
	 * @return The new {@link org.eclipse.uml2.QualifierValue}.
	 * @see #getQualifiers()
	 * @generated NOT
	 * @deprecated Use #createQualifier() instead.
     */
    QualifierValue createQualifier(EClass eClass);

    /**
     * Creates a {@link org.eclipse.uml2.QualifierValue} and appends it to the '<em><b>Qualifier</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return The new {@link org.eclipse.uml2.QualifierValue}.
	 * @see #getQualifiers()
	 * @generated
     */
    QualifierValue createQualifier();

} // LinkEndData
