/*
 * Copyright (c) 2003, 2005 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *
 * $Id: Implementation.java,v 1.8 2005/11/21 21:48:02 khussey Exp $
 */
package org.eclipse.uml2;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Implementation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An Implementation is a specialized Realization relationship between a Classifier and an Interface. The implementation relationship signifies that the realizing classifier conforms to the contract specified by the interface. 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2.Implementation#getContract <em>Contract</em>}</li>
 *   <li>{@link org.eclipse.uml2.Implementation#getImplementingClassifier <em>Implementing Classifier</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.uml2.UML2Package#getImplementation()
 * @model
 * @generated
 */
public interface Implementation extends Realization{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) IBM Corporation and others."; //$NON-NLS-1$

	/**
	 * Returns the value of the '<em><b>Contract</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contract</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * References the Interface specifying the conformance contract. (Specializes Dependency. supplier and Relationship.target)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Contract</em>' reference.
	 * @see #setContract(Interface)
	 * @see org.eclipse.uml2.UML2Package#getImplementation_Contract()
	 * @model required="true"
	 * @generated
	 */
	Interface getContract();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.Implementation#getContract <em>Contract</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contract</em>' reference.
	 * @see #getContract()
	 * @generated
	 */
	void setContract(Interface value);


	/**
	 * Returns the value of the '<em><b>Implementing Classifier</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.uml2.BehavioredClassifier#getImplementations <em>Implementation</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Implementing Classifier</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * References the operations owned by the Interface. (Specializes Dependency.client and Relationship.source)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Implementing Classifier</em>' container reference.
	 * @see #setImplementingClassifier(BehavioredClassifier)
	 * @see org.eclipse.uml2.UML2Package#getImplementation_ImplementingClassifier()
	 * @see org.eclipse.uml2.BehavioredClassifier#getImplementations
	 * @model opposite="implementation" resolveProxies="false" required="true"
	 * @generated
	 */
	BehavioredClassifier getImplementingClassifier();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.Implementation#getImplementingClassifier <em>Implementing Classifier</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Implementing Classifier</em>' container reference.
	 * @see #getImplementingClassifier()
	 * @generated
	 */
	void setImplementingClassifier(BehavioredClassifier value);


} // Implementation
