/*
 * Copyright (c) 2003, 2005 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *
 * $Id: Association.java,v 1.11 2005/05/18 16:38:29 khussey Exp $
 */
package org.eclipse.uml2;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Association</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An association specifies a semantic relationship that can occur between typed instances. It has at least two ends represented by properties, each of which is connected to the type of the end. More than one end of the association may have the same type. When a property is owned by an association it represents a non-navigable end of the association. In this case the property does not appear in the namespace of any of the associated classifiers. When a property at an end of an association is owned by one of the associated classifiers it represents a navigable end of the association. In this case the property is also an attribute of the associated classifier. Only binary associations may have navigable ends. 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2.Association#isDerived <em>Is Derived</em>}</li>
 *   <li>{@link org.eclipse.uml2.Association#getOwnedEnds <em>Owned End</em>}</li>
 *   <li>{@link org.eclipse.uml2.Association#getEndTypes <em>End Type</em>}</li>
 *   <li>{@link org.eclipse.uml2.Association#getMemberEnds <em>Member End</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.uml2.UML2Package#getAssociation()
 * @model
 * @generated
 */
public interface Association extends Classifier, Relationship{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) IBM Corporation and others."; //$NON-NLS-1$

	/**
	 * Returns the value of the '<em><b>Is Derived</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Derived</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies whether the association is derived from other model elements such as other associations or constraints. The default value is false.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Derived</em>' attribute.
	 * @see #setIsDerived(boolean)
	 * @see org.eclipse.uml2.UML2Package#getAssociation_IsDerived()
	 * @model default="false" dataType="org.eclipse.uml2.Boolean"
	 * @generated
	 */
	boolean isDerived();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.Association#isDerived <em>Is Derived</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Derived</em>' attribute.
	 * @see #isDerived()
	 * @generated
	 */
	void setIsDerived(boolean value);


	/**
	 * Returns the value of the '<em><b>Owned End</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2.Property}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.uml2.Property#getOwningAssociation <em>Owning Association</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned End</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The non-navigable ends that are owned by the association itself. This is an ordered association. Subsets Association::memberEnd, Classifier::feature, and Namespace::owned- Member.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned End</em>' containment reference list.
	 * @see org.eclipse.uml2.UML2Package#getAssociation_OwnedEnd()
	 * @see org.eclipse.uml2.Property#getOwningAssociation
	 * @model type="org.eclipse.uml2.Property" opposite="owningAssociation" containment="true" required="true"
	 * @generated
	 */
	EList getOwnedEnds();


    /**
     * Retrieves the {@link org.eclipse.uml2.Property} with the specified '<em><b>Name</b></em>' from the '<em><b>Owned End</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.Property} to retrieve.
	 * @return The {@link org.eclipse.uml2.Property} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getOwnedEnds()
	 * @generated
     */
    Property getOwnedEnd(String unqualifiedName);
      
    /**
     * Creates a {@link org.eclipse.uml2.Property} and appends it to the '<em><b>Owned End</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param eClass The Ecore class of the {@link org.eclipse.uml2.Property} to create.
	 * @return The new {@link org.eclipse.uml2.Property}.
	 * @see #getOwnedEnds()
	 * @generated
     */
    Property createOwnedEnd(EClass eClass);

    /**
     * Creates a {@link org.eclipse.uml2.Property} and appends it to the '<em><b>Owned End</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return The new {@link org.eclipse.uml2.Property}.
	 * @see #getOwnedEnds()
	 * @generated
     */
    Property createOwnedEnd();

	/**
	 * Returns the value of the '<em><b>End Type</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.Type}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End Type</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * References the classifiers that are used as types of the ends of the association.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>End Type</em>' reference list.
	 * @see org.eclipse.uml2.UML2Package#getAssociation_EndType()
	 * @model type="org.eclipse.uml2.Type" required="true" transient="true" changeable="false" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	EList getEndTypes();


    /**
     * Retrieves the {@link org.eclipse.uml2.Type} with the specified '<em><b>Name</b></em>' from the '<em><b>End Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.Type} to retrieve.
	 * @return The {@link org.eclipse.uml2.Type} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getEndTypes()
	 * @generated
     */
    Type getEndType(String unqualifiedName);
      
	/**
	 * Returns the value of the '<em><b>Member End</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.Property}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.uml2.Property#getAssociation <em>Association</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Member End</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Each end represents participation of instances of the classifier connected to the end in links of the association. This is an ordered association. Subsets Namespace::member.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Member End</em>' reference list.
	 * @see org.eclipse.uml2.UML2Package#getAssociation_MemberEnd()
	 * @see org.eclipse.uml2.Property#getAssociation
	 * @model type="org.eclipse.uml2.Property" opposite="association" lower="2"
	 * @generated
	 */
	EList getMemberEnds();


    /**
     * Retrieves the {@link org.eclipse.uml2.Property} with the specified '<em><b>Name</b></em>' from the '<em><b>Member End</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.Property} to retrieve.
	 * @return The {@link org.eclipse.uml2.Property} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getMemberEnds()
	 * @generated
     */
    Property getMemberEnd(String unqualifiedName);
      
	// <!-- begin-custom-operations -->

	/**
	 * Determines whether this association is a binary association, i.e. whether
	 * it has exactly two member ends.
	 * 
	 * @return <code>true</code> if this association is binary;
	 *         <code>false</code> otherwise.
	 */
	public boolean isBinary();
	
	// <!-- end-custom-operations -->

} // Association
