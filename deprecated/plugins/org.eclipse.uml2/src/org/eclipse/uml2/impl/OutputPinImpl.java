/*
 * Copyright (c) 2003, 2004 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Common Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/cpl-v10.html
 *
 * Contributors:
 *   IBM - Initial API and implementation
 *
 * $Id: OutputPinImpl.java,v 1.4 2004/06/18 04:34:31 khussey Exp $
 */
package org.eclipse.uml2.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.uml2.Activity;
import org.eclipse.uml2.Behavior;
import org.eclipse.uml2.ObjectNodeOrderingKind;
import org.eclipse.uml2.OutputPin;
import org.eclipse.uml2.StringExpression;
import org.eclipse.uml2.StructuredActivityNode;
import org.eclipse.uml2.TemplateSignature;
import org.eclipse.uml2.Type;
import org.eclipse.uml2.UML2Package;
import org.eclipse.uml2.ValueSpecification;
import org.eclipse.uml2.VisibilityKind;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Output Pin</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class OutputPinImpl extends PinImpl implements OutputPin {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2003, 2004 IBM Corporation and others."; //$NON-NLS-1$

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OutputPinImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return UML2Package.eINSTANCE.getOutputPin();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, Class baseClass, NotificationChain msgs) {
		if (featureID >= 0) {
			switch (eDerivedStructuralFeatureID(featureID, baseClass)) {
				case UML2Package.OUTPUT_PIN__EANNOTATIONS:
					return ((InternalEList)getEAnnotations()).basicAdd(otherEnd, msgs);
				case UML2Package.OUTPUT_PIN__TEMPLATE_BINDING:
					return ((InternalEList)getTemplateBindings()).basicAdd(otherEnd, msgs);
				case UML2Package.OUTPUT_PIN__OWNED_TEMPLATE_SIGNATURE:
					if (ownedTemplateSignature != null)
						msgs = ((InternalEObject)ownedTemplateSignature).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UML2Package.OUTPUT_PIN__OWNED_TEMPLATE_SIGNATURE, null, msgs);
					return basicSetOwnedTemplateSignature((TemplateSignature)otherEnd, msgs);
				case UML2Package.OUTPUT_PIN__CLIENT_DEPENDENCY:
					return ((InternalEList)getClientDependencies()).basicAdd(otherEnd, msgs);
				case UML2Package.OUTPUT_PIN__OUTGOING:
					return ((InternalEList)getOutgoings()).basicAdd(otherEnd, msgs);
				case UML2Package.OUTPUT_PIN__INCOMING:
					return ((InternalEList)getIncomings()).basicAdd(otherEnd, msgs);
				case UML2Package.OUTPUT_PIN__ACTIVITY:
					if (eContainer != null)
						msgs = eBasicRemoveFromContainer(msgs);
					return eBasicSetContainer(otherEnd, UML2Package.OUTPUT_PIN__ACTIVITY, msgs);
				case UML2Package.OUTPUT_PIN__IN_STRUCTURED_NODE:
					if (eContainer != null)
						msgs = eBasicRemoveFromContainer(msgs);
					return eBasicSetContainer(otherEnd, UML2Package.OUTPUT_PIN__IN_STRUCTURED_NODE, msgs);
				case UML2Package.OUTPUT_PIN__IN_PARTITION:
					return ((InternalEList)getInPartitions()).basicAdd(otherEnd, msgs);
				case UML2Package.OUTPUT_PIN__IN_INTERRUPTIBLE_REGION:
					return ((InternalEList)getInInterruptibleRegions()).basicAdd(otherEnd, msgs);
				default:
					return eDynamicInverseAdd(otherEnd, featureID, baseClass, msgs);
			}
		}
		if (eContainer != null)
			msgs = eBasicRemoveFromContainer(msgs);
		return eBasicSetContainer(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, Class baseClass, NotificationChain msgs) {
		if (featureID >= 0) {
			switch (eDerivedStructuralFeatureID(featureID, baseClass)) {
				case UML2Package.OUTPUT_PIN__EANNOTATIONS:
					return ((InternalEList)getEAnnotations()).basicRemove(otherEnd, msgs);
				case UML2Package.OUTPUT_PIN__OWNED_COMMENT:
					return ((InternalEList)getOwnedComments()).basicRemove(otherEnd, msgs);
				case UML2Package.OUTPUT_PIN__TEMPLATE_BINDING:
					return ((InternalEList)getTemplateBindings()).basicRemove(otherEnd, msgs);
				case UML2Package.OUTPUT_PIN__OWNED_TEMPLATE_SIGNATURE:
					return basicSetOwnedTemplateSignature(null, msgs);
				case UML2Package.OUTPUT_PIN__CLIENT_DEPENDENCY:
					return ((InternalEList)getClientDependencies()).basicRemove(otherEnd, msgs);
				case UML2Package.OUTPUT_PIN__NAME_EXPRESSION:
					return basicSetNameExpression(null, msgs);
				case UML2Package.OUTPUT_PIN__OUTGOING:
					return ((InternalEList)getOutgoings()).basicRemove(otherEnd, msgs);
				case UML2Package.OUTPUT_PIN__INCOMING:
					return ((InternalEList)getIncomings()).basicRemove(otherEnd, msgs);
				case UML2Package.OUTPUT_PIN__ACTIVITY:
					return eBasicSetContainer(null, UML2Package.OUTPUT_PIN__ACTIVITY, msgs);
				case UML2Package.OUTPUT_PIN__IN_STRUCTURED_NODE:
					return eBasicSetContainer(null, UML2Package.OUTPUT_PIN__IN_STRUCTURED_NODE, msgs);
				case UML2Package.OUTPUT_PIN__IN_PARTITION:
					return ((InternalEList)getInPartitions()).basicRemove(otherEnd, msgs);
				case UML2Package.OUTPUT_PIN__IN_INTERRUPTIBLE_REGION:
					return ((InternalEList)getInInterruptibleRegions()).basicRemove(otherEnd, msgs);
				case UML2Package.OUTPUT_PIN__UPPER_BOUND:
					return basicSetUpperBound(null, msgs);
				case UML2Package.OUTPUT_PIN__UPPER_VALUE:
					return basicSetUpperValue(null, msgs);
				case UML2Package.OUTPUT_PIN__LOWER_VALUE:
					return basicSetLowerValue(null, msgs);
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
	public NotificationChain eBasicRemoveFromContainer(NotificationChain msgs) {
		if (eContainerFeatureID >= 0) {
			switch (eContainerFeatureID) {
				case UML2Package.OUTPUT_PIN__ACTIVITY:
					return eContainer.eInverseRemove(this, UML2Package.ACTIVITY__NODE, Activity.class, msgs);
				case UML2Package.OUTPUT_PIN__IN_STRUCTURED_NODE:
					return eContainer.eInverseRemove(this, UML2Package.STRUCTURED_ACTIVITY_NODE__CONTAINED_NODE, StructuredActivityNode.class, msgs);
				default:
					return eDynamicBasicRemoveFromContainer(msgs);
			}
		}
		return eContainer.eInverseRemove(this, EOPPOSITE_FEATURE_BASE - eContainerFeatureID, null, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(EStructuralFeature eFeature, boolean resolve) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case UML2Package.OUTPUT_PIN__EANNOTATIONS:
				return getEAnnotations();
			case UML2Package.OUTPUT_PIN__OWNED_ELEMENT:
				return getOwnedElements();
			case UML2Package.OUTPUT_PIN__OWNER:
				if (resolve) return getOwner();
				return basicGetOwner();
			case UML2Package.OUTPUT_PIN__OWNED_COMMENT:
				return getOwnedComments();
			case UML2Package.OUTPUT_PIN__TEMPLATE_BINDING:
				return getTemplateBindings();
			case UML2Package.OUTPUT_PIN__OWNED_TEMPLATE_SIGNATURE:
				return getOwnedTemplateSignature();
			case UML2Package.OUTPUT_PIN__NAME:
				return getName();
			case UML2Package.OUTPUT_PIN__QUALIFIED_NAME:
				return getQualifiedName();
			case UML2Package.OUTPUT_PIN__VISIBILITY:
				return getVisibility();
			case UML2Package.OUTPUT_PIN__CLIENT_DEPENDENCY:
				return getClientDependencies();
			case UML2Package.OUTPUT_PIN__NAME_EXPRESSION:
				return getNameExpression();
			case UML2Package.OUTPUT_PIN__REDEFINITION_CONTEXT:
				return getRedefinitionContexts();
			case UML2Package.OUTPUT_PIN__IS_LEAF:
				return isLeaf() ? Boolean.TRUE : Boolean.FALSE;
			case UML2Package.OUTPUT_PIN__OUTGOING:
				return getOutgoings();
			case UML2Package.OUTPUT_PIN__INCOMING:
				return getIncomings();
			case UML2Package.OUTPUT_PIN__IN_GROUP:
				return getInGroups();
			case UML2Package.OUTPUT_PIN__ACTIVITY:
				return getActivity();
			case UML2Package.OUTPUT_PIN__REDEFINED_ELEMENT:
				return getRedefinedElements();
			case UML2Package.OUTPUT_PIN__IN_STRUCTURED_NODE:
				return getInStructuredNode();
			case UML2Package.OUTPUT_PIN__IN_PARTITION:
				return getInPartitions();
			case UML2Package.OUTPUT_PIN__IN_INTERRUPTIBLE_REGION:
				return getInInterruptibleRegions();
			case UML2Package.OUTPUT_PIN__TYPE:
				if (resolve) return getType();
				return basicGetType();
			case UML2Package.OUTPUT_PIN__ORDERING:
				return getOrdering();
			case UML2Package.OUTPUT_PIN__UPPER_BOUND:
				return getUpperBound();
			case UML2Package.OUTPUT_PIN__IN_STATE:
				return getInStates();
			case UML2Package.OUTPUT_PIN__SELECTION:
				if (resolve) return getSelection();
				return basicGetSelection();
			case UML2Package.OUTPUT_PIN__IS_ORDERED:
				return isOrdered() ? Boolean.TRUE : Boolean.FALSE;
			case UML2Package.OUTPUT_PIN__IS_UNIQUE:
				return isUnique() ? Boolean.TRUE : Boolean.FALSE;
			case UML2Package.OUTPUT_PIN__LOWER:
				return new Integer(getLower());
			case UML2Package.OUTPUT_PIN__UPPER:
				return new Integer(getUpper());
			case UML2Package.OUTPUT_PIN__UPPER_VALUE:
				return getUpperValue();
			case UML2Package.OUTPUT_PIN__LOWER_VALUE:
				return getLowerValue();
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
			case UML2Package.OUTPUT_PIN__EANNOTATIONS:
				getEAnnotations().clear();
				getEAnnotations().addAll((Collection)newValue);
				return;
			case UML2Package.OUTPUT_PIN__OWNED_COMMENT:
				getOwnedComments().clear();
				getOwnedComments().addAll((Collection)newValue);
				return;
			case UML2Package.OUTPUT_PIN__TEMPLATE_BINDING:
				getTemplateBindings().clear();
				getTemplateBindings().addAll((Collection)newValue);
				return;
			case UML2Package.OUTPUT_PIN__OWNED_TEMPLATE_SIGNATURE:
				setOwnedTemplateSignature((TemplateSignature)newValue);
				return;
			case UML2Package.OUTPUT_PIN__NAME:
				setName((String)newValue);
				return;
			case UML2Package.OUTPUT_PIN__VISIBILITY:
				setVisibility((VisibilityKind)newValue);
				return;
			case UML2Package.OUTPUT_PIN__CLIENT_DEPENDENCY:
				getClientDependencies().clear();
				getClientDependencies().addAll((Collection)newValue);
				return;
			case UML2Package.OUTPUT_PIN__NAME_EXPRESSION:
				setNameExpression((StringExpression)newValue);
				return;
			case UML2Package.OUTPUT_PIN__IS_LEAF:
				setIsLeaf(((Boolean)newValue).booleanValue());
				return;
			case UML2Package.OUTPUT_PIN__OUTGOING:
				getOutgoings().clear();
				getOutgoings().addAll((Collection)newValue);
				return;
			case UML2Package.OUTPUT_PIN__INCOMING:
				getIncomings().clear();
				getIncomings().addAll((Collection)newValue);
				return;
			case UML2Package.OUTPUT_PIN__ACTIVITY:
				setActivity((Activity)newValue);
				return;
			case UML2Package.OUTPUT_PIN__REDEFINED_ELEMENT:
				getRedefinedElements().clear();
				getRedefinedElements().addAll((Collection)newValue);
				return;
			case UML2Package.OUTPUT_PIN__IN_STRUCTURED_NODE:
				setInStructuredNode((StructuredActivityNode)newValue);
				return;
			case UML2Package.OUTPUT_PIN__IN_PARTITION:
				getInPartitions().clear();
				getInPartitions().addAll((Collection)newValue);
				return;
			case UML2Package.OUTPUT_PIN__IN_INTERRUPTIBLE_REGION:
				getInInterruptibleRegions().clear();
				getInInterruptibleRegions().addAll((Collection)newValue);
				return;
			case UML2Package.OUTPUT_PIN__TYPE:
				setType((Type)newValue);
				return;
			case UML2Package.OUTPUT_PIN__ORDERING:
				setOrdering((ObjectNodeOrderingKind)newValue);
				return;
			case UML2Package.OUTPUT_PIN__UPPER_BOUND:
				setUpperBound((ValueSpecification)newValue);
				return;
			case UML2Package.OUTPUT_PIN__IN_STATE:
				getInStates().clear();
				getInStates().addAll((Collection)newValue);
				return;
			case UML2Package.OUTPUT_PIN__SELECTION:
				setSelection((Behavior)newValue);
				return;
			case UML2Package.OUTPUT_PIN__IS_ORDERED:
				setIsOrdered(((Boolean)newValue).booleanValue());
				return;
			case UML2Package.OUTPUT_PIN__IS_UNIQUE:
				setIsUnique(((Boolean)newValue).booleanValue());
				return;
			case UML2Package.OUTPUT_PIN__UPPER_VALUE:
				setUpperValue((ValueSpecification)newValue);
				return;
			case UML2Package.OUTPUT_PIN__LOWER_VALUE:
				setLowerValue((ValueSpecification)newValue);
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
			case UML2Package.OUTPUT_PIN__EANNOTATIONS:
				getEAnnotations().clear();
				return;
			case UML2Package.OUTPUT_PIN__OWNED_COMMENT:
				getOwnedComments().clear();
				return;
			case UML2Package.OUTPUT_PIN__TEMPLATE_BINDING:
				getTemplateBindings().clear();
				return;
			case UML2Package.OUTPUT_PIN__OWNED_TEMPLATE_SIGNATURE:
				setOwnedTemplateSignature((TemplateSignature)null);
				return;
			case UML2Package.OUTPUT_PIN__NAME:
				setName(NAME_EDEFAULT);
				return;
			case UML2Package.OUTPUT_PIN__VISIBILITY:
				setVisibility(VISIBILITY_EDEFAULT);
				return;
			case UML2Package.OUTPUT_PIN__CLIENT_DEPENDENCY:
				getClientDependencies().clear();
				return;
			case UML2Package.OUTPUT_PIN__NAME_EXPRESSION:
				setNameExpression((StringExpression)null);
				return;
			case UML2Package.OUTPUT_PIN__IS_LEAF:
				setIsLeaf(IS_LEAF_EDEFAULT);
				return;
			case UML2Package.OUTPUT_PIN__OUTGOING:
				getOutgoings().clear();
				return;
			case UML2Package.OUTPUT_PIN__INCOMING:
				getIncomings().clear();
				return;
			case UML2Package.OUTPUT_PIN__ACTIVITY:
				setActivity((Activity)null);
				return;
			case UML2Package.OUTPUT_PIN__REDEFINED_ELEMENT:
				getRedefinedElements().clear();
				return;
			case UML2Package.OUTPUT_PIN__IN_STRUCTURED_NODE:
				setInStructuredNode((StructuredActivityNode)null);
				return;
			case UML2Package.OUTPUT_PIN__IN_PARTITION:
				getInPartitions().clear();
				return;
			case UML2Package.OUTPUT_PIN__IN_INTERRUPTIBLE_REGION:
				getInInterruptibleRegions().clear();
				return;
			case UML2Package.OUTPUT_PIN__TYPE:
				setType((Type)null);
				return;
			case UML2Package.OUTPUT_PIN__ORDERING:
				setOrdering(ORDERING_EDEFAULT);
				return;
			case UML2Package.OUTPUT_PIN__UPPER_BOUND:
				setUpperBound((ValueSpecification)null);
				return;
			case UML2Package.OUTPUT_PIN__IN_STATE:
				getInStates().clear();
				return;
			case UML2Package.OUTPUT_PIN__SELECTION:
				setSelection((Behavior)null);
				return;
			case UML2Package.OUTPUT_PIN__IS_ORDERED:
				setIsOrdered(IS_ORDERED_EDEFAULT);
				return;
			case UML2Package.OUTPUT_PIN__IS_UNIQUE:
				setIsUnique(IS_UNIQUE_EDEFAULT);
				return;
			case UML2Package.OUTPUT_PIN__UPPER_VALUE:
				setUpperValue((ValueSpecification)null);
				return;
			case UML2Package.OUTPUT_PIN__LOWER_VALUE:
				setLowerValue((ValueSpecification)null);
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
			case UML2Package.OUTPUT_PIN__EANNOTATIONS:
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UML2Package.OUTPUT_PIN__OWNED_ELEMENT:
				return !getOwnedElements().isEmpty();
			case UML2Package.OUTPUT_PIN__OWNER:
				return basicGetOwner() != null;
			case UML2Package.OUTPUT_PIN__OWNED_COMMENT:
				return ownedComment != null && !ownedComment.isEmpty();
			case UML2Package.OUTPUT_PIN__TEMPLATE_BINDING:
				return templateBinding != null && !templateBinding.isEmpty();
			case UML2Package.OUTPUT_PIN__OWNED_TEMPLATE_SIGNATURE:
				return ownedTemplateSignature != null;
			case UML2Package.OUTPUT_PIN__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case UML2Package.OUTPUT_PIN__QUALIFIED_NAME:
				return QUALIFIED_NAME_EDEFAULT == null ? getQualifiedName() != null : !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case UML2Package.OUTPUT_PIN__VISIBILITY:
				return visibility != VISIBILITY_EDEFAULT;
			case UML2Package.OUTPUT_PIN__CLIENT_DEPENDENCY:
				return clientDependency != null && !clientDependency.isEmpty();
			case UML2Package.OUTPUT_PIN__NAME_EXPRESSION:
				return nameExpression != null;
			case UML2Package.OUTPUT_PIN__REDEFINITION_CONTEXT:
				return !getRedefinitionContexts().isEmpty();
			case UML2Package.OUTPUT_PIN__IS_LEAF:
				return isLeaf != IS_LEAF_EDEFAULT;
			case UML2Package.OUTPUT_PIN__OUTGOING:
				return outgoing != null && !outgoing.isEmpty();
			case UML2Package.OUTPUT_PIN__INCOMING:
				return incoming != null && !incoming.isEmpty();
			case UML2Package.OUTPUT_PIN__IN_GROUP:
				return !getInGroups().isEmpty();
			case UML2Package.OUTPUT_PIN__ACTIVITY:
				return getActivity() != null;
			case UML2Package.OUTPUT_PIN__REDEFINED_ELEMENT:
				return redefinedElement != null && !redefinedElement.isEmpty();
			case UML2Package.OUTPUT_PIN__IN_STRUCTURED_NODE:
				return getInStructuredNode() != null;
			case UML2Package.OUTPUT_PIN__IN_PARTITION:
				return inPartition != null && !inPartition.isEmpty();
			case UML2Package.OUTPUT_PIN__IN_INTERRUPTIBLE_REGION:
				return inInterruptibleRegion != null && !inInterruptibleRegion.isEmpty();
			case UML2Package.OUTPUT_PIN__TYPE:
				return type != null;
			case UML2Package.OUTPUT_PIN__ORDERING:
				return ordering != ORDERING_EDEFAULT;
			case UML2Package.OUTPUT_PIN__UPPER_BOUND:
				return upperBound != null;
			case UML2Package.OUTPUT_PIN__IN_STATE:
				return inState != null && !inState.isEmpty();
			case UML2Package.OUTPUT_PIN__SELECTION:
				return selection != null;
			case UML2Package.OUTPUT_PIN__IS_ORDERED:
				return isOrdered != IS_ORDERED_EDEFAULT;
			case UML2Package.OUTPUT_PIN__IS_UNIQUE:
				return isUnique != IS_UNIQUE_EDEFAULT;
			case UML2Package.OUTPUT_PIN__LOWER:
				return getLower() != LOWER_EDEFAULT;
			case UML2Package.OUTPUT_PIN__UPPER:
				return getUpper() != UPPER_EDEFAULT;
			case UML2Package.OUTPUT_PIN__UPPER_VALUE:
				return upperValue != null;
			case UML2Package.OUTPUT_PIN__LOWER_VALUE:
				return lowerValue != null;
		}
		return eDynamicIsSet(eFeature);
	}

} //OutputPinImpl
