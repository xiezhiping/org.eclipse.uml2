/*
 * Copyright (c) 2005, 2015 IBM Corporation, CEA, and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *   Kenn Hussey (CEA) - 327039, 351777, 382718, 418466, 451350
 *   Christian W. Damus (CEA) - 251963
 *
 */
package org.eclipse.uml2.uml;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Link End Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * LinkEndData is an Element that identifies on end of a link to be read or written by a LinkAction. As a link (that is not a link object) cannot be passed as a runtime value to or from an Action, it is instead identified by its end objects and qualifier values, if any. A LinkEndData instance provides these values for a single Association end.
 * <p>From package UML::Actions.</p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.LinkEndData#getEnd <em>End</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.LinkEndData#getQualifiers <em>Qualifier</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.LinkEndData#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see org.eclipse.uml2.uml.UMLPackage#getLinkEndData()
 * @model
 * @generated
 */
public interface LinkEndData
		extends Element {

	/**
	 * Returns the value of the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The InputPin that provides the specified value for the given end. This InputPin is omitted if the LinkEndData specifies the "open" end for a ReadLinkAction.
	 * <p>From package UML::Actions.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Value</em>' reference.
	 * @see #setValue(InputPin)
	 * @see org.eclipse.uml2.uml.UMLPackage#getLinkEndData_Value()
	 * @model ordered="false"
	 * @generated
	 */
	InputPin getValue();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.uml.LinkEndData#getValue <em>Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' reference.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(InputPin value);

	/**
	 * Returns the value of the '<em><b>End</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Association end for which this LinkEndData specifies values.
	 * <p>From package UML::Actions.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>End</em>' reference.
	 * @see #setEnd(Property)
	 * @see org.eclipse.uml2.uml.UMLPackage#getLinkEndData_End()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Property getEnd();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.uml.LinkEndData#getEnd <em>End</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End</em>' reference.
	 * @see #getEnd()
	 * @generated
	 */
	void setEnd(Property value);

	/**
	 * Returns the value of the '<em><b>Qualifier</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.QualifierValue}.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.eclipse.uml2.uml.Element#getOwnedElements() <em>Owned Element</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A set of QualifierValues used to provide values for the qualifiers of the end.
	 * <p>From package UML::Actions.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Qualifier</em>' containment reference list.
	 * @see org.eclipse.uml2.uml.UMLPackage#getLinkEndData_Qualifier()
	 * @model containment="true" resolveProxies="true" ordered="false"
	 * @generated
	 */
	EList<QualifierValue> getQualifiers();

	/**
	 * Creates a new {@link org.eclipse.uml2.uml.QualifierValue} and appends it to the '<em><b>Qualifier</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return The new {@link org.eclipse.uml2.uml.QualifierValue}.
	 * @see #getQualifiers()
	 * @generated
	 */
	QualifierValue createQualifier();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Property must be an Association memberEnd.
	 * end.association <> null
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validatePropertyIsAssociationEnd(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The type of the value InputPin conforms to the type of the Association end.
	 * value<>null implies value.type.conformsTo(end.type)
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validateSameType(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The multiplicity of the value InputPin must be 1..1.
	 * value<>null implies value.is(1,1)
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validateMultiplicity(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The qualifiers must be qualifiers of the Association end.
	 * end.qualifier->includesAll(qualifier.qualifier)
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validateQualifiers(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Returns all the InputPins referenced by this LinkEndData. By default this includes the value and qualifier InputPins, but subclasses may override the operation to add other InputPins.
	 * result = (value->asBag()->union(qualifier.value))
	 * <p>From package UML::Actions.</p>
	 * <!-- end-model-doc -->
	 * @model unique="false" ordered="false"
	 * @generated
	 */
	EList<InputPin> allPins();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The value InputPin is not also the qualifier value InputPin.
	 * value->excludesAll(qualifier.value)
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validateEndObjectInputPin(DiagnosticChain diagnostics,
			Map<Object, Object> context);

} // LinkEndData
