/*
 * Copyright (c) 2004 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Common Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/cpl-v10.html
 *
 * Contributors:
 *   IBM - Initial API and implementation
 *
 * $Id: ClassifierOperationsTest.java,v 1.1 2004/04/29 14:56:55 khussey Exp $
 */
package org.eclipse.uml2.internal.operation.tests;

import java.util.Iterator;

import junit.textui.TestRunner;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.uml2.Classifier;
import org.eclipse.uml2.Generalization;
import org.eclipse.uml2.UML2Factory;
import org.eclipse.uml2.UML2Package;
import org.eclipse.uml2.internal.operation.ClassifierOperations;

/**
 * A test case for the '<em><b>Classifier Operations</b></em>' utility.
 */
public class ClassifierOperationsTest
	extends UML2OperationsTest {

	public static void main(String[] args) {
		TestRunner.run(ClassifierOperationsTest.class);
	}

	/**
	 * Constructs a new Classifier Operations test case with the given name.
	 */
	public ClassifierOperationsTest(String name) {
		super(name);
	}

	/**
	 * Returns the element for this Classifier Operations test case.
	 */
	private Classifier getElement() {
		return (Classifier) element;
	}

	/**
	 * Tests the '
	 * {@link org.eclipse.uml2.internal.operation.ClassifierOperations#createGeneralization(Classifier, Classifier) <em>Create Generalization</em>}'
	 * method.
	 * 
	 * @see org.eclipse.uml2.internal.operation.ClassifierOperations#createGeneralization(Classifier,
	 *      Classifier)
	 */
	public void testCreateGeneralization() {

		try {
			ClassifierOperations.createGeneralization(null, null);
			fail();
		} catch (IllegalArgumentException iae) {
			// pass
		}

		for (Iterator eAllSubClasses = getEAllSubClasses(
			UML2Package.eINSTANCE.getClassifier()).iterator(); eAllSubClasses
			.hasNext();) {

			EClass eClass = (EClass) eAllSubClasses.next();

			setElement((Classifier) UML2Factory.eINSTANCE.create(eClass));

			try {
				ClassifierOperations.createGeneralization(getElement(), null);
				fail();
			} catch (IllegalArgumentException iae) {
				// pass
			}

			Classifier classifier = (Classifier) UML2Factory.eINSTANCE
				.create(eClass);

			try {
				Generalization generalization = ClassifierOperations
					.createGeneralization(getElement(), classifier);

				assertNotNull(generalization);
				assertTrue(getElement().getGeneralizations().contains(
					generalization));
				assertSame(classifier, generalization.getGeneral());
			} catch (IllegalArgumentException iae) {
				fail();
			}

			try {
				ClassifierOperations.createGeneralization(getElement(),
					classifier);
				fail();
			} catch (IllegalArgumentException iae) {
				// pass
			}
		}
	}

}