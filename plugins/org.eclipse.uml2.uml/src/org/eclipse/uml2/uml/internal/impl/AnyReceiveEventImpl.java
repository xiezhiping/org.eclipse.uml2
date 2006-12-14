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
 * $Id: AnyReceiveEventImpl.java,v 1.3 2006/12/14 15:49:30 khussey Exp $
 */
package org.eclipse.uml2.uml.internal.impl;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.uml2.uml.AnyReceiveEvent;
import org.eclipse.uml2.uml.UMLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Any Receive Event</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class AnyReceiveEventImpl
		extends MessageEventImpl
		implements AnyReceiveEvent {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AnyReceiveEventImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UMLPackage.Literals.ANY_RECEIVE_EVENT;
	}

} //AnyReceiveEventImpl
