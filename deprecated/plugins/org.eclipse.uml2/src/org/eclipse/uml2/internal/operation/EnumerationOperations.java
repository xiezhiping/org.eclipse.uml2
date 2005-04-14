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
 * $Id: EnumerationOperations.java,v 1.1 2005/04/14 17:30:57 khussey Exp $
 */
package org.eclipse.uml2.internal.operation;

import org.eclipse.uml2.Enumeration;
import org.eclipse.uml2.EnumerationLiteral;
import org.eclipse.uml2.UML2Package;

/**
 * A static utility class that provides operations related to enumerations.
 */
public final class EnumerationOperations
		extends UML2Operations {

	/**
	 * Constructs a new Enumeration Operations. This constructor should never be
	 * called because this is a static utility class.
	 */
	private EnumerationOperations() {
		super();
	}

	/**
	 * Creates an enumeration literal with the specified name as an owned
	 * literal of the specified enumeration.
	 * 
	 * @param enumeration
	 *            The enumeration in which to create the owned literal.
	 * @param name
	 *            The name for the owned literal.
	 * @return The new enumeration literal.
	 * @exception IllegalArgumentException
	 *                If the name is empty.
	 */
	public static EnumerationLiteral createOwnedLiteral(
			Enumeration enumeration, String name) {

		if (null == enumeration) {
			throw new IllegalArgumentException(String.valueOf(enumeration));
		}

		if (isEmpty(name)) {
			throw new IllegalArgumentException(String.valueOf(name));
		}

		EnumerationLiteral ownedLiteral = enumeration
			.createOwnedLiteral(UML2Package.eINSTANCE.getEnumerationLiteral());
		ownedLiteral.setName(name);
		return ownedLiteral;
	}

}