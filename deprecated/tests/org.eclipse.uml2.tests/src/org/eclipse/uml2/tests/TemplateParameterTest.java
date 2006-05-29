/*
 * Copyright (c) 2003, 2006 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *
 * $Id: TemplateParameterTest.java,v 1.5 2006/05/29 17:27:34 khussey Exp $
 */
package org.eclipse.uml2.tests;

import java.util.Iterator;

import junit.textui.TestRunner;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.uml2.ParameterableElement;
import org.eclipse.uml2.TemplateParameter;
import org.eclipse.uml2.TemplateSignature;
import org.eclipse.uml2.UML2Factory;
import org.eclipse.uml2.UML2Package;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Template Parameter</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class TemplateParameterTest extends ElementTest {

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
		TestRunner.run(TemplateParameterTest.class);
	}

	/**
	 * Constructs a new Template Parameter test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemplateParameterTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Template Parameter test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private TemplateParameter getFixture() {
		return (TemplateParameter)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	protected void setUp() throws Exception {
		setFixture(UML2Factory.eINSTANCE.createTemplateParameter());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	protected void tearDown() throws Exception {
		setFixture(null);
	}


	public void testGetSignature() {
		TemplateSignature templateSignature = UML2Factory.eINSTANCE.createTemplateSignature();

		templateSignature.getOwnedParameters().add(getFixture());

		assertSame(templateSignature, getFixture().getSignature());

		templateSignature.getOwnedParameters().remove(getFixture());

		assertSame(null, getFixture().getSignature());
	}

	public void testSetSignature() {
		TemplateSignature templateSignature = UML2Factory.eINSTANCE.createTemplateSignature();

		getFixture().setSignature(templateSignature);

		assertSame(templateSignature, getFixture().getSignature());
		assertTrue(templateSignature.getOwnedParameters().contains(getFixture()));

		getFixture().setSignature(null);

		assertSame(null, getFixture().getSignature());
		assertFalse(templateSignature.getOwnedParameters().contains(getFixture()));
	}

	public void testGetParameteredElement() {

		for (Iterator eAllSubClasses = getEAllSubClasses(UML2Package.eINSTANCE.getParameterableElement()).iterator(); eAllSubClasses.hasNext();) {
			ParameterableElement parameterableElement = (ParameterableElement) UML2Factory.eINSTANCE.create((EClass) eAllSubClasses.next());

			parameterableElement.setTemplateParameter(getFixture());

			assertSame(parameterableElement, getFixture().getParameteredElement());

			parameterableElement.setTemplateParameter(null);

			assertSame(null, getFixture().getParameteredElement());
		}
	}

	public void testSetParameteredElement() {

		for (Iterator eAllSubClasses = getEAllSubClasses(UML2Package.eINSTANCE.getParameterableElement()).iterator(); eAllSubClasses.hasNext();) {
			EClass eClass = (EClass) eAllSubClasses.next();

			getFixture().setOwnedParameteredElement((ParameterableElement) UML2Factory.eINSTANCE.create(eClass));

			ParameterableElement parameterableElement = (ParameterableElement) UML2Factory.eINSTANCE.create(eClass);

			getFixture().setParameteredElement(parameterableElement);

			assertSame(parameterableElement, getFixture().getParameteredElement());
			assertSame(getFixture(), parameterableElement.getTemplateParameter());
			assertSame(null, getFixture().getOwnedParameteredElement());

			getFixture().setParameteredElement(null);

			assertSame(null, getFixture().getParameteredElement());
			assertSame(null, parameterableElement.getTemplateParameter());
			assertSame(getFixture().getParameteredElement(), getFixture().getOwnedParameteredElement());
		}
	}

	public void testGetOwnedParameteredElement() {
		
		for (Iterator eAllSubClasses = getEAllSubClasses(UML2Package.eINSTANCE.getParameterableElement()).iterator(); eAllSubClasses.hasNext();) {
			ParameterableElement parameterableElement = (ParameterableElement) UML2Factory.eINSTANCE.create((EClass) eAllSubClasses.next());

			parameterableElement.setOwningParameter(getFixture());

			assertSame(parameterableElement, getFixture().getOwnedParameteredElement());

			parameterableElement.setOwningParameter(null);

			assertSame(null, getFixture().getOwnedParameteredElement());
		}
	}

	public void testSetOwnedParameteredElement() {

		for (Iterator eAllSubClasses = getEAllSubClasses(UML2Package.eINSTANCE.getParameterableElement()).iterator(); eAllSubClasses.hasNext();) {
			ParameterableElement parameterableElement = (ParameterableElement) UML2Factory.eINSTANCE.create((EClass) eAllSubClasses.next());

			getFixture().setOwnedParameteredElement(parameterableElement);

			assertSame(parameterableElement, getFixture().getOwnedParameteredElement());
			assertSame(getFixture(), parameterableElement.getOwningParameter());
			assertSame(getFixture().getOwnedParameteredElement(), getFixture().getParameteredElement());

			getFixture().setOwnedParameteredElement(null);

			assertSame(null, getFixture().getOwnedParameteredElement());
			assertSame(null, parameterableElement.getOwningParameter());
			assertNotSame(getFixture().getOwnedParameteredElement(), getFixture().getParameteredElement());
		}
	}

	public void testGetDefault() {

		for (Iterator eAllSubClasses = getEAllSubClasses(UML2Package.eINSTANCE.getParameterableElement()).iterator(); eAllSubClasses.hasNext();) {
			ParameterableElement parameterableElement = (ParameterableElement) UML2Factory.eINSTANCE.create((EClass) eAllSubClasses.next());

			getFixture().setDefault(parameterableElement);

			assertSame(parameterableElement, getFixture().getDefault());

			getFixture().setDefault(null);

			assertSame(null, getFixture().getDefault());
		}
	}

	public void testSetDefault() {

		for (Iterator eAllSubClasses = getEAllSubClasses(UML2Package.eINSTANCE.getParameterableElement()).iterator(); eAllSubClasses.hasNext();) {
			EClass eClass = (EClass) eAllSubClasses.next();

			getFixture().setOwnedDefault((ParameterableElement) UML2Factory.eINSTANCE.create(eClass));

			ParameterableElement parameterableElement = (ParameterableElement) UML2Factory.eINSTANCE.create(eClass);

			getFixture().setDefault(parameterableElement);

			assertSame(parameterableElement, getFixture().getDefault());
			assertSame(null, getFixture().getOwnedDefault());

			getFixture().setDefault(null);

			assertSame(null, getFixture().getDefault());
			assertSame(getFixture().getDefault(), getFixture().getOwnedDefault());
		}
	}

	public void testGetOwnedDefault() {

		for (Iterator eAllSubClasses = getEAllSubClasses(UML2Package.eINSTANCE.getParameterableElement()).iterator(); eAllSubClasses.hasNext();) {
			ParameterableElement parameterableElement = (ParameterableElement) UML2Factory.eINSTANCE.create((EClass) eAllSubClasses.next());

			getFixture().setOwnedDefault(parameterableElement);

			assertSame(parameterableElement, getFixture().getOwnedDefault());

			getFixture().setOwnedDefault(null);

			assertSame(null, getFixture().getOwnedDefault());
		}
	}

	public void testSetOwnedDefault() {

		for (Iterator eAllSubClasses = getEAllSubClasses(UML2Package.eINSTANCE.getParameterableElement()).iterator(); eAllSubClasses.hasNext();) {
			ParameterableElement parameterableElement = (ParameterableElement) UML2Factory.eINSTANCE.create((EClass) eAllSubClasses.next());

			getFixture().setOwnedDefault(parameterableElement);

			assertSame(parameterableElement, getFixture().getOwnedDefault());
			assertSame(getFixture().getOwnedDefault(), getFixture().getDefault());

			getFixture().setOwnedDefault(null);

			assertSame(null, getFixture().getOwnedDefault());
			assertNotSame(getFixture().getOwnedDefault(), getFixture().getDefault());
		}
	}

	public void testGetOwner() {
		super.testGetOwner();

		assertSame(getFixture().getSignature(), getFixture().getOwner());
	}

	public void testGetOwnedElements() {
		super.testGetOwnedElements();

		assertTrue(getFixture().getOwnedElements().contains(getFixture().getOwnedDefault()));
		assertTrue(getFixture().getOwnedElements().contains(getFixture().getOwnedParameteredElement()));
	}

	/* (non-Javadoc)
	 * @see org.eclipse.uml2.impl.tests.ElementImplTest#setUpOwner()
	 */
	protected void setUpOwner() {
		UML2Factory.eINSTANCE.createTemplateSignature().getOwnedParameters().add(getFixture());
	}

	/* (non-Javadoc)
	 * @see org.eclipse.uml2.impl.tests.ElementImplTest#setUpOwnedElements()
	 */
	protected void setUpOwnedElements() {
		super.setUpOwnedElements();

		getFixture().setOwnedDefault(UML2Factory.eINSTANCE.createLiteralNull());

		getFixture().setOwnedParameteredElement(UML2Factory.eINSTANCE.createInstanceValue());
	}

} //TemplateParameterImplTest
