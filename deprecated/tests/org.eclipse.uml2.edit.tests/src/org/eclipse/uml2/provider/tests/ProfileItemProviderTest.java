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
 * $Id: ProfileItemProviderTest.java,v 1.1 2004/04/29 14:43:45 khussey Exp $
 */
package org.eclipse.uml2.provider.tests;

import java.util.Collections;

import junit.textui.TestRunner;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.edit.command.CommandParameter;
import org.eclipse.emf.edit.command.RemoveCommand;
import org.eclipse.emf.edit.command.ReplaceCommand;
import org.eclipse.uml2.ElementImport;
import org.eclipse.uml2.PackageImport;
import org.eclipse.uml2.Profile;
import org.eclipse.uml2.UML2Factory;
import org.eclipse.uml2.UML2Package;

/**
 * <!-- begin-user-doc -->
 * A test case for the '<em><b>Profile</b></em>' item provider adapter.
 * <!-- end-user-doc -->
 * @generated
 */
public class ProfileItemProviderTest extends PackageItemProviderTest {

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
		TestRunner.run(ProfileItemProviderTest.class);
	}

	/**
	 * Constructs a new Profile item provider adapter test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProfileItemProviderTest(String name) {
		super(name);
	}

	/**
	 * Returns the model object for this Profile item provider adapter test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private Profile getModelObject() {
		return (Profile) modelObject;
	}

	/* (non-Javadoc)
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	protected void setUp() throws Exception {
		super.setUp();

		setModelObject(UML2Factory.eINSTANCE.createProfile());
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.provider.ProfileItemProvider#createAddCommand(org.eclipse.emf.edit.domain.EditingDomain, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EStructuralFeature, java.util.Collection, int) <em>Create Add Command</em>}' method.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.provider.ProfileItemProvider#createAddCommand(org.eclipse.emf.edit.domain.EditingDomain, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EStructuralFeature, java.util.Collection, int)
	 * @generated NOT
	 */
	public void testCreateAddCommand() {
		super.testCreateAddCommand();
		
		// test PROFILE__METACLASS_REFERENCE subset...
		ElementImport elementImport = UML2Factory.eINSTANCE.createElementImport();
		
		Command command =
			AddCommand.create(
				getEditingDomain(),
				getModelObject(),
				UML2Package.eINSTANCE.getProfile_MetaclassReference(),
				Collections.singleton(elementImport),
				CommandParameter.NO_INDEX);
		
		getCommandStack().execute(command);
		
		assertTrue(getModelObject().getMetaclassReferences().contains(elementImport));
		assertTrue(getModelObject().getElementImports().contains(elementImport));
		
		getCommandStack().undo();
		
		assertFalse(getModelObject().getMetaclassReferences().contains(elementImport));
		assertFalse(getModelObject().getElementImports().contains(elementImport));
		
		getCommandStack().redo();
		
		assertTrue(getModelObject().getMetaclassReferences().contains(elementImport));
		assertTrue(getModelObject().getElementImports().contains(elementImport));
		
		// test PROFILE__METACLASS_REFERENCE subset...
		PackageImport packageImport = UML2Factory.eINSTANCE.createPackageImport();
		
		command =
			AddCommand.create(
				getEditingDomain(),
				getModelObject(),
				UML2Package.eINSTANCE.getProfile_MetamodelReference(),
				Collections.singleton(packageImport),
				CommandParameter.NO_INDEX);
		
		getCommandStack().execute(command);
		
		assertTrue(getModelObject().getMetamodelReferences().contains(packageImport));
		assertTrue(getModelObject().getPackageImports().contains(packageImport));
		
		getCommandStack().undo();
		
		assertFalse(getModelObject().getMetamodelReferences().contains(packageImport));
		assertFalse(getModelObject().getPackageImports().contains(packageImport));
		
		getCommandStack().redo();
		
		assertTrue(getModelObject().getMetamodelReferences().contains(packageImport));
		assertTrue(getModelObject().getPackageImports().contains(packageImport));
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.provider.ProfileItemProvider#createRemoveCommand(org.eclipse.emf.edit.domain.EditingDomain, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EReference, java.util.Collection) <em>Create Remove Command</em>}' method.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.provider.ProfileItemProvider#createRemoveCommand(org.eclipse.emf.edit.domain.EditingDomain, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EReference, java.util.Collection)
	 * @generated NOT
	 */
	public void testCreateRemoveCommand() {
		super.testCreateRemoveCommand();
		
		// test PROFILE__ELEMENT_IMPORT superset...
		ElementImport elementImport = UML2Factory.eINSTANCE.createElementImport();
		
		getModelObject().getMetaclassReferences().add(elementImport);
		
		Command command =
			RemoveCommand.create(getEditingDomain(), getModelObject(), UML2Package.eINSTANCE.getNamespace_ElementImport(), Collections.singleton(elementImport));
		
		getCommandStack().execute(command);
		
		assertFalse(getModelObject().getElementImports().contains(elementImport));
		assertFalse(getModelObject().getMetaclassReferences().contains(elementImport));
		
		getCommandStack().undo();
		
		assertTrue(getModelObject().getElementImports().contains(elementImport));
		assertTrue(getModelObject().getMetaclassReferences().contains(elementImport));
		
		getCommandStack().redo();
		
		assertFalse(getModelObject().getElementImports().contains(elementImport));
		assertFalse(getModelObject().getMetaclassReferences().contains(elementImport));
		
		// test PROFILE__PACKAGE_IMPORT superset...
		PackageImport packageImport = UML2Factory.eINSTANCE.createPackageImport();
		
		getModelObject().getMetamodelReferences().add(packageImport);
		
		command =
			RemoveCommand.create(getEditingDomain(), getModelObject(), UML2Package.eINSTANCE.getNamespace_PackageImport(), Collections.singleton(packageImport));
		
		getCommandStack().execute(command);
		
		assertFalse(getModelObject().getPackageImports().contains(packageImport));
		assertFalse(getModelObject().getMetamodelReferences().contains(packageImport));
		
		getCommandStack().undo();
		
		assertTrue(getModelObject().getPackageImports().contains(packageImport));
		assertTrue(getModelObject().getMetamodelReferences().contains(packageImport));
		
		getCommandStack().redo();
		
		assertFalse(getModelObject().getPackageImports().contains(packageImport));
		assertFalse(getModelObject().getMetamodelReferences().contains(packageImport));
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.provider.ProfileItemProvider#createReplaceCommand(org.eclipse.emf.edit.domain.EditingDomain, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EReference, org.eclipse.emf.ecore.EObject, java.util.Collection) <em>Create Replace Command</em>}' method.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.provider.ProfileItemProvider#createReplaceCommand(org.eclipse.emf.edit.domain.EditingDomain, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EReference, org.eclipse.emf.ecore.EObject, java.util.Collection)
	 * @generated NOT
	 */
	public void testCreateReplaceCommand() {
		super.testCreateReplaceCommand();
		
		// test PROFILE__METACLASS_REFERENCE subset...
		ElementImport elementImport = UML2Factory.eINSTANCE.createElementImport();
		ElementImport replacementElementImport = UML2Factory.eINSTANCE.createElementImport();
		
		getModelObject().getMetaclassReferences().add(elementImport);
		
		Command command =
			ReplaceCommand.create(
				getEditingDomain(),
				getModelObject(),
				UML2Package.eINSTANCE.getProfile_MetaclassReference(),
				elementImport,
				Collections.singleton(replacementElementImport));
		
		getCommandStack().execute(command);
		
		assertFalse(getModelObject().getMetaclassReferences().contains(elementImport));
		assertTrue(getModelObject().getMetaclassReferences().contains(replacementElementImport));
		assertTrue(getModelObject().getElementImports().contains(replacementElementImport));
		
		getCommandStack().undo();
		
		assertTrue(getModelObject().getMetaclassReferences().contains(elementImport));
		assertFalse(getModelObject().getMetaclassReferences().contains(replacementElementImport));
		assertFalse(getModelObject().getElementImports().contains(replacementElementImport));
		
		getCommandStack().redo();
		
		assertFalse(getModelObject().getMetaclassReferences().contains(elementImport));
		assertTrue(getModelObject().getMetaclassReferences().contains(replacementElementImport));
		assertTrue(getModelObject().getElementImports().contains(replacementElementImport));
		
		// test PROFILE__METAMODEL_REFERENCE subset...
		PackageImport packageImport = UML2Factory.eINSTANCE.createPackageImport();
		PackageImport replacementPackageImport = UML2Factory.eINSTANCE.createPackageImport();
		
		getModelObject().getMetamodelReferences().add(packageImport);
		
		command =
			ReplaceCommand.create(
				getEditingDomain(),
				getModelObject(),
				UML2Package.eINSTANCE.getProfile_MetamodelReference(),
				packageImport,
				Collections.singleton(replacementPackageImport));
		
		getCommandStack().execute(command);
		
		assertFalse(getModelObject().getMetamodelReferences().contains(packageImport));
		assertTrue(getModelObject().getMetamodelReferences().contains(replacementPackageImport));
		assertTrue(getModelObject().getPackageImports().contains(replacementPackageImport));
		
		getCommandStack().undo();
		
		assertTrue(getModelObject().getMetamodelReferences().contains(packageImport));
		assertFalse(getModelObject().getMetamodelReferences().contains(replacementPackageImport));
		assertFalse(getModelObject().getPackageImports().contains(replacementPackageImport));
		
		getCommandStack().redo();
		
		assertFalse(getModelObject().getMetamodelReferences().contains(packageImport));
		assertTrue(getModelObject().getMetamodelReferences().contains(replacementPackageImport));
		assertTrue(getModelObject().getPackageImports().contains(replacementPackageImport));
		
		// test PROFILE__ELEMENT_IMPORT superset...
		elementImport = UML2Factory.eINSTANCE.createElementImport();
		replacementElementImport = UML2Factory.eINSTANCE.createElementImport();
		
		getModelObject().getMetaclassReferences().add(elementImport);
		
		command =
			ReplaceCommand.create(
				getEditingDomain(),
				getModelObject(),
				UML2Package.eINSTANCE.getNamespace_ElementImport(),
				elementImport,
				Collections.singleton(replacementElementImport));
		
		getCommandStack().execute(command);
		
		assertFalse(getModelObject().getElementImports().contains(elementImport));
		assertTrue(getModelObject().getElementImports().contains(replacementElementImport));
		assertFalse(getModelObject().getMetaclassReferences().contains(elementImport));
		
		getCommandStack().undo();
		
		assertTrue(getModelObject().getElementImports().contains(elementImport));
		assertFalse(getModelObject().getElementImports().contains(replacementElementImport));
		assertTrue(getModelObject().getMetaclassReferences().contains(elementImport));
		
		getCommandStack().redo();
		
		assertFalse(getModelObject().getElementImports().contains(elementImport));
		assertTrue(getModelObject().getElementImports().contains(replacementElementImport));
		assertFalse(getModelObject().getMetaclassReferences().contains(elementImport));
		
		// test PROFILE__PACKAGE_IMPORT superset...
		packageImport = UML2Factory.eINSTANCE.createPackageImport();
		replacementPackageImport = UML2Factory.eINSTANCE.createPackageImport();
		
		getModelObject().getMetamodelReferences().add(packageImport);
		
		command =
			ReplaceCommand.create(
				getEditingDomain(),
				getModelObject(),
				UML2Package.eINSTANCE.getNamespace_PackageImport(),
				packageImport,
				Collections.singleton(replacementPackageImport));
		
		getCommandStack().execute(command);
		
		assertFalse(getModelObject().getPackageImports().contains(packageImport));
		assertTrue(getModelObject().getPackageImports().contains(replacementPackageImport));
		assertFalse(getModelObject().getMetamodelReferences().contains(packageImport));
		
		getCommandStack().undo();
		
		assertTrue(getModelObject().getPackageImports().contains(packageImport));
		assertFalse(getModelObject().getPackageImports().contains(replacementPackageImport));
		assertTrue(getModelObject().getMetamodelReferences().contains(packageImport));
		
		getCommandStack().redo();
		
		assertFalse(getModelObject().getPackageImports().contains(packageImport));
		assertTrue(getModelObject().getPackageImports().contains(replacementPackageImport));
		assertFalse(getModelObject().getMetamodelReferences().contains(packageImport));
	}

} //ProfileItemProviderTest
