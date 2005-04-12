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
 * $Id: Stereotype.java,v 1.11 2005/04/12 17:46:00 khussey Exp $
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
	String copyright = "Copyright (c) 2003, 2005 IBM Corporation and others."; //$NON-NLS-1$

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
	 * @deprecated Use createExtension(org.eclipse.uml2.Class, boolean) instead.
	 */
	Extension createExtension(EClass eClass, boolean required);

	/**
	 * Retrieves the set of Ecore classes extended by this stereotype, including
	 * the Ecore classes extended by its super(stereo)types.
	 * 
	 * @return The Ecore classes extended by this stereotype and its
	 *         super(stereo)types.
	 * @deprecated Use getAllExtendedMetaclasses() instead.
	 */
	Set getAllExtendedEClasses();

	/**
	 * Retrieves the profile that owns this stereotype.
	 * 
	 * @return The profile that owns this stereotype.
	 */
	Profile getProfile();

	/**
	 * Retrieves the localized keyword for this stereotype.
	 * 
	 * @return The localized keyword for this stereotype.
	 */
	String getKeyword();

	/**
	 * Retrieves the keyword for this stereotype, localized if indicated.
	 * 
	 * @param localize
	 *            Whether the keyword should be localized.
	 * @return The (localized) keyword for this stereotype.
	 */
	String getKeyword(boolean localize);

	/**
	 * Creates a(n) (required) extension of the specified metaclass with this
	 * stereotype.
	 * 
	 * @param metaclass
	 *            The metaclass to be extended.
	 * @param required
	 *            Whether the extension should be required.
	 * @return The new extension.
	 * @throws IllegalArgumentException
	 *             If this stereotype or any of its super(stereo)types already
	 *             extends the metaclass.
	 */
	Extension createExtension(org.eclipse.uml2.Class metaclass, boolean required);

	/**
	 * Retrieves the metaclasses extended by this stereotype.
	 * 
	 * @return The metaclasses extended by this stereotype.
	 */
	Set getExtendedMetaclasses();

	/**
	 * Retrieves the metaclasses extended by this stereotype, including the
	 * metaclasses extended by its super(stereo)types.
	 * 
	 * @return The metaclasses extended by this stereotype and its
	 *         super(stereo)types.
	 */
	Set getAllExtendedMetaclasses();

	// <!-- end-custom-operations -->

} // Stereotype
