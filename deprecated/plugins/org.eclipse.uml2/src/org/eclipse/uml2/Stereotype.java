/*
 * Copyright (c) 2003, 2004 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Common Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/cpl-v10.html
 *
 * Contributors:
 *   IBM - Initial API and implementation
 */
package org.eclipse.uml2;

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
	 * Creates a(n) (required) extension of the specified metaclass with this
	 * stereotype.
	 * 
	 * @param eClass The metaclass to be extended.
	 * @param required Whether the extension should be required.
	 * @return The new extension.
	 * @throws IllegalArgumentException If this stereotype already extends the
	 *                                  metaclass.
	 */
	public Extension createExtension(EClass eClass, boolean required);

	/**
	 * Retrieves the profile that owns this stereotype.
	 * 
	 * @return The profile that owns this stereotype.
	 */
	public Profile getProfile();

	// <!-- end-custom-operations -->

} // Stereotype
