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
 * $Id: ControlFlowImpl.java,v 1.7 2005/05/18 16:38:29 khussey Exp $
 */
package org.eclipse.uml2.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.uml2.Activity;
import org.eclipse.uml2.ActivityNode;
import org.eclipse.uml2.ControlFlow;
import org.eclipse.uml2.InterruptibleActivityRegion;
import org.eclipse.uml2.StringExpression;
import org.eclipse.uml2.StructuredActivityNode;
import org.eclipse.uml2.TemplateSignature;
import org.eclipse.uml2.UML2Package;
import org.eclipse.uml2.ValueSpecification;
import org.eclipse.uml2.VisibilityKind;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Control Flow</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class ControlFlowImpl extends ActivityEdgeImpl implements ControlFlow {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) IBM Corporation and others."; //$NON-NLS-1$

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ControlFlowImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return UML2Package.eINSTANCE.getControlFlow();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, Class baseClass, NotificationChain msgs) {
		if (featureID >= 0) {
			switch (eDerivedStructuralFeatureID(featureID, baseClass)) {
				case UML2Package.CONTROL_FLOW__EANNOTATIONS:
					return ((InternalEList)getEAnnotations()).basicAdd(otherEnd, msgs);
				case UML2Package.CONTROL_FLOW__TEMPLATE_BINDING:
					return ((InternalEList)getTemplateBindings()).basicAdd(otherEnd, msgs);
				case UML2Package.CONTROL_FLOW__OWNED_TEMPLATE_SIGNATURE:
					if (ownedTemplateSignature != null)
						msgs = ((InternalEObject)ownedTemplateSignature).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UML2Package.CONTROL_FLOW__OWNED_TEMPLATE_SIGNATURE, null, msgs);
					return basicSetOwnedTemplateSignature((TemplateSignature)otherEnd, msgs);
				case UML2Package.CONTROL_FLOW__CLIENT_DEPENDENCY:
					return ((InternalEList)getClientDependencies()).basicAdd(otherEnd, msgs);
				case UML2Package.CONTROL_FLOW__ACTIVITY:
					if (eContainer != null)
						msgs = eBasicRemoveFromContainer(msgs);
					return eBasicSetContainer(otherEnd, UML2Package.CONTROL_FLOW__ACTIVITY, msgs);
				case UML2Package.CONTROL_FLOW__SOURCE:
					if (source != null)
						msgs = ((InternalEObject)source).eInverseRemove(this, UML2Package.ACTIVITY_NODE__OUTGOING, ActivityNode.class, msgs);
					return basicSetSource((ActivityNode)otherEnd, msgs);
				case UML2Package.CONTROL_FLOW__TARGET:
					if (target != null)
						msgs = ((InternalEObject)target).eInverseRemove(this, UML2Package.ACTIVITY_NODE__INCOMING, ActivityNode.class, msgs);
					return basicSetTarget((ActivityNode)otherEnd, msgs);
				case UML2Package.CONTROL_FLOW__IN_STRUCTURED_NODE:
					if (eContainer != null)
						msgs = eBasicRemoveFromContainer(msgs);
					return eBasicSetContainer(otherEnd, UML2Package.CONTROL_FLOW__IN_STRUCTURED_NODE, msgs);
				case UML2Package.CONTROL_FLOW__IN_PARTITION:
					return ((InternalEList)getInPartitions()).basicAdd(otherEnd, msgs);
				case UML2Package.CONTROL_FLOW__INTERRUPTS:
					if (interrupts != null)
						msgs = ((InternalEObject)interrupts).eInverseRemove(this, UML2Package.INTERRUPTIBLE_ACTIVITY_REGION__INTERRUPTING_EDGE, InterruptibleActivityRegion.class, msgs);
					return basicSetInterrupts((InterruptibleActivityRegion)otherEnd, msgs);
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
				case UML2Package.CONTROL_FLOW__EANNOTATIONS:
					return ((InternalEList)getEAnnotations()).basicRemove(otherEnd, msgs);
				case UML2Package.CONTROL_FLOW__OWNED_COMMENT:
					return ((InternalEList)getOwnedComments()).basicRemove(otherEnd, msgs);
				case UML2Package.CONTROL_FLOW__TEMPLATE_BINDING:
					return ((InternalEList)getTemplateBindings()).basicRemove(otherEnd, msgs);
				case UML2Package.CONTROL_FLOW__OWNED_TEMPLATE_SIGNATURE:
					return basicSetOwnedTemplateSignature(null, msgs);
				case UML2Package.CONTROL_FLOW__CLIENT_DEPENDENCY:
					return ((InternalEList)getClientDependencies()).basicRemove(otherEnd, msgs);
				case UML2Package.CONTROL_FLOW__NAME_EXPRESSION:
					return basicSetNameExpression(null, msgs);
				case UML2Package.CONTROL_FLOW__ACTIVITY:
					return eBasicSetContainer(null, UML2Package.CONTROL_FLOW__ACTIVITY, msgs);
				case UML2Package.CONTROL_FLOW__SOURCE:
					return basicSetSource(null, msgs);
				case UML2Package.CONTROL_FLOW__TARGET:
					return basicSetTarget(null, msgs);
				case UML2Package.CONTROL_FLOW__GUARD:
					return basicSetGuard(null, msgs);
				case UML2Package.CONTROL_FLOW__IN_STRUCTURED_NODE:
					return eBasicSetContainer(null, UML2Package.CONTROL_FLOW__IN_STRUCTURED_NODE, msgs);
				case UML2Package.CONTROL_FLOW__IN_PARTITION:
					return ((InternalEList)getInPartitions()).basicRemove(otherEnd, msgs);
				case UML2Package.CONTROL_FLOW__WEIGHT:
					return basicSetWeight(null, msgs);
				case UML2Package.CONTROL_FLOW__INTERRUPTS:
					return basicSetInterrupts(null, msgs);
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
				case UML2Package.CONTROL_FLOW__ACTIVITY:
					return eContainer.eInverseRemove(this, UML2Package.ACTIVITY__EDGE, Activity.class, msgs);
				case UML2Package.CONTROL_FLOW__IN_STRUCTURED_NODE:
					return eContainer.eInverseRemove(this, UML2Package.STRUCTURED_ACTIVITY_NODE__CONTAINED_EDGE, StructuredActivityNode.class, msgs);
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
			case UML2Package.CONTROL_FLOW__EANNOTATIONS:
				return getEAnnotations();
			case UML2Package.CONTROL_FLOW__OWNED_ELEMENT:
				return getOwnedElements();
			case UML2Package.CONTROL_FLOW__OWNER:
				if (resolve) return getOwner();
				return basicGetOwner();
			case UML2Package.CONTROL_FLOW__OWNED_COMMENT:
				return getOwnedComments();
			case UML2Package.CONTROL_FLOW__TEMPLATE_BINDING:
				return getTemplateBindings();
			case UML2Package.CONTROL_FLOW__OWNED_TEMPLATE_SIGNATURE:
				return getOwnedTemplateSignature();
			case UML2Package.CONTROL_FLOW__NAME:
				return getName();
			case UML2Package.CONTROL_FLOW__QUALIFIED_NAME:
				return getQualifiedName();
			case UML2Package.CONTROL_FLOW__VISIBILITY:
				return getVisibility();
			case UML2Package.CONTROL_FLOW__CLIENT_DEPENDENCY:
				return getClientDependencies();
			case UML2Package.CONTROL_FLOW__NAME_EXPRESSION:
				return getNameExpression();
			case UML2Package.CONTROL_FLOW__REDEFINITION_CONTEXT:
				return getRedefinitionContexts();
			case UML2Package.CONTROL_FLOW__IS_LEAF:
				return isLeaf() ? Boolean.TRUE : Boolean.FALSE;
			case UML2Package.CONTROL_FLOW__ACTIVITY:
				return getActivity();
			case UML2Package.CONTROL_FLOW__SOURCE:
				if (resolve) return getSource();
				return basicGetSource();
			case UML2Package.CONTROL_FLOW__TARGET:
				if (resolve) return getTarget();
				return basicGetTarget();
			case UML2Package.CONTROL_FLOW__IN_GROUP:
				return getInGroups();
			case UML2Package.CONTROL_FLOW__GUARD:
				return getGuard();
			case UML2Package.CONTROL_FLOW__REDEFINED_ELEMENT:
				return getRedefinedElements();
			case UML2Package.CONTROL_FLOW__IN_STRUCTURED_NODE:
				return getInStructuredNode();
			case UML2Package.CONTROL_FLOW__IN_PARTITION:
				return getInPartitions();
			case UML2Package.CONTROL_FLOW__WEIGHT:
				return getWeight();
			case UML2Package.CONTROL_FLOW__INTERRUPTS:
				if (resolve) return getInterrupts();
				return basicGetInterrupts();
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
			case UML2Package.CONTROL_FLOW__EANNOTATIONS:
				getEAnnotations().clear();
				getEAnnotations().addAll((Collection)newValue);
				return;
			case UML2Package.CONTROL_FLOW__OWNED_COMMENT:
				getOwnedComments().clear();
				getOwnedComments().addAll((Collection)newValue);
				return;
			case UML2Package.CONTROL_FLOW__TEMPLATE_BINDING:
				getTemplateBindings().clear();
				getTemplateBindings().addAll((Collection)newValue);
				return;
			case UML2Package.CONTROL_FLOW__OWNED_TEMPLATE_SIGNATURE:
				setOwnedTemplateSignature((TemplateSignature)newValue);
				return;
			case UML2Package.CONTROL_FLOW__NAME:
				setName((String)newValue);
				return;
			case UML2Package.CONTROL_FLOW__VISIBILITY:
				setVisibility((VisibilityKind)newValue);
				return;
			case UML2Package.CONTROL_FLOW__CLIENT_DEPENDENCY:
				getClientDependencies().clear();
				getClientDependencies().addAll((Collection)newValue);
				return;
			case UML2Package.CONTROL_FLOW__NAME_EXPRESSION:
				setNameExpression((StringExpression)newValue);
				return;
			case UML2Package.CONTROL_FLOW__IS_LEAF:
				setIsLeaf(((Boolean)newValue).booleanValue());
				return;
			case UML2Package.CONTROL_FLOW__ACTIVITY:
				setActivity((Activity)newValue);
				return;
			case UML2Package.CONTROL_FLOW__SOURCE:
				setSource((ActivityNode)newValue);
				return;
			case UML2Package.CONTROL_FLOW__TARGET:
				setTarget((ActivityNode)newValue);
				return;
			case UML2Package.CONTROL_FLOW__GUARD:
				setGuard((ValueSpecification)newValue);
				return;
			case UML2Package.CONTROL_FLOW__REDEFINED_ELEMENT:
				getRedefinedElements().clear();
				getRedefinedElements().addAll((Collection)newValue);
				return;
			case UML2Package.CONTROL_FLOW__IN_STRUCTURED_NODE:
				setInStructuredNode((StructuredActivityNode)newValue);
				return;
			case UML2Package.CONTROL_FLOW__IN_PARTITION:
				getInPartitions().clear();
				getInPartitions().addAll((Collection)newValue);
				return;
			case UML2Package.CONTROL_FLOW__WEIGHT:
				setWeight((ValueSpecification)newValue);
				return;
			case UML2Package.CONTROL_FLOW__INTERRUPTS:
				setInterrupts((InterruptibleActivityRegion)newValue);
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
			case UML2Package.CONTROL_FLOW__EANNOTATIONS:
				getEAnnotations().clear();
				return;
			case UML2Package.CONTROL_FLOW__OWNED_COMMENT:
				getOwnedComments().clear();
				return;
			case UML2Package.CONTROL_FLOW__TEMPLATE_BINDING:
				getTemplateBindings().clear();
				return;
			case UML2Package.CONTROL_FLOW__OWNED_TEMPLATE_SIGNATURE:
				setOwnedTemplateSignature((TemplateSignature)null);
				return;
			case UML2Package.CONTROL_FLOW__NAME:
				setName(NAME_EDEFAULT);
				return;
			case UML2Package.CONTROL_FLOW__VISIBILITY:
				setVisibility(VISIBILITY_EDEFAULT);
				return;
			case UML2Package.CONTROL_FLOW__CLIENT_DEPENDENCY:
				getClientDependencies().clear();
				return;
			case UML2Package.CONTROL_FLOW__NAME_EXPRESSION:
				setNameExpression((StringExpression)null);
				return;
			case UML2Package.CONTROL_FLOW__IS_LEAF:
				setIsLeaf(IS_LEAF_EDEFAULT);
				return;
			case UML2Package.CONTROL_FLOW__ACTIVITY:
				setActivity((Activity)null);
				return;
			case UML2Package.CONTROL_FLOW__SOURCE:
				setSource((ActivityNode)null);
				return;
			case UML2Package.CONTROL_FLOW__TARGET:
				setTarget((ActivityNode)null);
				return;
			case UML2Package.CONTROL_FLOW__GUARD:
				setGuard((ValueSpecification)null);
				return;
			case UML2Package.CONTROL_FLOW__REDEFINED_ELEMENT:
				getRedefinedElements().clear();
				return;
			case UML2Package.CONTROL_FLOW__IN_STRUCTURED_NODE:
				setInStructuredNode((StructuredActivityNode)null);
				return;
			case UML2Package.CONTROL_FLOW__IN_PARTITION:
				getInPartitions().clear();
				return;
			case UML2Package.CONTROL_FLOW__WEIGHT:
				setWeight((ValueSpecification)null);
				return;
			case UML2Package.CONTROL_FLOW__INTERRUPTS:
				setInterrupts((InterruptibleActivityRegion)null);
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
			case UML2Package.CONTROL_FLOW__EANNOTATIONS:
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UML2Package.CONTROL_FLOW__OWNED_ELEMENT:
				return !getOwnedElements().isEmpty();
			case UML2Package.CONTROL_FLOW__OWNER:
				return basicGetOwner() != null;
			case UML2Package.CONTROL_FLOW__OWNED_COMMENT:
				return ownedComment != null && !ownedComment.isEmpty();
			case UML2Package.CONTROL_FLOW__TEMPLATE_BINDING:
				return templateBinding != null && !templateBinding.isEmpty();
			case UML2Package.CONTROL_FLOW__OWNED_TEMPLATE_SIGNATURE:
				return ownedTemplateSignature != null;
			case UML2Package.CONTROL_FLOW__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case UML2Package.CONTROL_FLOW__QUALIFIED_NAME:
				return QUALIFIED_NAME_EDEFAULT == null ? getQualifiedName() != null : !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case UML2Package.CONTROL_FLOW__VISIBILITY:
				return visibility != VISIBILITY_EDEFAULT;
			case UML2Package.CONTROL_FLOW__CLIENT_DEPENDENCY:
				return clientDependency != null && !clientDependency.isEmpty();
			case UML2Package.CONTROL_FLOW__NAME_EXPRESSION:
				return nameExpression != null;
			case UML2Package.CONTROL_FLOW__REDEFINITION_CONTEXT:
				return !getRedefinitionContexts().isEmpty();
			case UML2Package.CONTROL_FLOW__IS_LEAF:
				return ((eFlags & IS_LEAF_EFLAG) != 0) != IS_LEAF_EDEFAULT;
			case UML2Package.CONTROL_FLOW__ACTIVITY:
				return getActivity() != null;
			case UML2Package.CONTROL_FLOW__SOURCE:
				return source != null;
			case UML2Package.CONTROL_FLOW__TARGET:
				return target != null;
			case UML2Package.CONTROL_FLOW__IN_GROUP:
				return !getInGroups().isEmpty();
			case UML2Package.CONTROL_FLOW__GUARD:
				return guard != null;
			case UML2Package.CONTROL_FLOW__REDEFINED_ELEMENT:
				return redefinedElement != null && !redefinedElement.isEmpty();
			case UML2Package.CONTROL_FLOW__IN_STRUCTURED_NODE:
				return getInStructuredNode() != null;
			case UML2Package.CONTROL_FLOW__IN_PARTITION:
				return inPartition != null && !inPartition.isEmpty();
			case UML2Package.CONTROL_FLOW__WEIGHT:
				return weight != null;
			case UML2Package.CONTROL_FLOW__INTERRUPTS:
				return interrupts != null;
		}
		return eDynamicIsSet(eFeature);
	}


} //ControlFlowImpl
