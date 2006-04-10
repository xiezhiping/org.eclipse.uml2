/*
 * Copyright (c) 2003, 2006 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *
 * $Id: IntervalImpl.java,v 1.15 2006/04/10 20:40:18 khussey Exp $
 */
package org.eclipse.uml2.impl;

import java.util.Collection;

import java.util.Iterator;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
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
	 * The cached value of the '{@link #getMins() <em>Min</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMins()
	 * @generated
	 * @ordered
	 */
	protected EList mins = null;

	/**
	 * The cached value of the '{@link #getMaxes() <em>Max</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxes()
	 * @generated
	 * @ordered
	 */
	protected EList maxes = null;

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
		return UML2Package.Literals.INTERVAL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getMins() {
		if (mins == null) {
			mins = new EObjectResolvingEList(ValueSpecification.class, this, UML2Package.INTERVAL__MIN);
		}
		return mins;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
    public ValueSpecification getMin(String name) {
		return getMin(name, false, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueSpecification getMin(String name, boolean ignoreCase, EClass eClass) {
		minLoop: for (Iterator i = getMins().iterator(); i.hasNext(); ) {
			ValueSpecification min = (ValueSpecification) i.next();
			if (eClass != null && !eClass.isInstance(min))
				continue minLoop;
			if (name != null && !(ignoreCase ? name.equalsIgnoreCase(min.getName()) : name.equals(min.getName())))
				continue minLoop;
			return min;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getMaxes() {
		if (maxes == null) {
			maxes = new EObjectResolvingEList(ValueSpecification.class, this, UML2Package.INTERVAL__MAX);
		}
		return maxes;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
    public ValueSpecification getMax(String name) {
		return getMax(name, false, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueSpecification getMax(String name, boolean ignoreCase, EClass eClass) {
		maxLoop: for (Iterator i = getMaxes().iterator(); i.hasNext(); ) {
			ValueSpecification max = (ValueSpecification) i.next();
			if (eClass != null && !eClass.isInstance(max))
				continue maxLoop;
			if (name != null && !(ignoreCase ? name.equalsIgnoreCase(max.getName()) : name.equals(max.getName())))
				continue maxLoop;
			return max;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
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
		return eDynamicGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
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
		eDynamicSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eUnset(int featureID) {
		switch (featureID) {
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
		eDynamicUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case UML2Package.INTERVAL__EANNOTATIONS:
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UML2Package.INTERVAL__OWNED_ELEMENT:
				return isSetOwnedElements();
			case UML2Package.INTERVAL__OWNER:
				return isSetOwner();
			case UML2Package.INTERVAL__OWNED_COMMENT:
				return ownedComments != null && !ownedComments.isEmpty();
			case UML2Package.INTERVAL__TEMPLATE_BINDING:
				return templateBindings != null && !templateBindings.isEmpty();
			case UML2Package.INTERVAL__OWNED_TEMPLATE_SIGNATURE:
				return ownedTemplateSignature != null;
			case UML2Package.INTERVAL__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case UML2Package.INTERVAL__QUALIFIED_NAME:
				return QUALIFIED_NAME_EDEFAULT == null ? getQualifiedName() != null : !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case UML2Package.INTERVAL__VISIBILITY:
				return visibility != VISIBILITY_EDEFAULT;
			case UML2Package.INTERVAL__CLIENT_DEPENDENCY:
				return clientDependencies != null && !clientDependencies.isEmpty();
			case UML2Package.INTERVAL__NAME_EXPRESSION:
				return nameExpression != null;
			case UML2Package.INTERVAL__TYPE:
				return type != null;
			case UML2Package.INTERVAL__TEMPLATE_PARAMETER:
				return templateParameter != null;
			case UML2Package.INTERVAL__OWNING_PARAMETER:
				return getOwningParameter() != null;
			case UML2Package.INTERVAL__MIN:
				return mins != null && !mins.isEmpty();
			case UML2Package.INTERVAL__MAX:
				return maxes != null && !maxes.isEmpty();
		}
		return eDynamicIsSet(featureID);
	}


} //IntervalImpl
