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
 * $Id: Element.java,v 1.13 2006/05/12 20:38:09 khussey Exp $
 */
package org.eclipse.uml2.uml;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EModelElement;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An element is a constituent of a model. As such, it has the capability of owning other elements.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.Element#getOwnedElements <em>Owned Element</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Element#getOwner <em>Owner</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Element#getOwnedComments <em>Owned Comment</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.uml2.uml.UMLPackage#getElement()
 * @model abstract="true"
 * @generated
 */
public interface Element
		extends EModelElement {

	/**
	 * Returns the value of the '<em><b>Owned Element</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.Element}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.uml2.uml.Element#getOwner <em>Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Elements owned by this element.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned Element</em>' reference list.
	 * @see org.eclipse.uml2.uml.UMLPackage#getElement_OwnedElement()
	 * @see org.eclipse.uml2.uml.Element#getOwner
	 * @model type="org.eclipse.uml2.uml.Element" opposite="owner" transient="true" changeable="false" derived="true" ordered="false"
	 * @generated
	 */
	EList getOwnedElements();

	/**
	 * Returns the value of the '<em><b>Owner</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.uml2.uml.Element#getOwnedElements <em>Owned Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Element that owns this element.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owner</em>' reference.
	 * @see org.eclipse.uml2.uml.UMLPackage#getElement_Owner()
	 * @see org.eclipse.uml2.uml.Element#getOwnedElements
	 * @model opposite="ownedElement" transient="true" changeable="false" derived="true" ordered="false"
	 * @generated
	 */
	Element getOwner();

	/**
	 * Returns the value of the '<em><b>Owned Comment</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.Comment}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Comments owned by this element.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned Comment</em>' containment reference list.
	 * @see org.eclipse.uml2.uml.UMLPackage#getElement_OwnedComment()
	 * @model type="org.eclipse.uml2.uml.Comment" containment="true" ordered="false"
	 * @generated
	 */
	EList getOwnedComments();

	/**
	 * Creates a new {@link org.eclipse.uml2.uml.Comment} and appends it to the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return The new {@link org.eclipse.uml2.uml.Comment}.
	 * @see #getOwnedComments()
	 * @generated
	 */
	Comment createOwnedComment();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An element may not directly or indirectly own itself.
	 * not self.allOwnedElements()->includes(self)
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validateNotOwnSelf(DiagnosticChain diagnostics, Map context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Elements that must be owned must have an owner.
	 * self.mustBeOwned() implies owner->notEmpty()
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validateHasOwner(DiagnosticChain diagnostics, Map context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" type="org.eclipse.emf.ecore.EObject" ordered="false"
	 * @generated
	 */
	EList getStereotypeApplications();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ordered="false" stereotypeRequired="true" stereotypeOrdered="false"
	 * @generated
	 */
	EObject getStereotypeApplication(Stereotype stereotype);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" type="org.eclipse.uml2.uml.Stereotype" ordered="false"
	 * @generated
	 */
	EList getRequiredStereotypes();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ordered="false" qualifiedNameDataType="org.eclipse.uml2.uml.String" qualifiedNameRequired="true" qualifiedNameOrdered="false"
	 * @generated
	 */
	Stereotype getRequiredStereotype(String qualifiedName);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" type="org.eclipse.uml2.uml.Stereotype" ordered="false"
	 * @generated
	 */
	EList getAppliedStereotypes();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ordered="false" qualifiedNameDataType="org.eclipse.uml2.uml.String" qualifiedNameRequired="true" qualifiedNameOrdered="false"
	 * @generated
	 */
	Stereotype getAppliedStereotype(String qualifiedName);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model type="org.eclipse.uml2.uml.Stereotype" ordered="false" stereotypeRequired="true" stereotypeOrdered="false"
	 * @generated
	 */
	EList getAppliedSubstereotypes(Stereotype stereotype);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ordered="false" stereotypeRequired="true" stereotypeOrdered="false" qualifiedNameDataType="org.eclipse.uml2.uml.String" qualifiedNameRequired="true" qualifiedNameOrdered="false"
	 * @generated
	 */
	Stereotype getAppliedSubstereotype(Stereotype stereotype,
			String qualifiedName);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.uml2.uml.Boolean" required="true" ordered="false" stereotypeRequired="true" stereotypeOrdered="false" propertyNameDataType="org.eclipse.uml2.uml.String" propertyNameRequired="true" propertyNameOrdered="false"
	 * @generated
	 */
	boolean hasValue(Stereotype stereotype, String propertyName);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ordered="false" stereotypeRequired="true" stereotypeOrdered="false" propertyNameDataType="org.eclipse.uml2.uml.String" propertyNameRequired="true" propertyNameOrdered="false"
	 * @generated
	 */
	Object getValue(Stereotype stereotype, String propertyName);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model stereotypeRequired="true" stereotypeOrdered="false" propertyNameDataType="org.eclipse.uml2.uml.String" propertyNameRequired="true" propertyNameOrdered="false" newValueRequired="true" newValueOrdered="false"
	 * @generated
	 */
	void setValue(Stereotype stereotype, String propertyName, Object newValue);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" sourceDataType="org.eclipse.uml2.uml.String" sourceRequired="true" sourceOrdered="false"
	 * @generated
	 */
	EAnnotation createEAnnotation(String source);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" type="org.eclipse.uml2.uml.Relationship" ordered="false"
	 * @generated
	 */
	EList getRelationships();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model type="org.eclipse.uml2.uml.Relationship" ordered="false" eClassRequired="true" eClassOrdered="false"
	 * @generated
	 */
	EList getRelationships(EClass eClass);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" type="org.eclipse.uml2.uml.DirectedRelationship" ordered="false"
	 * @generated
	 */
	EList getSourceDirectedRelationships();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model type="org.eclipse.uml2.uml.DirectedRelationship" ordered="false" eClassRequired="true" eClassOrdered="false"
	 * @generated
	 */
	EList getSourceDirectedRelationships(EClass eClass);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" type="org.eclipse.uml2.uml.DirectedRelationship" ordered="false"
	 * @generated
	 */
	EList getTargetDirectedRelationships();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model type="org.eclipse.uml2.uml.DirectedRelationship" ordered="false" eClassRequired="true" eClassOrdered="false"
	 * @generated
	 */
	EList getTargetDirectedRelationships(EClass eClass);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" type="java.lang.String" dataType="org.eclipse.uml2.uml.String" ordered="false"
	 * @generated
	 */
	EList getKeywords();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.uml2.uml.Boolean" required="true" ordered="false" keywordDataType="org.eclipse.uml2.uml.String" keywordRequired="true" keywordOrdered="false"
	 * @generated
	 */
	boolean addKeyword(String keyword);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.uml2.uml.Boolean" required="true" ordered="false" keywordDataType="org.eclipse.uml2.uml.String" keywordRequired="true" keywordOrdered="false"
	 * @generated
	 */
	boolean removeKeyword(String keyword);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" ordered="false"
	 * @generated
	 */
	org.eclipse.uml2.uml.Package getNearestPackage();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" ordered="false"
	 * @generated
	 */
	Model getModel();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.uml2.uml.Boolean" required="true" ordered="false" stereotypeRequired="true" stereotypeOrdered="false"
	 * @generated
	 */
	boolean isStereotypeApplicable(Stereotype stereotype);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.uml2.uml.Boolean" required="true" ordered="false" stereotypeRequired="true" stereotypeOrdered="false"
	 * @generated
	 */
	boolean isStereotypeRequired(Stereotype stereotype);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.uml2.uml.Boolean" required="true" ordered="false" stereotypeRequired="true" stereotypeOrdered="false"
	 * @generated
	 */
	boolean isStereotypeApplied(Stereotype stereotype);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" stereotypeRequired="true" stereotypeOrdered="false"
	 * @generated
	 */
	EObject applyStereotype(Stereotype stereotype);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" stereotypeRequired="true" stereotypeOrdered="false"
	 * @generated
	 */
	EObject unapplyStereotype(Stereotype stereotype);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" type="org.eclipse.uml2.uml.Stereotype" ordered="false"
	 * @generated
	 */
	EList getApplicableStereotypes();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ordered="false" qualifiedNameDataType="org.eclipse.uml2.uml.String" qualifiedNameRequired="true" qualifiedNameOrdered="false"
	 * @generated
	 */
	Stereotype getApplicableStereotype(String qualifiedName);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.uml2.uml.Boolean" required="true" ordered="false" keywordDataType="org.eclipse.uml2.uml.String" keywordRequired="true" keywordOrdered="false"
	 * @generated
	 */
	boolean hasKeyword(String keyword);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void destroy();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The query allOwnedElements() gives all of the direct and indirect owned elements of an element.
	 * result = ownedElement->union(ownedElement->collect(e | e.allOwnedElements()))
	 * <!-- end-model-doc -->
	 * @model type="org.eclipse.uml2.uml.Element" ordered="false"
	 * @generated
	 */
	EList allOwnedElements();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The query mustBeOwned() indicates whether elements of this type must have an owner. Subclasses of Element that do not require an owner must override this operation.
	 * result = true
	 * <!-- end-model-doc -->
	 * @model dataType="org.eclipse.uml2.uml.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean mustBeOwned();

} // Element
