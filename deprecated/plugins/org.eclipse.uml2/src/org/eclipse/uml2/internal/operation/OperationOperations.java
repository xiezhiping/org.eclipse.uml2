/*
 * Copyright (c) 2003, 2004 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Common Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/cpl-v10.html
 *
 * Contributors:
 *   IBM - Initial API and implementation
 */
package org.eclipse.uml2.internal.operation;

import org.eclipse.uml2.Classifier;
import org.eclipse.uml2.Operation;
import org.eclipse.uml2.Parameter;
import org.eclipse.uml2.RedefinableElement;
import org.eclipse.uml2.Type;

/**
 * A static utility class that provides operations related to operations.
 */
public final class OperationOperations
	extends UML2Operations {

	/**
	 * Constructs a new Operation Operations. This constructor should never be
	 * called because this is a static utility class.
	 */
	private OperationOperations() {
		super();
	}

	public static boolean isConsistentWith(Operation operation,
			RedefinableElement redefinee) {

		if (redefinee.isRedefinitionContextValid(operation)
			&& Operation.class.isInstance(redefinee)) {

			Operation op = (Operation) redefinee;

			if (operation.getFormalParameters().size() == op
				.getFormalParameters().size()
				&& operation.getReturnResults().size() == op.getReturnResults()
					.size()) {

				for (int i = 0; i < operation.getFormalParameters().size(); i++) {
					Type opFormalParameterType = ((Parameter) op
						.getFormalParameters().get(i)).getType();
					Type operationFormalParameterType = ((Parameter) operation
						.getFormalParameters().get(i)).getType();

					if (null == opFormalParameterType
						? null != operationFormalParameterType
						: !opFormalParameterType
							.conformsTo(operationFormalParameterType)) {

						return false;
					}
				}

				for (int i = 0; i < operation.getReturnResults().size(); i++) {
					Type opReturnResultType = ((Parameter) op
						.getReturnResults().get(i)).getType();
					Type operationReturnResultType = ((Parameter) operation
						.getReturnResults().get(i)).getType();

					if (null == opReturnResultType
						? null != operationReturnResultType
						: !opReturnResultType
							.conformsTo(operationReturnResultType)) {

						return false;
					}
				}

				return true;
			}
		}

		return false;
	}

	public static boolean isOrdered(Operation operation) {
		return 1 == operation.getReturnResults().size()
			? ((Parameter) operation.getReturnResults().get(0)).isOrdered()
			: false;
	}

	public static boolean isUnique(Operation operation) {
		return 1 == operation.getReturnResults().size()
			? ((Parameter) operation.getReturnResults().get(0)).isUnique()
			: true;
	}

	public static int lower(Operation operation) {
		return 1 == operation.getReturnResults().size()
			? ((Parameter) operation.getReturnResults().get(0)).lower() : 1;
	}

	public static Classifier type(Operation operation) {
		return 1 == operation.getReturnResults().size()
			? (Classifier) ((Parameter) operation.getReturnResults().get(0))
				.getType() : null;
	}

	public static int upper(Operation operation) {
		return 1 == operation.getReturnResults().size()
			? ((Parameter) operation.getReturnResults().get(0)).upper() : 1;
	}

}