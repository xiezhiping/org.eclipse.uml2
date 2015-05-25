/*
 * Copyright (c) 2013, 2015 CEA and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Christian W. Damus (CEA) - initial API and implementation
 *   Kenn Hussey (CEA) - 468230
 *
 */
package org.eclipse.uml2.uml;

import org.eclipse.emf.common.util.EList;

/**
 * Common protocol for {@linkplain Classifier classifiers} that own
 * {@linkplain Classifier#getOperations() operations}.
 * 
 * @since 5.0
 */
public interface OperationOwner {

	/**
	 * Obtains the operations owned by this classifier.
	 * 
	 * @return my owned operations
	 */
	EList<Operation> getOwnedOperations();

	/**
	 * Creates a new void {@link Operation} (having no return result) as an
	 * owned operation of this classifier.
	 * 
	 * @param name
	 *            the name of the new operation (may be {@code null})
	 * @param parameterNames
	 *            the names of the operation's {@link ParameterDirectionKind#IN
	 *            IN} parameters (may be {@code null} if no parameters are
	 *            needed)
	 * @param parameterTypes
	 *            the types of the operation's {@link ParameterDirectionKind#IN
	 *            IN} parameters (may be {@code null} if no parameters are
	 *            needed)
	 * 
	 * @return the new owned operation
	 * 
	 * @see #createOwnedOperation(String, EList, EList, Type)
	 * @see #getOwnedOperation(String, EList, EList)
	 */
	Operation createOwnedOperation(String name, EList<String> parameterNames,
			EList<Type> parameterTypes);

	/**
	 * Creates a new {@link Operation} as an owned operation of this classifier.
	 * 
	 * @param name
	 *            the name of the new operation (may be {@code null})
	 * @param parameterNames
	 *            the names of the operation's {@link ParameterDirectionKind#IN
	 *            IN} parameters (may be {@code null} if no parameters are
	 *            needed)
	 * @param parameterTypes
	 *            the types of the operation's {@link ParameterDirectionKind#IN
	 *            IN} parameters (may be {@code null} if no parameters are
	 *            needed)
	 * @param returnType
	 *            the type of the operation (which is the type of its sole
	 *            {@linkplain ParameterDirectionKind#RETURN return result})
	 * 
	 * @return the new owned operation
	 * 
	 * @see #createOwnedOperation(String, EList, EList)
	 * @see #getOwnedOperation(String, EList, EList)
	 */
	Operation createOwnedOperation(String name, EList<String> parameterNames,
			EList<Type> parameterTypes, Type returnType);

	/**
	 * Finds the first owned operation that matches all or any of the given
	 * {@code name}, {@code parameterNames}, and {@code parameterTypes}.
	 * 
	 * @param name
	 *            the operation name to match, or {@code null} to match any
	 *            operation name
	 * @param parameterNames
	 *            the parameter names to match, or {@code null} to match any
	 *            parameter names
	 * @param parameterTypes
	 *            the parameter types to match, or {@code null} to match any
	 *            signature
	 * 
	 * @return any matching operation, or {@code null} if not found
	 * 
	 * @see #getOwnedOperation(String, EList, EList, boolean, boolean)
	 */
	Operation getOwnedOperation(String name, EList<String> parameterNames,
			EList<Type> parameterTypes);

	/**
	 * Finds the first owned operation that matches all or any of the given
	 * {@code name} (optionally case-insensitive), {@code parameterNames}
	 * (optionally case-insensitive), and {@code parameterTypes}.
	 * 
	 * @param name
	 *            the operation name to match, or {@code null} to match any
	 *            operation name
	 * @param parameterNames
	 *            the parameter names to match, or {@code null} to match any
	 *            parameter names
	 * @param parameterTypes
	 *            the parameter types to match, or {@code null} to match any
	 *            signature
	 * @param ignoreCase
	 *            whether matching of operation and parameter names is
	 *            case-insensitive
	 * @param createOnDemand
	 *            whether to create the owned operation and return it if an
	 *            existing match is not found
	 * 
	 * @return any matching operation, or {@code null} if not found and
	 *         {@code createOnDemand} is {@code false}
	 * 
	 * @see #getOwnedOperation(String, EList, EList)
	 */
	Operation getOwnedOperation(String name, EList<String> parameterNames,
			EList<Type> parameterTypes, boolean ignoreCase,
			boolean createOnDemand);

}
