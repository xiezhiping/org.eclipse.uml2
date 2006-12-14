/*
 * Copyright (c) 2005, 2006 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *
 * $Id: FunctionBehavior.java,v 1.3 2006/12/14 15:49:27 khussey Exp $
 */
package org.eclipse.uml2.uml;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Function Behavior</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A function behavior is an opaque behavior that does not access or modify any objects or other external data.
 * <!-- end-model-doc -->
 *
 *
 * @see org.eclipse.uml2.uml.UMLPackage#getFunctionBehavior()
 * @model
 * @generated
 */
public interface FunctionBehavior
		extends OpaqueBehavior {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A function behavior has at least one output parameter.
	 * self.ownedParameters->
	 *   select(p | p.direction=#out or p.direction=#inout or p.direction=#return)->size() >= 1
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validateOneOutputParameter(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The types of parameters are all data types, which may not nest anything but other datatypes.
	 * def: hasAllDataTypeAttributes(d : DataType) : Boolean =
	 *   d.ownedAttribute->forAll(a |
	 *     a.type.oclIsTypeOf(DataType) and
	 *       hasAllDataTypeAttributes(a.type))
	 * self.ownedParameters->forAll(p | p.type.notEmpty() and
	 *   p.oclIsTypeOf(DataType) and hasAllDataTypeAttributes(p))
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validateTypesOfParameters(DiagnosticChain diagnostics,
			Map<Object, Object> context);

} // FunctionBehavior
