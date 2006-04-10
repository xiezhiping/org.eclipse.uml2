/*
 * Copyright (c) 2003, 2006 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *
 * $Id: ProtocolTransitionImpl.java,v 1.25 2006/04/10 20:40:20 khussey Exp $
 */
package org.eclipse.uml2.impl;

import java.util.Collection;
import java.util.Iterator;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.util.EcoreEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.uml2.Activity;
import org.eclipse.uml2.Constraint;
import org.eclipse.uml2.Element;
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

import org.eclipse.uml2.common.util.DerivedUnionEObjectEList;

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
		return UML2Package.Literals.PROTOCOL_TRANSITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getOwnedElements() {
		CacheAdapter cache = getCacheAdapter();
		if (cache != null) {
			Resource eResource = eResource();
			EList ownedElements = (EList) cache.get(eResource, this, UML2Package.Literals.ELEMENT__OWNED_ELEMENT);
			if (ownedElements == null) {
				cache.put(eResource, this, UML2Package.Literals.ELEMENT__OWNED_ELEMENT, ownedElements = new DerivedUnionEObjectEList(Element.class, this, UML2Package.PROTOCOL_TRANSITION__OWNED_ELEMENT, OWNED_ELEMENT_ESUBSETS));
			}
			return ownedElements;
		}
		return new DerivedUnionEObjectEList(Element.class, this, UML2Package.PROTOCOL_TRANSITION__OWNED_ELEMENT, OWNED_ELEMENT_ESUBSETS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOwnedElements() {
		return super.isSetOwnedElements()
			|| eIsSet(UML2Package.PROTOCOL_TRANSITION__POST_CONDITION);
	}


	/**
	 * The array of subset feature identifiers for the '{@link #getOwnedElements() <em>Owned Element</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedElements()
	 * @generated
	 * @ordered
	 */
	protected static final int[] OWNED_ELEMENT_ESUBSETS = new int[] {UML2Package.PROTOCOL_TRANSITION__OWNED_COMMENT, UML2Package.PROTOCOL_TRANSITION__TEMPLATE_BINDING, UML2Package.PROTOCOL_TRANSITION__OWNED_TEMPLATE_SIGNATURE, UML2Package.PROTOCOL_TRANSITION__NAME_EXPRESSION, UML2Package.PROTOCOL_TRANSITION__GUARD, UML2Package.PROTOCOL_TRANSITION__EFFECT, UML2Package.PROTOCOL_TRANSITION__POST_CONDITION};

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
	 * @generated NOT
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
	 * @generated NOT
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
			EList result = (EList) cache.get(this,
				UML2Package.Literals.PROTOCOL_TRANSITION__REFERRED);

			if (result == null) {
				EList referreds = ProtocolTransitionOperations
					.getReferreds(this);
				cache.put(this,
					UML2Package.Literals.PROTOCOL_TRANSITION__REFERRED,
					result = new EcoreEList.UnmodifiableEList(this,
						UML2Package.Literals.PROTOCOL_TRANSITION__REFERRED,
						referreds.size(), referreds.toArray()));
			}

			return result;
		}

		EList referreds = ProtocolTransitionOperations.getReferreds(this);
		return new EcoreEList.UnmodifiableEList(this,
			UML2Package.Literals.PROTOCOL_TRANSITION__REFERRED, referreds
				.size(), referreds.toArray());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
    public Operation getReferred(String name) {
		return getReferred(name, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operation getReferred(String name, boolean ignoreCase) {
		referredLoop: for (Iterator i = getReferreds().iterator(); i.hasNext(); ) {
			Operation referred = (Operation) i.next();
			if (name != null && !(ignoreCase ? name.equalsIgnoreCase(referred.getName()) : name.equals(referred.getName())))
				continue referredLoop;
			return referred;
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


		Resource.Internal eInternalResource = eInternalResource();
		if (eInternalResource == null || !eInternalResource.isLoading()) {
			if (newPreCondition != null) {
				if (newPreCondition != guard) {
					setGuard(newPreCondition);
				}
			}
		}
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
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
				return basicSetContainer(null, msgs);
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
		}
		return eDynamicInverseRemove(otherEnd, featureID, msgs);
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

		Resource.Internal eInternalResource = eInternalResource();
		if (eInternalResource == null || !eInternalResource.isLoading()) {
			if (preCondition != null && preCondition != newGuard) {
				setPreCondition(null);
			}
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
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
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
		return eDynamicGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
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
		eDynamicSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eUnset(int featureID) {
		switch (featureID) {
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
		eDynamicUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case UML2Package.PROTOCOL_TRANSITION__EANNOTATIONS:
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UML2Package.PROTOCOL_TRANSITION__OWNED_ELEMENT:
				return isSetOwnedElements();
			case UML2Package.PROTOCOL_TRANSITION__OWNER:
				return isSetOwner();
			case UML2Package.PROTOCOL_TRANSITION__OWNED_COMMENT:
				return ownedComments != null && !ownedComments.isEmpty();
			case UML2Package.PROTOCOL_TRANSITION__TEMPLATE_BINDING:
				return templateBindings != null && !templateBindings.isEmpty();
			case UML2Package.PROTOCOL_TRANSITION__OWNED_TEMPLATE_SIGNATURE:
				return ownedTemplateSignature != null;
			case UML2Package.PROTOCOL_TRANSITION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case UML2Package.PROTOCOL_TRANSITION__QUALIFIED_NAME:
				return QUALIFIED_NAME_EDEFAULT == null ? getQualifiedName() != null : !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case UML2Package.PROTOCOL_TRANSITION__VISIBILITY:
				return visibility != VISIBILITY_EDEFAULT;
			case UML2Package.PROTOCOL_TRANSITION__CLIENT_DEPENDENCY:
				return clientDependencies != null && !clientDependencies.isEmpty();
			case UML2Package.PROTOCOL_TRANSITION__NAME_EXPRESSION:
				return nameExpression != null;
			case UML2Package.PROTOCOL_TRANSITION__REDEFINITION_CONTEXT:
				return isSetRedefinitionContexts();
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
				return isSetRedefinedTransition();
			case UML2Package.PROTOCOL_TRANSITION__TRIGGER:
				return triggers != null && !triggers.isEmpty();
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
		return eDynamicIsSet(featureID);
	}


} //ProtocolTransitionImpl
