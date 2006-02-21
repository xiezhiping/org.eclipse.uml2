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
 * $Id: DurationObservationImpl.java,v 1.3 2006/02/21 16:12:17 khussey Exp $
 */
package org.eclipse.uml2.uml.internal.impl;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.eclipse.uml2.uml.DurationObservation;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.StringExpression;
import org.eclipse.uml2.uml.TemplateParameter;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.VisibilityKind;

import org.eclipse.uml2.uml.internal.operations.DurationObservationOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Duration Observation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.DurationObservationImpl#getEvents <em>Event</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.DurationObservationImpl#getFirstEvents <em>First Event</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DurationObservationImpl
		extends ObservationImpl
		implements DurationObservation {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DurationObservationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return UMLPackage.Literals.DURATION_OBSERVATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getEvents() {
		EList event = (EList) eVirtualGet(UMLPackage.DURATION_OBSERVATION__EVENT);
		if (event == null) {
			eVirtualSet(UMLPackage.DURATION_OBSERVATION__EVENT,
				event = new EObjectResolvingEList(NamedElement.class, this,
					UMLPackage.DURATION_OBSERVATION__EVENT));
		}
		return event;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamedElement getEvent(String name) {
		for (Iterator i = getEvents().iterator(); i.hasNext();) {
			NamedElement event = (NamedElement) i.next();
			if (name.equals(event.getName())) {
				return event;
			}
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getFirstEvents() {
		EList firstEvent = (EList) eVirtualGet(UMLPackage.DURATION_OBSERVATION__FIRST_EVENT);
		if (firstEvent == null) {
			eVirtualSet(UMLPackage.DURATION_OBSERVATION__FIRST_EVENT,
				firstEvent = new EDataTypeUniqueEList(Boolean.class, this,
					UMLPackage.DURATION_OBSERVATION__FIRST_EVENT));
		}
		return firstEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFirstEventMultiplicity(DiagnosticChain diagnostics,
			Map context) {
		return DurationObservationOperations.validateFirstEventMultiplicity(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UMLPackage.DURATION_OBSERVATION__EANNOTATIONS :
				return getEAnnotations();
			case UMLPackage.DURATION_OBSERVATION__OWNED_ELEMENT :
				return getOwnedElements();
			case UMLPackage.DURATION_OBSERVATION__OWNER :
				if (resolve)
					return getOwner();
				return basicGetOwner();
			case UMLPackage.DURATION_OBSERVATION__OWNED_COMMENT :
				return getOwnedComments();
			case UMLPackage.DURATION_OBSERVATION__NAME :
				return getName();
			case UMLPackage.DURATION_OBSERVATION__VISIBILITY :
				return getVisibility();
			case UMLPackage.DURATION_OBSERVATION__QUALIFIED_NAME :
				return getQualifiedName();
			case UMLPackage.DURATION_OBSERVATION__CLIENT_DEPENDENCY :
				return getClientDependencies();
			case UMLPackage.DURATION_OBSERVATION__NAMESPACE :
				if (resolve)
					return getNamespace();
				return basicGetNamespace();
			case UMLPackage.DURATION_OBSERVATION__NAME_EXPRESSION :
				if (resolve)
					return getNameExpression();
				return basicGetNameExpression();
			case UMLPackage.DURATION_OBSERVATION__OWNING_TEMPLATE_PARAMETER :
				if (resolve)
					return getOwningTemplateParameter();
				return basicGetOwningTemplateParameter();
			case UMLPackage.DURATION_OBSERVATION__TEMPLATE_PARAMETER :
				if (resolve)
					return getTemplateParameter();
				return basicGetTemplateParameter();
			case UMLPackage.DURATION_OBSERVATION__EVENT :
				return getEvents();
			case UMLPackage.DURATION_OBSERVATION__FIRST_EVENT :
				return getFirstEvents();
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
			case UMLPackage.DURATION_OBSERVATION__EANNOTATIONS :
				getEAnnotations().clear();
				getEAnnotations().addAll((Collection) newValue);
				return;
			case UMLPackage.DURATION_OBSERVATION__OWNED_COMMENT :
				getOwnedComments().clear();
				getOwnedComments().addAll((Collection) newValue);
				return;
			case UMLPackage.DURATION_OBSERVATION__NAME :
				setName((String) newValue);
				return;
			case UMLPackage.DURATION_OBSERVATION__VISIBILITY :
				setVisibility((VisibilityKind) newValue);
				return;
			case UMLPackage.DURATION_OBSERVATION__CLIENT_DEPENDENCY :
				getClientDependencies().clear();
				getClientDependencies().addAll((Collection) newValue);
				return;
			case UMLPackage.DURATION_OBSERVATION__NAME_EXPRESSION :
				setNameExpression((StringExpression) newValue);
				return;
			case UMLPackage.DURATION_OBSERVATION__OWNING_TEMPLATE_PARAMETER :
				setOwningTemplateParameter((TemplateParameter) newValue);
				return;
			case UMLPackage.DURATION_OBSERVATION__TEMPLATE_PARAMETER :
				setTemplateParameter((TemplateParameter) newValue);
				return;
			case UMLPackage.DURATION_OBSERVATION__EVENT :
				getEvents().clear();
				getEvents().addAll((Collection) newValue);
				return;
			case UMLPackage.DURATION_OBSERVATION__FIRST_EVENT :
				getFirstEvents().clear();
				getFirstEvents().addAll((Collection) newValue);
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
			case UMLPackage.DURATION_OBSERVATION__EANNOTATIONS :
				getEAnnotations().clear();
				return;
			case UMLPackage.DURATION_OBSERVATION__OWNED_COMMENT :
				getOwnedComments().clear();
				return;
			case UMLPackage.DURATION_OBSERVATION__NAME :
				unsetName();
				return;
			case UMLPackage.DURATION_OBSERVATION__VISIBILITY :
				unsetVisibility();
				return;
			case UMLPackage.DURATION_OBSERVATION__CLIENT_DEPENDENCY :
				getClientDependencies().clear();
				return;
			case UMLPackage.DURATION_OBSERVATION__NAME_EXPRESSION :
				setNameExpression((StringExpression) null);
				return;
			case UMLPackage.DURATION_OBSERVATION__OWNING_TEMPLATE_PARAMETER :
				setOwningTemplateParameter((TemplateParameter) null);
				return;
			case UMLPackage.DURATION_OBSERVATION__TEMPLATE_PARAMETER :
				setTemplateParameter((TemplateParameter) null);
				return;
			case UMLPackage.DURATION_OBSERVATION__EVENT :
				getEvents().clear();
				return;
			case UMLPackage.DURATION_OBSERVATION__FIRST_EVENT :
				getFirstEvents().clear();
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
			case UMLPackage.DURATION_OBSERVATION__EANNOTATIONS :
				EList eAnnotations = (EList) eVirtualGet(UMLPackage.DURATION_OBSERVATION__EANNOTATIONS);
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UMLPackage.DURATION_OBSERVATION__OWNED_ELEMENT :
				return isSetOwnedElements();
			case UMLPackage.DURATION_OBSERVATION__OWNER :
				return isSetOwner();
			case UMLPackage.DURATION_OBSERVATION__OWNED_COMMENT :
				EList ownedComment = (EList) eVirtualGet(UMLPackage.DURATION_OBSERVATION__OWNED_COMMENT);
				return ownedComment != null && !ownedComment.isEmpty();
			case UMLPackage.DURATION_OBSERVATION__NAME :
				return isSetName();
			case UMLPackage.DURATION_OBSERVATION__VISIBILITY :
				return isSetVisibility();
			case UMLPackage.DURATION_OBSERVATION__QUALIFIED_NAME :
				return QUALIFIED_NAME_EDEFAULT == null
					? getQualifiedName() != null
					: !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case UMLPackage.DURATION_OBSERVATION__CLIENT_DEPENDENCY :
				EList clientDependency = (EList) eVirtualGet(UMLPackage.DURATION_OBSERVATION__CLIENT_DEPENDENCY);
				return clientDependency != null && !clientDependency.isEmpty();
			case UMLPackage.DURATION_OBSERVATION__NAMESPACE :
				return isSetNamespace();
			case UMLPackage.DURATION_OBSERVATION__NAME_EXPRESSION :
				return eVirtualGet(UMLPackage.DURATION_OBSERVATION__NAME_EXPRESSION) != null;
			case UMLPackage.DURATION_OBSERVATION__OWNING_TEMPLATE_PARAMETER :
				return basicGetOwningTemplateParameter() != null;
			case UMLPackage.DURATION_OBSERVATION__TEMPLATE_PARAMETER :
				return eVirtualGet(UMLPackage.DURATION_OBSERVATION__TEMPLATE_PARAMETER) != null;
			case UMLPackage.DURATION_OBSERVATION__EVENT :
				EList event = (EList) eVirtualGet(UMLPackage.DURATION_OBSERVATION__EVENT);
				return event != null && !event.isEmpty();
			case UMLPackage.DURATION_OBSERVATION__FIRST_EVENT :
				EList firstEvent = (EList) eVirtualGet(UMLPackage.DURATION_OBSERVATION__FIRST_EVENT);
				return firstEvent != null && !firstEvent.isEmpty();
		}
		return eDynamicIsSet(featureID);
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
		result.append(" (firstEvent: "); //$NON-NLS-1$
		result
			.append(eVirtualGet(UMLPackage.DURATION_OBSERVATION__FIRST_EVENT));
		result.append(')');
		return result.toString();
	}

} //DurationObservationImpl
