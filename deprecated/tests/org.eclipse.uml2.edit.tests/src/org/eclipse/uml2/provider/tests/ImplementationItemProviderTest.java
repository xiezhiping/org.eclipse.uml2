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
 * $Id: ImplementationItemProviderTest.java,v 1.3 2005/04/04 20:02:09 khussey Exp $
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
import org.eclipse.uml2.BehavioredClassifier;
import org.eclipse.uml2.Implementation;
import org.eclipse.uml2.Interface;
import org.eclipse.uml2.UML2Factory;
import org.eclipse.uml2.UML2Package;

/**
 * <!-- begin-user-doc -->
 * A test case for the '<em><b>Implementation</b></em>' item provider adapter.
 * <!-- end-user-doc -->
 * @generated
 */
public class ImplementationItemProviderTest extends RealizationItemProviderTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2003, 2005 IBM Corporation and others."; //$NON-NLS-1$

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ImplementationItemProviderTest.class);
	}

	/**
	 * Constructs a new Implementation item provider adapter test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImplementationItemProviderTest(String name) {
		super(name);
	}

	/**
	 * Returns the model object for this Implementation item provider adapter test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private Implementation getModelObject() {
		return (Implementation) modelObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	protected void setUp() throws Exception {
		super.setUp();

		setModelObject(UML2Factory.eINSTANCE.createImplementation());
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.provider.ImplementationItemProvider#createRemoveCommand(org.eclipse.emf.edit.domain.EditingDomain, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EReference, java.util.Collection) <em>Create Remove Command</em>}' method.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.provider.ImplementationItemProvider#createRemoveCommand(org.eclipse.emf.edit.domain.EditingDomain, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EReference, java.util.Collection)
	 * @generated
	 */
	public void testCreateRemoveCommandGen() {
		// TODO: implement this remove command creation test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	public void testCreateRemoveCommand() {
		testCreateRemoveCommandGen();
		
		super.testCreateRemoveCommand();
		
		// test IMPLEMENTATION__SUPPLIER superset...
		Interface interface_ = UML2Factory.eINSTANCE.createInterface();
		
		getModelObject().setContract(interface_);
		
		Command command =
			RemoveCommand.create(getEditingDomain(), getModelObject(), UML2Package.eINSTANCE.getDependency_Supplier(), Collections.singleton(interface_));
		
		getCommandStack().execute(command);
		
		assertFalse(getModelObject().getSuppliers().contains(interface_));
		assertNotSame(interface_, getModelObject().getContract());
		
		getCommandStack().undo();
		
		assertTrue(getModelObject().getSuppliers().contains(interface_));
		assertSame(interface_, getModelObject().getContract());
		
		getCommandStack().redo();
		
		assertFalse(getModelObject().getSuppliers().contains(interface_));
		assertNotSame(interface_, getModelObject().getContract());
		
		// test IMPLEMENTATION__CLIENT superset...
		for (Iterator eAllSubClasses = getEAllSubClasses(UML2Package.eINSTANCE.getBehavioredClassifier()).iterator(); eAllSubClasses.hasNext();) {
			BehavioredClassifier behavioredClassifier = (BehavioredClassifier) UML2Factory.eINSTANCE.create((EClass) eAllSubClasses.next());
			
			getModelObject().setImplementingClassifier(behavioredClassifier);
			
			command =
				RemoveCommand.create(
					getEditingDomain(),
					getModelObject(),
					UML2Package.eINSTANCE.getDependency_Client(),
					Collections.singleton(behavioredClassifier));
			
			getCommandStack().execute(command);
			
			assertFalse(getModelObject().getClients().contains(behavioredClassifier));
			assertNotSame(behavioredClassifier, getModelObject().getImplementingClassifier());
			
			getCommandStack().undo();
			
			assertTrue(getModelObject().getClients().contains(behavioredClassifier));
			assertSame(behavioredClassifier, getModelObject().getImplementingClassifier());
			
			getCommandStack().redo();
			
			assertFalse(getModelObject().getClients().contains(behavioredClassifier));
			assertNotSame(behavioredClassifier, getModelObject().getImplementingClassifier());
		}
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.provider.ImplementationItemProvider#createReplaceCommand(org.eclipse.emf.edit.domain.EditingDomain, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EReference, org.eclipse.emf.ecore.EObject, java.util.Collection) <em>Create Replace Command</em>}' method.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.provider.ImplementationItemProvider#createReplaceCommand(org.eclipse.emf.edit.domain.EditingDomain, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EReference, org.eclipse.emf.ecore.EObject, java.util.Collection)
	 * @generated
	 */
	public void testCreateReplaceCommandGen() {
		// TODO: implement this replace command creation test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	public void testCreateReplaceCommand() {
		testCreateReplaceCommandGen();
		
		super.testCreateReplaceCommand();
		
		// test IMPLEMENTATION__SUPPLIER superset...
		Interface interface_ = UML2Factory.eINSTANCE.createInterface();
		Interface replacementInterface = UML2Factory.eINSTANCE.createInterface();
		
		getModelObject().setContract(interface_);
		
		Command command =
			ReplaceCommand.create(
				getEditingDomain(),
				getModelObject(),
				UML2Package.eINSTANCE.getDependency_Supplier(),
				interface_,
				Collections.singleton(replacementInterface));
		
		getCommandStack().execute(command);
		
		assertFalse(getModelObject().getSuppliers().contains(interface_));
		assertTrue(getModelObject().getSuppliers().contains(replacementInterface));
		assertNotSame(interface_, getModelObject().getContract());
		
		getCommandStack().undo();
		
		assertTrue(getModelObject().getSuppliers().contains(interface_));
		assertFalse(getModelObject().getSuppliers().contains(replacementInterface));
		assertSame(interface_, getModelObject().getContract());
		
		getCommandStack().redo();
		
		assertFalse(getModelObject().getSuppliers().contains(interface_));
		assertTrue(getModelObject().getSuppliers().contains(replacementInterface));
		assertNotSame(interface_, getModelObject().getContract());
		
		// test IMPLEMENTATION__CLIENT superset...
		for (Iterator eAllSubClasses = getEAllSubClasses(UML2Package.eINSTANCE.getBehavioredClassifier()).iterator(); eAllSubClasses.hasNext();) {
			EClass eClass = (EClass) eAllSubClasses.next();
			
			BehavioredClassifier behavioredClassifier = (BehavioredClassifier) UML2Factory.eINSTANCE.create(eClass);
			BehavioredClassifier replacementBehavioredClassifier = (BehavioredClassifier) UML2Factory.eINSTANCE.create(eClass);
			
			getModelObject().setImplementingClassifier(behavioredClassifier);
			
			command =
				ReplaceCommand.create(
					getEditingDomain(),
					getModelObject(),
					UML2Package.eINSTANCE.getDependency_Client(),
					behavioredClassifier,
					Collections.singleton(replacementBehavioredClassifier));
			
			getCommandStack().execute(command);
			
			assertFalse(getModelObject().getClients().contains(behavioredClassifier));
			assertTrue(getModelObject().getClients().contains(replacementBehavioredClassifier));
			assertNotSame(behavioredClassifier, getModelObject().getImplementingClassifier());
			
			getCommandStack().undo();
			
			assertTrue(getModelObject().getClients().contains(behavioredClassifier));
			assertFalse(getModelObject().getClients().contains(replacementBehavioredClassifier));
			assertSame(behavioredClassifier, getModelObject().getImplementingClassifier());
			
			getCommandStack().redo();
			
			assertFalse(getModelObject().getClients().contains(behavioredClassifier));
			assertTrue(getModelObject().getClients().contains(replacementBehavioredClassifier));
			assertNotSame(behavioredClassifier, getModelObject().getImplementingClassifier());
		}
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.provider.ImplementationItemProvider#createSetCommand(org.eclipse.emf.edit.domain.EditingDomain, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EStructuralFeature, java.lang.Object) <em>Create Set Command</em>}' method.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.provider.ImplementationItemProvider#createSetCommand(org.eclipse.emf.edit.domain.EditingDomain, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EStructuralFeature, java.lang.Object)
	 * @generated
	 */
	public void testCreateSetCommandGen() {
		// TODO: implement this set command creation test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	public void testCreateSetCommand() {
		testCreateSetCommandGen();
		
		super.testCreateSetCommand();
		
		// test IMPLEMENTATION__CONTRACT subset...
		Interface interface_ = UML2Factory.eINSTANCE.createInterface();
		
		Command command = SetCommand.create(getEditingDomain(), getModelObject(), UML2Package.eINSTANCE.getImplementation_Contract(), interface_);
		
		getCommandStack().execute(command);
		
		assertSame(interface_, getModelObject().getContract());
		assertTrue(getModelObject().getSuppliers().contains(interface_));
		
		getCommandStack().undo();
		
		assertNotSame(interface_, getModelObject().getContract());
		assertFalse(getModelObject().getSuppliers().contains(interface_));
		
		getCommandStack().redo();
		
		assertSame(interface_, getModelObject().getContract());
		assertTrue(getModelObject().getSuppliers().contains(interface_));
		
		// test IMPLEMENTATION__IMPLEMENTING_CLASSIFIER subset...
		for (Iterator eAllSubClasses = getEAllSubClasses(UML2Package.eINSTANCE.getBehavioredClassifier()).iterator(); eAllSubClasses.hasNext();) {
			BehavioredClassifier behavioredClassifier = (BehavioredClassifier) UML2Factory.eINSTANCE.create((EClass) eAllSubClasses.next());
			
			command =
				SetCommand.create(getEditingDomain(), getModelObject(), UML2Package.eINSTANCE.getImplementation_ImplementingClassifier(), behavioredClassifier);
			
			getCommandStack().execute(command);
			
			assertSame(behavioredClassifier, getModelObject().getImplementingClassifier());
			assertTrue(getModelObject().getClients().contains(behavioredClassifier));
			
			getCommandStack().undo();
			
			assertNotSame(behavioredClassifier, getModelObject().getImplementingClassifier());
			assertFalse(getModelObject().getClients().contains(behavioredClassifier));
			
			getCommandStack().redo();
			
			assertSame(behavioredClassifier, getModelObject().getImplementingClassifier());
			assertTrue(getModelObject().getClients().contains(behavioredClassifier));
		}
	}

} //ImplementationItemProviderTest
