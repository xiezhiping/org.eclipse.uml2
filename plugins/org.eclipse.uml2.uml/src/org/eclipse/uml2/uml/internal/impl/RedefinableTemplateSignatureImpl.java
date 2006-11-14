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
 * $Id: RedefinableTemplateSignatureImpl.java,v 1.21 2006/11/14 18:02:19 khussey Exp $
 */
package org.eclipse.uml2.uml.internal.impl;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
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
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.RedefinableElement;
import org.eclipse.uml2.uml.RedefinableTemplateSignature;
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
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.RedefinableTemplateSignatureImpl#getOwnedElements <em>Owned Element</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.RedefinableTemplateSignatureImpl#getOwner <em>Owner</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.RedefinableTemplateSignatureImpl#getParameters <em>Parameter</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.RedefinableTemplateSignatureImpl#getOwnedParameters <em>Owned Parameter</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.RedefinableTemplateSignatureImpl#getTemplate <em>Template</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.RedefinableTemplateSignatureImpl#getRedefinedElements <em>Redefined Element</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.RedefinableTemplateSignatureImpl#getRedefinitionContexts <em>Redefinition Context</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.RedefinableTemplateSignatureImpl#getExtendedSignatures <em>Extended Signature</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.RedefinableTemplateSignatureImpl#getInheritedParameters <em>Inherited Parameter</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.RedefinableTemplateSignatureImpl#getClassifier <em>Classifier</em>}</li>
 * </ul>
 * </p>
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
	 * The cached value of the '{@link #getExtendedSignatures() <em>Extended Signature</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtendedSignatures()
	 * @generated
	 * @ordered
	 */
	protected EList extendedSignatures = null;

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
		return UMLPackage.Literals.REDEFINABLE_TEMPLATE_SIGNATURE;
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
			EList ownedElements = (EList) cache.get(eResource, this,
				UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
			if (ownedElements == null) {
				cache
					.put(
						eResource,
						this,
						UMLPackage.Literals.ELEMENT__OWNED_ELEMENT,
						ownedElements = new DerivedUnionEObjectEList(
							Element.class,
							this,
							UMLPackage.REDEFINABLE_TEMPLATE_SIGNATURE__OWNED_ELEMENT,
							OWNED_ELEMENT_ESUBSETS));
			}
			return ownedElements;
		}
		return new DerivedUnionEObjectEList(Element.class, this,
			UMLPackage.REDEFINABLE_TEMPLATE_SIGNATURE__OWNED_ELEMENT,
			OWNED_ELEMENT_ESUBSETS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getParameters() {
		if (parameters == null) {
			parameters = new SubsetSupersetEObjectResolvingEList(
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
		if (eContainerFeatureID != UMLPackage.REDEFINABLE_TEMPLATE_SIGNATURE__TEMPLATE)
			return null;
		return (TemplateableElement) eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemplateableElement basicGetTemplate() {
		if (eContainerFeatureID != UMLPackage.REDEFINABLE_TEMPLATE_SIGNATURE__TEMPLATE)
			return null;
		return (TemplateableElement) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTemplate(TemplateableElement newTemplate,
			NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newTemplate,
			UMLPackage.REDEFINABLE_TEMPLATE_SIGNATURE__TEMPLATE, msgs);

		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTemplate(TemplateableElement newTemplate) {

		if (newTemplate != eInternalContainer()
			|| (eContainerFeatureID != UMLPackage.REDEFINABLE_TEMPLATE_SIGNATURE__TEMPLATE && newTemplate != null)) {
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
	public EList getOwnedParameters() {
		if (ownedParameters == null) {
			ownedParameters = new SubsetSupersetEObjectContainmentWithInverseEList.Resolving(
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
		TemplateParameter newOwnedParameter = (TemplateParameter) create(eClass);
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
	public EList getRedefinedElements() {

		CacheAdapter cache = getCacheAdapter();
		if (cache != null) {
			Resource eResource = eResource();
			EList redefinedElements = (EList) cache.get(eResource, this,
				UMLPackage.Literals.REDEFINABLE_ELEMENT__REDEFINED_ELEMENT);
			if (redefinedElements == null) {
				cache
					.put(
						eResource,
						this,
						UMLPackage.Literals.REDEFINABLE_ELEMENT__REDEFINED_ELEMENT,
						redefinedElements = new DerivedUnionEObjectEList(
							RedefinableElement.class,
							this,
							UMLPackage.REDEFINABLE_TEMPLATE_SIGNATURE__REDEFINED_ELEMENT,
							REDEFINED_ELEMENT_ESUBSETS));
			}
			return redefinedElements;
		}
		return new DerivedUnionEObjectEList(RedefinableElement.class, this,
			UMLPackage.REDEFINABLE_TEMPLATE_SIGNATURE__REDEFINED_ELEMENT,
			REDEFINED_ELEMENT_ESUBSETS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getRedefinitionContexts() {

		CacheAdapter cache = getCacheAdapter();
		if (cache != null) {
			Resource eResource = eResource();
			EList redefinitionContexts = (EList) cache.get(eResource, this,
				UMLPackage.Literals.REDEFINABLE_ELEMENT__REDEFINITION_CONTEXT);
			if (redefinitionContexts == null) {
				cache
					.put(
						eResource,
						this,
						UMLPackage.Literals.REDEFINABLE_ELEMENT__REDEFINITION_CONTEXT,
						redefinitionContexts = new DerivedUnionEObjectEList(
							Classifier.class,
							this,
							UMLPackage.REDEFINABLE_TEMPLATE_SIGNATURE__REDEFINITION_CONTEXT,
							REDEFINITION_CONTEXT_ESUBSETS));
			}
			return redefinitionContexts;
		}
		return new DerivedUnionEObjectEList(Classifier.class, this,
			UMLPackage.REDEFINABLE_TEMPLATE_SIGNATURE__REDEFINITION_CONTEXT,
			REDEFINITION_CONTEXT_ESUBSETS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getExtendedSignatures() {
		if (extendedSignatures == null) {
			extendedSignatures = new EObjectResolvingEList(
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
		extendedSignatureLoop : for (Iterator i = getExtendedSignatures()
			.iterator(); i.hasNext();) {
			RedefinableTemplateSignature extendedSignature = (RedefinableTemplateSignature) i
				.next();
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
	public EList getInheritedParameters() {

		CacheAdapter cache = getCacheAdapter();
		if (cache != null) {
			EList result = (EList) cache
				.get(
					this,
					UMLPackage.Literals.REDEFINABLE_TEMPLATE_SIGNATURE__INHERITED_PARAMETER);
			if (result == null) {
				cache
					.put(
						this,
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
		InternalEObject eInternalContainer = eInternalContainer();
		return eInternalContainer instanceof Classifier
			? (Classifier) eInternalContainer
			: null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOwnElements(DiagnosticChain diagnostics, Map context) {
		return TemplateSignatureOperations.validateOwnElements(this,
			diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInheritedParameters(DiagnosticChain diagnostics,
			Map context) {
		return RedefinableTemplateSignatureOperations
			.validateInheritedParameters(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isConsistentWith(RedefinableElement redefinee) {
		return RedefinableTemplateSignatureOperations.isConsistentWith(this,
			redefinee);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UMLPackage.REDEFINABLE_TEMPLATE_SIGNATURE__EANNOTATIONS :
				return ((InternalEList) getEAnnotations()).basicAdd(otherEnd,
					msgs);
			case UMLPackage.REDEFINABLE_TEMPLATE_SIGNATURE__CLIENT_DEPENDENCY :
				return ((InternalEList) getClientDependencies()).basicAdd(
					otherEnd, msgs);
			case UMLPackage.REDEFINABLE_TEMPLATE_SIGNATURE__OWNED_PARAMETER :
				return ((InternalEList) getOwnedParameters()).basicAdd(
					otherEnd, msgs);
			case UMLPackage.REDEFINABLE_TEMPLATE_SIGNATURE__TEMPLATE :
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetTemplate((TemplateableElement) otherEnd, msgs);
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
			case UMLPackage.REDEFINABLE_TEMPLATE_SIGNATURE__EANNOTATIONS :
				return ((InternalEList) getEAnnotations()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.REDEFINABLE_TEMPLATE_SIGNATURE__OWNED_COMMENT :
				return ((InternalEList) getOwnedComments()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.REDEFINABLE_TEMPLATE_SIGNATURE__CLIENT_DEPENDENCY :
				return ((InternalEList) getClientDependencies()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.REDEFINABLE_TEMPLATE_SIGNATURE__NAME_EXPRESSION :
				return basicSetNameExpression(null, msgs);
			case UMLPackage.REDEFINABLE_TEMPLATE_SIGNATURE__OWNED_PARAMETER :
				return ((InternalEList) getOwnedParameters()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.REDEFINABLE_TEMPLATE_SIGNATURE__TEMPLATE :
				return basicSetTemplate(null, msgs);
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
			case UMLPackage.REDEFINABLE_TEMPLATE_SIGNATURE__TEMPLATE :
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
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UMLPackage.REDEFINABLE_TEMPLATE_SIGNATURE__EANNOTATIONS :
				return getEAnnotations();
			case UMLPackage.REDEFINABLE_TEMPLATE_SIGNATURE__OWNED_ELEMENT :
				return getOwnedElements();
			case UMLPackage.REDEFINABLE_TEMPLATE_SIGNATURE__OWNER :
				if (resolve)
					return getOwner();
				return basicGetOwner();
			case UMLPackage.REDEFINABLE_TEMPLATE_SIGNATURE__OWNED_COMMENT :
				return getOwnedComments();
			case UMLPackage.REDEFINABLE_TEMPLATE_SIGNATURE__NAME :
				return getName();
			case UMLPackage.REDEFINABLE_TEMPLATE_SIGNATURE__VISIBILITY :
				return getVisibility();
			case UMLPackage.REDEFINABLE_TEMPLATE_SIGNATURE__QUALIFIED_NAME :
				return getQualifiedName();
			case UMLPackage.REDEFINABLE_TEMPLATE_SIGNATURE__CLIENT_DEPENDENCY :
				return getClientDependencies();
			case UMLPackage.REDEFINABLE_TEMPLATE_SIGNATURE__NAMESPACE :
				if (resolve)
					return getNamespace();
				return basicGetNamespace();
			case UMLPackage.REDEFINABLE_TEMPLATE_SIGNATURE__NAME_EXPRESSION :
				if (resolve)
					return getNameExpression();
				return basicGetNameExpression();
			case UMLPackage.REDEFINABLE_TEMPLATE_SIGNATURE__IS_LEAF :
				return isLeaf()
					? Boolean.TRUE
					: Boolean.FALSE;
			case UMLPackage.REDEFINABLE_TEMPLATE_SIGNATURE__REDEFINED_ELEMENT :
				return getRedefinedElements();
			case UMLPackage.REDEFINABLE_TEMPLATE_SIGNATURE__REDEFINITION_CONTEXT :
				return getRedefinitionContexts();
			case UMLPackage.REDEFINABLE_TEMPLATE_SIGNATURE__PARAMETER :
				return getParameters();
			case UMLPackage.REDEFINABLE_TEMPLATE_SIGNATURE__OWNED_PARAMETER :
				return getOwnedParameters();
			case UMLPackage.REDEFINABLE_TEMPLATE_SIGNATURE__TEMPLATE :
				if (resolve)
					return getTemplate();
				return basicGetTemplate();
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
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case UMLPackage.REDEFINABLE_TEMPLATE_SIGNATURE__EANNOTATIONS :
				getEAnnotations().clear();
				getEAnnotations().addAll((Collection) newValue);
				return;
			case UMLPackage.REDEFINABLE_TEMPLATE_SIGNATURE__OWNED_COMMENT :
				getOwnedComments().clear();
				getOwnedComments().addAll((Collection) newValue);
				return;
			case UMLPackage.REDEFINABLE_TEMPLATE_SIGNATURE__NAME :
				setName((String) newValue);
				return;
			case UMLPackage.REDEFINABLE_TEMPLATE_SIGNATURE__VISIBILITY :
				setVisibility((VisibilityKind) newValue);
				return;
			case UMLPackage.REDEFINABLE_TEMPLATE_SIGNATURE__CLIENT_DEPENDENCY :
				getClientDependencies().clear();
				getClientDependencies().addAll((Collection) newValue);
				return;
			case UMLPackage.REDEFINABLE_TEMPLATE_SIGNATURE__NAME_EXPRESSION :
				setNameExpression((StringExpression) newValue);
				return;
			case UMLPackage.REDEFINABLE_TEMPLATE_SIGNATURE__IS_LEAF :
				setIsLeaf(((Boolean) newValue).booleanValue());
				return;
			case UMLPackage.REDEFINABLE_TEMPLATE_SIGNATURE__PARAMETER :
				getParameters().clear();
				getParameters().addAll((Collection) newValue);
				return;
			case UMLPackage.REDEFINABLE_TEMPLATE_SIGNATURE__OWNED_PARAMETER :
				getOwnedParameters().clear();
				getOwnedParameters().addAll((Collection) newValue);
				return;
			case UMLPackage.REDEFINABLE_TEMPLATE_SIGNATURE__TEMPLATE :
				setTemplate((TemplateableElement) newValue);
				return;
			case UMLPackage.REDEFINABLE_TEMPLATE_SIGNATURE__EXTENDED_SIGNATURE :
				getExtendedSignatures().clear();
				getExtendedSignatures().addAll((Collection) newValue);
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
			case UMLPackage.REDEFINABLE_TEMPLATE_SIGNATURE__EANNOTATIONS :
				getEAnnotations().clear();
				return;
			case UMLPackage.REDEFINABLE_TEMPLATE_SIGNATURE__OWNED_COMMENT :
				getOwnedComments().clear();
				return;
			case UMLPackage.REDEFINABLE_TEMPLATE_SIGNATURE__NAME :
				unsetName();
				return;
			case UMLPackage.REDEFINABLE_TEMPLATE_SIGNATURE__VISIBILITY :
				unsetVisibility();
				return;
			case UMLPackage.REDEFINABLE_TEMPLATE_SIGNATURE__CLIENT_DEPENDENCY :
				getClientDependencies().clear();
				return;
			case UMLPackage.REDEFINABLE_TEMPLATE_SIGNATURE__NAME_EXPRESSION :
				setNameExpression((StringExpression) null);
				return;
			case UMLPackage.REDEFINABLE_TEMPLATE_SIGNATURE__IS_LEAF :
				setIsLeaf(IS_LEAF_EDEFAULT);
				return;
			case UMLPackage.REDEFINABLE_TEMPLATE_SIGNATURE__PARAMETER :
				getParameters().clear();
				return;
			case UMLPackage.REDEFINABLE_TEMPLATE_SIGNATURE__OWNED_PARAMETER :
				getOwnedParameters().clear();
				return;
			case UMLPackage.REDEFINABLE_TEMPLATE_SIGNATURE__TEMPLATE :
				setTemplate((TemplateableElement) null);
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case UMLPackage.REDEFINABLE_TEMPLATE_SIGNATURE__EANNOTATIONS :
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UMLPackage.REDEFINABLE_TEMPLATE_SIGNATURE__OWNED_ELEMENT :
				return isSetOwnedElements();
			case UMLPackage.REDEFINABLE_TEMPLATE_SIGNATURE__OWNER :
				return isSetOwner();
			case UMLPackage.REDEFINABLE_TEMPLATE_SIGNATURE__OWNED_COMMENT :
				return ownedComments != null && !ownedComments.isEmpty();
			case UMLPackage.REDEFINABLE_TEMPLATE_SIGNATURE__NAME :
				return isSetName();
			case UMLPackage.REDEFINABLE_TEMPLATE_SIGNATURE__VISIBILITY :
				return isSetVisibility();
			case UMLPackage.REDEFINABLE_TEMPLATE_SIGNATURE__QUALIFIED_NAME :
				return QUALIFIED_NAME_EDEFAULT == null
					? getQualifiedName() != null
					: !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case UMLPackage.REDEFINABLE_TEMPLATE_SIGNATURE__CLIENT_DEPENDENCY :
				return clientDependencies != null
					&& !clientDependencies.isEmpty();
			case UMLPackage.REDEFINABLE_TEMPLATE_SIGNATURE__NAMESPACE :
				return isSetNamespace();
			case UMLPackage.REDEFINABLE_TEMPLATE_SIGNATURE__NAME_EXPRESSION :
				return nameExpression != null;
			case UMLPackage.REDEFINABLE_TEMPLATE_SIGNATURE__IS_LEAF :
				return ((eFlags & IS_LEAF_EFLAG) != 0) != IS_LEAF_EDEFAULT;
			case UMLPackage.REDEFINABLE_TEMPLATE_SIGNATURE__REDEFINED_ELEMENT :
				return isSetRedefinedElements();
			case UMLPackage.REDEFINABLE_TEMPLATE_SIGNATURE__REDEFINITION_CONTEXT :
				return isSetRedefinitionContexts();
			case UMLPackage.REDEFINABLE_TEMPLATE_SIGNATURE__PARAMETER :
				return parameters != null && !parameters.isEmpty();
			case UMLPackage.REDEFINABLE_TEMPLATE_SIGNATURE__OWNED_PARAMETER :
				return ownedParameters != null && !ownedParameters.isEmpty();
			case UMLPackage.REDEFINABLE_TEMPLATE_SIGNATURE__TEMPLATE :
				return basicGetTemplate() != null;
			case UMLPackage.REDEFINABLE_TEMPLATE_SIGNATURE__EXTENDED_SIGNATURE :
				return extendedSignatures != null
					&& !extendedSignatures.isEmpty();
			case UMLPackage.REDEFINABLE_TEMPLATE_SIGNATURE__INHERITED_PARAMETER :
				return !getInheritedParameters().isEmpty();
			case UMLPackage.REDEFINABLE_TEMPLATE_SIGNATURE__CLASSIFIER :
				return basicGetClassifier() != null;
		}
		return eDynamicIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class baseClass) {
		if (baseClass == TemplateSignature.class) {
			switch (derivedFeatureID) {
				case UMLPackage.REDEFINABLE_TEMPLATE_SIGNATURE__PARAMETER :
					return UMLPackage.TEMPLATE_SIGNATURE__PARAMETER;
				case UMLPackage.REDEFINABLE_TEMPLATE_SIGNATURE__OWNED_PARAMETER :
					return UMLPackage.TEMPLATE_SIGNATURE__OWNED_PARAMETER;
				case UMLPackage.REDEFINABLE_TEMPLATE_SIGNATURE__TEMPLATE :
					return UMLPackage.TEMPLATE_SIGNATURE__TEMPLATE;
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
		if (baseClass == TemplateSignature.class) {
			switch (baseFeatureID) {
				case UMLPackage.TEMPLATE_SIGNATURE__PARAMETER :
					return UMLPackage.REDEFINABLE_TEMPLATE_SIGNATURE__PARAMETER;
				case UMLPackage.TEMPLATE_SIGNATURE__OWNED_PARAMETER :
					return UMLPackage.REDEFINABLE_TEMPLATE_SIGNATURE__OWNED_PARAMETER;
				case UMLPackage.TEMPLATE_SIGNATURE__TEMPLATE :
					return UMLPackage.REDEFINABLE_TEMPLATE_SIGNATURE__TEMPLATE;
				default :
					return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
	protected static final int[] PARAMETER_ESUBSETS = new int[]{UMLPackage.REDEFINABLE_TEMPLATE_SIGNATURE__OWNED_PARAMETER};

	/**
	 * The array of superset feature identifiers for the '{@link #getOwnedParameters() <em>Owned Parameter</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedParameters()
	 * @generated
	 * @ordered
	 */
	protected static final int[] OWNED_PARAMETER_ESUPERSETS = new int[]{UMLPackage.REDEFINABLE_TEMPLATE_SIGNATURE__PARAMETER};

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
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
	public Element basicGetOwner() {

		TemplateableElement template = basicGetTemplate();
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
			|| eIsSet(UMLPackage.REDEFINABLE_TEMPLATE_SIGNATURE__TEMPLATE);
	}

	/**
	 * The array of subset feature identifiers for the '{@link #getRedefinedElements() <em>Redefined Element</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRedefinedElements()
	 * @generated
	 * @ordered
	 */
	protected static final int[] REDEFINED_ELEMENT_ESUBSETS = new int[]{UMLPackage.REDEFINABLE_TEMPLATE_SIGNATURE__EXTENDED_SIGNATURE};

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOwnedElements() {
		return super.isSetOwnedElements()
			|| eIsSet(UMLPackage.REDEFINABLE_TEMPLATE_SIGNATURE__OWNED_PARAMETER);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRedefinedElements() {
		return super.isSetRedefinedElements()
			|| eIsSet(UMLPackage.REDEFINABLE_TEMPLATE_SIGNATURE__EXTENDED_SIGNATURE);
	}

	/**
	 * The array of subset feature identifiers for the '{@link #getRedefinitionContexts() <em>Redefinition Context</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRedefinitionContexts()
	 * @generated
	 * @ordered
	 */
	protected static final int[] REDEFINITION_CONTEXT_ESUBSETS = new int[]{UMLPackage.REDEFINABLE_TEMPLATE_SIGNATURE__CLASSIFIER};

	/**
	 * The array of superset feature identifiers for the '{@link #getInheritedParameters() <em>Inherited Parameter</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInheritedParameters()
	 * @generated
	 * @ordered
	 */
	protected static final int[] INHERITED_PARAMETER_ESUPERSETS = new int[]{UMLPackage.REDEFINABLE_TEMPLATE_SIGNATURE__PARAMETER};

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRedefinitionContexts() {
		return super.isSetRedefinitionContexts()
			|| eIsSet(UMLPackage.REDEFINABLE_TEMPLATE_SIGNATURE__CLASSIFIER);
	}

} //RedefinableTemplateSignatureImpl
