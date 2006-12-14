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
 * $Id: FinalNodeImpl.java,v 1.3 2006/12/14 15:49:30 khussey Exp $
 */
package org.eclipse.uml2.uml.internal.impl;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.uml2.uml.FinalNode;
import org.eclipse.uml2.uml.UMLPackage;

import org.eclipse.uml2.uml.internal.operations.FinalNodeOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Final Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public abstract class FinalNodeImpl
		extends ControlNodeImpl
		implements FinalNode {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FinalNodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UMLPackage.Literals.FINAL_NODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNoOutgoingEdges(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return FinalNodeOperations.validateNoOutgoingEdges(this, diagnostics,
			context);
	}

} //FinalNodeImpl
