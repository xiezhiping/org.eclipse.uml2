/*
 * Copyright (c) 2005 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Common Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/cpl-v10.html
 *
 * Contributors:
 *   IBM - Initial API and implementation
 *
 * $Id: AssociationOperations.java,v 1.1 2005/02/16 20:55:15 khussey Exp $
 */
package org.eclipse.uml2.internal.operation;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

import org.eclipse.uml2.Association;
import org.eclipse.uml2.Property;
import org.eclipse.uml2.Type;

/**
 * A static utility class that provides operations related to associations.
 */
public final class AssociationOperations
		extends UML2Operations {

	/**
	 * Constructs a new Association Operations. This constructor should never be
	 * called because this is a static utility class.
	 */
	private AssociationOperations() {
		super();
	}

	public static Set endType(Association association) {
		Set endType = new LinkedHashSet();

		if (null != association) {

			for (Iterator memberEnds = association.getMemberEnds().iterator(); memberEnds
				.hasNext();) {

				Type memberEndType = ((Property) memberEnds.next()).getType();

				if (null != memberEndType) {
					endType.add(memberEndType);
				}
			}
		}

		return endType;
	}

	public static boolean isBinary(Association association) {
		return null != association && 2 == association.getMemberEnds().size();
	}

}