/*
 * Copyright (c) 2005, 2016 IBM Corporation, Embarcadero Technologies, CEA, and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *   Kenn Hussey (Embarcadero Technologies) - 204200
 *   Kenn Hussey - 286329, 323181
 *   Kenn Hussey (CEA) - 327039, 351774, 418466, 451350, 485756
 *
 */
package org.eclipse.uml2.uml.internal.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.uml2.common.util.CacheAdapter;
import org.eclipse.uml2.common.util.SubsetSupersetEObjectResolvingEList;

import org.eclipse.uml2.uml.AggregationKind;
import org.eclipse.uml2.uml.Association;
import org.eclipse.uml2.uml.Comment;
import org.eclipse.uml2.uml.DataType;
import org.eclipse.uml2.uml.Deployment;
import org.eclipse.uml2.uml.Interface;
import org.eclipse.uml2.uml.MultiplicityElement;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Namespace;
import org.eclipse.uml2.uml.ParameterableElement;
import org.eclipse.uml2.uml.Port;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.ProtocolStateMachine;
import org.eclipse.uml2.uml.RedefinableElement;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.StringExpression;
import org.eclipse.uml2.uml.TemplateParameter;
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
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.PortImpl#getRedefinedProperties <em>Redefined Property</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.PortImpl#isBehavior <em>Is Behavior</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.PortImpl#isConjugated <em>Is Conjugated</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.PortImpl#isService <em>Is Service</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.PortImpl#getProtocol <em>Protocol</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.PortImpl#getProvideds <em>Provided</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.PortImpl#getRedefinedPorts <em>Redefined Port</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.PortImpl#getRequireds <em>Required</em>}</li>
 * </ul>
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
	protected static final int IS_BEHAVIOR_EFLAG = 1 << 22;

	/**
	 * The default value of the '{@link #isConjugated() <em>Is Conjugated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isConjugated()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_CONJUGATED_EDEFAULT = false;

	/**
	 * The flag representing the value of the '{@link #isConjugated() <em>Is Conjugated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isConjugated()
	 * @generated
	 * @ordered
	 */
	protected static final int IS_CONJUGATED_EFLAG = 1 << 23;

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
	protected static final int IS_SERVICE_EFLAG = 1 << 24;

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
	 * The cached value of the '{@link #getRedefinedPorts() <em>Redefined Port</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRedefinedPorts()
	 * @generated
	 * @ordered
	 */
	protected EList<Port> redefinedPorts;

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
	public EList<Property> getRedefinedProperties() {
		if (redefinedProperties == null) {
			redefinedProperties = new SubsetSupersetEObjectResolvingEList<Property>(
				Property.class, this, UMLPackage.PORT__REDEFINED_PROPERTY, null,
				REDEFINED_PROPERTY_ESUBSETS);
		}
		return redefinedProperties;
	}

	/**
	 * The array of subset feature identifiers for the '{@link #getRedefinedProperties() <em>Redefined Property</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRedefinedProperties()
	 * @generated
	 * @ordered
	 */
	protected static final int[] REDEFINED_PROPERTY_ESUBSETS = new int[]{
		UMLPackage.PORT__REDEFINED_PORT};

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
	public boolean isConjugated() {
		return (eFlags & IS_CONJUGATED_EFLAG) != 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsConjugated(boolean newIsConjugated) {
		boolean oldIsConjugated = (eFlags & IS_CONJUGATED_EFLAG) != 0;
		if (newIsConjugated)
			eFlags |= IS_CONJUGATED_EFLAG;
		else
			eFlags &= ~IS_CONJUGATED_EFLAG;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.PORT__IS_CONJUGATED, oldIsConjugated,
				newIsConjugated));
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
			redefinedPorts = new SubsetSupersetEObjectResolvingEList<Port>(
				Port.class, this, UMLPackage.PORT__REDEFINED_PORT,
				REDEFINED_PORT_ESUPERSETS, null);
		}
		return redefinedPorts;
	}

	/**
	 * The array of superset feature identifiers for the '{@link #getRedefinedPorts() <em>Redefined Port</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRedefinedPorts()
	 * @generated
	 * @ordered
	 */
	protected static final int[] REDEFINED_PORT_ESUPERSETS = new int[]{
		UMLPackage.PORT__REDEFINED_PROPERTY};

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
	public boolean validateDefaultValue(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PortOperations.validateDefaultValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEncapsulatedOwner(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PortOperations.validateEncapsulatedOwner(this, diagnostics,
			context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Interface> basicProvided() {
		CacheAdapter cache = getCacheAdapter();
		if (cache != null) {
			@SuppressWarnings("unchecked")
			EList<Interface> result = (EList<Interface>) cache.get(this,
				UMLPackage.Literals.PORT___BASIC_PROVIDED);
			if (result == null) {
				cache.put(this, UMLPackage.Literals.PORT___BASIC_PROVIDED,
					result = PortOperations.basicProvided(this));
			}
			return result;
		}
		return PortOperations.basicProvided(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Interface> basicRequired() {
		CacheAdapter cache = getCacheAdapter();
		if (cache != null) {
			@SuppressWarnings("unchecked")
			EList<Interface> result = (EList<Interface>) cache.get(this,
				UMLPackage.Literals.PORT___BASIC_REQUIRED);
			if (result == null) {
				cache.put(this, UMLPackage.Literals.PORT___BASIC_REQUIRED,
					result = PortOperations.basicRequired(this));
			}
			return result;
		}
		return PortOperations.basicRequired(this);
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
			case UMLPackage.PORT__OWNED_COMMENT :
				return getOwnedComments();
			case UMLPackage.PORT__OWNED_ELEMENT :
				return getOwnedElements();
			case UMLPackage.PORT__OWNER :
				if (resolve)
					return getOwner();
				return basicGetOwner();
			case UMLPackage.PORT__CLIENT_DEPENDENCY :
				return getClientDependencies();
			case UMLPackage.PORT__NAME :
				return getName();
			case UMLPackage.PORT__NAME_EXPRESSION :
				if (resolve)
					return getNameExpression();
				return basicGetNameExpression();
			case UMLPackage.PORT__NAMESPACE :
				if (resolve)
					return getNamespace();
				return basicGetNamespace();
			case UMLPackage.PORT__QUALIFIED_NAME :
				return getQualifiedName();
			case UMLPackage.PORT__VISIBILITY :
				return getVisibility();
			case UMLPackage.PORT__IS_LEAF :
				return isLeaf();
			case UMLPackage.PORT__REDEFINED_ELEMENT :
				return getRedefinedElements();
			case UMLPackage.PORT__REDEFINITION_CONTEXT :
				return getRedefinitionContexts();
			case UMLPackage.PORT__FEATURING_CLASSIFIER :
				return getFeaturingClassifiers();
			case UMLPackage.PORT__IS_STATIC :
				return isStatic();
			case UMLPackage.PORT__TYPE :
				if (resolve)
					return getType();
				return basicGetType();
			case UMLPackage.PORT__IS_ORDERED :
				return isOrdered();
			case UMLPackage.PORT__IS_UNIQUE :
				return isUnique();
			case UMLPackage.PORT__LOWER :
				return getLower();
			case UMLPackage.PORT__LOWER_VALUE :
				if (resolve)
					return getLowerValue();
				return basicGetLowerValue();
			case UMLPackage.PORT__UPPER :
				return getUpper();
			case UMLPackage.PORT__UPPER_VALUE :
				if (resolve)
					return getUpperValue();
				return basicGetUpperValue();
			case UMLPackage.PORT__IS_READ_ONLY :
				return isReadOnly();
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
			case UMLPackage.PORT__DEPLOYED_ELEMENT :
				return getDeployedElements();
			case UMLPackage.PORT__DEPLOYMENT :
				return getDeployments();
			case UMLPackage.PORT__DATATYPE :
				if (resolve)
					return getDatatype();
				return basicGetDatatype();
			case UMLPackage.PORT__INTERFACE :
				if (resolve)
					return getInterface();
				return basicGetInterface();
			case UMLPackage.PORT__DEFAULT :
				return getDefault();
			case UMLPackage.PORT__AGGREGATION :
				return getAggregation();
			case UMLPackage.PORT__ASSOCIATION_END :
				if (resolve)
					return getAssociationEnd();
				return basicGetAssociationEnd();
			case UMLPackage.PORT__QUALIFIER :
				return getQualifiers();
			case UMLPackage.PORT__CLASS :
				if (resolve)
					return getClass_();
				return basicGetClass_();
			case UMLPackage.PORT__DEFAULT_VALUE :
				if (resolve)
					return getDefaultValue();
				return basicGetDefaultValue();
			case UMLPackage.PORT__IS_COMPOSITE :
				return isComposite();
			case UMLPackage.PORT__IS_DERIVED :
				return isDerived();
			case UMLPackage.PORT__IS_DERIVED_UNION :
				return isDerivedUnion();
			case UMLPackage.PORT__IS_ID :
				return isID();
			case UMLPackage.PORT__OPPOSITE :
				if (resolve)
					return getOpposite();
				return basicGetOpposite();
			case UMLPackage.PORT__OWNING_ASSOCIATION :
				if (resolve)
					return getOwningAssociation();
				return basicGetOwningAssociation();
			case UMLPackage.PORT__REDEFINED_PROPERTY :
				return getRedefinedProperties();
			case UMLPackage.PORT__SUBSETTED_PROPERTY :
				return getSubsettedProperties();
			case UMLPackage.PORT__ASSOCIATION :
				if (resolve)
					return getAssociation();
				return basicGetAssociation();
			case UMLPackage.PORT__IS_BEHAVIOR :
				return isBehavior();
			case UMLPackage.PORT__IS_CONJUGATED :
				return isConjugated();
			case UMLPackage.PORT__IS_SERVICE :
				return isService();
			case UMLPackage.PORT__PROTOCOL :
				if (resolve)
					return getProtocol();
				return basicGetProtocol();
			case UMLPackage.PORT__PROVIDED :
				return getProvideds();
			case UMLPackage.PORT__REDEFINED_PORT :
				return getRedefinedPorts();
			case UMLPackage.PORT__REQUIRED :
				return getRequireds();
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
				getEAnnotations()
					.addAll((Collection<? extends EAnnotation>) newValue);
				return;
			case UMLPackage.PORT__OWNED_COMMENT :
				getOwnedComments().clear();
				getOwnedComments()
					.addAll((Collection<? extends Comment>) newValue);
				return;
			case UMLPackage.PORT__NAME :
				setName((String) newValue);
				return;
			case UMLPackage.PORT__NAME_EXPRESSION :
				setNameExpression((StringExpression) newValue);
				return;
			case UMLPackage.PORT__VISIBILITY :
				setVisibility((VisibilityKind) newValue);
				return;
			case UMLPackage.PORT__IS_LEAF :
				setIsLeaf((Boolean) newValue);
				return;
			case UMLPackage.PORT__IS_STATIC :
				setIsStatic((Boolean) newValue);
				return;
			case UMLPackage.PORT__TYPE :
				setType((Type) newValue);
				return;
			case UMLPackage.PORT__IS_ORDERED :
				setIsOrdered((Boolean) newValue);
				return;
			case UMLPackage.PORT__IS_UNIQUE :
				setIsUnique((Boolean) newValue);
				return;
			case UMLPackage.PORT__LOWER :
				setLower((Integer) newValue);
				return;
			case UMLPackage.PORT__LOWER_VALUE :
				setLowerValue((ValueSpecification) newValue);
				return;
			case UMLPackage.PORT__UPPER :
				setUpper((Integer) newValue);
				return;
			case UMLPackage.PORT__UPPER_VALUE :
				setUpperValue((ValueSpecification) newValue);
				return;
			case UMLPackage.PORT__IS_READ_ONLY :
				setIsReadOnly((Boolean) newValue);
				return;
			case UMLPackage.PORT__OWNING_TEMPLATE_PARAMETER :
				setOwningTemplateParameter((TemplateParameter) newValue);
				return;
			case UMLPackage.PORT__TEMPLATE_PARAMETER :
				setTemplateParameter((TemplateParameter) newValue);
				return;
			case UMLPackage.PORT__DEPLOYMENT :
				getDeployments().clear();
				getDeployments()
					.addAll((Collection<? extends Deployment>) newValue);
				return;
			case UMLPackage.PORT__DATATYPE :
				setDatatype((DataType) newValue);
				return;
			case UMLPackage.PORT__INTERFACE :
				setInterface((Interface) newValue);
				return;
			case UMLPackage.PORT__DEFAULT :
				setDefault((String) newValue);
				return;
			case UMLPackage.PORT__AGGREGATION :
				setAggregation((AggregationKind) newValue);
				return;
			case UMLPackage.PORT__ASSOCIATION_END :
				setAssociationEnd((Property) newValue);
				return;
			case UMLPackage.PORT__QUALIFIER :
				getQualifiers().clear();
				getQualifiers()
					.addAll((Collection<? extends Property>) newValue);
				return;
			case UMLPackage.PORT__DEFAULT_VALUE :
				setDefaultValue((ValueSpecification) newValue);
				return;
			case UMLPackage.PORT__IS_COMPOSITE :
				setIsComposite((Boolean) newValue);
				return;
			case UMLPackage.PORT__IS_DERIVED :
				setIsDerived((Boolean) newValue);
				return;
			case UMLPackage.PORT__IS_DERIVED_UNION :
				setIsDerivedUnion((Boolean) newValue);
				return;
			case UMLPackage.PORT__IS_ID :
				setIsID((Boolean) newValue);
				return;
			case UMLPackage.PORT__OPPOSITE :
				setOpposite((Property) newValue);
				return;
			case UMLPackage.PORT__OWNING_ASSOCIATION :
				setOwningAssociation((Association) newValue);
				return;
			case UMLPackage.PORT__REDEFINED_PROPERTY :
				getRedefinedProperties().clear();
				getRedefinedProperties()
					.addAll((Collection<? extends Property>) newValue);
				return;
			case UMLPackage.PORT__SUBSETTED_PROPERTY :
				getSubsettedProperties().clear();
				getSubsettedProperties()
					.addAll((Collection<? extends Property>) newValue);
				return;
			case UMLPackage.PORT__ASSOCIATION :
				setAssociation((Association) newValue);
				return;
			case UMLPackage.PORT__IS_BEHAVIOR :
				setIsBehavior((Boolean) newValue);
				return;
			case UMLPackage.PORT__IS_CONJUGATED :
				setIsConjugated((Boolean) newValue);
				return;
			case UMLPackage.PORT__IS_SERVICE :
				setIsService((Boolean) newValue);
				return;
			case UMLPackage.PORT__PROTOCOL :
				setProtocol((ProtocolStateMachine) newValue);
				return;
			case UMLPackage.PORT__REDEFINED_PORT :
				getRedefinedPorts().clear();
				getRedefinedPorts()
					.addAll((Collection<? extends Port>) newValue);
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
			case UMLPackage.PORT__NAME_EXPRESSION :
				setNameExpression((StringExpression) null);
				return;
			case UMLPackage.PORT__VISIBILITY :
				unsetVisibility();
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
			case UMLPackage.PORT__LOWER :
				setLower(LOWER_EDEFAULT);
				return;
			case UMLPackage.PORT__LOWER_VALUE :
				setLowerValue((ValueSpecification) null);
				return;
			case UMLPackage.PORT__UPPER :
				setUpper(UPPER_EDEFAULT);
				return;
			case UMLPackage.PORT__UPPER_VALUE :
				setUpperValue((ValueSpecification) null);
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
			case UMLPackage.PORT__DEPLOYMENT :
				getDeployments().clear();
				return;
			case UMLPackage.PORT__DATATYPE :
				setDatatype((DataType) null);
				return;
			case UMLPackage.PORT__INTERFACE :
				setInterface((Interface) null);
				return;
			case UMLPackage.PORT__DEFAULT :
				unsetDefault();
				return;
			case UMLPackage.PORT__AGGREGATION :
				setAggregation(AGGREGATION_EDEFAULT);
				return;
			case UMLPackage.PORT__ASSOCIATION_END :
				setAssociationEnd((Property) null);
				return;
			case UMLPackage.PORT__QUALIFIER :
				getQualifiers().clear();
				return;
			case UMLPackage.PORT__DEFAULT_VALUE :
				setDefaultValue((ValueSpecification) null);
				return;
			case UMLPackage.PORT__IS_COMPOSITE :
				setIsComposite(IS_COMPOSITE_EDEFAULT);
				return;
			case UMLPackage.PORT__IS_DERIVED :
				setIsDerived(IS_DERIVED_EDEFAULT);
				return;
			case UMLPackage.PORT__IS_DERIVED_UNION :
				setIsDerivedUnion(IS_DERIVED_UNION_EDEFAULT);
				return;
			case UMLPackage.PORT__IS_ID :
				setIsID(IS_ID_EDEFAULT);
				return;
			case UMLPackage.PORT__OPPOSITE :
				setOpposite((Property) null);
				return;
			case UMLPackage.PORT__OWNING_ASSOCIATION :
				setOwningAssociation((Association) null);
				return;
			case UMLPackage.PORT__REDEFINED_PROPERTY :
				getRedefinedProperties().clear();
				return;
			case UMLPackage.PORT__SUBSETTED_PROPERTY :
				getSubsettedProperties().clear();
				return;
			case UMLPackage.PORT__ASSOCIATION :
				setAssociation((Association) null);
				return;
			case UMLPackage.PORT__IS_BEHAVIOR :
				setIsBehavior(IS_BEHAVIOR_EDEFAULT);
				return;
			case UMLPackage.PORT__IS_CONJUGATED :
				setIsConjugated(IS_CONJUGATED_EDEFAULT);
				return;
			case UMLPackage.PORT__IS_SERVICE :
				setIsService(IS_SERVICE_EDEFAULT);
				return;
			case UMLPackage.PORT__PROTOCOL :
				setProtocol((ProtocolStateMachine) null);
				return;
			case UMLPackage.PORT__REDEFINED_PORT :
				getRedefinedPorts().clear();
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
			case UMLPackage.PORT__OWNED_COMMENT :
				return ownedComments != null && !ownedComments.isEmpty();
			case UMLPackage.PORT__OWNED_ELEMENT :
				return isSetOwnedElements();
			case UMLPackage.PORT__OWNER :
				return isSetOwner();
			case UMLPackage.PORT__CLIENT_DEPENDENCY :
				return !getClientDependencies().isEmpty();
			case UMLPackage.PORT__NAME :
				return isSetName();
			case UMLPackage.PORT__NAME_EXPRESSION :
				return nameExpression != null;
			case UMLPackage.PORT__NAMESPACE :
				return isSetNamespace();
			case UMLPackage.PORT__QUALIFIED_NAME :
				return QUALIFIED_NAME_EDEFAULT == null
					? getQualifiedName() != null
					: !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case UMLPackage.PORT__VISIBILITY :
				return isSetVisibility();
			case UMLPackage.PORT__IS_LEAF :
				return ((eFlags & IS_LEAF_EFLAG) != 0) != IS_LEAF_EDEFAULT;
			case UMLPackage.PORT__REDEFINED_ELEMENT :
				return isSetRedefinedElements();
			case UMLPackage.PORT__REDEFINITION_CONTEXT :
				return isSetRedefinitionContexts();
			case UMLPackage.PORT__FEATURING_CLASSIFIER :
				return isSetFeaturingClassifiers();
			case UMLPackage.PORT__IS_STATIC :
				return ((eFlags & IS_STATIC_EFLAG) != 0) != IS_STATIC_EDEFAULT;
			case UMLPackage.PORT__TYPE :
				return type != null;
			case UMLPackage.PORT__IS_ORDERED :
				return ((eFlags
					& IS_ORDERED_EFLAG) != 0) != IS_ORDERED_EDEFAULT;
			case UMLPackage.PORT__IS_UNIQUE :
				return ((eFlags & IS_UNIQUE_EFLAG) != 0) != IS_UNIQUE_EDEFAULT;
			case UMLPackage.PORT__LOWER :
				return getLower() != LOWER_EDEFAULT;
			case UMLPackage.PORT__LOWER_VALUE :
				return lowerValue != null;
			case UMLPackage.PORT__UPPER :
				return getUpper() != UPPER_EDEFAULT;
			case UMLPackage.PORT__UPPER_VALUE :
				return upperValue != null;
			case UMLPackage.PORT__IS_READ_ONLY :
				return ((eFlags
					& IS_READ_ONLY_EFLAG) != 0) != IS_READ_ONLY_EDEFAULT;
			case UMLPackage.PORT__OWNING_TEMPLATE_PARAMETER :
				return basicGetOwningTemplateParameter() != null;
			case UMLPackage.PORT__TEMPLATE_PARAMETER :
				return isSetTemplateParameter();
			case UMLPackage.PORT__END :
				return !getEnds().isEmpty();
			case UMLPackage.PORT__DEPLOYED_ELEMENT :
				return !getDeployedElements().isEmpty();
			case UMLPackage.PORT__DEPLOYMENT :
				return deployments != null && !deployments.isEmpty();
			case UMLPackage.PORT__DATATYPE :
				return basicGetDatatype() != null;
			case UMLPackage.PORT__INTERFACE :
				return basicGetInterface() != null;
			case UMLPackage.PORT__DEFAULT :
				return isSetDefault();
			case UMLPackage.PORT__AGGREGATION :
				return (eFlags
					& AGGREGATION_EFLAG) != AGGREGATION_EFLAG_DEFAULT;
			case UMLPackage.PORT__ASSOCIATION_END :
				return basicGetAssociationEnd() != null;
			case UMLPackage.PORT__QUALIFIER :
				return qualifiers != null && !qualifiers.isEmpty();
			case UMLPackage.PORT__CLASS :
				return basicGetClass_() != null;
			case UMLPackage.PORT__DEFAULT_VALUE :
				return defaultValue != null;
			case UMLPackage.PORT__IS_COMPOSITE :
				return isComposite() != IS_COMPOSITE_EDEFAULT;
			case UMLPackage.PORT__IS_DERIVED :
				return ((eFlags
					& IS_DERIVED_EFLAG) != 0) != IS_DERIVED_EDEFAULT;
			case UMLPackage.PORT__IS_DERIVED_UNION :
				return ((eFlags
					& IS_DERIVED_UNION_EFLAG) != 0) != IS_DERIVED_UNION_EDEFAULT;
			case UMLPackage.PORT__IS_ID :
				return ((eFlags & IS_ID_EFLAG) != 0) != IS_ID_EDEFAULT;
			case UMLPackage.PORT__OPPOSITE :
				return basicGetOpposite() != null;
			case UMLPackage.PORT__OWNING_ASSOCIATION :
				return basicGetOwningAssociation() != null;
			case UMLPackage.PORT__REDEFINED_PROPERTY :
				return redefinedProperties != null
					&& !redefinedProperties.isEmpty();
			case UMLPackage.PORT__SUBSETTED_PROPERTY :
				return subsettedProperties != null
					&& !subsettedProperties.isEmpty();
			case UMLPackage.PORT__ASSOCIATION :
				return association != null;
			case UMLPackage.PORT__IS_BEHAVIOR :
				return ((eFlags
					& IS_BEHAVIOR_EFLAG) != 0) != IS_BEHAVIOR_EDEFAULT;
			case UMLPackage.PORT__IS_CONJUGATED :
				return ((eFlags
					& IS_CONJUGATED_EFLAG) != 0) != IS_CONJUGATED_EDEFAULT;
			case UMLPackage.PORT__IS_SERVICE :
				return ((eFlags
					& IS_SERVICE_EFLAG) != 0) != IS_SERVICE_EDEFAULT;
			case UMLPackage.PORT__PROTOCOL :
				return protocol != null;
			case UMLPackage.PORT__PROVIDED :
				return !getProvideds().isEmpty();
			case UMLPackage.PORT__REDEFINED_PORT :
				return redefinedPorts != null && !redefinedPorts.isEmpty();
			case UMLPackage.PORT__REQUIRED :
				return !getRequireds().isEmpty();
		}
		return eDynamicIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments)
			throws InvocationTargetException {
		switch (operationID) {
			case UMLPackage.PORT___GET_EANNOTATION__STRING :
				return getEAnnotation((String) arguments.get(0));
			case UMLPackage.PORT___VALIDATE_HAS_OWNER__DIAGNOSTICCHAIN_MAP :
				return validateHasOwner((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.PORT___VALIDATE_NOT_OWN_SELF__DIAGNOSTICCHAIN_MAP :
				return validateNotOwnSelf((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.PORT___ADD_KEYWORD__STRING :
				return addKeyword((String) arguments.get(0));
			case UMLPackage.PORT___APPLY_STEREOTYPE__STEREOTYPE :
				return applyStereotype((Stereotype) arguments.get(0));
			case UMLPackage.PORT___CREATE_EANNOTATION__STRING :
				return createEAnnotation((String) arguments.get(0));
			case UMLPackage.PORT___DESTROY :
				destroy();
				return null;
			case UMLPackage.PORT___GET_KEYWORDS :
				return getKeywords();
			case UMLPackage.PORT___GET_APPLICABLE_STEREOTYPE__STRING :
				return getApplicableStereotype((String) arguments.get(0));
			case UMLPackage.PORT___GET_APPLICABLE_STEREOTYPES :
				return getApplicableStereotypes();
			case UMLPackage.PORT___GET_APPLIED_STEREOTYPE__STRING :
				return getAppliedStereotype((String) arguments.get(0));
			case UMLPackage.PORT___GET_APPLIED_STEREOTYPES :
				return getAppliedStereotypes();
			case UMLPackage.PORT___GET_APPLIED_SUBSTEREOTYPE__STEREOTYPE_STRING :
				return getAppliedSubstereotype((Stereotype) arguments.get(0),
					(String) arguments.get(1));
			case UMLPackage.PORT___GET_APPLIED_SUBSTEREOTYPES__STEREOTYPE :
				return getAppliedSubstereotypes((Stereotype) arguments.get(0));
			case UMLPackage.PORT___GET_MODEL :
				return getModel();
			case UMLPackage.PORT___GET_NEAREST_PACKAGE :
				return getNearestPackage();
			case UMLPackage.PORT___GET_RELATIONSHIPS :
				return getRelationships();
			case UMLPackage.PORT___GET_RELATIONSHIPS__ECLASS :
				return getRelationships((EClass) arguments.get(0));
			case UMLPackage.PORT___GET_REQUIRED_STEREOTYPE__STRING :
				return getRequiredStereotype((String) arguments.get(0));
			case UMLPackage.PORT___GET_REQUIRED_STEREOTYPES :
				return getRequiredStereotypes();
			case UMLPackage.PORT___GET_SOURCE_DIRECTED_RELATIONSHIPS :
				return getSourceDirectedRelationships();
			case UMLPackage.PORT___GET_SOURCE_DIRECTED_RELATIONSHIPS__ECLASS :
				return getSourceDirectedRelationships(
					(EClass) arguments.get(0));
			case UMLPackage.PORT___GET_STEREOTYPE_APPLICATION__STEREOTYPE :
				return getStereotypeApplication((Stereotype) arguments.get(0));
			case UMLPackage.PORT___GET_STEREOTYPE_APPLICATIONS :
				return getStereotypeApplications();
			case UMLPackage.PORT___GET_TARGET_DIRECTED_RELATIONSHIPS :
				return getTargetDirectedRelationships();
			case UMLPackage.PORT___GET_TARGET_DIRECTED_RELATIONSHIPS__ECLASS :
				return getTargetDirectedRelationships(
					(EClass) arguments.get(0));
			case UMLPackage.PORT___GET_VALUE__STEREOTYPE_STRING :
				return getValue((Stereotype) arguments.get(0),
					(String) arguments.get(1));
			case UMLPackage.PORT___HAS_KEYWORD__STRING :
				return hasKeyword((String) arguments.get(0));
			case UMLPackage.PORT___HAS_VALUE__STEREOTYPE_STRING :
				return hasValue((Stereotype) arguments.get(0),
					(String) arguments.get(1));
			case UMLPackage.PORT___IS_STEREOTYPE_APPLICABLE__STEREOTYPE :
				return isStereotypeApplicable((Stereotype) arguments.get(0));
			case UMLPackage.PORT___IS_STEREOTYPE_APPLIED__STEREOTYPE :
				return isStereotypeApplied((Stereotype) arguments.get(0));
			case UMLPackage.PORT___IS_STEREOTYPE_REQUIRED__STEREOTYPE :
				return isStereotypeRequired((Stereotype) arguments.get(0));
			case UMLPackage.PORT___REMOVE_KEYWORD__STRING :
				return removeKeyword((String) arguments.get(0));
			case UMLPackage.PORT___SET_VALUE__STEREOTYPE_STRING_OBJECT :
				setValue((Stereotype) arguments.get(0),
					(String) arguments.get(1), arguments.get(2));
				return null;
			case UMLPackage.PORT___UNAPPLY_STEREOTYPE__STEREOTYPE :
				return unapplyStereotype((Stereotype) arguments.get(0));
			case UMLPackage.PORT___ALL_OWNED_ELEMENTS :
				return allOwnedElements();
			case UMLPackage.PORT___MUST_BE_OWNED :
				return mustBeOwned();
			case UMLPackage.PORT___VALIDATE_VISIBILITY_NEEDS_OWNERSHIP__DIAGNOSTICCHAIN_MAP :
				return validateVisibilityNeedsOwnership(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.PORT___VALIDATE_HAS_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP :
				return validateHasQualifiedName(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.PORT___VALIDATE_HAS_NO_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP :
				return validateHasNoQualifiedName(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.PORT___CREATE_DEPENDENCY__NAMEDELEMENT :
				return createDependency((NamedElement) arguments.get(0));
			case UMLPackage.PORT___CREATE_USAGE__NAMEDELEMENT :
				return createUsage((NamedElement) arguments.get(0));
			case UMLPackage.PORT___GET_LABEL :
				return getLabel();
			case UMLPackage.PORT___GET_LABEL__BOOLEAN :
				return getLabel((Boolean) arguments.get(0));
			case UMLPackage.PORT___GET_NAMESPACE :
				return getNamespace();
			case UMLPackage.PORT___ALL_NAMESPACES :
				return allNamespaces();
			case UMLPackage.PORT___ALL_OWNING_PACKAGES :
				return allOwningPackages();
			case UMLPackage.PORT___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE :
				return isDistinguishableFrom((NamedElement) arguments.get(0),
					(Namespace) arguments.get(1));
			case UMLPackage.PORT___GET_QUALIFIED_NAME :
				return getQualifiedName();
			case UMLPackage.PORT___SEPARATOR :
				return separator();
			case UMLPackage.PORT___GET_CLIENT_DEPENDENCIES :
				return getClientDependencies();
			case UMLPackage.PORT___VALIDATE_REDEFINITION_CONSISTENT__DIAGNOSTICCHAIN_MAP :
				return validateRedefinitionConsistent(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.PORT___VALIDATE_NON_LEAF_REDEFINITION__DIAGNOSTICCHAIN_MAP :
				return validateNonLeafRedefinition(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.PORT___VALIDATE_REDEFINITION_CONTEXT_VALID__DIAGNOSTICCHAIN_MAP :
				return validateRedefinitionContextValid(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.PORT___IS_CONSISTENT_WITH__REDEFINABLEELEMENT :
				return isConsistentWith((RedefinableElement) arguments.get(0));
			case UMLPackage.PORT___IS_REDEFINITION_CONTEXT_VALID__REDEFINABLEELEMENT :
				return isRedefinitionContextValid(
					(RedefinableElement) arguments.get(0));
			case UMLPackage.PORT___VALIDATE_UPPER_GE_LOWER__DIAGNOSTICCHAIN_MAP :
				return validateUpperGeLower((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.PORT___VALIDATE_LOWER_GE0__DIAGNOSTICCHAIN_MAP :
				return validateLowerGe0((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.PORT___VALIDATE_VALUE_SPECIFICATION_NO_SIDE_EFFECTS__DIAGNOSTICCHAIN_MAP :
				return validateValueSpecificationNoSideEffects(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.PORT___VALIDATE_VALUE_SPECIFICATION_CONSTANT__DIAGNOSTICCHAIN_MAP :
				return validateValueSpecificationConstant(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.PORT___VALIDATE_LOWER_IS_INTEGER__DIAGNOSTICCHAIN_MAP :
				return validateLowerIsInteger(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.PORT___VALIDATE_UPPER_IS_UNLIMITED_NATURAL__DIAGNOSTICCHAIN_MAP :
				return validateUpperIsUnlimitedNatural(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.PORT___SET_LOWER__INT :
				setLower((Integer) arguments.get(0));
				return null;
			case UMLPackage.PORT___SET_UPPER__INT :
				setUpper((Integer) arguments.get(0));
				return null;
			case UMLPackage.PORT___COMPATIBLE_WITH__MULTIPLICITYELEMENT :
				return compatibleWith((MultiplicityElement) arguments.get(0));
			case UMLPackage.PORT___INCLUDES_MULTIPLICITY__MULTIPLICITYELEMENT :
				return includesMultiplicity(
					(MultiplicityElement) arguments.get(0));
			case UMLPackage.PORT___IS__INT_INT :
				return is((Integer) arguments.get(0),
					(Integer) arguments.get(1));
			case UMLPackage.PORT___IS_MULTIVALUED :
				return isMultivalued();
			case UMLPackage.PORT___GET_LOWER :
				return getLower();
			case UMLPackage.PORT___LOWER_BOUND :
				return lowerBound();
			case UMLPackage.PORT___GET_UPPER :
				return getUpper();
			case UMLPackage.PORT___UPPER_BOUND :
				return upperBound();
			case UMLPackage.PORT___IS_COMPATIBLE_WITH__PARAMETERABLEELEMENT :
				return isCompatibleWith(
					(ParameterableElement) arguments.get(0));
			case UMLPackage.PORT___IS_TEMPLATE_PARAMETER :
				return isTemplateParameter();
			case UMLPackage.PORT___GET_ENDS :
				return getEnds();
			case UMLPackage.PORT___GET_DEPLOYED_ELEMENTS :
				return getDeployedElements();
			case UMLPackage.PORT___VALIDATE_SUBSETTING_CONTEXT_CONFORMS__DIAGNOSTICCHAIN_MAP :
				return validateSubsettingContextConforms(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.PORT___VALIDATE_DERIVED_UNION_IS_READ_ONLY__DIAGNOSTICCHAIN_MAP :
				return validateDerivedUnionIsReadOnly(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.PORT___VALIDATE_MULTIPLICITY_OF_COMPOSITE__DIAGNOSTICCHAIN_MAP :
				return validateMultiplicityOfComposite(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.PORT___VALIDATE_REDEFINED_PROPERTY_INHERITED__DIAGNOSTICCHAIN_MAP :
				return validateRedefinedPropertyInherited(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.PORT___VALIDATE_SUBSETTING_RULES__DIAGNOSTICCHAIN_MAP :
				return validateSubsettingRules(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.PORT___VALIDATE_BINDING_TO_ATTRIBUTE__DIAGNOSTICCHAIN_MAP :
				return validateBindingToAttribute(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.PORT___VALIDATE_DERIVED_UNION_IS_DERIVED__DIAGNOSTICCHAIN_MAP :
				return validateDerivedUnionIsDerived(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.PORT___VALIDATE_DEPLOYMENT_TARGET__DIAGNOSTICCHAIN_MAP :
				return validateDeploymentTarget(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.PORT___VALIDATE_SUBSETTED_PROPERTY_NAMES__DIAGNOSTICCHAIN_MAP :
				return validateSubsettedPropertyNames(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.PORT___VALIDATE_TYPE_OF_OPPOSITE_END__DIAGNOSTICCHAIN_MAP :
				return validateTypeOfOppositeEnd(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.PORT___VALIDATE_QUALIFIED_IS_ASSOCIATION_END__DIAGNOSTICCHAIN_MAP :
				return validateQualifiedIsAssociationEnd(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.PORT___GET_DEFAULT :
				return getDefault();
			case UMLPackage.PORT___GET_OTHER_END :
				return getOtherEnd();
			case UMLPackage.PORT___IS_SET_DEFAULT :
				return isSetDefault();
			case UMLPackage.PORT___SET_BOOLEAN_DEFAULT_VALUE__BOOLEAN :
				setBooleanDefaultValue((Boolean) arguments.get(0));
				return null;
			case UMLPackage.PORT___SET_DEFAULT__STRING :
				setDefault((String) arguments.get(0));
				return null;
			case UMLPackage.PORT___SET_INTEGER_DEFAULT_VALUE__INT :
				setIntegerDefaultValue((Integer) arguments.get(0));
				return null;
			case UMLPackage.PORT___SET_IS_COMPOSITE__BOOLEAN :
				setIsComposite((Boolean) arguments.get(0));
				return null;
			case UMLPackage.PORT___SET_IS_NAVIGABLE__BOOLEAN :
				setIsNavigable((Boolean) arguments.get(0));
				return null;
			case UMLPackage.PORT___SET_NULL_DEFAULT_VALUE :
				setNullDefaultValue();
				return null;
			case UMLPackage.PORT___SET_OPPOSITE__PROPERTY :
				setOpposite((Property) arguments.get(0));
				return null;
			case UMLPackage.PORT___SET_REAL_DEFAULT_VALUE__DOUBLE :
				setRealDefaultValue((Double) arguments.get(0));
				return null;
			case UMLPackage.PORT___SET_STRING_DEFAULT_VALUE__STRING :
				setStringDefaultValue((String) arguments.get(0));
				return null;
			case UMLPackage.PORT___SET_UNLIMITED_NATURAL_DEFAULT_VALUE__INT :
				setUnlimitedNaturalDefaultValue((Integer) arguments.get(0));
				return null;
			case UMLPackage.PORT___UNSET_DEFAULT :
				unsetDefault();
				return null;
			case UMLPackage.PORT___IS_ATTRIBUTE :
				return isAttribute();
			case UMLPackage.PORT___IS_COMPOSITE :
				return isComposite();
			case UMLPackage.PORT___IS_NAVIGABLE :
				return isNavigable();
			case UMLPackage.PORT___GET_OPPOSITE :
				return getOpposite();
			case UMLPackage.PORT___SUBSETTING_CONTEXT :
				return subsettingContext();
			case UMLPackage.PORT___VALIDATE_PORT_AGGREGATION__DIAGNOSTICCHAIN_MAP :
				return validatePortAggregation(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.PORT___VALIDATE_DEFAULT_VALUE__DIAGNOSTICCHAIN_MAP :
				return validateDefaultValue((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.PORT___VALIDATE_ENCAPSULATED_OWNER__DIAGNOSTICCHAIN_MAP :
				return validateEncapsulatedOwner(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.PORT___GET_PROVIDEDS :
				return getProvideds();
			case UMLPackage.PORT___GET_REQUIREDS :
				return getRequireds();
			case UMLPackage.PORT___BASIC_PROVIDED :
				return basicProvided();
			case UMLPackage.PORT___BASIC_REQUIRED :
				return basicRequired();
		}
		return eDynamicInvoke(operationID, arguments);
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
		result.append(", isConjugated: "); //$NON-NLS-1$
		result.append((eFlags & IS_CONJUGATED_EFLAG) != 0);
		result.append(", isService: "); //$NON-NLS-1$
		result.append((eFlags & IS_SERVICE_EFLAG) != 0);
		result.append(')');
		return result.toString();
	}

} //PortImpl
