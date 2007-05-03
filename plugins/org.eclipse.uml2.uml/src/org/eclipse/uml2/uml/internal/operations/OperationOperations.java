/*
 * Copyright (c) 2005, 2007 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *
 * $Id: OperationOperations.java,v 1.14 2007/05/03 21:11:52 khussey Exp $
 */
package org.eclipse.uml2.uml.internal.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.UniqueEList;

import org.eclipse.uml2.uml.Operation;
import org.eclipse.uml2.uml.Parameter;
import org.eclipse.uml2.uml.ParameterDirectionKind;
import org.eclipse.uml2.uml.RedefinableElement;
import org.eclipse.uml2.uml.Type;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.UMLPlugin;

import org.eclipse.uml2.uml.util.UMLValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Operation</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.Operation#validateAtMostOneReturn(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate At Most One Return</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Operation#validateOnlyBodyForQuery(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Only Body For Query</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Operation#getLower() <em>Get Lower</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Operation#getUpper() <em>Get Upper</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Operation#setIsOrdered(boolean) <em>Set Is Ordered</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Operation#setIsUnique(boolean) <em>Set Is Unique</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Operation#setLower(int) <em>Set Lower</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Operation#setType(org.eclipse.uml2.uml.Type) <em>Set Type</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Operation#setUpper(int) <em>Set Upper</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Operation#getReturnResult() <em>Get Return Result</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Operation#isOrdered() <em>Is Ordered</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Operation#isUnique() <em>Is Unique</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Operation#lowerBound() <em>Lower Bound</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Operation#upperBound() <em>Upper Bound</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Operation#getType() <em>Get Type</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Operation#returnResult() <em>Return Result</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Operation#isConsistentWith(org.eclipse.uml2.uml.RedefinableElement) <em>Is Consistent With</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OperationOperations
		extends BehavioralFeatureOperations {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OperationOperations() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An operation can have at most one return parameter; i.e., an owned parameter with the direction set to 'return'
	 * self.ownedParameter->select(par | par.direction = #return)->size() <= 1
	 * @param operation The receiving '<em><b>Operation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateAtMostOneReturn(Operation operation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics
					.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						UMLValidator.DIAGNOSTIC_SOURCE,
						UMLValidator.OPERATION__AT_MOST_ONE_RETURN,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE
							.getString(
								"_UI_GenericInvariant_diagnostic", new Object[]{"validateAtMostOneReturn", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(operation, context)}), //$NON-NLS-1$ //$NON-NLS-2$
						new Object[]{operation}));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A bodyCondition can only be specified for a query operation.
	 * bodyCondition->notEmpty() implies isQuery
	 * @param operation The receiving '<em><b>Operation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static boolean validateOnlyBodyForQuery(Operation operation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = true;

		if (operation.getBodyCondition() != null && !operation.isQuery()) {
			result = false;

			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(Diagnostic.WARNING,
					UMLValidator.DIAGNOSTIC_SOURCE,
					UMLValidator.OPERATION__ONLY_BODY_FOR_QUERY,
					UMLPlugin.INSTANCE.getString(
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
	 * If this operation has a return parameter, isOrdered equals the value of isOrdered for that parameter. Otherwise isOrdered is false.
	 * result = if returnResult()->notEmpty() then returnResult()->any().isOrdered else false endif
	 * @param operation The receiving '<em><b>Operation</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static boolean isOrdered(Operation operation) {
		Parameter returnResult = operation.getReturnResult();
		return returnResult != null
			? returnResult.isOrdered()
			: false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If this operation has a return parameter, isUnique equals the value of isUnique for that parameter. Otherwise isUnique is true.
	 * result = if returnResult()->notEmpty() then returnResult()->any().isUnique else true endif
	 * @param operation The receiving '<em><b>Operation</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static boolean isUnique(Operation operation) {
		Parameter returnResult = operation.getReturnResult();
		return returnResult != null
			? returnResult.isUnique()
			: true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If this operation has a return parameter, lower equals the value of lower for that parameter. Otherwise lower is not defined.
	 * result = if returnResult()->notEmpty() then returnResult()->any().lower else Set{} endif
	 * @param operation The receiving '<em><b>Operation</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static int lowerBound(Operation operation) {
		Parameter returnResult = operation.getReturnResult();
		return returnResult != null
			? returnResult.lowerBound()
			: 1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If this operation has a return parameter, upper equals the value of upper for that parameter. Otherwise upper is not defined.
	 * result = if returnResult()->notEmpty() then returnResult()->any().upper else Set{} endif
	 * @param operation The receiving '<em><b>Operation</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static int upperBound(Operation operation) {
		Parameter returnResult = operation.getReturnResult();
		return returnResult != null
			? returnResult.upperBound()
			: 1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If this operation has a return parameter, type equals the value of type for that parameter. Otherwise type is not defined.
	 * result = if returnResult()->notEmpty() then returnResult()->any().type else Set{} endif
	 * @param operation The receiving '<em><b>Operation</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static Type getType(Operation operation) {
		Parameter returnResult = operation.getReturnResult();
		return returnResult != null
			? (Type) returnResult.eGet(UMLPackage.Literals.TYPED_ELEMENT__TYPE,
				false)
			: null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The query returnResult() returns the set containing the return parameter of the Operation if one exists, otherwise, it returns an empty set
	 * result = ownedParameter->select (par | par.direction = #return)
	 * @param operation The receiving '<em><b>Operation</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static EList<Parameter> returnResult(Operation operation) {
		EList<Parameter> returnResult = new UniqueEList.FastCompare<Parameter>();

		for (Parameter ownedParameter : operation.getOwnedParameters()) {

			if (ownedParameter.getDirection() == ParameterDirectionKind.RETURN_LITERAL) {
				returnResult.add(ownedParameter);
			}
		}

		return ECollections.unmodifiableEList(returnResult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public static int getLower(Operation operation) {
		return operation.lowerBound();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public static int getUpper(Operation operation) {
		return operation.upperBound();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public static void setIsOrdered(Operation operation, boolean newIsOrdered) {
		Parameter returnResult = operation.getReturnResult();

		if (returnResult == null) {
			returnResult = operation.createOwnedParameter(null, null);
			returnResult.setDirection(ParameterDirectionKind.RETURN_LITERAL);
		}

		returnResult.setIsOrdered(newIsOrdered);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public static void setIsUnique(Operation operation, boolean newIsUnique) {
		Parameter returnResult = operation.getReturnResult();

		if (returnResult == null) {
			returnResult = operation.createOwnedParameter(null, null);
			returnResult.setDirection(ParameterDirectionKind.RETURN_LITERAL);
		}

		returnResult.setIsUnique(newIsUnique);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public static void setLower(Operation operation, int newLower) {
		Parameter returnResult = operation.getReturnResult();

		if (returnResult == null) {
			returnResult = operation.createOwnedParameter(null, null);
			returnResult.setDirection(ParameterDirectionKind.RETURN_LITERAL);
		}

		returnResult.setLower(newLower);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public static void setUpper(Operation operation, int newUpper) {
		Parameter returnResult = operation.getReturnResult();

		if (returnResult == null) {
			returnResult = operation.createOwnedParameter(null, null);
			returnResult.setDirection(ParameterDirectionKind.RETURN_LITERAL);
		}

		returnResult.setUpper(newUpper);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Retrieves the (only) return result parameter for this operation.
	 * @param operation The receiving '<em><b>Operation</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static Parameter getReturnResult(Operation operation) {

		for (Parameter ownedParameter : operation.getOwnedParameters()) {

			if (ownedParameter.getDirection() == ParameterDirectionKind.RETURN_LITERAL) {
				return ownedParameter;
			}
		}

		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public static void setType(Operation operation, Type newType) {
		Parameter returnResult = operation.getReturnResult();

		if (returnResult == null) {
			returnResult = operation.createOwnedParameter(null, null);
			returnResult.setDirection(ParameterDirectionKind.RETURN_LITERAL);
		}

		returnResult.setType(newType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The query isConsistentWith() specifies, for any two Operations in a context in which redefinition is possible, whether redefinition would be consistent in the sense of maintaining type covariance. Other senses of consistency may be required, for example to determine consistency in the sense of contravariance. Users may define alternative queries under names different from 'isConsistentWith()', as for example, users may define a query named 'isContravariantWith()'.
	 * A redefining operation is consistent with a redefined operation if it has the same number of owned parameters, and the type of each owned parameter conforms to the type of the corresponding redefined parameter. 
	 * redefinee.isRedefinitionContextValid(self)
	 * result = (redefinee.oclIsKindOf(Operation) and
	 * let op: Operation = redefinee.oclAsType(Operation) in
	 * self.ownedParameter.size() = op.ownedParameter.size() and
	 * forAll(i | op.ownedParameter[i].type.conformsTo(self.ownedParameter[i].type))
	 * )
	 * @param operation The receiving '<em><b>Operation</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static boolean isConsistentWith(Operation operation,
			RedefinableElement redefinee) {

		if (redefinee instanceof Operation
			&& redefinee.isRedefinitionContextValid(operation)) {

			Operation op = (Operation) redefinee;

			EList<Parameter> ownedParameters = operation.getOwnedParameters();
			int ownedParametersSize = ownedParameters.size();
			EList<Parameter> opOwnedParameters = op.getOwnedParameters();

			EList<Parameter> returnResult = operation.returnResult();
			int returnResultSize = returnResult.size();
			EList<Parameter> opReturnResult = op.returnResult();

			if (ownedParametersSize == opOwnedParameters.size()
				&& returnResultSize == opReturnResult.size()) {

				for (int i = 0; i < ownedParametersSize; i++) {
					Type opOwnedParameterType = opOwnedParameters.get(i)
						.getType();
					Type ownedParameterType = ownedParameters.get(i).getType();

					if (opOwnedParameterType == null
						? ownedParameterType != null
						: !opOwnedParameterType.conformsTo(ownedParameterType)) {

						return false;
					}
				}

				for (int i = 0; i < returnResultSize; i++) {
					Type opReturnResultType = opReturnResult.get(i).getType();
					Type returnResultType = returnResult.get(i).getType();

					if (opReturnResultType == null
						? returnResultType != null
						: !opReturnResultType.conformsTo(returnResultType)) {

						return false;
					}
				}

				return true;
			}
		}

		return false;
	}

} // OperationOperations
