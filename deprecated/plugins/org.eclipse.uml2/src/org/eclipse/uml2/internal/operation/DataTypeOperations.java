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
 * $Id: DataTypeOperations.java,v 1.3 2005/03/15 18:44:46 khussey Exp $
 */
package org.eclipse.uml2.internal.operation;

import java.util.Set;

import org.eclipse.uml2.DataType;

/**
 * A static utility class that provides operations related to data types.
 */
public final class DataTypeOperations
	extends UML2Operations {

	/**
	 * Constructs a new Data Type Operations. This constructor should never be
	 * called because this is a static utility class.
	 */
	private DataTypeOperations() {
		super();
	}

	public static Set inherit(DataType dataType, Set inhs) {
		return inhs;
	}

}