/*
 * Copyright (c) 2005, 2015 IBM Corporation, CEA, and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *   Kenn Hussey (CEA) - 327039, 418466, 451350
 *   Christian W. Damus (CEA) - 251963
 *
 */
package org.eclipse.uml2.uml;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component Realization</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Realization is specialized to (optionally) define the Classifiers that realize the contract offered by a Component in terms of its provided and required Interfaces. The Component forms an abstraction from these various Classifiers.
 * <p>From package UML::StructuredClassifiers.</p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.ComponentRealization#getRealizingClassifiers <em>Realizing Classifier</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.ComponentRealization#getAbstraction <em>Abstraction</em>}</li>
 * </ul>
 *
 * @see org.eclipse.uml2.uml.UMLPackage#getComponentRealization()
 * @model
 * @generated
 */
public interface ComponentRealization
		extends Realization {

	/**
	 * Returns the value of the '<em><b>Abstraction</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.uml2.uml.Component#getRealizations <em>Realization</em>}'.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.eclipse.uml2.uml.Dependency#getSuppliers() <em>Supplier</em>}'</li>
	 *   <li>'{@link org.eclipse.uml2.uml.Element#getOwner() <em>Owner</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Component that owns this ComponentRealization and which is implemented by its realizing Classifiers.
	 * <p>From package UML::StructuredClassifiers.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Abstraction</em>' container reference.
	 * @see #setAbstraction(Component)
	 * @see org.eclipse.uml2.uml.UMLPackage#getComponentRealization_Abstraction()
	 * @see org.eclipse.uml2.uml.Component#getRealizations
	 * @model opposite="realization" transient="false" ordered="false"
	 * @generated
	 */
	Component getAbstraction();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.uml.ComponentRealization#getAbstraction <em>Abstraction</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Abstraction</em>' container reference.
	 * @see #getAbstraction()
	 * @generated
	 */
	void setAbstraction(Component value);

	/**
	 * Returns the value of the '<em><b>Realizing Classifier</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.Classifier}.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.eclipse.uml2.uml.Dependency#getClients() <em>Client</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Classifiers that are involved in the implementation of the Component that owns this Realization.
	 * <p>From package UML::StructuredClassifiers.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Realizing Classifier</em>' reference list.
	 * @see org.eclipse.uml2.uml.UMLPackage#getComponentRealization_RealizingClassifier()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	EList<Classifier> getRealizingClassifiers();

	/**
	 * Retrieves the first {@link org.eclipse.uml2.uml.Classifier} with the specified '<em><b>Name</b></em>' from the '<em><b>Realizing Classifier</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.Classifier} to retrieve, or <code>null</code>.
	 * @return The first {@link org.eclipse.uml2.uml.Classifier} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getRealizingClassifiers()
	 * @generated
	 */
	Classifier getRealizingClassifier(String name);

	/**
	 * Retrieves the first {@link org.eclipse.uml2.uml.Classifier} with the specified '<em><b>Name</b></em>' from the '<em><b>Realizing Classifier</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.Classifier} to retrieve, or <code>null</code>.
	 * @param ignoreCase Whether to ignore case in {@link java.lang.String} comparisons.
	 * @param eClass The Ecore class of the {@link org.eclipse.uml2.uml.Classifier} to retrieve, or <code>null</code>.
	 * @return The first {@link org.eclipse.uml2.uml.Classifier} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getRealizingClassifiers()
	 * @generated
	 */
	Classifier getRealizingClassifier(String name, boolean ignoreCase,
			EClass eClass);

} // ComponentRealization
