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
 * $Id: EnumerationOperations.java,v 1.2 2005/12/22 20:21:23 khussey Exp $
 */
package org.eclipse.uml2.uml.internal.operations;

import org.eclipse.uml2.uml.Enumeration;
import org.eclipse.uml2.uml.EnumerationLiteral;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Enumeration</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.Enumeration#createOwnedLiteral(java.lang.String) <em>Create Owned Literal</em>}</li>
 * </ul>
 * </p>
 *
 * @generated not
 */
public final class EnumerationOperations extends UMLOperations {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EnumerationOperations() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public static EnumerationLiteral createOwnedLiteral(
			Enumeration enumeration, String name) {

		if (isEmpty(name)) {
			throw new IllegalArgumentException(String.valueOf(name));
		}

		EnumerationLiteral ownedLiteral = enumeration.createOwnedLiteral();
		ownedLiteral.setName(name);
		return ownedLiteral;
	}

} // EnumerationOperations