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
 * $Id: PortImpl.java,v 1.13 2005/12/14 22:34:17 khussey Exp $
 */
package org.eclipse.uml2.uml.internal.impl;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.eclipse.uml2.common.util.CacheAdapter;
import org.eclipse.uml2.common.util.DerivedUnionEObjectEList;

import org.eclipse.uml2.uml.AggregationKind;
import org.eclipse.uml2.uml.Association;
import org.eclipse.uml2.uml.DataType;
import org.eclipse.uml2.uml.Interface;
import org.eclipse.uml2.uml.Port;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.ProtocolStateMachine;
import org.eclipse.uml2.uml.RedefinableElement;
import org.eclipse.uml2.uml.StringExpression;
import org.eclipse.uml2.uml.TemplateParameter;
import org.eclipse.uml2.uml.TemplateSignature;
import org.eclipse.uml2.uml.Type;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.ValueSpecification;
import org.eclipse.uml2.uml.VisibilityKind;

import org.eclipse.uml2.uml.internal.operations.PortOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Port</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.PortImpl#getRedefinedElements <em>Redefined Element</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.PortImpl#isBehavior <em>Is Behavior</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.PortImpl#isService <em>Is Service</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.PortImpl#getRequireds <em>Required</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.PortImpl#getRedefinedPorts <em>Redefined Port</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.PortImpl#getProvideds <em>Provided</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.PortImpl#getProtocol <em>Protocol</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PortImpl
		extends PropertyImpl
		implements Port {

	/**
	 * The default value of the '{@link #isBehavior() <em>Is Behavior</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBehavior()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_BEHAVIOR_EDEFAULT = false;

	/**
	 * The flag representing the value of the '{@link #isBehavior() <em>Is Behavior</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBehavior()
	 * @generated
	 * @ordered
	 */
	protected static final int IS_BEHAVIOR_EFLAG = 1 << 15;

	/**
	 * The default value of the '{@link #isService() <em>Is Service</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isService()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_SERVICE_EDEFAULT = false;

	/**
	 * The flag representing the value of the '{@link #isService() <em>Is Service</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isService()
	 * @generated
	 * @ordered
	 */
	protected static final int IS_SERVICE_EFLAG = 1 << 16;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PortImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return UMLPackage.Literals.PORT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getRedefinedElements() {
		EList redefinedElement = (EList) eVirtualGet(UMLPackage.PORT__REDEFINED_ELEMENT);
		if (redefinedElement == null) {
			eVirtualSet(UMLPackage.PORT__REDEFINED_ELEMENT,
				redefinedElement = new DerivedUnionEObjectEList(
					RedefinableElement.class, this,
					UMLPackage.PORT__REDEFINED_ELEMENT, new int[]{
						UMLPackage.PORT__REDEFINED_PROPERTY,
						UMLPackage.PORT__REDEFINED_PORT}));
		}
		return redefinedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isBehavior() {
		return (eFlags & IS_BEHAVIOR_EFLAG) != 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsBehavior(boolean newIsBehavior) {
		boolean oldIsBehavior = (eFlags & IS_BEHAVIOR_EFLAG) != 0;
		if (newIsBehavior)
			eFlags |= IS_BEHAVIOR_EFLAG;
		else
			eFlags &= ~IS_BEHAVIOR_EFLAG;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.PORT__IS_BEHAVIOR, oldIsBehavior, newIsBehavior));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isService() {
		return (eFlags & IS_SERVICE_EFLAG) != 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsService(boolean newIsService) {
		boolean oldIsService = (eFlags & IS_SERVICE_EFLAG) != 0;
		if (newIsService)
			eFlags |= IS_SERVICE_EFLAG;
		else
			eFlags &= ~IS_SERVICE_EFLAG;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.PORT__IS_SERVICE, oldIsService, newIsService));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getRequireds() {
		CacheAdapter cache = getCacheAdapter();
		if (cache != null) {
			EList result = (EList) cache.get(this,
				UMLPackage.Literals.PORT__REQUIRED);
			if (result == null) {
				cache.put(this, UMLPackage.Literals.PORT__REQUIRED,
					result = PortOperations.getRequireds(this));
			}
			return result;
		}
		return PortOperations.getRequireds(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Interface getRequired(String name) {
		for (Iterator i = getRequireds().iterator(); i.hasNext();) {
			Interface required = (Interface) i.next();
			if (name.equals(required.getName())) {
				return required;
			}
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getRedefinedPorts() {
		EList redefinedPort = (EList) eVirtualGet(UMLPackage.PORT__REDEFINED_PORT);
		if (redefinedPort == null) {
			eVirtualSet(UMLPackage.PORT__REDEFINED_PORT,
				redefinedPort = new EObjectResolvingEList(Port.class, this,
					UMLPackage.PORT__REDEFINED_PORT));
		}
		return redefinedPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Port getRedefinedPort(String name) {
		for (Iterator i = getRedefinedPorts().iterator(); i.hasNext();) {
			Port redefinedPort = (Port) i.next();
			if (name.equals(redefinedPort.getName())) {
				return redefinedPort;
			}
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getProvideds() {
		CacheAdapter cache = getCacheAdapter();
		if (cache != null) {
			EList result = (EList) cache.get(this,
				UMLPackage.Literals.PORT__PROVIDED);
			if (result == null) {
				cache.put(this, UMLPackage.Literals.PORT__PROVIDED,
					result = PortOperations.getProvideds(this));
			}
			return result;
		}
		return PortOperations.getProvideds(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Interface getProvided(String name) {
		for (Iterator i = getProvideds().iterator(); i.hasNext();) {
			Interface provided = (Interface) i.next();
			if (name.equals(provided.getName())) {
				return provided;
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
		ProtocolStateMachine protocol = (ProtocolStateMachine) eVirtualGet(UMLPackage.PORT__PROTOCOL);
		if (protocol != null && protocol.eIsProxy()) {
			InternalEObject oldProtocol = (InternalEObject) protocol;
			protocol = (ProtocolStateMachine) eResolveProxy(oldProtocol);
			if (protocol != oldProtocol) {
				eVirtualSet(UMLPackage.PORT__PROTOCOL, protocol);
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
						UMLPackage.PORT__PROTOCOL, oldProtocol, protocol));
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
		return (ProtocolStateMachine) eVirtualGet(UMLPackage.PORT__PROTOCOL);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProtocol(ProtocolStateMachine newProtocol) {
		ProtocolStateMachine protocol = newProtocol;
		Object oldProtocol = eVirtualSet(UMLPackage.PORT__PROTOCOL, protocol);
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.PORT__PROTOCOL, oldProtocol == EVIRTUAL_NO_VALUE
					? null
					: oldProtocol, protocol));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRequiredInterfaces(DiagnosticChain diagnostics,
			Map context) {
		return PortOperations.validateRequiredInterfaces(this, diagnostics,
			context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePortAggregation(DiagnosticChain diagnostics,
			Map context) {
		return PortOperations.validatePortAggregation(this, diagnostics,
			context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePortDestroyed(DiagnosticChain diagnostics,
			Map context) {
		return PortOperations.validatePortDestroyed(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDefaultValue(DiagnosticChain diagnostics, Map context) {
		return PortOperations.validateDefaultValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UMLPackage.PORT__EANNOTATIONS :
				return getEAnnotations();
			case UMLPackage.PORT__OWNED_ELEMENT :
				return getOwnedElements();
			case UMLPackage.PORT__OWNER :
				if (resolve)
					return getOwner();
				return basicGetOwner();
			case UMLPackage.PORT__OWNED_COMMENT :
				return getOwnedComments();
			case UMLPackage.PORT__NAME :
				return getName();
			case UMLPackage.PORT__VISIBILITY :
				return getVisibility();
			case UMLPackage.PORT__QUALIFIED_NAME :
				return getQualifiedName();
			case UMLPackage.PORT__CLIENT_DEPENDENCY :
				return getClientDependencies();
			case UMLPackage.PORT__NAMESPACE :
				if (resolve)
					return getNamespace();
				return basicGetNamespace();
			case UMLPackage.PORT__NAME_EXPRESSION :
				return getNameExpression();
			case UMLPackage.PORT__IS_LEAF :
				return isLeaf()
					? Boolean.TRUE
					: Boolean.FALSE;
			case UMLPackage.PORT__REDEFINED_ELEMENT :
				return getRedefinedElements();
			case UMLPackage.PORT__REDEFINITION_CONTEXT :
				return getRedefinitionContexts();
			case UMLPackage.PORT__IS_STATIC :
				return isStatic()
					? Boolean.TRUE
					: Boolean.FALSE;
			case UMLPackage.PORT__FEATURING_CLASSIFIER :
				return getFeaturingClassifiers();
			case UMLPackage.PORT__TYPE :
				if (resolve)
					return getType();
				return basicGetType();
			case UMLPackage.PORT__IS_ORDERED :
				return isOrdered()
					? Boolean.TRUE
					: Boolean.FALSE;
			case UMLPackage.PORT__IS_UNIQUE :
				return isUnique()
					? Boolean.TRUE
					: Boolean.FALSE;
			case UMLPackage.PORT__UPPER :
				return new Integer(getUpper());
			case UMLPackage.PORT__LOWER :
				return new Integer(getLower());
			case UMLPackage.PORT__UPPER_VALUE :
				return getUpperValue();
			case UMLPackage.PORT__LOWER_VALUE :
				return getLowerValue();
			case UMLPackage.PORT__IS_READ_ONLY :
				return isReadOnly()
					? Boolean.TRUE
					: Boolean.FALSE;
			case UMLPackage.PORT__OWNING_TEMPLATE_PARAMETER :
				if (resolve)
					return getOwningTemplateParameter();
				return basicGetOwningTemplateParameter();
			case UMLPackage.PORT__TEMPLATE_PARAMETER :
				if (resolve)
					return getTemplateParameter();
				return basicGetTemplateParameter();
			case UMLPackage.PORT__END :
				return getEnds();
			case UMLPackage.PORT__DEPLOYMENT :
				return getDeployments();
			case UMLPackage.PORT__DEPLOYED_ELEMENT :
				return getDeployedElements();
			case UMLPackage.PORT__TEMPLATE_BINDING :
				return getTemplateBindings();
			case UMLPackage.PORT__OWNED_TEMPLATE_SIGNATURE :
				return getOwnedTemplateSignature();
			case UMLPackage.PORT__DATATYPE :
				return getDatatype();
			case UMLPackage.PORT__IS_DERIVED :
				return isDerived()
					? Boolean.TRUE
					: Boolean.FALSE;
			case UMLPackage.PORT__IS_DERIVED_UNION :
				return isDerivedUnion()
					? Boolean.TRUE
					: Boolean.FALSE;
			case UMLPackage.PORT__DEFAULT :
				return getDefault();
			case UMLPackage.PORT__AGGREGATION :
				return getAggregation();
			case UMLPackage.PORT__IS_COMPOSITE :
				return isComposite()
					? Boolean.TRUE
					: Boolean.FALSE;
			case UMLPackage.PORT__CLASS_ :
				return getClass_();
			case UMLPackage.PORT__REDEFINED_PROPERTY :
				return getRedefinedProperties();
			case UMLPackage.PORT__OWNING_ASSOCIATION :
				if (resolve)
					return getOwningAssociation();
				return basicGetOwningAssociation();
			case UMLPackage.PORT__DEFAULT_VALUE :
				return getDefaultValue();
			case UMLPackage.PORT__OPPOSITE :
				if (resolve)
					return getOpposite();
				return basicGetOpposite();
			case UMLPackage.PORT__SUBSETTED_PROPERTY :
				return getSubsettedProperties();
			case UMLPackage.PORT__ASSOCIATION :
				if (resolve)
					return getAssociation();
				return basicGetAssociation();
			case UMLPackage.PORT__QUALIFIER :
				return getQualifiers();
			case UMLPackage.PORT__ASSOCIATION_END :
				return getAssociationEnd();
			case UMLPackage.PORT__IS_BEHAVIOR :
				return isBehavior()
					? Boolean.TRUE
					: Boolean.FALSE;
			case UMLPackage.PORT__IS_SERVICE :
				return isService()
					? Boolean.TRUE
					: Boolean.FALSE;
			case UMLPackage.PORT__REQUIRED :
				return getRequireds();
			case UMLPackage.PORT__REDEFINED_PORT :
				return getRedefinedPorts();
			case UMLPackage.PORT__PROVIDED :
				return getProvideds();
			case UMLPackage.PORT__PROTOCOL :
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
			case UMLPackage.PORT__EANNOTATIONS :
				getEAnnotations().clear();
				getEAnnotations().addAll((Collection) newValue);
				return;
			case UMLPackage.PORT__OWNED_COMMENT :
				getOwnedComments().clear();
				getOwnedComments().addAll((Collection) newValue);
				return;
			case UMLPackage.PORT__NAME :
				setName((String) newValue);
				return;
			case UMLPackage.PORT__VISIBILITY :
				setVisibility((VisibilityKind) newValue);
				return;
			case UMLPackage.PORT__CLIENT_DEPENDENCY :
				getClientDependencies().clear();
				getClientDependencies().addAll((Collection) newValue);
				return;
			case UMLPackage.PORT__NAME_EXPRESSION :
				setNameExpression((StringExpression) newValue);
				return;
			case UMLPackage.PORT__IS_LEAF :
				setIsLeaf(((Boolean) newValue).booleanValue());
				return;
			case UMLPackage.PORT__IS_STATIC :
				setIsStatic(((Boolean) newValue).booleanValue());
				return;
			case UMLPackage.PORT__TYPE :
				setType((Type) newValue);
				return;
			case UMLPackage.PORT__IS_ORDERED :
				setIsOrdered(((Boolean) newValue).booleanValue());
				return;
			case UMLPackage.PORT__IS_UNIQUE :
				setIsUnique(((Boolean) newValue).booleanValue());
				return;
			case UMLPackage.PORT__UPPER :
				setUpper(((Integer) newValue).intValue());
				return;
			case UMLPackage.PORT__LOWER :
				setLower(((Integer) newValue).intValue());
				return;
			case UMLPackage.PORT__UPPER_VALUE :
				setUpperValue((ValueSpecification) newValue);
				return;
			case UMLPackage.PORT__LOWER_VALUE :
				setLowerValue((ValueSpecification) newValue);
				return;
			case UMLPackage.PORT__IS_READ_ONLY :
				setIsReadOnly(((Boolean) newValue).booleanValue());
				return;
			case UMLPackage.PORT__OWNING_TEMPLATE_PARAMETER :
				setOwningTemplateParameter((TemplateParameter) newValue);
				return;
			case UMLPackage.PORT__TEMPLATE_PARAMETER :
				setTemplateParameter((TemplateParameter) newValue);
				return;
			case UMLPackage.PORT__END :
				getEnds().clear();
				getEnds().addAll((Collection) newValue);
				return;
			case UMLPackage.PORT__DEPLOYMENT :
				getDeployments().clear();
				getDeployments().addAll((Collection) newValue);
				return;
			case UMLPackage.PORT__TEMPLATE_BINDING :
				getTemplateBindings().clear();
				getTemplateBindings().addAll((Collection) newValue);
				return;
			case UMLPackage.PORT__OWNED_TEMPLATE_SIGNATURE :
				setOwnedTemplateSignature((TemplateSignature) newValue);
				return;
			case UMLPackage.PORT__DATATYPE :
				setDatatype((DataType) newValue);
				return;
			case UMLPackage.PORT__IS_DERIVED :
				setIsDerived(((Boolean) newValue).booleanValue());
				return;
			case UMLPackage.PORT__IS_DERIVED_UNION :
				setIsDerivedUnion(((Boolean) newValue).booleanValue());
				return;
			case UMLPackage.PORT__DEFAULT :
				setDefault((String) newValue);
				return;
			case UMLPackage.PORT__AGGREGATION :
				setAggregation((AggregationKind) newValue);
				return;
			case UMLPackage.PORT__IS_COMPOSITE :
				setIsComposite(((Boolean) newValue).booleanValue());
				return;
			case UMLPackage.PORT__REDEFINED_PROPERTY :
				getRedefinedProperties().clear();
				getRedefinedProperties().addAll((Collection) newValue);
				return;
			case UMLPackage.PORT__OWNING_ASSOCIATION :
				setOwningAssociation((Association) newValue);
				return;
			case UMLPackage.PORT__DEFAULT_VALUE :
				setDefaultValue((ValueSpecification) newValue);
				return;
			case UMLPackage.PORT__OPPOSITE :
				setOpposite((Property) newValue);
				return;
			case UMLPackage.PORT__SUBSETTED_PROPERTY :
				getSubsettedProperties().clear();
				getSubsettedProperties().addAll((Collection) newValue);
				return;
			case UMLPackage.PORT__ASSOCIATION :
				setAssociation((Association) newValue);
				return;
			case UMLPackage.PORT__QUALIFIER :
				getQualifiers().clear();
				getQualifiers().addAll((Collection) newValue);
				return;
			case UMLPackage.PORT__ASSOCIATION_END :
				setAssociationEnd((Property) newValue);
				return;
			case UMLPackage.PORT__IS_BEHAVIOR :
				setIsBehavior(((Boolean) newValue).booleanValue());
				return;
			case UMLPackage.PORT__IS_SERVICE :
				setIsService(((Boolean) newValue).booleanValue());
				return;
			case UMLPackage.PORT__REDEFINED_PORT :
				getRedefinedPorts().clear();
				getRedefinedPorts().addAll((Collection) newValue);
				return;
			case UMLPackage.PORT__PROTOCOL :
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
			case UMLPackage.PORT__EANNOTATIONS :
				getEAnnotations().clear();
				return;
			case UMLPackage.PORT__OWNED_COMMENT :
				getOwnedComments().clear();
				return;
			case UMLPackage.PORT__NAME :
				unsetName();
				return;
			case UMLPackage.PORT__VISIBILITY :
				unsetVisibility();
				return;
			case UMLPackage.PORT__CLIENT_DEPENDENCY :
				getClientDependencies().clear();
				return;
			case UMLPackage.PORT__NAME_EXPRESSION :
				setNameExpression((StringExpression) null);
				return;
			case UMLPackage.PORT__IS_LEAF :
				setIsLeaf(IS_LEAF_EDEFAULT);
				return;
			case UMLPackage.PORT__IS_STATIC :
				setIsStatic(IS_STATIC_EDEFAULT);
				return;
			case UMLPackage.PORT__TYPE :
				setType((Type) null);
				return;
			case UMLPackage.PORT__IS_ORDERED :
				setIsOrdered(IS_ORDERED_EDEFAULT);
				return;
			case UMLPackage.PORT__IS_UNIQUE :
				setIsUnique(IS_UNIQUE_EDEFAULT);
				return;
			case UMLPackage.PORT__UPPER :
				unsetUpper();
				return;
			case UMLPackage.PORT__LOWER :
				unsetLower();
				return;
			case UMLPackage.PORT__UPPER_VALUE :
				setUpperValue((ValueSpecification) null);
				return;
			case UMLPackage.PORT__LOWER_VALUE :
				setLowerValue((ValueSpecification) null);
				return;
			case UMLPackage.PORT__IS_READ_ONLY :
				setIsReadOnly(IS_READ_ONLY_EDEFAULT);
				return;
			case UMLPackage.PORT__OWNING_TEMPLATE_PARAMETER :
				setOwningTemplateParameter((TemplateParameter) null);
				return;
			case UMLPackage.PORT__TEMPLATE_PARAMETER :
				setTemplateParameter((TemplateParameter) null);
				return;
			case UMLPackage.PORT__END :
				getEnds().clear();
				return;
			case UMLPackage.PORT__DEPLOYMENT :
				getDeployments().clear();
				return;
			case UMLPackage.PORT__TEMPLATE_BINDING :
				getTemplateBindings().clear();
				return;
			case UMLPackage.PORT__OWNED_TEMPLATE_SIGNATURE :
				setOwnedTemplateSignature((TemplateSignature) null);
				return;
			case UMLPackage.PORT__DATATYPE :
				setDatatype((DataType) null);
				return;
			case UMLPackage.PORT__IS_DERIVED :
				setIsDerived(IS_DERIVED_EDEFAULT);
				return;
			case UMLPackage.PORT__IS_DERIVED_UNION :
				setIsDerivedUnion(IS_DERIVED_UNION_EDEFAULT);
				return;
			case UMLPackage.PORT__DEFAULT :
				unsetDefault();
				return;
			case UMLPackage.PORT__AGGREGATION :
				setAggregation(AGGREGATION_EDEFAULT);
				return;
			case UMLPackage.PORT__IS_COMPOSITE :
				setIsComposite(IS_COMPOSITE_EDEFAULT);
				return;
			case UMLPackage.PORT__REDEFINED_PROPERTY :
				getRedefinedProperties().clear();
				return;
			case UMLPackage.PORT__OWNING_ASSOCIATION :
				setOwningAssociation((Association) null);
				return;
			case UMLPackage.PORT__DEFAULT_VALUE :
				setDefaultValue((ValueSpecification) null);
				return;
			case UMLPackage.PORT__OPPOSITE :
				setOpposite((Property) null);
				return;
			case UMLPackage.PORT__SUBSETTED_PROPERTY :
				getSubsettedProperties().clear();
				return;
			case UMLPackage.PORT__ASSOCIATION :
				setAssociation((Association) null);
				return;
			case UMLPackage.PORT__QUALIFIER :
				getQualifiers().clear();
				return;
			case UMLPackage.PORT__ASSOCIATION_END :
				setAssociationEnd((Property) null);
				return;
			case UMLPackage.PORT__IS_BEHAVIOR :
				setIsBehavior(IS_BEHAVIOR_EDEFAULT);
				return;
			case UMLPackage.PORT__IS_SERVICE :
				setIsService(IS_SERVICE_EDEFAULT);
				return;
			case UMLPackage.PORT__REDEFINED_PORT :
				getRedefinedPorts().clear();
				return;
			case UMLPackage.PORT__PROTOCOL :
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
			case UMLPackage.PORT__EANNOTATIONS :
				EList eAnnotations = (EList) eVirtualGet(UMLPackage.PORT__EANNOTATIONS);
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UMLPackage.PORT__OWNED_ELEMENT :
				return isSetOwnedElements();
			case UMLPackage.PORT__OWNER :
				return isSetOwner();
			case UMLPackage.PORT__OWNED_COMMENT :
				EList ownedComment = (EList) eVirtualGet(UMLPackage.PORT__OWNED_COMMENT);
				return ownedComment != null && !ownedComment.isEmpty();
			case UMLPackage.PORT__NAME :
				return isSetName();
			case UMLPackage.PORT__VISIBILITY :
				return isSetVisibility();
			case UMLPackage.PORT__QUALIFIED_NAME :
				return QUALIFIED_NAME_EDEFAULT == null
					? getQualifiedName() != null
					: !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case UMLPackage.PORT__CLIENT_DEPENDENCY :
				EList clientDependency = (EList) eVirtualGet(UMLPackage.PORT__CLIENT_DEPENDENCY);
				return clientDependency != null && !clientDependency.isEmpty();
			case UMLPackage.PORT__NAMESPACE :
				return isSetNamespace();
			case UMLPackage.PORT__NAME_EXPRESSION :
				return eVirtualGet(UMLPackage.PORT__NAME_EXPRESSION) != null;
			case UMLPackage.PORT__IS_LEAF :
				return ((eFlags & IS_LEAF_EFLAG) != 0) != IS_LEAF_EDEFAULT;
			case UMLPackage.PORT__REDEFINED_ELEMENT :
				return isSetRedefinedElements();
			case UMLPackage.PORT__REDEFINITION_CONTEXT :
				return isSetRedefinitionContexts();
			case UMLPackage.PORT__IS_STATIC :
				return ((eFlags & IS_STATIC_EFLAG) != 0) != IS_STATIC_EDEFAULT;
			case UMLPackage.PORT__FEATURING_CLASSIFIER :
				return isSetFeaturingClassifiers();
			case UMLPackage.PORT__TYPE :
				return eVirtualGet(UMLPackage.PORT__TYPE) != null;
			case UMLPackage.PORT__IS_ORDERED :
				return ((eFlags & IS_ORDERED_EFLAG) != 0) != IS_ORDERED_EDEFAULT;
			case UMLPackage.PORT__IS_UNIQUE :
				return ((eFlags & IS_UNIQUE_EFLAG) != 0) != IS_UNIQUE_EDEFAULT;
			case UMLPackage.PORT__UPPER :
				return isSetUpper();
			case UMLPackage.PORT__LOWER :
				return isSetLower();
			case UMLPackage.PORT__UPPER_VALUE :
				return eVirtualGet(UMLPackage.PORT__UPPER_VALUE) != null;
			case UMLPackage.PORT__LOWER_VALUE :
				return eVirtualGet(UMLPackage.PORT__LOWER_VALUE) != null;
			case UMLPackage.PORT__IS_READ_ONLY :
				return isSetIsReadOnly();
			case UMLPackage.PORT__OWNING_TEMPLATE_PARAMETER :
				return basicGetOwningTemplateParameter() != null;
			case UMLPackage.PORT__TEMPLATE_PARAMETER :
				return isSetTemplateParameter();
			case UMLPackage.PORT__END :
				EList end = (EList) eVirtualGet(UMLPackage.PORT__END);
				return end != null && !end.isEmpty();
			case UMLPackage.PORT__DEPLOYMENT :
				EList deployment = (EList) eVirtualGet(UMLPackage.PORT__DEPLOYMENT);
				return deployment != null && !deployment.isEmpty();
			case UMLPackage.PORT__DEPLOYED_ELEMENT :
				return !getDeployedElements().isEmpty();
			case UMLPackage.PORT__TEMPLATE_BINDING :
				EList templateBinding = (EList) eVirtualGet(UMLPackage.PORT__TEMPLATE_BINDING);
				return templateBinding != null && !templateBinding.isEmpty();
			case UMLPackage.PORT__OWNED_TEMPLATE_SIGNATURE :
				return eVirtualGet(UMLPackage.PORT__OWNED_TEMPLATE_SIGNATURE) != null;
			case UMLPackage.PORT__DATATYPE :
				return getDatatype() != null;
			case UMLPackage.PORT__IS_DERIVED :
				return ((eFlags & IS_DERIVED_EFLAG) != 0) != IS_DERIVED_EDEFAULT;
			case UMLPackage.PORT__IS_DERIVED_UNION :
				return ((eFlags & IS_DERIVED_UNION_EFLAG) != 0) != IS_DERIVED_UNION_EDEFAULT;
			case UMLPackage.PORT__DEFAULT :
				return isSetDefault();
			case UMLPackage.PORT__AGGREGATION :
				return eVirtualGet(UMLPackage.PORT__AGGREGATION,
					AGGREGATION_EDEFAULT) != AGGREGATION_EDEFAULT;
			case UMLPackage.PORT__IS_COMPOSITE :
				return isComposite() != IS_COMPOSITE_EDEFAULT;
			case UMLPackage.PORT__CLASS_ :
				return getClass_() != null;
			case UMLPackage.PORT__REDEFINED_PROPERTY :
				EList redefinedProperty = (EList) eVirtualGet(UMLPackage.PORT__REDEFINED_PROPERTY);
				return redefinedProperty != null
					&& !redefinedProperty.isEmpty();
			case UMLPackage.PORT__OWNING_ASSOCIATION :
				return basicGetOwningAssociation() != null;
			case UMLPackage.PORT__DEFAULT_VALUE :
				return eVirtualGet(UMLPackage.PORT__DEFAULT_VALUE) != null;
			case UMLPackage.PORT__OPPOSITE :
				return basicGetOpposite() != null;
			case UMLPackage.PORT__SUBSETTED_PROPERTY :
				EList subsettedProperty = (EList) eVirtualGet(UMLPackage.PORT__SUBSETTED_PROPERTY);
				return subsettedProperty != null
					&& !subsettedProperty.isEmpty();
			case UMLPackage.PORT__ASSOCIATION :
				return eVirtualGet(UMLPackage.PORT__ASSOCIATION) != null;
			case UMLPackage.PORT__QUALIFIER :
				EList qualifier = (EList) eVirtualGet(UMLPackage.PORT__QUALIFIER);
				return qualifier != null && !qualifier.isEmpty();
			case UMLPackage.PORT__ASSOCIATION_END :
				return getAssociationEnd() != null;
			case UMLPackage.PORT__IS_BEHAVIOR :
				return ((eFlags & IS_BEHAVIOR_EFLAG) != 0) != IS_BEHAVIOR_EDEFAULT;
			case UMLPackage.PORT__IS_SERVICE :
				return ((eFlags & IS_SERVICE_EFLAG) != 0) != IS_SERVICE_EDEFAULT;
			case UMLPackage.PORT__REQUIRED :
				return !getRequireds().isEmpty();
			case UMLPackage.PORT__REDEFINED_PORT :
				EList redefinedPort = (EList) eVirtualGet(UMLPackage.PORT__REDEFINED_PORT);
				return redefinedPort != null && !redefinedPort.isEmpty();
			case UMLPackage.PORT__PROVIDED :
				return !getProvideds().isEmpty();
			case UMLPackage.PORT__PROTOCOL :
				return eVirtualGet(UMLPackage.PORT__PROTOCOL) != null;
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
		result.append(" (isBehavior: "); //$NON-NLS-1$
		result.append((eFlags & IS_BEHAVIOR_EFLAG) != 0);
		result.append(", isService: "); //$NON-NLS-1$
		result.append((eFlags & IS_SERVICE_EFLAG) != 0);
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
			|| eIsSet(UMLPackage.PORT__REDEFINED_PORT);
	}

} //PortImpl
