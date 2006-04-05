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
 * $Id: Variable.java,v 1.7 2006/04/05 13:49:57 khussey Exp $
 */
package org.eclipse.uml2.uml;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A variable specifies data storage shared by the actions within a group. There are actions to write and read variables. These actions are treated as side effecting actions, similar to the actions to write and read object attributes and associations. There are no sequencing constraints among actions that access the same variable. Such actions must be explicitly coordinated by control flows or other constraints.
 * 
 * Any values contained by a variable must conform to the type of the variable and have cardinalities allowed by the multiplicity of the variable.
 * 
 * A variable is considered a connectable element.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.Variable#getScope <em>Scope</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Variable#getActivityScope <em>Activity Scope</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.uml2.uml.UMLPackage#getVariable()
 * @model
 * @generated
 */
public interface Variable
		extends ConnectableElement, MultiplicityElement {

	/**
	 * Returns the value of the '<em><b>Activity Scope</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.uml2.uml.Activity#getVariables <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An activity that owns the variable.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Activity Scope</em>' container reference.
	 * @see #setActivityScope(Activity)
	 * @see org.eclipse.uml2.uml.UMLPackage#getVariable_ActivityScope()
	 * @see org.eclipse.uml2.uml.Activity#getVariables
	 * @model opposite="variable" ordered="false"
	 * @generated
	 */
	Activity getActivityScope();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.uml.Variable#getActivityScope <em>Activity Scope</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Activity Scope</em>' container reference.
	 * @see #getActivityScope()
	 * @generated
	 */
	void setActivityScope(Activity value);

	/**
	 * Returns the value of the '<em><b>Scope</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.uml2.uml.StructuredActivityNode#getVariables <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A structured activity node that owns the variable.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Scope</em>' container reference.
	 * @see #setScope(StructuredActivityNode)
	 * @see org.eclipse.uml2.uml.UMLPackage#getVariable_Scope()
	 * @see org.eclipse.uml2.uml.StructuredActivityNode#getVariables
	 * @model opposite="variable" ordered="false"
	 * @generated
	 */
	StructuredActivityNode getScope();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.uml.Variable#getScope <em>Scope</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scope</em>' container reference.
	 * @see #getScope()
	 * @generated
	 */
	void setScope(StructuredActivityNode value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A variable is owned by a StructuredNode or Activity, but not both.
	 * true
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validateOwned(DiagnosticChain diagnostics, Map context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The isAccessibleBy() operation is not defined in standard UML. Implementations should define it to specify which actions can access a variable.
	 * 
	 * result = true
	 * <!-- end-model-doc -->
	 * @model dataType="org.eclipse.uml2.uml.Boolean" required="true" ordered="false" aRequired="true" aOrdered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='spec'"
	 * @generated
	 */
	boolean isAccessibleBy(Action a);

} // Variable
