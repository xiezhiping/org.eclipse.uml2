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
 * $Id: ConnectorImpl.java,v 1.23 2006/04/10 20:40:16 khussey Exp $
 */
package org.eclipse.uml2.impl;

import java.util.Collection;
import java.util.Iterator;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.uml2.Association;
import org.eclipse.uml2.Behavior;
import org.eclipse.uml2.Connector;
import org.eclipse.uml2.ConnectorEnd;
import org.eclipse.uml2.ConnectorKind;
import org.eclipse.uml2.Element;
import org.eclipse.uml2.StringExpression;
import org.eclipse.uml2.TemplateSignature;
import org.eclipse.uml2.UML2Factory;
import org.eclipse.uml2.UML2Package;
import org.eclipse.uml2.VisibilityKind;

import org.eclipse.uml2.common.util.CacheAdapter;
import org.eclipse.uml2.common.util.DerivedUnionEObjectEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Connector</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2.impl.ConnectorImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.ConnectorImpl#getRedefinedConnectors <em>Redefined Connector</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.ConnectorImpl#getEnds <em>End</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.ConnectorImpl#getKind <em>Kind</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.ConnectorImpl#getContracts <em>Contract</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConnectorImpl extends FeatureImpl implements Connector {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) IBM Corporation and others."; //$NON-NLS-1$

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected Association type = null;

	/**
	 * The cached value of the '{@link #getRedefinedConnectors() <em>Redefined Connector</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRedefinedConnectors()
	 * @generated
	 * @ordered
	 */
	protected EList redefinedConnectors = null;

	/**
	 * The cached value of the '{@link #getEnds() <em>End</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnds()
	 * @generated
	 * @ordered
	 */
	protected EList ends = null;

	/**
	 * The default value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected static final ConnectorKind KIND_EDEFAULT = ConnectorKind.ASSEMBLY_LITERAL;

	/**
	 * The cached value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected ConnectorKind kind = KIND_EDEFAULT;

	/**
	 * The cached value of the '{@link #getContracts() <em>Contract</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContracts()
	 * @generated
	 * @ordered
	 */
	protected EList contracts = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConnectorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return UML2Package.Literals.CONNECTOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getOwnedElements() {
		CacheAdapter cache = getCacheAdapter();
		if (cache != null) {
			Resource eResource = eResource();
			EList ownedElements = (EList) cache.get(eResource, this, UML2Package.Literals.ELEMENT__OWNED_ELEMENT);
			if (ownedElements == null) {
				cache.put(eResource, this, UML2Package.Literals.ELEMENT__OWNED_ELEMENT, ownedElements = new DerivedUnionEObjectEList(Element.class, this, UML2Package.CONNECTOR__OWNED_ELEMENT, OWNED_ELEMENT_ESUBSETS));
			}
			return ownedElements;
		}
		return new DerivedUnionEObjectEList(Element.class, this, UML2Package.CONNECTOR__OWNED_ELEMENT, OWNED_ELEMENT_ESUBSETS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOwnedElements() {
		return super.isSetOwnedElements()
			|| eIsSet(UML2Package.CONNECTOR__END);
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectorKind getKind() {
		return kind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKind(ConnectorKind newKind) {
		ConnectorKind oldKind = kind;
		kind = newKind == null ? KIND_EDEFAULT : newKind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2Package.CONNECTOR__KIND, oldKind, kind));


	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Association getType() {
		if (type != null && type.eIsProxy()) {
			InternalEObject oldType = (InternalEObject)type;
			type = (Association)eResolveProxy(oldType);
			if (type != oldType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UML2Package.CONNECTOR__TYPE, oldType, type));
			}
		}
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Association basicGetType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(Association newType) {
		Association oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2Package.CONNECTOR__TYPE, oldType, type));


	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getRedefinedConnectors() {
		if (redefinedConnectors == null) {
			redefinedConnectors = new EObjectResolvingEList(Connector.class, this, UML2Package.CONNECTOR__REDEFINED_CONNECTOR);
		}
		return redefinedConnectors;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
    public Connector getRedefinedConnector(String name) {
		return getRedefinedConnector(name, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Connector getRedefinedConnector(String name, boolean ignoreCase) {
		redefinedConnectorLoop: for (Iterator i = getRedefinedConnectors().iterator(); i.hasNext(); ) {
			Connector redefinedConnector = (Connector) i.next();
			if (name != null && !(ignoreCase ? name.equalsIgnoreCase(redefinedConnector.getName()) : name.equals(redefinedConnector.getName())))
				continue redefinedConnectorLoop;
			return redefinedConnector;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getEnds() {
		if (ends == null) {
			ends = new EObjectContainmentEList(ConnectorEnd.class, this, UML2Package.CONNECTOR__END);
		}
		return ends;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 * @deprecated Use #createEnd() instead.
	 */
	public ConnectorEnd createEnd(EClass eClass) {
		ConnectorEnd newEnd = (ConnectorEnd) eClass.getEPackage().getEFactoryInstance().create(eClass);
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, 0, UML2Package.CONNECTOR__END, null, newEnd));
		}
		getEnds().add(newEnd);
		return newEnd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public ConnectorEnd createEnd() {
		ConnectorEnd newEnd = UML2Factory.eINSTANCE.createConnectorEnd();
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, 0, UML2Package.CONNECTOR__END, null, newEnd));
		}
		getEnds().add(newEnd);
		return newEnd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getContracts() {
		if (contracts == null) {
			contracts = new EObjectResolvingEList(Behavior.class, this, UML2Package.CONNECTOR__CONTRACT);
		}
		return contracts;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
    public Behavior getContract(String name) {
		return getContract(name, false, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Behavior getContract(String name, boolean ignoreCase, EClass eClass) {
		contractLoop: for (Iterator i = getContracts().iterator(); i.hasNext(); ) {
			Behavior contract = (Behavior) i.next();
			if (eClass != null && !eClass.isInstance(contract))
				continue contractLoop;
			if (name != null && !(ignoreCase ? name.equalsIgnoreCase(contract.getName()) : name.equals(contract.getName())))
				continue contractLoop;
			return contract;
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
			case UML2Package.CONNECTOR__EANNOTATIONS:
				return ((InternalEList)getEAnnotations()).basicRemove(otherEnd, msgs);
			case UML2Package.CONNECTOR__OWNED_COMMENT:
				return ((InternalEList)getOwnedComments()).basicRemove(otherEnd, msgs);
			case UML2Package.CONNECTOR__TEMPLATE_BINDING:
				return ((InternalEList)getTemplateBindings()).basicRemove(otherEnd, msgs);
			case UML2Package.CONNECTOR__OWNED_TEMPLATE_SIGNATURE:
				return basicSetOwnedTemplateSignature(null, msgs);
			case UML2Package.CONNECTOR__CLIENT_DEPENDENCY:
				return ((InternalEList)getClientDependencies()).basicRemove(otherEnd, msgs);
			case UML2Package.CONNECTOR__NAME_EXPRESSION:
				return basicSetNameExpression(null, msgs);
			case UML2Package.CONNECTOR__END:
				return ((InternalEList)getEnds()).basicRemove(otherEnd, msgs);
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
			case UML2Package.CONNECTOR__EANNOTATIONS:
				return getEAnnotations();
			case UML2Package.CONNECTOR__OWNED_ELEMENT:
				return getOwnedElements();
			case UML2Package.CONNECTOR__OWNER:
				if (resolve) return getOwner();
				return basicGetOwner();
			case UML2Package.CONNECTOR__OWNED_COMMENT:
				return getOwnedComments();
			case UML2Package.CONNECTOR__TEMPLATE_BINDING:
				return getTemplateBindings();
			case UML2Package.CONNECTOR__OWNED_TEMPLATE_SIGNATURE:
				return getOwnedTemplateSignature();
			case UML2Package.CONNECTOR__NAME:
				return getName();
			case UML2Package.CONNECTOR__QUALIFIED_NAME:
				return getQualifiedName();
			case UML2Package.CONNECTOR__VISIBILITY:
				return getVisibility();
			case UML2Package.CONNECTOR__CLIENT_DEPENDENCY:
				return getClientDependencies();
			case UML2Package.CONNECTOR__NAME_EXPRESSION:
				return getNameExpression();
			case UML2Package.CONNECTOR__REDEFINITION_CONTEXT:
				return getRedefinitionContexts();
			case UML2Package.CONNECTOR__IS_LEAF:
				return isLeaf() ? Boolean.TRUE : Boolean.FALSE;
			case UML2Package.CONNECTOR__FEATURING_CLASSIFIER:
				return getFeaturingClassifiers();
			case UML2Package.CONNECTOR__IS_STATIC:
				return isStatic() ? Boolean.TRUE : Boolean.FALSE;
			case UML2Package.CONNECTOR__TYPE:
				if (resolve) return getType();
				return basicGetType();
			case UML2Package.CONNECTOR__REDEFINED_CONNECTOR:
				return getRedefinedConnectors();
			case UML2Package.CONNECTOR__END:
				return getEnds();
			case UML2Package.CONNECTOR__KIND:
				return getKind();
			case UML2Package.CONNECTOR__CONTRACT:
				return getContracts();
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
			case UML2Package.CONNECTOR__EANNOTATIONS:
				getEAnnotations().clear();
				getEAnnotations().addAll((Collection)newValue);
				return;
			case UML2Package.CONNECTOR__OWNED_COMMENT:
				getOwnedComments().clear();
				getOwnedComments().addAll((Collection)newValue);
				return;
			case UML2Package.CONNECTOR__TEMPLATE_BINDING:
				getTemplateBindings().clear();
				getTemplateBindings().addAll((Collection)newValue);
				return;
			case UML2Package.CONNECTOR__OWNED_TEMPLATE_SIGNATURE:
				setOwnedTemplateSignature((TemplateSignature)newValue);
				return;
			case UML2Package.CONNECTOR__NAME:
				setName((String)newValue);
				return;
			case UML2Package.CONNECTOR__VISIBILITY:
				setVisibility((VisibilityKind)newValue);
				return;
			case UML2Package.CONNECTOR__CLIENT_DEPENDENCY:
				getClientDependencies().clear();
				getClientDependencies().addAll((Collection)newValue);
				return;
			case UML2Package.CONNECTOR__NAME_EXPRESSION:
				setNameExpression((StringExpression)newValue);
				return;
			case UML2Package.CONNECTOR__IS_LEAF:
				setIsLeaf(((Boolean)newValue).booleanValue());
				return;
			case UML2Package.CONNECTOR__IS_STATIC:
				setIsStatic(((Boolean)newValue).booleanValue());
				return;
			case UML2Package.CONNECTOR__TYPE:
				setType((Association)newValue);
				return;
			case UML2Package.CONNECTOR__REDEFINED_CONNECTOR:
				getRedefinedConnectors().clear();
				getRedefinedConnectors().addAll((Collection)newValue);
				return;
			case UML2Package.CONNECTOR__END:
				getEnds().clear();
				getEnds().addAll((Collection)newValue);
				return;
			case UML2Package.CONNECTOR__KIND:
				setKind((ConnectorKind)newValue);
				return;
			case UML2Package.CONNECTOR__CONTRACT:
				getContracts().clear();
				getContracts().addAll((Collection)newValue);
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
			case UML2Package.CONNECTOR__EANNOTATIONS:
				getEAnnotations().clear();
				return;
			case UML2Package.CONNECTOR__OWNED_COMMENT:
				getOwnedComments().clear();
				return;
			case UML2Package.CONNECTOR__TEMPLATE_BINDING:
				getTemplateBindings().clear();
				return;
			case UML2Package.CONNECTOR__OWNED_TEMPLATE_SIGNATURE:
				setOwnedTemplateSignature((TemplateSignature)null);
				return;
			case UML2Package.CONNECTOR__NAME:
				setName(NAME_EDEFAULT);
				return;
			case UML2Package.CONNECTOR__VISIBILITY:
				setVisibility(VISIBILITY_EDEFAULT);
				return;
			case UML2Package.CONNECTOR__CLIENT_DEPENDENCY:
				getClientDependencies().clear();
				return;
			case UML2Package.CONNECTOR__NAME_EXPRESSION:
				setNameExpression((StringExpression)null);
				return;
			case UML2Package.CONNECTOR__IS_LEAF:
				setIsLeaf(IS_LEAF_EDEFAULT);
				return;
			case UML2Package.CONNECTOR__IS_STATIC:
				setIsStatic(IS_STATIC_EDEFAULT);
				return;
			case UML2Package.CONNECTOR__TYPE:
				setType((Association)null);
				return;
			case UML2Package.CONNECTOR__REDEFINED_CONNECTOR:
				getRedefinedConnectors().clear();
				return;
			case UML2Package.CONNECTOR__END:
				getEnds().clear();
				return;
			case UML2Package.CONNECTOR__KIND:
				setKind(KIND_EDEFAULT);
				return;
			case UML2Package.CONNECTOR__CONTRACT:
				getContracts().clear();
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
			case UML2Package.CONNECTOR__EANNOTATIONS:
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UML2Package.CONNECTOR__OWNED_ELEMENT:
				return isSetOwnedElements();
			case UML2Package.CONNECTOR__OWNER:
				return isSetOwner();
			case UML2Package.CONNECTOR__OWNED_COMMENT:
				return ownedComments != null && !ownedComments.isEmpty();
			case UML2Package.CONNECTOR__TEMPLATE_BINDING:
				return templateBindings != null && !templateBindings.isEmpty();
			case UML2Package.CONNECTOR__OWNED_TEMPLATE_SIGNATURE:
				return ownedTemplateSignature != null;
			case UML2Package.CONNECTOR__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case UML2Package.CONNECTOR__QUALIFIED_NAME:
				return QUALIFIED_NAME_EDEFAULT == null ? getQualifiedName() != null : !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case UML2Package.CONNECTOR__VISIBILITY:
				return visibility != VISIBILITY_EDEFAULT;
			case UML2Package.CONNECTOR__CLIENT_DEPENDENCY:
				return clientDependencies != null && !clientDependencies.isEmpty();
			case UML2Package.CONNECTOR__NAME_EXPRESSION:
				return nameExpression != null;
			case UML2Package.CONNECTOR__REDEFINITION_CONTEXT:
				return isSetRedefinitionContexts();
			case UML2Package.CONNECTOR__IS_LEAF:
				return ((eFlags & IS_LEAF_EFLAG) != 0) != IS_LEAF_EDEFAULT;
			case UML2Package.CONNECTOR__FEATURING_CLASSIFIER:
				return isSetFeaturingClassifiers();
			case UML2Package.CONNECTOR__IS_STATIC:
				return ((eFlags & IS_STATIC_EFLAG) != 0) != IS_STATIC_EDEFAULT;
			case UML2Package.CONNECTOR__TYPE:
				return type != null;
			case UML2Package.CONNECTOR__REDEFINED_CONNECTOR:
				return redefinedConnectors != null && !redefinedConnectors.isEmpty();
			case UML2Package.CONNECTOR__END:
				return ends != null && !ends.isEmpty();
			case UML2Package.CONNECTOR__KIND:
				return kind != KIND_EDEFAULT;
			case UML2Package.CONNECTOR__CONTRACT:
				return contracts != null && !contracts.isEmpty();
		}
		return eDynamicIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (kind: "); //$NON-NLS-1$
		result.append(kind);
		result.append(')');
		return result.toString();
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EList getRedefinedElementsHelper(EList redefinedElements) {
		super.getRedefinedElementsHelper(redefinedElements);
		if (eIsSet(UML2Package.CONNECTOR__REDEFINED_CONNECTOR)) {
			for (Iterator i = ((InternalEList) getRedefinedConnectors()).basicIterator(); i.hasNext(); ) {
				redefinedElements.add(i.next());
			}
		}
		return redefinedElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRedefinedElements() {
		return super.isSetRedefinedElements()
			|| eIsSet(UML2Package.CONNECTOR__REDEFINED_CONNECTOR);
	}


	/**
	 * The array of subset feature identifiers for the '{@link #getRedefinedElements() <em>Redefined Element</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRedefinedElements()
	 * @generated
	 * @ordered
	 */
	protected static final int[] REDEFINED_ELEMENT_ESUBSETS = new int[] {UML2Package.CONNECTOR__REDEFINED_CONNECTOR};

	/**
	 * The array of subset feature identifiers for the '{@link #getOwnedElements() <em>Owned Element</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedElements()
	 * @generated
	 * @ordered
	 */
	protected static final int[] OWNED_ELEMENT_ESUBSETS = new int[] {UML2Package.CONNECTOR__OWNED_COMMENT, UML2Package.CONNECTOR__TEMPLATE_BINDING, UML2Package.CONNECTOR__OWNED_TEMPLATE_SIGNATURE, UML2Package.CONNECTOR__NAME_EXPRESSION, UML2Package.CONNECTOR__END};

} //ConnectorImpl
