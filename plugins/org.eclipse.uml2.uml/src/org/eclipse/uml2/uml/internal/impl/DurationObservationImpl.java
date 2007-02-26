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
 * $Id: DurationObservationImpl.java,v 1.7 2007/02/26 16:17:56 khussey Exp $
 */
package org.eclipse.uml2.uml.internal.impl;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.eclipse.uml2.uml.Comment;
import org.eclipse.uml2.uml.Dependency;
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
	 * The cached value of the '{@link #getEvents() <em>Event</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvents()
	 * @generated
	 * @ordered
	 */
	protected EList<NamedElement> events;

	/**
	 * The cached value of the '{@link #getFirstEvents() <em>First Event</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirstEvents()
	 * @generated
	 * @ordered
	 */
	protected EList<Boolean> firstEvents;

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
	@Override
	protected EClass eStaticClass() {
		return UMLPackage.Literals.DURATION_OBSERVATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NamedElement> getEvents() {
		if (events == null) {
			events = new EObjectResolvingEList<NamedElement>(
				NamedElement.class, this,
				UMLPackage.DURATION_OBSERVATION__EVENT);
		}
		return events;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamedElement getEvent(String name) {
		return getEvent(name, false, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamedElement getEvent(String name, boolean ignoreCase, EClass eClass) {
		eventLoop : for (NamedElement event : getEvents()) {
			if (eClass != null && !eClass.isInstance(event))
				continue eventLoop;
			if (name != null && !(ignoreCase
				? name.equalsIgnoreCase(event.getName())
				: name.equals(event.getName())))
				continue eventLoop;
			return event;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Boolean> getFirstEvents() {
		if (firstEvents == null) {
			firstEvents = new EDataTypeUniqueEList<Boolean>(Boolean.class,
				this, UMLPackage.DURATION_OBSERVATION__FIRST_EVENT);
		}
		return firstEvents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFirstEventMultiplicity(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return DurationObservationOperations.validateFirstEventMultiplicity(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
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
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case UMLPackage.DURATION_OBSERVATION__EANNOTATIONS :
				getEAnnotations().clear();
				getEAnnotations().addAll(
					(Collection<? extends EAnnotation>) newValue);
				return;
			case UMLPackage.DURATION_OBSERVATION__OWNED_COMMENT :
				getOwnedComments().clear();
				getOwnedComments().addAll(
					(Collection<? extends Comment>) newValue);
				return;
			case UMLPackage.DURATION_OBSERVATION__NAME :
				setName((String) newValue);
				return;
			case UMLPackage.DURATION_OBSERVATION__VISIBILITY :
				setVisibility((VisibilityKind) newValue);
				return;
			case UMLPackage.DURATION_OBSERVATION__CLIENT_DEPENDENCY :
				getClientDependencies().clear();
				getClientDependencies().addAll(
					(Collection<? extends Dependency>) newValue);
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
				getEvents().addAll(
					(Collection<? extends NamedElement>) newValue);
				return;
			case UMLPackage.DURATION_OBSERVATION__FIRST_EVENT :
				getFirstEvents().clear();
				getFirstEvents().addAll(
					(Collection<? extends Boolean>) newValue);
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
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case UMLPackage.DURATION_OBSERVATION__EANNOTATIONS :
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UMLPackage.DURATION_OBSERVATION__OWNED_ELEMENT :
				return isSetOwnedElements();
			case UMLPackage.DURATION_OBSERVATION__OWNER :
				return isSetOwner();
			case UMLPackage.DURATION_OBSERVATION__OWNED_COMMENT :
				return ownedComments != null && !ownedComments.isEmpty();
			case UMLPackage.DURATION_OBSERVATION__NAME :
				return isSetName();
			case UMLPackage.DURATION_OBSERVATION__VISIBILITY :
				return isSetVisibility();
			case UMLPackage.DURATION_OBSERVATION__QUALIFIED_NAME :
				return QUALIFIED_NAME_EDEFAULT == null
					? getQualifiedName() != null
					: !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case UMLPackage.DURATION_OBSERVATION__CLIENT_DEPENDENCY :
				return clientDependencies != null
					&& !clientDependencies.isEmpty();
			case UMLPackage.DURATION_OBSERVATION__NAMESPACE :
				return isSetNamespace();
			case UMLPackage.DURATION_OBSERVATION__NAME_EXPRESSION :
				return nameExpression != null;
			case UMLPackage.DURATION_OBSERVATION__OWNING_TEMPLATE_PARAMETER :
				return basicGetOwningTemplateParameter() != null;
			case UMLPackage.DURATION_OBSERVATION__TEMPLATE_PARAMETER :
				return templateParameter != null;
			case UMLPackage.DURATION_OBSERVATION__EVENT :
				return events != null && !events.isEmpty();
			case UMLPackage.DURATION_OBSERVATION__FIRST_EVENT :
				return firstEvents != null && !firstEvents.isEmpty();
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
		result.append(firstEvents);
		result.append(')');
		return result.toString();
	}

} //DurationObservationImpl
