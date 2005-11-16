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
 * $Id: NamedElementImpl.java,v 1.2 2005/11/16 19:03:04 khussey Exp $
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
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.uml2.common.util.CacheAdapter;
import org.eclipse.uml2.common.util.DerivedUnionEObjectEList;

import org.eclipse.uml2.uml.Dependency;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Namespace;
import org.eclipse.uml2.uml.StringExpression;
import org.eclipse.uml2.uml.UMLFactory;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.VisibilityKind;

import org.eclipse.uml2.uml.internal.operations.NamedElementOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Named Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.NamedElementImpl#getOwnedElements <em>Owned Element</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.NamedElementImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.NamedElementImpl#getVisibility <em>Visibility</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.NamedElementImpl#getQualifiedName <em>Qualified Name</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.NamedElementImpl#getClientDependencies <em>Client Dependency</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.NamedElementImpl#getNameExpression <em>Name Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class NamedElementImpl
		extends ElementImpl
		implements NamedElement {

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getVisibility() <em>Visibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVisibility()
	 * @generated
	 * @ordered
	 */
	protected static final VisibilityKind VISIBILITY_EDEFAULT = VisibilityKind.PUBLIC_LITERAL;

	/**
	 * The default value of the '{@link #getQualifiedName() <em>Qualified Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQualifiedName()
	 * @generated
	 * @ordered
	 */
	protected static final String QUALIFIED_NAME_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NamedElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return UMLPackage.eINSTANCE.getNamedElement();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List getOwnedElements() {
		List ownedElement = (List) eVirtualGet(UMLPackage.NAMED_ELEMENT__OWNED_ELEMENT);
		if (ownedElement == null) {
			eVirtualSet(UMLPackage.NAMED_ELEMENT__OWNED_ELEMENT,
				ownedElement = new DerivedUnionEObjectEList(Element.class,
					this, UMLPackage.NAMED_ELEMENT__OWNED_ELEMENT,
					new EStructuralFeature[]{
						UMLPackage.eINSTANCE.getElement_OwnedComment(),
						UMLPackage.eINSTANCE.getNamedElement_NameExpression()}));
		}
		return ownedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		String name = (String) eVirtualGet(UMLPackage.NAMED_ELEMENT__NAME);
		return name == null
			? NAME_EDEFAULT
			: name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		newName = newName == null
			? NAME_EDEFAULT
			: newName;
		String name = newName;
		Object oldName = eVirtualSet(UMLPackage.NAMED_ELEMENT__NAME, name);
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.NAMED_ELEMENT__NAME, oldName == EVIRTUAL_NO_VALUE
					? NAME_EDEFAULT
					: oldName, name));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VisibilityKind getVisibility() {
		VisibilityKind visibility = (VisibilityKind) eVirtualGet(UMLPackage.NAMED_ELEMENT__VISIBILITY);
		return visibility == null
			? VISIBILITY_EDEFAULT
			: visibility;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVisibility(VisibilityKind newVisibility) {
		VisibilityKind visibility = newVisibility == null
			? VISIBILITY_EDEFAULT
			: newVisibility;
		Object oldVisibility = eVirtualSet(
			UMLPackage.NAMED_ELEMENT__VISIBILITY, visibility);
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.NAMED_ELEMENT__VISIBILITY,
				oldVisibility == EVIRTUAL_NO_VALUE
					? VISIBILITY_EDEFAULT
					: oldVisibility, visibility));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getQualifiedName() {
		return NamedElementOperations.getQualifiedName(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List getClientDependencies() {
		List clientDependency = (List) eVirtualGet(UMLPackage.NAMED_ELEMENT__CLIENT_DEPENDENCY);
		if (clientDependency == null) {
			eVirtualSet(
				UMLPackage.NAMED_ELEMENT__CLIENT_DEPENDENCY,
				clientDependency = new EObjectWithInverseResolvingEList.ManyInverse(
					Dependency.class, this,
					UMLPackage.NAMED_ELEMENT__CLIENT_DEPENDENCY,
					UMLPackage.DEPENDENCY__CLIENT));
		}
		return clientDependency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Dependency getClientDependency(String name) {
		for (Iterator i = getClientDependencies().iterator(); i.hasNext();) {
			Dependency clientDependency = (Dependency) i.next();
			if (name.equals(clientDependency.getName())) {
				return clientDependency;
			}
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StringExpression getNameExpression() {
		StringExpression nameExpression = (StringExpression) eVirtualGet(UMLPackage.NAMED_ELEMENT__NAME_EXPRESSION);
		return nameExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNameExpression(
			StringExpression newNameExpression, NotificationChain msgs) {
		Object oldNameExpression = eVirtualSet(
			UMLPackage.NAMED_ELEMENT__NAME_EXPRESSION, newNameExpression);
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
				Notification.SET, UMLPackage.NAMED_ELEMENT__NAME_EXPRESSION,
				oldNameExpression == EVIRTUAL_NO_VALUE
					? null
					: oldNameExpression, newNameExpression);
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
	public void setNameExpression(StringExpression newNameExpression) {
		StringExpression nameExpression = (StringExpression) eVirtualGet(UMLPackage.NAMED_ELEMENT__NAME_EXPRESSION);
		if (newNameExpression != nameExpression) {
			NotificationChain msgs = null;
			if (nameExpression != null)
				msgs = ((InternalEObject) nameExpression)
					.eInverseRemove(this, EOPPOSITE_FEATURE_BASE
						- UMLPackage.NAMED_ELEMENT__NAME_EXPRESSION, null, msgs);
			if (newNameExpression != null)
				msgs = ((InternalEObject) newNameExpression)
					.eInverseAdd(this, EOPPOSITE_FEATURE_BASE
						- UMLPackage.NAMED_ELEMENT__NAME_EXPRESSION, null, msgs);
			msgs = basicSetNameExpression(newNameExpression, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.NAMED_ELEMENT__NAME_EXPRESSION, newNameExpression,
				newNameExpression));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StringExpression createNameExpression() {
		StringExpression newNameExpression = UMLFactory.eINSTANCE
			.createStringExpression();
		setNameExpression(newNameExpression);
		return newNameExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNoName(DiagnosticChain diagnostics, Map context) {
		return NamedElementOperations
			.validateNoName(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQualifiedName(DiagnosticChain diagnostics,
			Map context) {
		return NamedElementOperations.validateQualifiedName(this, diagnostics,
			context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVisibilityNeedsOwnership(
			DiagnosticChain diagnostics, Map context) {
		return NamedElementOperations.validateVisibilityNeedsOwnership(this,
			diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List allNamespaces() {
		CacheAdapter cache = getCacheAdapter();
		if (cache != null) {
			List result = (List) cache.get(this, UMLPackage.eINSTANCE
				.getNamedElement().getEOperations().get(4));
			if (result == null) {
				cache.put(this, UMLPackage.eINSTANCE.getNamedElement()
					.getEOperations().get(4), result = NamedElementOperations
					.allNamespaces(this));
			}
			return result;
		}
		return NamedElementOperations.allNamespaces(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isDistinguishableFrom(NamedElement n, Namespace ns) {
		return NamedElementOperations.isDistinguishableFrom(this, n, ns);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String separator() {
		return NamedElementOperations.separator(this);
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
				case UMLPackage.NAMED_ELEMENT__EANNOTATIONS :
					return ((InternalEList) getEAnnotations()).basicAdd(
						otherEnd, msgs);
				case UMLPackage.NAMED_ELEMENT__CLIENT_DEPENDENCY :
					return ((InternalEList) getClientDependencies()).basicAdd(
						otherEnd, msgs);
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
				case UMLPackage.NAMED_ELEMENT__EANNOTATIONS :
					return ((InternalEList) getEAnnotations()).basicRemove(
						otherEnd, msgs);
				case UMLPackage.NAMED_ELEMENT__OWNED_COMMENT :
					return ((InternalEList) getOwnedComments()).basicRemove(
						otherEnd, msgs);
				case UMLPackage.NAMED_ELEMENT__CLIENT_DEPENDENCY :
					return ((InternalEList) getClientDependencies())
						.basicRemove(otherEnd, msgs);
				case UMLPackage.NAMED_ELEMENT__NAME_EXPRESSION :
					return basicSetNameExpression(null, msgs);
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
	public Object eGet(EStructuralFeature eFeature, boolean resolve) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case UMLPackage.NAMED_ELEMENT__EANNOTATIONS :
				return getEAnnotations();
			case UMLPackage.NAMED_ELEMENT__OWNED_ELEMENT :
				return getOwnedElements();
			case UMLPackage.NAMED_ELEMENT__OWNER :
				if (resolve)
					return getOwner();
				return basicGetOwner();
			case UMLPackage.NAMED_ELEMENT__OWNED_COMMENT :
				return getOwnedComments();
			case UMLPackage.NAMED_ELEMENT__NAME :
				return getName();
			case UMLPackage.NAMED_ELEMENT__VISIBILITY :
				return getVisibility();
			case UMLPackage.NAMED_ELEMENT__QUALIFIED_NAME :
				return getQualifiedName();
			case UMLPackage.NAMED_ELEMENT__CLIENT_DEPENDENCY :
				return getClientDependencies();
			case UMLPackage.NAMED_ELEMENT__NAMESPACE :
				if (resolve)
					return getNamespace();
				return basicGetNamespace();
			case UMLPackage.NAMED_ELEMENT__NAME_EXPRESSION :
				return getNameExpression();
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
			case UMLPackage.NAMED_ELEMENT__EANNOTATIONS :
				getEAnnotations().clear();
				getEAnnotations().addAll((Collection) newValue);
				return;
			case UMLPackage.NAMED_ELEMENT__OWNED_COMMENT :
				getOwnedComments().clear();
				getOwnedComments().addAll((Collection) newValue);
				return;
			case UMLPackage.NAMED_ELEMENT__NAME :
				setName((String) newValue);
				return;
			case UMLPackage.NAMED_ELEMENT__VISIBILITY :
				setVisibility((VisibilityKind) newValue);
				return;
			case UMLPackage.NAMED_ELEMENT__CLIENT_DEPENDENCY :
				getClientDependencies().clear();
				getClientDependencies().addAll((Collection) newValue);
				return;
			case UMLPackage.NAMED_ELEMENT__NAME_EXPRESSION :
				setNameExpression((StringExpression) newValue);
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
			case UMLPackage.NAMED_ELEMENT__EANNOTATIONS :
				getEAnnotations().clear();
				return;
			case UMLPackage.NAMED_ELEMENT__OWNED_COMMENT :
				getOwnedComments().clear();
				return;
			case UMLPackage.NAMED_ELEMENT__NAME :
				setName(NAME_EDEFAULT);
				return;
			case UMLPackage.NAMED_ELEMENT__VISIBILITY :
				setVisibility(VISIBILITY_EDEFAULT);
				return;
			case UMLPackage.NAMED_ELEMENT__CLIENT_DEPENDENCY :
				getClientDependencies().clear();
				return;
			case UMLPackage.NAMED_ELEMENT__NAME_EXPRESSION :
				setNameExpression((StringExpression) null);
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
			case UMLPackage.NAMED_ELEMENT__EANNOTATIONS :
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UMLPackage.NAMED_ELEMENT__OWNED_ELEMENT :
				return isSetOwnedElements();
			case UMLPackage.NAMED_ELEMENT__OWNER :
				return isSetOwner();
			case UMLPackage.NAMED_ELEMENT__OWNED_COMMENT :
				List ownedComment = (List) eVirtualGet(UMLPackage.NAMED_ELEMENT__OWNED_COMMENT);
				return ownedComment != null && !ownedComment.isEmpty();
			case UMLPackage.NAMED_ELEMENT__NAME :
				String name = eVirtualIsSet(UMLPackage.NAMED_ELEMENT__NAME)
					? (String) eVirtualGet(UMLPackage.NAMED_ELEMENT__NAME)
					: NAME_EDEFAULT;
				return NAME_EDEFAULT == null
					? name != null
					: !NAME_EDEFAULT.equals(name);
			case UMLPackage.NAMED_ELEMENT__VISIBILITY :
				return eVirtualIsSet(UMLPackage.NAMED_ELEMENT__VISIBILITY)
					&& eVirtualGet(UMLPackage.NAMED_ELEMENT__VISIBILITY) != VISIBILITY_EDEFAULT;
			case UMLPackage.NAMED_ELEMENT__QUALIFIED_NAME :
				return QUALIFIED_NAME_EDEFAULT == null
					? getQualifiedName() != null
					: !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case UMLPackage.NAMED_ELEMENT__CLIENT_DEPENDENCY :
				List clientDependency = (List) eVirtualGet(UMLPackage.NAMED_ELEMENT__CLIENT_DEPENDENCY);
				return clientDependency != null && !clientDependency.isEmpty();
			case UMLPackage.NAMED_ELEMENT__NAMESPACE :
				return isSetNamespace();
			case UMLPackage.NAMED_ELEMENT__NAME_EXPRESSION :
				return eVirtualGet(UMLPackage.NAMED_ELEMENT__NAME_EXPRESSION) != null;
		}
		return eDynamicIsSet(eFeature);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: "); //$NON-NLS-1$
		result.append(eVirtualIsSet(UMLPackage.NAMED_ELEMENT__NAME)
			? eVirtualGet(UMLPackage.NAMED_ELEMENT__NAME)
			: NAME_EDEFAULT);
		result.append(", visibility: "); //$NON-NLS-1$
		result.append(eVirtualIsSet(UMLPackage.NAMED_ELEMENT__VISIBILITY)
			? eVirtualGet(UMLPackage.NAMED_ELEMENT__VISIBILITY)
			: VISIBILITY_EDEFAULT);
		result.append(')');
		return result.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Namespace basicGetNamespace() {
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Namespace getNamespace() {
		Namespace namespace = basicGetNamespace();
		return namespace == null
			? null
			: (Namespace) eResolveProxy((InternalEObject) namespace);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNamespace() {
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Element basicGetOwner() {
		if (isSetNamespace()) {
			return basicGetNamespace();
		}
		return super.basicGetOwner();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOwner() {
		return super.isSetOwner() || isSetNamespace();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOwnedElements() {
		return super.isSetOwnedElements()
			|| eIsSet(UMLPackage.eINSTANCE.getNamedElement_NameExpression());
	}

} //NamedElementImpl
