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
 * $Id: ManifestationItemProviderTest.java,v 1.2 2005/03/15 18:50:00 khussey Exp $
 */
package org.eclipse.uml2.provider.tests;

import java.util.Collections;
import java.util.Iterator;

import junit.textui.TestRunner;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.edit.command.RemoveCommand;
import org.eclipse.emf.edit.command.ReplaceCommand;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.uml2.Manifestation;
import org.eclipse.uml2.PackageableElement;
import org.eclipse.uml2.UML2Factory;
import org.eclipse.uml2.UML2Package;

/**
 * <!-- begin-user-doc -->
 * A test case for the '<em><b>Manifestation</b></em>' item provider adapter.
 * <!-- end-user-doc -->
 * @generated
 */
public class ManifestationItemProviderTest extends AbstractionItemProviderTest {

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
		TestRunner.run(ManifestationItemProviderTest.class);
	}

	/**
	 * Constructs a new Manifestation item provider adapter test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ManifestationItemProviderTest(String name) {
		super(name);
	}

	/**
	 * Returns the model object for this Manifestation item provider adapter test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private Manifestation getModelObject() {
		return (Manifestation) modelObject;
	}

	/* (non-Javadoc)
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	protected void setUp() throws Exception {
		super.setUp();

		setModelObject(UML2Factory.eINSTANCE.createManifestation());
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.provider.ManifestationItemProvider#createRemoveCommand(org.eclipse.emf.edit.domain.EditingDomain, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EReference, java.util.Collection) <em>Create Remove Command</em>}' method.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.provider.ManifestationItemProvider#createRemoveCommand(org.eclipse.emf.edit.domain.EditingDomain, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EReference, java.util.Collection)
	 * @generated NOT
	 */
	public void testCreateRemoveCommand() {
		
		// test MANIFESATION__SUPPLIER superset...
		for (Iterator eAllSubClasses = getEAllSubClasses(UML2Package.eINSTANCE.getPackageableElement()).iterator(); eAllSubClasses.hasNext();) {
			PackageableElement packageableElement = (PackageableElement) UML2Factory.eINSTANCE.create((EClass) eAllSubClasses.next());
	
			getModelObject().setUtilizedElement(packageableElement);
	
			Command command =
				RemoveCommand.create(
					getEditingDomain(),
					getModelObject(),
					UML2Package.eINSTANCE.getDependency_Supplier(),
					Collections.singleton(packageableElement));
	
			getCommandStack().execute(command);
	
			assertFalse(getModelObject().getSuppliers().contains(packageableElement));
			assertNotSame(packageableElement, getModelObject().getUtilizedElement());
	
			getCommandStack().undo();
	
			assertTrue(getModelObject().getSuppliers().contains(packageableElement));
			assertSame(packageableElement, getModelObject().getUtilizedElement());
	
			getCommandStack().redo();
	
			assertFalse(getModelObject().getSuppliers().contains(packageableElement));
			assertNotSame(packageableElement, getModelObject().getUtilizedElement());
		}
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.provider.ManifestationItemProvider#createReplaceCommand(org.eclipse.emf.edit.domain.EditingDomain, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EReference, org.eclipse.emf.ecore.EObject, java.util.Collection) <em>Create Replace Command</em>}' method.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.provider.ManifestationItemProvider#createReplaceCommand(org.eclipse.emf.edit.domain.EditingDomain, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EReference, org.eclipse.emf.ecore.EObject, java.util.Collection)
	 * @generated NOT
	 */
	public void testCreateReplaceCommand() {
		
		// test MANIFESATION__SUPPLIER superset...
		for (Iterator eAllSubClasses = getEAllSubClasses(UML2Package.eINSTANCE.getPackageableElement()).iterator(); eAllSubClasses.hasNext();) {
			EClass eClass = (EClass) eAllSubClasses.next();
	
			PackageableElement packageableElement = (PackageableElement) UML2Factory.eINSTANCE.create(eClass);
			PackageableElement replacementPackageableElement = (PackageableElement) UML2Factory.eINSTANCE.create(eClass);
	
			getModelObject().setUtilizedElement(packageableElement);
	
			Command command =
				ReplaceCommand.create(
					getEditingDomain(),
					getModelObject(),
					UML2Package.eINSTANCE.getDependency_Supplier(),
					packageableElement,
					Collections.singleton(replacementPackageableElement));
	
			getCommandStack().execute(command);
	
			assertFalse(getModelObject().getSuppliers().contains(packageableElement));
			assertTrue(getModelObject().getSuppliers().contains(replacementPackageableElement));
			assertNotSame(packageableElement, getModelObject().getUtilizedElement());
	
			getCommandStack().undo();
	
			assertTrue(getModelObject().getSuppliers().contains(packageableElement));
			assertFalse(getModelObject().getSuppliers().contains(replacementPackageableElement));
			assertSame(packageableElement, getModelObject().getUtilizedElement());
	
			getCommandStack().redo();
	
			assertFalse(getModelObject().getSuppliers().contains(packageableElement));
			assertTrue(getModelObject().getSuppliers().contains(replacementPackageableElement));
			assertNotSame(packageableElement, getModelObject().getUtilizedElement());
		}
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.provider.ManifestationItemProvider#createSetCommand(org.eclipse.emf.edit.domain.EditingDomain, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EStructuralFeature, java.lang.Object) <em>Create Set Command</em>}' method.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.provider.ManifestationItemProvider#createSetCommand(org.eclipse.emf.edit.domain.EditingDomain, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EStructuralFeature, java.lang.Object)
	 * @generated NOT
	 */
	public void testCreateSetCommand() {
		super.testCreateSetCommand();
		
		// test MANIFESATION__UTILIZED_ELEMENT subset...
		for (Iterator eAllSubClasses = getEAllSubClasses(UML2Package.eINSTANCE.getPackageableElement()).iterator(); eAllSubClasses.hasNext();) {
			PackageableElement packageableElement = (PackageableElement) UML2Factory.eINSTANCE.create((EClass) eAllSubClasses.next());
			
			Command command = SetCommand.create(getEditingDomain(), getModelObject(), UML2Package.eINSTANCE.getManifestation_UtilizedElement(), packageableElement);
			
			getCommandStack().execute(command);
			
			assertSame(packageableElement, getModelObject().getUtilizedElement());
			assertTrue(getModelObject().getSuppliers().contains(packageableElement));
			
			getCommandStack().undo();
			
			assertNotSame(packageableElement, getModelObject().getUtilizedElement());
			assertFalse(getModelObject().getSuppliers().contains(packageableElement));
			
			getCommandStack().redo();
			
			assertSame(packageableElement, getModelObject().getUtilizedElement());
			assertTrue(getModelObject().getSuppliers().contains(packageableElement));
		}
	}

} //ManifestationItemProviderTest
