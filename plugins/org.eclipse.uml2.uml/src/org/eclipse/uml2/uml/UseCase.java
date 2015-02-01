/*
 * Copyright (c) 2005, 2015 IBM Corporation, CEA, and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *   Kenn Hussey (CEA) - 327039, 418466, 451350
 *   Christian W. Damus (CEA) - 251963
 *
 */
package org.eclipse.uml2.uml;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Use Case</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A UseCase specifies a set of actions performed by its subjects, which yields an observable result that is of value for one or more Actors or other stakeholders of each subject.
 * <p>From package UML::UseCases.</p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.UseCase#getExtends <em>Extend</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.UseCase#getExtensionPoints <em>Extension Point</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.UseCase#getIncludes <em>Include</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.UseCase#getSubjects <em>Subject</em>}</li>
 * </ul>
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
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.eclipse.uml2.uml.Namespace#getOwnedMembers() <em>Owned Member</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Include relationships owned by this UseCase.
	 * <p>From package UML::UseCases.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Include</em>' containment reference list.
	 * @see org.eclipse.uml2.uml.UMLPackage#getUseCase_Include()
	 * @see org.eclipse.uml2.uml.Include#getIncludingCase
	 * @model opposite="includingCase" containment="true" resolveProxies="true" ordered="false"
	 * @generated
	 */
	EList<Include> getIncludes();

	/**
	 * Creates a new {@link org.eclipse.uml2.uml.Include}, with the specified '<em><b>Name</b></em>', and '<em><b>Addition</b></em>', and appends it to the '<em><b>Include</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' for the new {@link org.eclipse.uml2.uml.Include}, or <code>null</code>.
	 * @param addition The '<em><b>Addition</b></em>' for the new {@link org.eclipse.uml2.uml.Include}, or <code>null</code>.
	 * @return The new {@link org.eclipse.uml2.uml.Include}.
	 * @see #getIncludes()
	 * @generated
	 */
	Include createInclude(String name, UseCase addition);

	/**
	 * Retrieves the first {@link org.eclipse.uml2.uml.Include} with the specified '<em><b>Name</b></em>', and '<em><b>Addition</b></em>' from the '<em><b>Include</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.Include} to retrieve, or <code>null</code>.
	 * @param addition The '<em><b>Addition</b></em>' of the {@link org.eclipse.uml2.uml.Include} to retrieve, or <code>null</code>.
	 * @return The first {@link org.eclipse.uml2.uml.Include} with the specified '<em><b>Name</b></em>', and '<em><b>Addition</b></em>', or <code>null</code>.
	 * @see #getIncludes()
	 * @generated
	 */
	Include getInclude(String name, UseCase addition);

	/**
	 * Retrieves the first {@link org.eclipse.uml2.uml.Include} with the specified '<em><b>Name</b></em>', and '<em><b>Addition</b></em>' from the '<em><b>Include</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.Include} to retrieve, or <code>null</code>.
	 * @param addition The '<em><b>Addition</b></em>' of the {@link org.eclipse.uml2.uml.Include} to retrieve, or <code>null</code>.
	 * @param ignoreCase Whether to ignore case in {@link java.lang.String} comparisons.
	 * @param createOnDemand Whether to create a {@link org.eclipse.uml2.uml.Include} on demand if not found.
	 * @return The first {@link org.eclipse.uml2.uml.Include} with the specified '<em><b>Name</b></em>', and '<em><b>Addition</b></em>', or <code>null</code>.
	 * @see #getIncludes()
	 * @generated
	 */
	Include getInclude(String name, UseCase addition, boolean ignoreCase,
			boolean createOnDemand);

	/**
	 * Returns the value of the '<em><b>Extend</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.Extend}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.uml2.uml.Extend#getExtension <em>Extension</em>}'.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.eclipse.uml2.uml.Namespace#getOwnedMembers() <em>Owned Member</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Extend relationships owned by this UseCase.
	 * <p>From package UML::UseCases.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Extend</em>' containment reference list.
	 * @see org.eclipse.uml2.uml.UMLPackage#getUseCase_Extend()
	 * @see org.eclipse.uml2.uml.Extend#getExtension
	 * @model opposite="extension" containment="true" resolveProxies="true" ordered="false"
	 * @generated
	 */
	EList<Extend> getExtends();

	/**
	 * Creates a new {@link org.eclipse.uml2.uml.Extend}, with the specified '<em><b>Name</b></em>', and '<em><b>Extended Case</b></em>', and appends it to the '<em><b>Extend</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' for the new {@link org.eclipse.uml2.uml.Extend}, or <code>null</code>.
	 * @param extendedCase The '<em><b>Extended Case</b></em>' for the new {@link org.eclipse.uml2.uml.Extend}, or <code>null</code>.
	 * @return The new {@link org.eclipse.uml2.uml.Extend}.
	 * @see #getExtends()
	 * @generated
	 */
	Extend createExtend(String name, UseCase extendedCase);

	/**
	 * Retrieves the first {@link org.eclipse.uml2.uml.Extend} with the specified '<em><b>Name</b></em>', and '<em><b>Extended Case</b></em>' from the '<em><b>Extend</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.Extend} to retrieve, or <code>null</code>.
	 * @param extendedCase The '<em><b>Extended Case</b></em>' of the {@link org.eclipse.uml2.uml.Extend} to retrieve, or <code>null</code>.
	 * @return The first {@link org.eclipse.uml2.uml.Extend} with the specified '<em><b>Name</b></em>', and '<em><b>Extended Case</b></em>', or <code>null</code>.
	 * @see #getExtends()
	 * @generated
	 */
	Extend getExtend(String name, UseCase extendedCase);

	/**
	 * Retrieves the first {@link org.eclipse.uml2.uml.Extend} with the specified '<em><b>Name</b></em>', and '<em><b>Extended Case</b></em>' from the '<em><b>Extend</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.Extend} to retrieve, or <code>null</code>.
	 * @param extendedCase The '<em><b>Extended Case</b></em>' of the {@link org.eclipse.uml2.uml.Extend} to retrieve, or <code>null</code>.
	 * @param ignoreCase Whether to ignore case in {@link java.lang.String} comparisons.
	 * @param createOnDemand Whether to create a {@link org.eclipse.uml2.uml.Extend} on demand if not found.
	 * @return The first {@link org.eclipse.uml2.uml.Extend} with the specified '<em><b>Name</b></em>', and '<em><b>Extended Case</b></em>', or <code>null</code>.
	 * @see #getExtends()
	 * @generated
	 */
	Extend getExtend(String name, UseCase extendedCase, boolean ignoreCase,
			boolean createOnDemand);

	/**
	 * Returns the value of the '<em><b>Extension Point</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.ExtensionPoint}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.uml2.uml.ExtensionPoint#getUseCase <em>Use Case</em>}'.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.eclipse.uml2.uml.Namespace#getOwnedMembers() <em>Owned Member</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The ExtensionPoints owned by this UseCase.
	 * <p>From package UML::UseCases.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Extension Point</em>' containment reference list.
	 * @see org.eclipse.uml2.uml.UMLPackage#getUseCase_ExtensionPoint()
	 * @see org.eclipse.uml2.uml.ExtensionPoint#getUseCase
	 * @model opposite="useCase" containment="true" resolveProxies="true" ordered="false"
	 * @generated
	 */
	EList<ExtensionPoint> getExtensionPoints();

	/**
	 * Creates a new {@link org.eclipse.uml2.uml.ExtensionPoint}, with the specified '<em><b>Name</b></em>', and appends it to the '<em><b>Extension Point</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' for the new {@link org.eclipse.uml2.uml.ExtensionPoint}, or <code>null</code>.
	 * @return The new {@link org.eclipse.uml2.uml.ExtensionPoint}.
	 * @see #getExtensionPoints()
	 * @generated
	 */
	ExtensionPoint createExtensionPoint(String name);

	/**
	 * Retrieves the first {@link org.eclipse.uml2.uml.ExtensionPoint} with the specified '<em><b>Name</b></em>' from the '<em><b>Extension Point</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.ExtensionPoint} to retrieve, or <code>null</code>.
	 * @return The first {@link org.eclipse.uml2.uml.ExtensionPoint} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getExtensionPoints()
	 * @generated
	 */
	ExtensionPoint getExtensionPoint(String name);

	/**
	 * Retrieves the first {@link org.eclipse.uml2.uml.ExtensionPoint} with the specified '<em><b>Name</b></em>' from the '<em><b>Extension Point</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.ExtensionPoint} to retrieve, or <code>null</code>.
	 * @param ignoreCase Whether to ignore case in {@link java.lang.String} comparisons.
	 * @param createOnDemand Whether to create a {@link org.eclipse.uml2.uml.ExtensionPoint} on demand if not found.
	 * @return The first {@link org.eclipse.uml2.uml.ExtensionPoint} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getExtensionPoints()
	 * @generated
	 */
	ExtensionPoint getExtensionPoint(String name, boolean ignoreCase,
			boolean createOnDemand);

	/**
	 * Returns the value of the '<em><b>Subject</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.Classifier}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.uml2.uml.Classifier#getUseCases <em>Use Case</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The subjects to which this UseCase applies. Each subject or its parts realize all the UseCases that apply to it.
	 * <p>From package UML::UseCases.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Subject</em>' reference list.
	 * @see org.eclipse.uml2.uml.UMLPackage#getUseCase_Subject()
	 * @see org.eclipse.uml2.uml.Classifier#getUseCases
	 * @model opposite="useCase" ordered="false"
	 * @generated
	 */
	EList<Classifier> getSubjects();

	/**
	 * Retrieves the first {@link org.eclipse.uml2.uml.Classifier} with the specified '<em><b>Name</b></em>' from the '<em><b>Subject</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.Classifier} to retrieve, or <code>null</code>.
	 * @return The first {@link org.eclipse.uml2.uml.Classifier} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getSubjects()
	 * @generated
	 */
	Classifier getSubject(String name);

	/**
	 * Retrieves the first {@link org.eclipse.uml2.uml.Classifier} with the specified '<em><b>Name</b></em>' from the '<em><b>Subject</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.Classifier} to retrieve, or <code>null</code>.
	 * @param ignoreCase Whether to ignore case in {@link java.lang.String} comparisons.
	 * @param eClass The Ecore class of the {@link org.eclipse.uml2.uml.Classifier} to retrieve, or <code>null</code>.
	 * @return The first {@link org.eclipse.uml2.uml.Classifier} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getSubjects()
	 * @generated
	 */
	Classifier getSubject(String name, boolean ignoreCase, EClass eClass);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A UseCase must have a name.
	 * name -> notEmpty ()
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validateMustHaveName(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * UseCases can only be involved in binary Associations.
	 * Association.allInstances()->forAll(a | a.memberEnd.type->includes(self) implies a.memberEnd->size() = 2)
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validateBinaryAssociations(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * UseCases cannot have Associations to UseCases specifying the same subject.
	 * Association.allInstances()->forAll(a | a.memberEnd.type->includes(self) implies 
	 *    (
	 *    let usecases: Set(UseCase) = a.memberEnd.type->select(oclIsKindOf(UseCase))->collect(oclAsType(UseCase))->asSet() in
	 *    usecases->size() > 1 implies usecases->collect(subject)->size() > 1
	 *    )
	 * )
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validateNoAssociationToUseCase(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A UseCase cannot include UseCases that directly or indirectly include it.
	 * not allIncludedUseCases()->includes(self)
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validateCannotIncludeSelf(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The query allIncludedUseCases() returns the transitive closure of all UseCases (directly or indirectly) included by this UseCase.
	 * result = (self.include.addition->union(self.include.addition->collect(uc | uc.allIncludedUseCases()))->asSet())
	 * <p>From package UML::UseCases.</p>
	 * <!-- end-model-doc -->
	 * @model ordered="false"
	 * @generated
	 */
	EList<UseCase> allIncludedUseCases();

} // UseCase
