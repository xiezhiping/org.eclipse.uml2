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
 * $Id: BehavioralFeatureImpl.java,v 1.21 2005/11/14 19:49:14 khussey Exp $
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
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

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
import org.eclipse.uml2.common.util.DerivedEObjectEList;
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
 *   <li>{@link org.eclipse.uml2.impl.BehavioralFeatureImpl#isLeaf <em>Is Leaf</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.BehavioralFeatureImpl#getFeaturingClassifiers <em>Featuring Classifier</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.BehavioralFeatureImpl#isStatic <em>Is Static</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.BehavioralFeatureImpl#getParameters <em>Parameter</em>}</li>
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
		return UML2Package.eINSTANCE.getBehavioralFeature();
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList getRedefinitionContexts() {
		EList redefinitionContext = (EList)eVirtualGet(UML2Package.BEHAVIORAL_FEATURE__REDEFINITION_CONTEXT);
		if (redefinitionContext == null) {
			eVirtualSet(UML2Package.BEHAVIORAL_FEATURE__REDEFINITION_CONTEXT, redefinitionContext = new DerivedEObjectEList(Classifier.class, this, UML2Package.BEHAVIORAL_FEATURE__REDEFINITION_CONTEXT, new EStructuralFeature[] {UML2Package.eINSTANCE.getElement_Owner()}));
		}
		return redefinitionContext;
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
		for (Iterator i = getRedefinitionContexts().iterator(); i.hasNext(); ) {
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
	protected EList getRedefinedElementsHelper(EList redefinedElement) {
		return redefinedElement;
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList getFeaturingClassifiers() {
		EList featuringClassifier = (EList)eVirtualGet(UML2Package.BEHAVIORAL_FEATURE__FEATURING_CLASSIFIER);
		if (featuringClassifier == null) {
			eVirtualSet(UML2Package.BEHAVIORAL_FEATURE__FEATURING_CLASSIFIER, featuringClassifier = new DerivedEObjectEList(Classifier.class, this, UML2Package.BEHAVIORAL_FEATURE__FEATURING_CLASSIFIER, new EStructuralFeature[] {UML2Package.eINSTANCE.getElement_Owner()}));
		}
		return featuringClassifier;
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
		for (Iterator i = getFeaturingClassifiers().iterator(); i.hasNext(); ) {
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
		CallConcurrencyKind concurrency = (CallConcurrencyKind)eVirtualGet(UML2Package.BEHAVIORAL_FEATURE__CONCURRENCY);
		return concurrency == null ? CONCURRENCY_EDEFAULT : concurrency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConcurrency(CallConcurrencyKind newConcurrency) {
		CallConcurrencyKind concurrency = newConcurrency == null ? CONCURRENCY_EDEFAULT : newConcurrency;
		Object oldConcurrency = eVirtualSet(UML2Package.BEHAVIORAL_FEATURE__CONCURRENCY, concurrency);
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2Package.BEHAVIORAL_FEATURE__CONCURRENCY, oldConcurrency == EVIRTUAL_NO_VALUE ? CONCURRENCY_EDEFAULT : oldConcurrency, concurrency));

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
		EList parameter = (EList)eVirtualGet(UML2Package.BEHAVIORAL_FEATURE__PARAMETER);
		if (parameter == null) {
			eVirtualSet(UML2Package.BEHAVIORAL_FEATURE__PARAMETER, parameter = new DerivedUnionEObjectEList(Parameter.class, this, UML2Package.BEHAVIORAL_FEATURE__PARAMETER, new EStructuralFeature[] {UML2Package.eINSTANCE.getBehavioralFeature_FormalParameter(), UML2Package.eINSTANCE.getBehavioralFeature_ReturnResult()}));
		}
		return parameter;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetParameters() {
		return eIsSet(UML2Package.eINSTANCE.getBehavioralFeature_FormalParameter())
			|| eIsSet(UML2Package.eINSTANCE.getBehavioralFeature_ReturnResult());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
    public Parameter getParameter(String name) {
		for (Iterator i = getParameters().iterator(); i.hasNext(); ) {
			Parameter parameter = (Parameter) i.next();
			if (name.equals(parameter.getName())) {
				return parameter;
			}
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EList getMembersHelper(EList member) {
		super.getMembersHelper(member);
		if (isSetParameters()) {
			for (Iterator i = ((InternalEList) getParameters()).basicIterator(); i.hasNext(); ) {
				member.add(i.next());
			}
		}
		return member;
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
	protected EList getOwnedMembersHelper(EList ownedMember) {
		super.getOwnedMembersHelper(ownedMember);
		EList formalParameter = getFormalParameters();
		if (!formalParameter.isEmpty()) {
			ownedMember.addAll(formalParameter);
		}
		EList returnResult = getReturnResults();
		if (!returnResult.isEmpty()) {
			ownedMember.addAll(returnResult);
		}
		return ownedMember;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOwnedMembers() {
		return super.isSetOwnedMembers()
			|| eIsSet(UML2Package.eINSTANCE.getBehavioralFeature_FormalParameter())
			|| eIsSet(UML2Package.eINSTANCE.getBehavioralFeature_ReturnResult());
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getFormalParameters() {
		EList formalParameter = (EList)eVirtualGet(UML2Package.BEHAVIORAL_FEATURE__FORMAL_PARAMETER);
		if (formalParameter == null) {
			eVirtualSet(UML2Package.BEHAVIORAL_FEATURE__FORMAL_PARAMETER, formalParameter = new EObjectContainmentEList(Parameter.class, this, UML2Package.BEHAVIORAL_FEATURE__FORMAL_PARAMETER));
		}
		return formalParameter;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
    public Parameter getFormalParameter(String name) {
		for (Iterator i = getFormalParameters().iterator(); i.hasNext(); ) {
			Parameter formalParameter = (Parameter) i.next();
			if (name.equals(formalParameter.getName())) {
				return formalParameter;
			}
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
		EList returnResult = (EList)eVirtualGet(UML2Package.BEHAVIORAL_FEATURE__RETURN_RESULT);
		if (returnResult == null) {
			eVirtualSet(UML2Package.BEHAVIORAL_FEATURE__RETURN_RESULT, returnResult = new EObjectContainmentEList(Parameter.class, this, UML2Package.BEHAVIORAL_FEATURE__RETURN_RESULT));
		}
		return returnResult;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
    public Parameter getReturnResult(String name) {
		for (Iterator i = getReturnResults().iterator(); i.hasNext(); ) {
			Parameter returnResult = (Parameter) i.next();
			if (name.equals(returnResult.getName())) {
				return returnResult;
			}
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
		EList raisedException = (EList)eVirtualGet(UML2Package.BEHAVIORAL_FEATURE__RAISED_EXCEPTION);
		if (raisedException == null) {
			eVirtualSet(UML2Package.BEHAVIORAL_FEATURE__RAISED_EXCEPTION, raisedException = new EObjectResolvingEList(Type.class, this, UML2Package.BEHAVIORAL_FEATURE__RAISED_EXCEPTION));
		}
		return raisedException;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
    public Type getRaisedException(String name) {
		for (Iterator i = getRaisedExceptions().iterator(); i.hasNext(); ) {
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
	public EList getMethods() {
		EList method = (EList)eVirtualGet(UML2Package.BEHAVIORAL_FEATURE__METHOD);
		if (method == null) {
			eVirtualSet(UML2Package.BEHAVIORAL_FEATURE__METHOD, method = new EObjectWithInverseResolvingEList(Behavior.class, this, UML2Package.BEHAVIORAL_FEATURE__METHOD, UML2Package.BEHAVIOR__SPECIFICATION));
		}
		return method;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
    public Behavior getMethod(String name) {
		for (Iterator i = getMethods().iterator(); i.hasNext(); ) {
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
				EList redefinedElement = (EList) cache.get(eResource(), this, method);
				if (redefinedElement == null) {
					List union = getRedefinedElementsHelper(new UniqueEList());
					cache.put(eResource(), this, method, redefinedElement = new UnionEObjectEList(this, null, union.size(), union.toArray()));
				}
				return redefinedElement;
			} catch (NoSuchMethodException nsme) {
				// ignore
			}
		}
		List union = getRedefinedElementsHelper(new UniqueEList());
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
		for (Iterator i = getRedefinedElements().iterator(); i.hasNext(); ) {
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
	public boolean isDistinguishableFrom(NamedElement n, Namespace ns) {
		return BehavioralFeatureOperations.isDistinguishableFrom(this, n, ns);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, Class baseClass, NotificationChain msgs) {
		if (featureID >= 0) {
			switch (eDerivedStructuralFeatureID(featureID, baseClass)) {
				case UML2Package.BEHAVIORAL_FEATURE__EANNOTATIONS:
					return ((InternalEList)getEAnnotations()).basicAdd(otherEnd, msgs);
				case UML2Package.BEHAVIORAL_FEATURE__TEMPLATE_BINDING:
					return ((InternalEList)getTemplateBindings()).basicAdd(otherEnd, msgs);
				case UML2Package.BEHAVIORAL_FEATURE__OWNED_TEMPLATE_SIGNATURE:
					TemplateSignature ownedTemplateSignature = (TemplateSignature)eVirtualGet(UML2Package.BEHAVIORAL_FEATURE__OWNED_TEMPLATE_SIGNATURE);
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
				default:
					return eDynamicInverseAdd(otherEnd, featureID, baseClass, msgs);
			}
		}
		if (eContainer != null)
			msgs = eBasicRemoveFromContainer(msgs);
		return eBasicSetContainer(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, Class baseClass, NotificationChain msgs) {
		if (featureID >= 0) {
			switch (eDerivedStructuralFeatureID(featureID, baseClass)) {
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
				default:
					return eDynamicInverseRemove(otherEnd, featureID, baseClass, msgs);
			}
		}
		return eBasicSetContainer(null, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(EStructuralFeature eFeature, boolean resolve) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
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
		return eDynamicGet(eFeature, resolve);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eSet(EStructuralFeature eFeature, Object newValue) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
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
		eDynamicSet(eFeature, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eUnset(EStructuralFeature eFeature) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
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
		eDynamicUnset(eFeature);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean eIsSet(EStructuralFeature eFeature) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case UML2Package.BEHAVIORAL_FEATURE__EANNOTATIONS:
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UML2Package.BEHAVIORAL_FEATURE__OWNED_ELEMENT:
				return isSetOwnedElements();
			case UML2Package.BEHAVIORAL_FEATURE__OWNER:
				return isSetOwner();
			case UML2Package.BEHAVIORAL_FEATURE__OWNED_COMMENT:
				EList ownedComment = (EList)eVirtualGet(UML2Package.BEHAVIORAL_FEATURE__OWNED_COMMENT);
				return ownedComment != null && !ownedComment.isEmpty();
			case UML2Package.BEHAVIORAL_FEATURE__TEMPLATE_BINDING:
				EList templateBinding = (EList)eVirtualGet(UML2Package.BEHAVIORAL_FEATURE__TEMPLATE_BINDING);
				return templateBinding != null && !templateBinding.isEmpty();
			case UML2Package.BEHAVIORAL_FEATURE__OWNED_TEMPLATE_SIGNATURE:
				return eVirtualGet(UML2Package.BEHAVIORAL_FEATURE__OWNED_TEMPLATE_SIGNATURE) != null;
			case UML2Package.BEHAVIORAL_FEATURE__NAME:
				String name = eVirtualIsSet(UML2Package.BEHAVIORAL_FEATURE__NAME) ? (String)eVirtualGet(UML2Package.BEHAVIORAL_FEATURE__NAME) : NAME_EDEFAULT;
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case UML2Package.BEHAVIORAL_FEATURE__QUALIFIED_NAME:
				return QUALIFIED_NAME_EDEFAULT == null ? getQualifiedName() != null : !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case UML2Package.BEHAVIORAL_FEATURE__VISIBILITY:
				return eVirtualIsSet(UML2Package.BEHAVIORAL_FEATURE__VISIBILITY) && eVirtualGet(UML2Package.BEHAVIORAL_FEATURE__VISIBILITY) != VISIBILITY_EDEFAULT;
			case UML2Package.BEHAVIORAL_FEATURE__CLIENT_DEPENDENCY:
				EList clientDependency = (EList)eVirtualGet(UML2Package.BEHAVIORAL_FEATURE__CLIENT_DEPENDENCY);
				return clientDependency != null && !clientDependency.isEmpty();
			case UML2Package.BEHAVIORAL_FEATURE__NAME_EXPRESSION:
				return eVirtualGet(UML2Package.BEHAVIORAL_FEATURE__NAME_EXPRESSION) != null;
			case UML2Package.BEHAVIORAL_FEATURE__MEMBER:
				return isSetMembers();
			case UML2Package.BEHAVIORAL_FEATURE__OWNED_RULE:
				EList ownedRule = (EList)eVirtualGet(UML2Package.BEHAVIORAL_FEATURE__OWNED_RULE);
				return ownedRule != null && !ownedRule.isEmpty();
			case UML2Package.BEHAVIORAL_FEATURE__IMPORTED_MEMBER:
				return !getImportedMembers().isEmpty();
			case UML2Package.BEHAVIORAL_FEATURE__ELEMENT_IMPORT:
				EList elementImport = (EList)eVirtualGet(UML2Package.BEHAVIORAL_FEATURE__ELEMENT_IMPORT);
				return elementImport != null && !elementImport.isEmpty();
			case UML2Package.BEHAVIORAL_FEATURE__PACKAGE_IMPORT:
				EList packageImport = (EList)eVirtualGet(UML2Package.BEHAVIORAL_FEATURE__PACKAGE_IMPORT);
				return packageImport != null && !packageImport.isEmpty();
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
				EList formalParameter = (EList)eVirtualGet(UML2Package.BEHAVIORAL_FEATURE__FORMAL_PARAMETER);
				return formalParameter != null && !formalParameter.isEmpty();
			case UML2Package.BEHAVIORAL_FEATURE__RETURN_RESULT:
				EList returnResult = (EList)eVirtualGet(UML2Package.BEHAVIORAL_FEATURE__RETURN_RESULT);
				return returnResult != null && !returnResult.isEmpty();
			case UML2Package.BEHAVIORAL_FEATURE__RAISED_EXCEPTION:
				EList raisedException = (EList)eVirtualGet(UML2Package.BEHAVIORAL_FEATURE__RAISED_EXCEPTION);
				return raisedException != null && !raisedException.isEmpty();
			case UML2Package.BEHAVIORAL_FEATURE__IS_ABSTRACT:
				return ((eFlags & IS_ABSTRACT_EFLAG) != 0) != IS_ABSTRACT_EDEFAULT;
			case UML2Package.BEHAVIORAL_FEATURE__METHOD:
				EList method = (EList)eVirtualGet(UML2Package.BEHAVIORAL_FEATURE__METHOD);
				return method != null && !method.isEmpty();
			case UML2Package.BEHAVIORAL_FEATURE__CONCURRENCY:
				return eVirtualIsSet(UML2Package.BEHAVIORAL_FEATURE__CONCURRENCY) && eVirtualGet(UML2Package.BEHAVIORAL_FEATURE__CONCURRENCY) != CONCURRENCY_EDEFAULT;
		}
		return eDynamicIsSet(eFeature);
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
		result.append(eVirtualIsSet(UML2Package.BEHAVIORAL_FEATURE__CONCURRENCY) ? eVirtualGet(UML2Package.BEHAVIORAL_FEATURE__CONCURRENCY) : CONCURRENCY_EDEFAULT);
		result.append(')');
		return result.toString();
	}


} //BehavioralFeatureImpl
