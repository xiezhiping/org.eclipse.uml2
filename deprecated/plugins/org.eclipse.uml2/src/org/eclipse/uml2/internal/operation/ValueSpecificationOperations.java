/*
 * Copyright (c) 2003, 2004 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *
 * $Id: ValueSpecificationOperations.java,v 1.3 2005/03/15 18:44:46 khussey Exp $
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