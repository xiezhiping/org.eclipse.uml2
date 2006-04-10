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
 * $Id: ActivityPartitionImpl.java,v 1.23 2006/04/10 20:40:19 khussey Exp $
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

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.uml2.Activity;
import org.eclipse.uml2.ActivityEdge;
import org.eclipse.uml2.ActivityGroup;
import org.eclipse.uml2.ActivityNode;
import org.eclipse.uml2.ActivityPartition;
import org.eclipse.uml2.Element;
import org.eclipse.uml2.StringExpression;
import org.eclipse.uml2.TemplateSignature;
import org.eclipse.uml2.UML2Factory;
import org.eclipse.uml2.UML2Package;
import org.eclipse.uml2.VisibilityKind;

import org.eclipse.uml2.common.util.CacheAdapter;
import org.eclipse.uml2.common.util.DerivedUnionEObjectEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Activity Partition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2.impl.ActivityPartitionImpl#getSubgroups <em>Subgroup</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.ActivityPartitionImpl#getActivityGroup_activity <em>Activity Group activity</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.ActivityPartitionImpl#getContainedNodes <em>Contained Node</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.ActivityPartitionImpl#getContainedEdges <em>Contained Edge</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.ActivityPartitionImpl#isDimension <em>Is Dimension</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.ActivityPartitionImpl#isExternal <em>Is External</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.ActivityPartitionImpl#getSuperPartition <em>Super Partition</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.ActivityPartitionImpl#getRepresents <em>Represents</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ActivityPartitionImpl extends NamedElementImpl implements ActivityPartition {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) IBM Corporation and others."; //$NON-NLS-1$

	/**
	 * The cached value of the '{@link #getSubgroups() <em>Subgroup</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubgroups()
	 * @generated
	 * @ordered
	 */
	protected EList subgroups = null;

	/**
	 * The cached value of the '{@link #getContainedNodes() <em>Contained Node</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainedNodes()
	 * @generated
	 * @ordered
	 */
	protected EList containedNodes = null;

	/**
	 * The cached value of the '{@link #getContainedEdges() <em>Contained Edge</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainedEdges()
	 * @generated
	 * @ordered
	 */
	protected EList containedEdges = null;

	/**
	 * The default value of the '{@link #isDimension() <em>Is Dimension</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDimension()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_DIMENSION_EDEFAULT = false;

	/**
	 * The flag representing the value of the '{@link #isDimension() <em>Is Dimension</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDimension()
	 * @generated
	 * @ordered
	 */
	protected static final int IS_DIMENSION_EFLAG = 1 << 8;

	/**
	 * The default value of the '{@link #isExternal() <em>Is External</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isExternal()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_EXTERNAL_EDEFAULT = false;

	/**
	 * The flag representing the value of the '{@link #isExternal() <em>Is External</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isExternal()
	 * @generated
	 * @ordered
	 */
	protected static final int IS_EXTERNAL_EFLAG = 1 << 9;

	/**
	 * The cached value of the '{@link #getRepresents() <em>Represents</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepresents()
	 * @generated
	 * @ordered
	 */
	protected Element represents = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActivityPartitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return UML2Package.Literals.ACTIVITY_PARTITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Activity getActivityGroup_activity() {
		if (eContainerFeatureID != UML2Package.ACTIVITY_PARTITION__ACTIVITY_GROUP_ACTIVITY) return null;
		return (Activity)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetActivityGroup_activity(Activity newActivityGroup_activity, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newActivityGroup_activity, UML2Package.ACTIVITY_PARTITION__ACTIVITY_GROUP_ACTIVITY, msgs);

		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActivityGroup_activity(Activity newActivityGroup_activity) {
		if (newActivityGroup_activity != eInternalContainer() || (eContainerFeatureID != UML2Package.ACTIVITY_PARTITION__ACTIVITY_GROUP_ACTIVITY && newActivityGroup_activity != null)) {
			if (EcoreUtil.isAncestor(this, newActivityGroup_activity))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString()); //$NON-NLS-1$
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newActivityGroup_activity != null)
				msgs = ((InternalEObject)newActivityGroup_activity).eInverseAdd(this, UML2Package.ACTIVITY__GROUP, Activity.class, msgs);
			msgs = basicSetActivityGroup_activity(newActivityGroup_activity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2Package.ACTIVITY_PARTITION__ACTIVITY_GROUP_ACTIVITY, newActivityGroup_activity, newActivityGroup_activity));

	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetActivityGroup_activity() {
		return getActivityGroup_activity() != null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isDimension() {
		return (eFlags & IS_DIMENSION_EFLAG) != 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsDimension(boolean newIsDimension) {
		boolean oldIsDimension = (eFlags & IS_DIMENSION_EFLAG) != 0;
		if (newIsDimension) eFlags |= IS_DIMENSION_EFLAG; else eFlags &= ~IS_DIMENSION_EFLAG;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2Package.ACTIVITY_PARTITION__IS_DIMENSION, oldIsDimension, newIsDimension));


	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isExternal() {
		return (eFlags & IS_EXTERNAL_EFLAG) != 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsExternal(boolean newIsExternal) {
		boolean oldIsExternal = (eFlags & IS_EXTERNAL_EFLAG) != 0;
		if (newIsExternal) eFlags |= IS_EXTERNAL_EFLAG; else eFlags &= ~IS_EXTERNAL_EFLAG;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2Package.ACTIVITY_PARTITION__IS_EXTERNAL, oldIsExternal, newIsExternal));


	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getContainedEdges() {
		if (containedEdges == null) {
			containedEdges = new EObjectWithInverseResolvingEList.ManyInverse(ActivityEdge.class, this, UML2Package.ACTIVITY_PARTITION__CONTAINED_EDGE, UML2Package.ACTIVITY_EDGE__IN_PARTITION);
		}
		return containedEdges;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetContainedEdges() {
		return containedEdges != null && !containedEdges.isEmpty();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
    public ActivityEdge getContainedEdge(String name) {
		return getContainedEdge(name, false, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityEdge getContainedEdge(String name, boolean ignoreCase, EClass eClass) {
		containedEdgeLoop: for (Iterator i = getContainedEdges().iterator(); i.hasNext(); ) {
			ActivityEdge containedEdge = (ActivityEdge) i.next();
			if (eClass != null && !eClass.isInstance(containedEdge))
				continue containedEdgeLoop;
			if (name != null && !(ignoreCase ? name.equalsIgnoreCase(containedEdge.getName()) : name.equals(containedEdge.getName())))
				continue containedEdgeLoop;
			return containedEdge;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getContainedNodes() {
		if (containedNodes == null) {
			containedNodes = new EObjectWithInverseResolvingEList.ManyInverse(ActivityNode.class, this, UML2Package.ACTIVITY_PARTITION__CONTAINED_NODE, UML2Package.ACTIVITY_NODE__IN_PARTITION);
		}
		return containedNodes;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetContainedNodes() {
		return containedNodes != null && !containedNodes.isEmpty();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
    public ActivityNode getContainedNode(String name) {
		return getContainedNode(name, false, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityNode getContainedNode(String name, boolean ignoreCase, EClass eClass) {
		containedNodeLoop: for (Iterator i = getContainedNodes().iterator(); i.hasNext(); ) {
			ActivityNode containedNode = (ActivityNode) i.next();
			if (eClass != null && !eClass.isInstance(containedNode))
				continue containedNodeLoop;
			if (name != null && !(ignoreCase ? name.equalsIgnoreCase(containedNode.getName()) : name.equals(containedNode.getName())))
				continue containedNodeLoop;
			return containedNode;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getSubgroups() {
		if (subgroups == null) {
			subgroups = new EObjectContainmentWithInverseEList(ActivityPartition.class, this, UML2Package.ACTIVITY_PARTITION__SUBGROUP, UML2Package.ACTIVITY_PARTITION__SUPER_PARTITION);
		}
		return subgroups;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSubgroups() {
		return subgroups != null && !subgroups.isEmpty();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
    public ActivityPartition getSubgroup(String name) {
		for (Iterator i = getSubgroups().iterator(); i.hasNext(); ) {
			ActivityPartition subgroup = (ActivityPartition) i.next();
			if (name.equals(subgroup.getName())) {
				return subgroup;
			}
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityGroup getSubgroup(String name, boolean ignoreCase) {
		subgroupLoop: for (Iterator i = getSubgroups().iterator(); i.hasNext(); ) {
			ActivityPartition subgroup = (ActivityPartition) i.next();
			if (name != null && !(ignoreCase ? name.equalsIgnoreCase(subgroup.getName()) : name.equals(subgroup.getName())))
				continue subgroupLoop;
			return subgroup;
		}
		return null;
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
				cache.put(eResource, this, UML2Package.Literals.ELEMENT__OWNED_ELEMENT, ownedElements = new DerivedUnionEObjectEList(Element.class, this, UML2Package.ACTIVITY_PARTITION__OWNED_ELEMENT, OWNED_ELEMENT_ESUBSETS));
			}
			return ownedElements;
		}
		return new DerivedUnionEObjectEList(Element.class, this, UML2Package.ACTIVITY_PARTITION__OWNED_ELEMENT, OWNED_ELEMENT_ESUBSETS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOwnedElements() {
		return super.isSetOwnedElements()
			|| isSetSubgroups();
	}


	/**
	 * The array of subset feature identifiers for the '{@link #getOwnedElements() <em>Owned Element</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedElements()
	 * @generated
	 * @ordered
	 */
	protected static final int[] OWNED_ELEMENT_ESUBSETS = new int[] {UML2Package.ACTIVITY_PARTITION__OWNED_COMMENT, UML2Package.ACTIVITY_PARTITION__TEMPLATE_BINDING, UML2Package.ACTIVITY_PARTITION__OWNED_TEMPLATE_SIGNATURE, UML2Package.ACTIVITY_PARTITION__NAME_EXPRESSION, UML2Package.ACTIVITY_PARTITION__SUBGROUP};

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 * @deprecated Use #createSubgroup() instead.
	 */
	public ActivityPartition createSubgroup(EClass eClass) {
		ActivityPartition newSubgroup = (ActivityPartition) eClass.getEPackage().getEFactoryInstance().create(eClass);
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, 0, UML2Package.ACTIVITY_PARTITION__SUBGROUP, null, newSubgroup));
		}
		getSubgroups().add(newSubgroup);
		return newSubgroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public ActivityPartition createSubgroup() {
		ActivityPartition newSubgroup = UML2Factory.eINSTANCE.createActivityPartition();
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, 0, UML2Package.ACTIVITY_PARTITION__SUBGROUP, null, newSubgroup));
		}
		getSubgroups().add(newSubgroup);
		return newSubgroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityPartition getSuperPartition() {
		if (eContainerFeatureID != UML2Package.ACTIVITY_PARTITION__SUPER_PARTITION) return null;
		return (ActivityPartition)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSuperPartition(ActivityPartition newSuperPartition, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newSuperPartition, UML2Package.ACTIVITY_PARTITION__SUPER_PARTITION, msgs);

		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSuperPartition(ActivityPartition newSuperPartition) {
		if (newSuperPartition != eInternalContainer() || (eContainerFeatureID != UML2Package.ACTIVITY_PARTITION__SUPER_PARTITION && newSuperPartition != null)) {
			if (EcoreUtil.isAncestor(this, newSuperPartition))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString()); //$NON-NLS-1$
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newSuperPartition != null)
				msgs = ((InternalEObject)newSuperPartition).eInverseAdd(this, UML2Package.ACTIVITY_PARTITION__SUBGROUP, ActivityPartition.class, msgs);
			msgs = basicSetSuperPartition(newSuperPartition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2Package.ACTIVITY_PARTITION__SUPER_PARTITION, newSuperPartition, newSuperPartition));

	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Element getRepresents() {
		if (represents != null && represents.eIsProxy()) {
			InternalEObject oldRepresents = (InternalEObject)represents;
			represents = (Element)eResolveProxy(oldRepresents);
			if (represents != oldRepresents) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UML2Package.ACTIVITY_PARTITION__REPRESENTS, oldRepresents, represents));
			}
		}
		return represents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Element basicGetRepresents() {
		return represents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRepresents(Element newRepresents) {
		Element oldRepresents = represents;
		represents = newRepresents;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2Package.ACTIVITY_PARTITION__REPRESENTS, oldRepresents, represents));


	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UML2Package.ACTIVITY_PARTITION__EANNOTATIONS:
				return ((InternalEList)getEAnnotations()).basicAdd(otherEnd, msgs);
			case UML2Package.ACTIVITY_PARTITION__TEMPLATE_BINDING:
				return ((InternalEList)getTemplateBindings()).basicAdd(otherEnd, msgs);
			case UML2Package.ACTIVITY_PARTITION__OWNED_TEMPLATE_SIGNATURE:
				if (ownedTemplateSignature != null)
					msgs = ((InternalEObject)ownedTemplateSignature).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UML2Package.ACTIVITY_PARTITION__OWNED_TEMPLATE_SIGNATURE, null, msgs);
				return basicSetOwnedTemplateSignature((TemplateSignature)otherEnd, msgs);
			case UML2Package.ACTIVITY_PARTITION__CLIENT_DEPENDENCY:
				return ((InternalEList)getClientDependencies()).basicAdd(otherEnd, msgs);
			case UML2Package.ACTIVITY_PARTITION__ACTIVITY_GROUP_ACTIVITY:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetActivityGroup_activity((Activity)otherEnd, msgs);
			case UML2Package.ACTIVITY_PARTITION__CONTAINED_EDGE:
				return ((InternalEList)getContainedEdges()).basicAdd(otherEnd, msgs);
			case UML2Package.ACTIVITY_PARTITION__CONTAINED_NODE:
				return ((InternalEList)getContainedNodes()).basicAdd(otherEnd, msgs);
			case UML2Package.ACTIVITY_PARTITION__SUBGROUP:
				return ((InternalEList)getSubgroups()).basicAdd(otherEnd, msgs);
			case UML2Package.ACTIVITY_PARTITION__SUPER_PARTITION:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetSuperPartition((ActivityPartition)otherEnd, msgs);
		}
		return eDynamicInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UML2Package.ACTIVITY_PARTITION__EANNOTATIONS:
				return ((InternalEList)getEAnnotations()).basicRemove(otherEnd, msgs);
			case UML2Package.ACTIVITY_PARTITION__OWNED_COMMENT:
				return ((InternalEList)getOwnedComments()).basicRemove(otherEnd, msgs);
			case UML2Package.ACTIVITY_PARTITION__TEMPLATE_BINDING:
				return ((InternalEList)getTemplateBindings()).basicRemove(otherEnd, msgs);
			case UML2Package.ACTIVITY_PARTITION__OWNED_TEMPLATE_SIGNATURE:
				return basicSetOwnedTemplateSignature(null, msgs);
			case UML2Package.ACTIVITY_PARTITION__CLIENT_DEPENDENCY:
				return ((InternalEList)getClientDependencies()).basicRemove(otherEnd, msgs);
			case UML2Package.ACTIVITY_PARTITION__NAME_EXPRESSION:
				return basicSetNameExpression(null, msgs);
			case UML2Package.ACTIVITY_PARTITION__ACTIVITY_GROUP_ACTIVITY:
				return basicSetActivityGroup_activity(null, msgs);
			case UML2Package.ACTIVITY_PARTITION__CONTAINED_EDGE:
				return ((InternalEList)getContainedEdges()).basicRemove(otherEnd, msgs);
			case UML2Package.ACTIVITY_PARTITION__CONTAINED_NODE:
				return ((InternalEList)getContainedNodes()).basicRemove(otherEnd, msgs);
			case UML2Package.ACTIVITY_PARTITION__SUBGROUP:
				return ((InternalEList)getSubgroups()).basicRemove(otherEnd, msgs);
			case UML2Package.ACTIVITY_PARTITION__SUPER_PARTITION:
				return basicSetSuperPartition(null, msgs);
		}
		return eDynamicInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID) {
			case UML2Package.ACTIVITY_PARTITION__ACTIVITY_GROUP_ACTIVITY:
				return eInternalContainer().eInverseRemove(this, UML2Package.ACTIVITY__GROUP, Activity.class, msgs);
			case UML2Package.ACTIVITY_PARTITION__SUPER_PARTITION:
				return eInternalContainer().eInverseRemove(this, UML2Package.ACTIVITY_PARTITION__SUBGROUP, ActivityPartition.class, msgs);
		}
		return eDynamicBasicRemoveFromContainer(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Activity getActivity() {
		return getActivityGroup_activity();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetActivity(Activity newActivity, NotificationChain msgs) {
		return basicSetActivityGroup_activity(newActivity, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActivity(Activity newActivity) {
		setActivityGroup_activity(newActivity);
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetActivity() {
  		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Element basicGetOwner() {
		if (isSetSuperGroup()) {
			return basicGetSuperGroup();
		}
		if (isSetActivityGroup_activity()) {
			return getActivityGroup_activity();
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
			|| isSetSuperGroup()
			|| isSetActivityGroup_activity();
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityGroup basicGetSuperGroup() {
		ActivityPartition superPartition = getSuperPartition();			
		if (superPartition != null) {
			return superPartition;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityGroup getSuperGroup() {
		ActivityGroup superGroup = basicGetSuperGroup();
		return superGroup == null ? null : (ActivityGroup)eResolveProxy((InternalEObject)superGroup);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSuperGroup() {
		return eIsSet(UML2Package.ACTIVITY_PARTITION__SUPER_PARTITION);
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UML2Package.ACTIVITY_PARTITION__EANNOTATIONS:
				return getEAnnotations();
			case UML2Package.ACTIVITY_PARTITION__OWNED_ELEMENT:
				return getOwnedElements();
			case UML2Package.ACTIVITY_PARTITION__OWNER:
				if (resolve) return getOwner();
				return basicGetOwner();
			case UML2Package.ACTIVITY_PARTITION__OWNED_COMMENT:
				return getOwnedComments();
			case UML2Package.ACTIVITY_PARTITION__TEMPLATE_BINDING:
				return getTemplateBindings();
			case UML2Package.ACTIVITY_PARTITION__OWNED_TEMPLATE_SIGNATURE:
				return getOwnedTemplateSignature();
			case UML2Package.ACTIVITY_PARTITION__NAME:
				return getName();
			case UML2Package.ACTIVITY_PARTITION__QUALIFIED_NAME:
				return getQualifiedName();
			case UML2Package.ACTIVITY_PARTITION__VISIBILITY:
				return getVisibility();
			case UML2Package.ACTIVITY_PARTITION__CLIENT_DEPENDENCY:
				return getClientDependencies();
			case UML2Package.ACTIVITY_PARTITION__NAME_EXPRESSION:
				return getNameExpression();
			case UML2Package.ACTIVITY_PARTITION__SUPER_GROUP:
				if (resolve) return getSuperGroup();
				return basicGetSuperGroup();
			case UML2Package.ACTIVITY_PARTITION__ACTIVITY_GROUP_ACTIVITY:
				return getActivityGroup_activity();
			case UML2Package.ACTIVITY_PARTITION__IS_DIMENSION:
				return isDimension() ? Boolean.TRUE : Boolean.FALSE;
			case UML2Package.ACTIVITY_PARTITION__IS_EXTERNAL:
				return isExternal() ? Boolean.TRUE : Boolean.FALSE;
			case UML2Package.ACTIVITY_PARTITION__CONTAINED_EDGE:
				return getContainedEdges();
			case UML2Package.ACTIVITY_PARTITION__CONTAINED_NODE:
				return getContainedNodes();
			case UML2Package.ACTIVITY_PARTITION__SUBGROUP:
				return getSubgroups();
			case UML2Package.ACTIVITY_PARTITION__SUPER_PARTITION:
				return getSuperPartition();
			case UML2Package.ACTIVITY_PARTITION__REPRESENTS:
				if (resolve) return getRepresents();
				return basicGetRepresents();
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
			case UML2Package.ACTIVITY_PARTITION__EANNOTATIONS:
				getEAnnotations().clear();
				getEAnnotations().addAll((Collection)newValue);
				return;
			case UML2Package.ACTIVITY_PARTITION__OWNED_COMMENT:
				getOwnedComments().clear();
				getOwnedComments().addAll((Collection)newValue);
				return;
			case UML2Package.ACTIVITY_PARTITION__TEMPLATE_BINDING:
				getTemplateBindings().clear();
				getTemplateBindings().addAll((Collection)newValue);
				return;
			case UML2Package.ACTIVITY_PARTITION__OWNED_TEMPLATE_SIGNATURE:
				setOwnedTemplateSignature((TemplateSignature)newValue);
				return;
			case UML2Package.ACTIVITY_PARTITION__NAME:
				setName((String)newValue);
				return;
			case UML2Package.ACTIVITY_PARTITION__VISIBILITY:
				setVisibility((VisibilityKind)newValue);
				return;
			case UML2Package.ACTIVITY_PARTITION__CLIENT_DEPENDENCY:
				getClientDependencies().clear();
				getClientDependencies().addAll((Collection)newValue);
				return;
			case UML2Package.ACTIVITY_PARTITION__NAME_EXPRESSION:
				setNameExpression((StringExpression)newValue);
				return;
			case UML2Package.ACTIVITY_PARTITION__ACTIVITY_GROUP_ACTIVITY:
				setActivityGroup_activity((Activity)newValue);
				return;
			case UML2Package.ACTIVITY_PARTITION__IS_DIMENSION:
				setIsDimension(((Boolean)newValue).booleanValue());
				return;
			case UML2Package.ACTIVITY_PARTITION__IS_EXTERNAL:
				setIsExternal(((Boolean)newValue).booleanValue());
				return;
			case UML2Package.ACTIVITY_PARTITION__CONTAINED_EDGE:
				getContainedEdges().clear();
				getContainedEdges().addAll((Collection)newValue);
				return;
			case UML2Package.ACTIVITY_PARTITION__CONTAINED_NODE:
				getContainedNodes().clear();
				getContainedNodes().addAll((Collection)newValue);
				return;
			case UML2Package.ACTIVITY_PARTITION__SUBGROUP:
				getSubgroups().clear();
				getSubgroups().addAll((Collection)newValue);
				return;
			case UML2Package.ACTIVITY_PARTITION__SUPER_PARTITION:
				setSuperPartition((ActivityPartition)newValue);
				return;
			case UML2Package.ACTIVITY_PARTITION__REPRESENTS:
				setRepresents((Element)newValue);
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
			case UML2Package.ACTIVITY_PARTITION__EANNOTATIONS:
				getEAnnotations().clear();
				return;
			case UML2Package.ACTIVITY_PARTITION__OWNED_COMMENT:
				getOwnedComments().clear();
				return;
			case UML2Package.ACTIVITY_PARTITION__TEMPLATE_BINDING:
				getTemplateBindings().clear();
				return;
			case UML2Package.ACTIVITY_PARTITION__OWNED_TEMPLATE_SIGNATURE:
				setOwnedTemplateSignature((TemplateSignature)null);
				return;
			case UML2Package.ACTIVITY_PARTITION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case UML2Package.ACTIVITY_PARTITION__VISIBILITY:
				setVisibility(VISIBILITY_EDEFAULT);
				return;
			case UML2Package.ACTIVITY_PARTITION__CLIENT_DEPENDENCY:
				getClientDependencies().clear();
				return;
			case UML2Package.ACTIVITY_PARTITION__NAME_EXPRESSION:
				setNameExpression((StringExpression)null);
				return;
			case UML2Package.ACTIVITY_PARTITION__ACTIVITY_GROUP_ACTIVITY:
				setActivityGroup_activity((Activity)null);
				return;
			case UML2Package.ACTIVITY_PARTITION__IS_DIMENSION:
				setIsDimension(IS_DIMENSION_EDEFAULT);
				return;
			case UML2Package.ACTIVITY_PARTITION__IS_EXTERNAL:
				setIsExternal(IS_EXTERNAL_EDEFAULT);
				return;
			case UML2Package.ACTIVITY_PARTITION__CONTAINED_EDGE:
				getContainedEdges().clear();
				return;
			case UML2Package.ACTIVITY_PARTITION__CONTAINED_NODE:
				getContainedNodes().clear();
				return;
			case UML2Package.ACTIVITY_PARTITION__SUBGROUP:
				getSubgroups().clear();
				return;
			case UML2Package.ACTIVITY_PARTITION__SUPER_PARTITION:
				setSuperPartition((ActivityPartition)null);
				return;
			case UML2Package.ACTIVITY_PARTITION__REPRESENTS:
				setRepresents((Element)null);
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
			case UML2Package.ACTIVITY_PARTITION__EANNOTATIONS:
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UML2Package.ACTIVITY_PARTITION__OWNED_ELEMENT:
				return isSetOwnedElements();
			case UML2Package.ACTIVITY_PARTITION__OWNER:
				return isSetOwner();
			case UML2Package.ACTIVITY_PARTITION__OWNED_COMMENT:
				return ownedComments != null && !ownedComments.isEmpty();
			case UML2Package.ACTIVITY_PARTITION__TEMPLATE_BINDING:
				return templateBindings != null && !templateBindings.isEmpty();
			case UML2Package.ACTIVITY_PARTITION__OWNED_TEMPLATE_SIGNATURE:
				return ownedTemplateSignature != null;
			case UML2Package.ACTIVITY_PARTITION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case UML2Package.ACTIVITY_PARTITION__QUALIFIED_NAME:
				return QUALIFIED_NAME_EDEFAULT == null ? getQualifiedName() != null : !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case UML2Package.ACTIVITY_PARTITION__VISIBILITY:
				return visibility != VISIBILITY_EDEFAULT;
			case UML2Package.ACTIVITY_PARTITION__CLIENT_DEPENDENCY:
				return clientDependencies != null && !clientDependencies.isEmpty();
			case UML2Package.ACTIVITY_PARTITION__NAME_EXPRESSION:
				return nameExpression != null;
			case UML2Package.ACTIVITY_PARTITION__SUPER_GROUP:
				return isSetSuperGroup();
			case UML2Package.ACTIVITY_PARTITION__ACTIVITY_GROUP_ACTIVITY:
				return isSetActivityGroup_activity();
			case UML2Package.ACTIVITY_PARTITION__IS_DIMENSION:
				return ((eFlags & IS_DIMENSION_EFLAG) != 0) != IS_DIMENSION_EDEFAULT;
			case UML2Package.ACTIVITY_PARTITION__IS_EXTERNAL:
				return ((eFlags & IS_EXTERNAL_EFLAG) != 0) != IS_EXTERNAL_EDEFAULT;
			case UML2Package.ACTIVITY_PARTITION__CONTAINED_EDGE:
				return isSetContainedEdges();
			case UML2Package.ACTIVITY_PARTITION__CONTAINED_NODE:
				return isSetContainedNodes();
			case UML2Package.ACTIVITY_PARTITION__SUBGROUP:
				return isSetSubgroups();
			case UML2Package.ACTIVITY_PARTITION__SUPER_PARTITION:
				return getSuperPartition() != null;
			case UML2Package.ACTIVITY_PARTITION__REPRESENTS:
				return represents != null;
		}
		return eDynamicIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class baseClass) {
		if (baseClass == ActivityGroup.class) {
			switch (derivedFeatureID) {
				case UML2Package.ACTIVITY_PARTITION__SUPER_GROUP: return UML2Package.ACTIVITY_GROUP__SUPER_GROUP;
				case UML2Package.ACTIVITY_PARTITION__ACTIVITY_GROUP_ACTIVITY: return UML2Package.ACTIVITY_GROUP__ACTIVITY_GROUP_ACTIVITY;
				default: return -1;
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
		if (baseClass == ActivityGroup.class) {
			switch (baseFeatureID) {
				case UML2Package.ACTIVITY_GROUP__SUPER_GROUP: return UML2Package.ACTIVITY_PARTITION__SUPER_GROUP;
				case UML2Package.ACTIVITY_GROUP__ACTIVITY_GROUP_ACTIVITY: return UML2Package.ACTIVITY_PARTITION__ACTIVITY_GROUP_ACTIVITY;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (isDimension: "); //$NON-NLS-1$
		result.append((eFlags & IS_DIMENSION_EFLAG) != 0);
		result.append(", isExternal: "); //$NON-NLS-1$
		result.append((eFlags & IS_EXTERNAL_EFLAG) != 0);
		result.append(')');
		return result.toString();
	}


} //ActivityPartitionImpl
