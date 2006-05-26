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
 * $Id: ObjectNodeImpl.java,v 1.26 2006/05/26 18:16:43 khussey Exp $
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

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.uml2.Activity;
import org.eclipse.uml2.Behavior;
import org.eclipse.uml2.Element;
import org.eclipse.uml2.ObjectNode;
import org.eclipse.uml2.ObjectNodeOrderingKind;
import org.eclipse.uml2.State;
import org.eclipse.uml2.StringExpression;
import org.eclipse.uml2.StructuredActivityNode;
import org.eclipse.uml2.TemplateSignature;
import org.eclipse.uml2.Type;
import org.eclipse.uml2.TypedElement;
import org.eclipse.uml2.UML2Package;
import org.eclipse.uml2.ValueSpecification;
import org.eclipse.uml2.VisibilityKind;

import org.eclipse.uml2.common.util.CacheAdapter;
import org.eclipse.uml2.common.util.DerivedUnionEObjectEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Object Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2.impl.ObjectNodeImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.ObjectNodeImpl#getOwnedElements <em>Owned Element</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.ObjectNodeImpl#getOrdering <em>Ordering</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.ObjectNodeImpl#getUpperBound <em>Upper Bound</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.ObjectNodeImpl#getInStates <em>In State</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.ObjectNodeImpl#getSelection <em>Selection</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ObjectNodeImpl extends ActivityNodeImpl implements ObjectNode {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) IBM Corporation and others."; //$NON-NLS-1$

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected Type type = null;

	/**
	 * The default value of the '{@link #getOrdering() <em>Ordering</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrdering()
	 * @generated
	 * @ordered
	 */
	protected static final ObjectNodeOrderingKind ORDERING_EDEFAULT = ObjectNodeOrderingKind.FIFO_LITERAL;

	/**
	 * The cached value of the '{@link #getOrdering() <em>Ordering</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrdering()
	 * @generated
	 * @ordered
	 */
	protected ObjectNodeOrderingKind ordering = ORDERING_EDEFAULT;

	/**
	 * The cached value of the '{@link #getUpperBound() <em>Upper Bound</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpperBound()
	 * @generated
	 * @ordered
	 */
	protected ValueSpecification upperBound = null;

	/**
	 * The cached value of the '{@link #getInStates() <em>In State</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInStates()
	 * @generated
	 * @ordered
	 */
	protected EList inStates = null;

	/**
	 * The cached value of the '{@link #getSelection() <em>Selection</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelection()
	 * @generated
	 * @ordered
	 */
	protected Behavior selection = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ObjectNodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return UML2Package.Literals.OBJECT_NODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type getType() {
		if (type != null && type.eIsProxy()) {
			InternalEObject oldType = (InternalEObject)type;
			type = (Type)eResolveProxy(oldType);
			if (type != oldType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UML2Package.OBJECT_NODE__TYPE, oldType, type));
			}
		}
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type basicGetType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(Type newType) {
		Type oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2Package.OBJECT_NODE__TYPE, oldType, type));


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
				cache.put(eResource, this, UML2Package.Literals.ELEMENT__OWNED_ELEMENT, ownedElements = new DerivedUnionEObjectEList(Element.class, this, UML2Package.OBJECT_NODE__OWNED_ELEMENT, OWNED_ELEMENT_ESUBSETS));
			}
			return ownedElements;
		}
		return new DerivedUnionEObjectEList(Element.class, this, UML2Package.OBJECT_NODE__OWNED_ELEMENT, OWNED_ELEMENT_ESUBSETS);
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOwnedElements() {
		return super.isSetOwnedElements()
			|| eIsSet(UML2Package.OBJECT_NODE__UPPER_BOUND);
	}

	/**
	 * The array of subset feature identifiers for the '{@link #getOwnedElements() <em>Owned Element</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedElements()
	 * @generated
	 * @ordered
	 */
	protected static final int[] OWNED_ELEMENT_ESUBSETS = new int[] {UML2Package.OBJECT_NODE__OWNED_COMMENT, UML2Package.OBJECT_NODE__TEMPLATE_BINDING, UML2Package.OBJECT_NODE__OWNED_TEMPLATE_SIGNATURE, UML2Package.OBJECT_NODE__NAME_EXPRESSION, UML2Package.OBJECT_NODE__UPPER_BOUND};

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectNodeOrderingKind getOrdering() {
		return ordering;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrdering(ObjectNodeOrderingKind newOrdering) {
		ObjectNodeOrderingKind oldOrdering = ordering;
		ordering = newOrdering == null ? ORDERING_EDEFAULT : newOrdering;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2Package.OBJECT_NODE__ORDERING, oldOrdering, ordering));


	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueSpecification getUpperBound() {
		return upperBound;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUpperBound(ValueSpecification newUpperBound, NotificationChain msgs) {
		ValueSpecification oldUpperBound = upperBound;
		upperBound = newUpperBound;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UML2Package.OBJECT_NODE__UPPER_BOUND, oldUpperBound, newUpperBound);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}

		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUpperBound(ValueSpecification newUpperBound) {
		if (newUpperBound != upperBound) {
			NotificationChain msgs = null;
			if (upperBound != null)
				msgs = ((InternalEObject)upperBound).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UML2Package.OBJECT_NODE__UPPER_BOUND, null, msgs);
			if (newUpperBound != null)
				msgs = ((InternalEObject)newUpperBound).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UML2Package.OBJECT_NODE__UPPER_BOUND, null, msgs);
			msgs = basicSetUpperBound(newUpperBound, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2Package.OBJECT_NODE__UPPER_BOUND, newUpperBound, newUpperBound));

	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public ValueSpecification createUpperBound(EClass eClass) {
		ValueSpecification newUpperBound = (ValueSpecification) eClass.getEPackage().getEFactoryInstance().create(eClass);
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, 0, UML2Package.OBJECT_NODE__UPPER_BOUND, null, newUpperBound));
		}
		setUpperBound(newUpperBound);
		return newUpperBound;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getInStates() {
		if (inStates == null) {
			inStates = new EObjectResolvingEList(State.class, this, UML2Package.OBJECT_NODE__IN_STATE);
		}
		return inStates;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
    public State getInState(String name) {
		return getInState(name, false, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State getInState(String name, boolean ignoreCase, EClass eClass) {
		inStateLoop: for (Iterator i = getInStates().iterator(); i.hasNext(); ) {
			State inState = (State) i.next();
			if (eClass != null && !eClass.isInstance(inState))
				continue inStateLoop;
			if (name != null && !(ignoreCase ? name.equalsIgnoreCase(inState.getName()) : name.equals(inState.getName())))
				continue inStateLoop;
			return inState;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Behavior getSelection() {
		if (selection != null && selection.eIsProxy()) {
			InternalEObject oldSelection = (InternalEObject)selection;
			selection = (Behavior)eResolveProxy(oldSelection);
			if (selection != oldSelection) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UML2Package.OBJECT_NODE__SELECTION, oldSelection, selection));
			}
		}
		return selection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Behavior basicGetSelection() {
		return selection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSelection(Behavior newSelection) {
		Behavior oldSelection = selection;
		selection = newSelection;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2Package.OBJECT_NODE__SELECTION, oldSelection, selection));


	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UML2Package.OBJECT_NODE__EANNOTATIONS:
				return ((InternalEList)getEAnnotations()).basicRemove(otherEnd, msgs);
			case UML2Package.OBJECT_NODE__OWNED_COMMENT:
				return ((InternalEList)getOwnedComments()).basicRemove(otherEnd, msgs);
			case UML2Package.OBJECT_NODE__TEMPLATE_BINDING:
				return ((InternalEList)getTemplateBindings()).basicRemove(otherEnd, msgs);
			case UML2Package.OBJECT_NODE__OWNED_TEMPLATE_SIGNATURE:
				return basicSetOwnedTemplateSignature(null, msgs);
			case UML2Package.OBJECT_NODE__CLIENT_DEPENDENCY:
				return ((InternalEList)getClientDependencies()).basicRemove(otherEnd, msgs);
			case UML2Package.OBJECT_NODE__NAME_EXPRESSION:
				return basicSetNameExpression(null, msgs);
			case UML2Package.OBJECT_NODE__OUTGOING:
				return ((InternalEList)getOutgoings()).basicRemove(otherEnd, msgs);
			case UML2Package.OBJECT_NODE__INCOMING:
				return ((InternalEList)getIncomings()).basicRemove(otherEnd, msgs);
			case UML2Package.OBJECT_NODE__ACTIVITY:
				return basicSetActivity(null, msgs);
			case UML2Package.OBJECT_NODE__IN_STRUCTURED_NODE:
				return basicSetInStructuredNode(null, msgs);
			case UML2Package.OBJECT_NODE__IN_PARTITION:
				return ((InternalEList)getInPartitions()).basicRemove(otherEnd, msgs);
			case UML2Package.OBJECT_NODE__IN_INTERRUPTIBLE_REGION:
				return ((InternalEList)getInInterruptibleRegions()).basicRemove(otherEnd, msgs);
			case UML2Package.OBJECT_NODE__UPPER_BOUND:
				return basicSetUpperBound(null, msgs);
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
			case UML2Package.OBJECT_NODE__EANNOTATIONS:
				return getEAnnotations();
			case UML2Package.OBJECT_NODE__OWNED_ELEMENT:
				return getOwnedElements();
			case UML2Package.OBJECT_NODE__OWNER:
				if (resolve) return getOwner();
				return basicGetOwner();
			case UML2Package.OBJECT_NODE__OWNED_COMMENT:
				return getOwnedComments();
			case UML2Package.OBJECT_NODE__TEMPLATE_BINDING:
				return getTemplateBindings();
			case UML2Package.OBJECT_NODE__OWNED_TEMPLATE_SIGNATURE:
				return getOwnedTemplateSignature();
			case UML2Package.OBJECT_NODE__NAME:
				return getName();
			case UML2Package.OBJECT_NODE__QUALIFIED_NAME:
				return getQualifiedName();
			case UML2Package.OBJECT_NODE__VISIBILITY:
				return getVisibility();
			case UML2Package.OBJECT_NODE__CLIENT_DEPENDENCY:
				return getClientDependencies();
			case UML2Package.OBJECT_NODE__NAME_EXPRESSION:
				return getNameExpression();
			case UML2Package.OBJECT_NODE__REDEFINITION_CONTEXT:
				return getRedefinitionContexts();
			case UML2Package.OBJECT_NODE__IS_LEAF:
				return isLeaf() ? Boolean.TRUE : Boolean.FALSE;
			case UML2Package.OBJECT_NODE__OUTGOING:
				return getOutgoings();
			case UML2Package.OBJECT_NODE__INCOMING:
				return getIncomings();
			case UML2Package.OBJECT_NODE__IN_GROUP:
				return getInGroups();
			case UML2Package.OBJECT_NODE__ACTIVITY:
				return getActivity();
			case UML2Package.OBJECT_NODE__REDEFINED_ELEMENT:
				return getRedefinedElements();
			case UML2Package.OBJECT_NODE__IN_STRUCTURED_NODE:
				return getInStructuredNode();
			case UML2Package.OBJECT_NODE__IN_PARTITION:
				return getInPartitions();
			case UML2Package.OBJECT_NODE__IN_INTERRUPTIBLE_REGION:
				return getInInterruptibleRegions();
			case UML2Package.OBJECT_NODE__TYPE:
				if (resolve) return getType();
				return basicGetType();
			case UML2Package.OBJECT_NODE__ORDERING:
				return getOrdering();
			case UML2Package.OBJECT_NODE__UPPER_BOUND:
				return getUpperBound();
			case UML2Package.OBJECT_NODE__IN_STATE:
				return getInStates();
			case UML2Package.OBJECT_NODE__SELECTION:
				if (resolve) return getSelection();
				return basicGetSelection();
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
			case UML2Package.OBJECT_NODE__EANNOTATIONS:
				getEAnnotations().clear();
				getEAnnotations().addAll((Collection)newValue);
				return;
			case UML2Package.OBJECT_NODE__OWNED_COMMENT:
				getOwnedComments().clear();
				getOwnedComments().addAll((Collection)newValue);
				return;
			case UML2Package.OBJECT_NODE__TEMPLATE_BINDING:
				getTemplateBindings().clear();
				getTemplateBindings().addAll((Collection)newValue);
				return;
			case UML2Package.OBJECT_NODE__OWNED_TEMPLATE_SIGNATURE:
				setOwnedTemplateSignature((TemplateSignature)newValue);
				return;
			case UML2Package.OBJECT_NODE__NAME:
				setName((String)newValue);
				return;
			case UML2Package.OBJECT_NODE__VISIBILITY:
				setVisibility((VisibilityKind)newValue);
				return;
			case UML2Package.OBJECT_NODE__CLIENT_DEPENDENCY:
				getClientDependencies().clear();
				getClientDependencies().addAll((Collection)newValue);
				return;
			case UML2Package.OBJECT_NODE__NAME_EXPRESSION:
				setNameExpression((StringExpression)newValue);
				return;
			case UML2Package.OBJECT_NODE__IS_LEAF:
				setIsLeaf(((Boolean)newValue).booleanValue());
				return;
			case UML2Package.OBJECT_NODE__OUTGOING:
				getOutgoings().clear();
				getOutgoings().addAll((Collection)newValue);
				return;
			case UML2Package.OBJECT_NODE__INCOMING:
				getIncomings().clear();
				getIncomings().addAll((Collection)newValue);
				return;
			case UML2Package.OBJECT_NODE__ACTIVITY:
				setActivity((Activity)newValue);
				return;
			case UML2Package.OBJECT_NODE__REDEFINED_ELEMENT:
				getRedefinedElements().clear();
				getRedefinedElements().addAll((Collection)newValue);
				return;
			case UML2Package.OBJECT_NODE__IN_STRUCTURED_NODE:
				setInStructuredNode((StructuredActivityNode)newValue);
				return;
			case UML2Package.OBJECT_NODE__IN_PARTITION:
				getInPartitions().clear();
				getInPartitions().addAll((Collection)newValue);
				return;
			case UML2Package.OBJECT_NODE__IN_INTERRUPTIBLE_REGION:
				getInInterruptibleRegions().clear();
				getInInterruptibleRegions().addAll((Collection)newValue);
				return;
			case UML2Package.OBJECT_NODE__TYPE:
				setType((Type)newValue);
				return;
			case UML2Package.OBJECT_NODE__ORDERING:
				setOrdering((ObjectNodeOrderingKind)newValue);
				return;
			case UML2Package.OBJECT_NODE__UPPER_BOUND:
				setUpperBound((ValueSpecification)newValue);
				return;
			case UML2Package.OBJECT_NODE__IN_STATE:
				getInStates().clear();
				getInStates().addAll((Collection)newValue);
				return;
			case UML2Package.OBJECT_NODE__SELECTION:
				setSelection((Behavior)newValue);
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
			case UML2Package.OBJECT_NODE__EANNOTATIONS:
				getEAnnotations().clear();
				return;
			case UML2Package.OBJECT_NODE__OWNED_COMMENT:
				getOwnedComments().clear();
				return;
			case UML2Package.OBJECT_NODE__TEMPLATE_BINDING:
				getTemplateBindings().clear();
				return;
			case UML2Package.OBJECT_NODE__OWNED_TEMPLATE_SIGNATURE:
				setOwnedTemplateSignature((TemplateSignature)null);
				return;
			case UML2Package.OBJECT_NODE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case UML2Package.OBJECT_NODE__VISIBILITY:
				setVisibility(VISIBILITY_EDEFAULT);
				return;
			case UML2Package.OBJECT_NODE__CLIENT_DEPENDENCY:
				getClientDependencies().clear();
				return;
			case UML2Package.OBJECT_NODE__NAME_EXPRESSION:
				setNameExpression((StringExpression)null);
				return;
			case UML2Package.OBJECT_NODE__IS_LEAF:
				setIsLeaf(IS_LEAF_EDEFAULT);
				return;
			case UML2Package.OBJECT_NODE__OUTGOING:
				getOutgoings().clear();
				return;
			case UML2Package.OBJECT_NODE__INCOMING:
				getIncomings().clear();
				return;
			case UML2Package.OBJECT_NODE__ACTIVITY:
				setActivity((Activity)null);
				return;
			case UML2Package.OBJECT_NODE__REDEFINED_ELEMENT:
				getRedefinedElements().clear();
				return;
			case UML2Package.OBJECT_NODE__IN_STRUCTURED_NODE:
				setInStructuredNode((StructuredActivityNode)null);
				return;
			case UML2Package.OBJECT_NODE__IN_PARTITION:
				getInPartitions().clear();
				return;
			case UML2Package.OBJECT_NODE__IN_INTERRUPTIBLE_REGION:
				getInInterruptibleRegions().clear();
				return;
			case UML2Package.OBJECT_NODE__TYPE:
				setType((Type)null);
				return;
			case UML2Package.OBJECT_NODE__ORDERING:
				setOrdering(ORDERING_EDEFAULT);
				return;
			case UML2Package.OBJECT_NODE__UPPER_BOUND:
				setUpperBound((ValueSpecification)null);
				return;
			case UML2Package.OBJECT_NODE__IN_STATE:
				getInStates().clear();
				return;
			case UML2Package.OBJECT_NODE__SELECTION:
				setSelection((Behavior)null);
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
			case UML2Package.OBJECT_NODE__EANNOTATIONS:
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UML2Package.OBJECT_NODE__OWNED_ELEMENT:
				return isSetOwnedElements();
			case UML2Package.OBJECT_NODE__OWNER:
				return isSetOwner();
			case UML2Package.OBJECT_NODE__OWNED_COMMENT:
				return ownedComments != null && !ownedComments.isEmpty();
			case UML2Package.OBJECT_NODE__TEMPLATE_BINDING:
				return templateBindings != null && !templateBindings.isEmpty();
			case UML2Package.OBJECT_NODE__OWNED_TEMPLATE_SIGNATURE:
				return ownedTemplateSignature != null;
			case UML2Package.OBJECT_NODE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case UML2Package.OBJECT_NODE__QUALIFIED_NAME:
				return QUALIFIED_NAME_EDEFAULT == null ? getQualifiedName() != null : !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case UML2Package.OBJECT_NODE__VISIBILITY:
				return visibility != VISIBILITY_EDEFAULT;
			case UML2Package.OBJECT_NODE__CLIENT_DEPENDENCY:
				return clientDependencies != null && !clientDependencies.isEmpty();
			case UML2Package.OBJECT_NODE__NAME_EXPRESSION:
				return nameExpression != null;
			case UML2Package.OBJECT_NODE__REDEFINITION_CONTEXT:
				return isSetRedefinitionContexts();
			case UML2Package.OBJECT_NODE__IS_LEAF:
				return ((eFlags & IS_LEAF_EFLAG) != 0) != IS_LEAF_EDEFAULT;
			case UML2Package.OBJECT_NODE__OUTGOING:
				return outgoings != null && !outgoings.isEmpty();
			case UML2Package.OBJECT_NODE__INCOMING:
				return incomings != null && !incomings.isEmpty();
			case UML2Package.OBJECT_NODE__IN_GROUP:
				return isSetInGroups();
			case UML2Package.OBJECT_NODE__ACTIVITY:
				return getActivity() != null;
			case UML2Package.OBJECT_NODE__REDEFINED_ELEMENT:
				return isSetRedefinedElements();
			case UML2Package.OBJECT_NODE__IN_STRUCTURED_NODE:
				return getInStructuredNode() != null;
			case UML2Package.OBJECT_NODE__IN_PARTITION:
				return inPartitions != null && !inPartitions.isEmpty();
			case UML2Package.OBJECT_NODE__IN_INTERRUPTIBLE_REGION:
				return inInterruptibleRegions != null && !inInterruptibleRegions.isEmpty();
			case UML2Package.OBJECT_NODE__TYPE:
				return type != null;
			case UML2Package.OBJECT_NODE__ORDERING:
				return ordering != ORDERING_EDEFAULT;
			case UML2Package.OBJECT_NODE__UPPER_BOUND:
				return upperBound != null;
			case UML2Package.OBJECT_NODE__IN_STATE:
				return inStates != null && !inStates.isEmpty();
			case UML2Package.OBJECT_NODE__SELECTION:
				return selection != null;
		}
		return eDynamicIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class baseClass) {
		if (baseClass == TypedElement.class) {
			switch (derivedFeatureID) {
				case UML2Package.OBJECT_NODE__TYPE: return UML2Package.TYPED_ELEMENT__TYPE;
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
		if (baseClass == TypedElement.class) {
			switch (baseFeatureID) {
				case UML2Package.TYPED_ELEMENT__TYPE: return UML2Package.OBJECT_NODE__TYPE;
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
		result.append(" (ordering: "); //$NON-NLS-1$
		result.append(ordering);
		result.append(')');
		return result.toString();
	}


} //ObjectNodeImpl
