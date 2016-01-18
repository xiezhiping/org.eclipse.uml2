/*
 * Copyright (c) 2005, 2016 IBM Corporation, Embarcadero Technologies, CEA, and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *   Kenn Hussey (Embarcadero Technologies) - 204200
 *   Kenn Hussey (CEA) - 327039, 418466, 451350, 485756
 *
 */
package org.eclipse.uml2.uml.internal.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.uml2.uml.Comment;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.StringExpression;
import org.eclipse.uml2.uml.TemplateParameter;
import org.eclipse.uml2.uml.TimeObservation;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.VisibilityKind;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Time Observation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.TimeObservationImpl#getEvent <em>Event</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.TimeObservationImpl#isFirstEvent <em>First Event</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TimeObservationImpl
		extends ObservationImpl
		implements TimeObservation {

	/**
	 * The cached value of the '{@link #getEvent() <em>Event</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvent()
	 * @generated
	 * @ordered
	 */
	protected NamedElement event;

	/**
	 * The default value of the '{@link #isFirstEvent() <em>First Event</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFirstEvent()
	 * @generated
	 * @ordered
	 */
	protected static final boolean FIRST_EVENT_EDEFAULT = true;

	/**
	 * The flag representing the value of the '{@link #isFirstEvent() <em>First Event</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFirstEvent()
	 * @generated
	 * @ordered
	 */
	protected static final int FIRST_EVENT_EFLAG = 1 << 12;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TimeObservationImpl() {
		super();
		eFlags |= FIRST_EVENT_EFLAG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UMLPackage.Literals.TIME_OBSERVATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamedElement getEvent() {
		if (event != null && event.eIsProxy()) {
			InternalEObject oldEvent = (InternalEObject) event;
			event = (NamedElement) eResolveProxy(oldEvent);
			if (event != oldEvent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
						UMLPackage.TIME_OBSERVATION__EVENT, oldEvent, event));
			}
		}
		return event;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamedElement basicGetEvent() {
		return event;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEvent(NamedElement newEvent) {
		NamedElement oldEvent = event;
		event = newEvent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.TIME_OBSERVATION__EVENT, oldEvent, event));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isFirstEvent() {
		return (eFlags & FIRST_EVENT_EFLAG) != 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFirstEvent(boolean newFirstEvent) {
		boolean oldFirstEvent = (eFlags & FIRST_EVENT_EFLAG) != 0;
		if (newFirstEvent)
			eFlags |= FIRST_EVENT_EFLAG;
		else
			eFlags &= ~FIRST_EVENT_EFLAG;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.TIME_OBSERVATION__FIRST_EVENT, oldFirstEvent,
				newFirstEvent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UMLPackage.TIME_OBSERVATION__EANNOTATIONS :
				return getEAnnotations();
			case UMLPackage.TIME_OBSERVATION__OWNED_COMMENT :
				return getOwnedComments();
			case UMLPackage.TIME_OBSERVATION__OWNED_ELEMENT :
				return getOwnedElements();
			case UMLPackage.TIME_OBSERVATION__OWNER :
				if (resolve)
					return getOwner();
				return basicGetOwner();
			case UMLPackage.TIME_OBSERVATION__CLIENT_DEPENDENCY :
				return getClientDependencies();
			case UMLPackage.TIME_OBSERVATION__NAME :
				return getName();
			case UMLPackage.TIME_OBSERVATION__NAME_EXPRESSION :
				if (resolve)
					return getNameExpression();
				return basicGetNameExpression();
			case UMLPackage.TIME_OBSERVATION__NAMESPACE :
				if (resolve)
					return getNamespace();
				return basicGetNamespace();
			case UMLPackage.TIME_OBSERVATION__QUALIFIED_NAME :
				return getQualifiedName();
			case UMLPackage.TIME_OBSERVATION__VISIBILITY :
				return getVisibility();
			case UMLPackage.TIME_OBSERVATION__OWNING_TEMPLATE_PARAMETER :
				if (resolve)
					return getOwningTemplateParameter();
				return basicGetOwningTemplateParameter();
			case UMLPackage.TIME_OBSERVATION__TEMPLATE_PARAMETER :
				if (resolve)
					return getTemplateParameter();
				return basicGetTemplateParameter();
			case UMLPackage.TIME_OBSERVATION__EVENT :
				if (resolve)
					return getEvent();
				return basicGetEvent();
			case UMLPackage.TIME_OBSERVATION__FIRST_EVENT :
				return isFirstEvent();
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
			case UMLPackage.TIME_OBSERVATION__EANNOTATIONS :
				getEAnnotations().clear();
				getEAnnotations()
					.addAll((Collection<? extends EAnnotation>) newValue);
				return;
			case UMLPackage.TIME_OBSERVATION__OWNED_COMMENT :
				getOwnedComments().clear();
				getOwnedComments()
					.addAll((Collection<? extends Comment>) newValue);
				return;
			case UMLPackage.TIME_OBSERVATION__NAME :
				setName((String) newValue);
				return;
			case UMLPackage.TIME_OBSERVATION__NAME_EXPRESSION :
				setNameExpression((StringExpression) newValue);
				return;
			case UMLPackage.TIME_OBSERVATION__VISIBILITY :
				setVisibility((VisibilityKind) newValue);
				return;
			case UMLPackage.TIME_OBSERVATION__OWNING_TEMPLATE_PARAMETER :
				setOwningTemplateParameter((TemplateParameter) newValue);
				return;
			case UMLPackage.TIME_OBSERVATION__TEMPLATE_PARAMETER :
				setTemplateParameter((TemplateParameter) newValue);
				return;
			case UMLPackage.TIME_OBSERVATION__EVENT :
				setEvent((NamedElement) newValue);
				return;
			case UMLPackage.TIME_OBSERVATION__FIRST_EVENT :
				setFirstEvent((Boolean) newValue);
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
			case UMLPackage.TIME_OBSERVATION__EANNOTATIONS :
				getEAnnotations().clear();
				return;
			case UMLPackage.TIME_OBSERVATION__OWNED_COMMENT :
				getOwnedComments().clear();
				return;
			case UMLPackage.TIME_OBSERVATION__NAME :
				unsetName();
				return;
			case UMLPackage.TIME_OBSERVATION__NAME_EXPRESSION :
				setNameExpression((StringExpression) null);
				return;
			case UMLPackage.TIME_OBSERVATION__VISIBILITY :
				unsetVisibility();
				return;
			case UMLPackage.TIME_OBSERVATION__OWNING_TEMPLATE_PARAMETER :
				setOwningTemplateParameter((TemplateParameter) null);
				return;
			case UMLPackage.TIME_OBSERVATION__TEMPLATE_PARAMETER :
				setTemplateParameter((TemplateParameter) null);
				return;
			case UMLPackage.TIME_OBSERVATION__EVENT :
				setEvent((NamedElement) null);
				return;
			case UMLPackage.TIME_OBSERVATION__FIRST_EVENT :
				setFirstEvent(FIRST_EVENT_EDEFAULT);
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
			case UMLPackage.TIME_OBSERVATION__EANNOTATIONS :
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UMLPackage.TIME_OBSERVATION__OWNED_COMMENT :
				return ownedComments != null && !ownedComments.isEmpty();
			case UMLPackage.TIME_OBSERVATION__OWNED_ELEMENT :
				return isSetOwnedElements();
			case UMLPackage.TIME_OBSERVATION__OWNER :
				return isSetOwner();
			case UMLPackage.TIME_OBSERVATION__CLIENT_DEPENDENCY :
				return !getClientDependencies().isEmpty();
			case UMLPackage.TIME_OBSERVATION__NAME :
				return isSetName();
			case UMLPackage.TIME_OBSERVATION__NAME_EXPRESSION :
				return nameExpression != null;
			case UMLPackage.TIME_OBSERVATION__NAMESPACE :
				return isSetNamespace();
			case UMLPackage.TIME_OBSERVATION__QUALIFIED_NAME :
				return QUALIFIED_NAME_EDEFAULT == null
					? getQualifiedName() != null
					: !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case UMLPackage.TIME_OBSERVATION__VISIBILITY :
				return isSetVisibility();
			case UMLPackage.TIME_OBSERVATION__OWNING_TEMPLATE_PARAMETER :
				return basicGetOwningTemplateParameter() != null;
			case UMLPackage.TIME_OBSERVATION__TEMPLATE_PARAMETER :
				return templateParameter != null;
			case UMLPackage.TIME_OBSERVATION__EVENT :
				return event != null;
			case UMLPackage.TIME_OBSERVATION__FIRST_EVENT :
				return ((eFlags
					& FIRST_EVENT_EFLAG) != 0) != FIRST_EVENT_EDEFAULT;
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
		result.append(" (firstEvent: "); //$NON-NLS-1$
		result.append((eFlags & FIRST_EVENT_EFLAG) != 0);
		result.append(')');
		return result.toString();
	}

} //TimeObservationImpl
