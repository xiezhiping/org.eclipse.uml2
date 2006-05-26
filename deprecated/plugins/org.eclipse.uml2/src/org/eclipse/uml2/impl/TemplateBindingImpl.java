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
 * $Id: TemplateBindingImpl.java,v 1.23 2006/05/26 18:16:42 khussey Exp $
 */
package org.eclipse.uml2.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.uml2.Element;
import org.eclipse.uml2.TemplateBinding;
import org.eclipse.uml2.TemplateParameterSubstitution;
import org.eclipse.uml2.TemplateSignature;
import org.eclipse.uml2.TemplateableElement;
import org.eclipse.uml2.UML2Factory;
import org.eclipse.uml2.UML2Package;

import org.eclipse.uml2.common.util.CacheAdapter;
import org.eclipse.uml2.common.util.DerivedUnionEObjectEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Template Binding</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2.impl.TemplateBindingImpl#getOwner <em>Owner</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.TemplateBindingImpl#getSources <em>Source</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.TemplateBindingImpl#getTargets <em>Target</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.TemplateBindingImpl#getOwnedElements <em>Owned Element</em>}</li>
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
	public static final String copyright = "Copyright (c) IBM Corporation and others."; //$NON-NLS-1$

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
	protected EList parameterSubstitutions = null;

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
		return UML2Package.Literals.TEMPLATE_BINDING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Element getOwner() {
		Element owner = basicGetOwner();
		return owner != null && owner.eIsProxy() ? (Element)eResolveProxy((InternalEObject)owner) : owner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getSources() {
		CacheAdapter cache = getCacheAdapter();
		if (cache != null) {
			Resource eResource = eResource();
			EList sources = (EList) cache.get(eResource, this, UML2Package.Literals.DIRECTED_RELATIONSHIP__SOURCE);
			if (sources == null) {
				cache.put(eResource, this, UML2Package.Literals.DIRECTED_RELATIONSHIP__SOURCE, sources = new DerivedUnionEObjectEList(Element.class, this, UML2Package.TEMPLATE_BINDING__SOURCE, SOURCE_ESUBSETS));
			}
			return sources;
		}
		return new DerivedUnionEObjectEList(Element.class, this, UML2Package.TEMPLATE_BINDING__SOURCE, SOURCE_ESUBSETS);
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSources() {
		return super.isSetSources()
			|| eIsSet(UML2Package.TEMPLATE_BINDING__BOUND_ELEMENT);
	}

	/**
	 * The array of subset feature identifiers for the '{@link #getSources() <em>Source</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSources()
	 * @generated
	 * @ordered
	 */
	protected static final int[] SOURCE_ESUBSETS = new int[] {UML2Package.TEMPLATE_BINDING__BOUND_ELEMENT};

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getTargets() {
		CacheAdapter cache = getCacheAdapter();
		if (cache != null) {
			Resource eResource = eResource();
			EList targets = (EList) cache.get(eResource, this, UML2Package.Literals.DIRECTED_RELATIONSHIP__TARGET);
			if (targets == null) {
				cache.put(eResource, this, UML2Package.Literals.DIRECTED_RELATIONSHIP__TARGET, targets = new DerivedUnionEObjectEList(Element.class, this, UML2Package.TEMPLATE_BINDING__TARGET, TARGET_ESUBSETS));
			}
			return targets;
		}
		return new DerivedUnionEObjectEList(Element.class, this, UML2Package.TEMPLATE_BINDING__TARGET, TARGET_ESUBSETS);
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTargets() {
		return super.isSetTargets()
			|| eIsSet(UML2Package.TEMPLATE_BINDING__SIGNATURE);
	}

	/**
	 * The array of subset feature identifiers for the '{@link #getTargets() <em>Target</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargets()
	 * @generated
	 * @ordered
	 */
	protected static final int[] TARGET_ESUBSETS = new int[] {UML2Package.TEMPLATE_BINDING__SIGNATURE};

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
				cache.put(eResource, this, UML2Package.Literals.ELEMENT__OWNED_ELEMENT, ownedElements = new DerivedUnionEObjectEList(Element.class, this, UML2Package.TEMPLATE_BINDING__OWNED_ELEMENT, OWNED_ELEMENT_ESUBSETS));
			}
			return ownedElements;
		}
		return new DerivedUnionEObjectEList(Element.class, this, UML2Package.TEMPLATE_BINDING__OWNED_ELEMENT, OWNED_ELEMENT_ESUBSETS);
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOwnedElements() {
		return super.isSetOwnedElements()
			|| eIsSet(UML2Package.TEMPLATE_BINDING__PARAMETER_SUBSTITUTION);
	}

	/**
	 * The array of subset feature identifiers for the '{@link #getOwnedElements() <em>Owned Element</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedElements()
	 * @generated
	 * @ordered
	 */
	protected static final int[] OWNED_ELEMENT_ESUBSETS = new int[] {UML2Package.TEMPLATE_BINDING__OWNED_COMMENT, UML2Package.TEMPLATE_BINDING__PARAMETER_SUBSTITUTION};

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemplateableElement getBoundElement() {
		if (eContainerFeatureID != UML2Package.TEMPLATE_BINDING__BOUND_ELEMENT) return null;
		return (TemplateableElement)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBoundElement(TemplateableElement newBoundElement, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newBoundElement, UML2Package.TEMPLATE_BINDING__BOUND_ELEMENT, msgs);

		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBoundElement(TemplateableElement newBoundElement) {
		if (newBoundElement != eInternalContainer() || (eContainerFeatureID != UML2Package.TEMPLATE_BINDING__BOUND_ELEMENT && newBoundElement != null)) {
			if (EcoreUtil.isAncestor(this, newBoundElement))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString()); //$NON-NLS-1$
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newBoundElement != null)
				msgs = ((InternalEObject)newBoundElement).eInverseAdd(this, UML2Package.TEMPLATEABLE_ELEMENT__TEMPLATE_BINDING, TemplateableElement.class, msgs);
			msgs = basicSetBoundElement(newBoundElement, msgs);
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
			InternalEObject oldSignature = (InternalEObject)signature;
			signature = (TemplateSignature)eResolveProxy(oldSignature);
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
		if (parameterSubstitutions == null) {
			parameterSubstitutions = new EObjectContainmentWithInverseEList(TemplateParameterSubstitution.class, this, UML2Package.TEMPLATE_BINDING__PARAMETER_SUBSTITUTION, UML2Package.TEMPLATE_PARAMETER_SUBSTITUTION__TEMPLATE_BINDING);
		}
		return parameterSubstitutions;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 * @deprecated Use #createParameterSubstitution() instead.
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
	 * @generated NOT
	 */
	public TemplateParameterSubstitution createParameterSubstitution() {
		TemplateParameterSubstitution newParameterSubstitution = UML2Factory.eINSTANCE.createTemplateParameterSubstitution();
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
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UML2Package.TEMPLATE_BINDING__EANNOTATIONS:
				return ((InternalEList)getEAnnotations()).basicAdd(otherEnd, msgs);
			case UML2Package.TEMPLATE_BINDING__BOUND_ELEMENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetBoundElement((TemplateableElement)otherEnd, msgs);
			case UML2Package.TEMPLATE_BINDING__PARAMETER_SUBSTITUTION:
				return ((InternalEList)getParameterSubstitutions()).basicAdd(otherEnd, msgs);
		}
		return eDynamicInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UML2Package.TEMPLATE_BINDING__EANNOTATIONS:
				return ((InternalEList)getEAnnotations()).basicRemove(otherEnd, msgs);
			case UML2Package.TEMPLATE_BINDING__OWNED_COMMENT:
				return ((InternalEList)getOwnedComments()).basicRemove(otherEnd, msgs);
			case UML2Package.TEMPLATE_BINDING__BOUND_ELEMENT:
				return basicSetBoundElement(null, msgs);
			case UML2Package.TEMPLATE_BINDING__PARAMETER_SUBSTITUTION:
				return ((InternalEList)getParameterSubstitutions()).basicRemove(otherEnd, msgs);
		}
		return eDynamicInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID) {
			case UML2Package.TEMPLATE_BINDING__BOUND_ELEMENT:
				return eInternalContainer().eInverseRemove(this, UML2Package.TEMPLATEABLE_ELEMENT__TEMPLATE_BINDING, TemplateableElement.class, msgs);
		}
		return eDynamicBasicRemoveFromContainer(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Element basicGetOwner() {
		TemplateableElement boundElement = getBoundElement();			
		if (boundElement != null) {
			return boundElement;
		}
		return super.basicGetOwner();
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOwner() {
		return super.isSetOwner()
			|| eIsSet(UML2Package.TEMPLATE_BINDING__BOUND_ELEMENT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
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
		return eDynamicGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
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
		eDynamicSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eUnset(int featureID) {
		switch (featureID) {
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
		eDynamicUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case UML2Package.TEMPLATE_BINDING__EANNOTATIONS:
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UML2Package.TEMPLATE_BINDING__OWNED_ELEMENT:
				return isSetOwnedElements();
			case UML2Package.TEMPLATE_BINDING__OWNER:
				return isSetOwner();
			case UML2Package.TEMPLATE_BINDING__OWNED_COMMENT:
				return ownedComments != null && !ownedComments.isEmpty();
			case UML2Package.TEMPLATE_BINDING__RELATED_ELEMENT:
				return isSetRelatedElements();
			case UML2Package.TEMPLATE_BINDING__SOURCE:
				return isSetSources();
			case UML2Package.TEMPLATE_BINDING__TARGET:
				return isSetTargets();
			case UML2Package.TEMPLATE_BINDING__BOUND_ELEMENT:
				return getBoundElement() != null;
			case UML2Package.TEMPLATE_BINDING__SIGNATURE:
				return signature != null;
			case UML2Package.TEMPLATE_BINDING__PARAMETER_SUBSTITUTION:
				return parameterSubstitutions != null && !parameterSubstitutions.isEmpty();
		}
		return eDynamicIsSet(featureID);
	}


} //TemplateBindingImpl
