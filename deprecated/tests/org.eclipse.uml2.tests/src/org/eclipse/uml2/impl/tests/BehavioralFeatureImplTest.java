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
 * $Id: BehavioralFeatureImplTest.java,v 1.5 2005/03/15 18:51:30 khussey Exp $
 */
package org.eclipse.uml2.impl.tests;

import java.util.Iterator;

import org.eclipse.uml2.Classifier;
import org.eclipse.uml2.RedefinableElement;
import org.eclipse.uml2.UML2Factory;
import org.eclipse.uml2.impl.BehavioralFeatureImpl;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Behavioral Feature</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are tested:
 * <ul>
 *   <li>{@link org.eclipse.uml2.impl.BehavioralFeatureImpl#getRedefinitionContexts() <em>Redefinition Context</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.BehavioralFeatureImpl#isLeaf() <em>Is Leaf</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.BehavioralFeatureImpl#getFeaturingClassifiers() <em>Featuring Classifier</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.BehavioralFeatureImpl#isStatic() <em>Is Static</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.BehavioralFeatureImpl#getParameters() <em>Parameter</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.BehavioralFeatureImpl#getFormalParameters() <em>Formal Parameter</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.BehavioralFeatureImpl#getRaisedExceptions() <em>Raised Exception</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.BehavioralFeatureImpl#isAbstract() <em>Is Abstract</em>}</li>
 * </ul>
 * </p>
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link org.eclipse.uml2.impl.BehavioralFeatureImpl#validateRedefinitionContextValid(EDiagnosticChain, EMap) <em>Validate Redefinition Context Valid</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.BehavioralFeatureImpl#validateRedefinitionConsistent(EDiagnosticChain, EMap) <em>Validate Redefinition Consistent</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.BehavioralFeatureImpl#isConsistentWith(RedefinableElement) <em>Is Consistent With</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.BehavioralFeatureImpl#isRedefinitionContextValid(RedefinableElement) <em>Is Redefinition Context Valid</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.BehavioralFeatureImpl#getRedefinedElements() <em>Get Redefined Elements</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.BehavioralFeatureImpl#isDistinguishableFrom(NamedElement, Namespace) <em>Is Distinguishable From</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.BehavioralFeatureImpl#getMembers() <em>Get Members</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.BehavioralFeatureImpl#getOwnedMembers() <em>Get Owned Members</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public abstract class BehavioralFeatureImplTest extends NamespaceImplTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2003, 2004 IBM Corporation and others."; //$NON-NLS-1$

	/**
	 * Constructs a new Behavioral Feature test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BehavioralFeatureImplTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Behavioral Feature test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private BehavioralFeatureImpl getFixture() {
		return (BehavioralFeatureImpl) fixture;
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.impl.BehavioralFeatureImpl#getRedefinitionContexts() <em>Redefinition Context</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.BehavioralFeatureImpl#getRedefinitionContexts()
	 * @generated
	 */
	public void testGetRedefinitionContextsGen() {
		// TODO: implement this feature getter test method
	}

	public void testGetRedefinitionContexts() {
		testGetRedefinitionContextsGen();
		
		setUpRedefinitionContexts();

		for (Iterator redefinitionContexts = getFixture().getRedefinitionContexts().iterator(); redefinitionContexts.hasNext();) {
			assertTrue(Classifier.class.isInstance(redefinitionContexts.next()));
		}
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.impl.BehavioralFeatureImpl#isLeaf() <em>Is Leaf</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.BehavioralFeatureImpl#isLeaf()
	 * @generated
	 */
	public void testIsLeaf() {
		// TODO: implement this feature getter test method
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.impl.BehavioralFeatureImpl#setIsLeaf() <em>Is Leaf</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.BehavioralFeatureImpl#setIsLeaf()
	 * @generated
	 */
	public void testSetIsLeaf() {
		// TODO: implement this feature setter test method
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.impl.BehavioralFeatureImpl#getFeaturingClassifiers() <em>Featuring Classifier</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.BehavioralFeatureImpl#getFeaturingClassifiers()
	 * @generated
	 */
	public void testGetFeaturingClassifiersGen() {
		// TODO: implement this feature getter test method
	}

	public void testGetFeaturingClassifiers() {
		testGetFeaturingClassifiersGen();
		
		setUpFeaturingClassifiers();

		for (Iterator featuringClassifiers = getFixture().getFeaturingClassifiers().iterator(); featuringClassifiers.hasNext();) {
			assertTrue(Classifier.class.isInstance(featuringClassifiers.next()));
		}
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.impl.BehavioralFeatureImpl#isStatic() <em>Is Static</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.BehavioralFeatureImpl#isStatic()
	 * @generated
	 */
	public void testIsStatic() {
		// TODO: implement this feature getter test method
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.impl.BehavioralFeatureImpl#setIsStatic() <em>Is Static</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.BehavioralFeatureImpl#setIsStatic()
	 * @generated
	 */
	public void testSetIsStatic() {
		// TODO: implement this feature setter test method
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.impl.BehavioralFeatureImpl#getParameters() <em>Parameter</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.BehavioralFeatureImpl#getParameters()
	 * @generated
	 */
	public void testGetParametersGen() {
		// TODO: implement this feature getter test method
	}

	public void testGetParameters() {
		testGetParametersGen();
		
		getFixture().getFormalParameters().add(UML2Factory.eINSTANCE.createParameter());
		getFixture().getFormalParameters().add(UML2Factory.eINSTANCE.createParameter());

		getFixture().getReturnResults().add(UML2Factory.eINSTANCE.createParameter());
		getFixture().getReturnResults().add(UML2Factory.eINSTANCE.createParameter());

		assertTrue(getFixture().getParameters().containsAll(getFixture().getFormalParameters()));
		assertTrue(getFixture().getParameters().containsAll(getFixture().getReturnResults()));
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.impl.BehavioralFeatureImpl#getFormalParameters() <em>Formal Parameter</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.BehavioralFeatureImpl#getFormalParameters()
	 * @generated
	 */
	public void testGetFormalParameters() {
		// TODO: implement this feature getter test method
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.impl.BehavioralFeatureImpl#getRaisedExceptions() <em>Raised Exception</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.BehavioralFeatureImpl#getRaisedExceptions()
	 * @generated
	 */
	public void testGetRaisedExceptions() {
		// TODO: implement this feature getter test method
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.impl.BehavioralFeatureImpl#isAbstract() <em>Is Abstract</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.BehavioralFeatureImpl#isAbstract()
	 * @generated
	 */
	public void testIsAbstract() {
		// TODO: implement this feature getter test method
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.impl.BehavioralFeatureImpl#setIsAbstract() <em>Is Abstract</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.BehavioralFeatureImpl#setIsAbstract()
	 * @generated
	 */
	public void testSetIsAbstract() {
		// TODO: implement this feature setter test method
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.impl.BehavioralFeatureImpl#validateRedefinitionContextValid(EDiagnosticChain, EMap) <em>Validate Redefinition Context Valid</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.BehavioralFeatureImpl#validateRedefinitionContextValid(EDiagnosticChain, EMap)
	 * @generated
	 */
	public void testValidateRedefinitionContextValid__EDiagnosticChain_EMap() {
		// TODO: implement this operation test method
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.impl.BehavioralFeatureImpl#validateRedefinitionConsistent(EDiagnosticChain, EMap) <em>Validate Redefinition Consistent</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.BehavioralFeatureImpl#validateRedefinitionConsistent(EDiagnosticChain, EMap)
	 * @generated
	 */
	public void testValidateRedefinitionConsistent__EDiagnosticChain_EMap() {
		// TODO: implement this operation test method
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.impl.BehavioralFeatureImpl#isConsistentWith(RedefinableElement) <em>Is Consistent With</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.BehavioralFeatureImpl#isConsistentWith(RedefinableElement)
	 * @generated
	 */
	public void testIsConsistentWith__RedefinableElement() {
		// TODO: implement this operation test method
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.impl.BehavioralFeatureImpl#isRedefinitionContextValid(RedefinableElement) <em>Is Redefinition Context Valid</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.BehavioralFeatureImpl#isRedefinitionContextValid(RedefinableElement)
	 * @generated
	 */
	public void testIsRedefinitionContextValid__RedefinableElement() {
		// TODO: implement this operation test method
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.impl.BehavioralFeatureImpl#getRedefinedElements() <em>Get Redefined Elements</em>}' getter operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.BehavioralFeatureImpl#getRedefinedElements()
	 * @generated
	 */
	public void testGetRedefinedElementsGen() {
		// TODO: implement this getter operation test method
	}

	public void testGetRedefinedElements() {
		testGetRedefinedElementsGen();
		
		setUpRedefinedElements();

		for (Iterator redefinedElements = getFixture().getRedefinedElements().iterator(); redefinedElements.hasNext();) {
			assertTrue(RedefinableElement.class.isInstance(redefinedElements.next()));
		}
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.impl.BehavioralFeatureImpl#isDistinguishableFrom(NamedElement, Namespace) <em>Is Distinguishable From</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.BehavioralFeatureImpl#isDistinguishableFrom(NamedElement, Namespace)
	 * @generated
	 */
	public void testIsDistinguishableFrom__NamedElement_Namespace() {
		// TODO: implement this operation test method
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.impl.BehavioralFeatureImpl#getMembers() <em>Get Members</em>}' getter operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.BehavioralFeatureImpl#getMembers()
	 * @generated
	 */
	public void testGetMembersGen() {
		// TODO: implement this getter operation test method
	}

	public void testGetMembers() {
		testGetMembersGen();
		
		super.testGetMembers();

		assertTrue(getFixture().getMembers().containsAll(getFixture().getParameters()));
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.impl.BehavioralFeatureImpl#getOwnedMembers() <em>Get Owned Members</em>}' getter operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.BehavioralFeatureImpl#getOwnedMembers()
	 * @generated
	 */
	public void testGetOwnedMembersGen() {
		// TODO: implement this getter operation test method
	}

	public void testGetOwnedMembers() {
		testGetOwnedMembersGen();
		
		super.testGetOwnedMembers();

		assertTrue(getFixture().getOwnedMembers().containsAll(getFixture().getFormalParameters()));
		assertTrue(getFixture().getOwnedMembers().containsAll(getFixture().getReturnResults()));
	}

	/* (non-Javadoc)
	 * @see org.eclipse.uml2.impl.tests.NamespaceImplTest#setUpOwnedMembers()
	 */
	protected void setUpOwnedMembers() {
		super.setUpOwnedMembers();

		getFixture().getFormalParameters().add(UML2Factory.eINSTANCE.createParameter());
		getFixture().getFormalParameters().add(UML2Factory.eINSTANCE.createParameter());

		getFixture().getReturnResults().add(UML2Factory.eINSTANCE.createParameter());
		getFixture().getReturnResults().add(UML2Factory.eINSTANCE.createParameter());
	}

	protected void setUpRedefinitionContexts() {
		// do nothing
	}

	protected void setUpRedefinedElements() {
		// do nothing
	}

	protected void setUpFeaturingClassifiers() {
		// do nothing
	}

} //BehavioralFeatureImplTest
