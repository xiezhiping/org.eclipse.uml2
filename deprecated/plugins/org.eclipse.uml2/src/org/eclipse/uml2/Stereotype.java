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
 * $Id: Stereotype.java,v 1.9 2005/03/18 04:00:53 khussey Exp $
 */
package org.eclipse.uml2;

import java.util.Set;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Stereotype</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.eclipse.uml2.UML2Package#getStereotype()
 * @model 
 * @generated
 */
public interface Stereotype extends org.eclipse.uml2.Class{

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) 2003, 2004 IBM Corporation and others."; //$NON-NLS-1$

	// <!-- begin-custom-operations -->

	/**
	 * Creates a(n) (required) extension of the specified Ecore class with this
	 * stereotype.
	 * 
	 * @param eClass
	 *            The Ecore class to be extended.
	 * @param required
	 *            Whether the extension should be required.
	 * @return The new extension.
	 * @throws IllegalArgumentException
	 *             If this stereotype already extends (a subclass of) the Ecore
	 *             class.
	 */
	public Extension createExtension(EClass eClass, boolean required);

	/**
	 * Retrieves the set of Ecore classes extended by this stereotype, including
	 * the Ecore classes extended by its super(stereo)types.
	 * 
	 * @return The Ecore classes extended by this stereotype and its
	 *         super(stereo)types.
	 */
	public Set getAllExtendedEClasses();

	/**
	 * Retrieves the profile that owns this stereotype.
	 * 
	 * @return The profile that owns this stereotype.
	 */
	public Profile getProfile();

	/**
	 * Retrieves the localized keyword for this stereotype.
	 * 
	 * @return The localized keyword for this stereotype.
	 */
	public String getKeyword();

	/**
	 * Retrieves the keyword for this stereotype, localized if indicated.
	 * 
	 * @param localize
	 *            Whether the keyword should be localized.
	 * @return The (localized) keyword for this stereotype.
	 */
	public String getKeyword(boolean localize);

	// <!-- end-custom-operations -->

} // Stereotype
