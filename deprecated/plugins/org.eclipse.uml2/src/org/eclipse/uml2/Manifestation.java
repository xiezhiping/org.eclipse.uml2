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
 * $Id: Manifestation.java,v 1.5 2005/04/04 20:11:14 khussey Exp $
 */
package org.eclipse.uml2;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Manifestation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * In the metamodel, a Manifestation is a subtype of Abstraction. A Manifestation is owned by an Artifact. 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2.Manifestation#getUtilizedElement <em>Utilized Element</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.uml2.UML2Package#getManifestation()
 * @model
 * @generated
 */
public interface Manifestation extends Abstraction{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) 2003, 2005 IBM Corporation and others."; //$NON-NLS-1$

	/**
	 * Returns the value of the '<em><b>Utilized Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Utilized Element</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The model element that is utilized in the manifestation in an Artifact. This association specializes the supplier association.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Utilized Element</em>' reference.
	 * @see #setUtilizedElement(PackageableElement)
	 * @see org.eclipse.uml2.UML2Package#getManifestation_UtilizedElement()
	 * @model required="true" volatile="true"
	 *        annotation="subsets org.eclipse.uml2.Dependency#getSuppliers='' org.eclipse.uml2.DirectedRelationship#getTargets=''"
	 * @generated
	 */
	PackageableElement getUtilizedElement();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.Manifestation#getUtilizedElement <em>Utilized Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Utilized Element</em>' reference.
	 * @see #getUtilizedElement()
	 * @generated
	 */
	void setUtilizedElement(PackageableElement value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model parameters=""
	 *        annotation="feature derived='false' name='supplier' eType='org.eclipse.uml2.NamedElement' containment='false'" 
	 * @generated
	 */
	EList getSuppliers();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model parameters=""
	 *        annotation="feature derived='true' name='target' eType='org.eclipse.uml2.Element' containment='false'" 
	 * @generated
	 */
	EList getTargets();

} // Manifestation
