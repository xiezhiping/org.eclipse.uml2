/*
 * Copyright (c) 2005, 2016 IBM Corporation, CEA, and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *   Kenn Hussey (CEA) - 327039, 418466, 451350, 485756
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
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.uml2.common.util.CacheAdapter;
import org.eclipse.uml2.common.util.DerivedUnionEObjectEList;

import org.eclipse.uml2.uml.AggregationKind;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.CollaborationUse;
import org.eclipse.uml2.uml.Comment;
import org.eclipse.uml2.uml.Constraint;
import org.eclipse.uml2.uml.ElementImport;
import org.eclipse.uml2.uml.Enumeration;
import org.eclipse.uml2.uml.EnumerationLiteral;
import org.eclipse.uml2.uml.Generalization;
import org.eclipse.uml2.uml.GeneralizationSet;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Namespace;
import org.eclipse.uml2.uml.Operation;
import org.eclipse.uml2.uml.PackageImport;
import org.eclipse.uml2.uml.PackageableElement;
import org.eclipse.uml2.uml.ParameterableElement;
import org.eclipse.uml2.uml.Property;
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
import org.eclipse.uml2.uml.internal.operations.EnumerationOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Enumeration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.EnumerationImpl#getOwnedMembers <em>Owned Member</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.EnumerationImpl#getOwnedLiterals <em>Owned Literal</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EnumerationImpl
		extends DataTypeImpl
		implements Enumeration {

	/**
	 * The cached value of the '{@link #getOwnedLiterals() <em>Owned Literal</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedLiterals()
	 * @generated
	 * @ordered
	 */
	protected EList<EnumerationLiteral> ownedLiterals;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EnumerationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UMLPackage.Literals.ENUMERATION;
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
						UMLPackage.ENUMERATION__OWNED_MEMBER,
						OWNED_MEMBER_ESUBSETS));
			}
			return ownedMembers;
		}
		return new DerivedUnionEObjectEList<NamedElement>(NamedElement.class,
			this, UMLPackage.ENUMERATION__OWNED_MEMBER, OWNED_MEMBER_ESUBSETS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EnumerationLiteral> getOwnedLiterals() {
		if (ownedLiterals == null) {
			ownedLiterals = new EObjectContainmentWithInverseEList.Resolving<EnumerationLiteral>(
				EnumerationLiteral.class, this,
				UMLPackage.ENUMERATION__OWNED_LITERAL,
				UMLPackage.ENUMERATION_LITERAL__ENUMERATION);
		}
		return ownedLiterals;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumerationLiteral createOwnedLiteral(String name) {
		EnumerationLiteral newOwnedLiteral = (EnumerationLiteral) create(
			UMLPackage.Literals.ENUMERATION_LITERAL);
		getOwnedLiterals().add(newOwnedLiteral);
		if (name != null)
			newOwnedLiteral.setName(name);
		return newOwnedLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumerationLiteral getOwnedLiteral(String name) {
		return getOwnedLiteral(name, false, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumerationLiteral getOwnedLiteral(String name, boolean ignoreCase,
			boolean createOnDemand) {
		ownedLiteralLoop : for (EnumerationLiteral ownedLiteral : getOwnedLiterals()) {
			if (name != null && !(ignoreCase
				? name.equalsIgnoreCase(ownedLiteral.getName())
				: name.equals(ownedLiteral.getName())))
				continue ownedLiteralLoop;
			return ownedLiteral;
		}
		return createOnDemand
			? createOwnedLiteral(name)
			: null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImmutable(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return EnumerationOperations.validateImmutable(this, diagnostics,
			context);
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
			case UMLPackage.ENUMERATION__EANNOTATIONS :
				return ((InternalEList<InternalEObject>) (InternalEList<?>) getEAnnotations())
					.basicAdd(otherEnd, msgs);
			case UMLPackage.ENUMERATION__OWNED_RULE :
				return ((InternalEList<InternalEObject>) (InternalEList<?>) getOwnedRules())
					.basicAdd(otherEnd, msgs);
			case UMLPackage.ENUMERATION__ELEMENT_IMPORT :
				return ((InternalEList<InternalEObject>) (InternalEList<?>) getElementImports())
					.basicAdd(otherEnd, msgs);
			case UMLPackage.ENUMERATION__PACKAGE_IMPORT :
				return ((InternalEList<InternalEObject>) (InternalEList<?>) getPackageImports())
					.basicAdd(otherEnd, msgs);
			case UMLPackage.ENUMERATION__OWNING_TEMPLATE_PARAMETER :
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOwningTemplateParameter(
					(TemplateParameter) otherEnd, msgs);
			case UMLPackage.ENUMERATION__TEMPLATE_PARAMETER :
				if (templateParameter != null)
					msgs = ((InternalEObject) templateParameter).eInverseRemove(
						this,
						UMLPackage.TEMPLATE_PARAMETER__PARAMETERED_ELEMENT,
						TemplateParameter.class, msgs);
				return basicSetTemplateParameter((TemplateParameter) otherEnd,
					msgs);
			case UMLPackage.ENUMERATION__TEMPLATE_BINDING :
				return ((InternalEList<InternalEObject>) (InternalEList<?>) getTemplateBindings())
					.basicAdd(otherEnd, msgs);
			case UMLPackage.ENUMERATION__OWNED_TEMPLATE_SIGNATURE :
				if (ownedTemplateSignature != null)
					msgs = ((InternalEObject) ownedTemplateSignature)
						.eInverseRemove(this,
							EOPPOSITE_FEATURE_BASE
								- UMLPackage.ENUMERATION__OWNED_TEMPLATE_SIGNATURE,
							null, msgs);
				return basicSetOwnedTemplateSignature(
					(TemplateSignature) otherEnd, msgs);
			case UMLPackage.ENUMERATION__GENERALIZATION :
				return ((InternalEList<InternalEObject>) (InternalEList<?>) getGeneralizations())
					.basicAdd(otherEnd, msgs);
			case UMLPackage.ENUMERATION__POWERTYPE_EXTENT :
				return ((InternalEList<InternalEObject>) (InternalEList<?>) getPowertypeExtents())
					.basicAdd(otherEnd, msgs);
			case UMLPackage.ENUMERATION__USE_CASE :
				return ((InternalEList<InternalEObject>) (InternalEList<?>) getUseCases())
					.basicAdd(otherEnd, msgs);
			case UMLPackage.ENUMERATION__SUBSTITUTION :
				return ((InternalEList<InternalEObject>) (InternalEList<?>) getSubstitutions())
					.basicAdd(otherEnd, msgs);
			case UMLPackage.ENUMERATION__OWNED_ATTRIBUTE :
				return ((InternalEList<InternalEObject>) (InternalEList<?>) getOwnedAttributes())
					.basicAdd(otherEnd, msgs);
			case UMLPackage.ENUMERATION__OWNED_OPERATION :
				return ((InternalEList<InternalEObject>) (InternalEList<?>) getOwnedOperations())
					.basicAdd(otherEnd, msgs);
			case UMLPackage.ENUMERATION__OWNED_LITERAL :
				return ((InternalEList<InternalEObject>) (InternalEList<?>) getOwnedLiterals())
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
			case UMLPackage.ENUMERATION__EANNOTATIONS :
				return ((InternalEList<?>) getEAnnotations())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.ENUMERATION__OWNED_COMMENT :
				return ((InternalEList<?>) getOwnedComments())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.ENUMERATION__NAME_EXPRESSION :
				return basicSetNameExpression(null, msgs);
			case UMLPackage.ENUMERATION__OWNED_RULE :
				return ((InternalEList<?>) getOwnedRules())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.ENUMERATION__ELEMENT_IMPORT :
				return ((InternalEList<?>) getElementImports())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.ENUMERATION__PACKAGE_IMPORT :
				return ((InternalEList<?>) getPackageImports())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.ENUMERATION__OWNING_TEMPLATE_PARAMETER :
				return basicSetOwningTemplateParameter(null, msgs);
			case UMLPackage.ENUMERATION__TEMPLATE_PARAMETER :
				return basicSetTemplateParameter(null, msgs);
			case UMLPackage.ENUMERATION__TEMPLATE_BINDING :
				return ((InternalEList<?>) getTemplateBindings())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.ENUMERATION__OWNED_TEMPLATE_SIGNATURE :
				return basicSetOwnedTemplateSignature(null, msgs);
			case UMLPackage.ENUMERATION__COLLABORATION_USE :
				return ((InternalEList<?>) getCollaborationUses())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.ENUMERATION__GENERALIZATION :
				return ((InternalEList<?>) getGeneralizations())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.ENUMERATION__POWERTYPE_EXTENT :
				return ((InternalEList<?>) getPowertypeExtents())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.ENUMERATION__OWNED_USE_CASE :
				return ((InternalEList<?>) getOwnedUseCases())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.ENUMERATION__USE_CASE :
				return ((InternalEList<?>) getUseCases()).basicRemove(otherEnd,
					msgs);
			case UMLPackage.ENUMERATION__SUBSTITUTION :
				return ((InternalEList<?>) getSubstitutions())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.ENUMERATION__OWNED_ATTRIBUTE :
				return ((InternalEList<?>) getOwnedAttributes())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.ENUMERATION__OWNED_OPERATION :
				return ((InternalEList<?>) getOwnedOperations())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.ENUMERATION__OWNED_LITERAL :
				return ((InternalEList<?>) getOwnedLiterals())
					.basicRemove(otherEnd, msgs);
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
			case UMLPackage.ENUMERATION__EANNOTATIONS :
				return getEAnnotations();
			case UMLPackage.ENUMERATION__OWNED_COMMENT :
				return getOwnedComments();
			case UMLPackage.ENUMERATION__OWNED_ELEMENT :
				return getOwnedElements();
			case UMLPackage.ENUMERATION__OWNER :
				if (resolve)
					return getOwner();
				return basicGetOwner();
			case UMLPackage.ENUMERATION__CLIENT_DEPENDENCY :
				return getClientDependencies();
			case UMLPackage.ENUMERATION__NAME :
				return getName();
			case UMLPackage.ENUMERATION__NAME_EXPRESSION :
				if (resolve)
					return getNameExpression();
				return basicGetNameExpression();
			case UMLPackage.ENUMERATION__NAMESPACE :
				if (resolve)
					return getNamespace();
				return basicGetNamespace();
			case UMLPackage.ENUMERATION__QUALIFIED_NAME :
				return getQualifiedName();
			case UMLPackage.ENUMERATION__VISIBILITY :
				return getVisibility();
			case UMLPackage.ENUMERATION__OWNED_RULE :
				return getOwnedRules();
			case UMLPackage.ENUMERATION__ELEMENT_IMPORT :
				return getElementImports();
			case UMLPackage.ENUMERATION__PACKAGE_IMPORT :
				return getPackageImports();
			case UMLPackage.ENUMERATION__OWNED_MEMBER :
				return getOwnedMembers();
			case UMLPackage.ENUMERATION__IMPORTED_MEMBER :
				return getImportedMembers();
			case UMLPackage.ENUMERATION__MEMBER :
				return getMembers();
			case UMLPackage.ENUMERATION__IS_LEAF :
				return isLeaf();
			case UMLPackage.ENUMERATION__REDEFINED_ELEMENT :
				return getRedefinedElements();
			case UMLPackage.ENUMERATION__REDEFINITION_CONTEXT :
				return getRedefinitionContexts();
			case UMLPackage.ENUMERATION__OWNING_TEMPLATE_PARAMETER :
				if (resolve)
					return getOwningTemplateParameter();
				return basicGetOwningTemplateParameter();
			case UMLPackage.ENUMERATION__TEMPLATE_PARAMETER :
				if (resolve)
					return getTemplateParameter();
				return basicGetTemplateParameter();
			case UMLPackage.ENUMERATION__PACKAGE :
				if (resolve)
					return getPackage();
				return basicGetPackage();
			case UMLPackage.ENUMERATION__TEMPLATE_BINDING :
				return getTemplateBindings();
			case UMLPackage.ENUMERATION__OWNED_TEMPLATE_SIGNATURE :
				if (resolve)
					return getOwnedTemplateSignature();
				return basicGetOwnedTemplateSignature();
			case UMLPackage.ENUMERATION__FEATURE :
				return getFeatures();
			case UMLPackage.ENUMERATION__ATTRIBUTE :
				return getAttributes();
			case UMLPackage.ENUMERATION__COLLABORATION_USE :
				return getCollaborationUses();
			case UMLPackage.ENUMERATION__GENERAL :
				return getGenerals();
			case UMLPackage.ENUMERATION__GENERALIZATION :
				return getGeneralizations();
			case UMLPackage.ENUMERATION__POWERTYPE_EXTENT :
				return getPowertypeExtents();
			case UMLPackage.ENUMERATION__INHERITED_MEMBER :
				return getInheritedMembers();
			case UMLPackage.ENUMERATION__IS_ABSTRACT :
				return isAbstract();
			case UMLPackage.ENUMERATION__IS_FINAL_SPECIALIZATION :
				return isFinalSpecialization();
			case UMLPackage.ENUMERATION__OWNED_USE_CASE :
				return getOwnedUseCases();
			case UMLPackage.ENUMERATION__USE_CASE :
				return getUseCases();
			case UMLPackage.ENUMERATION__REDEFINED_CLASSIFIER :
				return getRedefinedClassifiers();
			case UMLPackage.ENUMERATION__REPRESENTATION :
				if (resolve)
					return getRepresentation();
				return basicGetRepresentation();
			case UMLPackage.ENUMERATION__SUBSTITUTION :
				return getSubstitutions();
			case UMLPackage.ENUMERATION__OWNED_ATTRIBUTE :
				return getOwnedAttributes();
			case UMLPackage.ENUMERATION__OWNED_OPERATION :
				return getOwnedOperations();
			case UMLPackage.ENUMERATION__OWNED_LITERAL :
				return getOwnedLiterals();
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
			case UMLPackage.ENUMERATION__EANNOTATIONS :
				getEAnnotations().clear();
				getEAnnotations()
					.addAll((Collection<? extends EAnnotation>) newValue);
				return;
			case UMLPackage.ENUMERATION__OWNED_COMMENT :
				getOwnedComments().clear();
				getOwnedComments()
					.addAll((Collection<? extends Comment>) newValue);
				return;
			case UMLPackage.ENUMERATION__NAME :
				setName((String) newValue);
				return;
			case UMLPackage.ENUMERATION__NAME_EXPRESSION :
				setNameExpression((StringExpression) newValue);
				return;
			case UMLPackage.ENUMERATION__VISIBILITY :
				setVisibility((VisibilityKind) newValue);
				return;
			case UMLPackage.ENUMERATION__OWNED_RULE :
				getOwnedRules().clear();
				getOwnedRules()
					.addAll((Collection<? extends Constraint>) newValue);
				return;
			case UMLPackage.ENUMERATION__ELEMENT_IMPORT :
				getElementImports().clear();
				getElementImports()
					.addAll((Collection<? extends ElementImport>) newValue);
				return;
			case UMLPackage.ENUMERATION__PACKAGE_IMPORT :
				getPackageImports().clear();
				getPackageImports()
					.addAll((Collection<? extends PackageImport>) newValue);
				return;
			case UMLPackage.ENUMERATION__IS_LEAF :
				setIsLeaf((Boolean) newValue);
				return;
			case UMLPackage.ENUMERATION__OWNING_TEMPLATE_PARAMETER :
				setOwningTemplateParameter((TemplateParameter) newValue);
				return;
			case UMLPackage.ENUMERATION__TEMPLATE_PARAMETER :
				setTemplateParameter((TemplateParameter) newValue);
				return;
			case UMLPackage.ENUMERATION__PACKAGE :
				setPackage((org.eclipse.uml2.uml.Package) newValue);
				return;
			case UMLPackage.ENUMERATION__TEMPLATE_BINDING :
				getTemplateBindings().clear();
				getTemplateBindings()
					.addAll((Collection<? extends TemplateBinding>) newValue);
				return;
			case UMLPackage.ENUMERATION__OWNED_TEMPLATE_SIGNATURE :
				setOwnedTemplateSignature((TemplateSignature) newValue);
				return;
			case UMLPackage.ENUMERATION__COLLABORATION_USE :
				getCollaborationUses().clear();
				getCollaborationUses()
					.addAll((Collection<? extends CollaborationUse>) newValue);
				return;
			case UMLPackage.ENUMERATION__GENERAL :
				getGenerals().clear();
				getGenerals()
					.addAll((Collection<? extends Classifier>) newValue);
				return;
			case UMLPackage.ENUMERATION__GENERALIZATION :
				getGeneralizations().clear();
				getGeneralizations()
					.addAll((Collection<? extends Generalization>) newValue);
				return;
			case UMLPackage.ENUMERATION__POWERTYPE_EXTENT :
				getPowertypeExtents().clear();
				getPowertypeExtents()
					.addAll((Collection<? extends GeneralizationSet>) newValue);
				return;
			case UMLPackage.ENUMERATION__IS_ABSTRACT :
				setIsAbstract((Boolean) newValue);
				return;
			case UMLPackage.ENUMERATION__IS_FINAL_SPECIALIZATION :
				setIsFinalSpecialization((Boolean) newValue);
				return;
			case UMLPackage.ENUMERATION__OWNED_USE_CASE :
				getOwnedUseCases().clear();
				getOwnedUseCases()
					.addAll((Collection<? extends UseCase>) newValue);
				return;
			case UMLPackage.ENUMERATION__USE_CASE :
				getUseCases().clear();
				getUseCases().addAll((Collection<? extends UseCase>) newValue);
				return;
			case UMLPackage.ENUMERATION__REDEFINED_CLASSIFIER :
				getRedefinedClassifiers().clear();
				getRedefinedClassifiers()
					.addAll((Collection<? extends Classifier>) newValue);
				return;
			case UMLPackage.ENUMERATION__REPRESENTATION :
				setRepresentation((CollaborationUse) newValue);
				return;
			case UMLPackage.ENUMERATION__SUBSTITUTION :
				getSubstitutions().clear();
				getSubstitutions()
					.addAll((Collection<? extends Substitution>) newValue);
				return;
			case UMLPackage.ENUMERATION__OWNED_ATTRIBUTE :
				getOwnedAttributes().clear();
				getOwnedAttributes()
					.addAll((Collection<? extends Property>) newValue);
				return;
			case UMLPackage.ENUMERATION__OWNED_OPERATION :
				getOwnedOperations().clear();
				getOwnedOperations()
					.addAll((Collection<? extends Operation>) newValue);
				return;
			case UMLPackage.ENUMERATION__OWNED_LITERAL :
				getOwnedLiterals().clear();
				getOwnedLiterals().addAll(
					(Collection<? extends EnumerationLiteral>) newValue);
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
			case UMLPackage.ENUMERATION__EANNOTATIONS :
				getEAnnotations().clear();
				return;
			case UMLPackage.ENUMERATION__OWNED_COMMENT :
				getOwnedComments().clear();
				return;
			case UMLPackage.ENUMERATION__NAME :
				unsetName();
				return;
			case UMLPackage.ENUMERATION__NAME_EXPRESSION :
				setNameExpression((StringExpression) null);
				return;
			case UMLPackage.ENUMERATION__VISIBILITY :
				unsetVisibility();
				return;
			case UMLPackage.ENUMERATION__OWNED_RULE :
				getOwnedRules().clear();
				return;
			case UMLPackage.ENUMERATION__ELEMENT_IMPORT :
				getElementImports().clear();
				return;
			case UMLPackage.ENUMERATION__PACKAGE_IMPORT :
				getPackageImports().clear();
				return;
			case UMLPackage.ENUMERATION__IS_LEAF :
				setIsLeaf(IS_LEAF_EDEFAULT);
				return;
			case UMLPackage.ENUMERATION__OWNING_TEMPLATE_PARAMETER :
				setOwningTemplateParameter((TemplateParameter) null);
				return;
			case UMLPackage.ENUMERATION__TEMPLATE_PARAMETER :
				setTemplateParameter((TemplateParameter) null);
				return;
			case UMLPackage.ENUMERATION__PACKAGE :
				setPackage((org.eclipse.uml2.uml.Package) null);
				return;
			case UMLPackage.ENUMERATION__TEMPLATE_BINDING :
				getTemplateBindings().clear();
				return;
			case UMLPackage.ENUMERATION__OWNED_TEMPLATE_SIGNATURE :
				setOwnedTemplateSignature((TemplateSignature) null);
				return;
			case UMLPackage.ENUMERATION__COLLABORATION_USE :
				getCollaborationUses().clear();
				return;
			case UMLPackage.ENUMERATION__GENERAL :
				getGenerals().clear();
				return;
			case UMLPackage.ENUMERATION__GENERALIZATION :
				getGeneralizations().clear();
				return;
			case UMLPackage.ENUMERATION__POWERTYPE_EXTENT :
				getPowertypeExtents().clear();
				return;
			case UMLPackage.ENUMERATION__IS_ABSTRACT :
				setIsAbstract(IS_ABSTRACT_EDEFAULT);
				return;
			case UMLPackage.ENUMERATION__IS_FINAL_SPECIALIZATION :
				setIsFinalSpecialization(IS_FINAL_SPECIALIZATION_EDEFAULT);
				return;
			case UMLPackage.ENUMERATION__OWNED_USE_CASE :
				getOwnedUseCases().clear();
				return;
			case UMLPackage.ENUMERATION__USE_CASE :
				getUseCases().clear();
				return;
			case UMLPackage.ENUMERATION__REDEFINED_CLASSIFIER :
				getRedefinedClassifiers().clear();
				return;
			case UMLPackage.ENUMERATION__REPRESENTATION :
				setRepresentation((CollaborationUse) null);
				return;
			case UMLPackage.ENUMERATION__SUBSTITUTION :
				getSubstitutions().clear();
				return;
			case UMLPackage.ENUMERATION__OWNED_ATTRIBUTE :
				getOwnedAttributes().clear();
				return;
			case UMLPackage.ENUMERATION__OWNED_OPERATION :
				getOwnedOperations().clear();
				return;
			case UMLPackage.ENUMERATION__OWNED_LITERAL :
				getOwnedLiterals().clear();
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
			case UMLPackage.ENUMERATION__EANNOTATIONS :
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UMLPackage.ENUMERATION__OWNED_COMMENT :
				return ownedComments != null && !ownedComments.isEmpty();
			case UMLPackage.ENUMERATION__OWNED_ELEMENT :
				return isSetOwnedElements();
			case UMLPackage.ENUMERATION__OWNER :
				return isSetOwner();
			case UMLPackage.ENUMERATION__CLIENT_DEPENDENCY :
				return !getClientDependencies().isEmpty();
			case UMLPackage.ENUMERATION__NAME :
				return isSetName();
			case UMLPackage.ENUMERATION__NAME_EXPRESSION :
				return nameExpression != null;
			case UMLPackage.ENUMERATION__NAMESPACE :
				return isSetNamespace();
			case UMLPackage.ENUMERATION__QUALIFIED_NAME :
				return QUALIFIED_NAME_EDEFAULT == null
					? getQualifiedName() != null
					: !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case UMLPackage.ENUMERATION__VISIBILITY :
				return isSetVisibility();
			case UMLPackage.ENUMERATION__OWNED_RULE :
				return ownedRules != null && !ownedRules.isEmpty();
			case UMLPackage.ENUMERATION__ELEMENT_IMPORT :
				return elementImports != null && !elementImports.isEmpty();
			case UMLPackage.ENUMERATION__PACKAGE_IMPORT :
				return packageImports != null && !packageImports.isEmpty();
			case UMLPackage.ENUMERATION__OWNED_MEMBER :
				return isSetOwnedMembers();
			case UMLPackage.ENUMERATION__IMPORTED_MEMBER :
				return !getImportedMembers().isEmpty();
			case UMLPackage.ENUMERATION__MEMBER :
				return isSetMembers();
			case UMLPackage.ENUMERATION__IS_LEAF :
				return ((eFlags & IS_LEAF_EFLAG) != 0) != IS_LEAF_EDEFAULT;
			case UMLPackage.ENUMERATION__REDEFINED_ELEMENT :
				return isSetRedefinedElements();
			case UMLPackage.ENUMERATION__REDEFINITION_CONTEXT :
				return isSetRedefinitionContexts();
			case UMLPackage.ENUMERATION__OWNING_TEMPLATE_PARAMETER :
				return basicGetOwningTemplateParameter() != null;
			case UMLPackage.ENUMERATION__TEMPLATE_PARAMETER :
				return isSetTemplateParameter();
			case UMLPackage.ENUMERATION__PACKAGE :
				return basicGetPackage() != null;
			case UMLPackage.ENUMERATION__TEMPLATE_BINDING :
				return templateBindings != null && !templateBindings.isEmpty();
			case UMLPackage.ENUMERATION__OWNED_TEMPLATE_SIGNATURE :
				return isSetOwnedTemplateSignature();
			case UMLPackage.ENUMERATION__FEATURE :
				return isSetFeatures();
			case UMLPackage.ENUMERATION__ATTRIBUTE :
				return isSetAttributes();
			case UMLPackage.ENUMERATION__COLLABORATION_USE :
				return collaborationUses != null
					&& !collaborationUses.isEmpty();
			case UMLPackage.ENUMERATION__GENERAL :
				return !getGenerals().isEmpty();
			case UMLPackage.ENUMERATION__GENERALIZATION :
				return generalizations != null && !generalizations.isEmpty();
			case UMLPackage.ENUMERATION__POWERTYPE_EXTENT :
				return powertypeExtents != null && !powertypeExtents.isEmpty();
			case UMLPackage.ENUMERATION__INHERITED_MEMBER :
				return !getInheritedMembers().isEmpty();
			case UMLPackage.ENUMERATION__IS_ABSTRACT :
				return ((eFlags
					& IS_ABSTRACT_EFLAG) != 0) != IS_ABSTRACT_EDEFAULT;
			case UMLPackage.ENUMERATION__IS_FINAL_SPECIALIZATION :
				return ((eFlags
					& IS_FINAL_SPECIALIZATION_EFLAG) != 0) != IS_FINAL_SPECIALIZATION_EDEFAULT;
			case UMLPackage.ENUMERATION__OWNED_USE_CASE :
				return ownedUseCases != null && !ownedUseCases.isEmpty();
			case UMLPackage.ENUMERATION__USE_CASE :
				return useCases != null && !useCases.isEmpty();
			case UMLPackage.ENUMERATION__REDEFINED_CLASSIFIER :
				return redefinedClassifiers != null
					&& !redefinedClassifiers.isEmpty();
			case UMLPackage.ENUMERATION__REPRESENTATION :
				return representation != null;
			case UMLPackage.ENUMERATION__SUBSTITUTION :
				return substitutions != null && !substitutions.isEmpty();
			case UMLPackage.ENUMERATION__OWNED_ATTRIBUTE :
				return ownedAttributes != null && !ownedAttributes.isEmpty();
			case UMLPackage.ENUMERATION__OWNED_OPERATION :
				return ownedOperations != null && !ownedOperations.isEmpty();
			case UMLPackage.ENUMERATION__OWNED_LITERAL :
				return ownedLiterals != null && !ownedLiterals.isEmpty();
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
			case UMLPackage.ENUMERATION___GET_EANNOTATION__STRING :
				return getEAnnotation((String) arguments.get(0));
			case UMLPackage.ENUMERATION___VALIDATE_HAS_OWNER__DIAGNOSTICCHAIN_MAP :
				return validateHasOwner((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.ENUMERATION___VALIDATE_NOT_OWN_SELF__DIAGNOSTICCHAIN_MAP :
				return validateNotOwnSelf((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.ENUMERATION___ADD_KEYWORD__STRING :
				return addKeyword((String) arguments.get(0));
			case UMLPackage.ENUMERATION___APPLY_STEREOTYPE__STEREOTYPE :
				return applyStereotype((Stereotype) arguments.get(0));
			case UMLPackage.ENUMERATION___CREATE_EANNOTATION__STRING :
				return createEAnnotation((String) arguments.get(0));
			case UMLPackage.ENUMERATION___DESTROY :
				destroy();
				return null;
			case UMLPackage.ENUMERATION___GET_KEYWORDS :
				return getKeywords();
			case UMLPackage.ENUMERATION___GET_APPLICABLE_STEREOTYPE__STRING :
				return getApplicableStereotype((String) arguments.get(0));
			case UMLPackage.ENUMERATION___GET_APPLICABLE_STEREOTYPES :
				return getApplicableStereotypes();
			case UMLPackage.ENUMERATION___GET_APPLIED_STEREOTYPE__STRING :
				return getAppliedStereotype((String) arguments.get(0));
			case UMLPackage.ENUMERATION___GET_APPLIED_STEREOTYPES :
				return getAppliedStereotypes();
			case UMLPackage.ENUMERATION___GET_APPLIED_SUBSTEREOTYPE__STEREOTYPE_STRING :
				return getAppliedSubstereotype((Stereotype) arguments.get(0),
					(String) arguments.get(1));
			case UMLPackage.ENUMERATION___GET_APPLIED_SUBSTEREOTYPES__STEREOTYPE :
				return getAppliedSubstereotypes((Stereotype) arguments.get(0));
			case UMLPackage.ENUMERATION___GET_MODEL :
				return getModel();
			case UMLPackage.ENUMERATION___GET_NEAREST_PACKAGE :
				return getNearestPackage();
			case UMLPackage.ENUMERATION___GET_RELATIONSHIPS :
				return getRelationships();
			case UMLPackage.ENUMERATION___GET_RELATIONSHIPS__ECLASS :
				return getRelationships((EClass) arguments.get(0));
			case UMLPackage.ENUMERATION___GET_REQUIRED_STEREOTYPE__STRING :
				return getRequiredStereotype((String) arguments.get(0));
			case UMLPackage.ENUMERATION___GET_REQUIRED_STEREOTYPES :
				return getRequiredStereotypes();
			case UMLPackage.ENUMERATION___GET_SOURCE_DIRECTED_RELATIONSHIPS :
				return getSourceDirectedRelationships();
			case UMLPackage.ENUMERATION___GET_SOURCE_DIRECTED_RELATIONSHIPS__ECLASS :
				return getSourceDirectedRelationships(
					(EClass) arguments.get(0));
			case UMLPackage.ENUMERATION___GET_STEREOTYPE_APPLICATION__STEREOTYPE :
				return getStereotypeApplication((Stereotype) arguments.get(0));
			case UMLPackage.ENUMERATION___GET_STEREOTYPE_APPLICATIONS :
				return getStereotypeApplications();
			case UMLPackage.ENUMERATION___GET_TARGET_DIRECTED_RELATIONSHIPS :
				return getTargetDirectedRelationships();
			case UMLPackage.ENUMERATION___GET_TARGET_DIRECTED_RELATIONSHIPS__ECLASS :
				return getTargetDirectedRelationships(
					(EClass) arguments.get(0));
			case UMLPackage.ENUMERATION___GET_VALUE__STEREOTYPE_STRING :
				return getValue((Stereotype) arguments.get(0),
					(String) arguments.get(1));
			case UMLPackage.ENUMERATION___HAS_KEYWORD__STRING :
				return hasKeyword((String) arguments.get(0));
			case UMLPackage.ENUMERATION___HAS_VALUE__STEREOTYPE_STRING :
				return hasValue((Stereotype) arguments.get(0),
					(String) arguments.get(1));
			case UMLPackage.ENUMERATION___IS_STEREOTYPE_APPLICABLE__STEREOTYPE :
				return isStereotypeApplicable((Stereotype) arguments.get(0));
			case UMLPackage.ENUMERATION___IS_STEREOTYPE_APPLIED__STEREOTYPE :
				return isStereotypeApplied((Stereotype) arguments.get(0));
			case UMLPackage.ENUMERATION___IS_STEREOTYPE_REQUIRED__STEREOTYPE :
				return isStereotypeRequired((Stereotype) arguments.get(0));
			case UMLPackage.ENUMERATION___REMOVE_KEYWORD__STRING :
				return removeKeyword((String) arguments.get(0));
			case UMLPackage.ENUMERATION___SET_VALUE__STEREOTYPE_STRING_OBJECT :
				setValue((Stereotype) arguments.get(0),
					(String) arguments.get(1), arguments.get(2));
				return null;
			case UMLPackage.ENUMERATION___UNAPPLY_STEREOTYPE__STEREOTYPE :
				return unapplyStereotype((Stereotype) arguments.get(0));
			case UMLPackage.ENUMERATION___ALL_OWNED_ELEMENTS :
				return allOwnedElements();
			case UMLPackage.ENUMERATION___MUST_BE_OWNED :
				return mustBeOwned();
			case UMLPackage.ENUMERATION___VALIDATE_VISIBILITY_NEEDS_OWNERSHIP__DIAGNOSTICCHAIN_MAP :
				return validateVisibilityNeedsOwnership(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.ENUMERATION___VALIDATE_HAS_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP :
				return validateHasQualifiedName(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.ENUMERATION___VALIDATE_HAS_NO_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP :
				return validateHasNoQualifiedName(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.ENUMERATION___CREATE_DEPENDENCY__NAMEDELEMENT :
				return createDependency((NamedElement) arguments.get(0));
			case UMLPackage.ENUMERATION___CREATE_USAGE__NAMEDELEMENT :
				return createUsage((NamedElement) arguments.get(0));
			case UMLPackage.ENUMERATION___GET_LABEL :
				return getLabel();
			case UMLPackage.ENUMERATION___GET_LABEL__BOOLEAN :
				return getLabel((Boolean) arguments.get(0));
			case UMLPackage.ENUMERATION___GET_NAMESPACE :
				return getNamespace();
			case UMLPackage.ENUMERATION___ALL_NAMESPACES :
				return allNamespaces();
			case UMLPackage.ENUMERATION___ALL_OWNING_PACKAGES :
				return allOwningPackages();
			case UMLPackage.ENUMERATION___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE :
				return isDistinguishableFrom((NamedElement) arguments.get(0),
					(Namespace) arguments.get(1));
			case UMLPackage.ENUMERATION___GET_QUALIFIED_NAME :
				return getQualifiedName();
			case UMLPackage.ENUMERATION___SEPARATOR :
				return separator();
			case UMLPackage.ENUMERATION___GET_CLIENT_DEPENDENCIES :
				return getClientDependencies();
			case UMLPackage.ENUMERATION___VALIDATE_MEMBERS_DISTINGUISHABLE__DIAGNOSTICCHAIN_MAP :
				return validateMembersDistinguishable(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.ENUMERATION___VALIDATE_CANNOT_IMPORT_SELF__DIAGNOSTICCHAIN_MAP :
				return validateCannotImportSelf(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.ENUMERATION___VALIDATE_CANNOT_IMPORT_OWNED_MEMBERS__DIAGNOSTICCHAIN_MAP :
				return validateCannotImportOwnedMembers(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.ENUMERATION___CREATE_ELEMENT_IMPORT__PACKAGEABLEELEMENT_VISIBILITYKIND :
				return createElementImport(
					(PackageableElement) arguments.get(0),
					(VisibilityKind) arguments.get(1));
			case UMLPackage.ENUMERATION___CREATE_PACKAGE_IMPORT__PACKAGE_VISIBILITYKIND :
				return createPackageImport(
					(org.eclipse.uml2.uml.Package) arguments.get(0),
					(VisibilityKind) arguments.get(1));
			case UMLPackage.ENUMERATION___GET_IMPORTED_ELEMENTS :
				return getImportedElements();
			case UMLPackage.ENUMERATION___GET_IMPORTED_PACKAGES :
				return getImportedPackages();
			case UMLPackage.ENUMERATION___GET_OWNED_MEMBERS :
				return getOwnedMembers();
			case UMLPackage.ENUMERATION___EXCLUDE_COLLISIONS__ELIST :
				return excludeCollisions(
					(EList<PackageableElement>) arguments.get(0));
			case UMLPackage.ENUMERATION___GET_NAMES_OF_MEMBER__NAMEDELEMENT :
				return getNamesOfMember((NamedElement) arguments.get(0));
			case UMLPackage.ENUMERATION___IMPORT_MEMBERS__ELIST :
				return importMembers(
					(EList<PackageableElement>) arguments.get(0));
			case UMLPackage.ENUMERATION___GET_IMPORTED_MEMBERS :
				return getImportedMembers();
			case UMLPackage.ENUMERATION___MEMBERS_ARE_DISTINGUISHABLE :
				return membersAreDistinguishable();
			case UMLPackage.ENUMERATION___VALIDATE_REDEFINITION_CONSISTENT__DIAGNOSTICCHAIN_MAP :
				return validateRedefinitionConsistent(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.ENUMERATION___VALIDATE_NON_LEAF_REDEFINITION__DIAGNOSTICCHAIN_MAP :
				return validateNonLeafRedefinition(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.ENUMERATION___VALIDATE_REDEFINITION_CONTEXT_VALID__DIAGNOSTICCHAIN_MAP :
				return validateRedefinitionContextValid(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.ENUMERATION___IS_CONSISTENT_WITH__REDEFINABLEELEMENT :
				return isConsistentWith((RedefinableElement) arguments.get(0));
			case UMLPackage.ENUMERATION___IS_REDEFINITION_CONTEXT_VALID__REDEFINABLEELEMENT :
				return isRedefinitionContextValid(
					(RedefinableElement) arguments.get(0));
			case UMLPackage.ENUMERATION___IS_COMPATIBLE_WITH__PARAMETERABLEELEMENT :
				return isCompatibleWith(
					(ParameterableElement) arguments.get(0));
			case UMLPackage.ENUMERATION___IS_TEMPLATE_PARAMETER :
				return isTemplateParameter();
			case UMLPackage.ENUMERATION___VALIDATE_NAMESPACE_NEEDS_VISIBILITY__DIAGNOSTICCHAIN_MAP :
				return validateNamespaceNeedsVisibility(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.ENUMERATION___CREATE_ASSOCIATION__BOOLEAN_AGGREGATIONKIND_STRING_INT_INT_TYPE_BOOLEAN_AGGREGATIONKIND_STRING_INT_INT :
				return createAssociation((Boolean) arguments.get(0),
					(AggregationKind) arguments.get(1),
					(String) arguments.get(2), (Integer) arguments.get(3),
					(Integer) arguments.get(4), (Type) arguments.get(5),
					(Boolean) arguments.get(6),
					(AggregationKind) arguments.get(7),
					(String) arguments.get(8), (Integer) arguments.get(9),
					(Integer) arguments.get(10));
			case UMLPackage.ENUMERATION___GET_ASSOCIATIONS :
				return getAssociations();
			case UMLPackage.ENUMERATION___CONFORMS_TO__TYPE :
				return conformsTo((Type) arguments.get(0));
			case UMLPackage.ENUMERATION___IS_TEMPLATE :
				return isTemplate();
			case UMLPackage.ENUMERATION___PARAMETERABLE_ELEMENTS :
				return parameterableElements();
			case UMLPackage.ENUMERATION___VALIDATE_SPECIALIZE_TYPE__DIAGNOSTICCHAIN_MAP :
				return validateSpecializeType(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.ENUMERATION___VALIDATE_MAPS_TO_GENERALIZATION_SET__DIAGNOSTICCHAIN_MAP :
				return validateMapsToGeneralizationSet(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.ENUMERATION___VALIDATE_NON_FINAL_PARENTS__DIAGNOSTICCHAIN_MAP :
				return validateNonFinalParents(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.ENUMERATION___VALIDATE_NO_CYCLES_IN_GENERALIZATION__DIAGNOSTICCHAIN_MAP :
				return validateNoCyclesInGeneralization(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.ENUMERATION___GET_ALL_ATTRIBUTES :
				return getAllAttributes();
			case UMLPackage.ENUMERATION___GET_ALL_OPERATIONS :
				return getAllOperations();
			case UMLPackage.ENUMERATION___GET_ALL_USED_INTERFACES :
				return getAllUsedInterfaces();
			case UMLPackage.ENUMERATION___GET_OPERATION__STRING_ELIST_ELIST :
				return getOperation((String) arguments.get(0),
					(EList<String>) arguments.get(1),
					(EList<Type>) arguments.get(2));
			case UMLPackage.ENUMERATION___GET_OPERATION__STRING_ELIST_ELIST_BOOLEAN :
				return getOperation((String) arguments.get(0),
					(EList<String>) arguments.get(1),
					(EList<Type>) arguments.get(2), (Boolean) arguments.get(3));
			case UMLPackage.ENUMERATION___GET_OPERATIONS :
				return getOperations();
			case UMLPackage.ENUMERATION___GET_USED_INTERFACES :
				return getUsedInterfaces();
			case UMLPackage.ENUMERATION___ALL_FEATURES :
				return allFeatures();
			case UMLPackage.ENUMERATION___ALL_PARENTS :
				return allParents();
			case UMLPackage.ENUMERATION___GET_GENERALS :
				return getGenerals();
			case UMLPackage.ENUMERATION___HAS_VISIBILITY_OF__NAMEDELEMENT :
				return hasVisibilityOf((NamedElement) arguments.get(0));
			case UMLPackage.ENUMERATION___INHERIT__ELIST :
				return inherit((EList<NamedElement>) arguments.get(0));
			case UMLPackage.ENUMERATION___INHERITABLE_MEMBERS__CLASSIFIER :
				return inheritableMembers((Classifier) arguments.get(0));
			case UMLPackage.ENUMERATION___GET_INHERITED_MEMBERS :
				return getInheritedMembers();
			case UMLPackage.ENUMERATION___MAY_SPECIALIZE_TYPE__CLASSIFIER :
				return maySpecializeType((Classifier) arguments.get(0));
			case UMLPackage.ENUMERATION___PARENTS :
				return parents();
			case UMLPackage.ENUMERATION___DIRECTLY_REALIZED_INTERFACES :
				return directlyRealizedInterfaces();
			case UMLPackage.ENUMERATION___DIRECTLY_USED_INTERFACES :
				return directlyUsedInterfaces();
			case UMLPackage.ENUMERATION___ALL_REALIZED_INTERFACES :
				return allRealizedInterfaces();
			case UMLPackage.ENUMERATION___ALL_USED_INTERFACES :
				return allUsedInterfaces();
			case UMLPackage.ENUMERATION___IS_SUBSTITUTABLE_FOR__CLASSIFIER :
				return isSubstitutableFor((Classifier) arguments.get(0));
			case UMLPackage.ENUMERATION___ALL_ATTRIBUTES :
				return allAttributes();
			case UMLPackage.ENUMERATION___ALL_SLOTTABLE_FEATURES :
				return allSlottableFeatures();
			case UMLPackage.ENUMERATION___CREATE_OWNED_ATTRIBUTE__STRING_TYPE_INT_INT :
				return createOwnedAttribute((String) arguments.get(0),
					(Type) arguments.get(1), (Integer) arguments.get(2),
					(Integer) arguments.get(3));
			case UMLPackage.ENUMERATION___CREATE_OWNED_OPERATION__STRING_ELIST_ELIST_TYPE :
				return createOwnedOperation((String) arguments.get(0),
					(EList<String>) arguments.get(1),
					(EList<Type>) arguments.get(2), (Type) arguments.get(3));
			case UMLPackage.ENUMERATION___VALIDATE_IMMUTABLE__DIAGNOSTICCHAIN_MAP :
				return validateImmutable((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
		}
		return eDynamicInvoke(operationID, arguments);
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
		UMLPackage.ENUMERATION__OWNED_RULE,
		UMLPackage.ENUMERATION__OWNED_USE_CASE,
		UMLPackage.ENUMERATION__OWNED_ATTRIBUTE,
		UMLPackage.ENUMERATION__OWNED_OPERATION,
		UMLPackage.ENUMERATION__OWNED_LITERAL};

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetOwnedMembers() {
		return super.isSetOwnedMembers()
			|| eIsSet(UMLPackage.ENUMERATION__OWNED_LITERAL);
	}

} //EnumerationImpl
