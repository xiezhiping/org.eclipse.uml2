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
 * $Id: ElementImportOperations.java,v 1.2 2004/04/10 04:09:50 khussey Exp $
 */
package org.eclipse.uml2.internal.operation;

import org.eclipse.uml2.ElementImport;

/**
 * A static utility class that provides operations related to element imports.
 */
public final class ElementImportOperations
	extends UML2Operations {

	/**
	 * Constructs a new Element Import Operations. This constructor should
	 * never be called because this is a static utility class.
	 */
	private ElementImportOperations() {
		super();
	}

	public static String getName(ElementImport elementImport) {
		return isEmpty(elementImport.getAlias())
			? (null == elementImport.getImportedElement()
				? EMPTY_STRING : elementImport.getImportedElement().getName())
			: elementImport.getAlias();
	}

}