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
 * $Id: IncludeImpl.java,v 1.12 2005/06/20 19:57:42 khussey Exp $
 */
package org.eclipse.uml2.impl;

import java.util.Collection;
import java.util.Iterator;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.UniqueEList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.uml2.DirectedRelationship;
import org.eclipse.uml2.Include;
import org.eclipse.uml2.Relationship;
import org.eclipse.uml2.StringExpression;
import org.eclipse.uml2.TemplateSignature;
import org.eclipse.uml2.UML2Package;
import org.eclipse.uml2.UseCase;
import org.eclipse.uml2.VisibilityKind;

import org.eclipse.uml2.common.util.CacheAdapter;
import org.eclipse.uml2.common.util.UnionEObjectEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Include</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2.impl.IncludeImpl#getIncludingCase <em>Including Case</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.IncludeImpl#getAddition <em>Addition</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IncludeImpl extends NamedElementImpl implements Include {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) IBM Corporation and others."; //$NON-NLS-1$

	/**
	 * The cached value of the '{@link #getAddition() <em>Addition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddition()
	 * @generated
	 * @ordered
	 */
	protected UseCase addition = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IncludeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return UML2Package.eINSTANCE.getInclude();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getRelatedElements() {
		CacheAdapter cache = getCacheAdapter();
		if (cache != null) {
			EList relatedElement = (EList) cache.get(eResource(), this, UML2Package.eINSTANCE.getRelationship_RelatedElement());
			if (relatedElement == null) {
				EList union = getRelatedElementsHelper(new UniqueEList());
				cache.put(eResource(), this, UML2Package.eINSTANCE.getRelationship_RelatedElement(), relatedElement = new UnionEObjectEList(this, UML2Package.eINSTANCE.getRelationship_RelatedElement(), union.size(), union.toArray()));
			}
			return relatedElement;
		}
		EList union = getRelatedElementsHelper(new UniqueEList());
		return new UnionEObjectEList(this, UML2Package.eINSTANCE.getRelationship_RelatedElement(), union.size(), union.toArray());
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EList getSourcesHelper(EList source) {
		UseCase includingCase = getIncludingCase();
		if (includingCase != null) {
			source.add(includingCase);
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UseCase getIncludingCase() {
		if (eContainerFeatureID != UML2Package.INCLUDE__INCLUDING_CASE) return null;
		return (UseCase)eContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIncludingCase(UseCase newIncludingCase) {
		if (newIncludingCase != eContainer || (eContainerFeatureID != UML2Package.INCLUDE__INCLUDING_CASE && newIncludingCase != null)) {
			if (EcoreUtil.isAncestor(this, newIncludingCase))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString()); //$NON-NLS-1$
			NotificationChain msgs = null;
			if (eContainer != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newIncludingCase != null)
				msgs = ((InternalEObject)newIncludingCase).eInverseAdd(this, UML2Package.USE_CASE__INCLUDE, UseCase.class, msgs);
			msgs = eBasicSetContainer((InternalEObject)newIncludingCase, UML2Package.INCLUDE__INCLUDING_CASE, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2Package.INCLUDE__INCLUDING_CASE, newIncludingCase, newIncludingCase));

	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UseCase getAddition() {
		if (addition != null && addition.eIsProxy()) {
			UseCase oldAddition = addition;
			addition = (UseCase)eResolveProxy((InternalEObject)addition);
			if (addition != oldAddition) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UML2Package.INCLUDE__ADDITION, oldAddition, addition));
			}
		}
		return addition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UseCase basicGetAddition() {
		return addition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAddition(UseCase newAddition) {
		UseCase oldAddition = addition;
		addition = newAddition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2Package.INCLUDE__ADDITION, oldAddition, addition));

	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getSources() {
		CacheAdapter cache = getCacheAdapter();
		if (cache != null) {
			EList source = (EList) cache.get(eResource(), this, UML2Package.eINSTANCE.getDirectedRelationship_Source());
			if (source == null) {
				EList union = getSourcesHelper(new UniqueEList());
				cache.put(eResource(), this, UML2Package.eINSTANCE.getDirectedRelationship_Source(), source = new UnionEObjectEList(this, UML2Package.eINSTANCE.getDirectedRelationship_Source(), union.size(), union.toArray()));
			}
			return source;
		}
		EList union = getSourcesHelper(new UniqueEList());
		return new UnionEObjectEList(this, UML2Package.eINSTANCE.getDirectedRelationship_Source(), union.size(), union.toArray());
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EList getTargetsHelper(EList target) {
		if (eIsSet(UML2Package.eINSTANCE.getInclude_Addition())) {
			target.add(getAddition());
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getTargets() {
		CacheAdapter cache = getCacheAdapter();
		if (cache != null) {
			EList target = (EList) cache.get(eResource(), this, UML2Package.eINSTANCE.getDirectedRelationship_Target());
			if (target == null) {
				EList union = getTargetsHelper(new UniqueEList());
				cache.put(eResource(), this, UML2Package.eINSTANCE.getDirectedRelationship_Target(), target = new UnionEObjectEList(this, UML2Package.eINSTANCE.getDirectedRelationship_Target(), union.size(), union.toArray()));
			}
			return target;
		}
		EList union = getTargetsHelper(new UniqueEList());
		return new UnionEObjectEList(this, UML2Package.eINSTANCE.getDirectedRelationship_Target(), union.size(), union.toArray());
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, Class baseClass, NotificationChain msgs) {
		if (featureID >= 0) {
			switch (eDerivedStructuralFeatureID(featureID, baseClass)) {
				case UML2Package.INCLUDE__EANNOTATIONS:
					return ((InternalEList)getEAnnotations()).basicAdd(otherEnd, msgs);
				case UML2Package.INCLUDE__TEMPLATE_BINDING:
					return ((InternalEList)getTemplateBindings()).basicAdd(otherEnd, msgs);
				case UML2Package.INCLUDE__OWNED_TEMPLATE_SIGNATURE:
					if (ownedTemplateSignature != null)
						msgs = ((InternalEObject)ownedTemplateSignature).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UML2Package.INCLUDE__OWNED_TEMPLATE_SIGNATURE, null, msgs);
					return basicSetOwnedTemplateSignature((TemplateSignature)otherEnd, msgs);
				case UML2Package.INCLUDE__CLIENT_DEPENDENCY:
					return ((InternalEList)getClientDependencies()).basicAdd(otherEnd, msgs);
				case UML2Package.INCLUDE__INCLUDING_CASE:
					if (eContainer != null)
						msgs = eBasicRemoveFromContainer(msgs);
					return eBasicSetContainer(otherEnd, UML2Package.INCLUDE__INCLUDING_CASE, msgs);
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
				case UML2Package.INCLUDE__EANNOTATIONS:
					return ((InternalEList)getEAnnotations()).basicRemove(otherEnd, msgs);
				case UML2Package.INCLUDE__OWNED_COMMENT:
					return ((InternalEList)getOwnedComments()).basicRemove(otherEnd, msgs);
				case UML2Package.INCLUDE__TEMPLATE_BINDING:
					return ((InternalEList)getTemplateBindings()).basicRemove(otherEnd, msgs);
				case UML2Package.INCLUDE__OWNED_TEMPLATE_SIGNATURE:
					return basicSetOwnedTemplateSignature(null, msgs);
				case UML2Package.INCLUDE__CLIENT_DEPENDENCY:
					return ((InternalEList)getClientDependencies()).basicRemove(otherEnd, msgs);
				case UML2Package.INCLUDE__NAME_EXPRESSION:
					return basicSetNameExpression(null, msgs);
				case UML2Package.INCLUDE__INCLUDING_CASE:
					return eBasicSetContainer(null, UML2Package.INCLUDE__INCLUDING_CASE, msgs);
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
				case UML2Package.INCLUDE__INCLUDING_CASE:
					return eContainer.eInverseRemove(this, UML2Package.USE_CASE__INCLUDE, UseCase.class, msgs);
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
			case UML2Package.INCLUDE__EANNOTATIONS:
				return getEAnnotations();
			case UML2Package.INCLUDE__OWNED_ELEMENT:
				return getOwnedElements();
			case UML2Package.INCLUDE__OWNER:
				if (resolve) return getOwner();
				return basicGetOwner();
			case UML2Package.INCLUDE__OWNED_COMMENT:
				return getOwnedComments();
			case UML2Package.INCLUDE__TEMPLATE_BINDING:
				return getTemplateBindings();
			case UML2Package.INCLUDE__OWNED_TEMPLATE_SIGNATURE:
				return getOwnedTemplateSignature();
			case UML2Package.INCLUDE__NAME:
				return getName();
			case UML2Package.INCLUDE__QUALIFIED_NAME:
				return getQualifiedName();
			case UML2Package.INCLUDE__VISIBILITY:
				return getVisibility();
			case UML2Package.INCLUDE__CLIENT_DEPENDENCY:
				return getClientDependencies();
			case UML2Package.INCLUDE__NAME_EXPRESSION:
				return getNameExpression();
			case UML2Package.INCLUDE__RELATED_ELEMENT:
				return getRelatedElements();
			case UML2Package.INCLUDE__SOURCE:
				return getSources();
			case UML2Package.INCLUDE__TARGET:
				return getTargets();
			case UML2Package.INCLUDE__INCLUDING_CASE:
				return getIncludingCase();
			case UML2Package.INCLUDE__ADDITION:
				if (resolve) return getAddition();
				return basicGetAddition();
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
			case UML2Package.INCLUDE__EANNOTATIONS:
				getEAnnotations().clear();
				getEAnnotations().addAll((Collection)newValue);
				return;
			case UML2Package.INCLUDE__OWNED_COMMENT:
				getOwnedComments().clear();
				getOwnedComments().addAll((Collection)newValue);
				return;
			case UML2Package.INCLUDE__TEMPLATE_BINDING:
				getTemplateBindings().clear();
				getTemplateBindings().addAll((Collection)newValue);
				return;
			case UML2Package.INCLUDE__OWNED_TEMPLATE_SIGNATURE:
				setOwnedTemplateSignature((TemplateSignature)newValue);
				return;
			case UML2Package.INCLUDE__NAME:
				setName((String)newValue);
				return;
			case UML2Package.INCLUDE__VISIBILITY:
				setVisibility((VisibilityKind)newValue);
				return;
			case UML2Package.INCLUDE__CLIENT_DEPENDENCY:
				getClientDependencies().clear();
				getClientDependencies().addAll((Collection)newValue);
				return;
			case UML2Package.INCLUDE__NAME_EXPRESSION:
				setNameExpression((StringExpression)newValue);
				return;
			case UML2Package.INCLUDE__INCLUDING_CASE:
				setIncludingCase((UseCase)newValue);
				return;
			case UML2Package.INCLUDE__ADDITION:
				setAddition((UseCase)newValue);
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
			case UML2Package.INCLUDE__EANNOTATIONS:
				getEAnnotations().clear();
				return;
			case UML2Package.INCLUDE__OWNED_COMMENT:
				getOwnedComments().clear();
				return;
			case UML2Package.INCLUDE__TEMPLATE_BINDING:
				getTemplateBindings().clear();
				return;
			case UML2Package.INCLUDE__OWNED_TEMPLATE_SIGNATURE:
				setOwnedTemplateSignature((TemplateSignature)null);
				return;
			case UML2Package.INCLUDE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case UML2Package.INCLUDE__VISIBILITY:
				setVisibility(VISIBILITY_EDEFAULT);
				return;
			case UML2Package.INCLUDE__CLIENT_DEPENDENCY:
				getClientDependencies().clear();
				return;
			case UML2Package.INCLUDE__NAME_EXPRESSION:
				setNameExpression((StringExpression)null);
				return;
			case UML2Package.INCLUDE__INCLUDING_CASE:
				setIncludingCase((UseCase)null);
				return;
			case UML2Package.INCLUDE__ADDITION:
				setAddition((UseCase)null);
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
			case UML2Package.INCLUDE__EANNOTATIONS:
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UML2Package.INCLUDE__OWNED_ELEMENT:
				return !getOwnedElements().isEmpty();
			case UML2Package.INCLUDE__OWNER:
				return basicGetOwner() != null;
			case UML2Package.INCLUDE__OWNED_COMMENT:
				return ownedComment != null && !ownedComment.isEmpty();
			case UML2Package.INCLUDE__TEMPLATE_BINDING:
				return templateBinding != null && !templateBinding.isEmpty();
			case UML2Package.INCLUDE__OWNED_TEMPLATE_SIGNATURE:
				return ownedTemplateSignature != null;
			case UML2Package.INCLUDE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case UML2Package.INCLUDE__QUALIFIED_NAME:
				return QUALIFIED_NAME_EDEFAULT == null ? getQualifiedName() != null : !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case UML2Package.INCLUDE__VISIBILITY:
				return visibility != VISIBILITY_EDEFAULT;
			case UML2Package.INCLUDE__CLIENT_DEPENDENCY:
				return clientDependency != null && !clientDependency.isEmpty();
			case UML2Package.INCLUDE__NAME_EXPRESSION:
				return nameExpression != null;
			case UML2Package.INCLUDE__RELATED_ELEMENT:
				return !getRelatedElements().isEmpty();
			case UML2Package.INCLUDE__SOURCE:
				return !getSources().isEmpty();
			case UML2Package.INCLUDE__TARGET:
				return !getTargets().isEmpty();
			case UML2Package.INCLUDE__INCLUDING_CASE:
				return getIncludingCase() != null;
			case UML2Package.INCLUDE__ADDITION:
				return addition != null;
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
				case UML2Package.INCLUDE__RELATED_ELEMENT: return UML2Package.RELATIONSHIP__RELATED_ELEMENT;
				default: return -1;
			}
		}
		if (baseClass == DirectedRelationship.class) {
			switch (derivedFeatureID) {
				case UML2Package.INCLUDE__SOURCE: return UML2Package.DIRECTED_RELATIONSHIP__SOURCE;
				case UML2Package.INCLUDE__TARGET: return UML2Package.DIRECTED_RELATIONSHIP__TARGET;
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
				case UML2Package.RELATIONSHIP__RELATED_ELEMENT: return UML2Package.INCLUDE__RELATED_ELEMENT;
				default: return -1;
			}
		}
		if (baseClass == DirectedRelationship.class) {
			switch (baseFeatureID) {
				case UML2Package.DIRECTED_RELATIONSHIP__SOURCE: return UML2Package.INCLUDE__SOURCE;
				case UML2Package.DIRECTED_RELATIONSHIP__TARGET: return UML2Package.INCLUDE__TARGET;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EList getRelatedElementsHelper(EList relatedElement) {
		EList source = getSources();
		if (!source.isEmpty()) {
			for (Iterator i = ((InternalEList) source).basicIterator(); i.hasNext(); ) {
				relatedElement.add(i.next());
			}
		}
		EList target = getTargets();
		if (!target.isEmpty()) {
			for (Iterator i = ((InternalEList) target).basicIterator(); i.hasNext(); ) {
				relatedElement.add(i.next());
			}
		}
		return relatedElement;
	}

} //IncludeImpl
