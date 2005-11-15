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
 * $Id: ExtendImpl.java,v 1.1 2005/11/14 22:26:06 khussey Exp $
 */
package org.eclipse.uml2.uml.internal.impl;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.uml2.common.util.DerivedUnionEObjectEList;

import org.eclipse.uml2.uml.Constraint;
import org.eclipse.uml2.uml.DirectedRelationship;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Extend;
import org.eclipse.uml2.uml.ExtensionPoint;
import org.eclipse.uml2.uml.Relationship;
import org.eclipse.uml2.uml.StringExpression;
import org.eclipse.uml2.uml.UMLFactory;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.UseCase;
import org.eclipse.uml2.uml.VisibilityKind;

import org.eclipse.uml2.uml.internal.operations.ExtendOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Extend</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ExtendImpl#getRelatedElements <em>Related Element</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ExtendImpl#getSources <em>Source</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ExtendImpl#getTargets <em>Target</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ExtendImpl#getOwnedElements <em>Owned Element</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ExtendImpl#getExtendedCase <em>Extended Case</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ExtendImpl#getCondition <em>Condition</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ExtendImpl#getExtensionLocations <em>Extension Location</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ExtendImpl#getExtension <em>Extension</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExtendImpl
		extends NamedElementImpl
		implements Extend {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExtendImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return UMLPackage.eINSTANCE.getExtend();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List getRelatedElements() {
		List relatedElement = (List) eVirtualGet(UMLPackage.EXTEND__RELATED_ELEMENT);
		if (relatedElement == null) {
			eVirtualSet(UMLPackage.EXTEND__RELATED_ELEMENT,
				relatedElement = new DerivedUnionEObjectEList(Element.class,
					this, UMLPackage.EXTEND__RELATED_ELEMENT,
					new EStructuralFeature[]{
						UMLPackage.eINSTANCE.getDirectedRelationship_Source(),
						UMLPackage.eINSTANCE.getDirectedRelationship_Target()}));
		}
		return relatedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List getSources() {
		List source = (List) eVirtualGet(UMLPackage.EXTEND__SOURCE);
		if (source == null) {
			eVirtualSet(UMLPackage.EXTEND__SOURCE,
				source = new DerivedUnionEObjectEList(Element.class, this,
					UMLPackage.EXTEND__SOURCE,
					new EStructuralFeature[]{UMLPackage.eINSTANCE
						.getExtend_Extension()}));
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List getTargets() {
		List target = (List) eVirtualGet(UMLPackage.EXTEND__TARGET);
		if (target == null) {
			eVirtualSet(UMLPackage.EXTEND__TARGET,
				target = new DerivedUnionEObjectEList(Element.class, this,
					UMLPackage.EXTEND__TARGET,
					new EStructuralFeature[]{UMLPackage.eINSTANCE
						.getExtend_ExtendedCase()}));
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List getOwnedElements() {
		List ownedElement = (List) eVirtualGet(UMLPackage.EXTEND__OWNED_ELEMENT);
		if (ownedElement == null) {
			eVirtualSet(UMLPackage.EXTEND__OWNED_ELEMENT,
				ownedElement = new DerivedUnionEObjectEList(Element.class,
					this, UMLPackage.EXTEND__OWNED_ELEMENT,
					new EStructuralFeature[]{
						UMLPackage.eINSTANCE.getElement_OwnedComment(),
						UMLPackage.eINSTANCE.getNamedElement_NameExpression(),
						UMLPackage.eINSTANCE.getExtend_Condition()}));
		}
		return ownedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UseCase getExtendedCase() {
		UseCase extendedCase = (UseCase) eVirtualGet(UMLPackage.EXTEND__EXTENDED_CASE);
		if (extendedCase != null && extendedCase.eIsProxy()) {
			UseCase oldExtendedCase = extendedCase;
			extendedCase = (UseCase) eResolveProxy((InternalEObject) extendedCase);
			if (extendedCase != oldExtendedCase) {
				eVirtualSet(UMLPackage.EXTEND__EXTENDED_CASE, extendedCase);
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
						UMLPackage.EXTEND__EXTENDED_CASE, oldExtendedCase,
						extendedCase));
			}
		}
		return extendedCase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UseCase basicGetExtendedCase() {
		return (UseCase) eVirtualGet(UMLPackage.EXTEND__EXTENDED_CASE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExtendedCase(UseCase newExtendedCase) {
		UseCase extendedCase = newExtendedCase;
		Object oldExtendedCase = eVirtualSet(UMLPackage.EXTEND__EXTENDED_CASE,
			extendedCase);
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.EXTEND__EXTENDED_CASE,
				oldExtendedCase == EVIRTUAL_NO_VALUE
					? null
					: oldExtendedCase, extendedCase));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Constraint getCondition() {
		Constraint condition = (Constraint) eVirtualGet(UMLPackage.EXTEND__CONDITION);
		return condition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCondition(Constraint newCondition,
			NotificationChain msgs) {
		Object oldCondition = eVirtualSet(UMLPackage.EXTEND__CONDITION,
			newCondition);
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
				Notification.SET, UMLPackage.EXTEND__CONDITION,
				oldCondition == EVIRTUAL_NO_VALUE
					? null
					: oldCondition, newCondition);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}

		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCondition(Constraint newCondition) {
		Constraint condition = (Constraint) eVirtualGet(UMLPackage.EXTEND__CONDITION);
		if (newCondition != condition) {
			NotificationChain msgs = null;
			if (condition != null)
				msgs = ((InternalEObject) condition).eInverseRemove(this,
					EOPPOSITE_FEATURE_BASE - UMLPackage.EXTEND__CONDITION,
					null, msgs);
			if (newCondition != null)
				msgs = ((InternalEObject) newCondition).eInverseAdd(this,
					EOPPOSITE_FEATURE_BASE - UMLPackage.EXTEND__CONDITION,
					null, msgs);
			msgs = basicSetCondition(newCondition, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.EXTEND__CONDITION, newCondition, newCondition));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Constraint createCondition(EClass eClass) {
		Constraint newCondition = (Constraint) eClass.getEPackage()
			.getEFactoryInstance().create(eClass);
		setCondition(newCondition);
		return newCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Constraint createCondition() {
		Constraint newCondition = UMLFactory.eINSTANCE.createConstraint();
		setCondition(newCondition);
		return newCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List getExtensionLocations() {
		List extensionLocation = (List) eVirtualGet(UMLPackage.EXTEND__EXTENSION_LOCATION);
		if (extensionLocation == null) {
			eVirtualSet(UMLPackage.EXTEND__EXTENSION_LOCATION,
				extensionLocation = new EObjectResolvingEList(
					ExtensionPoint.class, this,
					UMLPackage.EXTEND__EXTENSION_LOCATION));
		}
		return extensionLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExtensionPoint getExtensionLocation(String name) {
		for (Iterator i = getExtensionLocations().iterator(); i.hasNext();) {
			ExtensionPoint extensionLocation = (ExtensionPoint) i.next();
			if (name.equals(extensionLocation.getName())) {
				return extensionLocation;
			}
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UseCase getExtension() {
		if (eContainerFeatureID != UMLPackage.EXTEND__EXTENSION)
			return null;
		return (UseCase) eContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExtension(UseCase newExtension) {
		if (newExtension != eContainer
			|| (eContainerFeatureID != UMLPackage.EXTEND__EXTENSION && newExtension != null)) {
			if (EcoreUtil.isAncestor(this, (EObject) newExtension))
				throw new IllegalArgumentException(
					"Recursive containment not allowed for " + toString()); //$NON-NLS-1$
			NotificationChain msgs = null;
			if (eContainer != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newExtension != null)
				msgs = ((InternalEObject) newExtension).eInverseAdd(this,
					UMLPackage.USE_CASE__EXTEND, UseCase.class, msgs);
			msgs = eBasicSetContainer((InternalEObject) newExtension,
				UMLPackage.EXTEND__EXTENSION, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.EXTEND__EXTENSION, newExtension, newExtension));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExtensionPoints(DiagnosticChain diagnostics,
			Map context) {
		return ExtendOperations.validateExtensionPoints(this, diagnostics,
			context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd,
			int featureID, Class baseClass, NotificationChain msgs) {
		if (featureID >= 0) {
			switch (eDerivedStructuralFeatureID(featureID, baseClass)) {
				case UMLPackage.EXTEND__EANNOTATIONS :
					return ((InternalEList) getEAnnotations()).basicAdd(
						otherEnd, msgs);
				case UMLPackage.EXTEND__CLIENT_DEPENDENCY :
					return ((InternalEList) getClientDependencies()).basicAdd(
						otherEnd, msgs);
				case UMLPackage.EXTEND__EXTENSION :
					if (eContainer != null)
						msgs = eBasicRemoveFromContainer(msgs);
					return eBasicSetContainer(otherEnd,
						UMLPackage.EXTEND__EXTENSION, msgs);
				default :
					return eDynamicInverseAdd(otherEnd, featureID, baseClass,
						msgs);
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
	public NotificationChain eInverseRemove(InternalEObject otherEnd,
			int featureID, Class baseClass, NotificationChain msgs) {
		if (featureID >= 0) {
			switch (eDerivedStructuralFeatureID(featureID, baseClass)) {
				case UMLPackage.EXTEND__EANNOTATIONS :
					return ((InternalEList) getEAnnotations()).basicRemove(
						otherEnd, msgs);
				case UMLPackage.EXTEND__OWNED_COMMENT :
					return ((InternalEList) getOwnedComments()).basicRemove(
						otherEnd, msgs);
				case UMLPackage.EXTEND__CLIENT_DEPENDENCY :
					return ((InternalEList) getClientDependencies())
						.basicRemove(otherEnd, msgs);
				case UMLPackage.EXTEND__NAME_EXPRESSION :
					return basicSetNameExpression(null, msgs);
				case UMLPackage.EXTEND__CONDITION :
					return basicSetCondition(null, msgs);
				case UMLPackage.EXTEND__EXTENSION :
					return eBasicSetContainer(null,
						UMLPackage.EXTEND__EXTENSION, msgs);
				default :
					return eDynamicInverseRemove(otherEnd, featureID,
						baseClass, msgs);
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
				case UMLPackage.EXTEND__EXTENSION :
					return eContainer.eInverseRemove(this,
						UMLPackage.USE_CASE__EXTEND, UseCase.class, msgs);
				default :
					return eDynamicBasicRemoveFromContainer(msgs);
			}
		}
		return eContainer.eInverseRemove(this, EOPPOSITE_FEATURE_BASE
			- eContainerFeatureID, null, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(EStructuralFeature eFeature, boolean resolve) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case UMLPackage.EXTEND__EANNOTATIONS :
				return getEAnnotations();
			case UMLPackage.EXTEND__OWNED_ELEMENT :
				return getOwnedElements();
			case UMLPackage.EXTEND__OWNER :
				if (resolve)
					return getOwner();
				return basicGetOwner();
			case UMLPackage.EXTEND__OWNED_COMMENT :
				return getOwnedComments();
			case UMLPackage.EXTEND__NAME :
				return getName();
			case UMLPackage.EXTEND__VISIBILITY :
				return getVisibility();
			case UMLPackage.EXTEND__QUALIFIED_NAME :
				return getQualifiedName();
			case UMLPackage.EXTEND__CLIENT_DEPENDENCY :
				return getClientDependencies();
			case UMLPackage.EXTEND__NAMESPACE :
				if (resolve)
					return getNamespace();
				return basicGetNamespace();
			case UMLPackage.EXTEND__NAME_EXPRESSION :
				return getNameExpression();
			case UMLPackage.EXTEND__RELATED_ELEMENT :
				return getRelatedElements();
			case UMLPackage.EXTEND__SOURCE :
				return getSources();
			case UMLPackage.EXTEND__TARGET :
				return getTargets();
			case UMLPackage.EXTEND__EXTENDED_CASE :
				if (resolve)
					return getExtendedCase();
				return basicGetExtendedCase();
			case UMLPackage.EXTEND__CONDITION :
				return getCondition();
			case UMLPackage.EXTEND__EXTENSION_LOCATION :
				return getExtensionLocations();
			case UMLPackage.EXTEND__EXTENSION :
				return getExtension();
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
			case UMLPackage.EXTEND__EANNOTATIONS :
				getEAnnotations().clear();
				getEAnnotations().addAll((Collection) newValue);
				return;
			case UMLPackage.EXTEND__OWNED_COMMENT :
				getOwnedComments().clear();
				getOwnedComments().addAll((Collection) newValue);
				return;
			case UMLPackage.EXTEND__NAME :
				setName((String) newValue);
				return;
			case UMLPackage.EXTEND__VISIBILITY :
				setVisibility((VisibilityKind) newValue);
				return;
			case UMLPackage.EXTEND__CLIENT_DEPENDENCY :
				getClientDependencies().clear();
				getClientDependencies().addAll((Collection) newValue);
				return;
			case UMLPackage.EXTEND__NAME_EXPRESSION :
				setNameExpression((StringExpression) newValue);
				return;
			case UMLPackage.EXTEND__EXTENDED_CASE :
				setExtendedCase((UseCase) newValue);
				return;
			case UMLPackage.EXTEND__CONDITION :
				setCondition((Constraint) newValue);
				return;
			case UMLPackage.EXTEND__EXTENSION_LOCATION :
				getExtensionLocations().clear();
				getExtensionLocations().addAll((Collection) newValue);
				return;
			case UMLPackage.EXTEND__EXTENSION :
				setExtension((UseCase) newValue);
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
			case UMLPackage.EXTEND__EANNOTATIONS :
				getEAnnotations().clear();
				return;
			case UMLPackage.EXTEND__OWNED_COMMENT :
				getOwnedComments().clear();
				return;
			case UMLPackage.EXTEND__NAME :
				setName(NAME_EDEFAULT);
				return;
			case UMLPackage.EXTEND__VISIBILITY :
				setVisibility(VISIBILITY_EDEFAULT);
				return;
			case UMLPackage.EXTEND__CLIENT_DEPENDENCY :
				getClientDependencies().clear();
				return;
			case UMLPackage.EXTEND__NAME_EXPRESSION :
				setNameExpression((StringExpression) null);
				return;
			case UMLPackage.EXTEND__EXTENDED_CASE :
				setExtendedCase((UseCase) null);
				return;
			case UMLPackage.EXTEND__CONDITION :
				setCondition((Constraint) null);
				return;
			case UMLPackage.EXTEND__EXTENSION_LOCATION :
				getExtensionLocations().clear();
				return;
			case UMLPackage.EXTEND__EXTENSION :
				setExtension((UseCase) null);
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
			case UMLPackage.EXTEND__EANNOTATIONS :
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UMLPackage.EXTEND__OWNED_ELEMENT :
				return isSetOwnedElements();
			case UMLPackage.EXTEND__OWNER :
				return isSetOwner();
			case UMLPackage.EXTEND__OWNED_COMMENT :
				List ownedComment = (List) eVirtualGet(UMLPackage.EXTEND__OWNED_COMMENT);
				return ownedComment != null && !ownedComment.isEmpty();
			case UMLPackage.EXTEND__NAME :
				String name = eVirtualIsSet(UMLPackage.EXTEND__NAME)
					? (String) eVirtualGet(UMLPackage.EXTEND__NAME)
					: NAME_EDEFAULT;
				return NAME_EDEFAULT == null
					? name != null
					: !NAME_EDEFAULT.equals(name);
			case UMLPackage.EXTEND__VISIBILITY :
				return eVirtualIsSet(UMLPackage.EXTEND__VISIBILITY)
					&& eVirtualGet(UMLPackage.EXTEND__VISIBILITY) != VISIBILITY_EDEFAULT;
			case UMLPackage.EXTEND__QUALIFIED_NAME :
				return QUALIFIED_NAME_EDEFAULT == null
					? getQualifiedName() != null
					: !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case UMLPackage.EXTEND__CLIENT_DEPENDENCY :
				List clientDependency = (List) eVirtualGet(UMLPackage.EXTEND__CLIENT_DEPENDENCY);
				return clientDependency != null && !clientDependency.isEmpty();
			case UMLPackage.EXTEND__NAMESPACE :
				return isSetNamespace();
			case UMLPackage.EXTEND__NAME_EXPRESSION :
				return eVirtualGet(UMLPackage.EXTEND__NAME_EXPRESSION) != null;
			case UMLPackage.EXTEND__RELATED_ELEMENT :
				return isSetRelatedElements();
			case UMLPackage.EXTEND__SOURCE :
				return isSetSources();
			case UMLPackage.EXTEND__TARGET :
				return isSetTargets();
			case UMLPackage.EXTEND__EXTENDED_CASE :
				return eVirtualGet(UMLPackage.EXTEND__EXTENDED_CASE) != null;
			case UMLPackage.EXTEND__CONDITION :
				return eVirtualGet(UMLPackage.EXTEND__CONDITION) != null;
			case UMLPackage.EXTEND__EXTENSION_LOCATION :
				List extensionLocation = (List) eVirtualGet(UMLPackage.EXTEND__EXTENSION_LOCATION);
				return extensionLocation != null
					&& !extensionLocation.isEmpty();
			case UMLPackage.EXTEND__EXTENSION :
				return getExtension() != null;
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
				case UMLPackage.EXTEND__RELATED_ELEMENT :
					return UMLPackage.RELATIONSHIP__RELATED_ELEMENT;
				default :
					return -1;
			}
		}
		if (baseClass == DirectedRelationship.class) {
			switch (derivedFeatureID) {
				case UMLPackage.EXTEND__SOURCE :
					return UMLPackage.DIRECTED_RELATIONSHIP__SOURCE;
				case UMLPackage.EXTEND__TARGET :
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
					return UMLPackage.EXTEND__RELATED_ELEMENT;
				default :
					return -1;
			}
		}
		if (baseClass == DirectedRelationship.class) {
			switch (baseFeatureID) {
				case UMLPackage.DIRECTED_RELATIONSHIP__SOURCE :
					return UMLPackage.EXTEND__SOURCE;
				case UMLPackage.DIRECTED_RELATIONSHIP__TARGET :
					return UMLPackage.EXTEND__TARGET;
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
		return eIsSet(UMLPackage.eINSTANCE.getExtend_Extension());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTargets() {
		return eIsSet(UMLPackage.eINSTANCE.getExtend_ExtendedCase());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOwnedElements() {
		return super.isSetOwnedElements()
			|| eIsSet(UMLPackage.eINSTANCE.getExtend_Condition());
	}

} //ExtendImpl