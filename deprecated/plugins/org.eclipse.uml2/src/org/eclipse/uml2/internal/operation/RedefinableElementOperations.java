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

import java.util.Iterator;

import org.eclipse.uml2.Classifier;
import org.eclipse.uml2.RedefinableElement;

/**
 * A static utility class that provides operations related to redefinable
 * elements.
 */
public final class RedefinableElementOperations
	extends UML2Operations {

	/**
	 * Constructs a new Redefinable Element Operations. This constructor should
	 * never be called because this is a static utility class.
	 */
	private RedefinableElementOperations() {
		super();
	}

	public static boolean isConsistentWith(
			RedefinableElement redefinableElement, RedefinableElement redefinee) {
		return false;
	}

	public static boolean isRedefinitionContextValid(
			RedefinableElement redefinableElement,
			RedefinableElement redefinable) {

		for (Iterator redefinitionContexts = redefinableElement
			.getRedefinitionContexts().iterator(); redefinitionContexts
			.hasNext();) {

			Classifier redefinitionContext = (Classifier) redefinitionContexts
				.next();

			for (Iterator redefinableRedefinitionContexts = redefinable
				.getRedefinitionContexts().iterator(); redefinableRedefinitionContexts
				.hasNext();) {

				Classifier redefinableRedefinitionContext = (Classifier) redefinableRedefinitionContexts
					.next();

				if (redefinitionContext.allParents().contains(
					redefinableRedefinitionContext)) {

					return true;
				}
			}
		}
		return false;
	}

}