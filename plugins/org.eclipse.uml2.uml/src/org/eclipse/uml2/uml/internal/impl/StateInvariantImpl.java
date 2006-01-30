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
 * $Id: StateInvariantImpl.java,v 1.10 2006/01/30 23:06:54 khussey Exp $
 */
package org.eclipse.uml2.uml.internal.impl;

import java.util.Collection;
import java.util.Iterator;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.uml2.common.util.DerivedUnionEObjectEList;

import org.eclipse.uml2.uml.Constraint;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Interaction;
import org.eclipse.uml2.uml.InteractionOperand;
import org.eclipse.uml2.uml.Lifeline;
import org.eclipse.uml2.uml.StateInvariant;
import org.eclipse.uml2.uml.StringExpression;
import org.eclipse.uml2.uml.UMLFactory;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.VisibilityKind;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>State Invariant</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.StateInvariantImpl#getOwnedElements <em>Owned Element</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.StateInvariantImpl#getInvariant <em>Invariant</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.StateInvariantImpl#getCovereds <em>Covered</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StateInvariantImpl
		extends InteractionFragmentImpl
		implements StateInvariant {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StateInvariantImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return UMLPackage.Literals.STATE_INVARIANT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getOwnedElements() {
		EList ownedElement = (EList) eVirtualGet(UMLPackage.STATE_INVARIANT__OWNED_ELEMENT);
		if (ownedElement == null) {
			eVirtualSet(UMLPackage.STATE_INVARIANT__OWNED_ELEMENT,
				ownedElement = new DerivedUnionEObjectEList(Element.class,
					this, UMLPackage.STATE_INVARIANT__OWNED_ELEMENT, new int[]{
						UMLPackage.STATE_INVARIANT__OWNED_COMMENT,
						UMLPackage.STATE_INVARIANT__NAME_EXPRESSION,
						UMLPackage.STATE_INVARIANT__GENERAL_ORDERING,
						UMLPackage.STATE_INVARIANT__INVARIANT}));
		}
		return ownedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Constraint getInvariant() {
		return (Constraint) eVirtualGet(UMLPackage.STATE_INVARIANT__INVARIANT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInvariant(Constraint newInvariant,
			NotificationChain msgs) {
		Object oldInvariant = eVirtualSet(
			UMLPackage.STATE_INVARIANT__INVARIANT, newInvariant);
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
				Notification.SET, UMLPackage.STATE_INVARIANT__INVARIANT,
				oldInvariant == EVIRTUAL_NO_VALUE
					? null
					: oldInvariant, newInvariant);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}

		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInvariant(Constraint newInvariant) {
		Constraint invariant = (Constraint) eVirtualGet(UMLPackage.STATE_INVARIANT__INVARIANT);
		if (newInvariant != invariant) {
			NotificationChain msgs = null;
			if (invariant != null)
				msgs = ((InternalEObject) invariant).eInverseRemove(this,
					EOPPOSITE_FEATURE_BASE
						- UMLPackage.STATE_INVARIANT__INVARIANT, null, msgs);
			if (newInvariant != null)
				msgs = ((InternalEObject) newInvariant).eInverseAdd(this,
					EOPPOSITE_FEATURE_BASE
						- UMLPackage.STATE_INVARIANT__INVARIANT, null, msgs);
			msgs = basicSetInvariant(newInvariant, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.STATE_INVARIANT__INVARIANT, newInvariant,
				newInvariant));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Constraint createInvariant(EClass eClass) {
		Constraint newInvariant = (Constraint) eClass.getEPackage()
			.getEFactoryInstance().create(eClass);
		setInvariant(newInvariant);
		return newInvariant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Constraint createInvariant() {
		Constraint newInvariant = UMLFactory.eINSTANCE.createConstraint();
		setInvariant(newInvariant);
		return newInvariant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getCovereds() {
		EList covered = (EList) eVirtualGet(UMLPackage.STATE_INVARIANT__COVERED);
		if (covered == null) {
			eVirtualSet(UMLPackage.STATE_INVARIANT__COVERED,
				covered = new EObjectWithInverseResolvingEList.ManyInverse(
					Lifeline.class, this, UMLPackage.STATE_INVARIANT__COVERED,
					UMLPackage.LIFELINE__COVERED_BY));
		}
		return covered;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Lifeline getCovered(String name) {
		for (Iterator i = getCovereds().iterator(); i.hasNext();) {
			Lifeline covered = (Lifeline) i.next();
			if (name.equals(covered.getName())) {
				return covered;
			}
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCovereds() {
		EList covered = (EList) eVirtualGet(UMLPackage.STATE_INVARIANT__COVERED);
		return covered != null && !covered.isEmpty();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UMLPackage.STATE_INVARIANT__EANNOTATIONS :
				return ((InternalEList) getEAnnotations()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.STATE_INVARIANT__OWNED_COMMENT :
				return ((InternalEList) getOwnedComments()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.STATE_INVARIANT__CLIENT_DEPENDENCY :
				return ((InternalEList) getClientDependencies()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.STATE_INVARIANT__NAME_EXPRESSION :
				return basicSetNameExpression(null, msgs);
			case UMLPackage.STATE_INVARIANT__COVERED :
				return ((InternalEList) getCovereds()).basicRemove(otherEnd,
					msgs);
			case UMLPackage.STATE_INVARIANT__GENERAL_ORDERING :
				return ((InternalEList) getGeneralOrderings()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.STATE_INVARIANT__ENCLOSING_INTERACTION :
				return eBasicSetContainer(null,
					UMLPackage.STATE_INVARIANT__ENCLOSING_INTERACTION, msgs);
			case UMLPackage.STATE_INVARIANT__ENCLOSING_OPERAND :
				return eBasicSetContainer(null,
					UMLPackage.STATE_INVARIANT__ENCLOSING_OPERAND, msgs);
			case UMLPackage.STATE_INVARIANT__INVARIANT :
				return basicSetInvariant(null, msgs);
		}
		return eDynamicInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UMLPackage.STATE_INVARIANT__EANNOTATIONS :
				return getEAnnotations();
			case UMLPackage.STATE_INVARIANT__OWNED_ELEMENT :
				return getOwnedElements();
			case UMLPackage.STATE_INVARIANT__OWNER :
				if (resolve)
					return getOwner();
				return basicGetOwner();
			case UMLPackage.STATE_INVARIANT__OWNED_COMMENT :
				return getOwnedComments();
			case UMLPackage.STATE_INVARIANT__NAME :
				return getName();
			case UMLPackage.STATE_INVARIANT__VISIBILITY :
				return getVisibility();
			case UMLPackage.STATE_INVARIANT__QUALIFIED_NAME :
				return getQualifiedName();
			case UMLPackage.STATE_INVARIANT__CLIENT_DEPENDENCY :
				return getClientDependencies();
			case UMLPackage.STATE_INVARIANT__NAMESPACE :
				if (resolve)
					return getNamespace();
				return basicGetNamespace();
			case UMLPackage.STATE_INVARIANT__NAME_EXPRESSION :
				return getNameExpression();
			case UMLPackage.STATE_INVARIANT__COVERED :
				return getCovereds();
			case UMLPackage.STATE_INVARIANT__GENERAL_ORDERING :
				return getGeneralOrderings();
			case UMLPackage.STATE_INVARIANT__ENCLOSING_INTERACTION :
				return getEnclosingInteraction();
			case UMLPackage.STATE_INVARIANT__ENCLOSING_OPERAND :
				return getEnclosingOperand();
			case UMLPackage.STATE_INVARIANT__INVARIANT :
				return getInvariant();
		}
		return eDynamicGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case UMLPackage.STATE_INVARIANT__EANNOTATIONS :
				getEAnnotations().clear();
				getEAnnotations().addAll((Collection) newValue);
				return;
			case UMLPackage.STATE_INVARIANT__OWNED_COMMENT :
				getOwnedComments().clear();
				getOwnedComments().addAll((Collection) newValue);
				return;
			case UMLPackage.STATE_INVARIANT__NAME :
				setName((String) newValue);
				return;
			case UMLPackage.STATE_INVARIANT__VISIBILITY :
				setVisibility((VisibilityKind) newValue);
				return;
			case UMLPackage.STATE_INVARIANT__CLIENT_DEPENDENCY :
				getClientDependencies().clear();
				getClientDependencies().addAll((Collection) newValue);
				return;
			case UMLPackage.STATE_INVARIANT__NAME_EXPRESSION :
				setNameExpression((StringExpression) newValue);
				return;
			case UMLPackage.STATE_INVARIANT__COVERED :
				getCovereds().clear();
				getCovereds().addAll((Collection) newValue);
				return;
			case UMLPackage.STATE_INVARIANT__GENERAL_ORDERING :
				getGeneralOrderings().clear();
				getGeneralOrderings().addAll((Collection) newValue);
				return;
			case UMLPackage.STATE_INVARIANT__ENCLOSING_INTERACTION :
				setEnclosingInteraction((Interaction) newValue);
				return;
			case UMLPackage.STATE_INVARIANT__ENCLOSING_OPERAND :
				setEnclosingOperand((InteractionOperand) newValue);
				return;
			case UMLPackage.STATE_INVARIANT__INVARIANT :
				setInvariant((Constraint) newValue);
				return;
		}
		eDynamicSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eUnset(int featureID) {
		switch (featureID) {
			case UMLPackage.STATE_INVARIANT__EANNOTATIONS :
				getEAnnotations().clear();
				return;
			case UMLPackage.STATE_INVARIANT__OWNED_COMMENT :
				getOwnedComments().clear();
				return;
			case UMLPackage.STATE_INVARIANT__NAME :
				unsetName();
				return;
			case UMLPackage.STATE_INVARIANT__VISIBILITY :
				unsetVisibility();
				return;
			case UMLPackage.STATE_INVARIANT__CLIENT_DEPENDENCY :
				getClientDependencies().clear();
				return;
			case UMLPackage.STATE_INVARIANT__NAME_EXPRESSION :
				setNameExpression((StringExpression) null);
				return;
			case UMLPackage.STATE_INVARIANT__COVERED :
				getCovereds().clear();
				return;
			case UMLPackage.STATE_INVARIANT__GENERAL_ORDERING :
				getGeneralOrderings().clear();
				return;
			case UMLPackage.STATE_INVARIANT__ENCLOSING_INTERACTION :
				setEnclosingInteraction((Interaction) null);
				return;
			case UMLPackage.STATE_INVARIANT__ENCLOSING_OPERAND :
				setEnclosingOperand((InteractionOperand) null);
				return;
			case UMLPackage.STATE_INVARIANT__INVARIANT :
				setInvariant((Constraint) null);
				return;
		}
		eDynamicUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case UMLPackage.STATE_INVARIANT__EANNOTATIONS :
				EList eAnnotations = (EList) eVirtualGet(UMLPackage.STATE_INVARIANT__EANNOTATIONS);
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UMLPackage.STATE_INVARIANT__OWNED_ELEMENT :
				return isSetOwnedElements();
			case UMLPackage.STATE_INVARIANT__OWNER :
				return isSetOwner();
			case UMLPackage.STATE_INVARIANT__OWNED_COMMENT :
				EList ownedComment = (EList) eVirtualGet(UMLPackage.STATE_INVARIANT__OWNED_COMMENT);
				return ownedComment != null && !ownedComment.isEmpty();
			case UMLPackage.STATE_INVARIANT__NAME :
				return isSetName();
			case UMLPackage.STATE_INVARIANT__VISIBILITY :
				return isSetVisibility();
			case UMLPackage.STATE_INVARIANT__QUALIFIED_NAME :
				return QUALIFIED_NAME_EDEFAULT == null
					? getQualifiedName() != null
					: !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case UMLPackage.STATE_INVARIANT__CLIENT_DEPENDENCY :
				EList clientDependency = (EList) eVirtualGet(UMLPackage.STATE_INVARIANT__CLIENT_DEPENDENCY);
				return clientDependency != null && !clientDependency.isEmpty();
			case UMLPackage.STATE_INVARIANT__NAMESPACE :
				return isSetNamespace();
			case UMLPackage.STATE_INVARIANT__NAME_EXPRESSION :
				return eVirtualGet(UMLPackage.STATE_INVARIANT__NAME_EXPRESSION) != null;
			case UMLPackage.STATE_INVARIANT__COVERED :
				return isSetCovereds();
			case UMLPackage.STATE_INVARIANT__GENERAL_ORDERING :
				EList generalOrdering = (EList) eVirtualGet(UMLPackage.STATE_INVARIANT__GENERAL_ORDERING);
				return generalOrdering != null && !generalOrdering.isEmpty();
			case UMLPackage.STATE_INVARIANT__ENCLOSING_INTERACTION :
				return getEnclosingInteraction() != null;
			case UMLPackage.STATE_INVARIANT__ENCLOSING_OPERAND :
				return getEnclosingOperand() != null;
			case UMLPackage.STATE_INVARIANT__INVARIANT :
				return eVirtualGet(UMLPackage.STATE_INVARIANT__INVARIANT) != null;
		}
		return eDynamicIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOwnedElements() {
		return super.isSetOwnedElements()
			|| eIsSet(UMLPackage.STATE_INVARIANT__INVARIANT);
	}

} //StateInvariantImpl
