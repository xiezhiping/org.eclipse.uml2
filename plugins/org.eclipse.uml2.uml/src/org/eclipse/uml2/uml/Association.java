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
 * $Id: Association.java,v 1.1 2005/11/14 22:25:58 khussey Exp $
 */
package org.eclipse.uml2.uml;

import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Association</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An association specifies a semantic relationship that can occur between typed instances. It has at least two ends represented by properties, each of which is connected to the type of the end. More than one end of an association may have the same type.
 * 
 * 
 * 
 * An end property of an association that is owned by an end class or that is a navigable owned end of the association indicates that the association is navigable from the opposite ends, otherwise the association is not navigable from the opposite ends.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.Association#isDerived <em>Is Derived</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Association#getEndTypes <em>End Type</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Association#getMemberEnds <em>Member End</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Association#getNavigableOwnedEnds <em>Navigable Owned End</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Association#getOwnedEnds <em>Owned End</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.uml2.uml.UMLPackage#getAssociation()
 * @model
 * @generated
 */
public interface Association
		extends Classifier, Relationship {

	/**
	 * Returns the value of the '<em><b>Is Derived</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies whether the association is derived from other model elements such as other associations or constraints.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Derived</em>' attribute.
	 * @see #setIsDerived(boolean)
	 * @see org.eclipse.uml2.uml.UMLPackage#getAssociation_IsDerived()
	 * @model default="false" required="true" ordered="false"
	 * @generated
	 */
	boolean isDerived();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.uml.Association#isDerived <em>Is Derived</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Derived</em>' attribute.
	 * @see #isDerived()
	 * @generated
	 */
	void setIsDerived(boolean value);

	/**
	 * Returns the value of the '<em><b>End Type</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.Type}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * References the classifiers that are used as types of the ends of the association.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>End Type</em>' reference list.
	 * @see org.eclipse.uml2.uml.UMLPackage#getAssociation_EndType()
	 * @model type="org.eclipse.uml2.uml.Type" required="true" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	List getEndTypes();

	/**
	 * Retrieves the {@link org.eclipse.uml2.uml.Type} with the specified '<em><b>Name</b></em>' from the '<em><b>End Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.Type} to retrieve.
	 * @return The {@link org.eclipse.uml2.uml.Type} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getEndTypes()
	 * @generated
	 */
	Type getEndType(String name);

	/**
	 * Returns the value of the '<em><b>Member End</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.Property}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.uml2.uml.Property#getAssociation <em>Association</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Each end represents participation of instances of the classifier connected to the end in links of the association. This is an ordered association.
	 * Each end represents participation of instances of the classifier connected to the end in links of the association.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Member End</em>' reference list.
	 * @see org.eclipse.uml2.uml.UMLPackage#getAssociation_MemberEnd()
	 * @see org.eclipse.uml2.uml.Property#getAssociation
	 * @model type="org.eclipse.uml2.uml.Property" opposite="association" lower="2"
	 * @generated
	 */
	List getMemberEnds();

	/**
	 * Retrieves the {@link org.eclipse.uml2.uml.Property} with the specified '<em><b>Name</b></em>' from the '<em><b>Member End</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.Property} to retrieve.
	 * @return The {@link org.eclipse.uml2.uml.Property} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getMemberEnds()
	 * @generated
	 */
	Property getMemberEnd(String name);

	/**
	 * Returns the value of the '<em><b>Navigable Owned End</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.Property}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The navigable ends that are owned by the association itself.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Navigable Owned End</em>' reference list.
	 * @see org.eclipse.uml2.uml.UMLPackage#getAssociation_NavigableOwnedEnd()
	 * @model type="org.eclipse.uml2.uml.Property" resolveProxies="false" ordered="false"
	 * @generated
	 */
	List getNavigableOwnedEnds();

	/**
	 * Retrieves the {@link org.eclipse.uml2.uml.Property} with the specified '<em><b>Name</b></em>' from the '<em><b>Navigable Owned End</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.Property} to retrieve.
	 * @return The {@link org.eclipse.uml2.uml.Property} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getNavigableOwnedEnds()
	 * @generated
	 */
	Property getNavigableOwnedEnd(String name);

	/**
	 * Returns the value of the '<em><b>Owned End</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.Property}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.uml2.uml.Property#getOwningAssociation <em>Owning Association</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The ends that are owned by the association itself. This is an ordered association.
	 * The ends that are owned by the association itself.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned End</em>' containment reference list.
	 * @see org.eclipse.uml2.uml.UMLPackage#getAssociation_OwnedEnd()
	 * @see org.eclipse.uml2.uml.Property#getOwningAssociation
	 * @model type="org.eclipse.uml2.uml.Property" opposite="owningAssociation" containment="true" resolveProxies="false"
	 * @generated
	 */
	List getOwnedEnds();

	/**
	 * Creates a {@link org.eclipse.uml2.uml.Property} and appends it to the '<em><b>Owned End</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param eClass The Ecore class of the {@link org.eclipse.uml2.uml.Property} to create.
	 * @return The new {@link org.eclipse.uml2.uml.Property}.
	 * @see #getOwnedEnds()
	 * @generated
	 */
	Property createOwnedEnd(EClass eClass);

	/**
	 * Creates a {@link org.eclipse.uml2.uml.Property} and appends it to the '<em><b>Owned End</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return The new {@link org.eclipse.uml2.uml.Property}.
	 * @see #getOwnedEnds()
	 * @generated
	 */
	Property createOwnedEnd();

	/**
	 * Retrieves the {@link org.eclipse.uml2.uml.Property} with the specified '<em><b>Name</b></em>' from the '<em><b>Owned End</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.Property} to retrieve.
	 * @return The {@link org.eclipse.uml2.uml.Property} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getOwnedEnds()
	 * @generated
	 */
	Property getOwnedEnd(String name);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An association specializing another association has the same number of ends as the other association.
	 * self.parents()->forAll(p | p.memberEnd.size() = self.memberEnd.size())
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validateSpecializedEndNumber(DiagnosticChain diagnostics,
			Map context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * When an association specializes another association, every end of the specific association corresponds to an end of the general association, and the specific end reaches the same type or a subtype of the more general end.
	 * true
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validateSpecializedEndTypes(DiagnosticChain diagnostics, Map context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Only binary associations can be aggregations.
	 * self.memberEnd->exists(aggregation <> Aggregation::none) implies self.memberEnd->size() = 2
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validateBinaryAssociations(DiagnosticChain diagnostics, Map context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Association ends of associations with more than two ends must be owned by the association.
	 * if memberEnd->size() > 2 then ownedEnd->includesAll(memberEnd)
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validateAssociationEnds(DiagnosticChain diagnostics, Map context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * endType is derived from the types of the member ends.
	 * result = self.memberEnd->collect(e | e.type)
	 * <!-- end-model-doc -->
	 * @model type="org.eclipse.uml2.uml.Type"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='spec'"
	 * @generated
	 */
	List endType();

} // Association
