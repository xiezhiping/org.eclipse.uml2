/*
 * Copyright (c) 2003, 2004 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Common Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/cpl-v10.html
 *
 * Contributors:
 *   IBM - Initial API and implementation
 */
package org.eclipse.uml2;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Artifact</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2.Artifact#getFileName <em>File Name</em>}</li>
 *   <li>{@link org.eclipse.uml2.Artifact#getNestedArtifacts <em>Nested Artifact</em>}</li>
 *   <li>{@link org.eclipse.uml2.Artifact#getManifestations <em>Manifestation</em>}</li>
 *   <li>{@link org.eclipse.uml2.Artifact#getOwnedOperations <em>Owned Operation</em>}</li>
 *   <li>{@link org.eclipse.uml2.Artifact#getOwnedAttributes <em>Owned Attribute</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.uml2.UML2Package#getArtifact()
 * @model 
 * @generated
 */
public interface Artifact extends Classifier, DeployedArtifact{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) 2003, 2004 IBM Corporation and others."; //$NON-NLS-1$

	/**
	 * Returns the value of the '<em><b>File Name</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>File Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>File Name</em>' attribute.
	 * @see #setFileName(String)
	 * @see org.eclipse.uml2.UML2Package#getArtifact_FileName()
	 * @model default="" dataType="org.eclipse.uml2.String"
	 * @generated
	 */
	String getFileName();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.Artifact#getFileName <em>File Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>File Name</em>' attribute.
	 * @see #getFileName()
	 * @generated
	 */
	void setFileName(String value);

	/**
	 * Returns the value of the '<em><b>Nested Artifact</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2.Artifact}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nested Artifact</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nested Artifact</em>' containment reference list.
	 * @see org.eclipse.uml2.UML2Package#getArtifact_NestedArtifact()
	 * @model type="org.eclipse.uml2.Artifact" containment="true"
	 * @generated
	 */
	EList getNestedArtifacts();

    /**
     * Retrieves the {@link org.eclipse.uml2.Artifact} with the specified name from the '<em><b>Nested Artifact</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param unqualifiedName The unqualified name of the {@link org.eclipse.uml2.Artifact} to retrieve.
	 * @return The {@link org.eclipse.uml2.Artifact} with the specified name, or <code>null</code>.
	 * @see #getNestedArtifacts()
	 * @generated
     */
    Artifact getNestedArtifact(String unqualifiedName);
      
    /**
     * Creates a {@link org.eclipse.uml2.Artifact} and appends it to the '<em><b>Nested Artifact</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param eClass The Ecore class of the {@link org.eclipse.uml2.Artifact} to create.
	 * @return The new {@link org.eclipse.uml2.Artifact}.
	 * @see #getNestedArtifacts()
	 * @generated
     */
    Artifact createNestedArtifact(EClass eClass);

	/**
	 * Returns the value of the '<em><b>Manifestation</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2.Manifestation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Manifestation</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Manifestation</em>' containment reference list.
	 * @see org.eclipse.uml2.UML2Package#getArtifact_Manifestation()
	 * @model type="org.eclipse.uml2.Manifestation" containment="true" volatile="true"
	 * @generated
	 */
	EList getManifestations();

    /**
     * Retrieves the {@link org.eclipse.uml2.Manifestation} with the specified name from the '<em><b>Manifestation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param unqualifiedName The unqualified name of the {@link org.eclipse.uml2.Manifestation} to retrieve.
	 * @return The {@link org.eclipse.uml2.Manifestation} with the specified name, or <code>null</code>.
	 * @see #getManifestations()
	 * @generated
     */
    Manifestation getManifestation(String unqualifiedName);
      
    /**
     * Creates a {@link org.eclipse.uml2.Manifestation} and appends it to the '<em><b>Manifestation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param eClass The Ecore class of the {@link org.eclipse.uml2.Manifestation} to create.
	 * @return The new {@link org.eclipse.uml2.Manifestation}.
	 * @see #getManifestations()
	 * @generated
     */
    Manifestation createManifestation(EClass eClass);

	/**
	 * Returns the value of the '<em><b>Owned Operation</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2.Operation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Operation</em>' containment reference list.
	 * @see org.eclipse.uml2.UML2Package#getArtifact_OwnedOperation()
	 * @model type="org.eclipse.uml2.Operation" containment="true"
	 * @generated
	 */
	EList getOwnedOperations();

    /**
     * Retrieves the {@link org.eclipse.uml2.Operation} with the specified name from the '<em><b>Owned Operation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param unqualifiedName The unqualified name of the {@link org.eclipse.uml2.Operation} to retrieve.
	 * @return The {@link org.eclipse.uml2.Operation} with the specified name, or <code>null</code>.
	 * @see #getOwnedOperations()
	 * @generated
     */
    Operation getOwnedOperation(String unqualifiedName);
      
    /**
     * Creates a {@link org.eclipse.uml2.Operation} and appends it to the '<em><b>Owned Operation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param eClass The Ecore class of the {@link org.eclipse.uml2.Operation} to create.
	 * @return The new {@link org.eclipse.uml2.Operation}.
	 * @see #getOwnedOperations()
	 * @generated
     */
    Operation createOwnedOperation(EClass eClass);

	/**
	 * Returns the value of the '<em><b>Owned Attribute</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2.Property}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Attribute</em>' containment reference list.
	 * @see org.eclipse.uml2.UML2Package#getArtifact_OwnedAttribute()
	 * @model type="org.eclipse.uml2.Property" containment="true"
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model parameters=""
	 * @generated
	 */
	EList getFeatures();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model parameters=""
	 * @generated
	 */
	EList getOwnedMembers();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model parameters=""
	 * @generated
	 */
	EList getAttributes();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model parameters=""
	 * @generated
	 */
	EList getOwnedElements();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model parameters=""
	 * @generated
	 */
	EList getClientDependencies();

} // Artifact
