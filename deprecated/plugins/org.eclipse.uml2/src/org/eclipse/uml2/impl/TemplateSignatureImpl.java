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
 * $Id: TemplateSignatureImpl.java,v 1.21 2006/04/10 20:40:19 khussey Exp $
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

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.uml2.Element;
import org.eclipse.uml2.TemplateParameter;
import org.eclipse.uml2.TemplateSignature;
import org.eclipse.uml2.TemplateableElement;
import org.eclipse.uml2.UML2Factory;
import org.eclipse.uml2.UML2Package;

import org.eclipse.uml2.common.util.CacheAdapter;
import org.eclipse.uml2.common.util.DerivedUnionEObjectEList;
import org.eclipse.uml2.common.util.SubsetSupersetEObjectContainmentWithInverseEList;
import org.eclipse.uml2.common.util.SubsetSupersetEObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Template Signature</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2.impl.TemplateSignatureImpl#getParameters <em>Parameter</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.TemplateSignatureImpl#getOwnedParameters <em>Owned Parameter</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.TemplateSignatureImpl#getNestedSignatures <em>Nested Signature</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.TemplateSignatureImpl#getNestingSignature <em>Nesting Signature</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.TemplateSignatureImpl#getTemplate <em>Template</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TemplateSignatureImpl extends ElementImpl implements TemplateSignature {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) IBM Corporation and others."; //$NON-NLS-1$

	/**
	 * The cached value of the '{@link #getParameters() <em>Parameter</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameters()
	 * @generated
	 * @ordered
	 */
	protected EList parameters = null;

	/**
	 * The cached value of the '{@link #getOwnedParameters() <em>Owned Parameter</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedParameters()
	 * @generated
	 * @ordered
	 */
	protected EList ownedParameters = null;

	/**
	 * The cached value of the '{@link #getNestedSignatures() <em>Nested Signature</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNestedSignatures()
	 * @generated
	 * @ordered
	 */
	protected EList nestedSignatures = null;

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
	protected TemplateSignatureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return UML2Package.Literals.TEMPLATE_SIGNATURE;
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
				cache.put(eResource, this, UML2Package.Literals.ELEMENT__OWNED_ELEMENT, ownedElements = new DerivedUnionEObjectEList(Element.class, this, UML2Package.TEMPLATE_SIGNATURE__OWNED_ELEMENT, OWNED_ELEMENT_ESUBSETS));
			}
			return ownedElements;
		}
		return new DerivedUnionEObjectEList(Element.class, this, UML2Package.TEMPLATE_SIGNATURE__OWNED_ELEMENT, OWNED_ELEMENT_ESUBSETS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOwnedElements() {
		return super.isSetOwnedElements()
			|| eIsSet(UML2Package.TEMPLATE_SIGNATURE__OWNED_PARAMETER);
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getParameters() {
		if (parameters == null) {
			parameters = new SubsetSupersetEObjectResolvingEList(TemplateParameter.class, this, UML2Package.TEMPLATE_SIGNATURE__PARAMETER, null, PARAMETER_ESUBSETS);
		}
		return parameters;
	}


	/**
	 * The array of subset feature identifiers for the '{@link #getParameters() <em>Parameter</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameters()
	 * @generated
	 * @ordered
	 */
	protected static final int[] PARAMETER_ESUBSETS = new int[] {UML2Package.TEMPLATE_SIGNATURE__OWNED_PARAMETER};

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getOwnedParameters() {
		if (ownedParameters == null) {
			ownedParameters = new SubsetSupersetEObjectContainmentWithInverseEList(TemplateParameter.class, this, UML2Package.TEMPLATE_SIGNATURE__OWNED_PARAMETER, OWNED_PARAMETER_ESUPERSETS, null, UML2Package.TEMPLATE_PARAMETER__SIGNATURE);
		}
		return ownedParameters;
	}


	/**
	 * The array of superset feature identifiers for the '{@link #getOwnedParameters() <em>Owned Parameter</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedParameters()
	 * @generated
	 * @ordered
	 */
	protected static final int[] OWNED_PARAMETER_ESUPERSETS = new int[] {UML2Package.TEMPLATE_SIGNATURE__PARAMETER};

	/**
	 * The array of subset feature identifiers for the '{@link #getOwnedElements() <em>Owned Element</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedElements()
	 * @generated
	 * @ordered
	 */
	protected static final int[] OWNED_ELEMENT_ESUBSETS = new int[] {UML2Package.TEMPLATE_SIGNATURE__OWNED_COMMENT, UML2Package.TEMPLATE_SIGNATURE__OWNED_PARAMETER};

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public TemplateParameter createOwnedParameter(EClass eClass) {
		TemplateParameter newOwnedParameter = (TemplateParameter) eClass.getEPackage().getEFactoryInstance().create(eClass);
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, 0, UML2Package.TEMPLATE_SIGNATURE__OWNED_PARAMETER, null, newOwnedParameter));
		}
		getOwnedParameters().add(newOwnedParameter);
		return newOwnedParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public TemplateParameter createOwnedParameter() {
		TemplateParameter newOwnedParameter = UML2Factory.eINSTANCE.createTemplateParameter();
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, 0, UML2Package.TEMPLATE_SIGNATURE__OWNED_PARAMETER, null, newOwnedParameter));
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
		if (nestedSignatures == null) {
			nestedSignatures = new EObjectWithInverseResolvingEList(TemplateSignature.class, this, UML2Package.TEMPLATE_SIGNATURE__NESTED_SIGNATURE, UML2Package.TEMPLATE_SIGNATURE__NESTING_SIGNATURE);
		}
		return nestedSignatures;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemplateSignature getNestingSignature() {
		if (nestingSignature != null && nestingSignature.eIsProxy()) {
			InternalEObject oldNestingSignature = (InternalEObject)nestingSignature;
			nestingSignature = (TemplateSignature)eResolveProxy(oldNestingSignature);
			if (nestingSignature != oldNestingSignature) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UML2Package.TEMPLATE_SIGNATURE__NESTING_SIGNATURE, oldNestingSignature, nestingSignature));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UML2Package.TEMPLATE_SIGNATURE__NESTING_SIGNATURE, oldNestingSignature, newNestingSignature);
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
			eNotify(new ENotificationImpl(this, Notification.SET, UML2Package.TEMPLATE_SIGNATURE__NESTING_SIGNATURE, newNestingSignature, newNestingSignature));

	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemplateableElement getTemplate() {
		if (eContainerFeatureID != UML2Package.TEMPLATE_SIGNATURE__TEMPLATE) return null;
		return (TemplateableElement)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTemplate(TemplateableElement newTemplate, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newTemplate, UML2Package.TEMPLATE_SIGNATURE__TEMPLATE, msgs);

		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTemplate(TemplateableElement newTemplate) {
		if (newTemplate != eInternalContainer() || (eContainerFeatureID != UML2Package.TEMPLATE_SIGNATURE__TEMPLATE && newTemplate != null)) {
			if (EcoreUtil.isAncestor(this, newTemplate))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString()); //$NON-NLS-1$
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newTemplate != null)
				msgs = ((InternalEObject)newTemplate).eInverseAdd(this, UML2Package.TEMPLATEABLE_ELEMENT__OWNED_TEMPLATE_SIGNATURE, TemplateableElement.class, msgs);
			msgs = basicSetTemplate(newTemplate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2Package.TEMPLATE_SIGNATURE__TEMPLATE, newTemplate, newTemplate));

	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UML2Package.TEMPLATE_SIGNATURE__EANNOTATIONS:
				return ((InternalEList)getEAnnotations()).basicAdd(otherEnd, msgs);
			case UML2Package.TEMPLATE_SIGNATURE__OWNED_PARAMETER:
				return ((InternalEList)getOwnedParameters()).basicAdd(otherEnd, msgs);
			case UML2Package.TEMPLATE_SIGNATURE__NESTED_SIGNATURE:
				return ((InternalEList)getNestedSignatures()).basicAdd(otherEnd, msgs);
			case UML2Package.TEMPLATE_SIGNATURE__NESTING_SIGNATURE:
				if (nestingSignature != null)
					msgs = ((InternalEObject)nestingSignature).eInverseRemove(this, UML2Package.TEMPLATE_SIGNATURE__NESTED_SIGNATURE, TemplateSignature.class, msgs);
				return basicSetNestingSignature((TemplateSignature)otherEnd, msgs);
			case UML2Package.TEMPLATE_SIGNATURE__TEMPLATE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetTemplate((TemplateableElement)otherEnd, msgs);
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
			case UML2Package.TEMPLATE_SIGNATURE__EANNOTATIONS:
				return ((InternalEList)getEAnnotations()).basicRemove(otherEnd, msgs);
			case UML2Package.TEMPLATE_SIGNATURE__OWNED_COMMENT:
				return ((InternalEList)getOwnedComments()).basicRemove(otherEnd, msgs);
			case UML2Package.TEMPLATE_SIGNATURE__OWNED_PARAMETER:
				return ((InternalEList)getOwnedParameters()).basicRemove(otherEnd, msgs);
			case UML2Package.TEMPLATE_SIGNATURE__NESTED_SIGNATURE:
				return ((InternalEList)getNestedSignatures()).basicRemove(otherEnd, msgs);
			case UML2Package.TEMPLATE_SIGNATURE__NESTING_SIGNATURE:
				return basicSetNestingSignature(null, msgs);
			case UML2Package.TEMPLATE_SIGNATURE__TEMPLATE:
				return basicSetTemplate(null, msgs);
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
			case UML2Package.TEMPLATE_SIGNATURE__TEMPLATE:
				return eInternalContainer().eInverseRemove(this, UML2Package.TEMPLATEABLE_ELEMENT__OWNED_TEMPLATE_SIGNATURE, TemplateableElement.class, msgs);
		}
		return eDynamicBasicRemoveFromContainer(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Element basicGetOwner() {
		TemplateableElement template = getTemplate();			
		if (template != null) {
			return template;
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
			|| eIsSet(UML2Package.TEMPLATE_SIGNATURE__TEMPLATE);
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UML2Package.TEMPLATE_SIGNATURE__EANNOTATIONS:
				return getEAnnotations();
			case UML2Package.TEMPLATE_SIGNATURE__OWNED_ELEMENT:
				return getOwnedElements();
			case UML2Package.TEMPLATE_SIGNATURE__OWNER:
				if (resolve) return getOwner();
				return basicGetOwner();
			case UML2Package.TEMPLATE_SIGNATURE__OWNED_COMMENT:
				return getOwnedComments();
			case UML2Package.TEMPLATE_SIGNATURE__PARAMETER:
				return getParameters();
			case UML2Package.TEMPLATE_SIGNATURE__OWNED_PARAMETER:
				return getOwnedParameters();
			case UML2Package.TEMPLATE_SIGNATURE__NESTED_SIGNATURE:
				return getNestedSignatures();
			case UML2Package.TEMPLATE_SIGNATURE__NESTING_SIGNATURE:
				if (resolve) return getNestingSignature();
				return basicGetNestingSignature();
			case UML2Package.TEMPLATE_SIGNATURE__TEMPLATE:
				return getTemplate();
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
			case UML2Package.TEMPLATE_SIGNATURE__EANNOTATIONS:
				getEAnnotations().clear();
				getEAnnotations().addAll((Collection)newValue);
				return;
			case UML2Package.TEMPLATE_SIGNATURE__OWNED_COMMENT:
				getOwnedComments().clear();
				getOwnedComments().addAll((Collection)newValue);
				return;
			case UML2Package.TEMPLATE_SIGNATURE__PARAMETER:
				getParameters().clear();
				getParameters().addAll((Collection)newValue);
				return;
			case UML2Package.TEMPLATE_SIGNATURE__OWNED_PARAMETER:
				getOwnedParameters().clear();
				getOwnedParameters().addAll((Collection)newValue);
				return;
			case UML2Package.TEMPLATE_SIGNATURE__NESTED_SIGNATURE:
				getNestedSignatures().clear();
				getNestedSignatures().addAll((Collection)newValue);
				return;
			case UML2Package.TEMPLATE_SIGNATURE__NESTING_SIGNATURE:
				setNestingSignature((TemplateSignature)newValue);
				return;
			case UML2Package.TEMPLATE_SIGNATURE__TEMPLATE:
				setTemplate((TemplateableElement)newValue);
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
			case UML2Package.TEMPLATE_SIGNATURE__EANNOTATIONS:
				getEAnnotations().clear();
				return;
			case UML2Package.TEMPLATE_SIGNATURE__OWNED_COMMENT:
				getOwnedComments().clear();
				return;
			case UML2Package.TEMPLATE_SIGNATURE__PARAMETER:
				getParameters().clear();
				return;
			case UML2Package.TEMPLATE_SIGNATURE__OWNED_PARAMETER:
				getOwnedParameters().clear();
				return;
			case UML2Package.TEMPLATE_SIGNATURE__NESTED_SIGNATURE:
				getNestedSignatures().clear();
				return;
			case UML2Package.TEMPLATE_SIGNATURE__NESTING_SIGNATURE:
				setNestingSignature((TemplateSignature)null);
				return;
			case UML2Package.TEMPLATE_SIGNATURE__TEMPLATE:
				setTemplate((TemplateableElement)null);
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
			case UML2Package.TEMPLATE_SIGNATURE__EANNOTATIONS:
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UML2Package.TEMPLATE_SIGNATURE__OWNED_ELEMENT:
				return isSetOwnedElements();
			case UML2Package.TEMPLATE_SIGNATURE__OWNER:
				return isSetOwner();
			case UML2Package.TEMPLATE_SIGNATURE__OWNED_COMMENT:
				return ownedComments != null && !ownedComments.isEmpty();
			case UML2Package.TEMPLATE_SIGNATURE__PARAMETER:
				return parameters != null && !parameters.isEmpty();
			case UML2Package.TEMPLATE_SIGNATURE__OWNED_PARAMETER:
				return ownedParameters != null && !ownedParameters.isEmpty();
			case UML2Package.TEMPLATE_SIGNATURE__NESTED_SIGNATURE:
				return nestedSignatures != null && !nestedSignatures.isEmpty();
			case UML2Package.TEMPLATE_SIGNATURE__NESTING_SIGNATURE:
				return nestingSignature != null;
			case UML2Package.TEMPLATE_SIGNATURE__TEMPLATE:
				return getTemplate() != null;
		}
		return eDynamicIsSet(featureID);
	}


} //TemplateSignatureImpl
