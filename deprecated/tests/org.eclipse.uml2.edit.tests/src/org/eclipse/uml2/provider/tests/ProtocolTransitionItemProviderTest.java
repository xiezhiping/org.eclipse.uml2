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
 * $Id: ProtocolTransitionItemProviderTest.java,v 1.2 2004/04/30 17:18:14 khussey Exp $
 */
package org.eclipse.uml2.provider.tests;

import junit.textui.TestRunner;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.uml2.Constraint;
import org.eclipse.uml2.ProtocolTransition;
import org.eclipse.uml2.UML2Factory;
import org.eclipse.uml2.UML2Package;

/**
 * <!-- begin-user-doc -->
 * A test case for the '<em><b>Protocol Transition</b></em>' item provider adapter.
 * <!-- end-user-doc -->
 * @generated
 */
public class ProtocolTransitionItemProviderTest extends TransitionItemProviderTest {

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
		TestRunner.run(ProtocolTransitionItemProviderTest.class);
	}

	/**
	 * Constructs a new Protocol Transition item provider adapter test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProtocolTransitionItemProviderTest(String name) {
		super(name);
	}

	/**
	 * Returns the model object for this Protocol Transition item provider adapter test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private ProtocolTransition getModelObject() {
		return (ProtocolTransition) modelObject;
	}

	/* (non-Javadoc)
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	protected void setUp() throws Exception {
		super.setUp();

		setModelObject(UML2Factory.eINSTANCE.createProtocolTransition());
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.provider.ProtocolTransitionItemProvider#createSetCommand(org.eclipse.emf.edit.domain.EditingDomain, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EStructuralFeature, java.lang.Object) <em>Create Set Command</em>}' method.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.provider.ProtocolTransitionItemProvider#createSetCommand(org.eclipse.emf.edit.domain.EditingDomain, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EStructuralFeature, java.lang.Object)
	 * @generated
	 */
	public void testCreateSetCommand() {
		
		// test PROTOCOL_TRANSITION__PRE_CONDITION subset...
		Constraint constraint = UML2Factory.eINSTANCE.createConstraint();
		
		Command command = SetCommand.create(getEditingDomain(), getModelObject(), UML2Package.eINSTANCE.getProtocolTransition_PreCondition(), constraint);
		
		getCommandStack().execute(command);
		
		assertSame(constraint, getModelObject().getPreCondition());
		assertSame(getModelObject().getPreCondition(), getModelObject().getGuard());
		
		getCommandStack().undo();
		
		assertNotSame(constraint, getModelObject().getPreCondition());
		assertSame(getModelObject().getPreCondition(), getModelObject().getGuard());
		
		getCommandStack().redo();
		
		assertSame(constraint, getModelObject().getPreCondition());
		assertSame(getModelObject().getPreCondition(), getModelObject().getGuard());
		
		// test PROTOCOL_TRANSITION__GUARD superset...
		Constraint oldConstraint = UML2Factory.eINSTANCE.createConstraint();
		Constraint newConstraint = UML2Factory.eINSTANCE.createConstraint();
		
		getModelObject().setPreCondition(oldConstraint);
		
		command = SetCommand.create(getEditingDomain(), getModelObject(), UML2Package.eINSTANCE.getTransition_Guard(), newConstraint);
		
		getCommandStack().execute(command);
		
		assertSame(newConstraint, getModelObject().getGuard());
		assertSame(null, getModelObject().getPreCondition());
		
		getCommandStack().undo();
		
		assertSame(oldConstraint, getModelObject().getGuard());
		assertSame(oldConstraint, getModelObject().getPreCondition());
		
		getCommandStack().redo();
		
		assertSame(newConstraint, getModelObject().getGuard());
		assertSame(null, getModelObject().getPreCondition());
	}

} //ProtocolTransitionItemProviderTest
