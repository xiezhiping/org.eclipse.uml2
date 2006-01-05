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
 * $Id: BehavioralFeatureImpl.java,v 1.12 2006/01/05 13:54:02 khussey Exp $
 */
package org.eclipse.uml2.uml.internal.impl;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.uml2.common.util.DerivedUnionEObjectEList;

import org.eclipse.uml2.uml.Behavior;
import org.eclipse.uml2.uml.BehavioralFeature;
import org.eclipse.uml2.uml.CallConcurrencyKind;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.Feature;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Namespace;
import org.eclipse.uml2.uml.Parameter;
import org.eclipse.uml2.uml.ParameterSet;
import org.eclipse.uml2.uml.RedefinableElement;
import org.eclipse.uml2.uml.StringExpression;
import org.eclipse.uml2.uml.Type;
import org.eclipse.uml2.uml.UMLFactory;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.VisibilityKind;

import org.eclipse.uml2.uml.internal.operations.BehavioralFeatureOperations;
import org.eclipse.uml2.uml.internal.operations.RedefinableElementOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Behavioral Feature</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.BehavioralFeatureImpl#getRedefinedElements <em>Redefined Element</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.BehavioralFeatureImpl#getRedefinitionContexts <em>Redefinition Context</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.BehavioralFeatureImpl#isLeaf <em>Is Leaf</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.BehavioralFeatureImpl#getFeaturingClassifiers <em>Featuring Classifier</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.BehavioralFeatureImpl#isStatic <em>Is Static</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.BehavioralFeatureImpl#getOwnedMembers <em>Owned Member</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.BehavioralFeatureImpl#getOwnedParameters <em>Owned Parameter</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.BehavioralFeatureImpl#isAbstract <em>Is Abstract</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.BehavioralFeatureImpl#getMethods <em>Method</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.BehavioralFeatureImpl#getConcurrency <em>Concurrency</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.BehavioralFeatureImpl#getRaisedExceptions <em>Raised Exception</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.BehavioralFeatureImpl#getOwnedParameterSets <em>Owned Parameter Set</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class BehavioralFeatureImpl
		extends NamespaceImpl
		implements BehavioralFeature {

	/**
	 * The default value of the '{@link #isLeaf() <em>Is Leaf</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isLeaf()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_LEAF_EDEFAULT = false;

	/**
	 * The flag representing the value of the '{@link #isLeaf() <em>Is Leaf</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isLeaf()
	 * @generated
	 * @ordered
	 */
	protected static final int IS_LEAF_EFLAG = 1 << 8;

	/**
	 * The default value of the '{@link #isStatic() <em>Is Static</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isStatic()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_STATIC_EDEFAULT = false;

	/**
	 * The flag representing the value of the '{@link #isStatic() <em>Is Static</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isStatic()
	 * @generated
	 * @ordered
	 */
	protected static final int IS_STATIC_EFLAG = 1 << 9;

	/**
	 * The default value of the '{@link #isAbstract() <em>Is Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAbstract()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_ABSTRACT_EDEFAULT = false;

	/**
	 * The flag representing the value of the '{@link #isAbstract() <em>Is Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAbstract()
	 * @generated
	 * @ordered
	 */
	protected static final int IS_ABSTRACT_EFLAG = 1 << 10;

	/**
	 * The default value of the '{@link #getConcurrency() <em>Concurrency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConcurrency()
	 * @generated
	 * @ordered
	 */
	protected static final CallConcurrencyKind CONCURRENCY_EDEFAULT = CallConcurrencyKind.SEQUENTIAL_LITERAL;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BehavioralFeatureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return UMLPackage.Literals.BEHAVIORAL_FEATURE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getRedefinedElements() {
		EList redefinedElement = (EList) eVirtualGet(UMLPackage.BEHAVIORAL_FEATURE__REDEFINED_ELEMENT);
		if (redefinedElement == null) {
			eVirtualSet(UMLPackage.BEHAVIORAL_FEATURE__REDEFINED_ELEMENT,
				redefinedElement = new DerivedUnionEObjectEList(
					RedefinableElement.class, this,
					UMLPackage.BEHAVIORAL_FEATURE__REDEFINED_ELEMENT, null));
		}
		return redefinedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RedefinableElement getRedefinedElement(String name) {
		for (Iterator i = getRedefinedElements().iterator(); i.hasNext();) {
			RedefinableElement redefinedElement = (RedefinableElement) i.next();
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
	public EList getRedefinitionContexts() {
		EList redefinitionContext = (EList) eVirtualGet(UMLPackage.BEHAVIORAL_FEATURE__REDEFINITION_CONTEXT);
		if (redefinitionContext == null) {
			eVirtualSet(UMLPackage.BEHAVIORAL_FEATURE__REDEFINITION_CONTEXT,
				redefinitionContext = new DerivedUnionEObjectEList(
					Classifier.class, this,
					UMLPackage.BEHAVIORAL_FEATURE__REDEFINITION_CONTEXT, null));
		}
		return redefinitionContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Classifier getRedefinitionContext(String name) {
		for (Iterator i = getRedefinitionContexts().iterator(); i.hasNext();) {
			Classifier redefinitionContext = (Classifier) i.next();
			if (name.equals(redefinitionContext.getName())) {
				return redefinitionContext;
			}
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isLeaf() {
		return (eFlags & IS_LEAF_EFLAG) != 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsLeaf(boolean newIsLeaf) {
		boolean oldIsLeaf = (eFlags & IS_LEAF_EFLAG) != 0;
		if (newIsLeaf)
			eFlags |= IS_LEAF_EFLAG;
		else
			eFlags &= ~IS_LEAF_EFLAG;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.BEHAVIORAL_FEATURE__IS_LEAF, oldIsLeaf, newIsLeaf));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getFeaturingClassifiers() {
		EList featuringClassifier = (EList) eVirtualGet(UMLPackage.BEHAVIORAL_FEATURE__FEATURING_CLASSIFIER);
		if (featuringClassifier == null) {
			eVirtualSet(UMLPackage.BEHAVIORAL_FEATURE__FEATURING_CLASSIFIER,
				featuringClassifier = new DerivedUnionEObjectEList(
					Classifier.class, this,
					UMLPackage.BEHAVIORAL_FEATURE__FEATURING_CLASSIFIER, null));
		}
		return featuringClassifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Classifier getFeaturingClassifier(String name) {
		for (Iterator i = getFeaturingClassifiers().iterator(); i.hasNext();) {
			Classifier featuringClassifier = (Classifier) i.next();
			if (name.equals(featuringClassifier.getName())) {
				return featuringClassifier;
			}
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isStatic() {
		return (eFlags & IS_STATIC_EFLAG) != 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsStatic(boolean newIsStatic) {
		boolean oldIsStatic = (eFlags & IS_STATIC_EFLAG) != 0;
		if (newIsStatic)
			eFlags |= IS_STATIC_EFLAG;
		else
			eFlags &= ~IS_STATIC_EFLAG;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.BEHAVIORAL_FEATURE__IS_STATIC, oldIsStatic,
				newIsStatic));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getOwnedMembers() {
		EList ownedMember = (EList) eVirtualGet(UMLPackage.BEHAVIORAL_FEATURE__OWNED_MEMBER);
		if (ownedMember == null) {
			eVirtualSet(UMLPackage.BEHAVIORAL_FEATURE__OWNED_MEMBER,
				ownedMember = new DerivedUnionEObjectEList(NamedElement.class,
					this, UMLPackage.BEHAVIORAL_FEATURE__OWNED_MEMBER,
					new int[]{UMLPackage.BEHAVIORAL_FEATURE__OWNED_RULE,
						UMLPackage.BEHAVIORAL_FEATURE__OWNED_PARAMETER,
						UMLPackage.BEHAVIORAL_FEATURE__OWNED_PARAMETER_SET}));
		}
		return ownedMember;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getOwnedParameters() {
		EList ownedParameter = (EList) eVirtualGet(UMLPackage.BEHAVIORAL_FEATURE__OWNED_PARAMETER);
		if (ownedParameter == null) {
			eVirtualSet(UMLPackage.BEHAVIORAL_FEATURE__OWNED_PARAMETER,
				ownedParameter = new EObjectContainmentEList(Parameter.class,
					this, UMLPackage.BEHAVIORAL_FEATURE__OWNED_PARAMETER));
		}
		return ownedParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parameter createOwnedParameter() {
		Parameter newOwnedParameter = UMLFactory.eINSTANCE.createParameter();
		getOwnedParameters().add(newOwnedParameter);
		return newOwnedParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parameter getOwnedParameter(String name) {
		for (Iterator i = getOwnedParameters().iterator(); i.hasNext();) {
			Parameter ownedParameter = (Parameter) i.next();
			if (name.equals(ownedParameter.getName())) {
				return ownedParameter;
			}
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAbstract() {
		return (eFlags & IS_ABSTRACT_EFLAG) != 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsAbstract(boolean newIsAbstract) {
		boolean oldIsAbstract = (eFlags & IS_ABSTRACT_EFLAG) != 0;
		if (newIsAbstract)
			eFlags |= IS_ABSTRACT_EFLAG;
		else
			eFlags &= ~IS_ABSTRACT_EFLAG;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.BEHAVIORAL_FEATURE__IS_ABSTRACT, oldIsAbstract,
				newIsAbstract));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getMethods() {
		EList method = (EList) eVirtualGet(UMLPackage.BEHAVIORAL_FEATURE__METHOD);
		if (method == null) {
			eVirtualSet(UMLPackage.BEHAVIORAL_FEATURE__METHOD,
				method = new EObjectWithInverseResolvingEList(Behavior.class,
					this, UMLPackage.BEHAVIORAL_FEATURE__METHOD,
					UMLPackage.BEHAVIOR__SPECIFICATION));
		}
		return method;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Behavior getMethod(String name) {
		for (Iterator i = getMethods().iterator(); i.hasNext();) {
			Behavior method = (Behavior) i.next();
			if (name.equals(method.getName())) {
				return method;
			}
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CallConcurrencyKind getConcurrency() {
		return (CallConcurrencyKind) eVirtualGet(
			UMLPackage.BEHAVIORAL_FEATURE__CONCURRENCY, CONCURRENCY_EDEFAULT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConcurrency(CallConcurrencyKind newConcurrency) {
		CallConcurrencyKind concurrency = newConcurrency == null
			? CONCURRENCY_EDEFAULT
			: newConcurrency;
		Object oldConcurrency = eVirtualSet(
			UMLPackage.BEHAVIORAL_FEATURE__CONCURRENCY, concurrency);
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.BEHAVIORAL_FEATURE__CONCURRENCY,
				oldConcurrency == EVIRTUAL_NO_VALUE
					? CONCURRENCY_EDEFAULT
					: oldConcurrency, concurrency));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getRaisedExceptions() {
		EList raisedException = (EList) eVirtualGet(UMLPackage.BEHAVIORAL_FEATURE__RAISED_EXCEPTION);
		if (raisedException == null) {
			eVirtualSet(UMLPackage.BEHAVIORAL_FEATURE__RAISED_EXCEPTION,
				raisedException = new EObjectResolvingEList(Type.class, this,
					UMLPackage.BEHAVIORAL_FEATURE__RAISED_EXCEPTION));
		}
		return raisedException;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type getRaisedException(String name) {
		for (Iterator i = getRaisedExceptions().iterator(); i.hasNext();) {
			Type raisedException = (Type) i.next();
			if (name.equals(raisedException.getName())) {
				return raisedException;
			}
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getOwnedParameterSets() {
		EList ownedParameterSet = (EList) eVirtualGet(UMLPackage.BEHAVIORAL_FEATURE__OWNED_PARAMETER_SET);
		if (ownedParameterSet == null) {
			eVirtualSet(UMLPackage.BEHAVIORAL_FEATURE__OWNED_PARAMETER_SET,
				ownedParameterSet = new EObjectContainmentEList(
					ParameterSet.class, this,
					UMLPackage.BEHAVIORAL_FEATURE__OWNED_PARAMETER_SET));
		}
		return ownedParameterSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterSet createOwnedParameterSet() {
		ParameterSet newOwnedParameterSet = UMLFactory.eINSTANCE
			.createParameterSet();
		getOwnedParameterSets().add(newOwnedParameterSet);
		return newOwnedParameterSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterSet getOwnedParameterSet(String name) {
		for (Iterator i = getOwnedParameterSets().iterator(); i.hasNext();) {
			ParameterSet ownedParameterSet = (ParameterSet) i.next();
			if (name.equals(ownedParameterSet.getName())) {
				return ownedParameterSet;
			}
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRedefinitionContextValid(
			DiagnosticChain diagnostics, Map context) {
		return RedefinableElementOperations.validateRedefinitionContextValid(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRedefinitionConsistent(DiagnosticChain diagnostics,
			Map context) {
		return RedefinableElementOperations.validateRedefinitionConsistent(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isRedefinitionContextValid(RedefinableElement redefined) {
		return RedefinableElementOperations.isRedefinitionContextValid(this,
			redefined);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isConsistentWith(RedefinableElement redefinee) {
		return RedefinableElementOperations.isConsistentWith(this, redefinee);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isDistinguishableFrom(NamedElement n, Namespace ns) {
		return BehavioralFeatureOperations.isDistinguishableFrom(this, n, ns);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UMLPackage.BEHAVIORAL_FEATURE__EANNOTATIONS :
				return ((InternalEList) getEAnnotations()).basicAdd(otherEnd,
					msgs);
			case UMLPackage.BEHAVIORAL_FEATURE__CLIENT_DEPENDENCY :
				return ((InternalEList) getClientDependencies()).basicAdd(
					otherEnd, msgs);
			case UMLPackage.BEHAVIORAL_FEATURE__ELEMENT_IMPORT :
				return ((InternalEList) getElementImports()).basicAdd(otherEnd,
					msgs);
			case UMLPackage.BEHAVIORAL_FEATURE__PACKAGE_IMPORT :
				return ((InternalEList) getPackageImports()).basicAdd(otherEnd,
					msgs);
			case UMLPackage.BEHAVIORAL_FEATURE__OWNED_RULE :
				return ((InternalEList) getOwnedRules()).basicAdd(otherEnd,
					msgs);
			case UMLPackage.BEHAVIORAL_FEATURE__METHOD :
				return ((InternalEList) getMethods()).basicAdd(otherEnd, msgs);
		}
		return eDynamicInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UMLPackage.BEHAVIORAL_FEATURE__EANNOTATIONS :
				return ((InternalEList) getEAnnotations()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.BEHAVIORAL_FEATURE__OWNED_COMMENT :
				return ((InternalEList) getOwnedComments()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.BEHAVIORAL_FEATURE__CLIENT_DEPENDENCY :
				return ((InternalEList) getClientDependencies()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.BEHAVIORAL_FEATURE__NAME_EXPRESSION :
				return basicSetNameExpression(null, msgs);
			case UMLPackage.BEHAVIORAL_FEATURE__ELEMENT_IMPORT :
				return ((InternalEList) getElementImports()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.BEHAVIORAL_FEATURE__PACKAGE_IMPORT :
				return ((InternalEList) getPackageImports()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.BEHAVIORAL_FEATURE__OWNED_RULE :
				return ((InternalEList) getOwnedRules()).basicRemove(otherEnd,
					msgs);
			case UMLPackage.BEHAVIORAL_FEATURE__OWNED_PARAMETER :
				return ((InternalEList) getOwnedParameters()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.BEHAVIORAL_FEATURE__METHOD :
				return ((InternalEList) getMethods()).basicRemove(otherEnd,
					msgs);
			case UMLPackage.BEHAVIORAL_FEATURE__OWNED_PARAMETER_SET :
				return ((InternalEList) getOwnedParameterSets()).basicRemove(
					otherEnd, msgs);
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
			case UMLPackage.BEHAVIORAL_FEATURE__EANNOTATIONS :
				return getEAnnotations();
			case UMLPackage.BEHAVIORAL_FEATURE__OWNED_ELEMENT :
				return getOwnedElements();
			case UMLPackage.BEHAVIORAL_FEATURE__OWNER :
				if (resolve)
					return getOwner();
				return basicGetOwner();
			case UMLPackage.BEHAVIORAL_FEATURE__OWNED_COMMENT :
				return getOwnedComments();
			case UMLPackage.BEHAVIORAL_FEATURE__NAME :
				return getName();
			case UMLPackage.BEHAVIORAL_FEATURE__VISIBILITY :
				return getVisibility();
			case UMLPackage.BEHAVIORAL_FEATURE__QUALIFIED_NAME :
				return getQualifiedName();
			case UMLPackage.BEHAVIORAL_FEATURE__CLIENT_DEPENDENCY :
				return getClientDependencies();
			case UMLPackage.BEHAVIORAL_FEATURE__NAMESPACE :
				if (resolve)
					return getNamespace();
				return basicGetNamespace();
			case UMLPackage.BEHAVIORAL_FEATURE__NAME_EXPRESSION :
				return getNameExpression();
			case UMLPackage.BEHAVIORAL_FEATURE__ELEMENT_IMPORT :
				return getElementImports();
			case UMLPackage.BEHAVIORAL_FEATURE__PACKAGE_IMPORT :
				return getPackageImports();
			case UMLPackage.BEHAVIORAL_FEATURE__OWNED_RULE :
				return getOwnedRules();
			case UMLPackage.BEHAVIORAL_FEATURE__MEMBER :
				return getMembers();
			case UMLPackage.BEHAVIORAL_FEATURE__IMPORTED_MEMBER :
				return getImportedMembers();
			case UMLPackage.BEHAVIORAL_FEATURE__OWNED_MEMBER :
				return getOwnedMembers();
			case UMLPackage.BEHAVIORAL_FEATURE__IS_LEAF :
				return isLeaf()
					? Boolean.TRUE
					: Boolean.FALSE;
			case UMLPackage.BEHAVIORAL_FEATURE__REDEFINED_ELEMENT :
				return getRedefinedElements();
			case UMLPackage.BEHAVIORAL_FEATURE__REDEFINITION_CONTEXT :
				return getRedefinitionContexts();
			case UMLPackage.BEHAVIORAL_FEATURE__IS_STATIC :
				return isStatic()
					? Boolean.TRUE
					: Boolean.FALSE;
			case UMLPackage.BEHAVIORAL_FEATURE__FEATURING_CLASSIFIER :
				return getFeaturingClassifiers();
			case UMLPackage.BEHAVIORAL_FEATURE__OWNED_PARAMETER :
				return getOwnedParameters();
			case UMLPackage.BEHAVIORAL_FEATURE__IS_ABSTRACT :
				return isAbstract()
					? Boolean.TRUE
					: Boolean.FALSE;
			case UMLPackage.BEHAVIORAL_FEATURE__METHOD :
				return getMethods();
			case UMLPackage.BEHAVIORAL_FEATURE__CONCURRENCY :
				return getConcurrency();
			case UMLPackage.BEHAVIORAL_FEATURE__RAISED_EXCEPTION :
				return getRaisedExceptions();
			case UMLPackage.BEHAVIORAL_FEATURE__OWNED_PARAMETER_SET :
				return getOwnedParameterSets();
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
			case UMLPackage.BEHAVIORAL_FEATURE__EANNOTATIONS :
				getEAnnotations().clear();
				getEAnnotations().addAll((Collection) newValue);
				return;
			case UMLPackage.BEHAVIORAL_FEATURE__OWNED_COMMENT :
				getOwnedComments().clear();
				getOwnedComments().addAll((Collection) newValue);
				return;
			case UMLPackage.BEHAVIORAL_FEATURE__NAME :
				setName((String) newValue);
				return;
			case UMLPackage.BEHAVIORAL_FEATURE__VISIBILITY :
				setVisibility((VisibilityKind) newValue);
				return;
			case UMLPackage.BEHAVIORAL_FEATURE__CLIENT_DEPENDENCY :
				getClientDependencies().clear();
				getClientDependencies().addAll((Collection) newValue);
				return;
			case UMLPackage.BEHAVIORAL_FEATURE__NAME_EXPRESSION :
				setNameExpression((StringExpression) newValue);
				return;
			case UMLPackage.BEHAVIORAL_FEATURE__ELEMENT_IMPORT :
				getElementImports().clear();
				getElementImports().addAll((Collection) newValue);
				return;
			case UMLPackage.BEHAVIORAL_FEATURE__PACKAGE_IMPORT :
				getPackageImports().clear();
				getPackageImports().addAll((Collection) newValue);
				return;
			case UMLPackage.BEHAVIORAL_FEATURE__OWNED_RULE :
				getOwnedRules().clear();
				getOwnedRules().addAll((Collection) newValue);
				return;
			case UMLPackage.BEHAVIORAL_FEATURE__IS_LEAF :
				setIsLeaf(((Boolean) newValue).booleanValue());
				return;
			case UMLPackage.BEHAVIORAL_FEATURE__IS_STATIC :
				setIsStatic(((Boolean) newValue).booleanValue());
				return;
			case UMLPackage.BEHAVIORAL_FEATURE__OWNED_PARAMETER :
				getOwnedParameters().clear();
				getOwnedParameters().addAll((Collection) newValue);
				return;
			case UMLPackage.BEHAVIORAL_FEATURE__IS_ABSTRACT :
				setIsAbstract(((Boolean) newValue).booleanValue());
				return;
			case UMLPackage.BEHAVIORAL_FEATURE__METHOD :
				getMethods().clear();
				getMethods().addAll((Collection) newValue);
				return;
			case UMLPackage.BEHAVIORAL_FEATURE__CONCURRENCY :
				setConcurrency((CallConcurrencyKind) newValue);
				return;
			case UMLPackage.BEHAVIORAL_FEATURE__RAISED_EXCEPTION :
				getRaisedExceptions().clear();
				getRaisedExceptions().addAll((Collection) newValue);
				return;
			case UMLPackage.BEHAVIORAL_FEATURE__OWNED_PARAMETER_SET :
				getOwnedParameterSets().clear();
				getOwnedParameterSets().addAll((Collection) newValue);
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
			case UMLPackage.BEHAVIORAL_FEATURE__EANNOTATIONS :
				getEAnnotations().clear();
				return;
			case UMLPackage.BEHAVIORAL_FEATURE__OWNED_COMMENT :
				getOwnedComments().clear();
				return;
			case UMLPackage.BEHAVIORAL_FEATURE__NAME :
				unsetName();
				return;
			case UMLPackage.BEHAVIORAL_FEATURE__VISIBILITY :
				unsetVisibility();
				return;
			case UMLPackage.BEHAVIORAL_FEATURE__CLIENT_DEPENDENCY :
				getClientDependencies().clear();
				return;
			case UMLPackage.BEHAVIORAL_FEATURE__NAME_EXPRESSION :
				setNameExpression((StringExpression) null);
				return;
			case UMLPackage.BEHAVIORAL_FEATURE__ELEMENT_IMPORT :
				getElementImports().clear();
				return;
			case UMLPackage.BEHAVIORAL_FEATURE__PACKAGE_IMPORT :
				getPackageImports().clear();
				return;
			case UMLPackage.BEHAVIORAL_FEATURE__OWNED_RULE :
				getOwnedRules().clear();
				return;
			case UMLPackage.BEHAVIORAL_FEATURE__IS_LEAF :
				setIsLeaf(IS_LEAF_EDEFAULT);
				return;
			case UMLPackage.BEHAVIORAL_FEATURE__IS_STATIC :
				setIsStatic(IS_STATIC_EDEFAULT);
				return;
			case UMLPackage.BEHAVIORAL_FEATURE__OWNED_PARAMETER :
				getOwnedParameters().clear();
				return;
			case UMLPackage.BEHAVIORAL_FEATURE__IS_ABSTRACT :
				setIsAbstract(IS_ABSTRACT_EDEFAULT);
				return;
			case UMLPackage.BEHAVIORAL_FEATURE__METHOD :
				getMethods().clear();
				return;
			case UMLPackage.BEHAVIORAL_FEATURE__CONCURRENCY :
				setConcurrency(CONCURRENCY_EDEFAULT);
				return;
			case UMLPackage.BEHAVIORAL_FEATURE__RAISED_EXCEPTION :
				getRaisedExceptions().clear();
				return;
			case UMLPackage.BEHAVIORAL_FEATURE__OWNED_PARAMETER_SET :
				getOwnedParameterSets().clear();
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
			case UMLPackage.BEHAVIORAL_FEATURE__EANNOTATIONS :
				EList eAnnotations = (EList) eVirtualGet(UMLPackage.BEHAVIORAL_FEATURE__EANNOTATIONS);
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UMLPackage.BEHAVIORAL_FEATURE__OWNED_ELEMENT :
				return isSetOwnedElements();
			case UMLPackage.BEHAVIORAL_FEATURE__OWNER :
				return isSetOwner();
			case UMLPackage.BEHAVIORAL_FEATURE__OWNED_COMMENT :
				EList ownedComment = (EList) eVirtualGet(UMLPackage.BEHAVIORAL_FEATURE__OWNED_COMMENT);
				return ownedComment != null && !ownedComment.isEmpty();
			case UMLPackage.BEHAVIORAL_FEATURE__NAME :
				return isSetName();
			case UMLPackage.BEHAVIORAL_FEATURE__VISIBILITY :
				return isSetVisibility();
			case UMLPackage.BEHAVIORAL_FEATURE__QUALIFIED_NAME :
				return QUALIFIED_NAME_EDEFAULT == null
					? getQualifiedName() != null
					: !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case UMLPackage.BEHAVIORAL_FEATURE__CLIENT_DEPENDENCY :
				EList clientDependency = (EList) eVirtualGet(UMLPackage.BEHAVIORAL_FEATURE__CLIENT_DEPENDENCY);
				return clientDependency != null && !clientDependency.isEmpty();
			case UMLPackage.BEHAVIORAL_FEATURE__NAMESPACE :
				return isSetNamespace();
			case UMLPackage.BEHAVIORAL_FEATURE__NAME_EXPRESSION :
				return eVirtualGet(UMLPackage.BEHAVIORAL_FEATURE__NAME_EXPRESSION) != null;
			case UMLPackage.BEHAVIORAL_FEATURE__ELEMENT_IMPORT :
				EList elementImport = (EList) eVirtualGet(UMLPackage.BEHAVIORAL_FEATURE__ELEMENT_IMPORT);
				return elementImport != null && !elementImport.isEmpty();
			case UMLPackage.BEHAVIORAL_FEATURE__PACKAGE_IMPORT :
				EList packageImport = (EList) eVirtualGet(UMLPackage.BEHAVIORAL_FEATURE__PACKAGE_IMPORT);
				return packageImport != null && !packageImport.isEmpty();
			case UMLPackage.BEHAVIORAL_FEATURE__OWNED_RULE :
				EList ownedRule = (EList) eVirtualGet(UMLPackage.BEHAVIORAL_FEATURE__OWNED_RULE);
				return ownedRule != null && !ownedRule.isEmpty();
			case UMLPackage.BEHAVIORAL_FEATURE__MEMBER :
				return isSetMembers();
			case UMLPackage.BEHAVIORAL_FEATURE__IMPORTED_MEMBER :
				return !getImportedMembers().isEmpty();
			case UMLPackage.BEHAVIORAL_FEATURE__OWNED_MEMBER :
				return isSetOwnedMembers();
			case UMLPackage.BEHAVIORAL_FEATURE__IS_LEAF :
				return ((eFlags & IS_LEAF_EFLAG) != 0) != IS_LEAF_EDEFAULT;
			case UMLPackage.BEHAVIORAL_FEATURE__REDEFINED_ELEMENT :
				return isSetRedefinedElements();
			case UMLPackage.BEHAVIORAL_FEATURE__REDEFINITION_CONTEXT :
				return isSetRedefinitionContexts();
			case UMLPackage.BEHAVIORAL_FEATURE__IS_STATIC :
				return ((eFlags & IS_STATIC_EFLAG) != 0) != IS_STATIC_EDEFAULT;
			case UMLPackage.BEHAVIORAL_FEATURE__FEATURING_CLASSIFIER :
				return isSetFeaturingClassifiers();
			case UMLPackage.BEHAVIORAL_FEATURE__OWNED_PARAMETER :
				EList ownedParameter = (EList) eVirtualGet(UMLPackage.BEHAVIORAL_FEATURE__OWNED_PARAMETER);
				return ownedParameter != null && !ownedParameter.isEmpty();
			case UMLPackage.BEHAVIORAL_FEATURE__IS_ABSTRACT :
				return ((eFlags & IS_ABSTRACT_EFLAG) != 0) != IS_ABSTRACT_EDEFAULT;
			case UMLPackage.BEHAVIORAL_FEATURE__METHOD :
				EList method = (EList) eVirtualGet(UMLPackage.BEHAVIORAL_FEATURE__METHOD);
				return method != null && !method.isEmpty();
			case UMLPackage.BEHAVIORAL_FEATURE__CONCURRENCY :
				return eVirtualGet(UMLPackage.BEHAVIORAL_FEATURE__CONCURRENCY,
					CONCURRENCY_EDEFAULT) != CONCURRENCY_EDEFAULT;
			case UMLPackage.BEHAVIORAL_FEATURE__RAISED_EXCEPTION :
				EList raisedException = (EList) eVirtualGet(UMLPackage.BEHAVIORAL_FEATURE__RAISED_EXCEPTION);
				return raisedException != null && !raisedException.isEmpty();
			case UMLPackage.BEHAVIORAL_FEATURE__OWNED_PARAMETER_SET :
				EList ownedParameterSet = (EList) eVirtualGet(UMLPackage.BEHAVIORAL_FEATURE__OWNED_PARAMETER_SET);
				return ownedParameterSet != null
					&& !ownedParameterSet.isEmpty();
		}
		return eDynamicIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class baseClass) {
		if (baseClass == RedefinableElement.class) {
			switch (derivedFeatureID) {
				case UMLPackage.BEHAVIORAL_FEATURE__IS_LEAF :
					return UMLPackage.REDEFINABLE_ELEMENT__IS_LEAF;
				case UMLPackage.BEHAVIORAL_FEATURE__REDEFINED_ELEMENT :
					return UMLPackage.REDEFINABLE_ELEMENT__REDEFINED_ELEMENT;
				case UMLPackage.BEHAVIORAL_FEATURE__REDEFINITION_CONTEXT :
					return UMLPackage.REDEFINABLE_ELEMENT__REDEFINITION_CONTEXT;
				default :
					return -1;
			}
		}
		if (baseClass == Feature.class) {
			switch (derivedFeatureID) {
				case UMLPackage.BEHAVIORAL_FEATURE__IS_STATIC :
					return UMLPackage.FEATURE__IS_STATIC;
				case UMLPackage.BEHAVIORAL_FEATURE__FEATURING_CLASSIFIER :
					return UMLPackage.FEATURE__FEATURING_CLASSIFIER;
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
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class baseClass) {
		if (baseClass == RedefinableElement.class) {
			switch (baseFeatureID) {
				case UMLPackage.REDEFINABLE_ELEMENT__IS_LEAF :
					return UMLPackage.BEHAVIORAL_FEATURE__IS_LEAF;
				case UMLPackage.REDEFINABLE_ELEMENT__REDEFINED_ELEMENT :
					return UMLPackage.BEHAVIORAL_FEATURE__REDEFINED_ELEMENT;
				case UMLPackage.REDEFINABLE_ELEMENT__REDEFINITION_CONTEXT :
					return UMLPackage.BEHAVIORAL_FEATURE__REDEFINITION_CONTEXT;
				default :
					return -1;
			}
		}
		if (baseClass == Feature.class) {
			switch (baseFeatureID) {
				case UMLPackage.FEATURE__IS_STATIC :
					return UMLPackage.BEHAVIORAL_FEATURE__IS_STATIC;
				case UMLPackage.FEATURE__FEATURING_CLASSIFIER :
					return UMLPackage.BEHAVIORAL_FEATURE__FEATURING_CLASSIFIER;
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
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (isLeaf: "); //$NON-NLS-1$
		result.append((eFlags & IS_LEAF_EFLAG) != 0);
		result.append(", isStatic: "); //$NON-NLS-1$
		result.append((eFlags & IS_STATIC_EFLAG) != 0);
		result.append(", isAbstract: "); //$NON-NLS-1$
		result.append((eFlags & IS_ABSTRACT_EFLAG) != 0);
		result.append(", concurrency: "); //$NON-NLS-1$
		result.append(eVirtualGet(UMLPackage.BEHAVIORAL_FEATURE__CONCURRENCY,
			CONCURRENCY_EDEFAULT));
		result.append(')');
		return result.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRedefinedElements() {
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRedefinitionContexts() {
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetFeaturingClassifiers() {
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOwnedMembers() {
		return super.isSetOwnedMembers()
			|| eIsSet(UMLPackage.BEHAVIORAL_FEATURE__OWNED_PARAMETER)
			|| eIsSet(UMLPackage.BEHAVIORAL_FEATURE__OWNED_PARAMETER_SET);
	}

} //BehavioralFeatureImpl
