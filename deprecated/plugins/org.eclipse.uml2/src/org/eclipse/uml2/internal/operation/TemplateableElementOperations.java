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
package org.eclipse.uml2.internal.operation;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import org.eclipse.uml2.Element;
import org.eclipse.uml2.ParameterableElement;
import org.eclipse.uml2.TemplateableElement;

/**
 * A static utility class that provides operations related to templateable
 * elements.
 */
public final class TemplateableElementOperations
	extends UML2Operations {

	/**
	 * Constructs a new Templateable Element Operations. This constructor
	 * should never be called because this is a static utility class.
	 */
	private TemplateableElementOperations() {
		super();
	}

	public static Set parameterableElements(
			TemplateableElement templateableElement) {
		Set parameterableElements = new HashSet();

		for (Iterator allOwnedElements = templateableElement.allOwnedElements()
			.iterator(); allOwnedElements.hasNext();) {

			Element ownedElement = (Element) allOwnedElements.next();

			if (ParameterableElement.class.isInstance(ownedElement)) {
				parameterableElements.add(ownedElement);
			}
		}

		return parameterableElements;
	}

}