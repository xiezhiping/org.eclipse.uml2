/*
 * Copyright (c) 2003, 2004 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Common Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/cpl-v10.html
 *
 * Contributors:
 *   IBM - Initial API and implementation
 */
package org.eclipse.uml2.impl;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.uml2.Dependency;
import org.eclipse.uml2.DirectedRelationship;
import org.eclipse.uml2.NamedElement;
import org.eclipse.uml2.Relationship;
import org.eclipse.uml2.StringExpression;
import org.eclipse.uml2.TemplateParameter;
import org.eclipse.uml2.TemplateSignature;
import org.eclipse.uml2.UML2Package;
import org.eclipse.uml2.VisibilityKind;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dependency</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2.impl.DependencyImpl#getRelatedElements <em>Related Element</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.DependencyImpl#getSources <em>Source</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.DependencyImpl#getTargets <em>Target</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.DependencyImpl#getClients <em>Client</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.DependencyImpl#getSuppliers <em>Supplier</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DependencyImpl extends PackageableElementImpl implements Dependency {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2003, 2004 IBM Corporation and others."; //$NON-NLS-1$

	/**
	 * The cached value of the '{@link #getClients() <em>Client</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClients()
	 * @generated
	 * @ordered
	 */
	protected EList client = null;

	/**
	 * The cached value of the '{@link #getSuppliers() <em>Supplier</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuppliers()
	 * @generated
	 * @ordered
	 */
	protected EList supplier = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DependencyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return UML2Package.eINSTANCE.getDependency();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * Returns the value of the '<em><b>Related Element</b></em>' reference list, a derived union.
	 * @generated
	 */
	public EList getRelatedElementsGen() {
		// TODO: test this union getter
		if (!getCacheAdapter().containsKey(this, UML2Package.eINSTANCE.getRelationship_RelatedElement())) {
			Set union = new LinkedHashSet();
			getCacheAdapter().put(
				this,
				UML2Package.eINSTANCE.getRelationship_RelatedElement(),
				new EcoreEList.UnmodifiableEList(this, 
					UML2Package.eINSTANCE.getRelationship_RelatedElement(),
					union.size(),
					union.toArray()));
		}
		return (EList) getCacheAdapter().get(this, UML2Package.eINSTANCE.getRelationship_RelatedElement());
	}

	public EList getRelatedElements() {
		Set union = new HashSet();
		union.addAll(getSources());
		union.addAll(getTargets());
		return new EcoreEList.UnmodifiableEList(this, UML2Package.eINSTANCE.getRelationship_RelatedElement(), union.size(), union.toArray());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * Returns the value of the '<em><b>Source</b></em>' reference list, a derived union.
	 * <p>
	 * Subsets the following features:
	 * <ul>
	 *   <li>{@link org.eclipse.uml2.Relationship#getRelatedElements}</li>
	 * </ul>
	 * </p>
	 * @generated
	 */
	public EList getSourcesGen() {
		// TODO: test this union getter
		if (!getCacheAdapter().containsKey(this, UML2Package.eINSTANCE.getDirectedRelationship_Source())) {
			Set union = new LinkedHashSet();
			getCacheAdapter().put(
				this,
				UML2Package.eINSTANCE.getDirectedRelationship_Source(),
				new EcoreEList.UnmodifiableEList(this, 
					UML2Package.eINSTANCE.getDirectedRelationship_Source(),
					union.size(),
					union.toArray()));
		}
		return (EList) getCacheAdapter().get(this, UML2Package.eINSTANCE.getDirectedRelationship_Source());
	}

	public EList getSources() {
		// TODO: test this union getter
		Set union = new HashSet();
		union.addAll(getClients());
		return new EcoreEList.UnmodifiableEList(this, UML2Package.eINSTANCE.getDirectedRelationship_Source(), union.size(), union.toArray());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * Returns the value of the '<em><b>Target</b></em>' reference list, a derived union.
	 * <p>
	 * Subsets the following features:
	 * <ul>
	 *   <li>{@link org.eclipse.uml2.Relationship#getRelatedElements}</li>
	 * </ul>
	 * </p>
	 * @generated
	 */
	public EList getTargetsGen() {
		// TODO: test this union getter
		if (!getCacheAdapter().containsKey(this, UML2Package.eINSTANCE.getDirectedRelationship_Target())) {
			Set union = new LinkedHashSet();
			getCacheAdapter().put(
				this,
				UML2Package.eINSTANCE.getDirectedRelationship_Target(),
				new EcoreEList.UnmodifiableEList(this, 
					UML2Package.eINSTANCE.getDirectedRelationship_Target(),
					union.size(),
					union.toArray()));
		}
		return (EList) getCacheAdapter().get(this, UML2Package.eINSTANCE.getDirectedRelationship_Target());
	}

	public EList getTargets() {
		// TODO: test this union getter
		Set union = new HashSet();
		union.addAll(getSuppliers());
		return new EcoreEList.UnmodifiableEList(this, UML2Package.eINSTANCE.getDirectedRelationship_Target(), union.size(), union.toArray());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * Returns the value of the '<em><b>Client</b></em>' reference list.
	 * @generated
	 */
	public EList getClients() {
		if (null == client) {
			client = new EObjectWithInverseResolvingEList.ManyInverse(NamedElement.class, this, UML2Package.DEPENDENCY__CLIENT, UML2Package.NAMED_ELEMENT__CLIENT_DEPENDENCY);
		}
		return client;
	}

    /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
     */
    public NamedElement getClient(String unqualifiedName) {
    	for (Iterator i = getClients().iterator(); i.hasNext(); ) {
    		NamedElement namedClient = (NamedElement) i.next();
    		
    		if (unqualifiedName.equals(namedClient.getName())) {
    			return namedClient;
    		}
    	}
    	
    	return null;
    }
      
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * Returns the value of the '<em><b>Supplier</b></em>' reference list.
	 * @generated
	 */
	public EList getSuppliers() {
		if (null == supplier) {
			supplier = new EObjectResolvingEList(NamedElement.class, this, UML2Package.DEPENDENCY__SUPPLIER);
		}
		return supplier;
	}

    /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
     */
    public NamedElement getSupplier(String unqualifiedName) {
    	for (Iterator i = getSuppliers().iterator(); i.hasNext(); ) {
    		NamedElement namedSupplier = (NamedElement) i.next();
    		
    		if (unqualifiedName.equals(namedSupplier.getName())) {
    			return namedSupplier;
    		}
    	}
    	
    	return null;
    }
      
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, Class baseClass, NotificationChain msgs) {
		if (featureID >= 0) {
			switch (eDerivedStructuralFeatureID(featureID, baseClass)) {
				case UML2Package.DEPENDENCY__EANNOTATIONS:
					return ((InternalEList)getEAnnotations()).basicAdd(otherEnd, msgs);
				case UML2Package.DEPENDENCY__TEMPLATE_BINDING:
					return ((InternalEList)getTemplateBindings()).basicAdd(otherEnd, msgs);
				case UML2Package.DEPENDENCY__OWNED_TEMPLATE_SIGNATURE:
					if (ownedTemplateSignature != null)
						msgs = ((InternalEObject)ownedTemplateSignature).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UML2Package.DEPENDENCY__OWNED_TEMPLATE_SIGNATURE, null, msgs);
					return basicSetOwnedTemplateSignature((TemplateSignature)otherEnd, msgs);
				case UML2Package.DEPENDENCY__CLIENT_DEPENDENCY:
					return ((InternalEList)getClientDependencies()).basicAdd(otherEnd, msgs);
				case UML2Package.DEPENDENCY__TEMPLATE_PARAMETER:
					if (templateParameter != null)
						msgs = ((InternalEObject)templateParameter).eInverseRemove(this, UML2Package.TEMPLATE_PARAMETER__PARAMETERED_ELEMENT, TemplateParameter.class, msgs);
					return basicSetTemplateParameter((TemplateParameter)otherEnd, msgs);
				case UML2Package.DEPENDENCY__OWNING_PARAMETER:
					if (eContainer != null)
						msgs = eBasicRemoveFromContainer(msgs);
					return eBasicSetContainer(otherEnd, UML2Package.DEPENDENCY__OWNING_PARAMETER, msgs);
				case UML2Package.DEPENDENCY__CLIENT:
					return ((InternalEList)getClients()).basicAdd(otherEnd, msgs);
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
				case UML2Package.DEPENDENCY__EANNOTATIONS:
					return ((InternalEList)getEAnnotations()).basicRemove(otherEnd, msgs);
				case UML2Package.DEPENDENCY__OWNED_COMMENT:
					return ((InternalEList)getOwnedComments()).basicRemove(otherEnd, msgs);
				case UML2Package.DEPENDENCY__TEMPLATE_BINDING:
					return ((InternalEList)getTemplateBindings()).basicRemove(otherEnd, msgs);
				case UML2Package.DEPENDENCY__OWNED_TEMPLATE_SIGNATURE:
					return basicSetOwnedTemplateSignature(null, msgs);
				case UML2Package.DEPENDENCY__CLIENT_DEPENDENCY:
					return ((InternalEList)getClientDependencies()).basicRemove(otherEnd, msgs);
				case UML2Package.DEPENDENCY__NAME_EXPRESSION:
					return basicSetNameExpression(null, msgs);
				case UML2Package.DEPENDENCY__TEMPLATE_PARAMETER:
					return basicSetTemplateParameter(null, msgs);
				case UML2Package.DEPENDENCY__OWNING_PARAMETER:
					return eBasicSetContainer(null, UML2Package.DEPENDENCY__OWNING_PARAMETER, msgs);
				case UML2Package.DEPENDENCY__CLIENT:
					return ((InternalEList)getClients()).basicRemove(otherEnd, msgs);
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
				case UML2Package.DEPENDENCY__OWNING_PARAMETER:
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
			case UML2Package.DEPENDENCY__EANNOTATIONS:
				return getEAnnotations();
			case UML2Package.DEPENDENCY__OWNED_ELEMENT:
				return getOwnedElements();
			case UML2Package.DEPENDENCY__OWNER:
				if (resolve) return getOwner();
				return basicGetOwner();
			case UML2Package.DEPENDENCY__OWNED_COMMENT:
				return getOwnedComments();
			case UML2Package.DEPENDENCY__TEMPLATE_BINDING:
				return getTemplateBindings();
			case UML2Package.DEPENDENCY__OWNED_TEMPLATE_SIGNATURE:
				return getOwnedTemplateSignature();
			case UML2Package.DEPENDENCY__NAME:
				return getName();
			case UML2Package.DEPENDENCY__QUALIFIED_NAME:
				return getQualifiedName();
			case UML2Package.DEPENDENCY__VISIBILITY:
				return getVisibility();
			case UML2Package.DEPENDENCY__CLIENT_DEPENDENCY:
				return getClientDependencies();
			case UML2Package.DEPENDENCY__NAME_EXPRESSION:
				return getNameExpression();
			case UML2Package.DEPENDENCY__TEMPLATE_PARAMETER:
				if (resolve) return getTemplateParameter();
				return basicGetTemplateParameter();
			case UML2Package.DEPENDENCY__OWNING_PARAMETER:
				return getOwningParameter();
			case UML2Package.DEPENDENCY__PACKAGEABLE_ELEMENT_VISIBILITY:
				return getPackageableElement_visibility();
			case UML2Package.DEPENDENCY__RELATED_ELEMENT:
				return getRelatedElements();
			case UML2Package.DEPENDENCY__SOURCE:
				return getSources();
			case UML2Package.DEPENDENCY__TARGET:
				return getTargets();
			case UML2Package.DEPENDENCY__CLIENT:
				return getClients();
			case UML2Package.DEPENDENCY__SUPPLIER:
				return getSuppliers();
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
			case UML2Package.DEPENDENCY__EANNOTATIONS:
				getEAnnotations().clear();
				getEAnnotations().addAll((Collection)newValue);
				return;
			case UML2Package.DEPENDENCY__OWNED_COMMENT:
				getOwnedComments().clear();
				getOwnedComments().addAll((Collection)newValue);
				return;
			case UML2Package.DEPENDENCY__TEMPLATE_BINDING:
				getTemplateBindings().clear();
				getTemplateBindings().addAll((Collection)newValue);
				return;
			case UML2Package.DEPENDENCY__OWNED_TEMPLATE_SIGNATURE:
				setOwnedTemplateSignature((TemplateSignature)newValue);
				return;
			case UML2Package.DEPENDENCY__NAME:
				setName((String)newValue);
				return;
			case UML2Package.DEPENDENCY__VISIBILITY:
				setVisibility((VisibilityKind)newValue);
				return;
			case UML2Package.DEPENDENCY__CLIENT_DEPENDENCY:
				getClientDependencies().clear();
				getClientDependencies().addAll((Collection)newValue);
				return;
			case UML2Package.DEPENDENCY__NAME_EXPRESSION:
				setNameExpression((StringExpression)newValue);
				return;
			case UML2Package.DEPENDENCY__TEMPLATE_PARAMETER:
				setTemplateParameter((TemplateParameter)newValue);
				return;
			case UML2Package.DEPENDENCY__OWNING_PARAMETER:
				setOwningParameter((TemplateParameter)newValue);
				return;
			case UML2Package.DEPENDENCY__PACKAGEABLE_ELEMENT_VISIBILITY:
				setPackageableElement_visibility((VisibilityKind)newValue);
				return;
			case UML2Package.DEPENDENCY__CLIENT:
				getClients().clear();
				getClients().addAll((Collection)newValue);
				return;
			case UML2Package.DEPENDENCY__SUPPLIER:
				getSuppliers().clear();
				getSuppliers().addAll((Collection)newValue);
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
			case UML2Package.DEPENDENCY__EANNOTATIONS:
				getEAnnotations().clear();
				return;
			case UML2Package.DEPENDENCY__OWNED_COMMENT:
				getOwnedComments().clear();
				return;
			case UML2Package.DEPENDENCY__TEMPLATE_BINDING:
				getTemplateBindings().clear();
				return;
			case UML2Package.DEPENDENCY__OWNED_TEMPLATE_SIGNATURE:
				setOwnedTemplateSignature((TemplateSignature)null);
				return;
			case UML2Package.DEPENDENCY__NAME:
				setName(NAME_EDEFAULT);
				return;
			case UML2Package.DEPENDENCY__VISIBILITY:
				setVisibility(VISIBILITY_EDEFAULT);
				return;
			case UML2Package.DEPENDENCY__CLIENT_DEPENDENCY:
				getClientDependencies().clear();
				return;
			case UML2Package.DEPENDENCY__NAME_EXPRESSION:
				setNameExpression((StringExpression)null);
				return;
			case UML2Package.DEPENDENCY__TEMPLATE_PARAMETER:
				setTemplateParameter((TemplateParameter)null);
				return;
			case UML2Package.DEPENDENCY__OWNING_PARAMETER:
				setOwningParameter(null);
				return;
			case UML2Package.DEPENDENCY__PACKAGEABLE_ELEMENT_VISIBILITY:
				setPackageableElement_visibility(PACKAGEABLE_ELEMENT_VISIBILITY_EDEFAULT);
				return;
			case UML2Package.DEPENDENCY__CLIENT:
				getClients().clear();
				return;
			case UML2Package.DEPENDENCY__SUPPLIER:
				getSuppliers().clear();
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
			case UML2Package.DEPENDENCY__EANNOTATIONS:
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UML2Package.DEPENDENCY__OWNED_ELEMENT:
				return !getOwnedElements().isEmpty();
			case UML2Package.DEPENDENCY__OWNER:
				return basicGetOwner() != null;
			case UML2Package.DEPENDENCY__OWNED_COMMENT:
				return ownedComment != null && !ownedComment.isEmpty();
			case UML2Package.DEPENDENCY__TEMPLATE_BINDING:
				return templateBinding != null && !templateBinding.isEmpty();
			case UML2Package.DEPENDENCY__OWNED_TEMPLATE_SIGNATURE:
				return ownedTemplateSignature != null;
			case UML2Package.DEPENDENCY__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case UML2Package.DEPENDENCY__QUALIFIED_NAME:
				return !"".equals(getQualifiedName()); //$NON-NLS-1$
			case UML2Package.DEPENDENCY__VISIBILITY:
				return visibility != VISIBILITY_EDEFAULT;
			case UML2Package.DEPENDENCY__CLIENT_DEPENDENCY:
				return clientDependency != null && !clientDependency.isEmpty();
			case UML2Package.DEPENDENCY__NAME_EXPRESSION:
				return nameExpression != null;
			case UML2Package.DEPENDENCY__TEMPLATE_PARAMETER:
				return templateParameter != null;
			case UML2Package.DEPENDENCY__OWNING_PARAMETER:
				return getOwningParameter() != null;
			case UML2Package.DEPENDENCY__PACKAGEABLE_ELEMENT_VISIBILITY:
				return packageableElement_visibility != PACKAGEABLE_ELEMENT_VISIBILITY_EDEFAULT;
			case UML2Package.DEPENDENCY__RELATED_ELEMENT:
				return !getRelatedElements().isEmpty();
			case UML2Package.DEPENDENCY__SOURCE:
				return !getSources().isEmpty();
			case UML2Package.DEPENDENCY__TARGET:
				return !getTargets().isEmpty();
			case UML2Package.DEPENDENCY__CLIENT:
				return client != null && !client.isEmpty();
			case UML2Package.DEPENDENCY__SUPPLIER:
				return supplier != null && !supplier.isEmpty();
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
				case UML2Package.DEPENDENCY__RELATED_ELEMENT: return UML2Package.RELATIONSHIP__RELATED_ELEMENT;
				default: return -1;
			}
		}
		if (baseClass == DirectedRelationship.class) {
			switch (derivedFeatureID) {
				case UML2Package.DEPENDENCY__SOURCE: return UML2Package.DIRECTED_RELATIONSHIP__SOURCE;
				case UML2Package.DEPENDENCY__TARGET: return UML2Package.DIRECTED_RELATIONSHIP__TARGET;
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
				case UML2Package.RELATIONSHIP__RELATED_ELEMENT: return UML2Package.DEPENDENCY__RELATED_ELEMENT;
				default: return -1;
			}
		}
		if (baseClass == DirectedRelationship.class) {
			switch (baseFeatureID) {
				case UML2Package.DIRECTED_RELATIONSHIP__SOURCE: return UML2Package.DEPENDENCY__SOURCE;
				case UML2Package.DIRECTED_RELATIONSHIP__TARGET: return UML2Package.DEPENDENCY__TARGET;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //DependencyImpl
