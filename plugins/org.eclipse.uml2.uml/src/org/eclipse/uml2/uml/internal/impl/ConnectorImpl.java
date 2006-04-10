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
 * $Id: ConnectorImpl.java,v 1.13 2006/04/10 19:16:20 khussey Exp $
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

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.uml2.common.util.CacheAdapter;
import org.eclipse.uml2.common.util.DerivedUnionEObjectEList;

import org.eclipse.uml2.uml.Association;
import org.eclipse.uml2.uml.Behavior;
import org.eclipse.uml2.uml.Connector;
import org.eclipse.uml2.uml.ConnectorEnd;
import org.eclipse.uml2.uml.ConnectorKind;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.RedefinableElement;
import org.eclipse.uml2.uml.StringExpression;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.VisibilityKind;

import org.eclipse.uml2.uml.internal.operations.ConnectorOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Connector</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ConnectorImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ConnectorImpl#getRedefinedConnectors <em>Redefined Connector</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ConnectorImpl#getEnds <em>End</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ConnectorImpl#getKind <em>Kind</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ConnectorImpl#getContracts <em>Contract</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConnectorImpl
		extends FeatureImpl
		implements Connector {

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
	 * The flag representing whether the Kind attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected static final int KIND_ESETFLAG = 1 << 12;

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
		return UMLPackage.Literals.CONNECTOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getRedefinedElements() {
		CacheAdapter cache = getCacheAdapter();
		if (cache != null) {
			Resource eResource = eResource();
			EList redefinedElements = (EList) cache.get(eResource, this,
				UMLPackage.Literals.REDEFINABLE_ELEMENT__REDEFINED_ELEMENT);
			if (redefinedElements == null) {
				cache.put(eResource, this,
					UMLPackage.Literals.REDEFINABLE_ELEMENT__REDEFINED_ELEMENT,
					redefinedElements = new DerivedUnionEObjectEList(
						RedefinableElement.class, this,
						UMLPackage.CONNECTOR__REDEFINED_ELEMENT,
						REDEFINED_ELEMENT_ESUBSETS));
			}
			return redefinedElements;
		}
		return new DerivedUnionEObjectEList(RedefinableElement.class, this,
			UMLPackage.CONNECTOR__REDEFINED_ELEMENT, REDEFINED_ELEMENT_ESUBSETS);
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
			EList ownedElements = (EList) cache.get(eResource, this,
				UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
			if (ownedElements == null) {
				cache.put(eResource, this,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT,
					ownedElements = new DerivedUnionEObjectEList(Element.class,
						this, UMLPackage.CONNECTOR__OWNED_ELEMENT,
						OWNED_ELEMENT_ESUBSETS));
			}
			return ownedElements;
		}
		return new DerivedUnionEObjectEList(Element.class, this,
			UMLPackage.CONNECTOR__OWNED_ELEMENT, OWNED_ELEMENT_ESUBSETS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Association getType() {
		if (type != null && type.eIsProxy()) {
			InternalEObject oldType = (InternalEObject) type;
			type = (Association) eResolveProxy(oldType);
			if (type != oldType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
						UMLPackage.CONNECTOR__TYPE, oldType, type));
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
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.CONNECTOR__TYPE, oldType, type));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getRedefinedConnectors() {
		if (redefinedConnectors == null) {
			redefinedConnectors = new EObjectResolvingEList(Connector.class,
				this, UMLPackage.CONNECTOR__REDEFINED_CONNECTOR);
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
		redefinedConnectorLoop : for (Iterator i = getRedefinedConnectors()
			.iterator(); i.hasNext();) {
			Connector redefinedConnector = (Connector) i.next();
			if (name != null && !(ignoreCase
				? name.equalsIgnoreCase(redefinedConnector.getName())
				: name.equals(redefinedConnector.getName())))
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
			ends = new EObjectContainmentEList.Resolving(ConnectorEnd.class,
				this, UMLPackage.CONNECTOR__END);
		}
		return ends;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectorEnd createEnd() {
		ConnectorEnd newEnd = (ConnectorEnd) create(UMLPackage.Literals.CONNECTOR_END);
		getEnds().add(newEnd);
		return newEnd;
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
		kind = newKind == null
			? KIND_EDEFAULT
			: newKind;
		boolean oldKindESet = (eFlags & KIND_ESETFLAG) != 0;
		eFlags |= KIND_ESETFLAG;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.CONNECTOR__KIND, oldKind, kind, !oldKindESet));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetKind() {
		ConnectorKind oldKind = kind;
		boolean oldKindESet = (eFlags & KIND_ESETFLAG) != 0;
		kind = KIND_EDEFAULT;
		eFlags &= ~KIND_ESETFLAG;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET,
				UMLPackage.CONNECTOR__KIND, oldKind, KIND_EDEFAULT, oldKindESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetKind() {
		return (eFlags & KIND_ESETFLAG) != 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getContracts() {
		if (contracts == null) {
			contracts = new EObjectResolvingEList(Behavior.class, this,
				UMLPackage.CONNECTOR__CONTRACT);
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
		contractLoop : for (Iterator i = getContracts().iterator(); i.hasNext();) {
			Behavior contract = (Behavior) i.next();
			if (eClass != null && !eClass.isInstance(contract))
				continue contractLoop;
			if (name != null && !(ignoreCase
				? name.equalsIgnoreCase(contract.getName())
				: name.equals(contract.getName())))
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
	public boolean validateTypes(DiagnosticChain diagnostics, Map context) {
		return ConnectorOperations.validateTypes(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCompatible(DiagnosticChain diagnostics, Map context) {
		return ConnectorOperations.validateCompatible(this, diagnostics,
			context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRoles(DiagnosticChain diagnostics, Map context) {
		return ConnectorOperations.validateRoles(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBetweenInterfacesPorts(DiagnosticChain diagnostics,
			Map context) {
		return ConnectorOperations.validateBetweenInterfacesPorts(this,
			diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBetweenInterfacePortImplements(
			DiagnosticChain diagnostics, Map context) {
		return ConnectorOperations.validateBetweenInterfacePortImplements(this,
			diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBetweenInterfacePortSignature(
			DiagnosticChain diagnostics, Map context) {
		return ConnectorOperations.validateBetweenInterfacePortSignature(this,
			diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnionSignatureCompatible(
			DiagnosticChain diagnostics, Map context) {
		return ConnectorOperations.validateUnionSignatureCompatible(this,
			diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssemblyConnector(DiagnosticChain diagnostics,
			Map context) {
		return ConnectorOperations.validateAssemblyConnector(this, diagnostics,
			context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UMLPackage.CONNECTOR__EANNOTATIONS :
				return ((InternalEList) getEAnnotations()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.CONNECTOR__OWNED_COMMENT :
				return ((InternalEList) getOwnedComments()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.CONNECTOR__CLIENT_DEPENDENCY :
				return ((InternalEList) getClientDependencies()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.CONNECTOR__NAME_EXPRESSION :
				return basicSetNameExpression(null, msgs);
			case UMLPackage.CONNECTOR__END :
				return ((InternalEList) getEnds()).basicRemove(otherEnd, msgs);
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
			case UMLPackage.CONNECTOR__EANNOTATIONS :
				return getEAnnotations();
			case UMLPackage.CONNECTOR__OWNED_ELEMENT :
				return getOwnedElements();
			case UMLPackage.CONNECTOR__OWNER :
				if (resolve)
					return getOwner();
				return basicGetOwner();
			case UMLPackage.CONNECTOR__OWNED_COMMENT :
				return getOwnedComments();
			case UMLPackage.CONNECTOR__NAME :
				return getName();
			case UMLPackage.CONNECTOR__VISIBILITY :
				return getVisibility();
			case UMLPackage.CONNECTOR__QUALIFIED_NAME :
				return getQualifiedName();
			case UMLPackage.CONNECTOR__CLIENT_DEPENDENCY :
				return getClientDependencies();
			case UMLPackage.CONNECTOR__NAMESPACE :
				if (resolve)
					return getNamespace();
				return basicGetNamespace();
			case UMLPackage.CONNECTOR__NAME_EXPRESSION :
				if (resolve)
					return getNameExpression();
				return basicGetNameExpression();
			case UMLPackage.CONNECTOR__IS_LEAF :
				return isLeaf()
					? Boolean.TRUE
					: Boolean.FALSE;
			case UMLPackage.CONNECTOR__REDEFINED_ELEMENT :
				return getRedefinedElements();
			case UMLPackage.CONNECTOR__REDEFINITION_CONTEXT :
				return getRedefinitionContexts();
			case UMLPackage.CONNECTOR__IS_STATIC :
				return isStatic()
					? Boolean.TRUE
					: Boolean.FALSE;
			case UMLPackage.CONNECTOR__FEATURING_CLASSIFIER :
				return getFeaturingClassifiers();
			case UMLPackage.CONNECTOR__TYPE :
				if (resolve)
					return getType();
				return basicGetType();
			case UMLPackage.CONNECTOR__REDEFINED_CONNECTOR :
				return getRedefinedConnectors();
			case UMLPackage.CONNECTOR__END :
				return getEnds();
			case UMLPackage.CONNECTOR__KIND :
				return getKind();
			case UMLPackage.CONNECTOR__CONTRACT :
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
			case UMLPackage.CONNECTOR__EANNOTATIONS :
				getEAnnotations().clear();
				getEAnnotations().addAll((Collection) newValue);
				return;
			case UMLPackage.CONNECTOR__OWNED_COMMENT :
				getOwnedComments().clear();
				getOwnedComments().addAll((Collection) newValue);
				return;
			case UMLPackage.CONNECTOR__NAME :
				setName((String) newValue);
				return;
			case UMLPackage.CONNECTOR__VISIBILITY :
				setVisibility((VisibilityKind) newValue);
				return;
			case UMLPackage.CONNECTOR__CLIENT_DEPENDENCY :
				getClientDependencies().clear();
				getClientDependencies().addAll((Collection) newValue);
				return;
			case UMLPackage.CONNECTOR__NAME_EXPRESSION :
				setNameExpression((StringExpression) newValue);
				return;
			case UMLPackage.CONNECTOR__IS_LEAF :
				setIsLeaf(((Boolean) newValue).booleanValue());
				return;
			case UMLPackage.CONNECTOR__IS_STATIC :
				setIsStatic(((Boolean) newValue).booleanValue());
				return;
			case UMLPackage.CONNECTOR__TYPE :
				setType((Association) newValue);
				return;
			case UMLPackage.CONNECTOR__REDEFINED_CONNECTOR :
				getRedefinedConnectors().clear();
				getRedefinedConnectors().addAll((Collection) newValue);
				return;
			case UMLPackage.CONNECTOR__END :
				getEnds().clear();
				getEnds().addAll((Collection) newValue);
				return;
			case UMLPackage.CONNECTOR__KIND :
				setKind((ConnectorKind) newValue);
				return;
			case UMLPackage.CONNECTOR__CONTRACT :
				getContracts().clear();
				getContracts().addAll((Collection) newValue);
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
			case UMLPackage.CONNECTOR__EANNOTATIONS :
				getEAnnotations().clear();
				return;
			case UMLPackage.CONNECTOR__OWNED_COMMENT :
				getOwnedComments().clear();
				return;
			case UMLPackage.CONNECTOR__NAME :
				unsetName();
				return;
			case UMLPackage.CONNECTOR__VISIBILITY :
				unsetVisibility();
				return;
			case UMLPackage.CONNECTOR__CLIENT_DEPENDENCY :
				getClientDependencies().clear();
				return;
			case UMLPackage.CONNECTOR__NAME_EXPRESSION :
				setNameExpression((StringExpression) null);
				return;
			case UMLPackage.CONNECTOR__IS_LEAF :
				setIsLeaf(IS_LEAF_EDEFAULT);
				return;
			case UMLPackage.CONNECTOR__IS_STATIC :
				setIsStatic(IS_STATIC_EDEFAULT);
				return;
			case UMLPackage.CONNECTOR__TYPE :
				setType((Association) null);
				return;
			case UMLPackage.CONNECTOR__REDEFINED_CONNECTOR :
				getRedefinedConnectors().clear();
				return;
			case UMLPackage.CONNECTOR__END :
				getEnds().clear();
				return;
			case UMLPackage.CONNECTOR__KIND :
				unsetKind();
				return;
			case UMLPackage.CONNECTOR__CONTRACT :
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
			case UMLPackage.CONNECTOR__EANNOTATIONS :
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UMLPackage.CONNECTOR__OWNED_ELEMENT :
				return isSetOwnedElements();
			case UMLPackage.CONNECTOR__OWNER :
				return isSetOwner();
			case UMLPackage.CONNECTOR__OWNED_COMMENT :
				return ownedComments != null && !ownedComments.isEmpty();
			case UMLPackage.CONNECTOR__NAME :
				return isSetName();
			case UMLPackage.CONNECTOR__VISIBILITY :
				return isSetVisibility();
			case UMLPackage.CONNECTOR__QUALIFIED_NAME :
				return QUALIFIED_NAME_EDEFAULT == null
					? getQualifiedName() != null
					: !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case UMLPackage.CONNECTOR__CLIENT_DEPENDENCY :
				return clientDependencies != null
					&& !clientDependencies.isEmpty();
			case UMLPackage.CONNECTOR__NAMESPACE :
				return isSetNamespace();
			case UMLPackage.CONNECTOR__NAME_EXPRESSION :
				return nameExpression != null;
			case UMLPackage.CONNECTOR__IS_LEAF :
				return ((eFlags & IS_LEAF_EFLAG) != 0) != IS_LEAF_EDEFAULT;
			case UMLPackage.CONNECTOR__REDEFINED_ELEMENT :
				return isSetRedefinedElements();
			case UMLPackage.CONNECTOR__REDEFINITION_CONTEXT :
				return isSetRedefinitionContexts();
			case UMLPackage.CONNECTOR__IS_STATIC :
				return ((eFlags & IS_STATIC_EFLAG) != 0) != IS_STATIC_EDEFAULT;
			case UMLPackage.CONNECTOR__FEATURING_CLASSIFIER :
				return isSetFeaturingClassifiers();
			case UMLPackage.CONNECTOR__TYPE :
				return type != null;
			case UMLPackage.CONNECTOR__REDEFINED_CONNECTOR :
				return redefinedConnectors != null
					&& !redefinedConnectors.isEmpty();
			case UMLPackage.CONNECTOR__END :
				return ends != null && !ends.isEmpty();
			case UMLPackage.CONNECTOR__KIND :
				return isSetKind();
			case UMLPackage.CONNECTOR__CONTRACT :
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
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (kind: "); //$NON-NLS-1$
		if ((eFlags & KIND_ESETFLAG) != 0)
			result.append(kind);
		else
			result.append("<unset>"); //$NON-NLS-1$
		result.append(')');
		return result.toString();
	}

	/**
	 * The array of subset feature identifiers for the '{@link #getRedefinedElements() <em>Redefined Element</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRedefinedElements()
	 * @generated
	 * @ordered
	 */
	protected static final int[] REDEFINED_ELEMENT_ESUBSETS = new int[]{UMLPackage.CONNECTOR__REDEFINED_CONNECTOR};

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRedefinedElements() {
		return super.isSetRedefinedElements()
			|| eIsSet(UMLPackage.CONNECTOR__REDEFINED_CONNECTOR);
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
		UMLPackage.CONNECTOR__OWNED_COMMENT,
		UMLPackage.CONNECTOR__NAME_EXPRESSION, UMLPackage.CONNECTOR__END};

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOwnedElements() {
		return super.isSetOwnedElements() || eIsSet(UMLPackage.CONNECTOR__END);
	}

} //ConnectorImpl
