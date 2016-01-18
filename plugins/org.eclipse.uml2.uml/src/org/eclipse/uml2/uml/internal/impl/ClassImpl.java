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
import java.util.List;
import java.util.ListIterator;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.uml2.common.util.CacheAdapter;
import org.eclipse.uml2.common.util.DerivedSubsetEObjectEList;
import org.eclipse.uml2.common.util.DerivedUnionEObjectEList;
import org.eclipse.uml2.common.util.SubsetSupersetEObjectContainmentEList;

import org.eclipse.uml2.uml.AggregationKind;
import org.eclipse.uml2.uml.Behavior;
import org.eclipse.uml2.uml.BehavioredClassifier;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.CollaborationUse;
import org.eclipse.uml2.uml.Comment;
import org.eclipse.uml2.uml.Connector;
import org.eclipse.uml2.uml.Constraint;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.ElementImport;
import org.eclipse.uml2.uml.Extension;
import org.eclipse.uml2.uml.Feature;
import org.eclipse.uml2.uml.Interface;
import org.eclipse.uml2.uml.Generalization;
import org.eclipse.uml2.uml.GeneralizationSet;
import org.eclipse.uml2.uml.InterfaceRealization;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Namespace;
import org.eclipse.uml2.uml.Operation;
import org.eclipse.uml2.uml.PackageImport;
import org.eclipse.uml2.uml.PackageableElement;
import org.eclipse.uml2.uml.Parameter;
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
import org.eclipse.uml2.uml.UMLFactory;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.UseCase;
import org.eclipse.uml2.uml.VisibilityKind;

