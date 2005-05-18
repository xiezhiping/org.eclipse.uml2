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
 * $Id: RedefinableTemplateSignatureItemProviderTest.java,v 1.4 2005/05/18 17:04:09 khussey Exp $
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
import org.eclipse.uml2.RedefinableTemplateSignature;
import org.eclipse.uml2.TemplateParameter;
import org.eclipse.uml2.UML2Factory;
import org.eclipse.uml2.UML2Package;

/**
 * <!-- begin-user-doc -->
 * A test case for the '<em><b>Redefinable Template Signature</b></em>' item provider adapter.
 * <!-- end-user-doc -->
 * @generated
 */
public class RedefinableTemplateSignatureItemProviderTest extends RedefinableElementItemProviderTest {

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
		TestRunner.run(RedefinableTemplateSignatureItemProviderTest.class);
	}

	/**
	 * Constructs a new Redefinable Template Signature item provider adapter test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RedefinableTemplateSignatureItemProviderTest(String name) {
		super(name);
	}

	/**
	 * Returns the model object for this Redefinable Template Signature item provider adapter test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private RedefinableTemplateSignature getModelObject() {
		return (RedefinableTemplateSignature) modelObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	protected void setUp() throws Exception {
		super.setUp();

		setModelObject(UML2Factory.eINSTANCE.createRedefinableTemplateSignature());
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.provider.RedefinableTemplateSignatureItemProvider#createAddCommand(org.eclipse.emf.edit.domain.EditingDomain, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EStructuralFeature, java.util.Collection, int) <em>Create Add Command</em>}' method.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.provider.RedefinableTemplateSignatureItemProvider#createAddCommand(org.eclipse.emf.edit.domain.EditingDomain, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EStructuralFeature, java.util.Collection, int)
	 * @generated
	 */
	public void testCreateAddCommandGen() {
		// TODO: implement this add command creation test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	public void testCreateAddCommand() {
		testCreateAddCommandGen();
		
		// test REDEFINABLE_TEMPLATE_SIGNATURE__OWNED_PARAMETER subset...
		for (Iterator eAllSubClasses = getEAllSubClasses(UML2Package.eINSTANCE.getTemplateParameter()).iterator(); eAllSubClasses.hasNext();) {
			TemplateParameter templateParameter = (TemplateParameter) UML2Factory.eINSTANCE.create((EClass) eAllSubClasses.next());
	
			Command command =
				AddCommand.create(
					getEditingDomain(),
					getModelObject(),
					UML2Package.eINSTANCE.getTemplateSignature_OwnedParameter(),
					Collections.singleton(templateParameter),
					CommandParameter.NO_INDEX);
	
			getCommandStack().execute(command);
	
			assertTrue(getModelObject().getOwnedParameters().contains(templateParameter));
			assertTrue(getModelObject().getParameters().contains(templateParameter));
	
			getCommandStack().undo();
	
			assertFalse(getModelObject().getOwnedParameters().contains(templateParameter));
			assertFalse(getModelObject().getParameters().contains(templateParameter));
	
			getCommandStack().redo();
	
			assertTrue(getModelObject().getOwnedParameters().contains(templateParameter));
			assertTrue(getModelObject().getParameters().contains(templateParameter));
		}
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.provider.RedefinableTemplateSignatureItemProvider#createRemoveCommand(org.eclipse.emf.edit.domain.EditingDomain, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EReference, java.util.Collection) <em>Create Remove Command</em>}' method.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.provider.RedefinableTemplateSignatureItemProvider#createRemoveCommand(org.eclipse.emf.edit.domain.EditingDomain, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EReference, java.util.Collection)
	 * @generated
	 */
	public void testCreateRemoveCommandGen() {
		// TODO: implement this remove command creation test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	public void testCreateRemoveCommand() {
		testCreateRemoveCommandGen();
		
		// test REDEFINABLE_TEMPLATE_SIGNATURE__PARAMETER superset...
		for (Iterator eAllSubClasses = getEAllSubClasses(UML2Package.eINSTANCE.getTemplateParameter()).iterator(); eAllSubClasses.hasNext();) {
			TemplateParameter templateParameter = (TemplateParameter) UML2Factory.eINSTANCE.create((EClass) eAllSubClasses.next());
	
			getModelObject().getOwnedParameters().add(templateParameter);
	
			Command command =
				RemoveCommand.create(
					getEditingDomain(),
					getModelObject(),
					UML2Package.eINSTANCE.getTemplateSignature_Parameter(),
					Collections.singleton(templateParameter));
	
			getCommandStack().execute(command);
	
			assertFalse(getModelObject().getParameters().contains(templateParameter));
			assertFalse(getModelObject().getOwnedParameters().contains(templateParameter));
	
			getCommandStack().undo();
	
			assertTrue(getModelObject().getParameters().contains(templateParameter));
			assertTrue(getModelObject().getOwnedParameters().contains(templateParameter));
	
			getCommandStack().redo();
	
			assertFalse(getModelObject().getParameters().contains(templateParameter));
			assertFalse(getModelObject().getOwnedParameters().contains(templateParameter));
		}
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.provider.RedefinableTemplateSignatureItemProvider#createReplaceCommand(org.eclipse.emf.edit.domain.EditingDomain, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EReference, org.eclipse.emf.ecore.EObject, java.util.Collection) <em>Create Replace Command</em>}' method.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.provider.RedefinableTemplateSignatureItemProvider#createReplaceCommand(org.eclipse.emf.edit.domain.EditingDomain, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EReference, org.eclipse.emf.ecore.EObject, java.util.Collection)
	 * @generated
	 */
	public void testCreateReplaceCommandGen() {
		// TODO: implement this replace command creation test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	public void testCreateReplaceCommand() {
		testCreateReplaceCommandGen();
		
		// test REDEFINABLE_TEMPLATE_SIGNATURE__OWNED_PARAMETER subset...
		for (Iterator eAllSubClasses = getEAllSubClasses(UML2Package.eINSTANCE.getTemplateParameter()).iterator(); eAllSubClasses.hasNext();) {
			EClass eClass = (EClass) eAllSubClasses.next();
	
			TemplateParameter templateParameter = (TemplateParameter) UML2Factory.eINSTANCE.create(eClass);
			TemplateParameter replacementTemplateParameter = (TemplateParameter) UML2Factory.eINSTANCE.create(eClass);
	
			getModelObject().getOwnedParameters().add(templateParameter);
	
			Command command =
				ReplaceCommand.create(
					getEditingDomain(),
					getModelObject(),
					UML2Package.eINSTANCE.getTemplateSignature_OwnedParameter(),
					templateParameter,
					Collections.singleton(replacementTemplateParameter));
	
			getCommandStack().execute(command);
	
			assertFalse(getModelObject().getOwnedParameters().contains(templateParameter));
			assertTrue(getModelObject().getOwnedParameters().contains(replacementTemplateParameter));
			assertTrue(getModelObject().getParameters().contains(replacementTemplateParameter));
	
			getCommandStack().undo();
	
			assertTrue(getModelObject().getOwnedParameters().contains(templateParameter));
			assertFalse(getModelObject().getOwnedParameters().contains(replacementTemplateParameter));
			assertFalse(getModelObject().getParameters().contains(replacementTemplateParameter));
	
			getCommandStack().redo();
	
			assertFalse(getModelObject().getOwnedParameters().contains(templateParameter));
			assertTrue(getModelObject().getOwnedParameters().contains(replacementTemplateParameter));
			assertTrue(getModelObject().getParameters().contains(replacementTemplateParameter));
		}
	
		// test REDEFINABLE_TEMPLATE_SIGNATURE__PARAMETER superset...
		for (Iterator eAllSubClasses = getEAllSubClasses(UML2Package.eINSTANCE.getTemplateParameter()).iterator(); eAllSubClasses.hasNext();) {
			EClass eClass = (EClass) eAllSubClasses.next();
	
			TemplateParameter templateParameter = (TemplateParameter) UML2Factory.eINSTANCE.create(eClass);
			TemplateParameter replacementTemplateParameter = (TemplateParameter) UML2Factory.eINSTANCE.create(eClass);
	
			getModelObject().getOwnedParameters().add(templateParameter);
	
			Command command =
				ReplaceCommand.create(
					getEditingDomain(),
					getModelObject(),
					UML2Package.eINSTANCE.getTemplateSignature_Parameter(),
					templateParameter,
					Collections.singleton(replacementTemplateParameter));
	
			getCommandStack().execute(command);
	
			assertFalse(getModelObject().getParameters().contains(templateParameter));
			assertTrue(getModelObject().getParameters().contains(replacementTemplateParameter));
			assertFalse(getModelObject().getOwnedParameters().contains(templateParameter));
	
			getCommandStack().undo();
	
			assertTrue(getModelObject().getParameters().contains(templateParameter));
			assertFalse(getModelObject().getParameters().contains(replacementTemplateParameter));
			assertTrue(getModelObject().getOwnedParameters().contains(templateParameter));
	
			getCommandStack().redo();
	
			assertFalse(getModelObject().getParameters().contains(templateParameter));
			assertTrue(getModelObject().getParameters().contains(replacementTemplateParameter));
			assertFalse(getModelObject().getOwnedParameters().contains(templateParameter));
		}
	}

} //RedefinableTemplateSignatureItemProviderTest
