/*
 * Copyright (c) 2003, 2004 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *
 * $Id: ElementImportImplTest.java,v 1.4 2005/03/15 18:51:31 khussey Exp $
 */
package org.eclipse.uml2.impl.tests;

import java.util.Iterator;

import junit.textui.TestRunner;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.uml2.Namespace;
import org.eclipse.uml2.UML2Factory;
import org.eclipse.uml2.UML2Package;
import org.eclipse.uml2.impl.ElementImportImpl;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Element Import</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are tested:
 * <ul>
 *   <li>{@link org.eclipse.uml2.impl.ElementImportImpl#getImportingNamespace() <em>Importing Namespace</em>}</li>
 * </ul>
 * </p>
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link org.eclipse.uml2.impl.ElementImportImpl#validateVisibilityPublicOrPrivate(EDiagnosticChain, EMap) <em>Validate Visibility Public Or Private</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.ElementImportImpl#validateImportedElementIsPublic(EDiagnosticChain, EMap) <em>Validate Imported Element Is Public</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.ElementImportImpl#getName() <em>Get Name</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.ElementImportImpl#getTargets() <em>Get Targets</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.ElementImportImpl#getSources() <em>Get Sources</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.ElementImportImpl#getOwner() <em>Get Owner</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class ElementImportImplTest extends DirectedRelationshipImplTest {

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
		TestRunner.run(ElementImportImplTest.class);
	}

	/**
	 * Constructs a new Element Import test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElementImportImplTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Element Import test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private ElementImportImpl getFixture() {
		return (ElementImportImpl) fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	protected void setUp() throws Exception {
		setFixture((ElementImportImpl) UML2Factory.eINSTANCE.createElementImport());
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
	 * Tests the '{@link org.eclipse.uml2.impl.ElementImportImpl#getImportingNamespace() <em>Importing Namespace</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.ElementImportImpl#getImportingNamespace()
	 * @generated
	 */
	public void testGetImportingNamespaceGen() {
		// TODO: implement this feature getter test method
	}

	public void testGetImportingNamespace() {
		testGetImportingNamespaceGen();

		for (Iterator eAllSubClasses = getEAllSubClasses(UML2Package.eINSTANCE.getNamespace()).iterator(); eAllSubClasses.hasNext();) {
			Namespace namespace = (Namespace) UML2Factory.eINSTANCE.create((EClass) eAllSubClasses.next());

			namespace.getElementImports().add(getFixture());

			assertSame(namespace, getFixture().getImportingNamespace());

			namespace.getElementImports().remove(getFixture());

			assertSame(null, getFixture().getImportingNamespace());
		}
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.impl.ElementImportImpl#setImportingNamespace() <em>Importing Namespace</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.ElementImportImpl#setImportingNamespace()
	 * @generated
	 */
	public void testSetImportingNamespaceGen() {
		// TODO: implement this feature setter test method
	}

	public void testSetImportingNamespace() {
		testSetImportingNamespaceGen();

		for (Iterator eAllSubClasses = getEAllSubClasses(UML2Package.eINSTANCE.getNamespace()).iterator(); eAllSubClasses.hasNext();) {
			Namespace namespace = (Namespace) UML2Factory.eINSTANCE.create((EClass) eAllSubClasses.next());

			getFixture().setImportingNamespace(namespace);

			assertSame(namespace, getFixture().getImportingNamespace());
			assertTrue(namespace.getElementImports().contains(getFixture()));

			getFixture().setImportingNamespace(null);

			assertSame(null, getFixture().getImportingNamespace());
			assertFalse(namespace.getElementImports().contains(getFixture()));
		}
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.impl.ElementImportImpl#validateVisibilityPublicOrPrivate(EDiagnosticChain, EMap) <em>Validate Visibility Public Or Private</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.ElementImportImpl#validateVisibilityPublicOrPrivate(EDiagnosticChain, EMap)
	 * @generated
	 */
	public void testValidateVisibilityPublicOrPrivate__EDiagnosticChain_EMap() {
		// TODO: implement this operation test method
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.impl.ElementImportImpl#validateImportedElementIsPublic(EDiagnosticChain, EMap) <em>Validate Imported Element Is Public</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.ElementImportImpl#validateImportedElementIsPublic(EDiagnosticChain, EMap)
	 * @generated
	 */
	public void testValidateImportedElementIsPublic__EDiagnosticChain_EMap() {
		// TODO: implement this operation test method
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.impl.ElementImportImpl#getName() <em>Get Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.ElementImportImpl#getName()
	 * @generated
	 */
	public void testGetNameGen() {
		// TODO: implement this operation test method
	}

	public void testGetName() {
		testGetNameGen();
		
		setUpTargets();

		getFixture().setAlias(null);
		assertEquals(getFixture().getImportedElement().getName(), getFixture().getName());

		getFixture().setAlias(getName());
		assertEquals(getFixture().getAlias(), getFixture().getName());
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.impl.ElementImportImpl#getTargets() <em>Get Targets</em>}' getter operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.ElementImportImpl#getTargets()
	 * @generated
	 */
	public void testGetTargetsGen() {
		// TODO: implement this getter operation test method
	}

	public void testGetTargets() {
		testGetTargetsGen();
		
		super.testGetTargets();

		assertTrue(getFixture().getTargets().contains(getFixture().getImportedElement()));
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.impl.ElementImportImpl#getSources() <em>Get Sources</em>}' getter operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.ElementImportImpl#getSources()
	 * @generated
	 */
	public void testGetSourcesGen() {
		// TODO: implement this getter operation test method
	}

	public void testGetSources() {
		testGetSourcesGen();
		
		super.testGetSources();

		assertTrue(getFixture().getSources().contains(getFixture().getImportingNamespace()));
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.impl.ElementImportImpl#getOwner() <em>Get Owner</em>}' getter operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.ElementImportImpl#getOwner()
	 * @generated
	 */
	public void testGetOwnerGen() {
		// TODO: implement this getter operation test method
	}

	public void testGetOwner() {
		testGetOwnerGen();
		
		super.testGetOwner();

		assertSame(getFixture().getImportingNamespace(), getFixture().getOwner());
	}

	/* (non-Javadoc)
	 * @see org.eclipse.uml2.impl.tests.ElementImplTest#setUpOwner()
	 */
	protected void setUpOwner() {
		UML2Factory.eINSTANCE.createPackage().getElementImports().add(getFixture());
	}

	/* (non-Javadoc)
	 * @see org.eclipse.uml2.impl.tests.DirectedRelationshipImplTest#setUpSources()
	 */
	protected void setUpSources() {
		setUpOwner();
	}

	/* (non-Javadoc)
	 * @see org.eclipse.uml2.impl.tests.DirectedRelationshipImplTest#setUpTargets()
	 */
	protected void setUpTargets() {
		getFixture().setImportedElement(UML2Factory.eINSTANCE.createActor());
	}

} //ElementImportImplTest
