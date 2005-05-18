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
 * $Id: ClassTest.java,v 1.3 2005/05/18 17:04:28 khussey Exp $
 */
package org.eclipse.uml2.tests;

import java.util.Iterator;

import junit.textui.TestRunner;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.uml2.Property;
import org.eclipse.uml2.UML2Factory;
import org.eclipse.uml2.UML2Package;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Class</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are tested:
 * <ul>
 *   <li>{@link org.eclipse.uml2.StructuredClassifier#getParts() <em>Part</em>}</li>
 *   <li>{@link org.eclipse.uml2.Class#getSuperClasses() <em>Super Class</em>}</li>
 *   <li>{@link org.eclipse.uml2.Class#getExtensions() <em>Extension</em>}</li>
 * </ul>
 * </p>
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link org.eclipse.uml2.Class#inherit(java.util.Set) <em>Inherit</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class ClassTest extends BehavioredClassifierTest {

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
		TestRunner.run(ClassTest.class);
	}

	/**
	 * Constructs a new Class test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Class test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private org.eclipse.uml2.Class getFixture() {
		return (org.eclipse.uml2.Class)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	protected void setUp() throws Exception {
		setFixture(UML2Factory.eINSTANCE.createClass());
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
	 * Tests the '{@link org.eclipse.uml2.StructuredClassifier#getParts() <em>Part</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.StructuredClassifier#getParts()
	 * @generated
	 */
	public void testGetParts() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.StructuredClassifier#getRoles() <em>Role</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.StructuredClassifier#getRoles()
	 * @generated
	 */
	public void testGetRoles() {
		// TODO: implement this union feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.Class#getSuperClasses() <em>Super Class</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.Class#getSuperClasses()
	 * @generated
	 */
	public void testGetSuperClassesGen() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	public void testGetSuperClasses() {
		testGetSuperClassesGen();
		
		setUpParents();
		
		assertTrue(getFixture().getSuperClasses().containsAll(getFixture().parents()));
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.Class#getExtensions() <em>Extension</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.Class#getExtensions()
	 * @generated
	 */
	public void testGetExtensions() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.Namespace#getMembers() <em>Member</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.Namespace#getMembers()
	 * @generated
	 */
	public void testGetMembers() {
		// TODO: implement this union feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	public void testGetOwnedElements() {
		testGetOwnedElementsGen();
		
		super.testGetOwnedElements();

		assertTrue(getFixture().getOwnedElements().containsAll(getFixture().getImplementations()));
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.Class#inherit(java.util.Set) <em>Inherit</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.Class#inherit(java.util.Set)
	 * @generated
	 */
	public void testInherit__Set() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}



	public void testGetOwnedAttributes() {

		for (Iterator eAllSubClasses = getEAllSubClasses(UML2Package.eINSTANCE.getProperty()).iterator(); eAllSubClasses.hasNext();) {
			Property property = (Property) UML2Factory.eINSTANCE.create((EClass) eAllSubClasses.next());

			getFixture().getOwnedAttributes().add(property);

			assertTrue(getFixture().getOwnedAttributes().contains(property));
			assertSame(getFixture(), property.getClass_());

			getFixture().getOwnedAttributes().remove(property);

			assertFalse(getFixture().getOwnedAttributes().contains(property));
			assertNotSame(getFixture(), property.getClass_());
		}
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.Classifier#getGenerals() <em>General</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.Classifier#getGenerals()
	 * @generated
	 */
	public void testGetGeneralsGen() {
		// TODO: implement this redefined feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}
	public void testGetGenerals() {
		testGetGeneralsGen();
		
		setUpParents();

		assertTrue(getFixture().getGenerals().containsAll(getFixture().getSuperClasses()));
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.Classifier#getAttributes() <em>Attribute</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.Classifier#getAttributes()
	 * @generated
	 */
	public void testGetAttributesGen() {
		// TODO: implement this union feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	public void testGetAttributes() {
		testGetAttributesGen();
		
		super.testGetAttributes();
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

		assertTrue(getFixture().getOwnedMembers().containsAll(getFixture().getNestedClassifiers()));
		assertTrue(getFixture().getOwnedMembers().containsAll(getFixture().getOwnedAttributes()));
		assertTrue(getFixture().getOwnedMembers().containsAll(getFixture().getOwnedOperations()));
		assertTrue(getFixture().getOwnedMembers().containsAll(getFixture().getOwnedReceptions()));
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.Classifier#getFeatures() <em>Feature</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.Classifier#getFeatures()
	 * @generated
	 */
	public void testGetFeaturesGen() {
		// TODO: implement this union feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	public void testGetFeatures() {
		testGetFeaturesGen();
		
		super.testGetFeatures();

		assertTrue(getFixture().getFeatures().containsAll(getFixture().getOwnedOperations()));
		assertTrue(getFixture().getFeatures().containsAll(getFixture().getOwnedReceptions()));
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
	 * @see org.eclipse.uml2.impl.tests.ElementImplTest#setUpOwnedElements()
	 */
	protected void setUpOwnedElements() {
		super.setUpOwnedElements();

		getFixture().getImplementations().add(UML2Factory.eINSTANCE.createImplementation());
		getFixture().getImplementations().add(UML2Factory.eINSTANCE.createImplementation());
	}

	/* (non-Javadoc)
	 * @see org.eclipse.uml2.impl.tests.NamespaceImplTest#setUpOwnedMembers()
	 */
	protected void setUpOwnedMembers() {
		super.setUpOwnedMembers();

		getFixture().getNestedClassifiers().add(UML2Factory.eINSTANCE.createClass());
		getFixture().getNestedClassifiers().add(UML2Factory.eINSTANCE.createClass());

		getFixture().getOwnedAttributes().add(UML2Factory.eINSTANCE.createProperty());
		getFixture().getOwnedAttributes().add(UML2Factory.eINSTANCE.createProperty());

		getFixture().getOwnedOperations().add(UML2Factory.eINSTANCE.createOperation());
		getFixture().getOwnedOperations().add(UML2Factory.eINSTANCE.createOperation());

		getFixture().getOwnedReceptions().add(UML2Factory.eINSTANCE.createReception());
		getFixture().getOwnedReceptions().add(UML2Factory.eINSTANCE.createReception());
	}

	/* (non-Javadoc)
	 * @see org.eclipse.uml2.impl.tests.ClassifierImplTest#setUpFeatures()
	 */
	protected void setUpFeatures() {
		super.setUpFeatures();

		getFixture().getOwnedOperations().add(UML2Factory.eINSTANCE.createOperation());
		getFixture().getOwnedOperations().add(UML2Factory.eINSTANCE.createOperation());

		getFixture().getOwnedReceptions().add(UML2Factory.eINSTANCE.createReception());
		getFixture().getOwnedReceptions().add(UML2Factory.eINSTANCE.createReception());
	}

} //ClassImplTest
