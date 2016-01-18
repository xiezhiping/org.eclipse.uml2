/*
 * Copyright (c) 2005, 2016 IBM Corporation, CEA, and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *   Kenn Hussey (CEA) - 327039, 212765, 418466, 451350, 485756
 *
 */
package org.eclipse.uml2.uml.internal.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.uml2.common.util.CacheAdapter;
import org.eclipse.uml2.common.util.DerivedUnionEObjectEList;

import org.eclipse.uml2.uml.Comment;
import org.eclipse.uml2.uml.Constraint;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.GeneralOrdering;
import org.eclipse.uml2.uml.Interaction;
import org.eclipse.uml2.uml.InteractionOperand;
import org.eclipse.uml2.uml.Lifeline;
import org.eclipse.uml2.uml.StateInvariant;
import org.eclipse.uml2.uml.StringExpression;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.VisibilityKind;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>State Invariant</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.StateInvariantImpl#getOwnedElements <em>Owned Element</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.StateInvariantImpl#getInvariant <em>Invariant</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.StateInvariantImpl#getCovereds <em>Covered</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StateInvariantImpl
		extends InteractionFragmentImpl
		implements StateInvariant {

	/**
	 * The cached value of the '{@link #getInvariant() <em>Invariant</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInvariant()
	 * @generated
	 * @ordered
	 */
	protected Constraint invariant;

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
	@Override
	protected EClass eStaticClass() {
		return UMLPackage.Literals.STATE_INVARIANT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Element> getOwnedElements() {
		CacheAdapter cache = getCacheAdapter();
		if (cache != null) {
			Resource eResource = eResource();
			@SuppressWarnings("unchecked")
			EList<Element> ownedElements = (EList<Element>) cache.get(eResource,
				this, UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
			if (ownedElements == null) {
				cache.put(eResource, this,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT,
					ownedElements = new DerivedUnionEObjectEList<Element>(
						Element.class, this,
						UMLPackage.STATE_INVARIANT__OWNED_ELEMENT,
						OWNED_ELEMENT_ESUBSETS));
			}
			return ownedElements;
		}
		return new DerivedUnionEObjectEList<Element>(Element.class, this,
			UMLPackage.STATE_INVARIANT__OWNED_ELEMENT, OWNED_ELEMENT_ESUBSETS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Constraint getInvariant() {
		if (invariant != null && invariant.eIsProxy()) {
			InternalEObject oldInvariant = (InternalEObject) invariant;
			invariant = (Constraint) eResolveProxy(oldInvariant);
			if (invariant != oldInvariant) {
				InternalEObject newInvariant = (InternalEObject) invariant;
				NotificationChain msgs = oldInvariant
					.eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE
							- UMLPackage.STATE_INVARIANT__INVARIANT,
						null, null);
				if (newInvariant.eInternalContainer() == null) {
					msgs = newInvariant.eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE
							- UMLPackage.STATE_INVARIANT__INVARIANT,
						null, msgs);
				}
				if (msgs != null)
					msgs.dispatch();
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
						UMLPackage.STATE_INVARIANT__INVARIANT, oldInvariant,
						invariant));
			}
		}
		return invariant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Constraint basicGetInvariant() {
		return invariant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInvariant(Constraint newInvariant,
			NotificationChain msgs) {
		Constraint oldInvariant = invariant;
		invariant = newInvariant;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
				Notification.SET, UMLPackage.STATE_INVARIANT__INVARIANT,
				oldInvariant, newInvariant);
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
		if (newInvariant != invariant) {
			NotificationChain msgs = null;
			if (invariant != null)
				msgs = ((InternalEObject) invariant)
					.eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE
							- UMLPackage.STATE_INVARIANT__INVARIANT,
						null, msgs);
			if (newInvariant != null)
				msgs = ((InternalEObject) newInvariant)
					.eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE
							- UMLPackage.STATE_INVARIANT__INVARIANT,
						null, msgs);
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
	public Constraint createInvariant(String name, EClass eClass) {
		Constraint newInvariant = (Constraint) create(eClass);
		setInvariant(newInvariant);
		if (name != null)
			newInvariant.setName(name);
		return newInvariant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Constraint createInvariant(String name) {
		return createInvariant(name, UMLPackage.Literals.CONSTRAINT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Lifeline> getCovereds() {
		if (covereds == null) {
			covereds = new EObjectWithInverseResolvingEList.ManyInverse<Lifeline>(
				Lifeline.class, this, UMLPackage.STATE_INVARIANT__COVERED,
				UMLPackage.LIFELINE__COVERED_BY);
		}
		return covereds;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Lifeline getCovered(String name) {
		return getCovered(name, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Lifeline getCovered(String name, boolean ignoreCase) {
		coveredLoop : for (Lifeline covered : getCovereds()) {
			if (name != null && !(ignoreCase
				? name.equalsIgnoreCase(covered.getName())
				: name.equals(covered.getName())))
				continue coveredLoop;
			return covered;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCovereds() {
		return covereds != null && !covereds.isEmpty();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UMLPackage.STATE_INVARIANT__EANNOTATIONS :
				return ((InternalEList<InternalEObject>) (InternalEList<?>) getEAnnotations())
					.basicAdd(otherEnd, msgs);
			case UMLPackage.STATE_INVARIANT__COVERED :
				return ((InternalEList<InternalEObject>) (InternalEList<?>) getCovereds())
					.basicAdd(otherEnd, msgs);
			case UMLPackage.STATE_INVARIANT__ENCLOSING_OPERAND :
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetEnclosingOperand((InteractionOperand) otherEnd,
					msgs);
			case UMLPackage.STATE_INVARIANT__ENCLOSING_INTERACTION :
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetEnclosingInteraction((Interaction) otherEnd,
					msgs);
		}
		return eDynamicInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UMLPackage.STATE_INVARIANT__EANNOTATIONS :
				return ((InternalEList<?>) getEAnnotations())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.STATE_INVARIANT__OWNED_COMMENT :
				return ((InternalEList<?>) getOwnedComments())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.STATE_INVARIANT__NAME_EXPRESSION :
				return basicSetNameExpression(null, msgs);
			case UMLPackage.STATE_INVARIANT__COVERED :
				return ((InternalEList<?>) getCovereds()).basicRemove(otherEnd,
					msgs);
			case UMLPackage.STATE_INVARIANT__ENCLOSING_OPERAND :
				return basicSetEnclosingOperand(null, msgs);
			case UMLPackage.STATE_INVARIANT__ENCLOSING_INTERACTION :
				return basicSetEnclosingInteraction(null, msgs);
			case UMLPackage.STATE_INVARIANT__GENERAL_ORDERING :
				return ((InternalEList<?>) getGeneralOrderings())
					.basicRemove(otherEnd, msgs);
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
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UMLPackage.STATE_INVARIANT__EANNOTATIONS :
				return getEAnnotations();
			case UMLPackage.STATE_INVARIANT__OWNED_COMMENT :
				return getOwnedComments();
			case UMLPackage.STATE_INVARIANT__OWNED_ELEMENT :
				return getOwnedElements();
			case UMLPackage.STATE_INVARIANT__OWNER :
				if (resolve)
					return getOwner();
				return basicGetOwner();
			case UMLPackage.STATE_INVARIANT__CLIENT_DEPENDENCY :
				return getClientDependencies();
			case UMLPackage.STATE_INVARIANT__NAME :
				return getName();
			case UMLPackage.STATE_INVARIANT__NAME_EXPRESSION :
				if (resolve)
					return getNameExpression();
				return basicGetNameExpression();
			case UMLPackage.STATE_INVARIANT__NAMESPACE :
				if (resolve)
					return getNamespace();
				return basicGetNamespace();
			case UMLPackage.STATE_INVARIANT__QUALIFIED_NAME :
				return getQualifiedName();
			case UMLPackage.STATE_INVARIANT__VISIBILITY :
				return getVisibility();
			case UMLPackage.STATE_INVARIANT__COVERED :
				return getCovereds();
			case UMLPackage.STATE_INVARIANT__ENCLOSING_OPERAND :
				if (resolve)
					return getEnclosingOperand();
				return basicGetEnclosingOperand();
			case UMLPackage.STATE_INVARIANT__ENCLOSING_INTERACTION :
				if (resolve)
					return getEnclosingInteraction();
				return basicGetEnclosingInteraction();
			case UMLPackage.STATE_INVARIANT__GENERAL_ORDERING :
				return getGeneralOrderings();
			case UMLPackage.STATE_INVARIANT__INVARIANT :
				if (resolve)
					return getInvariant();
				return basicGetInvariant();
		}
		return eDynamicGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case UMLPackage.STATE_INVARIANT__EANNOTATIONS :
				getEAnnotations().clear();
				getEAnnotations()
					.addAll((Collection<? extends EAnnotation>) newValue);
				return;
			case UMLPackage.STATE_INVARIANT__OWNED_COMMENT :
				getOwnedComments().clear();
				getOwnedComments()
					.addAll((Collection<? extends Comment>) newValue);
				return;
			case UMLPackage.STATE_INVARIANT__NAME :
				setName((String) newValue);
				return;
			case UMLPackage.STATE_INVARIANT__NAME_EXPRESSION :
				setNameExpression((StringExpression) newValue);
				return;
			case UMLPackage.STATE_INVARIANT__VISIBILITY :
				setVisibility((VisibilityKind) newValue);
				return;
			case UMLPackage.STATE_INVARIANT__COVERED :
				getCovereds().clear();
				getCovereds().addAll((Collection<? extends Lifeline>) newValue);
				return;
			case UMLPackage.STATE_INVARIANT__ENCLOSING_OPERAND :
				setEnclosingOperand((InteractionOperand) newValue);
				return;
			case UMLPackage.STATE_INVARIANT__ENCLOSING_INTERACTION :
				setEnclosingInteraction((Interaction) newValue);
				return;
			case UMLPackage.STATE_INVARIANT__GENERAL_ORDERING :
				getGeneralOrderings().clear();
				getGeneralOrderings()
					.addAll((Collection<? extends GeneralOrdering>) newValue);
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
	@Override
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
			case UMLPackage.STATE_INVARIANT__NAME_EXPRESSION :
				setNameExpression((StringExpression) null);
				return;
			case UMLPackage.STATE_INVARIANT__VISIBILITY :
				unsetVisibility();
				return;
			case UMLPackage.STATE_INVARIANT__COVERED :
				getCovereds().clear();
				return;
			case UMLPackage.STATE_INVARIANT__ENCLOSING_OPERAND :
				setEnclosingOperand((InteractionOperand) null);
				return;
			case UMLPackage.STATE_INVARIANT__ENCLOSING_INTERACTION :
				setEnclosingInteraction((Interaction) null);
				return;
			case UMLPackage.STATE_INVARIANT__GENERAL_ORDERING :
				getGeneralOrderings().clear();
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
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case UMLPackage.STATE_INVARIANT__EANNOTATIONS :
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UMLPackage.STATE_INVARIANT__OWNED_COMMENT :
				return ownedComments != null && !ownedComments.isEmpty();
			case UMLPackage.STATE_INVARIANT__OWNED_ELEMENT :
				return isSetOwnedElements();
			case UMLPackage.STATE_INVARIANT__OWNER :
				return isSetOwner();
			case UMLPackage.STATE_INVARIANT__CLIENT_DEPENDENCY :
				return !getClientDependencies().isEmpty();
			case UMLPackage.STATE_INVARIANT__NAME :
				return isSetName();
			case UMLPackage.STATE_INVARIANT__NAME_EXPRESSION :
				return nameExpression != null;
			case UMLPackage.STATE_INVARIANT__NAMESPACE :
				return isSetNamespace();
			case UMLPackage.STATE_INVARIANT__QUALIFIED_NAME :
				return QUALIFIED_NAME_EDEFAULT == null
					? getQualifiedName() != null
					: !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case UMLPackage.STATE_INVARIANT__VISIBILITY :
				return isSetVisibility();
			case UMLPackage.STATE_INVARIANT__COVERED :
				return isSetCovereds();
			case UMLPackage.STATE_INVARIANT__ENCLOSING_OPERAND :
				return basicGetEnclosingOperand() != null;
			case UMLPackage.STATE_INVARIANT__ENCLOSING_INTERACTION :
				return basicGetEnclosingInteraction() != null;
			case UMLPackage.STATE_INVARIANT__GENERAL_ORDERING :
				return generalOrderings != null && !generalOrderings.isEmpty();
			case UMLPackage.STATE_INVARIANT__INVARIANT :
				return invariant != null;
		}
		return eDynamicIsSet(featureID);
	}

	/**
	 * The array of subset feature identifiers for the '{@link #getOwnedElements() <em>Owned Element</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedElements()
	 * @generated
	 * @ordered
	 */
	protected static final int[] OWNED_ELEMENT_ESUBSETS = new int[]{
		UMLPackage.STATE_INVARIANT__OWNED_COMMENT,
		UMLPackage.STATE_INVARIANT__NAME_EXPRESSION,
		UMLPackage.STATE_INVARIANT__GENERAL_ORDERING,
		UMLPackage.STATE_INVARIANT__INVARIANT};

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetOwnedElements() {
		return super.isSetOwnedElements()
			|| eIsSet(UMLPackage.STATE_INVARIANT__INVARIANT);
	}

} //StateInvariantImpl
