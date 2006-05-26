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
 * $Id: BehavioralFeatureImpl.java,v 1.31 2006/05/26 18:16:42 khussey Exp $
 */
package org.eclipse.uml2.impl;

import java.lang.reflect.Method;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.UniqueEList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.uml2.Behavior;
import org.eclipse.uml2.BehavioralFeature;
import org.eclipse.uml2.CallConcurrencyKind;
import org.eclipse.uml2.Classifier;
import org.eclipse.uml2.Feature;
import org.eclipse.uml2.NamedElement;
import org.eclipse.uml2.Namespace;
import org.eclipse.uml2.Parameter;
import org.eclipse.uml2.RedefinableElement;
import org.eclipse.uml2.StringExpression;
import org.eclipse.uml2.TemplateSignature;
import org.eclipse.uml2.Type;
import org.eclipse.uml2.UML2Factory;
import org.eclipse.uml2.UML2Package;
import org.eclipse.uml2.VisibilityKind;

import org.eclipse.uml2.common.util.CacheAdapter;
import org.eclipse.uml2.common.util.DerivedUnionEObjectEList;
import org.eclipse.uml2.common.util.UnionEObjectEList;

import org.eclipse.uml2.internal.operation.BehavioralFeatureOperations;
import org.eclipse.uml2.internal.operation.RedefinableElementOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Behavioral Feature</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2.impl.BehavioralFeatureImpl#getRedefinitionContexts <em>Redefinition Context</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.BehavioralFeatureImpl#getRedefinedElements <em>Redefined Element</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.BehavioralFeatureImpl#isLeaf <em>Is Leaf</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.BehavioralFeatureImpl#getFeaturingClassifiers <em>Featuring Classifier</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.BehavioralFeatureImpl#isStatic <em>Is Static</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.BehavioralFeatureImpl#getParameters <em>Parameter</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.BehavioralFeatureImpl#getMembers <em>Member</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.BehavioralFeatureImpl#getOwnedMembers <em>Owned Member</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.BehavioralFeatureImpl#getFormalParameters <em>Formal Parameter</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.BehavioralFeatureImpl#getReturnResults <em>Return Result</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.BehavioralFeatureImpl#getRaisedExceptions <em>Raised Exception</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.BehavioralFeatureImpl#isAbstract <em>Is Abstract</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.BehavioralFeatureImpl#getMethods <em>Method</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.BehavioralFeatureImpl#getConcurrency <em>Concurrency</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class BehavioralFeatureImpl extends NamespaceImpl implements BehavioralFeature {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) IBM Corporation and others."; //$NON-NLS-1$

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
	 * The cached value of the '{@link #getFormalParameters() <em>Formal Parameter</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFormalParameters()
	 * @generated
	 * @ordered
	 */
	protected EList formalParameters = null;

	/**
	 * The cached value of the '{@link #getReturnResults() <em>Return Result</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReturnResults()
	 * @generated
	 * @ordered
	 */
	protected EList returnResults = null;

	/**
	 * The cached value of the '{@link #getRaisedExceptions() <em>Raised Exception</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRaisedExceptions()
	 * @generated
	 * @ordered
	 */
	protected EList raisedExceptions = null;

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
	 * The cached value of the '{@link #getMethods() <em>Method</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethods()
	 * @generated
	 * @ordered
	 */
	protected EList methods = null;

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
	 * The cached value of the '{@link #getConcurrency() <em>Concurrency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConcurrency()
	 * @generated
	 * @ordered
	 */
	protected CallConcurrencyKind concurrency = CONCURRENCY_EDEFAULT;

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
		return UML2Package.Literals.BEHAVIORAL_FEATURE;
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
		if (newIsLeaf) eFlags |= IS_LEAF_EFLAG; else eFlags &= ~IS_LEAF_EFLAG;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2Package.BEHAVIORAL_FEATURE__IS_LEAF, oldIsLeaf, newIsLeaf));


	}


	/**
	 * The array of subset feature identifiers for the '{@link #getRedefinitionContexts() <em>Redefinition Context</em>}' reference list.
	 * @see #getRedefinitionContexts()
	 */
	protected static final int[] REDEFINITION_CONTEXT_ESUBSETS = new int[]{UML2Package.BEHAVIORAL_FEATURE__OWNER};

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList getRedefinitionContexts() {
		CacheAdapter cache = getCacheAdapter();
		if (cache != null) {
			Resource eResource = eResource();
			EList redefinitionContexts = (EList) cache.get(eResource, this,
				UML2Package.Literals.REDEFINABLE_ELEMENT__REDEFINITION_CONTEXT);
			if (redefinitionContexts == null) {
				cache
					.put(
						eResource,
						this,
						UML2Package.Literals.REDEFINABLE_ELEMENT__REDEFINITION_CONTEXT,
						redefinitionContexts = new DerivedUnionEObjectEList(
							Classifier.class,
							this,
							UML2Package.BEHAVIORAL_FEATURE__REDEFINITION_CONTEXT,
							REDEFINITION_CONTEXT_ESUBSETS));
			}
			return redefinitionContexts;
		}
		return new DerivedUnionEObjectEList(Classifier.class, this,
			UML2Package.BEHAVIORAL_FEATURE__REDEFINITION_CONTEXT,
			REDEFINITION_CONTEXT_ESUBSETS);
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean isSetRedefinitionContexts() {
		return basicGetOwner() instanceof Classifier;
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
	public Classifier getRedefinitionContext(String name, boolean ignoreCase, EClass eClass) {
		redefinitionContextLoop: for (Iterator i = getRedefinitionContexts().iterator(); i.hasNext(); ) {
			Classifier redefinitionContext = (Classifier) i.next();
			if (eClass != null && !eClass.isInstance(redefinitionContext))
				continue redefinitionContextLoop;
			if (name != null && !(ignoreCase ? name.equalsIgnoreCase(redefinitionContext.getName()) : name.equals(redefinitionContext.getName())))
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
	protected EList getRedefinedElementsHelper(EList redefinedElements) {
		return redefinedElements;
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
		if (newIsStatic) eFlags |= IS_STATIC_EFLAG; else eFlags &= ~IS_STATIC_EFLAG;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2Package.BEHAVIORAL_FEATURE__IS_STATIC, oldIsStatic, newIsStatic));


	}


	/**
	 * The array of subset feature identifiers for the '{@link #getFeaturingClassifiers() <em>Featuring Classifier</em>}' reference list.
	 * @see #getFeaturingClassifiers()
	 */
	protected static final int[] FEATURING_CLASSIFIER_ESUBSETS = new int[]{UML2Package.BEHAVIORAL_FEATURE__OWNER};

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList getFeaturingClassifiers() {
		CacheAdapter cache = getCacheAdapter();
		if (cache != null) {
			Resource eResource = eResource();
			EList featuringClassifiers = (EList) cache.get(eResource, this,
				UML2Package.Literals.FEATURE__FEATURING_CLASSIFIER);
			if (featuringClassifiers == null) {
				cache.put(eResource, this,
					UML2Package.Literals.FEATURE__FEATURING_CLASSIFIER,
					featuringClassifiers = new DerivedUnionEObjectEList(
						Classifier.class, this,
						UML2Package.BEHAVIORAL_FEATURE__FEATURING_CLASSIFIER,
						FEATURING_CLASSIFIER_ESUBSETS));
			}
			return featuringClassifiers;
		}
		return new DerivedUnionEObjectEList(Classifier.class, this,
			UML2Package.BEHAVIORAL_FEATURE__FEATURING_CLASSIFIER,
			FEATURING_CLASSIFIER_ESUBSETS);
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean isSetFeaturingClassifiers() {
		return basicGetOwner() instanceof Classifier;
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
	public Classifier getFeaturingClassifier(String name, boolean ignoreCase, EClass eClass) {
		featuringClassifierLoop: for (Iterator i = getFeaturingClassifiers().iterator(); i.hasNext(); ) {
			Classifier featuringClassifier = (Classifier) i.next();
			if (eClass != null && !eClass.isInstance(featuringClassifier))
				continue featuringClassifierLoop;
			if (name != null && !(ignoreCase ? name.equalsIgnoreCase(featuringClassifier.getName()) : name.equals(featuringClassifier.getName())))
				continue featuringClassifierLoop;
			return featuringClassifier;
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
		if (newIsAbstract) eFlags |= IS_ABSTRACT_EFLAG; else eFlags &= ~IS_ABSTRACT_EFLAG;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2Package.BEHAVIORAL_FEATURE__IS_ABSTRACT, oldIsAbstract, newIsAbstract));


	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CallConcurrencyKind getConcurrency() {
		return concurrency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConcurrency(CallConcurrencyKind newConcurrency) {
		CallConcurrencyKind oldConcurrency = concurrency;
		concurrency = newConcurrency == null ? CONCURRENCY_EDEFAULT : newConcurrency;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2Package.BEHAVIORAL_FEATURE__CONCURRENCY, oldConcurrency, concurrency));


	}



	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRedefinitionContextValid(DiagnosticChain diagnostics, Map context) {
		return RedefinableElementOperations.validateRedefinitionContextValid(this, diagnostics, context);
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRedefinitionConsistent(DiagnosticChain diagnostics, Map context) {
		return RedefinableElementOperations.validateRedefinitionConsistent(this, diagnostics, context);
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getParameters() {
		CacheAdapter cache = getCacheAdapter();
		if (cache != null) {
			Resource eResource = eResource();
			EList parameters = (EList) cache.get(eResource, this, UML2Package.Literals.BEHAVIORAL_FEATURE__PARAMETER);
			if (parameters == null) {
				cache.put(eResource, this, UML2Package.Literals.BEHAVIORAL_FEATURE__PARAMETER, parameters = new DerivedUnionEObjectEList(Parameter.class, this, UML2Package.BEHAVIORAL_FEATURE__PARAMETER, PARAMETER_ESUBSETS));
			}
			return parameters;
		}
		return new DerivedUnionEObjectEList(Parameter.class, this, UML2Package.BEHAVIORAL_FEATURE__PARAMETER, PARAMETER_ESUBSETS);
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetParameters() {
		return eIsSet(UML2Package.BEHAVIORAL_FEATURE__FORMAL_PARAMETER)
			|| eIsSet(UML2Package.BEHAVIORAL_FEATURE__RETURN_RESULT);
	}

	/**
	 * The array of subset feature identifiers for the '{@link #getParameters() <em>Parameter</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameters()
	 * @generated
	 * @ordered
	 */
	protected static final int[] PARAMETER_ESUBSETS = new int[] {UML2Package.BEHAVIORAL_FEATURE__FORMAL_PARAMETER, UML2Package.BEHAVIORAL_FEATURE__RETURN_RESULT};

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
    public Parameter getParameter(String name) {
		return getParameter(name, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parameter getParameter(String name, boolean ignoreCase) {
		parameterLoop: for (Iterator i = getParameters().iterator(); i.hasNext(); ) {
			Parameter parameter = (Parameter) i.next();
			if (name != null && !(ignoreCase ? name.equalsIgnoreCase(parameter.getName()) : name.equals(parameter.getName())))
				continue parameterLoop;
			return parameter;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getMembers() {
		CacheAdapter cache = getCacheAdapter();
		if (cache != null) {
			EList members = (EList) cache.get(eResource(), this, UML2Package.Literals.NAMESPACE__MEMBER);
			if (members == null) {
				List union = getMembersHelper(new UniqueEList.FastCompare());
				cache.put(eResource(), this, UML2Package.Literals.NAMESPACE__MEMBER, members = new UnionEObjectEList(this, UML2Package.Literals.NAMESPACE__MEMBER, union.size(), union.toArray()));
			}
			return members;
		}
		List union = getMembersHelper(new UniqueEList.FastCompare());
		return new UnionEObjectEList(this, UML2Package.Literals.NAMESPACE__MEMBER, union.size(), union.toArray());
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getOwnedMembers() {
		CacheAdapter cache = getCacheAdapter();
		if (cache != null) {
			try {
				Method method = getClass().getMethod("getOwnedMembers", null); //$NON-NLS-1$
				EList ownedMembers = (EList) cache.get(eResource(), this, method);
				if (ownedMembers == null) {
					List union = getOwnedMembersHelper(new UniqueEList.FastCompare());
					cache.put(eResource(), this, method, ownedMembers = new UnionEObjectEList(this, null, union.size(), union.toArray()));
				}
				return ownedMembers;
			}
			catch (NoSuchMethodException nsme) {
				// ignore
			}
		}
		List union = getOwnedMembersHelper(new UniqueEList.FastCompare());
		return new UnionEObjectEList(this, null, union.size(), union.toArray());
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EList getMembersHelper(EList members) {
		super.getMembersHelper(members);
		if (isSetParameters()) {
			for (Iterator i = ((InternalEList) getParameters()).basicIterator(); i.hasNext(); ) {
				members.add(i.next());
			}
		}
		return members;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMembers() {
		return super.isSetMembers()
			|| isSetParameters();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EList getOwnedMembersHelper(EList ownedMembers) {
		super.getOwnedMembersHelper(ownedMembers);
		if (eIsSet(UML2Package.BEHAVIORAL_FEATURE__FORMAL_PARAMETER)) {
			ownedMembers.addAll(getFormalParameters());
		}
		if (eIsSet(UML2Package.BEHAVIORAL_FEATURE__RETURN_RESULT)) {
			ownedMembers.addAll(getReturnResults());
		}
		return ownedMembers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOwnedMembers() {
		return super.isSetOwnedMembers()
			|| eIsSet(UML2Package.BEHAVIORAL_FEATURE__FORMAL_PARAMETER)
			|| eIsSet(UML2Package.BEHAVIORAL_FEATURE__RETURN_RESULT);
	}

	/**
	 * The array of subset feature identifiers for the '{@link #getOwnedMembers() <em>Owned Member</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedMembers()
	 * @generated
	 * @ordered
	 */
	protected static final int[] OWNED_MEMBER_ESUBSETS = new int[] {UML2Package.BEHAVIORAL_FEATURE__OWNED_RULE, UML2Package.BEHAVIORAL_FEATURE__FORMAL_PARAMETER, UML2Package.BEHAVIORAL_FEATURE__RETURN_RESULT};

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getFormalParameters() {
		if (formalParameters == null) {
			formalParameters = new EObjectContainmentEList(Parameter.class, this, UML2Package.BEHAVIORAL_FEATURE__FORMAL_PARAMETER);
		}
		return formalParameters;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
    public Parameter getFormalParameter(String name) {
		return getFormalParameter(name, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parameter getFormalParameter(String name, boolean ignoreCase) {
		formalParameterLoop: for (Iterator i = getFormalParameters().iterator(); i.hasNext(); ) {
			Parameter formalParameter = (Parameter) i.next();
			if (name != null && !(ignoreCase ? name.equalsIgnoreCase(formalParameter.getName()) : name.equals(formalParameter.getName())))
				continue formalParameterLoop;
			return formalParameter;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 * @deprecated Use #createFormalParameter() instead.
	 */
	public Parameter createFormalParameter(EClass eClass) {
		Parameter newFormalParameter = (Parameter) eClass.getEPackage().getEFactoryInstance().create(eClass);
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, 0, UML2Package.BEHAVIORAL_FEATURE__FORMAL_PARAMETER, null, newFormalParameter));
		}
		getFormalParameters().add(newFormalParameter);
		return newFormalParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Parameter createFormalParameter() {
		Parameter newFormalParameter = UML2Factory.eINSTANCE.createParameter();
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, 0, UML2Package.BEHAVIORAL_FEATURE__FORMAL_PARAMETER, null, newFormalParameter));
		}
		getFormalParameters().add(newFormalParameter);
		return newFormalParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getReturnResults() {
		if (returnResults == null) {
			returnResults = new EObjectContainmentEList(Parameter.class, this, UML2Package.BEHAVIORAL_FEATURE__RETURN_RESULT);
		}
		return returnResults;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
    public Parameter getReturnResult(String name) {
		return getReturnResult(name, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parameter getReturnResult(String name, boolean ignoreCase) {
		returnResultLoop: for (Iterator i = getReturnResults().iterator(); i.hasNext(); ) {
			Parameter returnResult = (Parameter) i.next();
			if (name != null && !(ignoreCase ? name.equalsIgnoreCase(returnResult.getName()) : name.equals(returnResult.getName())))
				continue returnResultLoop;
			return returnResult;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 * @deprecated Use #createReturnResult() instead.
	 */
	public Parameter createReturnResult(EClass eClass) {
		Parameter newReturnResult = (Parameter) eClass.getEPackage().getEFactoryInstance().create(eClass);
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, 0, UML2Package.BEHAVIORAL_FEATURE__RETURN_RESULT, null, newReturnResult));
		}
		getReturnResults().add(newReturnResult);
		return newReturnResult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Parameter createReturnResult() {
		Parameter newReturnResult = UML2Factory.eINSTANCE.createParameter();
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, 0, UML2Package.BEHAVIORAL_FEATURE__RETURN_RESULT, null, newReturnResult));
		}
		getReturnResults().add(newReturnResult);
		return newReturnResult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getRaisedExceptions() {
		if (raisedExceptions == null) {
			raisedExceptions = new EObjectResolvingEList(Type.class, this, UML2Package.BEHAVIORAL_FEATURE__RAISED_EXCEPTION);
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
	public Type getRaisedException(String name, boolean ignoreCase, EClass eClass) {
		raisedExceptionLoop: for (Iterator i = getRaisedExceptions().iterator(); i.hasNext(); ) {
			Type raisedException = (Type) i.next();
			if (eClass != null && !eClass.isInstance(raisedException))
				continue raisedExceptionLoop;
			if (name != null && !(ignoreCase ? name.equalsIgnoreCase(raisedException.getName()) : name.equals(raisedException.getName())))
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
	public EList getMethods() {
		if (methods == null) {
			methods = new EObjectWithInverseResolvingEList(Behavior.class, this, UML2Package.BEHAVIORAL_FEATURE__METHOD, UML2Package.BEHAVIOR__SPECIFICATION);
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
		methodLoop: for (Iterator i = getMethods().iterator(); i.hasNext(); ) {
			Behavior method = (Behavior) i.next();
			if (eClass != null && !eClass.isInstance(method))
				continue methodLoop;
			if (name != null && !(ignoreCase ? name.equalsIgnoreCase(method.getName()) : name.equals(method.getName())))
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
	public boolean isConsistentWith(RedefinableElement redefinee) {
		return RedefinableElementOperations.isConsistentWith(this, redefinee);
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isRedefinitionContextValid(RedefinableElement redefinable) {
		return RedefinableElementOperations.isRedefinitionContextValid(this, redefinable);
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getRedefinedElements() {
		CacheAdapter cache = getCacheAdapter();
		if (cache != null) {
			try {
				Method method = getClass().getMethod("getRedefinedElements", null); //$NON-NLS-1$
				EList redefinedElements = (EList) cache.get(eResource(), this, method);
				if (redefinedElements == null) {
					List union = getRedefinedElementsHelper(new UniqueEList.FastCompare());
					cache.put(eResource(), this, method, redefinedElements = new UnionEObjectEList(this, null, union.size(), union.toArray()));
				}
				return redefinedElements;
			}
			catch (NoSuchMethodException nsme) {
				// ignore
			}
		}
		List union = getRedefinedElementsHelper(new UniqueEList.FastCompare());
		return new UnionEObjectEList(this, null, union.size(), union.toArray());
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
    public RedefinableElement getRedefinedElement(String name) {
		return getRedefinedElement(name, false, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RedefinableElement getRedefinedElement(String name, boolean ignoreCase, EClass eClass) {
		redefinedElementLoop: for (Iterator i = getRedefinedElements().iterator(); i.hasNext(); ) {
			RedefinableElement redefinedElement = (RedefinableElement) i.next();
			if (eClass != null && !eClass.isInstance(redefinedElement))
				continue redefinedElementLoop;
			if (name != null && !(ignoreCase ? name.equalsIgnoreCase(redefinedElement.getName()) : name.equals(redefinedElement.getName())))
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
	public boolean isDistinguishableFrom(NamedElement n, Namespace ns) {
		return BehavioralFeatureOperations.isDistinguishableFrom(this, n, ns);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UML2Package.BEHAVIORAL_FEATURE__EANNOTATIONS:
				return ((InternalEList)getEAnnotations()).basicAdd(otherEnd, msgs);
			case UML2Package.BEHAVIORAL_FEATURE__TEMPLATE_BINDING:
				return ((InternalEList)getTemplateBindings()).basicAdd(otherEnd, msgs);
			case UML2Package.BEHAVIORAL_FEATURE__OWNED_TEMPLATE_SIGNATURE:
				if (ownedTemplateSignature != null)
					msgs = ((InternalEObject)ownedTemplateSignature).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UML2Package.BEHAVIORAL_FEATURE__OWNED_TEMPLATE_SIGNATURE, null, msgs);
				return basicSetOwnedTemplateSignature((TemplateSignature)otherEnd, msgs);
			case UML2Package.BEHAVIORAL_FEATURE__CLIENT_DEPENDENCY:
				return ((InternalEList)getClientDependencies()).basicAdd(otherEnd, msgs);
			case UML2Package.BEHAVIORAL_FEATURE__OWNED_RULE:
				return ((InternalEList)getOwnedRules()).basicAdd(otherEnd, msgs);
			case UML2Package.BEHAVIORAL_FEATURE__ELEMENT_IMPORT:
				return ((InternalEList)getElementImports()).basicAdd(otherEnd, msgs);
			case UML2Package.BEHAVIORAL_FEATURE__PACKAGE_IMPORT:
				return ((InternalEList)getPackageImports()).basicAdd(otherEnd, msgs);
			case UML2Package.BEHAVIORAL_FEATURE__METHOD:
				return ((InternalEList)getMethods()).basicAdd(otherEnd, msgs);
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
			case UML2Package.BEHAVIORAL_FEATURE__EANNOTATIONS:
				return ((InternalEList)getEAnnotations()).basicRemove(otherEnd, msgs);
			case UML2Package.BEHAVIORAL_FEATURE__OWNED_COMMENT:
				return ((InternalEList)getOwnedComments()).basicRemove(otherEnd, msgs);
			case UML2Package.BEHAVIORAL_FEATURE__TEMPLATE_BINDING:
				return ((InternalEList)getTemplateBindings()).basicRemove(otherEnd, msgs);
			case UML2Package.BEHAVIORAL_FEATURE__OWNED_TEMPLATE_SIGNATURE:
				return basicSetOwnedTemplateSignature(null, msgs);
			case UML2Package.BEHAVIORAL_FEATURE__CLIENT_DEPENDENCY:
				return ((InternalEList)getClientDependencies()).basicRemove(otherEnd, msgs);
			case UML2Package.BEHAVIORAL_FEATURE__NAME_EXPRESSION:
				return basicSetNameExpression(null, msgs);
			case UML2Package.BEHAVIORAL_FEATURE__OWNED_RULE:
				return ((InternalEList)getOwnedRules()).basicRemove(otherEnd, msgs);
			case UML2Package.BEHAVIORAL_FEATURE__ELEMENT_IMPORT:
				return ((InternalEList)getElementImports()).basicRemove(otherEnd, msgs);
			case UML2Package.BEHAVIORAL_FEATURE__PACKAGE_IMPORT:
				return ((InternalEList)getPackageImports()).basicRemove(otherEnd, msgs);
			case UML2Package.BEHAVIORAL_FEATURE__FORMAL_PARAMETER:
				return ((InternalEList)getFormalParameters()).basicRemove(otherEnd, msgs);
			case UML2Package.BEHAVIORAL_FEATURE__RETURN_RESULT:
				return ((InternalEList)getReturnResults()).basicRemove(otherEnd, msgs);
			case UML2Package.BEHAVIORAL_FEATURE__METHOD:
				return ((InternalEList)getMethods()).basicRemove(otherEnd, msgs);
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
			case UML2Package.BEHAVIORAL_FEATURE__EANNOTATIONS:
				return getEAnnotations();
			case UML2Package.BEHAVIORAL_FEATURE__OWNED_ELEMENT:
				return getOwnedElements();
			case UML2Package.BEHAVIORAL_FEATURE__OWNER:
				if (resolve) return getOwner();
				return basicGetOwner();
			case UML2Package.BEHAVIORAL_FEATURE__OWNED_COMMENT:
				return getOwnedComments();
			case UML2Package.BEHAVIORAL_FEATURE__TEMPLATE_BINDING:
				return getTemplateBindings();
			case UML2Package.BEHAVIORAL_FEATURE__OWNED_TEMPLATE_SIGNATURE:
				return getOwnedTemplateSignature();
			case UML2Package.BEHAVIORAL_FEATURE__NAME:
				return getName();
			case UML2Package.BEHAVIORAL_FEATURE__QUALIFIED_NAME:
				return getQualifiedName();
			case UML2Package.BEHAVIORAL_FEATURE__VISIBILITY:
				return getVisibility();
			case UML2Package.BEHAVIORAL_FEATURE__CLIENT_DEPENDENCY:
				return getClientDependencies();
			case UML2Package.BEHAVIORAL_FEATURE__NAME_EXPRESSION:
				return getNameExpression();
			case UML2Package.BEHAVIORAL_FEATURE__MEMBER:
				return getMembers();
			case UML2Package.BEHAVIORAL_FEATURE__OWNED_RULE:
				return getOwnedRules();
			case UML2Package.BEHAVIORAL_FEATURE__IMPORTED_MEMBER:
				return getImportedMembers();
			case UML2Package.BEHAVIORAL_FEATURE__ELEMENT_IMPORT:
				return getElementImports();
			case UML2Package.BEHAVIORAL_FEATURE__PACKAGE_IMPORT:
				return getPackageImports();
			case UML2Package.BEHAVIORAL_FEATURE__REDEFINITION_CONTEXT:
				return getRedefinitionContexts();
			case UML2Package.BEHAVIORAL_FEATURE__IS_LEAF:
				return isLeaf() ? Boolean.TRUE : Boolean.FALSE;
			case UML2Package.BEHAVIORAL_FEATURE__FEATURING_CLASSIFIER:
				return getFeaturingClassifiers();
			case UML2Package.BEHAVIORAL_FEATURE__IS_STATIC:
				return isStatic() ? Boolean.TRUE : Boolean.FALSE;
			case UML2Package.BEHAVIORAL_FEATURE__PARAMETER:
				return getParameters();
			case UML2Package.BEHAVIORAL_FEATURE__FORMAL_PARAMETER:
				return getFormalParameters();
			case UML2Package.BEHAVIORAL_FEATURE__RETURN_RESULT:
				return getReturnResults();
			case UML2Package.BEHAVIORAL_FEATURE__RAISED_EXCEPTION:
				return getRaisedExceptions();
			case UML2Package.BEHAVIORAL_FEATURE__IS_ABSTRACT:
				return isAbstract() ? Boolean.TRUE : Boolean.FALSE;
			case UML2Package.BEHAVIORAL_FEATURE__METHOD:
				return getMethods();
			case UML2Package.BEHAVIORAL_FEATURE__CONCURRENCY:
				return getConcurrency();
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
			case UML2Package.BEHAVIORAL_FEATURE__EANNOTATIONS:
				getEAnnotations().clear();
				getEAnnotations().addAll((Collection)newValue);
				return;
			case UML2Package.BEHAVIORAL_FEATURE__OWNED_COMMENT:
				getOwnedComments().clear();
				getOwnedComments().addAll((Collection)newValue);
				return;
			case UML2Package.BEHAVIORAL_FEATURE__TEMPLATE_BINDING:
				getTemplateBindings().clear();
				getTemplateBindings().addAll((Collection)newValue);
				return;
			case UML2Package.BEHAVIORAL_FEATURE__OWNED_TEMPLATE_SIGNATURE:
				setOwnedTemplateSignature((TemplateSignature)newValue);
				return;
			case UML2Package.BEHAVIORAL_FEATURE__NAME:
				setName((String)newValue);
				return;
			case UML2Package.BEHAVIORAL_FEATURE__VISIBILITY:
				setVisibility((VisibilityKind)newValue);
				return;
			case UML2Package.BEHAVIORAL_FEATURE__CLIENT_DEPENDENCY:
				getClientDependencies().clear();
				getClientDependencies().addAll((Collection)newValue);
				return;
			case UML2Package.BEHAVIORAL_FEATURE__NAME_EXPRESSION:
				setNameExpression((StringExpression)newValue);
				return;
			case UML2Package.BEHAVIORAL_FEATURE__OWNED_RULE:
				getOwnedRules().clear();
				getOwnedRules().addAll((Collection)newValue);
				return;
			case UML2Package.BEHAVIORAL_FEATURE__ELEMENT_IMPORT:
				getElementImports().clear();
				getElementImports().addAll((Collection)newValue);
				return;
			case UML2Package.BEHAVIORAL_FEATURE__PACKAGE_IMPORT:
				getPackageImports().clear();
				getPackageImports().addAll((Collection)newValue);
				return;
			case UML2Package.BEHAVIORAL_FEATURE__IS_LEAF:
				setIsLeaf(((Boolean)newValue).booleanValue());
				return;
			case UML2Package.BEHAVIORAL_FEATURE__IS_STATIC:
				setIsStatic(((Boolean)newValue).booleanValue());
				return;
			case UML2Package.BEHAVIORAL_FEATURE__FORMAL_PARAMETER:
				getFormalParameters().clear();
				getFormalParameters().addAll((Collection)newValue);
				return;
			case UML2Package.BEHAVIORAL_FEATURE__RETURN_RESULT:
				getReturnResults().clear();
				getReturnResults().addAll((Collection)newValue);
				return;
			case UML2Package.BEHAVIORAL_FEATURE__RAISED_EXCEPTION:
				getRaisedExceptions().clear();
				getRaisedExceptions().addAll((Collection)newValue);
				return;
			case UML2Package.BEHAVIORAL_FEATURE__IS_ABSTRACT:
				setIsAbstract(((Boolean)newValue).booleanValue());
				return;
			case UML2Package.BEHAVIORAL_FEATURE__METHOD:
				getMethods().clear();
				getMethods().addAll((Collection)newValue);
				return;
			case UML2Package.BEHAVIORAL_FEATURE__CONCURRENCY:
				setConcurrency((CallConcurrencyKind)newValue);
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
			case UML2Package.BEHAVIORAL_FEATURE__EANNOTATIONS:
				getEAnnotations().clear();
				return;
			case UML2Package.BEHAVIORAL_FEATURE__OWNED_COMMENT:
				getOwnedComments().clear();
				return;
			case UML2Package.BEHAVIORAL_FEATURE__TEMPLATE_BINDING:
				getTemplateBindings().clear();
				return;
			case UML2Package.BEHAVIORAL_FEATURE__OWNED_TEMPLATE_SIGNATURE:
				setOwnedTemplateSignature((TemplateSignature)null);
				return;
			case UML2Package.BEHAVIORAL_FEATURE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case UML2Package.BEHAVIORAL_FEATURE__VISIBILITY:
				setVisibility(VISIBILITY_EDEFAULT);
				return;
			case UML2Package.BEHAVIORAL_FEATURE__CLIENT_DEPENDENCY:
				getClientDependencies().clear();
				return;
			case UML2Package.BEHAVIORAL_FEATURE__NAME_EXPRESSION:
				setNameExpression((StringExpression)null);
				return;
			case UML2Package.BEHAVIORAL_FEATURE__OWNED_RULE:
				getOwnedRules().clear();
				return;
			case UML2Package.BEHAVIORAL_FEATURE__ELEMENT_IMPORT:
				getElementImports().clear();
				return;
			case UML2Package.BEHAVIORAL_FEATURE__PACKAGE_IMPORT:
				getPackageImports().clear();
				return;
			case UML2Package.BEHAVIORAL_FEATURE__IS_LEAF:
				setIsLeaf(IS_LEAF_EDEFAULT);
				return;
			case UML2Package.BEHAVIORAL_FEATURE__IS_STATIC:
				setIsStatic(IS_STATIC_EDEFAULT);
				return;
			case UML2Package.BEHAVIORAL_FEATURE__FORMAL_PARAMETER:
				getFormalParameters().clear();
				return;
			case UML2Package.BEHAVIORAL_FEATURE__RETURN_RESULT:
				getReturnResults().clear();
				return;
			case UML2Package.BEHAVIORAL_FEATURE__RAISED_EXCEPTION:
				getRaisedExceptions().clear();
				return;
			case UML2Package.BEHAVIORAL_FEATURE__IS_ABSTRACT:
				setIsAbstract(IS_ABSTRACT_EDEFAULT);
				return;
			case UML2Package.BEHAVIORAL_FEATURE__METHOD:
				getMethods().clear();
				return;
			case UML2Package.BEHAVIORAL_FEATURE__CONCURRENCY:
				setConcurrency(CONCURRENCY_EDEFAULT);
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
			case UML2Package.BEHAVIORAL_FEATURE__EANNOTATIONS:
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UML2Package.BEHAVIORAL_FEATURE__OWNED_ELEMENT:
				return isSetOwnedElements();
			case UML2Package.BEHAVIORAL_FEATURE__OWNER:
				return isSetOwner();
			case UML2Package.BEHAVIORAL_FEATURE__OWNED_COMMENT:
				return ownedComments != null && !ownedComments.isEmpty();
			case UML2Package.BEHAVIORAL_FEATURE__TEMPLATE_BINDING:
				return templateBindings != null && !templateBindings.isEmpty();
			case UML2Package.BEHAVIORAL_FEATURE__OWNED_TEMPLATE_SIGNATURE:
				return ownedTemplateSignature != null;
			case UML2Package.BEHAVIORAL_FEATURE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case UML2Package.BEHAVIORAL_FEATURE__QUALIFIED_NAME:
				return QUALIFIED_NAME_EDEFAULT == null ? getQualifiedName() != null : !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case UML2Package.BEHAVIORAL_FEATURE__VISIBILITY:
				return visibility != VISIBILITY_EDEFAULT;
			case UML2Package.BEHAVIORAL_FEATURE__CLIENT_DEPENDENCY:
				return clientDependencies != null && !clientDependencies.isEmpty();
			case UML2Package.BEHAVIORAL_FEATURE__NAME_EXPRESSION:
				return nameExpression != null;
			case UML2Package.BEHAVIORAL_FEATURE__MEMBER:
				return isSetMembers();
			case UML2Package.BEHAVIORAL_FEATURE__OWNED_RULE:
				return ownedRules != null && !ownedRules.isEmpty();
			case UML2Package.BEHAVIORAL_FEATURE__IMPORTED_MEMBER:
				return !getImportedMembers().isEmpty();
			case UML2Package.BEHAVIORAL_FEATURE__ELEMENT_IMPORT:
				return elementImports != null && !elementImports.isEmpty();
			case UML2Package.BEHAVIORAL_FEATURE__PACKAGE_IMPORT:
				return packageImports != null && !packageImports.isEmpty();
			case UML2Package.BEHAVIORAL_FEATURE__REDEFINITION_CONTEXT:
				return isSetRedefinitionContexts();
			case UML2Package.BEHAVIORAL_FEATURE__IS_LEAF:
				return ((eFlags & IS_LEAF_EFLAG) != 0) != IS_LEAF_EDEFAULT;
			case UML2Package.BEHAVIORAL_FEATURE__FEATURING_CLASSIFIER:
				return isSetFeaturingClassifiers();
			case UML2Package.BEHAVIORAL_FEATURE__IS_STATIC:
				return ((eFlags & IS_STATIC_EFLAG) != 0) != IS_STATIC_EDEFAULT;
			case UML2Package.BEHAVIORAL_FEATURE__PARAMETER:
				return isSetParameters();
			case UML2Package.BEHAVIORAL_FEATURE__FORMAL_PARAMETER:
				return formalParameters != null && !formalParameters.isEmpty();
			case UML2Package.BEHAVIORAL_FEATURE__RETURN_RESULT:
				return returnResults != null && !returnResults.isEmpty();
			case UML2Package.BEHAVIORAL_FEATURE__RAISED_EXCEPTION:
				return raisedExceptions != null && !raisedExceptions.isEmpty();
			case UML2Package.BEHAVIORAL_FEATURE__IS_ABSTRACT:
				return ((eFlags & IS_ABSTRACT_EFLAG) != 0) != IS_ABSTRACT_EDEFAULT;
			case UML2Package.BEHAVIORAL_FEATURE__METHOD:
				return methods != null && !methods.isEmpty();
			case UML2Package.BEHAVIORAL_FEATURE__CONCURRENCY:
				return concurrency != CONCURRENCY_EDEFAULT;
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
				case UML2Package.BEHAVIORAL_FEATURE__REDEFINITION_CONTEXT: return UML2Package.REDEFINABLE_ELEMENT__REDEFINITION_CONTEXT;
				case UML2Package.BEHAVIORAL_FEATURE__IS_LEAF: return UML2Package.REDEFINABLE_ELEMENT__IS_LEAF;
				default: return -1;
			}
		}
		if (baseClass == Feature.class) {
			switch (derivedFeatureID) {
				case UML2Package.BEHAVIORAL_FEATURE__FEATURING_CLASSIFIER: return UML2Package.FEATURE__FEATURING_CLASSIFIER;
				case UML2Package.BEHAVIORAL_FEATURE__IS_STATIC: return UML2Package.FEATURE__IS_STATIC;
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
		if (baseClass == RedefinableElement.class) {
			switch (baseFeatureID) {
				case UML2Package.REDEFINABLE_ELEMENT__REDEFINITION_CONTEXT: return UML2Package.BEHAVIORAL_FEATURE__REDEFINITION_CONTEXT;
				case UML2Package.REDEFINABLE_ELEMENT__IS_LEAF: return UML2Package.BEHAVIORAL_FEATURE__IS_LEAF;
				default: return -1;
			}
		}
		if (baseClass == Feature.class) {
			switch (baseFeatureID) {
				case UML2Package.FEATURE__FEATURING_CLASSIFIER: return UML2Package.BEHAVIORAL_FEATURE__FEATURING_CLASSIFIER;
				case UML2Package.FEATURE__IS_STATIC: return UML2Package.BEHAVIORAL_FEATURE__IS_STATIC;
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
		result.append(" (isLeaf: "); //$NON-NLS-1$
		result.append((eFlags & IS_LEAF_EFLAG) != 0);
		result.append(", isStatic: "); //$NON-NLS-1$
		result.append((eFlags & IS_STATIC_EFLAG) != 0);
		result.append(", isAbstract: "); //$NON-NLS-1$
		result.append((eFlags & IS_ABSTRACT_EFLAG) != 0);
		result.append(", concurrency: "); //$NON-NLS-1$
		result.append(concurrency);
		result.append(')');
		return result.toString();
	}


} //BehavioralFeatureImpl
