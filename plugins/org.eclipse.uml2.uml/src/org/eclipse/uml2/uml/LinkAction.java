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
 * $Id: LinkAction.java,v 1.3 2006/02/21 16:12:19 khussey Exp $
 */
package org.eclipse.uml2.uml;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Link Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A link action creates, destroys, or reads links, identifying a link by its end objects and qualifier values, if any.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.LinkAction#getEndData <em>End Data</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.LinkAction#getInputValues <em>Input Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.uml2.uml.UMLPackage#getLinkAction()
 * @model abstract="true"
 * @generated
 */
public interface LinkAction
		extends Action {

	/**
	 * Returns the value of the '<em><b>End Data</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.LinkEndData}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Data identifying one end of a link by the objects on its ends and qualifiers.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>End Data</em>' containment reference list.
	 * @see org.eclipse.uml2.uml.UMLPackage#getLinkAction_EndData()
	 * @model type="org.eclipse.uml2.uml.LinkEndData" containment="true" lower="2" ordered="false"
	 * @generated
	 */
	EList getEndData();

	/**
	 * Creates a {@link org.eclipse.uml2.uml.LinkEndData} and appends it to the '<em><b>End Data</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param eClass The Ecore class of the {@link org.eclipse.uml2.uml.LinkEndData} to create.
	 * @return The new {@link org.eclipse.uml2.uml.LinkEndData}.
	 * @see #getEndData()
	 * @generated
	 */
	LinkEndData createEndData(EClass eClass);

	/**
	 * Creates a {@link org.eclipse.uml2.uml.LinkEndData} and appends it to the '<em><b>End Data</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return The new {@link org.eclipse.uml2.uml.LinkEndData}.
	 * @see #getEndData()
	 * @generated
	 */
	LinkEndData createEndData();

	/**
	 * Returns the value of the '<em><b>Input Value</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.InputPin}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Pins taking end objects and qualifier values as input.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Input Value</em>' containment reference list.
	 * @see org.eclipse.uml2.uml.UMLPackage#getLinkAction_InputValue()
	 * @model type="org.eclipse.uml2.uml.InputPin" containment="true" required="true" ordered="false"
	 * @generated
	 */
	EList getInputValues();

	/**
	 * Creates a {@link org.eclipse.uml2.uml.InputPin} and appends it to the '<em><b>Input Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param eClass The Ecore class of the {@link org.eclipse.uml2.uml.InputPin} to create.
	 * @return The new {@link org.eclipse.uml2.uml.InputPin}.
	 * @see #getInputValues()
	 * @generated
	 */
	InputPin createInputValue(EClass eClass);

	/**
	 * Creates a {@link org.eclipse.uml2.uml.InputPin} and appends it to the '<em><b>Input Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return The new {@link org.eclipse.uml2.uml.InputPin}.
	 * @see #getInputValues()
	 * @generated
	 */
	InputPin createInputValue();

	/**
	 * Retrieves the {@link org.eclipse.uml2.uml.InputPin} with the specified '<em><b>Name</b></em>' from the '<em><b>Input Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.InputPin} to retrieve.
	 * @return The {@link org.eclipse.uml2.uml.InputPin} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getInputValues()
	 * @generated
	 */
	InputPin getInputValue(String name);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The association ends of the link end data must all be from the same association and include all and only the association ends of that association.
	 * self.endData->collect(end) = self.association()->collect(connection))
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validateSameAssociation(DiagnosticChain diagnostics, Map context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The association ends of the link end data must not be static.
	 * self.endData->forall(end.oclisKindOf(NavigableEnd) implies end.isStatic = #false
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validateNotStatic(DiagnosticChain diagnostics, Map context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The input pins of the action are the same as the pins of the link end data and insertion pins.
	 * self.input->asSet() =
	 * let ledpins : Set = self.endData->collect(value) in
	 * if self.oclIsKindOf(LinkEndCreationData)
	 * then ledpins->union(self.endData.oclAsType(LinkEndCreationData).insertAt)
	 * else ledpins
	 * 
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validateSamePins(DiagnosticChain diagnostics, Map context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The association operates on LinkAction. It returns the association of the action.
	 * result = self.endData->asSequence().first().end.association
	 * <!-- end-model-doc -->
	 * @model required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='spec'"
	 * @generated
	 */
	Association association();

} // LinkAction
