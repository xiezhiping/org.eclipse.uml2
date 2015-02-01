/*
 * Copyright (c) 2005, 2015 IBM Corporation, CEA, and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *   Christian W. Damus (CEA) - 251963
 *   Kenn Hussey (CEA) - 418466, 451350
 *
 */
package org.eclipse.uml2.uml;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Manifestation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A manifestation is the concrete physical rendering of one or more model elements by an artifact.
 * <p>From package UML::Deployments.</p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.Manifestation#getUtilizedElement <em>Utilized Element</em>}</li>
 * </ul>
 *
 * @see org.eclipse.uml2.uml.UMLPackage#getManifestation()
 * @model
 * @generated
 */
public interface Manifestation
		extends Abstraction {

	/**
	 * Returns the value of the '<em><b>Utilized Element</b></em>' reference.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.eclipse.uml2.uml.Dependency#getSuppliers() <em>Supplier</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The model element that is utilized in the manifestation in an Artifact.
	 * <p>From package UML::Deployments.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Utilized Element</em>' reference.
	 * @see #setUtilizedElement(PackageableElement)
	 * @see org.eclipse.uml2.uml.UMLPackage#getManifestation_UtilizedElement()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	PackageableElement getUtilizedElement();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.uml.Manifestation#getUtilizedElement <em>Utilized Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Utilized Element</em>' reference.
	 * @see #getUtilizedElement()
	 * @generated
	 */
	void setUtilizedElement(PackageableElement value);

} // Manifestation
