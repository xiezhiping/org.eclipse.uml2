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
 * $Id: ElementImplTest.java,v 1.1 2004/04/29 14:56:47 khussey Exp $
 */
package org.eclipse.uml2.impl.tests;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import junit.framework.TestCase;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.uml2.Element;
import org.eclipse.uml2.UML2Factory;
import org.eclipse.uml2.UML2Package;
import org.eclipse.uml2.impl.ElementImpl;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are tested:
 * <ul>
 *   <li>{@link org.eclipse.uml2.impl.ElementImpl#getOwnedElements() <em>Owned Element</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.ElementImpl#getOwner() <em>Owner</em>}</li>
 * </ul>
 * </p>
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link org.eclipse.uml2.impl.ElementImpl#validateNotOwnSelf() <em>Validate Not Own Self</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.ElementImpl#validateHasOwner() <em>Validate Has Owner</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.ElementImpl#allOwnedElements() <em>All Owned Elements</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.ElementImpl#mustBeOwned() <em>Must Be Owned</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public abstract class ElementImplTest extends TestCase {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2003, 2004 IBM Corporation and others."; //$NON-NLS-1$

	/**
	 * The fixture for this Element test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ElementImpl fixture = null;

	/**
	 * Constructs a new Element test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElementImplTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Element test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(ElementImpl fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Element test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private ElementImpl getFixture() {
		return fixture;
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.impl.ElementImpl#getOwnedElements() <em>Owned Element</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.ElementImpl#getOwnedElements()
	 * @generated NOT
	 */
	public void testGetOwnedElements() {
		setUpOwnedElements();

		for (Iterator ownedElements = getFixture().getOwnedElements().iterator(); ownedElements.hasNext();) {
			assertTrue(Element.class.isInstance(ownedElements.next()));
		}

		assertTrue(getFixture().getOwnedElements().containsAll(getFixture().getOwnedComments()));
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.impl.ElementImpl#getOwner() <em>Owner</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.ElementImpl#getOwner()
	 * @generated NOT
	 */
	public void testGetOwner() {
		setUpOwner();

		if (null != getFixture().eContainer()) {
			assertSame(getFixture().eContainer(), getFixture().getOwner());
		}
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.impl.ElementImpl#validateNotOwnSelf() <em>Validate Not Own Self</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.ElementImpl#validateNotOwnSelf()
	 * @generated
	 */
	public void testValidateNotOwnSelf() {
		// TODO: implement this operation test method
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.impl.ElementImpl#validateHasOwner() <em>Validate Has Owner</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.ElementImpl#validateHasOwner()
	 * @generated
	 */
	public void testValidateHasOwner() {
		// TODO: implement this operation test method
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.impl.ElementImpl#allOwnedElements() <em>All Owned Elements</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.ElementImpl#allOwnedElements()
	 * @generated NOT
	 */
	public void testAllOwnedElements() {
		setUpOwnedElements();

		assertTrue(getFixture().allOwnedElements().containsAll(getFixture().getOwnedElements()));

		for (Iterator allOwnedElements = getFixture().allOwnedElements().iterator(); allOwnedElements.hasNext();) {
			assertTrue(getFixture().allOwnedElements().containsAll(((Element) allOwnedElements.next()).allOwnedElements()));
		}
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.impl.ElementImpl#mustBeOwned() <em>Must Be Owned</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.ElementImpl#mustBeOwned()
	 * @generated NOT
	 */
	public void testMustBeOwned() {
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
