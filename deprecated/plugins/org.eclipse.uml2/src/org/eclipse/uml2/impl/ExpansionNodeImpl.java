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
 * $Id: ExpansionNodeImpl.java,v 1.2 2004/04/10 04:09:49 khussey Exp $
 */
package org.eclipse.uml2.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.uml2.Activity;
import org.eclipse.uml2.Behavior;
import org.eclipse.uml2.ExpansionNode;
import org.eclipse.uml2.ExpansionRegion;
import org.eclipse.uml2.ObjectNodeOrderingKind;
import org.eclipse.uml2.StringExpression;
import org.eclipse.uml2.StructuredActivityNode;
import org.eclipse.uml2.TemplateSignature;
import org.eclipse.uml2.Type;
import org.eclipse.uml2.UML2Package;
import org.eclipse.uml2.ValueSpecification;
import org.eclipse.uml2.VisibilityKind;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Expansion Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2.impl.ExpansionNodeImpl#getRegionAsOutput <em>Region As Output</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.ExpansionNodeImpl#getRegionAsInput <em>Region As Input</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExpansionNodeImpl extends ObjectNodeImpl implements ExpansionNode {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2003, 2004 IBM Corporation and others."; //$NON-NLS-1$

	/**
	 * The cached value of the '{@link #getRegionAsOutput() <em>Region As Output</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegionAsOutput()
	 * @generated
	 * @ordered
	 */
	protected ExpansionRegion regionAsOutput = null;

	/**
	 * The cached value of the '{@link #getRegionAsInput() <em>Region As Input</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegionAsInput()
	 * @generated
	 * @ordered
	 */
	protected ExpansionRegion regionAsInput = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExpansionNodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return UML2Package.eINSTANCE.getExpansionNode();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * Returns the value of the '<em><b>Region As Output</b></em>' reference.
	 * @generated
	 */
	public ExpansionRegion getRegionAsOutput() {
		if (regionAsOutput != null && regionAsOutput.eIsProxy()) {
			ExpansionRegion oldRegionAsOutput = regionAsOutput;
			regionAsOutput = (ExpansionRegion)eResolveProxy((InternalEObject)regionAsOutput);
			if (regionAsOutput != oldRegionAsOutput) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UML2Package.EXPANSION_NODE__REGION_AS_OUTPUT, oldRegionAsOutput, regionAsOutput));
			}
		}
		return regionAsOutput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * Returns the value of the '<em><b>Region As Output</b></em>' reference.
	 * @generated
	 */
	public ExpansionRegion basicGetRegionAsOutput() {
		return regionAsOutput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRegionAsOutput(ExpansionRegion newRegionAsOutput, NotificationChain msgs) {
		ExpansionRegion oldRegionAsOutput = regionAsOutput;
		regionAsOutput = newRegionAsOutput;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UML2Package.EXPANSION_NODE__REGION_AS_OUTPUT, oldRegionAsOutput, newRegionAsOutput);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRegionAsOutput(ExpansionRegion newRegionAsOutput) {
		if (newRegionAsOutput != regionAsOutput) {
			NotificationChain msgs = null;
			if (regionAsOutput != null)
				msgs = ((InternalEObject)regionAsOutput).eInverseRemove(this, UML2Package.EXPANSION_REGION__OUTPUT_ELEMENT, ExpansionRegion.class, msgs);
			if (newRegionAsOutput != null)
				msgs = ((InternalEObject)newRegionAsOutput).eInverseAdd(this, UML2Package.EXPANSION_REGION__OUTPUT_ELEMENT, ExpansionRegion.class, msgs);
			msgs = basicSetRegionAsOutput(newRegionAsOutput, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2Package.EXPANSION_NODE__REGION_AS_OUTPUT, newRegionAsOutput, newRegionAsOutput));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * Returns the value of the '<em><b>Region As Input</b></em>' reference.
	 * @generated
	 */
	public ExpansionRegion getRegionAsInput() {
		if (regionAsInput != null && regionAsInput.eIsProxy()) {
			ExpansionRegion oldRegionAsInput = regionAsInput;
			regionAsInput = (ExpansionRegion)eResolveProxy((InternalEObject)regionAsInput);
			if (regionAsInput != oldRegionAsInput) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UML2Package.EXPANSION_NODE__REGION_AS_INPUT, oldRegionAsInput, regionAsInput));
			}
		}
		return regionAsInput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * Returns the value of the '<em><b>Region As Input</b></em>' reference.
	 * @generated
	 */
	public ExpansionRegion basicGetRegionAsInput() {
		return regionAsInput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRegionAsInput(ExpansionRegion newRegionAsInput, NotificationChain msgs) {
		ExpansionRegion oldRegionAsInput = regionAsInput;
		regionAsInput = newRegionAsInput;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UML2Package.EXPANSION_NODE__REGION_AS_INPUT, oldRegionAsInput, newRegionAsInput);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRegionAsInput(ExpansionRegion newRegionAsInput) {
		if (newRegionAsInput != regionAsInput) {
			NotificationChain msgs = null;
			if (regionAsInput != null)
				msgs = ((InternalEObject)regionAsInput).eInverseRemove(this, UML2Package.EXPANSION_REGION__INPUT_ELEMENT, ExpansionRegion.class, msgs);
			if (newRegionAsInput != null)
				msgs = ((InternalEObject)newRegionAsInput).eInverseAdd(this, UML2Package.EXPANSION_REGION__INPUT_ELEMENT, ExpansionRegion.class, msgs);
			msgs = basicSetRegionAsInput(newRegionAsInput, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2Package.EXPANSION_NODE__REGION_AS_INPUT, newRegionAsInput, newRegionAsInput));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, Class baseClass, NotificationChain msgs) {
		if (featureID >= 0) {
			switch (eDerivedStructuralFeatureID(featureID, baseClass)) {
				case UML2Package.EXPANSION_NODE__EANNOTATIONS:
					return ((InternalEList)getEAnnotations()).basicAdd(otherEnd, msgs);
				case UML2Package.EXPANSION_NODE__TEMPLATE_BINDING:
					return ((InternalEList)getTemplateBindings()).basicAdd(otherEnd, msgs);
				case UML2Package.EXPANSION_NODE__OWNED_TEMPLATE_SIGNATURE:
					if (ownedTemplateSignature != null)
						msgs = ((InternalEObject)ownedTemplateSignature).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UML2Package.EXPANSION_NODE__OWNED_TEMPLATE_SIGNATURE, null, msgs);
					return basicSetOwnedTemplateSignature((TemplateSignature)otherEnd, msgs);
				case UML2Package.EXPANSION_NODE__CLIENT_DEPENDENCY:
					return ((InternalEList)getClientDependencies()).basicAdd(otherEnd, msgs);
				case UML2Package.EXPANSION_NODE__OUTGOING:
					return ((InternalEList)getOutgoings()).basicAdd(otherEnd, msgs);
				case UML2Package.EXPANSION_NODE__INCOMING:
					return ((InternalEList)getIncomings()).basicAdd(otherEnd, msgs);
				case UML2Package.EXPANSION_NODE__ACTIVITY:
					if (eContainer != null)
						msgs = eBasicRemoveFromContainer(msgs);
					return eBasicSetContainer(otherEnd, UML2Package.EXPANSION_NODE__ACTIVITY, msgs);
				case UML2Package.EXPANSION_NODE__IN_STRUCTURED_NODE:
					if (eContainer != null)
						msgs = eBasicRemoveFromContainer(msgs);
					return eBasicSetContainer(otherEnd, UML2Package.EXPANSION_NODE__IN_STRUCTURED_NODE, msgs);
				case UML2Package.EXPANSION_NODE__IN_PARTITION:
					return ((InternalEList)getInPartitions()).basicAdd(otherEnd, msgs);
				case UML2Package.EXPANSION_NODE__IN_INTERRUPTIBLE_REGION:
					return ((InternalEList)getInInterruptibleRegions()).basicAdd(otherEnd, msgs);
				case UML2Package.EXPANSION_NODE__REGION_AS_OUTPUT:
					if (regionAsOutput != null)
						msgs = ((InternalEObject)regionAsOutput).eInverseRemove(this, UML2Package.EXPANSION_REGION__OUTPUT_ELEMENT, ExpansionRegion.class, msgs);
					return basicSetRegionAsOutput((ExpansionRegion)otherEnd, msgs);
				case UML2Package.EXPANSION_NODE__REGION_AS_INPUT:
					if (regionAsInput != null)
						msgs = ((InternalEObject)regionAsInput).eInverseRemove(this, UML2Package.EXPANSION_REGION__INPUT_ELEMENT, ExpansionRegion.class, msgs);
					return basicSetRegionAsInput((ExpansionRegion)otherEnd, msgs);
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
				case UML2Package.EXPANSION_NODE__EANNOTATIONS:
					return ((InternalEList)getEAnnotations()).basicRemove(otherEnd, msgs);
				case UML2Package.EXPANSION_NODE__OWNED_COMMENT:
					return ((InternalEList)getOwnedComments()).basicRemove(otherEnd, msgs);
				case UML2Package.EXPANSION_NODE__TEMPLATE_BINDING:
					return ((InternalEList)getTemplateBindings()).basicRemove(otherEnd, msgs);
				case UML2Package.EXPANSION_NODE__OWNED_TEMPLATE_SIGNATURE:
					return basicSetOwnedTemplateSignature(null, msgs);
				case UML2Package.EXPANSION_NODE__CLIENT_DEPENDENCY:
					return ((InternalEList)getClientDependencies()).basicRemove(otherEnd, msgs);
				case UML2Package.EXPANSION_NODE__NAME_EXPRESSION:
					return basicSetNameExpression(null, msgs);
				case UML2Package.EXPANSION_NODE__OUTGOING:
					return ((InternalEList)getOutgoings()).basicRemove(otherEnd, msgs);
				case UML2Package.EXPANSION_NODE__INCOMING:
					return ((InternalEList)getIncomings()).basicRemove(otherEnd, msgs);
				case UML2Package.EXPANSION_NODE__ACTIVITY:
					return eBasicSetContainer(null, UML2Package.EXPANSION_NODE__ACTIVITY, msgs);
				case UML2Package.EXPANSION_NODE__IN_STRUCTURED_NODE:
					return eBasicSetContainer(null, UML2Package.EXPANSION_NODE__IN_STRUCTURED_NODE, msgs);
				case UML2Package.EXPANSION_NODE__IN_PARTITION:
					return ((InternalEList)getInPartitions()).basicRemove(otherEnd, msgs);
				case UML2Package.EXPANSION_NODE__IN_INTERRUPTIBLE_REGION:
					return ((InternalEList)getInInterruptibleRegions()).basicRemove(otherEnd, msgs);
				case UML2Package.EXPANSION_NODE__UPPER_BOUND:
					return basicSetUpperBound(null, msgs);
				case UML2Package.EXPANSION_NODE__REGION_AS_OUTPUT:
					return basicSetRegionAsOutput(null, msgs);
				case UML2Package.EXPANSION_NODE__REGION_AS_INPUT:
					return basicSetRegionAsInput(null, msgs);
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
				case UML2Package.EXPANSION_NODE__ACTIVITY:
					return eContainer.eInverseRemove(this, UML2Package.ACTIVITY__NODE, Activity.class, msgs);
				case UML2Package.EXPANSION_NODE__IN_STRUCTURED_NODE:
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
			case UML2Package.EXPANSION_NODE__EANNOTATIONS:
				return getEAnnotations();
			case UML2Package.EXPANSION_NODE__OWNED_ELEMENT:
				return getOwnedElements();
			case UML2Package.EXPANSION_NODE__OWNER:
				if (resolve) return getOwner();
				return basicGetOwner();
			case UML2Package.EXPANSION_NODE__OWNED_COMMENT:
				return getOwnedComments();
			case UML2Package.EXPANSION_NODE__TEMPLATE_BINDING:
				return getTemplateBindings();
			case UML2Package.EXPANSION_NODE__OWNED_TEMPLATE_SIGNATURE:
				return getOwnedTemplateSignature();
			case UML2Package.EXPANSION_NODE__NAME:
				return getName();
			case UML2Package.EXPANSION_NODE__QUALIFIED_NAME:
				return getQualifiedName();
			case UML2Package.EXPANSION_NODE__VISIBILITY:
				return getVisibility();
			case UML2Package.EXPANSION_NODE__CLIENT_DEPENDENCY:
				return getClientDependencies();
			case UML2Package.EXPANSION_NODE__NAME_EXPRESSION:
				return getNameExpression();
			case UML2Package.EXPANSION_NODE__REDEFINITION_CONTEXT:
				return getRedefinitionContexts();
			case UML2Package.EXPANSION_NODE__IS_LEAF:
				return isLeaf() ? Boolean.TRUE : Boolean.FALSE;
			case UML2Package.EXPANSION_NODE__OUTGOING:
				return getOutgoings();
			case UML2Package.EXPANSION_NODE__INCOMING:
				return getIncomings();
			case UML2Package.EXPANSION_NODE__IN_GROUP:
				return getInGroups();
			case UML2Package.EXPANSION_NODE__ACTIVITY:
				return getActivity();
			case UML2Package.EXPANSION_NODE__REDEFINED_ELEMENT:
				return getRedefinedElements();
			case UML2Package.EXPANSION_NODE__IN_STRUCTURED_NODE:
				return getInStructuredNode();
			case UML2Package.EXPANSION_NODE__IN_PARTITION:
				return getInPartitions();
			case UML2Package.EXPANSION_NODE__IN_INTERRUPTIBLE_REGION:
				return getInInterruptibleRegions();
			case UML2Package.EXPANSION_NODE__TYPE:
				if (resolve) return getType();
				return basicGetType();
			case UML2Package.EXPANSION_NODE__ORDERING:
				return getOrdering();
			case UML2Package.EXPANSION_NODE__UPPER_BOUND:
				return getUpperBound();
			case UML2Package.EXPANSION_NODE__IN_STATE:
				return getInStates();
			case UML2Package.EXPANSION_NODE__SELECTION:
				if (resolve) return getSelection();
				return basicGetSelection();
			case UML2Package.EXPANSION_NODE__REGION_AS_OUTPUT:
				if (resolve) return getRegionAsOutput();
				return basicGetRegionAsOutput();
			case UML2Package.EXPANSION_NODE__REGION_AS_INPUT:
				if (resolve) return getRegionAsInput();
				return basicGetRegionAsInput();
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
			case UML2Package.EXPANSION_NODE__EANNOTATIONS:
				getEAnnotations().clear();
				getEAnnotations().addAll((Collection)newValue);
				return;
			case UML2Package.EXPANSION_NODE__OWNED_COMMENT:
				getOwnedComments().clear();
				getOwnedComments().addAll((Collection)newValue);
				return;
			case UML2Package.EXPANSION_NODE__TEMPLATE_BINDING:
				getTemplateBindings().clear();
				getTemplateBindings().addAll((Collection)newValue);
				return;
			case UML2Package.EXPANSION_NODE__OWNED_TEMPLATE_SIGNATURE:
				setOwnedTemplateSignature((TemplateSignature)newValue);
				return;
			case UML2Package.EXPANSION_NODE__NAME:
				setName((String)newValue);
				return;
			case UML2Package.EXPANSION_NODE__VISIBILITY:
				setVisibility((VisibilityKind)newValue);
				return;
			case UML2Package.EXPANSION_NODE__CLIENT_DEPENDENCY:
				getClientDependencies().clear();
				getClientDependencies().addAll((Collection)newValue);
				return;
			case UML2Package.EXPANSION_NODE__NAME_EXPRESSION:
				setNameExpression((StringExpression)newValue);
				return;
			case UML2Package.EXPANSION_NODE__IS_LEAF:
				setIsLeaf(((Boolean)newValue).booleanValue());
				return;
			case UML2Package.EXPANSION_NODE__OUTGOING:
				getOutgoings().clear();
				getOutgoings().addAll((Collection)newValue);
				return;
			case UML2Package.EXPANSION_NODE__INCOMING:
				getIncomings().clear();
				getIncomings().addAll((Collection)newValue);
				return;
			case UML2Package.EXPANSION_NODE__ACTIVITY:
				setActivity((Activity)newValue);
				return;
			case UML2Package.EXPANSION_NODE__REDEFINED_ELEMENT:
				getRedefinedElements().clear();
				getRedefinedElements().addAll((Collection)newValue);
				return;
			case UML2Package.EXPANSION_NODE__IN_STRUCTURED_NODE:
				setInStructuredNode((StructuredActivityNode)newValue);
				return;
			case UML2Package.EXPANSION_NODE__IN_PARTITION:
				getInPartitions().clear();
				getInPartitions().addAll((Collection)newValue);
				return;
			case UML2Package.EXPANSION_NODE__IN_INTERRUPTIBLE_REGION:
				getInInterruptibleRegions().clear();
				getInInterruptibleRegions().addAll((Collection)newValue);
				return;
			case UML2Package.EXPANSION_NODE__TYPE:
				setType((Type)newValue);
				return;
			case UML2Package.EXPANSION_NODE__ORDERING:
				setOrdering((ObjectNodeOrderingKind)newValue);
				return;
			case UML2Package.EXPANSION_NODE__UPPER_BOUND:
				setUpperBound((ValueSpecification)newValue);
				return;
			case UML2Package.EXPANSION_NODE__IN_STATE:
				getInStates().clear();
				getInStates().addAll((Collection)newValue);
				return;
			case UML2Package.EXPANSION_NODE__SELECTION:
				setSelection((Behavior)newValue);
				return;
			case UML2Package.EXPANSION_NODE__REGION_AS_OUTPUT:
				setRegionAsOutput((ExpansionRegion)newValue);
				return;
			case UML2Package.EXPANSION_NODE__REGION_AS_INPUT:
				setRegionAsInput((ExpansionRegion)newValue);
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
			case UML2Package.EXPANSION_NODE__EANNOTATIONS:
				getEAnnotations().clear();
				return;
			case UML2Package.EXPANSION_NODE__OWNED_COMMENT:
				getOwnedComments().clear();
				return;
			case UML2Package.EXPANSION_NODE__TEMPLATE_BINDING:
				getTemplateBindings().clear();
				return;
			case UML2Package.EXPANSION_NODE__OWNED_TEMPLATE_SIGNATURE:
				setOwnedTemplateSignature((TemplateSignature)null);
				return;
			case UML2Package.EXPANSION_NODE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case UML2Package.EXPANSION_NODE__VISIBILITY:
				setVisibility(VISIBILITY_EDEFAULT);
				return;
			case UML2Package.EXPANSION_NODE__CLIENT_DEPENDENCY:
				getClientDependencies().clear();
				return;
			case UML2Package.EXPANSION_NODE__NAME_EXPRESSION:
				setNameExpression((StringExpression)null);
				return;
			case UML2Package.EXPANSION_NODE__IS_LEAF:
				setIsLeaf(IS_LEAF_EDEFAULT);
				return;
			case UML2Package.EXPANSION_NODE__OUTGOING:
				getOutgoings().clear();
				return;
			case UML2Package.EXPANSION_NODE__INCOMING:
				getIncomings().clear();
				return;
			case UML2Package.EXPANSION_NODE__ACTIVITY:
				setActivity(null);
				return;
			case UML2Package.EXPANSION_NODE__REDEFINED_ELEMENT:
				getRedefinedElements().clear();
				return;
			case UML2Package.EXPANSION_NODE__IN_STRUCTURED_NODE:
				setInStructuredNode((StructuredActivityNode)null);
				return;
			case UML2Package.EXPANSION_NODE__IN_PARTITION:
				getInPartitions().clear();
				return;
			case UML2Package.EXPANSION_NODE__IN_INTERRUPTIBLE_REGION:
				getInInterruptibleRegions().clear();
				return;
			case UML2Package.EXPANSION_NODE__TYPE:
				setType((Type)null);
				return;
			case UML2Package.EXPANSION_NODE__ORDERING:
				setOrdering(ORDERING_EDEFAULT);
				return;
			case UML2Package.EXPANSION_NODE__UPPER_BOUND:
				setUpperBound((ValueSpecification)null);
				return;
			case UML2Package.EXPANSION_NODE__IN_STATE:
				getInStates().clear();
				return;
			case UML2Package.EXPANSION_NODE__SELECTION:
				setSelection((Behavior)null);
				return;
			case UML2Package.EXPANSION_NODE__REGION_AS_OUTPUT:
				setRegionAsOutput((ExpansionRegion)null);
				return;
			case UML2Package.EXPANSION_NODE__REGION_AS_INPUT:
				setRegionAsInput((ExpansionRegion)null);
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
			case UML2Package.EXPANSION_NODE__EANNOTATIONS:
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UML2Package.EXPANSION_NODE__OWNED_ELEMENT:
				return !getOwnedElements().isEmpty();
			case UML2Package.EXPANSION_NODE__OWNER:
				return basicGetOwner() != null;
			case UML2Package.EXPANSION_NODE__OWNED_COMMENT:
				return ownedComment != null && !ownedComment.isEmpty();
			case UML2Package.EXPANSION_NODE__TEMPLATE_BINDING:
				return templateBinding != null && !templateBinding.isEmpty();
			case UML2Package.EXPANSION_NODE__OWNED_TEMPLATE_SIGNATURE:
				return ownedTemplateSignature != null;
			case UML2Package.EXPANSION_NODE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case UML2Package.EXPANSION_NODE__QUALIFIED_NAME:
				return !"".equals(getQualifiedName()); //$NON-NLS-1$
			case UML2Package.EXPANSION_NODE__VISIBILITY:
				return visibility != VISIBILITY_EDEFAULT;
			case UML2Package.EXPANSION_NODE__CLIENT_DEPENDENCY:
				return clientDependency != null && !clientDependency.isEmpty();
			case UML2Package.EXPANSION_NODE__NAME_EXPRESSION:
				return nameExpression != null;
			case UML2Package.EXPANSION_NODE__REDEFINITION_CONTEXT:
				return !getRedefinitionContexts().isEmpty();
			case UML2Package.EXPANSION_NODE__IS_LEAF:
				return isLeaf != IS_LEAF_EDEFAULT;
			case UML2Package.EXPANSION_NODE__OUTGOING:
				return outgoing != null && !outgoing.isEmpty();
			case UML2Package.EXPANSION_NODE__INCOMING:
				return incoming != null && !incoming.isEmpty();
			case UML2Package.EXPANSION_NODE__IN_GROUP:
				return !getInGroups().isEmpty();
			case UML2Package.EXPANSION_NODE__ACTIVITY:
				return getActivity() != null;
			case UML2Package.EXPANSION_NODE__REDEFINED_ELEMENT:
				return redefinedElement != null && !redefinedElement.isEmpty();
			case UML2Package.EXPANSION_NODE__IN_STRUCTURED_NODE:
				return getInStructuredNode() != null;
			case UML2Package.EXPANSION_NODE__IN_PARTITION:
				return inPartition != null && !inPartition.isEmpty();
			case UML2Package.EXPANSION_NODE__IN_INTERRUPTIBLE_REGION:
				return inInterruptibleRegion != null && !inInterruptibleRegion.isEmpty();
			case UML2Package.EXPANSION_NODE__TYPE:
				return type != null;
			case UML2Package.EXPANSION_NODE__ORDERING:
				return ordering != ORDERING_EDEFAULT;
			case UML2Package.EXPANSION_NODE__UPPER_BOUND:
				return upperBound != null;
			case UML2Package.EXPANSION_NODE__IN_STATE:
				return inState != null && !inState.isEmpty();
			case UML2Package.EXPANSION_NODE__SELECTION:
				return selection != null;
			case UML2Package.EXPANSION_NODE__REGION_AS_OUTPUT:
				return regionAsOutput != null;
			case UML2Package.EXPANSION_NODE__REGION_AS_INPUT:
				return regionAsInput != null;
		}
		return eDynamicIsSet(eFeature);
	}

} //ExpansionNodeImpl
