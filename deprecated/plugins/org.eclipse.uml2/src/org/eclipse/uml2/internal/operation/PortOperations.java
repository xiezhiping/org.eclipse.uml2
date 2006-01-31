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
 * $Id: PortOperations.java,v 1.3 2006/01/31 20:35:03 khussey Exp $
 */
package org.eclipse.uml2.internal.operation;

import java.util.Iterator;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.UniqueEList;
import org.eclipse.uml2.BehavioredClassifier;
import org.eclipse.uml2.Classifier;
import org.eclipse.uml2.Interface;
import org.eclipse.uml2.Port;
import org.eclipse.uml2.Type;

/**
 * A static utility class that provides operations related to '<em><b>Port</b></em>'
 * model objects.
 */
public final class PortOperations
		extends UML2Operations {

	public static final String copyright = "Copyright (c) IBM Corporation and others."; //$NON-NLS-1$

	private PortOperations() {
		super();
	}

	public static EList getProvideds(Port port) {
		EList provideds = new UniqueEList.FastCompare();

		if (port != null) {
			Type type = port.getType();

			if (Interface.class.isInstance(type)) {
				provideds.add(type);
			} else if (BehavioredClassifier.class.isInstance(type)) {
				provideds.addAll(((BehavioredClassifier) type)
					.getAllImplementedInterfaces());
			}
		}

		return provideds;
	}

	public static EList getRequireds(Port port) {
		EList requireds = new UniqueEList.FastCompare();

		if (port != null) {
			Type type = port.getType();

			if (Classifier.class.isInstance(type)) {
				Classifier classifier = (Classifier) type;

				if (!Interface.class.isInstance(classifier)) {
					requireds.addAll(classifier.getUsedInterfaces());

					for (Iterator allParents = classifier.allParents()
						.iterator(); allParents.hasNext();) {

						requireds.addAll(((Classifier) allParents.next())
							.getUsedInterfaces());
					}
				}
			}
		}

		return requireds;
	}

} // PortOperations
