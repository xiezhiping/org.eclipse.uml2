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
 * $Id: Realization.java,v 1.5 2005/04/04 20:11:16 khussey Exp $
 */
package org.eclipse.uml2;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Realization</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * In the metamodel, a Realization is a subtype of Dependencies::Realization. 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2.Realization#getAbstraction <em>Abstraction</em>}</li>
 *   <li>{@link org.eclipse.uml2.Realization#getRealizingClassifier <em>Realizing Classifier</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.uml2.UML2Package#getRealization()
 * @model
 * @generated
 */
public interface Realization extends Abstraction{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) 2003, 2005 IBM Corporation and others."; //$NON-NLS-1$

	/**
	 * Returns the value of the '<em><b>Abstraction</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.uml2.Component#getRealizations <em>Realization</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Abstraction</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstraction</em>' container reference.
	 * @see #setAbstraction(Component)
	 * @see org.eclipse.uml2.UML2Package#getRealization_Abstraction()
	 * @see org.eclipse.uml2.Component#getRealizations
	 * @model opposite="realization" volatile="true"
	 *        annotation="subsets org.eclipse.uml2.DirectedRelationship#getSources='' org.eclipse.uml2.Element#getOwner='' org.eclipse.uml2.Dependency#getClients=''"
	 * @generated
	 */
	Component getAbstraction();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.Realization#getAbstraction <em>Abstraction</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Abstraction</em>' container reference.
	 * @see #getAbstraction()
	 * @generated
	 */
	void setAbstraction(Component value);

	/**
	 * Returns the value of the '<em><b>Realizing Classifier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Realizing Classifier</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Realizing Classifier</em>' reference.
	 * @see #setRealizingClassifier(Classifier)
	 * @see org.eclipse.uml2.UML2Package#getRealization_RealizingClassifier()
	 * @model required="true" volatile="true"
	 *        annotation="subsets org.eclipse.uml2.Dependency#getSuppliers='' org.eclipse.uml2.DirectedRelationship#getTargets=''"
	 * @generated
	 */
	Classifier getRealizingClassifier();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.Realization#getRealizingClassifier <em>Realizing Classifier</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Realizing Classifier</em>' reference.
	 * @see #getRealizingClassifier()
	 * @generated
	 */
	void setRealizingClassifier(Classifier value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model parameters=""
	 *        annotation="feature derived='true' name='source' eType='org.eclipse.uml2.Element' containment='false'" 
	 * @generated
	 */
	EList getSources();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model parameters=""
	 *        annotation="feature eOpposite.containment='false' containment='false' name='owner' eOpposite='ownedElement' derived='true' eOpposite.upperBound='-1' eType='org.eclipse.uml2.Element' eOpposite.lowerBound='0'" 
	 * @generated
	 */
	Element getOwner();

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

} // Realization
