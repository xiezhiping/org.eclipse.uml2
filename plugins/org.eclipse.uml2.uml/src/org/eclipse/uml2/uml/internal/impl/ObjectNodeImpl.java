/*
 * Copyright (c) 2005, 2016 IBM Corporation, Embarcadero Technologies, CEA, and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *   Kenn Hussey (Embarcadero Technologies) - 204200
 *   Kenn Hussey - 286329, 323181
 *   Kenn Hussey (CEA) - 327039, 351774, 418466, 451350, 485756
 *
 */
package org.eclipse.uml2.uml.internal.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.uml2.common.util.CacheAdapter;
import org.eclipse.uml2.common.util.DerivedUnionEObjectEList;

import org.eclipse.uml2.uml.Activity;
import org.eclipse.uml2.uml.ActivityEdge;
import org.eclipse.uml2.uml.ActivityNode;
import org.eclipse.uml2.uml.ActivityPartition;
import org.eclipse.uml2.uml.Behavior;
import org.eclipse.uml2.uml.Comment;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.InterruptibleActivityRegion;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Namespace;
import org.eclipse.uml2.uml.ObjectNode;
import org.eclipse.uml2.uml.ObjectNodeOrderingKind;
import org.eclipse.uml2.uml.RedefinableElement;
import org.eclipse.uml2.uml.State;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.StringExpression;
import org.eclipse.uml2.uml.StructuredActivityNode;
import org.eclipse.uml2.uml.Type;
import org.eclipse.uml2.uml.TypedElement;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.ValueSpecification;
import org.eclipse.uml2.uml.VisibilityKind;

