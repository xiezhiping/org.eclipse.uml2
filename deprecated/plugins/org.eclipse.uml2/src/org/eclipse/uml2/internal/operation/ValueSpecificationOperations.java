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
 * $Id: ValueSpecificationOperations.java,v 1.2 2004/04/10 04:09:50 khussey Exp $
 */
package org.eclipse.uml2.internal.operation;

import org.eclipse.uml2.ValueSpecification;

/**
 * A static utility class that provides operations related to value
 * specifications.
 */
public final class ValueSpecificationOperations
	extends UML2Operations {

	/**
	 * Constructs a new Value Specification Operations. This constructor should
	 * never be called because this is a static utility class.
	 */
	private ValueSpecificationOperations() {
		super();
	}

	public static boolean booleanValue(ValueSpecification valueSpecification) {
		throw new UnsupportedOperationException();
	}

	public static int integerValue(ValueSpecification valueSpecification) {
		throw new UnsupportedOperationException();
	}

	public static boolean isComputable(ValueSpecification valueSpecification) {
		return false;
	}

	public static boolean isNull(ValueSpecification valueSpecification) {
		return false;
	}

	public static String stringValue(ValueSpecification valueSpecification) {
		return EMPTY_STRING;
	}

	public static int unlimitedValue(ValueSpecification valueSpecification) {
		throw new UnsupportedOperationException();
	}

}