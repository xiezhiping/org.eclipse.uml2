/*
 * Copyright (c) 2006 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *
 * $Id: ConnectableElementOperations.java,v 1.1 2006/03/28 18:26:14 khussey Exp $
 */
package org.eclipse.uml2.uml.internal.operations;

import java.util.Collection;
import java.util.Iterator;

import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.UniqueEList;
import org.eclipse.uml2.uml.BehavioredClassifier;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.Component;
import org.eclipse.uml2.uml.ConnectableElement;
import org.eclipse.uml2.uml.Interface;
import org.eclipse.uml2.uml.Port;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.Type;

/**
 * A static utility class that provides operations related to '<em><b>Connectable Element</b></em>' model objects.
 */
public class ConnectableElementOperations
		extends NamedElementOperations {

	protected ConnectableElementOperations() {
		super();
	}

	protected static EList getRequiredInterfaces(
			ConnectableElement connectableElement) {

		if (connectableElement instanceof Port) {
			Collection requireds = ((Port) connectableElement).getRequireds();
			EList requiredInterfaces = new UniqueEList.FastCompare(requireds);

			for (Iterator r = requireds.iterator(); r.hasNext();) {
				ClassifierOperations.allParents((Interface) r.next(),
					requiredInterfaces);
			}

			return requiredInterfaces;
		} else if (connectableElement instanceof Property) {
			Type type = ((Property) connectableElement).getType();

			if (type instanceof Component) {
				return ((Component) type).getRequireds();
			} else if (type instanceof Classifier) {
				return ((Classifier) type).getAllUsedInterfaces();
			}
		}

		return ECollections.EMPTY_ELIST;
	}

	protected static EList getProvidedInterfaces(
			ConnectableElement connectableElement) {

		if (connectableElement instanceof Port) {
			Collection provideds = ((Port) connectableElement).getProvideds();
			EList providedInterfaces = new UniqueEList.FastCompare(provideds);

			for (Iterator p = provideds.iterator(); p.hasNext();) {
				ClassifierOperations.allParents((Interface) p.next(),
					providedInterfaces);
			}

			return providedInterfaces;
		} else if (connectableElement instanceof Property) {
			Type type = ((Property) connectableElement).getType();

			if (type instanceof Component) {
				Collection provideds = ((Component) type).getProvideds();
				EList providedInterfaces = new UniqueEList.FastCompare(
					provideds);

				for (Iterator p = provideds.iterator(); p.hasNext();) {
					ClassifierOperations.allParents((Interface) p.next(),
						providedInterfaces);
				}

				return providedInterfaces;
			} else if (type instanceof Interface) {
				EList providedInterfaces = new UniqueEList.FastCompare();
				providedInterfaces.add(type);
				ClassifierOperations.allParents((Interface) type,
					providedInterfaces);
				return providedInterfaces;
			} else if (type instanceof BehavioredClassifier) {
				return ((BehavioredClassifier) type)
					.getAllImplementedInterfaces();
			}
		}

		return ECollections.EMPTY_ELIST;
	}

} // ConnectableElementOperations
