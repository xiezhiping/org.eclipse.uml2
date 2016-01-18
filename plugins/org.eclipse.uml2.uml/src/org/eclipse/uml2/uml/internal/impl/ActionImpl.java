/*
 * Copyright (c) 2005, 2016 IBM Corporation, CEA, and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
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

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.uml2.common.util.CacheAdapter;
import org.eclipse.uml2.common.util.DerivedUnionEObjectEList;

import org.eclipse.uml2.uml.Action;
import org.eclipse.uml2.uml.Activity;
import org.eclipse.uml2.uml.ActivityEdge;
import org.eclipse.uml2.uml.ActivityNode;
import org.eclipse.uml2.uml.ActivityPartition;
import org.eclipse.uml2.uml.Behavior;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.Comment;
import org.eclipse.uml2.uml.Constraint;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.ExceptionHandler;
import org.eclipse.uml2.uml.InputPin;
import org.eclipse.uml2.uml.InterruptibleActivityRegion;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Namespace;
import org.eclipse.uml2.uml.OutputPin;
import org.eclipse.uml2.uml.RedefinableElement;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.StringExpression;
import org.eclipse.uml2.uml.StructuredActivityNode;
import org.eclipse.uml2.uml.Type;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.VisibilityKind;
import org.eclipse.uml2.uml.internal.operations.ActionOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ActionImpl#getInputs <em>Input</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ActionImpl#getOwnedElements <em>Owned Element</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ActionImpl#getOutputs <em>Output</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ActionImpl#getContext <em>Context</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ActionImpl#isLocallyReentrant <em>Is Locally Reentrant</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ActionImpl#getLocalPostconditions <em>Local Postcondition</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ActionImpl#getLocalPreconditions <em>Local Precondition</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ActionImpl
		extends ExecutableNodeImpl
		implements Action {

	/**
	 * The default value of the '{@link #isLocallyReentrant() <em>Is Locally Reentrant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isLocallyReentrant()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_LOCALLY_REENTRANT_EDEFAULT = false;

	/**
	 * The flag representing the value of the '{@link #isLocallyReentrant() <em>Is Locally Reentrant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isLocallyReentrant()
	 * @generated
	 * @ordered
	 */
	protected static final int IS_LOCALLY_REENTRANT_EFLAG = 1 << 13;

	/**
	 * The cached value of the '{@link #getLocalPostconditions() <em>Local Postcondition</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocalPostconditions()
	 * @generated
	 * @ordered
	 */
	protected EList<Constraint> localPostconditions;

	/**
	 * The cached value of the '{@link #getLocalPreconditions() <em>Local Precondition</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocalPreconditions()
	 * @generated
	 * @ordered
	 */
	protected EList<Constraint> localPreconditions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UMLPackage.Literals.ACTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OutputPin> getOutputs() {
		CacheAdapter cache = getCacheAdapter();
		if (cache != null) {
			Resource eResource = eResource();
			@SuppressWarnings("unchecked")
			EList<OutputPin> outputs = (EList<OutputPin>) cache.get(eResource,
				this, UMLPackage.Literals.ACTION__OUTPUT);
			if (outputs == null) {
				cache.put(eResource, this, UMLPackage.Literals.ACTION__OUTPUT,
					outputs = new DerivedUnionEObjectEList<OutputPin>(
						OutputPin.class, this, UMLPackage.ACTION__OUTPUT,
						null));
			}
			return outputs;
		}
		return new DerivedUnionEObjectEList<OutputPin>(OutputPin.class, this,
			UMLPackage.ACTION__OUTPUT, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutputPin getOutput(String name, Type type) {
		return getOutput(name, type, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutputPin getOutput(String name, Type type, boolean ignoreCase) {
		outputLoop : for (OutputPin output : getOutputs()) {
			if (name != null && !(ignoreCase
				? name.equalsIgnoreCase(output.getName())
				: name.equals(output.getName())))
				continue outputLoop;
			if (type != null && !type.equals(output.getType()))
				continue outputLoop;
			return output;
		}
		return null;
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
		UMLPackage.ACTION__OWNED_COMMENT, UMLPackage.ACTION__NAME_EXPRESSION,
		UMLPackage.ACTION__HANDLER, UMLPackage.ACTION__INPUT,
		UMLPackage.ACTION__LOCAL_POSTCONDITION,
		UMLPackage.ACTION__LOCAL_PRECONDITION, UMLPackage.ACTION__OUTPUT};

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
						Element.class, this, UMLPackage.ACTION__OWNED_ELEMENT,
						OWNED_ELEMENT_ESUBSETS));
			}
			return ownedElements;
		}
		return new DerivedUnionEObjectEList<Element>(Element.class, this,
			UMLPackage.ACTION__OWNED_ELEMENT, OWNED_ELEMENT_ESUBSETS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InputPin> getInputs() {
		CacheAdapter cache = getCacheAdapter();
		if (cache != null) {
			Resource eResource = eResource();
			@SuppressWarnings("unchecked")
			EList<InputPin> inputs = (EList<InputPin>) cache.get(eResource,
				this, UMLPackage.Literals.ACTION__INPUT);
			if (inputs == null) {
				cache
					.put(eResource, this, UMLPackage.Literals.ACTION__INPUT,
						inputs = new DerivedUnionEObjectEList<InputPin>(
							InputPin.class, this, UMLPackage.ACTION__INPUT,
							null));
			}
			return inputs;
		}
		return new DerivedUnionEObjectEList<InputPin>(InputPin.class, this,
			UMLPackage.ACTION__INPUT, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputPin getInput(String name, Type type) {
		return getInput(name, type, false, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputPin getInput(String name, Type type, boolean ignoreCase,
			EClass eClass) {
		inputLoop : for (InputPin input : getInputs()) {
			if (eClass != null && !eClass.isInstance(input))
				continue inputLoop;
			if (name != null && !(ignoreCase
				? name.equalsIgnoreCase(input.getName())
				: name.equals(input.getName())))
				continue inputLoop;
			if (type != null && !type.equals(input.getType()))
				continue inputLoop;
			return input;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Classifier getContext() {
		Classifier context = basicGetContext();
		return context != null && context.eIsProxy()
			? (Classifier) eResolveProxy((InternalEObject) context)
			: context;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Classifier basicGetContext() {
		return ActionOperations.getContext(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isLocallyReentrant() {
		return (eFlags & IS_LOCALLY_REENTRANT_EFLAG) != 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsLocallyReentrant(boolean newIsLocallyReentrant) {
		boolean oldIsLocallyReentrant = (eFlags
			& IS_LOCALLY_REENTRANT_EFLAG) != 0;
		if (newIsLocallyReentrant)
			eFlags |= IS_LOCALLY_REENTRANT_EFLAG;
		else
			eFlags &= ~IS_LOCALLY_REENTRANT_EFLAG;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.ACTION__IS_LOCALLY_REENTRANT, oldIsLocallyReentrant,
				newIsLocallyReentrant));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Constraint> getLocalPreconditions() {
		if (localPreconditions == null) {
			localPreconditions = new EObjectContainmentEList.Resolving<Constraint>(
				Constraint.class, this, UMLPackage.ACTION__LOCAL_PRECONDITION);
		}
		return localPreconditions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Constraint createLocalPrecondition(String name, EClass eClass) {
		Constraint newLocalPrecondition = (Constraint) create(eClass);
		getLocalPreconditions().add(newLocalPrecondition);
		if (name != null)
			newLocalPrecondition.setName(name);
		return newLocalPrecondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Constraint createLocalPrecondition(String name) {
		return createLocalPrecondition(name, UMLPackage.Literals.CONSTRAINT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Constraint getLocalPrecondition(String name) {
		return getLocalPrecondition(name, false, null, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Constraint getLocalPrecondition(String name, boolean ignoreCase,
			EClass eClass, boolean createOnDemand) {
		localPreconditionLoop : for (Constraint localPrecondition : getLocalPreconditions()) {
			if (eClass != null && !eClass.isInstance(localPrecondition))
				continue localPreconditionLoop;
			if (name != null && !(ignoreCase
				? name.equalsIgnoreCase(localPrecondition.getName())
				: name.equals(localPrecondition.getName())))
				continue localPreconditionLoop;
			return localPrecondition;
		}
		return createOnDemand && eClass != null
			? createLocalPrecondition(name, eClass)
			: null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Action> allActions() {
		CacheAdapter cache = getCacheAdapter();
		if (cache != null) {
			@SuppressWarnings("unchecked")
			EList<Action> result = (EList<Action>) cache.get(this,
				UMLPackage.Literals.ACTION___ALL_ACTIONS);
			if (result == null) {
				cache.put(this, UMLPackage.Literals.ACTION___ALL_ACTIONS,
					result = ActionOperations.allActions(this));
			}
			return result;
		}
		return ActionOperations.allActions(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActivityNode> allOwnedNodes() {
		CacheAdapter cache = getCacheAdapter();
		if (cache != null) {
			@SuppressWarnings("unchecked")
			EList<ActivityNode> result = (EList<ActivityNode>) cache.get(this,
				UMLPackage.Literals.ACTION___ALL_OWNED_NODES);
			if (result == null) {
				cache.put(this, UMLPackage.Literals.ACTION___ALL_OWNED_NODES,
					result = ActionOperations.allOwnedNodes(this));
			}
			return result;
		}
		return ActionOperations.allOwnedNodes(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Behavior containingBehavior() {
		return ActionOperations.containingBehavior(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Constraint> getLocalPostconditions() {
		if (localPostconditions == null) {
			localPostconditions = new EObjectContainmentEList.Resolving<Constraint>(
				Constraint.class, this, UMLPackage.ACTION__LOCAL_POSTCONDITION);
		}
		return localPostconditions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Constraint createLocalPostcondition(String name, EClass eClass) {
		Constraint newLocalPostcondition = (Constraint) create(eClass);
		getLocalPostconditions().add(newLocalPostcondition);
		if (name != null)
			newLocalPostcondition.setName(name);
		return newLocalPostcondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Constraint createLocalPostcondition(String name) {
		return createLocalPostcondition(name, UMLPackage.Literals.CONSTRAINT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Constraint getLocalPostcondition(String name) {
		return getLocalPostcondition(name, false, null, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Constraint getLocalPostcondition(String name, boolean ignoreCase,
			EClass eClass, boolean createOnDemand) {
		localPostconditionLoop : for (Constraint localPostcondition : getLocalPostconditions()) {
			if (eClass != null && !eClass.isInstance(localPostcondition))
				continue localPostconditionLoop;
			if (name != null && !(ignoreCase
				? name.equalsIgnoreCase(localPostcondition.getName())
				: name.equals(localPostcondition.getName())))
				continue localPostconditionLoop;
			return localPostcondition;
		}
		return createOnDemand && eClass != null
			? createLocalPostcondition(name, eClass)
			: null;
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
			case UMLPackage.ACTION__EANNOTATIONS :
				return ((InternalEList<?>) getEAnnotations())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.ACTION__OWNED_COMMENT :
				return ((InternalEList<?>) getOwnedComments())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.ACTION__NAME_EXPRESSION :
				return basicSetNameExpression(null, msgs);
			case UMLPackage.ACTION__IN_INTERRUPTIBLE_REGION :
				return ((InternalEList<?>) getInInterruptibleRegions())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.ACTION__IN_STRUCTURED_NODE :
				return basicSetInStructuredNode(null, msgs);
			case UMLPackage.ACTION__INCOMING :
				return ((InternalEList<?>) getIncomings()).basicRemove(otherEnd,
					msgs);
			case UMLPackage.ACTION__OUTGOING :
				return ((InternalEList<?>) getOutgoings()).basicRemove(otherEnd,
					msgs);
			case UMLPackage.ACTION__IN_PARTITION :
				return ((InternalEList<?>) getInPartitions())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.ACTION__HANDLER :
				return ((InternalEList<?>) getHandlers()).basicRemove(otherEnd,
					msgs);
			case UMLPackage.ACTION__LOCAL_POSTCONDITION :
				return ((InternalEList<?>) getLocalPostconditions())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.ACTION__LOCAL_PRECONDITION :
				return ((InternalEList<?>) getLocalPreconditions())
					.basicRemove(otherEnd, msgs);
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
			case UMLPackage.ACTION__EANNOTATIONS :
				return getEAnnotations();
			case UMLPackage.ACTION__OWNED_COMMENT :
				return getOwnedComments();
			case UMLPackage.ACTION__OWNED_ELEMENT :
				return getOwnedElements();
			case UMLPackage.ACTION__OWNER :
				if (resolve)
					return getOwner();
				return basicGetOwner();
			case UMLPackage.ACTION__CLIENT_DEPENDENCY :
				return getClientDependencies();
			case UMLPackage.ACTION__NAME :
				return getName();
			case UMLPackage.ACTION__NAME_EXPRESSION :
				if (resolve)
					return getNameExpression();
				return basicGetNameExpression();
			case UMLPackage.ACTION__NAMESPACE :
				if (resolve)
					return getNamespace();
				return basicGetNamespace();
			case UMLPackage.ACTION__QUALIFIED_NAME :
				return getQualifiedName();
			case UMLPackage.ACTION__VISIBILITY :
				return getVisibility();
			case UMLPackage.ACTION__IS_LEAF :
				return isLeaf();
			case UMLPackage.ACTION__REDEFINED_ELEMENT :
				return getRedefinedElements();
			case UMLPackage.ACTION__REDEFINITION_CONTEXT :
				return getRedefinitionContexts();
			case UMLPackage.ACTION__ACTIVITY :
				if (resolve)
					return getActivity();
				return basicGetActivity();
			case UMLPackage.ACTION__IN_GROUP :
				return getInGroups();
			case UMLPackage.ACTION__IN_INTERRUPTIBLE_REGION :
				return getInInterruptibleRegions();
			case UMLPackage.ACTION__IN_STRUCTURED_NODE :
				if (resolve)
					return getInStructuredNode();
				return basicGetInStructuredNode();
			case UMLPackage.ACTION__INCOMING :
				return getIncomings();
			case UMLPackage.ACTION__OUTGOING :
				return getOutgoings();
			case UMLPackage.ACTION__REDEFINED_NODE :
				return getRedefinedNodes();
			case UMLPackage.ACTION__IN_PARTITION :
				return getInPartitions();
			case UMLPackage.ACTION__HANDLER :
				return getHandlers();
			case UMLPackage.ACTION__CONTEXT :
				if (resolve)
					return getContext();
				return basicGetContext();
			case UMLPackage.ACTION__INPUT :
				return getInputs();
			case UMLPackage.ACTION__IS_LOCALLY_REENTRANT :
				return isLocallyReentrant();
			case UMLPackage.ACTION__LOCAL_POSTCONDITION :
				return getLocalPostconditions();
			case UMLPackage.ACTION__LOCAL_PRECONDITION :
				return getLocalPreconditions();
			case UMLPackage.ACTION__OUTPUT :
				return getOutputs();
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
			case UMLPackage.ACTION__EANNOTATIONS :
				getEAnnotations().clear();
				getEAnnotations()
					.addAll((Collection<? extends EAnnotation>) newValue);
				return;
			case UMLPackage.ACTION__OWNED_COMMENT :
				getOwnedComments().clear();
				getOwnedComments()
					.addAll((Collection<? extends Comment>) newValue);
				return;
			case UMLPackage.ACTION__NAME :
				setName((String) newValue);
				return;
			case UMLPackage.ACTION__NAME_EXPRESSION :
				setNameExpression((StringExpression) newValue);
				return;
			case UMLPackage.ACTION__VISIBILITY :
				setVisibility((VisibilityKind) newValue);
				return;
			case UMLPackage.ACTION__IS_LEAF :
				setIsLeaf((Boolean) newValue);
				return;
			case UMLPackage.ACTION__ACTIVITY :
				setActivity((Activity) newValue);
				return;
			case UMLPackage.ACTION__IN_INTERRUPTIBLE_REGION :
				getInInterruptibleRegions().clear();
				getInInterruptibleRegions().addAll(
					(Collection<? extends InterruptibleActivityRegion>) newValue);
				return;
			case UMLPackage.ACTION__IN_STRUCTURED_NODE :
				setInStructuredNode((StructuredActivityNode) newValue);
				return;
			case UMLPackage.ACTION__INCOMING :
				getIncomings().clear();
				getIncomings()
					.addAll((Collection<? extends ActivityEdge>) newValue);
				return;
			case UMLPackage.ACTION__OUTGOING :
				getOutgoings().clear();
				getOutgoings()
					.addAll((Collection<? extends ActivityEdge>) newValue);
				return;
			case UMLPackage.ACTION__REDEFINED_NODE :
				getRedefinedNodes().clear();
				getRedefinedNodes()
					.addAll((Collection<? extends ActivityNode>) newValue);
				return;
			case UMLPackage.ACTION__IN_PARTITION :
				getInPartitions().clear();
				getInPartitions()
					.addAll((Collection<? extends ActivityPartition>) newValue);
				return;
			case UMLPackage.ACTION__HANDLER :
				getHandlers().clear();
				getHandlers()
					.addAll((Collection<? extends ExceptionHandler>) newValue);
				return;
			case UMLPackage.ACTION__IS_LOCALLY_REENTRANT :
				setIsLocallyReentrant((Boolean) newValue);
				return;
			case UMLPackage.ACTION__LOCAL_POSTCONDITION :
				getLocalPostconditions().clear();
				getLocalPostconditions()
					.addAll((Collection<? extends Constraint>) newValue);
				return;
			case UMLPackage.ACTION__LOCAL_PRECONDITION :
				getLocalPreconditions().clear();
				getLocalPreconditions()
					.addAll((Collection<? extends Constraint>) newValue);
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
			case UMLPackage.ACTION__EANNOTATIONS :
				getEAnnotations().clear();
				return;
			case UMLPackage.ACTION__OWNED_COMMENT :
				getOwnedComments().clear();
				return;
			case UMLPackage.ACTION__NAME :
				unsetName();
				return;
			case UMLPackage.ACTION__NAME_EXPRESSION :
				setNameExpression((StringExpression) null);
				return;
			case UMLPackage.ACTION__VISIBILITY :
				unsetVisibility();
				return;
			case UMLPackage.ACTION__IS_LEAF :
				setIsLeaf(IS_LEAF_EDEFAULT);
				return;
			case UMLPackage.ACTION__ACTIVITY :
				setActivity((Activity) null);
				return;
			case UMLPackage.ACTION__IN_INTERRUPTIBLE_REGION :
				getInInterruptibleRegions().clear();
				return;
			case UMLPackage.ACTION__IN_STRUCTURED_NODE :
				setInStructuredNode((StructuredActivityNode) null);
				return;
			case UMLPackage.ACTION__INCOMING :
				getIncomings().clear();
				return;
			case UMLPackage.ACTION__OUTGOING :
				getOutgoings().clear();
				return;
			case UMLPackage.ACTION__REDEFINED_NODE :
				getRedefinedNodes().clear();
				return;
			case UMLPackage.ACTION__IN_PARTITION :
				getInPartitions().clear();
				return;
			case UMLPackage.ACTION__HANDLER :
				getHandlers().clear();
				return;
			case UMLPackage.ACTION__IS_LOCALLY_REENTRANT :
				setIsLocallyReentrant(IS_LOCALLY_REENTRANT_EDEFAULT);
				return;
			case UMLPackage.ACTION__LOCAL_POSTCONDITION :
				getLocalPostconditions().clear();
				return;
			case UMLPackage.ACTION__LOCAL_PRECONDITION :
				getLocalPreconditions().clear();
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
			case UMLPackage.ACTION__EANNOTATIONS :
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UMLPackage.ACTION__OWNED_COMMENT :
				return ownedComments != null && !ownedComments.isEmpty();
			case UMLPackage.ACTION__OWNED_ELEMENT :
				return isSetOwnedElements();
			case UMLPackage.ACTION__OWNER :
				return isSetOwner();
			case UMLPackage.ACTION__CLIENT_DEPENDENCY :
				return !getClientDependencies().isEmpty();
			case UMLPackage.ACTION__NAME :
				return isSetName();
			case UMLPackage.ACTION__NAME_EXPRESSION :
				return nameExpression != null;
			case UMLPackage.ACTION__NAMESPACE :
				return isSetNamespace();
			case UMLPackage.ACTION__QUALIFIED_NAME :
				return QUALIFIED_NAME_EDEFAULT == null
					? getQualifiedName() != null
					: !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case UMLPackage.ACTION__VISIBILITY :
				return isSetVisibility();
			case UMLPackage.ACTION__IS_LEAF :
				return ((eFlags & IS_LEAF_EFLAG) != 0) != IS_LEAF_EDEFAULT;
			case UMLPackage.ACTION__REDEFINED_ELEMENT :
				return isSetRedefinedElements();
			case UMLPackage.ACTION__REDEFINITION_CONTEXT :
				return isSetRedefinitionContexts();
			case UMLPackage.ACTION__ACTIVITY :
				return basicGetActivity() != null;
			case UMLPackage.ACTION__IN_GROUP :
				return isSetInGroups();
			case UMLPackage.ACTION__IN_INTERRUPTIBLE_REGION :
				return inInterruptibleRegions != null
					&& !inInterruptibleRegions.isEmpty();
			case UMLPackage.ACTION__IN_STRUCTURED_NODE :
				return basicGetInStructuredNode() != null;
			case UMLPackage.ACTION__INCOMING :
				return incomings != null && !incomings.isEmpty();
			case UMLPackage.ACTION__OUTGOING :
				return outgoings != null && !outgoings.isEmpty();
			case UMLPackage.ACTION__REDEFINED_NODE :
				return redefinedNodes != null && !redefinedNodes.isEmpty();
			case UMLPackage.ACTION__IN_PARTITION :
				return inPartitions != null && !inPartitions.isEmpty();
			case UMLPackage.ACTION__HANDLER :
				return handlers != null && !handlers.isEmpty();
			case UMLPackage.ACTION__CONTEXT :
				return basicGetContext() != null;
			case UMLPackage.ACTION__INPUT :
				return isSetInputs();
			case UMLPackage.ACTION__IS_LOCALLY_REENTRANT :
				return ((eFlags
					& IS_LOCALLY_REENTRANT_EFLAG) != 0) != IS_LOCALLY_REENTRANT_EDEFAULT;
			case UMLPackage.ACTION__LOCAL_POSTCONDITION :
				return localPostconditions != null
					&& !localPostconditions.isEmpty();
			case UMLPackage.ACTION__LOCAL_PRECONDITION :
				return localPreconditions != null
					&& !localPreconditions.isEmpty();
			case UMLPackage.ACTION__OUTPUT :
				return isSetOutputs();
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
			case UMLPackage.ACTION___GET_EANNOTATION__STRING :
				return getEAnnotation((String) arguments.get(0));
			case UMLPackage.ACTION___VALIDATE_HAS_OWNER__DIAGNOSTICCHAIN_MAP :
				return validateHasOwner((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.ACTION___VALIDATE_NOT_OWN_SELF__DIAGNOSTICCHAIN_MAP :
				return validateNotOwnSelf((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.ACTION___ADD_KEYWORD__STRING :
				return addKeyword((String) arguments.get(0));
			case UMLPackage.ACTION___APPLY_STEREOTYPE__STEREOTYPE :
				return applyStereotype((Stereotype) arguments.get(0));
			case UMLPackage.ACTION___CREATE_EANNOTATION__STRING :
				return createEAnnotation((String) arguments.get(0));
			case UMLPackage.ACTION___DESTROY :
				destroy();
				return null;
			case UMLPackage.ACTION___GET_KEYWORDS :
				return getKeywords();
			case UMLPackage.ACTION___GET_APPLICABLE_STEREOTYPE__STRING :
				return getApplicableStereotype((String) arguments.get(0));
			case UMLPackage.ACTION___GET_APPLICABLE_STEREOTYPES :
				return getApplicableStereotypes();
			case UMLPackage.ACTION___GET_APPLIED_STEREOTYPE__STRING :
				return getAppliedStereotype((String) arguments.get(0));
			case UMLPackage.ACTION___GET_APPLIED_STEREOTYPES :
				return getAppliedStereotypes();
			case UMLPackage.ACTION___GET_APPLIED_SUBSTEREOTYPE__STEREOTYPE_STRING :
				return getAppliedSubstereotype((Stereotype) arguments.get(0),
					(String) arguments.get(1));
			case UMLPackage.ACTION___GET_APPLIED_SUBSTEREOTYPES__STEREOTYPE :
				return getAppliedSubstereotypes((Stereotype) arguments.get(0));
			case UMLPackage.ACTION___GET_MODEL :
				return getModel();
			case UMLPackage.ACTION___GET_NEAREST_PACKAGE :
				return getNearestPackage();
			case UMLPackage.ACTION___GET_RELATIONSHIPS :
				return getRelationships();
			case UMLPackage.ACTION___GET_RELATIONSHIPS__ECLASS :
				return getRelationships((EClass) arguments.get(0));
			case UMLPackage.ACTION___GET_REQUIRED_STEREOTYPE__STRING :
				return getRequiredStereotype((String) arguments.get(0));
			case UMLPackage.ACTION___GET_REQUIRED_STEREOTYPES :
				return getRequiredStereotypes();
			case UMLPackage.ACTION___GET_SOURCE_DIRECTED_RELATIONSHIPS :
				return getSourceDirectedRelationships();
			case UMLPackage.ACTION___GET_SOURCE_DIRECTED_RELATIONSHIPS__ECLASS :
				return getSourceDirectedRelationships(
					(EClass) arguments.get(0));
			case UMLPackage.ACTION___GET_STEREOTYPE_APPLICATION__STEREOTYPE :
				return getStereotypeApplication((Stereotype) arguments.get(0));
			case UMLPackage.ACTION___GET_STEREOTYPE_APPLICATIONS :
				return getStereotypeApplications();
			case UMLPackage.ACTION___GET_TARGET_DIRECTED_RELATIONSHIPS :
				return getTargetDirectedRelationships();
			case UMLPackage.ACTION___GET_TARGET_DIRECTED_RELATIONSHIPS__ECLASS :
				return getTargetDirectedRelationships(
					(EClass) arguments.get(0));
			case UMLPackage.ACTION___GET_VALUE__STEREOTYPE_STRING :
				return getValue((Stereotype) arguments.get(0),
					(String) arguments.get(1));
			case UMLPackage.ACTION___HAS_KEYWORD__STRING :
				return hasKeyword((String) arguments.get(0));
			case UMLPackage.ACTION___HAS_VALUE__STEREOTYPE_STRING :
				return hasValue((Stereotype) arguments.get(0),
					(String) arguments.get(1));
			case UMLPackage.ACTION___IS_STEREOTYPE_APPLICABLE__STEREOTYPE :
				return isStereotypeApplicable((Stereotype) arguments.get(0));
			case UMLPackage.ACTION___IS_STEREOTYPE_APPLIED__STEREOTYPE :
				return isStereotypeApplied((Stereotype) arguments.get(0));
			case UMLPackage.ACTION___IS_STEREOTYPE_REQUIRED__STEREOTYPE :
				return isStereotypeRequired((Stereotype) arguments.get(0));
			case UMLPackage.ACTION___REMOVE_KEYWORD__STRING :
				return removeKeyword((String) arguments.get(0));
			case UMLPackage.ACTION___SET_VALUE__STEREOTYPE_STRING_OBJECT :
				setValue((Stereotype) arguments.get(0),
					(String) arguments.get(1), arguments.get(2));
				return null;
			case UMLPackage.ACTION___UNAPPLY_STEREOTYPE__STEREOTYPE :
				return unapplyStereotype((Stereotype) arguments.get(0));
			case UMLPackage.ACTION___ALL_OWNED_ELEMENTS :
				return allOwnedElements();
			case UMLPackage.ACTION___MUST_BE_OWNED :
				return mustBeOwned();
			case UMLPackage.ACTION___VALIDATE_VISIBILITY_NEEDS_OWNERSHIP__DIAGNOSTICCHAIN_MAP :
				return validateVisibilityNeedsOwnership(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.ACTION___VALIDATE_HAS_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP :
				return validateHasQualifiedName(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.ACTION___VALIDATE_HAS_NO_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP :
				return validateHasNoQualifiedName(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.ACTION___CREATE_DEPENDENCY__NAMEDELEMENT :
				return createDependency((NamedElement) arguments.get(0));
			case UMLPackage.ACTION___CREATE_USAGE__NAMEDELEMENT :
				return createUsage((NamedElement) arguments.get(0));
			case UMLPackage.ACTION___GET_LABEL :
				return getLabel();
			case UMLPackage.ACTION___GET_LABEL__BOOLEAN :
				return getLabel((Boolean) arguments.get(0));
			case UMLPackage.ACTION___GET_NAMESPACE :
				return getNamespace();
			case UMLPackage.ACTION___ALL_NAMESPACES :
				return allNamespaces();
			case UMLPackage.ACTION___ALL_OWNING_PACKAGES :
				return allOwningPackages();
			case UMLPackage.ACTION___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE :
				return isDistinguishableFrom((NamedElement) arguments.get(0),
					(Namespace) arguments.get(1));
			case UMLPackage.ACTION___GET_QUALIFIED_NAME :
				return getQualifiedName();
			case UMLPackage.ACTION___SEPARATOR :
				return separator();
			case UMLPackage.ACTION___GET_CLIENT_DEPENDENCIES :
				return getClientDependencies();
			case UMLPackage.ACTION___VALIDATE_REDEFINITION_CONSISTENT__DIAGNOSTICCHAIN_MAP :
				return validateRedefinitionConsistent(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.ACTION___VALIDATE_NON_LEAF_REDEFINITION__DIAGNOSTICCHAIN_MAP :
				return validateNonLeafRedefinition(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.ACTION___VALIDATE_REDEFINITION_CONTEXT_VALID__DIAGNOSTICCHAIN_MAP :
				return validateRedefinitionContextValid(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.ACTION___IS_CONSISTENT_WITH__REDEFINABLEELEMENT :
				return isConsistentWith((RedefinableElement) arguments.get(0));
			case UMLPackage.ACTION___IS_REDEFINITION_CONTEXT_VALID__REDEFINABLEELEMENT :
				return isRedefinitionContextValid(
					(RedefinableElement) arguments.get(0));
			case UMLPackage.ACTION___CONTAINING_ACTIVITY :
				return containingActivity();
			case UMLPackage.ACTION___GET_CONTEXT :
				return getContext();
			case UMLPackage.ACTION___ALL_ACTIONS :
				return allActions();
			case UMLPackage.ACTION___ALL_OWNED_NODES :
				return allOwnedNodes();
			case UMLPackage.ACTION___CONTAINING_BEHAVIOR :
				return containingBehavior();
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
		result.append(" (isLocallyReentrant: "); //$NON-NLS-1$
		result.append((eFlags & IS_LOCALLY_REENTRANT_EFLAG) != 0);
		result.append(')');
		return result.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOutputs() {
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetOwnedElements() {
		return super.isSetOwnedElements() || isSetInputs()
			|| eIsSet(UMLPackage.ACTION__LOCAL_POSTCONDITION)
			|| eIsSet(UMLPackage.ACTION__LOCAL_PRECONDITION) || isSetOutputs();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetInputs() {
		return false;
	}

} //ActionImpl
