/*
 * Copyright (c) 2005, 2016 IBM Corporation, CEA, and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *   Kenn Hussey - 286329, 323181
 *   Kenn Hussey (CEA) - 327039, 351774, 418466, 451350, 485756
 *
 */
package org.eclipse.uml2.uml.internal.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.uml2.common.util.CacheAdapter;
import org.eclipse.uml2.common.util.DerivedUnionEObjectEList;

import org.eclipse.uml2.uml.Comment;
import org.eclipse.uml2.uml.Constraint;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.ElementImport;
import org.eclipse.uml2.uml.GeneralOrdering;
import org.eclipse.uml2.uml.Interaction;
import org.eclipse.uml2.uml.InteractionConstraint;
import org.eclipse.uml2.uml.InteractionFragment;
import org.eclipse.uml2.uml.InteractionOperand;
import org.eclipse.uml2.uml.Lifeline;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Namespace;
import org.eclipse.uml2.uml.PackageImport;
import org.eclipse.uml2.uml.PackageableElement;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.StringExpression;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.VisibilityKind;

import org.eclipse.uml2.uml.internal.operations.InteractionOperandOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Interaction Operand</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.InteractionOperandImpl#getNamespace <em>Namespace</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.InteractionOperandImpl#getOwnedElements <em>Owned Element</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.InteractionOperandImpl#getCovereds <em>Covered</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.InteractionOperandImpl#getEnclosingOperand <em>Enclosing Operand</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.InteractionOperandImpl#getEnclosingInteraction <em>Enclosing Interaction</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.InteractionOperandImpl#getGeneralOrderings <em>General Ordering</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.InteractionOperandImpl#getOwnedMembers <em>Owned Member</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.InteractionOperandImpl#getFragments <em>Fragment</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.InteractionOperandImpl#getGuard <em>Guard</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InteractionOperandImpl
		extends NamespaceImpl
		implements InteractionOperand {

	/**
	 * The cached value of the '{@link #getCovereds() <em>Covered</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCovereds()
	 * @generated
	 * @ordered
	 */
	protected EList<Lifeline> covereds;

	/**
	 * The cached value of the '{@link #getGeneralOrderings() <em>General Ordering</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneralOrderings()
	 * @generated
	 * @ordered
	 */
	protected EList<GeneralOrdering> generalOrderings;

	/**
	 * The cached value of the '{@link #getFragments() <em>Fragment</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFragments()
	 * @generated
	 * @ordered
	 */
	protected EList<InteractionFragment> fragments;

	/**
	 * The cached value of the '{@link #getGuard() <em>Guard</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGuard()
	 * @generated
	 * @ordered
	 */
	protected InteractionConstraint guard;

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
	@Override
	protected EClass eStaticClass() {
		return UMLPackage.Literals.INTERACTION_OPERAND;
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
						UMLPackage.INTERACTION_OPERAND__OWNED_ELEMENT,
						OWNED_ELEMENT_ESUBSETS));
			}
			return ownedElements;
		}
		return new DerivedUnionEObjectEList<Element>(Element.class, this,
			UMLPackage.INTERACTION_OPERAND__OWNED_ELEMENT,
			OWNED_ELEMENT_ESUBSETS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Lifeline> getCovereds() {
		if (covereds == null) {
			covereds = new EObjectWithInverseResolvingEList.ManyInverse<Lifeline>(
				Lifeline.class, this, UMLPackage.INTERACTION_OPERAND__COVERED,
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
	public EList<GeneralOrdering> getGeneralOrderings() {
		if (generalOrderings == null) {
			generalOrderings = new EObjectContainmentEList.Resolving<GeneralOrdering>(
				GeneralOrdering.class, this,
				UMLPackage.INTERACTION_OPERAND__GENERAL_ORDERING);
		}
		return generalOrderings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeneralOrdering createGeneralOrdering(String name) {
		GeneralOrdering newGeneralOrdering = (GeneralOrdering) create(
			UMLPackage.Literals.GENERAL_ORDERING);
		getGeneralOrderings().add(newGeneralOrdering);
		if (name != null)
			newGeneralOrdering.setName(name);
		return newGeneralOrdering;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeneralOrdering getGeneralOrdering(String name) {
		return getGeneralOrdering(name, false, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeneralOrdering getGeneralOrdering(String name, boolean ignoreCase,
			boolean createOnDemand) {
		generalOrderingLoop : for (GeneralOrdering generalOrdering : getGeneralOrderings()) {
			if (name != null && !(ignoreCase
				? name.equalsIgnoreCase(generalOrdering.getName())
				: name.equals(generalOrdering.getName())))
				continue generalOrderingLoop;
			return generalOrdering;
		}
		return createOnDemand
			? createGeneralOrdering(name)
			: null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Interaction getEnclosingInteraction() {
		if (eContainerFeatureID() != UMLPackage.INTERACTION_OPERAND__ENCLOSING_INTERACTION)
			return null;
		return (Interaction) eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Interaction basicGetEnclosingInteraction() {
		if (eContainerFeatureID() != UMLPackage.INTERACTION_OPERAND__ENCLOSING_INTERACTION)
			return null;
		return (Interaction) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEnclosingInteraction(
			Interaction newEnclosingInteraction, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newEnclosingInteraction,
			UMLPackage.INTERACTION_OPERAND__ENCLOSING_INTERACTION, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnclosingInteraction(Interaction newEnclosingInteraction) {
		if (newEnclosingInteraction != eInternalContainer()
			|| (eContainerFeatureID() != UMLPackage.INTERACTION_OPERAND__ENCLOSING_INTERACTION
				&& newEnclosingInteraction != null)) {
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
			msgs = basicSetEnclosingInteraction(newEnclosingInteraction, msgs);
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
		if (eContainerFeatureID() != UMLPackage.INTERACTION_OPERAND__ENCLOSING_OPERAND)
			return null;
		return (InteractionOperand) eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InteractionOperand basicGetEnclosingOperand() {
		if (eContainerFeatureID() != UMLPackage.INTERACTION_OPERAND__ENCLOSING_OPERAND)
			return null;
		return (InteractionOperand) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEnclosingOperand(
			InteractionOperand newEnclosingOperand, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newEnclosingOperand,
			UMLPackage.INTERACTION_OPERAND__ENCLOSING_OPERAND, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnclosingOperand(InteractionOperand newEnclosingOperand) {
		if (newEnclosingOperand != eInternalContainer()
			|| (eContainerFeatureID() != UMLPackage.INTERACTION_OPERAND__ENCLOSING_OPERAND
				&& newEnclosingOperand != null)) {
			if (EcoreUtil.isAncestor(this, newEnclosingOperand))
				throw new IllegalArgumentException(
					"Recursive containment not allowed for " + toString()); //$NON-NLS-1$
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newEnclosingOperand != null)
				msgs = ((InternalEObject) newEnclosingOperand).eInverseAdd(this,
					UMLPackage.INTERACTION_OPERAND__FRAGMENT,
					InteractionOperand.class, msgs);
			msgs = basicSetEnclosingOperand(newEnclosingOperand, msgs);
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
	@Override
	public EList<NamedElement> getOwnedMembers() {
		CacheAdapter cache = getCacheAdapter();
		if (cache != null) {
			Resource eResource = eResource();
			@SuppressWarnings("unchecked")
			EList<NamedElement> ownedMembers = (EList<NamedElement>) cache.get(
				eResource, this, UMLPackage.Literals.NAMESPACE__OWNED_MEMBER);
			if (ownedMembers == null) {
				cache.put(eResource, this,
					UMLPackage.Literals.NAMESPACE__OWNED_MEMBER,
					ownedMembers = new DerivedUnionEObjectEList<NamedElement>(
						NamedElement.class, this,
						UMLPackage.INTERACTION_OPERAND__OWNED_MEMBER,
						OWNED_MEMBER_ESUBSETS));
			}
			return ownedMembers;
		}
		return new DerivedUnionEObjectEList<NamedElement>(NamedElement.class,
			this, UMLPackage.INTERACTION_OPERAND__OWNED_MEMBER,
			OWNED_MEMBER_ESUBSETS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InteractionConstraint getGuard() {
		if (guard != null && guard.eIsProxy()) {
			InternalEObject oldGuard = (InternalEObject) guard;
			guard = (InteractionConstraint) eResolveProxy(oldGuard);
			if (guard != oldGuard) {
				InternalEObject newGuard = (InternalEObject) guard;
				NotificationChain msgs = oldGuard
					.eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE
							- UMLPackage.INTERACTION_OPERAND__GUARD,
						null, null);
				if (newGuard.eInternalContainer() == null) {
					msgs = newGuard.eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE
							- UMLPackage.INTERACTION_OPERAND__GUARD,
						null, msgs);
				}
				if (msgs != null)
					msgs.dispatch();
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
						UMLPackage.INTERACTION_OPERAND__GUARD, oldGuard,
						guard));
			}
		}
		return guard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InteractionConstraint basicGetGuard() {
		return guard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGuard(InteractionConstraint newGuard,
			NotificationChain msgs) {
		InteractionConstraint oldGuard = guard;
		guard = newGuard;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
				Notification.SET, UMLPackage.INTERACTION_OPERAND__GUARD,
				oldGuard, newGuard);
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
		if (newGuard != guard) {
			NotificationChain msgs = null;
			if (guard != null)
				msgs = ((InternalEObject) guard)
					.eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE
							- UMLPackage.INTERACTION_OPERAND__GUARD,
						null, msgs);
			if (newGuard != null)
				msgs = ((InternalEObject) newGuard)
					.eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE
							- UMLPackage.INTERACTION_OPERAND__GUARD,
						null, msgs);
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
	public InteractionConstraint createGuard(String name) {
		InteractionConstraint newGuard = (InteractionConstraint) create(
			UMLPackage.Literals.INTERACTION_CONSTRAINT);
		setGuard(newGuard);
		if (name != null)
			newGuard.setName(name);
		return newGuard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InteractionFragment> getFragments() {
		if (fragments == null) {
			fragments = new EObjectContainmentWithInverseEList.Resolving<InteractionFragment>(
				InteractionFragment.class, this,
				UMLPackage.INTERACTION_OPERAND__FRAGMENT,
				UMLPackage.INTERACTION_FRAGMENT__ENCLOSING_OPERAND);
		}
		return fragments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InteractionFragment createFragment(String name, EClass eClass) {
		InteractionFragment newFragment = (InteractionFragment) create(eClass);
		getFragments().add(newFragment);
		if (name != null)
			newFragment.setName(name);
		return newFragment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InteractionFragment getFragment(String name) {
		return getFragment(name, false, null, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InteractionFragment getFragment(String name, boolean ignoreCase,
			EClass eClass, boolean createOnDemand) {
		fragmentLoop : for (InteractionFragment fragment : getFragments()) {
			if (eClass != null && !eClass.isInstance(fragment))
				continue fragmentLoop;
			if (name != null && !(ignoreCase
				? name.equalsIgnoreCase(fragment.getName())
				: name.equals(fragment.getName())))
				continue fragmentLoop;
			return fragment;
		}
		return createOnDemand && eClass != null
			? createFragment(name, eClass)
			: null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGuardDirectlyPrior(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return InteractionOperandOperations.validateGuardDirectlyPrior(this,
			diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGuardContainReferences(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return InteractionOperandOperations.validateGuardContainReferences(this,
			diagnostics, context);
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
			case UMLPackage.INTERACTION_OPERAND__EANNOTATIONS :
				return ((InternalEList<InternalEObject>) (InternalEList<?>) getEAnnotations())
					.basicAdd(otherEnd, msgs);
			case UMLPackage.INTERACTION_OPERAND__OWNED_RULE :
				return ((InternalEList<InternalEObject>) (InternalEList<?>) getOwnedRules())
					.basicAdd(otherEnd, msgs);
			case UMLPackage.INTERACTION_OPERAND__ELEMENT_IMPORT :
				return ((InternalEList<InternalEObject>) (InternalEList<?>) getElementImports())
					.basicAdd(otherEnd, msgs);
			case UMLPackage.INTERACTION_OPERAND__PACKAGE_IMPORT :
				return ((InternalEList<InternalEObject>) (InternalEList<?>) getPackageImports())
					.basicAdd(otherEnd, msgs);
			case UMLPackage.INTERACTION_OPERAND__COVERED :
				return ((InternalEList<InternalEObject>) (InternalEList<?>) getCovereds())
					.basicAdd(otherEnd, msgs);
			case UMLPackage.INTERACTION_OPERAND__ENCLOSING_OPERAND :
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetEnclosingOperand((InteractionOperand) otherEnd,
					msgs);
			case UMLPackage.INTERACTION_OPERAND__ENCLOSING_INTERACTION :
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetEnclosingInteraction((Interaction) otherEnd,
					msgs);
			case UMLPackage.INTERACTION_OPERAND__FRAGMENT :
				return ((InternalEList<InternalEObject>) (InternalEList<?>) getFragments())
					.basicAdd(otherEnd, msgs);
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
			case UMLPackage.INTERACTION_OPERAND__EANNOTATIONS :
				return ((InternalEList<?>) getEAnnotations())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.INTERACTION_OPERAND__OWNED_COMMENT :
				return ((InternalEList<?>) getOwnedComments())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.INTERACTION_OPERAND__NAME_EXPRESSION :
				return basicSetNameExpression(null, msgs);
			case UMLPackage.INTERACTION_OPERAND__OWNED_RULE :
				return ((InternalEList<?>) getOwnedRules())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.INTERACTION_OPERAND__ELEMENT_IMPORT :
				return ((InternalEList<?>) getElementImports())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.INTERACTION_OPERAND__PACKAGE_IMPORT :
				return ((InternalEList<?>) getPackageImports())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.INTERACTION_OPERAND__COVERED :
				return ((InternalEList<?>) getCovereds()).basicRemove(otherEnd,
					msgs);
			case UMLPackage.INTERACTION_OPERAND__ENCLOSING_OPERAND :
				return basicSetEnclosingOperand(null, msgs);
			case UMLPackage.INTERACTION_OPERAND__ENCLOSING_INTERACTION :
				return basicSetEnclosingInteraction(null, msgs);
			case UMLPackage.INTERACTION_OPERAND__GENERAL_ORDERING :
				return ((InternalEList<?>) getGeneralOrderings())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.INTERACTION_OPERAND__FRAGMENT :
				return ((InternalEList<?>) getFragments()).basicRemove(otherEnd,
					msgs);
			case UMLPackage.INTERACTION_OPERAND__GUARD :
				return basicSetGuard(null, msgs);
		}
		return eDynamicInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(
			NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case UMLPackage.INTERACTION_OPERAND__ENCLOSING_OPERAND :
				return eInternalContainer().eInverseRemove(this,
					UMLPackage.INTERACTION_OPERAND__FRAGMENT,
					InteractionOperand.class, msgs);
			case UMLPackage.INTERACTION_OPERAND__ENCLOSING_INTERACTION :
				return eInternalContainer().eInverseRemove(this,
					UMLPackage.INTERACTION__FRAGMENT, Interaction.class, msgs);
		}
		return eDynamicBasicRemoveFromContainer(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UMLPackage.INTERACTION_OPERAND__EANNOTATIONS :
				return getEAnnotations();
			case UMLPackage.INTERACTION_OPERAND__OWNED_COMMENT :
				return getOwnedComments();
			case UMLPackage.INTERACTION_OPERAND__OWNED_ELEMENT :
				return getOwnedElements();
			case UMLPackage.INTERACTION_OPERAND__OWNER :
				if (resolve)
					return getOwner();
				return basicGetOwner();
			case UMLPackage.INTERACTION_OPERAND__CLIENT_DEPENDENCY :
				return getClientDependencies();
			case UMLPackage.INTERACTION_OPERAND__NAME :
				return getName();
			case UMLPackage.INTERACTION_OPERAND__NAME_EXPRESSION :
				if (resolve)
					return getNameExpression();
				return basicGetNameExpression();
			case UMLPackage.INTERACTION_OPERAND__NAMESPACE :
				if (resolve)
					return getNamespace();
				return basicGetNamespace();
			case UMLPackage.INTERACTION_OPERAND__QUALIFIED_NAME :
				return getQualifiedName();
			case UMLPackage.INTERACTION_OPERAND__VISIBILITY :
				return getVisibility();
			case UMLPackage.INTERACTION_OPERAND__OWNED_RULE :
				return getOwnedRules();
			case UMLPackage.INTERACTION_OPERAND__ELEMENT_IMPORT :
				return getElementImports();
			case UMLPackage.INTERACTION_OPERAND__PACKAGE_IMPORT :
				return getPackageImports();
			case UMLPackage.INTERACTION_OPERAND__OWNED_MEMBER :
				return getOwnedMembers();
			case UMLPackage.INTERACTION_OPERAND__IMPORTED_MEMBER :
				return getImportedMembers();
			case UMLPackage.INTERACTION_OPERAND__MEMBER :
				return getMembers();
			case UMLPackage.INTERACTION_OPERAND__COVERED :
				return getCovereds();
			case UMLPackage.INTERACTION_OPERAND__ENCLOSING_OPERAND :
				if (resolve)
					return getEnclosingOperand();
				return basicGetEnclosingOperand();
			case UMLPackage.INTERACTION_OPERAND__ENCLOSING_INTERACTION :
				if (resolve)
					return getEnclosingInteraction();
				return basicGetEnclosingInteraction();
			case UMLPackage.INTERACTION_OPERAND__GENERAL_ORDERING :
				return getGeneralOrderings();
			case UMLPackage.INTERACTION_OPERAND__FRAGMENT :
				return getFragments();
			case UMLPackage.INTERACTION_OPERAND__GUARD :
				if (resolve)
					return getGuard();
				return basicGetGuard();
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
			case UMLPackage.INTERACTION_OPERAND__EANNOTATIONS :
				getEAnnotations().clear();
				getEAnnotations()
					.addAll((Collection<? extends EAnnotation>) newValue);
				return;
			case UMLPackage.INTERACTION_OPERAND__OWNED_COMMENT :
				getOwnedComments().clear();
				getOwnedComments()
					.addAll((Collection<? extends Comment>) newValue);
				return;
			case UMLPackage.INTERACTION_OPERAND__NAME :
				setName((String) newValue);
				return;
			case UMLPackage.INTERACTION_OPERAND__NAME_EXPRESSION :
				setNameExpression((StringExpression) newValue);
				return;
			case UMLPackage.INTERACTION_OPERAND__VISIBILITY :
				setVisibility((VisibilityKind) newValue);
				return;
			case UMLPackage.INTERACTION_OPERAND__OWNED_RULE :
				getOwnedRules().clear();
				getOwnedRules()
					.addAll((Collection<? extends Constraint>) newValue);
				return;
			case UMLPackage.INTERACTION_OPERAND__ELEMENT_IMPORT :
				getElementImports().clear();
				getElementImports()
					.addAll((Collection<? extends ElementImport>) newValue);
				return;
			case UMLPackage.INTERACTION_OPERAND__PACKAGE_IMPORT :
				getPackageImports().clear();
				getPackageImports()
					.addAll((Collection<? extends PackageImport>) newValue);
				return;
			case UMLPackage.INTERACTION_OPERAND__COVERED :
				getCovereds().clear();
				getCovereds().addAll((Collection<? extends Lifeline>) newValue);
				return;
			case UMLPackage.INTERACTION_OPERAND__ENCLOSING_OPERAND :
				setEnclosingOperand((InteractionOperand) newValue);
				return;
			case UMLPackage.INTERACTION_OPERAND__ENCLOSING_INTERACTION :
				setEnclosingInteraction((Interaction) newValue);
				return;
			case UMLPackage.INTERACTION_OPERAND__GENERAL_ORDERING :
				getGeneralOrderings().clear();
				getGeneralOrderings()
					.addAll((Collection<? extends GeneralOrdering>) newValue);
				return;
			case UMLPackage.INTERACTION_OPERAND__FRAGMENT :
				getFragments().clear();
				getFragments().addAll(
					(Collection<? extends InteractionFragment>) newValue);
				return;
			case UMLPackage.INTERACTION_OPERAND__GUARD :
				setGuard((InteractionConstraint) newValue);
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
			case UMLPackage.INTERACTION_OPERAND__EANNOTATIONS :
				getEAnnotations().clear();
				return;
			case UMLPackage.INTERACTION_OPERAND__OWNED_COMMENT :
				getOwnedComments().clear();
				return;
			case UMLPackage.INTERACTION_OPERAND__NAME :
				unsetName();
				return;
			case UMLPackage.INTERACTION_OPERAND__NAME_EXPRESSION :
				setNameExpression((StringExpression) null);
				return;
			case UMLPackage.INTERACTION_OPERAND__VISIBILITY :
				unsetVisibility();
				return;
			case UMLPackage.INTERACTION_OPERAND__OWNED_RULE :
				getOwnedRules().clear();
				return;
			case UMLPackage.INTERACTION_OPERAND__ELEMENT_IMPORT :
				getElementImports().clear();
				return;
			case UMLPackage.INTERACTION_OPERAND__PACKAGE_IMPORT :
				getPackageImports().clear();
				return;
			case UMLPackage.INTERACTION_OPERAND__COVERED :
				getCovereds().clear();
				return;
			case UMLPackage.INTERACTION_OPERAND__ENCLOSING_OPERAND :
				setEnclosingOperand((InteractionOperand) null);
				return;
			case UMLPackage.INTERACTION_OPERAND__ENCLOSING_INTERACTION :
				setEnclosingInteraction((Interaction) null);
				return;
			case UMLPackage.INTERACTION_OPERAND__GENERAL_ORDERING :
				getGeneralOrderings().clear();
				return;
			case UMLPackage.INTERACTION_OPERAND__FRAGMENT :
				getFragments().clear();
				return;
			case UMLPackage.INTERACTION_OPERAND__GUARD :
				setGuard((InteractionConstraint) null);
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
			case UMLPackage.INTERACTION_OPERAND__EANNOTATIONS :
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UMLPackage.INTERACTION_OPERAND__OWNED_COMMENT :
				return ownedComments != null && !ownedComments.isEmpty();
			case UMLPackage.INTERACTION_OPERAND__OWNED_ELEMENT :
				return isSetOwnedElements();
			case UMLPackage.INTERACTION_OPERAND__OWNER :
				return isSetOwner();
			case UMLPackage.INTERACTION_OPERAND__CLIENT_DEPENDENCY :
				return !getClientDependencies().isEmpty();
			case UMLPackage.INTERACTION_OPERAND__NAME :
				return isSetName();
			case UMLPackage.INTERACTION_OPERAND__NAME_EXPRESSION :
				return nameExpression != null;
			case UMLPackage.INTERACTION_OPERAND__NAMESPACE :
				return isSetNamespace();
			case UMLPackage.INTERACTION_OPERAND__QUALIFIED_NAME :
				return QUALIFIED_NAME_EDEFAULT == null
					? getQualifiedName() != null
					: !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case UMLPackage.INTERACTION_OPERAND__VISIBILITY :
				return isSetVisibility();
			case UMLPackage.INTERACTION_OPERAND__OWNED_RULE :
				return ownedRules != null && !ownedRules.isEmpty();
			case UMLPackage.INTERACTION_OPERAND__ELEMENT_IMPORT :
				return elementImports != null && !elementImports.isEmpty();
			case UMLPackage.INTERACTION_OPERAND__PACKAGE_IMPORT :
				return packageImports != null && !packageImports.isEmpty();
			case UMLPackage.INTERACTION_OPERAND__OWNED_MEMBER :
				return isSetOwnedMembers();
			case UMLPackage.INTERACTION_OPERAND__IMPORTED_MEMBER :
				return !getImportedMembers().isEmpty();
			case UMLPackage.INTERACTION_OPERAND__MEMBER :
				return isSetMembers();
			case UMLPackage.INTERACTION_OPERAND__COVERED :
				return covereds != null && !covereds.isEmpty();
			case UMLPackage.INTERACTION_OPERAND__ENCLOSING_OPERAND :
				return basicGetEnclosingOperand() != null;
			case UMLPackage.INTERACTION_OPERAND__ENCLOSING_INTERACTION :
				return basicGetEnclosingInteraction() != null;
			case UMLPackage.INTERACTION_OPERAND__GENERAL_ORDERING :
				return generalOrderings != null && !generalOrderings.isEmpty();
			case UMLPackage.INTERACTION_OPERAND__FRAGMENT :
				return fragments != null && !fragments.isEmpty();
			case UMLPackage.INTERACTION_OPERAND__GUARD :
				return guard != null;
		}
		return eDynamicIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID,
			Class<?> baseClass) {
		if (baseClass == InteractionFragment.class) {
			switch (derivedFeatureID) {
				case UMLPackage.INTERACTION_OPERAND__COVERED :
					return UMLPackage.INTERACTION_FRAGMENT__COVERED;
				case UMLPackage.INTERACTION_OPERAND__ENCLOSING_OPERAND :
					return UMLPackage.INTERACTION_FRAGMENT__ENCLOSING_OPERAND;
				case UMLPackage.INTERACTION_OPERAND__ENCLOSING_INTERACTION :
					return UMLPackage.INTERACTION_FRAGMENT__ENCLOSING_INTERACTION;
				case UMLPackage.INTERACTION_OPERAND__GENERAL_ORDERING :
					return UMLPackage.INTERACTION_FRAGMENT__GENERAL_ORDERING;
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
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID,
			Class<?> baseClass) {
		if (baseClass == InteractionFragment.class) {
			switch (baseFeatureID) {
				case UMLPackage.INTERACTION_FRAGMENT__COVERED :
					return UMLPackage.INTERACTION_OPERAND__COVERED;
				case UMLPackage.INTERACTION_FRAGMENT__ENCLOSING_OPERAND :
					return UMLPackage.INTERACTION_OPERAND__ENCLOSING_OPERAND;
				case UMLPackage.INTERACTION_FRAGMENT__ENCLOSING_INTERACTION :
					return UMLPackage.INTERACTION_OPERAND__ENCLOSING_INTERACTION;
				case UMLPackage.INTERACTION_FRAGMENT__GENERAL_ORDERING :
					return UMLPackage.INTERACTION_OPERAND__GENERAL_ORDERING;
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
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments)
			throws InvocationTargetException {
		switch (operationID) {
			case UMLPackage.INTERACTION_OPERAND___GET_EANNOTATION__STRING :
				return getEAnnotation((String) arguments.get(0));
			case UMLPackage.INTERACTION_OPERAND___VALIDATE_HAS_OWNER__DIAGNOSTICCHAIN_MAP :
				return validateHasOwner((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.INTERACTION_OPERAND___VALIDATE_NOT_OWN_SELF__DIAGNOSTICCHAIN_MAP :
				return validateNotOwnSelf((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.INTERACTION_OPERAND___ADD_KEYWORD__STRING :
				return addKeyword((String) arguments.get(0));
			case UMLPackage.INTERACTION_OPERAND___APPLY_STEREOTYPE__STEREOTYPE :
				return applyStereotype((Stereotype) arguments.get(0));
			case UMLPackage.INTERACTION_OPERAND___CREATE_EANNOTATION__STRING :
				return createEAnnotation((String) arguments.get(0));
			case UMLPackage.INTERACTION_OPERAND___DESTROY :
				destroy();
				return null;
			case UMLPackage.INTERACTION_OPERAND___GET_KEYWORDS :
				return getKeywords();
			case UMLPackage.INTERACTION_OPERAND___GET_APPLICABLE_STEREOTYPE__STRING :
				return getApplicableStereotype((String) arguments.get(0));
			case UMLPackage.INTERACTION_OPERAND___GET_APPLICABLE_STEREOTYPES :
				return getApplicableStereotypes();
			case UMLPackage.INTERACTION_OPERAND___GET_APPLIED_STEREOTYPE__STRING :
				return getAppliedStereotype((String) arguments.get(0));
			case UMLPackage.INTERACTION_OPERAND___GET_APPLIED_STEREOTYPES :
				return getAppliedStereotypes();
			case UMLPackage.INTERACTION_OPERAND___GET_APPLIED_SUBSTEREOTYPE__STEREOTYPE_STRING :
				return getAppliedSubstereotype((Stereotype) arguments.get(0),
					(String) arguments.get(1));
			case UMLPackage.INTERACTION_OPERAND___GET_APPLIED_SUBSTEREOTYPES__STEREOTYPE :
				return getAppliedSubstereotypes((Stereotype) arguments.get(0));
			case UMLPackage.INTERACTION_OPERAND___GET_MODEL :
				return getModel();
			case UMLPackage.INTERACTION_OPERAND___GET_NEAREST_PACKAGE :
				return getNearestPackage();
			case UMLPackage.INTERACTION_OPERAND___GET_RELATIONSHIPS :
				return getRelationships();
			case UMLPackage.INTERACTION_OPERAND___GET_RELATIONSHIPS__ECLASS :
				return getRelationships((EClass) arguments.get(0));
			case UMLPackage.INTERACTION_OPERAND___GET_REQUIRED_STEREOTYPE__STRING :
				return getRequiredStereotype((String) arguments.get(0));
			case UMLPackage.INTERACTION_OPERAND___GET_REQUIRED_STEREOTYPES :
				return getRequiredStereotypes();
			case UMLPackage.INTERACTION_OPERAND___GET_SOURCE_DIRECTED_RELATIONSHIPS :
				return getSourceDirectedRelationships();
			case UMLPackage.INTERACTION_OPERAND___GET_SOURCE_DIRECTED_RELATIONSHIPS__ECLASS :
				return getSourceDirectedRelationships(
					(EClass) arguments.get(0));
			case UMLPackage.INTERACTION_OPERAND___GET_STEREOTYPE_APPLICATION__STEREOTYPE :
				return getStereotypeApplication((Stereotype) arguments.get(0));
			case UMLPackage.INTERACTION_OPERAND___GET_STEREOTYPE_APPLICATIONS :
				return getStereotypeApplications();
			case UMLPackage.INTERACTION_OPERAND___GET_TARGET_DIRECTED_RELATIONSHIPS :
				return getTargetDirectedRelationships();
			case UMLPackage.INTERACTION_OPERAND___GET_TARGET_DIRECTED_RELATIONSHIPS__ECLASS :
				return getTargetDirectedRelationships(
					(EClass) arguments.get(0));
			case UMLPackage.INTERACTION_OPERAND___GET_VALUE__STEREOTYPE_STRING :
				return getValue((Stereotype) arguments.get(0),
					(String) arguments.get(1));
			case UMLPackage.INTERACTION_OPERAND___HAS_KEYWORD__STRING :
				return hasKeyword((String) arguments.get(0));
			case UMLPackage.INTERACTION_OPERAND___HAS_VALUE__STEREOTYPE_STRING :
				return hasValue((Stereotype) arguments.get(0),
					(String) arguments.get(1));
			case UMLPackage.INTERACTION_OPERAND___IS_STEREOTYPE_APPLICABLE__STEREOTYPE :
				return isStereotypeApplicable((Stereotype) arguments.get(0));
			case UMLPackage.INTERACTION_OPERAND___IS_STEREOTYPE_APPLIED__STEREOTYPE :
				return isStereotypeApplied((Stereotype) arguments.get(0));
			case UMLPackage.INTERACTION_OPERAND___IS_STEREOTYPE_REQUIRED__STEREOTYPE :
				return isStereotypeRequired((Stereotype) arguments.get(0));
			case UMLPackage.INTERACTION_OPERAND___REMOVE_KEYWORD__STRING :
				return removeKeyword((String) arguments.get(0));
			case UMLPackage.INTERACTION_OPERAND___SET_VALUE__STEREOTYPE_STRING_OBJECT :
				setValue((Stereotype) arguments.get(0),
					(String) arguments.get(1), arguments.get(2));
				return null;
			case UMLPackage.INTERACTION_OPERAND___UNAPPLY_STEREOTYPE__STEREOTYPE :
				return unapplyStereotype((Stereotype) arguments.get(0));
			case UMLPackage.INTERACTION_OPERAND___ALL_OWNED_ELEMENTS :
				return allOwnedElements();
			case UMLPackage.INTERACTION_OPERAND___MUST_BE_OWNED :
				return mustBeOwned();
			case UMLPackage.INTERACTION_OPERAND___VALIDATE_VISIBILITY_NEEDS_OWNERSHIP__DIAGNOSTICCHAIN_MAP :
				return validateVisibilityNeedsOwnership(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.INTERACTION_OPERAND___VALIDATE_HAS_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP :
				return validateHasQualifiedName(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.INTERACTION_OPERAND___VALIDATE_HAS_NO_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP :
				return validateHasNoQualifiedName(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.INTERACTION_OPERAND___CREATE_DEPENDENCY__NAMEDELEMENT :
				return createDependency((NamedElement) arguments.get(0));
			case UMLPackage.INTERACTION_OPERAND___CREATE_USAGE__NAMEDELEMENT :
				return createUsage((NamedElement) arguments.get(0));
			case UMLPackage.INTERACTION_OPERAND___GET_LABEL :
				return getLabel();
			case UMLPackage.INTERACTION_OPERAND___GET_LABEL__BOOLEAN :
				return getLabel((Boolean) arguments.get(0));
			case UMLPackage.INTERACTION_OPERAND___GET_NAMESPACE :
				return getNamespace();
			case UMLPackage.INTERACTION_OPERAND___ALL_NAMESPACES :
				return allNamespaces();
			case UMLPackage.INTERACTION_OPERAND___ALL_OWNING_PACKAGES :
				return allOwningPackages();
			case UMLPackage.INTERACTION_OPERAND___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE :
				return isDistinguishableFrom((NamedElement) arguments.get(0),
					(Namespace) arguments.get(1));
			case UMLPackage.INTERACTION_OPERAND___GET_QUALIFIED_NAME :
				return getQualifiedName();
			case UMLPackage.INTERACTION_OPERAND___SEPARATOR :
				return separator();
			case UMLPackage.INTERACTION_OPERAND___GET_CLIENT_DEPENDENCIES :
				return getClientDependencies();
			case UMLPackage.INTERACTION_OPERAND___VALIDATE_MEMBERS_DISTINGUISHABLE__DIAGNOSTICCHAIN_MAP :
				return validateMembersDistinguishable(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.INTERACTION_OPERAND___VALIDATE_CANNOT_IMPORT_SELF__DIAGNOSTICCHAIN_MAP :
				return validateCannotImportSelf(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.INTERACTION_OPERAND___VALIDATE_CANNOT_IMPORT_OWNED_MEMBERS__DIAGNOSTICCHAIN_MAP :
				return validateCannotImportOwnedMembers(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.INTERACTION_OPERAND___CREATE_ELEMENT_IMPORT__PACKAGEABLEELEMENT_VISIBILITYKIND :
				return createElementImport(
					(PackageableElement) arguments.get(0),
					(VisibilityKind) arguments.get(1));
			case UMLPackage.INTERACTION_OPERAND___CREATE_PACKAGE_IMPORT__PACKAGE_VISIBILITYKIND :
				return createPackageImport(
					(org.eclipse.uml2.uml.Package) arguments.get(0),
					(VisibilityKind) arguments.get(1));
			case UMLPackage.INTERACTION_OPERAND___GET_IMPORTED_ELEMENTS :
				return getImportedElements();
			case UMLPackage.INTERACTION_OPERAND___GET_IMPORTED_PACKAGES :
				return getImportedPackages();
			case UMLPackage.INTERACTION_OPERAND___GET_OWNED_MEMBERS :
				return getOwnedMembers();
			case UMLPackage.INTERACTION_OPERAND___EXCLUDE_COLLISIONS__ELIST :
				return excludeCollisions(
					(EList<PackageableElement>) arguments.get(0));
			case UMLPackage.INTERACTION_OPERAND___GET_NAMES_OF_MEMBER__NAMEDELEMENT :
				return getNamesOfMember((NamedElement) arguments.get(0));
			case UMLPackage.INTERACTION_OPERAND___IMPORT_MEMBERS__ELIST :
				return importMembers(
					(EList<PackageableElement>) arguments.get(0));
			case UMLPackage.INTERACTION_OPERAND___GET_IMPORTED_MEMBERS :
				return getImportedMembers();
			case UMLPackage.INTERACTION_OPERAND___MEMBERS_ARE_DISTINGUISHABLE :
				return membersAreDistinguishable();
			case UMLPackage.INTERACTION_OPERAND___VALIDATE_GUARD_CONTAIN_REFERENCES__DIAGNOSTICCHAIN_MAP :
				return validateGuardContainReferences(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.INTERACTION_OPERAND___VALIDATE_GUARD_DIRECTLY_PRIOR__DIAGNOSTICCHAIN_MAP :
				return validateGuardDirectlyPrior(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
		}
		return eDynamicInvoke(operationID, arguments);
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
		UMLPackage.INTERACTION_OPERAND__OWNED_COMMENT,
		UMLPackage.INTERACTION_OPERAND__NAME_EXPRESSION,
		UMLPackage.INTERACTION_OPERAND__ELEMENT_IMPORT,
		UMLPackage.INTERACTION_OPERAND__PACKAGE_IMPORT,
		UMLPackage.INTERACTION_OPERAND__OWNED_MEMBER,
		UMLPackage.INTERACTION_OPERAND__GENERAL_ORDERING,
		UMLPackage.INTERACTION_OPERAND__GUARD};

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Namespace getNamespace() {
		Namespace namespace = basicGetNamespace();
		return namespace != null && namespace.eIsProxy()
			? (Namespace) eResolveProxy((InternalEObject) namespace)
			: namespace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
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
	@Override
	public Namespace basicGetNamespace() {
		InteractionOperand enclosingOperand = basicGetEnclosingOperand();
		if (enclosingOperand != null) {
			return enclosingOperand;
		}
		Interaction enclosingInteraction = basicGetEnclosingInteraction();
		if (enclosingInteraction != null) {
			return enclosingInteraction;
		}
		return super.basicGetNamespace();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetNamespace() {
		return super.isSetNamespace()
			|| eIsSet(UMLPackage.INTERACTION_OPERAND__ENCLOSING_OPERAND)
			|| eIsSet(UMLPackage.INTERACTION_OPERAND__ENCLOSING_INTERACTION);
	}

	/**
	 * The array of subset feature identifiers for the '{@link #getOwnedMembers() <em>Owned Member</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedMembers()
	 * @generated
	 * @ordered
	 */
	protected static final int[] OWNED_MEMBER_ESUBSETS = new int[]{
		UMLPackage.INTERACTION_OPERAND__OWNED_RULE,
		UMLPackage.INTERACTION_OPERAND__FRAGMENT};

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetOwnedMembers() {
		return super.isSetOwnedMembers()
			|| eIsSet(UMLPackage.INTERACTION_OPERAND__FRAGMENT);
	}

} //InteractionOperandImpl
