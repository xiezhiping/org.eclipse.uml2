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
 * $Id: TimeConstraint.java,v 1.5 2005/04/04 20:11:15 khussey Exp $
 */
package org.eclipse.uml2;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Time Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A TimeConstraint defines a Constraint that refers to a TimeInterval. 
 * <!-- end-model-doc -->
 *
 *
 * @see org.eclipse.uml2.UML2Package#getTimeConstraint()
 * @model
 * @generated
 */
public interface TimeConstraint extends IntervalConstraint{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) 2003, 2005 IBM Corporation and others."; //$NON-NLS-1$

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model parameters=""
	 *        annotation="feature derived='false' name='specification' eType='org.eclipse.uml2.TimeInterval' containment='false'"
	 *        annotation="redefines org.eclipse.uml2.Constraint#getSpecification='' org.eclipse.uml2.IntervalConstraint#getSpecification=''" 
	 * @generated
	 */
	ValueSpecification getSpecification();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="feature derived='false' name='specification' eType='org.eclipse.uml2.TimeInterval' containment='false'"
	 *        annotation="redefines org.eclipse.uml2.Constraint#getSpecification='' org.eclipse.uml2.IntervalConstraint#getSpecification=''" 
	 * @generated
	 */
	void setSpecification(ValueSpecification newSpecification);

} // TimeConstraint
