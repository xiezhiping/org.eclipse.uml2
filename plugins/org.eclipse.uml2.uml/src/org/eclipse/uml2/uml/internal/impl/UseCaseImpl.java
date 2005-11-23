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
 * $Id: UseCaseImpl.java,v 1.3 2005/11/23 13:27:43 khussey Exp $
 */
package org.eclipse.uml2.uml.internal.impl;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.uml2.common.util.CacheAdapter;
import org.eclipse.uml2.common.util.DerivedUnionEObjectEList;

import org.eclipse.uml2.uml.Behavior;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.CollaborationUse;
import org.eclipse.uml2.uml.Extend;
import org.eclipse.uml2.uml.ExtensionPoint;
import org.eclipse.uml2.uml.Include;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.RedefinableTemplateSignature;
import org.eclipse.uml2.uml.StringExpression;
import org.eclipse.uml2.uml.TemplateParameter;
import org.eclipse.uml2.uml.TemplateSignature;
import org.eclipse.uml2.uml.UMLFactory;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.UseCase;
import org.eclipse.uml2.uml.VisibilityKind;

import org.eclipse.uml2.uml.internal.operations.UseCaseOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Use Case</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.UseCaseImpl#getOwnedMembers <em>Owned Member</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.UseCaseImpl#getIncludes <em>Include</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.UseCaseImpl#getExtends <em>Extend</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.UseCaseImpl#getExtensionPoints <em>Extension Point</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.UseCaseImpl#getSubjects <em>Subject</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UseCaseImpl
		extends BehavioredClassifierImpl
		implements UseCase {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UseCaseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return UMLPackage.eINSTANCE.getUseCase();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List getOwnedMembers() {
		List ownedMember = (List) eVirtualGet(UMLPackage.USE_CASE__OWNED_MEMBER);
		if (ownedMember == null) {
			eVirtualSet(UMLPackage.USE_CASE__OWNED_MEMBER,
				ownedMember = new DerivedUnionEObjectEList(NamedElement.class,
					this, UMLPackage.USE_CASE__OWNED_MEMBER, new int[]{
						UMLPackage.USE_CASE__OWNED_RULE,
						UMLPackage.USE_CASE__OWNED_USE_CASE,
						UMLPackage.USE_CASE__OWNED_BEHAVIOR,
						UMLPackage.USE_CASE__OWNED_TRIGGER,
						UMLPackage.USE_CASE__INCLUDE,
						UMLPackage.USE_CASE__EXTEND,
						UMLPackage.USE_CASE__EXTENSION_POINT}));
		}
		return ownedMember;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List getIncludes() {
		List include = (List) eVirtualGet(UMLPackage.USE_CASE__INCLUDE);
		if (include == null) {
			eVirtualSet(UMLPackage.USE_CASE__INCLUDE,
				include = new EObjectContainmentWithInverseEList(Include.class,
					this, UMLPackage.USE_CASE__INCLUDE,
					UMLPackage.INCLUDE__INCLUDING_CASE));
		}
		return include;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Include createInclude() {
		Include newInclude = UMLFactory.eINSTANCE.createInclude();
		getIncludes().add(newInclude);
		return newInclude;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Include getInclude(String name) {
		for (Iterator i = getIncludes().iterator(); i.hasNext();) {
			Include include = (Include) i.next();
			if (name.equals(include.getName())) {
				return include;
			}
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List getExtends() {
		List extend = (List) eVirtualGet(UMLPackage.USE_CASE__EXTEND);
		if (extend == null) {
			eVirtualSet(UMLPackage.USE_CASE__EXTEND,
				extend = new EObjectContainmentWithInverseEList(Extend.class,
					this, UMLPackage.USE_CASE__EXTEND,
					UMLPackage.EXTEND__EXTENSION));
		}
		return extend;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Extend createExtend() {
		Extend newExtend = UMLFactory.eINSTANCE.createExtend();
		getExtends().add(newExtend);
		return newExtend;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Extend getExtend(String name) {
		for (Iterator i = getExtends().iterator(); i.hasNext();) {
			Extend extend = (Extend) i.next();
			if (name.equals(extend.getName())) {
				return extend;
			}
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List getExtensionPoints() {
		List extensionPoint = (List) eVirtualGet(UMLPackage.USE_CASE__EXTENSION_POINT);
		if (extensionPoint == null) {
			eVirtualSet(UMLPackage.USE_CASE__EXTENSION_POINT,
				extensionPoint = new EObjectContainmentWithInverseEList(
					ExtensionPoint.class, this,
					UMLPackage.USE_CASE__EXTENSION_POINT,
					UMLPackage.EXTENSION_POINT__USE_CASE));
		}
		return extensionPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExtensionPoint createExtensionPoint() {
		ExtensionPoint newExtensionPoint = UMLFactory.eINSTANCE
			.createExtensionPoint();
		getExtensionPoints().add(newExtensionPoint);
		return newExtensionPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExtensionPoint getExtensionPoint(String name) {
		for (Iterator i = getExtensionPoints().iterator(); i.hasNext();) {
			ExtensionPoint extensionPoint = (ExtensionPoint) i.next();
			if (name.equals(extensionPoint.getName())) {
				return extensionPoint;
			}
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List getSubjects() {
		List subject = (List) eVirtualGet(UMLPackage.USE_CASE__SUBJECT);
		if (subject == null) {
			eVirtualSet(UMLPackage.USE_CASE__SUBJECT,
				subject = new EObjectWithInverseResolvingEList.ManyInverse(
					Classifier.class, this, UMLPackage.USE_CASE__SUBJECT,
					UMLPackage.CLASSIFIER__USE_CASE));
		}
		return subject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Classifier getSubject(String name) {
		for (Iterator i = getSubjects().iterator(); i.hasNext();) {
			Classifier subject = (Classifier) i.next();
			if (name.equals(subject.getName())) {
				return subject;
			}
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMustHaveName(DiagnosticChain diagnostics, Map context) {
		return UseCaseOperations.validateMustHaveName(this, diagnostics,
			context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBinaryAssociations(DiagnosticChain diagnostics,
			Map context) {
		return UseCaseOperations.validateBinaryAssociations(this, diagnostics,
			context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNoAssociationToUseCase(DiagnosticChain diagnostics,
			Map context) {
		return UseCaseOperations.validateNoAssociationToUseCase(this,
			diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCannotIncludeSelf(DiagnosticChain diagnostics,
			Map context) {
		return UseCaseOperations.validateCannotIncludeSelf(this, diagnostics,
			context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List allIncludedUseCases() {
		CacheAdapter cache = getCacheAdapter();
		if (cache != null) {
			List result = (List) cache.get(this, UMLPackage.eINSTANCE
				.getUseCase().getEOperations().get(4));
			if (result == null) {
				cache.put(this, UMLPackage.eINSTANCE.getUseCase()
					.getEOperations().get(4), result = UseCaseOperations
					.allIncludedUseCases(this));
			}
			return result;
		}
		return UseCaseOperations.allIncludedUseCases(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd,
			int featureID, Class baseClass, NotificationChain msgs) {
		if (featureID >= 0) {
			switch (eDerivedStructuralFeatureID(featureID, baseClass)) {
				case UMLPackage.USE_CASE__EANNOTATIONS :
					return ((InternalEList) getEAnnotations()).basicAdd(
						otherEnd, msgs);
				case UMLPackage.USE_CASE__CLIENT_DEPENDENCY :
					return ((InternalEList) getClientDependencies()).basicAdd(
						otherEnd, msgs);
				case UMLPackage.USE_CASE__ELEMENT_IMPORT :
					return ((InternalEList) getElementImports()).basicAdd(
						otherEnd, msgs);
				case UMLPackage.USE_CASE__PACKAGE_IMPORT :
					return ((InternalEList) getPackageImports()).basicAdd(
						otherEnd, msgs);
				case UMLPackage.USE_CASE__OWNED_RULE :
					return ((InternalEList) getOwnedRules()).basicAdd(otherEnd,
						msgs);
				case UMLPackage.USE_CASE__TEMPLATE_PARAMETER :
					TemplateParameter templateParameter = (TemplateParameter) eVirtualGet(UMLPackage.USE_CASE__TEMPLATE_PARAMETER);
					if (templateParameter != null)
						msgs = ((InternalEObject) templateParameter)
							.eInverseRemove(
								this,
								UMLPackage.TEMPLATE_PARAMETER__PARAMETERED_ELEMENT,
								TemplateParameter.class, msgs);
					return basicSetTemplateParameter(
						(TemplateParameter) otherEnd, msgs);
				case UMLPackage.USE_CASE__OWNING_TEMPLATE_PARAMETER :
					if (eInternalContainer() != null)
						msgs = eBasicRemoveFromContainer(msgs);
					return eBasicSetContainer(otherEnd,
						UMLPackage.USE_CASE__OWNING_TEMPLATE_PARAMETER, msgs);
				case UMLPackage.USE_CASE__TEMPLATE_BINDING :
					return ((InternalEList) getTemplateBindings()).basicAdd(
						otherEnd, msgs);
				case UMLPackage.USE_CASE__OWNED_TEMPLATE_SIGNATURE :
					TemplateSignature ownedTemplateSignature = (TemplateSignature) eVirtualGet(UMLPackage.USE_CASE__OWNED_TEMPLATE_SIGNATURE);
					if (ownedTemplateSignature != null)
						msgs = ((InternalEObject) ownedTemplateSignature)
							.eInverseRemove(
								this,
								EOPPOSITE_FEATURE_BASE
									- UMLPackage.USE_CASE__OWNED_TEMPLATE_SIGNATURE,
								null, msgs);
					return basicSetOwnedTemplateSignature(
						(TemplateSignature) otherEnd, msgs);
				case UMLPackage.USE_CASE__GENERALIZATION :
					return ((InternalEList) getGeneralizations()).basicAdd(
						otherEnd, msgs);
				case UMLPackage.USE_CASE__POWERTYPE_EXTENT :
					return ((InternalEList) getPowertypeExtents()).basicAdd(
						otherEnd, msgs);
				case UMLPackage.USE_CASE__USE_CASE :
					return ((InternalEList) getUseCases()).basicAdd(otherEnd,
						msgs);
				case UMLPackage.USE_CASE__SUBSTITUTION :
					return ((InternalEList) getSubstitutions()).basicAdd(
						otherEnd, msgs);
				case UMLPackage.USE_CASE__OWNED_SIGNATURE :
					RedefinableTemplateSignature ownedSignature = (RedefinableTemplateSignature) eVirtualGet(UMLPackage.USE_CASE__OWNED_SIGNATURE);
					if (ownedSignature != null)
						msgs = ((InternalEObject) ownedSignature)
							.eInverseRemove(this, EOPPOSITE_FEATURE_BASE
								- UMLPackage.USE_CASE__OWNED_SIGNATURE, null,
								msgs);
					return basicSetOwnedSignature(
						(RedefinableTemplateSignature) otherEnd, msgs);
				case UMLPackage.USE_CASE__INTERFACE_REALIZATION :
					return ((InternalEList) getInterfaceRealizations())
						.basicAdd(otherEnd, msgs);
				case UMLPackage.USE_CASE__INCLUDE :
					return ((InternalEList) getIncludes()).basicAdd(otherEnd,
						msgs);
				case UMLPackage.USE_CASE__EXTEND :
					return ((InternalEList) getExtends()).basicAdd(otherEnd,
						msgs);
				case UMLPackage.USE_CASE__EXTENSION_POINT :
					return ((InternalEList) getExtensionPoints()).basicAdd(
						otherEnd, msgs);
				case UMLPackage.USE_CASE__SUBJECT :
					return ((InternalEList) getSubjects()).basicAdd(otherEnd,
						msgs);
				default :
					return eDynamicInverseAdd(otherEnd, featureID, baseClass,
						msgs);
			}
		}
		if (eInternalContainer() != null)
			msgs = eBasicRemoveFromContainer(msgs);
		return eBasicSetContainer(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd,
			int featureID, Class baseClass, NotificationChain msgs) {
		if (featureID >= 0) {
			switch (eDerivedStructuralFeatureID(featureID, baseClass)) {
				case UMLPackage.USE_CASE__EANNOTATIONS :
					return ((InternalEList) getEAnnotations()).basicRemove(
						otherEnd, msgs);
				case UMLPackage.USE_CASE__OWNED_COMMENT :
					return ((InternalEList) getOwnedComments()).basicRemove(
						otherEnd, msgs);
				case UMLPackage.USE_CASE__CLIENT_DEPENDENCY :
					return ((InternalEList) getClientDependencies())
						.basicRemove(otherEnd, msgs);
				case UMLPackage.USE_CASE__NAME_EXPRESSION :
					return basicSetNameExpression(null, msgs);
				case UMLPackage.USE_CASE__ELEMENT_IMPORT :
					return ((InternalEList) getElementImports()).basicRemove(
						otherEnd, msgs);
				case UMLPackage.USE_CASE__PACKAGE_IMPORT :
					return ((InternalEList) getPackageImports()).basicRemove(
						otherEnd, msgs);
				case UMLPackage.USE_CASE__OWNED_RULE :
					return ((InternalEList) getOwnedRules()).basicRemove(
						otherEnd, msgs);
				case UMLPackage.USE_CASE__TEMPLATE_PARAMETER :
					return basicSetTemplateParameter(null, msgs);
				case UMLPackage.USE_CASE__OWNING_TEMPLATE_PARAMETER :
					return eBasicSetContainer(null,
						UMLPackage.USE_CASE__OWNING_TEMPLATE_PARAMETER, msgs);
				case UMLPackage.USE_CASE__TEMPLATE_BINDING :
					return ((InternalEList) getTemplateBindings()).basicRemove(
						otherEnd, msgs);
				case UMLPackage.USE_CASE__OWNED_TEMPLATE_SIGNATURE :
					return basicSetOwnedTemplateSignature(null, msgs);
				case UMLPackage.USE_CASE__GENERALIZATION :
					return ((InternalEList) getGeneralizations()).basicRemove(
						otherEnd, msgs);
				case UMLPackage.USE_CASE__POWERTYPE_EXTENT :
					return ((InternalEList) getPowertypeExtents()).basicRemove(
						otherEnd, msgs);
				case UMLPackage.USE_CASE__OWNED_USE_CASE :
					return ((InternalEList) getOwnedUseCases()).basicRemove(
						otherEnd, msgs);
				case UMLPackage.USE_CASE__USE_CASE :
					return ((InternalEList) getUseCases()).basicRemove(
						otherEnd, msgs);
				case UMLPackage.USE_CASE__SUBSTITUTION :
					return ((InternalEList) getSubstitutions()).basicRemove(
						otherEnd, msgs);
				case UMLPackage.USE_CASE__COLLABORATION_USE :
					return ((InternalEList) getCollaborationUses())
						.basicRemove(otherEnd, msgs);
				case UMLPackage.USE_CASE__OWNED_SIGNATURE :
					return basicSetOwnedSignature(null, msgs);
				case UMLPackage.USE_CASE__OWNED_BEHAVIOR :
					return ((InternalEList) getOwnedBehaviors()).basicRemove(
						otherEnd, msgs);
				case UMLPackage.USE_CASE__INTERFACE_REALIZATION :
					return ((InternalEList) getInterfaceRealizations())
						.basicRemove(otherEnd, msgs);
				case UMLPackage.USE_CASE__OWNED_TRIGGER :
					return ((InternalEList) getOwnedTriggers()).basicRemove(
						otherEnd, msgs);
				case UMLPackage.USE_CASE__INCLUDE :
					return ((InternalEList) getIncludes()).basicRemove(
						otherEnd, msgs);
				case UMLPackage.USE_CASE__EXTEND :
					return ((InternalEList) getExtends()).basicRemove(otherEnd,
						msgs);
				case UMLPackage.USE_CASE__EXTENSION_POINT :
					return ((InternalEList) getExtensionPoints()).basicRemove(
						otherEnd, msgs);
				case UMLPackage.USE_CASE__SUBJECT :
					return ((InternalEList) getSubjects()).basicRemove(
						otherEnd, msgs);
				default :
					return eDynamicInverseRemove(otherEnd, featureID,
						baseClass, msgs);
			}
		}
		return eBasicSetContainer(null, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UMLPackage.USE_CASE__EANNOTATIONS :
				return getEAnnotations();
			case UMLPackage.USE_CASE__OWNED_ELEMENT :
				return getOwnedElements();
			case UMLPackage.USE_CASE__OWNER :
				return getOwner();
			case UMLPackage.USE_CASE__OWNED_COMMENT :
				return getOwnedComments();
			case UMLPackage.USE_CASE__NAME :
				return getName();
			case UMLPackage.USE_CASE__VISIBILITY :
				return getVisibility();
			case UMLPackage.USE_CASE__QUALIFIED_NAME :
				return getQualifiedName();
			case UMLPackage.USE_CASE__CLIENT_DEPENDENCY :
				return getClientDependencies();
			case UMLPackage.USE_CASE__NAMESPACE :
				if (resolve)
					return getNamespace();
				return basicGetNamespace();
			case UMLPackage.USE_CASE__NAME_EXPRESSION :
				return getNameExpression();
			case UMLPackage.USE_CASE__ELEMENT_IMPORT :
				return getElementImports();
			case UMLPackage.USE_CASE__PACKAGE_IMPORT :
				return getPackageImports();
			case UMLPackage.USE_CASE__OWNED_RULE :
				return getOwnedRules();
			case UMLPackage.USE_CASE__MEMBER :
				return getMembers();
			case UMLPackage.USE_CASE__IMPORTED_MEMBER :
				return getImportedMembers();
			case UMLPackage.USE_CASE__OWNED_MEMBER :
				return getOwnedMembers();
			case UMLPackage.USE_CASE__IS_LEAF :
				return isLeaf()
					? Boolean.TRUE
					: Boolean.FALSE;
			case UMLPackage.USE_CASE__REDEFINED_ELEMENT :
				return getRedefinedElements();
			case UMLPackage.USE_CASE__REDEFINITION_CONTEXT :
				return getRedefinitionContexts();
			case UMLPackage.USE_CASE__TEMPLATE_PARAMETER :
				if (resolve)
					return getTemplateParameter();
				return basicGetTemplateParameter();
			case UMLPackage.USE_CASE__OWNING_TEMPLATE_PARAMETER :
				if (resolve)
					return getOwningTemplateParameter();
				return basicGetOwningTemplateParameter();
			case UMLPackage.USE_CASE__PACKAGE :
				return getPackage();
			case UMLPackage.USE_CASE__TEMPLATE_BINDING :
				return getTemplateBindings();
			case UMLPackage.USE_CASE__OWNED_TEMPLATE_SIGNATURE :
				return getOwnedTemplateSignature();
			case UMLPackage.USE_CASE__IS_ABSTRACT :
				return isAbstract()
					? Boolean.TRUE
					: Boolean.FALSE;
			case UMLPackage.USE_CASE__GENERALIZATION :
				return getGeneralizations();
			case UMLPackage.USE_CASE__POWERTYPE_EXTENT :
				return getPowertypeExtents();
			case UMLPackage.USE_CASE__FEATURE :
				return getFeatures();
			case UMLPackage.USE_CASE__INHERITED_MEMBER :
				return getInheritedMembers();
			case UMLPackage.USE_CASE__REDEFINED_CLASSIFIER :
				return getRedefinedClassifiers();
			case UMLPackage.USE_CASE__GENERAL :
				return getGenerals();
			case UMLPackage.USE_CASE__OWNED_USE_CASE :
				return getOwnedUseCases();
			case UMLPackage.USE_CASE__USE_CASE :
				return getUseCases();
			case UMLPackage.USE_CASE__SUBSTITUTION :
				return getSubstitutions();
			case UMLPackage.USE_CASE__ATTRIBUTE :
				return getAttributes();
			case UMLPackage.USE_CASE__REPRESENTATION :
				return getRepresentation();
			case UMLPackage.USE_CASE__COLLABORATION_USE :
				return getCollaborationUses();
			case UMLPackage.USE_CASE__OWNED_SIGNATURE :
				return getOwnedSignature();
			case UMLPackage.USE_CASE__OWNED_BEHAVIOR :
				return getOwnedBehaviors();
			case UMLPackage.USE_CASE__CLASSIFIER_BEHAVIOR :
				return getClassifierBehavior();
			case UMLPackage.USE_CASE__INTERFACE_REALIZATION :
				return getInterfaceRealizations();
			case UMLPackage.USE_CASE__OWNED_TRIGGER :
				return getOwnedTriggers();
			case UMLPackage.USE_CASE__INCLUDE :
				return getIncludes();
			case UMLPackage.USE_CASE__EXTEND :
				return getExtends();
			case UMLPackage.USE_CASE__EXTENSION_POINT :
				return getExtensionPoints();
			case UMLPackage.USE_CASE__SUBJECT :
				return getSubjects();
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
			case UMLPackage.USE_CASE__EANNOTATIONS :
				getEAnnotations().clear();
				getEAnnotations().addAll((Collection) newValue);
				return;
			case UMLPackage.USE_CASE__OWNED_COMMENT :
				getOwnedComments().clear();
				getOwnedComments().addAll((Collection) newValue);
				return;
			case UMLPackage.USE_CASE__NAME :
				setName((String) newValue);
				return;
			case UMLPackage.USE_CASE__VISIBILITY :
				setVisibility((VisibilityKind) newValue);
				return;
			case UMLPackage.USE_CASE__CLIENT_DEPENDENCY :
				getClientDependencies().clear();
				getClientDependencies().addAll((Collection) newValue);
				return;
			case UMLPackage.USE_CASE__NAME_EXPRESSION :
				setNameExpression((StringExpression) newValue);
				return;
			case UMLPackage.USE_CASE__ELEMENT_IMPORT :
				getElementImports().clear();
				getElementImports().addAll((Collection) newValue);
				return;
			case UMLPackage.USE_CASE__PACKAGE_IMPORT :
				getPackageImports().clear();
				getPackageImports().addAll((Collection) newValue);
				return;
			case UMLPackage.USE_CASE__OWNED_RULE :
				getOwnedRules().clear();
				getOwnedRules().addAll((Collection) newValue);
				return;
			case UMLPackage.USE_CASE__IS_LEAF :
				setIsLeaf(((Boolean) newValue).booleanValue());
				return;
			case UMLPackage.USE_CASE__TEMPLATE_PARAMETER :
				setTemplateParameter((TemplateParameter) newValue);
				return;
			case UMLPackage.USE_CASE__OWNING_TEMPLATE_PARAMETER :
				setOwningTemplateParameter((TemplateParameter) newValue);
				return;
			case UMLPackage.USE_CASE__PACKAGE :
				setPackage((org.eclipse.uml2.uml.Package) newValue);
				return;
			case UMLPackage.USE_CASE__TEMPLATE_BINDING :
				getTemplateBindings().clear();
				getTemplateBindings().addAll((Collection) newValue);
				return;
			case UMLPackage.USE_CASE__OWNED_TEMPLATE_SIGNATURE :
				setOwnedTemplateSignature((TemplateSignature) newValue);
				return;
			case UMLPackage.USE_CASE__IS_ABSTRACT :
				setIsAbstract(((Boolean) newValue).booleanValue());
				return;
			case UMLPackage.USE_CASE__GENERALIZATION :
				getGeneralizations().clear();
				getGeneralizations().addAll((Collection) newValue);
				return;
			case UMLPackage.USE_CASE__POWERTYPE_EXTENT :
				getPowertypeExtents().clear();
				getPowertypeExtents().addAll((Collection) newValue);
				return;
			case UMLPackage.USE_CASE__INHERITED_MEMBER :
				getInheritedMembers().clear();
				getInheritedMembers().addAll((Collection) newValue);
				return;
			case UMLPackage.USE_CASE__REDEFINED_CLASSIFIER :
				getRedefinedClassifiers().clear();
				getRedefinedClassifiers().addAll((Collection) newValue);
				return;
			case UMLPackage.USE_CASE__GENERAL :
				getGenerals().clear();
				getGenerals().addAll((Collection) newValue);
				return;
			case UMLPackage.USE_CASE__OWNED_USE_CASE :
				getOwnedUseCases().clear();
				getOwnedUseCases().addAll((Collection) newValue);
				return;
			case UMLPackage.USE_CASE__USE_CASE :
				getUseCases().clear();
				getUseCases().addAll((Collection) newValue);
				return;
			case UMLPackage.USE_CASE__SUBSTITUTION :
				getSubstitutions().clear();
				getSubstitutions().addAll((Collection) newValue);
				return;
			case UMLPackage.USE_CASE__REPRESENTATION :
				setRepresentation((CollaborationUse) newValue);
				return;
			case UMLPackage.USE_CASE__COLLABORATION_USE :
				getCollaborationUses().clear();
				getCollaborationUses().addAll((Collection) newValue);
				return;
			case UMLPackage.USE_CASE__OWNED_SIGNATURE :
				setOwnedSignature((RedefinableTemplateSignature) newValue);
				return;
			case UMLPackage.USE_CASE__OWNED_BEHAVIOR :
				getOwnedBehaviors().clear();
				getOwnedBehaviors().addAll((Collection) newValue);
				return;
			case UMLPackage.USE_CASE__CLASSIFIER_BEHAVIOR :
				setClassifierBehavior((Behavior) newValue);
				return;
			case UMLPackage.USE_CASE__INTERFACE_REALIZATION :
				getInterfaceRealizations().clear();
				getInterfaceRealizations().addAll((Collection) newValue);
				return;
			case UMLPackage.USE_CASE__OWNED_TRIGGER :
				getOwnedTriggers().clear();
				getOwnedTriggers().addAll((Collection) newValue);
				return;
			case UMLPackage.USE_CASE__INCLUDE :
				getIncludes().clear();
				getIncludes().addAll((Collection) newValue);
				return;
			case UMLPackage.USE_CASE__EXTEND :
				getExtends().clear();
				getExtends().addAll((Collection) newValue);
				return;
			case UMLPackage.USE_CASE__EXTENSION_POINT :
				getExtensionPoints().clear();
				getExtensionPoints().addAll((Collection) newValue);
				return;
			case UMLPackage.USE_CASE__SUBJECT :
				getSubjects().clear();
				getSubjects().addAll((Collection) newValue);
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
			case UMLPackage.USE_CASE__EANNOTATIONS :
				getEAnnotations().clear();
				return;
			case UMLPackage.USE_CASE__OWNED_COMMENT :
				getOwnedComments().clear();
				return;
			case UMLPackage.USE_CASE__NAME :
				setName(NAME_EDEFAULT);
				return;
			case UMLPackage.USE_CASE__VISIBILITY :
				setVisibility(VISIBILITY_EDEFAULT);
				return;
			case UMLPackage.USE_CASE__CLIENT_DEPENDENCY :
				getClientDependencies().clear();
				return;
			case UMLPackage.USE_CASE__NAME_EXPRESSION :
				setNameExpression((StringExpression) null);
				return;
			case UMLPackage.USE_CASE__ELEMENT_IMPORT :
				getElementImports().clear();
				return;
			case UMLPackage.USE_CASE__PACKAGE_IMPORT :
				getPackageImports().clear();
				return;
			case UMLPackage.USE_CASE__OWNED_RULE :
				getOwnedRules().clear();
				return;
			case UMLPackage.USE_CASE__IS_LEAF :
				setIsLeaf(IS_LEAF_EDEFAULT);
				return;
			case UMLPackage.USE_CASE__TEMPLATE_PARAMETER :
				setTemplateParameter((TemplateParameter) null);
				return;
			case UMLPackage.USE_CASE__OWNING_TEMPLATE_PARAMETER :
				setOwningTemplateParameter((TemplateParameter) null);
				return;
			case UMLPackage.USE_CASE__PACKAGE :
				setPackage((org.eclipse.uml2.uml.Package) null);
				return;
			case UMLPackage.USE_CASE__TEMPLATE_BINDING :
				getTemplateBindings().clear();
				return;
			case UMLPackage.USE_CASE__OWNED_TEMPLATE_SIGNATURE :
				setOwnedTemplateSignature((TemplateSignature) null);
				return;
			case UMLPackage.USE_CASE__IS_ABSTRACT :
				setIsAbstract(IS_ABSTRACT_EDEFAULT);
				return;
			case UMLPackage.USE_CASE__GENERALIZATION :
				getGeneralizations().clear();
				return;
			case UMLPackage.USE_CASE__POWERTYPE_EXTENT :
				getPowertypeExtents().clear();
				return;
			case UMLPackage.USE_CASE__INHERITED_MEMBER :
				getInheritedMembers().clear();
				return;
			case UMLPackage.USE_CASE__REDEFINED_CLASSIFIER :
				getRedefinedClassifiers().clear();
				return;
			case UMLPackage.USE_CASE__GENERAL :
				getGenerals().clear();
				return;
			case UMLPackage.USE_CASE__OWNED_USE_CASE :
				getOwnedUseCases().clear();
				return;
			case UMLPackage.USE_CASE__USE_CASE :
				getUseCases().clear();
				return;
			case UMLPackage.USE_CASE__SUBSTITUTION :
				getSubstitutions().clear();
				return;
			case UMLPackage.USE_CASE__REPRESENTATION :
				setRepresentation((CollaborationUse) null);
				return;
			case UMLPackage.USE_CASE__COLLABORATION_USE :
				getCollaborationUses().clear();
				return;
			case UMLPackage.USE_CASE__OWNED_SIGNATURE :
				setOwnedSignature((RedefinableTemplateSignature) null);
				return;
			case UMLPackage.USE_CASE__OWNED_BEHAVIOR :
				getOwnedBehaviors().clear();
				return;
			case UMLPackage.USE_CASE__CLASSIFIER_BEHAVIOR :
				setClassifierBehavior((Behavior) null);
				return;
			case UMLPackage.USE_CASE__INTERFACE_REALIZATION :
				getInterfaceRealizations().clear();
				return;
			case UMLPackage.USE_CASE__OWNED_TRIGGER :
				getOwnedTriggers().clear();
				return;
			case UMLPackage.USE_CASE__INCLUDE :
				getIncludes().clear();
				return;
			case UMLPackage.USE_CASE__EXTEND :
				getExtends().clear();
				return;
			case UMLPackage.USE_CASE__EXTENSION_POINT :
				getExtensionPoints().clear();
				return;
			case UMLPackage.USE_CASE__SUBJECT :
				getSubjects().clear();
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
			case UMLPackage.USE_CASE__EANNOTATIONS :
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UMLPackage.USE_CASE__OWNED_ELEMENT :
				return isSetOwnedElements();
			case UMLPackage.USE_CASE__OWNER :
				return isSetOwner();
			case UMLPackage.USE_CASE__OWNED_COMMENT :
				List ownedComment = (List) eVirtualGet(UMLPackage.USE_CASE__OWNED_COMMENT);
				return ownedComment != null && !ownedComment.isEmpty();
			case UMLPackage.USE_CASE__NAME :
				String name = (String) eVirtualGet(UMLPackage.USE_CASE__NAME,
					NAME_EDEFAULT);
				return NAME_EDEFAULT == null
					? name != null
					: !NAME_EDEFAULT.equals(name);
			case UMLPackage.USE_CASE__VISIBILITY :
				return isSetVisibility();
			case UMLPackage.USE_CASE__QUALIFIED_NAME :
				return QUALIFIED_NAME_EDEFAULT == null
					? getQualifiedName() != null
					: !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case UMLPackage.USE_CASE__CLIENT_DEPENDENCY :
				List clientDependency = (List) eVirtualGet(UMLPackage.USE_CASE__CLIENT_DEPENDENCY);
				return clientDependency != null && !clientDependency.isEmpty();
			case UMLPackage.USE_CASE__NAMESPACE :
				return isSetNamespace();
			case UMLPackage.USE_CASE__NAME_EXPRESSION :
				return eVirtualGet(UMLPackage.USE_CASE__NAME_EXPRESSION) != null;
			case UMLPackage.USE_CASE__ELEMENT_IMPORT :
				List elementImport = (List) eVirtualGet(UMLPackage.USE_CASE__ELEMENT_IMPORT);
				return elementImport != null && !elementImport.isEmpty();
			case UMLPackage.USE_CASE__PACKAGE_IMPORT :
				List packageImport = (List) eVirtualGet(UMLPackage.USE_CASE__PACKAGE_IMPORT);
				return packageImport != null && !packageImport.isEmpty();
			case UMLPackage.USE_CASE__OWNED_RULE :
				List ownedRule = (List) eVirtualGet(UMLPackage.USE_CASE__OWNED_RULE);
				return ownedRule != null && !ownedRule.isEmpty();
			case UMLPackage.USE_CASE__MEMBER :
				return isSetMembers();
			case UMLPackage.USE_CASE__IMPORTED_MEMBER :
				return !getImportedMembers().isEmpty();
			case UMLPackage.USE_CASE__OWNED_MEMBER :
				return isSetOwnedMembers();
			case UMLPackage.USE_CASE__IS_LEAF :
				return ((eFlags & IS_LEAF_EFLAG) != 0) != IS_LEAF_EDEFAULT;
			case UMLPackage.USE_CASE__REDEFINED_ELEMENT :
				return isSetRedefinedElements();
			case UMLPackage.USE_CASE__REDEFINITION_CONTEXT :
				return isSetRedefinitionContexts();
			case UMLPackage.USE_CASE__TEMPLATE_PARAMETER :
				return isSetTemplateParameter();
			case UMLPackage.USE_CASE__OWNING_TEMPLATE_PARAMETER :
				return basicGetOwningTemplateParameter() != null;
			case UMLPackage.USE_CASE__PACKAGE :
				return getPackage() != null;
			case UMLPackage.USE_CASE__TEMPLATE_BINDING :
				List templateBinding = (List) eVirtualGet(UMLPackage.USE_CASE__TEMPLATE_BINDING);
				return templateBinding != null && !templateBinding.isEmpty();
			case UMLPackage.USE_CASE__OWNED_TEMPLATE_SIGNATURE :
				return eVirtualGet(UMLPackage.USE_CASE__OWNED_TEMPLATE_SIGNATURE) != null;
			case UMLPackage.USE_CASE__IS_ABSTRACT :
				return ((eFlags & IS_ABSTRACT_EFLAG) != 0) != IS_ABSTRACT_EDEFAULT;
			case UMLPackage.USE_CASE__GENERALIZATION :
				List generalization = (List) eVirtualGet(UMLPackage.USE_CASE__GENERALIZATION);
				return generalization != null && !generalization.isEmpty();
			case UMLPackage.USE_CASE__POWERTYPE_EXTENT :
				List powertypeExtent = (List) eVirtualGet(UMLPackage.USE_CASE__POWERTYPE_EXTENT);
				return powertypeExtent != null && !powertypeExtent.isEmpty();
			case UMLPackage.USE_CASE__FEATURE :
				return isSetFeatures();
			case UMLPackage.USE_CASE__INHERITED_MEMBER :
				return !getInheritedMembers().isEmpty();
			case UMLPackage.USE_CASE__REDEFINED_CLASSIFIER :
				List redefinedClassifier = (List) eVirtualGet(UMLPackage.USE_CASE__REDEFINED_CLASSIFIER);
				return redefinedClassifier != null
					&& !redefinedClassifier.isEmpty();
			case UMLPackage.USE_CASE__GENERAL :
				return !getGenerals().isEmpty();
			case UMLPackage.USE_CASE__OWNED_USE_CASE :
				List ownedUseCase = (List) eVirtualGet(UMLPackage.USE_CASE__OWNED_USE_CASE);
				return ownedUseCase != null && !ownedUseCase.isEmpty();
			case UMLPackage.USE_CASE__USE_CASE :
				List useCase = (List) eVirtualGet(UMLPackage.USE_CASE__USE_CASE);
				return useCase != null && !useCase.isEmpty();
			case UMLPackage.USE_CASE__SUBSTITUTION :
				List substitution = (List) eVirtualGet(UMLPackage.USE_CASE__SUBSTITUTION);
				return substitution != null && !substitution.isEmpty();
			case UMLPackage.USE_CASE__ATTRIBUTE :
				return isSetAttributes();
			case UMLPackage.USE_CASE__REPRESENTATION :
				return eVirtualGet(UMLPackage.USE_CASE__REPRESENTATION) != null;
			case UMLPackage.USE_CASE__COLLABORATION_USE :
				List collaborationUse = (List) eVirtualGet(UMLPackage.USE_CASE__COLLABORATION_USE);
				return collaborationUse != null && !collaborationUse.isEmpty();
			case UMLPackage.USE_CASE__OWNED_SIGNATURE :
				return eVirtualGet(UMLPackage.USE_CASE__OWNED_SIGNATURE) != null;
			case UMLPackage.USE_CASE__OWNED_BEHAVIOR :
				List ownedBehavior = (List) eVirtualGet(UMLPackage.USE_CASE__OWNED_BEHAVIOR);
				return ownedBehavior != null && !ownedBehavior.isEmpty();
			case UMLPackage.USE_CASE__CLASSIFIER_BEHAVIOR :
				return eVirtualGet(UMLPackage.USE_CASE__CLASSIFIER_BEHAVIOR) != null;
			case UMLPackage.USE_CASE__INTERFACE_REALIZATION :
				List interfaceRealization = (List) eVirtualGet(UMLPackage.USE_CASE__INTERFACE_REALIZATION);
				return interfaceRealization != null
					&& !interfaceRealization.isEmpty();
			case UMLPackage.USE_CASE__OWNED_TRIGGER :
				List ownedTrigger = (List) eVirtualGet(UMLPackage.USE_CASE__OWNED_TRIGGER);
				return ownedTrigger != null && !ownedTrigger.isEmpty();
			case UMLPackage.USE_CASE__INCLUDE :
				List include = (List) eVirtualGet(UMLPackage.USE_CASE__INCLUDE);
				return include != null && !include.isEmpty();
			case UMLPackage.USE_CASE__EXTEND :
				List extend = (List) eVirtualGet(UMLPackage.USE_CASE__EXTEND);
				return extend != null && !extend.isEmpty();
			case UMLPackage.USE_CASE__EXTENSION_POINT :
				List extensionPoint = (List) eVirtualGet(UMLPackage.USE_CASE__EXTENSION_POINT);
				return extensionPoint != null && !extensionPoint.isEmpty();
			case UMLPackage.USE_CASE__SUBJECT :
				List subject = (List) eVirtualGet(UMLPackage.USE_CASE__SUBJECT);
				return subject != null && !subject.isEmpty();
		}
		return eDynamicIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOwnedMembers() {
		return super.isSetOwnedMembers()
			|| eIsSet(UMLPackage.USE_CASE__INCLUDE)
			|| eIsSet(UMLPackage.USE_CASE__EXTEND)
			|| eIsSet(UMLPackage.USE_CASE__EXTENSION_POINT);
	}

} //UseCaseImpl
