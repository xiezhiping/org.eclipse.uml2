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
 * $Id: BehaviorItemProviderTest.java,v 1.2 2005/03/15 18:49:59 khussey Exp $
 */
package org.eclipse.uml2.provider.tests;

import java.util.Collections;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.edit.command.CommandParameter;
import org.eclipse.emf.edit.command.RemoveCommand;
import org.eclipse.emf.edit.command.ReplaceCommand;
import org.eclipse.uml2.Behavior;
import org.eclipse.uml2.Constraint;
import org.eclipse.uml2.UML2Factory;
import org.eclipse.uml2.UML2Package;

/**
 * <!-- begin-user-doc -->
 * A test case for the '<em><b>Behavior</b></em>' item provider adapter.
 * <!-- end-user-doc -->
 * @generated
 */
public abstract class BehaviorItemProviderTest extends ClassItemProviderTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2003, 2004 IBM Corporation and others."; //$NON-NLS-1$

	/**
	 * Constructs a new Behavior item provider adapter test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BehaviorItemProviderTest(String name) {
		super(name);
	}

	/**
	 * Returns the model object for this Behavior item provider adapter test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private Behavior getModelObject() {
		return (Behavior) modelObject;
	}
	/**
	 * Tests the '{@link org.eclipse.uml2.provider.BehaviorItemProvider#createAddCommand(org.eclipse.emf.edit.domain.EditingDomain, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EStructuralFeature, java.util.Collection, int) <em>Create Add Command</em>}' method.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.provider.BehaviorItemProvider#createAddCommand(org.eclipse.emf.edit.domain.EditingDomain, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EStructuralFeature, java.util.Collection, int)
	 * @generated NOT
	 */
	public void testCreateAddCommand() {
		super.testCreateAddCommand();
		
		// test BEHAVIOR__PRECONDITION subset...
		Constraint constraint = UML2Factory.eINSTANCE.createConstraint();
		
		Command command =
			AddCommand.create(
				getEditingDomain(),
				getModelObject(),
				UML2Package.eINSTANCE.getBehavior_Precondition(),
				Collections.singleton(constraint),
				CommandParameter.NO_INDEX);
		
		getCommandStack().execute(command);
		
		assertTrue(getModelObject().getPreconditions().contains(constraint));
		assertTrue(getModelObject().getOwnedRules().contains(constraint));
		
		getCommandStack().undo();
		
		assertFalse(getModelObject().getPreconditions().contains(constraint));
		assertFalse(getModelObject().getOwnedRules().contains(constraint));
		
		getCommandStack().redo();
		
		assertTrue(getModelObject().getPreconditions().contains(constraint));
		assertTrue(getModelObject().getOwnedRules().contains(constraint));
		
		// test BEHAVIOR__POSTCONDITION subset...
		constraint = UML2Factory.eINSTANCE.createConstraint();
		
		command =
			AddCommand.create(
				getEditingDomain(),
				getModelObject(),
				UML2Package.eINSTANCE.getBehavior_Postcondition(),
				Collections.singleton(constraint),
				CommandParameter.NO_INDEX);
		
		getCommandStack().execute(command);
		
		assertTrue(getModelObject().getPostconditions().contains(constraint));
		assertTrue(getModelObject().getOwnedRules().contains(constraint));
		
		getCommandStack().undo();
		
		assertFalse(getModelObject().getPostconditions().contains(constraint));
		assertFalse(getModelObject().getOwnedRules().contains(constraint));
		
		getCommandStack().redo();
		
		assertTrue(getModelObject().getPostconditions().contains(constraint));
		assertTrue(getModelObject().getOwnedRules().contains(constraint));
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.provider.BehaviorItemProvider#createRemoveCommand(org.eclipse.emf.edit.domain.EditingDomain, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EReference, java.util.Collection) <em>Create Remove Command</em>}' method.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.provider.BehaviorItemProvider#createRemoveCommand(org.eclipse.emf.edit.domain.EditingDomain, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EReference, java.util.Collection)
	 * @generated NOT
	 */
	public void testCreateRemoveCommand() {
		super.testCreateRemoveCommand();
		
		// test BEHAVIOR__OWNED_RULE superset...
		Constraint constraint = UML2Factory.eINSTANCE.createConstraint();
		
		getModelObject().getPreconditions().add(constraint);
		
		Command command =
			RemoveCommand.create(getEditingDomain(), getModelObject(), UML2Package.eINSTANCE.getNamespace_OwnedRule(), Collections.singleton(constraint));
		
		getCommandStack().execute(command);
		
		assertFalse(getModelObject().getPreconditions().contains(constraint));
		assertFalse(getModelObject().getOwnedRules().contains(constraint));
		
		getCommandStack().undo();
		
		assertTrue(getModelObject().getPreconditions().contains(constraint));
		assertTrue(getModelObject().getOwnedRules().contains(constraint));
		
		getCommandStack().redo();
		
		assertFalse(getModelObject().getPreconditions().contains(constraint));
		assertFalse(getModelObject().getOwnedRules().contains(constraint));
		
		constraint = UML2Factory.eINSTANCE.createConstraint();
		
		getModelObject().getPostconditions().add(constraint);
		
		command = RemoveCommand.create(getEditingDomain(), getModelObject(), UML2Package.eINSTANCE.getNamespace_OwnedRule(), Collections.singleton(constraint));
		
		getCommandStack().execute(command);
		
		assertFalse(getModelObject().getPostconditions().contains(constraint));
		assertFalse(getModelObject().getOwnedRules().contains(constraint));
		
		getCommandStack().undo();
		
		assertTrue(getModelObject().getPostconditions().contains(constraint));
		assertTrue(getModelObject().getOwnedRules().contains(constraint));
		
		getCommandStack().redo();
		
		assertFalse(getModelObject().getPostconditions().contains(constraint));
		assertFalse(getModelObject().getOwnedRules().contains(constraint));
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.provider.BehaviorItemProvider#createReplaceCommand(org.eclipse.emf.edit.domain.EditingDomain, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EReference, org.eclipse.emf.ecore.EObject, java.util.Collection) <em>Create Replace Command</em>}' method.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.provider.BehaviorItemProvider#createReplaceCommand(org.eclipse.emf.edit.domain.EditingDomain, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EReference, org.eclipse.emf.ecore.EObject, java.util.Collection)
	 * @generated NOT
	 */
	public void testCreateReplaceCommand() {
		super.testCreateReplaceCommand();
		
		// test BEHAVIOR__PRECONDITION subset...
		Constraint constraint = UML2Factory.eINSTANCE.createConstraint();
		Constraint replacementConstraint = UML2Factory.eINSTANCE.createConstraint();
		
		getModelObject().getPreconditions().add(constraint);
		
		Command command =
			ReplaceCommand.create(
				getEditingDomain(),
				getModelObject(),
				UML2Package.eINSTANCE.getBehavior_Precondition(),
				constraint,
				Collections.singleton(replacementConstraint));
		
		getCommandStack().execute(command);
		
		assertFalse(getModelObject().getPreconditions().contains(constraint));
		assertTrue(getModelObject().getPreconditions().contains(replacementConstraint));
		assertTrue(getModelObject().getOwnedRules().contains(replacementConstraint));
		
		getCommandStack().undo();
		
		assertTrue(getModelObject().getPreconditions().contains(constraint));
		assertFalse(getModelObject().getPreconditions().contains(replacementConstraint));
		assertFalse(getModelObject().getOwnedRules().contains(replacementConstraint));
		
		getCommandStack().redo();
		
		assertFalse(getModelObject().getPreconditions().contains(constraint));
		assertTrue(getModelObject().getPreconditions().contains(replacementConstraint));
		assertTrue(getModelObject().getOwnedRules().contains(replacementConstraint));
		
		// test BEHAVIOR__PRECONDITION subset...
		constraint = UML2Factory.eINSTANCE.createConstraint();
		replacementConstraint = UML2Factory.eINSTANCE.createConstraint();
		
		getModelObject().getPostconditions().add(constraint);
		
		command =
			ReplaceCommand.create(
				getEditingDomain(),
				getModelObject(),
				UML2Package.eINSTANCE.getBehavior_Postcondition(),
				constraint,
				Collections.singleton(replacementConstraint));
		
		getCommandStack().execute(command);
		
		assertFalse(getModelObject().getPostconditions().contains(constraint));
		assertTrue(getModelObject().getPostconditions().contains(replacementConstraint));
		assertTrue(getModelObject().getOwnedRules().contains(replacementConstraint));
		
		getCommandStack().undo();
		
		assertTrue(getModelObject().getPostconditions().contains(constraint));
		assertFalse(getModelObject().getPostconditions().contains(replacementConstraint));
		assertFalse(getModelObject().getOwnedRules().contains(replacementConstraint));
		
		getCommandStack().redo();
		
		assertFalse(getModelObject().getPostconditions().contains(constraint));
		assertTrue(getModelObject().getPostconditions().contains(replacementConstraint));
		assertTrue(getModelObject().getOwnedRules().contains(replacementConstraint));
		
		// test BEHAVIOR__OWNED_RULE superset...
		constraint = UML2Factory.eINSTANCE.createConstraint();
		replacementConstraint = UML2Factory.eINSTANCE.createConstraint();
		
		getModelObject().getPreconditions().add(constraint);
		
		command =
			ReplaceCommand.create(
				getEditingDomain(),
				getModelObject(),
				UML2Package.eINSTANCE.getNamespace_OwnedRule(),
				constraint,
				Collections.singleton(replacementConstraint));
		
		getCommandStack().execute(command);
		
		assertFalse(getModelObject().getOwnedRules().contains(constraint));
		assertTrue(getModelObject().getOwnedRules().contains(replacementConstraint));
		assertFalse(getModelObject().getPreconditions().contains(constraint));
		
		getCommandStack().undo();
		
		assertTrue(getModelObject().getOwnedRules().contains(constraint));
		assertFalse(getModelObject().getOwnedRules().contains(replacementConstraint));
		assertTrue(getModelObject().getPreconditions().contains(constraint));
		
		getCommandStack().redo();
		
		assertFalse(getModelObject().getOwnedRules().contains(constraint));
		assertTrue(getModelObject().getOwnedRules().contains(replacementConstraint));
		assertFalse(getModelObject().getPreconditions().contains(constraint));
		
		constraint = UML2Factory.eINSTANCE.createConstraint();
		replacementConstraint = UML2Factory.eINSTANCE.createConstraint();
		
		getModelObject().getPostconditions().add(constraint);
		
		command =
			ReplaceCommand.create(
				getEditingDomain(),
				getModelObject(),
				UML2Package.eINSTANCE.getNamespace_OwnedRule(),
				constraint,
				Collections.singleton(replacementConstraint));
		
		getCommandStack().execute(command);
		
		assertFalse(getModelObject().getOwnedRules().contains(constraint));
		assertTrue(getModelObject().getOwnedRules().contains(replacementConstraint));
		assertFalse(getModelObject().getPostconditions().contains(constraint));
		
		getCommandStack().undo();
		
		assertTrue(getModelObject().getOwnedRules().contains(constraint));
		assertFalse(getModelObject().getOwnedRules().contains(replacementConstraint));
		assertTrue(getModelObject().getPostconditions().contains(constraint));
		
		getCommandStack().redo();
		
		assertFalse(getModelObject().getOwnedRules().contains(constraint));
		assertTrue(getModelObject().getOwnedRules().contains(replacementConstraint));
		assertFalse(getModelObject().getPostconditions().contains(constraint));
	}

} //BehaviorItemProviderTest
