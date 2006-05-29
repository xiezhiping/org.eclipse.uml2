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
 * $Id: ElementTest.java,v 1.4 2006/05/29 17:27:34 khussey Exp $
 */
package org.eclipse.uml2.tests;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import junit.framework.TestCase;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.uml2.Element;
import org.eclipse.uml2.UML2Factory;
import org.eclipse.uml2.UML2Package;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link org.eclipse.uml2.Element#validateNotOwnSelf(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Not Own Self</em>}</li>
 *   <li>{@link org.eclipse.uml2.Element#validateHasOwner(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Has Owner</em>}</li>
 *   <li>{@link org.eclipse.uml2.Element#allOwnedElements() <em>All Owned Elements</em>}</li>
 *   <li>{@link org.eclipse.uml2.Element#mustBeOwned() <em>Must Be Owned</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public abstract class ElementTest extends TestCase {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) IBM Corporation and others."; //$NON-NLS-1$

	/**
	 * The fixture for this Element test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Element fixture = null;

	/**
	 * Constructs a new Element test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElementTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Element test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Element fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Element test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private Element getFixture() {
		return fixture;
	}

	public void testGetOwnedElements() {
		setUpOwnedElements();

		for (Iterator ownedElements = getFixture().getOwnedElements().iterator(); ownedElements.hasNext();) {
			assertTrue(Element.class.isInstance(ownedElements.next()));
		}

		assertTrue(getFixture().getOwnedElements().containsAll(getFixture().getOwnedComments()));
	}

	public void testGetOwner() {
		setUpOwner();

		if (null != getFixture().eContainer()) {
			assertSame(getFixture().eContainer(), getFixture().getOwner());
		}
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.Element#validateNotOwnSelf(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Not Own Self</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.Element#validateNotOwnSelf(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	public void testValidateNotOwnSelf__DiagnosticChain_Map() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.Element#validateHasOwner(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Has Owner</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.Element#validateHasOwner(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	public void testValidateHasOwner__DiagnosticChain_Map() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.Element#allOwnedElements() <em>All Owned Elements</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.Element#allOwnedElements()
	 * @generated
	 */
	public void testAllOwnedElementsGen() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	public void testAllOwnedElements() {
		testAllOwnedElementsGen();
		
		setUpOwnedElements();

		assertTrue(getFixture().allOwnedElements().containsAll(getFixture().getOwnedElements()));

		for (Iterator allOwnedElements = getFixture().allOwnedElements().iterator(); allOwnedElements.hasNext();) {
			assertTrue(getFixture().allOwnedElements().containsAll(((Element) allOwnedElements.next()).allOwnedElements()));
		}
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.Element#mustBeOwned() <em>Must Be Owned</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.Element#mustBeOwned()
	 * @generated
	 */
	public void testMustBeOwnedGen() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}


	public void testMustBeOwned() {
		testMustBeOwnedGen();
		
		assertTrue(getFixture().mustBeOwned());
	}

	protected List getEAllSubClasses(EClass eClass) {
		List eAllSubClasses = new ArrayList();

		for (Iterator eClassifiers = UML2Package.eINSTANCE.getEClassifiers().iterator(); eClassifiers.hasNext();) {
			EClassifier eClassifier = (EClassifier) eClassifiers.next();

			if (EClass.class.isInstance(eClassifier) && eClass.isSuperTypeOf((EClass) eClassifier) && !((EClass) eClassifier).isAbstract()) {
				eAllSubClasses.add(eClassifier);
			}
		}

		return eAllSubClasses;
	}

	protected void setUpOwnedElements() {
		getFixture().getOwnedComments().add(UML2Factory.eINSTANCE.createComment());
		getFixture().getOwnedComments().add(UML2Factory.eINSTANCE.createComment());
	}

	protected abstract void setUpOwner();

} //ElementImplTest
