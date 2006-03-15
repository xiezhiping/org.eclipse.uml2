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
 * $Id: OpaqueActionImpl.java,v 1.14 2006/03/15 19:34:13 khussey Exp $
 */
package org.eclipse.uml2.uml.internal.impl;

import java.util.Collection;
import java.util.Iterator;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.uml2.common.util.DerivedUnionEObjectEList;

import org.eclipse.uml2.uml.Activity;
import org.eclipse.uml2.uml.InputPin;
import org.eclipse.uml2.uml.OpaqueAction;
import org.eclipse.uml2.uml.OutputPin;
import org.eclipse.uml2.uml.StringExpression;
import org.eclipse.uml2.uml.StructuredActivityNode;
import org.eclipse.uml2.uml.Type;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.VisibilityKind;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Opaque Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.OpaqueActionImpl#getInputs <em>Input</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.OpaqueActionImpl#getOutputs <em>Output</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.OpaqueActionImpl#getBodies <em>Body</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.OpaqueActionImpl#getLanguages <em>Language</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.OpaqueActionImpl#getInputValues <em>Input Value</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.OpaqueActionImpl#getOutputValues <em>Output Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OpaqueActionImpl
		extends ActionImpl
		implements OpaqueAction {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OpaqueActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return UMLPackage.Literals.OPAQUE_ACTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getInputs() {
		EList input = (EList) eVirtualGet(UMLPackage.OPAQUE_ACTION__INPUT);
		if (input == null) {
			eVirtualSet(UMLPackage.OPAQUE_ACTION__INPUT,
				input = new DerivedUnionEObjectEList(InputPin.class, this,
					UMLPackage.OPAQUE_ACTION__INPUT,
					new int[]{UMLPackage.OPAQUE_ACTION__INPUT_VALUE}));
		}
		return input;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getOutputs() {
		EList output = (EList) eVirtualGet(UMLPackage.OPAQUE_ACTION__OUTPUT);
		if (output == null) {
			eVirtualSet(UMLPackage.OPAQUE_ACTION__OUTPUT,
				output = new DerivedUnionEObjectEList(OutputPin.class, this,
					UMLPackage.OPAQUE_ACTION__OUTPUT,
					new int[]{UMLPackage.OPAQUE_ACTION__OUTPUT_VALUE}));
		}
		return output;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getBodies() {
		EList body = (EList) eVirtualGet(UMLPackage.OPAQUE_ACTION__BODY);
		if (body == null) {
			eVirtualSet(UMLPackage.OPAQUE_ACTION__BODY,
				body = new EDataTypeUniqueEList.Unsettable(String.class, this,
					UMLPackage.OPAQUE_ACTION__BODY));
		}
		return body;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetBodies() {
		((InternalEList.Unsettable) getBodies()).unset();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetBodies() {
		EList body = (EList) eVirtualGet(UMLPackage.OPAQUE_ACTION__BODY);
		return body != null && ((InternalEList.Unsettable) body).isSet();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getLanguages() {
		EList language = (EList) eVirtualGet(UMLPackage.OPAQUE_ACTION__LANGUAGE);
		if (language == null) {
			eVirtualSet(UMLPackage.OPAQUE_ACTION__LANGUAGE,
				language = new EDataTypeUniqueEList.Unsettable(String.class,
					this, UMLPackage.OPAQUE_ACTION__LANGUAGE));
		}
		return language;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetLanguages() {
		((InternalEList.Unsettable) getLanguages()).unset();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetLanguages() {
		EList language = (EList) eVirtualGet(UMLPackage.OPAQUE_ACTION__LANGUAGE);
		return language != null
			&& ((InternalEList.Unsettable) language).isSet();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getInputValues() {
		EList inputValue = (EList) eVirtualGet(UMLPackage.OPAQUE_ACTION__INPUT_VALUE);
		if (inputValue == null) {
			eVirtualSet(UMLPackage.OPAQUE_ACTION__INPUT_VALUE,
				inputValue = new EObjectResolvingEList(InputPin.class, this,
					UMLPackage.OPAQUE_ACTION__INPUT_VALUE));
		}
		return inputValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputPin getInputValue(String name, Type type) {
		return getInputValue(name, type, false, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputPin getInputValue(String name, Type type, boolean ignoreCase,
			EClass eClass) {
		inputValueLoop : for (Iterator i = getInputValues().iterator(); i
			.hasNext();) {
			InputPin inputValue = (InputPin) i.next();
			if (eClass != null && !eClass.isInstance(inputValue))
				continue inputValueLoop;
			if (name != null && !(ignoreCase
				? name.equalsIgnoreCase(inputValue.getName())
				: name.equals(inputValue.getName())))
				continue inputValueLoop;
			if (type != null && !type.equals(inputValue.getType()))
				continue inputValueLoop;
			return inputValue;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getOutputValues() {
		EList outputValue = (EList) eVirtualGet(UMLPackage.OPAQUE_ACTION__OUTPUT_VALUE);
		if (outputValue == null) {
			eVirtualSet(UMLPackage.OPAQUE_ACTION__OUTPUT_VALUE,
				outputValue = new EObjectResolvingEList(OutputPin.class, this,
					UMLPackage.OPAQUE_ACTION__OUTPUT_VALUE));
		}
		return outputValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutputPin getOutputValue(String name, Type type) {
		return getOutputValue(name, type, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutputPin getOutputValue(String name, Type type, boolean ignoreCase) {
		outputValueLoop : for (Iterator i = getOutputValues().iterator(); i
			.hasNext();) {
			OutputPin outputValue = (OutputPin) i.next();
			if (name != null && !(ignoreCase
				? name.equalsIgnoreCase(outputValue.getName())
				: name.equals(outputValue.getName())))
				continue outputValueLoop;
			if (type != null && !type.equals(outputValue.getType()))
				continue outputValueLoop;
			return outputValue;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UMLPackage.OPAQUE_ACTION__EANNOTATIONS :
				return getEAnnotations();
			case UMLPackage.OPAQUE_ACTION__OWNED_ELEMENT :
				return getOwnedElements();
			case UMLPackage.OPAQUE_ACTION__OWNER :
				if (resolve)
					return getOwner();
				return basicGetOwner();
			case UMLPackage.OPAQUE_ACTION__OWNED_COMMENT :
				return getOwnedComments();
			case UMLPackage.OPAQUE_ACTION__NAME :
				return getName();
			case UMLPackage.OPAQUE_ACTION__VISIBILITY :
				return getVisibility();
			case UMLPackage.OPAQUE_ACTION__QUALIFIED_NAME :
				return getQualifiedName();
			case UMLPackage.OPAQUE_ACTION__CLIENT_DEPENDENCY :
				return getClientDependencies();
			case UMLPackage.OPAQUE_ACTION__NAMESPACE :
				if (resolve)
					return getNamespace();
				return basicGetNamespace();
			case UMLPackage.OPAQUE_ACTION__NAME_EXPRESSION :
				if (resolve)
					return getNameExpression();
				return basicGetNameExpression();
			case UMLPackage.OPAQUE_ACTION__IS_LEAF :
				return isLeaf()
					? Boolean.TRUE
					: Boolean.FALSE;
			case UMLPackage.OPAQUE_ACTION__REDEFINED_ELEMENT :
				return getRedefinedElements();
			case UMLPackage.OPAQUE_ACTION__REDEFINITION_CONTEXT :
				return getRedefinitionContexts();
			case UMLPackage.OPAQUE_ACTION__IN_STRUCTURED_NODE :
				if (resolve)
					return getInStructuredNode();
				return basicGetInStructuredNode();
			case UMLPackage.OPAQUE_ACTION__ACTIVITY :
				if (resolve)
					return getActivity();
				return basicGetActivity();
			case UMLPackage.OPAQUE_ACTION__OUTGOING :
				return getOutgoings();
			case UMLPackage.OPAQUE_ACTION__INCOMING :
				return getIncomings();
			case UMLPackage.OPAQUE_ACTION__IN_PARTITION :
				return getInPartitions();
			case UMLPackage.OPAQUE_ACTION__IN_INTERRUPTIBLE_REGION :
				return getInInterruptibleRegions();
			case UMLPackage.OPAQUE_ACTION__IN_GROUP :
				return getInGroups();
			case UMLPackage.OPAQUE_ACTION__REDEFINED_NODE :
				return getRedefinedNodes();
			case UMLPackage.OPAQUE_ACTION__HANDLER :
				return getHandlers();
			case UMLPackage.OPAQUE_ACTION__OUTPUT :
				return getOutputs();
			case UMLPackage.OPAQUE_ACTION__INPUT :
				return getInputs();
			case UMLPackage.OPAQUE_ACTION__CONTEXT :
				if (resolve)
					return getContext();
				return basicGetContext();
			case UMLPackage.OPAQUE_ACTION__LOCAL_PRECONDITION :
				return getLocalPreconditions();
			case UMLPackage.OPAQUE_ACTION__LOCAL_POSTCONDITION :
				return getLocalPostconditions();
			case UMLPackage.OPAQUE_ACTION__BODY :
				return getBodies();
			case UMLPackage.OPAQUE_ACTION__LANGUAGE :
				return getLanguages();
			case UMLPackage.OPAQUE_ACTION__INPUT_VALUE :
				return getInputValues();
			case UMLPackage.OPAQUE_ACTION__OUTPUT_VALUE :
				return getOutputValues();
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
			case UMLPackage.OPAQUE_ACTION__EANNOTATIONS :
				getEAnnotations().clear();
				getEAnnotations().addAll((Collection) newValue);
				return;
			case UMLPackage.OPAQUE_ACTION__OWNED_COMMENT :
				getOwnedComments().clear();
				getOwnedComments().addAll((Collection) newValue);
				return;
			case UMLPackage.OPAQUE_ACTION__NAME :
				setName((String) newValue);
				return;
			case UMLPackage.OPAQUE_ACTION__VISIBILITY :
				setVisibility((VisibilityKind) newValue);
				return;
			case UMLPackage.OPAQUE_ACTION__CLIENT_DEPENDENCY :
				getClientDependencies().clear();
				getClientDependencies().addAll((Collection) newValue);
				return;
			case UMLPackage.OPAQUE_ACTION__NAME_EXPRESSION :
				setNameExpression((StringExpression) newValue);
				return;
			case UMLPackage.OPAQUE_ACTION__IS_LEAF :
				setIsLeaf(((Boolean) newValue).booleanValue());
				return;
			case UMLPackage.OPAQUE_ACTION__IN_STRUCTURED_NODE :
				setInStructuredNode((StructuredActivityNode) newValue);
				return;
			case UMLPackage.OPAQUE_ACTION__ACTIVITY :
				setActivity((Activity) newValue);
				return;
			case UMLPackage.OPAQUE_ACTION__OUTGOING :
				getOutgoings().clear();
				getOutgoings().addAll((Collection) newValue);
				return;
			case UMLPackage.OPAQUE_ACTION__INCOMING :
				getIncomings().clear();
				getIncomings().addAll((Collection) newValue);
				return;
			case UMLPackage.OPAQUE_ACTION__IN_PARTITION :
				getInPartitions().clear();
				getInPartitions().addAll((Collection) newValue);
				return;
			case UMLPackage.OPAQUE_ACTION__IN_INTERRUPTIBLE_REGION :
				getInInterruptibleRegions().clear();
				getInInterruptibleRegions().addAll((Collection) newValue);
				return;
			case UMLPackage.OPAQUE_ACTION__REDEFINED_NODE :
				getRedefinedNodes().clear();
				getRedefinedNodes().addAll((Collection) newValue);
				return;
			case UMLPackage.OPAQUE_ACTION__HANDLER :
				getHandlers().clear();
				getHandlers().addAll((Collection) newValue);
				return;
			case UMLPackage.OPAQUE_ACTION__LOCAL_PRECONDITION :
				getLocalPreconditions().clear();
				getLocalPreconditions().addAll((Collection) newValue);
				return;
			case UMLPackage.OPAQUE_ACTION__LOCAL_POSTCONDITION :
				getLocalPostconditions().clear();
				getLocalPostconditions().addAll((Collection) newValue);
				return;
			case UMLPackage.OPAQUE_ACTION__BODY :
				getBodies().clear();
				getBodies().addAll((Collection) newValue);
				return;
			case UMLPackage.OPAQUE_ACTION__LANGUAGE :
				getLanguages().clear();
				getLanguages().addAll((Collection) newValue);
				return;
			case UMLPackage.OPAQUE_ACTION__INPUT_VALUE :
				getInputValues().clear();
				getInputValues().addAll((Collection) newValue);
				return;
			case UMLPackage.OPAQUE_ACTION__OUTPUT_VALUE :
				getOutputValues().clear();
				getOutputValues().addAll((Collection) newValue);
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
			case UMLPackage.OPAQUE_ACTION__EANNOTATIONS :
				getEAnnotations().clear();
				return;
			case UMLPackage.OPAQUE_ACTION__OWNED_COMMENT :
				getOwnedComments().clear();
				return;
			case UMLPackage.OPAQUE_ACTION__NAME :
				unsetName();
				return;
			case UMLPackage.OPAQUE_ACTION__VISIBILITY :
				unsetVisibility();
				return;
			case UMLPackage.OPAQUE_ACTION__CLIENT_DEPENDENCY :
				getClientDependencies().clear();
				return;
			case UMLPackage.OPAQUE_ACTION__NAME_EXPRESSION :
				setNameExpression((StringExpression) null);
				return;
			case UMLPackage.OPAQUE_ACTION__IS_LEAF :
				setIsLeaf(IS_LEAF_EDEFAULT);
				return;
			case UMLPackage.OPAQUE_ACTION__IN_STRUCTURED_NODE :
				setInStructuredNode((StructuredActivityNode) null);
				return;
			case UMLPackage.OPAQUE_ACTION__ACTIVITY :
				setActivity((Activity) null);
				return;
			case UMLPackage.OPAQUE_ACTION__OUTGOING :
				getOutgoings().clear();
				return;
			case UMLPackage.OPAQUE_ACTION__INCOMING :
				getIncomings().clear();
				return;
			case UMLPackage.OPAQUE_ACTION__IN_PARTITION :
				getInPartitions().clear();
				return;
			case UMLPackage.OPAQUE_ACTION__IN_INTERRUPTIBLE_REGION :
				getInInterruptibleRegions().clear();
				return;
			case UMLPackage.OPAQUE_ACTION__REDEFINED_NODE :
				getRedefinedNodes().clear();
				return;
			case UMLPackage.OPAQUE_ACTION__HANDLER :
				getHandlers().clear();
				return;
			case UMLPackage.OPAQUE_ACTION__LOCAL_PRECONDITION :
				getLocalPreconditions().clear();
				return;
			case UMLPackage.OPAQUE_ACTION__LOCAL_POSTCONDITION :
				getLocalPostconditions().clear();
				return;
			case UMLPackage.OPAQUE_ACTION__BODY :
				unsetBodies();
				return;
			case UMLPackage.OPAQUE_ACTION__LANGUAGE :
				unsetLanguages();
				return;
			case UMLPackage.OPAQUE_ACTION__INPUT_VALUE :
				getInputValues().clear();
				return;
			case UMLPackage.OPAQUE_ACTION__OUTPUT_VALUE :
				getOutputValues().clear();
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
			case UMLPackage.OPAQUE_ACTION__EANNOTATIONS :
				EList eAnnotations = (EList) eVirtualGet(UMLPackage.OPAQUE_ACTION__EANNOTATIONS);
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UMLPackage.OPAQUE_ACTION__OWNED_ELEMENT :
				return isSetOwnedElements();
			case UMLPackage.OPAQUE_ACTION__OWNER :
				return isSetOwner();
			case UMLPackage.OPAQUE_ACTION__OWNED_COMMENT :
				EList ownedComment = (EList) eVirtualGet(UMLPackage.OPAQUE_ACTION__OWNED_COMMENT);
				return ownedComment != null && !ownedComment.isEmpty();
			case UMLPackage.OPAQUE_ACTION__NAME :
				return isSetName();
			case UMLPackage.OPAQUE_ACTION__VISIBILITY :
				return isSetVisibility();
			case UMLPackage.OPAQUE_ACTION__QUALIFIED_NAME :
				return QUALIFIED_NAME_EDEFAULT == null
					? getQualifiedName() != null
					: !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case UMLPackage.OPAQUE_ACTION__CLIENT_DEPENDENCY :
				EList clientDependency = (EList) eVirtualGet(UMLPackage.OPAQUE_ACTION__CLIENT_DEPENDENCY);
				return clientDependency != null && !clientDependency.isEmpty();
			case UMLPackage.OPAQUE_ACTION__NAMESPACE :
				return isSetNamespace();
			case UMLPackage.OPAQUE_ACTION__NAME_EXPRESSION :
				return eVirtualGet(UMLPackage.OPAQUE_ACTION__NAME_EXPRESSION) != null;
			case UMLPackage.OPAQUE_ACTION__IS_LEAF :
				return ((eFlags & IS_LEAF_EFLAG) != 0) != IS_LEAF_EDEFAULT;
			case UMLPackage.OPAQUE_ACTION__REDEFINED_ELEMENT :
				return isSetRedefinedElements();
			case UMLPackage.OPAQUE_ACTION__REDEFINITION_CONTEXT :
				return isSetRedefinitionContexts();
			case UMLPackage.OPAQUE_ACTION__IN_STRUCTURED_NODE :
				return basicGetInStructuredNode() != null;
			case UMLPackage.OPAQUE_ACTION__ACTIVITY :
				return basicGetActivity() != null;
			case UMLPackage.OPAQUE_ACTION__OUTGOING :
				EList outgoing = (EList) eVirtualGet(UMLPackage.OPAQUE_ACTION__OUTGOING);
				return outgoing != null && !outgoing.isEmpty();
			case UMLPackage.OPAQUE_ACTION__INCOMING :
				EList incoming = (EList) eVirtualGet(UMLPackage.OPAQUE_ACTION__INCOMING);
				return incoming != null && !incoming.isEmpty();
			case UMLPackage.OPAQUE_ACTION__IN_PARTITION :
				EList inPartition = (EList) eVirtualGet(UMLPackage.OPAQUE_ACTION__IN_PARTITION);
				return inPartition != null && !inPartition.isEmpty();
			case UMLPackage.OPAQUE_ACTION__IN_INTERRUPTIBLE_REGION :
				EList inInterruptibleRegion = (EList) eVirtualGet(UMLPackage.OPAQUE_ACTION__IN_INTERRUPTIBLE_REGION);
				return inInterruptibleRegion != null
					&& !inInterruptibleRegion.isEmpty();
			case UMLPackage.OPAQUE_ACTION__IN_GROUP :
				return isSetInGroups();
			case UMLPackage.OPAQUE_ACTION__REDEFINED_NODE :
				EList redefinedNode = (EList) eVirtualGet(UMLPackage.OPAQUE_ACTION__REDEFINED_NODE);
				return redefinedNode != null && !redefinedNode.isEmpty();
			case UMLPackage.OPAQUE_ACTION__HANDLER :
				EList handler = (EList) eVirtualGet(UMLPackage.OPAQUE_ACTION__HANDLER);
				return handler != null && !handler.isEmpty();
			case UMLPackage.OPAQUE_ACTION__OUTPUT :
				return isSetOutputs();
			case UMLPackage.OPAQUE_ACTION__INPUT :
				return isSetInputs();
			case UMLPackage.OPAQUE_ACTION__CONTEXT :
				return basicGetContext() != null;
			case UMLPackage.OPAQUE_ACTION__LOCAL_PRECONDITION :
				EList localPrecondition = (EList) eVirtualGet(UMLPackage.OPAQUE_ACTION__LOCAL_PRECONDITION);
				return localPrecondition != null
					&& !localPrecondition.isEmpty();
			case UMLPackage.OPAQUE_ACTION__LOCAL_POSTCONDITION :
				EList localPostcondition = (EList) eVirtualGet(UMLPackage.OPAQUE_ACTION__LOCAL_POSTCONDITION);
				return localPostcondition != null
					&& !localPostcondition.isEmpty();
			case UMLPackage.OPAQUE_ACTION__BODY :
				return isSetBodies();
			case UMLPackage.OPAQUE_ACTION__LANGUAGE :
				return isSetLanguages();
			case UMLPackage.OPAQUE_ACTION__INPUT_VALUE :
				EList inputValue = (EList) eVirtualGet(UMLPackage.OPAQUE_ACTION__INPUT_VALUE);
				return inputValue != null && !inputValue.isEmpty();
			case UMLPackage.OPAQUE_ACTION__OUTPUT_VALUE :
				EList outputValue = (EList) eVirtualGet(UMLPackage.OPAQUE_ACTION__OUTPUT_VALUE);
				return outputValue != null && !outputValue.isEmpty();
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
		result.append(" (body: "); //$NON-NLS-1$
		result.append(eVirtualGet(UMLPackage.OPAQUE_ACTION__BODY));
		result.append(", language: "); //$NON-NLS-1$
		result.append(eVirtualGet(UMLPackage.OPAQUE_ACTION__LANGUAGE));
		result.append(')');
		return result.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetInputs() {
		return super.isSetInputs()
			|| eIsSet(UMLPackage.OPAQUE_ACTION__INPUT_VALUE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOutputs() {
		return super.isSetOutputs()
			|| eIsSet(UMLPackage.OPAQUE_ACTION__OUTPUT_VALUE);
	}

} //OpaqueActionImpl
