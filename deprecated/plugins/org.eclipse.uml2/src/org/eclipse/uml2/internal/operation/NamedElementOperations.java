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
 * $Id: NamedElementOperations.java,v 1.2 2004/04/10 04:09:50 khussey Exp $
 */
package org.eclipse.uml2.internal.operation;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.uml2.NamedElement;
import org.eclipse.uml2.Namespace;

/**
 * A static utility class that provides operations related to named elements.
 */
public final class NamedElementOperations
	extends UML2Operations {

	/**
	 * Constructs a new Named Element Operations. This constructor should never
	 * be called because this is a static utility class.
	 */
	private NamedElementOperations() {
		super();
	}

	public static List allNamespaces(NamedElement namedElement) {
		List allNamespaces = new ArrayList();

		if (null != namedElement.getNamespace()) {
			allNamespaces.addAll(namedElement.getNamespace().allNamespaces());
			allNamespaces.add(0, namedElement.getNamespace());
		}

		return allNamespaces;
	}

	public static boolean isDistinguishableFrom(NamedElement namedElement,
			NamedElement n, Namespace ns) {

		if (n.eClass().isSuperTypeOf(namedElement.eClass())
			|| namedElement.eClass().isSuperTypeOf(n.eClass())) {

			for (Iterator namesOfMember = ns.getNamesOfMember(namedElement)
				.iterator(); namesOfMember.hasNext();) {

				if (ns.getNamesOfMember(n).contains(namesOfMember.next())) {
					return false;
				}
			}
		}

		return true;
	}

	public static String qualifiedName(NamedElement namedElement) {

		if (isEmpty(namedElement.getName())) {
			return EMPTY_STRING;
		}

		String qualifiedName = namedElement.getName();

		for (Iterator allNamespaces = namedElement.allNamespaces().iterator(); allNamespaces
			.hasNext();) {

			Namespace namespace = (Namespace) allNamespaces.next();

			if (isEmpty(namespace.getName())) {
				return EMPTY_STRING;
			} else {
				qualifiedName = namespace.getName() + namedElement.separator()
					+ qualifiedName;
			}
		}

		return qualifiedName;
	}

	public static String separator(NamedElement namedElement) {
		return NamedElement.SEPARATOR;
	}

}