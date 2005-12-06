/*
 * Copyright (c) 2005 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *
 * $Id: ObjectFlowImpl.java,v 1.6 2005/12/06 23:21:50 khussey Exp $
 */
package org.eclipse.uml2.uml.internal.impl;

import java.util.Collection;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.uml2.uml.Activity;
import org.eclipse.uml2.uml.ActivityNode;
import org.eclipse.uml2.uml.Behavior;
import org.eclipse.uml2.uml.InterruptibleActivityRegion;
import org.eclipse.uml2.uml.ObjectFlow;
import org.eclipse.uml2.uml.StringExpression;
import org.eclipse.uml2.uml.StructuredActivityNode;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.ValueSpecification;
import org.eclipse.uml2.uml.VisibilityKind;

import org.eclipse.uml2.uml.internal.operations.ObjectFlowOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Object Flow</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ObjectFlowImpl#isMulticast <em>Is Multicast</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ObjectFlowImpl#isMultireceive <em>Is Multireceive</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ObjectFlowImpl#getTransformation <em>Transformation</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ObjectFlowImpl#getSelection <em>Selection</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ObjectFlowImpl
		extends ActivityEdgeImpl
		implements ObjectFlow {

	/**
	 * The default value of the '{@link #isMulticast() <em>Is Multicast</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMulticast()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_MULTICAST_EDEFAULT = false;

	/**
	 * The flag representing the value of the '{@link #isMulticast() <em>Is Multicast</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMulticast()
	 * @generated
	 * @ordered
	 */
	protected static final int IS_MULTICAST_EFLAG = 1 << 9;

	/**
	 * The default value of the '{@link #isMultireceive() <em>Is Multireceive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMultireceive()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_MULTIRECEIVE_EDEFAULT = false;

	/**
	 * The flag representing the value of the '{@link #isMultireceive() <em>Is Multireceive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMultireceive()
	 * @generated
	 * @ordered
	 */
	protected static final int IS_MULTIRECEIVE_EFLAG = 1 << 10;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ObjectFlowImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return UMLPackage.Literals.OBJECT_FLOW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isMulticast() {
		return (eFlags & IS_MULTICAST_EFLAG) != 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsMulticast(boolean newIsMulticast) {
		boolean oldIsMulticast = (eFlags & IS_MULTICAST_EFLAG) != 0;
		if (newIsMulticast)
			eFlags |= IS_MULTICAST_EFLAG;
		else
			eFlags &= ~IS_MULTICAST_EFLAG;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.OBJECT_FLOW__IS_MULTICAST, oldIsMulticast,
				newIsMulticast));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isMultireceive() {
		return (eFlags & IS_MULTIRECEIVE_EFLAG) != 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsMultireceive(boolean newIsMultireceive) {
		boolean oldIsMultireceive = (eFlags & IS_MULTIRECEIVE_EFLAG) != 0;
		if (newIsMultireceive)
			eFlags |= IS_MULTIRECEIVE_EFLAG;
		else
			eFlags &= ~IS_MULTIRECEIVE_EFLAG;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.OBJECT_FLOW__IS_MULTIRECEIVE, oldIsMultireceive,
				newIsMultireceive));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Behavior getTransformation() {
		Behavior transformation = (Behavior) eVirtualGet(UMLPackage.OBJECT_FLOW__TRANSFORMATION);
		if (transformation != null && transformation.eIsProxy()) {
			InternalEObject oldTransformation = (InternalEObject) transformation;
			transformation = (Behavior) eResolveProxy(oldTransformation);
			if (transformation != oldTransformation) {
				eVirtualSet(UMLPackage.OBJECT_FLOW__TRANSFORMATION,
					transformation);
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
						UMLPackage.OBJECT_FLOW__TRANSFORMATION,
						oldTransformation, transformation));
			}
		}
		return transformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Behavior basicGetTransformation() {
		return (Behavior) eVirtualGet(UMLPackage.OBJECT_FLOW__TRANSFORMATION);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransformation(Behavior newTransformation) {
		Behavior transformation = newTransformation;
		Object oldTransformation = eVirtualSet(
			UMLPackage.OBJECT_FLOW__TRANSFORMATION, transformation);
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.OBJECT_FLOW__TRANSFORMATION,
				oldTransformation == EVIRTUAL_NO_VALUE
					? null
					: oldTransformation, transformation));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Behavior getSelection() {
		Behavior selection = (Behavior) eVirtualGet(UMLPackage.OBJECT_FLOW__SELECTION);
		if (selection != null && selection.eIsProxy()) {
			InternalEObject oldSelection = (InternalEObject) selection;
			selection = (Behavior) eResolveProxy(oldSelection);
			if (selection != oldSelection) {
				eVirtualSet(UMLPackage.OBJECT_FLOW__SELECTION, selection);
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
						UMLPackage.OBJECT_FLOW__SELECTION, oldSelection,
						selection));
			}
		}
		return selection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Behavior basicGetSelection() {
		return (Behavior) eVirtualGet(UMLPackage.OBJECT_FLOW__SELECTION);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSelection(Behavior newSelection) {
		Behavior selection = newSelection;
		Object oldSelection = eVirtualSet(UMLPackage.OBJECT_FLOW__SELECTION,
			selection);
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.OBJECT_FLOW__SELECTION,
				oldSelection == EVIRTUAL_NO_VALUE
					? null
					: oldSelection, selection));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNoActions(DiagnosticChain diagnostics, Map context) {
		return ObjectFlowOperations.validateNoActions(this, diagnostics,
			context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCompatibleTypes(DiagnosticChain diagnostics,
			Map context) {
		return ObjectFlowOperations.validateCompatibleTypes(this, diagnostics,
			context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSameUpperBounds(DiagnosticChain diagnostics,
			Map context) {
		return ObjectFlowOperations.validateSameUpperBounds(this, diagnostics,
			context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTarget(DiagnosticChain diagnostics, Map context) {
		return ObjectFlowOperations.validateTarget(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTransformationBehaviour(DiagnosticChain diagnostics,
			Map context) {
		return ObjectFlowOperations.validateTransformationBehaviour(this,
			diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSelectionBehaviour(DiagnosticChain diagnostics,
			Map context) {
		return ObjectFlowOperations.validateSelectionBehaviour(this,
			diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInputAndOutputParameter(DiagnosticChain diagnostics,
			Map context) {
		return ObjectFlowOperations.validateInputAndOutputParameter(this,
			diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIsMulticastOrIsMultireceive(
			DiagnosticChain diagnostics, Map context) {
		return ObjectFlowOperations.validateIsMulticastOrIsMultireceive(this,
			diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UMLPackage.OBJECT_FLOW__EANNOTATIONS :
				return getEAnnotations();
			case UMLPackage.OBJECT_FLOW__OWNED_ELEMENT :
				return getOwnedElements();
			case UMLPackage.OBJECT_FLOW__OWNER :
				if (resolve)
					return getOwner();
				return basicGetOwner();
			case UMLPackage.OBJECT_FLOW__OWNED_COMMENT :
				return getOwnedComments();
			case UMLPackage.OBJECT_FLOW__NAME :
				return getName();
			case UMLPackage.OBJECT_FLOW__VISIBILITY :
				return getVisibility();
			case UMLPackage.OBJECT_FLOW__QUALIFIED_NAME :
				return getQualifiedName();
			case UMLPackage.OBJECT_FLOW__CLIENT_DEPENDENCY :
				return getClientDependencies();
			case UMLPackage.OBJECT_FLOW__NAMESPACE :
				if (resolve)
					return getNamespace();
				return basicGetNamespace();
			case UMLPackage.OBJECT_FLOW__NAME_EXPRESSION :
				return getNameExpression();
			case UMLPackage.OBJECT_FLOW__IS_LEAF :
				return isLeaf()
					? Boolean.TRUE
					: Boolean.FALSE;
			case UMLPackage.OBJECT_FLOW__REDEFINED_ELEMENT :
				return getRedefinedElements();
			case UMLPackage.OBJECT_FLOW__REDEFINITION_CONTEXT :
				return getRedefinitionContexts();
			case UMLPackage.OBJECT_FLOW__ACTIVITY :
				return getActivity();
			case UMLPackage.OBJECT_FLOW__IN_GROUP :
				return getInGroups();
			case UMLPackage.OBJECT_FLOW__IN_PARTITION :
				return getInPartitions();
			case UMLPackage.OBJECT_FLOW__IN_STRUCTURED_NODE :
				return getInStructuredNode();
			case UMLPackage.OBJECT_FLOW__TARGET :
				if (resolve)
					return getTarget();
				return basicGetTarget();
			case UMLPackage.OBJECT_FLOW__REDEFINED_EDGE :
				return getRedefinedEdges();
			case UMLPackage.OBJECT_FLOW__GUARD :
				return getGuard();
			case UMLPackage.OBJECT_FLOW__WEIGHT :
				return getWeight();
			case UMLPackage.OBJECT_FLOW__INTERRUPTS :
				if (resolve)
					return getInterrupts();
				return basicGetInterrupts();
			case UMLPackage.OBJECT_FLOW__SOURCE :
				if (resolve)
					return getSource();
				return basicGetSource();
			case UMLPackage.OBJECT_FLOW__IS_MULTICAST :
				return isMulticast()
					? Boolean.TRUE
					: Boolean.FALSE;
			case UMLPackage.OBJECT_FLOW__IS_MULTIRECEIVE :
				return isMultireceive()
					? Boolean.TRUE
					: Boolean.FALSE;
			case UMLPackage.OBJECT_FLOW__TRANSFORMATION :
				if (resolve)
					return getTransformation();
				return basicGetTransformation();
			case UMLPackage.OBJECT_FLOW__SELECTION :
				if (resolve)
					return getSelection();
				return basicGetSelection();
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
			case UMLPackage.OBJECT_FLOW__EANNOTATIONS :
				getEAnnotations().clear();
				getEAnnotations().addAll((Collection) newValue);
				return;
			case UMLPackage.OBJECT_FLOW__OWNED_COMMENT :
				getOwnedComments().clear();
				getOwnedComments().addAll((Collection) newValue);
				return;
			case UMLPackage.OBJECT_FLOW__NAME :
				setName((String) newValue);
				return;
			case UMLPackage.OBJECT_FLOW__VISIBILITY :
				setVisibility((VisibilityKind) newValue);
				return;
			case UMLPackage.OBJECT_FLOW__CLIENT_DEPENDENCY :
				getClientDependencies().clear();
				getClientDependencies().addAll((Collection) newValue);
				return;
			case UMLPackage.OBJECT_FLOW__NAME_EXPRESSION :
				setNameExpression((StringExpression) newValue);
				return;
			case UMLPackage.OBJECT_FLOW__IS_LEAF :
				setIsLeaf(((Boolean) newValue).booleanValue());
				return;
			case UMLPackage.OBJECT_FLOW__ACTIVITY :
				setActivity((Activity) newValue);
				return;
			case UMLPackage.OBJECT_FLOW__IN_PARTITION :
				getInPartitions().clear();
				getInPartitions().addAll((Collection) newValue);
				return;
			case UMLPackage.OBJECT_FLOW__IN_STRUCTURED_NODE :
				setInStructuredNode((StructuredActivityNode) newValue);
				return;
			case UMLPackage.OBJECT_FLOW__TARGET :
				setTarget((ActivityNode) newValue);
				return;
			case UMLPackage.OBJECT_FLOW__REDEFINED_EDGE :
				getRedefinedEdges().clear();
				getRedefinedEdges().addAll((Collection) newValue);
				return;
			case UMLPackage.OBJECT_FLOW__GUARD :
				setGuard((ValueSpecification) newValue);
				return;
			case UMLPackage.OBJECT_FLOW__WEIGHT :
				setWeight((ValueSpecification) newValue);
				return;
			case UMLPackage.OBJECT_FLOW__INTERRUPTS :
				setInterrupts((InterruptibleActivityRegion) newValue);
				return;
			case UMLPackage.OBJECT_FLOW__SOURCE :
				setSource((ActivityNode) newValue);
				return;
			case UMLPackage.OBJECT_FLOW__IS_MULTICAST :
				setIsMulticast(((Boolean) newValue).booleanValue());
				return;
			case UMLPackage.OBJECT_FLOW__IS_MULTIRECEIVE :
				setIsMultireceive(((Boolean) newValue).booleanValue());
				return;
			case UMLPackage.OBJECT_FLOW__TRANSFORMATION :
				setTransformation((Behavior) newValue);
				return;
			case UMLPackage.OBJECT_FLOW__SELECTION :
				setSelection((Behavior) newValue);
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
			case UMLPackage.OBJECT_FLOW__EANNOTATIONS :
				getEAnnotations().clear();
				return;
			case UMLPackage.OBJECT_FLOW__OWNED_COMMENT :
				getOwnedComments().clear();
				return;
			case UMLPackage.OBJECT_FLOW__NAME :
				setName(NAME_EDEFAULT);
				return;
			case UMLPackage.OBJECT_FLOW__VISIBILITY :
				setVisibility(VISIBILITY_EDEFAULT);
				return;
			case UMLPackage.OBJECT_FLOW__CLIENT_DEPENDENCY :
				getClientDependencies().clear();
				return;
			case UMLPackage.OBJECT_FLOW__NAME_EXPRESSION :
				setNameExpression((StringExpression) null);
				return;
			case UMLPackage.OBJECT_FLOW__IS_LEAF :
				setIsLeaf(IS_LEAF_EDEFAULT);
				return;
			case UMLPackage.OBJECT_FLOW__ACTIVITY :
				setActivity((Activity) null);
				return;
			case UMLPackage.OBJECT_FLOW__IN_PARTITION :
				getInPartitions().clear();
				return;
			case UMLPackage.OBJECT_FLOW__IN_STRUCTURED_NODE :
				setInStructuredNode((StructuredActivityNode) null);
				return;
			case UMLPackage.OBJECT_FLOW__TARGET :
				setTarget((ActivityNode) null);
				return;
			case UMLPackage.OBJECT_FLOW__REDEFINED_EDGE :
				getRedefinedEdges().clear();
				return;
			case UMLPackage.OBJECT_FLOW__GUARD :
				setGuard((ValueSpecification) null);
				return;
			case UMLPackage.OBJECT_FLOW__WEIGHT :
				setWeight((ValueSpecification) null);
				return;
			case UMLPackage.OBJECT_FLOW__INTERRUPTS :
				setInterrupts((InterruptibleActivityRegion) null);
				return;
			case UMLPackage.OBJECT_FLOW__SOURCE :
				setSource((ActivityNode) null);
				return;
			case UMLPackage.OBJECT_FLOW__IS_MULTICAST :
				setIsMulticast(IS_MULTICAST_EDEFAULT);
				return;
			case UMLPackage.OBJECT_FLOW__IS_MULTIRECEIVE :
				setIsMultireceive(IS_MULTIRECEIVE_EDEFAULT);
				return;
			case UMLPackage.OBJECT_FLOW__TRANSFORMATION :
				setTransformation((Behavior) null);
				return;
			case UMLPackage.OBJECT_FLOW__SELECTION :
				setSelection((Behavior) null);
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
			case UMLPackage.OBJECT_FLOW__EANNOTATIONS :
				EList eAnnotations = (EList) eVirtualGet(UMLPackage.OBJECT_FLOW__EANNOTATIONS);
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UMLPackage.OBJECT_FLOW__OWNED_ELEMENT :
				return isSetOwnedElements();
			case UMLPackage.OBJECT_FLOW__OWNER :
				return isSetOwner();
			case UMLPackage.OBJECT_FLOW__OWNED_COMMENT :
				List ownedComment = (List) eVirtualGet(UMLPackage.OBJECT_FLOW__OWNED_COMMENT);
				return ownedComment != null && !ownedComment.isEmpty();
			case UMLPackage.OBJECT_FLOW__NAME :
				String name = (String) eVirtualGet(
					UMLPackage.OBJECT_FLOW__NAME, NAME_EDEFAULT);
				return NAME_EDEFAULT == null
					? name != null
					: !NAME_EDEFAULT.equals(name);
			case UMLPackage.OBJECT_FLOW__VISIBILITY :
				return eVirtualGet(UMLPackage.OBJECT_FLOW__VISIBILITY,
					VISIBILITY_EDEFAULT) != VISIBILITY_EDEFAULT;
			case UMLPackage.OBJECT_FLOW__QUALIFIED_NAME :
				return QUALIFIED_NAME_EDEFAULT == null
					? getQualifiedName() != null
					: !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case UMLPackage.OBJECT_FLOW__CLIENT_DEPENDENCY :
				List clientDependency = (List) eVirtualGet(UMLPackage.OBJECT_FLOW__CLIENT_DEPENDENCY);
				return clientDependency != null && !clientDependency.isEmpty();
			case UMLPackage.OBJECT_FLOW__NAMESPACE :
				return isSetNamespace();
			case UMLPackage.OBJECT_FLOW__NAME_EXPRESSION :
				return eVirtualGet(UMLPackage.OBJECT_FLOW__NAME_EXPRESSION) != null;
			case UMLPackage.OBJECT_FLOW__IS_LEAF :
				return ((eFlags & IS_LEAF_EFLAG) != 0) != IS_LEAF_EDEFAULT;
			case UMLPackage.OBJECT_FLOW__REDEFINED_ELEMENT :
				return isSetRedefinedElements();
			case UMLPackage.OBJECT_FLOW__REDEFINITION_CONTEXT :
				return isSetRedefinitionContexts();
			case UMLPackage.OBJECT_FLOW__ACTIVITY :
				return getActivity() != null;
			case UMLPackage.OBJECT_FLOW__IN_GROUP :
				return isSetInGroups();
			case UMLPackage.OBJECT_FLOW__IN_PARTITION :
				List inPartition = (List) eVirtualGet(UMLPackage.OBJECT_FLOW__IN_PARTITION);
				return inPartition != null && !inPartition.isEmpty();
			case UMLPackage.OBJECT_FLOW__IN_STRUCTURED_NODE :
				return getInStructuredNode() != null;
			case UMLPackage.OBJECT_FLOW__TARGET :
				return eVirtualGet(UMLPackage.OBJECT_FLOW__TARGET) != null;
			case UMLPackage.OBJECT_FLOW__REDEFINED_EDGE :
				List redefinedEdge = (List) eVirtualGet(UMLPackage.OBJECT_FLOW__REDEFINED_EDGE);
				return redefinedEdge != null && !redefinedEdge.isEmpty();
			case UMLPackage.OBJECT_FLOW__GUARD :
				return eVirtualGet(UMLPackage.OBJECT_FLOW__GUARD) != null;
			case UMLPackage.OBJECT_FLOW__WEIGHT :
				return eVirtualGet(UMLPackage.OBJECT_FLOW__WEIGHT) != null;
			case UMLPackage.OBJECT_FLOW__INTERRUPTS :
				return eVirtualGet(UMLPackage.OBJECT_FLOW__INTERRUPTS) != null;
			case UMLPackage.OBJECT_FLOW__SOURCE :
				return eVirtualGet(UMLPackage.OBJECT_FLOW__SOURCE) != null;
			case UMLPackage.OBJECT_FLOW__IS_MULTICAST :
				return ((eFlags & IS_MULTICAST_EFLAG) != 0) != IS_MULTICAST_EDEFAULT;
			case UMLPackage.OBJECT_FLOW__IS_MULTIRECEIVE :
				return ((eFlags & IS_MULTIRECEIVE_EFLAG) != 0) != IS_MULTIRECEIVE_EDEFAULT;
			case UMLPackage.OBJECT_FLOW__TRANSFORMATION :
				return eVirtualGet(UMLPackage.OBJECT_FLOW__TRANSFORMATION) != null;
			case UMLPackage.OBJECT_FLOW__SELECTION :
				return eVirtualGet(UMLPackage.OBJECT_FLOW__SELECTION) != null;
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
		result.append(" (isMulticast: "); //$NON-NLS-1$
		result.append((eFlags & IS_MULTICAST_EFLAG) != 0);
		result.append(", isMultireceive: "); //$NON-NLS-1$
		result.append((eFlags & IS_MULTIRECEIVE_EFLAG) != 0);
		result.append(')');
		return result.toString();
	}

} //ObjectFlowImpl
