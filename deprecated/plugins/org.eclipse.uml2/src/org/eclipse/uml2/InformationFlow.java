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
 * $Id: InformationFlow.java,v 1.2 2004/04/10 04:09:50 khussey Exp $
 */
package org.eclipse.uml2;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Information Flow</b></em>'.
 * <!-- end-user-doc -->
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
public interface InformationFlow extends DirectedRelationship{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) 2003, 2004 IBM Corporation and others."; //$NON-NLS-1$

	/**
	 * Returns the value of the '<em><b>Realization</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.Relationship}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Realization</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Realization</em>' reference list.
	 * @see org.eclipse.uml2.UML2Package#getInformationFlow_Realization()
	 * @model type="org.eclipse.uml2.Relationship"
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
	 * @return the value of the '<em>Conveyed</em>' reference list.
	 * @see org.eclipse.uml2.UML2Package#getInformationFlow_Conveyed()
	 * @model type="org.eclipse.uml2.Classifier" required="true"
	 * @generated
	 */
	EList getConveyeds();

    /**
     * Retrieves the {@link org.eclipse.uml2.Classifier} with the specified name from the '<em><b>Conveyed</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param unqualifiedName The unqualified name of the {@link org.eclipse.uml2.Classifier} to retrieve.
	 * @return The {@link org.eclipse.uml2.Classifier} with the specified name, or <code>null</code>.
	 * @see #getConveyeds()
	 * @generated
     */
    Classifier getConveyed(String unqualifiedName);
      
} // InformationFlow
