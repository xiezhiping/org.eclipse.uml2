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
 * $Id: InterfaceImpl.java,v 1.19 2006/02/22 23:49:05 khussey Exp $
 */
package org.eclipse.uml2.uml.internal.impl;

import java.util.Collection;
import java.util.Iterator;
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
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.uml2.common.util.DerivedUnionEObjectEList;

import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.CollaborationUse;
import org.eclipse.uml2.uml.Feature;
import org.eclipse.uml2.uml.Interface;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Operation;
import org.eclipse.uml2.uml.Parameter;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.ProtocolStateMachine;
import org.eclipse.uml2.uml.Reception;
import org.eclipse.uml2.uml.RedefinableElement;
import org.eclipse.uml2.uml.StringExpression;
import org.eclipse.uml2.uml.TemplateParameter;
import org.eclipse.uml2.uml.TemplateSignature;
import org.eclipse.uml2.uml.Type;
import org.eclipse.uml2.uml.UMLFactory;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.VisibilityKind;

import org.eclipse.uml2.uml.internal.operations.InterfaceOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Interface</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.InterfaceImpl#getAttributes <em>Attribute</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.InterfaceImpl#getOwnedMembers <em>Owned Member</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.InterfaceImpl#getFeatures <em>Feature</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.InterfaceImpl#getRedefinedElements <em>Redefined Element</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.InterfaceImpl#getOwnedAttributes <em>Owned Attribute</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.InterfaceImpl#getOwnedOperations <em>Owned Operation</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.InterfaceImpl#getNestedClassifiers <em>Nested Classifier</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.InterfaceImpl#getRedefinedInterfaces <em>Redefined Interface</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.InterfaceImpl#getOwnedReceptions <em>Owned Reception</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.InterfaceImpl#getProtocol <em>Protocol</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InterfaceImpl
		extends ClassifierImpl
		implements Interface {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InterfaceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return UMLPackage.Literals.INTERFACE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getAttributes() {
		EList attribute = (EList) eVirtualGet(UMLPackage.INTERFACE__ATTRIBUTE);
		if (attribute == null) {
			eVirtualSet(UMLPackage.INTERFACE__ATTRIBUTE,
				attribute = new DerivedUnionEObjectEList(Property.class, this,
					UMLPackage.INTERFACE__ATTRIBUTE,
					new int[]{UMLPackage.INTERFACE__OWNED_ATTRIBUTE}));
		}
		return attribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getOwnedMembers() {
		EList ownedMember = (EList) eVirtualGet(UMLPackage.INTERFACE__OWNED_MEMBER);
		if (ownedMember == null) {
			eVirtualSet(UMLPackage.INTERFACE__OWNED_MEMBER,
				ownedMember = new DerivedUnionEObjectEList(NamedElement.class,
					this, UMLPackage.INTERFACE__OWNED_MEMBER, new int[]{
						UMLPackage.INTERFACE__OWNED_RULE,
						UMLPackage.INTERFACE__OWNED_USE_CASE,
						UMLPackage.INTERFACE__OWNED_ATTRIBUTE,
						UMLPackage.INTERFACE__OWNED_OPERATION,
						UMLPackage.INTERFACE__NESTED_CLASSIFIER,
						UMLPackage.INTERFACE__OWNED_RECEPTION,
						UMLPackage.INTERFACE__PROTOCOL}));
		}
		return ownedMember;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getRedefinedElements() {
		EList redefinedElement = (EList) eVirtualGet(UMLPackage.INTERFACE__REDEFINED_ELEMENT);
		if (redefinedElement == null) {
			eVirtualSet(UMLPackage.INTERFACE__REDEFINED_ELEMENT,
				redefinedElement = new DerivedUnionEObjectEList(
					RedefinableElement.class, this,
					UMLPackage.INTERFACE__REDEFINED_ELEMENT, new int[]{
						UMLPackage.INTERFACE__REDEFINED_CLASSIFIER,
						UMLPackage.INTERFACE__REDEFINED_INTERFACE}));
		}
		return redefinedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getFeatures() {
		EList feature = (EList) eVirtualGet(UMLPackage.INTERFACE__FEATURE);
		if (feature == null) {
			eVirtualSet(UMLPackage.INTERFACE__FEATURE,
				feature = new DerivedUnionEObjectEList(Feature.class, this,
					UMLPackage.INTERFACE__FEATURE, new int[]{
						UMLPackage.INTERFACE__ATTRIBUTE,
						UMLPackage.INTERFACE__OWNED_OPERATION,
						UMLPackage.INTERFACE__OWNED_RECEPTION}));
		}
		return feature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getOwnedAttributes() {
		EList ownedAttribute = (EList) eVirtualGet(UMLPackage.INTERFACE__OWNED_ATTRIBUTE);
		if (ownedAttribute == null) {
			eVirtualSet(
				UMLPackage.INTERFACE__OWNED_ATTRIBUTE,
				ownedAttribute = new EObjectContainmentEList.Resolving(
					Property.class, this, UMLPackage.INTERFACE__OWNED_ATTRIBUTE));
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
	public EList getNestedClassifiers() {
		EList nestedClassifier = (EList) eVirtualGet(UMLPackage.INTERFACE__NESTED_CLASSIFIER);
		if (nestedClassifier == null) {
			eVirtualSet(UMLPackage.INTERFACE__NESTED_CLASSIFIER,
				nestedClassifier = new EObjectContainmentEList.Resolving(
					Classifier.class, this,
					UMLPackage.INTERFACE__NESTED_CLASSIFIER));
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

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getRedefinedInterfaces() {
		EList redefinedInterface = (EList) eVirtualGet(UMLPackage.INTERFACE__REDEFINED_INTERFACE);
		if (redefinedInterface == null) {
			eVirtualSet(UMLPackage.INTERFACE__REDEFINED_INTERFACE,
				redefinedInterface = new EObjectResolvingEList(Interface.class,
					this, UMLPackage.INTERFACE__REDEFINED_INTERFACE));
		}
		return redefinedInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Interface getRedefinedInterface(String name) {
		return getRedefinedInterface(name, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Interface getRedefinedInterface(String name, boolean ignoreCase) {
		redefinedInterfaceLoop : for (Iterator i = getRedefinedInterfaces()
			.iterator(); i.hasNext();) {
			Interface redefinedInterface = (Interface) i.next();
			if (name != null && !(ignoreCase
				? name.equalsIgnoreCase(redefinedInterface.getName())
				: name.equals(redefinedInterface.getName())))
				continue redefinedInterfaceLoop;
			return redefinedInterface;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getOwnedReceptions() {
		EList ownedReception = (EList) eVirtualGet(UMLPackage.INTERFACE__OWNED_RECEPTION);
		if (ownedReception == null) {
			eVirtualSet(UMLPackage.INTERFACE__OWNED_RECEPTION,
				ownedReception = new EObjectContainmentEList.Resolving(
					Reception.class, this,
					UMLPackage.INTERFACE__OWNED_RECEPTION));
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
	public ProtocolStateMachine getProtocol() {
		ProtocolStateMachine protocol = (ProtocolStateMachine) eVirtualGet(UMLPackage.INTERFACE__PROTOCOL);
		if (protocol != null && protocol.eIsProxy()) {
			InternalEObject oldProtocol = (InternalEObject) protocol;
			protocol = (ProtocolStateMachine) eResolveProxy(oldProtocol);
			if (protocol != oldProtocol) {
				InternalEObject newProtocol = (InternalEObject) protocol;
				NotificationChain msgs = oldProtocol.eInverseRemove(this,
					EOPPOSITE_FEATURE_BASE - UMLPackage.INTERFACE__PROTOCOL,
					null, null);
				if (newProtocol.eInternalContainer() == null) {
					msgs = newProtocol.eInverseAdd(this, EOPPOSITE_FEATURE_BASE
						- UMLPackage.INTERFACE__PROTOCOL, null, msgs);
				}
				if (msgs != null)
					msgs.dispatch();
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
						UMLPackage.INTERFACE__PROTOCOL, oldProtocol, protocol));
			}
		}
		return protocol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProtocolStateMachine basicGetProtocol() {
		return (ProtocolStateMachine) eVirtualGet(UMLPackage.INTERFACE__PROTOCOL);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProtocol(ProtocolStateMachine newProtocol,
			NotificationChain msgs) {
		Object oldProtocol = eVirtualSet(UMLPackage.INTERFACE__PROTOCOL,
			newProtocol);
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
				Notification.SET, UMLPackage.INTERFACE__PROTOCOL,
				oldProtocol == EVIRTUAL_NO_VALUE
					? null
					: oldProtocol, newProtocol);
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
	public void setProtocol(ProtocolStateMachine newProtocol) {
		ProtocolStateMachine protocol = (ProtocolStateMachine) eVirtualGet(UMLPackage.INTERFACE__PROTOCOL);
		if (newProtocol != protocol) {
			NotificationChain msgs = null;
			if (protocol != null)
				msgs = ((InternalEObject) protocol).eInverseRemove(this,
					EOPPOSITE_FEATURE_BASE - UMLPackage.INTERFACE__PROTOCOL,
					null, msgs);
			if (newProtocol != null)
				msgs = ((InternalEObject) newProtocol).eInverseAdd(this,
					EOPPOSITE_FEATURE_BASE - UMLPackage.INTERFACE__PROTOCOL,
					null, msgs);
			msgs = basicSetProtocol(newProtocol, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.INTERFACE__PROTOCOL, newProtocol, newProtocol));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProtocolStateMachine createProtocol(String name) {
		ProtocolStateMachine newProtocol = UMLFactory.eINSTANCE
			.createProtocolStateMachine();
		if (name != null)
			newProtocol.setName(name);
		setProtocol(newProtocol);
		return newProtocol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getOwnedOperations() {
		EList ownedOperation = (EList) eVirtualGet(UMLPackage.INTERFACE__OWNED_OPERATION);
		if (ownedOperation == null) {
			eVirtualSet(
				UMLPackage.INTERFACE__OWNED_OPERATION,
				ownedOperation = new EObjectContainmentWithInverseEList.Resolving(
					Operation.class, this,
					UMLPackage.INTERFACE__OWNED_OPERATION,
					UMLPackage.OPERATION__INTERFACE));
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
	public boolean validateVisibility(DiagnosticChain diagnostics, Map context) {
		return InterfaceOperations.validateVisibility(this, diagnostics,
			context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operation createOwnedOperation(String name, EList parameterNames,
			EList parameterTypes, Type returnType) {
		return InterfaceOperations.createOwnedOperation(this, name,
			parameterNames, parameterTypes, returnType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property createOwnedAttribute(String name, Type type, int lower,
			int upper) {
		return InterfaceOperations.createOwnedAttribute(this, name, type,
			lower, upper);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UMLPackage.INTERFACE__EANNOTATIONS :
				return ((InternalEList) getEAnnotations()).basicAdd(otherEnd,
					msgs);
			case UMLPackage.INTERFACE__CLIENT_DEPENDENCY :
				return ((InternalEList) getClientDependencies()).basicAdd(
					otherEnd, msgs);
			case UMLPackage.INTERFACE__ELEMENT_IMPORT :
				return ((InternalEList) getElementImports()).basicAdd(otherEnd,
					msgs);
			case UMLPackage.INTERFACE__PACKAGE_IMPORT :
				return ((InternalEList) getPackageImports()).basicAdd(otherEnd,
					msgs);
			case UMLPackage.INTERFACE__OWNED_RULE :
				return ((InternalEList) getOwnedRules()).basicAdd(otherEnd,
					msgs);
			case UMLPackage.INTERFACE__OWNING_TEMPLATE_PARAMETER :
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return eBasicSetContainer(otherEnd,
					UMLPackage.INTERFACE__OWNING_TEMPLATE_PARAMETER, msgs);
			case UMLPackage.INTERFACE__TEMPLATE_PARAMETER :
				TemplateParameter templateParameter = (TemplateParameter) eVirtualGet(UMLPackage.INTERFACE__TEMPLATE_PARAMETER);
				if (templateParameter != null)
					msgs = ((InternalEObject) templateParameter)
						.eInverseRemove(this,
							UMLPackage.TEMPLATE_PARAMETER__PARAMETERED_ELEMENT,
							TemplateParameter.class, msgs);
				return basicSetTemplateParameter((TemplateParameter) otherEnd,
					msgs);
			case UMLPackage.INTERFACE__TEMPLATE_BINDING :
				return ((InternalEList) getTemplateBindings()).basicAdd(
					otherEnd, msgs);
			case UMLPackage.INTERFACE__OWNED_TEMPLATE_SIGNATURE :
				TemplateSignature ownedTemplateSignature = (TemplateSignature) eVirtualGet(UMLPackage.INTERFACE__OWNED_TEMPLATE_SIGNATURE);
				if (ownedTemplateSignature != null)
					msgs = ((InternalEObject) ownedTemplateSignature)
						.eInverseRemove(this, EOPPOSITE_FEATURE_BASE
							- UMLPackage.INTERFACE__OWNED_TEMPLATE_SIGNATURE,
							null, msgs);
				return basicSetOwnedTemplateSignature(
					(TemplateSignature) otherEnd, msgs);
			case UMLPackage.INTERFACE__GENERALIZATION :
				return ((InternalEList) getGeneralizations()).basicAdd(
					otherEnd, msgs);
			case UMLPackage.INTERFACE__POWERTYPE_EXTENT :
				return ((InternalEList) getPowertypeExtents()).basicAdd(
					otherEnd, msgs);
			case UMLPackage.INTERFACE__SUBSTITUTION :
				return ((InternalEList) getSubstitutions()).basicAdd(otherEnd,
					msgs);
			case UMLPackage.INTERFACE__USE_CASE :
				return ((InternalEList) getUseCases()).basicAdd(otherEnd, msgs);
			case UMLPackage.INTERFACE__OWNED_OPERATION :
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
			case UMLPackage.INTERFACE__EANNOTATIONS :
				return ((InternalEList) getEAnnotations()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.INTERFACE__OWNED_COMMENT :
				return ((InternalEList) getOwnedComments()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.INTERFACE__CLIENT_DEPENDENCY :
				return ((InternalEList) getClientDependencies()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.INTERFACE__NAME_EXPRESSION :
				return basicSetNameExpression(null, msgs);
			case UMLPackage.INTERFACE__ELEMENT_IMPORT :
				return ((InternalEList) getElementImports()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.INTERFACE__PACKAGE_IMPORT :
				return ((InternalEList) getPackageImports()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.INTERFACE__OWNED_RULE :
				return ((InternalEList) getOwnedRules()).basicRemove(otherEnd,
					msgs);
			case UMLPackage.INTERFACE__OWNING_TEMPLATE_PARAMETER :
				return eBasicSetContainer(null,
					UMLPackage.INTERFACE__OWNING_TEMPLATE_PARAMETER, msgs);
			case UMLPackage.INTERFACE__TEMPLATE_PARAMETER :
				return basicSetTemplateParameter(null, msgs);
			case UMLPackage.INTERFACE__TEMPLATE_BINDING :
				return ((InternalEList) getTemplateBindings()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.INTERFACE__OWNED_TEMPLATE_SIGNATURE :
				return basicSetOwnedTemplateSignature(null, msgs);
			case UMLPackage.INTERFACE__GENERALIZATION :
				return ((InternalEList) getGeneralizations()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.INTERFACE__POWERTYPE_EXTENT :
				return ((InternalEList) getPowertypeExtents()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.INTERFACE__SUBSTITUTION :
				return ((InternalEList) getSubstitutions()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.INTERFACE__COLLABORATION_USE :
				return ((InternalEList) getCollaborationUses()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.INTERFACE__OWNED_USE_CASE :
				return ((InternalEList) getOwnedUseCases()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.INTERFACE__USE_CASE :
				return ((InternalEList) getUseCases()).basicRemove(otherEnd,
					msgs);
			case UMLPackage.INTERFACE__OWNED_ATTRIBUTE :
				return ((InternalEList) getOwnedAttributes()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.INTERFACE__OWNED_OPERATION :
				return ((InternalEList) getOwnedOperations()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.INTERFACE__NESTED_CLASSIFIER :
				return ((InternalEList) getNestedClassifiers()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.INTERFACE__OWNED_RECEPTION :
				return ((InternalEList) getOwnedReceptions()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.INTERFACE__PROTOCOL :
				return basicSetProtocol(null, msgs);
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
			case UMLPackage.INTERFACE__EANNOTATIONS :
				return getEAnnotations();
			case UMLPackage.INTERFACE__OWNED_ELEMENT :
				return getOwnedElements();
			case UMLPackage.INTERFACE__OWNER :
				if (resolve)
					return getOwner();
				return basicGetOwner();
			case UMLPackage.INTERFACE__OWNED_COMMENT :
				return getOwnedComments();
			case UMLPackage.INTERFACE__NAME :
				return getName();
			case UMLPackage.INTERFACE__VISIBILITY :
				return getVisibility();
			case UMLPackage.INTERFACE__QUALIFIED_NAME :
				return getQualifiedName();
			case UMLPackage.INTERFACE__CLIENT_DEPENDENCY :
				return getClientDependencies();
			case UMLPackage.INTERFACE__NAMESPACE :
				if (resolve)
					return getNamespace();
				return basicGetNamespace();
			case UMLPackage.INTERFACE__NAME_EXPRESSION :
				if (resolve)
					return getNameExpression();
				return basicGetNameExpression();
			case UMLPackage.INTERFACE__ELEMENT_IMPORT :
				return getElementImports();
			case UMLPackage.INTERFACE__PACKAGE_IMPORT :
				return getPackageImports();
			case UMLPackage.INTERFACE__OWNED_RULE :
				return getOwnedRules();
			case UMLPackage.INTERFACE__MEMBER :
				return getMembers();
			case UMLPackage.INTERFACE__IMPORTED_MEMBER :
				return getImportedMembers();
			case UMLPackage.INTERFACE__OWNED_MEMBER :
				return getOwnedMembers();
			case UMLPackage.INTERFACE__IS_LEAF :
				return isLeaf()
					? Boolean.TRUE
					: Boolean.FALSE;
			case UMLPackage.INTERFACE__REDEFINED_ELEMENT :
				return getRedefinedElements();
			case UMLPackage.INTERFACE__REDEFINITION_CONTEXT :
				return getRedefinitionContexts();
			case UMLPackage.INTERFACE__OWNING_TEMPLATE_PARAMETER :
				if (resolve)
					return getOwningTemplateParameter();
				return basicGetOwningTemplateParameter();
			case UMLPackage.INTERFACE__TEMPLATE_PARAMETER :
				if (resolve)
					return getTemplateParameter();
				return basicGetTemplateParameter();
			case UMLPackage.INTERFACE__PACKAGE :
				if (resolve)
					return getPackage();
				return basicGetPackage();
			case UMLPackage.INTERFACE__TEMPLATE_BINDING :
				return getTemplateBindings();
			case UMLPackage.INTERFACE__OWNED_TEMPLATE_SIGNATURE :
				if (resolve)
					return getOwnedTemplateSignature();
				return basicGetOwnedTemplateSignature();
			case UMLPackage.INTERFACE__IS_ABSTRACT :
				return isAbstract()
					? Boolean.TRUE
					: Boolean.FALSE;
			case UMLPackage.INTERFACE__GENERALIZATION :
				return getGeneralizations();
			case UMLPackage.INTERFACE__POWERTYPE_EXTENT :
				return getPowertypeExtents();
			case UMLPackage.INTERFACE__FEATURE :
				return getFeatures();
			case UMLPackage.INTERFACE__INHERITED_MEMBER :
				return getInheritedMembers();
			case UMLPackage.INTERFACE__REDEFINED_CLASSIFIER :
				return getRedefinedClassifiers();
			case UMLPackage.INTERFACE__GENERAL :
				return getGenerals();
			case UMLPackage.INTERFACE__SUBSTITUTION :
				return getSubstitutions();
			case UMLPackage.INTERFACE__ATTRIBUTE :
				return getAttributes();
			case UMLPackage.INTERFACE__REPRESENTATION :
				if (resolve)
					return getRepresentation();
				return basicGetRepresentation();
			case UMLPackage.INTERFACE__COLLABORATION_USE :
				return getCollaborationUses();
			case UMLPackage.INTERFACE__OWNED_USE_CASE :
				return getOwnedUseCases();
			case UMLPackage.INTERFACE__USE_CASE :
				return getUseCases();
			case UMLPackage.INTERFACE__OWNED_ATTRIBUTE :
				return getOwnedAttributes();
			case UMLPackage.INTERFACE__OWNED_OPERATION :
				return getOwnedOperations();
			case UMLPackage.INTERFACE__NESTED_CLASSIFIER :
				return getNestedClassifiers();
			case UMLPackage.INTERFACE__REDEFINED_INTERFACE :
				return getRedefinedInterfaces();
			case UMLPackage.INTERFACE__OWNED_RECEPTION :
				return getOwnedReceptions();
			case UMLPackage.INTERFACE__PROTOCOL :
				if (resolve)
					return getProtocol();
				return basicGetProtocol();
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
			case UMLPackage.INTERFACE__EANNOTATIONS :
				getEAnnotations().clear();
				getEAnnotations().addAll((Collection) newValue);
				return;
			case UMLPackage.INTERFACE__OWNED_COMMENT :
				getOwnedComments().clear();
				getOwnedComments().addAll((Collection) newValue);
				return;
			case UMLPackage.INTERFACE__NAME :
				setName((String) newValue);
				return;
			case UMLPackage.INTERFACE__VISIBILITY :
				setVisibility((VisibilityKind) newValue);
				return;
			case UMLPackage.INTERFACE__CLIENT_DEPENDENCY :
				getClientDependencies().clear();
				getClientDependencies().addAll((Collection) newValue);
				return;
			case UMLPackage.INTERFACE__NAME_EXPRESSION :
				setNameExpression((StringExpression) newValue);
				return;
			case UMLPackage.INTERFACE__ELEMENT_IMPORT :
				getElementImports().clear();
				getElementImports().addAll((Collection) newValue);
				return;
			case UMLPackage.INTERFACE__PACKAGE_IMPORT :
				getPackageImports().clear();
				getPackageImports().addAll((Collection) newValue);
				return;
			case UMLPackage.INTERFACE__OWNED_RULE :
				getOwnedRules().clear();
				getOwnedRules().addAll((Collection) newValue);
				return;
			case UMLPackage.INTERFACE__IS_LEAF :
				setIsLeaf(((Boolean) newValue).booleanValue());
				return;
			case UMLPackage.INTERFACE__OWNING_TEMPLATE_PARAMETER :
				setOwningTemplateParameter((TemplateParameter) newValue);
				return;
			case UMLPackage.INTERFACE__TEMPLATE_PARAMETER :
				setTemplateParameter((TemplateParameter) newValue);
				return;
			case UMLPackage.INTERFACE__PACKAGE :
				setPackage((org.eclipse.uml2.uml.Package) newValue);
				return;
			case UMLPackage.INTERFACE__TEMPLATE_BINDING :
				getTemplateBindings().clear();
				getTemplateBindings().addAll((Collection) newValue);
				return;
			case UMLPackage.INTERFACE__OWNED_TEMPLATE_SIGNATURE :
				setOwnedTemplateSignature((TemplateSignature) newValue);
				return;
			case UMLPackage.INTERFACE__IS_ABSTRACT :
				setIsAbstract(((Boolean) newValue).booleanValue());
				return;
			case UMLPackage.INTERFACE__GENERALIZATION :
				getGeneralizations().clear();
				getGeneralizations().addAll((Collection) newValue);
				return;
			case UMLPackage.INTERFACE__POWERTYPE_EXTENT :
				getPowertypeExtents().clear();
				getPowertypeExtents().addAll((Collection) newValue);
				return;
			case UMLPackage.INTERFACE__REDEFINED_CLASSIFIER :
				getRedefinedClassifiers().clear();
				getRedefinedClassifiers().addAll((Collection) newValue);
				return;
			case UMLPackage.INTERFACE__GENERAL :
				getGenerals().clear();
				getGenerals().addAll((Collection) newValue);
				return;
			case UMLPackage.INTERFACE__SUBSTITUTION :
				getSubstitutions().clear();
				getSubstitutions().addAll((Collection) newValue);
				return;
			case UMLPackage.INTERFACE__REPRESENTATION :
				setRepresentation((CollaborationUse) newValue);
				return;
			case UMLPackage.INTERFACE__COLLABORATION_USE :
				getCollaborationUses().clear();
				getCollaborationUses().addAll((Collection) newValue);
				return;
			case UMLPackage.INTERFACE__OWNED_USE_CASE :
				getOwnedUseCases().clear();
				getOwnedUseCases().addAll((Collection) newValue);
				return;
			case UMLPackage.INTERFACE__USE_CASE :
				getUseCases().clear();
				getUseCases().addAll((Collection) newValue);
				return;
			case UMLPackage.INTERFACE__OWNED_ATTRIBUTE :
				getOwnedAttributes().clear();
				getOwnedAttributes().addAll((Collection) newValue);
				return;
			case UMLPackage.INTERFACE__OWNED_OPERATION :
				getOwnedOperations().clear();
				getOwnedOperations().addAll((Collection) newValue);
				return;
			case UMLPackage.INTERFACE__NESTED_CLASSIFIER :
				getNestedClassifiers().clear();
				getNestedClassifiers().addAll((Collection) newValue);
				return;
			case UMLPackage.INTERFACE__REDEFINED_INTERFACE :
				getRedefinedInterfaces().clear();
				getRedefinedInterfaces().addAll((Collection) newValue);
				return;
			case UMLPackage.INTERFACE__OWNED_RECEPTION :
				getOwnedReceptions().clear();
				getOwnedReceptions().addAll((Collection) newValue);
				return;
			case UMLPackage.INTERFACE__PROTOCOL :
				setProtocol((ProtocolStateMachine) newValue);
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
			case UMLPackage.INTERFACE__EANNOTATIONS :
				getEAnnotations().clear();
				return;
			case UMLPackage.INTERFACE__OWNED_COMMENT :
				getOwnedComments().clear();
				return;
			case UMLPackage.INTERFACE__NAME :
				unsetName();
				return;
			case UMLPackage.INTERFACE__VISIBILITY :
				unsetVisibility();
				return;
			case UMLPackage.INTERFACE__CLIENT_DEPENDENCY :
				getClientDependencies().clear();
				return;
			case UMLPackage.INTERFACE__NAME_EXPRESSION :
				setNameExpression((StringExpression) null);
				return;
			case UMLPackage.INTERFACE__ELEMENT_IMPORT :
				getElementImports().clear();
				return;
			case UMLPackage.INTERFACE__PACKAGE_IMPORT :
				getPackageImports().clear();
				return;
			case UMLPackage.INTERFACE__OWNED_RULE :
				getOwnedRules().clear();
				return;
			case UMLPackage.INTERFACE__IS_LEAF :
				setIsLeaf(IS_LEAF_EDEFAULT);
				return;
			case UMLPackage.INTERFACE__OWNING_TEMPLATE_PARAMETER :
				setOwningTemplateParameter((TemplateParameter) null);
				return;
			case UMLPackage.INTERFACE__TEMPLATE_PARAMETER :
				setTemplateParameter((TemplateParameter) null);
				return;
			case UMLPackage.INTERFACE__PACKAGE :
				setPackage((org.eclipse.uml2.uml.Package) null);
				return;
			case UMLPackage.INTERFACE__TEMPLATE_BINDING :
				getTemplateBindings().clear();
				return;
			case UMLPackage.INTERFACE__OWNED_TEMPLATE_SIGNATURE :
				setOwnedTemplateSignature((TemplateSignature) null);
				return;
			case UMLPackage.INTERFACE__IS_ABSTRACT :
				setIsAbstract(IS_ABSTRACT_EDEFAULT);
				return;
			case UMLPackage.INTERFACE__GENERALIZATION :
				getGeneralizations().clear();
				return;
			case UMLPackage.INTERFACE__POWERTYPE_EXTENT :
				getPowertypeExtents().clear();
				return;
			case UMLPackage.INTERFACE__REDEFINED_CLASSIFIER :
				getRedefinedClassifiers().clear();
				return;
			case UMLPackage.INTERFACE__GENERAL :
				getGenerals().clear();
				return;
			case UMLPackage.INTERFACE__SUBSTITUTION :
				getSubstitutions().clear();
				return;
			case UMLPackage.INTERFACE__REPRESENTATION :
				setRepresentation((CollaborationUse) null);
				return;
			case UMLPackage.INTERFACE__COLLABORATION_USE :
				getCollaborationUses().clear();
				return;
			case UMLPackage.INTERFACE__OWNED_USE_CASE :
				getOwnedUseCases().clear();
				return;
			case UMLPackage.INTERFACE__USE_CASE :
				getUseCases().clear();
				return;
			case UMLPackage.INTERFACE__OWNED_ATTRIBUTE :
				getOwnedAttributes().clear();
				return;
			case UMLPackage.INTERFACE__OWNED_OPERATION :
				getOwnedOperations().clear();
				return;
			case UMLPackage.INTERFACE__NESTED_CLASSIFIER :
				getNestedClassifiers().clear();
				return;
			case UMLPackage.INTERFACE__REDEFINED_INTERFACE :
				getRedefinedInterfaces().clear();
				return;
			case UMLPackage.INTERFACE__OWNED_RECEPTION :
				getOwnedReceptions().clear();
				return;
			case UMLPackage.INTERFACE__PROTOCOL :
				setProtocol((ProtocolStateMachine) null);
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
			case UMLPackage.INTERFACE__EANNOTATIONS :
				EList eAnnotations = (EList) eVirtualGet(UMLPackage.INTERFACE__EANNOTATIONS);
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UMLPackage.INTERFACE__OWNED_ELEMENT :
				return isSetOwnedElements();
			case UMLPackage.INTERFACE__OWNER :
				return isSetOwner();
			case UMLPackage.INTERFACE__OWNED_COMMENT :
				EList ownedComment = (EList) eVirtualGet(UMLPackage.INTERFACE__OWNED_COMMENT);
				return ownedComment != null && !ownedComment.isEmpty();
			case UMLPackage.INTERFACE__NAME :
				return isSetName();
			case UMLPackage.INTERFACE__VISIBILITY :
				return isSetVisibility();
			case UMLPackage.INTERFACE__QUALIFIED_NAME :
				return QUALIFIED_NAME_EDEFAULT == null
					? getQualifiedName() != null
					: !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case UMLPackage.INTERFACE__CLIENT_DEPENDENCY :
				EList clientDependency = (EList) eVirtualGet(UMLPackage.INTERFACE__CLIENT_DEPENDENCY);
				return clientDependency != null && !clientDependency.isEmpty();
			case UMLPackage.INTERFACE__NAMESPACE :
				return isSetNamespace();
			case UMLPackage.INTERFACE__NAME_EXPRESSION :
				return eVirtualGet(UMLPackage.INTERFACE__NAME_EXPRESSION) != null;
			case UMLPackage.INTERFACE__ELEMENT_IMPORT :
				EList elementImport = (EList) eVirtualGet(UMLPackage.INTERFACE__ELEMENT_IMPORT);
				return elementImport != null && !elementImport.isEmpty();
			case UMLPackage.INTERFACE__PACKAGE_IMPORT :
				EList packageImport = (EList) eVirtualGet(UMLPackage.INTERFACE__PACKAGE_IMPORT);
				return packageImport != null && !packageImport.isEmpty();
			case UMLPackage.INTERFACE__OWNED_RULE :
				EList ownedRule = (EList) eVirtualGet(UMLPackage.INTERFACE__OWNED_RULE);
				return ownedRule != null && !ownedRule.isEmpty();
			case UMLPackage.INTERFACE__MEMBER :
				return isSetMembers();
			case UMLPackage.INTERFACE__IMPORTED_MEMBER :
				return !getImportedMembers().isEmpty();
			case UMLPackage.INTERFACE__OWNED_MEMBER :
				return isSetOwnedMembers();
			case UMLPackage.INTERFACE__IS_LEAF :
				return ((eFlags & IS_LEAF_EFLAG) != 0) != IS_LEAF_EDEFAULT;
			case UMLPackage.INTERFACE__REDEFINED_ELEMENT :
				return isSetRedefinedElements();
			case UMLPackage.INTERFACE__REDEFINITION_CONTEXT :
				return isSetRedefinitionContexts();
			case UMLPackage.INTERFACE__OWNING_TEMPLATE_PARAMETER :
				return basicGetOwningTemplateParameter() != null;
			case UMLPackage.INTERFACE__TEMPLATE_PARAMETER :
				return isSetTemplateParameter();
			case UMLPackage.INTERFACE__PACKAGE :
				return basicGetPackage() != null;
			case UMLPackage.INTERFACE__TEMPLATE_BINDING :
				EList templateBinding = (EList) eVirtualGet(UMLPackage.INTERFACE__TEMPLATE_BINDING);
				return templateBinding != null && !templateBinding.isEmpty();
			case UMLPackage.INTERFACE__OWNED_TEMPLATE_SIGNATURE :
				return isSetOwnedTemplateSignature();
			case UMLPackage.INTERFACE__IS_ABSTRACT :
				return ((eFlags & IS_ABSTRACT_EFLAG) != 0) != IS_ABSTRACT_EDEFAULT;
			case UMLPackage.INTERFACE__GENERALIZATION :
				EList generalization = (EList) eVirtualGet(UMLPackage.INTERFACE__GENERALIZATION);
				return generalization != null && !generalization.isEmpty();
			case UMLPackage.INTERFACE__POWERTYPE_EXTENT :
				EList powertypeExtent = (EList) eVirtualGet(UMLPackage.INTERFACE__POWERTYPE_EXTENT);
				return powertypeExtent != null && !powertypeExtent.isEmpty();
			case UMLPackage.INTERFACE__FEATURE :
				return isSetFeatures();
			case UMLPackage.INTERFACE__INHERITED_MEMBER :
				return !getInheritedMembers().isEmpty();
			case UMLPackage.INTERFACE__REDEFINED_CLASSIFIER :
				EList redefinedClassifier = (EList) eVirtualGet(UMLPackage.INTERFACE__REDEFINED_CLASSIFIER);
				return redefinedClassifier != null
					&& !redefinedClassifier.isEmpty();
			case UMLPackage.INTERFACE__GENERAL :
				return !getGenerals().isEmpty();
			case UMLPackage.INTERFACE__SUBSTITUTION :
				EList substitution = (EList) eVirtualGet(UMLPackage.INTERFACE__SUBSTITUTION);
				return substitution != null && !substitution.isEmpty();
			case UMLPackage.INTERFACE__ATTRIBUTE :
				return isSetAttributes();
			case UMLPackage.INTERFACE__REPRESENTATION :
				return eVirtualGet(UMLPackage.INTERFACE__REPRESENTATION) != null;
			case UMLPackage.INTERFACE__COLLABORATION_USE :
				EList collaborationUse = (EList) eVirtualGet(UMLPackage.INTERFACE__COLLABORATION_USE);
				return collaborationUse != null && !collaborationUse.isEmpty();
			case UMLPackage.INTERFACE__OWNED_USE_CASE :
				EList ownedUseCase = (EList) eVirtualGet(UMLPackage.INTERFACE__OWNED_USE_CASE);
				return ownedUseCase != null && !ownedUseCase.isEmpty();
			case UMLPackage.INTERFACE__USE_CASE :
				EList useCase = (EList) eVirtualGet(UMLPackage.INTERFACE__USE_CASE);
				return useCase != null && !useCase.isEmpty();
			case UMLPackage.INTERFACE__OWNED_ATTRIBUTE :
				EList ownedAttribute = (EList) eVirtualGet(UMLPackage.INTERFACE__OWNED_ATTRIBUTE);
				return ownedAttribute != null && !ownedAttribute.isEmpty();
			case UMLPackage.INTERFACE__OWNED_OPERATION :
				EList ownedOperation = (EList) eVirtualGet(UMLPackage.INTERFACE__OWNED_OPERATION);
				return ownedOperation != null && !ownedOperation.isEmpty();
			case UMLPackage.INTERFACE__NESTED_CLASSIFIER :
				EList nestedClassifier = (EList) eVirtualGet(UMLPackage.INTERFACE__NESTED_CLASSIFIER);
				return nestedClassifier != null && !nestedClassifier.isEmpty();
			case UMLPackage.INTERFACE__REDEFINED_INTERFACE :
				EList redefinedInterface = (EList) eVirtualGet(UMLPackage.INTERFACE__REDEFINED_INTERFACE);
				return redefinedInterface != null
					&& !redefinedInterface.isEmpty();
			case UMLPackage.INTERFACE__OWNED_RECEPTION :
				EList ownedReception = (EList) eVirtualGet(UMLPackage.INTERFACE__OWNED_RECEPTION);
				return ownedReception != null && !ownedReception.isEmpty();
			case UMLPackage.INTERFACE__PROTOCOL :
				return eVirtualGet(UMLPackage.INTERFACE__PROTOCOL) != null;
		}
		return eDynamicIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetAttributes() {
		return super.isSetAttributes()
			|| eIsSet(UMLPackage.INTERFACE__OWNED_ATTRIBUTE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOwnedMembers() {
		return super.isSetOwnedMembers()
			|| eIsSet(UMLPackage.INTERFACE__OWNED_ATTRIBUTE)
			|| eIsSet(UMLPackage.INTERFACE__OWNED_OPERATION)
			|| eIsSet(UMLPackage.INTERFACE__NESTED_CLASSIFIER)
			|| eIsSet(UMLPackage.INTERFACE__OWNED_RECEPTION)
			|| eIsSet(UMLPackage.INTERFACE__PROTOCOL);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRedefinedElements() {
		return super.isSetRedefinedElements()
			|| eIsSet(UMLPackage.INTERFACE__REDEFINED_INTERFACE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetFeatures() {
		return super.isSetFeatures()
			|| eIsSet(UMLPackage.INTERFACE__OWNED_OPERATION)
			|| eIsSet(UMLPackage.INTERFACE__OWNED_RECEPTION);
	}

} //InterfaceImpl
