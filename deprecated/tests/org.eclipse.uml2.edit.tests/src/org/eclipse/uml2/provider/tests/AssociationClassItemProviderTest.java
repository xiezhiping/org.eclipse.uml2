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
 * $Id: AssociationClassItemProviderTest.java,v 1.4 2005/05/18 17:04:05 khussey Exp $
 */
package org.eclipse.uml2.provider.tests;

import java.util.Collections;

import junit.textui.TestRunner;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.edit.command.CommandParameter;
import org.eclipse.emf.edit.command.RemoveCommand;
import org.eclipse.emf.edit.command.ReplaceCommand;
import org.eclipse.uml2.AssociationClass;
import org.eclipse.uml2.Property;
import org.eclipse.uml2.UML2Factory;
import org.eclipse.uml2.UML2Package;

/**
 * <!-- begin-user-doc -->
 * A test case for the '<em><b>Association Class</b></em>' item provider adapter.
 * <!-- end-user-doc -->
 * @generated
 */
public class AssociationClassItemProviderTest extends ClassItemProviderTest {

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
		TestRunner.run(AssociationClassItemProviderTest.class);
	}

	/**
	 * Constructs a new Association Class item provider adapter test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssociationClassItemProviderTest(String name) {
		super(name);
	}

	/**
	 * Returns the model object for this Association Class item provider adapter test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private AssociationClass getModelObject() {
		return (AssociationClass) modelObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	protected void setUp() throws Exception {
		super.setUp();

		setModelObject(UML2Factory.eINSTANCE.createAssociationClass());
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.provider.AssociationClassItemProvider#createAddCommand(org.eclipse.emf.edit.domain.EditingDomain, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EStructuralFeature, java.util.Collection, int) <em>Create Add Command</em>}' method.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.provider.AssociationClassItemProvider#createAddCommand(org.eclipse.emf.edit.domain.EditingDomain, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EStructuralFeature, java.util.Collection, int)
	 * @generated
	 */
	public void testCreateAddCommandGen() {
		// TODO: implement this add command creation test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	public void testCreateAddCommand() {
		testCreateAddCommandGen();
		
		super.testCreateAddCommand();
		
		// test ASSOCIATION_CLASS__OWNED_END subset...
		Property property = UML2Factory.eINSTANCE.createProperty();
		
		Command command =
			AddCommand.create(
				getEditingDomain(),
				getModelObject(),
				UML2Package.eINSTANCE.getAssociation_OwnedEnd(),
				Collections.singleton(property),
				CommandParameter.NO_INDEX);
		
		getCommandStack().execute(command);
		
		assertTrue(getModelObject().getOwnedEnds().contains(property));
		assertTrue(getModelObject().getMemberEnds().contains(property));
		
		getCommandStack().undo();
		
		assertFalse(getModelObject().getOwnedEnds().contains(property));
		assertFalse(getModelObject().getMemberEnds().contains(property));
		
		getCommandStack().redo();
		
		assertTrue(getModelObject().getOwnedEnds().contains(property));
		assertTrue(getModelObject().getMemberEnds().contains(property));
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.provider.AssociationClassItemProvider#createRemoveCommand(org.eclipse.emf.edit.domain.EditingDomain, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EReference, java.util.Collection) <em>Create Remove Command</em>}' method.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.provider.AssociationClassItemProvider#createRemoveCommand(org.eclipse.emf.edit.domain.EditingDomain, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EReference, java.util.Collection)
	 * @generated
	 */
	public void testCreateRemoveCommandGen() {
		// TODO: implement this remove command creation test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	public void testCreateRemoveCommand() {
		testCreateRemoveCommandGen();
		
		super.testCreateRemoveCommand();
		
		// test ASSOCIATION_CLASS__MEMBER_END superset...
		Property property = UML2Factory.eINSTANCE.createProperty();
		
		getModelObject().getOwnedEnds().add(property);
		
		Command command =
			RemoveCommand.create(getEditingDomain(), getModelObject(), UML2Package.eINSTANCE.getAssociation_MemberEnd(), Collections.singleton(property));
		
		getCommandStack().execute(command);
		
		assertFalse(getModelObject().getMemberEnds().contains(property));
		assertFalse(getModelObject().getOwnedEnds().contains(property));
		
		getCommandStack().undo();
		
		assertTrue(getModelObject().getMemberEnds().contains(property));
		assertTrue(getModelObject().getOwnedEnds().contains(property));
		
		getCommandStack().redo();
		
		assertFalse(getModelObject().getMemberEnds().contains(property));
		assertFalse(getModelObject().getOwnedEnds().contains(property));
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.provider.AssociationClassItemProvider#createReplaceCommand(org.eclipse.emf.edit.domain.EditingDomain, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EReference, org.eclipse.emf.ecore.EObject, java.util.Collection) <em>Create Replace Command</em>}' method.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.provider.AssociationClassItemProvider#createReplaceCommand(org.eclipse.emf.edit.domain.EditingDomain, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EReference, org.eclipse.emf.ecore.EObject, java.util.Collection)
	 * @generated
	 */
	public void testCreateReplaceCommandGen() {
		// TODO: implement this replace command creation test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	public void testCreateReplaceCommand() {
		testCreateReplaceCommandGen();
		
		super.testCreateReplaceCommand();
		
		// test ASSOCIATION_CLASS__OWNED_END subset...
		Property property = UML2Factory.eINSTANCE.createProperty();
		Property replacementProperty = UML2Factory.eINSTANCE.createProperty();
		
		getModelObject().getOwnedEnds().add(property);
		
		Command command =
			ReplaceCommand.create(
				getEditingDomain(),
				getModelObject(),
				UML2Package.eINSTANCE.getAssociation_OwnedEnd(),
				property,
				Collections.singleton(replacementProperty));
		
		getCommandStack().execute(command);
		
		assertFalse(getModelObject().getOwnedEnds().contains(property));
		assertTrue(getModelObject().getOwnedEnds().contains(replacementProperty));
		assertTrue(getModelObject().getMemberEnds().contains(replacementProperty));
		
		getCommandStack().undo();
		
		assertTrue(getModelObject().getOwnedEnds().contains(property));
		assertFalse(getModelObject().getOwnedEnds().contains(replacementProperty));
		assertFalse(getModelObject().getMemberEnds().contains(replacementProperty));
		
		getCommandStack().redo();
		
		assertFalse(getModelObject().getOwnedEnds().contains(property));
		assertTrue(getModelObject().getOwnedEnds().contains(replacementProperty));
		assertTrue(getModelObject().getMemberEnds().contains(replacementProperty));
		
		// test ASSOCIATION_CLASS__MEMBER_END superset...
		property = UML2Factory.eINSTANCE.createProperty();
		replacementProperty = UML2Factory.eINSTANCE.createProperty();
		
		getModelObject().getOwnedEnds().add(property);
		
		command =
			ReplaceCommand.create(
				getEditingDomain(),
				getModelObject(),
				UML2Package.eINSTANCE.getAssociation_MemberEnd(),
				property,
				Collections.singleton(replacementProperty));
		
		getCommandStack().execute(command);
		
		assertFalse(getModelObject().getMemberEnds().contains(property));
		assertTrue(getModelObject().getMemberEnds().contains(replacementProperty));
		assertFalse(getModelObject().getOwnedEnds().contains(property));
		
		getCommandStack().undo();
		
		assertTrue(getModelObject().getMemberEnds().contains(property));
		assertFalse(getModelObject().getMemberEnds().contains(replacementProperty));
		assertTrue(getModelObject().getOwnedEnds().contains(property));
		
		getCommandStack().redo();
		
		assertFalse(getModelObject().getMemberEnds().contains(property));
		assertTrue(getModelObject().getMemberEnds().contains(replacementProperty));
		assertFalse(getModelObject().getOwnedEnds().contains(property));
	}

} //AssociationClassItemProviderTest
