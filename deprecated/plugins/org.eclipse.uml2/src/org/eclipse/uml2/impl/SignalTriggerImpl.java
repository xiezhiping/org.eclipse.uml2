/*
 * Copyright (c) 2003, 2006 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *
 * $Id: SignalTriggerImpl.java,v 1.15 2006/04/10 20:40:17 khussey Exp $
 */
package org.eclipse.uml2.impl;

import java.util.Collection;

import java.util.Iterator;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.uml2.Signal;
import org.eclipse.uml2.SignalTrigger;
import org.eclipse.uml2.StringExpression;
import org.eclipse.uml2.TemplateSignature;
import org.eclipse.uml2.UML2Package;

import org.eclipse.uml2.VisibilityKind;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Signal Trigger</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2.impl.SignalTriggerImpl#getSignals <em>Signal</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SignalTriggerImpl extends MessageTriggerImpl implements SignalTrigger {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) IBM Corporation and others."; //$NON-NLS-1$

	/**
	 * The cached value of the '{@link #getSignals() <em>Signal</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSignals()
	 * @generated
	 * @ordered
	 */
	protected EList signals = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SignalTriggerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return UML2Package.Literals.SIGNAL_TRIGGER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getSignals() {
		if (signals == null) {
			signals = new EObjectResolvingEList(Signal.class, this, UML2Package.SIGNAL_TRIGGER__SIGNAL);
		}
		return signals;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
    public Signal getSignal(String name) {
		return getSignal(name, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Signal getSignal(String name, boolean ignoreCase) {
		signalLoop: for (Iterator i = getSignals().iterator(); i.hasNext(); ) {
			Signal signal = (Signal) i.next();
			if (name != null && !(ignoreCase ? name.equalsIgnoreCase(signal.getName()) : name.equals(signal.getName())))
				continue signalLoop;
			return signal;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UML2Package.SIGNAL_TRIGGER__EANNOTATIONS:
				return getEAnnotations();
			case UML2Package.SIGNAL_TRIGGER__OWNED_ELEMENT:
				return getOwnedElements();
			case UML2Package.SIGNAL_TRIGGER__OWNER:
				if (resolve) return getOwner();
				return basicGetOwner();
			case UML2Package.SIGNAL_TRIGGER__OWNED_COMMENT:
				return getOwnedComments();
			case UML2Package.SIGNAL_TRIGGER__TEMPLATE_BINDING:
				return getTemplateBindings();
			case UML2Package.SIGNAL_TRIGGER__OWNED_TEMPLATE_SIGNATURE:
				return getOwnedTemplateSignature();
			case UML2Package.SIGNAL_TRIGGER__NAME:
				return getName();
			case UML2Package.SIGNAL_TRIGGER__QUALIFIED_NAME:
				return getQualifiedName();
			case UML2Package.SIGNAL_TRIGGER__VISIBILITY:
				return getVisibility();
			case UML2Package.SIGNAL_TRIGGER__CLIENT_DEPENDENCY:
				return getClientDependencies();
			case UML2Package.SIGNAL_TRIGGER__NAME_EXPRESSION:
				return getNameExpression();
			case UML2Package.SIGNAL_TRIGGER__PORT:
				return getPorts();
			case UML2Package.SIGNAL_TRIGGER__SIGNAL:
				return getSignals();
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
			case UML2Package.SIGNAL_TRIGGER__EANNOTATIONS:
				getEAnnotations().clear();
				getEAnnotations().addAll((Collection)newValue);
				return;
			case UML2Package.SIGNAL_TRIGGER__OWNED_COMMENT:
				getOwnedComments().clear();
				getOwnedComments().addAll((Collection)newValue);
				return;
			case UML2Package.SIGNAL_TRIGGER__TEMPLATE_BINDING:
				getTemplateBindings().clear();
				getTemplateBindings().addAll((Collection)newValue);
				return;
			case UML2Package.SIGNAL_TRIGGER__OWNED_TEMPLATE_SIGNATURE:
				setOwnedTemplateSignature((TemplateSignature)newValue);
				return;
			case UML2Package.SIGNAL_TRIGGER__NAME:
				setName((String)newValue);
				return;
			case UML2Package.SIGNAL_TRIGGER__VISIBILITY:
				setVisibility((VisibilityKind)newValue);
				return;
			case UML2Package.SIGNAL_TRIGGER__CLIENT_DEPENDENCY:
				getClientDependencies().clear();
				getClientDependencies().addAll((Collection)newValue);
				return;
			case UML2Package.SIGNAL_TRIGGER__NAME_EXPRESSION:
				setNameExpression((StringExpression)newValue);
				return;
			case UML2Package.SIGNAL_TRIGGER__PORT:
				getPorts().clear();
				getPorts().addAll((Collection)newValue);
				return;
			case UML2Package.SIGNAL_TRIGGER__SIGNAL:
				getSignals().clear();
				getSignals().addAll((Collection)newValue);
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
			case UML2Package.SIGNAL_TRIGGER__EANNOTATIONS:
				getEAnnotations().clear();
				return;
			case UML2Package.SIGNAL_TRIGGER__OWNED_COMMENT:
				getOwnedComments().clear();
				return;
			case UML2Package.SIGNAL_TRIGGER__TEMPLATE_BINDING:
				getTemplateBindings().clear();
				return;
			case UML2Package.SIGNAL_TRIGGER__OWNED_TEMPLATE_SIGNATURE:
				setOwnedTemplateSignature((TemplateSignature)null);
				return;
			case UML2Package.SIGNAL_TRIGGER__NAME:
				setName(NAME_EDEFAULT);
				return;
			case UML2Package.SIGNAL_TRIGGER__VISIBILITY:
				setVisibility(VISIBILITY_EDEFAULT);
				return;
			case UML2Package.SIGNAL_TRIGGER__CLIENT_DEPENDENCY:
				getClientDependencies().clear();
				return;
			case UML2Package.SIGNAL_TRIGGER__NAME_EXPRESSION:
				setNameExpression((StringExpression)null);
				return;
			case UML2Package.SIGNAL_TRIGGER__PORT:
				getPorts().clear();
				return;
			case UML2Package.SIGNAL_TRIGGER__SIGNAL:
				getSignals().clear();
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
			case UML2Package.SIGNAL_TRIGGER__EANNOTATIONS:
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UML2Package.SIGNAL_TRIGGER__OWNED_ELEMENT:
				return isSetOwnedElements();
			case UML2Package.SIGNAL_TRIGGER__OWNER:
				return isSetOwner();
			case UML2Package.SIGNAL_TRIGGER__OWNED_COMMENT:
				return ownedComments != null && !ownedComments.isEmpty();
			case UML2Package.SIGNAL_TRIGGER__TEMPLATE_BINDING:
				return templateBindings != null && !templateBindings.isEmpty();
			case UML2Package.SIGNAL_TRIGGER__OWNED_TEMPLATE_SIGNATURE:
				return ownedTemplateSignature != null;
			case UML2Package.SIGNAL_TRIGGER__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case UML2Package.SIGNAL_TRIGGER__QUALIFIED_NAME:
				return QUALIFIED_NAME_EDEFAULT == null ? getQualifiedName() != null : !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case UML2Package.SIGNAL_TRIGGER__VISIBILITY:
				return visibility != VISIBILITY_EDEFAULT;
			case UML2Package.SIGNAL_TRIGGER__CLIENT_DEPENDENCY:
				return clientDependencies != null && !clientDependencies.isEmpty();
			case UML2Package.SIGNAL_TRIGGER__NAME_EXPRESSION:
				return nameExpression != null;
			case UML2Package.SIGNAL_TRIGGER__PORT:
				return ports != null && !ports.isEmpty();
			case UML2Package.SIGNAL_TRIGGER__SIGNAL:
				return signals != null && !signals.isEmpty();
		}
		return eDynamicIsSet(featureID);
	}


} //SignalTriggerImpl
