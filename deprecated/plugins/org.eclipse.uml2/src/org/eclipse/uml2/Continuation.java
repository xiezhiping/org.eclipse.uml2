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
 * $Id: Continuation.java,v 1.7 2005/05/18 16:38:30 khussey Exp $
 */
package org.eclipse.uml2;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Continuation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A Continuation is a syntactic way to define continuations of different branches of an Alternative CombinedFragment. Continuations is intuitively similar to labels representing intermediate points in a flow of control. 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2.Continuation#isSetting <em>Setting</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.uml2.UML2Package#getContinuation()
 * @model
 * @generated
 */
public interface Continuation extends InteractionFragment{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) IBM Corporation and others."; //$NON-NLS-1$

	/**
	 * Returns the value of the '<em><b>Setting</b></em>' attribute.
	 * The default value is <code>"True"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Setting</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * True: when the Continuation is at the end of the enclosing InteractionFragment and False when it is in the beginning.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Setting</em>' attribute.
	 * @see #setSetting(boolean)
	 * @see org.eclipse.uml2.UML2Package#getContinuation_Setting()
	 * @model default="True" dataType="org.eclipse.uml2.Boolean"
	 * @generated
	 */
	boolean isSetting();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.Continuation#isSetting <em>Setting</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Setting</em>' attribute.
	 * @see #isSetting()
	 * @generated
	 */
	void setSetting(boolean value);


} // Continuation
