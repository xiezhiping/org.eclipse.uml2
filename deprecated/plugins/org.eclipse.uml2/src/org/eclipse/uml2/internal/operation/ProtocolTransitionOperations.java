/*
 * Copyright (c) 2005 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *
 * $Id: ProtocolTransitionOperations.java,v 1.1 2005/05/25 15:21:32 khussey Exp $
 */
package org.eclipse.uml2.internal.operation;

import java.util.Iterator;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.UniqueEList;
import org.eclipse.uml2.CallTrigger;
import org.eclipse.uml2.Operation;
import org.eclipse.uml2.ProtocolTransition;
import org.eclipse.uml2.Trigger;

/**
 * A static utility class that provides operations related to '<em><b>Protocol Transition</b></em>'
 * model objects.
 */
public final class ProtocolTransitionOperations
		extends UML2Operations {

	public static final String copyright = "Copyright (c) IBM Corporation and others."; //$NON-NLS-1$

	private ProtocolTransitionOperations() {
		super();
	}

	public static EList getReferreds(ProtocolTransition protocolTransition) {
		EList referreds = new UniqueEList();

		if (protocolTransition != null) {

			for (Iterator triggers = protocolTransition.getTriggers()
				.iterator(); triggers.hasNext();) {

				Trigger trigger = (Trigger) triggers.next();

				if (CallTrigger.class.isInstance(trigger)) {
					Operation operation = ((CallTrigger) trigger)
						.getOperation();

					if (operation != null) {
						referreds.add(operation);
					}
				}
			}
		}

		return referreds;
	}

} // ProtocolTransitionOperations
