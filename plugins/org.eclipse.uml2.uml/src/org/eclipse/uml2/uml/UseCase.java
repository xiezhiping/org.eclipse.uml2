/*
 * Copyright (c) 2005 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *
 * $Id: UseCase.java,v 1.2 2005/12/14 22:34:16 khussey Exp $
 */
package org.eclipse.uml2.uml;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Use Case</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A UseCase is a kind of behaviored classifier that represents a declaration of an offered behavior. Each use case specifies some behavior, possibly including variants, that the subject can perform in collaboration with one or more actors. Use cases define the offered behavior of the subject without reference to its internal structure. These behaviors, involving
 * 
 * interactions between the actor and the subject, may result in changes to the state of the subject and communications with its environment. A use case can include possible variations of its basic behavior, including exceptional behavior and error handling.
 * 
 * 
 * 
 * The subject of a use case could be a physical system or any other element that may have behavior, such as a component, subsystem or class. Each use case specifies a unit of useful functionality that the subject provides to its users, i.e., a specific way of interacting with the subject. This functionality, which is initiated by an actor, must always be completed for the use case to complete. It is deemed complete if, after its execution, the subject will be in a state in which no further inputs or actions are expected and the use case can be initiated again or in an error state.
 * 
 * 
 * 
 * Use cases can be used both for specification of the (external) requirements on a subject and for the specification of the functionality offered by a subject. Moreover, the use cases also state the requirements the specified subject poses on its environment by defining how they should interact with the subject so that it will be able to perform its services.
 * 
 * 
 * 
 * The behavior of a use case can be described by a specification that is some kind of Behavior (through its ownedBehavior relationship), such as interactions, activities, and state machines, or by pre-conditions and post-conditions as well as by natural language text where appropriate. It may also be described indirectly through a Collaboration that uses the use case and its actors as the classifiers that type its parts. Which of these techniques to use depends on the nature of the use case behavior as well as on the intended reader. These descriptions can be combined.
 * 
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.UseCase#getIncludes <em>Include</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.UseCase#getExtends <em>Extend</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.UseCase#getExtensionPoints <em>Extension Point</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.UseCase#getSubjects <em>Subject</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.uml2.uml.UMLPackage#getUseCase()
 * @model
 * @generated
 */
