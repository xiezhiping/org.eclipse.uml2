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
 * $Id: LiteralNullOperations.java,v 1.2 2004/04/10 04:09:50 khussey Exp $
 */
package org.eclipse.uml2.internal.operation;

import org.eclipse.uml2.LiteralNull;

/**
 * A static utility class that provides operations related to literal nulls.
 */
public final class LiteralNullOperations
	extends UML2Operations {

	/**
	 * Constructs a new Literal Null Operations. This constructor should never
	 * be called because this is a static utility class.
	 */
	private LiteralNullOperations() {
		super();
	}

	public static boolean isComputable(LiteralNull literalNull) {
		return true;
	}

	public static boolean isNull(LiteralNull literalNull) {
		return true;
	}

}