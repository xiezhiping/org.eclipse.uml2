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
 *   Kenn Hussey (CEA) - 327039, 351774, 212765, 418466, 451350, 485756
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
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.ClassifierTemplateParameter;
import org.eclipse.uml2.uml.Comment;
import org.eclipse.uml2.uml.ParameterableElement;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.TemplateSignature;
import org.eclipse.uml2.uml.UMLPackage;

import org.eclipse.uml2.uml.internal.operations.ClassifierTemplateParameterOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Classifier Template Parameter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ClassifierTemplateParameterImpl#isAllowSubstitutable <em>Allow Substitutable</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ClassifierTemplateParameterImpl#getConstrainingClassifiers <em>Constraining Classifier</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ClassifierTemplateParameterImpl#getParameteredElement <em>Parametered Element</em>}</li>
 * </ul>
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
	protected static final boolean ALLOW_SUBSTITUTABLE_EDEFAULT = true;

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
	 * The cached value of the '{@link #getConstrainingClassifiers() <em>Constraining Classifier</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstrainingClassifiers()
	 * @generated
	 * @ordered
	 */
	protected EList<Classifier> constrainingClassifiers;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClassifierTemplateParameterImpl() {
		super();
		eFlags |= ALLOW_SUBSTITUTABLE_EFLAG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
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
		boolean oldAllowSubstitutable = (eFlags
			& ALLOW_SUBSTITUTABLE_EFLAG) != 0;
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
	public EList<Classifier> getConstrainingClassifiers() {
		if (constrainingClassifiers == null) {
			constrainingClassifiers = new EObjectResolvingEList<Classifier>(
				Classifier.class, this,
				UMLPackage.CLASSIFIER_TEMPLATE_PARAMETER__CONSTRAINING_CLASSIFIER);
		}
		return constrainingClassifiers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Classifier getConstrainingClassifier(String name) {
		return getConstrainingClassifier(name, false, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Classifier getConstrainingClassifier(String name, boolean ignoreCase,
			EClass eClass) {
		constrainingClassifierLoop : for (Classifier constrainingClassifier : getConstrainingClassifiers()) {
			if (eClass != null && !eClass.isInstance(constrainingClassifier))
				continue constrainingClassifierLoop;
			if (name != null && !(ignoreCase
				? name.equalsIgnoreCase(constrainingClassifier.getName())
				: name.equals(constrainingClassifier.getName())))
				continue constrainingClassifierLoop;
			return constrainingClassifier;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ParameterableElement getParameteredElement() {
		if (parameteredElement != null && parameteredElement.eIsProxy()) {
			InternalEObject oldParameteredElement = (InternalEObject) parameteredElement;
			parameteredElement = (ParameterableElement) eResolveProxy(
				oldParameteredElement);
			if (parameteredElement != oldParameteredElement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
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
	@Override
	public ParameterableElement basicGetParameteredElement() {
		return parameteredElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParameteredElementGen(
			ParameterableElement newParameteredElement,
			NotificationChain msgs) {
		if (newParameteredElement != null
			&& !(newParameteredElement instanceof Classifier)) {
			throw new IllegalArgumentException(
				"newParameteredElement must be an instance of Classifier"); //$NON-NLS-1$
		}
		ParameterableElement oldParameteredElement = parameteredElement;
		parameteredElement = newParameteredElement;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
				Notification.SET,
				UMLPackage.CLASSIFIER_TEMPLATE_PARAMETER__PARAMETERED_ELEMENT,
				oldParameteredElement, newParameteredElement);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	@Override
	public NotificationChain basicSetParameteredElement(
			ParameterableElement newParameteredElement,
			NotificationChain msgs) {
		msgs = basicSetParameteredElementGen(newParameteredElement, msgs);

		Resource.Internal eInternalResource = eInternalResource();

		if (eInternalResource == null || !eInternalResource.isLoading()) {

			if (ownedParameteredElement != null
				&& ownedParameteredElement != newParameteredElement) {

				setOwnedParameteredElement(null);
			}
		}

		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setParameteredElement(
			ParameterableElement newParameteredElement) {
		if (newParameteredElement != null
			&& !(newParameteredElement instanceof Classifier)) {
			throw new IllegalArgumentException(
				"newParameteredElement must be an instance of Classifier"); //$NON-NLS-1$
		}
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
		return parameteredElement != null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHasConstrainingClassifier(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ClassifierTemplateParameterOperations
			.validateHasConstrainingClassifier(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateParameteredElementNoFeatures(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ClassifierTemplateParameterOperations
			.validateParameteredElementNoFeatures(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMatchingAbstract(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ClassifierTemplateParameterOperations
			.validateMatchingAbstract(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateActualIsClassifier(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ClassifierTemplateParameterOperations
			.validateActualIsClassifier(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConstrainingClassifiersConstrainArgs(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ClassifierTemplateParameterOperations
			.validateConstrainingClassifiersConstrainArgs(this, diagnostics,
				context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConstrainingClassifiersConstrainParameteredElement(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ClassifierTemplateParameterOperations
			.validateConstrainingClassifiersConstrainParameteredElement(this,
				diagnostics, context);
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
			case UMLPackage.CLASSIFIER_TEMPLATE_PARAMETER__EANNOTATIONS :
				return ((InternalEList<InternalEObject>) (InternalEList<?>) getEAnnotations())
					.basicAdd(otherEnd, msgs);
			case UMLPackage.CLASSIFIER_TEMPLATE_PARAMETER__PARAMETERED_ELEMENT :
				if (parameteredElement != null)
					msgs = ((InternalEObject) parameteredElement)
						.eInverseRemove(this,
							UMLPackage.PARAMETERABLE_ELEMENT__TEMPLATE_PARAMETER,
							ParameterableElement.class, msgs);
				return basicSetParameteredElement(
					(ParameterableElement) otherEnd, msgs);
			case UMLPackage.CLASSIFIER_TEMPLATE_PARAMETER__SIGNATURE :
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetSignature((TemplateSignature) otherEnd, msgs);
			case UMLPackage.CLASSIFIER_TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT :
				if (ownedParameteredElement != null)
					msgs = ((InternalEObject) ownedParameteredElement)
						.eInverseRemove(this,
							EOPPOSITE_FEATURE_BASE
								- UMLPackage.CLASSIFIER_TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT,
							null, msgs);
				return basicSetOwnedParameteredElement(
					(ParameterableElement) otherEnd, msgs);
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
			case UMLPackage.CLASSIFIER_TEMPLATE_PARAMETER__EANNOTATIONS :
				return ((InternalEList<?>) getEAnnotations())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.CLASSIFIER_TEMPLATE_PARAMETER__OWNED_COMMENT :
				return ((InternalEList<?>) getOwnedComments())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.CLASSIFIER_TEMPLATE_PARAMETER__OWNED_DEFAULT :
				return basicSetOwnedDefault(null, msgs);
			case UMLPackage.CLASSIFIER_TEMPLATE_PARAMETER__PARAMETERED_ELEMENT :
				return basicSetParameteredElement(null, msgs);
			case UMLPackage.CLASSIFIER_TEMPLATE_PARAMETER__SIGNATURE :
				return basicSetSignature(null, msgs);
			case UMLPackage.CLASSIFIER_TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT :
				return basicSetOwnedParameteredElement(null, msgs);
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
			case UMLPackage.CLASSIFIER_TEMPLATE_PARAMETER__EANNOTATIONS :
				return getEAnnotations();
			case UMLPackage.CLASSIFIER_TEMPLATE_PARAMETER__OWNED_COMMENT :
				return getOwnedComments();
			case UMLPackage.CLASSIFIER_TEMPLATE_PARAMETER__OWNED_ELEMENT :
				return getOwnedElements();
			case UMLPackage.CLASSIFIER_TEMPLATE_PARAMETER__OWNER :
				if (resolve)
					return getOwner();
				return basicGetOwner();
			case UMLPackage.CLASSIFIER_TEMPLATE_PARAMETER__DEFAULT :
				if (resolve)
					return getDefault();
				return basicGetDefault();
			case UMLPackage.CLASSIFIER_TEMPLATE_PARAMETER__OWNED_DEFAULT :
				if (resolve)
					return getOwnedDefault();
				return basicGetOwnedDefault();
			case UMLPackage.CLASSIFIER_TEMPLATE_PARAMETER__PARAMETERED_ELEMENT :
				if (resolve)
					return getParameteredElement();
				return basicGetParameteredElement();
			case UMLPackage.CLASSIFIER_TEMPLATE_PARAMETER__SIGNATURE :
				if (resolve)
					return getSignature();
				return basicGetSignature();
			case UMLPackage.CLASSIFIER_TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT :
				if (resolve)
					return getOwnedParameteredElement();
				return basicGetOwnedParameteredElement();
			case UMLPackage.CLASSIFIER_TEMPLATE_PARAMETER__ALLOW_SUBSTITUTABLE :
				return isAllowSubstitutable();
			case UMLPackage.CLASSIFIER_TEMPLATE_PARAMETER__CONSTRAINING_CLASSIFIER :
				return getConstrainingClassifiers();
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
			case UMLPackage.CLASSIFIER_TEMPLATE_PARAMETER__EANNOTATIONS :
				getEAnnotations().clear();
				getEAnnotations()
					.addAll((Collection<? extends EAnnotation>) newValue);
				return;
			case UMLPackage.CLASSIFIER_TEMPLATE_PARAMETER__OWNED_COMMENT :
				getOwnedComments().clear();
				getOwnedComments()
					.addAll((Collection<? extends Comment>) newValue);
				return;
			case UMLPackage.CLASSIFIER_TEMPLATE_PARAMETER__DEFAULT :
				setDefault((ParameterableElement) newValue);
				return;
			case UMLPackage.CLASSIFIER_TEMPLATE_PARAMETER__OWNED_DEFAULT :
				setOwnedDefault((ParameterableElement) newValue);
				return;
			case UMLPackage.CLASSIFIER_TEMPLATE_PARAMETER__PARAMETERED_ELEMENT :
				setParameteredElement((ParameterableElement) newValue);
				return;
			case UMLPackage.CLASSIFIER_TEMPLATE_PARAMETER__SIGNATURE :
				setSignature((TemplateSignature) newValue);
				return;
			case UMLPackage.CLASSIFIER_TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT :
				setOwnedParameteredElement((ParameterableElement) newValue);
				return;
			case UMLPackage.CLASSIFIER_TEMPLATE_PARAMETER__ALLOW_SUBSTITUTABLE :
				setAllowSubstitutable((Boolean) newValue);
				return;
			case UMLPackage.CLASSIFIER_TEMPLATE_PARAMETER__CONSTRAINING_CLASSIFIER :
				getConstrainingClassifiers().clear();
				getConstrainingClassifiers()
					.addAll((Collection<? extends Classifier>) newValue);
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
			case UMLPackage.CLASSIFIER_TEMPLATE_PARAMETER__EANNOTATIONS :
				getEAnnotations().clear();
				return;
			case UMLPackage.CLASSIFIER_TEMPLATE_PARAMETER__OWNED_COMMENT :
				getOwnedComments().clear();
				return;
			case UMLPackage.CLASSIFIER_TEMPLATE_PARAMETER__DEFAULT :
				setDefault((ParameterableElement) null);
				return;
			case UMLPackage.CLASSIFIER_TEMPLATE_PARAMETER__OWNED_DEFAULT :
				setOwnedDefault((ParameterableElement) null);
				return;
			case UMLPackage.CLASSIFIER_TEMPLATE_PARAMETER__PARAMETERED_ELEMENT :
				setParameteredElement((ParameterableElement) null);
				return;
			case UMLPackage.CLASSIFIER_TEMPLATE_PARAMETER__SIGNATURE :
				setSignature((TemplateSignature) null);
				return;
			case UMLPackage.CLASSIFIER_TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT :
				setOwnedParameteredElement((ParameterableElement) null);
				return;
			case UMLPackage.CLASSIFIER_TEMPLATE_PARAMETER__ALLOW_SUBSTITUTABLE :
				setAllowSubstitutable(ALLOW_SUBSTITUTABLE_EDEFAULT);
				return;
			case UMLPackage.CLASSIFIER_TEMPLATE_PARAMETER__CONSTRAINING_CLASSIFIER :
				getConstrainingClassifiers().clear();
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
			case UMLPackage.CLASSIFIER_TEMPLATE_PARAMETER__EANNOTATIONS :
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UMLPackage.CLASSIFIER_TEMPLATE_PARAMETER__OWNED_COMMENT :
				return ownedComments != null && !ownedComments.isEmpty();
			case UMLPackage.CLASSIFIER_TEMPLATE_PARAMETER__OWNED_ELEMENT :
				return isSetOwnedElements();
			case UMLPackage.CLASSIFIER_TEMPLATE_PARAMETER__OWNER :
				return isSetOwner();
			case UMLPackage.CLASSIFIER_TEMPLATE_PARAMETER__DEFAULT :
				return default_ != null;
			case UMLPackage.CLASSIFIER_TEMPLATE_PARAMETER__OWNED_DEFAULT :
				return ownedDefault != null;
			case UMLPackage.CLASSIFIER_TEMPLATE_PARAMETER__PARAMETERED_ELEMENT :
				return isSetParameteredElement();
			case UMLPackage.CLASSIFIER_TEMPLATE_PARAMETER__SIGNATURE :
				return basicGetSignature() != null;
			case UMLPackage.CLASSIFIER_TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT :
				return ownedParameteredElement != null;
			case UMLPackage.CLASSIFIER_TEMPLATE_PARAMETER__ALLOW_SUBSTITUTABLE :
				return ((eFlags
					& ALLOW_SUBSTITUTABLE_EFLAG) != 0) != ALLOW_SUBSTITUTABLE_EDEFAULT;
			case UMLPackage.CLASSIFIER_TEMPLATE_PARAMETER__CONSTRAINING_CLASSIFIER :
				return constrainingClassifiers != null
					&& !constrainingClassifiers.isEmpty();
		}
		return eDynamicIsSet(featureID);
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
			case UMLPackage.CLASSIFIER_TEMPLATE_PARAMETER___GET_EANNOTATION__STRING :
				return getEAnnotation((String) arguments.get(0));
			case UMLPackage.CLASSIFIER_TEMPLATE_PARAMETER___VALIDATE_HAS_OWNER__DIAGNOSTICCHAIN_MAP :
				return validateHasOwner((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.CLASSIFIER_TEMPLATE_PARAMETER___VALIDATE_NOT_OWN_SELF__DIAGNOSTICCHAIN_MAP :
				return validateNotOwnSelf((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.CLASSIFIER_TEMPLATE_PARAMETER___ADD_KEYWORD__STRING :
				return addKeyword((String) arguments.get(0));
			case UMLPackage.CLASSIFIER_TEMPLATE_PARAMETER___APPLY_STEREOTYPE__STEREOTYPE :
				return applyStereotype((Stereotype) arguments.get(0));
			case UMLPackage.CLASSIFIER_TEMPLATE_PARAMETER___CREATE_EANNOTATION__STRING :
				return createEAnnotation((String) arguments.get(0));
			case UMLPackage.CLASSIFIER_TEMPLATE_PARAMETER___DESTROY :
				destroy();
				return null;
			case UMLPackage.CLASSIFIER_TEMPLATE_PARAMETER___GET_KEYWORDS :
				return getKeywords();
			case UMLPackage.CLASSIFIER_TEMPLATE_PARAMETER___GET_APPLICABLE_STEREOTYPE__STRING :
				return getApplicableStereotype((String) arguments.get(0));
			case UMLPackage.CLASSIFIER_TEMPLATE_PARAMETER___GET_APPLICABLE_STEREOTYPES :
				return getApplicableStereotypes();
			case UMLPackage.CLASSIFIER_TEMPLATE_PARAMETER___GET_APPLIED_STEREOTYPE__STRING :
				return getAppliedStereotype((String) arguments.get(0));
			case UMLPackage.CLASSIFIER_TEMPLATE_PARAMETER___GET_APPLIED_STEREOTYPES :
				return getAppliedStereotypes();
			case UMLPackage.CLASSIFIER_TEMPLATE_PARAMETER___GET_APPLIED_SUBSTEREOTYPE__STEREOTYPE_STRING :
				return getAppliedSubstereotype((Stereotype) arguments.get(0),
					(String) arguments.get(1));
			case UMLPackage.CLASSIFIER_TEMPLATE_PARAMETER___GET_APPLIED_SUBSTEREOTYPES__STEREOTYPE :
				return getAppliedSubstereotypes((Stereotype) arguments.get(0));
			case UMLPackage.CLASSIFIER_TEMPLATE_PARAMETER___GET_MODEL :
				return getModel();
			case UMLPackage.CLASSIFIER_TEMPLATE_PARAMETER___GET_NEAREST_PACKAGE :
				return getNearestPackage();
			case UMLPackage.CLASSIFIER_TEMPLATE_PARAMETER___GET_RELATIONSHIPS :
				return getRelationships();
			case UMLPackage.CLASSIFIER_TEMPLATE_PARAMETER___GET_RELATIONSHIPS__ECLASS :
				return getRelationships((EClass) arguments.get(0));
			case UMLPackage.CLASSIFIER_TEMPLATE_PARAMETER___GET_REQUIRED_STEREOTYPE__STRING :
				return getRequiredStereotype((String) arguments.get(0));
			case UMLPackage.CLASSIFIER_TEMPLATE_PARAMETER___GET_REQUIRED_STEREOTYPES :
				return getRequiredStereotypes();
			case UMLPackage.CLASSIFIER_TEMPLATE_PARAMETER___GET_SOURCE_DIRECTED_RELATIONSHIPS :
				return getSourceDirectedRelationships();
			case UMLPackage.CLASSIFIER_TEMPLATE_PARAMETER___GET_SOURCE_DIRECTED_RELATIONSHIPS__ECLASS :
				return getSourceDirectedRelationships(
					(EClass) arguments.get(0));
			case UMLPackage.CLASSIFIER_TEMPLATE_PARAMETER___GET_STEREOTYPE_APPLICATION__STEREOTYPE :
				return getStereotypeApplication((Stereotype) arguments.get(0));
			case UMLPackage.CLASSIFIER_TEMPLATE_PARAMETER___GET_STEREOTYPE_APPLICATIONS :
				return getStereotypeApplications();
			case UMLPackage.CLASSIFIER_TEMPLATE_PARAMETER___GET_TARGET_DIRECTED_RELATIONSHIPS :
				return getTargetDirectedRelationships();
			case UMLPackage.CLASSIFIER_TEMPLATE_PARAMETER___GET_TARGET_DIRECTED_RELATIONSHIPS__ECLASS :
				return getTargetDirectedRelationships(
					(EClass) arguments.get(0));
			case UMLPackage.CLASSIFIER_TEMPLATE_PARAMETER___GET_VALUE__STEREOTYPE_STRING :
				return getValue((Stereotype) arguments.get(0),
					(String) arguments.get(1));
			case UMLPackage.CLASSIFIER_TEMPLATE_PARAMETER___HAS_KEYWORD__STRING :
				return hasKeyword((String) arguments.get(0));
			case UMLPackage.CLASSIFIER_TEMPLATE_PARAMETER___HAS_VALUE__STEREOTYPE_STRING :
				return hasValue((Stereotype) arguments.get(0),
					(String) arguments.get(1));
			case UMLPackage.CLASSIFIER_TEMPLATE_PARAMETER___IS_STEREOTYPE_APPLICABLE__STEREOTYPE :
				return isStereotypeApplicable((Stereotype) arguments.get(0));
			case UMLPackage.CLASSIFIER_TEMPLATE_PARAMETER___IS_STEREOTYPE_APPLIED__STEREOTYPE :
				return isStereotypeApplied((Stereotype) arguments.get(0));
			case UMLPackage.CLASSIFIER_TEMPLATE_PARAMETER___IS_STEREOTYPE_REQUIRED__STEREOTYPE :
				return isStereotypeRequired((Stereotype) arguments.get(0));
			case UMLPackage.CLASSIFIER_TEMPLATE_PARAMETER___REMOVE_KEYWORD__STRING :
				return removeKeyword((String) arguments.get(0));
			case UMLPackage.CLASSIFIER_TEMPLATE_PARAMETER___SET_VALUE__STEREOTYPE_STRING_OBJECT :
				setValue((Stereotype) arguments.get(0),
					(String) arguments.get(1), arguments.get(2));
				return null;
			case UMLPackage.CLASSIFIER_TEMPLATE_PARAMETER___UNAPPLY_STEREOTYPE__STEREOTYPE :
				return unapplyStereotype((Stereotype) arguments.get(0));
			case UMLPackage.CLASSIFIER_TEMPLATE_PARAMETER___ALL_OWNED_ELEMENTS :
				return allOwnedElements();
			case UMLPackage.CLASSIFIER_TEMPLATE_PARAMETER___MUST_BE_OWNED :
				return mustBeOwned();
			case UMLPackage.CLASSIFIER_TEMPLATE_PARAMETER___VALIDATE_MUST_BE_COMPATIBLE__DIAGNOSTICCHAIN_MAP :
				return validateMustBeCompatible(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.CLASSIFIER_TEMPLATE_PARAMETER___VALIDATE_HAS_CONSTRAINING_CLASSIFIER__DIAGNOSTICCHAIN_MAP :
				return validateHasConstrainingClassifier(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.CLASSIFIER_TEMPLATE_PARAMETER___VALIDATE_PARAMETERED_ELEMENT_NO_FEATURES__DIAGNOSTICCHAIN_MAP :
				return validateParameteredElementNoFeatures(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.CLASSIFIER_TEMPLATE_PARAMETER___VALIDATE_MATCHING_ABSTRACT__DIAGNOSTICCHAIN_MAP :
				return validateMatchingAbstract(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.CLASSIFIER_TEMPLATE_PARAMETER___VALIDATE_ACTUAL_IS_CLASSIFIER__DIAGNOSTICCHAIN_MAP :
				return validateActualIsClassifier(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.CLASSIFIER_TEMPLATE_PARAMETER___VALIDATE_CONSTRAINING_CLASSIFIERS_CONSTRAIN_ARGS__DIAGNOSTICCHAIN_MAP :
				return validateConstrainingClassifiersConstrainArgs(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.CLASSIFIER_TEMPLATE_PARAMETER___VALIDATE_CONSTRAINING_CLASSIFIERS_CONSTRAIN_PARAMETERED_ELEMENT__DIAGNOSTICCHAIN_MAP :
				return validateConstrainingClassifiersConstrainParameteredElement(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
		}
		return eDynamicInvoke(operationID, arguments);
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
		result.append(" (allowSubstitutable: "); //$NON-NLS-1$
		result.append((eFlags & ALLOW_SUBSTITUTABLE_EFLAG) != 0);
		result.append(')');
		return result.toString();
	}

} //ClassifierTemplateParameterImpl
