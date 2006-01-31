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
 * $Id: StateMachineOperations.java,v 1.2 2006/01/31 20:35:03 khussey Exp $
 */
package org.eclipse.uml2.internal.operation;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.UniqueEList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.uml2.BehavioredClassifier;
import org.eclipse.uml2.RedefinableElement;
import org.eclipse.uml2.StateMachine;

/**
 * A static utility class that provides operations related to '<em><b>State Machine</b></em>'
 * model objects.
 */
public final class StateMachineOperations
		extends UML2Operations {

	public static final String copyright = "Copyright (c) IBM Corporation and others."; //$NON-NLS-1$

	private StateMachineOperations() {
		super();
	}

	public static EList getRedefinitionContexts(
			RedefinableElement redefinableElement) {
		EList redefinitionContexts = new UniqueEList.FastCompare();

		if (redefinableElement != null) {
			EObject eContainer = redefinableElement.eContainer();

			while (null != eContainer
				&& !StateMachine.class.isInstance(eContainer)) {

				eContainer = eContainer.eContainer();
			}

			if (null != eContainer) {
				StateMachine containingStateMachine = (StateMachine) eContainer;
				BehavioredClassifier context = containingStateMachine
					.getContext();

				redefinitionContexts.add(context != null
					&& containingStateMachine.general().isEmpty()
					? context
					: containingStateMachine);
			}
		}

		return redefinitionContexts;
	}

} // StateMachineOperations
