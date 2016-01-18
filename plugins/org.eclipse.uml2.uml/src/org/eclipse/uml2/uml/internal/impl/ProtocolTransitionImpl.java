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
import java.util.List;
import java.util.ListIterator;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.uml2.common.util.CacheAdapter;
import org.eclipse.uml2.common.util.SubsetSupersetEObjectContainmentWithInverseEList;

import org.eclipse.uml2.common.util.DerivedEObjectEList;

import org.eclipse.uml2.uml.Behavior;
import org.eclipse.uml2.uml.Comment;
import org.eclipse.uml2.uml.CallEvent;
import org.eclipse.uml2.uml.Constraint;
import org.eclipse.uml2.uml.ElementImport;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Namespace;
import org.eclipse.uml2.uml.Event;
import org.eclipse.uml2.uml.Operation;
import org.eclipse.uml2.uml.PackageImport;
import org.eclipse.uml2.uml.PackageableElement;
import org.eclipse.uml2.uml.Parameter;
import org.eclipse.uml2.uml.ProtocolTransition;
import org.eclipse.uml2.uml.RedefinableElement;
import org.eclipse.uml2.uml.Region;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.StringExpression;
import org.eclipse.uml2.uml.Transition;
import org.eclipse.uml2.uml.TransitionKind;
import org.eclipse.uml2.uml.Trigger;
import org.eclipse.uml2.uml.Type;
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
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ProtocolTransitionImpl#getOwnedRules <em>Owned Rule</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ProtocolTransitionImpl#getGuard <em>Guard</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ProtocolTransitionImpl#getPostCondition <em>Post Condition</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ProtocolTransitionImpl#getPreCondition <em>Pre Condition</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ProtocolTransitionImpl#getReferreds <em>Referred</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProtocolTransitionImpl
		extends TransitionImpl
		implements ProtocolTransition {

	/**
	 * The cached value of the '{@link #getPostCondition() <em>Post Condition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPostCondition()
	 * @generated
	 * @ordered
	 */
	protected Constraint postCondition;

	/**
	 * The cached value of the '{@link #getPreCondition() <em>Pre Condition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreCondition()
	 * @generated
	 * @ordered
	 */
	protected Constraint preCondition;

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
	@Override
	protected EClass eStaticClass() {
		return UMLPackage.Literals.PROTOCOL_TRANSITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Constraint> getOwnedRules() {
		if (ownedRules == null) {
			ownedRules = new SubsetSupersetEObjectContainmentWithInverseEList.Resolving<Constraint>(
				Constraint.class, this,
				UMLPackage.PROTOCOL_TRANSITION__OWNED_RULE, null,
				OWNED_RULE_ESUBSETS, UMLPackage.CONSTRAINT__CONTEXT);
		}
		return ownedRules;
	}

	/**
	 * The array of subset feature identifiers for the '{@link #getOwnedRules() <em>Owned Rule</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedRules()
	 * @generated
	 * @ordered
	 */
	protected static final int[] OWNED_RULE_ESUBSETS = new int[]{
		UMLPackage.PROTOCOL_TRANSITION__GUARD,
		UMLPackage.PROTOCOL_TRANSITION__POST_CONDITION};

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Constraint getGuard() {
		if (guard != null && guard.eIsProxy()) {
			InternalEObject oldGuard = (InternalEObject) guard;
			guard = (Constraint) eResolveProxy(oldGuard);
			if (guard != oldGuard) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
						UMLPackage.PROTOCOL_TRANSITION__GUARD, oldGuard,
						guard));
			}
		}
		return guard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Constraint basicGetGuard() {
		return guard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGuard(Constraint newGuard) {
		Constraint oldGuard = guard;
		guard = newGuard;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.PROTOCOL_TRANSITION__GUARD, oldGuard, guard));
		Resource.Internal eInternalResource = eInternalResource();
		if (eInternalResource == null || !eInternalResource.isLoading()) {
			if (preCondition != null && preCondition != newGuard) {
				setPreCondition(null);
			}
			if (newGuard != null) {
				EList<Constraint> ownedRules = getOwnedRules();
				if (!ownedRules.contains(newGuard)) {
					ownedRules.add(newGuard);
				}
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Constraint getPostCondition() {
		if (postCondition != null && postCondition.eIsProxy()) {
			InternalEObject oldPostCondition = (InternalEObject) postCondition;
			postCondition = (Constraint) eResolveProxy(oldPostCondition);
			if (postCondition != oldPostCondition) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
						UMLPackage.PROTOCOL_TRANSITION__POST_CONDITION,
						oldPostCondition, postCondition));
			}
		}
		return postCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Constraint basicGetPostCondition() {
		return postCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPostCondition(Constraint newPostCondition) {
		Constraint oldPostCondition = postCondition;
		postCondition = newPostCondition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.PROTOCOL_TRANSITION__POST_CONDITION,
				oldPostCondition, postCondition));
		Resource.Internal eInternalResource = eInternalResource();
		if (eInternalResource == null || !eInternalResource.isLoading()) {
			if (newPostCondition != null) {
				EList<Constraint> ownedRules = getOwnedRules();
				if (!ownedRules.contains(newPostCondition)) {
					ownedRules.add(newPostCondition);
				}
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Constraint createPostCondition(String name, EClass eClass) {
		Constraint newPostCondition = (Constraint) create(eClass);
		setPostCondition(newPostCondition);
		if (name != null)
			newPostCondition.setName(name);
		return newPostCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Constraint createPostCondition(String name) {
		return createPostCondition(name, UMLPackage.Literals.CONSTRAINT);
	}

	protected static class ReferredEList
			extends DerivedEObjectEList<Operation> {

		protected ReferredEList(Class<?> dataClass, InternalEObject owner,
				int featureID, int[] sourceFeatureIDs) {
			super(dataClass, owner, featureID, sourceFeatureIDs);
		}

		@Override
		public List<Operation> basicList() {
			return new ReferredEList(dataClass, owner, featureID,
				sourceFeatureIDs) {

				@Override
				public ListIterator<Operation> listIterator(int index) {
					return basicListIterator(index);
				}
			};
		}

		@Override
		protected boolean isIncluded(EStructuralFeature feature) {
			return false;
		}

		@Override
		protected Operation derive(Object object) {
			Event event = ((Trigger) object).getEvent();
			return event instanceof CallEvent
				? ((CallEvent) event).getOperation()
				: null;
		}

	}

	/**
	 * The array of superset feature identifiers for the '{@link #getReferreds() <em>Referred</em>}' reference list.
	 * @see #getReferreds()
	 */
	protected static final int[] REFERRED_ESUPERSETS = new int[]{
		UMLPackage.PROTOCOL_TRANSITION__TRIGGER};

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<Operation> getReferreds() {
		CacheAdapter cache = getCacheAdapter();
		if (cache != null) {
			Resource eResource = eResource();
			@SuppressWarnings("unchecked")
			EList<Operation> referreds = (EList<Operation>) cache.get(eResource,
				this, UMLPackage.Literals.PROTOCOL_TRANSITION__REFERRED);
			if (referreds == null) {
				cache.put(eResource, this,
					UMLPackage.Literals.PROTOCOL_TRANSITION__REFERRED,
					referreds = new ReferredEList(Operation.class, this,
						UMLPackage.PROTOCOL_TRANSITION__REFERRED,
						REFERRED_ESUPERSETS));
			}
			return referreds;
		}
		return new ReferredEList(Operation.class, this,
			UMLPackage.PROTOCOL_TRANSITION__REFERRED, REFERRED_ESUPERSETS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operation getReferred(String name, EList<String> ownedParameterNames,
			EList<Type> ownedParameterTypes) {
		return getReferred(name, ownedParameterNames, ownedParameterTypes,
			false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operation getReferred(String name, EList<String> ownedParameterNames,
			EList<Type> ownedParameterTypes, boolean ignoreCase) {
		referredLoop : for (Operation referred : getReferreds()) {
			if (name != null && !(ignoreCase
				? name.equalsIgnoreCase(referred.getName())
				: name.equals(referred.getName())))
				continue referredLoop;
			EList<Parameter> ownedParameterList = referred.getOwnedParameters();
			int ownedParameterListSize = ownedParameterList.size();
			if (ownedParameterNames != null
				&& ownedParameterNames.size() != ownedParameterListSize
				|| (ownedParameterTypes != null
					&& ownedParameterTypes.size() != ownedParameterListSize))
				continue referredLoop;
			for (int j = 0; j < ownedParameterListSize; j++) {
				Parameter ownedParameter = ownedParameterList.get(j);
				if (ownedParameterNames != null && !(ignoreCase
					? (ownedParameterNames.get(j))
						.equalsIgnoreCase(ownedParameter.getName())
					: ownedParameterNames.get(j)
						.equals(ownedParameter.getName())))
					continue referredLoop;
				if (ownedParameterTypes != null && !ownedParameterTypes.get(j)
					.equals(ownedParameter.getType()))
					continue referredLoop;
			}
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
		if (preCondition != null && preCondition.eIsProxy()) {
			InternalEObject oldPreCondition = (InternalEObject) preCondition;
			preCondition = (Constraint) eResolveProxy(oldPreCondition);
			if (preCondition != oldPreCondition) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
						UMLPackage.PROTOCOL_TRANSITION__PRE_CONDITION,
						oldPreCondition, preCondition));
			}
		}
		return preCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Constraint basicGetPreCondition() {
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
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.PROTOCOL_TRANSITION__PRE_CONDITION, oldPreCondition,
				preCondition));
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
	public boolean validateBelongsToPsm(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ProtocolTransitionOperations.validateBelongsToPsm(this,
			diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssociatedActions(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ProtocolTransitionOperations.validateAssociatedActions(this,
			diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRefersToOperation(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ProtocolTransitionOperations.validateRefersToOperation(this,
			diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UMLPackage.PROTOCOL_TRANSITION__EANNOTATIONS :
				return ((InternalEList<InternalEObject>) (InternalEList<?>) getEAnnotations())
					.basicAdd(otherEnd, msgs);
			case UMLPackage.PROTOCOL_TRANSITION__OWNED_RULE :
				return ((InternalEList<InternalEObject>) (InternalEList<?>) getOwnedRules())
					.basicAdd(otherEnd, msgs);
			case UMLPackage.PROTOCOL_TRANSITION__ELEMENT_IMPORT :
				return ((InternalEList<InternalEObject>) (InternalEList<?>) getElementImports())
					.basicAdd(otherEnd, msgs);
			case UMLPackage.PROTOCOL_TRANSITION__PACKAGE_IMPORT :
				return ((InternalEList<InternalEObject>) (InternalEList<?>) getPackageImports())
					.basicAdd(otherEnd, msgs);
			case UMLPackage.PROTOCOL_TRANSITION__CONTAINER :
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetContainer((Region) otherEnd, msgs);
		}
		return eDynamicInverseAdd(otherEnd, featureID, msgs);
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
			case UMLPackage.PROTOCOL_TRANSITION__EANNOTATIONS :
				return ((InternalEList<?>) getEAnnotations())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.PROTOCOL_TRANSITION__OWNED_COMMENT :
				return ((InternalEList<?>) getOwnedComments())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.PROTOCOL_TRANSITION__NAME_EXPRESSION :
				return basicSetNameExpression(null, msgs);
			case UMLPackage.PROTOCOL_TRANSITION__OWNED_RULE :
				return ((InternalEList<?>) getOwnedRules())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.PROTOCOL_TRANSITION__ELEMENT_IMPORT :
				return ((InternalEList<?>) getElementImports())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.PROTOCOL_TRANSITION__PACKAGE_IMPORT :
				return ((InternalEList<?>) getPackageImports())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.PROTOCOL_TRANSITION__EFFECT :
				return basicSetEffect(null, msgs);
			case UMLPackage.PROTOCOL_TRANSITION__TRIGGER :
				return ((InternalEList<?>) getTriggers()).basicRemove(otherEnd,
					msgs);
			case UMLPackage.PROTOCOL_TRANSITION__CONTAINER :
				return basicSetContainer(null, msgs);
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
			case UMLPackage.PROTOCOL_TRANSITION__EANNOTATIONS :
				return getEAnnotations();
			case UMLPackage.PROTOCOL_TRANSITION__OWNED_COMMENT :
				return getOwnedComments();
			case UMLPackage.PROTOCOL_TRANSITION__OWNED_ELEMENT :
				return getOwnedElements();
			case UMLPackage.PROTOCOL_TRANSITION__OWNER :
				if (resolve)
					return getOwner();
				return basicGetOwner();
			case UMLPackage.PROTOCOL_TRANSITION__CLIENT_DEPENDENCY :
				return getClientDependencies();
			case UMLPackage.PROTOCOL_TRANSITION__NAME :
				return getName();
			case UMLPackage.PROTOCOL_TRANSITION__NAME_EXPRESSION :
				if (resolve)
					return getNameExpression();
				return basicGetNameExpression();
			case UMLPackage.PROTOCOL_TRANSITION__NAMESPACE :
				if (resolve)
					return getNamespace();
				return basicGetNamespace();
			case UMLPackage.PROTOCOL_TRANSITION__QUALIFIED_NAME :
				return getQualifiedName();
			case UMLPackage.PROTOCOL_TRANSITION__VISIBILITY :
				return getVisibility();
			case UMLPackage.PROTOCOL_TRANSITION__OWNED_RULE :
				return getOwnedRules();
			case UMLPackage.PROTOCOL_TRANSITION__ELEMENT_IMPORT :
				return getElementImports();
			case UMLPackage.PROTOCOL_TRANSITION__PACKAGE_IMPORT :
				return getPackageImports();
			case UMLPackage.PROTOCOL_TRANSITION__OWNED_MEMBER :
				return getOwnedMembers();
			case UMLPackage.PROTOCOL_TRANSITION__IMPORTED_MEMBER :
				return getImportedMembers();
			case UMLPackage.PROTOCOL_TRANSITION__MEMBER :
				return getMembers();
			case UMLPackage.PROTOCOL_TRANSITION__IS_LEAF :
				return isLeaf();
			case UMLPackage.PROTOCOL_TRANSITION__REDEFINED_ELEMENT :
				return getRedefinedElements();
			case UMLPackage.PROTOCOL_TRANSITION__REDEFINITION_CONTEXT :
				return getRedefinitionContexts();
			case UMLPackage.PROTOCOL_TRANSITION__EFFECT :
				if (resolve)
					return getEffect();
				return basicGetEffect();
			case UMLPackage.PROTOCOL_TRANSITION__GUARD :
				if (resolve)
					return getGuard();
				return basicGetGuard();
			case UMLPackage.PROTOCOL_TRANSITION__KIND :
				return getKind();
			case UMLPackage.PROTOCOL_TRANSITION__REDEFINED_TRANSITION :
				if (resolve)
					return getRedefinedTransition();
				return basicGetRedefinedTransition();
			case UMLPackage.PROTOCOL_TRANSITION__SOURCE :
				if (resolve)
					return getSource();
				return basicGetSource();
			case UMLPackage.PROTOCOL_TRANSITION__TARGET :
				if (resolve)
					return getTarget();
				return basicGetTarget();
			case UMLPackage.PROTOCOL_TRANSITION__TRIGGER :
				return getTriggers();
			case UMLPackage.PROTOCOL_TRANSITION__CONTAINER :
				if (resolve)
					return getContainer();
				return basicGetContainer();
			case UMLPackage.PROTOCOL_TRANSITION__POST_CONDITION :
				if (resolve)
					return getPostCondition();
				return basicGetPostCondition();
			case UMLPackage.PROTOCOL_TRANSITION__PRE_CONDITION :
				if (resolve)
					return getPreCondition();
				return basicGetPreCondition();
			case UMLPackage.PROTOCOL_TRANSITION__REFERRED :
				return getReferreds();
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
			case UMLPackage.PROTOCOL_TRANSITION__EANNOTATIONS :
				getEAnnotations().clear();
				getEAnnotations()
					.addAll((Collection<? extends EAnnotation>) newValue);
				return;
			case UMLPackage.PROTOCOL_TRANSITION__OWNED_COMMENT :
				getOwnedComments().clear();
				getOwnedComments()
					.addAll((Collection<? extends Comment>) newValue);
				return;
			case UMLPackage.PROTOCOL_TRANSITION__NAME :
				setName((String) newValue);
				return;
			case UMLPackage.PROTOCOL_TRANSITION__NAME_EXPRESSION :
				setNameExpression((StringExpression) newValue);
				return;
			case UMLPackage.PROTOCOL_TRANSITION__VISIBILITY :
				setVisibility((VisibilityKind) newValue);
				return;
			case UMLPackage.PROTOCOL_TRANSITION__OWNED_RULE :
				getOwnedRules().clear();
				getOwnedRules()
					.addAll((Collection<? extends Constraint>) newValue);
				return;
			case UMLPackage.PROTOCOL_TRANSITION__ELEMENT_IMPORT :
				getElementImports().clear();
				getElementImports()
					.addAll((Collection<? extends ElementImport>) newValue);
				return;
			case UMLPackage.PROTOCOL_TRANSITION__PACKAGE_IMPORT :
				getPackageImports().clear();
				getPackageImports()
					.addAll((Collection<? extends PackageImport>) newValue);
				return;
			case UMLPackage.PROTOCOL_TRANSITION__IS_LEAF :
				setIsLeaf((Boolean) newValue);
				return;
			case UMLPackage.PROTOCOL_TRANSITION__EFFECT :
				setEffect((Behavior) newValue);
				return;
			case UMLPackage.PROTOCOL_TRANSITION__GUARD :
				setGuard((Constraint) newValue);
				return;
			case UMLPackage.PROTOCOL_TRANSITION__KIND :
				setKind((TransitionKind) newValue);
				return;
			case UMLPackage.PROTOCOL_TRANSITION__REDEFINED_TRANSITION :
				setRedefinedTransition((Transition) newValue);
				return;
			case UMLPackage.PROTOCOL_TRANSITION__SOURCE :
				setSource((Vertex) newValue);
				return;
			case UMLPackage.PROTOCOL_TRANSITION__TARGET :
				setTarget((Vertex) newValue);
				return;
			case UMLPackage.PROTOCOL_TRANSITION__TRIGGER :
				getTriggers().clear();
				getTriggers().addAll((Collection<? extends Trigger>) newValue);
				return;
			case UMLPackage.PROTOCOL_TRANSITION__CONTAINER :
				setContainer((Region) newValue);
				return;
			case UMLPackage.PROTOCOL_TRANSITION__POST_CONDITION :
				setPostCondition((Constraint) newValue);
				return;
			case UMLPackage.PROTOCOL_TRANSITION__PRE_CONDITION :
				setPreCondition((Constraint) newValue);
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
			case UMLPackage.PROTOCOL_TRANSITION__EANNOTATIONS :
				getEAnnotations().clear();
				return;
			case UMLPackage.PROTOCOL_TRANSITION__OWNED_COMMENT :
				getOwnedComments().clear();
				return;
			case UMLPackage.PROTOCOL_TRANSITION__NAME :
				unsetName();
				return;
			case UMLPackage.PROTOCOL_TRANSITION__NAME_EXPRESSION :
				setNameExpression((StringExpression) null);
				return;
			case UMLPackage.PROTOCOL_TRANSITION__VISIBILITY :
				unsetVisibility();
				return;
			case UMLPackage.PROTOCOL_TRANSITION__OWNED_RULE :
				getOwnedRules().clear();
				return;
			case UMLPackage.PROTOCOL_TRANSITION__ELEMENT_IMPORT :
				getElementImports().clear();
				return;
			case UMLPackage.PROTOCOL_TRANSITION__PACKAGE_IMPORT :
				getPackageImports().clear();
				return;
			case UMLPackage.PROTOCOL_TRANSITION__IS_LEAF :
				setIsLeaf(IS_LEAF_EDEFAULT);
				return;
			case UMLPackage.PROTOCOL_TRANSITION__EFFECT :
				setEffect((Behavior) null);
				return;
			case UMLPackage.PROTOCOL_TRANSITION__GUARD :
				setGuard((Constraint) null);
				return;
			case UMLPackage.PROTOCOL_TRANSITION__KIND :
				setKind(KIND_EDEFAULT);
				return;
			case UMLPackage.PROTOCOL_TRANSITION__REDEFINED_TRANSITION :
				setRedefinedTransition((Transition) null);
				return;
			case UMLPackage.PROTOCOL_TRANSITION__SOURCE :
				setSource((Vertex) null);
				return;
			case UMLPackage.PROTOCOL_TRANSITION__TARGET :
				setTarget((Vertex) null);
				return;
			case UMLPackage.PROTOCOL_TRANSITION__TRIGGER :
				getTriggers().clear();
				return;
			case UMLPackage.PROTOCOL_TRANSITION__CONTAINER :
				setContainer((Region) null);
				return;
			case UMLPackage.PROTOCOL_TRANSITION__POST_CONDITION :
				setPostCondition((Constraint) null);
				return;
			case UMLPackage.PROTOCOL_TRANSITION__PRE_CONDITION :
				setPreCondition((Constraint) null);
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
			case UMLPackage.PROTOCOL_TRANSITION__EANNOTATIONS :
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UMLPackage.PROTOCOL_TRANSITION__OWNED_COMMENT :
				return ownedComments != null && !ownedComments.isEmpty();
			case UMLPackage.PROTOCOL_TRANSITION__OWNED_ELEMENT :
				return isSetOwnedElements();
			case UMLPackage.PROTOCOL_TRANSITION__OWNER :
				return isSetOwner();
			case UMLPackage.PROTOCOL_TRANSITION__CLIENT_DEPENDENCY :
				return !getClientDependencies().isEmpty();
			case UMLPackage.PROTOCOL_TRANSITION__NAME :
				return isSetName();
			case UMLPackage.PROTOCOL_TRANSITION__NAME_EXPRESSION :
				return nameExpression != null;
			case UMLPackage.PROTOCOL_TRANSITION__NAMESPACE :
				return isSetNamespace();
			case UMLPackage.PROTOCOL_TRANSITION__QUALIFIED_NAME :
				return QUALIFIED_NAME_EDEFAULT == null
					? getQualifiedName() != null
					: !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case UMLPackage.PROTOCOL_TRANSITION__VISIBILITY :
				return isSetVisibility();
			case UMLPackage.PROTOCOL_TRANSITION__OWNED_RULE :
				return ownedRules != null && !ownedRules.isEmpty();
			case UMLPackage.PROTOCOL_TRANSITION__ELEMENT_IMPORT :
				return elementImports != null && !elementImports.isEmpty();
			case UMLPackage.PROTOCOL_TRANSITION__PACKAGE_IMPORT :
				return packageImports != null && !packageImports.isEmpty();
			case UMLPackage.PROTOCOL_TRANSITION__OWNED_MEMBER :
				return isSetOwnedMembers();
			case UMLPackage.PROTOCOL_TRANSITION__IMPORTED_MEMBER :
				return !getImportedMembers().isEmpty();
			case UMLPackage.PROTOCOL_TRANSITION__MEMBER :
				return isSetMembers();
			case UMLPackage.PROTOCOL_TRANSITION__IS_LEAF :
				return ((eFlags & IS_LEAF_EFLAG) != 0) != IS_LEAF_EDEFAULT;
			case UMLPackage.PROTOCOL_TRANSITION__REDEFINED_ELEMENT :
				return isSetRedefinedElements();
			case UMLPackage.PROTOCOL_TRANSITION__REDEFINITION_CONTEXT :
				return isSetRedefinitionContexts();
			case UMLPackage.PROTOCOL_TRANSITION__EFFECT :
				return effect != null;
			case UMLPackage.PROTOCOL_TRANSITION__GUARD :
				return guard != null;
			case UMLPackage.PROTOCOL_TRANSITION__KIND :
				return (eFlags & KIND_EFLAG) != KIND_EFLAG_DEFAULT;
			case UMLPackage.PROTOCOL_TRANSITION__REDEFINED_TRANSITION :
				return redefinedTransition != null;
			case UMLPackage.PROTOCOL_TRANSITION__SOURCE :
				return source != null;
			case UMLPackage.PROTOCOL_TRANSITION__TARGET :
				return target != null;
			case UMLPackage.PROTOCOL_TRANSITION__TRIGGER :
				return triggers != null && !triggers.isEmpty();
			case UMLPackage.PROTOCOL_TRANSITION__CONTAINER :
				return basicGetContainer() != null;
			case UMLPackage.PROTOCOL_TRANSITION__POST_CONDITION :
				return postCondition != null;
			case UMLPackage.PROTOCOL_TRANSITION__PRE_CONDITION :
				return preCondition != null;
			case UMLPackage.PROTOCOL_TRANSITION__REFERRED :
				return !getReferreds().isEmpty();
		}
		return eDynamicIsSet(featureID);
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
			case UMLPackage.PROTOCOL_TRANSITION___GET_EANNOTATION__STRING :
				return getEAnnotation((String) arguments.get(0));
			case UMLPackage.PROTOCOL_TRANSITION___VALIDATE_HAS_OWNER__DIAGNOSTICCHAIN_MAP :
				return validateHasOwner((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.PROTOCOL_TRANSITION___VALIDATE_NOT_OWN_SELF__DIAGNOSTICCHAIN_MAP :
				return validateNotOwnSelf((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.PROTOCOL_TRANSITION___ADD_KEYWORD__STRING :
				return addKeyword((String) arguments.get(0));
			case UMLPackage.PROTOCOL_TRANSITION___APPLY_STEREOTYPE__STEREOTYPE :
				return applyStereotype((Stereotype) arguments.get(0));
			case UMLPackage.PROTOCOL_TRANSITION___CREATE_EANNOTATION__STRING :
				return createEAnnotation((String) arguments.get(0));
			case UMLPackage.PROTOCOL_TRANSITION___DESTROY :
				destroy();
				return null;
			case UMLPackage.PROTOCOL_TRANSITION___GET_KEYWORDS :
				return getKeywords();
			case UMLPackage.PROTOCOL_TRANSITION___GET_APPLICABLE_STEREOTYPE__STRING :
				return getApplicableStereotype((String) arguments.get(0));
			case UMLPackage.PROTOCOL_TRANSITION___GET_APPLICABLE_STEREOTYPES :
				return getApplicableStereotypes();
			case UMLPackage.PROTOCOL_TRANSITION___GET_APPLIED_STEREOTYPE__STRING :
				return getAppliedStereotype((String) arguments.get(0));
			case UMLPackage.PROTOCOL_TRANSITION___GET_APPLIED_STEREOTYPES :
				return getAppliedStereotypes();
			case UMLPackage.PROTOCOL_TRANSITION___GET_APPLIED_SUBSTEREOTYPE__STEREOTYPE_STRING :
				return getAppliedSubstereotype((Stereotype) arguments.get(0),
					(String) arguments.get(1));
			case UMLPackage.PROTOCOL_TRANSITION___GET_APPLIED_SUBSTEREOTYPES__STEREOTYPE :
				return getAppliedSubstereotypes((Stereotype) arguments.get(0));
			case UMLPackage.PROTOCOL_TRANSITION___GET_MODEL :
				return getModel();
			case UMLPackage.PROTOCOL_TRANSITION___GET_NEAREST_PACKAGE :
				return getNearestPackage();
			case UMLPackage.PROTOCOL_TRANSITION___GET_RELATIONSHIPS :
				return getRelationships();
			case UMLPackage.PROTOCOL_TRANSITION___GET_RELATIONSHIPS__ECLASS :
				return getRelationships((EClass) arguments.get(0));
			case UMLPackage.PROTOCOL_TRANSITION___GET_REQUIRED_STEREOTYPE__STRING :
				return getRequiredStereotype((String) arguments.get(0));
			case UMLPackage.PROTOCOL_TRANSITION___GET_REQUIRED_STEREOTYPES :
				return getRequiredStereotypes();
			case UMLPackage.PROTOCOL_TRANSITION___GET_SOURCE_DIRECTED_RELATIONSHIPS :
				return getSourceDirectedRelationships();
			case UMLPackage.PROTOCOL_TRANSITION___GET_SOURCE_DIRECTED_RELATIONSHIPS__ECLASS :
				return getSourceDirectedRelationships(
					(EClass) arguments.get(0));
			case UMLPackage.PROTOCOL_TRANSITION___GET_STEREOTYPE_APPLICATION__STEREOTYPE :
				return getStereotypeApplication((Stereotype) arguments.get(0));
			case UMLPackage.PROTOCOL_TRANSITION___GET_STEREOTYPE_APPLICATIONS :
				return getStereotypeApplications();
			case UMLPackage.PROTOCOL_TRANSITION___GET_TARGET_DIRECTED_RELATIONSHIPS :
				return getTargetDirectedRelationships();
			case UMLPackage.PROTOCOL_TRANSITION___GET_TARGET_DIRECTED_RELATIONSHIPS__ECLASS :
				return getTargetDirectedRelationships(
					(EClass) arguments.get(0));
			case UMLPackage.PROTOCOL_TRANSITION___GET_VALUE__STEREOTYPE_STRING :
				return getValue((Stereotype) arguments.get(0),
					(String) arguments.get(1));
			case UMLPackage.PROTOCOL_TRANSITION___HAS_KEYWORD__STRING :
				return hasKeyword((String) arguments.get(0));
			case UMLPackage.PROTOCOL_TRANSITION___HAS_VALUE__STEREOTYPE_STRING :
				return hasValue((Stereotype) arguments.get(0),
					(String) arguments.get(1));
			case UMLPackage.PROTOCOL_TRANSITION___IS_STEREOTYPE_APPLICABLE__STEREOTYPE :
				return isStereotypeApplicable((Stereotype) arguments.get(0));
			case UMLPackage.PROTOCOL_TRANSITION___IS_STEREOTYPE_APPLIED__STEREOTYPE :
				return isStereotypeApplied((Stereotype) arguments.get(0));
			case UMLPackage.PROTOCOL_TRANSITION___IS_STEREOTYPE_REQUIRED__STEREOTYPE :
				return isStereotypeRequired((Stereotype) arguments.get(0));
			case UMLPackage.PROTOCOL_TRANSITION___REMOVE_KEYWORD__STRING :
				return removeKeyword((String) arguments.get(0));
			case UMLPackage.PROTOCOL_TRANSITION___SET_VALUE__STEREOTYPE_STRING_OBJECT :
				setValue((Stereotype) arguments.get(0),
					(String) arguments.get(1), arguments.get(2));
				return null;
			case UMLPackage.PROTOCOL_TRANSITION___UNAPPLY_STEREOTYPE__STEREOTYPE :
				return unapplyStereotype((Stereotype) arguments.get(0));
			case UMLPackage.PROTOCOL_TRANSITION___ALL_OWNED_ELEMENTS :
				return allOwnedElements();
			case UMLPackage.PROTOCOL_TRANSITION___MUST_BE_OWNED :
				return mustBeOwned();
			case UMLPackage.PROTOCOL_TRANSITION___VALIDATE_VISIBILITY_NEEDS_OWNERSHIP__DIAGNOSTICCHAIN_MAP :
				return validateVisibilityNeedsOwnership(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.PROTOCOL_TRANSITION___VALIDATE_HAS_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP :
				return validateHasQualifiedName(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.PROTOCOL_TRANSITION___VALIDATE_HAS_NO_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP :
				return validateHasNoQualifiedName(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.PROTOCOL_TRANSITION___CREATE_DEPENDENCY__NAMEDELEMENT :
				return createDependency((NamedElement) arguments.get(0));
			case UMLPackage.PROTOCOL_TRANSITION___CREATE_USAGE__NAMEDELEMENT :
				return createUsage((NamedElement) arguments.get(0));
			case UMLPackage.PROTOCOL_TRANSITION___GET_LABEL :
				return getLabel();
			case UMLPackage.PROTOCOL_TRANSITION___GET_LABEL__BOOLEAN :
				return getLabel((Boolean) arguments.get(0));
			case UMLPackage.PROTOCOL_TRANSITION___GET_NAMESPACE :
				return getNamespace();
			case UMLPackage.PROTOCOL_TRANSITION___ALL_NAMESPACES :
				return allNamespaces();
			case UMLPackage.PROTOCOL_TRANSITION___ALL_OWNING_PACKAGES :
				return allOwningPackages();
			case UMLPackage.PROTOCOL_TRANSITION___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE :
				return isDistinguishableFrom((NamedElement) arguments.get(0),
					(Namespace) arguments.get(1));
			case UMLPackage.PROTOCOL_TRANSITION___GET_QUALIFIED_NAME :
				return getQualifiedName();
			case UMLPackage.PROTOCOL_TRANSITION___SEPARATOR :
				return separator();
			case UMLPackage.PROTOCOL_TRANSITION___GET_CLIENT_DEPENDENCIES :
				return getClientDependencies();
			case UMLPackage.PROTOCOL_TRANSITION___VALIDATE_MEMBERS_DISTINGUISHABLE__DIAGNOSTICCHAIN_MAP :
				return validateMembersDistinguishable(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.PROTOCOL_TRANSITION___VALIDATE_CANNOT_IMPORT_SELF__DIAGNOSTICCHAIN_MAP :
				return validateCannotImportSelf(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.PROTOCOL_TRANSITION___VALIDATE_CANNOT_IMPORT_OWNED_MEMBERS__DIAGNOSTICCHAIN_MAP :
				return validateCannotImportOwnedMembers(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.PROTOCOL_TRANSITION___CREATE_ELEMENT_IMPORT__PACKAGEABLEELEMENT_VISIBILITYKIND :
				return createElementImport(
					(PackageableElement) arguments.get(0),
					(VisibilityKind) arguments.get(1));
			case UMLPackage.PROTOCOL_TRANSITION___CREATE_PACKAGE_IMPORT__PACKAGE_VISIBILITYKIND :
				return createPackageImport(
					(org.eclipse.uml2.uml.Package) arguments.get(0),
					(VisibilityKind) arguments.get(1));
			case UMLPackage.PROTOCOL_TRANSITION___GET_IMPORTED_ELEMENTS :
				return getImportedElements();
			case UMLPackage.PROTOCOL_TRANSITION___GET_IMPORTED_PACKAGES :
				return getImportedPackages();
			case UMLPackage.PROTOCOL_TRANSITION___GET_OWNED_MEMBERS :
				return getOwnedMembers();
			case UMLPackage.PROTOCOL_TRANSITION___EXCLUDE_COLLISIONS__ELIST :
				return excludeCollisions(
					(EList<PackageableElement>) arguments.get(0));
			case UMLPackage.PROTOCOL_TRANSITION___GET_NAMES_OF_MEMBER__NAMEDELEMENT :
				return getNamesOfMember((NamedElement) arguments.get(0));
			case UMLPackage.PROTOCOL_TRANSITION___IMPORT_MEMBERS__ELIST :
				return importMembers(
					(EList<PackageableElement>) arguments.get(0));
			case UMLPackage.PROTOCOL_TRANSITION___GET_IMPORTED_MEMBERS :
				return getImportedMembers();
			case UMLPackage.PROTOCOL_TRANSITION___MEMBERS_ARE_DISTINGUISHABLE :
				return membersAreDistinguishable();
			case UMLPackage.PROTOCOL_TRANSITION___VALIDATE_REDEFINITION_CONSISTENT__DIAGNOSTICCHAIN_MAP :
				return validateRedefinitionConsistent(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.PROTOCOL_TRANSITION___VALIDATE_NON_LEAF_REDEFINITION__DIAGNOSTICCHAIN_MAP :
				return validateNonLeafRedefinition(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.PROTOCOL_TRANSITION___VALIDATE_REDEFINITION_CONTEXT_VALID__DIAGNOSTICCHAIN_MAP :
				return validateRedefinitionContextValid(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.PROTOCOL_TRANSITION___IS_CONSISTENT_WITH__REDEFINABLEELEMENT :
				return isConsistentWith((RedefinableElement) arguments.get(0));
			case UMLPackage.PROTOCOL_TRANSITION___IS_REDEFINITION_CONTEXT_VALID__REDEFINABLEELEMENT :
				return isRedefinitionContextValid(
					(RedefinableElement) arguments.get(0));
			case UMLPackage.PROTOCOL_TRANSITION___VALIDATE_STATE_IS_EXTERNAL__DIAGNOSTICCHAIN_MAP :
				return validateStateIsExternal(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.PROTOCOL_TRANSITION___VALIDATE_JOIN_SEGMENT_GUARDS__DIAGNOSTICCHAIN_MAP :
				return validateJoinSegmentGuards(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.PROTOCOL_TRANSITION___VALIDATE_STATE_IS_INTERNAL__DIAGNOSTICCHAIN_MAP :
				return validateStateIsInternal(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.PROTOCOL_TRANSITION___VALIDATE_OUTGOING_PSEUDOSTATES__DIAGNOSTICCHAIN_MAP :
				return validateOutgoingPseudostates(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.PROTOCOL_TRANSITION___VALIDATE_JOIN_SEGMENT_STATE__DIAGNOSTICCHAIN_MAP :
				return validateJoinSegmentState(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.PROTOCOL_TRANSITION___VALIDATE_FORK_SEGMENT_STATE__DIAGNOSTICCHAIN_MAP :
				return validateForkSegmentState(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.PROTOCOL_TRANSITION___VALIDATE_STATE_IS_LOCAL__DIAGNOSTICCHAIN_MAP :
				return validateStateIsLocal((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.PROTOCOL_TRANSITION___VALIDATE_INITIAL_TRANSITION__DIAGNOSTICCHAIN_MAP :
				return validateInitialTransition(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.PROTOCOL_TRANSITION___VALIDATE_FORK_SEGMENT_GUARDS__DIAGNOSTICCHAIN_MAP :
				return validateForkSegmentGuards(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.PROTOCOL_TRANSITION___CONTAINING_STATE_MACHINE :
				return containingStateMachine();
			case UMLPackage.PROTOCOL_TRANSITION___REDEFINITION_CONTEXT :
				return redefinitionContext();
			case UMLPackage.PROTOCOL_TRANSITION___VALIDATE_REFERS_TO_OPERATION__DIAGNOSTICCHAIN_MAP :
				return validateRefersToOperation(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.PROTOCOL_TRANSITION___VALIDATE_ASSOCIATED_ACTIONS__DIAGNOSTICCHAIN_MAP :
				return validateAssociatedActions(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.PROTOCOL_TRANSITION___VALIDATE_BELONGS_TO_PSM__DIAGNOSTICCHAIN_MAP :
				return validateBelongsToPsm((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.PROTOCOL_TRANSITION___GET_REFERREDS :
				return getReferreds();
		}
		return eDynamicInvoke(operationID, arguments);
	}

} //ProtocolTransitionImpl
