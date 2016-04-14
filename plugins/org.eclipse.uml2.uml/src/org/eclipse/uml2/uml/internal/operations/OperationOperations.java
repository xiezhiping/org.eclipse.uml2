/*
 * Copyright (c) 2005, 2016 IBM Corporation, CEA, and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *   Kenn Hussey (CEA) - 327039, 295864, 418466, 433204, 451350, 485756
 *
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
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.Operation#validateAtMostOneReturn(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate At Most One Return</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Operation#validateOnlyBodyForQuery(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Only Body For Query</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Operation#getReturnResult() <em>Get Return Result</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Operation#setIsOrdered(boolean) <em>Set Is Ordered</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Operation#setIsUnique(boolean) <em>Set Is Unique</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Operation#setLower(int) <em>Set Lower</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Operation#setType(org.eclipse.uml2.uml.Type) <em>Set Type</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Operation#setUpper(int) <em>Set Upper</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Operation#isOrdered() <em>Is Ordered</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Operation#isUnique() <em>Is Unique</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Operation#getLower() <em>Get Lower</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Operation#returnResult() <em>Return Result</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Operation#getType() <em>Get Type</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Operation#getUpper() <em>Get Upper</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Operation#isConsistentWith(org.eclipse.uml2.uml.RedefinableElement) <em>Is Consistent With</em>}</li>
 * </ul>
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
	 * An Operation can have at most one return parameter; i.e., an owned parameter with the direction set to 'return.'
	 * self.ownedParameter->select(direction = ParameterDirectionKind::return)->size() <= 1
	 * @param operation The receiving '<em><b>Operation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static boolean validateAtMostOneReturn(Operation operation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = true;

		int count = 0;

		for (Parameter ownedParameter : operation.getOwnedParameters()) {

			if (ownedParameter
				.getDirection() == ParameterDirectionKind.RETURN_LITERAL) {
				count++;
			}
		}

		if (count > 1) {
			result = false;

			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(Diagnostic.WARNING,
					UMLValidator.DIAGNOSTIC_SOURCE,
					UMLValidator.OPERATION__AT_MOST_ONE_RETURN,
					UMLPlugin.INSTANCE.getString(
						"_UI_Operation_AtMostOneReturn_diagnostic", //$NON-NLS-1$
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
	 * A bodyCondition can only be specified for a query Operation.
	 * bodyCondition <> null implies isQuery
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
	 * result = (if returnResult()->notEmpty() then returnResult()-> exists(isOrdered) else false endif)
	 * <p>From package UML::Classification.</p>
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
	 * result = (if returnResult()->notEmpty() then returnResult()->exists(isUnique) else true endif)
	 * @param operation The receiving '<em><b>Operation</b></em>' model object.
	 * <p>From package UML::Classification.</p>
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
	 * If this operation has a return parameter, type equals the value of type for that parameter. Otherwise type has no value.
	 * result = (if returnResult()->notEmpty() then returnResult()->any(true).type else null endif)
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
	 * result = (ownedParameter->select (direction = ParameterDirectionKind::return)->asSet())
	 * <p>From package UML::Classification.</p>
	 * @param operation The receiving '<em><b>Operation</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static EList<Parameter> returnResult(Operation operation) {
		EList<Parameter> returnResult = new UniqueEList.FastCompare<Parameter>();

		for (Parameter ownedParameter : operation.getOwnedParameters()) {

			if (ownedParameter
				.getDirection() == ParameterDirectionKind.RETURN_LITERAL) {
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
		Parameter returnResult = operation.getReturnResult();
		return returnResult != null
			? returnResult.getLower()
			: 1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public static int getUpper(Operation operation) {
		Parameter returnResult = operation.getReturnResult();
		return returnResult != null
			? returnResult.getUpper()
			: 1;
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

			if (ownedParameter
				.getDirection() == ParameterDirectionKind.RETURN_LITERAL) {
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
	 * The query isConsistentWith() specifies, for any two Operations in a context in which redefinition is possible, whether redefinition would be consistent. A redefining operation is consistent with a redefined operation if
	 * it has the same number of owned parameters, and for each parameter the following holds:
	 *
	 * - Direction, ordering and uniqueness are the same.
	 * - The corresponding types are covariant, contravariant or invariant.
	 * - The multiplicities are compatible, depending on the parameter direction. 
	 * redefiningElement.isRedefinitionContextValid(self)
	 * result = (redefiningElement.oclIsKindOf(Operation) and
	 * let op : Operation = redefiningElement.oclAsType(Operation) in
	 *     self.ownedParameter->size() = op.ownedParameter->size() and
	 *     Sequence{1..self.ownedParameter->size()}->
	 *         forAll(i |  
	 *           let redefiningParam : Parameter = op.ownedParameter->at(i),
	 *           redefinedParam : Parameter = self.ownedParameter->at(i) in
	 *             (redefiningParam.isUnique = redefinedParam.isUnique) and
	 *             (redefiningParam.isOrdered = redefinedParam. isOrdered) and
	 *             (redefiningParam.direction = redefinedParam.direction) and
	 *             (redefiningParam.type.conformsTo(redefinedParam.type) or
	 *                 redefinedParam.type.conformsTo(redefiningParam.type)) and
	 *             (redefiningParam.direction = ParameterDirectionKind::inout implies
	 *                     (redefinedParam.compatibleWith(redefiningParam) and
	 *                     redefiningParam.compatibleWith(redefinedParam))) and
	 *             (redefiningParam.direction = ParameterDirectionKind::_'in' implies
	 *                     redefinedParam.compatibleWith(redefiningParam)) and
	 *             ((redefiningParam.direction = ParameterDirectionKind::out or
	 *                 redefiningParam.direction = ParameterDirectionKind::return) implies
	 *                     redefiningParam.compatibleWith(redefinedParam))
	 *         ))
	 * <p>From package UML::Classification.</p>
	 * @param operation The receiving '<em><b>Operation</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static boolean isConsistentWith(Operation operation,
			RedefinableElement redefiningElement) {

		if (redefiningElement instanceof Operation
			&& redefiningElement.isRedefinitionContextValid(operation)) {

			Operation op = (Operation) redefiningElement;

			EList<Parameter> ownedParameters = operation.getOwnedParameters();
			int ownedParametersSize = ownedParameters.size();

			EList<Parameter> opOwnedParameters = op.getOwnedParameters();

			if (ownedParametersSize == opOwnedParameters.size()) {

				for (int i = 0; i < ownedParametersSize; i++) {
					Parameter redefiningParam = opOwnedParameters.get(i);
					Parameter redefinedParam = ownedParameters.get(i);

					if (redefiningParam.isUnique() != redefinedParam
						.isUnique()) {

						return false;
					}

					if (redefiningParam.isOrdered() != redefinedParam
						.isOrdered()) {

						return false;
					}

					ParameterDirectionKind redefiningDirection = redefiningParam
						.getDirection();

					if (redefiningDirection != redefinedParam.getDirection()) {
						return false;
					}

					if (redefiningDirection == ParameterDirectionKind.INOUT_LITERAL) {

						if (!redefiningParam.compatibleWith(redefinedParam)
							|| !redefinedParam
								.compatibleWith(redefiningParam)) {

							return false;
						}
					} else if (redefiningDirection == ParameterDirectionKind.IN_LITERAL) {

						if (!redefinedParam.compatibleWith(redefiningParam)) {
							return false;
						}
					} else {

						if (!redefiningParam.compatibleWith(redefinedParam)) {
							return false;
						}
					}
				}

				return true;
			}
		}

		return false;
	}

} // OperationOperations
