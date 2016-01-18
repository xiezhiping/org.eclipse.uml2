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

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.uml2.common.util.CacheAdapter;
import org.eclipse.uml2.common.util.DerivedUnionEObjectEList;

import org.eclipse.uml2.uml.Behavior;
import org.eclipse.uml2.uml.BehavioralFeature;
import org.eclipse.uml2.uml.CallConcurrencyKind;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.Comment;
import org.eclipse.uml2.uml.Constraint;
import org.eclipse.uml2.uml.ElementImport;
import org.eclipse.uml2.uml.Feature;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Namespace;
import org.eclipse.uml2.uml.PackageImport;
import org.eclipse.uml2.uml.PackageableElement;
import org.eclipse.uml2.uml.Parameter;
import org.eclipse.uml2.uml.ParameterSet;
import org.eclipse.uml2.uml.RedefinableElement;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.StringExpression;
import org.eclipse.uml2.uml.Type;
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
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.BehavioralFeatureImpl#getRedefinedElements <em>Redefined Element</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.BehavioralFeatureImpl#getRedefinitionContexts <em>Redefinition Context</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.BehavioralFeatureImpl#isLeaf <em>Is Leaf</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.BehavioralFeatureImpl#getFeaturingClassifiers <em>Featuring Classifier</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.BehavioralFeatureImpl#isStatic <em>Is Static</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.BehavioralFeatureImpl#getOwnedMembers <em>Owned Member</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.BehavioralFeatureImpl#getConcurrency <em>Concurrency</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.BehavioralFeatureImpl#isAbstract <em>Is Abstract</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.BehavioralFeatureImpl#getMethods <em>Method</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.BehavioralFeatureImpl#getOwnedParameters <em>Owned Parameter</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.BehavioralFeatureImpl#getOwnedParameterSets <em>Owned Parameter Set</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.BehavioralFeatureImpl#getRaisedExceptions <em>Raised Exception</em>}</li>
 * </ul>
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
	protected static final int IS_LEAF_EFLAG = 1 << 12;

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
	protected static final int IS_STATIC_EFLAG = 1 << 13;

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
	 * The offset of the flags representing the value of the '{@link #getConcurrency() <em>Concurrency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected static final int CONCURRENCY_EFLAG_OFFSET = 14;

	/**
	 * The flags representing the default value of the '{@link #getConcurrency() <em>Concurrency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected static final int CONCURRENCY_EFLAG_DEFAULT = CONCURRENCY_EDEFAULT
		.ordinal() << CONCURRENCY_EFLAG_OFFSET;

	/**
	 * The array of enumeration values for '{@link CallConcurrencyKind Call Concurrency Kind}'
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	private static final CallConcurrencyKind[] CONCURRENCY_EFLAG_VALUES = CallConcurrencyKind
		.values();

	/**
	 * The flags representing the value of the '{@link #getConcurrency() <em>Concurrency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConcurrency()
	 * @generated
	 * @ordered
	 */
	protected static final int CONCURRENCY_EFLAG = 0x3 << CONCURRENCY_EFLAG_OFFSET;

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
	protected static final int IS_ABSTRACT_EFLAG = 1 << 16;

	/**
	 * The cached value of the '{@link #getMethods() <em>Method</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethods()
	 * @generated
	 * @ordered
	 */
	protected EList<Behavior> methods;

	/**
	 * The cached value of the '{@link #getOwnedParameters() <em>Owned Parameter</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<Parameter> ownedParameters;

	/**
	 * The cached value of the '{@link #getOwnedParameterSets() <em>Owned Parameter Set</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedParameterSets()
	 * @generated
	 * @ordered
	 */
	protected EList<ParameterSet> ownedParameterSets;

	/**
	 * The cached value of the '{@link #getRaisedExceptions() <em>Raised Exception</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRaisedExceptions()
	 * @generated
	 * @ordered
	 */
	protected EList<Type> raisedExceptions;

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
	@Override
	protected EClass eStaticClass() {
		return UMLPackage.Literals.BEHAVIORAL_FEATURE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RedefinableElement> getRedefinedElements() {
		CacheAdapter cache = getCacheAdapter();
		if (cache != null) {
			Resource eResource = eResource();
			@SuppressWarnings("unchecked")
			EList<RedefinableElement> redefinedElements = (EList<RedefinableElement>) cache
				.get(eResource, this,
					UMLPackage.Literals.REDEFINABLE_ELEMENT__REDEFINED_ELEMENT);
			if (redefinedElements == null) {
				cache.put(eResource, this,
					UMLPackage.Literals.REDEFINABLE_ELEMENT__REDEFINED_ELEMENT,
					redefinedElements = new DerivedUnionEObjectEList<RedefinableElement>(
						RedefinableElement.class, this,
						UMLPackage.BEHAVIORAL_FEATURE__REDEFINED_ELEMENT,
						null));
			}
			return redefinedElements;
		}
		return new DerivedUnionEObjectEList<RedefinableElement>(
			RedefinableElement.class, this,
			UMLPackage.BEHAVIORAL_FEATURE__REDEFINED_ELEMENT, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RedefinableElement getRedefinedElement(String name) {
		return getRedefinedElement(name, false, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RedefinableElement getRedefinedElement(String name,
			boolean ignoreCase, EClass eClass) {
		redefinedElementLoop : for (RedefinableElement redefinedElement : getRedefinedElements()) {
			if (eClass != null && !eClass.isInstance(redefinedElement))
				continue redefinedElementLoop;
			if (name != null && !(ignoreCase
				? name.equalsIgnoreCase(redefinedElement.getName())
				: name.equals(redefinedElement.getName())))
				continue redefinedElementLoop;
			return redefinedElement;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Classifier> getRedefinitionContextsGen() {
		CacheAdapter cache = getCacheAdapter();
		if (cache != null) {
			Resource eResource = eResource();
			@SuppressWarnings("unchecked")
			EList<Classifier> redefinitionContexts = (EList<Classifier>) cache
				.get(eResource, this,
					UMLPackage.Literals.REDEFINABLE_ELEMENT__REDEFINITION_CONTEXT);
			if (redefinitionContexts == null) {
				cache.put(eResource, this,
					UMLPackage.Literals.REDEFINABLE_ELEMENT__REDEFINITION_CONTEXT,
					redefinitionContexts = new DerivedUnionEObjectEList<Classifier>(
						Classifier.class, this,
						UMLPackage.BEHAVIORAL_FEATURE__REDEFINITION_CONTEXT,
						null));
			}
			return redefinitionContexts;
		}
		return new DerivedUnionEObjectEList<Classifier>(Classifier.class, this,
			UMLPackage.BEHAVIORAL_FEATURE__REDEFINITION_CONTEXT, null);
	}

	/**
	 * The array of subset feature identifiers for the '{@link #getRedefinitionContexts() <em>Redefinition Context</em>}' reference list.
	 * @see #getRedefinitionContexts()
	 */
	protected static final int[] REDEFINITION_CONTEXT_ESUBSETS = new int[]{
		UMLPackage.BEHAVIORAL_FEATURE__NAMESPACE};

	public EList<Classifier> getRedefinitionContexts() {
		CacheAdapter cache = getCacheAdapter();
		if (cache != null) {
			Resource eResource = eResource();
			@SuppressWarnings("unchecked")
			EList<Classifier> redefinitionContext = (EList<Classifier>) cache
				.get(eResource, this,
					UMLPackage.Literals.REDEFINABLE_ELEMENT__REDEFINITION_CONTEXT);
			if (redefinitionContext == null) {
				cache.put(eResource, this,
					UMLPackage.Literals.REDEFINABLE_ELEMENT__REDEFINITION_CONTEXT,
					redefinitionContext = new DerivedUnionEObjectEList<Classifier>(
						Classifier.class, this,
						UMLPackage.BEHAVIORAL_FEATURE__REDEFINITION_CONTEXT,
						REDEFINITION_CONTEXT_ESUBSETS));
			}
			return redefinitionContext;
		}
		return new DerivedUnionEObjectEList<Classifier>(Classifier.class, this,
			UMLPackage.BEHAVIORAL_FEATURE__REDEFINITION_CONTEXT,
			REDEFINITION_CONTEXT_ESUBSETS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Classifier getRedefinitionContext(String name) {
		return getRedefinitionContext(name, false, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Classifier getRedefinitionContext(String name, boolean ignoreCase,
			EClass eClass) {
		redefinitionContextLoop : for (Classifier redefinitionContext : getRedefinitionContexts()) {
			if (eClass != null && !eClass.isInstance(redefinitionContext))
				continue redefinitionContextLoop;
			if (name != null && !(ignoreCase
				? name.equalsIgnoreCase(redefinitionContext.getName())
				: name.equals(redefinitionContext.getName())))
				continue redefinitionContextLoop;
			return redefinitionContext;
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
	public EList<Classifier> getFeaturingClassifiersGen() {
		CacheAdapter cache = getCacheAdapter();
		if (cache != null) {
			Resource eResource = eResource();
			@SuppressWarnings("unchecked")
			EList<Classifier> featuringClassifiers = (EList<Classifier>) cache
				.get(eResource, this,
					UMLPackage.Literals.FEATURE__FEATURING_CLASSIFIER);
			if (featuringClassifiers == null) {
				cache.put(eResource, this,
					UMLPackage.Literals.FEATURE__FEATURING_CLASSIFIER,
					featuringClassifiers = new DerivedUnionEObjectEList<Classifier>(
						Classifier.class, this,
						UMLPackage.BEHAVIORAL_FEATURE__FEATURING_CLASSIFIER,
						null));
			}
			return featuringClassifiers;
		}
		return new DerivedUnionEObjectEList<Classifier>(Classifier.class, this,
			UMLPackage.BEHAVIORAL_FEATURE__FEATURING_CLASSIFIER, null);
	}

	/**
	 * The array of subset feature identifiers for the '{@link #getFeaturingClassifiers() <em>Featuring Classifier</em>}' reference list.
	 * @see #getFeaturingClassifiers()
	 */
	protected static final int[] FEATURING_CLASSIFIER_ESUBSETS = new int[]{
		UMLPackage.BEHAVIORAL_FEATURE__NAMESPACE};

	public EList<Classifier> getFeaturingClassifiers() {
		CacheAdapter cache = getCacheAdapter();
		if (cache != null) {
			Resource eResource = eResource();
			@SuppressWarnings("unchecked")
			EList<Classifier> featuringClassifiers = (EList<Classifier>) cache
				.get(eResource, this,
					UMLPackage.Literals.FEATURE__FEATURING_CLASSIFIER);
			if (featuringClassifiers == null) {
				cache.put(eResource, this,
					UMLPackage.Literals.FEATURE__FEATURING_CLASSIFIER,
					featuringClassifiers = new DerivedUnionEObjectEList<Classifier>(
						Classifier.class, this,
						UMLPackage.BEHAVIORAL_FEATURE__FEATURING_CLASSIFIER,
						FEATURING_CLASSIFIER_ESUBSETS));
			}
			return featuringClassifiers;
		}
		return new DerivedUnionEObjectEList<Classifier>(Classifier.class, this,
			UMLPackage.BEHAVIORAL_FEATURE__FEATURING_CLASSIFIER,
			FEATURING_CLASSIFIER_ESUBSETS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Classifier getFeaturingClassifier(String name) {
		return getFeaturingClassifier(name, false, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Classifier getFeaturingClassifier(String name, boolean ignoreCase,
			EClass eClass) {
		featuringClassifierLoop : for (Classifier featuringClassifier : getFeaturingClassifiers()) {
			if (eClass != null && !eClass.isInstance(featuringClassifier))
				continue featuringClassifierLoop;
			if (name != null && !(ignoreCase
				? name.equalsIgnoreCase(featuringClassifier.getName())
				: name.equals(featuringClassifier.getName())))
				continue featuringClassifierLoop;
			return featuringClassifier;
		}
		return null;
	}

	/**
	 * The array of subset feature identifiers for the '{@link #getOwnedMembers() <em>Owned Member</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedMembers()
	 * @generated
	 * @ordered
	 */
	protected static final int[] OWNED_MEMBER_ESUBSETS = new int[]{
		UMLPackage.BEHAVIORAL_FEATURE__OWNED_RULE,
		UMLPackage.BEHAVIORAL_FEATURE__OWNED_PARAMETER,
		UMLPackage.BEHAVIORAL_FEATURE__OWNED_PARAMETER_SET};

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
	@Override
	public EList<NamedElement> getOwnedMembers() {
		CacheAdapter cache = getCacheAdapter();
		if (cache != null) {
			Resource eResource = eResource();
			@SuppressWarnings("unchecked")
			EList<NamedElement> ownedMembers = (EList<NamedElement>) cache.get(
				eResource, this, UMLPackage.Literals.NAMESPACE__OWNED_MEMBER);
			if (ownedMembers == null) {
				cache.put(eResource, this,
					UMLPackage.Literals.NAMESPACE__OWNED_MEMBER,
					ownedMembers = new DerivedUnionEObjectEList<NamedElement>(
						NamedElement.class, this,
						UMLPackage.BEHAVIORAL_FEATURE__OWNED_MEMBER,
						OWNED_MEMBER_ESUBSETS));
			}
			return ownedMembers;
		}
		return new DerivedUnionEObjectEList<NamedElement>(NamedElement.class,
			this, UMLPackage.BEHAVIORAL_FEATURE__OWNED_MEMBER,
			OWNED_MEMBER_ESUBSETS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Parameter> getOwnedParameters() {
		if (ownedParameters == null) {
			ownedParameters = new EObjectContainmentEList.Resolving<Parameter>(
				Parameter.class, this,
				UMLPackage.BEHAVIORAL_FEATURE__OWNED_PARAMETER);
		}
		return ownedParameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parameter createOwnedParameter(String name, Type type) {
		Parameter newOwnedParameter = (Parameter) create(
			UMLPackage.Literals.PARAMETER);
		getOwnedParameters().add(newOwnedParameter);
		if (name != null)
			newOwnedParameter.setName(name);
		if (type != null)
			newOwnedParameter.setType(type);
		return newOwnedParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parameter getOwnedParameter(String name, Type type) {
		return getOwnedParameter(name, type, false, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parameter getOwnedParameter(String name, Type type,
			boolean ignoreCase, boolean createOnDemand) {
		ownedParameterLoop : for (Parameter ownedParameter : getOwnedParameters()) {
			if (name != null && !(ignoreCase
				? name.equalsIgnoreCase(ownedParameter.getName())
				: name.equals(ownedParameter.getName())))
				continue ownedParameterLoop;
			if (type != null && !type.equals(ownedParameter.getType()))
				continue ownedParameterLoop;
			return ownedParameter;
		}
		return createOnDemand
			? createOwnedParameter(name, type)
			: null;
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
	public EList<Behavior> getMethods() {
		if (methods == null) {
			methods = new EObjectWithInverseResolvingEList<Behavior>(
				Behavior.class, this, UMLPackage.BEHAVIORAL_FEATURE__METHOD,
				UMLPackage.BEHAVIOR__SPECIFICATION);
		}
		return methods;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Behavior getMethod(String name) {
		return getMethod(name, false, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Behavior getMethod(String name, boolean ignoreCase, EClass eClass) {
		methodLoop : for (Behavior method : getMethods()) {
			if (eClass != null && !eClass.isInstance(method))
				continue methodLoop;
			if (name != null && !(ignoreCase
				? name.equalsIgnoreCase(method.getName())
				: name.equals(method.getName())))
				continue methodLoop;
			return method;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CallConcurrencyKind getConcurrency() {
		return CONCURRENCY_EFLAG_VALUES[(eFlags
			& CONCURRENCY_EFLAG) >>> CONCURRENCY_EFLAG_OFFSET];
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConcurrency(CallConcurrencyKind newConcurrency) {
		CallConcurrencyKind oldConcurrency = CONCURRENCY_EFLAG_VALUES[(eFlags
			& CONCURRENCY_EFLAG) >>> CONCURRENCY_EFLAG_OFFSET];
		if (newConcurrency == null)
			newConcurrency = CONCURRENCY_EDEFAULT;
		eFlags = eFlags & ~CONCURRENCY_EFLAG
			| newConcurrency.ordinal() << CONCURRENCY_EFLAG_OFFSET;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.BEHAVIORAL_FEATURE__CONCURRENCY, oldConcurrency,
				newConcurrency));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Type> getRaisedExceptions() {
		if (raisedExceptions == null) {
			raisedExceptions = new EObjectResolvingEList<Type>(Type.class, this,
				UMLPackage.BEHAVIORAL_FEATURE__RAISED_EXCEPTION);
		}
		return raisedExceptions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type getRaisedException(String name) {
		return getRaisedException(name, false, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type getRaisedException(String name, boolean ignoreCase,
			EClass eClass) {
		raisedExceptionLoop : for (Type raisedException : getRaisedExceptions()) {
			if (eClass != null && !eClass.isInstance(raisedException))
				continue raisedExceptionLoop;
			if (name != null && !(ignoreCase
				? name.equalsIgnoreCase(raisedException.getName())
				: name.equals(raisedException.getName())))
				continue raisedExceptionLoop;
			return raisedException;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ParameterSet> getOwnedParameterSets() {
		if (ownedParameterSets == null) {
			ownedParameterSets = new EObjectContainmentEList.Resolving<ParameterSet>(
				ParameterSet.class, this,
				UMLPackage.BEHAVIORAL_FEATURE__OWNED_PARAMETER_SET);
		}
		return ownedParameterSets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterSet createOwnedParameterSet(String name) {
		ParameterSet newOwnedParameterSet = (ParameterSet) create(
			UMLPackage.Literals.PARAMETER_SET);
		getOwnedParameterSets().add(newOwnedParameterSet);
		if (name != null)
			newOwnedParameterSet.setName(name);
		return newOwnedParameterSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterSet getOwnedParameterSet(String name) {
		return getOwnedParameterSet(name, false, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterSet getOwnedParameterSet(String name, boolean ignoreCase,
			boolean createOnDemand) {
		ownedParameterSetLoop : for (ParameterSet ownedParameterSet : getOwnedParameterSets()) {
			if (name != null && !(ignoreCase
				? name.equalsIgnoreCase(ownedParameterSet.getName())
				: name.equals(ownedParameterSet.getName())))
				continue ownedParameterSetLoop;
			return ownedParameterSet;
		}
		return createOnDemand
			? createOwnedParameterSet(name)
			: null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRedefinitionContextValid(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return RedefinableElementOperations
			.validateRedefinitionContextValid(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRedefinitionConsistent(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return RedefinableElementOperations.validateRedefinitionConsistent(this,
			diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNonLeafRedefinition(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return RedefinableElementOperations.validateNonLeafRedefinition(this,
			diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isRedefinitionContextValid(
			RedefinableElement redefinedElement) {
		return RedefinableElementOperations.isRedefinitionContextValid(this,
			redefinedElement);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAbstractNoMethod(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return BehavioralFeatureOperations.validateAbstractNoMethod(this,
			diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parameter createReturnResult(String name, Type type) {
		return BehavioralFeatureOperations.createReturnResult(this, name, type);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Parameter> inputParameters() {
		CacheAdapter cache = getCacheAdapter();
		if (cache != null) {
			@SuppressWarnings("unchecked")
			EList<Parameter> result = (EList<Parameter>) cache.get(this,
				UMLPackage.Literals.BEHAVIORAL_FEATURE___INPUT_PARAMETERS);
			if (result == null) {
				cache.put(this,
					UMLPackage.Literals.BEHAVIORAL_FEATURE___INPUT_PARAMETERS,
					result = BehavioralFeatureOperations.inputParameters(this));
			}
			return result;
		}
		return BehavioralFeatureOperations.inputParameters(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Parameter> outputParameters() {
		CacheAdapter cache = getCacheAdapter();
		if (cache != null) {
			@SuppressWarnings("unchecked")
			EList<Parameter> result = (EList<Parameter>) cache.get(this,
				UMLPackage.Literals.BEHAVIORAL_FEATURE___OUTPUT_PARAMETERS);
			if (result == null) {
				cache.put(this,
					UMLPackage.Literals.BEHAVIORAL_FEATURE___OUTPUT_PARAMETERS,
					result = BehavioralFeatureOperations
						.outputParameters(this));
			}
			return result;
		}
		return BehavioralFeatureOperations.outputParameters(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isConsistentWith(RedefinableElement redefiningElement) {
		return RedefinableElementOperations.isConsistentWith(this,
			redefiningElement);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isDistinguishableFrom(NamedElement n, Namespace ns) {
		return BehavioralFeatureOperations.isDistinguishableFrom(this, n, ns);
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
			case UMLPackage.BEHAVIORAL_FEATURE__EANNOTATIONS :
				return ((InternalEList<InternalEObject>) (InternalEList<?>) getEAnnotations())
					.basicAdd(otherEnd, msgs);
			case UMLPackage.BEHAVIORAL_FEATURE__OWNED_RULE :
				return ((InternalEList<InternalEObject>) (InternalEList<?>) getOwnedRules())
					.basicAdd(otherEnd, msgs);
			case UMLPackage.BEHAVIORAL_FEATURE__ELEMENT_IMPORT :
				return ((InternalEList<InternalEObject>) (InternalEList<?>) getElementImports())
					.basicAdd(otherEnd, msgs);
			case UMLPackage.BEHAVIORAL_FEATURE__PACKAGE_IMPORT :
				return ((InternalEList<InternalEObject>) (InternalEList<?>) getPackageImports())
					.basicAdd(otherEnd, msgs);
			case UMLPackage.BEHAVIORAL_FEATURE__METHOD :
				return ((InternalEList<InternalEObject>) (InternalEList<?>) getMethods())
					.basicAdd(otherEnd, msgs);
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
			case UMLPackage.BEHAVIORAL_FEATURE__EANNOTATIONS :
				return ((InternalEList<?>) getEAnnotations())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.BEHAVIORAL_FEATURE__OWNED_COMMENT :
				return ((InternalEList<?>) getOwnedComments())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.BEHAVIORAL_FEATURE__NAME_EXPRESSION :
				return basicSetNameExpression(null, msgs);
			case UMLPackage.BEHAVIORAL_FEATURE__OWNED_RULE :
				return ((InternalEList<?>) getOwnedRules())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.BEHAVIORAL_FEATURE__ELEMENT_IMPORT :
				return ((InternalEList<?>) getElementImports())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.BEHAVIORAL_FEATURE__PACKAGE_IMPORT :
				return ((InternalEList<?>) getPackageImports())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.BEHAVIORAL_FEATURE__METHOD :
				return ((InternalEList<?>) getMethods()).basicRemove(otherEnd,
					msgs);
			case UMLPackage.BEHAVIORAL_FEATURE__OWNED_PARAMETER :
				return ((InternalEList<?>) getOwnedParameters())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.BEHAVIORAL_FEATURE__OWNED_PARAMETER_SET :
				return ((InternalEList<?>) getOwnedParameterSets())
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
			case UMLPackage.BEHAVIORAL_FEATURE__EANNOTATIONS :
				return getEAnnotations();
			case UMLPackage.BEHAVIORAL_FEATURE__OWNED_COMMENT :
				return getOwnedComments();
			case UMLPackage.BEHAVIORAL_FEATURE__OWNED_ELEMENT :
				return getOwnedElements();
			case UMLPackage.BEHAVIORAL_FEATURE__OWNER :
				if (resolve)
					return getOwner();
				return basicGetOwner();
			case UMLPackage.BEHAVIORAL_FEATURE__CLIENT_DEPENDENCY :
				return getClientDependencies();
			case UMLPackage.BEHAVIORAL_FEATURE__NAME :
				return getName();
			case UMLPackage.BEHAVIORAL_FEATURE__NAME_EXPRESSION :
				if (resolve)
					return getNameExpression();
				return basicGetNameExpression();
			case UMLPackage.BEHAVIORAL_FEATURE__NAMESPACE :
				if (resolve)
					return getNamespace();
				return basicGetNamespace();
			case UMLPackage.BEHAVIORAL_FEATURE__QUALIFIED_NAME :
				return getQualifiedName();
			case UMLPackage.BEHAVIORAL_FEATURE__VISIBILITY :
				return getVisibility();
			case UMLPackage.BEHAVIORAL_FEATURE__OWNED_RULE :
				return getOwnedRules();
			case UMLPackage.BEHAVIORAL_FEATURE__ELEMENT_IMPORT :
				return getElementImports();
			case UMLPackage.BEHAVIORAL_FEATURE__PACKAGE_IMPORT :
				return getPackageImports();
			case UMLPackage.BEHAVIORAL_FEATURE__OWNED_MEMBER :
				return getOwnedMembers();
			case UMLPackage.BEHAVIORAL_FEATURE__IMPORTED_MEMBER :
				return getImportedMembers();
			case UMLPackage.BEHAVIORAL_FEATURE__MEMBER :
				return getMembers();
			case UMLPackage.BEHAVIORAL_FEATURE__IS_LEAF :
				return isLeaf();
			case UMLPackage.BEHAVIORAL_FEATURE__REDEFINED_ELEMENT :
				return getRedefinedElements();
			case UMLPackage.BEHAVIORAL_FEATURE__REDEFINITION_CONTEXT :
				return getRedefinitionContexts();
			case UMLPackage.BEHAVIORAL_FEATURE__FEATURING_CLASSIFIER :
				return getFeaturingClassifiers();
			case UMLPackage.BEHAVIORAL_FEATURE__IS_STATIC :
				return isStatic();
			case UMLPackage.BEHAVIORAL_FEATURE__CONCURRENCY :
				return getConcurrency();
			case UMLPackage.BEHAVIORAL_FEATURE__IS_ABSTRACT :
				return isAbstract();
			case UMLPackage.BEHAVIORAL_FEATURE__METHOD :
				return getMethods();
			case UMLPackage.BEHAVIORAL_FEATURE__OWNED_PARAMETER :
				return getOwnedParameters();
			case UMLPackage.BEHAVIORAL_FEATURE__OWNED_PARAMETER_SET :
				return getOwnedParameterSets();
			case UMLPackage.BEHAVIORAL_FEATURE__RAISED_EXCEPTION :
				return getRaisedExceptions();
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
			case UMLPackage.BEHAVIORAL_FEATURE__EANNOTATIONS :
				getEAnnotations().clear();
				getEAnnotations()
					.addAll((Collection<? extends EAnnotation>) newValue);
				return;
			case UMLPackage.BEHAVIORAL_FEATURE__OWNED_COMMENT :
				getOwnedComments().clear();
				getOwnedComments()
					.addAll((Collection<? extends Comment>) newValue);
				return;
			case UMLPackage.BEHAVIORAL_FEATURE__NAME :
				setName((String) newValue);
				return;
			case UMLPackage.BEHAVIORAL_FEATURE__NAME_EXPRESSION :
				setNameExpression((StringExpression) newValue);
				return;
			case UMLPackage.BEHAVIORAL_FEATURE__VISIBILITY :
				setVisibility((VisibilityKind) newValue);
				return;
			case UMLPackage.BEHAVIORAL_FEATURE__OWNED_RULE :
				getOwnedRules().clear();
				getOwnedRules()
					.addAll((Collection<? extends Constraint>) newValue);
				return;
			case UMLPackage.BEHAVIORAL_FEATURE__ELEMENT_IMPORT :
				getElementImports().clear();
				getElementImports()
					.addAll((Collection<? extends ElementImport>) newValue);
				return;
			case UMLPackage.BEHAVIORAL_FEATURE__PACKAGE_IMPORT :
				getPackageImports().clear();
				getPackageImports()
					.addAll((Collection<? extends PackageImport>) newValue);
				return;
			case UMLPackage.BEHAVIORAL_FEATURE__IS_LEAF :
				setIsLeaf((Boolean) newValue);
				return;
			case UMLPackage.BEHAVIORAL_FEATURE__IS_STATIC :
				setIsStatic((Boolean) newValue);
				return;
			case UMLPackage.BEHAVIORAL_FEATURE__CONCURRENCY :
				setConcurrency((CallConcurrencyKind) newValue);
				return;
			case UMLPackage.BEHAVIORAL_FEATURE__IS_ABSTRACT :
				setIsAbstract((Boolean) newValue);
				return;
			case UMLPackage.BEHAVIORAL_FEATURE__METHOD :
				getMethods().clear();
				getMethods().addAll((Collection<? extends Behavior>) newValue);
				return;
			case UMLPackage.BEHAVIORAL_FEATURE__OWNED_PARAMETER :
				getOwnedParameters().clear();
				getOwnedParameters()
					.addAll((Collection<? extends Parameter>) newValue);
				return;
			case UMLPackage.BEHAVIORAL_FEATURE__OWNED_PARAMETER_SET :
				getOwnedParameterSets().clear();
				getOwnedParameterSets()
					.addAll((Collection<? extends ParameterSet>) newValue);
				return;
			case UMLPackage.BEHAVIORAL_FEATURE__RAISED_EXCEPTION :
				getRaisedExceptions().clear();
				getRaisedExceptions()
					.addAll((Collection<? extends Type>) newValue);
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
			case UMLPackage.BEHAVIORAL_FEATURE__EANNOTATIONS :
				getEAnnotations().clear();
				return;
			case UMLPackage.BEHAVIORAL_FEATURE__OWNED_COMMENT :
				getOwnedComments().clear();
				return;
			case UMLPackage.BEHAVIORAL_FEATURE__NAME :
				unsetName();
				return;
			case UMLPackage.BEHAVIORAL_FEATURE__NAME_EXPRESSION :
				setNameExpression((StringExpression) null);
				return;
			case UMLPackage.BEHAVIORAL_FEATURE__VISIBILITY :
				unsetVisibility();
				return;
			case UMLPackage.BEHAVIORAL_FEATURE__OWNED_RULE :
				getOwnedRules().clear();
				return;
			case UMLPackage.BEHAVIORAL_FEATURE__ELEMENT_IMPORT :
				getElementImports().clear();
				return;
			case UMLPackage.BEHAVIORAL_FEATURE__PACKAGE_IMPORT :
				getPackageImports().clear();
				return;
			case UMLPackage.BEHAVIORAL_FEATURE__IS_LEAF :
				setIsLeaf(IS_LEAF_EDEFAULT);
				return;
			case UMLPackage.BEHAVIORAL_FEATURE__IS_STATIC :
				setIsStatic(IS_STATIC_EDEFAULT);
				return;
			case UMLPackage.BEHAVIORAL_FEATURE__CONCURRENCY :
				setConcurrency(CONCURRENCY_EDEFAULT);
				return;
			case UMLPackage.BEHAVIORAL_FEATURE__IS_ABSTRACT :
				setIsAbstract(IS_ABSTRACT_EDEFAULT);
				return;
			case UMLPackage.BEHAVIORAL_FEATURE__METHOD :
				getMethods().clear();
				return;
			case UMLPackage.BEHAVIORAL_FEATURE__OWNED_PARAMETER :
				getOwnedParameters().clear();
				return;
			case UMLPackage.BEHAVIORAL_FEATURE__OWNED_PARAMETER_SET :
				getOwnedParameterSets().clear();
				return;
			case UMLPackage.BEHAVIORAL_FEATURE__RAISED_EXCEPTION :
				getRaisedExceptions().clear();
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
			case UMLPackage.BEHAVIORAL_FEATURE__EANNOTATIONS :
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UMLPackage.BEHAVIORAL_FEATURE__OWNED_COMMENT :
				return ownedComments != null && !ownedComments.isEmpty();
			case UMLPackage.BEHAVIORAL_FEATURE__OWNED_ELEMENT :
				return isSetOwnedElements();
			case UMLPackage.BEHAVIORAL_FEATURE__OWNER :
				return isSetOwner();
			case UMLPackage.BEHAVIORAL_FEATURE__CLIENT_DEPENDENCY :
				return !getClientDependencies().isEmpty();
			case UMLPackage.BEHAVIORAL_FEATURE__NAME :
				return isSetName();
			case UMLPackage.BEHAVIORAL_FEATURE__NAME_EXPRESSION :
				return nameExpression != null;
			case UMLPackage.BEHAVIORAL_FEATURE__NAMESPACE :
				return isSetNamespace();
			case UMLPackage.BEHAVIORAL_FEATURE__QUALIFIED_NAME :
				return QUALIFIED_NAME_EDEFAULT == null
					? getQualifiedName() != null
					: !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case UMLPackage.BEHAVIORAL_FEATURE__VISIBILITY :
				return isSetVisibility();
			case UMLPackage.BEHAVIORAL_FEATURE__OWNED_RULE :
				return ownedRules != null && !ownedRules.isEmpty();
			case UMLPackage.BEHAVIORAL_FEATURE__ELEMENT_IMPORT :
				return elementImports != null && !elementImports.isEmpty();
			case UMLPackage.BEHAVIORAL_FEATURE__PACKAGE_IMPORT :
				return packageImports != null && !packageImports.isEmpty();
			case UMLPackage.BEHAVIORAL_FEATURE__OWNED_MEMBER :
				return isSetOwnedMembers();
			case UMLPackage.BEHAVIORAL_FEATURE__IMPORTED_MEMBER :
				return !getImportedMembers().isEmpty();
			case UMLPackage.BEHAVIORAL_FEATURE__MEMBER :
				return isSetMembers();
			case UMLPackage.BEHAVIORAL_FEATURE__IS_LEAF :
				return ((eFlags & IS_LEAF_EFLAG) != 0) != IS_LEAF_EDEFAULT;
			case UMLPackage.BEHAVIORAL_FEATURE__REDEFINED_ELEMENT :
				return isSetRedefinedElements();
			case UMLPackage.BEHAVIORAL_FEATURE__REDEFINITION_CONTEXT :
				return isSetRedefinitionContexts();
			case UMLPackage.BEHAVIORAL_FEATURE__FEATURING_CLASSIFIER :
				return isSetFeaturingClassifiers();
			case UMLPackage.BEHAVIORAL_FEATURE__IS_STATIC :
				return ((eFlags & IS_STATIC_EFLAG) != 0) != IS_STATIC_EDEFAULT;
			case UMLPackage.BEHAVIORAL_FEATURE__CONCURRENCY :
				return (eFlags
					& CONCURRENCY_EFLAG) != CONCURRENCY_EFLAG_DEFAULT;
			case UMLPackage.BEHAVIORAL_FEATURE__IS_ABSTRACT :
				return ((eFlags
					& IS_ABSTRACT_EFLAG) != 0) != IS_ABSTRACT_EDEFAULT;
			case UMLPackage.BEHAVIORAL_FEATURE__METHOD :
				return methods != null && !methods.isEmpty();
			case UMLPackage.BEHAVIORAL_FEATURE__OWNED_PARAMETER :
				return ownedParameters != null && !ownedParameters.isEmpty();
			case UMLPackage.BEHAVIORAL_FEATURE__OWNED_PARAMETER_SET :
				return ownedParameterSets != null
					&& !ownedParameterSets.isEmpty();
			case UMLPackage.BEHAVIORAL_FEATURE__RAISED_EXCEPTION :
				return raisedExceptions != null && !raisedExceptions.isEmpty();
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
				case UMLPackage.BEHAVIORAL_FEATURE__FEATURING_CLASSIFIER :
					return UMLPackage.FEATURE__FEATURING_CLASSIFIER;
				case UMLPackage.BEHAVIORAL_FEATURE__IS_STATIC :
					return UMLPackage.FEATURE__IS_STATIC;
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
				case UMLPackage.FEATURE__FEATURING_CLASSIFIER :
					return UMLPackage.BEHAVIORAL_FEATURE__FEATURING_CLASSIFIER;
				case UMLPackage.FEATURE__IS_STATIC :
					return UMLPackage.BEHAVIORAL_FEATURE__IS_STATIC;
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
	public int eDerivedOperationID(int baseOperationID, Class<?> baseClass) {
		if (baseClass == RedefinableElement.class) {
			switch (baseOperationID) {
				case UMLPackage.REDEFINABLE_ELEMENT___VALIDATE_REDEFINITION_CONSISTENT__DIAGNOSTICCHAIN_MAP :
					return UMLPackage.BEHAVIORAL_FEATURE___VALIDATE_REDEFINITION_CONSISTENT__DIAGNOSTICCHAIN_MAP;
				case UMLPackage.REDEFINABLE_ELEMENT___VALIDATE_NON_LEAF_REDEFINITION__DIAGNOSTICCHAIN_MAP :
					return UMLPackage.BEHAVIORAL_FEATURE___VALIDATE_NON_LEAF_REDEFINITION__DIAGNOSTICCHAIN_MAP;
				case UMLPackage.REDEFINABLE_ELEMENT___VALIDATE_REDEFINITION_CONTEXT_VALID__DIAGNOSTICCHAIN_MAP :
					return UMLPackage.BEHAVIORAL_FEATURE___VALIDATE_REDEFINITION_CONTEXT_VALID__DIAGNOSTICCHAIN_MAP;
				case UMLPackage.REDEFINABLE_ELEMENT___IS_CONSISTENT_WITH__REDEFINABLEELEMENT :
					return UMLPackage.BEHAVIORAL_FEATURE___IS_CONSISTENT_WITH__REDEFINABLEELEMENT;
				case UMLPackage.REDEFINABLE_ELEMENT___IS_REDEFINITION_CONTEXT_VALID__REDEFINABLEELEMENT :
					return UMLPackage.BEHAVIORAL_FEATURE___IS_REDEFINITION_CONTEXT_VALID__REDEFINABLEELEMENT;
				default :
					return -1;
			}
		}
		if (baseClass == Feature.class) {
			switch (baseOperationID) {
				default :
					return -1;
			}
		}
		return super.eDerivedOperationID(baseOperationID, baseClass);
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
			case UMLPackage.BEHAVIORAL_FEATURE___GET_EANNOTATION__STRING :
				return getEAnnotation((String) arguments.get(0));
			case UMLPackage.BEHAVIORAL_FEATURE___VALIDATE_HAS_OWNER__DIAGNOSTICCHAIN_MAP :
				return validateHasOwner((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.BEHAVIORAL_FEATURE___VALIDATE_NOT_OWN_SELF__DIAGNOSTICCHAIN_MAP :
				return validateNotOwnSelf((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.BEHAVIORAL_FEATURE___ADD_KEYWORD__STRING :
				return addKeyword((String) arguments.get(0));
			case UMLPackage.BEHAVIORAL_FEATURE___APPLY_STEREOTYPE__STEREOTYPE :
				return applyStereotype((Stereotype) arguments.get(0));
			case UMLPackage.BEHAVIORAL_FEATURE___CREATE_EANNOTATION__STRING :
				return createEAnnotation((String) arguments.get(0));
			case UMLPackage.BEHAVIORAL_FEATURE___DESTROY :
				destroy();
				return null;
			case UMLPackage.BEHAVIORAL_FEATURE___GET_KEYWORDS :
				return getKeywords();
			case UMLPackage.BEHAVIORAL_FEATURE___GET_APPLICABLE_STEREOTYPE__STRING :
				return getApplicableStereotype((String) arguments.get(0));
			case UMLPackage.BEHAVIORAL_FEATURE___GET_APPLICABLE_STEREOTYPES :
				return getApplicableStereotypes();
			case UMLPackage.BEHAVIORAL_FEATURE___GET_APPLIED_STEREOTYPE__STRING :
				return getAppliedStereotype((String) arguments.get(0));
			case UMLPackage.BEHAVIORAL_FEATURE___GET_APPLIED_STEREOTYPES :
				return getAppliedStereotypes();
			case UMLPackage.BEHAVIORAL_FEATURE___GET_APPLIED_SUBSTEREOTYPE__STEREOTYPE_STRING :
				return getAppliedSubstereotype((Stereotype) arguments.get(0),
					(String) arguments.get(1));
			case UMLPackage.BEHAVIORAL_FEATURE___GET_APPLIED_SUBSTEREOTYPES__STEREOTYPE :
				return getAppliedSubstereotypes((Stereotype) arguments.get(0));
			case UMLPackage.BEHAVIORAL_FEATURE___GET_MODEL :
				return getModel();
			case UMLPackage.BEHAVIORAL_FEATURE___GET_NEAREST_PACKAGE :
				return getNearestPackage();
			case UMLPackage.BEHAVIORAL_FEATURE___GET_RELATIONSHIPS :
				return getRelationships();
			case UMLPackage.BEHAVIORAL_FEATURE___GET_RELATIONSHIPS__ECLASS :
				return getRelationships((EClass) arguments.get(0));
			case UMLPackage.BEHAVIORAL_FEATURE___GET_REQUIRED_STEREOTYPE__STRING :
				return getRequiredStereotype((String) arguments.get(0));
			case UMLPackage.BEHAVIORAL_FEATURE___GET_REQUIRED_STEREOTYPES :
				return getRequiredStereotypes();
			case UMLPackage.BEHAVIORAL_FEATURE___GET_SOURCE_DIRECTED_RELATIONSHIPS :
				return getSourceDirectedRelationships();
			case UMLPackage.BEHAVIORAL_FEATURE___GET_SOURCE_DIRECTED_RELATIONSHIPS__ECLASS :
				return getSourceDirectedRelationships(
					(EClass) arguments.get(0));
			case UMLPackage.BEHAVIORAL_FEATURE___GET_STEREOTYPE_APPLICATION__STEREOTYPE :
				return getStereotypeApplication((Stereotype) arguments.get(0));
			case UMLPackage.BEHAVIORAL_FEATURE___GET_STEREOTYPE_APPLICATIONS :
				return getStereotypeApplications();
			case UMLPackage.BEHAVIORAL_FEATURE___GET_TARGET_DIRECTED_RELATIONSHIPS :
				return getTargetDirectedRelationships();
			case UMLPackage.BEHAVIORAL_FEATURE___GET_TARGET_DIRECTED_RELATIONSHIPS__ECLASS :
				return getTargetDirectedRelationships(
					(EClass) arguments.get(0));
			case UMLPackage.BEHAVIORAL_FEATURE___GET_VALUE__STEREOTYPE_STRING :
				return getValue((Stereotype) arguments.get(0),
					(String) arguments.get(1));
			case UMLPackage.BEHAVIORAL_FEATURE___HAS_KEYWORD__STRING :
				return hasKeyword((String) arguments.get(0));
			case UMLPackage.BEHAVIORAL_FEATURE___HAS_VALUE__STEREOTYPE_STRING :
				return hasValue((Stereotype) arguments.get(0),
					(String) arguments.get(1));
			case UMLPackage.BEHAVIORAL_FEATURE___IS_STEREOTYPE_APPLICABLE__STEREOTYPE :
				return isStereotypeApplicable((Stereotype) arguments.get(0));
			case UMLPackage.BEHAVIORAL_FEATURE___IS_STEREOTYPE_APPLIED__STEREOTYPE :
				return isStereotypeApplied((Stereotype) arguments.get(0));
			case UMLPackage.BEHAVIORAL_FEATURE___IS_STEREOTYPE_REQUIRED__STEREOTYPE :
				return isStereotypeRequired((Stereotype) arguments.get(0));
			case UMLPackage.BEHAVIORAL_FEATURE___REMOVE_KEYWORD__STRING :
				return removeKeyword((String) arguments.get(0));
			case UMLPackage.BEHAVIORAL_FEATURE___SET_VALUE__STEREOTYPE_STRING_OBJECT :
				setValue((Stereotype) arguments.get(0),
					(String) arguments.get(1), arguments.get(2));
				return null;
			case UMLPackage.BEHAVIORAL_FEATURE___UNAPPLY_STEREOTYPE__STEREOTYPE :
				return unapplyStereotype((Stereotype) arguments.get(0));
			case UMLPackage.BEHAVIORAL_FEATURE___ALL_OWNED_ELEMENTS :
				return allOwnedElements();
			case UMLPackage.BEHAVIORAL_FEATURE___MUST_BE_OWNED :
				return mustBeOwned();
			case UMLPackage.BEHAVIORAL_FEATURE___VALIDATE_VISIBILITY_NEEDS_OWNERSHIP__DIAGNOSTICCHAIN_MAP :
				return validateVisibilityNeedsOwnership(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.BEHAVIORAL_FEATURE___VALIDATE_HAS_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP :
				return validateHasQualifiedName(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.BEHAVIORAL_FEATURE___VALIDATE_HAS_NO_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP :
				return validateHasNoQualifiedName(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.BEHAVIORAL_FEATURE___CREATE_DEPENDENCY__NAMEDELEMENT :
				return createDependency((NamedElement) arguments.get(0));
			case UMLPackage.BEHAVIORAL_FEATURE___CREATE_USAGE__NAMEDELEMENT :
				return createUsage((NamedElement) arguments.get(0));
			case UMLPackage.BEHAVIORAL_FEATURE___GET_LABEL :
				return getLabel();
			case UMLPackage.BEHAVIORAL_FEATURE___GET_LABEL__BOOLEAN :
				return getLabel((Boolean) arguments.get(0));
			case UMLPackage.BEHAVIORAL_FEATURE___GET_NAMESPACE :
				return getNamespace();
			case UMLPackage.BEHAVIORAL_FEATURE___ALL_NAMESPACES :
				return allNamespaces();
			case UMLPackage.BEHAVIORAL_FEATURE___ALL_OWNING_PACKAGES :
				return allOwningPackages();
			case UMLPackage.BEHAVIORAL_FEATURE___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE :
				return isDistinguishableFrom((NamedElement) arguments.get(0),
					(Namespace) arguments.get(1));
			case UMLPackage.BEHAVIORAL_FEATURE___GET_QUALIFIED_NAME :
				return getQualifiedName();
			case UMLPackage.BEHAVIORAL_FEATURE___SEPARATOR :
				return separator();
			case UMLPackage.BEHAVIORAL_FEATURE___GET_CLIENT_DEPENDENCIES :
				return getClientDependencies();
			case UMLPackage.BEHAVIORAL_FEATURE___VALIDATE_MEMBERS_DISTINGUISHABLE__DIAGNOSTICCHAIN_MAP :
				return validateMembersDistinguishable(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.BEHAVIORAL_FEATURE___VALIDATE_CANNOT_IMPORT_SELF__DIAGNOSTICCHAIN_MAP :
				return validateCannotImportSelf(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.BEHAVIORAL_FEATURE___VALIDATE_CANNOT_IMPORT_OWNED_MEMBERS__DIAGNOSTICCHAIN_MAP :
				return validateCannotImportOwnedMembers(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.BEHAVIORAL_FEATURE___CREATE_ELEMENT_IMPORT__PACKAGEABLEELEMENT_VISIBILITYKIND :
				return createElementImport(
					(PackageableElement) arguments.get(0),
					(VisibilityKind) arguments.get(1));
			case UMLPackage.BEHAVIORAL_FEATURE___CREATE_PACKAGE_IMPORT__PACKAGE_VISIBILITYKIND :
				return createPackageImport(
					(org.eclipse.uml2.uml.Package) arguments.get(0),
					(VisibilityKind) arguments.get(1));
			case UMLPackage.BEHAVIORAL_FEATURE___GET_IMPORTED_ELEMENTS :
				return getImportedElements();
			case UMLPackage.BEHAVIORAL_FEATURE___GET_IMPORTED_PACKAGES :
				return getImportedPackages();
			case UMLPackage.BEHAVIORAL_FEATURE___GET_OWNED_MEMBERS :
				return getOwnedMembers();
			case UMLPackage.BEHAVIORAL_FEATURE___EXCLUDE_COLLISIONS__ELIST :
				return excludeCollisions(
					(EList<PackageableElement>) arguments.get(0));
			case UMLPackage.BEHAVIORAL_FEATURE___GET_NAMES_OF_MEMBER__NAMEDELEMENT :
				return getNamesOfMember((NamedElement) arguments.get(0));
			case UMLPackage.BEHAVIORAL_FEATURE___IMPORT_MEMBERS__ELIST :
				return importMembers(
					(EList<PackageableElement>) arguments.get(0));
			case UMLPackage.BEHAVIORAL_FEATURE___GET_IMPORTED_MEMBERS :
				return getImportedMembers();
			case UMLPackage.BEHAVIORAL_FEATURE___MEMBERS_ARE_DISTINGUISHABLE :
				return membersAreDistinguishable();
			case UMLPackage.BEHAVIORAL_FEATURE___VALIDATE_REDEFINITION_CONSISTENT__DIAGNOSTICCHAIN_MAP :
				return validateRedefinitionConsistent(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.BEHAVIORAL_FEATURE___VALIDATE_NON_LEAF_REDEFINITION__DIAGNOSTICCHAIN_MAP :
				return validateNonLeafRedefinition(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.BEHAVIORAL_FEATURE___VALIDATE_REDEFINITION_CONTEXT_VALID__DIAGNOSTICCHAIN_MAP :
				return validateRedefinitionContextValid(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.BEHAVIORAL_FEATURE___IS_CONSISTENT_WITH__REDEFINABLEELEMENT :
				return isConsistentWith((RedefinableElement) arguments.get(0));
			case UMLPackage.BEHAVIORAL_FEATURE___IS_REDEFINITION_CONTEXT_VALID__REDEFINABLEELEMENT :
				return isRedefinitionContextValid(
					(RedefinableElement) arguments.get(0));
			case UMLPackage.BEHAVIORAL_FEATURE___VALIDATE_ABSTRACT_NO_METHOD__DIAGNOSTICCHAIN_MAP :
				return validateAbstractNoMethod(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.BEHAVIORAL_FEATURE___CREATE_RETURN_RESULT__STRING_TYPE :
				return createReturnResult((String) arguments.get(0),
					(Type) arguments.get(1));
			case UMLPackage.BEHAVIORAL_FEATURE___INPUT_PARAMETERS :
				return inputParameters();
			case UMLPackage.BEHAVIORAL_FEATURE___OUTPUT_PARAMETERS :
				return outputParameters();
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
		result.append(" (isLeaf: "); //$NON-NLS-1$
		result.append((eFlags & IS_LEAF_EFLAG) != 0);
		result.append(", isStatic: "); //$NON-NLS-1$
		result.append((eFlags & IS_STATIC_EFLAG) != 0);
		result.append(", concurrency: "); //$NON-NLS-1$
		result.append(CONCURRENCY_EFLAG_VALUES[(eFlags
			& CONCURRENCY_EFLAG) >>> CONCURRENCY_EFLAG_OFFSET]);
		result.append(", isAbstract: "); //$NON-NLS-1$
		result.append((eFlags & IS_ABSTRACT_EFLAG) != 0);
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
	public boolean isSetRedefinitionContextsGen() {
		return false;
	}

	public boolean isSetRedefinitionContexts() {
		return basicGetNamespace() instanceof Classifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetFeaturingClassifiersGen() {
		return false;
	}

	public boolean isSetFeaturingClassifiers() {
		return basicGetNamespace() instanceof Classifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetOwnedMembers() {
		return super.isSetOwnedMembers()
			|| eIsSet(UMLPackage.BEHAVIORAL_FEATURE__OWNED_PARAMETER)
			|| eIsSet(UMLPackage.BEHAVIORAL_FEATURE__OWNED_PARAMETER_SET);
	}

} //BehavioralFeatureImpl