public interface UseCase
		extends BehavioredClassifier {

	/**
	 * Returns the value of the '<em><b>Include</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.Include}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.uml2.uml.Include#getIncludingCase <em>Including Case</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * References the Include relationships owned by this use case.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Include</em>' containment reference list.
	 * @see org.eclipse.uml2.uml.UMLPackage#getUseCase_Include()
	 * @see org.eclipse.uml2.uml.Include#getIncludingCase
	 * @model type="org.eclipse.uml2.uml.Include" opposite="includingCase" containment="true" resolveProxies="false" ordered="false"
	 * @generated
	 */
	EList getIncludes();

	/**
	 * Creates a {@link org.eclipse.uml2.uml.Include} and appends it to the '<em><b>Include</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return The new {@link org.eclipse.uml2.uml.Include}.
	 * @see #getIncludes()
	 * @generated
	 */
	Include createInclude();

	/**
	 * Retrieves the {@link org.eclipse.uml2.uml.Include} with the specified '<em><b>Name</b></em>' from the '<em><b>Include</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.Include} to retrieve.
	 * @return The {@link org.eclipse.uml2.uml.Include} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getIncludes()
	 * @generated
	 */
	Include getInclude(String name);

	/**
	 * Returns the value of the '<em><b>Extend</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.Extend}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.uml2.uml.Extend#getExtension <em>Extension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * References the Extend relationships owned by this use case.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Extend</em>' containment reference list.
	 * @see org.eclipse.uml2.uml.UMLPackage#getUseCase_Extend()
	 * @see org.eclipse.uml2.uml.Extend#getExtension
	 * @model type="org.eclipse.uml2.uml.Extend" opposite="extension" containment="true" resolveProxies="false" ordered="false"
	 * @generated
	 */
	EList getExtends();

	/**
	 * Creates a {@link org.eclipse.uml2.uml.Extend} and appends it to the '<em><b>Extend</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return The new {@link org.eclipse.uml2.uml.Extend}.
	 * @see #getExtends()
	 * @generated
	 */
	Extend createExtend();

	/**
	 * Retrieves the {@link org.eclipse.uml2.uml.Extend} with the specified '<em><b>Name</b></em>' from the '<em><b>Extend</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.Extend} to retrieve.
	 * @return The {@link org.eclipse.uml2.uml.Extend} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getExtends()
	 * @generated
	 */
	Extend getExtend(String name);

	/**
	 * Returns the value of the '<em><b>Extension Point</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.ExtensionPoint}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.uml2.uml.ExtensionPoint#getUseCase <em>Use Case</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * References the ExtensionPoints owned by the use case.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Extension Point</em>' containment reference list.
	 * @see org.eclipse.uml2.uml.UMLPackage#getUseCase_ExtensionPoint()
	 * @see org.eclipse.uml2.uml.ExtensionPoint#getUseCase
	 * @model type="org.eclipse.uml2.uml.ExtensionPoint" opposite="useCase" containment="true" resolveProxies="false" ordered="false"
	 * @generated
	 */
	EList getExtensionPoints();

	/**
	 * Creates a {@link org.eclipse.uml2.uml.ExtensionPoint} and appends it to the '<em><b>Extension Point</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return The new {@link org.eclipse.uml2.uml.ExtensionPoint}.
	 * @see #getExtensionPoints()
	 * @generated
	 */
	ExtensionPoint createExtensionPoint();

	/**
	 * Retrieves the {@link org.eclipse.uml2.uml.ExtensionPoint} with the specified '<em><b>Name</b></em>' from the '<em><b>Extension Point</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.ExtensionPoint} to retrieve.
	 * @return The {@link org.eclipse.uml2.uml.ExtensionPoint} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getExtensionPoints()
	 * @generated
	 */
	ExtensionPoint getExtensionPoint(String name);

	/**
	 * Returns the value of the '<em><b>Subject</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.Classifier}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.uml2.uml.Classifier#getUseCases <em>Use Case</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * References the subjects to which this use case applies. The subject or its parts realize all the use cases that apply to this subject. Use cases need not be attached to any specific subject, however. The subject may, but need not, own the use cases that apply to it.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Subject</em>' reference list.
	 * @see org.eclipse.uml2.uml.UMLPackage#getUseCase_Subject()
	 * @see org.eclipse.uml2.uml.Classifier#getUseCases
	 * @model type="org.eclipse.uml2.uml.Classifier" opposite="useCase" ordered="false"
	 * @generated
	 */
	EList getSubjects();

	/**
	 * Retrieves the {@link org.eclipse.uml2.uml.Classifier} with the specified '<em><b>Name</b></em>' from the '<em><b>Subject</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.Classifier} to retrieve.
	 * @return The {@link org.eclipse.uml2.uml.Classifier} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getSubjects()
	 * @generated
	 */
	Classifier getSubject(String name);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A UseCase must have a name.
	 * self.name -> notEmpty ()
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validateMustHaveName(DiagnosticChain diagnostics, Map context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * UseCases can only be involved in binary Associations.
	 * true
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validateBinaryAssociations(DiagnosticChain diagnostics, Map context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * UseCases can not have Associations to UseCases specifying the same subject.
	 * true
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validateNoAssociationToUseCase(DiagnosticChain diagnostics,
			Map context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A use case cannot include use cases that directly or indirectly include it.
	 * not self.allIncludedUseCases()->includes(self)
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validateCannotIncludeSelf(DiagnosticChain diagnostics, Map context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The query allIncludedUseCases() returns the transitive closure of all use cases (directly or indirectly) included by this use case.
	 * result = self.include->union(self.include->collect(in | in.allIncludedUseCases()))
	 * <!-- end-model-doc -->
	 * @model type="org.eclipse.uml2.uml.UseCase" ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='spec'"
	 * @generated
	 */
	EList allIncludedUseCases();

} // UseCase
