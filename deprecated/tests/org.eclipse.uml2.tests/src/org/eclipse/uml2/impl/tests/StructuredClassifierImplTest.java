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
 * $Id: StructuredClassifierImplTest.java,v 1.3 2005/03/15 18:51:30 khussey Exp $
 */
package org.eclipse.uml2.impl.tests;

import org.eclipse.uml2.AggregationKind;
import org.eclipse.uml2.Property;
import org.eclipse.uml2.UML2Factory;
import org.eclipse.uml2.impl.StructuredClassifierImpl;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Structured Classifier</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are tested:
 * <ul>
 *   <li>{@link org.eclipse.uml2.impl.StructuredClassifierImpl#getOwnedAttributes() <em>Owned Attribute</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.StructuredClassifierImpl#getParts() <em>Part</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.StructuredClassifierImpl#getRoles() <em>Role</em>}</li>
 * </ul>
 * </p>
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link org.eclipse.uml2.impl.StructuredClassifierImpl#getAttributes() <em>Get Attributes</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.StructuredClassifierImpl#getOwnedMembers() <em>Get Owned Members</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.StructuredClassifierImpl#getMembers() <em>Get Members</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.StructuredClassifierImpl#getFeatures() <em>Get Features</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public abstract class StructuredClassifierImplTest extends ClassifierImplTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2003, 2004 IBM Corporation and others."; //$NON-NLS-1$

	/**
	 * Constructs a new Structured Classifier test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructuredClassifierImplTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Structured Classifier test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private StructuredClassifierImpl getFixture() {
		return (StructuredClassifierImpl) fixture;
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.impl.StructuredClassifierImpl#getOwnedAttributes() <em>Owned Attribute</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.StructuredClassifierImpl#getOwnedAttributes()
	 * @generated
	 */
	public void testGetOwnedAttributes() {
		// TODO: implement this feature getter test method
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.impl.StructuredClassifierImpl#getParts() <em>Part</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.StructuredClassifierImpl#getParts()
	 * @generated
	 */
	public void testGetPartsGen() {
		// TODO: implement this feature getter test method
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

	/**
	 * Tests the '{@link org.eclipse.uml2.impl.StructuredClassifierImpl#getRoles() <em>Role</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.StructuredClassifierImpl#getRoles()
	 * @generated
	 */
	public void testGetRolesGen() {
		// TODO: implement this feature getter test method
	}

	public void testGetRoles() {
		testGetRolesGen();
		
		getFixture().getOwnedAttributes().add(UML2Factory.eINSTANCE.createProperty());
		getFixture().getOwnedAttributes().add(UML2Factory.eINSTANCE.createProperty());

		assertTrue(getFixture().getRoles().containsAll(getFixture().getOwnedAttributes()));
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.impl.StructuredClassifierImpl#getAttributes() <em>Get Attributes</em>}' getter operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.StructuredClassifierImpl#getAttributes()
	 * @generated
	 */
	public void testGetAttributesGen() {
		// TODO: implement this getter operation test method
	}

	public void testGetAttributes() {
		testGetAttributesGen();
		
		super.testGetAttributes();

		assertTrue(getFixture().getAttributes().containsAll(getFixture().getOwnedAttributes()));
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.impl.StructuredClassifierImpl#getOwnedMembers() <em>Get Owned Members</em>}' getter operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.StructuredClassifierImpl#getOwnedMembers()
	 * @generated
	 */
	public void testGetOwnedMembersGen() {
		// TODO: implement this getter operation test method
	}

	public void testGetOwnedMembers() {
		testGetOwnedMembersGen();
		
		super.testGetOwnedMembers();

		assertTrue(getFixture().getOwnedMembers().containsAll(getFixture().getOwnedAttributes()));
		assertTrue(getFixture().getOwnedMembers().containsAll(getFixture().getOwnedConnectors()));
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.impl.StructuredClassifierImpl#getMembers() <em>Get Members</em>}' getter operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.StructuredClassifierImpl#getMembers()
	 * @generated
	 */
	public void testGetMembersGen() {
		// TODO: implement this getter operation test method
	}

	public void testGetMembers() {
		testGetMembersGen();
		
		super.testGetMembers();

		assertTrue(getFixture().getMembers().containsAll(getFixture().getRoles()));
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.impl.StructuredClassifierImpl#getFeatures() <em>Get Features</em>}' getter operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.StructuredClassifierImpl#getFeatures()
	 * @generated
	 */
	public void testGetFeaturesGen() {
		// TODO: implement this getter operation test method
	}

	public void testGetFeatures() {
		testGetFeaturesGen();
		
		super.testGetFeatures();

		assertTrue(getFixture().getFeatures().containsAll(getFixture().getOwnedConnectors()));
	}

	/* (non-Javadoc)
	 * @see org.eclipse.uml2.impl.tests.NamespaceImplTest#setUpMembers()
	 */
	protected void setUpMembers() {
		super.setUpMembers();

		getFixture().getOwnedAttributes().add(UML2Factory.eINSTANCE.createProperty());
		getFixture().getOwnedAttributes().add(UML2Factory.eINSTANCE.createProperty());
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

} //StructuredClassifierImplTest
