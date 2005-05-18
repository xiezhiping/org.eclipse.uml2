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
 * $Id: PropertyItemProviderTest.java,v 1.4 2005/05/18 17:04:09 khussey Exp $
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
import org.eclipse.uml2.Association;
import org.eclipse.uml2.ConnectableElementTemplateParameter;
import org.eclipse.uml2.Deployment;
import org.eclipse.uml2.Property;
import org.eclipse.uml2.UML2Factory;
import org.eclipse.uml2.UML2Package;

/**
 * <!-- begin-user-doc -->
 * A test case for the '<em><b>Property</b></em>' item provider adapter.
 * <!-- end-user-doc -->
 * @generated
 */
public class PropertyItemProviderTest extends StructuralFeatureItemProviderTest {

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
		TestRunner.run(PropertyItemProviderTest.class);
	}

	/**
	 * Constructs a new Property item provider adapter test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertyItemProviderTest(String name) {
		super(name);
	}

	/**
	 * Returns the model object for this Property item provider adapter test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private Property getModelObject() {
		return (Property) modelObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	protected void setUp() throws Exception {
		super.setUp();

		setModelObject(UML2Factory.eINSTANCE.createProperty());
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.provider.PropertyItemProvider#createAddCommand(org.eclipse.emf.edit.domain.EditingDomain, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EStructuralFeature, java.util.Collection, int) <em>Create Add Command</em>}' method.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.provider.PropertyItemProvider#createAddCommand(org.eclipse.emf.edit.domain.EditingDomain, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EStructuralFeature, java.util.Collection, int)
	 * @generated
	 */
	public void testCreateAddCommandGen() {
		// TODO: implement this add command creation test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	public void testCreateAddCommand() {
		testCreateAddCommandGen();
		
		// test PROPERTY__DEPLOYMENT subset...
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
	 * Tests the '{@link org.eclipse.uml2.provider.PropertyItemProvider#createRemoveCommand(org.eclipse.emf.edit.domain.EditingDomain, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EReference, java.util.Collection) <em>Create Remove Command</em>}' method.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.provider.PropertyItemProvider#createRemoveCommand(org.eclipse.emf.edit.domain.EditingDomain, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EReference, java.util.Collection)
	 * @generated
	 */
	public void testCreateRemoveCommandGen() {
		// TODO: implement this remove command creation test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	public void testCreateRemoveCommand() {
		testCreateRemoveCommandGen();
		
		// test PROPERTY__CLIENT_DEPENDENCY superset...
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
	 * Tests the '{@link org.eclipse.uml2.provider.PropertyItemProvider#createReplaceCommand(org.eclipse.emf.edit.domain.EditingDomain, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EReference, org.eclipse.emf.ecore.EObject, java.util.Collection) <em>Create Replace Command</em>}' method.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.provider.PropertyItemProvider#createReplaceCommand(org.eclipse.emf.edit.domain.EditingDomain, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EReference, org.eclipse.emf.ecore.EObject, java.util.Collection)
	 * @generated
	 */
	public void testCreateReplaceCommandGen() {
		// TODO: implement this replace command creation test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	public void testCreateReplaceCommand() {
		testCreateReplaceCommandGen();
		
		// test PROPERTY__DEPLOYMENT subset...
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
	
		// test PROPERTY__CLIENT_DEPENDENCY superset...
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

	/**
	 * Tests the '{@link org.eclipse.uml2.provider.PropertyItemProvider#createSetCommand(org.eclipse.emf.edit.domain.EditingDomain, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EStructuralFeature, java.lang.Object) <em>Create Set Command</em>}' method.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.provider.PropertyItemProvider#createSetCommand(org.eclipse.emf.edit.domain.EditingDomain, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EStructuralFeature, java.lang.Object)
	 * @generated
	 */
	public void testCreateSetCommandGen() {
		// TODO: implement this set command creation test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	public void testCreateSetCommand() {
		testCreateSetCommandGen();
		
		// test PROPERTY__OWNING_ASSOCIATION subset...
		Association association = UML2Factory.eINSTANCE.createAssociation();
	
		Command command = SetCommand.create(getEditingDomain(), getModelObject(), UML2Package.eINSTANCE.getProperty_OwningAssociation(), association);
	
		getCommandStack().execute(command);
	
		assertSame(association, getModelObject().getOwningAssociation());
		assertSame(getModelObject().getOwningAssociation(), getModelObject().getAssociation());
	
		getCommandStack().undo();
	
		assertNotSame(association, getModelObject().getOwningAssociation());
		assertSame(getModelObject().getOwningAssociation(), getModelObject().getAssociation());
	
		getCommandStack().redo();
	
		assertSame(association, getModelObject().getOwningAssociation());
		assertSame(getModelObject().getOwningAssociation(), getModelObject().getAssociation());
	
		// test PROPERTY__OWNING_PARAMETER subset...
		ConnectableElementTemplateParameter templateParameter = UML2Factory.eINSTANCE.createConnectableElementTemplateParameter();
	
		command = SetCommand.create(getEditingDomain(), getModelObject(), UML2Package.eINSTANCE.getParameterableElement_OwningParameter(), templateParameter);
	
		getCommandStack().execute(command);
	
		assertSame(templateParameter, getModelObject().getOwningParameter());
		assertSame(getModelObject().getOwningParameter(), getModelObject().getTemplateParameter());
	
		getCommandStack().undo();
	
		assertNotSame(templateParameter, getModelObject().getOwningParameter());
		assertSame(getModelObject().getOwningParameter(), getModelObject().getTemplateParameter());
	
		getCommandStack().redo();
	
		assertSame(templateParameter, getModelObject().getOwningParameter());
		assertSame(getModelObject().getOwningParameter(), getModelObject().getTemplateParameter());
	
		// test PROPERTY__TEMPLATE_PARAMETER superset...
		ConnectableElementTemplateParameter oldTemplateParameter = UML2Factory.eINSTANCE.createConnectableElementTemplateParameter();
		ConnectableElementTemplateParameter newTemplateParameter = UML2Factory.eINSTANCE.createConnectableElementTemplateParameter();
	
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
	
		// test PROPERTY__ASSOCIATION superset...
		Association oldAssociation = UML2Factory.eINSTANCE.createAssociation();
		Association newAssociation = UML2Factory.eINSTANCE.createAssociation();
	
		getModelObject().setOwningAssociation(oldAssociation);
	
		command = SetCommand.create(getEditingDomain(), getModelObject(), UML2Package.eINSTANCE.getProperty_Association(), newAssociation);
	
		getCommandStack().execute(command);
	
		assertSame(newAssociation, getModelObject().getAssociation());
		assertSame(null, getModelObject().getOwningAssociation());
	
		getCommandStack().undo();
	
		assertSame(oldAssociation, getModelObject().getAssociation());
		assertSame(oldAssociation, getModelObject().getOwningAssociation());
	
		getCommandStack().redo();
	
		assertSame(newAssociation, getModelObject().getAssociation());
		assertSame(null, getModelObject().getOwningAssociation());
	}

} //PropertyItemProviderTest
