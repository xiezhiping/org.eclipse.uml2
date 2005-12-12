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
 * $Id: Component.java,v 1.5 2005/12/12 16:58:35 khussey Exp $
 */
package org.eclipse.uml2.uml;

import java.util.List;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A component is a subtype of Class which provides for a Component having attributes and operations, and being able to participate in Associations and Generalizations. A Component may form the abstraction for a set of realizingClassifiers that realize its behavior. In addition, because a Class itself is a subtype of an EncapsulatedClassifier, a Component may optionally have an internal structure and own a set of Ports that formalize its interaction points.
 * 
 * 
 * 
 * A component has a number of provided and required Interfaces, that form the basis for wiring components together, either using Dependencies, or by using Connectors. A provided Interface is one that is either implemented directly by the component or one of its realizingClassifiers, or it is the type of a provided Port of the Component. A required interface is designated by a Usage Dependency from the Component or one of its realizingClassifiers, or it is the type of a required Port.
 * 
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.Component#isIndirectlyInstantiated <em>Is Indirectly Instantiated</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Component#getRequireds <em>Required</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Component#getProvideds <em>Provided</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Component#getPackagedElements <em>Packaged Element</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Component#getRealizations <em>Realization</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.uml2.uml.UMLPackage#getComponent()
 * @model
 * @generated
 */
public interface Component
		extends org.eclipse.uml2.uml.Class, Namespace {

	/**
	 * Returns the value of the '<em><b>Is Indirectly Instantiated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The kind of instantiation that applies to a Component. If false, the component is instantiated as an addressable object. If true, the Component is defined at design-time, but at runtime (or execution-time) an object specified by the Component does not exist, that is, the component is instantiated indirectly, through the instantiation of its realizing classifiers or parts. Several standard stereotypes use this meta attribute, e.g. «specification, «focus», «subsystem».
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Indirectly Instantiated</em>' attribute.
	 * @see #setIsIndirectlyInstantiated(boolean)
	 * @see org.eclipse.uml2.uml.UMLPackage#getComponent_IsIndirectlyInstantiated()
	 * @model dataType="org.eclipse.uml2.uml.Boolean" required="true" ordered="false"
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
	 * The interfaces that the component requires from other components in its environment in order to be able to offer its full set of provided functionality. These interfaces may be Used by the Component or any of its realizingClassifiers, or they may be the Interfaces that are required by its public Ports.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Required</em>' reference list.
	 * @see org.eclipse.uml2.uml.UMLPackage#getComponent_Required()
	 * @model type="org.eclipse.uml2.uml.Interface" transient="true" changeable="false" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	List getRequireds();

	/**
	 * Retrieves the {@link org.eclipse.uml2.uml.Interface} with the specified '<em><b>Name</b></em>' from the '<em><b>Required</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.Interface} to retrieve.
	 * @return The {@link org.eclipse.uml2.uml.Interface} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getRequireds()
	 * @generated
	 */
	Interface getRequired(String name);

	/**
	 * Returns the value of the '<em><b>Provided</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.Interface}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The interfaces that the component exposes to its environment. These interfaces may be Realized by the Component or any of its realizingClassifiers, or they may be the Interfaces that are provided by its public Ports.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Provided</em>' reference list.
	 * @see org.eclipse.uml2.uml.UMLPackage#getComponent_Provided()
	 * @model type="org.eclipse.uml2.uml.Interface" transient="true" changeable="false" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	List getProvideds();

	/**
	 * Retrieves the {@link org.eclipse.uml2.uml.Interface} with the specified '<em><b>Name</b></em>' from the '<em><b>Provided</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.Interface} to retrieve.
	 * @return The {@link org.eclipse.uml2.uml.Interface} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getProvideds()
	 * @generated
	 */
	Interface getProvided(String name);

	/**
	 * Returns the value of the '<em><b>Packaged Element</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.PackageableElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The set of PackageableElements that a Component owns. In the namespace of a component, all model elements that are involved in or related to its definition may be owned or imported explicitly. These may include e.g. Classes, Interfaces, Components, Packages, Use cases, Dependencies (e.g. mappings), and Artifacts.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Packaged Element</em>' containment reference list.
	 * @see org.eclipse.uml2.uml.UMLPackage#getComponent_PackagedElement()
	 * @model type="org.eclipse.uml2.uml.PackageableElement" containment="true" ordered="false"
	 * @generated
	 */
	List getPackagedElements();

	/**
	 * Creates a {@link org.eclipse.uml2.uml.PackageableElement} and appends it to the '<em><b>Packaged Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param eClass The Ecore class of the {@link org.eclipse.uml2.uml.PackageableElement} to create.
	 * @return The new {@link org.eclipse.uml2.uml.PackageableElement}.
	 * @see #getPackagedElements()
	 * @generated
	 */
	PackageableElement createPackagedElement(EClass eClass);

	/**
	 * Retrieves the {@link org.eclipse.uml2.uml.PackageableElement} with the specified '<em><b>Name</b></em>' from the '<em><b>Packaged Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.PackageableElement} to retrieve.
	 * @return The {@link org.eclipse.uml2.uml.PackageableElement} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getPackagedElements()
	 * @generated
	 */
	PackageableElement getPackagedElement(String name);

	/**
	 * Returns the value of the '<em><b>Realization</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.ComponentRealization}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.uml2.uml.ComponentRealization#getAbstraction <em>Abstraction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The set of Realizations owned by the Component. Realizations reference the Classifiers of which the Component is an abstraction; i.e., that realize its behavior.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Realization</em>' containment reference list.
	 * @see org.eclipse.uml2.uml.UMLPackage#getComponent_Realization()
	 * @see org.eclipse.uml2.uml.ComponentRealization#getAbstraction
	 * @model type="org.eclipse.uml2.uml.ComponentRealization" opposite="abstraction" containment="true" resolveProxies="false" transient="true" ordered="false"
	 * @generated
	 */
	List getRealizations();

	/**
	 * Creates a {@link org.eclipse.uml2.uml.ComponentRealization} and appends it to the '<em><b>Realization</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return The new {@link org.eclipse.uml2.uml.ComponentRealization}.
	 * @see #getRealizations()
	 * @generated
	 */
	ComponentRealization createRealization();

	/**
	 * Retrieves the {@link org.eclipse.uml2.uml.ComponentRealization} with the specified '<em><b>Name</b></em>' from the '<em><b>Realization</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.ComponentRealization} to retrieve.
	 * @return The {@link org.eclipse.uml2.uml.ComponentRealization} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getRealizations()
	 * @generated
	 */
	ComponentRealization getRealization(String name);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Utility returning the set of realized interfaces of a component:
	 * result = (classifier.clientDependency->
	 * select(dependency|dependency.oclIsKindOf(Realization) and dependency.supplier.oclIsKindOf(Interface)))->
	 * collect(dependency|dependency.client)
	 * <!-- end-model-doc -->
	 * @model type="org.eclipse.uml2.uml.Interface" ordered="false" classifierRequired="true" classifierOrdered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='spec'"
	 * @generated
	 */
	List realizedInterfaces(Classifier classifier);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Utility returning the set of used interfaces of a component:
	 * result = (classifier.supplierDependency->
	 * select(dependency|dependency.oclIsKindOf(Usage) and dependency.supplier.oclIsKindOf(interface)))->
	 * collect(dependency|dependency.supplier)
	 * <!-- end-model-doc -->
	 * @model type="org.eclipse.uml2.uml.Interface" ordered="false" classifierRequired="true" classifierOrdered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='spec'"
	 * @generated
	 */
	List usedInterfaces(Classifier classifier);

} // Component
