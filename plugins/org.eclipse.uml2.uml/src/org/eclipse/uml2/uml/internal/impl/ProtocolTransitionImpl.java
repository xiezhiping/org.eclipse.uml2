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
 * $Id: ProtocolTransitionImpl.java,v 1.2 2005/11/17 21:23:33 khussey Exp $
 */
package org.eclipse.uml2.uml.internal.impl;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.uml2.common.util.DerivedUnionEObjectEList;

import org.eclipse.uml2.uml.Behavior;
import org.eclipse.uml2.uml.Constraint;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Operation;
import org.eclipse.uml2.uml.ProtocolTransition;
import org.eclipse.uml2.uml.Region;
import org.eclipse.uml2.uml.StringExpression;
import org.eclipse.uml2.uml.Transition;
import org.eclipse.uml2.uml.TransitionKind;
import org.eclipse.uml2.uml.UMLFactory;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.Vertex;
import org.eclipse.uml2.uml.VisibilityKind;

import org.eclipse.uml2.uml.internal.operations.ProtocolTransitionOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Protocol Transition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ProtocolTransitionImpl#getOwnedElements <em>Owned Element</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ProtocolTransitionImpl#getGuard <em>Guard</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ProtocolTransitionImpl#getPostCondition <em>Post Condition</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ProtocolTransitionImpl#getReferreds <em>Referred</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ProtocolTransitionImpl#getPreCondition <em>Pre Condition</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProtocolTransitionImpl
		extends TransitionImpl
		implements ProtocolTransition {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProtocolTransitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return UMLPackage.eINSTANCE.getProtocolTransition();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List getOwnedElements() {
		List ownedElement = (List) eVirtualGet(UMLPackage.PROTOCOL_TRANSITION__OWNED_ELEMENT);
		if (ownedElement == null) {
			eVirtualSet(UMLPackage.PROTOCOL_TRANSITION__OWNED_ELEMENT,
				ownedElement = new DerivedUnionEObjectEList(Element.class,
					this, UMLPackage.PROTOCOL_TRANSITION__OWNED_ELEMENT,
					new EStructuralFeature[]{
						UMLPackage.eINSTANCE.getElement_OwnedComment(),
						UMLPackage.eINSTANCE.getNamedElement_NameExpression(),
						UMLPackage.eINSTANCE.getTransition_Guard(),
						UMLPackage.eINSTANCE.getTransition_Effect(),
						UMLPackage.eINSTANCE
							.getProtocolTransition_PostCondition()}));
		}
		return ownedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Constraint getGuard() {
		Constraint guard = (Constraint) eVirtualGet(UMLPackage.PROTOCOL_TRANSITION__GUARD);
		return guard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGuard(Constraint newGuard,
			NotificationChain msgs) {
		Object oldGuard = eVirtualSet(UMLPackage.PROTOCOL_TRANSITION__GUARD,
			newGuard);
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
				Notification.SET, UMLPackage.PROTOCOL_TRANSITION__GUARD,
				oldGuard == EVIRTUAL_NO_VALUE
					? null
					: oldGuard, newGuard);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}

		if (eVirtualGet(UMLPackage.PROTOCOL_TRANSITION__PRE_CONDITION) != null
			&& eVirtualGet(UMLPackage.PROTOCOL_TRANSITION__PRE_CONDITION) != newGuard) {
			setPreCondition(null);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGuard(Constraint newGuard) {
		Constraint guard = (Constraint) eVirtualGet(UMLPackage.PROTOCOL_TRANSITION__GUARD);
		if (newGuard != guard) {
			NotificationChain msgs = null;
			if (guard != null)
				msgs = ((InternalEObject) guard).eInverseRemove(this,
					EOPPOSITE_FEATURE_BASE
						- UMLPackage.PROTOCOL_TRANSITION__GUARD, null, msgs);
			if (newGuard != null)
				msgs = ((InternalEObject) newGuard).eInverseAdd(this,
					EOPPOSITE_FEATURE_BASE
						- UMLPackage.PROTOCOL_TRANSITION__GUARD, null, msgs);
			msgs = basicSetGuard(newGuard, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.PROTOCOL_TRANSITION__GUARD, newGuard, newGuard));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Constraint getPostCondition() {
		Constraint postCondition = (Constraint) eVirtualGet(UMLPackage.PROTOCOL_TRANSITION__POST_CONDITION);
		return postCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPostCondition(Constraint newPostCondition,
			NotificationChain msgs) {
		Object oldPostCondition = eVirtualSet(
			UMLPackage.PROTOCOL_TRANSITION__POST_CONDITION, newPostCondition);
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
				Notification.SET,
				UMLPackage.PROTOCOL_TRANSITION__POST_CONDITION,
				oldPostCondition == EVIRTUAL_NO_VALUE
					? null
					: oldPostCondition, newPostCondition);
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
	public void setPostCondition(Constraint newPostCondition) {
		Constraint postCondition = (Constraint) eVirtualGet(UMLPackage.PROTOCOL_TRANSITION__POST_CONDITION);
		if (newPostCondition != postCondition) {
			NotificationChain msgs = null;
			if (postCondition != null)
				msgs = ((InternalEObject) postCondition).eInverseRemove(this,
					EOPPOSITE_FEATURE_BASE
						- UMLPackage.PROTOCOL_TRANSITION__POST_CONDITION, null,
					msgs);
			if (newPostCondition != null)
				msgs = ((InternalEObject) newPostCondition).eInverseAdd(this,
					EOPPOSITE_FEATURE_BASE
						- UMLPackage.PROTOCOL_TRANSITION__POST_CONDITION, null,
					msgs);
			msgs = basicSetPostCondition(newPostCondition, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.PROTOCOL_TRANSITION__POST_CONDITION,
				newPostCondition, newPostCondition));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Constraint createPostCondition(EClass eClass) {
		Constraint newPostCondition = (Constraint) eClass.getEPackage()
			.getEFactoryInstance().create(eClass);
		setPostCondition(newPostCondition);
		return newPostCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Constraint createPostCondition() {
		Constraint newPostCondition = UMLFactory.eINSTANCE.createConstraint();
		setPostCondition(newPostCondition);
		return newPostCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List getReferreds() {
		// TODO: implement this method to return the 'Referred' reference list
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operation getReferred(String name) {
		for (Iterator i = getReferreds().iterator(); i.hasNext();) {
			Operation referred = (Operation) i.next();
			if (name.equals(referred.getName())) {
				return referred;
			}
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Constraint getPreCondition() {
		Constraint preCondition = (Constraint) eVirtualGet(UMLPackage.PROTOCOL_TRANSITION__PRE_CONDITION);
		return preCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPreCondition(Constraint newPreCondition) {
		Constraint preCondition = newPreCondition;
		Object oldPreCondition = eVirtualSet(
			UMLPackage.PROTOCOL_TRANSITION__PRE_CONDITION, preCondition);
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.PROTOCOL_TRANSITION__PRE_CONDITION,
				oldPreCondition == EVIRTUAL_NO_VALUE
					? null
					: oldPreCondition, preCondition));

		if (newPreCondition != null
			|| oldPreCondition == eVirtualGet(UMLPackage.PROTOCOL_TRANSITION__GUARD)) {
			setGuard(newPreCondition);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBelongsPsm(DiagnosticChain diagnostics, Map context) {
		return ProtocolTransitionOperations.validateBelongsPsm(this,
			diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssociatedActions(DiagnosticChain diagnostics,
			Map context) {
		return ProtocolTransitionOperations.validateAssociatedActions(this,
			diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRefersToOperation(DiagnosticChain diagnostics,
			Map context) {
		return ProtocolTransitionOperations.validateRefersToOperation(this,
			diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean belongsToPSM() {
		return ProtocolTransitionOperations.belongsToPSM(this);
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
				case UMLPackage.PROTOCOL_TRANSITION__EANNOTATIONS :
					return ((InternalEList) getEAnnotations()).basicRemove(
						otherEnd, msgs);
				case UMLPackage.PROTOCOL_TRANSITION__OWNED_COMMENT :
					return ((InternalEList) getOwnedComments()).basicRemove(
						otherEnd, msgs);
				case UMLPackage.PROTOCOL_TRANSITION__CLIENT_DEPENDENCY :
					return ((InternalEList) getClientDependencies())
						.basicRemove(otherEnd, msgs);
				case UMLPackage.PROTOCOL_TRANSITION__NAME_EXPRESSION :
					return basicSetNameExpression(null, msgs);
				case UMLPackage.PROTOCOL_TRANSITION__CONTAINER :
					return eBasicSetContainer(null,
						UMLPackage.PROTOCOL_TRANSITION__CONTAINER, msgs);
				case UMLPackage.PROTOCOL_TRANSITION__TARGET :
					return basicSetTarget(null, msgs);
				case UMLPackage.PROTOCOL_TRANSITION__GUARD :
					return basicSetGuard(null, msgs);
				case UMLPackage.PROTOCOL_TRANSITION__EFFECT :
					return basicSetEffect(null, msgs);
				case UMLPackage.PROTOCOL_TRANSITION__TRIGGER :
					return ((InternalEList) getTriggers()).basicRemove(
						otherEnd, msgs);
				case UMLPackage.PROTOCOL_TRANSITION__SOURCE :
					return basicSetSource(null, msgs);
				case UMLPackage.PROTOCOL_TRANSITION__POST_CONDITION :
					return basicSetPostCondition(null, msgs);
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
			case UMLPackage.PROTOCOL_TRANSITION__EANNOTATIONS :
				return getEAnnotations();
			case UMLPackage.PROTOCOL_TRANSITION__OWNED_ELEMENT :
				return getOwnedElements();
			case UMLPackage.PROTOCOL_TRANSITION__OWNER :
				if (resolve)
					return getOwner();
				return basicGetOwner();
			case UMLPackage.PROTOCOL_TRANSITION__OWNED_COMMENT :
				return getOwnedComments();
			case UMLPackage.PROTOCOL_TRANSITION__NAME :
				return getName();
			case UMLPackage.PROTOCOL_TRANSITION__VISIBILITY :
				return getVisibility();
			case UMLPackage.PROTOCOL_TRANSITION__QUALIFIED_NAME :
				return getQualifiedName();
			case UMLPackage.PROTOCOL_TRANSITION__CLIENT_DEPENDENCY :
				return getClientDependencies();
			case UMLPackage.PROTOCOL_TRANSITION__NAMESPACE :
				if (resolve)
					return getNamespace();
				return basicGetNamespace();
			case UMLPackage.PROTOCOL_TRANSITION__NAME_EXPRESSION :
				return getNameExpression();
			case UMLPackage.PROTOCOL_TRANSITION__IS_LEAF :
				return isLeaf()
					? Boolean.TRUE
					: Boolean.FALSE;
			case UMLPackage.PROTOCOL_TRANSITION__REDEFINED_ELEMENT :
				return getRedefinedElements();
			case UMLPackage.PROTOCOL_TRANSITION__REDEFINITION_CONTEXT :
				return getRedefinitionContexts();
			case UMLPackage.PROTOCOL_TRANSITION__KIND :
				return getKind();
			case UMLPackage.PROTOCOL_TRANSITION__CONTAINER :
				return getContainer();
			case UMLPackage.PROTOCOL_TRANSITION__TARGET :
				if (resolve)
					return getTarget();
				return basicGetTarget();
			case UMLPackage.PROTOCOL_TRANSITION__REDEFINED_TRANSITION :
				if (resolve)
					return getRedefinedTransition();
				return basicGetRedefinedTransition();
			case UMLPackage.PROTOCOL_TRANSITION__GUARD :
				return getGuard();
			case UMLPackage.PROTOCOL_TRANSITION__EFFECT :
				return getEffect();
			case UMLPackage.PROTOCOL_TRANSITION__TRIGGER :
				return getTriggers();
			case UMLPackage.PROTOCOL_TRANSITION__SOURCE :
				if (resolve)
					return getSource();
				return basicGetSource();
			case UMLPackage.PROTOCOL_TRANSITION__POST_CONDITION :
				return getPostCondition();
			case UMLPackage.PROTOCOL_TRANSITION__REFERRED :
				return getReferreds();
			case UMLPackage.PROTOCOL_TRANSITION__PRE_CONDITION :
				return getPreCondition();
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
			case UMLPackage.PROTOCOL_TRANSITION__EANNOTATIONS :
				getEAnnotations().clear();
				getEAnnotations().addAll((Collection) newValue);
				return;
			case UMLPackage.PROTOCOL_TRANSITION__OWNED_COMMENT :
				getOwnedComments().clear();
				getOwnedComments().addAll((Collection) newValue);
				return;
			case UMLPackage.PROTOCOL_TRANSITION__NAME :
				setName((String) newValue);
				return;
			case UMLPackage.PROTOCOL_TRANSITION__VISIBILITY :
				setVisibility((VisibilityKind) newValue);
				return;
			case UMLPackage.PROTOCOL_TRANSITION__CLIENT_DEPENDENCY :
				getClientDependencies().clear();
				getClientDependencies().addAll((Collection) newValue);
				return;
			case UMLPackage.PROTOCOL_TRANSITION__NAME_EXPRESSION :
				setNameExpression((StringExpression) newValue);
				return;
			case UMLPackage.PROTOCOL_TRANSITION__IS_LEAF :
				setIsLeaf(((Boolean) newValue).booleanValue());
				return;
			case UMLPackage.PROTOCOL_TRANSITION__KIND :
				setKind((TransitionKind) newValue);
				return;
			case UMLPackage.PROTOCOL_TRANSITION__CONTAINER :
				setContainer((Region) newValue);
				return;
			case UMLPackage.PROTOCOL_TRANSITION__TARGET :
				setTarget((Vertex) newValue);
				return;
			case UMLPackage.PROTOCOL_TRANSITION__REDEFINED_TRANSITION :
				setRedefinedTransition((Transition) newValue);
				return;
			case UMLPackage.PROTOCOL_TRANSITION__GUARD :
				setGuard((Constraint) newValue);
				return;
			case UMLPackage.PROTOCOL_TRANSITION__EFFECT :
				setEffect((Behavior) newValue);
				return;
			case UMLPackage.PROTOCOL_TRANSITION__TRIGGER :
				getTriggers().clear();
				getTriggers().addAll((Collection) newValue);
				return;
			case UMLPackage.PROTOCOL_TRANSITION__SOURCE :
				setSource((Vertex) newValue);
				return;
			case UMLPackage.PROTOCOL_TRANSITION__POST_CONDITION :
				setPostCondition((Constraint) newValue);
				return;
			case UMLPackage.PROTOCOL_TRANSITION__PRE_CONDITION :
				setPreCondition((Constraint) newValue);
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
			case UMLPackage.PROTOCOL_TRANSITION__EANNOTATIONS :
				getEAnnotations().clear();
				return;
			case UMLPackage.PROTOCOL_TRANSITION__OWNED_COMMENT :
				getOwnedComments().clear();
				return;
			case UMLPackage.PROTOCOL_TRANSITION__NAME :
				setName(NAME_EDEFAULT);
				return;
			case UMLPackage.PROTOCOL_TRANSITION__VISIBILITY :
				setVisibility(VISIBILITY_EDEFAULT);
				return;
			case UMLPackage.PROTOCOL_TRANSITION__CLIENT_DEPENDENCY :
				getClientDependencies().clear();
				return;
			case UMLPackage.PROTOCOL_TRANSITION__NAME_EXPRESSION :
				setNameExpression((StringExpression) null);
				return;
			case UMLPackage.PROTOCOL_TRANSITION__IS_LEAF :
				setIsLeaf(IS_LEAF_EDEFAULT);
				return;
			case UMLPackage.PROTOCOL_TRANSITION__KIND :
				setKind(KIND_EDEFAULT);
				return;
			case UMLPackage.PROTOCOL_TRANSITION__CONTAINER :
				setContainer((Region) null);
				return;
			case UMLPackage.PROTOCOL_TRANSITION__TARGET :
				setTarget((Vertex) null);
				return;
			case UMLPackage.PROTOCOL_TRANSITION__REDEFINED_TRANSITION :
				setRedefinedTransition((Transition) null);
				return;
			case UMLPackage.PROTOCOL_TRANSITION__GUARD :
				setGuard((Constraint) null);
				return;
			case UMLPackage.PROTOCOL_TRANSITION__EFFECT :
				setEffect((Behavior) null);
				return;
			case UMLPackage.PROTOCOL_TRANSITION__TRIGGER :
				getTriggers().clear();
				return;
			case UMLPackage.PROTOCOL_TRANSITION__SOURCE :
				setSource((Vertex) null);
				return;
			case UMLPackage.PROTOCOL_TRANSITION__POST_CONDITION :
				setPostCondition((Constraint) null);
				return;
			case UMLPackage.PROTOCOL_TRANSITION__PRE_CONDITION :
				setPreCondition((Constraint) null);
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
			case UMLPackage.PROTOCOL_TRANSITION__EANNOTATIONS :
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UMLPackage.PROTOCOL_TRANSITION__OWNED_ELEMENT :
				return isSetOwnedElements();
			case UMLPackage.PROTOCOL_TRANSITION__OWNER :
				return isSetOwner();
			case UMLPackage.PROTOCOL_TRANSITION__OWNED_COMMENT :
				List ownedComment = (List) eVirtualGet(UMLPackage.PROTOCOL_TRANSITION__OWNED_COMMENT);
				return ownedComment != null && !ownedComment.isEmpty();
			case UMLPackage.PROTOCOL_TRANSITION__NAME :
				String name = eVirtualIsSet(UMLPackage.PROTOCOL_TRANSITION__NAME)
					? (String) eVirtualGet(UMLPackage.PROTOCOL_TRANSITION__NAME)
					: NAME_EDEFAULT;
				return NAME_EDEFAULT == null
					? name != null
					: !NAME_EDEFAULT.equals(name);
			case UMLPackage.PROTOCOL_TRANSITION__VISIBILITY :
				return eVirtualIsSet(UMLPackage.PROTOCOL_TRANSITION__VISIBILITY)
					&& eVirtualGet(UMLPackage.PROTOCOL_TRANSITION__VISIBILITY) != VISIBILITY_EDEFAULT;
			case UMLPackage.PROTOCOL_TRANSITION__QUALIFIED_NAME :
				return QUALIFIED_NAME_EDEFAULT == null
					? getQualifiedName() != null
					: !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case UMLPackage.PROTOCOL_TRANSITION__CLIENT_DEPENDENCY :
				List clientDependency = (List) eVirtualGet(UMLPackage.PROTOCOL_TRANSITION__CLIENT_DEPENDENCY);
				return clientDependency != null && !clientDependency.isEmpty();
			case UMLPackage.PROTOCOL_TRANSITION__NAMESPACE :
				return isSetNamespace();
			case UMLPackage.PROTOCOL_TRANSITION__NAME_EXPRESSION :
				return eVirtualGet(UMLPackage.PROTOCOL_TRANSITION__NAME_EXPRESSION) != null;
			case UMLPackage.PROTOCOL_TRANSITION__IS_LEAF :
				return ((eFlags & IS_LEAF_EFLAG) != 0) != IS_LEAF_EDEFAULT;
			case UMLPackage.PROTOCOL_TRANSITION__REDEFINED_ELEMENT :
				return isSetRedefinedElements();
			case UMLPackage.PROTOCOL_TRANSITION__REDEFINITION_CONTEXT :
				return isSetRedefinitionContexts();
			case UMLPackage.PROTOCOL_TRANSITION__KIND :
				return eVirtualIsSet(UMLPackage.PROTOCOL_TRANSITION__KIND)
					&& eVirtualGet(UMLPackage.PROTOCOL_TRANSITION__KIND) != KIND_EDEFAULT;
			case UMLPackage.PROTOCOL_TRANSITION__CONTAINER :
				return getContainer() != null;
			case UMLPackage.PROTOCOL_TRANSITION__TARGET :
				return eVirtualGet(UMLPackage.PROTOCOL_TRANSITION__TARGET) != null;
			case UMLPackage.PROTOCOL_TRANSITION__REDEFINED_TRANSITION :
				return eVirtualGet(UMLPackage.PROTOCOL_TRANSITION__REDEFINED_TRANSITION) != null;
			case UMLPackage.PROTOCOL_TRANSITION__GUARD :
				return eVirtualGet(UMLPackage.PROTOCOL_TRANSITION__GUARD) != null;
			case UMLPackage.PROTOCOL_TRANSITION__EFFECT :
				return eVirtualGet(UMLPackage.PROTOCOL_TRANSITION__EFFECT) != null;
			case UMLPackage.PROTOCOL_TRANSITION__TRIGGER :
				List trigger = (List) eVirtualGet(UMLPackage.PROTOCOL_TRANSITION__TRIGGER);
				return trigger != null && !trigger.isEmpty();
			case UMLPackage.PROTOCOL_TRANSITION__SOURCE :
				return eVirtualGet(UMLPackage.PROTOCOL_TRANSITION__SOURCE) != null;
			case UMLPackage.PROTOCOL_TRANSITION__POST_CONDITION :
				return eVirtualGet(UMLPackage.PROTOCOL_TRANSITION__POST_CONDITION) != null;
			case UMLPackage.PROTOCOL_TRANSITION__REFERRED :
				return !getReferreds().isEmpty();
			case UMLPackage.PROTOCOL_TRANSITION__PRE_CONDITION :
				return eVirtualGet(UMLPackage.PROTOCOL_TRANSITION__PRE_CONDITION) != null;
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
				.getProtocolTransition_PostCondition());
	}

} //ProtocolTransitionImpl
