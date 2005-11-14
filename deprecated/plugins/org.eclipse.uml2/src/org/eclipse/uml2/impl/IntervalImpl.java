/*
 * Copyright (c) 2003, 2005 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *
 * $Id: IntervalImpl.java,v 1.10 2005/11/14 17:31:07 khussey Exp $
 */
package org.eclipse.uml2.impl;

import java.util.Collection;

import java.util.Iterator;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.uml2.Interval;
import org.eclipse.uml2.StringExpression;
import org.eclipse.uml2.TemplateParameter;
import org.eclipse.uml2.TemplateSignature;
import org.eclipse.uml2.Type;
import org.eclipse.uml2.UML2Package;
import org.eclipse.uml2.ValueSpecification;
import org.eclipse.uml2.VisibilityKind;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Interval</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2.impl.IntervalImpl#getMins <em>Min</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.IntervalImpl#getMaxes <em>Max</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IntervalImpl extends ValueSpecificationImpl implements Interval {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) IBM Corporation and others."; //$NON-NLS-1$

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IntervalImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return UML2Package.eINSTANCE.getInterval();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getMins() {
		EList min = (EList)eVirtualGet(UML2Package.INTERVAL__MIN);
		if (min == null) {
			eVirtualSet(UML2Package.INTERVAL__MIN, min = new EObjectResolvingEList(ValueSpecification.class, this, UML2Package.INTERVAL__MIN));
		}
		return min;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
    public ValueSpecification getMin(String name) {
		for (Iterator i = getMins().iterator(); i.hasNext(); ) {
			ValueSpecification min = (ValueSpecification) i.next();
			if (name.equals(min.getName())) {
				return min;
			}
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getMaxes() {
		EList max = (EList)eVirtualGet(UML2Package.INTERVAL__MAX);
		if (max == null) {
			eVirtualSet(UML2Package.INTERVAL__MAX, max = new EObjectResolvingEList(ValueSpecification.class, this, UML2Package.INTERVAL__MAX));
		}
		return max;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
    public ValueSpecification getMax(String name) {
		for (Iterator i = getMaxes().iterator(); i.hasNext(); ) {
			ValueSpecification max = (ValueSpecification) i.next();
			if (name.equals(max.getName())) {
				return max;
			}
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(EStructuralFeature eFeature, boolean resolve) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case UML2Package.INTERVAL__EANNOTATIONS:
				return getEAnnotations();
			case UML2Package.INTERVAL__OWNED_ELEMENT:
				return getOwnedElements();
			case UML2Package.INTERVAL__OWNER:
				if (resolve) return getOwner();
				return basicGetOwner();
			case UML2Package.INTERVAL__OWNED_COMMENT:
				return getOwnedComments();
			case UML2Package.INTERVAL__TEMPLATE_BINDING:
				return getTemplateBindings();
			case UML2Package.INTERVAL__OWNED_TEMPLATE_SIGNATURE:
				return getOwnedTemplateSignature();
			case UML2Package.INTERVAL__NAME:
				return getName();
			case UML2Package.INTERVAL__QUALIFIED_NAME:
				return getQualifiedName();
			case UML2Package.INTERVAL__VISIBILITY:
				return getVisibility();
			case UML2Package.INTERVAL__CLIENT_DEPENDENCY:
				return getClientDependencies();
			case UML2Package.INTERVAL__NAME_EXPRESSION:
				return getNameExpression();
			case UML2Package.INTERVAL__TYPE:
				if (resolve) return getType();
				return basicGetType();
			case UML2Package.INTERVAL__TEMPLATE_PARAMETER:
				if (resolve) return getTemplateParameter();
				return basicGetTemplateParameter();
			case UML2Package.INTERVAL__OWNING_PARAMETER:
				return getOwningParameter();
			case UML2Package.INTERVAL__MIN:
				return getMins();
			case UML2Package.INTERVAL__MAX:
				return getMaxes();
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
			case UML2Package.INTERVAL__EANNOTATIONS:
				getEAnnotations().clear();
				getEAnnotations().addAll((Collection)newValue);
				return;
			case UML2Package.INTERVAL__OWNED_COMMENT:
				getOwnedComments().clear();
				getOwnedComments().addAll((Collection)newValue);
				return;
			case UML2Package.INTERVAL__TEMPLATE_BINDING:
				getTemplateBindings().clear();
				getTemplateBindings().addAll((Collection)newValue);
				return;
			case UML2Package.INTERVAL__OWNED_TEMPLATE_SIGNATURE:
				setOwnedTemplateSignature((TemplateSignature)newValue);
				return;
			case UML2Package.INTERVAL__NAME:
				setName((String)newValue);
				return;
			case UML2Package.INTERVAL__VISIBILITY:
				setVisibility((VisibilityKind)newValue);
				return;
			case UML2Package.INTERVAL__CLIENT_DEPENDENCY:
				getClientDependencies().clear();
				getClientDependencies().addAll((Collection)newValue);
				return;
			case UML2Package.INTERVAL__NAME_EXPRESSION:
				setNameExpression((StringExpression)newValue);
				return;
			case UML2Package.INTERVAL__TYPE:
				setType((Type)newValue);
				return;
			case UML2Package.INTERVAL__TEMPLATE_PARAMETER:
				setTemplateParameter((TemplateParameter)newValue);
				return;
			case UML2Package.INTERVAL__OWNING_PARAMETER:
				setOwningParameter((TemplateParameter)newValue);
				return;
			case UML2Package.INTERVAL__MIN:
				getMins().clear();
				getMins().addAll((Collection)newValue);
				return;
			case UML2Package.INTERVAL__MAX:
				getMaxes().clear();
				getMaxes().addAll((Collection)newValue);
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
			case UML2Package.INTERVAL__EANNOTATIONS:
				getEAnnotations().clear();
				return;
			case UML2Package.INTERVAL__OWNED_COMMENT:
				getOwnedComments().clear();
				return;
			case UML2Package.INTERVAL__TEMPLATE_BINDING:
				getTemplateBindings().clear();
				return;
			case UML2Package.INTERVAL__OWNED_TEMPLATE_SIGNATURE:
				setOwnedTemplateSignature((TemplateSignature)null);
				return;
			case UML2Package.INTERVAL__NAME:
				setName(NAME_EDEFAULT);
				return;
			case UML2Package.INTERVAL__VISIBILITY:
				setVisibility(VISIBILITY_EDEFAULT);
				return;
			case UML2Package.INTERVAL__CLIENT_DEPENDENCY:
				getClientDependencies().clear();
				return;
			case UML2Package.INTERVAL__NAME_EXPRESSION:
				setNameExpression((StringExpression)null);
				return;
			case UML2Package.INTERVAL__TYPE:
				setType((Type)null);
				return;
			case UML2Package.INTERVAL__TEMPLATE_PARAMETER:
				setTemplateParameter((TemplateParameter)null);
				return;
			case UML2Package.INTERVAL__OWNING_PARAMETER:
				setOwningParameter((TemplateParameter)null);
				return;
			case UML2Package.INTERVAL__MIN:
				getMins().clear();
				return;
			case UML2Package.INTERVAL__MAX:
				getMaxes().clear();
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
			case UML2Package.INTERVAL__EANNOTATIONS:
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UML2Package.INTERVAL__OWNED_ELEMENT:
				return isSetOwnedElements();
			case UML2Package.INTERVAL__OWNER:
				return isSetOwner();
			case UML2Package.INTERVAL__OWNED_COMMENT:
				EList ownedComment = (EList)eVirtualGet(UML2Package.INTERVAL__OWNED_COMMENT);
				return ownedComment != null && !ownedComment.isEmpty();
			case UML2Package.INTERVAL__TEMPLATE_BINDING:
				EList templateBinding = (EList)eVirtualGet(UML2Package.INTERVAL__TEMPLATE_BINDING);
				return templateBinding != null && !templateBinding.isEmpty();
			case UML2Package.INTERVAL__OWNED_TEMPLATE_SIGNATURE:
				return eVirtualGet(UML2Package.INTERVAL__OWNED_TEMPLATE_SIGNATURE) != null;
			case UML2Package.INTERVAL__NAME:
				String name = eVirtualIsSet(UML2Package.INTERVAL__NAME) ? (String)eVirtualGet(UML2Package.INTERVAL__NAME) : NAME_EDEFAULT;
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case UML2Package.INTERVAL__QUALIFIED_NAME:
				return QUALIFIED_NAME_EDEFAULT == null ? getQualifiedName() != null : !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case UML2Package.INTERVAL__VISIBILITY:
				return eVirtualIsSet(UML2Package.INTERVAL__VISIBILITY) && eVirtualGet(UML2Package.INTERVAL__VISIBILITY) != VISIBILITY_EDEFAULT;
			case UML2Package.INTERVAL__CLIENT_DEPENDENCY:
				EList clientDependency = (EList)eVirtualGet(UML2Package.INTERVAL__CLIENT_DEPENDENCY);
				return clientDependency != null && !clientDependency.isEmpty();
			case UML2Package.INTERVAL__NAME_EXPRESSION:
				return eVirtualGet(UML2Package.INTERVAL__NAME_EXPRESSION) != null;
			case UML2Package.INTERVAL__TYPE:
				return eVirtualGet(UML2Package.INTERVAL__TYPE) != null;
			case UML2Package.INTERVAL__TEMPLATE_PARAMETER:
				return eVirtualGet(UML2Package.INTERVAL__TEMPLATE_PARAMETER) != null;
			case UML2Package.INTERVAL__OWNING_PARAMETER:
				return getOwningParameter() != null;
			case UML2Package.INTERVAL__MIN:
				EList min = (EList)eVirtualGet(UML2Package.INTERVAL__MIN);
				return min != null && !min.isEmpty();
			case UML2Package.INTERVAL__MAX:
				EList max = (EList)eVirtualGet(UML2Package.INTERVAL__MAX);
				return max != null && !max.isEmpty();
		}
		return eDynamicIsSet(eFeature);
	}


} //IntervalImpl
