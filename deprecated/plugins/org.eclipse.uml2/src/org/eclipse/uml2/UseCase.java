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
 * $Id: UseCase.java,v 1.8 2005/04/04 20:11:15 khussey Exp $
 */
package org.eclipse.uml2;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Use Case</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A UseCase is a kind of behaviored classifier that represents a declaration of an offered behavior. Each use case specifies some behavior, possibly including variants, that the subject can perform in collaboration with one or more actors. Use cases define the offered behavior of the subject without reference to its internal structure. These behaviors, involving interactions between the actor and the subject, may result in changes to the state of the subject and communications with its environment. A use case can include possible variations of its basic behavior, including exceptional behavior and error handling. The subject of a use case could be a physical system or any other element that may have behavior, such as a component, subsystem or class. Each use case specifies a unit of useful functionality that the subject provides to its users, i.e., a specific way of interacting with the subject. This functionality, which is initiated by an actor, must always be completed for the use case to complete. It is deemed complete if, after its execution, the subject will be in a state in which no further inputs or actions are expected and the use case can be initiated again or in an error state. Use cases can be used both for specification of the (external) requirements on a subject and for the specification of the functionality offered by a subject. Moreover, the use cases also state the requirements the specified subject poses on its environment by defining how they should interact with the subject so that it will be able to perform its services. The behavior of a use case can be described by a specification that is some kind of Behavior (through its ownedBehavior relationship), such as interactions, activities, and state machines, or by pre-conditions and post-conditions as well as by natural language text where appropriate. It may also be described indirectly through a Collaboration that uses the use case and its actors as the classifiers that type its parts. Which of these techniques to use depends on the nature of the use case behavior as well as on the intended reader. These descriptions can be combined. 
 * <!-- end-model-doc -->
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
	String copyright = "Copyright (c) 2003, 2005 IBM Corporation and others."; //$NON-NLS-1$

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
	 *        annotation="subsets org.eclipse.uml2.Namespace#getOwnedMembers=''"
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
	 *        annotation="subsets org.eclipse.uml2.Namespace#getOwnedMembers=''"
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
	 *        annotation="subsets org.eclipse.uml2.Namespace#getOwnedMembers=''"
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
	 * It is bidirectional and its opposite is '{@link org.eclipse.uml2.Classifier#getUseCases <em>Use Case</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subject</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subject</em>' reference list.
	 * @see org.eclipse.uml2.UML2Package#getUseCase_Subject()
	 * @see org.eclipse.uml2.Classifier#getUseCases
	 * @model type="org.eclipse.uml2.Classifier" opposite="useCase" ordered="false"
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
	 *        annotation="feature eOpposite.containment='false' containment='false' name='ownedMember' eOpposite='namespace' derived='true' eOpposite.upperBound='1' eType='org.eclipse.uml2.NamedElement' eOpposite.lowerBound='0'" 
	 * @generated
	 */
	EList getOwnedMembers();

} // UseCase
