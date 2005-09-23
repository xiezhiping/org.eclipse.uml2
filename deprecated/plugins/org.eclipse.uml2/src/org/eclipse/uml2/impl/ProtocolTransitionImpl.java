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
 * $Id: ProtocolTransitionImpl.java,v 1.14 2005/09/23 21:22:56 khussey Exp $
 */
package org.eclipse.uml2.impl;

import java.util.Collection;
import java.util.Iterator;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.uml2.Activity;
import org.eclipse.uml2.Constraint;
import org.eclipse.uml2.Operation;
import org.eclipse.uml2.ProtocolTransition;
import org.eclipse.uml2.Region;
import org.eclipse.uml2.StringExpression;
import org.eclipse.uml2.TemplateSignature;
import org.eclipse.uml2.Transition;
import org.eclipse.uml2.TransitionKind;
import org.eclipse.uml2.UML2Factory;
import org.eclipse.uml2.UML2Package;
import org.eclipse.uml2.Vertex;
import org.eclipse.uml2.VisibilityKind;

import org.eclipse.uml2.common.util.CacheAdapter;

import org.eclipse.uml2.internal.operation.ProtocolTransitionOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Protocol Transition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2.impl.ProtocolTransitionImpl#getGuard <em>Guard</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.ProtocolTransitionImpl#getPostCondition <em>Post Condition</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.ProtocolTransitionImpl#getReferreds <em>Referred</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.ProtocolTransitionImpl#getPreCondition <em>Pre Condition</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProtocolTransitionImpl extends TransitionImpl implements ProtocolTransition {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) IBM Corporation and others."; //$NON-NLS-1$

	/**
	 * The cached value of the '{@link #getPostCondition() <em>Post Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPostCondition()
	 * @generated
	 * @ordered
	 */
	protected Constraint postCondition = null;

	/**
	 * The cached value of the '{@link #getPreCondition() <em>Pre Condition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreCondition()
	 * @generated
	 * @ordered
	 */
	protected Constraint preCondition = null;

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
		return UML2Package.eINSTANCE.getProtocolTransition();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Constraint getGuard() {
		return guard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Constraint getPostCondition() {
		return postCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPostCondition(Constraint newPostCondition, NotificationChain msgs) {
		Constraint oldPostCondition = postCondition;
		postCondition = newPostCondition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UML2Package.PROTOCOL_TRANSITION__POST_CONDITION, oldPostCondition, newPostCondition);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}

		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPostCondition(Constraint newPostCondition) {
		if (newPostCondition != postCondition) {
			NotificationChain msgs = null;
			if (postCondition != null)
				msgs = ((InternalEObject)postCondition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UML2Package.PROTOCOL_TRANSITION__POST_CONDITION, null, msgs);
			if (newPostCondition != null)
				msgs = ((InternalEObject)newPostCondition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UML2Package.PROTOCOL_TRANSITION__POST_CONDITION, null, msgs);
			msgs = basicSetPostCondition(newPostCondition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2Package.PROTOCOL_TRANSITION__POST_CONDITION, newPostCondition, newPostCondition));

	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Constraint createPostCondition(EClass eClass) {
		Constraint newPostCondition = (Constraint) eClass.getEPackage().getEFactoryInstance().create(eClass);
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, 0, UML2Package.PROTOCOL_TRANSITION__POST_CONDITION, null, newPostCondition));
		}
		setPostCondition(newPostCondition);
		return newPostCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Constraint createPostCondition() {
		Constraint newPostCondition = UML2Factory.eINSTANCE.createConstraint();
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, 0, UML2Package.PROTOCOL_TRANSITION__POST_CONDITION, null, newPostCondition));
		}
		setPostCondition(newPostCondition);
		return newPostCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList getReferreds() {
		CacheAdapter cache = getCacheAdapter();

		if (cache != null) {
			EList result = (EList) cache.get(this, UML2Package.eINSTANCE
				.getProtocolTransition_Referred());

			if (result == null) {
				EList referreds = ProtocolTransitionOperations
					.getReferreds(this);
				cache.put(this, UML2Package.eINSTANCE
					.getProtocolTransition_Referred(),
					result = new EcoreEList.UnmodifiableEList(this,
						UML2Package.eINSTANCE.getProtocolTransition_Referred(),
						referreds.size(), referreds.toArray()));
			}

			return result;
		}

		EList referreds = ProtocolTransitionOperations.getReferreds(this);
		return new EcoreEList.UnmodifiableEList(this, UML2Package.eINSTANCE
			.getProtocolTransition_Referred(), referreds.size(), referreds
			.toArray());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
    public Operation getReferred(String name) {
		for (Iterator i = getReferreds().iterator(); i.hasNext(); ) {
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
		return preCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPreCondition(Constraint newPreCondition) {
		Constraint oldPreCondition = preCondition;
		preCondition = newPreCondition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2Package.PROTOCOL_TRANSITION__PRE_CONDITION, oldPreCondition, preCondition));

		if (newPreCondition != null || oldPreCondition == guard) {
			setGuard(newPreCondition);
		}
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGuard(Constraint newGuard, NotificationChain msgs) {
		Constraint oldGuard = guard;
		guard = newGuard;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UML2Package.PROTOCOL_TRANSITION__GUARD, oldGuard, newGuard);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}

		if (preCondition != null && preCondition != newGuard) {
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
		if (newGuard != guard) {
			NotificationChain msgs = null;
			if (guard != null)
				msgs = ((InternalEObject)guard).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UML2Package.PROTOCOL_TRANSITION__GUARD, null, msgs);
			if (newGuard != null)
				msgs = ((InternalEObject)newGuard).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UML2Package.PROTOCOL_TRANSITION__GUARD, null, msgs);
			msgs = basicSetGuard(newGuard, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2Package.PROTOCOL_TRANSITION__GUARD, newGuard, newGuard));

	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, Class baseClass, NotificationChain msgs) {
		if (featureID >= 0) {
			switch (eDerivedStructuralFeatureID(featureID, baseClass)) {
				case UML2Package.PROTOCOL_TRANSITION__EANNOTATIONS:
					return ((InternalEList)getEAnnotations()).basicAdd(otherEnd, msgs);
				case UML2Package.PROTOCOL_TRANSITION__TEMPLATE_BINDING:
					return ((InternalEList)getTemplateBindings()).basicAdd(otherEnd, msgs);
				case UML2Package.PROTOCOL_TRANSITION__OWNED_TEMPLATE_SIGNATURE:
					if (ownedTemplateSignature != null)
						msgs = ((InternalEObject)ownedTemplateSignature).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UML2Package.PROTOCOL_TRANSITION__OWNED_TEMPLATE_SIGNATURE, null, msgs);
					return basicSetOwnedTemplateSignature((TemplateSignature)otherEnd, msgs);
				case UML2Package.PROTOCOL_TRANSITION__CLIENT_DEPENDENCY:
					return ((InternalEList)getClientDependencies()).basicAdd(otherEnd, msgs);
				case UML2Package.PROTOCOL_TRANSITION__CONTAINER:
					if (eContainer != null)
						msgs = eBasicRemoveFromContainer(msgs);
					return eBasicSetContainer(otherEnd, UML2Package.PROTOCOL_TRANSITION__CONTAINER, msgs);
				case UML2Package.PROTOCOL_TRANSITION__SOURCE:
					if (source != null)
						msgs = ((InternalEObject)source).eInverseRemove(this, UML2Package.VERTEX__OUTGOING, Vertex.class, msgs);
					return basicSetSource((Vertex)otherEnd, msgs);
				case UML2Package.PROTOCOL_TRANSITION__TARGET:
					if (target != null)
						msgs = ((InternalEObject)target).eInverseRemove(this, UML2Package.VERTEX__INCOMING, Vertex.class, msgs);
					return basicSetTarget((Vertex)otherEnd, msgs);
				default:
					return eDynamicInverseAdd(otherEnd, featureID, baseClass, msgs);
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
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, Class baseClass, NotificationChain msgs) {
		if (featureID >= 0) {
			switch (eDerivedStructuralFeatureID(featureID, baseClass)) {
				case UML2Package.PROTOCOL_TRANSITION__EANNOTATIONS:
					return ((InternalEList)getEAnnotations()).basicRemove(otherEnd, msgs);
				case UML2Package.PROTOCOL_TRANSITION__OWNED_COMMENT:
					return ((InternalEList)getOwnedComments()).basicRemove(otherEnd, msgs);
				case UML2Package.PROTOCOL_TRANSITION__TEMPLATE_BINDING:
					return ((InternalEList)getTemplateBindings()).basicRemove(otherEnd, msgs);
				case UML2Package.PROTOCOL_TRANSITION__OWNED_TEMPLATE_SIGNATURE:
					return basicSetOwnedTemplateSignature(null, msgs);
				case UML2Package.PROTOCOL_TRANSITION__CLIENT_DEPENDENCY:
					return ((InternalEList)getClientDependencies()).basicRemove(otherEnd, msgs);
				case UML2Package.PROTOCOL_TRANSITION__NAME_EXPRESSION:
					return basicSetNameExpression(null, msgs);
				case UML2Package.PROTOCOL_TRANSITION__CONTAINER:
					return eBasicSetContainer(null, UML2Package.PROTOCOL_TRANSITION__CONTAINER, msgs);
				case UML2Package.PROTOCOL_TRANSITION__SOURCE:
					return basicSetSource(null, msgs);
				case UML2Package.PROTOCOL_TRANSITION__TARGET:
					return basicSetTarget(null, msgs);
				case UML2Package.PROTOCOL_TRANSITION__GUARD:
					return basicSetGuard(null, msgs);
				case UML2Package.PROTOCOL_TRANSITION__EFFECT:
					return basicSetEffect(null, msgs);
				case UML2Package.PROTOCOL_TRANSITION__POST_CONDITION:
					return basicSetPostCondition(null, msgs);
				default:
					return eDynamicInverseRemove(otherEnd, featureID, baseClass, msgs);
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
				case UML2Package.PROTOCOL_TRANSITION__CONTAINER:
					return eContainer.eInverseRemove(this, UML2Package.REGION__TRANSITION, Region.class, msgs);
				default:
					return eDynamicBasicRemoveFromContainer(msgs);
			}
		}
		return eContainer.eInverseRemove(this, EOPPOSITE_FEATURE_BASE - eContainerFeatureID, null, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(EStructuralFeature eFeature, boolean resolve) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case UML2Package.PROTOCOL_TRANSITION__EANNOTATIONS:
				return getEAnnotations();
			case UML2Package.PROTOCOL_TRANSITION__OWNED_ELEMENT:
				return getOwnedElements();
			case UML2Package.PROTOCOL_TRANSITION__OWNER:
				if (resolve) return getOwner();
				return basicGetOwner();
			case UML2Package.PROTOCOL_TRANSITION__OWNED_COMMENT:
				return getOwnedComments();
			case UML2Package.PROTOCOL_TRANSITION__TEMPLATE_BINDING:
				return getTemplateBindings();
			case UML2Package.PROTOCOL_TRANSITION__OWNED_TEMPLATE_SIGNATURE:
				return getOwnedTemplateSignature();
			case UML2Package.PROTOCOL_TRANSITION__NAME:
				return getName();
			case UML2Package.PROTOCOL_TRANSITION__QUALIFIED_NAME:
				return getQualifiedName();
			case UML2Package.PROTOCOL_TRANSITION__VISIBILITY:
				return getVisibility();
			case UML2Package.PROTOCOL_TRANSITION__CLIENT_DEPENDENCY:
				return getClientDependencies();
			case UML2Package.PROTOCOL_TRANSITION__NAME_EXPRESSION:
				return getNameExpression();
			case UML2Package.PROTOCOL_TRANSITION__REDEFINITION_CONTEXT:
				return getRedefinitionContexts();
			case UML2Package.PROTOCOL_TRANSITION__IS_LEAF:
				return isLeaf() ? Boolean.TRUE : Boolean.FALSE;
			case UML2Package.PROTOCOL_TRANSITION__KIND:
				return getKind();
			case UML2Package.PROTOCOL_TRANSITION__CONTAINER:
				return getContainer();
			case UML2Package.PROTOCOL_TRANSITION__SOURCE:
				if (resolve) return getSource();
				return basicGetSource();
			case UML2Package.PROTOCOL_TRANSITION__TARGET:
				if (resolve) return getTarget();
				return basicGetTarget();
			case UML2Package.PROTOCOL_TRANSITION__REDEFINED_TRANSITION:
				if (resolve) return getRedefinedTransition();
				return basicGetRedefinedTransition();
			case UML2Package.PROTOCOL_TRANSITION__TRIGGER:
				return getTriggers();
			case UML2Package.PROTOCOL_TRANSITION__GUARD:
				return getGuard();
			case UML2Package.PROTOCOL_TRANSITION__EFFECT:
				return getEffect();
			case UML2Package.PROTOCOL_TRANSITION__POST_CONDITION:
				return getPostCondition();
			case UML2Package.PROTOCOL_TRANSITION__REFERRED:
				return getReferreds();
			case UML2Package.PROTOCOL_TRANSITION__PRE_CONDITION:
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
			case UML2Package.PROTOCOL_TRANSITION__EANNOTATIONS:
				getEAnnotations().clear();
				getEAnnotations().addAll((Collection)newValue);
				return;
			case UML2Package.PROTOCOL_TRANSITION__OWNED_COMMENT:
				getOwnedComments().clear();
				getOwnedComments().addAll((Collection)newValue);
				return;
			case UML2Package.PROTOCOL_TRANSITION__TEMPLATE_BINDING:
				getTemplateBindings().clear();
				getTemplateBindings().addAll((Collection)newValue);
				return;
			case UML2Package.PROTOCOL_TRANSITION__OWNED_TEMPLATE_SIGNATURE:
				setOwnedTemplateSignature((TemplateSignature)newValue);
				return;
			case UML2Package.PROTOCOL_TRANSITION__NAME:
				setName((String)newValue);
				return;
			case UML2Package.PROTOCOL_TRANSITION__VISIBILITY:
				setVisibility((VisibilityKind)newValue);
				return;
			case UML2Package.PROTOCOL_TRANSITION__CLIENT_DEPENDENCY:
				getClientDependencies().clear();
				getClientDependencies().addAll((Collection)newValue);
				return;
			case UML2Package.PROTOCOL_TRANSITION__NAME_EXPRESSION:
				setNameExpression((StringExpression)newValue);
				return;
			case UML2Package.PROTOCOL_TRANSITION__IS_LEAF:
				setIsLeaf(((Boolean)newValue).booleanValue());
				return;
			case UML2Package.PROTOCOL_TRANSITION__KIND:
				setKind((TransitionKind)newValue);
				return;
			case UML2Package.PROTOCOL_TRANSITION__CONTAINER:
				setContainer((Region)newValue);
				return;
			case UML2Package.PROTOCOL_TRANSITION__SOURCE:
				setSource((Vertex)newValue);
				return;
			case UML2Package.PROTOCOL_TRANSITION__TARGET:
				setTarget((Vertex)newValue);
				return;
			case UML2Package.PROTOCOL_TRANSITION__REDEFINED_TRANSITION:
				setRedefinedTransition((Transition)newValue);
				return;
			case UML2Package.PROTOCOL_TRANSITION__TRIGGER:
				getTriggers().clear();
				getTriggers().addAll((Collection)newValue);
				return;
			case UML2Package.PROTOCOL_TRANSITION__GUARD:
				setGuard((Constraint)newValue);
				return;
			case UML2Package.PROTOCOL_TRANSITION__EFFECT:
				setEffect((Activity)newValue);
				return;
			case UML2Package.PROTOCOL_TRANSITION__POST_CONDITION:
				setPostCondition((Constraint)newValue);
				return;
			case UML2Package.PROTOCOL_TRANSITION__PRE_CONDITION:
				setPreCondition((Constraint)newValue);
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
			case UML2Package.PROTOCOL_TRANSITION__EANNOTATIONS:
				getEAnnotations().clear();
				return;
			case UML2Package.PROTOCOL_TRANSITION__OWNED_COMMENT:
				getOwnedComments().clear();
				return;
			case UML2Package.PROTOCOL_TRANSITION__TEMPLATE_BINDING:
				getTemplateBindings().clear();
				return;
			case UML2Package.PROTOCOL_TRANSITION__OWNED_TEMPLATE_SIGNATURE:
				setOwnedTemplateSignature((TemplateSignature)null);
				return;
			case UML2Package.PROTOCOL_TRANSITION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case UML2Package.PROTOCOL_TRANSITION__VISIBILITY:
				setVisibility(VISIBILITY_EDEFAULT);
				return;
			case UML2Package.PROTOCOL_TRANSITION__CLIENT_DEPENDENCY:
				getClientDependencies().clear();
				return;
			case UML2Package.PROTOCOL_TRANSITION__NAME_EXPRESSION:
				setNameExpression((StringExpression)null);
				return;
			case UML2Package.PROTOCOL_TRANSITION__IS_LEAF:
				setIsLeaf(IS_LEAF_EDEFAULT);
				return;
			case UML2Package.PROTOCOL_TRANSITION__KIND:
				setKind(KIND_EDEFAULT);
				return;
			case UML2Package.PROTOCOL_TRANSITION__CONTAINER:
				setContainer((Region)null);
				return;
			case UML2Package.PROTOCOL_TRANSITION__SOURCE:
				setSource((Vertex)null);
				return;
			case UML2Package.PROTOCOL_TRANSITION__TARGET:
				setTarget((Vertex)null);
				return;
			case UML2Package.PROTOCOL_TRANSITION__REDEFINED_TRANSITION:
				setRedefinedTransition((Transition)null);
				return;
			case UML2Package.PROTOCOL_TRANSITION__TRIGGER:
				getTriggers().clear();
				return;
			case UML2Package.PROTOCOL_TRANSITION__GUARD:
				setGuard((Constraint)null);
				return;
			case UML2Package.PROTOCOL_TRANSITION__EFFECT:
				setEffect((Activity)null);
				return;
			case UML2Package.PROTOCOL_TRANSITION__POST_CONDITION:
				setPostCondition((Constraint)null);
				return;
			case UML2Package.PROTOCOL_TRANSITION__PRE_CONDITION:
				setPreCondition((Constraint)null);
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
			case UML2Package.PROTOCOL_TRANSITION__EANNOTATIONS:
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UML2Package.PROTOCOL_TRANSITION__OWNED_ELEMENT:
				return eIsSet(UML2Package.eINSTANCE.getElement_OwnedComment())
					|| eIsSet(UML2Package.eINSTANCE.getTemplateableElement_TemplateBinding())
					|| eIsSet(UML2Package.eINSTANCE.getTemplateableElement_OwnedTemplateSignature())
					|| eIsSet(UML2Package.eINSTANCE.getNamedElement_NameExpression())
					|| eIsSet(UML2Package.eINSTANCE.getTransition_Guard())
					|| eIsSet(UML2Package.eINSTANCE.getTransition_Effect())
					|| eIsSet(UML2Package.eINSTANCE.getProtocolTransition_PostCondition())
					|| eIsSet(UML2Package.eINSTANCE.getProtocolTransition_PreCondition());
			case UML2Package.PROTOCOL_TRANSITION__OWNER:
				return eIsSet(UML2Package.eINSTANCE.getTransition_Container());
			case UML2Package.PROTOCOL_TRANSITION__OWNED_COMMENT:
				return ownedComment != null && !ownedComment.isEmpty();
			case UML2Package.PROTOCOL_TRANSITION__TEMPLATE_BINDING:
				return templateBinding != null && !templateBinding.isEmpty();
			case UML2Package.PROTOCOL_TRANSITION__OWNED_TEMPLATE_SIGNATURE:
				return ownedTemplateSignature != null;
			case UML2Package.PROTOCOL_TRANSITION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case UML2Package.PROTOCOL_TRANSITION__QUALIFIED_NAME:
				return QUALIFIED_NAME_EDEFAULT == null ? getQualifiedName() != null : !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case UML2Package.PROTOCOL_TRANSITION__VISIBILITY:
				return visibility != VISIBILITY_EDEFAULT;
			case UML2Package.PROTOCOL_TRANSITION__CLIENT_DEPENDENCY:
				return clientDependency != null && !clientDependency.isEmpty();
			case UML2Package.PROTOCOL_TRANSITION__NAME_EXPRESSION:
				return nameExpression != null;
			case UML2Package.PROTOCOL_TRANSITION__REDEFINITION_CONTEXT:
				return !getRedefinitionContexts().isEmpty();
			case UML2Package.PROTOCOL_TRANSITION__IS_LEAF:
				return ((eFlags & IS_LEAF_EFLAG) != 0) != IS_LEAF_EDEFAULT;
			case UML2Package.PROTOCOL_TRANSITION__KIND:
				return kind != KIND_EDEFAULT;
			case UML2Package.PROTOCOL_TRANSITION__CONTAINER:
				return getContainer() != null;
			case UML2Package.PROTOCOL_TRANSITION__SOURCE:
				return source != null;
			case UML2Package.PROTOCOL_TRANSITION__TARGET:
				return target != null;
			case UML2Package.PROTOCOL_TRANSITION__REDEFINED_TRANSITION:
				return redefinedTransition != null;
			case UML2Package.PROTOCOL_TRANSITION__TRIGGER:
				return trigger != null && !trigger.isEmpty();
			case UML2Package.PROTOCOL_TRANSITION__GUARD:
				return guard != null;
			case UML2Package.PROTOCOL_TRANSITION__EFFECT:
				return effect != null;
			case UML2Package.PROTOCOL_TRANSITION__POST_CONDITION:
				return postCondition != null;
			case UML2Package.PROTOCOL_TRANSITION__REFERRED:
				return !getReferreds().isEmpty();
			case UML2Package.PROTOCOL_TRANSITION__PRE_CONDITION:
				return preCondition != null;
		}
		return eDynamicIsSet(eFeature);
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EList getOwnedElementsHelper(EList ownedElement) {
		super.getOwnedElementsHelper(ownedElement);
		if (eIsSet(UML2Package.eINSTANCE.getProtocolTransition_PostCondition())) {
			ownedElement.add(getPostCondition());
		}
		return ownedElement;
	}


} //ProtocolTransitionImpl
