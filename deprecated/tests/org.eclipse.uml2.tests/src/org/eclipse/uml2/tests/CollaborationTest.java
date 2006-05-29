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
 * $Id: CollaborationTest.java,v 1.3 2006/05/29 17:27:34 khussey Exp $
 */
package org.eclipse.uml2.tests;

import junit.textui.TestRunner;

import org.eclipse.uml2.Collaboration;
import org.eclipse.uml2.AggregationKind;
import org.eclipse.uml2.Property;
import org.eclipse.uml2.UML2Factory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Collaboration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are tested:
 * <ul>
 *   <li>{@link org.eclipse.uml2.StructuredClassifier#getParts() <em>Part</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class CollaborationTest extends BehavioredClassifierTest {

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
		TestRunner.run(CollaborationTest.class);
	}

	/**
	 * Constructs a new Collaboration test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CollaborationTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Collaboration test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private Collaboration getFixture() {
		return (Collaboration)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	protected void setUp() throws Exception {
		setFixture(UML2Factory.eINSTANCE.createCollaboration());
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
	public void testGetPartsGen() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}


	public void testGetParts() {
		testGetPartsGen();
		
		Property property0 = UML2Factory.eINSTANCE.createProperty();
		property0.setAggregation(AggregationKind.COMPOSITE_LITERAL);

		getFixture().getOwnedAttributes().add(property0);

		assertEquals(1, getFixture().getParts().size());
		assertTrue(getFixture().getParts().contains(property0));

		Property property1 = UML2Factory.eINSTANCE.createProperty();
		property1.setAggregation(AggregationKind.NONE_LITERAL);

		getFixture().getOwnedAttributes().add(property1);

		assertEquals(1, getFixture().getParts().size());
		assertFalse(getFixture().getParts().contains(property1));

		Property property2 = UML2Factory.eINSTANCE.createProperty();
		property2.setAggregation(AggregationKind.SHARED_LITERAL);

		getFixture().getOwnedAttributes().add(property2);

		assertEquals(1, getFixture().getParts().size());
		assertFalse(getFixture().getParts().contains(property2));
	}

	public void testGetAttributes() {
		super.testGetAttributes();

		assertTrue(getFixture().getAttributes().containsAll(getFixture().getOwnedAttributes()));
	}

	public void testGetOwnedMembers() {
		super.testGetOwnedMembers();

		assertTrue(getFixture().getOwnedMembers().containsAll(getFixture().getOwnedAttributes()));
		assertTrue(getFixture().getOwnedMembers().containsAll(getFixture().getOwnedConnectors()));
	}

	public void testGetMembers() {
		super.testGetMembers();

		assertTrue(getFixture().getMembers().containsAll(getFixture().getRoles()));
	}

	public void testGetFeatures() {
		super.testGetFeatures();

		assertTrue(getFixture().getFeatures().containsAll(getFixture().getOwnedConnectors()));
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
	 * @see org.eclipse.uml2.impl.tests.NamespaceImplTest#setUpMembers()
	 */
	protected void setUpMembers() {
		super.setUpMembers();

		getFixture().getCollaborationRoles().add(UML2Factory.eINSTANCE.createProperty());
		getFixture().getCollaborationRoles().add(UML2Factory.eINSTANCE.createProperty());
	}

	/* (non-Javadoc)
	 * @see org.eclipse.uml2.impl.tests.NamespaceImplTest#setUpOwnedMembers()
	 */
	protected void setUpOwnedMembers() {
		super.setUpOwnedMembers();

		getFixture().getOwnedAttributes().add(UML2Factory.eINSTANCE.createProperty());
		getFixture().getOwnedAttributes().add(UML2Factory.eINSTANCE.createProperty());

		getFixture().getOwnedConnectors().add(UML2Factory.eINSTANCE.createConnector());
		getFixture().getOwnedConnectors().add(UML2Factory.eINSTANCE.createConnector());
	}

	/* (non-Javadoc)
	 * @see org.eclipse.uml2.impl.tests.ClassifierImplTest#setUpAttributes()
	 */
	protected void setUpAttributes() {
		super.setUpAttributes();

		getFixture().getOwnedAttributes().add(UML2Factory.eINSTANCE.createProperty());
		getFixture().getOwnedAttributes().add(UML2Factory.eINSTANCE.createProperty());
	}

	/* (non-Javadoc)
	 * @see org.eclipse.uml2.impl.tests.ClassifierImplTest#setUpFeatures()
	 */
	protected void setUpFeatures() {
		super.setUpFeatures();

		getFixture().getOwnedConnectors().add(UML2Factory.eINSTANCE.createConnector());
		getFixture().getOwnedConnectors().add(UML2Factory.eINSTANCE.createConnector());
	}

} //CollaborationImplTest
