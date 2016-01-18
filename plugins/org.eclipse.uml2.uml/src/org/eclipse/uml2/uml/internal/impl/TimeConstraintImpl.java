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
 *   Kenn Hussey (CEA) - 327039, 212765, 418466, 451350, 485756
 *
 */
package org.eclipse.uml2.uml.internal.impl;

import java.lang.reflect.InvocationTargetException;
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

import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.uml2.uml.Comment;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Namespace;
import org.eclipse.uml2.uml.ParameterableElement;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.StringExpression;
import org.eclipse.uml2.uml.TemplateParameter;
import org.eclipse.uml2.uml.TimeConstraint;
import org.eclipse.uml2.uml.Type;
import org.eclipse.uml2.uml.TimeInterval;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.ValueSpecification;

import org.eclipse.uml2.uml.VisibilityKind;
import org.eclipse.uml2.uml.internal.operations.TimeConstraintOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Time Constraint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.TimeConstraintImpl#isFirstEvent <em>First Event</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.TimeConstraintImpl#getSpecification <em>Specification</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TimeConstraintImpl
		extends IntervalConstraintImpl
		implements TimeConstraint {

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
	protected TimeConstraintImpl() {
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
		return UMLPackage.Literals.TIME_CONSTRAINT;
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
				UMLPackage.TIME_CONSTRAINT__FIRST_EVENT, oldFirstEvent,
				newFirstEvent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ValueSpecification getSpecification() {
		if (specification != null && specification.eIsProxy()) {
			InternalEObject oldSpecification = (InternalEObject) specification;
			specification = (ValueSpecification) eResolveProxy(
				oldSpecification);
			if (specification != oldSpecification) {
				InternalEObject newSpecification = (InternalEObject) specification;
				NotificationChain msgs = oldSpecification.eInverseRemove(this,
					EOPPOSITE_FEATURE_BASE
						- UMLPackage.TIME_CONSTRAINT__SPECIFICATION,
					null, null);
				if (newSpecification.eInternalContainer() == null) {
					msgs = newSpecification.eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE
							- UMLPackage.TIME_CONSTRAINT__SPECIFICATION,
						null, msgs);
				}
				if (msgs != null)
					msgs.dispatch();
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
						UMLPackage.TIME_CONSTRAINT__SPECIFICATION,
						oldSpecification, specification));
			}
		}
		return specification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ValueSpecification basicGetSpecification() {
		return specification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain basicSetSpecification(
			ValueSpecification newSpecification, NotificationChain msgs) {
		if (newSpecification != null
			&& !(newSpecification instanceof TimeInterval)) {
			throw new IllegalArgumentException(
				"newSpecification must be an instance of TimeInterval"); //$NON-NLS-1$
		}
		ValueSpecification oldSpecification = specification;
		specification = newSpecification;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
				Notification.SET, UMLPackage.TIME_CONSTRAINT__SPECIFICATION,
				oldSpecification, newSpecification);
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
	@Override
	public void setSpecification(ValueSpecification newSpecification) {
		if (newSpecification != null
			&& !(newSpecification instanceof TimeInterval)) {
			throw new IllegalArgumentException(
				"newSpecification must be an instance of TimeInterval"); //$NON-NLS-1$
		}
		if (newSpecification != specification) {
			NotificationChain msgs = null;
			if (specification != null)
				msgs = ((InternalEObject) specification).eInverseRemove(this,
					EOPPOSITE_FEATURE_BASE
						- UMLPackage.TIME_CONSTRAINT__SPECIFICATION,
					null, msgs);
			if (newSpecification != null)
				msgs = ((InternalEObject) newSpecification).eInverseAdd(this,
					EOPPOSITE_FEATURE_BASE
						- UMLPackage.TIME_CONSTRAINT__SPECIFICATION,
					null, msgs);
			msgs = basicSetSpecification(newSpecification, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.TIME_CONSTRAINT__SPECIFICATION, newSpecification,
				newSpecification));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueSpecification createSpecification(String name, Type type,
			EClass eClass) {
		ValueSpecification newSpecification = (ValueSpecification) create(
			eClass);
		setSpecification(newSpecification);
		if (name != null)
			newSpecification.setName(name);
		if (type != null)
			newSpecification.setType(type);
		return newSpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetSpecification() {
		return specification != null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHasOneConstrainedElement(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return TimeConstraintOperations.validateHasOneConstrainedElement(this,
			diagnostics, context);
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
			case UMLPackage.TIME_CONSTRAINT__EANNOTATIONS :
				return ((InternalEList<?>) getEAnnotations())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.TIME_CONSTRAINT__OWNED_COMMENT :
				return ((InternalEList<?>) getOwnedComments())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.TIME_CONSTRAINT__NAME_EXPRESSION :
				return basicSetNameExpression(null, msgs);
			case UMLPackage.TIME_CONSTRAINT__OWNING_TEMPLATE_PARAMETER :
				return basicSetOwningTemplateParameter(null, msgs);
			case UMLPackage.TIME_CONSTRAINT__TEMPLATE_PARAMETER :
				return basicSetTemplateParameter(null, msgs);
			case UMLPackage.TIME_CONSTRAINT__CONTEXT :
				return basicSetContext(null, msgs);
			case UMLPackage.TIME_CONSTRAINT__SPECIFICATION :
				return basicSetSpecification(null, msgs);
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
			case UMLPackage.TIME_CONSTRAINT__EANNOTATIONS :
				return getEAnnotations();
			case UMLPackage.TIME_CONSTRAINT__OWNED_COMMENT :
				return getOwnedComments();
			case UMLPackage.TIME_CONSTRAINT__OWNED_ELEMENT :
				return getOwnedElements();
			case UMLPackage.TIME_CONSTRAINT__OWNER :
				if (resolve)
					return getOwner();
				return basicGetOwner();
			case UMLPackage.TIME_CONSTRAINT__CLIENT_DEPENDENCY :
				return getClientDependencies();
			case UMLPackage.TIME_CONSTRAINT__NAME :
				return getName();
			case UMLPackage.TIME_CONSTRAINT__NAME_EXPRESSION :
				if (resolve)
					return getNameExpression();
				return basicGetNameExpression();
			case UMLPackage.TIME_CONSTRAINT__NAMESPACE :
				if (resolve)
					return getNamespace();
				return basicGetNamespace();
			case UMLPackage.TIME_CONSTRAINT__QUALIFIED_NAME :
				return getQualifiedName();
			case UMLPackage.TIME_CONSTRAINT__VISIBILITY :
				return getVisibility();
			case UMLPackage.TIME_CONSTRAINT__OWNING_TEMPLATE_PARAMETER :
				if (resolve)
					return getOwningTemplateParameter();
				return basicGetOwningTemplateParameter();
			case UMLPackage.TIME_CONSTRAINT__TEMPLATE_PARAMETER :
				if (resolve)
					return getTemplateParameter();
				return basicGetTemplateParameter();
			case UMLPackage.TIME_CONSTRAINT__CONSTRAINED_ELEMENT :
				return getConstrainedElements();
			case UMLPackage.TIME_CONSTRAINT__CONTEXT :
				if (resolve)
					return getContext();
				return basicGetContext();
			case UMLPackage.TIME_CONSTRAINT__SPECIFICATION :
				if (resolve)
					return getSpecification();
				return basicGetSpecification();
			case UMLPackage.TIME_CONSTRAINT__FIRST_EVENT :
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
			case UMLPackage.TIME_CONSTRAINT__EANNOTATIONS :
				getEAnnotations().clear();
				getEAnnotations()
					.addAll((Collection<? extends EAnnotation>) newValue);
				return;
			case UMLPackage.TIME_CONSTRAINT__OWNED_COMMENT :
				getOwnedComments().clear();
				getOwnedComments()
					.addAll((Collection<? extends Comment>) newValue);
				return;
			case UMLPackage.TIME_CONSTRAINT__NAME :
				setName((String) newValue);
				return;
			case UMLPackage.TIME_CONSTRAINT__NAME_EXPRESSION :
				setNameExpression((StringExpression) newValue);
				return;
			case UMLPackage.TIME_CONSTRAINT__VISIBILITY :
				setVisibility((VisibilityKind) newValue);
				return;
			case UMLPackage.TIME_CONSTRAINT__OWNING_TEMPLATE_PARAMETER :
				setOwningTemplateParameter((TemplateParameter) newValue);
				return;
			case UMLPackage.TIME_CONSTRAINT__TEMPLATE_PARAMETER :
				setTemplateParameter((TemplateParameter) newValue);
				return;
			case UMLPackage.TIME_CONSTRAINT__CONSTRAINED_ELEMENT :
				getConstrainedElements().clear();
				getConstrainedElements()
					.addAll((Collection<? extends Element>) newValue);
				return;
			case UMLPackage.TIME_CONSTRAINT__CONTEXT :
				setContext((Namespace) newValue);
				return;
			case UMLPackage.TIME_CONSTRAINT__SPECIFICATION :
				setSpecification((ValueSpecification) newValue);
				return;
			case UMLPackage.TIME_CONSTRAINT__FIRST_EVENT :
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
			case UMLPackage.TIME_CONSTRAINT__EANNOTATIONS :
				getEAnnotations().clear();
				return;
			case UMLPackage.TIME_CONSTRAINT__OWNED_COMMENT :
				getOwnedComments().clear();
				return;
			case UMLPackage.TIME_CONSTRAINT__NAME :
				unsetName();
				return;
			case UMLPackage.TIME_CONSTRAINT__NAME_EXPRESSION :
				setNameExpression((StringExpression) null);
				return;
			case UMLPackage.TIME_CONSTRAINT__VISIBILITY :
				unsetVisibility();
				return;
			case UMLPackage.TIME_CONSTRAINT__OWNING_TEMPLATE_PARAMETER :
				setOwningTemplateParameter((TemplateParameter) null);
				return;
			case UMLPackage.TIME_CONSTRAINT__TEMPLATE_PARAMETER :
				setTemplateParameter((TemplateParameter) null);
				return;
			case UMLPackage.TIME_CONSTRAINT__CONSTRAINED_ELEMENT :
				getConstrainedElements().clear();
				return;
			case UMLPackage.TIME_CONSTRAINT__CONTEXT :
				setContext((Namespace) null);
				return;
			case UMLPackage.TIME_CONSTRAINT__SPECIFICATION :
				setSpecification((ValueSpecification) null);
				return;
			case UMLPackage.TIME_CONSTRAINT__FIRST_EVENT :
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
			case UMLPackage.TIME_CONSTRAINT__EANNOTATIONS :
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UMLPackage.TIME_CONSTRAINT__OWNED_COMMENT :
				return ownedComments != null && !ownedComments.isEmpty();
			case UMLPackage.TIME_CONSTRAINT__OWNED_ELEMENT :
				return isSetOwnedElements();
			case UMLPackage.TIME_CONSTRAINT__OWNER :
				return isSetOwner();
			case UMLPackage.TIME_CONSTRAINT__CLIENT_DEPENDENCY :
				return !getClientDependencies().isEmpty();
			case UMLPackage.TIME_CONSTRAINT__NAME :
				return isSetName();
			case UMLPackage.TIME_CONSTRAINT__NAME_EXPRESSION :
				return nameExpression != null;
			case UMLPackage.TIME_CONSTRAINT__NAMESPACE :
				return isSetNamespace();
			case UMLPackage.TIME_CONSTRAINT__QUALIFIED_NAME :
				return QUALIFIED_NAME_EDEFAULT == null
					? getQualifiedName() != null
					: !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case UMLPackage.TIME_CONSTRAINT__VISIBILITY :
				return isSetVisibility();
			case UMLPackage.TIME_CONSTRAINT__OWNING_TEMPLATE_PARAMETER :
				return basicGetOwningTemplateParameter() != null;
			case UMLPackage.TIME_CONSTRAINT__TEMPLATE_PARAMETER :
				return templateParameter != null;
			case UMLPackage.TIME_CONSTRAINT__CONSTRAINED_ELEMENT :
				return constrainedElements != null
					&& !constrainedElements.isEmpty();
			case UMLPackage.TIME_CONSTRAINT__CONTEXT :
				return basicGetContext() != null;
			case UMLPackage.TIME_CONSTRAINT__SPECIFICATION :
				return isSetSpecification();
			case UMLPackage.TIME_CONSTRAINT__FIRST_EVENT :
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
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments)
			throws InvocationTargetException {
		switch (operationID) {
			case UMLPackage.TIME_CONSTRAINT___GET_EANNOTATION__STRING :
				return getEAnnotation((String) arguments.get(0));
			case UMLPackage.TIME_CONSTRAINT___VALIDATE_HAS_OWNER__DIAGNOSTICCHAIN_MAP :
				return validateHasOwner((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.TIME_CONSTRAINT___VALIDATE_NOT_OWN_SELF__DIAGNOSTICCHAIN_MAP :
				return validateNotOwnSelf((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.TIME_CONSTRAINT___ADD_KEYWORD__STRING :
				return addKeyword((String) arguments.get(0));
			case UMLPackage.TIME_CONSTRAINT___APPLY_STEREOTYPE__STEREOTYPE :
				return applyStereotype((Stereotype) arguments.get(0));
			case UMLPackage.TIME_CONSTRAINT___CREATE_EANNOTATION__STRING :
				return createEAnnotation((String) arguments.get(0));
			case UMLPackage.TIME_CONSTRAINT___DESTROY :
				destroy();
				return null;
			case UMLPackage.TIME_CONSTRAINT___GET_KEYWORDS :
				return getKeywords();
			case UMLPackage.TIME_CONSTRAINT___GET_APPLICABLE_STEREOTYPE__STRING :
				return getApplicableStereotype((String) arguments.get(0));
			case UMLPackage.TIME_CONSTRAINT___GET_APPLICABLE_STEREOTYPES :
				return getApplicableStereotypes();
			case UMLPackage.TIME_CONSTRAINT___GET_APPLIED_STEREOTYPE__STRING :
				return getAppliedStereotype((String) arguments.get(0));
			case UMLPackage.TIME_CONSTRAINT___GET_APPLIED_STEREOTYPES :
				return getAppliedStereotypes();
			case UMLPackage.TIME_CONSTRAINT___GET_APPLIED_SUBSTEREOTYPE__STEREOTYPE_STRING :
				return getAppliedSubstereotype((Stereotype) arguments.get(0),
					(String) arguments.get(1));
			case UMLPackage.TIME_CONSTRAINT___GET_APPLIED_SUBSTEREOTYPES__STEREOTYPE :
				return getAppliedSubstereotypes((Stereotype) arguments.get(0));
			case UMLPackage.TIME_CONSTRAINT___GET_MODEL :
				return getModel();
			case UMLPackage.TIME_CONSTRAINT___GET_NEAREST_PACKAGE :
				return getNearestPackage();
			case UMLPackage.TIME_CONSTRAINT___GET_RELATIONSHIPS :
				return getRelationships();
			case UMLPackage.TIME_CONSTRAINT___GET_RELATIONSHIPS__ECLASS :
				return getRelationships((EClass) arguments.get(0));
			case UMLPackage.TIME_CONSTRAINT___GET_REQUIRED_STEREOTYPE__STRING :
				return getRequiredStereotype((String) arguments.get(0));
			case UMLPackage.TIME_CONSTRAINT___GET_REQUIRED_STEREOTYPES :
				return getRequiredStereotypes();
			case UMLPackage.TIME_CONSTRAINT___GET_SOURCE_DIRECTED_RELATIONSHIPS :
				return getSourceDirectedRelationships();
			case UMLPackage.TIME_CONSTRAINT___GET_SOURCE_DIRECTED_RELATIONSHIPS__ECLASS :
				return getSourceDirectedRelationships(
					(EClass) arguments.get(0));
			case UMLPackage.TIME_CONSTRAINT___GET_STEREOTYPE_APPLICATION__STEREOTYPE :
				return getStereotypeApplication((Stereotype) arguments.get(0));
			case UMLPackage.TIME_CONSTRAINT___GET_STEREOTYPE_APPLICATIONS :
				return getStereotypeApplications();
			case UMLPackage.TIME_CONSTRAINT___GET_TARGET_DIRECTED_RELATIONSHIPS :
				return getTargetDirectedRelationships();
			case UMLPackage.TIME_CONSTRAINT___GET_TARGET_DIRECTED_RELATIONSHIPS__ECLASS :
				return getTargetDirectedRelationships(
					(EClass) arguments.get(0));
			case UMLPackage.TIME_CONSTRAINT___GET_VALUE__STEREOTYPE_STRING :
				return getValue((Stereotype) arguments.get(0),
					(String) arguments.get(1));
			case UMLPackage.TIME_CONSTRAINT___HAS_KEYWORD__STRING :
				return hasKeyword((String) arguments.get(0));
			case UMLPackage.TIME_CONSTRAINT___HAS_VALUE__STEREOTYPE_STRING :
				return hasValue((Stereotype) arguments.get(0),
					(String) arguments.get(1));
			case UMLPackage.TIME_CONSTRAINT___IS_STEREOTYPE_APPLICABLE__STEREOTYPE :
				return isStereotypeApplicable((Stereotype) arguments.get(0));
			case UMLPackage.TIME_CONSTRAINT___IS_STEREOTYPE_APPLIED__STEREOTYPE :
				return isStereotypeApplied((Stereotype) arguments.get(0));
			case UMLPackage.TIME_CONSTRAINT___IS_STEREOTYPE_REQUIRED__STEREOTYPE :
				return isStereotypeRequired((Stereotype) arguments.get(0));
			case UMLPackage.TIME_CONSTRAINT___REMOVE_KEYWORD__STRING :
				return removeKeyword((String) arguments.get(0));
			case UMLPackage.TIME_CONSTRAINT___SET_VALUE__STEREOTYPE_STRING_OBJECT :
				setValue((Stereotype) arguments.get(0),
					(String) arguments.get(1), arguments.get(2));
				return null;
			case UMLPackage.TIME_CONSTRAINT___UNAPPLY_STEREOTYPE__STEREOTYPE :
				return unapplyStereotype((Stereotype) arguments.get(0));
			case UMLPackage.TIME_CONSTRAINT___ALL_OWNED_ELEMENTS :
				return allOwnedElements();
			case UMLPackage.TIME_CONSTRAINT___MUST_BE_OWNED :
				return mustBeOwned();
			case UMLPackage.TIME_CONSTRAINT___VALIDATE_VISIBILITY_NEEDS_OWNERSHIP__DIAGNOSTICCHAIN_MAP :
				return validateVisibilityNeedsOwnership(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.TIME_CONSTRAINT___VALIDATE_HAS_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP :
				return validateHasQualifiedName(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.TIME_CONSTRAINT___VALIDATE_HAS_NO_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP :
				return validateHasNoQualifiedName(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.TIME_CONSTRAINT___CREATE_DEPENDENCY__NAMEDELEMENT :
				return createDependency((NamedElement) arguments.get(0));
			case UMLPackage.TIME_CONSTRAINT___CREATE_USAGE__NAMEDELEMENT :
				return createUsage((NamedElement) arguments.get(0));
			case UMLPackage.TIME_CONSTRAINT___GET_LABEL :
				return getLabel();
			case UMLPackage.TIME_CONSTRAINT___GET_LABEL__BOOLEAN :
				return getLabel((Boolean) arguments.get(0));
			case UMLPackage.TIME_CONSTRAINT___GET_NAMESPACE :
				return getNamespace();
			case UMLPackage.TIME_CONSTRAINT___ALL_NAMESPACES :
				return allNamespaces();
			case UMLPackage.TIME_CONSTRAINT___ALL_OWNING_PACKAGES :
				return allOwningPackages();
			case UMLPackage.TIME_CONSTRAINT___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE :
				return isDistinguishableFrom((NamedElement) arguments.get(0),
					(Namespace) arguments.get(1));
			case UMLPackage.TIME_CONSTRAINT___GET_QUALIFIED_NAME :
				return getQualifiedName();
			case UMLPackage.TIME_CONSTRAINT___SEPARATOR :
				return separator();
			case UMLPackage.TIME_CONSTRAINT___GET_CLIENT_DEPENDENCIES :
				return getClientDependencies();
			case UMLPackage.TIME_CONSTRAINT___IS_COMPATIBLE_WITH__PARAMETERABLEELEMENT :
				return isCompatibleWith(
					(ParameterableElement) arguments.get(0));
			case UMLPackage.TIME_CONSTRAINT___IS_TEMPLATE_PARAMETER :
				return isTemplateParameter();
			case UMLPackage.TIME_CONSTRAINT___VALIDATE_NAMESPACE_NEEDS_VISIBILITY__DIAGNOSTICCHAIN_MAP :
				return validateNamespaceNeedsVisibility(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.TIME_CONSTRAINT___VALIDATE_BOOLEAN_VALUE__DIAGNOSTICCHAIN_MAP :
				return validateBooleanValue((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.TIME_CONSTRAINT___VALIDATE_NO_SIDE_EFFECTS__DIAGNOSTICCHAIN_MAP :
				return validateNoSideEffects((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.TIME_CONSTRAINT___VALIDATE_NOT_APPLY_TO_SELF__DIAGNOSTICCHAIN_MAP :
				return validateNotApplyToSelf(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.TIME_CONSTRAINT___VALIDATE_HAS_ONE_CONSTRAINED_ELEMENT__DIAGNOSTICCHAIN_MAP :
				return validateHasOneConstrainedElement(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
		}
		return eDynamicInvoke(operationID, arguments);
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

} //TimeConstraintImpl
