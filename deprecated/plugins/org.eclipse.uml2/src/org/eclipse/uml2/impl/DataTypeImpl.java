/*
 * Copyright (c) 2003, 2004 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Common Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/cpl-v10.html
 *
 * Contributors:
 *   IBM - Initial API and implementation
 *
 * $Id: DataTypeImpl.java,v 1.9 2004/06/02 05:02:25 khussey Exp $
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
import org.eclipse.emf.ecore.util.EcoreEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.uml2.CollaborationOccurrence;
import org.eclipse.uml2.DataType;
import org.eclipse.uml2.Operation;
import org.eclipse.uml2.Property;
import org.eclipse.uml2.StringExpression;
import org.eclipse.uml2.TemplateParameter;
import org.eclipse.uml2.TemplateSignature;
import org.eclipse.uml2.UML2Package;
import org.eclipse.uml2.VisibilityKind;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2.impl.DataTypeImpl#getOwnedAttributes <em>Owned Attribute</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.DataTypeImpl#getOwnedOperations <em>Owned Operation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DataTypeImpl extends ClassifierImpl implements DataType {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2003, 2004 IBM Corporation and others."; //$NON-NLS-1$

	/**
	 * The cached value of the '{@link #getOwnedAttributes() <em>Owned Attribute</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedAttributes()
	 * @generated
	 * @ordered
	 */
	protected EList ownedAttribute = null;

	/**
	 * The cached value of the '{@link #getOwnedOperations() <em>Owned Operation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedOperations()
	 * @generated
	 * @ordered
	 */
	protected EList ownedOperation = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return UML2Package.eINSTANCE.getDataType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getOwnedAttributes() {
		if (ownedAttribute == null) {
			ownedAttribute = new EObjectContainmentWithInverseEList(Property.class, this, UML2Package.DATA_TYPE__OWNED_ATTRIBUTE, UML2Package.PROPERTY__DATATYPE);
		}
		return ownedAttribute;
	}

    /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
     */
    public Property getOwnedAttribute(String unqualifiedName) {
    	for (Iterator i = getOwnedAttributes().iterator(); i.hasNext(); ) {
    		Property namedOwnedAttribute = (Property) i.next();
    		
    		if (unqualifiedName.equals(namedOwnedAttribute.getName())) {
    			return namedOwnedAttribute;
    		}
    	}
    	
    	return null;
    }
      
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property createOwnedAttribute(EClass eClass) {
		Property newOwnedAttribute = (Property) eClass.getEPackage().getEFactoryInstance().create(eClass);
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, 0, UML2Package.DATA_TYPE__OWNED_ATTRIBUTE, null, newOwnedAttribute));
		}
		getOwnedAttributes().add(newOwnedAttribute);
		return newOwnedAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getOwnedOperations() {
		if (ownedOperation == null) {
			ownedOperation = new EObjectContainmentWithInverseEList(Operation.class, this, UML2Package.DATA_TYPE__OWNED_OPERATION, UML2Package.OPERATION__DATATYPE);
		}
		return ownedOperation;
	}

    /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
     */
    public Operation getOwnedOperation(String unqualifiedName) {
    	for (Iterator i = getOwnedOperations().iterator(); i.hasNext(); ) {
    		Operation namedOwnedOperation = (Operation) i.next();
    		
    		if (unqualifiedName.equals(namedOwnedOperation.getName())) {
    			return namedOwnedOperation;
    		}
    	}
    	
    	return null;
    }
      
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operation createOwnedOperation(EClass eClass) {
		Operation newOwnedOperation = (Operation) eClass.getEPackage().getEFactoryInstance().create(eClass);
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, 0, UML2Package.DATA_TYPE__OWNED_OPERATION, null, newOwnedOperation));
		}
		getOwnedOperations().add(newOwnedOperation);
		return newOwnedOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Set inherit(Set inhs) {
		return org.eclipse.uml2.internal.operation.DataTypeOperations.inherit(this, inhs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getOwnedMembers() {
		EList result = (EList) getCacheAdapter().get(this, UML2Package.eINSTANCE.getDataType().getEAllOperations().get(70));

		if (null == result) {
			Set union = new LinkedHashSet();
			union.addAll(super.getOwnedMembers());
			union.addAll(getOwnedAttributes());
			union.addAll(getOwnedOperations());

			result = new BasicEList.UnmodifiableEList(union.size(), union.toArray());
			getCacheAdapter().put(this, UML2Package.eINSTANCE.getDataType().getEAllOperations().get(70), result);
		}

		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getAttributes() {
		EList attribute = (EList) getCacheAdapter().get(this, UML2Package.eINSTANCE.getClassifier_Attribute());

		if (null == attribute) {
			Set union = new LinkedHashSet();
			union.addAll(super.getAttributes());
			union.addAll(getOwnedAttributes());

			attribute = new EcoreEList.UnmodifiableEList(this, UML2Package.eINSTANCE.getClassifier_Attribute(), union.size(), union.toArray());
			getCacheAdapter().put(this, UML2Package.eINSTANCE.getClassifier_Attribute(), attribute);
		}

		return attribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getFeatures() {
		EList feature = (EList) getCacheAdapter().get(this, UML2Package.eINSTANCE.getClassifier_Feature());

		if (null == feature) {
			Set union = new LinkedHashSet();
			union.addAll(super.getFeatures());
			union.addAll(getOwnedOperations());

			feature = new EcoreEList.UnmodifiableEList(this, UML2Package.eINSTANCE.getClassifier_Feature(), union.size(), union.toArray());
			getCacheAdapter().put(this, UML2Package.eINSTANCE.getClassifier_Feature(), feature);
		}

		return feature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, Class baseClass, NotificationChain msgs) {
		if (featureID >= 0) {
			switch (eDerivedStructuralFeatureID(featureID, baseClass)) {
				case UML2Package.DATA_TYPE__EANNOTATIONS:
					return ((InternalEList)getEAnnotations()).basicAdd(otherEnd, msgs);
				case UML2Package.DATA_TYPE__TEMPLATE_BINDING:
					return ((InternalEList)getTemplateBindings()).basicAdd(otherEnd, msgs);
				case UML2Package.DATA_TYPE__OWNED_TEMPLATE_SIGNATURE:
					if (ownedTemplateSignature != null)
						msgs = ((InternalEObject)ownedTemplateSignature).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UML2Package.DATA_TYPE__OWNED_TEMPLATE_SIGNATURE, null, msgs);
					return basicSetOwnedTemplateSignature((TemplateSignature)otherEnd, msgs);
				case UML2Package.DATA_TYPE__CLIENT_DEPENDENCY:
					return ((InternalEList)getClientDependencies()).basicAdd(otherEnd, msgs);
				case UML2Package.DATA_TYPE__OWNED_RULE:
					return ((InternalEList)getOwnedRules()).basicAdd(otherEnd, msgs);
				case UML2Package.DATA_TYPE__ELEMENT_IMPORT:
					return ((InternalEList)getElementImports()).basicAdd(otherEnd, msgs);
				case UML2Package.DATA_TYPE__PACKAGE_IMPORT:
					return ((InternalEList)getPackageImports()).basicAdd(otherEnd, msgs);
				case UML2Package.DATA_TYPE__TEMPLATE_PARAMETER:
					if (templateParameter != null)
						msgs = ((InternalEObject)templateParameter).eInverseRemove(this, UML2Package.TEMPLATE_PARAMETER__PARAMETERED_ELEMENT, TemplateParameter.class, msgs);
					return basicSetTemplateParameter((TemplateParameter)otherEnd, msgs);
				case UML2Package.DATA_TYPE__OWNING_PARAMETER:
					if (eContainer != null)
						msgs = eBasicRemoveFromContainer(msgs);
					return eBasicSetContainer(otherEnd, UML2Package.DATA_TYPE__OWNING_PARAMETER, msgs);
				case UML2Package.DATA_TYPE__GENERALIZATION:
					return ((InternalEList)getGeneralizations()).basicAdd(otherEnd, msgs);
				case UML2Package.DATA_TYPE__POWERTYPE_EXTENT:
					return ((InternalEList)getPowertypeExtents()).basicAdd(otherEnd, msgs);
				case UML2Package.DATA_TYPE__SUBSTITUTION:
					return ((InternalEList)getSubstitutions()).basicAdd(otherEnd, msgs);
				case UML2Package.DATA_TYPE__USE_CASE:
					return ((InternalEList)getUseCases()).basicAdd(otherEnd, msgs);
				case UML2Package.DATA_TYPE__OWNED_ATTRIBUTE:
					return ((InternalEList)getOwnedAttributes()).basicAdd(otherEnd, msgs);
				case UML2Package.DATA_TYPE__OWNED_OPERATION:
					return ((InternalEList)getOwnedOperations()).basicAdd(otherEnd, msgs);
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
				case UML2Package.DATA_TYPE__EANNOTATIONS:
					return ((InternalEList)getEAnnotations()).basicRemove(otherEnd, msgs);
				case UML2Package.DATA_TYPE__OWNED_COMMENT:
					return ((InternalEList)getOwnedComments()).basicRemove(otherEnd, msgs);
				case UML2Package.DATA_TYPE__TEMPLATE_BINDING:
					return ((InternalEList)getTemplateBindings()).basicRemove(otherEnd, msgs);
				case UML2Package.DATA_TYPE__OWNED_TEMPLATE_SIGNATURE:
					return basicSetOwnedTemplateSignature(null, msgs);
				case UML2Package.DATA_TYPE__CLIENT_DEPENDENCY:
					return ((InternalEList)getClientDependencies()).basicRemove(otherEnd, msgs);
				case UML2Package.DATA_TYPE__NAME_EXPRESSION:
					return basicSetNameExpression(null, msgs);
				case UML2Package.DATA_TYPE__OWNED_RULE:
					return ((InternalEList)getOwnedRules()).basicRemove(otherEnd, msgs);
				case UML2Package.DATA_TYPE__ELEMENT_IMPORT:
					return ((InternalEList)getElementImports()).basicRemove(otherEnd, msgs);
				case UML2Package.DATA_TYPE__PACKAGE_IMPORT:
					return ((InternalEList)getPackageImports()).basicRemove(otherEnd, msgs);
				case UML2Package.DATA_TYPE__TEMPLATE_PARAMETER:
					return basicSetTemplateParameter(null, msgs);
				case UML2Package.DATA_TYPE__OWNING_PARAMETER:
					return eBasicSetContainer(null, UML2Package.DATA_TYPE__OWNING_PARAMETER, msgs);
				case UML2Package.DATA_TYPE__GENERALIZATION:
					return ((InternalEList)getGeneralizations()).basicRemove(otherEnd, msgs);
				case UML2Package.DATA_TYPE__POWERTYPE_EXTENT:
					return ((InternalEList)getPowertypeExtents()).basicRemove(otherEnd, msgs);
				case UML2Package.DATA_TYPE__SUBSTITUTION:
					return ((InternalEList)getSubstitutions()).basicRemove(otherEnd, msgs);
				case UML2Package.DATA_TYPE__OWNED_USE_CASE:
					return ((InternalEList)getOwnedUseCases()).basicRemove(otherEnd, msgs);
				case UML2Package.DATA_TYPE__USE_CASE:
					return ((InternalEList)getUseCases()).basicRemove(otherEnd, msgs);
				case UML2Package.DATA_TYPE__OCCURRENCE:
					return ((InternalEList)getOccurrences()).basicRemove(otherEnd, msgs);
				case UML2Package.DATA_TYPE__OWNED_ATTRIBUTE:
					return ((InternalEList)getOwnedAttributes()).basicRemove(otherEnd, msgs);
				case UML2Package.DATA_TYPE__OWNED_OPERATION:
					return ((InternalEList)getOwnedOperations()).basicRemove(otherEnd, msgs);
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
				case UML2Package.DATA_TYPE__OWNING_PARAMETER:
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
			case UML2Package.DATA_TYPE__EANNOTATIONS:
				return getEAnnotations();
			case UML2Package.DATA_TYPE__OWNED_ELEMENT:
				return getOwnedElements();
			case UML2Package.DATA_TYPE__OWNER:
				if (resolve) return getOwner();
				return basicGetOwner();
			case UML2Package.DATA_TYPE__OWNED_COMMENT:
				return getOwnedComments();
			case UML2Package.DATA_TYPE__TEMPLATE_BINDING:
				return getTemplateBindings();
			case UML2Package.DATA_TYPE__OWNED_TEMPLATE_SIGNATURE:
				return getOwnedTemplateSignature();
			case UML2Package.DATA_TYPE__NAME:
				return getName();
			case UML2Package.DATA_TYPE__QUALIFIED_NAME:
				return getQualifiedName();
			case UML2Package.DATA_TYPE__VISIBILITY:
				return getVisibility();
			case UML2Package.DATA_TYPE__CLIENT_DEPENDENCY:
				return getClientDependencies();
			case UML2Package.DATA_TYPE__NAME_EXPRESSION:
				return getNameExpression();
			case UML2Package.DATA_TYPE__MEMBER:
				return getMembers();
			case UML2Package.DATA_TYPE__OWNED_RULE:
				return getOwnedRules();
			case UML2Package.DATA_TYPE__IMPORTED_MEMBER:
				return getImportedMembers();
			case UML2Package.DATA_TYPE__ELEMENT_IMPORT:
				return getElementImports();
			case UML2Package.DATA_TYPE__PACKAGE_IMPORT:
				return getPackageImports();
			case UML2Package.DATA_TYPE__TEMPLATE_PARAMETER:
				if (resolve) return getTemplateParameter();
				return basicGetTemplateParameter();
			case UML2Package.DATA_TYPE__OWNING_PARAMETER:
				return getOwningParameter();
			case UML2Package.DATA_TYPE__PACKAGEABLE_ELEMENT_VISIBILITY:
				return getPackageableElement_visibility();
			case UML2Package.DATA_TYPE__PACKAGE:
				if (resolve) return getPackage();
				return basicGetPackage();
			case UML2Package.DATA_TYPE__REDEFINITION_CONTEXT:
				return getRedefinitionContexts();
			case UML2Package.DATA_TYPE__IS_LEAF:
				return isLeaf() ? Boolean.TRUE : Boolean.FALSE;
			case UML2Package.DATA_TYPE__FEATURE:
				return getFeatures();
			case UML2Package.DATA_TYPE__IS_ABSTRACT:
				return isAbstract() ? Boolean.TRUE : Boolean.FALSE;
			case UML2Package.DATA_TYPE__INHERITED_MEMBER:
				return getInheritedMembers();
			case UML2Package.DATA_TYPE__GENERAL:
				return getGenerals();
			case UML2Package.DATA_TYPE__GENERALIZATION:
				return getGeneralizations();
			case UML2Package.DATA_TYPE__ATTRIBUTE:
				return getAttributes();
			case UML2Package.DATA_TYPE__REDEFINED_CLASSIFIER:
				return getRedefinedClassifiers();
			case UML2Package.DATA_TYPE__POWERTYPE_EXTENT:
				return getPowertypeExtents();
			case UML2Package.DATA_TYPE__SUBSTITUTION:
				return getSubstitutions();
			case UML2Package.DATA_TYPE__OWNED_USE_CASE:
				return getOwnedUseCases();
			case UML2Package.DATA_TYPE__USE_CASE:
				return getUseCases();
			case UML2Package.DATA_TYPE__REPRESENTATION:
				return getRepresentation();
			case UML2Package.DATA_TYPE__OCCURRENCE:
				return getOccurrences();
			case UML2Package.DATA_TYPE__OWNED_ATTRIBUTE:
				return getOwnedAttributes();
			case UML2Package.DATA_TYPE__OWNED_OPERATION:
				return getOwnedOperations();
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
			case UML2Package.DATA_TYPE__EANNOTATIONS:
				getEAnnotations().clear();
				getEAnnotations().addAll((Collection)newValue);
				return;
			case UML2Package.DATA_TYPE__OWNED_COMMENT:
				getOwnedComments().clear();
				getOwnedComments().addAll((Collection)newValue);
				return;
			case UML2Package.DATA_TYPE__TEMPLATE_BINDING:
				getTemplateBindings().clear();
				getTemplateBindings().addAll((Collection)newValue);
				return;
			case UML2Package.DATA_TYPE__OWNED_TEMPLATE_SIGNATURE:
				setOwnedTemplateSignature((TemplateSignature)newValue);
				return;
			case UML2Package.DATA_TYPE__NAME:
				setName((String)newValue);
				return;
			case UML2Package.DATA_TYPE__VISIBILITY:
				setVisibility((VisibilityKind)newValue);
				return;
			case UML2Package.DATA_TYPE__CLIENT_DEPENDENCY:
				getClientDependencies().clear();
				getClientDependencies().addAll((Collection)newValue);
				return;
			case UML2Package.DATA_TYPE__NAME_EXPRESSION:
				setNameExpression((StringExpression)newValue);
				return;
			case UML2Package.DATA_TYPE__OWNED_RULE:
				getOwnedRules().clear();
				getOwnedRules().addAll((Collection)newValue);
				return;
			case UML2Package.DATA_TYPE__ELEMENT_IMPORT:
				getElementImports().clear();
				getElementImports().addAll((Collection)newValue);
				return;
			case UML2Package.DATA_TYPE__PACKAGE_IMPORT:
				getPackageImports().clear();
				getPackageImports().addAll((Collection)newValue);
				return;
			case UML2Package.DATA_TYPE__TEMPLATE_PARAMETER:
				setTemplateParameter((TemplateParameter)newValue);
				return;
			case UML2Package.DATA_TYPE__OWNING_PARAMETER:
				setOwningParameter((TemplateParameter)newValue);
				return;
			case UML2Package.DATA_TYPE__PACKAGEABLE_ELEMENT_VISIBILITY:
				setPackageableElement_visibility((VisibilityKind)newValue);
				return;
			case UML2Package.DATA_TYPE__IS_LEAF:
				setIsLeaf(((Boolean)newValue).booleanValue());
				return;
			case UML2Package.DATA_TYPE__IS_ABSTRACT:
				setIsAbstract(((Boolean)newValue).booleanValue());
				return;
			case UML2Package.DATA_TYPE__GENERALIZATION:
				getGeneralizations().clear();
				getGeneralizations().addAll((Collection)newValue);
				return;
			case UML2Package.DATA_TYPE__REDEFINED_CLASSIFIER:
				getRedefinedClassifiers().clear();
				getRedefinedClassifiers().addAll((Collection)newValue);
				return;
			case UML2Package.DATA_TYPE__POWERTYPE_EXTENT:
				getPowertypeExtents().clear();
				getPowertypeExtents().addAll((Collection)newValue);
				return;
			case UML2Package.DATA_TYPE__SUBSTITUTION:
				getSubstitutions().clear();
				getSubstitutions().addAll((Collection)newValue);
				return;
			case UML2Package.DATA_TYPE__OWNED_USE_CASE:
				getOwnedUseCases().clear();
				getOwnedUseCases().addAll((Collection)newValue);
				return;
			case UML2Package.DATA_TYPE__USE_CASE:
				getUseCases().clear();
				getUseCases().addAll((Collection)newValue);
				return;
			case UML2Package.DATA_TYPE__REPRESENTATION:
				setRepresentation((CollaborationOccurrence)newValue);
				return;
			case UML2Package.DATA_TYPE__OCCURRENCE:
				getOccurrences().clear();
				getOccurrences().addAll((Collection)newValue);
				return;
			case UML2Package.DATA_TYPE__OWNED_ATTRIBUTE:
				getOwnedAttributes().clear();
				getOwnedAttributes().addAll((Collection)newValue);
				return;
			case UML2Package.DATA_TYPE__OWNED_OPERATION:
				getOwnedOperations().clear();
				getOwnedOperations().addAll((Collection)newValue);
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
			case UML2Package.DATA_TYPE__EANNOTATIONS:
				getEAnnotations().clear();
				return;
			case UML2Package.DATA_TYPE__OWNED_COMMENT:
				getOwnedComments().clear();
				return;
			case UML2Package.DATA_TYPE__TEMPLATE_BINDING:
				getTemplateBindings().clear();
				return;
			case UML2Package.DATA_TYPE__OWNED_TEMPLATE_SIGNATURE:
				setOwnedTemplateSignature((TemplateSignature)null);
				return;
			case UML2Package.DATA_TYPE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case UML2Package.DATA_TYPE__VISIBILITY:
				setVisibility(VISIBILITY_EDEFAULT);
				return;
			case UML2Package.DATA_TYPE__CLIENT_DEPENDENCY:
				getClientDependencies().clear();
				return;
			case UML2Package.DATA_TYPE__NAME_EXPRESSION:
				setNameExpression((StringExpression)null);
				return;
			case UML2Package.DATA_TYPE__OWNED_RULE:
				getOwnedRules().clear();
				return;
			case UML2Package.DATA_TYPE__ELEMENT_IMPORT:
				getElementImports().clear();
				return;
			case UML2Package.DATA_TYPE__PACKAGE_IMPORT:
				getPackageImports().clear();
				return;
			case UML2Package.DATA_TYPE__TEMPLATE_PARAMETER:
				setTemplateParameter((TemplateParameter)null);
				return;
			case UML2Package.DATA_TYPE__OWNING_PARAMETER:
				setOwningParameter(null);
				return;
			case UML2Package.DATA_TYPE__PACKAGEABLE_ELEMENT_VISIBILITY:
				setPackageableElement_visibility(PACKAGEABLE_ELEMENT_VISIBILITY_EDEFAULT);
				return;
			case UML2Package.DATA_TYPE__IS_LEAF:
				setIsLeaf(IS_LEAF_EDEFAULT);
				return;
			case UML2Package.DATA_TYPE__IS_ABSTRACT:
				setIsAbstract(IS_ABSTRACT_EDEFAULT);
				return;
			case UML2Package.DATA_TYPE__GENERALIZATION:
				getGeneralizations().clear();
				return;
			case UML2Package.DATA_TYPE__REDEFINED_CLASSIFIER:
				getRedefinedClassifiers().clear();
				return;
			case UML2Package.DATA_TYPE__POWERTYPE_EXTENT:
				getPowertypeExtents().clear();
				return;
			case UML2Package.DATA_TYPE__SUBSTITUTION:
				getSubstitutions().clear();
				return;
			case UML2Package.DATA_TYPE__OWNED_USE_CASE:
				getOwnedUseCases().clear();
				return;
			case UML2Package.DATA_TYPE__USE_CASE:
				getUseCases().clear();
				return;
			case UML2Package.DATA_TYPE__REPRESENTATION:
				setRepresentation((CollaborationOccurrence)null);
				return;
			case UML2Package.DATA_TYPE__OCCURRENCE:
				getOccurrences().clear();
				return;
			case UML2Package.DATA_TYPE__OWNED_ATTRIBUTE:
				getOwnedAttributes().clear();
				return;
			case UML2Package.DATA_TYPE__OWNED_OPERATION:
				getOwnedOperations().clear();
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
			case UML2Package.DATA_TYPE__EANNOTATIONS:
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UML2Package.DATA_TYPE__OWNED_ELEMENT:
				return !getOwnedElements().isEmpty();
			case UML2Package.DATA_TYPE__OWNER:
				return basicGetOwner() != null;
			case UML2Package.DATA_TYPE__OWNED_COMMENT:
				return ownedComment != null && !ownedComment.isEmpty();
			case UML2Package.DATA_TYPE__TEMPLATE_BINDING:
				return templateBinding != null && !templateBinding.isEmpty();
			case UML2Package.DATA_TYPE__OWNED_TEMPLATE_SIGNATURE:
				return ownedTemplateSignature != null;
			case UML2Package.DATA_TYPE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case UML2Package.DATA_TYPE__QUALIFIED_NAME:
				return !"".equals(getQualifiedName()); //$NON-NLS-1$
			case UML2Package.DATA_TYPE__VISIBILITY:
				return visibility != VISIBILITY_EDEFAULT;
			case UML2Package.DATA_TYPE__CLIENT_DEPENDENCY:
				return clientDependency != null && !clientDependency.isEmpty();
			case UML2Package.DATA_TYPE__NAME_EXPRESSION:
				return nameExpression != null;
			case UML2Package.DATA_TYPE__MEMBER:
				return !getMembers().isEmpty();
			case UML2Package.DATA_TYPE__OWNED_RULE:
				return ownedRule != null && !ownedRule.isEmpty();
			case UML2Package.DATA_TYPE__IMPORTED_MEMBER:
				return !getImportedMembers().isEmpty();
			case UML2Package.DATA_TYPE__ELEMENT_IMPORT:
				return elementImport != null && !elementImport.isEmpty();
			case UML2Package.DATA_TYPE__PACKAGE_IMPORT:
				return packageImport != null && !packageImport.isEmpty();
			case UML2Package.DATA_TYPE__TEMPLATE_PARAMETER:
				return templateParameter != null;
			case UML2Package.DATA_TYPE__OWNING_PARAMETER:
				return getOwningParameter() != null;
			case UML2Package.DATA_TYPE__PACKAGEABLE_ELEMENT_VISIBILITY:
				return packageableElement_visibility != PACKAGEABLE_ELEMENT_VISIBILITY_EDEFAULT;
			case UML2Package.DATA_TYPE__PACKAGE:
				return basicGetPackage() != null;
			case UML2Package.DATA_TYPE__REDEFINITION_CONTEXT:
				return !getRedefinitionContexts().isEmpty();
			case UML2Package.DATA_TYPE__IS_LEAF:
				return isLeaf != IS_LEAF_EDEFAULT;
			case UML2Package.DATA_TYPE__FEATURE:
				return !getFeatures().isEmpty();
			case UML2Package.DATA_TYPE__IS_ABSTRACT:
				return isAbstract != IS_ABSTRACT_EDEFAULT;
			case UML2Package.DATA_TYPE__INHERITED_MEMBER:
				return !getInheritedMembers().isEmpty();
			case UML2Package.DATA_TYPE__GENERAL:
				return !getGenerals().isEmpty();
			case UML2Package.DATA_TYPE__GENERALIZATION:
				return generalization != null && !generalization.isEmpty();
			case UML2Package.DATA_TYPE__ATTRIBUTE:
				return !getAttributes().isEmpty();
			case UML2Package.DATA_TYPE__REDEFINED_CLASSIFIER:
				return redefinedClassifier != null && !redefinedClassifier.isEmpty();
			case UML2Package.DATA_TYPE__POWERTYPE_EXTENT:
				return powertypeExtent != null && !powertypeExtent.isEmpty();
			case UML2Package.DATA_TYPE__SUBSTITUTION:
				return substitution != null && !substitution.isEmpty();
			case UML2Package.DATA_TYPE__OWNED_USE_CASE:
				return ownedUseCase != null && !ownedUseCase.isEmpty();
			case UML2Package.DATA_TYPE__USE_CASE:
				return useCase != null && !useCase.isEmpty();
			case UML2Package.DATA_TYPE__REPRESENTATION:
				return representation != null;
			case UML2Package.DATA_TYPE__OCCURRENCE:
				return occurrence != null && !occurrence.isEmpty();
			case UML2Package.DATA_TYPE__OWNED_ATTRIBUTE:
				return ownedAttribute != null && !ownedAttribute.isEmpty();
			case UML2Package.DATA_TYPE__OWNED_OPERATION:
				return ownedOperation != null && !ownedOperation.isEmpty();
		}
		return eDynamicIsSet(eFeature);
	}

} //DataTypeImpl
