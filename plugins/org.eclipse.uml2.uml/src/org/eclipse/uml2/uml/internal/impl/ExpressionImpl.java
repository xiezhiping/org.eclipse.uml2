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
 *   Kenn Hussey (CEA) - 327039, 418466, 451350, 485756
 *
 */
package org.eclipse.uml2.uml.internal.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.uml2.common.util.CacheAdapter;
import org.eclipse.uml2.common.util.DerivedUnionEObjectEList;

import org.eclipse.uml2.uml.Comment;
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
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ExpressionImpl#getOwnedElements <em>Owned Element</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ExpressionImpl#getOperands <em>Operand</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ExpressionImpl#getSymbol <em>Symbol</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExpressionImpl
		extends ValueSpecificationImpl
		implements Expression {

	/**
	 * The cached value of the '{@link #getOperands() <em>Operand</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperands()
	 * @generated
	 * @ordered
	 */
	protected EList<ValueSpecification> operands;

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
	 * The cached value of the '{@link #getSymbol() <em>Symbol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSymbol()
	 * @generated
	 * @ordered
	 */
	protected String symbol = SYMBOL_EDEFAULT;

	/**
	 * The flag representing whether the Symbol attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected static final int SYMBOL_ESETFLAG = 1 << 12;

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
	@Override
	protected EClass eStaticClass() {
		return UMLPackage.Literals.EXPRESSION;
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
						UMLPackage.EXPRESSION__OWNED_ELEMENT,
						OWNED_ELEMENT_ESUBSETS));
			}
			return ownedElements;
		}
		return new DerivedUnionEObjectEList<Element>(Element.class, this,
			UMLPackage.EXPRESSION__OWNED_ELEMENT, OWNED_ELEMENT_ESUBSETS);
	}

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
		String oldSymbol = symbol;
		symbol = newSymbol;
		boolean oldSymbolESet = (eFlags & SYMBOL_ESETFLAG) != 0;
		eFlags |= SYMBOL_ESETFLAG;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.EXPRESSION__SYMBOL, oldSymbol, symbol,
				!oldSymbolESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSymbol() {
		String oldSymbol = symbol;
		boolean oldSymbolESet = (eFlags & SYMBOL_ESETFLAG) != 0;
		symbol = SYMBOL_EDEFAULT;
		eFlags &= ~SYMBOL_ESETFLAG;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET,
				UMLPackage.EXPRESSION__SYMBOL, oldSymbol, SYMBOL_EDEFAULT,
				oldSymbolESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSymbol() {
		return (eFlags & SYMBOL_ESETFLAG) != 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ValueSpecification> getOperands() {
		if (operands == null) {
			operands = new EObjectContainmentEList.Resolving<ValueSpecification>(
				ValueSpecification.class, this, UMLPackage.EXPRESSION__OPERAND);
		}
		return operands;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueSpecification createOperand(String name, Type type,
			EClass eClass) {
		ValueSpecification newOperand = (ValueSpecification) create(eClass);
		getOperands().add(newOperand);
		if (name != null)
			newOperand.setName(name);
		if (type != null)
			newOperand.setType(type);
		return newOperand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueSpecification getOperand(String name, Type type) {
		return getOperand(name, type, false, null, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueSpecification getOperand(String name, Type type,
			boolean ignoreCase, EClass eClass, boolean createOnDemand) {
		operandLoop : for (ValueSpecification operand : getOperands()) {
			if (eClass != null && !eClass.isInstance(operand))
				continue operandLoop;
			if (name != null && !(ignoreCase
				? name.equalsIgnoreCase(operand.getName())
				: name.equals(operand.getName())))
				continue operandLoop;
			if (type != null && !type.equals(operand.getType()))
				continue operandLoop;
			return operand;
		}
		return createOnDemand && eClass != null
			? createOperand(name, type, eClass)
			: null;
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
			case UMLPackage.EXPRESSION__EANNOTATIONS :
				return ((InternalEList<?>) getEAnnotations())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.EXPRESSION__OWNED_COMMENT :
				return ((InternalEList<?>) getOwnedComments())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.EXPRESSION__NAME_EXPRESSION :
				return basicSetNameExpression(null, msgs);
			case UMLPackage.EXPRESSION__OWNING_TEMPLATE_PARAMETER :
				return basicSetOwningTemplateParameter(null, msgs);
			case UMLPackage.EXPRESSION__TEMPLATE_PARAMETER :
				return basicSetTemplateParameter(null, msgs);
			case UMLPackage.EXPRESSION__OPERAND :
				return ((InternalEList<?>) getOperands()).basicRemove(otherEnd,
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
			case UMLPackage.EXPRESSION__EANNOTATIONS :
				return getEAnnotations();
			case UMLPackage.EXPRESSION__OWNED_COMMENT :
				return getOwnedComments();
			case UMLPackage.EXPRESSION__OWNED_ELEMENT :
				return getOwnedElements();
			case UMLPackage.EXPRESSION__OWNER :
				if (resolve)
					return getOwner();
				return basicGetOwner();
			case UMLPackage.EXPRESSION__CLIENT_DEPENDENCY :
				return getClientDependencies();
			case UMLPackage.EXPRESSION__NAME :
				return getName();
			case UMLPackage.EXPRESSION__NAME_EXPRESSION :
				if (resolve)
					return getNameExpression();
				return basicGetNameExpression();
			case UMLPackage.EXPRESSION__NAMESPACE :
				if (resolve)
					return getNamespace();
				return basicGetNamespace();
			case UMLPackage.EXPRESSION__QUALIFIED_NAME :
				return getQualifiedName();
			case UMLPackage.EXPRESSION__VISIBILITY :
				return getVisibility();
			case UMLPackage.EXPRESSION__OWNING_TEMPLATE_PARAMETER :
				if (resolve)
					return getOwningTemplateParameter();
				return basicGetOwningTemplateParameter();
			case UMLPackage.EXPRESSION__TEMPLATE_PARAMETER :
				if (resolve)
					return getTemplateParameter();
				return basicGetTemplateParameter();
			case UMLPackage.EXPRESSION__TYPE :
				if (resolve)
					return getType();
				return basicGetType();
			case UMLPackage.EXPRESSION__OPERAND :
				return getOperands();
			case UMLPackage.EXPRESSION__SYMBOL :
				return getSymbol();
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
			case UMLPackage.EXPRESSION__EANNOTATIONS :
				getEAnnotations().clear();
				getEAnnotations()
					.addAll((Collection<? extends EAnnotation>) newValue);
				return;
			case UMLPackage.EXPRESSION__OWNED_COMMENT :
				getOwnedComments().clear();
				getOwnedComments()
					.addAll((Collection<? extends Comment>) newValue);
				return;
			case UMLPackage.EXPRESSION__NAME :
				setName((String) newValue);
				return;
			case UMLPackage.EXPRESSION__NAME_EXPRESSION :
				setNameExpression((StringExpression) newValue);
				return;
			case UMLPackage.EXPRESSION__VISIBILITY :
				setVisibility((VisibilityKind) newValue);
				return;
			case UMLPackage.EXPRESSION__OWNING_TEMPLATE_PARAMETER :
				setOwningTemplateParameter((TemplateParameter) newValue);
				return;
			case UMLPackage.EXPRESSION__TEMPLATE_PARAMETER :
				setTemplateParameter((TemplateParameter) newValue);
				return;
			case UMLPackage.EXPRESSION__TYPE :
				setType((Type) newValue);
				return;
			case UMLPackage.EXPRESSION__OPERAND :
				getOperands().clear();
				getOperands().addAll(
					(Collection<? extends ValueSpecification>) newValue);
				return;
			case UMLPackage.EXPRESSION__SYMBOL :
				setSymbol((String) newValue);
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
			case UMLPackage.EXPRESSION__EANNOTATIONS :
				getEAnnotations().clear();
				return;
			case UMLPackage.EXPRESSION__OWNED_COMMENT :
				getOwnedComments().clear();
				return;
			case UMLPackage.EXPRESSION__NAME :
				unsetName();
				return;
			case UMLPackage.EXPRESSION__NAME_EXPRESSION :
				setNameExpression((StringExpression) null);
				return;
			case UMLPackage.EXPRESSION__VISIBILITY :
				unsetVisibility();
				return;
			case UMLPackage.EXPRESSION__OWNING_TEMPLATE_PARAMETER :
				setOwningTemplateParameter((TemplateParameter) null);
				return;
			case UMLPackage.EXPRESSION__TEMPLATE_PARAMETER :
				setTemplateParameter((TemplateParameter) null);
				return;
			case UMLPackage.EXPRESSION__TYPE :
				setType((Type) null);
				return;
			case UMLPackage.EXPRESSION__OPERAND :
				getOperands().clear();
				return;
			case UMLPackage.EXPRESSION__SYMBOL :
				unsetSymbol();
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
			case UMLPackage.EXPRESSION__EANNOTATIONS :
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UMLPackage.EXPRESSION__OWNED_COMMENT :
				return ownedComments != null && !ownedComments.isEmpty();
			case UMLPackage.EXPRESSION__OWNED_ELEMENT :
				return isSetOwnedElements();
			case UMLPackage.EXPRESSION__OWNER :
				return isSetOwner();
			case UMLPackage.EXPRESSION__CLIENT_DEPENDENCY :
				return !getClientDependencies().isEmpty();
			case UMLPackage.EXPRESSION__NAME :
				return isSetName();
			case UMLPackage.EXPRESSION__NAME_EXPRESSION :
				return nameExpression != null;
			case UMLPackage.EXPRESSION__NAMESPACE :
				return isSetNamespace();
			case UMLPackage.EXPRESSION__QUALIFIED_NAME :
				return QUALIFIED_NAME_EDEFAULT == null
					? getQualifiedName() != null
					: !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case UMLPackage.EXPRESSION__VISIBILITY :
				return isSetVisibility();
			case UMLPackage.EXPRESSION__OWNING_TEMPLATE_PARAMETER :
				return basicGetOwningTemplateParameter() != null;
			case UMLPackage.EXPRESSION__TEMPLATE_PARAMETER :
				return templateParameter != null;
			case UMLPackage.EXPRESSION__TYPE :
				return type != null;
			case UMLPackage.EXPRESSION__OPERAND :
				return operands != null && !operands.isEmpty();
			case UMLPackage.EXPRESSION__SYMBOL :
				return isSetSymbol();
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
		result.append(" (symbol: "); //$NON-NLS-1$
		if ((eFlags & SYMBOL_ESETFLAG) != 0)
			result.append(symbol);
		else
			result.append("<unset>"); //$NON-NLS-1$
		result.append(')');
		return result.toString();
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
		UMLPackage.EXPRESSION__OWNED_COMMENT,
		UMLPackage.EXPRESSION__NAME_EXPRESSION, UMLPackage.EXPRESSION__OPERAND};

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetOwnedElements() {
		return super.isSetOwnedElements()
			|| eIsSet(UMLPackage.EXPRESSION__OPERAND);
	}

} //ExpressionImpl
