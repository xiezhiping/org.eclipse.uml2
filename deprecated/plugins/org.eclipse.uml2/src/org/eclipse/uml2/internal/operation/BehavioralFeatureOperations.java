/*
 * Copyright (c) 2003, 2004 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *
 * $Id: BehavioralFeatureOperations.java,v 1.3 2005/03/15 18:44:46 khussey Exp $
 */
package org.eclipse.uml2.internal.operation;

import java.util.Iterator;

import org.eclipse.uml2.BehavioralFeature;
import org.eclipse.uml2.NamedElement;
import org.eclipse.uml2.Namespace;
import org.eclipse.uml2.Parameter;

/**
 * A static utility class that provides operations related to behavioral
 * features.
 */
public final class BehavioralFeatureOperations
	extends UML2Operations {

	/**
	 * Constructs a new Behavioral Feature Operations. This constructor should
	 * never be called because this is a static utility class.
	 */
	private BehavioralFeatureOperations() {
		super();
	}

	public static boolean isDistinguishableFrom(
			BehavioralFeature behavioralFeature, NamedElement n, Namespace ns) {

		if (BehavioralFeature.class.isInstance(n)) {

			for (Iterator namesOfMember = ns
				.getNamesOfMember(behavioralFeature).iterator(); namesOfMember
				.hasNext();) {

				if (ns.getNamesOfMember(n).contains(namesOfMember.next())) {
					Iterator bfParameters = behavioralFeature.getParameters()
						.iterator();
					Iterator nParameters = ((BehavioralFeature) n)
						.getParameters().iterator();

					while (bfParameters.hasNext() && nParameters.hasNext()) {

						if (!safeEquals(((Parameter) bfParameters.next())
							.getType(), ((Parameter) nParameters.next())
							.getType())) {

							return true;
						}
					}

					return bfParameters.hasNext() || nParameters.hasNext();
				}
			}
		}

		return true;
	}

}