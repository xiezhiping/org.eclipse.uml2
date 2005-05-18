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
 * $Id: ComponentItemProviderTest.java,v 1.4 2005/05/18 17:04:09 khussey Exp $
 */
package org.eclipse.uml2.provider.tests;

import java.util.Collections;

import junit.textui.TestRunner;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.edit.command.CommandParameter;
import org.eclipse.emf.edit.command.RemoveCommand;
import org.eclipse.emf.edit.command.ReplaceCommand;
import org.eclipse.uml2.Component;
import org.eclipse.uml2.Realization;
import org.eclipse.uml2.UML2Factory;
import org.eclipse.uml2.UML2Package;

/**
 * <!-- begin-user-doc -->
 * A test case for the '<em><b>Component</b></em>' item provider adapter.
 * <!-- end-user-doc -->
 * @generated
 */
public class ComponentItemProviderTest extends ClassItemProviderTest {

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
		TestRunner.run(ComponentItemProviderTest.class);
	}

	/**
	 * Constructs a new Component item provider adapter test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentItemProviderTest(String name) {
		super(name);
	}

	/**
	 * Returns the model object for this Component item provider adapter test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private Component getModelObject() {
		return (Component) modelObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	protected void setUp() throws Exception {
		super.setUp();

		setModelObject(UML2Factory.eINSTANCE.createComponent());
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.provider.ComponentItemProvider#createAddCommand(org.eclipse.emf.edit.domain.EditingDomain, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EStructuralFeature, java.util.Collection, int) <em>Create Add Command</em>}' method.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.provider.ComponentItemProvider#createAddCommand(org.eclipse.emf.edit.domain.EditingDomain, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EStructuralFeature, java.util.Collection, int)
	 * @generated
	 */
	public void testCreateAddCommandGen() {
		// TODO: implement this add command creation test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	public void testCreateAddCommand() {
		testCreateAddCommandGen();
		
		super.testCreateAddCommand();
		
		// test COMPONENT_REALIZATION subset...
		Realization realization = UML2Factory.eINSTANCE.createRealization();
		
		Command command =
			AddCommand.create(
				getEditingDomain(),
				getModelObject(),
				UML2Package.eINSTANCE.getComponent_Realization(),
				Collections.singleton(realization),
				CommandParameter.NO_INDEX);
		
		getCommandStack().execute(command);
		
		assertTrue(getModelObject().getRealizations().contains(realization));
		assertTrue(getModelObject().getClientDependencies().contains(realization));
		
		getCommandStack().undo();
		
		assertFalse(getModelObject().getRealizations().contains(realization));
		assertFalse(getModelObject().getClientDependencies().contains(realization));
		
		getCommandStack().redo();
		
		assertTrue(getModelObject().getRealizations().contains(realization));
		assertTrue(getModelObject().getClientDependencies().contains(realization));
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.provider.ComponentItemProvider#createRemoveCommand(org.eclipse.emf.edit.domain.EditingDomain, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EReference, java.util.Collection) <em>Create Remove Command</em>}' method.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.provider.ComponentItemProvider#createRemoveCommand(org.eclipse.emf.edit.domain.EditingDomain, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EReference, java.util.Collection)
	 * @generated
	 */
	public void testCreateRemoveCommandGen() {
		// TODO: implement this remove command creation test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	public void testCreateRemoveCommand() {
		testCreateRemoveCommandGen();
		
		super.testCreateRemoveCommand();
		
		// test ARTIFACT__CLIENT_DEPENDENCY superset...
		Realization realization = UML2Factory.eINSTANCE.createRealization();
		
		getModelObject().getRealizations().add(realization);
		
		Command command =
			RemoveCommand.create(
				getEditingDomain(),
				getModelObject(),
				UML2Package.eINSTANCE.getNamedElement_ClientDependency(),
				Collections.singleton(realization));
		
		getCommandStack().execute(command);
		
		assertFalse(getModelObject().getClientDependencies().contains(realization));
		assertFalse(getModelObject().getRealizations().contains(realization));
		
		getCommandStack().undo();
		
		assertTrue(getModelObject().getClientDependencies().contains(realization));
		assertTrue(getModelObject().getRealizations().contains(realization));
		
		getCommandStack().redo();
		
		assertFalse(getModelObject().getClientDependencies().contains(realization));
		assertFalse(getModelObject().getRealizations().contains(realization));
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.provider.ComponentItemProvider#createReplaceCommand(org.eclipse.emf.edit.domain.EditingDomain, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EReference, org.eclipse.emf.ecore.EObject, java.util.Collection) <em>Create Replace Command</em>}' method.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.provider.ComponentItemProvider#createReplaceCommand(org.eclipse.emf.edit.domain.EditingDomain, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EReference, org.eclipse.emf.ecore.EObject, java.util.Collection)
	 * @generated
	 */
	public void testCreateReplaceCommandGen() {
		// TODO: implement this replace command creation test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	public void testCreateReplaceCommand() {
		testCreateReplaceCommandGen();
		
		super.testCreateReplaceCommand();
		
		// test COMPONENT_REALIZATION subset...
		Realization realization = UML2Factory.eINSTANCE.createRealization();
		Realization replacementRealization = UML2Factory.eINSTANCE.createRealization();
		
		getModelObject().getRealizations().add(realization);
		
		Command command =
			ReplaceCommand.create(
				getEditingDomain(),
				getModelObject(),
				UML2Package.eINSTANCE.getComponent_Realization(),
				realization,
				Collections.singleton(replacementRealization));
		
		getCommandStack().execute(command);
		
		assertFalse(getModelObject().getRealizations().contains(realization));
		assertTrue(getModelObject().getRealizations().contains(replacementRealization));
		assertTrue(getModelObject().getClientDependencies().contains(replacementRealization));
		
		getCommandStack().undo();
		
		assertTrue(getModelObject().getRealizations().contains(realization));
		assertFalse(getModelObject().getRealizations().contains(replacementRealization));
		assertFalse(getModelObject().getClientDependencies().contains(replacementRealization));
		
		getCommandStack().redo();
		
		assertFalse(getModelObject().getRealizations().contains(realization));
		assertTrue(getModelObject().getRealizations().contains(replacementRealization));
		assertTrue(getModelObject().getClientDependencies().contains(replacementRealization));
		
		// test COMPONENT__CLIENT_DEPENDENCY superset...
		realization = UML2Factory.eINSTANCE.createRealization();
		replacementRealization = UML2Factory.eINSTANCE.createRealization();
		
		getModelObject().getRealizations().add(realization);
		
		command =
			ReplaceCommand.create(
				getEditingDomain(),
				getModelObject(),
				UML2Package.eINSTANCE.getNamedElement_ClientDependency(),
				realization,
				Collections.singleton(replacementRealization));
		
		getCommandStack().execute(command);
		
		assertFalse(getModelObject().getClientDependencies().contains(realization));
		assertTrue(getModelObject().getClientDependencies().contains(replacementRealization));
		assertFalse(getModelObject().getRealizations().contains(realization));
		
		getCommandStack().undo();
		
		assertTrue(getModelObject().getClientDependencies().contains(realization));
		assertFalse(getModelObject().getClientDependencies().contains(replacementRealization));
		assertTrue(getModelObject().getRealizations().contains(realization));
		
		getCommandStack().redo();
		
		assertFalse(getModelObject().getClientDependencies().contains(realization));
		assertTrue(getModelObject().getClientDependencies().contains(replacementRealization));
		assertFalse(getModelObject().getRealizations().contains(realization));
	}

} //ComponentItemProviderTest
