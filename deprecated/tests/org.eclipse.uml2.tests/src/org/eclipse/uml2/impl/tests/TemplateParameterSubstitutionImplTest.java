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
 * $Id: TemplateParameterSubstitutionImplTest.java,v 1.1 2004/04/29 14:56:47 khussey Exp $
 */
package org.eclipse.uml2.impl.tests;

import java.util.Iterator;

import junit.textui.TestRunner;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.uml2.ParameterableElement;
import org.eclipse.uml2.UML2Factory;
import org.eclipse.uml2.UML2Package;
import org.eclipse.uml2.impl.TemplateParameterSubstitutionImpl;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Template Parameter Substitution</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are tested:
 * <ul>
 *   <li>{@link org.eclipse.uml2.impl.TemplateParameterSubstitutionImpl#getActuals() <em>Actual</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.TemplateParameterSubstitutionImpl#getOwnedActual() <em>Owned Actual</em>}</li>
 * </ul>
 * </p>
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link org.eclipse.uml2.impl.TemplateParameterSubstitutionImpl#getOwner() <em>Get Owner</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.TemplateParameterSubstitutionImpl#getOwnedElements() <em>Get Owned Elements</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class TemplateParameterSubstitutionImplTest extends ElementImplTest {

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
		TestRunner.run(TemplateParameterSubstitutionImplTest.class);
	}

	/**
	 * Constructs a new Template Parameter Substitution test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemplateParameterSubstitutionImplTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Template Parameter Substitution test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private TemplateParameterSubstitutionImpl getFixture() {
		return (TemplateParameterSubstitutionImpl) fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	protected void setUp() throws Exception {
		setFixture((TemplateParameterSubstitutionImpl) UML2Factory.eINSTANCE.createTemplateParameterSubstitution());
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

	/**
	 * Tests the '{@link org.eclipse.uml2.impl.TemplateParameterSubstitutionImpl#getActuals() <em>Actual</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.TemplateParameterSubstitutionImpl#getActuals()
	 * @generated NOT
	 */
	public void testGetActuals() {

		for (Iterator eAllSubClasses = getEAllSubClasses(UML2Package.eINSTANCE.getParameterableElement()).iterator(); eAllSubClasses.hasNext();) {
			ParameterableElement parameterableElement = (ParameterableElement) UML2Factory.eINSTANCE.create((EClass) eAllSubClasses.next());

			getFixture().setOwnedActual(parameterableElement);

			getFixture().getActuals().remove(parameterableElement);

			assertFalse(getFixture().getActuals().contains(parameterableElement));
			assertSame(null, getFixture().getOwnedActual());

			getFixture().getActuals().add(parameterableElement);

			assertTrue(getFixture().getActuals().contains(parameterableElement));
			assertSame(null, getFixture().getOwnedActual());
		}
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.impl.TemplateParameterSubstitutionImpl#getOwnedActual() <em>Owned Actual</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.TemplateParameterSubstitutionImpl#getOwnedActual()
	 * @generated NOT
	 */
	public void testGetOwnedActual() {

		for (Iterator eAllSubClasses = getEAllSubClasses(UML2Package.eINSTANCE.getParameterableElement()).iterator(); eAllSubClasses.hasNext();) {
			ParameterableElement parameterableElement = (ParameterableElement) UML2Factory.eINSTANCE.create((EClass) eAllSubClasses.next());

			getFixture().setOwnedActual(parameterableElement);

			assertSame(parameterableElement, getFixture().getOwnedActual());

			getFixture().setOwnedActual(null);

			assertSame(null, getFixture().getOwnedActual());
		}
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.impl.TemplateParameterSubstitutionImpl#setOwnedActual() <em>Owned Actual</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.TemplateParameterSubstitutionImpl#setOwnedActual()
	 * @generated NOT
	 */
	public void testSetOwnedActual() {

		for (Iterator eAllSubClasses = getEAllSubClasses(UML2Package.eINSTANCE.getParameterableElement()).iterator(); eAllSubClasses.hasNext();) {
			ParameterableElement parameterableElement = (ParameterableElement) UML2Factory.eINSTANCE.create((EClass) eAllSubClasses.next());

			getFixture().setOwnedActual(parameterableElement);

			assertSame(parameterableElement, getFixture().getOwnedActual());
			assertTrue(getFixture().getActuals().contains(parameterableElement));

			getFixture().setOwnedActual(null);

			assertSame(null, getFixture().getOwnedActual());
			assertTrue(getFixture().getActuals().contains(parameterableElement));
		}
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.impl.TemplateParameterSubstitutionImpl#getOwner() <em>Get Owner</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.TemplateParameterSubstitutionImpl#getOwner()
	 * @generated NOT
	 */
	public void testGetOwner() {
		super.testGetOwner();

		assertSame(getFixture().getTemplateBinding(), getFixture().getOwner());
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.impl.TemplateParameterSubstitutionImpl#getOwnedElements() <em>Get Owned Elements</em>}' getter operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.TemplateParameterSubstitutionImpl#getOwnedElements()
	 * @generated NOT
	 */
	public void testGetOwnedElements() {
		super.testGetOwnedElements();

		getFixture().setOwnedActual(UML2Factory.eINSTANCE.createInstanceValue());

		assertTrue(getFixture().getOwnedElements().contains(getFixture().getOwnedActual()));
	}

	/**
	 * @see org.eclipse.uml2.impl.tests.ElementImplTest#setUpOwner()
	 */
	protected void setUpOwner() {
		UML2Factory.eINSTANCE.createTemplateBinding().getParameterSubstitutions().add(getFixture());
	}

} //TemplateParameterSubstitutionImplTest
