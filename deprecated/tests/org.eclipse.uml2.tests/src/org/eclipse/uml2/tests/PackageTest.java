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
 * $Id: PackageTest.java,v 1.4 2006/05/29 17:27:34 khussey Exp $
 */
package org.eclipse.uml2.tests;

import java.util.Arrays;
import java.util.Iterator;

import junit.textui.TestRunner;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.uml2.Actor;
import org.eclipse.uml2.ElementImport;
import org.eclipse.uml2.NamedElement;
import org.eclipse.uml2.Package;
import org.eclipse.uml2.PackageImport;
import org.eclipse.uml2.PackageableElement;
import org.eclipse.uml2.UML2Factory;
import org.eclipse.uml2.UML2Package;
import org.eclipse.uml2.VisibilityKind;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Package</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are tested:
 * <ul>
 *   <li>{@link org.eclipse.uml2.PackageableElement#getPackageableElement_visibility() <em>Packageable Element visibility</em>}</li>
 *   <li>{@link org.eclipse.uml2.Package#getNestedPackages() <em>Nested Package</em>}</li>
 *   <li>{@link org.eclipse.uml2.Package#getNestingPackage() <em>Nesting Package</em>}</li>
 *   <li>{@link org.eclipse.uml2.Package#getOwnedTypes() <em>Owned Type</em>}</li>
 * </ul>
 * </p>
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link org.eclipse.uml2.Package#validateElementsPublicOrPrivate(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Elements Public Or Private</em>}</li>
 *   <li>{@link org.eclipse.uml2.Package#visibleMembers() <em>Visible Members</em>}</li>
 *   <li>{@link org.eclipse.uml2.Package#makesVisible(org.eclipse.uml2.NamedElement) <em>Makes Visible</em>}</li>
 *   <li>{@link org.eclipse.uml2.Package#mustBeOwned() <em>Must Be Owned</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class PackageTest extends NamespaceTest {

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
		TestRunner.run(PackageTest.class);
	}

	/**
	 * Constructs a new Package test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PackageTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Package test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private org.eclipse.uml2.Package getFixture() {
		return (org.eclipse.uml2.Package)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	protected void setUp() throws Exception {
		setFixture(UML2Factory.eINSTANCE.createPackage());
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
	 * Tests the '{@link org.eclipse.uml2.PackageableElement#getPackageableElement_visibility() <em>Packageable Element visibility</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.PackageableElement#getPackageableElement_visibility()
	 * @generated
	 */
	public void testGetPackageableElement_visibility() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.PackageableElement#setPackageableElement_visibility(org.eclipse.uml2.VisibilityKind) <em>Packageable Element visibility</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.PackageableElement#setPackageableElement_visibility(org.eclipse.uml2.VisibilityKind)
	 * @generated
	 */
	public void testSetPackageableElement_visibility() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.Package#getNestedPackages() <em>Nested Package</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.Package#getNestedPackages()
	 * @generated
	 */
	public void testGetNestedPackages() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.Package#getNestingPackage() <em>Nesting Package</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.Package#getNestingPackage()
	 * @generated
	 */
	public void testGetNestingPackage() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.Package#getOwnedTypes() <em>Owned Type</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.Package#getOwnedTypes()
	 * @generated
	 */
	public void testGetOwnedTypesGen() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	public void testGetOwnedTypes() {
		testGetOwnedTypesGen();
		
		Actor ownedActor = UML2Factory.eINSTANCE.createActor();
		getFixture().getOwnedMembers().add(ownedActor);

		Package ownedPackage = UML2Factory.eINSTANCE.createPackage();
		getFixture().getOwnedMembers().add(ownedPackage);

		assertTrue(getFixture().getOwnedTypes().contains(ownedActor));
		assertFalse(getFixture().getOwnedTypes().contains(ownedPackage));
	}

	public void testGetOwner() {
		super.testGetOwner();

		assertSame(getFixture().getOwningParameter(), getFixture().getOwner());
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.NamedElement#getVisibility() <em>Visibility</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.NamedElement#getVisibility()
	 * @generated
	 */
	public void testGetVisibilityGen() {
		// TODO: implement this redefined feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	public void testGetVisibility() {
		testGetVisibilityGen();
		
		getFixture().setPackageableElement_visibility(VisibilityKind.PACKAGE_LITERAL);

		assertSame(getFixture().getPackageableElement_visibility(), getFixture().getVisibility());
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.NamedElement#setVisibility(org.eclipse.uml2.VisibilityKind) <em>Visibility</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.NamedElement#setVisibility(org.eclipse.uml2.VisibilityKind)
	 * @generated
	 */
	public void testSetVisibilityGen() {
		// TODO: implement this redefined feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}
	public void testSetVisibility() {
		testSetVisibilityGen();
		
		getFixture().setVisibility(VisibilityKind.PACKAGE_LITERAL);

		assertSame(getFixture().getVisibility(), getFixture().getPackageableElement_visibility());
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.Package#validateElementsPublicOrPrivate(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Elements Public Or Private</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.Package#validateElementsPublicOrPrivate(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	public void testValidateElementsPublicOrPrivate__DiagnosticChain_Map() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.Package#mustBeOwned() <em>Must Be Owned</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.Package#mustBeOwned()
	 * @generated
	 */
	public void testMustBeOwnedGen() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}



	public void testMustBeOwned() {
		testMustBeOwnedGen();
		
		assertFalse(getFixture().mustBeOwned());
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.Package#visibleMembers() <em>Visible Members</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.Package#visibleMembers()
	 * @generated
	 */
	public void testVisibleMembersGen() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	public void testVisibleMembers() {
		testVisibleMembersGen();
		
		Actor[] ownedActors = new Actor[VisibilityKind.VALUES.size() + 1];
		for (int index = 0; index < VisibilityKind.VALUES.size(); index++) {
			ownedActors[index] = UML2Factory.eINSTANCE.createActor();
			ownedActors[index].setPackageableElement_visibility((VisibilityKind) VisibilityKind.VALUES.get(index));
		}
		ownedActors[VisibilityKind.VALUES.size()] = UML2Factory.eINSTANCE.createActor();
		ownedActors[VisibilityKind.VALUES.size()].setPackageableElement_visibility(null);
		getFixture().getOwnedMembers().addAll(Arrays.asList(ownedActors));

		Package importedPackage = UML2Factory.eINSTANCE.createPackage();

		Actor[] actors = new Actor[VisibilityKind.VALUES.size() + 1];
		for (int index = 0; index < VisibilityKind.VALUES.size(); index++) {
			actors[index] = UML2Factory.eINSTANCE.createActor();
			actors[index].setPackageableElement_visibility((VisibilityKind) VisibilityKind.VALUES.get(index));
		}
		actors[VisibilityKind.VALUES.size()] = UML2Factory.eINSTANCE.createActor();
		actors[VisibilityKind.VALUES.size()].setPackageableElement_visibility(null);
		importedPackage.getOwnedMembers().addAll(Arrays.asList(actors));

		PackageImport packageImport = UML2Factory.eINSTANCE.createPackageImport();
		packageImport.setImportedPackage(importedPackage);
		getFixture().getPackageImports().add(packageImport);

		Actor[] importedActors = new Actor[2];
		importedActors[0] = UML2Factory.eINSTANCE.createActor();
		importedActors[0].setPackageableElement_visibility(VisibilityKind.PUBLIC_LITERAL);
		importedActors[1] = UML2Factory.eINSTANCE.createActor();
		importedActors[1].setPackageableElement_visibility(null);

		for (int index = 0; index < 2; index++) {
			ElementImport elementImport = UML2Factory.eINSTANCE.createElementImport();
			elementImport.setImportedElement(importedActors[index]);

			getFixture().getElementImports().add(elementImport);
		}

		for (int index = 0; index < VisibilityKind.VALUES.size(); index++) {
			assertEquals(VisibilityKind.PUBLIC == index, getFixture().visibleMembers().contains(ownedActors[index]));
			assertEquals(VisibilityKind.PUBLIC == index, getFixture().visibleMembers().contains(actors[index]));
		}

		assertTrue(getFixture().visibleMembers().contains(ownedActors[VisibilityKind.VALUES.size()]));
		assertTrue(getFixture().visibleMembers().contains(actors[VisibilityKind.VALUES.size()]));

		assertTrue(getFixture().visibleMembers().contains(importedActors[0]));
		assertTrue(getFixture().visibleMembers().contains(importedActors[1]));
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.Package#makesVisible(org.eclipse.uml2.NamedElement) <em>Makes Visible</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.Package#makesVisible(org.eclipse.uml2.NamedElement)
	 * @generated
	 */
	public void testMakesVisible__NamedElementGen() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	public void testMakesVisible__NamedElement() {
		testMakesVisible__NamedElementGen();
		
		Actor[] ownedActors = new Actor[VisibilityKind.VALUES.size() + 1];

		for (int index = 0; index < VisibilityKind.VALUES.size(); index++) {
			ownedActors[index] = UML2Factory.eINSTANCE.createActor();
			ownedActors[index].setPackageableElement_visibility((VisibilityKind) VisibilityKind.VALUES.get(index));
		}

		ownedActors[VisibilityKind.VALUES.size()] = UML2Factory.eINSTANCE.createActor();
		ownedActors[VisibilityKind.VALUES.size()].setPackageableElement_visibility(null);
		getFixture().getOwnedMembers().addAll(Arrays.asList(ownedActors));

		Package importedPackage = UML2Factory.eINSTANCE.createPackage();

		Actor[] actors = new Actor[VisibilityKind.VALUES.size() + 1];

		for (int index = 0; index < VisibilityKind.VALUES.size(); index++) {
			actors[index] = UML2Factory.eINSTANCE.createActor();
			actors[index].setPackageableElement_visibility((VisibilityKind) VisibilityKind.VALUES.get(index));
		}

		actors[VisibilityKind.VALUES.size()] = UML2Factory.eINSTANCE.createActor();
		actors[VisibilityKind.VALUES.size()].setPackageableElement_visibility(null);
		importedPackage.getOwnedMembers().addAll(Arrays.asList(actors));

		PackageImport packageImport = UML2Factory.eINSTANCE.createPackageImport();
		packageImport.setImportedPackage(importedPackage);
		getFixture().getPackageImports().add(packageImport);

		Actor[] importedActors = new Actor[2];
		importedActors[0] = UML2Factory.eINSTANCE.createActor();
		importedActors[0].setPackageableElement_visibility(VisibilityKind.PUBLIC_LITERAL);
		importedActors[1] = UML2Factory.eINSTANCE.createActor();
		importedActors[1].setPackageableElement_visibility(null);

		for (int index = 0; index < 2; index++) {
			ElementImport elementImport = UML2Factory.eINSTANCE.createElementImport();
			elementImport.setImportedElement(importedActors[index]);

			getFixture().getElementImports().add(elementImport);
		}

		assertFalse(getFixture().makesVisible(UML2Factory.eINSTANCE.createActor()));

		for (int index = 0; index < VisibilityKind.VALUES.size(); index++) {
			assertEquals(VisibilityKind.PUBLIC == index, getFixture().makesVisible(ownedActors[index]));

			try {
				assertEquals(VisibilityKind.PUBLIC == index, getFixture().makesVisible(actors[index]));
			} catch (IllegalArgumentException iae) {
				assertTrue(VisibilityKind.PUBLIC != index);
			}
		}

		assertTrue(getFixture().makesVisible(ownedActors[VisibilityKind.VALUES.size()]));
		assertTrue(getFixture().makesVisible(actors[VisibilityKind.VALUES.size()]));

		assertTrue(getFixture().makesVisible(importedActors[0]));
		assertTrue(getFixture().makesVisible(importedActors[1]));
	}

	public void testGetNamespace() {
		super.testGetNamespace();

		assertSame(getFixture().getNestingPackage(), getFixture().getNamespace());
	}

	public void testGetOwnedElements() {
		super.testGetOwnedElements();

		assertTrue(getFixture().getOwnedElements().containsAll(getFixture().getPackageExtensions()));
		assertTrue(getFixture().getOwnedElements().containsAll(getFixture().getPackageMerges()));
	}

	/* (non-Javadoc)
	 * @see org.eclipse.uml2.impl.tests.NamedElementImplTest#setUpNamespace()
	 */
	protected void setUpNamespace() {
		UML2Factory.eINSTANCE.createPackage().getOwnedMembers().add(getFixture());
	}

	/* (non-Javadoc)
	 * @see org.eclipse.uml2.impl.tests.ElementImplTest#setUpOwnedElements()
	 */
	protected void setUpOwnedElements() {
		super.setUpOwnedElements();

		getFixture().getPackageExtensions().add(UML2Factory.eINSTANCE.createPackageMerge());
		getFixture().getPackageExtensions().add(UML2Factory.eINSTANCE.createPackageMerge());

		getFixture().getPackageMerges().add(UML2Factory.eINSTANCE.createPackageMerge());
		getFixture().getPackageMerges().add(UML2Factory.eINSTANCE.createPackageMerge());
	}

	/* (non-Javadoc)
	 * @see org.eclipse.uml2.impl.tests.ElementImplTest#setUpOwner()
	 */
	protected void setUpOwner() {
		UML2Factory.eINSTANCE.createTemplateParameter().setOwnedParameteredElement(getFixture());
	}

	/* (non-Javadoc)
	 * @see org.eclipse.uml2.impl.tests.NamespaceImplTest#testGetOwnedMembers()
	 */
	public void testGetOwnedMembers() {

		for (Iterator eAllSubClasses = getEAllSubClasses(UML2Package.eINSTANCE.getNamedElement()).iterator(); eAllSubClasses.hasNext();) {
			NamedElement namedElement = (NamedElement) UML2Factory.eINSTANCE.create((EClass) eAllSubClasses.next());

			try {
				getFixture().getOwnedMembers().add(namedElement);

				assertTrue(getFixture().getOwnedMembers().contains(namedElement));
			} catch (Exception e) {
				assertFalse(PackageableElement.class.isInstance(namedElement));
			}
		}
	}

} //PackageImplTest
