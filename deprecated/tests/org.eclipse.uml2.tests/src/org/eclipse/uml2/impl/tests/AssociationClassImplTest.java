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
 * $Id: AssociationClassImplTest.java,v 1.1 2004/04/29 14:56:47 khussey Exp $
 */
package org.eclipse.uml2.impl.tests;

import java.util.Iterator;

import junit.textui.TestRunner;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.uml2.Property;
import org.eclipse.uml2.Type;
import org.eclipse.uml2.UML2Factory;
import org.eclipse.uml2.UML2Package;
import org.eclipse.uml2.impl.AssociationClassImpl;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Association Class</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are tested:
 * <ul>
 *   <li>{@link org.eclipse.uml2.impl.AssociationClassImpl#getRelatedElements() <em>Related Element</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.AssociationClassImpl#getOwnedEnds() <em>Owned End</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.AssociationClassImpl#getEndTypes() <em>End Type</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.AssociationClassImpl#getMemberEnds() <em>Member End</em>}</li>
 * </ul>
 * </p>
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link org.eclipse.uml2.impl.AssociationClassImpl#getFeatures() <em>Get Features</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.AssociationClassImpl#getOwnedMembers() <em>Get Owned Members</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.AssociationClassImpl#getRelatedElements() <em>Get Related Elements</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.AssociationClassImpl#getMembers() <em>Get Members</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class AssociationClassImplTest extends ClassImplTest {

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
		TestRunner.run(AssociationClassImplTest.class);
	}

	/**
	 * Constructs a new Association Class test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssociationClassImplTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Association Class test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private AssociationClassImpl getFixture() {
		return (AssociationClassImpl) fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	protected void setUp() throws Exception {
		setFixture((AssociationClassImpl) UML2Factory.eINSTANCE.createAssociationClass());
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
	 * Tests the '{@link org.eclipse.uml2.impl.AssociationClassImpl#getRelatedElements() <em>Related Element</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.AssociationClassImpl#getRelatedElements()
	 * @generated NOT
	 */
	public void testGetRelatedElements() {

		for (Iterator eAllSubClasses = getEAllSubClasses(UML2Package.eINSTANCE.getType()).iterator(); eAllSubClasses.hasNext();) {
			Property memberEnd = UML2Factory.eINSTANCE.createProperty();
			memberEnd.setType((Type) UML2Factory.eINSTANCE.create((EClass) eAllSubClasses.next()));

			getFixture().getMemberEnds().add(memberEnd);
		}

		assertTrue(getFixture().getRelatedElements().containsAll(getFixture().getEndTypes()));
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.impl.AssociationClassImpl#getOwnedEnds() <em>Owned End</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.AssociationClassImpl#getOwnedEnds()
	 * @generated
	 */
	public void testGetOwnedEnds() {
		// TODO: implement this feature getter test method
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.impl.AssociationClassImpl#getEndTypes() <em>End Type</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.AssociationClassImpl#getEndTypes()
	 * @generated NOT
	 */
	public void testGetEndTypes() {

		for (Iterator eAllSubClasses = getEAllSubClasses(UML2Package.eINSTANCE.getType()).iterator(); eAllSubClasses.hasNext();) {
			Property memberEnd = UML2Factory.eINSTANCE.createProperty();
			memberEnd.setType((Type) UML2Factory.eINSTANCE.create((EClass) eAllSubClasses.next()));

			getFixture().getMemberEnds().add(memberEnd);
		}

		for (Iterator memberEnds = getFixture().getMemberEnds().iterator(); memberEnds.hasNext();) {
			assertTrue(getFixture().getEndTypes().contains(((Property) memberEnds.next()).getType()));
		}
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.impl.AssociationClassImpl#getMemberEnds() <em>Member End</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.AssociationClassImpl#getMemberEnds()
	 * @generated
	 */
	public void testGetMemberEnds() {
		// TODO: implement this feature getter test method
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.impl.AssociationClassImpl#getFeatures() <em>Get Features</em>}' getter operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.AssociationClassImpl#getFeatures()
	 * @generated NOT
	 */
	public void testGetFeatures() {
		super.testGetFeatures();

		assertTrue(getFixture().getFeatures().containsAll(getFixture().getOwnedEnds()));
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.impl.AssociationClassImpl#getOwnedMembers() <em>Get Owned Members</em>}' getter operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.AssociationClassImpl#getOwnedMembers()
	 * @generated NOT
	 */
	public void testGetOwnedMembers() {
		super.testGetOwnedMembers();

		assertTrue(getFixture().getOwnedMembers().containsAll(getFixture().getOwnedEnds()));
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.impl.AssociationClassImpl#getMembers() <em>Get Members</em>}' getter operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.AssociationClassImpl#getMembers()
	 * @generated NOT
	 */
	public void testGetMembers() {
		super.testGetMembers();

		assertTrue(getFixture().getMembers().containsAll(getFixture().getMemberEnds()));
	}

	/**
	 * @see org.eclipse.uml2.impl.tests.NamespaceImplTest#setUpMembers()
	 */
	protected void setUpMembers() {
		super.setUpMembers();

		getFixture().getMemberEnds().add(UML2Factory.eINSTANCE.createProperty());
		getFixture().getMemberEnds().add(UML2Factory.eINSTANCE.createProperty());
	}

	/**
	 * @see org.eclipse.uml2.impl.tests.NamespaceImplTest#setUpOwnedMembers()
	 */
	protected void setUpOwnedMembers() {
		super.setUpOwnedMembers();

		getFixture().getOwnedEnds().add(UML2Factory.eINSTANCE.createProperty());
		getFixture().getOwnedEnds().add(UML2Factory.eINSTANCE.createProperty());
	}

	/**
	 * @see org.eclipse.uml2.impl.tests.ClassifierImplTest#setUpFeatures()
	 */
	protected void setUpFeatures() {
		super.setUpFeatures();

		getFixture().getOwnedEnds().add(UML2Factory.eINSTANCE.createProperty());
		getFixture().getOwnedEnds().add(UML2Factory.eINSTANCE.createProperty());
	}

} //AssociationClassImplTest
