/*
 * Copyright (c) 2003, 2005 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *
 * $Id: WriteLinkActionImpl.java,v 1.10 2005/11/04 22:23:01 khussey Exp $
 */
package org.eclipse.uml2.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.uml2.UML2Package;
import org.eclipse.uml2.WriteLinkAction;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Write Link Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public abstract class WriteLinkActionImpl extends LinkActionImpl implements WriteLinkAction {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) IBM Corporation and others."; //$NON-NLS-1$

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WriteLinkActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return UML2Package.eINSTANCE.getWriteLinkAction();
	}


} //WriteLinkActionImpl
