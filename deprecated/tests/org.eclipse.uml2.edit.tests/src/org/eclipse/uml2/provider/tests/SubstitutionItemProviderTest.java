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
 * $Id: SubstitutionItemProviderTest.java,v 1.4 2005/05/18 17:04:07 khussey Exp $
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
import org.eclipse.uml2.Substitution;
import org.eclipse.uml2.UML2Factory;
import org.eclipse.uml2.UML2Package;

/**
 * <!-- begin-user-doc -->
 * A test case for the '<em><b>Substitution</b></em>' item provider adapter.
 * <!-- end-user-doc -->
 * @generated
 */
public class SubstitutionItemProviderTest extends RealizationItemProviderTest {

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
		TestRunner.run(SubstitutionItemProviderTest.class);
	}

	/**
	 * Constructs a new Substitution item provider adapter test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubstitutionItemProviderTest(String name) {
		super(name);
	}

	/**
	 * Returns the model object for this Substitution item provider adapter test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private Substitution getModelObject() {
		return (Substitution) modelObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	protected void setUp() throws Exception {
		super.setUp();

		setModelObject(UML2Factory.eINSTANCE.createSubstitution());
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.provider.SubstitutionItemProvider#createRemoveCommand(org.eclipse.emf.edit.domain.EditingDomain, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EReference, java.util.Collection) <em>Create Remove Command</em>}' method.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.provider.SubstitutionItemProvider#createRemoveCommand(org.eclipse.emf.edit.domain.EditingDomain, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EReference, java.util.Collection)
	 * @generated
	 */
	public void testCreateRemoveCommandGen() {
		// TODO: implement this remove command creation test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	public void testCreateRemoveCommand() {
		testCreateRemoveCommandGen();
		
		super.testCreateRemoveCommand();
		
		// test SUBSTITUTION__SUPPLIER superset...
		for (Iterator eAllSubClasses = getEAllSubClasses(UML2Package.eINSTANCE.getClassifier()).iterator(); eAllSubClasses.hasNext();) {
			Classifier classifier = (Classifier) UML2Factory.eINSTANCE.create((EClass) eAllSubClasses.next());
			
			getModelObject().setContract(classifier);
			
			Command command =
				RemoveCommand.create(getEditingDomain(), getModelObject(), UML2Package.eINSTANCE.getDependency_Supplier(), Collections.singleton(classifier));
			
			getCommandStack().execute(command);
			
			assertFalse(getModelObject().getSuppliers().contains(classifier));
			assertNotSame(classifier, getModelObject().getContract());
			
			getCommandStack().undo();
			
			assertTrue(getModelObject().getSuppliers().contains(classifier));
			assertSame(classifier, getModelObject().getContract());
			
			getCommandStack().redo();
			
			assertFalse(getModelObject().getSuppliers().contains(classifier));
			assertNotSame(classifier, getModelObject().getContract());
		}
		
		// test SUBSTITUTION__CLIENT superset...
		for (Iterator eAllSubClasses = getEAllSubClasses(UML2Package.eINSTANCE.getClassifier()).iterator(); eAllSubClasses.hasNext();) {
			Classifier classifier = (Classifier) UML2Factory.eINSTANCE.create((EClass) eAllSubClasses.next());
			
			getModelObject().setSubstitutingClassifier(classifier);
			
			Command command =
				RemoveCommand.create(getEditingDomain(), getModelObject(), UML2Package.eINSTANCE.getDependency_Client(), Collections.singleton(classifier));
			
			getCommandStack().execute(command);
			
			assertFalse(getModelObject().getClients().contains(classifier));
			assertNotSame(classifier, getModelObject().getSubstitutingClassifier());
			
			getCommandStack().undo();
			
			assertTrue(getModelObject().getClients().contains(classifier));
			assertSame(classifier, getModelObject().getSubstitutingClassifier());
			
			getCommandStack().redo();
			
			assertFalse(getModelObject().getClients().contains(classifier));
			assertNotSame(classifier, getModelObject().getSubstitutingClassifier());
		}
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.provider.SubstitutionItemProvider#createReplaceCommand(org.eclipse.emf.edit.domain.EditingDomain, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EReference, org.eclipse.emf.ecore.EObject, java.util.Collection) <em>Create Replace Command</em>}' method.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.provider.SubstitutionItemProvider#createReplaceCommand(org.eclipse.emf.edit.domain.EditingDomain, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EReference, org.eclipse.emf.ecore.EObject, java.util.Collection)
	 * @generated
	 */
	public void testCreateReplaceCommandGen() {
		// TODO: implement this replace command creation test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	public void testCreateReplaceCommand() {
		testCreateReplaceCommandGen();
		
		super.testCreateReplaceCommand();
		
		// test SUBSTITUTION__SUPPLIER superset...
		for (Iterator eAllSubClasses = getEAllSubClasses(UML2Package.eINSTANCE.getClassifier()).iterator(); eAllSubClasses.hasNext();) {
			EClass eClass = (EClass) eAllSubClasses.next();
			
			Classifier classifier = (Classifier) UML2Factory.eINSTANCE.create(eClass);
			Classifier replacementClassifier = (Classifier) UML2Factory.eINSTANCE.create(eClass);
			
			getModelObject().setContract(classifier);
			
			Command command =
				ReplaceCommand.create(
					getEditingDomain(),
					getModelObject(),
					UML2Package.eINSTANCE.getDependency_Supplier(),
					classifier,
					Collections.singleton(replacementClassifier));
			
			getCommandStack().execute(command);
			
			assertFalse(getModelObject().getSuppliers().contains(classifier));
			assertTrue(getModelObject().getSuppliers().contains(replacementClassifier));
			assertNotSame(classifier, getModelObject().getContract());
			
			getCommandStack().undo();
			
			assertTrue(getModelObject().getSuppliers().contains(classifier));
			assertFalse(getModelObject().getSuppliers().contains(replacementClassifier));
			assertSame(classifier, getModelObject().getContract());
			
			getCommandStack().redo();
			
			assertFalse(getModelObject().getSuppliers().contains(classifier));
			assertTrue(getModelObject().getSuppliers().contains(replacementClassifier));
			assertNotSame(classifier, getModelObject().getContract());
		}
		
		// test SUBSTITUTION__CLIENT superset...
		for (Iterator eAllSubClasses = getEAllSubClasses(UML2Package.eINSTANCE.getClassifier()).iterator(); eAllSubClasses.hasNext();) {
			EClass eClass = (EClass) eAllSubClasses.next();
			
			Classifier classifier = (Classifier) UML2Factory.eINSTANCE.create(eClass);
			Classifier replacementClassifier = (Classifier) UML2Factory.eINSTANCE.create(eClass);
			
			getModelObject().setSubstitutingClassifier(classifier);
			
			Command command =
				ReplaceCommand.create(
					getEditingDomain(),
					getModelObject(),
					UML2Package.eINSTANCE.getDependency_Client(),
					classifier,
					Collections.singleton(replacementClassifier));
			
			getCommandStack().execute(command);
			
			assertFalse(getModelObject().getClients().contains(classifier));
			assertTrue(getModelObject().getClients().contains(replacementClassifier));
			assertNotSame(classifier, getModelObject().getSubstitutingClassifier());
			
			getCommandStack().undo();
			
			assertTrue(getModelObject().getClients().contains(classifier));
			assertFalse(getModelObject().getClients().contains(replacementClassifier));
			assertSame(classifier, getModelObject().getSubstitutingClassifier());
			
			getCommandStack().redo();
			
			assertFalse(getModelObject().getClients().contains(classifier));
			assertTrue(getModelObject().getClients().contains(replacementClassifier));
			assertNotSame(classifier, getModelObject().getSubstitutingClassifier());
		}
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.provider.SubstitutionItemProvider#createSetCommand(org.eclipse.emf.edit.domain.EditingDomain, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EStructuralFeature, java.lang.Object) <em>Create Set Command</em>}' method.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.provider.SubstitutionItemProvider#createSetCommand(org.eclipse.emf.edit.domain.EditingDomain, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EStructuralFeature, java.lang.Object)
	 * @generated
	 */
	public void testCreateSetCommandGen() {
		// TODO: implement this set command creation test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	public void testCreateSetCommand() {
		testCreateSetCommandGen();
		
		super.testCreateSetCommand();
		
		// test SUBSTITUTION__CONTRACT subset...
		for (Iterator eAllSubClasses = getEAllSubClasses(UML2Package.eINSTANCE.getClassifier()).iterator(); eAllSubClasses.hasNext();) {
			Classifier classifier = (Classifier) UML2Factory.eINSTANCE.create((EClass) eAllSubClasses.next());
			
			Command command = SetCommand.create(getEditingDomain(), getModelObject(), UML2Package.eINSTANCE.getSubstitution_Contract(), classifier);
			
			getCommandStack().execute(command);
			
			assertSame(classifier, getModelObject().getContract());
			assertTrue(getModelObject().getSuppliers().contains(classifier));
			
			getCommandStack().undo();
			
			assertNotSame(classifier, getModelObject().getContract());
			assertFalse(getModelObject().getSuppliers().contains(classifier));
			
			getCommandStack().redo();
			
			assertSame(classifier, getModelObject().getContract());
			assertTrue(getModelObject().getSuppliers().contains(classifier));
		}
		
		// test SUBSTITUTION__SUBSTITUTING_CLASSIFIER subset...
		for (Iterator eAllSubClasses = getEAllSubClasses(UML2Package.eINSTANCE.getClassifier()).iterator(); eAllSubClasses.hasNext();) {
			Classifier classifier = (Classifier) UML2Factory.eINSTANCE.create((EClass) eAllSubClasses.next());
			
			Command command = SetCommand.create(getEditingDomain(), getModelObject(), UML2Package.eINSTANCE.getSubstitution_SubstitutingClassifier(), classifier);
			
			getCommandStack().execute(command);
			
			assertSame(classifier, getModelObject().getSubstitutingClassifier());
			assertTrue(getModelObject().getClients().contains(classifier));
			
			getCommandStack().undo();
			
			assertNotSame(classifier, getModelObject().getSubstitutingClassifier());
			assertFalse(getModelObject().getClients().contains(classifier));
			
			getCommandStack().redo();
			
			assertSame(classifier, getModelObject().getSubstitutingClassifier());
			assertTrue(getModelObject().getClients().contains(classifier));
		}
	}

} //SubstitutionItemProviderTest
