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
 * $Id: TemplateParameterSubstitutionItemProviderTest.java,v 1.1 2004/04/29 14:43:45 khussey Exp $
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
import org.eclipse.uml2.ParameterableElement;
import org.eclipse.uml2.TemplateParameterSubstitution;
import org.eclipse.uml2.UML2Factory;
import org.eclipse.uml2.UML2Package;

/**
 * <!-- begin-user-doc -->
 * A test case for the '<em><b>Template Parameter Substitution</b></em>' item provider adapter.
 * <!-- end-user-doc -->
 * @generated
 */
public class TemplateParameterSubstitutionItemProviderTest extends ElementItemProviderTest {

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
		TestRunner.run(TemplateParameterSubstitutionItemProviderTest.class);
	}

	/**
	 * Constructs a new Template Parameter Substitution item provider adapter test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemplateParameterSubstitutionItemProviderTest(String name) {
		super(name);
	}

	/**
	 * Returns the model object for this Template Parameter Substitution item provider adapter test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private TemplateParameterSubstitution getModelObject() {
		return (TemplateParameterSubstitution) modelObject;
	}

	/* (non-Javadoc)
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	protected void setUp() throws Exception {
		super.setUp();

		setModelObject(UML2Factory.eINSTANCE.createTemplateParameterSubstitution());
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.provider.TemplateParameterSubstitutionItemProvider#createRemoveCommand(org.eclipse.emf.edit.domain.EditingDomain, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EReference, java.util.Collection) <em>Create Remove Command</em>}' method.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.provider.TemplateParameterSubstitutionItemProvider#createRemoveCommand(org.eclipse.emf.edit.domain.EditingDomain, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EReference, java.util.Collection)
	 * @generated NOT
	 */
	public void testCreateRemoveCommand() {
		
		// test TEMPLATE_PARAMETER_SUBSTITUTION__ACTUAL superset...
		for (Iterator eAllSubClasses = getEAllSubClasses(UML2Package.eINSTANCE.getParameterableElement()).iterator(); eAllSubClasses.hasNext();) {
			ParameterableElement parameterableElement = (ParameterableElement) UML2Factory.eINSTANCE.create((EClass) eAllSubClasses.next());
	
			getModelObject().setOwnedActual(parameterableElement);
	
			Command command =
				RemoveCommand.create(
					getEditingDomain(),
					getModelObject(),
					UML2Package.eINSTANCE.getTemplateParameterSubstitution_Actual(),
					Collections.singleton(parameterableElement));
	
			getCommandStack().execute(command);
	
			assertFalse(getModelObject().getActuals().contains(parameterableElement));
			assertNotSame(parameterableElement, getModelObject().getOwnedActual());
	
			getCommandStack().undo();
	
			assertTrue(getModelObject().getActuals().contains(parameterableElement));
			assertSame(parameterableElement, getModelObject().getOwnedActual());
	
			getCommandStack().redo();
	
			assertFalse(getModelObject().getActuals().contains(parameterableElement));
			assertNotSame(parameterableElement, getModelObject().getOwnedActual());
		}
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.provider.TemplateParameterSubstitutionItemProvider#createReplaceCommand(org.eclipse.emf.edit.domain.EditingDomain, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EReference, org.eclipse.emf.ecore.EObject, java.util.Collection) <em>Create Replace Command</em>}' method.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.provider.TemplateParameterSubstitutionItemProvider#createReplaceCommand(org.eclipse.emf.edit.domain.EditingDomain, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EReference, org.eclipse.emf.ecore.EObject, java.util.Collection)
	 * @generated NOT
	 */
	public void testCreateReplaceCommand() {
		
		// test TEMPLATE_PARAMETER_SUBSTITUTION__ACTUAL superset...
		for (Iterator eAllSubClasses = getEAllSubClasses(UML2Package.eINSTANCE.getParameterableElement()).iterator(); eAllSubClasses.hasNext();) {
			EClass eClass = (EClass) eAllSubClasses.next();
			ParameterableElement parameterableElement = (ParameterableElement) UML2Factory.eINSTANCE.create(eClass);
			ParameterableElement replacementParameterableElement = (ParameterableElement) UML2Factory.eINSTANCE.create(eClass);
	
			getModelObject().setOwnedActual(parameterableElement);
	
			Command command =
				ReplaceCommand.create(
					getEditingDomain(),
					getModelObject(),
					UML2Package.eINSTANCE.getTemplateParameterSubstitution_Actual(),
					parameterableElement,
					Collections.singleton(replacementParameterableElement));
	
			getCommandStack().execute(command);
	
			assertFalse(getModelObject().getActuals().contains(parameterableElement));
			assertTrue(getModelObject().getActuals().contains(replacementParameterableElement));
			assertNotSame(parameterableElement, getModelObject().getOwnedActual());
	
			getCommandStack().undo();
	
			assertTrue(getModelObject().getActuals().contains(parameterableElement));
			assertFalse(getModelObject().getActuals().contains(replacementParameterableElement));
			assertSame(parameterableElement, getModelObject().getOwnedActual());
	
			getCommandStack().redo();
	
			assertFalse(getModelObject().getActuals().contains(parameterableElement));
			assertTrue(getModelObject().getActuals().contains(replacementParameterableElement));
			assertNotSame(parameterableElement, getModelObject().getOwnedActual());
		}
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.provider.TemplateParameterSubstitutionItemProvider#createSetCommand(org.eclipse.emf.edit.domain.EditingDomain, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EStructuralFeature, java.lang.Object) <em>Create Set Command</em>}' method.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.provider.TemplateParameterSubstitutionItemProvider#createSetCommand(org.eclipse.emf.edit.domain.EditingDomain, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EStructuralFeature, java.lang.Object)
	 * @generated NOT
	 */
	public void testCreateSetCommand() {
		
		// test TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL subset...
		for (Iterator eAllSubClasses = getEAllSubClasses(UML2Package.eINSTANCE.getParameterableElement()).iterator(); eAllSubClasses.hasNext();) {
			ParameterableElement parameterableElement = (ParameterableElement) UML2Factory.eINSTANCE.create((EClass) eAllSubClasses.next());
	
			Command command =
				SetCommand.create(getEditingDomain(), getModelObject(), UML2Package.eINSTANCE.getTemplateParameterSubstitution_OwnedActual(), parameterableElement);
	
			getCommandStack().execute(command);
	
			assertSame(parameterableElement, getModelObject().getOwnedActual());
			assertTrue(getModelObject().getActuals().contains(parameterableElement));
	
			getCommandStack().undo();
	
			assertNotSame(parameterableElement, getModelObject().getOwnedActual());
			assertFalse(getModelObject().getActuals().contains(parameterableElement));
	
			getCommandStack().redo();
	
			assertSame(parameterableElement, getModelObject().getOwnedActual());
			assertTrue(getModelObject().getActuals().contains(parameterableElement));
		}
	}

} //TemplateParameterSubstitutionItemProviderTest
