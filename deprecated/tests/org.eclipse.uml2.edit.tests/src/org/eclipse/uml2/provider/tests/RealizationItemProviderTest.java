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
 * $Id: RealizationItemProviderTest.java,v 1.2 2005/03/15 18:49:58 khussey Exp $
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
import org.eclipse.uml2.Classifier;
import org.eclipse.uml2.Component;
import org.eclipse.uml2.Realization;
import org.eclipse.uml2.UML2Factory;
import org.eclipse.uml2.UML2Package;

/**
 * <!-- begin-user-doc -->
 * A test case for the '<em><b>Realization</b></em>' item provider adapter.
 * <!-- end-user-doc -->
 * @generated
 */
public class RealizationItemProviderTest extends AbstractionItemProviderTest {

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
		TestRunner.run(RealizationItemProviderTest.class);
	}

	/**
	 * Constructs a new Realization item provider adapter test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RealizationItemProviderTest(String name) {
		super(name);
	}

	/**
	 * Returns the model object for this Realization item provider adapter test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private Realization getModelObject() {
		return (Realization) modelObject;
	}

	/* (non-Javadoc)
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	protected void setUp() throws Exception {
		super.setUp();

		setModelObject(UML2Factory.eINSTANCE.createRealization());
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.provider.RealizationItemProvider#createRemoveCommand(org.eclipse.emf.edit.domain.EditingDomain, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EReference, java.util.Collection) <em>Create Remove Command</em>}' method.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.provider.RealizationItemProvider#createRemoveCommand(org.eclipse.emf.edit.domain.EditingDomain, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EReference, java.util.Collection)
	 * @generated NOT
	 */
	public void testCreateRemoveCommand() {
		
		// test REALIZATION__CLIENT superset...
		Component component = UML2Factory.eINSTANCE.createComponent();
	
		getModelObject().setAbstraction(component);
	
		Command command =
			RemoveCommand.create(getEditingDomain(), getModelObject(), UML2Package.eINSTANCE.getDependency_Client(), Collections.singleton(component));
	
		getCommandStack().execute(command);
	
		assertFalse(getModelObject().getClients().contains(component));
		assertNotSame(component, getModelObject().getAbstraction());
	
		getCommandStack().undo();
	
		assertTrue(getModelObject().getClients().contains(component));
		assertSame(component, getModelObject().getAbstraction());
	
		getCommandStack().redo();
	
		assertFalse(getModelObject().getClients().contains(component));
		assertNotSame(component, getModelObject().getAbstraction());
	
		// test REALIZATION__SUPPLIER superset...
		for (Iterator eAllSubClasses = getEAllSubClasses(UML2Package.eINSTANCE.getClassifier()).iterator(); eAllSubClasses.hasNext();) {
			Classifier classifier = (Classifier) UML2Factory.eINSTANCE.create((EClass) eAllSubClasses.next());
	
			getModelObject().setRealizingClassifier(classifier);
	
			command = RemoveCommand.create(getEditingDomain(), getModelObject(), UML2Package.eINSTANCE.getDependency_Supplier(), Collections.singleton(classifier));
	
			getCommandStack().execute(command);
	
			assertFalse(getModelObject().getSuppliers().contains(classifier));
			assertNotSame(classifier, getModelObject().getRealizingClassifier());
	
			getCommandStack().undo();
	
			assertTrue(getModelObject().getSuppliers().contains(classifier));
			assertSame(classifier, getModelObject().getRealizingClassifier());
	
			getCommandStack().redo();
	
			assertFalse(getModelObject().getSuppliers().contains(classifier));
			assertNotSame(classifier, getModelObject().getRealizingClassifier());
		}
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.provider.RealizationItemProvider#createReplaceCommand(org.eclipse.emf.edit.domain.EditingDomain, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EReference, org.eclipse.emf.ecore.EObject, java.util.Collection) <em>Create Replace Command</em>}' method.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.provider.RealizationItemProvider#createReplaceCommand(org.eclipse.emf.edit.domain.EditingDomain, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EReference, org.eclipse.emf.ecore.EObject, java.util.Collection)
	 * @generated NOT
	 */
	public void testCreateReplaceCommand() {
		
		// test REALIZATION__CLIENT superset...
		Component component = UML2Factory.eINSTANCE.createComponent();
		Component replacementComponent = UML2Factory.eINSTANCE.createComponent();
	
		getModelObject().setAbstraction(component);
	
		Command command =
			ReplaceCommand.create(
				getEditingDomain(),
				getModelObject(),
				UML2Package.eINSTANCE.getDependency_Client(),
				component,
				Collections.singleton(replacementComponent));
	
		getCommandStack().execute(command);
	
		assertFalse(getModelObject().getClients().contains(component));
		assertTrue(getModelObject().getClients().contains(replacementComponent));
		assertNotSame(component, getModelObject().getAbstraction());
	
		getCommandStack().undo();
	
		assertTrue(getModelObject().getClients().contains(component));
		assertFalse(getModelObject().getClients().contains(replacementComponent));
		assertSame(component, getModelObject().getAbstraction());
	
		getCommandStack().redo();
	
		assertFalse(getModelObject().getClients().contains(component));
		assertTrue(getModelObject().getClients().contains(replacementComponent));
		assertNotSame(component, getModelObject().getAbstraction());
	
		// test REALIZATION__SUPPLIER superset...
		for (Iterator eAllSubClasses = getEAllSubClasses(UML2Package.eINSTANCE.getClassifier()).iterator(); eAllSubClasses.hasNext();) {
			EClass eClass = (EClass) eAllSubClasses.next();
	
			Classifier classifier = (Classifier) UML2Factory.eINSTANCE.create(eClass);
			Classifier replacementClassifier = (Classifier) UML2Factory.eINSTANCE.create(eClass);
	
			getModelObject().setRealizingClassifier(classifier);
	
			command =
				ReplaceCommand.create(
					getEditingDomain(),
					getModelObject(),
					UML2Package.eINSTANCE.getDependency_Supplier(),
					classifier,
					Collections.singleton(replacementClassifier));
	
			getCommandStack().execute(command);
	
			assertFalse(getModelObject().getSuppliers().contains(classifier));
			assertTrue(getModelObject().getSuppliers().contains(replacementClassifier));
			assertNotSame(classifier, getModelObject().getRealizingClassifier());
	
			getCommandStack().undo();
	
			assertTrue(getModelObject().getSuppliers().contains(classifier));
			assertFalse(getModelObject().getSuppliers().contains(replacementClassifier));
			assertSame(classifier, getModelObject().getRealizingClassifier());
	
			getCommandStack().redo();
	
			assertFalse(getModelObject().getSuppliers().contains(classifier));
			assertTrue(getModelObject().getSuppliers().contains(replacementClassifier));
			assertNotSame(classifier, getModelObject().getRealizingClassifier());
		}
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.provider.RealizationItemProvider#createSetCommand(org.eclipse.emf.edit.domain.EditingDomain, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EStructuralFeature, java.lang.Object) <em>Create Set Command</em>}' method.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.provider.RealizationItemProvider#createSetCommand(org.eclipse.emf.edit.domain.EditingDomain, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EStructuralFeature, java.lang.Object)
	 * @generated NOT
	 */
	public void testCreateSetCommand() {
		super.testCreateSetCommand();
		
		// test REALIZATION__ABSTRACTION subset...
		Component component = UML2Factory.eINSTANCE.createComponent();
		
		Command command = SetCommand.create(getEditingDomain(), getModelObject(), UML2Package.eINSTANCE.getRealization_Abstraction(), component);
		
		getCommandStack().execute(command);
		
		assertSame(component, getModelObject().getAbstraction());
		assertTrue(getModelObject().getClients().contains(component));
		
		getCommandStack().undo();
		
		assertNotSame(component, getModelObject().getAbstraction());
		assertFalse(getModelObject().getClients().contains(component));
		
		getCommandStack().redo();
		
		assertSame(component, getModelObject().getAbstraction());
		assertTrue(getModelObject().getClients().contains(component));
		
		// test REALIZATION__REALIZING_CLASSIFIER subset...
		for (Iterator eAllSubClasses = getEAllSubClasses(UML2Package.eINSTANCE.getClassifier()).iterator(); eAllSubClasses.hasNext();) {
			Classifier classifier = (Classifier) UML2Factory.eINSTANCE.create((EClass) eAllSubClasses.next());
			
			command = SetCommand.create(getEditingDomain(), getModelObject(), UML2Package.eINSTANCE.getRealization_RealizingClassifier(), classifier);
			
			getCommandStack().execute(command);
			
			assertSame(classifier, getModelObject().getRealizingClassifier());
			assertTrue(getModelObject().getSuppliers().contains(classifier));
			
			getCommandStack().undo();
			
			assertNotSame(classifier, getModelObject().getRealizingClassifier());
			assertFalse(getModelObject().getSuppliers().contains(classifier));
			
			getCommandStack().redo();
			
			assertSame(classifier, getModelObject().getRealizingClassifier());
			assertTrue(getModelObject().getSuppliers().contains(classifier));
		}
	}

} //RealizationItemProviderTest
