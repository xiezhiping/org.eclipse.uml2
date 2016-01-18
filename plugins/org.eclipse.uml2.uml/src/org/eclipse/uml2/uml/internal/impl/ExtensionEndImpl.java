/*
 * Copyright (c) 2005, 2016 IBM Corporation, CEA, and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *   Kenn Hussey - 286329, 323181
 *   Kenn Hussey (CEA) - 327039, 351774, 212765, 418466, 451350, 485756
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

import org.eclipse.uml2.uml.AggregationKind;
import org.eclipse.uml2.uml.Association;
import org.eclipse.uml2.uml.Comment;
import org.eclipse.uml2.uml.DataType;
import org.eclipse.uml2.uml.Deployment;
import org.eclipse.uml2.uml.ExtensionEnd;
import org.eclipse.uml2.uml.Interface;
import org.eclipse.uml2.uml.MultiplicityElement;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Namespace;
import org.eclipse.uml2.uml.ParameterableElement;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.RedefinableElement;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.StringExpression;
import org.eclipse.uml2.uml.TemplateParameter;
import org.eclipse.uml2.uml.Type;
import org.eclipse.uml2.uml.UMLPackage;

import org.eclipse.uml2.uml.ValueSpecification;
import org.eclipse.uml2.uml.VisibilityKind;
import org.eclipse.uml2.uml.internal.operations.ExtensionEndOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Extension End</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ExtensionEndImpl#getLower <em>Lower</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ExtensionEndImpl#getType <em>Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExtensionEndImpl
		extends PropertyImpl
		implements ExtensionEnd {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExtensionEndImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UMLPackage.Literals.EXTENSION_END;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Type getType() {
		if (type != null && type.eIsProxy()) {
			InternalEObject oldType = (InternalEObject) type;
			type = (Type) eResolveProxy(oldType);
			if (type != oldType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
						UMLPackage.EXTENSION_END__TYPE, oldType, type));
			}
		}
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Type basicGetType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setType(Type newType) {
		if (newType != null && !(newType instanceof Stereotype)) {
			throw new IllegalArgumentException(
				"newType must be an instance of Stereotype"); //$NON-NLS-1$
		}
		Type oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.EXTENSION_END__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetType() {
		return type != null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getLower() {
		return ExtensionEndOperations.getLower(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLower(int newLower) {
		ExtensionEndOperations.setLower(this, newLower);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean isSetLower() {
		return getLower() != 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMultiplicity(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ExtensionEndOperations.validateMultiplicity(this, diagnostics,
			context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAggregation(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ExtensionEndOperations.validateAggregation(this, diagnostics,
			context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int lowerBound() {
		return ExtensionEndOperations.lowerBound(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UMLPackage.EXTENSION_END__EANNOTATIONS :
				return getEAnnotations();
			case UMLPackage.EXTENSION_END__OWNED_COMMENT :
				return getOwnedComments();
			case UMLPackage.EXTENSION_END__OWNED_ELEMENT :
				return getOwnedElements();
			case UMLPackage.EXTENSION_END__OWNER :
				if (resolve)
					return getOwner();
				return basicGetOwner();
			case UMLPackage.EXTENSION_END__CLIENT_DEPENDENCY :
				return getClientDependencies();
			case UMLPackage.EXTENSION_END__NAME :
				return getName();
			case UMLPackage.EXTENSION_END__NAME_EXPRESSION :
				if (resolve)
					return getNameExpression();
				return basicGetNameExpression();
			case UMLPackage.EXTENSION_END__NAMESPACE :
				if (resolve)
					return getNamespace();
				return basicGetNamespace();
			case UMLPackage.EXTENSION_END__QUALIFIED_NAME :
				return getQualifiedName();
			case UMLPackage.EXTENSION_END__VISIBILITY :
				return getVisibility();
			case UMLPackage.EXTENSION_END__IS_LEAF :
				return isLeaf();
			case UMLPackage.EXTENSION_END__REDEFINED_ELEMENT :
				return getRedefinedElements();
			case UMLPackage.EXTENSION_END__REDEFINITION_CONTEXT :
				return getRedefinitionContexts();
			case UMLPackage.EXTENSION_END__FEATURING_CLASSIFIER :
				return getFeaturingClassifiers();
			case UMLPackage.EXTENSION_END__IS_STATIC :
				return isStatic();
			case UMLPackage.EXTENSION_END__TYPE :
				if (resolve)
					return getType();
				return basicGetType();
			case UMLPackage.EXTENSION_END__IS_ORDERED :
				return isOrdered();
			case UMLPackage.EXTENSION_END__IS_UNIQUE :
				return isUnique();
			case UMLPackage.EXTENSION_END__LOWER :
				return getLower();
			case UMLPackage.EXTENSION_END__LOWER_VALUE :
				if (resolve)
					return getLowerValue();
				return basicGetLowerValue();
			case UMLPackage.EXTENSION_END__UPPER :
				return getUpper();
			case UMLPackage.EXTENSION_END__UPPER_VALUE :
				if (resolve)
					return getUpperValue();
				return basicGetUpperValue();
			case UMLPackage.EXTENSION_END__IS_READ_ONLY :
				return isReadOnly();
			case UMLPackage.EXTENSION_END__OWNING_TEMPLATE_PARAMETER :
				if (resolve)
					return getOwningTemplateParameter();
				return basicGetOwningTemplateParameter();
			case UMLPackage.EXTENSION_END__TEMPLATE_PARAMETER :
				if (resolve)
					return getTemplateParameter();
				return basicGetTemplateParameter();
			case UMLPackage.EXTENSION_END__END :
				return getEnds();
			case UMLPackage.EXTENSION_END__DEPLOYED_ELEMENT :
				return getDeployedElements();
			case UMLPackage.EXTENSION_END__DEPLOYMENT :
				return getDeployments();
			case UMLPackage.EXTENSION_END__DATATYPE :
				if (resolve)
					return getDatatype();
				return basicGetDatatype();
			case UMLPackage.EXTENSION_END__INTERFACE :
				if (resolve)
					return getInterface();
				return basicGetInterface();
			case UMLPackage.EXTENSION_END__DEFAULT :
				return getDefault();
			case UMLPackage.EXTENSION_END__AGGREGATION :
				return getAggregation();
			case UMLPackage.EXTENSION_END__ASSOCIATION_END :
				if (resolve)
					return getAssociationEnd();
				return basicGetAssociationEnd();
			case UMLPackage.EXTENSION_END__QUALIFIER :
				return getQualifiers();
			case UMLPackage.EXTENSION_END__CLASS :
				if (resolve)
					return getClass_();
				return basicGetClass_();
			case UMLPackage.EXTENSION_END__DEFAULT_VALUE :
				if (resolve)
					return getDefaultValue();
				return basicGetDefaultValue();
			case UMLPackage.EXTENSION_END__IS_COMPOSITE :
				return isComposite();
			case UMLPackage.EXTENSION_END__IS_DERIVED :
				return isDerived();
			case UMLPackage.EXTENSION_END__IS_DERIVED_UNION :
				return isDerivedUnion();
			case UMLPackage.EXTENSION_END__IS_ID :
				return isID();
			case UMLPackage.EXTENSION_END__OPPOSITE :
				if (resolve)
					return getOpposite();
				return basicGetOpposite();
			case UMLPackage.EXTENSION_END__OWNING_ASSOCIATION :
				if (resolve)
					return getOwningAssociation();
				return basicGetOwningAssociation();
			case UMLPackage.EXTENSION_END__REDEFINED_PROPERTY :
				return getRedefinedProperties();
			case UMLPackage.EXTENSION_END__SUBSETTED_PROPERTY :
				return getSubsettedProperties();
			case UMLPackage.EXTENSION_END__ASSOCIATION :
				if (resolve)
					return getAssociation();
				return basicGetAssociation();
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
			case UMLPackage.EXTENSION_END__EANNOTATIONS :
				getEAnnotations().clear();
				getEAnnotations()
					.addAll((Collection<? extends EAnnotation>) newValue);
				return;
			case UMLPackage.EXTENSION_END__OWNED_COMMENT :
				getOwnedComments().clear();
				getOwnedComments()
					.addAll((Collection<? extends Comment>) newValue);
				return;
			case UMLPackage.EXTENSION_END__NAME :
				setName((String) newValue);
				return;
			case UMLPackage.EXTENSION_END__NAME_EXPRESSION :
				setNameExpression((StringExpression) newValue);
				return;
			case UMLPackage.EXTENSION_END__VISIBILITY :
				setVisibility((VisibilityKind) newValue);
				return;
			case UMLPackage.EXTENSION_END__IS_LEAF :
				setIsLeaf((Boolean) newValue);
				return;
			case UMLPackage.EXTENSION_END__IS_STATIC :
				setIsStatic((Boolean) newValue);
				return;
			case UMLPackage.EXTENSION_END__TYPE :
				setType((Type) newValue);
				return;
			case UMLPackage.EXTENSION_END__IS_ORDERED :
				setIsOrdered((Boolean) newValue);
				return;
			case UMLPackage.EXTENSION_END__IS_UNIQUE :
				setIsUnique((Boolean) newValue);
				return;
			case UMLPackage.EXTENSION_END__LOWER :
				setLower((Integer) newValue);
				return;
			case UMLPackage.EXTENSION_END__LOWER_VALUE :
				setLowerValue((ValueSpecification) newValue);
				return;
			case UMLPackage.EXTENSION_END__UPPER :
				setUpper((Integer) newValue);
				return;
			case UMLPackage.EXTENSION_END__UPPER_VALUE :
				setUpperValue((ValueSpecification) newValue);
				return;
			case UMLPackage.EXTENSION_END__IS_READ_ONLY :
				setIsReadOnly((Boolean) newValue);
				return;
			case UMLPackage.EXTENSION_END__OWNING_TEMPLATE_PARAMETER :
				setOwningTemplateParameter((TemplateParameter) newValue);
				return;
			case UMLPackage.EXTENSION_END__TEMPLATE_PARAMETER :
				setTemplateParameter((TemplateParameter) newValue);
				return;
			case UMLPackage.EXTENSION_END__DEPLOYMENT :
				getDeployments().clear();
				getDeployments()
					.addAll((Collection<? extends Deployment>) newValue);
				return;
			case UMLPackage.EXTENSION_END__DATATYPE :
				setDatatype((DataType) newValue);
				return;
			case UMLPackage.EXTENSION_END__INTERFACE :
				setInterface((Interface) newValue);
				return;
			case UMLPackage.EXTENSION_END__DEFAULT :
				setDefault((String) newValue);
				return;
			case UMLPackage.EXTENSION_END__AGGREGATION :
				setAggregation((AggregationKind) newValue);
				return;
			case UMLPackage.EXTENSION_END__ASSOCIATION_END :
				setAssociationEnd((Property) newValue);
				return;
			case UMLPackage.EXTENSION_END__QUALIFIER :
				getQualifiers().clear();
				getQualifiers()
					.addAll((Collection<? extends Property>) newValue);
				return;
			case UMLPackage.EXTENSION_END__DEFAULT_VALUE :
				setDefaultValue((ValueSpecification) newValue);
				return;
			case UMLPackage.EXTENSION_END__IS_COMPOSITE :
				setIsComposite((Boolean) newValue);
				return;
			case UMLPackage.EXTENSION_END__IS_DERIVED :
				setIsDerived((Boolean) newValue);
				return;
			case UMLPackage.EXTENSION_END__IS_DERIVED_UNION :
				setIsDerivedUnion((Boolean) newValue);
				return;
			case UMLPackage.EXTENSION_END__IS_ID :
				setIsID((Boolean) newValue);
				return;
			case UMLPackage.EXTENSION_END__OPPOSITE :
				setOpposite((Property) newValue);
				return;
			case UMLPackage.EXTENSION_END__OWNING_ASSOCIATION :
				setOwningAssociation((Association) newValue);
				return;
			case UMLPackage.EXTENSION_END__REDEFINED_PROPERTY :
				getRedefinedProperties().clear();
				getRedefinedProperties()
					.addAll((Collection<? extends Property>) newValue);
				return;
			case UMLPackage.EXTENSION_END__SUBSETTED_PROPERTY :
				getSubsettedProperties().clear();
				getSubsettedProperties()
					.addAll((Collection<? extends Property>) newValue);
				return;
			case UMLPackage.EXTENSION_END__ASSOCIATION :
				setAssociation((Association) newValue);
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
			case UMLPackage.EXTENSION_END__EANNOTATIONS :
				getEAnnotations().clear();
				return;
			case UMLPackage.EXTENSION_END__OWNED_COMMENT :
				getOwnedComments().clear();
				return;
			case UMLPackage.EXTENSION_END__NAME :
				unsetName();
				return;
			case UMLPackage.EXTENSION_END__NAME_EXPRESSION :
				setNameExpression((StringExpression) null);
				return;
			case UMLPackage.EXTENSION_END__VISIBILITY :
				unsetVisibility();
				return;
			case UMLPackage.EXTENSION_END__IS_LEAF :
				setIsLeaf(IS_LEAF_EDEFAULT);
				return;
			case UMLPackage.EXTENSION_END__IS_STATIC :
				setIsStatic(IS_STATIC_EDEFAULT);
				return;
			case UMLPackage.EXTENSION_END__TYPE :
				setType((Type) null);
				return;
			case UMLPackage.EXTENSION_END__IS_ORDERED :
				setIsOrdered(IS_ORDERED_EDEFAULT);
				return;
			case UMLPackage.EXTENSION_END__IS_UNIQUE :
				setIsUnique(IS_UNIQUE_EDEFAULT);
				return;
			case UMLPackage.EXTENSION_END__LOWER :
				setLower(LOWER_EDEFAULT);
				return;
			case UMLPackage.EXTENSION_END__LOWER_VALUE :
				setLowerValue((ValueSpecification) null);
				return;
			case UMLPackage.EXTENSION_END__UPPER :
				setUpper(UPPER_EDEFAULT);
				return;
			case UMLPackage.EXTENSION_END__UPPER_VALUE :
				setUpperValue((ValueSpecification) null);
				return;
			case UMLPackage.EXTENSION_END__IS_READ_ONLY :
				setIsReadOnly(IS_READ_ONLY_EDEFAULT);
				return;
			case UMLPackage.EXTENSION_END__OWNING_TEMPLATE_PARAMETER :
				setOwningTemplateParameter((TemplateParameter) null);
				return;
			case UMLPackage.EXTENSION_END__TEMPLATE_PARAMETER :
				setTemplateParameter((TemplateParameter) null);
				return;
			case UMLPackage.EXTENSION_END__DEPLOYMENT :
				getDeployments().clear();
				return;
			case UMLPackage.EXTENSION_END__DATATYPE :
				setDatatype((DataType) null);
				return;
			case UMLPackage.EXTENSION_END__INTERFACE :
				setInterface((Interface) null);
				return;
			case UMLPackage.EXTENSION_END__DEFAULT :
				unsetDefault();
				return;
			case UMLPackage.EXTENSION_END__AGGREGATION :
				setAggregation(AGGREGATION_EDEFAULT);
				return;
			case UMLPackage.EXTENSION_END__ASSOCIATION_END :
				setAssociationEnd((Property) null);
				return;
			case UMLPackage.EXTENSION_END__QUALIFIER :
				getQualifiers().clear();
				return;
			case UMLPackage.EXTENSION_END__DEFAULT_VALUE :
				setDefaultValue((ValueSpecification) null);
				return;
			case UMLPackage.EXTENSION_END__IS_COMPOSITE :
				setIsComposite(IS_COMPOSITE_EDEFAULT);
				return;
			case UMLPackage.EXTENSION_END__IS_DERIVED :
				setIsDerived(IS_DERIVED_EDEFAULT);
				return;
			case UMLPackage.EXTENSION_END__IS_DERIVED_UNION :
				setIsDerivedUnion(IS_DERIVED_UNION_EDEFAULT);
				return;
			case UMLPackage.EXTENSION_END__IS_ID :
				setIsID(IS_ID_EDEFAULT);
				return;
			case UMLPackage.EXTENSION_END__OPPOSITE :
				setOpposite((Property) null);
				return;
			case UMLPackage.EXTENSION_END__OWNING_ASSOCIATION :
				setOwningAssociation((Association) null);
				return;
			case UMLPackage.EXTENSION_END__REDEFINED_PROPERTY :
				getRedefinedProperties().clear();
				return;
			case UMLPackage.EXTENSION_END__SUBSETTED_PROPERTY :
				getSubsettedProperties().clear();
				return;
			case UMLPackage.EXTENSION_END__ASSOCIATION :
				setAssociation((Association) null);
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
			case UMLPackage.EXTENSION_END__EANNOTATIONS :
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UMLPackage.EXTENSION_END__OWNED_COMMENT :
				return ownedComments != null && !ownedComments.isEmpty();
			case UMLPackage.EXTENSION_END__OWNED_ELEMENT :
				return isSetOwnedElements();
			case UMLPackage.EXTENSION_END__OWNER :
				return isSetOwner();
			case UMLPackage.EXTENSION_END__CLIENT_DEPENDENCY :
				return !getClientDependencies().isEmpty();
			case UMLPackage.EXTENSION_END__NAME :
				return isSetName();
			case UMLPackage.EXTENSION_END__NAME_EXPRESSION :
				return nameExpression != null;
			case UMLPackage.EXTENSION_END__NAMESPACE :
				return isSetNamespace();
			case UMLPackage.EXTENSION_END__QUALIFIED_NAME :
				return QUALIFIED_NAME_EDEFAULT == null
					? getQualifiedName() != null
					: !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case UMLPackage.EXTENSION_END__VISIBILITY :
				return isSetVisibility();
			case UMLPackage.EXTENSION_END__IS_LEAF :
				return ((eFlags & IS_LEAF_EFLAG) != 0) != IS_LEAF_EDEFAULT;
			case UMLPackage.EXTENSION_END__REDEFINED_ELEMENT :
				return isSetRedefinedElements();
			case UMLPackage.EXTENSION_END__REDEFINITION_CONTEXT :
				return isSetRedefinitionContexts();
			case UMLPackage.EXTENSION_END__FEATURING_CLASSIFIER :
				return isSetFeaturingClassifiers();
			case UMLPackage.EXTENSION_END__IS_STATIC :
				return ((eFlags & IS_STATIC_EFLAG) != 0) != IS_STATIC_EDEFAULT;
			case UMLPackage.EXTENSION_END__TYPE :
				return isSetType();
			case UMLPackage.EXTENSION_END__IS_ORDERED :
				return ((eFlags
					& IS_ORDERED_EFLAG) != 0) != IS_ORDERED_EDEFAULT;
			case UMLPackage.EXTENSION_END__IS_UNIQUE :
				return ((eFlags & IS_UNIQUE_EFLAG) != 0) != IS_UNIQUE_EDEFAULT;
			case UMLPackage.EXTENSION_END__LOWER :
				return isSetLower();
			case UMLPackage.EXTENSION_END__LOWER_VALUE :
				return lowerValue != null;
			case UMLPackage.EXTENSION_END__UPPER :
				return getUpper() != UPPER_EDEFAULT;
			case UMLPackage.EXTENSION_END__UPPER_VALUE :
				return upperValue != null;
			case UMLPackage.EXTENSION_END__IS_READ_ONLY :
				return ((eFlags
					& IS_READ_ONLY_EFLAG) != 0) != IS_READ_ONLY_EDEFAULT;
			case UMLPackage.EXTENSION_END__OWNING_TEMPLATE_PARAMETER :
				return basicGetOwningTemplateParameter() != null;
			case UMLPackage.EXTENSION_END__TEMPLATE_PARAMETER :
				return isSetTemplateParameter();
			case UMLPackage.EXTENSION_END__END :
				return !getEnds().isEmpty();
			case UMLPackage.EXTENSION_END__DEPLOYED_ELEMENT :
				return !getDeployedElements().isEmpty();
			case UMLPackage.EXTENSION_END__DEPLOYMENT :
				return deployments != null && !deployments.isEmpty();
			case UMLPackage.EXTENSION_END__DATATYPE :
				return basicGetDatatype() != null;
			case UMLPackage.EXTENSION_END__INTERFACE :
				return basicGetInterface() != null;
			case UMLPackage.EXTENSION_END__DEFAULT :
				return isSetDefault();
			case UMLPackage.EXTENSION_END__AGGREGATION :
				return (eFlags
					& AGGREGATION_EFLAG) != AGGREGATION_EFLAG_DEFAULT;
			case UMLPackage.EXTENSION_END__ASSOCIATION_END :
				return basicGetAssociationEnd() != null;
			case UMLPackage.EXTENSION_END__QUALIFIER :
				return qualifiers != null && !qualifiers.isEmpty();
			case UMLPackage.EXTENSION_END__CLASS :
				return basicGetClass_() != null;
			case UMLPackage.EXTENSION_END__DEFAULT_VALUE :
				return defaultValue != null;
			case UMLPackage.EXTENSION_END__IS_COMPOSITE :
				return isComposite() != IS_COMPOSITE_EDEFAULT;
			case UMLPackage.EXTENSION_END__IS_DERIVED :
				return ((eFlags
					& IS_DERIVED_EFLAG) != 0) != IS_DERIVED_EDEFAULT;
			case UMLPackage.EXTENSION_END__IS_DERIVED_UNION :
				return ((eFlags
					& IS_DERIVED_UNION_EFLAG) != 0) != IS_DERIVED_UNION_EDEFAULT;
			case UMLPackage.EXTENSION_END__IS_ID :
				return ((eFlags & IS_ID_EFLAG) != 0) != IS_ID_EDEFAULT;
			case UMLPackage.EXTENSION_END__OPPOSITE :
				return basicGetOpposite() != null;
			case UMLPackage.EXTENSION_END__OWNING_ASSOCIATION :
				return basicGetOwningAssociation() != null;
			case UMLPackage.EXTENSION_END__REDEFINED_PROPERTY :
				return redefinedProperties != null
					&& !redefinedProperties.isEmpty();
			case UMLPackage.EXTENSION_END__SUBSETTED_PROPERTY :
				return subsettedProperties != null
					&& !subsettedProperties.isEmpty();
			case UMLPackage.EXTENSION_END__ASSOCIATION :
				return association != null;
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
			case UMLPackage.EXTENSION_END___GET_EANNOTATION__STRING :
				return getEAnnotation((String) arguments.get(0));
			case UMLPackage.EXTENSION_END___VALIDATE_HAS_OWNER__DIAGNOSTICCHAIN_MAP :
				return validateHasOwner((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.EXTENSION_END___VALIDATE_NOT_OWN_SELF__DIAGNOSTICCHAIN_MAP :
				return validateNotOwnSelf((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.EXTENSION_END___ADD_KEYWORD__STRING :
				return addKeyword((String) arguments.get(0));
			case UMLPackage.EXTENSION_END___APPLY_STEREOTYPE__STEREOTYPE :
				return applyStereotype((Stereotype) arguments.get(0));
			case UMLPackage.EXTENSION_END___CREATE_EANNOTATION__STRING :
				return createEAnnotation((String) arguments.get(0));
			case UMLPackage.EXTENSION_END___DESTROY :
				destroy();
				return null;
			case UMLPackage.EXTENSION_END___GET_KEYWORDS :
				return getKeywords();
			case UMLPackage.EXTENSION_END___GET_APPLICABLE_STEREOTYPE__STRING :
				return getApplicableStereotype((String) arguments.get(0));
			case UMLPackage.EXTENSION_END___GET_APPLICABLE_STEREOTYPES :
				return getApplicableStereotypes();
			case UMLPackage.EXTENSION_END___GET_APPLIED_STEREOTYPE__STRING :
				return getAppliedStereotype((String) arguments.get(0));
			case UMLPackage.EXTENSION_END___GET_APPLIED_STEREOTYPES :
				return getAppliedStereotypes();
			case UMLPackage.EXTENSION_END___GET_APPLIED_SUBSTEREOTYPE__STEREOTYPE_STRING :
				return getAppliedSubstereotype((Stereotype) arguments.get(0),
					(String) arguments.get(1));
			case UMLPackage.EXTENSION_END___GET_APPLIED_SUBSTEREOTYPES__STEREOTYPE :
				return getAppliedSubstereotypes((Stereotype) arguments.get(0));
			case UMLPackage.EXTENSION_END___GET_MODEL :
				return getModel();
			case UMLPackage.EXTENSION_END___GET_NEAREST_PACKAGE :
				return getNearestPackage();
			case UMLPackage.EXTENSION_END___GET_RELATIONSHIPS :
				return getRelationships();
			case UMLPackage.EXTENSION_END___GET_RELATIONSHIPS__ECLASS :
				return getRelationships((EClass) arguments.get(0));
			case UMLPackage.EXTENSION_END___GET_REQUIRED_STEREOTYPE__STRING :
				return getRequiredStereotype((String) arguments.get(0));
			case UMLPackage.EXTENSION_END___GET_REQUIRED_STEREOTYPES :
				return getRequiredStereotypes();
			case UMLPackage.EXTENSION_END___GET_SOURCE_DIRECTED_RELATIONSHIPS :
				return getSourceDirectedRelationships();
			case UMLPackage.EXTENSION_END___GET_SOURCE_DIRECTED_RELATIONSHIPS__ECLASS :
				return getSourceDirectedRelationships(
					(EClass) arguments.get(0));
			case UMLPackage.EXTENSION_END___GET_STEREOTYPE_APPLICATION__STEREOTYPE :
				return getStereotypeApplication((Stereotype) arguments.get(0));
			case UMLPackage.EXTENSION_END___GET_STEREOTYPE_APPLICATIONS :
				return getStereotypeApplications();
			case UMLPackage.EXTENSION_END___GET_TARGET_DIRECTED_RELATIONSHIPS :
				return getTargetDirectedRelationships();
			case UMLPackage.EXTENSION_END___GET_TARGET_DIRECTED_RELATIONSHIPS__ECLASS :
				return getTargetDirectedRelationships(
					(EClass) arguments.get(0));
			case UMLPackage.EXTENSION_END___GET_VALUE__STEREOTYPE_STRING :
				return getValue((Stereotype) arguments.get(0),
					(String) arguments.get(1));
			case UMLPackage.EXTENSION_END___HAS_KEYWORD__STRING :
				return hasKeyword((String) arguments.get(0));
			case UMLPackage.EXTENSION_END___HAS_VALUE__STEREOTYPE_STRING :
				return hasValue((Stereotype) arguments.get(0),
					(String) arguments.get(1));
			case UMLPackage.EXTENSION_END___IS_STEREOTYPE_APPLICABLE__STEREOTYPE :
				return isStereotypeApplicable((Stereotype) arguments.get(0));
			case UMLPackage.EXTENSION_END___IS_STEREOTYPE_APPLIED__STEREOTYPE :
				return isStereotypeApplied((Stereotype) arguments.get(0));
			case UMLPackage.EXTENSION_END___IS_STEREOTYPE_REQUIRED__STEREOTYPE :
				return isStereotypeRequired((Stereotype) arguments.get(0));
			case UMLPackage.EXTENSION_END___REMOVE_KEYWORD__STRING :
				return removeKeyword((String) arguments.get(0));
			case UMLPackage.EXTENSION_END___SET_VALUE__STEREOTYPE_STRING_OBJECT :
				setValue((Stereotype) arguments.get(0),
					(String) arguments.get(1), arguments.get(2));
				return null;
			case UMLPackage.EXTENSION_END___UNAPPLY_STEREOTYPE__STEREOTYPE :
				return unapplyStereotype((Stereotype) arguments.get(0));
			case UMLPackage.EXTENSION_END___ALL_OWNED_ELEMENTS :
				return allOwnedElements();
			case UMLPackage.EXTENSION_END___MUST_BE_OWNED :
				return mustBeOwned();
			case UMLPackage.EXTENSION_END___VALIDATE_VISIBILITY_NEEDS_OWNERSHIP__DIAGNOSTICCHAIN_MAP :
				return validateVisibilityNeedsOwnership(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.EXTENSION_END___VALIDATE_HAS_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP :
				return validateHasQualifiedName(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.EXTENSION_END___VALIDATE_HAS_NO_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP :
				return validateHasNoQualifiedName(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.EXTENSION_END___CREATE_DEPENDENCY__NAMEDELEMENT :
				return createDependency((NamedElement) arguments.get(0));
			case UMLPackage.EXTENSION_END___CREATE_USAGE__NAMEDELEMENT :
				return createUsage((NamedElement) arguments.get(0));
			case UMLPackage.EXTENSION_END___GET_LABEL :
				return getLabel();
			case UMLPackage.EXTENSION_END___GET_LABEL__BOOLEAN :
				return getLabel((Boolean) arguments.get(0));
			case UMLPackage.EXTENSION_END___GET_NAMESPACE :
				return getNamespace();
			case UMLPackage.EXTENSION_END___ALL_NAMESPACES :
				return allNamespaces();
			case UMLPackage.EXTENSION_END___ALL_OWNING_PACKAGES :
				return allOwningPackages();
			case UMLPackage.EXTENSION_END___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE :
				return isDistinguishableFrom((NamedElement) arguments.get(0),
					(Namespace) arguments.get(1));
			case UMLPackage.EXTENSION_END___GET_QUALIFIED_NAME :
				return getQualifiedName();
			case UMLPackage.EXTENSION_END___SEPARATOR :
				return separator();
			case UMLPackage.EXTENSION_END___GET_CLIENT_DEPENDENCIES :
				return getClientDependencies();
			case UMLPackage.EXTENSION_END___VALIDATE_REDEFINITION_CONSISTENT__DIAGNOSTICCHAIN_MAP :
				return validateRedefinitionConsistent(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.EXTENSION_END___VALIDATE_NON_LEAF_REDEFINITION__DIAGNOSTICCHAIN_MAP :
				return validateNonLeafRedefinition(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.EXTENSION_END___VALIDATE_REDEFINITION_CONTEXT_VALID__DIAGNOSTICCHAIN_MAP :
				return validateRedefinitionContextValid(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.EXTENSION_END___IS_CONSISTENT_WITH__REDEFINABLEELEMENT :
				return isConsistentWith((RedefinableElement) arguments.get(0));
			case UMLPackage.EXTENSION_END___IS_REDEFINITION_CONTEXT_VALID__REDEFINABLEELEMENT :
				return isRedefinitionContextValid(
					(RedefinableElement) arguments.get(0));
			case UMLPackage.EXTENSION_END___VALIDATE_UPPER_GE_LOWER__DIAGNOSTICCHAIN_MAP :
				return validateUpperGeLower((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.EXTENSION_END___VALIDATE_LOWER_GE0__DIAGNOSTICCHAIN_MAP :
				return validateLowerGe0((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.EXTENSION_END___VALIDATE_VALUE_SPECIFICATION_NO_SIDE_EFFECTS__DIAGNOSTICCHAIN_MAP :
				return validateValueSpecificationNoSideEffects(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.EXTENSION_END___VALIDATE_VALUE_SPECIFICATION_CONSTANT__DIAGNOSTICCHAIN_MAP :
				return validateValueSpecificationConstant(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.EXTENSION_END___VALIDATE_LOWER_IS_INTEGER__DIAGNOSTICCHAIN_MAP :
				return validateLowerIsInteger(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.EXTENSION_END___VALIDATE_UPPER_IS_UNLIMITED_NATURAL__DIAGNOSTICCHAIN_MAP :
				return validateUpperIsUnlimitedNatural(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.EXTENSION_END___SET_LOWER__INT :
				setLower((Integer) arguments.get(0));
				return null;
			case UMLPackage.EXTENSION_END___SET_UPPER__INT :
				setUpper((Integer) arguments.get(0));
				return null;
			case UMLPackage.EXTENSION_END___COMPATIBLE_WITH__MULTIPLICITYELEMENT :
				return compatibleWith((MultiplicityElement) arguments.get(0));
			case UMLPackage.EXTENSION_END___INCLUDES_MULTIPLICITY__MULTIPLICITYELEMENT :
				return includesMultiplicity(
					(MultiplicityElement) arguments.get(0));
			case UMLPackage.EXTENSION_END___IS__INT_INT :
				return is((Integer) arguments.get(0),
					(Integer) arguments.get(1));
			case UMLPackage.EXTENSION_END___IS_MULTIVALUED :
				return isMultivalued();
			case UMLPackage.EXTENSION_END___GET_LOWER :
				return getLower();
			case UMLPackage.EXTENSION_END___LOWER_BOUND :
				return lowerBound();
			case UMLPackage.EXTENSION_END___GET_UPPER :
				return getUpper();
			case UMLPackage.EXTENSION_END___UPPER_BOUND :
				return upperBound();
			case UMLPackage.EXTENSION_END___IS_COMPATIBLE_WITH__PARAMETERABLEELEMENT :
				return isCompatibleWith(
					(ParameterableElement) arguments.get(0));
			case UMLPackage.EXTENSION_END___IS_TEMPLATE_PARAMETER :
				return isTemplateParameter();
			case UMLPackage.EXTENSION_END___GET_ENDS :
				return getEnds();
			case UMLPackage.EXTENSION_END___GET_DEPLOYED_ELEMENTS :
				return getDeployedElements();
			case UMLPackage.EXTENSION_END___VALIDATE_SUBSETTING_CONTEXT_CONFORMS__DIAGNOSTICCHAIN_MAP :
				return validateSubsettingContextConforms(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.EXTENSION_END___VALIDATE_DERIVED_UNION_IS_READ_ONLY__DIAGNOSTICCHAIN_MAP :
				return validateDerivedUnionIsReadOnly(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.EXTENSION_END___VALIDATE_MULTIPLICITY_OF_COMPOSITE__DIAGNOSTICCHAIN_MAP :
				return validateMultiplicityOfComposite(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.EXTENSION_END___VALIDATE_REDEFINED_PROPERTY_INHERITED__DIAGNOSTICCHAIN_MAP :
				return validateRedefinedPropertyInherited(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.EXTENSION_END___VALIDATE_SUBSETTING_RULES__DIAGNOSTICCHAIN_MAP :
				return validateSubsettingRules(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.EXTENSION_END___VALIDATE_BINDING_TO_ATTRIBUTE__DIAGNOSTICCHAIN_MAP :
				return validateBindingToAttribute(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.EXTENSION_END___VALIDATE_DERIVED_UNION_IS_DERIVED__DIAGNOSTICCHAIN_MAP :
				return validateDerivedUnionIsDerived(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.EXTENSION_END___VALIDATE_DEPLOYMENT_TARGET__DIAGNOSTICCHAIN_MAP :
				return validateDeploymentTarget(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.EXTENSION_END___VALIDATE_SUBSETTED_PROPERTY_NAMES__DIAGNOSTICCHAIN_MAP :
				return validateSubsettedPropertyNames(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.EXTENSION_END___VALIDATE_TYPE_OF_OPPOSITE_END__DIAGNOSTICCHAIN_MAP :
				return validateTypeOfOppositeEnd(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.EXTENSION_END___VALIDATE_QUALIFIED_IS_ASSOCIATION_END__DIAGNOSTICCHAIN_MAP :
				return validateQualifiedIsAssociationEnd(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.EXTENSION_END___GET_DEFAULT :
				return getDefault();
			case UMLPackage.EXTENSION_END___GET_OTHER_END :
				return getOtherEnd();
			case UMLPackage.EXTENSION_END___IS_SET_DEFAULT :
				return isSetDefault();
			case UMLPackage.EXTENSION_END___SET_BOOLEAN_DEFAULT_VALUE__BOOLEAN :
				setBooleanDefaultValue((Boolean) arguments.get(0));
				return null;
			case UMLPackage.EXTENSION_END___SET_DEFAULT__STRING :
				setDefault((String) arguments.get(0));
				return null;
			case UMLPackage.EXTENSION_END___SET_INTEGER_DEFAULT_VALUE__INT :
				setIntegerDefaultValue((Integer) arguments.get(0));
				return null;
			case UMLPackage.EXTENSION_END___SET_IS_COMPOSITE__BOOLEAN :
				setIsComposite((Boolean) arguments.get(0));
				return null;
			case UMLPackage.EXTENSION_END___SET_IS_NAVIGABLE__BOOLEAN :
				setIsNavigable((Boolean) arguments.get(0));
				return null;
			case UMLPackage.EXTENSION_END___SET_NULL_DEFAULT_VALUE :
				setNullDefaultValue();
				return null;
			case UMLPackage.EXTENSION_END___SET_OPPOSITE__PROPERTY :
				setOpposite((Property) arguments.get(0));
				return null;
			case UMLPackage.EXTENSION_END___SET_REAL_DEFAULT_VALUE__DOUBLE :
				setRealDefaultValue((Double) arguments.get(0));
				return null;
			case UMLPackage.EXTENSION_END___SET_STRING_DEFAULT_VALUE__STRING :
				setStringDefaultValue((String) arguments.get(0));
				return null;
			case UMLPackage.EXTENSION_END___SET_UNLIMITED_NATURAL_DEFAULT_VALUE__INT :
				setUnlimitedNaturalDefaultValue((Integer) arguments.get(0));
				return null;
			case UMLPackage.EXTENSION_END___UNSET_DEFAULT :
				unsetDefault();
				return null;
			case UMLPackage.EXTENSION_END___IS_ATTRIBUTE :
				return isAttribute();
			case UMLPackage.EXTENSION_END___IS_COMPOSITE :
				return isComposite();
			case UMLPackage.EXTENSION_END___IS_NAVIGABLE :
				return isNavigable();
			case UMLPackage.EXTENSION_END___GET_OPPOSITE :
				return getOpposite();
			case UMLPackage.EXTENSION_END___SUBSETTING_CONTEXT :
				return subsettingContext();
			case UMLPackage.EXTENSION_END___VALIDATE_MULTIPLICITY__DIAGNOSTICCHAIN_MAP :
				return validateMultiplicity((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.EXTENSION_END___VALIDATE_AGGREGATION__DIAGNOSTICCHAIN_MAP :
				return validateAggregation((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
		}
		return eDynamicInvoke(operationID, arguments);
	}

} //ExtensionEndImpl