import org.eclipse.uml2.uml.internal.operations.ObjectNodeOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Object Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ObjectNodeImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ObjectNodeImpl#getOwnedElements <em>Owned Element</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ObjectNodeImpl#getInStates <em>In State</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ObjectNodeImpl#isControlType <em>Is Control Type</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ObjectNodeImpl#getOrdering <em>Ordering</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ObjectNodeImpl#getSelection <em>Selection</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ObjectNodeImpl#getUpperBound <em>Upper Bound</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ObjectNodeImpl
		extends ActivityNodeImpl
		implements ObjectNode {

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected Type type;

	/**
	 * The cached value of the '{@link #getInStates() <em>In State</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInStates()
	 * @generated
	 * @ordered
	 */
	protected EList<State> inStates;

	/**
	 * The default value of the '{@link #isControlType() <em>Is Control Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isControlType()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_CONTROL_TYPE_EDEFAULT = false;

	/**
	 * The flag representing the value of the '{@link #isControlType() <em>Is Control Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isControlType()
	 * @generated
	 * @ordered
	 */
	protected static final int IS_CONTROL_TYPE_EFLAG = 1 << 13;

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
	 * The offset of the flags representing the value of the '{@link #getOrdering() <em>Ordering</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected static final int ORDERING_EFLAG_OFFSET = 14;

	/**
	 * The flags representing the default value of the '{@link #getOrdering() <em>Ordering</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected static final int ORDERING_EFLAG_DEFAULT = ORDERING_EDEFAULT
		.ordinal() << ORDERING_EFLAG_OFFSET;

	/**
	 * The array of enumeration values for '{@link ObjectNodeOrderingKind Object Node Ordering Kind}'
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	private static final ObjectNodeOrderingKind[] ORDERING_EFLAG_VALUES = ObjectNodeOrderingKind
		.values();

	/**
	 * The flags representing the value of the '{@link #getOrdering() <em>Ordering</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrdering()
	 * @generated
	 * @ordered
	 */
	protected static final int ORDERING_EFLAG = 0x3 << ORDERING_EFLAG_OFFSET;

	/**
	 * The cached value of the '{@link #getSelection() <em>Selection</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelection()
	 * @generated
	 * @ordered
	 */
	protected Behavior selection;

	/**
	 * The cached value of the '{@link #getUpperBound() <em>Upper Bound</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpperBound()
	 * @generated
	 * @ordered
	 */
	protected ValueSpecification upperBound;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ObjectNodeImpl() {
		super();
		eFlags |= ORDERING_EFLAG_DEFAULT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UMLPackage.Literals.OBJECT_NODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type getType() {
		if (type != null && type.eIsProxy()) {
			InternalEObject oldType = (InternalEObject) type;
			type = (Type) eResolveProxy(oldType);
			if (type != oldType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
						UMLPackage.OBJECT_NODE__TYPE, oldType, type));
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
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.OBJECT_NODE__TYPE, oldType, type));
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
						UMLPackage.OBJECT_NODE__OWNED_ELEMENT,
						OWNED_ELEMENT_ESUBSETS));
			}
			return ownedElements;
		}
		return new DerivedUnionEObjectEList<Element>(Element.class, this,
			UMLPackage.OBJECT_NODE__OWNED_ELEMENT, OWNED_ELEMENT_ESUBSETS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectNodeOrderingKind getOrdering() {
		return ORDERING_EFLAG_VALUES[(eFlags
			& ORDERING_EFLAG) >>> ORDERING_EFLAG_OFFSET];
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrdering(ObjectNodeOrderingKind newOrdering) {
		ObjectNodeOrderingKind oldOrdering = ORDERING_EFLAG_VALUES[(eFlags
			& ORDERING_EFLAG) >>> ORDERING_EFLAG_OFFSET];
		if (newOrdering == null)
			newOrdering = ORDERING_EDEFAULT;
		eFlags = eFlags & ~ORDERING_EFLAG
			| newOrdering.ordinal() << ORDERING_EFLAG_OFFSET;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.OBJECT_NODE__ORDERING, oldOrdering, newOrdering));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isControlType() {
		return (eFlags & IS_CONTROL_TYPE_EFLAG) != 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsControlType(boolean newIsControlType) {
		boolean oldIsControlType = (eFlags & IS_CONTROL_TYPE_EFLAG) != 0;
		if (newIsControlType)
			eFlags |= IS_CONTROL_TYPE_EFLAG;
		else
			eFlags &= ~IS_CONTROL_TYPE_EFLAG;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.OBJECT_NODE__IS_CONTROL_TYPE, oldIsControlType,
				newIsControlType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueSpecification getUpperBound() {
		if (upperBound != null && upperBound.eIsProxy()) {
			InternalEObject oldUpperBound = (InternalEObject) upperBound;
			upperBound = (ValueSpecification) eResolveProxy(oldUpperBound);
			if (upperBound != oldUpperBound) {
				InternalEObject newUpperBound = (InternalEObject) upperBound;
				NotificationChain msgs = oldUpperBound.eInverseRemove(this,
					EOPPOSITE_FEATURE_BASE
						- UMLPackage.OBJECT_NODE__UPPER_BOUND,
					null, null);
				if (newUpperBound.eInternalContainer() == null) {
					msgs = newUpperBound
						.eInverseAdd(this,
							EOPPOSITE_FEATURE_BASE
								- UMLPackage.OBJECT_NODE__UPPER_BOUND,
							null, msgs);
				}
				if (msgs != null)
					msgs.dispatch();
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
						UMLPackage.OBJECT_NODE__UPPER_BOUND, oldUpperBound,
						upperBound));
			}
		}
		return upperBound;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueSpecification basicGetUpperBound() {
		return upperBound;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUpperBound(
			ValueSpecification newUpperBound, NotificationChain msgs) {
		ValueSpecification oldUpperBound = upperBound;
		upperBound = newUpperBound;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
				Notification.SET, UMLPackage.OBJECT_NODE__UPPER_BOUND,
				oldUpperBound, newUpperBound);
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
	public void setUpperBound(ValueSpecification newUpperBound) {
		if (newUpperBound != upperBound) {
			NotificationChain msgs = null;
			if (upperBound != null)
				msgs = ((InternalEObject) upperBound).eInverseRemove(this,
					EOPPOSITE_FEATURE_BASE
						- UMLPackage.OBJECT_NODE__UPPER_BOUND,
					null, msgs);
			if (newUpperBound != null)
				msgs = ((InternalEObject) newUpperBound).eInverseAdd(this,
					EOPPOSITE_FEATURE_BASE
						- UMLPackage.OBJECT_NODE__UPPER_BOUND,
					null, msgs);
			msgs = basicSetUpperBound(newUpperBound, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.OBJECT_NODE__UPPER_BOUND, newUpperBound,
				newUpperBound));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueSpecification createUpperBound(String name, Type type,
			EClass eClass) {
		ValueSpecification newUpperBound = (ValueSpecification) create(eClass);
		setUpperBound(newUpperBound);
		if (name != null)
			newUpperBound.setName(name);
		if (type != null)
			newUpperBound.setType(type);
		return newUpperBound;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<State> getInStates() {
		if (inStates == null) {
			inStates = new EObjectResolvingEList<State>(State.class, this,
				UMLPackage.OBJECT_NODE__IN_STATE);
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
		inStateLoop : for (State inState : getInStates()) {
			if (eClass != null && !eClass.isInstance(inState))
				continue inStateLoop;
			if (name != null && !(ignoreCase
				? name.equalsIgnoreCase(inState.getName())
				: name.equals(inState.getName())))
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
			InternalEObject oldSelection = (InternalEObject) selection;
			selection = (Behavior) eResolveProxy(oldSelection);
			if (selection != oldSelection) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
						UMLPackage.OBJECT_NODE__SELECTION, oldSelection,
						selection));
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
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.OBJECT_NODE__SELECTION, oldSelection, selection));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateObjectFlowEdges(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ObjectNodeOperations.validateObjectFlowEdges(this, diagnostics,
			context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSelectionBehavior(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ObjectNodeOperations.validateSelectionBehavior(this, diagnostics,
			context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInputOutputParameter(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ObjectNodeOperations.validateInputOutputParameter(this,
			diagnostics, context);
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
			case UMLPackage.OBJECT_NODE__EANNOTATIONS :
				return ((InternalEList<?>) getEAnnotations())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.OBJECT_NODE__OWNED_COMMENT :
				return ((InternalEList<?>) getOwnedComments())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.OBJECT_NODE__NAME_EXPRESSION :
				return basicSetNameExpression(null, msgs);
			case UMLPackage.OBJECT_NODE__IN_INTERRUPTIBLE_REGION :
				return ((InternalEList<?>) getInInterruptibleRegions())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.OBJECT_NODE__IN_STRUCTURED_NODE :
				return basicSetInStructuredNode(null, msgs);
			case UMLPackage.OBJECT_NODE__INCOMING :
				return ((InternalEList<?>) getIncomings()).basicRemove(otherEnd,
					msgs);
			case UMLPackage.OBJECT_NODE__OUTGOING :
				return ((InternalEList<?>) getOutgoings()).basicRemove(otherEnd,
					msgs);
			case UMLPackage.OBJECT_NODE__IN_PARTITION :
				return ((InternalEList<?>) getInPartitions())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.OBJECT_NODE__UPPER_BOUND :
				return basicSetUpperBound(null, msgs);
		}
		return eDynamicInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UMLPackage.OBJECT_NODE__EANNOTATIONS :
				return getEAnnotations();
			case UMLPackage.OBJECT_NODE__OWNED_COMMENT :
				return getOwnedComments();
			case UMLPackage.OBJECT_NODE__OWNED_ELEMENT :
				return getOwnedElements();
			case UMLPackage.OBJECT_NODE__OWNER :
				if (resolve)
					return getOwner();
				return basicGetOwner();
			case UMLPackage.OBJECT_NODE__CLIENT_DEPENDENCY :
				return getClientDependencies();
			case UMLPackage.OBJECT_NODE__NAME :
				return getName();
			case UMLPackage.OBJECT_NODE__NAME_EXPRESSION :
				if (resolve)
					return getNameExpression();
				return basicGetNameExpression();
			case UMLPackage.OBJECT_NODE__NAMESPACE :
				if (resolve)
					return getNamespace();
				return basicGetNamespace();
			case UMLPackage.OBJECT_NODE__QUALIFIED_NAME :
				return getQualifiedName();
			case UMLPackage.OBJECT_NODE__VISIBILITY :
				return getVisibility();
			case UMLPackage.OBJECT_NODE__IS_LEAF :
				return isLeaf();
			case UMLPackage.OBJECT_NODE__REDEFINED_ELEMENT :
				return getRedefinedElements();
			case UMLPackage.OBJECT_NODE__REDEFINITION_CONTEXT :
				return getRedefinitionContexts();
			case UMLPackage.OBJECT_NODE__ACTIVITY :
				if (resolve)
					return getActivity();
				return basicGetActivity();
			case UMLPackage.OBJECT_NODE__IN_GROUP :
				return getInGroups();
			case UMLPackage.OBJECT_NODE__IN_INTERRUPTIBLE_REGION :
				return getInInterruptibleRegions();
			case UMLPackage.OBJECT_NODE__IN_STRUCTURED_NODE :
				if (resolve)
					return getInStructuredNode();
				return basicGetInStructuredNode();
			case UMLPackage.OBJECT_NODE__INCOMING :
				return getIncomings();
			case UMLPackage.OBJECT_NODE__OUTGOING :
				return getOutgoings();
			case UMLPackage.OBJECT_NODE__REDEFINED_NODE :
				return getRedefinedNodes();
			case UMLPackage.OBJECT_NODE__IN_PARTITION :
				return getInPartitions();
			case UMLPackage.OBJECT_NODE__TYPE :
				if (resolve)
					return getType();
				return basicGetType();
			case UMLPackage.OBJECT_NODE__IN_STATE :
				return getInStates();
			case UMLPackage.OBJECT_NODE__IS_CONTROL_TYPE :
				return isControlType();
			case UMLPackage.OBJECT_NODE__ORDERING :
				return getOrdering();
			case UMLPackage.OBJECT_NODE__SELECTION :
				if (resolve)
					return getSelection();
				return basicGetSelection();
			case UMLPackage.OBJECT_NODE__UPPER_BOUND :
				if (resolve)
					return getUpperBound();
				return basicGetUpperBound();
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
			case UMLPackage.OBJECT_NODE__EANNOTATIONS :
				getEAnnotations().clear();
				getEAnnotations()
					.addAll((Collection<? extends EAnnotation>) newValue);
				return;
			case UMLPackage.OBJECT_NODE__OWNED_COMMENT :
				getOwnedComments().clear();
				getOwnedComments()
					.addAll((Collection<? extends Comment>) newValue);
				return;
			case UMLPackage.OBJECT_NODE__NAME :
				setName((String) newValue);
				return;
			case UMLPackage.OBJECT_NODE__NAME_EXPRESSION :
				setNameExpression((StringExpression) newValue);
				return;
			case UMLPackage.OBJECT_NODE__VISIBILITY :
				setVisibility((VisibilityKind) newValue);
				return;
			case UMLPackage.OBJECT_NODE__IS_LEAF :
				setIsLeaf((Boolean) newValue);
				return;
			case UMLPackage.OBJECT_NODE__ACTIVITY :
				setActivity((Activity) newValue);
				return;
			case UMLPackage.OBJECT_NODE__IN_INTERRUPTIBLE_REGION :
				getInInterruptibleRegions().clear();
				getInInterruptibleRegions().addAll(
					(Collection<? extends InterruptibleActivityRegion>) newValue);
				return;
			case UMLPackage.OBJECT_NODE__IN_STRUCTURED_NODE :
				setInStructuredNode((StructuredActivityNode) newValue);
				return;
			case UMLPackage.OBJECT_NODE__INCOMING :
				getIncomings().clear();
				getIncomings()
					.addAll((Collection<? extends ActivityEdge>) newValue);
				return;
			case UMLPackage.OBJECT_NODE__OUTGOING :
				getOutgoings().clear();
				getOutgoings()
					.addAll((Collection<? extends ActivityEdge>) newValue);
				return;
			case UMLPackage.OBJECT_NODE__REDEFINED_NODE :
				getRedefinedNodes().clear();
				getRedefinedNodes()
					.addAll((Collection<? extends ActivityNode>) newValue);
				return;
			case UMLPackage.OBJECT_NODE__IN_PARTITION :
				getInPartitions().clear();
				getInPartitions()
					.addAll((Collection<? extends ActivityPartition>) newValue);
				return;
			case UMLPackage.OBJECT_NODE__TYPE :
				setType((Type) newValue);
				return;
			case UMLPackage.OBJECT_NODE__IN_STATE :
				getInStates().clear();
				getInStates().addAll((Collection<? extends State>) newValue);
				return;
			case UMLPackage.OBJECT_NODE__IS_CONTROL_TYPE :
				setIsControlType((Boolean) newValue);
				return;
			case UMLPackage.OBJECT_NODE__ORDERING :
				setOrdering((ObjectNodeOrderingKind) newValue);
				return;
			case UMLPackage.OBJECT_NODE__SELECTION :
				setSelection((Behavior) newValue);
				return;
			case UMLPackage.OBJECT_NODE__UPPER_BOUND :
				setUpperBound((ValueSpecification) newValue);
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
			case UMLPackage.OBJECT_NODE__EANNOTATIONS :
				getEAnnotations().clear();
				return;
			case UMLPackage.OBJECT_NODE__OWNED_COMMENT :
				getOwnedComments().clear();
				return;
			case UMLPackage.OBJECT_NODE__NAME :
				unsetName();
				return;
			case UMLPackage.OBJECT_NODE__NAME_EXPRESSION :
				setNameExpression((StringExpression) null);
				return;
			case UMLPackage.OBJECT_NODE__VISIBILITY :
				unsetVisibility();
				return;
			case UMLPackage.OBJECT_NODE__IS_LEAF :
				setIsLeaf(IS_LEAF_EDEFAULT);
				return;
			case UMLPackage.OBJECT_NODE__ACTIVITY :
				setActivity((Activity) null);
				return;
			case UMLPackage.OBJECT_NODE__IN_INTERRUPTIBLE_REGION :
				getInInterruptibleRegions().clear();
				return;
			case UMLPackage.OBJECT_NODE__IN_STRUCTURED_NODE :
				setInStructuredNode((StructuredActivityNode) null);
				return;
			case UMLPackage.OBJECT_NODE__INCOMING :
				getIncomings().clear();
				return;
			case UMLPackage.OBJECT_NODE__OUTGOING :
				getOutgoings().clear();
				return;
			case UMLPackage.OBJECT_NODE__REDEFINED_NODE :
				getRedefinedNodes().clear();
				return;
			case UMLPackage.OBJECT_NODE__IN_PARTITION :
				getInPartitions().clear();
				return;
			case UMLPackage.OBJECT_NODE__TYPE :
				setType((Type) null);
				return;
			case UMLPackage.OBJECT_NODE__IN_STATE :
				getInStates().clear();
				return;
			case UMLPackage.OBJECT_NODE__IS_CONTROL_TYPE :
				setIsControlType(IS_CONTROL_TYPE_EDEFAULT);
				return;
			case UMLPackage.OBJECT_NODE__ORDERING :
				setOrdering(ORDERING_EDEFAULT);
				return;
			case UMLPackage.OBJECT_NODE__SELECTION :
				setSelection((Behavior) null);
				return;
			case UMLPackage.OBJECT_NODE__UPPER_BOUND :
				setUpperBound((ValueSpecification) null);
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
			case UMLPackage.OBJECT_NODE__EANNOTATIONS :
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UMLPackage.OBJECT_NODE__OWNED_COMMENT :
				return ownedComments != null && !ownedComments.isEmpty();
			case UMLPackage.OBJECT_NODE__OWNED_ELEMENT :
				return isSetOwnedElements();
			case UMLPackage.OBJECT_NODE__OWNER :
				return isSetOwner();
			case UMLPackage.OBJECT_NODE__CLIENT_DEPENDENCY :
				return !getClientDependencies().isEmpty();
			case UMLPackage.OBJECT_NODE__NAME :
				return isSetName();
			case UMLPackage.OBJECT_NODE__NAME_EXPRESSION :
				return nameExpression != null;
			case UMLPackage.OBJECT_NODE__NAMESPACE :
				return isSetNamespace();
			case UMLPackage.OBJECT_NODE__QUALIFIED_NAME :
				return QUALIFIED_NAME_EDEFAULT == null
					? getQualifiedName() != null
					: !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case UMLPackage.OBJECT_NODE__VISIBILITY :
				return isSetVisibility();
			case UMLPackage.OBJECT_NODE__IS_LEAF :
				return ((eFlags & IS_LEAF_EFLAG) != 0) != IS_LEAF_EDEFAULT;
			case UMLPackage.OBJECT_NODE__REDEFINED_ELEMENT :
				return isSetRedefinedElements();
			case UMLPackage.OBJECT_NODE__REDEFINITION_CONTEXT :
				return isSetRedefinitionContexts();
			case UMLPackage.OBJECT_NODE__ACTIVITY :
				return basicGetActivity() != null;
			case UMLPackage.OBJECT_NODE__IN_GROUP :
				return isSetInGroups();
			case UMLPackage.OBJECT_NODE__IN_INTERRUPTIBLE_REGION :
				return inInterruptibleRegions != null
					&& !inInterruptibleRegions.isEmpty();
			case UMLPackage.OBJECT_NODE__IN_STRUCTURED_NODE :
				return basicGetInStructuredNode() != null;
			case UMLPackage.OBJECT_NODE__INCOMING :
				return incomings != null && !incomings.isEmpty();
			case UMLPackage.OBJECT_NODE__OUTGOING :
				return outgoings != null && !outgoings.isEmpty();
			case UMLPackage.OBJECT_NODE__REDEFINED_NODE :
				return redefinedNodes != null && !redefinedNodes.isEmpty();
			case UMLPackage.OBJECT_NODE__IN_PARTITION :
				return inPartitions != null && !inPartitions.isEmpty();
			case UMLPackage.OBJECT_NODE__TYPE :
				return type != null;
			case UMLPackage.OBJECT_NODE__IN_STATE :
				return inStates != null && !inStates.isEmpty();
			case UMLPackage.OBJECT_NODE__IS_CONTROL_TYPE :
				return ((eFlags
					& IS_CONTROL_TYPE_EFLAG) != 0) != IS_CONTROL_TYPE_EDEFAULT;
			case UMLPackage.OBJECT_NODE__ORDERING :
				return (eFlags & ORDERING_EFLAG) != ORDERING_EFLAG_DEFAULT;
			case UMLPackage.OBJECT_NODE__SELECTION :
				return selection != null;
			case UMLPackage.OBJECT_NODE__UPPER_BOUND :
				return upperBound != null;
		}
		return eDynamicIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID,
			Class<?> baseClass) {
		if (baseClass == TypedElement.class) {
			switch (derivedFeatureID) {
				case UMLPackage.OBJECT_NODE__TYPE :
					return UMLPackage.TYPED_ELEMENT__TYPE;
				default :
					return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID,
			Class<?> baseClass) {
		if (baseClass == TypedElement.class) {
			switch (baseFeatureID) {
				case UMLPackage.TYPED_ELEMENT__TYPE :
					return UMLPackage.OBJECT_NODE__TYPE;
				default :
					return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments)
			throws InvocationTargetException {
		switch (operationID) {
			case UMLPackage.OBJECT_NODE___GET_EANNOTATION__STRING :
				return getEAnnotation((String) arguments.get(0));
			case UMLPackage.OBJECT_NODE___VALIDATE_HAS_OWNER__DIAGNOSTICCHAIN_MAP :
				return validateHasOwner((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.OBJECT_NODE___VALIDATE_NOT_OWN_SELF__DIAGNOSTICCHAIN_MAP :
				return validateNotOwnSelf((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.OBJECT_NODE___ADD_KEYWORD__STRING :
				return addKeyword((String) arguments.get(0));
			case UMLPackage.OBJECT_NODE___APPLY_STEREOTYPE__STEREOTYPE :
				return applyStereotype((Stereotype) arguments.get(0));
			case UMLPackage.OBJECT_NODE___CREATE_EANNOTATION__STRING :
				return createEAnnotation((String) arguments.get(0));
			case UMLPackage.OBJECT_NODE___DESTROY :
				destroy();
				return null;
			case UMLPackage.OBJECT_NODE___GET_KEYWORDS :
				return getKeywords();
			case UMLPackage.OBJECT_NODE___GET_APPLICABLE_STEREOTYPE__STRING :
				return getApplicableStereotype((String) arguments.get(0));
			case UMLPackage.OBJECT_NODE___GET_APPLICABLE_STEREOTYPES :
				return getApplicableStereotypes();
			case UMLPackage.OBJECT_NODE___GET_APPLIED_STEREOTYPE__STRING :
				return getAppliedStereotype((String) arguments.get(0));
			case UMLPackage.OBJECT_NODE___GET_APPLIED_STEREOTYPES :
				return getAppliedStereotypes();
			case UMLPackage.OBJECT_NODE___GET_APPLIED_SUBSTEREOTYPE__STEREOTYPE_STRING :
				return getAppliedSubstereotype((Stereotype) arguments.get(0),
					(String) arguments.get(1));
			case UMLPackage.OBJECT_NODE___GET_APPLIED_SUBSTEREOTYPES__STEREOTYPE :
				return getAppliedSubstereotypes((Stereotype) arguments.get(0));
			case UMLPackage.OBJECT_NODE___GET_MODEL :
				return getModel();
			case UMLPackage.OBJECT_NODE___GET_NEAREST_PACKAGE :
				return getNearestPackage();
			case UMLPackage.OBJECT_NODE___GET_RELATIONSHIPS :
				return getRelationships();
			case UMLPackage.OBJECT_NODE___GET_RELATIONSHIPS__ECLASS :
				return getRelationships((EClass) arguments.get(0));
			case UMLPackage.OBJECT_NODE___GET_REQUIRED_STEREOTYPE__STRING :
				return getRequiredStereotype((String) arguments.get(0));
			case UMLPackage.OBJECT_NODE___GET_REQUIRED_STEREOTYPES :
				return getRequiredStereotypes();
			case UMLPackage.OBJECT_NODE___GET_SOURCE_DIRECTED_RELATIONSHIPS :
				return getSourceDirectedRelationships();
			case UMLPackage.OBJECT_NODE___GET_SOURCE_DIRECTED_RELATIONSHIPS__ECLASS :
				return getSourceDirectedRelationships(
					(EClass) arguments.get(0));
			case UMLPackage.OBJECT_NODE___GET_STEREOTYPE_APPLICATION__STEREOTYPE :
				return getStereotypeApplication((Stereotype) arguments.get(0));
			case UMLPackage.OBJECT_NODE___GET_STEREOTYPE_APPLICATIONS :
				return getStereotypeApplications();
			case UMLPackage.OBJECT_NODE___GET_TARGET_DIRECTED_RELATIONSHIPS :
				return getTargetDirectedRelationships();
			case UMLPackage.OBJECT_NODE___GET_TARGET_DIRECTED_RELATIONSHIPS__ECLASS :
				return getTargetDirectedRelationships(
					(EClass) arguments.get(0));
			case UMLPackage.OBJECT_NODE___GET_VALUE__STEREOTYPE_STRING :
				return getValue((Stereotype) arguments.get(0),
					(String) arguments.get(1));
			case UMLPackage.OBJECT_NODE___HAS_KEYWORD__STRING :
				return hasKeyword((String) arguments.get(0));
			case UMLPackage.OBJECT_NODE___HAS_VALUE__STEREOTYPE_STRING :
				return hasValue((Stereotype) arguments.get(0),
					(String) arguments.get(1));
			case UMLPackage.OBJECT_NODE___IS_STEREOTYPE_APPLICABLE__STEREOTYPE :
				return isStereotypeApplicable((Stereotype) arguments.get(0));
			case UMLPackage.OBJECT_NODE___IS_STEREOTYPE_APPLIED__STEREOTYPE :
				return isStereotypeApplied((Stereotype) arguments.get(0));
			case UMLPackage.OBJECT_NODE___IS_STEREOTYPE_REQUIRED__STEREOTYPE :
				return isStereotypeRequired((Stereotype) arguments.get(0));
			case UMLPackage.OBJECT_NODE___REMOVE_KEYWORD__STRING :
				return removeKeyword((String) arguments.get(0));
			case UMLPackage.OBJECT_NODE___SET_VALUE__STEREOTYPE_STRING_OBJECT :
				setValue((Stereotype) arguments.get(0),
					(String) arguments.get(1), arguments.get(2));
				return null;
			case UMLPackage.OBJECT_NODE___UNAPPLY_STEREOTYPE__STEREOTYPE :
				return unapplyStereotype((Stereotype) arguments.get(0));
			case UMLPackage.OBJECT_NODE___ALL_OWNED_ELEMENTS :
				return allOwnedElements();
			case UMLPackage.OBJECT_NODE___MUST_BE_OWNED :
				return mustBeOwned();
			case UMLPackage.OBJECT_NODE___VALIDATE_VISIBILITY_NEEDS_OWNERSHIP__DIAGNOSTICCHAIN_MAP :
				return validateVisibilityNeedsOwnership(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.OBJECT_NODE___VALIDATE_HAS_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP :
				return validateHasQualifiedName(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.OBJECT_NODE___VALIDATE_HAS_NO_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP :
				return validateHasNoQualifiedName(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.OBJECT_NODE___CREATE_DEPENDENCY__NAMEDELEMENT :
				return createDependency((NamedElement) arguments.get(0));
			case UMLPackage.OBJECT_NODE___CREATE_USAGE__NAMEDELEMENT :
				return createUsage((NamedElement) arguments.get(0));
			case UMLPackage.OBJECT_NODE___GET_LABEL :
				return getLabel();
			case UMLPackage.OBJECT_NODE___GET_LABEL__BOOLEAN :
				return getLabel((Boolean) arguments.get(0));
			case UMLPackage.OBJECT_NODE___GET_NAMESPACE :
				return getNamespace();
			case UMLPackage.OBJECT_NODE___ALL_NAMESPACES :
				return allNamespaces();
			case UMLPackage.OBJECT_NODE___ALL_OWNING_PACKAGES :
				return allOwningPackages();
			case UMLPackage.OBJECT_NODE___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE :
				return isDistinguishableFrom((NamedElement) arguments.get(0),
					(Namespace) arguments.get(1));
			case UMLPackage.OBJECT_NODE___GET_QUALIFIED_NAME :
				return getQualifiedName();
			case UMLPackage.OBJECT_NODE___SEPARATOR :
				return separator();
			case UMLPackage.OBJECT_NODE___GET_CLIENT_DEPENDENCIES :
				return getClientDependencies();
			case UMLPackage.OBJECT_NODE___VALIDATE_REDEFINITION_CONSISTENT__DIAGNOSTICCHAIN_MAP :
				return validateRedefinitionConsistent(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.OBJECT_NODE___VALIDATE_NON_LEAF_REDEFINITION__DIAGNOSTICCHAIN_MAP :
				return validateNonLeafRedefinition(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.OBJECT_NODE___VALIDATE_REDEFINITION_CONTEXT_VALID__DIAGNOSTICCHAIN_MAP :
				return validateRedefinitionContextValid(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.OBJECT_NODE___IS_CONSISTENT_WITH__REDEFINABLEELEMENT :
				return isConsistentWith((RedefinableElement) arguments.get(0));
			case UMLPackage.OBJECT_NODE___IS_REDEFINITION_CONTEXT_VALID__REDEFINABLEELEMENT :
				return isRedefinitionContextValid(
					(RedefinableElement) arguments.get(0));
			case UMLPackage.OBJECT_NODE___CONTAINING_ACTIVITY :
				return containingActivity();
			case UMLPackage.OBJECT_NODE___VALIDATE_INPUT_OUTPUT_PARAMETER__DIAGNOSTICCHAIN_MAP :
				return validateInputOutputParameter(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.OBJECT_NODE___VALIDATE_SELECTION_BEHAVIOR__DIAGNOSTICCHAIN_MAP :
				return validateSelectionBehavior(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.OBJECT_NODE___VALIDATE_OBJECT_FLOW_EDGES__DIAGNOSTICCHAIN_MAP :
				return validateObjectFlowEdges(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
		}
		return eDynamicInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (isControlType: "); //$NON-NLS-1$
		result.append((eFlags & IS_CONTROL_TYPE_EFLAG) != 0);
		result.append(", ordering: "); //$NON-NLS-1$
		result.append(ORDERING_EFLAG_VALUES[(eFlags
			& ORDERING_EFLAG) >>> ORDERING_EFLAG_OFFSET]);
		result.append(')');
		return result.toString();
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
		UMLPackage.OBJECT_NODE__OWNED_COMMENT,
		UMLPackage.OBJECT_NODE__NAME_EXPRESSION,
		UMLPackage.OBJECT_NODE__UPPER_BOUND};

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetOwnedElements() {
		return super.isSetOwnedElements()
			|| eIsSet(UMLPackage.OBJECT_NODE__UPPER_BOUND);
	}

} //ObjectNodeImpl
