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
 * $Id: StateInvariantImpl.java,v 1.2 2005/11/22 15:32:36 khussey Exp $
 */
package org.eclipse.uml2.uml.internal.impl;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
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
		return UMLPackage.eINSTANCE.getStateInvariant();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List getOwnedElements() {
		List ownedElement = (List) eVirtualGet(UMLPackage.STATE_INVARIANT__OWNED_ELEMENT);
		if (ownedElement == null) {
			eVirtualSet(UMLPackage.STATE_INVARIANT__OWNED_ELEMENT,
				ownedElement = new DerivedUnionEObjectEList(Element.class,
					this, UMLPackage.STATE_INVARIANT__OWNED_ELEMENT,
					new EStructuralFeature[]{
						UMLPackage.eINSTANCE.getElement_OwnedComment(),
						UMLPackage.eINSTANCE.getNamedElement_NameExpression(),
						UMLPackage.eINSTANCE
							.getInteractionFragment_GeneralOrdering(),
						UMLPackage.eINSTANCE.getStateInvariant_Invariant()}));
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
	public List getCovereds() {
		List covered = (List) eVirtualGet(UMLPackage.STATE_INVARIANT__COVERED);
		if (covered == null) {
			eVirtualSet(UMLPackage.STATE_INVARIANT__COVERED,
				covered = new EObjectResolvingEList(Lifeline.class, this,
					UMLPackage.STATE_INVARIANT__COVERED));
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
		List covered = (List) eVirtualGet(UMLPackage.STATE_INVARIANT__COVERED);
		return covered != null && !covered.isEmpty();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd,
			int featureID, Class baseClass, NotificationChain msgs) {
		if (featureID >= 0) {
			switch (eDerivedStructuralFeatureID(featureID, baseClass)) {
				case UMLPackage.STATE_INVARIANT__EANNOTATIONS :
					return ((InternalEList) getEAnnotations()).basicRemove(
						otherEnd, msgs);
				case UMLPackage.STATE_INVARIANT__OWNED_COMMENT :
					return ((InternalEList) getOwnedComments()).basicRemove(
						otherEnd, msgs);
				case UMLPackage.STATE_INVARIANT__CLIENT_DEPENDENCY :
					return ((InternalEList) getClientDependencies())
						.basicRemove(otherEnd, msgs);
				case UMLPackage.STATE_INVARIANT__NAME_EXPRESSION :
					return basicSetNameExpression(null, msgs);
				case UMLPackage.STATE_INVARIANT__COVERED :
					return ((InternalEList) getCovereds()).basicRemove(
						otherEnd, msgs);
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
				default :
					return eDynamicInverseRemove(otherEnd, featureID,
						baseClass, msgs);
			}
		}
		return eBasicSetContainer(null, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(EStructuralFeature eFeature, boolean resolve) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case UMLPackage.STATE_INVARIANT__EANNOTATIONS :
				return getEAnnotations();
			case UMLPackage.STATE_INVARIANT__OWNED_ELEMENT :
				return getOwnedElements();
			case UMLPackage.STATE_INVARIANT__OWNER :
				return getOwner();
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
		return eDynamicGet(eFeature, resolve);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eSet(EStructuralFeature eFeature, Object newValue) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
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
		eDynamicSet(eFeature, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eUnset(EStructuralFeature eFeature) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case UMLPackage.STATE_INVARIANT__EANNOTATIONS :
				getEAnnotations().clear();
				return;
			case UMLPackage.STATE_INVARIANT__OWNED_COMMENT :
				getOwnedComments().clear();
				return;
			case UMLPackage.STATE_INVARIANT__NAME :
				setName(NAME_EDEFAULT);
				return;
			case UMLPackage.STATE_INVARIANT__VISIBILITY :
				setVisibility(VISIBILITY_EDEFAULT);
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
		eDynamicUnset(eFeature);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean eIsSet(EStructuralFeature eFeature) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case UMLPackage.STATE_INVARIANT__EANNOTATIONS :
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UMLPackage.STATE_INVARIANT__OWNED_ELEMENT :
				return isSetOwnedElements();
			case UMLPackage.STATE_INVARIANT__OWNER :
				return isSetOwner();
			case UMLPackage.STATE_INVARIANT__OWNED_COMMENT :
				List ownedComment = (List) eVirtualGet(UMLPackage.STATE_INVARIANT__OWNED_COMMENT);
				return ownedComment != null && !ownedComment.isEmpty();
			case UMLPackage.STATE_INVARIANT__NAME :
				String name = (String) eVirtualGet(
					UMLPackage.STATE_INVARIANT__NAME, NAME_EDEFAULT);
				return NAME_EDEFAULT == null
					? name != null
					: !NAME_EDEFAULT.equals(name);
			case UMLPackage.STATE_INVARIANT__VISIBILITY :
				return eVirtualGet(UMLPackage.STATE_INVARIANT__VISIBILITY,
					VISIBILITY_EDEFAULT) != VISIBILITY_EDEFAULT;
			case UMLPackage.STATE_INVARIANT__QUALIFIED_NAME :
				return QUALIFIED_NAME_EDEFAULT == null
					? getQualifiedName() != null
					: !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case UMLPackage.STATE_INVARIANT__CLIENT_DEPENDENCY :
				List clientDependency = (List) eVirtualGet(UMLPackage.STATE_INVARIANT__CLIENT_DEPENDENCY);
				return clientDependency != null && !clientDependency.isEmpty();
			case UMLPackage.STATE_INVARIANT__NAMESPACE :
				return isSetNamespace();
			case UMLPackage.STATE_INVARIANT__NAME_EXPRESSION :
				return eVirtualGet(UMLPackage.STATE_INVARIANT__NAME_EXPRESSION) != null;
			case UMLPackage.STATE_INVARIANT__COVERED :
				return isSetCovereds();
			case UMLPackage.STATE_INVARIANT__GENERAL_ORDERING :
				List generalOrdering = (List) eVirtualGet(UMLPackage.STATE_INVARIANT__GENERAL_ORDERING);
				return generalOrdering != null && !generalOrdering.isEmpty();
			case UMLPackage.STATE_INVARIANT__ENCLOSING_INTERACTION :
				return getEnclosingInteraction() != null;
			case UMLPackage.STATE_INVARIANT__ENCLOSING_OPERAND :
				return getEnclosingOperand() != null;
			case UMLPackage.STATE_INVARIANT__INVARIANT :
				return eVirtualGet(UMLPackage.STATE_INVARIANT__INVARIANT) != null;
		}
		return eDynamicIsSet(eFeature);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOwnedElements() {
		return super.isSetOwnedElements()
			|| eIsSet(UMLPackage.eINSTANCE.getStateInvariant_Invariant());
	}

} //StateInvariantImpl
