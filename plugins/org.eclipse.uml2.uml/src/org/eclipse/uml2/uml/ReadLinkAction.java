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
 * $Id: ReadLinkAction.java,v 1.1 2005/11/14 22:25:59 khussey Exp $
 */
package org.eclipse.uml2.uml;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Read Link Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This action navigates an association towards one end, which is the end that does not have an input pin to take its object (the ?open? end). The objects put on the result output pin are the ones participating in the association at the open end, conforming to the specified qualifiers, in order if the end is ordered. The semantics is undefined for reading a link that violates the navigability or visibility of the open end.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.ReadLinkAction#getResult <em>Result</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.uml2.uml.UMLPackage#getReadLinkAction()
 * @model
 * @generated
 */
public interface ReadLinkAction
		extends LinkAction {

	/**
	 * Returns the value of the '<em><b>Result</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The pin on which are put the objects participating in the association at the end not specified by the inputs.
	 * 
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Result</em>' containment reference.
	 * @see #setResult(OutputPin)
	 * @see org.eclipse.uml2.uml.UMLPackage#getReadLinkAction_Result()
	 * @model containment="true" resolveProxies="false" required="true" ordered="false"
	 * @generated
	 */
	OutputPin getResult();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.uml.ReadLinkAction#getResult <em>Result</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Result</em>' containment reference.
	 * @see #getResult()
	 * @generated
	 */
	void setResult(OutputPin value);

	/**
	 * Creates a {@link org.eclipse.uml2.uml.OutputPin} and sets the '<em><b>Result</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return The new {@link org.eclipse.uml2.uml.OutputPin}.
	 * @see #getResult()
	 * @generated
	 */
	OutputPin createResult();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Exactly one link-end data specification (the 'open' end) must not have an end object input pin.
	 * self.endData->select(ed | ed.value->size() = 0)->size() = 1
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validateOneOpenEnd(DiagnosticChain diagnostics, Map context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The type and ordering of the result output pin are same as the type and ordering of the open association end.
	 * let openend : AssociationEnd = self.endData->select(ed | ed.value->size() = 0)->asSequence()->first().end in
	 * self.result.type = openend.type
	 * and self.result.ordering = openend.ordering
	 * 
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validateTypeAndOrdering(DiagnosticChain diagnostics, Map context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The multiplicity of the open association end must be compatible with the multiplicity of the result output pin.
	 * let openend : AssociationEnd = self.endData->select(ed | ed.value->size() = 0)->asSequence()->first().end in
	 * openend.multiplicity.compatibleWith(self.result.multiplicity)
	 * 
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validateCompatibleMultiplicity(DiagnosticChain diagnostics,
			Map context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The open end must be navigable.
	 * let openend : AssociationEnd = self.endData->select(ed | ed.value->size() = 0)->asSequence()->first().end in
	 * openend.isNavigable()
	 * 
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validateNavigableOpenEnd(DiagnosticChain diagnostics, Map context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Visibility of the open end must allow access to the object performing the action.
	 * let host : Classifier = self.context in
	 * let openend : AssociationEnd = self.endData->select(ed | ed.value->size() = 0)->asSequence()->first().end in
	 * openend.visibility = #public
	 * or self.endData->exists(oed | not oed.end = openend
	 * and (host = oed.end.participant
	 * or (openend.visibility = #protected
	 * and host.allSupertypes->includes(oed.end.participant))))
	 * 
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validateVisibility(DiagnosticChain diagnostics, Map context);

} // ReadLinkAction
