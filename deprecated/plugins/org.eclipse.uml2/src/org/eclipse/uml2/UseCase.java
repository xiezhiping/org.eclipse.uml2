/*
 * Copyright (c) 2003, 2004 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Common Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/cpl-v10.html
 *
 * Contributors:
 *   IBM - Initial API and implementation
 *
 * $Id: UseCase.java,v 1.3 2004/05/11 15:24:00 khussey Exp $
 */
package org.eclipse.uml2;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Use Case</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2.UseCase#getIncludes <em>Include</em>}</li>
 *   <li>{@link org.eclipse.uml2.UseCase#getExtends <em>Extend</em>}</li>
 *   <li>{@link org.eclipse.uml2.UseCase#getExtensionPoints <em>Extension Point</em>}</li>
 *   <li>{@link org.eclipse.uml2.UseCase#getSubjects <em>Subject</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.uml2.UML2Package#getUseCase()
 * @model 
 * @generated
 */
public interface UseCase extends BehavioredClassifier{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) 2003, 2004 IBM Corporation and others."; //$NON-NLS-1$

	/**
	 * Returns the value of the '<em><b>Include</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2.Include}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.uml2.Include#getIncludingCase <em>Including Case</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Include</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Include</em>' containment reference list.
	 * @see org.eclipse.uml2.UML2Package#getUseCase_Include()
	 * @see org.eclipse.uml2.Include#getIncludingCase
	 * @model type="org.eclipse.uml2.Include" opposite="includingCase" containment="true" ordered="false"
	 * @generated
	 */
	EList getIncludes();

    /**
     * Retrieves the {@link org.eclipse.uml2.Include} with the specified name from the '<em><b>Include</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param unqualifiedName The unqualified name of the {@link org.eclipse.uml2.Include} to retrieve.
	 * @return The {@link org.eclipse.uml2.Include} with the specified name, or <code>null</code>.
	 * @see #getIncludes()
	 * @generated
     */
    Include getInclude(String unqualifiedName);
      
    /**
     * Creates a {@link org.eclipse.uml2.Include} and appends it to the '<em><b>Include</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param eClass The Ecore class of the {@link org.eclipse.uml2.Include} to create.
	 * @return The new {@link org.eclipse.uml2.Include}.
	 * @see #getIncludes()
	 * @generated
     */
    Include createInclude(EClass eClass);

	/**
	 * Returns the value of the '<em><b>Extend</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2.Extend}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.uml2.Extend#getExtension <em>Extension</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extend</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extend</em>' containment reference list.
	 * @see org.eclipse.uml2.UML2Package#getUseCase_Extend()
	 * @see org.eclipse.uml2.Extend#getExtension
	 * @model type="org.eclipse.uml2.Extend" opposite="extension" containment="true" ordered="false"
	 * @generated
	 */
	EList getExtends();

    /**
     * Retrieves the {@link org.eclipse.uml2.Extend} with the specified name from the '<em><b>Extend</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param unqualifiedName The unqualified name of the {@link org.eclipse.uml2.Extend} to retrieve.
	 * @return The {@link org.eclipse.uml2.Extend} with the specified name, or <code>null</code>.
	 * @see #getExtends()
	 * @generated
     */
    Extend getExtend(String unqualifiedName);
      
    /**
     * Creates a {@link org.eclipse.uml2.Extend} and appends it to the '<em><b>Extend</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param eClass The Ecore class of the {@link org.eclipse.uml2.Extend} to create.
	 * @return The new {@link org.eclipse.uml2.Extend}.
	 * @see #getExtends()
	 * @generated
     */
    Extend createExtend(EClass eClass);

	/**
	 * Returns the value of the '<em><b>Extension Point</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2.ExtensionPoint}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.uml2.ExtensionPoint#getUseCase <em>Use Case</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extension Point</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extension Point</em>' containment reference list.
	 * @see org.eclipse.uml2.UML2Package#getUseCase_ExtensionPoint()
	 * @see org.eclipse.uml2.ExtensionPoint#getUseCase
	 * @model type="org.eclipse.uml2.ExtensionPoint" opposite="useCase" containment="true" ordered="false"
	 * @generated
	 */
	EList getExtensionPoints();

    /**
     * Retrieves the {@link org.eclipse.uml2.ExtensionPoint} with the specified name from the '<em><b>Extension Point</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param unqualifiedName The unqualified name of the {@link org.eclipse.uml2.ExtensionPoint} to retrieve.
	 * @return The {@link org.eclipse.uml2.ExtensionPoint} with the specified name, or <code>null</code>.
	 * @see #getExtensionPoints()
	 * @generated
     */
    ExtensionPoint getExtensionPoint(String unqualifiedName);
      
    /**
     * Creates a {@link org.eclipse.uml2.ExtensionPoint} and appends it to the '<em><b>Extension Point</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param eClass The Ecore class of the {@link org.eclipse.uml2.ExtensionPoint} to create.
	 * @return The new {@link org.eclipse.uml2.ExtensionPoint}.
	 * @see #getExtensionPoints()
	 * @generated
     */
    ExtensionPoint createExtensionPoint(EClass eClass);

	/**
	 * Returns the value of the '<em><b>Subject</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.Classifier}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subject</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subject</em>' reference list.
	 * @see org.eclipse.uml2.UML2Package#getUseCase_Subject()
	 * @model type="org.eclipse.uml2.Classifier" ordered="false"
	 * @generated
	 */
	EList getSubjects();

    /**
     * Retrieves the {@link org.eclipse.uml2.Classifier} with the specified name from the '<em><b>Subject</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param unqualifiedName The unqualified name of the {@link org.eclipse.uml2.Classifier} to retrieve.
	 * @return The {@link org.eclipse.uml2.Classifier} with the specified name, or <code>null</code>.
	 * @see #getSubjects()
	 * @generated
     */
    Classifier getSubject(String unqualifiedName);
      
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model parameters=""
	 * @generated
	 */
	EList getOwnedMembers();

} // UseCase
