/*
 * Copyright (c) 2004, 2005 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *
 * $Id: BehavioredClassifierOperations.java,v 1.6 2005/06/15 17:18:21 khussey Exp $
 */
package org.eclipse.uml2.internal.operation;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import org.eclipse.uml2.BehavioredClassifier;
import org.eclipse.uml2.Classifier;
import org.eclipse.uml2.Implementation;
import org.eclipse.uml2.Interface;

/**
 * A static utility class that provides operations related to '<em><b>Behaviored Classifier</b></em>'
 * model objects.
 */
public final class BehavioredClassifierOperations
		extends UML2Operations {

	public static final String copyright = "Copyright (c) IBM Corporation and others."; //$NON-NLS-1$

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

				Interface contract = ((Implementation) implementations.next())
					.getContract();

				if (null != contract) {
					implementedInterfaces.add(contract);
				}
			}
		}

		return implementedInterfaces;
	}

	/**
	 * Retrieves the interfaces on which the specified behaviored classifier or
	 * any of its parents has an implementation dependency.
	 * 
	 * @param behavioredClassifier
	 *            The behaviored classfier for which to retrieve the implemented
	 *            interfaces.
	 * @return The interfaces implemented by the specified behaviored classifier
	 *         or any of its parents.
	 */
	public static Set getAllImplementedInterfaces(
			BehavioredClassifier behavioredClassifier) {
		Set allImplementedInterfaces = new HashSet();

		if (null != behavioredClassifier) {
			allImplementedInterfaces.addAll(behavioredClassifier
				.getImplementedInterfaces());

			for (Iterator allParents = behavioredClassifier.allParents()
				.iterator(); allParents.hasNext();) {

				Classifier parent = (Classifier) allParents.next();

				if (BehavioredClassifier.class.isInstance(parent)) {
					allImplementedInterfaces
						.addAll(((BehavioredClassifier) parent)
							.getImplementedInterfaces());
				}
			}
		}

		return allImplementedInterfaces;
	}

	/**
	 * Creates an implementation where the specified behaviored classifier is
	 * the implementing classifier and the specified interface is the contract.
	 * 
	 * @param behavioredClassifier
	 *            The implementing classifier for the implementation.
	 * @param contract
	 *            The contract for the implementation.
	 * @return The new implementation.
	 * @exception IllegalArgumentException
	 *                If the behaviored classifier or one of its parents is
	 *                already an implementing classifier of the interface.
	 */
	public static Implementation createImplementation(
			BehavioredClassifier behavioredClassifier, Interface contract) {

		if (null == behavioredClassifier) {
			throw new IllegalArgumentException(String
				.valueOf(behavioredClassifier));
		}

		if (null == contract
			|| behavioredClassifier.getAllImplementedInterfaces().contains(
				contract)) {

			throw new IllegalArgumentException(String.valueOf(contract));
		}

		Implementation implementation = behavioredClassifier
			.createImplementation();
		implementation.setContract(contract);

		implementation.setRealizingClassifier(contract); // constraint

		return implementation;
	}

} // BehavioredClassifierOperations
