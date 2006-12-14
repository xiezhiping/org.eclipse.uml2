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
 * $Id: MergeNodeImpl.java,v 1.3 2006/12/14 15:49:29 khussey Exp $
 */
package org.eclipse.uml2.uml.internal.impl;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.uml2.uml.MergeNode;
import org.eclipse.uml2.uml.UMLPackage;

import org.eclipse.uml2.uml.internal.operations.MergeNodeOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Merge Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class MergeNodeImpl
		extends ControlNodeImpl
		implements MergeNode {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MergeNodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UMLPackage.Literals.MERGE_NODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOneOutgoingEdge(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return MergeNodeOperations.validateOneOutgoingEdge(this, diagnostics,
			context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEdges(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return MergeNodeOperations.validateEdges(this, diagnostics, context);
	}

} //MergeNodeImpl
