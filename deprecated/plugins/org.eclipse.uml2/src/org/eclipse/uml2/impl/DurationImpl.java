/*
 * Copyright (c) 2003, 2004 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Common Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/cpl-v10.html
 *
 * Contributors:
 *   IBM - Initial API and implementation
 *
 * $Id: DurationImpl.java,v 1.2 2004/04/10 04:09:49 khussey Exp $
 */
package org.eclipse.uml2.impl;

import java.util.Collection;

import java.util.Iterator;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.uml2.Duration;
import org.eclipse.uml2.NamedElement;
import org.eclipse.uml2.StringExpression;
import org.eclipse.uml2.TemplateParameter;
import org.eclipse.uml2.TemplateSignature;
import org.eclipse.uml2.Type;
import org.eclipse.uml2.UML2Package;
import org.eclipse.uml2.VisibilityKind;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Duration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2.impl.DurationImpl#isFirstTime <em>First Time</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.DurationImpl#getEvents <em>Event</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DurationImpl extends ValueSpecificationImpl implements Duration {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2003, 2004 IBM Corporation and others."; //$NON-NLS-1$

	/**
	 * The default value of the '{@link #isFirstTime() <em>First Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFirstTime()
	 * @generated
	 * @ordered
	 */
	protected static final boolean FIRST_TIME_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isFirstTime() <em>First Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFirstTime()
	 * @generated
	 * @ordered
	 */
	protected boolean firstTime = FIRST_TIME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getEvents() <em>Event</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvents()
	 * @generated
	 * @ordered
	 */
	protected EList event = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DurationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return UML2Package.eINSTANCE.getDuration();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * Returns the value of the '<em><b>First Time</b></em>' attribute.
	 * @generated
	 */
	public boolean isFirstTime() {
		return firstTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFirstTime(boolean newFirstTime) {
		boolean oldFirstTime = firstTime;
		firstTime = newFirstTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2Package.DURATION__FIRST_TIME, oldFirstTime, firstTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * Returns the value of the '<em><b>Event</b></em>' reference list.
	 * @generated
	 */
	public EList getEvents() {
		if (event == null) {
			event = new EObjectResolvingEList(NamedElement.class, this, UML2Package.DURATION__EVENT);
		}
		return event;
	}

    /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
     */
    public NamedElement getEvent(String unqualifiedName) {
    	for (Iterator i = getEvents().iterator(); i.hasNext(); ) {
    		NamedElement namedEvent = (NamedElement) i.next();
    		
    		if (unqualifiedName.equals(namedEvent.getName())) {
    			return namedEvent;
    		}
    	}
    	
    	return null;
    }
      
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, Class baseClass, NotificationChain msgs) {
		if (featureID >= 0) {
			switch (eDerivedStructuralFeatureID(featureID, baseClass)) {
				case UML2Package.DURATION__EANNOTATIONS:
					return ((InternalEList)getEAnnotations()).basicAdd(otherEnd, msgs);
				case UML2Package.DURATION__TEMPLATE_BINDING:
					return ((InternalEList)getTemplateBindings()).basicAdd(otherEnd, msgs);
				case UML2Package.DURATION__OWNED_TEMPLATE_SIGNATURE:
					if (ownedTemplateSignature != null)
						msgs = ((InternalEObject)ownedTemplateSignature).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UML2Package.DURATION__OWNED_TEMPLATE_SIGNATURE, null, msgs);
					return basicSetOwnedTemplateSignature((TemplateSignature)otherEnd, msgs);
				case UML2Package.DURATION__CLIENT_DEPENDENCY:
					return ((InternalEList)getClientDependencies()).basicAdd(otherEnd, msgs);
				case UML2Package.DURATION__TEMPLATE_PARAMETER:
					if (templateParameter != null)
						msgs = ((InternalEObject)templateParameter).eInverseRemove(this, UML2Package.TEMPLATE_PARAMETER__PARAMETERED_ELEMENT, TemplateParameter.class, msgs);
					return basicSetTemplateParameter((TemplateParameter)otherEnd, msgs);
				case UML2Package.DURATION__OWNING_PARAMETER:
					if (eContainer != null)
						msgs = eBasicRemoveFromContainer(msgs);
					return eBasicSetContainer(otherEnd, UML2Package.DURATION__OWNING_PARAMETER, msgs);
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
				case UML2Package.DURATION__EANNOTATIONS:
					return ((InternalEList)getEAnnotations()).basicRemove(otherEnd, msgs);
				case UML2Package.DURATION__OWNED_COMMENT:
					return ((InternalEList)getOwnedComments()).basicRemove(otherEnd, msgs);
				case UML2Package.DURATION__TEMPLATE_BINDING:
					return ((InternalEList)getTemplateBindings()).basicRemove(otherEnd, msgs);
				case UML2Package.DURATION__OWNED_TEMPLATE_SIGNATURE:
					return basicSetOwnedTemplateSignature(null, msgs);
				case UML2Package.DURATION__CLIENT_DEPENDENCY:
					return ((InternalEList)getClientDependencies()).basicRemove(otherEnd, msgs);
				case UML2Package.DURATION__NAME_EXPRESSION:
					return basicSetNameExpression(null, msgs);
				case UML2Package.DURATION__TEMPLATE_PARAMETER:
					return basicSetTemplateParameter(null, msgs);
				case UML2Package.DURATION__OWNING_PARAMETER:
					return eBasicSetContainer(null, UML2Package.DURATION__OWNING_PARAMETER, msgs);
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
				case UML2Package.DURATION__OWNING_PARAMETER:
					return eContainer.eInverseRemove(this, UML2Package.TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT, TemplateParameter.class, msgs);
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
			case UML2Package.DURATION__EANNOTATIONS:
				return getEAnnotations();
			case UML2Package.DURATION__OWNED_ELEMENT:
				return getOwnedElements();
			case UML2Package.DURATION__OWNER:
				if (resolve) return getOwner();
				return basicGetOwner();
			case UML2Package.DURATION__OWNED_COMMENT:
				return getOwnedComments();
			case UML2Package.DURATION__TEMPLATE_BINDING:
				return getTemplateBindings();
			case UML2Package.DURATION__OWNED_TEMPLATE_SIGNATURE:
				return getOwnedTemplateSignature();
			case UML2Package.DURATION__NAME:
				return getName();
			case UML2Package.DURATION__QUALIFIED_NAME:
				return getQualifiedName();
			case UML2Package.DURATION__VISIBILITY:
				return getVisibility();
			case UML2Package.DURATION__CLIENT_DEPENDENCY:
				return getClientDependencies();
			case UML2Package.DURATION__NAME_EXPRESSION:
				return getNameExpression();
			case UML2Package.DURATION__TYPE:
				if (resolve) return getType();
				return basicGetType();
			case UML2Package.DURATION__TEMPLATE_PARAMETER:
				if (resolve) return getTemplateParameter();
				return basicGetTemplateParameter();
			case UML2Package.DURATION__OWNING_PARAMETER:
				return getOwningParameter();
			case UML2Package.DURATION__FIRST_TIME:
				return isFirstTime() ? Boolean.TRUE : Boolean.FALSE;
			case UML2Package.DURATION__EVENT:
				return getEvents();
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
			case UML2Package.DURATION__EANNOTATIONS:
				getEAnnotations().clear();
				getEAnnotations().addAll((Collection)newValue);
				return;
			case UML2Package.DURATION__OWNED_COMMENT:
				getOwnedComments().clear();
				getOwnedComments().addAll((Collection)newValue);
				return;
			case UML2Package.DURATION__TEMPLATE_BINDING:
				getTemplateBindings().clear();
				getTemplateBindings().addAll((Collection)newValue);
				return;
			case UML2Package.DURATION__OWNED_TEMPLATE_SIGNATURE:
				setOwnedTemplateSignature((TemplateSignature)newValue);
				return;
			case UML2Package.DURATION__NAME:
				setName((String)newValue);
				return;
			case UML2Package.DURATION__VISIBILITY:
				setVisibility((VisibilityKind)newValue);
				return;
			case UML2Package.DURATION__CLIENT_DEPENDENCY:
				getClientDependencies().clear();
				getClientDependencies().addAll((Collection)newValue);
				return;
			case UML2Package.DURATION__NAME_EXPRESSION:
				setNameExpression((StringExpression)newValue);
				return;
			case UML2Package.DURATION__TYPE:
				setType((Type)newValue);
				return;
			case UML2Package.DURATION__TEMPLATE_PARAMETER:
				setTemplateParameter((TemplateParameter)newValue);
				return;
			case UML2Package.DURATION__OWNING_PARAMETER:
				setOwningParameter((TemplateParameter)newValue);
				return;
			case UML2Package.DURATION__FIRST_TIME:
				setFirstTime(((Boolean)newValue).booleanValue());
				return;
			case UML2Package.DURATION__EVENT:
				getEvents().clear();
				getEvents().addAll((Collection)newValue);
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
			case UML2Package.DURATION__EANNOTATIONS:
				getEAnnotations().clear();
				return;
			case UML2Package.DURATION__OWNED_COMMENT:
				getOwnedComments().clear();
				return;
			case UML2Package.DURATION__TEMPLATE_BINDING:
				getTemplateBindings().clear();
				return;
			case UML2Package.DURATION__OWNED_TEMPLATE_SIGNATURE:
				setOwnedTemplateSignature((TemplateSignature)null);
				return;
			case UML2Package.DURATION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case UML2Package.DURATION__VISIBILITY:
				setVisibility(VISIBILITY_EDEFAULT);
				return;
			case UML2Package.DURATION__CLIENT_DEPENDENCY:
				getClientDependencies().clear();
				return;
			case UML2Package.DURATION__NAME_EXPRESSION:
				setNameExpression((StringExpression)null);
				return;
			case UML2Package.DURATION__TYPE:
				setType((Type)null);
				return;
			case UML2Package.DURATION__TEMPLATE_PARAMETER:
				setTemplateParameter((TemplateParameter)null);
				return;
			case UML2Package.DURATION__OWNING_PARAMETER:
				setOwningParameter(null);
				return;
			case UML2Package.DURATION__FIRST_TIME:
				setFirstTime(FIRST_TIME_EDEFAULT);
				return;
			case UML2Package.DURATION__EVENT:
				getEvents().clear();
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
			case UML2Package.DURATION__EANNOTATIONS:
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UML2Package.DURATION__OWNED_ELEMENT:
				return !getOwnedElements().isEmpty();
			case UML2Package.DURATION__OWNER:
				return basicGetOwner() != null;
			case UML2Package.DURATION__OWNED_COMMENT:
				return ownedComment != null && !ownedComment.isEmpty();
			case UML2Package.DURATION__TEMPLATE_BINDING:
				return templateBinding != null && !templateBinding.isEmpty();
			case UML2Package.DURATION__OWNED_TEMPLATE_SIGNATURE:
				return ownedTemplateSignature != null;
			case UML2Package.DURATION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case UML2Package.DURATION__QUALIFIED_NAME:
				return !"".equals(getQualifiedName()); //$NON-NLS-1$
			case UML2Package.DURATION__VISIBILITY:
				return visibility != VISIBILITY_EDEFAULT;
			case UML2Package.DURATION__CLIENT_DEPENDENCY:
				return clientDependency != null && !clientDependency.isEmpty();
			case UML2Package.DURATION__NAME_EXPRESSION:
				return nameExpression != null;
			case UML2Package.DURATION__TYPE:
				return type != null;
			case UML2Package.DURATION__TEMPLATE_PARAMETER:
				return templateParameter != null;
			case UML2Package.DURATION__OWNING_PARAMETER:
				return getOwningParameter() != null;
			case UML2Package.DURATION__FIRST_TIME:
				return firstTime != FIRST_TIME_EDEFAULT;
			case UML2Package.DURATION__EVENT:
				return event != null && !event.isEmpty();
		}
		return eDynamicIsSet(eFeature);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (firstTime: "); //$NON-NLS-1$
		result.append(firstTime);
		result.append(')');
		return result.toString();
	}

} //DurationImpl
