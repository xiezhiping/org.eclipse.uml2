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
 * $Id: InterfaceImpl.java,v 1.30 2005/11/22 14:57:01 khussey Exp $
 */
package org.eclipse.uml2.impl;

import java.lang.reflect.Method;
import java.util.Collection;
import java.util.Collections;
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
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.uml2.Classifier;
import org.eclipse.uml2.CollaborationOccurrence;
import org.eclipse.uml2.Feature;
import org.eclipse.uml2.Interface;
import org.eclipse.uml2.Operation;
import org.eclipse.uml2.Property;
import org.eclipse.uml2.ProtocolStateMachine;
import org.eclipse.uml2.Reception;
import org.eclipse.uml2.StringExpression;
import org.eclipse.uml2.TemplateParameter;
import org.eclipse.uml2.TemplateSignature;
import org.eclipse.uml2.UML2Factory;
import org.eclipse.uml2.Type;
import org.eclipse.uml2.UML2Package;
import org.eclipse.uml2.VisibilityKind;

import org.eclipse.uml2.common.util.DerivedUnionEObjectEList;

import org.eclipse.uml2.common.util.CacheAdapter;
import org.eclipse.uml2.internal.operation.ClassifierOperations;
import org.eclipse.uml2.internal.operation.TypeOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Interface</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2.impl.InterfaceImpl#getAttributes <em>Attribute</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.InterfaceImpl#getFeatures <em>Feature</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.InterfaceImpl#getOwnedAttributes <em>Owned Attribute</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.InterfaceImpl#getOwnedOperations <em>Owned Operation</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.InterfaceImpl#getRedefinedInterfaces <em>Redefined Interface</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.InterfaceImpl#getNestedClassifiers <em>Nested Classifier</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.InterfaceImpl#getOwnedReceptions <em>Owned Reception</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.InterfaceImpl#getProtocol <em>Protocol</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InterfaceImpl extends ClassifierImpl implements Interface {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) IBM Corporation and others."; //$NON-NLS-1$

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
		return UML2Package.eINSTANCE.getInterface();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getAttributes() {
		EList attribute = (EList)eVirtualGet(UML2Package.INTERFACE__ATTRIBUTE);
		if (attribute == null) {
			eVirtualSet(UML2Package.INTERFACE__ATTRIBUTE, attribute = new DerivedUnionEObjectEList(Property.class, this, UML2Package.INTERFACE__ATTRIBUTE, new EStructuralFeature[] {UML2Package.eINSTANCE.getInterface_OwnedAttribute()}));
		}
		return attribute;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetAttributes() {
		return super.isSetAttributes()
			|| eIsSet(UML2Package.eINSTANCE.getInterface_OwnedAttribute());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getFeatures() {
		EList feature = (EList)eVirtualGet(UML2Package.INTERFACE__FEATURE);
		if (feature == null) {
			eVirtualSet(UML2Package.INTERFACE__FEATURE, feature = new DerivedUnionEObjectEList(Feature.class, this, UML2Package.INTERFACE__FEATURE, new EStructuralFeature[] {UML2Package.eINSTANCE.getClassifier_Attribute(), UML2Package.eINSTANCE.getInterface_OwnedOperation(), UML2Package.eINSTANCE.getInterface_OwnedReception()}));
		}
		return feature;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetFeatures() {
		return super.isSetFeatures()
			|| eIsSet(UML2Package.eINSTANCE.getInterface_OwnedOperation())
			|| eIsSet(UML2Package.eINSTANCE.getInterface_OwnedReception());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getOwnedAttributes() {
		EList ownedAttribute = (EList)eVirtualGet(UML2Package.INTERFACE__OWNED_ATTRIBUTE);
		if (ownedAttribute == null) {
			eVirtualSet(UML2Package.INTERFACE__OWNED_ATTRIBUTE, ownedAttribute = new EObjectContainmentEList(Property.class, this, UML2Package.INTERFACE__OWNED_ATTRIBUTE));
		}
		return ownedAttribute;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
    public Property getOwnedAttribute(String name) {
		for (Iterator i = getOwnedAttributes().iterator(); i.hasNext(); ) {
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
	 * @generated NOT
	 */
	public Property createOwnedAttribute(EClass eClass) {
		Property newOwnedAttribute = (Property) eClass.getEPackage().getEFactoryInstance().create(eClass);
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, 0, UML2Package.INTERFACE__OWNED_ATTRIBUTE, null, newOwnedAttribute));
		}
		getOwnedAttributes().add(newOwnedAttribute);
		return newOwnedAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Property createOwnedAttribute() {
		Property newOwnedAttribute = UML2Factory.eINSTANCE.createProperty();
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, 0, UML2Package.INTERFACE__OWNED_ATTRIBUTE, null, newOwnedAttribute));
		}
		getOwnedAttributes().add(newOwnedAttribute);
		return newOwnedAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getOwnedOperations() {
		EList ownedOperation = (EList)eVirtualGet(UML2Package.INTERFACE__OWNED_OPERATION);
		if (ownedOperation == null) {
			eVirtualSet(UML2Package.INTERFACE__OWNED_OPERATION, ownedOperation = new EObjectContainmentEList(Operation.class, this, UML2Package.INTERFACE__OWNED_OPERATION));
		}
		return ownedOperation;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
    public Operation getOwnedOperation(String name) {
		for (Iterator i = getOwnedOperations().iterator(); i.hasNext(); ) {
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
	 * @generated NOT
	 * @deprecated Use #createOwnedOperation() instead.
	 */
	public Operation createOwnedOperation(EClass eClass) {
		Operation newOwnedOperation = (Operation) eClass.getEPackage().getEFactoryInstance().create(eClass);
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, 0, UML2Package.INTERFACE__OWNED_OPERATION, null, newOwnedOperation));
		}
		getOwnedOperations().add(newOwnedOperation);
		return newOwnedOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Operation createOwnedOperation() {
		Operation newOwnedOperation = UML2Factory.eINSTANCE.createOperation();
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, 0, UML2Package.INTERFACE__OWNED_OPERATION, null, newOwnedOperation));
		}
		getOwnedOperations().add(newOwnedOperation);
		return newOwnedOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getRedefinedInterfaces() {
		EList redefinedInterface = (EList)eVirtualGet(UML2Package.INTERFACE__REDEFINED_INTERFACE);
		if (redefinedInterface == null) {
			eVirtualSet(UML2Package.INTERFACE__REDEFINED_INTERFACE, redefinedInterface = new EObjectResolvingEList(Interface.class, this, UML2Package.INTERFACE__REDEFINED_INTERFACE));
		}
		return redefinedInterface;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
    public Interface getRedefinedInterface(String name) {
		for (Iterator i = getRedefinedInterfaces().iterator(); i.hasNext(); ) {
			Interface redefinedInterface = (Interface) i.next();
			if (name.equals(redefinedInterface.getName())) {
				return redefinedInterface;
			}
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getNestedClassifiers() {
		EList nestedClassifier = (EList)eVirtualGet(UML2Package.INTERFACE__NESTED_CLASSIFIER);
		if (nestedClassifier == null) {
			eVirtualSet(UML2Package.INTERFACE__NESTED_CLASSIFIER, nestedClassifier = new EObjectContainmentEList(Classifier.class, this, UML2Package.INTERFACE__NESTED_CLASSIFIER));
		}
		return nestedClassifier;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
    public Classifier getNestedClassifier(String name) {
		for (Iterator i = getNestedClassifiers().iterator(); i.hasNext(); ) {
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
	 * @generated NOT
	 */
	public Classifier createNestedClassifier(EClass eClass) {
		Classifier newNestedClassifier = (Classifier) eClass.getEPackage().getEFactoryInstance().create(eClass);
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, 0, UML2Package.INTERFACE__NESTED_CLASSIFIER, null, newNestedClassifier));
		}
		getNestedClassifiers().add(newNestedClassifier);
		return newNestedClassifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getOwnedReceptions() {
		EList ownedReception = (EList)eVirtualGet(UML2Package.INTERFACE__OWNED_RECEPTION);
		if (ownedReception == null) {
			eVirtualSet(UML2Package.INTERFACE__OWNED_RECEPTION, ownedReception = new EObjectContainmentEList(Reception.class, this, UML2Package.INTERFACE__OWNED_RECEPTION));
		}
		return ownedReception;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
    public Reception getOwnedReception(String name) {
		for (Iterator i = getOwnedReceptions().iterator(); i.hasNext(); ) {
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
	 * @generated NOT
	 * @deprecated Use #createOwnedReception() instead.
	 */
	public Reception createOwnedReception(EClass eClass) {
		Reception newOwnedReception = (Reception) eClass.getEPackage().getEFactoryInstance().create(eClass);
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, 0, UML2Package.INTERFACE__OWNED_RECEPTION, null, newOwnedReception));
		}
		getOwnedReceptions().add(newOwnedReception);
		return newOwnedReception;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Reception createOwnedReception() {
		Reception newOwnedReception = UML2Factory.eINSTANCE.createReception();
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, 0, UML2Package.INTERFACE__OWNED_RECEPTION, null, newOwnedReception));
		}
		getOwnedReceptions().add(newOwnedReception);
		return newOwnedReception;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProtocolStateMachine getProtocol() {
		return (ProtocolStateMachine)eVirtualGet(UML2Package.INTERFACE__PROTOCOL);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProtocol(ProtocolStateMachine newProtocol, NotificationChain msgs) {
		Object oldProtocol = eVirtualSet(UML2Package.INTERFACE__PROTOCOL, newProtocol);
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UML2Package.INTERFACE__PROTOCOL, oldProtocol == EVIRTUAL_NO_VALUE ? null : oldProtocol, newProtocol);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}

		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProtocol(ProtocolStateMachine newProtocol) {
		ProtocolStateMachine protocol = (ProtocolStateMachine)eVirtualGet(UML2Package.INTERFACE__PROTOCOL);
		if (newProtocol != protocol) {
			NotificationChain msgs = null;
			if (protocol != null)
				msgs = ((InternalEObject)protocol).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UML2Package.INTERFACE__PROTOCOL, null, msgs);
			if (newProtocol != null)
				msgs = ((InternalEObject)newProtocol).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UML2Package.INTERFACE__PROTOCOL, null, msgs);
			msgs = basicSetProtocol(newProtocol, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2Package.INTERFACE__PROTOCOL, newProtocol, newProtocol));

	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 * @deprecated Use #createProtocol() instead.
	 */
	public ProtocolStateMachine createProtocol(EClass eClass) {
		ProtocolStateMachine newProtocol = (ProtocolStateMachine) eClass.getEPackage().getEFactoryInstance().create(eClass);
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, 0, UML2Package.INTERFACE__PROTOCOL, null, newProtocol));
		}
		setProtocol(newProtocol);
		return newProtocol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public ProtocolStateMachine createProtocol() {
		ProtocolStateMachine newProtocol = UML2Factory.eINSTANCE.createProtocolStateMachine();
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, 0, UML2Package.INTERFACE__PROTOCOL, null, newProtocol));
		}
		setProtocol(newProtocol);
		return newProtocol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, Class baseClass, NotificationChain msgs) {
		if (featureID >= 0) {
			switch (eDerivedStructuralFeatureID(featureID, baseClass)) {
				case UML2Package.INTERFACE__EANNOTATIONS:
					return ((InternalEList)getEAnnotations()).basicRemove(otherEnd, msgs);
				case UML2Package.INTERFACE__OWNED_COMMENT:
					return ((InternalEList)getOwnedComments()).basicRemove(otherEnd, msgs);
				case UML2Package.INTERFACE__TEMPLATE_BINDING:
					return ((InternalEList)getTemplateBindings()).basicRemove(otherEnd, msgs);
				case UML2Package.INTERFACE__OWNED_TEMPLATE_SIGNATURE:
					return basicSetOwnedTemplateSignature(null, msgs);
				case UML2Package.INTERFACE__CLIENT_DEPENDENCY:
					return ((InternalEList)getClientDependencies()).basicRemove(otherEnd, msgs);
				case UML2Package.INTERFACE__NAME_EXPRESSION:
					return basicSetNameExpression(null, msgs);
				case UML2Package.INTERFACE__OWNED_RULE:
					return ((InternalEList)getOwnedRules()).basicRemove(otherEnd, msgs);
				case UML2Package.INTERFACE__ELEMENT_IMPORT:
					return ((InternalEList)getElementImports()).basicRemove(otherEnd, msgs);
				case UML2Package.INTERFACE__PACKAGE_IMPORT:
					return ((InternalEList)getPackageImports()).basicRemove(otherEnd, msgs);
				case UML2Package.INTERFACE__TEMPLATE_PARAMETER:
					return basicSetTemplateParameter(null, msgs);
				case UML2Package.INTERFACE__OWNING_PARAMETER:
					return eBasicSetContainer(null, UML2Package.INTERFACE__OWNING_PARAMETER, msgs);
				case UML2Package.INTERFACE__GENERALIZATION:
					return ((InternalEList)getGeneralizations()).basicRemove(otherEnd, msgs);
				case UML2Package.INTERFACE__SUBSTITUTION:
					return ((InternalEList)getSubstitutions()).basicRemove(otherEnd, msgs);
				case UML2Package.INTERFACE__POWERTYPE_EXTENT:
					return ((InternalEList)getPowertypeExtents()).basicRemove(otherEnd, msgs);
				case UML2Package.INTERFACE__OWNED_USE_CASE:
					return ((InternalEList)getOwnedUseCases()).basicRemove(otherEnd, msgs);
				case UML2Package.INTERFACE__USE_CASE:
					return ((InternalEList)getUseCases()).basicRemove(otherEnd, msgs);
				case UML2Package.INTERFACE__OCCURRENCE:
					return ((InternalEList)getOccurrences()).basicRemove(otherEnd, msgs);
				case UML2Package.INTERFACE__OWNED_ATTRIBUTE:
					return ((InternalEList)getOwnedAttributes()).basicRemove(otherEnd, msgs);
				case UML2Package.INTERFACE__OWNED_OPERATION:
					return ((InternalEList)getOwnedOperations()).basicRemove(otherEnd, msgs);
				case UML2Package.INTERFACE__NESTED_CLASSIFIER:
					return ((InternalEList)getNestedClassifiers()).basicRemove(otherEnd, msgs);
				case UML2Package.INTERFACE__OWNED_RECEPTION:
					return ((InternalEList)getOwnedReceptions()).basicRemove(otherEnd, msgs);
				case UML2Package.INTERFACE__PROTOCOL:
					return basicSetProtocol(null, msgs);
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
			case UML2Package.INTERFACE__EANNOTATIONS:
				return getEAnnotations();
			case UML2Package.INTERFACE__OWNED_ELEMENT:
				return getOwnedElements();
			case UML2Package.INTERFACE__OWNER:
				if (resolve) return getOwner();
				return basicGetOwner();
			case UML2Package.INTERFACE__OWNED_COMMENT:
				return getOwnedComments();
			case UML2Package.INTERFACE__TEMPLATE_BINDING:
				return getTemplateBindings();
			case UML2Package.INTERFACE__OWNED_TEMPLATE_SIGNATURE:
				return getOwnedTemplateSignature();
			case UML2Package.INTERFACE__NAME:
				return getName();
			case UML2Package.INTERFACE__QUALIFIED_NAME:
				return getQualifiedName();
			case UML2Package.INTERFACE__VISIBILITY:
				return getVisibility();
			case UML2Package.INTERFACE__CLIENT_DEPENDENCY:
				return getClientDependencies();
			case UML2Package.INTERFACE__NAME_EXPRESSION:
				return getNameExpression();
			case UML2Package.INTERFACE__MEMBER:
				return getMembers();
			case UML2Package.INTERFACE__OWNED_RULE:
				return getOwnedRules();
			case UML2Package.INTERFACE__IMPORTED_MEMBER:
				return getImportedMembers();
			case UML2Package.INTERFACE__ELEMENT_IMPORT:
				return getElementImports();
			case UML2Package.INTERFACE__PACKAGE_IMPORT:
				return getPackageImports();
			case UML2Package.INTERFACE__TEMPLATE_PARAMETER:
				if (resolve) return getTemplateParameter();
				return basicGetTemplateParameter();
			case UML2Package.INTERFACE__OWNING_PARAMETER:
				return getOwningParameter();
			case UML2Package.INTERFACE__PACKAGEABLE_ELEMENT_VISIBILITY:
				return getPackageableElement_visibility();
			case UML2Package.INTERFACE__PACKAGE:
				return getPackage();
			case UML2Package.INTERFACE__REDEFINITION_CONTEXT:
				return getRedefinitionContexts();
			case UML2Package.INTERFACE__IS_LEAF:
				return isLeaf() ? Boolean.TRUE : Boolean.FALSE;
			case UML2Package.INTERFACE__FEATURE:
				return getFeatures();
			case UML2Package.INTERFACE__IS_ABSTRACT:
				return isAbstract() ? Boolean.TRUE : Boolean.FALSE;
			case UML2Package.INTERFACE__INHERITED_MEMBER:
				return getInheritedMembers();
			case UML2Package.INTERFACE__GENERAL:
				return getGenerals();
			case UML2Package.INTERFACE__GENERALIZATION:
				return getGeneralizations();
			case UML2Package.INTERFACE__ATTRIBUTE:
				return getAttributes();
			case UML2Package.INTERFACE__REDEFINED_CLASSIFIER:
				return getRedefinedClassifiers();
			case UML2Package.INTERFACE__SUBSTITUTION:
				return getSubstitutions();
			case UML2Package.INTERFACE__POWERTYPE_EXTENT:
				return getPowertypeExtents();
			case UML2Package.INTERFACE__OWNED_USE_CASE:
				return getOwnedUseCases();
			case UML2Package.INTERFACE__USE_CASE:
				return getUseCases();
			case UML2Package.INTERFACE__REPRESENTATION:
				return getRepresentation();
			case UML2Package.INTERFACE__OCCURRENCE:
				return getOccurrences();
			case UML2Package.INTERFACE__OWNED_ATTRIBUTE:
				return getOwnedAttributes();
			case UML2Package.INTERFACE__OWNED_OPERATION:
				return getOwnedOperations();
			case UML2Package.INTERFACE__REDEFINED_INTERFACE:
				return getRedefinedInterfaces();
			case UML2Package.INTERFACE__NESTED_CLASSIFIER:
				return getNestedClassifiers();
			case UML2Package.INTERFACE__OWNED_RECEPTION:
				return getOwnedReceptions();
			case UML2Package.INTERFACE__PROTOCOL:
				return getProtocol();
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
			case UML2Package.INTERFACE__EANNOTATIONS:
				getEAnnotations().clear();
				getEAnnotations().addAll((Collection)newValue);
				return;
			case UML2Package.INTERFACE__OWNED_COMMENT:
				getOwnedComments().clear();
				getOwnedComments().addAll((Collection)newValue);
				return;
			case UML2Package.INTERFACE__TEMPLATE_BINDING:
				getTemplateBindings().clear();
				getTemplateBindings().addAll((Collection)newValue);
				return;
			case UML2Package.INTERFACE__OWNED_TEMPLATE_SIGNATURE:
				setOwnedTemplateSignature((TemplateSignature)newValue);
				return;
			case UML2Package.INTERFACE__NAME:
				setName((String)newValue);
				return;
			case UML2Package.INTERFACE__VISIBILITY:
				setVisibility((VisibilityKind)newValue);
				return;
			case UML2Package.INTERFACE__CLIENT_DEPENDENCY:
				getClientDependencies().clear();
				getClientDependencies().addAll((Collection)newValue);
				return;
			case UML2Package.INTERFACE__NAME_EXPRESSION:
				setNameExpression((StringExpression)newValue);
				return;
			case UML2Package.INTERFACE__OWNED_RULE:
				getOwnedRules().clear();
				getOwnedRules().addAll((Collection)newValue);
				return;
			case UML2Package.INTERFACE__ELEMENT_IMPORT:
				getElementImports().clear();
				getElementImports().addAll((Collection)newValue);
				return;
			case UML2Package.INTERFACE__PACKAGE_IMPORT:
				getPackageImports().clear();
				getPackageImports().addAll((Collection)newValue);
				return;
			case UML2Package.INTERFACE__TEMPLATE_PARAMETER:
				setTemplateParameter((TemplateParameter)newValue);
				return;
			case UML2Package.INTERFACE__OWNING_PARAMETER:
				setOwningParameter((TemplateParameter)newValue);
				return;
			case UML2Package.INTERFACE__PACKAGEABLE_ELEMENT_VISIBILITY:
				setPackageableElement_visibility((VisibilityKind)newValue);
				return;
			case UML2Package.INTERFACE__IS_LEAF:
				setIsLeaf(((Boolean)newValue).booleanValue());
				return;
			case UML2Package.INTERFACE__IS_ABSTRACT:
				setIsAbstract(((Boolean)newValue).booleanValue());
				return;
			case UML2Package.INTERFACE__GENERALIZATION:
				getGeneralizations().clear();
				getGeneralizations().addAll((Collection)newValue);
				return;
			case UML2Package.INTERFACE__REDEFINED_CLASSIFIER:
				getRedefinedClassifiers().clear();
				getRedefinedClassifiers().addAll((Collection)newValue);
				return;
			case UML2Package.INTERFACE__SUBSTITUTION:
				getSubstitutions().clear();
				getSubstitutions().addAll((Collection)newValue);
				return;
			case UML2Package.INTERFACE__POWERTYPE_EXTENT:
				getPowertypeExtents().clear();
				getPowertypeExtents().addAll((Collection)newValue);
				return;
			case UML2Package.INTERFACE__OWNED_USE_CASE:
				getOwnedUseCases().clear();
				getOwnedUseCases().addAll((Collection)newValue);
				return;
			case UML2Package.INTERFACE__USE_CASE:
				getUseCases().clear();
				getUseCases().addAll((Collection)newValue);
				return;
			case UML2Package.INTERFACE__REPRESENTATION:
				setRepresentation((CollaborationOccurrence)newValue);
				return;
			case UML2Package.INTERFACE__OCCURRENCE:
				getOccurrences().clear();
				getOccurrences().addAll((Collection)newValue);
				return;
			case UML2Package.INTERFACE__OWNED_ATTRIBUTE:
				getOwnedAttributes().clear();
				getOwnedAttributes().addAll((Collection)newValue);
				return;
			case UML2Package.INTERFACE__OWNED_OPERATION:
				getOwnedOperations().clear();
				getOwnedOperations().addAll((Collection)newValue);
				return;
			case UML2Package.INTERFACE__REDEFINED_INTERFACE:
				getRedefinedInterfaces().clear();
				getRedefinedInterfaces().addAll((Collection)newValue);
				return;
			case UML2Package.INTERFACE__NESTED_CLASSIFIER:
				getNestedClassifiers().clear();
				getNestedClassifiers().addAll((Collection)newValue);
				return;
			case UML2Package.INTERFACE__OWNED_RECEPTION:
				getOwnedReceptions().clear();
				getOwnedReceptions().addAll((Collection)newValue);
				return;
			case UML2Package.INTERFACE__PROTOCOL:
				setProtocol((ProtocolStateMachine)newValue);
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
			case UML2Package.INTERFACE__EANNOTATIONS:
				getEAnnotations().clear();
				return;
			case UML2Package.INTERFACE__OWNED_COMMENT:
				getOwnedComments().clear();
				return;
			case UML2Package.INTERFACE__TEMPLATE_BINDING:
				getTemplateBindings().clear();
				return;
			case UML2Package.INTERFACE__OWNED_TEMPLATE_SIGNATURE:
				setOwnedTemplateSignature((TemplateSignature)null);
				return;
			case UML2Package.INTERFACE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case UML2Package.INTERFACE__VISIBILITY:
				setVisibility(VISIBILITY_EDEFAULT);
				return;
			case UML2Package.INTERFACE__CLIENT_DEPENDENCY:
				getClientDependencies().clear();
				return;
			case UML2Package.INTERFACE__NAME_EXPRESSION:
				setNameExpression((StringExpression)null);
				return;
			case UML2Package.INTERFACE__OWNED_RULE:
				getOwnedRules().clear();
				return;
			case UML2Package.INTERFACE__ELEMENT_IMPORT:
				getElementImports().clear();
				return;
			case UML2Package.INTERFACE__PACKAGE_IMPORT:
				getPackageImports().clear();
				return;
			case UML2Package.INTERFACE__TEMPLATE_PARAMETER:
				setTemplateParameter((TemplateParameter)null);
				return;
			case UML2Package.INTERFACE__OWNING_PARAMETER:
				setOwningParameter((TemplateParameter)null);
				return;
			case UML2Package.INTERFACE__PACKAGEABLE_ELEMENT_VISIBILITY:
				setPackageableElement_visibility(PACKAGEABLE_ELEMENT_VISIBILITY_EDEFAULT);
				return;
			case UML2Package.INTERFACE__IS_LEAF:
				setIsLeaf(IS_LEAF_EDEFAULT);
				return;
			case UML2Package.INTERFACE__IS_ABSTRACT:
				setIsAbstract(IS_ABSTRACT_EDEFAULT);
				return;
			case UML2Package.INTERFACE__GENERALIZATION:
				getGeneralizations().clear();
				return;
			case UML2Package.INTERFACE__REDEFINED_CLASSIFIER:
				getRedefinedClassifiers().clear();
				return;
			case UML2Package.INTERFACE__SUBSTITUTION:
				getSubstitutions().clear();
				return;
			case UML2Package.INTERFACE__POWERTYPE_EXTENT:
				getPowertypeExtents().clear();
				return;
			case UML2Package.INTERFACE__OWNED_USE_CASE:
				getOwnedUseCases().clear();
				return;
			case UML2Package.INTERFACE__USE_CASE:
				getUseCases().clear();
				return;
			case UML2Package.INTERFACE__REPRESENTATION:
				setRepresentation((CollaborationOccurrence)null);
				return;
			case UML2Package.INTERFACE__OCCURRENCE:
				getOccurrences().clear();
				return;
			case UML2Package.INTERFACE__OWNED_ATTRIBUTE:
				getOwnedAttributes().clear();
				return;
			case UML2Package.INTERFACE__OWNED_OPERATION:
				getOwnedOperations().clear();
				return;
			case UML2Package.INTERFACE__REDEFINED_INTERFACE:
				getRedefinedInterfaces().clear();
				return;
			case UML2Package.INTERFACE__NESTED_CLASSIFIER:
				getNestedClassifiers().clear();
				return;
			case UML2Package.INTERFACE__OWNED_RECEPTION:
				getOwnedReceptions().clear();
				return;
			case UML2Package.INTERFACE__PROTOCOL:
				setProtocol((ProtocolStateMachine)null);
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
			case UML2Package.INTERFACE__EANNOTATIONS:
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UML2Package.INTERFACE__OWNED_ELEMENT:
				return isSetOwnedElements();
			case UML2Package.INTERFACE__OWNER:
				return isSetOwner();
			case UML2Package.INTERFACE__OWNED_COMMENT:
				EList ownedComment = (EList)eVirtualGet(UML2Package.INTERFACE__OWNED_COMMENT);
				return ownedComment != null && !ownedComment.isEmpty();
			case UML2Package.INTERFACE__TEMPLATE_BINDING:
				EList templateBinding = (EList)eVirtualGet(UML2Package.INTERFACE__TEMPLATE_BINDING);
				return templateBinding != null && !templateBinding.isEmpty();
			case UML2Package.INTERFACE__OWNED_TEMPLATE_SIGNATURE:
				return eVirtualGet(UML2Package.INTERFACE__OWNED_TEMPLATE_SIGNATURE) != null;
			case UML2Package.INTERFACE__NAME:
				String name = (String)eVirtualGet(UML2Package.INTERFACE__NAME, NAME_EDEFAULT);
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case UML2Package.INTERFACE__QUALIFIED_NAME:
				return QUALIFIED_NAME_EDEFAULT == null ? getQualifiedName() != null : !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case UML2Package.INTERFACE__VISIBILITY:
				return isSetVisibility();
			case UML2Package.INTERFACE__CLIENT_DEPENDENCY:
				EList clientDependency = (EList)eVirtualGet(UML2Package.INTERFACE__CLIENT_DEPENDENCY);
				return clientDependency != null && !clientDependency.isEmpty();
			case UML2Package.INTERFACE__NAME_EXPRESSION:
				return eVirtualGet(UML2Package.INTERFACE__NAME_EXPRESSION) != null;
			case UML2Package.INTERFACE__MEMBER:
				return isSetMembers();
			case UML2Package.INTERFACE__OWNED_RULE:
				EList ownedRule = (EList)eVirtualGet(UML2Package.INTERFACE__OWNED_RULE);
				return ownedRule != null && !ownedRule.isEmpty();
			case UML2Package.INTERFACE__IMPORTED_MEMBER:
				return !getImportedMembers().isEmpty();
			case UML2Package.INTERFACE__ELEMENT_IMPORT:
				EList elementImport = (EList)eVirtualGet(UML2Package.INTERFACE__ELEMENT_IMPORT);
				return elementImport != null && !elementImport.isEmpty();
			case UML2Package.INTERFACE__PACKAGE_IMPORT:
				EList packageImport = (EList)eVirtualGet(UML2Package.INTERFACE__PACKAGE_IMPORT);
				return packageImport != null && !packageImport.isEmpty();
			case UML2Package.INTERFACE__TEMPLATE_PARAMETER:
				return eVirtualGet(UML2Package.INTERFACE__TEMPLATE_PARAMETER) != null;
			case UML2Package.INTERFACE__OWNING_PARAMETER:
				return getOwningParameter() != null;
			case UML2Package.INTERFACE__PACKAGEABLE_ELEMENT_VISIBILITY:
				return isSetPackageableElement_visibility();
			case UML2Package.INTERFACE__PACKAGE:
				return getPackage() != null;
			case UML2Package.INTERFACE__REDEFINITION_CONTEXT:
				return isSetRedefinitionContexts();
			case UML2Package.INTERFACE__IS_LEAF:
				return ((eFlags & IS_LEAF_EFLAG) != 0) != IS_LEAF_EDEFAULT;
			case UML2Package.INTERFACE__FEATURE:
				return isSetFeatures();
			case UML2Package.INTERFACE__IS_ABSTRACT:
				return ((eFlags & IS_ABSTRACT_EFLAG) != 0) != IS_ABSTRACT_EDEFAULT;
			case UML2Package.INTERFACE__INHERITED_MEMBER:
				return !getInheritedMembers().isEmpty();
			case UML2Package.INTERFACE__GENERAL:
				return !getGenerals().isEmpty();
			case UML2Package.INTERFACE__GENERALIZATION:
				EList generalization = (EList)eVirtualGet(UML2Package.INTERFACE__GENERALIZATION);
				return generalization != null && !generalization.isEmpty();
			case UML2Package.INTERFACE__ATTRIBUTE:
				return isSetAttributes();
			case UML2Package.INTERFACE__REDEFINED_CLASSIFIER:
				EList redefinedClassifier = (EList)eVirtualGet(UML2Package.INTERFACE__REDEFINED_CLASSIFIER);
				return redefinedClassifier != null && !redefinedClassifier.isEmpty();
			case UML2Package.INTERFACE__SUBSTITUTION:
				EList substitution = (EList)eVirtualGet(UML2Package.INTERFACE__SUBSTITUTION);
				return substitution != null && !substitution.isEmpty();
			case UML2Package.INTERFACE__POWERTYPE_EXTENT:
				EList powertypeExtent = (EList)eVirtualGet(UML2Package.INTERFACE__POWERTYPE_EXTENT);
				return powertypeExtent != null && !powertypeExtent.isEmpty();
			case UML2Package.INTERFACE__OWNED_USE_CASE:
				EList ownedUseCase = (EList)eVirtualGet(UML2Package.INTERFACE__OWNED_USE_CASE);
				return ownedUseCase != null && !ownedUseCase.isEmpty();
			case UML2Package.INTERFACE__USE_CASE:
				EList useCase = (EList)eVirtualGet(UML2Package.INTERFACE__USE_CASE);
				return useCase != null && !useCase.isEmpty();
			case UML2Package.INTERFACE__REPRESENTATION:
				return eVirtualGet(UML2Package.INTERFACE__REPRESENTATION) != null;
			case UML2Package.INTERFACE__OCCURRENCE:
				EList occurrence = (EList)eVirtualGet(UML2Package.INTERFACE__OCCURRENCE);
				return occurrence != null && !occurrence.isEmpty();
			case UML2Package.INTERFACE__OWNED_ATTRIBUTE:
				EList ownedAttribute = (EList)eVirtualGet(UML2Package.INTERFACE__OWNED_ATTRIBUTE);
				return ownedAttribute != null && !ownedAttribute.isEmpty();
			case UML2Package.INTERFACE__OWNED_OPERATION:
				EList ownedOperation = (EList)eVirtualGet(UML2Package.INTERFACE__OWNED_OPERATION);
				return ownedOperation != null && !ownedOperation.isEmpty();
			case UML2Package.INTERFACE__REDEFINED_INTERFACE:
				EList redefinedInterface = (EList)eVirtualGet(UML2Package.INTERFACE__REDEFINED_INTERFACE);
				return redefinedInterface != null && !redefinedInterface.isEmpty();
			case UML2Package.INTERFACE__NESTED_CLASSIFIER:
				EList nestedClassifier = (EList)eVirtualGet(UML2Package.INTERFACE__NESTED_CLASSIFIER);
				return nestedClassifier != null && !nestedClassifier.isEmpty();
			case UML2Package.INTERFACE__OWNED_RECEPTION:
				EList ownedReception = (EList)eVirtualGet(UML2Package.INTERFACE__OWNED_RECEPTION);
				return ownedReception != null && !ownedReception.isEmpty();
			case UML2Package.INTERFACE__PROTOCOL:
				return eVirtualGet(UML2Package.INTERFACE__PROTOCOL) != null;
		}
		return eDynamicIsSet(eFeature);
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EList getOwnedMembersHelper(EList ownedMember) {
		super.getOwnedMembersHelper(ownedMember);
		EList ownedAttribute = getOwnedAttributes();
		if (!ownedAttribute.isEmpty()) {
			ownedMember.addAll(ownedAttribute);
		}
		EList ownedOperation = getOwnedOperations();
		if (!ownedOperation.isEmpty()) {
			ownedMember.addAll(ownedOperation);
		}
		EList nestedClassifier = getNestedClassifiers();
		if (!nestedClassifier.isEmpty()) {
			ownedMember.addAll(nestedClassifier);
		}
		EList ownedReception = getOwnedReceptions();
		if (!ownedReception.isEmpty()) {
			ownedMember.addAll(ownedReception);
		}
		ProtocolStateMachine protocol = getProtocol();
		if (protocol != null) {
			ownedMember.add(protocol);
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
			|| eIsSet(UML2Package.eINSTANCE.getInterface_OwnedAttribute())
			|| eIsSet(UML2Package.eINSTANCE.getInterface_OwnedOperation())
			|| eIsSet(UML2Package.eINSTANCE.getInterface_NestedClassifier())
			|| eIsSet(UML2Package.eINSTANCE.getInterface_OwnedReception())
			|| eIsSet(UML2Package.eINSTANCE.getInterface_Protocol());
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EList getRedefinedElementsHelper(EList redefinedElement) {
		super.getRedefinedElementsHelper(redefinedElement);
		EList redefinedInterface = getRedefinedInterfaces();
		if (!redefinedInterface.isEmpty()) {
			for (Iterator i = ((InternalEList) redefinedInterface).basicIterator(); i.hasNext(); ) {
				redefinedElement.add(i.next());
			}
		}
		return redefinedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRedefinedElements() {
		return super.isSetRedefinedElements()
			|| eIsSet(UML2Package.eINSTANCE.getInterface_RedefinedInterface());
	}


	// <!-- begin-custom-operations -->

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.uml2.Interface#createOwnedAttribute(java.lang.String,
	 *      org.eclipse.uml2.Type, int, int)
	 */
	public Property createOwnedAttribute(String name, Type type,
			int lowerBound, int upperBound) {
		return TypeOperations.createOwnedAttribute(this, name, type,
			lowerBound, upperBound);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.uml2.Interface#createOwnedOperation(java.lang.String,
	 *      org.eclipse.uml2.Type, java.lang.String[], org.eclipse.uml2.Type[])
	 */
	public Operation createOwnedOperation(String name, Type returnType,
			String[] parameterNames, Type[] parameterTypes) {
		return TypeOperations.createOwnedOperation(this, name, returnType,
			parameterNames, parameterTypes);
	}

	private static Method GET_ALL_OPERATIONS = null;

	static {
		try {
			GET_ALL_OPERATIONS = InterfaceImpl.class.getMethod(
				"getAllOperations", null); //$NON-NLS-1$
		} catch (Exception e) {
			// ignore
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.uml2.Interface#getAllOperations()
	 */
	public Set getAllOperations() {
		CacheAdapter cache = getCacheAdapter();

		if (cache != null) {
			Set result = (Set) cache.get(this, GET_ALL_OPERATIONS);

			if (result == null) {
				cache.put(this, GET_ALL_OPERATIONS, result = Collections
					.unmodifiableSet(ClassifierOperations
						.getAllOperations(this)));
			}

			return result;
		}

		return Collections.unmodifiableSet(ClassifierOperations
			.getAllOperations(this));
	}

	// <!-- end-custom-operations -->

} //InterfaceImpl
