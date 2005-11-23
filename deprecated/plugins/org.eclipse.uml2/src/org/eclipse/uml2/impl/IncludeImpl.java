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
 * $Id: IncludeImpl.java,v 1.21 2005/11/23 20:05:09 khussey Exp $
 */
package org.eclipse.uml2.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.uml2.DirectedRelationship;
import org.eclipse.uml2.Element;
import org.eclipse.uml2.Include;
import org.eclipse.uml2.Relationship;
import org.eclipse.uml2.StringExpression;
import org.eclipse.uml2.TemplateSignature;
import org.eclipse.uml2.UML2Package;
import org.eclipse.uml2.UseCase;
import org.eclipse.uml2.VisibilityKind;

import org.eclipse.uml2.common.util.DerivedUnionEObjectEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Include</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2.impl.IncludeImpl#getRelatedElements <em>Related Element</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.IncludeImpl#getSources <em>Source</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.IncludeImpl#getTargets <em>Target</em>}</li>
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
		return UML2Package.Literals.INCLUDE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getRelatedElements() {
		EList relatedElement = (EList)eVirtualGet(UML2Package.INCLUDE__RELATED_ELEMENT);
		if (relatedElement == null) {
			eVirtualSet(UML2Package.INCLUDE__RELATED_ELEMENT, relatedElement = new DerivedUnionEObjectEList(Element.class, this, UML2Package.INCLUDE__RELATED_ELEMENT, new int[] {UML2Package.INCLUDE__SOURCE, UML2Package.INCLUDE__TARGET}));
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
	public UseCase getIncludingCase() {
		if (eContainerFeatureID != UML2Package.INCLUDE__INCLUDING_CASE) return null;
		return (UseCase)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIncludingCase(UseCase newIncludingCase) {
		if (newIncludingCase != eInternalContainer() || (eContainerFeatureID != UML2Package.INCLUDE__INCLUDING_CASE && newIncludingCase != null)) {
			if (EcoreUtil.isAncestor(this, newIncludingCase))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString()); //$NON-NLS-1$
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
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
		UseCase addition = (UseCase)eVirtualGet(UML2Package.INCLUDE__ADDITION);
		if (addition != null && addition.eIsProxy()) {
			InternalEObject oldAddition = (InternalEObject)addition;
			addition = (UseCase)eResolveProxy(oldAddition);
			if (addition != oldAddition) {
				eVirtualSet(UML2Package.INCLUDE__ADDITION, addition);
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
		return (UseCase)eVirtualGet(UML2Package.INCLUDE__ADDITION);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAddition(UseCase newAddition) {
		UseCase addition = newAddition;
		Object oldAddition = eVirtualSet(UML2Package.INCLUDE__ADDITION, addition);
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2Package.INCLUDE__ADDITION, oldAddition == EVIRTUAL_NO_VALUE ? null : oldAddition, addition));

	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getSources() {
		EList source = (EList)eVirtualGet(UML2Package.INCLUDE__SOURCE);
		if (source == null) {
			eVirtualSet(UML2Package.INCLUDE__SOURCE, source = new DerivedUnionEObjectEList(Element.class, this, UML2Package.INCLUDE__SOURCE, new int[] {UML2Package.INCLUDE__INCLUDING_CASE}));
		}
		return source;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSources() {
		return eIsSet(UML2Package.INCLUDE__INCLUDING_CASE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getTargets() {
		EList target = (EList)eVirtualGet(UML2Package.INCLUDE__TARGET);
		if (target == null) {
			eVirtualSet(UML2Package.INCLUDE__TARGET, target = new DerivedUnionEObjectEList(Element.class, this, UML2Package.INCLUDE__TARGET, new int[] {UML2Package.INCLUDE__ADDITION}));
		}
		return target;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTargets() {
		return eIsSet(UML2Package.INCLUDE__ADDITION);
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
					TemplateSignature ownedTemplateSignature = (TemplateSignature)eVirtualGet(UML2Package.INCLUDE__OWNED_TEMPLATE_SIGNATURE);
					if (ownedTemplateSignature != null)
						msgs = ((InternalEObject)ownedTemplateSignature).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UML2Package.INCLUDE__OWNED_TEMPLATE_SIGNATURE, null, msgs);
					return basicSetOwnedTemplateSignature((TemplateSignature)otherEnd, msgs);
				case UML2Package.INCLUDE__CLIENT_DEPENDENCY:
					return ((InternalEList)getClientDependencies()).basicAdd(otherEnd, msgs);
				case UML2Package.INCLUDE__INCLUDING_CASE:
					if (eInternalContainer() != null)
						msgs = eBasicRemoveFromContainer(msgs);
					return eBasicSetContainer(otherEnd, UML2Package.INCLUDE__INCLUDING_CASE, msgs);
				default:
					return eDynamicInverseAdd(otherEnd, featureID, baseClass, msgs);
			}
		}
		if (eInternalContainer() != null)
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
					return eInternalContainer().eInverseRemove(this, UML2Package.USE_CASE__INCLUDE, UseCase.class, msgs);
				default:
					return eDynamicBasicRemoveFromContainer(msgs);
			}
		}
		return eInternalContainer().eInverseRemove(this, EOPPOSITE_FEATURE_BASE - eContainerFeatureID, null, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
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
		return eDynamicGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
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
		eDynamicSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eUnset(int featureID) {
		switch (featureID) {
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
		eDynamicUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case UML2Package.INCLUDE__EANNOTATIONS:
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UML2Package.INCLUDE__OWNED_ELEMENT:
				return isSetOwnedElements();
			case UML2Package.INCLUDE__OWNER:
				return isSetOwner();
			case UML2Package.INCLUDE__OWNED_COMMENT:
				EList ownedComment = (EList)eVirtualGet(UML2Package.INCLUDE__OWNED_COMMENT);
				return ownedComment != null && !ownedComment.isEmpty();
			case UML2Package.INCLUDE__TEMPLATE_BINDING:
				EList templateBinding = (EList)eVirtualGet(UML2Package.INCLUDE__TEMPLATE_BINDING);
				return templateBinding != null && !templateBinding.isEmpty();
			case UML2Package.INCLUDE__OWNED_TEMPLATE_SIGNATURE:
				return eVirtualGet(UML2Package.INCLUDE__OWNED_TEMPLATE_SIGNATURE) != null;
			case UML2Package.INCLUDE__NAME:
				String name = (String)eVirtualGet(UML2Package.INCLUDE__NAME, NAME_EDEFAULT);
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case UML2Package.INCLUDE__QUALIFIED_NAME:
				return QUALIFIED_NAME_EDEFAULT == null ? getQualifiedName() != null : !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case UML2Package.INCLUDE__VISIBILITY:
				return eVirtualGet(UML2Package.INCLUDE__VISIBILITY, VISIBILITY_EDEFAULT) != VISIBILITY_EDEFAULT;
			case UML2Package.INCLUDE__CLIENT_DEPENDENCY:
				EList clientDependency = (EList)eVirtualGet(UML2Package.INCLUDE__CLIENT_DEPENDENCY);
				return clientDependency != null && !clientDependency.isEmpty();
			case UML2Package.INCLUDE__NAME_EXPRESSION:
				return eVirtualGet(UML2Package.INCLUDE__NAME_EXPRESSION) != null;
			case UML2Package.INCLUDE__RELATED_ELEMENT:
				return isSetRelatedElements();
			case UML2Package.INCLUDE__SOURCE:
				return isSetSources();
			case UML2Package.INCLUDE__TARGET:
				return isSetTargets();
			case UML2Package.INCLUDE__INCLUDING_CASE:
				return getIncludingCase() != null;
			case UML2Package.INCLUDE__ADDITION:
				return eVirtualGet(UML2Package.INCLUDE__ADDITION) != null;
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


} //IncludeImpl
