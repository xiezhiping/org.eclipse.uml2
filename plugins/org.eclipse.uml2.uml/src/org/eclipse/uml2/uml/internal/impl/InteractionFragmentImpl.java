/*
 * Copyright (c) 2005, 2016 IBM Corporation, CEA, and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *   Kenn Hussey (CEA) - 327039, 418466, 451350, 485756
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

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.uml2.common.util.CacheAdapter;
import org.eclipse.uml2.common.util.DerivedUnionEObjectEList;

import org.eclipse.uml2.uml.Comment;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.GeneralOrdering;
import org.eclipse.uml2.uml.Interaction;
import org.eclipse.uml2.uml.InteractionFragment;
import org.eclipse.uml2.uml.InteractionOperand;
import org.eclipse.uml2.uml.Lifeline;
import org.eclipse.uml2.uml.Namespace;
import org.eclipse.uml2.uml.StringExpression;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.VisibilityKind;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Interaction Fragment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.InteractionFragmentImpl#getNamespace <em>Namespace</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.InteractionFragmentImpl#getOwnedElements <em>Owned Element</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.InteractionFragmentImpl#getCovereds <em>Covered</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.InteractionFragmentImpl#getEnclosingOperand <em>Enclosing Operand</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.InteractionFragmentImpl#getEnclosingInteraction <em>Enclosing Interaction</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.InteractionFragmentImpl#getGeneralOrderings <em>General Ordering</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class InteractionFragmentImpl
		extends NamedElementImpl
		implements InteractionFragment {

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InteractionFragmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UMLPackage.Literals.INTERACTION_FRAGMENT;
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
						UMLPackage.INTERACTION_FRAGMENT__OWNED_ELEMENT,
						OWNED_ELEMENT_ESUBSETS));
			}
			return ownedElements;
		}
		return new DerivedUnionEObjectEList<Element>(Element.class, this,
			UMLPackage.INTERACTION_FRAGMENT__OWNED_ELEMENT,
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
				Lifeline.class, this, UMLPackage.INTERACTION_FRAGMENT__COVERED,
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
				UMLPackage.INTERACTION_FRAGMENT__GENERAL_ORDERING);
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
		if (eContainerFeatureID() != UMLPackage.INTERACTION_FRAGMENT__ENCLOSING_INTERACTION)
			return null;
		return (Interaction) eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Interaction basicGetEnclosingInteraction() {
		if (eContainerFeatureID() != UMLPackage.INTERACTION_FRAGMENT__ENCLOSING_INTERACTION)
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
			UMLPackage.INTERACTION_FRAGMENT__ENCLOSING_INTERACTION, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnclosingInteraction(Interaction newEnclosingInteraction) {
		if (newEnclosingInteraction != eInternalContainer()
			|| (eContainerFeatureID() != UMLPackage.INTERACTION_FRAGMENT__ENCLOSING_INTERACTION
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
				UMLPackage.INTERACTION_FRAGMENT__ENCLOSING_INTERACTION,
				newEnclosingInteraction, newEnclosingInteraction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InteractionOperand getEnclosingOperand() {
		if (eContainerFeatureID() != UMLPackage.INTERACTION_FRAGMENT__ENCLOSING_OPERAND)
			return null;
		return (InteractionOperand) eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InteractionOperand basicGetEnclosingOperand() {
		if (eContainerFeatureID() != UMLPackage.INTERACTION_FRAGMENT__ENCLOSING_OPERAND)
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
			UMLPackage.INTERACTION_FRAGMENT__ENCLOSING_OPERAND, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnclosingOperand(InteractionOperand newEnclosingOperand) {
		if (newEnclosingOperand != eInternalContainer()
			|| (eContainerFeatureID() != UMLPackage.INTERACTION_FRAGMENT__ENCLOSING_OPERAND
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
				UMLPackage.INTERACTION_FRAGMENT__ENCLOSING_OPERAND,
				newEnclosingOperand, newEnclosingOperand));
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
			case UMLPackage.INTERACTION_FRAGMENT__EANNOTATIONS :
				return ((InternalEList<InternalEObject>) (InternalEList<?>) getEAnnotations())
					.basicAdd(otherEnd, msgs);
			case UMLPackage.INTERACTION_FRAGMENT__COVERED :
				return ((InternalEList<InternalEObject>) (InternalEList<?>) getCovereds())
					.basicAdd(otherEnd, msgs);
			case UMLPackage.INTERACTION_FRAGMENT__ENCLOSING_OPERAND :
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetEnclosingOperand((InteractionOperand) otherEnd,
					msgs);
			case UMLPackage.INTERACTION_FRAGMENT__ENCLOSING_INTERACTION :
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
			case UMLPackage.INTERACTION_FRAGMENT__EANNOTATIONS :
				return ((InternalEList<?>) getEAnnotations())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.INTERACTION_FRAGMENT__OWNED_COMMENT :
				return ((InternalEList<?>) getOwnedComments())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.INTERACTION_FRAGMENT__NAME_EXPRESSION :
				return basicSetNameExpression(null, msgs);
			case UMLPackage.INTERACTION_FRAGMENT__COVERED :
				return ((InternalEList<?>) getCovereds()).basicRemove(otherEnd,
					msgs);
			case UMLPackage.INTERACTION_FRAGMENT__ENCLOSING_OPERAND :
				return basicSetEnclosingOperand(null, msgs);
			case UMLPackage.INTERACTION_FRAGMENT__ENCLOSING_INTERACTION :
				return basicSetEnclosingInteraction(null, msgs);
			case UMLPackage.INTERACTION_FRAGMENT__GENERAL_ORDERING :
				return ((InternalEList<?>) getGeneralOrderings())
					.basicRemove(otherEnd, msgs);
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
			case UMLPackage.INTERACTION_FRAGMENT__ENCLOSING_OPERAND :
				return eInternalContainer().eInverseRemove(this,
					UMLPackage.INTERACTION_OPERAND__FRAGMENT,
					InteractionOperand.class, msgs);
			case UMLPackage.INTERACTION_FRAGMENT__ENCLOSING_INTERACTION :
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
			case UMLPackage.INTERACTION_FRAGMENT__EANNOTATIONS :
				return getEAnnotations();
			case UMLPackage.INTERACTION_FRAGMENT__OWNED_COMMENT :
				return getOwnedComments();
			case UMLPackage.INTERACTION_FRAGMENT__OWNED_ELEMENT :
				return getOwnedElements();
			case UMLPackage.INTERACTION_FRAGMENT__OWNER :
				if (resolve)
					return getOwner();
				return basicGetOwner();
			case UMLPackage.INTERACTION_FRAGMENT__CLIENT_DEPENDENCY :
				return getClientDependencies();
			case UMLPackage.INTERACTION_FRAGMENT__NAME :
				return getName();
			case UMLPackage.INTERACTION_FRAGMENT__NAME_EXPRESSION :
				if (resolve)
					return getNameExpression();
				return basicGetNameExpression();
			case UMLPackage.INTERACTION_FRAGMENT__NAMESPACE :
				if (resolve)
					return getNamespace();
				return basicGetNamespace();
			case UMLPackage.INTERACTION_FRAGMENT__QUALIFIED_NAME :
				return getQualifiedName();
			case UMLPackage.INTERACTION_FRAGMENT__VISIBILITY :
				return getVisibility();
			case UMLPackage.INTERACTION_FRAGMENT__COVERED :
				return getCovereds();
			case UMLPackage.INTERACTION_FRAGMENT__ENCLOSING_OPERAND :
				if (resolve)
					return getEnclosingOperand();
				return basicGetEnclosingOperand();
			case UMLPackage.INTERACTION_FRAGMENT__ENCLOSING_INTERACTION :
				if (resolve)
					return getEnclosingInteraction();
				return basicGetEnclosingInteraction();
			case UMLPackage.INTERACTION_FRAGMENT__GENERAL_ORDERING :
				return getGeneralOrderings();
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
			case UMLPackage.INTERACTION_FRAGMENT__EANNOTATIONS :
				getEAnnotations().clear();
				getEAnnotations()
					.addAll((Collection<? extends EAnnotation>) newValue);
				return;
			case UMLPackage.INTERACTION_FRAGMENT__OWNED_COMMENT :
				getOwnedComments().clear();
				getOwnedComments()
					.addAll((Collection<? extends Comment>) newValue);
				return;
			case UMLPackage.INTERACTION_FRAGMENT__NAME :
				setName((String) newValue);
				return;
			case UMLPackage.INTERACTION_FRAGMENT__NAME_EXPRESSION :
				setNameExpression((StringExpression) newValue);
				return;
			case UMLPackage.INTERACTION_FRAGMENT__VISIBILITY :
				setVisibility((VisibilityKind) newValue);
				return;
			case UMLPackage.INTERACTION_FRAGMENT__COVERED :
				getCovereds().clear();
				getCovereds().addAll((Collection<? extends Lifeline>) newValue);
				return;
			case UMLPackage.INTERACTION_FRAGMENT__ENCLOSING_OPERAND :
				setEnclosingOperand((InteractionOperand) newValue);
				return;
			case UMLPackage.INTERACTION_FRAGMENT__ENCLOSING_INTERACTION :
				setEnclosingInteraction((Interaction) newValue);
				return;
			case UMLPackage.INTERACTION_FRAGMENT__GENERAL_ORDERING :
				getGeneralOrderings().clear();
				getGeneralOrderings()
					.addAll((Collection<? extends GeneralOrdering>) newValue);
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
			case UMLPackage.INTERACTION_FRAGMENT__EANNOTATIONS :
				getEAnnotations().clear();
				return;
			case UMLPackage.INTERACTION_FRAGMENT__OWNED_COMMENT :
				getOwnedComments().clear();
				return;
			case UMLPackage.INTERACTION_FRAGMENT__NAME :
				unsetName();
				return;
			case UMLPackage.INTERACTION_FRAGMENT__NAME_EXPRESSION :
				setNameExpression((StringExpression) null);
				return;
			case UMLPackage.INTERACTION_FRAGMENT__VISIBILITY :
				unsetVisibility();
				return;
			case UMLPackage.INTERACTION_FRAGMENT__COVERED :
				getCovereds().clear();
				return;
			case UMLPackage.INTERACTION_FRAGMENT__ENCLOSING_OPERAND :
				setEnclosingOperand((InteractionOperand) null);
				return;
			case UMLPackage.INTERACTION_FRAGMENT__ENCLOSING_INTERACTION :
				setEnclosingInteraction((Interaction) null);
				return;
			case UMLPackage.INTERACTION_FRAGMENT__GENERAL_ORDERING :
				getGeneralOrderings().clear();
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
			case UMLPackage.INTERACTION_FRAGMENT__EANNOTATIONS :
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UMLPackage.INTERACTION_FRAGMENT__OWNED_COMMENT :
				return ownedComments != null && !ownedComments.isEmpty();
			case UMLPackage.INTERACTION_FRAGMENT__OWNED_ELEMENT :
				return isSetOwnedElements();
			case UMLPackage.INTERACTION_FRAGMENT__OWNER :
				return isSetOwner();
			case UMLPackage.INTERACTION_FRAGMENT__CLIENT_DEPENDENCY :
				return !getClientDependencies().isEmpty();
			case UMLPackage.INTERACTION_FRAGMENT__NAME :
				return isSetName();
			case UMLPackage.INTERACTION_FRAGMENT__NAME_EXPRESSION :
				return nameExpression != null;
			case UMLPackage.INTERACTION_FRAGMENT__NAMESPACE :
				return isSetNamespace();
			case UMLPackage.INTERACTION_FRAGMENT__QUALIFIED_NAME :
				return QUALIFIED_NAME_EDEFAULT == null
					? getQualifiedName() != null
					: !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case UMLPackage.INTERACTION_FRAGMENT__VISIBILITY :
				return isSetVisibility();
			case UMLPackage.INTERACTION_FRAGMENT__COVERED :
				return covereds != null && !covereds.isEmpty();
			case UMLPackage.INTERACTION_FRAGMENT__ENCLOSING_OPERAND :
				return basicGetEnclosingOperand() != null;
			case UMLPackage.INTERACTION_FRAGMENT__ENCLOSING_INTERACTION :
				return basicGetEnclosingInteraction() != null;
			case UMLPackage.INTERACTION_FRAGMENT__GENERAL_ORDERING :
				return generalOrderings != null && !generalOrderings.isEmpty();
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
		UMLPackage.INTERACTION_FRAGMENT__OWNED_COMMENT,
		UMLPackage.INTERACTION_FRAGMENT__NAME_EXPRESSION,
		UMLPackage.INTERACTION_FRAGMENT__GENERAL_ORDERING};

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
			|| eIsSet(UMLPackage.INTERACTION_FRAGMENT__GENERAL_ORDERING);
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
			|| eIsSet(UMLPackage.INTERACTION_FRAGMENT__ENCLOSING_OPERAND)
			|| eIsSet(UMLPackage.INTERACTION_FRAGMENT__ENCLOSING_INTERACTION);
	}

} //InteractionFragmentImpl
