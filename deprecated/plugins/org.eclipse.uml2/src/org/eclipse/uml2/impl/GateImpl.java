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

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.uml2.Gate;
import org.eclipse.uml2.Message;
import org.eclipse.uml2.StringExpression;
import org.eclipse.uml2.TemplateSignature;
import org.eclipse.uml2.UML2Package;
import org.eclipse.uml2.VisibilityKind;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Gate</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class GateImpl extends MessageEndImpl implements Gate {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2003, 2004 IBM Corporation and others."; //$NON-NLS-1$

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return UML2Package.eINSTANCE.getGate();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, Class baseClass, NotificationChain msgs) {
		if (featureID >= 0) {
			switch (eDerivedStructuralFeatureID(featureID, baseClass)) {
				case UML2Package.GATE__EANNOTATIONS:
					return ((InternalEList)getEAnnotations()).basicAdd(otherEnd, msgs);
				case UML2Package.GATE__TEMPLATE_BINDING:
					return ((InternalEList)getTemplateBindings()).basicAdd(otherEnd, msgs);
				case UML2Package.GATE__OWNED_TEMPLATE_SIGNATURE:
					if (ownedTemplateSignature != null)
						msgs = ((InternalEObject)ownedTemplateSignature).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UML2Package.GATE__OWNED_TEMPLATE_SIGNATURE, null, msgs);
					return basicSetOwnedTemplateSignature((TemplateSignature)otherEnd, msgs);
				case UML2Package.GATE__CLIENT_DEPENDENCY:
					return ((InternalEList)getClientDependencies()).basicAdd(otherEnd, msgs);
				case UML2Package.GATE__RECEIVE_MESSAGE:
					if (receiveMessage != null)
						msgs = ((InternalEObject)receiveMessage).eInverseRemove(this, UML2Package.MESSAGE__RECEIVE_EVENT, Message.class, msgs);
					return basicSetReceiveMessage((Message)otherEnd, msgs);
				case UML2Package.GATE__SEND_MESSAGE:
					if (sendMessage != null)
						msgs = ((InternalEObject)sendMessage).eInverseRemove(this, UML2Package.MESSAGE__SEND_EVENT, Message.class, msgs);
					return basicSetSendMessage((Message)otherEnd, msgs);
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
				case UML2Package.GATE__EANNOTATIONS:
					return ((InternalEList)getEAnnotations()).basicRemove(otherEnd, msgs);
				case UML2Package.GATE__OWNED_COMMENT:
					return ((InternalEList)getOwnedComments()).basicRemove(otherEnd, msgs);
				case UML2Package.GATE__TEMPLATE_BINDING:
					return ((InternalEList)getTemplateBindings()).basicRemove(otherEnd, msgs);
				case UML2Package.GATE__OWNED_TEMPLATE_SIGNATURE:
					return basicSetOwnedTemplateSignature(null, msgs);
				case UML2Package.GATE__CLIENT_DEPENDENCY:
					return ((InternalEList)getClientDependencies()).basicRemove(otherEnd, msgs);
				case UML2Package.GATE__NAME_EXPRESSION:
					return basicSetNameExpression(null, msgs);
				case UML2Package.GATE__RECEIVE_MESSAGE:
					return basicSetReceiveMessage(null, msgs);
				case UML2Package.GATE__SEND_MESSAGE:
					return basicSetSendMessage(null, msgs);
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
	public Object eGet(EStructuralFeature eFeature, boolean resolve) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case UML2Package.GATE__EANNOTATIONS:
				return getEAnnotations();
			case UML2Package.GATE__OWNED_ELEMENT:
				return getOwnedElements();
			case UML2Package.GATE__OWNER:
				if (resolve) return getOwner();
				return basicGetOwner();
			case UML2Package.GATE__OWNED_COMMENT:
				return getOwnedComments();
			case UML2Package.GATE__TEMPLATE_BINDING:
				return getTemplateBindings();
			case UML2Package.GATE__OWNED_TEMPLATE_SIGNATURE:
				return getOwnedTemplateSignature();
			case UML2Package.GATE__NAME:
				return getName();
			case UML2Package.GATE__QUALIFIED_NAME:
				return getQualifiedName();
			case UML2Package.GATE__VISIBILITY:
				return getVisibility();
			case UML2Package.GATE__CLIENT_DEPENDENCY:
				return getClientDependencies();
			case UML2Package.GATE__NAME_EXPRESSION:
				return getNameExpression();
			case UML2Package.GATE__RECEIVE_MESSAGE:
				if (resolve) return getReceiveMessage();
				return basicGetReceiveMessage();
			case UML2Package.GATE__SEND_MESSAGE:
				if (resolve) return getSendMessage();
				return basicGetSendMessage();
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
			case UML2Package.GATE__EANNOTATIONS:
				getEAnnotations().clear();
				getEAnnotations().addAll((Collection)newValue);
				return;
			case UML2Package.GATE__OWNED_COMMENT:
				getOwnedComments().clear();
				getOwnedComments().addAll((Collection)newValue);
				return;
			case UML2Package.GATE__TEMPLATE_BINDING:
				getTemplateBindings().clear();
				getTemplateBindings().addAll((Collection)newValue);
				return;
			case UML2Package.GATE__OWNED_TEMPLATE_SIGNATURE:
				setOwnedTemplateSignature((TemplateSignature)newValue);
				return;
			case UML2Package.GATE__NAME:
				setName((String)newValue);
				return;
			case UML2Package.GATE__VISIBILITY:
				setVisibility((VisibilityKind)newValue);
				return;
			case UML2Package.GATE__CLIENT_DEPENDENCY:
				getClientDependencies().clear();
				getClientDependencies().addAll((Collection)newValue);
				return;
			case UML2Package.GATE__NAME_EXPRESSION:
				setNameExpression((StringExpression)newValue);
				return;
			case UML2Package.GATE__RECEIVE_MESSAGE:
				setReceiveMessage((Message)newValue);
				return;
			case UML2Package.GATE__SEND_MESSAGE:
				setSendMessage((Message)newValue);
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
			case UML2Package.GATE__EANNOTATIONS:
				getEAnnotations().clear();
				return;
			case UML2Package.GATE__OWNED_COMMENT:
				getOwnedComments().clear();
				return;
			case UML2Package.GATE__TEMPLATE_BINDING:
				getTemplateBindings().clear();
				return;
			case UML2Package.GATE__OWNED_TEMPLATE_SIGNATURE:
				setOwnedTemplateSignature((TemplateSignature)null);
				return;
			case UML2Package.GATE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case UML2Package.GATE__VISIBILITY:
				setVisibility(VISIBILITY_EDEFAULT);
				return;
			case UML2Package.GATE__CLIENT_DEPENDENCY:
				getClientDependencies().clear();
				return;
			case UML2Package.GATE__NAME_EXPRESSION:
				setNameExpression((StringExpression)null);
				return;
			case UML2Package.GATE__RECEIVE_MESSAGE:
				setReceiveMessage((Message)null);
				return;
			case UML2Package.GATE__SEND_MESSAGE:
				setSendMessage((Message)null);
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
			case UML2Package.GATE__EANNOTATIONS:
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UML2Package.GATE__OWNED_ELEMENT:
				return !getOwnedElements().isEmpty();
			case UML2Package.GATE__OWNER:
				return basicGetOwner() != null;
			case UML2Package.GATE__OWNED_COMMENT:
				return ownedComment != null && !ownedComment.isEmpty();
			case UML2Package.GATE__TEMPLATE_BINDING:
				return templateBinding != null && !templateBinding.isEmpty();
			case UML2Package.GATE__OWNED_TEMPLATE_SIGNATURE:
				return ownedTemplateSignature != null;
			case UML2Package.GATE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case UML2Package.GATE__QUALIFIED_NAME:
				return !"".equals(getQualifiedName()); //$NON-NLS-1$
			case UML2Package.GATE__VISIBILITY:
				return visibility != VISIBILITY_EDEFAULT;
			case UML2Package.GATE__CLIENT_DEPENDENCY:
				return clientDependency != null && !clientDependency.isEmpty();
			case UML2Package.GATE__NAME_EXPRESSION:
				return nameExpression != null;
			case UML2Package.GATE__RECEIVE_MESSAGE:
				return receiveMessage != null;
			case UML2Package.GATE__SEND_MESSAGE:
				return sendMessage != null;
		}
		return eDynamicIsSet(eFeature);
	}

} //GateImpl
