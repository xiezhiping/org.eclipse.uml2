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
 * $Id: FinalStateImpl.java,v 1.5 2004/10/01 19:36:28 khussey Exp $
 */
package org.eclipse.uml2.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.uml2.Activity;
import org.eclipse.uml2.Constraint;
import org.eclipse.uml2.FinalState;
import org.eclipse.uml2.Region;
import org.eclipse.uml2.State;
import org.eclipse.uml2.StateMachine;
import org.eclipse.uml2.StringExpression;
import org.eclipse.uml2.TemplateSignature;
import org.eclipse.uml2.UML2Package;
import org.eclipse.uml2.VisibilityKind;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Final State</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class FinalStateImpl extends StateImpl implements FinalState {
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
	protected FinalStateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return UML2Package.eINSTANCE.getFinalState();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, Class baseClass, NotificationChain msgs) {
		if (featureID >= 0) {
			switch (eDerivedStructuralFeatureID(featureID, baseClass)) {
				case UML2Package.FINAL_STATE__EANNOTATIONS:
					return ((InternalEList)getEAnnotations()).basicAdd(otherEnd, msgs);
				case UML2Package.FINAL_STATE__TEMPLATE_BINDING:
					return ((InternalEList)getTemplateBindings()).basicAdd(otherEnd, msgs);
				case UML2Package.FINAL_STATE__OWNED_TEMPLATE_SIGNATURE:
					if (ownedTemplateSignature != null)
						msgs = ((InternalEObject)ownedTemplateSignature).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UML2Package.FINAL_STATE__OWNED_TEMPLATE_SIGNATURE, null, msgs);
					return basicSetOwnedTemplateSignature((TemplateSignature)otherEnd, msgs);
				case UML2Package.FINAL_STATE__CLIENT_DEPENDENCY:
					return ((InternalEList)getClientDependencies()).basicAdd(otherEnd, msgs);
				case UML2Package.FINAL_STATE__OWNED_RULE:
					return ((InternalEList)getOwnedRules()).basicAdd(otherEnd, msgs);
				case UML2Package.FINAL_STATE__ELEMENT_IMPORT:
					return ((InternalEList)getElementImports()).basicAdd(otherEnd, msgs);
				case UML2Package.FINAL_STATE__PACKAGE_IMPORT:
					return ((InternalEList)getPackageImports()).basicAdd(otherEnd, msgs);
				case UML2Package.FINAL_STATE__CONTAINER:
					if (eContainer != null)
						msgs = eBasicRemoveFromContainer(msgs);
					return eBasicSetContainer(otherEnd, UML2Package.FINAL_STATE__CONTAINER, msgs);
				case UML2Package.FINAL_STATE__OUTGOING:
					return ((InternalEList)getOutgoings()).basicAdd(otherEnd, msgs);
				case UML2Package.FINAL_STATE__INCOMING:
					return ((InternalEList)getIncomings()).basicAdd(otherEnd, msgs);
				case UML2Package.FINAL_STATE__REGION:
					return ((InternalEList)getRegions()).basicAdd(otherEnd, msgs);
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
				case UML2Package.FINAL_STATE__EANNOTATIONS:
					return ((InternalEList)getEAnnotations()).basicRemove(otherEnd, msgs);
				case UML2Package.FINAL_STATE__OWNED_COMMENT:
					return ((InternalEList)getOwnedComments()).basicRemove(otherEnd, msgs);
				case UML2Package.FINAL_STATE__TEMPLATE_BINDING:
					return ((InternalEList)getTemplateBindings()).basicRemove(otherEnd, msgs);
				case UML2Package.FINAL_STATE__OWNED_TEMPLATE_SIGNATURE:
					return basicSetOwnedTemplateSignature(null, msgs);
				case UML2Package.FINAL_STATE__CLIENT_DEPENDENCY:
					return ((InternalEList)getClientDependencies()).basicRemove(otherEnd, msgs);
				case UML2Package.FINAL_STATE__NAME_EXPRESSION:
					return basicSetNameExpression(null, msgs);
				case UML2Package.FINAL_STATE__OWNED_RULE:
					return ((InternalEList)getOwnedRules()).basicRemove(otherEnd, msgs);
				case UML2Package.FINAL_STATE__ELEMENT_IMPORT:
					return ((InternalEList)getElementImports()).basicRemove(otherEnd, msgs);
				case UML2Package.FINAL_STATE__PACKAGE_IMPORT:
					return ((InternalEList)getPackageImports()).basicRemove(otherEnd, msgs);
				case UML2Package.FINAL_STATE__CONTAINER:
					return eBasicSetContainer(null, UML2Package.FINAL_STATE__CONTAINER, msgs);
				case UML2Package.FINAL_STATE__OUTGOING:
					return ((InternalEList)getOutgoings()).basicRemove(otherEnd, msgs);
				case UML2Package.FINAL_STATE__INCOMING:
					return ((InternalEList)getIncomings()).basicRemove(otherEnd, msgs);
				case UML2Package.FINAL_STATE__CONNECTION:
					return ((InternalEList)getConnections()).basicRemove(otherEnd, msgs);
				case UML2Package.FINAL_STATE__REGION:
					return ((InternalEList)getRegions()).basicRemove(otherEnd, msgs);
				case UML2Package.FINAL_STATE__ENTRY:
					return basicSetEntry(null, msgs);
				case UML2Package.FINAL_STATE__EXIT:
					return basicSetExit(null, msgs);
				case UML2Package.FINAL_STATE__DO_ACTIVITY:
					return basicSetDoActivity(null, msgs);
				case UML2Package.FINAL_STATE__STATE_INVARIANT:
					return basicSetStateInvariant(null, msgs);
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
				case UML2Package.FINAL_STATE__CONTAINER:
					return eContainer.eInverseRemove(this, UML2Package.REGION__SUBVERTEX, Region.class, msgs);
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
			case UML2Package.FINAL_STATE__EANNOTATIONS:
				return getEAnnotations();
			case UML2Package.FINAL_STATE__OWNED_ELEMENT:
				return getOwnedElements();
			case UML2Package.FINAL_STATE__OWNER:
				if (resolve) return getOwner();
				return basicGetOwner();
			case UML2Package.FINAL_STATE__OWNED_COMMENT:
				return getOwnedComments();
			case UML2Package.FINAL_STATE__TEMPLATE_BINDING:
				return getTemplateBindings();
			case UML2Package.FINAL_STATE__OWNED_TEMPLATE_SIGNATURE:
				return getOwnedTemplateSignature();
			case UML2Package.FINAL_STATE__NAME:
				return getName();
			case UML2Package.FINAL_STATE__QUALIFIED_NAME:
				return getQualifiedName();
			case UML2Package.FINAL_STATE__VISIBILITY:
				return getVisibility();
			case UML2Package.FINAL_STATE__CLIENT_DEPENDENCY:
				return getClientDependencies();
			case UML2Package.FINAL_STATE__NAME_EXPRESSION:
				return getNameExpression();
			case UML2Package.FINAL_STATE__MEMBER:
				return getMembers();
			case UML2Package.FINAL_STATE__OWNED_RULE:
				return getOwnedRules();
			case UML2Package.FINAL_STATE__IMPORTED_MEMBER:
				return getImportedMembers();
			case UML2Package.FINAL_STATE__ELEMENT_IMPORT:
				return getElementImports();
			case UML2Package.FINAL_STATE__PACKAGE_IMPORT:
				return getPackageImports();
			case UML2Package.FINAL_STATE__REDEFINITION_CONTEXT:
				return getRedefinitionContexts();
			case UML2Package.FINAL_STATE__IS_LEAF:
				return isLeaf() ? Boolean.TRUE : Boolean.FALSE;
			case UML2Package.FINAL_STATE__CONTAINER:
				return getContainer();
			case UML2Package.FINAL_STATE__OUTGOING:
				return getOutgoings();
			case UML2Package.FINAL_STATE__INCOMING:
				return getIncomings();
			case UML2Package.FINAL_STATE__IS_COMPOSITE:
				return isComposite() ? Boolean.TRUE : Boolean.FALSE;
			case UML2Package.FINAL_STATE__IS_ORTHOGONAL:
				return isOrthogonal() ? Boolean.TRUE : Boolean.FALSE;
			case UML2Package.FINAL_STATE__IS_SIMPLE:
				return isSimple() ? Boolean.TRUE : Boolean.FALSE;
			case UML2Package.FINAL_STATE__IS_SUBMACHINE_STATE:
				return isSubmachineState() ? Boolean.TRUE : Boolean.FALSE;
			case UML2Package.FINAL_STATE__SUBMACHINE:
				if (resolve) return getSubmachine();
				return basicGetSubmachine();
			case UML2Package.FINAL_STATE__CONNECTION:
				return getConnections();
			case UML2Package.FINAL_STATE__REDEFINED_STATE:
				if (resolve) return getRedefinedState();
				return basicGetRedefinedState();
			case UML2Package.FINAL_STATE__DEFERRABLE_TRIGGER:
				return getDeferrableTriggers();
			case UML2Package.FINAL_STATE__REGION:
				return getRegions();
			case UML2Package.FINAL_STATE__ENTRY:
				return getEntry();
			case UML2Package.FINAL_STATE__EXIT:
				return getExit();
			case UML2Package.FINAL_STATE__DO_ACTIVITY:
				return getDoActivity();
			case UML2Package.FINAL_STATE__STATE_INVARIANT:
				return getStateInvariant();
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
			case UML2Package.FINAL_STATE__EANNOTATIONS:
				getEAnnotations().clear();
				getEAnnotations().addAll((Collection)newValue);
				return;
			case UML2Package.FINAL_STATE__OWNED_COMMENT:
				getOwnedComments().clear();
				getOwnedComments().addAll((Collection)newValue);
				return;
			case UML2Package.FINAL_STATE__TEMPLATE_BINDING:
				getTemplateBindings().clear();
				getTemplateBindings().addAll((Collection)newValue);
				return;
			case UML2Package.FINAL_STATE__OWNED_TEMPLATE_SIGNATURE:
				setOwnedTemplateSignature((TemplateSignature)newValue);
				return;
			case UML2Package.FINAL_STATE__NAME:
				setName((String)newValue);
				return;
			case UML2Package.FINAL_STATE__VISIBILITY:
				setVisibility((VisibilityKind)newValue);
				return;
			case UML2Package.FINAL_STATE__CLIENT_DEPENDENCY:
				getClientDependencies().clear();
				getClientDependencies().addAll((Collection)newValue);
				return;
			case UML2Package.FINAL_STATE__NAME_EXPRESSION:
				setNameExpression((StringExpression)newValue);
				return;
			case UML2Package.FINAL_STATE__OWNED_RULE:
				getOwnedRules().clear();
				getOwnedRules().addAll((Collection)newValue);
				return;
			case UML2Package.FINAL_STATE__ELEMENT_IMPORT:
				getElementImports().clear();
				getElementImports().addAll((Collection)newValue);
				return;
			case UML2Package.FINAL_STATE__PACKAGE_IMPORT:
				getPackageImports().clear();
				getPackageImports().addAll((Collection)newValue);
				return;
			case UML2Package.FINAL_STATE__IS_LEAF:
				setIsLeaf(((Boolean)newValue).booleanValue());
				return;
			case UML2Package.FINAL_STATE__CONTAINER:
				setContainer((Region)newValue);
				return;
			case UML2Package.FINAL_STATE__OUTGOING:
				getOutgoings().clear();
				getOutgoings().addAll((Collection)newValue);
				return;
			case UML2Package.FINAL_STATE__INCOMING:
				getIncomings().clear();
				getIncomings().addAll((Collection)newValue);
				return;
			case UML2Package.FINAL_STATE__SUBMACHINE:
				setSubmachine((StateMachine)newValue);
				return;
			case UML2Package.FINAL_STATE__CONNECTION:
				getConnections().clear();
				getConnections().addAll((Collection)newValue);
				return;
			case UML2Package.FINAL_STATE__REDEFINED_STATE:
				setRedefinedState((State)newValue);
				return;
			case UML2Package.FINAL_STATE__DEFERRABLE_TRIGGER:
				getDeferrableTriggers().clear();
				getDeferrableTriggers().addAll((Collection)newValue);
				return;
			case UML2Package.FINAL_STATE__REGION:
				getRegions().clear();
				getRegions().addAll((Collection)newValue);
				return;
			case UML2Package.FINAL_STATE__ENTRY:
				setEntry((Activity)newValue);
				return;
			case UML2Package.FINAL_STATE__EXIT:
				setExit((Activity)newValue);
				return;
			case UML2Package.FINAL_STATE__DO_ACTIVITY:
				setDoActivity((Activity)newValue);
				return;
			case UML2Package.FINAL_STATE__STATE_INVARIANT:
				setStateInvariant((Constraint)newValue);
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
			case UML2Package.FINAL_STATE__EANNOTATIONS:
				getEAnnotations().clear();
				return;
			case UML2Package.FINAL_STATE__OWNED_COMMENT:
				getOwnedComments().clear();
				return;
			case UML2Package.FINAL_STATE__TEMPLATE_BINDING:
				getTemplateBindings().clear();
				return;
			case UML2Package.FINAL_STATE__OWNED_TEMPLATE_SIGNATURE:
				setOwnedTemplateSignature((TemplateSignature)null);
				return;
			case UML2Package.FINAL_STATE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case UML2Package.FINAL_STATE__VISIBILITY:
				setVisibility(VISIBILITY_EDEFAULT);
				return;
			case UML2Package.FINAL_STATE__CLIENT_DEPENDENCY:
				getClientDependencies().clear();
				return;
			case UML2Package.FINAL_STATE__NAME_EXPRESSION:
				setNameExpression((StringExpression)null);
				return;
			case UML2Package.FINAL_STATE__OWNED_RULE:
				getOwnedRules().clear();
				return;
			case UML2Package.FINAL_STATE__ELEMENT_IMPORT:
				getElementImports().clear();
				return;
			case UML2Package.FINAL_STATE__PACKAGE_IMPORT:
				getPackageImports().clear();
				return;
			case UML2Package.FINAL_STATE__IS_LEAF:
				setIsLeaf(IS_LEAF_EDEFAULT);
				return;
			case UML2Package.FINAL_STATE__CONTAINER:
				setContainer((Region)null);
				return;
			case UML2Package.FINAL_STATE__OUTGOING:
				getOutgoings().clear();
				return;
			case UML2Package.FINAL_STATE__INCOMING:
				getIncomings().clear();
				return;
			case UML2Package.FINAL_STATE__SUBMACHINE:
				setSubmachine((StateMachine)null);
				return;
			case UML2Package.FINAL_STATE__CONNECTION:
				getConnections().clear();
				return;
			case UML2Package.FINAL_STATE__REDEFINED_STATE:
				setRedefinedState((State)null);
				return;
			case UML2Package.FINAL_STATE__DEFERRABLE_TRIGGER:
				getDeferrableTriggers().clear();
				return;
			case UML2Package.FINAL_STATE__REGION:
				getRegions().clear();
				return;
			case UML2Package.FINAL_STATE__ENTRY:
				setEntry((Activity)null);
				return;
			case UML2Package.FINAL_STATE__EXIT:
				setExit((Activity)null);
				return;
			case UML2Package.FINAL_STATE__DO_ACTIVITY:
				setDoActivity((Activity)null);
				return;
			case UML2Package.FINAL_STATE__STATE_INVARIANT:
				setStateInvariant((Constraint)null);
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
			case UML2Package.FINAL_STATE__EANNOTATIONS:
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UML2Package.FINAL_STATE__OWNED_ELEMENT:
				return !getOwnedElements().isEmpty();
			case UML2Package.FINAL_STATE__OWNER:
				return basicGetOwner() != null;
			case UML2Package.FINAL_STATE__OWNED_COMMENT:
				return ownedComment != null && !ownedComment.isEmpty();
			case UML2Package.FINAL_STATE__TEMPLATE_BINDING:
				return templateBinding != null && !templateBinding.isEmpty();
			case UML2Package.FINAL_STATE__OWNED_TEMPLATE_SIGNATURE:
				return ownedTemplateSignature != null;
			case UML2Package.FINAL_STATE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case UML2Package.FINAL_STATE__QUALIFIED_NAME:
				return QUALIFIED_NAME_EDEFAULT == null ? getQualifiedName() != null : !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case UML2Package.FINAL_STATE__VISIBILITY:
				return visibility != VISIBILITY_EDEFAULT;
			case UML2Package.FINAL_STATE__CLIENT_DEPENDENCY:
				return clientDependency != null && !clientDependency.isEmpty();
			case UML2Package.FINAL_STATE__NAME_EXPRESSION:
				return nameExpression != null;
			case UML2Package.FINAL_STATE__MEMBER:
				return !getMembers().isEmpty();
			case UML2Package.FINAL_STATE__OWNED_RULE:
				return ownedRule != null && !ownedRule.isEmpty();
			case UML2Package.FINAL_STATE__IMPORTED_MEMBER:
				return !getImportedMembers().isEmpty();
			case UML2Package.FINAL_STATE__ELEMENT_IMPORT:
				return elementImport != null && !elementImport.isEmpty();
			case UML2Package.FINAL_STATE__PACKAGE_IMPORT:
				return packageImport != null && !packageImport.isEmpty();
			case UML2Package.FINAL_STATE__REDEFINITION_CONTEXT:
				return !getRedefinitionContexts().isEmpty();
			case UML2Package.FINAL_STATE__IS_LEAF:
				return isLeaf() != IS_LEAF_EDEFAULT;
			case UML2Package.FINAL_STATE__CONTAINER:
				return getContainer() != null;
			case UML2Package.FINAL_STATE__OUTGOING:
				return outgoing != null && !outgoing.isEmpty();
			case UML2Package.FINAL_STATE__INCOMING:
				return incoming != null && !incoming.isEmpty();
			case UML2Package.FINAL_STATE__IS_COMPOSITE:
				return isComposite() != IS_COMPOSITE_EDEFAULT;
			case UML2Package.FINAL_STATE__IS_ORTHOGONAL:
				return isOrthogonal() != IS_ORTHOGONAL_EDEFAULT;
			case UML2Package.FINAL_STATE__IS_SIMPLE:
				return isSimple() != IS_SIMPLE_EDEFAULT;
			case UML2Package.FINAL_STATE__IS_SUBMACHINE_STATE:
				return isSubmachineState() != IS_SUBMACHINE_STATE_EDEFAULT;
			case UML2Package.FINAL_STATE__SUBMACHINE:
				return submachine != null;
			case UML2Package.FINAL_STATE__CONNECTION:
				return connection != null && !connection.isEmpty();
			case UML2Package.FINAL_STATE__REDEFINED_STATE:
				return redefinedState != null;
			case UML2Package.FINAL_STATE__DEFERRABLE_TRIGGER:
				return deferrableTrigger != null && !deferrableTrigger.isEmpty();
			case UML2Package.FINAL_STATE__REGION:
				return region != null && !region.isEmpty();
			case UML2Package.FINAL_STATE__ENTRY:
				return entry != null;
			case UML2Package.FINAL_STATE__EXIT:
				return exit != null;
			case UML2Package.FINAL_STATE__DO_ACTIVITY:
				return doActivity != null;
			case UML2Package.FINAL_STATE__STATE_INVARIANT:
				return stateInvariant != null;
		}
		return eDynamicIsSet(eFeature);
	}

} //FinalStateImpl
