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
 * $Id: ActivityPartitionImpl.java,v 1.10 2005/05/18 16:38:27 khussey Exp $
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
	protected EList subgroup = null;

	/**
	 * The cached value of the '{@link #getContainedNodes() <em>Contained Node</em>}' reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getContainedNodes()
	 * @generated
	 * @ordered
	 */
    protected EList containedNode = null;

	/**
	 * The cached value of the '{@link #getContainedEdges() <em>Contained Edge</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainedEdges()
	 * @generated
	 * @ordered
	 */
	protected EList containedEdge = null;

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
		return UML2Package.eINSTANCE.getActivityPartition();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Activity getActivityGroup_activity() {
		if (eContainerFeatureID != UML2Package.ACTIVITY_PARTITION__ACTIVITY_GROUP_ACTIVITY) return null;
		return (Activity)eContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void setActivityGroup_activity(Activity newActivityGroup_activity) {
		if (newActivityGroup_activity != eContainer || (eContainerFeatureID != UML2Package.ACTIVITY_PARTITION__ACTIVITY_GROUP_ACTIVITY && newActivityGroup_activity != null)) {
			if (EcoreUtil.isAncestor(this, newActivityGroup_activity))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString()); //$NON-NLS-1$
			NotificationChain msgs = null;
			if (eContainer != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newActivityGroup_activity != null)
				msgs = ((InternalEObject)newActivityGroup_activity).eInverseAdd(this, UML2Package.ACTIVITY__GROUP, Activity.class, msgs);
			msgs = eBasicSetContainer((InternalEObject)newActivityGroup_activity, UML2Package.ACTIVITY_PARTITION__ACTIVITY_GROUP_ACTIVITY, msgs);
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
		if (containedEdge == null) {
			containedEdge = new EObjectWithInverseResolvingEList.ManyInverse(ActivityEdge.class, this, UML2Package.ACTIVITY_PARTITION__CONTAINED_EDGE, UML2Package.ACTIVITY_EDGE__IN_PARTITION);
		}
		return containedEdge;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
    public ActivityEdge getContainedEdge(String name) {
		for (Iterator i = getContainedEdges().iterator(); i.hasNext(); ) {
			ActivityEdge containedEdge = (ActivityEdge) i.next();
			if (name.equals(containedEdge.getName())) {
				return containedEdge;
			}
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getContainedNodes() {
		if (containedNode == null) {
			containedNode = new EObjectWithInverseResolvingEList.ManyInverse(ActivityNode.class, this, UML2Package.ACTIVITY_PARTITION__CONTAINED_NODE, UML2Package.ACTIVITY_NODE__IN_PARTITION);
		}
		return containedNode;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
    public ActivityNode getContainedNode(String name) {
		for (Iterator i = getContainedNodes().iterator(); i.hasNext(); ) {
			ActivityNode containedNode = (ActivityNode) i.next();
			if (name.equals(containedNode.getName())) {
				return containedNode;
			}
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getSubgroups() {
		if (subgroup == null) {
			subgroup = new EObjectContainmentWithInverseEList(ActivityPartition.class, this, UML2Package.ACTIVITY_PARTITION__SUBGROUP, UML2Package.ACTIVITY_PARTITION__SUPER_PARTITION);
		}
		return subgroup;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
    public ActivityGroup getSubgroup(String name) {
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
	 * @generated NOT
	 * @deprecated Use #createSubgroup() instead.
	 */
	public ActivityGroup createSubgroup(EClass eClass) {
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
	 * @generated
	 */
	public ActivityGroup createSubgroup() {
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
		return (ActivityPartition)eContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSuperPartition(ActivityPartition newSuperPartition) {
		if (newSuperPartition != eContainer || (eContainerFeatureID != UML2Package.ACTIVITY_PARTITION__SUPER_PARTITION && newSuperPartition != null)) {
			if (EcoreUtil.isAncestor(this, newSuperPartition))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString()); //$NON-NLS-1$
			NotificationChain msgs = null;
			if (eContainer != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newSuperPartition != null)
				msgs = ((InternalEObject)newSuperPartition).eInverseAdd(this, UML2Package.ACTIVITY_PARTITION__SUBGROUP, ActivityPartition.class, msgs);
			msgs = eBasicSetContainer((InternalEObject)newSuperPartition, UML2Package.ACTIVITY_PARTITION__SUPER_PARTITION, msgs);
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
			Element oldRepresents = represents;
			represents = (Element)eResolveProxy((InternalEObject)represents);
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
	public Activity getActivity() {
		return getActivityGroup_activity();
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
	public Element basicGetOwner() {
		ActivityGroup superGroup = basicGetSuperGroup();			
		if (superGroup != null) {
			return superGroup;
		}
		Activity activityGroup_activity = getActivityGroup_activity();			
		if (activityGroup_activity != null) {
			return activityGroup_activity;
		}
		return super.basicGetOwner();
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EList getOwnedElementsHelper(EList ownedElement) {
		super.getOwnedElementsHelper(ownedElement);
		if (subgroup != null) {
			ownedElement.addAll(subgroup);
		}
		return ownedElement;
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
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, Class baseClass, NotificationChain msgs) {
		if (featureID >= 0) {
			switch (eDerivedStructuralFeatureID(featureID, baseClass)) {
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
				case UML2Package.ACTIVITY_PARTITION__CONTAINED_EDGE:
					return ((InternalEList)getContainedEdges()).basicAdd(otherEnd, msgs);
				case UML2Package.ACTIVITY_PARTITION__CONTAINED_NODE:
					return ((InternalEList)getContainedNodes()).basicAdd(otherEnd, msgs);
				case UML2Package.ACTIVITY_PARTITION__SUBGROUP:
					return ((InternalEList)getSubgroups()).basicAdd(otherEnd, msgs);
				case UML2Package.ACTIVITY_PARTITION__SUPER_PARTITION:
					if (eContainer != null)
						msgs = eBasicRemoveFromContainer(msgs);
					return eBasicSetContainer(otherEnd, UML2Package.ACTIVITY_PARTITION__SUPER_PARTITION, msgs);
				default:
					return eDynamicInverseAdd(otherEnd, featureID, baseClass, msgs);
			}
		}
		if (eContainer != null)
			msgs = eBasicRemoveFromContainer(msgs);
		return eBasicSetContainer(otherEnd, featureID, msgs);
	}

	public NotificationChain eDynamicInverseAdd(InternalEObject otherEnd, int featureID, Class inverseClass, NotificationChain msgs) {
		switch (eDerivedStructuralFeatureID(featureID, inverseClass)) {
			case UML2Package.ACTIVITY_PARTITION__ACTIVITY_GROUP_ACTIVITY:
				if (eContainer != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return eBasicSetContainer(otherEnd, UML2Package.ACTIVITY_PARTITION__ACTIVITY_GROUP_ACTIVITY, msgs);
			default :
				return super.eDynamicInverseAdd(otherEnd, featureID, inverseClass, msgs);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, Class baseClass, NotificationChain msgs) {
		if (featureID >= 0) {
			switch (eDerivedStructuralFeatureID(featureID, baseClass)) {
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
				case UML2Package.ACTIVITY_PARTITION__CONTAINED_EDGE:
					return ((InternalEList)getContainedEdges()).basicRemove(otherEnd, msgs);
				case UML2Package.ACTIVITY_PARTITION__CONTAINED_NODE:
					return ((InternalEList)getContainedNodes()).basicRemove(otherEnd, msgs);
				case UML2Package.ACTIVITY_PARTITION__SUBGROUP:
					return ((InternalEList)getSubgroups()).basicRemove(otherEnd, msgs);
				case UML2Package.ACTIVITY_PARTITION__SUPER_PARTITION:
					return eBasicSetContainer(null, UML2Package.ACTIVITY_PARTITION__SUPER_PARTITION, msgs);
				default:
					return eDynamicInverseRemove(otherEnd, featureID, baseClass, msgs);
			}
		}
		return eBasicSetContainer(null, featureID, msgs);
	}

	public NotificationChain eDynamicInverseRemove(InternalEObject otherEnd, int featureID, Class inverseClass, NotificationChain msgs) {
		switch (eDerivedStructuralFeatureID(featureID, inverseClass)) {
			case UML2Package.ACTIVITY_PARTITION__ACTIVITY_GROUP_ACTIVITY:
				return eBasicSetContainer(null, UML2Package.ACTIVITY_PARTITION__ACTIVITY_GROUP_ACTIVITY, msgs);
			default :
				return super.eDynamicInverseRemove(otherEnd, featureID, inverseClass, msgs);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eBasicRemoveFromContainer(NotificationChain msgs) {
		if (eContainerFeatureID >= 0) {
			switch (eContainerFeatureID) {
				case UML2Package.ACTIVITY_PARTITION__ACTIVITY_GROUP_ACTIVITY:
					return eContainer.eInverseRemove(this, UML2Package.ACTIVITY__GROUP, Activity.class, msgs);
				case UML2Package.ACTIVITY_PARTITION__SUPER_PARTITION:
					return eContainer.eInverseRemove(this, UML2Package.ACTIVITY_PARTITION__SUBGROUP, ActivityPartition.class, msgs);
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
		return eDynamicGet(eFeature, resolve);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eSet(EStructuralFeature eFeature, Object newValue) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
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
		eDynamicSet(eFeature, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eUnset(EStructuralFeature eFeature) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
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
		eDynamicUnset(eFeature);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean eIsSet(EStructuralFeature eFeature) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case UML2Package.ACTIVITY_PARTITION__EANNOTATIONS:
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UML2Package.ACTIVITY_PARTITION__OWNED_ELEMENT:
				return !getOwnedElements().isEmpty();
			case UML2Package.ACTIVITY_PARTITION__OWNER:
				return basicGetOwner() != null;
			case UML2Package.ACTIVITY_PARTITION__OWNED_COMMENT:
				return ownedComment != null && !ownedComment.isEmpty();
			case UML2Package.ACTIVITY_PARTITION__TEMPLATE_BINDING:
				return templateBinding != null && !templateBinding.isEmpty();
			case UML2Package.ACTIVITY_PARTITION__OWNED_TEMPLATE_SIGNATURE:
				return ownedTemplateSignature != null;
			case UML2Package.ACTIVITY_PARTITION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case UML2Package.ACTIVITY_PARTITION__QUALIFIED_NAME:
				return QUALIFIED_NAME_EDEFAULT == null ? getQualifiedName() != null : !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case UML2Package.ACTIVITY_PARTITION__VISIBILITY:
				return visibility != VISIBILITY_EDEFAULT;
			case UML2Package.ACTIVITY_PARTITION__CLIENT_DEPENDENCY:
				return clientDependency != null && !clientDependency.isEmpty();
			case UML2Package.ACTIVITY_PARTITION__NAME_EXPRESSION:
				return nameExpression != null;
			case UML2Package.ACTIVITY_PARTITION__SUPER_GROUP:
				return basicGetSuperGroup() != null;
			case UML2Package.ACTIVITY_PARTITION__ACTIVITY_GROUP_ACTIVITY:
				return getActivityGroup_activity() != null;
			case UML2Package.ACTIVITY_PARTITION__IS_DIMENSION:
				return ((eFlags & IS_DIMENSION_EFLAG) != 0) != IS_DIMENSION_EDEFAULT;
			case UML2Package.ACTIVITY_PARTITION__IS_EXTERNAL:
				return ((eFlags & IS_EXTERNAL_EFLAG) != 0) != IS_EXTERNAL_EDEFAULT;
			case UML2Package.ACTIVITY_PARTITION__CONTAINED_EDGE:
				return containedEdge != null && !containedEdge.isEmpty();
			case UML2Package.ACTIVITY_PARTITION__CONTAINED_NODE:
				return containedNode != null && !containedNode.isEmpty();
			case UML2Package.ACTIVITY_PARTITION__SUBGROUP:
				return subgroup != null && !subgroup.isEmpty();
			case UML2Package.ACTIVITY_PARTITION__SUPER_PARTITION:
				return getSuperPartition() != null;
			case UML2Package.ACTIVITY_PARTITION__REPRESENTS:
				return represents != null;
		}
		return eDynamicIsSet(eFeature);
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
