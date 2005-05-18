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
 * $Id: NamespaceOperationsTest.java,v 1.3 2005/05/18 17:04:28 khussey Exp $
 */
package org.eclipse.uml2.internal.operation.tests;

import java.util.Iterator;
import java.util.List;

import junit.textui.TestRunner;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.uml2.ElementImport;
import org.eclipse.uml2.Namespace;
import org.eclipse.uml2.PackageImport;
import org.eclipse.uml2.PackageableElement;
import org.eclipse.uml2.UML2Factory;
import org.eclipse.uml2.UML2Package;
import org.eclipse.uml2.VisibilityKind;
import org.eclipse.uml2.internal.operation.NamespaceOperations;

/**
 * A test case for the '<em><b>Namespace Operations</b></em>' utility.
 */
public class NamespaceOperationsTest
	extends UML2OperationsTest {

	public static void main(String[] args) {
		TestRunner.run(NamespaceOperationsTest.class);
	}

	/**
	 * Constructs a new Namespace Operations test case with the given name.
	 */
	public NamespaceOperationsTest(String name) {
		super(name);
	}

	/**
	 * Returns the element for this Namespace Operations test case.
	 */
	private Namespace getElement() {
		return (Namespace) element;
	}

	/**
	 * Tests the '
	 * {@link org.eclipse.uml2.internal.operation.NamespaceOperations#importElement() <em>Import Element</em>}'
	 * method.
	 * 
	 * @see org.eclipse.uml2.internal.operation.NamespaceOperations#importElement()
	 */
	public void testImportElement() {

		try {
			NamespaceOperations.importElement(null, null, null);
			fail();
		} catch (IllegalArgumentException iae) {
			// pass
		}

		for (Iterator namespaceSubClasses = getEAllSubClasses(
			UML2Package.eINSTANCE.getNamespace()).iterator(); namespaceSubClasses
			.hasNext();) {

			setElement((Namespace) UML2Factory.eINSTANCE
				.create((EClass) namespaceSubClasses.next()));

			try {
				NamespaceOperations.importElement(getElement(), null, null);
				fail();
			} catch (IllegalArgumentException iae) {
				// pass
			}

			try {
				NamespaceOperations.importElement(getElement(),
					VisibilityKind.PUBLIC_LITERAL, null);
				fail();
			} catch (IllegalArgumentException iae) {
				// pass
			}

			List packageableElementSubClasses = getEAllSubClasses(UML2Package.eINSTANCE
				.getPackageableElement());

			for (int i = 0; i < packageableElementSubClasses.size(); i++) {
				PackageableElement packageableElement = (PackageableElement) UML2Factory.eINSTANCE
					.create((EClass) packageableElementSubClasses.get(i));

				try {
					NamespaceOperations.importElement(getElement(),
						VisibilityKind.PUBLIC_LITERAL, packageableElement);
				} catch (IllegalArgumentException iae) {
					fail();
				}

				assertEquals(i + 1, getElement().getElementImports().size());
				assertSame(packageableElement, ((ElementImport) getElement()
					.getElementImports().get(i)).getImportedElement());
				assertSame(VisibilityKind.PUBLIC_LITERAL,
					((ElementImport) getElement().getElementImports().get(i))
						.getVisibility());

				try {
					NamespaceOperations.importElement(getElement(),
						VisibilityKind.PUBLIC_LITERAL, packageableElement);
					fail();
				} catch (IllegalArgumentException iae) {
					// pass
				}
			}
		}
	}

	/**
	 * Tests the '
	 * {@link org.eclipse.uml2.internal.operation.NamespaceOperations#getImportedPackages() <em>Get Imported Packages</em>}'
	 * method.
	 * 
	 * @see org.eclipse.uml2.internal.operation.NamespaceOperations#getImportedPackages()
	 */
	public void testGetImportedPackages() {

		assertEquals(0, NamespaceOperations.getImportedPackages(null).size());

		org.eclipse.uml2.Package package_ = UML2Factory.eINSTANCE
			.createPackage();

		for (Iterator eAllSubClasses = getEAllSubClasses(
			UML2Package.eINSTANCE.getNamespace()).iterator(); eAllSubClasses
			.hasNext();) {

			setElement((Namespace) UML2Factory.eINSTANCE
				.create((EClass) eAllSubClasses.next()));

			assertEquals(0, NamespaceOperations.getImportedPackages(
				getElement()).size());

			PackageImport packageImport = UML2Factory.eINSTANCE
				.createPackageImport();
			packageImport.setImportedPackage(package_);
			getElement().getPackageImports().add(packageImport);

			assertEquals(1, NamespaceOperations.getImportedPackages(
				getElement()).size());
			assertTrue(NamespaceOperations.getImportedPackages(getElement())
				.contains(package_));
		}
	}

	/**
	 * Tests the '
	 * {@link org.eclipse.uml2.internal.operation.NamespaceOperations#importPackage() <em>Import Package</em>}'
	 * method.
	 * 
	 * @see org.eclipse.uml2.internal.operation.NamespaceOperations#importPackage()
	 */
	public void testImportPackage() {

		try {
			NamespaceOperations.importPackage(null, null, null);
			fail();
		} catch (IllegalArgumentException iae) {
			// pass
		}

		org.eclipse.uml2.Package package_ = UML2Factory.eINSTANCE
			.createPackage();

		for (Iterator eAllSubClasses = getEAllSubClasses(
			UML2Package.eINSTANCE.getNamespace()).iterator(); eAllSubClasses
			.hasNext();) {

			setElement((Namespace) UML2Factory.eINSTANCE
				.create((EClass) eAllSubClasses.next()));

			try {
				NamespaceOperations.importPackage(getElement(), null, null);
				fail();
			} catch (IllegalArgumentException iae) {
				// pass
			}

			try {
				NamespaceOperations.importPackage(getElement(),
					VisibilityKind.PUBLIC_LITERAL, null);
				fail();
			} catch (IllegalArgumentException iae) {
				// pass
			}

			try {
				NamespaceOperations.importPackage(getElement(),
					VisibilityKind.PUBLIC_LITERAL, package_);
			} catch (IllegalArgumentException iae) {
				fail();
			}

			assertEquals(1, getElement().getPackageImports().size());
			assertSame(package_, ((PackageImport) getElement()
				.getPackageImports().get(0)).getImportedPackage());
			assertSame(VisibilityKind.PUBLIC_LITERAL,
				((PackageImport) getElement().getPackageImports().get(0))
					.getVisibility());

			try {
				NamespaceOperations.importPackage(getElement(),
					VisibilityKind.PUBLIC_LITERAL, package_);
				fail();
			} catch (IllegalArgumentException iae) {
				// pass
			}
		}
	}

}