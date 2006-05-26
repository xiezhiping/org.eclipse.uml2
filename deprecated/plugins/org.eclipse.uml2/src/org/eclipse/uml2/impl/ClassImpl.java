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
 * $Id: ClassImpl.java,v 1.50 2006/05/26 18:16:43 khussey Exp $
 */
package org.eclipse.uml2.impl;

import java.lang.reflect.Method;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.common.util.UniqueEList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.uml2.Behavior;
import org.eclipse.uml2.Classifier;
import org.eclipse.uml2.CollaborationOccurrence;
import org.eclipse.uml2.ConnectableElement;
import org.eclipse.uml2.Connector;
import org.eclipse.uml2.EncapsulatedClassifier;
import org.eclipse.uml2.Extension;
import org.eclipse.uml2.Feature;
import org.eclipse.uml2.Operation;
import org.eclipse.uml2.Port;
import org.eclipse.uml2.Property;
import org.eclipse.uml2.Reception;
import org.eclipse.uml2.StringExpression;
import org.eclipse.uml2.StructuredClassifier;
import org.eclipse.uml2.TemplateParameter;
import org.eclipse.uml2.TemplateSignature;
import org.eclipse.uml2.UML2Factory;
import org.eclipse.uml2.Type;
import org.eclipse.uml2.UML2Package;
import org.eclipse.uml2.VisibilityKind;

import org.eclipse.uml2.common.util.DerivedUnionEObjectEList;

import org.eclipse.uml2.common.util.UnionEObjectEList;

import org.eclipse.uml2.common.util.CacheAdapter;

