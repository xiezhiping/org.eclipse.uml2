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
 * $Id: TemplateSignatureImplTest.java,v 1.2 2004/05/20 03:03:32 khussey Exp $
 */
package org.eclipse.uml2.impl.tests;

import java.util.Iterator;

import junit.textui.TestRunner;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.uml2.TemplateParameter;
import org.eclipse.uml2.UML2Factory;
import org.eclipse.uml2.UML2Package;
import org.eclipse.uml2.impl.TemplateSignatureImpl;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Template Signature</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are tested:
 * <ul>
 *   <li>{@link org.eclipse.uml2.impl.TemplateSignatureImpl#getParameters() <em>Parameter</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.TemplateSignatureImpl#getOwnedParameters() <em>Owned Parameter</em>}</li>
 * </ul>
 * </p>
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link org.eclipse.uml2.impl.TemplateSignatureImpl#getOwnedElements() <em>Get Owned Elements</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.TemplateSignatureImpl#getOwner() <em>Get Owner</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class TemplateSignatureImplTest extends ElementImplTest {

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
		TestRunner.run(TemplateSignatureImplTest.class);
	}

	/**
	 * Constructs a new Template Signature test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemplateSignatureImplTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Template Signature test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private TemplateSignatureImpl getFixture() {
		return (TemplateSignatureImpl) fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	protected void setUp() throws Exception {
		setFixture((TemplateSignatureImpl) UML2Factory.eINSTANCE.createTemplateSignature());
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
	 * Tests the '{@link org.eclipse.uml2.impl.TemplateSignatureImpl#getParameters() <em>Parameter</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.TemplateSignatureImpl#getParameters()
	 * @generated
	 */
	public void testGetParametersGen() {
		// TODO: implement this feature getter test method
	}

	public void testGetParameters() {
		testGetParametersGen();

		for (Iterator eAllSubClasses = getEAllSubClasses(UML2Package.eINSTANCE.getTemplateParameter()).iterator(); eAllSubClasses.hasNext();) {
			TemplateParameter templateParameter = (TemplateParameter) UML2Factory.eINSTANCE.create((EClass) eAllSubClasses.next());

			getFixture().getOwnedParameters().add(templateParameter);

			getFixture().getParameters().remove(templateParameter);

			assertFalse(getFixture().getParameters().contains(templateParameter));
			assertFalse(getFixture().getOwnedParameters().contains(templateParameter));

			getFixture().getParameters().add(templateParameter);

			assertTrue(getFixture().getParameters().contains(templateParameter));
			assertFalse(getFixture().getOwnedParameters().contains(templateParameter));
		}
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.impl.TemplateSignatureImpl#getOwnedParameters() <em>Owned Parameter</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.TemplateSignatureImpl#getOwnedParameters()
	 * @generated
	 */
	public void testGetOwnedParametersGen() {
		// TODO: implement this feature getter test method
	}

	public void testGetOwnedParameters() {
		testGetOwnedParametersGen();

		for (Iterator eAllSubClasses = getEAllSubClasses(UML2Package.eINSTANCE.getTemplateParameter()).iterator(); eAllSubClasses.hasNext();) {
			TemplateParameter templateParameter = (TemplateParameter) UML2Factory.eINSTANCE.create((EClass) eAllSubClasses.next());

			getFixture().getOwnedParameters().add(templateParameter);

			assertTrue(getFixture().getOwnedParameters().contains(templateParameter));
			assertTrue(getFixture().getParameters().contains(templateParameter));

			getFixture().getOwnedParameters().remove(templateParameter);

			assertFalse(getFixture().getOwnedParameters().contains(templateParameter));
			assertTrue(getFixture().getParameters().contains(templateParameter));
		}
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.impl.TemplateSignatureImpl#getOwnedElements() <em>Get Owned Elements</em>}' getter operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.TemplateSignatureImpl#getOwnedElements()
	 * @generated
	 */
	public void testGetOwnedElementsGen() {
		// TODO: implement this getter operation test method
	}

	public void testGetOwnedElements() {
		testGetOwnedElementsGen();
		
		super.testGetOwnedElements();

		assertTrue(getFixture().getOwnedElements().containsAll(getFixture().getOwnedParameters()));
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.impl.TemplateSignatureImpl#getOwner() <em>Get Owner</em>}' getter operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.TemplateSignatureImpl#getOwner()
	 * @generated
	 */
	public void testGetOwnerGen() {
		// TODO: implement this getter operation test method
	}

	public void testGetOwner() {
		testGetOwnerGen();
		
		super.testGetOwner();

		assertSame(getFixture().getTemplate(), getFixture().getOwner());
	}

	/* (non-Javadoc)
	 * @see org.eclipse.uml2.impl.tests.ElementImplTest#setUpOwner()
	 */
	protected void setUpOwner() {
		UML2Factory.eINSTANCE.createComment().setOwnedTemplateSignature(getFixture());
	}

	/* (non-Javadoc)
	 * @see org.eclipse.uml2.impl.tests.ElementImplTest#setUpOwnedElements()
	 */
	protected void setUpOwnedElements() {
		super.setUpOwnedElements();

		getFixture().getOwnedParameters().add(UML2Factory.eINSTANCE.createTemplateParameter());
		getFixture().getOwnedParameters().add(UML2Factory.eINSTANCE.createTemplateParameter());
	}

} //TemplateSignatureImplTest
