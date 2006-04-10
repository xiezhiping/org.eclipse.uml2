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
 * $Id: ProfileApplicationTest.java,v 1.4 2006/04/10 20:38:09 khussey Exp $
 */
package org.eclipse.uml2.tests;

import junit.textui.TestRunner;

import org.eclipse.uml2.Profile;
import org.eclipse.uml2.ProfileApplication;
import org.eclipse.uml2.UML2Factory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Profile Application</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ProfileApplicationTest extends PackageImportTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) IBM Corporation and others."; //$NON-NLS-1$

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ProfileApplicationTest.class);
	}

	/**
	 * Constructs a new Profile Application test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProfileApplicationTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Profile Application test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private ProfileApplication getFixture() {
		return (ProfileApplication)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	protected void setUp() throws Exception {
		setFixture(UML2Factory.eINSTANCE.createProfileApplication());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	protected void tearDown() throws Exception {
		setFixture(null);
	}


	public void testGetImportedProfile() {
		Profile profile = UML2Factory.eINSTANCE.createProfile();

		getFixture().setImportedProfile(profile);

		assertSame(profile, getFixture().getImportedProfile());

		getFixture().setImportedProfile(null);

		assertSame(null, getFixture().getImportedProfile());
	}

	public void testSetImportedProfile() {
		Profile profile = UML2Factory.eINSTANCE.createProfile();

		getFixture().setImportedProfile(profile);

		assertSame(profile, getFixture().getImportedProfile());
		assertSame(getFixture().getImportedProfile(), getFixture().getImportedPackage());

		getFixture().setImportedProfile(null);

		assertSame(null, getFixture().getImportedProfile());
		assertNotSame(getFixture().getImportedProfile(), getFixture().getImportedPackage());
	}

	public void testSetImportedPackage() {
		getFixture().setImportedProfile(UML2Factory.eINSTANCE.createProfile());

		Profile profile = UML2Factory.eINSTANCE.createProfile();

		getFixture().setImportedPackage(profile);

		assertSame(profile, getFixture().getImportedPackage());
		assertSame(null, getFixture().getImportedProfile());

		getFixture().setImportedPackage(null);

		assertSame(null, getFixture().getImportedPackage());
		assertSame(getFixture().getImportedPackage(), getFixture().getImportedProfile());
	}

	/* (non-Javadoc)
	 * @see org.eclipse.uml2.impl.tests.DirectedRelationshipImplTest#setUpTarget()
	 */
	protected void setUpTargets() {
		getFixture().setImportedProfile(UML2Factory.eINSTANCE.createProfile());
	}

} //ProfileApplicationImplTest
