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
 * $Id: InformationFlowImpl.java,v 1.18 2005/11/22 14:57:01 khussey Exp $
 */
package org.eclipse.uml2.impl;

import java.util.Collection;

import java.util.Iterator;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.eclipse.uml2.Classifier;
import org.eclipse.uml2.DirectedRelationship;
import org.eclipse.uml2.Element;
import org.eclipse.uml2.InformationFlow;
import org.eclipse.uml2.Relationship;
import org.eclipse.uml2.StringExpression;
import org.eclipse.uml2.TemplateParameter;
import org.eclipse.uml2.TemplateSignature;
import org.eclipse.uml2.UML2Package;
import org.eclipse.uml2.VisibilityKind;

import org.eclipse.uml2.common.util.DerivedUnionEObjectEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Information Flow</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2.impl.InformationFlowImpl#getRelatedElements <em>Related Element</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.InformationFlowImpl#getSources <em>Source</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.InformationFlowImpl#getTargets <em>Target</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.InformationFlowImpl#getRealizations <em>Realization</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.InformationFlowImpl#getConveyeds <em>Conveyed</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InformationFlowImpl extends PackageableElementImpl implements InformationFlow {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) IBM Corporation and others."; //$NON-NLS-1$

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InformationFlowImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return UML2Package.eINSTANCE.getInformationFlow();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getRelatedElements() {
		EList relatedElement = (EList)eVirtualGet(UML2Package.INFORMATION_FLOW__RELATED_ELEMENT);
		if (relatedElement == null) {
			eVirtualSet(UML2Package.INFORMATION_FLOW__RELATED_ELEMENT, relatedElement = new DerivedUnionEObjectEList(Element.class, this, UML2Package.INFORMATION_FLOW__RELATED_ELEMENT, new EStructuralFeature[] {UML2Package.eINSTANCE.getDirectedRelationship_Source(), UML2Package.eINSTANCE.getDirectedRelationship_Target()}));
		}
		return relatedElement;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRelatedElements() {
		return isSetSources()
			|| isSetTargets();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getSources() {
		EList source = (EList)eVirtualGet(UML2Package.INFORMATION_FLOW__SOURCE);
		if (source == null) {
			eVirtualSet(UML2Package.INFORMATION_FLOW__SOURCE, source = new DerivedUnionEObjectEList(Element.class, this, UML2Package.INFORMATION_FLOW__SOURCE, new EStructuralFeature[] {}));
		}
		return source;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSources() {
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getTargets() {
		EList target = (EList)eVirtualGet(UML2Package.INFORMATION_FLOW__TARGET);
		if (target == null) {
			eVirtualSet(UML2Package.INFORMATION_FLOW__TARGET, target = new DerivedUnionEObjectEList(Element.class, this, UML2Package.INFORMATION_FLOW__TARGET, new EStructuralFeature[] {}));
		}
		return target;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTargets() {
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getRealizations() {
		EList realization = (EList)eVirtualGet(UML2Package.INFORMATION_FLOW__REALIZATION);
		if (realization == null) {
			eVirtualSet(UML2Package.INFORMATION_FLOW__REALIZATION, realization = new EObjectResolvingEList(Relationship.class, this, UML2Package.INFORMATION_FLOW__REALIZATION));
		}
		return realization;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getConveyeds() {
		EList conveyed = (EList)eVirtualGet(UML2Package.INFORMATION_FLOW__CONVEYED);
		if (conveyed == null) {
			eVirtualSet(UML2Package.INFORMATION_FLOW__CONVEYED, conveyed = new EObjectResolvingEList(Classifier.class, this, UML2Package.INFORMATION_FLOW__CONVEYED));
		}
		return conveyed;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
    public Classifier getConveyed(String name) {
		for (Iterator i = getConveyeds().iterator(); i.hasNext(); ) {
			Classifier conveyed = (Classifier) i.next();
			if (name.equals(conveyed.getName())) {
				return conveyed;
			}
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(EStructuralFeature eFeature, boolean resolve) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case UML2Package.INFORMATION_FLOW__EANNOTATIONS:
				return getEAnnotations();
			case UML2Package.INFORMATION_FLOW__OWNED_ELEMENT:
				return getOwnedElements();
			case UML2Package.INFORMATION_FLOW__OWNER:
				if (resolve) return getOwner();
				return basicGetOwner();
			case UML2Package.INFORMATION_FLOW__OWNED_COMMENT:
				return getOwnedComments();
			case UML2Package.INFORMATION_FLOW__TEMPLATE_BINDING:
				return getTemplateBindings();
			case UML2Package.INFORMATION_FLOW__OWNED_TEMPLATE_SIGNATURE:
				return getOwnedTemplateSignature();
			case UML2Package.INFORMATION_FLOW__NAME:
				return getName();
			case UML2Package.INFORMATION_FLOW__QUALIFIED_NAME:
				return getQualifiedName();
			case UML2Package.INFORMATION_FLOW__VISIBILITY:
				return getVisibility();
			case UML2Package.INFORMATION_FLOW__CLIENT_DEPENDENCY:
				return getClientDependencies();
			case UML2Package.INFORMATION_FLOW__NAME_EXPRESSION:
				return getNameExpression();
			case UML2Package.INFORMATION_FLOW__TEMPLATE_PARAMETER:
				if (resolve) return getTemplateParameter();
				return basicGetTemplateParameter();
			case UML2Package.INFORMATION_FLOW__OWNING_PARAMETER:
				return getOwningParameter();
			case UML2Package.INFORMATION_FLOW__PACKAGEABLE_ELEMENT_VISIBILITY:
				return getPackageableElement_visibility();
			case UML2Package.INFORMATION_FLOW__RELATED_ELEMENT:
				return getRelatedElements();
			case UML2Package.INFORMATION_FLOW__SOURCE:
				return getSources();
			case UML2Package.INFORMATION_FLOW__TARGET:
				return getTargets();
			case UML2Package.INFORMATION_FLOW__REALIZATION:
				return getRealizations();
			case UML2Package.INFORMATION_FLOW__CONVEYED:
				return getConveyeds();
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
			case UML2Package.INFORMATION_FLOW__EANNOTATIONS:
				getEAnnotations().clear();
				getEAnnotations().addAll((Collection)newValue);
				return;
			case UML2Package.INFORMATION_FLOW__OWNED_COMMENT:
				getOwnedComments().clear();
				getOwnedComments().addAll((Collection)newValue);
				return;
			case UML2Package.INFORMATION_FLOW__TEMPLATE_BINDING:
				getTemplateBindings().clear();
				getTemplateBindings().addAll((Collection)newValue);
				return;
			case UML2Package.INFORMATION_FLOW__OWNED_TEMPLATE_SIGNATURE:
				setOwnedTemplateSignature((TemplateSignature)newValue);
				return;
			case UML2Package.INFORMATION_FLOW__NAME:
				setName((String)newValue);
				return;
			case UML2Package.INFORMATION_FLOW__VISIBILITY:
				setVisibility((VisibilityKind)newValue);
				return;
			case UML2Package.INFORMATION_FLOW__CLIENT_DEPENDENCY:
				getClientDependencies().clear();
				getClientDependencies().addAll((Collection)newValue);
				return;
			case UML2Package.INFORMATION_FLOW__NAME_EXPRESSION:
				setNameExpression((StringExpression)newValue);
				return;
			case UML2Package.INFORMATION_FLOW__TEMPLATE_PARAMETER:
				setTemplateParameter((TemplateParameter)newValue);
				return;
			case UML2Package.INFORMATION_FLOW__OWNING_PARAMETER:
				setOwningParameter((TemplateParameter)newValue);
				return;
			case UML2Package.INFORMATION_FLOW__PACKAGEABLE_ELEMENT_VISIBILITY:
				setPackageableElement_visibility((VisibilityKind)newValue);
				return;
			case UML2Package.INFORMATION_FLOW__REALIZATION:
				getRealizations().clear();
				getRealizations().addAll((Collection)newValue);
				return;
			case UML2Package.INFORMATION_FLOW__CONVEYED:
				getConveyeds().clear();
				getConveyeds().addAll((Collection)newValue);
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
			case UML2Package.INFORMATION_FLOW__EANNOTATIONS:
				getEAnnotations().clear();
				return;
			case UML2Package.INFORMATION_FLOW__OWNED_COMMENT:
				getOwnedComments().clear();
				return;
			case UML2Package.INFORMATION_FLOW__TEMPLATE_BINDING:
				getTemplateBindings().clear();
				return;
			case UML2Package.INFORMATION_FLOW__OWNED_TEMPLATE_SIGNATURE:
				setOwnedTemplateSignature((TemplateSignature)null);
				return;
			case UML2Package.INFORMATION_FLOW__NAME:
				setName(NAME_EDEFAULT);
				return;
			case UML2Package.INFORMATION_FLOW__VISIBILITY:
				setVisibility(VISIBILITY_EDEFAULT);
				return;
			case UML2Package.INFORMATION_FLOW__CLIENT_DEPENDENCY:
				getClientDependencies().clear();
				return;
			case UML2Package.INFORMATION_FLOW__NAME_EXPRESSION:
				setNameExpression((StringExpression)null);
				return;
			case UML2Package.INFORMATION_FLOW__TEMPLATE_PARAMETER:
				setTemplateParameter((TemplateParameter)null);
				return;
			case UML2Package.INFORMATION_FLOW__OWNING_PARAMETER:
				setOwningParameter((TemplateParameter)null);
				return;
			case UML2Package.INFORMATION_FLOW__PACKAGEABLE_ELEMENT_VISIBILITY:
				setPackageableElement_visibility(PACKAGEABLE_ELEMENT_VISIBILITY_EDEFAULT);
				return;
			case UML2Package.INFORMATION_FLOW__REALIZATION:
				getRealizations().clear();
				return;
			case UML2Package.INFORMATION_FLOW__CONVEYED:
				getConveyeds().clear();
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
			case UML2Package.INFORMATION_FLOW__EANNOTATIONS:
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UML2Package.INFORMATION_FLOW__OWNED_ELEMENT:
				return isSetOwnedElements();
			case UML2Package.INFORMATION_FLOW__OWNER:
				return isSetOwner();
			case UML2Package.INFORMATION_FLOW__OWNED_COMMENT:
				EList ownedComment = (EList)eVirtualGet(UML2Package.INFORMATION_FLOW__OWNED_COMMENT);
				return ownedComment != null && !ownedComment.isEmpty();
			case UML2Package.INFORMATION_FLOW__TEMPLATE_BINDING:
				EList templateBinding = (EList)eVirtualGet(UML2Package.INFORMATION_FLOW__TEMPLATE_BINDING);
				return templateBinding != null && !templateBinding.isEmpty();
			case UML2Package.INFORMATION_FLOW__OWNED_TEMPLATE_SIGNATURE:
				return eVirtualGet(UML2Package.INFORMATION_FLOW__OWNED_TEMPLATE_SIGNATURE) != null;
			case UML2Package.INFORMATION_FLOW__NAME:
				String name = (String)eVirtualGet(UML2Package.INFORMATION_FLOW__NAME, NAME_EDEFAULT);
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case UML2Package.INFORMATION_FLOW__QUALIFIED_NAME:
				return QUALIFIED_NAME_EDEFAULT == null ? getQualifiedName() != null : !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case UML2Package.INFORMATION_FLOW__VISIBILITY:
				return isSetVisibility();
			case UML2Package.INFORMATION_FLOW__CLIENT_DEPENDENCY:
				EList clientDependency = (EList)eVirtualGet(UML2Package.INFORMATION_FLOW__CLIENT_DEPENDENCY);
				return clientDependency != null && !clientDependency.isEmpty();
			case UML2Package.INFORMATION_FLOW__NAME_EXPRESSION:
				return eVirtualGet(UML2Package.INFORMATION_FLOW__NAME_EXPRESSION) != null;
			case UML2Package.INFORMATION_FLOW__TEMPLATE_PARAMETER:
				return eVirtualGet(UML2Package.INFORMATION_FLOW__TEMPLATE_PARAMETER) != null;
			case UML2Package.INFORMATION_FLOW__OWNING_PARAMETER:
				return getOwningParameter() != null;
			case UML2Package.INFORMATION_FLOW__PACKAGEABLE_ELEMENT_VISIBILITY:
				return isSetPackageableElement_visibility();
			case UML2Package.INFORMATION_FLOW__RELATED_ELEMENT:
				return isSetRelatedElements();
			case UML2Package.INFORMATION_FLOW__SOURCE:
				return isSetSources();
			case UML2Package.INFORMATION_FLOW__TARGET:
				return isSetTargets();
			case UML2Package.INFORMATION_FLOW__REALIZATION:
				EList realization = (EList)eVirtualGet(UML2Package.INFORMATION_FLOW__REALIZATION);
				return realization != null && !realization.isEmpty();
			case UML2Package.INFORMATION_FLOW__CONVEYED:
				EList conveyed = (EList)eVirtualGet(UML2Package.INFORMATION_FLOW__CONVEYED);
				return conveyed != null && !conveyed.isEmpty();
		}
		return eDynamicIsSet(eFeature);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class baseClass) {
		if (baseClass == Relationship.class) {
			switch (derivedFeatureID) {
				case UML2Package.INFORMATION_FLOW__RELATED_ELEMENT: return UML2Package.RELATIONSHIP__RELATED_ELEMENT;
				default: return -1;
			}
		}
		if (baseClass == DirectedRelationship.class) {
			switch (derivedFeatureID) {
				case UML2Package.INFORMATION_FLOW__SOURCE: return UML2Package.DIRECTED_RELATIONSHIP__SOURCE;
				case UML2Package.INFORMATION_FLOW__TARGET: return UML2Package.DIRECTED_RELATIONSHIP__TARGET;
				default: return -1;
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
		if (baseClass == Relationship.class) {
			switch (baseFeatureID) {
				case UML2Package.RELATIONSHIP__RELATED_ELEMENT: return UML2Package.INFORMATION_FLOW__RELATED_ELEMENT;
				default: return -1;
			}
		}
		if (baseClass == DirectedRelationship.class) {
			switch (baseFeatureID) {
				case UML2Package.DIRECTED_RELATIONSHIP__SOURCE: return UML2Package.INFORMATION_FLOW__SOURCE;
				case UML2Package.DIRECTED_RELATIONSHIP__TARGET: return UML2Package.INFORMATION_FLOW__TARGET;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}


} //InformationFlowImpl
