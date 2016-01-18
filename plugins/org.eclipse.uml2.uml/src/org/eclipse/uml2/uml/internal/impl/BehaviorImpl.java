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
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.uml2.common.util.CacheAdapter;
import org.eclipse.uml2.common.util.DerivedUnionEObjectEList;

import org.eclipse.uml2.common.util.SubsetSupersetEObjectContainmentWithInverseEList;
import org.eclipse.uml2.common.util.SubsetSupersetEObjectResolvingEList;
import org.eclipse.uml2.uml.AggregationKind;
import org.eclipse.uml2.uml.Behavior;
import org.eclipse.uml2.uml.BehavioralFeature;
import org.eclipse.uml2.uml.BehavioredClassifier;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.CollaborationUse;
import org.eclipse.uml2.uml.Comment;
import org.eclipse.uml2.uml.Connector;
import org.eclipse.uml2.uml.Constraint;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.ElementImport;
import org.eclipse.uml2.uml.Generalization;
import org.eclipse.uml2.uml.GeneralizationSet;
import org.eclipse.uml2.uml.InterfaceRealization;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Namespace;
import org.eclipse.uml2.uml.Operation;
import org.eclipse.uml2.uml.PackageImport;
import org.eclipse.uml2.uml.PackageableElement;
import org.eclipse.uml2.uml.Parameter;
import org.eclipse.uml2.uml.ParameterSet;
import org.eclipse.uml2.uml.ParameterableElement;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.Reception;
import org.eclipse.uml2.uml.RedefinableElement;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.StringExpression;
import org.eclipse.uml2.uml.Substitution;
import org.eclipse.uml2.uml.TemplateBinding;
import org.eclipse.uml2.uml.TemplateParameter;
import org.eclipse.uml2.uml.TemplateSignature;
import org.eclipse.uml2.uml.Type;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.UseCase;
import org.eclipse.uml2.uml.VisibilityKind;

