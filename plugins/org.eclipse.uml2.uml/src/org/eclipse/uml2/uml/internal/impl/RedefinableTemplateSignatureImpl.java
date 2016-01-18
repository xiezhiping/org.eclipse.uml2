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
 *   Kenn Hussey (CEA) - 327039, 351774, 386760, 212765, 418466, 451350, 485756
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
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.uml2.common.util.CacheAdapter;
import org.eclipse.uml2.common.util.DerivedUnionEObjectEList;
import org.eclipse.uml2.common.util.SubsetSupersetEObjectContainmentWithInverseEList;
import org.eclipse.uml2.common.util.SubsetSupersetEObjectResolvingEList;

import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.Comment;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Namespace;
import org.eclipse.uml2.uml.RedefinableElement;
import org.eclipse.uml2.uml.RedefinableTemplateSignature;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.StringExpression;
import org.eclipse.uml2.uml.TemplateParameter;
import org.eclipse.uml2.uml.TemplateSignature;
import org.eclipse.uml2.uml.TemplateableElement;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.VisibilityKind;

import org.eclipse.uml2.uml.internal.operations.RedefinableTemplateSignatureOperations;
import org.eclipse.uml2.uml.internal.operations.TemplateSignatureOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Redefinable Template Signature</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.RedefinableTemplateSignatureImpl#getOwner <em>Owner</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.RedefinableTemplateSignatureImpl#getOwnedElements <em>Owned Element</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.RedefinableTemplateSignatureImpl#getParameters <em>Parameter</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.RedefinableTemplateSignatureImpl#getOwnedParameters <em>Owned Parameter</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.RedefinableTemplateSignatureImpl#getRedefinedElements <em>Redefined Element</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.RedefinableTemplateSignatureImpl#getRedefinitionContexts <em>Redefinition Context</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.RedefinableTemplateSignatureImpl#getExtendedSignatures <em>Extended Signature</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.RedefinableTemplateSignatureImpl#getInheritedParameters <em>Inherited Parameter</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.RedefinableTemplateSignatureImpl#getClassifier <em>Classifier</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RedefinableTemplateSignatureImpl
		extends RedefinableElementImpl
		implements RedefinableTemplateSignature {

	/**
	 * The cached value of the '{@link #getParameters() <em>Parameter</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<TemplateParameter> parameters;

	/**
	 * The cached value of the '{@link #getOwnedParameters() <em>Owned Parameter</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<TemplateParameter> ownedParameters;

	/**
	 * The cached value of the '{@link #getExtendedSignatures() <em>Extended Signature</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtendedSignatures()
	 * @generated
	 * @ordered
	 */
	protected EList<RedefinableTemplateSignature> extendedSignatures;

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
	@Override
	protected EClass eStaticClass() {
		return UMLPackage.Literals.REDEFINABLE_TEMPLATE_SIGNATURE;
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
						UMLPackage.REDEFINABLE_TEMPLATE_SIGNATURE__OWNED_ELEMENT,
						OWNED_ELEMENT_ESUBSETS));
			}
			return ownedElements;
		}
		return new DerivedUnionEObjectEList<Element>(Element.class, this,
			UMLPackage.REDEFINABLE_TEMPLATE_SIGNATURE__OWNED_ELEMENT,
			OWNED_ELEMENT_ESUBSETS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TemplateParameter> getParameters() {
		if (parameters == null) {
			parameters = new SubsetSupersetEObjectResolvingEList<TemplateParameter>(
				TemplateParameter.class, this,
				UMLPackage.REDEFINABLE_TEMPLATE_SIGNATURE__PARAMETER, null,
				PARAMETER_ESUBSETS);
		}
		return parameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemplateableElement getTemplate() {
		return getClassifier();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemplateableElement basicGetTemplate() {
		return basicGetClassifier();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public NotificationChain basicSetTemplate(TemplateableElement newTemplate,
			NotificationChain msgs) {

		if (newTemplate != null && !(newTemplate instanceof Classifier)) {
			throw new IllegalArgumentException(
				"newTemplate must be an instance of Classifier"); //$NON-NLS-1$
		}

		return basicSetClassifier((Classifier) newTemplate, msgs);
	}

	public NotificationChain basicSetClassifier(Classifier newClassifier,
			NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newClassifier,
			UMLPackage.REDEFINABLE_TEMPLATE_SIGNATURE__CLASSIFIER, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void setTemplate(TemplateableElement newTemplate) {

		if (newTemplate != null && !(newTemplate instanceof Classifier)) {
			throw new IllegalArgumentException(
				"newTemplate must be an instance of Classifier"); //$NON-NLS-1$
		}

		if (newTemplate != eInternalContainer()
			|| (eContainerFeatureID() != UMLPackage.REDEFINABLE_TEMPLATE_SIGNATURE__TEMPLATE
				&& newTemplate != null)) {
			if (EcoreUtil.isAncestor(this, newTemplate))
				throw new IllegalArgumentException(
					"Recursive containment not allowed for " + toString()); //$NON-NLS-1$
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newTemplate != null)
				msgs = ((InternalEObject) newTemplate).eInverseAdd(this,
					UMLPackage.TEMPLATEABLE_ELEMENT__OWNED_TEMPLATE_SIGNATURE,
					TemplateableElement.class, msgs);
			msgs = basicSetTemplate(newTemplate, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.REDEFINABLE_TEMPLATE_SIGNATURE__TEMPLATE,
				newTemplate, newTemplate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTemplate() {
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TemplateParameter> getOwnedParameters() {
		if (ownedParameters == null) {
			ownedParameters = new SubsetSupersetEObjectContainmentWithInverseEList.Resolving<TemplateParameter>(
				TemplateParameter.class, this,
				UMLPackage.REDEFINABLE_TEMPLATE_SIGNATURE__OWNED_PARAMETER,
				OWNED_PARAMETER_ESUPERSETS, null,
				UMLPackage.TEMPLATE_PARAMETER__SIGNATURE);
		}
		return ownedParameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemplateParameter createOwnedParameter(EClass eClass) {
		TemplateParameter newOwnedParameter = (TemplateParameter) create(
			eClass);
		getOwnedParameters().add(newOwnedParameter);
		return newOwnedParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemplateParameter createOwnedParameter() {
		return createOwnedParameter(UMLPackage.Literals.TEMPLATE_PARAMETER);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RedefinableElement> getRedefinedElements() {
		CacheAdapter cache = getCacheAdapter();
		if (cache != null) {
			Resource eResource = eResource();
			@SuppressWarnings("unchecked")
			EList<RedefinableElement> redefinedElements = (EList<RedefinableElement>) cache
				.get(eResource, this,
					UMLPackage.Literals.REDEFINABLE_ELEMENT__REDEFINED_ELEMENT);
			if (redefinedElements == null) {
				cache.put(eResource, this,
					UMLPackage.Literals.REDEFINABLE_ELEMENT__REDEFINED_ELEMENT,
					redefinedElements = new DerivedUnionEObjectEList<RedefinableElement>(
						RedefinableElement.class, this,
						UMLPackage.REDEFINABLE_TEMPLATE_SIGNATURE__REDEFINED_ELEMENT,
						REDEFINED_ELEMENT_ESUBSETS));
			}
			return redefinedElements;
		}
		return new DerivedUnionEObjectEList<RedefinableElement>(
			RedefinableElement.class, this,
			UMLPackage.REDEFINABLE_TEMPLATE_SIGNATURE__REDEFINED_ELEMENT,
			REDEFINED_ELEMENT_ESUBSETS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Classifier> getRedefinitionContexts() {
		CacheAdapter cache = getCacheAdapter();
		if (cache != null) {
			Resource eResource = eResource();
			@SuppressWarnings("unchecked")
			EList<Classifier> redefinitionContexts = (EList<Classifier>) cache
				.get(eResource, this,
					UMLPackage.Literals.REDEFINABLE_ELEMENT__REDEFINITION_CONTEXT);
			if (redefinitionContexts == null) {
				cache.put(eResource, this,
					UMLPackage.Literals.REDEFINABLE_ELEMENT__REDEFINITION_CONTEXT,
					redefinitionContexts = new DerivedUnionEObjectEList<Classifier>(
						Classifier.class, this,
						UMLPackage.REDEFINABLE_TEMPLATE_SIGNATURE__REDEFINITION_CONTEXT,
						REDEFINITION_CONTEXT_ESUBSETS));
			}
			return redefinitionContexts;
		}
		return new DerivedUnionEObjectEList<Classifier>(Classifier.class, this,
			UMLPackage.REDEFINABLE_TEMPLATE_SIGNATURE__REDEFINITION_CONTEXT,
			REDEFINITION_CONTEXT_ESUBSETS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RedefinableTemplateSignature> getExtendedSignatures() {
		if (extendedSignatures == null) {
			extendedSignatures = new EObjectResolvingEList<RedefinableTemplateSignature>(
				RedefinableTemplateSignature.class, this,
				UMLPackage.REDEFINABLE_TEMPLATE_SIGNATURE__EXTENDED_SIGNATURE);
		}
		return extendedSignatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RedefinableTemplateSignature getExtendedSignature(String name) {
		return getExtendedSignature(name, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RedefinableTemplateSignature getExtendedSignature(String name,
			boolean ignoreCase) {
		extendedSignatureLoop : for (RedefinableTemplateSignature extendedSignature : getExtendedSignatures()) {
			if (name != null && !(ignoreCase
				? name.equalsIgnoreCase(extendedSignature.getName())
				: name.equals(extendedSignature.getName())))
				continue extendedSignatureLoop;
			return extendedSignature;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TemplateParameter> getInheritedParameters() {
		CacheAdapter cache = getCacheAdapter();
		if (cache != null) {
			@SuppressWarnings("unchecked")
			EList<TemplateParameter> result = (EList<TemplateParameter>) cache
				.get(this,
					UMLPackage.Literals.REDEFINABLE_TEMPLATE_SIGNATURE__INHERITED_PARAMETER);
			if (result == null) {
				cache.put(this,
					UMLPackage.Literals.REDEFINABLE_TEMPLATE_SIGNATURE__INHERITED_PARAMETER,
					result = RedefinableTemplateSignatureOperations
						.getInheritedParameters(this));
			}
			return result;
		}
		return RedefinableTemplateSignatureOperations
			.getInheritedParameters(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Classifier getClassifier() {
		Classifier classifier = basicGetClassifier();
		return classifier != null && classifier.eIsProxy()
			? (Classifier) eResolveProxy((InternalEObject) classifier)
			: classifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Classifier basicGetClassifier() {
		if (eContainerFeatureID() != UMLPackage.REDEFINABLE_TEMPLATE_SIGNATURE__CLASSIFIER)
			return null;
		return (Classifier) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetClassifier() {
		return basicGetClassifier() != null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOwnElements(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return TemplateSignatureOperations.validateOwnElements(this,
			diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUniqueParameters(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return TemplateSignatureOperations.validateUniqueParameters(this,
			diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRedefinesParents(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return RedefinableTemplateSignatureOperations
			.validateRedefinesParents(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isConsistentWith(RedefinableElement redefiningElement) {
		return RedefinableTemplateSignatureOperations.isConsistentWith(this,
			redefiningElement);
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
			case UMLPackage.REDEFINABLE_TEMPLATE_SIGNATURE__EANNOTATIONS :
				return ((InternalEList<InternalEObject>) (InternalEList<?>) getEAnnotations())
					.basicAdd(otherEnd, msgs);
			case UMLPackage.REDEFINABLE_TEMPLATE_SIGNATURE__TEMPLATE :
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetTemplate((TemplateableElement) otherEnd, msgs);
			case UMLPackage.REDEFINABLE_TEMPLATE_SIGNATURE__OWNED_PARAMETER :
				return ((InternalEList<InternalEObject>) (InternalEList<?>) getOwnedParameters())
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
			case UMLPackage.REDEFINABLE_TEMPLATE_SIGNATURE__EANNOTATIONS :
				return ((InternalEList<?>) getEAnnotations())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.REDEFINABLE_TEMPLATE_SIGNATURE__OWNED_COMMENT :
				return ((InternalEList<?>) getOwnedComments())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.REDEFINABLE_TEMPLATE_SIGNATURE__NAME_EXPRESSION :
				return basicSetNameExpression(null, msgs);
			case UMLPackage.REDEFINABLE_TEMPLATE_SIGNATURE__TEMPLATE :
				return basicSetTemplate(null, msgs);
			case UMLPackage.REDEFINABLE_TEMPLATE_SIGNATURE__OWNED_PARAMETER :
				return ((InternalEList<?>) getOwnedParameters())
					.basicRemove(otherEnd, msgs);
		}
		return eDynamicInverseRemove(otherEnd, featureID, msgs);
	}

	public NotificationChain eBasicRemoveFromContainerFeature(
			NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case UMLPackage.REDEFINABLE_TEMPLATE_SIGNATURE__CLASSIFIER :
				return eInternalContainer().eInverseRemove(this,
					UMLPackage.TEMPLATEABLE_ELEMENT__OWNED_TEMPLATE_SIGNATURE,
					TemplateableElement.class, msgs);
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
			case UMLPackage.REDEFINABLE_TEMPLATE_SIGNATURE__EANNOTATIONS :
				return getEAnnotations();
			case UMLPackage.REDEFINABLE_TEMPLATE_SIGNATURE__OWNED_COMMENT :
				return getOwnedComments();
			case UMLPackage.REDEFINABLE_TEMPLATE_SIGNATURE__OWNED_ELEMENT :
				return getOwnedElements();
			case UMLPackage.REDEFINABLE_TEMPLATE_SIGNATURE__OWNER :
				if (resolve)
					return getOwner();
				return basicGetOwner();
			case UMLPackage.REDEFINABLE_TEMPLATE_SIGNATURE__CLIENT_DEPENDENCY :
				return getClientDependencies();
			case UMLPackage.REDEFINABLE_TEMPLATE_SIGNATURE__NAME :
				return getName();
			case UMLPackage.REDEFINABLE_TEMPLATE_SIGNATURE__NAME_EXPRESSION :
				if (resolve)
					return getNameExpression();
				return basicGetNameExpression();
			case UMLPackage.REDEFINABLE_TEMPLATE_SIGNATURE__NAMESPACE :
				if (resolve)
					return getNamespace();
				return basicGetNamespace();
			case UMLPackage.REDEFINABLE_TEMPLATE_SIGNATURE__QUALIFIED_NAME :
				return getQualifiedName();
			case UMLPackage.REDEFINABLE_TEMPLATE_SIGNATURE__VISIBILITY :
				return getVisibility();
			case UMLPackage.REDEFINABLE_TEMPLATE_SIGNATURE__IS_LEAF :
				return isLeaf();
			case UMLPackage.REDEFINABLE_TEMPLATE_SIGNATURE__REDEFINED_ELEMENT :
				return getRedefinedElements();
			case UMLPackage.REDEFINABLE_TEMPLATE_SIGNATURE__REDEFINITION_CONTEXT :
				return getRedefinitionContexts();
			case UMLPackage.REDEFINABLE_TEMPLATE_SIGNATURE__PARAMETER :
				return getParameters();
			case UMLPackage.REDEFINABLE_TEMPLATE_SIGNATURE__TEMPLATE :
				if (resolve)
					return getTemplate();
				return basicGetTemplate();
			case UMLPackage.REDEFINABLE_TEMPLATE_SIGNATURE__OWNED_PARAMETER :
				return getOwnedParameters();
			case UMLPackage.REDEFINABLE_TEMPLATE_SIGNATURE__EXTENDED_SIGNATURE :
				return getExtendedSignatures();
			case UMLPackage.REDEFINABLE_TEMPLATE_SIGNATURE__INHERITED_PARAMETER :
				return getInheritedParameters();
			case UMLPackage.REDEFINABLE_TEMPLATE_SIGNATURE__CLASSIFIER :
				if (resolve)
					return getClassifier();
				return basicGetClassifier();
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
			case UMLPackage.REDEFINABLE_TEMPLATE_SIGNATURE__EANNOTATIONS :
				getEAnnotations().clear();
				getEAnnotations()
					.addAll((Collection<? extends EAnnotation>) newValue);
				return;
			case UMLPackage.REDEFINABLE_TEMPLATE_SIGNATURE__OWNED_COMMENT :
				getOwnedComments().clear();
				getOwnedComments()
					.addAll((Collection<? extends Comment>) newValue);
				return;
			case UMLPackage.REDEFINABLE_TEMPLATE_SIGNATURE__NAME :
				setName((String) newValue);
				return;
			case UMLPackage.REDEFINABLE_TEMPLATE_SIGNATURE__NAME_EXPRESSION :
				setNameExpression((StringExpression) newValue);
				return;
			case UMLPackage.REDEFINABLE_TEMPLATE_SIGNATURE__VISIBILITY :
				setVisibility((VisibilityKind) newValue);
				return;
			case UMLPackage.REDEFINABLE_TEMPLATE_SIGNATURE__IS_LEAF :
				setIsLeaf((Boolean) newValue);
				return;
			case UMLPackage.REDEFINABLE_TEMPLATE_SIGNATURE__PARAMETER :
				getParameters().clear();
				getParameters()
					.addAll((Collection<? extends TemplateParameter>) newValue);
				return;
			case UMLPackage.REDEFINABLE_TEMPLATE_SIGNATURE__TEMPLATE :
				setTemplate((TemplateableElement) newValue);
				return;
			case UMLPackage.REDEFINABLE_TEMPLATE_SIGNATURE__OWNED_PARAMETER :
				getOwnedParameters().clear();
				getOwnedParameters()
					.addAll((Collection<? extends TemplateParameter>) newValue);
				return;
			case UMLPackage.REDEFINABLE_TEMPLATE_SIGNATURE__EXTENDED_SIGNATURE :
				getExtendedSignatures().clear();
				getExtendedSignatures().addAll(
					(Collection<? extends RedefinableTemplateSignature>) newValue);
				return;
		}
		eDynamicSet(featureID, newValue);
	}

	@Override
	public void eDynamicSet(int featureID, Object newValue) {

		if (featureID == UMLPackage.REDEFINABLE_TEMPLATE_SIGNATURE__CLASSIFIER) {
			((Classifier) newValue).setOwnedTemplateSignature(this);
			return;
		}

		super.eDynamicSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case UMLPackage.REDEFINABLE_TEMPLATE_SIGNATURE__EANNOTATIONS :
				getEAnnotations().clear();
				return;
			case UMLPackage.REDEFINABLE_TEMPLATE_SIGNATURE__OWNED_COMMENT :
				getOwnedComments().clear();
				return;
			case UMLPackage.REDEFINABLE_TEMPLATE_SIGNATURE__NAME :
				unsetName();
				return;
			case UMLPackage.REDEFINABLE_TEMPLATE_SIGNATURE__NAME_EXPRESSION :
				setNameExpression((StringExpression) null);
				return;
			case UMLPackage.REDEFINABLE_TEMPLATE_SIGNATURE__VISIBILITY :
				unsetVisibility();
				return;
			case UMLPackage.REDEFINABLE_TEMPLATE_SIGNATURE__IS_LEAF :
				setIsLeaf(IS_LEAF_EDEFAULT);
				return;
			case UMLPackage.REDEFINABLE_TEMPLATE_SIGNATURE__PARAMETER :
				getParameters().clear();
				return;
			case UMLPackage.REDEFINABLE_TEMPLATE_SIGNATURE__TEMPLATE :
				setTemplate((TemplateableElement) null);
				return;
			case UMLPackage.REDEFINABLE_TEMPLATE_SIGNATURE__OWNED_PARAMETER :
				getOwnedParameters().clear();
				return;
			case UMLPackage.REDEFINABLE_TEMPLATE_SIGNATURE__EXTENDED_SIGNATURE :
				getExtendedSignatures().clear();
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
			case UMLPackage.REDEFINABLE_TEMPLATE_SIGNATURE__EANNOTATIONS :
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UMLPackage.REDEFINABLE_TEMPLATE_SIGNATURE__OWNED_COMMENT :
				return ownedComments != null && !ownedComments.isEmpty();
			case UMLPackage.REDEFINABLE_TEMPLATE_SIGNATURE__OWNED_ELEMENT :
				return isSetOwnedElements();
			case UMLPackage.REDEFINABLE_TEMPLATE_SIGNATURE__OWNER :
				return isSetOwner();
			case UMLPackage.REDEFINABLE_TEMPLATE_SIGNATURE__CLIENT_DEPENDENCY :
				return !getClientDependencies().isEmpty();
			case UMLPackage.REDEFINABLE_TEMPLATE_SIGNATURE__NAME :
				return isSetName();
			case UMLPackage.REDEFINABLE_TEMPLATE_SIGNATURE__NAME_EXPRESSION :
				return nameExpression != null;
			case UMLPackage.REDEFINABLE_TEMPLATE_SIGNATURE__NAMESPACE :
				return isSetNamespace();
			case UMLPackage.REDEFINABLE_TEMPLATE_SIGNATURE__QUALIFIED_NAME :
				return QUALIFIED_NAME_EDEFAULT == null
					? getQualifiedName() != null
					: !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case UMLPackage.REDEFINABLE_TEMPLATE_SIGNATURE__VISIBILITY :
				return isSetVisibility();
			case UMLPackage.REDEFINABLE_TEMPLATE_SIGNATURE__IS_LEAF :
				return ((eFlags & IS_LEAF_EFLAG) != 0) != IS_LEAF_EDEFAULT;
			case UMLPackage.REDEFINABLE_TEMPLATE_SIGNATURE__REDEFINED_ELEMENT :
				return isSetRedefinedElements();
			case UMLPackage.REDEFINABLE_TEMPLATE_SIGNATURE__REDEFINITION_CONTEXT :
				return isSetRedefinitionContexts();
			case UMLPackage.REDEFINABLE_TEMPLATE_SIGNATURE__PARAMETER :
				return parameters != null && !parameters.isEmpty();
			case UMLPackage.REDEFINABLE_TEMPLATE_SIGNATURE__TEMPLATE :
				return isSetTemplate();
			case UMLPackage.REDEFINABLE_TEMPLATE_SIGNATURE__OWNED_PARAMETER :
				return ownedParameters != null && !ownedParameters.isEmpty();
			case UMLPackage.REDEFINABLE_TEMPLATE_SIGNATURE__EXTENDED_SIGNATURE :
				return extendedSignatures != null
					&& !extendedSignatures.isEmpty();
			case UMLPackage.REDEFINABLE_TEMPLATE_SIGNATURE__INHERITED_PARAMETER :
				return !getInheritedParameters().isEmpty();
			case UMLPackage.REDEFINABLE_TEMPLATE_SIGNATURE__CLASSIFIER :
				return isSetClassifier();
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
		if (baseClass == TemplateSignature.class) {
			switch (derivedFeatureID) {
				case UMLPackage.REDEFINABLE_TEMPLATE_SIGNATURE__PARAMETER :
					return UMLPackage.TEMPLATE_SIGNATURE__PARAMETER;
				case UMLPackage.REDEFINABLE_TEMPLATE_SIGNATURE__TEMPLATE :
					return UMLPackage.TEMPLATE_SIGNATURE__TEMPLATE;
				case UMLPackage.REDEFINABLE_TEMPLATE_SIGNATURE__OWNED_PARAMETER :
					return UMLPackage.TEMPLATE_SIGNATURE__OWNED_PARAMETER;
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
		if (baseClass == TemplateSignature.class) {
			switch (baseFeatureID) {
				case UMLPackage.TEMPLATE_SIGNATURE__PARAMETER :
					return UMLPackage.REDEFINABLE_TEMPLATE_SIGNATURE__PARAMETER;
				case UMLPackage.TEMPLATE_SIGNATURE__TEMPLATE :
					return UMLPackage.REDEFINABLE_TEMPLATE_SIGNATURE__TEMPLATE;
				case UMLPackage.TEMPLATE_SIGNATURE__OWNED_PARAMETER :
					return UMLPackage.REDEFINABLE_TEMPLATE_SIGNATURE__OWNED_PARAMETER;
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
		if (baseClass == TemplateSignature.class) {
			switch (baseOperationID) {
				case UMLPackage.TEMPLATE_SIGNATURE___VALIDATE_OWN_ELEMENTS__DIAGNOSTICCHAIN_MAP :
					return UMLPackage.REDEFINABLE_TEMPLATE_SIGNATURE___VALIDATE_OWN_ELEMENTS__DIAGNOSTICCHAIN_MAP;
				case UMLPackage.TEMPLATE_SIGNATURE___VALIDATE_UNIQUE_PARAMETERS__DIAGNOSTICCHAIN_MAP :
					return UMLPackage.REDEFINABLE_TEMPLATE_SIGNATURE___VALIDATE_UNIQUE_PARAMETERS__DIAGNOSTICCHAIN_MAP;
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
			case UMLPackage.REDEFINABLE_TEMPLATE_SIGNATURE___GET_EANNOTATION__STRING :
				return getEAnnotation((String) arguments.get(0));
			case UMLPackage.REDEFINABLE_TEMPLATE_SIGNATURE___VALIDATE_HAS_OWNER__DIAGNOSTICCHAIN_MAP :
				return validateHasOwner((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.REDEFINABLE_TEMPLATE_SIGNATURE___VALIDATE_NOT_OWN_SELF__DIAGNOSTICCHAIN_MAP :
				return validateNotOwnSelf((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.REDEFINABLE_TEMPLATE_SIGNATURE___ADD_KEYWORD__STRING :
				return addKeyword((String) arguments.get(0));
			case UMLPackage.REDEFINABLE_TEMPLATE_SIGNATURE___APPLY_STEREOTYPE__STEREOTYPE :
				return applyStereotype((Stereotype) arguments.get(0));
			case UMLPackage.REDEFINABLE_TEMPLATE_SIGNATURE___CREATE_EANNOTATION__STRING :
				return createEAnnotation((String) arguments.get(0));
			case UMLPackage.REDEFINABLE_TEMPLATE_SIGNATURE___DESTROY :
				destroy();
				return null;
			case UMLPackage.REDEFINABLE_TEMPLATE_SIGNATURE___GET_KEYWORDS :
				return getKeywords();
			case UMLPackage.REDEFINABLE_TEMPLATE_SIGNATURE___GET_APPLICABLE_STEREOTYPE__STRING :
				return getApplicableStereotype((String) arguments.get(0));
			case UMLPackage.REDEFINABLE_TEMPLATE_SIGNATURE___GET_APPLICABLE_STEREOTYPES :
				return getApplicableStereotypes();
			case UMLPackage.REDEFINABLE_TEMPLATE_SIGNATURE___GET_APPLIED_STEREOTYPE__STRING :
				return getAppliedStereotype((String) arguments.get(0));
			case UMLPackage.REDEFINABLE_TEMPLATE_SIGNATURE___GET_APPLIED_STEREOTYPES :
				return getAppliedStereotypes();
			case UMLPackage.REDEFINABLE_TEMPLATE_SIGNATURE___GET_APPLIED_SUBSTEREOTYPE__STEREOTYPE_STRING :
				return getAppliedSubstereotype((Stereotype) arguments.get(0),
					(String) arguments.get(1));
			case UMLPackage.REDEFINABLE_TEMPLATE_SIGNATURE___GET_APPLIED_SUBSTEREOTYPES__STEREOTYPE :
				return getAppliedSubstereotypes((Stereotype) arguments.get(0));
			case UMLPackage.REDEFINABLE_TEMPLATE_SIGNATURE___GET_MODEL :
				return getModel();
			case UMLPackage.REDEFINABLE_TEMPLATE_SIGNATURE___GET_NEAREST_PACKAGE :
				return getNearestPackage();
			case UMLPackage.REDEFINABLE_TEMPLATE_SIGNATURE___GET_RELATIONSHIPS :
				return getRelationships();
			case UMLPackage.REDEFINABLE_TEMPLATE_SIGNATURE___GET_RELATIONSHIPS__ECLASS :
				return getRelationships((EClass) arguments.get(0));
			case UMLPackage.REDEFINABLE_TEMPLATE_SIGNATURE___GET_REQUIRED_STEREOTYPE__STRING :
				return getRequiredStereotype((String) arguments.get(0));
			case UMLPackage.REDEFINABLE_TEMPLATE_SIGNATURE___GET_REQUIRED_STEREOTYPES :
				return getRequiredStereotypes();
			case UMLPackage.REDEFINABLE_TEMPLATE_SIGNATURE___GET_SOURCE_DIRECTED_RELATIONSHIPS :
				return getSourceDirectedRelationships();
			case UMLPackage.REDEFINABLE_TEMPLATE_SIGNATURE___GET_SOURCE_DIRECTED_RELATIONSHIPS__ECLASS :
				return getSourceDirectedRelationships(
					(EClass) arguments.get(0));
			case UMLPackage.REDEFINABLE_TEMPLATE_SIGNATURE___GET_STEREOTYPE_APPLICATION__STEREOTYPE :
				return getStereotypeApplication((Stereotype) arguments.get(0));
			case UMLPackage.REDEFINABLE_TEMPLATE_SIGNATURE___GET_STEREOTYPE_APPLICATIONS :
				return getStereotypeApplications();
			case UMLPackage.REDEFINABLE_TEMPLATE_SIGNATURE___GET_TARGET_DIRECTED_RELATIONSHIPS :
				return getTargetDirectedRelationships();
			case UMLPackage.REDEFINABLE_TEMPLATE_SIGNATURE___GET_TARGET_DIRECTED_RELATIONSHIPS__ECLASS :
				return getTargetDirectedRelationships(
					(EClass) arguments.get(0));
			case UMLPackage.REDEFINABLE_TEMPLATE_SIGNATURE___GET_VALUE__STEREOTYPE_STRING :
				return getValue((Stereotype) arguments.get(0),
					(String) arguments.get(1));
			case UMLPackage.REDEFINABLE_TEMPLATE_SIGNATURE___HAS_KEYWORD__STRING :
				return hasKeyword((String) arguments.get(0));
			case UMLPackage.REDEFINABLE_TEMPLATE_SIGNATURE___HAS_VALUE__STEREOTYPE_STRING :
				return hasValue((Stereotype) arguments.get(0),
					(String) arguments.get(1));
			case UMLPackage.REDEFINABLE_TEMPLATE_SIGNATURE___IS_STEREOTYPE_APPLICABLE__STEREOTYPE :
				return isStereotypeApplicable((Stereotype) arguments.get(0));
			case UMLPackage.REDEFINABLE_TEMPLATE_SIGNATURE___IS_STEREOTYPE_APPLIED__STEREOTYPE :
				return isStereotypeApplied((Stereotype) arguments.get(0));
			case UMLPackage.REDEFINABLE_TEMPLATE_SIGNATURE___IS_STEREOTYPE_REQUIRED__STEREOTYPE :
				return isStereotypeRequired((Stereotype) arguments.get(0));
			case UMLPackage.REDEFINABLE_TEMPLATE_SIGNATURE___REMOVE_KEYWORD__STRING :
				return removeKeyword((String) arguments.get(0));
			case UMLPackage.REDEFINABLE_TEMPLATE_SIGNATURE___SET_VALUE__STEREOTYPE_STRING_OBJECT :
				setValue((Stereotype) arguments.get(0),
					(String) arguments.get(1), arguments.get(2));
				return null;
			case UMLPackage.REDEFINABLE_TEMPLATE_SIGNATURE___UNAPPLY_STEREOTYPE__STEREOTYPE :
				return unapplyStereotype((Stereotype) arguments.get(0));
			case UMLPackage.REDEFINABLE_TEMPLATE_SIGNATURE___ALL_OWNED_ELEMENTS :
				return allOwnedElements();
			case UMLPackage.REDEFINABLE_TEMPLATE_SIGNATURE___MUST_BE_OWNED :
				return mustBeOwned();
			case UMLPackage.REDEFINABLE_TEMPLATE_SIGNATURE___VALIDATE_VISIBILITY_NEEDS_OWNERSHIP__DIAGNOSTICCHAIN_MAP :
				return validateVisibilityNeedsOwnership(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.REDEFINABLE_TEMPLATE_SIGNATURE___VALIDATE_HAS_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP :
				return validateHasQualifiedName(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.REDEFINABLE_TEMPLATE_SIGNATURE___VALIDATE_HAS_NO_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP :
				return validateHasNoQualifiedName(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.REDEFINABLE_TEMPLATE_SIGNATURE___CREATE_DEPENDENCY__NAMEDELEMENT :
				return createDependency((NamedElement) arguments.get(0));
			case UMLPackage.REDEFINABLE_TEMPLATE_SIGNATURE___CREATE_USAGE__NAMEDELEMENT :
				return createUsage((NamedElement) arguments.get(0));
			case UMLPackage.REDEFINABLE_TEMPLATE_SIGNATURE___GET_LABEL :
				return getLabel();
			case UMLPackage.REDEFINABLE_TEMPLATE_SIGNATURE___GET_LABEL__BOOLEAN :
				return getLabel((Boolean) arguments.get(0));
			case UMLPackage.REDEFINABLE_TEMPLATE_SIGNATURE___GET_NAMESPACE :
				return getNamespace();
			case UMLPackage.REDEFINABLE_TEMPLATE_SIGNATURE___ALL_NAMESPACES :
				return allNamespaces();
			case UMLPackage.REDEFINABLE_TEMPLATE_SIGNATURE___ALL_OWNING_PACKAGES :
				return allOwningPackages();
			case UMLPackage.REDEFINABLE_TEMPLATE_SIGNATURE___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE :
				return isDistinguishableFrom((NamedElement) arguments.get(0),
					(Namespace) arguments.get(1));
			case UMLPackage.REDEFINABLE_TEMPLATE_SIGNATURE___GET_QUALIFIED_NAME :
				return getQualifiedName();
			case UMLPackage.REDEFINABLE_TEMPLATE_SIGNATURE___SEPARATOR :
				return separator();
			case UMLPackage.REDEFINABLE_TEMPLATE_SIGNATURE___GET_CLIENT_DEPENDENCIES :
				return getClientDependencies();
			case UMLPackage.REDEFINABLE_TEMPLATE_SIGNATURE___VALIDATE_REDEFINITION_CONSISTENT__DIAGNOSTICCHAIN_MAP :
				return validateRedefinitionConsistent(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.REDEFINABLE_TEMPLATE_SIGNATURE___VALIDATE_NON_LEAF_REDEFINITION__DIAGNOSTICCHAIN_MAP :
				return validateNonLeafRedefinition(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.REDEFINABLE_TEMPLATE_SIGNATURE___VALIDATE_REDEFINITION_CONTEXT_VALID__DIAGNOSTICCHAIN_MAP :
				return validateRedefinitionContextValid(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.REDEFINABLE_TEMPLATE_SIGNATURE___IS_CONSISTENT_WITH__REDEFINABLEELEMENT :
				return isConsistentWith((RedefinableElement) arguments.get(0));
			case UMLPackage.REDEFINABLE_TEMPLATE_SIGNATURE___IS_REDEFINITION_CONTEXT_VALID__REDEFINABLEELEMENT :
				return isRedefinitionContextValid(
					(RedefinableElement) arguments.get(0));
			case UMLPackage.REDEFINABLE_TEMPLATE_SIGNATURE___VALIDATE_OWN_ELEMENTS__DIAGNOSTICCHAIN_MAP :
				return validateOwnElements((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.REDEFINABLE_TEMPLATE_SIGNATURE___VALIDATE_UNIQUE_PARAMETERS__DIAGNOSTICCHAIN_MAP :
				return validateUniqueParameters(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.REDEFINABLE_TEMPLATE_SIGNATURE___VALIDATE_REDEFINES_PARENTS__DIAGNOSTICCHAIN_MAP :
				return validateRedefinesParents(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.REDEFINABLE_TEMPLATE_SIGNATURE___GET_INHERITED_PARAMETERS :
				return getInheritedParameters();
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
		UMLPackage.REDEFINABLE_TEMPLATE_SIGNATURE__OWNED_COMMENT,
		UMLPackage.REDEFINABLE_TEMPLATE_SIGNATURE__NAME_EXPRESSION,
		UMLPackage.REDEFINABLE_TEMPLATE_SIGNATURE__OWNED_PARAMETER};

	/**
	 * The array of subset feature identifiers for the '{@link #getParameters() <em>Parameter</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameters()
	 * @generated
	 * @ordered
	 */
	protected static final int[] PARAMETER_ESUBSETS = new int[]{
		UMLPackage.REDEFINABLE_TEMPLATE_SIGNATURE__OWNED_PARAMETER};

	/**
	 * The array of superset feature identifiers for the '{@link #getOwnedParameters() <em>Owned Parameter</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedParameters()
	 * @generated
	 * @ordered
	 */
	protected static final int[] OWNED_PARAMETER_ESUPERSETS = new int[]{
		UMLPackage.REDEFINABLE_TEMPLATE_SIGNATURE__PARAMETER};

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
	 * @generated NOT
	 */
	@Override
	public Element basicGetOwner() {
		if (isSetClassifier()) {
			return basicGetClassifier();
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
		return super.isSetOwner() || isSetTemplate();
	}

	/**
	 * The array of subset feature identifiers for the '{@link #getRedefinedElements() <em>Redefined Element</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRedefinedElements()
	 * @generated
	 * @ordered
	 */
	protected static final int[] REDEFINED_ELEMENT_ESUBSETS = new int[]{
		UMLPackage.REDEFINABLE_TEMPLATE_SIGNATURE__EXTENDED_SIGNATURE};

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetOwnedElements() {
		return super.isSetOwnedElements() || eIsSet(
			UMLPackage.REDEFINABLE_TEMPLATE_SIGNATURE__OWNED_PARAMETER);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetRedefinedElements() {
		return super.isSetRedefinedElements() || eIsSet(
			UMLPackage.REDEFINABLE_TEMPLATE_SIGNATURE__EXTENDED_SIGNATURE);
	}

	/**
	 * The array of subset feature identifiers for the '{@link #getRedefinitionContexts() <em>Redefinition Context</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRedefinitionContexts()
	 * @generated
	 * @ordered
	 */
	protected static final int[] REDEFINITION_CONTEXT_ESUBSETS = new int[]{
		UMLPackage.REDEFINABLE_TEMPLATE_SIGNATURE__CLASSIFIER};

	/**
	 * The array of superset feature identifiers for the '{@link #getInheritedParameters() <em>Inherited Parameter</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInheritedParameters()
	 * @generated
	 * @ordered
	 */
	protected static final int[] INHERITED_PARAMETER_ESUPERSETS = new int[]{
		UMLPackage.REDEFINABLE_TEMPLATE_SIGNATURE__PARAMETER};

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetRedefinitionContexts() {
		return super.isSetRedefinitionContexts() || isSetClassifier();
	}

	@Override
	public EReference eContainmentFeature() {
		return eContainerFeatureID() == UMLPackage.REDEFINABLE_TEMPLATE_SIGNATURE__CLASSIFIER
			? UMLPackage.Literals.TEMPLATEABLE_ELEMENT__OWNED_TEMPLATE_SIGNATURE
			: super.eContainmentFeature();
	}

	@Override
	public EStructuralFeature eContainingFeature() {
		return eContainerFeatureID() == UMLPackage.REDEFINABLE_TEMPLATE_SIGNATURE__CLASSIFIER
			? UMLPackage.Literals.TEMPLATEABLE_ELEMENT__OWNED_TEMPLATE_SIGNATURE
			: super.eContainingFeature();
	}

} //RedefinableTemplateSignatureImpl
