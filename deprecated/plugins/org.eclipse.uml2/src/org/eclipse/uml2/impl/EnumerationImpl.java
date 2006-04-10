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
 * $Id: EnumerationImpl.java,v 1.32 2006/04/10 20:40:16 khussey Exp $
 */
package org.eclipse.uml2.impl;

import java.util.Collection;
import java.util.Iterator;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.uml2.CollaborationOccurrence;
import org.eclipse.uml2.Enumeration;
import org.eclipse.uml2.EnumerationLiteral;
import org.eclipse.uml2.StringExpression;
import org.eclipse.uml2.TemplateParameter;
import org.eclipse.uml2.TemplateSignature;
import org.eclipse.uml2.UML2Factory;
import org.eclipse.uml2.UML2Package;
import org.eclipse.uml2.VisibilityKind;

import org.eclipse.uml2.internal.operation.EnumerationOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Enumeration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2.impl.EnumerationImpl#getOwnedLiterals <em>Owned Literal</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EnumerationImpl extends DataTypeImpl implements Enumeration {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) IBM Corporation and others."; //$NON-NLS-1$

	/**
	 * The cached value of the '{@link #getOwnedLiterals() <em>Owned Literal</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedLiterals()
	 * @generated
	 * @ordered
	 */
	protected EList ownedLiterals = null;

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
	protected EClass eStaticClass() {
		return UML2Package.Literals.ENUMERATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getOwnedLiterals() {
		if (ownedLiterals == null) {
			ownedLiterals = new EObjectContainmentWithInverseEList(EnumerationLiteral.class, this, UML2Package.ENUMERATION__OWNED_LITERAL, UML2Package.ENUMERATION_LITERAL__ENUMERATION);
		}
		return ownedLiterals;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
    public EnumerationLiteral getOwnedLiteral(String name) {
		return getOwnedLiteral(name, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumerationLiteral getOwnedLiteral(String name, boolean ignoreCase) {
		ownedLiteralLoop: for (Iterator i = getOwnedLiterals().iterator(); i.hasNext(); ) {
			EnumerationLiteral ownedLiteral = (EnumerationLiteral) i.next();
			if (name != null && !(ignoreCase ? name.equalsIgnoreCase(ownedLiteral.getName()) : name.equals(ownedLiteral.getName())))
				continue ownedLiteralLoop;
			return ownedLiteral;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UML2Package.ENUMERATION__EANNOTATIONS:
				return ((InternalEList)getEAnnotations()).basicAdd(otherEnd, msgs);
			case UML2Package.ENUMERATION__TEMPLATE_BINDING:
				return ((InternalEList)getTemplateBindings()).basicAdd(otherEnd, msgs);
			case UML2Package.ENUMERATION__OWNED_TEMPLATE_SIGNATURE:
				if (ownedTemplateSignature != null)
					msgs = ((InternalEObject)ownedTemplateSignature).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UML2Package.ENUMERATION__OWNED_TEMPLATE_SIGNATURE, null, msgs);
				return basicSetOwnedTemplateSignature((TemplateSignature)otherEnd, msgs);
			case UML2Package.ENUMERATION__CLIENT_DEPENDENCY:
				return ((InternalEList)getClientDependencies()).basicAdd(otherEnd, msgs);
			case UML2Package.ENUMERATION__OWNED_RULE:
				return ((InternalEList)getOwnedRules()).basicAdd(otherEnd, msgs);
			case UML2Package.ENUMERATION__ELEMENT_IMPORT:
				return ((InternalEList)getElementImports()).basicAdd(otherEnd, msgs);
			case UML2Package.ENUMERATION__PACKAGE_IMPORT:
				return ((InternalEList)getPackageImports()).basicAdd(otherEnd, msgs);
			case UML2Package.ENUMERATION__TEMPLATE_PARAMETER:
				if (templateParameter != null)
					msgs = ((InternalEObject)templateParameter).eInverseRemove(this, UML2Package.TEMPLATE_PARAMETER__PARAMETERED_ELEMENT, TemplateParameter.class, msgs);
				return basicSetTemplateParameter((TemplateParameter)otherEnd, msgs);
			case UML2Package.ENUMERATION__OWNING_PARAMETER:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOwningParameter((TemplateParameter)otherEnd, msgs);
			case UML2Package.ENUMERATION__GENERALIZATION:
				return ((InternalEList)getGeneralizations()).basicAdd(otherEnd, msgs);
			case UML2Package.ENUMERATION__SUBSTITUTION:
				return ((InternalEList)getSubstitutions()).basicAdd(otherEnd, msgs);
			case UML2Package.ENUMERATION__POWERTYPE_EXTENT:
				return ((InternalEList)getPowertypeExtents()).basicAdd(otherEnd, msgs);
			case UML2Package.ENUMERATION__USE_CASE:
				return ((InternalEList)getUseCases()).basicAdd(otherEnd, msgs);
			case UML2Package.ENUMERATION__OWNED_ATTRIBUTE:
				return ((InternalEList)getOwnedAttributes()).basicAdd(otherEnd, msgs);
			case UML2Package.ENUMERATION__OWNED_OPERATION:
				return ((InternalEList)getOwnedOperations()).basicAdd(otherEnd, msgs);
			case UML2Package.ENUMERATION__OWNED_LITERAL:
				return ((InternalEList)getOwnedLiterals()).basicAdd(otherEnd, msgs);
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
			case UML2Package.ENUMERATION__EANNOTATIONS:
				return ((InternalEList)getEAnnotations()).basicRemove(otherEnd, msgs);
			case UML2Package.ENUMERATION__OWNED_COMMENT:
				return ((InternalEList)getOwnedComments()).basicRemove(otherEnd, msgs);
			case UML2Package.ENUMERATION__TEMPLATE_BINDING:
				return ((InternalEList)getTemplateBindings()).basicRemove(otherEnd, msgs);
			case UML2Package.ENUMERATION__OWNED_TEMPLATE_SIGNATURE:
				return basicSetOwnedTemplateSignature(null, msgs);
			case UML2Package.ENUMERATION__CLIENT_DEPENDENCY:
				return ((InternalEList)getClientDependencies()).basicRemove(otherEnd, msgs);
			case UML2Package.ENUMERATION__NAME_EXPRESSION:
				return basicSetNameExpression(null, msgs);
			case UML2Package.ENUMERATION__OWNED_RULE:
				return ((InternalEList)getOwnedRules()).basicRemove(otherEnd, msgs);
			case UML2Package.ENUMERATION__ELEMENT_IMPORT:
				return ((InternalEList)getElementImports()).basicRemove(otherEnd, msgs);
			case UML2Package.ENUMERATION__PACKAGE_IMPORT:
				return ((InternalEList)getPackageImports()).basicRemove(otherEnd, msgs);
			case UML2Package.ENUMERATION__TEMPLATE_PARAMETER:
				return basicSetTemplateParameter(null, msgs);
			case UML2Package.ENUMERATION__OWNING_PARAMETER:
				return basicSetOwningParameter(null, msgs);
			case UML2Package.ENUMERATION__GENERALIZATION:
				return ((InternalEList)getGeneralizations()).basicRemove(otherEnd, msgs);
			case UML2Package.ENUMERATION__SUBSTITUTION:
				return ((InternalEList)getSubstitutions()).basicRemove(otherEnd, msgs);
			case UML2Package.ENUMERATION__POWERTYPE_EXTENT:
				return ((InternalEList)getPowertypeExtents()).basicRemove(otherEnd, msgs);
			case UML2Package.ENUMERATION__OWNED_USE_CASE:
				return ((InternalEList)getOwnedUseCases()).basicRemove(otherEnd, msgs);
			case UML2Package.ENUMERATION__USE_CASE:
				return ((InternalEList)getUseCases()).basicRemove(otherEnd, msgs);
			case UML2Package.ENUMERATION__OCCURRENCE:
				return ((InternalEList)getOccurrences()).basicRemove(otherEnd, msgs);
			case UML2Package.ENUMERATION__OWNED_ATTRIBUTE:
				return ((InternalEList)getOwnedAttributes()).basicRemove(otherEnd, msgs);
			case UML2Package.ENUMERATION__OWNED_OPERATION:
				return ((InternalEList)getOwnedOperations()).basicRemove(otherEnd, msgs);
			case UML2Package.ENUMERATION__OWNED_LITERAL:
				return ((InternalEList)getOwnedLiterals()).basicRemove(otherEnd, msgs);
		}
		return eDynamicInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 * @deprecated Use #createOwnedLiteral() instead.
	 */
	public EnumerationLiteral createOwnedLiteral(EClass eClass) {
		EnumerationLiteral newOwnedLiteral = (EnumerationLiteral) eClass.getEPackage().getEFactoryInstance().create(eClass);
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, 0, UML2Package.ENUMERATION__OWNED_LITERAL, null, newOwnedLiteral));
		}
		getOwnedLiterals().add(newOwnedLiteral);
		return newOwnedLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EnumerationLiteral createOwnedLiteral() {
		EnumerationLiteral newOwnedLiteral = UML2Factory.eINSTANCE.createEnumerationLiteral();
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, 0, UML2Package.ENUMERATION__OWNED_LITERAL, null, newOwnedLiteral));
		}
		getOwnedLiterals().add(newOwnedLiteral);
		return newOwnedLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UML2Package.ENUMERATION__EANNOTATIONS:
				return getEAnnotations();
			case UML2Package.ENUMERATION__OWNED_ELEMENT:
				return getOwnedElements();
			case UML2Package.ENUMERATION__OWNER:
				if (resolve) return getOwner();
				return basicGetOwner();
			case UML2Package.ENUMERATION__OWNED_COMMENT:
				return getOwnedComments();
			case UML2Package.ENUMERATION__TEMPLATE_BINDING:
				return getTemplateBindings();
			case UML2Package.ENUMERATION__OWNED_TEMPLATE_SIGNATURE:
				return getOwnedTemplateSignature();
			case UML2Package.ENUMERATION__NAME:
				return getName();
			case UML2Package.ENUMERATION__QUALIFIED_NAME:
				return getQualifiedName();
			case UML2Package.ENUMERATION__VISIBILITY:
				return getVisibility();
			case UML2Package.ENUMERATION__CLIENT_DEPENDENCY:
				return getClientDependencies();
			case UML2Package.ENUMERATION__NAME_EXPRESSION:
				return getNameExpression();
			case UML2Package.ENUMERATION__MEMBER:
				return getMembers();
			case UML2Package.ENUMERATION__OWNED_RULE:
				return getOwnedRules();
			case UML2Package.ENUMERATION__IMPORTED_MEMBER:
				return getImportedMembers();
			case UML2Package.ENUMERATION__ELEMENT_IMPORT:
				return getElementImports();
			case UML2Package.ENUMERATION__PACKAGE_IMPORT:
				return getPackageImports();
			case UML2Package.ENUMERATION__TEMPLATE_PARAMETER:
				if (resolve) return getTemplateParameter();
				return basicGetTemplateParameter();
			case UML2Package.ENUMERATION__OWNING_PARAMETER:
				return getOwningParameter();
			case UML2Package.ENUMERATION__PACKAGEABLE_ELEMENT_VISIBILITY:
				return getPackageableElement_visibility();
			case UML2Package.ENUMERATION__PACKAGE:
				return getPackage();
			case UML2Package.ENUMERATION__REDEFINITION_CONTEXT:
				return getRedefinitionContexts();
			case UML2Package.ENUMERATION__IS_LEAF:
				return isLeaf() ? Boolean.TRUE : Boolean.FALSE;
			case UML2Package.ENUMERATION__FEATURE:
				return getFeatures();
			case UML2Package.ENUMERATION__IS_ABSTRACT:
				return isAbstract() ? Boolean.TRUE : Boolean.FALSE;
			case UML2Package.ENUMERATION__INHERITED_MEMBER:
				return getInheritedMembers();
			case UML2Package.ENUMERATION__GENERAL:
				return getGenerals();
			case UML2Package.ENUMERATION__GENERALIZATION:
				return getGeneralizations();
			case UML2Package.ENUMERATION__ATTRIBUTE:
				return getAttributes();
			case UML2Package.ENUMERATION__REDEFINED_CLASSIFIER:
				return getRedefinedClassifiers();
			case UML2Package.ENUMERATION__SUBSTITUTION:
				return getSubstitutions();
			case UML2Package.ENUMERATION__POWERTYPE_EXTENT:
				return getPowertypeExtents();
			case UML2Package.ENUMERATION__OWNED_USE_CASE:
				return getOwnedUseCases();
			case UML2Package.ENUMERATION__USE_CASE:
				return getUseCases();
			case UML2Package.ENUMERATION__REPRESENTATION:
				return getRepresentation();
			case UML2Package.ENUMERATION__OCCURRENCE:
				return getOccurrences();
			case UML2Package.ENUMERATION__OWNED_ATTRIBUTE:
				return getOwnedAttributes();
			case UML2Package.ENUMERATION__OWNED_OPERATION:
				return getOwnedOperations();
			case UML2Package.ENUMERATION__OWNED_LITERAL:
				return getOwnedLiterals();
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
			case UML2Package.ENUMERATION__EANNOTATIONS:
				getEAnnotations().clear();
				getEAnnotations().addAll((Collection)newValue);
				return;
			case UML2Package.ENUMERATION__OWNED_COMMENT:
				getOwnedComments().clear();
				getOwnedComments().addAll((Collection)newValue);
				return;
			case UML2Package.ENUMERATION__TEMPLATE_BINDING:
				getTemplateBindings().clear();
				getTemplateBindings().addAll((Collection)newValue);
				return;
			case UML2Package.ENUMERATION__OWNED_TEMPLATE_SIGNATURE:
				setOwnedTemplateSignature((TemplateSignature)newValue);
				return;
			case UML2Package.ENUMERATION__NAME:
				setName((String)newValue);
				return;
			case UML2Package.ENUMERATION__VISIBILITY:
				setVisibility((VisibilityKind)newValue);
				return;
			case UML2Package.ENUMERATION__CLIENT_DEPENDENCY:
				getClientDependencies().clear();
				getClientDependencies().addAll((Collection)newValue);
				return;
			case UML2Package.ENUMERATION__NAME_EXPRESSION:
				setNameExpression((StringExpression)newValue);
				return;
			case UML2Package.ENUMERATION__OWNED_RULE:
				getOwnedRules().clear();
				getOwnedRules().addAll((Collection)newValue);
				return;
			case UML2Package.ENUMERATION__ELEMENT_IMPORT:
				getElementImports().clear();
				getElementImports().addAll((Collection)newValue);
				return;
			case UML2Package.ENUMERATION__PACKAGE_IMPORT:
				getPackageImports().clear();
				getPackageImports().addAll((Collection)newValue);
				return;
			case UML2Package.ENUMERATION__TEMPLATE_PARAMETER:
				setTemplateParameter((TemplateParameter)newValue);
				return;
			case UML2Package.ENUMERATION__OWNING_PARAMETER:
				setOwningParameter((TemplateParameter)newValue);
				return;
			case UML2Package.ENUMERATION__PACKAGEABLE_ELEMENT_VISIBILITY:
				setPackageableElement_visibility((VisibilityKind)newValue);
				return;
			case UML2Package.ENUMERATION__IS_LEAF:
				setIsLeaf(((Boolean)newValue).booleanValue());
				return;
			case UML2Package.ENUMERATION__IS_ABSTRACT:
				setIsAbstract(((Boolean)newValue).booleanValue());
				return;
			case UML2Package.ENUMERATION__GENERALIZATION:
				getGeneralizations().clear();
				getGeneralizations().addAll((Collection)newValue);
				return;
			case UML2Package.ENUMERATION__REDEFINED_CLASSIFIER:
				getRedefinedClassifiers().clear();
				getRedefinedClassifiers().addAll((Collection)newValue);
				return;
			case UML2Package.ENUMERATION__SUBSTITUTION:
				getSubstitutions().clear();
				getSubstitutions().addAll((Collection)newValue);
				return;
			case UML2Package.ENUMERATION__POWERTYPE_EXTENT:
				getPowertypeExtents().clear();
				getPowertypeExtents().addAll((Collection)newValue);
				return;
			case UML2Package.ENUMERATION__OWNED_USE_CASE:
				getOwnedUseCases().clear();
				getOwnedUseCases().addAll((Collection)newValue);
				return;
			case UML2Package.ENUMERATION__USE_CASE:
				getUseCases().clear();
				getUseCases().addAll((Collection)newValue);
				return;
			case UML2Package.ENUMERATION__REPRESENTATION:
				setRepresentation((CollaborationOccurrence)newValue);
				return;
			case UML2Package.ENUMERATION__OCCURRENCE:
				getOccurrences().clear();
				getOccurrences().addAll((Collection)newValue);
				return;
			case UML2Package.ENUMERATION__OWNED_ATTRIBUTE:
				getOwnedAttributes().clear();
				getOwnedAttributes().addAll((Collection)newValue);
				return;
			case UML2Package.ENUMERATION__OWNED_OPERATION:
				getOwnedOperations().clear();
				getOwnedOperations().addAll((Collection)newValue);
				return;
			case UML2Package.ENUMERATION__OWNED_LITERAL:
				getOwnedLiterals().clear();
				getOwnedLiterals().addAll((Collection)newValue);
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
			case UML2Package.ENUMERATION__EANNOTATIONS:
				getEAnnotations().clear();
				return;
			case UML2Package.ENUMERATION__OWNED_COMMENT:
				getOwnedComments().clear();
				return;
			case UML2Package.ENUMERATION__TEMPLATE_BINDING:
				getTemplateBindings().clear();
				return;
			case UML2Package.ENUMERATION__OWNED_TEMPLATE_SIGNATURE:
				setOwnedTemplateSignature((TemplateSignature)null);
				return;
			case UML2Package.ENUMERATION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case UML2Package.ENUMERATION__VISIBILITY:
				setVisibility(VISIBILITY_EDEFAULT);
				return;
			case UML2Package.ENUMERATION__CLIENT_DEPENDENCY:
				getClientDependencies().clear();
				return;
			case UML2Package.ENUMERATION__NAME_EXPRESSION:
				setNameExpression((StringExpression)null);
				return;
			case UML2Package.ENUMERATION__OWNED_RULE:
				getOwnedRules().clear();
				return;
			case UML2Package.ENUMERATION__ELEMENT_IMPORT:
				getElementImports().clear();
				return;
			case UML2Package.ENUMERATION__PACKAGE_IMPORT:
				getPackageImports().clear();
				return;
			case UML2Package.ENUMERATION__TEMPLATE_PARAMETER:
				setTemplateParameter((TemplateParameter)null);
				return;
			case UML2Package.ENUMERATION__OWNING_PARAMETER:
				setOwningParameter((TemplateParameter)null);
				return;
			case UML2Package.ENUMERATION__PACKAGEABLE_ELEMENT_VISIBILITY:
				setPackageableElement_visibility(PACKAGEABLE_ELEMENT_VISIBILITY_EDEFAULT);
				return;
			case UML2Package.ENUMERATION__IS_LEAF:
				setIsLeaf(IS_LEAF_EDEFAULT);
				return;
			case UML2Package.ENUMERATION__IS_ABSTRACT:
				setIsAbstract(IS_ABSTRACT_EDEFAULT);
				return;
			case UML2Package.ENUMERATION__GENERALIZATION:
				getGeneralizations().clear();
				return;
			case UML2Package.ENUMERATION__REDEFINED_CLASSIFIER:
				getRedefinedClassifiers().clear();
				return;
			case UML2Package.ENUMERATION__SUBSTITUTION:
				getSubstitutions().clear();
				return;
			case UML2Package.ENUMERATION__POWERTYPE_EXTENT:
				getPowertypeExtents().clear();
				return;
			case UML2Package.ENUMERATION__OWNED_USE_CASE:
				getOwnedUseCases().clear();
				return;
			case UML2Package.ENUMERATION__USE_CASE:
				getUseCases().clear();
				return;
			case UML2Package.ENUMERATION__REPRESENTATION:
				setRepresentation((CollaborationOccurrence)null);
				return;
			case UML2Package.ENUMERATION__OCCURRENCE:
				getOccurrences().clear();
				return;
			case UML2Package.ENUMERATION__OWNED_ATTRIBUTE:
				getOwnedAttributes().clear();
				return;
			case UML2Package.ENUMERATION__OWNED_OPERATION:
				getOwnedOperations().clear();
				return;
			case UML2Package.ENUMERATION__OWNED_LITERAL:
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case UML2Package.ENUMERATION__EANNOTATIONS:
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UML2Package.ENUMERATION__OWNED_ELEMENT:
				return isSetOwnedElements();
			case UML2Package.ENUMERATION__OWNER:
				return isSetOwner();
			case UML2Package.ENUMERATION__OWNED_COMMENT:
				return ownedComments != null && !ownedComments.isEmpty();
			case UML2Package.ENUMERATION__TEMPLATE_BINDING:
				return templateBindings != null && !templateBindings.isEmpty();
			case UML2Package.ENUMERATION__OWNED_TEMPLATE_SIGNATURE:
				return ownedTemplateSignature != null;
			case UML2Package.ENUMERATION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case UML2Package.ENUMERATION__QUALIFIED_NAME:
				return QUALIFIED_NAME_EDEFAULT == null ? getQualifiedName() != null : !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case UML2Package.ENUMERATION__VISIBILITY:
				return isSetVisibility();
			case UML2Package.ENUMERATION__CLIENT_DEPENDENCY:
				return clientDependencies != null && !clientDependencies.isEmpty();
			case UML2Package.ENUMERATION__NAME_EXPRESSION:
				return nameExpression != null;
			case UML2Package.ENUMERATION__MEMBER:
				return isSetMembers();
			case UML2Package.ENUMERATION__OWNED_RULE:
				return ownedRules != null && !ownedRules.isEmpty();
			case UML2Package.ENUMERATION__IMPORTED_MEMBER:
				return !getImportedMembers().isEmpty();
			case UML2Package.ENUMERATION__ELEMENT_IMPORT:
				return elementImports != null && !elementImports.isEmpty();
			case UML2Package.ENUMERATION__PACKAGE_IMPORT:
				return packageImports != null && !packageImports.isEmpty();
			case UML2Package.ENUMERATION__TEMPLATE_PARAMETER:
				return templateParameter != null;
			case UML2Package.ENUMERATION__OWNING_PARAMETER:
				return getOwningParameter() != null;
			case UML2Package.ENUMERATION__PACKAGEABLE_ELEMENT_VISIBILITY:
				return isSetPackageableElement_visibility();
			case UML2Package.ENUMERATION__PACKAGE:
				return getPackage() != null;
			case UML2Package.ENUMERATION__REDEFINITION_CONTEXT:
				return isSetRedefinitionContexts();
			case UML2Package.ENUMERATION__IS_LEAF:
				return ((eFlags & IS_LEAF_EFLAG) != 0) != IS_LEAF_EDEFAULT;
			case UML2Package.ENUMERATION__FEATURE:
				return isSetFeatures();
			case UML2Package.ENUMERATION__IS_ABSTRACT:
				return ((eFlags & IS_ABSTRACT_EFLAG) != 0) != IS_ABSTRACT_EDEFAULT;
			case UML2Package.ENUMERATION__INHERITED_MEMBER:
				return !getInheritedMembers().isEmpty();
			case UML2Package.ENUMERATION__GENERAL:
				return !getGenerals().isEmpty();
			case UML2Package.ENUMERATION__GENERALIZATION:
				return generalizations != null && !generalizations.isEmpty();
			case UML2Package.ENUMERATION__ATTRIBUTE:
				return isSetAttributes();
			case UML2Package.ENUMERATION__REDEFINED_CLASSIFIER:
				return redefinedClassifiers != null && !redefinedClassifiers.isEmpty();
			case UML2Package.ENUMERATION__SUBSTITUTION:
				return substitutions != null && !substitutions.isEmpty();
			case UML2Package.ENUMERATION__POWERTYPE_EXTENT:
				return powertypeExtents != null && !powertypeExtents.isEmpty();
			case UML2Package.ENUMERATION__OWNED_USE_CASE:
				return ownedUseCases != null && !ownedUseCases.isEmpty();
			case UML2Package.ENUMERATION__USE_CASE:
				return useCases != null && !useCases.isEmpty();
			case UML2Package.ENUMERATION__REPRESENTATION:
				return representation != null;
			case UML2Package.ENUMERATION__OCCURRENCE:
				return occurrences != null && !occurrences.isEmpty();
			case UML2Package.ENUMERATION__OWNED_ATTRIBUTE:
				return ownedAttributes != null && !ownedAttributes.isEmpty();
			case UML2Package.ENUMERATION__OWNED_OPERATION:
				return ownedOperations != null && !ownedOperations.isEmpty();
			case UML2Package.ENUMERATION__OWNED_LITERAL:
				return ownedLiterals != null && !ownedLiterals.isEmpty();
		}
		return eDynamicIsSet(featureID);
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EList getOwnedMembersHelper(EList ownedMembers) {
		super.getOwnedMembersHelper(ownedMembers);
		if (eIsSet(UML2Package.ENUMERATION__OWNED_LITERAL)) {
			ownedMembers.addAll(getOwnedLiterals());
		}
		return ownedMembers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOwnedMembers() {
		return super.isSetOwnedMembers()
			|| eIsSet(UML2Package.ENUMERATION__OWNED_LITERAL);
	}


	/**
	 * The array of subset feature identifiers for the '{@link #getOwnedMembers() <em>Owned Member</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedMembers()
	 * @generated
	 * @ordered
	 */
	protected static final int[] OWNED_MEMBER_ESUBSETS = new int[] {UML2Package.ENUMERATION__OWNED_RULE, UML2Package.ENUMERATION__OWNED_USE_CASE, UML2Package.ENUMERATION__OWNED_ATTRIBUTE, UML2Package.ENUMERATION__OWNED_OPERATION, UML2Package.ENUMERATION__OWNED_LITERAL};

	// <!-- begin-custom-operations -->

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.uml2.Enumeration#createOwnedLiteral(java.lang.String)
	 */
	public EnumerationLiteral createOwnedLiteral(String name) {
		return EnumerationOperations.createOwnedLiteral(this, name);
	}

	// <!-- end-custom-operations -->

} //EnumerationImpl
