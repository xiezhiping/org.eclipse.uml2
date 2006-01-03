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
 * $Id: Class.java,v 1.6 2006/01/03 18:02:01 khussey Exp $
 */
package org.eclipse.uml2.uml;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Class is a kind of classifier whose features are attributes and operations. Attributes of a class are represented by instances of Property that are owned by the class. Some of these attributes may represent the navigable ends of binary associations.
 * A class may be designated as active, i.e., each of its instances having its own thread of control, or passive, i.e., each of its instance executing within the context of some other object. A class may also specify which signals the instances of this class handle.
 * Extends the metaclass Class with the capability to have an internal structure and ports.
 * Class has derived association that indicates how it may be extended through one or more stereotypes.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.Class#getNestedClassifiers <em>Nested Classifier</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Class#getOwnedOperations <em>Owned Operation</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Class#getSuperClasses <em>Super Class</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Class#isActive <em>Is Active</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Class#getOwnedReceptions <em>Owned Reception</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Class#getExtensions <em>Extension</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.uml2.uml.UMLPackage#getClass_()
 * @model
 * @generated
 */
public interface Class
		extends EncapsulatedClassifier, BehavioredClassifier {

	/**
	 * Returns the value of the '<em><b>Owned Operation</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.Operation}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.uml2.uml.Operation#getClass_ <em>Class </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The operations owned by the class.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned Operation</em>' containment reference list.
	 * @see org.eclipse.uml2.uml.UMLPackage#getClass_OwnedOperation()
	 * @see org.eclipse.uml2.uml.Operation#getClass_
	 * @model type="org.eclipse.uml2.uml.Operation" opposite="class_" containment="true" resolveProxies="false"
	 * @generated
	 */
	EList getOwnedOperations();

	/**
	 * Creates a {@link org.eclipse.uml2.uml.Operation} and appends it to the '<em><b>Owned Operation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return The new {@link org.eclipse.uml2.uml.Operation}.
	 * @see #getOwnedOperations()
	 * @generated
	 */
	Operation createOwnedOperation();

	/**
	 * Retrieves the {@link org.eclipse.uml2.uml.Operation} with the specified '<em><b>Name</b></em>' from the '<em><b>Owned Operation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.Operation} to retrieve.
	 * @return The {@link org.eclipse.uml2.uml.Operation} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getOwnedOperations()
	 * @generated
	 */
	Operation getOwnedOperation(String name);

	/**
	 * Returns the value of the '<em><b>Nested Classifier</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.Classifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * References all the Classifiers that are defined (nested) within the Class.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Nested Classifier</em>' containment reference list.
	 * @see org.eclipse.uml2.uml.UMLPackage#getClass_NestedClassifier()
	 * @model type="org.eclipse.uml2.uml.Classifier" containment="true" resolveProxies="false"
	 * @generated
	 */
	EList getNestedClassifiers();

	/**
	 * Creates a {@link org.eclipse.uml2.uml.Classifier} and appends it to the '<em><b>Nested Classifier</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param eClass The Ecore class of the {@link org.eclipse.uml2.uml.Classifier} to create.
	 * @return The new {@link org.eclipse.uml2.uml.Classifier}.
	 * @see #getNestedClassifiers()
	 * @generated
	 */
	Classifier createNestedClassifier(EClass eClass);

	/**
	 * Retrieves the {@link org.eclipse.uml2.uml.Classifier} with the specified '<em><b>Name</b></em>' from the '<em><b>Nested Classifier</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.Classifier} to retrieve.
	 * @return The {@link org.eclipse.uml2.uml.Classifier} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getNestedClassifiers()
	 * @generated
	 */
	Classifier getNestedClassifier(String name);

	/**
	 * Returns the value of the '<em><b>Super Class</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.Class}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This gives the superclasses of a class.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Super Class</em>' reference list.
	 * @see org.eclipse.uml2.uml.UMLPackage#getClass_SuperClass()
	 * @model type="org.eclipse.uml2.uml.Class" transient="true" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	EList getSuperClasses();

	/**
	 * Retrieves the {@link org.eclipse.uml2.uml.Class} with the specified '<em><b>Name</b></em>' from the '<em><b>Super Class</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.Class} to retrieve.
	 * @return The {@link org.eclipse.uml2.uml.Class} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getSuperClasses()
	 * @generated
	 */
	Class getSuperClass(String name);

	/**
	 * Returns the value of the '<em><b>Is Active</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Determines whether an object specified by this class is active or not. If true, then the owning class is referred to as an active class. If false, then such a class is referred to as a passive class.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Active</em>' attribute.
	 * @see #setIsActive(boolean)
	 * @see org.eclipse.uml2.uml.UMLPackage#getClass_IsActive()
	 * @model dataType="org.eclipse.uml2.uml.Boolean" required="true" ordered="false"
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Receptions that objects of this class are willing to accept.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned Reception</em>' containment reference list.
	 * @see org.eclipse.uml2.uml.UMLPackage#getClass_OwnedReception()
	 * @model type="org.eclipse.uml2.uml.Reception" containment="true" resolveProxies="false" ordered="false"
	 * @generated
	 */
	EList getOwnedReceptions();

	/**
	 * Creates a {@link org.eclipse.uml2.uml.Reception} and appends it to the '<em><b>Owned Reception</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return The new {@link org.eclipse.uml2.uml.Reception}.
	 * @see #getOwnedReceptions()
	 * @generated
	 */
	Reception createOwnedReception();

	/**
	 * Retrieves the {@link org.eclipse.uml2.uml.Reception} with the specified '<em><b>Name</b></em>' from the '<em><b>Owned Reception</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.Reception} to retrieve.
	 * @return The {@link org.eclipse.uml2.uml.Reception} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getOwnedReceptions()
	 * @generated
	 */
	Reception getOwnedReception(String name);

	/**
	 * Returns the value of the '<em><b>Extension</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.Extension}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.uml2.uml.Extension#getMetaclass <em>Metaclass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * References the Extensions that specify additional properties of the metaclass. The property is derived from the extensions whose memberEnds are typed by the Class.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Extension</em>' reference list.
	 * @see org.eclipse.uml2.uml.UMLPackage#getClass_Extension()
	 * @see org.eclipse.uml2.uml.Extension#getMetaclass
	 * @model type="org.eclipse.uml2.uml.Extension" opposite="metaclass" transient="true" changeable="false" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	EList getExtensions();

	/**
	 * Retrieves the {@link org.eclipse.uml2.uml.Extension} with the specified '<em><b>Name</b></em>' from the '<em><b>Extension</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.Extension} to retrieve.
	 * @return The {@link org.eclipse.uml2.uml.Extension} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getExtensions()
	 * @generated
	 */
	Extension getExtension(String name);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A passive class may not own receptions.
	 * not self.isActive implies self.ownedReception.isEmpty()
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validatePassiveClass(DiagnosticChain diagnostics, Map context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" nameDataType="org.eclipse.uml2.uml.String" nameRequired="true" nameOrdered="false" returnTypeRequired="true" returnTypeOrdered="false" parameterNamesType="java.lang.String" parameterNamesDataType="org.eclipse.uml2.uml.String" parameterNamesMany="true" parameterNamesOrdered="false" parameterTypesType="org.eclipse.uml2.uml.Type" parameterTypesMany="true" parameterTypesOrdered="false"
	 * @generated
	 */
	Operation createOwnedOperation(String name, Type returnType,
			EList parameterNames, EList parameterTypes);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="org.eclipse.uml2.uml.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isMetaclass();

} // Class
