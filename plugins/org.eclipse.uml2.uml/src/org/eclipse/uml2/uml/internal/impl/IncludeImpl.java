/*
 * Copyright (c) 2005 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *
 * $Id: IncludeImpl.java,v 1.6 2005/12/01 20:04:37 khussey Exp $
 */
package org.eclipse.uml2.uml.internal.impl;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.uml2.common.util.DerivedUnionEObjectEList;

import org.eclipse.uml2.uml.DirectedRelationship;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Include;
import org.eclipse.uml2.uml.Relationship;
import org.eclipse.uml2.uml.StringExpression;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.UseCase;
import org.eclipse.uml2.uml.VisibilityKind;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Include</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.IncludeImpl#getRelatedElements <em>Related Element</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.IncludeImpl#getSources <em>Source</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.IncludeImpl#getTargets <em>Target</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.IncludeImpl#getAddition <em>Addition</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.IncludeImpl#getIncludingCase <em>Including Case</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IncludeImpl
		extends NamedElementImpl
		implements Include {

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
		return UMLPackage.Literals.INCLUDE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List getRelatedElements() {
		List relatedElement = (List) eVirtualGet(UMLPackage.INCLUDE__RELATED_ELEMENT);
		if (relatedElement == null) {
			eVirtualSet(
				UMLPackage.INCLUDE__RELATED_ELEMENT,
				relatedElement = new DerivedUnionEObjectEList(Element.class,
					this, UMLPackage.INCLUDE__RELATED_ELEMENT, new int[]{
						UMLPackage.INCLUDE__SOURCE, UMLPackage.INCLUDE__TARGET}));
		}
		return relatedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List getSources() {
		List source = (List) eVirtualGet(UMLPackage.INCLUDE__SOURCE);
		if (source == null) {
			eVirtualSet(UMLPackage.INCLUDE__SOURCE,
				source = new DerivedUnionEObjectEList(Element.class, this,
					UMLPackage.INCLUDE__SOURCE,
					new int[]{UMLPackage.INCLUDE__INCLUDING_CASE}));
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List getTargets() {
		List target = (List) eVirtualGet(UMLPackage.INCLUDE__TARGET);
		if (target == null) {
			eVirtualSet(UMLPackage.INCLUDE__TARGET,
				target = new DerivedUnionEObjectEList(Element.class, this,
					UMLPackage.INCLUDE__TARGET,
					new int[]{UMLPackage.INCLUDE__ADDITION}));
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UseCase getAddition() {
		UseCase addition = (UseCase) eVirtualGet(UMLPackage.INCLUDE__ADDITION);
		if (addition != null && addition.eIsProxy()) {
			InternalEObject oldAddition = (InternalEObject) addition;
			addition = (UseCase) eResolveProxy(oldAddition);
			if (addition != oldAddition) {
				eVirtualSet(UMLPackage.INCLUDE__ADDITION, addition);
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
						UMLPackage.INCLUDE__ADDITION, oldAddition, addition));
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
		return (UseCase) eVirtualGet(UMLPackage.INCLUDE__ADDITION);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAddition(UseCase newAddition) {
		UseCase addition = newAddition;
		Object oldAddition = eVirtualSet(UMLPackage.INCLUDE__ADDITION, addition);
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.INCLUDE__ADDITION, oldAddition == EVIRTUAL_NO_VALUE
					? null
					: oldAddition, addition));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UseCase getIncludingCase() {
		if (eContainerFeatureID != UMLPackage.INCLUDE__INCLUDING_CASE)
			return null;
		return (UseCase) eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIncludingCase(UseCase newIncludingCase) {
		if (newIncludingCase != eInternalContainer()
			|| (eContainerFeatureID != UMLPackage.INCLUDE__INCLUDING_CASE && newIncludingCase != null)) {
			if (EcoreUtil.isAncestor(this, (EObject) newIncludingCase))
				throw new IllegalArgumentException(
					"Recursive containment not allowed for " + toString()); //$NON-NLS-1$
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newIncludingCase != null)
				msgs = ((InternalEObject) newIncludingCase).eInverseAdd(this,
					UMLPackage.USE_CASE__INCLUDE, UseCase.class, msgs);
			msgs = eBasicSetContainer((InternalEObject) newIncludingCase,
				UMLPackage.INCLUDE__INCLUDING_CASE, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.INCLUDE__INCLUDING_CASE, newIncludingCase,
				newIncludingCase));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UMLPackage.INCLUDE__EANNOTATIONS :
				return ((InternalEList) getEAnnotations()).basicAdd(otherEnd,
					msgs);
			case UMLPackage.INCLUDE__CLIENT_DEPENDENCY :
				return ((InternalEList) getClientDependencies()).basicAdd(
					otherEnd, msgs);
			case UMLPackage.INCLUDE__INCLUDING_CASE :
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return eBasicSetContainer(otherEnd,
					UMLPackage.INCLUDE__INCLUDING_CASE, msgs);
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
			case UMLPackage.INCLUDE__EANNOTATIONS :
				return ((InternalEList) getEAnnotations()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.INCLUDE__OWNED_COMMENT :
				return ((InternalEList) getOwnedComments()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.INCLUDE__CLIENT_DEPENDENCY :
				return ((InternalEList) getClientDependencies()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.INCLUDE__NAME_EXPRESSION :
				return basicSetNameExpression(null, msgs);
			case UMLPackage.INCLUDE__INCLUDING_CASE :
				return eBasicSetContainer(null,
					UMLPackage.INCLUDE__INCLUDING_CASE, msgs);
		}
		return eDynamicInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eBasicRemoveFromContainerFeature(
			NotificationChain msgs) {
		switch (eContainerFeatureID) {
			case UMLPackage.INCLUDE__INCLUDING_CASE :
				return eInternalContainer().eInverseRemove(this,
					UMLPackage.USE_CASE__INCLUDE, UseCase.class, msgs);
		}
		return eDynamicBasicRemoveFromContainer(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UMLPackage.INCLUDE__EANNOTATIONS :
				return getEAnnotations();
			case UMLPackage.INCLUDE__OWNED_ELEMENT :
				return getOwnedElements();
			case UMLPackage.INCLUDE__OWNER :
				if (resolve)
					return getOwner();
				return basicGetOwner();
			case UMLPackage.INCLUDE__OWNED_COMMENT :
				return getOwnedComments();
			case UMLPackage.INCLUDE__NAME :
				return getName();
			case UMLPackage.INCLUDE__VISIBILITY :
				return getVisibility();
			case UMLPackage.INCLUDE__QUALIFIED_NAME :
				return getQualifiedName();
			case UMLPackage.INCLUDE__CLIENT_DEPENDENCY :
				return getClientDependencies();
			case UMLPackage.INCLUDE__NAMESPACE :
				if (resolve)
					return getNamespace();
				return basicGetNamespace();
			case UMLPackage.INCLUDE__NAME_EXPRESSION :
				return getNameExpression();
			case UMLPackage.INCLUDE__RELATED_ELEMENT :
				return getRelatedElements();
			case UMLPackage.INCLUDE__SOURCE :
				return getSources();
			case UMLPackage.INCLUDE__TARGET :
				return getTargets();
			case UMLPackage.INCLUDE__ADDITION :
				if (resolve)
					return getAddition();
				return basicGetAddition();
			case UMLPackage.INCLUDE__INCLUDING_CASE :
				return getIncludingCase();
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
			case UMLPackage.INCLUDE__EANNOTATIONS :
				getEAnnotations().clear();
				getEAnnotations().addAll((Collection) newValue);
				return;
			case UMLPackage.INCLUDE__OWNED_COMMENT :
				getOwnedComments().clear();
				getOwnedComments().addAll((Collection) newValue);
				return;
			case UMLPackage.INCLUDE__NAME :
				setName((String) newValue);
				return;
			case UMLPackage.INCLUDE__VISIBILITY :
				setVisibility((VisibilityKind) newValue);
				return;
			case UMLPackage.INCLUDE__CLIENT_DEPENDENCY :
				getClientDependencies().clear();
				getClientDependencies().addAll((Collection) newValue);
				return;
			case UMLPackage.INCLUDE__NAME_EXPRESSION :
				setNameExpression((StringExpression) newValue);
				return;
			case UMLPackage.INCLUDE__ADDITION :
				setAddition((UseCase) newValue);
				return;
			case UMLPackage.INCLUDE__INCLUDING_CASE :
				setIncludingCase((UseCase) newValue);
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
			case UMLPackage.INCLUDE__EANNOTATIONS :
				getEAnnotations().clear();
				return;
			case UMLPackage.INCLUDE__OWNED_COMMENT :
				getOwnedComments().clear();
				return;
			case UMLPackage.INCLUDE__NAME :
				setName(NAME_EDEFAULT);
				return;
			case UMLPackage.INCLUDE__VISIBILITY :
				setVisibility(VISIBILITY_EDEFAULT);
				return;
			case UMLPackage.INCLUDE__CLIENT_DEPENDENCY :
				getClientDependencies().clear();
				return;
			case UMLPackage.INCLUDE__NAME_EXPRESSION :
				setNameExpression((StringExpression) null);
				return;
			case UMLPackage.INCLUDE__ADDITION :
				setAddition((UseCase) null);
				return;
			case UMLPackage.INCLUDE__INCLUDING_CASE :
				setIncludingCase((UseCase) null);
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
			case UMLPackage.INCLUDE__EANNOTATIONS :
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UMLPackage.INCLUDE__OWNED_ELEMENT :
				return isSetOwnedElements();
			case UMLPackage.INCLUDE__OWNER :
				return isSetOwner();
			case UMLPackage.INCLUDE__OWNED_COMMENT :
				List ownedComment = (List) eVirtualGet(UMLPackage.INCLUDE__OWNED_COMMENT);
				return ownedComment != null && !ownedComment.isEmpty();
			case UMLPackage.INCLUDE__NAME :
				String name = (String) eVirtualGet(UMLPackage.INCLUDE__NAME,
					NAME_EDEFAULT);
				return NAME_EDEFAULT == null
					? name != null
					: !NAME_EDEFAULT.equals(name);
			case UMLPackage.INCLUDE__VISIBILITY :
				return eVirtualGet(UMLPackage.INCLUDE__VISIBILITY,
					VISIBILITY_EDEFAULT) != VISIBILITY_EDEFAULT;
			case UMLPackage.INCLUDE__QUALIFIED_NAME :
				return QUALIFIED_NAME_EDEFAULT == null
					? getQualifiedName() != null
					: !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case UMLPackage.INCLUDE__CLIENT_DEPENDENCY :
				List clientDependency = (List) eVirtualGet(UMLPackage.INCLUDE__CLIENT_DEPENDENCY);
				return clientDependency != null && !clientDependency.isEmpty();
			case UMLPackage.INCLUDE__NAMESPACE :
				return isSetNamespace();
			case UMLPackage.INCLUDE__NAME_EXPRESSION :
				return eVirtualGet(UMLPackage.INCLUDE__NAME_EXPRESSION) != null;
			case UMLPackage.INCLUDE__RELATED_ELEMENT :
				return isSetRelatedElements();
			case UMLPackage.INCLUDE__SOURCE :
				return isSetSources();
			case UMLPackage.INCLUDE__TARGET :
				return isSetTargets();
			case UMLPackage.INCLUDE__ADDITION :
				return eVirtualGet(UMLPackage.INCLUDE__ADDITION) != null;
			case UMLPackage.INCLUDE__INCLUDING_CASE :
				return getIncludingCase() != null;
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
				case UMLPackage.INCLUDE__RELATED_ELEMENT :
					return UMLPackage.RELATIONSHIP__RELATED_ELEMENT;
				default :
					return -1;
			}
		}
		if (baseClass == DirectedRelationship.class) {
			switch (derivedFeatureID) {
				case UMLPackage.INCLUDE__SOURCE :
					return UMLPackage.DIRECTED_RELATIONSHIP__SOURCE;
				case UMLPackage.INCLUDE__TARGET :
					return UMLPackage.DIRECTED_RELATIONSHIP__TARGET;
				default :
					return -1;
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
				case UMLPackage.RELATIONSHIP__RELATED_ELEMENT :
					return UMLPackage.INCLUDE__RELATED_ELEMENT;
				default :
					return -1;
			}
		}
		if (baseClass == DirectedRelationship.class) {
			switch (baseFeatureID) {
				case UMLPackage.DIRECTED_RELATIONSHIP__SOURCE :
					return UMLPackage.INCLUDE__SOURCE;
				case UMLPackage.DIRECTED_RELATIONSHIP__TARGET :
					return UMLPackage.INCLUDE__TARGET;
				default :
					return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRelatedElements() {
		return isSetSources() || isSetTargets();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSources() {
		return eIsSet(UMLPackage.INCLUDE__INCLUDING_CASE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTargets() {
		return eIsSet(UMLPackage.INCLUDE__ADDITION);
	}

} //IncludeImpl
