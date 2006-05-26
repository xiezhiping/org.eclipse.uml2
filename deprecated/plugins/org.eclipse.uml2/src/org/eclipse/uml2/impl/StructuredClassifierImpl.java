/*
 * Copyright (c) 2003, 2006 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *
 * $Id: StructuredClassifierImpl.java,v 1.34 2006/05/26 18:16:45 khussey Exp $
 */
package org.eclipse.uml2.impl;

import java.lang.reflect.Method;

import java.util.Collection;
import java.util.Iterator;

import java.util.List;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.common.util.UniqueEList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EcoreEList;
import org.eclipse.emf.ecore.util.InternalEList;

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

import org.eclipse.uml2.common.util.UnionEObjectEList;

import org.eclipse.uml2.common.util.CacheAdapter;

import org.eclipse.uml2.internal.operation.StructuredClassifierOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Structured Classifier</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2.impl.StructuredClassifierImpl#getRoles <em>Role</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.StructuredClassifierImpl#getAttributes <em>Attribute</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.StructuredClassifierImpl#getOwnedMembers <em>Owned Member</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.StructuredClassifierImpl#getMembers <em>Member</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.StructuredClassifierImpl#getFeatures <em>Feature</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.StructuredClassifierImpl#getOwnedAttributes <em>Owned Attribute</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.StructuredClassifierImpl#getParts <em>Part</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.StructuredClassifierImpl#getOwnedConnectors <em>Owned Connector</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class StructuredClassifierImpl extends ClassifierImpl implements StructuredClassifier {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) IBM Corporation and others."; //$NON-NLS-1$

	/**
	 * The cached value of the '{@link #getOwnedAttributes() <em>Owned Attribute</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedAttributes()
	 * @generated
	 * @ordered
	 */
	protected EList ownedAttributes = null;

	/**
	 * The cached value of the '{@link #getOwnedConnectors() <em>Owned Connector</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedConnectors()
	 * @generated
	 * @ordered
	 */
	protected EList ownedConnectors = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StructuredClassifierImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return UML2Package.Literals.STRUCTURED_CLASSIFIER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getOwnedAttributes() {
		if (ownedAttributes == null) {
			ownedAttributes = new EObjectContainmentEList(Property.class, this, UML2Package.STRUCTURED_CLASSIFIER__OWNED_ATTRIBUTE);
		}
		return ownedAttributes;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
    public Property getOwnedAttribute(String name) {
		return getOwnedAttribute(name, false, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property getOwnedAttribute(String name, boolean ignoreCase, EClass eClass) {
		ownedAttributeLoop: for (Iterator i = getOwnedAttributes().iterator(); i.hasNext(); ) {
			Property ownedAttribute = (Property) i.next();
			if (eClass != null && !eClass.isInstance(ownedAttribute))
				continue ownedAttributeLoop;
			if (name != null && !(ignoreCase ? name.equalsIgnoreCase(ownedAttribute.getName()) : name.equals(ownedAttribute.getName())))
				continue ownedAttributeLoop;
			return ownedAttribute;
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
			eNotify(new ENotificationImpl(this, 0, UML2Package.STRUCTURED_CLASSIFIER__OWNED_ATTRIBUTE, null, newOwnedAttribute));
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
			eNotify(new ENotificationImpl(this, 0, UML2Package.STRUCTURED_CLASSIFIER__OWNED_ATTRIBUTE, null, newOwnedAttribute));
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
		return getPart(name, false, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property getPart(String name, boolean ignoreCase, EClass eClass) {
		partLoop: for (Iterator i = getParts().iterator(); i.hasNext(); ) {
			Property part = (Property) i.next();
			if (eClass != null && !eClass.isInstance(part))
				continue partLoop;
			if (name != null && !(ignoreCase ? name.equalsIgnoreCase(part.getName()) : name.equals(part.getName())))
				continue partLoop;
			return part;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getRoles() {
		CacheAdapter cache = getCacheAdapter();
		if (cache != null) {
			Resource eResource = eResource();
			EList roles = (EList) cache.get(eResource, this, UML2Package.Literals.STRUCTURED_CLASSIFIER__ROLE);
			if (roles == null) {
				cache.put(eResource, this, UML2Package.Literals.STRUCTURED_CLASSIFIER__ROLE, roles = new DerivedUnionEObjectEList(ConnectableElement.class, this, UML2Package.STRUCTURED_CLASSIFIER__ROLE, ROLE_ESUBSETS));
			}
			return roles;
		}
		return new DerivedUnionEObjectEList(ConnectableElement.class, this, UML2Package.STRUCTURED_CLASSIFIER__ROLE, ROLE_ESUBSETS);
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRoles() {
		return eIsSet(UML2Package.STRUCTURED_CLASSIFIER__OWNED_ATTRIBUTE);
	}

	/**
	 * The array of subset feature identifiers for the '{@link #getRoles() <em>Role</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoles()
	 * @generated
	 * @ordered
	 */
	protected static final int[] ROLE_ESUBSETS = new int[] {UML2Package.STRUCTURED_CLASSIFIER__OWNED_ATTRIBUTE};

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
    public ConnectableElement getRole(String name) {
		return getRole(name, false, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectableElement getRole(String name, boolean ignoreCase, EClass eClass) {
		roleLoop: for (Iterator i = getRoles().iterator(); i.hasNext(); ) {
			ConnectableElement role = (ConnectableElement) i.next();
			if (eClass != null && !eClass.isInstance(role))
				continue roleLoop;
			if (name != null && !(ignoreCase ? name.equalsIgnoreCase(role.getName()) : name.equals(role.getName())))
				continue roleLoop;
			return role;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getAttributes() {
		CacheAdapter cache = getCacheAdapter();
		if (cache != null) {
			Resource eResource = eResource();
			EList attributes = (EList) cache.get(eResource, this, UML2Package.Literals.CLASSIFIER__ATTRIBUTE);
			if (attributes == null) {
				cache.put(eResource, this, UML2Package.Literals.CLASSIFIER__ATTRIBUTE, attributes = new DerivedUnionEObjectEList(Property.class, this, UML2Package.STRUCTURED_CLASSIFIER__ATTRIBUTE, ATTRIBUTE_ESUBSETS));
			}
			return attributes;
		}
		return new DerivedUnionEObjectEList(Property.class, this, UML2Package.STRUCTURED_CLASSIFIER__ATTRIBUTE, ATTRIBUTE_ESUBSETS);
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetAttributes() {
		return super.isSetAttributes()
			|| eIsSet(UML2Package.STRUCTURED_CLASSIFIER__OWNED_ATTRIBUTE);
	}

	/**
	 * The array of subset feature identifiers for the '{@link #getAttributes() <em>Attribute</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributes()
	 * @generated
	 * @ordered
	 */
	protected static final int[] ATTRIBUTE_ESUBSETS = new int[] {UML2Package.STRUCTURED_CLASSIFIER__OWNED_ATTRIBUTE};

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getOwnedMembers() {
		CacheAdapter cache = getCacheAdapter();
		if (cache != null) {
			try {
				Method method = getClass().getMethod("getOwnedMembers", null); //$NON-NLS-1$
				EList ownedMembers = (EList) cache.get(eResource(), this, method);
				if (ownedMembers == null) {
					List union = getOwnedMembersHelper(new UniqueEList.FastCompare());
					cache.put(eResource(), this, method, ownedMembers = new UnionEObjectEList(this, null, union.size(), union.toArray()));
				}
				return ownedMembers;
			}
			catch (NoSuchMethodException nsme) {
				// ignore
			}
		}
		List union = getOwnedMembersHelper(new UniqueEList.FastCompare());
		return new UnionEObjectEList(this, null, union.size(), union.toArray());
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getFeatures() {
		CacheAdapter cache = getCacheAdapter();
		if (cache != null) {
			Resource eResource = eResource();
			EList features = (EList) cache.get(eResource, this, UML2Package.Literals.CLASSIFIER__FEATURE);
			if (features == null) {
				cache.put(eResource, this, UML2Package.Literals.CLASSIFIER__FEATURE, features = new DerivedUnionEObjectEList(Feature.class, this, UML2Package.STRUCTURED_CLASSIFIER__FEATURE, FEATURE_ESUBSETS));
			}
			return features;
		}
		return new DerivedUnionEObjectEList(Feature.class, this, UML2Package.STRUCTURED_CLASSIFIER__FEATURE, FEATURE_ESUBSETS);
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetFeatures() {
		return super.isSetFeatures()
			|| eIsSet(UML2Package.STRUCTURED_CLASSIFIER__OWNED_CONNECTOR);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EList getOwnedMembersHelper(EList ownedMembers) {
		super.getOwnedMembersHelper(ownedMembers);
		if (eIsSet(UML2Package.STRUCTURED_CLASSIFIER__OWNED_ATTRIBUTE)) {
			ownedMembers.addAll(getOwnedAttributes());
		}
		if (eIsSet(UML2Package.STRUCTURED_CLASSIFIER__OWNED_CONNECTOR)) {
			ownedMembers.addAll(getOwnedConnectors());
		}
		return ownedMembers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOwnedMembers() {
		return super.isSetOwnedMembers()
			|| eIsSet(UML2Package.STRUCTURED_CLASSIFIER__OWNED_ATTRIBUTE)
			|| eIsSet(UML2Package.STRUCTURED_CLASSIFIER__OWNED_CONNECTOR);
	}

	/**
	 * The array of subset feature identifiers for the '{@link #getOwnedMembers() <em>Owned Member</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedMembers()
	 * @generated
	 * @ordered
	 */
	protected static final int[] OWNED_MEMBER_ESUBSETS = new int[] {UML2Package.STRUCTURED_CLASSIFIER__OWNED_RULE, UML2Package.STRUCTURED_CLASSIFIER__OWNED_USE_CASE, UML2Package.STRUCTURED_CLASSIFIER__OWNED_ATTRIBUTE, UML2Package.STRUCTURED_CLASSIFIER__OWNED_CONNECTOR};

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getMembers() {
		CacheAdapter cache = getCacheAdapter();
		if (cache != null) {
			EList members = (EList) cache.get(eResource(), this, UML2Package.Literals.NAMESPACE__MEMBER);
			if (members == null) {
				List union = getMembersHelper(new UniqueEList.FastCompare());
				cache.put(eResource(), this, UML2Package.Literals.NAMESPACE__MEMBER, members = new UnionEObjectEList(this, UML2Package.Literals.NAMESPACE__MEMBER, union.size(), union.toArray()));
			}
			return members;
		}
		List union = getMembersHelper(new UniqueEList.FastCompare());
		return new UnionEObjectEList(this, UML2Package.Literals.NAMESPACE__MEMBER, union.size(), union.toArray());
	}


	/**
	 * The array of subset feature identifiers for the '{@link #getFeatures() <em>Feature</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeatures()
	 * @generated
	 * @ordered
	 */
	protected static final int[] FEATURE_ESUBSETS = new int[] {UML2Package.STRUCTURED_CLASSIFIER__ATTRIBUTE, UML2Package.STRUCTURED_CLASSIFIER__OWNED_CONNECTOR};

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EList getMembersHelper(EList members) {
		super.getMembersHelper(members);
		if (isSetRoles()) {
			for (Iterator i = ((InternalEList) getRoles()).basicIterator(); i.hasNext(); ) {
				members.add(i.next());
			}
		}
		return members;
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
		if (ownedConnectors == null) {
			ownedConnectors = new EObjectContainmentEList(Connector.class, this, UML2Package.STRUCTURED_CLASSIFIER__OWNED_CONNECTOR);
		}
		return ownedConnectors;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
    public Connector getOwnedConnector(String name) {
		return getOwnedConnector(name, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Connector getOwnedConnector(String name, boolean ignoreCase) {
		ownedConnectorLoop: for (Iterator i = getOwnedConnectors().iterator(); i.hasNext(); ) {
			Connector ownedConnector = (Connector) i.next();
			if (name != null && !(ignoreCase ? name.equalsIgnoreCase(ownedConnector.getName()) : name.equals(ownedConnector.getName())))
				continue ownedConnectorLoop;
			return ownedConnector;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UML2Package.STRUCTURED_CLASSIFIER__EANNOTATIONS:
				return ((InternalEList)getEAnnotations()).basicRemove(otherEnd, msgs);
			case UML2Package.STRUCTURED_CLASSIFIER__OWNED_COMMENT:
				return ((InternalEList)getOwnedComments()).basicRemove(otherEnd, msgs);
			case UML2Package.STRUCTURED_CLASSIFIER__TEMPLATE_BINDING:
				return ((InternalEList)getTemplateBindings()).basicRemove(otherEnd, msgs);
			case UML2Package.STRUCTURED_CLASSIFIER__OWNED_TEMPLATE_SIGNATURE:
				return basicSetOwnedTemplateSignature(null, msgs);
			case UML2Package.STRUCTURED_CLASSIFIER__CLIENT_DEPENDENCY:
				return ((InternalEList)getClientDependencies()).basicRemove(otherEnd, msgs);
			case UML2Package.STRUCTURED_CLASSIFIER__NAME_EXPRESSION:
				return basicSetNameExpression(null, msgs);
			case UML2Package.STRUCTURED_CLASSIFIER__OWNED_RULE:
				return ((InternalEList)getOwnedRules()).basicRemove(otherEnd, msgs);
			case UML2Package.STRUCTURED_CLASSIFIER__ELEMENT_IMPORT:
				return ((InternalEList)getElementImports()).basicRemove(otherEnd, msgs);
			case UML2Package.STRUCTURED_CLASSIFIER__PACKAGE_IMPORT:
				return ((InternalEList)getPackageImports()).basicRemove(otherEnd, msgs);
			case UML2Package.STRUCTURED_CLASSIFIER__TEMPLATE_PARAMETER:
				return basicSetTemplateParameter(null, msgs);
			case UML2Package.STRUCTURED_CLASSIFIER__OWNING_PARAMETER:
				return basicSetOwningParameter(null, msgs);
			case UML2Package.STRUCTURED_CLASSIFIER__GENERALIZATION:
				return ((InternalEList)getGeneralizations()).basicRemove(otherEnd, msgs);
			case UML2Package.STRUCTURED_CLASSIFIER__SUBSTITUTION:
				return ((InternalEList)getSubstitutions()).basicRemove(otherEnd, msgs);
			case UML2Package.STRUCTURED_CLASSIFIER__POWERTYPE_EXTENT:
				return ((InternalEList)getPowertypeExtents()).basicRemove(otherEnd, msgs);
			case UML2Package.STRUCTURED_CLASSIFIER__OWNED_USE_CASE:
				return ((InternalEList)getOwnedUseCases()).basicRemove(otherEnd, msgs);
			case UML2Package.STRUCTURED_CLASSIFIER__USE_CASE:
				return ((InternalEList)getUseCases()).basicRemove(otherEnd, msgs);
			case UML2Package.STRUCTURED_CLASSIFIER__OCCURRENCE:
				return ((InternalEList)getOccurrences()).basicRemove(otherEnd, msgs);
			case UML2Package.STRUCTURED_CLASSIFIER__OWNED_ATTRIBUTE:
				return ((InternalEList)getOwnedAttributes()).basicRemove(otherEnd, msgs);
			case UML2Package.STRUCTURED_CLASSIFIER__OWNED_CONNECTOR:
				return ((InternalEList)getOwnedConnectors()).basicRemove(otherEnd, msgs);
		}
		return eDynamicInverseRemove(otherEnd, featureID, msgs);
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
			eNotify(new ENotificationImpl(this, 0, UML2Package.STRUCTURED_CLASSIFIER__OWNED_CONNECTOR, null, newOwnedConnector));
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
			eNotify(new ENotificationImpl(this, 0, UML2Package.STRUCTURED_CLASSIFIER__OWNED_CONNECTOR, null, newOwnedConnector));
		}
		getOwnedConnectors().add(newOwnedConnector);
		return newOwnedConnector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UML2Package.STRUCTURED_CLASSIFIER__EANNOTATIONS:
				return getEAnnotations();
			case UML2Package.STRUCTURED_CLASSIFIER__OWNED_ELEMENT:
				return getOwnedElements();
			case UML2Package.STRUCTURED_CLASSIFIER__OWNER:
				if (resolve) return getOwner();
				return basicGetOwner();
			case UML2Package.STRUCTURED_CLASSIFIER__OWNED_COMMENT:
				return getOwnedComments();
			case UML2Package.STRUCTURED_CLASSIFIER__TEMPLATE_BINDING:
				return getTemplateBindings();
			case UML2Package.STRUCTURED_CLASSIFIER__OWNED_TEMPLATE_SIGNATURE:
				return getOwnedTemplateSignature();
			case UML2Package.STRUCTURED_CLASSIFIER__NAME:
				return getName();
			case UML2Package.STRUCTURED_CLASSIFIER__QUALIFIED_NAME:
				return getQualifiedName();
			case UML2Package.STRUCTURED_CLASSIFIER__VISIBILITY:
				return getVisibility();
			case UML2Package.STRUCTURED_CLASSIFIER__CLIENT_DEPENDENCY:
				return getClientDependencies();
			case UML2Package.STRUCTURED_CLASSIFIER__NAME_EXPRESSION:
				return getNameExpression();
			case UML2Package.STRUCTURED_CLASSIFIER__MEMBER:
				return getMembers();
			case UML2Package.STRUCTURED_CLASSIFIER__OWNED_RULE:
				return getOwnedRules();
			case UML2Package.STRUCTURED_CLASSIFIER__IMPORTED_MEMBER:
				return getImportedMembers();
			case UML2Package.STRUCTURED_CLASSIFIER__ELEMENT_IMPORT:
				return getElementImports();
			case UML2Package.STRUCTURED_CLASSIFIER__PACKAGE_IMPORT:
				return getPackageImports();
			case UML2Package.STRUCTURED_CLASSIFIER__TEMPLATE_PARAMETER:
				if (resolve) return getTemplateParameter();
				return basicGetTemplateParameter();
			case UML2Package.STRUCTURED_CLASSIFIER__OWNING_PARAMETER:
				return getOwningParameter();
			case UML2Package.STRUCTURED_CLASSIFIER__PACKAGEABLE_ELEMENT_VISIBILITY:
				return getPackageableElement_visibility();
			case UML2Package.STRUCTURED_CLASSIFIER__PACKAGE:
				return getPackage();
			case UML2Package.STRUCTURED_CLASSIFIER__REDEFINITION_CONTEXT:
				return getRedefinitionContexts();
			case UML2Package.STRUCTURED_CLASSIFIER__IS_LEAF:
				return isLeaf() ? Boolean.TRUE : Boolean.FALSE;
			case UML2Package.STRUCTURED_CLASSIFIER__FEATURE:
				return getFeatures();
			case UML2Package.STRUCTURED_CLASSIFIER__IS_ABSTRACT:
				return isAbstract() ? Boolean.TRUE : Boolean.FALSE;
			case UML2Package.STRUCTURED_CLASSIFIER__INHERITED_MEMBER:
				return getInheritedMembers();
			case UML2Package.STRUCTURED_CLASSIFIER__GENERAL:
				return getGenerals();
			case UML2Package.STRUCTURED_CLASSIFIER__GENERALIZATION:
				return getGeneralizations();
			case UML2Package.STRUCTURED_CLASSIFIER__ATTRIBUTE:
				return getAttributes();
			case UML2Package.STRUCTURED_CLASSIFIER__REDEFINED_CLASSIFIER:
				return getRedefinedClassifiers();
			case UML2Package.STRUCTURED_CLASSIFIER__SUBSTITUTION:
				return getSubstitutions();
			case UML2Package.STRUCTURED_CLASSIFIER__POWERTYPE_EXTENT:
				return getPowertypeExtents();
			case UML2Package.STRUCTURED_CLASSIFIER__OWNED_USE_CASE:
				return getOwnedUseCases();
			case UML2Package.STRUCTURED_CLASSIFIER__USE_CASE:
				return getUseCases();
			case UML2Package.STRUCTURED_CLASSIFIER__REPRESENTATION:
				return getRepresentation();
			case UML2Package.STRUCTURED_CLASSIFIER__OCCURRENCE:
				return getOccurrences();
			case UML2Package.STRUCTURED_CLASSIFIER__OWNED_ATTRIBUTE:
				return getOwnedAttributes();
			case UML2Package.STRUCTURED_CLASSIFIER__PART:
				return getParts();
			case UML2Package.STRUCTURED_CLASSIFIER__ROLE:
				return getRoles();
			case UML2Package.STRUCTURED_CLASSIFIER__OWNED_CONNECTOR:
				return getOwnedConnectors();
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
			case UML2Package.STRUCTURED_CLASSIFIER__EANNOTATIONS:
				getEAnnotations().clear();
				getEAnnotations().addAll((Collection)newValue);
				return;
			case UML2Package.STRUCTURED_CLASSIFIER__OWNED_COMMENT:
				getOwnedComments().clear();
				getOwnedComments().addAll((Collection)newValue);
				return;
			case UML2Package.STRUCTURED_CLASSIFIER__TEMPLATE_BINDING:
				getTemplateBindings().clear();
				getTemplateBindings().addAll((Collection)newValue);
				return;
			case UML2Package.STRUCTURED_CLASSIFIER__OWNED_TEMPLATE_SIGNATURE:
				setOwnedTemplateSignature((TemplateSignature)newValue);
				return;
			case UML2Package.STRUCTURED_CLASSIFIER__NAME:
				setName((String)newValue);
				return;
			case UML2Package.STRUCTURED_CLASSIFIER__VISIBILITY:
				setVisibility((VisibilityKind)newValue);
				return;
			case UML2Package.STRUCTURED_CLASSIFIER__CLIENT_DEPENDENCY:
				getClientDependencies().clear();
				getClientDependencies().addAll((Collection)newValue);
				return;
			case UML2Package.STRUCTURED_CLASSIFIER__NAME_EXPRESSION:
				setNameExpression((StringExpression)newValue);
				return;
			case UML2Package.STRUCTURED_CLASSIFIER__OWNED_RULE:
				getOwnedRules().clear();
				getOwnedRules().addAll((Collection)newValue);
				return;
			case UML2Package.STRUCTURED_CLASSIFIER__ELEMENT_IMPORT:
				getElementImports().clear();
				getElementImports().addAll((Collection)newValue);
				return;
			case UML2Package.STRUCTURED_CLASSIFIER__PACKAGE_IMPORT:
				getPackageImports().clear();
				getPackageImports().addAll((Collection)newValue);
				return;
			case UML2Package.STRUCTURED_CLASSIFIER__TEMPLATE_PARAMETER:
				setTemplateParameter((TemplateParameter)newValue);
				return;
			case UML2Package.STRUCTURED_CLASSIFIER__OWNING_PARAMETER:
				setOwningParameter((TemplateParameter)newValue);
				return;
			case UML2Package.STRUCTURED_CLASSIFIER__PACKAGEABLE_ELEMENT_VISIBILITY:
				setPackageableElement_visibility((VisibilityKind)newValue);
				return;
			case UML2Package.STRUCTURED_CLASSIFIER__IS_LEAF:
				setIsLeaf(((Boolean)newValue).booleanValue());
				return;
			case UML2Package.STRUCTURED_CLASSIFIER__IS_ABSTRACT:
				setIsAbstract(((Boolean)newValue).booleanValue());
				return;
			case UML2Package.STRUCTURED_CLASSIFIER__GENERALIZATION:
				getGeneralizations().clear();
				getGeneralizations().addAll((Collection)newValue);
				return;
			case UML2Package.STRUCTURED_CLASSIFIER__REDEFINED_CLASSIFIER:
				getRedefinedClassifiers().clear();
				getRedefinedClassifiers().addAll((Collection)newValue);
				return;
			case UML2Package.STRUCTURED_CLASSIFIER__SUBSTITUTION:
				getSubstitutions().clear();
				getSubstitutions().addAll((Collection)newValue);
				return;
			case UML2Package.STRUCTURED_CLASSIFIER__POWERTYPE_EXTENT:
				getPowertypeExtents().clear();
				getPowertypeExtents().addAll((Collection)newValue);
				return;
			case UML2Package.STRUCTURED_CLASSIFIER__OWNED_USE_CASE:
				getOwnedUseCases().clear();
				getOwnedUseCases().addAll((Collection)newValue);
				return;
			case UML2Package.STRUCTURED_CLASSIFIER__USE_CASE:
				getUseCases().clear();
				getUseCases().addAll((Collection)newValue);
				return;
			case UML2Package.STRUCTURED_CLASSIFIER__REPRESENTATION:
				setRepresentation((CollaborationOccurrence)newValue);
				return;
			case UML2Package.STRUCTURED_CLASSIFIER__OCCURRENCE:
				getOccurrences().clear();
				getOccurrences().addAll((Collection)newValue);
				return;
			case UML2Package.STRUCTURED_CLASSIFIER__OWNED_ATTRIBUTE:
				getOwnedAttributes().clear();
				getOwnedAttributes().addAll((Collection)newValue);
				return;
			case UML2Package.STRUCTURED_CLASSIFIER__OWNED_CONNECTOR:
				getOwnedConnectors().clear();
				getOwnedConnectors().addAll((Collection)newValue);
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
			case UML2Package.STRUCTURED_CLASSIFIER__EANNOTATIONS:
				getEAnnotations().clear();
				return;
			case UML2Package.STRUCTURED_CLASSIFIER__OWNED_COMMENT:
				getOwnedComments().clear();
				return;
			case UML2Package.STRUCTURED_CLASSIFIER__TEMPLATE_BINDING:
				getTemplateBindings().clear();
				return;
			case UML2Package.STRUCTURED_CLASSIFIER__OWNED_TEMPLATE_SIGNATURE:
				setOwnedTemplateSignature((TemplateSignature)null);
				return;
			case UML2Package.STRUCTURED_CLASSIFIER__NAME:
				setName(NAME_EDEFAULT);
				return;
			case UML2Package.STRUCTURED_CLASSIFIER__VISIBILITY:
				setVisibility(VISIBILITY_EDEFAULT);
				return;
			case UML2Package.STRUCTURED_CLASSIFIER__CLIENT_DEPENDENCY:
				getClientDependencies().clear();
				return;
			case UML2Package.STRUCTURED_CLASSIFIER__NAME_EXPRESSION:
				setNameExpression((StringExpression)null);
				return;
			case UML2Package.STRUCTURED_CLASSIFIER__OWNED_RULE:
				getOwnedRules().clear();
				return;
			case UML2Package.STRUCTURED_CLASSIFIER__ELEMENT_IMPORT:
				getElementImports().clear();
				return;
			case UML2Package.STRUCTURED_CLASSIFIER__PACKAGE_IMPORT:
				getPackageImports().clear();
				return;
			case UML2Package.STRUCTURED_CLASSIFIER__TEMPLATE_PARAMETER:
				setTemplateParameter((TemplateParameter)null);
				return;
			case UML2Package.STRUCTURED_CLASSIFIER__OWNING_PARAMETER:
				setOwningParameter((TemplateParameter)null);
				return;
			case UML2Package.STRUCTURED_CLASSIFIER__PACKAGEABLE_ELEMENT_VISIBILITY:
				setPackageableElement_visibility(PACKAGEABLE_ELEMENT_VISIBILITY_EDEFAULT);
				return;
			case UML2Package.STRUCTURED_CLASSIFIER__IS_LEAF:
				setIsLeaf(IS_LEAF_EDEFAULT);
				return;
			case UML2Package.STRUCTURED_CLASSIFIER__IS_ABSTRACT:
				setIsAbstract(IS_ABSTRACT_EDEFAULT);
				return;
			case UML2Package.STRUCTURED_CLASSIFIER__GENERALIZATION:
				getGeneralizations().clear();
				return;
			case UML2Package.STRUCTURED_CLASSIFIER__REDEFINED_CLASSIFIER:
				getRedefinedClassifiers().clear();
				return;
			case UML2Package.STRUCTURED_CLASSIFIER__SUBSTITUTION:
				getSubstitutions().clear();
				return;
			case UML2Package.STRUCTURED_CLASSIFIER__POWERTYPE_EXTENT:
				getPowertypeExtents().clear();
				return;
			case UML2Package.STRUCTURED_CLASSIFIER__OWNED_USE_CASE:
				getOwnedUseCases().clear();
				return;
			case UML2Package.STRUCTURED_CLASSIFIER__USE_CASE:
				getUseCases().clear();
				return;
			case UML2Package.STRUCTURED_CLASSIFIER__REPRESENTATION:
				setRepresentation((CollaborationOccurrence)null);
				return;
			case UML2Package.STRUCTURED_CLASSIFIER__OCCURRENCE:
				getOccurrences().clear();
				return;
			case UML2Package.STRUCTURED_CLASSIFIER__OWNED_ATTRIBUTE:
				getOwnedAttributes().clear();
				return;
			case UML2Package.STRUCTURED_CLASSIFIER__OWNED_CONNECTOR:
				getOwnedConnectors().clear();
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
			case UML2Package.STRUCTURED_CLASSIFIER__EANNOTATIONS:
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UML2Package.STRUCTURED_CLASSIFIER__OWNED_ELEMENT:
				return isSetOwnedElements();
			case UML2Package.STRUCTURED_CLASSIFIER__OWNER:
				return isSetOwner();
			case UML2Package.STRUCTURED_CLASSIFIER__OWNED_COMMENT:
				return ownedComments != null && !ownedComments.isEmpty();
			case UML2Package.STRUCTURED_CLASSIFIER__TEMPLATE_BINDING:
				return templateBindings != null && !templateBindings.isEmpty();
			case UML2Package.STRUCTURED_CLASSIFIER__OWNED_TEMPLATE_SIGNATURE:
				return ownedTemplateSignature != null;
			case UML2Package.STRUCTURED_CLASSIFIER__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case UML2Package.STRUCTURED_CLASSIFIER__QUALIFIED_NAME:
				return QUALIFIED_NAME_EDEFAULT == null ? getQualifiedName() != null : !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case UML2Package.STRUCTURED_CLASSIFIER__VISIBILITY:
				return isSetVisibility();
			case UML2Package.STRUCTURED_CLASSIFIER__CLIENT_DEPENDENCY:
				return clientDependencies != null && !clientDependencies.isEmpty();
			case UML2Package.STRUCTURED_CLASSIFIER__NAME_EXPRESSION:
				return nameExpression != null;
			case UML2Package.STRUCTURED_CLASSIFIER__MEMBER:
				return isSetMembers();
			case UML2Package.STRUCTURED_CLASSIFIER__OWNED_RULE:
				return ownedRules != null && !ownedRules.isEmpty();
			case UML2Package.STRUCTURED_CLASSIFIER__IMPORTED_MEMBER:
				return !getImportedMembers().isEmpty();
			case UML2Package.STRUCTURED_CLASSIFIER__ELEMENT_IMPORT:
				return elementImports != null && !elementImports.isEmpty();
			case UML2Package.STRUCTURED_CLASSIFIER__PACKAGE_IMPORT:
				return packageImports != null && !packageImports.isEmpty();
			case UML2Package.STRUCTURED_CLASSIFIER__TEMPLATE_PARAMETER:
				return templateParameter != null;
			case UML2Package.STRUCTURED_CLASSIFIER__OWNING_PARAMETER:
				return getOwningParameter() != null;
			case UML2Package.STRUCTURED_CLASSIFIER__PACKAGEABLE_ELEMENT_VISIBILITY:
				return isSetPackageableElement_visibility();
			case UML2Package.STRUCTURED_CLASSIFIER__PACKAGE:
				return getPackage() != null;
			case UML2Package.STRUCTURED_CLASSIFIER__REDEFINITION_CONTEXT:
				return isSetRedefinitionContexts();
			case UML2Package.STRUCTURED_CLASSIFIER__IS_LEAF:
				return ((eFlags & IS_LEAF_EFLAG) != 0) != IS_LEAF_EDEFAULT;
			case UML2Package.STRUCTURED_CLASSIFIER__FEATURE:
				return isSetFeatures();
			case UML2Package.STRUCTURED_CLASSIFIER__IS_ABSTRACT:
				return ((eFlags & IS_ABSTRACT_EFLAG) != 0) != IS_ABSTRACT_EDEFAULT;
			case UML2Package.STRUCTURED_CLASSIFIER__INHERITED_MEMBER:
				return !getInheritedMembers().isEmpty();
			case UML2Package.STRUCTURED_CLASSIFIER__GENERAL:
				return !getGenerals().isEmpty();
			case UML2Package.STRUCTURED_CLASSIFIER__GENERALIZATION:
				return generalizations != null && !generalizations.isEmpty();
			case UML2Package.STRUCTURED_CLASSIFIER__ATTRIBUTE:
				return isSetAttributes();
			case UML2Package.STRUCTURED_CLASSIFIER__REDEFINED_CLASSIFIER:
				return redefinedClassifiers != null && !redefinedClassifiers.isEmpty();
			case UML2Package.STRUCTURED_CLASSIFIER__SUBSTITUTION:
				return substitutions != null && !substitutions.isEmpty();
			case UML2Package.STRUCTURED_CLASSIFIER__POWERTYPE_EXTENT:
				return powertypeExtents != null && !powertypeExtents.isEmpty();
			case UML2Package.STRUCTURED_CLASSIFIER__OWNED_USE_CASE:
				return ownedUseCases != null && !ownedUseCases.isEmpty();
			case UML2Package.STRUCTURED_CLASSIFIER__USE_CASE:
				return useCases != null && !useCases.isEmpty();
			case UML2Package.STRUCTURED_CLASSIFIER__REPRESENTATION:
				return representation != null;
			case UML2Package.STRUCTURED_CLASSIFIER__OCCURRENCE:
				return occurrences != null && !occurrences.isEmpty();
			case UML2Package.STRUCTURED_CLASSIFIER__OWNED_ATTRIBUTE:
				return ownedAttributes != null && !ownedAttributes.isEmpty();
			case UML2Package.STRUCTURED_CLASSIFIER__PART:
				return !getParts().isEmpty();
			case UML2Package.STRUCTURED_CLASSIFIER__ROLE:
				return isSetRoles();
			case UML2Package.STRUCTURED_CLASSIFIER__OWNED_CONNECTOR:
				return ownedConnectors != null && !ownedConnectors.isEmpty();
		}
		return eDynamicIsSet(featureID);
	}


} //StructuredClassifierImpl
