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
 * $Id: InteractionConstraintImpl.java,v 1.22 2007/01/31 21:21:16 khussey Exp $
 */
package org.eclipse.uml2.uml.internal.impl;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.uml2.common.util.CacheAdapter;
import org.eclipse.uml2.common.util.DerivedUnionEObjectEList;

import org.eclipse.uml2.uml.Comment;
import org.eclipse.uml2.uml.Dependency;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.InteractionConstraint;
import org.eclipse.uml2.uml.Namespace;
import org.eclipse.uml2.uml.StringExpression;
import org.eclipse.uml2.uml.TemplateParameter;
import org.eclipse.uml2.uml.Type;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.ValueSpecification;
import org.eclipse.uml2.uml.VisibilityKind;

import org.eclipse.uml2.uml.internal.operations.InteractionConstraintOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Interaction Constraint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.InteractionConstraintImpl#getOwnedElements <em>Owned Element</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.InteractionConstraintImpl#getMinint <em>Minint</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.InteractionConstraintImpl#getMaxint <em>Maxint</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InteractionConstraintImpl
		extends ConstraintImpl
		implements InteractionConstraint {

	/**
	 * The cached value of the '{@link #getMinint() <em>Minint</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinint()
	 * @generated
	 * @ordered
	 */
	protected ValueSpecification minint = null;

	/**
	 * The cached value of the '{@link #getMaxint() <em>Maxint</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxint()
	 * @generated
	 * @ordered
	 */
	protected ValueSpecification maxint = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InteractionConstraintImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UMLPackage.Literals.INTERACTION_CONSTRAINT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Element> getOwnedElements() {

		CacheAdapter cache = getCacheAdapter();
		if (cache != null) {
			Resource eResource = eResource();
			@SuppressWarnings("unchecked")
			EList<Element> ownedElements = (EList<Element>) cache.get(
				eResource, this, UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
			if (ownedElements == null) {
				cache.put(eResource, this,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT,
					ownedElements = new DerivedUnionEObjectEList<Element>(
						Element.class, this,
						UMLPackage.INTERACTION_CONSTRAINT__OWNED_ELEMENT,
						OWNED_ELEMENT_ESUBSETS));
			}
			return ownedElements;
		}
		return new DerivedUnionEObjectEList<Element>(Element.class, this,
			UMLPackage.INTERACTION_CONSTRAINT__OWNED_ELEMENT,
			OWNED_ELEMENT_ESUBSETS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueSpecification getMinint() {
		if (minint != null && minint.eIsProxy()) {
			InternalEObject oldMinint = (InternalEObject) minint;
			minint = (ValueSpecification) eResolveProxy(oldMinint);
			if (minint != oldMinint) {
				InternalEObject newMinint = (InternalEObject) minint;
				NotificationChain msgs = oldMinint
					.eInverseRemove(this, EOPPOSITE_FEATURE_BASE
						- UMLPackage.INTERACTION_CONSTRAINT__MININT, null, null);
				if (newMinint.eInternalContainer() == null) {
					msgs = newMinint
						.eInverseAdd(this, EOPPOSITE_FEATURE_BASE
							- UMLPackage.INTERACTION_CONSTRAINT__MININT, null,
							msgs);
				}
				if (msgs != null)
					msgs.dispatch();
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
						UMLPackage.INTERACTION_CONSTRAINT__MININT, oldMinint,
						minint));
			}
		}
		return minint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueSpecification basicGetMinint() {
		return minint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMinint(ValueSpecification newMinint,
			NotificationChain msgs) {
		ValueSpecification oldMinint = minint;
		minint = newMinint;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
				Notification.SET, UMLPackage.INTERACTION_CONSTRAINT__MININT,
				oldMinint, newMinint);
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
	public void setMinint(ValueSpecification newMinint) {

		if (newMinint != minint) {
			NotificationChain msgs = null;
			if (minint != null)
				msgs = ((InternalEObject) minint)
					.eInverseRemove(this, EOPPOSITE_FEATURE_BASE
						- UMLPackage.INTERACTION_CONSTRAINT__MININT, null, msgs);
			if (newMinint != null)
				msgs = ((InternalEObject) newMinint)
					.eInverseAdd(this, EOPPOSITE_FEATURE_BASE
						- UMLPackage.INTERACTION_CONSTRAINT__MININT, null, msgs);
			msgs = basicSetMinint(newMinint, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.INTERACTION_CONSTRAINT__MININT, newMinint, newMinint));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueSpecification createMinint(String name, Type type, EClass eClass) {
		ValueSpecification newMinint = (ValueSpecification) create(eClass);
		setMinint(newMinint);
		if (name != null)
			newMinint.setName(name);
		if (type != null)
			newMinint.setType(type);
		return newMinint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueSpecification getMaxint() {
		if (maxint != null && maxint.eIsProxy()) {
			InternalEObject oldMaxint = (InternalEObject) maxint;
			maxint = (ValueSpecification) eResolveProxy(oldMaxint);
			if (maxint != oldMaxint) {
				InternalEObject newMaxint = (InternalEObject) maxint;
				NotificationChain msgs = oldMaxint
					.eInverseRemove(this, EOPPOSITE_FEATURE_BASE
						- UMLPackage.INTERACTION_CONSTRAINT__MAXINT, null, null);
				if (newMaxint.eInternalContainer() == null) {
					msgs = newMaxint
						.eInverseAdd(this, EOPPOSITE_FEATURE_BASE
							- UMLPackage.INTERACTION_CONSTRAINT__MAXINT, null,
							msgs);
				}
				if (msgs != null)
					msgs.dispatch();
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
						UMLPackage.INTERACTION_CONSTRAINT__MAXINT, oldMaxint,
						maxint));
			}
		}
		return maxint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueSpecification basicGetMaxint() {
		return maxint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMaxint(ValueSpecification newMaxint,
			NotificationChain msgs) {
		ValueSpecification oldMaxint = maxint;
		maxint = newMaxint;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
				Notification.SET, UMLPackage.INTERACTION_CONSTRAINT__MAXINT,
				oldMaxint, newMaxint);
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
	public void setMaxint(ValueSpecification newMaxint) {

		if (newMaxint != maxint) {
			NotificationChain msgs = null;
			if (maxint != null)
				msgs = ((InternalEObject) maxint)
					.eInverseRemove(this, EOPPOSITE_FEATURE_BASE
						- UMLPackage.INTERACTION_CONSTRAINT__MAXINT, null, msgs);
			if (newMaxint != null)
				msgs = ((InternalEObject) newMaxint)
					.eInverseAdd(this, EOPPOSITE_FEATURE_BASE
						- UMLPackage.INTERACTION_CONSTRAINT__MAXINT, null, msgs);
			msgs = basicSetMaxint(newMaxint, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.INTERACTION_CONSTRAINT__MAXINT, newMaxint, newMaxint));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueSpecification createMaxint(String name, Type type, EClass eClass) {
		ValueSpecification newMaxint = (ValueSpecification) create(eClass);
		setMaxint(newMaxint);
		if (name != null)
			newMaxint.setName(name);
		if (type != null)
			newMaxint.setType(type);
		return newMaxint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDynamicVariables(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return InteractionConstraintOperations.validateDynamicVariables(this,
			diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGlobalData(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return InteractionConstraintOperations.validateGlobalData(this,
			diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMinintMaxint(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return InteractionConstraintOperations.validateMinintMaxint(this,
			diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMinintNonNegative(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return InteractionConstraintOperations.validateMinintNonNegative(this,
			diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMaxintPositive(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return InteractionConstraintOperations.validateMaxintPositive(this,
			diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMaxintGreaterEqualMinint(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return InteractionConstraintOperations
			.validateMaxintGreaterEqualMinint(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UMLPackage.INTERACTION_CONSTRAINT__EANNOTATIONS :
				return ((InternalEList<?>) getEAnnotations()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.INTERACTION_CONSTRAINT__OWNED_COMMENT :
				return ((InternalEList<?>) getOwnedComments()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.INTERACTION_CONSTRAINT__CLIENT_DEPENDENCY :
				return ((InternalEList<?>) getClientDependencies())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.INTERACTION_CONSTRAINT__NAME_EXPRESSION :
				return basicSetNameExpression(null, msgs);
			case UMLPackage.INTERACTION_CONSTRAINT__OWNING_TEMPLATE_PARAMETER :
				return basicSetOwningTemplateParameter(null, msgs);
			case UMLPackage.INTERACTION_CONSTRAINT__TEMPLATE_PARAMETER :
				return basicSetTemplateParameter(null, msgs);
			case UMLPackage.INTERACTION_CONSTRAINT__SPECIFICATION :
				return basicSetSpecification(null, msgs);
			case UMLPackage.INTERACTION_CONSTRAINT__CONTEXT :
				return basicSetContext(null, msgs);
			case UMLPackage.INTERACTION_CONSTRAINT__MININT :
				return basicSetMinint(null, msgs);
			case UMLPackage.INTERACTION_CONSTRAINT__MAXINT :
				return basicSetMaxint(null, msgs);
		}
		return eDynamicInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UMLPackage.INTERACTION_CONSTRAINT__EANNOTATIONS :
				return getEAnnotations();
			case UMLPackage.INTERACTION_CONSTRAINT__OWNED_ELEMENT :
				return getOwnedElements();
			case UMLPackage.INTERACTION_CONSTRAINT__OWNER :
				if (resolve)
					return getOwner();
				return basicGetOwner();
			case UMLPackage.INTERACTION_CONSTRAINT__OWNED_COMMENT :
				return getOwnedComments();
			case UMLPackage.INTERACTION_CONSTRAINT__NAME :
				return getName();
			case UMLPackage.INTERACTION_CONSTRAINT__VISIBILITY :
				return getVisibility();
			case UMLPackage.INTERACTION_CONSTRAINT__QUALIFIED_NAME :
				return getQualifiedName();
			case UMLPackage.INTERACTION_CONSTRAINT__CLIENT_DEPENDENCY :
				return getClientDependencies();
			case UMLPackage.INTERACTION_CONSTRAINT__NAMESPACE :
				if (resolve)
					return getNamespace();
				return basicGetNamespace();
			case UMLPackage.INTERACTION_CONSTRAINT__NAME_EXPRESSION :
				if (resolve)
					return getNameExpression();
				return basicGetNameExpression();
			case UMLPackage.INTERACTION_CONSTRAINT__OWNING_TEMPLATE_PARAMETER :
				if (resolve)
					return getOwningTemplateParameter();
				return basicGetOwningTemplateParameter();
			case UMLPackage.INTERACTION_CONSTRAINT__TEMPLATE_PARAMETER :
				if (resolve)
					return getTemplateParameter();
				return basicGetTemplateParameter();
			case UMLPackage.INTERACTION_CONSTRAINT__CONSTRAINED_ELEMENT :
				return getConstrainedElements();
			case UMLPackage.INTERACTION_CONSTRAINT__SPECIFICATION :
				if (resolve)
					return getSpecification();
				return basicGetSpecification();
			case UMLPackage.INTERACTION_CONSTRAINT__CONTEXT :
				if (resolve)
					return getContext();
				return basicGetContext();
			case UMLPackage.INTERACTION_CONSTRAINT__MININT :
				if (resolve)
					return getMinint();
				return basicGetMinint();
			case UMLPackage.INTERACTION_CONSTRAINT__MAXINT :
				if (resolve)
					return getMaxint();
				return basicGetMaxint();
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
			case UMLPackage.INTERACTION_CONSTRAINT__EANNOTATIONS :
				getEAnnotations().clear();
				getEAnnotations().addAll(
					(Collection<? extends EAnnotation>) newValue);
				return;
			case UMLPackage.INTERACTION_CONSTRAINT__OWNED_COMMENT :
				getOwnedComments().clear();
				getOwnedComments().addAll(
					(Collection<? extends Comment>) newValue);
				return;
			case UMLPackage.INTERACTION_CONSTRAINT__NAME :
				setName((String) newValue);
				return;
			case UMLPackage.INTERACTION_CONSTRAINT__VISIBILITY :
				setVisibility((VisibilityKind) newValue);
				return;
			case UMLPackage.INTERACTION_CONSTRAINT__CLIENT_DEPENDENCY :
				getClientDependencies().clear();
				getClientDependencies().addAll(
					(Collection<? extends Dependency>) newValue);
				return;
			case UMLPackage.INTERACTION_CONSTRAINT__NAME_EXPRESSION :
				setNameExpression((StringExpression) newValue);
				return;
			case UMLPackage.INTERACTION_CONSTRAINT__OWNING_TEMPLATE_PARAMETER :
				setOwningTemplateParameter((TemplateParameter) newValue);
				return;
			case UMLPackage.INTERACTION_CONSTRAINT__TEMPLATE_PARAMETER :
				setTemplateParameter((TemplateParameter) newValue);
				return;
			case UMLPackage.INTERACTION_CONSTRAINT__CONSTRAINED_ELEMENT :
				getConstrainedElements().clear();
				getConstrainedElements().addAll(
					(Collection<? extends Element>) newValue);
				return;
			case UMLPackage.INTERACTION_CONSTRAINT__SPECIFICATION :
				setSpecification((ValueSpecification) newValue);
				return;
			case UMLPackage.INTERACTION_CONSTRAINT__CONTEXT :
				setContext((Namespace) newValue);
				return;
			case UMLPackage.INTERACTION_CONSTRAINT__MININT :
				setMinint((ValueSpecification) newValue);
				return;
			case UMLPackage.INTERACTION_CONSTRAINT__MAXINT :
				setMaxint((ValueSpecification) newValue);
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
			case UMLPackage.INTERACTION_CONSTRAINT__EANNOTATIONS :
				getEAnnotations().clear();
				return;
			case UMLPackage.INTERACTION_CONSTRAINT__OWNED_COMMENT :
				getOwnedComments().clear();
				return;
			case UMLPackage.INTERACTION_CONSTRAINT__NAME :
				unsetName();
				return;
			case UMLPackage.INTERACTION_CONSTRAINT__VISIBILITY :
				unsetVisibility();
				return;
			case UMLPackage.INTERACTION_CONSTRAINT__CLIENT_DEPENDENCY :
				getClientDependencies().clear();
				return;
			case UMLPackage.INTERACTION_CONSTRAINT__NAME_EXPRESSION :
				setNameExpression((StringExpression) null);
				return;
			case UMLPackage.INTERACTION_CONSTRAINT__OWNING_TEMPLATE_PARAMETER :
				setOwningTemplateParameter((TemplateParameter) null);
				return;
			case UMLPackage.INTERACTION_CONSTRAINT__TEMPLATE_PARAMETER :
				setTemplateParameter((TemplateParameter) null);
				return;
			case UMLPackage.INTERACTION_CONSTRAINT__CONSTRAINED_ELEMENT :
				getConstrainedElements().clear();
				return;
			case UMLPackage.INTERACTION_CONSTRAINT__SPECIFICATION :
				setSpecification((ValueSpecification) null);
				return;
			case UMLPackage.INTERACTION_CONSTRAINT__CONTEXT :
				setContext((Namespace) null);
				return;
			case UMLPackage.INTERACTION_CONSTRAINT__MININT :
				setMinint((ValueSpecification) null);
				return;
			case UMLPackage.INTERACTION_CONSTRAINT__MAXINT :
				setMaxint((ValueSpecification) null);
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
			case UMLPackage.INTERACTION_CONSTRAINT__EANNOTATIONS :
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UMLPackage.INTERACTION_CONSTRAINT__OWNED_ELEMENT :
				return isSetOwnedElements();
			case UMLPackage.INTERACTION_CONSTRAINT__OWNER :
				return isSetOwner();
			case UMLPackage.INTERACTION_CONSTRAINT__OWNED_COMMENT :
				return ownedComments != null && !ownedComments.isEmpty();
			case UMLPackage.INTERACTION_CONSTRAINT__NAME :
				return isSetName();
			case UMLPackage.INTERACTION_CONSTRAINT__VISIBILITY :
				return isSetVisibility();
			case UMLPackage.INTERACTION_CONSTRAINT__QUALIFIED_NAME :
				return QUALIFIED_NAME_EDEFAULT == null
					? getQualifiedName() != null
					: !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case UMLPackage.INTERACTION_CONSTRAINT__CLIENT_DEPENDENCY :
				return clientDependencies != null
					&& !clientDependencies.isEmpty();
			case UMLPackage.INTERACTION_CONSTRAINT__NAMESPACE :
				return isSetNamespace();
			case UMLPackage.INTERACTION_CONSTRAINT__NAME_EXPRESSION :
				return nameExpression != null;
			case UMLPackage.INTERACTION_CONSTRAINT__OWNING_TEMPLATE_PARAMETER :
				return basicGetOwningTemplateParameter() != null;
			case UMLPackage.INTERACTION_CONSTRAINT__TEMPLATE_PARAMETER :
				return templateParameter != null;
			case UMLPackage.INTERACTION_CONSTRAINT__CONSTRAINED_ELEMENT :
				return constrainedElements != null
					&& !constrainedElements.isEmpty();
			case UMLPackage.INTERACTION_CONSTRAINT__SPECIFICATION :
				return specification != null;
			case UMLPackage.INTERACTION_CONSTRAINT__CONTEXT :
				return basicGetContext() != null;
			case UMLPackage.INTERACTION_CONSTRAINT__MININT :
				return minint != null;
			case UMLPackage.INTERACTION_CONSTRAINT__MAXINT :
				return maxint != null;
		}
		return eDynamicIsSet(featureID);
	}

	/**
	 * The array of subset feature identifiers for the '{@link #getOwnedElements() <em>Owned Element</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedElements()
	 * @generated
	 * @ordered
	 */
	protected static final int[] OWNED_ELEMENT_ESUBSETS = new int[]{
		UMLPackage.INTERACTION_CONSTRAINT__OWNED_COMMENT,
		UMLPackage.INTERACTION_CONSTRAINT__NAME_EXPRESSION,
		UMLPackage.INTERACTION_CONSTRAINT__SPECIFICATION,
		UMLPackage.INTERACTION_CONSTRAINT__MININT,
		UMLPackage.INTERACTION_CONSTRAINT__MAXINT};

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetOwnedElements() {
		return super.isSetOwnedElements()
			|| eIsSet(UMLPackage.INTERACTION_CONSTRAINT__MININT)
			|| eIsSet(UMLPackage.INTERACTION_CONSTRAINT__MAXINT);
	}

} //InteractionConstraintImpl
