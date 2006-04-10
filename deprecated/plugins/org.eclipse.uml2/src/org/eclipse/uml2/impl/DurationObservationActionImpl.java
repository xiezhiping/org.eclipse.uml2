/*
 * Copyright (c) 2003, 2006 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *
 * $Id: DurationObservationActionImpl.java,v 1.23 2006/04/10 20:40:18 khussey Exp $
 */
package org.eclipse.uml2.impl;

import java.util.Collection;
import java.util.Iterator;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.uml2.Activity;
import org.eclipse.uml2.Duration;
import org.eclipse.uml2.DurationObservationAction;
import org.eclipse.uml2.InputPin;
import org.eclipse.uml2.StringExpression;
import org.eclipse.uml2.StructuralFeature;
import org.eclipse.uml2.StructuredActivityNode;
import org.eclipse.uml2.TemplateSignature;
import org.eclipse.uml2.UML2Factory;
import org.eclipse.uml2.UML2Package;
import org.eclipse.uml2.VisibilityKind;
import org.eclipse.uml2.common.util.CacheAdapter;
import org.eclipse.uml2.common.util.DerivedUnionEObjectEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Duration Observation Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2.impl.DurationObservationActionImpl#getDurations <em>Duration</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DurationObservationActionImpl extends WriteStructuralFeatureActionImpl implements DurationObservationAction {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) IBM Corporation and others."; //$NON-NLS-1$

	/**
	 * The cached value of the '{@link #getDurations() <em>Duration</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDurations()
	 * @generated
	 * @ordered
	 */
	protected EList durations = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DurationObservationActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return UML2Package.Literals.DURATION_OBSERVATION_ACTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getDurations() {
		if (durations == null) {
			durations = new EObjectContainmentEList(Duration.class, this, UML2Package.DURATION_OBSERVATION_ACTION__DURATION);
		}
		return durations;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDurations() {
		return durations != null && !durations.isEmpty();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UML2Package.DURATION_OBSERVATION_ACTION__EANNOTATIONS:
				return ((InternalEList)getEAnnotations()).basicRemove(otherEnd, msgs);
			case UML2Package.DURATION_OBSERVATION_ACTION__OWNED_COMMENT:
				return ((InternalEList)getOwnedComments()).basicRemove(otherEnd, msgs);
			case UML2Package.DURATION_OBSERVATION_ACTION__TEMPLATE_BINDING:
				return ((InternalEList)getTemplateBindings()).basicRemove(otherEnd, msgs);
			case UML2Package.DURATION_OBSERVATION_ACTION__OWNED_TEMPLATE_SIGNATURE:
				return basicSetOwnedTemplateSignature(null, msgs);
			case UML2Package.DURATION_OBSERVATION_ACTION__CLIENT_DEPENDENCY:
				return ((InternalEList)getClientDependencies()).basicRemove(otherEnd, msgs);
			case UML2Package.DURATION_OBSERVATION_ACTION__NAME_EXPRESSION:
				return basicSetNameExpression(null, msgs);
			case UML2Package.DURATION_OBSERVATION_ACTION__OUTGOING:
				return ((InternalEList)getOutgoings()).basicRemove(otherEnd, msgs);
			case UML2Package.DURATION_OBSERVATION_ACTION__INCOMING:
				return ((InternalEList)getIncomings()).basicRemove(otherEnd, msgs);
			case UML2Package.DURATION_OBSERVATION_ACTION__ACTIVITY:
				return basicSetActivity(null, msgs);
			case UML2Package.DURATION_OBSERVATION_ACTION__IN_STRUCTURED_NODE:
				return basicSetInStructuredNode(null, msgs);
			case UML2Package.DURATION_OBSERVATION_ACTION__IN_PARTITION:
				return ((InternalEList)getInPartitions()).basicRemove(otherEnd, msgs);
			case UML2Package.DURATION_OBSERVATION_ACTION__IN_INTERRUPTIBLE_REGION:
				return ((InternalEList)getInInterruptibleRegions()).basicRemove(otherEnd, msgs);
			case UML2Package.DURATION_OBSERVATION_ACTION__HANDLER:
				return ((InternalEList)getHandlers()).basicRemove(otherEnd, msgs);
			case UML2Package.DURATION_OBSERVATION_ACTION__LOCAL_PRECONDITION:
				return ((InternalEList)getLocalPreconditions()).basicRemove(otherEnd, msgs);
			case UML2Package.DURATION_OBSERVATION_ACTION__LOCAL_POSTCONDITION:
				return ((InternalEList)getLocalPostconditions()).basicRemove(otherEnd, msgs);
			case UML2Package.DURATION_OBSERVATION_ACTION__OBJECT:
				return basicSetObject(null, msgs);
			case UML2Package.DURATION_OBSERVATION_ACTION__VALUE:
				return basicSetValue(null, msgs);
			case UML2Package.DURATION_OBSERVATION_ACTION__DURATION:
				return ((InternalEList)getDurations()).basicRemove(otherEnd, msgs);
		}
		return eDynamicInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
    public Duration getDuration(String name) {
		return getDuration(name, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Duration getDuration(String name, boolean ignoreCase) {
		durationLoop: for (Iterator i = getDurations().iterator(); i.hasNext(); ) {
			Duration duration = (Duration) i.next();
			if (name != null && !(ignoreCase ? name.equalsIgnoreCase(duration.getName()) : name.equals(duration.getName())))
				continue durationLoop;
			return duration;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 * @deprecated Use #createDuration() instead.
	 */
	public Duration createDuration(EClass eClass) {
		Duration newDuration = (Duration) eClass.getEPackage().getEFactoryInstance().create(eClass);
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, 0, UML2Package.DURATION_OBSERVATION_ACTION__DURATION, null, newDuration));
		}
		getDurations().add(newDuration);
		return newDuration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Duration createDuration() {
		Duration newDuration = UML2Factory.eINSTANCE.createDuration();
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, 0, UML2Package.DURATION_OBSERVATION_ACTION__DURATION, null, newDuration));
		}
		getDurations().add(newDuration);
		return newDuration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputPin getValue() {
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValue(InputPin newValue, NotificationChain msgs) {
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(InputPin newValue) {
		throw new UnsupportedOperationException();
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetValue() {
  		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UML2Package.DURATION_OBSERVATION_ACTION__EANNOTATIONS:
				return getEAnnotations();
			case UML2Package.DURATION_OBSERVATION_ACTION__OWNED_ELEMENT:
				return getOwnedElements();
			case UML2Package.DURATION_OBSERVATION_ACTION__OWNER:
				if (resolve) return getOwner();
				return basicGetOwner();
			case UML2Package.DURATION_OBSERVATION_ACTION__OWNED_COMMENT:
				return getOwnedComments();
			case UML2Package.DURATION_OBSERVATION_ACTION__TEMPLATE_BINDING:
				return getTemplateBindings();
			case UML2Package.DURATION_OBSERVATION_ACTION__OWNED_TEMPLATE_SIGNATURE:
				return getOwnedTemplateSignature();
			case UML2Package.DURATION_OBSERVATION_ACTION__NAME:
				return getName();
			case UML2Package.DURATION_OBSERVATION_ACTION__QUALIFIED_NAME:
				return getQualifiedName();
			case UML2Package.DURATION_OBSERVATION_ACTION__VISIBILITY:
				return getVisibility();
			case UML2Package.DURATION_OBSERVATION_ACTION__CLIENT_DEPENDENCY:
				return getClientDependencies();
			case UML2Package.DURATION_OBSERVATION_ACTION__NAME_EXPRESSION:
				return getNameExpression();
			case UML2Package.DURATION_OBSERVATION_ACTION__REDEFINITION_CONTEXT:
				return getRedefinitionContexts();
			case UML2Package.DURATION_OBSERVATION_ACTION__IS_LEAF:
				return isLeaf() ? Boolean.TRUE : Boolean.FALSE;
			case UML2Package.DURATION_OBSERVATION_ACTION__OUTGOING:
				return getOutgoings();
			case UML2Package.DURATION_OBSERVATION_ACTION__INCOMING:
				return getIncomings();
			case UML2Package.DURATION_OBSERVATION_ACTION__IN_GROUP:
				return getInGroups();
			case UML2Package.DURATION_OBSERVATION_ACTION__ACTIVITY:
				return getActivity();
			case UML2Package.DURATION_OBSERVATION_ACTION__REDEFINED_ELEMENT:
				return getRedefinedElements();
			case UML2Package.DURATION_OBSERVATION_ACTION__IN_STRUCTURED_NODE:
				return getInStructuredNode();
			case UML2Package.DURATION_OBSERVATION_ACTION__IN_PARTITION:
				return getInPartitions();
			case UML2Package.DURATION_OBSERVATION_ACTION__IN_INTERRUPTIBLE_REGION:
				return getInInterruptibleRegions();
			case UML2Package.DURATION_OBSERVATION_ACTION__HANDLER:
				return getHandlers();
			case UML2Package.DURATION_OBSERVATION_ACTION__EFFECT:
				return getEffect();
			case UML2Package.DURATION_OBSERVATION_ACTION__OUTPUT:
				return getOutputs();
			case UML2Package.DURATION_OBSERVATION_ACTION__INPUT:
				return getInputs();
			case UML2Package.DURATION_OBSERVATION_ACTION__CONTEXT:
				return getContext();
			case UML2Package.DURATION_OBSERVATION_ACTION__LOCAL_PRECONDITION:
				return getLocalPreconditions();
			case UML2Package.DURATION_OBSERVATION_ACTION__LOCAL_POSTCONDITION:
				return getLocalPostconditions();
			case UML2Package.DURATION_OBSERVATION_ACTION__STRUCTURAL_FEATURE:
				if (resolve) return getStructuralFeature();
				return basicGetStructuralFeature();
			case UML2Package.DURATION_OBSERVATION_ACTION__OBJECT:
				return getObject();
			case UML2Package.DURATION_OBSERVATION_ACTION__VALUE:
				return getValue();
			case UML2Package.DURATION_OBSERVATION_ACTION__DURATION:
				return getDurations();
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
			case UML2Package.DURATION_OBSERVATION_ACTION__EANNOTATIONS:
				getEAnnotations().clear();
				getEAnnotations().addAll((Collection)newValue);
				return;
			case UML2Package.DURATION_OBSERVATION_ACTION__OWNED_COMMENT:
				getOwnedComments().clear();
				getOwnedComments().addAll((Collection)newValue);
				return;
			case UML2Package.DURATION_OBSERVATION_ACTION__TEMPLATE_BINDING:
				getTemplateBindings().clear();
				getTemplateBindings().addAll((Collection)newValue);
				return;
			case UML2Package.DURATION_OBSERVATION_ACTION__OWNED_TEMPLATE_SIGNATURE:
				setOwnedTemplateSignature((TemplateSignature)newValue);
				return;
			case UML2Package.DURATION_OBSERVATION_ACTION__NAME:
				setName((String)newValue);
				return;
			case UML2Package.DURATION_OBSERVATION_ACTION__VISIBILITY:
				setVisibility((VisibilityKind)newValue);
				return;
			case UML2Package.DURATION_OBSERVATION_ACTION__CLIENT_DEPENDENCY:
				getClientDependencies().clear();
				getClientDependencies().addAll((Collection)newValue);
				return;
			case UML2Package.DURATION_OBSERVATION_ACTION__NAME_EXPRESSION:
				setNameExpression((StringExpression)newValue);
				return;
			case UML2Package.DURATION_OBSERVATION_ACTION__IS_LEAF:
				setIsLeaf(((Boolean)newValue).booleanValue());
				return;
			case UML2Package.DURATION_OBSERVATION_ACTION__OUTGOING:
				getOutgoings().clear();
				getOutgoings().addAll((Collection)newValue);
				return;
			case UML2Package.DURATION_OBSERVATION_ACTION__INCOMING:
				getIncomings().clear();
				getIncomings().addAll((Collection)newValue);
				return;
			case UML2Package.DURATION_OBSERVATION_ACTION__ACTIVITY:
				setActivity((Activity)newValue);
				return;
			case UML2Package.DURATION_OBSERVATION_ACTION__REDEFINED_ELEMENT:
				getRedefinedElements().clear();
				getRedefinedElements().addAll((Collection)newValue);
				return;
			case UML2Package.DURATION_OBSERVATION_ACTION__IN_STRUCTURED_NODE:
				setInStructuredNode((StructuredActivityNode)newValue);
				return;
			case UML2Package.DURATION_OBSERVATION_ACTION__IN_PARTITION:
				getInPartitions().clear();
				getInPartitions().addAll((Collection)newValue);
				return;
			case UML2Package.DURATION_OBSERVATION_ACTION__IN_INTERRUPTIBLE_REGION:
				getInInterruptibleRegions().clear();
				getInInterruptibleRegions().addAll((Collection)newValue);
				return;
			case UML2Package.DURATION_OBSERVATION_ACTION__HANDLER:
				getHandlers().clear();
				getHandlers().addAll((Collection)newValue);
				return;
			case UML2Package.DURATION_OBSERVATION_ACTION__EFFECT:
				setEffect((String)newValue);
				return;
			case UML2Package.DURATION_OBSERVATION_ACTION__LOCAL_PRECONDITION:
				getLocalPreconditions().clear();
				getLocalPreconditions().addAll((Collection)newValue);
				return;
			case UML2Package.DURATION_OBSERVATION_ACTION__LOCAL_POSTCONDITION:
				getLocalPostconditions().clear();
				getLocalPostconditions().addAll((Collection)newValue);
				return;
			case UML2Package.DURATION_OBSERVATION_ACTION__STRUCTURAL_FEATURE:
				setStructuralFeature((StructuralFeature)newValue);
				return;
			case UML2Package.DURATION_OBSERVATION_ACTION__OBJECT:
				setObject((InputPin)newValue);
				return;
			case UML2Package.DURATION_OBSERVATION_ACTION__VALUE:
				setValue((InputPin)newValue);
				return;
			case UML2Package.DURATION_OBSERVATION_ACTION__DURATION:
				getDurations().clear();
				getDurations().addAll((Collection)newValue);
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
			case UML2Package.DURATION_OBSERVATION_ACTION__EANNOTATIONS:
				getEAnnotations().clear();
				return;
			case UML2Package.DURATION_OBSERVATION_ACTION__OWNED_COMMENT:
				getOwnedComments().clear();
				return;
			case UML2Package.DURATION_OBSERVATION_ACTION__TEMPLATE_BINDING:
				getTemplateBindings().clear();
				return;
			case UML2Package.DURATION_OBSERVATION_ACTION__OWNED_TEMPLATE_SIGNATURE:
				setOwnedTemplateSignature((TemplateSignature)null);
				return;
			case UML2Package.DURATION_OBSERVATION_ACTION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case UML2Package.DURATION_OBSERVATION_ACTION__VISIBILITY:
				setVisibility(VISIBILITY_EDEFAULT);
				return;
			case UML2Package.DURATION_OBSERVATION_ACTION__CLIENT_DEPENDENCY:
				getClientDependencies().clear();
				return;
			case UML2Package.DURATION_OBSERVATION_ACTION__NAME_EXPRESSION:
				setNameExpression((StringExpression)null);
				return;
			case UML2Package.DURATION_OBSERVATION_ACTION__IS_LEAF:
				setIsLeaf(IS_LEAF_EDEFAULT);
				return;
			case UML2Package.DURATION_OBSERVATION_ACTION__OUTGOING:
				getOutgoings().clear();
				return;
			case UML2Package.DURATION_OBSERVATION_ACTION__INCOMING:
				getIncomings().clear();
				return;
			case UML2Package.DURATION_OBSERVATION_ACTION__ACTIVITY:
				setActivity((Activity)null);
				return;
			case UML2Package.DURATION_OBSERVATION_ACTION__REDEFINED_ELEMENT:
				getRedefinedElements().clear();
				return;
			case UML2Package.DURATION_OBSERVATION_ACTION__IN_STRUCTURED_NODE:
				setInStructuredNode((StructuredActivityNode)null);
				return;
			case UML2Package.DURATION_OBSERVATION_ACTION__IN_PARTITION:
				getInPartitions().clear();
				return;
			case UML2Package.DURATION_OBSERVATION_ACTION__IN_INTERRUPTIBLE_REGION:
				getInInterruptibleRegions().clear();
				return;
			case UML2Package.DURATION_OBSERVATION_ACTION__HANDLER:
				getHandlers().clear();
				return;
			case UML2Package.DURATION_OBSERVATION_ACTION__EFFECT:
				setEffect(EFFECT_EDEFAULT);
				return;
			case UML2Package.DURATION_OBSERVATION_ACTION__LOCAL_PRECONDITION:
				getLocalPreconditions().clear();
				return;
			case UML2Package.DURATION_OBSERVATION_ACTION__LOCAL_POSTCONDITION:
				getLocalPostconditions().clear();
				return;
			case UML2Package.DURATION_OBSERVATION_ACTION__STRUCTURAL_FEATURE:
				setStructuralFeature((StructuralFeature)null);
				return;
			case UML2Package.DURATION_OBSERVATION_ACTION__OBJECT:
				setObject((InputPin)null);
				return;
			case UML2Package.DURATION_OBSERVATION_ACTION__VALUE:
				setValue((InputPin)null);
				return;
			case UML2Package.DURATION_OBSERVATION_ACTION__DURATION:
				getDurations().clear();
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
			case UML2Package.DURATION_OBSERVATION_ACTION__EANNOTATIONS:
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UML2Package.DURATION_OBSERVATION_ACTION__OWNED_ELEMENT:
				return isSetOwnedElements();
			case UML2Package.DURATION_OBSERVATION_ACTION__OWNER:
				return isSetOwner();
			case UML2Package.DURATION_OBSERVATION_ACTION__OWNED_COMMENT:
				return ownedComments != null && !ownedComments.isEmpty();
			case UML2Package.DURATION_OBSERVATION_ACTION__TEMPLATE_BINDING:
				return templateBindings != null && !templateBindings.isEmpty();
			case UML2Package.DURATION_OBSERVATION_ACTION__OWNED_TEMPLATE_SIGNATURE:
				return ownedTemplateSignature != null;
			case UML2Package.DURATION_OBSERVATION_ACTION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case UML2Package.DURATION_OBSERVATION_ACTION__QUALIFIED_NAME:
				return QUALIFIED_NAME_EDEFAULT == null ? getQualifiedName() != null : !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case UML2Package.DURATION_OBSERVATION_ACTION__VISIBILITY:
				return visibility != VISIBILITY_EDEFAULT;
			case UML2Package.DURATION_OBSERVATION_ACTION__CLIENT_DEPENDENCY:
				return clientDependencies != null && !clientDependencies.isEmpty();
			case UML2Package.DURATION_OBSERVATION_ACTION__NAME_EXPRESSION:
				return nameExpression != null;
			case UML2Package.DURATION_OBSERVATION_ACTION__REDEFINITION_CONTEXT:
				return isSetRedefinitionContexts();
			case UML2Package.DURATION_OBSERVATION_ACTION__IS_LEAF:
				return ((eFlags & IS_LEAF_EFLAG) != 0) != IS_LEAF_EDEFAULT;
			case UML2Package.DURATION_OBSERVATION_ACTION__OUTGOING:
				return outgoings != null && !outgoings.isEmpty();
			case UML2Package.DURATION_OBSERVATION_ACTION__INCOMING:
				return incomings != null && !incomings.isEmpty();
			case UML2Package.DURATION_OBSERVATION_ACTION__IN_GROUP:
				return isSetInGroups();
			case UML2Package.DURATION_OBSERVATION_ACTION__ACTIVITY:
				return getActivity() != null;
			case UML2Package.DURATION_OBSERVATION_ACTION__REDEFINED_ELEMENT:
				return isSetRedefinedElements();
			case UML2Package.DURATION_OBSERVATION_ACTION__IN_STRUCTURED_NODE:
				return getInStructuredNode() != null;
			case UML2Package.DURATION_OBSERVATION_ACTION__IN_PARTITION:
				return inPartitions != null && !inPartitions.isEmpty();
			case UML2Package.DURATION_OBSERVATION_ACTION__IN_INTERRUPTIBLE_REGION:
				return inInterruptibleRegions != null && !inInterruptibleRegions.isEmpty();
			case UML2Package.DURATION_OBSERVATION_ACTION__HANDLER:
				return handlers != null && !handlers.isEmpty();
			case UML2Package.DURATION_OBSERVATION_ACTION__EFFECT:
				return EFFECT_EDEFAULT == null ? effect != null : !EFFECT_EDEFAULT.equals(effect);
			case UML2Package.DURATION_OBSERVATION_ACTION__OUTPUT:
				return isSetOutputs();
			case UML2Package.DURATION_OBSERVATION_ACTION__INPUT:
				return isSetInputs();
			case UML2Package.DURATION_OBSERVATION_ACTION__CONTEXT:
				return getContext() != null;
			case UML2Package.DURATION_OBSERVATION_ACTION__LOCAL_PRECONDITION:
				return localPreconditions != null && !localPreconditions.isEmpty();
			case UML2Package.DURATION_OBSERVATION_ACTION__LOCAL_POSTCONDITION:
				return localPostconditions != null && !localPostconditions.isEmpty();
			case UML2Package.DURATION_OBSERVATION_ACTION__STRUCTURAL_FEATURE:
				return structuralFeature != null;
			case UML2Package.DURATION_OBSERVATION_ACTION__OBJECT:
				return object != null;
			case UML2Package.DURATION_OBSERVATION_ACTION__VALUE:
				return isSetValue();
			case UML2Package.DURATION_OBSERVATION_ACTION__DURATION:
				return isSetDurations();
		}
		return eDynamicIsSet(featureID);
	}


	/**
	 * The array of subset feature identifiers for the '{@link #getInputs() <em>Input</em>}' reference list.
	 * @see #getInputs()
	 */
	protected static final int[] INPUT_ESUBSETS = new int[] {UML2Package.DURATION_OBSERVATION_ACTION__OBJECT, UML2Package.DURATION_OBSERVATION_ACTION__DURATION};

	public EList getInputs() {
		CacheAdapter cache = getCacheAdapter();
		if (cache != null) {
			Resource eResource = eResource();
			EList input = (EList) cache.get(eResource, this, UML2Package.Literals.ACTION__INPUT);
			if (input == null) {
				cache.put(eResource, this, UML2Package.Literals.ACTION__INPUT, input = new DerivedUnionEObjectEList(InputPin.class, this, UML2Package.DURATION_OBSERVATION_ACTION__INPUT, INPUT_ESUBSETS));
			}
			return input;
		}
		return new DerivedUnionEObjectEList(InputPin.class, this, UML2Package.DURATION_OBSERVATION_ACTION__INPUT, INPUT_ESUBSETS);
	}

} //DurationObservationActionImpl
