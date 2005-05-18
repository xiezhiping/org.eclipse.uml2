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
 * $Id: PartDecompositionImpl.java,v 1.6 2005/05/18 16:38:26 khussey Exp $
 */
package org.eclipse.uml2.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.uml2.Interaction;
import org.eclipse.uml2.InteractionOperand;
import org.eclipse.uml2.PartDecomposition;
import org.eclipse.uml2.StringExpression;
import org.eclipse.uml2.TemplateSignature;
import org.eclipse.uml2.UML2Package;
import org.eclipse.uml2.VisibilityKind;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Part Decomposition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class PartDecompositionImpl extends InteractionOccurrenceImpl implements PartDecomposition {
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
	protected PartDecompositionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return UML2Package.eINSTANCE.getPartDecomposition();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, Class baseClass, NotificationChain msgs) {
		if (featureID >= 0) {
			switch (eDerivedStructuralFeatureID(featureID, baseClass)) {
				case UML2Package.PART_DECOMPOSITION__EANNOTATIONS:
					return ((InternalEList)getEAnnotations()).basicAdd(otherEnd, msgs);
				case UML2Package.PART_DECOMPOSITION__TEMPLATE_BINDING:
					return ((InternalEList)getTemplateBindings()).basicAdd(otherEnd, msgs);
				case UML2Package.PART_DECOMPOSITION__OWNED_TEMPLATE_SIGNATURE:
					if (ownedTemplateSignature != null)
						msgs = ((InternalEObject)ownedTemplateSignature).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UML2Package.PART_DECOMPOSITION__OWNED_TEMPLATE_SIGNATURE, null, msgs);
					return basicSetOwnedTemplateSignature((TemplateSignature)otherEnd, msgs);
				case UML2Package.PART_DECOMPOSITION__CLIENT_DEPENDENCY:
					return ((InternalEList)getClientDependencies()).basicAdd(otherEnd, msgs);
				case UML2Package.PART_DECOMPOSITION__COVERED:
					return ((InternalEList)getCovereds()).basicAdd(otherEnd, msgs);
				case UML2Package.PART_DECOMPOSITION__ENCLOSING_INTERACTION:
					if (eContainer != null)
						msgs = eBasicRemoveFromContainer(msgs);
					return eBasicSetContainer(otherEnd, UML2Package.PART_DECOMPOSITION__ENCLOSING_INTERACTION, msgs);
				case UML2Package.PART_DECOMPOSITION__ENCLOSING_OPERAND:
					if (eContainer != null)
						msgs = eBasicRemoveFromContainer(msgs);
					return eBasicSetContainer(otherEnd, UML2Package.PART_DECOMPOSITION__ENCLOSING_OPERAND, msgs);
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
				case UML2Package.PART_DECOMPOSITION__EANNOTATIONS:
					return ((InternalEList)getEAnnotations()).basicRemove(otherEnd, msgs);
				case UML2Package.PART_DECOMPOSITION__OWNED_COMMENT:
					return ((InternalEList)getOwnedComments()).basicRemove(otherEnd, msgs);
				case UML2Package.PART_DECOMPOSITION__TEMPLATE_BINDING:
					return ((InternalEList)getTemplateBindings()).basicRemove(otherEnd, msgs);
				case UML2Package.PART_DECOMPOSITION__OWNED_TEMPLATE_SIGNATURE:
					return basicSetOwnedTemplateSignature(null, msgs);
				case UML2Package.PART_DECOMPOSITION__CLIENT_DEPENDENCY:
					return ((InternalEList)getClientDependencies()).basicRemove(otherEnd, msgs);
				case UML2Package.PART_DECOMPOSITION__NAME_EXPRESSION:
					return basicSetNameExpression(null, msgs);
				case UML2Package.PART_DECOMPOSITION__COVERED:
					return ((InternalEList)getCovereds()).basicRemove(otherEnd, msgs);
				case UML2Package.PART_DECOMPOSITION__GENERAL_ORDERING:
					return ((InternalEList)getGeneralOrderings()).basicRemove(otherEnd, msgs);
				case UML2Package.PART_DECOMPOSITION__ENCLOSING_INTERACTION:
					return eBasicSetContainer(null, UML2Package.PART_DECOMPOSITION__ENCLOSING_INTERACTION, msgs);
				case UML2Package.PART_DECOMPOSITION__ENCLOSING_OPERAND:
					return eBasicSetContainer(null, UML2Package.PART_DECOMPOSITION__ENCLOSING_OPERAND, msgs);
				case UML2Package.PART_DECOMPOSITION__ACTUAL_GATE:
					return ((InternalEList)getActualGates()).basicRemove(otherEnd, msgs);
				case UML2Package.PART_DECOMPOSITION__ARGUMENT:
					return ((InternalEList)getArguments()).basicRemove(otherEnd, msgs);
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
				case UML2Package.PART_DECOMPOSITION__ENCLOSING_INTERACTION:
					return eContainer.eInverseRemove(this, UML2Package.INTERACTION__FRAGMENT, Interaction.class, msgs);
				case UML2Package.PART_DECOMPOSITION__ENCLOSING_OPERAND:
					return eContainer.eInverseRemove(this, UML2Package.INTERACTION_OPERAND__FRAGMENT, InteractionOperand.class, msgs);
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
			case UML2Package.PART_DECOMPOSITION__EANNOTATIONS:
				return getEAnnotations();
			case UML2Package.PART_DECOMPOSITION__OWNED_ELEMENT:
				return getOwnedElements();
			case UML2Package.PART_DECOMPOSITION__OWNER:
				if (resolve) return getOwner();
				return basicGetOwner();
			case UML2Package.PART_DECOMPOSITION__OWNED_COMMENT:
				return getOwnedComments();
			case UML2Package.PART_DECOMPOSITION__TEMPLATE_BINDING:
				return getTemplateBindings();
			case UML2Package.PART_DECOMPOSITION__OWNED_TEMPLATE_SIGNATURE:
				return getOwnedTemplateSignature();
			case UML2Package.PART_DECOMPOSITION__NAME:
				return getName();
			case UML2Package.PART_DECOMPOSITION__QUALIFIED_NAME:
				return getQualifiedName();
			case UML2Package.PART_DECOMPOSITION__VISIBILITY:
				return getVisibility();
			case UML2Package.PART_DECOMPOSITION__CLIENT_DEPENDENCY:
				return getClientDependencies();
			case UML2Package.PART_DECOMPOSITION__NAME_EXPRESSION:
				return getNameExpression();
			case UML2Package.PART_DECOMPOSITION__COVERED:
				return getCovereds();
			case UML2Package.PART_DECOMPOSITION__GENERAL_ORDERING:
				return getGeneralOrderings();
			case UML2Package.PART_DECOMPOSITION__ENCLOSING_INTERACTION:
				return getEnclosingInteraction();
			case UML2Package.PART_DECOMPOSITION__ENCLOSING_OPERAND:
				return getEnclosingOperand();
			case UML2Package.PART_DECOMPOSITION__REFERS_TO:
				if (resolve) return getRefersTo();
				return basicGetRefersTo();
			case UML2Package.PART_DECOMPOSITION__ACTUAL_GATE:
				return getActualGates();
			case UML2Package.PART_DECOMPOSITION__ARGUMENT:
				return getArguments();
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
			case UML2Package.PART_DECOMPOSITION__EANNOTATIONS:
				getEAnnotations().clear();
				getEAnnotations().addAll((Collection)newValue);
				return;
			case UML2Package.PART_DECOMPOSITION__OWNED_COMMENT:
				getOwnedComments().clear();
				getOwnedComments().addAll((Collection)newValue);
				return;
			case UML2Package.PART_DECOMPOSITION__TEMPLATE_BINDING:
				getTemplateBindings().clear();
				getTemplateBindings().addAll((Collection)newValue);
				return;
			case UML2Package.PART_DECOMPOSITION__OWNED_TEMPLATE_SIGNATURE:
				setOwnedTemplateSignature((TemplateSignature)newValue);
				return;
			case UML2Package.PART_DECOMPOSITION__NAME:
				setName((String)newValue);
				return;
			case UML2Package.PART_DECOMPOSITION__VISIBILITY:
				setVisibility((VisibilityKind)newValue);
				return;
			case UML2Package.PART_DECOMPOSITION__CLIENT_DEPENDENCY:
				getClientDependencies().clear();
				getClientDependencies().addAll((Collection)newValue);
				return;
			case UML2Package.PART_DECOMPOSITION__NAME_EXPRESSION:
				setNameExpression((StringExpression)newValue);
				return;
			case UML2Package.PART_DECOMPOSITION__COVERED:
				getCovereds().clear();
				getCovereds().addAll((Collection)newValue);
				return;
			case UML2Package.PART_DECOMPOSITION__GENERAL_ORDERING:
				getGeneralOrderings().clear();
				getGeneralOrderings().addAll((Collection)newValue);
				return;
			case UML2Package.PART_DECOMPOSITION__ENCLOSING_INTERACTION:
				setEnclosingInteraction((Interaction)newValue);
				return;
			case UML2Package.PART_DECOMPOSITION__ENCLOSING_OPERAND:
				setEnclosingOperand((InteractionOperand)newValue);
				return;
			case UML2Package.PART_DECOMPOSITION__REFERS_TO:
				setRefersTo((Interaction)newValue);
				return;
			case UML2Package.PART_DECOMPOSITION__ACTUAL_GATE:
				getActualGates().clear();
				getActualGates().addAll((Collection)newValue);
				return;
			case UML2Package.PART_DECOMPOSITION__ARGUMENT:
				getArguments().clear();
				getArguments().addAll((Collection)newValue);
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
			case UML2Package.PART_DECOMPOSITION__EANNOTATIONS:
				getEAnnotations().clear();
				return;
			case UML2Package.PART_DECOMPOSITION__OWNED_COMMENT:
				getOwnedComments().clear();
				return;
			case UML2Package.PART_DECOMPOSITION__TEMPLATE_BINDING:
				getTemplateBindings().clear();
				return;
			case UML2Package.PART_DECOMPOSITION__OWNED_TEMPLATE_SIGNATURE:
				setOwnedTemplateSignature((TemplateSignature)null);
				return;
			case UML2Package.PART_DECOMPOSITION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case UML2Package.PART_DECOMPOSITION__VISIBILITY:
				setVisibility(VISIBILITY_EDEFAULT);
				return;
			case UML2Package.PART_DECOMPOSITION__CLIENT_DEPENDENCY:
				getClientDependencies().clear();
				return;
			case UML2Package.PART_DECOMPOSITION__NAME_EXPRESSION:
				setNameExpression((StringExpression)null);
				return;
			case UML2Package.PART_DECOMPOSITION__COVERED:
				getCovereds().clear();
				return;
			case UML2Package.PART_DECOMPOSITION__GENERAL_ORDERING:
				getGeneralOrderings().clear();
				return;
			case UML2Package.PART_DECOMPOSITION__ENCLOSING_INTERACTION:
				setEnclosingInteraction((Interaction)null);
				return;
			case UML2Package.PART_DECOMPOSITION__ENCLOSING_OPERAND:
				setEnclosingOperand((InteractionOperand)null);
				return;
			case UML2Package.PART_DECOMPOSITION__REFERS_TO:
				setRefersTo((Interaction)null);
				return;
			case UML2Package.PART_DECOMPOSITION__ACTUAL_GATE:
				getActualGates().clear();
				return;
			case UML2Package.PART_DECOMPOSITION__ARGUMENT:
				getArguments().clear();
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
			case UML2Package.PART_DECOMPOSITION__EANNOTATIONS:
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UML2Package.PART_DECOMPOSITION__OWNED_ELEMENT:
				return !getOwnedElements().isEmpty();
			case UML2Package.PART_DECOMPOSITION__OWNER:
				return basicGetOwner() != null;
			case UML2Package.PART_DECOMPOSITION__OWNED_COMMENT:
				return ownedComment != null && !ownedComment.isEmpty();
			case UML2Package.PART_DECOMPOSITION__TEMPLATE_BINDING:
				return templateBinding != null && !templateBinding.isEmpty();
			case UML2Package.PART_DECOMPOSITION__OWNED_TEMPLATE_SIGNATURE:
				return ownedTemplateSignature != null;
			case UML2Package.PART_DECOMPOSITION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case UML2Package.PART_DECOMPOSITION__QUALIFIED_NAME:
				return QUALIFIED_NAME_EDEFAULT == null ? getQualifiedName() != null : !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case UML2Package.PART_DECOMPOSITION__VISIBILITY:
				return visibility != VISIBILITY_EDEFAULT;
			case UML2Package.PART_DECOMPOSITION__CLIENT_DEPENDENCY:
				return clientDependency != null && !clientDependency.isEmpty();
			case UML2Package.PART_DECOMPOSITION__NAME_EXPRESSION:
				return nameExpression != null;
			case UML2Package.PART_DECOMPOSITION__COVERED:
				return covered != null && !covered.isEmpty();
			case UML2Package.PART_DECOMPOSITION__GENERAL_ORDERING:
				return generalOrdering != null && !generalOrdering.isEmpty();
			case UML2Package.PART_DECOMPOSITION__ENCLOSING_INTERACTION:
				return getEnclosingInteraction() != null;
			case UML2Package.PART_DECOMPOSITION__ENCLOSING_OPERAND:
				return getEnclosingOperand() != null;
			case UML2Package.PART_DECOMPOSITION__REFERS_TO:
				return refersTo != null;
			case UML2Package.PART_DECOMPOSITION__ACTUAL_GATE:
				return actualGate != null && !actualGate.isEmpty();
			case UML2Package.PART_DECOMPOSITION__ARGUMENT:
				return argument != null && !argument.isEmpty();
		}
		return eDynamicIsSet(eFeature);
	}


} //PartDecompositionImpl
