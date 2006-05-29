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
 * $Id: RegionTest.java,v 1.4 2006/05/29 17:27:34 khussey Exp $
 */
package org.eclipse.uml2.tests;

import java.util.Iterator;

import junit.textui.TestRunner;

import org.eclipse.uml2.Region;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.uml2.UML2Factory;
import org.eclipse.uml2.UML2Package;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Region</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are tested:
 * <ul>
 *   <li>{@link org.eclipse.uml2.Region#getRedefinitionContexts() <em>Redefinition Context</em>}</li>
 * </ul>
 * </p>
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link org.eclipse.uml2.RedefinableElement#validateRedefinitionContextValid(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Redefinition Context Valid</em>}</li>
 *   <li>{@link org.eclipse.uml2.RedefinableElement#validateRedefinitionConsistent(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Redefinition Consistent</em>}</li>
 *   <li>{@link org.eclipse.uml2.RedefinableElement#isConsistentWith(org.eclipse.uml2.RedefinableElement) <em>Is Consistent With</em>}</li>
 *   <li>{@link org.eclipse.uml2.RedefinableElement#isRedefinitionContextValid(org.eclipse.uml2.RedefinableElement) <em>Is Redefinition Context Valid</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class RegionTest extends NamespaceTest {

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
		TestRunner.run(RegionTest.class);
	}

	/**
	 * Constructs a new Region test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RegionTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Region test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private Region getFixture() {
		return (Region)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	protected void setUp() throws Exception {
		setFixture(UML2Factory.eINSTANCE.createRegion());
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
	 * Tests the '{@link org.eclipse.uml2.RedefinableElement#validateRedefinitionContextValid(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Redefinition Context Valid</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.RedefinableElement#validateRedefinitionContextValid(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	public void testValidateRedefinitionContextValid__DiagnosticChain_Map() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.RedefinableElement#validateRedefinitionConsistent(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Redefinition Consistent</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.RedefinableElement#validateRedefinitionConsistent(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	public void testValidateRedefinitionConsistent__DiagnosticChain_Map() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.RedefinableElement#isConsistentWith(org.eclipse.uml2.RedefinableElement) <em>Is Consistent With</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.RedefinableElement#isConsistentWith(org.eclipse.uml2.RedefinableElement)
	 * @generated
	 */
	public void testIsConsistentWith__RedefinableElement() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.RedefinableElement#isRedefinitionContextValid(org.eclipse.uml2.RedefinableElement) <em>Is Redefinition Context Valid</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.RedefinableElement#isRedefinitionContextValid(org.eclipse.uml2.RedefinableElement)
	 * @generated
	 */
	public void testIsRedefinitionContextValid__RedefinableElement() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}



	/**
	 * Tests the '{@link org.eclipse.uml2.Region#getRedefinitionContexts() <em>Redefinition Context</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.Region#getRedefinitionContexts()
	 * @generated
	 */
	public void testGetRedefinitionContextsGen() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	public void testGetRedefinitionContexts() {
		testGetRedefinitionContextsGen();
		
		assertTrue(getFixture().getRedefinitionContexts().isEmpty());
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.RedefinableElement#getRedefinedElements() <em>Redefined Element</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.RedefinableElement#getRedefinedElements()
	 * @generated
	 */
	public void testGetRedefinedElementsGen() {
		// TODO: implement this redefined feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}
	public void testGetRedefinedElements() {
		testGetRedefinedElementsGen();
		
		assertTrue(getFixture().getRedefinedElements().isEmpty());
	}

	public void testGetOwnedElements() {
		super.testGetOwnedElements();

		assertTrue(getFixture().getOwnedElements().containsAll(getFixture().getSubvertices()));
		assertTrue(getFixture().getOwnedElements().containsAll(getFixture().getTransitions()));
	}

	public void testGetNamespace() {
		super.testGetNamespace();
		
		assertSame(getFixture().getStateMachine(), getFixture().getNamespace());
		
		UML2Factory.eINSTANCE.createState().getRegions().add(getFixture());
		
		assertSame(getFixture().getState(), getFixture().getNamespace());
	}

	/* (non-Javadoc)
	 * @see org.eclipse.uml2.impl.tests.NamedElementImplTest#setUpNamespace()
	 */
	protected void setUpNamespace() {
		UML2Factory.eINSTANCE.createStateMachine().getRegions().add(getFixture());
	}

	/* (non-Javadoc)
	 * @see org.eclipse.uml2.impl.tests.ElementImplTest#setUpOwner()
	 */
	protected void setUpOwner() {
		UML2Factory.eINSTANCE.createStateMachine().getRegions().add(getFixture());
	}

	/* (non-Javadoc)
	 * @see org.eclipse.uml2.impl.tests.ElementImplTest#setUpOwnedElements()
	 */
	protected void setUpOwnedElements() {
		super.setUpOwnedElements();

		getFixture().getSubvertices().add(UML2Factory.eINSTANCE.createState());
		getFixture().getSubvertices().add(UML2Factory.eINSTANCE.createState());

		getFixture().getTransitions().add(UML2Factory.eINSTANCE.createTransition());
		getFixture().getTransitions().add(UML2Factory.eINSTANCE.createTransition());
	}

	public void testGetSubvertices() {

		for (Iterator vertexSubClasses = getEAllSubClasses(UML2Package.eINSTANCE.getVertex()).iterator(); vertexSubClasses.hasNext();) {
			EClass vertexSubClass = (EClass) vertexSubClasses.next();

			for (int i = 0; i < 5; i++) {
				assertTrue(getFixture().getSubvertices().contains(getFixture().createSubvertex(vertexSubClass)));
			}
		}
	}

} //RegionImplTest
