/*
 * Copyright (c) 2005, 2015 IBM Corporation, CEA, and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *   Kenn Hussey (CEA) - 327039, 351774, 418466, 451350
 *   Christian W. Damus (CEA) - 251963
 *
 */
package org.eclipse.uml2.uml;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Substitution</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A substitution is a relationship between two classifiers signifying that the substituting classifier complies with the contract specified by the contract classifier. This implies that instances of the substituting classifier are runtime substitutable where instances of the contract classifier are expected.
 * <p>From package UML::Classification.</p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.Substitution#getContract <em>Contract</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Substitution#getSubstitutingClassifier <em>Substituting Classifier</em>}</li>
 * </ul>
 *
 * @see org.eclipse.uml2.uml.UMLPackage#getSubstitution()
 * @model
 * @generated
 */
public interface Substitution
		extends Realization {

	/**
	 * Returns the value of the '<em><b>Contract</b></em>' reference.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.eclipse.uml2.uml.Dependency#getSuppliers() <em>Supplier</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The contract with which the substituting classifier complies.
	 * <p>From package UML::Classification.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Contract</em>' reference.
	 * @see #setContract(Classifier)
	 * @see org.eclipse.uml2.uml.UMLPackage#getSubstitution_Contract()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Classifier getContract();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.uml.Substitution#getContract <em>Contract</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contract</em>' reference.
	 * @see #getContract()
	 * @generated
	 */
	void setContract(Classifier value);

	/**
	 * Returns the value of the '<em><b>Substituting Classifier</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.uml2.uml.Classifier#getSubstitutions <em>Substitution</em>}'.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.eclipse.uml2.uml.Dependency#getClients() <em>Client</em>}'</li>
	 *   <li>'{@link org.eclipse.uml2.uml.Element#getOwner() <em>Owner</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Instances of the substituting classifier are runtime substitutable where instances of the contract classifier are expected.
	 * <p>From package UML::Classification.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Substituting Classifier</em>' container reference.
	 * @see #setSubstitutingClassifier(Classifier)
	 * @see org.eclipse.uml2.uml.UMLPackage#getSubstitution_SubstitutingClassifier()
	 * @see org.eclipse.uml2.uml.Classifier#getSubstitutions
	 * @model opposite="substitution" required="true" transient="false" ordered="false"
	 * @generated
	 */
	Classifier getSubstitutingClassifier();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.uml.Substitution#getSubstitutingClassifier <em>Substituting Classifier</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Substituting Classifier</em>' container reference.
	 * @see #getSubstitutingClassifier()
	 * @generated
	 */
	void setSubstitutingClassifier(Classifier value);

} // Substitution
