/*
 * Copyright (c) 2005, 2006 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *
 * $Id: StructuredClassifierOperations.java,v 1.2 2006/01/31 20:35:03 khussey Exp $
 */
package org.eclipse.uml2.internal.operation;

import java.util.Iterator;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.UniqueEList;
import org.eclipse.uml2.Property;
import org.eclipse.uml2.StructuredClassifier;

/**
 * A static utility class that provides operations related to '<em><b>Structured Classifier</b></em>'
 * model objects.
 */
public final class StructuredClassifierOperations
		extends UML2Operations {

	public static final String copyright = "Copyright (c) IBM Corporation and others."; //$NON-NLS-1$

	private StructuredClassifierOperations() {
		super();
	}

	public static EList getParts(StructuredClassifier structuredClassifier) {
		EList parts = new UniqueEList.FastCompare();

		if (structuredClassifier != null) {

			for (Iterator ownedAttributes = structuredClassifier
				.getOwnedAttributes().iterator(); ownedAttributes.hasNext();) {

				Property ownedAttribute = (Property) ownedAttributes.next();

				if (ownedAttribute.isComposite()) {
					parts.add(ownedAttribute);
				}
			}
		}

		return parts;
	}

} // StructuredClassifierOperations
