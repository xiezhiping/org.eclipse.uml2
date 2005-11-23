/*
 * Copyright (c) 2005 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *
 * $Id: ImageImpl.java,v 1.2 2005/11/23 20:01:19 khussey Exp $
 */
package org.eclipse.uml2.uml.internal.impl;

import java.util.Iterator;

import org.eclipse.emf.common.notify.Adapter;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.uml2.common.util.CacheAdapter;

import org.eclipse.uml2.uml.Image;
import org.eclipse.uml2.uml.UMLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Image</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public abstract class ImageImpl
		extends EObjectImpl
		implements Image {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ImageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return UMLPackage.Literals.IMAGE;
	}

	/**
	 * Retrieves the cache adapter for this '<em><b>Image</b></em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return The cache adapter for this '<em><b>Image</b></em>'.
	 * @generated
	 */
	protected CacheAdapter getCacheAdapter() {
		for (Iterator i = eAdapters().iterator(); i.hasNext();) {
			Adapter adapter = (Adapter) i.next();
			if (adapter instanceof CacheAdapter) {
				return (CacheAdapter) adapter;
			}
		}
		return null;
	}

} //ImageImpl
