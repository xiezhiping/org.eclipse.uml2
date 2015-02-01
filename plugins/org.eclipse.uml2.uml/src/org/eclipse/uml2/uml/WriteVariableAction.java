/*
 * Copyright (c) 2005, 2015 IBM Corporation, CEA, and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *   Kenn Hussey (CEA) - 327039, 418466, 451350
 *   Christian W. Damus (CEA) - 251963
 *
 */
package org.eclipse.uml2.uml;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Write Variable Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * WriteVariableAction is an abstract class for VariableActions that change Variable values.
 * <p>From package UML::Actions.</p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.WriteVariableAction#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see org.eclipse.uml2.uml.UMLPackage#getWriteVariableAction()
 * @model abstract="true"
 * @generated
 */
public interface WriteVariableAction
		extends VariableAction {

	/**
	 * Returns the value of the '<em><b>Value</b></em>' containment reference.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.eclipse.uml2.uml.Action#getInputs() <em>Input</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The InputPin that gives the value to be added or removed from the Variable.
	 * <p>From package UML::Actions.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Value</em>' containment reference.
	 * @see #setValue(InputPin)
	 * @see org.eclipse.uml2.uml.UMLPackage#getWriteVariableAction_Value()
	 * @model containment="true" resolveProxies="true" ordered="false"
	 * @generated
	 */
	InputPin getValue();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.uml.WriteVariableAction#getValue <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' containment reference.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(InputPin value);

	/**
	 * Creates a new {@link org.eclipse.uml2.uml.InputPin}, with the specified '<em><b>Name</b></em>', and '<em><b>Type</b></em>', and sets the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' for the new {@link org.eclipse.uml2.uml.InputPin}, or <code>null</code>.
	 * @param type The '<em><b>Type</b></em>' for the new {@link org.eclipse.uml2.uml.InputPin}, or <code>null</code>.
	 * @param eClass The Ecore class of the {@link org.eclipse.uml2.uml.InputPin} to create.
	 * @return The new {@link org.eclipse.uml2.uml.InputPin}.
	 * @see #getValue()
	 * @generated
	 */
	InputPin createValue(String name, Type type, EClass eClass);

	/**
	 * Creates a new {@link org.eclipse.uml2.uml.InputPin},with the specified '<em><b>Name</b></em>', and '<em><b>Type</b></em>', and sets the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' for the new {@link org.eclipse.uml2.uml.InputPin}, or <code>null</code>.
	 * @param type The '<em><b>Type</b></em>' for the new {@link org.eclipse.uml2.uml.InputPin}, or <code>null</code>.
	 * @return The new {@link org.eclipse.uml2.uml.InputPin}.
	 * @see #getValue()
	 * @generated
	 */
	InputPin createValue(String name, Type type);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The type of the value InputPin must conform to the type of the variable.
	 * value <> null implies value.type.conformsTo(variable.type)
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validateValueType(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The multiplicity of the value InputPin is 1..1.
	 * value<>null implies value.is(1,1)
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validateMultiplicity(DiagnosticChain diagnostics,
			Map<Object, Object> context);

} // WriteVariableAction
