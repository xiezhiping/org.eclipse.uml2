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

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.uml2.common.util.CacheAdapter;
import org.eclipse.uml2.common.util.DerivedUnionEObjectEList;

import org.eclipse.uml2.uml.AggregationKind;
import org.eclipse.uml2.uml.Behavior;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.CollaborationUse;
import org.eclipse.uml2.uml.Comment;
import org.eclipse.uml2.uml.Constraint;
import org.eclipse.uml2.uml.ElementImport;
import org.eclipse.uml2.uml.Extend;
import org.eclipse.uml2.uml.ExtensionPoint;
import org.eclipse.uml2.uml.Generalization;
import org.eclipse.uml2.uml.GeneralizationSet;
import org.eclipse.uml2.uml.Include;
import org.eclipse.uml2.uml.InterfaceRealization;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Namespace;
import org.eclipse.uml2.uml.PackageImport;
import org.eclipse.uml2.uml.PackageableElement;
import org.eclipse.uml2.uml.ParameterableElement;
import org.eclipse.uml2.uml.RedefinableElement;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.StringExpression;
import org.eclipse.uml2.uml.Substitution;
import org.eclipse.uml2.uml.TemplateBinding;
import org.eclipse.uml2.uml.TemplateParameter;
import org.eclipse.uml2.uml.TemplateSignature;
import org.eclipse.uml2.uml.Type;
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
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.UseCaseImpl#getOwnedMembers <em>Owned Member</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.UseCaseImpl#getExtends <em>Extend</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.UseCaseImpl#getExtensionPoints <em>Extension Point</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.UseCaseImpl#getIncludes <em>Include</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.UseCaseImpl#getSubjects <em>Subject</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UseCaseImpl
		extends BehavioredClassifierImpl
		implements UseCase {

	/**
	 * The cached value of the '{@link #getExtends() <em>Extend</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtends()
	 * @generated
	 * @ordered
	 */
	protected EList<Extend> extends_;

	/**
	 * The cached value of the '{@link #getExtensionPoints() <em>Extension Point</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtensionPoints()
	 * @generated
	 * @ordered
	 */
	protected EList<ExtensionPoint> extensionPoints;

	/**
	 * The cached value of the '{@link #getIncludes() <em>Include</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncludes()
	 * @generated
	 * @ordered
	 */
	protected EList<Include> includes;

	/**
	 * The cached value of the '{@link #getSubjects() <em>Subject</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubjects()
	 * @generated
	 * @ordered
	 */
	protected EList<Classifier> subjects;

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
	@Override
	protected EClass eStaticClass() {
		return UMLPackage.Literals.USE_CASE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<NamedElement> getOwnedMembers() {
		CacheAdapter cache = getCacheAdapter();
		if (cache != null) {
			Resource eResource = eResource();
			@SuppressWarnings("unchecked")
			EList<NamedElement> ownedMembers = (EList<NamedElement>) cache.get(
				eResource, this, UMLPackage.Literals.NAMESPACE__OWNED_MEMBER);
			if (ownedMembers == null) {
				cache.put(eResource, this,
					UMLPackage.Literals.NAMESPACE__OWNED_MEMBER,
					ownedMembers = new DerivedUnionEObjectEList<NamedElement>(
						NamedElement.class, this,
						UMLPackage.USE_CASE__OWNED_MEMBER,
						OWNED_MEMBER_ESUBSETS));
			}
			return ownedMembers;
		}
		return new DerivedUnionEObjectEList<NamedElement>(NamedElement.class,
			this, UMLPackage.USE_CASE__OWNED_MEMBER, OWNED_MEMBER_ESUBSETS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Include> getIncludes() {
		if (includes == null) {
			includes = new EObjectContainmentWithInverseEList.Resolving<Include>(
				Include.class, this, UMLPackage.USE_CASE__INCLUDE,
				UMLPackage.INCLUDE__INCLUDING_CASE);
		}
		return includes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Include createInclude(String name, UseCase addition) {
		Include newInclude = (Include) create(UMLPackage.Literals.INCLUDE);
		getIncludes().add(newInclude);
		if (name != null)
			newInclude.setName(name);
		if (addition != null)
			newInclude.setAddition(addition);
		return newInclude;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Include getInclude(String name, UseCase addition) {
		return getInclude(name, addition, false, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Include getInclude(String name, UseCase addition, boolean ignoreCase,
			boolean createOnDemand) {
		includeLoop : for (Include include : getIncludes()) {
			if (name != null && !(ignoreCase
				? name.equalsIgnoreCase(include.getName())
				: name.equals(include.getName())))
				continue includeLoop;
			if (addition != null && !addition.equals(include.getAddition()))
				continue includeLoop;
			return include;
		}
		return createOnDemand
			? createInclude(name, addition)
			: null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Extend> getExtends() {
		if (extends_ == null) {
			extends_ = new EObjectContainmentWithInverseEList.Resolving<Extend>(
				Extend.class, this, UMLPackage.USE_CASE__EXTEND,
				UMLPackage.EXTEND__EXTENSION);
		}
		return extends_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Extend createExtend(String name, UseCase extendedCase) {
		Extend newExtend = (Extend) create(UMLPackage.Literals.EXTEND);
		getExtends().add(newExtend);
		if (name != null)
			newExtend.setName(name);
		if (extendedCase != null)
			newExtend.setExtendedCase(extendedCase);
		return newExtend;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Extend getExtend(String name, UseCase extendedCase) {
		return getExtend(name, extendedCase, false, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Extend getExtend(String name, UseCase extendedCase,
			boolean ignoreCase, boolean createOnDemand) {
		extendLoop : for (Extend extend : getExtends()) {
			if (name != null && !(ignoreCase
				? name.equalsIgnoreCase(extend.getName())
				: name.equals(extend.getName())))
				continue extendLoop;
			if (extendedCase != null
				&& !extendedCase.equals(extend.getExtendedCase()))
				continue extendLoop;
			return extend;
		}
		return createOnDemand
			? createExtend(name, extendedCase)
			: null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ExtensionPoint> getExtensionPoints() {
		if (extensionPoints == null) {
			extensionPoints = new EObjectContainmentWithInverseEList.Resolving<ExtensionPoint>(
				ExtensionPoint.class, this,
				UMLPackage.USE_CASE__EXTENSION_POINT,
				UMLPackage.EXTENSION_POINT__USE_CASE);
		}
		return extensionPoints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExtensionPoint createExtensionPoint(String name) {
		ExtensionPoint newExtensionPoint = (ExtensionPoint) create(
			UMLPackage.Literals.EXTENSION_POINT);
		getExtensionPoints().add(newExtensionPoint);
		if (name != null)
			newExtensionPoint.setName(name);
		return newExtensionPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExtensionPoint getExtensionPoint(String name) {
		return getExtensionPoint(name, false, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExtensionPoint getExtensionPoint(String name, boolean ignoreCase,
			boolean createOnDemand) {
		extensionPointLoop : for (ExtensionPoint extensionPoint : getExtensionPoints()) {
			if (name != null && !(ignoreCase
				? name.equalsIgnoreCase(extensionPoint.getName())
				: name.equals(extensionPoint.getName())))
				continue extensionPointLoop;
			return extensionPoint;
		}
		return createOnDemand
			? createExtensionPoint(name)
			: null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Classifier> getSubjects() {
		if (subjects == null) {
			subjects = new EObjectWithInverseResolvingEList.ManyInverse<Classifier>(
				Classifier.class, this, UMLPackage.USE_CASE__SUBJECT,
				UMLPackage.CLASSIFIER__USE_CASE);
		}
		return subjects;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Classifier getSubject(String name) {
		return getSubject(name, false, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Classifier getSubject(String name, boolean ignoreCase,
			EClass eClass) {
		subjectLoop : for (Classifier subject : getSubjects()) {
			if (eClass != null && !eClass.isInstance(subject))
				continue subjectLoop;
			if (name != null && !(ignoreCase
				? name.equalsIgnoreCase(subject.getName())
				: name.equals(subject.getName())))
				continue subjectLoop;
			return subject;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMustHaveName(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return UseCaseOperations.validateMustHaveName(this, diagnostics,
			context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBinaryAssociations(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return UseCaseOperations.validateBinaryAssociations(this, diagnostics,
			context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNoAssociationToUseCase(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return UseCaseOperations.validateNoAssociationToUseCase(this,
			diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCannotIncludeSelf(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return UseCaseOperations.validateCannotIncludeSelf(this, diagnostics,
			context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UseCase> allIncludedUseCases() {
		CacheAdapter cache = getCacheAdapter();
		if (cache != null) {
			@SuppressWarnings("unchecked")
			EList<UseCase> result = (EList<UseCase>) cache.get(this,
				UMLPackage.Literals.USE_CASE___ALL_INCLUDED_USE_CASES);
			if (result == null) {
				cache.put(this,
					UMLPackage.Literals.USE_CASE___ALL_INCLUDED_USE_CASES,
					result = UseCaseOperations.allIncludedUseCases(this));
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
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UMLPackage.USE_CASE__EANNOTATIONS :
				return ((InternalEList<InternalEObject>) (InternalEList<?>) getEAnnotations())
					.basicAdd(otherEnd, msgs);
			case UMLPackage.USE_CASE__OWNED_RULE :
				return ((InternalEList<InternalEObject>) (InternalEList<?>) getOwnedRules())
					.basicAdd(otherEnd, msgs);
			case UMLPackage.USE_CASE__ELEMENT_IMPORT :
				return ((InternalEList<InternalEObject>) (InternalEList<?>) getElementImports())
					.basicAdd(otherEnd, msgs);
			case UMLPackage.USE_CASE__PACKAGE_IMPORT :
				return ((InternalEList<InternalEObject>) (InternalEList<?>) getPackageImports())
					.basicAdd(otherEnd, msgs);
			case UMLPackage.USE_CASE__OWNING_TEMPLATE_PARAMETER :
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOwningTemplateParameter(
					(TemplateParameter) otherEnd, msgs);
			case UMLPackage.USE_CASE__TEMPLATE_PARAMETER :
				if (templateParameter != null)
					msgs = ((InternalEObject) templateParameter).eInverseRemove(
						this,
						UMLPackage.TEMPLATE_PARAMETER__PARAMETERED_ELEMENT,
						TemplateParameter.class, msgs);
				return basicSetTemplateParameter((TemplateParameter) otherEnd,
					msgs);
			case UMLPackage.USE_CASE__TEMPLATE_BINDING :
				return ((InternalEList<InternalEObject>) (InternalEList<?>) getTemplateBindings())
					.basicAdd(otherEnd, msgs);
			case UMLPackage.USE_CASE__OWNED_TEMPLATE_SIGNATURE :
				if (ownedTemplateSignature != null)
					msgs = ((InternalEObject) ownedTemplateSignature)
						.eInverseRemove(this,
							EOPPOSITE_FEATURE_BASE
								- UMLPackage.USE_CASE__OWNED_TEMPLATE_SIGNATURE,
							null, msgs);
				return basicSetOwnedTemplateSignature(
					(TemplateSignature) otherEnd, msgs);
			case UMLPackage.USE_CASE__GENERALIZATION :
				return ((InternalEList<InternalEObject>) (InternalEList<?>) getGeneralizations())
					.basicAdd(otherEnd, msgs);
			case UMLPackage.USE_CASE__POWERTYPE_EXTENT :
				return ((InternalEList<InternalEObject>) (InternalEList<?>) getPowertypeExtents())
					.basicAdd(otherEnd, msgs);
			case UMLPackage.USE_CASE__USE_CASE :
				return ((InternalEList<InternalEObject>) (InternalEList<?>) getUseCases())
					.basicAdd(otherEnd, msgs);
			case UMLPackage.USE_CASE__SUBSTITUTION :
				return ((InternalEList<InternalEObject>) (InternalEList<?>) getSubstitutions())
					.basicAdd(otherEnd, msgs);
			case UMLPackage.USE_CASE__INTERFACE_REALIZATION :
				return ((InternalEList<InternalEObject>) (InternalEList<?>) getInterfaceRealizations())
					.basicAdd(otherEnd, msgs);
			case UMLPackage.USE_CASE__EXTEND :
				return ((InternalEList<InternalEObject>) (InternalEList<?>) getExtends())
					.basicAdd(otherEnd, msgs);
			case UMLPackage.USE_CASE__EXTENSION_POINT :
				return ((InternalEList<InternalEObject>) (InternalEList<?>) getExtensionPoints())
					.basicAdd(otherEnd, msgs);
			case UMLPackage.USE_CASE__INCLUDE :
				return ((InternalEList<InternalEObject>) (InternalEList<?>) getIncludes())
					.basicAdd(otherEnd, msgs);
			case UMLPackage.USE_CASE__SUBJECT :
				return ((InternalEList<InternalEObject>) (InternalEList<?>) getSubjects())
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
			case UMLPackage.USE_CASE__EANNOTATIONS :
				return ((InternalEList<?>) getEAnnotations())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.USE_CASE__OWNED_COMMENT :
				return ((InternalEList<?>) getOwnedComments())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.USE_CASE__NAME_EXPRESSION :
				return basicSetNameExpression(null, msgs);
			case UMLPackage.USE_CASE__OWNED_RULE :
				return ((InternalEList<?>) getOwnedRules())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.USE_CASE__ELEMENT_IMPORT :
				return ((InternalEList<?>) getElementImports())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.USE_CASE__PACKAGE_IMPORT :
				return ((InternalEList<?>) getPackageImports())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.USE_CASE__OWNING_TEMPLATE_PARAMETER :
				return basicSetOwningTemplateParameter(null, msgs);
			case UMLPackage.USE_CASE__TEMPLATE_PARAMETER :
				return basicSetTemplateParameter(null, msgs);
			case UMLPackage.USE_CASE__TEMPLATE_BINDING :
				return ((InternalEList<?>) getTemplateBindings())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.USE_CASE__OWNED_TEMPLATE_SIGNATURE :
				return basicSetOwnedTemplateSignature(null, msgs);
			case UMLPackage.USE_CASE__COLLABORATION_USE :
				return ((InternalEList<?>) getCollaborationUses())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.USE_CASE__GENERALIZATION :
				return ((InternalEList<?>) getGeneralizations())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.USE_CASE__POWERTYPE_EXTENT :
				return ((InternalEList<?>) getPowertypeExtents())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.USE_CASE__OWNED_USE_CASE :
				return ((InternalEList<?>) getOwnedUseCases())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.USE_CASE__USE_CASE :
				return ((InternalEList<?>) getUseCases()).basicRemove(otherEnd,
					msgs);
			case UMLPackage.USE_CASE__SUBSTITUTION :
				return ((InternalEList<?>) getSubstitutions())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.USE_CASE__INTERFACE_REALIZATION :
				return ((InternalEList<?>) getInterfaceRealizations())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.USE_CASE__OWNED_BEHAVIOR :
				return ((InternalEList<?>) getOwnedBehaviors())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.USE_CASE__EXTEND :
				return ((InternalEList<?>) getExtends()).basicRemove(otherEnd,
					msgs);
			case UMLPackage.USE_CASE__EXTENSION_POINT :
				return ((InternalEList<?>) getExtensionPoints())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.USE_CASE__INCLUDE :
				return ((InternalEList<?>) getIncludes()).basicRemove(otherEnd,
					msgs);
			case UMLPackage.USE_CASE__SUBJECT :
				return ((InternalEList<?>) getSubjects()).basicRemove(otherEnd,
					msgs);
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
			case UMLPackage.USE_CASE__EANNOTATIONS :
				return getEAnnotations();
			case UMLPackage.USE_CASE__OWNED_COMMENT :
				return getOwnedComments();
			case UMLPackage.USE_CASE__OWNED_ELEMENT :
				return getOwnedElements();
			case UMLPackage.USE_CASE__OWNER :
				if (resolve)
					return getOwner();
				return basicGetOwner();
			case UMLPackage.USE_CASE__CLIENT_DEPENDENCY :
				return getClientDependencies();
			case UMLPackage.USE_CASE__NAME :
				return getName();
			case UMLPackage.USE_CASE__NAME_EXPRESSION :
				if (resolve)
					return getNameExpression();
				return basicGetNameExpression();
			case UMLPackage.USE_CASE__NAMESPACE :
				if (resolve)
					return getNamespace();
				return basicGetNamespace();
			case UMLPackage.USE_CASE__QUALIFIED_NAME :
				return getQualifiedName();
			case UMLPackage.USE_CASE__VISIBILITY :
				return getVisibility();
			case UMLPackage.USE_CASE__OWNED_RULE :
				return getOwnedRules();
			case UMLPackage.USE_CASE__ELEMENT_IMPORT :
				return getElementImports();
			case UMLPackage.USE_CASE__PACKAGE_IMPORT :
				return getPackageImports();
			case UMLPackage.USE_CASE__OWNED_MEMBER :
				return getOwnedMembers();
			case UMLPackage.USE_CASE__IMPORTED_MEMBER :
				return getImportedMembers();
			case UMLPackage.USE_CASE__MEMBER :
				return getMembers();
			case UMLPackage.USE_CASE__IS_LEAF :
				return isLeaf();
			case UMLPackage.USE_CASE__REDEFINED_ELEMENT :
				return getRedefinedElements();
			case UMLPackage.USE_CASE__REDEFINITION_CONTEXT :
				return getRedefinitionContexts();
			case UMLPackage.USE_CASE__OWNING_TEMPLATE_PARAMETER :
				if (resolve)
					return getOwningTemplateParameter();
				return basicGetOwningTemplateParameter();
			case UMLPackage.USE_CASE__TEMPLATE_PARAMETER :
				if (resolve)
					return getTemplateParameter();
				return basicGetTemplateParameter();
			case UMLPackage.USE_CASE__PACKAGE :
				if (resolve)
					return getPackage();
				return basicGetPackage();
			case UMLPackage.USE_CASE__TEMPLATE_BINDING :
				return getTemplateBindings();
			case UMLPackage.USE_CASE__OWNED_TEMPLATE_SIGNATURE :
				if (resolve)
					return getOwnedTemplateSignature();
				return basicGetOwnedTemplateSignature();
			case UMLPackage.USE_CASE__FEATURE :
				return getFeatures();
			case UMLPackage.USE_CASE__ATTRIBUTE :
				return getAttributes();
			case UMLPackage.USE_CASE__COLLABORATION_USE :
				return getCollaborationUses();
			case UMLPackage.USE_CASE__GENERAL :
				return getGenerals();
			case UMLPackage.USE_CASE__GENERALIZATION :
				return getGeneralizations();
			case UMLPackage.USE_CASE__POWERTYPE_EXTENT :
				return getPowertypeExtents();
			case UMLPackage.USE_CASE__INHERITED_MEMBER :
				return getInheritedMembers();
			case UMLPackage.USE_CASE__IS_ABSTRACT :
				return isAbstract();
			case UMLPackage.USE_CASE__IS_FINAL_SPECIALIZATION :
				return isFinalSpecialization();
			case UMLPackage.USE_CASE__OWNED_USE_CASE :
				return getOwnedUseCases();
			case UMLPackage.USE_CASE__USE_CASE :
				return getUseCases();
			case UMLPackage.USE_CASE__REDEFINED_CLASSIFIER :
				return getRedefinedClassifiers();
			case UMLPackage.USE_CASE__REPRESENTATION :
				if (resolve)
					return getRepresentation();
				return basicGetRepresentation();
			case UMLPackage.USE_CASE__SUBSTITUTION :
				return getSubstitutions();
			case UMLPackage.USE_CASE__CLASSIFIER_BEHAVIOR :
				if (resolve)
					return getClassifierBehavior();
				return basicGetClassifierBehavior();
			case UMLPackage.USE_CASE__INTERFACE_REALIZATION :
				return getInterfaceRealizations();
			case UMLPackage.USE_CASE__OWNED_BEHAVIOR :
				return getOwnedBehaviors();
			case UMLPackage.USE_CASE__EXTEND :
				return getExtends();
			case UMLPackage.USE_CASE__EXTENSION_POINT :
				return getExtensionPoints();
			case UMLPackage.USE_CASE__INCLUDE :
				return getIncludes();
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
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case UMLPackage.USE_CASE__EANNOTATIONS :
				getEAnnotations().clear();
				getEAnnotations()
					.addAll((Collection<? extends EAnnotation>) newValue);
				return;
			case UMLPackage.USE_CASE__OWNED_COMMENT :
				getOwnedComments().clear();
				getOwnedComments()
					.addAll((Collection<? extends Comment>) newValue);
				return;
			case UMLPackage.USE_CASE__NAME :
				setName((String) newValue);
				return;
			case UMLPackage.USE_CASE__NAME_EXPRESSION :
				setNameExpression((StringExpression) newValue);
				return;
			case UMLPackage.USE_CASE__VISIBILITY :
				setVisibility((VisibilityKind) newValue);
				return;
			case UMLPackage.USE_CASE__OWNED_RULE :
				getOwnedRules().clear();
				getOwnedRules()
					.addAll((Collection<? extends Constraint>) newValue);
				return;
			case UMLPackage.USE_CASE__ELEMENT_IMPORT :
				getElementImports().clear();
				getElementImports()
					.addAll((Collection<? extends ElementImport>) newValue);
				return;
			case UMLPackage.USE_CASE__PACKAGE_IMPORT :
				getPackageImports().clear();
				getPackageImports()
					.addAll((Collection<? extends PackageImport>) newValue);
				return;
			case UMLPackage.USE_CASE__IS_LEAF :
				setIsLeaf((Boolean) newValue);
				return;
			case UMLPackage.USE_CASE__OWNING_TEMPLATE_PARAMETER :
				setOwningTemplateParameter((TemplateParameter) newValue);
				return;
			case UMLPackage.USE_CASE__TEMPLATE_PARAMETER :
				setTemplateParameter((TemplateParameter) newValue);
				return;
			case UMLPackage.USE_CASE__PACKAGE :
				setPackage((org.eclipse.uml2.uml.Package) newValue);
				return;
			case UMLPackage.USE_CASE__TEMPLATE_BINDING :
				getTemplateBindings().clear();
				getTemplateBindings()
					.addAll((Collection<? extends TemplateBinding>) newValue);
				return;
			case UMLPackage.USE_CASE__OWNED_TEMPLATE_SIGNATURE :
				setOwnedTemplateSignature((TemplateSignature) newValue);
				return;
			case UMLPackage.USE_CASE__COLLABORATION_USE :
				getCollaborationUses().clear();
				getCollaborationUses()
					.addAll((Collection<? extends CollaborationUse>) newValue);
				return;
			case UMLPackage.USE_CASE__GENERAL :
				getGenerals().clear();
				getGenerals()
					.addAll((Collection<? extends Classifier>) newValue);
				return;
			case UMLPackage.USE_CASE__GENERALIZATION :
				getGeneralizations().clear();
				getGeneralizations()
					.addAll((Collection<? extends Generalization>) newValue);
				return;
			case UMLPackage.USE_CASE__POWERTYPE_EXTENT :
				getPowertypeExtents().clear();
				getPowertypeExtents()
					.addAll((Collection<? extends GeneralizationSet>) newValue);
				return;
			case UMLPackage.USE_CASE__IS_ABSTRACT :
				setIsAbstract((Boolean) newValue);
				return;
			case UMLPackage.USE_CASE__IS_FINAL_SPECIALIZATION :
				setIsFinalSpecialization((Boolean) newValue);
				return;
			case UMLPackage.USE_CASE__OWNED_USE_CASE :
				getOwnedUseCases().clear();
				getOwnedUseCases()
					.addAll((Collection<? extends UseCase>) newValue);
				return;
			case UMLPackage.USE_CASE__USE_CASE :
				getUseCases().clear();
				getUseCases().addAll((Collection<? extends UseCase>) newValue);
				return;
			case UMLPackage.USE_CASE__REDEFINED_CLASSIFIER :
				getRedefinedClassifiers().clear();
				getRedefinedClassifiers()
					.addAll((Collection<? extends Classifier>) newValue);
				return;
			case UMLPackage.USE_CASE__REPRESENTATION :
				setRepresentation((CollaborationUse) newValue);
				return;
			case UMLPackage.USE_CASE__SUBSTITUTION :
				getSubstitutions().clear();
				getSubstitutions()
					.addAll((Collection<? extends Substitution>) newValue);
				return;
			case UMLPackage.USE_CASE__CLASSIFIER_BEHAVIOR :
				setClassifierBehavior((Behavior) newValue);
				return;
			case UMLPackage.USE_CASE__INTERFACE_REALIZATION :
				getInterfaceRealizations().clear();
				getInterfaceRealizations().addAll(
					(Collection<? extends InterfaceRealization>) newValue);
				return;
			case UMLPackage.USE_CASE__OWNED_BEHAVIOR :
				getOwnedBehaviors().clear();
				getOwnedBehaviors()
					.addAll((Collection<? extends Behavior>) newValue);
				return;
			case UMLPackage.USE_CASE__EXTEND :
				getExtends().clear();
				getExtends().addAll((Collection<? extends Extend>) newValue);
				return;
			case UMLPackage.USE_CASE__EXTENSION_POINT :
				getExtensionPoints().clear();
				getExtensionPoints()
					.addAll((Collection<? extends ExtensionPoint>) newValue);
				return;
			case UMLPackage.USE_CASE__INCLUDE :
				getIncludes().clear();
				getIncludes().addAll((Collection<? extends Include>) newValue);
				return;
			case UMLPackage.USE_CASE__SUBJECT :
				getSubjects().clear();
				getSubjects()
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
			case UMLPackage.USE_CASE__EANNOTATIONS :
				getEAnnotations().clear();
				return;
			case UMLPackage.USE_CASE__OWNED_COMMENT :
				getOwnedComments().clear();
				return;
			case UMLPackage.USE_CASE__NAME :
				unsetName();
				return;
			case UMLPackage.USE_CASE__NAME_EXPRESSION :
				setNameExpression((StringExpression) null);
				return;
			case UMLPackage.USE_CASE__VISIBILITY :
				unsetVisibility();
				return;
			case UMLPackage.USE_CASE__OWNED_RULE :
				getOwnedRules().clear();
				return;
			case UMLPackage.USE_CASE__ELEMENT_IMPORT :
				getElementImports().clear();
				return;
			case UMLPackage.USE_CASE__PACKAGE_IMPORT :
				getPackageImports().clear();
				return;
			case UMLPackage.USE_CASE__IS_LEAF :
				setIsLeaf(IS_LEAF_EDEFAULT);
				return;
			case UMLPackage.USE_CASE__OWNING_TEMPLATE_PARAMETER :
				setOwningTemplateParameter((TemplateParameter) null);
				return;
			case UMLPackage.USE_CASE__TEMPLATE_PARAMETER :
				setTemplateParameter((TemplateParameter) null);
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
			case UMLPackage.USE_CASE__COLLABORATION_USE :
				getCollaborationUses().clear();
				return;
			case UMLPackage.USE_CASE__GENERAL :
				getGenerals().clear();
				return;
			case UMLPackage.USE_CASE__GENERALIZATION :
				getGeneralizations().clear();
				return;
			case UMLPackage.USE_CASE__POWERTYPE_EXTENT :
				getPowertypeExtents().clear();
				return;
			case UMLPackage.USE_CASE__IS_ABSTRACT :
				setIsAbstract(IS_ABSTRACT_EDEFAULT);
				return;
			case UMLPackage.USE_CASE__IS_FINAL_SPECIALIZATION :
				setIsFinalSpecialization(IS_FINAL_SPECIALIZATION_EDEFAULT);
				return;
			case UMLPackage.USE_CASE__OWNED_USE_CASE :
				getOwnedUseCases().clear();
				return;
			case UMLPackage.USE_CASE__USE_CASE :
				getUseCases().clear();
				return;
			case UMLPackage.USE_CASE__REDEFINED_CLASSIFIER :
				getRedefinedClassifiers().clear();
				return;
			case UMLPackage.USE_CASE__REPRESENTATION :
				setRepresentation((CollaborationUse) null);
				return;
			case UMLPackage.USE_CASE__SUBSTITUTION :
				getSubstitutions().clear();
				return;
			case UMLPackage.USE_CASE__CLASSIFIER_BEHAVIOR :
				setClassifierBehavior((Behavior) null);
				return;
			case UMLPackage.USE_CASE__INTERFACE_REALIZATION :
				getInterfaceRealizations().clear();
				return;
			case UMLPackage.USE_CASE__OWNED_BEHAVIOR :
				getOwnedBehaviors().clear();
				return;
			case UMLPackage.USE_CASE__EXTEND :
				getExtends().clear();
				return;
			case UMLPackage.USE_CASE__EXTENSION_POINT :
				getExtensionPoints().clear();
				return;
			case UMLPackage.USE_CASE__INCLUDE :
				getIncludes().clear();
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
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case UMLPackage.USE_CASE__EANNOTATIONS :
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UMLPackage.USE_CASE__OWNED_COMMENT :
				return ownedComments != null && !ownedComments.isEmpty();
			case UMLPackage.USE_CASE__OWNED_ELEMENT :
				return isSetOwnedElements();
			case UMLPackage.USE_CASE__OWNER :
				return isSetOwner();
			case UMLPackage.USE_CASE__CLIENT_DEPENDENCY :
				return !getClientDependencies().isEmpty();
			case UMLPackage.USE_CASE__NAME :
				return isSetName();
			case UMLPackage.USE_CASE__NAME_EXPRESSION :
				return nameExpression != null;
			case UMLPackage.USE_CASE__NAMESPACE :
				return isSetNamespace();
			case UMLPackage.USE_CASE__QUALIFIED_NAME :
				return QUALIFIED_NAME_EDEFAULT == null
					? getQualifiedName() != null
					: !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case UMLPackage.USE_CASE__VISIBILITY :
				return isSetVisibility();
			case UMLPackage.USE_CASE__OWNED_RULE :
				return ownedRules != null && !ownedRules.isEmpty();
			case UMLPackage.USE_CASE__ELEMENT_IMPORT :
				return elementImports != null && !elementImports.isEmpty();
			case UMLPackage.USE_CASE__PACKAGE_IMPORT :
				return packageImports != null && !packageImports.isEmpty();
			case UMLPackage.USE_CASE__OWNED_MEMBER :
				return isSetOwnedMembers();
			case UMLPackage.USE_CASE__IMPORTED_MEMBER :
				return !getImportedMembers().isEmpty();
			case UMLPackage.USE_CASE__MEMBER :
				return isSetMembers();
			case UMLPackage.USE_CASE__IS_LEAF :
				return ((eFlags & IS_LEAF_EFLAG) != 0) != IS_LEAF_EDEFAULT;
			case UMLPackage.USE_CASE__REDEFINED_ELEMENT :
				return isSetRedefinedElements();
			case UMLPackage.USE_CASE__REDEFINITION_CONTEXT :
				return isSetRedefinitionContexts();
			case UMLPackage.USE_CASE__OWNING_TEMPLATE_PARAMETER :
				return basicGetOwningTemplateParameter() != null;
			case UMLPackage.USE_CASE__TEMPLATE_PARAMETER :
				return isSetTemplateParameter();
			case UMLPackage.USE_CASE__PACKAGE :
				return basicGetPackage() != null;
			case UMLPackage.USE_CASE__TEMPLATE_BINDING :
				return templateBindings != null && !templateBindings.isEmpty();
			case UMLPackage.USE_CASE__OWNED_TEMPLATE_SIGNATURE :
				return isSetOwnedTemplateSignature();
			case UMLPackage.USE_CASE__FEATURE :
				return isSetFeatures();
			case UMLPackage.USE_CASE__ATTRIBUTE :
				return isSetAttributes();
			case UMLPackage.USE_CASE__COLLABORATION_USE :
				return collaborationUses != null
					&& !collaborationUses.isEmpty();
			case UMLPackage.USE_CASE__GENERAL :
				return !getGenerals().isEmpty();
			case UMLPackage.USE_CASE__GENERALIZATION :
				return generalizations != null && !generalizations.isEmpty();
			case UMLPackage.USE_CASE__POWERTYPE_EXTENT :
				return powertypeExtents != null && !powertypeExtents.isEmpty();
			case UMLPackage.USE_CASE__INHERITED_MEMBER :
				return !getInheritedMembers().isEmpty();
			case UMLPackage.USE_CASE__IS_ABSTRACT :
				return ((eFlags
					& IS_ABSTRACT_EFLAG) != 0) != IS_ABSTRACT_EDEFAULT;
			case UMLPackage.USE_CASE__IS_FINAL_SPECIALIZATION :
				return ((eFlags
					& IS_FINAL_SPECIALIZATION_EFLAG) != 0) != IS_FINAL_SPECIALIZATION_EDEFAULT;
			case UMLPackage.USE_CASE__OWNED_USE_CASE :
				return ownedUseCases != null && !ownedUseCases.isEmpty();
			case UMLPackage.USE_CASE__USE_CASE :
				return useCases != null && !useCases.isEmpty();
			case UMLPackage.USE_CASE__REDEFINED_CLASSIFIER :
				return redefinedClassifiers != null
					&& !redefinedClassifiers.isEmpty();
			case UMLPackage.USE_CASE__REPRESENTATION :
				return representation != null;
			case UMLPackage.USE_CASE__SUBSTITUTION :
				return substitutions != null && !substitutions.isEmpty();
			case UMLPackage.USE_CASE__CLASSIFIER_BEHAVIOR :
				return classifierBehavior != null;
			case UMLPackage.USE_CASE__INTERFACE_REALIZATION :
				return interfaceRealizations != null
					&& !interfaceRealizations.isEmpty();
			case UMLPackage.USE_CASE__OWNED_BEHAVIOR :
				return ownedBehaviors != null && !ownedBehaviors.isEmpty();
			case UMLPackage.USE_CASE__EXTEND :
				return extends_ != null && !extends_.isEmpty();
			case UMLPackage.USE_CASE__EXTENSION_POINT :
				return extensionPoints != null && !extensionPoints.isEmpty();
			case UMLPackage.USE_CASE__INCLUDE :
				return includes != null && !includes.isEmpty();
			case UMLPackage.USE_CASE__SUBJECT :
				return subjects != null && !subjects.isEmpty();
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
			case UMLPackage.USE_CASE___GET_EANNOTATION__STRING :
				return getEAnnotation((String) arguments.get(0));
			case UMLPackage.USE_CASE___VALIDATE_HAS_OWNER__DIAGNOSTICCHAIN_MAP :
				return validateHasOwner((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.USE_CASE___VALIDATE_NOT_OWN_SELF__DIAGNOSTICCHAIN_MAP :
				return validateNotOwnSelf((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.USE_CASE___ADD_KEYWORD__STRING :
				return addKeyword((String) arguments.get(0));
			case UMLPackage.USE_CASE___APPLY_STEREOTYPE__STEREOTYPE :
				return applyStereotype((Stereotype) arguments.get(0));
			case UMLPackage.USE_CASE___CREATE_EANNOTATION__STRING :
				return createEAnnotation((String) arguments.get(0));
			case UMLPackage.USE_CASE___DESTROY :
				destroy();
				return null;
			case UMLPackage.USE_CASE___GET_KEYWORDS :
				return getKeywords();
			case UMLPackage.USE_CASE___GET_APPLICABLE_STEREOTYPE__STRING :
				return getApplicableStereotype((String) arguments.get(0));
			case UMLPackage.USE_CASE___GET_APPLICABLE_STEREOTYPES :
				return getApplicableStereotypes();
			case UMLPackage.USE_CASE___GET_APPLIED_STEREOTYPE__STRING :
				return getAppliedStereotype((String) arguments.get(0));
			case UMLPackage.USE_CASE___GET_APPLIED_STEREOTYPES :
				return getAppliedStereotypes();
			case UMLPackage.USE_CASE___GET_APPLIED_SUBSTEREOTYPE__STEREOTYPE_STRING :
				return getAppliedSubstereotype((Stereotype) arguments.get(0),
					(String) arguments.get(1));
			case UMLPackage.USE_CASE___GET_APPLIED_SUBSTEREOTYPES__STEREOTYPE :
				return getAppliedSubstereotypes((Stereotype) arguments.get(0));
			case UMLPackage.USE_CASE___GET_MODEL :
				return getModel();
			case UMLPackage.USE_CASE___GET_NEAREST_PACKAGE :
				return getNearestPackage();
			case UMLPackage.USE_CASE___GET_RELATIONSHIPS :
				return getRelationships();
			case UMLPackage.USE_CASE___GET_RELATIONSHIPS__ECLASS :
				return getRelationships((EClass) arguments.get(0));
			case UMLPackage.USE_CASE___GET_REQUIRED_STEREOTYPE__STRING :
				return getRequiredStereotype((String) arguments.get(0));
			case UMLPackage.USE_CASE___GET_REQUIRED_STEREOTYPES :
				return getRequiredStereotypes();
			case UMLPackage.USE_CASE___GET_SOURCE_DIRECTED_RELATIONSHIPS :
				return getSourceDirectedRelationships();
			case UMLPackage.USE_CASE___GET_SOURCE_DIRECTED_RELATIONSHIPS__ECLASS :
				return getSourceDirectedRelationships(
					(EClass) arguments.get(0));
			case UMLPackage.USE_CASE___GET_STEREOTYPE_APPLICATION__STEREOTYPE :
				return getStereotypeApplication((Stereotype) arguments.get(0));
			case UMLPackage.USE_CASE___GET_STEREOTYPE_APPLICATIONS :
				return getStereotypeApplications();
			case UMLPackage.USE_CASE___GET_TARGET_DIRECTED_RELATIONSHIPS :
				return getTargetDirectedRelationships();
			case UMLPackage.USE_CASE___GET_TARGET_DIRECTED_RELATIONSHIPS__ECLASS :
				return getTargetDirectedRelationships(
					(EClass) arguments.get(0));
			case UMLPackage.USE_CASE___GET_VALUE__STEREOTYPE_STRING :
				return getValue((Stereotype) arguments.get(0),
					(String) arguments.get(1));
			case UMLPackage.USE_CASE___HAS_KEYWORD__STRING :
				return hasKeyword((String) arguments.get(0));
			case UMLPackage.USE_CASE___HAS_VALUE__STEREOTYPE_STRING :
				return hasValue((Stereotype) arguments.get(0),
					(String) arguments.get(1));
			case UMLPackage.USE_CASE___IS_STEREOTYPE_APPLICABLE__STEREOTYPE :
				return isStereotypeApplicable((Stereotype) arguments.get(0));
			case UMLPackage.USE_CASE___IS_STEREOTYPE_APPLIED__STEREOTYPE :
				return isStereotypeApplied((Stereotype) arguments.get(0));
			case UMLPackage.USE_CASE___IS_STEREOTYPE_REQUIRED__STEREOTYPE :
				return isStereotypeRequired((Stereotype) arguments.get(0));
			case UMLPackage.USE_CASE___REMOVE_KEYWORD__STRING :
				return removeKeyword((String) arguments.get(0));
			case UMLPackage.USE_CASE___SET_VALUE__STEREOTYPE_STRING_OBJECT :
				setValue((Stereotype) arguments.get(0),
					(String) arguments.get(1), arguments.get(2));
				return null;
			case UMLPackage.USE_CASE___UNAPPLY_STEREOTYPE__STEREOTYPE :
				return unapplyStereotype((Stereotype) arguments.get(0));
			case UMLPackage.USE_CASE___ALL_OWNED_ELEMENTS :
				return allOwnedElements();
			case UMLPackage.USE_CASE___MUST_BE_OWNED :
				return mustBeOwned();
			case UMLPackage.USE_CASE___VALIDATE_VISIBILITY_NEEDS_OWNERSHIP__DIAGNOSTICCHAIN_MAP :
				return validateVisibilityNeedsOwnership(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.USE_CASE___VALIDATE_HAS_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP :
				return validateHasQualifiedName(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.USE_CASE___VALIDATE_HAS_NO_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP :
				return validateHasNoQualifiedName(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.USE_CASE___CREATE_DEPENDENCY__NAMEDELEMENT :
				return createDependency((NamedElement) arguments.get(0));
			case UMLPackage.USE_CASE___CREATE_USAGE__NAMEDELEMENT :
				return createUsage((NamedElement) arguments.get(0));
			case UMLPackage.USE_CASE___GET_LABEL :
				return getLabel();
			case UMLPackage.USE_CASE___GET_LABEL__BOOLEAN :
				return getLabel((Boolean) arguments.get(0));
			case UMLPackage.USE_CASE___GET_NAMESPACE :
				return getNamespace();
			case UMLPackage.USE_CASE___ALL_NAMESPACES :
				return allNamespaces();
			case UMLPackage.USE_CASE___ALL_OWNING_PACKAGES :
				return allOwningPackages();
			case UMLPackage.USE_CASE___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE :
				return isDistinguishableFrom((NamedElement) arguments.get(0),
					(Namespace) arguments.get(1));
			case UMLPackage.USE_CASE___GET_QUALIFIED_NAME :
				return getQualifiedName();
			case UMLPackage.USE_CASE___SEPARATOR :
				return separator();
			case UMLPackage.USE_CASE___GET_CLIENT_DEPENDENCIES :
				return getClientDependencies();
			case UMLPackage.USE_CASE___VALIDATE_MEMBERS_DISTINGUISHABLE__DIAGNOSTICCHAIN_MAP :
				return validateMembersDistinguishable(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.USE_CASE___VALIDATE_CANNOT_IMPORT_SELF__DIAGNOSTICCHAIN_MAP :
				return validateCannotImportSelf(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.USE_CASE___VALIDATE_CANNOT_IMPORT_OWNED_MEMBERS__DIAGNOSTICCHAIN_MAP :
				return validateCannotImportOwnedMembers(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.USE_CASE___CREATE_ELEMENT_IMPORT__PACKAGEABLEELEMENT_VISIBILITYKIND :
				return createElementImport(
					(PackageableElement) arguments.get(0),
					(VisibilityKind) arguments.get(1));
			case UMLPackage.USE_CASE___CREATE_PACKAGE_IMPORT__PACKAGE_VISIBILITYKIND :
				return createPackageImport(
					(org.eclipse.uml2.uml.Package) arguments.get(0),
					(VisibilityKind) arguments.get(1));
			case UMLPackage.USE_CASE___GET_IMPORTED_ELEMENTS :
				return getImportedElements();
			case UMLPackage.USE_CASE___GET_IMPORTED_PACKAGES :
				return getImportedPackages();
			case UMLPackage.USE_CASE___GET_OWNED_MEMBERS :
				return getOwnedMembers();
			case UMLPackage.USE_CASE___EXCLUDE_COLLISIONS__ELIST :
				return excludeCollisions(
					(EList<PackageableElement>) arguments.get(0));
			case UMLPackage.USE_CASE___GET_NAMES_OF_MEMBER__NAMEDELEMENT :
				return getNamesOfMember((NamedElement) arguments.get(0));
			case UMLPackage.USE_CASE___IMPORT_MEMBERS__ELIST :
				return importMembers(
					(EList<PackageableElement>) arguments.get(0));
			case UMLPackage.USE_CASE___GET_IMPORTED_MEMBERS :
				return getImportedMembers();
			case UMLPackage.USE_CASE___MEMBERS_ARE_DISTINGUISHABLE :
				return membersAreDistinguishable();
			case UMLPackage.USE_CASE___VALIDATE_REDEFINITION_CONSISTENT__DIAGNOSTICCHAIN_MAP :
				return validateRedefinitionConsistent(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.USE_CASE___VALIDATE_NON_LEAF_REDEFINITION__DIAGNOSTICCHAIN_MAP :
				return validateNonLeafRedefinition(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.USE_CASE___VALIDATE_REDEFINITION_CONTEXT_VALID__DIAGNOSTICCHAIN_MAP :
				return validateRedefinitionContextValid(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.USE_CASE___IS_CONSISTENT_WITH__REDEFINABLEELEMENT :
				return isConsistentWith((RedefinableElement) arguments.get(0));
			case UMLPackage.USE_CASE___IS_REDEFINITION_CONTEXT_VALID__REDEFINABLEELEMENT :
				return isRedefinitionContextValid(
					(RedefinableElement) arguments.get(0));
			case UMLPackage.USE_CASE___IS_COMPATIBLE_WITH__PARAMETERABLEELEMENT :
				return isCompatibleWith(
					(ParameterableElement) arguments.get(0));
			case UMLPackage.USE_CASE___IS_TEMPLATE_PARAMETER :
				return isTemplateParameter();
			case UMLPackage.USE_CASE___VALIDATE_NAMESPACE_NEEDS_VISIBILITY__DIAGNOSTICCHAIN_MAP :
				return validateNamespaceNeedsVisibility(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.USE_CASE___CREATE_ASSOCIATION__BOOLEAN_AGGREGATIONKIND_STRING_INT_INT_TYPE_BOOLEAN_AGGREGATIONKIND_STRING_INT_INT :
				return createAssociation((Boolean) arguments.get(0),
					(AggregationKind) arguments.get(1),
					(String) arguments.get(2), (Integer) arguments.get(3),
					(Integer) arguments.get(4), (Type) arguments.get(5),
					(Boolean) arguments.get(6),
					(AggregationKind) arguments.get(7),
					(String) arguments.get(8), (Integer) arguments.get(9),
					(Integer) arguments.get(10));
			case UMLPackage.USE_CASE___GET_ASSOCIATIONS :
				return getAssociations();
			case UMLPackage.USE_CASE___CONFORMS_TO__TYPE :
				return conformsTo((Type) arguments.get(0));
			case UMLPackage.USE_CASE___IS_TEMPLATE :
				return isTemplate();
			case UMLPackage.USE_CASE___PARAMETERABLE_ELEMENTS :
				return parameterableElements();
			case UMLPackage.USE_CASE___VALIDATE_SPECIALIZE_TYPE__DIAGNOSTICCHAIN_MAP :
				return validateSpecializeType(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.USE_CASE___VALIDATE_MAPS_TO_GENERALIZATION_SET__DIAGNOSTICCHAIN_MAP :
				return validateMapsToGeneralizationSet(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.USE_CASE___VALIDATE_NON_FINAL_PARENTS__DIAGNOSTICCHAIN_MAP :
				return validateNonFinalParents(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.USE_CASE___VALIDATE_NO_CYCLES_IN_GENERALIZATION__DIAGNOSTICCHAIN_MAP :
				return validateNoCyclesInGeneralization(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.USE_CASE___GET_ALL_ATTRIBUTES :
				return getAllAttributes();
			case UMLPackage.USE_CASE___GET_ALL_OPERATIONS :
				return getAllOperations();
			case UMLPackage.USE_CASE___GET_ALL_USED_INTERFACES :
				return getAllUsedInterfaces();
			case UMLPackage.USE_CASE___GET_OPERATION__STRING_ELIST_ELIST :
				return getOperation((String) arguments.get(0),
					(EList<String>) arguments.get(1),
					(EList<Type>) arguments.get(2));
			case UMLPackage.USE_CASE___GET_OPERATION__STRING_ELIST_ELIST_BOOLEAN :
				return getOperation((String) arguments.get(0),
					(EList<String>) arguments.get(1),
					(EList<Type>) arguments.get(2), (Boolean) arguments.get(3));
			case UMLPackage.USE_CASE___GET_OPERATIONS :
				return getOperations();
			case UMLPackage.USE_CASE___GET_USED_INTERFACES :
				return getUsedInterfaces();
			case UMLPackage.USE_CASE___ALL_FEATURES :
				return allFeatures();
			case UMLPackage.USE_CASE___ALL_PARENTS :
				return allParents();
			case UMLPackage.USE_CASE___GET_GENERALS :
				return getGenerals();
			case UMLPackage.USE_CASE___HAS_VISIBILITY_OF__NAMEDELEMENT :
				return hasVisibilityOf((NamedElement) arguments.get(0));
			case UMLPackage.USE_CASE___INHERIT__ELIST :
				return inherit((EList<NamedElement>) arguments.get(0));
			case UMLPackage.USE_CASE___INHERITABLE_MEMBERS__CLASSIFIER :
				return inheritableMembers((Classifier) arguments.get(0));
			case UMLPackage.USE_CASE___GET_INHERITED_MEMBERS :
				return getInheritedMembers();
			case UMLPackage.USE_CASE___MAY_SPECIALIZE_TYPE__CLASSIFIER :
				return maySpecializeType((Classifier) arguments.get(0));
			case UMLPackage.USE_CASE___PARENTS :
				return parents();
			case UMLPackage.USE_CASE___DIRECTLY_REALIZED_INTERFACES :
				return directlyRealizedInterfaces();
			case UMLPackage.USE_CASE___DIRECTLY_USED_INTERFACES :
				return directlyUsedInterfaces();
			case UMLPackage.USE_CASE___ALL_REALIZED_INTERFACES :
				return allRealizedInterfaces();
			case UMLPackage.USE_CASE___ALL_USED_INTERFACES :
				return allUsedInterfaces();
			case UMLPackage.USE_CASE___IS_SUBSTITUTABLE_FOR__CLASSIFIER :
				return isSubstitutableFor((Classifier) arguments.get(0));
			case UMLPackage.USE_CASE___ALL_ATTRIBUTES :
				return allAttributes();
			case UMLPackage.USE_CASE___ALL_SLOTTABLE_FEATURES :
				return allSlottableFeatures();
			case UMLPackage.USE_CASE___VALIDATE_CLASS_BEHAVIOR__DIAGNOSTICCHAIN_MAP :
				return validateClassBehavior((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.USE_CASE___GET_ALL_IMPLEMENTED_INTERFACES :
				return getAllImplementedInterfaces();
			case UMLPackage.USE_CASE___GET_IMPLEMENTED_INTERFACES :
				return getImplementedInterfaces();
			case UMLPackage.USE_CASE___VALIDATE_BINARY_ASSOCIATIONS__DIAGNOSTICCHAIN_MAP :
				return validateBinaryAssociations(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.USE_CASE___VALIDATE_NO_ASSOCIATION_TO_USE_CASE__DIAGNOSTICCHAIN_MAP :
				return validateNoAssociationToUseCase(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.USE_CASE___VALIDATE_CANNOT_INCLUDE_SELF__DIAGNOSTICCHAIN_MAP :
				return validateCannotIncludeSelf(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.USE_CASE___VALIDATE_MUST_HAVE_NAME__DIAGNOSTICCHAIN_MAP :
				return validateMustHaveName((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.USE_CASE___ALL_INCLUDED_USE_CASES :
				return allIncludedUseCases();
		}
		return eDynamicInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetOwnedMembers() {
		return super.isSetOwnedMembers() || eIsSet(UMLPackage.USE_CASE__EXTEND)
			|| eIsSet(UMLPackage.USE_CASE__EXTENSION_POINT)
			|| eIsSet(UMLPackage.USE_CASE__INCLUDE);
	}

	/**
	 * The array of subset feature identifiers for the '{@link #getOwnedMembers() <em>Owned Member</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedMembers()
	 * @generated
	 * @ordered
	 */
	protected static final int[] OWNED_MEMBER_ESUBSETS = new int[]{
		UMLPackage.USE_CASE__OWNED_RULE, UMLPackage.USE_CASE__OWNED_USE_CASE,
		UMLPackage.USE_CASE__OWNED_BEHAVIOR, UMLPackage.USE_CASE__EXTEND,
		UMLPackage.USE_CASE__EXTENSION_POINT, UMLPackage.USE_CASE__INCLUDE};

} //UseCaseImpl
