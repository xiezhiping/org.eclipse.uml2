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
 * $Id: ClassImplTest.java,v 1.4 2005/03/15 18:51:30 khussey Exp $
 */
package org.eclipse.uml2.impl.tests;

import java.util.Iterator;

import junit.textui.TestRunner;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.uml2.Property;
import org.eclipse.uml2.UML2Factory;
import org.eclipse.uml2.UML2Package;
import org.eclipse.uml2.impl.ClassImpl;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Class</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are tested:
 * <ul>
 *   <li>{@link org.eclipse.uml2.impl.ClassImpl#getOwnedAttributes() <em>Owned Attribute</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.ClassImpl#getParts() <em>Part</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.ClassImpl#getRoles() <em>Role</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.ClassImpl#getSuperClasses() <em>Super Class</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.ClassImpl#getExtensions() <em>Extension</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.ClassImpl#isActive() <em>Is Active</em>}</li>
 * </ul>
 * </p>
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link org.eclipse.uml2.impl.ClassImpl#getAttributes() <em>Get Attributes</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.ClassImpl#getOwnedMembers() <em>Get Owned Members</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.ClassImpl#getMembers() <em>Get Members</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.ClassImpl#getFeatures() <em>Get Features</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.ClassImpl#getFeatures() <em>Get Features</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.ClassImpl#getOwnedMembers() <em>Get Owned Members</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.ClassImpl#inherit(Set) <em>Inherit</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.ClassImpl#isAbstract() <em>Is Abstract</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.ClassImpl#setIsAbstract(Boolean) <em>Set Is Abstract</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.ClassImpl#getOwnedAttributes() <em>Get Owned Attributes</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.ClassImpl#getGenerals() <em>Get Generals</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.ClassImpl#getAttributes() <em>Get Attributes</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.ClassImpl#getOwnedMembers() <em>Get Owned Members</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.ClassImpl#getFeatures() <em>Get Features</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class ClassImplTest extends BehavioredClassifierImplTest {

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
		TestRunner.run(ClassImplTest.class);
	}

	/**
	 * Constructs a new Class test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassImplTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Class test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private ClassImpl getFixture() {
		return (ClassImpl) fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	protected void setUp() throws Exception {
		setFixture((ClassImpl) UML2Factory.eINSTANCE.createClass());
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
	 * Tests the '{@link org.eclipse.uml2.impl.ClassImpl#getParts() <em>Part</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.ClassImpl#getParts()
	 * @generated
	 */
	public void testGetParts() {
		// TODO: implement this feature getter test method
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.impl.ClassImpl#getRoles() <em>Role</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.ClassImpl#getRoles()
	 * @generated
	 */
	public void testGetRoles() {
		// TODO: implement this feature getter test method
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.impl.ClassImpl#getSuperClasses() <em>Super Class</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.ClassImpl#getSuperClasses()
	 * @generated
	 */
	public void testGetSuperClassesGen() {
		// TODO: implement this feature getter test method
	}

	public void testGetSuperClasses() {
		testGetSuperClassesGen();
		
		setUpParents();
		
		assertTrue(getFixture().getSuperClasses().containsAll(getFixture().parents()));
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.impl.ClassImpl#getExtensions() <em>Extension</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.ClassImpl#getExtensions()
	 * @generated
	 */
	public void testGetExtensions() {
		// TODO: implement this feature getter test method
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.impl.ClassImpl#isActive() <em>Is Active</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.ClassImpl#isActive()
	 * @generated
	 */
	public void testIsActive() {
		// TODO: implement this feature getter test method
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.impl.ClassImpl#setIsActive() <em>Is Active</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.ClassImpl#setIsActive()
	 * @generated
	 */
	public void testSetIsActive() {
		// TODO: implement this feature setter test method
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.impl.ClassImpl#getMembers() <em>Get Members</em>}' getter operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.ClassImpl#getMembers()
	 * @generated
	 */
	public void testGetMembers() {
		// TODO: implement this getter operation test method
	}

	public void testGetOwnedElements() {
		testGetOwnedElementsGen();
		
		super.testGetOwnedElements();

		assertTrue(getFixture().getOwnedElements().containsAll(getFixture().getImplementations()));
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.impl.ClassImpl#inherit(Set) <em>Inherit</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.ClassImpl#inherit(Set)
	 * @generated
	 */
	public void testInherit__Set() {
		// TODO: implement this operation test method
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.impl.ClassImpl#isAbstract() <em>Is Abstract</em>}' getter operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.ClassImpl#isAbstract()
	 * @generated
	 */
	public void testIsAbstractGen() {
		// TODO: implement this getter operation test method
	}

	public void testIsAbstract() {
		testIsAbstractGen();
		
		getFixture().setIsAbstract(false);

		assertEquals(false, getFixture().isAbstract());

		getFixture().setIsAbstract(true);

		assertEquals(true, getFixture().isAbstract());
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.impl.ClassImpl#setIsAbstract(Boolean) <em>Set Is Abstract</em>}' setter operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.ClassImpl#setIsAbstract(Boolean)
	 * @generated
	 */
	public void testSetIsAbstract__BooleanGen() {
		// TODO: implement this setter operation test method
	}

	public void testSetIsAbstract__Boolean() {
		testSetIsAbstract__BooleanGen();
		
		getFixture().setIsAbstract(false);

		assertFalse(getFixture().isAbstract());

		getFixture().setIsAbstract(true);

		assertTrue(getFixture().isAbstract());
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.impl.ClassImpl#getOwnedAttributes() <em>Get Owned Attributes</em>}' getter operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.ClassImpl#getOwnedAttributes()
	 * @generated
	 */
	public void testGetOwnedAttributesGen() {
		// TODO: implement this getter operation test method
	}

	public void testGetOwnedAttributes() {
		testGetOwnedAttributesGen();

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
	 * Tests the '{@link org.eclipse.uml2.impl.ClassImpl#getGenerals() <em>Get Generals</em>}' getter operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.ClassImpl#getGenerals()
	 * @generated
	 */
	public void testGetGeneralsGen() {
		// TODO: implement this getter operation test method
	}

	public void testGetGenerals() {
		testGetGeneralsGen();
		
		setUpParents();

		assertTrue(getFixture().getGenerals().containsAll(getFixture().getSuperClasses()));
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.impl.ClassImpl#getAttributes() <em>Get Attributes</em>}' getter operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.ClassImpl#getAttributes()
	 * @generated
	 */
	public void testGetAttributesGen() {
		// TODO: implement this getter operation test method
	}

	public void testGetAttributes() {
		testGetAttributesGen();
		
		super.testGetAttributes();
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.impl.ClassImpl#getOwnedMembers() <em>Get Owned Members</em>}' getter operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.ClassImpl#getOwnedMembers()
	 * @generated
	 */
	public void testGetOwnedMembersGen() {
		// TODO: implement this getter operation test method
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
	 * Tests the '{@link org.eclipse.uml2.impl.ClassImpl#getFeatures() <em>Get Features</em>}' getter operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.ClassImpl#getFeatures()
	 * @generated
	 */
	public void testGetFeaturesGen() {
		// TODO: implement this getter operation test method
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
