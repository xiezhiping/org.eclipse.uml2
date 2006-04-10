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
 * $Id: BehaviorImpl.java,v 1.40 2006/04/10 20:40:16 khussey Exp $
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

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EcoreEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.uml2.Behavior;
import org.eclipse.uml2.BehavioralFeature;
import org.eclipse.uml2.BehavioredClassifier;
import org.eclipse.uml2.CollaborationOccurrence;
import org.eclipse.uml2.Constraint;
import org.eclipse.uml2.Parameter;
import org.eclipse.uml2.ParameterSet;
import org.eclipse.uml2.StringExpression;
import org.eclipse.uml2.TemplateParameter;
import org.eclipse.uml2.TemplateSignature;
import org.eclipse.uml2.UML2Factory;
import org.eclipse.uml2.UML2Package;
import org.eclipse.uml2.VisibilityKind;

import org.eclipse.uml2.common.util.SubsetSupersetEObjectContainmentWithInverseEList;
import org.eclipse.uml2.common.util.SubsetSupersetEObjectEList;

import org.eclipse.uml2.common.util.CacheAdapter;
import org.eclipse.uml2.internal.operation.BehaviorOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Behavior</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2.impl.BehaviorImpl#getOwnedRules <em>Owned Rule</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.BehaviorImpl#isReentrant <em>Is Reentrant</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.BehaviorImpl#getContext <em>Context</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.BehaviorImpl#getRedefinedBehaviors <em>Redefined Behavior</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.BehaviorImpl#getSpecification <em>Specification</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.BehaviorImpl#getParameters <em>Parameter</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.BehaviorImpl#getFormalParameters <em>Formal Parameter</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.BehaviorImpl#getReturnResults <em>Return Result</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.BehaviorImpl#getPreconditions <em>Precondition</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.BehaviorImpl#getPostconditions <em>Postcondition</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.BehaviorImpl#getOwnedParameterSets <em>Owned Parameter Set</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class BehaviorImpl extends ClassImpl implements Behavior {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) IBM Corporation and others."; //$NON-NLS-1$

	/**
	 * The default value of the '{@link #isReentrant() <em>Is Reentrant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isReentrant()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_REENTRANT_EDEFAULT = false;

	/**
	 * The flag representing the value of the '{@link #isReentrant() <em>Is Reentrant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isReentrant()
	 * @generated
	 * @ordered
	 */
	protected static final int IS_REENTRANT_EFLAG = 1 << 11;

	/**
	 * The cached value of the '{@link #getRedefinedBehaviors() <em>Redefined Behavior</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRedefinedBehaviors()
	 * @generated
	 * @ordered
	 */
	protected EList redefinedBehaviors = null;

	/**
	 * The cached value of the '{@link #getSpecification() <em>Specification</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecification()
	 * @generated
	 * @ordered
	 */
	protected BehavioralFeature specification = null;

	/**
	 * The cached value of the '{@link #getParameters() <em>Parameter</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameters()
	 * @generated
	 * @ordered
	 */
	protected EList parameters = null;

	/**
	 * The cached value of the '{@link #getPreconditions() <em>Precondition</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreconditions()
	 * @generated
	 * @ordered
	 */
	protected EList preconditions = null;

	/**
	 * The cached value of the '{@link #getPostconditions() <em>Postcondition</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPostconditions()
	 * @generated
	 * @ordered
	 */
	protected EList postconditions = null;

	/**
	 * The cached value of the '{@link #getOwnedParameterSets() <em>Owned Parameter Set</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedParameterSets()
	 * @generated
	 * @ordered
	 */
	protected EList ownedParameterSets = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BehaviorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return UML2Package.Literals.BEHAVIOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isReentrant() {
		return (eFlags & IS_REENTRANT_EFLAG) != 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsReentrant(boolean newIsReentrant) {
		boolean oldIsReentrant = (eFlags & IS_REENTRANT_EFLAG) != 0;
		if (newIsReentrant) eFlags |= IS_REENTRANT_EFLAG; else eFlags &= ~IS_REENTRANT_EFLAG;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2Package.BEHAVIOR__IS_REENTRANT, oldIsReentrant, newIsReentrant));


	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BehavioredClassifier getContext() {
		if (eContainerFeatureID != UML2Package.BEHAVIOR__CONTEXT) return null;
		return (BehavioredClassifier)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContext(BehavioredClassifier newContext, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newContext, UML2Package.BEHAVIOR__CONTEXT, msgs);

		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContext(BehavioredClassifier newContext) {
		if (newContext != eInternalContainer() || (eContainerFeatureID != UML2Package.BEHAVIOR__CONTEXT && newContext != null)) {
			if (EcoreUtil.isAncestor(this, newContext))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString()); //$NON-NLS-1$
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newContext != null)
				msgs = ((InternalEObject)newContext).eInverseAdd(this, UML2Package.BEHAVIORED_CLASSIFIER__OWNED_BEHAVIOR, BehavioredClassifier.class, msgs);
			msgs = basicSetContext(newContext, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2Package.BEHAVIOR__CONTEXT, newContext, newContext));

	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getRedefinedBehaviors() {
		if (redefinedBehaviors == null) {
			redefinedBehaviors = new EObjectResolvingEList(Behavior.class, this, UML2Package.BEHAVIOR__REDEFINED_BEHAVIOR);
		}
		return redefinedBehaviors;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
    public Behavior getRedefinedBehavior(String name) {
		return getRedefinedBehavior(name, false, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Behavior getRedefinedBehavior(String name, boolean ignoreCase, EClass eClass) {
		redefinedBehaviorLoop: for (Iterator i = getRedefinedBehaviors().iterator(); i.hasNext(); ) {
			Behavior redefinedBehavior = (Behavior) i.next();
			if (eClass != null && !eClass.isInstance(redefinedBehavior))
				continue redefinedBehaviorLoop;
			if (name != null && !(ignoreCase ? name.equalsIgnoreCase(redefinedBehavior.getName()) : name.equals(redefinedBehavior.getName())))
				continue redefinedBehaviorLoop;
			return redefinedBehavior;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BehavioralFeature getSpecification() {
		if (specification != null && specification.eIsProxy()) {
			InternalEObject oldSpecification = (InternalEObject)specification;
			specification = (BehavioralFeature)eResolveProxy(oldSpecification);
			if (specification != oldSpecification) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UML2Package.BEHAVIOR__SPECIFICATION, oldSpecification, specification));
			}
		}
		return specification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BehavioralFeature basicGetSpecification() {
		return specification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSpecification(BehavioralFeature newSpecification, NotificationChain msgs) {
		BehavioralFeature oldSpecification = specification;
		specification = newSpecification;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UML2Package.BEHAVIOR__SPECIFICATION, oldSpecification, newSpecification);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}

		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpecification(BehavioralFeature newSpecification) {
		if (newSpecification != specification) {
			NotificationChain msgs = null;
			if (specification != null)
				msgs = ((InternalEObject)specification).eInverseRemove(this, UML2Package.BEHAVIORAL_FEATURE__METHOD, BehavioralFeature.class, msgs);
			if (newSpecification != null)
				msgs = ((InternalEObject)newSpecification).eInverseAdd(this, UML2Package.BEHAVIORAL_FEATURE__METHOD, BehavioralFeature.class, msgs);
			msgs = basicSetSpecification(newSpecification, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2Package.BEHAVIOR__SPECIFICATION, newSpecification, newSpecification));

	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getParameters() {
		if (parameters == null) {
			parameters = new EObjectContainmentEList(Parameter.class, this, UML2Package.BEHAVIOR__PARAMETER);
		}
		return parameters;
	}


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
	 * @generated NOT
	 * @deprecated Use #createParameter() instead.
	 */
	public Parameter createParameter(EClass eClass) {
		Parameter newParameter = (Parameter) eClass.getEPackage().getEFactoryInstance().create(eClass);
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, 0, UML2Package.BEHAVIOR__PARAMETER, null, newParameter));
		}
		getParameters().add(newParameter);
		return newParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Parameter createParameter() {
		Parameter newParameter = UML2Factory.eINSTANCE.createParameter();
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, 0, UML2Package.BEHAVIOR__PARAMETER, null, newParameter));
		}
		getParameters().add(newParameter);
		return newParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList getFormalParameters() {
		CacheAdapter cache = getCacheAdapter();

		if (cache != null) {
			EList result = (EList) cache.get(eResource(), this,
				UML2Package.Literals.BEHAVIOR__FORMAL_PARAMETER);

			if (result == null) {
				EList formalParameters = BehaviorOperations
					.getFormalParameters(this);
				cache.put(eResource(), this,
					UML2Package.Literals.BEHAVIOR__FORMAL_PARAMETER,
					result = new EcoreEList.UnmodifiableEList(this,
						UML2Package.Literals.BEHAVIOR__FORMAL_PARAMETER,
						formalParameters.size(), formalParameters.toArray()));
			}

			return result;
		}

		EList formalParameters = BehaviorOperations.getFormalParameters(this);
		return new EcoreEList.UnmodifiableEList(this,
			UML2Package.Literals.BEHAVIOR__FORMAL_PARAMETER, formalParameters
				.size(), formalParameters.toArray());
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
	 */
	public EList getReturnResults() {
		CacheAdapter cache = getCacheAdapter();

		if (cache != null) {
			EList result = (EList) cache.get(eResource(), this,
				UML2Package.Literals.BEHAVIOR__RETURN_RESULT);

			if (result == null) {
				EList returnResults = BehaviorOperations.getReturnResults(this);
				cache.put(eResource(), this,
					UML2Package.Literals.BEHAVIOR__RETURN_RESULT,
					result = new EcoreEList.UnmodifiableEList(this,
						UML2Package.Literals.BEHAVIOR__RETURN_RESULT,
						returnResults.size(), returnResults.toArray()));
			}

			return result;
		}

		EList returnResults = BehaviorOperations.getReturnResults(this);
		return new EcoreEList.UnmodifiableEList(this,
			UML2Package.Literals.BEHAVIOR__RETURN_RESULT, returnResults.size(),
			returnResults.toArray());
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
	 * @generated
	 */
	public EList getPreconditions() {
		if (preconditions == null) {
			preconditions = new SubsetSupersetEObjectEList(Constraint.class, this, UML2Package.BEHAVIOR__PRECONDITION, PRECONDITION_ESUPERSETS, null);
		}
		return preconditions;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
    public Constraint getPrecondition(String name) {
		return getPrecondition(name, false, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Constraint getPrecondition(String name, boolean ignoreCase, EClass eClass) {
		preconditionLoop: for (Iterator i = getPreconditions().iterator(); i.hasNext(); ) {
			Constraint precondition = (Constraint) i.next();
			if (eClass != null && !eClass.isInstance(precondition))
				continue preconditionLoop;
			if (name != null && !(ignoreCase ? name.equalsIgnoreCase(precondition.getName()) : name.equals(precondition.getName())))
				continue preconditionLoop;
			return precondition;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getPostconditions() {
		if (postconditions == null) {
			postconditions = new SubsetSupersetEObjectEList(Constraint.class, this, UML2Package.BEHAVIOR__POSTCONDITION, POSTCONDITION_ESUPERSETS, null);
		}
		return postconditions;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
    public Constraint getPostcondition(String name) {
		return getPostcondition(name, false, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Constraint getPostcondition(String name, boolean ignoreCase, EClass eClass) {
		postconditionLoop: for (Iterator i = getPostconditions().iterator(); i.hasNext(); ) {
			Constraint postcondition = (Constraint) i.next();
			if (eClass != null && !eClass.isInstance(postcondition))
				continue postconditionLoop;
			if (name != null && !(ignoreCase ? name.equalsIgnoreCase(postcondition.getName()) : name.equals(postcondition.getName())))
				continue postconditionLoop;
			return postcondition;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getOwnedParameterSets() {
		if (ownedParameterSets == null) {
			ownedParameterSets = new EObjectContainmentEList(ParameterSet.class, this, UML2Package.BEHAVIOR__OWNED_PARAMETER_SET);
		}
		return ownedParameterSets;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
    public ParameterSet getOwnedParameterSet(String name) {
		return getOwnedParameterSet(name, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterSet getOwnedParameterSet(String name, boolean ignoreCase) {
		ownedParameterSetLoop: for (Iterator i = getOwnedParameterSets().iterator(); i.hasNext(); ) {
			ParameterSet ownedParameterSet = (ParameterSet) i.next();
			if (name != null && !(ignoreCase ? name.equalsIgnoreCase(ownedParameterSet.getName()) : name.equals(ownedParameterSet.getName())))
				continue ownedParameterSetLoop;
			return ownedParameterSet;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UML2Package.BEHAVIOR__EANNOTATIONS:
				return ((InternalEList)getEAnnotations()).basicAdd(otherEnd, msgs);
			case UML2Package.BEHAVIOR__TEMPLATE_BINDING:
				return ((InternalEList)getTemplateBindings()).basicAdd(otherEnd, msgs);
			case UML2Package.BEHAVIOR__OWNED_TEMPLATE_SIGNATURE:
				if (ownedTemplateSignature != null)
					msgs = ((InternalEObject)ownedTemplateSignature).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UML2Package.BEHAVIOR__OWNED_TEMPLATE_SIGNATURE, null, msgs);
				return basicSetOwnedTemplateSignature((TemplateSignature)otherEnd, msgs);
			case UML2Package.BEHAVIOR__CLIENT_DEPENDENCY:
				return ((InternalEList)getClientDependencies()).basicAdd(otherEnd, msgs);
			case UML2Package.BEHAVIOR__OWNED_RULE:
				return ((InternalEList)getOwnedRules()).basicAdd(otherEnd, msgs);
			case UML2Package.BEHAVIOR__ELEMENT_IMPORT:
				return ((InternalEList)getElementImports()).basicAdd(otherEnd, msgs);
			case UML2Package.BEHAVIOR__PACKAGE_IMPORT:
				return ((InternalEList)getPackageImports()).basicAdd(otherEnd, msgs);
			case UML2Package.BEHAVIOR__TEMPLATE_PARAMETER:
				if (templateParameter != null)
					msgs = ((InternalEObject)templateParameter).eInverseRemove(this, UML2Package.TEMPLATE_PARAMETER__PARAMETERED_ELEMENT, TemplateParameter.class, msgs);
				return basicSetTemplateParameter((TemplateParameter)otherEnd, msgs);
			case UML2Package.BEHAVIOR__OWNING_PARAMETER:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOwningParameter((TemplateParameter)otherEnd, msgs);
			case UML2Package.BEHAVIOR__GENERALIZATION:
				return ((InternalEList)getGeneralizations()).basicAdd(otherEnd, msgs);
			case UML2Package.BEHAVIOR__SUBSTITUTION:
				return ((InternalEList)getSubstitutions()).basicAdd(otherEnd, msgs);
			case UML2Package.BEHAVIOR__POWERTYPE_EXTENT:
				return ((InternalEList)getPowertypeExtents()).basicAdd(otherEnd, msgs);
			case UML2Package.BEHAVIOR__USE_CASE:
				return ((InternalEList)getUseCases()).basicAdd(otherEnd, msgs);
			case UML2Package.BEHAVIOR__OWNED_BEHAVIOR:
				return ((InternalEList)getOwnedBehaviors()).basicAdd(otherEnd, msgs);
			case UML2Package.BEHAVIOR__IMPLEMENTATION:
				return ((InternalEList)getImplementations()).basicAdd(otherEnd, msgs);
			case UML2Package.BEHAVIOR__OWNED_STATE_MACHINE:
				return ((InternalEList)getOwnedStateMachines()).basicAdd(otherEnd, msgs);
			case UML2Package.BEHAVIOR__OWNED_OPERATION:
				return ((InternalEList)getOwnedOperations()).basicAdd(otherEnd, msgs);
			case UML2Package.BEHAVIOR__CONTEXT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetContext((BehavioredClassifier)otherEnd, msgs);
			case UML2Package.BEHAVIOR__SPECIFICATION:
				if (specification != null)
					msgs = ((InternalEObject)specification).eInverseRemove(this, UML2Package.BEHAVIORAL_FEATURE__METHOD, BehavioralFeature.class, msgs);
				return basicSetSpecification((BehavioralFeature)otherEnd, msgs);
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
			case UML2Package.BEHAVIOR__EANNOTATIONS:
				return ((InternalEList)getEAnnotations()).basicRemove(otherEnd, msgs);
			case UML2Package.BEHAVIOR__OWNED_COMMENT:
				return ((InternalEList)getOwnedComments()).basicRemove(otherEnd, msgs);
			case UML2Package.BEHAVIOR__TEMPLATE_BINDING:
				return ((InternalEList)getTemplateBindings()).basicRemove(otherEnd, msgs);
			case UML2Package.BEHAVIOR__OWNED_TEMPLATE_SIGNATURE:
				return basicSetOwnedTemplateSignature(null, msgs);
			case UML2Package.BEHAVIOR__CLIENT_DEPENDENCY:
				return ((InternalEList)getClientDependencies()).basicRemove(otherEnd, msgs);
			case UML2Package.BEHAVIOR__NAME_EXPRESSION:
				return basicSetNameExpression(null, msgs);
			case UML2Package.BEHAVIOR__OWNED_RULE:
				return ((InternalEList)getOwnedRules()).basicRemove(otherEnd, msgs);
			case UML2Package.BEHAVIOR__ELEMENT_IMPORT:
				return ((InternalEList)getElementImports()).basicRemove(otherEnd, msgs);
			case UML2Package.BEHAVIOR__PACKAGE_IMPORT:
				return ((InternalEList)getPackageImports()).basicRemove(otherEnd, msgs);
			case UML2Package.BEHAVIOR__TEMPLATE_PARAMETER:
				return basicSetTemplateParameter(null, msgs);
			case UML2Package.BEHAVIOR__OWNING_PARAMETER:
				return basicSetOwningParameter(null, msgs);
			case UML2Package.BEHAVIOR__GENERALIZATION:
				return ((InternalEList)getGeneralizations()).basicRemove(otherEnd, msgs);
			case UML2Package.BEHAVIOR__SUBSTITUTION:
				return ((InternalEList)getSubstitutions()).basicRemove(otherEnd, msgs);
			case UML2Package.BEHAVIOR__POWERTYPE_EXTENT:
				return ((InternalEList)getPowertypeExtents()).basicRemove(otherEnd, msgs);
			case UML2Package.BEHAVIOR__OWNED_USE_CASE:
				return ((InternalEList)getOwnedUseCases()).basicRemove(otherEnd, msgs);
			case UML2Package.BEHAVIOR__USE_CASE:
				return ((InternalEList)getUseCases()).basicRemove(otherEnd, msgs);
			case UML2Package.BEHAVIOR__OCCURRENCE:
				return ((InternalEList)getOccurrences()).basicRemove(otherEnd, msgs);
			case UML2Package.BEHAVIOR__OWNED_BEHAVIOR:
				return ((InternalEList)getOwnedBehaviors()).basicRemove(otherEnd, msgs);
			case UML2Package.BEHAVIOR__IMPLEMENTATION:
				return ((InternalEList)getImplementations()).basicRemove(otherEnd, msgs);
			case UML2Package.BEHAVIOR__OWNED_TRIGGER:
				return ((InternalEList)getOwnedTriggers()).basicRemove(otherEnd, msgs);
			case UML2Package.BEHAVIOR__OWNED_STATE_MACHINE:
				return ((InternalEList)getOwnedStateMachines()).basicRemove(otherEnd, msgs);
			case UML2Package.BEHAVIOR__OWNED_ATTRIBUTE:
				return ((InternalEList)getOwnedAttributes()).basicRemove(otherEnd, msgs);
			case UML2Package.BEHAVIOR__OWNED_CONNECTOR:
				return ((InternalEList)getOwnedConnectors()).basicRemove(otherEnd, msgs);
			case UML2Package.BEHAVIOR__OWNED_PORT:
				return ((InternalEList)getOwnedPorts()).basicRemove(otherEnd, msgs);
			case UML2Package.BEHAVIOR__OWNED_OPERATION:
				return ((InternalEList)getOwnedOperations()).basicRemove(otherEnd, msgs);
			case UML2Package.BEHAVIOR__NESTED_CLASSIFIER:
				return ((InternalEList)getNestedClassifiers()).basicRemove(otherEnd, msgs);
			case UML2Package.BEHAVIOR__OWNED_RECEPTION:
				return ((InternalEList)getOwnedReceptions()).basicRemove(otherEnd, msgs);
			case UML2Package.BEHAVIOR__CONTEXT:
				return basicSetContext(null, msgs);
			case UML2Package.BEHAVIOR__SPECIFICATION:
				return basicSetSpecification(null, msgs);
			case UML2Package.BEHAVIOR__PARAMETER:
				return ((InternalEList)getParameters()).basicRemove(otherEnd, msgs);
			case UML2Package.BEHAVIOR__OWNED_PARAMETER_SET:
				return ((InternalEList)getOwnedParameterSets()).basicRemove(otherEnd, msgs);
		}
		return eDynamicInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID) {
			case UML2Package.BEHAVIOR__OWNING_PARAMETER:
				return eInternalContainer().eInverseRemove(this, UML2Package.TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT, TemplateParameter.class, msgs);
			case UML2Package.BEHAVIOR__CONTEXT:
				return eInternalContainer().eInverseRemove(this, UML2Package.BEHAVIORED_CLASSIFIER__OWNED_BEHAVIOR, BehavioredClassifier.class, msgs);
		}
		return eDynamicBasicRemoveFromContainer(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 * @deprecated Use #createOwnedParameterSet() instead.
	 */
	public ParameterSet createOwnedParameterSet(EClass eClass) {
		ParameterSet newOwnedParameterSet = (ParameterSet) eClass.getEPackage().getEFactoryInstance().create(eClass);
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, 0, UML2Package.BEHAVIOR__OWNED_PARAMETER_SET, null, newOwnedParameterSet));
		}
		getOwnedParameterSets().add(newOwnedParameterSet);
		return newOwnedParameterSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public ParameterSet createOwnedParameterSet() {
		ParameterSet newOwnedParameterSet = UML2Factory.eINSTANCE.createParameterSet();
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, 0, UML2Package.BEHAVIOR__OWNED_PARAMETER_SET, null, newOwnedParameterSet));
		}
		getOwnedParameterSets().add(newOwnedParameterSet);
		return newOwnedParameterSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getOwnedRules() {
		if (ownedRules == null) {
			ownedRules = new SubsetSupersetEObjectContainmentWithInverseEList(Constraint.class, this, UML2Package.BEHAVIOR__OWNED_RULE, null, OWNED_RULE_ESUBSETS, UML2Package.CONSTRAINT__NAMESPACE);
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
	protected static final int[] OWNED_RULE_ESUBSETS = new int[] {UML2Package.BEHAVIOR__PRECONDITION, UML2Package.BEHAVIOR__POSTCONDITION};

	/**
	 * The array of superset feature identifiers for the '{@link #getPreconditions() <em>Precondition</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreconditions()
	 * @generated
	 * @ordered
	 */
	protected static final int[] PRECONDITION_ESUPERSETS = new int[] {UML2Package.BEHAVIOR__OWNED_RULE};

	/**
	 * The array of superset feature identifiers for the '{@link #getPostconditions() <em>Postcondition</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPostconditions()
	 * @generated
	 * @ordered
	 */
	protected static final int[] POSTCONDITION_ESUPERSETS = new int[] {UML2Package.BEHAVIOR__OWNED_RULE};

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UML2Package.BEHAVIOR__EANNOTATIONS:
				return getEAnnotations();
			case UML2Package.BEHAVIOR__OWNED_ELEMENT:
				return getOwnedElements();
			case UML2Package.BEHAVIOR__OWNER:
				if (resolve) return getOwner();
				return basicGetOwner();
			case UML2Package.BEHAVIOR__OWNED_COMMENT:
				return getOwnedComments();
			case UML2Package.BEHAVIOR__TEMPLATE_BINDING:
				return getTemplateBindings();
			case UML2Package.BEHAVIOR__OWNED_TEMPLATE_SIGNATURE:
				return getOwnedTemplateSignature();
			case UML2Package.BEHAVIOR__NAME:
				return getName();
			case UML2Package.BEHAVIOR__QUALIFIED_NAME:
				return getQualifiedName();
			case UML2Package.BEHAVIOR__VISIBILITY:
				return getVisibility();
			case UML2Package.BEHAVIOR__CLIENT_DEPENDENCY:
				return getClientDependencies();
			case UML2Package.BEHAVIOR__NAME_EXPRESSION:
				return getNameExpression();
			case UML2Package.BEHAVIOR__MEMBER:
				return getMembers();
			case UML2Package.BEHAVIOR__OWNED_RULE:
				return getOwnedRules();
			case UML2Package.BEHAVIOR__IMPORTED_MEMBER:
				return getImportedMembers();
			case UML2Package.BEHAVIOR__ELEMENT_IMPORT:
				return getElementImports();
			case UML2Package.BEHAVIOR__PACKAGE_IMPORT:
				return getPackageImports();
			case UML2Package.BEHAVIOR__TEMPLATE_PARAMETER:
				if (resolve) return getTemplateParameter();
				return basicGetTemplateParameter();
			case UML2Package.BEHAVIOR__OWNING_PARAMETER:
				return getOwningParameter();
			case UML2Package.BEHAVIOR__PACKAGEABLE_ELEMENT_VISIBILITY:
				return getPackageableElement_visibility();
			case UML2Package.BEHAVIOR__PACKAGE:
				return getPackage();
			case UML2Package.BEHAVIOR__REDEFINITION_CONTEXT:
				return getRedefinitionContexts();
			case UML2Package.BEHAVIOR__IS_LEAF:
				return isLeaf() ? Boolean.TRUE : Boolean.FALSE;
			case UML2Package.BEHAVIOR__FEATURE:
				return getFeatures();
			case UML2Package.BEHAVIOR__IS_ABSTRACT:
				return isAbstract() ? Boolean.TRUE : Boolean.FALSE;
			case UML2Package.BEHAVIOR__INHERITED_MEMBER:
				return getInheritedMembers();
			case UML2Package.BEHAVIOR__GENERAL:
				return getGenerals();
			case UML2Package.BEHAVIOR__GENERALIZATION:
				return getGeneralizations();
			case UML2Package.BEHAVIOR__ATTRIBUTE:
				return getAttributes();
			case UML2Package.BEHAVIOR__REDEFINED_CLASSIFIER:
				return getRedefinedClassifiers();
			case UML2Package.BEHAVIOR__SUBSTITUTION:
				return getSubstitutions();
			case UML2Package.BEHAVIOR__POWERTYPE_EXTENT:
				return getPowertypeExtents();
			case UML2Package.BEHAVIOR__OWNED_USE_CASE:
				return getOwnedUseCases();
			case UML2Package.BEHAVIOR__USE_CASE:
				return getUseCases();
			case UML2Package.BEHAVIOR__REPRESENTATION:
				return getRepresentation();
			case UML2Package.BEHAVIOR__OCCURRENCE:
				return getOccurrences();
			case UML2Package.BEHAVIOR__OWNED_BEHAVIOR:
				return getOwnedBehaviors();
			case UML2Package.BEHAVIOR__CLASSIFIER_BEHAVIOR:
				return getClassifierBehavior();
			case UML2Package.BEHAVIOR__IMPLEMENTATION:
				return getImplementations();
			case UML2Package.BEHAVIOR__OWNED_TRIGGER:
				return getOwnedTriggers();
			case UML2Package.BEHAVIOR__OWNED_STATE_MACHINE:
				return getOwnedStateMachines();
			case UML2Package.BEHAVIOR__OWNED_ATTRIBUTE:
				return getOwnedAttributes();
			case UML2Package.BEHAVIOR__PART:
				return getParts();
			case UML2Package.BEHAVIOR__ROLE:
				return getRoles();
			case UML2Package.BEHAVIOR__OWNED_CONNECTOR:
				return getOwnedConnectors();
			case UML2Package.BEHAVIOR__OWNED_PORT:
				return getOwnedPorts();
			case UML2Package.BEHAVIOR__OWNED_OPERATION:
				return getOwnedOperations();
			case UML2Package.BEHAVIOR__SUPER_CLASS:
				return getSuperClasses();
			case UML2Package.BEHAVIOR__EXTENSION:
				return getExtensions();
			case UML2Package.BEHAVIOR__NESTED_CLASSIFIER:
				return getNestedClassifiers();
			case UML2Package.BEHAVIOR__IS_ACTIVE:
				return isActive() ? Boolean.TRUE : Boolean.FALSE;
			case UML2Package.BEHAVIOR__OWNED_RECEPTION:
				return getOwnedReceptions();
			case UML2Package.BEHAVIOR__IS_REENTRANT:
				return isReentrant() ? Boolean.TRUE : Boolean.FALSE;
			case UML2Package.BEHAVIOR__CONTEXT:
				return getContext();
			case UML2Package.BEHAVIOR__REDEFINED_BEHAVIOR:
				return getRedefinedBehaviors();
			case UML2Package.BEHAVIOR__SPECIFICATION:
				if (resolve) return getSpecification();
				return basicGetSpecification();
			case UML2Package.BEHAVIOR__PARAMETER:
				return getParameters();
			case UML2Package.BEHAVIOR__FORMAL_PARAMETER:
				return getFormalParameters();
			case UML2Package.BEHAVIOR__RETURN_RESULT:
				return getReturnResults();
			case UML2Package.BEHAVIOR__PRECONDITION:
				return getPreconditions();
			case UML2Package.BEHAVIOR__POSTCONDITION:
				return getPostconditions();
			case UML2Package.BEHAVIOR__OWNED_PARAMETER_SET:
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
			case UML2Package.BEHAVIOR__EANNOTATIONS:
				getEAnnotations().clear();
				getEAnnotations().addAll((Collection)newValue);
				return;
			case UML2Package.BEHAVIOR__OWNED_COMMENT:
				getOwnedComments().clear();
				getOwnedComments().addAll((Collection)newValue);
				return;
			case UML2Package.BEHAVIOR__TEMPLATE_BINDING:
				getTemplateBindings().clear();
				getTemplateBindings().addAll((Collection)newValue);
				return;
			case UML2Package.BEHAVIOR__OWNED_TEMPLATE_SIGNATURE:
				setOwnedTemplateSignature((TemplateSignature)newValue);
				return;
			case UML2Package.BEHAVIOR__NAME:
				setName((String)newValue);
				return;
			case UML2Package.BEHAVIOR__VISIBILITY:
				setVisibility((VisibilityKind)newValue);
				return;
			case UML2Package.BEHAVIOR__CLIENT_DEPENDENCY:
				getClientDependencies().clear();
				getClientDependencies().addAll((Collection)newValue);
				return;
			case UML2Package.BEHAVIOR__NAME_EXPRESSION:
				setNameExpression((StringExpression)newValue);
				return;
			case UML2Package.BEHAVIOR__OWNED_RULE:
				getOwnedRules().clear();
				getOwnedRules().addAll((Collection)newValue);
				return;
			case UML2Package.BEHAVIOR__ELEMENT_IMPORT:
				getElementImports().clear();
				getElementImports().addAll((Collection)newValue);
				return;
			case UML2Package.BEHAVIOR__PACKAGE_IMPORT:
				getPackageImports().clear();
				getPackageImports().addAll((Collection)newValue);
				return;
			case UML2Package.BEHAVIOR__TEMPLATE_PARAMETER:
				setTemplateParameter((TemplateParameter)newValue);
				return;
			case UML2Package.BEHAVIOR__OWNING_PARAMETER:
				setOwningParameter((TemplateParameter)newValue);
				return;
			case UML2Package.BEHAVIOR__PACKAGEABLE_ELEMENT_VISIBILITY:
				setPackageableElement_visibility((VisibilityKind)newValue);
				return;
			case UML2Package.BEHAVIOR__IS_LEAF:
				setIsLeaf(((Boolean)newValue).booleanValue());
				return;
			case UML2Package.BEHAVIOR__IS_ABSTRACT:
				setIsAbstract(((Boolean)newValue).booleanValue());
				return;
			case UML2Package.BEHAVIOR__GENERALIZATION:
				getGeneralizations().clear();
				getGeneralizations().addAll((Collection)newValue);
				return;
			case UML2Package.BEHAVIOR__REDEFINED_CLASSIFIER:
				getRedefinedClassifiers().clear();
				getRedefinedClassifiers().addAll((Collection)newValue);
				return;
			case UML2Package.BEHAVIOR__SUBSTITUTION:
				getSubstitutions().clear();
				getSubstitutions().addAll((Collection)newValue);
				return;
			case UML2Package.BEHAVIOR__POWERTYPE_EXTENT:
				getPowertypeExtents().clear();
				getPowertypeExtents().addAll((Collection)newValue);
				return;
			case UML2Package.BEHAVIOR__OWNED_USE_CASE:
				getOwnedUseCases().clear();
				getOwnedUseCases().addAll((Collection)newValue);
				return;
			case UML2Package.BEHAVIOR__USE_CASE:
				getUseCases().clear();
				getUseCases().addAll((Collection)newValue);
				return;
			case UML2Package.BEHAVIOR__REPRESENTATION:
				setRepresentation((CollaborationOccurrence)newValue);
				return;
			case UML2Package.BEHAVIOR__OCCURRENCE:
				getOccurrences().clear();
				getOccurrences().addAll((Collection)newValue);
				return;
			case UML2Package.BEHAVIOR__OWNED_BEHAVIOR:
				getOwnedBehaviors().clear();
				getOwnedBehaviors().addAll((Collection)newValue);
				return;
			case UML2Package.BEHAVIOR__CLASSIFIER_BEHAVIOR:
				setClassifierBehavior((Behavior)newValue);
				return;
			case UML2Package.BEHAVIOR__IMPLEMENTATION:
				getImplementations().clear();
				getImplementations().addAll((Collection)newValue);
				return;
			case UML2Package.BEHAVIOR__OWNED_TRIGGER:
				getOwnedTriggers().clear();
				getOwnedTriggers().addAll((Collection)newValue);
				return;
			case UML2Package.BEHAVIOR__OWNED_STATE_MACHINE:
				getOwnedStateMachines().clear();
				getOwnedStateMachines().addAll((Collection)newValue);
				return;
			case UML2Package.BEHAVIOR__OWNED_ATTRIBUTE:
				getOwnedAttributes().clear();
				getOwnedAttributes().addAll((Collection)newValue);
				return;
			case UML2Package.BEHAVIOR__OWNED_CONNECTOR:
				getOwnedConnectors().clear();
				getOwnedConnectors().addAll((Collection)newValue);
				return;
			case UML2Package.BEHAVIOR__OWNED_PORT:
				getOwnedPorts().clear();
				getOwnedPorts().addAll((Collection)newValue);
				return;
			case UML2Package.BEHAVIOR__OWNED_OPERATION:
				getOwnedOperations().clear();
				getOwnedOperations().addAll((Collection)newValue);
				return;
			case UML2Package.BEHAVIOR__NESTED_CLASSIFIER:
				getNestedClassifiers().clear();
				getNestedClassifiers().addAll((Collection)newValue);
				return;
			case UML2Package.BEHAVIOR__IS_ACTIVE:
				setIsActive(((Boolean)newValue).booleanValue());
				return;
			case UML2Package.BEHAVIOR__OWNED_RECEPTION:
				getOwnedReceptions().clear();
				getOwnedReceptions().addAll((Collection)newValue);
				return;
			case UML2Package.BEHAVIOR__IS_REENTRANT:
				setIsReentrant(((Boolean)newValue).booleanValue());
				return;
			case UML2Package.BEHAVIOR__CONTEXT:
				setContext((BehavioredClassifier)newValue);
				return;
			case UML2Package.BEHAVIOR__REDEFINED_BEHAVIOR:
				getRedefinedBehaviors().clear();
				getRedefinedBehaviors().addAll((Collection)newValue);
				return;
			case UML2Package.BEHAVIOR__SPECIFICATION:
				setSpecification((BehavioralFeature)newValue);
				return;
			case UML2Package.BEHAVIOR__PARAMETER:
				getParameters().clear();
				getParameters().addAll((Collection)newValue);
				return;
			case UML2Package.BEHAVIOR__PRECONDITION:
				getPreconditions().clear();
				getPreconditions().addAll((Collection)newValue);
				return;
			case UML2Package.BEHAVIOR__POSTCONDITION:
				getPostconditions().clear();
				getPostconditions().addAll((Collection)newValue);
				return;
			case UML2Package.BEHAVIOR__OWNED_PARAMETER_SET:
				getOwnedParameterSets().clear();
				getOwnedParameterSets().addAll((Collection)newValue);
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
			case UML2Package.BEHAVIOR__EANNOTATIONS:
				getEAnnotations().clear();
				return;
			case UML2Package.BEHAVIOR__OWNED_COMMENT:
				getOwnedComments().clear();
				return;
			case UML2Package.BEHAVIOR__TEMPLATE_BINDING:
				getTemplateBindings().clear();
				return;
			case UML2Package.BEHAVIOR__OWNED_TEMPLATE_SIGNATURE:
				setOwnedTemplateSignature((TemplateSignature)null);
				return;
			case UML2Package.BEHAVIOR__NAME:
				setName(NAME_EDEFAULT);
				return;
			case UML2Package.BEHAVIOR__VISIBILITY:
				setVisibility(VISIBILITY_EDEFAULT);
				return;
			case UML2Package.BEHAVIOR__CLIENT_DEPENDENCY:
				getClientDependencies().clear();
				return;
			case UML2Package.BEHAVIOR__NAME_EXPRESSION:
				setNameExpression((StringExpression)null);
				return;
			case UML2Package.BEHAVIOR__OWNED_RULE:
				getOwnedRules().clear();
				return;
			case UML2Package.BEHAVIOR__ELEMENT_IMPORT:
				getElementImports().clear();
				return;
			case UML2Package.BEHAVIOR__PACKAGE_IMPORT:
				getPackageImports().clear();
				return;
			case UML2Package.BEHAVIOR__TEMPLATE_PARAMETER:
				setTemplateParameter((TemplateParameter)null);
				return;
			case UML2Package.BEHAVIOR__OWNING_PARAMETER:
				setOwningParameter((TemplateParameter)null);
				return;
			case UML2Package.BEHAVIOR__PACKAGEABLE_ELEMENT_VISIBILITY:
				setPackageableElement_visibility(PACKAGEABLE_ELEMENT_VISIBILITY_EDEFAULT);
				return;
			case UML2Package.BEHAVIOR__IS_LEAF:
				setIsLeaf(IS_LEAF_EDEFAULT);
				return;
			case UML2Package.BEHAVIOR__IS_ABSTRACT:
				setIsAbstract(IS_ABSTRACT_EDEFAULT);
				return;
			case UML2Package.BEHAVIOR__GENERALIZATION:
				getGeneralizations().clear();
				return;
			case UML2Package.BEHAVIOR__REDEFINED_CLASSIFIER:
				getRedefinedClassifiers().clear();
				return;
			case UML2Package.BEHAVIOR__SUBSTITUTION:
				getSubstitutions().clear();
				return;
			case UML2Package.BEHAVIOR__POWERTYPE_EXTENT:
				getPowertypeExtents().clear();
				return;
			case UML2Package.BEHAVIOR__OWNED_USE_CASE:
				getOwnedUseCases().clear();
				return;
			case UML2Package.BEHAVIOR__USE_CASE:
				getUseCases().clear();
				return;
			case UML2Package.BEHAVIOR__REPRESENTATION:
				setRepresentation((CollaborationOccurrence)null);
				return;
			case UML2Package.BEHAVIOR__OCCURRENCE:
				getOccurrences().clear();
				return;
			case UML2Package.BEHAVIOR__OWNED_BEHAVIOR:
				getOwnedBehaviors().clear();
				return;
			case UML2Package.BEHAVIOR__CLASSIFIER_BEHAVIOR:
				setClassifierBehavior((Behavior)null);
				return;
			case UML2Package.BEHAVIOR__IMPLEMENTATION:
				getImplementations().clear();
				return;
			case UML2Package.BEHAVIOR__OWNED_TRIGGER:
				getOwnedTriggers().clear();
				return;
			case UML2Package.BEHAVIOR__OWNED_STATE_MACHINE:
				getOwnedStateMachines().clear();
				return;
			case UML2Package.BEHAVIOR__OWNED_ATTRIBUTE:
				getOwnedAttributes().clear();
				return;
			case UML2Package.BEHAVIOR__OWNED_CONNECTOR:
				getOwnedConnectors().clear();
				return;
			case UML2Package.BEHAVIOR__OWNED_PORT:
				getOwnedPorts().clear();
				return;
			case UML2Package.BEHAVIOR__OWNED_OPERATION:
				getOwnedOperations().clear();
				return;
			case UML2Package.BEHAVIOR__NESTED_CLASSIFIER:
				getNestedClassifiers().clear();
				return;
			case UML2Package.BEHAVIOR__IS_ACTIVE:
				setIsActive(IS_ACTIVE_EDEFAULT);
				return;
			case UML2Package.BEHAVIOR__OWNED_RECEPTION:
				getOwnedReceptions().clear();
				return;
			case UML2Package.BEHAVIOR__IS_REENTRANT:
				setIsReentrant(IS_REENTRANT_EDEFAULT);
				return;
			case UML2Package.BEHAVIOR__CONTEXT:
				setContext((BehavioredClassifier)null);
				return;
			case UML2Package.BEHAVIOR__REDEFINED_BEHAVIOR:
				getRedefinedBehaviors().clear();
				return;
			case UML2Package.BEHAVIOR__SPECIFICATION:
				setSpecification((BehavioralFeature)null);
				return;
			case UML2Package.BEHAVIOR__PARAMETER:
				getParameters().clear();
				return;
			case UML2Package.BEHAVIOR__PRECONDITION:
				getPreconditions().clear();
				return;
			case UML2Package.BEHAVIOR__POSTCONDITION:
				getPostconditions().clear();
				return;
			case UML2Package.BEHAVIOR__OWNED_PARAMETER_SET:
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
			case UML2Package.BEHAVIOR__EANNOTATIONS:
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UML2Package.BEHAVIOR__OWNED_ELEMENT:
				return isSetOwnedElements();
			case UML2Package.BEHAVIOR__OWNER:
				return isSetOwner();
			case UML2Package.BEHAVIOR__OWNED_COMMENT:
				return ownedComments != null && !ownedComments.isEmpty();
			case UML2Package.BEHAVIOR__TEMPLATE_BINDING:
				return templateBindings != null && !templateBindings.isEmpty();
			case UML2Package.BEHAVIOR__OWNED_TEMPLATE_SIGNATURE:
				return ownedTemplateSignature != null;
			case UML2Package.BEHAVIOR__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case UML2Package.BEHAVIOR__QUALIFIED_NAME:
				return QUALIFIED_NAME_EDEFAULT == null ? getQualifiedName() != null : !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case UML2Package.BEHAVIOR__VISIBILITY:
				return isSetVisibility();
			case UML2Package.BEHAVIOR__CLIENT_DEPENDENCY:
				return clientDependencies != null && !clientDependencies.isEmpty();
			case UML2Package.BEHAVIOR__NAME_EXPRESSION:
				return nameExpression != null;
			case UML2Package.BEHAVIOR__MEMBER:
				return isSetMembers();
			case UML2Package.BEHAVIOR__OWNED_RULE:
				return ownedRules != null && !ownedRules.isEmpty();
			case UML2Package.BEHAVIOR__IMPORTED_MEMBER:
				return !getImportedMembers().isEmpty();
			case UML2Package.BEHAVIOR__ELEMENT_IMPORT:
				return elementImports != null && !elementImports.isEmpty();
			case UML2Package.BEHAVIOR__PACKAGE_IMPORT:
				return packageImports != null && !packageImports.isEmpty();
			case UML2Package.BEHAVIOR__TEMPLATE_PARAMETER:
				return templateParameter != null;
			case UML2Package.BEHAVIOR__OWNING_PARAMETER:
				return getOwningParameter() != null;
			case UML2Package.BEHAVIOR__PACKAGEABLE_ELEMENT_VISIBILITY:
				return isSetPackageableElement_visibility();
			case UML2Package.BEHAVIOR__PACKAGE:
				return getPackage() != null;
			case UML2Package.BEHAVIOR__REDEFINITION_CONTEXT:
				return isSetRedefinitionContexts();
			case UML2Package.BEHAVIOR__IS_LEAF:
				return ((eFlags & IS_LEAF_EFLAG) != 0) != IS_LEAF_EDEFAULT;
			case UML2Package.BEHAVIOR__FEATURE:
				return isSetFeatures();
			case UML2Package.BEHAVIOR__IS_ABSTRACT:
				return isSetIsAbstract();
			case UML2Package.BEHAVIOR__INHERITED_MEMBER:
				return !getInheritedMembers().isEmpty();
			case UML2Package.BEHAVIOR__GENERAL:
				return isSetGenerals();
			case UML2Package.BEHAVIOR__GENERALIZATION:
				return generalizations != null && !generalizations.isEmpty();
			case UML2Package.BEHAVIOR__ATTRIBUTE:
				return isSetAttributes();
			case UML2Package.BEHAVIOR__REDEFINED_CLASSIFIER:
				return redefinedClassifiers != null && !redefinedClassifiers.isEmpty();
			case UML2Package.BEHAVIOR__SUBSTITUTION:
				return substitutions != null && !substitutions.isEmpty();
			case UML2Package.BEHAVIOR__POWERTYPE_EXTENT:
				return powertypeExtents != null && !powertypeExtents.isEmpty();
			case UML2Package.BEHAVIOR__OWNED_USE_CASE:
				return ownedUseCases != null && !ownedUseCases.isEmpty();
			case UML2Package.BEHAVIOR__USE_CASE:
				return useCases != null && !useCases.isEmpty();
			case UML2Package.BEHAVIOR__REPRESENTATION:
				return representation != null;
			case UML2Package.BEHAVIOR__OCCURRENCE:
				return occurrences != null && !occurrences.isEmpty();
			case UML2Package.BEHAVIOR__OWNED_BEHAVIOR:
				return isSetOwnedBehaviors();
			case UML2Package.BEHAVIOR__CLASSIFIER_BEHAVIOR:
				return classifierBehavior != null;
			case UML2Package.BEHAVIOR__IMPLEMENTATION:
				return implementations != null && !implementations.isEmpty();
			case UML2Package.BEHAVIOR__OWNED_TRIGGER:
				return ownedTriggers != null && !ownedTriggers.isEmpty();
			case UML2Package.BEHAVIOR__OWNED_STATE_MACHINE:
				return isSetOwnedStateMachines();
			case UML2Package.BEHAVIOR__OWNED_ATTRIBUTE:
				return isSetOwnedAttributes();
			case UML2Package.BEHAVIOR__PART:
				return !getParts().isEmpty();
			case UML2Package.BEHAVIOR__ROLE:
				return isSetRoles();
			case UML2Package.BEHAVIOR__OWNED_CONNECTOR:
				return ownedConnectors != null && !ownedConnectors.isEmpty();
			case UML2Package.BEHAVIOR__OWNED_PORT:
				return ownedPorts != null && !ownedPorts.isEmpty();
			case UML2Package.BEHAVIOR__OWNED_OPERATION:
				return ownedOperations != null && !ownedOperations.isEmpty();
			case UML2Package.BEHAVIOR__SUPER_CLASS:
				return isSetSuperClasses();
			case UML2Package.BEHAVIOR__EXTENSION:
				return !getExtensions().isEmpty();
			case UML2Package.BEHAVIOR__NESTED_CLASSIFIER:
				return nestedClassifiers != null && !nestedClassifiers.isEmpty();
			case UML2Package.BEHAVIOR__IS_ACTIVE:
				return ((eFlags & IS_ACTIVE_EFLAG) != 0) != IS_ACTIVE_EDEFAULT;
			case UML2Package.BEHAVIOR__OWNED_RECEPTION:
				return ownedReceptions != null && !ownedReceptions.isEmpty();
			case UML2Package.BEHAVIOR__IS_REENTRANT:
				return ((eFlags & IS_REENTRANT_EFLAG) != 0) != IS_REENTRANT_EDEFAULT;
			case UML2Package.BEHAVIOR__CONTEXT:
				return getContext() != null;
			case UML2Package.BEHAVIOR__REDEFINED_BEHAVIOR:
				return redefinedBehaviors != null && !redefinedBehaviors.isEmpty();
			case UML2Package.BEHAVIOR__SPECIFICATION:
				return specification != null;
			case UML2Package.BEHAVIOR__PARAMETER:
				return parameters != null && !parameters.isEmpty();
			case UML2Package.BEHAVIOR__FORMAL_PARAMETER:
				return !getFormalParameters().isEmpty();
			case UML2Package.BEHAVIOR__RETURN_RESULT:
				return !getReturnResults().isEmpty();
			case UML2Package.BEHAVIOR__PRECONDITION:
				return preconditions != null && !preconditions.isEmpty();
			case UML2Package.BEHAVIOR__POSTCONDITION:
				return postconditions != null && !postconditions.isEmpty();
			case UML2Package.BEHAVIOR__OWNED_PARAMETER_SET:
				return ownedParameterSets != null && !ownedParameterSets.isEmpty();
		}
		return eDynamicIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (isReentrant: "); //$NON-NLS-1$
		result.append((eFlags & IS_REENTRANT_EFLAG) != 0);
		result.append(')');
		return result.toString();
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EList getRedefinedElementsHelper(EList redefinedElements) {
		super.getRedefinedElementsHelper(redefinedElements);
		if (eIsSet(UML2Package.BEHAVIOR__REDEFINED_BEHAVIOR)) {
			for (Iterator i = ((InternalEList) getRedefinedBehaviors()).basicIterator(); i.hasNext(); ) {
				redefinedElements.add(i.next());
			}
		}
		return redefinedElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRedefinedElements() {
		return super.isSetRedefinedElements()
			|| eIsSet(UML2Package.BEHAVIOR__REDEFINED_BEHAVIOR);
	}


	/**
	 * The array of subset feature identifiers for the '{@link #getRedefinedElements() <em>Redefined Element</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRedefinedElements()
	 * @generated
	 * @ordered
	 */
	protected static final int[] REDEFINED_ELEMENT_ESUBSETS = new int[] {UML2Package.BEHAVIOR__REDEFINED_CLASSIFIER, UML2Package.BEHAVIOR__REDEFINED_BEHAVIOR};

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EList getOwnedMembersHelper(EList ownedMembers) {
		super.getOwnedMembersHelper(ownedMembers);
		if (eIsSet(UML2Package.BEHAVIOR__PARAMETER)) {
			ownedMembers.addAll(getParameters());
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
			|| eIsSet(UML2Package.BEHAVIOR__PARAMETER);
	}


	/**
	 * The array of subset feature identifiers for the '{@link #getOwnedMembers() <em>Owned Member</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedMembers()
	 * @generated
	 * @ordered
	 */
	protected static final int[] OWNED_MEMBER_ESUBSETS = new int[] {UML2Package.BEHAVIOR__OWNED_RULE, UML2Package.BEHAVIOR__OWNED_USE_CASE, UML2Package.BEHAVIOR__OWNED_BEHAVIOR, UML2Package.BEHAVIOR__OWNED_TRIGGER, UML2Package.BEHAVIOR__OWNED_ATTRIBUTE, UML2Package.BEHAVIOR__OWNED_CONNECTOR, UML2Package.BEHAVIOR__OWNED_PORT, UML2Package.BEHAVIOR__OWNED_OPERATION, UML2Package.BEHAVIOR__NESTED_CLASSIFIER, UML2Package.BEHAVIOR__OWNED_RECEPTION, UML2Package.BEHAVIOR__PARAMETER};

} //BehaviorImpl
