/*
 * Copyright (c) 2003, 2004 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *
 * $Id: ParameterSet.java,v 1.9 2005/11/21 21:48:02 khussey Exp $
 */
package org.eclipse.uml2;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameter Set</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An parameter set acts as a complete set of inputs and outputs to a behavior, exclusive of other parameter sets on the behavior. 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2.ParameterSet#getParameters <em>Parameter</em>}</li>
 *   <li>{@link org.eclipse.uml2.ParameterSet#getConditions <em>Condition</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.uml2.UML2Package#getParameterSet()
 * @model
 * @generated
 */
public interface ParameterSet extends NamedElement{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) IBM Corporation and others."; //$NON-NLS-1$

	/**
	 * Returns the value of the '<em><b>Parameter</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.Parameter}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.uml2.Parameter#getParameterSets <em>Parameter Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameter</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter</em>' reference list.
	 * @see org.eclipse.uml2.UML2Package#getParameterSet_Parameter()
	 * @see org.eclipse.uml2.Parameter#getParameterSets
	 * @model type="org.eclipse.uml2.Parameter" opposite="parameterSet" required="true" ordered="false"
	 * @generated
	 */
	EList getParameters();


	/**
	 * Retrieves the {@link org.eclipse.uml2.Parameter} with the specified '<em><b>Name</b></em>' from the '<em><b>Parameter</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.Parameter} to retrieve.
	 * @return The {@link org.eclipse.uml2.Parameter} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getParameters()
	 * @generated
	 */
    Parameter getParameter(String name);

	/**
	 * Returns the value of the '<em><b>Condition</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2.Constraint}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Condition</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition</em>' containment reference list.
	 * @see org.eclipse.uml2.UML2Package#getParameterSet_Condition()
	 * @model type="org.eclipse.uml2.Constraint" containment="true" resolveProxies="false" ordered="false"
	 * @generated
	 */
	EList getConditions();


	/**
	 * Retrieves the {@link org.eclipse.uml2.Constraint} with the specified '<em><b>Name</b></em>' from the '<em><b>Condition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.Constraint} to retrieve.
	 * @return The {@link org.eclipse.uml2.Constraint} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getConditions()
	 * @generated
	 */
    Constraint getCondition(String name);

	/**
	 * Creates a {@link org.eclipse.uml2.Constraint} and appends it to the '<em><b>Condition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param eClass The Ecore class of the {@link org.eclipse.uml2.Constraint} to create.
	 * @return The new {@link org.eclipse.uml2.Constraint}.
	 * @see #getConditions()
	 * @generated
	 */
    Constraint createCondition(EClass eClass);

	/**
	 * Creates a {@link org.eclipse.uml2.Constraint} and appends it to the '<em><b>Condition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return The new {@link org.eclipse.uml2.Constraint}.
	 * @see #getConditions()
	 * @generated
	 */
    Constraint createCondition();

} // ParameterSet
