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
 * $Id: ClassImpl.java,v 1.26 2006/02/22 23:07:14 khussey Exp $
 */
package org.eclipse.uml2.uml.internal.impl;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.uml2.common.util.CacheAdapter;
import org.eclipse.uml2.common.util.DerivedSubsetEObjectEList;
import org.eclipse.uml2.common.util.DerivedUnionEObjectEList;
import org.eclipse.uml2.common.util.SubsetSupersetEObjectContainmentEList;
import org.eclipse.uml2.common.util.SubsetSupersetEObjectContainmentWithInverseEList;
import org.eclipse.uml2.common.util.SubsetSupersetEObjectWithInverseResolvingEList;

import org.eclipse.uml2.uml.Behavior;
import org.eclipse.uml2.uml.BehavioredClassifier;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.CollaborationUse;
import org.eclipse.uml2.uml.Dependency;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Extension;
import org.eclipse.uml2.uml.Feature;
import org.eclipse.uml2.uml.Interface;
import org.eclipse.uml2.uml.Generalization;
import org.eclipse.uml2.uml.InterfaceRealization;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Operation;
import org.eclipse.uml2.uml.Parameter;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.Reception;
import org.eclipse.uml2.uml.StringExpression;
import org.eclipse.uml2.uml.TemplateParameter;
import org.eclipse.uml2.uml.TemplateSignature;
import org.eclipse.uml2.uml.Trigger;
import org.eclipse.uml2.uml.Type;
import org.eclipse.uml2.uml.UMLFactory;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.VisibilityKind;

