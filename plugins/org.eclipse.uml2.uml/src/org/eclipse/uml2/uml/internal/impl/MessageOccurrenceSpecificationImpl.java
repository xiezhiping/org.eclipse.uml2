/*
 * Copyright (c) 2005, 2016 IBM Corporation, CEA, and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *   Kenn Hussey (CEA) - 327039, 418466, 451350, 485756
 *
 */
package org.eclipse.uml2.uml.internal.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.Map;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.uml2.common.util.CacheAdapter;
import org.eclipse.uml2.uml.Comment;
import org.eclipse.uml2.uml.GeneralOrdering;
import org.eclipse.uml2.uml.Interaction;
import org.eclipse.uml2.uml.InteractionFragment;
import org.eclipse.uml2.uml.InteractionOperand;
import org.eclipse.uml2.uml.Lifeline;
import org.eclipse.uml2.uml.Message;
import org.eclipse.uml2.uml.MessageEnd;
import org.eclipse.uml2.uml.MessageOccurrenceSpecification;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Namespace;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.StringExpression;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.VisibilityKind;
import org.eclipse.uml2.uml.internal.operations.MessageEndOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Message Occurrence Specification</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.MessageOccurrenceSpecificationImpl#getMessage <em>Message</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MessageOccurrenceSpecificationImpl
		extends OccurrenceSpecificationImpl
		implements MessageOccurrenceSpecification {

	/**
	 * The cached value of the '{@link #getMessage() <em>Message</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessage()
	 * @generated
	 * @ordered
	 */
	protected Message message;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MessageOccurrenceSpecificationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UMLPackage.Literals.MESSAGE_OCCURRENCE_SPECIFICATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Message getMessage() {
		if (message != null && message.eIsProxy()) {
			InternalEObject oldMessage = (InternalEObject) message;
			message = (Message) eResolveProxy(oldMessage);
			if (message != oldMessage) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
						UMLPackage.MESSAGE_OCCURRENCE_SPECIFICATION__MESSAGE,
						oldMessage, message));
			}
		}
		return message;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Message basicGetMessage() {
		return message;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMessage(Message newMessage) {
		Message oldMessage = message;
		message = newMessage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.MESSAGE_OCCURRENCE_SPECIFICATION__MESSAGE,
				oldMessage, message));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MessageEnd> oppositeEnd() {
		CacheAdapter cache = getCacheAdapter();
		if (cache != null) {
			@SuppressWarnings("unchecked")
			EList<MessageEnd> result = (EList<MessageEnd>) cache.get(this,
				UMLPackage.Literals.MESSAGE_END___OPPOSITE_END);
			if (result == null) {
				cache.put(this, UMLPackage.Literals.MESSAGE_END___OPPOSITE_END,
					result = MessageEndOperations.oppositeEnd(this));
			}
			return result;
		}
		return MessageEndOperations.oppositeEnd(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSend() {
		return MessageEndOperations.isSend(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isReceive() {
		return MessageEndOperations.isReceive(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InteractionFragment> enclosingFragment() {
		CacheAdapter cache = getCacheAdapter();
		if (cache != null) {
			@SuppressWarnings("unchecked")
			EList<InteractionFragment> result = (EList<InteractionFragment>) cache
				.get(this,
					UMLPackage.Literals.MESSAGE_END___ENCLOSING_FRAGMENT);
			if (result == null) {
				cache.put(this,
					UMLPackage.Literals.MESSAGE_END___ENCLOSING_FRAGMENT,
					result = MessageEndOperations.enclosingFragment(this));
			}
			return result;
		}
		return MessageEndOperations.enclosingFragment(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UMLPackage.MESSAGE_OCCURRENCE_SPECIFICATION__EANNOTATIONS :
				return getEAnnotations();
			case UMLPackage.MESSAGE_OCCURRENCE_SPECIFICATION__OWNED_COMMENT :
				return getOwnedComments();
			case UMLPackage.MESSAGE_OCCURRENCE_SPECIFICATION__OWNED_ELEMENT :
				return getOwnedElements();
			case UMLPackage.MESSAGE_OCCURRENCE_SPECIFICATION__OWNER :
				if (resolve)
					return getOwner();
				return basicGetOwner();
			case UMLPackage.MESSAGE_OCCURRENCE_SPECIFICATION__CLIENT_DEPENDENCY :
				return getClientDependencies();
			case UMLPackage.MESSAGE_OCCURRENCE_SPECIFICATION__NAME :
				return getName();
			case UMLPackage.MESSAGE_OCCURRENCE_SPECIFICATION__NAME_EXPRESSION :
				if (resolve)
					return getNameExpression();
				return basicGetNameExpression();
			case UMLPackage.MESSAGE_OCCURRENCE_SPECIFICATION__NAMESPACE :
				if (resolve)
					return getNamespace();
				return basicGetNamespace();
			case UMLPackage.MESSAGE_OCCURRENCE_SPECIFICATION__QUALIFIED_NAME :
				return getQualifiedName();
			case UMLPackage.MESSAGE_OCCURRENCE_SPECIFICATION__VISIBILITY :
				return getVisibility();
			case UMLPackage.MESSAGE_OCCURRENCE_SPECIFICATION__COVERED :
				return getCovereds();
			case UMLPackage.MESSAGE_OCCURRENCE_SPECIFICATION__ENCLOSING_OPERAND :
				if (resolve)
					return getEnclosingOperand();
				return basicGetEnclosingOperand();
			case UMLPackage.MESSAGE_OCCURRENCE_SPECIFICATION__ENCLOSING_INTERACTION :
				if (resolve)
					return getEnclosingInteraction();
				return basicGetEnclosingInteraction();
			case UMLPackage.MESSAGE_OCCURRENCE_SPECIFICATION__GENERAL_ORDERING :
				return getGeneralOrderings();
			case UMLPackage.MESSAGE_OCCURRENCE_SPECIFICATION__TO_AFTER :
				return getToAfters();
			case UMLPackage.MESSAGE_OCCURRENCE_SPECIFICATION__TO_BEFORE :
				return getToBefores();
			case UMLPackage.MESSAGE_OCCURRENCE_SPECIFICATION__MESSAGE :
				if (resolve)
					return getMessage();
				return basicGetMessage();
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
			case UMLPackage.MESSAGE_OCCURRENCE_SPECIFICATION__EANNOTATIONS :
				getEAnnotations().clear();
				getEAnnotations()
					.addAll((Collection<? extends EAnnotation>) newValue);
				return;
			case UMLPackage.MESSAGE_OCCURRENCE_SPECIFICATION__OWNED_COMMENT :
				getOwnedComments().clear();
				getOwnedComments()
					.addAll((Collection<? extends Comment>) newValue);
				return;
			case UMLPackage.MESSAGE_OCCURRENCE_SPECIFICATION__NAME :
				setName((String) newValue);
				return;
			case UMLPackage.MESSAGE_OCCURRENCE_SPECIFICATION__NAME_EXPRESSION :
				setNameExpression((StringExpression) newValue);
				return;
			case UMLPackage.MESSAGE_OCCURRENCE_SPECIFICATION__VISIBILITY :
				setVisibility((VisibilityKind) newValue);
				return;
			case UMLPackage.MESSAGE_OCCURRENCE_SPECIFICATION__COVERED :
				getCovereds().clear();
				getCovereds().addAll((Collection<? extends Lifeline>) newValue);
				return;
			case UMLPackage.MESSAGE_OCCURRENCE_SPECIFICATION__ENCLOSING_OPERAND :
				setEnclosingOperand((InteractionOperand) newValue);
				return;
			case UMLPackage.MESSAGE_OCCURRENCE_SPECIFICATION__ENCLOSING_INTERACTION :
				setEnclosingInteraction((Interaction) newValue);
				return;
			case UMLPackage.MESSAGE_OCCURRENCE_SPECIFICATION__GENERAL_ORDERING :
				getGeneralOrderings().clear();
				getGeneralOrderings()
					.addAll((Collection<? extends GeneralOrdering>) newValue);
				return;
			case UMLPackage.MESSAGE_OCCURRENCE_SPECIFICATION__TO_AFTER :
				getToAfters().clear();
				getToAfters()
					.addAll((Collection<? extends GeneralOrdering>) newValue);
				return;
			case UMLPackage.MESSAGE_OCCURRENCE_SPECIFICATION__TO_BEFORE :
				getToBefores().clear();
				getToBefores()
					.addAll((Collection<? extends GeneralOrdering>) newValue);
				return;
			case UMLPackage.MESSAGE_OCCURRENCE_SPECIFICATION__MESSAGE :
				setMessage((Message) newValue);
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
			case UMLPackage.MESSAGE_OCCURRENCE_SPECIFICATION__EANNOTATIONS :
				getEAnnotations().clear();
				return;
			case UMLPackage.MESSAGE_OCCURRENCE_SPECIFICATION__OWNED_COMMENT :
				getOwnedComments().clear();
				return;
			case UMLPackage.MESSAGE_OCCURRENCE_SPECIFICATION__NAME :
				unsetName();
				return;
			case UMLPackage.MESSAGE_OCCURRENCE_SPECIFICATION__NAME_EXPRESSION :
				setNameExpression((StringExpression) null);
				return;
			case UMLPackage.MESSAGE_OCCURRENCE_SPECIFICATION__VISIBILITY :
				unsetVisibility();
				return;
			case UMLPackage.MESSAGE_OCCURRENCE_SPECIFICATION__COVERED :
				getCovereds().clear();
				return;
			case UMLPackage.MESSAGE_OCCURRENCE_SPECIFICATION__ENCLOSING_OPERAND :
				setEnclosingOperand((InteractionOperand) null);
				return;
			case UMLPackage.MESSAGE_OCCURRENCE_SPECIFICATION__ENCLOSING_INTERACTION :
				setEnclosingInteraction((Interaction) null);
				return;
			case UMLPackage.MESSAGE_OCCURRENCE_SPECIFICATION__GENERAL_ORDERING :
				getGeneralOrderings().clear();
				return;
			case UMLPackage.MESSAGE_OCCURRENCE_SPECIFICATION__TO_AFTER :
				getToAfters().clear();
				return;
			case UMLPackage.MESSAGE_OCCURRENCE_SPECIFICATION__TO_BEFORE :
				getToBefores().clear();
				return;
			case UMLPackage.MESSAGE_OCCURRENCE_SPECIFICATION__MESSAGE :
				setMessage((Message) null);
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
			case UMLPackage.MESSAGE_OCCURRENCE_SPECIFICATION__EANNOTATIONS :
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UMLPackage.MESSAGE_OCCURRENCE_SPECIFICATION__OWNED_COMMENT :
				return ownedComments != null && !ownedComments.isEmpty();
			case UMLPackage.MESSAGE_OCCURRENCE_SPECIFICATION__OWNED_ELEMENT :
				return isSetOwnedElements();
			case UMLPackage.MESSAGE_OCCURRENCE_SPECIFICATION__OWNER :
				return isSetOwner();
			case UMLPackage.MESSAGE_OCCURRENCE_SPECIFICATION__CLIENT_DEPENDENCY :
				return !getClientDependencies().isEmpty();
			case UMLPackage.MESSAGE_OCCURRENCE_SPECIFICATION__NAME :
				return isSetName();
			case UMLPackage.MESSAGE_OCCURRENCE_SPECIFICATION__NAME_EXPRESSION :
				return nameExpression != null;
			case UMLPackage.MESSAGE_OCCURRENCE_SPECIFICATION__NAMESPACE :
				return isSetNamespace();
			case UMLPackage.MESSAGE_OCCURRENCE_SPECIFICATION__QUALIFIED_NAME :
				return QUALIFIED_NAME_EDEFAULT == null
					? getQualifiedName() != null
					: !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case UMLPackage.MESSAGE_OCCURRENCE_SPECIFICATION__VISIBILITY :
				return isSetVisibility();
			case UMLPackage.MESSAGE_OCCURRENCE_SPECIFICATION__COVERED :
				return isSetCovereds();
			case UMLPackage.MESSAGE_OCCURRENCE_SPECIFICATION__ENCLOSING_OPERAND :
				return basicGetEnclosingOperand() != null;
			case UMLPackage.MESSAGE_OCCURRENCE_SPECIFICATION__ENCLOSING_INTERACTION :
				return basicGetEnclosingInteraction() != null;
			case UMLPackage.MESSAGE_OCCURRENCE_SPECIFICATION__GENERAL_ORDERING :
				return generalOrderings != null && !generalOrderings.isEmpty();
			case UMLPackage.MESSAGE_OCCURRENCE_SPECIFICATION__TO_AFTER :
				return toAfters != null && !toAfters.isEmpty();
			case UMLPackage.MESSAGE_OCCURRENCE_SPECIFICATION__TO_BEFORE :
				return toBefores != null && !toBefores.isEmpty();
			case UMLPackage.MESSAGE_OCCURRENCE_SPECIFICATION__MESSAGE :
				return message != null;
		}
		return eDynamicIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID,
			Class<?> baseClass) {
		if (baseClass == MessageEnd.class) {
			switch (derivedFeatureID) {
				case UMLPackage.MESSAGE_OCCURRENCE_SPECIFICATION__MESSAGE :
					return UMLPackage.MESSAGE_END__MESSAGE;
				default :
					return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID,
			Class<?> baseClass) {
		if (baseClass == MessageEnd.class) {
			switch (baseFeatureID) {
				case UMLPackage.MESSAGE_END__MESSAGE :
					return UMLPackage.MESSAGE_OCCURRENCE_SPECIFICATION__MESSAGE;
				default :
					return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedOperationID(int baseOperationID, Class<?> baseClass) {
		if (baseClass == MessageEnd.class) {
			switch (baseOperationID) {
				case UMLPackage.MESSAGE_END___OPPOSITE_END :
					return UMLPackage.MESSAGE_OCCURRENCE_SPECIFICATION___OPPOSITE_END;
				case UMLPackage.MESSAGE_END___IS_SEND :
					return UMLPackage.MESSAGE_OCCURRENCE_SPECIFICATION___IS_SEND;
				case UMLPackage.MESSAGE_END___IS_RECEIVE :
					return UMLPackage.MESSAGE_OCCURRENCE_SPECIFICATION___IS_RECEIVE;
				case UMLPackage.MESSAGE_END___ENCLOSING_FRAGMENT :
					return UMLPackage.MESSAGE_OCCURRENCE_SPECIFICATION___ENCLOSING_FRAGMENT;
				default :
					return -1;
			}
		}
		return super.eDerivedOperationID(baseOperationID, baseClass);
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
			case UMLPackage.MESSAGE_OCCURRENCE_SPECIFICATION___GET_EANNOTATION__STRING :
				return getEAnnotation((String) arguments.get(0));
			case UMLPackage.MESSAGE_OCCURRENCE_SPECIFICATION___VALIDATE_HAS_OWNER__DIAGNOSTICCHAIN_MAP :
				return validateHasOwner((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.MESSAGE_OCCURRENCE_SPECIFICATION___VALIDATE_NOT_OWN_SELF__DIAGNOSTICCHAIN_MAP :
				return validateNotOwnSelf((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.MESSAGE_OCCURRENCE_SPECIFICATION___ADD_KEYWORD__STRING :
				return addKeyword((String) arguments.get(0));
			case UMLPackage.MESSAGE_OCCURRENCE_SPECIFICATION___APPLY_STEREOTYPE__STEREOTYPE :
				return applyStereotype((Stereotype) arguments.get(0));
			case UMLPackage.MESSAGE_OCCURRENCE_SPECIFICATION___CREATE_EANNOTATION__STRING :
				return createEAnnotation((String) arguments.get(0));
			case UMLPackage.MESSAGE_OCCURRENCE_SPECIFICATION___DESTROY :
				destroy();
				return null;
			case UMLPackage.MESSAGE_OCCURRENCE_SPECIFICATION___GET_KEYWORDS :
				return getKeywords();
			case UMLPackage.MESSAGE_OCCURRENCE_SPECIFICATION___GET_APPLICABLE_STEREOTYPE__STRING :
				return getApplicableStereotype((String) arguments.get(0));
			case UMLPackage.MESSAGE_OCCURRENCE_SPECIFICATION___GET_APPLICABLE_STEREOTYPES :
				return getApplicableStereotypes();
			case UMLPackage.MESSAGE_OCCURRENCE_SPECIFICATION___GET_APPLIED_STEREOTYPE__STRING :
				return getAppliedStereotype((String) arguments.get(0));
			case UMLPackage.MESSAGE_OCCURRENCE_SPECIFICATION___GET_APPLIED_STEREOTYPES :
				return getAppliedStereotypes();
			case UMLPackage.MESSAGE_OCCURRENCE_SPECIFICATION___GET_APPLIED_SUBSTEREOTYPE__STEREOTYPE_STRING :
				return getAppliedSubstereotype((Stereotype) arguments.get(0),
					(String) arguments.get(1));
			case UMLPackage.MESSAGE_OCCURRENCE_SPECIFICATION___GET_APPLIED_SUBSTEREOTYPES__STEREOTYPE :
				return getAppliedSubstereotypes((Stereotype) arguments.get(0));
			case UMLPackage.MESSAGE_OCCURRENCE_SPECIFICATION___GET_MODEL :
				return getModel();
			case UMLPackage.MESSAGE_OCCURRENCE_SPECIFICATION___GET_NEAREST_PACKAGE :
				return getNearestPackage();
			case UMLPackage.MESSAGE_OCCURRENCE_SPECIFICATION___GET_RELATIONSHIPS :
				return getRelationships();
			case UMLPackage.MESSAGE_OCCURRENCE_SPECIFICATION___GET_RELATIONSHIPS__ECLASS :
				return getRelationships((EClass) arguments.get(0));
			case UMLPackage.MESSAGE_OCCURRENCE_SPECIFICATION___GET_REQUIRED_STEREOTYPE__STRING :
				return getRequiredStereotype((String) arguments.get(0));
			case UMLPackage.MESSAGE_OCCURRENCE_SPECIFICATION___GET_REQUIRED_STEREOTYPES :
				return getRequiredStereotypes();
			case UMLPackage.MESSAGE_OCCURRENCE_SPECIFICATION___GET_SOURCE_DIRECTED_RELATIONSHIPS :
				return getSourceDirectedRelationships();
			case UMLPackage.MESSAGE_OCCURRENCE_SPECIFICATION___GET_SOURCE_DIRECTED_RELATIONSHIPS__ECLASS :
				return getSourceDirectedRelationships(
					(EClass) arguments.get(0));
			case UMLPackage.MESSAGE_OCCURRENCE_SPECIFICATION___GET_STEREOTYPE_APPLICATION__STEREOTYPE :
				return getStereotypeApplication((Stereotype) arguments.get(0));
			case UMLPackage.MESSAGE_OCCURRENCE_SPECIFICATION___GET_STEREOTYPE_APPLICATIONS :
				return getStereotypeApplications();
			case UMLPackage.MESSAGE_OCCURRENCE_SPECIFICATION___GET_TARGET_DIRECTED_RELATIONSHIPS :
				return getTargetDirectedRelationships();
			case UMLPackage.MESSAGE_OCCURRENCE_SPECIFICATION___GET_TARGET_DIRECTED_RELATIONSHIPS__ECLASS :
				return getTargetDirectedRelationships(
					(EClass) arguments.get(0));
			case UMLPackage.MESSAGE_OCCURRENCE_SPECIFICATION___GET_VALUE__STEREOTYPE_STRING :
				return getValue((Stereotype) arguments.get(0),
					(String) arguments.get(1));
			case UMLPackage.MESSAGE_OCCURRENCE_SPECIFICATION___HAS_KEYWORD__STRING :
				return hasKeyword((String) arguments.get(0));
			case UMLPackage.MESSAGE_OCCURRENCE_SPECIFICATION___HAS_VALUE__STEREOTYPE_STRING :
				return hasValue((Stereotype) arguments.get(0),
					(String) arguments.get(1));
			case UMLPackage.MESSAGE_OCCURRENCE_SPECIFICATION___IS_STEREOTYPE_APPLICABLE__STEREOTYPE :
				return isStereotypeApplicable((Stereotype) arguments.get(0));
			case UMLPackage.MESSAGE_OCCURRENCE_SPECIFICATION___IS_STEREOTYPE_APPLIED__STEREOTYPE :
				return isStereotypeApplied((Stereotype) arguments.get(0));
			case UMLPackage.MESSAGE_OCCURRENCE_SPECIFICATION___IS_STEREOTYPE_REQUIRED__STEREOTYPE :
				return isStereotypeRequired((Stereotype) arguments.get(0));
			case UMLPackage.MESSAGE_OCCURRENCE_SPECIFICATION___REMOVE_KEYWORD__STRING :
				return removeKeyword((String) arguments.get(0));
			case UMLPackage.MESSAGE_OCCURRENCE_SPECIFICATION___SET_VALUE__STEREOTYPE_STRING_OBJECT :
				setValue((Stereotype) arguments.get(0),
					(String) arguments.get(1), arguments.get(2));
				return null;
			case UMLPackage.MESSAGE_OCCURRENCE_SPECIFICATION___UNAPPLY_STEREOTYPE__STEREOTYPE :
				return unapplyStereotype((Stereotype) arguments.get(0));
			case UMLPackage.MESSAGE_OCCURRENCE_SPECIFICATION___ALL_OWNED_ELEMENTS :
				return allOwnedElements();
			case UMLPackage.MESSAGE_OCCURRENCE_SPECIFICATION___MUST_BE_OWNED :
				return mustBeOwned();
			case UMLPackage.MESSAGE_OCCURRENCE_SPECIFICATION___VALIDATE_VISIBILITY_NEEDS_OWNERSHIP__DIAGNOSTICCHAIN_MAP :
				return validateVisibilityNeedsOwnership(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.MESSAGE_OCCURRENCE_SPECIFICATION___VALIDATE_HAS_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP :
				return validateHasQualifiedName(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.MESSAGE_OCCURRENCE_SPECIFICATION___VALIDATE_HAS_NO_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP :
				return validateHasNoQualifiedName(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.MESSAGE_OCCURRENCE_SPECIFICATION___CREATE_DEPENDENCY__NAMEDELEMENT :
				return createDependency((NamedElement) arguments.get(0));
			case UMLPackage.MESSAGE_OCCURRENCE_SPECIFICATION___CREATE_USAGE__NAMEDELEMENT :
				return createUsage((NamedElement) arguments.get(0));
			case UMLPackage.MESSAGE_OCCURRENCE_SPECIFICATION___GET_LABEL :
				return getLabel();
			case UMLPackage.MESSAGE_OCCURRENCE_SPECIFICATION___GET_LABEL__BOOLEAN :
				return getLabel((Boolean) arguments.get(0));
			case UMLPackage.MESSAGE_OCCURRENCE_SPECIFICATION___GET_NAMESPACE :
				return getNamespace();
			case UMLPackage.MESSAGE_OCCURRENCE_SPECIFICATION___ALL_NAMESPACES :
				return allNamespaces();
			case UMLPackage.MESSAGE_OCCURRENCE_SPECIFICATION___ALL_OWNING_PACKAGES :
				return allOwningPackages();
			case UMLPackage.MESSAGE_OCCURRENCE_SPECIFICATION___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE :
				return isDistinguishableFrom((NamedElement) arguments.get(0),
					(Namespace) arguments.get(1));
			case UMLPackage.MESSAGE_OCCURRENCE_SPECIFICATION___GET_QUALIFIED_NAME :
				return getQualifiedName();
			case UMLPackage.MESSAGE_OCCURRENCE_SPECIFICATION___SEPARATOR :
				return separator();
			case UMLPackage.MESSAGE_OCCURRENCE_SPECIFICATION___GET_CLIENT_DEPENDENCIES :
				return getClientDependencies();
			case UMLPackage.MESSAGE_OCCURRENCE_SPECIFICATION___GET_COVERED :
				return getCovered();
			case UMLPackage.MESSAGE_OCCURRENCE_SPECIFICATION___SET_COVERED__LIFELINE :
				setCovered((Lifeline) arguments.get(0));
				return null;
			case UMLPackage.MESSAGE_OCCURRENCE_SPECIFICATION___OPPOSITE_END :
				return oppositeEnd();
			case UMLPackage.MESSAGE_OCCURRENCE_SPECIFICATION___IS_SEND :
				return isSend();
			case UMLPackage.MESSAGE_OCCURRENCE_SPECIFICATION___IS_RECEIVE :
				return isReceive();
			case UMLPackage.MESSAGE_OCCURRENCE_SPECIFICATION___ENCLOSING_FRAGMENT :
				return enclosingFragment();
		}
		return eDynamicInvoke(operationID, arguments);
	}

} //MessageOccurrenceSpecificationImpl
