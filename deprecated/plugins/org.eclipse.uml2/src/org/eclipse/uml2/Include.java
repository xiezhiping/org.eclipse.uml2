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
 * $Id: Include.java,v 1.2 2004/04/10 04:09:50 khussey Exp $
 */
package org.eclipse.uml2;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Include</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2.Include#getIncludingCase <em>Including Case</em>}</li>
 *   <li>{@link org.eclipse.uml2.Include#getAddition <em>Addition</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.uml2.UML2Package#getInclude()
 * @model 
 * @generated
 */
public interface Include extends NamedElement, DirectedRelationship{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) 2003, 2004 IBM Corporation and others."; //$NON-NLS-1$

	/**
	 * Returns the value of the '<em><b>Including Case</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.uml2.UseCase#getIncludes <em>Include</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Including Case</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Including Case</em>' container reference.
	 * @see #setIncludingCase(UseCase)
	 * @see org.eclipse.uml2.UML2Package#getInclude_IncludingCase()
	 * @see org.eclipse.uml2.UseCase#getIncludes
	 * @model opposite="include" required="true"
	 * @generated
	 */
	UseCase getIncludingCase();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.Include#getIncludingCase <em>Including Case</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Including Case</em>' container reference.
	 * @see #getIncludingCase()
	 * @generated
	 */
	void setIncludingCase(UseCase value);

	/**
	 * Returns the value of the '<em><b>Addition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Addition</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Addition</em>' reference.
	 * @see #setAddition(UseCase)
	 * @see org.eclipse.uml2.UML2Package#getInclude_Addition()
	 * @model required="true"
	 * @generated
	 */
	UseCase getAddition();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.Include#getAddition <em>Addition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Addition</em>' reference.
	 * @see #getAddition()
	 * @generated
	 */
	void setAddition(UseCase value);

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

} // Include
