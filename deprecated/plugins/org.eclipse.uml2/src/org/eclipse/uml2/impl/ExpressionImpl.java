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
 * $Id: ExpressionImpl.java,v 1.22 2006/05/26 18:16:43 khussey Exp $
 */
package org.eclipse.uml2.impl;

import java.util.Collection;
import java.util.Iterator;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.uml2.Behavior;
import org.eclipse.uml2.Element;
import org.eclipse.uml2.Expression;
import org.eclipse.uml2.StringExpression;
import org.eclipse.uml2.TemplateParameter;
import org.eclipse.uml2.TemplateSignature;
import org.eclipse.uml2.Type;
import org.eclipse.uml2.UML2Package;
import org.eclipse.uml2.ValueSpecification;
import org.eclipse.uml2.VisibilityKind;

import org.eclipse.uml2.common.util.CacheAdapter;
import org.eclipse.uml2.common.util.DerivedUnionEObjectEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2.impl.ExpressionImpl#getOwnedElements <em>Owned Element</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.ExpressionImpl#getSymbol <em>Symbol</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.ExpressionImpl#getOperands <em>Operand</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExpressionImpl extends OpaqueExpressionImpl implements Expression {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) IBM Corporation and others."; //$NON-NLS-1$

	/**
	 * The default value of the '{@link #getSymbol() <em>Symbol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSymbol()
	 * @generated
	 * @ordered
	 */
	protected static final String SYMBOL_EDEFAULT = ""; //$NON-NLS-1$

	/**
	 * The cached value of the '{@link #getSymbol() <em>Symbol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSymbol()
	 * @generated
	 * @ordered
	 */
	protected String symbol = SYMBOL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOperands() <em>Operand</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperands()
	 * @generated
	 * @ordered
	 */
	protected EList operands = null;

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
		return UML2Package.Literals.EXPRESSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getOwnedElements() {
		CacheAdapter cache = getCacheAdapter();
		if (cache != null) {
			Resource eResource = eResource();
			EList ownedElements = (EList) cache.get(eResource, this, UML2Package.Literals.ELEMENT__OWNED_ELEMENT);
			if (ownedElements == null) {
				cache.put(eResource, this, UML2Package.Literals.ELEMENT__OWNED_ELEMENT, ownedElements = new DerivedUnionEObjectEList(Element.class, this, UML2Package.EXPRESSION__OWNED_ELEMENT, OWNED_ELEMENT_ESUBSETS));
			}
			return ownedElements;
		}
		return new DerivedUnionEObjectEList(Element.class, this, UML2Package.EXPRESSION__OWNED_ELEMENT, OWNED_ELEMENT_ESUBSETS);
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOwnedElements() {
		return super.isSetOwnedElements()
			|| eIsSet(UML2Package.EXPRESSION__OPERAND);
	}

	/**
	 * The array of subset feature identifiers for the '{@link #getOwnedElements() <em>Owned Element</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedElements()
	 * @generated
	 * @ordered
	 */
	protected static final int[] OWNED_ELEMENT_ESUBSETS = new int[] {UML2Package.EXPRESSION__OWNED_COMMENT, UML2Package.EXPRESSION__TEMPLATE_BINDING, UML2Package.EXPRESSION__OWNED_TEMPLATE_SIGNATURE, UML2Package.EXPRESSION__NAME_EXPRESSION, UML2Package.EXPRESSION__OPERAND};

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSymbol() {
		return symbol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSymbol(String newSymbol) {
		newSymbol = newSymbol == null ? SYMBOL_EDEFAULT : newSymbol;
		String oldSymbol = symbol;
		symbol = newSymbol;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2Package.EXPRESSION__SYMBOL, oldSymbol, symbol));


	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getOperands() {
		if (operands == null) {
			operands = new EObjectContainmentEList(ValueSpecification.class, this, UML2Package.EXPRESSION__OPERAND);
		}
		return operands;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
    public ValueSpecification getOperand(String name) {
		return getOperand(name, false, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueSpecification getOperand(String name, boolean ignoreCase, EClass eClass) {
		operandLoop: for (Iterator i = getOperands().iterator(); i.hasNext(); ) {
			ValueSpecification operand = (ValueSpecification) i.next();
			if (eClass != null && !eClass.isInstance(operand))
				continue operandLoop;
			if (name != null && !(ignoreCase ? name.equalsIgnoreCase(operand.getName()) : name.equals(operand.getName())))
				continue operandLoop;
			return operand;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UML2Package.EXPRESSION__EANNOTATIONS:
				return ((InternalEList)getEAnnotations()).basicRemove(otherEnd, msgs);
			case UML2Package.EXPRESSION__OWNED_COMMENT:
				return ((InternalEList)getOwnedComments()).basicRemove(otherEnd, msgs);
			case UML2Package.EXPRESSION__TEMPLATE_BINDING:
				return ((InternalEList)getTemplateBindings()).basicRemove(otherEnd, msgs);
			case UML2Package.EXPRESSION__OWNED_TEMPLATE_SIGNATURE:
				return basicSetOwnedTemplateSignature(null, msgs);
			case UML2Package.EXPRESSION__CLIENT_DEPENDENCY:
				return ((InternalEList)getClientDependencies()).basicRemove(otherEnd, msgs);
			case UML2Package.EXPRESSION__NAME_EXPRESSION:
				return basicSetNameExpression(null, msgs);
			case UML2Package.EXPRESSION__TEMPLATE_PARAMETER:
				return basicSetTemplateParameter(null, msgs);
			case UML2Package.EXPRESSION__OWNING_PARAMETER:
				return basicSetOwningParameter(null, msgs);
			case UML2Package.EXPRESSION__OPERAND:
				return ((InternalEList)getOperands()).basicRemove(otherEnd, msgs);
		}
		return eDynamicInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public ValueSpecification createOperand(EClass eClass) {
		ValueSpecification newOperand = (ValueSpecification) eClass.getEPackage().getEFactoryInstance().create(eClass);
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, 0, UML2Package.EXPRESSION__OPERAND, null, newOperand));
		}
		getOperands().add(newOperand);
		return newOperand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UML2Package.EXPRESSION__EANNOTATIONS:
				return getEAnnotations();
			case UML2Package.EXPRESSION__OWNED_ELEMENT:
				return getOwnedElements();
			case UML2Package.EXPRESSION__OWNER:
				if (resolve) return getOwner();
				return basicGetOwner();
			case UML2Package.EXPRESSION__OWNED_COMMENT:
				return getOwnedComments();
			case UML2Package.EXPRESSION__TEMPLATE_BINDING:
				return getTemplateBindings();
			case UML2Package.EXPRESSION__OWNED_TEMPLATE_SIGNATURE:
				return getOwnedTemplateSignature();
			case UML2Package.EXPRESSION__NAME:
				return getName();
			case UML2Package.EXPRESSION__QUALIFIED_NAME:
				return getQualifiedName();
			case UML2Package.EXPRESSION__VISIBILITY:
				return getVisibility();
			case UML2Package.EXPRESSION__CLIENT_DEPENDENCY:
				return getClientDependencies();
			case UML2Package.EXPRESSION__NAME_EXPRESSION:
				return getNameExpression();
			case UML2Package.EXPRESSION__TYPE:
				if (resolve) return getType();
				return basicGetType();
			case UML2Package.EXPRESSION__TEMPLATE_PARAMETER:
				if (resolve) return getTemplateParameter();
				return basicGetTemplateParameter();
			case UML2Package.EXPRESSION__OWNING_PARAMETER:
				return getOwningParameter();
			case UML2Package.EXPRESSION__BODY:
				return getBody();
			case UML2Package.EXPRESSION__LANGUAGE:
				return getLanguage();
			case UML2Package.EXPRESSION__RESULT:
				if (resolve) return getResult();
				return basicGetResult();
			case UML2Package.EXPRESSION__BEHAVIOR:
				if (resolve) return getBehavior();
				return basicGetBehavior();
			case UML2Package.EXPRESSION__SYMBOL:
				return getSymbol();
			case UML2Package.EXPRESSION__OPERAND:
				return getOperands();
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
			case UML2Package.EXPRESSION__EANNOTATIONS:
				getEAnnotations().clear();
				getEAnnotations().addAll((Collection)newValue);
				return;
			case UML2Package.EXPRESSION__OWNED_COMMENT:
				getOwnedComments().clear();
				getOwnedComments().addAll((Collection)newValue);
				return;
			case UML2Package.EXPRESSION__TEMPLATE_BINDING:
				getTemplateBindings().clear();
				getTemplateBindings().addAll((Collection)newValue);
				return;
			case UML2Package.EXPRESSION__OWNED_TEMPLATE_SIGNATURE:
				setOwnedTemplateSignature((TemplateSignature)newValue);
				return;
			case UML2Package.EXPRESSION__NAME:
				setName((String)newValue);
				return;
			case UML2Package.EXPRESSION__VISIBILITY:
				setVisibility((VisibilityKind)newValue);
				return;
			case UML2Package.EXPRESSION__CLIENT_DEPENDENCY:
				getClientDependencies().clear();
				getClientDependencies().addAll((Collection)newValue);
				return;
			case UML2Package.EXPRESSION__NAME_EXPRESSION:
				setNameExpression((StringExpression)newValue);
				return;
			case UML2Package.EXPRESSION__TYPE:
				setType((Type)newValue);
				return;
			case UML2Package.EXPRESSION__TEMPLATE_PARAMETER:
				setTemplateParameter((TemplateParameter)newValue);
				return;
			case UML2Package.EXPRESSION__OWNING_PARAMETER:
				setOwningParameter((TemplateParameter)newValue);
				return;
			case UML2Package.EXPRESSION__BODY:
				setBody((String)newValue);
				return;
			case UML2Package.EXPRESSION__LANGUAGE:
				setLanguage((String)newValue);
				return;
			case UML2Package.EXPRESSION__BEHAVIOR:
				setBehavior((Behavior)newValue);
				return;
			case UML2Package.EXPRESSION__SYMBOL:
				setSymbol((String)newValue);
				return;
			case UML2Package.EXPRESSION__OPERAND:
				getOperands().clear();
				getOperands().addAll((Collection)newValue);
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
			case UML2Package.EXPRESSION__EANNOTATIONS:
				getEAnnotations().clear();
				return;
			case UML2Package.EXPRESSION__OWNED_COMMENT:
				getOwnedComments().clear();
				return;
			case UML2Package.EXPRESSION__TEMPLATE_BINDING:
				getTemplateBindings().clear();
				return;
			case UML2Package.EXPRESSION__OWNED_TEMPLATE_SIGNATURE:
				setOwnedTemplateSignature((TemplateSignature)null);
				return;
			case UML2Package.EXPRESSION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case UML2Package.EXPRESSION__VISIBILITY:
				setVisibility(VISIBILITY_EDEFAULT);
				return;
			case UML2Package.EXPRESSION__CLIENT_DEPENDENCY:
				getClientDependencies().clear();
				return;
			case UML2Package.EXPRESSION__NAME_EXPRESSION:
				setNameExpression((StringExpression)null);
				return;
			case UML2Package.EXPRESSION__TYPE:
				setType((Type)null);
				return;
			case UML2Package.EXPRESSION__TEMPLATE_PARAMETER:
				setTemplateParameter((TemplateParameter)null);
				return;
			case UML2Package.EXPRESSION__OWNING_PARAMETER:
				setOwningParameter((TemplateParameter)null);
				return;
			case UML2Package.EXPRESSION__BODY:
				setBody(BODY_EDEFAULT);
				return;
			case UML2Package.EXPRESSION__LANGUAGE:
				setLanguage(LANGUAGE_EDEFAULT);
				return;
			case UML2Package.EXPRESSION__BEHAVIOR:
				setBehavior((Behavior)null);
				return;
			case UML2Package.EXPRESSION__SYMBOL:
				setSymbol(SYMBOL_EDEFAULT);
				return;
			case UML2Package.EXPRESSION__OPERAND:
				getOperands().clear();
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
			case UML2Package.EXPRESSION__EANNOTATIONS:
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UML2Package.EXPRESSION__OWNED_ELEMENT:
				return isSetOwnedElements();
			case UML2Package.EXPRESSION__OWNER:
				return isSetOwner();
			case UML2Package.EXPRESSION__OWNED_COMMENT:
				return ownedComments != null && !ownedComments.isEmpty();
			case UML2Package.EXPRESSION__TEMPLATE_BINDING:
				return templateBindings != null && !templateBindings.isEmpty();
			case UML2Package.EXPRESSION__OWNED_TEMPLATE_SIGNATURE:
				return ownedTemplateSignature != null;
			case UML2Package.EXPRESSION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case UML2Package.EXPRESSION__QUALIFIED_NAME:
				return QUALIFIED_NAME_EDEFAULT == null ? getQualifiedName() != null : !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case UML2Package.EXPRESSION__VISIBILITY:
				return visibility != VISIBILITY_EDEFAULT;
			case UML2Package.EXPRESSION__CLIENT_DEPENDENCY:
				return clientDependencies != null && !clientDependencies.isEmpty();
			case UML2Package.EXPRESSION__NAME_EXPRESSION:
				return nameExpression != null;
			case UML2Package.EXPRESSION__TYPE:
				return type != null;
			case UML2Package.EXPRESSION__TEMPLATE_PARAMETER:
				return templateParameter != null;
			case UML2Package.EXPRESSION__OWNING_PARAMETER:
				return getOwningParameter() != null;
			case UML2Package.EXPRESSION__BODY:
				return BODY_EDEFAULT == null ? body != null : !BODY_EDEFAULT.equals(body);
			case UML2Package.EXPRESSION__LANGUAGE:
				return LANGUAGE_EDEFAULT == null ? language != null : !LANGUAGE_EDEFAULT.equals(language);
			case UML2Package.EXPRESSION__RESULT:
				return basicGetResult() != null;
			case UML2Package.EXPRESSION__BEHAVIOR:
				return behavior != null;
			case UML2Package.EXPRESSION__SYMBOL:
				return SYMBOL_EDEFAULT == null ? symbol != null : !SYMBOL_EDEFAULT.equals(symbol);
			case UML2Package.EXPRESSION__OPERAND:
				return operands != null && !operands.isEmpty();
		}
		return eDynamicIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (symbol: "); //$NON-NLS-1$
		result.append(symbol);
		result.append(')');
		return result.toString();
	}


} //ExpressionImpl
