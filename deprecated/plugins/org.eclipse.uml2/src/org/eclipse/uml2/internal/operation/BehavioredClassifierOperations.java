/*
 * Copyright (c) 2004 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *
 * $Id: BehavioredClassifierOperations.java,v 1.3 2005/03/15 18:44:46 khussey Exp $
 */
package org.eclipse.uml2.internal.operation;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import org.eclipse.uml2.BehavioredClassifier;
import org.eclipse.uml2.Implementation;

/**
 * A static utility class that provides operations related to behaviored
 * classifiers.
 */
public final class BehavioredClassifierOperations
	extends UML2Operations {

	/**
	 * Constructs a new Behaviored Classifier Operations. This constructor
	 * should never be called because this is a static utility class.
	 */
	private BehavioredClassifierOperations() {
		super();
	}

	/**
	 * Retrieves the interfaces on which the specified behaviored classifier has
	 * an implementation dependency.
	 * 
	 * @param behavioredClassifier
	 *            The behaviored classfier for which to retrieve the implemented
	 *            interfaces.
	 * @return The interfaces implemented by the specified behaviored
	 *         classifier.
	 */
	public static Set getImplementedInterfaces(
			BehavioredClassifier behavioredClassifier) {
		Set implementedInterfaces = new HashSet();

		if (null != behavioredClassifier) {

			for (Iterator implementations = behavioredClassifier
				.getImplementations().iterator(); implementations.hasNext();) {

				Implementation implementation = (Implementation) implementations
					.next();

				if (null != implementation.getContract()) {
					implementedInterfaces.add(implementation.getContract());
				}
			}
		}

		return implementedInterfaces;
	}

}