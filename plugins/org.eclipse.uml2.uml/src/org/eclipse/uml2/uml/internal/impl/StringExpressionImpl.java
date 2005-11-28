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
 * $Id: StringExpressionImpl.java,v 1.5 2005/11/28 20:26:02 khussey Exp $
 */
package org.eclipse.uml2.uml.internal.impl;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.uml2.common.util.CacheAdapter;
import org.eclipse.uml2.common.util.DerivedUnionEObjectEList;

import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.StringExpression;
import org.eclipse.uml2.uml.TemplateBinding;
import org.eclipse.uml2.uml.TemplateParameter;
import org.eclipse.uml2.uml.TemplateSignature;
import org.eclipse.uml2.uml.TemplateableElement;
import org.eclipse.uml2.uml.Type;
import org.eclipse.uml2.uml.UMLFactory;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.VisibilityKind;

import org.eclipse.uml2.uml.internal.operations.StringExpressionOperations;
import org.eclipse.uml2.uml.internal.operations.TemplateableElementOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>String Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.StringExpressionImpl#getOwnedElements <em>Owned Element</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.StringExpressionImpl#getTemplateBindings <em>Template Binding</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.StringExpressionImpl#getOwnedTemplateSignature <em>Owned Template Signature</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.StringExpressionImpl#getSubExpressions <em>Sub Expression</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.StringExpressionImpl#getOwningExpression <em>Owning Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StringExpressionImpl
		extends ExpressionImpl
		implements StringExpression {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StringExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return UMLPackage.Literals.STRING_EXPRESSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List getOwnedElements() {
		List ownedElement = (List) eVirtualGet(UMLPackage.STRING_EXPRESSION__OWNED_ELEMENT);
		if (ownedElement == null) {
			eVirtualSet(UMLPackage.STRING_EXPRESSION__OWNED_ELEMENT,
				ownedElement = new DerivedUnionEObjectEList(Element.class,
					this, UMLPackage.STRING_EXPRESSION__OWNED_ELEMENT,
					new int[]{UMLPackage.STRING_EXPRESSION__OWNED_COMMENT,
						UMLPackage.STRING_EXPRESSION__NAME_EXPRESSION,
						UMLPackage.STRING_EXPRESSION__OPERAND,
						UMLPackage.STRING_EXPRESSION__TEMPLATE_BINDING,
						UMLPackage.STRING_EXPRESSION__OWNED_TEMPLATE_SIGNATURE,
						UMLPackage.STRING_EXPRESSION__SUB_EXPRESSION}));
		}
		return ownedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List getTemplateBindings() {
		List templateBinding = (List) eVirtualGet(UMLPackage.STRING_EXPRESSION__TEMPLATE_BINDING);
		if (templateBinding == null) {
			eVirtualSet(UMLPackage.STRING_EXPRESSION__TEMPLATE_BINDING,
				templateBinding = new EObjectContainmentWithInverseEList(
					TemplateBinding.class, this,
					UMLPackage.STRING_EXPRESSION__TEMPLATE_BINDING,
					UMLPackage.TEMPLATE_BINDING__BOUND_ELEMENT));
		}
		return templateBinding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemplateBinding createTemplateBinding() {
		TemplateBinding newTemplateBinding = UMLFactory.eINSTANCE
			.createTemplateBinding();
		getTemplateBindings().add(newTemplateBinding);
		return newTemplateBinding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemplateSignature getOwnedTemplateSignature() {
		return (TemplateSignature) eVirtualGet(UMLPackage.STRING_EXPRESSION__OWNED_TEMPLATE_SIGNATURE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnedTemplateSignature(
			TemplateSignature newOwnedTemplateSignature, NotificationChain msgs) {
		Object oldOwnedTemplateSignature = eVirtualSet(
			UMLPackage.STRING_EXPRESSION__OWNED_TEMPLATE_SIGNATURE,
			newOwnedTemplateSignature);
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
				Notification.SET,
				UMLPackage.STRING_EXPRESSION__OWNED_TEMPLATE_SIGNATURE,
				oldOwnedTemplateSignature == EVIRTUAL_NO_VALUE
					? null
					: oldOwnedTemplateSignature, newOwnedTemplateSignature);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}

		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwnedTemplateSignature(
			TemplateSignature newOwnedTemplateSignature) {
		TemplateSignature ownedTemplateSignature = (TemplateSignature) eVirtualGet(UMLPackage.STRING_EXPRESSION__OWNED_TEMPLATE_SIGNATURE);
		if (newOwnedTemplateSignature != ownedTemplateSignature) {
			NotificationChain msgs = null;
			if (ownedTemplateSignature != null)
				msgs = ((InternalEObject) ownedTemplateSignature)
					.eInverseRemove(this,
						UMLPackage.TEMPLATE_SIGNATURE__TEMPLATE,
						TemplateSignature.class, msgs);
			if (newOwnedTemplateSignature != null)
				msgs = ((InternalEObject) newOwnedTemplateSignature)
					.eInverseAdd(this, UMLPackage.TEMPLATE_SIGNATURE__TEMPLATE,
						TemplateSignature.class, msgs);
			msgs = basicSetOwnedTemplateSignature(newOwnedTemplateSignature,
				msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.STRING_EXPRESSION__OWNED_TEMPLATE_SIGNATURE,
				newOwnedTemplateSignature, newOwnedTemplateSignature));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemplateSignature createOwnedTemplateSignature(EClass eClass) {
		TemplateSignature newOwnedTemplateSignature = (TemplateSignature) eClass
			.getEPackage().getEFactoryInstance().create(eClass);
		setOwnedTemplateSignature(newOwnedTemplateSignature);
		return newOwnedTemplateSignature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemplateSignature createOwnedTemplateSignature() {
		TemplateSignature newOwnedTemplateSignature = UMLFactory.eINSTANCE
			.createTemplateSignature();
		setOwnedTemplateSignature(newOwnedTemplateSignature);
		return newOwnedTemplateSignature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List getSubExpressions() {
		List subExpression = (List) eVirtualGet(UMLPackage.STRING_EXPRESSION__SUB_EXPRESSION);
		if (subExpression == null) {
			eVirtualSet(UMLPackage.STRING_EXPRESSION__SUB_EXPRESSION,
				subExpression = new EObjectContainmentWithInverseEList(
					StringExpression.class, this,
					UMLPackage.STRING_EXPRESSION__SUB_EXPRESSION,
					UMLPackage.STRING_EXPRESSION__OWNING_EXPRESSION));
		}
		return subExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StringExpression createSubExpression() {
		StringExpression newSubExpression = UMLFactory.eINSTANCE
			.createStringExpression();
		getSubExpressions().add(newSubExpression);
		return newSubExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StringExpression getSubExpression(String name) {
		for (Iterator i = getSubExpressions().iterator(); i.hasNext();) {
			StringExpression subExpression = (StringExpression) i.next();
			if (name.equals(subExpression.getName())) {
				return subExpression;
			}
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StringExpression getOwningExpression() {
		if (eContainerFeatureID != UMLPackage.STRING_EXPRESSION__OWNING_EXPRESSION)
			return null;
		return (StringExpression) eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwningExpression(StringExpression newOwningExpression) {
		if (newOwningExpression != eInternalContainer()
			|| (eContainerFeatureID != UMLPackage.STRING_EXPRESSION__OWNING_EXPRESSION && newOwningExpression != null)) {
			if (EcoreUtil.isAncestor(this, (EObject) newOwningExpression))
				throw new IllegalArgumentException(
					"Recursive containment not allowed for " + toString()); //$NON-NLS-1$
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOwningExpression != null)
				msgs = ((InternalEObject) newOwningExpression).eInverseAdd(
					this, UMLPackage.STRING_EXPRESSION__SUB_EXPRESSION,
					StringExpression.class, msgs);
			msgs = eBasicSetContainer((InternalEObject) newOwningExpression,
				UMLPackage.STRING_EXPRESSION__OWNING_EXPRESSION, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.STRING_EXPRESSION__OWNING_EXPRESSION,
				newOwningExpression, newOwningExpression));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List parameterableElements() {
		CacheAdapter cache = getCacheAdapter();
		if (cache != null) {
			List result = (List) cache.get(eResource(), this,
				UMLPackage.Literals.TEMPLATEABLE_ELEMENT.getEOperations()
					.get(0));
			if (result == null) {
				cache.put(eResource(), this,
					UMLPackage.Literals.TEMPLATEABLE_ELEMENT.getEOperations()
						.get(0), result = TemplateableElementOperations
						.parameterableElements(this));
			}
			return result;
		}
		return TemplateableElementOperations.parameterableElements(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isTemplate() {
		return TemplateableElementOperations.isTemplate(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOperands(DiagnosticChain diagnostics, Map context) {
		return StringExpressionOperations.validateOperands(this, diagnostics,
			context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSubexpressions(DiagnosticChain diagnostics,
			Map context) {
		return StringExpressionOperations.validateSubexpressions(this,
			diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String stringValue() {
		return StringExpressionOperations.stringValue(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UMLPackage.STRING_EXPRESSION__EANNOTATIONS :
				return ((InternalEList) getEAnnotations()).basicAdd(otherEnd,
					msgs);
			case UMLPackage.STRING_EXPRESSION__CLIENT_DEPENDENCY :
				return ((InternalEList) getClientDependencies()).basicAdd(
					otherEnd, msgs);
			case UMLPackage.STRING_EXPRESSION__TEMPLATE_PARAMETER :
				TemplateParameter templateParameter = (TemplateParameter) eVirtualGet(UMLPackage.STRING_EXPRESSION__TEMPLATE_PARAMETER);
				if (templateParameter != null)
					msgs = ((InternalEObject) templateParameter)
						.eInverseRemove(this,
							UMLPackage.TEMPLATE_PARAMETER__PARAMETERED_ELEMENT,
							TemplateParameter.class, msgs);
				return basicSetTemplateParameter((TemplateParameter) otherEnd,
					msgs);
			case UMLPackage.STRING_EXPRESSION__OWNING_TEMPLATE_PARAMETER :
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return eBasicSetContainer(otherEnd,
					UMLPackage.STRING_EXPRESSION__OWNING_TEMPLATE_PARAMETER,
					msgs);
			case UMLPackage.STRING_EXPRESSION__TEMPLATE_BINDING :
				return ((InternalEList) getTemplateBindings()).basicAdd(
					otherEnd, msgs);
			case UMLPackage.STRING_EXPRESSION__OWNED_TEMPLATE_SIGNATURE :
				TemplateSignature ownedTemplateSignature = (TemplateSignature) eVirtualGet(UMLPackage.STRING_EXPRESSION__OWNED_TEMPLATE_SIGNATURE);
				if (ownedTemplateSignature != null)
					msgs = ((InternalEObject) ownedTemplateSignature)
						.eInverseRemove(
							this,
							EOPPOSITE_FEATURE_BASE
								- UMLPackage.STRING_EXPRESSION__OWNED_TEMPLATE_SIGNATURE,
							null, msgs);
				return basicSetOwnedTemplateSignature(
					(TemplateSignature) otherEnd, msgs);
			case UMLPackage.STRING_EXPRESSION__SUB_EXPRESSION :
				return ((InternalEList) getSubExpressions()).basicAdd(otherEnd,
					msgs);
			case UMLPackage.STRING_EXPRESSION__OWNING_EXPRESSION :
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return eBasicSetContainer(otherEnd,
					UMLPackage.STRING_EXPRESSION__OWNING_EXPRESSION, msgs);
		}
		return eDynamicInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UMLPackage.STRING_EXPRESSION__EANNOTATIONS :
				return ((InternalEList) getEAnnotations()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.STRING_EXPRESSION__OWNED_COMMENT :
				return ((InternalEList) getOwnedComments()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.STRING_EXPRESSION__CLIENT_DEPENDENCY :
				return ((InternalEList) getClientDependencies()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.STRING_EXPRESSION__NAME_EXPRESSION :
				return basicSetNameExpression(null, msgs);
			case UMLPackage.STRING_EXPRESSION__TEMPLATE_PARAMETER :
				return basicSetTemplateParameter(null, msgs);
			case UMLPackage.STRING_EXPRESSION__OWNING_TEMPLATE_PARAMETER :
				return eBasicSetContainer(null,
					UMLPackage.STRING_EXPRESSION__OWNING_TEMPLATE_PARAMETER,
					msgs);
			case UMLPackage.STRING_EXPRESSION__OPERAND :
				return ((InternalEList) getOperands()).basicRemove(otherEnd,
					msgs);
			case UMLPackage.STRING_EXPRESSION__TEMPLATE_BINDING :
				return ((InternalEList) getTemplateBindings()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.STRING_EXPRESSION__OWNED_TEMPLATE_SIGNATURE :
				return basicSetOwnedTemplateSignature(null, msgs);
			case UMLPackage.STRING_EXPRESSION__SUB_EXPRESSION :
				return ((InternalEList) getSubExpressions()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.STRING_EXPRESSION__OWNING_EXPRESSION :
				return eBasicSetContainer(null,
					UMLPackage.STRING_EXPRESSION__OWNING_EXPRESSION, msgs);
		}
		return eDynamicInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eBasicRemoveFromContainerFeature(
			NotificationChain msgs) {
		switch (eContainerFeatureID) {
			case UMLPackage.STRING_EXPRESSION__OWNING_TEMPLATE_PARAMETER :
				return eInternalContainer().eInverseRemove(this,
					UMLPackage.TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT,
					TemplateParameter.class, msgs);
			case UMLPackage.STRING_EXPRESSION__OWNING_EXPRESSION :
				return eInternalContainer().eInverseRemove(this,
					UMLPackage.STRING_EXPRESSION__SUB_EXPRESSION,
					StringExpression.class, msgs);
		}
		return eDynamicBasicRemoveFromContainer(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UMLPackage.STRING_EXPRESSION__EANNOTATIONS :
				return getEAnnotations();
			case UMLPackage.STRING_EXPRESSION__OWNED_ELEMENT :
				return getOwnedElements();
			case UMLPackage.STRING_EXPRESSION__OWNER :
				return getOwner();
			case UMLPackage.STRING_EXPRESSION__OWNED_COMMENT :
				return getOwnedComments();
			case UMLPackage.STRING_EXPRESSION__NAME :
				return getName();
			case UMLPackage.STRING_EXPRESSION__VISIBILITY :
				return getVisibility();
			case UMLPackage.STRING_EXPRESSION__QUALIFIED_NAME :
				return getQualifiedName();
			case UMLPackage.STRING_EXPRESSION__CLIENT_DEPENDENCY :
				return getClientDependencies();
			case UMLPackage.STRING_EXPRESSION__NAMESPACE :
				if (resolve)
					return getNamespace();
				return basicGetNamespace();
			case UMLPackage.STRING_EXPRESSION__NAME_EXPRESSION :
				return getNameExpression();
			case UMLPackage.STRING_EXPRESSION__TEMPLATE_PARAMETER :
				if (resolve)
					return getTemplateParameter();
				return basicGetTemplateParameter();
			case UMLPackage.STRING_EXPRESSION__OWNING_TEMPLATE_PARAMETER :
				if (resolve)
					return getOwningTemplateParameter();
				return basicGetOwningTemplateParameter();
			case UMLPackage.STRING_EXPRESSION__TYPE :
				if (resolve)
					return getType();
				return basicGetType();
			case UMLPackage.STRING_EXPRESSION__SYMBOL :
				return getSymbol();
			case UMLPackage.STRING_EXPRESSION__OPERAND :
				return getOperands();
			case UMLPackage.STRING_EXPRESSION__TEMPLATE_BINDING :
				return getTemplateBindings();
			case UMLPackage.STRING_EXPRESSION__OWNED_TEMPLATE_SIGNATURE :
				return getOwnedTemplateSignature();
			case UMLPackage.STRING_EXPRESSION__SUB_EXPRESSION :
				return getSubExpressions();
			case UMLPackage.STRING_EXPRESSION__OWNING_EXPRESSION :
				return getOwningExpression();
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
			case UMLPackage.STRING_EXPRESSION__EANNOTATIONS :
				getEAnnotations().clear();
				getEAnnotations().addAll((Collection) newValue);
				return;
			case UMLPackage.STRING_EXPRESSION__OWNED_COMMENT :
				getOwnedComments().clear();
				getOwnedComments().addAll((Collection) newValue);
				return;
			case UMLPackage.STRING_EXPRESSION__NAME :
				setName((String) newValue);
				return;
			case UMLPackage.STRING_EXPRESSION__VISIBILITY :
				setVisibility((VisibilityKind) newValue);
				return;
			case UMLPackage.STRING_EXPRESSION__CLIENT_DEPENDENCY :
				getClientDependencies().clear();
				getClientDependencies().addAll((Collection) newValue);
				return;
			case UMLPackage.STRING_EXPRESSION__NAME_EXPRESSION :
				setNameExpression((StringExpression) newValue);
				return;
			case UMLPackage.STRING_EXPRESSION__TEMPLATE_PARAMETER :
				setTemplateParameter((TemplateParameter) newValue);
				return;
			case UMLPackage.STRING_EXPRESSION__OWNING_TEMPLATE_PARAMETER :
				setOwningTemplateParameter((TemplateParameter) newValue);
				return;
			case UMLPackage.STRING_EXPRESSION__TYPE :
				setType((Type) newValue);
				return;
			case UMLPackage.STRING_EXPRESSION__SYMBOL :
				setSymbol((String) newValue);
				return;
			case UMLPackage.STRING_EXPRESSION__OPERAND :
				getOperands().clear();
				getOperands().addAll((Collection) newValue);
				return;
			case UMLPackage.STRING_EXPRESSION__TEMPLATE_BINDING :
				getTemplateBindings().clear();
				getTemplateBindings().addAll((Collection) newValue);
				return;
			case UMLPackage.STRING_EXPRESSION__OWNED_TEMPLATE_SIGNATURE :
				setOwnedTemplateSignature((TemplateSignature) newValue);
				return;
			case UMLPackage.STRING_EXPRESSION__SUB_EXPRESSION :
				getSubExpressions().clear();
				getSubExpressions().addAll((Collection) newValue);
				return;
			case UMLPackage.STRING_EXPRESSION__OWNING_EXPRESSION :
				setOwningExpression((StringExpression) newValue);
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
			case UMLPackage.STRING_EXPRESSION__EANNOTATIONS :
				getEAnnotations().clear();
				return;
			case UMLPackage.STRING_EXPRESSION__OWNED_COMMENT :
				getOwnedComments().clear();
				return;
			case UMLPackage.STRING_EXPRESSION__NAME :
				setName(NAME_EDEFAULT);
				return;
			case UMLPackage.STRING_EXPRESSION__VISIBILITY :
				setVisibility(VISIBILITY_EDEFAULT);
				return;
			case UMLPackage.STRING_EXPRESSION__CLIENT_DEPENDENCY :
				getClientDependencies().clear();
				return;
			case UMLPackage.STRING_EXPRESSION__NAME_EXPRESSION :
				setNameExpression((StringExpression) null);
				return;
			case UMLPackage.STRING_EXPRESSION__TEMPLATE_PARAMETER :
				setTemplateParameter((TemplateParameter) null);
				return;
			case UMLPackage.STRING_EXPRESSION__OWNING_TEMPLATE_PARAMETER :
				setOwningTemplateParameter((TemplateParameter) null);
				return;
			case UMLPackage.STRING_EXPRESSION__TYPE :
				setType((Type) null);
				return;
			case UMLPackage.STRING_EXPRESSION__SYMBOL :
				unsetSymbol();
				return;
			case UMLPackage.STRING_EXPRESSION__OPERAND :
				getOperands().clear();
				return;
			case UMLPackage.STRING_EXPRESSION__TEMPLATE_BINDING :
				getTemplateBindings().clear();
				return;
			case UMLPackage.STRING_EXPRESSION__OWNED_TEMPLATE_SIGNATURE :
				setOwnedTemplateSignature((TemplateSignature) null);
				return;
			case UMLPackage.STRING_EXPRESSION__SUB_EXPRESSION :
				getSubExpressions().clear();
				return;
			case UMLPackage.STRING_EXPRESSION__OWNING_EXPRESSION :
				setOwningExpression((StringExpression) null);
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
			case UMLPackage.STRING_EXPRESSION__EANNOTATIONS :
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UMLPackage.STRING_EXPRESSION__OWNED_ELEMENT :
				return isSetOwnedElements();
			case UMLPackage.STRING_EXPRESSION__OWNER :
				return isSetOwner();
			case UMLPackage.STRING_EXPRESSION__OWNED_COMMENT :
				List ownedComment = (List) eVirtualGet(UMLPackage.STRING_EXPRESSION__OWNED_COMMENT);
				return ownedComment != null && !ownedComment.isEmpty();
			case UMLPackage.STRING_EXPRESSION__NAME :
				String name = (String) eVirtualGet(
					UMLPackage.STRING_EXPRESSION__NAME, NAME_EDEFAULT);
				return NAME_EDEFAULT == null
					? name != null
					: !NAME_EDEFAULT.equals(name);
			case UMLPackage.STRING_EXPRESSION__VISIBILITY :
				return isSetVisibility();
			case UMLPackage.STRING_EXPRESSION__QUALIFIED_NAME :
				return QUALIFIED_NAME_EDEFAULT == null
					? getQualifiedName() != null
					: !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case UMLPackage.STRING_EXPRESSION__CLIENT_DEPENDENCY :
				List clientDependency = (List) eVirtualGet(UMLPackage.STRING_EXPRESSION__CLIENT_DEPENDENCY);
				return clientDependency != null && !clientDependency.isEmpty();
			case UMLPackage.STRING_EXPRESSION__NAMESPACE :
				return isSetNamespace();
			case UMLPackage.STRING_EXPRESSION__NAME_EXPRESSION :
				return eVirtualGet(UMLPackage.STRING_EXPRESSION__NAME_EXPRESSION) != null;
			case UMLPackage.STRING_EXPRESSION__TEMPLATE_PARAMETER :
				return eVirtualGet(UMLPackage.STRING_EXPRESSION__TEMPLATE_PARAMETER) != null;
			case UMLPackage.STRING_EXPRESSION__OWNING_TEMPLATE_PARAMETER :
				return basicGetOwningTemplateParameter() != null;
			case UMLPackage.STRING_EXPRESSION__TYPE :
				return eVirtualGet(UMLPackage.STRING_EXPRESSION__TYPE) != null;
			case UMLPackage.STRING_EXPRESSION__SYMBOL :
				return isSetSymbol();
			case UMLPackage.STRING_EXPRESSION__OPERAND :
				List operand = (List) eVirtualGet(UMLPackage.STRING_EXPRESSION__OPERAND);
				return operand != null && !operand.isEmpty();
			case UMLPackage.STRING_EXPRESSION__TEMPLATE_BINDING :
				List templateBinding = (List) eVirtualGet(UMLPackage.STRING_EXPRESSION__TEMPLATE_BINDING);
				return templateBinding != null && !templateBinding.isEmpty();
			case UMLPackage.STRING_EXPRESSION__OWNED_TEMPLATE_SIGNATURE :
				return eVirtualGet(UMLPackage.STRING_EXPRESSION__OWNED_TEMPLATE_SIGNATURE) != null;
			case UMLPackage.STRING_EXPRESSION__SUB_EXPRESSION :
				List subExpression = (List) eVirtualGet(UMLPackage.STRING_EXPRESSION__SUB_EXPRESSION);
				return subExpression != null && !subExpression.isEmpty();
			case UMLPackage.STRING_EXPRESSION__OWNING_EXPRESSION :
				return getOwningExpression() != null;
		}
		return eDynamicIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class baseClass) {
		if (baseClass == TemplateableElement.class) {
			switch (derivedFeatureID) {
				case UMLPackage.STRING_EXPRESSION__TEMPLATE_BINDING :
					return UMLPackage.TEMPLATEABLE_ELEMENT__TEMPLATE_BINDING;
				case UMLPackage.STRING_EXPRESSION__OWNED_TEMPLATE_SIGNATURE :
					return UMLPackage.TEMPLATEABLE_ELEMENT__OWNED_TEMPLATE_SIGNATURE;
				default :
					return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class baseClass) {
		if (baseClass == TemplateableElement.class) {
			switch (baseFeatureID) {
				case UMLPackage.TEMPLATEABLE_ELEMENT__TEMPLATE_BINDING :
					return UMLPackage.STRING_EXPRESSION__TEMPLATE_BINDING;
				case UMLPackage.TEMPLATEABLE_ELEMENT__OWNED_TEMPLATE_SIGNATURE :
					return UMLPackage.STRING_EXPRESSION__OWNED_TEMPLATE_SIGNATURE;
				default :
					return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOwnedElements() {
		return super.isSetOwnedElements()
			|| eIsSet(UMLPackage.STRING_EXPRESSION__TEMPLATE_BINDING)
			|| eIsSet(UMLPackage.STRING_EXPRESSION__OWNED_TEMPLATE_SIGNATURE)
			|| eIsSet(UMLPackage.STRING_EXPRESSION__SUB_EXPRESSION);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Element getOwner() {
		StringExpression owningExpression = getOwningExpression();
		if (owningExpression != null) {
			return owningExpression;
		}
		return super.getOwner();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOwner() {
		return super.isSetOwner()
			|| eIsSet(UMLPackage.STRING_EXPRESSION__OWNING_EXPRESSION);
	}

} //StringExpressionImpl
