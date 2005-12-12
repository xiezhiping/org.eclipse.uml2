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
 * $Id: OccurrenceSpecificationImpl.java,v 1.8 2005/12/12 16:58:35 khussey Exp $
 */
package org.eclipse.uml2.uml.internal.impl;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.uml2.uml.Event;
import org.eclipse.uml2.uml.GeneralOrdering;
import org.eclipse.uml2.uml.Interaction;
import org.eclipse.uml2.uml.InteractionOperand;
import org.eclipse.uml2.uml.Lifeline;
import org.eclipse.uml2.uml.OccurrenceSpecification;
import org.eclipse.uml2.uml.StringExpression;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.VisibilityKind;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Occurrence Specification</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.OccurrenceSpecificationImpl#getToBefores <em>To Before</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.OccurrenceSpecificationImpl#getEvent <em>Event</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.OccurrenceSpecificationImpl#getToAfters <em>To After</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.OccurrenceSpecificationImpl#getCovereds <em>Covered</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class OccurrenceSpecificationImpl
		extends InteractionFragmentImpl
		implements OccurrenceSpecification {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OccurrenceSpecificationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return UMLPackage.Literals.OCCURRENCE_SPECIFICATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List getToBefores() {
		List toBefore = (List) eVirtualGet(UMLPackage.OCCURRENCE_SPECIFICATION__TO_BEFORE);
		if (toBefore == null) {
			eVirtualSet(UMLPackage.OCCURRENCE_SPECIFICATION__TO_BEFORE,
				toBefore = new EObjectWithInverseResolvingEList(
					GeneralOrdering.class, this,
					UMLPackage.OCCURRENCE_SPECIFICATION__TO_BEFORE,
					UMLPackage.GENERAL_ORDERING__AFTER));
		}
		return toBefore;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeneralOrdering getToBefore(String name) {
		for (Iterator i = getToBefores().iterator(); i.hasNext();) {
			GeneralOrdering toBefore = (GeneralOrdering) i.next();
			if (name.equals(toBefore.getName())) {
				return toBefore;
			}
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Event getEvent() {
		Event event = (Event) eVirtualGet(UMLPackage.OCCURRENCE_SPECIFICATION__EVENT);
		if (event != null && event.eIsProxy()) {
			InternalEObject oldEvent = (InternalEObject) event;
			event = (Event) eResolveProxy(oldEvent);
			if (event != oldEvent) {
				eVirtualSet(UMLPackage.OCCURRENCE_SPECIFICATION__EVENT, event);
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
						UMLPackage.OCCURRENCE_SPECIFICATION__EVENT, oldEvent,
						event));
			}
		}
		return event;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Event basicGetEvent() {
		return (Event) eVirtualGet(UMLPackage.OCCURRENCE_SPECIFICATION__EVENT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEvent(Event newEvent) {
		Event event = newEvent;
		Object oldEvent = eVirtualSet(
			UMLPackage.OCCURRENCE_SPECIFICATION__EVENT, event);
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.OCCURRENCE_SPECIFICATION__EVENT,
				oldEvent == EVIRTUAL_NO_VALUE
					? null
					: oldEvent, event));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List getToAfters() {
		List toAfter = (List) eVirtualGet(UMLPackage.OCCURRENCE_SPECIFICATION__TO_AFTER);
		if (toAfter == null) {
			eVirtualSet(UMLPackage.OCCURRENCE_SPECIFICATION__TO_AFTER,
				toAfter = new EObjectWithInverseResolvingEList(
					GeneralOrdering.class, this,
					UMLPackage.OCCURRENCE_SPECIFICATION__TO_AFTER,
					UMLPackage.GENERAL_ORDERING__BEFORE));
		}
		return toAfter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeneralOrdering getToAfter(String name) {
		for (Iterator i = getToAfters().iterator(); i.hasNext();) {
			GeneralOrdering toAfter = (GeneralOrdering) i.next();
			if (name.equals(toAfter.getName())) {
				return toAfter;
			}
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List getCovereds() {
		List covered = (List) eVirtualGet(UMLPackage.OCCURRENCE_SPECIFICATION__COVERED);
		if (covered == null) {
			eVirtualSet(UMLPackage.OCCURRENCE_SPECIFICATION__COVERED,
				covered = new EObjectResolvingEList(Lifeline.class, this,
					UMLPackage.OCCURRENCE_SPECIFICATION__COVERED));
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
		List covered = (List) eVirtualGet(UMLPackage.OCCURRENCE_SPECIFICATION__COVERED);
		return covered != null && !covered.isEmpty();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UMLPackage.OCCURRENCE_SPECIFICATION__EANNOTATIONS :
				return ((InternalEList) getEAnnotations()).basicAdd(otherEnd,
					msgs);
			case UMLPackage.OCCURRENCE_SPECIFICATION__CLIENT_DEPENDENCY :
				return ((InternalEList) getClientDependencies()).basicAdd(
					otherEnd, msgs);
			case UMLPackage.OCCURRENCE_SPECIFICATION__COVERED :
				return ((InternalEList) getCovereds()).basicAdd(otherEnd, msgs);
			case UMLPackage.OCCURRENCE_SPECIFICATION__ENCLOSING_INTERACTION :
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return eBasicSetContainer(otherEnd,
					UMLPackage.OCCURRENCE_SPECIFICATION__ENCLOSING_INTERACTION,
					msgs);
			case UMLPackage.OCCURRENCE_SPECIFICATION__ENCLOSING_OPERAND :
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return eBasicSetContainer(otherEnd,
					UMLPackage.OCCURRENCE_SPECIFICATION__ENCLOSING_OPERAND,
					msgs);
			case UMLPackage.OCCURRENCE_SPECIFICATION__TO_BEFORE :
				return ((InternalEList) getToBefores())
					.basicAdd(otherEnd, msgs);
			case UMLPackage.OCCURRENCE_SPECIFICATION__TO_AFTER :
				return ((InternalEList) getToAfters()).basicAdd(otherEnd, msgs);
		}
		return eDynamicInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UMLPackage.OCCURRENCE_SPECIFICATION__EANNOTATIONS :
				return ((InternalEList) getEAnnotations()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.OCCURRENCE_SPECIFICATION__OWNED_COMMENT :
				return ((InternalEList) getOwnedComments()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.OCCURRENCE_SPECIFICATION__CLIENT_DEPENDENCY :
				return ((InternalEList) getClientDependencies()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.OCCURRENCE_SPECIFICATION__NAME_EXPRESSION :
				return basicSetNameExpression(null, msgs);
			case UMLPackage.OCCURRENCE_SPECIFICATION__COVERED :
				return ((InternalEList) getCovereds()).basicRemove(otherEnd,
					msgs);
			case UMLPackage.OCCURRENCE_SPECIFICATION__GENERAL_ORDERING :
				return ((InternalEList) getGeneralOrderings()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.OCCURRENCE_SPECIFICATION__ENCLOSING_INTERACTION :
				return eBasicSetContainer(null,
					UMLPackage.OCCURRENCE_SPECIFICATION__ENCLOSING_INTERACTION,
					msgs);
			case UMLPackage.OCCURRENCE_SPECIFICATION__ENCLOSING_OPERAND :
				return eBasicSetContainer(null,
					UMLPackage.OCCURRENCE_SPECIFICATION__ENCLOSING_OPERAND,
					msgs);
			case UMLPackage.OCCURRENCE_SPECIFICATION__TO_BEFORE :
				return ((InternalEList) getToBefores()).basicRemove(otherEnd,
					msgs);
			case UMLPackage.OCCURRENCE_SPECIFICATION__TO_AFTER :
				return ((InternalEList) getToAfters()).basicRemove(otherEnd,
					msgs);
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
			case UMLPackage.OCCURRENCE_SPECIFICATION__EANNOTATIONS :
				return getEAnnotations();
			case UMLPackage.OCCURRENCE_SPECIFICATION__OWNED_ELEMENT :
				return getOwnedElements();
			case UMLPackage.OCCURRENCE_SPECIFICATION__OWNER :
				if (resolve)
					return getOwner();
				return basicGetOwner();
			case UMLPackage.OCCURRENCE_SPECIFICATION__OWNED_COMMENT :
				return getOwnedComments();
			case UMLPackage.OCCURRENCE_SPECIFICATION__NAME :
				return getName();
			case UMLPackage.OCCURRENCE_SPECIFICATION__VISIBILITY :
				return getVisibility();
			case UMLPackage.OCCURRENCE_SPECIFICATION__QUALIFIED_NAME :
				return getQualifiedName();
			case UMLPackage.OCCURRENCE_SPECIFICATION__CLIENT_DEPENDENCY :
				return getClientDependencies();
			case UMLPackage.OCCURRENCE_SPECIFICATION__NAMESPACE :
				if (resolve)
					return getNamespace();
				return basicGetNamespace();
			case UMLPackage.OCCURRENCE_SPECIFICATION__NAME_EXPRESSION :
				return getNameExpression();
			case UMLPackage.OCCURRENCE_SPECIFICATION__COVERED :
				return getCovereds();
			case UMLPackage.OCCURRENCE_SPECIFICATION__GENERAL_ORDERING :
				return getGeneralOrderings();
			case UMLPackage.OCCURRENCE_SPECIFICATION__ENCLOSING_INTERACTION :
				return getEnclosingInteraction();
			case UMLPackage.OCCURRENCE_SPECIFICATION__ENCLOSING_OPERAND :
				return getEnclosingOperand();
			case UMLPackage.OCCURRENCE_SPECIFICATION__TO_BEFORE :
				return getToBefores();
			case UMLPackage.OCCURRENCE_SPECIFICATION__EVENT :
				if (resolve)
					return getEvent();
				return basicGetEvent();
			case UMLPackage.OCCURRENCE_SPECIFICATION__TO_AFTER :
				return getToAfters();
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
			case UMLPackage.OCCURRENCE_SPECIFICATION__EANNOTATIONS :
				getEAnnotations().clear();
				getEAnnotations().addAll((Collection) newValue);
				return;
			case UMLPackage.OCCURRENCE_SPECIFICATION__OWNED_COMMENT :
				getOwnedComments().clear();
				getOwnedComments().addAll((Collection) newValue);
				return;
			case UMLPackage.OCCURRENCE_SPECIFICATION__NAME :
				setName((String) newValue);
				return;
			case UMLPackage.OCCURRENCE_SPECIFICATION__VISIBILITY :
				setVisibility((VisibilityKind) newValue);
				return;
			case UMLPackage.OCCURRENCE_SPECIFICATION__CLIENT_DEPENDENCY :
				getClientDependencies().clear();
				getClientDependencies().addAll((Collection) newValue);
				return;
			case UMLPackage.OCCURRENCE_SPECIFICATION__NAME_EXPRESSION :
				setNameExpression((StringExpression) newValue);
				return;
			case UMLPackage.OCCURRENCE_SPECIFICATION__COVERED :
				getCovereds().clear();
				getCovereds().addAll((Collection) newValue);
				return;
			case UMLPackage.OCCURRENCE_SPECIFICATION__GENERAL_ORDERING :
				getGeneralOrderings().clear();
				getGeneralOrderings().addAll((Collection) newValue);
				return;
			case UMLPackage.OCCURRENCE_SPECIFICATION__ENCLOSING_INTERACTION :
				setEnclosingInteraction((Interaction) newValue);
				return;
			case UMLPackage.OCCURRENCE_SPECIFICATION__ENCLOSING_OPERAND :
				setEnclosingOperand((InteractionOperand) newValue);
				return;
			case UMLPackage.OCCURRENCE_SPECIFICATION__TO_BEFORE :
				getToBefores().clear();
				getToBefores().addAll((Collection) newValue);
				return;
			case UMLPackage.OCCURRENCE_SPECIFICATION__EVENT :
				setEvent((Event) newValue);
				return;
			case UMLPackage.OCCURRENCE_SPECIFICATION__TO_AFTER :
				getToAfters().clear();
				getToAfters().addAll((Collection) newValue);
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
			case UMLPackage.OCCURRENCE_SPECIFICATION__EANNOTATIONS :
				getEAnnotations().clear();
				return;
			case UMLPackage.OCCURRENCE_SPECIFICATION__OWNED_COMMENT :
				getOwnedComments().clear();
				return;
			case UMLPackage.OCCURRENCE_SPECIFICATION__NAME :
				unsetName();
				return;
			case UMLPackage.OCCURRENCE_SPECIFICATION__VISIBILITY :
				unsetVisibility();
				return;
			case UMLPackage.OCCURRENCE_SPECIFICATION__CLIENT_DEPENDENCY :
				getClientDependencies().clear();
				return;
			case UMLPackage.OCCURRENCE_SPECIFICATION__NAME_EXPRESSION :
				setNameExpression((StringExpression) null);
				return;
			case UMLPackage.OCCURRENCE_SPECIFICATION__COVERED :
				getCovereds().clear();
				return;
			case UMLPackage.OCCURRENCE_SPECIFICATION__GENERAL_ORDERING :
				getGeneralOrderings().clear();
				return;
			case UMLPackage.OCCURRENCE_SPECIFICATION__ENCLOSING_INTERACTION :
				setEnclosingInteraction((Interaction) null);
				return;
			case UMLPackage.OCCURRENCE_SPECIFICATION__ENCLOSING_OPERAND :
				setEnclosingOperand((InteractionOperand) null);
				return;
			case UMLPackage.OCCURRENCE_SPECIFICATION__TO_BEFORE :
				getToBefores().clear();
				return;
			case UMLPackage.OCCURRENCE_SPECIFICATION__EVENT :
				setEvent((Event) null);
				return;
			case UMLPackage.OCCURRENCE_SPECIFICATION__TO_AFTER :
				getToAfters().clear();
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
			case UMLPackage.OCCURRENCE_SPECIFICATION__EANNOTATIONS :
				EList eAnnotations = (EList) eVirtualGet(UMLPackage.OCCURRENCE_SPECIFICATION__EANNOTATIONS);
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UMLPackage.OCCURRENCE_SPECIFICATION__OWNED_ELEMENT :
				return isSetOwnedElements();
			case UMLPackage.OCCURRENCE_SPECIFICATION__OWNER :
				return isSetOwner();
			case UMLPackage.OCCURRENCE_SPECIFICATION__OWNED_COMMENT :
				List ownedComment = (List) eVirtualGet(UMLPackage.OCCURRENCE_SPECIFICATION__OWNED_COMMENT);
				return ownedComment != null && !ownedComment.isEmpty();
			case UMLPackage.OCCURRENCE_SPECIFICATION__NAME :
				return isSetName();
			case UMLPackage.OCCURRENCE_SPECIFICATION__VISIBILITY :
				return isSetVisibility();
			case UMLPackage.OCCURRENCE_SPECIFICATION__QUALIFIED_NAME :
				return QUALIFIED_NAME_EDEFAULT == null
					? getQualifiedName() != null
					: !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case UMLPackage.OCCURRENCE_SPECIFICATION__CLIENT_DEPENDENCY :
				List clientDependency = (List) eVirtualGet(UMLPackage.OCCURRENCE_SPECIFICATION__CLIENT_DEPENDENCY);
				return clientDependency != null && !clientDependency.isEmpty();
			case UMLPackage.OCCURRENCE_SPECIFICATION__NAMESPACE :
				return isSetNamespace();
			case UMLPackage.OCCURRENCE_SPECIFICATION__NAME_EXPRESSION :
				return eVirtualGet(UMLPackage.OCCURRENCE_SPECIFICATION__NAME_EXPRESSION) != null;
			case UMLPackage.OCCURRENCE_SPECIFICATION__COVERED :
				return isSetCovereds();
			case UMLPackage.OCCURRENCE_SPECIFICATION__GENERAL_ORDERING :
				List generalOrdering = (List) eVirtualGet(UMLPackage.OCCURRENCE_SPECIFICATION__GENERAL_ORDERING);
				return generalOrdering != null && !generalOrdering.isEmpty();
			case UMLPackage.OCCURRENCE_SPECIFICATION__ENCLOSING_INTERACTION :
				return getEnclosingInteraction() != null;
			case UMLPackage.OCCURRENCE_SPECIFICATION__ENCLOSING_OPERAND :
				return getEnclosingOperand() != null;
			case UMLPackage.OCCURRENCE_SPECIFICATION__TO_BEFORE :
				List toBefore = (List) eVirtualGet(UMLPackage.OCCURRENCE_SPECIFICATION__TO_BEFORE);
				return toBefore != null && !toBefore.isEmpty();
			case UMLPackage.OCCURRENCE_SPECIFICATION__EVENT :
				return eVirtualGet(UMLPackage.OCCURRENCE_SPECIFICATION__EVENT) != null;
			case UMLPackage.OCCURRENCE_SPECIFICATION__TO_AFTER :
				List toAfter = (List) eVirtualGet(UMLPackage.OCCURRENCE_SPECIFICATION__TO_AFTER);
				return toAfter != null && !toAfter.isEmpty();
		}
		return eDynamicIsSet(featureID);
	}

} //OccurrenceSpecificationImpl
