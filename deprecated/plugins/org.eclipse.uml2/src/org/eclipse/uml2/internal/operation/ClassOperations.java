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

import org.eclipse.uml2.NamedElement;
import org.eclipse.uml2.RedefinableElement;

/**
 * A static utility class that provides operations related to classes.
 */
public final class ClassOperations
	extends UML2Operations {

	/**
	 * Constructs a new Class Operations. This constructor should never be
	 * called because this is a static utility class.
	 */
	private ClassOperations() {
		super();
	}

	public static Set inherit(org.eclipse.uml2.Class class_, Set inhs) {
		Set inherit = new HashSet();

		iLoop: for (Iterator i = inhs.iterator(); i.hasNext();) {
			NamedElement inh = (NamedElement) i.next();

			for (Iterator ownedMembers = class_.getOwnedMembers().iterator(); ownedMembers
				.hasNext();) {

				NamedElement ownedMember = (NamedElement) ownedMembers.next();

				if (RedefinableElement.class.isInstance(ownedMember)
					&& ((RedefinableElement) ownedMember)
						.getRedefinedElements().contains(inh)) {

					continue iLoop;
				}
			}

			inherit.add(inh);
		}

		return inherit;
	}

}