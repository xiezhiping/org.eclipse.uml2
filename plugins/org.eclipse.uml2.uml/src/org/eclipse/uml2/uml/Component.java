/*
 * Copyright (c) 2005, 2016 IBM Corporation, CEA, and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *   Kenn Hussey (CEA) - 327039, 351774, 351777, 382718, 418466, 451350, 485756
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
 * A representation of the model object '<em><b>Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A Component represents a modular part of a system that encapsulates its contents and whose manifestation is replaceable within its environment.
 * <p>From package UML::StructuredClassifiers.</p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.Component#isIndirectlyInstantiated <em>Is Indirectly Instantiated</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Component#getPackagedElements <em>Packaged Element</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Component#getProvideds <em>Provided</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Component#getRealizations <em>Realization</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Component#getRequireds <em>Required</em>}</li>
 * </ul>
 *
 * @see org.eclipse.uml2.uml.UMLPackage#getComponent()
 * @model
 * @generated
 */
public interface Component
		extends org.eclipse.uml2.uml.Class {

	/**
	 * Returns the value of the '<em><b>Is Indirectly Instantiated</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If true, the Component is defined at design-time, but at run-time (or execution-time) an object specified by the Component does not exist, that is, the Component is instantiated indirectly, through the instantiation of its realizing Classifiers or parts.
	 * <p>From package UML::StructuredClassifiers.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Indirectly Instantiated</em>' attribute.
	 * @see #setIsIndirectlyInstantiated(boolean)
	 * @see org.eclipse.uml2.uml.UMLPackage#getComponent_IsIndirectlyInstantiated()
	 * @model default="true" dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isIndirectlyInstantiated();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.uml.Component#isIndirectlyInstantiated <em>Is Indirectly Instantiated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Indirectly Instantiated</em>' attribute.
	 * @see #isIndirectlyInstantiated()
	 * @generated
	 */
	void setIsIndirectlyInstantiated(boolean value);

	/**
	 * Returns the value of the '<em><b>Required</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.Interface}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Interfaces that the Component requires from other Components in its environment in order to be able to offer its full set of provided functionality. These Interfaces may be used by the Component or any of its realizingClassifiers, or they may be the Interfaces that are required by its public Ports.
	 * <p>From package UML::StructuredClassifiers.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Required</em>' reference list.
	 * @see org.eclipse.uml2.uml.UMLPackage#getComponent_Required()
	 * @model transient="true" changeable="false" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	EList<Interface> getRequireds();

	/**
	 * Retrieves the first {@link org.eclipse.uml2.uml.Interface} with the specified '<em><b>Name</b></em>' from the '<em><b>Required</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.Interface} to retrieve, or <code>null</code>.
	 * @return The first {@link org.eclipse.uml2.uml.Interface} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getRequireds()
	 * @generated
	 */
	Interface getRequired(String name);

	/**
	 * Retrieves the first {@link org.eclipse.uml2.uml.Interface} with the specified '<em><b>Name</b></em>' from the '<em><b>Required</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.Interface} to retrieve, or <code>null</code>.
	 * @param ignoreCase Whether to ignore case in {@link java.lang.String} comparisons.
	 * @return The first {@link org.eclipse.uml2.uml.Interface} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getRequireds()
	 * @generated
	 */
	Interface getRequired(String name, boolean ignoreCase);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A Component cannot nest Classifiers.
	 * nestedClassifier->isEmpty()
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validateNoNestedClassifiers(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A Component nested in a Class cannot have any packaged elements.
	 * nestingClass <> null implies packagedElement->isEmpty()
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validateNoPackagedElements(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * Returns the value of the '<em><b>Provided</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.Interface}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Interfaces that the Component exposes to its environment. These Interfaces may be Realized by the Component or any of its realizingClassifiers, or they may be the Interfaces that are provided by its public Ports.
	 * <p>From package UML::StructuredClassifiers.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Provided</em>' reference list.
	 * @see org.eclipse.uml2.uml.UMLPackage#getComponent_Provided()
	 * @model transient="true" changeable="false" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	EList<Interface> getProvideds();

	/**
	 * Retrieves the first {@link org.eclipse.uml2.uml.Interface} with the specified '<em><b>Name</b></em>' from the '<em><b>Provided</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.Interface} to retrieve, or <code>null</code>.
	 * @return The first {@link org.eclipse.uml2.uml.Interface} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getProvideds()
	 * @generated
	 */
	Interface getProvided(String name);

	/**
	 * Retrieves the first {@link org.eclipse.uml2.uml.Interface} with the specified '<em><b>Name</b></em>' from the '<em><b>Provided</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.Interface} to retrieve, or <code>null</code>.
	 * @param ignoreCase Whether to ignore case in {@link java.lang.String} comparisons.
	 * @return The first {@link org.eclipse.uml2.uml.Interface} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getProvideds()
	 * @generated
	 */
	Interface getProvided(String name, boolean ignoreCase);

	/**
	 * Returns the value of the '<em><b>Packaged Element</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.PackageableElement}.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.eclipse.uml2.uml.Namespace#getOwnedMembers() <em>Owned Member</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The set of PackageableElements that a Component owns. In the namespace of a Component, all model elements that are involved in or related to its definition may be owned or imported explicitly. These may include e.g., Classes, Interfaces, Components, Packages, UseCases, Dependencies (e.g., mappings), and Artifacts.
	 * <p>From package UML::StructuredClassifiers.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Packaged Element</em>' containment reference list.
	 * @see org.eclipse.uml2.uml.UMLPackage#getComponent_PackagedElement()
	 * @model containment="true" resolveProxies="true" ordered="false"
	 * @generated
	 */
	EList<PackageableElement> getPackagedElements();

	/**
	 * Creates a new {@link org.eclipse.uml2.uml.PackageableElement}, with the specified '<em><b>Name</b></em>', and appends it to the '<em><b>Packaged Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' for the new {@link org.eclipse.uml2.uml.PackageableElement}, or <code>null</code>.
	 * @param eClass The Ecore class of the {@link org.eclipse.uml2.uml.PackageableElement} to create.
	 * @return The new {@link org.eclipse.uml2.uml.PackageableElement}.
	 * @see #getPackagedElements()
	 * @generated
	 */
	PackageableElement createPackagedElement(String name, EClass eClass);

	/**
	 * Retrieves the first {@link org.eclipse.uml2.uml.PackageableElement} with the specified '<em><b>Name</b></em>' from the '<em><b>Packaged Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.PackageableElement} to retrieve, or <code>null</code>.
	 * @return The first {@link org.eclipse.uml2.uml.PackageableElement} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getPackagedElements()
	 * @generated
	 */
	PackageableElement getPackagedElement(String name);

	/**
	 * Retrieves the first {@link org.eclipse.uml2.uml.PackageableElement} with the specified '<em><b>Name</b></em>' from the '<em><b>Packaged Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.PackageableElement} to retrieve, or <code>null</code>.
	 * @param ignoreCase Whether to ignore case in {@link java.lang.String} comparisons.
	 * @param eClass The Ecore class of the {@link org.eclipse.uml2.uml.PackageableElement} to retrieve, or <code>null</code>.
	 * @param createOnDemand Whether to create a {@link org.eclipse.uml2.uml.PackageableElement} on demand if not found.
	 * @return The first {@link org.eclipse.uml2.uml.PackageableElement} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getPackagedElements()
	 * @generated
	 */
	PackageableElement getPackagedElement(String name, boolean ignoreCase,
			EClass eClass, boolean createOnDemand);

	/**
	 * Returns the value of the '<em><b>Realization</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.ComponentRealization}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.uml2.uml.ComponentRealization#getAbstraction <em>Abstraction</em>}'.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.eclipse.uml2.uml.Element#getOwnedElements() <em>Owned Element</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The set of Realizations owned by the Component. Realizations reference the Classifiers of which the Component is an abstraction; i.e., that realize its behavior.
	 * <p>From package UML::StructuredClassifiers.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Realization</em>' containment reference list.
	 * @see org.eclipse.uml2.uml.UMLPackage#getComponent_Realization()
	 * @see org.eclipse.uml2.uml.ComponentRealization#getAbstraction
	 * @model opposite="abstraction" containment="true" resolveProxies="true" ordered="false"
	 * @generated
	 */
	EList<ComponentRealization> getRealizations();

	/**
	 * Creates a new {@link org.eclipse.uml2.uml.ComponentRealization}, with the specified '<em><b>Name</b></em>', and appends it to the '<em><b>Realization</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' for the new {@link org.eclipse.uml2.uml.ComponentRealization}, or <code>null</code>.
	 * @return The new {@link org.eclipse.uml2.uml.ComponentRealization}.
	 * @see #getRealizations()
	 * @generated
	 */
	ComponentRealization createRealization(String name);

	/**
	 * Retrieves the first {@link org.eclipse.uml2.uml.ComponentRealization} with the specified '<em><b>Name</b></em>' from the '<em><b>Realization</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.ComponentRealization} to retrieve, or <code>null</code>.
	 * @return The first {@link org.eclipse.uml2.uml.ComponentRealization} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getRealizations()
	 * @generated
	 */
	ComponentRealization getRealization(String name);

	/**
	 * Retrieves the first {@link org.eclipse.uml2.uml.ComponentRealization} with the specified '<em><b>Name</b></em>' from the '<em><b>Realization</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.ComponentRealization} to retrieve, or <code>null</code>.
	 * @param ignoreCase Whether to ignore case in {@link java.lang.String} comparisons.
	 * @param createOnDemand Whether to create a {@link org.eclipse.uml2.uml.ComponentRealization} on demand if not found.
	 * @return The first {@link org.eclipse.uml2.uml.ComponentRealization} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getRealizations()
	 * @generated
	 */
	ComponentRealization getRealization(String name, boolean ignoreCase,
			boolean createOnDemand);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Creates a(n) (abstract) class with the specified name as a packaged element of this component.
	 * @param name The name for the new class, or null.
	 * @param isAbstract Whether the new class should be abstract.
	 * <!-- end-model-doc -->
	 * @model required="true" ordered="false" nameDataType="org.eclipse.uml2.types.String" nameRequired="true" nameOrdered="false" isAbstractDataType="org.eclipse.uml2.types.Boolean" isAbstractRequired="true" isAbstractOrdered="false"
	 * @generated
	 */
	org.eclipse.uml2.uml.Class createOwnedClass(String name,
			boolean isAbstract);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Creates a enumeration with the specified name as a packaged element of this component.
	 * @param name The name for the new enumeration, or null.
	 * <!-- end-model-doc -->
	 * @model required="true" ordered="false" nameDataType="org.eclipse.uml2.types.String" nameRequired="true" nameOrdered="false"
	 * @generated
	 */
	Enumeration createOwnedEnumeration(String name);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Creates a primitive type with the specified name as a packaged element of this component.
	 * @param name The name for the new primitive type, or null.
	 * <!-- end-model-doc -->
	 * @model required="true" ordered="false" nameDataType="org.eclipse.uml2.types.String" nameRequired="true" nameOrdered="false"
	 * @generated
	 */
	PrimitiveType createOwnedPrimitiveType(String name);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Creates an interface with the specified name as a packaged element of this component.
	 * @param name The name for the new interface, or null.
	 * <!-- end-model-doc -->
	 * @model required="true" ordered="false" nameDataType="org.eclipse.uml2.types.String" nameRequired="true" nameOrdered="false"
	 * @generated
	 */
	Interface createOwnedInterface(String name);

} // Component
