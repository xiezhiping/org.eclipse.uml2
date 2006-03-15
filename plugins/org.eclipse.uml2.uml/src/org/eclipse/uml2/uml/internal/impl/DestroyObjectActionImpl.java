/*
 * Copyright (c) 2005, 2006 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *
 * $Id: DestroyObjectActionImpl.java,v 1.18 2006/03/15 19:34:13 khussey Exp $
 */
package org.eclipse.uml2.uml.internal.impl;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.uml2.common.util.DerivedUnionEObjectEList;

import org.eclipse.uml2.uml.Activity;
import org.eclipse.uml2.uml.DestroyObjectAction;
import org.eclipse.uml2.uml.InputPin;
import org.eclipse.uml2.uml.StringExpression;
import org.eclipse.uml2.uml.StructuredActivityNode;
import org.eclipse.uml2.uml.Type;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.VisibilityKind;

import org.eclipse.uml2.uml.internal.operations.DestroyObjectActionOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Destroy Object Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.DestroyObjectActionImpl#getInputs <em>Input</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.DestroyObjectActionImpl#isDestroyLinks <em>Is Destroy Links</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.DestroyObjectActionImpl#isDestroyOwnedObjects <em>Is Destroy Owned Objects</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.DestroyObjectActionImpl#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DestroyObjectActionImpl
		extends ActionImpl
		implements DestroyObjectAction {

	/**
	 * The default value of the '{@link #isDestroyLinks() <em>Is Destroy Links</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDestroyLinks()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_DESTROY_LINKS_EDEFAULT = false;

	/**
	 * The flag representing the value of the '{@link #isDestroyLinks() <em>Is Destroy Links</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDestroyLinks()
	 * @generated
	 * @ordered
	 */
	protected static final int IS_DESTROY_LINKS_EFLAG = 1 << 9;

	/**
	 * The default value of the '{@link #isDestroyOwnedObjects() <em>Is Destroy Owned Objects</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDestroyOwnedObjects()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_DESTROY_OWNED_OBJECTS_EDEFAULT = false;

	/**
	 * The flag representing the value of the '{@link #isDestroyOwnedObjects() <em>Is Destroy Owned Objects</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDestroyOwnedObjects()
	 * @generated
	 * @ordered
	 */
	protected static final int IS_DESTROY_OWNED_OBJECTS_EFLAG = 1 << 10;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DestroyObjectActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return UMLPackage.Literals.DESTROY_OBJECT_ACTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getInputs() {
		EList input = (EList) eVirtualGet(UMLPackage.DESTROY_OBJECT_ACTION__INPUT);
		if (input == null) {
			eVirtualSet(UMLPackage.DESTROY_OBJECT_ACTION__INPUT,
				input = new DerivedUnionEObjectEList(InputPin.class, this,
					UMLPackage.DESTROY_OBJECT_ACTION__INPUT,
					new int[]{UMLPackage.DESTROY_OBJECT_ACTION__TARGET}));
		}
		return input;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isDestroyLinks() {
		return (eFlags & IS_DESTROY_LINKS_EFLAG) != 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsDestroyLinks(boolean newIsDestroyLinks) {
		boolean oldIsDestroyLinks = (eFlags & IS_DESTROY_LINKS_EFLAG) != 0;
		if (newIsDestroyLinks)
			eFlags |= IS_DESTROY_LINKS_EFLAG;
		else
			eFlags &= ~IS_DESTROY_LINKS_EFLAG;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.DESTROY_OBJECT_ACTION__IS_DESTROY_LINKS,
				oldIsDestroyLinks, newIsDestroyLinks));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isDestroyOwnedObjects() {
		return (eFlags & IS_DESTROY_OWNED_OBJECTS_EFLAG) != 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsDestroyOwnedObjects(boolean newIsDestroyOwnedObjects) {
		boolean oldIsDestroyOwnedObjects = (eFlags & IS_DESTROY_OWNED_OBJECTS_EFLAG) != 0;
		if (newIsDestroyOwnedObjects)
			eFlags |= IS_DESTROY_OWNED_OBJECTS_EFLAG;
		else
			eFlags &= ~IS_DESTROY_OWNED_OBJECTS_EFLAG;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.DESTROY_OBJECT_ACTION__IS_DESTROY_OWNED_OBJECTS,
				oldIsDestroyOwnedObjects, newIsDestroyOwnedObjects));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputPin getTarget() {
		InputPin target = (InputPin) eVirtualGet(UMLPackage.DESTROY_OBJECT_ACTION__TARGET);
		if (target != null && target.eIsProxy()) {
			InternalEObject oldTarget = (InternalEObject) target;
			target = (InputPin) eResolveProxy(oldTarget);
			if (target != oldTarget) {
				InternalEObject newTarget = (InternalEObject) target;
				NotificationChain msgs = oldTarget.eInverseRemove(this,
					EOPPOSITE_FEATURE_BASE
						- UMLPackage.DESTROY_OBJECT_ACTION__TARGET, null, null);
				if (newTarget.eInternalContainer() == null) {
					msgs = newTarget.eInverseAdd(this, EOPPOSITE_FEATURE_BASE
						- UMLPackage.DESTROY_OBJECT_ACTION__TARGET, null, msgs);
				}
				if (msgs != null)
					msgs.dispatch();
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
						UMLPackage.DESTROY_OBJECT_ACTION__TARGET, oldTarget,
						target));
			}
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputPin basicGetTarget() {
		return (InputPin) eVirtualGet(UMLPackage.DESTROY_OBJECT_ACTION__TARGET);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTarget(InputPin newTarget,
			NotificationChain msgs) {
		Object oldTarget = eVirtualSet(
			UMLPackage.DESTROY_OBJECT_ACTION__TARGET, newTarget);
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
				Notification.SET, UMLPackage.DESTROY_OBJECT_ACTION__TARGET,
				oldTarget == EVIRTUAL_NO_VALUE
					? null
					: oldTarget, newTarget);
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
	public void setTarget(InputPin newTarget) {
		InputPin target = (InputPin) eVirtualGet(UMLPackage.DESTROY_OBJECT_ACTION__TARGET);
		if (newTarget != target) {
			NotificationChain msgs = null;
			if (target != null)
				msgs = ((InternalEObject) target).eInverseRemove(this,
					EOPPOSITE_FEATURE_BASE
						- UMLPackage.DESTROY_OBJECT_ACTION__TARGET, null, msgs);
			if (newTarget != null)
				msgs = ((InternalEObject) newTarget).eInverseAdd(this,
					EOPPOSITE_FEATURE_BASE
						- UMLPackage.DESTROY_OBJECT_ACTION__TARGET, null, msgs);
			msgs = basicSetTarget(newTarget, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.DESTROY_OBJECT_ACTION__TARGET, newTarget, newTarget));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputPin createTarget(String name, Type type, EClass eClass) {
		InputPin newTarget = (InputPin) create(eClass);
		if (name != null)
			newTarget.setName(name);
		if (type != null)
			newTarget.setType(type);
		setTarget(newTarget);
		return newTarget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputPin createTarget(String name, Type type) {
		return createTarget(name, type, UMLPackage.Literals.INPUT_PIN);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMultiplicity(DiagnosticChain diagnostics, Map context) {
		return DestroyObjectActionOperations.validateMultiplicity(this,
			diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNoType(DiagnosticChain diagnostics, Map context) {
		return DestroyObjectActionOperations.validateNoType(this, diagnostics,
			context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UMLPackage.DESTROY_OBJECT_ACTION__EANNOTATIONS :
				return ((InternalEList) getEAnnotations()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.DESTROY_OBJECT_ACTION__OWNED_COMMENT :
				return ((InternalEList) getOwnedComments()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.DESTROY_OBJECT_ACTION__CLIENT_DEPENDENCY :
				return ((InternalEList) getClientDependencies()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.DESTROY_OBJECT_ACTION__NAME_EXPRESSION :
				return basicSetNameExpression(null, msgs);
			case UMLPackage.DESTROY_OBJECT_ACTION__IN_STRUCTURED_NODE :
				return basicSetInStructuredNode(null, msgs);
			case UMLPackage.DESTROY_OBJECT_ACTION__ACTIVITY :
				return basicSetActivity(null, msgs);
			case UMLPackage.DESTROY_OBJECT_ACTION__OUTGOING :
				return ((InternalEList) getOutgoings()).basicRemove(otherEnd,
					msgs);
			case UMLPackage.DESTROY_OBJECT_ACTION__INCOMING :
				return ((InternalEList) getIncomings()).basicRemove(otherEnd,
					msgs);
			case UMLPackage.DESTROY_OBJECT_ACTION__IN_PARTITION :
				return ((InternalEList) getInPartitions()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.DESTROY_OBJECT_ACTION__IN_INTERRUPTIBLE_REGION :
				return ((InternalEList) getInInterruptibleRegions())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.DESTROY_OBJECT_ACTION__HANDLER :
				return ((InternalEList) getHandlers()).basicRemove(otherEnd,
					msgs);
			case UMLPackage.DESTROY_OBJECT_ACTION__LOCAL_PRECONDITION :
				return ((InternalEList) getLocalPreconditions()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.DESTROY_OBJECT_ACTION__LOCAL_POSTCONDITION :
				return ((InternalEList) getLocalPostconditions()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.DESTROY_OBJECT_ACTION__TARGET :
				return basicSetTarget(null, msgs);
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
			case UMLPackage.DESTROY_OBJECT_ACTION__EANNOTATIONS :
				return getEAnnotations();
			case UMLPackage.DESTROY_OBJECT_ACTION__OWNED_ELEMENT :
				return getOwnedElements();
			case UMLPackage.DESTROY_OBJECT_ACTION__OWNER :
				if (resolve)
					return getOwner();
				return basicGetOwner();
			case UMLPackage.DESTROY_OBJECT_ACTION__OWNED_COMMENT :
				return getOwnedComments();
			case UMLPackage.DESTROY_OBJECT_ACTION__NAME :
				return getName();
			case UMLPackage.DESTROY_OBJECT_ACTION__VISIBILITY :
				return getVisibility();
			case UMLPackage.DESTROY_OBJECT_ACTION__QUALIFIED_NAME :
				return getQualifiedName();
			case UMLPackage.DESTROY_OBJECT_ACTION__CLIENT_DEPENDENCY :
				return getClientDependencies();
			case UMLPackage.DESTROY_OBJECT_ACTION__NAMESPACE :
				if (resolve)
					return getNamespace();
				return basicGetNamespace();
			case UMLPackage.DESTROY_OBJECT_ACTION__NAME_EXPRESSION :
				if (resolve)
					return getNameExpression();
				return basicGetNameExpression();
			case UMLPackage.DESTROY_OBJECT_ACTION__IS_LEAF :
				return isLeaf()
					? Boolean.TRUE
					: Boolean.FALSE;
			case UMLPackage.DESTROY_OBJECT_ACTION__REDEFINED_ELEMENT :
				return getRedefinedElements();
			case UMLPackage.DESTROY_OBJECT_ACTION__REDEFINITION_CONTEXT :
				return getRedefinitionContexts();
			case UMLPackage.DESTROY_OBJECT_ACTION__IN_STRUCTURED_NODE :
				if (resolve)
					return getInStructuredNode();
				return basicGetInStructuredNode();
			case UMLPackage.DESTROY_OBJECT_ACTION__ACTIVITY :
				if (resolve)
					return getActivity();
				return basicGetActivity();
			case UMLPackage.DESTROY_OBJECT_ACTION__OUTGOING :
				return getOutgoings();
			case UMLPackage.DESTROY_OBJECT_ACTION__INCOMING :
				return getIncomings();
			case UMLPackage.DESTROY_OBJECT_ACTION__IN_PARTITION :
				return getInPartitions();
			case UMLPackage.DESTROY_OBJECT_ACTION__IN_INTERRUPTIBLE_REGION :
				return getInInterruptibleRegions();
			case UMLPackage.DESTROY_OBJECT_ACTION__IN_GROUP :
				return getInGroups();
			case UMLPackage.DESTROY_OBJECT_ACTION__REDEFINED_NODE :
				return getRedefinedNodes();
			case UMLPackage.DESTROY_OBJECT_ACTION__HANDLER :
				return getHandlers();
			case UMLPackage.DESTROY_OBJECT_ACTION__OUTPUT :
				return getOutputs();
			case UMLPackage.DESTROY_OBJECT_ACTION__INPUT :
				return getInputs();
			case UMLPackage.DESTROY_OBJECT_ACTION__CONTEXT :
				if (resolve)
					return getContext();
				return basicGetContext();
			case UMLPackage.DESTROY_OBJECT_ACTION__LOCAL_PRECONDITION :
				return getLocalPreconditions();
			case UMLPackage.DESTROY_OBJECT_ACTION__LOCAL_POSTCONDITION :
				return getLocalPostconditions();
			case UMLPackage.DESTROY_OBJECT_ACTION__IS_DESTROY_LINKS :
				return isDestroyLinks()
					? Boolean.TRUE
					: Boolean.FALSE;
			case UMLPackage.DESTROY_OBJECT_ACTION__IS_DESTROY_OWNED_OBJECTS :
				return isDestroyOwnedObjects()
					? Boolean.TRUE
					: Boolean.FALSE;
			case UMLPackage.DESTROY_OBJECT_ACTION__TARGET :
				if (resolve)
					return getTarget();
				return basicGetTarget();
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
			case UMLPackage.DESTROY_OBJECT_ACTION__EANNOTATIONS :
				getEAnnotations().clear();
				getEAnnotations().addAll((Collection) newValue);
				return;
			case UMLPackage.DESTROY_OBJECT_ACTION__OWNED_COMMENT :
				getOwnedComments().clear();
				getOwnedComments().addAll((Collection) newValue);
				return;
			case UMLPackage.DESTROY_OBJECT_ACTION__NAME :
				setName((String) newValue);
				return;
			case UMLPackage.DESTROY_OBJECT_ACTION__VISIBILITY :
				setVisibility((VisibilityKind) newValue);
				return;
			case UMLPackage.DESTROY_OBJECT_ACTION__CLIENT_DEPENDENCY :
				getClientDependencies().clear();
				getClientDependencies().addAll((Collection) newValue);
				return;
			case UMLPackage.DESTROY_OBJECT_ACTION__NAME_EXPRESSION :
				setNameExpression((StringExpression) newValue);
				return;
			case UMLPackage.DESTROY_OBJECT_ACTION__IS_LEAF :
				setIsLeaf(((Boolean) newValue).booleanValue());
				return;
			case UMLPackage.DESTROY_OBJECT_ACTION__IN_STRUCTURED_NODE :
				setInStructuredNode((StructuredActivityNode) newValue);
				return;
			case UMLPackage.DESTROY_OBJECT_ACTION__ACTIVITY :
				setActivity((Activity) newValue);
				return;
			case UMLPackage.DESTROY_OBJECT_ACTION__OUTGOING :
				getOutgoings().clear();
				getOutgoings().addAll((Collection) newValue);
				return;
			case UMLPackage.DESTROY_OBJECT_ACTION__INCOMING :
				getIncomings().clear();
				getIncomings().addAll((Collection) newValue);
				return;
			case UMLPackage.DESTROY_OBJECT_ACTION__IN_PARTITION :
				getInPartitions().clear();
				getInPartitions().addAll((Collection) newValue);
				return;
			case UMLPackage.DESTROY_OBJECT_ACTION__IN_INTERRUPTIBLE_REGION :
				getInInterruptibleRegions().clear();
				getInInterruptibleRegions().addAll((Collection) newValue);
				return;
			case UMLPackage.DESTROY_OBJECT_ACTION__REDEFINED_NODE :
				getRedefinedNodes().clear();
				getRedefinedNodes().addAll((Collection) newValue);
				return;
			case UMLPackage.DESTROY_OBJECT_ACTION__HANDLER :
				getHandlers().clear();
				getHandlers().addAll((Collection) newValue);
				return;
			case UMLPackage.DESTROY_OBJECT_ACTION__LOCAL_PRECONDITION :
				getLocalPreconditions().clear();
				getLocalPreconditions().addAll((Collection) newValue);
				return;
			case UMLPackage.DESTROY_OBJECT_ACTION__LOCAL_POSTCONDITION :
				getLocalPostconditions().clear();
				getLocalPostconditions().addAll((Collection) newValue);
				return;
			case UMLPackage.DESTROY_OBJECT_ACTION__IS_DESTROY_LINKS :
				setIsDestroyLinks(((Boolean) newValue).booleanValue());
				return;
			case UMLPackage.DESTROY_OBJECT_ACTION__IS_DESTROY_OWNED_OBJECTS :
				setIsDestroyOwnedObjects(((Boolean) newValue).booleanValue());
				return;
			case UMLPackage.DESTROY_OBJECT_ACTION__TARGET :
				setTarget((InputPin) newValue);
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
			case UMLPackage.DESTROY_OBJECT_ACTION__EANNOTATIONS :
				getEAnnotations().clear();
				return;
			case UMLPackage.DESTROY_OBJECT_ACTION__OWNED_COMMENT :
				getOwnedComments().clear();
				return;
			case UMLPackage.DESTROY_OBJECT_ACTION__NAME :
				unsetName();
				return;
			case UMLPackage.DESTROY_OBJECT_ACTION__VISIBILITY :
				unsetVisibility();
				return;
			case UMLPackage.DESTROY_OBJECT_ACTION__CLIENT_DEPENDENCY :
				getClientDependencies().clear();
				return;
			case UMLPackage.DESTROY_OBJECT_ACTION__NAME_EXPRESSION :
				setNameExpression((StringExpression) null);
				return;
			case UMLPackage.DESTROY_OBJECT_ACTION__IS_LEAF :
				setIsLeaf(IS_LEAF_EDEFAULT);
				return;
			case UMLPackage.DESTROY_OBJECT_ACTION__IN_STRUCTURED_NODE :
				setInStructuredNode((StructuredActivityNode) null);
				return;
			case UMLPackage.DESTROY_OBJECT_ACTION__ACTIVITY :
				setActivity((Activity) null);
				return;
			case UMLPackage.DESTROY_OBJECT_ACTION__OUTGOING :
				getOutgoings().clear();
				return;
			case UMLPackage.DESTROY_OBJECT_ACTION__INCOMING :
				getIncomings().clear();
				return;
			case UMLPackage.DESTROY_OBJECT_ACTION__IN_PARTITION :
				getInPartitions().clear();
				return;
			case UMLPackage.DESTROY_OBJECT_ACTION__IN_INTERRUPTIBLE_REGION :
				getInInterruptibleRegions().clear();
				return;
			case UMLPackage.DESTROY_OBJECT_ACTION__REDEFINED_NODE :
				getRedefinedNodes().clear();
				return;
			case UMLPackage.DESTROY_OBJECT_ACTION__HANDLER :
				getHandlers().clear();
				return;
			case UMLPackage.DESTROY_OBJECT_ACTION__LOCAL_PRECONDITION :
				getLocalPreconditions().clear();
				return;
			case UMLPackage.DESTROY_OBJECT_ACTION__LOCAL_POSTCONDITION :
				getLocalPostconditions().clear();
				return;
			case UMLPackage.DESTROY_OBJECT_ACTION__IS_DESTROY_LINKS :
				setIsDestroyLinks(IS_DESTROY_LINKS_EDEFAULT);
				return;
			case UMLPackage.DESTROY_OBJECT_ACTION__IS_DESTROY_OWNED_OBJECTS :
				setIsDestroyOwnedObjects(IS_DESTROY_OWNED_OBJECTS_EDEFAULT);
				return;
			case UMLPackage.DESTROY_OBJECT_ACTION__TARGET :
				setTarget((InputPin) null);
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
			case UMLPackage.DESTROY_OBJECT_ACTION__EANNOTATIONS :
				EList eAnnotations = (EList) eVirtualGet(UMLPackage.DESTROY_OBJECT_ACTION__EANNOTATIONS);
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UMLPackage.DESTROY_OBJECT_ACTION__OWNED_ELEMENT :
				return isSetOwnedElements();
			case UMLPackage.DESTROY_OBJECT_ACTION__OWNER :
				return isSetOwner();
			case UMLPackage.DESTROY_OBJECT_ACTION__OWNED_COMMENT :
				EList ownedComment = (EList) eVirtualGet(UMLPackage.DESTROY_OBJECT_ACTION__OWNED_COMMENT);
				return ownedComment != null && !ownedComment.isEmpty();
			case UMLPackage.DESTROY_OBJECT_ACTION__NAME :
				return isSetName();
			case UMLPackage.DESTROY_OBJECT_ACTION__VISIBILITY :
				return isSetVisibility();
			case UMLPackage.DESTROY_OBJECT_ACTION__QUALIFIED_NAME :
				return QUALIFIED_NAME_EDEFAULT == null
					? getQualifiedName() != null
					: !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case UMLPackage.DESTROY_OBJECT_ACTION__CLIENT_DEPENDENCY :
				EList clientDependency = (EList) eVirtualGet(UMLPackage.DESTROY_OBJECT_ACTION__CLIENT_DEPENDENCY);
				return clientDependency != null && !clientDependency.isEmpty();
			case UMLPackage.DESTROY_OBJECT_ACTION__NAMESPACE :
				return isSetNamespace();
			case UMLPackage.DESTROY_OBJECT_ACTION__NAME_EXPRESSION :
				return eVirtualGet(UMLPackage.DESTROY_OBJECT_ACTION__NAME_EXPRESSION) != null;
			case UMLPackage.DESTROY_OBJECT_ACTION__IS_LEAF :
				return ((eFlags & IS_LEAF_EFLAG) != 0) != IS_LEAF_EDEFAULT;
			case UMLPackage.DESTROY_OBJECT_ACTION__REDEFINED_ELEMENT :
				return isSetRedefinedElements();
			case UMLPackage.DESTROY_OBJECT_ACTION__REDEFINITION_CONTEXT :
				return isSetRedefinitionContexts();
			case UMLPackage.DESTROY_OBJECT_ACTION__IN_STRUCTURED_NODE :
				return basicGetInStructuredNode() != null;
			case UMLPackage.DESTROY_OBJECT_ACTION__ACTIVITY :
				return basicGetActivity() != null;
			case UMLPackage.DESTROY_OBJECT_ACTION__OUTGOING :
				EList outgoing = (EList) eVirtualGet(UMLPackage.DESTROY_OBJECT_ACTION__OUTGOING);
				return outgoing != null && !outgoing.isEmpty();
			case UMLPackage.DESTROY_OBJECT_ACTION__INCOMING :
				EList incoming = (EList) eVirtualGet(UMLPackage.DESTROY_OBJECT_ACTION__INCOMING);
				return incoming != null && !incoming.isEmpty();
			case UMLPackage.DESTROY_OBJECT_ACTION__IN_PARTITION :
				EList inPartition = (EList) eVirtualGet(UMLPackage.DESTROY_OBJECT_ACTION__IN_PARTITION);
				return inPartition != null && !inPartition.isEmpty();
			case UMLPackage.DESTROY_OBJECT_ACTION__IN_INTERRUPTIBLE_REGION :
				EList inInterruptibleRegion = (EList) eVirtualGet(UMLPackage.DESTROY_OBJECT_ACTION__IN_INTERRUPTIBLE_REGION);
				return inInterruptibleRegion != null
					&& !inInterruptibleRegion.isEmpty();
			case UMLPackage.DESTROY_OBJECT_ACTION__IN_GROUP :
				return isSetInGroups();
			case UMLPackage.DESTROY_OBJECT_ACTION__REDEFINED_NODE :
				EList redefinedNode = (EList) eVirtualGet(UMLPackage.DESTROY_OBJECT_ACTION__REDEFINED_NODE);
				return redefinedNode != null && !redefinedNode.isEmpty();
			case UMLPackage.DESTROY_OBJECT_ACTION__HANDLER :
				EList handler = (EList) eVirtualGet(UMLPackage.DESTROY_OBJECT_ACTION__HANDLER);
				return handler != null && !handler.isEmpty();
			case UMLPackage.DESTROY_OBJECT_ACTION__OUTPUT :
				return isSetOutputs();
			case UMLPackage.DESTROY_OBJECT_ACTION__INPUT :
				return isSetInputs();
			case UMLPackage.DESTROY_OBJECT_ACTION__CONTEXT :
				return basicGetContext() != null;
			case UMLPackage.DESTROY_OBJECT_ACTION__LOCAL_PRECONDITION :
				EList localPrecondition = (EList) eVirtualGet(UMLPackage.DESTROY_OBJECT_ACTION__LOCAL_PRECONDITION);
				return localPrecondition != null
					&& !localPrecondition.isEmpty();
			case UMLPackage.DESTROY_OBJECT_ACTION__LOCAL_POSTCONDITION :
				EList localPostcondition = (EList) eVirtualGet(UMLPackage.DESTROY_OBJECT_ACTION__LOCAL_POSTCONDITION);
				return localPostcondition != null
					&& !localPostcondition.isEmpty();
			case UMLPackage.DESTROY_OBJECT_ACTION__IS_DESTROY_LINKS :
				return ((eFlags & IS_DESTROY_LINKS_EFLAG) != 0) != IS_DESTROY_LINKS_EDEFAULT;
			case UMLPackage.DESTROY_OBJECT_ACTION__IS_DESTROY_OWNED_OBJECTS :
				return ((eFlags & IS_DESTROY_OWNED_OBJECTS_EFLAG) != 0) != IS_DESTROY_OWNED_OBJECTS_EDEFAULT;
			case UMLPackage.DESTROY_OBJECT_ACTION__TARGET :
				return eVirtualGet(UMLPackage.DESTROY_OBJECT_ACTION__TARGET) != null;
		}
		return eDynamicIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (isDestroyLinks: "); //$NON-NLS-1$
		result.append((eFlags & IS_DESTROY_LINKS_EFLAG) != 0);
		result.append(", isDestroyOwnedObjects: "); //$NON-NLS-1$
		result.append((eFlags & IS_DESTROY_OWNED_OBJECTS_EFLAG) != 0);
		result.append(')');
		return result.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetInputs() {
		return super.isSetInputs()
			|| eIsSet(UMLPackage.DESTROY_OBJECT_ACTION__TARGET);
	}

} //DestroyObjectActionImpl
