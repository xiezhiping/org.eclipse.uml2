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
 *   Kenn Hussey - 286329, 323181
 *   Kenn Hussey (CEA) - 327039, 351774, 418466, 451350, 485756
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

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.uml2.common.util.CacheAdapter;
import org.eclipse.uml2.common.util.DerivedUnionEObjectEList;

import org.eclipse.uml2.uml.CombinedFragment;
import org.eclipse.uml2.uml.Comment;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Gate;
import org.eclipse.uml2.uml.GeneralOrdering;
import org.eclipse.uml2.uml.Interaction;
import org.eclipse.uml2.uml.InteractionOperand;
import org.eclipse.uml2.uml.InteractionOperatorKind;
import org.eclipse.uml2.uml.Lifeline;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Namespace;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.StringExpression;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.VisibilityKind;

import org.eclipse.uml2.uml.internal.operations.CombinedFragmentOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Combined Fragment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.CombinedFragmentImpl#getOwnedElements <em>Owned Element</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.CombinedFragmentImpl#getCfragmentGates <em>Cfragment Gate</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.CombinedFragmentImpl#getInteractionOperator <em>Interaction Operator</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.CombinedFragmentImpl#getOperands <em>Operand</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CombinedFragmentImpl
		extends InteractionFragmentImpl
		implements CombinedFragment {

	/**
	 * The cached value of the '{@link #getCfragmentGates() <em>Cfragment Gate</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCfragmentGates()
	 * @generated
	 * @ordered
	 */
	protected EList<Gate> cfragmentGates;

	/**
	 * The default value of the '{@link #getInteractionOperator() <em>Interaction Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInteractionOperator()
	 * @generated
	 * @ordered
	 */
	protected static final InteractionOperatorKind INTERACTION_OPERATOR_EDEFAULT = InteractionOperatorKind.SEQ_LITERAL;

	/**
	 * The offset of the flags representing the value of the '{@link #getInteractionOperator() <em>Interaction Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected static final int INTERACTION_OPERATOR_EFLAG_OFFSET = 12;

	/**
	 * The flags representing the default value of the '{@link #getInteractionOperator() <em>Interaction Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected static final int INTERACTION_OPERATOR_EFLAG_DEFAULT = INTERACTION_OPERATOR_EDEFAULT
		.ordinal() << INTERACTION_OPERATOR_EFLAG_OFFSET;

	/**
	 * The array of enumeration values for '{@link InteractionOperatorKind Interaction Operator Kind}'
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	private static final InteractionOperatorKind[] INTERACTION_OPERATOR_EFLAG_VALUES = InteractionOperatorKind
		.values();

	/**
	 * The flags representing the value of the '{@link #getInteractionOperator() <em>Interaction Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInteractionOperator()
	 * @generated
	 * @ordered
	 */
	protected static final int INTERACTION_OPERATOR_EFLAG = 0xf << INTERACTION_OPERATOR_EFLAG_OFFSET;

	/**
	 * The cached value of the '{@link #getOperands() <em>Operand</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperands()
	 * @generated
	 * @ordered
	 */
	protected EList<InteractionOperand> operands;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CombinedFragmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UMLPackage.Literals.COMBINED_FRAGMENT;
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
			EList<Element> ownedElements = (EList<Element>) cache.get(eResource,
				this, UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
			if (ownedElements == null) {
				cache.put(eResource, this,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT,
					ownedElements = new DerivedUnionEObjectEList<Element>(
						Element.class, this,
						UMLPackage.COMBINED_FRAGMENT__OWNED_ELEMENT,
						OWNED_ELEMENT_ESUBSETS));
			}
			return ownedElements;
		}
		return new DerivedUnionEObjectEList<Element>(Element.class, this,
			UMLPackage.COMBINED_FRAGMENT__OWNED_ELEMENT,
			OWNED_ELEMENT_ESUBSETS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InteractionOperatorKind getInteractionOperator() {
		return INTERACTION_OPERATOR_EFLAG_VALUES[(eFlags
			& INTERACTION_OPERATOR_EFLAG) >>> INTERACTION_OPERATOR_EFLAG_OFFSET];
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInteractionOperator(
			InteractionOperatorKind newInteractionOperator) {
		InteractionOperatorKind oldInteractionOperator = INTERACTION_OPERATOR_EFLAG_VALUES[(eFlags
			& INTERACTION_OPERATOR_EFLAG) >>> INTERACTION_OPERATOR_EFLAG_OFFSET];
		if (newInteractionOperator == null)
			newInteractionOperator = INTERACTION_OPERATOR_EDEFAULT;
		eFlags = eFlags & ~INTERACTION_OPERATOR_EFLAG | newInteractionOperator
			.ordinal() << INTERACTION_OPERATOR_EFLAG_OFFSET;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.COMBINED_FRAGMENT__INTERACTION_OPERATOR,
				oldInteractionOperator, newInteractionOperator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InteractionOperand> getOperands() {
		if (operands == null) {
			operands = new EObjectContainmentEList.Resolving<InteractionOperand>(
				InteractionOperand.class, this,
				UMLPackage.COMBINED_FRAGMENT__OPERAND);
		}
		return operands;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InteractionOperand createOperand(String name) {
		InteractionOperand newOperand = (InteractionOperand) create(
			UMLPackage.Literals.INTERACTION_OPERAND);
		getOperands().add(newOperand);
		if (name != null)
			newOperand.setName(name);
		return newOperand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InteractionOperand getOperand(String name) {
		return getOperand(name, false, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InteractionOperand getOperand(String name, boolean ignoreCase,
			boolean createOnDemand) {
		operandLoop : for (InteractionOperand operand : getOperands()) {
			if (name != null && !(ignoreCase
				? name.equalsIgnoreCase(operand.getName())
				: name.equals(operand.getName())))
				continue operandLoop;
			return operand;
		}
		return createOnDemand
			? createOperand(name)
			: null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Gate> getCfragmentGates() {
		if (cfragmentGates == null) {
			cfragmentGates = new EObjectContainmentEList.Resolving<Gate>(
				Gate.class, this, UMLPackage.COMBINED_FRAGMENT__CFRAGMENT_GATE);
		}
		return cfragmentGates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Gate createCfragmentGate(String name) {
		Gate newCfragmentGate = (Gate) create(UMLPackage.Literals.GATE);
		getCfragmentGates().add(newCfragmentGate);
		if (name != null)
			newCfragmentGate.setName(name);
		return newCfragmentGate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Gate getCfragmentGate(String name) {
		return getCfragmentGate(name, false, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Gate getCfragmentGate(String name, boolean ignoreCase,
			boolean createOnDemand) {
		cfragmentGateLoop : for (Gate cfragmentGate : getCfragmentGates()) {
			if (name != null && !(ignoreCase
				? name.equalsIgnoreCase(cfragmentGate.getName())
				: name.equals(cfragmentGate.getName())))
				continue cfragmentGateLoop;
			return cfragmentGate;
		}
		return createOnDemand
			? createCfragmentGate(name)
			: null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOptLoopBreakNeg(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return CombinedFragmentOperations.validateOptLoopBreakNeg(this,
			diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBreak(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return CombinedFragmentOperations.validateBreak(this, diagnostics,
			context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsiderAndIgnore(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return CombinedFragmentOperations.validateConsiderAndIgnore(this,
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
			case UMLPackage.COMBINED_FRAGMENT__EANNOTATIONS :
				return ((InternalEList<?>) getEAnnotations())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.COMBINED_FRAGMENT__OWNED_COMMENT :
				return ((InternalEList<?>) getOwnedComments())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.COMBINED_FRAGMENT__NAME_EXPRESSION :
				return basicSetNameExpression(null, msgs);
			case UMLPackage.COMBINED_FRAGMENT__COVERED :
				return ((InternalEList<?>) getCovereds()).basicRemove(otherEnd,
					msgs);
			case UMLPackage.COMBINED_FRAGMENT__ENCLOSING_OPERAND :
				return basicSetEnclosingOperand(null, msgs);
			case UMLPackage.COMBINED_FRAGMENT__ENCLOSING_INTERACTION :
				return basicSetEnclosingInteraction(null, msgs);
			case UMLPackage.COMBINED_FRAGMENT__GENERAL_ORDERING :
				return ((InternalEList<?>) getGeneralOrderings())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.COMBINED_FRAGMENT__CFRAGMENT_GATE :
				return ((InternalEList<?>) getCfragmentGates())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.COMBINED_FRAGMENT__OPERAND :
				return ((InternalEList<?>) getOperands()).basicRemove(otherEnd,
					msgs);
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
			case UMLPackage.COMBINED_FRAGMENT__EANNOTATIONS :
				return getEAnnotations();
			case UMLPackage.COMBINED_FRAGMENT__OWNED_COMMENT :
				return getOwnedComments();
			case UMLPackage.COMBINED_FRAGMENT__OWNED_ELEMENT :
				return getOwnedElements();
			case UMLPackage.COMBINED_FRAGMENT__OWNER :
				if (resolve)
					return getOwner();
				return basicGetOwner();
			case UMLPackage.COMBINED_FRAGMENT__CLIENT_DEPENDENCY :
				return getClientDependencies();
			case UMLPackage.COMBINED_FRAGMENT__NAME :
				return getName();
			case UMLPackage.COMBINED_FRAGMENT__NAME_EXPRESSION :
				if (resolve)
					return getNameExpression();
				return basicGetNameExpression();
			case UMLPackage.COMBINED_FRAGMENT__NAMESPACE :
				if (resolve)
					return getNamespace();
				return basicGetNamespace();
			case UMLPackage.COMBINED_FRAGMENT__QUALIFIED_NAME :
				return getQualifiedName();
			case UMLPackage.COMBINED_FRAGMENT__VISIBILITY :
				return getVisibility();
			case UMLPackage.COMBINED_FRAGMENT__COVERED :
				return getCovereds();
			case UMLPackage.COMBINED_FRAGMENT__ENCLOSING_OPERAND :
				if (resolve)
					return getEnclosingOperand();
				return basicGetEnclosingOperand();
			case UMLPackage.COMBINED_FRAGMENT__ENCLOSING_INTERACTION :
				if (resolve)
					return getEnclosingInteraction();
				return basicGetEnclosingInteraction();
			case UMLPackage.COMBINED_FRAGMENT__GENERAL_ORDERING :
				return getGeneralOrderings();
			case UMLPackage.COMBINED_FRAGMENT__CFRAGMENT_GATE :
				return getCfragmentGates();
			case UMLPackage.COMBINED_FRAGMENT__INTERACTION_OPERATOR :
				return getInteractionOperator();
			case UMLPackage.COMBINED_FRAGMENT__OPERAND :
				return getOperands();
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
			case UMLPackage.COMBINED_FRAGMENT__EANNOTATIONS :
				getEAnnotations().clear();
				getEAnnotations()
					.addAll((Collection<? extends EAnnotation>) newValue);
				return;
			case UMLPackage.COMBINED_FRAGMENT__OWNED_COMMENT :
				getOwnedComments().clear();
				getOwnedComments()
					.addAll((Collection<? extends Comment>) newValue);
				return;
			case UMLPackage.COMBINED_FRAGMENT__NAME :
				setName((String) newValue);
				return;
			case UMLPackage.COMBINED_FRAGMENT__NAME_EXPRESSION :
				setNameExpression((StringExpression) newValue);
				return;
			case UMLPackage.COMBINED_FRAGMENT__VISIBILITY :
				setVisibility((VisibilityKind) newValue);
				return;
			case UMLPackage.COMBINED_FRAGMENT__COVERED :
				getCovereds().clear();
				getCovereds().addAll((Collection<? extends Lifeline>) newValue);
				return;
			case UMLPackage.COMBINED_FRAGMENT__ENCLOSING_OPERAND :
				setEnclosingOperand((InteractionOperand) newValue);
				return;
			case UMLPackage.COMBINED_FRAGMENT__ENCLOSING_INTERACTION :
				setEnclosingInteraction((Interaction) newValue);
				return;
			case UMLPackage.COMBINED_FRAGMENT__GENERAL_ORDERING :
				getGeneralOrderings().clear();
				getGeneralOrderings()
					.addAll((Collection<? extends GeneralOrdering>) newValue);
				return;
			case UMLPackage.COMBINED_FRAGMENT__CFRAGMENT_GATE :
				getCfragmentGates().clear();
				getCfragmentGates()
					.addAll((Collection<? extends Gate>) newValue);
				return;
			case UMLPackage.COMBINED_FRAGMENT__INTERACTION_OPERATOR :
				setInteractionOperator((InteractionOperatorKind) newValue);
				return;
			case UMLPackage.COMBINED_FRAGMENT__OPERAND :
				getOperands().clear();
				getOperands().addAll(
					(Collection<? extends InteractionOperand>) newValue);
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
			case UMLPackage.COMBINED_FRAGMENT__EANNOTATIONS :
				getEAnnotations().clear();
				return;
			case UMLPackage.COMBINED_FRAGMENT__OWNED_COMMENT :
				getOwnedComments().clear();
				return;
			case UMLPackage.COMBINED_FRAGMENT__NAME :
				unsetName();
				return;
			case UMLPackage.COMBINED_FRAGMENT__NAME_EXPRESSION :
				setNameExpression((StringExpression) null);
				return;
			case UMLPackage.COMBINED_FRAGMENT__VISIBILITY :
				unsetVisibility();
				return;
			case UMLPackage.COMBINED_FRAGMENT__COVERED :
				getCovereds().clear();
				return;
			case UMLPackage.COMBINED_FRAGMENT__ENCLOSING_OPERAND :
				setEnclosingOperand((InteractionOperand) null);
				return;
			case UMLPackage.COMBINED_FRAGMENT__ENCLOSING_INTERACTION :
				setEnclosingInteraction((Interaction) null);
				return;
			case UMLPackage.COMBINED_FRAGMENT__GENERAL_ORDERING :
				getGeneralOrderings().clear();
				return;
			case UMLPackage.COMBINED_FRAGMENT__CFRAGMENT_GATE :
				getCfragmentGates().clear();
				return;
			case UMLPackage.COMBINED_FRAGMENT__INTERACTION_OPERATOR :
				setInteractionOperator(INTERACTION_OPERATOR_EDEFAULT);
				return;
			case UMLPackage.COMBINED_FRAGMENT__OPERAND :
				getOperands().clear();
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
			case UMLPackage.COMBINED_FRAGMENT__EANNOTATIONS :
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UMLPackage.COMBINED_FRAGMENT__OWNED_COMMENT :
				return ownedComments != null && !ownedComments.isEmpty();
			case UMLPackage.COMBINED_FRAGMENT__OWNED_ELEMENT :
				return isSetOwnedElements();
			case UMLPackage.COMBINED_FRAGMENT__OWNER :
				return isSetOwner();
			case UMLPackage.COMBINED_FRAGMENT__CLIENT_DEPENDENCY :
				return !getClientDependencies().isEmpty();
			case UMLPackage.COMBINED_FRAGMENT__NAME :
				return isSetName();
			case UMLPackage.COMBINED_FRAGMENT__NAME_EXPRESSION :
				return nameExpression != null;
			case UMLPackage.COMBINED_FRAGMENT__NAMESPACE :
				return isSetNamespace();
			case UMLPackage.COMBINED_FRAGMENT__QUALIFIED_NAME :
				return QUALIFIED_NAME_EDEFAULT == null
					? getQualifiedName() != null
					: !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case UMLPackage.COMBINED_FRAGMENT__VISIBILITY :
				return isSetVisibility();
			case UMLPackage.COMBINED_FRAGMENT__COVERED :
				return covereds != null && !covereds.isEmpty();
			case UMLPackage.COMBINED_FRAGMENT__ENCLOSING_OPERAND :
				return basicGetEnclosingOperand() != null;
			case UMLPackage.COMBINED_FRAGMENT__ENCLOSING_INTERACTION :
				return basicGetEnclosingInteraction() != null;
			case UMLPackage.COMBINED_FRAGMENT__GENERAL_ORDERING :
				return generalOrderings != null && !generalOrderings.isEmpty();
			case UMLPackage.COMBINED_FRAGMENT__CFRAGMENT_GATE :
				return cfragmentGates != null && !cfragmentGates.isEmpty();
			case UMLPackage.COMBINED_FRAGMENT__INTERACTION_OPERATOR :
				return (eFlags
					& INTERACTION_OPERATOR_EFLAG) != INTERACTION_OPERATOR_EFLAG_DEFAULT;
			case UMLPackage.COMBINED_FRAGMENT__OPERAND :
				return operands != null && !operands.isEmpty();
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
			case UMLPackage.COMBINED_FRAGMENT___GET_EANNOTATION__STRING :
				return getEAnnotation((String) arguments.get(0));
			case UMLPackage.COMBINED_FRAGMENT___VALIDATE_HAS_OWNER__DIAGNOSTICCHAIN_MAP :
				return validateHasOwner((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.COMBINED_FRAGMENT___VALIDATE_NOT_OWN_SELF__DIAGNOSTICCHAIN_MAP :
				return validateNotOwnSelf((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.COMBINED_FRAGMENT___ADD_KEYWORD__STRING :
				return addKeyword((String) arguments.get(0));
			case UMLPackage.COMBINED_FRAGMENT___APPLY_STEREOTYPE__STEREOTYPE :
				return applyStereotype((Stereotype) arguments.get(0));
			case UMLPackage.COMBINED_FRAGMENT___CREATE_EANNOTATION__STRING :
				return createEAnnotation((String) arguments.get(0));
			case UMLPackage.COMBINED_FRAGMENT___DESTROY :
				destroy();
				return null;
			case UMLPackage.COMBINED_FRAGMENT___GET_KEYWORDS :
				return getKeywords();
			case UMLPackage.COMBINED_FRAGMENT___GET_APPLICABLE_STEREOTYPE__STRING :
				return getApplicableStereotype((String) arguments.get(0));
			case UMLPackage.COMBINED_FRAGMENT___GET_APPLICABLE_STEREOTYPES :
				return getApplicableStereotypes();
			case UMLPackage.COMBINED_FRAGMENT___GET_APPLIED_STEREOTYPE__STRING :
				return getAppliedStereotype((String) arguments.get(0));
			case UMLPackage.COMBINED_FRAGMENT___GET_APPLIED_STEREOTYPES :
				return getAppliedStereotypes();
			case UMLPackage.COMBINED_FRAGMENT___GET_APPLIED_SUBSTEREOTYPE__STEREOTYPE_STRING :
				return getAppliedSubstereotype((Stereotype) arguments.get(0),
					(String) arguments.get(1));
			case UMLPackage.COMBINED_FRAGMENT___GET_APPLIED_SUBSTEREOTYPES__STEREOTYPE :
				return getAppliedSubstereotypes((Stereotype) arguments.get(0));
			case UMLPackage.COMBINED_FRAGMENT___GET_MODEL :
				return getModel();
			case UMLPackage.COMBINED_FRAGMENT___GET_NEAREST_PACKAGE :
				return getNearestPackage();
			case UMLPackage.COMBINED_FRAGMENT___GET_RELATIONSHIPS :
				return getRelationships();
			case UMLPackage.COMBINED_FRAGMENT___GET_RELATIONSHIPS__ECLASS :
				return getRelationships((EClass) arguments.get(0));
			case UMLPackage.COMBINED_FRAGMENT___GET_REQUIRED_STEREOTYPE__STRING :
				return getRequiredStereotype((String) arguments.get(0));
			case UMLPackage.COMBINED_FRAGMENT___GET_REQUIRED_STEREOTYPES :
				return getRequiredStereotypes();
			case UMLPackage.COMBINED_FRAGMENT___GET_SOURCE_DIRECTED_RELATIONSHIPS :
				return getSourceDirectedRelationships();
			case UMLPackage.COMBINED_FRAGMENT___GET_SOURCE_DIRECTED_RELATIONSHIPS__ECLASS :
				return getSourceDirectedRelationships(
					(EClass) arguments.get(0));
			case UMLPackage.COMBINED_FRAGMENT___GET_STEREOTYPE_APPLICATION__STEREOTYPE :
				return getStereotypeApplication((Stereotype) arguments.get(0));
			case UMLPackage.COMBINED_FRAGMENT___GET_STEREOTYPE_APPLICATIONS :
				return getStereotypeApplications();
			case UMLPackage.COMBINED_FRAGMENT___GET_TARGET_DIRECTED_RELATIONSHIPS :
				return getTargetDirectedRelationships();
			case UMLPackage.COMBINED_FRAGMENT___GET_TARGET_DIRECTED_RELATIONSHIPS__ECLASS :
				return getTargetDirectedRelationships(
					(EClass) arguments.get(0));
			case UMLPackage.COMBINED_FRAGMENT___GET_VALUE__STEREOTYPE_STRING :
				return getValue((Stereotype) arguments.get(0),
					(String) arguments.get(1));
			case UMLPackage.COMBINED_FRAGMENT___HAS_KEYWORD__STRING :
				return hasKeyword((String) arguments.get(0));
			case UMLPackage.COMBINED_FRAGMENT___HAS_VALUE__STEREOTYPE_STRING :
				return hasValue((Stereotype) arguments.get(0),
					(String) arguments.get(1));
			case UMLPackage.COMBINED_FRAGMENT___IS_STEREOTYPE_APPLICABLE__STEREOTYPE :
				return isStereotypeApplicable((Stereotype) arguments.get(0));
			case UMLPackage.COMBINED_FRAGMENT___IS_STEREOTYPE_APPLIED__STEREOTYPE :
				return isStereotypeApplied((Stereotype) arguments.get(0));
			case UMLPackage.COMBINED_FRAGMENT___IS_STEREOTYPE_REQUIRED__STEREOTYPE :
				return isStereotypeRequired((Stereotype) arguments.get(0));
			case UMLPackage.COMBINED_FRAGMENT___REMOVE_KEYWORD__STRING :
				return removeKeyword((String) arguments.get(0));
			case UMLPackage.COMBINED_FRAGMENT___SET_VALUE__STEREOTYPE_STRING_OBJECT :
				setValue((Stereotype) arguments.get(0),
					(String) arguments.get(1), arguments.get(2));
				return null;
			case UMLPackage.COMBINED_FRAGMENT___UNAPPLY_STEREOTYPE__STEREOTYPE :
				return unapplyStereotype((Stereotype) arguments.get(0));
			case UMLPackage.COMBINED_FRAGMENT___ALL_OWNED_ELEMENTS :
				return allOwnedElements();
			case UMLPackage.COMBINED_FRAGMENT___MUST_BE_OWNED :
				return mustBeOwned();
			case UMLPackage.COMBINED_FRAGMENT___VALIDATE_VISIBILITY_NEEDS_OWNERSHIP__DIAGNOSTICCHAIN_MAP :
				return validateVisibilityNeedsOwnership(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.COMBINED_FRAGMENT___VALIDATE_HAS_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP :
				return validateHasQualifiedName(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.COMBINED_FRAGMENT___VALIDATE_HAS_NO_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP :
				return validateHasNoQualifiedName(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.COMBINED_FRAGMENT___CREATE_DEPENDENCY__NAMEDELEMENT :
				return createDependency((NamedElement) arguments.get(0));
			case UMLPackage.COMBINED_FRAGMENT___CREATE_USAGE__NAMEDELEMENT :
				return createUsage((NamedElement) arguments.get(0));
			case UMLPackage.COMBINED_FRAGMENT___GET_LABEL :
				return getLabel();
			case UMLPackage.COMBINED_FRAGMENT___GET_LABEL__BOOLEAN :
				return getLabel((Boolean) arguments.get(0));
			case UMLPackage.COMBINED_FRAGMENT___GET_NAMESPACE :
				return getNamespace();
			case UMLPackage.COMBINED_FRAGMENT___ALL_NAMESPACES :
				return allNamespaces();
			case UMLPackage.COMBINED_FRAGMENT___ALL_OWNING_PACKAGES :
				return allOwningPackages();
			case UMLPackage.COMBINED_FRAGMENT___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE :
				return isDistinguishableFrom((NamedElement) arguments.get(0),
					(Namespace) arguments.get(1));
			case UMLPackage.COMBINED_FRAGMENT___GET_QUALIFIED_NAME :
				return getQualifiedName();
			case UMLPackage.COMBINED_FRAGMENT___SEPARATOR :
				return separator();
			case UMLPackage.COMBINED_FRAGMENT___GET_CLIENT_DEPENDENCIES :
				return getClientDependencies();
			case UMLPackage.COMBINED_FRAGMENT___VALIDATE_BREAK__DIAGNOSTICCHAIN_MAP :
				return validateBreak((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.COMBINED_FRAGMENT___VALIDATE_CONSIDER_AND_IGNORE__DIAGNOSTICCHAIN_MAP :
				return validateConsiderAndIgnore(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.COMBINED_FRAGMENT___VALIDATE_OPT_LOOP_BREAK_NEG__DIAGNOSTICCHAIN_MAP :
				return validateOptLoopBreakNeg(
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
		result.append(" (interactionOperator: "); //$NON-NLS-1$
		result.append(INTERACTION_OPERATOR_EFLAG_VALUES[(eFlags
			& INTERACTION_OPERATOR_EFLAG) >>> INTERACTION_OPERATOR_EFLAG_OFFSET]);
		result.append(')');
		return result.toString();
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
		UMLPackage.COMBINED_FRAGMENT__OWNED_COMMENT,
		UMLPackage.COMBINED_FRAGMENT__NAME_EXPRESSION,
		UMLPackage.COMBINED_FRAGMENT__GENERAL_ORDERING,
		UMLPackage.COMBINED_FRAGMENT__CFRAGMENT_GATE,
		UMLPackage.COMBINED_FRAGMENT__OPERAND};

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetOwnedElements() {
		return super.isSetOwnedElements()
			|| eIsSet(UMLPackage.COMBINED_FRAGMENT__CFRAGMENT_GATE)
			|| eIsSet(UMLPackage.COMBINED_FRAGMENT__OPERAND);
	}

} //CombinedFragmentImpl
