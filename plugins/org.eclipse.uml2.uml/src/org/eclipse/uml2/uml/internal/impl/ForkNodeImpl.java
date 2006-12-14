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
 * $Id: ForkNodeImpl.java,v 1.3 2006/12/14 15:49:29 khussey Exp $
 */
package org.eclipse.uml2.uml.internal.impl;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.uml2.uml.ForkNode;
import org.eclipse.uml2.uml.UMLPackage;

import org.eclipse.uml2.uml.internal.operations.ForkNodeOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fork Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class ForkNodeImpl
		extends ControlNodeImpl
		implements ForkNode {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ForkNodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UMLPackage.Literals.FORK_NODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOneIncomingEdge(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ForkNodeOperations.validateOneIncomingEdge(this, diagnostics,
			context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEdges(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ForkNodeOperations.validateEdges(this, diagnostics, context);
	}

} //ForkNodeImpl
