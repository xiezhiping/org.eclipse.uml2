/*
 * Copyright (c) 2005, 2006 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *
 * $Id: RedefinableElementImpl.java,v 1.11 2006/01/05 13:54:02 khussey Exp $
 */
package org.eclipse.uml2.uml.internal.impl;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.uml2.common.util.DerivedEObjectEList;
import org.eclipse.uml2.common.util.DerivedUnionEObjectEList;

import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.RedefinableElement;
import org.eclipse.uml2.uml.StringExpression;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.VisibilityKind;

import org.eclipse.uml2.uml.internal.operations.RedefinableElementOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Redefinable Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.RedefinableElementImpl#getRedefinedElements <em>Redefined Element</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.RedefinableElementImpl#getRedefinitionContexts <em>Redefinition Context</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.RedefinableElementImpl#isLeaf <em>Is Leaf</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class RedefinableElementImpl
		extends NamedElementImpl
		implements RedefinableElement {

	/**
	 * The default value of the '{@link #isLeaf() <em>Is Leaf</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isLeaf()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_LEAF_EDEFAULT = false;

	/**
	 * The flag representing the value of the '{@link #isLeaf() <em>Is Leaf</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isLeaf()
	 * @generated
	 * @ordered
	 */
	protected static final int IS_LEAF_EFLAG = 1 << 8;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RedefinableElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return UMLPackage.Literals.REDEFINABLE_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getRedefinedElements() {
		EList redefinedElement = (EList) eVirtualGet(UMLPackage.REDEFINABLE_ELEMENT__REDEFINED_ELEMENT);
		if (redefinedElement == null) {
			eVirtualSet(UMLPackage.REDEFINABLE_ELEMENT__REDEFINED_ELEMENT,
				redefinedElement = new DerivedUnionEObjectEList(
					RedefinableElement.class, this,
					UMLPackage.REDEFINABLE_ELEMENT__REDEFINED_ELEMENT, null));
		}
		return redefinedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RedefinableElement getRedefinedElement(String name) {
		for (Iterator i = getRedefinedElements().iterator(); i.hasNext();) {
			RedefinableElement redefinedElement = (RedefinableElement) i.next();
			if (name.equals(redefinedElement.getName())) {
				return redefinedElement;
			}
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getRedefinitionContextsGen() {
		EList redefinitionContext = (EList) eVirtualGet(UMLPackage.REDEFINABLE_ELEMENT__REDEFINITION_CONTEXT);
		if (redefinitionContext == null) {
			eVirtualSet(UMLPackage.REDEFINABLE_ELEMENT__REDEFINITION_CONTEXT,
				redefinitionContext = new DerivedUnionEObjectEList(
					Classifier.class, this,
					UMLPackage.REDEFINABLE_ELEMENT__REDEFINITION_CONTEXT, null));
		}
		return redefinitionContext;
	}

	public EList getRedefinitionContexts() {
		EList redefinitionContext = (EList) eVirtualGet(UMLPackage.REDEFINABLE_ELEMENT__REDEFINITION_CONTEXT);
		if (redefinitionContext == null) {
			eVirtualSet(UMLPackage.REDEFINABLE_ELEMENT__REDEFINITION_CONTEXT,
				redefinitionContext = new DerivedEObjectEList(Classifier.class,
					this, UMLPackage.REDEFINABLE_ELEMENT__REDEFINITION_CONTEXT,
					new int[]{UMLPackage.REDEFINABLE_ELEMENT__OWNER}));
		}
		return redefinitionContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Classifier getRedefinitionContext(String name) {
		for (Iterator i = getRedefinitionContexts().iterator(); i.hasNext();) {
			Classifier redefinitionContext = (Classifier) i.next();
			if (name.equals(redefinitionContext.getName())) {
				return redefinitionContext;
			}
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isLeaf() {
		return (eFlags & IS_LEAF_EFLAG) != 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsLeaf(boolean newIsLeaf) {
		boolean oldIsLeaf = (eFlags & IS_LEAF_EFLAG) != 0;
		if (newIsLeaf)
			eFlags |= IS_LEAF_EFLAG;
		else
			eFlags &= ~IS_LEAF_EFLAG;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.REDEFINABLE_ELEMENT__IS_LEAF, oldIsLeaf, newIsLeaf));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRedefinitionContextValid(
			DiagnosticChain diagnostics, Map context) {
		return RedefinableElementOperations.validateRedefinitionContextValid(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRedefinitionConsistent(DiagnosticChain diagnostics,
			Map context) {
		return RedefinableElementOperations.validateRedefinitionConsistent(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isRedefinitionContextValid(RedefinableElement redefined) {
		return RedefinableElementOperations.isRedefinitionContextValid(this,
			redefined);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UMLPackage.REDEFINABLE_ELEMENT__EANNOTATIONS :
				return getEAnnotations();
			case UMLPackage.REDEFINABLE_ELEMENT__OWNED_ELEMENT :
				return getOwnedElements();
			case UMLPackage.REDEFINABLE_ELEMENT__OWNER :
				if (resolve)
					return getOwner();
				return basicGetOwner();
			case UMLPackage.REDEFINABLE_ELEMENT__OWNED_COMMENT :
				return getOwnedComments();
			case UMLPackage.REDEFINABLE_ELEMENT__NAME :
				return getName();
			case UMLPackage.REDEFINABLE_ELEMENT__VISIBILITY :
				return getVisibility();
			case UMLPackage.REDEFINABLE_ELEMENT__QUALIFIED_NAME :
				return getQualifiedName();
			case UMLPackage.REDEFINABLE_ELEMENT__CLIENT_DEPENDENCY :
				return getClientDependencies();
			case UMLPackage.REDEFINABLE_ELEMENT__NAMESPACE :
				if (resolve)
					return getNamespace();
				return basicGetNamespace();
			case UMLPackage.REDEFINABLE_ELEMENT__NAME_EXPRESSION :
				return getNameExpression();
			case UMLPackage.REDEFINABLE_ELEMENT__IS_LEAF :
				return isLeaf()
					? Boolean.TRUE
					: Boolean.FALSE;
			case UMLPackage.REDEFINABLE_ELEMENT__REDEFINED_ELEMENT :
				return getRedefinedElements();
			case UMLPackage.REDEFINABLE_ELEMENT__REDEFINITION_CONTEXT :
				return getRedefinitionContexts();
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
			case UMLPackage.REDEFINABLE_ELEMENT__EANNOTATIONS :
				getEAnnotations().clear();
				getEAnnotations().addAll((Collection) newValue);
				return;
			case UMLPackage.REDEFINABLE_ELEMENT__OWNED_COMMENT :
				getOwnedComments().clear();
				getOwnedComments().addAll((Collection) newValue);
				return;
			case UMLPackage.REDEFINABLE_ELEMENT__NAME :
				setName((String) newValue);
				return;
			case UMLPackage.REDEFINABLE_ELEMENT__VISIBILITY :
				setVisibility((VisibilityKind) newValue);
				return;
			case UMLPackage.REDEFINABLE_ELEMENT__CLIENT_DEPENDENCY :
				getClientDependencies().clear();
				getClientDependencies().addAll((Collection) newValue);
				return;
			case UMLPackage.REDEFINABLE_ELEMENT__NAME_EXPRESSION :
				setNameExpression((StringExpression) newValue);
				return;
			case UMLPackage.REDEFINABLE_ELEMENT__IS_LEAF :
				setIsLeaf(((Boolean) newValue).booleanValue());
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
			case UMLPackage.REDEFINABLE_ELEMENT__EANNOTATIONS :
				getEAnnotations().clear();
				return;
			case UMLPackage.REDEFINABLE_ELEMENT__OWNED_COMMENT :
				getOwnedComments().clear();
				return;
			case UMLPackage.REDEFINABLE_ELEMENT__NAME :
				unsetName();
				return;
			case UMLPackage.REDEFINABLE_ELEMENT__VISIBILITY :
				unsetVisibility();
				return;
			case UMLPackage.REDEFINABLE_ELEMENT__CLIENT_DEPENDENCY :
				getClientDependencies().clear();
				return;
			case UMLPackage.REDEFINABLE_ELEMENT__NAME_EXPRESSION :
				setNameExpression((StringExpression) null);
				return;
			case UMLPackage.REDEFINABLE_ELEMENT__IS_LEAF :
				setIsLeaf(IS_LEAF_EDEFAULT);
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
			case UMLPackage.REDEFINABLE_ELEMENT__EANNOTATIONS :
				EList eAnnotations = (EList) eVirtualGet(UMLPackage.REDEFINABLE_ELEMENT__EANNOTATIONS);
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UMLPackage.REDEFINABLE_ELEMENT__OWNED_ELEMENT :
				return isSetOwnedElements();
			case UMLPackage.REDEFINABLE_ELEMENT__OWNER :
				return isSetOwner();
			case UMLPackage.REDEFINABLE_ELEMENT__OWNED_COMMENT :
				EList ownedComment = (EList) eVirtualGet(UMLPackage.REDEFINABLE_ELEMENT__OWNED_COMMENT);
				return ownedComment != null && !ownedComment.isEmpty();
			case UMLPackage.REDEFINABLE_ELEMENT__NAME :
				return isSetName();
			case UMLPackage.REDEFINABLE_ELEMENT__VISIBILITY :
				return isSetVisibility();
			case UMLPackage.REDEFINABLE_ELEMENT__QUALIFIED_NAME :
				return QUALIFIED_NAME_EDEFAULT == null
					? getQualifiedName() != null
					: !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case UMLPackage.REDEFINABLE_ELEMENT__CLIENT_DEPENDENCY :
				EList clientDependency = (EList) eVirtualGet(UMLPackage.REDEFINABLE_ELEMENT__CLIENT_DEPENDENCY);
				return clientDependency != null && !clientDependency.isEmpty();
			case UMLPackage.REDEFINABLE_ELEMENT__NAMESPACE :
				return isSetNamespace();
			case UMLPackage.REDEFINABLE_ELEMENT__NAME_EXPRESSION :
				return eVirtualGet(UMLPackage.REDEFINABLE_ELEMENT__NAME_EXPRESSION) != null;
			case UMLPackage.REDEFINABLE_ELEMENT__IS_LEAF :
				return ((eFlags & IS_LEAF_EFLAG) != 0) != IS_LEAF_EDEFAULT;
			case UMLPackage.REDEFINABLE_ELEMENT__REDEFINED_ELEMENT :
				return isSetRedefinedElements();
			case UMLPackage.REDEFINABLE_ELEMENT__REDEFINITION_CONTEXT :
				return isSetRedefinitionContexts();
		}
		return eDynamicIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isConsistentWith(RedefinableElement redefinee) {
		return RedefinableElementOperations.isConsistentWith(this, redefinee);
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
		result.append(" (isLeaf: "); //$NON-NLS-1$
		result.append((eFlags & IS_LEAF_EFLAG) != 0);
		result.append(')');
		return result.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRedefinedElements() {
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRedefinitionContextsGen() {
		return false;
	}

	public boolean isSetRedefinitionContexts() {
		return getOwner() instanceof Classifier;
	}

} //RedefinableElementImpl
