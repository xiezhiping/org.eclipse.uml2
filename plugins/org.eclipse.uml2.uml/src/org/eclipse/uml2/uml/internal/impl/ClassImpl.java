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
 * $Id: ClassImpl.java,v 1.1 2005/11/14 22:26:04 khussey Exp $
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
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.uml2.common.util.DerivedUnionEObjectEList;
import org.eclipse.uml2.common.util.SubsetEObjectContainmentWithInverseEList;
import org.eclipse.uml2.common.util.SupersetEObjectContainmentEList;
import org.eclipse.uml2.common.util.SupersetEObjectWithInverseResolvingEList;

import org.eclipse.uml2.uml.Behavior;
import org.eclipse.uml2.uml.BehavioredClassifier;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.CollaborationUse;
import org.eclipse.uml2.uml.Dependency;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Extension;
import org.eclipse.uml2.uml.Feature;
import org.eclipse.uml2.uml.InterfaceRealization;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Operation;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.Reception;
import org.eclipse.uml2.uml.RedefinableTemplateSignature;
import org.eclipse.uml2.uml.StringExpression;
import org.eclipse.uml2.uml.TemplateParameter;
import org.eclipse.uml2.uml.TemplateSignature;
import org.eclipse.uml2.uml.Trigger;
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
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ClassImpl#getOwnedOperations <em>Owned Operation</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ClassImpl#getNestedClassifiers <em>Nested Classifier</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ClassImpl#getSuperClasses <em>Super Class</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ClassImpl#isActive <em>Is Active</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ClassImpl#getOwnedReceptions <em>Owned Reception</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ClassImpl#getExtensions <em>Extension</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ClassImpl#getOwnedAttributes <em>Owned Attribute</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ClassImpl#isAbstract <em>Is Abstract</em>}</li>
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
		return UMLPackage.eINSTANCE.getClass_();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List getOwnedMembers() {
		List ownedMember = (List) eVirtualGet(UMLPackage.CLASS__OWNED_MEMBER);
		if (ownedMember == null) {
			eVirtualSet(UMLPackage.CLASS__OWNED_MEMBER,
				ownedMember = new DerivedUnionEObjectEList(NamedElement.class,
					this, UMLPackage.CLASS__OWNED_MEMBER,
					new EStructuralFeature[]{
						UMLPackage.eINSTANCE.getNamespace_OwnedRule(),
						UMLPackage.eINSTANCE.getClassifier_OwnedUseCase(),
						UMLPackage.eINSTANCE
							.getStructuredClassifier_OwnedAttribute(),
						UMLPackage.eINSTANCE
							.getStructuredClassifier_OwnedConnector(),
						UMLPackage.eINSTANCE
							.getBehavioredClassifier_OwnedBehavior(),
						UMLPackage.eINSTANCE
							.getBehavioredClassifier_OwnedTrigger(),
						UMLPackage.eINSTANCE.getClass_OwnedOperation(),
						UMLPackage.eINSTANCE.getClass_NestedClassifier(),
						UMLPackage.eINSTANCE.getClass_OwnedReception()}));
		}
		return ownedMember;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List getOwnedElements() {
		List ownedElement = (List) eVirtualGet(UMLPackage.CLASS__OWNED_ELEMENT);
		if (ownedElement == null) {
			eVirtualSet(UMLPackage.CLASS__OWNED_ELEMENT,
				ownedElement = new DerivedUnionEObjectEList(Element.class,
					this, UMLPackage.CLASS__OWNED_ELEMENT,
					new EStructuralFeature[]{
						UMLPackage.eINSTANCE.getElement_OwnedComment(),
						UMLPackage.eINSTANCE.getNamedElement_NameExpression(),
						UMLPackage.eINSTANCE.getNamespace_ElementImport(),
						UMLPackage.eINSTANCE.getNamespace_PackageImport(),
						UMLPackage.eINSTANCE.getNamespace_OwnedMember(),
						UMLPackage.eINSTANCE
							.getTemplateableElement_TemplateBinding(),
						UMLPackage.eINSTANCE
							.getTemplateableElement_OwnedTemplateSignature(),
						UMLPackage.eINSTANCE.getClassifier_Generalization(),
						UMLPackage.eINSTANCE.getClassifier_Substitution(),
						UMLPackage.eINSTANCE.getClassifier_CollaborationUse(),
						UMLPackage.eINSTANCE.getClassifier_OwnedSignature(),
						UMLPackage.eINSTANCE
							.getBehavioredClassifier_InterfaceRealization()}));
		}
		return ownedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List getOwnedBehaviors() {
		List ownedBehavior = (List) eVirtualGet(UMLPackage.CLASS__OWNED_BEHAVIOR);
		if (ownedBehavior == null) {
			eVirtualSet(UMLPackage.CLASS__OWNED_BEHAVIOR,
				ownedBehavior = new SupersetEObjectContainmentEList(
					Behavior.class, this, UMLPackage.CLASS__OWNED_BEHAVIOR,
					new int[]{UMLPackage.CLASS__CLASSIFIER_BEHAVIOR}));
		}
		return ownedBehavior;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Behavior createOwnedBehavior(EClass eClass) {
		Behavior newOwnedBehavior = (Behavior) eClass.getEPackage()
			.getEFactoryInstance().create(eClass);
		getOwnedBehaviors().add(newOwnedBehavior);
		return newOwnedBehavior;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Behavior createOwnedBehavior() {
		Behavior newOwnedBehavior = UMLFactory.eINSTANCE.createBehavior();
		getOwnedBehaviors().add(newOwnedBehavior);
		return newOwnedBehavior;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Behavior getOwnedBehavior(String name) {
		for (Iterator i = getOwnedBehaviors().iterator(); i.hasNext();) {
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
	public List getClientDependencies() {
		List clientDependency = (List) eVirtualGet(UMLPackage.CLASS__CLIENT_DEPENDENCY);
		if (clientDependency == null) {
			eVirtualSet(
				UMLPackage.CLASS__CLIENT_DEPENDENCY,
				clientDependency = new SupersetEObjectWithInverseResolvingEList.ManyInverse(
					Dependency.class, this,
					UMLPackage.CLASS__CLIENT_DEPENDENCY, new int[]{
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
		return classifierBehavior;
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
	public List getInterfaceRealizations() {
		List interfaceRealization = (List) eVirtualGet(UMLPackage.CLASS__INTERFACE_REALIZATION);
		if (interfaceRealization == null) {
			eVirtualSet(
				UMLPackage.CLASS__INTERFACE_REALIZATION,
				interfaceRealization = new SubsetEObjectContainmentWithInverseEList(
					InterfaceRealization.class, this,
					UMLPackage.CLASS__INTERFACE_REALIZATION,
					new int[]{UMLPackage.CLASS__CLIENT_DEPENDENCY},
					UMLPackage.INTERFACE_REALIZATION__IMPLEMENTING_CLASSIFIER));
		}
		return interfaceRealization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterfaceRealization createInterfaceRealization() {
		InterfaceRealization newInterfaceRealization = UMLFactory.eINSTANCE
			.createInterfaceRealization();
		getInterfaceRealizations().add(newInterfaceRealization);
		return newInterfaceRealization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterfaceRealization getInterfaceRealization(String name) {
		for (Iterator i = getInterfaceRealizations().iterator(); i.hasNext();) {
			InterfaceRealization interfaceRealization = (InterfaceRealization) i
				.next();
			if (name.equals(interfaceRealization.getName())) {
				return interfaceRealization;
			}
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List getOwnedTriggers() {
		List ownedTrigger = (List) eVirtualGet(UMLPackage.CLASS__OWNED_TRIGGER);
		if (ownedTrigger == null) {
			eVirtualSet(UMLPackage.CLASS__OWNED_TRIGGER,
				ownedTrigger = new EObjectContainmentEList(Trigger.class, this,
					UMLPackage.CLASS__OWNED_TRIGGER));
		}
		return ownedTrigger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Trigger createOwnedTrigger() {
		Trigger newOwnedTrigger = UMLFactory.eINSTANCE.createTrigger();
		getOwnedTriggers().add(newOwnedTrigger);
		return newOwnedTrigger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Trigger getOwnedTrigger(String name) {
		for (Iterator i = getOwnedTriggers().iterator(); i.hasNext();) {
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
	public List getFeatures() {
		List feature = (List) eVirtualGet(UMLPackage.CLASS__FEATURE);
		if (feature == null) {
			eVirtualSet(UMLPackage.CLASS__FEATURE,
				feature = new DerivedUnionEObjectEList(Feature.class, this,
					UMLPackage.CLASS__FEATURE, new EStructuralFeature[]{
						UMLPackage.eINSTANCE.getClassifier_Attribute(),
						UMLPackage.eINSTANCE
							.getStructuredClassifier_OwnedConnector(),
						UMLPackage.eINSTANCE.getClass_OwnedOperation(),
						UMLPackage.eINSTANCE.getClass_OwnedReception()}));
		}
		return feature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List getAttributes() {
		List attribute = (List) eVirtualGet(UMLPackage.CLASS__ATTRIBUTE);
		if (attribute == null) {
			eVirtualSet(UMLPackage.CLASS__ATTRIBUTE,
				attribute = new DerivedUnionEObjectEList(Property.class, this,
					UMLPackage.CLASS__ATTRIBUTE,
					new EStructuralFeature[]{UMLPackage.eINSTANCE
						.getStructuredClassifier_OwnedAttribute()}));
		}
		return attribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List getOwnedOperations() {
		List ownedOperation = (List) eVirtualGet(UMLPackage.CLASS__OWNED_OPERATION);
		if (ownedOperation == null) {
			eVirtualSet(UMLPackage.CLASS__OWNED_OPERATION,
				ownedOperation = new EObjectContainmentWithInverseEList(
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
	public Operation createOwnedOperation() {
		Operation newOwnedOperation = UMLFactory.eINSTANCE.createOperation();
		getOwnedOperations().add(newOwnedOperation);
		return newOwnedOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operation getOwnedOperation(String name) {
		for (Iterator i = getOwnedOperations().iterator(); i.hasNext();) {
			Operation ownedOperation = (Operation) i.next();
			if (name.equals(ownedOperation.getName())) {
				return ownedOperation;
			}
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List getNestedClassifiers() {
		List nestedClassifier = (List) eVirtualGet(UMLPackage.CLASS__NESTED_CLASSIFIER);
		if (nestedClassifier == null) {
			eVirtualSet(
				UMLPackage.CLASS__NESTED_CLASSIFIER,
				nestedClassifier = new EObjectContainmentEList(
					Classifier.class, this, UMLPackage.CLASS__NESTED_CLASSIFIER));
		}
		return nestedClassifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Classifier createNestedClassifier(EClass eClass) {
		Classifier newNestedClassifier = (Classifier) eClass.getEPackage()
			.getEFactoryInstance().create(eClass);
		getNestedClassifiers().add(newNestedClassifier);
		return newNestedClassifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Classifier getNestedClassifier(String name) {
		for (Iterator i = getNestedClassifiers().iterator(); i.hasNext();) {
			Classifier nestedClassifier = (Classifier) i.next();
			if (name.equals(nestedClassifier.getName())) {
				return nestedClassifier;
			}
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List getSuperClasses() {
		// TODO: implement this method to return the 'Super Class' reference list
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.uml2.uml.Class getSuperClass(String name) {
		for (Iterator i = getSuperClasses().iterator(); i.hasNext();) {
			org.eclipse.uml2.uml.Class superClass = (org.eclipse.uml2.uml.Class) i
				.next();
			if (name.equals(superClass.getName())) {
				return superClass;
			}
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
	public List getOwnedReceptions() {
		List ownedReception = (List) eVirtualGet(UMLPackage.CLASS__OWNED_RECEPTION);
		if (ownedReception == null) {
			eVirtualSet(UMLPackage.CLASS__OWNED_RECEPTION,
				ownedReception = new EObjectContainmentEList(Reception.class,
					this, UMLPackage.CLASS__OWNED_RECEPTION));
		}
		return ownedReception;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reception createOwnedReception() {
		Reception newOwnedReception = UMLFactory.eINSTANCE.createReception();
		getOwnedReceptions().add(newOwnedReception);
		return newOwnedReception;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reception getOwnedReception(String name) {
		for (Iterator i = getOwnedReceptions().iterator(); i.hasNext();) {
			Reception ownedReception = (Reception) i.next();
			if (name.equals(ownedReception.getName())) {
				return ownedReception;
			}
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List getExtensions() {
		// TODO: implement this method to return the 'Extension' reference list
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Extension getExtension(String name) {
		for (Iterator i = getExtensions().iterator(); i.hasNext();) {
			Extension extension = (Extension) i.next();
			if (name.equals(extension.getName())) {
				return extension;
			}
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List getOwnedAttributes() {
		List ownedAttribute = (List) eVirtualGet(UMLPackage.CLASS__OWNED_ATTRIBUTE);
		if (ownedAttribute == null) {
			eVirtualSet(UMLPackage.CLASS__OWNED_ATTRIBUTE,
				ownedAttribute = new EObjectContainmentWithInverseEList(
					Property.class, this, UMLPackage.CLASS__OWNED_ATTRIBUTE,
					UMLPackage.PROPERTY__CLASS_));
		}
		return ownedAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property createOwnedAttribute(EClass eClass) {
		Property newOwnedAttribute = (Property) eClass.getEPackage()
			.getEFactoryInstance().create(eClass);
		getOwnedAttributes().add(newOwnedAttribute);
		return newOwnedAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property createOwnedAttribute() {
		Property newOwnedAttribute = UMLFactory.eINSTANCE.createProperty();
		getOwnedAttributes().add(newOwnedAttribute);
		return newOwnedAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property getOwnedAttribute(String name) {
		for (Iterator i = getOwnedAttributes().iterator(); i.hasNext();) {
			Property ownedAttribute = (Property) i.next();
			if (name.equals(ownedAttribute.getName())) {
				return ownedAttribute;
			}
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOwnedAttributes() {
		List ownedAttribute = (List) eVirtualGet(UMLPackage.CLASS__OWNED_ATTRIBUTE);
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
	public List inherit(List inhs) {
		return ClassOperations.inherit(this, inhs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd,
			int featureID, Class baseClass, NotificationChain msgs) {
		if (featureID >= 0) {
			switch (eDerivedStructuralFeatureID(featureID, baseClass)) {
				case UMLPackage.CLASS__EANNOTATIONS :
					return ((InternalEList) getEAnnotations()).basicAdd(
						otherEnd, msgs);
				case UMLPackage.CLASS__CLIENT_DEPENDENCY :
					return ((InternalEList) getClientDependencies()).basicAdd(
						otherEnd, msgs);
				case UMLPackage.CLASS__ELEMENT_IMPORT :
					return ((InternalEList) getElementImports()).basicAdd(
						otherEnd, msgs);
				case UMLPackage.CLASS__PACKAGE_IMPORT :
					return ((InternalEList) getPackageImports()).basicAdd(
						otherEnd, msgs);
				case UMLPackage.CLASS__OWNED_RULE :
					return ((InternalEList) getOwnedRules()).basicAdd(otherEnd,
						msgs);
				case UMLPackage.CLASS__TEMPLATE_PARAMETER :
					TemplateParameter templateParameter = (TemplateParameter) eVirtualGet(UMLPackage.CLASS__TEMPLATE_PARAMETER);
					if (templateParameter != null)
						msgs = ((InternalEObject) templateParameter)
							.eInverseRemove(
								this,
								UMLPackage.TEMPLATE_PARAMETER__PARAMETERED_ELEMENT,
								TemplateParameter.class, msgs);
					return basicSetTemplateParameter(
						(TemplateParameter) otherEnd, msgs);
				case UMLPackage.CLASS__OWNING_TEMPLATE_PARAMETER :
					if (eContainer != null)
						msgs = eBasicRemoveFromContainer(msgs);
					return eBasicSetContainer(otherEnd,
						UMLPackage.CLASS__OWNING_TEMPLATE_PARAMETER, msgs);
				case UMLPackage.CLASS__TEMPLATE_BINDING :
					return ((InternalEList) getTemplateBindings()).basicAdd(
						otherEnd, msgs);
				case UMLPackage.CLASS__OWNED_TEMPLATE_SIGNATURE :
					TemplateSignature ownedTemplateSignature = (TemplateSignature) eVirtualGet(UMLPackage.CLASS__OWNED_TEMPLATE_SIGNATURE);
					if (ownedTemplateSignature != null)
						msgs = ((InternalEObject) ownedTemplateSignature)
							.eInverseRemove(this, EOPPOSITE_FEATURE_BASE
								- UMLPackage.CLASS__OWNED_TEMPLATE_SIGNATURE,
								null, msgs);
					return basicSetOwnedTemplateSignature(
						(TemplateSignature) otherEnd, msgs);
				case UMLPackage.CLASS__GENERALIZATION :
					return ((InternalEList) getGeneralizations()).basicAdd(
						otherEnd, msgs);
				case UMLPackage.CLASS__POWERTYPE_EXTENT :
					return ((InternalEList) getPowertypeExtents()).basicAdd(
						otherEnd, msgs);
				case UMLPackage.CLASS__USE_CASE :
					return ((InternalEList) getUseCases()).basicAdd(otherEnd,
						msgs);
				case UMLPackage.CLASS__SUBSTITUTION :
					return ((InternalEList) getSubstitutions()).basicAdd(
						otherEnd, msgs);
				case UMLPackage.CLASS__OWNED_SIGNATURE :
					RedefinableTemplateSignature ownedSignature = (RedefinableTemplateSignature) eVirtualGet(UMLPackage.CLASS__OWNED_SIGNATURE);
					if (ownedSignature != null)
						msgs = ((InternalEObject) ownedSignature)
							.eInverseRemove(this, EOPPOSITE_FEATURE_BASE
								- UMLPackage.CLASS__OWNED_SIGNATURE, null, msgs);
					return basicSetOwnedSignature(
						(RedefinableTemplateSignature) otherEnd, msgs);
				case UMLPackage.CLASS__INTERFACE_REALIZATION :
					return ((InternalEList) getInterfaceRealizations())
						.basicAdd(otherEnd, msgs);
				case UMLPackage.CLASS__OWNED_OPERATION :
					return ((InternalEList) getOwnedOperations()).basicAdd(
						otherEnd, msgs);
				default :
					return eDynamicInverseAdd(otherEnd, featureID, baseClass,
						msgs);
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
	public NotificationChain eInverseRemove(InternalEObject otherEnd,
			int featureID, Class baseClass, NotificationChain msgs) {
		if (featureID >= 0) {
			switch (eDerivedStructuralFeatureID(featureID, baseClass)) {
				case UMLPackage.CLASS__EANNOTATIONS :
					return ((InternalEList) getEAnnotations()).basicRemove(
						otherEnd, msgs);
				case UMLPackage.CLASS__OWNED_COMMENT :
					return ((InternalEList) getOwnedComments()).basicRemove(
						otherEnd, msgs);
				case UMLPackage.CLASS__CLIENT_DEPENDENCY :
					return ((InternalEList) getClientDependencies())
						.basicRemove(otherEnd, msgs);
				case UMLPackage.CLASS__NAME_EXPRESSION :
					return basicSetNameExpression(null, msgs);
				case UMLPackage.CLASS__ELEMENT_IMPORT :
					return ((InternalEList) getElementImports()).basicRemove(
						otherEnd, msgs);
				case UMLPackage.CLASS__PACKAGE_IMPORT :
					return ((InternalEList) getPackageImports()).basicRemove(
						otherEnd, msgs);
				case UMLPackage.CLASS__OWNED_RULE :
					return ((InternalEList) getOwnedRules()).basicRemove(
						otherEnd, msgs);
				case UMLPackage.CLASS__TEMPLATE_PARAMETER :
					return basicSetTemplateParameter(null, msgs);
				case UMLPackage.CLASS__OWNING_TEMPLATE_PARAMETER :
					return eBasicSetContainer(null,
						UMLPackage.CLASS__OWNING_TEMPLATE_PARAMETER, msgs);
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
				case UMLPackage.CLASS__OWNED_USE_CASE :
					return ((InternalEList) getOwnedUseCases()).basicRemove(
						otherEnd, msgs);
				case UMLPackage.CLASS__USE_CASE :
					return ((InternalEList) getUseCases()).basicRemove(
						otherEnd, msgs);
				case UMLPackage.CLASS__SUBSTITUTION :
					return ((InternalEList) getSubstitutions()).basicRemove(
						otherEnd, msgs);
				case UMLPackage.CLASS__COLLABORATION_USE :
					return ((InternalEList) getCollaborationUses())
						.basicRemove(otherEnd, msgs);
				case UMLPackage.CLASS__OWNED_SIGNATURE :
					return basicSetOwnedSignature(null, msgs);
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
				case UMLPackage.CLASS__OWNED_OPERATION :
					return ((InternalEList) getOwnedOperations()).basicRemove(
						otherEnd, msgs);
				case UMLPackage.CLASS__NESTED_CLASSIFIER :
					return ((InternalEList) getNestedClassifiers())
						.basicRemove(otherEnd, msgs);
				case UMLPackage.CLASS__OWNED_RECEPTION :
					return ((InternalEList) getOwnedReceptions()).basicRemove(
						otherEnd, msgs);
				default :
					return eDynamicInverseRemove(otherEnd, featureID,
						baseClass, msgs);
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
				return getNameExpression();
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
			case UMLPackage.CLASS__TEMPLATE_PARAMETER :
				if (resolve)
					return getTemplateParameter();
				return basicGetTemplateParameter();
			case UMLPackage.CLASS__OWNING_TEMPLATE_PARAMETER :
				return getOwningTemplateParameter();
			case UMLPackage.CLASS__PACKAGE :
				return getPackage();
			case UMLPackage.CLASS__TEMPLATE_BINDING :
				return getTemplateBindings();
			case UMLPackage.CLASS__OWNED_TEMPLATE_SIGNATURE :
				return getOwnedTemplateSignature();
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
			case UMLPackage.CLASS__OWNED_USE_CASE :
				return getOwnedUseCases();
			case UMLPackage.CLASS__USE_CASE :
				return getUseCases();
			case UMLPackage.CLASS__SUBSTITUTION :
				return getSubstitutions();
			case UMLPackage.CLASS__ATTRIBUTE :
				return getAttributes();
			case UMLPackage.CLASS__REPRESENTATION :
				return getRepresentation();
			case UMLPackage.CLASS__COLLABORATION_USE :
				return getCollaborationUses();
			case UMLPackage.CLASS__OWNED_SIGNATURE :
				return getOwnedSignature();
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
				return getClassifierBehavior();
			case UMLPackage.CLASS__INTERFACE_REALIZATION :
				return getInterfaceRealizations();
			case UMLPackage.CLASS__OWNED_TRIGGER :
				return getOwnedTriggers();
			case UMLPackage.CLASS__OWNED_OPERATION :
				return getOwnedOperations();
			case UMLPackage.CLASS__NESTED_CLASSIFIER :
				return getNestedClassifiers();
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
		return eDynamicGet(eFeature, resolve);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eSet(EStructuralFeature eFeature, Object newValue) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
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
			case UMLPackage.CLASS__TEMPLATE_PARAMETER :
				setTemplateParameter((TemplateParameter) newValue);
				return;
			case UMLPackage.CLASS__OWNING_TEMPLATE_PARAMETER :
				setOwningTemplateParameter((TemplateParameter) newValue);
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
			case UMLPackage.CLASS__INHERITED_MEMBER :
				getInheritedMembers().clear();
				getInheritedMembers().addAll((Collection) newValue);
				return;
			case UMLPackage.CLASS__REDEFINED_CLASSIFIER :
				getRedefinedClassifiers().clear();
				getRedefinedClassifiers().addAll((Collection) newValue);
				return;
			case UMLPackage.CLASS__GENERAL :
				getGenerals().clear();
				getGenerals().addAll((Collection) newValue);
				return;
			case UMLPackage.CLASS__OWNED_USE_CASE :
				getOwnedUseCases().clear();
				getOwnedUseCases().addAll((Collection) newValue);
				return;
			case UMLPackage.CLASS__USE_CASE :
				getUseCases().clear();
				getUseCases().addAll((Collection) newValue);
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
			case UMLPackage.CLASS__OWNED_SIGNATURE :
				setOwnedSignature((RedefinableTemplateSignature) newValue);
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
			case UMLPackage.CLASS__OWNED_OPERATION :
				getOwnedOperations().clear();
				getOwnedOperations().addAll((Collection) newValue);
				return;
			case UMLPackage.CLASS__NESTED_CLASSIFIER :
				getNestedClassifiers().clear();
				getNestedClassifiers().addAll((Collection) newValue);
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
		eDynamicSet(eFeature, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eUnset(EStructuralFeature eFeature) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case UMLPackage.CLASS__EANNOTATIONS :
				getEAnnotations().clear();
				return;
			case UMLPackage.CLASS__OWNED_COMMENT :
				getOwnedComments().clear();
				return;
			case UMLPackage.CLASS__NAME :
				setName(NAME_EDEFAULT);
				return;
			case UMLPackage.CLASS__VISIBILITY :
				setVisibility(VISIBILITY_EDEFAULT);
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
			case UMLPackage.CLASS__TEMPLATE_PARAMETER :
				setTemplateParameter((TemplateParameter) null);
				return;
			case UMLPackage.CLASS__OWNING_TEMPLATE_PARAMETER :
				setOwningTemplateParameter((TemplateParameter) null);
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
			case UMLPackage.CLASS__INHERITED_MEMBER :
				getInheritedMembers().clear();
				return;
			case UMLPackage.CLASS__REDEFINED_CLASSIFIER :
				getRedefinedClassifiers().clear();
				return;
			case UMLPackage.CLASS__GENERAL :
				getGenerals().clear();
				return;
			case UMLPackage.CLASS__OWNED_USE_CASE :
				getOwnedUseCases().clear();
				return;
			case UMLPackage.CLASS__USE_CASE :
				getUseCases().clear();
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
			case UMLPackage.CLASS__OWNED_SIGNATURE :
				setOwnedSignature((RedefinableTemplateSignature) null);
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
			case UMLPackage.CLASS__OWNED_OPERATION :
				getOwnedOperations().clear();
				return;
			case UMLPackage.CLASS__NESTED_CLASSIFIER :
				getNestedClassifiers().clear();
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
		eDynamicUnset(eFeature);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean eIsSet(EStructuralFeature eFeature) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case UMLPackage.CLASS__EANNOTATIONS :
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UMLPackage.CLASS__OWNED_ELEMENT :
				return isSetOwnedElements();
			case UMLPackage.CLASS__OWNER :
				return isSetOwner();
			case UMLPackage.CLASS__OWNED_COMMENT :
				List ownedComment = (List) eVirtualGet(UMLPackage.CLASS__OWNED_COMMENT);
				return ownedComment != null && !ownedComment.isEmpty();
			case UMLPackage.CLASS__NAME :
				String name = eVirtualIsSet(UMLPackage.CLASS__NAME)
					? (String) eVirtualGet(UMLPackage.CLASS__NAME)
					: NAME_EDEFAULT;
				return NAME_EDEFAULT == null
					? name != null
					: !NAME_EDEFAULT.equals(name);
			case UMLPackage.CLASS__VISIBILITY :
				return eVirtualIsSet(UMLPackage.CLASS__VISIBILITY)
					&& eVirtualGet(UMLPackage.CLASS__VISIBILITY) != VISIBILITY_EDEFAULT;
			case UMLPackage.CLASS__QUALIFIED_NAME :
				return QUALIFIED_NAME_EDEFAULT == null
					? getQualifiedName() != null
					: !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case UMLPackage.CLASS__CLIENT_DEPENDENCY :
				List clientDependency = (List) eVirtualGet(UMLPackage.CLASS__CLIENT_DEPENDENCY);
				return clientDependency != null && !clientDependency.isEmpty();
			case UMLPackage.CLASS__NAMESPACE :
				return isSetNamespace();
			case UMLPackage.CLASS__NAME_EXPRESSION :
				return eVirtualGet(UMLPackage.CLASS__NAME_EXPRESSION) != null;
			case UMLPackage.CLASS__ELEMENT_IMPORT :
				List elementImport = (List) eVirtualGet(UMLPackage.CLASS__ELEMENT_IMPORT);
				return elementImport != null && !elementImport.isEmpty();
			case UMLPackage.CLASS__PACKAGE_IMPORT :
				List packageImport = (List) eVirtualGet(UMLPackage.CLASS__PACKAGE_IMPORT);
				return packageImport != null && !packageImport.isEmpty();
			case UMLPackage.CLASS__OWNED_RULE :
				List ownedRule = (List) eVirtualGet(UMLPackage.CLASS__OWNED_RULE);
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
			case UMLPackage.CLASS__TEMPLATE_PARAMETER :
				return eVirtualGet(UMLPackage.CLASS__TEMPLATE_PARAMETER) != null;
			case UMLPackage.CLASS__OWNING_TEMPLATE_PARAMETER :
				return getOwningTemplateParameter() != null;
			case UMLPackage.CLASS__PACKAGE :
				return getPackage() != null;
			case UMLPackage.CLASS__TEMPLATE_BINDING :
				List templateBinding = (List) eVirtualGet(UMLPackage.CLASS__TEMPLATE_BINDING);
				return templateBinding != null && !templateBinding.isEmpty();
			case UMLPackage.CLASS__OWNED_TEMPLATE_SIGNATURE :
				return eVirtualGet(UMLPackage.CLASS__OWNED_TEMPLATE_SIGNATURE) != null;
			case UMLPackage.CLASS__IS_ABSTRACT :
				return isAbstract() != IS_ABSTRACT_EDEFAULT;
			case UMLPackage.CLASS__GENERALIZATION :
				List generalization = (List) eVirtualGet(UMLPackage.CLASS__GENERALIZATION);
				return generalization != null && !generalization.isEmpty();
			case UMLPackage.CLASS__POWERTYPE_EXTENT :
				List powertypeExtent = (List) eVirtualGet(UMLPackage.CLASS__POWERTYPE_EXTENT);
				return powertypeExtent != null && !powertypeExtent.isEmpty();
			case UMLPackage.CLASS__FEATURE :
				return isSetFeatures();
			case UMLPackage.CLASS__INHERITED_MEMBER :
				return !getInheritedMembers().isEmpty();
			case UMLPackage.CLASS__REDEFINED_CLASSIFIER :
				List redefinedClassifier = (List) eVirtualGet(UMLPackage.CLASS__REDEFINED_CLASSIFIER);
				return redefinedClassifier != null
					&& !redefinedClassifier.isEmpty();
			case UMLPackage.CLASS__GENERAL :
				return !getGenerals().isEmpty();
			case UMLPackage.CLASS__OWNED_USE_CASE :
				List ownedUseCase = (List) eVirtualGet(UMLPackage.CLASS__OWNED_USE_CASE);
				return ownedUseCase != null && !ownedUseCase.isEmpty();
			case UMLPackage.CLASS__USE_CASE :
				List useCase = (List) eVirtualGet(UMLPackage.CLASS__USE_CASE);
				return useCase != null && !useCase.isEmpty();
			case UMLPackage.CLASS__SUBSTITUTION :
				List substitution = (List) eVirtualGet(UMLPackage.CLASS__SUBSTITUTION);
				return substitution != null && !substitution.isEmpty();
			case UMLPackage.CLASS__ATTRIBUTE :
				return isSetAttributes();
			case UMLPackage.CLASS__REPRESENTATION :
				return eVirtualGet(UMLPackage.CLASS__REPRESENTATION) != null;
			case UMLPackage.CLASS__COLLABORATION_USE :
				List collaborationUse = (List) eVirtualGet(UMLPackage.CLASS__COLLABORATION_USE);
				return collaborationUse != null && !collaborationUse.isEmpty();
			case UMLPackage.CLASS__OWNED_SIGNATURE :
				return eVirtualGet(UMLPackage.CLASS__OWNED_SIGNATURE) != null;
			case UMLPackage.CLASS__OWNED_ATTRIBUTE :
				List ownedAttribute = (List) eVirtualGet(UMLPackage.CLASS__OWNED_ATTRIBUTE);
				return ownedAttribute != null && !ownedAttribute.isEmpty();
			case UMLPackage.CLASS__PART :
				return !getParts().isEmpty();
			case UMLPackage.CLASS__ROLE :
				return isSetRoles();
			case UMLPackage.CLASS__OWNED_CONNECTOR :
				List ownedConnector = (List) eVirtualGet(UMLPackage.CLASS__OWNED_CONNECTOR);
				return ownedConnector != null && !ownedConnector.isEmpty();
			case UMLPackage.CLASS__OWNED_PORT :
				List ownedPort = (List) eVirtualGet(UMLPackage.CLASS__OWNED_PORT);
				return ownedPort != null && !ownedPort.isEmpty();
			case UMLPackage.CLASS__OWNED_BEHAVIOR :
				List ownedBehavior = (List) eVirtualGet(UMLPackage.CLASS__OWNED_BEHAVIOR);
				return ownedBehavior != null && !ownedBehavior.isEmpty();
			case UMLPackage.CLASS__CLASSIFIER_BEHAVIOR :
				return eVirtualGet(UMLPackage.CLASS__CLASSIFIER_BEHAVIOR) != null;
			case UMLPackage.CLASS__INTERFACE_REALIZATION :
				List interfaceRealization = (List) eVirtualGet(UMLPackage.CLASS__INTERFACE_REALIZATION);
				return interfaceRealization != null
					&& !interfaceRealization.isEmpty();
			case UMLPackage.CLASS__OWNED_TRIGGER :
				List ownedTrigger = (List) eVirtualGet(UMLPackage.CLASS__OWNED_TRIGGER);
				return ownedTrigger != null && !ownedTrigger.isEmpty();
			case UMLPackage.CLASS__OWNED_OPERATION :
				List ownedOperation = (List) eVirtualGet(UMLPackage.CLASS__OWNED_OPERATION);
				return ownedOperation != null && !ownedOperation.isEmpty();
			case UMLPackage.CLASS__NESTED_CLASSIFIER :
				List nestedClassifier = (List) eVirtualGet(UMLPackage.CLASS__NESTED_CLASSIFIER);
				return nestedClassifier != null && !nestedClassifier.isEmpty();
			case UMLPackage.CLASS__SUPER_CLASS :
				return isSetSuperClasses();
			case UMLPackage.CLASS__IS_ACTIVE :
				return ((eFlags & IS_ACTIVE_EFLAG) != 0) != IS_ACTIVE_EDEFAULT;
			case UMLPackage.CLASS__OWNED_RECEPTION :
				List ownedReception = (List) eVirtualGet(UMLPackage.CLASS__OWNED_RECEPTION);
				return ownedReception != null && !ownedReception.isEmpty();
			case UMLPackage.CLASS__EXTENSION :
				return !getExtensions().isEmpty();
		}
		return eDynamicIsSet(eFeature);
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
		return super.isSetOwnedMembers()
			|| isSetOwnedAttributes()
			|| eIsSet(UMLPackage.eINSTANCE
				.getBehavioredClassifier_OwnedBehavior())
			|| eIsSet(UMLPackage.eINSTANCE
				.getBehavioredClassifier_OwnedTrigger())
			|| eIsSet(UMLPackage.eINSTANCE.getClass_OwnedOperation())
			|| eIsSet(UMLPackage.eINSTANCE.getClass_NestedClassifier())
			|| eIsSet(UMLPackage.eINSTANCE.getClass_OwnedReception());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOwnedElements() {
		return super.isSetOwnedElements()
			|| eIsSet(UMLPackage.eINSTANCE
				.getBehavioredClassifier_InterfaceRealization());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetFeatures() {
		return super.isSetFeatures()
			|| eIsSet(UMLPackage.eINSTANCE.getClass_OwnedOperation())
			|| eIsSet(UMLPackage.eINSTANCE.getClass_OwnedReception());
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
	public List getGenerals() {
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