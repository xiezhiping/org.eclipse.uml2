/*
 * Copyright (c) 2003, 2005 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *
 * $Id: FeatureTest.java,v 1.1 2005/04/04 20:06:08 khussey Exp $
 */
package org.eclipse.uml2.tests;

import org.eclipse.uml2.Feature;

import java.util.Iterator;

import org.eclipse.uml2.Classifier;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Feature</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are tested:
 * <ul>
 *   <li>{@link org.eclipse.uml2.Feature#getFeaturingClassifiers() <em>Featuring Classifier</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public abstract class FeatureTest extends RedefinableElementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2003, 2005 IBM Corporation and others."; //$NON-NLS-1$

	/**
	 * Constructs a new Feature test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Feature test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private Feature getFixture() {
		return (Feature)fixture;
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.Feature#getFeaturingClassifiers() <em>Featuring Classifier</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.Feature#getFeaturingClassifiers()
	 * @generated
	 */
	public void testGetFeaturingClassifiersGen() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	public void testGetFeaturingClassifiers() {
		testGetFeaturingClassifiersGen();
		
		setUpFeaturingClassifiers();

		for (Iterator featuringClassifiers = getFixture().getFeaturingClassifiers().iterator(); featuringClassifiers.hasNext();) {
			assertTrue(Classifier.class.isInstance(featuringClassifiers.next()));
		}
	}

	protected void setUpFeaturingClassifiers() {
		// do nothing
	}

} //FeatureImplTest
