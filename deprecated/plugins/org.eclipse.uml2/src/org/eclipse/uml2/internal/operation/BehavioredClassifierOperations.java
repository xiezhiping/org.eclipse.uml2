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
 * $Id: BehavioredClassifierOperations.java,v 1.4 2005/04/06 19:59:37 khussey Exp $
 */
package org.eclipse.uml2.internal.operation;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import org.eclipse.uml2.BehavioredClassifier;
import org.eclipse.uml2.Classifier;
import org.eclipse.uml2.Implementation;
import org.eclipse.uml2.Interface;
import org.eclipse.uml2.UML2Package;

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
			.createImplementation(UML2Package.eINSTANCE.getImplementation());
		implementation.setContract(contract);

		implementation.setRealizingClassifier(contract); // constraint

		return implementation;
	}

}