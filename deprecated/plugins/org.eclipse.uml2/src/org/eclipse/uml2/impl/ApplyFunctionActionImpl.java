/*
 * Copyright (c) 2003, 2004 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *
 * $Id: ApplyFunctionActionImpl.java,v 1.9 2005/04/04 20:11:13 khussey Exp $
 */
package org.eclipse.uml2.impl;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EcoreEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.uml2.Activity;
import org.eclipse.uml2.ApplyFunctionAction;
import org.eclipse.uml2.InputPin;
import org.eclipse.uml2.OutputPin;
import org.eclipse.uml2.PrimitiveFunction;
import org.eclipse.uml2.StringExpression;
import org.eclipse.uml2.StructuredActivityNode;
import org.eclipse.uml2.TemplateSignature;
import org.eclipse.uml2.UML2Package;
import org.eclipse.uml2.VisibilityKind;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Apply Function Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2.impl.ApplyFunctionActionImpl#getFunction <em>Function</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.ApplyFunctionActionImpl#getArguments <em>Argument</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.ApplyFunctionActionImpl#getResults <em>Result</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ApplyFunctionActionImpl extends ActionImpl implements ApplyFunctionAction {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2003, 2005 IBM Corporation and others."; //$NON-NLS-1$

	/**
	 * The cached value of the '{@link #getFunction() <em>Function</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFunction()
	 * @generated
	 * @ordered
	 */
	protected PrimitiveFunction function = null;

	/**
	 * The cached value of the '{@link #getArguments() <em>Argument</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArguments()
	 * @generated
	 * @ordered
	 */
	protected EList argument = null;

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
	protected ApplyFunctionActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return UML2Package.eINSTANCE.getApplyFunctionAction();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrimitiveFunction getFunction() {
		if (function != null && function.eIsProxy()) {
			PrimitiveFunction oldFunction = function;
			function = (PrimitiveFunction)eResolveProxy((InternalEObject)function);
			if (function != oldFunction) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UML2Package.APPLY_FUNCTION_ACTION__FUNCTION, oldFunction, function));
			}
		}
		return function;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrimitiveFunction basicGetFunction() {
		return function;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFunction(PrimitiveFunction newFunction) {
		PrimitiveFunction oldFunction = function;
		function = newFunction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2Package.APPLY_FUNCTION_ACTION__FUNCTION, oldFunction, function));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getArguments() {
		if (argument == null) {
			argument = new EObjectContainmentEList(InputPin.class, this, UML2Package.APPLY_FUNCTION_ACTION__ARGUMENT);
		}
		return argument;
	}

    /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
     */
    public InputPin getArgument(String unqualifiedName) {
    	for (Iterator i = getArguments().iterator(); i.hasNext(); ) {
    		InputPin namedArgument = (InputPin) i.next();
    		
    		if (unqualifiedName.equals(namedArgument.getName())) {
    			return namedArgument;
    		}
    	}
    	
    	return null;
    }
      
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputPin createArgument(EClass eClass) {
		InputPin newArgument = (InputPin) eClass.getEPackage().getEFactoryInstance().create(eClass);
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, 0, UML2Package.APPLY_FUNCTION_ACTION__ARGUMENT, null, newArgument));
		}
		getArguments().add(newArgument);
		return newArgument;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getResults() {
		if (result == null) {
			result = new EObjectContainmentEList(OutputPin.class, this, UML2Package.APPLY_FUNCTION_ACTION__RESULT);
		}
		return result;
	}

    /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
     */
    public OutputPin getResult(String unqualifiedName) {
    	for (Iterator i = getResults().iterator(); i.hasNext(); ) {
    		OutputPin namedResult = (OutputPin) i.next();
    		
    		if (unqualifiedName.equals(namedResult.getName())) {
    			return namedResult;
    		}
    	}
    	
    	return null;
    }
      
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutputPin createResult(EClass eClass) {
		OutputPin newResult = (OutputPin) eClass.getEPackage().getEFactoryInstance().create(eClass);
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, 0, UML2Package.APPLY_FUNCTION_ACTION__RESULT, null, newResult));
		}
		getResults().add(newResult);
		return newResult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getInputs() {
		EList input = (EList) getCacheAdapter().get(this, UML2Package.eINSTANCE.getAction_Input());

		if (null == input) {
			Set union = new LinkedHashSet();
			union.addAll(super.getInputs());
			union.addAll(getArguments());

			input = new EcoreEList.UnmodifiableEList(this, UML2Package.eINSTANCE.getAction_Input(), union.size(), union.toArray());
			getCacheAdapter().put(this, UML2Package.eINSTANCE.getAction_Input(), input);
		}

		return input;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getOutputs() {
		EList output = (EList) getCacheAdapter().get(this, UML2Package.eINSTANCE.getAction_Output());

		if (null == output) {
			Set union = new LinkedHashSet();
			union.addAll(super.getOutputs());
			union.addAll(getResults());

			output = new EcoreEList.UnmodifiableEList(this, UML2Package.eINSTANCE.getAction_Output(), union.size(), union.toArray());
			getCacheAdapter().put(this, UML2Package.eINSTANCE.getAction_Output(), output);
		}

		return output;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, Class baseClass, NotificationChain msgs) {
		if (featureID >= 0) {
			switch (eDerivedStructuralFeatureID(featureID, baseClass)) {
				case UML2Package.APPLY_FUNCTION_ACTION__EANNOTATIONS:
					return ((InternalEList)getEAnnotations()).basicAdd(otherEnd, msgs);
				case UML2Package.APPLY_FUNCTION_ACTION__TEMPLATE_BINDING:
					return ((InternalEList)getTemplateBindings()).basicAdd(otherEnd, msgs);
				case UML2Package.APPLY_FUNCTION_ACTION__OWNED_TEMPLATE_SIGNATURE:
					if (ownedTemplateSignature != null)
						msgs = ((InternalEObject)ownedTemplateSignature).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UML2Package.APPLY_FUNCTION_ACTION__OWNED_TEMPLATE_SIGNATURE, null, msgs);
					return basicSetOwnedTemplateSignature((TemplateSignature)otherEnd, msgs);
				case UML2Package.APPLY_FUNCTION_ACTION__CLIENT_DEPENDENCY:
					return ((InternalEList)getClientDependencies()).basicAdd(otherEnd, msgs);
				case UML2Package.APPLY_FUNCTION_ACTION__OUTGOING:
					return ((InternalEList)getOutgoings()).basicAdd(otherEnd, msgs);
				case UML2Package.APPLY_FUNCTION_ACTION__INCOMING:
					return ((InternalEList)getIncomings()).basicAdd(otherEnd, msgs);
				case UML2Package.APPLY_FUNCTION_ACTION__ACTIVITY:
					if (eContainer != null)
						msgs = eBasicRemoveFromContainer(msgs);
					return eBasicSetContainer(otherEnd, UML2Package.APPLY_FUNCTION_ACTION__ACTIVITY, msgs);
				case UML2Package.APPLY_FUNCTION_ACTION__IN_STRUCTURED_NODE:
					if (eContainer != null)
						msgs = eBasicRemoveFromContainer(msgs);
					return eBasicSetContainer(otherEnd, UML2Package.APPLY_FUNCTION_ACTION__IN_STRUCTURED_NODE, msgs);
				case UML2Package.APPLY_FUNCTION_ACTION__IN_PARTITION:
					return ((InternalEList)getInPartitions()).basicAdd(otherEnd, msgs);
				case UML2Package.APPLY_FUNCTION_ACTION__IN_INTERRUPTIBLE_REGION:
					return ((InternalEList)getInInterruptibleRegions()).basicAdd(otherEnd, msgs);
				case UML2Package.APPLY_FUNCTION_ACTION__HANDLER:
					return ((InternalEList)getHandlers()).basicAdd(otherEnd, msgs);
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
				case UML2Package.APPLY_FUNCTION_ACTION__EANNOTATIONS:
					return ((InternalEList)getEAnnotations()).basicRemove(otherEnd, msgs);
				case UML2Package.APPLY_FUNCTION_ACTION__OWNED_COMMENT:
					return ((InternalEList)getOwnedComments()).basicRemove(otherEnd, msgs);
				case UML2Package.APPLY_FUNCTION_ACTION__TEMPLATE_BINDING:
					return ((InternalEList)getTemplateBindings()).basicRemove(otherEnd, msgs);
				case UML2Package.APPLY_FUNCTION_ACTION__OWNED_TEMPLATE_SIGNATURE:
					return basicSetOwnedTemplateSignature(null, msgs);
				case UML2Package.APPLY_FUNCTION_ACTION__CLIENT_DEPENDENCY:
					return ((InternalEList)getClientDependencies()).basicRemove(otherEnd, msgs);
				case UML2Package.APPLY_FUNCTION_ACTION__NAME_EXPRESSION:
					return basicSetNameExpression(null, msgs);
				case UML2Package.APPLY_FUNCTION_ACTION__OUTGOING:
					return ((InternalEList)getOutgoings()).basicRemove(otherEnd, msgs);
				case UML2Package.APPLY_FUNCTION_ACTION__INCOMING:
					return ((InternalEList)getIncomings()).basicRemove(otherEnd, msgs);
				case UML2Package.APPLY_FUNCTION_ACTION__ACTIVITY:
					return eBasicSetContainer(null, UML2Package.APPLY_FUNCTION_ACTION__ACTIVITY, msgs);
				case UML2Package.APPLY_FUNCTION_ACTION__IN_STRUCTURED_NODE:
					return eBasicSetContainer(null, UML2Package.APPLY_FUNCTION_ACTION__IN_STRUCTURED_NODE, msgs);
				case UML2Package.APPLY_FUNCTION_ACTION__IN_PARTITION:
					return ((InternalEList)getInPartitions()).basicRemove(otherEnd, msgs);
				case UML2Package.APPLY_FUNCTION_ACTION__IN_INTERRUPTIBLE_REGION:
					return ((InternalEList)getInInterruptibleRegions()).basicRemove(otherEnd, msgs);
				case UML2Package.APPLY_FUNCTION_ACTION__HANDLER:
					return ((InternalEList)getHandlers()).basicRemove(otherEnd, msgs);
				case UML2Package.APPLY_FUNCTION_ACTION__LOCAL_PRECONDITION:
					return ((InternalEList)getLocalPreconditions()).basicRemove(otherEnd, msgs);
				case UML2Package.APPLY_FUNCTION_ACTION__LOCAL_POSTCONDITION:
					return ((InternalEList)getLocalPostconditions()).basicRemove(otherEnd, msgs);
				case UML2Package.APPLY_FUNCTION_ACTION__ARGUMENT:
					return ((InternalEList)getArguments()).basicRemove(otherEnd, msgs);
				case UML2Package.APPLY_FUNCTION_ACTION__RESULT:
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
	public NotificationChain eBasicRemoveFromContainer(NotificationChain msgs) {
		if (eContainerFeatureID >= 0) {
			switch (eContainerFeatureID) {
				case UML2Package.APPLY_FUNCTION_ACTION__ACTIVITY:
					return eContainer.eInverseRemove(this, UML2Package.ACTIVITY__NODE, Activity.class, msgs);
				case UML2Package.APPLY_FUNCTION_ACTION__IN_STRUCTURED_NODE:
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
			case UML2Package.APPLY_FUNCTION_ACTION__EANNOTATIONS:
				return getEAnnotations();
			case UML2Package.APPLY_FUNCTION_ACTION__OWNED_ELEMENT:
				return getOwnedElements();
			case UML2Package.APPLY_FUNCTION_ACTION__OWNER:
				if (resolve) return getOwner();
				return basicGetOwner();
			case UML2Package.APPLY_FUNCTION_ACTION__OWNED_COMMENT:
				return getOwnedComments();
			case UML2Package.APPLY_FUNCTION_ACTION__TEMPLATE_BINDING:
				return getTemplateBindings();
			case UML2Package.APPLY_FUNCTION_ACTION__OWNED_TEMPLATE_SIGNATURE:
				return getOwnedTemplateSignature();
			case UML2Package.APPLY_FUNCTION_ACTION__NAME:
				return getName();
			case UML2Package.APPLY_FUNCTION_ACTION__QUALIFIED_NAME:
				return getQualifiedName();
			case UML2Package.APPLY_FUNCTION_ACTION__VISIBILITY:
				return getVisibility();
			case UML2Package.APPLY_FUNCTION_ACTION__CLIENT_DEPENDENCY:
				return getClientDependencies();
			case UML2Package.APPLY_FUNCTION_ACTION__NAME_EXPRESSION:
				return getNameExpression();
			case UML2Package.APPLY_FUNCTION_ACTION__REDEFINITION_CONTEXT:
				return getRedefinitionContexts();
			case UML2Package.APPLY_FUNCTION_ACTION__IS_LEAF:
				return isLeaf() ? Boolean.TRUE : Boolean.FALSE;
			case UML2Package.APPLY_FUNCTION_ACTION__OUTGOING:
				return getOutgoings();
			case UML2Package.APPLY_FUNCTION_ACTION__INCOMING:
				return getIncomings();
			case UML2Package.APPLY_FUNCTION_ACTION__IN_GROUP:
				return getInGroups();
			case UML2Package.APPLY_FUNCTION_ACTION__ACTIVITY:
				return getActivity();
			case UML2Package.APPLY_FUNCTION_ACTION__REDEFINED_ELEMENT:
				return getRedefinedElements();
			case UML2Package.APPLY_FUNCTION_ACTION__IN_STRUCTURED_NODE:
				return getInStructuredNode();
			case UML2Package.APPLY_FUNCTION_ACTION__IN_PARTITION:
				return getInPartitions();
			case UML2Package.APPLY_FUNCTION_ACTION__IN_INTERRUPTIBLE_REGION:
				return getInInterruptibleRegions();
			case UML2Package.APPLY_FUNCTION_ACTION__HANDLER:
				return getHandlers();
			case UML2Package.APPLY_FUNCTION_ACTION__EFFECT:
				return getEffect();
			case UML2Package.APPLY_FUNCTION_ACTION__OUTPUT:
				return getOutputs();
			case UML2Package.APPLY_FUNCTION_ACTION__INPUT:
				return getInputs();
			case UML2Package.APPLY_FUNCTION_ACTION__CONTEXT:
				if (resolve) return getContext();
				return basicGetContext();
			case UML2Package.APPLY_FUNCTION_ACTION__LOCAL_PRECONDITION:
				return getLocalPreconditions();
			case UML2Package.APPLY_FUNCTION_ACTION__LOCAL_POSTCONDITION:
				return getLocalPostconditions();
			case UML2Package.APPLY_FUNCTION_ACTION__FUNCTION:
				if (resolve) return getFunction();
				return basicGetFunction();
			case UML2Package.APPLY_FUNCTION_ACTION__ARGUMENT:
				return getArguments();
			case UML2Package.APPLY_FUNCTION_ACTION__RESULT:
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
			case UML2Package.APPLY_FUNCTION_ACTION__EANNOTATIONS:
				getEAnnotations().clear();
				getEAnnotations().addAll((Collection)newValue);
				return;
			case UML2Package.APPLY_FUNCTION_ACTION__OWNED_COMMENT:
				getOwnedComments().clear();
				getOwnedComments().addAll((Collection)newValue);
				return;
			case UML2Package.APPLY_FUNCTION_ACTION__TEMPLATE_BINDING:
				getTemplateBindings().clear();
				getTemplateBindings().addAll((Collection)newValue);
				return;
			case UML2Package.APPLY_FUNCTION_ACTION__OWNED_TEMPLATE_SIGNATURE:
				setOwnedTemplateSignature((TemplateSignature)newValue);
				return;
			case UML2Package.APPLY_FUNCTION_ACTION__NAME:
				setName((String)newValue);
				return;
			case UML2Package.APPLY_FUNCTION_ACTION__VISIBILITY:
				setVisibility((VisibilityKind)newValue);
				return;
			case UML2Package.APPLY_FUNCTION_ACTION__CLIENT_DEPENDENCY:
				getClientDependencies().clear();
				getClientDependencies().addAll((Collection)newValue);
				return;
			case UML2Package.APPLY_FUNCTION_ACTION__NAME_EXPRESSION:
				setNameExpression((StringExpression)newValue);
				return;
			case UML2Package.APPLY_FUNCTION_ACTION__IS_LEAF:
				setIsLeaf(((Boolean)newValue).booleanValue());
				return;
			case UML2Package.APPLY_FUNCTION_ACTION__OUTGOING:
				getOutgoings().clear();
				getOutgoings().addAll((Collection)newValue);
				return;
			case UML2Package.APPLY_FUNCTION_ACTION__INCOMING:
				getIncomings().clear();
				getIncomings().addAll((Collection)newValue);
				return;
			case UML2Package.APPLY_FUNCTION_ACTION__ACTIVITY:
				setActivity((Activity)newValue);
				return;
			case UML2Package.APPLY_FUNCTION_ACTION__REDEFINED_ELEMENT:
				getRedefinedElements().clear();
				getRedefinedElements().addAll((Collection)newValue);
				return;
			case UML2Package.APPLY_FUNCTION_ACTION__IN_STRUCTURED_NODE:
				setInStructuredNode((StructuredActivityNode)newValue);
				return;
			case UML2Package.APPLY_FUNCTION_ACTION__IN_PARTITION:
				getInPartitions().clear();
				getInPartitions().addAll((Collection)newValue);
				return;
			case UML2Package.APPLY_FUNCTION_ACTION__IN_INTERRUPTIBLE_REGION:
				getInInterruptibleRegions().clear();
				getInInterruptibleRegions().addAll((Collection)newValue);
				return;
			case UML2Package.APPLY_FUNCTION_ACTION__HANDLER:
				getHandlers().clear();
				getHandlers().addAll((Collection)newValue);
				return;
			case UML2Package.APPLY_FUNCTION_ACTION__EFFECT:
				setEffect((String)newValue);
				return;
			case UML2Package.APPLY_FUNCTION_ACTION__LOCAL_PRECONDITION:
				getLocalPreconditions().clear();
				getLocalPreconditions().addAll((Collection)newValue);
				return;
			case UML2Package.APPLY_FUNCTION_ACTION__LOCAL_POSTCONDITION:
				getLocalPostconditions().clear();
				getLocalPostconditions().addAll((Collection)newValue);
				return;
			case UML2Package.APPLY_FUNCTION_ACTION__FUNCTION:
				setFunction((PrimitiveFunction)newValue);
				return;
			case UML2Package.APPLY_FUNCTION_ACTION__ARGUMENT:
				getArguments().clear();
				getArguments().addAll((Collection)newValue);
				return;
			case UML2Package.APPLY_FUNCTION_ACTION__RESULT:
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
			case UML2Package.APPLY_FUNCTION_ACTION__EANNOTATIONS:
				getEAnnotations().clear();
				return;
			case UML2Package.APPLY_FUNCTION_ACTION__OWNED_COMMENT:
				getOwnedComments().clear();
				return;
			case UML2Package.APPLY_FUNCTION_ACTION__TEMPLATE_BINDING:
				getTemplateBindings().clear();
				return;
			case UML2Package.APPLY_FUNCTION_ACTION__OWNED_TEMPLATE_SIGNATURE:
				setOwnedTemplateSignature((TemplateSignature)null);
				return;
			case UML2Package.APPLY_FUNCTION_ACTION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case UML2Package.APPLY_FUNCTION_ACTION__VISIBILITY:
				setVisibility(VISIBILITY_EDEFAULT);
				return;
			case UML2Package.APPLY_FUNCTION_ACTION__CLIENT_DEPENDENCY:
				getClientDependencies().clear();
				return;
			case UML2Package.APPLY_FUNCTION_ACTION__NAME_EXPRESSION:
				setNameExpression((StringExpression)null);
				return;
			case UML2Package.APPLY_FUNCTION_ACTION__IS_LEAF:
				setIsLeaf(IS_LEAF_EDEFAULT);
				return;
			case UML2Package.APPLY_FUNCTION_ACTION__OUTGOING:
				getOutgoings().clear();
				return;
			case UML2Package.APPLY_FUNCTION_ACTION__INCOMING:
				getIncomings().clear();
				return;
			case UML2Package.APPLY_FUNCTION_ACTION__ACTIVITY:
				setActivity((Activity)null);
				return;
			case UML2Package.APPLY_FUNCTION_ACTION__REDEFINED_ELEMENT:
				getRedefinedElements().clear();
				return;
			case UML2Package.APPLY_FUNCTION_ACTION__IN_STRUCTURED_NODE:
				setInStructuredNode((StructuredActivityNode)null);
				return;
			case UML2Package.APPLY_FUNCTION_ACTION__IN_PARTITION:
				getInPartitions().clear();
				return;
			case UML2Package.APPLY_FUNCTION_ACTION__IN_INTERRUPTIBLE_REGION:
				getInInterruptibleRegions().clear();
				return;
			case UML2Package.APPLY_FUNCTION_ACTION__HANDLER:
				getHandlers().clear();
				return;
			case UML2Package.APPLY_FUNCTION_ACTION__EFFECT:
				setEffect(EFFECT_EDEFAULT);
				return;
			case UML2Package.APPLY_FUNCTION_ACTION__LOCAL_PRECONDITION:
				getLocalPreconditions().clear();
				return;
			case UML2Package.APPLY_FUNCTION_ACTION__LOCAL_POSTCONDITION:
				getLocalPostconditions().clear();
				return;
			case UML2Package.APPLY_FUNCTION_ACTION__FUNCTION:
				setFunction((PrimitiveFunction)null);
				return;
			case UML2Package.APPLY_FUNCTION_ACTION__ARGUMENT:
				getArguments().clear();
				return;
			case UML2Package.APPLY_FUNCTION_ACTION__RESULT:
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
			case UML2Package.APPLY_FUNCTION_ACTION__EANNOTATIONS:
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UML2Package.APPLY_FUNCTION_ACTION__OWNED_ELEMENT:
				return !getOwnedElements().isEmpty();
			case UML2Package.APPLY_FUNCTION_ACTION__OWNER:
				return basicGetOwner() != null;
			case UML2Package.APPLY_FUNCTION_ACTION__OWNED_COMMENT:
				return ownedComment != null && !ownedComment.isEmpty();
			case UML2Package.APPLY_FUNCTION_ACTION__TEMPLATE_BINDING:
				return templateBinding != null && !templateBinding.isEmpty();
			case UML2Package.APPLY_FUNCTION_ACTION__OWNED_TEMPLATE_SIGNATURE:
				return ownedTemplateSignature != null;
			case UML2Package.APPLY_FUNCTION_ACTION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case UML2Package.APPLY_FUNCTION_ACTION__QUALIFIED_NAME:
				return QUALIFIED_NAME_EDEFAULT == null ? getQualifiedName() != null : !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case UML2Package.APPLY_FUNCTION_ACTION__VISIBILITY:
				return visibility != VISIBILITY_EDEFAULT;
			case UML2Package.APPLY_FUNCTION_ACTION__CLIENT_DEPENDENCY:
				return clientDependency != null && !clientDependency.isEmpty();
			case UML2Package.APPLY_FUNCTION_ACTION__NAME_EXPRESSION:
				return nameExpression != null;
			case UML2Package.APPLY_FUNCTION_ACTION__REDEFINITION_CONTEXT:
				return !getRedefinitionContexts().isEmpty();
			case UML2Package.APPLY_FUNCTION_ACTION__IS_LEAF:
				return ((eFlags & IS_LEAF_EFLAG) != 0) != IS_LEAF_EDEFAULT;
			case UML2Package.APPLY_FUNCTION_ACTION__OUTGOING:
				return outgoing != null && !outgoing.isEmpty();
			case UML2Package.APPLY_FUNCTION_ACTION__INCOMING:
				return incoming != null && !incoming.isEmpty();
			case UML2Package.APPLY_FUNCTION_ACTION__IN_GROUP:
				return !getInGroups().isEmpty();
			case UML2Package.APPLY_FUNCTION_ACTION__ACTIVITY:
				return getActivity() != null;
			case UML2Package.APPLY_FUNCTION_ACTION__REDEFINED_ELEMENT:
				return redefinedElement != null && !redefinedElement.isEmpty();
			case UML2Package.APPLY_FUNCTION_ACTION__IN_STRUCTURED_NODE:
				return getInStructuredNode() != null;
			case UML2Package.APPLY_FUNCTION_ACTION__IN_PARTITION:
				return inPartition != null && !inPartition.isEmpty();
			case UML2Package.APPLY_FUNCTION_ACTION__IN_INTERRUPTIBLE_REGION:
				return inInterruptibleRegion != null && !inInterruptibleRegion.isEmpty();
			case UML2Package.APPLY_FUNCTION_ACTION__HANDLER:
				return handler != null && !handler.isEmpty();
			case UML2Package.APPLY_FUNCTION_ACTION__EFFECT:
				return EFFECT_EDEFAULT == null ? effect != null : !EFFECT_EDEFAULT.equals(effect);
			case UML2Package.APPLY_FUNCTION_ACTION__OUTPUT:
				return !getOutputs().isEmpty();
			case UML2Package.APPLY_FUNCTION_ACTION__INPUT:
				return !getInputs().isEmpty();
			case UML2Package.APPLY_FUNCTION_ACTION__CONTEXT:
				return basicGetContext() != null;
			case UML2Package.APPLY_FUNCTION_ACTION__LOCAL_PRECONDITION:
				return localPrecondition != null && !localPrecondition.isEmpty();
			case UML2Package.APPLY_FUNCTION_ACTION__LOCAL_POSTCONDITION:
				return localPostcondition != null && !localPostcondition.isEmpty();
			case UML2Package.APPLY_FUNCTION_ACTION__FUNCTION:
				return function != null;
			case UML2Package.APPLY_FUNCTION_ACTION__ARGUMENT:
				return argument != null && !argument.isEmpty();
			case UML2Package.APPLY_FUNCTION_ACTION__RESULT:
				return result != null && !result.isEmpty();
		}
		return eDynamicIsSet(eFeature);
	}

} //ApplyFunctionActionImpl