import org.eclipse.uml2.uml.internal.operations.BehavioredClassifierOperations;
import org.eclipse.uml2.uml.internal.operations.ClassOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Class</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ClassImpl#getOwnedElements <em>Owned Element</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ClassImpl#getOwnedMembers <em>Owned Member</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ClassImpl#getOwnedBehaviors <em>Owned Behavior</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ClassImpl#getClassifierBehavior <em>Classifier Behavior</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ClassImpl#getInterfaceRealizations <em>Interface Realization</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ClassImpl#getFeatures <em>Feature</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ClassImpl#getAttributes <em>Attribute</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ClassImpl#getOwnedOperations <em>Owned Operation</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ClassImpl#getExtensions <em>Extension</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ClassImpl#isActive <em>Is Active</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ClassImpl#getNestedClassifiers <em>Nested Classifier</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ClassImpl#getOwnedReceptions <em>Owned Reception</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ClassImpl#getSuperClasses <em>Super Class</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ClassImpl#getOwnedAttributes <em>Owned Attribute</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ClassImpl#isAbstract <em>Is Abstract</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ClassImpl
		extends EncapsulatedClassifierImpl
		implements org.eclipse.uml2.uml.Class {

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
	 * The cached value of the '{@link #getOwnedOperations() <em>Owned Operation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedOperations()
	 * @generated
	 * @ordered
	 */
	protected EList<Operation> ownedOperations;

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
	protected static final int IS_ACTIVE_EFLAG = 1 << 15;

	/**
	 * The cached value of the '{@link #getNestedClassifiers() <em>Nested Classifier</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNestedClassifiers()
	 * @generated
	 * @ordered
	 */
	protected EList<Classifier> nestedClassifiers;

	/**
	 * The cached value of the '{@link #getOwnedReceptions() <em>Owned Reception</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedReceptions()
	 * @generated
	 * @ordered
	 */
	protected EList<Reception> ownedReceptions;

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
	@Override
	protected EClass eStaticClass() {
		return UMLPackage.Literals.CLASS;
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
						UMLPackage.CLASS__OWNED_MEMBER, OWNED_MEMBER_ESUBSETS));
			}
			return ownedMembers;
		}
		return new DerivedUnionEObjectEList<NamedElement>(NamedElement.class,
			this, UMLPackage.CLASS__OWNED_MEMBER, OWNED_MEMBER_ESUBSETS);
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
			EList<Element> ownedElements = (EList<Element>) cache.get(eResource,
				this, UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
			if (ownedElements == null) {
				cache.put(eResource, this,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT,
					ownedElements = new DerivedUnionEObjectEList<Element>(
						Element.class, this, UMLPackage.CLASS__OWNED_ELEMENT,
						OWNED_ELEMENT_ESUBSETS));
			}
			return ownedElements;
		}
		return new DerivedUnionEObjectEList<Element>(Element.class, this,
			UMLPackage.CLASS__OWNED_ELEMENT, OWNED_ELEMENT_ESUBSETS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Behavior> getOwnedBehaviors() {
		if (ownedBehaviors == null) {
			ownedBehaviors = new SubsetSupersetEObjectContainmentEList.Resolving<Behavior>(
				Behavior.class, this, UMLPackage.CLASS__OWNED_BEHAVIOR, null,
				OWNED_BEHAVIOR_ESUBSETS);
		}
		return ownedBehaviors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Behavior getClassifierBehavior() {
		if (classifierBehavior != null && classifierBehavior.eIsProxy()) {
			InternalEObject oldClassifierBehavior = (InternalEObject) classifierBehavior;
			classifierBehavior = (Behavior) eResolveProxy(
				oldClassifierBehavior);
			if (classifierBehavior != oldClassifierBehavior) {
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
				UMLPackage.CLASS__CLASSIFIER_BEHAVIOR, oldClassifierBehavior,
				classifierBehavior));
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
			interfaceRealizations = new EObjectContainmentWithInverseEList.Resolving<InterfaceRealization>(
				InterfaceRealization.class, this,
				UMLPackage.CLASS__INTERFACE_REALIZATION,
				UMLPackage.INTERFACE_REALIZATION__IMPLEMENTING_CLASSIFIER);
		}
		return interfaceRealizations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Feature> getFeatures() {
		CacheAdapter cache = getCacheAdapter();
		if (cache != null) {
			Resource eResource = eResource();
			@SuppressWarnings("unchecked")
			EList<Feature> features = (EList<Feature>) cache.get(eResource,
				this, UMLPackage.Literals.CLASSIFIER__FEATURE);
			if (features == null) {
				cache.put(eResource, this,
					UMLPackage.Literals.CLASSIFIER__FEATURE,
					features = new DerivedUnionEObjectEList<Feature>(
						Feature.class, this, UMLPackage.CLASS__FEATURE,
						FEATURE_ESUBSETS));
			}
			return features;
		}
		return new DerivedUnionEObjectEList<Feature>(Feature.class, this,
			UMLPackage.CLASS__FEATURE, FEATURE_ESUBSETS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Property> getAttributes() {
		CacheAdapter cache = getCacheAdapter();
		if (cache != null) {
			Resource eResource = eResource();
			@SuppressWarnings("unchecked")
			EList<Property> attributes = (EList<Property>) cache.get(eResource,
				this, UMLPackage.Literals.CLASSIFIER__ATTRIBUTE);
			if (attributes == null) {
				cache.put(eResource, this,
					UMLPackage.Literals.CLASSIFIER__ATTRIBUTE,
					attributes = new DerivedUnionEObjectEList<Property>(
						Property.class, this, UMLPackage.CLASS__ATTRIBUTE,
						ATTRIBUTE_ESUBSETS));
			}
			return attributes;
		}
		return new DerivedUnionEObjectEList<Property>(Property.class, this,
			UMLPackage.CLASS__ATTRIBUTE, ATTRIBUTE_ESUBSETS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Operation> getOwnedOperations() {
		if (ownedOperations == null) {
			ownedOperations = new EObjectContainmentWithInverseEList.Resolving<Operation>(
				Operation.class, this, UMLPackage.CLASS__OWNED_OPERATION,
				UMLPackage.OPERATION__CLASS);
		}
		return ownedOperations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operation createOwnedOperation(String name,
			EList<String> ownedParameterNames,
			EList<Type> ownedParameterTypes) {
		Operation newOwnedOperation = (Operation) create(
			UMLPackage.Literals.OPERATION);
		getOwnedOperations().add(newOwnedOperation);
		if (name != null)
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
				: null,
				i < ownedParameterTypesSize
					? (Type) ownedParameterTypes.get(i)
					: null);
		}
		return newOwnedOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operation getOwnedOperation(String name,
			EList<String> ownedParameterNames,
			EList<Type> ownedParameterTypes) {
		return getOwnedOperation(name, ownedParameterNames, ownedParameterTypes,
			false, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operation getOwnedOperation(String name,
			EList<String> ownedParameterNames, EList<Type> ownedParameterTypes,
			boolean ignoreCase, boolean createOnDemand) {
		ownedOperationLoop : for (Operation ownedOperation : getOwnedOperations()) {
			if (name != null && !(ignoreCase
				? name.equalsIgnoreCase(ownedOperation.getName())
				: name.equals(ownedOperation.getName())))
				continue ownedOperationLoop;
			EList<Parameter> ownedParameterList = ownedOperation
				.getOwnedParameters();
			int ownedParameterListSize = ownedParameterList.size();
			if (ownedParameterNames != null
				&& ownedParameterNames.size() != ownedParameterListSize
				|| (ownedParameterTypes != null
					&& ownedParameterTypes.size() != ownedParameterListSize))
				continue ownedOperationLoop;
			for (int j = 0; j < ownedParameterListSize; j++) {
				Parameter ownedParameter = ownedParameterList.get(j);
				if (ownedParameterNames != null && !(ignoreCase
					? (ownedParameterNames.get(j))
						.equalsIgnoreCase(ownedParameter.getName())
					: ownedParameterNames.get(j)
						.equals(ownedParameter.getName())))
					continue ownedOperationLoop;
				if (ownedParameterTypes != null && !ownedParameterTypes.get(j)
					.equals(ownedParameter.getType()))
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
	public EList<Classifier> getNestedClassifiers() {
		if (nestedClassifiers == null) {
			nestedClassifiers = new EObjectContainmentEList.Resolving<Classifier>(
				Classifier.class, this, UMLPackage.CLASS__NESTED_CLASSIFIER);
		}
		return nestedClassifiers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Classifier createNestedClassifier(String name, EClass eClass) {
		Classifier newNestedClassifier = (Classifier) create(eClass);
		getNestedClassifiers().add(newNestedClassifier);
		if (name != null)
			newNestedClassifier.setName(name);
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
		nestedClassifierLoop : for (Classifier nestedClassifier : getNestedClassifiers()) {
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
			extends DerivedSubsetEObjectEList<Object> {

		protected SuperClassEList(Class<?> dataClass, InternalEObject owner,
				int featureID, int[] sourceFeatureIDs) {
			super(dataClass, owner, featureID, sourceFeatureIDs);
		}

		@Override
		public List<Object> basicList() {
			return new SuperClassEList(dataClass, owner, featureID,
				sourceFeatureIDs) {

				@Override
				public ListIterator<Object> listIterator(int index) {
					return basicListIterator(index);
				}
			};
		}

		@Override
		protected boolean isIncluded(EStructuralFeature feature) {
			return false;
		}

		@Override
		protected Object derive(Object object) {
			return ((Generalization) object).getGeneral();
		}

		@Override
		protected Generalization validate(int index, Object object) {
			Generalization generalization = UMLFactory.eINSTANCE
				.createGeneralization();
			generalization
				.setGeneral((Classifier) super.validate(index, object));
			return generalization;
		}

	}

	/**
	 * The array of superset feature identifiers for the '{@link #getSuperClasses() <em>Super Class</em>}' reference list.
	 * @see #getSuperClasses()
	 */
	protected static final int[] SUPER_CLASS_ESUPERSETS = new int[]{
		UMLPackage.CLASS__GENERALIZATION};

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@SuppressWarnings("unchecked")
	public EList<org.eclipse.uml2.uml.Class> getSuperClasses() {
		CacheAdapter cache = getCacheAdapter();
		if (cache != null) {
			Resource eResource = eResource();
			EList<org.eclipse.uml2.uml.Class> superClasses = (EList<org.eclipse.uml2.uml.Class>) cache
				.get(eResource, this, UMLPackage.Literals.CLASS__SUPER_CLASS);
			if (superClasses == null) {
				cache.put(eResource, this,
					UMLPackage.Literals.CLASS__SUPER_CLASS,
					superClasses = (EList<org.eclipse.uml2.uml.Class>) ((EList<?>) new SuperClassEList(
						org.eclipse.uml2.uml.Class.class, this,
						UMLPackage.CLASS__SUPER_CLASS,
						SUPER_CLASS_ESUPERSETS)));
			}
			return superClasses;
		}
		return (EList<org.eclipse.uml2.uml.Class>) ((EList<?>) new SuperClassEList(
			org.eclipse.uml2.uml.Class.class, this,
			UMLPackage.CLASS__SUPER_CLASS, SUPER_CLASS_ESUPERSETS));
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
		superClassLoop : for (org.eclipse.uml2.uml.Class superClass : getSuperClasses()) {
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
	public EList<Reception> getOwnedReceptions() {
		if (ownedReceptions == null) {
			ownedReceptions = new EObjectContainmentEList.Resolving<Reception>(
				Reception.class, this, UMLPackage.CLASS__OWNED_RECEPTION);
		}
		return ownedReceptions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reception createOwnedReception(String name,
			EList<String> ownedParameterNames,
			EList<Type> ownedParameterTypes) {
		Reception newOwnedReception = (Reception) create(
			UMLPackage.Literals.RECEPTION);
		getOwnedReceptions().add(newOwnedReception);
		if (name != null)
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
				: null,
				i < ownedParameterTypesSize
					? (Type) ownedParameterTypes.get(i)
					: null);
		}
		return newOwnedReception;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reception getOwnedReception(String name,
			EList<String> ownedParameterNames,
			EList<Type> ownedParameterTypes) {
		return getOwnedReception(name, ownedParameterNames, ownedParameterTypes,
			false, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reception getOwnedReception(String name,
			EList<String> ownedParameterNames, EList<Type> ownedParameterTypes,
			boolean ignoreCase, boolean createOnDemand) {
		ownedReceptionLoop : for (Reception ownedReception : getOwnedReceptions()) {
			if (name != null && !(ignoreCase
				? name.equalsIgnoreCase(ownedReception.getName())
				: name.equals(ownedReception.getName())))
				continue ownedReceptionLoop;
			EList<Parameter> ownedParameterList = ownedReception
				.getOwnedParameters();
			int ownedParameterListSize = ownedParameterList.size();
			if (ownedParameterNames != null
				&& ownedParameterNames.size() != ownedParameterListSize
				|| (ownedParameterTypes != null
					&& ownedParameterTypes.size() != ownedParameterListSize))
				continue ownedReceptionLoop;
			for (int j = 0; j < ownedParameterListSize; j++) {
				Parameter ownedParameter = ownedParameterList.get(j);
				if (ownedParameterNames != null && !(ignoreCase
					? (ownedParameterNames.get(j))
						.equalsIgnoreCase(ownedParameter.getName())
					: ownedParameterNames.get(j)
						.equals(ownedParameter.getName())))
					continue ownedReceptionLoop;
				if (ownedParameterTypes != null && !ownedParameterTypes.get(j)
					.equals(ownedParameter.getType()))
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
	public EList<Extension> getExtensions() {
		CacheAdapter cache = getCacheAdapter();
		if (cache != null) {
			@SuppressWarnings("unchecked")
			EList<Extension> result = (EList<Extension>) cache.get(this,
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
		extensionLoop : for (Extension extension : getExtensions()) {
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
	@Override
	public EList<Property> getOwnedAttributes() {
		if (ownedAttributes == null) {
			ownedAttributes = new EObjectContainmentEList.Resolving<Property>(
				Property.class, this, UMLPackage.CLASS__OWNED_ATTRIBUTE);
		}
		return ownedAttributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property createOwnedAttribute(String name, Type type,
			EClass eClass) {
		Property newOwnedAttribute = (Property) create(eClass);
		getOwnedAttributes().add(newOwnedAttribute);
		if (name != null)
			newOwnedAttribute.setName(name);
		if (type != null)
			newOwnedAttribute.setType(type);
		return newOwnedAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property createOwnedAttribute(String name, Type type) {
		return createOwnedAttribute(name, type, UMLPackage.Literals.PROPERTY);
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
		ownedAttributeLoop : for (Property ownedAttribute : getOwnedAttributes()) {
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
		return ownedAttributes != null && !ownedAttributes.isEmpty();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isAbstract() {
		return (eFlags & IS_ABSTRACT_EFLAG) != 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
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
				UMLPackage.Literals.BEHAVIORED_CLASSIFIER___GET_IMPLEMENTED_INTERFACES);
			if (result == null) {
				cache.put(this,
					UMLPackage.Literals.BEHAVIORED_CLASSIFIER___GET_IMPLEMENTED_INTERFACES,
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
				UMLPackage.Literals.BEHAVIORED_CLASSIFIER___GET_ALL_IMPLEMENTED_INTERFACES);
			if (result == null) {
				cache.put(this,
					UMLPackage.Literals.BEHAVIORED_CLASSIFIER___GET_ALL_IMPLEMENTED_INTERFACES,
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
	public boolean validatePassiveClass(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ClassOperations.validatePassiveClass(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operation createOwnedOperation(String name,
			EList<String> parameterNames, EList<Type> parameterTypes,
			Type returnType) {
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
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UMLPackage.CLASS__EANNOTATIONS :
				return ((InternalEList<InternalEObject>) (InternalEList<?>) getEAnnotations())
					.basicAdd(otherEnd, msgs);
			case UMLPackage.CLASS__OWNED_RULE :
				return ((InternalEList<InternalEObject>) (InternalEList<?>) getOwnedRules())
					.basicAdd(otherEnd, msgs);
			case UMLPackage.CLASS__ELEMENT_IMPORT :
				return ((InternalEList<InternalEObject>) (InternalEList<?>) getElementImports())
					.basicAdd(otherEnd, msgs);
			case UMLPackage.CLASS__PACKAGE_IMPORT :
				return ((InternalEList<InternalEObject>) (InternalEList<?>) getPackageImports())
					.basicAdd(otherEnd, msgs);
			case UMLPackage.CLASS__OWNING_TEMPLATE_PARAMETER :
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOwningTemplateParameter(
					(TemplateParameter) otherEnd, msgs);
			case UMLPackage.CLASS__TEMPLATE_PARAMETER :
				if (templateParameter != null)
					msgs = ((InternalEObject) templateParameter).eInverseRemove(
						this,
						UMLPackage.TEMPLATE_PARAMETER__PARAMETERED_ELEMENT,
						TemplateParameter.class, msgs);
				return basicSetTemplateParameter((TemplateParameter) otherEnd,
					msgs);
			case UMLPackage.CLASS__TEMPLATE_BINDING :
				return ((InternalEList<InternalEObject>) (InternalEList<?>) getTemplateBindings())
					.basicAdd(otherEnd, msgs);
			case UMLPackage.CLASS__OWNED_TEMPLATE_SIGNATURE :
				if (ownedTemplateSignature != null)
					msgs = ((InternalEObject) ownedTemplateSignature)
						.eInverseRemove(this,
							EOPPOSITE_FEATURE_BASE
								- UMLPackage.CLASS__OWNED_TEMPLATE_SIGNATURE,
							null, msgs);
				return basicSetOwnedTemplateSignature(
					(TemplateSignature) otherEnd, msgs);
			case UMLPackage.CLASS__GENERALIZATION :
				return ((InternalEList<InternalEObject>) (InternalEList<?>) getGeneralizations())
					.basicAdd(otherEnd, msgs);
			case UMLPackage.CLASS__POWERTYPE_EXTENT :
				return ((InternalEList<InternalEObject>) (InternalEList<?>) getPowertypeExtents())
					.basicAdd(otherEnd, msgs);
			case UMLPackage.CLASS__USE_CASE :
				return ((InternalEList<InternalEObject>) (InternalEList<?>) getUseCases())
					.basicAdd(otherEnd, msgs);
			case UMLPackage.CLASS__SUBSTITUTION :
				return ((InternalEList<InternalEObject>) (InternalEList<?>) getSubstitutions())
					.basicAdd(otherEnd, msgs);
			case UMLPackage.CLASS__INTERFACE_REALIZATION :
				return ((InternalEList<InternalEObject>) (InternalEList<?>) getInterfaceRealizations())
					.basicAdd(otherEnd, msgs);
			case UMLPackage.CLASS__OWNED_OPERATION :
				return ((InternalEList<InternalEObject>) (InternalEList<?>) getOwnedOperations())
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
			case UMLPackage.CLASS__EANNOTATIONS :
				return ((InternalEList<?>) getEAnnotations())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.CLASS__OWNED_COMMENT :
				return ((InternalEList<?>) getOwnedComments())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.CLASS__NAME_EXPRESSION :
				return basicSetNameExpression(null, msgs);
			case UMLPackage.CLASS__OWNED_RULE :
				return ((InternalEList<?>) getOwnedRules())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.CLASS__ELEMENT_IMPORT :
				return ((InternalEList<?>) getElementImports())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.CLASS__PACKAGE_IMPORT :
				return ((InternalEList<?>) getPackageImports())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.CLASS__OWNING_TEMPLATE_PARAMETER :
				return basicSetOwningTemplateParameter(null, msgs);
			case UMLPackage.CLASS__TEMPLATE_PARAMETER :
				return basicSetTemplateParameter(null, msgs);
			case UMLPackage.CLASS__TEMPLATE_BINDING :
				return ((InternalEList<?>) getTemplateBindings())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.CLASS__OWNED_TEMPLATE_SIGNATURE :
				return basicSetOwnedTemplateSignature(null, msgs);
			case UMLPackage.CLASS__COLLABORATION_USE :
				return ((InternalEList<?>) getCollaborationUses())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.CLASS__GENERALIZATION :
				return ((InternalEList<?>) getGeneralizations())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.CLASS__POWERTYPE_EXTENT :
				return ((InternalEList<?>) getPowertypeExtents())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.CLASS__OWNED_USE_CASE :
				return ((InternalEList<?>) getOwnedUseCases())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.CLASS__USE_CASE :
				return ((InternalEList<?>) getUseCases()).basicRemove(otherEnd,
					msgs);
			case UMLPackage.CLASS__SUBSTITUTION :
				return ((InternalEList<?>) getSubstitutions())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.CLASS__OWNED_ATTRIBUTE :
				return ((InternalEList<?>) getOwnedAttributes())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.CLASS__OWNED_CONNECTOR :
				return ((InternalEList<?>) getOwnedConnectors())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.CLASS__INTERFACE_REALIZATION :
				return ((InternalEList<?>) getInterfaceRealizations())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.CLASS__OWNED_BEHAVIOR :
				return ((InternalEList<?>) getOwnedBehaviors())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.CLASS__OWNED_OPERATION :
				return ((InternalEList<?>) getOwnedOperations())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.CLASS__NESTED_CLASSIFIER :
				return ((InternalEList<?>) getNestedClassifiers())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.CLASS__OWNED_RECEPTION :
				return ((InternalEList<?>) getOwnedReceptions())
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
			case UMLPackage.CLASS__EANNOTATIONS :
				return getEAnnotations();
			case UMLPackage.CLASS__OWNED_COMMENT :
				return getOwnedComments();
			case UMLPackage.CLASS__OWNED_ELEMENT :
				return getOwnedElements();
			case UMLPackage.CLASS__OWNER :
				if (resolve)
					return getOwner();
				return basicGetOwner();
			case UMLPackage.CLASS__CLIENT_DEPENDENCY :
				return getClientDependencies();
			case UMLPackage.CLASS__NAME :
				return getName();
			case UMLPackage.CLASS__NAME_EXPRESSION :
				if (resolve)
					return getNameExpression();
				return basicGetNameExpression();
			case UMLPackage.CLASS__NAMESPACE :
				if (resolve)
					return getNamespace();
				return basicGetNamespace();
			case UMLPackage.CLASS__QUALIFIED_NAME :
				return getQualifiedName();
			case UMLPackage.CLASS__VISIBILITY :
				return getVisibility();
			case UMLPackage.CLASS__OWNED_RULE :
				return getOwnedRules();
			case UMLPackage.CLASS__ELEMENT_IMPORT :
				return getElementImports();
			case UMLPackage.CLASS__PACKAGE_IMPORT :
				return getPackageImports();
			case UMLPackage.CLASS__OWNED_MEMBER :
				return getOwnedMembers();
			case UMLPackage.CLASS__IMPORTED_MEMBER :
				return getImportedMembers();
			case UMLPackage.CLASS__MEMBER :
				return getMembers();
			case UMLPackage.CLASS__IS_LEAF :
				return isLeaf();
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
			case UMLPackage.CLASS__FEATURE :
				return getFeatures();
			case UMLPackage.CLASS__ATTRIBUTE :
				return getAttributes();
			case UMLPackage.CLASS__COLLABORATION_USE :
				return getCollaborationUses();
			case UMLPackage.CLASS__GENERAL :
				return getGenerals();
			case UMLPackage.CLASS__GENERALIZATION :
				return getGeneralizations();
			case UMLPackage.CLASS__POWERTYPE_EXTENT :
				return getPowertypeExtents();
			case UMLPackage.CLASS__INHERITED_MEMBER :
				return getInheritedMembers();
			case UMLPackage.CLASS__IS_ABSTRACT :
				return isAbstract();
			case UMLPackage.CLASS__IS_FINAL_SPECIALIZATION :
				return isFinalSpecialization();
			case UMLPackage.CLASS__OWNED_USE_CASE :
				return getOwnedUseCases();
			case UMLPackage.CLASS__USE_CASE :
				return getUseCases();
			case UMLPackage.CLASS__REDEFINED_CLASSIFIER :
				return getRedefinedClassifiers();
			case UMLPackage.CLASS__REPRESENTATION :
				if (resolve)
					return getRepresentation();
				return basicGetRepresentation();
			case UMLPackage.CLASS__SUBSTITUTION :
				return getSubstitutions();
			case UMLPackage.CLASS__OWNED_ATTRIBUTE :
				return getOwnedAttributes();
			case UMLPackage.CLASS__OWNED_CONNECTOR :
				return getOwnedConnectors();
			case UMLPackage.CLASS__PART :
				return getParts();
			case UMLPackage.CLASS__ROLE :
				return getRoles();
			case UMLPackage.CLASS__OWNED_PORT :
				return getOwnedPorts();
			case UMLPackage.CLASS__CLASSIFIER_BEHAVIOR :
				if (resolve)
					return getClassifierBehavior();
				return basicGetClassifierBehavior();
			case UMLPackage.CLASS__INTERFACE_REALIZATION :
				return getInterfaceRealizations();
			case UMLPackage.CLASS__OWNED_BEHAVIOR :
				return getOwnedBehaviors();
			case UMLPackage.CLASS__OWNED_OPERATION :
				return getOwnedOperations();
			case UMLPackage.CLASS__EXTENSION :
				return getExtensions();
			case UMLPackage.CLASS__IS_ACTIVE :
				return isActive();
			case UMLPackage.CLASS__NESTED_CLASSIFIER :
				return getNestedClassifiers();
			case UMLPackage.CLASS__OWNED_RECEPTION :
				return getOwnedReceptions();
			case UMLPackage.CLASS__SUPER_CLASS :
				return getSuperClasses();
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
			case UMLPackage.CLASS__EANNOTATIONS :
				getEAnnotations().clear();
				getEAnnotations()
					.addAll((Collection<? extends EAnnotation>) newValue);
				return;
			case UMLPackage.CLASS__OWNED_COMMENT :
				getOwnedComments().clear();
				getOwnedComments()
					.addAll((Collection<? extends Comment>) newValue);
				return;
			case UMLPackage.CLASS__NAME :
				setName((String) newValue);
				return;
			case UMLPackage.CLASS__NAME_EXPRESSION :
				setNameExpression((StringExpression) newValue);
				return;
			case UMLPackage.CLASS__VISIBILITY :
				setVisibility((VisibilityKind) newValue);
				return;
			case UMLPackage.CLASS__OWNED_RULE :
				getOwnedRules().clear();
				getOwnedRules()
					.addAll((Collection<? extends Constraint>) newValue);
				return;
			case UMLPackage.CLASS__ELEMENT_IMPORT :
				getElementImports().clear();
				getElementImports()
					.addAll((Collection<? extends ElementImport>) newValue);
				return;
			case UMLPackage.CLASS__PACKAGE_IMPORT :
				getPackageImports().clear();
				getPackageImports()
					.addAll((Collection<? extends PackageImport>) newValue);
				return;
			case UMLPackage.CLASS__IS_LEAF :
				setIsLeaf((Boolean) newValue);
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
				getTemplateBindings()
					.addAll((Collection<? extends TemplateBinding>) newValue);
				return;
			case UMLPackage.CLASS__OWNED_TEMPLATE_SIGNATURE :
				setOwnedTemplateSignature((TemplateSignature) newValue);
				return;
			case UMLPackage.CLASS__COLLABORATION_USE :
				getCollaborationUses().clear();
				getCollaborationUses()
					.addAll((Collection<? extends CollaborationUse>) newValue);
				return;
			case UMLPackage.CLASS__GENERAL :
				getGenerals().clear();
				getGenerals()
					.addAll((Collection<? extends Classifier>) newValue);
				return;
			case UMLPackage.CLASS__GENERALIZATION :
				getGeneralizations().clear();
				getGeneralizations()
					.addAll((Collection<? extends Generalization>) newValue);
				return;
			case UMLPackage.CLASS__POWERTYPE_EXTENT :
				getPowertypeExtents().clear();
				getPowertypeExtents()
					.addAll((Collection<? extends GeneralizationSet>) newValue);
				return;
			case UMLPackage.CLASS__IS_ABSTRACT :
				setIsAbstract((Boolean) newValue);
				return;
			case UMLPackage.CLASS__IS_FINAL_SPECIALIZATION :
				setIsFinalSpecialization((Boolean) newValue);
				return;
			case UMLPackage.CLASS__OWNED_USE_CASE :
				getOwnedUseCases().clear();
				getOwnedUseCases()
					.addAll((Collection<? extends UseCase>) newValue);
				return;
			case UMLPackage.CLASS__USE_CASE :
				getUseCases().clear();
				getUseCases().addAll((Collection<? extends UseCase>) newValue);
				return;
			case UMLPackage.CLASS__REDEFINED_CLASSIFIER :
				getRedefinedClassifiers().clear();
				getRedefinedClassifiers()
					.addAll((Collection<? extends Classifier>) newValue);
				return;
			case UMLPackage.CLASS__REPRESENTATION :
				setRepresentation((CollaborationUse) newValue);
				return;
			case UMLPackage.CLASS__SUBSTITUTION :
				getSubstitutions().clear();
				getSubstitutions()
					.addAll((Collection<? extends Substitution>) newValue);
				return;
			case UMLPackage.CLASS__OWNED_ATTRIBUTE :
				getOwnedAttributes().clear();
				getOwnedAttributes()
					.addAll((Collection<? extends Property>) newValue);
				return;
			case UMLPackage.CLASS__OWNED_CONNECTOR :
				getOwnedConnectors().clear();
				getOwnedConnectors()
					.addAll((Collection<? extends Connector>) newValue);
				return;
			case UMLPackage.CLASS__CLASSIFIER_BEHAVIOR :
				setClassifierBehavior((Behavior) newValue);
				return;
			case UMLPackage.CLASS__INTERFACE_REALIZATION :
				getInterfaceRealizations().clear();
				getInterfaceRealizations().addAll(
					(Collection<? extends InterfaceRealization>) newValue);
				return;
			case UMLPackage.CLASS__OWNED_BEHAVIOR :
				getOwnedBehaviors().clear();
				getOwnedBehaviors()
					.addAll((Collection<? extends Behavior>) newValue);
				return;
			case UMLPackage.CLASS__OWNED_OPERATION :
				getOwnedOperations().clear();
				getOwnedOperations()
					.addAll((Collection<? extends Operation>) newValue);
				return;
			case UMLPackage.CLASS__IS_ACTIVE :
				setIsActive((Boolean) newValue);
				return;
			case UMLPackage.CLASS__NESTED_CLASSIFIER :
				getNestedClassifiers().clear();
				getNestedClassifiers()
					.addAll((Collection<? extends Classifier>) newValue);
				return;
			case UMLPackage.CLASS__OWNED_RECEPTION :
				getOwnedReceptions().clear();
				getOwnedReceptions()
					.addAll((Collection<? extends Reception>) newValue);
				return;
			case UMLPackage.CLASS__SUPER_CLASS :
				getSuperClasses().clear();
				getSuperClasses().addAll(
					(Collection<? extends org.eclipse.uml2.uml.Class>) newValue);
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
			case UMLPackage.CLASS__EANNOTATIONS :
				getEAnnotations().clear();
				return;
			case UMLPackage.CLASS__OWNED_COMMENT :
				getOwnedComments().clear();
				return;
			case UMLPackage.CLASS__NAME :
				unsetName();
				return;
			case UMLPackage.CLASS__NAME_EXPRESSION :
				setNameExpression((StringExpression) null);
				return;
			case UMLPackage.CLASS__VISIBILITY :
				unsetVisibility();
				return;
			case UMLPackage.CLASS__OWNED_RULE :
				getOwnedRules().clear();
				return;
			case UMLPackage.CLASS__ELEMENT_IMPORT :
				getElementImports().clear();
				return;
			case UMLPackage.CLASS__PACKAGE_IMPORT :
				getPackageImports().clear();
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
			case UMLPackage.CLASS__COLLABORATION_USE :
				getCollaborationUses().clear();
				return;
			case UMLPackage.CLASS__GENERAL :
				getGenerals().clear();
				return;
			case UMLPackage.CLASS__GENERALIZATION :
				getGeneralizations().clear();
				return;
			case UMLPackage.CLASS__POWERTYPE_EXTENT :
				getPowertypeExtents().clear();
				return;
			case UMLPackage.CLASS__IS_ABSTRACT :
				setIsAbstract(IS_ABSTRACT_EDEFAULT);
				return;
			case UMLPackage.CLASS__IS_FINAL_SPECIALIZATION :
				setIsFinalSpecialization(IS_FINAL_SPECIALIZATION_EDEFAULT);
				return;
			case UMLPackage.CLASS__OWNED_USE_CASE :
				getOwnedUseCases().clear();
				return;
			case UMLPackage.CLASS__USE_CASE :
				getUseCases().clear();
				return;
			case UMLPackage.CLASS__REDEFINED_CLASSIFIER :
				getRedefinedClassifiers().clear();
				return;
			case UMLPackage.CLASS__REPRESENTATION :
				setRepresentation((CollaborationUse) null);
				return;
			case UMLPackage.CLASS__SUBSTITUTION :
				getSubstitutions().clear();
				return;
			case UMLPackage.CLASS__OWNED_ATTRIBUTE :
				getOwnedAttributes().clear();
				return;
			case UMLPackage.CLASS__OWNED_CONNECTOR :
				getOwnedConnectors().clear();
				return;
			case UMLPackage.CLASS__CLASSIFIER_BEHAVIOR :
				setClassifierBehavior((Behavior) null);
				return;
			case UMLPackage.CLASS__INTERFACE_REALIZATION :
				getInterfaceRealizations().clear();
				return;
			case UMLPackage.CLASS__OWNED_BEHAVIOR :
				getOwnedBehaviors().clear();
				return;
			case UMLPackage.CLASS__OWNED_OPERATION :
				getOwnedOperations().clear();
				return;
			case UMLPackage.CLASS__IS_ACTIVE :
				setIsActive(IS_ACTIVE_EDEFAULT);
				return;
			case UMLPackage.CLASS__NESTED_CLASSIFIER :
				getNestedClassifiers().clear();
				return;
			case UMLPackage.CLASS__OWNED_RECEPTION :
				getOwnedReceptions().clear();
				return;
			case UMLPackage.CLASS__SUPER_CLASS :
				getSuperClasses().clear();
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
			case UMLPackage.CLASS__EANNOTATIONS :
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UMLPackage.CLASS__OWNED_COMMENT :
				return ownedComments != null && !ownedComments.isEmpty();
			case UMLPackage.CLASS__OWNED_ELEMENT :
				return isSetOwnedElements();
			case UMLPackage.CLASS__OWNER :
				return isSetOwner();
			case UMLPackage.CLASS__CLIENT_DEPENDENCY :
				return !getClientDependencies().isEmpty();
			case UMLPackage.CLASS__NAME :
				return isSetName();
			case UMLPackage.CLASS__NAME_EXPRESSION :
				return nameExpression != null;
			case UMLPackage.CLASS__NAMESPACE :
				return isSetNamespace();
			case UMLPackage.CLASS__QUALIFIED_NAME :
				return QUALIFIED_NAME_EDEFAULT == null
					? getQualifiedName() != null
					: !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case UMLPackage.CLASS__VISIBILITY :
				return isSetVisibility();
			case UMLPackage.CLASS__OWNED_RULE :
				return ownedRules != null && !ownedRules.isEmpty();
			case UMLPackage.CLASS__ELEMENT_IMPORT :
				return elementImports != null && !elementImports.isEmpty();
			case UMLPackage.CLASS__PACKAGE_IMPORT :
				return packageImports != null && !packageImports.isEmpty();
			case UMLPackage.CLASS__OWNED_MEMBER :
				return isSetOwnedMembers();
			case UMLPackage.CLASS__IMPORTED_MEMBER :
				return !getImportedMembers().isEmpty();
			case UMLPackage.CLASS__MEMBER :
				return isSetMembers();
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
				return templateBindings != null && !templateBindings.isEmpty();
			case UMLPackage.CLASS__OWNED_TEMPLATE_SIGNATURE :
				return isSetOwnedTemplateSignature();
			case UMLPackage.CLASS__FEATURE :
				return isSetFeatures();
			case UMLPackage.CLASS__ATTRIBUTE :
				return isSetAttributes();
			case UMLPackage.CLASS__COLLABORATION_USE :
				return collaborationUses != null
					&& !collaborationUses.isEmpty();
			case UMLPackage.CLASS__GENERAL :
				return isSetGenerals();
			case UMLPackage.CLASS__GENERALIZATION :
				return generalizations != null && !generalizations.isEmpty();
			case UMLPackage.CLASS__POWERTYPE_EXTENT :
				return powertypeExtents != null && !powertypeExtents.isEmpty();
			case UMLPackage.CLASS__INHERITED_MEMBER :
				return !getInheritedMembers().isEmpty();
			case UMLPackage.CLASS__IS_ABSTRACT :
				return isSetIsAbstract();
			case UMLPackage.CLASS__IS_FINAL_SPECIALIZATION :
				return ((eFlags
					& IS_FINAL_SPECIALIZATION_EFLAG) != 0) != IS_FINAL_SPECIALIZATION_EDEFAULT;
			case UMLPackage.CLASS__OWNED_USE_CASE :
				return ownedUseCases != null && !ownedUseCases.isEmpty();
			case UMLPackage.CLASS__USE_CASE :
				return useCases != null && !useCases.isEmpty();
			case UMLPackage.CLASS__REDEFINED_CLASSIFIER :
				return redefinedClassifiers != null
					&& !redefinedClassifiers.isEmpty();
			case UMLPackage.CLASS__REPRESENTATION :
				return representation != null;
			case UMLPackage.CLASS__SUBSTITUTION :
				return substitutions != null && !substitutions.isEmpty();
			case UMLPackage.CLASS__OWNED_ATTRIBUTE :
				return isSetOwnedAttributes();
			case UMLPackage.CLASS__OWNED_CONNECTOR :
				return ownedConnectors != null && !ownedConnectors.isEmpty();
			case UMLPackage.CLASS__PART :
				return !getParts().isEmpty();
			case UMLPackage.CLASS__ROLE :
				return isSetRoles();
			case UMLPackage.CLASS__OWNED_PORT :
				return !getOwnedPorts().isEmpty();
			case UMLPackage.CLASS__CLASSIFIER_BEHAVIOR :
				return classifierBehavior != null;
			case UMLPackage.CLASS__INTERFACE_REALIZATION :
				return interfaceRealizations != null
					&& !interfaceRealizations.isEmpty();
			case UMLPackage.CLASS__OWNED_BEHAVIOR :
				return ownedBehaviors != null && !ownedBehaviors.isEmpty();
			case UMLPackage.CLASS__OWNED_OPERATION :
				return ownedOperations != null && !ownedOperations.isEmpty();
			case UMLPackage.CLASS__EXTENSION :
				return !getExtensions().isEmpty();
			case UMLPackage.CLASS__IS_ACTIVE :
				return ((eFlags & IS_ACTIVE_EFLAG) != 0) != IS_ACTIVE_EDEFAULT;
			case UMLPackage.CLASS__NESTED_CLASSIFIER :
				return nestedClassifiers != null
					&& !nestedClassifiers.isEmpty();
			case UMLPackage.CLASS__OWNED_RECEPTION :
				return ownedReceptions != null && !ownedReceptions.isEmpty();
			case UMLPackage.CLASS__SUPER_CLASS :
				return isSetSuperClasses();
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
		if (baseClass == BehavioredClassifier.class) {
			switch (derivedFeatureID) {
				case UMLPackage.CLASS__CLASSIFIER_BEHAVIOR :
					return UMLPackage.BEHAVIORED_CLASSIFIER__CLASSIFIER_BEHAVIOR;
				case UMLPackage.CLASS__INTERFACE_REALIZATION :
					return UMLPackage.BEHAVIORED_CLASSIFIER__INTERFACE_REALIZATION;
				case UMLPackage.CLASS__OWNED_BEHAVIOR :
					return UMLPackage.BEHAVIORED_CLASSIFIER__OWNED_BEHAVIOR;
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
		if (baseClass == BehavioredClassifier.class) {
			switch (baseFeatureID) {
				case UMLPackage.BEHAVIORED_CLASSIFIER__CLASSIFIER_BEHAVIOR :
					return UMLPackage.CLASS__CLASSIFIER_BEHAVIOR;
				case UMLPackage.BEHAVIORED_CLASSIFIER__INTERFACE_REALIZATION :
					return UMLPackage.CLASS__INTERFACE_REALIZATION;
				case UMLPackage.BEHAVIORED_CLASSIFIER__OWNED_BEHAVIOR :
					return UMLPackage.CLASS__OWNED_BEHAVIOR;
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
		if (baseClass == BehavioredClassifier.class) {
			switch (baseOperationID) {
				case UMLPackage.BEHAVIORED_CLASSIFIER___VALIDATE_CLASS_BEHAVIOR__DIAGNOSTICCHAIN_MAP :
					return UMLPackage.CLASS___VALIDATE_CLASS_BEHAVIOR__DIAGNOSTICCHAIN_MAP;
				case UMLPackage.BEHAVIORED_CLASSIFIER___GET_ALL_IMPLEMENTED_INTERFACES :
					return UMLPackage.CLASS___GET_ALL_IMPLEMENTED_INTERFACES;
				case UMLPackage.BEHAVIORED_CLASSIFIER___GET_IMPLEMENTED_INTERFACES :
					return UMLPackage.CLASS___GET_IMPLEMENTED_INTERFACES;
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
			case UMLPackage.CLASS___GET_EANNOTATION__STRING :
				return getEAnnotation((String) arguments.get(0));
			case UMLPackage.CLASS___VALIDATE_HAS_OWNER__DIAGNOSTICCHAIN_MAP :
				return validateHasOwner((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.CLASS___VALIDATE_NOT_OWN_SELF__DIAGNOSTICCHAIN_MAP :
				return validateNotOwnSelf((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.CLASS___ADD_KEYWORD__STRING :
				return addKeyword((String) arguments.get(0));
			case UMLPackage.CLASS___APPLY_STEREOTYPE__STEREOTYPE :
				return applyStereotype((Stereotype) arguments.get(0));
			case UMLPackage.CLASS___CREATE_EANNOTATION__STRING :
				return createEAnnotation((String) arguments.get(0));
			case UMLPackage.CLASS___DESTROY :
				destroy();
				return null;
			case UMLPackage.CLASS___GET_KEYWORDS :
				return getKeywords();
			case UMLPackage.CLASS___GET_APPLICABLE_STEREOTYPE__STRING :
				return getApplicableStereotype((String) arguments.get(0));
			case UMLPackage.CLASS___GET_APPLICABLE_STEREOTYPES :
				return getApplicableStereotypes();
			case UMLPackage.CLASS___GET_APPLIED_STEREOTYPE__STRING :
				return getAppliedStereotype((String) arguments.get(0));
			case UMLPackage.CLASS___GET_APPLIED_STEREOTYPES :
				return getAppliedStereotypes();
			case UMLPackage.CLASS___GET_APPLIED_SUBSTEREOTYPE__STEREOTYPE_STRING :
				return getAppliedSubstereotype((Stereotype) arguments.get(0),
					(String) arguments.get(1));
			case UMLPackage.CLASS___GET_APPLIED_SUBSTEREOTYPES__STEREOTYPE :
				return getAppliedSubstereotypes((Stereotype) arguments.get(0));
			case UMLPackage.CLASS___GET_MODEL :
				return getModel();
			case UMLPackage.CLASS___GET_NEAREST_PACKAGE :
				return getNearestPackage();
			case UMLPackage.CLASS___GET_RELATIONSHIPS :
				return getRelationships();
			case UMLPackage.CLASS___GET_RELATIONSHIPS__ECLASS :
				return getRelationships((EClass) arguments.get(0));
			case UMLPackage.CLASS___GET_REQUIRED_STEREOTYPE__STRING :
				return getRequiredStereotype((String) arguments.get(0));
			case UMLPackage.CLASS___GET_REQUIRED_STEREOTYPES :
				return getRequiredStereotypes();
			case UMLPackage.CLASS___GET_SOURCE_DIRECTED_RELATIONSHIPS :
				return getSourceDirectedRelationships();
			case UMLPackage.CLASS___GET_SOURCE_DIRECTED_RELATIONSHIPS__ECLASS :
				return getSourceDirectedRelationships(
					(EClass) arguments.get(0));
			case UMLPackage.CLASS___GET_STEREOTYPE_APPLICATION__STEREOTYPE :
				return getStereotypeApplication((Stereotype) arguments.get(0));
			case UMLPackage.CLASS___GET_STEREOTYPE_APPLICATIONS :
				return getStereotypeApplications();
			case UMLPackage.CLASS___GET_TARGET_DIRECTED_RELATIONSHIPS :
				return getTargetDirectedRelationships();
			case UMLPackage.CLASS___GET_TARGET_DIRECTED_RELATIONSHIPS__ECLASS :
				return getTargetDirectedRelationships(
					(EClass) arguments.get(0));
			case UMLPackage.CLASS___GET_VALUE__STEREOTYPE_STRING :
				return getValue((Stereotype) arguments.get(0),
					(String) arguments.get(1));
			case UMLPackage.CLASS___HAS_KEYWORD__STRING :
				return hasKeyword((String) arguments.get(0));
			case UMLPackage.CLASS___HAS_VALUE__STEREOTYPE_STRING :
				return hasValue((Stereotype) arguments.get(0),
					(String) arguments.get(1));
			case UMLPackage.CLASS___IS_STEREOTYPE_APPLICABLE__STEREOTYPE :
				return isStereotypeApplicable((Stereotype) arguments.get(0));
			case UMLPackage.CLASS___IS_STEREOTYPE_APPLIED__STEREOTYPE :
				return isStereotypeApplied((Stereotype) arguments.get(0));
			case UMLPackage.CLASS___IS_STEREOTYPE_REQUIRED__STEREOTYPE :
				return isStereotypeRequired((Stereotype) arguments.get(0));
			case UMLPackage.CLASS___REMOVE_KEYWORD__STRING :
				return removeKeyword((String) arguments.get(0));
			case UMLPackage.CLASS___SET_VALUE__STEREOTYPE_STRING_OBJECT :
				setValue((Stereotype) arguments.get(0),
					(String) arguments.get(1), arguments.get(2));
				return null;
			case UMLPackage.CLASS___UNAPPLY_STEREOTYPE__STEREOTYPE :
				return unapplyStereotype((Stereotype) arguments.get(0));
			case UMLPackage.CLASS___ALL_OWNED_ELEMENTS :
				return allOwnedElements();
			case UMLPackage.CLASS___MUST_BE_OWNED :
				return mustBeOwned();
			case UMLPackage.CLASS___VALIDATE_VISIBILITY_NEEDS_OWNERSHIP__DIAGNOSTICCHAIN_MAP :
				return validateVisibilityNeedsOwnership(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.CLASS___VALIDATE_HAS_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP :
				return validateHasQualifiedName(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.CLASS___VALIDATE_HAS_NO_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP :
				return validateHasNoQualifiedName(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.CLASS___CREATE_DEPENDENCY__NAMEDELEMENT :
				return createDependency((NamedElement) arguments.get(0));
			case UMLPackage.CLASS___CREATE_USAGE__NAMEDELEMENT :
				return createUsage((NamedElement) arguments.get(0));
			case UMLPackage.CLASS___GET_LABEL :
				return getLabel();
			case UMLPackage.CLASS___GET_LABEL__BOOLEAN :
				return getLabel((Boolean) arguments.get(0));
			case UMLPackage.CLASS___GET_NAMESPACE :
				return getNamespace();
			case UMLPackage.CLASS___ALL_NAMESPACES :
				return allNamespaces();
			case UMLPackage.CLASS___ALL_OWNING_PACKAGES :
				return allOwningPackages();
			case UMLPackage.CLASS___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE :
				return isDistinguishableFrom((NamedElement) arguments.get(0),
					(Namespace) arguments.get(1));
			case UMLPackage.CLASS___GET_QUALIFIED_NAME :
				return getQualifiedName();
			case UMLPackage.CLASS___SEPARATOR :
				return separator();
			case UMLPackage.CLASS___GET_CLIENT_DEPENDENCIES :
				return getClientDependencies();
			case UMLPackage.CLASS___VALIDATE_MEMBERS_DISTINGUISHABLE__DIAGNOSTICCHAIN_MAP :
				return validateMembersDistinguishable(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.CLASS___VALIDATE_CANNOT_IMPORT_SELF__DIAGNOSTICCHAIN_MAP :
				return validateCannotImportSelf(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.CLASS___VALIDATE_CANNOT_IMPORT_OWNED_MEMBERS__DIAGNOSTICCHAIN_MAP :
				return validateCannotImportOwnedMembers(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.CLASS___CREATE_ELEMENT_IMPORT__PACKAGEABLEELEMENT_VISIBILITYKIND :
				return createElementImport(
					(PackageableElement) arguments.get(0),
					(VisibilityKind) arguments.get(1));
			case UMLPackage.CLASS___CREATE_PACKAGE_IMPORT__PACKAGE_VISIBILITYKIND :
				return createPackageImport(
					(org.eclipse.uml2.uml.Package) arguments.get(0),
					(VisibilityKind) arguments.get(1));
			case UMLPackage.CLASS___GET_IMPORTED_ELEMENTS :
				return getImportedElements();
			case UMLPackage.CLASS___GET_IMPORTED_PACKAGES :
				return getImportedPackages();
			case UMLPackage.CLASS___GET_OWNED_MEMBERS :
				return getOwnedMembers();
			case UMLPackage.CLASS___EXCLUDE_COLLISIONS__ELIST :
				return excludeCollisions(
					(EList<PackageableElement>) arguments.get(0));
			case UMLPackage.CLASS___GET_NAMES_OF_MEMBER__NAMEDELEMENT :
				return getNamesOfMember((NamedElement) arguments.get(0));
			case UMLPackage.CLASS___IMPORT_MEMBERS__ELIST :
				return importMembers(
					(EList<PackageableElement>) arguments.get(0));
			case UMLPackage.CLASS___GET_IMPORTED_MEMBERS :
				return getImportedMembers();
			case UMLPackage.CLASS___MEMBERS_ARE_DISTINGUISHABLE :
				return membersAreDistinguishable();
			case UMLPackage.CLASS___VALIDATE_REDEFINITION_CONSISTENT__DIAGNOSTICCHAIN_MAP :
				return validateRedefinitionConsistent(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.CLASS___VALIDATE_NON_LEAF_REDEFINITION__DIAGNOSTICCHAIN_MAP :
				return validateNonLeafRedefinition(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.CLASS___VALIDATE_REDEFINITION_CONTEXT_VALID__DIAGNOSTICCHAIN_MAP :
				return validateRedefinitionContextValid(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.CLASS___IS_CONSISTENT_WITH__REDEFINABLEELEMENT :
				return isConsistentWith((RedefinableElement) arguments.get(0));
			case UMLPackage.CLASS___IS_REDEFINITION_CONTEXT_VALID__REDEFINABLEELEMENT :
				return isRedefinitionContextValid(
					(RedefinableElement) arguments.get(0));
			case UMLPackage.CLASS___IS_COMPATIBLE_WITH__PARAMETERABLEELEMENT :
				return isCompatibleWith(
					(ParameterableElement) arguments.get(0));
			case UMLPackage.CLASS___IS_TEMPLATE_PARAMETER :
				return isTemplateParameter();
			case UMLPackage.CLASS___VALIDATE_NAMESPACE_NEEDS_VISIBILITY__DIAGNOSTICCHAIN_MAP :
				return validateNamespaceNeedsVisibility(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.CLASS___CREATE_ASSOCIATION__BOOLEAN_AGGREGATIONKIND_STRING_INT_INT_TYPE_BOOLEAN_AGGREGATIONKIND_STRING_INT_INT :
				return createAssociation((Boolean) arguments.get(0),
					(AggregationKind) arguments.get(1),
					(String) arguments.get(2), (Integer) arguments.get(3),
					(Integer) arguments.get(4), (Type) arguments.get(5),
					(Boolean) arguments.get(6),
					(AggregationKind) arguments.get(7),
					(String) arguments.get(8), (Integer) arguments.get(9),
					(Integer) arguments.get(10));
			case UMLPackage.CLASS___GET_ASSOCIATIONS :
				return getAssociations();
			case UMLPackage.CLASS___CONFORMS_TO__TYPE :
				return conformsTo((Type) arguments.get(0));
			case UMLPackage.CLASS___IS_TEMPLATE :
				return isTemplate();
			case UMLPackage.CLASS___PARAMETERABLE_ELEMENTS :
				return parameterableElements();
			case UMLPackage.CLASS___VALIDATE_SPECIALIZE_TYPE__DIAGNOSTICCHAIN_MAP :
				return validateSpecializeType(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.CLASS___VALIDATE_MAPS_TO_GENERALIZATION_SET__DIAGNOSTICCHAIN_MAP :
				return validateMapsToGeneralizationSet(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.CLASS___VALIDATE_NON_FINAL_PARENTS__DIAGNOSTICCHAIN_MAP :
				return validateNonFinalParents(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.CLASS___VALIDATE_NO_CYCLES_IN_GENERALIZATION__DIAGNOSTICCHAIN_MAP :
				return validateNoCyclesInGeneralization(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.CLASS___GET_ALL_ATTRIBUTES :
				return getAllAttributes();
			case UMLPackage.CLASS___GET_ALL_OPERATIONS :
				return getAllOperations();
			case UMLPackage.CLASS___GET_ALL_USED_INTERFACES :
				return getAllUsedInterfaces();
			case UMLPackage.CLASS___GET_OPERATION__STRING_ELIST_ELIST :
				return getOperation((String) arguments.get(0),
					(EList<String>) arguments.get(1),
					(EList<Type>) arguments.get(2));
			case UMLPackage.CLASS___GET_OPERATION__STRING_ELIST_ELIST_BOOLEAN :
				return getOperation((String) arguments.get(0),
					(EList<String>) arguments.get(1),
					(EList<Type>) arguments.get(2), (Boolean) arguments.get(3));
			case UMLPackage.CLASS___GET_OPERATIONS :
				return getOperations();
			case UMLPackage.CLASS___GET_USED_INTERFACES :
				return getUsedInterfaces();
			case UMLPackage.CLASS___ALL_FEATURES :
				return allFeatures();
			case UMLPackage.CLASS___ALL_PARENTS :
				return allParents();
			case UMLPackage.CLASS___GET_GENERALS :
				return getGenerals();
			case UMLPackage.CLASS___HAS_VISIBILITY_OF__NAMEDELEMENT :
				return hasVisibilityOf((NamedElement) arguments.get(0));
			case UMLPackage.CLASS___INHERIT__ELIST :
				return inherit((EList<NamedElement>) arguments.get(0));
			case UMLPackage.CLASS___INHERITABLE_MEMBERS__CLASSIFIER :
				return inheritableMembers((Classifier) arguments.get(0));
			case UMLPackage.CLASS___GET_INHERITED_MEMBERS :
				return getInheritedMembers();
			case UMLPackage.CLASS___MAY_SPECIALIZE_TYPE__CLASSIFIER :
				return maySpecializeType((Classifier) arguments.get(0));
			case UMLPackage.CLASS___PARENTS :
				return parents();
			case UMLPackage.CLASS___DIRECTLY_REALIZED_INTERFACES :
				return directlyRealizedInterfaces();
			case UMLPackage.CLASS___DIRECTLY_USED_INTERFACES :
				return directlyUsedInterfaces();
			case UMLPackage.CLASS___ALL_REALIZED_INTERFACES :
				return allRealizedInterfaces();
			case UMLPackage.CLASS___ALL_USED_INTERFACES :
				return allUsedInterfaces();
			case UMLPackage.CLASS___IS_SUBSTITUTABLE_FOR__CLASSIFIER :
				return isSubstitutableFor((Classifier) arguments.get(0));
			case UMLPackage.CLASS___ALL_ATTRIBUTES :
				return allAttributes();
			case UMLPackage.CLASS___ALL_SLOTTABLE_FEATURES :
				return allSlottableFeatures();
			case UMLPackage.CLASS___CREATE_OWNED_ATTRIBUTE__STRING_TYPE_INT_INT :
				return createOwnedAttribute((String) arguments.get(0),
					(Type) arguments.get(1), (Integer) arguments.get(2),
					(Integer) arguments.get(3));
			case UMLPackage.CLASS___GET_PARTS :
				return getParts();
			case UMLPackage.CLASS___ALL_ROLES :
				return allRoles();
			case UMLPackage.CLASS___GET_OWNED_PORTS :
				return getOwnedPorts();
			case UMLPackage.CLASS___VALIDATE_CLASS_BEHAVIOR__DIAGNOSTICCHAIN_MAP :
				return validateClassBehavior((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.CLASS___GET_ALL_IMPLEMENTED_INTERFACES :
				return getAllImplementedInterfaces();
			case UMLPackage.CLASS___GET_IMPLEMENTED_INTERFACES :
				return getImplementedInterfaces();
			case UMLPackage.CLASS___VALIDATE_PASSIVE_CLASS__DIAGNOSTICCHAIN_MAP :
				return validatePassiveClass((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.CLASS___CREATE_OWNED_OPERATION__STRING_ELIST_ELIST_TYPE :
				return createOwnedOperation((String) arguments.get(0),
					(EList<String>) arguments.get(1),
					(EList<Type>) arguments.get(2), (Type) arguments.get(3));
			case UMLPackage.CLASS___IS_METACLASS :
				return isMetaclass();
			case UMLPackage.CLASS___GET_EXTENSIONS :
				return getExtensions();
			case UMLPackage.CLASS___GET_SUPER_CLASSES :
				return getSuperClasses();
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
		result.append(" (isActive: "); //$NON-NLS-1$
		result.append((eFlags & IS_ACTIVE_EFLAG) != 0);
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
		return super.isSetOwnedMembers() || isSetOwnedAttributes()
			|| eIsSet(UMLPackage.CLASS__OWNED_BEHAVIOR)
			|| eIsSet(UMLPackage.CLASS__OWNED_OPERATION)
			|| eIsSet(UMLPackage.CLASS__NESTED_CLASSIFIER)
			|| eIsSet(UMLPackage.CLASS__OWNED_RECEPTION);
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
		UMLPackage.CLASS__OWNED_COMMENT, UMLPackage.CLASS__NAME_EXPRESSION,
		UMLPackage.CLASS__ELEMENT_IMPORT, UMLPackage.CLASS__PACKAGE_IMPORT,
		UMLPackage.CLASS__OWNED_MEMBER, UMLPackage.CLASS__TEMPLATE_BINDING,
		UMLPackage.CLASS__OWNED_TEMPLATE_SIGNATURE,
		UMLPackage.CLASS__COLLABORATION_USE, UMLPackage.CLASS__GENERALIZATION,
		UMLPackage.CLASS__SUBSTITUTION,
		UMLPackage.CLASS__INTERFACE_REALIZATION};

	/**
	 * The array of subset feature identifiers for the '{@link #getOwnedMembers() <em>Owned Member</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedMembers()
	 * @generated
	 * @ordered
	 */
	protected static final int[] OWNED_MEMBER_ESUBSETS = new int[]{
		UMLPackage.CLASS__OWNED_RULE, UMLPackage.CLASS__OWNED_USE_CASE,
		UMLPackage.CLASS__OWNED_ATTRIBUTE, UMLPackage.CLASS__OWNED_CONNECTOR,
		UMLPackage.CLASS__OWNED_BEHAVIOR, UMLPackage.CLASS__OWNED_OPERATION,
		UMLPackage.CLASS__NESTED_CLASSIFIER, UMLPackage.CLASS__OWNED_RECEPTION};

	/**
	 * The array of subset feature identifiers for the '{@link #getOwnedBehaviors() <em>Owned Behavior</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedBehaviors()
	 * @generated
	 * @ordered
	 */
	protected static final int[] OWNED_BEHAVIOR_ESUBSETS = new int[]{
		UMLPackage.CLASS__CLASSIFIER_BEHAVIOR};

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
	public InterfaceRealization createInterfaceRealization(String name,
			Interface contract) {
		InterfaceRealization newInterfaceRealization = (InterfaceRealization) create(
			UMLPackage.Literals.INTERFACE_REALIZATION);
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
	@Override
	public boolean isSetOwnedElements() {
		return super.isSetOwnedElements()
			|| eIsSet(UMLPackage.CLASS__INTERFACE_REALIZATION);
	}

	/**
	 * The array of subset feature identifiers for the '{@link #getFeatures() <em>Feature</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeatures()
	 * @generated
	 * @ordered
	 */
	protected static final int[] FEATURE_ESUBSETS = new int[]{
		UMLPackage.CLASS__ATTRIBUTE, UMLPackage.CLASS__OWNED_CONNECTOR,
		UMLPackage.CLASS__OWNED_OPERATION, UMLPackage.CLASS__OWNED_RECEPTION};

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetFeatures() {
		return super.isSetFeatures()
			|| eIsSet(UMLPackage.CLASS__OWNED_OPERATION)
			|| eIsSet(UMLPackage.CLASS__OWNED_RECEPTION);
	}

	/**
	 * The array of subset feature identifiers for the '{@link #getAttributes() <em>Attribute</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributes()
	 * @generated
	 * @ordered
	 */
	protected static final int[] ATTRIBUTE_ESUBSETS = new int[]{
		UMLPackage.CLASS__OWNED_ATTRIBUTE};

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetAttributes() {
		return super.isSetAttributes() || isSetOwnedAttributes();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Classifier> getGenerals() {
		@SuppressWarnings("unchecked")
		EList<Classifier> superClass = (EList<Classifier>) ((EList<?>) getSuperClasses());
		return superClass;
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
