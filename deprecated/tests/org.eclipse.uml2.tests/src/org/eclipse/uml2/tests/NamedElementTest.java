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
 * $Id: NamedElementTest.java,v 1.4 2006/05/29 17:27:34 khussey Exp $
 */
package org.eclipse.uml2.tests;

import java.util.Iterator;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.uml2.Dependency;
import org.eclipse.uml2.NamedElement;

import org.eclipse.uml2.UML2Factory;
import org.eclipse.uml2.UML2Package;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Named Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are tested:
 * <ul>
 *   <li>{@link org.eclipse.uml2.NamedElement#getQualifiedName() <em>Qualified Name</em>}</li>
 * </ul>
 * </p>
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link org.eclipse.uml2.NamedElement#validateNoName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate No Name</em>}</li>
 *   <li>{@link org.eclipse.uml2.NamedElement#validateQualifiedName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Qualified Name</em>}</li>
 *   <li>{@link org.eclipse.uml2.NamedElement#allNamespaces() <em>All Namespaces</em>}</li>
 *   <li>{@link org.eclipse.uml2.NamedElement#isDistinguishableFrom(org.eclipse.uml2.NamedElement, org.eclipse.uml2.Namespace) <em>Is Distinguishable From</em>}</li>
 *   <li>{@link org.eclipse.uml2.NamedElement#separator() <em>Separator</em>}</li>
 *   <li>{@link org.eclipse.uml2.NamedElement#qualifiedName() <em>Qualified Name</em>}</li>
 *   <li>{@link org.eclipse.uml2.NamedElement#validateVisibilityNeedsOwnership(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Visibility Needs Ownership</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public abstract class NamedElementTest extends TemplateableElementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) IBM Corporation and others."; //$NON-NLS-1$

	/**
	 * Constructs a new Named Element test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamedElementTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Named Element test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private NamedElement getFixture() {
		return (NamedElement)fixture;
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.NamedElement#getQualifiedName() <em>Qualified Name</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.NamedElement#getQualifiedName()
	 * @generated
	 */
	public void testGetQualifiedNameGen() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	public void testGetQualifiedName() {
		testGetQualifiedNameGen();
		
		setUpNamespace();

		for (NamedElement namedElement = getFixture(); null != namedElement; namedElement = namedElement.getNamespace()) {
			namedElement.setName(null);
		}
		assertEquals(getFixture().qualifiedName(), getFixture().getQualifiedName());

		getFixture().setName(getName());
		assertEquals(getFixture().qualifiedName(), getFixture().getQualifiedName());

		for (NamedElement namedElement = getFixture(); null != namedElement; namedElement = namedElement.getNamespace()) {
			namedElement.setName(getName());
		}
		assertEquals(getFixture().qualifiedName(), getFixture().getQualifiedName());
	}

	public void testGetClientDependencies() {

		for (Iterator eAllSubClasses = getEAllSubClasses(UML2Package.eINSTANCE.getDependency()).iterator(); eAllSubClasses.hasNext();) {
			Dependency dependency = (Dependency) UML2Factory.eINSTANCE.create((EClass) eAllSubClasses.next());

			getFixture().getClientDependencies().add(dependency);

			assertTrue(getFixture().getClientDependencies().contains(dependency));
			assertTrue(dependency.getClients().contains(getFixture()));

			getFixture().getClientDependencies().remove(dependency);

			assertFalse(getFixture().getClientDependencies().contains(dependency));
			assertFalse(dependency.getClients().contains(getFixture()));
		}
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.NamedElement#validateNoName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate No Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.NamedElement#validateNoName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	public void testValidateNoName__DiagnosticChain_Map() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.NamedElement#validateQualifiedName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Qualified Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.NamedElement#validateQualifiedName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	public void testValidateQualifiedName__DiagnosticChain_Map() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.NamedElement#allNamespaces() <em>All Namespaces</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.NamedElement#allNamespaces()
	 * @generated
	 */
	public void testAllNamespacesGen() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	public void testAllNamespaces() {
		testAllNamespacesGen();
		
		setUpNamespace();

		for (NamedElement namedElement = getFixture(); null != namedElement; namedElement = namedElement.getNamespace()) {
			assertEquals(namedElement.allNamespaces().size() - 1, namedElement.allNamespaces().indexOf(namedElement.getNamespace()));
		}
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.NamedElement#isDistinguishableFrom(org.eclipse.uml2.NamedElement, org.eclipse.uml2.Namespace) <em>Is Distinguishable From</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.NamedElement#isDistinguishableFrom(org.eclipse.uml2.NamedElement, org.eclipse.uml2.Namespace)
	 * @generated
	 */
	public void testIsDistinguishableFrom__NamedElement_Namespace() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.NamedElement#separator() <em>Separator</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.NamedElement#separator()
	 * @generated
	 */
	public void testSeparatorGen() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	public void testSeparator() {
		testSeparatorGen();
		
		assertEquals(NamedElement.SEPARATOR, getFixture().separator());
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.NamedElement#qualifiedName() <em>Qualified Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.NamedElement#qualifiedName()
	 * @generated
	 */
	public void testQualifiedNameGen() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	public void testQualifiedName() {
		testQualifiedNameGen();
		
		setUpNamespace();

		for (NamedElement namedElement = getFixture(); null != namedElement; namedElement = namedElement.getNamespace()) {
			namedElement.setName(""); //$NON-NLS-1$
		}

		assertEquals("", getFixture().qualifiedName()); //$NON-NLS-1$

		getFixture().setName(getName());
		assertEquals(null == getFixture().getNamespace() ? getName() : "", getFixture().getQualifiedName()); //$NON-NLS-1$

		for (NamedElement namedElement = getFixture(); null != namedElement; namedElement = namedElement.getNamespace()) {
			namedElement.setName(getName());
		}

		String qualifiedName = getFixture().qualifiedName();

		for (NamedElement namedElement = getFixture(); null != namedElement; namedElement = namedElement.getNamespace()) {
			assertTrue(qualifiedName.endsWith(getName()));

			if (-1 != qualifiedName.lastIndexOf(namedElement.separator())) {
				qualifiedName = qualifiedName.substring(0, qualifiedName.lastIndexOf(NamedElement.SEPARATOR));
			}
		}
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.NamedElement#validateVisibilityNeedsOwnership(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Visibility Needs Ownership</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.NamedElement#validateVisibilityNeedsOwnership(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	public void testValidateVisibilityNeedsOwnership__DiagnosticChain_Map() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}


	public void testGetNamespace() {
		setUpNamespace();

		if (null != getFixture().eContainer()) {
			assertSame(getFixture().eContainer(), getFixture().getNamespace());
		}
	}

	public void testGetOwner() {
		super.testGetOwner();

		if (null != getFixture().getNamespace()) {
			assertSame(getFixture().getNamespace(), getFixture().getOwner());
		}
	}

	public void testGetOwnedElements() {
		super.testGetOwnedElements();

		assertTrue(getFixture().getOwnedElements().contains(getFixture().getNameExpression()));
	}

	/* (non-Javadoc)
	 * @see org.eclipse.uml2.impl.tests.ElementImplTest#setUpOwnedElements()
	 */
	protected void setUpOwnedElements() {
		super.setUpOwnedElements();

		getFixture().setNameExpression(UML2Factory.eINSTANCE.createStringExpression());
	}

	protected abstract void setUpNamespace();

} //NamedElementImplTest
