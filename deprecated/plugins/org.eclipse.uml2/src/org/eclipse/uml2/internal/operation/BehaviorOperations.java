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
 * $Id: BehaviorOperations.java,v 1.1 2005/05/25 15:21:32 khussey Exp $
 */
package org.eclipse.uml2.internal.operation;

import java.util.Iterator;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.UniqueEList;

import org.eclipse.uml2.Behavior;
import org.eclipse.uml2.Parameter;
import org.eclipse.uml2.ParameterDirectionKind;

/**
 * A static utility class that provides operations related to '<em><b>Behavior</b></em>'
 * model objects.
 */
public final class BehaviorOperations
		extends UML2Operations {

	public static final String copyright = "Copyright (c) IBM Corporation and others."; //$NON-NLS-1$

	private BehaviorOperations() {
		super();
	}

	public static EList getFormalParameters(Behavior behavior) {
		EList formalParameters = new UniqueEList();

		if (behavior != null) {

			for (Iterator parameters = behavior.getParameters().iterator(); parameters
				.hasNext();) {

				Parameter parameter = (Parameter) parameters.next();

				if (!ParameterDirectionKind.RETURN_LITERAL.equals(parameter
					.getDirection())) {

					formalParameters.add(parameter);
				}
			}
		}

		return formalParameters;
	}

	public static EList getReturnResults(Behavior behavior) {
		EList returnResults = new UniqueEList();

		if (behavior != null) {

			for (Iterator parameters = behavior.getParameters().iterator(); parameters
				.hasNext();) {

				Parameter parameter = (Parameter) parameters.next();

				if (ParameterDirectionKind.RETURN_LITERAL.equals(parameter
					.getDirection())) {

					returnResults.add(parameter);
				}
			}
		}

		return returnResults;
	}

} // BehaviorOperations
