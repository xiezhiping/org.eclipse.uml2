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
 * $Id: InteractionImplTest.java,v 1.3 2005/03/15 18:51:31 khussey Exp $
 */
package org.eclipse.uml2.impl.tests;

import java.util.Iterator;

import junit.textui.TestRunner;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.uml2.UML2Factory;
import org.eclipse.uml2.UML2Package;
import org.eclipse.uml2.impl.InteractionImpl;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Interaction</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are tested:
 * <ul>
 *   <li>{@link org.eclipse.uml2.impl.InteractionImpl#getCovereds() <em>Covered</em>}</li>
 * </ul>
 * </p>
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link org.eclipse.uml2.impl.InteractionImpl#getOwnedElements() <em>Get Owned Elements</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.InteractionImpl#getNamespace() <em>Get Namespace</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.InteractionImpl#getOwnedMembers() <em>Get Owned Members</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class InteractionImplTest extends BehaviorImplTest {

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
		TestRunner.run(InteractionImplTest.class);
	}

	/**
	 * Constructs a new Interaction test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InteractionImplTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Interaction test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private InteractionImpl getFixture() {
		return (InteractionImpl) fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	protected void setUp() throws Exception {
		setFixture((InteractionImpl) UML2Factory.eINSTANCE.createInteraction());
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
	 * Tests the '{@link org.eclipse.uml2.impl.InteractionImpl#getCovereds() <em>Covered</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.InteractionImpl#getCovereds()
	 * @generated
	 */
	public void testGetCovereds() {
		// TODO: implement this feature getter test method
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.impl.InteractionImpl#getOwnedElements() <em>Get Owned Elements</em>}' getter operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.InteractionImpl#getOwnedElements()
	 * @generated
	 */
	public void testGetOwnedElementsGen() {
		// TODO: implement this getter operation test method
	}

	public void testGetOwnedElements() {
		testGetOwnedElementsGen();
		
		super.testGetOwnedElements();

		assertTrue(getFixture().getOwnedElements().containsAll(getFixture().getGeneralOrderings()));
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.impl.InteractionImpl#getNamespace() <em>Get Namespace</em>}' getter operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.InteractionImpl#getNamespace()
	 * @generated
	 */
	public void testGetNamespaceGen() {
		// TODO: implement this getter operation test method
	}

	public void testGetNamespace() {
		testGetNamespaceGen();
		
		setUpNamespace();

		if (null != getFixture().getEnclosingOperand()) {
			assertSame(getFixture().getEnclosingOperand(), getFixture().getNamespace());
		}
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.impl.InteractionImpl#getOwnedMembers() <em>Get Owned Members</em>}' getter operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.InteractionImpl#getOwnedMembers()
	 * @generated
	 */
	public void testGetOwnedMembersGen() {
		// TODO: implement this getter operation test method
	}

	public void testGetOwnedMembers() {
		testGetOwnedMembersGen();
		
		super.testGetOwnedMembers();

		assertTrue(getFixture().getOwnedMembers().containsAll(getFixture().getFormalGates()));
		assertTrue(getFixture().getOwnedMembers().containsAll(getFixture().getLifelines()));
		assertTrue(getFixture().getOwnedMembers().containsAll(getFixture().getMessages()));
	}

	/* (non-Javadoc)
	 * @see org.eclipse.uml2.impl.tests.ElementImplTest#setUpOwnedElements()
	 */
	protected void setUpOwnedElements() {
		super.setUpOwnedElements();

		getFixture().getGeneralOrderings().add(UML2Factory.eINSTANCE.createGeneralOrdering());
		getFixture().getGeneralOrderings().add(UML2Factory.eINSTANCE.createGeneralOrdering());
	}

	/* (non-Javadoc)
	 * @see org.eclipse.uml2.impl.tests.NamespaceImplTest#setUpOwnedMembers()
	 */
	protected void setUpOwnedMembers() {
		super.setUpOwnedMembers();

		getFixture().getFormalGates().add(UML2Factory.eINSTANCE.createGate());
		getFixture().getFormalGates().add(UML2Factory.eINSTANCE.createGate());

		getFixture().getLifelines().add(UML2Factory.eINSTANCE.createLifeline());
		getFixture().getLifelines().add(UML2Factory.eINSTANCE.createLifeline());

		getFixture().getMessages().add(UML2Factory.eINSTANCE.createMessage());
		getFixture().getMessages().add(UML2Factory.eINSTANCE.createMessage());
	}

	public void testGetFragments() {

		for (Iterator interactionFragmentSubClasses = getEAllSubClasses(UML2Package.eINSTANCE.getInteractionFragment()).iterator();
			interactionFragmentSubClasses.hasNext();
			) {

			EClass interactionFragmentSubClass = (EClass) interactionFragmentSubClasses.next();

			for (int i = 0; i < 5; i++) {
				assertTrue(getFixture().getFragments().contains(getFixture().createFragment(interactionFragmentSubClass)));
			}
		}
	}

} //InteractionImplTest
