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
 * $Id: ExtensionEndImpl.java,v 1.19 2006/04/10 19:16:20 khussey Exp $
 */
package org.eclipse.uml2.uml.internal.impl;

import java.util.Map;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.uml2.uml.ExtensionEnd;
import org.eclipse.uml2.uml.Type;
import org.eclipse.uml2.uml.UMLPackage;

import org.eclipse.uml2.uml.internal.operations.ExtensionEndOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Extension End</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ExtensionEndImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ExtensionEndImpl#getLower <em>Lower</em>}</li>
 * </ul>
 * </p>
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
	protected EClass eStaticClass() {
		return UMLPackage.Literals.EXTENSION_END;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
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
	public Type basicGetType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(Type newType) {
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
	public int getLower() {
		return ExtensionEndOperations.getLower(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
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
	public boolean validateMultiplicity(DiagnosticChain diagnostics, Map context) {
		return ExtensionEndOperations.validateMultiplicity(this, diagnostics,
			context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAggregation(DiagnosticChain diagnostics, Map context) {
		return ExtensionEndOperations.validateAggregation(this, diagnostics,
			context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int lowerBound() {
		return ExtensionEndOperations.lowerBound(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UMLPackage.EXTENSION_END__EANNOTATIONS :
				return getEAnnotations();
			case UMLPackage.EXTENSION_END__OWNED_ELEMENT :
				return getOwnedElements();
			case UMLPackage.EXTENSION_END__OWNER :
				if (resolve)
					return getOwner();
				return basicGetOwner();
			case UMLPackage.EXTENSION_END__OWNED_COMMENT :
				return getOwnedComments();
			case UMLPackage.EXTENSION_END__NAME :
				return getName();
			case UMLPackage.EXTENSION_END__VISIBILITY :
				return getVisibility();
			case UMLPackage.EXTENSION_END__QUALIFIED_NAME :
				return getQualifiedName();
			case UMLPackage.EXTENSION_END__CLIENT_DEPENDENCY :
				return getClientDependencies();
			case UMLPackage.EXTENSION_END__NAMESPACE :
				if (resolve)
					return getNamespace();
				return basicGetNamespace();
			case UMLPackage.EXTENSION_END__NAME_EXPRESSION :
				if (resolve)
					return getNameExpression();
				return basicGetNameExpression();
			case UMLPackage.EXTENSION_END__IS_LEAF :
				return isLeaf()
					? Boolean.TRUE
					: Boolean.FALSE;
			case UMLPackage.EXTENSION_END__REDEFINED_ELEMENT :
				return getRedefinedElements();
			case UMLPackage.EXTENSION_END__REDEFINITION_CONTEXT :
				return getRedefinitionContexts();
			case UMLPackage.EXTENSION_END__IS_STATIC :
				return isStatic()
					? Boolean.TRUE
					: Boolean.FALSE;
			case UMLPackage.EXTENSION_END__FEATURING_CLASSIFIER :
				return getFeaturingClassifiers();
			case UMLPackage.EXTENSION_END__TYPE :
				if (resolve)
					return getType();
				return basicGetType();
			case UMLPackage.EXTENSION_END__IS_ORDERED :
				return isOrdered()
					? Boolean.TRUE
					: Boolean.FALSE;
			case UMLPackage.EXTENSION_END__IS_UNIQUE :
				return isUnique()
					? Boolean.TRUE
					: Boolean.FALSE;
			case UMLPackage.EXTENSION_END__UPPER :
				return new Integer(getUpper());
			case UMLPackage.EXTENSION_END__LOWER :
				return new Integer(getLower());
			case UMLPackage.EXTENSION_END__UPPER_VALUE :
				if (resolve)
					return getUpperValue();
				return basicGetUpperValue();
			case UMLPackage.EXTENSION_END__LOWER_VALUE :
				if (resolve)
					return getLowerValue();
				return basicGetLowerValue();
			case UMLPackage.EXTENSION_END__IS_READ_ONLY :
				return isReadOnly()
					? Boolean.TRUE
					: Boolean.FALSE;
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
			case UMLPackage.EXTENSION_END__DEPLOYMENT :
				return getDeployments();
			case UMLPackage.EXTENSION_END__DEPLOYED_ELEMENT :
				return getDeployedElements();
			case UMLPackage.EXTENSION_END__TEMPLATE_BINDING :
				return getTemplateBindings();
			case UMLPackage.EXTENSION_END__OWNED_TEMPLATE_SIGNATURE :
				if (resolve)
					return getOwnedTemplateSignature();
				return basicGetOwnedTemplateSignature();
			case UMLPackage.EXTENSION_END__CLASS :
				if (resolve)
					return getClass_();
				return basicGetClass_();
			case UMLPackage.EXTENSION_END__DATATYPE :
				if (resolve)
					return getDatatype();
				return basicGetDatatype();
			case UMLPackage.EXTENSION_END__IS_DERIVED :
				return isDerived()
					? Boolean.TRUE
					: Boolean.FALSE;
			case UMLPackage.EXTENSION_END__IS_DERIVED_UNION :
				return isDerivedUnion()
					? Boolean.TRUE
					: Boolean.FALSE;
			case UMLPackage.EXTENSION_END__DEFAULT :
				return getDefault();
			case UMLPackage.EXTENSION_END__AGGREGATION :
				return getAggregation();
			case UMLPackage.EXTENSION_END__IS_COMPOSITE :
				return isComposite()
					? Boolean.TRUE
					: Boolean.FALSE;
			case UMLPackage.EXTENSION_END__REDEFINED_PROPERTY :
				return getRedefinedProperties();
			case UMLPackage.EXTENSION_END__OWNING_ASSOCIATION :
				if (resolve)
					return getOwningAssociation();
				return basicGetOwningAssociation();
			case UMLPackage.EXTENSION_END__DEFAULT_VALUE :
				if (resolve)
					return getDefaultValue();
				return basicGetDefaultValue();
			case UMLPackage.EXTENSION_END__OPPOSITE :
				if (resolve)
					return getOpposite();
				return basicGetOpposite();
			case UMLPackage.EXTENSION_END__SUBSETTED_PROPERTY :
				return getSubsettedProperties();
			case UMLPackage.EXTENSION_END__ASSOCIATION :
				if (resolve)
					return getAssociation();
				return basicGetAssociation();
			case UMLPackage.EXTENSION_END__QUALIFIER :
				return getQualifiers();
			case UMLPackage.EXTENSION_END__ASSOCIATION_END :
				if (resolve)
					return getAssociationEnd();
				return basicGetAssociationEnd();
		}
		return eDynamicGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case UMLPackage.EXTENSION_END__EANNOTATIONS :
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UMLPackage.EXTENSION_END__OWNED_ELEMENT :
				return isSetOwnedElements();
			case UMLPackage.EXTENSION_END__OWNER :
				return isSetOwner();
			case UMLPackage.EXTENSION_END__OWNED_COMMENT :
				return ownedComments != null && !ownedComments.isEmpty();
			case UMLPackage.EXTENSION_END__NAME :
				return isSetName();
			case UMLPackage.EXTENSION_END__VISIBILITY :
				return isSetVisibility();
			case UMLPackage.EXTENSION_END__QUALIFIED_NAME :
				return QUALIFIED_NAME_EDEFAULT == null
					? getQualifiedName() != null
					: !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case UMLPackage.EXTENSION_END__CLIENT_DEPENDENCY :
				return clientDependencies != null
					&& !clientDependencies.isEmpty();
			case UMLPackage.EXTENSION_END__NAMESPACE :
				return isSetNamespace();
			case UMLPackage.EXTENSION_END__NAME_EXPRESSION :
				return nameExpression != null;
			case UMLPackage.EXTENSION_END__IS_LEAF :
				return ((eFlags & IS_LEAF_EFLAG) != 0) != IS_LEAF_EDEFAULT;
			case UMLPackage.EXTENSION_END__REDEFINED_ELEMENT :
				return isSetRedefinedElements();
			case UMLPackage.EXTENSION_END__REDEFINITION_CONTEXT :
				return isSetRedefinitionContexts();
			case UMLPackage.EXTENSION_END__IS_STATIC :
				return ((eFlags & IS_STATIC_EFLAG) != 0) != IS_STATIC_EDEFAULT;
			case UMLPackage.EXTENSION_END__FEATURING_CLASSIFIER :
				return isSetFeaturingClassifiers();
			case UMLPackage.EXTENSION_END__TYPE :
				return isSetType();
			case UMLPackage.EXTENSION_END__IS_ORDERED :
				return ((eFlags & IS_ORDERED_EFLAG) != 0) != IS_ORDERED_EDEFAULT;
			case UMLPackage.EXTENSION_END__IS_UNIQUE :
				return ((eFlags & IS_UNIQUE_EFLAG) != 0) != IS_UNIQUE_EDEFAULT;
			case UMLPackage.EXTENSION_END__UPPER :
				return getUpper() != UPPER_EDEFAULT;
			case UMLPackage.EXTENSION_END__LOWER :
				return isSetLower();
			case UMLPackage.EXTENSION_END__UPPER_VALUE :
				return upperValue != null;
			case UMLPackage.EXTENSION_END__LOWER_VALUE :
				return lowerValue != null;
			case UMLPackage.EXTENSION_END__IS_READ_ONLY :
				return isSetIsReadOnly();
			case UMLPackage.EXTENSION_END__OWNING_TEMPLATE_PARAMETER :
				return basicGetOwningTemplateParameter() != null;
			case UMLPackage.EXTENSION_END__TEMPLATE_PARAMETER :
				return isSetTemplateParameter();
			case UMLPackage.EXTENSION_END__END :
				return ends != null && !ends.isEmpty();
			case UMLPackage.EXTENSION_END__DEPLOYMENT :
				return deployments != null && !deployments.isEmpty();
			case UMLPackage.EXTENSION_END__DEPLOYED_ELEMENT :
				return !getDeployedElements().isEmpty();
			case UMLPackage.EXTENSION_END__TEMPLATE_BINDING :
				return templateBindings != null && !templateBindings.isEmpty();
			case UMLPackage.EXTENSION_END__OWNED_TEMPLATE_SIGNATURE :
				return ownedTemplateSignature != null;
			case UMLPackage.EXTENSION_END__CLASS :
				return basicGetClass_() != null;
			case UMLPackage.EXTENSION_END__DATATYPE :
				return basicGetDatatype() != null;
			case UMLPackage.EXTENSION_END__IS_DERIVED :
				return ((eFlags & IS_DERIVED_EFLAG) != 0) != IS_DERIVED_EDEFAULT;
			case UMLPackage.EXTENSION_END__IS_DERIVED_UNION :
				return ((eFlags & IS_DERIVED_UNION_EFLAG) != 0) != IS_DERIVED_UNION_EDEFAULT;
			case UMLPackage.EXTENSION_END__DEFAULT :
				return isSetDefault();
			case UMLPackage.EXTENSION_END__AGGREGATION :
				return aggregation != AGGREGATION_EDEFAULT;
			case UMLPackage.EXTENSION_END__IS_COMPOSITE :
				return isComposite() != IS_COMPOSITE_EDEFAULT;
			case UMLPackage.EXTENSION_END__REDEFINED_PROPERTY :
				return redefinedProperties != null
					&& !redefinedProperties.isEmpty();
			case UMLPackage.EXTENSION_END__OWNING_ASSOCIATION :
				return basicGetOwningAssociation() != null;
			case UMLPackage.EXTENSION_END__DEFAULT_VALUE :
				return defaultValue != null;
			case UMLPackage.EXTENSION_END__OPPOSITE :
				return basicGetOpposite() != null;
			case UMLPackage.EXTENSION_END__SUBSETTED_PROPERTY :
				return subsettedProperties != null
					&& !subsettedProperties.isEmpty();
			case UMLPackage.EXTENSION_END__ASSOCIATION :
				return association != null;
			case UMLPackage.EXTENSION_END__QUALIFIER :
				return qualifiers != null && !qualifiers.isEmpty();
			case UMLPackage.EXTENSION_END__ASSOCIATION_END :
				return basicGetAssociationEnd() != null;
		}
		return eDynamicIsSet(featureID);
	}

} //ExtensionEndImpl
