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
 * $Id: Implementation.java,v 1.6 2005/04/04 20:11:15 khussey Exp $
 */
package org.eclipse.uml2;

import org.eclipse.emf.common.util.EList;

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
	String copyright = "Copyright (c) 2003, 2005 IBM Corporation and others."; //$NON-NLS-1$

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
	 * @model required="true" volatile="true"
	 *        annotation="subsets org.eclipse.uml2.Dependency#getSuppliers='' org.eclipse.uml2.DirectedRelationship#getTargets=''"
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
	 * @model opposite="implementation" required="true" volatile="true"
	 *        annotation="subsets org.eclipse.uml2.Dependency#getClients='' org.eclipse.uml2.DirectedRelationship#getSources=''"
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

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model parameters=""
	 *        annotation="feature eOpposite.containment='false' containment='false' name='client' eOpposite='clientDependency' derived='false' eOpposite.upperBound='-1' eType='org.eclipse.uml2.NamedElement' eOpposite.lowerBound='0'" 
	 * @generated
	 */
	EList getClients();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model parameters=""
	 *        annotation="feature derived='true' name='source' eType='org.eclipse.uml2.Element' containment='false'" 
	 * @generated
	 */
	EList getSources();

} // Implementation
