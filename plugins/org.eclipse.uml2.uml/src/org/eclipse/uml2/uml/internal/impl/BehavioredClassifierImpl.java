/*
 * Copyright (c) 2005, 2007 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *
 * $Id: BehavioredClassifierImpl.java,v 1.31 2007/02/26 16:17:56 khussey Exp $
 */
package org.eclipse.uml2.uml.internal.impl;

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
import org.eclipse.uml2.common.util.SubsetSupersetEObjectContainmentEList;
import org.eclipse.uml2.common.util.SubsetSupersetEObjectContainmentWithInverseEList;
import org.eclipse.uml2.common.util.SubsetSupersetEObjectWithInverseResolvingEList;

import org.eclipse.uml2.uml.Behavior;
import org.eclipse.uml2.uml.BehavioredClassifier;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.CollaborationUse;
import org.eclipse.uml2.uml.Comment;
import org.eclipse.uml2.uml.Constraint;
import org.eclipse.uml2.uml.Dependency;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.ElementImport;
import org.eclipse.uml2.uml.Generalization;
import org.eclipse.uml2.uml.GeneralizationSet;
import org.eclipse.uml2.uml.Interface;
import org.eclipse.uml2.uml.InterfaceRealization;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.PackageImport;
import org.eclipse.uml2.uml.StringExpression;
import org.eclipse.uml2.uml.Substitution;
import org.eclipse.uml2.uml.TemplateBinding;
import org.eclipse.uml2.uml.TemplateParameter;
import org.eclipse.uml2.uml.TemplateSignature;
import org.eclipse.uml2.uml.Trigger;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.UseCase;
import org.eclipse.uml2.uml.VisibilityKind;

