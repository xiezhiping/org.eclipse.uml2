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

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Remove Structural Feature Value Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A RemoveStructuralFeatureValueAction is a WriteStructuralFeatureAction that removes values from a StructuralFeature.
 * <p>From package UML::Actions.</p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.RemoveStructuralFeatureValueAction#isRemoveDuplicates <em>Is Remove Duplicates</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.RemoveStructuralFeatureValueAction#getRemoveAt <em>Remove At</em>}</li>
 * </ul>
 *
 * @see org.eclipse.uml2.uml.UMLPackage#getRemoveStructuralFeatureValueAction()
 * @model
 * @generated
 */
public interface RemoveStructuralFeatureValueAction
		extends WriteStructuralFeatureAction {

	/**
	 * Returns the value of the '<em><b>Is Remove Duplicates</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies whether to remove duplicates of the value in nonunique StructuralFeatures.
	 * <p>From package UML::Actions.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Remove Duplicates</em>' attribute.
	 * @see #setIsRemoveDuplicates(boolean)
	 * @see org.eclipse.uml2.uml.UMLPackage#getRemoveStructuralFeatureValueAction_IsRemoveDuplicates()
	 * @model default="false" dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isRemoveDuplicates();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.uml.RemoveStructuralFeatureValueAction#isRemoveDuplicates <em>Is Remove Duplicates</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Remove Duplicates</em>' attribute.
	 * @see #isRemoveDuplicates()
	 * @generated
	 */
	void setIsRemoveDuplicates(boolean value);

	/**
	 * Returns the value of the '<em><b>Remove At</b></em>' containment reference.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.eclipse.uml2.uml.Action#getInputs() <em>Input</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An InputPin that provides the position of an existing value to remove in ordered, nonunique structural features. The type of the removeAt InputPin is UnlimitedNatural, but the value cannot be zero or unlimited.
	 * <p>From package UML::Actions.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Remove At</em>' containment reference.
	 * @see #setRemoveAt(InputPin)
	 * @see org.eclipse.uml2.uml.UMLPackage#getRemoveStructuralFeatureValueAction_RemoveAt()
	 * @model containment="true" resolveProxies="true" ordered="false"
	 * @generated
	 */
	InputPin getRemoveAt();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.uml.RemoveStructuralFeatureValueAction#getRemoveAt <em>Remove At</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Remove At</em>' containment reference.
	 * @see #getRemoveAt()
	 * @generated
	 */
	void setRemoveAt(InputPin value);

	/**
	 * Creates a new {@link org.eclipse.uml2.uml.InputPin}, with the specified '<em><b>Name</b></em>', and '<em><b>Type</b></em>', and sets the '<em><b>Remove At</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' for the new {@link org.eclipse.uml2.uml.InputPin}, or <code>null</code>.
	 * @param type The '<em><b>Type</b></em>' for the new {@link org.eclipse.uml2.uml.InputPin}, or <code>null</code>.
	 * @param eClass The Ecore class of the {@link org.eclipse.uml2.uml.InputPin} to create.
	 * @return The new {@link org.eclipse.uml2.uml.InputPin}.
	 * @see #getRemoveAt()
	 * @generated
	 */
	InputPin createRemoveAt(String name, Type type, EClass eClass);

	/**
	 * Creates a new {@link org.eclipse.uml2.uml.InputPin},with the specified '<em><b>Name</b></em>', and '<em><b>Type</b></em>', and sets the '<em><b>Remove At</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' for the new {@link org.eclipse.uml2.uml.InputPin}, or <code>null</code>.
	 * @param type The '<em><b>Type</b></em>' for the new {@link org.eclipse.uml2.uml.InputPin}, or <code>null</code>.
	 * @return The new {@link org.eclipse.uml2.uml.InputPin}.
	 * @see #getRemoveAt()
	 * @generated
	 */
	InputPin createRemoveAt(String name, Type type);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * RemoveStructuralFeatureValueActions removing a value from ordered, non-unique StructuralFeatures must have a single removeAt InputPin and no value InputPin, if isRemoveDuplicates is false. The removeAt InputPin must be of type Unlimited Natural with multiplicity 1..1. Otherwise, the Action has a value InputPin and no removeAt InputPin.
	 * if structuralFeature.isOrdered and not structuralFeature.isUnique and  not isRemoveDuplicates then
	 *   value = null and
	 *   removeAt <> null and
	 *   removeAt.type = UnlimitedNatural and
	 *   removeAt.is(1,1)
	 * else
	 *   removeAt = null and value <> null
	 * endif
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validateRemoveAtAndValue(DiagnosticChain diagnostics,
			Map<Object, Object> context);

} // RemoveStructuralFeatureValueAction
