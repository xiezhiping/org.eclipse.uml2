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
 * $Id: ProfileApplicationItemProviderTest.java,v 1.1 2004/04/29 14:43:45 khussey Exp $
 */
package org.eclipse.uml2.provider.tests;

import junit.textui.TestRunner;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.uml2.Profile;
import org.eclipse.uml2.ProfileApplication;
import org.eclipse.uml2.UML2Factory;
import org.eclipse.uml2.UML2Package;

/**
 * <!-- begin-user-doc -->
 * A test case for the '<em><b>Profile Application</b></em>' item provider adapter.
 * <!-- end-user-doc -->
 * @generated
 */
public class ProfileApplicationItemProviderTest extends PackageImportItemProviderTest {

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
		TestRunner.run(ProfileApplicationItemProviderTest.class);
	}

	/**
	 * Constructs a new Profile Application item provider adapter test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProfileApplicationItemProviderTest(String name) {
		super(name);
	}

	/**
	 * Returns the model object for this Profile Application item provider adapter test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private ProfileApplication getModelObject() {
		return (ProfileApplication) modelObject;
	}

	/* (non-Javadoc)
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	protected void setUp() throws Exception {
		super.setUp();

		setModelObject(UML2Factory.eINSTANCE.createProfileApplication());
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.provider.ProfileApplicationItemProvider#createSetCommand(org.eclipse.emf.edit.domain.EditingDomain, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EStructuralFeature, java.lang.Object) <em>Create Set Command</em>}' method.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.provider.ProfileApplicationItemProvider#createSetCommand(org.eclipse.emf.edit.domain.EditingDomain, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EStructuralFeature, java.lang.Object)
	 * @generated NOT
	 */
	public void testCreateSetCommand() {

		// test PROFILE_APPLICATION__IMPORTED_PROFILE subset...
		Profile profile = UML2Factory.eINSTANCE.createProfile();

		Command command = SetCommand.create(getEditingDomain(), getModelObject(), UML2Package.eINSTANCE.getProfileApplication_ImportedProfile(), profile);

		getCommandStack().execute(command);

		assertSame(profile, getModelObject().getImportedProfile());
		assertSame(getModelObject().getImportedProfile(), getModelObject().getImportedPackage());

		getCommandStack().undo();

		assertNotSame(profile, getModelObject().getImportedProfile());
		assertSame(getModelObject().getImportedProfile(), getModelObject().getImportedPackage());

		getCommandStack().redo();

		assertSame(profile, getModelObject().getImportedProfile());
		assertSame(getModelObject().getImportedProfile(), getModelObject().getImportedPackage());

		// test PROFILE_APPLICATION__IMPORTED_PACKAGE superset...
		Profile oldProfile = UML2Factory.eINSTANCE.createProfile();
		Profile newProfile = UML2Factory.eINSTANCE.createProfile();

		getModelObject().setImportedProfile(oldProfile);

		command = SetCommand.create(getEditingDomain(), getModelObject(), UML2Package.eINSTANCE.getPackageImport_ImportedPackage(), newProfile);

		getCommandStack().execute(command);

		assertSame(newProfile, getModelObject().getImportedPackage());
		assertSame(null, getModelObject().getImportedProfile());

		getCommandStack().undo();

		assertSame(oldProfile, getModelObject().getImportedPackage());
		assertSame(oldProfile, getModelObject().getImportedProfile());

		getCommandStack().redo();

		assertSame(newProfile, getModelObject().getImportedPackage());
		assertSame(null, getModelObject().getImportedProfile());
	}

} //ProfileApplicationItemProviderTest
