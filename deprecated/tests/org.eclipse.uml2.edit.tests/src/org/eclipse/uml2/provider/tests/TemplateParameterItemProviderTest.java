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
 * $Id: TemplateParameterItemProviderTest.java,v 1.3 2005/04/04 20:02:08 khussey Exp $
 */
package org.eclipse.uml2.provider.tests;

import java.util.Iterator;

import junit.textui.TestRunner;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.uml2.ParameterableElement;
import org.eclipse.uml2.TemplateParameter;
import org.eclipse.uml2.UML2Factory;
import org.eclipse.uml2.UML2Package;

/**
 * <!-- begin-user-doc -->
 * A test case for the '<em><b>Template Parameter</b></em>' item provider adapter.
 * <!-- end-user-doc -->
 * @generated
 */
public class TemplateParameterItemProviderTest extends ElementItemProviderTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2003, 2005 IBM Corporation and others."; //$NON-NLS-1$

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(TemplateParameterItemProviderTest.class);
	}

	/**
	 * Constructs a new Template Parameter item provider adapter test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemplateParameterItemProviderTest(String name) {
		super(name);
	}

	/**
	 * Returns the model object for this Template Parameter item provider adapter test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private TemplateParameter getModelObject() {
		return (TemplateParameter) modelObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	protected void setUp() throws Exception {
		super.setUp();

		setModelObject(UML2Factory.eINSTANCE.createTemplateParameter());
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.provider.TemplateParameterItemProvider#createSetCommand(org.eclipse.emf.edit.domain.EditingDomain, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EStructuralFeature, java.lang.Object) <em>Create Set Command</em>}' method.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.provider.TemplateParameterItemProvider#createSetCommand(org.eclipse.emf.edit.domain.EditingDomain, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EStructuralFeature, java.lang.Object)
	 * @generated
	 */
	public void testCreateSetCommandGen() {
		// TODO: implement this set command creation test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	public void testCreateSetCommand() {
		testCreateSetCommandGen();

		// test TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT subset...
		for (Iterator eAllSubClasses = getEAllSubClasses(UML2Package.eINSTANCE.getParameterableElement()).iterator(); eAllSubClasses.hasNext();) {
			ParameterableElement parameterableElement = (ParameterableElement) UML2Factory.eINSTANCE.create((EClass) eAllSubClasses.next());

			Command command =
				SetCommand.create(getEditingDomain(), getModelObject(), UML2Package.eINSTANCE.getTemplateParameter_OwnedParameteredElement(), parameterableElement);

			getCommandStack().execute(command);

			assertSame(parameterableElement, getModelObject().getOwnedParameteredElement());
			assertSame(getModelObject().getOwnedParameteredElement(), getModelObject().getParameteredElement());

			getCommandStack().undo();

			assertNotSame(parameterableElement, getModelObject().getOwnedParameteredElement());
			assertSame(getModelObject().getOwnedParameteredElement(), getModelObject().getParameteredElement());

			getCommandStack().redo();

			assertSame(parameterableElement, getModelObject().getOwnedParameteredElement());
			assertSame(getModelObject().getOwnedParameteredElement(), getModelObject().getParameteredElement());
		}

		// test TEMPLATE_PARAMETER__OWNED_DEFAULT subset...
		for (Iterator eAllSubClasses = getEAllSubClasses(UML2Package.eINSTANCE.getParameterableElement()).iterator(); eAllSubClasses.hasNext();) {
			ParameterableElement parameterableElement = (ParameterableElement) UML2Factory.eINSTANCE.create((EClass) eAllSubClasses.next());

			Command command =
				SetCommand.create(getEditingDomain(), getModelObject(), UML2Package.eINSTANCE.getTemplateParameter_OwnedDefault(), parameterableElement);

			getCommandStack().execute(command);

			assertSame(parameterableElement, getModelObject().getOwnedDefault());
			assertSame(getModelObject().getOwnedDefault(), getModelObject().getDefault());

			getCommandStack().undo();

			assertNotSame(parameterableElement, getModelObject().getOwnedDefault());
			assertSame(getModelObject().getOwnedDefault(), getModelObject().getDefault());

			getCommandStack().redo();

			assertSame(parameterableElement, getModelObject().getOwnedDefault());
			assertSame(getModelObject().getOwnedDefault(), getModelObject().getDefault());
		}

		// test TEMPLATE_PARAMETER__PARAMETERED_ELEMENT superset...
		for (Iterator eAllSubClasses = getEAllSubClasses(UML2Package.eINSTANCE.getParameterableElement()).iterator(); eAllSubClasses.hasNext();) {
			EClass eClass = (EClass) eAllSubClasses.next();

			ParameterableElement oldParameterableElement = (ParameterableElement) UML2Factory.eINSTANCE.create(eClass);
			ParameterableElement newParameterableElement = (ParameterableElement) UML2Factory.eINSTANCE.create(eClass);

			getModelObject().setOwnedParameteredElement(oldParameterableElement);

			Command command =
				SetCommand.create(getEditingDomain(), getModelObject(), UML2Package.eINSTANCE.getTemplateParameter_ParameteredElement(), newParameterableElement);

			getCommandStack().execute(command);

			assertSame(newParameterableElement, getModelObject().getParameteredElement());
			assertSame(null, getModelObject().getOwnedParameteredElement());

			getCommandStack().undo();

			assertSame(oldParameterableElement, getModelObject().getParameteredElement());
			assertSame(oldParameterableElement, getModelObject().getOwnedParameteredElement());

			getCommandStack().redo();

			assertSame(newParameterableElement, getModelObject().getParameteredElement());
			assertSame(null, getModelObject().getOwnedParameteredElement());
		}

		// test TEMPLATE_PARAMETER__DEFAULT superset...
		for (Iterator eAllSubClasses = getEAllSubClasses(UML2Package.eINSTANCE.getParameterableElement()).iterator(); eAllSubClasses.hasNext();) {
			EClass eClass = (EClass) eAllSubClasses.next();

			ParameterableElement oldParameterableElement = (ParameterableElement) UML2Factory.eINSTANCE.create(eClass);
			ParameterableElement newParameterableElement = (ParameterableElement) UML2Factory.eINSTANCE.create(eClass);

			getModelObject().setOwnedDefault(oldParameterableElement);

			Command command =
				SetCommand.create(getEditingDomain(), getModelObject(), UML2Package.eINSTANCE.getTemplateParameter_Default(), newParameterableElement);

			getCommandStack().execute(command);

			assertSame(newParameterableElement, getModelObject().getDefault());
			assertSame(null, getModelObject().getOwnedDefault());

			getCommandStack().undo();

			assertSame(oldParameterableElement, getModelObject().getDefault());
			assertSame(oldParameterableElement, getModelObject().getOwnedDefault());

			getCommandStack().redo();

			assertSame(newParameterableElement, getModelObject().getDefault());
			assertSame(null, getModelObject().getOwnedDefault());
		}

	}

} //TemplateParameterItemProviderTest
