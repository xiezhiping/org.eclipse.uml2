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
 * $Id: RedefinableTemplateSignatureImpl.java,v 1.6 2004/06/18 04:34:32 khussey Exp $
 */
package org.eclipse.uml2.impl;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.uml2.Element;
import org.eclipse.uml2.RedefinableTemplateSignature;
import org.eclipse.uml2.StringExpression;
import org.eclipse.uml2.TemplateParameter;
import org.eclipse.uml2.TemplateSignature;
import org.eclipse.uml2.TemplateableElement;
import org.eclipse.uml2.UML2Package;
import org.eclipse.uml2.VisibilityKind;
import org.eclipse.uml2.internal.util.SubsetEObjectContainmentWithInverseEList;
import org.eclipse.uml2.internal.util.SupersetEObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Redefinable Template Signature</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2.impl.RedefinableTemplateSignatureImpl#getParameters <em>Parameter</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.RedefinableTemplateSignatureImpl#getOwnedParameters <em>Owned Parameter</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.RedefinableTemplateSignatureImpl#getNestedSignatures <em>Nested Signature</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.RedefinableTemplateSignatureImpl#getNestingSignature <em>Nesting Signature</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.RedefinableTemplateSignatureImpl#getTemplate <em>Template</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RedefinableTemplateSignatureImpl extends RedefinableElementImpl implements RedefinableTemplateSignature {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2003, 2004 IBM Corporation and others."; //$NON-NLS-1$

	/**
	 * The cached value of the '{@link #getParameters() <em>Parameter</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameters()
	 * @generated
	 * @ordered
	 */
	protected EList parameter = null;

	/**
	 * The cached value of the '{@link #getOwnedParameters() <em>Owned Parameter</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedParameters()
	 * @generated
	 * @ordered
	 */
	protected EList ownedParameter = null;

	/**
	 * The cached value of the '{@link #getNestedSignatures() <em>Nested Signature</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNestedSignatures()
	 * @generated
	 * @ordered
	 */
	protected EList nestedSignature = null;

	/**
	 * The cached value of the '{@link #getNestingSignature() <em>Nesting Signature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNestingSignature()
	 * @generated
	 * @ordered
	 */
	protected TemplateSignature nestingSignature = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RedefinableTemplateSignatureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return UML2Package.eINSTANCE.getRedefinableTemplateSignature();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getParameters() {
		if (parameter == null) {
			parameter = new SupersetEObjectResolvingEList(TemplateParameter.class, this, UML2Package.REDEFINABLE_TEMPLATE_SIGNATURE__PARAMETER, new int[] {UML2Package.REDEFINABLE_TEMPLATE_SIGNATURE__OWNED_PARAMETER});
		}
		return parameter;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getOwnedParameters() {
		if (ownedParameter == null) {
			ownedParameter = new SubsetEObjectContainmentWithInverseEList(TemplateParameter.class, this, UML2Package.REDEFINABLE_TEMPLATE_SIGNATURE__OWNED_PARAMETER, new int[] {UML2Package.REDEFINABLE_TEMPLATE_SIGNATURE__PARAMETER}, UML2Package.TEMPLATE_PARAMETER__SIGNATURE);
		}
		return ownedParameter;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemplateParameter createOwnedParameter(EClass eClass) {
		TemplateParameter newOwnedParameter = (TemplateParameter) eClass.getEPackage().getEFactoryInstance().create(eClass);
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, 0, UML2Package.REDEFINABLE_TEMPLATE_SIGNATURE__OWNED_PARAMETER, null, newOwnedParameter));
		}
		getOwnedParameters().add(newOwnedParameter);
		return newOwnedParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getNestedSignatures() {
		if (nestedSignature == null) {
			nestedSignature = new EObjectWithInverseResolvingEList(TemplateSignature.class, this, UML2Package.REDEFINABLE_TEMPLATE_SIGNATURE__NESTED_SIGNATURE, UML2Package.TEMPLATE_SIGNATURE__NESTING_SIGNATURE);
		}
		return nestedSignature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemplateSignature getNestingSignature() {
		if (nestingSignature != null && nestingSignature.eIsProxy()) {
			TemplateSignature oldNestingSignature = nestingSignature;
			nestingSignature = (TemplateSignature)eResolveProxy((InternalEObject)nestingSignature);
			if (nestingSignature != oldNestingSignature) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UML2Package.REDEFINABLE_TEMPLATE_SIGNATURE__NESTING_SIGNATURE, oldNestingSignature, nestingSignature));
			}
		}
		return nestingSignature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemplateSignature basicGetNestingSignature() {
		return nestingSignature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNestingSignature(TemplateSignature newNestingSignature, NotificationChain msgs) {
		TemplateSignature oldNestingSignature = nestingSignature;
		nestingSignature = newNestingSignature;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UML2Package.REDEFINABLE_TEMPLATE_SIGNATURE__NESTING_SIGNATURE, oldNestingSignature, newNestingSignature);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNestingSignature(TemplateSignature newNestingSignature) {
		if (newNestingSignature != nestingSignature) {
			NotificationChain msgs = null;
			if (nestingSignature != null)
				msgs = ((InternalEObject)nestingSignature).eInverseRemove(this, UML2Package.TEMPLATE_SIGNATURE__NESTED_SIGNATURE, TemplateSignature.class, msgs);
			if (newNestingSignature != null)
				msgs = ((InternalEObject)newNestingSignature).eInverseAdd(this, UML2Package.TEMPLATE_SIGNATURE__NESTED_SIGNATURE, TemplateSignature.class, msgs);
			msgs = basicSetNestingSignature(newNestingSignature, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2Package.REDEFINABLE_TEMPLATE_SIGNATURE__NESTING_SIGNATURE, newNestingSignature, newNestingSignature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemplateableElement getTemplate() {
		if (eContainerFeatureID != UML2Package.REDEFINABLE_TEMPLATE_SIGNATURE__TEMPLATE) return null;
		return (TemplateableElement)eContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTemplate(TemplateableElement newTemplate) {
		if (newTemplate != eContainer || (eContainerFeatureID != UML2Package.REDEFINABLE_TEMPLATE_SIGNATURE__TEMPLATE && newTemplate != null)) {
			if (EcoreUtil.isAncestor(this, newTemplate))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString()); //$NON-NLS-1$
			NotificationChain msgs = null;
			if (eContainer != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newTemplate != null)
				msgs = ((InternalEObject)newTemplate).eInverseAdd(this, UML2Package.TEMPLATEABLE_ELEMENT__OWNED_TEMPLATE_SIGNATURE, TemplateableElement.class, msgs);
			msgs = eBasicSetContainer((InternalEObject)newTemplate, UML2Package.REDEFINABLE_TEMPLATE_SIGNATURE__TEMPLATE, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2Package.REDEFINABLE_TEMPLATE_SIGNATURE__TEMPLATE, newTemplate, newTemplate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getOwnedElements() {
		EList ownedElement = (EList) getCacheAdapter().get(this, UML2Package.eINSTANCE.getElement_OwnedElement());

		if (null == ownedElement) {
			Set union = new LinkedHashSet();
			union.addAll(super.getOwnedElements());
			union.addAll(getOwnedParameters());

			ownedElement = new EcoreEList.UnmodifiableEList(this, UML2Package.eINSTANCE.getElement_OwnedElement(), union.size(), union.toArray());
			getCacheAdapter().put(this, UML2Package.eINSTANCE.getElement_OwnedElement(), ownedElement);
		}

		return ownedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Element basicGetOwner() {
		if (null != getTemplate()) {
			return (Element) getTemplate();
		}
		return super.basicGetOwner();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, Class baseClass, NotificationChain msgs) {
		if (featureID >= 0) {
			switch (eDerivedStructuralFeatureID(featureID, baseClass)) {
				case UML2Package.REDEFINABLE_TEMPLATE_SIGNATURE__EANNOTATIONS:
					return ((InternalEList)getEAnnotations()).basicAdd(otherEnd, msgs);
				case UML2Package.REDEFINABLE_TEMPLATE_SIGNATURE__TEMPLATE_BINDING:
					return ((InternalEList)getTemplateBindings()).basicAdd(otherEnd, msgs);
				case UML2Package.REDEFINABLE_TEMPLATE_SIGNATURE__OWNED_TEMPLATE_SIGNATURE:
					if (ownedTemplateSignature != null)
						msgs = ((InternalEObject)ownedTemplateSignature).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UML2Package.REDEFINABLE_TEMPLATE_SIGNATURE__OWNED_TEMPLATE_SIGNATURE, null, msgs);
					return basicSetOwnedTemplateSignature((TemplateSignature)otherEnd, msgs);
				case UML2Package.REDEFINABLE_TEMPLATE_SIGNATURE__CLIENT_DEPENDENCY:
					return ((InternalEList)getClientDependencies()).basicAdd(otherEnd, msgs);
				case UML2Package.REDEFINABLE_TEMPLATE_SIGNATURE__OWNED_PARAMETER:
					return ((InternalEList)getOwnedParameters()).basicAdd(otherEnd, msgs);
				case UML2Package.REDEFINABLE_TEMPLATE_SIGNATURE__NESTED_SIGNATURE:
					return ((InternalEList)getNestedSignatures()).basicAdd(otherEnd, msgs);
				case UML2Package.REDEFINABLE_TEMPLATE_SIGNATURE__NESTING_SIGNATURE:
					if (nestingSignature != null)
						msgs = ((InternalEObject)nestingSignature).eInverseRemove(this, UML2Package.TEMPLATE_SIGNATURE__NESTED_SIGNATURE, TemplateSignature.class, msgs);
					return basicSetNestingSignature((TemplateSignature)otherEnd, msgs);
				case UML2Package.REDEFINABLE_TEMPLATE_SIGNATURE__TEMPLATE:
					if (eContainer != null)
						msgs = eBasicRemoveFromContainer(msgs);
					return eBasicSetContainer(otherEnd, UML2Package.REDEFINABLE_TEMPLATE_SIGNATURE__TEMPLATE, msgs);
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
				case UML2Package.REDEFINABLE_TEMPLATE_SIGNATURE__EANNOTATIONS:
					return ((InternalEList)getEAnnotations()).basicRemove(otherEnd, msgs);
				case UML2Package.REDEFINABLE_TEMPLATE_SIGNATURE__OWNED_COMMENT:
					return ((InternalEList)getOwnedComments()).basicRemove(otherEnd, msgs);
				case UML2Package.REDEFINABLE_TEMPLATE_SIGNATURE__TEMPLATE_BINDING:
					return ((InternalEList)getTemplateBindings()).basicRemove(otherEnd, msgs);
				case UML2Package.REDEFINABLE_TEMPLATE_SIGNATURE__OWNED_TEMPLATE_SIGNATURE:
					return basicSetOwnedTemplateSignature(null, msgs);
				case UML2Package.REDEFINABLE_TEMPLATE_SIGNATURE__CLIENT_DEPENDENCY:
					return ((InternalEList)getClientDependencies()).basicRemove(otherEnd, msgs);
				case UML2Package.REDEFINABLE_TEMPLATE_SIGNATURE__NAME_EXPRESSION:
					return basicSetNameExpression(null, msgs);
				case UML2Package.REDEFINABLE_TEMPLATE_SIGNATURE__OWNED_PARAMETER:
					return ((InternalEList)getOwnedParameters()).basicRemove(otherEnd, msgs);
				case UML2Package.REDEFINABLE_TEMPLATE_SIGNATURE__NESTED_SIGNATURE:
					return ((InternalEList)getNestedSignatures()).basicRemove(otherEnd, msgs);
				case UML2Package.REDEFINABLE_TEMPLATE_SIGNATURE__NESTING_SIGNATURE:
					return basicSetNestingSignature(null, msgs);
				case UML2Package.REDEFINABLE_TEMPLATE_SIGNATURE__TEMPLATE:
					return eBasicSetContainer(null, UML2Package.REDEFINABLE_TEMPLATE_SIGNATURE__TEMPLATE, msgs);
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
				case UML2Package.REDEFINABLE_TEMPLATE_SIGNATURE__TEMPLATE:
					return eContainer.eInverseRemove(this, UML2Package.TEMPLATEABLE_ELEMENT__OWNED_TEMPLATE_SIGNATURE, TemplateableElement.class, msgs);
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
			case UML2Package.REDEFINABLE_TEMPLATE_SIGNATURE__EANNOTATIONS:
				return getEAnnotations();
			case UML2Package.REDEFINABLE_TEMPLATE_SIGNATURE__OWNED_ELEMENT:
				return getOwnedElements();
			case UML2Package.REDEFINABLE_TEMPLATE_SIGNATURE__OWNER:
				if (resolve) return getOwner();
				return basicGetOwner();
			case UML2Package.REDEFINABLE_TEMPLATE_SIGNATURE__OWNED_COMMENT:
				return getOwnedComments();
			case UML2Package.REDEFINABLE_TEMPLATE_SIGNATURE__TEMPLATE_BINDING:
				return getTemplateBindings();
			case UML2Package.REDEFINABLE_TEMPLATE_SIGNATURE__OWNED_TEMPLATE_SIGNATURE:
				return getOwnedTemplateSignature();
			case UML2Package.REDEFINABLE_TEMPLATE_SIGNATURE__NAME:
				return getName();
			case UML2Package.REDEFINABLE_TEMPLATE_SIGNATURE__QUALIFIED_NAME:
				return getQualifiedName();
			case UML2Package.REDEFINABLE_TEMPLATE_SIGNATURE__VISIBILITY:
				return getVisibility();
			case UML2Package.REDEFINABLE_TEMPLATE_SIGNATURE__CLIENT_DEPENDENCY:
				return getClientDependencies();
			case UML2Package.REDEFINABLE_TEMPLATE_SIGNATURE__NAME_EXPRESSION:
				return getNameExpression();
			case UML2Package.REDEFINABLE_TEMPLATE_SIGNATURE__REDEFINITION_CONTEXT:
				return getRedefinitionContexts();
			case UML2Package.REDEFINABLE_TEMPLATE_SIGNATURE__IS_LEAF:
				return isLeaf() ? Boolean.TRUE : Boolean.FALSE;
			case UML2Package.REDEFINABLE_TEMPLATE_SIGNATURE__PARAMETER:
				return getParameters();
			case UML2Package.REDEFINABLE_TEMPLATE_SIGNATURE__OWNED_PARAMETER:
				return getOwnedParameters();
			case UML2Package.REDEFINABLE_TEMPLATE_SIGNATURE__NESTED_SIGNATURE:
				return getNestedSignatures();
			case UML2Package.REDEFINABLE_TEMPLATE_SIGNATURE__NESTING_SIGNATURE:
				if (resolve) return getNestingSignature();
				return basicGetNestingSignature();
			case UML2Package.REDEFINABLE_TEMPLATE_SIGNATURE__TEMPLATE:
				return getTemplate();
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
			case UML2Package.REDEFINABLE_TEMPLATE_SIGNATURE__EANNOTATIONS:
				getEAnnotations().clear();
				getEAnnotations().addAll((Collection)newValue);
				return;
			case UML2Package.REDEFINABLE_TEMPLATE_SIGNATURE__OWNED_COMMENT:
				getOwnedComments().clear();
				getOwnedComments().addAll((Collection)newValue);
				return;
			case UML2Package.REDEFINABLE_TEMPLATE_SIGNATURE__TEMPLATE_BINDING:
				getTemplateBindings().clear();
				getTemplateBindings().addAll((Collection)newValue);
				return;
			case UML2Package.REDEFINABLE_TEMPLATE_SIGNATURE__OWNED_TEMPLATE_SIGNATURE:
				setOwnedTemplateSignature((TemplateSignature)newValue);
				return;
			case UML2Package.REDEFINABLE_TEMPLATE_SIGNATURE__NAME:
				setName((String)newValue);
				return;
			case UML2Package.REDEFINABLE_TEMPLATE_SIGNATURE__VISIBILITY:
				setVisibility((VisibilityKind)newValue);
				return;
			case UML2Package.REDEFINABLE_TEMPLATE_SIGNATURE__CLIENT_DEPENDENCY:
				getClientDependencies().clear();
				getClientDependencies().addAll((Collection)newValue);
				return;
			case UML2Package.REDEFINABLE_TEMPLATE_SIGNATURE__NAME_EXPRESSION:
				setNameExpression((StringExpression)newValue);
				return;
			case UML2Package.REDEFINABLE_TEMPLATE_SIGNATURE__IS_LEAF:
				setIsLeaf(((Boolean)newValue).booleanValue());
				return;
			case UML2Package.REDEFINABLE_TEMPLATE_SIGNATURE__PARAMETER:
				getParameters().clear();
				getParameters().addAll((Collection)newValue);
				return;
			case UML2Package.REDEFINABLE_TEMPLATE_SIGNATURE__OWNED_PARAMETER:
				getOwnedParameters().clear();
				getOwnedParameters().addAll((Collection)newValue);
				return;
			case UML2Package.REDEFINABLE_TEMPLATE_SIGNATURE__NESTED_SIGNATURE:
				getNestedSignatures().clear();
				getNestedSignatures().addAll((Collection)newValue);
				return;
			case UML2Package.REDEFINABLE_TEMPLATE_SIGNATURE__NESTING_SIGNATURE:
				setNestingSignature((TemplateSignature)newValue);
				return;
			case UML2Package.REDEFINABLE_TEMPLATE_SIGNATURE__TEMPLATE:
				setTemplate((TemplateableElement)newValue);
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
			case UML2Package.REDEFINABLE_TEMPLATE_SIGNATURE__EANNOTATIONS:
				getEAnnotations().clear();
				return;
			case UML2Package.REDEFINABLE_TEMPLATE_SIGNATURE__OWNED_COMMENT:
				getOwnedComments().clear();
				return;
			case UML2Package.REDEFINABLE_TEMPLATE_SIGNATURE__TEMPLATE_BINDING:
				getTemplateBindings().clear();
				return;
			case UML2Package.REDEFINABLE_TEMPLATE_SIGNATURE__OWNED_TEMPLATE_SIGNATURE:
				setOwnedTemplateSignature((TemplateSignature)null);
				return;
			case UML2Package.REDEFINABLE_TEMPLATE_SIGNATURE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case UML2Package.REDEFINABLE_TEMPLATE_SIGNATURE__VISIBILITY:
				setVisibility(VISIBILITY_EDEFAULT);
				return;
			case UML2Package.REDEFINABLE_TEMPLATE_SIGNATURE__CLIENT_DEPENDENCY:
				getClientDependencies().clear();
				return;
			case UML2Package.REDEFINABLE_TEMPLATE_SIGNATURE__NAME_EXPRESSION:
				setNameExpression((StringExpression)null);
				return;
			case UML2Package.REDEFINABLE_TEMPLATE_SIGNATURE__IS_LEAF:
				setIsLeaf(IS_LEAF_EDEFAULT);
				return;
			case UML2Package.REDEFINABLE_TEMPLATE_SIGNATURE__PARAMETER:
				getParameters().clear();
				return;
			case UML2Package.REDEFINABLE_TEMPLATE_SIGNATURE__OWNED_PARAMETER:
				getOwnedParameters().clear();
				return;
			case UML2Package.REDEFINABLE_TEMPLATE_SIGNATURE__NESTED_SIGNATURE:
				getNestedSignatures().clear();
				return;
			case UML2Package.REDEFINABLE_TEMPLATE_SIGNATURE__NESTING_SIGNATURE:
				setNestingSignature((TemplateSignature)null);
				return;
			case UML2Package.REDEFINABLE_TEMPLATE_SIGNATURE__TEMPLATE:
				setTemplate((TemplateableElement)null);
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
			case UML2Package.REDEFINABLE_TEMPLATE_SIGNATURE__EANNOTATIONS:
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UML2Package.REDEFINABLE_TEMPLATE_SIGNATURE__OWNED_ELEMENT:
				return !getOwnedElements().isEmpty();
			case UML2Package.REDEFINABLE_TEMPLATE_SIGNATURE__OWNER:
				return basicGetOwner() != null;
			case UML2Package.REDEFINABLE_TEMPLATE_SIGNATURE__OWNED_COMMENT:
				return ownedComment != null && !ownedComment.isEmpty();
			case UML2Package.REDEFINABLE_TEMPLATE_SIGNATURE__TEMPLATE_BINDING:
				return templateBinding != null && !templateBinding.isEmpty();
			case UML2Package.REDEFINABLE_TEMPLATE_SIGNATURE__OWNED_TEMPLATE_SIGNATURE:
				return ownedTemplateSignature != null;
			case UML2Package.REDEFINABLE_TEMPLATE_SIGNATURE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case UML2Package.REDEFINABLE_TEMPLATE_SIGNATURE__QUALIFIED_NAME:
				return QUALIFIED_NAME_EDEFAULT == null ? getQualifiedName() != null : !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case UML2Package.REDEFINABLE_TEMPLATE_SIGNATURE__VISIBILITY:
				return visibility != VISIBILITY_EDEFAULT;
			case UML2Package.REDEFINABLE_TEMPLATE_SIGNATURE__CLIENT_DEPENDENCY:
				return clientDependency != null && !clientDependency.isEmpty();
			case UML2Package.REDEFINABLE_TEMPLATE_SIGNATURE__NAME_EXPRESSION:
				return nameExpression != null;
			case UML2Package.REDEFINABLE_TEMPLATE_SIGNATURE__REDEFINITION_CONTEXT:
				return !getRedefinitionContexts().isEmpty();
			case UML2Package.REDEFINABLE_TEMPLATE_SIGNATURE__IS_LEAF:
				return isLeaf != IS_LEAF_EDEFAULT;
			case UML2Package.REDEFINABLE_TEMPLATE_SIGNATURE__PARAMETER:
				return parameter != null && !parameter.isEmpty();
			case UML2Package.REDEFINABLE_TEMPLATE_SIGNATURE__OWNED_PARAMETER:
				return ownedParameter != null && !ownedParameter.isEmpty();
			case UML2Package.REDEFINABLE_TEMPLATE_SIGNATURE__NESTED_SIGNATURE:
				return nestedSignature != null && !nestedSignature.isEmpty();
			case UML2Package.REDEFINABLE_TEMPLATE_SIGNATURE__NESTING_SIGNATURE:
				return nestingSignature != null;
			case UML2Package.REDEFINABLE_TEMPLATE_SIGNATURE__TEMPLATE:
				return getTemplate() != null;
		}
		return eDynamicIsSet(eFeature);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class baseClass) {
		if (baseClass == TemplateSignature.class) {
			switch (derivedFeatureID) {
				case UML2Package.REDEFINABLE_TEMPLATE_SIGNATURE__PARAMETER: return UML2Package.TEMPLATE_SIGNATURE__PARAMETER;
				case UML2Package.REDEFINABLE_TEMPLATE_SIGNATURE__OWNED_PARAMETER: return UML2Package.TEMPLATE_SIGNATURE__OWNED_PARAMETER;
				case UML2Package.REDEFINABLE_TEMPLATE_SIGNATURE__NESTED_SIGNATURE: return UML2Package.TEMPLATE_SIGNATURE__NESTED_SIGNATURE;
				case UML2Package.REDEFINABLE_TEMPLATE_SIGNATURE__NESTING_SIGNATURE: return UML2Package.TEMPLATE_SIGNATURE__NESTING_SIGNATURE;
				case UML2Package.REDEFINABLE_TEMPLATE_SIGNATURE__TEMPLATE: return UML2Package.TEMPLATE_SIGNATURE__TEMPLATE;
				default: return -1;
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
		if (baseClass == TemplateSignature.class) {
			switch (baseFeatureID) {
				case UML2Package.TEMPLATE_SIGNATURE__PARAMETER: return UML2Package.REDEFINABLE_TEMPLATE_SIGNATURE__PARAMETER;
				case UML2Package.TEMPLATE_SIGNATURE__OWNED_PARAMETER: return UML2Package.REDEFINABLE_TEMPLATE_SIGNATURE__OWNED_PARAMETER;
				case UML2Package.TEMPLATE_SIGNATURE__NESTED_SIGNATURE: return UML2Package.REDEFINABLE_TEMPLATE_SIGNATURE__NESTED_SIGNATURE;
				case UML2Package.TEMPLATE_SIGNATURE__NESTING_SIGNATURE: return UML2Package.REDEFINABLE_TEMPLATE_SIGNATURE__NESTING_SIGNATURE;
				case UML2Package.TEMPLATE_SIGNATURE__TEMPLATE: return UML2Package.REDEFINABLE_TEMPLATE_SIGNATURE__TEMPLATE;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //RedefinableTemplateSignatureImpl
