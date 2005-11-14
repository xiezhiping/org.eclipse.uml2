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
 * $Id: InterfaceImpl.java,v 1.1 2005/11/14 22:26:02 khussey Exp $
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
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.uml2.common.util.DerivedUnionEObjectEList;

import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.CollaborationUse;
import org.eclipse.uml2.uml.Feature;
import org.eclipse.uml2.uml.Interface;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Operation;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.ProtocolStateMachine;
import org.eclipse.uml2.uml.Reception;
import org.eclipse.uml2.uml.RedefinableElement;
import org.eclipse.uml2.uml.RedefinableTemplateSignature;
import org.eclipse.uml2.uml.StringExpression;
import org.eclipse.uml2.uml.TemplateParameter;
import org.eclipse.uml2.uml.TemplateSignature;
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
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.InterfaceImpl#getRedefinedElements <em>Redefined Element</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.InterfaceImpl#getFeatures <em>Feature</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.InterfaceImpl#getOwnedAttributes <em>Owned Attribute</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.InterfaceImpl#getNestedClassifiers <em>Nested Classifier</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.InterfaceImpl#getRedefinedInterfaces <em>Redefined Interface</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.InterfaceImpl#getOwnedReceptions <em>Owned Reception</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.InterfaceImpl#getProtocol <em>Protocol</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.InterfaceImpl#getOwnedOperations <em>Owned Operation</em>}</li>
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
		return UMLPackage.eINSTANCE.getInterface();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List getAttributes() {
		List attribute = (List) eVirtualGet(UMLPackage.INTERFACE__ATTRIBUTE);
		if (attribute == null) {
			eVirtualSet(UMLPackage.INTERFACE__ATTRIBUTE,
				attribute = new DerivedUnionEObjectEList(Property.class, this,
					UMLPackage.INTERFACE__ATTRIBUTE,
					new EStructuralFeature[]{UMLPackage.eINSTANCE
						.getInterface_OwnedAttribute()}));
		}
		return attribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List getOwnedMembers() {
		List ownedMember = (List) eVirtualGet(UMLPackage.INTERFACE__OWNED_MEMBER);
		if (ownedMember == null) {
			eVirtualSet(UMLPackage.INTERFACE__OWNED_MEMBER,
				ownedMember = new DerivedUnionEObjectEList(NamedElement.class,
					this, UMLPackage.INTERFACE__OWNED_MEMBER,
					new EStructuralFeature[]{
						UMLPackage.eINSTANCE.getNamespace_OwnedRule(),
						UMLPackage.eINSTANCE.getClassifier_OwnedUseCase(),
						UMLPackage.eINSTANCE.getInterface_OwnedAttribute(),
						UMLPackage.eINSTANCE.getInterface_NestedClassifier(),
						UMLPackage.eINSTANCE.getInterface_OwnedReception(),
						UMLPackage.eINSTANCE.getInterface_Protocol(),
						UMLPackage.eINSTANCE.getInterface_OwnedOperation()}));
		}
		return ownedMember;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List getRedefinedElements() {
		List redefinedElement = (List) eVirtualGet(UMLPackage.INTERFACE__REDEFINED_ELEMENT);
		if (redefinedElement == null) {
			eVirtualSet(
				UMLPackage.INTERFACE__REDEFINED_ELEMENT,
				redefinedElement = new DerivedUnionEObjectEList(
					RedefinableElement.class, this,
					UMLPackage.INTERFACE__REDEFINED_ELEMENT,
					new EStructuralFeature[]{
						UMLPackage.eINSTANCE
							.getClassifier_RedefinedClassifier(),
						UMLPackage.eINSTANCE.getInterface_RedefinedInterface()}));
		}
		return redefinedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List getFeatures() {
		List feature = (List) eVirtualGet(UMLPackage.INTERFACE__FEATURE);
		if (feature == null) {
			eVirtualSet(UMLPackage.INTERFACE__FEATURE,
				feature = new DerivedUnionEObjectEList(Feature.class, this,
					UMLPackage.INTERFACE__FEATURE, new EStructuralFeature[]{
						UMLPackage.eINSTANCE.getClassifier_Attribute(),
						UMLPackage.eINSTANCE.getInterface_OwnedReception(),
						UMLPackage.eINSTANCE.getInterface_OwnedOperation()}));
		}
		return feature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List getOwnedAttributes() {
		List ownedAttribute = (List) eVirtualGet(UMLPackage.INTERFACE__OWNED_ATTRIBUTE);
		if (ownedAttribute == null) {
			eVirtualSet(UMLPackage.INTERFACE__OWNED_ATTRIBUTE,
				ownedAttribute = new EObjectContainmentEList(Property.class,
					this, UMLPackage.INTERFACE__OWNED_ATTRIBUTE));
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
	public List getNestedClassifiers() {
		List nestedClassifier = (List) eVirtualGet(UMLPackage.INTERFACE__NESTED_CLASSIFIER);
		if (nestedClassifier == null) {
			eVirtualSet(UMLPackage.INTERFACE__NESTED_CLASSIFIER,
				nestedClassifier = new EObjectContainmentEList(
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
	public List getRedefinedInterfaces() {
		List redefinedInterface = (List) eVirtualGet(UMLPackage.INTERFACE__REDEFINED_INTERFACE);
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
		for (Iterator i = getRedefinedInterfaces().iterator(); i.hasNext();) {
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
	public List getOwnedReceptions() {
		List ownedReception = (List) eVirtualGet(UMLPackage.INTERFACE__OWNED_RECEPTION);
		if (ownedReception == null) {
			eVirtualSet(UMLPackage.INTERFACE__OWNED_RECEPTION,
				ownedReception = new EObjectContainmentEList(Reception.class,
					this, UMLPackage.INTERFACE__OWNED_RECEPTION));
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
	public ProtocolStateMachine getProtocol() {
		ProtocolStateMachine protocol = (ProtocolStateMachine) eVirtualGet(UMLPackage.INTERFACE__PROTOCOL);
		return protocol;
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
	public ProtocolStateMachine createProtocol() {
		ProtocolStateMachine newProtocol = UMLFactory.eINSTANCE
			.createProtocolStateMachine();
		setProtocol(newProtocol);
		return newProtocol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List getOwnedOperations() {
		List ownedOperation = (List) eVirtualGet(UMLPackage.INTERFACE__OWNED_OPERATION);
		if (ownedOperation == null) {
			eVirtualSet(UMLPackage.INTERFACE__OWNED_OPERATION,
				ownedOperation = new EObjectContainmentWithInverseEList(
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
	public boolean validateVisibility(DiagnosticChain diagnostics, Map context) {
		return InterfaceOperations.validateVisibility(this, diagnostics,
			context);
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
				case UMLPackage.INTERFACE__EANNOTATIONS :
					return ((InternalEList) getEAnnotations()).basicAdd(
						otherEnd, msgs);
				case UMLPackage.INTERFACE__CLIENT_DEPENDENCY :
					return ((InternalEList) getClientDependencies()).basicAdd(
						otherEnd, msgs);
				case UMLPackage.INTERFACE__ELEMENT_IMPORT :
					return ((InternalEList) getElementImports()).basicAdd(
						otherEnd, msgs);
				case UMLPackage.INTERFACE__PACKAGE_IMPORT :
					return ((InternalEList) getPackageImports()).basicAdd(
						otherEnd, msgs);
				case UMLPackage.INTERFACE__OWNED_RULE :
					return ((InternalEList) getOwnedRules()).basicAdd(otherEnd,
						msgs);
				case UMLPackage.INTERFACE__TEMPLATE_PARAMETER :
					TemplateParameter templateParameter = (TemplateParameter) eVirtualGet(UMLPackage.INTERFACE__TEMPLATE_PARAMETER);
					if (templateParameter != null)
						msgs = ((InternalEObject) templateParameter)
							.eInverseRemove(
								this,
								UMLPackage.TEMPLATE_PARAMETER__PARAMETERED_ELEMENT,
								TemplateParameter.class, msgs);
					return basicSetTemplateParameter(
						(TemplateParameter) otherEnd, msgs);
				case UMLPackage.INTERFACE__OWNING_TEMPLATE_PARAMETER :
					if (eContainer != null)
						msgs = eBasicRemoveFromContainer(msgs);
					return eBasicSetContainer(otherEnd,
						UMLPackage.INTERFACE__OWNING_TEMPLATE_PARAMETER, msgs);
				case UMLPackage.INTERFACE__TEMPLATE_BINDING :
					return ((InternalEList) getTemplateBindings()).basicAdd(
						otherEnd, msgs);
				case UMLPackage.INTERFACE__OWNED_TEMPLATE_SIGNATURE :
					TemplateSignature ownedTemplateSignature = (TemplateSignature) eVirtualGet(UMLPackage.INTERFACE__OWNED_TEMPLATE_SIGNATURE);
					if (ownedTemplateSignature != null)
						msgs = ((InternalEObject) ownedTemplateSignature)
							.eInverseRemove(
								this,
								EOPPOSITE_FEATURE_BASE
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
				case UMLPackage.INTERFACE__USE_CASE :
					return ((InternalEList) getUseCases()).basicAdd(otherEnd,
						msgs);
				case UMLPackage.INTERFACE__SUBSTITUTION :
					return ((InternalEList) getSubstitutions()).basicAdd(
						otherEnd, msgs);
				case UMLPackage.INTERFACE__OWNED_SIGNATURE :
					RedefinableTemplateSignature ownedSignature = (RedefinableTemplateSignature) eVirtualGet(UMLPackage.INTERFACE__OWNED_SIGNATURE);
					if (ownedSignature != null)
						msgs = ((InternalEObject) ownedSignature)
							.eInverseRemove(this, EOPPOSITE_FEATURE_BASE
								- UMLPackage.INTERFACE__OWNED_SIGNATURE, null,
								msgs);
					return basicSetOwnedSignature(
						(RedefinableTemplateSignature) otherEnd, msgs);
				case UMLPackage.INTERFACE__OWNED_OPERATION :
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
				case UMLPackage.INTERFACE__EANNOTATIONS :
					return ((InternalEList) getEAnnotations()).basicRemove(
						otherEnd, msgs);
				case UMLPackage.INTERFACE__OWNED_COMMENT :
					return ((InternalEList) getOwnedComments()).basicRemove(
						otherEnd, msgs);
				case UMLPackage.INTERFACE__CLIENT_DEPENDENCY :
					return ((InternalEList) getClientDependencies())
						.basicRemove(otherEnd, msgs);
				case UMLPackage.INTERFACE__NAME_EXPRESSION :
					return basicSetNameExpression(null, msgs);
				case UMLPackage.INTERFACE__ELEMENT_IMPORT :
					return ((InternalEList) getElementImports()).basicRemove(
						otherEnd, msgs);
				case UMLPackage.INTERFACE__PACKAGE_IMPORT :
					return ((InternalEList) getPackageImports()).basicRemove(
						otherEnd, msgs);
				case UMLPackage.INTERFACE__OWNED_RULE :
					return ((InternalEList) getOwnedRules()).basicRemove(
						otherEnd, msgs);
				case UMLPackage.INTERFACE__TEMPLATE_PARAMETER :
					return basicSetTemplateParameter(null, msgs);
				case UMLPackage.INTERFACE__OWNING_TEMPLATE_PARAMETER :
					return eBasicSetContainer(null,
						UMLPackage.INTERFACE__OWNING_TEMPLATE_PARAMETER, msgs);
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
				case UMLPackage.INTERFACE__OWNED_USE_CASE :
					return ((InternalEList) getOwnedUseCases()).basicRemove(
						otherEnd, msgs);
				case UMLPackage.INTERFACE__USE_CASE :
					return ((InternalEList) getUseCases()).basicRemove(
						otherEnd, msgs);
				case UMLPackage.INTERFACE__SUBSTITUTION :
					return ((InternalEList) getSubstitutions()).basicRemove(
						otherEnd, msgs);
				case UMLPackage.INTERFACE__COLLABORATION_USE :
					return ((InternalEList) getCollaborationUses())
						.basicRemove(otherEnd, msgs);
				case UMLPackage.INTERFACE__OWNED_SIGNATURE :
					return basicSetOwnedSignature(null, msgs);
				case UMLPackage.INTERFACE__OWNED_ATTRIBUTE :
					return ((InternalEList) getOwnedAttributes()).basicRemove(
						otherEnd, msgs);
				case UMLPackage.INTERFACE__NESTED_CLASSIFIER :
					return ((InternalEList) getNestedClassifiers())
						.basicRemove(otherEnd, msgs);
				case UMLPackage.INTERFACE__OWNED_RECEPTION :
					return ((InternalEList) getOwnedReceptions()).basicRemove(
						otherEnd, msgs);
				case UMLPackage.INTERFACE__PROTOCOL :
					return basicSetProtocol(null, msgs);
				case UMLPackage.INTERFACE__OWNED_OPERATION :
					return ((InternalEList) getOwnedOperations()).basicRemove(
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
				return getNameExpression();
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
			case UMLPackage.INTERFACE__TEMPLATE_PARAMETER :
				if (resolve)
					return getTemplateParameter();
				return basicGetTemplateParameter();
			case UMLPackage.INTERFACE__OWNING_TEMPLATE_PARAMETER :
				return getOwningTemplateParameter();
			case UMLPackage.INTERFACE__PACKAGE :
				return getPackage();
			case UMLPackage.INTERFACE__TEMPLATE_BINDING :
				return getTemplateBindings();
			case UMLPackage.INTERFACE__OWNED_TEMPLATE_SIGNATURE :
				return getOwnedTemplateSignature();
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
			case UMLPackage.INTERFACE__OWNED_USE_CASE :
				return getOwnedUseCases();
			case UMLPackage.INTERFACE__USE_CASE :
				return getUseCases();
			case UMLPackage.INTERFACE__SUBSTITUTION :
				return getSubstitutions();
			case UMLPackage.INTERFACE__ATTRIBUTE :
				return getAttributes();
			case UMLPackage.INTERFACE__REPRESENTATION :
				return getRepresentation();
			case UMLPackage.INTERFACE__COLLABORATION_USE :
				return getCollaborationUses();
			case UMLPackage.INTERFACE__OWNED_SIGNATURE :
				return getOwnedSignature();
			case UMLPackage.INTERFACE__OWNED_ATTRIBUTE :
				return getOwnedAttributes();
			case UMLPackage.INTERFACE__NESTED_CLASSIFIER :
				return getNestedClassifiers();
			case UMLPackage.INTERFACE__REDEFINED_INTERFACE :
				return getRedefinedInterfaces();
			case UMLPackage.INTERFACE__OWNED_RECEPTION :
				return getOwnedReceptions();
			case UMLPackage.INTERFACE__PROTOCOL :
				return getProtocol();
			case UMLPackage.INTERFACE__OWNED_OPERATION :
				return getOwnedOperations();
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
			case UMLPackage.INTERFACE__TEMPLATE_PARAMETER :
				setTemplateParameter((TemplateParameter) newValue);
				return;
			case UMLPackage.INTERFACE__OWNING_TEMPLATE_PARAMETER :
				setOwningTemplateParameter((TemplateParameter) newValue);
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
			case UMLPackage.INTERFACE__INHERITED_MEMBER :
				getInheritedMembers().clear();
				getInheritedMembers().addAll((Collection) newValue);
				return;
			case UMLPackage.INTERFACE__REDEFINED_CLASSIFIER :
				getRedefinedClassifiers().clear();
				getRedefinedClassifiers().addAll((Collection) newValue);
				return;
			case UMLPackage.INTERFACE__GENERAL :
				getGenerals().clear();
				getGenerals().addAll((Collection) newValue);
				return;
			case UMLPackage.INTERFACE__OWNED_USE_CASE :
				getOwnedUseCases().clear();
				getOwnedUseCases().addAll((Collection) newValue);
				return;
			case UMLPackage.INTERFACE__USE_CASE :
				getUseCases().clear();
				getUseCases().addAll((Collection) newValue);
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
			case UMLPackage.INTERFACE__OWNED_SIGNATURE :
				setOwnedSignature((RedefinableTemplateSignature) newValue);
				return;
			case UMLPackage.INTERFACE__OWNED_ATTRIBUTE :
				getOwnedAttributes().clear();
				getOwnedAttributes().addAll((Collection) newValue);
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
			case UMLPackage.INTERFACE__OWNED_OPERATION :
				getOwnedOperations().clear();
				getOwnedOperations().addAll((Collection) newValue);
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
			case UMLPackage.INTERFACE__EANNOTATIONS :
				getEAnnotations().clear();
				return;
			case UMLPackage.INTERFACE__OWNED_COMMENT :
				getOwnedComments().clear();
				return;
			case UMLPackage.INTERFACE__NAME :
				setName(NAME_EDEFAULT);
				return;
			case UMLPackage.INTERFACE__VISIBILITY :
				setVisibility(VISIBILITY_EDEFAULT);
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
			case UMLPackage.INTERFACE__TEMPLATE_PARAMETER :
				setTemplateParameter((TemplateParameter) null);
				return;
			case UMLPackage.INTERFACE__OWNING_TEMPLATE_PARAMETER :
				setOwningTemplateParameter((TemplateParameter) null);
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
			case UMLPackage.INTERFACE__INHERITED_MEMBER :
				getInheritedMembers().clear();
				return;
			case UMLPackage.INTERFACE__REDEFINED_CLASSIFIER :
				getRedefinedClassifiers().clear();
				return;
			case UMLPackage.INTERFACE__GENERAL :
				getGenerals().clear();
				return;
			case UMLPackage.INTERFACE__OWNED_USE_CASE :
				getOwnedUseCases().clear();
				return;
			case UMLPackage.INTERFACE__USE_CASE :
				getUseCases().clear();
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
			case UMLPackage.INTERFACE__OWNED_SIGNATURE :
				setOwnedSignature((RedefinableTemplateSignature) null);
				return;
			case UMLPackage.INTERFACE__OWNED_ATTRIBUTE :
				getOwnedAttributes().clear();
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
			case UMLPackage.INTERFACE__OWNED_OPERATION :
				getOwnedOperations().clear();
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
			case UMLPackage.INTERFACE__EANNOTATIONS :
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UMLPackage.INTERFACE__OWNED_ELEMENT :
				return isSetOwnedElements();
			case UMLPackage.INTERFACE__OWNER :
				return isSetOwner();
			case UMLPackage.INTERFACE__OWNED_COMMENT :
				List ownedComment = (List) eVirtualGet(UMLPackage.INTERFACE__OWNED_COMMENT);
				return ownedComment != null && !ownedComment.isEmpty();
			case UMLPackage.INTERFACE__NAME :
				String name = eVirtualIsSet(UMLPackage.INTERFACE__NAME)
					? (String) eVirtualGet(UMLPackage.INTERFACE__NAME)
					: NAME_EDEFAULT;
				return NAME_EDEFAULT == null
					? name != null
					: !NAME_EDEFAULT.equals(name);
			case UMLPackage.INTERFACE__VISIBILITY :
				return eVirtualIsSet(UMLPackage.INTERFACE__VISIBILITY)
					&& eVirtualGet(UMLPackage.INTERFACE__VISIBILITY) != VISIBILITY_EDEFAULT;
			case UMLPackage.INTERFACE__QUALIFIED_NAME :
				return QUALIFIED_NAME_EDEFAULT == null
					? getQualifiedName() != null
					: !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case UMLPackage.INTERFACE__CLIENT_DEPENDENCY :
				List clientDependency = (List) eVirtualGet(UMLPackage.INTERFACE__CLIENT_DEPENDENCY);
				return clientDependency != null && !clientDependency.isEmpty();
			case UMLPackage.INTERFACE__NAMESPACE :
				return isSetNamespace();
			case UMLPackage.INTERFACE__NAME_EXPRESSION :
				return eVirtualGet(UMLPackage.INTERFACE__NAME_EXPRESSION) != null;
			case UMLPackage.INTERFACE__ELEMENT_IMPORT :
				List elementImport = (List) eVirtualGet(UMLPackage.INTERFACE__ELEMENT_IMPORT);
				return elementImport != null && !elementImport.isEmpty();
			case UMLPackage.INTERFACE__PACKAGE_IMPORT :
				List packageImport = (List) eVirtualGet(UMLPackage.INTERFACE__PACKAGE_IMPORT);
				return packageImport != null && !packageImport.isEmpty();
			case UMLPackage.INTERFACE__OWNED_RULE :
				List ownedRule = (List) eVirtualGet(UMLPackage.INTERFACE__OWNED_RULE);
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
			case UMLPackage.INTERFACE__TEMPLATE_PARAMETER :
				return eVirtualGet(UMLPackage.INTERFACE__TEMPLATE_PARAMETER) != null;
			case UMLPackage.INTERFACE__OWNING_TEMPLATE_PARAMETER :
				return getOwningTemplateParameter() != null;
			case UMLPackage.INTERFACE__PACKAGE :
				return getPackage() != null;
			case UMLPackage.INTERFACE__TEMPLATE_BINDING :
				List templateBinding = (List) eVirtualGet(UMLPackage.INTERFACE__TEMPLATE_BINDING);
				return templateBinding != null && !templateBinding.isEmpty();
			case UMLPackage.INTERFACE__OWNED_TEMPLATE_SIGNATURE :
				return eVirtualGet(UMLPackage.INTERFACE__OWNED_TEMPLATE_SIGNATURE) != null;
			case UMLPackage.INTERFACE__IS_ABSTRACT :
				return ((eFlags & IS_ABSTRACT_EFLAG) != 0) != IS_ABSTRACT_EDEFAULT;
			case UMLPackage.INTERFACE__GENERALIZATION :
				List generalization = (List) eVirtualGet(UMLPackage.INTERFACE__GENERALIZATION);
				return generalization != null && !generalization.isEmpty();
			case UMLPackage.INTERFACE__POWERTYPE_EXTENT :
				List powertypeExtent = (List) eVirtualGet(UMLPackage.INTERFACE__POWERTYPE_EXTENT);
				return powertypeExtent != null && !powertypeExtent.isEmpty();
			case UMLPackage.INTERFACE__FEATURE :
				return isSetFeatures();
			case UMLPackage.INTERFACE__INHERITED_MEMBER :
				return !getInheritedMembers().isEmpty();
			case UMLPackage.INTERFACE__REDEFINED_CLASSIFIER :
				List redefinedClassifier = (List) eVirtualGet(UMLPackage.INTERFACE__REDEFINED_CLASSIFIER);
				return redefinedClassifier != null
					&& !redefinedClassifier.isEmpty();
			case UMLPackage.INTERFACE__GENERAL :
				return !getGenerals().isEmpty();
			case UMLPackage.INTERFACE__OWNED_USE_CASE :
				List ownedUseCase = (List) eVirtualGet(UMLPackage.INTERFACE__OWNED_USE_CASE);
				return ownedUseCase != null && !ownedUseCase.isEmpty();
			case UMLPackage.INTERFACE__USE_CASE :
				List useCase = (List) eVirtualGet(UMLPackage.INTERFACE__USE_CASE);
				return useCase != null && !useCase.isEmpty();
			case UMLPackage.INTERFACE__SUBSTITUTION :
				List substitution = (List) eVirtualGet(UMLPackage.INTERFACE__SUBSTITUTION);
				return substitution != null && !substitution.isEmpty();
			case UMLPackage.INTERFACE__ATTRIBUTE :
				return isSetAttributes();
			case UMLPackage.INTERFACE__REPRESENTATION :
				return eVirtualGet(UMLPackage.INTERFACE__REPRESENTATION) != null;
			case UMLPackage.INTERFACE__COLLABORATION_USE :
				List collaborationUse = (List) eVirtualGet(UMLPackage.INTERFACE__COLLABORATION_USE);
				return collaborationUse != null && !collaborationUse.isEmpty();
			case UMLPackage.INTERFACE__OWNED_SIGNATURE :
				return eVirtualGet(UMLPackage.INTERFACE__OWNED_SIGNATURE) != null;
			case UMLPackage.INTERFACE__OWNED_ATTRIBUTE :
				List ownedAttribute = (List) eVirtualGet(UMLPackage.INTERFACE__OWNED_ATTRIBUTE);
				return ownedAttribute != null && !ownedAttribute.isEmpty();
			case UMLPackage.INTERFACE__NESTED_CLASSIFIER :
				List nestedClassifier = (List) eVirtualGet(UMLPackage.INTERFACE__NESTED_CLASSIFIER);
				return nestedClassifier != null && !nestedClassifier.isEmpty();
			case UMLPackage.INTERFACE__REDEFINED_INTERFACE :
				List redefinedInterface = (List) eVirtualGet(UMLPackage.INTERFACE__REDEFINED_INTERFACE);
				return redefinedInterface != null
					&& !redefinedInterface.isEmpty();
			case UMLPackage.INTERFACE__OWNED_RECEPTION :
				List ownedReception = (List) eVirtualGet(UMLPackage.INTERFACE__OWNED_RECEPTION);
				return ownedReception != null && !ownedReception.isEmpty();
			case UMLPackage.INTERFACE__PROTOCOL :
				return eVirtualGet(UMLPackage.INTERFACE__PROTOCOL) != null;
			case UMLPackage.INTERFACE__OWNED_OPERATION :
				List ownedOperation = (List) eVirtualGet(UMLPackage.INTERFACE__OWNED_OPERATION);
				return ownedOperation != null && !ownedOperation.isEmpty();
		}
		return eDynamicIsSet(eFeature);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetAttributes() {
		return super.isSetAttributes()
			|| eIsSet(UMLPackage.eINSTANCE.getInterface_OwnedAttribute());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOwnedMembers() {
		return super.isSetOwnedMembers()
			|| eIsSet(UMLPackage.eINSTANCE.getInterface_OwnedAttribute())
			|| eIsSet(UMLPackage.eINSTANCE.getInterface_NestedClassifier())
			|| eIsSet(UMLPackage.eINSTANCE.getInterface_OwnedReception())
			|| eIsSet(UMLPackage.eINSTANCE.getInterface_Protocol())
			|| eIsSet(UMLPackage.eINSTANCE.getInterface_OwnedOperation());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRedefinedElements() {
		return super.isSetRedefinedElements()
			|| eIsSet(UMLPackage.eINSTANCE.getInterface_RedefinedInterface());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetFeatures() {
		return super.isSetFeatures()
			|| eIsSet(UMLPackage.eINSTANCE.getInterface_OwnedReception())
			|| eIsSet(UMLPackage.eINSTANCE.getInterface_OwnedOperation());
	}

} //InterfaceImpl