import org.eclipse.uml2.uml.internal.operations.BehavioredClassifierOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Behaviored Classifier</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.BehavioredClassifierImpl#getOwnedMembers <em>Owned Member</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.BehavioredClassifierImpl#getOwnedElements <em>Owned Element</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.BehavioredClassifierImpl#getOwnedBehaviors <em>Owned Behavior</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.BehavioredClassifierImpl#getClientDependencies <em>Client Dependency</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.BehavioredClassifierImpl#getClassifierBehavior <em>Classifier Behavior</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.BehavioredClassifierImpl#getInterfaceRealizations <em>Interface Realization</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.BehavioredClassifierImpl#getOwnedTriggers <em>Owned Trigger</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class BehavioredClassifierImpl
		extends ClassifierImpl
		implements BehavioredClassifier {

	/**
	 * The cached value of the '{@link #getOwnedBehaviors() <em>Owned Behavior</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedBehaviors()
	 * @generated
	 * @ordered
	 */
	protected EList<Behavior> ownedBehaviors;

	/**
	 * The cached value of the '{@link #getClassifierBehavior() <em>Classifier Behavior</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassifierBehavior()
	 * @generated
	 * @ordered
	 */
	protected Behavior classifierBehavior;

	/**
	 * The cached value of the '{@link #getInterfaceRealizations() <em>Interface Realization</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterfaceRealizations()
	 * @generated
	 * @ordered
	 */
	protected EList<InterfaceRealization> interfaceRealizations;

	/**
	 * The cached value of the '{@link #getOwnedTriggers() <em>Owned Trigger</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedTriggers()
	 * @generated
	 * @ordered
	 */
	protected EList<Trigger> ownedTriggers;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BehavioredClassifierImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UMLPackage.Literals.BEHAVIORED_CLASSIFIER;
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
						UMLPackage.BEHAVIORED_CLASSIFIER__OWNED_MEMBER,
						OWNED_MEMBER_ESUBSETS));
			}
			return ownedMembers;
		}
		return new DerivedUnionEObjectEList<NamedElement>(NamedElement.class,
			this, UMLPackage.BEHAVIORED_CLASSIFIER__OWNED_MEMBER,
			OWNED_MEMBER_ESUBSETS);
	}

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
			EList<Element> ownedElements = (EList<Element>) cache.get(
				eResource, this, UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
			if (ownedElements == null) {
				cache.put(eResource, this,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT,
					ownedElements = new DerivedUnionEObjectEList<Element>(
						Element.class, this,
						UMLPackage.BEHAVIORED_CLASSIFIER__OWNED_ELEMENT,
						OWNED_ELEMENT_ESUBSETS));
			}
			return ownedElements;
		}
		return new DerivedUnionEObjectEList<Element>(Element.class, this,
			UMLPackage.BEHAVIORED_CLASSIFIER__OWNED_ELEMENT,
			OWNED_ELEMENT_ESUBSETS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Behavior> getOwnedBehaviors() {
		if (ownedBehaviors == null) {
			ownedBehaviors = new SubsetSupersetEObjectContainmentEList.Resolving<Behavior>(
				Behavior.class, this,
				UMLPackage.BEHAVIORED_CLASSIFIER__OWNED_BEHAVIOR, null,
				OWNED_BEHAVIOR_ESUBSETS);
		}
		return ownedBehaviors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Behavior createOwnedBehavior(String name, EClass eClass) {
		Behavior newOwnedBehavior = (Behavior) create(eClass);
		getOwnedBehaviors().add(newOwnedBehavior);
		if (name != null)
			newOwnedBehavior.setName(name);
		return newOwnedBehavior;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Behavior getOwnedBehavior(String name) {
		return getOwnedBehavior(name, false, null, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Behavior getOwnedBehavior(String name, boolean ignoreCase,
			EClass eClass, boolean createOnDemand) {
		ownedBehaviorLoop : for (Behavior ownedBehavior : getOwnedBehaviors()) {
			if (eClass != null && !eClass.isInstance(ownedBehavior))
				continue ownedBehaviorLoop;
			if (name != null && !(ignoreCase
				? name.equalsIgnoreCase(ownedBehavior.getName())
				: name.equals(ownedBehavior.getName())))
				continue ownedBehaviorLoop;
			return ownedBehavior;
		}
		return createOnDemand && eClass != null
			? createOwnedBehavior(name, eClass)
			: null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Dependency> getClientDependencies() {
		if (clientDependencies == null) {
			clientDependencies = new SubsetSupersetEObjectWithInverseResolvingEList.ManyInverse<Dependency>(
				Dependency.class, this,
				UMLPackage.BEHAVIORED_CLASSIFIER__CLIENT_DEPENDENCY, null,
				CLIENT_DEPENDENCY_ESUBSETS, UMLPackage.DEPENDENCY__CLIENT);
		}
		return clientDependencies;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Behavior getClassifierBehavior() {
		if (classifierBehavior != null && classifierBehavior.eIsProxy()) {
			InternalEObject oldClassifierBehavior = (InternalEObject) classifierBehavior;
			classifierBehavior = (Behavior) eResolveProxy(oldClassifierBehavior);
			if (classifierBehavior != oldClassifierBehavior) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
						UMLPackage.BEHAVIORED_CLASSIFIER__CLASSIFIER_BEHAVIOR,
						oldClassifierBehavior, classifierBehavior));
			}
		}
		return classifierBehavior;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Behavior basicGetClassifierBehavior() {
		return classifierBehavior;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClassifierBehavior(Behavior newClassifierBehavior) {

		Behavior oldClassifierBehavior = classifierBehavior;
		classifierBehavior = newClassifierBehavior;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.BEHAVIORED_CLASSIFIER__CLASSIFIER_BEHAVIOR,
				oldClassifierBehavior, classifierBehavior));

		Resource.Internal eInternalResource = eInternalResource();
		if (eInternalResource == null || !eInternalResource.isLoading()) {
			if (newClassifierBehavior != null) {
				EList<Behavior> ownedBehaviors = getOwnedBehaviors();
				if (!ownedBehaviors.contains(newClassifierBehavior)) {
					ownedBehaviors.add(newClassifierBehavior);
				}
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Behavior createClassifierBehavior(String name, EClass eClass) {
		Behavior newClassifierBehavior = (Behavior) create(eClass);
		setClassifierBehavior(newClassifierBehavior);
		if (name != null)
			newClassifierBehavior.setName(name);
		return newClassifierBehavior;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InterfaceRealization> getInterfaceRealizations() {
		if (interfaceRealizations == null) {
			interfaceRealizations = new SubsetSupersetEObjectContainmentWithInverseEList.Resolving<InterfaceRealization>(
				InterfaceRealization.class, this,
				UMLPackage.BEHAVIORED_CLASSIFIER__INTERFACE_REALIZATION,
				INTERFACE_REALIZATION_ESUPERSETS, null,
				UMLPackage.INTERFACE_REALIZATION__IMPLEMENTING_CLASSIFIER);
		}
		return interfaceRealizations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterfaceRealization createInterfaceRealization(String name,
			Interface contract) {
		InterfaceRealization newInterfaceRealization = (InterfaceRealization) create(UMLPackage.Literals.INTERFACE_REALIZATION);
		getInterfaceRealizations().add(newInterfaceRealization);
		if (name != null)
			newInterfaceRealization.setName(name);
		if (contract != null)
			newInterfaceRealization.setContract(contract);
		return newInterfaceRealization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterfaceRealization getInterfaceRealization(String name,
			Interface contract) {
		return getInterfaceRealization(name, contract, false, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterfaceRealization getInterfaceRealization(String name,
			Interface contract, boolean ignoreCase, boolean createOnDemand) {
		interfaceRealizationLoop : for (InterfaceRealization interfaceRealization : getInterfaceRealizations()) {
			if (name != null && !(ignoreCase
				? name.equalsIgnoreCase(interfaceRealization.getName())
				: name.equals(interfaceRealization.getName())))
				continue interfaceRealizationLoop;
			if (contract != null
				&& !contract.equals(interfaceRealization.getContract()))
				continue interfaceRealizationLoop;
			return interfaceRealization;
		}
		return createOnDemand
			? createInterfaceRealization(name, contract)
			: null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Trigger> getOwnedTriggers() {
		if (ownedTriggers == null) {
			ownedTriggers = new EObjectContainmentEList.Resolving<Trigger>(
				Trigger.class, this,
				UMLPackage.BEHAVIORED_CLASSIFIER__OWNED_TRIGGER);
		}
		return ownedTriggers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Trigger createOwnedTrigger(String name) {
		Trigger newOwnedTrigger = (Trigger) create(UMLPackage.Literals.TRIGGER);
		getOwnedTriggers().add(newOwnedTrigger);
		if (name != null)
			newOwnedTrigger.setName(name);
		return newOwnedTrigger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Trigger getOwnedTrigger(String name) {
		return getOwnedTrigger(name, false, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Trigger getOwnedTrigger(String name, boolean ignoreCase,
			boolean createOnDemand) {
		ownedTriggerLoop : for (Trigger ownedTrigger : getOwnedTriggers()) {
			if (name != null && !(ignoreCase
				? name.equalsIgnoreCase(ownedTrigger.getName())
				: name.equals(ownedTrigger.getName())))
				continue ownedTriggerLoop;
			return ownedTrigger;
		}
		return createOnDemand
			? createOwnedTrigger(name)
			: null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClassBehavior(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return BehavioredClassifierOperations.validateClassBehavior(this,
			diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Interface> getImplementedInterfaces() {
		CacheAdapter cache = getCacheAdapter();
		if (cache != null) {
			@SuppressWarnings("unchecked")
			EList<Interface> result = (EList<Interface>) cache.get(this,
				UMLPackage.Literals.BEHAVIORED_CLASSIFIER.getEOperations().get(
					1));
			if (result == null) {
				cache.put(this, UMLPackage.Literals.BEHAVIORED_CLASSIFIER
					.getEOperations().get(1),
					result = BehavioredClassifierOperations
						.getImplementedInterfaces(this));
			}
			return result;
		}
		return BehavioredClassifierOperations.getImplementedInterfaces(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Interface> getAllImplementedInterfaces() {
		CacheAdapter cache = getCacheAdapter();
		if (cache != null) {
			@SuppressWarnings("unchecked")
			EList<Interface> result = (EList<Interface>) cache.get(this,
				UMLPackage.Literals.BEHAVIORED_CLASSIFIER.getEOperations().get(
					2));
			if (result == null) {
				cache.put(this, UMLPackage.Literals.BEHAVIORED_CLASSIFIER
					.getEOperations().get(2),
					result = BehavioredClassifierOperations
						.getAllImplementedInterfaces(this));
			}
			return result;
		}
		return BehavioredClassifierOperations.getAllImplementedInterfaces(this);
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
			case UMLPackage.BEHAVIORED_CLASSIFIER__EANNOTATIONS :
				return ((InternalEList<InternalEObject>) (InternalEList<?>) getEAnnotations())
					.basicAdd(otherEnd, msgs);
			case UMLPackage.BEHAVIORED_CLASSIFIER__CLIENT_DEPENDENCY :
				return ((InternalEList<InternalEObject>) (InternalEList<?>) getClientDependencies())
					.basicAdd(otherEnd, msgs);
			case UMLPackage.BEHAVIORED_CLASSIFIER__ELEMENT_IMPORT :
				return ((InternalEList<InternalEObject>) (InternalEList<?>) getElementImports())
					.basicAdd(otherEnd, msgs);
			case UMLPackage.BEHAVIORED_CLASSIFIER__PACKAGE_IMPORT :
				return ((InternalEList<InternalEObject>) (InternalEList<?>) getPackageImports())
					.basicAdd(otherEnd, msgs);
			case UMLPackage.BEHAVIORED_CLASSIFIER__OWNED_RULE :
				return ((InternalEList<InternalEObject>) (InternalEList<?>) getOwnedRules())
					.basicAdd(otherEnd, msgs);
			case UMLPackage.BEHAVIORED_CLASSIFIER__OWNING_TEMPLATE_PARAMETER :
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOwningTemplateParameter(
					(TemplateParameter) otherEnd, msgs);
			case UMLPackage.BEHAVIORED_CLASSIFIER__TEMPLATE_PARAMETER :
				if (templateParameter != null)
					msgs = ((InternalEObject) templateParameter)
						.eInverseRemove(this,
							UMLPackage.TEMPLATE_PARAMETER__PARAMETERED_ELEMENT,
							TemplateParameter.class, msgs);
				return basicSetTemplateParameter((TemplateParameter) otherEnd,
					msgs);
			case UMLPackage.BEHAVIORED_CLASSIFIER__TEMPLATE_BINDING :
				return ((InternalEList<InternalEObject>) (InternalEList<?>) getTemplateBindings())
					.basicAdd(otherEnd, msgs);
			case UMLPackage.BEHAVIORED_CLASSIFIER__OWNED_TEMPLATE_SIGNATURE :
				if (ownedTemplateSignature != null)
					msgs = ((InternalEObject) ownedTemplateSignature)
						.eInverseRemove(
							this,
							EOPPOSITE_FEATURE_BASE
								- UMLPackage.BEHAVIORED_CLASSIFIER__OWNED_TEMPLATE_SIGNATURE,
							null, msgs);
				return basicSetOwnedTemplateSignature(
					(TemplateSignature) otherEnd, msgs);
			case UMLPackage.BEHAVIORED_CLASSIFIER__GENERALIZATION :
				return ((InternalEList<InternalEObject>) (InternalEList<?>) getGeneralizations())
					.basicAdd(otherEnd, msgs);
			case UMLPackage.BEHAVIORED_CLASSIFIER__POWERTYPE_EXTENT :
				return ((InternalEList<InternalEObject>) (InternalEList<?>) getPowertypeExtents())
					.basicAdd(otherEnd, msgs);
			case UMLPackage.BEHAVIORED_CLASSIFIER__SUBSTITUTION :
				return ((InternalEList<InternalEObject>) (InternalEList<?>) getSubstitutions())
					.basicAdd(otherEnd, msgs);
			case UMLPackage.BEHAVIORED_CLASSIFIER__USE_CASE :
				return ((InternalEList<InternalEObject>) (InternalEList<?>) getUseCases())
					.basicAdd(otherEnd, msgs);
			case UMLPackage.BEHAVIORED_CLASSIFIER__INTERFACE_REALIZATION :
				return ((InternalEList<InternalEObject>) (InternalEList<?>) getInterfaceRealizations())
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
			case UMLPackage.BEHAVIORED_CLASSIFIER__EANNOTATIONS :
				return ((InternalEList<?>) getEAnnotations()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.BEHAVIORED_CLASSIFIER__OWNED_COMMENT :
				return ((InternalEList<?>) getOwnedComments()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.BEHAVIORED_CLASSIFIER__CLIENT_DEPENDENCY :
				return ((InternalEList<?>) getClientDependencies())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.BEHAVIORED_CLASSIFIER__NAME_EXPRESSION :
				return basicSetNameExpression(null, msgs);
			case UMLPackage.BEHAVIORED_CLASSIFIER__ELEMENT_IMPORT :
				return ((InternalEList<?>) getElementImports()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.BEHAVIORED_CLASSIFIER__PACKAGE_IMPORT :
				return ((InternalEList<?>) getPackageImports()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.BEHAVIORED_CLASSIFIER__OWNED_RULE :
				return ((InternalEList<?>) getOwnedRules()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.BEHAVIORED_CLASSIFIER__OWNING_TEMPLATE_PARAMETER :
				return basicSetOwningTemplateParameter(null, msgs);
			case UMLPackage.BEHAVIORED_CLASSIFIER__TEMPLATE_PARAMETER :
				return basicSetTemplateParameter(null, msgs);
			case UMLPackage.BEHAVIORED_CLASSIFIER__TEMPLATE_BINDING :
				return ((InternalEList<?>) getTemplateBindings()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.BEHAVIORED_CLASSIFIER__OWNED_TEMPLATE_SIGNATURE :
				return basicSetOwnedTemplateSignature(null, msgs);
			case UMLPackage.BEHAVIORED_CLASSIFIER__GENERALIZATION :
				return ((InternalEList<?>) getGeneralizations()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.BEHAVIORED_CLASSIFIER__POWERTYPE_EXTENT :
				return ((InternalEList<?>) getPowertypeExtents()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.BEHAVIORED_CLASSIFIER__SUBSTITUTION :
				return ((InternalEList<?>) getSubstitutions()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.BEHAVIORED_CLASSIFIER__COLLABORATION_USE :
				return ((InternalEList<?>) getCollaborationUses()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.BEHAVIORED_CLASSIFIER__OWNED_USE_CASE :
				return ((InternalEList<?>) getOwnedUseCases()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.BEHAVIORED_CLASSIFIER__USE_CASE :
				return ((InternalEList<?>) getUseCases()).basicRemove(otherEnd,
					msgs);
			case UMLPackage.BEHAVIORED_CLASSIFIER__OWNED_BEHAVIOR :
				return ((InternalEList<?>) getOwnedBehaviors()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.BEHAVIORED_CLASSIFIER__INTERFACE_REALIZATION :
				return ((InternalEList<?>) getInterfaceRealizations())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.BEHAVIORED_CLASSIFIER__OWNED_TRIGGER :
				return ((InternalEList<?>) getOwnedTriggers()).basicRemove(
					otherEnd, msgs);
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
			case UMLPackage.BEHAVIORED_CLASSIFIER__EANNOTATIONS :
				return getEAnnotations();
			case UMLPackage.BEHAVIORED_CLASSIFIER__OWNED_ELEMENT :
				return getOwnedElements();
			case UMLPackage.BEHAVIORED_CLASSIFIER__OWNER :
				if (resolve)
					return getOwner();
				return basicGetOwner();
			case UMLPackage.BEHAVIORED_CLASSIFIER__OWNED_COMMENT :
				return getOwnedComments();
			case UMLPackage.BEHAVIORED_CLASSIFIER__NAME :
				return getName();
			case UMLPackage.BEHAVIORED_CLASSIFIER__VISIBILITY :
				return getVisibility();
			case UMLPackage.BEHAVIORED_CLASSIFIER__QUALIFIED_NAME :
				return getQualifiedName();
			case UMLPackage.BEHAVIORED_CLASSIFIER__CLIENT_DEPENDENCY :
				return getClientDependencies();
			case UMLPackage.BEHAVIORED_CLASSIFIER__NAMESPACE :
				if (resolve)
					return getNamespace();
				return basicGetNamespace();
			case UMLPackage.BEHAVIORED_CLASSIFIER__NAME_EXPRESSION :
				if (resolve)
					return getNameExpression();
				return basicGetNameExpression();
			case UMLPackage.BEHAVIORED_CLASSIFIER__ELEMENT_IMPORT :
				return getElementImports();
			case UMLPackage.BEHAVIORED_CLASSIFIER__PACKAGE_IMPORT :
				return getPackageImports();
			case UMLPackage.BEHAVIORED_CLASSIFIER__OWNED_RULE :
				return getOwnedRules();
			case UMLPackage.BEHAVIORED_CLASSIFIER__MEMBER :
				return getMembers();
			case UMLPackage.BEHAVIORED_CLASSIFIER__IMPORTED_MEMBER :
				return getImportedMembers();
			case UMLPackage.BEHAVIORED_CLASSIFIER__OWNED_MEMBER :
				return getOwnedMembers();
			case UMLPackage.BEHAVIORED_CLASSIFIER__IS_LEAF :
				return isLeaf()
					? Boolean.TRUE
					: Boolean.FALSE;
			case UMLPackage.BEHAVIORED_CLASSIFIER__REDEFINED_ELEMENT :
				return getRedefinedElements();
			case UMLPackage.BEHAVIORED_CLASSIFIER__REDEFINITION_CONTEXT :
				return getRedefinitionContexts();
			case UMLPackage.BEHAVIORED_CLASSIFIER__OWNING_TEMPLATE_PARAMETER :
				if (resolve)
					return getOwningTemplateParameter();
				return basicGetOwningTemplateParameter();
			case UMLPackage.BEHAVIORED_CLASSIFIER__TEMPLATE_PARAMETER :
				if (resolve)
					return getTemplateParameter();
				return basicGetTemplateParameter();
			case UMLPackage.BEHAVIORED_CLASSIFIER__PACKAGE :
				if (resolve)
					return getPackage();
				return basicGetPackage();
			case UMLPackage.BEHAVIORED_CLASSIFIER__TEMPLATE_BINDING :
				return getTemplateBindings();
			case UMLPackage.BEHAVIORED_CLASSIFIER__OWNED_TEMPLATE_SIGNATURE :
				if (resolve)
					return getOwnedTemplateSignature();
				return basicGetOwnedTemplateSignature();
			case UMLPackage.BEHAVIORED_CLASSIFIER__IS_ABSTRACT :
				return isAbstract()
					? Boolean.TRUE
					: Boolean.FALSE;
			case UMLPackage.BEHAVIORED_CLASSIFIER__GENERALIZATION :
				return getGeneralizations();
			case UMLPackage.BEHAVIORED_CLASSIFIER__POWERTYPE_EXTENT :
				return getPowertypeExtents();
			case UMLPackage.BEHAVIORED_CLASSIFIER__FEATURE :
				return getFeatures();
			case UMLPackage.BEHAVIORED_CLASSIFIER__INHERITED_MEMBER :
				return getInheritedMembers();
			case UMLPackage.BEHAVIORED_CLASSIFIER__REDEFINED_CLASSIFIER :
				return getRedefinedClassifiers();
			case UMLPackage.BEHAVIORED_CLASSIFIER__GENERAL :
				return getGenerals();
			case UMLPackage.BEHAVIORED_CLASSIFIER__SUBSTITUTION :
				return getSubstitutions();
			case UMLPackage.BEHAVIORED_CLASSIFIER__ATTRIBUTE :
				return getAttributes();
			case UMLPackage.BEHAVIORED_CLASSIFIER__REPRESENTATION :
				if (resolve)
					return getRepresentation();
				return basicGetRepresentation();
			case UMLPackage.BEHAVIORED_CLASSIFIER__COLLABORATION_USE :
				return getCollaborationUses();
			case UMLPackage.BEHAVIORED_CLASSIFIER__OWNED_USE_CASE :
				return getOwnedUseCases();
			case UMLPackage.BEHAVIORED_CLASSIFIER__USE_CASE :
				return getUseCases();
			case UMLPackage.BEHAVIORED_CLASSIFIER__OWNED_BEHAVIOR :
				return getOwnedBehaviors();
			case UMLPackage.BEHAVIORED_CLASSIFIER__CLASSIFIER_BEHAVIOR :
				if (resolve)
					return getClassifierBehavior();
				return basicGetClassifierBehavior();
			case UMLPackage.BEHAVIORED_CLASSIFIER__INTERFACE_REALIZATION :
				return getInterfaceRealizations();
			case UMLPackage.BEHAVIORED_CLASSIFIER__OWNED_TRIGGER :
				return getOwnedTriggers();
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
			case UMLPackage.BEHAVIORED_CLASSIFIER__EANNOTATIONS :
				getEAnnotations().clear();
				getEAnnotations().addAll(
					(Collection<? extends EAnnotation>) newValue);
				return;
			case UMLPackage.BEHAVIORED_CLASSIFIER__OWNED_COMMENT :
				getOwnedComments().clear();
				getOwnedComments().addAll(
					(Collection<? extends Comment>) newValue);
				return;
			case UMLPackage.BEHAVIORED_CLASSIFIER__NAME :
				setName((String) newValue);
				return;
			case UMLPackage.BEHAVIORED_CLASSIFIER__VISIBILITY :
				setVisibility((VisibilityKind) newValue);
				return;
			case UMLPackage.BEHAVIORED_CLASSIFIER__CLIENT_DEPENDENCY :
				getClientDependencies().clear();
				getClientDependencies().addAll(
					(Collection<? extends Dependency>) newValue);
				return;
			case UMLPackage.BEHAVIORED_CLASSIFIER__NAME_EXPRESSION :
				setNameExpression((StringExpression) newValue);
				return;
			case UMLPackage.BEHAVIORED_CLASSIFIER__ELEMENT_IMPORT :
				getElementImports().clear();
				getElementImports().addAll(
					(Collection<? extends ElementImport>) newValue);
				return;
			case UMLPackage.BEHAVIORED_CLASSIFIER__PACKAGE_IMPORT :
				getPackageImports().clear();
				getPackageImports().addAll(
					(Collection<? extends PackageImport>) newValue);
				return;
			case UMLPackage.BEHAVIORED_CLASSIFIER__OWNED_RULE :
				getOwnedRules().clear();
				getOwnedRules().addAll(
					(Collection<? extends Constraint>) newValue);
				return;
			case UMLPackage.BEHAVIORED_CLASSIFIER__IS_LEAF :
				setIsLeaf(((Boolean) newValue).booleanValue());
				return;
			case UMLPackage.BEHAVIORED_CLASSIFIER__OWNING_TEMPLATE_PARAMETER :
				setOwningTemplateParameter((TemplateParameter) newValue);
				return;
			case UMLPackage.BEHAVIORED_CLASSIFIER__TEMPLATE_PARAMETER :
				setTemplateParameter((TemplateParameter) newValue);
				return;
			case UMLPackage.BEHAVIORED_CLASSIFIER__PACKAGE :
				setPackage((org.eclipse.uml2.uml.Package) newValue);
				return;
			case UMLPackage.BEHAVIORED_CLASSIFIER__TEMPLATE_BINDING :
				getTemplateBindings().clear();
				getTemplateBindings().addAll(
					(Collection<? extends TemplateBinding>) newValue);
				return;
			case UMLPackage.BEHAVIORED_CLASSIFIER__OWNED_TEMPLATE_SIGNATURE :
				setOwnedTemplateSignature((TemplateSignature) newValue);
				return;
			case UMLPackage.BEHAVIORED_CLASSIFIER__IS_ABSTRACT :
				setIsAbstract(((Boolean) newValue).booleanValue());
				return;
			case UMLPackage.BEHAVIORED_CLASSIFIER__GENERALIZATION :
				getGeneralizations().clear();
				getGeneralizations().addAll(
					(Collection<? extends Generalization>) newValue);
				return;
			case UMLPackage.BEHAVIORED_CLASSIFIER__POWERTYPE_EXTENT :
				getPowertypeExtents().clear();
				getPowertypeExtents().addAll(
					(Collection<? extends GeneralizationSet>) newValue);
				return;
			case UMLPackage.BEHAVIORED_CLASSIFIER__REDEFINED_CLASSIFIER :
				getRedefinedClassifiers().clear();
				getRedefinedClassifiers().addAll(
					(Collection<? extends Classifier>) newValue);
				return;
			case UMLPackage.BEHAVIORED_CLASSIFIER__GENERAL :
				getGenerals().clear();
				getGenerals().addAll(
					(Collection<? extends Classifier>) newValue);
				return;
			case UMLPackage.BEHAVIORED_CLASSIFIER__SUBSTITUTION :
				getSubstitutions().clear();
				getSubstitutions().addAll(
					(Collection<? extends Substitution>) newValue);
				return;
			case UMLPackage.BEHAVIORED_CLASSIFIER__REPRESENTATION :
				setRepresentation((CollaborationUse) newValue);
				return;
			case UMLPackage.BEHAVIORED_CLASSIFIER__COLLABORATION_USE :
				getCollaborationUses().clear();
				getCollaborationUses().addAll(
					(Collection<? extends CollaborationUse>) newValue);
				return;
			case UMLPackage.BEHAVIORED_CLASSIFIER__OWNED_USE_CASE :
				getOwnedUseCases().clear();
				getOwnedUseCases().addAll(
					(Collection<? extends UseCase>) newValue);
				return;
			case UMLPackage.BEHAVIORED_CLASSIFIER__USE_CASE :
				getUseCases().clear();
				getUseCases().addAll((Collection<? extends UseCase>) newValue);
				return;
			case UMLPackage.BEHAVIORED_CLASSIFIER__OWNED_BEHAVIOR :
				getOwnedBehaviors().clear();
				getOwnedBehaviors().addAll(
					(Collection<? extends Behavior>) newValue);
				return;
			case UMLPackage.BEHAVIORED_CLASSIFIER__CLASSIFIER_BEHAVIOR :
				setClassifierBehavior((Behavior) newValue);
				return;
			case UMLPackage.BEHAVIORED_CLASSIFIER__INTERFACE_REALIZATION :
				getInterfaceRealizations().clear();
				getInterfaceRealizations().addAll(
					(Collection<? extends InterfaceRealization>) newValue);
				return;
			case UMLPackage.BEHAVIORED_CLASSIFIER__OWNED_TRIGGER :
				getOwnedTriggers().clear();
				getOwnedTriggers().addAll(
					(Collection<? extends Trigger>) newValue);
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
			case UMLPackage.BEHAVIORED_CLASSIFIER__EANNOTATIONS :
				getEAnnotations().clear();
				return;
			case UMLPackage.BEHAVIORED_CLASSIFIER__OWNED_COMMENT :
				getOwnedComments().clear();
				return;
			case UMLPackage.BEHAVIORED_CLASSIFIER__NAME :
				unsetName();
				return;
			case UMLPackage.BEHAVIORED_CLASSIFIER__VISIBILITY :
				unsetVisibility();
				return;
			case UMLPackage.BEHAVIORED_CLASSIFIER__CLIENT_DEPENDENCY :
				getClientDependencies().clear();
				return;
			case UMLPackage.BEHAVIORED_CLASSIFIER__NAME_EXPRESSION :
				setNameExpression((StringExpression) null);
				return;
			case UMLPackage.BEHAVIORED_CLASSIFIER__ELEMENT_IMPORT :
				getElementImports().clear();
				return;
			case UMLPackage.BEHAVIORED_CLASSIFIER__PACKAGE_IMPORT :
				getPackageImports().clear();
				return;
			case UMLPackage.BEHAVIORED_CLASSIFIER__OWNED_RULE :
				getOwnedRules().clear();
				return;
			case UMLPackage.BEHAVIORED_CLASSIFIER__IS_LEAF :
				setIsLeaf(IS_LEAF_EDEFAULT);
				return;
			case UMLPackage.BEHAVIORED_CLASSIFIER__OWNING_TEMPLATE_PARAMETER :
				setOwningTemplateParameter((TemplateParameter) null);
				return;
			case UMLPackage.BEHAVIORED_CLASSIFIER__TEMPLATE_PARAMETER :
				setTemplateParameter((TemplateParameter) null);
				return;
			case UMLPackage.BEHAVIORED_CLASSIFIER__PACKAGE :
				setPackage((org.eclipse.uml2.uml.Package) null);
				return;
			case UMLPackage.BEHAVIORED_CLASSIFIER__TEMPLATE_BINDING :
				getTemplateBindings().clear();
				return;
			case UMLPackage.BEHAVIORED_CLASSIFIER__OWNED_TEMPLATE_SIGNATURE :
				setOwnedTemplateSignature((TemplateSignature) null);
				return;
			case UMLPackage.BEHAVIORED_CLASSIFIER__IS_ABSTRACT :
				setIsAbstract(IS_ABSTRACT_EDEFAULT);
				return;
			case UMLPackage.BEHAVIORED_CLASSIFIER__GENERALIZATION :
				getGeneralizations().clear();
				return;
			case UMLPackage.BEHAVIORED_CLASSIFIER__POWERTYPE_EXTENT :
				getPowertypeExtents().clear();
				return;
			case UMLPackage.BEHAVIORED_CLASSIFIER__REDEFINED_CLASSIFIER :
				getRedefinedClassifiers().clear();
				return;
			case UMLPackage.BEHAVIORED_CLASSIFIER__GENERAL :
				getGenerals().clear();
				return;
			case UMLPackage.BEHAVIORED_CLASSIFIER__SUBSTITUTION :
				getSubstitutions().clear();
				return;
			case UMLPackage.BEHAVIORED_CLASSIFIER__REPRESENTATION :
				setRepresentation((CollaborationUse) null);
				return;
			case UMLPackage.BEHAVIORED_CLASSIFIER__COLLABORATION_USE :
				getCollaborationUses().clear();
				return;
			case UMLPackage.BEHAVIORED_CLASSIFIER__OWNED_USE_CASE :
				getOwnedUseCases().clear();
				return;
			case UMLPackage.BEHAVIORED_CLASSIFIER__USE_CASE :
				getUseCases().clear();
				return;
			case UMLPackage.BEHAVIORED_CLASSIFIER__OWNED_BEHAVIOR :
				getOwnedBehaviors().clear();
				return;
			case UMLPackage.BEHAVIORED_CLASSIFIER__CLASSIFIER_BEHAVIOR :
				setClassifierBehavior((Behavior) null);
				return;
			case UMLPackage.BEHAVIORED_CLASSIFIER__INTERFACE_REALIZATION :
				getInterfaceRealizations().clear();
				return;
			case UMLPackage.BEHAVIORED_CLASSIFIER__OWNED_TRIGGER :
				getOwnedTriggers().clear();
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
			case UMLPackage.BEHAVIORED_CLASSIFIER__EANNOTATIONS :
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UMLPackage.BEHAVIORED_CLASSIFIER__OWNED_ELEMENT :
				return isSetOwnedElements();
			case UMLPackage.BEHAVIORED_CLASSIFIER__OWNER :
				return isSetOwner();
			case UMLPackage.BEHAVIORED_CLASSIFIER__OWNED_COMMENT :
				return ownedComments != null && !ownedComments.isEmpty();
			case UMLPackage.BEHAVIORED_CLASSIFIER__NAME :
				return isSetName();
			case UMLPackage.BEHAVIORED_CLASSIFIER__VISIBILITY :
				return isSetVisibility();
			case UMLPackage.BEHAVIORED_CLASSIFIER__QUALIFIED_NAME :
				return QUALIFIED_NAME_EDEFAULT == null
					? getQualifiedName() != null
					: !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case UMLPackage.BEHAVIORED_CLASSIFIER__CLIENT_DEPENDENCY :
				return clientDependencies != null
					&& !clientDependencies.isEmpty();
			case UMLPackage.BEHAVIORED_CLASSIFIER__NAMESPACE :
				return isSetNamespace();
			case UMLPackage.BEHAVIORED_CLASSIFIER__NAME_EXPRESSION :
				return nameExpression != null;
			case UMLPackage.BEHAVIORED_CLASSIFIER__ELEMENT_IMPORT :
				return elementImports != null && !elementImports.isEmpty();
			case UMLPackage.BEHAVIORED_CLASSIFIER__PACKAGE_IMPORT :
				return packageImports != null && !packageImports.isEmpty();
			case UMLPackage.BEHAVIORED_CLASSIFIER__OWNED_RULE :
				return ownedRules != null && !ownedRules.isEmpty();
			case UMLPackage.BEHAVIORED_CLASSIFIER__MEMBER :
				return isSetMembers();
			case UMLPackage.BEHAVIORED_CLASSIFIER__IMPORTED_MEMBER :
				return !getImportedMembers().isEmpty();
			case UMLPackage.BEHAVIORED_CLASSIFIER__OWNED_MEMBER :
				return isSetOwnedMembers();
			case UMLPackage.BEHAVIORED_CLASSIFIER__IS_LEAF :
				return ((eFlags & IS_LEAF_EFLAG) != 0) != IS_LEAF_EDEFAULT;
			case UMLPackage.BEHAVIORED_CLASSIFIER__REDEFINED_ELEMENT :
				return isSetRedefinedElements();
			case UMLPackage.BEHAVIORED_CLASSIFIER__REDEFINITION_CONTEXT :
				return isSetRedefinitionContexts();
			case UMLPackage.BEHAVIORED_CLASSIFIER__OWNING_TEMPLATE_PARAMETER :
				return basicGetOwningTemplateParameter() != null;
			case UMLPackage.BEHAVIORED_CLASSIFIER__TEMPLATE_PARAMETER :
				return isSetTemplateParameter();
			case UMLPackage.BEHAVIORED_CLASSIFIER__PACKAGE :
				return basicGetPackage() != null;
			case UMLPackage.BEHAVIORED_CLASSIFIER__TEMPLATE_BINDING :
				return templateBindings != null && !templateBindings.isEmpty();
			case UMLPackage.BEHAVIORED_CLASSIFIER__OWNED_TEMPLATE_SIGNATURE :
				return isSetOwnedTemplateSignature();
			case UMLPackage.BEHAVIORED_CLASSIFIER__IS_ABSTRACT :
				return ((eFlags & IS_ABSTRACT_EFLAG) != 0) != IS_ABSTRACT_EDEFAULT;
			case UMLPackage.BEHAVIORED_CLASSIFIER__GENERALIZATION :
				return generalizations != null && !generalizations.isEmpty();
			case UMLPackage.BEHAVIORED_CLASSIFIER__POWERTYPE_EXTENT :
				return powertypeExtents != null && !powertypeExtents.isEmpty();
			case UMLPackage.BEHAVIORED_CLASSIFIER__FEATURE :
				return isSetFeatures();
			case UMLPackage.BEHAVIORED_CLASSIFIER__INHERITED_MEMBER :
				return !getInheritedMembers().isEmpty();
			case UMLPackage.BEHAVIORED_CLASSIFIER__REDEFINED_CLASSIFIER :
				return redefinedClassifiers != null
					&& !redefinedClassifiers.isEmpty();
			case UMLPackage.BEHAVIORED_CLASSIFIER__GENERAL :
				return !getGenerals().isEmpty();
			case UMLPackage.BEHAVIORED_CLASSIFIER__SUBSTITUTION :
				return substitutions != null && !substitutions.isEmpty();
			case UMLPackage.BEHAVIORED_CLASSIFIER__ATTRIBUTE :
				return isSetAttributes();
			case UMLPackage.BEHAVIORED_CLASSIFIER__REPRESENTATION :
				return representation != null;
			case UMLPackage.BEHAVIORED_CLASSIFIER__COLLABORATION_USE :
				return collaborationUses != null
					&& !collaborationUses.isEmpty();
			case UMLPackage.BEHAVIORED_CLASSIFIER__OWNED_USE_CASE :
				return ownedUseCases != null && !ownedUseCases.isEmpty();
			case UMLPackage.BEHAVIORED_CLASSIFIER__USE_CASE :
				return useCases != null && !useCases.isEmpty();
			case UMLPackage.BEHAVIORED_CLASSIFIER__OWNED_BEHAVIOR :
				return ownedBehaviors != null && !ownedBehaviors.isEmpty();
			case UMLPackage.BEHAVIORED_CLASSIFIER__CLASSIFIER_BEHAVIOR :
				return classifierBehavior != null;
			case UMLPackage.BEHAVIORED_CLASSIFIER__INTERFACE_REALIZATION :
				return interfaceRealizations != null
					&& !interfaceRealizations.isEmpty();
			case UMLPackage.BEHAVIORED_CLASSIFIER__OWNED_TRIGGER :
				return ownedTriggers != null && !ownedTriggers.isEmpty();
		}
		return eDynamicIsSet(featureID);
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
		UMLPackage.BEHAVIORED_CLASSIFIER__OWNED_RULE,
		UMLPackage.BEHAVIORED_CLASSIFIER__OWNED_USE_CASE,
		UMLPackage.BEHAVIORED_CLASSIFIER__OWNED_BEHAVIOR,
		UMLPackage.BEHAVIORED_CLASSIFIER__OWNED_TRIGGER};

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetOwnedMembers() {
		return super.isSetOwnedMembers()
			|| eIsSet(UMLPackage.BEHAVIORED_CLASSIFIER__OWNED_BEHAVIOR)
			|| eIsSet(UMLPackage.BEHAVIORED_CLASSIFIER__OWNED_TRIGGER);
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
		UMLPackage.BEHAVIORED_CLASSIFIER__OWNED_COMMENT,
		UMLPackage.BEHAVIORED_CLASSIFIER__NAME_EXPRESSION,
		UMLPackage.BEHAVIORED_CLASSIFIER__ELEMENT_IMPORT,
		UMLPackage.BEHAVIORED_CLASSIFIER__PACKAGE_IMPORT,
		UMLPackage.BEHAVIORED_CLASSIFIER__OWNED_MEMBER,
		UMLPackage.BEHAVIORED_CLASSIFIER__TEMPLATE_BINDING,
		UMLPackage.BEHAVIORED_CLASSIFIER__OWNED_TEMPLATE_SIGNATURE,
		UMLPackage.BEHAVIORED_CLASSIFIER__GENERALIZATION,
		UMLPackage.BEHAVIORED_CLASSIFIER__SUBSTITUTION,
		UMLPackage.BEHAVIORED_CLASSIFIER__COLLABORATION_USE,
		UMLPackage.BEHAVIORED_CLASSIFIER__INTERFACE_REALIZATION};

	/**
	 * The array of subset feature identifiers for the '{@link #getOwnedBehaviors() <em>Owned Behavior</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedBehaviors()
	 * @generated
	 * @ordered
	 */
	protected static final int[] OWNED_BEHAVIOR_ESUBSETS = new int[]{UMLPackage.BEHAVIORED_CLASSIFIER__CLASSIFIER_BEHAVIOR};

	/**
	 * The array of subset feature identifiers for the '{@link #getClientDependencies() <em>Client Dependency</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClientDependencies()
	 * @generated
	 * @ordered
	 */
	protected static final int[] CLIENT_DEPENDENCY_ESUBSETS = new int[]{
		UMLPackage.BEHAVIORED_CLASSIFIER__SUBSTITUTION,
		UMLPackage.BEHAVIORED_CLASSIFIER__INTERFACE_REALIZATION};

	/**
	 * The array of superset feature identifiers for the '{@link #getInterfaceRealizations() <em>Interface Realization</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterfaceRealizations()
	 * @generated
	 * @ordered
	 */
	protected static final int[] INTERFACE_REALIZATION_ESUPERSETS = new int[]{UMLPackage.BEHAVIORED_CLASSIFIER__CLIENT_DEPENDENCY};

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetOwnedElements() {
		return super.isSetOwnedElements()
			|| eIsSet(UMLPackage.BEHAVIORED_CLASSIFIER__INTERFACE_REALIZATION);
	}

} //BehavioredClassifierImpl
