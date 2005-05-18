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
 * $Id: AssociationOperations.java,v 1.3 2005/05/18 16:38:31 khussey Exp $
 */
package org.eclipse.uml2.internal.operation;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

import org.eclipse.uml2.Association;
import org.eclipse.uml2.Property;
import org.eclipse.uml2.Type;

/**
 * A static utility class that provides operations related to '<em><b>Association</b></em>'
 * model objects.
 */
public final class AssociationOperations
		extends UML2Operations {

	public static final String copyright = "Copyright (c) IBM Corporation and others."; //$NON-NLS-1$

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

} // AssociationOperations