/*
 * Copyright (c) 2005, 2006 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *
 * $Id: GateImpl.java,v 1.3 2006/12/14 15:49:28 khussey Exp $
 */
package org.eclipse.uml2.uml.internal.impl;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.uml2.uml.Gate;
import org.eclipse.uml2.uml.UMLPackage;

import org.eclipse.uml2.uml.internal.operations.GateOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Gate</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class GateImpl
		extends MessageEndImpl
		implements Gate {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UMLPackage.Literals.GATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMessagesActualGate(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return GateOperations.validateMessagesActualGate(this, diagnostics,
			context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMessagesCombinedFragment(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return GateOperations.validateMessagesCombinedFragment(this,
			diagnostics, context);
	}

} //GateImpl
