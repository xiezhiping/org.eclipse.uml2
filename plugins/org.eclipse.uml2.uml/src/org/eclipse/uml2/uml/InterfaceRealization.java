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
 * A representation of the model object '<em><b>Interface Realization</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An InterfaceRealization is a specialized realization relationship between a BehavioredClassifier and an Interface. This relationship signifies that the realizing BehavioredClassifier conforms to the contract specified by the Interface.
 * <p>From package UML::SimpleClassifiers.</p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.InterfaceRealization#getContract <em>Contract</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.InterfaceRealization#getImplementingClassifier <em>Implementing Classifier</em>}</li>
 * </ul>
 *
 * @see org.eclipse.uml2.uml.UMLPackage#getInterfaceRealization()
 * @model
 * @generated
 */
public interface InterfaceRealization
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
	 * References the Interface specifying the conformance contract.
	 * <p>From package UML::SimpleClassifiers.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Contract</em>' reference.
	 * @see #setContract(Interface)
	 * @see org.eclipse.uml2.uml.UMLPackage#getInterfaceRealization_Contract()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Interface getContract();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.uml.InterfaceRealization#getContract <em>Contract</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contract</em>' reference.
	 * @see #getContract()
	 * @generated
	 */
	void setContract(Interface value);

	/**
	 * Returns the value of the '<em><b>Implementing Classifier</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.uml2.uml.BehavioredClassifier#getInterfaceRealizations <em>Interface Realization</em>}'.
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
	 * References the BehavioredClassifier that owns this InterfaceRealization, i.e., the BehavioredClassifier that realizes the Interface to which it refers.
	 * <p>From package UML::SimpleClassifiers.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Implementing Classifier</em>' container reference.
	 * @see #setImplementingClassifier(BehavioredClassifier)
	 * @see org.eclipse.uml2.uml.UMLPackage#getInterfaceRealization_ImplementingClassifier()
	 * @see org.eclipse.uml2.uml.BehavioredClassifier#getInterfaceRealizations
	 * @model opposite="interfaceRealization" required="true" transient="false" ordered="false"
	 * @generated
	 */
	BehavioredClassifier getImplementingClassifier();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.uml.InterfaceRealization#getImplementingClassifier <em>Implementing Classifier</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Implementing Classifier</em>' container reference.
	 * @see #getImplementingClassifier()
	 * @generated
	 */
	void setImplementingClassifier(BehavioredClassifier value);

} // InterfaceRealization
