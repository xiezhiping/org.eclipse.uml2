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
 * $Id: CombinedFragmentImpl.java,v 1.2 2004/04/10 04:09:49 khussey Exp $
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
import org.eclipse.uml2.CombinedFragment;
import org.eclipse.uml2.Gate;
import org.eclipse.uml2.Interaction;
import org.eclipse.uml2.InteractionOperand;
import org.eclipse.uml2.InteractionOperator;
import org.eclipse.uml2.StringExpression;
import org.eclipse.uml2.TemplateSignature;
import org.eclipse.uml2.UML2Package;
import org.eclipse.uml2.VisibilityKind;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Combined Fragment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2.impl.CombinedFragmentImpl#getInteractionOperator <em>Interaction Operator</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.CombinedFragmentImpl#getOperands <em>Operand</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.CombinedFragmentImpl#getCfragmentGates <em>Cfragment Gate</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CombinedFragmentImpl extends InteractionFragmentImpl implements CombinedFragment {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2003, 2004 IBM Corporation and others."; //$NON-NLS-1$

	/**
	 * The default value of the '{@link #getInteractionOperator() <em>Interaction Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInteractionOperator()
	 * @generated
	 * @ordered
	 */
	protected static final InteractionOperator INTERACTION_OPERATOR_EDEFAULT = InteractionOperator.SEQ_LITERAL;

	/**
	 * The cached value of the '{@link #getInteractionOperator() <em>Interaction Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInteractionOperator()
	 * @generated
	 * @ordered
	 */
	protected InteractionOperator interactionOperator = INTERACTION_OPERATOR_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOperands() <em>Operand</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperands()
	 * @generated
	 * @ordered
	 */
	protected EList operand = null;

	/**
	 * The cached value of the '{@link #getCfragmentGates() <em>Cfragment Gate</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCfragmentGates()
	 * @generated
	 * @ordered
	 */
	protected EList cfragmentGate = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CombinedFragmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return UML2Package.eINSTANCE.getCombinedFragment();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * Returns the value of the '<em><b>Interaction Operator</b></em>' attribute.
	 * @generated
	 */
	public InteractionOperator getInteractionOperator() {
		return interactionOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInteractionOperator(InteractionOperator newInteractionOperator) {
		InteractionOperator oldInteractionOperator = interactionOperator;
		interactionOperator = newInteractionOperator == null ? INTERACTION_OPERATOR_EDEFAULT : newInteractionOperator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2Package.COMBINED_FRAGMENT__INTERACTION_OPERATOR, oldInteractionOperator, interactionOperator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * Returns the value of the '<em><b>Operand</b></em>' containment reference list.
	 * <p>
	 * Subsets the following features:
	 * <ul>
	 *   <li>{@link org.eclipse.uml2.Element#getOwnedElements}</li>
	 * </ul>
	 * </p>
	 * @generated
	 */
	public EList getOperands() {
		if (operand == null) {
			operand = new EObjectContainmentEList(InteractionOperand.class, this, UML2Package.COMBINED_FRAGMENT__OPERAND);
		}
		return operand;
	}

    /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
     */
    public InteractionOperand getOperand(String unqualifiedName) {
    	for (Iterator i = getOperands().iterator(); i.hasNext(); ) {
    		InteractionOperand namedOperand = (InteractionOperand) i.next();
    		
    		if (unqualifiedName.equals(namedOperand.getName())) {
    			return namedOperand;
    		}
    	}
    	
    	return null;
    }
      
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InteractionOperand createOperand(EClass eClass) {
		InteractionOperand newOperand = (InteractionOperand) eClass.getEPackage().getEFactoryInstance().create(eClass);
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.CREATE, UML2Package.COMBINED_FRAGMENT__OPERAND, null, newOperand));
		}
		getOperands().add(newOperand);
		return newOperand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * Returns the value of the '<em><b>Cfragment Gate</b></em>' containment reference list.
	 * <p>
	 * Subsets the following features:
	 * <ul>
	 *   <li>{@link org.eclipse.uml2.Element#getOwnedElements}</li>
	 * </ul>
	 * </p>
	 * @generated
	 */
	public EList getCfragmentGates() {
		if (cfragmentGate == null) {
			cfragmentGate = new EObjectContainmentEList(Gate.class, this, UML2Package.COMBINED_FRAGMENT__CFRAGMENT_GATE);
		}
		return cfragmentGate;
	}

    /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
     */
    public Gate getCfragmentGate(String unqualifiedName) {
    	for (Iterator i = getCfragmentGates().iterator(); i.hasNext(); ) {
    		Gate namedCfragmentGate = (Gate) i.next();
    		
    		if (unqualifiedName.equals(namedCfragmentGate.getName())) {
    			return namedCfragmentGate;
    		}
    	}
    	
    	return null;
    }
      
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Gate createCfragmentGate(EClass eClass) {
		Gate newCfragmentGate = (Gate) eClass.getEPackage().getEFactoryInstance().create(eClass);
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.CREATE, UML2Package.COMBINED_FRAGMENT__CFRAGMENT_GATE, null, newCfragmentGate));
		}
		getCfragmentGates().add(newCfragmentGate);
		return newCfragmentGate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * Returns the value of the '<em><b>Owned Element</b></em>' reference list, a derived union.
	 * The list contents are of type {@link org.eclipse.uml2.Element}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.uml2.Element#getOwner <em>Owner</em>}'.
	 * @generated
	 */
	public EList getOwnedElements() {
		// TODO: test this union getter
		if (!getCacheAdapter().containsKey(this, UML2Package.eINSTANCE.getElement_OwnedElement())) {
			Set union = new LinkedHashSet();
			union.addAll(super.getOwnedElements());
			union.addAll(getOperands());
			union.addAll(getCfragmentGates());
			getCacheAdapter().put(
				this,
				UML2Package.eINSTANCE.getElement_OwnedElement(),
				new EcoreEList.UnmodifiableEList(this, 
					UML2Package.eINSTANCE.getElement_OwnedElement(),
					union.size(),
					union.toArray()));
		}
		return (EList) getCacheAdapter().get(this, UML2Package.eINSTANCE.getElement_OwnedElement());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, Class baseClass, NotificationChain msgs) {
		if (featureID >= 0) {
			switch (eDerivedStructuralFeatureID(featureID, baseClass)) {
				case UML2Package.COMBINED_FRAGMENT__EANNOTATIONS:
					return ((InternalEList)getEAnnotations()).basicAdd(otherEnd, msgs);
				case UML2Package.COMBINED_FRAGMENT__TEMPLATE_BINDING:
					return ((InternalEList)getTemplateBindings()).basicAdd(otherEnd, msgs);
				case UML2Package.COMBINED_FRAGMENT__OWNED_TEMPLATE_SIGNATURE:
					if (ownedTemplateSignature != null)
						msgs = ((InternalEObject)ownedTemplateSignature).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UML2Package.COMBINED_FRAGMENT__OWNED_TEMPLATE_SIGNATURE, null, msgs);
					return basicSetOwnedTemplateSignature((TemplateSignature)otherEnd, msgs);
				case UML2Package.COMBINED_FRAGMENT__CLIENT_DEPENDENCY:
					return ((InternalEList)getClientDependencies()).basicAdd(otherEnd, msgs);
				case UML2Package.COMBINED_FRAGMENT__COVERED:
					return ((InternalEList)getCovereds()).basicAdd(otherEnd, msgs);
				case UML2Package.COMBINED_FRAGMENT__ENCLOSING_INTERACTION:
					if (eContainer != null)
						msgs = eBasicRemoveFromContainer(msgs);
					return eBasicSetContainer(otherEnd, UML2Package.COMBINED_FRAGMENT__ENCLOSING_INTERACTION, msgs);
				case UML2Package.COMBINED_FRAGMENT__ENCLOSING_OPERAND:
					if (eContainer != null)
						msgs = eBasicRemoveFromContainer(msgs);
					return eBasicSetContainer(otherEnd, UML2Package.COMBINED_FRAGMENT__ENCLOSING_OPERAND, msgs);
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
				case UML2Package.COMBINED_FRAGMENT__EANNOTATIONS:
					return ((InternalEList)getEAnnotations()).basicRemove(otherEnd, msgs);
				case UML2Package.COMBINED_FRAGMENT__OWNED_COMMENT:
					return ((InternalEList)getOwnedComments()).basicRemove(otherEnd, msgs);
				case UML2Package.COMBINED_FRAGMENT__TEMPLATE_BINDING:
					return ((InternalEList)getTemplateBindings()).basicRemove(otherEnd, msgs);
				case UML2Package.COMBINED_FRAGMENT__OWNED_TEMPLATE_SIGNATURE:
					return basicSetOwnedTemplateSignature(null, msgs);
				case UML2Package.COMBINED_FRAGMENT__CLIENT_DEPENDENCY:
					return ((InternalEList)getClientDependencies()).basicRemove(otherEnd, msgs);
				case UML2Package.COMBINED_FRAGMENT__NAME_EXPRESSION:
					return basicSetNameExpression(null, msgs);
				case UML2Package.COMBINED_FRAGMENT__COVERED:
					return ((InternalEList)getCovereds()).basicRemove(otherEnd, msgs);
				case UML2Package.COMBINED_FRAGMENT__GENERAL_ORDERING:
					return ((InternalEList)getGeneralOrderings()).basicRemove(otherEnd, msgs);
				case UML2Package.COMBINED_FRAGMENT__ENCLOSING_INTERACTION:
					return eBasicSetContainer(null, UML2Package.COMBINED_FRAGMENT__ENCLOSING_INTERACTION, msgs);
				case UML2Package.COMBINED_FRAGMENT__ENCLOSING_OPERAND:
					return eBasicSetContainer(null, UML2Package.COMBINED_FRAGMENT__ENCLOSING_OPERAND, msgs);
				case UML2Package.COMBINED_FRAGMENT__OPERAND:
					return ((InternalEList)getOperands()).basicRemove(otherEnd, msgs);
				case UML2Package.COMBINED_FRAGMENT__CFRAGMENT_GATE:
					return ((InternalEList)getCfragmentGates()).basicRemove(otherEnd, msgs);
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
				case UML2Package.COMBINED_FRAGMENT__ENCLOSING_INTERACTION:
					return eContainer.eInverseRemove(this, UML2Package.INTERACTION__FRAGMENT, Interaction.class, msgs);
				case UML2Package.COMBINED_FRAGMENT__ENCLOSING_OPERAND:
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
			case UML2Package.COMBINED_FRAGMENT__EANNOTATIONS:
				return getEAnnotations();
			case UML2Package.COMBINED_FRAGMENT__OWNED_ELEMENT:
				return getOwnedElements();
			case UML2Package.COMBINED_FRAGMENT__OWNER:
				if (resolve) return getOwner();
				return basicGetOwner();
			case UML2Package.COMBINED_FRAGMENT__OWNED_COMMENT:
				return getOwnedComments();
			case UML2Package.COMBINED_FRAGMENT__TEMPLATE_BINDING:
				return getTemplateBindings();
			case UML2Package.COMBINED_FRAGMENT__OWNED_TEMPLATE_SIGNATURE:
				return getOwnedTemplateSignature();
			case UML2Package.COMBINED_FRAGMENT__NAME:
				return getName();
			case UML2Package.COMBINED_FRAGMENT__QUALIFIED_NAME:
				return getQualifiedName();
			case UML2Package.COMBINED_FRAGMENT__VISIBILITY:
				return getVisibility();
			case UML2Package.COMBINED_FRAGMENT__CLIENT_DEPENDENCY:
				return getClientDependencies();
			case UML2Package.COMBINED_FRAGMENT__NAME_EXPRESSION:
				return getNameExpression();
			case UML2Package.COMBINED_FRAGMENT__COVERED:
				return getCovereds();
			case UML2Package.COMBINED_FRAGMENT__GENERAL_ORDERING:
				return getGeneralOrderings();
			case UML2Package.COMBINED_FRAGMENT__ENCLOSING_INTERACTION:
				return getEnclosingInteraction();
			case UML2Package.COMBINED_FRAGMENT__ENCLOSING_OPERAND:
				return getEnclosingOperand();
			case UML2Package.COMBINED_FRAGMENT__INTERACTION_OPERATOR:
				return getInteractionOperator();
			case UML2Package.COMBINED_FRAGMENT__OPERAND:
				return getOperands();
			case UML2Package.COMBINED_FRAGMENT__CFRAGMENT_GATE:
				return getCfragmentGates();
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
			case UML2Package.COMBINED_FRAGMENT__EANNOTATIONS:
				getEAnnotations().clear();
				getEAnnotations().addAll((Collection)newValue);
				return;
			case UML2Package.COMBINED_FRAGMENT__OWNED_COMMENT:
				getOwnedComments().clear();
				getOwnedComments().addAll((Collection)newValue);
				return;
			case UML2Package.COMBINED_FRAGMENT__TEMPLATE_BINDING:
				getTemplateBindings().clear();
				getTemplateBindings().addAll((Collection)newValue);
				return;
			case UML2Package.COMBINED_FRAGMENT__OWNED_TEMPLATE_SIGNATURE:
				setOwnedTemplateSignature((TemplateSignature)newValue);
				return;
			case UML2Package.COMBINED_FRAGMENT__NAME:
				setName((String)newValue);
				return;
			case UML2Package.COMBINED_FRAGMENT__VISIBILITY:
				setVisibility((VisibilityKind)newValue);
				return;
			case UML2Package.COMBINED_FRAGMENT__CLIENT_DEPENDENCY:
				getClientDependencies().clear();
				getClientDependencies().addAll((Collection)newValue);
				return;
			case UML2Package.COMBINED_FRAGMENT__NAME_EXPRESSION:
				setNameExpression((StringExpression)newValue);
				return;
			case UML2Package.COMBINED_FRAGMENT__COVERED:
				getCovereds().clear();
				getCovereds().addAll((Collection)newValue);
				return;
			case UML2Package.COMBINED_FRAGMENT__GENERAL_ORDERING:
				getGeneralOrderings().clear();
				getGeneralOrderings().addAll((Collection)newValue);
				return;
			case UML2Package.COMBINED_FRAGMENT__ENCLOSING_INTERACTION:
				setEnclosingInteraction((Interaction)newValue);
				return;
			case UML2Package.COMBINED_FRAGMENT__ENCLOSING_OPERAND:
				setEnclosingOperand((InteractionOperand)newValue);
				return;
			case UML2Package.COMBINED_FRAGMENT__INTERACTION_OPERATOR:
				setInteractionOperator((InteractionOperator)newValue);
				return;
			case UML2Package.COMBINED_FRAGMENT__OPERAND:
				getOperands().clear();
				getOperands().addAll((Collection)newValue);
				return;
			case UML2Package.COMBINED_FRAGMENT__CFRAGMENT_GATE:
				getCfragmentGates().clear();
				getCfragmentGates().addAll((Collection)newValue);
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
			case UML2Package.COMBINED_FRAGMENT__EANNOTATIONS:
				getEAnnotations().clear();
				return;
			case UML2Package.COMBINED_FRAGMENT__OWNED_COMMENT:
				getOwnedComments().clear();
				return;
			case UML2Package.COMBINED_FRAGMENT__TEMPLATE_BINDING:
				getTemplateBindings().clear();
				return;
			case UML2Package.COMBINED_FRAGMENT__OWNED_TEMPLATE_SIGNATURE:
				setOwnedTemplateSignature((TemplateSignature)null);
				return;
			case UML2Package.COMBINED_FRAGMENT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case UML2Package.COMBINED_FRAGMENT__VISIBILITY:
				setVisibility(VISIBILITY_EDEFAULT);
				return;
			case UML2Package.COMBINED_FRAGMENT__CLIENT_DEPENDENCY:
				getClientDependencies().clear();
				return;
			case UML2Package.COMBINED_FRAGMENT__NAME_EXPRESSION:
				setNameExpression((StringExpression)null);
				return;
			case UML2Package.COMBINED_FRAGMENT__COVERED:
				getCovereds().clear();
				return;
			case UML2Package.COMBINED_FRAGMENT__GENERAL_ORDERING:
				getGeneralOrderings().clear();
				return;
			case UML2Package.COMBINED_FRAGMENT__ENCLOSING_INTERACTION:
				setEnclosingInteraction((Interaction)null);
				return;
			case UML2Package.COMBINED_FRAGMENT__ENCLOSING_OPERAND:
				setEnclosingOperand((InteractionOperand)null);
				return;
			case UML2Package.COMBINED_FRAGMENT__INTERACTION_OPERATOR:
				setInteractionOperator(INTERACTION_OPERATOR_EDEFAULT);
				return;
			case UML2Package.COMBINED_FRAGMENT__OPERAND:
				getOperands().clear();
				return;
			case UML2Package.COMBINED_FRAGMENT__CFRAGMENT_GATE:
				getCfragmentGates().clear();
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
			case UML2Package.COMBINED_FRAGMENT__EANNOTATIONS:
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UML2Package.COMBINED_FRAGMENT__OWNED_ELEMENT:
				return !getOwnedElements().isEmpty();
			case UML2Package.COMBINED_FRAGMENT__OWNER:
				return basicGetOwner() != null;
			case UML2Package.COMBINED_FRAGMENT__OWNED_COMMENT:
				return ownedComment != null && !ownedComment.isEmpty();
			case UML2Package.COMBINED_FRAGMENT__TEMPLATE_BINDING:
				return templateBinding != null && !templateBinding.isEmpty();
			case UML2Package.COMBINED_FRAGMENT__OWNED_TEMPLATE_SIGNATURE:
				return ownedTemplateSignature != null;
			case UML2Package.COMBINED_FRAGMENT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case UML2Package.COMBINED_FRAGMENT__QUALIFIED_NAME:
				return !"".equals(getQualifiedName()); //$NON-NLS-1$
			case UML2Package.COMBINED_FRAGMENT__VISIBILITY:
				return visibility != VISIBILITY_EDEFAULT;
			case UML2Package.COMBINED_FRAGMENT__CLIENT_DEPENDENCY:
				return clientDependency != null && !clientDependency.isEmpty();
			case UML2Package.COMBINED_FRAGMENT__NAME_EXPRESSION:
				return nameExpression != null;
			case UML2Package.COMBINED_FRAGMENT__COVERED:
				return covered != null && !covered.isEmpty();
			case UML2Package.COMBINED_FRAGMENT__GENERAL_ORDERING:
				return generalOrdering != null && !generalOrdering.isEmpty();
			case UML2Package.COMBINED_FRAGMENT__ENCLOSING_INTERACTION:
				return getEnclosingInteraction() != null;
			case UML2Package.COMBINED_FRAGMENT__ENCLOSING_OPERAND:
				return getEnclosingOperand() != null;
			case UML2Package.COMBINED_FRAGMENT__INTERACTION_OPERATOR:
				return interactionOperator != INTERACTION_OPERATOR_EDEFAULT;
			case UML2Package.COMBINED_FRAGMENT__OPERAND:
				return operand != null && !operand.isEmpty();
			case UML2Package.COMBINED_FRAGMENT__CFRAGMENT_GATE:
				return cfragmentGate != null && !cfragmentGate.isEmpty();
		}
		return eDynamicIsSet(eFeature);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (interactionOperator: "); //$NON-NLS-1$
		result.append(interactionOperator);
		result.append(')');
		return result.toString();
	}

} //CombinedFragmentImpl