import org.eclipse.uml2.uml.internal.operations.BehaviorOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Behavior</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.BehaviorImpl#getRedefinitionContexts <em>Redefinition Context</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.BehaviorImpl#getOwnedMembers <em>Owned Member</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.BehaviorImpl#getOwnedRules <em>Owned Rule</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.BehaviorImpl#getRedefinedClassifiers <em>Redefined Classifier</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.BehaviorImpl#getSpecification <em>Specification</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.BehaviorImpl#getContext <em>Context</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.BehaviorImpl#isReentrant <em>Is Reentrant</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.BehaviorImpl#getOwnedParameters <em>Owned Parameter</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.BehaviorImpl#getOwnedParameterSets <em>Owned Parameter Set</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.BehaviorImpl#getPostconditions <em>Postcondition</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.BehaviorImpl#getPreconditions <em>Precondition</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.BehaviorImpl#getRedefinedBehaviors <em>Redefined Behavior</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class BehaviorImpl
		extends ClassImpl
		implements Behavior {

	/**
	 * The cached value of the '{@link #getSpecification() <em>Specification</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecification()
	 * @generated
	 * @ordered
	 */
	protected BehavioralFeature specification;

	/**
	 * The default value of the '{@link #isReentrant() <em>Is Reentrant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isReentrant()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_REENTRANT_EDEFAULT = true;

	/**
	 * The flag representing the value of the '{@link #isReentrant() <em>Is Reentrant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isReentrant()
	 * @generated
	 * @ordered
	 */
	protected static final int IS_REENTRANT_EFLAG = 1 << 16;

	/**
	 * The flag representing whether the Is Reentrant attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected static final int IS_REENTRANT_ESETFLAG = 1 << 17;

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
	 * The cached value of the '{@link #getPostconditions() <em>Postcondition</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPostconditions()
	 * @generated
	 * @ordered
	 */
	protected EList<Constraint> postconditions;

	/**
	 * The cached value of the '{@link #getPreconditions() <em>Precondition</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreconditions()
	 * @generated
	 * @ordered
	 */
	protected EList<Constraint> preconditions;

	/**
	 * The cached value of the '{@link #getRedefinedBehaviors() <em>Redefined Behavior</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRedefinedBehaviors()
	 * @generated
	 * @ordered
	 */
	protected EList<Behavior> redefinedBehaviors;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BehaviorImpl() {
		super();
		eFlags |= IS_REENTRANT_EFLAG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UMLPackage.Literals.BEHAVIOR;
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
						UMLPackage.BEHAVIOR__OWNED_MEMBER,
						OWNED_MEMBER_ESUBSETS));
			}
			return ownedMembers;
		}
		return new DerivedUnionEObjectEList<NamedElement>(NamedElement.class,
			this, UMLPackage.BEHAVIOR__OWNED_MEMBER, OWNED_MEMBER_ESUBSETS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Classifier> getRedefinitionContexts() {
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
						UMLPackage.BEHAVIOR__REDEFINITION_CONTEXT,
						REDEFINITION_CONTEXT_ESUBSETS));
			}
			return redefinitionContexts;
		}
		return new DerivedUnionEObjectEList<Classifier>(Classifier.class, this,
			UMLPackage.BEHAVIOR__REDEFINITION_CONTEXT,
			REDEFINITION_CONTEXT_ESUBSETS);
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
		if (newIsReentrant)
			eFlags |= IS_REENTRANT_EFLAG;
		else
			eFlags &= ~IS_REENTRANT_EFLAG;
		boolean oldIsReentrantESet = (eFlags & IS_REENTRANT_ESETFLAG) != 0;
		eFlags |= IS_REENTRANT_ESETFLAG;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.BEHAVIOR__IS_REENTRANT, oldIsReentrant,
				newIsReentrant, !oldIsReentrantESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIsReentrant() {
		boolean oldIsReentrant = (eFlags & IS_REENTRANT_EFLAG) != 0;
		boolean oldIsReentrantESet = (eFlags & IS_REENTRANT_ESETFLAG) != 0;
		if (IS_REENTRANT_EDEFAULT)
			eFlags |= IS_REENTRANT_EFLAG;
		else
			eFlags &= ~IS_REENTRANT_EFLAG;
		eFlags &= ~IS_REENTRANT_ESETFLAG;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET,
				UMLPackage.BEHAVIOR__IS_REENTRANT, oldIsReentrant,
				IS_REENTRANT_EDEFAULT, oldIsReentrantESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIsReentrant() {
		return (eFlags & IS_REENTRANT_ESETFLAG) != 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Behavior> getRedefinedBehaviors() {
		if (redefinedBehaviors == null) {
			redefinedBehaviors = new SubsetSupersetEObjectResolvingEList<Behavior>(
				Behavior.class, this, UMLPackage.BEHAVIOR__REDEFINED_BEHAVIOR,
				REDEFINED_BEHAVIOR_ESUPERSETS, null);
		}
		return redefinedBehaviors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Parameter> getOwnedParameters() {
		if (ownedParameters == null) {
			ownedParameters = new EObjectContainmentEList.Resolving<Parameter>(
				Parameter.class, this, UMLPackage.BEHAVIOR__OWNED_PARAMETER);
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
	public BehavioredClassifier getContext() {
		BehavioredClassifier context = basicGetContext();
		return context != null && context.eIsProxy()
			? (BehavioredClassifier) eResolveProxy((InternalEObject) context)
			: context;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BehavioredClassifier basicGetContext() {
		return BehaviorOperations.getContext(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@SuppressWarnings("serial")
	public EList<Constraint> getPreconditions() {
		if (preconditions == null) {
			preconditions = new SubsetSupersetEObjectResolvingEList<Constraint>(
				Constraint.class, this, UMLPackage.BEHAVIOR__PRECONDITION,
				PRECONDITION_ESUPERSETS, null) {

				@Override
				protected boolean enforceSubsetConstraints() {
					return true;
				}

				@Override
				protected void didAdd(int index, Constraint newObject) {
					super.didAdd(index, newObject);

					supersetAdd(newObject);
				}
			};
		}
		return preconditions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@SuppressWarnings("serial")
	public EList<Constraint> getPostconditions() {
		if (postconditions == null) {
			postconditions = new SubsetSupersetEObjectResolvingEList<Constraint>(
				Constraint.class, this, UMLPackage.BEHAVIOR__POSTCONDITION,
				POSTCONDITION_ESUPERSETS, null) {

				@Override
				protected boolean enforceSubsetConstraints() {
					return true;
				}

				@Override
				protected void didAdd(int index, Constraint newObject) {
					super.didAdd(index, newObject);

					supersetAdd(newObject);
				}
			};
		}
		return postconditions;
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
				UMLPackage.BEHAVIOR__OWNED_PARAMETER_SET);
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
	public BehavioralFeature getSpecification() {
		if (specification != null && specification.eIsProxy()) {
			InternalEObject oldSpecification = (InternalEObject) specification;
			specification = (BehavioralFeature) eResolveProxy(oldSpecification);
			if (specification != oldSpecification) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
						UMLPackage.BEHAVIOR__SPECIFICATION, oldSpecification,
						specification));
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
	public NotificationChain basicSetSpecification(
			BehavioralFeature newSpecification, NotificationChain msgs) {
		BehavioralFeature oldSpecification = specification;
		specification = newSpecification;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
				Notification.SET, UMLPackage.BEHAVIOR__SPECIFICATION,
				oldSpecification, newSpecification);
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
	public void setSpecification(BehavioralFeature newSpecification) {
		if (newSpecification != specification) {
			NotificationChain msgs = null;
			if (specification != null)
				msgs = ((InternalEObject) specification).eInverseRemove(this,
					UMLPackage.BEHAVIORAL_FEATURE__METHOD,
					BehavioralFeature.class, msgs);
			if (newSpecification != null)
				msgs = ((InternalEObject) newSpecification).eInverseAdd(this,
					UMLPackage.BEHAVIORAL_FEATURE__METHOD,
					BehavioralFeature.class, msgs);
			msgs = basicSetSpecification(newSpecification, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.BEHAVIOR__SPECIFICATION, newSpecification,
				newSpecification));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateParametersMatch(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return BehaviorOperations.validateParametersMatch(this, diagnostics,
			context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFeatureOfContextClassifier(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return BehaviorOperations.validateFeatureOfContextClassifier(this,
			diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BehavioredClassifier behavioredClassifier(Element from) {
		return BehaviorOperations.behavioredClassifier(this, from);
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
				UMLPackage.Literals.BEHAVIOR___INPUT_PARAMETERS);
			if (result == null) {
				cache.put(this, UMLPackage.Literals.BEHAVIOR___INPUT_PARAMETERS,
					result = BehaviorOperations.inputParameters(this));
			}
			return result;
		}
		return BehaviorOperations.inputParameters(this);
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
				UMLPackage.Literals.BEHAVIOR___OUTPUT_PARAMETERS);
			if (result == null) {
				cache.put(this,
					UMLPackage.Literals.BEHAVIOR___OUTPUT_PARAMETERS,
					result = BehaviorOperations.outputParameters(this));
			}
			return result;
		}
		return BehaviorOperations.outputParameters(this);
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
			case UMLPackage.BEHAVIOR__EANNOTATIONS :
				return ((InternalEList<InternalEObject>) (InternalEList<?>) getEAnnotations())
					.basicAdd(otherEnd, msgs);
			case UMLPackage.BEHAVIOR__OWNED_RULE :
				return ((InternalEList<InternalEObject>) (InternalEList<?>) getOwnedRules())
					.basicAdd(otherEnd, msgs);
			case UMLPackage.BEHAVIOR__ELEMENT_IMPORT :
				return ((InternalEList<InternalEObject>) (InternalEList<?>) getElementImports())
					.basicAdd(otherEnd, msgs);
			case UMLPackage.BEHAVIOR__PACKAGE_IMPORT :
				return ((InternalEList<InternalEObject>) (InternalEList<?>) getPackageImports())
					.basicAdd(otherEnd, msgs);
			case UMLPackage.BEHAVIOR__OWNING_TEMPLATE_PARAMETER :
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOwningTemplateParameter(
					(TemplateParameter) otherEnd, msgs);
			case UMLPackage.BEHAVIOR__TEMPLATE_PARAMETER :
				if (templateParameter != null)
					msgs = ((InternalEObject) templateParameter).eInverseRemove(
						this,
						UMLPackage.TEMPLATE_PARAMETER__PARAMETERED_ELEMENT,
						TemplateParameter.class, msgs);
				return basicSetTemplateParameter((TemplateParameter) otherEnd,
					msgs);
			case UMLPackage.BEHAVIOR__TEMPLATE_BINDING :
				return ((InternalEList<InternalEObject>) (InternalEList<?>) getTemplateBindings())
					.basicAdd(otherEnd, msgs);
			case UMLPackage.BEHAVIOR__OWNED_TEMPLATE_SIGNATURE :
				if (ownedTemplateSignature != null)
					msgs = ((InternalEObject) ownedTemplateSignature)
						.eInverseRemove(this,
							EOPPOSITE_FEATURE_BASE
								- UMLPackage.BEHAVIOR__OWNED_TEMPLATE_SIGNATURE,
							null, msgs);
				return basicSetOwnedTemplateSignature(
					(TemplateSignature) otherEnd, msgs);
			case UMLPackage.BEHAVIOR__GENERALIZATION :
				return ((InternalEList<InternalEObject>) (InternalEList<?>) getGeneralizations())
					.basicAdd(otherEnd, msgs);
			case UMLPackage.BEHAVIOR__POWERTYPE_EXTENT :
				return ((InternalEList<InternalEObject>) (InternalEList<?>) getPowertypeExtents())
					.basicAdd(otherEnd, msgs);
			case UMLPackage.BEHAVIOR__USE_CASE :
				return ((InternalEList<InternalEObject>) (InternalEList<?>) getUseCases())
					.basicAdd(otherEnd, msgs);
			case UMLPackage.BEHAVIOR__SUBSTITUTION :
				return ((InternalEList<InternalEObject>) (InternalEList<?>) getSubstitutions())
					.basicAdd(otherEnd, msgs);
			case UMLPackage.BEHAVIOR__INTERFACE_REALIZATION :
				return ((InternalEList<InternalEObject>) (InternalEList<?>) getInterfaceRealizations())
					.basicAdd(otherEnd, msgs);
			case UMLPackage.BEHAVIOR__OWNED_OPERATION :
				return ((InternalEList<InternalEObject>) (InternalEList<?>) getOwnedOperations())
					.basicAdd(otherEnd, msgs);
			case UMLPackage.BEHAVIOR__SPECIFICATION :
				if (specification != null)
					msgs = ((InternalEObject) specification).eInverseRemove(
						this, UMLPackage.BEHAVIORAL_FEATURE__METHOD,
						BehavioralFeature.class, msgs);
				return basicSetSpecification((BehavioralFeature) otherEnd,
					msgs);
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
			case UMLPackage.BEHAVIOR__EANNOTATIONS :
				return ((InternalEList<?>) getEAnnotations())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.BEHAVIOR__OWNED_COMMENT :
				return ((InternalEList<?>) getOwnedComments())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.BEHAVIOR__NAME_EXPRESSION :
				return basicSetNameExpression(null, msgs);
			case UMLPackage.BEHAVIOR__OWNED_RULE :
				return ((InternalEList<?>) getOwnedRules())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.BEHAVIOR__ELEMENT_IMPORT :
				return ((InternalEList<?>) getElementImports())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.BEHAVIOR__PACKAGE_IMPORT :
				return ((InternalEList<?>) getPackageImports())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.BEHAVIOR__OWNING_TEMPLATE_PARAMETER :
				return basicSetOwningTemplateParameter(null, msgs);
			case UMLPackage.BEHAVIOR__TEMPLATE_PARAMETER :
				return basicSetTemplateParameter(null, msgs);
			case UMLPackage.BEHAVIOR__TEMPLATE_BINDING :
				return ((InternalEList<?>) getTemplateBindings())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.BEHAVIOR__OWNED_TEMPLATE_SIGNATURE :
				return basicSetOwnedTemplateSignature(null, msgs);
			case UMLPackage.BEHAVIOR__COLLABORATION_USE :
				return ((InternalEList<?>) getCollaborationUses())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.BEHAVIOR__GENERALIZATION :
				return ((InternalEList<?>) getGeneralizations())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.BEHAVIOR__POWERTYPE_EXTENT :
				return ((InternalEList<?>) getPowertypeExtents())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.BEHAVIOR__OWNED_USE_CASE :
				return ((InternalEList<?>) getOwnedUseCases())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.BEHAVIOR__USE_CASE :
				return ((InternalEList<?>) getUseCases()).basicRemove(otherEnd,
					msgs);
			case UMLPackage.BEHAVIOR__SUBSTITUTION :
				return ((InternalEList<?>) getSubstitutions())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.BEHAVIOR__OWNED_ATTRIBUTE :
				return ((InternalEList<?>) getOwnedAttributes())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.BEHAVIOR__OWNED_CONNECTOR :
				return ((InternalEList<?>) getOwnedConnectors())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.BEHAVIOR__INTERFACE_REALIZATION :
				return ((InternalEList<?>) getInterfaceRealizations())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.BEHAVIOR__OWNED_BEHAVIOR :
				return ((InternalEList<?>) getOwnedBehaviors())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.BEHAVIOR__OWNED_OPERATION :
				return ((InternalEList<?>) getOwnedOperations())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.BEHAVIOR__NESTED_CLASSIFIER :
				return ((InternalEList<?>) getNestedClassifiers())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.BEHAVIOR__OWNED_RECEPTION :
				return ((InternalEList<?>) getOwnedReceptions())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.BEHAVIOR__SPECIFICATION :
				return basicSetSpecification(null, msgs);
			case UMLPackage.BEHAVIOR__OWNED_PARAMETER :
				return ((InternalEList<?>) getOwnedParameters())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.BEHAVIOR__OWNED_PARAMETER_SET :
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
			case UMLPackage.BEHAVIOR__EANNOTATIONS :
				return getEAnnotations();
			case UMLPackage.BEHAVIOR__OWNED_COMMENT :
				return getOwnedComments();
			case UMLPackage.BEHAVIOR__OWNED_ELEMENT :
				return getOwnedElements();
			case UMLPackage.BEHAVIOR__OWNER :
				if (resolve)
					return getOwner();
				return basicGetOwner();
			case UMLPackage.BEHAVIOR__CLIENT_DEPENDENCY :
				return getClientDependencies();
			case UMLPackage.BEHAVIOR__NAME :
				return getName();
			case UMLPackage.BEHAVIOR__NAME_EXPRESSION :
				if (resolve)
					return getNameExpression();
				return basicGetNameExpression();
			case UMLPackage.BEHAVIOR__NAMESPACE :
				if (resolve)
					return getNamespace();
				return basicGetNamespace();
			case UMLPackage.BEHAVIOR__QUALIFIED_NAME :
				return getQualifiedName();
			case UMLPackage.BEHAVIOR__VISIBILITY :
				return getVisibility();
			case UMLPackage.BEHAVIOR__OWNED_RULE :
				return getOwnedRules();
			case UMLPackage.BEHAVIOR__ELEMENT_IMPORT :
				return getElementImports();
			case UMLPackage.BEHAVIOR__PACKAGE_IMPORT :
				return getPackageImports();
			case UMLPackage.BEHAVIOR__OWNED_MEMBER :
				return getOwnedMembers();
			case UMLPackage.BEHAVIOR__IMPORTED_MEMBER :
				return getImportedMembers();
			case UMLPackage.BEHAVIOR__MEMBER :
				return getMembers();
			case UMLPackage.BEHAVIOR__IS_LEAF :
				return isLeaf();
			case UMLPackage.BEHAVIOR__REDEFINED_ELEMENT :
				return getRedefinedElements();
			case UMLPackage.BEHAVIOR__REDEFINITION_CONTEXT :
				return getRedefinitionContexts();
			case UMLPackage.BEHAVIOR__OWNING_TEMPLATE_PARAMETER :
				if (resolve)
					return getOwningTemplateParameter();
				return basicGetOwningTemplateParameter();
			case UMLPackage.BEHAVIOR__TEMPLATE_PARAMETER :
				if (resolve)
					return getTemplateParameter();
				return basicGetTemplateParameter();
			case UMLPackage.BEHAVIOR__PACKAGE :
				if (resolve)
					return getPackage();
				return basicGetPackage();
			case UMLPackage.BEHAVIOR__TEMPLATE_BINDING :
				return getTemplateBindings();
			case UMLPackage.BEHAVIOR__OWNED_TEMPLATE_SIGNATURE :
				if (resolve)
					return getOwnedTemplateSignature();
				return basicGetOwnedTemplateSignature();
			case UMLPackage.BEHAVIOR__FEATURE :
				return getFeatures();
			case UMLPackage.BEHAVIOR__ATTRIBUTE :
				return getAttributes();
			case UMLPackage.BEHAVIOR__COLLABORATION_USE :
				return getCollaborationUses();
			case UMLPackage.BEHAVIOR__GENERAL :
				return getGenerals();
			case UMLPackage.BEHAVIOR__GENERALIZATION :
				return getGeneralizations();
			case UMLPackage.BEHAVIOR__POWERTYPE_EXTENT :
				return getPowertypeExtents();
			case UMLPackage.BEHAVIOR__INHERITED_MEMBER :
				return getInheritedMembers();
			case UMLPackage.BEHAVIOR__IS_ABSTRACT :
				return isAbstract();
			case UMLPackage.BEHAVIOR__IS_FINAL_SPECIALIZATION :
				return isFinalSpecialization();
			case UMLPackage.BEHAVIOR__OWNED_USE_CASE :
				return getOwnedUseCases();
			case UMLPackage.BEHAVIOR__USE_CASE :
				return getUseCases();
			case UMLPackage.BEHAVIOR__REDEFINED_CLASSIFIER :
				return getRedefinedClassifiers();
			case UMLPackage.BEHAVIOR__REPRESENTATION :
				if (resolve)
					return getRepresentation();
				return basicGetRepresentation();
			case UMLPackage.BEHAVIOR__SUBSTITUTION :
				return getSubstitutions();
			case UMLPackage.BEHAVIOR__OWNED_ATTRIBUTE :
				return getOwnedAttributes();
			case UMLPackage.BEHAVIOR__OWNED_CONNECTOR :
				return getOwnedConnectors();
			case UMLPackage.BEHAVIOR__PART :
				return getParts();
			case UMLPackage.BEHAVIOR__ROLE :
				return getRoles();
			case UMLPackage.BEHAVIOR__OWNED_PORT :
				return getOwnedPorts();
			case UMLPackage.BEHAVIOR__CLASSIFIER_BEHAVIOR :
				if (resolve)
					return getClassifierBehavior();
				return basicGetClassifierBehavior();
			case UMLPackage.BEHAVIOR__INTERFACE_REALIZATION :
				return getInterfaceRealizations();
			case UMLPackage.BEHAVIOR__OWNED_BEHAVIOR :
				return getOwnedBehaviors();
			case UMLPackage.BEHAVIOR__OWNED_OPERATION :
				return getOwnedOperations();
			case UMLPackage.BEHAVIOR__EXTENSION :
				return getExtensions();
			case UMLPackage.BEHAVIOR__IS_ACTIVE :
				return isActive();
			case UMLPackage.BEHAVIOR__NESTED_CLASSIFIER :
				return getNestedClassifiers();
			case UMLPackage.BEHAVIOR__OWNED_RECEPTION :
				return getOwnedReceptions();
			case UMLPackage.BEHAVIOR__SUPER_CLASS :
				return getSuperClasses();
			case UMLPackage.BEHAVIOR__SPECIFICATION :
				if (resolve)
					return getSpecification();
				return basicGetSpecification();
			case UMLPackage.BEHAVIOR__CONTEXT :
				if (resolve)
					return getContext();
				return basicGetContext();
			case UMLPackage.BEHAVIOR__IS_REENTRANT :
				return isReentrant();
			case UMLPackage.BEHAVIOR__OWNED_PARAMETER :
				return getOwnedParameters();
			case UMLPackage.BEHAVIOR__OWNED_PARAMETER_SET :
				return getOwnedParameterSets();
			case UMLPackage.BEHAVIOR__POSTCONDITION :
				return getPostconditions();
			case UMLPackage.BEHAVIOR__PRECONDITION :
				return getPreconditions();
			case UMLPackage.BEHAVIOR__REDEFINED_BEHAVIOR :
				return getRedefinedBehaviors();
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
			case UMLPackage.BEHAVIOR__EANNOTATIONS :
				getEAnnotations().clear();
				getEAnnotations()
					.addAll((Collection<? extends EAnnotation>) newValue);
				return;
			case UMLPackage.BEHAVIOR__OWNED_COMMENT :
				getOwnedComments().clear();
				getOwnedComments()
					.addAll((Collection<? extends Comment>) newValue);
				return;
			case UMLPackage.BEHAVIOR__NAME :
				setName((String) newValue);
				return;
			case UMLPackage.BEHAVIOR__NAME_EXPRESSION :
				setNameExpression((StringExpression) newValue);
				return;
			case UMLPackage.BEHAVIOR__VISIBILITY :
				setVisibility((VisibilityKind) newValue);
				return;
			case UMLPackage.BEHAVIOR__OWNED_RULE :
				getOwnedRules().clear();
				getOwnedRules()
					.addAll((Collection<? extends Constraint>) newValue);
				return;
			case UMLPackage.BEHAVIOR__ELEMENT_IMPORT :
				getElementImports().clear();
				getElementImports()
					.addAll((Collection<? extends ElementImport>) newValue);
				return;
			case UMLPackage.BEHAVIOR__PACKAGE_IMPORT :
				getPackageImports().clear();
				getPackageImports()
					.addAll((Collection<? extends PackageImport>) newValue);
				return;
			case UMLPackage.BEHAVIOR__IS_LEAF :
				setIsLeaf((Boolean) newValue);
				return;
			case UMLPackage.BEHAVIOR__OWNING_TEMPLATE_PARAMETER :
				setOwningTemplateParameter((TemplateParameter) newValue);
				return;
			case UMLPackage.BEHAVIOR__TEMPLATE_PARAMETER :
				setTemplateParameter((TemplateParameter) newValue);
				return;
			case UMLPackage.BEHAVIOR__PACKAGE :
				setPackage((org.eclipse.uml2.uml.Package) newValue);
				return;
			case UMLPackage.BEHAVIOR__TEMPLATE_BINDING :
				getTemplateBindings().clear();
				getTemplateBindings()
					.addAll((Collection<? extends TemplateBinding>) newValue);
				return;
			case UMLPackage.BEHAVIOR__OWNED_TEMPLATE_SIGNATURE :
				setOwnedTemplateSignature((TemplateSignature) newValue);
				return;
			case UMLPackage.BEHAVIOR__COLLABORATION_USE :
				getCollaborationUses().clear();
				getCollaborationUses()
					.addAll((Collection<? extends CollaborationUse>) newValue);
				return;
			case UMLPackage.BEHAVIOR__GENERAL :
				getGenerals().clear();
				getGenerals()
					.addAll((Collection<? extends Classifier>) newValue);
				return;
			case UMLPackage.BEHAVIOR__GENERALIZATION :
				getGeneralizations().clear();
				getGeneralizations()
					.addAll((Collection<? extends Generalization>) newValue);
				return;
			case UMLPackage.BEHAVIOR__POWERTYPE_EXTENT :
				getPowertypeExtents().clear();
				getPowertypeExtents()
					.addAll((Collection<? extends GeneralizationSet>) newValue);
				return;
			case UMLPackage.BEHAVIOR__IS_ABSTRACT :
				setIsAbstract((Boolean) newValue);
				return;
			case UMLPackage.BEHAVIOR__IS_FINAL_SPECIALIZATION :
				setIsFinalSpecialization((Boolean) newValue);
				return;
			case UMLPackage.BEHAVIOR__OWNED_USE_CASE :
				getOwnedUseCases().clear();
				getOwnedUseCases()
					.addAll((Collection<? extends UseCase>) newValue);
				return;
			case UMLPackage.BEHAVIOR__USE_CASE :
				getUseCases().clear();
				getUseCases().addAll((Collection<? extends UseCase>) newValue);
				return;
			case UMLPackage.BEHAVIOR__REDEFINED_CLASSIFIER :
				getRedefinedClassifiers().clear();
				getRedefinedClassifiers()
					.addAll((Collection<? extends Classifier>) newValue);
				return;
			case UMLPackage.BEHAVIOR__REPRESENTATION :
				setRepresentation((CollaborationUse) newValue);
				return;
			case UMLPackage.BEHAVIOR__SUBSTITUTION :
				getSubstitutions().clear();
				getSubstitutions()
					.addAll((Collection<? extends Substitution>) newValue);
				return;
			case UMLPackage.BEHAVIOR__OWNED_ATTRIBUTE :
				getOwnedAttributes().clear();
				getOwnedAttributes()
					.addAll((Collection<? extends Property>) newValue);
				return;
			case UMLPackage.BEHAVIOR__OWNED_CONNECTOR :
				getOwnedConnectors().clear();
				getOwnedConnectors()
					.addAll((Collection<? extends Connector>) newValue);
				return;
			case UMLPackage.BEHAVIOR__CLASSIFIER_BEHAVIOR :
				setClassifierBehavior((Behavior) newValue);
				return;
			case UMLPackage.BEHAVIOR__INTERFACE_REALIZATION :
				getInterfaceRealizations().clear();
				getInterfaceRealizations().addAll(
					(Collection<? extends InterfaceRealization>) newValue);
				return;
			case UMLPackage.BEHAVIOR__OWNED_BEHAVIOR :
				getOwnedBehaviors().clear();
				getOwnedBehaviors()
					.addAll((Collection<? extends Behavior>) newValue);
				return;
			case UMLPackage.BEHAVIOR__OWNED_OPERATION :
				getOwnedOperations().clear();
				getOwnedOperations()
					.addAll((Collection<? extends Operation>) newValue);
				return;
			case UMLPackage.BEHAVIOR__IS_ACTIVE :
				setIsActive((Boolean) newValue);
				return;
			case UMLPackage.BEHAVIOR__NESTED_CLASSIFIER :
				getNestedClassifiers().clear();
				getNestedClassifiers()
					.addAll((Collection<? extends Classifier>) newValue);
				return;
			case UMLPackage.BEHAVIOR__OWNED_RECEPTION :
				getOwnedReceptions().clear();
				getOwnedReceptions()
					.addAll((Collection<? extends Reception>) newValue);
				return;
			case UMLPackage.BEHAVIOR__SUPER_CLASS :
				getSuperClasses().clear();
				getSuperClasses().addAll(
					(Collection<? extends org.eclipse.uml2.uml.Class>) newValue);
				return;
			case UMLPackage.BEHAVIOR__SPECIFICATION :
				setSpecification((BehavioralFeature) newValue);
				return;
			case UMLPackage.BEHAVIOR__IS_REENTRANT :
				setIsReentrant((Boolean) newValue);
				return;
			case UMLPackage.BEHAVIOR__OWNED_PARAMETER :
				getOwnedParameters().clear();
				getOwnedParameters()
					.addAll((Collection<? extends Parameter>) newValue);
				return;
			case UMLPackage.BEHAVIOR__OWNED_PARAMETER_SET :
				getOwnedParameterSets().clear();
				getOwnedParameterSets()
					.addAll((Collection<? extends ParameterSet>) newValue);
				return;
			case UMLPackage.BEHAVIOR__POSTCONDITION :
				getPostconditions().clear();
				getPostconditions()
					.addAll((Collection<? extends Constraint>) newValue);
				return;
			case UMLPackage.BEHAVIOR__PRECONDITION :
				getPreconditions().clear();
				getPreconditions()
					.addAll((Collection<? extends Constraint>) newValue);
				return;
			case UMLPackage.BEHAVIOR__REDEFINED_BEHAVIOR :
				getRedefinedBehaviors().clear();
				getRedefinedBehaviors()
					.addAll((Collection<? extends Behavior>) newValue);
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
			case UMLPackage.BEHAVIOR__EANNOTATIONS :
				getEAnnotations().clear();
				return;
			case UMLPackage.BEHAVIOR__OWNED_COMMENT :
				getOwnedComments().clear();
				return;
			case UMLPackage.BEHAVIOR__NAME :
				unsetName();
				return;
			case UMLPackage.BEHAVIOR__NAME_EXPRESSION :
				setNameExpression((StringExpression) null);
				return;
			case UMLPackage.BEHAVIOR__VISIBILITY :
				unsetVisibility();
				return;
			case UMLPackage.BEHAVIOR__OWNED_RULE :
				getOwnedRules().clear();
				return;
			case UMLPackage.BEHAVIOR__ELEMENT_IMPORT :
				getElementImports().clear();
				return;
			case UMLPackage.BEHAVIOR__PACKAGE_IMPORT :
				getPackageImports().clear();
				return;
			case UMLPackage.BEHAVIOR__IS_LEAF :
				setIsLeaf(IS_LEAF_EDEFAULT);
				return;
			case UMLPackage.BEHAVIOR__OWNING_TEMPLATE_PARAMETER :
				setOwningTemplateParameter((TemplateParameter) null);
				return;
			case UMLPackage.BEHAVIOR__TEMPLATE_PARAMETER :
				setTemplateParameter((TemplateParameter) null);
				return;
			case UMLPackage.BEHAVIOR__PACKAGE :
				setPackage((org.eclipse.uml2.uml.Package) null);
				return;
			case UMLPackage.BEHAVIOR__TEMPLATE_BINDING :
				getTemplateBindings().clear();
				return;
			case UMLPackage.BEHAVIOR__OWNED_TEMPLATE_SIGNATURE :
				setOwnedTemplateSignature((TemplateSignature) null);
				return;
			case UMLPackage.BEHAVIOR__COLLABORATION_USE :
				getCollaborationUses().clear();
				return;
			case UMLPackage.BEHAVIOR__GENERAL :
				getGenerals().clear();
				return;
			case UMLPackage.BEHAVIOR__GENERALIZATION :
				getGeneralizations().clear();
				return;
			case UMLPackage.BEHAVIOR__POWERTYPE_EXTENT :
				getPowertypeExtents().clear();
				return;
			case UMLPackage.BEHAVIOR__IS_ABSTRACT :
				setIsAbstract(IS_ABSTRACT_EDEFAULT);
				return;
			case UMLPackage.BEHAVIOR__IS_FINAL_SPECIALIZATION :
				setIsFinalSpecialization(IS_FINAL_SPECIALIZATION_EDEFAULT);
				return;
			case UMLPackage.BEHAVIOR__OWNED_USE_CASE :
				getOwnedUseCases().clear();
				return;
			case UMLPackage.BEHAVIOR__USE_CASE :
				getUseCases().clear();
				return;
			case UMLPackage.BEHAVIOR__REDEFINED_CLASSIFIER :
				getRedefinedClassifiers().clear();
				return;
			case UMLPackage.BEHAVIOR__REPRESENTATION :
				setRepresentation((CollaborationUse) null);
				return;
			case UMLPackage.BEHAVIOR__SUBSTITUTION :
				getSubstitutions().clear();
				return;
			case UMLPackage.BEHAVIOR__OWNED_ATTRIBUTE :
				getOwnedAttributes().clear();
				return;
			case UMLPackage.BEHAVIOR__OWNED_CONNECTOR :
				getOwnedConnectors().clear();
				return;
			case UMLPackage.BEHAVIOR__CLASSIFIER_BEHAVIOR :
				setClassifierBehavior((Behavior) null);
				return;
			case UMLPackage.BEHAVIOR__INTERFACE_REALIZATION :
				getInterfaceRealizations().clear();
				return;
			case UMLPackage.BEHAVIOR__OWNED_BEHAVIOR :
				getOwnedBehaviors().clear();
				return;
			case UMLPackage.BEHAVIOR__OWNED_OPERATION :
				getOwnedOperations().clear();
				return;
			case UMLPackage.BEHAVIOR__IS_ACTIVE :
				setIsActive(IS_ACTIVE_EDEFAULT);
				return;
			case UMLPackage.BEHAVIOR__NESTED_CLASSIFIER :
				getNestedClassifiers().clear();
				return;
			case UMLPackage.BEHAVIOR__OWNED_RECEPTION :
				getOwnedReceptions().clear();
				return;
			case UMLPackage.BEHAVIOR__SUPER_CLASS :
				getSuperClasses().clear();
				return;
			case UMLPackage.BEHAVIOR__SPECIFICATION :
				setSpecification((BehavioralFeature) null);
				return;
			case UMLPackage.BEHAVIOR__IS_REENTRANT :
				unsetIsReentrant();
				return;
			case UMLPackage.BEHAVIOR__OWNED_PARAMETER :
				getOwnedParameters().clear();
				return;
			case UMLPackage.BEHAVIOR__OWNED_PARAMETER_SET :
				getOwnedParameterSets().clear();
				return;
			case UMLPackage.BEHAVIOR__POSTCONDITION :
				getPostconditions().clear();
				return;
			case UMLPackage.BEHAVIOR__PRECONDITION :
				getPreconditions().clear();
				return;
			case UMLPackage.BEHAVIOR__REDEFINED_BEHAVIOR :
				getRedefinedBehaviors().clear();
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
			case UMLPackage.BEHAVIOR__EANNOTATIONS :
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UMLPackage.BEHAVIOR__OWNED_COMMENT :
				return ownedComments != null && !ownedComments.isEmpty();
			case UMLPackage.BEHAVIOR__OWNED_ELEMENT :
				return isSetOwnedElements();
			case UMLPackage.BEHAVIOR__OWNER :
				return isSetOwner();
			case UMLPackage.BEHAVIOR__CLIENT_DEPENDENCY :
				return !getClientDependencies().isEmpty();
			case UMLPackage.BEHAVIOR__NAME :
				return isSetName();
			case UMLPackage.BEHAVIOR__NAME_EXPRESSION :
				return nameExpression != null;
			case UMLPackage.BEHAVIOR__NAMESPACE :
				return isSetNamespace();
			case UMLPackage.BEHAVIOR__QUALIFIED_NAME :
				return QUALIFIED_NAME_EDEFAULT == null
					? getQualifiedName() != null
					: !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case UMLPackage.BEHAVIOR__VISIBILITY :
				return isSetVisibility();
			case UMLPackage.BEHAVIOR__OWNED_RULE :
				return ownedRules != null && !ownedRules.isEmpty();
			case UMLPackage.BEHAVIOR__ELEMENT_IMPORT :
				return elementImports != null && !elementImports.isEmpty();
			case UMLPackage.BEHAVIOR__PACKAGE_IMPORT :
				return packageImports != null && !packageImports.isEmpty();
			case UMLPackage.BEHAVIOR__OWNED_MEMBER :
				return isSetOwnedMembers();
			case UMLPackage.BEHAVIOR__IMPORTED_MEMBER :
				return !getImportedMembers().isEmpty();
			case UMLPackage.BEHAVIOR__MEMBER :
				return isSetMembers();
			case UMLPackage.BEHAVIOR__IS_LEAF :
				return ((eFlags & IS_LEAF_EFLAG) != 0) != IS_LEAF_EDEFAULT;
			case UMLPackage.BEHAVIOR__REDEFINED_ELEMENT :
				return isSetRedefinedElements();
			case UMLPackage.BEHAVIOR__REDEFINITION_CONTEXT :
				return isSetRedefinitionContexts();
			case UMLPackage.BEHAVIOR__OWNING_TEMPLATE_PARAMETER :
				return basicGetOwningTemplateParameter() != null;
			case UMLPackage.BEHAVIOR__TEMPLATE_PARAMETER :
				return isSetTemplateParameter();
			case UMLPackage.BEHAVIOR__PACKAGE :
				return basicGetPackage() != null;
			case UMLPackage.BEHAVIOR__TEMPLATE_BINDING :
				return templateBindings != null && !templateBindings.isEmpty();
			case UMLPackage.BEHAVIOR__OWNED_TEMPLATE_SIGNATURE :
				return isSetOwnedTemplateSignature();
			case UMLPackage.BEHAVIOR__FEATURE :
				return isSetFeatures();
			case UMLPackage.BEHAVIOR__ATTRIBUTE :
				return isSetAttributes();
			case UMLPackage.BEHAVIOR__COLLABORATION_USE :
				return collaborationUses != null
					&& !collaborationUses.isEmpty();
			case UMLPackage.BEHAVIOR__GENERAL :
				return isSetGenerals();
			case UMLPackage.BEHAVIOR__GENERALIZATION :
				return generalizations != null && !generalizations.isEmpty();
			case UMLPackage.BEHAVIOR__POWERTYPE_EXTENT :
				return powertypeExtents != null && !powertypeExtents.isEmpty();
			case UMLPackage.BEHAVIOR__INHERITED_MEMBER :
				return !getInheritedMembers().isEmpty();
			case UMLPackage.BEHAVIOR__IS_ABSTRACT :
				return isSetIsAbstract();
			case UMLPackage.BEHAVIOR__IS_FINAL_SPECIALIZATION :
				return ((eFlags
					& IS_FINAL_SPECIALIZATION_EFLAG) != 0) != IS_FINAL_SPECIALIZATION_EDEFAULT;
			case UMLPackage.BEHAVIOR__OWNED_USE_CASE :
				return ownedUseCases != null && !ownedUseCases.isEmpty();
			case UMLPackage.BEHAVIOR__USE_CASE :
				return useCases != null && !useCases.isEmpty();
			case UMLPackage.BEHAVIOR__REDEFINED_CLASSIFIER :
				return redefinedClassifiers != null
					&& !redefinedClassifiers.isEmpty();
			case UMLPackage.BEHAVIOR__REPRESENTATION :
				return representation != null;
			case UMLPackage.BEHAVIOR__SUBSTITUTION :
				return substitutions != null && !substitutions.isEmpty();
			case UMLPackage.BEHAVIOR__OWNED_ATTRIBUTE :
				return isSetOwnedAttributes();
			case UMLPackage.BEHAVIOR__OWNED_CONNECTOR :
				return ownedConnectors != null && !ownedConnectors.isEmpty();
			case UMLPackage.BEHAVIOR__PART :
				return !getParts().isEmpty();
			case UMLPackage.BEHAVIOR__ROLE :
				return isSetRoles();
			case UMLPackage.BEHAVIOR__OWNED_PORT :
				return !getOwnedPorts().isEmpty();
			case UMLPackage.BEHAVIOR__CLASSIFIER_BEHAVIOR :
				return classifierBehavior != null;
			case UMLPackage.BEHAVIOR__INTERFACE_REALIZATION :
				return interfaceRealizations != null
					&& !interfaceRealizations.isEmpty();
			case UMLPackage.BEHAVIOR__OWNED_BEHAVIOR :
				return ownedBehaviors != null && !ownedBehaviors.isEmpty();
			case UMLPackage.BEHAVIOR__OWNED_OPERATION :
				return ownedOperations != null && !ownedOperations.isEmpty();
			case UMLPackage.BEHAVIOR__EXTENSION :
				return !getExtensions().isEmpty();
			case UMLPackage.BEHAVIOR__IS_ACTIVE :
				return ((eFlags & IS_ACTIVE_EFLAG) != 0) != IS_ACTIVE_EDEFAULT;
			case UMLPackage.BEHAVIOR__NESTED_CLASSIFIER :
				return nestedClassifiers != null
					&& !nestedClassifiers.isEmpty();
			case UMLPackage.BEHAVIOR__OWNED_RECEPTION :
				return ownedReceptions != null && !ownedReceptions.isEmpty();
			case UMLPackage.BEHAVIOR__SUPER_CLASS :
				return isSetSuperClasses();
			case UMLPackage.BEHAVIOR__SPECIFICATION :
				return specification != null;
			case UMLPackage.BEHAVIOR__CONTEXT :
				return basicGetContext() != null;
			case UMLPackage.BEHAVIOR__IS_REENTRANT :
				return isSetIsReentrant();
			case UMLPackage.BEHAVIOR__OWNED_PARAMETER :
				return ownedParameters != null && !ownedParameters.isEmpty();
			case UMLPackage.BEHAVIOR__OWNED_PARAMETER_SET :
				return ownedParameterSets != null
					&& !ownedParameterSets.isEmpty();
			case UMLPackage.BEHAVIOR__POSTCONDITION :
				return postconditions != null && !postconditions.isEmpty();
			case UMLPackage.BEHAVIOR__PRECONDITION :
				return preconditions != null && !preconditions.isEmpty();
			case UMLPackage.BEHAVIOR__REDEFINED_BEHAVIOR :
				return redefinedBehaviors != null
					&& !redefinedBehaviors.isEmpty();
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
			case UMLPackage.BEHAVIOR___GET_EANNOTATION__STRING :
				return getEAnnotation((String) arguments.get(0));
			case UMLPackage.BEHAVIOR___VALIDATE_HAS_OWNER__DIAGNOSTICCHAIN_MAP :
				return validateHasOwner((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.BEHAVIOR___VALIDATE_NOT_OWN_SELF__DIAGNOSTICCHAIN_MAP :
				return validateNotOwnSelf((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.BEHAVIOR___ADD_KEYWORD__STRING :
				return addKeyword((String) arguments.get(0));
			case UMLPackage.BEHAVIOR___APPLY_STEREOTYPE__STEREOTYPE :
				return applyStereotype((Stereotype) arguments.get(0));
			case UMLPackage.BEHAVIOR___CREATE_EANNOTATION__STRING :
				return createEAnnotation((String) arguments.get(0));
			case UMLPackage.BEHAVIOR___DESTROY :
				destroy();
				return null;
			case UMLPackage.BEHAVIOR___GET_KEYWORDS :
				return getKeywords();
			case UMLPackage.BEHAVIOR___GET_APPLICABLE_STEREOTYPE__STRING :
				return getApplicableStereotype((String) arguments.get(0));
			case UMLPackage.BEHAVIOR___GET_APPLICABLE_STEREOTYPES :
				return getApplicableStereotypes();
			case UMLPackage.BEHAVIOR___GET_APPLIED_STEREOTYPE__STRING :
				return getAppliedStereotype((String) arguments.get(0));
			case UMLPackage.BEHAVIOR___GET_APPLIED_STEREOTYPES :
				return getAppliedStereotypes();
			case UMLPackage.BEHAVIOR___GET_APPLIED_SUBSTEREOTYPE__STEREOTYPE_STRING :
				return getAppliedSubstereotype((Stereotype) arguments.get(0),
					(String) arguments.get(1));
			case UMLPackage.BEHAVIOR___GET_APPLIED_SUBSTEREOTYPES__STEREOTYPE :
				return getAppliedSubstereotypes((Stereotype) arguments.get(0));
			case UMLPackage.BEHAVIOR___GET_MODEL :
				return getModel();
			case UMLPackage.BEHAVIOR___GET_NEAREST_PACKAGE :
				return getNearestPackage();
			case UMLPackage.BEHAVIOR___GET_RELATIONSHIPS :
				return getRelationships();
			case UMLPackage.BEHAVIOR___GET_RELATIONSHIPS__ECLASS :
				return getRelationships((EClass) arguments.get(0));
			case UMLPackage.BEHAVIOR___GET_REQUIRED_STEREOTYPE__STRING :
				return getRequiredStereotype((String) arguments.get(0));
			case UMLPackage.BEHAVIOR___GET_REQUIRED_STEREOTYPES :
				return getRequiredStereotypes();
			case UMLPackage.BEHAVIOR___GET_SOURCE_DIRECTED_RELATIONSHIPS :
				return getSourceDirectedRelationships();
			case UMLPackage.BEHAVIOR___GET_SOURCE_DIRECTED_RELATIONSHIPS__ECLASS :
				return getSourceDirectedRelationships(
					(EClass) arguments.get(0));
			case UMLPackage.BEHAVIOR___GET_STEREOTYPE_APPLICATION__STEREOTYPE :
				return getStereotypeApplication((Stereotype) arguments.get(0));
			case UMLPackage.BEHAVIOR___GET_STEREOTYPE_APPLICATIONS :
				return getStereotypeApplications();
			case UMLPackage.BEHAVIOR___GET_TARGET_DIRECTED_RELATIONSHIPS :
				return getTargetDirectedRelationships();
			case UMLPackage.BEHAVIOR___GET_TARGET_DIRECTED_RELATIONSHIPS__ECLASS :
				return getTargetDirectedRelationships(
					(EClass) arguments.get(0));
			case UMLPackage.BEHAVIOR___GET_VALUE__STEREOTYPE_STRING :
				return getValue((Stereotype) arguments.get(0),
					(String) arguments.get(1));
			case UMLPackage.BEHAVIOR___HAS_KEYWORD__STRING :
				return hasKeyword((String) arguments.get(0));
			case UMLPackage.BEHAVIOR___HAS_VALUE__STEREOTYPE_STRING :
				return hasValue((Stereotype) arguments.get(0),
					(String) arguments.get(1));
			case UMLPackage.BEHAVIOR___IS_STEREOTYPE_APPLICABLE__STEREOTYPE :
				return isStereotypeApplicable((Stereotype) arguments.get(0));
			case UMLPackage.BEHAVIOR___IS_STEREOTYPE_APPLIED__STEREOTYPE :
				return isStereotypeApplied((Stereotype) arguments.get(0));
			case UMLPackage.BEHAVIOR___IS_STEREOTYPE_REQUIRED__STEREOTYPE :
				return isStereotypeRequired((Stereotype) arguments.get(0));
			case UMLPackage.BEHAVIOR___REMOVE_KEYWORD__STRING :
				return removeKeyword((String) arguments.get(0));
			case UMLPackage.BEHAVIOR___SET_VALUE__STEREOTYPE_STRING_OBJECT :
				setValue((Stereotype) arguments.get(0),
					(String) arguments.get(1), arguments.get(2));
				return null;
			case UMLPackage.BEHAVIOR___UNAPPLY_STEREOTYPE__STEREOTYPE :
				return unapplyStereotype((Stereotype) arguments.get(0));
			case UMLPackage.BEHAVIOR___ALL_OWNED_ELEMENTS :
				return allOwnedElements();
			case UMLPackage.BEHAVIOR___MUST_BE_OWNED :
				return mustBeOwned();
			case UMLPackage.BEHAVIOR___VALIDATE_VISIBILITY_NEEDS_OWNERSHIP__DIAGNOSTICCHAIN_MAP :
				return validateVisibilityNeedsOwnership(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.BEHAVIOR___VALIDATE_HAS_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP :
				return validateHasQualifiedName(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.BEHAVIOR___VALIDATE_HAS_NO_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP :
				return validateHasNoQualifiedName(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.BEHAVIOR___CREATE_DEPENDENCY__NAMEDELEMENT :
				return createDependency((NamedElement) arguments.get(0));
			case UMLPackage.BEHAVIOR___CREATE_USAGE__NAMEDELEMENT :
				return createUsage((NamedElement) arguments.get(0));
			case UMLPackage.BEHAVIOR___GET_LABEL :
				return getLabel();
			case UMLPackage.BEHAVIOR___GET_LABEL__BOOLEAN :
				return getLabel((Boolean) arguments.get(0));
			case UMLPackage.BEHAVIOR___GET_NAMESPACE :
				return getNamespace();
			case UMLPackage.BEHAVIOR___ALL_NAMESPACES :
				return allNamespaces();
			case UMLPackage.BEHAVIOR___ALL_OWNING_PACKAGES :
				return allOwningPackages();
			case UMLPackage.BEHAVIOR___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE :
				return isDistinguishableFrom((NamedElement) arguments.get(0),
					(Namespace) arguments.get(1));
			case UMLPackage.BEHAVIOR___GET_QUALIFIED_NAME :
				return getQualifiedName();
			case UMLPackage.BEHAVIOR___SEPARATOR :
				return separator();
			case UMLPackage.BEHAVIOR___GET_CLIENT_DEPENDENCIES :
				return getClientDependencies();
			case UMLPackage.BEHAVIOR___VALIDATE_MEMBERS_DISTINGUISHABLE__DIAGNOSTICCHAIN_MAP :
				return validateMembersDistinguishable(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.BEHAVIOR___VALIDATE_CANNOT_IMPORT_SELF__DIAGNOSTICCHAIN_MAP :
				return validateCannotImportSelf(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.BEHAVIOR___VALIDATE_CANNOT_IMPORT_OWNED_MEMBERS__DIAGNOSTICCHAIN_MAP :
				return validateCannotImportOwnedMembers(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.BEHAVIOR___CREATE_ELEMENT_IMPORT__PACKAGEABLEELEMENT_VISIBILITYKIND :
				return createElementImport(
					(PackageableElement) arguments.get(0),
					(VisibilityKind) arguments.get(1));
			case UMLPackage.BEHAVIOR___CREATE_PACKAGE_IMPORT__PACKAGE_VISIBILITYKIND :
				return createPackageImport(
					(org.eclipse.uml2.uml.Package) arguments.get(0),
					(VisibilityKind) arguments.get(1));
			case UMLPackage.BEHAVIOR___GET_IMPORTED_ELEMENTS :
				return getImportedElements();
			case UMLPackage.BEHAVIOR___GET_IMPORTED_PACKAGES :
				return getImportedPackages();
			case UMLPackage.BEHAVIOR___GET_OWNED_MEMBERS :
				return getOwnedMembers();
			case UMLPackage.BEHAVIOR___EXCLUDE_COLLISIONS__ELIST :
				return excludeCollisions(
					(EList<PackageableElement>) arguments.get(0));
			case UMLPackage.BEHAVIOR___GET_NAMES_OF_MEMBER__NAMEDELEMENT :
				return getNamesOfMember((NamedElement) arguments.get(0));
			case UMLPackage.BEHAVIOR___IMPORT_MEMBERS__ELIST :
				return importMembers(
					(EList<PackageableElement>) arguments.get(0));
			case UMLPackage.BEHAVIOR___GET_IMPORTED_MEMBERS :
				return getImportedMembers();
			case UMLPackage.BEHAVIOR___MEMBERS_ARE_DISTINGUISHABLE :
				return membersAreDistinguishable();
			case UMLPackage.BEHAVIOR___VALIDATE_REDEFINITION_CONSISTENT__DIAGNOSTICCHAIN_MAP :
				return validateRedefinitionConsistent(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.BEHAVIOR___VALIDATE_NON_LEAF_REDEFINITION__DIAGNOSTICCHAIN_MAP :
				return validateNonLeafRedefinition(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.BEHAVIOR___VALIDATE_REDEFINITION_CONTEXT_VALID__DIAGNOSTICCHAIN_MAP :
				return validateRedefinitionContextValid(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.BEHAVIOR___IS_CONSISTENT_WITH__REDEFINABLEELEMENT :
				return isConsistentWith((RedefinableElement) arguments.get(0));
			case UMLPackage.BEHAVIOR___IS_REDEFINITION_CONTEXT_VALID__REDEFINABLEELEMENT :
				return isRedefinitionContextValid(
					(RedefinableElement) arguments.get(0));
			case UMLPackage.BEHAVIOR___IS_COMPATIBLE_WITH__PARAMETERABLEELEMENT :
				return isCompatibleWith(
					(ParameterableElement) arguments.get(0));
			case UMLPackage.BEHAVIOR___IS_TEMPLATE_PARAMETER :
				return isTemplateParameter();
			case UMLPackage.BEHAVIOR___VALIDATE_NAMESPACE_NEEDS_VISIBILITY__DIAGNOSTICCHAIN_MAP :
				return validateNamespaceNeedsVisibility(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.BEHAVIOR___CREATE_ASSOCIATION__BOOLEAN_AGGREGATIONKIND_STRING_INT_INT_TYPE_BOOLEAN_AGGREGATIONKIND_STRING_INT_INT :
				return createAssociation((Boolean) arguments.get(0),
					(AggregationKind) arguments.get(1),
					(String) arguments.get(2), (Integer) arguments.get(3),
					(Integer) arguments.get(4), (Type) arguments.get(5),
					(Boolean) arguments.get(6),
					(AggregationKind) arguments.get(7),
					(String) arguments.get(8), (Integer) arguments.get(9),
					(Integer) arguments.get(10));
			case UMLPackage.BEHAVIOR___GET_ASSOCIATIONS :
				return getAssociations();
			case UMLPackage.BEHAVIOR___CONFORMS_TO__TYPE :
				return conformsTo((Type) arguments.get(0));
			case UMLPackage.BEHAVIOR___IS_TEMPLATE :
				return isTemplate();
			case UMLPackage.BEHAVIOR___PARAMETERABLE_ELEMENTS :
				return parameterableElements();
			case UMLPackage.BEHAVIOR___VALIDATE_SPECIALIZE_TYPE__DIAGNOSTICCHAIN_MAP :
				return validateSpecializeType(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.BEHAVIOR___VALIDATE_MAPS_TO_GENERALIZATION_SET__DIAGNOSTICCHAIN_MAP :
				return validateMapsToGeneralizationSet(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.BEHAVIOR___VALIDATE_NON_FINAL_PARENTS__DIAGNOSTICCHAIN_MAP :
				return validateNonFinalParents(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.BEHAVIOR___VALIDATE_NO_CYCLES_IN_GENERALIZATION__DIAGNOSTICCHAIN_MAP :
				return validateNoCyclesInGeneralization(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.BEHAVIOR___GET_ALL_ATTRIBUTES :
				return getAllAttributes();
			case UMLPackage.BEHAVIOR___GET_ALL_OPERATIONS :
				return getAllOperations();
			case UMLPackage.BEHAVIOR___GET_ALL_USED_INTERFACES :
				return getAllUsedInterfaces();
			case UMLPackage.BEHAVIOR___GET_OPERATION__STRING_ELIST_ELIST :
				return getOperation((String) arguments.get(0),
					(EList<String>) arguments.get(1),
					(EList<Type>) arguments.get(2));
			case UMLPackage.BEHAVIOR___GET_OPERATION__STRING_ELIST_ELIST_BOOLEAN :
				return getOperation((String) arguments.get(0),
					(EList<String>) arguments.get(1),
					(EList<Type>) arguments.get(2), (Boolean) arguments.get(3));
			case UMLPackage.BEHAVIOR___GET_OPERATIONS :
				return getOperations();
			case UMLPackage.BEHAVIOR___GET_USED_INTERFACES :
				return getUsedInterfaces();
			case UMLPackage.BEHAVIOR___ALL_FEATURES :
				return allFeatures();
			case UMLPackage.BEHAVIOR___ALL_PARENTS :
				return allParents();
			case UMLPackage.BEHAVIOR___GET_GENERALS :
				return getGenerals();
			case UMLPackage.BEHAVIOR___HAS_VISIBILITY_OF__NAMEDELEMENT :
				return hasVisibilityOf((NamedElement) arguments.get(0));
			case UMLPackage.BEHAVIOR___INHERIT__ELIST :
				return inherit((EList<NamedElement>) arguments.get(0));
			case UMLPackage.BEHAVIOR___INHERITABLE_MEMBERS__CLASSIFIER :
				return inheritableMembers((Classifier) arguments.get(0));
			case UMLPackage.BEHAVIOR___GET_INHERITED_MEMBERS :
				return getInheritedMembers();
			case UMLPackage.BEHAVIOR___MAY_SPECIALIZE_TYPE__CLASSIFIER :
				return maySpecializeType((Classifier) arguments.get(0));
			case UMLPackage.BEHAVIOR___PARENTS :
				return parents();
			case UMLPackage.BEHAVIOR___DIRECTLY_REALIZED_INTERFACES :
				return directlyRealizedInterfaces();
			case UMLPackage.BEHAVIOR___DIRECTLY_USED_INTERFACES :
				return directlyUsedInterfaces();
			case UMLPackage.BEHAVIOR___ALL_REALIZED_INTERFACES :
				return allRealizedInterfaces();
			case UMLPackage.BEHAVIOR___ALL_USED_INTERFACES :
				return allUsedInterfaces();
			case UMLPackage.BEHAVIOR___IS_SUBSTITUTABLE_FOR__CLASSIFIER :
				return isSubstitutableFor((Classifier) arguments.get(0));
			case UMLPackage.BEHAVIOR___ALL_ATTRIBUTES :
				return allAttributes();
			case UMLPackage.BEHAVIOR___ALL_SLOTTABLE_FEATURES :
				return allSlottableFeatures();
			case UMLPackage.BEHAVIOR___CREATE_OWNED_ATTRIBUTE__STRING_TYPE_INT_INT :
				return createOwnedAttribute((String) arguments.get(0),
					(Type) arguments.get(1), (Integer) arguments.get(2),
					(Integer) arguments.get(3));
			case UMLPackage.BEHAVIOR___GET_PARTS :
				return getParts();
			case UMLPackage.BEHAVIOR___ALL_ROLES :
				return allRoles();
			case UMLPackage.BEHAVIOR___GET_OWNED_PORTS :
				return getOwnedPorts();
			case UMLPackage.BEHAVIOR___VALIDATE_CLASS_BEHAVIOR__DIAGNOSTICCHAIN_MAP :
				return validateClassBehavior((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.BEHAVIOR___GET_ALL_IMPLEMENTED_INTERFACES :
				return getAllImplementedInterfaces();
			case UMLPackage.BEHAVIOR___GET_IMPLEMENTED_INTERFACES :
				return getImplementedInterfaces();
			case UMLPackage.BEHAVIOR___VALIDATE_PASSIVE_CLASS__DIAGNOSTICCHAIN_MAP :
				return validatePassiveClass((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.BEHAVIOR___CREATE_OWNED_OPERATION__STRING_ELIST_ELIST_TYPE :
				return createOwnedOperation((String) arguments.get(0),
					(EList<String>) arguments.get(1),
					(EList<Type>) arguments.get(2), (Type) arguments.get(3));
			case UMLPackage.BEHAVIOR___IS_METACLASS :
				return isMetaclass();
			case UMLPackage.BEHAVIOR___GET_EXTENSIONS :
				return getExtensions();
			case UMLPackage.BEHAVIOR___GET_SUPER_CLASSES :
				return getSuperClasses();
			case UMLPackage.BEHAVIOR___VALIDATE_MOST_ONE_BEHAVIOR__DIAGNOSTICCHAIN_MAP :
				return validateMostOneBehavior(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.BEHAVIOR___VALIDATE_PARAMETERS_MATCH__DIAGNOSTICCHAIN_MAP :
				return validateParametersMatch(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.BEHAVIOR___VALIDATE_FEATURE_OF_CONTEXT_CLASSIFIER__DIAGNOSTICCHAIN_MAP :
				return validateFeatureOfContextClassifier(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.BEHAVIOR___GET_CONTEXT :
				return getContext();
			case UMLPackage.BEHAVIOR___BEHAVIORED_CLASSIFIER__ELEMENT :
				return behavioredClassifier((Element) arguments.get(0));
			case UMLPackage.BEHAVIOR___INPUT_PARAMETERS :
				return inputParameters();
			case UMLPackage.BEHAVIOR___OUTPUT_PARAMETERS :
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
		result.append(" (isReentrant: "); //$NON-NLS-1$
		if ((eFlags & IS_REENTRANT_ESETFLAG) != 0)
			result.append((eFlags & IS_REENTRANT_EFLAG) != 0);
		else
			result.append("<unset>"); //$NON-NLS-1$
		result.append(')');
		return result.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetOwnedMembers() {
		return super.isSetOwnedMembers()
			|| eIsSet(UMLPackage.BEHAVIOR__OWNED_PARAMETER)
			|| eIsSet(UMLPackage.BEHAVIOR__OWNED_PARAMETER_SET);
	}

	/**
	 * The array of subset feature identifiers for the '{@link #getRedefinitionContexts() <em>Redefinition Context</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRedefinitionContexts()
	 * @generated
	 * @ordered
	 */
	protected static final int[] REDEFINITION_CONTEXT_ESUBSETS = new int[]{
		UMLPackage.BEHAVIOR__CONTEXT};

	/**
	 * The array of subset feature identifiers for the '{@link #getOwnedMembers() <em>Owned Member</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedMembers()
	 * @generated
	 * @ordered
	 */
	protected static final int[] OWNED_MEMBER_ESUBSETS = new int[]{
		UMLPackage.BEHAVIOR__OWNED_RULE, UMLPackage.BEHAVIOR__OWNED_USE_CASE,
		UMLPackage.BEHAVIOR__OWNED_ATTRIBUTE,
		UMLPackage.BEHAVIOR__OWNED_CONNECTOR,
		UMLPackage.BEHAVIOR__OWNED_BEHAVIOR,
		UMLPackage.BEHAVIOR__OWNED_OPERATION,
		UMLPackage.BEHAVIOR__NESTED_CLASSIFIER,
		UMLPackage.BEHAVIOR__OWNED_RECEPTION,
		UMLPackage.BEHAVIOR__OWNED_PARAMETER,
		UMLPackage.BEHAVIOR__OWNED_PARAMETER_SET};

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	@Override
	public EList<Constraint> getOwnedRules() {
		if (ownedRules == null) {
			ownedRules = new SubsetSupersetEObjectContainmentWithInverseEList.Resolving<Constraint>(
				Constraint.class, this, UMLPackage.BEHAVIOR__OWNED_RULE, null,
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
		UMLPackage.BEHAVIOR__POSTCONDITION, UMLPackage.BEHAVIOR__PRECONDITION};

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Classifier> getRedefinedClassifiers() {
		if (redefinedClassifiers == null) {
			redefinedClassifiers = new SubsetSupersetEObjectResolvingEList<Classifier>(
				Classifier.class, this,
				UMLPackage.BEHAVIOR__REDEFINED_CLASSIFIER, null,
				REDEFINED_CLASSIFIER_ESUBSETS);
		}
		return redefinedClassifiers;
	}

	/**
	 * The array of subset feature identifiers for the '{@link #getRedefinedClassifiers() <em>Redefined Classifier</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRedefinedClassifiers()
	 * @generated
	 * @ordered
	 */
	protected static final int[] REDEFINED_CLASSIFIER_ESUBSETS = new int[]{
		UMLPackage.BEHAVIOR__REDEFINED_BEHAVIOR};

	/**
	 * The array of superset feature identifiers for the '{@link #getPostconditions() <em>Postcondition</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPostconditions()
	 * @generated
	 * @ordered
	 */
	protected static final int[] POSTCONDITION_ESUPERSETS = new int[]{
		UMLPackage.BEHAVIOR__OWNED_RULE};

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Constraint createPostcondition(String name, EClass eClass) {
		Constraint newPostcondition = (Constraint) create(eClass);
		getPostconditions().add(newPostcondition);
		if (name != null)
			newPostcondition.setName(name);
		return newPostcondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Constraint createPostcondition(String name) {
		return createPostcondition(name, UMLPackage.Literals.CONSTRAINT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Constraint getPostcondition(String name) {
		return getPostcondition(name, false, null, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Constraint getPostcondition(String name, boolean ignoreCase,
			EClass eClass, boolean createOnDemand) {
		postconditionLoop : for (Constraint postcondition : getPostconditions()) {
			if (eClass != null && !eClass.isInstance(postcondition))
				continue postconditionLoop;
			if (name != null && !(ignoreCase
				? name.equalsIgnoreCase(postcondition.getName())
				: name.equals(postcondition.getName())))
				continue postconditionLoop;
			return postcondition;
		}
		return createOnDemand && eClass != null
			? createPostcondition(name, eClass)
			: null;
	}

	/**
	 * The array of superset feature identifiers for the '{@link #getPreconditions() <em>Precondition</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreconditions()
	 * @generated
	 * @ordered
	 */
	protected static final int[] PRECONDITION_ESUPERSETS = new int[]{
		UMLPackage.BEHAVIOR__OWNED_RULE};

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Constraint createPrecondition(String name, EClass eClass) {
		Constraint newPrecondition = (Constraint) create(eClass);
		getPreconditions().add(newPrecondition);
		if (name != null)
			newPrecondition.setName(name);
		return newPrecondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Constraint createPrecondition(String name) {
		return createPrecondition(name, UMLPackage.Literals.CONSTRAINT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Constraint getPrecondition(String name) {
		return getPrecondition(name, false, null, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Constraint getPrecondition(String name, boolean ignoreCase,
			EClass eClass, boolean createOnDemand) {
		preconditionLoop : for (Constraint precondition : getPreconditions()) {
			if (eClass != null && !eClass.isInstance(precondition))
				continue preconditionLoop;
			if (name != null && !(ignoreCase
				? name.equalsIgnoreCase(precondition.getName())
				: name.equals(precondition.getName())))
				continue preconditionLoop;
			return precondition;
		}
		return createOnDemand && eClass != null
			? createPrecondition(name, eClass)
			: null;
	}

	/**
	 * The array of superset feature identifiers for the '{@link #getRedefinedBehaviors() <em>Redefined Behavior</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRedefinedBehaviors()
	 * @generated
	 * @ordered
	 */
	protected static final int[] REDEFINED_BEHAVIOR_ESUPERSETS = new int[]{
		UMLPackage.BEHAVIOR__REDEFINED_CLASSIFIER};

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
	public Behavior getRedefinedBehavior(String name, boolean ignoreCase,
			EClass eClass) {
		redefinedBehaviorLoop : for (Behavior redefinedBehavior : getRedefinedBehaviors()) {
			if (eClass != null && !eClass.isInstance(redefinedBehavior))
				continue redefinedBehaviorLoop;
			if (name != null && !(ignoreCase
				? name.equalsIgnoreCase(redefinedBehavior.getName())
				: name.equals(redefinedBehavior.getName())))
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
	public boolean validateMostOneBehavior(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return BehaviorOperations.validateMostOneBehavior(this, diagnostics,
			context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetRedefinitionContexts() {
		return super.isSetRedefinitionContexts()
			|| eIsSet(UMLPackage.BEHAVIOR__CONTEXT);
	}

} //BehaviorImpl
