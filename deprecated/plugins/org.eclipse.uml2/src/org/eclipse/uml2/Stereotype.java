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
 * $Id: Stereotype.java,v 1.6 2004/06/02 19:52:53 khussey Exp $
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
	 * @param eClass The Ecore class to be extended.
	 * @param required Whether the extension should be required.
	 * @return The new extension.
	 * @throws IllegalArgumentException If this stereotype already extends the
	 *                                  Ecore class.
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
	 * Retrieves the keyword for this stereotype.
	 * 
	 * @return The keyword for this stereotype.
	 */
	public String getKeyword();

	// <!-- end-custom-operations -->

} // Stereotype
