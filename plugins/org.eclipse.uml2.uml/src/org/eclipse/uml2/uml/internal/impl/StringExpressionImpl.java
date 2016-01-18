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

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.uml2.common.util.CacheAdapter;
import org.eclipse.uml2.common.util.DerivedUnionEObjectEList;

import org.eclipse.uml2.uml.Comment;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Namespace;
import org.eclipse.uml2.uml.ParameterableElement;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.StringExpression;
import org.eclipse.uml2.uml.TemplateBinding;
import org.eclipse.uml2.uml.TemplateParameter;
import org.eclipse.uml2.uml.TemplateSignature;
import org.eclipse.uml2.uml.TemplateableElement;
import org.eclipse.uml2.uml.Type;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.ValueSpecification;
import org.eclipse.uml2.uml.VisibilityKind;

import org.eclipse.uml2.uml.internal.operations.StringExpressionOperations;
import org.eclipse.uml2.uml.internal.operations.TemplateableElementOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>String Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.StringExpressionImpl#getOwnedElements <em>Owned Element</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.StringExpressionImpl#getTemplateBindings <em>Template Binding</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.StringExpressionImpl#getOwnedTemplateSignature <em>Owned Template Signature</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.StringExpressionImpl#getOwner <em>Owner</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.StringExpressionImpl#getOwningExpression <em>Owning Expression</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.StringExpressionImpl#getSubExpressions <em>Sub Expression</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StringExpressionImpl
		extends ExpressionImpl
		implements StringExpression {

	/**
	 * The cached value of the '{@link #getTemplateBindings() <em>Template Binding</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTemplateBindings()
	 * @generated
	 * @ordered
	 */
	protected EList<TemplateBinding> templateBindings;

	/**
	 * The cached value of the '{@link #getOwnedTemplateSignature() <em>Owned Template Signature</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedTemplateSignature()
	 * @generated
	 * @ordered
	 */
	protected TemplateSignature ownedTemplateSignature;

	/**
	 * The cached value of the '{@link #getSubExpressions() <em>Sub Expression</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubExpressions()
	 * @generated
	 * @ordered
	 */
	protected EList<StringExpression> subExpressions;

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
	@Override
	protected EClass eStaticClass() {
		return UMLPackage.Literals.STRING_EXPRESSION;
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
						UMLPackage.STRING_EXPRESSION__OWNED_ELEMENT,
						OWNED_ELEMENT_ESUBSETS));
			}
			return ownedElements;
		}
		return new DerivedUnionEObjectEList<Element>(Element.class, this,
			UMLPackage.STRING_EXPRESSION__OWNED_ELEMENT,
			OWNED_ELEMENT_ESUBSETS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TemplateBinding> getTemplateBindings() {
		if (templateBindings == null) {
			templateBindings = new EObjectContainmentWithInverseEList.Resolving<TemplateBinding>(
				TemplateBinding.class, this,
				UMLPackage.STRING_EXPRESSION__TEMPLATE_BINDING,
				UMLPackage.TEMPLATE_BINDING__BOUND_ELEMENT);
		}
		return templateBindings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemplateBinding createTemplateBinding(TemplateSignature signature) {
		TemplateBinding newTemplateBinding = (TemplateBinding) create(
			UMLPackage.Literals.TEMPLATE_BINDING);
		getTemplateBindings().add(newTemplateBinding);
		if (signature != null)
			newTemplateBinding.setSignature(signature);
		return newTemplateBinding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemplateBinding getTemplateBinding(TemplateSignature signature) {
		return getTemplateBinding(signature, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemplateBinding getTemplateBinding(TemplateSignature signature,
			boolean createOnDemand) {
		templateBindingLoop : for (TemplateBinding templateBinding : getTemplateBindings()) {
			if (signature != null
				&& !signature.equals(templateBinding.getSignature()))
				continue templateBindingLoop;
			return templateBinding;
		}
		return createOnDemand
			? createTemplateBinding(signature)
			: null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemplateSignature getOwnedTemplateSignature() {
		if (ownedTemplateSignature != null
			&& ownedTemplateSignature.eIsProxy()) {
			InternalEObject oldOwnedTemplateSignature = (InternalEObject) ownedTemplateSignature;
			ownedTemplateSignature = (TemplateSignature) eResolveProxy(
				oldOwnedTemplateSignature);
			if (ownedTemplateSignature != oldOwnedTemplateSignature) {
				InternalEObject newOwnedTemplateSignature = (InternalEObject) ownedTemplateSignature;
				NotificationChain msgs = oldOwnedTemplateSignature
					.eInverseRemove(this,
						UMLPackage.TEMPLATE_SIGNATURE__TEMPLATE,
						TemplateSignature.class, null);
				if (newOwnedTemplateSignature.eInternalContainer() == null) {
					msgs = newOwnedTemplateSignature.eInverseAdd(this,
						UMLPackage.TEMPLATE_SIGNATURE__TEMPLATE,
						TemplateSignature.class, msgs);
				}
				if (msgs != null)
					msgs.dispatch();
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
						UMLPackage.STRING_EXPRESSION__OWNED_TEMPLATE_SIGNATURE,
						oldOwnedTemplateSignature, ownedTemplateSignature));
			}
		}
		return ownedTemplateSignature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemplateSignature basicGetOwnedTemplateSignature() {
		return ownedTemplateSignature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnedTemplateSignature(
			TemplateSignature newOwnedTemplateSignature,
			NotificationChain msgs) {
		TemplateSignature oldOwnedTemplateSignature = ownedTemplateSignature;
		ownedTemplateSignature = newOwnedTemplateSignature;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
				Notification.SET,
				UMLPackage.STRING_EXPRESSION__OWNED_TEMPLATE_SIGNATURE,
				oldOwnedTemplateSignature, newOwnedTemplateSignature);
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
		TemplateSignature newOwnedTemplateSignature = (TemplateSignature) create(
			eClass);
		setOwnedTemplateSignature(newOwnedTemplateSignature);
		return newOwnedTemplateSignature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemplateSignature createOwnedTemplateSignature() {
		return createOwnedTemplateSignature(
			UMLPackage.Literals.TEMPLATE_SIGNATURE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Element getOwner() {
		Element owner = basicGetOwner();
		return owner != null && owner.eIsProxy()
			? (Element) eResolveProxy((InternalEObject) owner)
			: owner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<StringExpression> getSubExpressions() {
		if (subExpressions == null) {
			subExpressions = new EObjectContainmentWithInverseEList.Resolving<StringExpression>(
				StringExpression.class, this,
				UMLPackage.STRING_EXPRESSION__SUB_EXPRESSION,
				UMLPackage.STRING_EXPRESSION__OWNING_EXPRESSION);
		}
		return subExpressions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StringExpression createSubExpression(String name, Type type) {
		StringExpression newSubExpression = (StringExpression) create(
			UMLPackage.Literals.STRING_EXPRESSION);
		getSubExpressions().add(newSubExpression);
		if (name != null)
			newSubExpression.setName(name);
		if (type != null)
			newSubExpression.setType(type);
		return newSubExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StringExpression getSubExpression(String name, Type type) {
		return getSubExpression(name, type, false, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StringExpression getSubExpression(String name, Type type,
			boolean ignoreCase, boolean createOnDemand) {
		subExpressionLoop : for (StringExpression subExpression : getSubExpressions()) {
			if (name != null && !(ignoreCase
				? name.equalsIgnoreCase(subExpression.getName())
				: name.equals(subExpression.getName())))
				continue subExpressionLoop;
			if (type != null && !type.equals(subExpression.getType()))
				continue subExpressionLoop;
			return subExpression;
		}
		return createOnDemand
			? createSubExpression(name, type)
			: null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StringExpression getOwningExpression() {
		if (eContainerFeatureID() != UMLPackage.STRING_EXPRESSION__OWNING_EXPRESSION)
			return null;
		return (StringExpression) eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StringExpression basicGetOwningExpression() {
		if (eContainerFeatureID() != UMLPackage.STRING_EXPRESSION__OWNING_EXPRESSION)
			return null;
		return (StringExpression) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwningExpression(
			StringExpression newOwningExpression, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newOwningExpression,
			UMLPackage.STRING_EXPRESSION__OWNING_EXPRESSION, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwningExpression(StringExpression newOwningExpression) {
		if (newOwningExpression != eInternalContainer()
			|| (eContainerFeatureID() != UMLPackage.STRING_EXPRESSION__OWNING_EXPRESSION
				&& newOwningExpression != null)) {
			if (EcoreUtil.isAncestor(this, newOwningExpression))
				throw new IllegalArgumentException(
					"Recursive containment not allowed for " + toString()); //$NON-NLS-1$
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOwningExpression != null)
				msgs = ((InternalEObject) newOwningExpression).eInverseAdd(this,
					UMLPackage.STRING_EXPRESSION__SUB_EXPRESSION,
					StringExpression.class, msgs);
			msgs = basicSetOwningExpression(newOwningExpression, msgs);
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
	public EList<ParameterableElement> parameterableElements() {
		CacheAdapter cache = getCacheAdapter();
		if (cache != null) {
			@SuppressWarnings("unchecked")
			EList<ParameterableElement> result = (EList<ParameterableElement>) cache
				.get(this,
					UMLPackage.Literals.TEMPLATEABLE_ELEMENT___PARAMETERABLE_ELEMENTS);
			if (result == null) {
				cache.put(this,
					UMLPackage.Literals.TEMPLATEABLE_ELEMENT___PARAMETERABLE_ELEMENTS,
					result = TemplateableElementOperations
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
	public boolean validateOperands(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return StringExpressionOperations.validateOperands(this, diagnostics,
			context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSubexpressions(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return StringExpressionOperations.validateSubexpressions(this,
			diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String stringValue() {
		return StringExpressionOperations.stringValue(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UMLPackage.STRING_EXPRESSION__EANNOTATIONS :
				return ((InternalEList<InternalEObject>) (InternalEList<?>) getEAnnotations())
					.basicAdd(otherEnd, msgs);
			case UMLPackage.STRING_EXPRESSION__OWNING_TEMPLATE_PARAMETER :
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOwningTemplateParameter(
					(TemplateParameter) otherEnd, msgs);
			case UMLPackage.STRING_EXPRESSION__TEMPLATE_PARAMETER :
				if (templateParameter != null)
					msgs = ((InternalEObject) templateParameter).eInverseRemove(
						this,
						UMLPackage.TEMPLATE_PARAMETER__PARAMETERED_ELEMENT,
						TemplateParameter.class, msgs);
				return basicSetTemplateParameter((TemplateParameter) otherEnd,
					msgs);
			case UMLPackage.STRING_EXPRESSION__TEMPLATE_BINDING :
				return ((InternalEList<InternalEObject>) (InternalEList<?>) getTemplateBindings())
					.basicAdd(otherEnd, msgs);
			case UMLPackage.STRING_EXPRESSION__OWNED_TEMPLATE_SIGNATURE :
				if (ownedTemplateSignature != null)
					msgs = ((InternalEObject) ownedTemplateSignature)
						.eInverseRemove(this,
							EOPPOSITE_FEATURE_BASE
								- UMLPackage.STRING_EXPRESSION__OWNED_TEMPLATE_SIGNATURE,
							null, msgs);
				return basicSetOwnedTemplateSignature(
					(TemplateSignature) otherEnd, msgs);
			case UMLPackage.STRING_EXPRESSION__OWNING_EXPRESSION :
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOwningExpression((StringExpression) otherEnd,
					msgs);
			case UMLPackage.STRING_EXPRESSION__SUB_EXPRESSION :
				return ((InternalEList<InternalEObject>) (InternalEList<?>) getSubExpressions())
					.basicAdd(otherEnd, msgs);
		}
		return eDynamicInverseAdd(otherEnd, featureID, msgs);
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
			case UMLPackage.STRING_EXPRESSION__EANNOTATIONS :
				return ((InternalEList<?>) getEAnnotations())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.STRING_EXPRESSION__OWNED_COMMENT :
				return ((InternalEList<?>) getOwnedComments())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.STRING_EXPRESSION__NAME_EXPRESSION :
				return basicSetNameExpression(null, msgs);
			case UMLPackage.STRING_EXPRESSION__OWNING_TEMPLATE_PARAMETER :
				return basicSetOwningTemplateParameter(null, msgs);
			case UMLPackage.STRING_EXPRESSION__TEMPLATE_PARAMETER :
				return basicSetTemplateParameter(null, msgs);
			case UMLPackage.STRING_EXPRESSION__OPERAND :
				return ((InternalEList<?>) getOperands()).basicRemove(otherEnd,
					msgs);
			case UMLPackage.STRING_EXPRESSION__TEMPLATE_BINDING :
				return ((InternalEList<?>) getTemplateBindings())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.STRING_EXPRESSION__OWNED_TEMPLATE_SIGNATURE :
				return basicSetOwnedTemplateSignature(null, msgs);
			case UMLPackage.STRING_EXPRESSION__OWNING_EXPRESSION :
				return basicSetOwningExpression(null, msgs);
			case UMLPackage.STRING_EXPRESSION__SUB_EXPRESSION :
				return ((InternalEList<?>) getSubExpressions())
					.basicRemove(otherEnd, msgs);
		}
		return eDynamicInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(
			NotificationChain msgs) {
		switch (eContainerFeatureID()) {
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
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UMLPackage.STRING_EXPRESSION__EANNOTATIONS :
				return getEAnnotations();
			case UMLPackage.STRING_EXPRESSION__OWNED_COMMENT :
				return getOwnedComments();
			case UMLPackage.STRING_EXPRESSION__OWNED_ELEMENT :
				return getOwnedElements();
			case UMLPackage.STRING_EXPRESSION__OWNER :
				if (resolve)
					return getOwner();
				return basicGetOwner();
			case UMLPackage.STRING_EXPRESSION__CLIENT_DEPENDENCY :
				return getClientDependencies();
			case UMLPackage.STRING_EXPRESSION__NAME :
				return getName();
			case UMLPackage.STRING_EXPRESSION__NAME_EXPRESSION :
				if (resolve)
					return getNameExpression();
				return basicGetNameExpression();
			case UMLPackage.STRING_EXPRESSION__NAMESPACE :
				if (resolve)
					return getNamespace();
				return basicGetNamespace();
			case UMLPackage.STRING_EXPRESSION__QUALIFIED_NAME :
				return getQualifiedName();
			case UMLPackage.STRING_EXPRESSION__VISIBILITY :
				return getVisibility();
			case UMLPackage.STRING_EXPRESSION__OWNING_TEMPLATE_PARAMETER :
				if (resolve)
					return getOwningTemplateParameter();
				return basicGetOwningTemplateParameter();
			case UMLPackage.STRING_EXPRESSION__TEMPLATE_PARAMETER :
				if (resolve)
					return getTemplateParameter();
				return basicGetTemplateParameter();
			case UMLPackage.STRING_EXPRESSION__TYPE :
				if (resolve)
					return getType();
				return basicGetType();
			case UMLPackage.STRING_EXPRESSION__OPERAND :
				return getOperands();
			case UMLPackage.STRING_EXPRESSION__SYMBOL :
				return getSymbol();
			case UMLPackage.STRING_EXPRESSION__TEMPLATE_BINDING :
				return getTemplateBindings();
			case UMLPackage.STRING_EXPRESSION__OWNED_TEMPLATE_SIGNATURE :
				if (resolve)
					return getOwnedTemplateSignature();
				return basicGetOwnedTemplateSignature();
			case UMLPackage.STRING_EXPRESSION__OWNING_EXPRESSION :
				if (resolve)
					return getOwningExpression();
				return basicGetOwningExpression();
			case UMLPackage.STRING_EXPRESSION__SUB_EXPRESSION :
				return getSubExpressions();
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
			case UMLPackage.STRING_EXPRESSION__EANNOTATIONS :
				getEAnnotations().clear();
				getEAnnotations()
					.addAll((Collection<? extends EAnnotation>) newValue);
				return;
			case UMLPackage.STRING_EXPRESSION__OWNED_COMMENT :
				getOwnedComments().clear();
				getOwnedComments()
					.addAll((Collection<? extends Comment>) newValue);
				return;
			case UMLPackage.STRING_EXPRESSION__NAME :
				setName((String) newValue);
				return;
			case UMLPackage.STRING_EXPRESSION__NAME_EXPRESSION :
				setNameExpression((StringExpression) newValue);
				return;
			case UMLPackage.STRING_EXPRESSION__VISIBILITY :
				setVisibility((VisibilityKind) newValue);
				return;
			case UMLPackage.STRING_EXPRESSION__OWNING_TEMPLATE_PARAMETER :
				setOwningTemplateParameter((TemplateParameter) newValue);
				return;
			case UMLPackage.STRING_EXPRESSION__TEMPLATE_PARAMETER :
				setTemplateParameter((TemplateParameter) newValue);
				return;
			case UMLPackage.STRING_EXPRESSION__TYPE :
				setType((Type) newValue);
				return;
			case UMLPackage.STRING_EXPRESSION__OPERAND :
				getOperands().clear();
				getOperands().addAll(
					(Collection<? extends ValueSpecification>) newValue);
				return;
			case UMLPackage.STRING_EXPRESSION__SYMBOL :
				setSymbol((String) newValue);
				return;
			case UMLPackage.STRING_EXPRESSION__TEMPLATE_BINDING :
				getTemplateBindings().clear();
				getTemplateBindings()
					.addAll((Collection<? extends TemplateBinding>) newValue);
				return;
			case UMLPackage.STRING_EXPRESSION__OWNED_TEMPLATE_SIGNATURE :
				setOwnedTemplateSignature((TemplateSignature) newValue);
				return;
			case UMLPackage.STRING_EXPRESSION__OWNING_EXPRESSION :
				setOwningExpression((StringExpression) newValue);
				return;
			case UMLPackage.STRING_EXPRESSION__SUB_EXPRESSION :
				getSubExpressions().clear();
				getSubExpressions()
					.addAll((Collection<? extends StringExpression>) newValue);
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
			case UMLPackage.STRING_EXPRESSION__EANNOTATIONS :
				getEAnnotations().clear();
				return;
			case UMLPackage.STRING_EXPRESSION__OWNED_COMMENT :
				getOwnedComments().clear();
				return;
			case UMLPackage.STRING_EXPRESSION__NAME :
				unsetName();
				return;
			case UMLPackage.STRING_EXPRESSION__NAME_EXPRESSION :
				setNameExpression((StringExpression) null);
				return;
			case UMLPackage.STRING_EXPRESSION__VISIBILITY :
				unsetVisibility();
				return;
			case UMLPackage.STRING_EXPRESSION__OWNING_TEMPLATE_PARAMETER :
				setOwningTemplateParameter((TemplateParameter) null);
				return;
			case UMLPackage.STRING_EXPRESSION__TEMPLATE_PARAMETER :
				setTemplateParameter((TemplateParameter) null);
				return;
			case UMLPackage.STRING_EXPRESSION__TYPE :
				setType((Type) null);
				return;
			case UMLPackage.STRING_EXPRESSION__OPERAND :
				getOperands().clear();
				return;
			case UMLPackage.STRING_EXPRESSION__SYMBOL :
				unsetSymbol();
				return;
			case UMLPackage.STRING_EXPRESSION__TEMPLATE_BINDING :
				getTemplateBindings().clear();
				return;
			case UMLPackage.STRING_EXPRESSION__OWNED_TEMPLATE_SIGNATURE :
				setOwnedTemplateSignature((TemplateSignature) null);
				return;
			case UMLPackage.STRING_EXPRESSION__OWNING_EXPRESSION :
				setOwningExpression((StringExpression) null);
				return;
			case UMLPackage.STRING_EXPRESSION__SUB_EXPRESSION :
				getSubExpressions().clear();
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
			case UMLPackage.STRING_EXPRESSION__EANNOTATIONS :
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UMLPackage.STRING_EXPRESSION__OWNED_COMMENT :
				return ownedComments != null && !ownedComments.isEmpty();
			case UMLPackage.STRING_EXPRESSION__OWNED_ELEMENT :
				return isSetOwnedElements();
			case UMLPackage.STRING_EXPRESSION__OWNER :
				return isSetOwner();
			case UMLPackage.STRING_EXPRESSION__CLIENT_DEPENDENCY :
				return !getClientDependencies().isEmpty();
			case UMLPackage.STRING_EXPRESSION__NAME :
				return isSetName();
			case UMLPackage.STRING_EXPRESSION__NAME_EXPRESSION :
				return nameExpression != null;
			case UMLPackage.STRING_EXPRESSION__NAMESPACE :
				return isSetNamespace();
			case UMLPackage.STRING_EXPRESSION__QUALIFIED_NAME :
				return QUALIFIED_NAME_EDEFAULT == null
					? getQualifiedName() != null
					: !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case UMLPackage.STRING_EXPRESSION__VISIBILITY :
				return isSetVisibility();
			case UMLPackage.STRING_EXPRESSION__OWNING_TEMPLATE_PARAMETER :
				return basicGetOwningTemplateParameter() != null;
			case UMLPackage.STRING_EXPRESSION__TEMPLATE_PARAMETER :
				return templateParameter != null;
			case UMLPackage.STRING_EXPRESSION__TYPE :
				return type != null;
			case UMLPackage.STRING_EXPRESSION__OPERAND :
				return operands != null && !operands.isEmpty();
			case UMLPackage.STRING_EXPRESSION__SYMBOL :
				return isSetSymbol();
			case UMLPackage.STRING_EXPRESSION__TEMPLATE_BINDING :
				return templateBindings != null && !templateBindings.isEmpty();
			case UMLPackage.STRING_EXPRESSION__OWNED_TEMPLATE_SIGNATURE :
				return ownedTemplateSignature != null;
			case UMLPackage.STRING_EXPRESSION__OWNING_EXPRESSION :
				return basicGetOwningExpression() != null;
			case UMLPackage.STRING_EXPRESSION__SUB_EXPRESSION :
				return subExpressions != null && !subExpressions.isEmpty();
		}
		return eDynamicIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID,
			Class<?> baseClass) {
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
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID,
			Class<?> baseClass) {
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
	@Override
	public int eDerivedOperationID(int baseOperationID, Class<?> baseClass) {
		if (baseClass == TemplateableElement.class) {
			switch (baseOperationID) {
				case UMLPackage.TEMPLATEABLE_ELEMENT___IS_TEMPLATE :
					return UMLPackage.STRING_EXPRESSION___IS_TEMPLATE;
				case UMLPackage.TEMPLATEABLE_ELEMENT___PARAMETERABLE_ELEMENTS :
					return UMLPackage.STRING_EXPRESSION___PARAMETERABLE_ELEMENTS;
				default :
					return -1;
			}
		}
		return super.eDerivedOperationID(baseOperationID, baseClass);
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
			case UMLPackage.STRING_EXPRESSION___GET_EANNOTATION__STRING :
				return getEAnnotation((String) arguments.get(0));
			case UMLPackage.STRING_EXPRESSION___VALIDATE_HAS_OWNER__DIAGNOSTICCHAIN_MAP :
				return validateHasOwner((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.STRING_EXPRESSION___VALIDATE_NOT_OWN_SELF__DIAGNOSTICCHAIN_MAP :
				return validateNotOwnSelf((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.STRING_EXPRESSION___ADD_KEYWORD__STRING :
				return addKeyword((String) arguments.get(0));
			case UMLPackage.STRING_EXPRESSION___APPLY_STEREOTYPE__STEREOTYPE :
				return applyStereotype((Stereotype) arguments.get(0));
			case UMLPackage.STRING_EXPRESSION___CREATE_EANNOTATION__STRING :
				return createEAnnotation((String) arguments.get(0));
			case UMLPackage.STRING_EXPRESSION___DESTROY :
				destroy();
				return null;
			case UMLPackage.STRING_EXPRESSION___GET_KEYWORDS :
				return getKeywords();
			case UMLPackage.STRING_EXPRESSION___GET_APPLICABLE_STEREOTYPE__STRING :
				return getApplicableStereotype((String) arguments.get(0));
			case UMLPackage.STRING_EXPRESSION___GET_APPLICABLE_STEREOTYPES :
				return getApplicableStereotypes();
			case UMLPackage.STRING_EXPRESSION___GET_APPLIED_STEREOTYPE__STRING :
				return getAppliedStereotype((String) arguments.get(0));
			case UMLPackage.STRING_EXPRESSION___GET_APPLIED_STEREOTYPES :
				return getAppliedStereotypes();
			case UMLPackage.STRING_EXPRESSION___GET_APPLIED_SUBSTEREOTYPE__STEREOTYPE_STRING :
				return getAppliedSubstereotype((Stereotype) arguments.get(0),
					(String) arguments.get(1));
			case UMLPackage.STRING_EXPRESSION___GET_APPLIED_SUBSTEREOTYPES__STEREOTYPE :
				return getAppliedSubstereotypes((Stereotype) arguments.get(0));
			case UMLPackage.STRING_EXPRESSION___GET_MODEL :
				return getModel();
			case UMLPackage.STRING_EXPRESSION___GET_NEAREST_PACKAGE :
				return getNearestPackage();
			case UMLPackage.STRING_EXPRESSION___GET_RELATIONSHIPS :
				return getRelationships();
			case UMLPackage.STRING_EXPRESSION___GET_RELATIONSHIPS__ECLASS :
				return getRelationships((EClass) arguments.get(0));
			case UMLPackage.STRING_EXPRESSION___GET_REQUIRED_STEREOTYPE__STRING :
				return getRequiredStereotype((String) arguments.get(0));
			case UMLPackage.STRING_EXPRESSION___GET_REQUIRED_STEREOTYPES :
				return getRequiredStereotypes();
			case UMLPackage.STRING_EXPRESSION___GET_SOURCE_DIRECTED_RELATIONSHIPS :
				return getSourceDirectedRelationships();
			case UMLPackage.STRING_EXPRESSION___GET_SOURCE_DIRECTED_RELATIONSHIPS__ECLASS :
				return getSourceDirectedRelationships(
					(EClass) arguments.get(0));
			case UMLPackage.STRING_EXPRESSION___GET_STEREOTYPE_APPLICATION__STEREOTYPE :
				return getStereotypeApplication((Stereotype) arguments.get(0));
			case UMLPackage.STRING_EXPRESSION___GET_STEREOTYPE_APPLICATIONS :
				return getStereotypeApplications();
			case UMLPackage.STRING_EXPRESSION___GET_TARGET_DIRECTED_RELATIONSHIPS :
				return getTargetDirectedRelationships();
			case UMLPackage.STRING_EXPRESSION___GET_TARGET_DIRECTED_RELATIONSHIPS__ECLASS :
				return getTargetDirectedRelationships(
					(EClass) arguments.get(0));
			case UMLPackage.STRING_EXPRESSION___GET_VALUE__STEREOTYPE_STRING :
				return getValue((Stereotype) arguments.get(0),
					(String) arguments.get(1));
			case UMLPackage.STRING_EXPRESSION___HAS_KEYWORD__STRING :
				return hasKeyword((String) arguments.get(0));
			case UMLPackage.STRING_EXPRESSION___HAS_VALUE__STEREOTYPE_STRING :
				return hasValue((Stereotype) arguments.get(0),
					(String) arguments.get(1));
			case UMLPackage.STRING_EXPRESSION___IS_STEREOTYPE_APPLICABLE__STEREOTYPE :
				return isStereotypeApplicable((Stereotype) arguments.get(0));
			case UMLPackage.STRING_EXPRESSION___IS_STEREOTYPE_APPLIED__STEREOTYPE :
				return isStereotypeApplied((Stereotype) arguments.get(0));
			case UMLPackage.STRING_EXPRESSION___IS_STEREOTYPE_REQUIRED__STEREOTYPE :
				return isStereotypeRequired((Stereotype) arguments.get(0));
			case UMLPackage.STRING_EXPRESSION___REMOVE_KEYWORD__STRING :
				return removeKeyword((String) arguments.get(0));
			case UMLPackage.STRING_EXPRESSION___SET_VALUE__STEREOTYPE_STRING_OBJECT :
				setValue((Stereotype) arguments.get(0),
					(String) arguments.get(1), arguments.get(2));
				return null;
			case UMLPackage.STRING_EXPRESSION___UNAPPLY_STEREOTYPE__STEREOTYPE :
				return unapplyStereotype((Stereotype) arguments.get(0));
			case UMLPackage.STRING_EXPRESSION___ALL_OWNED_ELEMENTS :
				return allOwnedElements();
			case UMLPackage.STRING_EXPRESSION___MUST_BE_OWNED :
				return mustBeOwned();
			case UMLPackage.STRING_EXPRESSION___VALIDATE_VISIBILITY_NEEDS_OWNERSHIP__DIAGNOSTICCHAIN_MAP :
				return validateVisibilityNeedsOwnership(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.STRING_EXPRESSION___VALIDATE_HAS_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP :
				return validateHasQualifiedName(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.STRING_EXPRESSION___VALIDATE_HAS_NO_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP :
				return validateHasNoQualifiedName(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.STRING_EXPRESSION___CREATE_DEPENDENCY__NAMEDELEMENT :
				return createDependency((NamedElement) arguments.get(0));
			case UMLPackage.STRING_EXPRESSION___CREATE_USAGE__NAMEDELEMENT :
				return createUsage((NamedElement) arguments.get(0));
			case UMLPackage.STRING_EXPRESSION___GET_LABEL :
				return getLabel();
			case UMLPackage.STRING_EXPRESSION___GET_LABEL__BOOLEAN :
				return getLabel((Boolean) arguments.get(0));
			case UMLPackage.STRING_EXPRESSION___GET_NAMESPACE :
				return getNamespace();
			case UMLPackage.STRING_EXPRESSION___ALL_NAMESPACES :
				return allNamespaces();
			case UMLPackage.STRING_EXPRESSION___ALL_OWNING_PACKAGES :
				return allOwningPackages();
			case UMLPackage.STRING_EXPRESSION___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE :
				return isDistinguishableFrom((NamedElement) arguments.get(0),
					(Namespace) arguments.get(1));
			case UMLPackage.STRING_EXPRESSION___GET_QUALIFIED_NAME :
				return getQualifiedName();
			case UMLPackage.STRING_EXPRESSION___SEPARATOR :
				return separator();
			case UMLPackage.STRING_EXPRESSION___GET_CLIENT_DEPENDENCIES :
				return getClientDependencies();
			case UMLPackage.STRING_EXPRESSION___IS_COMPATIBLE_WITH__PARAMETERABLEELEMENT :
				return isCompatibleWith(
					(ParameterableElement) arguments.get(0));
			case UMLPackage.STRING_EXPRESSION___IS_TEMPLATE_PARAMETER :
				return isTemplateParameter();
			case UMLPackage.STRING_EXPRESSION___VALIDATE_NAMESPACE_NEEDS_VISIBILITY__DIAGNOSTICCHAIN_MAP :
				return validateNamespaceNeedsVisibility(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.STRING_EXPRESSION___BOOLEAN_VALUE :
				return booleanValue();
			case UMLPackage.STRING_EXPRESSION___INTEGER_VALUE :
				return integerValue();
			case UMLPackage.STRING_EXPRESSION___IS_COMPUTABLE :
				return isComputable();
			case UMLPackage.STRING_EXPRESSION___IS_NULL :
				return isNull();
			case UMLPackage.STRING_EXPRESSION___REAL_VALUE :
				return realValue();
			case UMLPackage.STRING_EXPRESSION___STRING_VALUE :
				return stringValue();
			case UMLPackage.STRING_EXPRESSION___UNLIMITED_VALUE :
				return unlimitedValue();
			case UMLPackage.STRING_EXPRESSION___IS_TEMPLATE :
				return isTemplate();
			case UMLPackage.STRING_EXPRESSION___PARAMETERABLE_ELEMENTS :
				return parameterableElements();
			case UMLPackage.STRING_EXPRESSION___VALIDATE_OPERANDS__DIAGNOSTICCHAIN_MAP :
				return validateOperands((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.STRING_EXPRESSION___VALIDATE_SUBEXPRESSIONS__DIAGNOSTICCHAIN_MAP :
				return validateSubexpressions(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
		}
		return eDynamicInvoke(operationID, arguments);
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
		UMLPackage.STRING_EXPRESSION__OWNED_COMMENT,
		UMLPackage.STRING_EXPRESSION__NAME_EXPRESSION,
		UMLPackage.STRING_EXPRESSION__OPERAND,
		UMLPackage.STRING_EXPRESSION__TEMPLATE_BINDING,
		UMLPackage.STRING_EXPRESSION__OWNED_TEMPLATE_SIGNATURE,
		UMLPackage.STRING_EXPRESSION__SUB_EXPRESSION};

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
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
	@Override
	public Element basicGetOwner() {
		StringExpression owningExpression = basicGetOwningExpression();
		if (owningExpression != null) {
			return owningExpression;
		}
		return super.basicGetOwner();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetOwner() {
		return super.isSetOwner()
			|| eIsSet(UMLPackage.STRING_EXPRESSION__OWNING_EXPRESSION);
	}

} //StringExpressionImpl
