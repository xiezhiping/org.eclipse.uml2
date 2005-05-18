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
 * $Id: DeploymentItemProviderTest.java,v 1.4 2005/05/18 17:04:09 khussey Exp $
 */
package org.eclipse.uml2.provider.tests;

import java.util.Collections;
import java.util.Iterator;

import junit.textui.TestRunner;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.edit.command.CommandParameter;
import org.eclipse.emf.edit.command.RemoveCommand;
import org.eclipse.emf.edit.command.ReplaceCommand;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.uml2.DeployedArtifact;
import org.eclipse.uml2.Deployment;
import org.eclipse.uml2.DeploymentTarget;
import org.eclipse.uml2.UML2Factory;
import org.eclipse.uml2.UML2Package;

/**
 * <!-- begin-user-doc -->
 * A test case for the '<em><b>Deployment</b></em>' item provider adapter.
 * <!-- end-user-doc -->
 * @generated
 */
public class DeploymentItemProviderTest extends DependencyItemProviderTest {

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
		TestRunner.run(DeploymentItemProviderTest.class);
	}

	/**
	 * Constructs a new Deployment item provider adapter test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeploymentItemProviderTest(String name) {
		super(name);
	}

	/**
	 * Returns the model object for this Deployment item provider adapter test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private Deployment getModelObject() {
		return (Deployment) modelObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	protected void setUp() throws Exception {
		super.setUp();

		setModelObject(UML2Factory.eINSTANCE.createDeployment());
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.provider.DeploymentItemProvider#createAddCommand(org.eclipse.emf.edit.domain.EditingDomain, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EStructuralFeature, java.util.Collection, int) <em>Create Add Command</em>}' method.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.provider.DeploymentItemProvider#createAddCommand(org.eclipse.emf.edit.domain.EditingDomain, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EStructuralFeature, java.util.Collection, int)
	 * @generated
	 */
	public void testCreateAddCommandGen() {
		// TODO: implement this add command creation test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	public void testCreateAddCommand() {
		testCreateAddCommandGen();
		
		// test DEPLOYMENT__DEPLOYED_ARTIFACT subset...
		for (Iterator eAllSubClasses = getEAllSubClasses(UML2Package.eINSTANCE.getDeployedArtifact()).iterator(); eAllSubClasses.hasNext();) {
			DeployedArtifact deployedArtifact = (DeployedArtifact) UML2Factory.eINSTANCE.create((EClass) eAllSubClasses.next());
	
			Command command =
				AddCommand.create(
					getEditingDomain(),
					getModelObject(),
					UML2Package.eINSTANCE.getDeployment_DeployedArtifact(),
					Collections.singleton(deployedArtifact),
					CommandParameter.NO_INDEX);
	
			getCommandStack().execute(command);
	
			assertTrue(getModelObject().getDeployedArtifacts().contains(deployedArtifact));
			assertTrue(getModelObject().getSuppliers().contains(deployedArtifact));
	
			getCommandStack().undo();
	
			assertFalse(getModelObject().getDeployedArtifacts().contains(deployedArtifact));
			assertFalse(getModelObject().getSuppliers().contains(deployedArtifact));
	
			getCommandStack().redo();
	
			assertTrue(getModelObject().getDeployedArtifacts().contains(deployedArtifact));
			assertTrue(getModelObject().getSuppliers().contains(deployedArtifact));
		}
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.provider.DeploymentItemProvider#createRemoveCommand(org.eclipse.emf.edit.domain.EditingDomain, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EReference, java.util.Collection) <em>Create Remove Command</em>}' method.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.provider.DeploymentItemProvider#createRemoveCommand(org.eclipse.emf.edit.domain.EditingDomain, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EReference, java.util.Collection)
	 * @generated
	 */
	public void testCreateRemoveCommandGen() {
		// TODO: implement this remove command creation test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	public void testCreateRemoveCommand() {
		testCreateRemoveCommandGen();
		
		// test DEPLOYMENT__SUPPLIER superset...
		for (Iterator eAllSubClasses = getEAllSubClasses(UML2Package.eINSTANCE.getDeployedArtifact()).iterator(); eAllSubClasses.hasNext();) {
			DeployedArtifact deployedArtifact = (DeployedArtifact) UML2Factory.eINSTANCE.create((EClass) eAllSubClasses.next());
	
			getModelObject().getDeployedArtifacts().add(deployedArtifact);
	
			Command command =
				RemoveCommand.create(getEditingDomain(), getModelObject(), UML2Package.eINSTANCE.getDependency_Supplier(), Collections.singleton(deployedArtifact));
	
			getCommandStack().execute(command);
	
			assertFalse(getModelObject().getSuppliers().contains(deployedArtifact));
			assertFalse(getModelObject().getDeployedArtifacts().contains(deployedArtifact));
	
			getCommandStack().undo();
	
			assertTrue(getModelObject().getSuppliers().contains(deployedArtifact));
			assertTrue(getModelObject().getDeployedArtifacts().contains(deployedArtifact));
	
			getCommandStack().redo();
	
			assertFalse(getModelObject().getSuppliers().contains(deployedArtifact));
			assertFalse(getModelObject().getDeployedArtifacts().contains(deployedArtifact));
		}
	
		// test DEPLOYMENT__CLIENT superset...
		for (Iterator eAllSubClasses = getEAllSubClasses(UML2Package.eINSTANCE.getDeploymentTarget()).iterator(); eAllSubClasses.hasNext();) {
			DeploymentTarget deploymentTarget = (DeploymentTarget) UML2Factory.eINSTANCE.create((EClass) eAllSubClasses.next());
	
			getModelObject().setLocation(deploymentTarget);
	
			Command command =
				RemoveCommand.create(getEditingDomain(), getModelObject(), UML2Package.eINSTANCE.getDependency_Client(), Collections.singleton(deploymentTarget));
	
			getCommandStack().execute(command);
	
			assertFalse(getModelObject().getClients().contains(deploymentTarget));
			assertNotSame(deploymentTarget, getModelObject().getLocation());
	
			getCommandStack().undo();
	
			assertTrue(getModelObject().getClients().contains(deploymentTarget));
			assertSame(deploymentTarget, getModelObject().getLocation());
	
			getCommandStack().redo();
	
			assertFalse(getModelObject().getClients().contains(deploymentTarget));
			assertNotSame(deploymentTarget, getModelObject().getLocation());
		}
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.provider.DeploymentItemProvider#createReplaceCommand(org.eclipse.emf.edit.domain.EditingDomain, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EReference, org.eclipse.emf.ecore.EObject, java.util.Collection) <em>Create Replace Command</em>}' method.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.provider.DeploymentItemProvider#createReplaceCommand(org.eclipse.emf.edit.domain.EditingDomain, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EReference, org.eclipse.emf.ecore.EObject, java.util.Collection)
	 * @generated
	 */
	public void testCreateReplaceCommandGen() {
		// TODO: implement this replace command creation test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	public void testCreateReplaceCommand() {
		testCreateReplaceCommandGen();
		
		// test DEPLOYMENT__DEPLOYED_ARTIFACT subset...
		for (Iterator eAllSubClasses = getEAllSubClasses(UML2Package.eINSTANCE.getDeployedArtifact()).iterator(); eAllSubClasses.hasNext();) {
			EClass eClass = (EClass) eAllSubClasses.next();
	
			DeployedArtifact deployedArtifact = (DeployedArtifact) UML2Factory.eINSTANCE.create(eClass);
			DeployedArtifact replacementDeployedArtifact = (DeployedArtifact) UML2Factory.eINSTANCE.create(eClass);
	
			getModelObject().getDeployedArtifacts().add(deployedArtifact);
	
			Command command =
				ReplaceCommand.create(
					getEditingDomain(),
					getModelObject(),
					UML2Package.eINSTANCE.getDeployment_DeployedArtifact(),
					deployedArtifact,
					Collections.singleton(replacementDeployedArtifact));
	
			getCommandStack().execute(command);
	
			assertFalse(getModelObject().getDeployedArtifacts().contains(deployedArtifact));
			assertTrue(getModelObject().getDeployedArtifacts().contains(replacementDeployedArtifact));
			assertTrue(getModelObject().getSuppliers().contains(replacementDeployedArtifact));
	
			getCommandStack().undo();
	
			assertTrue(getModelObject().getDeployedArtifacts().contains(deployedArtifact));
			assertFalse(getModelObject().getDeployedArtifacts().contains(replacementDeployedArtifact));
			assertFalse(getModelObject().getSuppliers().contains(replacementDeployedArtifact));
	
			getCommandStack().redo();
	
			assertFalse(getModelObject().getDeployedArtifacts().contains(deployedArtifact));
			assertTrue(getModelObject().getDeployedArtifacts().contains(replacementDeployedArtifact));
			assertTrue(getModelObject().getSuppliers().contains(replacementDeployedArtifact));
		}
	
		// test DEPLOYMENT__SUPPLIER superset...
		for (Iterator eAllSubClasses = getEAllSubClasses(UML2Package.eINSTANCE.getDeployedArtifact()).iterator(); eAllSubClasses.hasNext();) {
			EClass eClass = (EClass) eAllSubClasses.next();
	
			DeployedArtifact deployedArtifact = (DeployedArtifact) UML2Factory.eINSTANCE.create(eClass);
			DeployedArtifact replacementDeployedArtifact = (DeployedArtifact) UML2Factory.eINSTANCE.create(eClass);
	
			getModelObject().getDeployedArtifacts().add(deployedArtifact);
	
			Command command =
				ReplaceCommand.create(
					getEditingDomain(),
					getModelObject(),
					UML2Package.eINSTANCE.getDependency_Supplier(),
					deployedArtifact,
					Collections.singleton(replacementDeployedArtifact));
	
			getCommandStack().execute(command);
	
			assertFalse(getModelObject().getSuppliers().contains(deployedArtifact));
			assertTrue(getModelObject().getSuppliers().contains(replacementDeployedArtifact));
			assertFalse(getModelObject().getDeployedArtifacts().contains(deployedArtifact));
	
			getCommandStack().undo();
	
			assertTrue(getModelObject().getSuppliers().contains(deployedArtifact));
			assertFalse(getModelObject().getSuppliers().contains(replacementDeployedArtifact));
			assertTrue(getModelObject().getDeployedArtifacts().contains(deployedArtifact));
	
			getCommandStack().redo();
	
			assertFalse(getModelObject().getSuppliers().contains(deployedArtifact));
			assertTrue(getModelObject().getSuppliers().contains(replacementDeployedArtifact));
			assertFalse(getModelObject().getDeployedArtifacts().contains(deployedArtifact));
		}
	
		// test DEPLOYMENT__CLIENT superset...
		for (Iterator eAllSubClasses = getEAllSubClasses(UML2Package.eINSTANCE.getDeploymentTarget()).iterator(); eAllSubClasses.hasNext();) {
			EClass eClass = (EClass) eAllSubClasses.next();
	
			DeploymentTarget deploymentTarget = (DeploymentTarget) UML2Factory.eINSTANCE.create(eClass);
			DeploymentTarget replacementDeploymentTarget = (DeploymentTarget) UML2Factory.eINSTANCE.create(eClass);
	
			getModelObject().setLocation(deploymentTarget);
	
			Command command =
				ReplaceCommand.create(
					getEditingDomain(),
					getModelObject(),
					UML2Package.eINSTANCE.getDependency_Client(),
					deploymentTarget,
					Collections.singleton(replacementDeploymentTarget));
	
			getCommandStack().execute(command);
	
			assertFalse(getModelObject().getClients().contains(deploymentTarget));
			assertTrue(getModelObject().getClients().contains(replacementDeploymentTarget));
			assertNotSame(deploymentTarget, getModelObject().getLocation());
	
			getCommandStack().undo();
	
			assertTrue(getModelObject().getClients().contains(deploymentTarget));
			assertFalse(getModelObject().getClients().contains(replacementDeploymentTarget));
			assertSame(deploymentTarget, getModelObject().getLocation());
	
			getCommandStack().redo();
	
			assertFalse(getModelObject().getClients().contains(deploymentTarget));
			assertTrue(getModelObject().getClients().contains(replacementDeploymentTarget));
			assertNotSame(deploymentTarget, getModelObject().getLocation());
		}
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.provider.DeploymentItemProvider#createSetCommand(org.eclipse.emf.edit.domain.EditingDomain, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EStructuralFeature, java.lang.Object) <em>Create Set Command</em>}' method.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.provider.DeploymentItemProvider#createSetCommand(org.eclipse.emf.edit.domain.EditingDomain, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EStructuralFeature, java.lang.Object)
	 * @generated
	 */
	public void testCreateSetCommandGen() {
		// TODO: implement this set command creation test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	public void testCreateSetCommand() {
		testCreateSetCommandGen();
		
		super.testCreateSetCommand();
		
		// test DEPLOYMENT__LOCATION subset...
		for (Iterator eAllSubClasses = getEAllSubClasses(UML2Package.eINSTANCE.getDeploymentTarget()).iterator(); eAllSubClasses.hasNext();) {
			DeploymentTarget deploymentTarget = (DeploymentTarget) UML2Factory.eINSTANCE.create((EClass) eAllSubClasses.next());
			
			Command command = SetCommand.create(getEditingDomain(), getModelObject(), UML2Package.eINSTANCE.getDeployment_Location(), deploymentTarget);
			
			getCommandStack().execute(command);
			
			assertSame(deploymentTarget, getModelObject().getLocation());
			assertTrue(getModelObject().getClients().contains(deploymentTarget));
			
			getCommandStack().undo();
			
			assertNotSame(deploymentTarget, getModelObject().getLocation());
			assertFalse(getModelObject().getClients().contains(deploymentTarget));
			
			getCommandStack().redo();
			
			assertSame(deploymentTarget, getModelObject().getLocation());
			assertTrue(getModelObject().getClients().contains(deploymentTarget));
		}
	}

} //DeploymentItemProviderTest
