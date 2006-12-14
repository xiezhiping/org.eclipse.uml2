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
 * $Id: ConnectableElementOperations.java,v 1.4 2006/12/14 15:49:25 khussey Exp $
 */
package org.eclipse.uml2.uml.internal.operations;

import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.UniqueEList;
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

	protected static EList<Interface> getRequiredInterfaces(
			ConnectableElement connectableElement) {
		EList<Interface> requiredInterfaces = new UniqueEList.FastCompare<Interface>();

		if (connectableElement instanceof Port) {
			requiredInterfaces.addAll(((Port) connectableElement)
				.getRequireds());
		} else if (connectableElement instanceof Property) {
			Type type = connectableElement.getType();

			if (type instanceof Component) {
				ComponentOperations.getAllRequireds((Component) type,
					requiredInterfaces);
			} else if (type instanceof Classifier) {
				Classifier classifier = (Classifier) type;
				ComponentOperations.usedInterfaces(null, classifier, true,
					requiredInterfaces);

				for (Classifier parent : classifier.allParents()) {
					ComponentOperations.usedInterfaces(null, parent, true,
						requiredInterfaces);
				}
			}
		}

		for (int i = 0, size = requiredInterfaces.size(); i < size; i++) {

			for (Classifier parent : requiredInterfaces.get(i).allParents()) {

				if (parent instanceof Interface) {
					requiredInterfaces.add((Interface) parent);
				}
			}
		}

		return ECollections.unmodifiableEList(requiredInterfaces);
	}

	protected static EList<Interface> getProvidedInterfaces(
			ConnectableElement connectableElement) {
		EList<Interface> providedInterfaces = new UniqueEList.FastCompare<Interface>();

		if (connectableElement instanceof Port) {
			providedInterfaces.addAll(((Port) connectableElement)
				.getProvideds());
		} else if (connectableElement instanceof Property) {
			Type type = ((Property) connectableElement).getType();

			if (type instanceof Component) {
				ComponentOperations.getAllProvideds((Component) type,
					providedInterfaces);
			} else if (type instanceof Interface) {
				providedInterfaces.add((Interface) type);
			} else if (type instanceof Classifier) {
				Classifier classifier = (Classifier) type;
				ComponentOperations.realizedInterfaces(null, classifier, true,
					providedInterfaces);

				for (Classifier parent : classifier.allParents()) {
					ComponentOperations.realizedInterfaces(null, parent, true,
						providedInterfaces);
				}
			}
		}

		for (int i = 0, size = providedInterfaces.size(); i < size; i++) {

			for (Classifier parent : providedInterfaces.get(i).allParents()) {

				if (parent instanceof Interface) {
					providedInterfaces.add((Interface) parent);
				}
			}
		}

		return ECollections.unmodifiableEList(providedInterfaces);
	}

} // ConnectableElementOperations
