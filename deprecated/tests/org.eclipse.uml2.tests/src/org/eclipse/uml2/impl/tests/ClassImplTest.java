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
 * $Id: ClassImplTest.java,v 1.1 2004/04/29 14:56:47 khussey Exp $
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
 *   <li>{@link org.eclipse.uml2.impl.ClassImpl#getOwnedBehaviors() <em>Owned Behavior</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.ClassImpl#getClassifierBehavior() <em>Classifier Behavior</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.ClassImpl#getImplementations() <em>Implementation</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.ClassImpl#getOwnedStateMachines() <em>Owned State Machine</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.ClassImpl#getSuperClasses() <em>Super Class</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.ClassImpl#getExtensions() <em>Extension</em>}</li>
 * </ul>
 * </p>
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link org.eclipse.uml2.impl.ClassImpl#getOwnedMembers() <em>Get Owned Members</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.ClassImpl#getOwnedElements() <em>Get Owned Elements</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.ClassImpl#getClientDependencies() <em>Get Client Dependencies</em>}</li>
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
public class ClassImplTest extends EncapsulatedClassifierImplTest {

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
	 * Tests the '{@link org.eclipse.uml2.impl.ClassImpl#getOwnedBehaviors() <em>Owned Behavior</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.ClassImpl#getOwnedBehaviors()
	 * @generated
	 */
	public void testGetOwnedBehaviors() {
		// TODO: implement this feature getter test method
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.impl.ClassImpl#getClassifierBehavior() <em>Classifier Behavior</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.ClassImpl#getClassifierBehavior()
	 * @generated
	 */
	public void testGetClassifierBehavior() {
		// TODO: implement this feature getter test method
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.impl.ClassImpl#setClassifierBehavior() <em>Classifier Behavior</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.ClassImpl#setClassifierBehavior()
	 * @generated
	 */
	public void testSetClassifierBehavior() {
		// TODO: implement this feature setter test method
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.impl.ClassImpl#getImplementations() <em>Implementation</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.ClassImpl#getImplementations()
	 * @generated
	 */
	public void testGetImplementations() {
		// TODO: implement this feature getter test method
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.impl.ClassImpl#getOwnedStateMachines() <em>Owned State Machine</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.ClassImpl#getOwnedStateMachines()
	 * @generated
	 */
	public void testGetOwnedStateMachines() {
		// TODO: implement this feature getter test method
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.impl.ClassImpl#getSuperClasses() <em>Super Class</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.ClassImpl#getSuperClasses()
	 * @generated NOT
	 */
	public void testGetSuperClasses() {
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
	 * Tests the '{@link org.eclipse.uml2.impl.ClassImpl#getOwnedElements() <em>Get Owned Elements</em>}' getter operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.ClassImpl#getOwnedElements()
	 * @generated NOT
	 */
	public void testGetOwnedElements() {
		super.testGetOwnedElements();

		assertTrue(getFixture().getOwnedElements().containsAll(getFixture().getImplementations()));
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.impl.ClassImpl#getClientDependencies() <em>Get Client Dependencies</em>}' getter operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.ClassImpl#getClientDependencies()
	 * @generated
	 */
	public void testGetClientDependencies() {
		// TODO: implement this getter operation test method
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
	 * @generated NOT
	 */
	public void testIsAbstract() {
		getFixture().setIsAbstract(false);

		assertEquals(false, getFixture().isAbstract());

		getFixture().setIsAbstract(true);

		assertEquals(true, getFixture().isAbstract());
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.impl.ClassImpl#setIsAbstract(Boolean) <em>Set Is Abstract</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.ClassImpl#setIsAbstract(Boolean)
	 * @generated NOT
	 */
	public void testSetIsAbstract__Boolean() {
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
	 * @generated NOT
	 */
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
	 * Tests the '{@link org.eclipse.uml2.impl.ClassImpl#getGenerals() <em>Get Generals</em>}' getter operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.ClassImpl#getGenerals()
	 * @generated NOT
	 */
	public void testGetGenerals() {
		setUpParents();

		assertTrue(getFixture().getGenerals().containsAll(getFixture().getSuperClasses()));
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.impl.ClassImpl#getAttributes() <em>Get Attributes</em>}' getter operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.ClassImpl#getAttributes()
	 * @generated NOT
	 */
	public void testGetAttributes() {
		super.testGetAttributes();
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.impl.ClassImpl#getOwnedMembers() <em>Get Owned Members</em>}' getter operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.ClassImpl#getOwnedMembers()
	 * @generated NOT
	 */
	public void testGetOwnedMembers() {
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
	 * @generated NOT
	 */
	public void testGetFeatures() {
		super.testGetFeatures();

		assertTrue(getFixture().getFeatures().containsAll(getFixture().getOwnedOperations()));
		assertTrue(getFixture().getFeatures().containsAll(getFixture().getOwnedReceptions()));
	}

	/**
	 * @see org.eclipse.uml2.impl.tests.NamedElementImplTest#setUpNamespace()
	 */
	protected void setUpNamespace() {
		UML2Factory.eINSTANCE.createPackage().getOwnedMembers().add(getFixture());
	}

	/**
	 * @see org.eclipse.uml2.impl.tests.ElementImplTest#setUpOwner()
	 */
	protected void setUpOwner() {
		UML2Factory.eINSTANCE.createTemplateParameter().setOwnedParameteredElement(getFixture());
	}

	/**
	 * @see org.eclipse.uml2.impl.tests.ElementImplTest#setUpOwnedElements()
	 */
	protected void setUpOwnedElements() {
		super.setUpOwnedElements();

		getFixture().getImplementations().add(UML2Factory.eINSTANCE.createImplementation());
		getFixture().getImplementations().add(UML2Factory.eINSTANCE.createImplementation());
	}

	/**
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

	/**
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
