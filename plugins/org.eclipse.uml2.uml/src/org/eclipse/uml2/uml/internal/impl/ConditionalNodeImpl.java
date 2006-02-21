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
 * $Id: ConditionalNodeImpl.java,v 1.12 2006/02/21 16:12:18 khussey Exp $
 */
package org.eclipse.uml2.uml.internal.impl;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.uml2.common.util.DerivedUnionEObjectEList;

import org.eclipse.uml2.uml.Activity;
import org.eclipse.uml2.uml.Clause;
import org.eclipse.uml2.uml.ConditionalNode;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.OutputPin;
import org.eclipse.uml2.uml.StringExpression;
import org.eclipse.uml2.uml.StructuredActivityNode;
import org.eclipse.uml2.uml.UMLFactory;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.VisibilityKind;

import org.eclipse.uml2.uml.internal.operations.ConditionalNodeOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Conditional Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ConditionalNodeImpl#getOwnedElements <em>Owned Element</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ConditionalNodeImpl#getOutputs <em>Output</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ConditionalNodeImpl#isDeterminate <em>Is Determinate</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ConditionalNodeImpl#isAssured <em>Is Assured</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ConditionalNodeImpl#getClauses <em>Clause</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ConditionalNodeImpl#getResults <em>Result</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConditionalNodeImpl
		extends StructuredActivityNodeImpl
		implements ConditionalNode {

	/**
	 * The default value of the '{@link #isDeterminate() <em>Is Determinate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDeterminate()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_DETERMINATE_EDEFAULT = false;

	/**
	 * The flag representing the value of the '{@link #isDeterminate() <em>Is Determinate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDeterminate()
	 * @generated
	 * @ordered
	 */
	protected static final int IS_DETERMINATE_EFLAG = 1 << 10;

	/**
	 * The default value of the '{@link #isAssured() <em>Is Assured</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAssured()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_ASSURED_EDEFAULT = false;

	/**
	 * The flag representing the value of the '{@link #isAssured() <em>Is Assured</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAssured()
	 * @generated
	 * @ordered
	 */
	protected static final int IS_ASSURED_EFLAG = 1 << 11;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConditionalNodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return UMLPackage.Literals.CONDITIONAL_NODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getOwnedElements() {
		EList ownedElement = (EList) eVirtualGet(UMLPackage.CONDITIONAL_NODE__OWNED_ELEMENT);
		if (ownedElement == null) {
			eVirtualSet(UMLPackage.CONDITIONAL_NODE__OWNED_ELEMENT,
				ownedElement = new DerivedUnionEObjectEList(Element.class,
					this, UMLPackage.CONDITIONAL_NODE__OWNED_ELEMENT,
					new int[]{UMLPackage.CONDITIONAL_NODE__OWNED_COMMENT,
						UMLPackage.CONDITIONAL_NODE__NAME_EXPRESSION,
						UMLPackage.CONDITIONAL_NODE__HANDLER,
						UMLPackage.CONDITIONAL_NODE__OUTPUT,
						UMLPackage.CONDITIONAL_NODE__INPUT,
						UMLPackage.CONDITIONAL_NODE__LOCAL_PRECONDITION,
						UMLPackage.CONDITIONAL_NODE__LOCAL_POSTCONDITION,
						UMLPackage.CONDITIONAL_NODE__ELEMENT_IMPORT,
						UMLPackage.CONDITIONAL_NODE__PACKAGE_IMPORT,
						UMLPackage.CONDITIONAL_NODE__OWNED_MEMBER,
						UMLPackage.CONDITIONAL_NODE__SUBGROUP,
						UMLPackage.CONDITIONAL_NODE__CLAUSE}));
		}
		return ownedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getOutputs() {
		EList output = (EList) eVirtualGet(UMLPackage.CONDITIONAL_NODE__OUTPUT);
		if (output == null) {
			eVirtualSet(UMLPackage.CONDITIONAL_NODE__OUTPUT,
				output = new DerivedUnionEObjectEList(OutputPin.class, this,
					UMLPackage.CONDITIONAL_NODE__OUTPUT,
					new int[]{UMLPackage.CONDITIONAL_NODE__RESULT}));
		}
		return output;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isDeterminate() {
		return (eFlags & IS_DETERMINATE_EFLAG) != 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsDeterminate(boolean newIsDeterminate) {
		boolean oldIsDeterminate = (eFlags & IS_DETERMINATE_EFLAG) != 0;
		if (newIsDeterminate)
			eFlags |= IS_DETERMINATE_EFLAG;
		else
			eFlags &= ~IS_DETERMINATE_EFLAG;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.CONDITIONAL_NODE__IS_DETERMINATE, oldIsDeterminate,
				newIsDeterminate));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAssured() {
		return (eFlags & IS_ASSURED_EFLAG) != 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsAssured(boolean newIsAssured) {
		boolean oldIsAssured = (eFlags & IS_ASSURED_EFLAG) != 0;
		if (newIsAssured)
			eFlags |= IS_ASSURED_EFLAG;
		else
			eFlags &= ~IS_ASSURED_EFLAG;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.CONDITIONAL_NODE__IS_ASSURED, oldIsAssured,
				newIsAssured));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getClauses() {
		EList clause = (EList) eVirtualGet(UMLPackage.CONDITIONAL_NODE__CLAUSE);
		if (clause == null) {
			eVirtualSet(UMLPackage.CONDITIONAL_NODE__CLAUSE,
				clause = new EObjectContainmentEList.Resolving(Clause.class,
					this, UMLPackage.CONDITIONAL_NODE__CLAUSE));
		}
		return clause;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Clause createClause() {
		Clause newClause = UMLFactory.eINSTANCE.createClause();
		getClauses().add(newClause);
		return newClause;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getResults() {
		EList result = (EList) eVirtualGet(UMLPackage.CONDITIONAL_NODE__RESULT);
		if (result == null) {
			eVirtualSet(UMLPackage.CONDITIONAL_NODE__RESULT,
				result = new EObjectContainmentEList.Resolving(OutputPin.class,
					this, UMLPackage.CONDITIONAL_NODE__RESULT));
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutputPin createResult() {
		OutputPin newResult = UMLFactory.eINSTANCE.createOutputPin();
		getResults().add(newResult);
		return newResult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutputPin getResult(String name) {
		for (Iterator i = getResults().iterator(); i.hasNext();) {
			OutputPin result = (OutputPin) i.next();
			if (name.equals(result.getName())) {
				return result;
			}
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResultNoIncoming(DiagnosticChain diagnostics,
			Map context) {
		return ConditionalNodeOperations.validateResultNoIncoming(this,
			diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UMLPackage.CONDITIONAL_NODE__EANNOTATIONS :
				return ((InternalEList) getEAnnotations()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.CONDITIONAL_NODE__OWNED_COMMENT :
				return ((InternalEList) getOwnedComments()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.CONDITIONAL_NODE__CLIENT_DEPENDENCY :
				return ((InternalEList) getClientDependencies()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.CONDITIONAL_NODE__NAME_EXPRESSION :
				return basicSetNameExpression(null, msgs);
			case UMLPackage.CONDITIONAL_NODE__IN_STRUCTURED_NODE :
				return eBasicSetContainer(null,
					UMLPackage.CONDITIONAL_NODE__IN_STRUCTURED_NODE, msgs);
			case UMLPackage.CONDITIONAL_NODE__ACTIVITY :
				return eBasicSetContainer(null,
					UMLPackage.CONDITIONAL_NODE__ACTIVITY, msgs);
			case UMLPackage.CONDITIONAL_NODE__OUTGOING :
				return ((InternalEList) getOutgoings()).basicRemove(otherEnd,
					msgs);
			case UMLPackage.CONDITIONAL_NODE__INCOMING :
				return ((InternalEList) getIncomings()).basicRemove(otherEnd,
					msgs);
			case UMLPackage.CONDITIONAL_NODE__IN_PARTITION :
				return ((InternalEList) getInPartitions()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.CONDITIONAL_NODE__IN_INTERRUPTIBLE_REGION :
				return ((InternalEList) getInInterruptibleRegions())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.CONDITIONAL_NODE__HANDLER :
				return ((InternalEList) getHandlers()).basicRemove(otherEnd,
					msgs);
			case UMLPackage.CONDITIONAL_NODE__LOCAL_PRECONDITION :
				return ((InternalEList) getLocalPreconditions()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.CONDITIONAL_NODE__LOCAL_POSTCONDITION :
				return ((InternalEList) getLocalPostconditions()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.CONDITIONAL_NODE__ELEMENT_IMPORT :
				return ((InternalEList) getElementImports()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.CONDITIONAL_NODE__PACKAGE_IMPORT :
				return ((InternalEList) getPackageImports()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.CONDITIONAL_NODE__OWNED_RULE :
				return ((InternalEList) getOwnedRules()).basicRemove(otherEnd,
					msgs);
			case UMLPackage.CONDITIONAL_NODE__IN_ACTIVITY :
				return eBasicSetContainer(null,
					UMLPackage.CONDITIONAL_NODE__IN_ACTIVITY, msgs);
			case UMLPackage.CONDITIONAL_NODE__VARIABLE :
				return ((InternalEList) getVariables()).basicRemove(otherEnd,
					msgs);
			case UMLPackage.CONDITIONAL_NODE__EDGE :
				return ((InternalEList) getEdges()).basicRemove(otherEnd, msgs);
			case UMLPackage.CONDITIONAL_NODE__NODE :
				return ((InternalEList) getNodes()).basicRemove(otherEnd, msgs);
			case UMLPackage.CONDITIONAL_NODE__CLAUSE :
				return ((InternalEList) getClauses()).basicRemove(otherEnd,
					msgs);
			case UMLPackage.CONDITIONAL_NODE__RESULT :
				return ((InternalEList) getResults()).basicRemove(otherEnd,
					msgs);
		}
		return eDynamicInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UMLPackage.CONDITIONAL_NODE__EANNOTATIONS :
				return getEAnnotations();
			case UMLPackage.CONDITIONAL_NODE__OWNED_ELEMENT :
				return getOwnedElements();
			case UMLPackage.CONDITIONAL_NODE__OWNER :
				if (resolve)
					return getOwner();
				return basicGetOwner();
			case UMLPackage.CONDITIONAL_NODE__OWNED_COMMENT :
				return getOwnedComments();
			case UMLPackage.CONDITIONAL_NODE__NAME :
				return getName();
			case UMLPackage.CONDITIONAL_NODE__VISIBILITY :
				return getVisibility();
			case UMLPackage.CONDITIONAL_NODE__QUALIFIED_NAME :
				return getQualifiedName();
			case UMLPackage.CONDITIONAL_NODE__CLIENT_DEPENDENCY :
				return getClientDependencies();
			case UMLPackage.CONDITIONAL_NODE__NAMESPACE :
				if (resolve)
					return getNamespace();
				return basicGetNamespace();
			case UMLPackage.CONDITIONAL_NODE__NAME_EXPRESSION :
				if (resolve)
					return getNameExpression();
				return basicGetNameExpression();
			case UMLPackage.CONDITIONAL_NODE__IS_LEAF :
				return isLeaf()
					? Boolean.TRUE
					: Boolean.FALSE;
			case UMLPackage.CONDITIONAL_NODE__REDEFINED_ELEMENT :
				return getRedefinedElements();
			case UMLPackage.CONDITIONAL_NODE__REDEFINITION_CONTEXT :
				return getRedefinitionContexts();
			case UMLPackage.CONDITIONAL_NODE__IN_STRUCTURED_NODE :
				return getInStructuredNode();
			case UMLPackage.CONDITIONAL_NODE__ACTIVITY :
				return getActivity();
			case UMLPackage.CONDITIONAL_NODE__OUTGOING :
				return getOutgoings();
			case UMLPackage.CONDITIONAL_NODE__INCOMING :
				return getIncomings();
			case UMLPackage.CONDITIONAL_NODE__IN_PARTITION :
				return getInPartitions();
			case UMLPackage.CONDITIONAL_NODE__IN_INTERRUPTIBLE_REGION :
				return getInInterruptibleRegions();
			case UMLPackage.CONDITIONAL_NODE__IN_GROUP :
				return getInGroups();
			case UMLPackage.CONDITIONAL_NODE__REDEFINED_NODE :
				return getRedefinedNodes();
			case UMLPackage.CONDITIONAL_NODE__HANDLER :
				return getHandlers();
			case UMLPackage.CONDITIONAL_NODE__OUTPUT :
				return getOutputs();
			case UMLPackage.CONDITIONAL_NODE__INPUT :
				return getInputs();
			case UMLPackage.CONDITIONAL_NODE__CONTEXT :
				return getContext();
			case UMLPackage.CONDITIONAL_NODE__LOCAL_PRECONDITION :
				return getLocalPreconditions();
			case UMLPackage.CONDITIONAL_NODE__LOCAL_POSTCONDITION :
				return getLocalPostconditions();
			case UMLPackage.CONDITIONAL_NODE__ELEMENT_IMPORT :
				return getElementImports();
			case UMLPackage.CONDITIONAL_NODE__PACKAGE_IMPORT :
				return getPackageImports();
			case UMLPackage.CONDITIONAL_NODE__OWNED_RULE :
				return getOwnedRules();
			case UMLPackage.CONDITIONAL_NODE__MEMBER :
				return getMembers();
			case UMLPackage.CONDITIONAL_NODE__IMPORTED_MEMBER :
				return getImportedMembers();
			case UMLPackage.CONDITIONAL_NODE__OWNED_MEMBER :
				return getOwnedMembers();
			case UMLPackage.CONDITIONAL_NODE__SUBGROUP :
				return getSubgroups();
			case UMLPackage.CONDITIONAL_NODE__SUPER_GROUP :
				return getSuperGroup();
			case UMLPackage.CONDITIONAL_NODE__IN_ACTIVITY :
				return getInActivity();
			case UMLPackage.CONDITIONAL_NODE__CONTAINED_EDGE :
				return getContainedEdges();
			case UMLPackage.CONDITIONAL_NODE__CONTAINED_NODE :
				return getContainedNodes();
			case UMLPackage.CONDITIONAL_NODE__VARIABLE :
				return getVariables();
			case UMLPackage.CONDITIONAL_NODE__EDGE :
				return getEdges();
			case UMLPackage.CONDITIONAL_NODE__MUST_ISOLATE :
				return isMustIsolate()
					? Boolean.TRUE
					: Boolean.FALSE;
			case UMLPackage.CONDITIONAL_NODE__NODE :
				return getNodes();
			case UMLPackage.CONDITIONAL_NODE__IS_DETERMINATE :
				return isDeterminate()
					? Boolean.TRUE
					: Boolean.FALSE;
			case UMLPackage.CONDITIONAL_NODE__IS_ASSURED :
				return isAssured()
					? Boolean.TRUE
					: Boolean.FALSE;
			case UMLPackage.CONDITIONAL_NODE__CLAUSE :
				return getClauses();
			case UMLPackage.CONDITIONAL_NODE__RESULT :
				return getResults();
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
			case UMLPackage.CONDITIONAL_NODE__EANNOTATIONS :
				getEAnnotations().clear();
				getEAnnotations().addAll((Collection) newValue);
				return;
			case UMLPackage.CONDITIONAL_NODE__OWNED_COMMENT :
				getOwnedComments().clear();
				getOwnedComments().addAll((Collection) newValue);
				return;
			case UMLPackage.CONDITIONAL_NODE__NAME :
				setName((String) newValue);
				return;
			case UMLPackage.CONDITIONAL_NODE__VISIBILITY :
				setVisibility((VisibilityKind) newValue);
				return;
			case UMLPackage.CONDITIONAL_NODE__CLIENT_DEPENDENCY :
				getClientDependencies().clear();
				getClientDependencies().addAll((Collection) newValue);
				return;
			case UMLPackage.CONDITIONAL_NODE__NAME_EXPRESSION :
				setNameExpression((StringExpression) newValue);
				return;
			case UMLPackage.CONDITIONAL_NODE__IS_LEAF :
				setIsLeaf(((Boolean) newValue).booleanValue());
				return;
			case UMLPackage.CONDITIONAL_NODE__IN_STRUCTURED_NODE :
				setInStructuredNode((StructuredActivityNode) newValue);
				return;
			case UMLPackage.CONDITIONAL_NODE__ACTIVITY :
				setActivity((Activity) newValue);
				return;
			case UMLPackage.CONDITIONAL_NODE__OUTGOING :
				getOutgoings().clear();
				getOutgoings().addAll((Collection) newValue);
				return;
			case UMLPackage.CONDITIONAL_NODE__INCOMING :
				getIncomings().clear();
				getIncomings().addAll((Collection) newValue);
				return;
			case UMLPackage.CONDITIONAL_NODE__IN_PARTITION :
				getInPartitions().clear();
				getInPartitions().addAll((Collection) newValue);
				return;
			case UMLPackage.CONDITIONAL_NODE__IN_INTERRUPTIBLE_REGION :
				getInInterruptibleRegions().clear();
				getInInterruptibleRegions().addAll((Collection) newValue);
				return;
			case UMLPackage.CONDITIONAL_NODE__REDEFINED_NODE :
				getRedefinedNodes().clear();
				getRedefinedNodes().addAll((Collection) newValue);
				return;
			case UMLPackage.CONDITIONAL_NODE__HANDLER :
				getHandlers().clear();
				getHandlers().addAll((Collection) newValue);
				return;
			case UMLPackage.CONDITIONAL_NODE__LOCAL_PRECONDITION :
				getLocalPreconditions().clear();
				getLocalPreconditions().addAll((Collection) newValue);
				return;
			case UMLPackage.CONDITIONAL_NODE__LOCAL_POSTCONDITION :
				getLocalPostconditions().clear();
				getLocalPostconditions().addAll((Collection) newValue);
				return;
			case UMLPackage.CONDITIONAL_NODE__ELEMENT_IMPORT :
				getElementImports().clear();
				getElementImports().addAll((Collection) newValue);
				return;
			case UMLPackage.CONDITIONAL_NODE__PACKAGE_IMPORT :
				getPackageImports().clear();
				getPackageImports().addAll((Collection) newValue);
				return;
			case UMLPackage.CONDITIONAL_NODE__OWNED_RULE :
				getOwnedRules().clear();
				getOwnedRules().addAll((Collection) newValue);
				return;
			case UMLPackage.CONDITIONAL_NODE__IN_ACTIVITY :
				setInActivity((Activity) newValue);
				return;
			case UMLPackage.CONDITIONAL_NODE__VARIABLE :
				getVariables().clear();
				getVariables().addAll((Collection) newValue);
				return;
			case UMLPackage.CONDITIONAL_NODE__EDGE :
				getEdges().clear();
				getEdges().addAll((Collection) newValue);
				return;
			case UMLPackage.CONDITIONAL_NODE__MUST_ISOLATE :
				setMustIsolate(((Boolean) newValue).booleanValue());
				return;
			case UMLPackage.CONDITIONAL_NODE__NODE :
				getNodes().clear();
				getNodes().addAll((Collection) newValue);
				return;
			case UMLPackage.CONDITIONAL_NODE__IS_DETERMINATE :
				setIsDeterminate(((Boolean) newValue).booleanValue());
				return;
			case UMLPackage.CONDITIONAL_NODE__IS_ASSURED :
				setIsAssured(((Boolean) newValue).booleanValue());
				return;
			case UMLPackage.CONDITIONAL_NODE__CLAUSE :
				getClauses().clear();
				getClauses().addAll((Collection) newValue);
				return;
			case UMLPackage.CONDITIONAL_NODE__RESULT :
				getResults().clear();
				getResults().addAll((Collection) newValue);
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
			case UMLPackage.CONDITIONAL_NODE__EANNOTATIONS :
				getEAnnotations().clear();
				return;
			case UMLPackage.CONDITIONAL_NODE__OWNED_COMMENT :
				getOwnedComments().clear();
				return;
			case UMLPackage.CONDITIONAL_NODE__NAME :
				unsetName();
				return;
			case UMLPackage.CONDITIONAL_NODE__VISIBILITY :
				unsetVisibility();
				return;
			case UMLPackage.CONDITIONAL_NODE__CLIENT_DEPENDENCY :
				getClientDependencies().clear();
				return;
			case UMLPackage.CONDITIONAL_NODE__NAME_EXPRESSION :
				setNameExpression((StringExpression) null);
				return;
			case UMLPackage.CONDITIONAL_NODE__IS_LEAF :
				setIsLeaf(IS_LEAF_EDEFAULT);
				return;
			case UMLPackage.CONDITIONAL_NODE__IN_STRUCTURED_NODE :
				setInStructuredNode((StructuredActivityNode) null);
				return;
			case UMLPackage.CONDITIONAL_NODE__ACTIVITY :
				setActivity((Activity) null);
				return;
			case UMLPackage.CONDITIONAL_NODE__OUTGOING :
				getOutgoings().clear();
				return;
			case UMLPackage.CONDITIONAL_NODE__INCOMING :
				getIncomings().clear();
				return;
			case UMLPackage.CONDITIONAL_NODE__IN_PARTITION :
				getInPartitions().clear();
				return;
			case UMLPackage.CONDITIONAL_NODE__IN_INTERRUPTIBLE_REGION :
				getInInterruptibleRegions().clear();
				return;
			case UMLPackage.CONDITIONAL_NODE__REDEFINED_NODE :
				getRedefinedNodes().clear();
				return;
			case UMLPackage.CONDITIONAL_NODE__HANDLER :
				getHandlers().clear();
				return;
			case UMLPackage.CONDITIONAL_NODE__LOCAL_PRECONDITION :
				getLocalPreconditions().clear();
				return;
			case UMLPackage.CONDITIONAL_NODE__LOCAL_POSTCONDITION :
				getLocalPostconditions().clear();
				return;
			case UMLPackage.CONDITIONAL_NODE__ELEMENT_IMPORT :
				getElementImports().clear();
				return;
			case UMLPackage.CONDITIONAL_NODE__PACKAGE_IMPORT :
				getPackageImports().clear();
				return;
			case UMLPackage.CONDITIONAL_NODE__OWNED_RULE :
				getOwnedRules().clear();
				return;
			case UMLPackage.CONDITIONAL_NODE__IN_ACTIVITY :
				setInActivity((Activity) null);
				return;
			case UMLPackage.CONDITIONAL_NODE__VARIABLE :
				getVariables().clear();
				return;
			case UMLPackage.CONDITIONAL_NODE__EDGE :
				getEdges().clear();
				return;
			case UMLPackage.CONDITIONAL_NODE__MUST_ISOLATE :
				setMustIsolate(MUST_ISOLATE_EDEFAULT);
				return;
			case UMLPackage.CONDITIONAL_NODE__NODE :
				getNodes().clear();
				return;
			case UMLPackage.CONDITIONAL_NODE__IS_DETERMINATE :
				setIsDeterminate(IS_DETERMINATE_EDEFAULT);
				return;
			case UMLPackage.CONDITIONAL_NODE__IS_ASSURED :
				setIsAssured(IS_ASSURED_EDEFAULT);
				return;
			case UMLPackage.CONDITIONAL_NODE__CLAUSE :
				getClauses().clear();
				return;
			case UMLPackage.CONDITIONAL_NODE__RESULT :
				getResults().clear();
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
			case UMLPackage.CONDITIONAL_NODE__EANNOTATIONS :
				EList eAnnotations = (EList) eVirtualGet(UMLPackage.CONDITIONAL_NODE__EANNOTATIONS);
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UMLPackage.CONDITIONAL_NODE__OWNED_ELEMENT :
				return isSetOwnedElements();
			case UMLPackage.CONDITIONAL_NODE__OWNER :
				return isSetOwner();
			case UMLPackage.CONDITIONAL_NODE__OWNED_COMMENT :
				EList ownedComment = (EList) eVirtualGet(UMLPackage.CONDITIONAL_NODE__OWNED_COMMENT);
				return ownedComment != null && !ownedComment.isEmpty();
			case UMLPackage.CONDITIONAL_NODE__NAME :
				return isSetName();
			case UMLPackage.CONDITIONAL_NODE__VISIBILITY :
				return isSetVisibility();
			case UMLPackage.CONDITIONAL_NODE__QUALIFIED_NAME :
				return QUALIFIED_NAME_EDEFAULT == null
					? getQualifiedName() != null
					: !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case UMLPackage.CONDITIONAL_NODE__CLIENT_DEPENDENCY :
				EList clientDependency = (EList) eVirtualGet(UMLPackage.CONDITIONAL_NODE__CLIENT_DEPENDENCY);
				return clientDependency != null && !clientDependency.isEmpty();
			case UMLPackage.CONDITIONAL_NODE__NAMESPACE :
				return isSetNamespace();
			case UMLPackage.CONDITIONAL_NODE__NAME_EXPRESSION :
				return eVirtualGet(UMLPackage.CONDITIONAL_NODE__NAME_EXPRESSION) != null;
			case UMLPackage.CONDITIONAL_NODE__IS_LEAF :
				return ((eFlags & IS_LEAF_EFLAG) != 0) != IS_LEAF_EDEFAULT;
			case UMLPackage.CONDITIONAL_NODE__REDEFINED_ELEMENT :
				return isSetRedefinedElements();
			case UMLPackage.CONDITIONAL_NODE__REDEFINITION_CONTEXT :
				return isSetRedefinitionContexts();
			case UMLPackage.CONDITIONAL_NODE__IN_STRUCTURED_NODE :
				return getInStructuredNode() != null;
			case UMLPackage.CONDITIONAL_NODE__ACTIVITY :
				return isSetActivity();
			case UMLPackage.CONDITIONAL_NODE__OUTGOING :
				EList outgoing = (EList) eVirtualGet(UMLPackage.CONDITIONAL_NODE__OUTGOING);
				return outgoing != null && !outgoing.isEmpty();
			case UMLPackage.CONDITIONAL_NODE__INCOMING :
				EList incoming = (EList) eVirtualGet(UMLPackage.CONDITIONAL_NODE__INCOMING);
				return incoming != null && !incoming.isEmpty();
			case UMLPackage.CONDITIONAL_NODE__IN_PARTITION :
				EList inPartition = (EList) eVirtualGet(UMLPackage.CONDITIONAL_NODE__IN_PARTITION);
				return inPartition != null && !inPartition.isEmpty();
			case UMLPackage.CONDITIONAL_NODE__IN_INTERRUPTIBLE_REGION :
				EList inInterruptibleRegion = (EList) eVirtualGet(UMLPackage.CONDITIONAL_NODE__IN_INTERRUPTIBLE_REGION);
				return inInterruptibleRegion != null
					&& !inInterruptibleRegion.isEmpty();
			case UMLPackage.CONDITIONAL_NODE__IN_GROUP :
				return isSetInGroups();
			case UMLPackage.CONDITIONAL_NODE__REDEFINED_NODE :
				EList redefinedNode = (EList) eVirtualGet(UMLPackage.CONDITIONAL_NODE__REDEFINED_NODE);
				return redefinedNode != null && !redefinedNode.isEmpty();
			case UMLPackage.CONDITIONAL_NODE__HANDLER :
				EList handler = (EList) eVirtualGet(UMLPackage.CONDITIONAL_NODE__HANDLER);
				return handler != null && !handler.isEmpty();
			case UMLPackage.CONDITIONAL_NODE__OUTPUT :
				return isSetOutputs();
			case UMLPackage.CONDITIONAL_NODE__INPUT :
				return isSetInputs();
			case UMLPackage.CONDITIONAL_NODE__CONTEXT :
				return getContext() != null;
			case UMLPackage.CONDITIONAL_NODE__LOCAL_PRECONDITION :
				EList localPrecondition = (EList) eVirtualGet(UMLPackage.CONDITIONAL_NODE__LOCAL_PRECONDITION);
				return localPrecondition != null
					&& !localPrecondition.isEmpty();
			case UMLPackage.CONDITIONAL_NODE__LOCAL_POSTCONDITION :
				EList localPostcondition = (EList) eVirtualGet(UMLPackage.CONDITIONAL_NODE__LOCAL_POSTCONDITION);
				return localPostcondition != null
					&& !localPostcondition.isEmpty();
			case UMLPackage.CONDITIONAL_NODE__ELEMENT_IMPORT :
				EList elementImport = (EList) eVirtualGet(UMLPackage.CONDITIONAL_NODE__ELEMENT_IMPORT);
				return elementImport != null && !elementImport.isEmpty();
			case UMLPackage.CONDITIONAL_NODE__PACKAGE_IMPORT :
				EList packageImport = (EList) eVirtualGet(UMLPackage.CONDITIONAL_NODE__PACKAGE_IMPORT);
				return packageImport != null && !packageImport.isEmpty();
			case UMLPackage.CONDITIONAL_NODE__OWNED_RULE :
				EList ownedRule = (EList) eVirtualGet(UMLPackage.CONDITIONAL_NODE__OWNED_RULE);
				return ownedRule != null && !ownedRule.isEmpty();
			case UMLPackage.CONDITIONAL_NODE__MEMBER :
				return isSetMembers();
			case UMLPackage.CONDITIONAL_NODE__IMPORTED_MEMBER :
				return !getImportedMembers().isEmpty();
			case UMLPackage.CONDITIONAL_NODE__OWNED_MEMBER :
				return isSetOwnedMembers();
			case UMLPackage.CONDITIONAL_NODE__SUBGROUP :
				return isSetSubgroups();
			case UMLPackage.CONDITIONAL_NODE__SUPER_GROUP :
				return isSetSuperGroup();
			case UMLPackage.CONDITIONAL_NODE__IN_ACTIVITY :
				return isSetInActivity();
			case UMLPackage.CONDITIONAL_NODE__CONTAINED_EDGE :
				return isSetContainedEdges();
			case UMLPackage.CONDITIONAL_NODE__CONTAINED_NODE :
				return isSetContainedNodes();
			case UMLPackage.CONDITIONAL_NODE__VARIABLE :
				EList variable = (EList) eVirtualGet(UMLPackage.CONDITIONAL_NODE__VARIABLE);
				return variable != null && !variable.isEmpty();
			case UMLPackage.CONDITIONAL_NODE__EDGE :
				EList edge = (EList) eVirtualGet(UMLPackage.CONDITIONAL_NODE__EDGE);
				return edge != null && !edge.isEmpty();
			case UMLPackage.CONDITIONAL_NODE__MUST_ISOLATE :
				return ((eFlags & MUST_ISOLATE_EFLAG) != 0) != MUST_ISOLATE_EDEFAULT;
			case UMLPackage.CONDITIONAL_NODE__NODE :
				EList node = (EList) eVirtualGet(UMLPackage.CONDITIONAL_NODE__NODE);
				return node != null && !node.isEmpty();
			case UMLPackage.CONDITIONAL_NODE__IS_DETERMINATE :
				return ((eFlags & IS_DETERMINATE_EFLAG) != 0) != IS_DETERMINATE_EDEFAULT;
			case UMLPackage.CONDITIONAL_NODE__IS_ASSURED :
				return ((eFlags & IS_ASSURED_EFLAG) != 0) != IS_ASSURED_EDEFAULT;
			case UMLPackage.CONDITIONAL_NODE__CLAUSE :
				EList clause = (EList) eVirtualGet(UMLPackage.CONDITIONAL_NODE__CLAUSE);
				return clause != null && !clause.isEmpty();
			case UMLPackage.CONDITIONAL_NODE__RESULT :
				EList result = (EList) eVirtualGet(UMLPackage.CONDITIONAL_NODE__RESULT);
				return result != null && !result.isEmpty();
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
		result.append(" (isDeterminate: "); //$NON-NLS-1$
		result.append((eFlags & IS_DETERMINATE_EFLAG) != 0);
		result.append(", isAssured: "); //$NON-NLS-1$
		result.append((eFlags & IS_ASSURED_EFLAG) != 0);
		result.append(')');
		return result.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOwnedElements() {
		return super.isSetOwnedElements()
			|| eIsSet(UMLPackage.CONDITIONAL_NODE__CLAUSE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOutputs() {
		return super.isSetOutputs()
			|| eIsSet(UMLPackage.CONDITIONAL_NODE__RESULT);
	}

} //ConditionalNodeImpl
