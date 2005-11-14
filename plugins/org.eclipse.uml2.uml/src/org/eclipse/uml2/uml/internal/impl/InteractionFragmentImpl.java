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
 * $Id: InteractionFragmentImpl.java,v 1.1 2005/11/14 22:26:03 khussey Exp $
 */
package org.eclipse.uml2.uml.internal.impl;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.uml2.common.util.DerivedUnionEObjectEList;

import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.GeneralOrdering;
import org.eclipse.uml2.uml.Interaction;
import org.eclipse.uml2.uml.InteractionFragment;
import org.eclipse.uml2.uml.InteractionOperand;
import org.eclipse.uml2.uml.Lifeline;
import org.eclipse.uml2.uml.Namespace;
import org.eclipse.uml2.uml.StringExpression;
import org.eclipse.uml2.uml.UMLFactory;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.VisibilityKind;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Interaction Fragment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.InteractionFragmentImpl#getOwnedElements <em>Owned Element</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.InteractionFragmentImpl#getCovereds <em>Covered</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.InteractionFragmentImpl#getGeneralOrderings <em>General Ordering</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.InteractionFragmentImpl#getEnclosingInteraction <em>Enclosing Interaction</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.InteractionFragmentImpl#getEnclosingOperand <em>Enclosing Operand</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class InteractionFragmentImpl
		extends NamedElementImpl
		implements InteractionFragment {

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
	protected EClass eStaticClass() {
		return UMLPackage.eINSTANCE.getInteractionFragment();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List getOwnedElements() {
		List ownedElement = (List) eVirtualGet(UMLPackage.INTERACTION_FRAGMENT__OWNED_ELEMENT);
		if (ownedElement == null) {
			eVirtualSet(UMLPackage.INTERACTION_FRAGMENT__OWNED_ELEMENT,
				ownedElement = new DerivedUnionEObjectEList(Element.class,
					this, UMLPackage.INTERACTION_FRAGMENT__OWNED_ELEMENT,
					new EStructuralFeature[]{
						UMLPackage.eINSTANCE.getElement_OwnedComment(),
						UMLPackage.eINSTANCE.getNamedElement_NameExpression(),
						UMLPackage.eINSTANCE
							.getInteractionFragment_GeneralOrdering()}));
		}
		return ownedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List getCovereds() {
		List covered = (List) eVirtualGet(UMLPackage.INTERACTION_FRAGMENT__COVERED);
		if (covered == null) {
			eVirtualSet(UMLPackage.INTERACTION_FRAGMENT__COVERED,
				covered = new EObjectWithInverseResolvingEList.ManyInverse(
					Lifeline.class, this,
					UMLPackage.INTERACTION_FRAGMENT__COVERED,
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
		List generalOrdering = (List) eVirtualGet(UMLPackage.INTERACTION_FRAGMENT__GENERAL_ORDERING);
		if (generalOrdering == null) {
			eVirtualSet(UMLPackage.INTERACTION_FRAGMENT__GENERAL_ORDERING,
				generalOrdering = new EObjectContainmentEList(
					GeneralOrdering.class, this,
					UMLPackage.INTERACTION_FRAGMENT__GENERAL_ORDERING));
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
		if (eContainerFeatureID != UMLPackage.INTERACTION_FRAGMENT__ENCLOSING_INTERACTION)
			return null;
		return (Interaction) eContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnclosingInteraction(Interaction newEnclosingInteraction) {
		if (newEnclosingInteraction != eContainer
			|| (eContainerFeatureID != UMLPackage.INTERACTION_FRAGMENT__ENCLOSING_INTERACTION && newEnclosingInteraction != null)) {
			if (EcoreUtil.isAncestor(this, (EObject) newEnclosingInteraction))
				throw new IllegalArgumentException(
					"Recursive containment not allowed for " + toString()); //$NON-NLS-1$
			NotificationChain msgs = null;
			if (eContainer != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newEnclosingInteraction != null)
				msgs = ((InternalEObject) newEnclosingInteraction).eInverseAdd(
					this, UMLPackage.INTERACTION__FRAGMENT, Interaction.class,
					msgs);
			msgs = eBasicSetContainer(
				(InternalEObject) newEnclosingInteraction,
				UMLPackage.INTERACTION_FRAGMENT__ENCLOSING_INTERACTION, msgs);
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
		if (eContainerFeatureID != UMLPackage.INTERACTION_FRAGMENT__ENCLOSING_OPERAND)
			return null;
		return (InteractionOperand) eContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnclosingOperand(InteractionOperand newEnclosingOperand) {
		if (newEnclosingOperand != eContainer
			|| (eContainerFeatureID != UMLPackage.INTERACTION_FRAGMENT__ENCLOSING_OPERAND && newEnclosingOperand != null)) {
			if (EcoreUtil.isAncestor(this, (EObject) newEnclosingOperand))
				throw new IllegalArgumentException(
					"Recursive containment not allowed for " + toString()); //$NON-NLS-1$
			NotificationChain msgs = null;
			if (eContainer != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newEnclosingOperand != null)
				msgs = ((InternalEObject) newEnclosingOperand).eInverseAdd(
					this, UMLPackage.INTERACTION_OPERAND__FRAGMENT,
					InteractionOperand.class, msgs);
			msgs = eBasicSetContainer((InternalEObject) newEnclosingOperand,
				UMLPackage.INTERACTION_FRAGMENT__ENCLOSING_OPERAND, msgs);
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
	public NotificationChain eInverseAdd(InternalEObject otherEnd,
			int featureID, Class baseClass, NotificationChain msgs) {
		if (featureID >= 0) {
			switch (eDerivedStructuralFeatureID(featureID, baseClass)) {
				case UMLPackage.INTERACTION_FRAGMENT__EANNOTATIONS :
					return ((InternalEList) getEAnnotations()).basicAdd(
						otherEnd, msgs);
				case UMLPackage.INTERACTION_FRAGMENT__CLIENT_DEPENDENCY :
					return ((InternalEList) getClientDependencies()).basicAdd(
						otherEnd, msgs);
				case UMLPackage.INTERACTION_FRAGMENT__COVERED :
					return ((InternalEList) getCovereds()).basicAdd(otherEnd,
						msgs);
				case UMLPackage.INTERACTION_FRAGMENT__ENCLOSING_INTERACTION :
					if (eContainer != null)
						msgs = eBasicRemoveFromContainer(msgs);
					return eBasicSetContainer(otherEnd,
						UMLPackage.INTERACTION_FRAGMENT__ENCLOSING_INTERACTION,
						msgs);
				case UMLPackage.INTERACTION_FRAGMENT__ENCLOSING_OPERAND :
					if (eContainer != null)
						msgs = eBasicRemoveFromContainer(msgs);
					return eBasicSetContainer(otherEnd,
						UMLPackage.INTERACTION_FRAGMENT__ENCLOSING_OPERAND,
						msgs);
				default :
					return eDynamicInverseAdd(otherEnd, featureID, baseClass,
						msgs);
			}
		}
		if (eContainer != null)
			msgs = eBasicRemoveFromContainer(msgs);
		return eBasicSetContainer(otherEnd, featureID, msgs);
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
				case UMLPackage.INTERACTION_FRAGMENT__EANNOTATIONS :
					return ((InternalEList) getEAnnotations()).basicRemove(
						otherEnd, msgs);
				case UMLPackage.INTERACTION_FRAGMENT__OWNED_COMMENT :
					return ((InternalEList) getOwnedComments()).basicRemove(
						otherEnd, msgs);
				case UMLPackage.INTERACTION_FRAGMENT__CLIENT_DEPENDENCY :
					return ((InternalEList) getClientDependencies())
						.basicRemove(otherEnd, msgs);
				case UMLPackage.INTERACTION_FRAGMENT__NAME_EXPRESSION :
					return basicSetNameExpression(null, msgs);
				case UMLPackage.INTERACTION_FRAGMENT__COVERED :
					return ((InternalEList) getCovereds()).basicRemove(
						otherEnd, msgs);
				case UMLPackage.INTERACTION_FRAGMENT__GENERAL_ORDERING :
					return ((InternalEList) getGeneralOrderings()).basicRemove(
						otherEnd, msgs);
				case UMLPackage.INTERACTION_FRAGMENT__ENCLOSING_INTERACTION :
					return eBasicSetContainer(null,
						UMLPackage.INTERACTION_FRAGMENT__ENCLOSING_INTERACTION,
						msgs);
				case UMLPackage.INTERACTION_FRAGMENT__ENCLOSING_OPERAND :
					return eBasicSetContainer(null,
						UMLPackage.INTERACTION_FRAGMENT__ENCLOSING_OPERAND,
						msgs);
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
	public NotificationChain eBasicRemoveFromContainer(NotificationChain msgs) {
		if (eContainerFeatureID >= 0) {
			switch (eContainerFeatureID) {
				case UMLPackage.INTERACTION_FRAGMENT__ENCLOSING_INTERACTION :
					return eContainer.eInverseRemove(this,
						UMLPackage.INTERACTION__FRAGMENT, Interaction.class,
						msgs);
				case UMLPackage.INTERACTION_FRAGMENT__ENCLOSING_OPERAND :
					return eContainer.eInverseRemove(this,
						UMLPackage.INTERACTION_OPERAND__FRAGMENT,
						InteractionOperand.class, msgs);
				default :
					return eDynamicBasicRemoveFromContainer(msgs);
			}
		}
		return eContainer.eInverseRemove(this, EOPPOSITE_FEATURE_BASE
			- eContainerFeatureID, null, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(EStructuralFeature eFeature, boolean resolve) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case UMLPackage.INTERACTION_FRAGMENT__EANNOTATIONS :
				return getEAnnotations();
			case UMLPackage.INTERACTION_FRAGMENT__OWNED_ELEMENT :
				return getOwnedElements();
			case UMLPackage.INTERACTION_FRAGMENT__OWNER :
				if (resolve)
					return getOwner();
				return basicGetOwner();
			case UMLPackage.INTERACTION_FRAGMENT__OWNED_COMMENT :
				return getOwnedComments();
			case UMLPackage.INTERACTION_FRAGMENT__NAME :
				return getName();
			case UMLPackage.INTERACTION_FRAGMENT__VISIBILITY :
				return getVisibility();
			case UMLPackage.INTERACTION_FRAGMENT__QUALIFIED_NAME :
				return getQualifiedName();
			case UMLPackage.INTERACTION_FRAGMENT__CLIENT_DEPENDENCY :
				return getClientDependencies();
			case UMLPackage.INTERACTION_FRAGMENT__NAMESPACE :
				if (resolve)
					return getNamespace();
				return basicGetNamespace();
			case UMLPackage.INTERACTION_FRAGMENT__NAME_EXPRESSION :
				return getNameExpression();
			case UMLPackage.INTERACTION_FRAGMENT__COVERED :
				return getCovereds();
			case UMLPackage.INTERACTION_FRAGMENT__GENERAL_ORDERING :
				return getGeneralOrderings();
			case UMLPackage.INTERACTION_FRAGMENT__ENCLOSING_INTERACTION :
				return getEnclosingInteraction();
			case UMLPackage.INTERACTION_FRAGMENT__ENCLOSING_OPERAND :
				return getEnclosingOperand();
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
			case UMLPackage.INTERACTION_FRAGMENT__EANNOTATIONS :
				getEAnnotations().clear();
				getEAnnotations().addAll((Collection) newValue);
				return;
			case UMLPackage.INTERACTION_FRAGMENT__OWNED_COMMENT :
				getOwnedComments().clear();
				getOwnedComments().addAll((Collection) newValue);
				return;
			case UMLPackage.INTERACTION_FRAGMENT__NAME :
				setName((String) newValue);
				return;
			case UMLPackage.INTERACTION_FRAGMENT__VISIBILITY :
				setVisibility((VisibilityKind) newValue);
				return;
			case UMLPackage.INTERACTION_FRAGMENT__CLIENT_DEPENDENCY :
				getClientDependencies().clear();
				getClientDependencies().addAll((Collection) newValue);
				return;
			case UMLPackage.INTERACTION_FRAGMENT__NAME_EXPRESSION :
				setNameExpression((StringExpression) newValue);
				return;
			case UMLPackage.INTERACTION_FRAGMENT__COVERED :
				getCovereds().clear();
				getCovereds().addAll((Collection) newValue);
				return;
			case UMLPackage.INTERACTION_FRAGMENT__GENERAL_ORDERING :
				getGeneralOrderings().clear();
				getGeneralOrderings().addAll((Collection) newValue);
				return;
			case UMLPackage.INTERACTION_FRAGMENT__ENCLOSING_INTERACTION :
				setEnclosingInteraction((Interaction) newValue);
				return;
			case UMLPackage.INTERACTION_FRAGMENT__ENCLOSING_OPERAND :
				setEnclosingOperand((InteractionOperand) newValue);
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
			case UMLPackage.INTERACTION_FRAGMENT__EANNOTATIONS :
				getEAnnotations().clear();
				return;
			case UMLPackage.INTERACTION_FRAGMENT__OWNED_COMMENT :
				getOwnedComments().clear();
				return;
			case UMLPackage.INTERACTION_FRAGMENT__NAME :
				setName(NAME_EDEFAULT);
				return;
			case UMLPackage.INTERACTION_FRAGMENT__VISIBILITY :
				setVisibility(VISIBILITY_EDEFAULT);
				return;
			case UMLPackage.INTERACTION_FRAGMENT__CLIENT_DEPENDENCY :
				getClientDependencies().clear();
				return;
			case UMLPackage.INTERACTION_FRAGMENT__NAME_EXPRESSION :
				setNameExpression((StringExpression) null);
				return;
			case UMLPackage.INTERACTION_FRAGMENT__COVERED :
				getCovereds().clear();
				return;
			case UMLPackage.INTERACTION_FRAGMENT__GENERAL_ORDERING :
				getGeneralOrderings().clear();
				return;
			case UMLPackage.INTERACTION_FRAGMENT__ENCLOSING_INTERACTION :
				setEnclosingInteraction((Interaction) null);
				return;
			case UMLPackage.INTERACTION_FRAGMENT__ENCLOSING_OPERAND :
				setEnclosingOperand((InteractionOperand) null);
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
			case UMLPackage.INTERACTION_FRAGMENT__EANNOTATIONS :
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UMLPackage.INTERACTION_FRAGMENT__OWNED_ELEMENT :
				return isSetOwnedElements();
			case UMLPackage.INTERACTION_FRAGMENT__OWNER :
				return isSetOwner();
			case UMLPackage.INTERACTION_FRAGMENT__OWNED_COMMENT :
				List ownedComment = (List) eVirtualGet(UMLPackage.INTERACTION_FRAGMENT__OWNED_COMMENT);
				return ownedComment != null && !ownedComment.isEmpty();
			case UMLPackage.INTERACTION_FRAGMENT__NAME :
				String name = eVirtualIsSet(UMLPackage.INTERACTION_FRAGMENT__NAME)
					? (String) eVirtualGet(UMLPackage.INTERACTION_FRAGMENT__NAME)
					: NAME_EDEFAULT;
				return NAME_EDEFAULT == null
					? name != null
					: !NAME_EDEFAULT.equals(name);
			case UMLPackage.INTERACTION_FRAGMENT__VISIBILITY :
				return eVirtualIsSet(UMLPackage.INTERACTION_FRAGMENT__VISIBILITY)
					&& eVirtualGet(UMLPackage.INTERACTION_FRAGMENT__VISIBILITY) != VISIBILITY_EDEFAULT;
			case UMLPackage.INTERACTION_FRAGMENT__QUALIFIED_NAME :
				return QUALIFIED_NAME_EDEFAULT == null
					? getQualifiedName() != null
					: !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case UMLPackage.INTERACTION_FRAGMENT__CLIENT_DEPENDENCY :
				List clientDependency = (List) eVirtualGet(UMLPackage.INTERACTION_FRAGMENT__CLIENT_DEPENDENCY);
				return clientDependency != null && !clientDependency.isEmpty();
			case UMLPackage.INTERACTION_FRAGMENT__NAMESPACE :
				return isSetNamespace();
			case UMLPackage.INTERACTION_FRAGMENT__NAME_EXPRESSION :
				return eVirtualGet(UMLPackage.INTERACTION_FRAGMENT__NAME_EXPRESSION) != null;
			case UMLPackage.INTERACTION_FRAGMENT__COVERED :
				List covered = (List) eVirtualGet(UMLPackage.INTERACTION_FRAGMENT__COVERED);
				return covered != null && !covered.isEmpty();
			case UMLPackage.INTERACTION_FRAGMENT__GENERAL_ORDERING :
				List generalOrdering = (List) eVirtualGet(UMLPackage.INTERACTION_FRAGMENT__GENERAL_ORDERING);
				return generalOrdering != null && !generalOrdering.isEmpty();
			case UMLPackage.INTERACTION_FRAGMENT__ENCLOSING_INTERACTION :
				return getEnclosingInteraction() != null;
			case UMLPackage.INTERACTION_FRAGMENT__ENCLOSING_OPERAND :
				return getEnclosingOperand() != null;
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
			|| eIsSet(UMLPackage.eINSTANCE
				.getInteractionFragment_GeneralOrdering());
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
			|| eIsSet(UMLPackage.eINSTANCE
				.getInteractionFragment_EnclosingOperand());
	}

} //InteractionFragmentImpl
