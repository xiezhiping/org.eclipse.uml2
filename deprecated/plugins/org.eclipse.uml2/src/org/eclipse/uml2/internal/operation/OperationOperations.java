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
 * $Id: OperationOperations.java,v 1.7 2005/03/15 18:44:46 khussey Exp $
 */
package org.eclipse.uml2.internal.operation;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.uml2.Classifier;
import org.eclipse.uml2.Operation;
import org.eclipse.uml2.Parameter;
import org.eclipse.uml2.RedefinableElement;
import org.eclipse.uml2.Type;
import org.eclipse.uml2.util.UML2Validator;
import org.eclipse.uml2.UML2Plugin;

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

	/**
	 * If this operation has a single return result, type equals the value of
	 * type for that parameter. Otherwise type is not defined.
	 *  
	 */
	public static boolean validateTypeOfResult(Operation operation,
			DiagnosticChain diagnostics, Map context) {
		boolean result = true;

		if (!safeEquals(operation.getType(), 1 == operation.getReturnResults()
			.size()
			? ((Parameter) operation.getReturnResults().get(0)).getType()
			: null)) {

			result = false;

			if (null != diagnostics) {
				diagnostics
					.add(new BasicDiagnostic(Diagnostic.ERROR,
							UML2Validator.DIAGNOSTIC_SOURCE,
							UML2Validator.OPERATION__TYPE_OF_RESULT,
							UML2Plugin.INSTANCE.getString(
								"_UI_Operation_TypeOfResult_diagnostic", //$NON-NLS-1$
								getMessageSubstitutions(context, operation)),
							new Object[] {operation}));
			}
		}

		return result;
	}

	/**
	 * A body condition can only be specified for a query operation.
	 *  
	 */
	public static boolean validateOnlyBodyForQuery(Operation operation,
			DiagnosticChain diagnostics, Map context) {
		boolean result = true;

		if (null != operation.getBodyCondition() && !operation.isQuery()) {
			result = false;

			if (null != diagnostics) {
				diagnostics
					.add(new BasicDiagnostic(
							Diagnostic.WARNING,
							UML2Validator.DIAGNOSTIC_SOURCE,
							UML2Validator.OPERATION__ONLY_BODY_FOR_QUERY,
							UML2Plugin.INSTANCE.getString(
								"_UI_Operation_OnlyBodyForQuery_diagnostic", //$NON-NLS-1$
								getMessageSubstitutions(context, operation)),
							new Object[] {operation}));
			}
		}

		return result;
	}

}