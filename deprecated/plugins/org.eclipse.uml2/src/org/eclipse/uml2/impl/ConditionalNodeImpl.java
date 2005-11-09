/*
 * Copyright (c) 2003, 2005 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *
 * $Id: ConditionalNodeImpl.java,v 1.16 2005/11/09 22:53:09 khussey Exp $
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

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.uml2.Activity;
import org.eclipse.uml2.Clause;
import org.eclipse.uml2.ConditionalNode;
import org.eclipse.uml2.OutputPin;
import org.eclipse.uml2.StringExpression;
import org.eclipse.uml2.StructuredActivityNode;
import org.eclipse.uml2.TemplateSignature;
import org.eclipse.uml2.UML2Factory;
import org.eclipse.uml2.UML2Package;
import org.eclipse.uml2.VisibilityKind;

import org.eclipse.uml2.common.util.DerivedUnionEObjectEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Conditional Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2.impl.ConditionalNodeImpl#getOutputs <em>Output</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.ConditionalNodeImpl#isDeterminate <em>Is Determinate</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.ConditionalNodeImpl#isAssured <em>Is Assured</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.ConditionalNodeImpl#getClauses <em>Clause</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.ConditionalNodeImpl#getResults <em>Result</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConditionalNodeImpl extends StructuredActivityNodeImpl implements ConditionalNode {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) IBM Corporation and others."; //$NON-NLS-1$

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
	 * The cached value of the '{@link #getClauses() <em>Clause</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClauses()
	 * @generated
	 * @ordered
	 */
	protected EList clause = null;

	/**
	 * The cached value of the '{@link #getResults() <em>Result</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResults()
	 * @generated
	 * @ordered
	 */
	protected EList result = null;

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
		return UML2Package.eINSTANCE.getConditionalNode();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getOutputs() {
		if (output == null) {
			output = new DerivedUnionEObjectEList(OutputPin.class, this, UML2Package.CONDITIONAL_NODE__OUTPUT, new EStructuralFeature[] {UML2Package.eINSTANCE.getConditionalNode_Result()});
		}
		return output;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOutputs() {
		return super.isSetOutputs()
			|| eIsSet(UML2Package.eINSTANCE.getConditionalNode_Result());
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
		if (newIsDeterminate) eFlags |= IS_DETERMINATE_EFLAG; else eFlags &= ~IS_DETERMINATE_EFLAG;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2Package.CONDITIONAL_NODE__IS_DETERMINATE, oldIsDeterminate, newIsDeterminate));

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
		if (newIsAssured) eFlags |= IS_ASSURED_EFLAG; else eFlags &= ~IS_ASSURED_EFLAG;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2Package.CONDITIONAL_NODE__IS_ASSURED, oldIsAssured, newIsAssured));

	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getClauses() {
		if (clause == null) {
			clause = new EObjectContainmentEList(Clause.class, this, UML2Package.CONDITIONAL_NODE__CLAUSE);
		}
		return clause;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 * @deprecated Use #createClause() instead.
	 */
	public Clause createClause(EClass eClass) {
		Clause newClause = (Clause) eClass.getEPackage().getEFactoryInstance().create(eClass);
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, 0, UML2Package.CONDITIONAL_NODE__CLAUSE, null, newClause));
		}
		getClauses().add(newClause);
		return newClause;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Clause createClause() {
		Clause newClause = UML2Factory.eINSTANCE.createClause();
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, 0, UML2Package.CONDITIONAL_NODE__CLAUSE, null, newClause));
		}
		getClauses().add(newClause);
		return newClause;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getResults() {
		if (result == null) {
			result = new EObjectContainmentEList(OutputPin.class, this, UML2Package.CONDITIONAL_NODE__RESULT);
		}
		return result;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
    public OutputPin getResult(String name) {
		for (Iterator i = getResults().iterator(); i.hasNext(); ) {
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
	 * @generated NOT
	 * @deprecated Use #createResult() instead.
	 */
	public OutputPin createResult(EClass eClass) {
		OutputPin newResult = (OutputPin) eClass.getEPackage().getEFactoryInstance().create(eClass);
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, 0, UML2Package.CONDITIONAL_NODE__RESULT, null, newResult));
		}
		getResults().add(newResult);
		return newResult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutputPin createResult() {
		OutputPin newResult = UML2Factory.eINSTANCE.createOutputPin();
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, 0, UML2Package.CONDITIONAL_NODE__RESULT, null, newResult));
		}
		getResults().add(newResult);
		return newResult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, Class baseClass, NotificationChain msgs) {
		if (featureID >= 0) {
			switch (eDerivedStructuralFeatureID(featureID, baseClass)) {
				case UML2Package.CONDITIONAL_NODE__EANNOTATIONS:
					return ((InternalEList)getEAnnotations()).basicRemove(otherEnd, msgs);
				case UML2Package.CONDITIONAL_NODE__OWNED_COMMENT:
					return ((InternalEList)getOwnedComments()).basicRemove(otherEnd, msgs);
				case UML2Package.CONDITIONAL_NODE__TEMPLATE_BINDING:
					return ((InternalEList)getTemplateBindings()).basicRemove(otherEnd, msgs);
				case UML2Package.CONDITIONAL_NODE__OWNED_TEMPLATE_SIGNATURE:
					return basicSetOwnedTemplateSignature(null, msgs);
				case UML2Package.CONDITIONAL_NODE__CLIENT_DEPENDENCY:
					return ((InternalEList)getClientDependencies()).basicRemove(otherEnd, msgs);
				case UML2Package.CONDITIONAL_NODE__NAME_EXPRESSION:
					return basicSetNameExpression(null, msgs);
				case UML2Package.CONDITIONAL_NODE__OUTGOING:
					return ((InternalEList)getOutgoings()).basicRemove(otherEnd, msgs);
				case UML2Package.CONDITIONAL_NODE__INCOMING:
					return ((InternalEList)getIncomings()).basicRemove(otherEnd, msgs);
				case UML2Package.CONDITIONAL_NODE__ACTIVITY:
					return eBasicSetContainer(null, UML2Package.CONDITIONAL_NODE__ACTIVITY, msgs);
				case UML2Package.CONDITIONAL_NODE__IN_STRUCTURED_NODE:
					return eBasicSetContainer(null, UML2Package.CONDITIONAL_NODE__IN_STRUCTURED_NODE, msgs);
				case UML2Package.CONDITIONAL_NODE__IN_PARTITION:
					return ((InternalEList)getInPartitions()).basicRemove(otherEnd, msgs);
				case UML2Package.CONDITIONAL_NODE__IN_INTERRUPTIBLE_REGION:
					return ((InternalEList)getInInterruptibleRegions()).basicRemove(otherEnd, msgs);
				case UML2Package.CONDITIONAL_NODE__HANDLER:
					return ((InternalEList)getHandlers()).basicRemove(otherEnd, msgs);
				case UML2Package.CONDITIONAL_NODE__LOCAL_PRECONDITION:
					return ((InternalEList)getLocalPreconditions()).basicRemove(otherEnd, msgs);
				case UML2Package.CONDITIONAL_NODE__LOCAL_POSTCONDITION:
					return ((InternalEList)getLocalPostconditions()).basicRemove(otherEnd, msgs);
				case UML2Package.CONDITIONAL_NODE__OWNED_RULE:
					return ((InternalEList)getOwnedRules()).basicRemove(otherEnd, msgs);
				case UML2Package.CONDITIONAL_NODE__ELEMENT_IMPORT:
					return ((InternalEList)getElementImports()).basicRemove(otherEnd, msgs);
				case UML2Package.CONDITIONAL_NODE__PACKAGE_IMPORT:
					return ((InternalEList)getPackageImports()).basicRemove(otherEnd, msgs);
				case UML2Package.CONDITIONAL_NODE__ACTIVITY_GROUP_ACTIVITY:
					return eBasicSetContainer(null, UML2Package.CONDITIONAL_NODE__ACTIVITY_GROUP_ACTIVITY, msgs);
				case UML2Package.CONDITIONAL_NODE__VARIABLE:
					return ((InternalEList)getVariables()).basicRemove(otherEnd, msgs);
				case UML2Package.CONDITIONAL_NODE__CONTAINED_NODE:
					return ((InternalEList)getContainedNodes()).basicRemove(otherEnd, msgs);
				case UML2Package.CONDITIONAL_NODE__CONTAINED_EDGE:
					return ((InternalEList)getContainedEdges()).basicRemove(otherEnd, msgs);
				case UML2Package.CONDITIONAL_NODE__CLAUSE:
					return ((InternalEList)getClauses()).basicRemove(otherEnd, msgs);
				case UML2Package.CONDITIONAL_NODE__RESULT:
					return ((InternalEList)getResults()).basicRemove(otherEnd, msgs);
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
	public Object eGet(EStructuralFeature eFeature, boolean resolve) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case UML2Package.CONDITIONAL_NODE__EANNOTATIONS:
				return getEAnnotations();
			case UML2Package.CONDITIONAL_NODE__OWNED_ELEMENT:
				return getOwnedElements();
			case UML2Package.CONDITIONAL_NODE__OWNER:
				if (resolve) return getOwner();
				return basicGetOwner();
			case UML2Package.CONDITIONAL_NODE__OWNED_COMMENT:
				return getOwnedComments();
			case UML2Package.CONDITIONAL_NODE__TEMPLATE_BINDING:
				return getTemplateBindings();
			case UML2Package.CONDITIONAL_NODE__OWNED_TEMPLATE_SIGNATURE:
				return getOwnedTemplateSignature();
			case UML2Package.CONDITIONAL_NODE__NAME:
				return getName();
			case UML2Package.CONDITIONAL_NODE__QUALIFIED_NAME:
				return getQualifiedName();
			case UML2Package.CONDITIONAL_NODE__VISIBILITY:
				return getVisibility();
			case UML2Package.CONDITIONAL_NODE__CLIENT_DEPENDENCY:
				return getClientDependencies();
			case UML2Package.CONDITIONAL_NODE__NAME_EXPRESSION:
				return getNameExpression();
			case UML2Package.CONDITIONAL_NODE__REDEFINITION_CONTEXT:
				return getRedefinitionContexts();
			case UML2Package.CONDITIONAL_NODE__IS_LEAF:
				return isLeaf() ? Boolean.TRUE : Boolean.FALSE;
			case UML2Package.CONDITIONAL_NODE__OUTGOING:
				return getOutgoings();
			case UML2Package.CONDITIONAL_NODE__INCOMING:
				return getIncomings();
			case UML2Package.CONDITIONAL_NODE__IN_GROUP:
				return getInGroups();
			case UML2Package.CONDITIONAL_NODE__ACTIVITY:
				return getActivity();
			case UML2Package.CONDITIONAL_NODE__REDEFINED_ELEMENT:
				return getRedefinedElements();
			case UML2Package.CONDITIONAL_NODE__IN_STRUCTURED_NODE:
				return getInStructuredNode();
			case UML2Package.CONDITIONAL_NODE__IN_PARTITION:
				return getInPartitions();
			case UML2Package.CONDITIONAL_NODE__IN_INTERRUPTIBLE_REGION:
				return getInInterruptibleRegions();
			case UML2Package.CONDITIONAL_NODE__HANDLER:
				return getHandlers();
			case UML2Package.CONDITIONAL_NODE__EFFECT:
				return getEffect();
			case UML2Package.CONDITIONAL_NODE__OUTPUT:
				return getOutputs();
			case UML2Package.CONDITIONAL_NODE__INPUT:
				return getInputs();
			case UML2Package.CONDITIONAL_NODE__CONTEXT:
				return getContext();
			case UML2Package.CONDITIONAL_NODE__LOCAL_PRECONDITION:
				return getLocalPreconditions();
			case UML2Package.CONDITIONAL_NODE__LOCAL_POSTCONDITION:
				return getLocalPostconditions();
			case UML2Package.CONDITIONAL_NODE__MEMBER:
				return getMembers();
			case UML2Package.CONDITIONAL_NODE__OWNED_RULE:
				return getOwnedRules();
			case UML2Package.CONDITIONAL_NODE__IMPORTED_MEMBER:
				return getImportedMembers();
			case UML2Package.CONDITIONAL_NODE__ELEMENT_IMPORT:
				return getElementImports();
			case UML2Package.CONDITIONAL_NODE__PACKAGE_IMPORT:
				return getPackageImports();
			case UML2Package.CONDITIONAL_NODE__SUPER_GROUP:
				if (resolve) return getSuperGroup();
				return basicGetSuperGroup();
			case UML2Package.CONDITIONAL_NODE__ACTIVITY_GROUP_ACTIVITY:
				return getActivityGroup_activity();
			case UML2Package.CONDITIONAL_NODE__VARIABLE:
				return getVariables();
			case UML2Package.CONDITIONAL_NODE__CONTAINED_NODE:
				return getContainedNodes();
			case UML2Package.CONDITIONAL_NODE__CONTAINED_EDGE:
				return getContainedEdges();
			case UML2Package.CONDITIONAL_NODE__MUST_ISOLATE:
				return isMustIsolate() ? Boolean.TRUE : Boolean.FALSE;
			case UML2Package.CONDITIONAL_NODE__IS_DETERMINATE:
				return isDeterminate() ? Boolean.TRUE : Boolean.FALSE;
			case UML2Package.CONDITIONAL_NODE__IS_ASSURED:
				return isAssured() ? Boolean.TRUE : Boolean.FALSE;
			case UML2Package.CONDITIONAL_NODE__CLAUSE:
				return getClauses();
			case UML2Package.CONDITIONAL_NODE__RESULT:
				return getResults();
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
			case UML2Package.CONDITIONAL_NODE__EANNOTATIONS:
				getEAnnotations().clear();
				getEAnnotations().addAll((Collection)newValue);
				return;
			case UML2Package.CONDITIONAL_NODE__OWNED_COMMENT:
				getOwnedComments().clear();
				getOwnedComments().addAll((Collection)newValue);
				return;
			case UML2Package.CONDITIONAL_NODE__TEMPLATE_BINDING:
				getTemplateBindings().clear();
				getTemplateBindings().addAll((Collection)newValue);
				return;
			case UML2Package.CONDITIONAL_NODE__OWNED_TEMPLATE_SIGNATURE:
				setOwnedTemplateSignature((TemplateSignature)newValue);
				return;
			case UML2Package.CONDITIONAL_NODE__NAME:
				setName((String)newValue);
				return;
			case UML2Package.CONDITIONAL_NODE__VISIBILITY:
				setVisibility((VisibilityKind)newValue);
				return;
			case UML2Package.CONDITIONAL_NODE__CLIENT_DEPENDENCY:
				getClientDependencies().clear();
				getClientDependencies().addAll((Collection)newValue);
				return;
			case UML2Package.CONDITIONAL_NODE__NAME_EXPRESSION:
				setNameExpression((StringExpression)newValue);
				return;
			case UML2Package.CONDITIONAL_NODE__IS_LEAF:
				setIsLeaf(((Boolean)newValue).booleanValue());
				return;
			case UML2Package.CONDITIONAL_NODE__OUTGOING:
				getOutgoings().clear();
				getOutgoings().addAll((Collection)newValue);
				return;
			case UML2Package.CONDITIONAL_NODE__INCOMING:
				getIncomings().clear();
				getIncomings().addAll((Collection)newValue);
				return;
			case UML2Package.CONDITIONAL_NODE__ACTIVITY:
				setActivity((Activity)newValue);
				return;
			case UML2Package.CONDITIONAL_NODE__REDEFINED_ELEMENT:
				getRedefinedElements().clear();
				getRedefinedElements().addAll((Collection)newValue);
				return;
			case UML2Package.CONDITIONAL_NODE__IN_STRUCTURED_NODE:
				setInStructuredNode((StructuredActivityNode)newValue);
				return;
			case UML2Package.CONDITIONAL_NODE__IN_PARTITION:
				getInPartitions().clear();
				getInPartitions().addAll((Collection)newValue);
				return;
			case UML2Package.CONDITIONAL_NODE__IN_INTERRUPTIBLE_REGION:
				getInInterruptibleRegions().clear();
				getInInterruptibleRegions().addAll((Collection)newValue);
				return;
			case UML2Package.CONDITIONAL_NODE__HANDLER:
				getHandlers().clear();
				getHandlers().addAll((Collection)newValue);
				return;
			case UML2Package.CONDITIONAL_NODE__EFFECT:
				setEffect((String)newValue);
				return;
			case UML2Package.CONDITIONAL_NODE__LOCAL_PRECONDITION:
				getLocalPreconditions().clear();
				getLocalPreconditions().addAll((Collection)newValue);
				return;
			case UML2Package.CONDITIONAL_NODE__LOCAL_POSTCONDITION:
				getLocalPostconditions().clear();
				getLocalPostconditions().addAll((Collection)newValue);
				return;
			case UML2Package.CONDITIONAL_NODE__OWNED_RULE:
				getOwnedRules().clear();
				getOwnedRules().addAll((Collection)newValue);
				return;
			case UML2Package.CONDITIONAL_NODE__ELEMENT_IMPORT:
				getElementImports().clear();
				getElementImports().addAll((Collection)newValue);
				return;
			case UML2Package.CONDITIONAL_NODE__PACKAGE_IMPORT:
				getPackageImports().clear();
				getPackageImports().addAll((Collection)newValue);
				return;
			case UML2Package.CONDITIONAL_NODE__ACTIVITY_GROUP_ACTIVITY:
				setActivityGroup_activity((Activity)newValue);
				return;
			case UML2Package.CONDITIONAL_NODE__VARIABLE:
				getVariables().clear();
				getVariables().addAll((Collection)newValue);
				return;
			case UML2Package.CONDITIONAL_NODE__CONTAINED_NODE:
				getContainedNodes().clear();
				getContainedNodes().addAll((Collection)newValue);
				return;
			case UML2Package.CONDITIONAL_NODE__CONTAINED_EDGE:
				getContainedEdges().clear();
				getContainedEdges().addAll((Collection)newValue);
				return;
			case UML2Package.CONDITIONAL_NODE__MUST_ISOLATE:
				setMustIsolate(((Boolean)newValue).booleanValue());
				return;
			case UML2Package.CONDITIONAL_NODE__IS_DETERMINATE:
				setIsDeterminate(((Boolean)newValue).booleanValue());
				return;
			case UML2Package.CONDITIONAL_NODE__IS_ASSURED:
				setIsAssured(((Boolean)newValue).booleanValue());
				return;
			case UML2Package.CONDITIONAL_NODE__CLAUSE:
				getClauses().clear();
				getClauses().addAll((Collection)newValue);
				return;
			case UML2Package.CONDITIONAL_NODE__RESULT:
				getResults().clear();
				getResults().addAll((Collection)newValue);
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
			case UML2Package.CONDITIONAL_NODE__EANNOTATIONS:
				getEAnnotations().clear();
				return;
			case UML2Package.CONDITIONAL_NODE__OWNED_COMMENT:
				getOwnedComments().clear();
				return;
			case UML2Package.CONDITIONAL_NODE__TEMPLATE_BINDING:
				getTemplateBindings().clear();
				return;
			case UML2Package.CONDITIONAL_NODE__OWNED_TEMPLATE_SIGNATURE:
				setOwnedTemplateSignature((TemplateSignature)null);
				return;
			case UML2Package.CONDITIONAL_NODE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case UML2Package.CONDITIONAL_NODE__VISIBILITY:
				setVisibility(VISIBILITY_EDEFAULT);
				return;
			case UML2Package.CONDITIONAL_NODE__CLIENT_DEPENDENCY:
				getClientDependencies().clear();
				return;
			case UML2Package.CONDITIONAL_NODE__NAME_EXPRESSION:
				setNameExpression((StringExpression)null);
				return;
			case UML2Package.CONDITIONAL_NODE__IS_LEAF:
				setIsLeaf(IS_LEAF_EDEFAULT);
				return;
			case UML2Package.CONDITIONAL_NODE__OUTGOING:
				getOutgoings().clear();
				return;
			case UML2Package.CONDITIONAL_NODE__INCOMING:
				getIncomings().clear();
				return;
			case UML2Package.CONDITIONAL_NODE__ACTIVITY:
				setActivity((Activity)null);
				return;
			case UML2Package.CONDITIONAL_NODE__REDEFINED_ELEMENT:
				getRedefinedElements().clear();
				return;
			case UML2Package.CONDITIONAL_NODE__IN_STRUCTURED_NODE:
				setInStructuredNode((StructuredActivityNode)null);
				return;
			case UML2Package.CONDITIONAL_NODE__IN_PARTITION:
				getInPartitions().clear();
				return;
			case UML2Package.CONDITIONAL_NODE__IN_INTERRUPTIBLE_REGION:
				getInInterruptibleRegions().clear();
				return;
			case UML2Package.CONDITIONAL_NODE__HANDLER:
				getHandlers().clear();
				return;
			case UML2Package.CONDITIONAL_NODE__EFFECT:
				setEffect(EFFECT_EDEFAULT);
				return;
			case UML2Package.CONDITIONAL_NODE__LOCAL_PRECONDITION:
				getLocalPreconditions().clear();
				return;
			case UML2Package.CONDITIONAL_NODE__LOCAL_POSTCONDITION:
				getLocalPostconditions().clear();
				return;
			case UML2Package.CONDITIONAL_NODE__OWNED_RULE:
				getOwnedRules().clear();
				return;
			case UML2Package.CONDITIONAL_NODE__ELEMENT_IMPORT:
				getElementImports().clear();
				return;
			case UML2Package.CONDITIONAL_NODE__PACKAGE_IMPORT:
				getPackageImports().clear();
				return;
			case UML2Package.CONDITIONAL_NODE__ACTIVITY_GROUP_ACTIVITY:
				setActivityGroup_activity((Activity)null);
				return;
			case UML2Package.CONDITIONAL_NODE__VARIABLE:
				getVariables().clear();
				return;
			case UML2Package.CONDITIONAL_NODE__CONTAINED_NODE:
				getContainedNodes().clear();
				return;
			case UML2Package.CONDITIONAL_NODE__CONTAINED_EDGE:
				getContainedEdges().clear();
				return;
			case UML2Package.CONDITIONAL_NODE__MUST_ISOLATE:
				setMustIsolate(MUST_ISOLATE_EDEFAULT);
				return;
			case UML2Package.CONDITIONAL_NODE__IS_DETERMINATE:
				setIsDeterminate(IS_DETERMINATE_EDEFAULT);
				return;
			case UML2Package.CONDITIONAL_NODE__IS_ASSURED:
				setIsAssured(IS_ASSURED_EDEFAULT);
				return;
			case UML2Package.CONDITIONAL_NODE__CLAUSE:
				getClauses().clear();
				return;
			case UML2Package.CONDITIONAL_NODE__RESULT:
				getResults().clear();
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
			case UML2Package.CONDITIONAL_NODE__EANNOTATIONS:
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UML2Package.CONDITIONAL_NODE__OWNED_ELEMENT:
				return isSetOwnedElements();
			case UML2Package.CONDITIONAL_NODE__OWNER:
				return isSetOwner();
			case UML2Package.CONDITIONAL_NODE__OWNED_COMMENT:
				return ownedComment != null && !ownedComment.isEmpty();
			case UML2Package.CONDITIONAL_NODE__TEMPLATE_BINDING:
				return templateBinding != null && !templateBinding.isEmpty();
			case UML2Package.CONDITIONAL_NODE__OWNED_TEMPLATE_SIGNATURE:
				return ownedTemplateSignature != null;
			case UML2Package.CONDITIONAL_NODE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case UML2Package.CONDITIONAL_NODE__QUALIFIED_NAME:
				return QUALIFIED_NAME_EDEFAULT == null ? getQualifiedName() != null : !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case UML2Package.CONDITIONAL_NODE__VISIBILITY:
				return visibility != VISIBILITY_EDEFAULT;
			case UML2Package.CONDITIONAL_NODE__CLIENT_DEPENDENCY:
				return clientDependency != null && !clientDependency.isEmpty();
			case UML2Package.CONDITIONAL_NODE__NAME_EXPRESSION:
				return nameExpression != null;
			case UML2Package.CONDITIONAL_NODE__REDEFINITION_CONTEXT:
				return isSetRedefinitionContexts();
			case UML2Package.CONDITIONAL_NODE__IS_LEAF:
				return ((eFlags & IS_LEAF_EFLAG) != 0) != IS_LEAF_EDEFAULT;
			case UML2Package.CONDITIONAL_NODE__OUTGOING:
				return outgoing != null && !outgoing.isEmpty();
			case UML2Package.CONDITIONAL_NODE__INCOMING:
				return incoming != null && !incoming.isEmpty();
			case UML2Package.CONDITIONAL_NODE__IN_GROUP:
				return isSetInGroups();
			case UML2Package.CONDITIONAL_NODE__ACTIVITY:
				return isSetActivity();
			case UML2Package.CONDITIONAL_NODE__REDEFINED_ELEMENT:
				return isSetRedefinedElements();
			case UML2Package.CONDITIONAL_NODE__IN_STRUCTURED_NODE:
				return getInStructuredNode() != null;
			case UML2Package.CONDITIONAL_NODE__IN_PARTITION:
				return inPartition != null && !inPartition.isEmpty();
			case UML2Package.CONDITIONAL_NODE__IN_INTERRUPTIBLE_REGION:
				return inInterruptibleRegion != null && !inInterruptibleRegion.isEmpty();
			case UML2Package.CONDITIONAL_NODE__HANDLER:
				return handler != null && !handler.isEmpty();
			case UML2Package.CONDITIONAL_NODE__EFFECT:
				return EFFECT_EDEFAULT == null ? effect != null : !EFFECT_EDEFAULT.equals(effect);
			case UML2Package.CONDITIONAL_NODE__OUTPUT:
				return isSetOutputs();
			case UML2Package.CONDITIONAL_NODE__INPUT:
				return isSetInputs();
			case UML2Package.CONDITIONAL_NODE__CONTEXT:
				return getContext() != null;
			case UML2Package.CONDITIONAL_NODE__LOCAL_PRECONDITION:
				return localPrecondition != null && !localPrecondition.isEmpty();
			case UML2Package.CONDITIONAL_NODE__LOCAL_POSTCONDITION:
				return localPostcondition != null && !localPostcondition.isEmpty();
			case UML2Package.CONDITIONAL_NODE__MEMBER:
				return isSetMembers();
			case UML2Package.CONDITIONAL_NODE__OWNED_RULE:
				return ownedRule != null && !ownedRule.isEmpty();
			case UML2Package.CONDITIONAL_NODE__IMPORTED_MEMBER:
				return !getImportedMembers().isEmpty();
			case UML2Package.CONDITIONAL_NODE__ELEMENT_IMPORT:
				return elementImport != null && !elementImport.isEmpty();
			case UML2Package.CONDITIONAL_NODE__PACKAGE_IMPORT:
				return packageImport != null && !packageImport.isEmpty();
			case UML2Package.CONDITIONAL_NODE__SUPER_GROUP:
				return isSetSuperGroup();
			case UML2Package.CONDITIONAL_NODE__ACTIVITY_GROUP_ACTIVITY:
				return isSetActivityGroup_activity();
			case UML2Package.CONDITIONAL_NODE__VARIABLE:
				return variable != null && !variable.isEmpty();
			case UML2Package.CONDITIONAL_NODE__CONTAINED_NODE:
				return isSetContainedNodes();
			case UML2Package.CONDITIONAL_NODE__CONTAINED_EDGE:
				return isSetContainedEdges();
			case UML2Package.CONDITIONAL_NODE__MUST_ISOLATE:
				return ((eFlags & MUST_ISOLATE_EFLAG) != 0) != MUST_ISOLATE_EDEFAULT;
			case UML2Package.CONDITIONAL_NODE__IS_DETERMINATE:
				return ((eFlags & IS_DETERMINATE_EFLAG) != 0) != IS_DETERMINATE_EDEFAULT;
			case UML2Package.CONDITIONAL_NODE__IS_ASSURED:
				return ((eFlags & IS_ASSURED_EFLAG) != 0) != IS_ASSURED_EDEFAULT;
			case UML2Package.CONDITIONAL_NODE__CLAUSE:
				return clause != null && !clause.isEmpty();
			case UML2Package.CONDITIONAL_NODE__RESULT:
				return result != null && !result.isEmpty();
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
	protected EList getOwnedElementsHelper(EList ownedElement) {
		super.getOwnedElementsHelper(ownedElement);
		if (eIsSet(UML2Package.eINSTANCE.getConditionalNode_Clause())) {
			ownedElement.addAll(getClauses());
		}
		return ownedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOwnedElements() {
		return super.isSetOwnedElements()
			|| eIsSet(UML2Package.eINSTANCE.getConditionalNode_Clause());
	}


} //ConditionalNodeImpl
