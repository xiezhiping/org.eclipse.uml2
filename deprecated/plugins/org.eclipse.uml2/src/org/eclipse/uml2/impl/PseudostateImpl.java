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
 * $Id: PseudostateImpl.java,v 1.13 2005/11/23 20:05:09 khussey Exp $
 */
package org.eclipse.uml2.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.uml2.Pseudostate;
import org.eclipse.uml2.PseudostateKind;
import org.eclipse.uml2.Region;
import org.eclipse.uml2.StringExpression;
import org.eclipse.uml2.TemplateSignature;
import org.eclipse.uml2.UML2Package;
import org.eclipse.uml2.VisibilityKind;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pseudostate</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2.impl.PseudostateImpl#getKind <em>Kind</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PseudostateImpl extends VertexImpl implements Pseudostate {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) IBM Corporation and others."; //$NON-NLS-1$

	/**
	 * The default value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected static final PseudostateKind KIND_EDEFAULT = PseudostateKind.INITIAL_LITERAL;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PseudostateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return UML2Package.Literals.PSEUDOSTATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PseudostateKind getKind() {
		return (PseudostateKind)eVirtualGet(UML2Package.PSEUDOSTATE__KIND, KIND_EDEFAULT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKind(PseudostateKind newKind) {
		PseudostateKind kind = newKind == null ? KIND_EDEFAULT : newKind;
		Object oldKind = eVirtualSet(UML2Package.PSEUDOSTATE__KIND, kind);
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2Package.PSEUDOSTATE__KIND, oldKind == EVIRTUAL_NO_VALUE ? KIND_EDEFAULT : oldKind, kind));

	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UML2Package.PSEUDOSTATE__EANNOTATIONS:
				return getEAnnotations();
			case UML2Package.PSEUDOSTATE__OWNED_ELEMENT:
				return getOwnedElements();
			case UML2Package.PSEUDOSTATE__OWNER:
				if (resolve) return getOwner();
				return basicGetOwner();
			case UML2Package.PSEUDOSTATE__OWNED_COMMENT:
				return getOwnedComments();
			case UML2Package.PSEUDOSTATE__TEMPLATE_BINDING:
				return getTemplateBindings();
			case UML2Package.PSEUDOSTATE__OWNED_TEMPLATE_SIGNATURE:
				return getOwnedTemplateSignature();
			case UML2Package.PSEUDOSTATE__NAME:
				return getName();
			case UML2Package.PSEUDOSTATE__QUALIFIED_NAME:
				return getQualifiedName();
			case UML2Package.PSEUDOSTATE__VISIBILITY:
				return getVisibility();
			case UML2Package.PSEUDOSTATE__CLIENT_DEPENDENCY:
				return getClientDependencies();
			case UML2Package.PSEUDOSTATE__NAME_EXPRESSION:
				return getNameExpression();
			case UML2Package.PSEUDOSTATE__CONTAINER:
				return getContainer();
			case UML2Package.PSEUDOSTATE__OUTGOING:
				return getOutgoings();
			case UML2Package.PSEUDOSTATE__INCOMING:
				return getIncomings();
			case UML2Package.PSEUDOSTATE__KIND:
				return getKind();
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
			case UML2Package.PSEUDOSTATE__EANNOTATIONS:
				getEAnnotations().clear();
				getEAnnotations().addAll((Collection)newValue);
				return;
			case UML2Package.PSEUDOSTATE__OWNED_COMMENT:
				getOwnedComments().clear();
				getOwnedComments().addAll((Collection)newValue);
				return;
			case UML2Package.PSEUDOSTATE__TEMPLATE_BINDING:
				getTemplateBindings().clear();
				getTemplateBindings().addAll((Collection)newValue);
				return;
			case UML2Package.PSEUDOSTATE__OWNED_TEMPLATE_SIGNATURE:
				setOwnedTemplateSignature((TemplateSignature)newValue);
				return;
			case UML2Package.PSEUDOSTATE__NAME:
				setName((String)newValue);
				return;
			case UML2Package.PSEUDOSTATE__VISIBILITY:
				setVisibility((VisibilityKind)newValue);
				return;
			case UML2Package.PSEUDOSTATE__CLIENT_DEPENDENCY:
				getClientDependencies().clear();
				getClientDependencies().addAll((Collection)newValue);
				return;
			case UML2Package.PSEUDOSTATE__NAME_EXPRESSION:
				setNameExpression((StringExpression)newValue);
				return;
			case UML2Package.PSEUDOSTATE__CONTAINER:
				setContainer((Region)newValue);
				return;
			case UML2Package.PSEUDOSTATE__OUTGOING:
				getOutgoings().clear();
				getOutgoings().addAll((Collection)newValue);
				return;
			case UML2Package.PSEUDOSTATE__INCOMING:
				getIncomings().clear();
				getIncomings().addAll((Collection)newValue);
				return;
			case UML2Package.PSEUDOSTATE__KIND:
				setKind((PseudostateKind)newValue);
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
			case UML2Package.PSEUDOSTATE__EANNOTATIONS:
				getEAnnotations().clear();
				return;
			case UML2Package.PSEUDOSTATE__OWNED_COMMENT:
				getOwnedComments().clear();
				return;
			case UML2Package.PSEUDOSTATE__TEMPLATE_BINDING:
				getTemplateBindings().clear();
				return;
			case UML2Package.PSEUDOSTATE__OWNED_TEMPLATE_SIGNATURE:
				setOwnedTemplateSignature((TemplateSignature)null);
				return;
			case UML2Package.PSEUDOSTATE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case UML2Package.PSEUDOSTATE__VISIBILITY:
				setVisibility(VISIBILITY_EDEFAULT);
				return;
			case UML2Package.PSEUDOSTATE__CLIENT_DEPENDENCY:
				getClientDependencies().clear();
				return;
			case UML2Package.PSEUDOSTATE__NAME_EXPRESSION:
				setNameExpression((StringExpression)null);
				return;
			case UML2Package.PSEUDOSTATE__CONTAINER:
				setContainer((Region)null);
				return;
			case UML2Package.PSEUDOSTATE__OUTGOING:
				getOutgoings().clear();
				return;
			case UML2Package.PSEUDOSTATE__INCOMING:
				getIncomings().clear();
				return;
			case UML2Package.PSEUDOSTATE__KIND:
				setKind(KIND_EDEFAULT);
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
			case UML2Package.PSEUDOSTATE__EANNOTATIONS:
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UML2Package.PSEUDOSTATE__OWNED_ELEMENT:
				return isSetOwnedElements();
			case UML2Package.PSEUDOSTATE__OWNER:
				return isSetOwner();
			case UML2Package.PSEUDOSTATE__OWNED_COMMENT:
				EList ownedComment = (EList)eVirtualGet(UML2Package.PSEUDOSTATE__OWNED_COMMENT);
				return ownedComment != null && !ownedComment.isEmpty();
			case UML2Package.PSEUDOSTATE__TEMPLATE_BINDING:
				EList templateBinding = (EList)eVirtualGet(UML2Package.PSEUDOSTATE__TEMPLATE_BINDING);
				return templateBinding != null && !templateBinding.isEmpty();
			case UML2Package.PSEUDOSTATE__OWNED_TEMPLATE_SIGNATURE:
				return eVirtualGet(UML2Package.PSEUDOSTATE__OWNED_TEMPLATE_SIGNATURE) != null;
			case UML2Package.PSEUDOSTATE__NAME:
				String name = (String)eVirtualGet(UML2Package.PSEUDOSTATE__NAME, NAME_EDEFAULT);
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case UML2Package.PSEUDOSTATE__QUALIFIED_NAME:
				return QUALIFIED_NAME_EDEFAULT == null ? getQualifiedName() != null : !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case UML2Package.PSEUDOSTATE__VISIBILITY:
				return eVirtualGet(UML2Package.PSEUDOSTATE__VISIBILITY, VISIBILITY_EDEFAULT) != VISIBILITY_EDEFAULT;
			case UML2Package.PSEUDOSTATE__CLIENT_DEPENDENCY:
				EList clientDependency = (EList)eVirtualGet(UML2Package.PSEUDOSTATE__CLIENT_DEPENDENCY);
				return clientDependency != null && !clientDependency.isEmpty();
			case UML2Package.PSEUDOSTATE__NAME_EXPRESSION:
				return eVirtualGet(UML2Package.PSEUDOSTATE__NAME_EXPRESSION) != null;
			case UML2Package.PSEUDOSTATE__CONTAINER:
				return isSetContainer();
			case UML2Package.PSEUDOSTATE__OUTGOING:
				EList outgoing = (EList)eVirtualGet(UML2Package.PSEUDOSTATE__OUTGOING);
				return outgoing != null && !outgoing.isEmpty();
			case UML2Package.PSEUDOSTATE__INCOMING:
				EList incoming = (EList)eVirtualGet(UML2Package.PSEUDOSTATE__INCOMING);
				return incoming != null && !incoming.isEmpty();
			case UML2Package.PSEUDOSTATE__KIND:
				return eVirtualGet(UML2Package.PSEUDOSTATE__KIND, KIND_EDEFAULT) != KIND_EDEFAULT;
		}
		return eDynamicIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (kind: "); //$NON-NLS-1$
		result.append(eVirtualGet(UML2Package.PSEUDOSTATE__KIND, KIND_EDEFAULT));
		result.append(')');
		return result.toString();
	}


} //PseudostateImpl
