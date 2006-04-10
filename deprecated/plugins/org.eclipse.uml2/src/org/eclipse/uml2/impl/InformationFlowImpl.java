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
 * $Id: InformationFlowImpl.java,v 1.23 2006/04/10 20:40:16 khussey Exp $
 */
package org.eclipse.uml2.impl;

import java.util.Collection;

import java.util.Iterator;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.resource.Resource;

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

import org.eclipse.uml2.common.util.CacheAdapter;
import org.eclipse.uml2.common.util.DerivedUnionEObjectEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Information Flow</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
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
	 * The cached value of the '{@link #getRealizations() <em>Realization</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRealizations()
	 * @generated
	 * @ordered
	 */
	protected EList realizations = null;

	/**
	 * The cached value of the '{@link #getConveyeds() <em>Conveyed</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConveyeds()
	 * @generated
	 * @ordered
	 */
	protected EList conveyeds = null;

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
		return UML2Package.Literals.INFORMATION_FLOW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getRelatedElements() {
		CacheAdapter cache = getCacheAdapter();
		if (cache != null) {
			Resource eResource = eResource();
			EList relatedElements = (EList) cache.get(eResource, this, UML2Package.Literals.RELATIONSHIP__RELATED_ELEMENT);
			if (relatedElements == null) {
				cache.put(eResource, this, UML2Package.Literals.RELATIONSHIP__RELATED_ELEMENT, relatedElements = new DerivedUnionEObjectEList(Element.class, this, UML2Package.INFORMATION_FLOW__RELATED_ELEMENT, RELATED_ELEMENT_ESUBSETS));
			}
			return relatedElements;
		}
		return new DerivedUnionEObjectEList(Element.class, this, UML2Package.INFORMATION_FLOW__RELATED_ELEMENT, RELATED_ELEMENT_ESUBSETS);
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
	 * The array of subset feature identifiers for the '{@link #getRelatedElements() <em>Related Element</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelatedElements()
	 * @generated
	 * @ordered
	 */
	protected static final int[] RELATED_ELEMENT_ESUBSETS = new int[] {UML2Package.INFORMATION_FLOW__SOURCE, UML2Package.INFORMATION_FLOW__TARGET};

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getSources() {
		CacheAdapter cache = getCacheAdapter();
		if (cache != null) {
			Resource eResource = eResource();
			EList sources = (EList) cache.get(eResource, this, UML2Package.Literals.DIRECTED_RELATIONSHIP__SOURCE);
			if (sources == null) {
				cache.put(eResource, this, UML2Package.Literals.DIRECTED_RELATIONSHIP__SOURCE, sources = new DerivedUnionEObjectEList(Element.class, this, UML2Package.INFORMATION_FLOW__SOURCE, null));
			}
			return sources;
		}
		return new DerivedUnionEObjectEList(Element.class, this, UML2Package.INFORMATION_FLOW__SOURCE, null);
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
		CacheAdapter cache = getCacheAdapter();
		if (cache != null) {
			Resource eResource = eResource();
			EList targets = (EList) cache.get(eResource, this, UML2Package.Literals.DIRECTED_RELATIONSHIP__TARGET);
			if (targets == null) {
				cache.put(eResource, this, UML2Package.Literals.DIRECTED_RELATIONSHIP__TARGET, targets = new DerivedUnionEObjectEList(Element.class, this, UML2Package.INFORMATION_FLOW__TARGET, null));
			}
			return targets;
		}
		return new DerivedUnionEObjectEList(Element.class, this, UML2Package.INFORMATION_FLOW__TARGET, null);
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
		if (realizations == null) {
			realizations = new EObjectResolvingEList(Relationship.class, this, UML2Package.INFORMATION_FLOW__REALIZATION);
		}
		return realizations;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getConveyeds() {
		if (conveyeds == null) {
			conveyeds = new EObjectResolvingEList(Classifier.class, this, UML2Package.INFORMATION_FLOW__CONVEYED);
		}
		return conveyeds;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
    public Classifier getConveyed(String name) {
		return getConveyed(name, false, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Classifier getConveyed(String name, boolean ignoreCase, EClass eClass) {
		conveyedLoop: for (Iterator i = getConveyeds().iterator(); i.hasNext(); ) {
			Classifier conveyed = (Classifier) i.next();
			if (eClass != null && !eClass.isInstance(conveyed))
				continue conveyedLoop;
			if (name != null && !(ignoreCase ? name.equalsIgnoreCase(conveyed.getName()) : name.equals(conveyed.getName())))
				continue conveyedLoop;
			return conveyed;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
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
		return eDynamicGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
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
		eDynamicSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eUnset(int featureID) {
		switch (featureID) {
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
		eDynamicUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case UML2Package.INFORMATION_FLOW__EANNOTATIONS:
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UML2Package.INFORMATION_FLOW__OWNED_ELEMENT:
				return isSetOwnedElements();
			case UML2Package.INFORMATION_FLOW__OWNER:
				return isSetOwner();
			case UML2Package.INFORMATION_FLOW__OWNED_COMMENT:
				return ownedComments != null && !ownedComments.isEmpty();
			case UML2Package.INFORMATION_FLOW__TEMPLATE_BINDING:
				return templateBindings != null && !templateBindings.isEmpty();
			case UML2Package.INFORMATION_FLOW__OWNED_TEMPLATE_SIGNATURE:
				return ownedTemplateSignature != null;
			case UML2Package.INFORMATION_FLOW__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case UML2Package.INFORMATION_FLOW__QUALIFIED_NAME:
				return QUALIFIED_NAME_EDEFAULT == null ? getQualifiedName() != null : !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case UML2Package.INFORMATION_FLOW__VISIBILITY:
				return isSetVisibility();
			case UML2Package.INFORMATION_FLOW__CLIENT_DEPENDENCY:
				return clientDependencies != null && !clientDependencies.isEmpty();
			case UML2Package.INFORMATION_FLOW__NAME_EXPRESSION:
				return nameExpression != null;
			case UML2Package.INFORMATION_FLOW__TEMPLATE_PARAMETER:
				return templateParameter != null;
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
				return realizations != null && !realizations.isEmpty();
			case UML2Package.INFORMATION_FLOW__CONVEYED:
				return conveyeds != null && !conveyeds.isEmpty();
		}
		return eDynamicIsSet(featureID);
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
