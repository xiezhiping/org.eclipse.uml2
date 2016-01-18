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
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EAnnotation;
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
import org.eclipse.uml2.uml.Comment;
import org.eclipse.uml2.uml.Connector;
import org.eclipse.uml2.uml.ConnectorEnd;
import org.eclipse.uml2.uml.ConnectorKind;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Namespace;
import org.eclipse.uml2.uml.RedefinableElement;
import org.eclipse.uml2.uml.Stereotype;
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
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ConnectorImpl#getOwnedElements <em>Owned Element</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ConnectorImpl#getRedefinedElements <em>Redefined Element</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ConnectorImpl#getContracts <em>Contract</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ConnectorImpl#getEnds <em>End</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ConnectorImpl#getKind <em>Kind</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ConnectorImpl#getRedefinedConnectors <em>Redefined Connector</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ConnectorImpl#getType <em>Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConnectorImpl
		extends FeatureImpl
		implements Connector {

	/**
	 * The cached value of the '{@link #getContracts() <em>Contract</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContracts()
	 * @generated
	 * @ordered
	 */
	protected EList<Behavior> contracts;

	/**
	 * The cached value of the '{@link #getEnds() <em>End</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnds()
	 * @generated
	 * @ordered
	 */
	protected EList<ConnectorEnd> ends;

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
	 * The cached value of the '{@link #getRedefinedConnectors() <em>Redefined Connector</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRedefinedConnectors()
	 * @generated
	 * @ordered
	 */
	protected EList<Connector> redefinedConnectors;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected Association type;

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
	@Override
	protected EClass eStaticClass() {
		return UMLPackage.Literals.CONNECTOR;
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
				cache.put(eResource, this,
					UMLPackage.Literals.REDEFINABLE_ELEMENT__REDEFINED_ELEMENT,
					redefinedElements = new DerivedUnionEObjectEList<RedefinableElement>(
						RedefinableElement.class, this,
						UMLPackage.CONNECTOR__REDEFINED_ELEMENT,
						REDEFINED_ELEMENT_ESUBSETS));
			}
			return redefinedElements;
		}
		return new DerivedUnionEObjectEList<RedefinableElement>(
			RedefinableElement.class, this,
			UMLPackage.CONNECTOR__REDEFINED_ELEMENT,
			REDEFINED_ELEMENT_ESUBSETS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Element> getOwnedElements() {
		CacheAdapter cache = getCacheAdapter();
		if (cache != null) {
			Resource eResource = eResource();
			@SuppressWarnings("unchecked")
			EList<Element> ownedElements = (EList<Element>) cache.get(eResource,
				this, UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
			if (ownedElements == null) {
				cache.put(eResource, this,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT,
					ownedElements = new DerivedUnionEObjectEList<Element>(
						Element.class, this,
						UMLPackage.CONNECTOR__OWNED_ELEMENT,
						OWNED_ELEMENT_ESUBSETS));
			}
			return ownedElements;
		}
		return new DerivedUnionEObjectEList<Element>(Element.class, this,
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
	public EList<Connector> getRedefinedConnectors() {
		if (redefinedConnectors == null) {
			redefinedConnectors = new EObjectResolvingEList<Connector>(
				Connector.class, this,
				UMLPackage.CONNECTOR__REDEFINED_CONNECTOR);
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
		redefinedConnectorLoop : for (Connector redefinedConnector : getRedefinedConnectors()) {
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
	public EList<ConnectorEnd> getEnds() {
		if (ends == null) {
			ends = new EObjectContainmentEList.Resolving<ConnectorEnd>(
				ConnectorEnd.class, this, UMLPackage.CONNECTOR__END);
		}
		return ends;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectorEnd createEnd() {
		ConnectorEnd newEnd = (ConnectorEnd) create(
			UMLPackage.Literals.CONNECTOR_END);
		getEnds().add(newEnd);
		return newEnd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectorKind getKind() {
		return ConnectorOperations.getKind(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Behavior> getContracts() {
		if (contracts == null) {
			contracts = new EObjectResolvingEList<Behavior>(Behavior.class,
				this, UMLPackage.CONNECTOR__CONTRACT);
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
	public Behavior getContract(String name, boolean ignoreCase,
			EClass eClass) {
		contractLoop : for (Behavior contract : getContracts()) {
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
	public boolean validateTypes(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ConnectorOperations.validateTypes(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRoles(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ConnectorOperations.validateRoles(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UMLPackage.CONNECTOR__EANNOTATIONS :
				return ((InternalEList<?>) getEAnnotations())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.CONNECTOR__OWNED_COMMENT :
				return ((InternalEList<?>) getOwnedComments())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.CONNECTOR__NAME_EXPRESSION :
				return basicSetNameExpression(null, msgs);
			case UMLPackage.CONNECTOR__END :
				return ((InternalEList<?>) getEnds()).basicRemove(otherEnd,
					msgs);
		}
		return eDynamicInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UMLPackage.CONNECTOR__EANNOTATIONS :
				return getEAnnotations();
			case UMLPackage.CONNECTOR__OWNED_COMMENT :
				return getOwnedComments();
			case UMLPackage.CONNECTOR__OWNED_ELEMENT :
				return getOwnedElements();
			case UMLPackage.CONNECTOR__OWNER :
				if (resolve)
					return getOwner();
				return basicGetOwner();
			case UMLPackage.CONNECTOR__CLIENT_DEPENDENCY :
				return getClientDependencies();
			case UMLPackage.CONNECTOR__NAME :
				return getName();
			case UMLPackage.CONNECTOR__NAME_EXPRESSION :
				if (resolve)
					return getNameExpression();
				return basicGetNameExpression();
			case UMLPackage.CONNECTOR__NAMESPACE :
				if (resolve)
					return getNamespace();
				return basicGetNamespace();
			case UMLPackage.CONNECTOR__QUALIFIED_NAME :
				return getQualifiedName();
			case UMLPackage.CONNECTOR__VISIBILITY :
				return getVisibility();
			case UMLPackage.CONNECTOR__IS_LEAF :
				return isLeaf();
			case UMLPackage.CONNECTOR__REDEFINED_ELEMENT :
				return getRedefinedElements();
			case UMLPackage.CONNECTOR__REDEFINITION_CONTEXT :
				return getRedefinitionContexts();
			case UMLPackage.CONNECTOR__FEATURING_CLASSIFIER :
				return getFeaturingClassifiers();
			case UMLPackage.CONNECTOR__IS_STATIC :
				return isStatic();
			case UMLPackage.CONNECTOR__CONTRACT :
				return getContracts();
			case UMLPackage.CONNECTOR__END :
				return getEnds();
			case UMLPackage.CONNECTOR__KIND :
				return getKind();
			case UMLPackage.CONNECTOR__REDEFINED_CONNECTOR :
				return getRedefinedConnectors();
			case UMLPackage.CONNECTOR__TYPE :
				if (resolve)
					return getType();
				return basicGetType();
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
			case UMLPackage.CONNECTOR__EANNOTATIONS :
				getEAnnotations().clear();
				getEAnnotations()
					.addAll((Collection<? extends EAnnotation>) newValue);
				return;
			case UMLPackage.CONNECTOR__OWNED_COMMENT :
				getOwnedComments().clear();
				getOwnedComments()
					.addAll((Collection<? extends Comment>) newValue);
				return;
			case UMLPackage.CONNECTOR__NAME :
				setName((String) newValue);
				return;
			case UMLPackage.CONNECTOR__NAME_EXPRESSION :
				setNameExpression((StringExpression) newValue);
				return;
			case UMLPackage.CONNECTOR__VISIBILITY :
				setVisibility((VisibilityKind) newValue);
				return;
			case UMLPackage.CONNECTOR__IS_LEAF :
				setIsLeaf((Boolean) newValue);
				return;
			case UMLPackage.CONNECTOR__IS_STATIC :
				setIsStatic((Boolean) newValue);
				return;
			case UMLPackage.CONNECTOR__CONTRACT :
				getContracts().clear();
				getContracts()
					.addAll((Collection<? extends Behavior>) newValue);
				return;
			case UMLPackage.CONNECTOR__END :
				getEnds().clear();
				getEnds().addAll((Collection<? extends ConnectorEnd>) newValue);
				return;
			case UMLPackage.CONNECTOR__REDEFINED_CONNECTOR :
				getRedefinedConnectors().clear();
				getRedefinedConnectors()
					.addAll((Collection<? extends Connector>) newValue);
				return;
			case UMLPackage.CONNECTOR__TYPE :
				setType((Association) newValue);
				return;
		}
		eDynamicSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
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
			case UMLPackage.CONNECTOR__NAME_EXPRESSION :
				setNameExpression((StringExpression) null);
				return;
			case UMLPackage.CONNECTOR__VISIBILITY :
				unsetVisibility();
				return;
			case UMLPackage.CONNECTOR__IS_LEAF :
				setIsLeaf(IS_LEAF_EDEFAULT);
				return;
			case UMLPackage.CONNECTOR__IS_STATIC :
				setIsStatic(IS_STATIC_EDEFAULT);
				return;
			case UMLPackage.CONNECTOR__CONTRACT :
				getContracts().clear();
				return;
			case UMLPackage.CONNECTOR__END :
				getEnds().clear();
				return;
			case UMLPackage.CONNECTOR__REDEFINED_CONNECTOR :
				getRedefinedConnectors().clear();
				return;
			case UMLPackage.CONNECTOR__TYPE :
				setType((Association) null);
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
			case UMLPackage.CONNECTOR__EANNOTATIONS :
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UMLPackage.CONNECTOR__OWNED_COMMENT :
				return ownedComments != null && !ownedComments.isEmpty();
			case UMLPackage.CONNECTOR__OWNED_ELEMENT :
				return isSetOwnedElements();
			case UMLPackage.CONNECTOR__OWNER :
				return isSetOwner();
			case UMLPackage.CONNECTOR__CLIENT_DEPENDENCY :
				return !getClientDependencies().isEmpty();
			case UMLPackage.CONNECTOR__NAME :
				return isSetName();
			case UMLPackage.CONNECTOR__NAME_EXPRESSION :
				return nameExpression != null;
			case UMLPackage.CONNECTOR__NAMESPACE :
				return isSetNamespace();
			case UMLPackage.CONNECTOR__QUALIFIED_NAME :
				return QUALIFIED_NAME_EDEFAULT == null
					? getQualifiedName() != null
					: !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case UMLPackage.CONNECTOR__VISIBILITY :
				return isSetVisibility();
			case UMLPackage.CONNECTOR__IS_LEAF :
				return ((eFlags & IS_LEAF_EFLAG) != 0) != IS_LEAF_EDEFAULT;
			case UMLPackage.CONNECTOR__REDEFINED_ELEMENT :
				return isSetRedefinedElements();
			case UMLPackage.CONNECTOR__REDEFINITION_CONTEXT :
				return isSetRedefinitionContexts();
			case UMLPackage.CONNECTOR__FEATURING_CLASSIFIER :
				return isSetFeaturingClassifiers();
			case UMLPackage.CONNECTOR__IS_STATIC :
				return ((eFlags & IS_STATIC_EFLAG) != 0) != IS_STATIC_EDEFAULT;
			case UMLPackage.CONNECTOR__CONTRACT :
				return contracts != null && !contracts.isEmpty();
			case UMLPackage.CONNECTOR__END :
				return ends != null && !ends.isEmpty();
			case UMLPackage.CONNECTOR__KIND :
				return getKind() != KIND_EDEFAULT;
			case UMLPackage.CONNECTOR__REDEFINED_CONNECTOR :
				return redefinedConnectors != null
					&& !redefinedConnectors.isEmpty();
			case UMLPackage.CONNECTOR__TYPE :
				return type != null;
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
			case UMLPackage.CONNECTOR___GET_EANNOTATION__STRING :
				return getEAnnotation((String) arguments.get(0));
			case UMLPackage.CONNECTOR___VALIDATE_HAS_OWNER__DIAGNOSTICCHAIN_MAP :
				return validateHasOwner((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.CONNECTOR___VALIDATE_NOT_OWN_SELF__DIAGNOSTICCHAIN_MAP :
				return validateNotOwnSelf((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.CONNECTOR___ADD_KEYWORD__STRING :
				return addKeyword((String) arguments.get(0));
			case UMLPackage.CONNECTOR___APPLY_STEREOTYPE__STEREOTYPE :
				return applyStereotype((Stereotype) arguments.get(0));
			case UMLPackage.CONNECTOR___CREATE_EANNOTATION__STRING :
				return createEAnnotation((String) arguments.get(0));
			case UMLPackage.CONNECTOR___DESTROY :
				destroy();
				return null;
			case UMLPackage.CONNECTOR___GET_KEYWORDS :
				return getKeywords();
			case UMLPackage.CONNECTOR___GET_APPLICABLE_STEREOTYPE__STRING :
				return getApplicableStereotype((String) arguments.get(0));
			case UMLPackage.CONNECTOR___GET_APPLICABLE_STEREOTYPES :
				return getApplicableStereotypes();
			case UMLPackage.CONNECTOR___GET_APPLIED_STEREOTYPE__STRING :
				return getAppliedStereotype((String) arguments.get(0));
			case UMLPackage.CONNECTOR___GET_APPLIED_STEREOTYPES :
				return getAppliedStereotypes();
			case UMLPackage.CONNECTOR___GET_APPLIED_SUBSTEREOTYPE__STEREOTYPE_STRING :
				return getAppliedSubstereotype((Stereotype) arguments.get(0),
					(String) arguments.get(1));
			case UMLPackage.CONNECTOR___GET_APPLIED_SUBSTEREOTYPES__STEREOTYPE :
				return getAppliedSubstereotypes((Stereotype) arguments.get(0));
			case UMLPackage.CONNECTOR___GET_MODEL :
				return getModel();
			case UMLPackage.CONNECTOR___GET_NEAREST_PACKAGE :
				return getNearestPackage();
			case UMLPackage.CONNECTOR___GET_RELATIONSHIPS :
				return getRelationships();
			case UMLPackage.CONNECTOR___GET_RELATIONSHIPS__ECLASS :
				return getRelationships((EClass) arguments.get(0));
			case UMLPackage.CONNECTOR___GET_REQUIRED_STEREOTYPE__STRING :
				return getRequiredStereotype((String) arguments.get(0));
			case UMLPackage.CONNECTOR___GET_REQUIRED_STEREOTYPES :
				return getRequiredStereotypes();
			case UMLPackage.CONNECTOR___GET_SOURCE_DIRECTED_RELATIONSHIPS :
				return getSourceDirectedRelationships();
			case UMLPackage.CONNECTOR___GET_SOURCE_DIRECTED_RELATIONSHIPS__ECLASS :
				return getSourceDirectedRelationships(
					(EClass) arguments.get(0));
			case UMLPackage.CONNECTOR___GET_STEREOTYPE_APPLICATION__STEREOTYPE :
				return getStereotypeApplication((Stereotype) arguments.get(0));
			case UMLPackage.CONNECTOR___GET_STEREOTYPE_APPLICATIONS :
				return getStereotypeApplications();
			case UMLPackage.CONNECTOR___GET_TARGET_DIRECTED_RELATIONSHIPS :
				return getTargetDirectedRelationships();
			case UMLPackage.CONNECTOR___GET_TARGET_DIRECTED_RELATIONSHIPS__ECLASS :
				return getTargetDirectedRelationships(
					(EClass) arguments.get(0));
			case UMLPackage.CONNECTOR___GET_VALUE__STEREOTYPE_STRING :
				return getValue((Stereotype) arguments.get(0),
					(String) arguments.get(1));
			case UMLPackage.CONNECTOR___HAS_KEYWORD__STRING :
				return hasKeyword((String) arguments.get(0));
			case UMLPackage.CONNECTOR___HAS_VALUE__STEREOTYPE_STRING :
				return hasValue((Stereotype) arguments.get(0),
					(String) arguments.get(1));
			case UMLPackage.CONNECTOR___IS_STEREOTYPE_APPLICABLE__STEREOTYPE :
				return isStereotypeApplicable((Stereotype) arguments.get(0));
			case UMLPackage.CONNECTOR___IS_STEREOTYPE_APPLIED__STEREOTYPE :
				return isStereotypeApplied((Stereotype) arguments.get(0));
			case UMLPackage.CONNECTOR___IS_STEREOTYPE_REQUIRED__STEREOTYPE :
				return isStereotypeRequired((Stereotype) arguments.get(0));
			case UMLPackage.CONNECTOR___REMOVE_KEYWORD__STRING :
				return removeKeyword((String) arguments.get(0));
			case UMLPackage.CONNECTOR___SET_VALUE__STEREOTYPE_STRING_OBJECT :
				setValue((Stereotype) arguments.get(0),
					(String) arguments.get(1), arguments.get(2));
				return null;
			case UMLPackage.CONNECTOR___UNAPPLY_STEREOTYPE__STEREOTYPE :
				return unapplyStereotype((Stereotype) arguments.get(0));
			case UMLPackage.CONNECTOR___ALL_OWNED_ELEMENTS :
				return allOwnedElements();
			case UMLPackage.CONNECTOR___MUST_BE_OWNED :
				return mustBeOwned();
			case UMLPackage.CONNECTOR___VALIDATE_VISIBILITY_NEEDS_OWNERSHIP__DIAGNOSTICCHAIN_MAP :
				return validateVisibilityNeedsOwnership(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.CONNECTOR___VALIDATE_HAS_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP :
				return validateHasQualifiedName(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.CONNECTOR___VALIDATE_HAS_NO_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP :
				return validateHasNoQualifiedName(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.CONNECTOR___CREATE_DEPENDENCY__NAMEDELEMENT :
				return createDependency((NamedElement) arguments.get(0));
			case UMLPackage.CONNECTOR___CREATE_USAGE__NAMEDELEMENT :
				return createUsage((NamedElement) arguments.get(0));
			case UMLPackage.CONNECTOR___GET_LABEL :
				return getLabel();
			case UMLPackage.CONNECTOR___GET_LABEL__BOOLEAN :
				return getLabel((Boolean) arguments.get(0));
			case UMLPackage.CONNECTOR___GET_NAMESPACE :
				return getNamespace();
			case UMLPackage.CONNECTOR___ALL_NAMESPACES :
				return allNamespaces();
			case UMLPackage.CONNECTOR___ALL_OWNING_PACKAGES :
				return allOwningPackages();
			case UMLPackage.CONNECTOR___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE :
				return isDistinguishableFrom((NamedElement) arguments.get(0),
					(Namespace) arguments.get(1));
			case UMLPackage.CONNECTOR___GET_QUALIFIED_NAME :
				return getQualifiedName();
			case UMLPackage.CONNECTOR___SEPARATOR :
				return separator();
			case UMLPackage.CONNECTOR___GET_CLIENT_DEPENDENCIES :
				return getClientDependencies();
			case UMLPackage.CONNECTOR___VALIDATE_REDEFINITION_CONSISTENT__DIAGNOSTICCHAIN_MAP :
				return validateRedefinitionConsistent(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.CONNECTOR___VALIDATE_NON_LEAF_REDEFINITION__DIAGNOSTICCHAIN_MAP :
				return validateNonLeafRedefinition(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.CONNECTOR___VALIDATE_REDEFINITION_CONTEXT_VALID__DIAGNOSTICCHAIN_MAP :
				return validateRedefinitionContextValid(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.CONNECTOR___IS_CONSISTENT_WITH__REDEFINABLEELEMENT :
				return isConsistentWith((RedefinableElement) arguments.get(0));
			case UMLPackage.CONNECTOR___IS_REDEFINITION_CONTEXT_VALID__REDEFINABLEELEMENT :
				return isRedefinitionContextValid(
					(RedefinableElement) arguments.get(0));
			case UMLPackage.CONNECTOR___VALIDATE_TYPES__DIAGNOSTICCHAIN_MAP :
				return validateTypes((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.CONNECTOR___VALIDATE_ROLES__DIAGNOSTICCHAIN_MAP :
				return validateRoles((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.CONNECTOR___GET_KIND :
				return getKind();
		}
		return eDynamicInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
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
	 * The array of subset feature identifiers for the '{@link #getRedefinedElements() <em>Redefined Element</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRedefinedElements()
	 * @generated
	 * @ordered
	 */
	protected static final int[] REDEFINED_ELEMENT_ESUBSETS = new int[]{
		UMLPackage.CONNECTOR__REDEFINED_CONNECTOR};

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetOwnedElements() {
		return super.isSetOwnedElements() || eIsSet(UMLPackage.CONNECTOR__END);
	}

} //ConnectorImpl
