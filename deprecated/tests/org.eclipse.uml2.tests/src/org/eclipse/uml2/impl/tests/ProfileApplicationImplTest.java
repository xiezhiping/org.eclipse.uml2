/*
 * Copyright (c) 2003, 2004 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *
 * $Id: ProfileApplicationImplTest.java,v 1.3 2005/03/15 18:51:30 khussey Exp $
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
	 * @generated
	 */
	public void testGetImportedProfileGen() {
		// TODO: implement this feature getter test method
	}

	public void testGetImportedProfile() {
		testGetImportedProfileGen();
		
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
	 * @generated
	 */
	public void testSetImportedProfileGen() {
		// TODO: implement this feature setter test method
	}

	public void testSetImportedProfile() {
		testSetImportedProfileGen();
		
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
	 * @generated
	 */
	public void testSetImportedPackage__PackageGen() {
		// TODO: implement this setter operation test method
	}

	public void testSetImportedPackage__Package() {
		testSetImportedPackage__PackageGen();
		
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
