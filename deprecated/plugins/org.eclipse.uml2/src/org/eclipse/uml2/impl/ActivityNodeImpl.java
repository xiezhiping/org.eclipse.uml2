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
 * $Id: ActivityNodeImpl.java,v 1.15 2005/11/14 17:31:09 khussey Exp $
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

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.uml2.Activity;
import org.eclipse.uml2.ActivityEdge;
import org.eclipse.uml2.ActivityGroup;
import org.eclipse.uml2.ActivityNode;
import org.eclipse.uml2.ActivityPartition;
import org.eclipse.uml2.Element;
import org.eclipse.uml2.InterruptibleActivityRegion;
import org.eclipse.uml2.RedefinableElement;
import org.eclipse.uml2.StringExpression;
import org.eclipse.uml2.StructuredActivityNode;
import org.eclipse.uml2.TemplateSignature;
import org.eclipse.uml2.UML2Package;
import org.eclipse.uml2.VisibilityKind;

import org.eclipse.uml2.common.util.DerivedUnionEObjectEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Activity Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2.impl.ActivityNodeImpl#getInGroups <em>In Group</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.ActivityNodeImpl#getOutgoings <em>Outgoing</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.ActivityNodeImpl#getIncomings <em>Incoming</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.ActivityNodeImpl#getActivity <em>Activity</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.ActivityNodeImpl#getRedefinedElements <em>Redefined Element</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.ActivityNodeImpl#getInStructuredNode <em>In Structured Node</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.ActivityNodeImpl#getInPartitions <em>In Partition</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.ActivityNodeImpl#getInInterruptibleRegions <em>In Interruptible Region</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ActivityNodeImpl extends RedefinableElementImpl implements ActivityNode {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) IBM Corporation and others."; //$NON-NLS-1$

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActivityNodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return UML2Package.eINSTANCE.getActivityNode();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getOutgoings() {
		EList outgoing = (EList)eVirtualGet(UML2Package.ACTIVITY_NODE__OUTGOING);
		if (outgoing == null) {
			eVirtualSet(UML2Package.ACTIVITY_NODE__OUTGOING, outgoing = new EObjectWithInverseResolvingEList(ActivityEdge.class, this, UML2Package.ACTIVITY_NODE__OUTGOING, UML2Package.ACTIVITY_EDGE__SOURCE));
		}
		return outgoing;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
    public ActivityEdge getOutgoing(String name) {
		for (Iterator i = getOutgoings().iterator(); i.hasNext(); ) {
			ActivityEdge outgoing = (ActivityEdge) i.next();
			if (name.equals(outgoing.getName())) {
				return outgoing;
			}
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getIncomings() {
		EList incoming = (EList)eVirtualGet(UML2Package.ACTIVITY_NODE__INCOMING);
		if (incoming == null) {
			eVirtualSet(UML2Package.ACTIVITY_NODE__INCOMING, incoming = new EObjectWithInverseResolvingEList(ActivityEdge.class, this, UML2Package.ACTIVITY_NODE__INCOMING, UML2Package.ACTIVITY_EDGE__TARGET));
		}
		return incoming;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
    public ActivityEdge getIncoming(String name) {
		for (Iterator i = getIncomings().iterator(); i.hasNext(); ) {
			ActivityEdge incoming = (ActivityEdge) i.next();
			if (name.equals(incoming.getName())) {
				return incoming;
			}
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getInGroups() {
		EList inGroup = (EList)eVirtualGet(UML2Package.ACTIVITY_NODE__IN_GROUP);
		if (inGroup == null) {
			eVirtualSet(UML2Package.ACTIVITY_NODE__IN_GROUP, inGroup = new DerivedUnionEObjectEList(ActivityGroup.class, this, UML2Package.ACTIVITY_NODE__IN_GROUP, new EStructuralFeature[] {UML2Package.eINSTANCE.getActivityNode_InStructuredNode(), UML2Package.eINSTANCE.getActivityNode_InPartition(), UML2Package.eINSTANCE.getActivityNode_InInterruptibleRegion()}));
		}
		return inGroup;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetInGroups() {
		return eIsSet(UML2Package.eINSTANCE.getActivityNode_InStructuredNode())
			|| eIsSet(UML2Package.eINSTANCE.getActivityNode_InPartition())
			|| eIsSet(UML2Package.eINSTANCE.getActivityNode_InInterruptibleRegion());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Activity getActivity() {
		if (eContainerFeatureID != UML2Package.ACTIVITY_NODE__ACTIVITY) return null;
		return (Activity)eContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActivity(Activity newActivity) {
		if (newActivity != eContainer || (eContainerFeatureID != UML2Package.ACTIVITY_NODE__ACTIVITY && newActivity != null)) {
			if (EcoreUtil.isAncestor(this, newActivity))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString()); //$NON-NLS-1$
			NotificationChain msgs = null;
			if (eContainer != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newActivity != null)
				msgs = ((InternalEObject)newActivity).eInverseAdd(this, UML2Package.ACTIVITY__NODE, Activity.class, msgs);
			msgs = eBasicSetContainer((InternalEObject)newActivity, UML2Package.ACTIVITY_NODE__ACTIVITY, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2Package.ACTIVITY_NODE__ACTIVITY, newActivity, newActivity));

	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getRedefinedElements() {
		EList redefinedElement = (EList)eVirtualGet(UML2Package.ACTIVITY_NODE__REDEFINED_ELEMENT);
		if (redefinedElement == null) {
			eVirtualSet(UML2Package.ACTIVITY_NODE__REDEFINED_ELEMENT, redefinedElement = new EObjectResolvingEList(ActivityNode.class, this, UML2Package.ACTIVITY_NODE__REDEFINED_ELEMENT));
		}
		return redefinedElement;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRedefinedElements() {
		EList redefinedElement = (EList)eVirtualGet(UML2Package.ACTIVITY_NODE__REDEFINED_ELEMENT);
		return redefinedElement != null && !redefinedElement.isEmpty();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
    public RedefinableElement getRedefinedElement(String name) {
		for (Iterator i = getRedefinedElements().iterator(); i.hasNext(); ) {
			ActivityNode redefinedElement = (ActivityNode) i.next();
			if (name.equals(redefinedElement.getName())) {
				return redefinedElement;
			}
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructuredActivityNode getInStructuredNode() {
		if (eContainerFeatureID != UML2Package.ACTIVITY_NODE__IN_STRUCTURED_NODE) return null;
		return (StructuredActivityNode)eContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInStructuredNode(StructuredActivityNode newInStructuredNode) {
		if (newInStructuredNode != eContainer || (eContainerFeatureID != UML2Package.ACTIVITY_NODE__IN_STRUCTURED_NODE && newInStructuredNode != null)) {
			if (EcoreUtil.isAncestor(this, newInStructuredNode))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString()); //$NON-NLS-1$
			NotificationChain msgs = null;
			if (eContainer != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newInStructuredNode != null)
				msgs = ((InternalEObject)newInStructuredNode).eInverseAdd(this, UML2Package.STRUCTURED_ACTIVITY_NODE__CONTAINED_NODE, StructuredActivityNode.class, msgs);
			msgs = eBasicSetContainer((InternalEObject)newInStructuredNode, UML2Package.ACTIVITY_NODE__IN_STRUCTURED_NODE, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2Package.ACTIVITY_NODE__IN_STRUCTURED_NODE, newInStructuredNode, newInStructuredNode));

	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getInPartitions() {
		EList inPartition = (EList)eVirtualGet(UML2Package.ACTIVITY_NODE__IN_PARTITION);
		if (inPartition == null) {
			eVirtualSet(UML2Package.ACTIVITY_NODE__IN_PARTITION, inPartition = new EObjectWithInverseResolvingEList.ManyInverse(ActivityPartition.class, this, UML2Package.ACTIVITY_NODE__IN_PARTITION, UML2Package.ACTIVITY_PARTITION__CONTAINED_NODE));
		}
		return inPartition;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
    public ActivityPartition getInPartition(String name) {
		for (Iterator i = getInPartitions().iterator(); i.hasNext(); ) {
			ActivityPartition inPartition = (ActivityPartition) i.next();
			if (name.equals(inPartition.getName())) {
				return inPartition;
			}
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getInInterruptibleRegions() {
		EList inInterruptibleRegion = (EList)eVirtualGet(UML2Package.ACTIVITY_NODE__IN_INTERRUPTIBLE_REGION);
		if (inInterruptibleRegion == null) {
			eVirtualSet(UML2Package.ACTIVITY_NODE__IN_INTERRUPTIBLE_REGION, inInterruptibleRegion = new EObjectWithInverseResolvingEList.ManyInverse(InterruptibleActivityRegion.class, this, UML2Package.ACTIVITY_NODE__IN_INTERRUPTIBLE_REGION, UML2Package.INTERRUPTIBLE_ACTIVITY_REGION__CONTAINED_NODE));
		}
		return inInterruptibleRegion;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Element basicGetOwner() {
		Activity activity = getActivity();			
		if (activity != null) {
			return activity;
		}
		return super.basicGetOwner();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOwner() {
		return super.isSetOwner()
			|| eIsSet(UML2Package.eINSTANCE.getActivityNode_Activity());
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, Class baseClass, NotificationChain msgs) {
		if (featureID >= 0) {
			switch (eDerivedStructuralFeatureID(featureID, baseClass)) {
				case UML2Package.ACTIVITY_NODE__EANNOTATIONS:
					return ((InternalEList)getEAnnotations()).basicAdd(otherEnd, msgs);
				case UML2Package.ACTIVITY_NODE__TEMPLATE_BINDING:
					return ((InternalEList)getTemplateBindings()).basicAdd(otherEnd, msgs);
				case UML2Package.ACTIVITY_NODE__OWNED_TEMPLATE_SIGNATURE:
					TemplateSignature ownedTemplateSignature = (TemplateSignature)eVirtualGet(UML2Package.ACTIVITY_NODE__OWNED_TEMPLATE_SIGNATURE);
					if (ownedTemplateSignature != null)
						msgs = ((InternalEObject)ownedTemplateSignature).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UML2Package.ACTIVITY_NODE__OWNED_TEMPLATE_SIGNATURE, null, msgs);
					return basicSetOwnedTemplateSignature((TemplateSignature)otherEnd, msgs);
				case UML2Package.ACTIVITY_NODE__CLIENT_DEPENDENCY:
					return ((InternalEList)getClientDependencies()).basicAdd(otherEnd, msgs);
				case UML2Package.ACTIVITY_NODE__OUTGOING:
					return ((InternalEList)getOutgoings()).basicAdd(otherEnd, msgs);
				case UML2Package.ACTIVITY_NODE__INCOMING:
					return ((InternalEList)getIncomings()).basicAdd(otherEnd, msgs);
				case UML2Package.ACTIVITY_NODE__ACTIVITY:
					if (eContainer != null)
						msgs = eBasicRemoveFromContainer(msgs);
					return eBasicSetContainer(otherEnd, UML2Package.ACTIVITY_NODE__ACTIVITY, msgs);
				case UML2Package.ACTIVITY_NODE__IN_STRUCTURED_NODE:
					if (eContainer != null)
						msgs = eBasicRemoveFromContainer(msgs);
					return eBasicSetContainer(otherEnd, UML2Package.ACTIVITY_NODE__IN_STRUCTURED_NODE, msgs);
				case UML2Package.ACTIVITY_NODE__IN_PARTITION:
					return ((InternalEList)getInPartitions()).basicAdd(otherEnd, msgs);
				case UML2Package.ACTIVITY_NODE__IN_INTERRUPTIBLE_REGION:
					return ((InternalEList)getInInterruptibleRegions()).basicAdd(otherEnd, msgs);
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
				case UML2Package.ACTIVITY_NODE__EANNOTATIONS:
					return ((InternalEList)getEAnnotations()).basicRemove(otherEnd, msgs);
				case UML2Package.ACTIVITY_NODE__OWNED_COMMENT:
					return ((InternalEList)getOwnedComments()).basicRemove(otherEnd, msgs);
				case UML2Package.ACTIVITY_NODE__TEMPLATE_BINDING:
					return ((InternalEList)getTemplateBindings()).basicRemove(otherEnd, msgs);
				case UML2Package.ACTIVITY_NODE__OWNED_TEMPLATE_SIGNATURE:
					return basicSetOwnedTemplateSignature(null, msgs);
				case UML2Package.ACTIVITY_NODE__CLIENT_DEPENDENCY:
					return ((InternalEList)getClientDependencies()).basicRemove(otherEnd, msgs);
				case UML2Package.ACTIVITY_NODE__NAME_EXPRESSION:
					return basicSetNameExpression(null, msgs);
				case UML2Package.ACTIVITY_NODE__OUTGOING:
					return ((InternalEList)getOutgoings()).basicRemove(otherEnd, msgs);
				case UML2Package.ACTIVITY_NODE__INCOMING:
					return ((InternalEList)getIncomings()).basicRemove(otherEnd, msgs);
				case UML2Package.ACTIVITY_NODE__ACTIVITY:
					return eBasicSetContainer(null, UML2Package.ACTIVITY_NODE__ACTIVITY, msgs);
				case UML2Package.ACTIVITY_NODE__IN_STRUCTURED_NODE:
					return eBasicSetContainer(null, UML2Package.ACTIVITY_NODE__IN_STRUCTURED_NODE, msgs);
				case UML2Package.ACTIVITY_NODE__IN_PARTITION:
					return ((InternalEList)getInPartitions()).basicRemove(otherEnd, msgs);
				case UML2Package.ACTIVITY_NODE__IN_INTERRUPTIBLE_REGION:
					return ((InternalEList)getInInterruptibleRegions()).basicRemove(otherEnd, msgs);
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
				case UML2Package.ACTIVITY_NODE__ACTIVITY:
					return eContainer.eInverseRemove(this, UML2Package.ACTIVITY__NODE, Activity.class, msgs);
				case UML2Package.ACTIVITY_NODE__IN_STRUCTURED_NODE:
					return eContainer.eInverseRemove(this, UML2Package.STRUCTURED_ACTIVITY_NODE__CONTAINED_NODE, StructuredActivityNode.class, msgs);
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
			case UML2Package.ACTIVITY_NODE__EANNOTATIONS:
				return getEAnnotations();
			case UML2Package.ACTIVITY_NODE__OWNED_ELEMENT:
				return getOwnedElements();
			case UML2Package.ACTIVITY_NODE__OWNER:
				if (resolve) return getOwner();
				return basicGetOwner();
			case UML2Package.ACTIVITY_NODE__OWNED_COMMENT:
				return getOwnedComments();
			case UML2Package.ACTIVITY_NODE__TEMPLATE_BINDING:
				return getTemplateBindings();
			case UML2Package.ACTIVITY_NODE__OWNED_TEMPLATE_SIGNATURE:
				return getOwnedTemplateSignature();
			case UML2Package.ACTIVITY_NODE__NAME:
				return getName();
			case UML2Package.ACTIVITY_NODE__QUALIFIED_NAME:
				return getQualifiedName();
			case UML2Package.ACTIVITY_NODE__VISIBILITY:
				return getVisibility();
			case UML2Package.ACTIVITY_NODE__CLIENT_DEPENDENCY:
				return getClientDependencies();
			case UML2Package.ACTIVITY_NODE__NAME_EXPRESSION:
				return getNameExpression();
			case UML2Package.ACTIVITY_NODE__REDEFINITION_CONTEXT:
				return getRedefinitionContexts();
			case UML2Package.ACTIVITY_NODE__IS_LEAF:
				return isLeaf() ? Boolean.TRUE : Boolean.FALSE;
			case UML2Package.ACTIVITY_NODE__OUTGOING:
				return getOutgoings();
			case UML2Package.ACTIVITY_NODE__INCOMING:
				return getIncomings();
			case UML2Package.ACTIVITY_NODE__IN_GROUP:
				return getInGroups();
			case UML2Package.ACTIVITY_NODE__ACTIVITY:
				return getActivity();
			case UML2Package.ACTIVITY_NODE__REDEFINED_ELEMENT:
				return getRedefinedElements();
			case UML2Package.ACTIVITY_NODE__IN_STRUCTURED_NODE:
				return getInStructuredNode();
			case UML2Package.ACTIVITY_NODE__IN_PARTITION:
				return getInPartitions();
			case UML2Package.ACTIVITY_NODE__IN_INTERRUPTIBLE_REGION:
				return getInInterruptibleRegions();
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
			case UML2Package.ACTIVITY_NODE__EANNOTATIONS:
				getEAnnotations().clear();
				getEAnnotations().addAll((Collection)newValue);
				return;
			case UML2Package.ACTIVITY_NODE__OWNED_COMMENT:
				getOwnedComments().clear();
				getOwnedComments().addAll((Collection)newValue);
				return;
			case UML2Package.ACTIVITY_NODE__TEMPLATE_BINDING:
				getTemplateBindings().clear();
				getTemplateBindings().addAll((Collection)newValue);
				return;
			case UML2Package.ACTIVITY_NODE__OWNED_TEMPLATE_SIGNATURE:
				setOwnedTemplateSignature((TemplateSignature)newValue);
				return;
			case UML2Package.ACTIVITY_NODE__NAME:
				setName((String)newValue);
				return;
			case UML2Package.ACTIVITY_NODE__VISIBILITY:
				setVisibility((VisibilityKind)newValue);
				return;
			case UML2Package.ACTIVITY_NODE__CLIENT_DEPENDENCY:
				getClientDependencies().clear();
				getClientDependencies().addAll((Collection)newValue);
				return;
			case UML2Package.ACTIVITY_NODE__NAME_EXPRESSION:
				setNameExpression((StringExpression)newValue);
				return;
			case UML2Package.ACTIVITY_NODE__IS_LEAF:
				setIsLeaf(((Boolean)newValue).booleanValue());
				return;
			case UML2Package.ACTIVITY_NODE__OUTGOING:
				getOutgoings().clear();
				getOutgoings().addAll((Collection)newValue);
				return;
			case UML2Package.ACTIVITY_NODE__INCOMING:
				getIncomings().clear();
				getIncomings().addAll((Collection)newValue);
				return;
			case UML2Package.ACTIVITY_NODE__ACTIVITY:
				setActivity((Activity)newValue);
				return;
			case UML2Package.ACTIVITY_NODE__REDEFINED_ELEMENT:
				getRedefinedElements().clear();
				getRedefinedElements().addAll((Collection)newValue);
				return;
			case UML2Package.ACTIVITY_NODE__IN_STRUCTURED_NODE:
				setInStructuredNode((StructuredActivityNode)newValue);
				return;
			case UML2Package.ACTIVITY_NODE__IN_PARTITION:
				getInPartitions().clear();
				getInPartitions().addAll((Collection)newValue);
				return;
			case UML2Package.ACTIVITY_NODE__IN_INTERRUPTIBLE_REGION:
				getInInterruptibleRegions().clear();
				getInInterruptibleRegions().addAll((Collection)newValue);
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
			case UML2Package.ACTIVITY_NODE__EANNOTATIONS:
				getEAnnotations().clear();
				return;
			case UML2Package.ACTIVITY_NODE__OWNED_COMMENT:
				getOwnedComments().clear();
				return;
			case UML2Package.ACTIVITY_NODE__TEMPLATE_BINDING:
				getTemplateBindings().clear();
				return;
			case UML2Package.ACTIVITY_NODE__OWNED_TEMPLATE_SIGNATURE:
				setOwnedTemplateSignature((TemplateSignature)null);
				return;
			case UML2Package.ACTIVITY_NODE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case UML2Package.ACTIVITY_NODE__VISIBILITY:
				setVisibility(VISIBILITY_EDEFAULT);
				return;
			case UML2Package.ACTIVITY_NODE__CLIENT_DEPENDENCY:
				getClientDependencies().clear();
				return;
			case UML2Package.ACTIVITY_NODE__NAME_EXPRESSION:
				setNameExpression((StringExpression)null);
				return;
			case UML2Package.ACTIVITY_NODE__IS_LEAF:
				setIsLeaf(IS_LEAF_EDEFAULT);
				return;
			case UML2Package.ACTIVITY_NODE__OUTGOING:
				getOutgoings().clear();
				return;
			case UML2Package.ACTIVITY_NODE__INCOMING:
				getIncomings().clear();
				return;
			case UML2Package.ACTIVITY_NODE__ACTIVITY:
				setActivity((Activity)null);
				return;
			case UML2Package.ACTIVITY_NODE__REDEFINED_ELEMENT:
				getRedefinedElements().clear();
				return;
			case UML2Package.ACTIVITY_NODE__IN_STRUCTURED_NODE:
				setInStructuredNode((StructuredActivityNode)null);
				return;
			case UML2Package.ACTIVITY_NODE__IN_PARTITION:
				getInPartitions().clear();
				return;
			case UML2Package.ACTIVITY_NODE__IN_INTERRUPTIBLE_REGION:
				getInInterruptibleRegions().clear();
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
			case UML2Package.ACTIVITY_NODE__EANNOTATIONS:
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UML2Package.ACTIVITY_NODE__OWNED_ELEMENT:
				return isSetOwnedElements();
			case UML2Package.ACTIVITY_NODE__OWNER:
				return isSetOwner();
			case UML2Package.ACTIVITY_NODE__OWNED_COMMENT:
				EList ownedComment = (EList)eVirtualGet(UML2Package.ACTIVITY_NODE__OWNED_COMMENT);
				return ownedComment != null && !ownedComment.isEmpty();
			case UML2Package.ACTIVITY_NODE__TEMPLATE_BINDING:
				EList templateBinding = (EList)eVirtualGet(UML2Package.ACTIVITY_NODE__TEMPLATE_BINDING);
				return templateBinding != null && !templateBinding.isEmpty();
			case UML2Package.ACTIVITY_NODE__OWNED_TEMPLATE_SIGNATURE:
				return eVirtualGet(UML2Package.ACTIVITY_NODE__OWNED_TEMPLATE_SIGNATURE) != null;
			case UML2Package.ACTIVITY_NODE__NAME:
				String name = eVirtualIsSet(UML2Package.ACTIVITY_NODE__NAME) ? (String)eVirtualGet(UML2Package.ACTIVITY_NODE__NAME) : NAME_EDEFAULT;
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case UML2Package.ACTIVITY_NODE__QUALIFIED_NAME:
				return QUALIFIED_NAME_EDEFAULT == null ? getQualifiedName() != null : !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case UML2Package.ACTIVITY_NODE__VISIBILITY:
				return eVirtualIsSet(UML2Package.ACTIVITY_NODE__VISIBILITY) && eVirtualGet(UML2Package.ACTIVITY_NODE__VISIBILITY) != VISIBILITY_EDEFAULT;
			case UML2Package.ACTIVITY_NODE__CLIENT_DEPENDENCY:
				EList clientDependency = (EList)eVirtualGet(UML2Package.ACTIVITY_NODE__CLIENT_DEPENDENCY);
				return clientDependency != null && !clientDependency.isEmpty();
			case UML2Package.ACTIVITY_NODE__NAME_EXPRESSION:
				return eVirtualGet(UML2Package.ACTIVITY_NODE__NAME_EXPRESSION) != null;
			case UML2Package.ACTIVITY_NODE__REDEFINITION_CONTEXT:
				return isSetRedefinitionContexts();
			case UML2Package.ACTIVITY_NODE__IS_LEAF:
				return ((eFlags & IS_LEAF_EFLAG) != 0) != IS_LEAF_EDEFAULT;
			case UML2Package.ACTIVITY_NODE__OUTGOING:
				EList outgoing = (EList)eVirtualGet(UML2Package.ACTIVITY_NODE__OUTGOING);
				return outgoing != null && !outgoing.isEmpty();
			case UML2Package.ACTIVITY_NODE__INCOMING:
				EList incoming = (EList)eVirtualGet(UML2Package.ACTIVITY_NODE__INCOMING);
				return incoming != null && !incoming.isEmpty();
			case UML2Package.ACTIVITY_NODE__IN_GROUP:
				return isSetInGroups();
			case UML2Package.ACTIVITY_NODE__ACTIVITY:
				return getActivity() != null;
			case UML2Package.ACTIVITY_NODE__REDEFINED_ELEMENT:
				return isSetRedefinedElements();
			case UML2Package.ACTIVITY_NODE__IN_STRUCTURED_NODE:
				return getInStructuredNode() != null;
			case UML2Package.ACTIVITY_NODE__IN_PARTITION:
				EList inPartition = (EList)eVirtualGet(UML2Package.ACTIVITY_NODE__IN_PARTITION);
				return inPartition != null && !inPartition.isEmpty();
			case UML2Package.ACTIVITY_NODE__IN_INTERRUPTIBLE_REGION:
				EList inInterruptibleRegion = (EList)eVirtualGet(UML2Package.ACTIVITY_NODE__IN_INTERRUPTIBLE_REGION);
				return inInterruptibleRegion != null && !inInterruptibleRegion.isEmpty();
		}
		return eDynamicIsSet(eFeature);
	}


} //ActivityNodeImpl
