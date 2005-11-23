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
 * $Id: CollaborationImpl.java,v 1.31 2005/11/23 20:05:09 khussey Exp $
 */
package org.eclipse.uml2.impl;

import java.util.Collection;
import java.util.Iterator;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EcoreEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.uml2.Behavior;
import org.eclipse.uml2.Collaboration;
import org.eclipse.uml2.CollaborationOccurrence;
import org.eclipse.uml2.ConnectableElement;
import org.eclipse.uml2.Connector;
import org.eclipse.uml2.Feature;
import org.eclipse.uml2.Property;
import org.eclipse.uml2.StringExpression;
import org.eclipse.uml2.StructuredClassifier;
import org.eclipse.uml2.TemplateParameter;
import org.eclipse.uml2.TemplateSignature;
import org.eclipse.uml2.UML2Factory;
import org.eclipse.uml2.UML2Package;
import org.eclipse.uml2.VisibilityKind;

import org.eclipse.uml2.common.util.DerivedUnionEObjectEList;

import org.eclipse.uml2.common.util.CacheAdapter;

import org.eclipse.uml2.internal.operation.StructuredClassifierOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Collaboration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2.impl.CollaborationImpl#getRoles <em>Role</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.CollaborationImpl#getAttributes <em>Attribute</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.CollaborationImpl#getFeatures <em>Feature</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.CollaborationImpl#getOwnedAttributes <em>Owned Attribute</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.CollaborationImpl#getParts <em>Part</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.CollaborationImpl#getOwnedConnectors <em>Owned Connector</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.CollaborationImpl#getCollaborationRoles <em>Collaboration Role</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CollaborationImpl extends BehavioredClassifierImpl implements Collaboration {
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
	protected CollaborationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return UML2Package.Literals.COLLABORATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getOwnedAttributes() {
		EList ownedAttribute = (EList)eVirtualGet(UML2Package.COLLABORATION__OWNED_ATTRIBUTE);
		if (ownedAttribute == null) {
			eVirtualSet(UML2Package.COLLABORATION__OWNED_ATTRIBUTE, ownedAttribute = new EObjectContainmentEList(Property.class, this, UML2Package.COLLABORATION__OWNED_ATTRIBUTE));
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
			eNotify(new ENotificationImpl(this, 0, UML2Package.COLLABORATION__OWNED_ATTRIBUTE, null, newOwnedAttribute));
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
			eNotify(new ENotificationImpl(this, 0, UML2Package.COLLABORATION__OWNED_ATTRIBUTE, null, newOwnedAttribute));
		}
		getOwnedAttributes().add(newOwnedAttribute);
		return newOwnedAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList getParts() {
		CacheAdapter cache = getCacheAdapter();

		if (cache != null) {
			EList result = (EList) cache.get(eResource(), this,
				UML2Package.Literals.STRUCTURED_CLASSIFIER__PART);

			if (result == null) {
				EList parts = StructuredClassifierOperations.getParts(this);
				cache.put(eResource(), this,
					UML2Package.Literals.STRUCTURED_CLASSIFIER__PART,
					result = new EcoreEList.UnmodifiableEList(this,
						UML2Package.Literals.STRUCTURED_CLASSIFIER__PART, parts
							.size(), parts.toArray()));
			}

			return result;
		}

		EList parts = StructuredClassifierOperations.getParts(this);
		return new EcoreEList.UnmodifiableEList(this,
			UML2Package.Literals.STRUCTURED_CLASSIFIER__PART, parts.size(),
			parts.toArray());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
    public Property getPart(String name) {
		for (Iterator i = getParts().iterator(); i.hasNext(); ) {
			Property part = (Property) i.next();
			if (name.equals(part.getName())) {
				return part;
			}
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
    public ConnectableElement getRole(String name) {
		for (Iterator i = getRoles().iterator(); i.hasNext(); ) {
			ConnectableElement role = (ConnectableElement) i.next();
			if (name.equals(role.getName())) {
				return role;
			}
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getAttributes() {
		EList attribute = (EList)eVirtualGet(UML2Package.COLLABORATION__ATTRIBUTE);
		if (attribute == null) {
			eVirtualSet(UML2Package.COLLABORATION__ATTRIBUTE, attribute = new DerivedUnionEObjectEList(Property.class, this, UML2Package.COLLABORATION__ATTRIBUTE, new int[] {UML2Package.COLLABORATION__OWNED_ATTRIBUTE}));
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
			|| eIsSet(UML2Package.COLLABORATION__OWNED_ATTRIBUTE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getFeatures() {
		EList feature = (EList)eVirtualGet(UML2Package.COLLABORATION__FEATURE);
		if (feature == null) {
			eVirtualSet(UML2Package.COLLABORATION__FEATURE, feature = new DerivedUnionEObjectEList(Feature.class, this, UML2Package.COLLABORATION__FEATURE, new int[] {UML2Package.COLLABORATION__ATTRIBUTE, UML2Package.COLLABORATION__OWNED_CONNECTOR}));
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
			|| eIsSet(UML2Package.COLLABORATION__OWNED_CONNECTOR);
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
		EList ownedConnector = getOwnedConnectors();
		if (!ownedConnector.isEmpty()) {
			ownedMember.addAll(ownedConnector);
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
			|| eIsSet(UML2Package.COLLABORATION__OWNED_ATTRIBUTE)
			|| eIsSet(UML2Package.COLLABORATION__OWNED_CONNECTOR);
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EList getMembersHelper(EList member) {
		super.getMembersHelper(member);
		if (isSetRoles()) {
			for (Iterator i = ((InternalEList) getRoles()).basicIterator(); i.hasNext(); ) {
				member.add(i.next());
			}
		}
		return member;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMembers() {
		return super.isSetMembers()
			|| isSetRoles();
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getOwnedConnectors() {
		EList ownedConnector = (EList)eVirtualGet(UML2Package.COLLABORATION__OWNED_CONNECTOR);
		if (ownedConnector == null) {
			eVirtualSet(UML2Package.COLLABORATION__OWNED_CONNECTOR, ownedConnector = new EObjectContainmentEList(Connector.class, this, UML2Package.COLLABORATION__OWNED_CONNECTOR));
		}
		return ownedConnector;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
    public Connector getOwnedConnector(String name) {
		for (Iterator i = getOwnedConnectors().iterator(); i.hasNext(); ) {
			Connector ownedConnector = (Connector) i.next();
			if (name.equals(ownedConnector.getName())) {
				return ownedConnector;
			}
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 * @deprecated Use #createOwnedConnector() instead.
	 */
	public Connector createOwnedConnector(EClass eClass) {
		Connector newOwnedConnector = (Connector) eClass.getEPackage().getEFactoryInstance().create(eClass);
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, 0, UML2Package.COLLABORATION__OWNED_CONNECTOR, null, newOwnedConnector));
		}
		getOwnedConnectors().add(newOwnedConnector);
		return newOwnedConnector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Connector createOwnedConnector() {
		Connector newOwnedConnector = UML2Factory.eINSTANCE.createConnector();
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, 0, UML2Package.COLLABORATION__OWNED_CONNECTOR, null, newOwnedConnector));
		}
		getOwnedConnectors().add(newOwnedConnector);
		return newOwnedConnector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getCollaborationRoles() {
		EList collaborationRole = (EList)eVirtualGet(UML2Package.COLLABORATION__COLLABORATION_ROLE);
		if (collaborationRole == null) {
			eVirtualSet(UML2Package.COLLABORATION__COLLABORATION_ROLE, collaborationRole = new EObjectResolvingEList(ConnectableElement.class, this, UML2Package.COLLABORATION__COLLABORATION_ROLE));
		}
		return collaborationRole;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
    public ConnectableElement getCollaborationRole(String name) {
		for (Iterator i = getCollaborationRoles().iterator(); i.hasNext(); ) {
			ConnectableElement collaborationRole = (ConnectableElement) i.next();
			if (name.equals(collaborationRole.getName())) {
				return collaborationRole;
			}
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getRoles() {
		EList role = (EList)eVirtualGet(UML2Package.COLLABORATION__ROLE);
		if (role == null) {
			eVirtualSet(UML2Package.COLLABORATION__ROLE, role = new DerivedUnionEObjectEList(ConnectableElement.class, this, UML2Package.COLLABORATION__ROLE, new int[] {UML2Package.COLLABORATION__OWNED_ATTRIBUTE, UML2Package.COLLABORATION__COLLABORATION_ROLE}));
		}
		return role;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRoles() {
		return eIsSet(UML2Package.COLLABORATION__OWNED_ATTRIBUTE)
			|| eIsSet(UML2Package.COLLABORATION__COLLABORATION_ROLE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, Class baseClass, NotificationChain msgs) {
		if (featureID >= 0) {
			switch (eDerivedStructuralFeatureID(featureID, baseClass)) {
				case UML2Package.COLLABORATION__EANNOTATIONS:
					return ((InternalEList)getEAnnotations()).basicRemove(otherEnd, msgs);
				case UML2Package.COLLABORATION__OWNED_COMMENT:
					return ((InternalEList)getOwnedComments()).basicRemove(otherEnd, msgs);
				case UML2Package.COLLABORATION__TEMPLATE_BINDING:
					return ((InternalEList)getTemplateBindings()).basicRemove(otherEnd, msgs);
				case UML2Package.COLLABORATION__OWNED_TEMPLATE_SIGNATURE:
					return basicSetOwnedTemplateSignature(null, msgs);
				case UML2Package.COLLABORATION__CLIENT_DEPENDENCY:
					return ((InternalEList)getClientDependencies()).basicRemove(otherEnd, msgs);
				case UML2Package.COLLABORATION__NAME_EXPRESSION:
					return basicSetNameExpression(null, msgs);
				case UML2Package.COLLABORATION__OWNED_RULE:
					return ((InternalEList)getOwnedRules()).basicRemove(otherEnd, msgs);
				case UML2Package.COLLABORATION__ELEMENT_IMPORT:
					return ((InternalEList)getElementImports()).basicRemove(otherEnd, msgs);
				case UML2Package.COLLABORATION__PACKAGE_IMPORT:
					return ((InternalEList)getPackageImports()).basicRemove(otherEnd, msgs);
				case UML2Package.COLLABORATION__TEMPLATE_PARAMETER:
					return basicSetTemplateParameter(null, msgs);
				case UML2Package.COLLABORATION__OWNING_PARAMETER:
					return eBasicSetContainer(null, UML2Package.COLLABORATION__OWNING_PARAMETER, msgs);
				case UML2Package.COLLABORATION__GENERALIZATION:
					return ((InternalEList)getGeneralizations()).basicRemove(otherEnd, msgs);
				case UML2Package.COLLABORATION__SUBSTITUTION:
					return ((InternalEList)getSubstitutions()).basicRemove(otherEnd, msgs);
				case UML2Package.COLLABORATION__POWERTYPE_EXTENT:
					return ((InternalEList)getPowertypeExtents()).basicRemove(otherEnd, msgs);
				case UML2Package.COLLABORATION__OWNED_USE_CASE:
					return ((InternalEList)getOwnedUseCases()).basicRemove(otherEnd, msgs);
				case UML2Package.COLLABORATION__USE_CASE:
					return ((InternalEList)getUseCases()).basicRemove(otherEnd, msgs);
				case UML2Package.COLLABORATION__OCCURRENCE:
					return ((InternalEList)getOccurrences()).basicRemove(otherEnd, msgs);
				case UML2Package.COLLABORATION__OWNED_BEHAVIOR:
					return ((InternalEList)getOwnedBehaviors()).basicRemove(otherEnd, msgs);
				case UML2Package.COLLABORATION__IMPLEMENTATION:
					return ((InternalEList)getImplementations()).basicRemove(otherEnd, msgs);
				case UML2Package.COLLABORATION__OWNED_TRIGGER:
					return ((InternalEList)getOwnedTriggers()).basicRemove(otherEnd, msgs);
				case UML2Package.COLLABORATION__OWNED_STATE_MACHINE:
					return ((InternalEList)getOwnedStateMachines()).basicRemove(otherEnd, msgs);
				case UML2Package.COLLABORATION__OWNED_ATTRIBUTE:
					return ((InternalEList)getOwnedAttributes()).basicRemove(otherEnd, msgs);
				case UML2Package.COLLABORATION__OWNED_CONNECTOR:
					return ((InternalEList)getOwnedConnectors()).basicRemove(otherEnd, msgs);
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
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UML2Package.COLLABORATION__EANNOTATIONS:
				return getEAnnotations();
			case UML2Package.COLLABORATION__OWNED_ELEMENT:
				return getOwnedElements();
			case UML2Package.COLLABORATION__OWNER:
				if (resolve) return getOwner();
				return basicGetOwner();
			case UML2Package.COLLABORATION__OWNED_COMMENT:
				return getOwnedComments();
			case UML2Package.COLLABORATION__TEMPLATE_BINDING:
				return getTemplateBindings();
			case UML2Package.COLLABORATION__OWNED_TEMPLATE_SIGNATURE:
				return getOwnedTemplateSignature();
			case UML2Package.COLLABORATION__NAME:
				return getName();
			case UML2Package.COLLABORATION__QUALIFIED_NAME:
				return getQualifiedName();
			case UML2Package.COLLABORATION__VISIBILITY:
				return getVisibility();
			case UML2Package.COLLABORATION__CLIENT_DEPENDENCY:
				return getClientDependencies();
			case UML2Package.COLLABORATION__NAME_EXPRESSION:
				return getNameExpression();
			case UML2Package.COLLABORATION__MEMBER:
				return getMembers();
			case UML2Package.COLLABORATION__OWNED_RULE:
				return getOwnedRules();
			case UML2Package.COLLABORATION__IMPORTED_MEMBER:
				return getImportedMembers();
			case UML2Package.COLLABORATION__ELEMENT_IMPORT:
				return getElementImports();
			case UML2Package.COLLABORATION__PACKAGE_IMPORT:
				return getPackageImports();
			case UML2Package.COLLABORATION__TEMPLATE_PARAMETER:
				if (resolve) return getTemplateParameter();
				return basicGetTemplateParameter();
			case UML2Package.COLLABORATION__OWNING_PARAMETER:
				return getOwningParameter();
			case UML2Package.COLLABORATION__PACKAGEABLE_ELEMENT_VISIBILITY:
				return getPackageableElement_visibility();
			case UML2Package.COLLABORATION__PACKAGE:
				return getPackage();
			case UML2Package.COLLABORATION__REDEFINITION_CONTEXT:
				return getRedefinitionContexts();
			case UML2Package.COLLABORATION__IS_LEAF:
				return isLeaf() ? Boolean.TRUE : Boolean.FALSE;
			case UML2Package.COLLABORATION__FEATURE:
				return getFeatures();
			case UML2Package.COLLABORATION__IS_ABSTRACT:
				return isAbstract() ? Boolean.TRUE : Boolean.FALSE;
			case UML2Package.COLLABORATION__INHERITED_MEMBER:
				return getInheritedMembers();
			case UML2Package.COLLABORATION__GENERAL:
				return getGenerals();
			case UML2Package.COLLABORATION__GENERALIZATION:
				return getGeneralizations();
			case UML2Package.COLLABORATION__ATTRIBUTE:
				return getAttributes();
			case UML2Package.COLLABORATION__REDEFINED_CLASSIFIER:
				return getRedefinedClassifiers();
			case UML2Package.COLLABORATION__SUBSTITUTION:
				return getSubstitutions();
			case UML2Package.COLLABORATION__POWERTYPE_EXTENT:
				return getPowertypeExtents();
			case UML2Package.COLLABORATION__OWNED_USE_CASE:
				return getOwnedUseCases();
			case UML2Package.COLLABORATION__USE_CASE:
				return getUseCases();
			case UML2Package.COLLABORATION__REPRESENTATION:
				return getRepresentation();
			case UML2Package.COLLABORATION__OCCURRENCE:
				return getOccurrences();
			case UML2Package.COLLABORATION__OWNED_BEHAVIOR:
				return getOwnedBehaviors();
			case UML2Package.COLLABORATION__CLASSIFIER_BEHAVIOR:
				return getClassifierBehavior();
			case UML2Package.COLLABORATION__IMPLEMENTATION:
				return getImplementations();
			case UML2Package.COLLABORATION__OWNED_TRIGGER:
				return getOwnedTriggers();
			case UML2Package.COLLABORATION__OWNED_STATE_MACHINE:
				return getOwnedStateMachines();
			case UML2Package.COLLABORATION__OWNED_ATTRIBUTE:
				return getOwnedAttributes();
			case UML2Package.COLLABORATION__PART:
				return getParts();
			case UML2Package.COLLABORATION__ROLE:
				return getRoles();
			case UML2Package.COLLABORATION__OWNED_CONNECTOR:
				return getOwnedConnectors();
			case UML2Package.COLLABORATION__COLLABORATION_ROLE:
				return getCollaborationRoles();
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
			case UML2Package.COLLABORATION__EANNOTATIONS:
				getEAnnotations().clear();
				getEAnnotations().addAll((Collection)newValue);
				return;
			case UML2Package.COLLABORATION__OWNED_COMMENT:
				getOwnedComments().clear();
				getOwnedComments().addAll((Collection)newValue);
				return;
			case UML2Package.COLLABORATION__TEMPLATE_BINDING:
				getTemplateBindings().clear();
				getTemplateBindings().addAll((Collection)newValue);
				return;
			case UML2Package.COLLABORATION__OWNED_TEMPLATE_SIGNATURE:
				setOwnedTemplateSignature((TemplateSignature)newValue);
				return;
			case UML2Package.COLLABORATION__NAME:
				setName((String)newValue);
				return;
			case UML2Package.COLLABORATION__VISIBILITY:
				setVisibility((VisibilityKind)newValue);
				return;
			case UML2Package.COLLABORATION__CLIENT_DEPENDENCY:
				getClientDependencies().clear();
				getClientDependencies().addAll((Collection)newValue);
				return;
			case UML2Package.COLLABORATION__NAME_EXPRESSION:
				setNameExpression((StringExpression)newValue);
				return;
			case UML2Package.COLLABORATION__OWNED_RULE:
				getOwnedRules().clear();
				getOwnedRules().addAll((Collection)newValue);
				return;
			case UML2Package.COLLABORATION__ELEMENT_IMPORT:
				getElementImports().clear();
				getElementImports().addAll((Collection)newValue);
				return;
			case UML2Package.COLLABORATION__PACKAGE_IMPORT:
				getPackageImports().clear();
				getPackageImports().addAll((Collection)newValue);
				return;
			case UML2Package.COLLABORATION__TEMPLATE_PARAMETER:
				setTemplateParameter((TemplateParameter)newValue);
				return;
			case UML2Package.COLLABORATION__OWNING_PARAMETER:
				setOwningParameter((TemplateParameter)newValue);
				return;
			case UML2Package.COLLABORATION__PACKAGEABLE_ELEMENT_VISIBILITY:
				setPackageableElement_visibility((VisibilityKind)newValue);
				return;
			case UML2Package.COLLABORATION__IS_LEAF:
				setIsLeaf(((Boolean)newValue).booleanValue());
				return;
			case UML2Package.COLLABORATION__IS_ABSTRACT:
				setIsAbstract(((Boolean)newValue).booleanValue());
				return;
			case UML2Package.COLLABORATION__GENERALIZATION:
				getGeneralizations().clear();
				getGeneralizations().addAll((Collection)newValue);
				return;
			case UML2Package.COLLABORATION__REDEFINED_CLASSIFIER:
				getRedefinedClassifiers().clear();
				getRedefinedClassifiers().addAll((Collection)newValue);
				return;
			case UML2Package.COLLABORATION__SUBSTITUTION:
				getSubstitutions().clear();
				getSubstitutions().addAll((Collection)newValue);
				return;
			case UML2Package.COLLABORATION__POWERTYPE_EXTENT:
				getPowertypeExtents().clear();
				getPowertypeExtents().addAll((Collection)newValue);
				return;
			case UML2Package.COLLABORATION__OWNED_USE_CASE:
				getOwnedUseCases().clear();
				getOwnedUseCases().addAll((Collection)newValue);
				return;
			case UML2Package.COLLABORATION__USE_CASE:
				getUseCases().clear();
				getUseCases().addAll((Collection)newValue);
				return;
			case UML2Package.COLLABORATION__REPRESENTATION:
				setRepresentation((CollaborationOccurrence)newValue);
				return;
			case UML2Package.COLLABORATION__OCCURRENCE:
				getOccurrences().clear();
				getOccurrences().addAll((Collection)newValue);
				return;
			case UML2Package.COLLABORATION__OWNED_BEHAVIOR:
				getOwnedBehaviors().clear();
				getOwnedBehaviors().addAll((Collection)newValue);
				return;
			case UML2Package.COLLABORATION__CLASSIFIER_BEHAVIOR:
				setClassifierBehavior((Behavior)newValue);
				return;
			case UML2Package.COLLABORATION__IMPLEMENTATION:
				getImplementations().clear();
				getImplementations().addAll((Collection)newValue);
				return;
			case UML2Package.COLLABORATION__OWNED_TRIGGER:
				getOwnedTriggers().clear();
				getOwnedTriggers().addAll((Collection)newValue);
				return;
			case UML2Package.COLLABORATION__OWNED_STATE_MACHINE:
				getOwnedStateMachines().clear();
				getOwnedStateMachines().addAll((Collection)newValue);
				return;
			case UML2Package.COLLABORATION__OWNED_ATTRIBUTE:
				getOwnedAttributes().clear();
				getOwnedAttributes().addAll((Collection)newValue);
				return;
			case UML2Package.COLLABORATION__OWNED_CONNECTOR:
				getOwnedConnectors().clear();
				getOwnedConnectors().addAll((Collection)newValue);
				return;
			case UML2Package.COLLABORATION__COLLABORATION_ROLE:
				getCollaborationRoles().clear();
				getCollaborationRoles().addAll((Collection)newValue);
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
			case UML2Package.COLLABORATION__EANNOTATIONS:
				getEAnnotations().clear();
				return;
			case UML2Package.COLLABORATION__OWNED_COMMENT:
				getOwnedComments().clear();
				return;
			case UML2Package.COLLABORATION__TEMPLATE_BINDING:
				getTemplateBindings().clear();
				return;
			case UML2Package.COLLABORATION__OWNED_TEMPLATE_SIGNATURE:
				setOwnedTemplateSignature((TemplateSignature)null);
				return;
			case UML2Package.COLLABORATION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case UML2Package.COLLABORATION__VISIBILITY:
				setVisibility(VISIBILITY_EDEFAULT);
				return;
			case UML2Package.COLLABORATION__CLIENT_DEPENDENCY:
				getClientDependencies().clear();
				return;
			case UML2Package.COLLABORATION__NAME_EXPRESSION:
				setNameExpression((StringExpression)null);
				return;
			case UML2Package.COLLABORATION__OWNED_RULE:
				getOwnedRules().clear();
				return;
			case UML2Package.COLLABORATION__ELEMENT_IMPORT:
				getElementImports().clear();
				return;
			case UML2Package.COLLABORATION__PACKAGE_IMPORT:
				getPackageImports().clear();
				return;
			case UML2Package.COLLABORATION__TEMPLATE_PARAMETER:
				setTemplateParameter((TemplateParameter)null);
				return;
			case UML2Package.COLLABORATION__OWNING_PARAMETER:
				setOwningParameter((TemplateParameter)null);
				return;
			case UML2Package.COLLABORATION__PACKAGEABLE_ELEMENT_VISIBILITY:
				setPackageableElement_visibility(PACKAGEABLE_ELEMENT_VISIBILITY_EDEFAULT);
				return;
			case UML2Package.COLLABORATION__IS_LEAF:
				setIsLeaf(IS_LEAF_EDEFAULT);
				return;
			case UML2Package.COLLABORATION__IS_ABSTRACT:
				setIsAbstract(IS_ABSTRACT_EDEFAULT);
				return;
			case UML2Package.COLLABORATION__GENERALIZATION:
				getGeneralizations().clear();
				return;
			case UML2Package.COLLABORATION__REDEFINED_CLASSIFIER:
				getRedefinedClassifiers().clear();
				return;
			case UML2Package.COLLABORATION__SUBSTITUTION:
				getSubstitutions().clear();
				return;
			case UML2Package.COLLABORATION__POWERTYPE_EXTENT:
				getPowertypeExtents().clear();
				return;
			case UML2Package.COLLABORATION__OWNED_USE_CASE:
				getOwnedUseCases().clear();
				return;
			case UML2Package.COLLABORATION__USE_CASE:
				getUseCases().clear();
				return;
			case UML2Package.COLLABORATION__REPRESENTATION:
				setRepresentation((CollaborationOccurrence)null);
				return;
			case UML2Package.COLLABORATION__OCCURRENCE:
				getOccurrences().clear();
				return;
			case UML2Package.COLLABORATION__OWNED_BEHAVIOR:
				getOwnedBehaviors().clear();
				return;
			case UML2Package.COLLABORATION__CLASSIFIER_BEHAVIOR:
				setClassifierBehavior((Behavior)null);
				return;
			case UML2Package.COLLABORATION__IMPLEMENTATION:
				getImplementations().clear();
				return;
			case UML2Package.COLLABORATION__OWNED_TRIGGER:
				getOwnedTriggers().clear();
				return;
			case UML2Package.COLLABORATION__OWNED_STATE_MACHINE:
				getOwnedStateMachines().clear();
				return;
			case UML2Package.COLLABORATION__OWNED_ATTRIBUTE:
				getOwnedAttributes().clear();
				return;
			case UML2Package.COLLABORATION__OWNED_CONNECTOR:
				getOwnedConnectors().clear();
				return;
			case UML2Package.COLLABORATION__COLLABORATION_ROLE:
				getCollaborationRoles().clear();
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
			case UML2Package.COLLABORATION__EANNOTATIONS:
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UML2Package.COLLABORATION__OWNED_ELEMENT:
				return isSetOwnedElements();
			case UML2Package.COLLABORATION__OWNER:
				return isSetOwner();
			case UML2Package.COLLABORATION__OWNED_COMMENT:
				EList ownedComment = (EList)eVirtualGet(UML2Package.COLLABORATION__OWNED_COMMENT);
				return ownedComment != null && !ownedComment.isEmpty();
			case UML2Package.COLLABORATION__TEMPLATE_BINDING:
				EList templateBinding = (EList)eVirtualGet(UML2Package.COLLABORATION__TEMPLATE_BINDING);
				return templateBinding != null && !templateBinding.isEmpty();
			case UML2Package.COLLABORATION__OWNED_TEMPLATE_SIGNATURE:
				return eVirtualGet(UML2Package.COLLABORATION__OWNED_TEMPLATE_SIGNATURE) != null;
			case UML2Package.COLLABORATION__NAME:
				String name = (String)eVirtualGet(UML2Package.COLLABORATION__NAME, NAME_EDEFAULT);
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case UML2Package.COLLABORATION__QUALIFIED_NAME:
				return QUALIFIED_NAME_EDEFAULT == null ? getQualifiedName() != null : !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case UML2Package.COLLABORATION__VISIBILITY:
				return isSetVisibility();
			case UML2Package.COLLABORATION__CLIENT_DEPENDENCY:
				EList clientDependency = (EList)eVirtualGet(UML2Package.COLLABORATION__CLIENT_DEPENDENCY);
				return clientDependency != null && !clientDependency.isEmpty();
			case UML2Package.COLLABORATION__NAME_EXPRESSION:
				return eVirtualGet(UML2Package.COLLABORATION__NAME_EXPRESSION) != null;
			case UML2Package.COLLABORATION__MEMBER:
				return isSetMembers();
			case UML2Package.COLLABORATION__OWNED_RULE:
				EList ownedRule = (EList)eVirtualGet(UML2Package.COLLABORATION__OWNED_RULE);
				return ownedRule != null && !ownedRule.isEmpty();
			case UML2Package.COLLABORATION__IMPORTED_MEMBER:
				return !getImportedMembers().isEmpty();
			case UML2Package.COLLABORATION__ELEMENT_IMPORT:
				EList elementImport = (EList)eVirtualGet(UML2Package.COLLABORATION__ELEMENT_IMPORT);
				return elementImport != null && !elementImport.isEmpty();
			case UML2Package.COLLABORATION__PACKAGE_IMPORT:
				EList packageImport = (EList)eVirtualGet(UML2Package.COLLABORATION__PACKAGE_IMPORT);
				return packageImport != null && !packageImport.isEmpty();
			case UML2Package.COLLABORATION__TEMPLATE_PARAMETER:
				return eVirtualGet(UML2Package.COLLABORATION__TEMPLATE_PARAMETER) != null;
			case UML2Package.COLLABORATION__OWNING_PARAMETER:
				return getOwningParameter() != null;
			case UML2Package.COLLABORATION__PACKAGEABLE_ELEMENT_VISIBILITY:
				return isSetPackageableElement_visibility();
			case UML2Package.COLLABORATION__PACKAGE:
				return getPackage() != null;
			case UML2Package.COLLABORATION__REDEFINITION_CONTEXT:
				return isSetRedefinitionContexts();
			case UML2Package.COLLABORATION__IS_LEAF:
				return ((eFlags & IS_LEAF_EFLAG) != 0) != IS_LEAF_EDEFAULT;
			case UML2Package.COLLABORATION__FEATURE:
				return isSetFeatures();
			case UML2Package.COLLABORATION__IS_ABSTRACT:
				return ((eFlags & IS_ABSTRACT_EFLAG) != 0) != IS_ABSTRACT_EDEFAULT;
			case UML2Package.COLLABORATION__INHERITED_MEMBER:
				return !getInheritedMembers().isEmpty();
			case UML2Package.COLLABORATION__GENERAL:
				return !getGenerals().isEmpty();
			case UML2Package.COLLABORATION__GENERALIZATION:
				EList generalization = (EList)eVirtualGet(UML2Package.COLLABORATION__GENERALIZATION);
				return generalization != null && !generalization.isEmpty();
			case UML2Package.COLLABORATION__ATTRIBUTE:
				return isSetAttributes();
			case UML2Package.COLLABORATION__REDEFINED_CLASSIFIER:
				EList redefinedClassifier = (EList)eVirtualGet(UML2Package.COLLABORATION__REDEFINED_CLASSIFIER);
				return redefinedClassifier != null && !redefinedClassifier.isEmpty();
			case UML2Package.COLLABORATION__SUBSTITUTION:
				EList substitution = (EList)eVirtualGet(UML2Package.COLLABORATION__SUBSTITUTION);
				return substitution != null && !substitution.isEmpty();
			case UML2Package.COLLABORATION__POWERTYPE_EXTENT:
				EList powertypeExtent = (EList)eVirtualGet(UML2Package.COLLABORATION__POWERTYPE_EXTENT);
				return powertypeExtent != null && !powertypeExtent.isEmpty();
			case UML2Package.COLLABORATION__OWNED_USE_CASE:
				EList ownedUseCase = (EList)eVirtualGet(UML2Package.COLLABORATION__OWNED_USE_CASE);
				return ownedUseCase != null && !ownedUseCase.isEmpty();
			case UML2Package.COLLABORATION__USE_CASE:
				EList useCase = (EList)eVirtualGet(UML2Package.COLLABORATION__USE_CASE);
				return useCase != null && !useCase.isEmpty();
			case UML2Package.COLLABORATION__REPRESENTATION:
				return eVirtualGet(UML2Package.COLLABORATION__REPRESENTATION) != null;
			case UML2Package.COLLABORATION__OCCURRENCE:
				EList occurrence = (EList)eVirtualGet(UML2Package.COLLABORATION__OCCURRENCE);
				return occurrence != null && !occurrence.isEmpty();
			case UML2Package.COLLABORATION__OWNED_BEHAVIOR:
				return isSetOwnedBehaviors();
			case UML2Package.COLLABORATION__CLASSIFIER_BEHAVIOR:
				return eVirtualGet(UML2Package.COLLABORATION__CLASSIFIER_BEHAVIOR) != null;
			case UML2Package.COLLABORATION__IMPLEMENTATION:
				EList implementation = (EList)eVirtualGet(UML2Package.COLLABORATION__IMPLEMENTATION);
				return implementation != null && !implementation.isEmpty();
			case UML2Package.COLLABORATION__OWNED_TRIGGER:
				EList ownedTrigger = (EList)eVirtualGet(UML2Package.COLLABORATION__OWNED_TRIGGER);
				return ownedTrigger != null && !ownedTrigger.isEmpty();
			case UML2Package.COLLABORATION__OWNED_STATE_MACHINE:
				return isSetOwnedStateMachines();
			case UML2Package.COLLABORATION__OWNED_ATTRIBUTE:
				EList ownedAttribute = (EList)eVirtualGet(UML2Package.COLLABORATION__OWNED_ATTRIBUTE);
				return ownedAttribute != null && !ownedAttribute.isEmpty();
			case UML2Package.COLLABORATION__PART:
				return !getParts().isEmpty();
			case UML2Package.COLLABORATION__ROLE:
				return isSetRoles();
			case UML2Package.COLLABORATION__OWNED_CONNECTOR:
				EList ownedConnector = (EList)eVirtualGet(UML2Package.COLLABORATION__OWNED_CONNECTOR);
				return ownedConnector != null && !ownedConnector.isEmpty();
			case UML2Package.COLLABORATION__COLLABORATION_ROLE:
				EList collaborationRole = (EList)eVirtualGet(UML2Package.COLLABORATION__COLLABORATION_ROLE);
				return collaborationRole != null && !collaborationRole.isEmpty();
		}
		return eDynamicIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class baseClass) {
		if (baseClass == StructuredClassifier.class) {
			switch (derivedFeatureID) {
				case UML2Package.COLLABORATION__OWNED_ATTRIBUTE: return UML2Package.STRUCTURED_CLASSIFIER__OWNED_ATTRIBUTE;
				case UML2Package.COLLABORATION__PART: return UML2Package.STRUCTURED_CLASSIFIER__PART;
				case UML2Package.COLLABORATION__ROLE: return UML2Package.STRUCTURED_CLASSIFIER__ROLE;
				case UML2Package.COLLABORATION__OWNED_CONNECTOR: return UML2Package.STRUCTURED_CLASSIFIER__OWNED_CONNECTOR;
				default: return -1;
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
		if (baseClass == StructuredClassifier.class) {
			switch (baseFeatureID) {
				case UML2Package.STRUCTURED_CLASSIFIER__OWNED_ATTRIBUTE: return UML2Package.COLLABORATION__OWNED_ATTRIBUTE;
				case UML2Package.STRUCTURED_CLASSIFIER__PART: return UML2Package.COLLABORATION__PART;
				case UML2Package.STRUCTURED_CLASSIFIER__ROLE: return UML2Package.COLLABORATION__ROLE;
				case UML2Package.STRUCTURED_CLASSIFIER__OWNED_CONNECTOR: return UML2Package.COLLABORATION__OWNED_CONNECTOR;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}


} //CollaborationImpl
