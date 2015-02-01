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

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A Variable is a ConnectableElement that may store values during the execution of an Activity. Reading and writing the values of a Variable provides an alternative means for passing data than the use of ObjectFlows. A Variable may be owned directly by an Activity, in which case it is accessible from anywhere within that activity, or it may be owned by a StructuredActivityNode, in which case it is only accessible within that node.
 * <p>From package UML::Activities.</p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.Variable#getActivityScope <em>Activity Scope</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Variable#getScope <em>Scope</em>}</li>
 * </ul>
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
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.eclipse.uml2.uml.NamedElement#getNamespace() <em>Namespace</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An Activity that owns the Variable.
	 * <p>From package UML::Activities.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Activity Scope</em>' container reference.
	 * @see #setActivityScope(Activity)
	 * @see org.eclipse.uml2.uml.UMLPackage#getVariable_ActivityScope()
	 * @see org.eclipse.uml2.uml.Activity#getVariables
	 * @model opposite="variable" transient="false" ordered="false"
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
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.eclipse.uml2.uml.NamedElement#getNamespace() <em>Namespace</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A StructuredActivityNode that owns the Variable.
	 * <p>From package UML::Activities.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Scope</em>' container reference.
	 * @see #setScope(StructuredActivityNode)
	 * @see org.eclipse.uml2.uml.UMLPackage#getVariable_Scope()
	 * @see org.eclipse.uml2.uml.StructuredActivityNode#getVariables
	 * @model opposite="variable" transient="false" ordered="false"
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
	 * A Variable is accessible by Actions within its scope (the Activity or StructuredActivityNode that owns it).
	 * result = (if scope<>null then scope.allOwnedNodes()->includes(a)
	 * else a.containingActivity()=activityScope
	 * endif)
	 * <p>From package UML::Activities.</p>
	 * <!-- end-model-doc -->
	 * @model dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false" aRequired="true" aOrdered="false"
	 * @generated
	 */
	boolean isAccessibleBy(Action a);

} // Variable
