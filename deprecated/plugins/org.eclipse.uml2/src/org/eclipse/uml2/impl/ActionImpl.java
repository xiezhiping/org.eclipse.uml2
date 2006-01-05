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
 * $Id: ActionImpl.java,v 1.27 2006/01/05 13:53:10 khussey Exp $
 */
package org.eclipse.uml2.impl;

import java.util.Collection;
import java.util.Iterator;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.uml2.Action;
import org.eclipse.uml2.Activity;
import org.eclipse.uml2.Behavior;
import org.eclipse.uml2.Classifier;
import org.eclipse.uml2.Constraint;
import org.eclipse.uml2.Element;
import org.eclipse.uml2.InputPin;
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
 * An implementation of the model object '<em><b>Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2.impl.ActionImpl#getOutputs <em>Output</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.ActionImpl#getOwnedElements <em>Owned Element</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.ActionImpl#getInputs <em>Input</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.ActionImpl#getEffect <em>Effect</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.ActionImpl#getContext <em>Context</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.ActionImpl#getLocalPreconditions <em>Local Precondition</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.ActionImpl#getLocalPostconditions <em>Local Postcondition</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ActionImpl extends ExecutableNodeImpl implements Action {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) IBM Corporation and others."; //$NON-NLS-1$

	/**
	 * The default value of the '{@link #getEffect() <em>Effect</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEffect()
	 * @generated
	 * @ordered
	 */
	protected static final String EFFECT_EDEFAULT = ""; //$NON-NLS-1$

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return UML2Package.Literals.ACTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEffect() {
		return (String)eVirtualGet(UML2Package.ACTION__EFFECT, EFFECT_EDEFAULT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEffect(String newEffect) {
		newEffect = newEffect == null ? EFFECT_EDEFAULT : newEffect;
		String effect = newEffect;
		Object oldEffect = eVirtualSet(UML2Package.ACTION__EFFECT, effect);
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2Package.ACTION__EFFECT, oldEffect == EVIRTUAL_NO_VALUE ? EFFECT_EDEFAULT : oldEffect, effect));

	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getOutputs() {
		EList output = (EList)eVirtualGet(UML2Package.ACTION__OUTPUT);
		if (output == null) {
			eVirtualSet(UML2Package.ACTION__OUTPUT, output = new DerivedUnionEObjectEList(OutputPin.class, this, UML2Package.ACTION__OUTPUT, null));
		}
		return output;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOutputs() {
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
    public OutputPin getOutput(String name) {
		for (Iterator i = getOutputs().iterator(); i.hasNext(); ) {
			OutputPin output = (OutputPin) i.next();
			if (name.equals(output.getName())) {
				return output;
			}
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getOwnedElements() {
		EList ownedElement = (EList)eVirtualGet(UML2Package.ACTION__OWNED_ELEMENT);
		if (ownedElement == null) {
			eVirtualSet(UML2Package.ACTION__OWNED_ELEMENT, ownedElement = new DerivedUnionEObjectEList(Element.class, this, UML2Package.ACTION__OWNED_ELEMENT, new int[] {UML2Package.ACTION__OWNED_COMMENT, UML2Package.ACTION__TEMPLATE_BINDING, UML2Package.ACTION__OWNED_TEMPLATE_SIGNATURE, UML2Package.ACTION__NAME_EXPRESSION, UML2Package.ACTION__HANDLER, UML2Package.ACTION__OUTPUT, UML2Package.ACTION__INPUT, UML2Package.ACTION__LOCAL_PRECONDITION, UML2Package.ACTION__LOCAL_POSTCONDITION}));
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
			|| isSetOutputs()
			|| isSetInputs()
			|| eIsSet(UML2Package.ACTION__LOCAL_PRECONDITION)
			|| eIsSet(UML2Package.ACTION__LOCAL_POSTCONDITION);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getInputs() {
		EList input = (EList)eVirtualGet(UML2Package.ACTION__INPUT);
		if (input == null) {
			eVirtualSet(UML2Package.ACTION__INPUT, input = new DerivedUnionEObjectEList(InputPin.class, this, UML2Package.ACTION__INPUT, null));
		}
		return input;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetInputs() {
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
    public InputPin getInput(String name) {
		for (Iterator i = getInputs().iterator(); i.hasNext(); ) {
			InputPin input = (InputPin) i.next();
			if (name.equals(input.getName())) {
				return input;
			}
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Classifier getContext() {
		return eInternalContainer() instanceof Behavior ? ((Behavior) eContainer()).getContext() : null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getLocalPreconditions() {
		EList localPrecondition = (EList)eVirtualGet(UML2Package.ACTION__LOCAL_PRECONDITION);
		if (localPrecondition == null) {
			eVirtualSet(UML2Package.ACTION__LOCAL_PRECONDITION, localPrecondition = new EObjectContainmentEList(Constraint.class, this, UML2Package.ACTION__LOCAL_PRECONDITION));
		}
		return localPrecondition;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
    public Constraint getLocalPrecondition(String name) {
		for (Iterator i = getLocalPreconditions().iterator(); i.hasNext(); ) {
			Constraint localPrecondition = (Constraint) i.next();
			if (name.equals(localPrecondition.getName())) {
				return localPrecondition;
			}
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Constraint createLocalPrecondition(EClass eClass) {
		Constraint newLocalPrecondition = (Constraint) eClass.getEPackage().getEFactoryInstance().create(eClass);
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, 0, UML2Package.ACTION__LOCAL_PRECONDITION, null, newLocalPrecondition));
		}
		getLocalPreconditions().add(newLocalPrecondition);
		return newLocalPrecondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Constraint createLocalPrecondition() {
		Constraint newLocalPrecondition = UML2Factory.eINSTANCE.createConstraint();
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, 0, UML2Package.ACTION__LOCAL_PRECONDITION, null, newLocalPrecondition));
		}
		getLocalPreconditions().add(newLocalPrecondition);
		return newLocalPrecondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getLocalPostconditions() {
		EList localPostcondition = (EList)eVirtualGet(UML2Package.ACTION__LOCAL_POSTCONDITION);
		if (localPostcondition == null) {
			eVirtualSet(UML2Package.ACTION__LOCAL_POSTCONDITION, localPostcondition = new EObjectContainmentEList(Constraint.class, this, UML2Package.ACTION__LOCAL_POSTCONDITION));
		}
		return localPostcondition;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
    public Constraint getLocalPostcondition(String name) {
		for (Iterator i = getLocalPostconditions().iterator(); i.hasNext(); ) {
			Constraint localPostcondition = (Constraint) i.next();
			if (name.equals(localPostcondition.getName())) {
				return localPostcondition;
			}
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UML2Package.ACTION__EANNOTATIONS:
				return ((InternalEList)getEAnnotations()).basicRemove(otherEnd, msgs);
			case UML2Package.ACTION__OWNED_COMMENT:
				return ((InternalEList)getOwnedComments()).basicRemove(otherEnd, msgs);
			case UML2Package.ACTION__TEMPLATE_BINDING:
				return ((InternalEList)getTemplateBindings()).basicRemove(otherEnd, msgs);
			case UML2Package.ACTION__OWNED_TEMPLATE_SIGNATURE:
				return basicSetOwnedTemplateSignature(null, msgs);
			case UML2Package.ACTION__CLIENT_DEPENDENCY:
				return ((InternalEList)getClientDependencies()).basicRemove(otherEnd, msgs);
			case UML2Package.ACTION__NAME_EXPRESSION:
				return basicSetNameExpression(null, msgs);
			case UML2Package.ACTION__OUTGOING:
				return ((InternalEList)getOutgoings()).basicRemove(otherEnd, msgs);
			case UML2Package.ACTION__INCOMING:
				return ((InternalEList)getIncomings()).basicRemove(otherEnd, msgs);
			case UML2Package.ACTION__ACTIVITY:
				return eBasicSetContainer(null, UML2Package.ACTION__ACTIVITY, msgs);
			case UML2Package.ACTION__IN_STRUCTURED_NODE:
				return eBasicSetContainer(null, UML2Package.ACTION__IN_STRUCTURED_NODE, msgs);
			case UML2Package.ACTION__IN_PARTITION:
				return ((InternalEList)getInPartitions()).basicRemove(otherEnd, msgs);
			case UML2Package.ACTION__IN_INTERRUPTIBLE_REGION:
				return ((InternalEList)getInInterruptibleRegions()).basicRemove(otherEnd, msgs);
			case UML2Package.ACTION__HANDLER:
				return ((InternalEList)getHandlers()).basicRemove(otherEnd, msgs);
			case UML2Package.ACTION__LOCAL_PRECONDITION:
				return ((InternalEList)getLocalPreconditions()).basicRemove(otherEnd, msgs);
			case UML2Package.ACTION__LOCAL_POSTCONDITION:
				return ((InternalEList)getLocalPostconditions()).basicRemove(otherEnd, msgs);
		}
		return eDynamicInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Constraint createLocalPostcondition(EClass eClass) {
		Constraint newLocalPostcondition = (Constraint) eClass.getEPackage().getEFactoryInstance().create(eClass);
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, 0, UML2Package.ACTION__LOCAL_POSTCONDITION, null, newLocalPostcondition));
		}
		getLocalPostconditions().add(newLocalPostcondition);
		return newLocalPostcondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Constraint createLocalPostcondition() {
		Constraint newLocalPostcondition = UML2Factory.eINSTANCE.createConstraint();
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, 0, UML2Package.ACTION__LOCAL_POSTCONDITION, null, newLocalPostcondition));
		}
		getLocalPostconditions().add(newLocalPostcondition);
		return newLocalPostcondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UML2Package.ACTION__EANNOTATIONS:
				return getEAnnotations();
			case UML2Package.ACTION__OWNED_ELEMENT:
				return getOwnedElements();
			case UML2Package.ACTION__OWNER:
				if (resolve) return getOwner();
				return basicGetOwner();
			case UML2Package.ACTION__OWNED_COMMENT:
				return getOwnedComments();
			case UML2Package.ACTION__TEMPLATE_BINDING:
				return getTemplateBindings();
			case UML2Package.ACTION__OWNED_TEMPLATE_SIGNATURE:
				return getOwnedTemplateSignature();
			case UML2Package.ACTION__NAME:
				return getName();
			case UML2Package.ACTION__QUALIFIED_NAME:
				return getQualifiedName();
			case UML2Package.ACTION__VISIBILITY:
				return getVisibility();
			case UML2Package.ACTION__CLIENT_DEPENDENCY:
				return getClientDependencies();
			case UML2Package.ACTION__NAME_EXPRESSION:
				return getNameExpression();
			case UML2Package.ACTION__REDEFINITION_CONTEXT:
				return getRedefinitionContexts();
			case UML2Package.ACTION__IS_LEAF:
				return isLeaf() ? Boolean.TRUE : Boolean.FALSE;
			case UML2Package.ACTION__OUTGOING:
				return getOutgoings();
			case UML2Package.ACTION__INCOMING:
				return getIncomings();
			case UML2Package.ACTION__IN_GROUP:
				return getInGroups();
			case UML2Package.ACTION__ACTIVITY:
				return getActivity();
			case UML2Package.ACTION__REDEFINED_ELEMENT:
				return getRedefinedElements();
			case UML2Package.ACTION__IN_STRUCTURED_NODE:
				return getInStructuredNode();
			case UML2Package.ACTION__IN_PARTITION:
				return getInPartitions();
			case UML2Package.ACTION__IN_INTERRUPTIBLE_REGION:
				return getInInterruptibleRegions();
			case UML2Package.ACTION__HANDLER:
				return getHandlers();
			case UML2Package.ACTION__EFFECT:
				return getEffect();
			case UML2Package.ACTION__OUTPUT:
				return getOutputs();
			case UML2Package.ACTION__INPUT:
				return getInputs();
			case UML2Package.ACTION__CONTEXT:
				return getContext();
			case UML2Package.ACTION__LOCAL_PRECONDITION:
				return getLocalPreconditions();
			case UML2Package.ACTION__LOCAL_POSTCONDITION:
				return getLocalPostconditions();
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
			case UML2Package.ACTION__EANNOTATIONS:
				getEAnnotations().clear();
				getEAnnotations().addAll((Collection)newValue);
				return;
			case UML2Package.ACTION__OWNED_COMMENT:
				getOwnedComments().clear();
				getOwnedComments().addAll((Collection)newValue);
				return;
			case UML2Package.ACTION__TEMPLATE_BINDING:
				getTemplateBindings().clear();
				getTemplateBindings().addAll((Collection)newValue);
				return;
			case UML2Package.ACTION__OWNED_TEMPLATE_SIGNATURE:
				setOwnedTemplateSignature((TemplateSignature)newValue);
				return;
			case UML2Package.ACTION__NAME:
				setName((String)newValue);
				return;
			case UML2Package.ACTION__VISIBILITY:
				setVisibility((VisibilityKind)newValue);
				return;
			case UML2Package.ACTION__CLIENT_DEPENDENCY:
				getClientDependencies().clear();
				getClientDependencies().addAll((Collection)newValue);
				return;
			case UML2Package.ACTION__NAME_EXPRESSION:
				setNameExpression((StringExpression)newValue);
				return;
			case UML2Package.ACTION__IS_LEAF:
				setIsLeaf(((Boolean)newValue).booleanValue());
				return;
			case UML2Package.ACTION__OUTGOING:
				getOutgoings().clear();
				getOutgoings().addAll((Collection)newValue);
				return;
			case UML2Package.ACTION__INCOMING:
				getIncomings().clear();
				getIncomings().addAll((Collection)newValue);
				return;
			case UML2Package.ACTION__ACTIVITY:
				setActivity((Activity)newValue);
				return;
			case UML2Package.ACTION__REDEFINED_ELEMENT:
				getRedefinedElements().clear();
				getRedefinedElements().addAll((Collection)newValue);
				return;
			case UML2Package.ACTION__IN_STRUCTURED_NODE:
				setInStructuredNode((StructuredActivityNode)newValue);
				return;
			case UML2Package.ACTION__IN_PARTITION:
				getInPartitions().clear();
				getInPartitions().addAll((Collection)newValue);
				return;
			case UML2Package.ACTION__IN_INTERRUPTIBLE_REGION:
				getInInterruptibleRegions().clear();
				getInInterruptibleRegions().addAll((Collection)newValue);
				return;
			case UML2Package.ACTION__HANDLER:
				getHandlers().clear();
				getHandlers().addAll((Collection)newValue);
				return;
			case UML2Package.ACTION__EFFECT:
				setEffect((String)newValue);
				return;
			case UML2Package.ACTION__LOCAL_PRECONDITION:
				getLocalPreconditions().clear();
				getLocalPreconditions().addAll((Collection)newValue);
				return;
			case UML2Package.ACTION__LOCAL_POSTCONDITION:
				getLocalPostconditions().clear();
				getLocalPostconditions().addAll((Collection)newValue);
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
			case UML2Package.ACTION__EANNOTATIONS:
				getEAnnotations().clear();
				return;
			case UML2Package.ACTION__OWNED_COMMENT:
				getOwnedComments().clear();
				return;
			case UML2Package.ACTION__TEMPLATE_BINDING:
				getTemplateBindings().clear();
				return;
			case UML2Package.ACTION__OWNED_TEMPLATE_SIGNATURE:
				setOwnedTemplateSignature((TemplateSignature)null);
				return;
			case UML2Package.ACTION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case UML2Package.ACTION__VISIBILITY:
				setVisibility(VISIBILITY_EDEFAULT);
				return;
			case UML2Package.ACTION__CLIENT_DEPENDENCY:
				getClientDependencies().clear();
				return;
			case UML2Package.ACTION__NAME_EXPRESSION:
				setNameExpression((StringExpression)null);
				return;
			case UML2Package.ACTION__IS_LEAF:
				setIsLeaf(IS_LEAF_EDEFAULT);
				return;
			case UML2Package.ACTION__OUTGOING:
				getOutgoings().clear();
				return;
			case UML2Package.ACTION__INCOMING:
				getIncomings().clear();
				return;
			case UML2Package.ACTION__ACTIVITY:
				setActivity((Activity)null);
				return;
			case UML2Package.ACTION__REDEFINED_ELEMENT:
				getRedefinedElements().clear();
				return;
			case UML2Package.ACTION__IN_STRUCTURED_NODE:
				setInStructuredNode((StructuredActivityNode)null);
				return;
			case UML2Package.ACTION__IN_PARTITION:
				getInPartitions().clear();
				return;
			case UML2Package.ACTION__IN_INTERRUPTIBLE_REGION:
				getInInterruptibleRegions().clear();
				return;
			case UML2Package.ACTION__HANDLER:
				getHandlers().clear();
				return;
			case UML2Package.ACTION__EFFECT:
				setEffect(EFFECT_EDEFAULT);
				return;
			case UML2Package.ACTION__LOCAL_PRECONDITION:
				getLocalPreconditions().clear();
				return;
			case UML2Package.ACTION__LOCAL_POSTCONDITION:
				getLocalPostconditions().clear();
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
			case UML2Package.ACTION__EANNOTATIONS:
				EList eAnnotations = (EList)eVirtualGet(UML2Package.ACTION__EANNOTATIONS);
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UML2Package.ACTION__OWNED_ELEMENT:
				return isSetOwnedElements();
			case UML2Package.ACTION__OWNER:
				return isSetOwner();
			case UML2Package.ACTION__OWNED_COMMENT:
				EList ownedComment = (EList)eVirtualGet(UML2Package.ACTION__OWNED_COMMENT);
				return ownedComment != null && !ownedComment.isEmpty();
			case UML2Package.ACTION__TEMPLATE_BINDING:
				EList templateBinding = (EList)eVirtualGet(UML2Package.ACTION__TEMPLATE_BINDING);
				return templateBinding != null && !templateBinding.isEmpty();
			case UML2Package.ACTION__OWNED_TEMPLATE_SIGNATURE:
				return eVirtualGet(UML2Package.ACTION__OWNED_TEMPLATE_SIGNATURE) != null;
			case UML2Package.ACTION__NAME:
				String name = (String)eVirtualGet(UML2Package.ACTION__NAME, NAME_EDEFAULT);
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case UML2Package.ACTION__QUALIFIED_NAME:
				return QUALIFIED_NAME_EDEFAULT == null ? getQualifiedName() != null : !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case UML2Package.ACTION__VISIBILITY:
				return eVirtualGet(UML2Package.ACTION__VISIBILITY, VISIBILITY_EDEFAULT) != VISIBILITY_EDEFAULT;
			case UML2Package.ACTION__CLIENT_DEPENDENCY:
				EList clientDependency = (EList)eVirtualGet(UML2Package.ACTION__CLIENT_DEPENDENCY);
				return clientDependency != null && !clientDependency.isEmpty();
			case UML2Package.ACTION__NAME_EXPRESSION:
				return eVirtualGet(UML2Package.ACTION__NAME_EXPRESSION) != null;
			case UML2Package.ACTION__REDEFINITION_CONTEXT:
				return isSetRedefinitionContexts();
			case UML2Package.ACTION__IS_LEAF:
				return ((eFlags & IS_LEAF_EFLAG) != 0) != IS_LEAF_EDEFAULT;
			case UML2Package.ACTION__OUTGOING:
				EList outgoing = (EList)eVirtualGet(UML2Package.ACTION__OUTGOING);
				return outgoing != null && !outgoing.isEmpty();
			case UML2Package.ACTION__INCOMING:
				EList incoming = (EList)eVirtualGet(UML2Package.ACTION__INCOMING);
				return incoming != null && !incoming.isEmpty();
			case UML2Package.ACTION__IN_GROUP:
				return isSetInGroups();
			case UML2Package.ACTION__ACTIVITY:
				return getActivity() != null;
			case UML2Package.ACTION__REDEFINED_ELEMENT:
				return isSetRedefinedElements();
			case UML2Package.ACTION__IN_STRUCTURED_NODE:
				return getInStructuredNode() != null;
			case UML2Package.ACTION__IN_PARTITION:
				EList inPartition = (EList)eVirtualGet(UML2Package.ACTION__IN_PARTITION);
				return inPartition != null && !inPartition.isEmpty();
			case UML2Package.ACTION__IN_INTERRUPTIBLE_REGION:
				EList inInterruptibleRegion = (EList)eVirtualGet(UML2Package.ACTION__IN_INTERRUPTIBLE_REGION);
				return inInterruptibleRegion != null && !inInterruptibleRegion.isEmpty();
			case UML2Package.ACTION__HANDLER:
				EList handler = (EList)eVirtualGet(UML2Package.ACTION__HANDLER);
				return handler != null && !handler.isEmpty();
			case UML2Package.ACTION__EFFECT:
				String effect = (String)eVirtualGet(UML2Package.ACTION__EFFECT, EFFECT_EDEFAULT);
				return EFFECT_EDEFAULT == null ? effect != null : !EFFECT_EDEFAULT.equals(effect);
			case UML2Package.ACTION__OUTPUT:
				return isSetOutputs();
			case UML2Package.ACTION__INPUT:
				return isSetInputs();
			case UML2Package.ACTION__CONTEXT:
				return getContext() != null;
			case UML2Package.ACTION__LOCAL_PRECONDITION:
				EList localPrecondition = (EList)eVirtualGet(UML2Package.ACTION__LOCAL_PRECONDITION);
				return localPrecondition != null && !localPrecondition.isEmpty();
			case UML2Package.ACTION__LOCAL_POSTCONDITION:
				EList localPostcondition = (EList)eVirtualGet(UML2Package.ACTION__LOCAL_POSTCONDITION);
				return localPostcondition != null && !localPostcondition.isEmpty();
		}
		return eDynamicIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (effect: "); //$NON-NLS-1$
		result.append(eVirtualGet(UML2Package.ACTION__EFFECT, EFFECT_EDEFAULT));
		result.append(')');
		return result.toString();
	}


} //ActionImpl
