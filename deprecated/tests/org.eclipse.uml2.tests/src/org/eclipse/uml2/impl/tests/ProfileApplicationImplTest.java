/*
 * Copyright (c) 2003, 2004 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Common Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/cpl-v10.html
 *
 * Contributors:
 *   IBM - Initial API and implementation
 *
 * $Id: ProfileApplicationImplTest.java,v 1.1 2004/04/29 14:56:47 khussey Exp $
 */
package org.eclipse.uml2.impl.tests;

import junit.textui.TestRunner;

import org.eclipse.uml2.Profile;
import org.eclipse.uml2.UML2Factory;
import org.eclipse.uml2.impl.ProfileApplicationImpl;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Profile Application</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are tested:
 * <ul>
 *   <li>{@link org.eclipse.uml2.impl.ProfileApplicationImpl#getImportedProfile() <em>Imported Profile</em>}</li>
 * </ul>
 * </p>
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link org.eclipse.uml2.impl.ProfileApplicationImpl#setImportedPackage(Package) <em>Set Imported Package</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class ProfileApplicationImplTest extends PackageImportImplTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2003, 2004 IBM Corporation and others."; //$NON-NLS-1$

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ProfileApplicationImplTest.class);
	}

	/**
	 * Constructs a new Profile Application test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProfileApplicationImplTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Profile Application test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private ProfileApplicationImpl getFixture() {
		return (ProfileApplicationImpl) fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	protected void setUp() throws Exception {
		setFixture((ProfileApplicationImpl) UML2Factory.eINSTANCE.createProfileApplication());
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

	/**
	 * Tests the '{@link org.eclipse.uml2.impl.ProfileApplicationImpl#getImportedProfile() <em>Imported Profile</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.ProfileApplicationImpl#getImportedProfile()
	 * @generated NOT
	 */
	public void testGetImportedProfile() {
		Profile profile = UML2Factory.eINSTANCE.createProfile();

		getFixture().setImportedProfile(profile);

		assertSame(profile, getFixture().getImportedProfile());

		getFixture().setImportedProfile(null);

		assertSame(null, getFixture().getImportedProfile());
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.impl.ProfileApplicationImpl#setImportedProfile() <em>Imported Profile</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.ProfileApplicationImpl#setImportedProfile()
	 * @generated NOT
	 */
	public void testSetImportedProfile() {
		Profile profile = UML2Factory.eINSTANCE.createProfile();

		getFixture().setImportedProfile(profile);

		assertSame(profile, getFixture().getImportedProfile());
		assertSame(getFixture().getImportedProfile(), getFixture().getImportedPackage());

		getFixture().setImportedProfile(null);

		assertSame(null, getFixture().getImportedProfile());
		assertSame(getFixture().getImportedProfile(), getFixture().getImportedPackage());
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.impl.ProfileApplicationImpl#setImportedPackage(Package) <em>Set Imported Package</em>}' setter operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.ProfileApplicationImpl#setImportedPackage(Package)
	 * @generated NOT
	 */
	public void testSetImportedPackage__Package() {
		getFixture().setImportedProfile(UML2Factory.eINSTANCE.createProfile());

		Profile profile = UML2Factory.eINSTANCE.createProfile();

		getFixture().setImportedPackage(profile);

		assertSame(profile, getFixture().getImportedPackage());
		assertSame(null, getFixture().getImportedProfile());

		getFixture().setImportedPackage(null);

		assertSame(null, getFixture().getImportedPackage());
		assertSame(getFixture().getImportedPackage(), getFixture().getImportedProfile());
	}

	/**
	 * @see org.eclipse.uml2.impl.tests.DirectedRelationshipImplTest#setUpTarget()
	 */
	protected void setUpTargets() {
		getFixture().setImportedProfile(UML2Factory.eINSTANCE.createProfile());
	}

} //ProfileApplicationImplTest
