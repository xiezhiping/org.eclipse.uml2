/*
 * Copyright (c) 2003, 2004 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Common Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/cpl-v10.html
 *
 * Contributors:
 *   IBM - Initial API and implementation
 *
 * $Id: ExtensionEndImpl.java,v 1.2 2004/04/10 04:09:49 khussey Exp $
 */
package org.eclipse.uml2.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.uml2.AggregationKind;
import org.eclipse.uml2.Association;
import org.eclipse.uml2.DataType;
import org.eclipse.uml2.ExtensionEnd;
import org.eclipse.uml2.Property;
import org.eclipse.uml2.Stereotype;
import org.eclipse.uml2.StringExpression;
import org.eclipse.uml2.TemplateParameter;
import org.eclipse.uml2.TemplateSignature;
import org.eclipse.uml2.Type;
import org.eclipse.uml2.UML2Package;
import org.eclipse.uml2.ValueSpecification;
import org.eclipse.uml2.VisibilityKind;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Extension End</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class ExtensionEndImpl extends PropertyImpl implements ExtensionEnd {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2003, 2004 IBM Corporation and others."; //$NON-NLS-1$

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
		return UML2Package.eINSTANCE.getExtensionEnd();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <p>
	 * Redefines the following features:
	 * <ul>
	 *   <li>{@link org.eclipse.uml2.TypedElement#getType}</li>
	 * </ul>
	 * </p>
	 * @generated
	 */
	public Type basicGetTypeGen() {
		// TODO: implement this redefinition basic getter
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	public Type basicGetType() {
		// TODO: test this redefinition basic getter
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeGen(Type newType) {
		// TODO: implement this redefinition setter
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	public void setType(Type newType) {
		// TODO: test this redefinition setter
		if (null != newType && !Stereotype.class.isInstance(newType)) {
			throw new IllegalArgumentException(String.valueOf(newType));
		}
//		Type oldType = type;
//		type = newType;
//		if (eNotificationRequired()) {
//			eNotify(new ENotificationImpl(this, Notification.SET, UML2Package.EXTENSION__END_TYPE, oldType, type));
//		}
		super.setType(newType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, Class baseClass, NotificationChain msgs) {
		if (featureID >= 0) {
			switch (eDerivedStructuralFeatureID(featureID, baseClass)) {
				case UML2Package.EXTENSION_END__EANNOTATIONS:
					return ((InternalEList)getEAnnotations()).basicAdd(otherEnd, msgs);
				case UML2Package.EXTENSION_END__TEMPLATE_BINDING:
					return ((InternalEList)getTemplateBindings()).basicAdd(otherEnd, msgs);
				case UML2Package.EXTENSION_END__OWNED_TEMPLATE_SIGNATURE:
					if (ownedTemplateSignature != null)
						msgs = ((InternalEObject)ownedTemplateSignature).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UML2Package.EXTENSION_END__OWNED_TEMPLATE_SIGNATURE, null, msgs);
					return basicSetOwnedTemplateSignature((TemplateSignature)otherEnd, msgs);
				case UML2Package.EXTENSION_END__CLIENT_DEPENDENCY:
					return ((InternalEList)getClientDependencies()).basicAdd(otherEnd, msgs);
				case UML2Package.EXTENSION_END__TEMPLATE_PARAMETER:
					if (templateParameter != null)
						msgs = ((InternalEObject)templateParameter).eInverseRemove(this, UML2Package.TEMPLATE_PARAMETER__PARAMETERED_ELEMENT, TemplateParameter.class, msgs);
					return basicSetTemplateParameter((TemplateParameter)otherEnd, msgs);
				case UML2Package.EXTENSION_END__OWNING_PARAMETER:
					if (eContainer != null)
						msgs = eBasicRemoveFromContainer(msgs);
					return eBasicSetContainer(otherEnd, UML2Package.EXTENSION_END__OWNING_PARAMETER, msgs);
				case UML2Package.EXTENSION_END__END:
					return ((InternalEList)getEnds()).basicAdd(otherEnd, msgs);
				case UML2Package.EXTENSION_END__DEPLOYMENT:
					return ((InternalEList)getDeployments()).basicAdd(otherEnd, msgs);
				case UML2Package.EXTENSION_END__OWNING_ASSOCIATION:
					if (eContainer != null)
						msgs = eBasicRemoveFromContainer(msgs);
					return eBasicSetContainer(otherEnd, UML2Package.EXTENSION_END__OWNING_ASSOCIATION, msgs);
				case UML2Package.EXTENSION_END__DATATYPE:
					if (eContainer != null)
						msgs = eBasicRemoveFromContainer(msgs);
					return eBasicSetContainer(otherEnd, UML2Package.EXTENSION_END__DATATYPE, msgs);
				case UML2Package.EXTENSION_END__ASSOCIATION:
					if (association != null)
						msgs = ((InternalEObject)association).eInverseRemove(this, UML2Package.ASSOCIATION__MEMBER_END, Association.class, msgs);
					return basicSetAssociation((Association)otherEnd, msgs);
				case UML2Package.EXTENSION_END__QUALIFIER:
					return ((InternalEList)getQualifiers()).basicAdd(otherEnd, msgs);
				case UML2Package.EXTENSION_END__ASSOCIATION_END:
					if (eContainer != null)
						msgs = eBasicRemoveFromContainer(msgs);
					return eBasicSetContainer(otherEnd, UML2Package.EXTENSION_END__ASSOCIATION_END, msgs);
				default:
					return eDynamicInverseAdd(otherEnd, featureID, baseClass, msgs);
			}
		}
		if (eContainer != null)
			msgs = eBasicRemoveFromContainer(msgs);
		return eBasicSetContainer(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, Class baseClass, NotificationChain msgs) {
		if (featureID >= 0) {
			switch (eDerivedStructuralFeatureID(featureID, baseClass)) {
				case UML2Package.EXTENSION_END__EANNOTATIONS:
					return ((InternalEList)getEAnnotations()).basicRemove(otherEnd, msgs);
				case UML2Package.EXTENSION_END__OWNED_COMMENT:
					return ((InternalEList)getOwnedComments()).basicRemove(otherEnd, msgs);
				case UML2Package.EXTENSION_END__TEMPLATE_BINDING:
					return ((InternalEList)getTemplateBindings()).basicRemove(otherEnd, msgs);
				case UML2Package.EXTENSION_END__OWNED_TEMPLATE_SIGNATURE:
					return basicSetOwnedTemplateSignature(null, msgs);
				case UML2Package.EXTENSION_END__CLIENT_DEPENDENCY:
					return ((InternalEList)getClientDependencies()).basicRemove(otherEnd, msgs);
				case UML2Package.EXTENSION_END__NAME_EXPRESSION:
					return basicSetNameExpression(null, msgs);
				case UML2Package.EXTENSION_END__UPPER_VALUE:
					return basicSetUpperValue(null, msgs);
				case UML2Package.EXTENSION_END__LOWER_VALUE:
					return basicSetLowerValue(null, msgs);
				case UML2Package.EXTENSION_END__TEMPLATE_PARAMETER:
					return basicSetTemplateParameter(null, msgs);
				case UML2Package.EXTENSION_END__OWNING_PARAMETER:
					return eBasicSetContainer(null, UML2Package.EXTENSION_END__OWNING_PARAMETER, msgs);
				case UML2Package.EXTENSION_END__END:
					return ((InternalEList)getEnds()).basicRemove(otherEnd, msgs);
				case UML2Package.EXTENSION_END__DEPLOYMENT:
					return ((InternalEList)getDeployments()).basicRemove(otherEnd, msgs);
				case UML2Package.EXTENSION_END__OWNING_ASSOCIATION:
					return eBasicSetContainer(null, UML2Package.EXTENSION_END__OWNING_ASSOCIATION, msgs);
				case UML2Package.EXTENSION_END__DATATYPE:
					return eBasicSetContainer(null, UML2Package.EXTENSION_END__DATATYPE, msgs);
				case UML2Package.EXTENSION_END__ASSOCIATION:
					return basicSetAssociation(null, msgs);
				case UML2Package.EXTENSION_END__DEFAULT_VALUE:
					return basicSetDefaultValue(null, msgs);
				case UML2Package.EXTENSION_END__QUALIFIER:
					return ((InternalEList)getQualifiers()).basicRemove(otherEnd, msgs);
				case UML2Package.EXTENSION_END__ASSOCIATION_END:
					return eBasicSetContainer(null, UML2Package.EXTENSION_END__ASSOCIATION_END, msgs);
				default:
					return eDynamicInverseRemove(otherEnd, featureID, baseClass, msgs);
			}
		}
		return eBasicSetContainer(null, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eBasicRemoveFromContainer(NotificationChain msgs) {
		if (eContainerFeatureID >= 0) {
			switch (eContainerFeatureID) {
				case UML2Package.EXTENSION_END__OWNING_PARAMETER:
					return eContainer.eInverseRemove(this, UML2Package.TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT, TemplateParameter.class, msgs);
				case UML2Package.EXTENSION_END__OWNING_ASSOCIATION:
					return eContainer.eInverseRemove(this, UML2Package.ASSOCIATION__OWNED_END, Association.class, msgs);
				case UML2Package.EXTENSION_END__DATATYPE:
					return eContainer.eInverseRemove(this, UML2Package.DATA_TYPE__OWNED_ATTRIBUTE, DataType.class, msgs);
				case UML2Package.EXTENSION_END__ASSOCIATION_END:
					return eContainer.eInverseRemove(this, UML2Package.PROPERTY__QUALIFIER, Property.class, msgs);
				default:
					return eDynamicBasicRemoveFromContainer(msgs);
			}
		}
		return eContainer.eInverseRemove(this, EOPPOSITE_FEATURE_BASE - eContainerFeatureID, null, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(EStructuralFeature eFeature, boolean resolve) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case UML2Package.EXTENSION_END__EANNOTATIONS:
				return getEAnnotations();
			case UML2Package.EXTENSION_END__OWNED_ELEMENT:
				return getOwnedElements();
			case UML2Package.EXTENSION_END__OWNER:
				if (resolve) return getOwner();
				return basicGetOwner();
			case UML2Package.EXTENSION_END__OWNED_COMMENT:
				return getOwnedComments();
			case UML2Package.EXTENSION_END__TEMPLATE_BINDING:
				return getTemplateBindings();
			case UML2Package.EXTENSION_END__OWNED_TEMPLATE_SIGNATURE:
				return getOwnedTemplateSignature();
			case UML2Package.EXTENSION_END__NAME:
				return getName();
			case UML2Package.EXTENSION_END__QUALIFIED_NAME:
				return getQualifiedName();
			case UML2Package.EXTENSION_END__VISIBILITY:
				return getVisibility();
			case UML2Package.EXTENSION_END__CLIENT_DEPENDENCY:
				return getClientDependencies();
			case UML2Package.EXTENSION_END__NAME_EXPRESSION:
				return getNameExpression();
			case UML2Package.EXTENSION_END__REDEFINITION_CONTEXT:
				return getRedefinitionContexts();
			case UML2Package.EXTENSION_END__IS_LEAF:
				return isLeaf() ? Boolean.TRUE : Boolean.FALSE;
			case UML2Package.EXTENSION_END__FEATURING_CLASSIFIER:
				return getFeaturingClassifiers();
			case UML2Package.EXTENSION_END__IS_STATIC:
				return isStatic() ? Boolean.TRUE : Boolean.FALSE;
			case UML2Package.EXTENSION_END__TYPE:
				if (resolve) return getType();
				return basicGetType();
			case UML2Package.EXTENSION_END__IS_ORDERED:
				return isOrdered() ? Boolean.TRUE : Boolean.FALSE;
			case UML2Package.EXTENSION_END__IS_UNIQUE:
				return isUnique() ? Boolean.TRUE : Boolean.FALSE;
			case UML2Package.EXTENSION_END__LOWER:
				return new Integer(getLower());
			case UML2Package.EXTENSION_END__UPPER:
				return new Integer(getUpper());
			case UML2Package.EXTENSION_END__UPPER_VALUE:
				return getUpperValue();
			case UML2Package.EXTENSION_END__LOWER_VALUE:
				return getLowerValue();
			case UML2Package.EXTENSION_END__IS_READ_ONLY:
				return isReadOnly() ? Boolean.TRUE : Boolean.FALSE;
			case UML2Package.EXTENSION_END__TEMPLATE_PARAMETER:
				if (resolve) return getTemplateParameter();
				return basicGetTemplateParameter();
			case UML2Package.EXTENSION_END__OWNING_PARAMETER:
				return getOwningParameter();
			case UML2Package.EXTENSION_END__END:
				return getEnds();
			case UML2Package.EXTENSION_END__DEPLOYMENT:
				return getDeployments();
			case UML2Package.EXTENSION_END__DEPLOYED_ELEMENT:
				return getDeployedElements();
			case UML2Package.EXTENSION_END__DEFAULT:
				return getDefault();
			case UML2Package.EXTENSION_END__IS_COMPOSITE:
				return isComposite() ? Boolean.TRUE : Boolean.FALSE;
			case UML2Package.EXTENSION_END__IS_DERIVED:
				return isDerived() ? Boolean.TRUE : Boolean.FALSE;
			case UML2Package.EXTENSION_END__CLASS_:
				if (resolve) return getClass_();
				return basicGetClass_();
			case UML2Package.EXTENSION_END__OPPOSITE:
				if (resolve) return getOpposite();
				return basicGetOpposite();
			case UML2Package.EXTENSION_END__IS_DERIVED_UNION:
				return isDerivedUnion() ? Boolean.TRUE : Boolean.FALSE;
			case UML2Package.EXTENSION_END__OWNING_ASSOCIATION:
				return getOwningAssociation();
			case UML2Package.EXTENSION_END__REDEFINED_PROPERTY:
				return getRedefinedProperties();
			case UML2Package.EXTENSION_END__SUBSETTED_PROPERTY:
				return getSubsettedProperties();
			case UML2Package.EXTENSION_END__DATATYPE:
				return getDatatype();
			case UML2Package.EXTENSION_END__ASSOCIATION:
				if (resolve) return getAssociation();
				return basicGetAssociation();
			case UML2Package.EXTENSION_END__AGGREGATION:
				return getAggregation();
			case UML2Package.EXTENSION_END__DEFAULT_VALUE:
				return getDefaultValue();
			case UML2Package.EXTENSION_END__QUALIFIER:
				return getQualifiers();
			case UML2Package.EXTENSION_END__ASSOCIATION_END:
				return getAssociationEnd();
		}
		return eDynamicGet(eFeature, resolve);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eSet(EStructuralFeature eFeature, Object newValue) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case UML2Package.EXTENSION_END__EANNOTATIONS:
				getEAnnotations().clear();
				getEAnnotations().addAll((Collection)newValue);
				return;
			case UML2Package.EXTENSION_END__OWNED_COMMENT:
				getOwnedComments().clear();
				getOwnedComments().addAll((Collection)newValue);
				return;
			case UML2Package.EXTENSION_END__TEMPLATE_BINDING:
				getTemplateBindings().clear();
				getTemplateBindings().addAll((Collection)newValue);
				return;
			case UML2Package.EXTENSION_END__OWNED_TEMPLATE_SIGNATURE:
				setOwnedTemplateSignature((TemplateSignature)newValue);
				return;
			case UML2Package.EXTENSION_END__NAME:
				setName((String)newValue);
				return;
			case UML2Package.EXTENSION_END__VISIBILITY:
				setVisibility((VisibilityKind)newValue);
				return;
			case UML2Package.EXTENSION_END__CLIENT_DEPENDENCY:
				getClientDependencies().clear();
				getClientDependencies().addAll((Collection)newValue);
				return;
			case UML2Package.EXTENSION_END__NAME_EXPRESSION:
				setNameExpression((StringExpression)newValue);
				return;
			case UML2Package.EXTENSION_END__IS_LEAF:
				setIsLeaf(((Boolean)newValue).booleanValue());
				return;
			case UML2Package.EXTENSION_END__IS_STATIC:
				setIsStatic(((Boolean)newValue).booleanValue());
				return;
			case UML2Package.EXTENSION_END__TYPE:
				setType((Type)newValue);
				return;
			case UML2Package.EXTENSION_END__IS_ORDERED:
				setIsOrdered(((Boolean)newValue).booleanValue());
				return;
			case UML2Package.EXTENSION_END__IS_UNIQUE:
				setIsUnique(((Boolean)newValue).booleanValue());
				return;
			case UML2Package.EXTENSION_END__UPPER_VALUE:
				setUpperValue((ValueSpecification)newValue);
				return;
			case UML2Package.EXTENSION_END__LOWER_VALUE:
				setLowerValue((ValueSpecification)newValue);
				return;
			case UML2Package.EXTENSION_END__IS_READ_ONLY:
				setIsReadOnly(((Boolean)newValue).booleanValue());
				return;
			case UML2Package.EXTENSION_END__TEMPLATE_PARAMETER:
				setTemplateParameter((TemplateParameter)newValue);
				return;
			case UML2Package.EXTENSION_END__OWNING_PARAMETER:
				setOwningParameter((TemplateParameter)newValue);
				return;
			case UML2Package.EXTENSION_END__END:
				getEnds().clear();
				getEnds().addAll((Collection)newValue);
				return;
			case UML2Package.EXTENSION_END__DEPLOYMENT:
				getDeployments().clear();
				getDeployments().addAll((Collection)newValue);
				return;
			case UML2Package.EXTENSION_END__IS_DERIVED:
				setIsDerived(((Boolean)newValue).booleanValue());
				return;
			case UML2Package.EXTENSION_END__IS_DERIVED_UNION:
				setIsDerivedUnion(((Boolean)newValue).booleanValue());
				return;
			case UML2Package.EXTENSION_END__OWNING_ASSOCIATION:
				setOwningAssociation((Association)newValue);
				return;
			case UML2Package.EXTENSION_END__REDEFINED_PROPERTY:
				getRedefinedProperties().clear();
				getRedefinedProperties().addAll((Collection)newValue);
				return;
			case UML2Package.EXTENSION_END__SUBSETTED_PROPERTY:
				getSubsettedProperties().clear();
				getSubsettedProperties().addAll((Collection)newValue);
				return;
			case UML2Package.EXTENSION_END__DATATYPE:
				setDatatype((DataType)newValue);
				return;
			case UML2Package.EXTENSION_END__ASSOCIATION:
				setAssociation((Association)newValue);
				return;
			case UML2Package.EXTENSION_END__AGGREGATION:
				setAggregation((AggregationKind)newValue);
				return;
			case UML2Package.EXTENSION_END__DEFAULT_VALUE:
				setDefaultValue((ValueSpecification)newValue);
				return;
			case UML2Package.EXTENSION_END__QUALIFIER:
				getQualifiers().clear();
				getQualifiers().addAll((Collection)newValue);
				return;
			case UML2Package.EXTENSION_END__ASSOCIATION_END:
				setAssociationEnd((Property)newValue);
				return;
		}
		eDynamicSet(eFeature, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eUnset(EStructuralFeature eFeature) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case UML2Package.EXTENSION_END__EANNOTATIONS:
				getEAnnotations().clear();
				return;
			case UML2Package.EXTENSION_END__OWNED_COMMENT:
				getOwnedComments().clear();
				return;
			case UML2Package.EXTENSION_END__TEMPLATE_BINDING:
				getTemplateBindings().clear();
				return;
			case UML2Package.EXTENSION_END__OWNED_TEMPLATE_SIGNATURE:
				setOwnedTemplateSignature((TemplateSignature)null);
				return;
			case UML2Package.EXTENSION_END__NAME:
				setName(NAME_EDEFAULT);
				return;
			case UML2Package.EXTENSION_END__VISIBILITY:
				setVisibility(VISIBILITY_EDEFAULT);
				return;
			case UML2Package.EXTENSION_END__CLIENT_DEPENDENCY:
				getClientDependencies().clear();
				return;
			case UML2Package.EXTENSION_END__NAME_EXPRESSION:
				setNameExpression((StringExpression)null);
				return;
			case UML2Package.EXTENSION_END__IS_LEAF:
				setIsLeaf(IS_LEAF_EDEFAULT);
				return;
			case UML2Package.EXTENSION_END__IS_STATIC:
				setIsStatic(IS_STATIC_EDEFAULT);
				return;
			case UML2Package.EXTENSION_END__TYPE:
				setType((Type)null);
				return;
			case UML2Package.EXTENSION_END__IS_ORDERED:
				setIsOrdered(IS_ORDERED_EDEFAULT);
				return;
			case UML2Package.EXTENSION_END__IS_UNIQUE:
				setIsUnique(IS_UNIQUE_EDEFAULT);
				return;
			case UML2Package.EXTENSION_END__UPPER_VALUE:
				setUpperValue((ValueSpecification)null);
				return;
			case UML2Package.EXTENSION_END__LOWER_VALUE:
				setLowerValue((ValueSpecification)null);
				return;
			case UML2Package.EXTENSION_END__IS_READ_ONLY:
				setIsReadOnly(IS_READ_ONLY_EDEFAULT);
				return;
			case UML2Package.EXTENSION_END__TEMPLATE_PARAMETER:
				setTemplateParameter((TemplateParameter)null);
				return;
			case UML2Package.EXTENSION_END__OWNING_PARAMETER:
				setOwningParameter(null);
				return;
			case UML2Package.EXTENSION_END__END:
				getEnds().clear();
				return;
			case UML2Package.EXTENSION_END__DEPLOYMENT:
				getDeployments().clear();
				return;
			case UML2Package.EXTENSION_END__IS_DERIVED:
				setIsDerived(IS_DERIVED_EDEFAULT);
				return;
			case UML2Package.EXTENSION_END__IS_DERIVED_UNION:
				setIsDerivedUnion(IS_DERIVED_UNION_EDEFAULT);
				return;
			case UML2Package.EXTENSION_END__OWNING_ASSOCIATION:
				setOwningAssociation(null);
				return;
			case UML2Package.EXTENSION_END__REDEFINED_PROPERTY:
				getRedefinedProperties().clear();
				return;
			case UML2Package.EXTENSION_END__SUBSETTED_PROPERTY:
				getSubsettedProperties().clear();
				return;
			case UML2Package.EXTENSION_END__DATATYPE:
				setDatatype((DataType)null);
				return;
			case UML2Package.EXTENSION_END__ASSOCIATION:
				setAssociation((Association)null);
				return;
			case UML2Package.EXTENSION_END__AGGREGATION:
				setAggregation(AGGREGATION_EDEFAULT);
				return;
			case UML2Package.EXTENSION_END__DEFAULT_VALUE:
				setDefaultValue((ValueSpecification)null);
				return;
			case UML2Package.EXTENSION_END__QUALIFIER:
				getQualifiers().clear();
				return;
			case UML2Package.EXTENSION_END__ASSOCIATION_END:
				setAssociationEnd((Property)null);
				return;
		}
		eDynamicUnset(eFeature);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean eIsSet(EStructuralFeature eFeature) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case UML2Package.EXTENSION_END__EANNOTATIONS:
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UML2Package.EXTENSION_END__OWNED_ELEMENT:
				return !getOwnedElements().isEmpty();
			case UML2Package.EXTENSION_END__OWNER:
				return basicGetOwner() != null;
			case UML2Package.EXTENSION_END__OWNED_COMMENT:
				return ownedComment != null && !ownedComment.isEmpty();
			case UML2Package.EXTENSION_END__TEMPLATE_BINDING:
				return templateBinding != null && !templateBinding.isEmpty();
			case UML2Package.EXTENSION_END__OWNED_TEMPLATE_SIGNATURE:
				return ownedTemplateSignature != null;
			case UML2Package.EXTENSION_END__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case UML2Package.EXTENSION_END__QUALIFIED_NAME:
				return !"".equals(getQualifiedName()); //$NON-NLS-1$
			case UML2Package.EXTENSION_END__VISIBILITY:
				return visibility != VISIBILITY_EDEFAULT;
			case UML2Package.EXTENSION_END__CLIENT_DEPENDENCY:
				return clientDependency != null && !clientDependency.isEmpty();
			case UML2Package.EXTENSION_END__NAME_EXPRESSION:
				return nameExpression != null;
			case UML2Package.EXTENSION_END__REDEFINITION_CONTEXT:
				return !getRedefinitionContexts().isEmpty();
			case UML2Package.EXTENSION_END__IS_LEAF:
				return isLeaf != IS_LEAF_EDEFAULT;
			case UML2Package.EXTENSION_END__FEATURING_CLASSIFIER:
				return !getFeaturingClassifiers().isEmpty();
			case UML2Package.EXTENSION_END__IS_STATIC:
				return isStatic != IS_STATIC_EDEFAULT;
			case UML2Package.EXTENSION_END__TYPE:
				return type != null;
			case UML2Package.EXTENSION_END__IS_ORDERED:
				return isOrdered != IS_ORDERED_EDEFAULT;
			case UML2Package.EXTENSION_END__IS_UNIQUE:
				return isUnique != IS_UNIQUE_EDEFAULT;
			case UML2Package.EXTENSION_END__LOWER:
				return getLower() != 1;
			case UML2Package.EXTENSION_END__UPPER:
				return getUpper() != 1;
			case UML2Package.EXTENSION_END__UPPER_VALUE:
				return upperValue != null;
			case UML2Package.EXTENSION_END__LOWER_VALUE:
				return lowerValue != null;
			case UML2Package.EXTENSION_END__IS_READ_ONLY:
				return isReadOnly != IS_READ_ONLY_EDEFAULT;
			case UML2Package.EXTENSION_END__TEMPLATE_PARAMETER:
				return templateParameter != null;
			case UML2Package.EXTENSION_END__OWNING_PARAMETER:
				return getOwningParameter() != null;
			case UML2Package.EXTENSION_END__END:
				return end != null && !end.isEmpty();
			case UML2Package.EXTENSION_END__DEPLOYMENT:
				return deployment != null && !deployment.isEmpty();
			case UML2Package.EXTENSION_END__DEPLOYED_ELEMENT:
				return !getDeployedElements().isEmpty();
			case UML2Package.EXTENSION_END__DEFAULT:
				return !"".equals(getDefault()); //$NON-NLS-1$
			case UML2Package.EXTENSION_END__IS_COMPOSITE:
				return isComposite() != false;
			case UML2Package.EXTENSION_END__IS_DERIVED:
				return isDerived != IS_DERIVED_EDEFAULT;
			case UML2Package.EXTENSION_END__CLASS_:
				return basicGetClass_() != null;
			case UML2Package.EXTENSION_END__OPPOSITE:
				return basicGetOpposite() != null;
			case UML2Package.EXTENSION_END__IS_DERIVED_UNION:
				return isDerivedUnion != IS_DERIVED_UNION_EDEFAULT;
			case UML2Package.EXTENSION_END__OWNING_ASSOCIATION:
				return getOwningAssociation() != null;
			case UML2Package.EXTENSION_END__REDEFINED_PROPERTY:
				return redefinedProperty != null && !redefinedProperty.isEmpty();
			case UML2Package.EXTENSION_END__SUBSETTED_PROPERTY:
				return subsettedProperty != null && !subsettedProperty.isEmpty();
			case UML2Package.EXTENSION_END__DATATYPE:
				return getDatatype() != null;
			case UML2Package.EXTENSION_END__ASSOCIATION:
				return association != null;
			case UML2Package.EXTENSION_END__AGGREGATION:
				return aggregation != AGGREGATION_EDEFAULT;
			case UML2Package.EXTENSION_END__DEFAULT_VALUE:
				return defaultValue != null;
			case UML2Package.EXTENSION_END__QUALIFIER:
				return qualifier != null && !qualifier.isEmpty();
			case UML2Package.EXTENSION_END__ASSOCIATION_END:
				return getAssociationEnd() != null;
		}
		return eDynamicIsSet(eFeature);
	}

} //ExtensionEndImpl
