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
 * $Id: StructuredClassifier.java,v 1.7 2005/04/04 20:11:15 khussey Exp $
 */
package org.eclipse.uml2;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Structured Classifier</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A structured classifier is an abstract metaclass that represents any classifier whose behavior can be fully or partly described by the collaboration of owned or referenced instances. 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2.StructuredClassifier#getOwnedAttributes <em>Owned Attribute</em>}</li>
 *   <li>{@link org.eclipse.uml2.StructuredClassifier#getParts <em>Part</em>}</li>
 *   <li>{@link org.eclipse.uml2.StructuredClassifier#getRoles <em>Role</em>}</li>
 *   <li>{@link org.eclipse.uml2.StructuredClassifier#getOwnedConnectors <em>Owned Connector</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.uml2.UML2Package#getStructuredClassifier()
 * @model abstract="true"
 * @generated
 */
public interface StructuredClassifier extends Classifier{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) 2003, 2005 IBM Corporation and others."; //$NON-NLS-1$

	/**
	 * Returns the value of the '<em><b>Owned Attribute</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2.Property}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Attribute</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * References the properties owned by the classifier. (Subsets StructuredClassifier.role, Classifier. attribute,and Namespace.ownedMember)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned Attribute</em>' containment reference list.
	 * @see org.eclipse.uml2.UML2Package#getStructuredClassifier_OwnedAttribute()
	 * @model type="org.eclipse.uml2.Property" containment="true" volatile="true" ordered="false"
	 *        annotation="subsets org.eclipse.uml2.StructuredClassifier#getRoles='' org.eclipse.uml2.Classifier#getAttributes='' org.eclipse.uml2.Namespace#getOwnedMembers=''"
	 * @generated
	 */
	EList getOwnedAttributes();

    /**
     * Retrieves the {@link org.eclipse.uml2.Property} with the specified name from the '<em><b>Owned Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param unqualifiedName The unqualified name of the {@link org.eclipse.uml2.Property} to retrieve.
	 * @return The {@link org.eclipse.uml2.Property} with the specified name, or <code>null</code>.
	 * @see #getOwnedAttributes()
	 * @generated
     */
    Property getOwnedAttribute(String unqualifiedName);
      
    /**
     * Creates a {@link org.eclipse.uml2.Property} and appends it to the '<em><b>Owned Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param eClass The Ecore class of the {@link org.eclipse.uml2.Property} to create.
	 * @return The new {@link org.eclipse.uml2.Property}.
	 * @see #getOwnedAttributes()
	 * @generated
     */
    Property createOwnedAttribute(EClass eClass);

	/**
	 * Returns the value of the '<em><b>Part</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.Property}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Part</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * References the properties specifying instances that the classifier owns by composition. This association is derived, selecting those owned properties where isComposite is true.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Part</em>' reference list.
	 * @see org.eclipse.uml2.UML2Package#getStructuredClassifier_Part()
	 * @model type="org.eclipse.uml2.Property" transient="true" changeable="false" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	EList getParts();

    /**
     * Retrieves the {@link org.eclipse.uml2.Property} with the specified name from the '<em><b>Part</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param unqualifiedName The unqualified name of the {@link org.eclipse.uml2.Property} to retrieve.
	 * @return The {@link org.eclipse.uml2.Property} with the specified name, or <code>null</code>.
	 * @see #getParts()
	 * @generated
     */
    Property getPart(String unqualifiedName);
      
	/**
	 * Returns the value of the '<em><b>Role</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.ConnectableElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Role</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * References the roles that instances may play in this classifier. (Abstract union; subsets Classifier.feature.)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Role</em>' reference list.
	 * @see org.eclipse.uml2.UML2Package#getStructuredClassifier_Role()
	 * @model type="org.eclipse.uml2.ConnectableElement" transient="true" changeable="false" volatile="true" derived="true" ordered="false"
	 *        annotation="subsets org.eclipse.uml2.Namespace#getMembers=''"
	 * @generated
	 */
	EList getRoles();

    /**
     * Retrieves the {@link org.eclipse.uml2.ConnectableElement} with the specified name from the '<em><b>Role</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param unqualifiedName The unqualified name of the {@link org.eclipse.uml2.ConnectableElement} to retrieve.
	 * @return The {@link org.eclipse.uml2.ConnectableElement} with the specified name, or <code>null</code>.
	 * @see #getRoles()
	 * @generated
     */
    ConnectableElement getRole(String unqualifiedName);
      
	/**
	 * Returns the value of the '<em><b>Owned Connector</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2.Connector}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Connector</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * References the connectors owned by the classifier. (Subsets Classifier.feature and Namespace.ownedMember)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned Connector</em>' containment reference list.
	 * @see org.eclipse.uml2.UML2Package#getStructuredClassifier_OwnedConnector()
	 * @model type="org.eclipse.uml2.Connector" containment="true" ordered="false"
	 *        annotation="subsets org.eclipse.uml2.Classifier#getFeatures='' org.eclipse.uml2.Namespace#getOwnedMembers=''"
	 * @generated
	 */
	EList getOwnedConnectors();

    /**
     * Retrieves the {@link org.eclipse.uml2.Connector} with the specified name from the '<em><b>Owned Connector</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param unqualifiedName The unqualified name of the {@link org.eclipse.uml2.Connector} to retrieve.
	 * @return The {@link org.eclipse.uml2.Connector} with the specified name, or <code>null</code>.
	 * @see #getOwnedConnectors()
	 * @generated
     */
    Connector getOwnedConnector(String unqualifiedName);
      
    /**
     * Creates a {@link org.eclipse.uml2.Connector} and appends it to the '<em><b>Owned Connector</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param eClass The Ecore class of the {@link org.eclipse.uml2.Connector} to create.
	 * @return The new {@link org.eclipse.uml2.Connector}.
	 * @see #getOwnedConnectors()
	 * @generated
     */
    Connector createOwnedConnector(EClass eClass);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model parameters=""
	 *        annotation="feature derived='true' name='attribute' eType='org.eclipse.uml2.Property' containment='false'" 
	 * @generated
	 */
	EList getAttributes();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model parameters=""
	 *        annotation="feature eOpposite.containment='false' containment='false' name='ownedMember' eOpposite='namespace' derived='true' eOpposite.upperBound='1' eType='org.eclipse.uml2.NamedElement' eOpposite.lowerBound='0'" 
	 * @generated
	 */
	EList getOwnedMembers();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model parameters=""
	 *        annotation="feature derived='true' name='member' eType='org.eclipse.uml2.NamedElement' containment='false'" 
	 * @generated
	 */
	EList getMembers();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model parameters=""
	 *        annotation="feature eOpposite.containment='false' containment='false' name='feature' eOpposite='featuringClassifier' derived='true' eOpposite.upperBound='-1' eType='org.eclipse.uml2.Feature' eOpposite.lowerBound='0'" 
	 * @generated
	 */
	EList getFeatures();

} // StructuredClassifier
