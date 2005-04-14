/*
 * Copyright (c) 2003, 2005 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *
 * $Id: EnumerationImpl.java,v 1.17 2005/04/14 17:30:57 khussey Exp $
 */
package org.eclipse.uml2.impl;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
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
	public static final String copyright = "Copyright (c) 2003, 2005 IBM Corporation and others."; //$NON-NLS-1$

	/**
	 * The cached value of the '{@link #getOwnedLiterals() <em>Owned Literal</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedLiterals()
	 * @generated
	 * @ordered
	 */
	protected EList ownedLiteral = null;

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
		return UML2Package.eINSTANCE.getEnumeration();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getOwnedLiterals() {
		if (ownedLiteral == null) {
			ownedLiteral = new EObjectContainmentWithInverseEList(EnumerationLiteral.class, this, UML2Package.ENUMERATION__OWNED_LITERAL, UML2Package.ENUMERATION_LITERAL__ENUMERATION);
		}
		return ownedLiteral;
	}

    /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
     */
    public EnumerationLiteral getOwnedLiteral(String unqualifiedName) {
    	for (Iterator i = getOwnedLiterals().iterator(); i.hasNext(); ) {
    		EnumerationLiteral namedOwnedLiteral = (EnumerationLiteral) i.next();
    		
    		if (unqualifiedName.equals(namedOwnedLiteral.getName())) {
    			return namedOwnedLiteral;
    		}
    	}
    	
    	return null;
    }
      
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
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
	 * @generated
	 */
	public EList getOwnedMembers() {
		EList result = (EList) getCacheAdapter().get(this, UML2Package.eINSTANCE.getEnumeration().getEAllOperations().get(73));

		if (null == result) {
			Set union = new LinkedHashSet();
			union.addAll(super.getOwnedMembers());
			union.addAll(getOwnedLiterals());

			result = new BasicEList.UnmodifiableEList(union.size(), union.toArray());
			getCacheAdapter().put(this, UML2Package.eINSTANCE.getEnumeration().getEAllOperations().get(73), result);
		}

		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, Class baseClass, NotificationChain msgs) {
		if (featureID >= 0) {
			switch (eDerivedStructuralFeatureID(featureID, baseClass)) {
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
					if (eContainer != null)
						msgs = eBasicRemoveFromContainer(msgs);
					return eBasicSetContainer(otherEnd, UML2Package.ENUMERATION__OWNING_PARAMETER, msgs);
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
				default:
					return eDynamicInverseAdd(otherEnd, featureID, baseClass, msgs);
			}
		}
		if (eContainer != null)
			msgs = eBasicRemoveFromContainer(msgs);
		return eBasicSetContainer(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, Class baseClass, NotificationChain msgs) {
		if (featureID >= 0) {
			switch (eDerivedStructuralFeatureID(featureID, baseClass)) {
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
					return eBasicSetContainer(null, UML2Package.ENUMERATION__OWNING_PARAMETER, msgs);
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
				default:
					return eDynamicInverseRemove(otherEnd, featureID, baseClass, msgs);
			}
		}
		return eBasicSetContainer(null, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eBasicRemoveFromContainer(NotificationChain msgs) {
		if (eContainerFeatureID >= 0) {
			switch (eContainerFeatureID) {
				case UML2Package.ENUMERATION__OWNING_PARAMETER:
					return eContainer.eInverseRemove(this, UML2Package.TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT, TemplateParameter.class, msgs);
				default:
					return eDynamicBasicRemoveFromContainer(msgs);
			}
		}
		return eContainer.eInverseRemove(this, EOPPOSITE_FEATURE_BASE - eContainerFeatureID, null, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(EStructuralFeature eFeature, boolean resolve) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
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
				if (resolve) return getPackage();
				return basicGetPackage();
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
		return eDynamicGet(eFeature, resolve);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eSet(EStructuralFeature eFeature, Object newValue) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
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
		eDynamicSet(eFeature, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eUnset(EStructuralFeature eFeature) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
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
		eDynamicUnset(eFeature);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean eIsSet(EStructuralFeature eFeature) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case UML2Package.ENUMERATION__EANNOTATIONS:
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UML2Package.ENUMERATION__OWNED_ELEMENT:
				return !getOwnedElements().isEmpty();
			case UML2Package.ENUMERATION__OWNER:
				return basicGetOwner() != null;
			case UML2Package.ENUMERATION__OWNED_COMMENT:
				return ownedComment != null && !ownedComment.isEmpty();
			case UML2Package.ENUMERATION__TEMPLATE_BINDING:
				return templateBinding != null && !templateBinding.isEmpty();
			case UML2Package.ENUMERATION__OWNED_TEMPLATE_SIGNATURE:
				return ownedTemplateSignature != null;
			case UML2Package.ENUMERATION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case UML2Package.ENUMERATION__QUALIFIED_NAME:
				return QUALIFIED_NAME_EDEFAULT == null ? getQualifiedName() != null : !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case UML2Package.ENUMERATION__VISIBILITY:
				return false;
			case UML2Package.ENUMERATION__CLIENT_DEPENDENCY:
				return clientDependency != null && !clientDependency.isEmpty();
			case UML2Package.ENUMERATION__NAME_EXPRESSION:
				return nameExpression != null;
			case UML2Package.ENUMERATION__MEMBER:
				return !getMembers().isEmpty();
			case UML2Package.ENUMERATION__OWNED_RULE:
				return ownedRule != null && !ownedRule.isEmpty();
			case UML2Package.ENUMERATION__IMPORTED_MEMBER:
				return !getImportedMembers().isEmpty();
			case UML2Package.ENUMERATION__ELEMENT_IMPORT:
				return elementImport != null && !elementImport.isEmpty();
			case UML2Package.ENUMERATION__PACKAGE_IMPORT:
				return packageImport != null && !packageImport.isEmpty();
			case UML2Package.ENUMERATION__TEMPLATE_PARAMETER:
				return templateParameter != null;
			case UML2Package.ENUMERATION__OWNING_PARAMETER:
				return getOwningParameter() != null;
			case UML2Package.ENUMERATION__PACKAGEABLE_ELEMENT_VISIBILITY:
				return packageableElement_visibility != PACKAGEABLE_ELEMENT_VISIBILITY_EDEFAULT;
			case UML2Package.ENUMERATION__PACKAGE:
				return basicGetPackage() != null;
			case UML2Package.ENUMERATION__REDEFINITION_CONTEXT:
				return !getRedefinitionContexts().isEmpty();
			case UML2Package.ENUMERATION__IS_LEAF:
				return ((eFlags & IS_LEAF_EFLAG) != 0) != IS_LEAF_EDEFAULT;
			case UML2Package.ENUMERATION__FEATURE:
				return !getFeatures().isEmpty();
			case UML2Package.ENUMERATION__IS_ABSTRACT:
				return ((eFlags & IS_ABSTRACT_EFLAG) != 0) != IS_ABSTRACT_EDEFAULT;
			case UML2Package.ENUMERATION__INHERITED_MEMBER:
				return !getInheritedMembers().isEmpty();
			case UML2Package.ENUMERATION__GENERAL:
				return !getGenerals().isEmpty();
			case UML2Package.ENUMERATION__GENERALIZATION:
				return generalization != null && !generalization.isEmpty();
			case UML2Package.ENUMERATION__ATTRIBUTE:
				return !getAttributes().isEmpty();
			case UML2Package.ENUMERATION__REDEFINED_CLASSIFIER:
				return redefinedClassifier != null && !redefinedClassifier.isEmpty();
			case UML2Package.ENUMERATION__SUBSTITUTION:
				return substitution != null && !substitution.isEmpty();
			case UML2Package.ENUMERATION__POWERTYPE_EXTENT:
				return powertypeExtent != null && !powertypeExtent.isEmpty();
			case UML2Package.ENUMERATION__OWNED_USE_CASE:
				return ownedUseCase != null && !ownedUseCase.isEmpty();
			case UML2Package.ENUMERATION__USE_CASE:
				return useCase != null && !useCase.isEmpty();
			case UML2Package.ENUMERATION__REPRESENTATION:
				return representation != null;
			case UML2Package.ENUMERATION__OCCURRENCE:
				return occurrence != null && !occurrence.isEmpty();
			case UML2Package.ENUMERATION__OWNED_ATTRIBUTE:
				return ownedAttribute != null && !ownedAttribute.isEmpty();
			case UML2Package.ENUMERATION__OWNED_OPERATION:
				return ownedOperation != null && !ownedOperation.isEmpty();
			case UML2Package.ENUMERATION__OWNED_LITERAL:
				return ownedLiteral != null && !ownedLiteral.isEmpty();
		}
		return eDynamicIsSet(eFeature);
	}

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
