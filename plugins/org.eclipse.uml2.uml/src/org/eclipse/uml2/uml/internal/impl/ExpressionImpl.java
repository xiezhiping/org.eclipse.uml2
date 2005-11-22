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
 * $Id: ExpressionImpl.java,v 1.2 2005/11/22 15:32:36 khussey Exp $
 */
package org.eclipse.uml2.uml.internal.impl;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.uml2.common.util.DerivedUnionEObjectEList;

import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Expression;
import org.eclipse.uml2.uml.StringExpression;
import org.eclipse.uml2.uml.TemplateParameter;
import org.eclipse.uml2.uml.Type;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.ValueSpecification;
import org.eclipse.uml2.uml.VisibilityKind;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ExpressionImpl#getOwnedElements <em>Owned Element</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ExpressionImpl#getSymbol <em>Symbol</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ExpressionImpl#getOperands <em>Operand</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExpressionImpl
		extends ValueSpecificationImpl
		implements Expression {

	/**
	 * The default value of the '{@link #getSymbol() <em>Symbol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSymbol()
	 * @generated
	 * @ordered
	 */
	protected static final String SYMBOL_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return UMLPackage.eINSTANCE.getExpression();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List getOwnedElements() {
		List ownedElement = (List) eVirtualGet(UMLPackage.EXPRESSION__OWNED_ELEMENT);
		if (ownedElement == null) {
			eVirtualSet(UMLPackage.EXPRESSION__OWNED_ELEMENT,
				ownedElement = new DerivedUnionEObjectEList(Element.class,
					this, UMLPackage.EXPRESSION__OWNED_ELEMENT,
					new EStructuralFeature[]{
						UMLPackage.eINSTANCE.getElement_OwnedComment(),
						UMLPackage.eINSTANCE.getNamedElement_NameExpression(),
						UMLPackage.eINSTANCE.getExpression_Operand()}));
		}
		return ownedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSymbol() {
		return (String) eVirtualGet(UMLPackage.EXPRESSION__SYMBOL,
			SYMBOL_EDEFAULT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSymbol(String newSymbol) {
		newSymbol = newSymbol == null
			? SYMBOL_EDEFAULT
			: newSymbol;
		String symbol = newSymbol;
		Object oldSymbol = eVirtualSet(UMLPackage.EXPRESSION__SYMBOL, symbol);
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.EXPRESSION__SYMBOL, oldSymbol == EVIRTUAL_NO_VALUE
					? SYMBOL_EDEFAULT
					: oldSymbol, symbol));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List getOperands() {
		List operand = (List) eVirtualGet(UMLPackage.EXPRESSION__OPERAND);
		if (operand == null) {
			eVirtualSet(UMLPackage.EXPRESSION__OPERAND,
				operand = new EObjectContainmentEList(ValueSpecification.class,
					this, UMLPackage.EXPRESSION__OPERAND));
		}
		return operand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueSpecification createOperand(EClass eClass) {
		ValueSpecification newOperand = (ValueSpecification) eClass
			.getEPackage().getEFactoryInstance().create(eClass);
		getOperands().add(newOperand);
		return newOperand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueSpecification getOperand(String name) {
		for (Iterator i = getOperands().iterator(); i.hasNext();) {
			ValueSpecification operand = (ValueSpecification) i.next();
			if (name.equals(operand.getName())) {
				return operand;
			}
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd,
			int featureID, Class baseClass, NotificationChain msgs) {
		if (featureID >= 0) {
			switch (eDerivedStructuralFeatureID(featureID, baseClass)) {
				case UMLPackage.EXPRESSION__EANNOTATIONS :
					return ((InternalEList) getEAnnotations()).basicRemove(
						otherEnd, msgs);
				case UMLPackage.EXPRESSION__OWNED_COMMENT :
					return ((InternalEList) getOwnedComments()).basicRemove(
						otherEnd, msgs);
				case UMLPackage.EXPRESSION__CLIENT_DEPENDENCY :
					return ((InternalEList) getClientDependencies())
						.basicRemove(otherEnd, msgs);
				case UMLPackage.EXPRESSION__NAME_EXPRESSION :
					return basicSetNameExpression(null, msgs);
				case UMLPackage.EXPRESSION__TEMPLATE_PARAMETER :
					return basicSetTemplateParameter(null, msgs);
				case UMLPackage.EXPRESSION__OWNING_TEMPLATE_PARAMETER :
					return eBasicSetContainer(null,
						UMLPackage.EXPRESSION__OWNING_TEMPLATE_PARAMETER, msgs);
				case UMLPackage.EXPRESSION__OPERAND :
					return ((InternalEList) getOperands()).basicRemove(
						otherEnd, msgs);
				default :
					return eDynamicInverseRemove(otherEnd, featureID,
						baseClass, msgs);
			}
		}
		return eBasicSetContainer(null, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(EStructuralFeature eFeature, boolean resolve) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case UMLPackage.EXPRESSION__EANNOTATIONS :
				return getEAnnotations();
			case UMLPackage.EXPRESSION__OWNED_ELEMENT :
				return getOwnedElements();
			case UMLPackage.EXPRESSION__OWNER :
				return getOwner();
			case UMLPackage.EXPRESSION__OWNED_COMMENT :
				return getOwnedComments();
			case UMLPackage.EXPRESSION__NAME :
				return getName();
			case UMLPackage.EXPRESSION__VISIBILITY :
				return getVisibility();
			case UMLPackage.EXPRESSION__QUALIFIED_NAME :
				return getQualifiedName();
			case UMLPackage.EXPRESSION__CLIENT_DEPENDENCY :
				return getClientDependencies();
			case UMLPackage.EXPRESSION__NAMESPACE :
				if (resolve)
					return getNamespace();
				return basicGetNamespace();
			case UMLPackage.EXPRESSION__NAME_EXPRESSION :
				return getNameExpression();
			case UMLPackage.EXPRESSION__TEMPLATE_PARAMETER :
				if (resolve)
					return getTemplateParameter();
				return basicGetTemplateParameter();
			case UMLPackage.EXPRESSION__OWNING_TEMPLATE_PARAMETER :
				if (resolve)
					return getOwningTemplateParameter();
				return basicGetOwningTemplateParameter();
			case UMLPackage.EXPRESSION__TYPE :
				if (resolve)
					return getType();
				return basicGetType();
			case UMLPackage.EXPRESSION__SYMBOL :
				return getSymbol();
			case UMLPackage.EXPRESSION__OPERAND :
				return getOperands();
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
			case UMLPackage.EXPRESSION__EANNOTATIONS :
				getEAnnotations().clear();
				getEAnnotations().addAll((Collection) newValue);
				return;
			case UMLPackage.EXPRESSION__OWNED_COMMENT :
				getOwnedComments().clear();
				getOwnedComments().addAll((Collection) newValue);
				return;
			case UMLPackage.EXPRESSION__NAME :
				setName((String) newValue);
				return;
			case UMLPackage.EXPRESSION__VISIBILITY :
				setVisibility((VisibilityKind) newValue);
				return;
			case UMLPackage.EXPRESSION__CLIENT_DEPENDENCY :
				getClientDependencies().clear();
				getClientDependencies().addAll((Collection) newValue);
				return;
			case UMLPackage.EXPRESSION__NAME_EXPRESSION :
				setNameExpression((StringExpression) newValue);
				return;
			case UMLPackage.EXPRESSION__TEMPLATE_PARAMETER :
				setTemplateParameter((TemplateParameter) newValue);
				return;
			case UMLPackage.EXPRESSION__OWNING_TEMPLATE_PARAMETER :
				setOwningTemplateParameter((TemplateParameter) newValue);
				return;
			case UMLPackage.EXPRESSION__TYPE :
				setType((Type) newValue);
				return;
			case UMLPackage.EXPRESSION__SYMBOL :
				setSymbol((String) newValue);
				return;
			case UMLPackage.EXPRESSION__OPERAND :
				getOperands().clear();
				getOperands().addAll((Collection) newValue);
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
			case UMLPackage.EXPRESSION__EANNOTATIONS :
				getEAnnotations().clear();
				return;
			case UMLPackage.EXPRESSION__OWNED_COMMENT :
				getOwnedComments().clear();
				return;
			case UMLPackage.EXPRESSION__NAME :
				setName(NAME_EDEFAULT);
				return;
			case UMLPackage.EXPRESSION__VISIBILITY :
				setVisibility(VISIBILITY_EDEFAULT);
				return;
			case UMLPackage.EXPRESSION__CLIENT_DEPENDENCY :
				getClientDependencies().clear();
				return;
			case UMLPackage.EXPRESSION__NAME_EXPRESSION :
				setNameExpression((StringExpression) null);
				return;
			case UMLPackage.EXPRESSION__TEMPLATE_PARAMETER :
				setTemplateParameter((TemplateParameter) null);
				return;
			case UMLPackage.EXPRESSION__OWNING_TEMPLATE_PARAMETER :
				setOwningTemplateParameter((TemplateParameter) null);
				return;
			case UMLPackage.EXPRESSION__TYPE :
				setType((Type) null);
				return;
			case UMLPackage.EXPRESSION__SYMBOL :
				setSymbol(SYMBOL_EDEFAULT);
				return;
			case UMLPackage.EXPRESSION__OPERAND :
				getOperands().clear();
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
			case UMLPackage.EXPRESSION__EANNOTATIONS :
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UMLPackage.EXPRESSION__OWNED_ELEMENT :
				return isSetOwnedElements();
			case UMLPackage.EXPRESSION__OWNER :
				return isSetOwner();
			case UMLPackage.EXPRESSION__OWNED_COMMENT :
				List ownedComment = (List) eVirtualGet(UMLPackage.EXPRESSION__OWNED_COMMENT);
				return ownedComment != null && !ownedComment.isEmpty();
			case UMLPackage.EXPRESSION__NAME :
				String name = (String) eVirtualGet(UMLPackage.EXPRESSION__NAME,
					NAME_EDEFAULT);
				return NAME_EDEFAULT == null
					? name != null
					: !NAME_EDEFAULT.equals(name);
			case UMLPackage.EXPRESSION__VISIBILITY :
				return isSetVisibility();
			case UMLPackage.EXPRESSION__QUALIFIED_NAME :
				return QUALIFIED_NAME_EDEFAULT == null
					? getQualifiedName() != null
					: !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case UMLPackage.EXPRESSION__CLIENT_DEPENDENCY :
				List clientDependency = (List) eVirtualGet(UMLPackage.EXPRESSION__CLIENT_DEPENDENCY);
				return clientDependency != null && !clientDependency.isEmpty();
			case UMLPackage.EXPRESSION__NAMESPACE :
				return isSetNamespace();
			case UMLPackage.EXPRESSION__NAME_EXPRESSION :
				return eVirtualGet(UMLPackage.EXPRESSION__NAME_EXPRESSION) != null;
			case UMLPackage.EXPRESSION__TEMPLATE_PARAMETER :
				return eVirtualGet(UMLPackage.EXPRESSION__TEMPLATE_PARAMETER) != null;
			case UMLPackage.EXPRESSION__OWNING_TEMPLATE_PARAMETER :
				return basicGetOwningTemplateParameter() != null;
			case UMLPackage.EXPRESSION__TYPE :
				return eVirtualGet(UMLPackage.EXPRESSION__TYPE) != null;
			case UMLPackage.EXPRESSION__SYMBOL :
				String symbol = (String) eVirtualGet(
					UMLPackage.EXPRESSION__SYMBOL, SYMBOL_EDEFAULT);
				return SYMBOL_EDEFAULT == null
					? symbol != null
					: !SYMBOL_EDEFAULT.equals(symbol);
			case UMLPackage.EXPRESSION__OPERAND :
				List operand = (List) eVirtualGet(UMLPackage.EXPRESSION__OPERAND);
				return operand != null && !operand.isEmpty();
		}
		return eDynamicIsSet(eFeature);
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
		result.append(" (symbol: "); //$NON-NLS-1$
		result.append(eVirtualGet(UMLPackage.EXPRESSION__SYMBOL,
			SYMBOL_EDEFAULT));
		result.append(')');
		return result.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOwnedElements() {
		return super.isSetOwnedElements()
			|| eIsSet(UMLPackage.eINSTANCE.getExpression_Operand());
	}

} //ExpressionImpl
