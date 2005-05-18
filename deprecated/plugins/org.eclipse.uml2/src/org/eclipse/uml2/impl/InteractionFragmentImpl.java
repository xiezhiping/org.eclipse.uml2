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
 * $Id: InteractionFragmentImpl.java,v 1.9 2005/05/18 16:38:27 khussey Exp $
 */
package org.eclipse.uml2.impl;

import java.util.Collection;
import java.util.Iterator;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.uml2.GeneralOrdering;
import org.eclipse.uml2.Interaction;
import org.eclipse.uml2.InteractionFragment;
import org.eclipse.uml2.InteractionOperand;
import org.eclipse.uml2.Lifeline;
import org.eclipse.uml2.Namespace;
import org.eclipse.uml2.StringExpression;
import org.eclipse.uml2.TemplateSignature;
import org.eclipse.uml2.UML2Factory;
import org.eclipse.uml2.UML2Package;
import org.eclipse.uml2.VisibilityKind;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Interaction Fragment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2.impl.InteractionFragmentImpl#getCovereds <em>Covered</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.InteractionFragmentImpl#getGeneralOrderings <em>General Ordering</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.InteractionFragmentImpl#getEnclosingInteraction <em>Enclosing Interaction</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.InteractionFragmentImpl#getEnclosingOperand <em>Enclosing Operand</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class InteractionFragmentImpl extends NamedElementImpl implements InteractionFragment {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) IBM Corporation and others."; //$NON-NLS-1$

	/**
	 * The cached value of the '{@link #getCovereds() <em>Covered</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCovereds()
	 * @generated
	 * @ordered
	 */
	protected EList covered = null;

	/**
	 * The cached value of the '{@link #getGeneralOrderings() <em>General Ordering</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneralOrderings()
	 * @generated
	 * @ordered
	 */
	protected EList generalOrdering = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InteractionFragmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return UML2Package.eINSTANCE.getInteractionFragment();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getCovereds() {
		if (covered == null) {
			covered = new EObjectWithInverseResolvingEList.ManyInverse(Lifeline.class, this, UML2Package.INTERACTION_FRAGMENT__COVERED, UML2Package.LIFELINE__COVERED_BY);
		}
		return covered;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
    public Lifeline getCovered(String name) {
		for (Iterator i = getCovereds().iterator(); i.hasNext(); ) {
			Lifeline covered = (Lifeline) i.next();
			if (name.equals(covered.getName())) {
				return covered;
			}
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getGeneralOrderings() {
		if (generalOrdering == null) {
			generalOrdering = new EObjectContainmentEList(GeneralOrdering.class, this, UML2Package.INTERACTION_FRAGMENT__GENERAL_ORDERING);
		}
		return generalOrdering;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
    public GeneralOrdering getGeneralOrdering(String name) {
		for (Iterator i = getGeneralOrderings().iterator(); i.hasNext(); ) {
			GeneralOrdering generalOrdering = (GeneralOrdering) i.next();
			if (name.equals(generalOrdering.getName())) {
				return generalOrdering;
			}
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 * @deprecated Use #createGeneralOrdering() instead.
	 */
	public GeneralOrdering createGeneralOrdering(EClass eClass) {
		GeneralOrdering newGeneralOrdering = (GeneralOrdering) eClass.getEPackage().getEFactoryInstance().create(eClass);
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, 0, UML2Package.INTERACTION_FRAGMENT__GENERAL_ORDERING, null, newGeneralOrdering));
		}
		getGeneralOrderings().add(newGeneralOrdering);
		return newGeneralOrdering;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeneralOrdering createGeneralOrdering() {
		GeneralOrdering newGeneralOrdering = UML2Factory.eINSTANCE.createGeneralOrdering();
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, 0, UML2Package.INTERACTION_FRAGMENT__GENERAL_ORDERING, null, newGeneralOrdering));
		}
		getGeneralOrderings().add(newGeneralOrdering);
		return newGeneralOrdering;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Interaction getEnclosingInteraction() {
		if (eContainerFeatureID != UML2Package.INTERACTION_FRAGMENT__ENCLOSING_INTERACTION) return null;
		return (Interaction)eContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnclosingInteraction(Interaction newEnclosingInteraction) {
		if (newEnclosingInteraction != eContainer || (eContainerFeatureID != UML2Package.INTERACTION_FRAGMENT__ENCLOSING_INTERACTION && newEnclosingInteraction != null)) {
			if (EcoreUtil.isAncestor(this, newEnclosingInteraction))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString()); //$NON-NLS-1$
			NotificationChain msgs = null;
			if (eContainer != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newEnclosingInteraction != null)
				msgs = ((InternalEObject)newEnclosingInteraction).eInverseAdd(this, UML2Package.INTERACTION__FRAGMENT, Interaction.class, msgs);
			msgs = eBasicSetContainer((InternalEObject)newEnclosingInteraction, UML2Package.INTERACTION_FRAGMENT__ENCLOSING_INTERACTION, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2Package.INTERACTION_FRAGMENT__ENCLOSING_INTERACTION, newEnclosingInteraction, newEnclosingInteraction));

	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InteractionOperand getEnclosingOperand() {
		if (eContainerFeatureID != UML2Package.INTERACTION_FRAGMENT__ENCLOSING_OPERAND) return null;
		return (InteractionOperand)eContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnclosingOperand(InteractionOperand newEnclosingOperand) {
		if (newEnclosingOperand != eContainer || (eContainerFeatureID != UML2Package.INTERACTION_FRAGMENT__ENCLOSING_OPERAND && newEnclosingOperand != null)) {
			if (EcoreUtil.isAncestor(this, newEnclosingOperand))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString()); //$NON-NLS-1$
			NotificationChain msgs = null;
			if (eContainer != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newEnclosingOperand != null)
				msgs = ((InternalEObject)newEnclosingOperand).eInverseAdd(this, UML2Package.INTERACTION_OPERAND__FRAGMENT, InteractionOperand.class, msgs);
			msgs = eBasicSetContainer((InternalEObject)newEnclosingOperand, UML2Package.INTERACTION_FRAGMENT__ENCLOSING_OPERAND, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2Package.INTERACTION_FRAGMENT__ENCLOSING_OPERAND, newEnclosingOperand, newEnclosingOperand));

	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Namespace basicGetNamespace() {
		InteractionOperand enclosingOperand = getEnclosingOperand();			
		if (enclosingOperand != null) {
			return enclosingOperand;
		}
		return super.basicGetNamespace();
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, Class baseClass, NotificationChain msgs) {
		if (featureID >= 0) {
			switch (eDerivedStructuralFeatureID(featureID, baseClass)) {
				case UML2Package.INTERACTION_FRAGMENT__EANNOTATIONS:
					return ((InternalEList)getEAnnotations()).basicAdd(otherEnd, msgs);
				case UML2Package.INTERACTION_FRAGMENT__TEMPLATE_BINDING:
					return ((InternalEList)getTemplateBindings()).basicAdd(otherEnd, msgs);
				case UML2Package.INTERACTION_FRAGMENT__OWNED_TEMPLATE_SIGNATURE:
					if (ownedTemplateSignature != null)
						msgs = ((InternalEObject)ownedTemplateSignature).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UML2Package.INTERACTION_FRAGMENT__OWNED_TEMPLATE_SIGNATURE, null, msgs);
					return basicSetOwnedTemplateSignature((TemplateSignature)otherEnd, msgs);
				case UML2Package.INTERACTION_FRAGMENT__CLIENT_DEPENDENCY:
					return ((InternalEList)getClientDependencies()).basicAdd(otherEnd, msgs);
				case UML2Package.INTERACTION_FRAGMENT__COVERED:
					return ((InternalEList)getCovereds()).basicAdd(otherEnd, msgs);
				case UML2Package.INTERACTION_FRAGMENT__ENCLOSING_INTERACTION:
					if (eContainer != null)
						msgs = eBasicRemoveFromContainer(msgs);
					return eBasicSetContainer(otherEnd, UML2Package.INTERACTION_FRAGMENT__ENCLOSING_INTERACTION, msgs);
				case UML2Package.INTERACTION_FRAGMENT__ENCLOSING_OPERAND:
					if (eContainer != null)
						msgs = eBasicRemoveFromContainer(msgs);
					return eBasicSetContainer(otherEnd, UML2Package.INTERACTION_FRAGMENT__ENCLOSING_OPERAND, msgs);
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
				case UML2Package.INTERACTION_FRAGMENT__EANNOTATIONS:
					return ((InternalEList)getEAnnotations()).basicRemove(otherEnd, msgs);
				case UML2Package.INTERACTION_FRAGMENT__OWNED_COMMENT:
					return ((InternalEList)getOwnedComments()).basicRemove(otherEnd, msgs);
				case UML2Package.INTERACTION_FRAGMENT__TEMPLATE_BINDING:
					return ((InternalEList)getTemplateBindings()).basicRemove(otherEnd, msgs);
				case UML2Package.INTERACTION_FRAGMENT__OWNED_TEMPLATE_SIGNATURE:
					return basicSetOwnedTemplateSignature(null, msgs);
				case UML2Package.INTERACTION_FRAGMENT__CLIENT_DEPENDENCY:
					return ((InternalEList)getClientDependencies()).basicRemove(otherEnd, msgs);
				case UML2Package.INTERACTION_FRAGMENT__NAME_EXPRESSION:
					return basicSetNameExpression(null, msgs);
				case UML2Package.INTERACTION_FRAGMENT__COVERED:
					return ((InternalEList)getCovereds()).basicRemove(otherEnd, msgs);
				case UML2Package.INTERACTION_FRAGMENT__GENERAL_ORDERING:
					return ((InternalEList)getGeneralOrderings()).basicRemove(otherEnd, msgs);
				case UML2Package.INTERACTION_FRAGMENT__ENCLOSING_INTERACTION:
					return eBasicSetContainer(null, UML2Package.INTERACTION_FRAGMENT__ENCLOSING_INTERACTION, msgs);
				case UML2Package.INTERACTION_FRAGMENT__ENCLOSING_OPERAND:
					return eBasicSetContainer(null, UML2Package.INTERACTION_FRAGMENT__ENCLOSING_OPERAND, msgs);
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
				case UML2Package.INTERACTION_FRAGMENT__ENCLOSING_INTERACTION:
					return eContainer.eInverseRemove(this, UML2Package.INTERACTION__FRAGMENT, Interaction.class, msgs);
				case UML2Package.INTERACTION_FRAGMENT__ENCLOSING_OPERAND:
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
			case UML2Package.INTERACTION_FRAGMENT__EANNOTATIONS:
				return getEAnnotations();
			case UML2Package.INTERACTION_FRAGMENT__OWNED_ELEMENT:
				return getOwnedElements();
			case UML2Package.INTERACTION_FRAGMENT__OWNER:
				if (resolve) return getOwner();
				return basicGetOwner();
			case UML2Package.INTERACTION_FRAGMENT__OWNED_COMMENT:
				return getOwnedComments();
			case UML2Package.INTERACTION_FRAGMENT__TEMPLATE_BINDING:
				return getTemplateBindings();
			case UML2Package.INTERACTION_FRAGMENT__OWNED_TEMPLATE_SIGNATURE:
				return getOwnedTemplateSignature();
			case UML2Package.INTERACTION_FRAGMENT__NAME:
				return getName();
			case UML2Package.INTERACTION_FRAGMENT__QUALIFIED_NAME:
				return getQualifiedName();
			case UML2Package.INTERACTION_FRAGMENT__VISIBILITY:
				return getVisibility();
			case UML2Package.INTERACTION_FRAGMENT__CLIENT_DEPENDENCY:
				return getClientDependencies();
			case UML2Package.INTERACTION_FRAGMENT__NAME_EXPRESSION:
				return getNameExpression();
			case UML2Package.INTERACTION_FRAGMENT__COVERED:
				return getCovereds();
			case UML2Package.INTERACTION_FRAGMENT__GENERAL_ORDERING:
				return getGeneralOrderings();
			case UML2Package.INTERACTION_FRAGMENT__ENCLOSING_INTERACTION:
				return getEnclosingInteraction();
			case UML2Package.INTERACTION_FRAGMENT__ENCLOSING_OPERAND:
				return getEnclosingOperand();
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
			case UML2Package.INTERACTION_FRAGMENT__EANNOTATIONS:
				getEAnnotations().clear();
				getEAnnotations().addAll((Collection)newValue);
				return;
			case UML2Package.INTERACTION_FRAGMENT__OWNED_COMMENT:
				getOwnedComments().clear();
				getOwnedComments().addAll((Collection)newValue);
				return;
			case UML2Package.INTERACTION_FRAGMENT__TEMPLATE_BINDING:
				getTemplateBindings().clear();
				getTemplateBindings().addAll((Collection)newValue);
				return;
			case UML2Package.INTERACTION_FRAGMENT__OWNED_TEMPLATE_SIGNATURE:
				setOwnedTemplateSignature((TemplateSignature)newValue);
				return;
			case UML2Package.INTERACTION_FRAGMENT__NAME:
				setName((String)newValue);
				return;
			case UML2Package.INTERACTION_FRAGMENT__VISIBILITY:
				setVisibility((VisibilityKind)newValue);
				return;
			case UML2Package.INTERACTION_FRAGMENT__CLIENT_DEPENDENCY:
				getClientDependencies().clear();
				getClientDependencies().addAll((Collection)newValue);
				return;
			case UML2Package.INTERACTION_FRAGMENT__NAME_EXPRESSION:
				setNameExpression((StringExpression)newValue);
				return;
			case UML2Package.INTERACTION_FRAGMENT__COVERED:
				getCovereds().clear();
				getCovereds().addAll((Collection)newValue);
				return;
			case UML2Package.INTERACTION_FRAGMENT__GENERAL_ORDERING:
				getGeneralOrderings().clear();
				getGeneralOrderings().addAll((Collection)newValue);
				return;
			case UML2Package.INTERACTION_FRAGMENT__ENCLOSING_INTERACTION:
				setEnclosingInteraction((Interaction)newValue);
				return;
			case UML2Package.INTERACTION_FRAGMENT__ENCLOSING_OPERAND:
				setEnclosingOperand((InteractionOperand)newValue);
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
			case UML2Package.INTERACTION_FRAGMENT__EANNOTATIONS:
				getEAnnotations().clear();
				return;
			case UML2Package.INTERACTION_FRAGMENT__OWNED_COMMENT:
				getOwnedComments().clear();
				return;
			case UML2Package.INTERACTION_FRAGMENT__TEMPLATE_BINDING:
				getTemplateBindings().clear();
				return;
			case UML2Package.INTERACTION_FRAGMENT__OWNED_TEMPLATE_SIGNATURE:
				setOwnedTemplateSignature((TemplateSignature)null);
				return;
			case UML2Package.INTERACTION_FRAGMENT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case UML2Package.INTERACTION_FRAGMENT__VISIBILITY:
				setVisibility(VISIBILITY_EDEFAULT);
				return;
			case UML2Package.INTERACTION_FRAGMENT__CLIENT_DEPENDENCY:
				getClientDependencies().clear();
				return;
			case UML2Package.INTERACTION_FRAGMENT__NAME_EXPRESSION:
				setNameExpression((StringExpression)null);
				return;
			case UML2Package.INTERACTION_FRAGMENT__COVERED:
				getCovereds().clear();
				return;
			case UML2Package.INTERACTION_FRAGMENT__GENERAL_ORDERING:
				getGeneralOrderings().clear();
				return;
			case UML2Package.INTERACTION_FRAGMENT__ENCLOSING_INTERACTION:
				setEnclosingInteraction((Interaction)null);
				return;
			case UML2Package.INTERACTION_FRAGMENT__ENCLOSING_OPERAND:
				setEnclosingOperand((InteractionOperand)null);
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
			case UML2Package.INTERACTION_FRAGMENT__EANNOTATIONS:
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UML2Package.INTERACTION_FRAGMENT__OWNED_ELEMENT:
				return !getOwnedElements().isEmpty();
			case UML2Package.INTERACTION_FRAGMENT__OWNER:
				return basicGetOwner() != null;
			case UML2Package.INTERACTION_FRAGMENT__OWNED_COMMENT:
				return ownedComment != null && !ownedComment.isEmpty();
			case UML2Package.INTERACTION_FRAGMENT__TEMPLATE_BINDING:
				return templateBinding != null && !templateBinding.isEmpty();
			case UML2Package.INTERACTION_FRAGMENT__OWNED_TEMPLATE_SIGNATURE:
				return ownedTemplateSignature != null;
			case UML2Package.INTERACTION_FRAGMENT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case UML2Package.INTERACTION_FRAGMENT__QUALIFIED_NAME:
				return QUALIFIED_NAME_EDEFAULT == null ? getQualifiedName() != null : !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case UML2Package.INTERACTION_FRAGMENT__VISIBILITY:
				return visibility != VISIBILITY_EDEFAULT;
			case UML2Package.INTERACTION_FRAGMENT__CLIENT_DEPENDENCY:
				return clientDependency != null && !clientDependency.isEmpty();
			case UML2Package.INTERACTION_FRAGMENT__NAME_EXPRESSION:
				return nameExpression != null;
			case UML2Package.INTERACTION_FRAGMENT__COVERED:
				return covered != null && !covered.isEmpty();
			case UML2Package.INTERACTION_FRAGMENT__GENERAL_ORDERING:
				return generalOrdering != null && !generalOrdering.isEmpty();
			case UML2Package.INTERACTION_FRAGMENT__ENCLOSING_INTERACTION:
				return getEnclosingInteraction() != null;
			case UML2Package.INTERACTION_FRAGMENT__ENCLOSING_OPERAND:
				return getEnclosingOperand() != null;
		}
		return eDynamicIsSet(eFeature);
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EList getOwnedElementsHelper(EList ownedElement) {
		super.getOwnedElementsHelper(ownedElement);
		if (generalOrdering != null) {
			ownedElement.addAll(generalOrdering);
		}
		return ownedElement;
	}


} //InteractionFragmentImpl
