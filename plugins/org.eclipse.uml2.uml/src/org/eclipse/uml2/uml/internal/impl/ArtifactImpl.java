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
 * $Id: ArtifactImpl.java,v 1.20 2006/02/22 23:49:06 khussey Exp $
 */
package org.eclipse.uml2.uml.internal.impl;

import java.util.Collection;
import java.util.Iterator;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.uml2.common.util.DerivedUnionEObjectEList;
import org.eclipse.uml2.common.util.SubsetSupersetEObjectContainmentEList;
import org.eclipse.uml2.common.util.SubsetSupersetEObjectWithInverseResolvingEList;

import org.eclipse.uml2.uml.Artifact;
import org.eclipse.uml2.uml.CollaborationUse;
import org.eclipse.uml2.uml.Dependency;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Feature;
import org.eclipse.uml2.uml.Manifestation;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Operation;
import org.eclipse.uml2.uml.PackageableElement;
import org.eclipse.uml2.uml.Parameter;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.StringExpression;
import org.eclipse.uml2.uml.TemplateParameter;
import org.eclipse.uml2.uml.TemplateSignature;
import org.eclipse.uml2.uml.Type;
import org.eclipse.uml2.uml.UMLFactory;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.VisibilityKind;

import org.eclipse.uml2.uml.internal.operations.ArtifactOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Artifact</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ArtifactImpl#getOwnedMembers <em>Owned Member</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ArtifactImpl#getOwnedElements <em>Owned Element</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ArtifactImpl#getFeatures <em>Feature</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ArtifactImpl#getAttributes <em>Attribute</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ArtifactImpl#getClientDependencies <em>Client Dependency</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ArtifactImpl#getFileName <em>File Name</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ArtifactImpl#getNestedArtifacts <em>Nested Artifact</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ArtifactImpl#getManifestations <em>Manifestation</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ArtifactImpl#getOwnedOperations <em>Owned Operation</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ArtifactImpl#getOwnedAttributes <em>Owned Attribute</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ArtifactImpl
		extends ClassifierImpl
		implements Artifact {

	/**
	 * The default value of the '{@link #getFileName() <em>File Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFileName()
	 * @generated
	 * @ordered
	 */
	protected static final String FILE_NAME_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArtifactImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return UMLPackage.Literals.ARTIFACT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getOwnedMembers() {
		EList ownedMember = (EList) eVirtualGet(UMLPackage.ARTIFACT__OWNED_MEMBER);
		if (ownedMember == null) {
			eVirtualSet(UMLPackage.ARTIFACT__OWNED_MEMBER,
				ownedMember = new DerivedUnionEObjectEList(NamedElement.class,
					this, UMLPackage.ARTIFACT__OWNED_MEMBER, new int[]{
						UMLPackage.ARTIFACT__OWNED_RULE,
						UMLPackage.ARTIFACT__OWNED_USE_CASE,
						UMLPackage.ARTIFACT__NESTED_ARTIFACT,
						UMLPackage.ARTIFACT__OWNED_OPERATION,
						UMLPackage.ARTIFACT__OWNED_ATTRIBUTE}));
		}
		return ownedMember;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getOwnedElements() {
		EList ownedElement = (EList) eVirtualGet(UMLPackage.ARTIFACT__OWNED_ELEMENT);
		if (ownedElement == null) {
			eVirtualSet(UMLPackage.ARTIFACT__OWNED_ELEMENT,
				ownedElement = new DerivedUnionEObjectEList(Element.class,
					this, UMLPackage.ARTIFACT__OWNED_ELEMENT, new int[]{
						UMLPackage.ARTIFACT__OWNED_COMMENT,
						UMLPackage.ARTIFACT__NAME_EXPRESSION,
						UMLPackage.ARTIFACT__ELEMENT_IMPORT,
						UMLPackage.ARTIFACT__PACKAGE_IMPORT,
						UMLPackage.ARTIFACT__OWNED_MEMBER,
						UMLPackage.ARTIFACT__TEMPLATE_BINDING,
						UMLPackage.ARTIFACT__OWNED_TEMPLATE_SIGNATURE,
						UMLPackage.ARTIFACT__GENERALIZATION,
						UMLPackage.ARTIFACT__SUBSTITUTION,
						UMLPackage.ARTIFACT__COLLABORATION_USE,
						UMLPackage.ARTIFACT__MANIFESTATION}));
		}
		return ownedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getFeatures() {
		EList feature = (EList) eVirtualGet(UMLPackage.ARTIFACT__FEATURE);
		if (feature == null) {
			eVirtualSet(UMLPackage.ARTIFACT__FEATURE,
				feature = new DerivedUnionEObjectEList(Feature.class, this,
					UMLPackage.ARTIFACT__FEATURE, new int[]{
						UMLPackage.ARTIFACT__ATTRIBUTE,
						UMLPackage.ARTIFACT__OWNED_OPERATION}));
		}
		return feature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getAttributes() {
		EList attribute = (EList) eVirtualGet(UMLPackage.ARTIFACT__ATTRIBUTE);
		if (attribute == null) {
			eVirtualSet(UMLPackage.ARTIFACT__ATTRIBUTE,
				attribute = new DerivedUnionEObjectEList(Property.class, this,
					UMLPackage.ARTIFACT__ATTRIBUTE,
					new int[]{UMLPackage.ARTIFACT__OWNED_ATTRIBUTE}));
		}
		return attribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getClientDependencies() {
		EList clientDependency = (EList) eVirtualGet(UMLPackage.ARTIFACT__CLIENT_DEPENDENCY);
		if (clientDependency == null) {
			eVirtualSet(
				UMLPackage.ARTIFACT__CLIENT_DEPENDENCY,
				clientDependency = new SubsetSupersetEObjectWithInverseResolvingEList.ManyInverse(
					Dependency.class, this,
					UMLPackage.ARTIFACT__CLIENT_DEPENDENCY, null, new int[]{
						UMLPackage.ARTIFACT__SUBSTITUTION,
						UMLPackage.ARTIFACT__MANIFESTATION},
					UMLPackage.DEPENDENCY__CLIENT));
		}
		return clientDependency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFileName() {
		return (String) eVirtualGet(UMLPackage.ARTIFACT__FILE_NAME,
			FILE_NAME_EDEFAULT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFileName(String newFileName) {
		String fileName = newFileName;
		Object oldFileName = eVirtualSet(UMLPackage.ARTIFACT__FILE_NAME,
			fileName);
		boolean isSetChange = oldFileName == EVIRTUAL_NO_VALUE;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.ARTIFACT__FILE_NAME, isSetChange
					? FILE_NAME_EDEFAULT
					: oldFileName, fileName, isSetChange));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetFileName() {
		Object oldFileName = eVirtualUnset(UMLPackage.ARTIFACT__FILE_NAME);
		boolean isSetChange = oldFileName != EVIRTUAL_NO_VALUE;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET,
				UMLPackage.ARTIFACT__FILE_NAME, isSetChange
					? oldFileName
					: FILE_NAME_EDEFAULT, FILE_NAME_EDEFAULT, isSetChange));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetFileName() {
		return eVirtualIsSet(UMLPackage.ARTIFACT__FILE_NAME);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getNestedArtifacts() {
		EList nestedArtifact = (EList) eVirtualGet(UMLPackage.ARTIFACT__NESTED_ARTIFACT);
		if (nestedArtifact == null) {
			eVirtualSet(UMLPackage.ARTIFACT__NESTED_ARTIFACT,
				nestedArtifact = new EObjectContainmentEList.Resolving(
					Artifact.class, this, UMLPackage.ARTIFACT__NESTED_ARTIFACT));
		}
		return nestedArtifact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Artifact createNestedArtifact(String name, EClass eClass) {
		Artifact newNestedArtifact = (Artifact) EcoreUtil.create(eClass);
		if (name != null)
			newNestedArtifact.setName(name);
		getNestedArtifacts().add(newNestedArtifact);
		return newNestedArtifact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Artifact createNestedArtifact(String name) {
		Artifact newNestedArtifact = UMLFactory.eINSTANCE.createArtifact();
		if (name != null)
			newNestedArtifact.setName(name);
		getNestedArtifacts().add(newNestedArtifact);
		return newNestedArtifact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Artifact getNestedArtifact(String name) {
		return getNestedArtifact(name, false, null, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Artifact getNestedArtifact(String name, boolean ignoreCase,
			EClass eClass, boolean createOnDemand) {
		nestedArtifactLoop : for (Iterator i = getNestedArtifacts().iterator(); i
			.hasNext();) {
			Artifact nestedArtifact = (Artifact) i.next();
			if (eClass != null && !eClass.isInstance(nestedArtifact))
				continue nestedArtifactLoop;
			if (name != null && !(ignoreCase
				? name.equalsIgnoreCase(nestedArtifact.getName())
				: name.equals(nestedArtifact.getName())))
				continue nestedArtifactLoop;
			return nestedArtifact;
		}
		return createOnDemand && eClass != null
			? createNestedArtifact(name, eClass)
			: null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getManifestations() {
		EList manifestation = (EList) eVirtualGet(UMLPackage.ARTIFACT__MANIFESTATION);
		if (manifestation == null) {
			eVirtualSet(
				UMLPackage.ARTIFACT__MANIFESTATION,
				manifestation = new SubsetSupersetEObjectContainmentEList.Resolving(
					Manifestation.class, this,
					UMLPackage.ARTIFACT__MANIFESTATION,
					new int[]{UMLPackage.ARTIFACT__CLIENT_DEPENDENCY}, null));
		}
		return manifestation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Manifestation createManifestation(String name,
			PackageableElement utilizedElement) {
		Manifestation newManifestation = UMLFactory.eINSTANCE
			.createManifestation();
		if (name != null)
			newManifestation.setName(name);
		if (utilizedElement != null)
			newManifestation.setUtilizedElement(utilizedElement);
		getManifestations().add(newManifestation);
		return newManifestation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Manifestation getManifestation(String name,
			PackageableElement utilizedElement) {
		return getManifestation(name, utilizedElement, false, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Manifestation getManifestation(String name,
			PackageableElement utilizedElement, boolean ignoreCase,
			boolean createOnDemand) {
		manifestationLoop : for (Iterator i = getManifestations().iterator(); i
			.hasNext();) {
			Manifestation manifestation = (Manifestation) i.next();
			if (name != null && !(ignoreCase
				? name.equalsIgnoreCase(manifestation.getName())
				: name.equals(manifestation.getName())))
				continue manifestationLoop;
			if (utilizedElement != null
				&& !utilizedElement.equals(manifestation.getUtilizedElement()))
				continue manifestationLoop;
			return manifestation;
		}
		return createOnDemand
			? createManifestation(name, utilizedElement)
			: null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getOwnedOperations() {
		EList ownedOperation = (EList) eVirtualGet(UMLPackage.ARTIFACT__OWNED_OPERATION);
		if (ownedOperation == null) {
			eVirtualSet(
				UMLPackage.ARTIFACT__OWNED_OPERATION,
				ownedOperation = new EObjectContainmentEList.Resolving(
					Operation.class, this, UMLPackage.ARTIFACT__OWNED_OPERATION));
		}
		return ownedOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operation createOwnedOperation(String name,
			EList ownedParameterNames, EList ownedParameterTypes) {
		Operation newOwnedOperation = UMLFactory.eINSTANCE.createOperation();
		if (name != null)
			newOwnedOperation.setName(name);
		int ownedParameterListSize = 0;
		int ownedParameterNamesSize = ownedParameterNames == null
			? 0
			: ownedParameterNames.size();
		if (ownedParameterNamesSize > ownedParameterListSize)
			ownedParameterListSize = ownedParameterNamesSize;
		int ownedParameterTypesSize = ownedParameterTypes == null
			? 0
			: ownedParameterTypes.size();
		if (ownedParameterTypesSize > ownedParameterListSize)
			ownedParameterListSize = ownedParameterTypesSize;
		for (int i = 0; i < ownedParameterListSize; i++) {
			newOwnedOperation.createOwnedParameter(i < ownedParameterNamesSize
				? (String) ownedParameterNames.get(i)
				: null, i < ownedParameterTypesSize
				? (Type) ownedParameterTypes.get(i)
				: null);
		}
		getOwnedOperations().add(newOwnedOperation);
		return newOwnedOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operation getOwnedOperation(String name, EList ownedParameterNames,
			EList ownedParameterTypes) {
		return getOwnedOperation(name, ownedParameterNames,
			ownedParameterTypes, false, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operation getOwnedOperation(String name, EList ownedParameterNames,
			EList ownedParameterTypes, boolean ignoreCase,
			boolean createOnDemand) {
		ownedOperationLoop : for (Iterator i = getOwnedOperations().iterator(); i
			.hasNext();) {
			Operation ownedOperation = (Operation) i.next();
			if (name != null && !(ignoreCase
				? name.equalsIgnoreCase(ownedOperation.getName())
				: name.equals(ownedOperation.getName())))
				continue ownedOperationLoop;
			EList ownedParameterList = ownedOperation.getOwnedParameters();
			int ownedParameterListSize = ownedParameterList.size();
			if (ownedParameterNames != null
				&& ownedParameterNames.size() != ownedParameterListSize
				|| (ownedParameterTypes != null && ownedParameterTypes.size() != ownedParameterListSize))
				continue ownedOperationLoop;
			for (int j = 0; j < ownedParameterListSize; j++) {
				Parameter ownedParameter = (Parameter) ownedParameterList
					.get(j);
				if (ownedParameterNames != null
					&& !(ignoreCase
						? ((String) ownedParameterNames.get(j))
							.equalsIgnoreCase(ownedParameter.getName())
						: ownedParameterNames.get(j).equals(
							ownedParameter.getName())))
					continue ownedOperationLoop;
				if (ownedParameterTypes != null
					&& !ownedParameterTypes.get(j).equals(
						ownedParameter.getType()))
					continue ownedOperationLoop;
			}
			return ownedOperation;
		}
		return createOnDemand
			? createOwnedOperation(name, ownedParameterNames,
				ownedParameterTypes)
			: null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getOwnedAttributes() {
		EList ownedAttribute = (EList) eVirtualGet(UMLPackage.ARTIFACT__OWNED_ATTRIBUTE);
		if (ownedAttribute == null) {
			eVirtualSet(UMLPackage.ARTIFACT__OWNED_ATTRIBUTE,
				ownedAttribute = new EObjectContainmentEList.Resolving(
					Property.class, this, UMLPackage.ARTIFACT__OWNED_ATTRIBUTE));
		}
		return ownedAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property createOwnedAttribute(String name, Type type, EClass eClass) {
		Property newOwnedAttribute = (Property) EcoreUtil.create(eClass);
		if (name != null)
			newOwnedAttribute.setName(name);
		if (type != null)
			newOwnedAttribute.setType(type);
		getOwnedAttributes().add(newOwnedAttribute);
		return newOwnedAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property createOwnedAttribute(String name, Type type) {
		Property newOwnedAttribute = UMLFactory.eINSTANCE.createProperty();
		if (name != null)
			newOwnedAttribute.setName(name);
		if (type != null)
			newOwnedAttribute.setType(type);
		getOwnedAttributes().add(newOwnedAttribute);
		return newOwnedAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property getOwnedAttribute(String name, Type type) {
		return getOwnedAttribute(name, type, false, null, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property getOwnedAttribute(String name, Type type,
			boolean ignoreCase, EClass eClass, boolean createOnDemand) {
		ownedAttributeLoop : for (Iterator i = getOwnedAttributes().iterator(); i
			.hasNext();) {
			Property ownedAttribute = (Property) i.next();
			if (eClass != null && !eClass.isInstance(ownedAttribute))
				continue ownedAttributeLoop;
			if (name != null && !(ignoreCase
				? name.equalsIgnoreCase(ownedAttribute.getName())
				: name.equals(ownedAttribute.getName())))
				continue ownedAttributeLoop;
			if (type != null && !type.equals(ownedAttribute.getType()))
				continue ownedAttributeLoop;
			return ownedAttribute;
		}
		return createOnDemand && eClass != null
			? createOwnedAttribute(name, type, eClass)
			: null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operation createOwnedOperation(String name, EList parameterNames,
			EList parameterTypes, Type returnType) {
		return ArtifactOperations.createOwnedOperation(this, name,
			parameterNames, parameterTypes, returnType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property createOwnedAttribute(String name, Type type, int lower,
			int upper) {
		return ArtifactOperations.createOwnedAttribute(this, name, type, lower,
			upper);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UMLPackage.ARTIFACT__EANNOTATIONS :
				return ((InternalEList) getEAnnotations()).basicAdd(otherEnd,
					msgs);
			case UMLPackage.ARTIFACT__CLIENT_DEPENDENCY :
				return ((InternalEList) getClientDependencies()).basicAdd(
					otherEnd, msgs);
			case UMLPackage.ARTIFACT__ELEMENT_IMPORT :
				return ((InternalEList) getElementImports()).basicAdd(otherEnd,
					msgs);
			case UMLPackage.ARTIFACT__PACKAGE_IMPORT :
				return ((InternalEList) getPackageImports()).basicAdd(otherEnd,
					msgs);
			case UMLPackage.ARTIFACT__OWNED_RULE :
				return ((InternalEList) getOwnedRules()).basicAdd(otherEnd,
					msgs);
			case UMLPackage.ARTIFACT__OWNING_TEMPLATE_PARAMETER :
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return eBasicSetContainer(otherEnd,
					UMLPackage.ARTIFACT__OWNING_TEMPLATE_PARAMETER, msgs);
			case UMLPackage.ARTIFACT__TEMPLATE_PARAMETER :
				TemplateParameter templateParameter = (TemplateParameter) eVirtualGet(UMLPackage.ARTIFACT__TEMPLATE_PARAMETER);
				if (templateParameter != null)
					msgs = ((InternalEObject) templateParameter)
						.eInverseRemove(this,
							UMLPackage.TEMPLATE_PARAMETER__PARAMETERED_ELEMENT,
							TemplateParameter.class, msgs);
				return basicSetTemplateParameter((TemplateParameter) otherEnd,
					msgs);
			case UMLPackage.ARTIFACT__TEMPLATE_BINDING :
				return ((InternalEList) getTemplateBindings()).basicAdd(
					otherEnd, msgs);
			case UMLPackage.ARTIFACT__OWNED_TEMPLATE_SIGNATURE :
				TemplateSignature ownedTemplateSignature = (TemplateSignature) eVirtualGet(UMLPackage.ARTIFACT__OWNED_TEMPLATE_SIGNATURE);
				if (ownedTemplateSignature != null)
					msgs = ((InternalEObject) ownedTemplateSignature)
						.eInverseRemove(this, EOPPOSITE_FEATURE_BASE
							- UMLPackage.ARTIFACT__OWNED_TEMPLATE_SIGNATURE,
							null, msgs);
				return basicSetOwnedTemplateSignature(
					(TemplateSignature) otherEnd, msgs);
			case UMLPackage.ARTIFACT__GENERALIZATION :
				return ((InternalEList) getGeneralizations()).basicAdd(
					otherEnd, msgs);
			case UMLPackage.ARTIFACT__POWERTYPE_EXTENT :
				return ((InternalEList) getPowertypeExtents()).basicAdd(
					otherEnd, msgs);
			case UMLPackage.ARTIFACT__SUBSTITUTION :
				return ((InternalEList) getSubstitutions()).basicAdd(otherEnd,
					msgs);
			case UMLPackage.ARTIFACT__USE_CASE :
				return ((InternalEList) getUseCases()).basicAdd(otherEnd, msgs);
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
			case UMLPackage.ARTIFACT__EANNOTATIONS :
				return ((InternalEList) getEAnnotations()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.ARTIFACT__OWNED_COMMENT :
				return ((InternalEList) getOwnedComments()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.ARTIFACT__CLIENT_DEPENDENCY :
				return ((InternalEList) getClientDependencies()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.ARTIFACT__NAME_EXPRESSION :
				return basicSetNameExpression(null, msgs);
			case UMLPackage.ARTIFACT__ELEMENT_IMPORT :
				return ((InternalEList) getElementImports()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.ARTIFACT__PACKAGE_IMPORT :
				return ((InternalEList) getPackageImports()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.ARTIFACT__OWNED_RULE :
				return ((InternalEList) getOwnedRules()).basicRemove(otherEnd,
					msgs);
			case UMLPackage.ARTIFACT__OWNING_TEMPLATE_PARAMETER :
				return eBasicSetContainer(null,
					UMLPackage.ARTIFACT__OWNING_TEMPLATE_PARAMETER, msgs);
			case UMLPackage.ARTIFACT__TEMPLATE_PARAMETER :
				return basicSetTemplateParameter(null, msgs);
			case UMLPackage.ARTIFACT__TEMPLATE_BINDING :
				return ((InternalEList) getTemplateBindings()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.ARTIFACT__OWNED_TEMPLATE_SIGNATURE :
				return basicSetOwnedTemplateSignature(null, msgs);
			case UMLPackage.ARTIFACT__GENERALIZATION :
				return ((InternalEList) getGeneralizations()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.ARTIFACT__POWERTYPE_EXTENT :
				return ((InternalEList) getPowertypeExtents()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.ARTIFACT__SUBSTITUTION :
				return ((InternalEList) getSubstitutions()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.ARTIFACT__COLLABORATION_USE :
				return ((InternalEList) getCollaborationUses()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.ARTIFACT__OWNED_USE_CASE :
				return ((InternalEList) getOwnedUseCases()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.ARTIFACT__USE_CASE :
				return ((InternalEList) getUseCases()).basicRemove(otherEnd,
					msgs);
			case UMLPackage.ARTIFACT__NESTED_ARTIFACT :
				return ((InternalEList) getNestedArtifacts()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.ARTIFACT__MANIFESTATION :
				return ((InternalEList) getManifestations()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.ARTIFACT__OWNED_OPERATION :
				return ((InternalEList) getOwnedOperations()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.ARTIFACT__OWNED_ATTRIBUTE :
				return ((InternalEList) getOwnedAttributes()).basicRemove(
					otherEnd, msgs);
		}
		return eDynamicInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UMLPackage.ARTIFACT__EANNOTATIONS :
				return getEAnnotations();
			case UMLPackage.ARTIFACT__OWNED_ELEMENT :
				return getOwnedElements();
			case UMLPackage.ARTIFACT__OWNER :
				if (resolve)
					return getOwner();
				return basicGetOwner();
			case UMLPackage.ARTIFACT__OWNED_COMMENT :
				return getOwnedComments();
			case UMLPackage.ARTIFACT__NAME :
				return getName();
			case UMLPackage.ARTIFACT__VISIBILITY :
				return getVisibility();
			case UMLPackage.ARTIFACT__QUALIFIED_NAME :
				return getQualifiedName();
			case UMLPackage.ARTIFACT__CLIENT_DEPENDENCY :
				return getClientDependencies();
			case UMLPackage.ARTIFACT__NAMESPACE :
				if (resolve)
					return getNamespace();
				return basicGetNamespace();
			case UMLPackage.ARTIFACT__NAME_EXPRESSION :
				if (resolve)
					return getNameExpression();
				return basicGetNameExpression();
			case UMLPackage.ARTIFACT__ELEMENT_IMPORT :
				return getElementImports();
			case UMLPackage.ARTIFACT__PACKAGE_IMPORT :
				return getPackageImports();
			case UMLPackage.ARTIFACT__OWNED_RULE :
				return getOwnedRules();
			case UMLPackage.ARTIFACT__MEMBER :
				return getMembers();
			case UMLPackage.ARTIFACT__IMPORTED_MEMBER :
				return getImportedMembers();
			case UMLPackage.ARTIFACT__OWNED_MEMBER :
				return getOwnedMembers();
			case UMLPackage.ARTIFACT__IS_LEAF :
				return isLeaf()
					? Boolean.TRUE
					: Boolean.FALSE;
			case UMLPackage.ARTIFACT__REDEFINED_ELEMENT :
				return getRedefinedElements();
			case UMLPackage.ARTIFACT__REDEFINITION_CONTEXT :
				return getRedefinitionContexts();
			case UMLPackage.ARTIFACT__OWNING_TEMPLATE_PARAMETER :
				if (resolve)
					return getOwningTemplateParameter();
				return basicGetOwningTemplateParameter();
			case UMLPackage.ARTIFACT__TEMPLATE_PARAMETER :
				if (resolve)
					return getTemplateParameter();
				return basicGetTemplateParameter();
			case UMLPackage.ARTIFACT__PACKAGE :
				if (resolve)
					return getPackage();
				return basicGetPackage();
			case UMLPackage.ARTIFACT__TEMPLATE_BINDING :
				return getTemplateBindings();
			case UMLPackage.ARTIFACT__OWNED_TEMPLATE_SIGNATURE :
				if (resolve)
					return getOwnedTemplateSignature();
				return basicGetOwnedTemplateSignature();
			case UMLPackage.ARTIFACT__IS_ABSTRACT :
				return isAbstract()
					? Boolean.TRUE
					: Boolean.FALSE;
			case UMLPackage.ARTIFACT__GENERALIZATION :
				return getGeneralizations();
			case UMLPackage.ARTIFACT__POWERTYPE_EXTENT :
				return getPowertypeExtents();
			case UMLPackage.ARTIFACT__FEATURE :
				return getFeatures();
			case UMLPackage.ARTIFACT__INHERITED_MEMBER :
				return getInheritedMembers();
			case UMLPackage.ARTIFACT__REDEFINED_CLASSIFIER :
				return getRedefinedClassifiers();
			case UMLPackage.ARTIFACT__GENERAL :
				return getGenerals();
			case UMLPackage.ARTIFACT__SUBSTITUTION :
				return getSubstitutions();
			case UMLPackage.ARTIFACT__ATTRIBUTE :
				return getAttributes();
			case UMLPackage.ARTIFACT__REPRESENTATION :
				if (resolve)
					return getRepresentation();
				return basicGetRepresentation();
			case UMLPackage.ARTIFACT__COLLABORATION_USE :
				return getCollaborationUses();
			case UMLPackage.ARTIFACT__OWNED_USE_CASE :
				return getOwnedUseCases();
			case UMLPackage.ARTIFACT__USE_CASE :
				return getUseCases();
			case UMLPackage.ARTIFACT__FILE_NAME :
				return getFileName();
			case UMLPackage.ARTIFACT__NESTED_ARTIFACT :
				return getNestedArtifacts();
			case UMLPackage.ARTIFACT__MANIFESTATION :
				return getManifestations();
			case UMLPackage.ARTIFACT__OWNED_OPERATION :
				return getOwnedOperations();
			case UMLPackage.ARTIFACT__OWNED_ATTRIBUTE :
				return getOwnedAttributes();
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
			case UMLPackage.ARTIFACT__EANNOTATIONS :
				getEAnnotations().clear();
				getEAnnotations().addAll((Collection) newValue);
				return;
			case UMLPackage.ARTIFACT__OWNED_COMMENT :
				getOwnedComments().clear();
				getOwnedComments().addAll((Collection) newValue);
				return;
			case UMLPackage.ARTIFACT__NAME :
				setName((String) newValue);
				return;
			case UMLPackage.ARTIFACT__VISIBILITY :
				setVisibility((VisibilityKind) newValue);
				return;
			case UMLPackage.ARTIFACT__CLIENT_DEPENDENCY :
				getClientDependencies().clear();
				getClientDependencies().addAll((Collection) newValue);
				return;
			case UMLPackage.ARTIFACT__NAME_EXPRESSION :
				setNameExpression((StringExpression) newValue);
				return;
			case UMLPackage.ARTIFACT__ELEMENT_IMPORT :
				getElementImports().clear();
				getElementImports().addAll((Collection) newValue);
				return;
			case UMLPackage.ARTIFACT__PACKAGE_IMPORT :
				getPackageImports().clear();
				getPackageImports().addAll((Collection) newValue);
				return;
			case UMLPackage.ARTIFACT__OWNED_RULE :
				getOwnedRules().clear();
				getOwnedRules().addAll((Collection) newValue);
				return;
			case UMLPackage.ARTIFACT__IS_LEAF :
				setIsLeaf(((Boolean) newValue).booleanValue());
				return;
			case UMLPackage.ARTIFACT__OWNING_TEMPLATE_PARAMETER :
				setOwningTemplateParameter((TemplateParameter) newValue);
				return;
			case UMLPackage.ARTIFACT__TEMPLATE_PARAMETER :
				setTemplateParameter((TemplateParameter) newValue);
				return;
			case UMLPackage.ARTIFACT__PACKAGE :
				setPackage((org.eclipse.uml2.uml.Package) newValue);
				return;
			case UMLPackage.ARTIFACT__TEMPLATE_BINDING :
				getTemplateBindings().clear();
				getTemplateBindings().addAll((Collection) newValue);
				return;
			case UMLPackage.ARTIFACT__OWNED_TEMPLATE_SIGNATURE :
				setOwnedTemplateSignature((TemplateSignature) newValue);
				return;
			case UMLPackage.ARTIFACT__IS_ABSTRACT :
				setIsAbstract(((Boolean) newValue).booleanValue());
				return;
			case UMLPackage.ARTIFACT__GENERALIZATION :
				getGeneralizations().clear();
				getGeneralizations().addAll((Collection) newValue);
				return;
			case UMLPackage.ARTIFACT__POWERTYPE_EXTENT :
				getPowertypeExtents().clear();
				getPowertypeExtents().addAll((Collection) newValue);
				return;
			case UMLPackage.ARTIFACT__REDEFINED_CLASSIFIER :
				getRedefinedClassifiers().clear();
				getRedefinedClassifiers().addAll((Collection) newValue);
				return;
			case UMLPackage.ARTIFACT__GENERAL :
				getGenerals().clear();
				getGenerals().addAll((Collection) newValue);
				return;
			case UMLPackage.ARTIFACT__SUBSTITUTION :
				getSubstitutions().clear();
				getSubstitutions().addAll((Collection) newValue);
				return;
			case UMLPackage.ARTIFACT__REPRESENTATION :
				setRepresentation((CollaborationUse) newValue);
				return;
			case UMLPackage.ARTIFACT__COLLABORATION_USE :
				getCollaborationUses().clear();
				getCollaborationUses().addAll((Collection) newValue);
				return;
			case UMLPackage.ARTIFACT__OWNED_USE_CASE :
				getOwnedUseCases().clear();
				getOwnedUseCases().addAll((Collection) newValue);
				return;
			case UMLPackage.ARTIFACT__USE_CASE :
				getUseCases().clear();
				getUseCases().addAll((Collection) newValue);
				return;
			case UMLPackage.ARTIFACT__FILE_NAME :
				setFileName((String) newValue);
				return;
			case UMLPackage.ARTIFACT__NESTED_ARTIFACT :
				getNestedArtifacts().clear();
				getNestedArtifacts().addAll((Collection) newValue);
				return;
			case UMLPackage.ARTIFACT__MANIFESTATION :
				getManifestations().clear();
				getManifestations().addAll((Collection) newValue);
				return;
			case UMLPackage.ARTIFACT__OWNED_OPERATION :
				getOwnedOperations().clear();
				getOwnedOperations().addAll((Collection) newValue);
				return;
			case UMLPackage.ARTIFACT__OWNED_ATTRIBUTE :
				getOwnedAttributes().clear();
				getOwnedAttributes().addAll((Collection) newValue);
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
			case UMLPackage.ARTIFACT__EANNOTATIONS :
				getEAnnotations().clear();
				return;
			case UMLPackage.ARTIFACT__OWNED_COMMENT :
				getOwnedComments().clear();
				return;
			case UMLPackage.ARTIFACT__NAME :
				unsetName();
				return;
			case UMLPackage.ARTIFACT__VISIBILITY :
				unsetVisibility();
				return;
			case UMLPackage.ARTIFACT__CLIENT_DEPENDENCY :
				getClientDependencies().clear();
				return;
			case UMLPackage.ARTIFACT__NAME_EXPRESSION :
				setNameExpression((StringExpression) null);
				return;
			case UMLPackage.ARTIFACT__ELEMENT_IMPORT :
				getElementImports().clear();
				return;
			case UMLPackage.ARTIFACT__PACKAGE_IMPORT :
				getPackageImports().clear();
				return;
			case UMLPackage.ARTIFACT__OWNED_RULE :
				getOwnedRules().clear();
				return;
			case UMLPackage.ARTIFACT__IS_LEAF :
				setIsLeaf(IS_LEAF_EDEFAULT);
				return;
			case UMLPackage.ARTIFACT__OWNING_TEMPLATE_PARAMETER :
				setOwningTemplateParameter((TemplateParameter) null);
				return;
			case UMLPackage.ARTIFACT__TEMPLATE_PARAMETER :
				setTemplateParameter((TemplateParameter) null);
				return;
			case UMLPackage.ARTIFACT__PACKAGE :
				setPackage((org.eclipse.uml2.uml.Package) null);
				return;
			case UMLPackage.ARTIFACT__TEMPLATE_BINDING :
				getTemplateBindings().clear();
				return;
			case UMLPackage.ARTIFACT__OWNED_TEMPLATE_SIGNATURE :
				setOwnedTemplateSignature((TemplateSignature) null);
				return;
			case UMLPackage.ARTIFACT__IS_ABSTRACT :
				setIsAbstract(IS_ABSTRACT_EDEFAULT);
				return;
			case UMLPackage.ARTIFACT__GENERALIZATION :
				getGeneralizations().clear();
				return;
			case UMLPackage.ARTIFACT__POWERTYPE_EXTENT :
				getPowertypeExtents().clear();
				return;
			case UMLPackage.ARTIFACT__REDEFINED_CLASSIFIER :
				getRedefinedClassifiers().clear();
				return;
			case UMLPackage.ARTIFACT__GENERAL :
				getGenerals().clear();
				return;
			case UMLPackage.ARTIFACT__SUBSTITUTION :
				getSubstitutions().clear();
				return;
			case UMLPackage.ARTIFACT__REPRESENTATION :
				setRepresentation((CollaborationUse) null);
				return;
			case UMLPackage.ARTIFACT__COLLABORATION_USE :
				getCollaborationUses().clear();
				return;
			case UMLPackage.ARTIFACT__OWNED_USE_CASE :
				getOwnedUseCases().clear();
				return;
			case UMLPackage.ARTIFACT__USE_CASE :
				getUseCases().clear();
				return;
			case UMLPackage.ARTIFACT__FILE_NAME :
				unsetFileName();
				return;
			case UMLPackage.ARTIFACT__NESTED_ARTIFACT :
				getNestedArtifacts().clear();
				return;
			case UMLPackage.ARTIFACT__MANIFESTATION :
				getManifestations().clear();
				return;
			case UMLPackage.ARTIFACT__OWNED_OPERATION :
				getOwnedOperations().clear();
				return;
			case UMLPackage.ARTIFACT__OWNED_ATTRIBUTE :
				getOwnedAttributes().clear();
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
			case UMLPackage.ARTIFACT__EANNOTATIONS :
				EList eAnnotations = (EList) eVirtualGet(UMLPackage.ARTIFACT__EANNOTATIONS);
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UMLPackage.ARTIFACT__OWNED_ELEMENT :
				return isSetOwnedElements();
			case UMLPackage.ARTIFACT__OWNER :
				return isSetOwner();
			case UMLPackage.ARTIFACT__OWNED_COMMENT :
				EList ownedComment = (EList) eVirtualGet(UMLPackage.ARTIFACT__OWNED_COMMENT);
				return ownedComment != null && !ownedComment.isEmpty();
			case UMLPackage.ARTIFACT__NAME :
				return isSetName();
			case UMLPackage.ARTIFACT__VISIBILITY :
				return isSetVisibility();
			case UMLPackage.ARTIFACT__QUALIFIED_NAME :
				return QUALIFIED_NAME_EDEFAULT == null
					? getQualifiedName() != null
					: !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case UMLPackage.ARTIFACT__CLIENT_DEPENDENCY :
				EList clientDependency = (EList) eVirtualGet(UMLPackage.ARTIFACT__CLIENT_DEPENDENCY);
				return clientDependency != null && !clientDependency.isEmpty();
			case UMLPackage.ARTIFACT__NAMESPACE :
				return isSetNamespace();
			case UMLPackage.ARTIFACT__NAME_EXPRESSION :
				return eVirtualGet(UMLPackage.ARTIFACT__NAME_EXPRESSION) != null;
			case UMLPackage.ARTIFACT__ELEMENT_IMPORT :
				EList elementImport = (EList) eVirtualGet(UMLPackage.ARTIFACT__ELEMENT_IMPORT);
				return elementImport != null && !elementImport.isEmpty();
			case UMLPackage.ARTIFACT__PACKAGE_IMPORT :
				EList packageImport = (EList) eVirtualGet(UMLPackage.ARTIFACT__PACKAGE_IMPORT);
				return packageImport != null && !packageImport.isEmpty();
			case UMLPackage.ARTIFACT__OWNED_RULE :
				EList ownedRule = (EList) eVirtualGet(UMLPackage.ARTIFACT__OWNED_RULE);
				return ownedRule != null && !ownedRule.isEmpty();
			case UMLPackage.ARTIFACT__MEMBER :
				return isSetMembers();
			case UMLPackage.ARTIFACT__IMPORTED_MEMBER :
				return !getImportedMembers().isEmpty();
			case UMLPackage.ARTIFACT__OWNED_MEMBER :
				return isSetOwnedMembers();
			case UMLPackage.ARTIFACT__IS_LEAF :
				return ((eFlags & IS_LEAF_EFLAG) != 0) != IS_LEAF_EDEFAULT;
			case UMLPackage.ARTIFACT__REDEFINED_ELEMENT :
				return isSetRedefinedElements();
			case UMLPackage.ARTIFACT__REDEFINITION_CONTEXT :
				return isSetRedefinitionContexts();
			case UMLPackage.ARTIFACT__OWNING_TEMPLATE_PARAMETER :
				return basicGetOwningTemplateParameter() != null;
			case UMLPackage.ARTIFACT__TEMPLATE_PARAMETER :
				return isSetTemplateParameter();
			case UMLPackage.ARTIFACT__PACKAGE :
				return basicGetPackage() != null;
			case UMLPackage.ARTIFACT__TEMPLATE_BINDING :
				EList templateBinding = (EList) eVirtualGet(UMLPackage.ARTIFACT__TEMPLATE_BINDING);
				return templateBinding != null && !templateBinding.isEmpty();
			case UMLPackage.ARTIFACT__OWNED_TEMPLATE_SIGNATURE :
				return isSetOwnedTemplateSignature();
			case UMLPackage.ARTIFACT__IS_ABSTRACT :
				return ((eFlags & IS_ABSTRACT_EFLAG) != 0) != IS_ABSTRACT_EDEFAULT;
			case UMLPackage.ARTIFACT__GENERALIZATION :
				EList generalization = (EList) eVirtualGet(UMLPackage.ARTIFACT__GENERALIZATION);
				return generalization != null && !generalization.isEmpty();
			case UMLPackage.ARTIFACT__POWERTYPE_EXTENT :
				EList powertypeExtent = (EList) eVirtualGet(UMLPackage.ARTIFACT__POWERTYPE_EXTENT);
				return powertypeExtent != null && !powertypeExtent.isEmpty();
			case UMLPackage.ARTIFACT__FEATURE :
				return isSetFeatures();
			case UMLPackage.ARTIFACT__INHERITED_MEMBER :
				return !getInheritedMembers().isEmpty();
			case UMLPackage.ARTIFACT__REDEFINED_CLASSIFIER :
				EList redefinedClassifier = (EList) eVirtualGet(UMLPackage.ARTIFACT__REDEFINED_CLASSIFIER);
				return redefinedClassifier != null
					&& !redefinedClassifier.isEmpty();
			case UMLPackage.ARTIFACT__GENERAL :
				return !getGenerals().isEmpty();
			case UMLPackage.ARTIFACT__SUBSTITUTION :
				EList substitution = (EList) eVirtualGet(UMLPackage.ARTIFACT__SUBSTITUTION);
				return substitution != null && !substitution.isEmpty();
			case UMLPackage.ARTIFACT__ATTRIBUTE :
				return isSetAttributes();
			case UMLPackage.ARTIFACT__REPRESENTATION :
				return eVirtualGet(UMLPackage.ARTIFACT__REPRESENTATION) != null;
			case UMLPackage.ARTIFACT__COLLABORATION_USE :
				EList collaborationUse = (EList) eVirtualGet(UMLPackage.ARTIFACT__COLLABORATION_USE);
				return collaborationUse != null && !collaborationUse.isEmpty();
			case UMLPackage.ARTIFACT__OWNED_USE_CASE :
				EList ownedUseCase = (EList) eVirtualGet(UMLPackage.ARTIFACT__OWNED_USE_CASE);
				return ownedUseCase != null && !ownedUseCase.isEmpty();
			case UMLPackage.ARTIFACT__USE_CASE :
				EList useCase = (EList) eVirtualGet(UMLPackage.ARTIFACT__USE_CASE);
				return useCase != null && !useCase.isEmpty();
			case UMLPackage.ARTIFACT__FILE_NAME :
				return isSetFileName();
			case UMLPackage.ARTIFACT__NESTED_ARTIFACT :
				EList nestedArtifact = (EList) eVirtualGet(UMLPackage.ARTIFACT__NESTED_ARTIFACT);
				return nestedArtifact != null && !nestedArtifact.isEmpty();
			case UMLPackage.ARTIFACT__MANIFESTATION :
				EList manifestation = (EList) eVirtualGet(UMLPackage.ARTIFACT__MANIFESTATION);
				return manifestation != null && !manifestation.isEmpty();
			case UMLPackage.ARTIFACT__OWNED_OPERATION :
				EList ownedOperation = (EList) eVirtualGet(UMLPackage.ARTIFACT__OWNED_OPERATION);
				return ownedOperation != null && !ownedOperation.isEmpty();
			case UMLPackage.ARTIFACT__OWNED_ATTRIBUTE :
				EList ownedAttribute = (EList) eVirtualGet(UMLPackage.ARTIFACT__OWNED_ATTRIBUTE);
				return ownedAttribute != null && !ownedAttribute.isEmpty();
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
		result.append(" (fileName: "); //$NON-NLS-1$
		if (eVirtualIsSet(UMLPackage.ARTIFACT__FILE_NAME))
			result.append(eVirtualGet(UMLPackage.ARTIFACT__FILE_NAME));
		else
			result.append("<unset>"); //$NON-NLS-1$
		result.append(')');
		return result.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOwnedMembers() {
		return super.isSetOwnedMembers()
			|| eIsSet(UMLPackage.ARTIFACT__NESTED_ARTIFACT)
			|| eIsSet(UMLPackage.ARTIFACT__OWNED_OPERATION)
			|| eIsSet(UMLPackage.ARTIFACT__OWNED_ATTRIBUTE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOwnedElements() {
		return super.isSetOwnedElements()
			|| eIsSet(UMLPackage.ARTIFACT__MANIFESTATION);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetFeatures() {
		return super.isSetFeatures()
			|| eIsSet(UMLPackage.ARTIFACT__OWNED_OPERATION);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetAttributes() {
		return super.isSetAttributes()
			|| eIsSet(UMLPackage.ARTIFACT__OWNED_ATTRIBUTE);
	}

} //ArtifactImpl
