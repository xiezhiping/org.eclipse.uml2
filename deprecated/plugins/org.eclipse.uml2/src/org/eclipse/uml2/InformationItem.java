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
 * $Id: InformationItem.java,v 1.7 2005/05/18 16:38:29 khussey Exp $
 */
package org.eclipse.uml2;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Information Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An information Item is an abstraction of all kinds of information that can be exchanged between objects. It is a kind of classifier intended for representing information at a very abstract way, which is cannot be instanciated. One purpose of Information Items is to be able to define preliminary models, before having taken detailed modeling decisions on types or stuctures. One other purpose of information items and information flows is to abstract complex models by a less precise but more general representation of the information exchanged betwen entities of a system. 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2.InformationItem#getRepresenteds <em>Represented</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.uml2.UML2Package#getInformationItem()
 * @model
 * @generated
 */
public interface InformationItem extends Classifier{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) IBM Corporation and others."; //$NON-NLS-1$

	/**
	 * Returns the value of the '<em><b>Represented</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.Classifier}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Represented</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * : Determines the classifiers that will specify the structure and nature of the information. An information item represents all its represented classifiers. Customer Company Employee product wage <<flow>> <<flow>>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Represented</em>' reference list.
	 * @see org.eclipse.uml2.UML2Package#getInformationItem_Represented()
	 * @model type="org.eclipse.uml2.Classifier" ordered="false"
	 * @generated
	 */
	EList getRepresenteds();


    /**
     * Retrieves the {@link org.eclipse.uml2.Classifier} with the specified '<em><b>Name</b></em>' from the '<em><b>Represented</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.Classifier} to retrieve.
	 * @return The {@link org.eclipse.uml2.Classifier} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getRepresenteds()
	 * @generated
     */
    Classifier getRepresented(String unqualifiedName);
      
} // InformationItem
