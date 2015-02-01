/*
 * Copyright (c) 2005, 2015 IBM Corporation, Embarcadero Technologies, CEA, and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *   Kenn Hussey (Embarcadero Technologies) - 205188
 *   Kenn Hussey (CEA) - 327039, 351774, 418466, 451350
 *   Christian W. Damus (CEA) - 251963, 269598
 *
 */
package org.eclipse.uml2.uml;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Class</b></em>'.
 * @extends OperationOwner
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A Class classifies a set of objects and specifies the features that characterize the structure and behavior of those objects.  A Class may have an internal structure and Ports.
 * <p>From package UML::StructuredClassifiers.</p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.Class#getOwnedOperations <em>Owned Operation</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Class#getExtensions <em>Extension</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Class#isActive <em>Is Active</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Class#getNestedClassifiers <em>Nested Classifier</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Class#getOwnedReceptions <em>Owned Reception</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Class#getSuperClasses <em>Super Class</em>}</li>
 * </ul>
 *
 * @see org.eclipse.uml2.uml.UMLPackage#getClass_()
 * @model
 * @generated
 */
public interface Class
		extends EncapsulatedClassifier, BehavioredClassifier, OperationOwner {

	/**
	 * Returns the value of the '<em><b>Owned Operation</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.Operation}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.uml2.uml.Operation#getClass_ <em>Class</em>}'.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.eclipse.uml2.uml.Classifier#getFeatures() <em>Feature</em>}'</li>
	 *   <li>'{@link org.eclipse.uml2.uml.Namespace#getOwnedMembers() <em>Owned Member</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Operations owned by the Class.
	 * <p>From package UML::StructuredClassifiers.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned Operation</em>' containment reference list.
	 * @see org.eclipse.uml2.uml.UMLPackage#getClass_OwnedOperation()
	 * @see org.eclipse.uml2.uml.Operation#getClass_
	 * @model opposite="class" containment="true" resolveProxies="true"
	 * @generated
	 */
	EList<Operation> getOwnedOperations();

	/**
	 * Creates a new {@link org.eclipse.uml2.uml.Operation}, with the specified '<em><b>Name</b></em>', '<em><b>Owned Parameter Names</b></em>', and '<em><b>Owned Parameter Types</b></em>', and appends it to the '<em><b>Owned Operation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' for the new {@link org.eclipse.uml2.uml.Operation}, or <code>null</code>.
	 * @param ownedParameterNames The '<em><b>Owned Parameter Names</b></em>' for the new {@link org.eclipse.uml2.uml.Operation}, or <code>null</code>.
	 * @param ownedParameterTypes The '<em><b>Owned Parameter Types</b></em>' for the new {@link org.eclipse.uml2.uml.Operation}, or <code>null</code>.
	 * @return The new {@link org.eclipse.uml2.uml.Operation}.
	 * @see #getOwnedOperations()
	 * @generated
	 */
	Operation createOwnedOperation(String name,
			EList<String> ownedParameterNames, EList<Type> ownedParameterTypes);

	/**
	 * Retrieves the first {@link org.eclipse.uml2.uml.Operation} with the specified '<em><b>Name</b></em>', '<em><b>Owned Parameter Names</b></em>', and '<em><b>Owned Parameter Types</b></em>' from the '<em><b>Owned Operation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.Operation} to retrieve, or <code>null</code>.
	 * @param ownedParameterNames The '<em><b>Owned Parameter Names</b></em>' of the {@link org.eclipse.uml2.uml.Operation} to retrieve, or <code>null</code>.
	 * @param ownedParameterTypes The '<em><b>Owned Parameter Types</b></em>' of the {@link org.eclipse.uml2.uml.Operation} to retrieve, or <code>null</code>.
	 * @return The first {@link org.eclipse.uml2.uml.Operation} with the specified '<em><b>Name</b></em>', '<em><b>Owned Parameter Names</b></em>', and '<em><b>Owned Parameter Types</b></em>', or <code>null</code>.
	 * @see #getOwnedOperations()
	 * @generated
	 */
	Operation getOwnedOperation(String name, EList<String> ownedParameterNames,
			EList<Type> ownedParameterTypes);

	/**
	 * Retrieves the first {@link org.eclipse.uml2.uml.Operation} with the specified '<em><b>Name</b></em>', '<em><b>Owned Parameter Names</b></em>', and '<em><b>Owned Parameter Types</b></em>' from the '<em><b>Owned Operation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.Operation} to retrieve, or <code>null</code>.
	 * @param ownedParameterNames The '<em><b>Owned Parameter Names</b></em>' of the {@link org.eclipse.uml2.uml.Operation} to retrieve, or <code>null</code>.
	 * @param ownedParameterTypes The '<em><b>Owned Parameter Types</b></em>' of the {@link org.eclipse.uml2.uml.Operation} to retrieve, or <code>null</code>.
	 * @param ignoreCase Whether to ignore case in {@link java.lang.String} comparisons.
	 * @param createOnDemand Whether to create a {@link org.eclipse.uml2.uml.Operation} on demand if not found.
	 * @return The first {@link org.eclipse.uml2.uml.Operation} with the specified '<em><b>Name</b></em>', '<em><b>Owned Parameter Names</b></em>', and '<em><b>Owned Parameter Types</b></em>', or <code>null</code>.
	 * @see #getOwnedOperations()
	 * @generated
	 */
	Operation getOwnedOperation(String name, EList<String> ownedParameterNames,
			EList<Type> ownedParameterTypes, boolean ignoreCase,
			boolean createOnDemand);

	/**
	 * Returns the value of the '<em><b>Nested Classifier</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.Classifier}.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.eclipse.uml2.uml.Namespace#getOwnedMembers() <em>Owned Member</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Classifiers owned by the Class that are not ownedBehaviors.
	 * <p>From package UML::StructuredClassifiers.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Nested Classifier</em>' containment reference list.
	 * @see org.eclipse.uml2.uml.UMLPackage#getClass_NestedClassifier()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	EList<Classifier> getNestedClassifiers();

	/**
	 * Creates a new {@link org.eclipse.uml2.uml.Classifier}, with the specified '<em><b>Name</b></em>', and appends it to the '<em><b>Nested Classifier</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' for the new {@link org.eclipse.uml2.uml.Classifier}, or <code>null</code>.
	 * @param eClass The Ecore class of the {@link org.eclipse.uml2.uml.Classifier} to create.
	 * @return The new {@link org.eclipse.uml2.uml.Classifier}.
	 * @see #getNestedClassifiers()
	 * @generated
	 */
	Classifier createNestedClassifier(String name, EClass eClass);

	/**
	 * Retrieves the first {@link org.eclipse.uml2.uml.Classifier} with the specified '<em><b>Name</b></em>' from the '<em><b>Nested Classifier</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.Classifier} to retrieve, or <code>null</code>.
	 * @return The first {@link org.eclipse.uml2.uml.Classifier} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getNestedClassifiers()
	 * @generated
	 */
	Classifier getNestedClassifier(String name);

	/**
	 * Retrieves the first {@link org.eclipse.uml2.uml.Classifier} with the specified '<em><b>Name</b></em>' from the '<em><b>Nested Classifier</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.Classifier} to retrieve, or <code>null</code>.
	 * @param ignoreCase Whether to ignore case in {@link java.lang.String} comparisons.
	 * @param eClass The Ecore class of the {@link org.eclipse.uml2.uml.Classifier} to retrieve, or <code>null</code>.
	 * @param createOnDemand Whether to create a {@link org.eclipse.uml2.uml.Classifier} on demand if not found.
	 * @return The first {@link org.eclipse.uml2.uml.Classifier} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getNestedClassifiers()
	 * @generated
	 */
	Classifier getNestedClassifier(String name, boolean ignoreCase,
			EClass eClass, boolean createOnDemand);

	/**
	 * Returns the value of the '<em><b>Super Class</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.Class}.
	 * <p>
	 * This feature redefines the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.eclipse.uml2.uml.Classifier#getGenerals() <em>General</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The superclasses of a Class, derived from its Generalizations.
	 * <p>From package UML::StructuredClassifiers.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Super Class</em>' reference list.
	 * @see org.eclipse.uml2.uml.UMLPackage#getClass_SuperClass()
	 * @model transient="true" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	EList<Class> getSuperClasses();

	/**
	 * Retrieves the first {@link org.eclipse.uml2.uml.Class} with the specified '<em><b>Name</b></em>' from the '<em><b>Super Class</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.Class} to retrieve, or <code>null</code>.
	 * @return The first {@link org.eclipse.uml2.uml.Class} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getSuperClasses()
	 * @generated
	 */
	Class getSuperClass(String name);

	/**
	 * Retrieves the first {@link org.eclipse.uml2.uml.Class} with the specified '<em><b>Name</b></em>' from the '<em><b>Super Class</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.Class} to retrieve, or <code>null</code>.
	 * @param ignoreCase Whether to ignore case in {@link java.lang.String} comparisons.
	 * @param eClass The Ecore class of the {@link org.eclipse.uml2.uml.Class} to retrieve, or <code>null</code>.
	 * @return The first {@link org.eclipse.uml2.uml.Class} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getSuperClasses()
	 * @generated
	 */
	Class getSuperClass(String name, boolean ignoreCase, EClass eClass);

	/**
	 * Returns the value of the '<em><b>Is Active</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Determines whether an object specified by this Class is active or not. If true, then the owning Class is referred to as an active Class. If false, then such a Class is referred to as a passive Class.
	 * <p>From package UML::StructuredClassifiers.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Active</em>' attribute.
	 * @see #setIsActive(boolean)
	 * @see org.eclipse.uml2.uml.UMLPackage#getClass_IsActive()
	 * @model default="false" dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isActive();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.uml.Class#isActive <em>Is Active</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Active</em>' attribute.
	 * @see #isActive()
	 * @generated
	 */
	void setIsActive(boolean value);

	/**
	 * Returns the value of the '<em><b>Owned Reception</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.Reception}.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.eclipse.uml2.uml.Classifier#getFeatures() <em>Feature</em>}'</li>
	 *   <li>'{@link org.eclipse.uml2.uml.Namespace#getOwnedMembers() <em>Owned Member</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Receptions owned by the Class.
	 * <p>From package UML::StructuredClassifiers.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned Reception</em>' containment reference list.
	 * @see org.eclipse.uml2.uml.UMLPackage#getClass_OwnedReception()
	 * @model containment="true" resolveProxies="true" ordered="false"
	 * @generated
	 */
	EList<Reception> getOwnedReceptions();

	/**
	 * Creates a new {@link org.eclipse.uml2.uml.Reception}, with the specified '<em><b>Name</b></em>', '<em><b>Owned Parameter Names</b></em>', and '<em><b>Owned Parameter Types</b></em>', and appends it to the '<em><b>Owned Reception</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' for the new {@link org.eclipse.uml2.uml.Reception}, or <code>null</code>.
	 * @param ownedParameterNames The '<em><b>Owned Parameter Names</b></em>' for the new {@link org.eclipse.uml2.uml.Reception}, or <code>null</code>.
	 * @param ownedParameterTypes The '<em><b>Owned Parameter Types</b></em>' for the new {@link org.eclipse.uml2.uml.Reception}, or <code>null</code>.
	 * @return The new {@link org.eclipse.uml2.uml.Reception}.
	 * @see #getOwnedReceptions()
	 * @generated
	 */
	Reception createOwnedReception(String name,
			EList<String> ownedParameterNames, EList<Type> ownedParameterTypes);

	/**
	 * Retrieves the first {@link org.eclipse.uml2.uml.Reception} with the specified '<em><b>Name</b></em>', '<em><b>Owned Parameter Names</b></em>', and '<em><b>Owned Parameter Types</b></em>' from the '<em><b>Owned Reception</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.Reception} to retrieve, or <code>null</code>.
	 * @param ownedParameterNames The '<em><b>Owned Parameter Names</b></em>' of the {@link org.eclipse.uml2.uml.Reception} to retrieve, or <code>null</code>.
	 * @param ownedParameterTypes The '<em><b>Owned Parameter Types</b></em>' of the {@link org.eclipse.uml2.uml.Reception} to retrieve, or <code>null</code>.
	 * @return The first {@link org.eclipse.uml2.uml.Reception} with the specified '<em><b>Name</b></em>', '<em><b>Owned Parameter Names</b></em>', and '<em><b>Owned Parameter Types</b></em>', or <code>null</code>.
	 * @see #getOwnedReceptions()
	 * @generated
	 */
	Reception getOwnedReception(String name, EList<String> ownedParameterNames,
			EList<Type> ownedParameterTypes);

	/**
	 * Retrieves the first {@link org.eclipse.uml2.uml.Reception} with the specified '<em><b>Name</b></em>', '<em><b>Owned Parameter Names</b></em>', and '<em><b>Owned Parameter Types</b></em>' from the '<em><b>Owned Reception</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.Reception} to retrieve, or <code>null</code>.
	 * @param ownedParameterNames The '<em><b>Owned Parameter Names</b></em>' of the {@link org.eclipse.uml2.uml.Reception} to retrieve, or <code>null</code>.
	 * @param ownedParameterTypes The '<em><b>Owned Parameter Types</b></em>' of the {@link org.eclipse.uml2.uml.Reception} to retrieve, or <code>null</code>.
	 * @param ignoreCase Whether to ignore case in {@link java.lang.String} comparisons.
	 * @param createOnDemand Whether to create a {@link org.eclipse.uml2.uml.Reception} on demand if not found.
	 * @return The first {@link org.eclipse.uml2.uml.Reception} with the specified '<em><b>Name</b></em>', '<em><b>Owned Parameter Names</b></em>', and '<em><b>Owned Parameter Types</b></em>', or <code>null</code>.
	 * @see #getOwnedReceptions()
	 * @generated
	 */
	Reception getOwnedReception(String name, EList<String> ownedParameterNames,
			EList<Type> ownedParameterTypes, boolean ignoreCase,
			boolean createOnDemand);

	/**
	 * Returns the value of the '<em><b>Extension</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.Extension}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.uml2.uml.Extension#getMetaclass <em>Metaclass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This property is used when the Class is acting as a metaclass. It references the Extensions that specify additional properties of the metaclass. The property is derived from the Extensions whose memberEnds are typed by the Class.
	 * <p>From package UML::StructuredClassifiers.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Extension</em>' reference list.
	 * @see org.eclipse.uml2.uml.UMLPackage#getClass_Extension()
	 * @see org.eclipse.uml2.uml.Extension#getMetaclass
	 * @model opposite="metaclass" transient="true" changeable="false" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	EList<Extension> getExtensions();

	/**
	 * Retrieves the first {@link org.eclipse.uml2.uml.Extension} with the specified '<em><b>Name</b></em>' from the '<em><b>Extension</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.Extension} to retrieve, or <code>null</code>.
	 * @return The first {@link org.eclipse.uml2.uml.Extension} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getExtensions()
	 * @generated
	 */
	Extension getExtension(String name);

	/**
	 * Retrieves the first {@link org.eclipse.uml2.uml.Extension} with the specified '<em><b>Name</b></em>' from the '<em><b>Extension</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.Extension} to retrieve, or <code>null</code>.
	 * @param ignoreCase Whether to ignore case in {@link java.lang.String} comparisons.
	 * @return The first {@link org.eclipse.uml2.uml.Extension} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getExtensions()
	 * @generated
	 */
	Extension getExtension(String name, boolean ignoreCase);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Only an active Class may own Receptions and have a classifierBehavior.
	 * not isActive implies (ownedReception->isEmpty() and classifierBehavior = null)
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validatePassiveClass(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Creates an operation with the specified name, parameter names, parameter types, and return type (or null) as an owned operation of this class.
	 * @param name The name for the new operation, or null.
	 * @param parameterNames The parameter names for the new operation, or null.
	 * @param parameterTypes The parameter types for the new operation, or null.
	 * @param returnType The return type for the new operation, or null.
	 * <!-- end-model-doc -->
	 * @model required="true" ordered="false" nameDataType="org.eclipse.uml2.types.String" nameOrdered="false" parameterNamesDataType="org.eclipse.uml2.types.String" parameterNamesMany="true" parameterNamesOrdered="false" parameterTypesMany="true" parameterTypesOrdered="false" returnTypeOrdered="false"
	 * @generated
	 */
	Operation createOwnedOperation(String name, EList<String> parameterNames,
			EList<Type> parameterTypes, Type returnType);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Determines whether this class is a metaclass.
	 * <!-- end-model-doc -->
	 * @model kind="operation" dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isMetaclass();

} // Class
