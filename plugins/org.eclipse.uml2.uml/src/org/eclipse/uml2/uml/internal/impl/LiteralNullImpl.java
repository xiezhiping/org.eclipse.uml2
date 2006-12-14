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
 * $Id: LiteralNullImpl.java,v 1.3 2006/12/14 15:49:29 khussey Exp $
 */
package org.eclipse.uml2.uml.internal.impl;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.uml2.uml.LiteralNull;
import org.eclipse.uml2.uml.UMLPackage;

import org.eclipse.uml2.uml.internal.operations.LiteralNullOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Literal Null</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class LiteralNullImpl
		extends LiteralSpecificationImpl
		implements LiteralNull {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LiteralNullImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UMLPackage.Literals.LITERAL_NULL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isComputable() {
		return LiteralNullOperations.isComputable(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isNull() {
		return LiteralNullOperations.isNull(this);
	}

} //LiteralNullImpl
