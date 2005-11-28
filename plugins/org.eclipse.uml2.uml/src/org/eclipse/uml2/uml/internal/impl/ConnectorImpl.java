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
 * $Id: ConnectorImpl.java,v 1.5 2005/11/28 20:26:04 khussey Exp $
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
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.uml2.common.util.DerivedUnionEObjectEList;

import org.eclipse.uml2.uml.Association;
import org.eclipse.uml2.uml.Behavior;
import org.eclipse.uml2.uml.Connector;
import org.eclipse.uml2.uml.ConnectorEnd;
import org.eclipse.uml2.uml.ConnectorKind;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.RedefinableElement;
import org.eclipse.uml2.uml.StringExpression;
import org.eclipse.uml2.uml.UMLFactory;
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
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ConnectorImpl#getRedefinedElements <em>Redefined Element</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ConnectorImpl#getOwnedElements <em>Owned Element</em>}</li>
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
	 * The default value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected static final ConnectorKind KIND_EDEFAULT = ConnectorKind.ASSEMBLY_LITERAL;

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
	public List getRedefinedElements() {
		List redefinedElement = (List) eVirtualGet(UMLPackage.CONNECTOR__REDEFINED_ELEMENT);
		if (redefinedElement == null) {
			eVirtualSet(UMLPackage.CONNECTOR__REDEFINED_ELEMENT,
				redefinedElement = new DerivedUnionEObjectEList(
					RedefinableElement.class, this,
					UMLPackage.CONNECTOR__REDEFINED_ELEMENT,
					new int[]{UMLPackage.CONNECTOR__REDEFINED_CONNECTOR}));
		}
		return redefinedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List getOwnedElements() {
		List ownedElement = (List) eVirtualGet(UMLPackage.CONNECTOR__OWNED_ELEMENT);
		if (ownedElement == null) {
			eVirtualSet(UMLPackage.CONNECTOR__OWNED_ELEMENT,
				ownedElement = new DerivedUnionEObjectEList(Element.class,
					this, UMLPackage.CONNECTOR__OWNED_ELEMENT, new int[]{
						UMLPackage.CONNECTOR__OWNED_COMMENT,
						UMLPackage.CONNECTOR__NAME_EXPRESSION,
						UMLPackage.CONNECTOR__END}));
		}
		return ownedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Association getType() {
		Association type = (Association) eVirtualGet(UMLPackage.CONNECTOR__TYPE);
		if (type != null && type.eIsProxy()) {
			InternalEObject oldType = (InternalEObject) type;
			type = (Association) eResolveProxy(oldType);
			if (type != oldType) {
				eVirtualSet(UMLPackage.CONNECTOR__TYPE, type);
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
		return (Association) eVirtualGet(UMLPackage.CONNECTOR__TYPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(Association newType) {
		Association type = newType;
		Object oldType = eVirtualSet(UMLPackage.CONNECTOR__TYPE, type);
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.CONNECTOR__TYPE, oldType == EVIRTUAL_NO_VALUE
					? null
					: oldType, type));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List getRedefinedConnectors() {
		List redefinedConnector = (List) eVirtualGet(UMLPackage.CONNECTOR__REDEFINED_CONNECTOR);
		if (redefinedConnector == null) {
			eVirtualSet(UMLPackage.CONNECTOR__REDEFINED_CONNECTOR,
				redefinedConnector = new EObjectResolvingEList(Connector.class,
					this, UMLPackage.CONNECTOR__REDEFINED_CONNECTOR));
		}
		return redefinedConnector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Connector getRedefinedConnector(String name) {
		for (Iterator i = getRedefinedConnectors().iterator(); i.hasNext();) {
			Connector redefinedConnector = (Connector) i.next();
			if (name.equals(redefinedConnector.getName())) {
				return redefinedConnector;
			}
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List getEnds() {
		List end = (List) eVirtualGet(UMLPackage.CONNECTOR__END);
		if (end == null) {
			eVirtualSet(UMLPackage.CONNECTOR__END,
				end = new EObjectContainmentEList(ConnectorEnd.class, this,
					UMLPackage.CONNECTOR__END));
		}
		return end;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectorEnd createEnd() {
		ConnectorEnd newEnd = UMLFactory.eINSTANCE.createConnectorEnd();
		getEnds().add(newEnd);
		return newEnd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectorKind getKind() {
		return (ConnectorKind) eVirtualGet(UMLPackage.CONNECTOR__KIND,
			KIND_EDEFAULT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKind(ConnectorKind newKind) {
		ConnectorKind kind = newKind == null
			? KIND_EDEFAULT
			: newKind;
		Object oldKind = eVirtualSet(UMLPackage.CONNECTOR__KIND, kind);
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.CONNECTOR__KIND, oldKind == EVIRTUAL_NO_VALUE
					? KIND_EDEFAULT
					: oldKind, kind));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List getContracts() {
		List contract = (List) eVirtualGet(UMLPackage.CONNECTOR__CONTRACT);
		if (contract == null) {
			eVirtualSet(UMLPackage.CONNECTOR__CONTRACT,
				contract = new EObjectResolvingEList(Behavior.class, this,
					UMLPackage.CONNECTOR__CONTRACT));
		}
		return contract;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Behavior getContract(String name) {
		for (Iterator i = getContracts().iterator(); i.hasNext();) {
			Behavior contract = (Behavior) i.next();
			if (name.equals(contract.getName())) {
				return contract;
			}
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
				return getOwner();
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
				return getNameExpression();
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
				setName(NAME_EDEFAULT);
				return;
			case UMLPackage.CONNECTOR__VISIBILITY :
				setVisibility(VISIBILITY_EDEFAULT);
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
				setKind(KIND_EDEFAULT);
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
				List ownedComment = (List) eVirtualGet(UMLPackage.CONNECTOR__OWNED_COMMENT);
				return ownedComment != null && !ownedComment.isEmpty();
			case UMLPackage.CONNECTOR__NAME :
				String name = (String) eVirtualGet(UMLPackage.CONNECTOR__NAME,
					NAME_EDEFAULT);
				return NAME_EDEFAULT == null
					? name != null
					: !NAME_EDEFAULT.equals(name);
			case UMLPackage.CONNECTOR__VISIBILITY :
				return eVirtualGet(UMLPackage.CONNECTOR__VISIBILITY,
					VISIBILITY_EDEFAULT) != VISIBILITY_EDEFAULT;
			case UMLPackage.CONNECTOR__QUALIFIED_NAME :
				return QUALIFIED_NAME_EDEFAULT == null
					? getQualifiedName() != null
					: !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case UMLPackage.CONNECTOR__CLIENT_DEPENDENCY :
				List clientDependency = (List) eVirtualGet(UMLPackage.CONNECTOR__CLIENT_DEPENDENCY);
				return clientDependency != null && !clientDependency.isEmpty();
			case UMLPackage.CONNECTOR__NAMESPACE :
				return isSetNamespace();
			case UMLPackage.CONNECTOR__NAME_EXPRESSION :
				return eVirtualGet(UMLPackage.CONNECTOR__NAME_EXPRESSION) != null;
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
				return eVirtualGet(UMLPackage.CONNECTOR__TYPE) != null;
			case UMLPackage.CONNECTOR__REDEFINED_CONNECTOR :
				List redefinedConnector = (List) eVirtualGet(UMLPackage.CONNECTOR__REDEFINED_CONNECTOR);
				return redefinedConnector != null
					&& !redefinedConnector.isEmpty();
			case UMLPackage.CONNECTOR__END :
				List end = (List) eVirtualGet(UMLPackage.CONNECTOR__END);
				return end != null && !end.isEmpty();
			case UMLPackage.CONNECTOR__KIND :
				return eVirtualGet(UMLPackage.CONNECTOR__KIND, KIND_EDEFAULT) != KIND_EDEFAULT;
			case UMLPackage.CONNECTOR__CONTRACT :
				List contract = (List) eVirtualGet(UMLPackage.CONNECTOR__CONTRACT);
				return contract != null && !contract.isEmpty();
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
		result.append(eVirtualGet(UMLPackage.CONNECTOR__KIND, KIND_EDEFAULT));
		result.append(')');
		return result.toString();
	}

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOwnedElements() {
		return super.isSetOwnedElements() || eIsSet(UMLPackage.CONNECTOR__END);
	}

} //ConnectorImpl
