/*
 * Copyright (c) 2003, 2004 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Common Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/cpl-v10.html
 *
 * Contributors:
 *   IBM - Initial API and implementation
 */
package org.eclipse.uml2;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>General Ordering</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2.GeneralOrdering#getBefore <em>Before</em>}</li>
 *   <li>{@link org.eclipse.uml2.GeneralOrdering#getAfter <em>After</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.uml2.UML2Package#getGeneralOrdering()
 * @model 
 * @generated
 */
public interface GeneralOrdering extends NamedElement{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) 2003, 2004 IBM Corporation and others."; //$NON-NLS-1$

	/**
	 * Returns the value of the '<em><b>Before</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.uml2.EventOccurrence#getToAfters <em>To After</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Before</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Before</em>' reference.
	 * @see #setBefore(EventOccurrence)
	 * @see org.eclipse.uml2.UML2Package#getGeneralOrdering_Before()
	 * @see org.eclipse.uml2.EventOccurrence#getToAfters
	 * @model opposite="toAfter" required="true"
	 * @generated
	 */
	EventOccurrence getBefore();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.GeneralOrdering#getBefore <em>Before</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Before</em>' reference.
	 * @see #getBefore()
	 * @generated
	 */
	void setBefore(EventOccurrence value);

	/**
	 * Returns the value of the '<em><b>After</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.uml2.EventOccurrence#getToBefores <em>To Before</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>After</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>After</em>' reference.
	 * @see #setAfter(EventOccurrence)
	 * @see org.eclipse.uml2.UML2Package#getGeneralOrdering_After()
	 * @see org.eclipse.uml2.EventOccurrence#getToBefores
	 * @model opposite="toBefore" required="true"
	 * @generated
	 */
	EventOccurrence getAfter();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.GeneralOrdering#getAfter <em>After</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>After</em>' reference.
	 * @see #getAfter()
	 * @generated
	 */
	void setAfter(EventOccurrence value);

} // GeneralOrdering
