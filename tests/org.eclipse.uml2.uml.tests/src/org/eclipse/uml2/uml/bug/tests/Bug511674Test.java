/*
 * Copyright (c) 2017 Christian W. Damus and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Christian W. Damus - Initial API and implementation
 *   
 */

package org.eclipse.uml2.uml.bug.tests;

import java.util.Arrays;

import org.eclipse.uml2.uml.StateMachine;
import org.eclipse.uml2.uml.UMLFactory;
import org.eclipse.uml2.uml.UMLPackage;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class Bug511674Test extends TestCase {

	public Bug511674Test() {
		super();
	}

	public static Test suite() {
		return new TestSuite(Bug511674Test.class, "Bug 511674 tests"); //$NON-NLS-1$
	}

	/**
	 * This test passes because the {@code redefinedClassifier} superset
	 * now includes the {@code redefinedBehavior} subset which in
	 * {@link StateMachine} is redefined as {@code extendedStateMachine}.
	 */
	public void testExtendedStateMachines() {
		org.eclipse.uml2.uml.Class class1 = UMLFactory.eINSTANCE.createClass();
		org.eclipse.uml2.uml.Class class2 = UMLFactory.eINSTANCE.createClass();
		class2.createGeneralization(class1);

		StateMachine sm1 = (StateMachine) class1.createClassifierBehavior(null, UMLPackage.Literals.STATE_MACHINE);
		StateMachine sm2 = (StateMachine) class2.createClassifierBehavior(null, UMLPackage.Literals.STATE_MACHINE);

		sm2.getExtendedStateMachines().add(sm1);

		assertEquals(Arrays.asList(sm1), sm2.getRedefinedElements());
	}

}
