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
 * $Id: DeploymentTargetItemProviderTest.java,v 1.1 2004/04/29 14:43:45 khussey Exp $
 */
package org.eclipse.uml2.provider.tests;

import java.util.Collections;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.edit.command.CommandParameter;
import org.eclipse.emf.edit.command.RemoveCommand;
import org.eclipse.emf.edit.command.ReplaceCommand;
import org.eclipse.uml2.Deployment;
import org.eclipse.uml2.DeploymentTarget;
import org.eclipse.uml2.UML2Factory;
import org.eclipse.uml2.UML2Package;

/**
 * <!-- begin-user-doc -->
 * A test case for the '<em><b>Deployment Target</b></em>' item provider adapter.
 * <!-- end-user-doc -->
 * @generated
 */
public abstract class DeploymentTargetItemProviderTest extends NamedElementItemProviderTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2003, 2004 IBM Corporation and others."; //$NON-NLS-1$

	/**
	 * Constructs a new Deployment Target item provider adapter test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeploymentTargetItemProviderTest(String name) {
		super(name);
	}

	/**
	 * Returns the model object for this Deployment Target item provider adapter test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private DeploymentTarget getModelObject() {
		return (DeploymentTarget) modelObject;
	}
	/**
	 * Tests the '{@link org.eclipse.uml2.provider.DeploymentTargetItemProvider#createAddCommand(org.eclipse.emf.edit.domain.EditingDomain, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EStructuralFeature, java.util.Collection, int) <em>Create Add Command</em>}' method.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.provider.DeploymentTargetItemProvider#createAddCommand(org.eclipse.emf.edit.domain.EditingDomain, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EStructuralFeature, java.util.Collection, int)
	 * @generated NOT
	 */
	public void testCreateAddCommand() {
		
		// test DEPLOYMENT_TARGET__DEPLOYMENT subset...
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
	 * Tests the '{@link org.eclipse.uml2.provider.DeploymentTargetItemProvider#createRemoveCommand(org.eclipse.emf.edit.domain.EditingDomain, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EReference, java.util.Collection) <em>Create Remove Command</em>}' method.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.provider.DeploymentTargetItemProvider#createRemoveCommand(org.eclipse.emf.edit.domain.EditingDomain, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EReference, java.util.Collection)
	 * @generated NOT
	 */
	public void testCreateRemoveCommand() {
		
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
	 * Tests the '{@link org.eclipse.uml2.provider.DeploymentTargetItemProvider#createReplaceCommand(org.eclipse.emf.edit.domain.EditingDomain, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EReference, org.eclipse.emf.ecore.EObject, java.util.Collection) <em>Create Replace Command</em>}' method.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.provider.DeploymentTargetItemProvider#createReplaceCommand(org.eclipse.emf.edit.domain.EditingDomain, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EReference, org.eclipse.emf.ecore.EObject, java.util.Collection)
	 * @generated NOT
	 */
	public void testCreateReplaceCommand() {
		
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

} //DeploymentTargetItemProviderTest