import org.eclipse.uml2.uml.internal.operations.BehavioredClassifierOperations;
import org.eclipse.uml2.uml.internal.operations.ClassOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Class</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ClassImpl#getOwnedMembers <em>Owned Member</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ClassImpl#getOwnedElements <em>Owned Element</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ClassImpl#getOwnedBehaviors <em>Owned Behavior</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ClassImpl#getClientDependencies <em>Client Dependency</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ClassImpl#getClassifierBehavior <em>Classifier Behavior</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ClassImpl#getInterfaceRealizations <em>Interface Realization</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ClassImpl#getOwnedTriggers <em>Owned Trigger</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ClassImpl#getFeatures <em>Feature</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ClassImpl#getAttributes <em>Attribute</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ClassImpl#getNestedClassifiers <em>Nested Classifier</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ClassImpl#getOwnedOperations <em>Owned Operation</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ClassImpl#getSuperClasses <em>Super Class</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ClassImpl#isActive <em>Is Active</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ClassImpl#getOwnedReceptions <em>Owned Reception</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ClassImpl#getExtensions <em>Extension</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ClassImpl#isAbstract <em>Is Abstract</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ClassImpl#getOwnedAttributes <em>Owned Attribute</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ClassImpl
		extends EncapsulatedClassifierImpl
		implements org.eclipse.uml2.uml.Class {

	/**
	 * The default value of the '{@link #isActive() <em>Is Active</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isActive()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_ACTIVE_EDEFAULT = false;

	/**
	 * The flag representing the value of the '{@link #isActive() <em>Is Active</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isActive()
	 * @generated
	 * @ordered
	 */
	protected static final int IS_ACTIVE_EFLAG = 1 << 10;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClassImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return UMLPackage.Literals.CLASS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getOwnedMembers() {
		EList ownedMember = (EList) eVirtualGet(UMLPackage.CLASS__OWNED_MEMBER);
		if (ownedMember == null) {
			eVirtualSet(UMLPackage.CLASS__OWNED_MEMBER,
				ownedMember = new DerivedUnionEObjectEList(NamedElement.class,
					this, UMLPackage.CLASS__OWNED_MEMBER, new int[]{
						UMLPackage.CLASS__OWNED_RULE,
						UMLPackage.CLASS__OWNED_USE_CASE,
						UMLPackage.CLASS__OWNED_ATTRIBUTE,
						UMLPackage.CLASS__OWNED_CONNECTOR,
						UMLPackage.CLASS__OWNED_BEHAVIOR,
						UMLPackage.CLASS__OWNED_TRIGGER,
						UMLPackage.CLASS__NESTED_CLASSIFIER,
						UMLPackage.CLASS__OWNED_OPERATION,
						UMLPackage.CLASS__OWNED_RECEPTION}));
		}
		return ownedMember;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getOwnedElements() {
		EList ownedElement = (EList) eVirtualGet(UMLPackage.CLASS__OWNED_ELEMENT);
		if (ownedElement == null) {
			eVirtualSet(UMLPackage.CLASS__OWNED_ELEMENT,
				ownedElement = new DerivedUnionEObjectEList(Element.class,
					this, UMLPackage.CLASS__OWNED_ELEMENT, new int[]{
						UMLPackage.CLASS__OWNED_COMMENT,
						UMLPackage.CLASS__NAME_EXPRESSION,
						UMLPackage.CLASS__ELEMENT_IMPORT,
						UMLPackage.CLASS__PACKAGE_IMPORT,
						UMLPackage.CLASS__OWNED_MEMBER,
						UMLPackage.CLASS__TEMPLATE_BINDING,
						UMLPackage.CLASS__OWNED_TEMPLATE_SIGNATURE,
						UMLPackage.CLASS__GENERALIZATION,
						UMLPackage.CLASS__SUBSTITUTION,
						UMLPackage.CLASS__COLLABORATION_USE,
						UMLPackage.CLASS__INTERFACE_REALIZATION}));
		}
		return ownedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getOwnedBehaviors() {
		EList ownedBehavior = (EList) eVirtualGet(UMLPackage.CLASS__OWNED_BEHAVIOR);
		if (ownedBehavior == null) {
			eVirtualSet(
				UMLPackage.CLASS__OWNED_BEHAVIOR,
				ownedBehavior = new SubsetSupersetEObjectContainmentEList.Resolving(
					Behavior.class, this, UMLPackage.CLASS__OWNED_BEHAVIOR,
					null, new int[]{UMLPackage.CLASS__CLASSIFIER_BEHAVIOR}));
		}
		return ownedBehavior;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Behavior createOwnedBehavior(String name, EClass eClass) {
		Behavior newOwnedBehavior = (Behavior) EcoreUtil.create(eClass);
		if (name != null)
			newOwnedBehavior.setName(name);
		getOwnedBehaviors().add(newOwnedBehavior);
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
		ownedBehaviorLoop : for (Iterator i = getOwnedBehaviors().iterator(); i
			.hasNext();) {
			Behavior ownedBehavior = (Behavior) i.next();
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
	public EList getClientDependencies() {
		EList clientDependency = (EList) eVirtualGet(UMLPackage.CLASS__CLIENT_DEPENDENCY);
		if (clientDependency == null) {
			eVirtualSet(
				UMLPackage.CLASS__CLIENT_DEPENDENCY,
				clientDependency = new SubsetSupersetEObjectWithInverseResolvingEList.ManyInverse(
					Dependency.class, this,
					UMLPackage.CLASS__CLIENT_DEPENDENCY, null, new int[]{
						UMLPackage.CLASS__SUBSTITUTION,
						UMLPackage.CLASS__INTERFACE_REALIZATION},
					UMLPackage.DEPENDENCY__CLIENT));
		}
		return clientDependency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Behavior getClassifierBehavior() {
		Behavior classifierBehavior = (Behavior) eVirtualGet(UMLPackage.CLASS__CLASSIFIER_BEHAVIOR);
		if (classifierBehavior != null && classifierBehavior.eIsProxy()) {
			InternalEObject oldClassifierBehavior = (InternalEObject) classifierBehavior;
			classifierBehavior = (Behavior) eResolveProxy(oldClassifierBehavior);
			if (classifierBehavior != oldClassifierBehavior) {
				eVirtualSet(UMLPackage.CLASS__CLASSIFIER_BEHAVIOR,
					classifierBehavior);
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
						UMLPackage.CLASS__CLASSIFIER_BEHAVIOR,
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
		return (Behavior) eVirtualGet(UMLPackage.CLASS__CLASSIFIER_BEHAVIOR);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClassifierBehavior(Behavior newClassifierBehavior) {
		if (newClassifierBehavior != null
			&& !getOwnedBehaviors().contains(newClassifierBehavior)) {
			getOwnedBehaviors().add(newClassifierBehavior);
		}
		Behavior classifierBehavior = newClassifierBehavior;
		Object oldClassifierBehavior = eVirtualSet(
			UMLPackage.CLASS__CLASSIFIER_BEHAVIOR, classifierBehavior);
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.CLASS__CLASSIFIER_BEHAVIOR,
				oldClassifierBehavior == EVIRTUAL_NO_VALUE
					? null
					: oldClassifierBehavior, classifierBehavior));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Behavior createClassifierBehavior(String name, EClass eClass) {
		Behavior newClassifierBehavior = (Behavior) EcoreUtil.create(eClass);
		if (name != null)
			newClassifierBehavior.setName(name);
		setClassifierBehavior(newClassifierBehavior);
		return newClassifierBehavior;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getInterfaceRealizations() {
		EList interfaceRealization = (EList) eVirtualGet(UMLPackage.CLASS__INTERFACE_REALIZATION);
		if (interfaceRealization == null) {
			eVirtualSet(
				UMLPackage.CLASS__INTERFACE_REALIZATION,
				interfaceRealization = new SubsetSupersetEObjectContainmentWithInverseEList.Resolving(
					InterfaceRealization.class, this,
					UMLPackage.CLASS__INTERFACE_REALIZATION,
					new int[]{UMLPackage.CLASS__CLIENT_DEPENDENCY}, null,
					UMLPackage.INTERFACE_REALIZATION__IMPLEMENTING_CLASSIFIER));
		}
		return interfaceRealization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterfaceRealization createInterfaceRealization(String name,
			Interface contract) {
		InterfaceRealization newInterfaceRealization = UMLFactory.eINSTANCE
			.createInterfaceRealization();
		newInterfaceRealization.setName(name);
		newInterfaceRealization.setContract(contract);
		getInterfaceRealizations().add(newInterfaceRealization);
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
		interfaceRealizationLoop : for (Iterator i = getInterfaceRealizations()
			.iterator(); i.hasNext();) {
			InterfaceRealization interfaceRealization = (InterfaceRealization) i
				.next();
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
	public EList getOwnedTriggers() {
		EList ownedTrigger = (EList) eVirtualGet(UMLPackage.CLASS__OWNED_TRIGGER);
		if (ownedTrigger == null) {
			eVirtualSet(UMLPackage.CLASS__OWNED_TRIGGER,
				ownedTrigger = new EObjectContainmentEList.Resolving(
					Trigger.class, this, UMLPackage.CLASS__OWNED_TRIGGER));
		}
		return ownedTrigger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Trigger createOwnedTrigger(String name) {
		Trigger newOwnedTrigger = UMLFactory.eINSTANCE.createTrigger();
		newOwnedTrigger.setName(name);
		getOwnedTriggers().add(newOwnedTrigger);
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
		ownedTriggerLoop : for (Iterator i = getOwnedTriggers().iterator(); i
			.hasNext();) {
			Trigger ownedTrigger = (Trigger) i.next();
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
	public EList getFeatures() {
		EList feature = (EList) eVirtualGet(UMLPackage.CLASS__FEATURE);
		if (feature == null) {
			eVirtualSet(UMLPackage.CLASS__FEATURE,
				feature = new DerivedUnionEObjectEList(Feature.class, this,
					UMLPackage.CLASS__FEATURE, new int[]{
						UMLPackage.CLASS__ATTRIBUTE,
						UMLPackage.CLASS__OWNED_CONNECTOR,
						UMLPackage.CLASS__OWNED_OPERATION,
						UMLPackage.CLASS__OWNED_RECEPTION}));
		}
		return feature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getAttributes() {
		EList attribute = (EList) eVirtualGet(UMLPackage.CLASS__ATTRIBUTE);
		if (attribute == null) {
			eVirtualSet(UMLPackage.CLASS__ATTRIBUTE,
				attribute = new DerivedUnionEObjectEList(Property.class, this,
					UMLPackage.CLASS__ATTRIBUTE,
					new int[]{UMLPackage.CLASS__OWNED_ATTRIBUTE}));
		}
		return attribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getOwnedOperations() {
		EList ownedOperation = (EList) eVirtualGet(UMLPackage.CLASS__OWNED_OPERATION);
		if (ownedOperation == null) {
			eVirtualSet(
				UMLPackage.CLASS__OWNED_OPERATION,
				ownedOperation = new EObjectContainmentWithInverseEList.Resolving(
					Operation.class, this, UMLPackage.CLASS__OWNED_OPERATION,
					UMLPackage.OPERATION__CLASS_));
		}
		return ownedOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operation createOwnedOperation(String name,
			EList ownedParameterNames, EList ownedParameterTypes) {
		Operation newOwnedOperation = UMLFactory.eINSTANCE.createOperation();
		newOwnedOperation.setName(name);
		int ownedParameterListSize = 0;
		int ownedParameterNamesSize = ownedParameterNames == null
			? 0
			: ownedParameterNames.size();
		if (ownedParameterNamesSize > ownedParameterListSize)
			ownedParameterListSize = ownedParameterNamesSize;
		int ownedParameterTypesSize = ownedParameterTypes == null
			? 0
			: ownedParameterTypes.size();
		if (ownedParameterTypesSize > ownedParameterListSize)
			ownedParameterListSize = ownedParameterTypesSize;
		for (int i = 0; i < ownedParameterListSize; i++) {
			newOwnedOperation.createOwnedParameter(i < ownedParameterNamesSize
				? (String) ownedParameterNames.get(i)
				: null, i < ownedParameterTypesSize
				? (Type) ownedParameterTypes.get(i)
				: null);
		}
		getOwnedOperations().add(newOwnedOperation);
		return newOwnedOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operation getOwnedOperation(String name, EList ownedParameterNames,
			EList ownedParameterTypes) {
		return getOwnedOperation(name, ownedParameterNames,
			ownedParameterTypes, false, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operation getOwnedOperation(String name, EList ownedParameterNames,
			EList ownedParameterTypes, boolean ignoreCase,
			boolean createOnDemand) {
		ownedOperationLoop : for (Iterator i = getOwnedOperations().iterator(); i
			.hasNext();) {
			Operation ownedOperation = (Operation) i.next();
			if (name != null && !(ignoreCase
				? name.equalsIgnoreCase(ownedOperation.getName())
				: name.equals(ownedOperation.getName())))
				continue ownedOperationLoop;
			EList ownedParameterList = ownedOperation.getOwnedParameters();
			int ownedParameterListSize = ownedParameterList.size();
			if (ownedParameterNames != null
				&& ownedParameterNames.size() != ownedParameterListSize
				|| (ownedParameterTypes != null && ownedParameterTypes.size() != ownedParameterListSize))
				continue ownedOperationLoop;
			for (int j = 0; j < ownedParameterListSize; j++) {
				Parameter ownedParameter = (Parameter) ownedParameterList
					.get(j);
				if (ownedParameterNames != null
					&& !(ignoreCase
						? ((String) ownedParameterNames.get(j))
							.equalsIgnoreCase(ownedParameter.getName())
						: ownedParameterNames.get(j).equals(
							ownedParameter.getName())))
					continue ownedOperationLoop;
				if (ownedParameterTypes != null
					&& !ownedParameterTypes.get(j).equals(
						ownedParameter.getType()))
					continue ownedOperationLoop;
			}
			return ownedOperation;
		}
		return createOnDemand
			? createOwnedOperation(name, ownedParameterNames,
				ownedParameterTypes)
			: null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getNestedClassifiers() {
		EList nestedClassifier = (EList) eVirtualGet(UMLPackage.CLASS__NESTED_CLASSIFIER);
		if (nestedClassifier == null) {
			eVirtualSet(
				UMLPackage.CLASS__NESTED_CLASSIFIER,
				nestedClassifier = new EObjectContainmentEList.Resolving(
					Classifier.class, this, UMLPackage.CLASS__NESTED_CLASSIFIER));
		}
		return nestedClassifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Classifier createNestedClassifier(String name, EClass eClass) {
		Classifier newNestedClassifier = (Classifier) EcoreUtil.create(eClass);
		if (name != null)
			newNestedClassifier.setName(name);
		getNestedClassifiers().add(newNestedClassifier);
		return newNestedClassifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Classifier getNestedClassifier(String name) {
		return getNestedClassifier(name, false, null, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Classifier getNestedClassifier(String name, boolean ignoreCase,
			EClass eClass, boolean createOnDemand) {
		nestedClassifierLoop : for (Iterator i = getNestedClassifiers()
			.iterator(); i.hasNext();) {
			Classifier nestedClassifier = (Classifier) i.next();
			if (eClass != null && !eClass.isInstance(nestedClassifier))
				continue nestedClassifierLoop;
			if (name != null && !(ignoreCase
				? name.equalsIgnoreCase(nestedClassifier.getName())
				: name.equals(nestedClassifier.getName())))
				continue nestedClassifierLoop;
			return nestedClassifier;
		}
		return createOnDemand && eClass != null
			? createNestedClassifier(name, eClass)
			: null;
	}

	protected static class SuperClassEList
			extends DerivedSubsetEObjectEList {

		protected class SuperClassListIterator
				extends DerivedSubsetListIterator {

			public Object next() {
				return ((Generalization) super.next()).getGeneral();
			}

			public Object previous() {
				return ((Generalization) super.previous()).getGeneral();
			}

			public void set(Object element) {
				Generalization generalization = UMLFactory.eINSTANCE
					.createGeneralization();
				generalization.setGeneral((org.eclipse.uml2.uml.Class) element);
				super.set(generalization);
			}

			public void add(Object element) {
				Generalization generalization = UMLFactory.eINSTANCE
					.createGeneralization();
				generalization.setGeneral((org.eclipse.uml2.uml.Class) element);
				super.add(generalization);
			}
		}

		protected class ResolvingSuperClassListIterator
				extends SuperClassListIterator {

			protected boolean resolve() {
				return true;
			}

		}

		protected SuperClassEList(Class dataClass, InternalEObject owner,
				int featureID, int[] sourceFeatureIDs) {
			super(dataClass, owner, featureID, sourceFeatureIDs);
		}

		public List basicList() {
			return new SuperClassEList(dataClass, owner, featureID,
				sourceFeatureIDs) {

				public ListIterator listIterator(int index) {
					return basicListIterator(index);
				}
			};
		}

		protected ListIterator newListIterator() {
			return new SuperClassListIterator();
		}

		protected ListIterator newResolvingListIterator() {
			return new ResolvingSuperClassListIterator();
		}

		protected boolean isIncluded(Object object) {
			return super.isIncluded(((Generalization) object).getGeneral());
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList getSuperClasses() {
		EList superClass = (EList) eVirtualGet(UMLPackage.CLASS__SUPER_CLASS);
		if (superClass == null) {
			eVirtualSet(UMLPackage.CLASS__SUPER_CLASS,
				superClass = new SuperClassEList(
					org.eclipse.uml2.uml.Class.class, this,
					UMLPackage.CLASS__SUPER_CLASS,
					new int[]{UMLPackage.CLASS__GENERALIZATION}));
		}
		return superClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.uml2.uml.Class getSuperClass(String name) {
		return getSuperClass(name, false, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.uml2.uml.Class getSuperClass(String name,
			boolean ignoreCase, EClass eClass) {
		superClassLoop : for (Iterator i = getSuperClasses().iterator(); i
			.hasNext();) {
			org.eclipse.uml2.uml.Class superClass = (org.eclipse.uml2.uml.Class) i
				.next();
			if (eClass != null && !eClass.isInstance(superClass))
				continue superClassLoop;
			if (name != null && !(ignoreCase
				? name.equalsIgnoreCase(superClass.getName())
				: name.equals(superClass.getName())))
				continue superClassLoop;
			return superClass;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSuperClasses() {
		return !getSuperClasses().isEmpty();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isActive() {
		return (eFlags & IS_ACTIVE_EFLAG) != 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsActive(boolean newIsActive) {
		boolean oldIsActive = (eFlags & IS_ACTIVE_EFLAG) != 0;
		if (newIsActive)
			eFlags |= IS_ACTIVE_EFLAG;
		else
			eFlags &= ~IS_ACTIVE_EFLAG;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.CLASS__IS_ACTIVE, oldIsActive, newIsActive));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getOwnedReceptions() {
		EList ownedReception = (EList) eVirtualGet(UMLPackage.CLASS__OWNED_RECEPTION);
		if (ownedReception == null) {
			eVirtualSet(UMLPackage.CLASS__OWNED_RECEPTION,
				ownedReception = new EObjectContainmentEList.Resolving(
					Reception.class, this, UMLPackage.CLASS__OWNED_RECEPTION));
		}
		return ownedReception;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reception createOwnedReception(String name,
			EList ownedParameterNames, EList ownedParameterTypes) {
		Reception newOwnedReception = UMLFactory.eINSTANCE.createReception();
		newOwnedReception.setName(name);
		int ownedParameterListSize = 0;
		int ownedParameterNamesSize = ownedParameterNames == null
			? 0
			: ownedParameterNames.size();
		if (ownedParameterNamesSize > ownedParameterListSize)
			ownedParameterListSize = ownedParameterNamesSize;
		int ownedParameterTypesSize = ownedParameterTypes == null
			? 0
			: ownedParameterTypes.size();
		if (ownedParameterTypesSize > ownedParameterListSize)
			ownedParameterListSize = ownedParameterTypesSize;
		for (int i = 0; i < ownedParameterListSize; i++) {
			newOwnedReception.createOwnedParameter(i < ownedParameterNamesSize
				? (String) ownedParameterNames.get(i)
				: null, i < ownedParameterTypesSize
				? (Type) ownedParameterTypes.get(i)
				: null);
		}
		getOwnedReceptions().add(newOwnedReception);
		return newOwnedReception;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reception getOwnedReception(String name, EList ownedParameterNames,
			EList ownedParameterTypes) {
		return getOwnedReception(name, ownedParameterNames,
			ownedParameterTypes, false, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reception getOwnedReception(String name, EList ownedParameterNames,
			EList ownedParameterTypes, boolean ignoreCase,
			boolean createOnDemand) {
		ownedReceptionLoop : for (Iterator i = getOwnedReceptions().iterator(); i
			.hasNext();) {
			Reception ownedReception = (Reception) i.next();
			if (name != null && !(ignoreCase
				? name.equalsIgnoreCase(ownedReception.getName())
				: name.equals(ownedReception.getName())))
				continue ownedReceptionLoop;
			EList ownedParameterList = ownedReception.getOwnedParameters();
			int ownedParameterListSize = ownedParameterList.size();
			if (ownedParameterNames != null
				&& ownedParameterNames.size() != ownedParameterListSize
				|| (ownedParameterTypes != null && ownedParameterTypes.size() != ownedParameterListSize))
				continue ownedReceptionLoop;
			for (int j = 0; j < ownedParameterListSize; j++) {
				Parameter ownedParameter = (Parameter) ownedParameterList
					.get(j);
				if (ownedParameterNames != null
					&& !(ignoreCase
						? ((String) ownedParameterNames.get(j))
							.equalsIgnoreCase(ownedParameter.getName())
						: ownedParameterNames.get(j).equals(
							ownedParameter.getName())))
					continue ownedReceptionLoop;
				if (ownedParameterTypes != null
					&& !ownedParameterTypes.get(j).equals(
						ownedParameter.getType()))
					continue ownedReceptionLoop;
			}
			return ownedReception;
		}
		return createOnDemand
			? createOwnedReception(name, ownedParameterNames,
				ownedParameterTypes)
			: null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getExtensions() {
		CacheAdapter cache = getCacheAdapter();
		if (cache != null) {
			EList result = (EList) cache.get(this,
				UMLPackage.Literals.CLASS__EXTENSION);
			if (result == null) {
				cache.put(this, UMLPackage.Literals.CLASS__EXTENSION,
					result = ClassOperations.getExtensions(this));
			}
			return result;
		}
		return ClassOperations.getExtensions(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Extension getExtension(String name) {
		return getExtension(name, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Extension getExtension(String name, boolean ignoreCase) {
		extensionLoop : for (Iterator i = getExtensions().iterator(); i
			.hasNext();) {
			Extension extension = (Extension) i.next();
			if (name != null && !(ignoreCase
				? name.equalsIgnoreCase(extension.getName())
				: name.equals(extension.getName())))
				continue extensionLoop;
			return extension;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getOwnedAttributes() {
		EList ownedAttribute = (EList) eVirtualGet(UMLPackage.CLASS__OWNED_ATTRIBUTE);
		if (ownedAttribute == null) {
			eVirtualSet(UMLPackage.CLASS__OWNED_ATTRIBUTE,
				ownedAttribute = new EObjectContainmentEList.Resolving(
					Property.class, this, UMLPackage.CLASS__OWNED_ATTRIBUTE));
		}
		return ownedAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property createOwnedAttribute(String name, Type type, EClass eClass) {
		Property newOwnedAttribute = (Property) EcoreUtil.create(eClass);
		if (name != null)
			newOwnedAttribute.setName(name);
		if (type != null)
			newOwnedAttribute.setType(type);
		getOwnedAttributes().add(newOwnedAttribute);
		return newOwnedAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property createOwnedAttribute(String name, Type type) {
		Property newOwnedAttribute = UMLFactory.eINSTANCE.createProperty();
		newOwnedAttribute.setName(name);
		newOwnedAttribute.setType(type);
		getOwnedAttributes().add(newOwnedAttribute);
		return newOwnedAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property getOwnedAttribute(String name, Type type) {
		return getOwnedAttribute(name, type, false, null, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property getOwnedAttribute(String name, Type type,
			boolean ignoreCase, EClass eClass, boolean createOnDemand) {
		ownedAttributeLoop : for (Iterator i = getOwnedAttributes().iterator(); i
			.hasNext();) {
			Property ownedAttribute = (Property) i.next();
			if (eClass != null && !eClass.isInstance(ownedAttribute))
				continue ownedAttributeLoop;
			if (name != null && !(ignoreCase
				? name.equalsIgnoreCase(ownedAttribute.getName())
				: name.equals(ownedAttribute.getName())))
				continue ownedAttributeLoop;
			if (type != null && !type.equals(ownedAttribute.getType()))
				continue ownedAttributeLoop;
			return ownedAttribute;
		}
		return createOnDemand && eClass != null
			? createOwnedAttribute(name, type, eClass)
			: null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOwnedAttributes() {
		EList ownedAttribute = (EList) eVirtualGet(UMLPackage.CLASS__OWNED_ATTRIBUTE);
		return ownedAttribute != null && !ownedAttribute.isEmpty();
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
				UMLPackage.CLASS__IS_ABSTRACT, oldIsAbstract, newIsAbstract));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIsAbstract() {
		return ((eFlags & IS_ABSTRACT_EFLAG) != 0) != IS_ABSTRACT_EDEFAULT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClassBehavior(DiagnosticChain diagnostics,
			Map context) {
		return BehavioredClassifierOperations.validateClassBehavior(this,
			diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePassiveClass(DiagnosticChain diagnostics, Map context) {
		return ClassOperations.validatePassiveClass(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operation createOwnedOperation(String name, EList parameterNames,
			EList parameterTypes, Type returnType) {
		return ClassOperations.createOwnedOperation(this, name, parameterNames,
			parameterTypes, returnType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isMetaclass() {
		return ClassOperations.isMetaclass(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList inherit(EList inhs) {
		return ClassOperations.inherit(this, inhs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UMLPackage.CLASS__EANNOTATIONS :
				return ((InternalEList) getEAnnotations()).basicAdd(otherEnd,
					msgs);
			case UMLPackage.CLASS__CLIENT_DEPENDENCY :
				return ((InternalEList) getClientDependencies()).basicAdd(
					otherEnd, msgs);
			case UMLPackage.CLASS__ELEMENT_IMPORT :
				return ((InternalEList) getElementImports()).basicAdd(otherEnd,
					msgs);
			case UMLPackage.CLASS__PACKAGE_IMPORT :
				return ((InternalEList) getPackageImports()).basicAdd(otherEnd,
					msgs);
			case UMLPackage.CLASS__OWNED_RULE :
				return ((InternalEList) getOwnedRules()).basicAdd(otherEnd,
					msgs);
			case UMLPackage.CLASS__OWNING_TEMPLATE_PARAMETER :
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return eBasicSetContainer(otherEnd,
					UMLPackage.CLASS__OWNING_TEMPLATE_PARAMETER, msgs);
			case UMLPackage.CLASS__TEMPLATE_PARAMETER :
				TemplateParameter templateParameter = (TemplateParameter) eVirtualGet(UMLPackage.CLASS__TEMPLATE_PARAMETER);
				if (templateParameter != null)
					msgs = ((InternalEObject) templateParameter)
						.eInverseRemove(this,
							UMLPackage.TEMPLATE_PARAMETER__PARAMETERED_ELEMENT,
							TemplateParameter.class, msgs);
				return basicSetTemplateParameter((TemplateParameter) otherEnd,
					msgs);
			case UMLPackage.CLASS__TEMPLATE_BINDING :
				return ((InternalEList) getTemplateBindings()).basicAdd(
					otherEnd, msgs);
			case UMLPackage.CLASS__OWNED_TEMPLATE_SIGNATURE :
				TemplateSignature ownedTemplateSignature = (TemplateSignature) eVirtualGet(UMLPackage.CLASS__OWNED_TEMPLATE_SIGNATURE);
				if (ownedTemplateSignature != null)
					msgs = ((InternalEObject) ownedTemplateSignature)
						.eInverseRemove(this, EOPPOSITE_FEATURE_BASE
							- UMLPackage.CLASS__OWNED_TEMPLATE_SIGNATURE, null,
							msgs);
				return basicSetOwnedTemplateSignature(
					(TemplateSignature) otherEnd, msgs);
			case UMLPackage.CLASS__GENERALIZATION :
				return ((InternalEList) getGeneralizations()).basicAdd(
					otherEnd, msgs);
			case UMLPackage.CLASS__POWERTYPE_EXTENT :
				return ((InternalEList) getPowertypeExtents()).basicAdd(
					otherEnd, msgs);
			case UMLPackage.CLASS__SUBSTITUTION :
				return ((InternalEList) getSubstitutions()).basicAdd(otherEnd,
					msgs);
			case UMLPackage.CLASS__USE_CASE :
				return ((InternalEList) getUseCases()).basicAdd(otherEnd, msgs);
			case UMLPackage.CLASS__INTERFACE_REALIZATION :
				return ((InternalEList) getInterfaceRealizations()).basicAdd(
					otherEnd, msgs);
			case UMLPackage.CLASS__OWNED_OPERATION :
				return ((InternalEList) getOwnedOperations()).basicAdd(
					otherEnd, msgs);
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
			case UMLPackage.CLASS__EANNOTATIONS :
				return ((InternalEList) getEAnnotations()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.CLASS__OWNED_COMMENT :
				return ((InternalEList) getOwnedComments()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.CLASS__CLIENT_DEPENDENCY :
				return ((InternalEList) getClientDependencies()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.CLASS__NAME_EXPRESSION :
				return basicSetNameExpression(null, msgs);
			case UMLPackage.CLASS__ELEMENT_IMPORT :
				return ((InternalEList) getElementImports()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.CLASS__PACKAGE_IMPORT :
				return ((InternalEList) getPackageImports()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.CLASS__OWNED_RULE :
				return ((InternalEList) getOwnedRules()).basicRemove(otherEnd,
					msgs);
			case UMLPackage.CLASS__OWNING_TEMPLATE_PARAMETER :
				return eBasicSetContainer(null,
					UMLPackage.CLASS__OWNING_TEMPLATE_PARAMETER, msgs);
			case UMLPackage.CLASS__TEMPLATE_PARAMETER :
				return basicSetTemplateParameter(null, msgs);
			case UMLPackage.CLASS__TEMPLATE_BINDING :
				return ((InternalEList) getTemplateBindings()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.CLASS__OWNED_TEMPLATE_SIGNATURE :
				return basicSetOwnedTemplateSignature(null, msgs);
			case UMLPackage.CLASS__GENERALIZATION :
				return ((InternalEList) getGeneralizations()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.CLASS__POWERTYPE_EXTENT :
				return ((InternalEList) getPowertypeExtents()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.CLASS__SUBSTITUTION :
				return ((InternalEList) getSubstitutions()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.CLASS__COLLABORATION_USE :
				return ((InternalEList) getCollaborationUses()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.CLASS__OWNED_USE_CASE :
				return ((InternalEList) getOwnedUseCases()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.CLASS__USE_CASE :
				return ((InternalEList) getUseCases()).basicRemove(otherEnd,
					msgs);
			case UMLPackage.CLASS__OWNED_ATTRIBUTE :
				return ((InternalEList) getOwnedAttributes()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.CLASS__OWNED_CONNECTOR :
				return ((InternalEList) getOwnedConnectors()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.CLASS__OWNED_BEHAVIOR :
				return ((InternalEList) getOwnedBehaviors()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.CLASS__INTERFACE_REALIZATION :
				return ((InternalEList) getInterfaceRealizations())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.CLASS__OWNED_TRIGGER :
				return ((InternalEList) getOwnedTriggers()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.CLASS__NESTED_CLASSIFIER :
				return ((InternalEList) getNestedClassifiers()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.CLASS__OWNED_OPERATION :
				return ((InternalEList) getOwnedOperations()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.CLASS__OWNED_RECEPTION :
				return ((InternalEList) getOwnedReceptions()).basicRemove(
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
			case UMLPackage.CLASS__EANNOTATIONS :
				return getEAnnotations();
			case UMLPackage.CLASS__OWNED_ELEMENT :
				return getOwnedElements();
			case UMLPackage.CLASS__OWNER :
				if (resolve)
					return getOwner();
				return basicGetOwner();
			case UMLPackage.CLASS__OWNED_COMMENT :
				return getOwnedComments();
			case UMLPackage.CLASS__NAME :
				return getName();
			case UMLPackage.CLASS__VISIBILITY :
				return getVisibility();
			case UMLPackage.CLASS__QUALIFIED_NAME :
				return getQualifiedName();
			case UMLPackage.CLASS__CLIENT_DEPENDENCY :
				return getClientDependencies();
			case UMLPackage.CLASS__NAMESPACE :
				if (resolve)
					return getNamespace();
				return basicGetNamespace();
			case UMLPackage.CLASS__NAME_EXPRESSION :
				if (resolve)
					return getNameExpression();
				return basicGetNameExpression();
			case UMLPackage.CLASS__ELEMENT_IMPORT :
				return getElementImports();
			case UMLPackage.CLASS__PACKAGE_IMPORT :
				return getPackageImports();
			case UMLPackage.CLASS__OWNED_RULE :
				return getOwnedRules();
			case UMLPackage.CLASS__MEMBER :
				return getMembers();
			case UMLPackage.CLASS__IMPORTED_MEMBER :
				return getImportedMembers();
			case UMLPackage.CLASS__OWNED_MEMBER :
				return getOwnedMembers();
			case UMLPackage.CLASS__IS_LEAF :
				return isLeaf()
					? Boolean.TRUE
					: Boolean.FALSE;
			case UMLPackage.CLASS__REDEFINED_ELEMENT :
				return getRedefinedElements();
			case UMLPackage.CLASS__REDEFINITION_CONTEXT :
				return getRedefinitionContexts();
			case UMLPackage.CLASS__OWNING_TEMPLATE_PARAMETER :
				if (resolve)
					return getOwningTemplateParameter();
				return basicGetOwningTemplateParameter();
			case UMLPackage.CLASS__TEMPLATE_PARAMETER :
				if (resolve)
					return getTemplateParameter();
				return basicGetTemplateParameter();
			case UMLPackage.CLASS__PACKAGE :
				if (resolve)
					return getPackage();
				return basicGetPackage();
			case UMLPackage.CLASS__TEMPLATE_BINDING :
				return getTemplateBindings();
			case UMLPackage.CLASS__OWNED_TEMPLATE_SIGNATURE :
				if (resolve)
					return getOwnedTemplateSignature();
				return basicGetOwnedTemplateSignature();
			case UMLPackage.CLASS__IS_ABSTRACT :
				return isAbstract()
					? Boolean.TRUE
					: Boolean.FALSE;
			case UMLPackage.CLASS__GENERALIZATION :
				return getGeneralizations();
			case UMLPackage.CLASS__POWERTYPE_EXTENT :
				return getPowertypeExtents();
			case UMLPackage.CLASS__FEATURE :
				return getFeatures();
			case UMLPackage.CLASS__INHERITED_MEMBER :
				return getInheritedMembers();
			case UMLPackage.CLASS__REDEFINED_CLASSIFIER :
				return getRedefinedClassifiers();
			case UMLPackage.CLASS__GENERAL :
				return getGenerals();
			case UMLPackage.CLASS__SUBSTITUTION :
				return getSubstitutions();
			case UMLPackage.CLASS__ATTRIBUTE :
				return getAttributes();
			case UMLPackage.CLASS__REPRESENTATION :
				if (resolve)
					return getRepresentation();
				return basicGetRepresentation();
			case UMLPackage.CLASS__COLLABORATION_USE :
				return getCollaborationUses();
			case UMLPackage.CLASS__OWNED_USE_CASE :
				return getOwnedUseCases();
			case UMLPackage.CLASS__USE_CASE :
				return getUseCases();
			case UMLPackage.CLASS__OWNED_ATTRIBUTE :
				return getOwnedAttributes();
			case UMLPackage.CLASS__PART :
				return getParts();
			case UMLPackage.CLASS__ROLE :
				return getRoles();
			case UMLPackage.CLASS__OWNED_CONNECTOR :
				return getOwnedConnectors();
			case UMLPackage.CLASS__OWNED_PORT :
				return getOwnedPorts();
			case UMLPackage.CLASS__OWNED_BEHAVIOR :
				return getOwnedBehaviors();
			case UMLPackage.CLASS__CLASSIFIER_BEHAVIOR :
				if (resolve)
					return getClassifierBehavior();
				return basicGetClassifierBehavior();
			case UMLPackage.CLASS__INTERFACE_REALIZATION :
				return getInterfaceRealizations();
			case UMLPackage.CLASS__OWNED_TRIGGER :
				return getOwnedTriggers();
			case UMLPackage.CLASS__NESTED_CLASSIFIER :
				return getNestedClassifiers();
			case UMLPackage.CLASS__OWNED_OPERATION :
				return getOwnedOperations();
			case UMLPackage.CLASS__SUPER_CLASS :
				return getSuperClasses();
			case UMLPackage.CLASS__IS_ACTIVE :
				return isActive()
					? Boolean.TRUE
					: Boolean.FALSE;
			case UMLPackage.CLASS__OWNED_RECEPTION :
				return getOwnedReceptions();
			case UMLPackage.CLASS__EXTENSION :
				return getExtensions();
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
			case UMLPackage.CLASS__EANNOTATIONS :
				getEAnnotations().clear();
				getEAnnotations().addAll((Collection) newValue);
				return;
			case UMLPackage.CLASS__OWNED_COMMENT :
				getOwnedComments().clear();
				getOwnedComments().addAll((Collection) newValue);
				return;
			case UMLPackage.CLASS__NAME :
				setName((String) newValue);
				return;
			case UMLPackage.CLASS__VISIBILITY :
				setVisibility((VisibilityKind) newValue);
				return;
			case UMLPackage.CLASS__CLIENT_DEPENDENCY :
				getClientDependencies().clear();
				getClientDependencies().addAll((Collection) newValue);
				return;
			case UMLPackage.CLASS__NAME_EXPRESSION :
				setNameExpression((StringExpression) newValue);
				return;
			case UMLPackage.CLASS__ELEMENT_IMPORT :
				getElementImports().clear();
				getElementImports().addAll((Collection) newValue);
				return;
			case UMLPackage.CLASS__PACKAGE_IMPORT :
				getPackageImports().clear();
				getPackageImports().addAll((Collection) newValue);
				return;
			case UMLPackage.CLASS__OWNED_RULE :
				getOwnedRules().clear();
				getOwnedRules().addAll((Collection) newValue);
				return;
			case UMLPackage.CLASS__IS_LEAF :
				setIsLeaf(((Boolean) newValue).booleanValue());
				return;
			case UMLPackage.CLASS__OWNING_TEMPLATE_PARAMETER :
				setOwningTemplateParameter((TemplateParameter) newValue);
				return;
			case UMLPackage.CLASS__TEMPLATE_PARAMETER :
				setTemplateParameter((TemplateParameter) newValue);
				return;
			case UMLPackage.CLASS__PACKAGE :
				setPackage((org.eclipse.uml2.uml.Package) newValue);
				return;
			case UMLPackage.CLASS__TEMPLATE_BINDING :
				getTemplateBindings().clear();
				getTemplateBindings().addAll((Collection) newValue);
				return;
			case UMLPackage.CLASS__OWNED_TEMPLATE_SIGNATURE :
				setOwnedTemplateSignature((TemplateSignature) newValue);
				return;
			case UMLPackage.CLASS__IS_ABSTRACT :
				setIsAbstract(((Boolean) newValue).booleanValue());
				return;
			case UMLPackage.CLASS__GENERALIZATION :
				getGeneralizations().clear();
				getGeneralizations().addAll((Collection) newValue);
				return;
			case UMLPackage.CLASS__POWERTYPE_EXTENT :
				getPowertypeExtents().clear();
				getPowertypeExtents().addAll((Collection) newValue);
				return;
			case UMLPackage.CLASS__REDEFINED_CLASSIFIER :
				getRedefinedClassifiers().clear();
				getRedefinedClassifiers().addAll((Collection) newValue);
				return;
			case UMLPackage.CLASS__GENERAL :
				getGenerals().clear();
				getGenerals().addAll((Collection) newValue);
				return;
			case UMLPackage.CLASS__SUBSTITUTION :
				getSubstitutions().clear();
				getSubstitutions().addAll((Collection) newValue);
				return;
			case UMLPackage.CLASS__REPRESENTATION :
				setRepresentation((CollaborationUse) newValue);
				return;
			case UMLPackage.CLASS__COLLABORATION_USE :
				getCollaborationUses().clear();
				getCollaborationUses().addAll((Collection) newValue);
				return;
			case UMLPackage.CLASS__OWNED_USE_CASE :
				getOwnedUseCases().clear();
				getOwnedUseCases().addAll((Collection) newValue);
				return;
			case UMLPackage.CLASS__USE_CASE :
				getUseCases().clear();
				getUseCases().addAll((Collection) newValue);
				return;
			case UMLPackage.CLASS__OWNED_ATTRIBUTE :
				getOwnedAttributes().clear();
				getOwnedAttributes().addAll((Collection) newValue);
				return;
			case UMLPackage.CLASS__OWNED_CONNECTOR :
				getOwnedConnectors().clear();
				getOwnedConnectors().addAll((Collection) newValue);
				return;
			case UMLPackage.CLASS__OWNED_PORT :
				getOwnedPorts().clear();
				getOwnedPorts().addAll((Collection) newValue);
				return;
			case UMLPackage.CLASS__OWNED_BEHAVIOR :
				getOwnedBehaviors().clear();
				getOwnedBehaviors().addAll((Collection) newValue);
				return;
			case UMLPackage.CLASS__CLASSIFIER_BEHAVIOR :
				setClassifierBehavior((Behavior) newValue);
				return;
			case UMLPackage.CLASS__INTERFACE_REALIZATION :
				getInterfaceRealizations().clear();
				getInterfaceRealizations().addAll((Collection) newValue);
				return;
			case UMLPackage.CLASS__OWNED_TRIGGER :
				getOwnedTriggers().clear();
				getOwnedTriggers().addAll((Collection) newValue);
				return;
			case UMLPackage.CLASS__NESTED_CLASSIFIER :
				getNestedClassifiers().clear();
				getNestedClassifiers().addAll((Collection) newValue);
				return;
			case UMLPackage.CLASS__OWNED_OPERATION :
				getOwnedOperations().clear();
				getOwnedOperations().addAll((Collection) newValue);
				return;
			case UMLPackage.CLASS__SUPER_CLASS :
				getSuperClasses().clear();
				getSuperClasses().addAll((Collection) newValue);
				return;
			case UMLPackage.CLASS__IS_ACTIVE :
				setIsActive(((Boolean) newValue).booleanValue());
				return;
			case UMLPackage.CLASS__OWNED_RECEPTION :
				getOwnedReceptions().clear();
				getOwnedReceptions().addAll((Collection) newValue);
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
			case UMLPackage.CLASS__EANNOTATIONS :
				getEAnnotations().clear();
				return;
			case UMLPackage.CLASS__OWNED_COMMENT :
				getOwnedComments().clear();
				return;
			case UMLPackage.CLASS__NAME :
				unsetName();
				return;
			case UMLPackage.CLASS__VISIBILITY :
				unsetVisibility();
				return;
			case UMLPackage.CLASS__CLIENT_DEPENDENCY :
				getClientDependencies().clear();
				return;
			case UMLPackage.CLASS__NAME_EXPRESSION :
				setNameExpression((StringExpression) null);
				return;
			case UMLPackage.CLASS__ELEMENT_IMPORT :
				getElementImports().clear();
				return;
			case UMLPackage.CLASS__PACKAGE_IMPORT :
				getPackageImports().clear();
				return;
			case UMLPackage.CLASS__OWNED_RULE :
				getOwnedRules().clear();
				return;
			case UMLPackage.CLASS__IS_LEAF :
				setIsLeaf(IS_LEAF_EDEFAULT);
				return;
			case UMLPackage.CLASS__OWNING_TEMPLATE_PARAMETER :
				setOwningTemplateParameter((TemplateParameter) null);
				return;
			case UMLPackage.CLASS__TEMPLATE_PARAMETER :
				setTemplateParameter((TemplateParameter) null);
				return;
			case UMLPackage.CLASS__PACKAGE :
				setPackage((org.eclipse.uml2.uml.Package) null);
				return;
			case UMLPackage.CLASS__TEMPLATE_BINDING :
				getTemplateBindings().clear();
				return;
			case UMLPackage.CLASS__OWNED_TEMPLATE_SIGNATURE :
				setOwnedTemplateSignature((TemplateSignature) null);
				return;
			case UMLPackage.CLASS__IS_ABSTRACT :
				setIsAbstract(IS_ABSTRACT_EDEFAULT);
				return;
			case UMLPackage.CLASS__GENERALIZATION :
				getGeneralizations().clear();
				return;
			case UMLPackage.CLASS__POWERTYPE_EXTENT :
				getPowertypeExtents().clear();
				return;
			case UMLPackage.CLASS__REDEFINED_CLASSIFIER :
				getRedefinedClassifiers().clear();
				return;
			case UMLPackage.CLASS__GENERAL :
				getGenerals().clear();
				return;
			case UMLPackage.CLASS__SUBSTITUTION :
				getSubstitutions().clear();
				return;
			case UMLPackage.CLASS__REPRESENTATION :
				setRepresentation((CollaborationUse) null);
				return;
			case UMLPackage.CLASS__COLLABORATION_USE :
				getCollaborationUses().clear();
				return;
			case UMLPackage.CLASS__OWNED_USE_CASE :
				getOwnedUseCases().clear();
				return;
			case UMLPackage.CLASS__USE_CASE :
				getUseCases().clear();
				return;
			case UMLPackage.CLASS__OWNED_ATTRIBUTE :
				getOwnedAttributes().clear();
				return;
			case UMLPackage.CLASS__OWNED_CONNECTOR :
				getOwnedConnectors().clear();
				return;
			case UMLPackage.CLASS__OWNED_PORT :
				getOwnedPorts().clear();
				return;
			case UMLPackage.CLASS__OWNED_BEHAVIOR :
				getOwnedBehaviors().clear();
				return;
			case UMLPackage.CLASS__CLASSIFIER_BEHAVIOR :
				setClassifierBehavior((Behavior) null);
				return;
			case UMLPackage.CLASS__INTERFACE_REALIZATION :
				getInterfaceRealizations().clear();
				return;
			case UMLPackage.CLASS__OWNED_TRIGGER :
				getOwnedTriggers().clear();
				return;
			case UMLPackage.CLASS__NESTED_CLASSIFIER :
				getNestedClassifiers().clear();
				return;
			case UMLPackage.CLASS__OWNED_OPERATION :
				getOwnedOperations().clear();
				return;
			case UMLPackage.CLASS__SUPER_CLASS :
				getSuperClasses().clear();
				return;
			case UMLPackage.CLASS__IS_ACTIVE :
				setIsActive(IS_ACTIVE_EDEFAULT);
				return;
			case UMLPackage.CLASS__OWNED_RECEPTION :
				getOwnedReceptions().clear();
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
			case UMLPackage.CLASS__EANNOTATIONS :
				EList eAnnotations = (EList) eVirtualGet(UMLPackage.CLASS__EANNOTATIONS);
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UMLPackage.CLASS__OWNED_ELEMENT :
				return isSetOwnedElements();
			case UMLPackage.CLASS__OWNER :
				return isSetOwner();
			case UMLPackage.CLASS__OWNED_COMMENT :
				EList ownedComment = (EList) eVirtualGet(UMLPackage.CLASS__OWNED_COMMENT);
				return ownedComment != null && !ownedComment.isEmpty();
			case UMLPackage.CLASS__NAME :
				return isSetName();
			case UMLPackage.CLASS__VISIBILITY :
				return isSetVisibility();
			case UMLPackage.CLASS__QUALIFIED_NAME :
				return QUALIFIED_NAME_EDEFAULT == null
					? getQualifiedName() != null
					: !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case UMLPackage.CLASS__CLIENT_DEPENDENCY :
				EList clientDependency = (EList) eVirtualGet(UMLPackage.CLASS__CLIENT_DEPENDENCY);
				return clientDependency != null && !clientDependency.isEmpty();
			case UMLPackage.CLASS__NAMESPACE :
				return isSetNamespace();
			case UMLPackage.CLASS__NAME_EXPRESSION :
				return eVirtualGet(UMLPackage.CLASS__NAME_EXPRESSION) != null;
			case UMLPackage.CLASS__ELEMENT_IMPORT :
				EList elementImport = (EList) eVirtualGet(UMLPackage.CLASS__ELEMENT_IMPORT);
				return elementImport != null && !elementImport.isEmpty();
			case UMLPackage.CLASS__PACKAGE_IMPORT :
				EList packageImport = (EList) eVirtualGet(UMLPackage.CLASS__PACKAGE_IMPORT);
				return packageImport != null && !packageImport.isEmpty();
			case UMLPackage.CLASS__OWNED_RULE :
				EList ownedRule = (EList) eVirtualGet(UMLPackage.CLASS__OWNED_RULE);
				return ownedRule != null && !ownedRule.isEmpty();
			case UMLPackage.CLASS__MEMBER :
				return isSetMembers();
			case UMLPackage.CLASS__IMPORTED_MEMBER :
				return !getImportedMembers().isEmpty();
			case UMLPackage.CLASS__OWNED_MEMBER :
				return isSetOwnedMembers();
			case UMLPackage.CLASS__IS_LEAF :
				return ((eFlags & IS_LEAF_EFLAG) != 0) != IS_LEAF_EDEFAULT;
			case UMLPackage.CLASS__REDEFINED_ELEMENT :
				return isSetRedefinedElements();
			case UMLPackage.CLASS__REDEFINITION_CONTEXT :
				return isSetRedefinitionContexts();
			case UMLPackage.CLASS__OWNING_TEMPLATE_PARAMETER :
				return basicGetOwningTemplateParameter() != null;
			case UMLPackage.CLASS__TEMPLATE_PARAMETER :
				return isSetTemplateParameter();
			case UMLPackage.CLASS__PACKAGE :
				return basicGetPackage() != null;
			case UMLPackage.CLASS__TEMPLATE_BINDING :
				EList templateBinding = (EList) eVirtualGet(UMLPackage.CLASS__TEMPLATE_BINDING);
				return templateBinding != null && !templateBinding.isEmpty();
			case UMLPackage.CLASS__OWNED_TEMPLATE_SIGNATURE :
				return isSetOwnedTemplateSignature();
			case UMLPackage.CLASS__IS_ABSTRACT :
				return isSetIsAbstract();
			case UMLPackage.CLASS__GENERALIZATION :
				EList generalization = (EList) eVirtualGet(UMLPackage.CLASS__GENERALIZATION);
				return generalization != null && !generalization.isEmpty();
			case UMLPackage.CLASS__POWERTYPE_EXTENT :
				EList powertypeExtent = (EList) eVirtualGet(UMLPackage.CLASS__POWERTYPE_EXTENT);
				return powertypeExtent != null && !powertypeExtent.isEmpty();
			case UMLPackage.CLASS__FEATURE :
				return isSetFeatures();
			case UMLPackage.CLASS__INHERITED_MEMBER :
				return !getInheritedMembers().isEmpty();
			case UMLPackage.CLASS__REDEFINED_CLASSIFIER :
				EList redefinedClassifier = (EList) eVirtualGet(UMLPackage.CLASS__REDEFINED_CLASSIFIER);
				return redefinedClassifier != null
					&& !redefinedClassifier.isEmpty();
			case UMLPackage.CLASS__GENERAL :
				return isSetGenerals();
			case UMLPackage.CLASS__SUBSTITUTION :
				EList substitution = (EList) eVirtualGet(UMLPackage.CLASS__SUBSTITUTION);
				return substitution != null && !substitution.isEmpty();
			case UMLPackage.CLASS__ATTRIBUTE :
				return isSetAttributes();
			case UMLPackage.CLASS__REPRESENTATION :
				return eVirtualGet(UMLPackage.CLASS__REPRESENTATION) != null;
			case UMLPackage.CLASS__COLLABORATION_USE :
				EList collaborationUse = (EList) eVirtualGet(UMLPackage.CLASS__COLLABORATION_USE);
				return collaborationUse != null && !collaborationUse.isEmpty();
			case UMLPackage.CLASS__OWNED_USE_CASE :
				EList ownedUseCase = (EList) eVirtualGet(UMLPackage.CLASS__OWNED_USE_CASE);
				return ownedUseCase != null && !ownedUseCase.isEmpty();
			case UMLPackage.CLASS__USE_CASE :
				EList useCase = (EList) eVirtualGet(UMLPackage.CLASS__USE_CASE);
				return useCase != null && !useCase.isEmpty();
			case UMLPackage.CLASS__OWNED_ATTRIBUTE :
				return isSetOwnedAttributes();
			case UMLPackage.CLASS__PART :
				return !getParts().isEmpty();
			case UMLPackage.CLASS__ROLE :
				return isSetRoles();
			case UMLPackage.CLASS__OWNED_CONNECTOR :
				EList ownedConnector = (EList) eVirtualGet(UMLPackage.CLASS__OWNED_CONNECTOR);
				return ownedConnector != null && !ownedConnector.isEmpty();
			case UMLPackage.CLASS__OWNED_PORT :
				return !getOwnedPorts().isEmpty();
			case UMLPackage.CLASS__OWNED_BEHAVIOR :
				EList ownedBehavior = (EList) eVirtualGet(UMLPackage.CLASS__OWNED_BEHAVIOR);
				return ownedBehavior != null && !ownedBehavior.isEmpty();
			case UMLPackage.CLASS__CLASSIFIER_BEHAVIOR :
				return eVirtualGet(UMLPackage.CLASS__CLASSIFIER_BEHAVIOR) != null;
			case UMLPackage.CLASS__INTERFACE_REALIZATION :
				EList interfaceRealization = (EList) eVirtualGet(UMLPackage.CLASS__INTERFACE_REALIZATION);
				return interfaceRealization != null
					&& !interfaceRealization.isEmpty();
			case UMLPackage.CLASS__OWNED_TRIGGER :
				EList ownedTrigger = (EList) eVirtualGet(UMLPackage.CLASS__OWNED_TRIGGER);
				return ownedTrigger != null && !ownedTrigger.isEmpty();
			case UMLPackage.CLASS__NESTED_CLASSIFIER :
				EList nestedClassifier = (EList) eVirtualGet(UMLPackage.CLASS__NESTED_CLASSIFIER);
				return nestedClassifier != null && !nestedClassifier.isEmpty();
			case UMLPackage.CLASS__OWNED_OPERATION :
				EList ownedOperation = (EList) eVirtualGet(UMLPackage.CLASS__OWNED_OPERATION);
				return ownedOperation != null && !ownedOperation.isEmpty();
			case UMLPackage.CLASS__SUPER_CLASS :
				return isSetSuperClasses();
			case UMLPackage.CLASS__IS_ACTIVE :
				return ((eFlags & IS_ACTIVE_EFLAG) != 0) != IS_ACTIVE_EDEFAULT;
			case UMLPackage.CLASS__OWNED_RECEPTION :
				EList ownedReception = (EList) eVirtualGet(UMLPackage.CLASS__OWNED_RECEPTION);
				return ownedReception != null && !ownedReception.isEmpty();
			case UMLPackage.CLASS__EXTENSION :
				return !getExtensions().isEmpty();
		}
		return eDynamicIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class baseClass) {
		if (baseClass == BehavioredClassifier.class) {
			switch (derivedFeatureID) {
				case UMLPackage.CLASS__OWNED_BEHAVIOR :
					return UMLPackage.BEHAVIORED_CLASSIFIER__OWNED_BEHAVIOR;
				case UMLPackage.CLASS__CLASSIFIER_BEHAVIOR :
					return UMLPackage.BEHAVIORED_CLASSIFIER__CLASSIFIER_BEHAVIOR;
				case UMLPackage.CLASS__INTERFACE_REALIZATION :
					return UMLPackage.BEHAVIORED_CLASSIFIER__INTERFACE_REALIZATION;
				case UMLPackage.CLASS__OWNED_TRIGGER :
					return UMLPackage.BEHAVIORED_CLASSIFIER__OWNED_TRIGGER;
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
		if (baseClass == BehavioredClassifier.class) {
			switch (baseFeatureID) {
				case UMLPackage.BEHAVIORED_CLASSIFIER__OWNED_BEHAVIOR :
					return UMLPackage.CLASS__OWNED_BEHAVIOR;
				case UMLPackage.BEHAVIORED_CLASSIFIER__CLASSIFIER_BEHAVIOR :
					return UMLPackage.CLASS__CLASSIFIER_BEHAVIOR;
				case UMLPackage.BEHAVIORED_CLASSIFIER__INTERFACE_REALIZATION :
					return UMLPackage.CLASS__INTERFACE_REALIZATION;
				case UMLPackage.BEHAVIORED_CLASSIFIER__OWNED_TRIGGER :
					return UMLPackage.CLASS__OWNED_TRIGGER;
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
		result.append(" (isActive: "); //$NON-NLS-1$
		result.append((eFlags & IS_ACTIVE_EFLAG) != 0);
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
	public boolean isSetOwnedMembers() {
		return super.isSetOwnedMembers() || isSetOwnedAttributes()
			|| eIsSet(UMLPackage.CLASS__OWNED_BEHAVIOR)
			|| eIsSet(UMLPackage.CLASS__OWNED_TRIGGER)
			|| eIsSet(UMLPackage.CLASS__NESTED_CLASSIFIER)
			|| eIsSet(UMLPackage.CLASS__OWNED_OPERATION)
			|| eIsSet(UMLPackage.CLASS__OWNED_RECEPTION);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOwnedElements() {
		return super.isSetOwnedElements()
			|| eIsSet(UMLPackage.CLASS__INTERFACE_REALIZATION);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetFeatures() {
		return super.isSetFeatures()
			|| eIsSet(UMLPackage.CLASS__OWNED_OPERATION)
			|| eIsSet(UMLPackage.CLASS__OWNED_RECEPTION);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetAttributes() {
		return super.isSetAttributes() || isSetOwnedAttributes();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getGenerals() {
		return getSuperClasses();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetGenerals() {
		return false;
	}

} //ClassImpl
