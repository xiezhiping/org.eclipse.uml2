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
 * $Id: TemplateParameterImplTest.java,v 1.2 2004/05/20 03:03:32 khussey Exp $
 */
package org.eclipse.uml2.impl.tests;

import java.util.Iterator;

import junit.textui.TestRunner;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.uml2.ParameterableElement;
import org.eclipse.uml2.TemplateSignature;
import org.eclipse.uml2.UML2Factory;
import org.eclipse.uml2.UML2Package;
import org.eclipse.uml2.impl.TemplateParameterImpl;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Template Parameter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are tested:
 * <ul>
 *   <li>{@link org.eclipse.uml2.impl.TemplateParameterImpl#getSignature() <em>Signature</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.TemplateParameterImpl#getParameteredElement() <em>Parametered Element</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.TemplateParameterImpl#getOwnedParameteredElement() <em>Owned Parametered Element</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.TemplateParameterImpl#getDefault() <em>Default</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.TemplateParameterImpl#getOwnedDefault() <em>Owned Default</em>}</li>
 * </ul>
 * </p>
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link org.eclipse.uml2.impl.TemplateParameterImpl#getOwner() <em>Get Owner</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.TemplateParameterImpl#getOwnedElements() <em>Get Owned Elements</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class TemplateParameterImplTest extends ElementImplTest {

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
		TestRunner.run(TemplateParameterImplTest.class);
	}

	/**
	 * Constructs a new Template Parameter test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemplateParameterImplTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Template Parameter test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private TemplateParameterImpl getFixture() {
		return (TemplateParameterImpl) fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	protected void setUp() throws Exception {
		setFixture((TemplateParameterImpl) UML2Factory.eINSTANCE.createTemplateParameter());
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
	 * Tests the '{@link org.eclipse.uml2.impl.TemplateParameterImpl#getSignature() <em>Signature</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.TemplateParameterImpl#getSignature()
	 * @generated
	 */
	public void testGetSignatureGen() {
		// TODO: implement this feature getter test method
	}

	public void testGetSignature() {
		testGetSignatureGen();
		
		TemplateSignature templateSignature = UML2Factory.eINSTANCE.createTemplateSignature();

		templateSignature.getOwnedParameters().add(getFixture());

		assertSame(templateSignature, getFixture().getSignature());

		templateSignature.getOwnedParameters().remove(getFixture());

		assertSame(null, getFixture().getSignature());
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.impl.TemplateParameterImpl#setSignature() <em>Signature</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.TemplateParameterImpl#setSignature()
	 * @generated
	 */
	public void testSetSignatureGen() {
		// TODO: implement this feature setter test method
	}

	public void testSetSignature() {
		testSetSignatureGen();
		
		TemplateSignature templateSignature = UML2Factory.eINSTANCE.createTemplateSignature();

		getFixture().setSignature(templateSignature);

		assertSame(templateSignature, getFixture().getSignature());
		assertTrue(templateSignature.getOwnedParameters().contains(getFixture()));

		getFixture().setSignature(null);

		assertSame(null, getFixture().getSignature());
		assertFalse(templateSignature.getOwnedParameters().contains(getFixture()));
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.impl.TemplateParameterImpl#getParameteredElement() <em>Parametered Element</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.TemplateParameterImpl#getParameteredElement()
	 * @generated
	 */
	public void testGetParameteredElementGen() {
		// TODO: implement this feature getter test method
	}

	public void testGetParameteredElement() {
		testGetParameteredElementGen();

		for (Iterator eAllSubClasses = getEAllSubClasses(UML2Package.eINSTANCE.getParameterableElement()).iterator(); eAllSubClasses.hasNext();) {
			ParameterableElement parameterableElement = (ParameterableElement) UML2Factory.eINSTANCE.create((EClass) eAllSubClasses.next());

			parameterableElement.setTemplateParameter(getFixture());

			assertSame(parameterableElement, getFixture().getParameteredElement());

			parameterableElement.setTemplateParameter(null);

			assertSame(null, getFixture().getParameteredElement());
		}
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.impl.TemplateParameterImpl#setParameteredElement() <em>Parametered Element</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.TemplateParameterImpl#setParameteredElement()
	 * @generated
	 */
	public void testSetParameteredElementGen() {
		// TODO: implement this feature setter test method
	}

	public void testSetParameteredElement() {
		testSetParameteredElementGen();

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

	/**
	 * Tests the '{@link org.eclipse.uml2.impl.TemplateParameterImpl#getOwnedParameteredElement() <em>Owned Parametered Element</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.TemplateParameterImpl#getOwnedParameteredElement()
	 * @generated
	 */
	public void testGetOwnedParameteredElementGen() {
		// TODO: implement this feature getter test method
	}

	public void testGetOwnedParameteredElement() {
		testGetOwnedParameteredElementGen();
		
		for (Iterator eAllSubClasses = getEAllSubClasses(UML2Package.eINSTANCE.getParameterableElement()).iterator(); eAllSubClasses.hasNext();) {
			ParameterableElement parameterableElement = (ParameterableElement) UML2Factory.eINSTANCE.create((EClass) eAllSubClasses.next());

			parameterableElement.setOwningParameter(getFixture());

			assertSame(parameterableElement, getFixture().getOwnedParameteredElement());

			parameterableElement.setOwningParameter(null);

			assertSame(null, getFixture().getOwnedParameteredElement());
		}
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.impl.TemplateParameterImpl#setOwnedParameteredElement() <em>Owned Parametered Element</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.TemplateParameterImpl#setOwnedParameteredElement()
	 * @generated
	 */
	public void testSetOwnedParameteredElementGen() {
		// TODO: implement this feature setter test method
	}

	public void testSetOwnedParameteredElement() {
		testSetOwnedParameteredElementGen();

		for (Iterator eAllSubClasses = getEAllSubClasses(UML2Package.eINSTANCE.getParameterableElement()).iterator(); eAllSubClasses.hasNext();) {
			ParameterableElement parameterableElement = (ParameterableElement) UML2Factory.eINSTANCE.create((EClass) eAllSubClasses.next());

			getFixture().setOwnedParameteredElement(parameterableElement);

			assertSame(parameterableElement, getFixture().getOwnedParameteredElement());
			assertSame(getFixture(), parameterableElement.getOwningParameter());
			assertSame(getFixture().getOwnedParameteredElement(), getFixture().getParameteredElement());

			getFixture().setOwnedParameteredElement(null);

			assertSame(null, getFixture().getOwnedParameteredElement());
			assertSame(null, parameterableElement.getOwningParameter());
			assertSame(getFixture().getOwnedParameteredElement(), getFixture().getParameteredElement());
		}
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.impl.TemplateParameterImpl#getDefault() <em>Default</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.TemplateParameterImpl#getDefault()
	 * @generated
	 */
	public void testGetDefaultGen() {
		// TODO: implement this feature getter test method
	}

	public void testGetDefault() {
		testGetDefaultGen();

		for (Iterator eAllSubClasses = getEAllSubClasses(UML2Package.eINSTANCE.getParameterableElement()).iterator(); eAllSubClasses.hasNext();) {
			ParameterableElement parameterableElement = (ParameterableElement) UML2Factory.eINSTANCE.create((EClass) eAllSubClasses.next());

			getFixture().setDefault(parameterableElement);

			assertSame(parameterableElement, getFixture().getDefault());

			getFixture().setDefault(null);

			assertSame(null, getFixture().getDefault());
		}
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.impl.TemplateParameterImpl#setDefault() <em>Default</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.TemplateParameterImpl#setDefault()
	 * @generated
	 */
	public void testSetDefaultGen() {
		// TODO: implement this feature setter test method
	}

	public void testSetDefault() {
		testSetDefaultGen();

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

	/**
	 * Tests the '{@link org.eclipse.uml2.impl.TemplateParameterImpl#getOwnedDefault() <em>Owned Default</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.TemplateParameterImpl#getOwnedDefault()
	 * @generated
	 */
	public void testGetOwnedDefaultGen() {
		// TODO: implement this feature getter test method
	}

	public void testGetOwnedDefault() {
		testGetOwnedDefaultGen();

		for (Iterator eAllSubClasses = getEAllSubClasses(UML2Package.eINSTANCE.getParameterableElement()).iterator(); eAllSubClasses.hasNext();) {
			ParameterableElement parameterableElement = (ParameterableElement) UML2Factory.eINSTANCE.create((EClass) eAllSubClasses.next());

			getFixture().setOwnedDefault(parameterableElement);

			assertSame(parameterableElement, getFixture().getOwnedDefault());

			getFixture().setOwnedDefault(null);

			assertSame(null, getFixture().getOwnedDefault());
		}
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.impl.TemplateParameterImpl#setOwnedDefault() <em>Owned Default</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.TemplateParameterImpl#setOwnedDefault()
	 * @generated
	 */
	public void testSetOwnedDefaultGen() {
		// TODO: implement this feature setter test method
	}

	public void testSetOwnedDefault() {
		testSetOwnedDefaultGen();

		for (Iterator eAllSubClasses = getEAllSubClasses(UML2Package.eINSTANCE.getParameterableElement()).iterator(); eAllSubClasses.hasNext();) {
			ParameterableElement parameterableElement = (ParameterableElement) UML2Factory.eINSTANCE.create((EClass) eAllSubClasses.next());

			getFixture().setOwnedDefault(parameterableElement);

			assertSame(parameterableElement, getFixture().getOwnedDefault());
			assertSame(getFixture().getOwnedDefault(), getFixture().getDefault());

			getFixture().setOwnedDefault(null);

			assertSame(null, getFixture().getOwnedDefault());
			assertSame(getFixture().getOwnedDefault(), getFixture().getDefault());
		}
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.impl.TemplateParameterImpl#getOwner() <em>Get Owner</em>}' getter operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.TemplateParameterImpl#getOwner()
	 * @generated
	 */
	public void testGetOwnerGen() {
		// TODO: implement this getter operation test method
	}

	public void testGetOwner() {
		testGetOwnerGen();
		
		super.testGetOwner();

		assertSame(getFixture().getSignature(), getFixture().getOwner());
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.impl.TemplateParameterImpl#getOwnedElements() <em>Get Owned Elements</em>}' getter operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.TemplateParameterImpl#getOwnedElements()
	 * @generated
	 */
	public void testGetOwnedElementsGen() {
		// TODO: implement this getter operation test method
	}

	public void testGetOwnedElements() {
		testGetOwnedElementsGen();
		
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
