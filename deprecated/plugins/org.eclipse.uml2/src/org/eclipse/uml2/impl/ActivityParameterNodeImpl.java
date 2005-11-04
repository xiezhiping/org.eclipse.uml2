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
 * $Id: ActivityParameterNodeImpl.java,v 1.10 2005/11/04 22:23:00 khussey Exp $
 */
package org.eclipse.uml2.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.uml2.Activity;
import org.eclipse.uml2.ActivityParameterNode;
import org.eclipse.uml2.Behavior;
import org.eclipse.uml2.ObjectNodeOrderingKind;
import org.eclipse.uml2.Parameter;
import org.eclipse.uml2.StringExpression;
import org.eclipse.uml2.StructuredActivityNode;
import org.eclipse.uml2.TemplateSignature;
import org.eclipse.uml2.Type;
import org.eclipse.uml2.UML2Package;
import org.eclipse.uml2.ValueSpecification;
import org.eclipse.uml2.VisibilityKind;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Activity Parameter Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2.impl.ActivityParameterNodeImpl#getParameter <em>Parameter</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ActivityParameterNodeImpl extends ObjectNodeImpl implements ActivityParameterNode {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) IBM Corporation and others."; //$NON-NLS-1$

	/**
	 * The cached value of the '{@link #getParameter() <em>Parameter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameter()
	 * @generated
	 * @ordered
	 */
	protected Parameter parameter = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActivityParameterNodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return UML2Package.eINSTANCE.getActivityParameterNode();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parameter getParameter() {
		if (parameter != null && parameter.eIsProxy()) {
			Parameter oldParameter = parameter;
			parameter = (Parameter)eResolveProxy((InternalEObject)parameter);
			if (parameter != oldParameter) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UML2Package.ACTIVITY_PARAMETER_NODE__PARAMETER, oldParameter, parameter));
			}
		}
		return parameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parameter basicGetParameter() {
		return parameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParameter(Parameter newParameter) {
		Parameter oldParameter = parameter;
		parameter = newParameter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2Package.ACTIVITY_PARAMETER_NODE__PARAMETER, oldParameter, parameter));

	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(EStructuralFeature eFeature, boolean resolve) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case UML2Package.ACTIVITY_PARAMETER_NODE__EANNOTATIONS:
				return getEAnnotations();
			case UML2Package.ACTIVITY_PARAMETER_NODE__OWNED_ELEMENT:
				return getOwnedElements();
			case UML2Package.ACTIVITY_PARAMETER_NODE__OWNER:
				if (resolve) return getOwner();
				return basicGetOwner();
			case UML2Package.ACTIVITY_PARAMETER_NODE__OWNED_COMMENT:
				return getOwnedComments();
			case UML2Package.ACTIVITY_PARAMETER_NODE__TEMPLATE_BINDING:
				return getTemplateBindings();
			case UML2Package.ACTIVITY_PARAMETER_NODE__OWNED_TEMPLATE_SIGNATURE:
				return getOwnedTemplateSignature();
			case UML2Package.ACTIVITY_PARAMETER_NODE__NAME:
				return getName();
			case UML2Package.ACTIVITY_PARAMETER_NODE__QUALIFIED_NAME:
				return getQualifiedName();
			case UML2Package.ACTIVITY_PARAMETER_NODE__VISIBILITY:
				return getVisibility();
			case UML2Package.ACTIVITY_PARAMETER_NODE__CLIENT_DEPENDENCY:
				return getClientDependencies();
			case UML2Package.ACTIVITY_PARAMETER_NODE__NAME_EXPRESSION:
				return getNameExpression();
			case UML2Package.ACTIVITY_PARAMETER_NODE__REDEFINITION_CONTEXT:
				return getRedefinitionContexts();
			case UML2Package.ACTIVITY_PARAMETER_NODE__IS_LEAF:
				return isLeaf() ? Boolean.TRUE : Boolean.FALSE;
			case UML2Package.ACTIVITY_PARAMETER_NODE__OUTGOING:
				return getOutgoings();
			case UML2Package.ACTIVITY_PARAMETER_NODE__INCOMING:
				return getIncomings();
			case UML2Package.ACTIVITY_PARAMETER_NODE__IN_GROUP:
				return getInGroups();
			case UML2Package.ACTIVITY_PARAMETER_NODE__ACTIVITY:
				return getActivity();
			case UML2Package.ACTIVITY_PARAMETER_NODE__REDEFINED_ELEMENT:
				return getRedefinedElements();
			case UML2Package.ACTIVITY_PARAMETER_NODE__IN_STRUCTURED_NODE:
				return getInStructuredNode();
			case UML2Package.ACTIVITY_PARAMETER_NODE__IN_PARTITION:
				return getInPartitions();
			case UML2Package.ACTIVITY_PARAMETER_NODE__IN_INTERRUPTIBLE_REGION:
				return getInInterruptibleRegions();
			case UML2Package.ACTIVITY_PARAMETER_NODE__TYPE:
				if (resolve) return getType();
				return basicGetType();
			case UML2Package.ACTIVITY_PARAMETER_NODE__ORDERING:
				return getOrdering();
			case UML2Package.ACTIVITY_PARAMETER_NODE__UPPER_BOUND:
				return getUpperBound();
			case UML2Package.ACTIVITY_PARAMETER_NODE__IN_STATE:
				return getInStates();
			case UML2Package.ACTIVITY_PARAMETER_NODE__SELECTION:
				if (resolve) return getSelection();
				return basicGetSelection();
			case UML2Package.ACTIVITY_PARAMETER_NODE__PARAMETER:
				if (resolve) return getParameter();
				return basicGetParameter();
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
			case UML2Package.ACTIVITY_PARAMETER_NODE__EANNOTATIONS:
				getEAnnotations().clear();
				getEAnnotations().addAll((Collection)newValue);
				return;
			case UML2Package.ACTIVITY_PARAMETER_NODE__OWNED_COMMENT:
				getOwnedComments().clear();
				getOwnedComments().addAll((Collection)newValue);
				return;
			case UML2Package.ACTIVITY_PARAMETER_NODE__TEMPLATE_BINDING:
				getTemplateBindings().clear();
				getTemplateBindings().addAll((Collection)newValue);
				return;
			case UML2Package.ACTIVITY_PARAMETER_NODE__OWNED_TEMPLATE_SIGNATURE:
				setOwnedTemplateSignature((TemplateSignature)newValue);
				return;
			case UML2Package.ACTIVITY_PARAMETER_NODE__NAME:
				setName((String)newValue);
				return;
			case UML2Package.ACTIVITY_PARAMETER_NODE__VISIBILITY:
				setVisibility((VisibilityKind)newValue);
				return;
			case UML2Package.ACTIVITY_PARAMETER_NODE__CLIENT_DEPENDENCY:
				getClientDependencies().clear();
				getClientDependencies().addAll((Collection)newValue);
				return;
			case UML2Package.ACTIVITY_PARAMETER_NODE__NAME_EXPRESSION:
				setNameExpression((StringExpression)newValue);
				return;
			case UML2Package.ACTIVITY_PARAMETER_NODE__IS_LEAF:
				setIsLeaf(((Boolean)newValue).booleanValue());
				return;
			case UML2Package.ACTIVITY_PARAMETER_NODE__OUTGOING:
				getOutgoings().clear();
				getOutgoings().addAll((Collection)newValue);
				return;
			case UML2Package.ACTIVITY_PARAMETER_NODE__INCOMING:
				getIncomings().clear();
				getIncomings().addAll((Collection)newValue);
				return;
			case UML2Package.ACTIVITY_PARAMETER_NODE__ACTIVITY:
				setActivity((Activity)newValue);
				return;
			case UML2Package.ACTIVITY_PARAMETER_NODE__REDEFINED_ELEMENT:
				getRedefinedElements().clear();
				getRedefinedElements().addAll((Collection)newValue);
				return;
			case UML2Package.ACTIVITY_PARAMETER_NODE__IN_STRUCTURED_NODE:
				setInStructuredNode((StructuredActivityNode)newValue);
				return;
			case UML2Package.ACTIVITY_PARAMETER_NODE__IN_PARTITION:
				getInPartitions().clear();
				getInPartitions().addAll((Collection)newValue);
				return;
			case UML2Package.ACTIVITY_PARAMETER_NODE__IN_INTERRUPTIBLE_REGION:
				getInInterruptibleRegions().clear();
				getInInterruptibleRegions().addAll((Collection)newValue);
				return;
			case UML2Package.ACTIVITY_PARAMETER_NODE__TYPE:
				setType((Type)newValue);
				return;
			case UML2Package.ACTIVITY_PARAMETER_NODE__ORDERING:
				setOrdering((ObjectNodeOrderingKind)newValue);
				return;
			case UML2Package.ACTIVITY_PARAMETER_NODE__UPPER_BOUND:
				setUpperBound((ValueSpecification)newValue);
				return;
			case UML2Package.ACTIVITY_PARAMETER_NODE__IN_STATE:
				getInStates().clear();
				getInStates().addAll((Collection)newValue);
				return;
			case UML2Package.ACTIVITY_PARAMETER_NODE__SELECTION:
				setSelection((Behavior)newValue);
				return;
			case UML2Package.ACTIVITY_PARAMETER_NODE__PARAMETER:
				setParameter((Parameter)newValue);
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
			case UML2Package.ACTIVITY_PARAMETER_NODE__EANNOTATIONS:
				getEAnnotations().clear();
				return;
			case UML2Package.ACTIVITY_PARAMETER_NODE__OWNED_COMMENT:
				getOwnedComments().clear();
				return;
			case UML2Package.ACTIVITY_PARAMETER_NODE__TEMPLATE_BINDING:
				getTemplateBindings().clear();
				return;
			case UML2Package.ACTIVITY_PARAMETER_NODE__OWNED_TEMPLATE_SIGNATURE:
				setOwnedTemplateSignature((TemplateSignature)null);
				return;
			case UML2Package.ACTIVITY_PARAMETER_NODE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case UML2Package.ACTIVITY_PARAMETER_NODE__VISIBILITY:
				setVisibility(VISIBILITY_EDEFAULT);
				return;
			case UML2Package.ACTIVITY_PARAMETER_NODE__CLIENT_DEPENDENCY:
				getClientDependencies().clear();
				return;
			case UML2Package.ACTIVITY_PARAMETER_NODE__NAME_EXPRESSION:
				setNameExpression((StringExpression)null);
				return;
			case UML2Package.ACTIVITY_PARAMETER_NODE__IS_LEAF:
				setIsLeaf(IS_LEAF_EDEFAULT);
				return;
			case UML2Package.ACTIVITY_PARAMETER_NODE__OUTGOING:
				getOutgoings().clear();
				return;
			case UML2Package.ACTIVITY_PARAMETER_NODE__INCOMING:
				getIncomings().clear();
				return;
			case UML2Package.ACTIVITY_PARAMETER_NODE__ACTIVITY:
				setActivity((Activity)null);
				return;
			case UML2Package.ACTIVITY_PARAMETER_NODE__REDEFINED_ELEMENT:
				getRedefinedElements().clear();
				return;
			case UML2Package.ACTIVITY_PARAMETER_NODE__IN_STRUCTURED_NODE:
				setInStructuredNode((StructuredActivityNode)null);
				return;
			case UML2Package.ACTIVITY_PARAMETER_NODE__IN_PARTITION:
				getInPartitions().clear();
				return;
			case UML2Package.ACTIVITY_PARAMETER_NODE__IN_INTERRUPTIBLE_REGION:
				getInInterruptibleRegions().clear();
				return;
			case UML2Package.ACTIVITY_PARAMETER_NODE__TYPE:
				setType((Type)null);
				return;
			case UML2Package.ACTIVITY_PARAMETER_NODE__ORDERING:
				setOrdering(ORDERING_EDEFAULT);
				return;
			case UML2Package.ACTIVITY_PARAMETER_NODE__UPPER_BOUND:
				setUpperBound((ValueSpecification)null);
				return;
			case UML2Package.ACTIVITY_PARAMETER_NODE__IN_STATE:
				getInStates().clear();
				return;
			case UML2Package.ACTIVITY_PARAMETER_NODE__SELECTION:
				setSelection((Behavior)null);
				return;
			case UML2Package.ACTIVITY_PARAMETER_NODE__PARAMETER:
				setParameter((Parameter)null);
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
			case UML2Package.ACTIVITY_PARAMETER_NODE__EANNOTATIONS:
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UML2Package.ACTIVITY_PARAMETER_NODE__OWNED_ELEMENT:
				return isSetOwnedElements();
			case UML2Package.ACTIVITY_PARAMETER_NODE__OWNER:
				return isSetOwner();
			case UML2Package.ACTIVITY_PARAMETER_NODE__OWNED_COMMENT:
				return ownedComment != null && !ownedComment.isEmpty();
			case UML2Package.ACTIVITY_PARAMETER_NODE__TEMPLATE_BINDING:
				return templateBinding != null && !templateBinding.isEmpty();
			case UML2Package.ACTIVITY_PARAMETER_NODE__OWNED_TEMPLATE_SIGNATURE:
				return ownedTemplateSignature != null;
			case UML2Package.ACTIVITY_PARAMETER_NODE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case UML2Package.ACTIVITY_PARAMETER_NODE__QUALIFIED_NAME:
				return QUALIFIED_NAME_EDEFAULT == null ? getQualifiedName() != null : !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case UML2Package.ACTIVITY_PARAMETER_NODE__VISIBILITY:
				return visibility != VISIBILITY_EDEFAULT;
			case UML2Package.ACTIVITY_PARAMETER_NODE__CLIENT_DEPENDENCY:
				return clientDependency != null && !clientDependency.isEmpty();
			case UML2Package.ACTIVITY_PARAMETER_NODE__NAME_EXPRESSION:
				return nameExpression != null;
			case UML2Package.ACTIVITY_PARAMETER_NODE__REDEFINITION_CONTEXT:
				return isSetRedefinitionContexts();
			case UML2Package.ACTIVITY_PARAMETER_NODE__IS_LEAF:
				return ((eFlags & IS_LEAF_EFLAG) != 0) != IS_LEAF_EDEFAULT;
			case UML2Package.ACTIVITY_PARAMETER_NODE__OUTGOING:
				return outgoing != null && !outgoing.isEmpty();
			case UML2Package.ACTIVITY_PARAMETER_NODE__INCOMING:
				return incoming != null && !incoming.isEmpty();
			case UML2Package.ACTIVITY_PARAMETER_NODE__IN_GROUP:
				return isSetInGroups();
			case UML2Package.ACTIVITY_PARAMETER_NODE__ACTIVITY:
				return getActivity() != null;
			case UML2Package.ACTIVITY_PARAMETER_NODE__REDEFINED_ELEMENT:
				return isSetRedefinedElements();
			case UML2Package.ACTIVITY_PARAMETER_NODE__IN_STRUCTURED_NODE:
				return getInStructuredNode() != null;
			case UML2Package.ACTIVITY_PARAMETER_NODE__IN_PARTITION:
				return inPartition != null && !inPartition.isEmpty();
			case UML2Package.ACTIVITY_PARAMETER_NODE__IN_INTERRUPTIBLE_REGION:
				return inInterruptibleRegion != null && !inInterruptibleRegion.isEmpty();
			case UML2Package.ACTIVITY_PARAMETER_NODE__TYPE:
				return type != null;
			case UML2Package.ACTIVITY_PARAMETER_NODE__ORDERING:
				return ordering != ORDERING_EDEFAULT;
			case UML2Package.ACTIVITY_PARAMETER_NODE__UPPER_BOUND:
				return upperBound != null;
			case UML2Package.ACTIVITY_PARAMETER_NODE__IN_STATE:
				return inState != null && !inState.isEmpty();
			case UML2Package.ACTIVITY_PARAMETER_NODE__SELECTION:
				return selection != null;
			case UML2Package.ACTIVITY_PARAMETER_NODE__PARAMETER:
				return parameter != null;
		}
		return eDynamicIsSet(eFeature);
	}


} //ActivityParameterNodeImpl
