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
 * $Id: NamedElementImplTest.java,v 1.2 2004/05/11 15:20:49 khussey Exp $
 */
package org.eclipse.uml2.impl.tests;

import java.util.Iterator;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.uml2.Dependency;
import org.eclipse.uml2.NamedElement;
import org.eclipse.uml2.UML2Factory;
import org.eclipse.uml2.UML2Package;
import org.eclipse.uml2.impl.NamedElementImpl;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Named Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are tested:
 * <ul>
 *   <li>{@link org.eclipse.uml2.impl.NamedElementImpl#getQualifiedName() <em>Qualified Name</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.NamedElementImpl#getClientDependencies() <em>Client Dependency</em>}</li>
 * </ul>
 * </p>
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link org.eclipse.uml2.impl.NamedElementImpl#validateNoName(EDiagnosticChain, EMap) <em>Validate No Name</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.NamedElementImpl#validateQualifiedName(EDiagnosticChain, EMap) <em>Validate Qualified Name</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.NamedElementImpl#allNamespaces() <em>All Namespaces</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.NamedElementImpl#isDistinguishableFrom(NamedElement, Namespace) <em>Is Distinguishable From</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.NamedElementImpl#separator() <em>Separator</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.NamedElementImpl#qualifiedName() <em>Qualified Name</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.NamedElementImpl#validateVisibilityNeedsOwnership(EDiagnosticChain, EMap) <em>Validate Visibility Needs Ownership</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.NamedElementImpl#getNamespace() <em>Get Namespace</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.NamedElementImpl#getOwner() <em>Get Owner</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.NamedElementImpl#getOwnedElements() <em>Get Owned Elements</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public abstract class NamedElementImplTest extends TemplateableElementImplTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2003, 2004 IBM Corporation and others."; //$NON-NLS-1$

	/**
	 * Constructs a new Named Element test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamedElementImplTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Named Element test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private NamedElementImpl getFixture() {
		return (NamedElementImpl) fixture;
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.impl.NamedElementImpl#getQualifiedName() <em>Qualified Name</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.NamedElementImpl#getQualifiedName()
	 * @generated NOT
	 */
	public void testGetQualifiedName() {
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

	/**
	 * Tests the '{@link org.eclipse.uml2.impl.NamedElementImpl#getClientDependencies() <em>Client Dependency</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.NamedElementImpl#getClientDependencies()
	 * @generated NOT
	 */
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
	 * Tests the '{@link org.eclipse.uml2.impl.NamedElementImpl#validateNoName(EDiagnosticChain, EMap) <em>Validate No Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.NamedElementImpl#validateNoName(EDiagnosticChain, EMap)
	 * @generated
	 */
	public void testValidateNoName__EDiagnosticChain_EMap() {
		// TODO: implement this operation test method
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.impl.NamedElementImpl#validateQualifiedName(EDiagnosticChain, EMap) <em>Validate Qualified Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.NamedElementImpl#validateQualifiedName(EDiagnosticChain, EMap)
	 * @generated
	 */
	public void testValidateQualifiedName__EDiagnosticChain_EMap() {
		// TODO: implement this operation test method
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.impl.NamedElementImpl#allNamespaces() <em>All Namespaces</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.NamedElementImpl#allNamespaces()
	 * @generated NOT
	 */
	public void testAllNamespaces() {
		setUpNamespace();

		for (NamedElement namedElement = getFixture(); null != namedElement; namedElement = namedElement.getNamespace()) {
			assertEquals(namedElement.allNamespaces().size() - 1, namedElement.allNamespaces().indexOf(namedElement.getNamespace()));
		}
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.impl.NamedElementImpl#isDistinguishableFrom(NamedElement, Namespace) <em>Is Distinguishable From</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.NamedElementImpl#isDistinguishableFrom(NamedElement, Namespace)
	 * @generated
	 */
	public void testIsDistinguishableFrom__NamedElement_Namespace() {
		// TODO: implement this operation test method
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.impl.NamedElementImpl#separator() <em>Separator</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.NamedElementImpl#separator()
	 * @generated NOT
	 */
	public void testSeparator() {
		assertEquals(NamedElement.SEPARATOR, getFixture().separator());
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.impl.NamedElementImpl#qualifiedName() <em>Qualified Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.NamedElementImpl#qualifiedName()
	 * @generated NOT
	 */
	public void testQualifiedName() {
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
	 * Tests the '{@link org.eclipse.uml2.impl.NamedElementImpl#validateVisibilityNeedsOwnership(EDiagnosticChain, EMap) <em>Validate Visibility Needs Ownership</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.NamedElementImpl#validateVisibilityNeedsOwnership(EDiagnosticChain, EMap)
	 * @generated
	 */
	public void testValidateVisibilityNeedsOwnership__EDiagnosticChain_EMap() {
		// TODO: implement this operation test method
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.impl.NamedElementImpl#getNamespace() <em>Get Namespace</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.NamedElementImpl#getNamespace()
	 * @generated NOT
	 */
	public void testGetNamespace() {
		setUpNamespace();

		if (null != getFixture().eContainer()) {
			assertSame(getFixture().eContainer(), getFixture().getNamespace());
		}
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.impl.NamedElementImpl#getOwner() <em>Get Owner</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.NamedElementImpl#getOwner()
	 * @generated NOT
	 */
	public void testGetOwner() {
		super.testGetOwner();

		if (null != getFixture().getNamespace()) {
			assertSame(getFixture().getNamespace(), getFixture().getOwner());
		}
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.impl.NamedElementImpl#getOwnedElements() <em>Get Owned Elements</em>}' getter operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.NamedElementImpl#getOwnedElements()
	 * @generated NOT
	 */
	public void testGetOwnedElements() {
		super.testGetOwnedElements();

		assertTrue(getFixture().getOwnedElements().contains(getFixture().getNameExpression()));
	}

	/**
	 * @see org.eclipse.uml2.impl.tests.ElementImplTest#setUpOwnedElements()
	 */
	protected void setUpOwnedElements() {
		super.setUpOwnedElements();

		getFixture().setNameExpression(UML2Factory.eINSTANCE.createStringExpression());
	}

	protected abstract void setUpNamespace();

} //NamedElementImplTest
