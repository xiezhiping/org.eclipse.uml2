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
 * $Id: InstanceSpecificationItemProviderTest.java,v 1.3 2005/04/04 20:02:08 khussey Exp $
 */
package org.eclipse.uml2.provider.tests;

import java.util.Collections;

import junit.textui.TestRunner;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.edit.command.CommandParameter;
import org.eclipse.emf.edit.command.RemoveCommand;
import org.eclipse.emf.edit.command.ReplaceCommand;
import org.eclipse.uml2.Deployment;
import org.eclipse.uml2.InstanceSpecification;
import org.eclipse.uml2.UML2Factory;
import org.eclipse.uml2.UML2Package;

/**
 * <!-- begin-user-doc -->
 * A test case for the '<em><b>Instance Specification</b></em>' item provider adapter.
 * <!-- end-user-doc -->
 * @generated
 */
public class InstanceSpecificationItemProviderTest extends PackageableElementItemProviderTest {

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
		TestRunner.run(InstanceSpecificationItemProviderTest.class);
	}

	/**
	 * Constructs a new Instance Specification item provider adapter test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InstanceSpecificationItemProviderTest(String name) {
		super(name);
	}

	/**
	 * Returns the model object for this Instance Specification item provider adapter test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private InstanceSpecification getModelObject() {
		return (InstanceSpecification) modelObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	protected void setUp() throws Exception {
		super.setUp();

		setModelObject(UML2Factory.eINSTANCE.createInstanceSpecification());
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.provider.InstanceSpecificationItemProvider#createAddCommand(org.eclipse.emf.edit.domain.EditingDomain, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EStructuralFeature, java.util.Collection, int) <em>Create Add Command</em>}' method.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.provider.InstanceSpecificationItemProvider#createAddCommand(org.eclipse.emf.edit.domain.EditingDomain, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EStructuralFeature, java.util.Collection, int)
	 * @generated
	 */
	public void testCreateAddCommandGen() {
		// TODO: implement this add command creation test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	public void testCreateAddCommand() {
		testCreateAddCommandGen();
		
		// test INSTANCE_SPECIFICATION__DEPLOYMENT subset...
		Deployment deployment = UML2Factory.eINSTANCE.createDeployment();
	
		Command command =
			AddCommand.create(
				getEditingDomain(),
				getModelObject(),
				UML2Package.eINSTANCE.getDeploymentTarget_Deployment(),
				Collections.singleton(deployment),
				CommandParameter.NO_INDEX);
	
		getCommandStack().execute(command);
	
		assertTrue(getModelObject().getDeployments().contains(deployment));
		assertTrue(getModelObject().getClientDependencies().contains(deployment));
	
		getCommandStack().undo();
	
		assertFalse(getModelObject().getDeployments().contains(deployment));
		assertFalse(getModelObject().getClientDependencies().contains(deployment));
	
		getCommandStack().redo();
	
		assertTrue(getModelObject().getDeployments().contains(deployment));
		assertTrue(getModelObject().getClientDependencies().contains(deployment));
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.provider.InstanceSpecificationItemProvider#createRemoveCommand(org.eclipse.emf.edit.domain.EditingDomain, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EReference, java.util.Collection) <em>Create Remove Command</em>}' method.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.provider.InstanceSpecificationItemProvider#createRemoveCommand(org.eclipse.emf.edit.domain.EditingDomain, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EReference, java.util.Collection)
	 * @generated
	 */
	public void testCreateRemoveCommandGen() {
		// TODO: implement this remove command creation test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	public void testCreateRemoveCommand() {
		testCreateRemoveCommandGen();
		
		// test DEPLOYMENT_TARGET__CLIENT_DEPENDENCY superset...
		Deployment deployment = UML2Factory.eINSTANCE.createDeployment();
	
		getModelObject().getDeployments().add(deployment);
	
		Command command =
			RemoveCommand.create(getEditingDomain(), getModelObject(), UML2Package.eINSTANCE.getNamedElement_ClientDependency(), Collections.singleton(deployment));
	
		getCommandStack().execute(command);
	
		assertFalse(getModelObject().getClientDependencies().contains(deployment));
		assertFalse(getModelObject().getDeployments().contains(deployment));
	
		getCommandStack().undo();
	
		assertTrue(getModelObject().getClientDependencies().contains(deployment));
		assertTrue(getModelObject().getDeployments().contains(deployment));
	
		getCommandStack().redo();
	
		assertFalse(getModelObject().getClientDependencies().contains(deployment));
		assertFalse(getModelObject().getDeployments().contains(deployment));
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.provider.InstanceSpecificationItemProvider#createReplaceCommand(org.eclipse.emf.edit.domain.EditingDomain, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EReference, org.eclipse.emf.ecore.EObject, java.util.Collection) <em>Create Replace Command</em>}' method.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.provider.InstanceSpecificationItemProvider#createReplaceCommand(org.eclipse.emf.edit.domain.EditingDomain, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EReference, org.eclipse.emf.ecore.EObject, java.util.Collection)
	 * @generated
	 */
	public void testCreateReplaceCommandGen() {
		// TODO: implement this replace command creation test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	public void testCreateReplaceCommand() {
		testCreateReplaceCommandGen();
		
		// test DEPLOYMENT_TARGET__DEPLOYMENT subset...
		Deployment deployment = UML2Factory.eINSTANCE.createDeployment();
		Deployment replacementDeployment = UML2Factory.eINSTANCE.createDeployment();
	
		getModelObject().getDeployments().add(deployment);
	
		Command command =
			ReplaceCommand.create(
				getEditingDomain(),
				getModelObject(),
				UML2Package.eINSTANCE.getDeploymentTarget_Deployment(),
				deployment,
				Collections.singleton(replacementDeployment));
	
		getCommandStack().execute(command);
	
		assertFalse(getModelObject().getDeployments().contains(deployment));
		assertTrue(getModelObject().getDeployments().contains(replacementDeployment));
		assertTrue(getModelObject().getClientDependencies().contains(replacementDeployment));
	
		getCommandStack().undo();
	
		assertTrue(getModelObject().getDeployments().contains(deployment));
		assertFalse(getModelObject().getDeployments().contains(replacementDeployment));
		assertFalse(getModelObject().getClientDependencies().contains(replacementDeployment));
	
		getCommandStack().redo();
	
		assertFalse(getModelObject().getDeployments().contains(deployment));
		assertTrue(getModelObject().getDeployments().contains(replacementDeployment));
		assertTrue(getModelObject().getClientDependencies().contains(replacementDeployment));
	
		// test DEPLOYMENT_TARGET__CLIENT_DEPENDENCY superset...
		deployment = UML2Factory.eINSTANCE.createDeployment();
		replacementDeployment = UML2Factory.eINSTANCE.createDeployment();
	
		getModelObject().getDeployments().add(deployment);
	
		command =
			ReplaceCommand.create(
				getEditingDomain(),
				getModelObject(),
				UML2Package.eINSTANCE.getNamedElement_ClientDependency(),
				deployment,
				Collections.singleton(replacementDeployment));
	
		getCommandStack().execute(command);
	
		assertFalse(getModelObject().getClientDependencies().contains(deployment));
		assertTrue(getModelObject().getClientDependencies().contains(replacementDeployment));
		assertFalse(getModelObject().getDeployments().contains(deployment));
	
		getCommandStack().undo();
	
		assertTrue(getModelObject().getClientDependencies().contains(deployment));
		assertFalse(getModelObject().getClientDependencies().contains(replacementDeployment));
		assertTrue(getModelObject().getDeployments().contains(deployment));
	
		getCommandStack().redo();
	
		assertFalse(getModelObject().getClientDependencies().contains(deployment));
		assertTrue(getModelObject().getClientDependencies().contains(replacementDeployment));
		assertFalse(getModelObject().getDeployments().contains(deployment));
	}

} //InstanceSpecificationItemProviderTest
