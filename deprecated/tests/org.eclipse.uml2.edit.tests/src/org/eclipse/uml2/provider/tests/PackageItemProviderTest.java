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
 * $Id: PackageItemProviderTest.java,v 1.1 2004/04/29 14:43:45 khussey Exp $
 */
package org.eclipse.uml2.provider.tests;

import java.util.Collections;

import junit.textui.TestRunner;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.edit.command.CommandParameter;
import org.eclipse.emf.edit.command.RemoveCommand;
import org.eclipse.emf.edit.command.ReplaceCommand;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.uml2.ProfileApplication;
import org.eclipse.uml2.TemplateParameter;
import org.eclipse.uml2.UML2Factory;
import org.eclipse.uml2.UML2Package;

/**
 * <!-- begin-user-doc -->
 * A test case for the '<em><b>Package</b></em>' item provider adapter.
 * <!-- end-user-doc -->
 * @generated
 */
public class PackageItemProviderTest extends NamespaceItemProviderTest {

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
		TestRunner.run(PackageItemProviderTest.class);
	}

	/**
	 * Constructs a new Package item provider adapter test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PackageItemProviderTest(String name) {
		super(name);
	}

	/**
	 * Returns the model object for this Package item provider adapter test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private org.eclipse.uml2.Package getModelObject() {
		return (org.eclipse.uml2.Package) modelObject;
	}

	/* (non-Javadoc)
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	protected void setUp() throws Exception {
		super.setUp();

		setModelObject(UML2Factory.eINSTANCE.createPackage());
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.provider.PackageItemProvider#createAddCommand(org.eclipse.emf.edit.domain.EditingDomain, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EStructuralFeature, java.util.Collection, int) <em>Create Add Command</em>}' method.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.provider.PackageItemProvider#createAddCommand(org.eclipse.emf.edit.domain.EditingDomain, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EStructuralFeature, java.util.Collection, int)
	 * @generated NOT
	 */
	public void testCreateAddCommand() {
		
		// test PACKAGE__APPLIED_PROFILE subset...
		ProfileApplication profileApplication = UML2Factory.eINSTANCE.createProfileApplication();
	
		Command command =
			AddCommand.create(
				getEditingDomain(),
				getModelObject(),
				UML2Package.eINSTANCE.getPackage_AppliedProfile(),
				Collections.singleton(profileApplication),
				CommandParameter.NO_INDEX);
	
		getCommandStack().execute(command);
	
		assertTrue(getModelObject().getAppliedProfiles().contains(profileApplication));
		assertTrue(getModelObject().getPackageImports().contains(profileApplication));
	
		getCommandStack().undo();
	
		assertFalse(getModelObject().getAppliedProfiles().contains(profileApplication));
		assertFalse(getModelObject().getPackageImports().contains(profileApplication));
	
		getCommandStack().redo();
	
		assertTrue(getModelObject().getAppliedProfiles().contains(profileApplication));
		assertTrue(getModelObject().getPackageImports().contains(profileApplication));
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.provider.PackageItemProvider#createRemoveCommand(org.eclipse.emf.edit.domain.EditingDomain, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EReference, java.util.Collection) <em>Create Remove Command</em>}' method.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.provider.PackageItemProvider#createRemoveCommand(org.eclipse.emf.edit.domain.EditingDomain, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EReference, java.util.Collection)
	 * @generated NOT
	 */
	public void testCreateRemoveCommand() {
		
		// test PACKAGE__PACKAGE_IMPORT superset...
		ProfileApplication profileApplication = UML2Factory.eINSTANCE.createProfileApplication();
	
		getModelObject().getAppliedProfiles().add(profileApplication);
	
		Command command =
			RemoveCommand.create(
				getEditingDomain(),
				getModelObject(),
				UML2Package.eINSTANCE.getNamespace_PackageImport(),
				Collections.singleton(profileApplication));
	
		getCommandStack().execute(command);
	
		assertFalse(getModelObject().getPackageImports().contains(profileApplication));
		assertFalse(getModelObject().getAppliedProfiles().contains(profileApplication));
	
		getCommandStack().undo();
	
		assertTrue(getModelObject().getPackageImports().contains(profileApplication));
		assertTrue(getModelObject().getAppliedProfiles().contains(profileApplication));
	
		getCommandStack().redo();
	
		assertFalse(getModelObject().getPackageImports().contains(profileApplication));
		assertFalse(getModelObject().getAppliedProfiles().contains(profileApplication));
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.provider.PackageItemProvider#createReplaceCommand(org.eclipse.emf.edit.domain.EditingDomain, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EReference, org.eclipse.emf.ecore.EObject, java.util.Collection) <em>Create Replace Command</em>}' method.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.provider.PackageItemProvider#createReplaceCommand(org.eclipse.emf.edit.domain.EditingDomain, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EReference, org.eclipse.emf.ecore.EObject, java.util.Collection)
	 * @generated NOT
	 */
	public void testCreateReplaceCommand() {
		
		// test PACKAGE__APPLIED_PROFILE subset...
		ProfileApplication profileApplication = UML2Factory.eINSTANCE.createProfileApplication();
		ProfileApplication replacementProfileApplication = UML2Factory.eINSTANCE.createProfileApplication();
	
		getModelObject().getAppliedProfiles().add(profileApplication);
	
		Command command =
			ReplaceCommand.create(
				getEditingDomain(),
				getModelObject(),
				UML2Package.eINSTANCE.getPackage_AppliedProfile(),
				profileApplication,
				Collections.singleton(replacementProfileApplication));
	
		getCommandStack().execute(command);
	
		assertFalse(getModelObject().getAppliedProfiles().contains(profileApplication));
		assertTrue(getModelObject().getAppliedProfiles().contains(replacementProfileApplication));
		assertTrue(getModelObject().getPackageImports().contains(replacementProfileApplication));
	
		getCommandStack().undo();
	
		assertTrue(getModelObject().getAppliedProfiles().contains(profileApplication));
		assertFalse(getModelObject().getAppliedProfiles().contains(replacementProfileApplication));
		assertFalse(getModelObject().getPackageImports().contains(replacementProfileApplication));
	
		getCommandStack().redo();
	
		assertFalse(getModelObject().getAppliedProfiles().contains(profileApplication));
		assertTrue(getModelObject().getAppliedProfiles().contains(replacementProfileApplication));
		assertTrue(getModelObject().getPackageImports().contains(replacementProfileApplication));
	
		// test PACKAGE__PACKAGE_IMPORT superset...
		profileApplication = UML2Factory.eINSTANCE.createProfileApplication();
		replacementProfileApplication = UML2Factory.eINSTANCE.createProfileApplication();
	
		getModelObject().getAppliedProfiles().add(profileApplication);
	
		command =
			ReplaceCommand.create(
				getEditingDomain(),
				getModelObject(),
				UML2Package.eINSTANCE.getNamespace_PackageImport(),
				profileApplication,
				Collections.singleton(replacementProfileApplication));
	
		getCommandStack().execute(command);
	
		assertFalse(getModelObject().getPackageImports().contains(profileApplication));
		assertTrue(getModelObject().getPackageImports().contains(replacementProfileApplication));
		assertFalse(getModelObject().getAppliedProfiles().contains(profileApplication));
	
		getCommandStack().undo();
	
		assertTrue(getModelObject().getPackageImports().contains(profileApplication));
		assertFalse(getModelObject().getPackageImports().contains(replacementProfileApplication));
		assertTrue(getModelObject().getAppliedProfiles().contains(profileApplication));
	
		getCommandStack().redo();
	
		assertFalse(getModelObject().getPackageImports().contains(profileApplication));
		assertTrue(getModelObject().getPackageImports().contains(replacementProfileApplication));
		assertFalse(getModelObject().getAppliedProfiles().contains(profileApplication));
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.provider.PackageItemProvider#createSetCommand(org.eclipse.emf.edit.domain.EditingDomain, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EStructuralFeature, java.lang.Object) <em>Create Set Command</em>}' method.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.provider.PackageItemProvider#createSetCommand(org.eclipse.emf.edit.domain.EditingDomain, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EStructuralFeature, java.lang.Object)
	 * @generated NOT
	 */
	public void testCreateSetCommand() {
		
		// test PACKAGE__OWNING_PARAMETER subset...
		TemplateParameter templateParameter = UML2Factory.eINSTANCE.createTemplateParameter();
	
		Command command =
			SetCommand.create(getEditingDomain(), getModelObject(), UML2Package.eINSTANCE.getParameterableElement_OwningParameter(), templateParameter);
	
		getCommandStack().execute(command);
	
		assertSame(templateParameter, getModelObject().getOwningParameter());
		assertSame(getModelObject().getOwningParameter(), getModelObject().getTemplateParameter());
	
		getCommandStack().undo();
	
		assertNotSame(templateParameter, getModelObject().getOwningParameter());
		assertSame(getModelObject().getOwningParameter(), getModelObject().getTemplateParameter());
	
		getCommandStack().redo();
	
		assertSame(templateParameter, getModelObject().getOwningParameter());
		assertSame(getModelObject().getOwningParameter(), getModelObject().getTemplateParameter());
	
		// test PACKAGE__TEMPLATE_PARAMETER superset...
		TemplateParameter oldTemplateParameter = UML2Factory.eINSTANCE.createTemplateParameter();
		TemplateParameter newTemplateParameter = UML2Factory.eINSTANCE.createTemplateParameter();
	
		getModelObject().setOwningParameter(oldTemplateParameter);
	
		command = SetCommand.create(getEditingDomain(), getModelObject(), UML2Package.eINSTANCE.getParameterableElement_TemplateParameter(), newTemplateParameter);
	
		getCommandStack().execute(command);
	
		assertSame(newTemplateParameter, getModelObject().getTemplateParameter());
		assertSame(null, getModelObject().getOwningParameter());
	
		getCommandStack().undo();
	
		assertSame(oldTemplateParameter, getModelObject().getTemplateParameter());
		assertSame(oldTemplateParameter, getModelObject().getOwningParameter());
	
		getCommandStack().redo();
	
		assertSame(newTemplateParameter, getModelObject().getTemplateParameter());
		assertSame(null, getModelObject().getOwningParameter());
	}

} //PackageItemProviderTest
