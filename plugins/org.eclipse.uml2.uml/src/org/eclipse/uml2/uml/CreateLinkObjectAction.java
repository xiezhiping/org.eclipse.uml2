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
 * $Id: CreateLinkObjectAction.java,v 1.6 2006/12/14 15:49:27 khussey Exp $
 */
package org.eclipse.uml2.uml;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Create Link Object Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A create link object action creates a link object.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.CreateLinkObjectAction#getResult <em>Result</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.uml2.uml.UMLPackage#getCreateLinkObjectAction()
 * @model
 * @generated
 */
public interface CreateLinkObjectAction
		extends CreateLinkAction {

	/**
	 * Returns the value of the '<em><b>Result</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Gives the output pin on which the result is put.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Result</em>' containment reference.
	 * @see #setResult(OutputPin)
	 * @see org.eclipse.uml2.uml.UMLPackage#getCreateLinkObjectAction_Result()
	 * @model containment="true" resolveProxies="true" required="true" ordered="false"
	 * @generated
	 */
	OutputPin getResult();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.uml.CreateLinkObjectAction#getResult <em>Result</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Result</em>' containment reference.
	 * @see #getResult()
	 * @generated
	 */
	void setResult(OutputPin value);

	/**
	 * Creates a new {@link org.eclipse.uml2.uml.OutputPin},with the specified '<em><b>Name</b></em>', and '<em><b>Type</b></em>', and sets the '<em><b>Result</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' for the new {@link org.eclipse.uml2.uml.OutputPin}, or <code>null</code>.
	 * @param type The '<em><b>Type</b></em>' for the new {@link org.eclipse.uml2.uml.OutputPin}, or <code>null</code>.
	 * @return The new {@link org.eclipse.uml2.uml.OutputPin}.
	 * @see #getResult()
	 * @generated
	 */
	OutputPin createResult(String name, Type type);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The association must be an association class.
	 * self.association().oclIsKindOf(Class)
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validateAssociationClass(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The type of the result pin must be the same as the association of the action.
	 * self.result.type = self.association()
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validateTypeOfResult(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The multiplicity of the output pin is 1..1.
	 * self.result.multiplicity.is(1,1)
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validateMultiplicity(DiagnosticChain diagnostics,
			Map<Object, Object> context);

} // CreateLinkObjectAction
