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
 * $Id: TemplateBindingImpl.java,v 1.6 2004/06/02 05:02:25 khussey Exp $
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
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.uml2.Element;
import org.eclipse.uml2.TemplateBinding;
import org.eclipse.uml2.TemplateParameterSubstitution;
import org.eclipse.uml2.TemplateSignature;
import org.eclipse.uml2.TemplateableElement;
import org.eclipse.uml2.UML2Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Template Binding</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2.impl.TemplateBindingImpl#getBoundElement <em>Bound Element</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.TemplateBindingImpl#getSignature <em>Signature</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.TemplateBindingImpl#getParameterSubstitutions <em>Parameter Substitution</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TemplateBindingImpl extends DirectedRelationshipImpl implements TemplateBinding {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2003, 2004 IBM Corporation and others."; //$NON-NLS-1$

	/**
	 * The cached value of the '{@link #getSignature() <em>Signature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSignature()
	 * @generated
	 * @ordered
	 */
	protected TemplateSignature signature = null;

	/**
	 * The cached value of the '{@link #getParameterSubstitutions() <em>Parameter Substitution</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameterSubstitutions()
	 * @generated
	 * @ordered
	 */
	protected EList parameterSubstitution = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TemplateBindingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return UML2Package.eINSTANCE.getTemplateBinding();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemplateableElement getBoundElement() {
		if (eContainerFeatureID != UML2Package.TEMPLATE_BINDING__BOUND_ELEMENT) return null;
		return (TemplateableElement)eContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBoundElement(TemplateableElement newBoundElement) {
		if (newBoundElement != eContainer || (eContainerFeatureID != UML2Package.TEMPLATE_BINDING__BOUND_ELEMENT && newBoundElement != null)) {
			if (EcoreUtil.isAncestor(this, newBoundElement))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString()); //$NON-NLS-1$
			NotificationChain msgs = null;
			if (eContainer != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newBoundElement != null)
				msgs = ((InternalEObject)newBoundElement).eInverseAdd(this, UML2Package.TEMPLATEABLE_ELEMENT__TEMPLATE_BINDING, TemplateableElement.class, msgs);
			msgs = eBasicSetContainer((InternalEObject)newBoundElement, UML2Package.TEMPLATE_BINDING__BOUND_ELEMENT, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2Package.TEMPLATE_BINDING__BOUND_ELEMENT, newBoundElement, newBoundElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemplateSignature getSignature() {
		if (signature != null && signature.eIsProxy()) {
			TemplateSignature oldSignature = signature;
			signature = (TemplateSignature)eResolveProxy((InternalEObject)signature);
			if (signature != oldSignature) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UML2Package.TEMPLATE_BINDING__SIGNATURE, oldSignature, signature));
			}
		}
		return signature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemplateSignature basicGetSignature() {
		return signature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSignature(TemplateSignature newSignature) {
		TemplateSignature oldSignature = signature;
		signature = newSignature;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2Package.TEMPLATE_BINDING__SIGNATURE, oldSignature, signature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getParameterSubstitutions() {
		if (parameterSubstitution == null) {
			parameterSubstitution = new EObjectContainmentWithInverseEList(TemplateParameterSubstitution.class, this, UML2Package.TEMPLATE_BINDING__PARAMETER_SUBSTITUTION, UML2Package.TEMPLATE_PARAMETER_SUBSTITUTION__TEMPLATE_BINDING);
		}
		return parameterSubstitution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemplateParameterSubstitution createParameterSubstitution(EClass eClass) {
		TemplateParameterSubstitution newParameterSubstitution = (TemplateParameterSubstitution) eClass.getEPackage().getEFactoryInstance().create(eClass);
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, 0, UML2Package.TEMPLATE_BINDING__PARAMETER_SUBSTITUTION, null, newParameterSubstitution));
		}
		getParameterSubstitutions().add(newParameterSubstitution);
		return newParameterSubstitution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Element basicGetOwner() {
		if (null != getBoundElement()) {
			return (Element) getBoundElement();
		}
		return super.basicGetOwner();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getSources() {
		EList source = (EList) getCacheAdapter().get(this, UML2Package.eINSTANCE.getDirectedRelationship_Source());

		if (null == source) {
			Set union = new LinkedHashSet();
			union.addAll(super.getSources());
			if (null != getBoundElement()) {
				union.add(getBoundElement());
			}

			source = new EcoreEList.UnmodifiableEList(this, UML2Package.eINSTANCE.getDirectedRelationship_Source(), union.size(), union.toArray());
			getCacheAdapter().put(this, UML2Package.eINSTANCE.getDirectedRelationship_Source(), source);
		}

		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getTargets() {
		EList target = (EList) getCacheAdapter().get(this, UML2Package.eINSTANCE.getDirectedRelationship_Target());

		if (null == target) {
			Set union = new LinkedHashSet();
			union.addAll(super.getTargets());
			if (null != getSignature()) {
				union.add(getSignature());
			}

			target = new EcoreEList.UnmodifiableEList(this, UML2Package.eINSTANCE.getDirectedRelationship_Target(), union.size(), union.toArray());
			getCacheAdapter().put(this, UML2Package.eINSTANCE.getDirectedRelationship_Target(), target);
		}

		return target;
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
			union.addAll(getParameterSubstitutions());

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
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, Class baseClass, NotificationChain msgs) {
		if (featureID >= 0) {
			switch (eDerivedStructuralFeatureID(featureID, baseClass)) {
				case UML2Package.TEMPLATE_BINDING__EANNOTATIONS:
					return ((InternalEList)getEAnnotations()).basicAdd(otherEnd, msgs);
				case UML2Package.TEMPLATE_BINDING__BOUND_ELEMENT:
					if (eContainer != null)
						msgs = eBasicRemoveFromContainer(msgs);
					return eBasicSetContainer(otherEnd, UML2Package.TEMPLATE_BINDING__BOUND_ELEMENT, msgs);
				case UML2Package.TEMPLATE_BINDING__PARAMETER_SUBSTITUTION:
					return ((InternalEList)getParameterSubstitutions()).basicAdd(otherEnd, msgs);
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
				case UML2Package.TEMPLATE_BINDING__EANNOTATIONS:
					return ((InternalEList)getEAnnotations()).basicRemove(otherEnd, msgs);
				case UML2Package.TEMPLATE_BINDING__OWNED_COMMENT:
					return ((InternalEList)getOwnedComments()).basicRemove(otherEnd, msgs);
				case UML2Package.TEMPLATE_BINDING__BOUND_ELEMENT:
					return eBasicSetContainer(null, UML2Package.TEMPLATE_BINDING__BOUND_ELEMENT, msgs);
				case UML2Package.TEMPLATE_BINDING__PARAMETER_SUBSTITUTION:
					return ((InternalEList)getParameterSubstitutions()).basicRemove(otherEnd, msgs);
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
				case UML2Package.TEMPLATE_BINDING__BOUND_ELEMENT:
					return eContainer.eInverseRemove(this, UML2Package.TEMPLATEABLE_ELEMENT__TEMPLATE_BINDING, TemplateableElement.class, msgs);
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
			case UML2Package.TEMPLATE_BINDING__EANNOTATIONS:
				return getEAnnotations();
			case UML2Package.TEMPLATE_BINDING__OWNED_ELEMENT:
				return getOwnedElements();
			case UML2Package.TEMPLATE_BINDING__OWNER:
				if (resolve) return getOwner();
				return basicGetOwner();
			case UML2Package.TEMPLATE_BINDING__OWNED_COMMENT:
				return getOwnedComments();
			case UML2Package.TEMPLATE_BINDING__RELATED_ELEMENT:
				return getRelatedElements();
			case UML2Package.TEMPLATE_BINDING__SOURCE:
				return getSources();
			case UML2Package.TEMPLATE_BINDING__TARGET:
				return getTargets();
			case UML2Package.TEMPLATE_BINDING__BOUND_ELEMENT:
				return getBoundElement();
			case UML2Package.TEMPLATE_BINDING__SIGNATURE:
				if (resolve) return getSignature();
				return basicGetSignature();
			case UML2Package.TEMPLATE_BINDING__PARAMETER_SUBSTITUTION:
				return getParameterSubstitutions();
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
			case UML2Package.TEMPLATE_BINDING__EANNOTATIONS:
				getEAnnotations().clear();
				getEAnnotations().addAll((Collection)newValue);
				return;
			case UML2Package.TEMPLATE_BINDING__OWNED_COMMENT:
				getOwnedComments().clear();
				getOwnedComments().addAll((Collection)newValue);
				return;
			case UML2Package.TEMPLATE_BINDING__BOUND_ELEMENT:
				setBoundElement((TemplateableElement)newValue);
				return;
			case UML2Package.TEMPLATE_BINDING__SIGNATURE:
				setSignature((TemplateSignature)newValue);
				return;
			case UML2Package.TEMPLATE_BINDING__PARAMETER_SUBSTITUTION:
				getParameterSubstitutions().clear();
				getParameterSubstitutions().addAll((Collection)newValue);
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
			case UML2Package.TEMPLATE_BINDING__EANNOTATIONS:
				getEAnnotations().clear();
				return;
			case UML2Package.TEMPLATE_BINDING__OWNED_COMMENT:
				getOwnedComments().clear();
				return;
			case UML2Package.TEMPLATE_BINDING__BOUND_ELEMENT:
				setBoundElement((TemplateableElement)null);
				return;
			case UML2Package.TEMPLATE_BINDING__SIGNATURE:
				setSignature((TemplateSignature)null);
				return;
			case UML2Package.TEMPLATE_BINDING__PARAMETER_SUBSTITUTION:
				getParameterSubstitutions().clear();
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
			case UML2Package.TEMPLATE_BINDING__EANNOTATIONS:
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UML2Package.TEMPLATE_BINDING__OWNED_ELEMENT:
				return !getOwnedElements().isEmpty();
			case UML2Package.TEMPLATE_BINDING__OWNER:
				return basicGetOwner() != null;
			case UML2Package.TEMPLATE_BINDING__OWNED_COMMENT:
				return ownedComment != null && !ownedComment.isEmpty();
			case UML2Package.TEMPLATE_BINDING__RELATED_ELEMENT:
				return !getRelatedElements().isEmpty();
			case UML2Package.TEMPLATE_BINDING__SOURCE:
				return !getSources().isEmpty();
			case UML2Package.TEMPLATE_BINDING__TARGET:
				return !getTargets().isEmpty();
			case UML2Package.TEMPLATE_BINDING__BOUND_ELEMENT:
				return getBoundElement() != null;
			case UML2Package.TEMPLATE_BINDING__SIGNATURE:
				return signature != null;
			case UML2Package.TEMPLATE_BINDING__PARAMETER_SUBSTITUTION:
				return parameterSubstitution != null && !parameterSubstitution.isEmpty();
		}
		return eDynamicIsSet(eFeature);
	}

} //TemplateBindingImpl
