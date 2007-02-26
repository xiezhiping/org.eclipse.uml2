/*
 * Copyright (c) 2005, 2007 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *
 * $Id: LinkEndDestructionDataImpl.java,v 1.11 2007/02/26 16:17:57 khussey Exp $
 */
package org.eclipse.uml2.uml.internal.impl;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.uml2.uml.Comment;
import org.eclipse.uml2.uml.InputPin;
import org.eclipse.uml2.uml.LinkEndDestructionData;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.QualifierValue;
import org.eclipse.uml2.uml.UMLPackage;

import org.eclipse.uml2.uml.internal.operations.LinkEndDestructionDataOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Link End Destruction Data</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.LinkEndDestructionDataImpl#isDestroyDuplicates <em>Is Destroy Duplicates</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.LinkEndDestructionDataImpl#getDestroyAt <em>Destroy At</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LinkEndDestructionDataImpl
		extends LinkEndDataImpl
		implements LinkEndDestructionData {

	/**
	 * The default value of the '{@link #isDestroyDuplicates() <em>Is Destroy Duplicates</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDestroyDuplicates()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_DESTROY_DUPLICATES_EDEFAULT = false;

	/**
	 * The flag representing the value of the '{@link #isDestroyDuplicates() <em>Is Destroy Duplicates</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDestroyDuplicates()
	 * @generated
	 * @ordered
	 */
	protected static final int IS_DESTROY_DUPLICATES_EFLAG = 1 << 8;

	/**
	 * The cached value of the '{@link #getDestroyAt() <em>Destroy At</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDestroyAt()
	 * @generated
	 * @ordered
	 */
	protected InputPin destroyAt;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LinkEndDestructionDataImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UMLPackage.Literals.LINK_END_DESTRUCTION_DATA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isDestroyDuplicates() {
		return (eFlags & IS_DESTROY_DUPLICATES_EFLAG) != 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsDestroyDuplicates(boolean newIsDestroyDuplicates) {

		boolean oldIsDestroyDuplicates = (eFlags & IS_DESTROY_DUPLICATES_EFLAG) != 0;
		if (newIsDestroyDuplicates)
			eFlags |= IS_DESTROY_DUPLICATES_EFLAG;
		else
			eFlags &= ~IS_DESTROY_DUPLICATES_EFLAG;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.LINK_END_DESTRUCTION_DATA__IS_DESTROY_DUPLICATES,
				oldIsDestroyDuplicates, newIsDestroyDuplicates));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputPin getDestroyAt() {
		if (destroyAt != null && destroyAt.eIsProxy()) {
			InternalEObject oldDestroyAt = (InternalEObject) destroyAt;
			destroyAt = (InputPin) eResolveProxy(oldDestroyAt);
			if (destroyAt != oldDestroyAt) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
						UMLPackage.LINK_END_DESTRUCTION_DATA__DESTROY_AT,
						oldDestroyAt, destroyAt));
			}
		}
		return destroyAt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputPin basicGetDestroyAt() {
		return destroyAt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDestroyAt(InputPin newDestroyAt) {

		InputPin oldDestroyAt = destroyAt;
		destroyAt = newDestroyAt;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.LINK_END_DESTRUCTION_DATA__DESTROY_AT, oldDestroyAt,
				destroyAt));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDestroyLinkAction(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return LinkEndDestructionDataOperations.validateDestroyLinkAction(this,
			diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnlimitedNaturalAndMultiplicity(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return LinkEndDestructionDataOperations
			.validateUnlimitedNaturalAndMultiplicity(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UMLPackage.LINK_END_DESTRUCTION_DATA__EANNOTATIONS :
				return getEAnnotations();
			case UMLPackage.LINK_END_DESTRUCTION_DATA__OWNED_ELEMENT :
				return getOwnedElements();
			case UMLPackage.LINK_END_DESTRUCTION_DATA__OWNER :
				if (resolve)
					return getOwner();
				return basicGetOwner();
			case UMLPackage.LINK_END_DESTRUCTION_DATA__OWNED_COMMENT :
				return getOwnedComments();
			case UMLPackage.LINK_END_DESTRUCTION_DATA__VALUE :
				if (resolve)
					return getValue();
				return basicGetValue();
			case UMLPackage.LINK_END_DESTRUCTION_DATA__END :
				if (resolve)
					return getEnd();
				return basicGetEnd();
			case UMLPackage.LINK_END_DESTRUCTION_DATA__QUALIFIER :
				return getQualifiers();
			case UMLPackage.LINK_END_DESTRUCTION_DATA__IS_DESTROY_DUPLICATES :
				return isDestroyDuplicates()
					? Boolean.TRUE
					: Boolean.FALSE;
			case UMLPackage.LINK_END_DESTRUCTION_DATA__DESTROY_AT :
				if (resolve)
					return getDestroyAt();
				return basicGetDestroyAt();
		}
		return eDynamicGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case UMLPackage.LINK_END_DESTRUCTION_DATA__EANNOTATIONS :
				getEAnnotations().clear();
				getEAnnotations().addAll(
					(Collection<? extends EAnnotation>) newValue);
				return;
			case UMLPackage.LINK_END_DESTRUCTION_DATA__OWNED_COMMENT :
				getOwnedComments().clear();
				getOwnedComments().addAll(
					(Collection<? extends Comment>) newValue);
				return;
			case UMLPackage.LINK_END_DESTRUCTION_DATA__VALUE :
				setValue((InputPin) newValue);
				return;
			case UMLPackage.LINK_END_DESTRUCTION_DATA__END :
				setEnd((Property) newValue);
				return;
			case UMLPackage.LINK_END_DESTRUCTION_DATA__QUALIFIER :
				getQualifiers().clear();
				getQualifiers().addAll(
					(Collection<? extends QualifierValue>) newValue);
				return;
			case UMLPackage.LINK_END_DESTRUCTION_DATA__IS_DESTROY_DUPLICATES :
				setIsDestroyDuplicates(((Boolean) newValue).booleanValue());
				return;
			case UMLPackage.LINK_END_DESTRUCTION_DATA__DESTROY_AT :
				setDestroyAt((InputPin) newValue);
				return;
		}
		eDynamicSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case UMLPackage.LINK_END_DESTRUCTION_DATA__EANNOTATIONS :
				getEAnnotations().clear();
				return;
			case UMLPackage.LINK_END_DESTRUCTION_DATA__OWNED_COMMENT :
				getOwnedComments().clear();
				return;
			case UMLPackage.LINK_END_DESTRUCTION_DATA__VALUE :
				setValue((InputPin) null);
				return;
			case UMLPackage.LINK_END_DESTRUCTION_DATA__END :
				setEnd((Property) null);
				return;
			case UMLPackage.LINK_END_DESTRUCTION_DATA__QUALIFIER :
				getQualifiers().clear();
				return;
			case UMLPackage.LINK_END_DESTRUCTION_DATA__IS_DESTROY_DUPLICATES :
				setIsDestroyDuplicates(IS_DESTROY_DUPLICATES_EDEFAULT);
				return;
			case UMLPackage.LINK_END_DESTRUCTION_DATA__DESTROY_AT :
				setDestroyAt((InputPin) null);
				return;
		}
		eDynamicUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case UMLPackage.LINK_END_DESTRUCTION_DATA__EANNOTATIONS :
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UMLPackage.LINK_END_DESTRUCTION_DATA__OWNED_ELEMENT :
				return isSetOwnedElements();
			case UMLPackage.LINK_END_DESTRUCTION_DATA__OWNER :
				return isSetOwner();
			case UMLPackage.LINK_END_DESTRUCTION_DATA__OWNED_COMMENT :
				return ownedComments != null && !ownedComments.isEmpty();
			case UMLPackage.LINK_END_DESTRUCTION_DATA__VALUE :
				return value != null;
			case UMLPackage.LINK_END_DESTRUCTION_DATA__END :
				return end != null;
			case UMLPackage.LINK_END_DESTRUCTION_DATA__QUALIFIER :
				return qualifiers != null && !qualifiers.isEmpty();
			case UMLPackage.LINK_END_DESTRUCTION_DATA__IS_DESTROY_DUPLICATES :
				return ((eFlags & IS_DESTROY_DUPLICATES_EFLAG) != 0) != IS_DESTROY_DUPLICATES_EDEFAULT;
			case UMLPackage.LINK_END_DESTRUCTION_DATA__DESTROY_AT :
				return destroyAt != null;
		}
		return eDynamicIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (isDestroyDuplicates: "); //$NON-NLS-1$
		result.append((eFlags & IS_DESTROY_DUPLICATES_EFLAG) != 0);
		result.append(')');
		return result.toString();
	}

} //LinkEndDestructionDataImpl
