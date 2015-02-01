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
 *   Kenn Hussey (CEA) - 327039, 418466, 451350
 *   Christian W. Damus (CEA) - 251963
 *
 */
package org.eclipse.uml2.uml;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Feature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A Feature declares a behavioral or structural characteristic of Classifiers.
 * <p>From package UML::Classification.</p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.Feature#getFeaturingClassifiers <em>Featuring Classifier</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Feature#isStatic <em>Is Static</em>}</li>
 * </ul>
 *
 * @see org.eclipse.uml2.uml.UMLPackage#getFeature()
 * @model abstract="true"
 * @generated
 */
public interface Feature
		extends RedefinableElement {

	/**
	 * Returns the value of the '<em><b>Is Static</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies whether this Feature characterizes individual instances classified by the Classifier (false) or the Classifier itself (true).
	 * <p>From package UML::Classification.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Static</em>' attribute.
	 * @see #setIsStatic(boolean)
	 * @see org.eclipse.uml2.uml.UMLPackage#getFeature_IsStatic()
	 * @model default="false" dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isStatic();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.uml.Feature#isStatic <em>Is Static</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Static</em>' attribute.
	 * @see #isStatic()
	 * @generated
	 */
	void setIsStatic(boolean value);

	/**
	 * Returns the value of the '<em><b>Featuring Classifier</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.Classifier}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.uml2.uml.Classifier#getFeatures <em>Feature</em>}'.
	 * This feature is a derived union.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Classifiers that have this Feature as a feature.
	 * <p>From package UML::Classification.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Featuring Classifier</em>' reference list.
	 * @see org.eclipse.uml2.uml.UMLPackage#getFeature_FeaturingClassifier()
	 * @see org.eclipse.uml2.uml.Classifier#getFeatures
	 * @model opposite="feature" transient="true" changeable="false" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	EList<Classifier> getFeaturingClassifiers();

	/**
	 * Retrieves the first {@link org.eclipse.uml2.uml.Classifier} with the specified '<em><b>Name</b></em>' from the '<em><b>Featuring Classifier</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.Classifier} to retrieve, or <code>null</code>.
	 * @return The first {@link org.eclipse.uml2.uml.Classifier} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getFeaturingClassifiers()
	 * @generated
	 */
	Classifier getFeaturingClassifier(String name);

	/**
	 * Retrieves the first {@link org.eclipse.uml2.uml.Classifier} with the specified '<em><b>Name</b></em>' from the '<em><b>Featuring Classifier</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.Classifier} to retrieve, or <code>null</code>.
	 * @param ignoreCase Whether to ignore case in {@link java.lang.String} comparisons.
	 * @param eClass The Ecore class of the {@link org.eclipse.uml2.uml.Classifier} to retrieve, or <code>null</code>.
	 * @return The first {@link org.eclipse.uml2.uml.Classifier} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getFeaturingClassifiers()
	 * @generated
	 */
	Classifier getFeaturingClassifier(String name, boolean ignoreCase,
			EClass eClass);

} // Feature