import org.eclipse.uml2.internal.operation.ClassOperations;
import org.eclipse.uml2.internal.operation.ClassifierOperations;
import org.eclipse.uml2.internal.operation.StructuredClassifierOperations;
import org.eclipse.uml2.internal.operation.TypeOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Class</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2.impl.ClassImpl#getRoles <em>Role</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.ClassImpl#getAttributes <em>Attribute</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.ClassImpl#getOwnedMembers <em>Owned Member</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.ClassImpl#getMembers <em>Member</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.ClassImpl#getFeatures <em>Feature</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.ClassImpl#getOwnedAttributes <em>Owned Attribute</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.ClassImpl#getParts <em>Part</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.ClassImpl#getOwnedConnectors <em>Owned Connector</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.ClassImpl#getOwnedPorts <em>Owned Port</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.ClassImpl#getOwnedOperations <em>Owned Operation</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.ClassImpl#getSuperClasses <em>Super Class</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.ClassImpl#getExtensions <em>Extension</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.ClassImpl#getNestedClassifiers <em>Nested Classifier</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.ClassImpl#isActive <em>Is Active</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.ClassImpl#getOwnedReceptions <em>Owned Reception</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.ClassImpl#isAbstract <em>Is Abstract</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ClassImpl extends BehavioredClassifierImpl implements org.eclipse.uml2.Class {
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
	 * The cached value of the '{@link #getOwnedPorts() <em>Owned Port</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedPorts()
	 * @generated
	 * @ordered
	 */
	protected EList ownedPorts = null;

	/**
	 * The cached value of the '{@link #getOwnedOperations() <em>Owned Operation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedOperations()
	 * @generated
	 * @ordered
	 */
	protected EList ownedOperations = null;

	/**
	 * The cached value of the '{@link #getNestedClassifiers() <em>Nested Classifier</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNestedClassifiers()
	 * @generated
	 * @ordered
	 */
	protected EList nestedClassifiers = null;

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
	 * The cached value of the '{@link #getOwnedReceptions() <em>Owned Reception</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedReceptions()
	 * @generated
	 * @ordered
	 */
	protected EList ownedReceptions = null;

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
		return UML2Package.Literals.CLASS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getOwnedAttributes() {
		if (ownedAttributes == null) {
			ownedAttributes = new EObjectContainmentEList(Property.class, this, UML2Package.CLASS__OWNED_ATTRIBUTE);
		}
		return ownedAttributes;
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
			eNotify(new ENotificationImpl(this, 0, UML2Package.CLASS__OWNED_ATTRIBUTE, null, newOwnedAttribute));
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
			eNotify(new ENotificationImpl(this, 0, UML2Package.CLASS__OWNED_ATTRIBUTE, null, newOwnedAttribute));
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
				cache.put(eResource, this, UML2Package.Literals.STRUCTURED_CLASSIFIER__ROLE, roles = new DerivedUnionEObjectEList(ConnectableElement.class, this, UML2Package.CLASS__ROLE, ROLE_ESUBSETS));
			}
			return roles;
		}
		return new DerivedUnionEObjectEList(ConnectableElement.class, this, UML2Package.CLASS__ROLE, ROLE_ESUBSETS);
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRoles() {
		return isSetOwnedAttributes();
	}

	/**
	 * The array of subset feature identifiers for the '{@link #getRoles() <em>Role</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoles()
	 * @generated
	 * @ordered
	 */
	protected static final int[] ROLE_ESUBSETS = new int[] {UML2Package.CLASS__OWNED_ATTRIBUTE};

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
				cache.put(eResource, this, UML2Package.Literals.CLASSIFIER__ATTRIBUTE, attributes = new DerivedUnionEObjectEList(Property.class, this, UML2Package.CLASS__ATTRIBUTE, ATTRIBUTE_ESUBSETS));
			}
			return attributes;
		}
		return new DerivedUnionEObjectEList(Property.class, this, UML2Package.CLASS__ATTRIBUTE, ATTRIBUTE_ESUBSETS);
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetAttributes() {
		return super.isSetAttributes()
			|| isSetOwnedAttributes();
	}

	/**
	 * The array of subset feature identifiers for the '{@link #getAttributes() <em>Attribute</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributes()
	 * @generated
	 * @ordered
	 */
	protected static final int[] ATTRIBUTE_ESUBSETS = new int[] {UML2Package.CLASS__OWNED_ATTRIBUTE};

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
				cache.put(eResource, this, UML2Package.Literals.CLASSIFIER__FEATURE, features = new DerivedUnionEObjectEList(Feature.class, this, UML2Package.CLASS__FEATURE, FEATURE_ESUBSETS));
			}
			return features;
		}
		return new DerivedUnionEObjectEList(Feature.class, this, UML2Package.CLASS__FEATURE, FEATURE_ESUBSETS);
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetFeatures() {
		return super.isSetFeatures()
			|| eIsSet(UML2Package.CLASS__OWNED_CONNECTOR)
			|| eIsSet(UML2Package.CLASS__OWNED_PORT)
			|| eIsSet(UML2Package.CLASS__OWNED_OPERATION)
			|| eIsSet(UML2Package.CLASS__OWNED_RECEPTION);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EList getOwnedMembersHelper(EList ownedMembers) {
		super.getOwnedMembersHelper(ownedMembers);
		if (isSetOwnedAttributes()) {
			ownedMembers.addAll(getOwnedAttributes());
		}
		if (eIsSet(UML2Package.CLASS__OWNED_CONNECTOR)) {
			ownedMembers.addAll(getOwnedConnectors());
		}
		if (eIsSet(UML2Package.CLASS__OWNED_PORT)) {
			ownedMembers.addAll(getOwnedPorts());
		}
		if (eIsSet(UML2Package.CLASS__OWNED_OPERATION)) {
			ownedMembers.addAll(getOwnedOperations());
		}
		if (eIsSet(UML2Package.CLASS__NESTED_CLASSIFIER)) {
			ownedMembers.addAll(getNestedClassifiers());
		}
		if (eIsSet(UML2Package.CLASS__OWNED_RECEPTION)) {
			ownedMembers.addAll(getOwnedReceptions());
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
			|| isSetOwnedAttributes()
			|| eIsSet(UML2Package.CLASS__OWNED_CONNECTOR)
			|| eIsSet(UML2Package.CLASS__OWNED_PORT)
			|| eIsSet(UML2Package.CLASS__OWNED_OPERATION)
			|| eIsSet(UML2Package.CLASS__NESTED_CLASSIFIER)
			|| eIsSet(UML2Package.CLASS__OWNED_RECEPTION);
	}

	/**
	 * The array of subset feature identifiers for the '{@link #getOwnedMembers() <em>Owned Member</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedMembers()
	 * @generated
	 * @ordered
	 */
	protected static final int[] OWNED_MEMBER_ESUBSETS = new int[] {UML2Package.CLASS__OWNED_RULE, UML2Package.CLASS__OWNED_USE_CASE, UML2Package.CLASS__OWNED_BEHAVIOR, UML2Package.CLASS__OWNED_TRIGGER, UML2Package.CLASS__OWNED_ATTRIBUTE, UML2Package.CLASS__OWNED_CONNECTOR, UML2Package.CLASS__OWNED_PORT, UML2Package.CLASS__OWNED_OPERATION, UML2Package.CLASS__NESTED_CLASSIFIER, UML2Package.CLASS__OWNED_RECEPTION};

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
	protected static final int[] FEATURE_ESUBSETS = new int[] {UML2Package.CLASS__ATTRIBUTE, UML2Package.CLASS__OWNED_CONNECTOR, UML2Package.CLASS__OWNED_PORT, UML2Package.CLASS__OWNED_OPERATION, UML2Package.CLASS__OWNED_RECEPTION};

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
			ownedConnectors = new EObjectContainmentEList(Connector.class, this, UML2Package.CLASS__OWNED_CONNECTOR);
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
	 * @generated NOT
	 * @deprecated Use #createOwnedConnector() instead.
	 */
	public Connector createOwnedConnector(EClass eClass) {
		Connector newOwnedConnector = (Connector) eClass.getEPackage().getEFactoryInstance().create(eClass);
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, 0, UML2Package.CLASS__OWNED_CONNECTOR, null, newOwnedConnector));
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
			eNotify(new ENotificationImpl(this, 0, UML2Package.CLASS__OWNED_CONNECTOR, null, newOwnedConnector));
		}
		getOwnedConnectors().add(newOwnedConnector);
		return newOwnedConnector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getOwnedPorts() {
		if (ownedPorts == null) {
			ownedPorts = new EObjectContainmentEList(Port.class, this, UML2Package.CLASS__OWNED_PORT);
		}
		return ownedPorts;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
    public Port getOwnedPort(String name) {
		return getOwnedPort(name, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Port getOwnedPort(String name, boolean ignoreCase) {
		ownedPortLoop: for (Iterator i = getOwnedPorts().iterator(); i.hasNext(); ) {
			Port ownedPort = (Port) i.next();
			if (name != null && !(ignoreCase ? name.equalsIgnoreCase(ownedPort.getName()) : name.equals(ownedPort.getName())))
				continue ownedPortLoop;
			return ownedPort;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 * @deprecated Use #createOwnedPort() instead.
	 */
	public Port createOwnedPort(EClass eClass) {
		Port newOwnedPort = (Port) eClass.getEPackage().getEFactoryInstance().create(eClass);
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, 0, UML2Package.CLASS__OWNED_PORT, null, newOwnedPort));
		}
		getOwnedPorts().add(newOwnedPort);
		return newOwnedPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Port createOwnedPort() {
		Port newOwnedPort = UML2Factory.eINSTANCE.createPort();
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, 0, UML2Package.CLASS__OWNED_PORT, null, newOwnedPort));
		}
		getOwnedPorts().add(newOwnedPort);
		return newOwnedPort;
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
		if (newIsActive) eFlags |= IS_ACTIVE_EFLAG; else eFlags &= ~IS_ACTIVE_EFLAG;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2Package.CLASS__IS_ACTIVE, oldIsActive, newIsActive));


	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getOwnedOperations() {
		if (ownedOperations == null) {
			ownedOperations = new EObjectContainmentWithInverseEList(Operation.class, this, UML2Package.CLASS__OWNED_OPERATION, UML2Package.OPERATION__CLASS_);
		}
		return ownedOperations;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
    public Operation getOwnedOperation(String name) {
		return getOwnedOperation(name, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operation getOwnedOperation(String name, boolean ignoreCase) {
		ownedOperationLoop: for (Iterator i = getOwnedOperations().iterator(); i.hasNext(); ) {
			Operation ownedOperation = (Operation) i.next();
			if (name != null && !(ignoreCase ? name.equalsIgnoreCase(ownedOperation.getName()) : name.equals(ownedOperation.getName())))
				continue ownedOperationLoop;
			return ownedOperation;
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
			eNotify(new ENotificationImpl(this, 0, UML2Package.CLASS__OWNED_OPERATION, null, newOwnedOperation));
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
			eNotify(new ENotificationImpl(this, 0, UML2Package.CLASS__OWNED_OPERATION, null, newOwnedOperation));
		}
		getOwnedOperations().add(newOwnedOperation);
		return newOwnedOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList getSuperClasses() {
		CacheAdapter cache = getCacheAdapter();

		if (cache != null) {
			EList result = (EList) cache.get(eResource(), this,
				UML2Package.Literals.CLASS__SUPER_CLASS);

			if (result == null) {
				EList superClasses = ClassOperations.getSuperClasses(this);
				cache.put(eResource(), this,
					UML2Package.Literals.CLASS__SUPER_CLASS,
					result = new EcoreEList.UnmodifiableEList(this,
						UML2Package.Literals.CLASS__SUPER_CLASS, superClasses
							.size(), superClasses.toArray()));
			}

			return result;
		}

		EList superClasses = ClassOperations.getSuperClasses(this);
		return new EcoreEList.UnmodifiableEList(this,
			UML2Package.Literals.CLASS__SUPER_CLASS, superClasses.size(),
			superClasses.toArray());
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
    public org.eclipse.uml2.Class getSuperClass(String name) {
		return getSuperClass(name, false, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.uml2.Class getSuperClass(String name, boolean ignoreCase, EClass eClass) {
		superClassLoop: for (Iterator i = getSuperClasses().iterator(); i.hasNext(); ) {
			org.eclipse.uml2.Class superClass = (org.eclipse.uml2.Class) i.next();
			if (eClass != null && !eClass.isInstance(superClass))
				continue superClassLoop;
			if (name != null && !(ignoreCase ? name.equalsIgnoreCase(superClass.getName()) : name.equals(superClass.getName())))
				continue superClassLoop;
			return superClass;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList getExtensions() {
		CacheAdapter cache = getCacheAdapter();

		if (cache != null) {
			EList result = (EList) cache.get(this,
				UML2Package.Literals.CLASS__EXTENSION);

			if (result == null) {
				Set extensions = ClassOperations.getExtensions(this);
				cache.put(this, UML2Package.Literals.CLASS__EXTENSION,
					result = new EcoreEList.UnmodifiableEList(this,
						UML2Package.Literals.CLASS__EXTENSION, extensions
							.size(), extensions.toArray()));
			}

			return result;
		}

		Set extensions = ClassOperations.getExtensions(this);
		return new EcoreEList.UnmodifiableEList(this,
			UML2Package.Literals.CLASS__EXTENSION, extensions.size(),
			extensions.toArray());
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
		extensionLoop: for (Iterator i = getExtensions().iterator(); i.hasNext(); ) {
			Extension extension = (Extension) i.next();
			if (name != null && !(ignoreCase ? name.equalsIgnoreCase(extension.getName()) : name.equals(extension.getName())))
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
	public EList getNestedClassifiers() {
		if (nestedClassifiers == null) {
			nestedClassifiers = new EObjectContainmentEList(Classifier.class, this, UML2Package.CLASS__NESTED_CLASSIFIER);
		}
		return nestedClassifiers;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
    public Classifier getNestedClassifier(String name) {
		return getNestedClassifier(name, false, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Classifier getNestedClassifier(String name, boolean ignoreCase, EClass eClass) {
		nestedClassifierLoop: for (Iterator i = getNestedClassifiers().iterator(); i.hasNext(); ) {
			Classifier nestedClassifier = (Classifier) i.next();
			if (eClass != null && !eClass.isInstance(nestedClassifier))
				continue nestedClassifierLoop;
			if (name != null && !(ignoreCase ? name.equalsIgnoreCase(nestedClassifier.getName()) : name.equals(nestedClassifier.getName())))
				continue nestedClassifierLoop;
			return nestedClassifier;
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
			eNotify(new ENotificationImpl(this, 0, UML2Package.CLASS__NESTED_CLASSIFIER, null, newNestedClassifier));
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
		if (ownedReceptions == null) {
			ownedReceptions = new EObjectContainmentEList(Reception.class, this, UML2Package.CLASS__OWNED_RECEPTION);
		}
		return ownedReceptions;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
    public Reception getOwnedReception(String name) {
		return getOwnedReception(name, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reception getOwnedReception(String name, boolean ignoreCase) {
		ownedReceptionLoop: for (Iterator i = getOwnedReceptions().iterator(); i.hasNext(); ) {
			Reception ownedReception = (Reception) i.next();
			if (name != null && !(ignoreCase ? name.equalsIgnoreCase(ownedReception.getName()) : name.equals(ownedReception.getName())))
				continue ownedReceptionLoop;
			return ownedReception;
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
			eNotify(new ENotificationImpl(this, 0, UML2Package.CLASS__OWNED_RECEPTION, null, newOwnedReception));
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
			eNotify(new ENotificationImpl(this, 0, UML2Package.CLASS__OWNED_RECEPTION, null, newOwnedReception));
		}
		getOwnedReceptions().add(newOwnedReception);
		return newOwnedReception;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Set inherit(Set inhs) {
		return ClassOperations.inherit(this, inhs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UML2Package.CLASS__EANNOTATIONS:
				return ((InternalEList)getEAnnotations()).basicAdd(otherEnd, msgs);
			case UML2Package.CLASS__TEMPLATE_BINDING:
				return ((InternalEList)getTemplateBindings()).basicAdd(otherEnd, msgs);
			case UML2Package.CLASS__OWNED_TEMPLATE_SIGNATURE:
				if (ownedTemplateSignature != null)
					msgs = ((InternalEObject)ownedTemplateSignature).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UML2Package.CLASS__OWNED_TEMPLATE_SIGNATURE, null, msgs);
				return basicSetOwnedTemplateSignature((TemplateSignature)otherEnd, msgs);
			case UML2Package.CLASS__CLIENT_DEPENDENCY:
				return ((InternalEList)getClientDependencies()).basicAdd(otherEnd, msgs);
			case UML2Package.CLASS__OWNED_RULE:
				return ((InternalEList)getOwnedRules()).basicAdd(otherEnd, msgs);
			case UML2Package.CLASS__ELEMENT_IMPORT:
				return ((InternalEList)getElementImports()).basicAdd(otherEnd, msgs);
			case UML2Package.CLASS__PACKAGE_IMPORT:
				return ((InternalEList)getPackageImports()).basicAdd(otherEnd, msgs);
			case UML2Package.CLASS__TEMPLATE_PARAMETER:
				if (templateParameter != null)
					msgs = ((InternalEObject)templateParameter).eInverseRemove(this, UML2Package.TEMPLATE_PARAMETER__PARAMETERED_ELEMENT, TemplateParameter.class, msgs);
				return basicSetTemplateParameter((TemplateParameter)otherEnd, msgs);
			case UML2Package.CLASS__OWNING_PARAMETER:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOwningParameter((TemplateParameter)otherEnd, msgs);
			case UML2Package.CLASS__GENERALIZATION:
				return ((InternalEList)getGeneralizations()).basicAdd(otherEnd, msgs);
			case UML2Package.CLASS__SUBSTITUTION:
				return ((InternalEList)getSubstitutions()).basicAdd(otherEnd, msgs);
			case UML2Package.CLASS__POWERTYPE_EXTENT:
				return ((InternalEList)getPowertypeExtents()).basicAdd(otherEnd, msgs);
			case UML2Package.CLASS__USE_CASE:
				return ((InternalEList)getUseCases()).basicAdd(otherEnd, msgs);
			case UML2Package.CLASS__OWNED_BEHAVIOR:
				return ((InternalEList)getOwnedBehaviors()).basicAdd(otherEnd, msgs);
			case UML2Package.CLASS__IMPLEMENTATION:
				return ((InternalEList)getImplementations()).basicAdd(otherEnd, msgs);
			case UML2Package.CLASS__OWNED_STATE_MACHINE:
				return ((InternalEList)getOwnedStateMachines()).basicAdd(otherEnd, msgs);
			case UML2Package.CLASS__OWNED_OPERATION:
				return ((InternalEList)getOwnedOperations()).basicAdd(otherEnd, msgs);
		}
		return eDynamicInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UML2Package.CLASS__EANNOTATIONS:
				return ((InternalEList)getEAnnotations()).basicRemove(otherEnd, msgs);
			case UML2Package.CLASS__OWNED_COMMENT:
				return ((InternalEList)getOwnedComments()).basicRemove(otherEnd, msgs);
			case UML2Package.CLASS__TEMPLATE_BINDING:
				return ((InternalEList)getTemplateBindings()).basicRemove(otherEnd, msgs);
			case UML2Package.CLASS__OWNED_TEMPLATE_SIGNATURE:
				return basicSetOwnedTemplateSignature(null, msgs);
			case UML2Package.CLASS__CLIENT_DEPENDENCY:
				return ((InternalEList)getClientDependencies()).basicRemove(otherEnd, msgs);
			case UML2Package.CLASS__NAME_EXPRESSION:
				return basicSetNameExpression(null, msgs);
			case UML2Package.CLASS__OWNED_RULE:
				return ((InternalEList)getOwnedRules()).basicRemove(otherEnd, msgs);
			case UML2Package.CLASS__ELEMENT_IMPORT:
				return ((InternalEList)getElementImports()).basicRemove(otherEnd, msgs);
			case UML2Package.CLASS__PACKAGE_IMPORT:
				return ((InternalEList)getPackageImports()).basicRemove(otherEnd, msgs);
			case UML2Package.CLASS__TEMPLATE_PARAMETER:
				return basicSetTemplateParameter(null, msgs);
			case UML2Package.CLASS__OWNING_PARAMETER:
				return basicSetOwningParameter(null, msgs);
			case UML2Package.CLASS__GENERALIZATION:
				return ((InternalEList)getGeneralizations()).basicRemove(otherEnd, msgs);
			case UML2Package.CLASS__SUBSTITUTION:
				return ((InternalEList)getSubstitutions()).basicRemove(otherEnd, msgs);
			case UML2Package.CLASS__POWERTYPE_EXTENT:
				return ((InternalEList)getPowertypeExtents()).basicRemove(otherEnd, msgs);
			case UML2Package.CLASS__OWNED_USE_CASE:
				return ((InternalEList)getOwnedUseCases()).basicRemove(otherEnd, msgs);
			case UML2Package.CLASS__USE_CASE:
				return ((InternalEList)getUseCases()).basicRemove(otherEnd, msgs);
			case UML2Package.CLASS__OCCURRENCE:
				return ((InternalEList)getOccurrences()).basicRemove(otherEnd, msgs);
			case UML2Package.CLASS__OWNED_BEHAVIOR:
				return ((InternalEList)getOwnedBehaviors()).basicRemove(otherEnd, msgs);
			case UML2Package.CLASS__IMPLEMENTATION:
				return ((InternalEList)getImplementations()).basicRemove(otherEnd, msgs);
			case UML2Package.CLASS__OWNED_TRIGGER:
				return ((InternalEList)getOwnedTriggers()).basicRemove(otherEnd, msgs);
			case UML2Package.CLASS__OWNED_STATE_MACHINE:
				return ((InternalEList)getOwnedStateMachines()).basicRemove(otherEnd, msgs);
			case UML2Package.CLASS__OWNED_ATTRIBUTE:
				return ((InternalEList)getOwnedAttributes()).basicRemove(otherEnd, msgs);
			case UML2Package.CLASS__OWNED_CONNECTOR:
				return ((InternalEList)getOwnedConnectors()).basicRemove(otherEnd, msgs);
			case UML2Package.CLASS__OWNED_PORT:
				return ((InternalEList)getOwnedPorts()).basicRemove(otherEnd, msgs);
			case UML2Package.CLASS__OWNED_OPERATION:
				return ((InternalEList)getOwnedOperations()).basicRemove(otherEnd, msgs);
			case UML2Package.CLASS__NESTED_CLASSIFIER:
				return ((InternalEList)getNestedClassifiers()).basicRemove(otherEnd, msgs);
			case UML2Package.CLASS__OWNED_RECEPTION:
				return ((InternalEList)getOwnedReceptions()).basicRemove(otherEnd, msgs);
		}
		return eDynamicInverseRemove(otherEnd, featureID, msgs);
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
		if (newIsAbstract) eFlags |= IS_ABSTRACT_EFLAG; else eFlags &= ~IS_ABSTRACT_EFLAG;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2Package.CLASS__IS_ABSTRACT, oldIsAbstract, newIsAbstract));


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

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UML2Package.CLASS__EANNOTATIONS:
				return getEAnnotations();
			case UML2Package.CLASS__OWNED_ELEMENT:
				return getOwnedElements();
			case UML2Package.CLASS__OWNER:
				if (resolve) return getOwner();
				return basicGetOwner();
			case UML2Package.CLASS__OWNED_COMMENT:
				return getOwnedComments();
			case UML2Package.CLASS__TEMPLATE_BINDING:
				return getTemplateBindings();
			case UML2Package.CLASS__OWNED_TEMPLATE_SIGNATURE:
				return getOwnedTemplateSignature();
			case UML2Package.CLASS__NAME:
				return getName();
			case UML2Package.CLASS__QUALIFIED_NAME:
				return getQualifiedName();
			case UML2Package.CLASS__VISIBILITY:
				return getVisibility();
			case UML2Package.CLASS__CLIENT_DEPENDENCY:
				return getClientDependencies();
			case UML2Package.CLASS__NAME_EXPRESSION:
				return getNameExpression();
			case UML2Package.CLASS__MEMBER:
				return getMembers();
			case UML2Package.CLASS__OWNED_RULE:
				return getOwnedRules();
			case UML2Package.CLASS__IMPORTED_MEMBER:
				return getImportedMembers();
			case UML2Package.CLASS__ELEMENT_IMPORT:
				return getElementImports();
			case UML2Package.CLASS__PACKAGE_IMPORT:
				return getPackageImports();
			case UML2Package.CLASS__TEMPLATE_PARAMETER:
				if (resolve) return getTemplateParameter();
				return basicGetTemplateParameter();
			case UML2Package.CLASS__OWNING_PARAMETER:
				return getOwningParameter();
			case UML2Package.CLASS__PACKAGEABLE_ELEMENT_VISIBILITY:
				return getPackageableElement_visibility();
			case UML2Package.CLASS__PACKAGE:
				return getPackage();
			case UML2Package.CLASS__REDEFINITION_CONTEXT:
				return getRedefinitionContexts();
			case UML2Package.CLASS__IS_LEAF:
				return isLeaf() ? Boolean.TRUE : Boolean.FALSE;
			case UML2Package.CLASS__FEATURE:
				return getFeatures();
			case UML2Package.CLASS__IS_ABSTRACT:
				return isAbstract() ? Boolean.TRUE : Boolean.FALSE;
			case UML2Package.CLASS__INHERITED_MEMBER:
				return getInheritedMembers();
			case UML2Package.CLASS__GENERAL:
				return getGenerals();
			case UML2Package.CLASS__GENERALIZATION:
				return getGeneralizations();
			case UML2Package.CLASS__ATTRIBUTE:
				return getAttributes();
			case UML2Package.CLASS__REDEFINED_CLASSIFIER:
				return getRedefinedClassifiers();
			case UML2Package.CLASS__SUBSTITUTION:
				return getSubstitutions();
			case UML2Package.CLASS__POWERTYPE_EXTENT:
				return getPowertypeExtents();
			case UML2Package.CLASS__OWNED_USE_CASE:
				return getOwnedUseCases();
			case UML2Package.CLASS__USE_CASE:
				return getUseCases();
			case UML2Package.CLASS__REPRESENTATION:
				return getRepresentation();
			case UML2Package.CLASS__OCCURRENCE:
				return getOccurrences();
			case UML2Package.CLASS__OWNED_BEHAVIOR:
				return getOwnedBehaviors();
			case UML2Package.CLASS__CLASSIFIER_BEHAVIOR:
				return getClassifierBehavior();
			case UML2Package.CLASS__IMPLEMENTATION:
				return getImplementations();
			case UML2Package.CLASS__OWNED_TRIGGER:
				return getOwnedTriggers();
			case UML2Package.CLASS__OWNED_STATE_MACHINE:
				return getOwnedStateMachines();
			case UML2Package.CLASS__OWNED_ATTRIBUTE:
				return getOwnedAttributes();
			case UML2Package.CLASS__PART:
				return getParts();
			case UML2Package.CLASS__ROLE:
				return getRoles();
			case UML2Package.CLASS__OWNED_CONNECTOR:
				return getOwnedConnectors();
			case UML2Package.CLASS__OWNED_PORT:
				return getOwnedPorts();
			case UML2Package.CLASS__OWNED_OPERATION:
				return getOwnedOperations();
			case UML2Package.CLASS__SUPER_CLASS:
				return getSuperClasses();
			case UML2Package.CLASS__EXTENSION:
				return getExtensions();
			case UML2Package.CLASS__NESTED_CLASSIFIER:
				return getNestedClassifiers();
			case UML2Package.CLASS__IS_ACTIVE:
				return isActive() ? Boolean.TRUE : Boolean.FALSE;
			case UML2Package.CLASS__OWNED_RECEPTION:
				return getOwnedReceptions();
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
			case UML2Package.CLASS__EANNOTATIONS:
				getEAnnotations().clear();
				getEAnnotations().addAll((Collection)newValue);
				return;
			case UML2Package.CLASS__OWNED_COMMENT:
				getOwnedComments().clear();
				getOwnedComments().addAll((Collection)newValue);
				return;
			case UML2Package.CLASS__TEMPLATE_BINDING:
				getTemplateBindings().clear();
				getTemplateBindings().addAll((Collection)newValue);
				return;
			case UML2Package.CLASS__OWNED_TEMPLATE_SIGNATURE:
				setOwnedTemplateSignature((TemplateSignature)newValue);
				return;
			case UML2Package.CLASS__NAME:
				setName((String)newValue);
				return;
			case UML2Package.CLASS__VISIBILITY:
				setVisibility((VisibilityKind)newValue);
				return;
			case UML2Package.CLASS__CLIENT_DEPENDENCY:
				getClientDependencies().clear();
				getClientDependencies().addAll((Collection)newValue);
				return;
			case UML2Package.CLASS__NAME_EXPRESSION:
				setNameExpression((StringExpression)newValue);
				return;
			case UML2Package.CLASS__OWNED_RULE:
				getOwnedRules().clear();
				getOwnedRules().addAll((Collection)newValue);
				return;
			case UML2Package.CLASS__ELEMENT_IMPORT:
				getElementImports().clear();
				getElementImports().addAll((Collection)newValue);
				return;
			case UML2Package.CLASS__PACKAGE_IMPORT:
				getPackageImports().clear();
				getPackageImports().addAll((Collection)newValue);
				return;
			case UML2Package.CLASS__TEMPLATE_PARAMETER:
				setTemplateParameter((TemplateParameter)newValue);
				return;
			case UML2Package.CLASS__OWNING_PARAMETER:
				setOwningParameter((TemplateParameter)newValue);
				return;
			case UML2Package.CLASS__PACKAGEABLE_ELEMENT_VISIBILITY:
				setPackageableElement_visibility((VisibilityKind)newValue);
				return;
			case UML2Package.CLASS__IS_LEAF:
				setIsLeaf(((Boolean)newValue).booleanValue());
				return;
			case UML2Package.CLASS__IS_ABSTRACT:
				setIsAbstract(((Boolean)newValue).booleanValue());
				return;
			case UML2Package.CLASS__GENERALIZATION:
				getGeneralizations().clear();
				getGeneralizations().addAll((Collection)newValue);
				return;
			case UML2Package.CLASS__REDEFINED_CLASSIFIER:
				getRedefinedClassifiers().clear();
				getRedefinedClassifiers().addAll((Collection)newValue);
				return;
			case UML2Package.CLASS__SUBSTITUTION:
				getSubstitutions().clear();
				getSubstitutions().addAll((Collection)newValue);
				return;
			case UML2Package.CLASS__POWERTYPE_EXTENT:
				getPowertypeExtents().clear();
				getPowertypeExtents().addAll((Collection)newValue);
				return;
			case UML2Package.CLASS__OWNED_USE_CASE:
				getOwnedUseCases().clear();
				getOwnedUseCases().addAll((Collection)newValue);
				return;
			case UML2Package.CLASS__USE_CASE:
				getUseCases().clear();
				getUseCases().addAll((Collection)newValue);
				return;
			case UML2Package.CLASS__REPRESENTATION:
				setRepresentation((CollaborationOccurrence)newValue);
				return;
			case UML2Package.CLASS__OCCURRENCE:
				getOccurrences().clear();
				getOccurrences().addAll((Collection)newValue);
				return;
			case UML2Package.CLASS__OWNED_BEHAVIOR:
				getOwnedBehaviors().clear();
				getOwnedBehaviors().addAll((Collection)newValue);
				return;
			case UML2Package.CLASS__CLASSIFIER_BEHAVIOR:
				setClassifierBehavior((Behavior)newValue);
				return;
			case UML2Package.CLASS__IMPLEMENTATION:
				getImplementations().clear();
				getImplementations().addAll((Collection)newValue);
				return;
			case UML2Package.CLASS__OWNED_TRIGGER:
				getOwnedTriggers().clear();
				getOwnedTriggers().addAll((Collection)newValue);
				return;
			case UML2Package.CLASS__OWNED_STATE_MACHINE:
				getOwnedStateMachines().clear();
				getOwnedStateMachines().addAll((Collection)newValue);
				return;
			case UML2Package.CLASS__OWNED_ATTRIBUTE:
				getOwnedAttributes().clear();
				getOwnedAttributes().addAll((Collection)newValue);
				return;
			case UML2Package.CLASS__OWNED_CONNECTOR:
				getOwnedConnectors().clear();
				getOwnedConnectors().addAll((Collection)newValue);
				return;
			case UML2Package.CLASS__OWNED_PORT:
				getOwnedPorts().clear();
				getOwnedPorts().addAll((Collection)newValue);
				return;
			case UML2Package.CLASS__OWNED_OPERATION:
				getOwnedOperations().clear();
				getOwnedOperations().addAll((Collection)newValue);
				return;
			case UML2Package.CLASS__NESTED_CLASSIFIER:
				getNestedClassifiers().clear();
				getNestedClassifiers().addAll((Collection)newValue);
				return;
			case UML2Package.CLASS__IS_ACTIVE:
				setIsActive(((Boolean)newValue).booleanValue());
				return;
			case UML2Package.CLASS__OWNED_RECEPTION:
				getOwnedReceptions().clear();
				getOwnedReceptions().addAll((Collection)newValue);
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
			case UML2Package.CLASS__EANNOTATIONS:
				getEAnnotations().clear();
				return;
			case UML2Package.CLASS__OWNED_COMMENT:
				getOwnedComments().clear();
				return;
			case UML2Package.CLASS__TEMPLATE_BINDING:
				getTemplateBindings().clear();
				return;
			case UML2Package.CLASS__OWNED_TEMPLATE_SIGNATURE:
				setOwnedTemplateSignature((TemplateSignature)null);
				return;
			case UML2Package.CLASS__NAME:
				setName(NAME_EDEFAULT);
				return;
			case UML2Package.CLASS__VISIBILITY:
				setVisibility(VISIBILITY_EDEFAULT);
				return;
			case UML2Package.CLASS__CLIENT_DEPENDENCY:
				getClientDependencies().clear();
				return;
			case UML2Package.CLASS__NAME_EXPRESSION:
				setNameExpression((StringExpression)null);
				return;
			case UML2Package.CLASS__OWNED_RULE:
				getOwnedRules().clear();
				return;
			case UML2Package.CLASS__ELEMENT_IMPORT:
				getElementImports().clear();
				return;
			case UML2Package.CLASS__PACKAGE_IMPORT:
				getPackageImports().clear();
				return;
			case UML2Package.CLASS__TEMPLATE_PARAMETER:
				setTemplateParameter((TemplateParameter)null);
				return;
			case UML2Package.CLASS__OWNING_PARAMETER:
				setOwningParameter((TemplateParameter)null);
				return;
			case UML2Package.CLASS__PACKAGEABLE_ELEMENT_VISIBILITY:
				setPackageableElement_visibility(PACKAGEABLE_ELEMENT_VISIBILITY_EDEFAULT);
				return;
			case UML2Package.CLASS__IS_LEAF:
				setIsLeaf(IS_LEAF_EDEFAULT);
				return;
			case UML2Package.CLASS__IS_ABSTRACT:
				setIsAbstract(IS_ABSTRACT_EDEFAULT);
				return;
			case UML2Package.CLASS__GENERALIZATION:
				getGeneralizations().clear();
				return;
			case UML2Package.CLASS__REDEFINED_CLASSIFIER:
				getRedefinedClassifiers().clear();
				return;
			case UML2Package.CLASS__SUBSTITUTION:
				getSubstitutions().clear();
				return;
			case UML2Package.CLASS__POWERTYPE_EXTENT:
				getPowertypeExtents().clear();
				return;
			case UML2Package.CLASS__OWNED_USE_CASE:
				getOwnedUseCases().clear();
				return;
			case UML2Package.CLASS__USE_CASE:
				getUseCases().clear();
				return;
			case UML2Package.CLASS__REPRESENTATION:
				setRepresentation((CollaborationOccurrence)null);
				return;
			case UML2Package.CLASS__OCCURRENCE:
				getOccurrences().clear();
				return;
			case UML2Package.CLASS__OWNED_BEHAVIOR:
				getOwnedBehaviors().clear();
				return;
			case UML2Package.CLASS__CLASSIFIER_BEHAVIOR:
				setClassifierBehavior((Behavior)null);
				return;
			case UML2Package.CLASS__IMPLEMENTATION:
				getImplementations().clear();
				return;
			case UML2Package.CLASS__OWNED_TRIGGER:
				getOwnedTriggers().clear();
				return;
			case UML2Package.CLASS__OWNED_STATE_MACHINE:
				getOwnedStateMachines().clear();
				return;
			case UML2Package.CLASS__OWNED_ATTRIBUTE:
				getOwnedAttributes().clear();
				return;
			case UML2Package.CLASS__OWNED_CONNECTOR:
				getOwnedConnectors().clear();
				return;
			case UML2Package.CLASS__OWNED_PORT:
				getOwnedPorts().clear();
				return;
			case UML2Package.CLASS__OWNED_OPERATION:
				getOwnedOperations().clear();
				return;
			case UML2Package.CLASS__NESTED_CLASSIFIER:
				getNestedClassifiers().clear();
				return;
			case UML2Package.CLASS__IS_ACTIVE:
				setIsActive(IS_ACTIVE_EDEFAULT);
				return;
			case UML2Package.CLASS__OWNED_RECEPTION:
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
			case UML2Package.CLASS__EANNOTATIONS:
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UML2Package.CLASS__OWNED_ELEMENT:
				return isSetOwnedElements();
			case UML2Package.CLASS__OWNER:
				return isSetOwner();
			case UML2Package.CLASS__OWNED_COMMENT:
				return ownedComments != null && !ownedComments.isEmpty();
			case UML2Package.CLASS__TEMPLATE_BINDING:
				return templateBindings != null && !templateBindings.isEmpty();
			case UML2Package.CLASS__OWNED_TEMPLATE_SIGNATURE:
				return ownedTemplateSignature != null;
			case UML2Package.CLASS__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case UML2Package.CLASS__QUALIFIED_NAME:
				return QUALIFIED_NAME_EDEFAULT == null ? getQualifiedName() != null : !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case UML2Package.CLASS__VISIBILITY:
				return isSetVisibility();
			case UML2Package.CLASS__CLIENT_DEPENDENCY:
				return clientDependencies != null && !clientDependencies.isEmpty();
			case UML2Package.CLASS__NAME_EXPRESSION:
				return nameExpression != null;
			case UML2Package.CLASS__MEMBER:
				return isSetMembers();
			case UML2Package.CLASS__OWNED_RULE:
				return ownedRules != null && !ownedRules.isEmpty();
			case UML2Package.CLASS__IMPORTED_MEMBER:
				return !getImportedMembers().isEmpty();
			case UML2Package.CLASS__ELEMENT_IMPORT:
				return elementImports != null && !elementImports.isEmpty();
			case UML2Package.CLASS__PACKAGE_IMPORT:
				return packageImports != null && !packageImports.isEmpty();
			case UML2Package.CLASS__TEMPLATE_PARAMETER:
				return templateParameter != null;
			case UML2Package.CLASS__OWNING_PARAMETER:
				return getOwningParameter() != null;
			case UML2Package.CLASS__PACKAGEABLE_ELEMENT_VISIBILITY:
				return isSetPackageableElement_visibility();
			case UML2Package.CLASS__PACKAGE:
				return getPackage() != null;
			case UML2Package.CLASS__REDEFINITION_CONTEXT:
				return isSetRedefinitionContexts();
			case UML2Package.CLASS__IS_LEAF:
				return ((eFlags & IS_LEAF_EFLAG) != 0) != IS_LEAF_EDEFAULT;
			case UML2Package.CLASS__FEATURE:
				return isSetFeatures();
			case UML2Package.CLASS__IS_ABSTRACT:
				return isSetIsAbstract();
			case UML2Package.CLASS__INHERITED_MEMBER:
				return !getInheritedMembers().isEmpty();
			case UML2Package.CLASS__GENERAL:
				return isSetGenerals();
			case UML2Package.CLASS__GENERALIZATION:
				return generalizations != null && !generalizations.isEmpty();
			case UML2Package.CLASS__ATTRIBUTE:
				return isSetAttributes();
			case UML2Package.CLASS__REDEFINED_CLASSIFIER:
				return redefinedClassifiers != null && !redefinedClassifiers.isEmpty();
			case UML2Package.CLASS__SUBSTITUTION:
				return substitutions != null && !substitutions.isEmpty();
			case UML2Package.CLASS__POWERTYPE_EXTENT:
				return powertypeExtents != null && !powertypeExtents.isEmpty();
			case UML2Package.CLASS__OWNED_USE_CASE:
				return ownedUseCases != null && !ownedUseCases.isEmpty();
			case UML2Package.CLASS__USE_CASE:
				return useCases != null && !useCases.isEmpty();
			case UML2Package.CLASS__REPRESENTATION:
				return representation != null;
			case UML2Package.CLASS__OCCURRENCE:
				return occurrences != null && !occurrences.isEmpty();
			case UML2Package.CLASS__OWNED_BEHAVIOR:
				return isSetOwnedBehaviors();
			case UML2Package.CLASS__CLASSIFIER_BEHAVIOR:
				return classifierBehavior != null;
			case UML2Package.CLASS__IMPLEMENTATION:
				return implementations != null && !implementations.isEmpty();
			case UML2Package.CLASS__OWNED_TRIGGER:
				return ownedTriggers != null && !ownedTriggers.isEmpty();
			case UML2Package.CLASS__OWNED_STATE_MACHINE:
				return isSetOwnedStateMachines();
			case UML2Package.CLASS__OWNED_ATTRIBUTE:
				return isSetOwnedAttributes();
			case UML2Package.CLASS__PART:
				return !getParts().isEmpty();
			case UML2Package.CLASS__ROLE:
				return isSetRoles();
			case UML2Package.CLASS__OWNED_CONNECTOR:
				return ownedConnectors != null && !ownedConnectors.isEmpty();
			case UML2Package.CLASS__OWNED_PORT:
				return ownedPorts != null && !ownedPorts.isEmpty();
			case UML2Package.CLASS__OWNED_OPERATION:
				return ownedOperations != null && !ownedOperations.isEmpty();
			case UML2Package.CLASS__SUPER_CLASS:
				return isSetSuperClasses();
			case UML2Package.CLASS__EXTENSION:
				return !getExtensions().isEmpty();
			case UML2Package.CLASS__NESTED_CLASSIFIER:
				return nestedClassifiers != null && !nestedClassifiers.isEmpty();
			case UML2Package.CLASS__IS_ACTIVE:
				return ((eFlags & IS_ACTIVE_EFLAG) != 0) != IS_ACTIVE_EDEFAULT;
			case UML2Package.CLASS__OWNED_RECEPTION:
				return ownedReceptions != null && !ownedReceptions.isEmpty();
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
				case UML2Package.CLASS__OWNED_ATTRIBUTE: return UML2Package.STRUCTURED_CLASSIFIER__OWNED_ATTRIBUTE;
				case UML2Package.CLASS__PART: return UML2Package.STRUCTURED_CLASSIFIER__PART;
				case UML2Package.CLASS__ROLE: return UML2Package.STRUCTURED_CLASSIFIER__ROLE;
				case UML2Package.CLASS__OWNED_CONNECTOR: return UML2Package.STRUCTURED_CLASSIFIER__OWNED_CONNECTOR;
				default: return -1;
			}
		}
		if (baseClass == EncapsulatedClassifier.class) {
			switch (derivedFeatureID) {
				case UML2Package.CLASS__OWNED_PORT: return UML2Package.ENCAPSULATED_CLASSIFIER__OWNED_PORT;
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
				case UML2Package.STRUCTURED_CLASSIFIER__OWNED_ATTRIBUTE: return UML2Package.CLASS__OWNED_ATTRIBUTE;
				case UML2Package.STRUCTURED_CLASSIFIER__PART: return UML2Package.CLASS__PART;
				case UML2Package.STRUCTURED_CLASSIFIER__ROLE: return UML2Package.CLASS__ROLE;
				case UML2Package.STRUCTURED_CLASSIFIER__OWNED_CONNECTOR: return UML2Package.CLASS__OWNED_CONNECTOR;
				default: return -1;
			}
		}
		if (baseClass == EncapsulatedClassifier.class) {
			switch (baseFeatureID) {
				case UML2Package.ENCAPSULATED_CLASSIFIER__OWNED_PORT: return UML2Package.CLASS__OWNED_PORT;
				default: return -1;
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
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (isActive: "); //$NON-NLS-1$
		result.append((eFlags & IS_ACTIVE_EFLAG) != 0);
		result.append(", isAbstract: "); //$NON-NLS-1$
		result.append((eFlags & IS_ABSTRACT_EFLAG) != 0);
		result.append(')');
		return result.toString();
	}


	// <!-- begin-custom-operations -->

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.uml2.Class#isMetaclass()
	 */
	public boolean isMetaclass() {
		return ClassOperations.isMetaclass(this);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.uml2.Class#createOwnedAttribute(java.lang.String,
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
	 * @see org.eclipse.uml2.Class#createOwnedOperation(java.lang.String,
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
			GET_ALL_OPERATIONS = ClassImpl.class.getMethod(
				"getAllOperations", null); //$NON-NLS-1$
		} catch (Exception e) {
			// ignore
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.uml2.Class#getAllOperations()
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

} //ClassImpl
