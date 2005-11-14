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
 * $Id: OperationOperations.java,v 1.1 2005/11/14 22:25:55 khussey Exp $
 */
package org.eclipse.uml2.uml.internal.operations;

import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.uml2.uml.Operation;
import org.eclipse.uml2.uml.RedefinableElement;
import org.eclipse.uml2.uml.Type;

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
public final class OperationOperations {

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
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An operation can have at most one return parameter; i.e., an owned parameter with the direction set to 'return'
	 * self.ownedParameter->select(par | par.direction = #return)->size() <= 1
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateAtMostOneReturn(Operation operation,
			DiagnosticChain diagnostics, Map context) {
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
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateOnlyBodyForQuery(Operation operation,
			DiagnosticChain diagnostics, Map context) {
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
						UMLValidator.OPERATION__ONLY_BODY_FOR_QUERY,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE
							.getString(
								"_UI_GenericInvariant_diagnostic", new Object[]{"validateOnlyBodyForQuery", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(operation, context)}), //$NON-NLS-1$ //$NON-NLS-2$
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
	 * If this operation has a return parameter, isOrdered equals the value of isOrdered for that parameter. Otherwise isOrdered is false.
	 * result = if returnResult()->notEmpty() then returnResult()->any().isOrdered else false endif
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean isOrdered(Operation operation) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If this operation has a return parameter, isUnique equals the value of isUnique for that parameter. Otherwise isUnique is true.
	 * If this operation has a return parameter, isUnique equals the value of isUnique for that parameter. Otherwise isUnique is true.
	 * 
	 * 
	 * result = if returnResult()->notEmpty() then returnResult()->any().isUnique else true endif
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean isUnique(Operation operation) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If this operation has a return parameter, lower equals the value of lower for that parameter. Otherwise lower is not defined.
	 * If this operation has a return parameter, lower equals the value of lower for that parameter. Otherwise lower is not defined.
	 * 
	 * 
	 * result = if returnResult()->notEmpty() then returnResult()->any().lower else Set{} endif
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static int lowerBound(Operation operation) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If this operation has a return parameter, upper equals the value of upper for that parameter. Otherwise upper is not defined.
	 * If this operation has a return parameter, upper equals the value of upper for that parameter. Otherwise upper is not defined.
	 * 
	 * 
	 * result = if returnResult()->notEmpty() then returnResult()->any().upper else Set{} endif
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static int upperBound(Operation operation) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If this operation has a return parameter, type equals the value of type for that parameter. Otherwise type is not defined.
	 * result = if returnResult()->notEmpty() then returnResult()->any().type else Set{} endif
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static Type getType(Operation operation) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The query returnResult() returns the set containing the return parameter of the Operation if one exists, otherwise, it returns an empty set
	 * result = ownedParameter->select (par | par.direction = #return)
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static List returnResult(Operation operation) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The query isConsistentWith() specifies, for any two Operations in a context in which redefinition is possible, whether redefinition would be consistent in the sense of maintaining type covariance. Other senses of consistency may be required, for example to determine consistency in the sense of contravariance. Users may define alternative queries under names different from 'isConsistentWith()', as for example, users may define a query named 'isContravariantWith()'.
	 * The query isConsistentWith() specifies, for any two Operations in a context in which redefinition is possible, whether redefinition would be logically consistent. A redefining operation is consistent with a redefined operation if it has the same number of owned parameters, and the type of each owned parameter conforms to the type of the corresponding redefined parameter. 
	 * redefinee.isRedefinitionContextValid(self)
	 * result = (redefinee.oclIsKindOf(Operation) and
	 * let op: Operation = redefinee.oclAsType(Operation) in
	 * self.ownedParameter.size() = op.ownedParameter.size() and
	 * forAll(i | op.ownedParameter[i].type.conformsTo(self.ownedParameter[i].type))
	 * )
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean isConsistentWith(Operation operation,
			RedefinableElement redefinee) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

} // OperationOperations