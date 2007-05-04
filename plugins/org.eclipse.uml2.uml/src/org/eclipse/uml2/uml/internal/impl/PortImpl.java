/*
 * Copyright (c) 2005, 2007 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *
 * $Id: PortImpl.java,v 1.29 2007/05/04 20:35:34 khussey Exp $
 */
package org.eclipse.uml2.uml.internal.impl;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.eclipse.uml2.common.util.CacheAdapter;
import org.eclipse.uml2.common.util.DerivedUnionEObjectEList;

import org.eclipse.uml2.uml.AggregationKind;
import org.eclipse.uml2.uml.Association;
import org.eclipse.uml2.uml.Comment;
import org.eclipse.uml2.uml.ConnectorEnd;
import org.eclipse.uml2.uml.DataType;
import org.eclipse.uml2.uml.Dependency;
import org.eclipse.uml2.uml.Deployment;
import org.eclipse.uml2.uml.Interface;
import org.eclipse.uml2.uml.Port;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.ProtocolStateMachine;
import org.eclipse.uml2.uml.RedefinableElement;
import org.eclipse.uml2.uml.StringExpression;
import org.eclipse.uml2.uml.TemplateBinding;
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
	protected static final int IS_BEHAVIOR_EFLAG = 1 << 17;

	/**
	 * The default value of the '{@link #isService() <em>Is Service</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isService()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_SERVICE_EDEFAULT = true;

	/**
	 * The flag representing the value of the '{@link #isService() <em>Is Service</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isService()
	 * @generated
	 * @ordered
	 */
	protected static final int IS_SERVICE_EFLAG = 1 << 18;

	/**
	 * The cached value of the '{@link #getRedefinedPorts() <em>Redefined Port</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRedefinedPorts()
	 * @generated
	 * @ordered
	 */
	protected EList<Port> redefinedPorts;

	/**
	 * The cached value of the '{@link #getProtocol() <em>Protocol</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProtocol()
	 * @generated
	 * @ordered
	 */
	protected ProtocolStateMachine protocol;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PortImpl() {
		super();
		eFlags |= IS_SERVICE_EFLAG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UMLPackage.Literals.PORT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RedefinableElement> getRedefinedElements() {
		CacheAdapter cache = getCacheAdapter();
		if (cache != null) {
			Resource eResource = eResource();
			@SuppressWarnings("unchecked")
			EList<RedefinableElement> redefinedElements = (EList<RedefinableElement>) cache
				.get(eResource, this,
					UMLPackage.Literals.REDEFINABLE_ELEMENT__REDEFINED_ELEMENT);
			if (redefinedElements == null) {
				cache
					.put(
						eResource,
						this,
						UMLPackage.Literals.REDEFINABLE_ELEMENT__REDEFINED_ELEMENT,
						redefinedElements = new DerivedUnionEObjectEList<RedefinableElement>(
							RedefinableElement.class, this,
							UMLPackage.PORT__REDEFINED_ELEMENT,
							REDEFINED_ELEMENT_ESUBSETS));
			}
			return redefinedElements;
		}
		return new DerivedUnionEObjectEList<RedefinableElement>(
			RedefinableElement.class, this, UMLPackage.PORT__REDEFINED_ELEMENT,
			REDEFINED_ELEMENT_ESUBSETS);
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
	public EList<Interface> getRequireds() {
		CacheAdapter cache = getCacheAdapter();
		if (cache != null) {
			@SuppressWarnings("unchecked")
			EList<Interface> result = (EList<Interface>) cache.get(this,
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
		return getRequired(name, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Interface getRequired(String name, boolean ignoreCase) {
		requiredLoop : for (Interface required : getRequireds()) {
			if (name != null && !(ignoreCase
				? name.equalsIgnoreCase(required.getName())
				: name.equals(required.getName())))
				continue requiredLoop;
			return required;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Port> getRedefinedPorts() {
		if (redefinedPorts == null) {
			redefinedPorts = new EObjectResolvingEList<Port>(Port.class, this,
				UMLPackage.PORT__REDEFINED_PORT);
		}
		return redefinedPorts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Port getRedefinedPort(String name, Type type) {
		return getRedefinedPort(name, type, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Port getRedefinedPort(String name, Type type, boolean ignoreCase) {
		redefinedPortLoop : for (Port redefinedPort : getRedefinedPorts()) {
			if (name != null && !(ignoreCase
				? name.equalsIgnoreCase(redefinedPort.getName())
				: name.equals(redefinedPort.getName())))
				continue redefinedPortLoop;
			if (type != null && !type.equals(redefinedPort.getType()))
				continue redefinedPortLoop;
			return redefinedPort;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Interface> getProvideds() {
		CacheAdapter cache = getCacheAdapter();
		if (cache != null) {
			@SuppressWarnings("unchecked")
			EList<Interface> result = (EList<Interface>) cache.get(this,
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
		return getProvided(name, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Interface getProvided(String name, boolean ignoreCase) {
		providedLoop : for (Interface provided : getProvideds()) {
			if (name != null && !(ignoreCase
				? name.equalsIgnoreCase(provided.getName())
				: name.equals(provided.getName())))
				continue providedLoop;
			return provided;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProtocolStateMachine getProtocol() {
		if (protocol != null && protocol.eIsProxy()) {
			InternalEObject oldProtocol = (InternalEObject) protocol;
			protocol = (ProtocolStateMachine) eResolveProxy(oldProtocol);
			if (protocol != oldProtocol) {
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
		return protocol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProtocol(ProtocolStateMachine newProtocol) {
		ProtocolStateMachine oldProtocol = protocol;
		protocol = newProtocol;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.PORT__PROTOCOL, oldProtocol, protocol));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRequiredInterfaces(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PortOperations.validateRequiredInterfaces(this, diagnostics,
			context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePortAggregation(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PortOperations.validatePortAggregation(this, diagnostics,
			context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePortDestroyed(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PortOperations.validatePortDestroyed(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDefaultValue(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PortOperations.validateDefaultValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
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
				if (resolve)
					return getNameExpression();
				return basicGetNameExpression();
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
				if (resolve)
					return getUpperValue();
				return basicGetUpperValue();
			case UMLPackage.PORT__LOWER_VALUE :
				if (resolve)
					return getLowerValue();
				return basicGetLowerValue();
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
				if (resolve)
					return getOwnedTemplateSignature();
				return basicGetOwnedTemplateSignature();
			case UMLPackage.PORT__CLASS :
				if (resolve)
					return getClass_();
				return basicGetClass_();
			case UMLPackage.PORT__DATATYPE :
				if (resolve)
					return getDatatype();
				return basicGetDatatype();
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
			case UMLPackage.PORT__REDEFINED_PROPERTY :
				return getRedefinedProperties();
			case UMLPackage.PORT__OWNING_ASSOCIATION :
				if (resolve)
					return getOwningAssociation();
				return basicGetOwningAssociation();
			case UMLPackage.PORT__DEFAULT_VALUE :
				if (resolve)
					return getDefaultValue();
				return basicGetDefaultValue();
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
				if (resolve)
					return getAssociationEnd();
				return basicGetAssociationEnd();
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
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case UMLPackage.PORT__EANNOTATIONS :
				getEAnnotations().clear();
				getEAnnotations().addAll(
					(Collection<? extends EAnnotation>) newValue);
				return;
			case UMLPackage.PORT__OWNED_COMMENT :
				getOwnedComments().clear();
				getOwnedComments().addAll(
					(Collection<? extends Comment>) newValue);
				return;
			case UMLPackage.PORT__NAME :
				setName((String) newValue);
				return;
			case UMLPackage.PORT__VISIBILITY :
				setVisibility((VisibilityKind) newValue);
				return;
			case UMLPackage.PORT__CLIENT_DEPENDENCY :
				getClientDependencies().clear();
				getClientDependencies().addAll(
					(Collection<? extends Dependency>) newValue);
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
				getEnds().addAll((Collection<? extends ConnectorEnd>) newValue);
				return;
			case UMLPackage.PORT__DEPLOYMENT :
				getDeployments().clear();
				getDeployments().addAll(
					(Collection<? extends Deployment>) newValue);
				return;
			case UMLPackage.PORT__TEMPLATE_BINDING :
				getTemplateBindings().clear();
				getTemplateBindings().addAll(
					(Collection<? extends TemplateBinding>) newValue);
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
				getRedefinedProperties().addAll(
					(Collection<? extends Property>) newValue);
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
				getSubsettedProperties().addAll(
					(Collection<? extends Property>) newValue);
				return;
			case UMLPackage.PORT__ASSOCIATION :
				setAssociation((Association) newValue);
				return;
			case UMLPackage.PORT__QUALIFIER :
				getQualifiers().clear();
				getQualifiers().addAll(
					(Collection<? extends Property>) newValue);
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
				getRedefinedPorts().addAll(
					(Collection<? extends Port>) newValue);
				return;
			case UMLPackage.PORT__PROTOCOL :
				setProtocol((ProtocolStateMachine) newValue);
				return;
		}
		eDynamicSet(featureID, newValue);
	}

	@Override
	public void eDynamicSet(int featureID, Object newValue) {

		if (featureID == UMLPackage.PORT__CLASS) {
			setClass_((org.eclipse.uml2.uml.Class) newValue);
			return;
		}

		super.eDynamicSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
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
				setUpper(UPPER_EDEFAULT);
				return;
			case UMLPackage.PORT__LOWER :
				setLower(LOWER_EDEFAULT);
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
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case UMLPackage.PORT__EANNOTATIONS :
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UMLPackage.PORT__OWNED_ELEMENT :
				return isSetOwnedElements();
			case UMLPackage.PORT__OWNER :
				return isSetOwner();
			case UMLPackage.PORT__OWNED_COMMENT :
				return ownedComments != null && !ownedComments.isEmpty();
			case UMLPackage.PORT__NAME :
				return isSetName();
			case UMLPackage.PORT__VISIBILITY :
				return isSetVisibility();
			case UMLPackage.PORT__QUALIFIED_NAME :
				return QUALIFIED_NAME_EDEFAULT == null
					? getQualifiedName() != null
					: !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case UMLPackage.PORT__CLIENT_DEPENDENCY :
				return clientDependencies != null
					&& !clientDependencies.isEmpty();
			case UMLPackage.PORT__NAMESPACE :
				return isSetNamespace();
			case UMLPackage.PORT__NAME_EXPRESSION :
				return nameExpression != null;
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
				return type != null;
			case UMLPackage.PORT__IS_ORDERED :
				return ((eFlags & IS_ORDERED_EFLAG) != 0) != IS_ORDERED_EDEFAULT;
			case UMLPackage.PORT__IS_UNIQUE :
				return ((eFlags & IS_UNIQUE_EFLAG) != 0) != IS_UNIQUE_EDEFAULT;
			case UMLPackage.PORT__UPPER :
				return getUpper() != UPPER_EDEFAULT;
			case UMLPackage.PORT__LOWER :
				return getLower() != LOWER_EDEFAULT;
			case UMLPackage.PORT__UPPER_VALUE :
				return upperValue != null;
			case UMLPackage.PORT__LOWER_VALUE :
				return lowerValue != null;
			case UMLPackage.PORT__IS_READ_ONLY :
				return isSetIsReadOnly();
			case UMLPackage.PORT__OWNING_TEMPLATE_PARAMETER :
				return basicGetOwningTemplateParameter() != null;
			case UMLPackage.PORT__TEMPLATE_PARAMETER :
				return isSetTemplateParameter();
			case UMLPackage.PORT__END :
				return !getEnds().isEmpty();
			case UMLPackage.PORT__DEPLOYMENT :
				return deployments != null && !deployments.isEmpty();
			case UMLPackage.PORT__DEPLOYED_ELEMENT :
				return !getDeployedElements().isEmpty();
			case UMLPackage.PORT__TEMPLATE_BINDING :
				return templateBindings != null && !templateBindings.isEmpty();
			case UMLPackage.PORT__OWNED_TEMPLATE_SIGNATURE :
				return ownedTemplateSignature != null;
			case UMLPackage.PORT__CLASS :
				return basicGetClass_() != null;
			case UMLPackage.PORT__DATATYPE :
				return basicGetDatatype() != null;
			case UMLPackage.PORT__IS_DERIVED :
				return ((eFlags & IS_DERIVED_EFLAG) != 0) != IS_DERIVED_EDEFAULT;
			case UMLPackage.PORT__IS_DERIVED_UNION :
				return ((eFlags & IS_DERIVED_UNION_EFLAG) != 0) != IS_DERIVED_UNION_EDEFAULT;
			case UMLPackage.PORT__DEFAULT :
				return isSetDefault();
			case UMLPackage.PORT__AGGREGATION :
				return aggregation != AGGREGATION_EDEFAULT;
			case UMLPackage.PORT__IS_COMPOSITE :
				return isComposite() != IS_COMPOSITE_EDEFAULT;
			case UMLPackage.PORT__REDEFINED_PROPERTY :
				return redefinedProperties != null
					&& !redefinedProperties.isEmpty();
			case UMLPackage.PORT__OWNING_ASSOCIATION :
				return basicGetOwningAssociation() != null;
			case UMLPackage.PORT__DEFAULT_VALUE :
				return defaultValue != null;
			case UMLPackage.PORT__OPPOSITE :
				return basicGetOpposite() != null;
			case UMLPackage.PORT__SUBSETTED_PROPERTY :
				return subsettedProperties != null
					&& !subsettedProperties.isEmpty();
			case UMLPackage.PORT__ASSOCIATION :
				return association != null;
			case UMLPackage.PORT__QUALIFIER :
				return qualifiers != null && !qualifiers.isEmpty();
			case UMLPackage.PORT__ASSOCIATION_END :
				return basicGetAssociationEnd() != null;
			case UMLPackage.PORT__IS_BEHAVIOR :
				return ((eFlags & IS_BEHAVIOR_EFLAG) != 0) != IS_BEHAVIOR_EDEFAULT;
			case UMLPackage.PORT__IS_SERVICE :
				return ((eFlags & IS_SERVICE_EFLAG) != 0) != IS_SERVICE_EDEFAULT;
			case UMLPackage.PORT__REQUIRED :
				return !getRequireds().isEmpty();
			case UMLPackage.PORT__REDEFINED_PORT :
				return redefinedPorts != null && !redefinedPorts.isEmpty();
			case UMLPackage.PORT__PROVIDED :
				return !getProvideds().isEmpty();
			case UMLPackage.PORT__PROTOCOL :
				return protocol != null;
		}
		return eDynamicIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
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
	 * The array of subset feature identifiers for the '{@link #getRedefinedElements() <em>Redefined Element</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRedefinedElements()
	 * @generated
	 * @ordered
	 */
	protected static final int[] REDEFINED_ELEMENT_ESUBSETS = new int[]{
		UMLPackage.PORT__REDEFINED_PROPERTY, UMLPackage.PORT__REDEFINED_PORT};

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetRedefinedElements() {
		return super.isSetRedefinedElements()
			|| eIsSet(UMLPackage.PORT__REDEFINED_PORT);
	}

} //PortImpl
