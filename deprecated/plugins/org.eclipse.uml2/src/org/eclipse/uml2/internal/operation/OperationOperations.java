/*
 * Copyright (c) 2003, 2005 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *
 * $Id: OperationOperations.java,v 1.9 2005/06/15 17:18:21 khussey Exp $
 */
package org.eclipse.uml2.internal.operation;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.uml2.Classifier;
import org.eclipse.uml2.Operation;
import org.eclipse.uml2.Parameter;
import org.eclipse.uml2.RedefinableElement;
import org.eclipse.uml2.Type;
import org.eclipse.uml2.UML2Plugin;

import org.eclipse.uml2.util.UML2Validator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Operation</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2.Operation#validateTypeOfResult(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Type Of Result</em>}</li>
 *   <li>{@link org.eclipse.uml2.Operation#isOrdered() <em>Is Ordered</em>}</li>
 *   <li>{@link org.eclipse.uml2.Operation#isUnique() <em>Is Unique</em>}</li>
 *   <li>{@link org.eclipse.uml2.Operation#type() <em>Type</em>}</li>
 *   <li>{@link org.eclipse.uml2.Operation#validateOnlyBodyForQuery(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Only Body For Query</em>}</li>
 *   <li>{@link org.eclipse.uml2.Operation#isConsistentWith(org.eclipse.uml2.RedefinableElement) <em>Is Consistent With</em>}</li>
 *   <li>{@link org.eclipse.uml2.Operation#upper() <em>Upper</em>}</li>
 *   <li>{@link org.eclipse.uml2.Operation#lower() <em>Lower</em>}</li>
 * </ul>
 * </p>
 *
 * @generated not
 */
public final class OperationOperations extends UML2Operations {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) IBM Corporation and others."; //$NON-NLS-1$

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private OperationOperations() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * If this operation has a single return result, type equals the value of
	 * type for that parameter. Otherwise type is not defined.
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An invariant constraint based on the following OCL expression:
	 * <code>
	 * if returnResult->size() = 1 then
	 *   type = returnResult.type
	 * else
	 *   type = nil
	 * endif
	 * 
	 * </code>
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static boolean validateTypeOfResult(Operation operation,
			DiagnosticChain diagnostics, Map context) {
		boolean result = true;

		EList returnResults = operation.getReturnResults();

		if (!safeEquals(operation.getType(), 1 == returnResults.size()
			? ((Parameter) returnResults.get(0)).getType()
			: null)) {

			result = false;

			if (null != diagnostics) {
				diagnostics.add(new BasicDiagnostic(Diagnostic.ERROR,
					UML2Validator.DIAGNOSTIC_SOURCE,
					UML2Validator.OPERATION__TYPE_OF_RESULT,
					UML2Plugin.INSTANCE.getString(
						"_UI_Operation_TypeOfResult_diagnostic", //$NON-NLS-1$
						getMessageSubstitutions(context, operation)),
					new Object[]{operation}));
			}
		}

		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A query based on the following OCL expression:
	 * <code>
	 * if returnResult->size() = 1 then returnResult->any().isOrdered else false endif
	 * </code>
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static boolean isOrdered(Operation operation) {
		EList returnResults = operation.getReturnResults();
		return 1 == returnResults.size()
			? ((Parameter) returnResults.get(0)).isOrdered()
			: false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A query based on the following OCL expression:
	 * <code>
	 *  if returnResult->size() = 1 then returnResult->any().isUnique else true endif
	 * </code>
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static boolean isUnique(Operation operation) {
		EList returnResults = operation.getReturnResults();
		return 1 == returnResults.size()
			? ((Parameter) returnResults.get(0)).isUnique()
			: true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A query based on the following OCL expression:
	 * <code>
	 * if returnResult->size() = 1 then returnResult->any().type else Set{} endif
	 * </code>
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static Classifier type(Operation operation) {
		EList returnResults = operation.getReturnResults();
		return 1 == returnResults.size()
			? (Classifier) ((Parameter) returnResults.get(0)).getType()
			: null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * A body condition can only be specified for a query operation.
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An invariant constraint based on the following OCL expression:
	 * <code>
	 * bodyCondition->notEmpty() implies isQuery
	 * </code>
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static boolean validateOnlyBodyForQuery(Operation operation, DiagnosticChain diagnostics, Map context) {
		boolean result = true;

		if (null != operation.getBodyCondition() && !operation.isQuery()) {
			result = false;

			if (null != diagnostics) {
				diagnostics.add(new BasicDiagnostic(Diagnostic.WARNING,
					UML2Validator.DIAGNOSTIC_SOURCE,
					UML2Validator.OPERATION__ONLY_BODY_FOR_QUERY,
					UML2Plugin.INSTANCE.getString(
						"_UI_Operation_OnlyBodyForQuery_diagnostic", //$NON-NLS-1$
						getMessageSubstitutions(context, operation)),
					new Object[]{operation}));
			}
		}

		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A query based on the following OCL expression:
	 * <code>
	 * if returnResult->size() = 1 then returnResult->any().lower else Set{} endif
	 * </code>
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static int lower(Operation operation) {
		EList returnResults = operation.getReturnResults();
		return 1 == returnResults.size()
			? ((Parameter) returnResults.get(0)).lower()
			: 1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A query based on the following OCL expression:
	 * <code>
	 * (redefinee.oclIsKindOf(Operation) and
	 *     let op: Operation = redefinee.oclAsType(Operation) in
	 *         self.formalParameter.size() = op.formalParameter.size() and
	 *         self.returnResult.size() = op.returnResult.size() and
	 *         forAll(i | op.formalParameter[i].type.conformsTo(self.formalParameter[i].type)) and
	 *         forAll(i | op.returnResult[i].type.conformsTo(self.returnResult[i].type))
	 * )
	 * </code>
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static boolean isConsistentWith(Operation operation, RedefinableElement redefinee) {

		if (redefinee.isRedefinitionContextValid(operation)
			&& Operation.class.isInstance(redefinee)) {

			Operation op = (Operation) redefinee;

			EList formalParameters = operation.getFormalParameters();
			int formalParametersSize = formalParameters.size();
			EList opFormalParameters = op.getFormalParameters();

			EList returnResults = operation.getReturnResults();
			int returnResultsSize = returnResults.size();
			EList opReturnResults = op.getReturnResults();

			if (formalParametersSize == opFormalParameters.size()
				&& returnResultsSize == opReturnResults.size()) {

				for (int i = 0; i < formalParametersSize; i++) {
					Type opFormalParameterType = ((Parameter) opFormalParameters
						.get(i)).getType();
					Type formalParameterType = ((Parameter) formalParameters
						.get(i)).getType();

					if (null == opFormalParameterType
						? null != formalParameterType
						: !opFormalParameterType
							.conformsTo(formalParameterType)) {

						return false;
					}
				}

				for (int i = 0; i < returnResultsSize; i++) {
					Type opReturnResultType = ((Parameter) opReturnResults
						.get(i)).getType();
					Type returnResultType = ((Parameter) returnResults.get(i))
						.getType();

					if (null == opReturnResultType
						? null != returnResultType
						: !opReturnResultType.conformsTo(returnResultType)) {

						return false;
					}
				}

				return true;
			}
		}

		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A query based on the following OCL expression:
	 * <code>
	 * if returnResult->size() = 1 then returnResult->any().upper else Set{} endif
	 * </code>
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static int upper(Operation operation) {
		EList returnResults = operation.getReturnResults();
		return 1 == returnResults.size()
			? ((Parameter) returnResults.get(0)).upper()
			: 1;
	}
} // OperationOperations