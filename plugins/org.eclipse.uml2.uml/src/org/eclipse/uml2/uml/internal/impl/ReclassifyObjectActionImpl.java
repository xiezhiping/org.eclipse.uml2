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
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.Comment;
import org.eclipse.uml2.uml.Constraint;
import org.eclipse.uml2.uml.ExceptionHandler;
import org.eclipse.uml2.uml.InputPin;
import org.eclipse.uml2.uml.InterruptibleActivityRegion;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Namespace;
import org.eclipse.uml2.uml.ReclassifyObjectAction;
import org.eclipse.uml2.uml.RedefinableElement;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.StringExpression;
import org.eclipse.uml2.uml.StructuredActivityNode;
import org.eclipse.uml2.uml.Type;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.VisibilityKind;

import org.eclipse.uml2.uml.internal.operations.ReclassifyObjectActionOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Reclassify Object Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ReclassifyObjectActionImpl#getInputs <em>Input</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ReclassifyObjectActionImpl#isReplaceAll <em>Is Replace All</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ReclassifyObjectActionImpl#getNewClassifiers <em>New Classifier</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ReclassifyObjectActionImpl#getObject <em>Object</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ReclassifyObjectActionImpl#getOldClassifiers <em>Old Classifier</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ReclassifyObjectActionImpl
		extends ActionImpl
		implements ReclassifyObjectAction {

	/**
	 * The default value of the '{@link #isReplaceAll() <em>Is Replace All</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isReplaceAll()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_REPLACE_ALL_EDEFAULT = false;

	/**
	 * The flag representing the value of the '{@link #isReplaceAll() <em>Is Replace All</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isReplaceAll()
	 * @generated
	 * @ordered
	 */
	protected static final int IS_REPLACE_ALL_EFLAG = 1 << 14;

	/**
	 * The cached value of the '{@link #getNewClassifiers() <em>New Classifier</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNewClassifiers()
	 * @generated
	 * @ordered
	 */
	protected EList<Classifier> newClassifiers;

	/**
	 * The cached value of the '{@link #getObject() <em>Object</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObject()
	 * @generated
	 * @ordered
	 */
	protected InputPin object;

	/**
	 * The cached value of the '{@link #getOldClassifiers() <em>Old Classifier</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOldClassifiers()
	 * @generated
	 * @ordered
	 */
	protected EList<Classifier> oldClassifiers;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReclassifyObjectActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UMLPackage.Literals.RECLASSIFY_OBJECT_ACTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<InputPin> getInputs() {
		CacheAdapter cache = getCacheAdapter();
		if (cache != null) {
			Resource eResource = eResource();
			@SuppressWarnings("unchecked")
			EList<InputPin> inputs = (EList<InputPin>) cache.get(eResource,
				this, UMLPackage.Literals.ACTION__INPUT);
			if (inputs == null) {
				cache.put(eResource, this, UMLPackage.Literals.ACTION__INPUT,
					inputs = new DerivedUnionEObjectEList<InputPin>(
						InputPin.class, this,
						UMLPackage.RECLASSIFY_OBJECT_ACTION__INPUT,
						INPUT_ESUBSETS));
			}
			return inputs;
		}
		return new DerivedUnionEObjectEList<InputPin>(InputPin.class, this,
			UMLPackage.RECLASSIFY_OBJECT_ACTION__INPUT, INPUT_ESUBSETS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isReplaceAll() {
		return (eFlags & IS_REPLACE_ALL_EFLAG) != 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsReplaceAll(boolean newIsReplaceAll) {
		boolean oldIsReplaceAll = (eFlags & IS_REPLACE_ALL_EFLAG) != 0;
		if (newIsReplaceAll)
			eFlags |= IS_REPLACE_ALL_EFLAG;
		else
			eFlags &= ~IS_REPLACE_ALL_EFLAG;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.RECLASSIFY_OBJECT_ACTION__IS_REPLACE_ALL,
				oldIsReplaceAll, newIsReplaceAll));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Classifier> getOldClassifiers() {
		if (oldClassifiers == null) {
			oldClassifiers = new EObjectResolvingEList<Classifier>(
				Classifier.class, this,
				UMLPackage.RECLASSIFY_OBJECT_ACTION__OLD_CLASSIFIER);
		}
		return oldClassifiers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Classifier getOldClassifier(String name) {
		return getOldClassifier(name, false, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Classifier getOldClassifier(String name, boolean ignoreCase,
			EClass eClass) {
		oldClassifierLoop : for (Classifier oldClassifier : getOldClassifiers()) {
			if (eClass != null && !eClass.isInstance(oldClassifier))
				continue oldClassifierLoop;
			if (name != null && !(ignoreCase
				? name.equalsIgnoreCase(oldClassifier.getName())
				: name.equals(oldClassifier.getName())))
				continue oldClassifierLoop;
			return oldClassifier;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Classifier> getNewClassifiers() {
		if (newClassifiers == null) {
			newClassifiers = new EObjectResolvingEList<Classifier>(
				Classifier.class, this,
				UMLPackage.RECLASSIFY_OBJECT_ACTION__NEW_CLASSIFIER);
		}
		return newClassifiers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Classifier getNewClassifier(String name) {
		return getNewClassifier(name, false, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Classifier getNewClassifier(String name, boolean ignoreCase,
			EClass eClass) {
		newClassifierLoop : for (Classifier newClassifier : getNewClassifiers()) {
			if (eClass != null && !eClass.isInstance(newClassifier))
				continue newClassifierLoop;
			if (name != null && !(ignoreCase
				? name.equalsIgnoreCase(newClassifier.getName())
				: name.equals(newClassifier.getName())))
				continue newClassifierLoop;
			return newClassifier;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputPin getObject() {
		if (object != null && object.eIsProxy()) {
			InternalEObject oldObject = (InternalEObject) object;
			object = (InputPin) eResolveProxy(oldObject);
			if (object != oldObject) {
				InternalEObject newObject = (InternalEObject) object;
				NotificationChain msgs = oldObject.eInverseRemove(this,
					EOPPOSITE_FEATURE_BASE
						- UMLPackage.RECLASSIFY_OBJECT_ACTION__OBJECT,
					null, null);
				if (newObject.eInternalContainer() == null) {
					msgs = newObject.eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE
							- UMLPackage.RECLASSIFY_OBJECT_ACTION__OBJECT,
						null, msgs);
				}
				if (msgs != null)
					msgs.dispatch();
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
						UMLPackage.RECLASSIFY_OBJECT_ACTION__OBJECT, oldObject,
						object));
			}
		}
		return object;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputPin basicGetObject() {
		return object;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetObject(InputPin newObject,
			NotificationChain msgs) {
		InputPin oldObject = object;
		object = newObject;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
				Notification.SET, UMLPackage.RECLASSIFY_OBJECT_ACTION__OBJECT,
				oldObject, newObject);
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
	public void setObject(InputPin newObject) {
		if (newObject != object) {
			NotificationChain msgs = null;
			if (object != null)
				msgs = ((InternalEObject) object).eInverseRemove(this,
					EOPPOSITE_FEATURE_BASE
						- UMLPackage.RECLASSIFY_OBJECT_ACTION__OBJECT,
					null, msgs);
			if (newObject != null)
				msgs = ((InternalEObject) newObject).eInverseAdd(this,
					EOPPOSITE_FEATURE_BASE
						- UMLPackage.RECLASSIFY_OBJECT_ACTION__OBJECT,
					null, msgs);
			msgs = basicSetObject(newObject, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.RECLASSIFY_OBJECT_ACTION__OBJECT, newObject,
				newObject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputPin createObject(String name, Type type, EClass eClass) {
		InputPin newObject = (InputPin) create(eClass);
		setObject(newObject);
		if (name != null)
			newObject.setName(name);
		if (type != null)
			newObject.setType(type);
		return newObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputPin createObject(String name, Type type) {
		return createObject(name, type, UMLPackage.Literals.INPUT_PIN);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClassifierNotAbstract(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ReclassifyObjectActionOperations
			.validateClassifierNotAbstract(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMultiplicity(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ReclassifyObjectActionOperations.validateMultiplicity(this,
			diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInputPin(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ReclassifyObjectActionOperations.validateInputPin(this,
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
			case UMLPackage.RECLASSIFY_OBJECT_ACTION__EANNOTATIONS :
				return ((InternalEList<?>) getEAnnotations())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.RECLASSIFY_OBJECT_ACTION__OWNED_COMMENT :
				return ((InternalEList<?>) getOwnedComments())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.RECLASSIFY_OBJECT_ACTION__NAME_EXPRESSION :
				return basicSetNameExpression(null, msgs);
			case UMLPackage.RECLASSIFY_OBJECT_ACTION__IN_INTERRUPTIBLE_REGION :
				return ((InternalEList<?>) getInInterruptibleRegions())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.RECLASSIFY_OBJECT_ACTION__IN_STRUCTURED_NODE :
				return basicSetInStructuredNode(null, msgs);
			case UMLPackage.RECLASSIFY_OBJECT_ACTION__INCOMING :
				return ((InternalEList<?>) getIncomings()).basicRemove(otherEnd,
					msgs);
			case UMLPackage.RECLASSIFY_OBJECT_ACTION__OUTGOING :
				return ((InternalEList<?>) getOutgoings()).basicRemove(otherEnd,
					msgs);
			case UMLPackage.RECLASSIFY_OBJECT_ACTION__IN_PARTITION :
				return ((InternalEList<?>) getInPartitions())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.RECLASSIFY_OBJECT_ACTION__HANDLER :
				return ((InternalEList<?>) getHandlers()).basicRemove(otherEnd,
					msgs);
			case UMLPackage.RECLASSIFY_OBJECT_ACTION__LOCAL_POSTCONDITION :
				return ((InternalEList<?>) getLocalPostconditions())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.RECLASSIFY_OBJECT_ACTION__LOCAL_PRECONDITION :
				return ((InternalEList<?>) getLocalPreconditions())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.RECLASSIFY_OBJECT_ACTION__OBJECT :
				return basicSetObject(null, msgs);
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
			case UMLPackage.RECLASSIFY_OBJECT_ACTION__EANNOTATIONS :
				return getEAnnotations();
			case UMLPackage.RECLASSIFY_OBJECT_ACTION__OWNED_COMMENT :
				return getOwnedComments();
			case UMLPackage.RECLASSIFY_OBJECT_ACTION__OWNED_ELEMENT :
				return getOwnedElements();
			case UMLPackage.RECLASSIFY_OBJECT_ACTION__OWNER :
				if (resolve)
					return getOwner();
				return basicGetOwner();
			case UMLPackage.RECLASSIFY_OBJECT_ACTION__CLIENT_DEPENDENCY :
				return getClientDependencies();
			case UMLPackage.RECLASSIFY_OBJECT_ACTION__NAME :
				return getName();
			case UMLPackage.RECLASSIFY_OBJECT_ACTION__NAME_EXPRESSION :
				if (resolve)
					return getNameExpression();
				return basicGetNameExpression();
			case UMLPackage.RECLASSIFY_OBJECT_ACTION__NAMESPACE :
				if (resolve)
					return getNamespace();
				return basicGetNamespace();
			case UMLPackage.RECLASSIFY_OBJECT_ACTION__QUALIFIED_NAME :
				return getQualifiedName();
			case UMLPackage.RECLASSIFY_OBJECT_ACTION__VISIBILITY :
				return getVisibility();
			case UMLPackage.RECLASSIFY_OBJECT_ACTION__IS_LEAF :
				return isLeaf();
			case UMLPackage.RECLASSIFY_OBJECT_ACTION__REDEFINED_ELEMENT :
				return getRedefinedElements();
			case UMLPackage.RECLASSIFY_OBJECT_ACTION__REDEFINITION_CONTEXT :
				return getRedefinitionContexts();
			case UMLPackage.RECLASSIFY_OBJECT_ACTION__ACTIVITY :
				if (resolve)
					return getActivity();
				return basicGetActivity();
			case UMLPackage.RECLASSIFY_OBJECT_ACTION__IN_GROUP :
				return getInGroups();
			case UMLPackage.RECLASSIFY_OBJECT_ACTION__IN_INTERRUPTIBLE_REGION :
				return getInInterruptibleRegions();
			case UMLPackage.RECLASSIFY_OBJECT_ACTION__IN_STRUCTURED_NODE :
				if (resolve)
					return getInStructuredNode();
				return basicGetInStructuredNode();
			case UMLPackage.RECLASSIFY_OBJECT_ACTION__INCOMING :
				return getIncomings();
			case UMLPackage.RECLASSIFY_OBJECT_ACTION__OUTGOING :
				return getOutgoings();
			case UMLPackage.RECLASSIFY_OBJECT_ACTION__REDEFINED_NODE :
				return getRedefinedNodes();
			case UMLPackage.RECLASSIFY_OBJECT_ACTION__IN_PARTITION :
				return getInPartitions();
			case UMLPackage.RECLASSIFY_OBJECT_ACTION__HANDLER :
				return getHandlers();
			case UMLPackage.RECLASSIFY_OBJECT_ACTION__CONTEXT :
				if (resolve)
					return getContext();
				return basicGetContext();
			case UMLPackage.RECLASSIFY_OBJECT_ACTION__INPUT :
				return getInputs();
			case UMLPackage.RECLASSIFY_OBJECT_ACTION__IS_LOCALLY_REENTRANT :
				return isLocallyReentrant();
			case UMLPackage.RECLASSIFY_OBJECT_ACTION__LOCAL_POSTCONDITION :
				return getLocalPostconditions();
			case UMLPackage.RECLASSIFY_OBJECT_ACTION__LOCAL_PRECONDITION :
				return getLocalPreconditions();
			case UMLPackage.RECLASSIFY_OBJECT_ACTION__OUTPUT :
				return getOutputs();
			case UMLPackage.RECLASSIFY_OBJECT_ACTION__IS_REPLACE_ALL :
				return isReplaceAll();
			case UMLPackage.RECLASSIFY_OBJECT_ACTION__NEW_CLASSIFIER :
				return getNewClassifiers();
			case UMLPackage.RECLASSIFY_OBJECT_ACTION__OBJECT :
				if (resolve)
					return getObject();
				return basicGetObject();
			case UMLPackage.RECLASSIFY_OBJECT_ACTION__OLD_CLASSIFIER :
				return getOldClassifiers();
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
			case UMLPackage.RECLASSIFY_OBJECT_ACTION__EANNOTATIONS :
				getEAnnotations().clear();
				getEAnnotations()
					.addAll((Collection<? extends EAnnotation>) newValue);
				return;
			case UMLPackage.RECLASSIFY_OBJECT_ACTION__OWNED_COMMENT :
				getOwnedComments().clear();
				getOwnedComments()
					.addAll((Collection<? extends Comment>) newValue);
				return;
			case UMLPackage.RECLASSIFY_OBJECT_ACTION__NAME :
				setName((String) newValue);
				return;
			case UMLPackage.RECLASSIFY_OBJECT_ACTION__NAME_EXPRESSION :
				setNameExpression((StringExpression) newValue);
				return;
			case UMLPackage.RECLASSIFY_OBJECT_ACTION__VISIBILITY :
				setVisibility((VisibilityKind) newValue);
				return;
			case UMLPackage.RECLASSIFY_OBJECT_ACTION__IS_LEAF :
				setIsLeaf((Boolean) newValue);
				return;
			case UMLPackage.RECLASSIFY_OBJECT_ACTION__ACTIVITY :
				setActivity((Activity) newValue);
				return;
			case UMLPackage.RECLASSIFY_OBJECT_ACTION__IN_INTERRUPTIBLE_REGION :
				getInInterruptibleRegions().clear();
				getInInterruptibleRegions().addAll(
					(Collection<? extends InterruptibleActivityRegion>) newValue);
				return;
			case UMLPackage.RECLASSIFY_OBJECT_ACTION__IN_STRUCTURED_NODE :
				setInStructuredNode((StructuredActivityNode) newValue);
				return;
			case UMLPackage.RECLASSIFY_OBJECT_ACTION__INCOMING :
				getIncomings().clear();
				getIncomings()
					.addAll((Collection<? extends ActivityEdge>) newValue);
				return;
			case UMLPackage.RECLASSIFY_OBJECT_ACTION__OUTGOING :
				getOutgoings().clear();
				getOutgoings()
					.addAll((Collection<? extends ActivityEdge>) newValue);
				return;
			case UMLPackage.RECLASSIFY_OBJECT_ACTION__REDEFINED_NODE :
				getRedefinedNodes().clear();
				getRedefinedNodes()
					.addAll((Collection<? extends ActivityNode>) newValue);
				return;
			case UMLPackage.RECLASSIFY_OBJECT_ACTION__IN_PARTITION :
				getInPartitions().clear();
				getInPartitions()
					.addAll((Collection<? extends ActivityPartition>) newValue);
				return;
			case UMLPackage.RECLASSIFY_OBJECT_ACTION__HANDLER :
				getHandlers().clear();
				getHandlers()
					.addAll((Collection<? extends ExceptionHandler>) newValue);
				return;
			case UMLPackage.RECLASSIFY_OBJECT_ACTION__IS_LOCALLY_REENTRANT :
				setIsLocallyReentrant((Boolean) newValue);
				return;
			case UMLPackage.RECLASSIFY_OBJECT_ACTION__LOCAL_POSTCONDITION :
				getLocalPostconditions().clear();
				getLocalPostconditions()
					.addAll((Collection<? extends Constraint>) newValue);
				return;
			case UMLPackage.RECLASSIFY_OBJECT_ACTION__LOCAL_PRECONDITION :
				getLocalPreconditions().clear();
				getLocalPreconditions()
					.addAll((Collection<? extends Constraint>) newValue);
				return;
			case UMLPackage.RECLASSIFY_OBJECT_ACTION__IS_REPLACE_ALL :
				setIsReplaceAll((Boolean) newValue);
				return;
			case UMLPackage.RECLASSIFY_OBJECT_ACTION__NEW_CLASSIFIER :
				getNewClassifiers().clear();
				getNewClassifiers()
					.addAll((Collection<? extends Classifier>) newValue);
				return;
			case UMLPackage.RECLASSIFY_OBJECT_ACTION__OBJECT :
				setObject((InputPin) newValue);
				return;
			case UMLPackage.RECLASSIFY_OBJECT_ACTION__OLD_CLASSIFIER :
				getOldClassifiers().clear();
				getOldClassifiers()
					.addAll((Collection<? extends Classifier>) newValue);
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
			case UMLPackage.RECLASSIFY_OBJECT_ACTION__EANNOTATIONS :
				getEAnnotations().clear();
				return;
			case UMLPackage.RECLASSIFY_OBJECT_ACTION__OWNED_COMMENT :
				getOwnedComments().clear();
				return;
			case UMLPackage.RECLASSIFY_OBJECT_ACTION__NAME :
				unsetName();
				return;
			case UMLPackage.RECLASSIFY_OBJECT_ACTION__NAME_EXPRESSION :
				setNameExpression((StringExpression) null);
				return;
			case UMLPackage.RECLASSIFY_OBJECT_ACTION__VISIBILITY :
				unsetVisibility();
				return;
			case UMLPackage.RECLASSIFY_OBJECT_ACTION__IS_LEAF :
				setIsLeaf(IS_LEAF_EDEFAULT);
				return;
			case UMLPackage.RECLASSIFY_OBJECT_ACTION__ACTIVITY :
				setActivity((Activity) null);
				return;
			case UMLPackage.RECLASSIFY_OBJECT_ACTION__IN_INTERRUPTIBLE_REGION :
				getInInterruptibleRegions().clear();
				return;
			case UMLPackage.RECLASSIFY_OBJECT_ACTION__IN_STRUCTURED_NODE :
				setInStructuredNode((StructuredActivityNode) null);
				return;
			case UMLPackage.RECLASSIFY_OBJECT_ACTION__INCOMING :
				getIncomings().clear();
				return;
			case UMLPackage.RECLASSIFY_OBJECT_ACTION__OUTGOING :
				getOutgoings().clear();
				return;
			case UMLPackage.RECLASSIFY_OBJECT_ACTION__REDEFINED_NODE :
				getRedefinedNodes().clear();
				return;
			case UMLPackage.RECLASSIFY_OBJECT_ACTION__IN_PARTITION :
				getInPartitions().clear();
				return;
			case UMLPackage.RECLASSIFY_OBJECT_ACTION__HANDLER :
				getHandlers().clear();
				return;
			case UMLPackage.RECLASSIFY_OBJECT_ACTION__IS_LOCALLY_REENTRANT :
				setIsLocallyReentrant(IS_LOCALLY_REENTRANT_EDEFAULT);
				return;
			case UMLPackage.RECLASSIFY_OBJECT_ACTION__LOCAL_POSTCONDITION :
				getLocalPostconditions().clear();
				return;
			case UMLPackage.RECLASSIFY_OBJECT_ACTION__LOCAL_PRECONDITION :
				getLocalPreconditions().clear();
				return;
			case UMLPackage.RECLASSIFY_OBJECT_ACTION__IS_REPLACE_ALL :
				setIsReplaceAll(IS_REPLACE_ALL_EDEFAULT);
				return;
			case UMLPackage.RECLASSIFY_OBJECT_ACTION__NEW_CLASSIFIER :
				getNewClassifiers().clear();
				return;
			case UMLPackage.RECLASSIFY_OBJECT_ACTION__OBJECT :
				setObject((InputPin) null);
				return;
			case UMLPackage.RECLASSIFY_OBJECT_ACTION__OLD_CLASSIFIER :
				getOldClassifiers().clear();
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
			case UMLPackage.RECLASSIFY_OBJECT_ACTION__EANNOTATIONS :
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UMLPackage.RECLASSIFY_OBJECT_ACTION__OWNED_COMMENT :
				return ownedComments != null && !ownedComments.isEmpty();
			case UMLPackage.RECLASSIFY_OBJECT_ACTION__OWNED_ELEMENT :
				return isSetOwnedElements();
			case UMLPackage.RECLASSIFY_OBJECT_ACTION__OWNER :
				return isSetOwner();
			case UMLPackage.RECLASSIFY_OBJECT_ACTION__CLIENT_DEPENDENCY :
				return !getClientDependencies().isEmpty();
			case UMLPackage.RECLASSIFY_OBJECT_ACTION__NAME :
				return isSetName();
			case UMLPackage.RECLASSIFY_OBJECT_ACTION__NAME_EXPRESSION :
				return nameExpression != null;
			case UMLPackage.RECLASSIFY_OBJECT_ACTION__NAMESPACE :
				return isSetNamespace();
			case UMLPackage.RECLASSIFY_OBJECT_ACTION__QUALIFIED_NAME :
				return QUALIFIED_NAME_EDEFAULT == null
					? getQualifiedName() != null
					: !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case UMLPackage.RECLASSIFY_OBJECT_ACTION__VISIBILITY :
				return isSetVisibility();
			case UMLPackage.RECLASSIFY_OBJECT_ACTION__IS_LEAF :
				return ((eFlags & IS_LEAF_EFLAG) != 0) != IS_LEAF_EDEFAULT;
			case UMLPackage.RECLASSIFY_OBJECT_ACTION__REDEFINED_ELEMENT :
				return isSetRedefinedElements();
			case UMLPackage.RECLASSIFY_OBJECT_ACTION__REDEFINITION_CONTEXT :
				return isSetRedefinitionContexts();
			case UMLPackage.RECLASSIFY_OBJECT_ACTION__ACTIVITY :
				return basicGetActivity() != null;
			case UMLPackage.RECLASSIFY_OBJECT_ACTION__IN_GROUP :
				return isSetInGroups();
			case UMLPackage.RECLASSIFY_OBJECT_ACTION__IN_INTERRUPTIBLE_REGION :
				return inInterruptibleRegions != null
					&& !inInterruptibleRegions.isEmpty();
			case UMLPackage.RECLASSIFY_OBJECT_ACTION__IN_STRUCTURED_NODE :
				return basicGetInStructuredNode() != null;
			case UMLPackage.RECLASSIFY_OBJECT_ACTION__INCOMING :
				return incomings != null && !incomings.isEmpty();
			case UMLPackage.RECLASSIFY_OBJECT_ACTION__OUTGOING :
				return outgoings != null && !outgoings.isEmpty();
			case UMLPackage.RECLASSIFY_OBJECT_ACTION__REDEFINED_NODE :
				return redefinedNodes != null && !redefinedNodes.isEmpty();
			case UMLPackage.RECLASSIFY_OBJECT_ACTION__IN_PARTITION :
				return inPartitions != null && !inPartitions.isEmpty();
			case UMLPackage.RECLASSIFY_OBJECT_ACTION__HANDLER :
				return handlers != null && !handlers.isEmpty();
			case UMLPackage.RECLASSIFY_OBJECT_ACTION__CONTEXT :
				return basicGetContext() != null;
			case UMLPackage.RECLASSIFY_OBJECT_ACTION__INPUT :
				return isSetInputs();
			case UMLPackage.RECLASSIFY_OBJECT_ACTION__IS_LOCALLY_REENTRANT :
				return ((eFlags
					& IS_LOCALLY_REENTRANT_EFLAG) != 0) != IS_LOCALLY_REENTRANT_EDEFAULT;
			case UMLPackage.RECLASSIFY_OBJECT_ACTION__LOCAL_POSTCONDITION :
				return localPostconditions != null
					&& !localPostconditions.isEmpty();
			case UMLPackage.RECLASSIFY_OBJECT_ACTION__LOCAL_PRECONDITION :
				return localPreconditions != null
					&& !localPreconditions.isEmpty();
			case UMLPackage.RECLASSIFY_OBJECT_ACTION__OUTPUT :
				return isSetOutputs();
			case UMLPackage.RECLASSIFY_OBJECT_ACTION__IS_REPLACE_ALL :
				return ((eFlags
					& IS_REPLACE_ALL_EFLAG) != 0) != IS_REPLACE_ALL_EDEFAULT;
			case UMLPackage.RECLASSIFY_OBJECT_ACTION__NEW_CLASSIFIER :
				return newClassifiers != null && !newClassifiers.isEmpty();
			case UMLPackage.RECLASSIFY_OBJECT_ACTION__OBJECT :
				return object != null;
			case UMLPackage.RECLASSIFY_OBJECT_ACTION__OLD_CLASSIFIER :
				return oldClassifiers != null && !oldClassifiers.isEmpty();
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
			case UMLPackage.RECLASSIFY_OBJECT_ACTION___GET_EANNOTATION__STRING :
				return getEAnnotation((String) arguments.get(0));
			case UMLPackage.RECLASSIFY_OBJECT_ACTION___VALIDATE_HAS_OWNER__DIAGNOSTICCHAIN_MAP :
				return validateHasOwner((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.RECLASSIFY_OBJECT_ACTION___VALIDATE_NOT_OWN_SELF__DIAGNOSTICCHAIN_MAP :
				return validateNotOwnSelf((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.RECLASSIFY_OBJECT_ACTION___ADD_KEYWORD__STRING :
				return addKeyword((String) arguments.get(0));
			case UMLPackage.RECLASSIFY_OBJECT_ACTION___APPLY_STEREOTYPE__STEREOTYPE :
				return applyStereotype((Stereotype) arguments.get(0));
			case UMLPackage.RECLASSIFY_OBJECT_ACTION___CREATE_EANNOTATION__STRING :
				return createEAnnotation((String) arguments.get(0));
			case UMLPackage.RECLASSIFY_OBJECT_ACTION___DESTROY :
				destroy();
				return null;
			case UMLPackage.RECLASSIFY_OBJECT_ACTION___GET_KEYWORDS :
				return getKeywords();
			case UMLPackage.RECLASSIFY_OBJECT_ACTION___GET_APPLICABLE_STEREOTYPE__STRING :
				return getApplicableStereotype((String) arguments.get(0));
			case UMLPackage.RECLASSIFY_OBJECT_ACTION___GET_APPLICABLE_STEREOTYPES :
				return getApplicableStereotypes();
			case UMLPackage.RECLASSIFY_OBJECT_ACTION___GET_APPLIED_STEREOTYPE__STRING :
				return getAppliedStereotype((String) arguments.get(0));
			case UMLPackage.RECLASSIFY_OBJECT_ACTION___GET_APPLIED_STEREOTYPES :
				return getAppliedStereotypes();
			case UMLPackage.RECLASSIFY_OBJECT_ACTION___GET_APPLIED_SUBSTEREOTYPE__STEREOTYPE_STRING :
				return getAppliedSubstereotype((Stereotype) arguments.get(0),
					(String) arguments.get(1));
			case UMLPackage.RECLASSIFY_OBJECT_ACTION___GET_APPLIED_SUBSTEREOTYPES__STEREOTYPE :
				return getAppliedSubstereotypes((Stereotype) arguments.get(0));
			case UMLPackage.RECLASSIFY_OBJECT_ACTION___GET_MODEL :
				return getModel();
			case UMLPackage.RECLASSIFY_OBJECT_ACTION___GET_NEAREST_PACKAGE :
				return getNearestPackage();
			case UMLPackage.RECLASSIFY_OBJECT_ACTION___GET_RELATIONSHIPS :
				return getRelationships();
			case UMLPackage.RECLASSIFY_OBJECT_ACTION___GET_RELATIONSHIPS__ECLASS :
				return getRelationships((EClass) arguments.get(0));
			case UMLPackage.RECLASSIFY_OBJECT_ACTION___GET_REQUIRED_STEREOTYPE__STRING :
				return getRequiredStereotype((String) arguments.get(0));
			case UMLPackage.RECLASSIFY_OBJECT_ACTION___GET_REQUIRED_STEREOTYPES :
				return getRequiredStereotypes();
			case UMLPackage.RECLASSIFY_OBJECT_ACTION___GET_SOURCE_DIRECTED_RELATIONSHIPS :
				return getSourceDirectedRelationships();
			case UMLPackage.RECLASSIFY_OBJECT_ACTION___GET_SOURCE_DIRECTED_RELATIONSHIPS__ECLASS :
				return getSourceDirectedRelationships(
					(EClass) arguments.get(0));
			case UMLPackage.RECLASSIFY_OBJECT_ACTION___GET_STEREOTYPE_APPLICATION__STEREOTYPE :
				return getStereotypeApplication((Stereotype) arguments.get(0));
			case UMLPackage.RECLASSIFY_OBJECT_ACTION___GET_STEREOTYPE_APPLICATIONS :
				return getStereotypeApplications();
			case UMLPackage.RECLASSIFY_OBJECT_ACTION___GET_TARGET_DIRECTED_RELATIONSHIPS :
				return getTargetDirectedRelationships();
			case UMLPackage.RECLASSIFY_OBJECT_ACTION___GET_TARGET_DIRECTED_RELATIONSHIPS__ECLASS :
				return getTargetDirectedRelationships(
					(EClass) arguments.get(0));
			case UMLPackage.RECLASSIFY_OBJECT_ACTION___GET_VALUE__STEREOTYPE_STRING :
				return getValue((Stereotype) arguments.get(0),
					(String) arguments.get(1));
			case UMLPackage.RECLASSIFY_OBJECT_ACTION___HAS_KEYWORD__STRING :
				return hasKeyword((String) arguments.get(0));
			case UMLPackage.RECLASSIFY_OBJECT_ACTION___HAS_VALUE__STEREOTYPE_STRING :
				return hasValue((Stereotype) arguments.get(0),
					(String) arguments.get(1));
			case UMLPackage.RECLASSIFY_OBJECT_ACTION___IS_STEREOTYPE_APPLICABLE__STEREOTYPE :
				return isStereotypeApplicable((Stereotype) arguments.get(0));
			case UMLPackage.RECLASSIFY_OBJECT_ACTION___IS_STEREOTYPE_APPLIED__STEREOTYPE :
				return isStereotypeApplied((Stereotype) arguments.get(0));
			case UMLPackage.RECLASSIFY_OBJECT_ACTION___IS_STEREOTYPE_REQUIRED__STEREOTYPE :
				return isStereotypeRequired((Stereotype) arguments.get(0));
			case UMLPackage.RECLASSIFY_OBJECT_ACTION___REMOVE_KEYWORD__STRING :
				return removeKeyword((String) arguments.get(0));
			case UMLPackage.RECLASSIFY_OBJECT_ACTION___SET_VALUE__STEREOTYPE_STRING_OBJECT :
				setValue((Stereotype) arguments.get(0),
					(String) arguments.get(1), arguments.get(2));
				return null;
			case UMLPackage.RECLASSIFY_OBJECT_ACTION___UNAPPLY_STEREOTYPE__STEREOTYPE :
				return unapplyStereotype((Stereotype) arguments.get(0));
			case UMLPackage.RECLASSIFY_OBJECT_ACTION___ALL_OWNED_ELEMENTS :
				return allOwnedElements();
			case UMLPackage.RECLASSIFY_OBJECT_ACTION___MUST_BE_OWNED :
				return mustBeOwned();
			case UMLPackage.RECLASSIFY_OBJECT_ACTION___VALIDATE_VISIBILITY_NEEDS_OWNERSHIP__DIAGNOSTICCHAIN_MAP :
				return validateVisibilityNeedsOwnership(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.RECLASSIFY_OBJECT_ACTION___VALIDATE_HAS_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP :
				return validateHasQualifiedName(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.RECLASSIFY_OBJECT_ACTION___VALIDATE_HAS_NO_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP :
				return validateHasNoQualifiedName(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.RECLASSIFY_OBJECT_ACTION___CREATE_DEPENDENCY__NAMEDELEMENT :
				return createDependency((NamedElement) arguments.get(0));
			case UMLPackage.RECLASSIFY_OBJECT_ACTION___CREATE_USAGE__NAMEDELEMENT :
				return createUsage((NamedElement) arguments.get(0));
			case UMLPackage.RECLASSIFY_OBJECT_ACTION___GET_LABEL :
				return getLabel();
			case UMLPackage.RECLASSIFY_OBJECT_ACTION___GET_LABEL__BOOLEAN :
				return getLabel((Boolean) arguments.get(0));
			case UMLPackage.RECLASSIFY_OBJECT_ACTION___GET_NAMESPACE :
				return getNamespace();
			case UMLPackage.RECLASSIFY_OBJECT_ACTION___ALL_NAMESPACES :
				return allNamespaces();
			case UMLPackage.RECLASSIFY_OBJECT_ACTION___ALL_OWNING_PACKAGES :
				return allOwningPackages();
			case UMLPackage.RECLASSIFY_OBJECT_ACTION___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE :
				return isDistinguishableFrom((NamedElement) arguments.get(0),
					(Namespace) arguments.get(1));
			case UMLPackage.RECLASSIFY_OBJECT_ACTION___GET_QUALIFIED_NAME :
				return getQualifiedName();
			case UMLPackage.RECLASSIFY_OBJECT_ACTION___SEPARATOR :
				return separator();
			case UMLPackage.RECLASSIFY_OBJECT_ACTION___GET_CLIENT_DEPENDENCIES :
				return getClientDependencies();
			case UMLPackage.RECLASSIFY_OBJECT_ACTION___VALIDATE_REDEFINITION_CONSISTENT__DIAGNOSTICCHAIN_MAP :
				return validateRedefinitionConsistent(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.RECLASSIFY_OBJECT_ACTION___VALIDATE_NON_LEAF_REDEFINITION__DIAGNOSTICCHAIN_MAP :
				return validateNonLeafRedefinition(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.RECLASSIFY_OBJECT_ACTION___VALIDATE_REDEFINITION_CONTEXT_VALID__DIAGNOSTICCHAIN_MAP :
				return validateRedefinitionContextValid(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.RECLASSIFY_OBJECT_ACTION___IS_CONSISTENT_WITH__REDEFINABLEELEMENT :
				return isConsistentWith((RedefinableElement) arguments.get(0));
			case UMLPackage.RECLASSIFY_OBJECT_ACTION___IS_REDEFINITION_CONTEXT_VALID__REDEFINABLEELEMENT :
				return isRedefinitionContextValid(
					(RedefinableElement) arguments.get(0));
			case UMLPackage.RECLASSIFY_OBJECT_ACTION___CONTAINING_ACTIVITY :
				return containingActivity();
			case UMLPackage.RECLASSIFY_OBJECT_ACTION___GET_CONTEXT :
				return getContext();
			case UMLPackage.RECLASSIFY_OBJECT_ACTION___ALL_ACTIONS :
				return allActions();
			case UMLPackage.RECLASSIFY_OBJECT_ACTION___ALL_OWNED_NODES :
				return allOwnedNodes();
			case UMLPackage.RECLASSIFY_OBJECT_ACTION___CONTAINING_BEHAVIOR :
				return containingBehavior();
			case UMLPackage.RECLASSIFY_OBJECT_ACTION___VALIDATE_INPUT_PIN__DIAGNOSTICCHAIN_MAP :
				return validateInputPin((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.RECLASSIFY_OBJECT_ACTION___VALIDATE_CLASSIFIER_NOT_ABSTRACT__DIAGNOSTICCHAIN_MAP :
				return validateClassifierNotAbstract(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.RECLASSIFY_OBJECT_ACTION___VALIDATE_MULTIPLICITY__DIAGNOSTICCHAIN_MAP :
				return validateMultiplicity((DiagnosticChain) arguments.get(0),
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
		result.append(" (isReplaceAll: "); //$NON-NLS-1$
		result.append((eFlags & IS_REPLACE_ALL_EFLAG) != 0);
		result.append(')');
		return result.toString();
	}

	/**
	 * The array of subset feature identifiers for the '{@link #getInputs() <em>Input</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputs()
	 * @generated
	 * @ordered
	 */
	protected static final int[] INPUT_ESUBSETS = new int[]{
		UMLPackage.RECLASSIFY_OBJECT_ACTION__OBJECT};

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetInputs() {
		return super.isSetInputs()
			|| eIsSet(UMLPackage.RECLASSIFY_OBJECT_ACTION__OBJECT);
	}

} //ReclassifyObjectActionImpl
