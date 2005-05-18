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
 * $Id: UseCaseTest.java,v 1.2 2005/05/18 17:04:27 khussey Exp $
 */
package org.eclipse.uml2.tests;

import junit.textui.TestRunner;

import org.eclipse.uml2.UML2Factory;
import org.eclipse.uml2.UseCase;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Use Case</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class UseCaseTest extends BehavioredClassifierTest {

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
		TestRunner.run(UseCaseTest.class);
	}

	/**
	 * Constructs a new Use Case test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UseCaseTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Use Case test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private UseCase getFixture() {
		return (UseCase)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	protected void setUp() throws Exception {
		setFixture(UML2Factory.eINSTANCE.createUseCase());
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
	 * Tests the '{@link org.eclipse.uml2.Namespace#getOwnedMembers() <em>Owned Member</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.Namespace#getOwnedMembers()
	 * @generated
	 */
	public void testGetOwnedMembersGen() {
		// TODO: implement this union feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}
	public void testGetOwnedMembers() {
		testGetOwnedMembersGen();
		
		super.testGetOwnedMembers();

		assertTrue(getFixture().getOwnedMembers().containsAll(getFixture().getExtends()));
		assertTrue(getFixture().getOwnedMembers().containsAll(getFixture().getExtensionPoints()));
		assertTrue(getFixture().getOwnedMembers().containsAll(getFixture().getIncludes()));
	}

	/* (non-Javadoc)
	 * @see org.eclipse.uml2.impl.tests.NamedElementImplTest#setUpNamespace()
	 */
	protected void setUpNamespace() {
		UML2Factory.eINSTANCE.createPackage().getOwnedMembers().add(getFixture());
	}

	/* (non-Javadoc)
	 * @see org.eclipse.uml2.impl.tests.ElementImplTest#setUpOwner()
	 */
	protected void setUpOwner() {
		UML2Factory.eINSTANCE.createTemplateParameter().setOwnedParameteredElement(getFixture());
	}

	/* (non-Javadoc)
	 * @see org.eclipse.uml2.impl.tests.NamespaceImplTest#setUpOwnedMembers()
	 */
	protected void setUpOwnedMembers() {
		super.setUpOwnedMembers();

		getFixture().getExtends().add(UML2Factory.eINSTANCE.createExtend());
		getFixture().getExtends().add(UML2Factory.eINSTANCE.createExtend());

		getFixture().getExtensionPoints().add(UML2Factory.eINSTANCE.createExtensionPoint());
		getFixture().getExtensionPoints().add(UML2Factory.eINSTANCE.createExtensionPoint());

		getFixture().getIncludes().add(UML2Factory.eINSTANCE.createInclude());
		getFixture().getIncludes().add(UML2Factory.eINSTANCE.createInclude());
	}

} //UseCaseImplTest
