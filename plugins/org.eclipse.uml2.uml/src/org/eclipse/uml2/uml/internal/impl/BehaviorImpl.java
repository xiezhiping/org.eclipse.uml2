/*
 * Copyright (c) 2005 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *
 * $Id: BehaviorImpl.java,v 1.9 2005/12/01 21:57:18 khussey Exp $
 */
package org.eclipse.uml2.uml.internal.impl;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.uml2.common.util.DerivedUnionEObjectEList;

import org.eclipse.uml2.uml.Behavior;
import org.eclipse.uml2.uml.BehavioralFeature;
import org.eclipse.uml2.uml.BehavioredClassifier;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.CollaborationUse;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Parameter;
import org.eclipse.uml2.uml.ParameterSet;
import org.eclipse.uml2.uml.RedefinableElement;
import org.eclipse.uml2.uml.RedefinableTemplateSignature;
import org.eclipse.uml2.uml.StringExpression;
import org.eclipse.uml2.uml.TemplateParameter;
import org.eclipse.uml2.uml.TemplateSignature;
import org.eclipse.uml2.uml.UMLFactory;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.VisibilityKind;

import org.eclipse.uml2.uml.internal.operations.BehaviorOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Behavior</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.BehaviorImpl#getRedefinedElements <em>Redefined Element</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.BehaviorImpl#getOwnedMembers <em>Owned Member</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.BehaviorImpl#getRedefinitionContexts <em>Redefinition Context</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.BehaviorImpl#isReentrant <em>Is Reentrant</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.BehaviorImpl#getRedefinedBehaviors <em>Redefined Behavior</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.BehaviorImpl#getOwnedParameters <em>Owned Parameter</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.BehaviorImpl#getContext <em>Context</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.BehaviorImpl#getOwnedParameterSets <em>Owned Parameter Set</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.BehaviorImpl#getSpecification <em>Specification</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BehaviorImpl
		extends ClassImpl
		implements Behavior {

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
	protected static final int IS_REENTRANT_EFLAG = 1 << 12;

	/**
	 * The flag representing whether the Is Reentrant attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected static final int IS_REENTRANT_ESETFLAG = 1 << 13;

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
		return UMLPackage.Literals.BEHAVIOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List getRedefinedElements() {
		List redefinedElement = (List) eVirtualGet(UMLPackage.BEHAVIOR__REDEFINED_ELEMENT);
		if (redefinedElement == null) {
			eVirtualSet(UMLPackage.BEHAVIOR__REDEFINED_ELEMENT,
				redefinedElement = new DerivedUnionEObjectEList(
					RedefinableElement.class, this,
					UMLPackage.BEHAVIOR__REDEFINED_ELEMENT, new int[]{
						UMLPackage.BEHAVIOR__REDEFINED_CLASSIFIER,
						UMLPackage.BEHAVIOR__REDEFINED_BEHAVIOR}));
		}
		return redefinedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List getOwnedMembers() {
		List ownedMember = (List) eVirtualGet(UMLPackage.BEHAVIOR__OWNED_MEMBER);
		if (ownedMember == null) {
			eVirtualSet(UMLPackage.BEHAVIOR__OWNED_MEMBER,
				ownedMember = new DerivedUnionEObjectEList(NamedElement.class,
					this, UMLPackage.BEHAVIOR__OWNED_MEMBER, new int[]{
						UMLPackage.BEHAVIOR__OWNED_RULE,
						UMLPackage.BEHAVIOR__OWNED_USE_CASE,
						UMLPackage.BEHAVIOR__OWNED_ATTRIBUTE,
						UMLPackage.BEHAVIOR__OWNED_CONNECTOR,
						UMLPackage.BEHAVIOR__OWNED_BEHAVIOR,
						UMLPackage.BEHAVIOR__OWNED_TRIGGER,
						UMLPackage.BEHAVIOR__OWNED_OPERATION,
						UMLPackage.BEHAVIOR__NESTED_CLASSIFIER,
						UMLPackage.BEHAVIOR__OWNED_RECEPTION,
						UMLPackage.BEHAVIOR__OWNED_PARAMETER,
						UMLPackage.BEHAVIOR__OWNED_PARAMETER_SET}));
		}
		return ownedMember;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List getRedefinitionContexts() {
		List redefinitionContext = (List) eVirtualGet(UMLPackage.BEHAVIOR__REDEFINITION_CONTEXT);
		if (redefinitionContext == null) {
			eVirtualSet(UMLPackage.BEHAVIOR__REDEFINITION_CONTEXT,
				redefinitionContext = new DerivedUnionEObjectEList(
					Classifier.class, this,
					UMLPackage.BEHAVIOR__REDEFINITION_CONTEXT,
					new int[]{UMLPackage.BEHAVIOR__CONTEXT}));
		}
		return redefinitionContext;
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
	public List getRedefinedBehaviors() {
		List redefinedBehavior = (List) eVirtualGet(UMLPackage.BEHAVIOR__REDEFINED_BEHAVIOR);
		if (redefinedBehavior == null) {
			eVirtualSet(UMLPackage.BEHAVIOR__REDEFINED_BEHAVIOR,
				redefinedBehavior = new EObjectResolvingEList(Behavior.class,
					this, UMLPackage.BEHAVIOR__REDEFINED_BEHAVIOR));
		}
		return redefinedBehavior;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Behavior getRedefinedBehavior(String name) {
		for (Iterator i = getRedefinedBehaviors().iterator(); i.hasNext();) {
			Behavior redefinedBehavior = (Behavior) i.next();
			if (name.equals(redefinedBehavior.getName())) {
				return redefinedBehavior;
			}
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List getOwnedParameters() {
		List ownedParameter = (List) eVirtualGet(UMLPackage.BEHAVIOR__OWNED_PARAMETER);
		if (ownedParameter == null) {
			eVirtualSet(UMLPackage.BEHAVIOR__OWNED_PARAMETER,
				ownedParameter = new EObjectContainmentEList(Parameter.class,
					this, UMLPackage.BEHAVIOR__OWNED_PARAMETER));
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
	 * @generated
	 */
	public void setContext(BehavioredClassifier newContext) {
		BehaviorOperations.setContext(this, newContext);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List getOwnedParameterSets() {
		List ownedParameterSet = (List) eVirtualGet(UMLPackage.BEHAVIOR__OWNED_PARAMETER_SET);
		if (ownedParameterSet == null) {
			eVirtualSet(UMLPackage.BEHAVIOR__OWNED_PARAMETER_SET,
				ownedParameterSet = new EObjectContainmentEList(
					ParameterSet.class, this,
					UMLPackage.BEHAVIOR__OWNED_PARAMETER_SET));
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
	public BehavioralFeature getSpecification() {
		BehavioralFeature specification = (BehavioralFeature) eVirtualGet(UMLPackage.BEHAVIOR__SPECIFICATION);
		if (specification != null && specification.eIsProxy()) {
			InternalEObject oldSpecification = (InternalEObject) specification;
			specification = (BehavioralFeature) eResolveProxy(oldSpecification);
			if (specification != oldSpecification) {
				eVirtualSet(UMLPackage.BEHAVIOR__SPECIFICATION, specification);
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
		return (BehavioralFeature) eVirtualGet(UMLPackage.BEHAVIOR__SPECIFICATION);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSpecification(
			BehavioralFeature newSpecification, NotificationChain msgs) {
		Object oldSpecification = eVirtualSet(
			UMLPackage.BEHAVIOR__SPECIFICATION, newSpecification);
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
				Notification.SET, UMLPackage.BEHAVIOR__SPECIFICATION,
				oldSpecification == EVIRTUAL_NO_VALUE
					? null
					: oldSpecification, newSpecification);
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
		BehavioralFeature specification = (BehavioralFeature) eVirtualGet(UMLPackage.BEHAVIOR__SPECIFICATION);
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
			Map context) {
		return BehaviorOperations.validateParametersMatch(this, diagnostics,
			context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFeatureOfContextClassifier(
			DiagnosticChain diagnostics, Map context) {
		return BehaviorOperations.validateFeatureOfContextClassifier(this,
			diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMustRealize(DiagnosticChain diagnostics, Map context) {
		return BehaviorOperations.validateMustRealize(this, diagnostics,
			context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMostOneBehaviour(DiagnosticChain diagnostics,
			Map context) {
		return BehaviorOperations.validateMostOneBehaviour(this, diagnostics,
			context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UMLPackage.BEHAVIOR__EANNOTATIONS :
				return ((InternalEList) getEAnnotations()).basicAdd(otherEnd,
					msgs);
			case UMLPackage.BEHAVIOR__CLIENT_DEPENDENCY :
				return ((InternalEList) getClientDependencies()).basicAdd(
					otherEnd, msgs);
			case UMLPackage.BEHAVIOR__ELEMENT_IMPORT :
				return ((InternalEList) getElementImports()).basicAdd(otherEnd,
					msgs);
			case UMLPackage.BEHAVIOR__PACKAGE_IMPORT :
				return ((InternalEList) getPackageImports()).basicAdd(otherEnd,
					msgs);
			case UMLPackage.BEHAVIOR__OWNED_RULE :
				return ((InternalEList) getOwnedRules()).basicAdd(otherEnd,
					msgs);
			case UMLPackage.BEHAVIOR__TEMPLATE_PARAMETER :
				TemplateParameter templateParameter = (TemplateParameter) eVirtualGet(UMLPackage.BEHAVIOR__TEMPLATE_PARAMETER);
				if (templateParameter != null)
					msgs = ((InternalEObject) templateParameter)
						.eInverseRemove(this,
							UMLPackage.TEMPLATE_PARAMETER__PARAMETERED_ELEMENT,
							TemplateParameter.class, msgs);
				return basicSetTemplateParameter((TemplateParameter) otherEnd,
					msgs);
			case UMLPackage.BEHAVIOR__OWNING_TEMPLATE_PARAMETER :
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return eBasicSetContainer(otherEnd,
					UMLPackage.BEHAVIOR__OWNING_TEMPLATE_PARAMETER, msgs);
			case UMLPackage.BEHAVIOR__TEMPLATE_BINDING :
				return ((InternalEList) getTemplateBindings()).basicAdd(
					otherEnd, msgs);
			case UMLPackage.BEHAVIOR__OWNED_TEMPLATE_SIGNATURE :
				TemplateSignature ownedTemplateSignature = (TemplateSignature) eVirtualGet(UMLPackage.BEHAVIOR__OWNED_TEMPLATE_SIGNATURE);
				if (ownedTemplateSignature != null)
					msgs = ((InternalEObject) ownedTemplateSignature)
						.eInverseRemove(this, EOPPOSITE_FEATURE_BASE
							- UMLPackage.BEHAVIOR__OWNED_TEMPLATE_SIGNATURE,
							null, msgs);
				return basicSetOwnedTemplateSignature(
					(TemplateSignature) otherEnd, msgs);
			case UMLPackage.BEHAVIOR__GENERALIZATION :
				return ((InternalEList) getGeneralizations()).basicAdd(
					otherEnd, msgs);
			case UMLPackage.BEHAVIOR__POWERTYPE_EXTENT :
				return ((InternalEList) getPowertypeExtents()).basicAdd(
					otherEnd, msgs);
			case UMLPackage.BEHAVIOR__USE_CASE :
				return ((InternalEList) getUseCases()).basicAdd(otherEnd, msgs);
			case UMLPackage.BEHAVIOR__SUBSTITUTION :
				return ((InternalEList) getSubstitutions()).basicAdd(otherEnd,
					msgs);
			case UMLPackage.BEHAVIOR__OWNED_SIGNATURE :
				RedefinableTemplateSignature ownedSignature = (RedefinableTemplateSignature) eVirtualGet(UMLPackage.BEHAVIOR__OWNED_SIGNATURE);
				if (ownedSignature != null)
					msgs = ((InternalEObject) ownedSignature).eInverseRemove(
						this, EOPPOSITE_FEATURE_BASE
							- UMLPackage.BEHAVIOR__OWNED_SIGNATURE, null, msgs);
				return basicSetOwnedSignature(
					(RedefinableTemplateSignature) otherEnd, msgs);
			case UMLPackage.BEHAVIOR__INTERFACE_REALIZATION :
				return ((InternalEList) getInterfaceRealizations()).basicAdd(
					otherEnd, msgs);
			case UMLPackage.BEHAVIOR__OWNED_OPERATION :
				return ((InternalEList) getOwnedOperations()).basicAdd(
					otherEnd, msgs);
			case UMLPackage.BEHAVIOR__SPECIFICATION :
				BehavioralFeature specification = (BehavioralFeature) eVirtualGet(UMLPackage.BEHAVIOR__SPECIFICATION);
				if (specification != null)
					msgs = ((InternalEObject) specification).eInverseRemove(
						this, UMLPackage.BEHAVIORAL_FEATURE__METHOD,
						BehavioralFeature.class, msgs);
				return basicSetSpecification((BehavioralFeature) otherEnd, msgs);
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
			case UMLPackage.BEHAVIOR__EANNOTATIONS :
				return ((InternalEList) getEAnnotations()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.BEHAVIOR__OWNED_COMMENT :
				return ((InternalEList) getOwnedComments()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.BEHAVIOR__CLIENT_DEPENDENCY :
				return ((InternalEList) getClientDependencies()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.BEHAVIOR__NAME_EXPRESSION :
				return basicSetNameExpression(null, msgs);
			case UMLPackage.BEHAVIOR__ELEMENT_IMPORT :
				return ((InternalEList) getElementImports()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.BEHAVIOR__PACKAGE_IMPORT :
				return ((InternalEList) getPackageImports()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.BEHAVIOR__OWNED_RULE :
				return ((InternalEList) getOwnedRules()).basicRemove(otherEnd,
					msgs);
			case UMLPackage.BEHAVIOR__TEMPLATE_PARAMETER :
				return basicSetTemplateParameter(null, msgs);
			case UMLPackage.BEHAVIOR__OWNING_TEMPLATE_PARAMETER :
				return eBasicSetContainer(null,
					UMLPackage.BEHAVIOR__OWNING_TEMPLATE_PARAMETER, msgs);
			case UMLPackage.BEHAVIOR__TEMPLATE_BINDING :
				return ((InternalEList) getTemplateBindings()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.BEHAVIOR__OWNED_TEMPLATE_SIGNATURE :
				return basicSetOwnedTemplateSignature(null, msgs);
			case UMLPackage.BEHAVIOR__GENERALIZATION :
				return ((InternalEList) getGeneralizations()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.BEHAVIOR__POWERTYPE_EXTENT :
				return ((InternalEList) getPowertypeExtents()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.BEHAVIOR__OWNED_USE_CASE :
				return ((InternalEList) getOwnedUseCases()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.BEHAVIOR__USE_CASE :
				return ((InternalEList) getUseCases()).basicRemove(otherEnd,
					msgs);
			case UMLPackage.BEHAVIOR__SUBSTITUTION :
				return ((InternalEList) getSubstitutions()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.BEHAVIOR__COLLABORATION_USE :
				return ((InternalEList) getCollaborationUses()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.BEHAVIOR__OWNED_SIGNATURE :
				return basicSetOwnedSignature(null, msgs);
			case UMLPackage.BEHAVIOR__OWNED_ATTRIBUTE :
				return ((InternalEList) getOwnedAttributes()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.BEHAVIOR__OWNED_CONNECTOR :
				return ((InternalEList) getOwnedConnectors()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.BEHAVIOR__OWNED_BEHAVIOR :
				return ((InternalEList) getOwnedBehaviors()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.BEHAVIOR__INTERFACE_REALIZATION :
				return ((InternalEList) getInterfaceRealizations())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.BEHAVIOR__OWNED_TRIGGER :
				return ((InternalEList) getOwnedTriggers()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.BEHAVIOR__OWNED_OPERATION :
				return ((InternalEList) getOwnedOperations()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.BEHAVIOR__NESTED_CLASSIFIER :
				return ((InternalEList) getNestedClassifiers()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.BEHAVIOR__OWNED_RECEPTION :
				return ((InternalEList) getOwnedReceptions()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.BEHAVIOR__OWNED_PARAMETER :
				return ((InternalEList) getOwnedParameters()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.BEHAVIOR__OWNED_PARAMETER_SET :
				return ((InternalEList) getOwnedParameterSets()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.BEHAVIOR__SPECIFICATION :
				return basicSetSpecification(null, msgs);
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
			case UMLPackage.BEHAVIOR__EANNOTATIONS :
				return getEAnnotations();
			case UMLPackage.BEHAVIOR__OWNED_ELEMENT :
				return getOwnedElements();
			case UMLPackage.BEHAVIOR__OWNER :
				if (resolve)
					return getOwner();
				return basicGetOwner();
			case UMLPackage.BEHAVIOR__OWNED_COMMENT :
				return getOwnedComments();
			case UMLPackage.BEHAVIOR__NAME :
				return getName();
			case UMLPackage.BEHAVIOR__VISIBILITY :
				return getVisibility();
			case UMLPackage.BEHAVIOR__QUALIFIED_NAME :
				return getQualifiedName();
			case UMLPackage.BEHAVIOR__CLIENT_DEPENDENCY :
				return getClientDependencies();
			case UMLPackage.BEHAVIOR__NAMESPACE :
				if (resolve)
					return getNamespace();
				return basicGetNamespace();
			case UMLPackage.BEHAVIOR__NAME_EXPRESSION :
				return getNameExpression();
			case UMLPackage.BEHAVIOR__ELEMENT_IMPORT :
				return getElementImports();
			case UMLPackage.BEHAVIOR__PACKAGE_IMPORT :
				return getPackageImports();
			case UMLPackage.BEHAVIOR__OWNED_RULE :
				return getOwnedRules();
			case UMLPackage.BEHAVIOR__MEMBER :
				return getMembers();
			case UMLPackage.BEHAVIOR__IMPORTED_MEMBER :
				return getImportedMembers();
			case UMLPackage.BEHAVIOR__OWNED_MEMBER :
				return getOwnedMembers();
			case UMLPackage.BEHAVIOR__IS_LEAF :
				return isLeaf()
					? Boolean.TRUE
					: Boolean.FALSE;
			case UMLPackage.BEHAVIOR__REDEFINED_ELEMENT :
				return getRedefinedElements();
			case UMLPackage.BEHAVIOR__REDEFINITION_CONTEXT :
				return getRedefinitionContexts();
			case UMLPackage.BEHAVIOR__TEMPLATE_PARAMETER :
				if (resolve)
					return getTemplateParameter();
				return basicGetTemplateParameter();
			case UMLPackage.BEHAVIOR__OWNING_TEMPLATE_PARAMETER :
				if (resolve)
					return getOwningTemplateParameter();
				return basicGetOwningTemplateParameter();
			case UMLPackage.BEHAVIOR__PACKAGE :
				if (resolve)
					return getPackage();
				return basicGetPackage();
			case UMLPackage.BEHAVIOR__TEMPLATE_BINDING :
				return getTemplateBindings();
			case UMLPackage.BEHAVIOR__OWNED_TEMPLATE_SIGNATURE :
				return getOwnedTemplateSignature();
			case UMLPackage.BEHAVIOR__IS_ABSTRACT :
				return isAbstract()
					? Boolean.TRUE
					: Boolean.FALSE;
			case UMLPackage.BEHAVIOR__GENERALIZATION :
				return getGeneralizations();
			case UMLPackage.BEHAVIOR__POWERTYPE_EXTENT :
				return getPowertypeExtents();
			case UMLPackage.BEHAVIOR__FEATURE :
				return getFeatures();
			case UMLPackage.BEHAVIOR__INHERITED_MEMBER :
				return getInheritedMembers();
			case UMLPackage.BEHAVIOR__REDEFINED_CLASSIFIER :
				return getRedefinedClassifiers();
			case UMLPackage.BEHAVIOR__GENERAL :
				return getGenerals();
			case UMLPackage.BEHAVIOR__OWNED_USE_CASE :
				return getOwnedUseCases();
			case UMLPackage.BEHAVIOR__USE_CASE :
				return getUseCases();
			case UMLPackage.BEHAVIOR__SUBSTITUTION :
				return getSubstitutions();
			case UMLPackage.BEHAVIOR__ATTRIBUTE :
				return getAttributes();
			case UMLPackage.BEHAVIOR__REPRESENTATION :
				return getRepresentation();
			case UMLPackage.BEHAVIOR__COLLABORATION_USE :
				return getCollaborationUses();
			case UMLPackage.BEHAVIOR__OWNED_SIGNATURE :
				return getOwnedSignature();
			case UMLPackage.BEHAVIOR__OWNED_ATTRIBUTE :
				return getOwnedAttributes();
			case UMLPackage.BEHAVIOR__PART :
				return getParts();
			case UMLPackage.BEHAVIOR__ROLE :
				return getRoles();
			case UMLPackage.BEHAVIOR__OWNED_CONNECTOR :
				return getOwnedConnectors();
			case UMLPackage.BEHAVIOR__OWNED_PORT :
				return getOwnedPorts();
			case UMLPackage.BEHAVIOR__OWNED_BEHAVIOR :
				return getOwnedBehaviors();
			case UMLPackage.BEHAVIOR__CLASSIFIER_BEHAVIOR :
				return getClassifierBehavior();
			case UMLPackage.BEHAVIOR__INTERFACE_REALIZATION :
				return getInterfaceRealizations();
			case UMLPackage.BEHAVIOR__OWNED_TRIGGER :
				return getOwnedTriggers();
			case UMLPackage.BEHAVIOR__OWNED_OPERATION :
				return getOwnedOperations();
			case UMLPackage.BEHAVIOR__NESTED_CLASSIFIER :
				return getNestedClassifiers();
			case UMLPackage.BEHAVIOR__SUPER_CLASS :
				return getSuperClasses();
			case UMLPackage.BEHAVIOR__IS_ACTIVE :
				return isActive()
					? Boolean.TRUE
					: Boolean.FALSE;
			case UMLPackage.BEHAVIOR__OWNED_RECEPTION :
				return getOwnedReceptions();
			case UMLPackage.BEHAVIOR__EXTENSION :
				return getExtensions();
			case UMLPackage.BEHAVIOR__IS_REENTRANT :
				return isReentrant()
					? Boolean.TRUE
					: Boolean.FALSE;
			case UMLPackage.BEHAVIOR__REDEFINED_BEHAVIOR :
				return getRedefinedBehaviors();
			case UMLPackage.BEHAVIOR__OWNED_PARAMETER :
				return getOwnedParameters();
			case UMLPackage.BEHAVIOR__CONTEXT :
				if (resolve)
					return getContext();
				return basicGetContext();
			case UMLPackage.BEHAVIOR__OWNED_PARAMETER_SET :
				return getOwnedParameterSets();
			case UMLPackage.BEHAVIOR__SPECIFICATION :
				if (resolve)
					return getSpecification();
				return basicGetSpecification();
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
			case UMLPackage.BEHAVIOR__EANNOTATIONS :
				getEAnnotations().clear();
				getEAnnotations().addAll((Collection) newValue);
				return;
			case UMLPackage.BEHAVIOR__OWNED_COMMENT :
				getOwnedComments().clear();
				getOwnedComments().addAll((Collection) newValue);
				return;
			case UMLPackage.BEHAVIOR__NAME :
				setName((String) newValue);
				return;
			case UMLPackage.BEHAVIOR__VISIBILITY :
				setVisibility((VisibilityKind) newValue);
				return;
			case UMLPackage.BEHAVIOR__CLIENT_DEPENDENCY :
				getClientDependencies().clear();
				getClientDependencies().addAll((Collection) newValue);
				return;
			case UMLPackage.BEHAVIOR__NAME_EXPRESSION :
				setNameExpression((StringExpression) newValue);
				return;
			case UMLPackage.BEHAVIOR__ELEMENT_IMPORT :
				getElementImports().clear();
				getElementImports().addAll((Collection) newValue);
				return;
			case UMLPackage.BEHAVIOR__PACKAGE_IMPORT :
				getPackageImports().clear();
				getPackageImports().addAll((Collection) newValue);
				return;
			case UMLPackage.BEHAVIOR__OWNED_RULE :
				getOwnedRules().clear();
				getOwnedRules().addAll((Collection) newValue);
				return;
			case UMLPackage.BEHAVIOR__IS_LEAF :
				setIsLeaf(((Boolean) newValue).booleanValue());
				return;
			case UMLPackage.BEHAVIOR__TEMPLATE_PARAMETER :
				setTemplateParameter((TemplateParameter) newValue);
				return;
			case UMLPackage.BEHAVIOR__OWNING_TEMPLATE_PARAMETER :
				setOwningTemplateParameter((TemplateParameter) newValue);
				return;
			case UMLPackage.BEHAVIOR__PACKAGE :
				setPackage((org.eclipse.uml2.uml.Package) newValue);
				return;
			case UMLPackage.BEHAVIOR__TEMPLATE_BINDING :
				getTemplateBindings().clear();
				getTemplateBindings().addAll((Collection) newValue);
				return;
			case UMLPackage.BEHAVIOR__OWNED_TEMPLATE_SIGNATURE :
				setOwnedTemplateSignature((TemplateSignature) newValue);
				return;
			case UMLPackage.BEHAVIOR__IS_ABSTRACT :
				setIsAbstract(((Boolean) newValue).booleanValue());
				return;
			case UMLPackage.BEHAVIOR__GENERALIZATION :
				getGeneralizations().clear();
				getGeneralizations().addAll((Collection) newValue);
				return;
			case UMLPackage.BEHAVIOR__POWERTYPE_EXTENT :
				getPowertypeExtents().clear();
				getPowertypeExtents().addAll((Collection) newValue);
				return;
			case UMLPackage.BEHAVIOR__INHERITED_MEMBER :
				getInheritedMembers().clear();
				getInheritedMembers().addAll((Collection) newValue);
				return;
			case UMLPackage.BEHAVIOR__REDEFINED_CLASSIFIER :
				getRedefinedClassifiers().clear();
				getRedefinedClassifiers().addAll((Collection) newValue);
				return;
			case UMLPackage.BEHAVIOR__GENERAL :
				getGenerals().clear();
				getGenerals().addAll((Collection) newValue);
				return;
			case UMLPackage.BEHAVIOR__OWNED_USE_CASE :
				getOwnedUseCases().clear();
				getOwnedUseCases().addAll((Collection) newValue);
				return;
			case UMLPackage.BEHAVIOR__USE_CASE :
				getUseCases().clear();
				getUseCases().addAll((Collection) newValue);
				return;
			case UMLPackage.BEHAVIOR__SUBSTITUTION :
				getSubstitutions().clear();
				getSubstitutions().addAll((Collection) newValue);
				return;
			case UMLPackage.BEHAVIOR__REPRESENTATION :
				setRepresentation((CollaborationUse) newValue);
				return;
			case UMLPackage.BEHAVIOR__COLLABORATION_USE :
				getCollaborationUses().clear();
				getCollaborationUses().addAll((Collection) newValue);
				return;
			case UMLPackage.BEHAVIOR__OWNED_SIGNATURE :
				setOwnedSignature((RedefinableTemplateSignature) newValue);
				return;
			case UMLPackage.BEHAVIOR__OWNED_ATTRIBUTE :
				getOwnedAttributes().clear();
				getOwnedAttributes().addAll((Collection) newValue);
				return;
			case UMLPackage.BEHAVIOR__OWNED_CONNECTOR :
				getOwnedConnectors().clear();
				getOwnedConnectors().addAll((Collection) newValue);
				return;
			case UMLPackage.BEHAVIOR__OWNED_PORT :
				getOwnedPorts().clear();
				getOwnedPorts().addAll((Collection) newValue);
				return;
			case UMLPackage.BEHAVIOR__OWNED_BEHAVIOR :
				getOwnedBehaviors().clear();
				getOwnedBehaviors().addAll((Collection) newValue);
				return;
			case UMLPackage.BEHAVIOR__CLASSIFIER_BEHAVIOR :
				setClassifierBehavior((Behavior) newValue);
				return;
			case UMLPackage.BEHAVIOR__INTERFACE_REALIZATION :
				getInterfaceRealizations().clear();
				getInterfaceRealizations().addAll((Collection) newValue);
				return;
			case UMLPackage.BEHAVIOR__OWNED_TRIGGER :
				getOwnedTriggers().clear();
				getOwnedTriggers().addAll((Collection) newValue);
				return;
			case UMLPackage.BEHAVIOR__OWNED_OPERATION :
				getOwnedOperations().clear();
				getOwnedOperations().addAll((Collection) newValue);
				return;
			case UMLPackage.BEHAVIOR__NESTED_CLASSIFIER :
				getNestedClassifiers().clear();
				getNestedClassifiers().addAll((Collection) newValue);
				return;
			case UMLPackage.BEHAVIOR__SUPER_CLASS :
				getSuperClasses().clear();
				getSuperClasses().addAll((Collection) newValue);
				return;
			case UMLPackage.BEHAVIOR__IS_ACTIVE :
				setIsActive(((Boolean) newValue).booleanValue());
				return;
			case UMLPackage.BEHAVIOR__OWNED_RECEPTION :
				getOwnedReceptions().clear();
				getOwnedReceptions().addAll((Collection) newValue);
				return;
			case UMLPackage.BEHAVIOR__IS_REENTRANT :
				setIsReentrant(((Boolean) newValue).booleanValue());
				return;
			case UMLPackage.BEHAVIOR__REDEFINED_BEHAVIOR :
				getRedefinedBehaviors().clear();
				getRedefinedBehaviors().addAll((Collection) newValue);
				return;
			case UMLPackage.BEHAVIOR__OWNED_PARAMETER :
				getOwnedParameters().clear();
				getOwnedParameters().addAll((Collection) newValue);
				return;
			case UMLPackage.BEHAVIOR__CONTEXT :
				setContext((BehavioredClassifier) newValue);
				return;
			case UMLPackage.BEHAVIOR__OWNED_PARAMETER_SET :
				getOwnedParameterSets().clear();
				getOwnedParameterSets().addAll((Collection) newValue);
				return;
			case UMLPackage.BEHAVIOR__SPECIFICATION :
				setSpecification((BehavioralFeature) newValue);
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
			case UMLPackage.BEHAVIOR__EANNOTATIONS :
				getEAnnotations().clear();
				return;
			case UMLPackage.BEHAVIOR__OWNED_COMMENT :
				getOwnedComments().clear();
				return;
			case UMLPackage.BEHAVIOR__NAME :
				setName(NAME_EDEFAULT);
				return;
			case UMLPackage.BEHAVIOR__VISIBILITY :
				setVisibility(VISIBILITY_EDEFAULT);
				return;
			case UMLPackage.BEHAVIOR__CLIENT_DEPENDENCY :
				getClientDependencies().clear();
				return;
			case UMLPackage.BEHAVIOR__NAME_EXPRESSION :
				setNameExpression((StringExpression) null);
				return;
			case UMLPackage.BEHAVIOR__ELEMENT_IMPORT :
				getElementImports().clear();
				return;
			case UMLPackage.BEHAVIOR__PACKAGE_IMPORT :
				getPackageImports().clear();
				return;
			case UMLPackage.BEHAVIOR__OWNED_RULE :
				getOwnedRules().clear();
				return;
			case UMLPackage.BEHAVIOR__IS_LEAF :
				setIsLeaf(IS_LEAF_EDEFAULT);
				return;
			case UMLPackage.BEHAVIOR__TEMPLATE_PARAMETER :
				setTemplateParameter((TemplateParameter) null);
				return;
			case UMLPackage.BEHAVIOR__OWNING_TEMPLATE_PARAMETER :
				setOwningTemplateParameter((TemplateParameter) null);
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
			case UMLPackage.BEHAVIOR__IS_ABSTRACT :
				setIsAbstract(IS_ABSTRACT_EDEFAULT);
				return;
			case UMLPackage.BEHAVIOR__GENERALIZATION :
				getGeneralizations().clear();
				return;
			case UMLPackage.BEHAVIOR__POWERTYPE_EXTENT :
				getPowertypeExtents().clear();
				return;
			case UMLPackage.BEHAVIOR__INHERITED_MEMBER :
				getInheritedMembers().clear();
				return;
			case UMLPackage.BEHAVIOR__REDEFINED_CLASSIFIER :
				getRedefinedClassifiers().clear();
				return;
			case UMLPackage.BEHAVIOR__GENERAL :
				getGenerals().clear();
				return;
			case UMLPackage.BEHAVIOR__OWNED_USE_CASE :
				getOwnedUseCases().clear();
				return;
			case UMLPackage.BEHAVIOR__USE_CASE :
				getUseCases().clear();
				return;
			case UMLPackage.BEHAVIOR__SUBSTITUTION :
				getSubstitutions().clear();
				return;
			case UMLPackage.BEHAVIOR__REPRESENTATION :
				setRepresentation((CollaborationUse) null);
				return;
			case UMLPackage.BEHAVIOR__COLLABORATION_USE :
				getCollaborationUses().clear();
				return;
			case UMLPackage.BEHAVIOR__OWNED_SIGNATURE :
				setOwnedSignature((RedefinableTemplateSignature) null);
				return;
			case UMLPackage.BEHAVIOR__OWNED_ATTRIBUTE :
				getOwnedAttributes().clear();
				return;
			case UMLPackage.BEHAVIOR__OWNED_CONNECTOR :
				getOwnedConnectors().clear();
				return;
			case UMLPackage.BEHAVIOR__OWNED_PORT :
				getOwnedPorts().clear();
				return;
			case UMLPackage.BEHAVIOR__OWNED_BEHAVIOR :
				getOwnedBehaviors().clear();
				return;
			case UMLPackage.BEHAVIOR__CLASSIFIER_BEHAVIOR :
				setClassifierBehavior((Behavior) null);
				return;
			case UMLPackage.BEHAVIOR__INTERFACE_REALIZATION :
				getInterfaceRealizations().clear();
				return;
			case UMLPackage.BEHAVIOR__OWNED_TRIGGER :
				getOwnedTriggers().clear();
				return;
			case UMLPackage.BEHAVIOR__OWNED_OPERATION :
				getOwnedOperations().clear();
				return;
			case UMLPackage.BEHAVIOR__NESTED_CLASSIFIER :
				getNestedClassifiers().clear();
				return;
			case UMLPackage.BEHAVIOR__SUPER_CLASS :
				getSuperClasses().clear();
				return;
			case UMLPackage.BEHAVIOR__IS_ACTIVE :
				unsetIsActive();
				return;
			case UMLPackage.BEHAVIOR__OWNED_RECEPTION :
				getOwnedReceptions().clear();
				return;
			case UMLPackage.BEHAVIOR__IS_REENTRANT :
				unsetIsReentrant();
				return;
			case UMLPackage.BEHAVIOR__REDEFINED_BEHAVIOR :
				getRedefinedBehaviors().clear();
				return;
			case UMLPackage.BEHAVIOR__OWNED_PARAMETER :
				getOwnedParameters().clear();
				return;
			case UMLPackage.BEHAVIOR__CONTEXT :
				setContext((BehavioredClassifier) null);
				return;
			case UMLPackage.BEHAVIOR__OWNED_PARAMETER_SET :
				getOwnedParameterSets().clear();
				return;
			case UMLPackage.BEHAVIOR__SPECIFICATION :
				setSpecification((BehavioralFeature) null);
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
			case UMLPackage.BEHAVIOR__EANNOTATIONS :
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UMLPackage.BEHAVIOR__OWNED_ELEMENT :
				return isSetOwnedElements();
			case UMLPackage.BEHAVIOR__OWNER :
				return isSetOwner();
			case UMLPackage.BEHAVIOR__OWNED_COMMENT :
				List ownedComment = (List) eVirtualGet(UMLPackage.BEHAVIOR__OWNED_COMMENT);
				return ownedComment != null && !ownedComment.isEmpty();
			case UMLPackage.BEHAVIOR__NAME :
				String name = (String) eVirtualGet(UMLPackage.BEHAVIOR__NAME,
					NAME_EDEFAULT);
				return NAME_EDEFAULT == null
					? name != null
					: !NAME_EDEFAULT.equals(name);
			case UMLPackage.BEHAVIOR__VISIBILITY :
				return isSetVisibility();
			case UMLPackage.BEHAVIOR__QUALIFIED_NAME :
				return QUALIFIED_NAME_EDEFAULT == null
					? getQualifiedName() != null
					: !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case UMLPackage.BEHAVIOR__CLIENT_DEPENDENCY :
				List clientDependency = (List) eVirtualGet(UMLPackage.BEHAVIOR__CLIENT_DEPENDENCY);
				return clientDependency != null && !clientDependency.isEmpty();
			case UMLPackage.BEHAVIOR__NAMESPACE :
				return isSetNamespace();
			case UMLPackage.BEHAVIOR__NAME_EXPRESSION :
				return eVirtualGet(UMLPackage.BEHAVIOR__NAME_EXPRESSION) != null;
			case UMLPackage.BEHAVIOR__ELEMENT_IMPORT :
				List elementImport = (List) eVirtualGet(UMLPackage.BEHAVIOR__ELEMENT_IMPORT);
				return elementImport != null && !elementImport.isEmpty();
			case UMLPackage.BEHAVIOR__PACKAGE_IMPORT :
				List packageImport = (List) eVirtualGet(UMLPackage.BEHAVIOR__PACKAGE_IMPORT);
				return packageImport != null && !packageImport.isEmpty();
			case UMLPackage.BEHAVIOR__OWNED_RULE :
				List ownedRule = (List) eVirtualGet(UMLPackage.BEHAVIOR__OWNED_RULE);
				return ownedRule != null && !ownedRule.isEmpty();
			case UMLPackage.BEHAVIOR__MEMBER :
				return isSetMembers();
			case UMLPackage.BEHAVIOR__IMPORTED_MEMBER :
				return !getImportedMembers().isEmpty();
			case UMLPackage.BEHAVIOR__OWNED_MEMBER :
				return isSetOwnedMembers();
			case UMLPackage.BEHAVIOR__IS_LEAF :
				return ((eFlags & IS_LEAF_EFLAG) != 0) != IS_LEAF_EDEFAULT;
			case UMLPackage.BEHAVIOR__REDEFINED_ELEMENT :
				return isSetRedefinedElements();
			case UMLPackage.BEHAVIOR__REDEFINITION_CONTEXT :
				return isSetRedefinitionContexts();
			case UMLPackage.BEHAVIOR__TEMPLATE_PARAMETER :
				return isSetTemplateParameter();
			case UMLPackage.BEHAVIOR__OWNING_TEMPLATE_PARAMETER :
				return basicGetOwningTemplateParameter() != null;
			case UMLPackage.BEHAVIOR__PACKAGE :
				return basicGetPackage() != null;
			case UMLPackage.BEHAVIOR__TEMPLATE_BINDING :
				List templateBinding = (List) eVirtualGet(UMLPackage.BEHAVIOR__TEMPLATE_BINDING);
				return templateBinding != null && !templateBinding.isEmpty();
			case UMLPackage.BEHAVIOR__OWNED_TEMPLATE_SIGNATURE :
				return eVirtualGet(UMLPackage.BEHAVIOR__OWNED_TEMPLATE_SIGNATURE) != null;
			case UMLPackage.BEHAVIOR__IS_ABSTRACT :
				return isSetIsAbstract();
			case UMLPackage.BEHAVIOR__GENERALIZATION :
				List generalization = (List) eVirtualGet(UMLPackage.BEHAVIOR__GENERALIZATION);
				return generalization != null && !generalization.isEmpty();
			case UMLPackage.BEHAVIOR__POWERTYPE_EXTENT :
				List powertypeExtent = (List) eVirtualGet(UMLPackage.BEHAVIOR__POWERTYPE_EXTENT);
				return powertypeExtent != null && !powertypeExtent.isEmpty();
			case UMLPackage.BEHAVIOR__FEATURE :
				return isSetFeatures();
			case UMLPackage.BEHAVIOR__INHERITED_MEMBER :
				return !getInheritedMembers().isEmpty();
			case UMLPackage.BEHAVIOR__REDEFINED_CLASSIFIER :
				List redefinedClassifier = (List) eVirtualGet(UMLPackage.BEHAVIOR__REDEFINED_CLASSIFIER);
				return redefinedClassifier != null
					&& !redefinedClassifier.isEmpty();
			case UMLPackage.BEHAVIOR__GENERAL :
				return isSetGenerals();
			case UMLPackage.BEHAVIOR__OWNED_USE_CASE :
				List ownedUseCase = (List) eVirtualGet(UMLPackage.BEHAVIOR__OWNED_USE_CASE);
				return ownedUseCase != null && !ownedUseCase.isEmpty();
			case UMLPackage.BEHAVIOR__USE_CASE :
				List useCase = (List) eVirtualGet(UMLPackage.BEHAVIOR__USE_CASE);
				return useCase != null && !useCase.isEmpty();
			case UMLPackage.BEHAVIOR__SUBSTITUTION :
				List substitution = (List) eVirtualGet(UMLPackage.BEHAVIOR__SUBSTITUTION);
				return substitution != null && !substitution.isEmpty();
			case UMLPackage.BEHAVIOR__ATTRIBUTE :
				return isSetAttributes();
			case UMLPackage.BEHAVIOR__REPRESENTATION :
				return eVirtualGet(UMLPackage.BEHAVIOR__REPRESENTATION) != null;
			case UMLPackage.BEHAVIOR__COLLABORATION_USE :
				List collaborationUse = (List) eVirtualGet(UMLPackage.BEHAVIOR__COLLABORATION_USE);
				return collaborationUse != null && !collaborationUse.isEmpty();
			case UMLPackage.BEHAVIOR__OWNED_SIGNATURE :
				return eVirtualGet(UMLPackage.BEHAVIOR__OWNED_SIGNATURE) != null;
			case UMLPackage.BEHAVIOR__OWNED_ATTRIBUTE :
				return isSetOwnedAttributes();
			case UMLPackage.BEHAVIOR__PART :
				return !getParts().isEmpty();
			case UMLPackage.BEHAVIOR__ROLE :
				return isSetRoles();
			case UMLPackage.BEHAVIOR__OWNED_CONNECTOR :
				List ownedConnector = (List) eVirtualGet(UMLPackage.BEHAVIOR__OWNED_CONNECTOR);
				return ownedConnector != null && !ownedConnector.isEmpty();
			case UMLPackage.BEHAVIOR__OWNED_PORT :
				List ownedPort = (List) eVirtualGet(UMLPackage.BEHAVIOR__OWNED_PORT);
				return ownedPort != null && !ownedPort.isEmpty();
			case UMLPackage.BEHAVIOR__OWNED_BEHAVIOR :
				List ownedBehavior = (List) eVirtualGet(UMLPackage.BEHAVIOR__OWNED_BEHAVIOR);
				return ownedBehavior != null && !ownedBehavior.isEmpty();
			case UMLPackage.BEHAVIOR__CLASSIFIER_BEHAVIOR :
				return eVirtualGet(UMLPackage.BEHAVIOR__CLASSIFIER_BEHAVIOR) != null;
			case UMLPackage.BEHAVIOR__INTERFACE_REALIZATION :
				List interfaceRealization = (List) eVirtualGet(UMLPackage.BEHAVIOR__INTERFACE_REALIZATION);
				return interfaceRealization != null
					&& !interfaceRealization.isEmpty();
			case UMLPackage.BEHAVIOR__OWNED_TRIGGER :
				List ownedTrigger = (List) eVirtualGet(UMLPackage.BEHAVIOR__OWNED_TRIGGER);
				return ownedTrigger != null && !ownedTrigger.isEmpty();
			case UMLPackage.BEHAVIOR__OWNED_OPERATION :
				List ownedOperation = (List) eVirtualGet(UMLPackage.BEHAVIOR__OWNED_OPERATION);
				return ownedOperation != null && !ownedOperation.isEmpty();
			case UMLPackage.BEHAVIOR__NESTED_CLASSIFIER :
				List nestedClassifier = (List) eVirtualGet(UMLPackage.BEHAVIOR__NESTED_CLASSIFIER);
				return nestedClassifier != null && !nestedClassifier.isEmpty();
			case UMLPackage.BEHAVIOR__SUPER_CLASS :
				return isSetSuperClasses();
			case UMLPackage.BEHAVIOR__IS_ACTIVE :
				return isSetIsActive();
			case UMLPackage.BEHAVIOR__OWNED_RECEPTION :
				List ownedReception = (List) eVirtualGet(UMLPackage.BEHAVIOR__OWNED_RECEPTION);
				return ownedReception != null && !ownedReception.isEmpty();
			case UMLPackage.BEHAVIOR__EXTENSION :
				return !getExtensions().isEmpty();
			case UMLPackage.BEHAVIOR__IS_REENTRANT :
				return isSetIsReentrant();
			case UMLPackage.BEHAVIOR__REDEFINED_BEHAVIOR :
				List redefinedBehavior = (List) eVirtualGet(UMLPackage.BEHAVIOR__REDEFINED_BEHAVIOR);
				return redefinedBehavior != null
					&& !redefinedBehavior.isEmpty();
			case UMLPackage.BEHAVIOR__OWNED_PARAMETER :
				List ownedParameter = (List) eVirtualGet(UMLPackage.BEHAVIOR__OWNED_PARAMETER);
				return ownedParameter != null && !ownedParameter.isEmpty();
			case UMLPackage.BEHAVIOR__CONTEXT :
				return basicGetContext() != null;
			case UMLPackage.BEHAVIOR__OWNED_PARAMETER_SET :
				List ownedParameterSet = (List) eVirtualGet(UMLPackage.BEHAVIOR__OWNED_PARAMETER_SET);
				return ownedParameterSet != null
					&& !ownedParameterSet.isEmpty();
			case UMLPackage.BEHAVIOR__SPECIFICATION :
				return eVirtualGet(UMLPackage.BEHAVIOR__SPECIFICATION) != null;
		}
		return eDynamicIsSet(featureID);
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
	public boolean isSetRedefinedElements() {
		return super.isSetRedefinedElements()
			|| eIsSet(UMLPackage.BEHAVIOR__REDEFINED_BEHAVIOR);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOwnedMembers() {
		return super.isSetOwnedMembers()
			|| eIsSet(UMLPackage.BEHAVIOR__OWNED_PARAMETER)
			|| eIsSet(UMLPackage.BEHAVIOR__OWNED_PARAMETER_SET);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRedefinitionContexts() {
		return super.isSetRedefinitionContexts()
			|| eIsSet(UMLPackage.BEHAVIOR__CONTEXT);
	}

} //BehaviorImpl
