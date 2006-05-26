/*
 * Copyright (c) 2003, 2006 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *
 * $Id: LinkAction.java,v 1.12 2006/05/26 18:16:52 khussey Exp $
 */
package org.eclipse.uml2;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Link Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A link action creates, destroys, or reads links, identifying a link by its end objects and qualifier values, if any. 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2.LinkAction#getEndData <em>End Data</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.uml2.UML2Package#getLinkAction()
 * @model abstract="true"
 * @generated
 */
public interface LinkAction extends Action {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) IBM Corporation and others."; //$NON-NLS-1$

	/**
	 * Returns the value of the '<em><b>End Data</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2.LinkEndData}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End Data</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Data identifying one end of a link by the objects on its ends and qualifiers.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>End Data</em>' containment reference list.
	 * @see org.eclipse.uml2.UML2Package#getLinkAction_EndData()
	 * @model type="org.eclipse.uml2.LinkEndData" containment="true" lower="2" ordered="false"
	 * @generated
	 */
	EList getEndData();



	/**
	 * Creates a {@link org.eclipse.uml2.LinkEndData} and appends it to the '<em><b>End Data</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param eClass The Ecore class of the {@link org.eclipse.uml2.LinkEndData} to create.
	 * @return The new {@link org.eclipse.uml2.LinkEndData}.
	 * @see #getEndData()
	 * @generated NOT
	 */
    LinkEndData createEndData(EClass eClass);

	/**
	 * Creates a {@link org.eclipse.uml2.LinkEndData} and appends it to the '<em><b>End Data</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return The new {@link org.eclipse.uml2.LinkEndData}.
	 * @see #getEndData()
	 * @generated NOT
	 */
    LinkEndData createEndData();


} // LinkAction
