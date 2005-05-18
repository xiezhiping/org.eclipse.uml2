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
 * $Id: BehavioredClassifierImpl.java,v 1.18 2005/05/18 16:38:27 khussey Exp $
 */
package org.eclipse.uml2.impl;

import java.lang.reflect.Method;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.uml2.Behavior;
import org.eclipse.uml2.BehavioredClassifier;
import org.eclipse.uml2.CollaborationOccurrence;
import org.eclipse.uml2.Dependency;
import org.eclipse.uml2.Implementation;
import org.eclipse.uml2.Interface;
import org.eclipse.uml2.StateMachine;
import org.eclipse.uml2.StringExpression;
import org.eclipse.uml2.TemplateParameter;
import org.eclipse.uml2.TemplateSignature;
import org.eclipse.uml2.Trigger;
import org.eclipse.uml2.UML2Factory;
import org.eclipse.uml2.UML2Package;
import org.eclipse.uml2.VisibilityKind;

import org.eclipse.uml2.common.util.SubsetEObjectContainmentWithInverseEList;
import org.eclipse.uml2.common.util.SupersetEObjectContainmentWithInverseEList;
import org.eclipse.uml2.common.util.SupersetEObjectWithInverseResolvingEList;

import org.eclipse.uml2.internal.operation.BehavioredClassifierOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Behaviored Classifier</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2.impl.BehavioredClassifierImpl#getClientDependencies <em>Client Dependency</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.BehavioredClassifierImpl#getClassifierBehavior <em>Classifier Behavior</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.BehavioredClassifierImpl#getImplementations <em>Implementation</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.BehavioredClassifierImpl#getOwnedTriggers <em>Owned Trigger</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.BehavioredClassifierImpl#getOwnedStateMachines <em>Owned State Machine</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class BehavioredClassifierImpl extends ClassifierImpl implements BehavioredClassifier {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) IBM Corporation and others."; //$NON-NLS-1$

	/**
	 * The cached value of the '{@link #getOwnedBehaviors() <em>Owned Behavior</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedBehaviors()
	 * @generated NOT
	 * @ordered
	 */
	protected EList ownedBehavior = null;

	/**
	 * The cached value of the '{@link #getClassifierBehavior() <em>Classifier Behavior</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassifierBehavior()
	 * @generated
	 * @ordered
	 */
	protected Behavior classifierBehavior = null;

	/**
	 * The cached value of the '{@link #getImplementations() <em>Implementation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImplementations()
	 * @generated
	 * @ordered
	 */
	protected EList implementation = null;

	/**
	 * The cached value of the '{@link #getOwnedTriggers() <em>Owned Trigger</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedTriggers()
	 * @generated
	 * @ordered
	 */
	protected EList ownedTrigger = null;

	/**
	 * The cached value of the '{@link #getOwnedStateMachines() <em>Owned State Machine</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedStateMachines()
	 * @generated NOT
	 * @ordered
	 */
	protected EList ownedStateMachine = null;

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
	protected EClass eStaticClass() {
		return UML2Package.eINSTANCE.getBehavioredClassifier();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList getOwnedBehaviors() {
		if (ownedBehavior == null) {
			ownedBehavior = new SupersetEObjectContainmentWithInverseEList(Behavior.class, this, UML2Package.BEHAVIORED_CLASSIFIER__OWNED_BEHAVIOR, new int[] {UML2Package.BEHAVIORED_CLASSIFIER__CLASSIFIER_BEHAVIOR}, UML2Package.BEHAVIOR__CONTEXT);
		}
		return ownedBehavior;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
    public Behavior getOwnedBehavior(String name) {
		for (Iterator i = getOwnedBehaviors().iterator(); i.hasNext(); ) {
			Behavior ownedBehavior = (Behavior) i.next();
			if (name.equals(ownedBehavior.getName())) {
				return ownedBehavior;
			}
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Behavior createOwnedBehavior(EClass eClass) {
		Behavior newOwnedBehavior = (Behavior) eClass.getEPackage().getEFactoryInstance().create(eClass);
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, 0, UML2Package.BEHAVIORED_CLASSIFIER__OWNED_BEHAVIOR, null, newOwnedBehavior));
		}
		getOwnedBehaviors().add(newOwnedBehavior);
		return newOwnedBehavior;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Behavior getClassifierBehavior() {
		return classifierBehavior;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClassifierBehavior(Behavior newClassifierBehavior) {
		if (newClassifierBehavior != null && !getOwnedBehaviors().contains(newClassifierBehavior)) {
			getOwnedBehaviors().add(newClassifierBehavior);
		}
		Behavior oldClassifierBehavior = classifierBehavior;
		classifierBehavior = newClassifierBehavior;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2Package.BEHAVIORED_CLASSIFIER__CLASSIFIER_BEHAVIOR, oldClassifierBehavior, classifierBehavior));

	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getImplementations() {
		if (implementation == null) {
			implementation = new SubsetEObjectContainmentWithInverseEList(Implementation.class, this, UML2Package.BEHAVIORED_CLASSIFIER__IMPLEMENTATION, new int[] {UML2Package.BEHAVIORED_CLASSIFIER__CLIENT_DEPENDENCY}, UML2Package.IMPLEMENTATION__IMPLEMENTING_CLASSIFIER);
		}
		return implementation;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
    public Implementation getImplementation(String name) {
		for (Iterator i = getImplementations().iterator(); i.hasNext(); ) {
			Implementation implementation = (Implementation) i.next();
			if (name.equals(implementation.getName())) {
				return implementation;
			}
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 * @deprecated Use #createImplementation() instead.
	 */
	public Implementation createImplementation(EClass eClass) {
		Implementation newImplementation = (Implementation) eClass.getEPackage().getEFactoryInstance().create(eClass);
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, 0, UML2Package.BEHAVIORED_CLASSIFIER__IMPLEMENTATION, null, newImplementation));
		}
		getImplementations().add(newImplementation);
		return newImplementation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Implementation createImplementation() {
		Implementation newImplementation = UML2Factory.eINSTANCE.createImplementation();
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, 0, UML2Package.BEHAVIORED_CLASSIFIER__IMPLEMENTATION, null, newImplementation));
		}
		getImplementations().add(newImplementation);
		return newImplementation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getOwnedTriggers() {
		if (ownedTrigger == null) {
			ownedTrigger = new EObjectContainmentEList(Trigger.class, this, UML2Package.BEHAVIORED_CLASSIFIER__OWNED_TRIGGER);
		}
		return ownedTrigger;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
    public Trigger getOwnedTrigger(String name) {
		for (Iterator i = getOwnedTriggers().iterator(); i.hasNext(); ) {
			Trigger ownedTrigger = (Trigger) i.next();
			if (name.equals(ownedTrigger.getName())) {
				return ownedTrigger;
			}
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Trigger createOwnedTrigger(EClass eClass) {
		Trigger newOwnedTrigger = (Trigger) eClass.getEPackage().getEFactoryInstance().create(eClass);
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, 0, UML2Package.BEHAVIORED_CLASSIFIER__OWNED_TRIGGER, null, newOwnedTrigger));
		}
		getOwnedTriggers().add(newOwnedTrigger);
		return newOwnedTrigger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList getOwnedStateMachines() {
		if (ownedStateMachine == null) {
			ownedStateMachine = new EObjectContainmentWithInverseEList(StateMachine.class, this, UML2Package.BEHAVIORED_CLASSIFIER__OWNED_STATE_MACHINE, UML2Package.STATE_MACHINE__STATE_MACHINE_REDEFINITION_CONTEXT);
		}
		return ownedStateMachine;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
    public StateMachine getOwnedStateMachine(String name) {
		for (Iterator i = getOwnedStateMachines().iterator(); i.hasNext(); ) {
			StateMachine ownedStateMachine = (StateMachine) i.next();
			if (name.equals(ownedStateMachine.getName())) {
				return ownedStateMachine;
			}
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StateMachine createOwnedStateMachine(EClass eClass) {
		StateMachine newOwnedStateMachine = (StateMachine) eClass.getEPackage().getEFactoryInstance().create(eClass);
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, 0, UML2Package.BEHAVIORED_CLASSIFIER__OWNED_STATE_MACHINE, null, newOwnedStateMachine));
		}
		getOwnedStateMachines().add(newOwnedStateMachine);
		return newOwnedStateMachine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StateMachine createOwnedStateMachine() {
		StateMachine newOwnedStateMachine = UML2Factory.eINSTANCE.createStateMachine();
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, 0, UML2Package.BEHAVIORED_CLASSIFIER__OWNED_STATE_MACHINE, null, newOwnedStateMachine));
		}
		getOwnedStateMachines().add(newOwnedStateMachine);
		return newOwnedStateMachine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getClientDependencies() {
		if (clientDependency == null) {
			clientDependency = new SupersetEObjectWithInverseResolvingEList.ManyInverse(Dependency.class, this, UML2Package.BEHAVIORED_CLASSIFIER__CLIENT_DEPENDENCY, new int[] {UML2Package.BEHAVIORED_CLASSIFIER__SUBSTITUTION, UML2Package.BEHAVIORED_CLASSIFIER__IMPLEMENTATION}, UML2Package.DEPENDENCY__CLIENT);
		}
		return clientDependency;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, Class baseClass, NotificationChain msgs) {
		if (featureID >= 0) {
			switch (eDerivedStructuralFeatureID(featureID, baseClass)) {
				case UML2Package.BEHAVIORED_CLASSIFIER__EANNOTATIONS:
					return ((InternalEList)getEAnnotations()).basicAdd(otherEnd, msgs);
				case UML2Package.BEHAVIORED_CLASSIFIER__TEMPLATE_BINDING:
					return ((InternalEList)getTemplateBindings()).basicAdd(otherEnd, msgs);
				case UML2Package.BEHAVIORED_CLASSIFIER__OWNED_TEMPLATE_SIGNATURE:
					if (ownedTemplateSignature != null)
						msgs = ((InternalEObject)ownedTemplateSignature).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UML2Package.BEHAVIORED_CLASSIFIER__OWNED_TEMPLATE_SIGNATURE, null, msgs);
					return basicSetOwnedTemplateSignature((TemplateSignature)otherEnd, msgs);
				case UML2Package.BEHAVIORED_CLASSIFIER__CLIENT_DEPENDENCY:
					return ((InternalEList)getClientDependencies()).basicAdd(otherEnd, msgs);
				case UML2Package.BEHAVIORED_CLASSIFIER__OWNED_RULE:
					return ((InternalEList)getOwnedRules()).basicAdd(otherEnd, msgs);
				case UML2Package.BEHAVIORED_CLASSIFIER__ELEMENT_IMPORT:
					return ((InternalEList)getElementImports()).basicAdd(otherEnd, msgs);
				case UML2Package.BEHAVIORED_CLASSIFIER__PACKAGE_IMPORT:
					return ((InternalEList)getPackageImports()).basicAdd(otherEnd, msgs);
				case UML2Package.BEHAVIORED_CLASSIFIER__TEMPLATE_PARAMETER:
					if (templateParameter != null)
						msgs = ((InternalEObject)templateParameter).eInverseRemove(this, UML2Package.TEMPLATE_PARAMETER__PARAMETERED_ELEMENT, TemplateParameter.class, msgs);
					return basicSetTemplateParameter((TemplateParameter)otherEnd, msgs);
				case UML2Package.BEHAVIORED_CLASSIFIER__OWNING_PARAMETER:
					if (eContainer != null)
						msgs = eBasicRemoveFromContainer(msgs);
					return eBasicSetContainer(otherEnd, UML2Package.BEHAVIORED_CLASSIFIER__OWNING_PARAMETER, msgs);
				case UML2Package.BEHAVIORED_CLASSIFIER__GENERALIZATION:
					return ((InternalEList)getGeneralizations()).basicAdd(otherEnd, msgs);
				case UML2Package.BEHAVIORED_CLASSIFIER__SUBSTITUTION:
					return ((InternalEList)getSubstitutions()).basicAdd(otherEnd, msgs);
				case UML2Package.BEHAVIORED_CLASSIFIER__POWERTYPE_EXTENT:
					return ((InternalEList)getPowertypeExtents()).basicAdd(otherEnd, msgs);
				case UML2Package.BEHAVIORED_CLASSIFIER__USE_CASE:
					return ((InternalEList)getUseCases()).basicAdd(otherEnd, msgs);
				case UML2Package.BEHAVIORED_CLASSIFIER__OWNED_BEHAVIOR:
					return ((InternalEList)getOwnedBehaviors()).basicAdd(otherEnd, msgs);
				case UML2Package.BEHAVIORED_CLASSIFIER__IMPLEMENTATION:
					return ((InternalEList)getImplementations()).basicAdd(otherEnd, msgs);
				default:
					return eDynamicInverseAdd(otherEnd, featureID, baseClass, msgs);
			}
		}
		if (eContainer != null)
			msgs = eBasicRemoveFromContainer(msgs);
		return eBasicSetContainer(otherEnd, featureID, msgs);
	}

	public NotificationChain eDynamicInverseAdd(InternalEObject otherEnd, int featureID, Class inverseClass, NotificationChain msgs) {
		switch (eDerivedStructuralFeatureID(featureID, inverseClass)) {
			case UML2Package.BEHAVIORED_CLASSIFIER__OWNED_STATE_MACHINE:
				return ((InternalEList)getOwnedStateMachines()).basicAdd(otherEnd, msgs);
			default :
				return super.eDynamicInverseAdd(otherEnd, featureID, inverseClass, msgs);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, Class baseClass, NotificationChain msgs) {
		if (featureID >= 0) {
			switch (eDerivedStructuralFeatureID(featureID, baseClass)) {
				case UML2Package.BEHAVIORED_CLASSIFIER__EANNOTATIONS:
					return ((InternalEList)getEAnnotations()).basicRemove(otherEnd, msgs);
				case UML2Package.BEHAVIORED_CLASSIFIER__OWNED_COMMENT:
					return ((InternalEList)getOwnedComments()).basicRemove(otherEnd, msgs);
				case UML2Package.BEHAVIORED_CLASSIFIER__TEMPLATE_BINDING:
					return ((InternalEList)getTemplateBindings()).basicRemove(otherEnd, msgs);
				case UML2Package.BEHAVIORED_CLASSIFIER__OWNED_TEMPLATE_SIGNATURE:
					return basicSetOwnedTemplateSignature(null, msgs);
				case UML2Package.BEHAVIORED_CLASSIFIER__CLIENT_DEPENDENCY:
					return ((InternalEList)getClientDependencies()).basicRemove(otherEnd, msgs);
				case UML2Package.BEHAVIORED_CLASSIFIER__NAME_EXPRESSION:
					return basicSetNameExpression(null, msgs);
				case UML2Package.BEHAVIORED_CLASSIFIER__OWNED_RULE:
					return ((InternalEList)getOwnedRules()).basicRemove(otherEnd, msgs);
				case UML2Package.BEHAVIORED_CLASSIFIER__ELEMENT_IMPORT:
					return ((InternalEList)getElementImports()).basicRemove(otherEnd, msgs);
				case UML2Package.BEHAVIORED_CLASSIFIER__PACKAGE_IMPORT:
					return ((InternalEList)getPackageImports()).basicRemove(otherEnd, msgs);
				case UML2Package.BEHAVIORED_CLASSIFIER__TEMPLATE_PARAMETER:
					return basicSetTemplateParameter(null, msgs);
				case UML2Package.BEHAVIORED_CLASSIFIER__OWNING_PARAMETER:
					return eBasicSetContainer(null, UML2Package.BEHAVIORED_CLASSIFIER__OWNING_PARAMETER, msgs);
				case UML2Package.BEHAVIORED_CLASSIFIER__GENERALIZATION:
					return ((InternalEList)getGeneralizations()).basicRemove(otherEnd, msgs);
				case UML2Package.BEHAVIORED_CLASSIFIER__SUBSTITUTION:
					return ((InternalEList)getSubstitutions()).basicRemove(otherEnd, msgs);
				case UML2Package.BEHAVIORED_CLASSIFIER__POWERTYPE_EXTENT:
					return ((InternalEList)getPowertypeExtents()).basicRemove(otherEnd, msgs);
				case UML2Package.BEHAVIORED_CLASSIFIER__OWNED_USE_CASE:
					return ((InternalEList)getOwnedUseCases()).basicRemove(otherEnd, msgs);
				case UML2Package.BEHAVIORED_CLASSIFIER__USE_CASE:
					return ((InternalEList)getUseCases()).basicRemove(otherEnd, msgs);
				case UML2Package.BEHAVIORED_CLASSIFIER__OCCURRENCE:
					return ((InternalEList)getOccurrences()).basicRemove(otherEnd, msgs);
				case UML2Package.BEHAVIORED_CLASSIFIER__OWNED_BEHAVIOR:
					return ((InternalEList)getOwnedBehaviors()).basicRemove(otherEnd, msgs);
				case UML2Package.BEHAVIORED_CLASSIFIER__IMPLEMENTATION:
					return ((InternalEList)getImplementations()).basicRemove(otherEnd, msgs);
				case UML2Package.BEHAVIORED_CLASSIFIER__OWNED_TRIGGER:
					return ((InternalEList)getOwnedTriggers()).basicRemove(otherEnd, msgs);
				case UML2Package.BEHAVIORED_CLASSIFIER__OWNED_STATE_MACHINE:
					return ((InternalEList)getOwnedStateMachines()).basicRemove(otherEnd, msgs);
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
	public NotificationChain eBasicRemoveFromContainer(NotificationChain msgs) {
		if (eContainerFeatureID >= 0) {
			switch (eContainerFeatureID) {
				case UML2Package.BEHAVIORED_CLASSIFIER__OWNING_PARAMETER:
					return eContainer.eInverseRemove(this, UML2Package.TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT, TemplateParameter.class, msgs);
				default:
					return eDynamicBasicRemoveFromContainer(msgs);
			}
		}
		return eContainer.eInverseRemove(this, EOPPOSITE_FEATURE_BASE - eContainerFeatureID, null, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(EStructuralFeature eFeature, boolean resolve) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case UML2Package.BEHAVIORED_CLASSIFIER__EANNOTATIONS:
				return getEAnnotations();
			case UML2Package.BEHAVIORED_CLASSIFIER__OWNED_ELEMENT:
				return getOwnedElements();
			case UML2Package.BEHAVIORED_CLASSIFIER__OWNER:
				if (resolve) return getOwner();
				return basicGetOwner();
			case UML2Package.BEHAVIORED_CLASSIFIER__OWNED_COMMENT:
				return getOwnedComments();
			case UML2Package.BEHAVIORED_CLASSIFIER__TEMPLATE_BINDING:
				return getTemplateBindings();
			case UML2Package.BEHAVIORED_CLASSIFIER__OWNED_TEMPLATE_SIGNATURE:
				return getOwnedTemplateSignature();
			case UML2Package.BEHAVIORED_CLASSIFIER__NAME:
				return getName();
			case UML2Package.BEHAVIORED_CLASSIFIER__QUALIFIED_NAME:
				return getQualifiedName();
			case UML2Package.BEHAVIORED_CLASSIFIER__VISIBILITY:
				return getVisibility();
			case UML2Package.BEHAVIORED_CLASSIFIER__CLIENT_DEPENDENCY:
				return getClientDependencies();
			case UML2Package.BEHAVIORED_CLASSIFIER__NAME_EXPRESSION:
				return getNameExpression();
			case UML2Package.BEHAVIORED_CLASSIFIER__MEMBER:
				return getMembers();
			case UML2Package.BEHAVIORED_CLASSIFIER__OWNED_RULE:
				return getOwnedRules();
			case UML2Package.BEHAVIORED_CLASSIFIER__IMPORTED_MEMBER:
				return getImportedMembers();
			case UML2Package.BEHAVIORED_CLASSIFIER__ELEMENT_IMPORT:
				return getElementImports();
			case UML2Package.BEHAVIORED_CLASSIFIER__PACKAGE_IMPORT:
				return getPackageImports();
			case UML2Package.BEHAVIORED_CLASSIFIER__TEMPLATE_PARAMETER:
				if (resolve) return getTemplateParameter();
				return basicGetTemplateParameter();
			case UML2Package.BEHAVIORED_CLASSIFIER__OWNING_PARAMETER:
				return getOwningParameter();
			case UML2Package.BEHAVIORED_CLASSIFIER__PACKAGEABLE_ELEMENT_VISIBILITY:
				return getPackageableElement_visibility();
			case UML2Package.BEHAVIORED_CLASSIFIER__PACKAGE:
				if (resolve) return getPackage();
				return basicGetPackage();
			case UML2Package.BEHAVIORED_CLASSIFIER__REDEFINITION_CONTEXT:
				return getRedefinitionContexts();
			case UML2Package.BEHAVIORED_CLASSIFIER__IS_LEAF:
				return isLeaf() ? Boolean.TRUE : Boolean.FALSE;
			case UML2Package.BEHAVIORED_CLASSIFIER__FEATURE:
				return getFeatures();
			case UML2Package.BEHAVIORED_CLASSIFIER__IS_ABSTRACT:
				return isAbstract() ? Boolean.TRUE : Boolean.FALSE;
			case UML2Package.BEHAVIORED_CLASSIFIER__INHERITED_MEMBER:
				return getInheritedMembers();
			case UML2Package.BEHAVIORED_CLASSIFIER__GENERAL:
				return getGenerals();
			case UML2Package.BEHAVIORED_CLASSIFIER__GENERALIZATION:
				return getGeneralizations();
			case UML2Package.BEHAVIORED_CLASSIFIER__ATTRIBUTE:
				return getAttributes();
			case UML2Package.BEHAVIORED_CLASSIFIER__REDEFINED_CLASSIFIER:
				return getRedefinedClassifiers();
			case UML2Package.BEHAVIORED_CLASSIFIER__SUBSTITUTION:
				return getSubstitutions();
			case UML2Package.BEHAVIORED_CLASSIFIER__POWERTYPE_EXTENT:
				return getPowertypeExtents();
			case UML2Package.BEHAVIORED_CLASSIFIER__OWNED_USE_CASE:
				return getOwnedUseCases();
			case UML2Package.BEHAVIORED_CLASSIFIER__USE_CASE:
				return getUseCases();
			case UML2Package.BEHAVIORED_CLASSIFIER__REPRESENTATION:
				return getRepresentation();
			case UML2Package.BEHAVIORED_CLASSIFIER__OCCURRENCE:
				return getOccurrences();
			case UML2Package.BEHAVIORED_CLASSIFIER__OWNED_BEHAVIOR:
				return getOwnedBehaviors();
			case UML2Package.BEHAVIORED_CLASSIFIER__CLASSIFIER_BEHAVIOR:
				return getClassifierBehavior();
			case UML2Package.BEHAVIORED_CLASSIFIER__IMPLEMENTATION:
				return getImplementations();
			case UML2Package.BEHAVIORED_CLASSIFIER__OWNED_TRIGGER:
				return getOwnedTriggers();
			case UML2Package.BEHAVIORED_CLASSIFIER__OWNED_STATE_MACHINE:
				return getOwnedStateMachines();
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
			case UML2Package.BEHAVIORED_CLASSIFIER__EANNOTATIONS:
				getEAnnotations().clear();
				getEAnnotations().addAll((Collection)newValue);
				return;
			case UML2Package.BEHAVIORED_CLASSIFIER__OWNED_COMMENT:
				getOwnedComments().clear();
				getOwnedComments().addAll((Collection)newValue);
				return;
			case UML2Package.BEHAVIORED_CLASSIFIER__TEMPLATE_BINDING:
				getTemplateBindings().clear();
				getTemplateBindings().addAll((Collection)newValue);
				return;
			case UML2Package.BEHAVIORED_CLASSIFIER__OWNED_TEMPLATE_SIGNATURE:
				setOwnedTemplateSignature((TemplateSignature)newValue);
				return;
			case UML2Package.BEHAVIORED_CLASSIFIER__NAME:
				setName((String)newValue);
				return;
			case UML2Package.BEHAVIORED_CLASSIFIER__VISIBILITY:
				setVisibility((VisibilityKind)newValue);
				return;
			case UML2Package.BEHAVIORED_CLASSIFIER__CLIENT_DEPENDENCY:
				getClientDependencies().clear();
				getClientDependencies().addAll((Collection)newValue);
				return;
			case UML2Package.BEHAVIORED_CLASSIFIER__NAME_EXPRESSION:
				setNameExpression((StringExpression)newValue);
				return;
			case UML2Package.BEHAVIORED_CLASSIFIER__OWNED_RULE:
				getOwnedRules().clear();
				getOwnedRules().addAll((Collection)newValue);
				return;
			case UML2Package.BEHAVIORED_CLASSIFIER__ELEMENT_IMPORT:
				getElementImports().clear();
				getElementImports().addAll((Collection)newValue);
				return;
			case UML2Package.BEHAVIORED_CLASSIFIER__PACKAGE_IMPORT:
				getPackageImports().clear();
				getPackageImports().addAll((Collection)newValue);
				return;
			case UML2Package.BEHAVIORED_CLASSIFIER__TEMPLATE_PARAMETER:
				setTemplateParameter((TemplateParameter)newValue);
				return;
			case UML2Package.BEHAVIORED_CLASSIFIER__OWNING_PARAMETER:
				setOwningParameter((TemplateParameter)newValue);
				return;
			case UML2Package.BEHAVIORED_CLASSIFIER__PACKAGEABLE_ELEMENT_VISIBILITY:
				setPackageableElement_visibility((VisibilityKind)newValue);
				return;
			case UML2Package.BEHAVIORED_CLASSIFIER__IS_LEAF:
				setIsLeaf(((Boolean)newValue).booleanValue());
				return;
			case UML2Package.BEHAVIORED_CLASSIFIER__IS_ABSTRACT:
				setIsAbstract(((Boolean)newValue).booleanValue());
				return;
			case UML2Package.BEHAVIORED_CLASSIFIER__GENERALIZATION:
				getGeneralizations().clear();
				getGeneralizations().addAll((Collection)newValue);
				return;
			case UML2Package.BEHAVIORED_CLASSIFIER__REDEFINED_CLASSIFIER:
				getRedefinedClassifiers().clear();
				getRedefinedClassifiers().addAll((Collection)newValue);
				return;
			case UML2Package.BEHAVIORED_CLASSIFIER__SUBSTITUTION:
				getSubstitutions().clear();
				getSubstitutions().addAll((Collection)newValue);
				return;
			case UML2Package.BEHAVIORED_CLASSIFIER__POWERTYPE_EXTENT:
				getPowertypeExtents().clear();
				getPowertypeExtents().addAll((Collection)newValue);
				return;
			case UML2Package.BEHAVIORED_CLASSIFIER__OWNED_USE_CASE:
				getOwnedUseCases().clear();
				getOwnedUseCases().addAll((Collection)newValue);
				return;
			case UML2Package.BEHAVIORED_CLASSIFIER__USE_CASE:
				getUseCases().clear();
				getUseCases().addAll((Collection)newValue);
				return;
			case UML2Package.BEHAVIORED_CLASSIFIER__REPRESENTATION:
				setRepresentation((CollaborationOccurrence)newValue);
				return;
			case UML2Package.BEHAVIORED_CLASSIFIER__OCCURRENCE:
				getOccurrences().clear();
				getOccurrences().addAll((Collection)newValue);
				return;
			case UML2Package.BEHAVIORED_CLASSIFIER__OWNED_BEHAVIOR:
				getOwnedBehaviors().clear();
				getOwnedBehaviors().addAll((Collection)newValue);
				return;
			case UML2Package.BEHAVIORED_CLASSIFIER__CLASSIFIER_BEHAVIOR:
				setClassifierBehavior((Behavior)newValue);
				return;
			case UML2Package.BEHAVIORED_CLASSIFIER__IMPLEMENTATION:
				getImplementations().clear();
				getImplementations().addAll((Collection)newValue);
				return;
			case UML2Package.BEHAVIORED_CLASSIFIER__OWNED_TRIGGER:
				getOwnedTriggers().clear();
				getOwnedTriggers().addAll((Collection)newValue);
				return;
			case UML2Package.BEHAVIORED_CLASSIFIER__OWNED_STATE_MACHINE:
				getOwnedStateMachines().clear();
				getOwnedStateMachines().addAll((Collection)newValue);
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
			case UML2Package.BEHAVIORED_CLASSIFIER__EANNOTATIONS:
				getEAnnotations().clear();
				return;
			case UML2Package.BEHAVIORED_CLASSIFIER__OWNED_COMMENT:
				getOwnedComments().clear();
				return;
			case UML2Package.BEHAVIORED_CLASSIFIER__TEMPLATE_BINDING:
				getTemplateBindings().clear();
				return;
			case UML2Package.BEHAVIORED_CLASSIFIER__OWNED_TEMPLATE_SIGNATURE:
				setOwnedTemplateSignature((TemplateSignature)null);
				return;
			case UML2Package.BEHAVIORED_CLASSIFIER__NAME:
				setName(NAME_EDEFAULT);
				return;
			case UML2Package.BEHAVIORED_CLASSIFIER__VISIBILITY:
				setVisibility(VISIBILITY_EDEFAULT);
				return;
			case UML2Package.BEHAVIORED_CLASSIFIER__CLIENT_DEPENDENCY:
				getClientDependencies().clear();
				return;
			case UML2Package.BEHAVIORED_CLASSIFIER__NAME_EXPRESSION:
				setNameExpression((StringExpression)null);
				return;
			case UML2Package.BEHAVIORED_CLASSIFIER__OWNED_RULE:
				getOwnedRules().clear();
				return;
			case UML2Package.BEHAVIORED_CLASSIFIER__ELEMENT_IMPORT:
				getElementImports().clear();
				return;
			case UML2Package.BEHAVIORED_CLASSIFIER__PACKAGE_IMPORT:
				getPackageImports().clear();
				return;
			case UML2Package.BEHAVIORED_CLASSIFIER__TEMPLATE_PARAMETER:
				setTemplateParameter((TemplateParameter)null);
				return;
			case UML2Package.BEHAVIORED_CLASSIFIER__OWNING_PARAMETER:
				setOwningParameter((TemplateParameter)null);
				return;
			case UML2Package.BEHAVIORED_CLASSIFIER__PACKAGEABLE_ELEMENT_VISIBILITY:
				setPackageableElement_visibility(PACKAGEABLE_ELEMENT_VISIBILITY_EDEFAULT);
				return;
			case UML2Package.BEHAVIORED_CLASSIFIER__IS_LEAF:
				setIsLeaf(IS_LEAF_EDEFAULT);
				return;
			case UML2Package.BEHAVIORED_CLASSIFIER__IS_ABSTRACT:
				setIsAbstract(IS_ABSTRACT_EDEFAULT);
				return;
			case UML2Package.BEHAVIORED_CLASSIFIER__GENERALIZATION:
				getGeneralizations().clear();
				return;
			case UML2Package.BEHAVIORED_CLASSIFIER__REDEFINED_CLASSIFIER:
				getRedefinedClassifiers().clear();
				return;
			case UML2Package.BEHAVIORED_CLASSIFIER__SUBSTITUTION:
				getSubstitutions().clear();
				return;
			case UML2Package.BEHAVIORED_CLASSIFIER__POWERTYPE_EXTENT:
				getPowertypeExtents().clear();
				return;
			case UML2Package.BEHAVIORED_CLASSIFIER__OWNED_USE_CASE:
				getOwnedUseCases().clear();
				return;
			case UML2Package.BEHAVIORED_CLASSIFIER__USE_CASE:
				getUseCases().clear();
				return;
			case UML2Package.BEHAVIORED_CLASSIFIER__REPRESENTATION:
				setRepresentation((CollaborationOccurrence)null);
				return;
			case UML2Package.BEHAVIORED_CLASSIFIER__OCCURRENCE:
				getOccurrences().clear();
				return;
			case UML2Package.BEHAVIORED_CLASSIFIER__OWNED_BEHAVIOR:
				getOwnedBehaviors().clear();
				return;
			case UML2Package.BEHAVIORED_CLASSIFIER__CLASSIFIER_BEHAVIOR:
				setClassifierBehavior((Behavior)null);
				return;
			case UML2Package.BEHAVIORED_CLASSIFIER__IMPLEMENTATION:
				getImplementations().clear();
				return;
			case UML2Package.BEHAVIORED_CLASSIFIER__OWNED_TRIGGER:
				getOwnedTriggers().clear();
				return;
			case UML2Package.BEHAVIORED_CLASSIFIER__OWNED_STATE_MACHINE:
				getOwnedStateMachines().clear();
				return;
		}
		eDynamicUnset(eFeature);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean eIsSetGen(EStructuralFeature eFeature) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case UML2Package.BEHAVIORED_CLASSIFIER__EANNOTATIONS:
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UML2Package.BEHAVIORED_CLASSIFIER__OWNED_ELEMENT:
				return !getOwnedElements().isEmpty();
			case UML2Package.BEHAVIORED_CLASSIFIER__OWNER:
				return basicGetOwner() != null;
			case UML2Package.BEHAVIORED_CLASSIFIER__OWNED_COMMENT:
				return ownedComment != null && !ownedComment.isEmpty();
			case UML2Package.BEHAVIORED_CLASSIFIER__TEMPLATE_BINDING:
				return templateBinding != null && !templateBinding.isEmpty();
			case UML2Package.BEHAVIORED_CLASSIFIER__OWNED_TEMPLATE_SIGNATURE:
				return ownedTemplateSignature != null;
			case UML2Package.BEHAVIORED_CLASSIFIER__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case UML2Package.BEHAVIORED_CLASSIFIER__QUALIFIED_NAME:
				return QUALIFIED_NAME_EDEFAULT == null ? getQualifiedName() != null : !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case UML2Package.BEHAVIORED_CLASSIFIER__VISIBILITY:
				return getVisibility() != VISIBILITY_EDEFAULT;
			case UML2Package.BEHAVIORED_CLASSIFIER__CLIENT_DEPENDENCY:
				return clientDependency != null && !clientDependency.isEmpty();
			case UML2Package.BEHAVIORED_CLASSIFIER__NAME_EXPRESSION:
				return nameExpression != null;
			case UML2Package.BEHAVIORED_CLASSIFIER__MEMBER:
				return !getMembers().isEmpty();
			case UML2Package.BEHAVIORED_CLASSIFIER__OWNED_RULE:
				return ownedRule != null && !ownedRule.isEmpty();
			case UML2Package.BEHAVIORED_CLASSIFIER__IMPORTED_MEMBER:
				return !getImportedMembers().isEmpty();
			case UML2Package.BEHAVIORED_CLASSIFIER__ELEMENT_IMPORT:
				return elementImport != null && !elementImport.isEmpty();
			case UML2Package.BEHAVIORED_CLASSIFIER__PACKAGE_IMPORT:
				return packageImport != null && !packageImport.isEmpty();
			case UML2Package.BEHAVIORED_CLASSIFIER__TEMPLATE_PARAMETER:
				return templateParameter != null;
			case UML2Package.BEHAVIORED_CLASSIFIER__OWNING_PARAMETER:
				return getOwningParameter() != null;
			case UML2Package.BEHAVIORED_CLASSIFIER__PACKAGEABLE_ELEMENT_VISIBILITY:
				return getPackageableElement_visibility() != PACKAGEABLE_ELEMENT_VISIBILITY_EDEFAULT;
			case UML2Package.BEHAVIORED_CLASSIFIER__PACKAGE:
				return basicGetPackage() != null;
			case UML2Package.BEHAVIORED_CLASSIFIER__REDEFINITION_CONTEXT:
				return !getRedefinitionContexts().isEmpty();
			case UML2Package.BEHAVIORED_CLASSIFIER__IS_LEAF:
				return ((eFlags & IS_LEAF_EFLAG) != 0) != IS_LEAF_EDEFAULT;
			case UML2Package.BEHAVIORED_CLASSIFIER__FEATURE:
				return !getFeatures().isEmpty();
			case UML2Package.BEHAVIORED_CLASSIFIER__IS_ABSTRACT:
				return ((eFlags & IS_ABSTRACT_EFLAG) != 0) != IS_ABSTRACT_EDEFAULT;
			case UML2Package.BEHAVIORED_CLASSIFIER__INHERITED_MEMBER:
				return !getInheritedMembers().isEmpty();
			case UML2Package.BEHAVIORED_CLASSIFIER__GENERAL:
				return !getGenerals().isEmpty();
			case UML2Package.BEHAVIORED_CLASSIFIER__GENERALIZATION:
				return generalization != null && !generalization.isEmpty();
			case UML2Package.BEHAVIORED_CLASSIFIER__ATTRIBUTE:
				return !getAttributes().isEmpty();
			case UML2Package.BEHAVIORED_CLASSIFIER__REDEFINED_CLASSIFIER:
				return redefinedClassifier != null && !redefinedClassifier.isEmpty();
			case UML2Package.BEHAVIORED_CLASSIFIER__SUBSTITUTION:
				return substitution != null && !substitution.isEmpty();
			case UML2Package.BEHAVIORED_CLASSIFIER__POWERTYPE_EXTENT:
				return powertypeExtent != null && !powertypeExtent.isEmpty();
			case UML2Package.BEHAVIORED_CLASSIFIER__OWNED_USE_CASE:
				return ownedUseCase != null && !ownedUseCase.isEmpty();
			case UML2Package.BEHAVIORED_CLASSIFIER__USE_CASE:
				return useCase != null && !useCase.isEmpty();
			case UML2Package.BEHAVIORED_CLASSIFIER__REPRESENTATION:
				return representation != null;
			case UML2Package.BEHAVIORED_CLASSIFIER__OCCURRENCE:
				return occurrence != null && !occurrence.isEmpty();
			case UML2Package.BEHAVIORED_CLASSIFIER__OWNED_BEHAVIOR:
				return !getOwnedBehaviors().isEmpty();
			case UML2Package.BEHAVIORED_CLASSIFIER__CLASSIFIER_BEHAVIOR:
				return classifierBehavior != null;
			case UML2Package.BEHAVIORED_CLASSIFIER__IMPLEMENTATION:
				return implementation != null && !implementation.isEmpty();
			case UML2Package.BEHAVIORED_CLASSIFIER__OWNED_TRIGGER:
				return ownedTrigger != null && !ownedTrigger.isEmpty();
			case UML2Package.BEHAVIORED_CLASSIFIER__OWNED_STATE_MACHINE:
				return !getOwnedStateMachines().isEmpty();
		}
		return eDynamicIsSet(eFeature);
	}


	public boolean eIsSet(EStructuralFeature eFeature) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case UML2Package.BEHAVIORED_CLASSIFIER__VISIBILITY:
				return false;
			case UML2Package.BEHAVIORED_CLASSIFIER__PACKAGEABLE_ELEMENT_VISIBILITY:
				return visibility != PACKAGEABLE_ELEMENT_VISIBILITY_EDEFAULT;
			case UML2Package.BEHAVIORED_CLASSIFIER__OWNED_BEHAVIOR:
				return ownedBehavior != null && !ownedBehavior.isEmpty();
			case UML2Package.BEHAVIORED_CLASSIFIER__OWNED_STATE_MACHINE:
				return ownedStateMachine != null && !ownedStateMachine.isEmpty();
		}
		return eIsSetGen(eFeature);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EList getOwnedMembersHelper(EList ownedMember) {
		super.getOwnedMembersHelper(ownedMember);
		ownedMember.addAll(getOwnedBehaviors());
		if (ownedTrigger != null) {
			ownedMember.addAll(ownedTrigger);
		}
		return ownedMember;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EList getOwnedElementsHelper(EList ownedElement) {
		super.getOwnedElementsHelper(ownedElement);
		if (implementation != null) {
			ownedElement.addAll(implementation);
		}
		return ownedElement;
	}


	// <!-- begin-custom-operations -->

	private static Method GET_IMPLEMENTED_INTERFACES_METHOD = null;

	static {
		try {
			GET_IMPLEMENTED_INTERFACES_METHOD = BehavioredClassifierImpl.class
				.getMethod("getImplementedInterfaces", null); //$NON-NLS-1$
		} catch (Exception e) {
			// ignore
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.uml2.BehavioredClassifier#getImplementedInterfaces()
	 */
	public Set getImplementedInterfaces() {
		Set implementedInterfaces = (Set) getCacheAdapter().get(eResource(),
			this, GET_IMPLEMENTED_INTERFACES_METHOD);

		if (null == implementedInterfaces) {
			implementedInterfaces = BehavioredClassifierOperations
				.getImplementedInterfaces(this);
			getCacheAdapter().put(eResource(), this,
				GET_IMPLEMENTED_INTERFACES_METHOD, implementedInterfaces);
		}

		return implementedInterfaces;
	}

	private static Method GET_ALL_IMPLEMENTED_INTERFACES_METHOD = null;

	static {
		try {
			GET_ALL_IMPLEMENTED_INTERFACES_METHOD = BehavioredClassifierImpl.class
				.getMethod("getAllImplementedInterfaces", null); //$NON-NLS-1$
		} catch (Exception e) {
			// ignore
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.uml2.BehavioredClassifier#getAllImplementedInterfaces()
	 */
	public Set getAllImplementedInterfaces() {
		Set allImplementedInterfaces = (Set) getCacheAdapter().get(eResource(),
			this, GET_ALL_IMPLEMENTED_INTERFACES_METHOD);

		if (null == allImplementedInterfaces) {
			allImplementedInterfaces = BehavioredClassifierOperations
				.getAllImplementedInterfaces(this);
			getCacheAdapter()
				.put(eResource(), this, GET_ALL_IMPLEMENTED_INTERFACES_METHOD,
					allImplementedInterfaces);
		}

		return allImplementedInterfaces;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.uml2.BehavioredClassifier#createImplementation(org.eclipse.uml2.Interface)
	 */
	public Implementation createImplementation(Interface contract) {
		return BehavioredClassifierOperations.createImplementation(this,
			contract);
	}
	
	// <!-- end-custom-operations -->

} //BehavioredClassifierImpl
