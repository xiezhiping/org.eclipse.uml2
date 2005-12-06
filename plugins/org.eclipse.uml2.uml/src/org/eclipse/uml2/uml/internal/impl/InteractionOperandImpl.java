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
 * $Id: InteractionOperandImpl.java,v 1.7 2005/12/06 23:21:48 khussey Exp $
 */
package org.eclipse.uml2.uml.internal.impl;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.uml2.common.util.DerivedUnionEObjectEList;

import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.GeneralOrdering;
import org.eclipse.uml2.uml.Interaction;
import org.eclipse.uml2.uml.InteractionConstraint;
import org.eclipse.uml2.uml.InteractionFragment;
import org.eclipse.uml2.uml.InteractionOperand;
import org.eclipse.uml2.uml.Lifeline;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Namespace;
import org.eclipse.uml2.uml.StringExpression;
import org.eclipse.uml2.uml.UMLFactory;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.VisibilityKind;

import org.eclipse.uml2.uml.internal.operations.InteractionOperandOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Interaction Operand</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.InteractionOperandImpl#getOwnedElements <em>Owned Element</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.InteractionOperandImpl#getCovereds <em>Covered</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.InteractionOperandImpl#getGeneralOrderings <em>General Ordering</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.InteractionOperandImpl#getEnclosingInteraction <em>Enclosing Interaction</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.InteractionOperandImpl#getEnclosingOperand <em>Enclosing Operand</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.InteractionOperandImpl#getOwnedMembers <em>Owned Member</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.InteractionOperandImpl#getGuard <em>Guard</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.InteractionOperandImpl#getFragments <em>Fragment</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InteractionOperandImpl
		extends NamespaceImpl
		implements InteractionOperand {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InteractionOperandImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return UMLPackage.Literals.INTERACTION_OPERAND;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List getOwnedElements() {
		List ownedElement = (List) eVirtualGet(UMLPackage.INTERACTION_OPERAND__OWNED_ELEMENT);
		if (ownedElement == null) {
			eVirtualSet(UMLPackage.INTERACTION_OPERAND__OWNED_ELEMENT,
				ownedElement = new DerivedUnionEObjectEList(Element.class,
					this, UMLPackage.INTERACTION_OPERAND__OWNED_ELEMENT,
					new int[]{UMLPackage.INTERACTION_OPERAND__OWNED_COMMENT,
						UMLPackage.INTERACTION_OPERAND__NAME_EXPRESSION,
						UMLPackage.INTERACTION_OPERAND__ELEMENT_IMPORT,
						UMLPackage.INTERACTION_OPERAND__PACKAGE_IMPORT,
						UMLPackage.INTERACTION_OPERAND__OWNED_MEMBER,
						UMLPackage.INTERACTION_OPERAND__GENERAL_ORDERING,
						UMLPackage.INTERACTION_OPERAND__GUARD}));
		}
		return ownedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List getCovereds() {
		List covered = (List) eVirtualGet(UMLPackage.INTERACTION_OPERAND__COVERED);
		if (covered == null) {
			eVirtualSet(UMLPackage.INTERACTION_OPERAND__COVERED,
				covered = new EObjectWithInverseResolvingEList.ManyInverse(
					Lifeline.class, this,
					UMLPackage.INTERACTION_OPERAND__COVERED,
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
	public List getGeneralOrderings() {
		List generalOrdering = (List) eVirtualGet(UMLPackage.INTERACTION_OPERAND__GENERAL_ORDERING);
		if (generalOrdering == null) {
			eVirtualSet(UMLPackage.INTERACTION_OPERAND__GENERAL_ORDERING,
				generalOrdering = new EObjectContainmentEList(
					GeneralOrdering.class, this,
					UMLPackage.INTERACTION_OPERAND__GENERAL_ORDERING));
		}
		return generalOrdering;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeneralOrdering createGeneralOrdering() {
		GeneralOrdering newGeneralOrdering = UMLFactory.eINSTANCE
			.createGeneralOrdering();
		getGeneralOrderings().add(newGeneralOrdering);
		return newGeneralOrdering;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeneralOrdering getGeneralOrdering(String name) {
		for (Iterator i = getGeneralOrderings().iterator(); i.hasNext();) {
			GeneralOrdering generalOrdering = (GeneralOrdering) i.next();
			if (name.equals(generalOrdering.getName())) {
				return generalOrdering;
			}
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Interaction getEnclosingInteraction() {
		if (eContainerFeatureID != UMLPackage.INTERACTION_OPERAND__ENCLOSING_INTERACTION)
			return null;
		return (Interaction) eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnclosingInteraction(Interaction newEnclosingInteraction) {
		if (newEnclosingInteraction != eInternalContainer()
			|| (eContainerFeatureID != UMLPackage.INTERACTION_OPERAND__ENCLOSING_INTERACTION && newEnclosingInteraction != null)) {
			if (EcoreUtil.isAncestor(this, newEnclosingInteraction))
				throw new IllegalArgumentException(
					"Recursive containment not allowed for " + toString()); //$NON-NLS-1$
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newEnclosingInteraction != null)
				msgs = ((InternalEObject) newEnclosingInteraction).eInverseAdd(
					this, UMLPackage.INTERACTION__FRAGMENT, Interaction.class,
					msgs);
			msgs = eBasicSetContainer(
				(InternalEObject) newEnclosingInteraction,
				UMLPackage.INTERACTION_OPERAND__ENCLOSING_INTERACTION, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.INTERACTION_OPERAND__ENCLOSING_INTERACTION,
				newEnclosingInteraction, newEnclosingInteraction));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InteractionOperand getEnclosingOperand() {
		if (eContainerFeatureID != UMLPackage.INTERACTION_OPERAND__ENCLOSING_OPERAND)
			return null;
		return (InteractionOperand) eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnclosingOperand(InteractionOperand newEnclosingOperand) {
		if (newEnclosingOperand != eInternalContainer()
			|| (eContainerFeatureID != UMLPackage.INTERACTION_OPERAND__ENCLOSING_OPERAND && newEnclosingOperand != null)) {
			if (EcoreUtil.isAncestor(this, newEnclosingOperand))
				throw new IllegalArgumentException(
					"Recursive containment not allowed for " + toString()); //$NON-NLS-1$
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newEnclosingOperand != null)
				msgs = ((InternalEObject) newEnclosingOperand).eInverseAdd(
					this, UMLPackage.INTERACTION_OPERAND__FRAGMENT,
					InteractionOperand.class, msgs);
			msgs = eBasicSetContainer((InternalEObject) newEnclosingOperand,
				UMLPackage.INTERACTION_OPERAND__ENCLOSING_OPERAND, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.INTERACTION_OPERAND__ENCLOSING_OPERAND,
				newEnclosingOperand, newEnclosingOperand));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List getOwnedMembers() {
		List ownedMember = (List) eVirtualGet(UMLPackage.INTERACTION_OPERAND__OWNED_MEMBER);
		if (ownedMember == null) {
			eVirtualSet(UMLPackage.INTERACTION_OPERAND__OWNED_MEMBER,
				ownedMember = new DerivedUnionEObjectEList(NamedElement.class,
					this, UMLPackage.INTERACTION_OPERAND__OWNED_MEMBER,
					new int[]{UMLPackage.INTERACTION_OPERAND__OWNED_RULE,
						UMLPackage.INTERACTION_OPERAND__FRAGMENT}));
		}
		return ownedMember;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InteractionConstraint getGuard() {
		return (InteractionConstraint) eVirtualGet(UMLPackage.INTERACTION_OPERAND__GUARD);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGuard(InteractionConstraint newGuard,
			NotificationChain msgs) {
		Object oldGuard = eVirtualSet(UMLPackage.INTERACTION_OPERAND__GUARD,
			newGuard);
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
				Notification.SET, UMLPackage.INTERACTION_OPERAND__GUARD,
				oldGuard == EVIRTUAL_NO_VALUE
					? null
					: oldGuard, newGuard);
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
	public void setGuard(InteractionConstraint newGuard) {
		InteractionConstraint guard = (InteractionConstraint) eVirtualGet(UMLPackage.INTERACTION_OPERAND__GUARD);
		if (newGuard != guard) {
			NotificationChain msgs = null;
			if (guard != null)
				msgs = ((InternalEObject) guard).eInverseRemove(this,
					EOPPOSITE_FEATURE_BASE
						- UMLPackage.INTERACTION_OPERAND__GUARD, null, msgs);
			if (newGuard != null)
				msgs = ((InternalEObject) newGuard).eInverseAdd(this,
					EOPPOSITE_FEATURE_BASE
						- UMLPackage.INTERACTION_OPERAND__GUARD, null, msgs);
			msgs = basicSetGuard(newGuard, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.INTERACTION_OPERAND__GUARD, newGuard, newGuard));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InteractionConstraint createGuard() {
		InteractionConstraint newGuard = UMLFactory.eINSTANCE
			.createInteractionConstraint();
		setGuard(newGuard);
		return newGuard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List getFragments() {
		List fragment = (List) eVirtualGet(UMLPackage.INTERACTION_OPERAND__FRAGMENT);
		if (fragment == null) {
			eVirtualSet(UMLPackage.INTERACTION_OPERAND__FRAGMENT,
				fragment = new EObjectContainmentWithInverseEList(
					InteractionFragment.class, this,
					UMLPackage.INTERACTION_OPERAND__FRAGMENT,
					UMLPackage.INTERACTION_FRAGMENT__ENCLOSING_OPERAND));
		}
		return fragment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InteractionFragment createFragment(EClass eClass) {
		InteractionFragment newFragment = (InteractionFragment) eClass
			.getEPackage().getEFactoryInstance().create(eClass);
		getFragments().add(newFragment);
		return newFragment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InteractionFragment getFragment(String name) {
		for (Iterator i = getFragments().iterator(); i.hasNext();) {
			InteractionFragment fragment = (InteractionFragment) i.next();
			if (name.equals(fragment.getName())) {
				return fragment;
			}
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGuardDirectlyPrior(DiagnosticChain diagnostics,
			Map context) {
		return InteractionOperandOperations.validateGuardDirectlyPrior(this,
			diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGuardContainReferences(DiagnosticChain diagnostics,
			Map context) {
		return InteractionOperandOperations.validateGuardContainReferences(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UMLPackage.INTERACTION_OPERAND__EANNOTATIONS :
				return ((InternalEList) getEAnnotations()).basicAdd(otherEnd,
					msgs);
			case UMLPackage.INTERACTION_OPERAND__CLIENT_DEPENDENCY :
				return ((InternalEList) getClientDependencies()).basicAdd(
					otherEnd, msgs);
			case UMLPackage.INTERACTION_OPERAND__ELEMENT_IMPORT :
				return ((InternalEList) getElementImports()).basicAdd(otherEnd,
					msgs);
			case UMLPackage.INTERACTION_OPERAND__PACKAGE_IMPORT :
				return ((InternalEList) getPackageImports()).basicAdd(otherEnd,
					msgs);
			case UMLPackage.INTERACTION_OPERAND__OWNED_RULE :
				return ((InternalEList) getOwnedRules()).basicAdd(otherEnd,
					msgs);
			case UMLPackage.INTERACTION_OPERAND__COVERED :
				return ((InternalEList) getCovereds()).basicAdd(otherEnd, msgs);
			case UMLPackage.INTERACTION_OPERAND__ENCLOSING_INTERACTION :
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return eBasicSetContainer(otherEnd,
					UMLPackage.INTERACTION_OPERAND__ENCLOSING_INTERACTION, msgs);
			case UMLPackage.INTERACTION_OPERAND__ENCLOSING_OPERAND :
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return eBasicSetContainer(otherEnd,
					UMLPackage.INTERACTION_OPERAND__ENCLOSING_OPERAND, msgs);
			case UMLPackage.INTERACTION_OPERAND__FRAGMENT :
				return ((InternalEList) getFragments())
					.basicAdd(otherEnd, msgs);
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
			case UMLPackage.INTERACTION_OPERAND__EANNOTATIONS :
				return ((InternalEList) getEAnnotations()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.INTERACTION_OPERAND__OWNED_COMMENT :
				return ((InternalEList) getOwnedComments()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.INTERACTION_OPERAND__CLIENT_DEPENDENCY :
				return ((InternalEList) getClientDependencies()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.INTERACTION_OPERAND__NAME_EXPRESSION :
				return basicSetNameExpression(null, msgs);
			case UMLPackage.INTERACTION_OPERAND__ELEMENT_IMPORT :
				return ((InternalEList) getElementImports()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.INTERACTION_OPERAND__PACKAGE_IMPORT :
				return ((InternalEList) getPackageImports()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.INTERACTION_OPERAND__OWNED_RULE :
				return ((InternalEList) getOwnedRules()).basicRemove(otherEnd,
					msgs);
			case UMLPackage.INTERACTION_OPERAND__COVERED :
				return ((InternalEList) getCovereds()).basicRemove(otherEnd,
					msgs);
			case UMLPackage.INTERACTION_OPERAND__GENERAL_ORDERING :
				return ((InternalEList) getGeneralOrderings()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.INTERACTION_OPERAND__ENCLOSING_INTERACTION :
				return eBasicSetContainer(null,
					UMLPackage.INTERACTION_OPERAND__ENCLOSING_INTERACTION, msgs);
			case UMLPackage.INTERACTION_OPERAND__ENCLOSING_OPERAND :
				return eBasicSetContainer(null,
					UMLPackage.INTERACTION_OPERAND__ENCLOSING_OPERAND, msgs);
			case UMLPackage.INTERACTION_OPERAND__GUARD :
				return basicSetGuard(null, msgs);
			case UMLPackage.INTERACTION_OPERAND__FRAGMENT :
				return ((InternalEList) getFragments()).basicRemove(otherEnd,
					msgs);
		}
		return eDynamicInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eBasicRemoveFromContainerFeature(
			NotificationChain msgs) {
		switch (eContainerFeatureID) {
			case UMLPackage.INTERACTION_OPERAND__ENCLOSING_INTERACTION :
				return eInternalContainer().eInverseRemove(this,
					UMLPackage.INTERACTION__FRAGMENT, Interaction.class, msgs);
			case UMLPackage.INTERACTION_OPERAND__ENCLOSING_OPERAND :
				return eInternalContainer().eInverseRemove(this,
					UMLPackage.INTERACTION_OPERAND__FRAGMENT,
					InteractionOperand.class, msgs);
		}
		return eDynamicBasicRemoveFromContainer(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UMLPackage.INTERACTION_OPERAND__EANNOTATIONS :
				return getEAnnotations();
			case UMLPackage.INTERACTION_OPERAND__OWNED_ELEMENT :
				return getOwnedElements();
			case UMLPackage.INTERACTION_OPERAND__OWNER :
				if (resolve)
					return getOwner();
				return basicGetOwner();
			case UMLPackage.INTERACTION_OPERAND__OWNED_COMMENT :
				return getOwnedComments();
			case UMLPackage.INTERACTION_OPERAND__NAME :
				return getName();
			case UMLPackage.INTERACTION_OPERAND__VISIBILITY :
				return getVisibility();
			case UMLPackage.INTERACTION_OPERAND__QUALIFIED_NAME :
				return getQualifiedName();
			case UMLPackage.INTERACTION_OPERAND__CLIENT_DEPENDENCY :
				return getClientDependencies();
			case UMLPackage.INTERACTION_OPERAND__NAMESPACE :
				if (resolve)
					return getNamespace();
				return basicGetNamespace();
			case UMLPackage.INTERACTION_OPERAND__NAME_EXPRESSION :
				return getNameExpression();
			case UMLPackage.INTERACTION_OPERAND__ELEMENT_IMPORT :
				return getElementImports();
			case UMLPackage.INTERACTION_OPERAND__PACKAGE_IMPORT :
				return getPackageImports();
			case UMLPackage.INTERACTION_OPERAND__OWNED_RULE :
				return getOwnedRules();
			case UMLPackage.INTERACTION_OPERAND__MEMBER :
				return getMembers();
			case UMLPackage.INTERACTION_OPERAND__IMPORTED_MEMBER :
				return getImportedMembers();
			case UMLPackage.INTERACTION_OPERAND__OWNED_MEMBER :
				return getOwnedMembers();
			case UMLPackage.INTERACTION_OPERAND__COVERED :
				return getCovereds();
			case UMLPackage.INTERACTION_OPERAND__GENERAL_ORDERING :
				return getGeneralOrderings();
			case UMLPackage.INTERACTION_OPERAND__ENCLOSING_INTERACTION :
				return getEnclosingInteraction();
			case UMLPackage.INTERACTION_OPERAND__ENCLOSING_OPERAND :
				return getEnclosingOperand();
			case UMLPackage.INTERACTION_OPERAND__GUARD :
				return getGuard();
			case UMLPackage.INTERACTION_OPERAND__FRAGMENT :
				return getFragments();
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
			case UMLPackage.INTERACTION_OPERAND__EANNOTATIONS :
				getEAnnotations().clear();
				getEAnnotations().addAll((Collection) newValue);
				return;
			case UMLPackage.INTERACTION_OPERAND__OWNED_COMMENT :
				getOwnedComments().clear();
				getOwnedComments().addAll((Collection) newValue);
				return;
			case UMLPackage.INTERACTION_OPERAND__NAME :
				setName((String) newValue);
				return;
			case UMLPackage.INTERACTION_OPERAND__VISIBILITY :
				setVisibility((VisibilityKind) newValue);
				return;
			case UMLPackage.INTERACTION_OPERAND__CLIENT_DEPENDENCY :
				getClientDependencies().clear();
				getClientDependencies().addAll((Collection) newValue);
				return;
			case UMLPackage.INTERACTION_OPERAND__NAME_EXPRESSION :
				setNameExpression((StringExpression) newValue);
				return;
			case UMLPackage.INTERACTION_OPERAND__ELEMENT_IMPORT :
				getElementImports().clear();
				getElementImports().addAll((Collection) newValue);
				return;
			case UMLPackage.INTERACTION_OPERAND__PACKAGE_IMPORT :
				getPackageImports().clear();
				getPackageImports().addAll((Collection) newValue);
				return;
			case UMLPackage.INTERACTION_OPERAND__OWNED_RULE :
				getOwnedRules().clear();
				getOwnedRules().addAll((Collection) newValue);
				return;
			case UMLPackage.INTERACTION_OPERAND__COVERED :
				getCovereds().clear();
				getCovereds().addAll((Collection) newValue);
				return;
			case UMLPackage.INTERACTION_OPERAND__GENERAL_ORDERING :
				getGeneralOrderings().clear();
				getGeneralOrderings().addAll((Collection) newValue);
				return;
			case UMLPackage.INTERACTION_OPERAND__ENCLOSING_INTERACTION :
				setEnclosingInteraction((Interaction) newValue);
				return;
			case UMLPackage.INTERACTION_OPERAND__ENCLOSING_OPERAND :
				setEnclosingOperand((InteractionOperand) newValue);
				return;
			case UMLPackage.INTERACTION_OPERAND__GUARD :
				setGuard((InteractionConstraint) newValue);
				return;
			case UMLPackage.INTERACTION_OPERAND__FRAGMENT :
				getFragments().clear();
				getFragments().addAll((Collection) newValue);
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
			case UMLPackage.INTERACTION_OPERAND__EANNOTATIONS :
				getEAnnotations().clear();
				return;
			case UMLPackage.INTERACTION_OPERAND__OWNED_COMMENT :
				getOwnedComments().clear();
				return;
			case UMLPackage.INTERACTION_OPERAND__NAME :
				setName(NAME_EDEFAULT);
				return;
			case UMLPackage.INTERACTION_OPERAND__VISIBILITY :
				setVisibility(VISIBILITY_EDEFAULT);
				return;
			case UMLPackage.INTERACTION_OPERAND__CLIENT_DEPENDENCY :
				getClientDependencies().clear();
				return;
			case UMLPackage.INTERACTION_OPERAND__NAME_EXPRESSION :
				setNameExpression((StringExpression) null);
				return;
			case UMLPackage.INTERACTION_OPERAND__ELEMENT_IMPORT :
				getElementImports().clear();
				return;
			case UMLPackage.INTERACTION_OPERAND__PACKAGE_IMPORT :
				getPackageImports().clear();
				return;
			case UMLPackage.INTERACTION_OPERAND__OWNED_RULE :
				getOwnedRules().clear();
				return;
			case UMLPackage.INTERACTION_OPERAND__COVERED :
				getCovereds().clear();
				return;
			case UMLPackage.INTERACTION_OPERAND__GENERAL_ORDERING :
				getGeneralOrderings().clear();
				return;
			case UMLPackage.INTERACTION_OPERAND__ENCLOSING_INTERACTION :
				setEnclosingInteraction((Interaction) null);
				return;
			case UMLPackage.INTERACTION_OPERAND__ENCLOSING_OPERAND :
				setEnclosingOperand((InteractionOperand) null);
				return;
			case UMLPackage.INTERACTION_OPERAND__GUARD :
				setGuard((InteractionConstraint) null);
				return;
			case UMLPackage.INTERACTION_OPERAND__FRAGMENT :
				getFragments().clear();
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
			case UMLPackage.INTERACTION_OPERAND__EANNOTATIONS :
				EList eAnnotations = (EList) eVirtualGet(UMLPackage.INTERACTION_OPERAND__EANNOTATIONS);
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UMLPackage.INTERACTION_OPERAND__OWNED_ELEMENT :
				return isSetOwnedElements();
			case UMLPackage.INTERACTION_OPERAND__OWNER :
				return isSetOwner();
			case UMLPackage.INTERACTION_OPERAND__OWNED_COMMENT :
				List ownedComment = (List) eVirtualGet(UMLPackage.INTERACTION_OPERAND__OWNED_COMMENT);
				return ownedComment != null && !ownedComment.isEmpty();
			case UMLPackage.INTERACTION_OPERAND__NAME :
				String name = (String) eVirtualGet(
					UMLPackage.INTERACTION_OPERAND__NAME, NAME_EDEFAULT);
				return NAME_EDEFAULT == null
					? name != null
					: !NAME_EDEFAULT.equals(name);
			case UMLPackage.INTERACTION_OPERAND__VISIBILITY :
				return eVirtualGet(UMLPackage.INTERACTION_OPERAND__VISIBILITY,
					VISIBILITY_EDEFAULT) != VISIBILITY_EDEFAULT;
			case UMLPackage.INTERACTION_OPERAND__QUALIFIED_NAME :
				return QUALIFIED_NAME_EDEFAULT == null
					? getQualifiedName() != null
					: !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case UMLPackage.INTERACTION_OPERAND__CLIENT_DEPENDENCY :
				List clientDependency = (List) eVirtualGet(UMLPackage.INTERACTION_OPERAND__CLIENT_DEPENDENCY);
				return clientDependency != null && !clientDependency.isEmpty();
			case UMLPackage.INTERACTION_OPERAND__NAMESPACE :
				return isSetNamespace();
			case UMLPackage.INTERACTION_OPERAND__NAME_EXPRESSION :
				return eVirtualGet(UMLPackage.INTERACTION_OPERAND__NAME_EXPRESSION) != null;
			case UMLPackage.INTERACTION_OPERAND__ELEMENT_IMPORT :
				List elementImport = (List) eVirtualGet(UMLPackage.INTERACTION_OPERAND__ELEMENT_IMPORT);
				return elementImport != null && !elementImport.isEmpty();
			case UMLPackage.INTERACTION_OPERAND__PACKAGE_IMPORT :
				List packageImport = (List) eVirtualGet(UMLPackage.INTERACTION_OPERAND__PACKAGE_IMPORT);
				return packageImport != null && !packageImport.isEmpty();
			case UMLPackage.INTERACTION_OPERAND__OWNED_RULE :
				List ownedRule = (List) eVirtualGet(UMLPackage.INTERACTION_OPERAND__OWNED_RULE);
				return ownedRule != null && !ownedRule.isEmpty();
			case UMLPackage.INTERACTION_OPERAND__MEMBER :
				return isSetMembers();
			case UMLPackage.INTERACTION_OPERAND__IMPORTED_MEMBER :
				return !getImportedMembers().isEmpty();
			case UMLPackage.INTERACTION_OPERAND__OWNED_MEMBER :
				return isSetOwnedMembers();
			case UMLPackage.INTERACTION_OPERAND__COVERED :
				List covered = (List) eVirtualGet(UMLPackage.INTERACTION_OPERAND__COVERED);
				return covered != null && !covered.isEmpty();
			case UMLPackage.INTERACTION_OPERAND__GENERAL_ORDERING :
				List generalOrdering = (List) eVirtualGet(UMLPackage.INTERACTION_OPERAND__GENERAL_ORDERING);
				return generalOrdering != null && !generalOrdering.isEmpty();
			case UMLPackage.INTERACTION_OPERAND__ENCLOSING_INTERACTION :
				return getEnclosingInteraction() != null;
			case UMLPackage.INTERACTION_OPERAND__ENCLOSING_OPERAND :
				return getEnclosingOperand() != null;
			case UMLPackage.INTERACTION_OPERAND__GUARD :
				return eVirtualGet(UMLPackage.INTERACTION_OPERAND__GUARD) != null;
			case UMLPackage.INTERACTION_OPERAND__FRAGMENT :
				List fragment = (List) eVirtualGet(UMLPackage.INTERACTION_OPERAND__FRAGMENT);
				return fragment != null && !fragment.isEmpty();
		}
		return eDynamicIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class baseClass) {
		if (baseClass == InteractionFragment.class) {
			switch (derivedFeatureID) {
				case UMLPackage.INTERACTION_OPERAND__COVERED :
					return UMLPackage.INTERACTION_FRAGMENT__COVERED;
				case UMLPackage.INTERACTION_OPERAND__GENERAL_ORDERING :
					return UMLPackage.INTERACTION_FRAGMENT__GENERAL_ORDERING;
				case UMLPackage.INTERACTION_OPERAND__ENCLOSING_INTERACTION :
					return UMLPackage.INTERACTION_FRAGMENT__ENCLOSING_INTERACTION;
				case UMLPackage.INTERACTION_OPERAND__ENCLOSING_OPERAND :
					return UMLPackage.INTERACTION_FRAGMENT__ENCLOSING_OPERAND;
				default :
					return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class baseClass) {
		if (baseClass == InteractionFragment.class) {
			switch (baseFeatureID) {
				case UMLPackage.INTERACTION_FRAGMENT__COVERED :
					return UMLPackage.INTERACTION_OPERAND__COVERED;
				case UMLPackage.INTERACTION_FRAGMENT__GENERAL_ORDERING :
					return UMLPackage.INTERACTION_OPERAND__GENERAL_ORDERING;
				case UMLPackage.INTERACTION_FRAGMENT__ENCLOSING_INTERACTION :
					return UMLPackage.INTERACTION_OPERAND__ENCLOSING_INTERACTION;
				case UMLPackage.INTERACTION_FRAGMENT__ENCLOSING_OPERAND :
					return UMLPackage.INTERACTION_OPERAND__ENCLOSING_OPERAND;
				default :
					return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOwnedElements() {
		return super.isSetOwnedElements()
			|| eIsSet(UMLPackage.INTERACTION_OPERAND__GENERAL_ORDERING)
			|| eIsSet(UMLPackage.INTERACTION_OPERAND__GUARD);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Namespace basicGetNamespace() {
		InteractionOperand enclosingOperand = getEnclosingOperand();
		if (enclosingOperand != null) {
			return enclosingOperand;
		}
		return super.basicGetNamespace();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNamespace() {
		return super.isSetNamespace()
			|| eIsSet(UMLPackage.INTERACTION_OPERAND__ENCLOSING_OPERAND);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOwnedMembers() {
		return super.isSetOwnedMembers()
			|| eIsSet(UMLPackage.INTERACTION_OPERAND__FRAGMENT);
	}

} //InteractionOperandImpl
