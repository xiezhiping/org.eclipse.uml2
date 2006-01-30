/*
 * Copyright (c) 2005, 2006 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *
 * $Id: ClassifierTemplateParameterImpl.java,v 1.10 2006/01/30 23:06:54 khussey Exp $
 */
package org.eclipse.uml2.uml.internal.impl;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.ClassifierTemplateParameter;
import org.eclipse.uml2.uml.ParameterableElement;
import org.eclipse.uml2.uml.TemplateSignature;
import org.eclipse.uml2.uml.UMLPackage;

import org.eclipse.uml2.uml.internal.operations.ClassifierTemplateParameterOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Classifier Template Parameter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ClassifierTemplateParameterImpl#isAllowSubstitutable <em>Allow Substitutable</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ClassifierTemplateParameterImpl#getDefaultClassifier <em>Default Classifier</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ClassifierTemplateParameterImpl#getConstrainingClassifier <em>Constraining Classifier</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ClassifierTemplateParameterImpl#getParameteredElement <em>Parametered Element</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ClassifierTemplateParameterImpl
		extends TemplateParameterImpl
		implements ClassifierTemplateParameter {

	/**
	 * The default value of the '{@link #isAllowSubstitutable() <em>Allow Substitutable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAllowSubstitutable()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ALLOW_SUBSTITUTABLE_EDEFAULT = false;

	/**
	 * The flag representing the value of the '{@link #isAllowSubstitutable() <em>Allow Substitutable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAllowSubstitutable()
	 * @generated
	 * @ordered
	 */
	protected static final int ALLOW_SUBSTITUTABLE_EFLAG = 1 << 8;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClassifierTemplateParameterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return UMLPackage.Literals.CLASSIFIER_TEMPLATE_PARAMETER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAllowSubstitutable() {
		return (eFlags & ALLOW_SUBSTITUTABLE_EFLAG) != 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAllowSubstitutable(boolean newAllowSubstitutable) {
		boolean oldAllowSubstitutable = (eFlags & ALLOW_SUBSTITUTABLE_EFLAG) != 0;
		if (newAllowSubstitutable)
			eFlags |= ALLOW_SUBSTITUTABLE_EFLAG;
		else
			eFlags &= ~ALLOW_SUBSTITUTABLE_EFLAG;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.CLASSIFIER_TEMPLATE_PARAMETER__ALLOW_SUBSTITUTABLE,
				oldAllowSubstitutable, newAllowSubstitutable));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Classifier getDefaultClassifier() {
		Classifier defaultClassifier = (Classifier) eVirtualGet(UMLPackage.CLASSIFIER_TEMPLATE_PARAMETER__DEFAULT_CLASSIFIER);
		if (defaultClassifier != null && defaultClassifier.eIsProxy()) {
			InternalEObject oldDefaultClassifier = (InternalEObject) defaultClassifier;
			defaultClassifier = (Classifier) eResolveProxy(oldDefaultClassifier);
			if (defaultClassifier != oldDefaultClassifier) {
				eVirtualSet(
					UMLPackage.CLASSIFIER_TEMPLATE_PARAMETER__DEFAULT_CLASSIFIER,
					defaultClassifier);
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(
						this,
						Notification.RESOLVE,
						UMLPackage.CLASSIFIER_TEMPLATE_PARAMETER__DEFAULT_CLASSIFIER,
						oldDefaultClassifier, defaultClassifier));
			}
		}
		return defaultClassifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Classifier basicGetDefaultClassifier() {
		return (Classifier) eVirtualGet(UMLPackage.CLASSIFIER_TEMPLATE_PARAMETER__DEFAULT_CLASSIFIER);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefaultClassifier(Classifier newDefaultClassifier) {
		Classifier defaultClassifier = newDefaultClassifier;
		Object oldDefaultClassifier = eVirtualSet(
			UMLPackage.CLASSIFIER_TEMPLATE_PARAMETER__DEFAULT_CLASSIFIER,
			defaultClassifier);
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.CLASSIFIER_TEMPLATE_PARAMETER__DEFAULT_CLASSIFIER,
				oldDefaultClassifier == EVIRTUAL_NO_VALUE
					? null
					: oldDefaultClassifier, defaultClassifier));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Classifier getConstrainingClassifier() {
		Classifier constrainingClassifier = (Classifier) eVirtualGet(UMLPackage.CLASSIFIER_TEMPLATE_PARAMETER__CONSTRAINING_CLASSIFIER);
		if (constrainingClassifier != null && constrainingClassifier.eIsProxy()) {
			InternalEObject oldConstrainingClassifier = (InternalEObject) constrainingClassifier;
			constrainingClassifier = (Classifier) eResolveProxy(oldConstrainingClassifier);
			if (constrainingClassifier != oldConstrainingClassifier) {
				eVirtualSet(
					UMLPackage.CLASSIFIER_TEMPLATE_PARAMETER__CONSTRAINING_CLASSIFIER,
					constrainingClassifier);
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(
						this,
						Notification.RESOLVE,
						UMLPackage.CLASSIFIER_TEMPLATE_PARAMETER__CONSTRAINING_CLASSIFIER,
						oldConstrainingClassifier, constrainingClassifier));
			}
		}
		return constrainingClassifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Classifier basicGetConstrainingClassifier() {
		return (Classifier) eVirtualGet(UMLPackage.CLASSIFIER_TEMPLATE_PARAMETER__CONSTRAINING_CLASSIFIER);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConstrainingClassifier(Classifier newConstrainingClassifier) {
		Classifier constrainingClassifier = newConstrainingClassifier;
		Object oldConstrainingClassifier = eVirtualSet(
			UMLPackage.CLASSIFIER_TEMPLATE_PARAMETER__CONSTRAINING_CLASSIFIER,
			constrainingClassifier);
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(
				this,
				Notification.SET,
				UMLPackage.CLASSIFIER_TEMPLATE_PARAMETER__CONSTRAINING_CLASSIFIER,
				oldConstrainingClassifier == EVIRTUAL_NO_VALUE
					? null
					: oldConstrainingClassifier, constrainingClassifier));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterableElement getParameteredElement() {
		ParameterableElement parameteredElement = (ParameterableElement) eVirtualGet(UMLPackage.CLASSIFIER_TEMPLATE_PARAMETER__PARAMETERED_ELEMENT);
		if (parameteredElement != null && parameteredElement.eIsProxy()) {
			InternalEObject oldParameteredElement = (InternalEObject) parameteredElement;
			parameteredElement = (ParameterableElement) eResolveProxy(oldParameteredElement);
			if (parameteredElement != oldParameteredElement) {
				eVirtualSet(
					UMLPackage.CLASSIFIER_TEMPLATE_PARAMETER__PARAMETERED_ELEMENT,
					parameteredElement);
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(
						this,
						Notification.RESOLVE,
						UMLPackage.CLASSIFIER_TEMPLATE_PARAMETER__PARAMETERED_ELEMENT,
						oldParameteredElement, parameteredElement));
			}
		}
		return parameteredElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterableElement basicGetParameteredElement() {
		return (ParameterableElement) eVirtualGet(UMLPackage.CLASSIFIER_TEMPLATE_PARAMETER__PARAMETERED_ELEMENT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public NotificationChain basicSetParameteredElement(
			ParameterableElement newParameteredElement, NotificationChain msgs) {
		Object oldParameteredElement = eVirtualSet(
			UMLPackage.CLASSIFIER_TEMPLATE_PARAMETER__PARAMETERED_ELEMENT,
			newParameteredElement);
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
				Notification.SET,
				UMLPackage.CLASSIFIER_TEMPLATE_PARAMETER__PARAMETERED_ELEMENT,
				oldParameteredElement == EVIRTUAL_NO_VALUE
					? null
					: oldParameteredElement, newParameteredElement);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}

		if (eVirtualGet(UMLPackage.CLASSIFIER_TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT) != null
			&& eVirtualGet(UMLPackage.CLASSIFIER_TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT) != newParameteredElement) {
			setOwnedParameteredElement(null);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParameteredElement(ParameterableElement newParameteredElement) {
		ParameterableElement parameteredElement = (ParameterableElement) eVirtualGet(UMLPackage.CLASSIFIER_TEMPLATE_PARAMETER__PARAMETERED_ELEMENT);
		if (newParameteredElement != parameteredElement) {
			NotificationChain msgs = null;
			if (parameteredElement != null)
				msgs = ((InternalEObject) parameteredElement).eInverseRemove(
					this, UMLPackage.PARAMETERABLE_ELEMENT__TEMPLATE_PARAMETER,
					ParameterableElement.class, msgs);
			if (newParameteredElement != null)
				msgs = ((InternalEObject) newParameteredElement).eInverseAdd(
					this, UMLPackage.PARAMETERABLE_ELEMENT__TEMPLATE_PARAMETER,
					ParameterableElement.class, msgs);
			msgs = basicSetParameteredElement(newParameteredElement, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.CLASSIFIER_TEMPLATE_PARAMETER__PARAMETERED_ELEMENT,
				newParameteredElement, newParameteredElement));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetParameteredElement() {
		return eVirtualGet(UMLPackage.CLASSIFIER_TEMPLATE_PARAMETER__PARAMETERED_ELEMENT) != null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHasConstrainingClassifier(
			DiagnosticChain diagnostics, Map context) {
		return ClassifierTemplateParameterOperations
			.validateHasConstrainingClassifier(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UMLPackage.CLASSIFIER_TEMPLATE_PARAMETER__EANNOTATIONS :
				return getEAnnotations();
			case UMLPackage.CLASSIFIER_TEMPLATE_PARAMETER__OWNED_ELEMENT :
				return getOwnedElements();
			case UMLPackage.CLASSIFIER_TEMPLATE_PARAMETER__OWNER :
				if (resolve)
					return getOwner();
				return basicGetOwner();
			case UMLPackage.CLASSIFIER_TEMPLATE_PARAMETER__OWNED_COMMENT :
				return getOwnedComments();
			case UMLPackage.CLASSIFIER_TEMPLATE_PARAMETER__SIGNATURE :
				return getSignature();
			case UMLPackage.CLASSIFIER_TEMPLATE_PARAMETER__PARAMETERED_ELEMENT :
				if (resolve)
					return getParameteredElement();
				return basicGetParameteredElement();
			case UMLPackage.CLASSIFIER_TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT :
				return getOwnedParameteredElement();
			case UMLPackage.CLASSIFIER_TEMPLATE_PARAMETER__DEFAULT :
				if (resolve)
					return getDefault();
				return basicGetDefault();
			case UMLPackage.CLASSIFIER_TEMPLATE_PARAMETER__OWNED_DEFAULT :
				return getOwnedDefault();
			case UMLPackage.CLASSIFIER_TEMPLATE_PARAMETER__ALLOW_SUBSTITUTABLE :
				return isAllowSubstitutable()
					? Boolean.TRUE
					: Boolean.FALSE;
			case UMLPackage.CLASSIFIER_TEMPLATE_PARAMETER__DEFAULT_CLASSIFIER :
				if (resolve)
					return getDefaultClassifier();
				return basicGetDefaultClassifier();
			case UMLPackage.CLASSIFIER_TEMPLATE_PARAMETER__CONSTRAINING_CLASSIFIER :
				if (resolve)
					return getConstrainingClassifier();
				return basicGetConstrainingClassifier();
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
			case UMLPackage.CLASSIFIER_TEMPLATE_PARAMETER__EANNOTATIONS :
				getEAnnotations().clear();
				getEAnnotations().addAll((Collection) newValue);
				return;
			case UMLPackage.CLASSIFIER_TEMPLATE_PARAMETER__OWNED_COMMENT :
				getOwnedComments().clear();
				getOwnedComments().addAll((Collection) newValue);
				return;
			case UMLPackage.CLASSIFIER_TEMPLATE_PARAMETER__SIGNATURE :
				setSignature((TemplateSignature) newValue);
				return;
			case UMLPackage.CLASSIFIER_TEMPLATE_PARAMETER__PARAMETERED_ELEMENT :
				setParameteredElement((ParameterableElement) newValue);
				return;
			case UMLPackage.CLASSIFIER_TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT :
				setOwnedParameteredElement((ParameterableElement) newValue);
				return;
			case UMLPackage.CLASSIFIER_TEMPLATE_PARAMETER__DEFAULT :
				setDefault((ParameterableElement) newValue);
				return;
			case UMLPackage.CLASSIFIER_TEMPLATE_PARAMETER__OWNED_DEFAULT :
				setOwnedDefault((ParameterableElement) newValue);
				return;
			case UMLPackage.CLASSIFIER_TEMPLATE_PARAMETER__ALLOW_SUBSTITUTABLE :
				setAllowSubstitutable(((Boolean) newValue).booleanValue());
				return;
			case UMLPackage.CLASSIFIER_TEMPLATE_PARAMETER__DEFAULT_CLASSIFIER :
				setDefaultClassifier((Classifier) newValue);
				return;
			case UMLPackage.CLASSIFIER_TEMPLATE_PARAMETER__CONSTRAINING_CLASSIFIER :
				setConstrainingClassifier((Classifier) newValue);
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
			case UMLPackage.CLASSIFIER_TEMPLATE_PARAMETER__EANNOTATIONS :
				getEAnnotations().clear();
				return;
			case UMLPackage.CLASSIFIER_TEMPLATE_PARAMETER__OWNED_COMMENT :
				getOwnedComments().clear();
				return;
			case UMLPackage.CLASSIFIER_TEMPLATE_PARAMETER__SIGNATURE :
				setSignature((TemplateSignature) null);
				return;
			case UMLPackage.CLASSIFIER_TEMPLATE_PARAMETER__PARAMETERED_ELEMENT :
				setParameteredElement((ParameterableElement) null);
				return;
			case UMLPackage.CLASSIFIER_TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT :
				setOwnedParameteredElement((ParameterableElement) null);
				return;
			case UMLPackage.CLASSIFIER_TEMPLATE_PARAMETER__DEFAULT :
				setDefault((ParameterableElement) null);
				return;
			case UMLPackage.CLASSIFIER_TEMPLATE_PARAMETER__OWNED_DEFAULT :
				setOwnedDefault((ParameterableElement) null);
				return;
			case UMLPackage.CLASSIFIER_TEMPLATE_PARAMETER__ALLOW_SUBSTITUTABLE :
				setAllowSubstitutable(ALLOW_SUBSTITUTABLE_EDEFAULT);
				return;
			case UMLPackage.CLASSIFIER_TEMPLATE_PARAMETER__DEFAULT_CLASSIFIER :
				setDefaultClassifier((Classifier) null);
				return;
			case UMLPackage.CLASSIFIER_TEMPLATE_PARAMETER__CONSTRAINING_CLASSIFIER :
				setConstrainingClassifier((Classifier) null);
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
			case UMLPackage.CLASSIFIER_TEMPLATE_PARAMETER__EANNOTATIONS :
				EList eAnnotations = (EList) eVirtualGet(UMLPackage.CLASSIFIER_TEMPLATE_PARAMETER__EANNOTATIONS);
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UMLPackage.CLASSIFIER_TEMPLATE_PARAMETER__OWNED_ELEMENT :
				return isSetOwnedElements();
			case UMLPackage.CLASSIFIER_TEMPLATE_PARAMETER__OWNER :
				return isSetOwner();
			case UMLPackage.CLASSIFIER_TEMPLATE_PARAMETER__OWNED_COMMENT :
				EList ownedComment = (EList) eVirtualGet(UMLPackage.CLASSIFIER_TEMPLATE_PARAMETER__OWNED_COMMENT);
				return ownedComment != null && !ownedComment.isEmpty();
			case UMLPackage.CLASSIFIER_TEMPLATE_PARAMETER__SIGNATURE :
				return getSignature() != null;
			case UMLPackage.CLASSIFIER_TEMPLATE_PARAMETER__PARAMETERED_ELEMENT :
				return isSetParameteredElement();
			case UMLPackage.CLASSIFIER_TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT :
				return eVirtualGet(UMLPackage.CLASSIFIER_TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT) != null;
			case UMLPackage.CLASSIFIER_TEMPLATE_PARAMETER__DEFAULT :
				return eVirtualGet(UMLPackage.CLASSIFIER_TEMPLATE_PARAMETER__DEFAULT) != null;
			case UMLPackage.CLASSIFIER_TEMPLATE_PARAMETER__OWNED_DEFAULT :
				return eVirtualGet(UMLPackage.CLASSIFIER_TEMPLATE_PARAMETER__OWNED_DEFAULT) != null;
			case UMLPackage.CLASSIFIER_TEMPLATE_PARAMETER__ALLOW_SUBSTITUTABLE :
				return ((eFlags & ALLOW_SUBSTITUTABLE_EFLAG) != 0) != ALLOW_SUBSTITUTABLE_EDEFAULT;
			case UMLPackage.CLASSIFIER_TEMPLATE_PARAMETER__DEFAULT_CLASSIFIER :
				return eVirtualGet(UMLPackage.CLASSIFIER_TEMPLATE_PARAMETER__DEFAULT_CLASSIFIER) != null;
			case UMLPackage.CLASSIFIER_TEMPLATE_PARAMETER__CONSTRAINING_CLASSIFIER :
				return eVirtualGet(UMLPackage.CLASSIFIER_TEMPLATE_PARAMETER__CONSTRAINING_CLASSIFIER) != null;
		}
		return eDynamicIsSet(featureID);
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
		result.append(" (allowSubstitutable: "); //$NON-NLS-1$
		result.append((eFlags & ALLOW_SUBSTITUTABLE_EFLAG) != 0);
		result.append(')');
		return result.toString();
	}

} //ClassifierTemplateParameterImpl
