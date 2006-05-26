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
 * $Id: InformationFlow.java,v 1.12 2006/05/26 18:16:52 khussey Exp $
 */
package org.eclipse.uml2;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Information Flow</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An Information Flow specifies that one or more information items circulate from its sources to its targets. Information flows require some kind of “information channel” for transmitting information items from the source to the destination. An information channel is repersented in various ways depending on the nature of its sources and targets. It may be represented by connectors, links, associations, or even dependencies. For example, if the source and destination are parts in some composite structure such as a collaboration, then the information channel is likely to be represented by a connector between them. Or, if the source and target are objects (which are a kind of InstanceSpecification), they may be represented by a link that joins the two, and so on. 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2.InformationFlow#getRealizations <em>Realization</em>}</li>
 *   <li>{@link org.eclipse.uml2.InformationFlow#getConveyeds <em>Conveyed</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.uml2.UML2Package#getInformationFlow()
 * @model
 * @generated
 */
public interface InformationFlow extends PackageableElement, DirectedRelationship {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) IBM Corporation and others."; //$NON-NLS-1$

	/**
	 * Returns the value of the '<em><b>Realization</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.Relationship}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Realization</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * : Determines which Relationship will realize the specified flow
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Realization</em>' reference list.
	 * @see org.eclipse.uml2.UML2Package#getInformationFlow_Realization()
	 * @model type="org.eclipse.uml2.Relationship" ordered="false"
	 * @generated
	 */
	EList getRealizations();


	/**
	 * Returns the value of the '<em><b>Conveyed</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.Classifier}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Conveyed</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * : Specifies the information items that may circulate on this information flow.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Conveyed</em>' reference list.
	 * @see org.eclipse.uml2.UML2Package#getInformationFlow_Conveyed()
	 * @model type="org.eclipse.uml2.Classifier" required="true" ordered="false"
	 * @generated
	 */
	EList getConveyeds();


	/**
	 * Retrieves the first {@link org.eclipse.uml2.Classifier} with the specified '<em><b>Name</b></em>' from the '<em><b>Conveyed</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.Classifier} to retrieve, or <code>null</code>.
	 * @return The first {@link org.eclipse.uml2.Classifier} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getConveyeds()
	 * @generated
	 */
    Classifier getConveyed(String name);

	/**
	 * Retrieves the first {@link org.eclipse.uml2.Classifier} with the specified '<em><b>Name</b></em>' from the '<em><b>Conveyed</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.Classifier} to retrieve, or <code>null</code>.
	 * @param ignoreCase Whether to ignore case in {@link java.lang.String} comparisons.
	 * @param eClass The Ecore class of the {@link org.eclipse.uml2.Classifier} to retrieve, or <code>null</code>.
	 * @return The first {@link org.eclipse.uml2.Classifier} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getConveyeds()
	 * @generated
	 */
	Classifier getConveyed(String name, boolean ignoreCase, EClass eClass);


} // InformationFlow
