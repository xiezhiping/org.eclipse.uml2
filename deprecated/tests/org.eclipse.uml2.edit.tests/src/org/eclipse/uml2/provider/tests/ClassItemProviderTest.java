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
 * $Id: ClassItemProviderTest.java,v 1.1 2004/04/29 14:43:45 khussey Exp $
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
import org.eclipse.uml2.Behavior;
import org.eclipse.uml2.Implementation;
import org.eclipse.uml2.UML2Factory;
import org.eclipse.uml2.UML2Package;

/**
 * <!-- begin-user-doc -->
 * A test case for the '<em><b>Class</b></em>' item provider adapter.
 * <!-- end-user-doc -->
 * @generated
 */
public class ClassItemProviderTest extends EncapsulatedClassifierItemProviderTest {

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
		TestRunner.run(ClassItemProviderTest.class);
	}

	/**
	 * Constructs a new Class item provider adapter test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassItemProviderTest(String name) {
		super(name);
	}

	/**
	 * Returns the model object for this Class item provider adapter test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private org.eclipse.uml2.Class getModelObject() {
		return (org.eclipse.uml2.Class) modelObject;
	}

	/* (non-Javadoc)
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	protected void setUp() throws Exception {
		super.setUp();

		setModelObject(UML2Factory.eINSTANCE.createClass());
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.provider.ClassItemProvider#createAddCommand(org.eclipse.emf.edit.domain.EditingDomain, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EStructuralFeature, java.util.Collection, int) <em>Create Add Command</em>}' method.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.provider.ClassItemProvider#createAddCommand(org.eclipse.emf.edit.domain.EditingDomain, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EStructuralFeature, java.util.Collection, int)
	 * @generated NOT
	 */
	public void testCreateAddCommand() {
		super.testCreateAddCommand();
		
		// test CLASS__IMPLEMENTATION subset...
		Implementation implementation = UML2Factory.eINSTANCE.createImplementation();
		
		Command command =
			AddCommand.create(
				getEditingDomain(),
				getModelObject(),
				UML2Package.eINSTANCE.getBehavioredClassifier_Implementation(),
				Collections.singleton(implementation),
				CommandParameter.NO_INDEX);
		
		getCommandStack().execute(command);
		
		assertTrue(getModelObject().getImplementations().contains(implementation));
		assertTrue(getModelObject().getClientDependencies().contains(implementation));
		
		getCommandStack().undo();
		
		assertFalse(getModelObject().getImplementations().contains(implementation));
		assertFalse(getModelObject().getClientDependencies().contains(implementation));
		
		getCommandStack().redo();
		
		assertTrue(getModelObject().getImplementations().contains(implementation));
		assertTrue(getModelObject().getClientDependencies().contains(implementation));
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.provider.ClassItemProvider#createRemoveCommand(org.eclipse.emf.edit.domain.EditingDomain, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EReference, java.util.Collection) <em>Create Remove Command</em>}' method.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.provider.ClassItemProvider#createRemoveCommand(org.eclipse.emf.edit.domain.EditingDomain, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EReference, java.util.Collection)
	 * @generated NOT
	 */
	public void testCreateRemoveCommand() {
		super.testCreateRemoveCommand();
		
		// test CLASS__OWNED_BEHAVIOR superset...
		for (Iterator eAllSubClasses = getEAllSubClasses(UML2Package.eINSTANCE.getBehavior()).iterator(); eAllSubClasses.hasNext();) {
			Behavior behavior = (Behavior) UML2Factory.eINSTANCE.create((EClass) eAllSubClasses.next());
			
			getModelObject().setClassifierBehavior(behavior);
			
			Command command =
				RemoveCommand.create(
					getEditingDomain(),
					getModelObject(),
					UML2Package.eINSTANCE.getBehavioredClassifier_OwnedBehavior(),
					Collections.singleton(behavior));
			
			getCommandStack().execute(command);
			
			assertFalse(getModelObject().getOwnedBehaviors().contains(behavior));
			assertNotSame(behavior, getModelObject().getClassifierBehavior());
			
			getCommandStack().undo();
			
			assertTrue(getModelObject().getOwnedBehaviors().contains(behavior));
			assertSame(behavior, getModelObject().getClassifierBehavior());
			
			getCommandStack().redo();
			
			assertFalse(getModelObject().getOwnedBehaviors().contains(behavior));
			assertNotSame(behavior, getModelObject().getClassifierBehavior());
		}
		
		// test CLASS__CLIENT_DEPENDENCY superset...
		Implementation implementation = UML2Factory.eINSTANCE.createImplementation();
		
		getModelObject().getImplementations().add(implementation);
		
		Command command =
			RemoveCommand.create(
				getEditingDomain(),
				getModelObject(),
				UML2Package.eINSTANCE.getNamedElement_ClientDependency(),
				Collections.singleton(implementation));
		
		getCommandStack().execute(command);
		
		assertFalse(getModelObject().getClientDependencies().contains(implementation));
		assertFalse(getModelObject().getImplementations().contains(implementation));
		
		getCommandStack().undo();
		
		assertTrue(getModelObject().getClientDependencies().contains(implementation));
		assertTrue(getModelObject().getImplementations().contains(implementation));
		
		getCommandStack().redo();
		
		assertFalse(getModelObject().getClientDependencies().contains(implementation));
		assertFalse(getModelObject().getImplementations().contains(implementation));
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.provider.ClassItemProvider#createReplaceCommand(org.eclipse.emf.edit.domain.EditingDomain, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EReference, org.eclipse.emf.ecore.EObject, java.util.Collection) <em>Create Replace Command</em>}' method.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.provider.ClassItemProvider#createReplaceCommand(org.eclipse.emf.edit.domain.EditingDomain, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EReference, org.eclipse.emf.ecore.EObject, java.util.Collection)
	 * @generated NOT
	 */
	public void testCreateReplaceCommand() {
		super.testCreateReplaceCommand();
		
		// test CLASS__IMPLEMENTATION subset...
		Implementation implementation = UML2Factory.eINSTANCE.createImplementation();
		Implementation replacementImplementation = UML2Factory.eINSTANCE.createImplementation();
		
		getModelObject().getImplementations().add(implementation);
		
		Command command =
			ReplaceCommand.create(
				getEditingDomain(),
				getModelObject(),
				UML2Package.eINSTANCE.getBehavioredClassifier_Implementation(),
				implementation,
				Collections.singleton(replacementImplementation));
		
		getCommandStack().execute(command);
		
		assertFalse(getModelObject().getImplementations().contains(implementation));
		assertTrue(getModelObject().getImplementations().contains(replacementImplementation));
		assertTrue(getModelObject().getClientDependencies().contains(replacementImplementation));
		
		getCommandStack().undo();
		
		assertTrue(getModelObject().getImplementations().contains(implementation));
		assertFalse(getModelObject().getImplementations().contains(replacementImplementation));
		assertFalse(getModelObject().getClientDependencies().contains(replacementImplementation));
		
		getCommandStack().redo();
		
		assertFalse(getModelObject().getImplementations().contains(implementation));
		assertTrue(getModelObject().getImplementations().contains(replacementImplementation));
		assertTrue(getModelObject().getClientDependencies().contains(replacementImplementation));
		
		// test CLASS__OWNED_BEHAVIOR superset...
		for (Iterator eAllSubClasses = getEAllSubClasses(UML2Package.eINSTANCE.getBehavior()).iterator(); eAllSubClasses.hasNext();) {
			EClass eClass = (EClass) eAllSubClasses.next();
			
			Behavior behavior = (Behavior) UML2Factory.eINSTANCE.create(eClass);
			Behavior replacementBehavior = (Behavior) UML2Factory.eINSTANCE.create(eClass);
			
			getModelObject().setClassifierBehavior(behavior);
			
			command =
				ReplaceCommand.create(
					getEditingDomain(),
					getModelObject(),
					UML2Package.eINSTANCE.getBehavioredClassifier_OwnedBehavior(),
					behavior,
					Collections.singleton(replacementBehavior));
			
			getCommandStack().execute(command);
			
			assertFalse(getModelObject().getOwnedBehaviors().contains(behavior));
			assertTrue(getModelObject().getOwnedBehaviors().contains(replacementBehavior));
			assertNotSame(behavior, getModelObject().getClassifierBehavior());
			
			getCommandStack().undo();
			
			assertTrue(getModelObject().getOwnedBehaviors().contains(behavior));
			assertFalse(getModelObject().getOwnedBehaviors().contains(replacementBehavior));
			assertSame(behavior, getModelObject().getClassifierBehavior());
			
			getCommandStack().redo();
			
			assertFalse(getModelObject().getOwnedBehaviors().contains(behavior));
			assertTrue(getModelObject().getOwnedBehaviors().contains(replacementBehavior));
			assertNotSame(behavior, getModelObject().getClassifierBehavior());
		}
		
		// test CLASS__CLIENT_DEPENDENCY superset...
		implementation = UML2Factory.eINSTANCE.createImplementation();
		replacementImplementation = UML2Factory.eINSTANCE.createImplementation();
		
		getModelObject().getImplementations().add(implementation);
		
		command =
			ReplaceCommand.create(
				getEditingDomain(),
				getModelObject(),
				UML2Package.eINSTANCE.getNamedElement_ClientDependency(),
				implementation,
				Collections.singleton(replacementImplementation));
		
		getCommandStack().execute(command);
		
		assertFalse(getModelObject().getClientDependencies().contains(implementation));
		assertTrue(getModelObject().getClientDependencies().contains(replacementImplementation));
		assertFalse(getModelObject().getImplementations().contains(implementation));
		
		getCommandStack().undo();
		
		assertTrue(getModelObject().getClientDependencies().contains(implementation));
		assertFalse(getModelObject().getClientDependencies().contains(replacementImplementation));
		assertTrue(getModelObject().getImplementations().contains(implementation));
		
		getCommandStack().redo();
		
		assertFalse(getModelObject().getClientDependencies().contains(implementation));
		assertTrue(getModelObject().getClientDependencies().contains(replacementImplementation));
		assertFalse(getModelObject().getImplementations().contains(implementation));
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.provider.ClassItemProvider#createSetCommand(org.eclipse.emf.edit.domain.EditingDomain, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EStructuralFeature, java.lang.Object) <em>Create Set Command</em>}' method.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.provider.ClassItemProvider#createSetCommand(org.eclipse.emf.edit.domain.EditingDomain, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EStructuralFeature, java.lang.Object)
	 * @generated NOT
	 */
	public void testCreateSetCommand() {
		super.testCreateSetCommand();
		
		// test CLASS__CLASSIFIER_BEHAVIOR subset...
		for (Iterator eAllSubClasses = getEAllSubClasses(UML2Package.eINSTANCE.getBehavior()).iterator(); eAllSubClasses.hasNext();) {
			Behavior behavior = (Behavior) UML2Factory.eINSTANCE.create((EClass) eAllSubClasses.next());
			
			Command command = SetCommand.create(getEditingDomain(), getModelObject(), UML2Package.eINSTANCE.getBehavioredClassifier_ClassifierBehavior(), behavior);
			
			getCommandStack().execute(command);
			
			assertSame(behavior, getModelObject().getClassifierBehavior());
			assertTrue(getModelObject().getOwnedBehaviors().contains(behavior));
			
			getCommandStack().undo();
			
			assertNotSame(behavior, getModelObject().getClassifierBehavior());
			assertFalse(getModelObject().getOwnedBehaviors().contains(behavior));
			
			getCommandStack().redo();
			
			assertSame(behavior, getModelObject().getClassifierBehavior());
			assertTrue(getModelObject().getOwnedBehaviors().contains(behavior));
		}
	}

} //ClassItemProviderTest
