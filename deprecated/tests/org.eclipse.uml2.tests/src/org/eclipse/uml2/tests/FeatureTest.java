/*
 * Copyright (c) 2003, 2006 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *
 * $Id: FeatureTest.java,v 1.3 2006/05/29 17:27:34 khussey Exp $
 */
package org.eclipse.uml2.tests;

import org.eclipse.uml2.Feature;

import java.util.Iterator;

import org.eclipse.uml2.Classifier;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Feature</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public abstract class FeatureTest extends RedefinableElementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) IBM Corporation and others."; //$NON-NLS-1$

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


	public void testGetFeaturingClassifiers() {
		setUpFeaturingClassifiers();

		for (Iterator featuringClassifiers = getFixture().getFeaturingClassifiers().iterator(); featuringClassifiers.hasNext();) {
			assertTrue(Classifier.class.isInstance(featuringClassifiers.next()));
		}
	}

	protected void setUpFeaturingClassifiers() {
		// do nothing
	}

} //FeatureImplTest
