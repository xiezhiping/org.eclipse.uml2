/*
 * Copyright (c) 2005, 2014 IBM Corporation, CEA, and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *   Kenn Hussey (CEA) - 418466
 *
 */
package org.eclipse.uml2.uml.internal.operations;

import org.eclipse.uml2.uml.Action;
import org.eclipse.uml2.uml.Variable;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Variable</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.Variable#isAccessibleBy(org.eclipse.uml2.uml.Action) <em>Is Accessible By</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VariableOperations
		extends ConnectableElementOperations {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VariableOperations() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The isAccessibleBy() operation is not defined in standard UML. Implementations should define it to specify which actions can access a variable.
	 * 
	 * result = true
	 * @param variable The receiving '<em><b>Variable</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static boolean isAccessibleBy(Variable variable, Action a) {
		throw new UnsupportedOperationException();
	}

} // VariableOperations