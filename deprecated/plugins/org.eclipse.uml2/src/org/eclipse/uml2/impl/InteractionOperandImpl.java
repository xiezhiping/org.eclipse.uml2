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
 * $Id: InteractionOperandImpl.java,v 1.21 2005/11/23 20:05:08 khussey Exp $
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
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.uml2.GeneralOrdering;
import org.eclipse.uml2.Interaction;
import org.eclipse.uml2.InteractionConstraint;
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
 * An implementation of the model object '<em><b>Interaction Operand</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2.impl.InteractionOperandImpl#getCovereds <em>Covered</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.InteractionOperandImpl#getGeneralOrderings <em>General Ordering</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.InteractionOperandImpl#getEnclosingInteraction <em>Enclosing Interaction</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.InteractionOperandImpl#getEnclosingOperand <em>Enclosing Operand</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.InteractionOperandImpl#getGuard <em>Guard</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.InteractionOperandImpl#getFragments <em>Fragment</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InteractionOperandImpl extends NamespaceImpl implements InteractionOperand {
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
	protected InteractionOperandImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return UML2Package.Literals.INTERACTION_OPERAND;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getCovereds() {
		EList covered = (EList)eVirtualGet(UML2Package.INTERACTION_OPERAND__COVERED);
		if (covered == null) {
			eVirtualSet(UML2Package.INTERACTION_OPERAND__COVERED, covered = new EObjectWithInverseResolvingEList.ManyInverse(Lifeline.class, this, UML2Package.INTERACTION_OPERAND__COVERED, UML2Package.LIFELINE__COVERED_BY));
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
		EList generalOrdering = (EList)eVirtualGet(UML2Package.INTERACTION_OPERAND__GENERAL_ORDERING);
		if (generalOrdering == null) {
			eVirtualSet(UML2Package.INTERACTION_OPERAND__GENERAL_ORDERING, generalOrdering = new EObjectContainmentEList(GeneralOrdering.class, this, UML2Package.INTERACTION_OPERAND__GENERAL_ORDERING));
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
			eNotify(new ENotificationImpl(this, 0, UML2Package.INTERACTION_OPERAND__GENERAL_ORDERING, null, newGeneralOrdering));
		}
		getGeneralOrderings().add(newGeneralOrdering);
		return newGeneralOrdering;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public GeneralOrdering createGeneralOrdering() {
		GeneralOrdering newGeneralOrdering = UML2Factory.eINSTANCE.createGeneralOrdering();
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, 0, UML2Package.INTERACTION_OPERAND__GENERAL_ORDERING, null, newGeneralOrdering));
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
		if (eContainerFeatureID != UML2Package.INTERACTION_OPERAND__ENCLOSING_INTERACTION) return null;
		return (Interaction)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnclosingInteraction(Interaction newEnclosingInteraction) {
		if (newEnclosingInteraction != eInternalContainer() || (eContainerFeatureID != UML2Package.INTERACTION_OPERAND__ENCLOSING_INTERACTION && newEnclosingInteraction != null)) {
			if (EcoreUtil.isAncestor(this, newEnclosingInteraction))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString()); //$NON-NLS-1$
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newEnclosingInteraction != null)
				msgs = ((InternalEObject)newEnclosingInteraction).eInverseAdd(this, UML2Package.INTERACTION__FRAGMENT, Interaction.class, msgs);
			msgs = eBasicSetContainer((InternalEObject)newEnclosingInteraction, UML2Package.INTERACTION_OPERAND__ENCLOSING_INTERACTION, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2Package.INTERACTION_OPERAND__ENCLOSING_INTERACTION, newEnclosingInteraction, newEnclosingInteraction));

	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InteractionOperand getEnclosingOperand() {
		if (eContainerFeatureID != UML2Package.INTERACTION_OPERAND__ENCLOSING_OPERAND) return null;
		return (InteractionOperand)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnclosingOperand(InteractionOperand newEnclosingOperand) {
		if (newEnclosingOperand != eInternalContainer() || (eContainerFeatureID != UML2Package.INTERACTION_OPERAND__ENCLOSING_OPERAND && newEnclosingOperand != null)) {
			if (EcoreUtil.isAncestor(this, newEnclosingOperand))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString()); //$NON-NLS-1$
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newEnclosingOperand != null)
				msgs = ((InternalEObject)newEnclosingOperand).eInverseAdd(this, UML2Package.INTERACTION_OPERAND__FRAGMENT, InteractionOperand.class, msgs);
			msgs = eBasicSetContainer((InternalEObject)newEnclosingOperand, UML2Package.INTERACTION_OPERAND__ENCLOSING_OPERAND, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2Package.INTERACTION_OPERAND__ENCLOSING_OPERAND, newEnclosingOperand, newEnclosingOperand));

	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InteractionConstraint getGuard() {
		return (InteractionConstraint)eVirtualGet(UML2Package.INTERACTION_OPERAND__GUARD);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGuard(InteractionConstraint newGuard, NotificationChain msgs) {
		Object oldGuard = eVirtualSet(UML2Package.INTERACTION_OPERAND__GUARD, newGuard);
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UML2Package.INTERACTION_OPERAND__GUARD, oldGuard == EVIRTUAL_NO_VALUE ? null : oldGuard, newGuard);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}

		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGuard(InteractionConstraint newGuard) {
		InteractionConstraint guard = (InteractionConstraint)eVirtualGet(UML2Package.INTERACTION_OPERAND__GUARD);
		if (newGuard != guard) {
			NotificationChain msgs = null;
			if (guard != null)
				msgs = ((InternalEObject)guard).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UML2Package.INTERACTION_OPERAND__GUARD, null, msgs);
			if (newGuard != null)
				msgs = ((InternalEObject)newGuard).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UML2Package.INTERACTION_OPERAND__GUARD, null, msgs);
			msgs = basicSetGuard(newGuard, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2Package.INTERACTION_OPERAND__GUARD, newGuard, newGuard));

	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 * @deprecated Use #createGuard() instead.
	 */
	public InteractionConstraint createGuard(EClass eClass) {
		InteractionConstraint newGuard = (InteractionConstraint) eClass.getEPackage().getEFactoryInstance().create(eClass);
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, 0, UML2Package.INTERACTION_OPERAND__GUARD, null, newGuard));
		}
		setGuard(newGuard);
		return newGuard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public InteractionConstraint createGuard() {
		InteractionConstraint newGuard = UML2Factory.eINSTANCE.createInteractionConstraint();
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, 0, UML2Package.INTERACTION_OPERAND__GUARD, null, newGuard));
		}
		setGuard(newGuard);
		return newGuard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getFragments() {
		EList fragment = (EList)eVirtualGet(UML2Package.INTERACTION_OPERAND__FRAGMENT);
		if (fragment == null) {
			eVirtualSet(UML2Package.INTERACTION_OPERAND__FRAGMENT, fragment = new EObjectContainmentWithInverseEList(InteractionFragment.class, this, UML2Package.INTERACTION_OPERAND__FRAGMENT, UML2Package.INTERACTION_FRAGMENT__ENCLOSING_OPERAND));
		}
		return fragment;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
    public InteractionFragment getFragment(String name) {
		for (Iterator i = getFragments().iterator(); i.hasNext(); ) {
			InteractionFragment fragment = (InteractionFragment) i.next();
			if (name.equals(fragment.getName())) {
				return fragment;
			}
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public InteractionFragment createFragment(EClass eClass) {
		InteractionFragment newFragment = (InteractionFragment) eClass.getEPackage().getEFactoryInstance().create(eClass);
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, 0, UML2Package.INTERACTION_OPERAND__FRAGMENT, null, newFragment));
		}
		getFragments().add(newFragment);
		return newFragment;
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
	public boolean isSetNamespace() {
		return super.isSetNamespace()
			|| eIsSet(UML2Package.INTERACTION_OPERAND__ENCLOSING_OPERAND);
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, Class baseClass, NotificationChain msgs) {
		if (featureID >= 0) {
			switch (eDerivedStructuralFeatureID(featureID, baseClass)) {
				case UML2Package.INTERACTION_OPERAND__EANNOTATIONS:
					return ((InternalEList)getEAnnotations()).basicAdd(otherEnd, msgs);
				case UML2Package.INTERACTION_OPERAND__TEMPLATE_BINDING:
					return ((InternalEList)getTemplateBindings()).basicAdd(otherEnd, msgs);
				case UML2Package.INTERACTION_OPERAND__OWNED_TEMPLATE_SIGNATURE:
					TemplateSignature ownedTemplateSignature = (TemplateSignature)eVirtualGet(UML2Package.INTERACTION_OPERAND__OWNED_TEMPLATE_SIGNATURE);
					if (ownedTemplateSignature != null)
						msgs = ((InternalEObject)ownedTemplateSignature).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UML2Package.INTERACTION_OPERAND__OWNED_TEMPLATE_SIGNATURE, null, msgs);
					return basicSetOwnedTemplateSignature((TemplateSignature)otherEnd, msgs);
				case UML2Package.INTERACTION_OPERAND__CLIENT_DEPENDENCY:
					return ((InternalEList)getClientDependencies()).basicAdd(otherEnd, msgs);
				case UML2Package.INTERACTION_OPERAND__OWNED_RULE:
					return ((InternalEList)getOwnedRules()).basicAdd(otherEnd, msgs);
				case UML2Package.INTERACTION_OPERAND__ELEMENT_IMPORT:
					return ((InternalEList)getElementImports()).basicAdd(otherEnd, msgs);
				case UML2Package.INTERACTION_OPERAND__PACKAGE_IMPORT:
					return ((InternalEList)getPackageImports()).basicAdd(otherEnd, msgs);
				case UML2Package.INTERACTION_OPERAND__COVERED:
					return ((InternalEList)getCovereds()).basicAdd(otherEnd, msgs);
				case UML2Package.INTERACTION_OPERAND__ENCLOSING_INTERACTION:
					if (eInternalContainer() != null)
						msgs = eBasicRemoveFromContainer(msgs);
					return eBasicSetContainer(otherEnd, UML2Package.INTERACTION_OPERAND__ENCLOSING_INTERACTION, msgs);
				case UML2Package.INTERACTION_OPERAND__ENCLOSING_OPERAND:
					if (eInternalContainer() != null)
						msgs = eBasicRemoveFromContainer(msgs);
					return eBasicSetContainer(otherEnd, UML2Package.INTERACTION_OPERAND__ENCLOSING_OPERAND, msgs);
				case UML2Package.INTERACTION_OPERAND__FRAGMENT:
					return ((InternalEList)getFragments()).basicAdd(otherEnd, msgs);
				default:
					return eDynamicInverseAdd(otherEnd, featureID, baseClass, msgs);
			}
		}
		if (eInternalContainer() != null)
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
				case UML2Package.INTERACTION_OPERAND__EANNOTATIONS:
					return ((InternalEList)getEAnnotations()).basicRemove(otherEnd, msgs);
				case UML2Package.INTERACTION_OPERAND__OWNED_COMMENT:
					return ((InternalEList)getOwnedComments()).basicRemove(otherEnd, msgs);
				case UML2Package.INTERACTION_OPERAND__TEMPLATE_BINDING:
					return ((InternalEList)getTemplateBindings()).basicRemove(otherEnd, msgs);
				case UML2Package.INTERACTION_OPERAND__OWNED_TEMPLATE_SIGNATURE:
					return basicSetOwnedTemplateSignature(null, msgs);
				case UML2Package.INTERACTION_OPERAND__CLIENT_DEPENDENCY:
					return ((InternalEList)getClientDependencies()).basicRemove(otherEnd, msgs);
				case UML2Package.INTERACTION_OPERAND__NAME_EXPRESSION:
					return basicSetNameExpression(null, msgs);
				case UML2Package.INTERACTION_OPERAND__OWNED_RULE:
					return ((InternalEList)getOwnedRules()).basicRemove(otherEnd, msgs);
				case UML2Package.INTERACTION_OPERAND__ELEMENT_IMPORT:
					return ((InternalEList)getElementImports()).basicRemove(otherEnd, msgs);
				case UML2Package.INTERACTION_OPERAND__PACKAGE_IMPORT:
					return ((InternalEList)getPackageImports()).basicRemove(otherEnd, msgs);
				case UML2Package.INTERACTION_OPERAND__COVERED:
					return ((InternalEList)getCovereds()).basicRemove(otherEnd, msgs);
				case UML2Package.INTERACTION_OPERAND__GENERAL_ORDERING:
					return ((InternalEList)getGeneralOrderings()).basicRemove(otherEnd, msgs);
				case UML2Package.INTERACTION_OPERAND__ENCLOSING_INTERACTION:
					return eBasicSetContainer(null, UML2Package.INTERACTION_OPERAND__ENCLOSING_INTERACTION, msgs);
				case UML2Package.INTERACTION_OPERAND__ENCLOSING_OPERAND:
					return eBasicSetContainer(null, UML2Package.INTERACTION_OPERAND__ENCLOSING_OPERAND, msgs);
				case UML2Package.INTERACTION_OPERAND__GUARD:
					return basicSetGuard(null, msgs);
				case UML2Package.INTERACTION_OPERAND__FRAGMENT:
					return ((InternalEList)getFragments()).basicRemove(otherEnd, msgs);
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
				case UML2Package.INTERACTION_OPERAND__ENCLOSING_INTERACTION:
					return eInternalContainer().eInverseRemove(this, UML2Package.INTERACTION__FRAGMENT, Interaction.class, msgs);
				case UML2Package.INTERACTION_OPERAND__ENCLOSING_OPERAND:
					return eInternalContainer().eInverseRemove(this, UML2Package.INTERACTION_OPERAND__FRAGMENT, InteractionOperand.class, msgs);
				default:
					return eDynamicBasicRemoveFromContainer(msgs);
			}
		}
		return eInternalContainer().eInverseRemove(this, EOPPOSITE_FEATURE_BASE - eContainerFeatureID, null, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UML2Package.INTERACTION_OPERAND__EANNOTATIONS:
				return getEAnnotations();
			case UML2Package.INTERACTION_OPERAND__OWNED_ELEMENT:
				return getOwnedElements();
			case UML2Package.INTERACTION_OPERAND__OWNER:
				if (resolve) return getOwner();
				return basicGetOwner();
			case UML2Package.INTERACTION_OPERAND__OWNED_COMMENT:
				return getOwnedComments();
			case UML2Package.INTERACTION_OPERAND__TEMPLATE_BINDING:
				return getTemplateBindings();
			case UML2Package.INTERACTION_OPERAND__OWNED_TEMPLATE_SIGNATURE:
				return getOwnedTemplateSignature();
			case UML2Package.INTERACTION_OPERAND__NAME:
				return getName();
			case UML2Package.INTERACTION_OPERAND__QUALIFIED_NAME:
				return getQualifiedName();
			case UML2Package.INTERACTION_OPERAND__VISIBILITY:
				return getVisibility();
			case UML2Package.INTERACTION_OPERAND__CLIENT_DEPENDENCY:
				return getClientDependencies();
			case UML2Package.INTERACTION_OPERAND__NAME_EXPRESSION:
				return getNameExpression();
			case UML2Package.INTERACTION_OPERAND__MEMBER:
				return getMembers();
			case UML2Package.INTERACTION_OPERAND__OWNED_RULE:
				return getOwnedRules();
			case UML2Package.INTERACTION_OPERAND__IMPORTED_MEMBER:
				return getImportedMembers();
			case UML2Package.INTERACTION_OPERAND__ELEMENT_IMPORT:
				return getElementImports();
			case UML2Package.INTERACTION_OPERAND__PACKAGE_IMPORT:
				return getPackageImports();
			case UML2Package.INTERACTION_OPERAND__COVERED:
				return getCovereds();
			case UML2Package.INTERACTION_OPERAND__GENERAL_ORDERING:
				return getGeneralOrderings();
			case UML2Package.INTERACTION_OPERAND__ENCLOSING_INTERACTION:
				return getEnclosingInteraction();
			case UML2Package.INTERACTION_OPERAND__ENCLOSING_OPERAND:
				return getEnclosingOperand();
			case UML2Package.INTERACTION_OPERAND__GUARD:
				return getGuard();
			case UML2Package.INTERACTION_OPERAND__FRAGMENT:
				return getFragments();
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
			case UML2Package.INTERACTION_OPERAND__EANNOTATIONS:
				getEAnnotations().clear();
				getEAnnotations().addAll((Collection)newValue);
				return;
			case UML2Package.INTERACTION_OPERAND__OWNED_COMMENT:
				getOwnedComments().clear();
				getOwnedComments().addAll((Collection)newValue);
				return;
			case UML2Package.INTERACTION_OPERAND__TEMPLATE_BINDING:
				getTemplateBindings().clear();
				getTemplateBindings().addAll((Collection)newValue);
				return;
			case UML2Package.INTERACTION_OPERAND__OWNED_TEMPLATE_SIGNATURE:
				setOwnedTemplateSignature((TemplateSignature)newValue);
				return;
			case UML2Package.INTERACTION_OPERAND__NAME:
				setName((String)newValue);
				return;
			case UML2Package.INTERACTION_OPERAND__VISIBILITY:
				setVisibility((VisibilityKind)newValue);
				return;
			case UML2Package.INTERACTION_OPERAND__CLIENT_DEPENDENCY:
				getClientDependencies().clear();
				getClientDependencies().addAll((Collection)newValue);
				return;
			case UML2Package.INTERACTION_OPERAND__NAME_EXPRESSION:
				setNameExpression((StringExpression)newValue);
				return;
			case UML2Package.INTERACTION_OPERAND__OWNED_RULE:
				getOwnedRules().clear();
				getOwnedRules().addAll((Collection)newValue);
				return;
			case UML2Package.INTERACTION_OPERAND__ELEMENT_IMPORT:
				getElementImports().clear();
				getElementImports().addAll((Collection)newValue);
				return;
			case UML2Package.INTERACTION_OPERAND__PACKAGE_IMPORT:
				getPackageImports().clear();
				getPackageImports().addAll((Collection)newValue);
				return;
			case UML2Package.INTERACTION_OPERAND__COVERED:
				getCovereds().clear();
				getCovereds().addAll((Collection)newValue);
				return;
			case UML2Package.INTERACTION_OPERAND__GENERAL_ORDERING:
				getGeneralOrderings().clear();
				getGeneralOrderings().addAll((Collection)newValue);
				return;
			case UML2Package.INTERACTION_OPERAND__ENCLOSING_INTERACTION:
				setEnclosingInteraction((Interaction)newValue);
				return;
			case UML2Package.INTERACTION_OPERAND__ENCLOSING_OPERAND:
				setEnclosingOperand((InteractionOperand)newValue);
				return;
			case UML2Package.INTERACTION_OPERAND__GUARD:
				setGuard((InteractionConstraint)newValue);
				return;
			case UML2Package.INTERACTION_OPERAND__FRAGMENT:
				getFragments().clear();
				getFragments().addAll((Collection)newValue);
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
			case UML2Package.INTERACTION_OPERAND__EANNOTATIONS:
				getEAnnotations().clear();
				return;
			case UML2Package.INTERACTION_OPERAND__OWNED_COMMENT:
				getOwnedComments().clear();
				return;
			case UML2Package.INTERACTION_OPERAND__TEMPLATE_BINDING:
				getTemplateBindings().clear();
				return;
			case UML2Package.INTERACTION_OPERAND__OWNED_TEMPLATE_SIGNATURE:
				setOwnedTemplateSignature((TemplateSignature)null);
				return;
			case UML2Package.INTERACTION_OPERAND__NAME:
				setName(NAME_EDEFAULT);
				return;
			case UML2Package.INTERACTION_OPERAND__VISIBILITY:
				setVisibility(VISIBILITY_EDEFAULT);
				return;
			case UML2Package.INTERACTION_OPERAND__CLIENT_DEPENDENCY:
				getClientDependencies().clear();
				return;
			case UML2Package.INTERACTION_OPERAND__NAME_EXPRESSION:
				setNameExpression((StringExpression)null);
				return;
			case UML2Package.INTERACTION_OPERAND__OWNED_RULE:
				getOwnedRules().clear();
				return;
			case UML2Package.INTERACTION_OPERAND__ELEMENT_IMPORT:
				getElementImports().clear();
				return;
			case UML2Package.INTERACTION_OPERAND__PACKAGE_IMPORT:
				getPackageImports().clear();
				return;
			case UML2Package.INTERACTION_OPERAND__COVERED:
				getCovereds().clear();
				return;
			case UML2Package.INTERACTION_OPERAND__GENERAL_ORDERING:
				getGeneralOrderings().clear();
				return;
			case UML2Package.INTERACTION_OPERAND__ENCLOSING_INTERACTION:
				setEnclosingInteraction((Interaction)null);
				return;
			case UML2Package.INTERACTION_OPERAND__ENCLOSING_OPERAND:
				setEnclosingOperand((InteractionOperand)null);
				return;
			case UML2Package.INTERACTION_OPERAND__GUARD:
				setGuard((InteractionConstraint)null);
				return;
			case UML2Package.INTERACTION_OPERAND__FRAGMENT:
				getFragments().clear();
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
			case UML2Package.INTERACTION_OPERAND__EANNOTATIONS:
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UML2Package.INTERACTION_OPERAND__OWNED_ELEMENT:
				return isSetOwnedElements();
			case UML2Package.INTERACTION_OPERAND__OWNER:
				return isSetOwner();
			case UML2Package.INTERACTION_OPERAND__OWNED_COMMENT:
				EList ownedComment = (EList)eVirtualGet(UML2Package.INTERACTION_OPERAND__OWNED_COMMENT);
				return ownedComment != null && !ownedComment.isEmpty();
			case UML2Package.INTERACTION_OPERAND__TEMPLATE_BINDING:
				EList templateBinding = (EList)eVirtualGet(UML2Package.INTERACTION_OPERAND__TEMPLATE_BINDING);
				return templateBinding != null && !templateBinding.isEmpty();
			case UML2Package.INTERACTION_OPERAND__OWNED_TEMPLATE_SIGNATURE:
				return eVirtualGet(UML2Package.INTERACTION_OPERAND__OWNED_TEMPLATE_SIGNATURE) != null;
			case UML2Package.INTERACTION_OPERAND__NAME:
				String name = (String)eVirtualGet(UML2Package.INTERACTION_OPERAND__NAME, NAME_EDEFAULT);
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case UML2Package.INTERACTION_OPERAND__QUALIFIED_NAME:
				return QUALIFIED_NAME_EDEFAULT == null ? getQualifiedName() != null : !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case UML2Package.INTERACTION_OPERAND__VISIBILITY:
				return eVirtualGet(UML2Package.INTERACTION_OPERAND__VISIBILITY, VISIBILITY_EDEFAULT) != VISIBILITY_EDEFAULT;
			case UML2Package.INTERACTION_OPERAND__CLIENT_DEPENDENCY:
				EList clientDependency = (EList)eVirtualGet(UML2Package.INTERACTION_OPERAND__CLIENT_DEPENDENCY);
				return clientDependency != null && !clientDependency.isEmpty();
			case UML2Package.INTERACTION_OPERAND__NAME_EXPRESSION:
				return eVirtualGet(UML2Package.INTERACTION_OPERAND__NAME_EXPRESSION) != null;
			case UML2Package.INTERACTION_OPERAND__MEMBER:
				return isSetMembers();
			case UML2Package.INTERACTION_OPERAND__OWNED_RULE:
				EList ownedRule = (EList)eVirtualGet(UML2Package.INTERACTION_OPERAND__OWNED_RULE);
				return ownedRule != null && !ownedRule.isEmpty();
			case UML2Package.INTERACTION_OPERAND__IMPORTED_MEMBER:
				return !getImportedMembers().isEmpty();
			case UML2Package.INTERACTION_OPERAND__ELEMENT_IMPORT:
				EList elementImport = (EList)eVirtualGet(UML2Package.INTERACTION_OPERAND__ELEMENT_IMPORT);
				return elementImport != null && !elementImport.isEmpty();
			case UML2Package.INTERACTION_OPERAND__PACKAGE_IMPORT:
				EList packageImport = (EList)eVirtualGet(UML2Package.INTERACTION_OPERAND__PACKAGE_IMPORT);
				return packageImport != null && !packageImport.isEmpty();
			case UML2Package.INTERACTION_OPERAND__COVERED:
				EList covered = (EList)eVirtualGet(UML2Package.INTERACTION_OPERAND__COVERED);
				return covered != null && !covered.isEmpty();
			case UML2Package.INTERACTION_OPERAND__GENERAL_ORDERING:
				EList generalOrdering = (EList)eVirtualGet(UML2Package.INTERACTION_OPERAND__GENERAL_ORDERING);
				return generalOrdering != null && !generalOrdering.isEmpty();
			case UML2Package.INTERACTION_OPERAND__ENCLOSING_INTERACTION:
				return getEnclosingInteraction() != null;
			case UML2Package.INTERACTION_OPERAND__ENCLOSING_OPERAND:
				return getEnclosingOperand() != null;
			case UML2Package.INTERACTION_OPERAND__GUARD:
				return eVirtualGet(UML2Package.INTERACTION_OPERAND__GUARD) != null;
			case UML2Package.INTERACTION_OPERAND__FRAGMENT:
				EList fragment = (EList)eVirtualGet(UML2Package.INTERACTION_OPERAND__FRAGMENT);
				return fragment != null && !fragment.isEmpty();
		}
		return eDynamicIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class baseClass) {
		if (baseClass == InteractionFragment.class) {
			switch (derivedFeatureID) {
				case UML2Package.INTERACTION_OPERAND__COVERED: return UML2Package.INTERACTION_FRAGMENT__COVERED;
				case UML2Package.INTERACTION_OPERAND__GENERAL_ORDERING: return UML2Package.INTERACTION_FRAGMENT__GENERAL_ORDERING;
				case UML2Package.INTERACTION_OPERAND__ENCLOSING_INTERACTION: return UML2Package.INTERACTION_FRAGMENT__ENCLOSING_INTERACTION;
				case UML2Package.INTERACTION_OPERAND__ENCLOSING_OPERAND: return UML2Package.INTERACTION_FRAGMENT__ENCLOSING_OPERAND;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class baseClass) {
		if (baseClass == InteractionFragment.class) {
			switch (baseFeatureID) {
				case UML2Package.INTERACTION_FRAGMENT__COVERED: return UML2Package.INTERACTION_OPERAND__COVERED;
				case UML2Package.INTERACTION_FRAGMENT__GENERAL_ORDERING: return UML2Package.INTERACTION_OPERAND__GENERAL_ORDERING;
				case UML2Package.INTERACTION_FRAGMENT__ENCLOSING_INTERACTION: return UML2Package.INTERACTION_OPERAND__ENCLOSING_INTERACTION;
				case UML2Package.INTERACTION_FRAGMENT__ENCLOSING_OPERAND: return UML2Package.INTERACTION_OPERAND__ENCLOSING_OPERAND;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EList getOwnedElementsHelper(EList ownedElement) {
		super.getOwnedElementsHelper(ownedElement);
		EList generalOrdering = getGeneralOrderings();
		if (!generalOrdering.isEmpty()) {
			ownedElement.addAll(generalOrdering);
		}
		InteractionConstraint guard = getGuard();
		if (guard != null) {
			ownedElement.add(guard);
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
			|| eIsSet(UML2Package.INTERACTION_OPERAND__GENERAL_ORDERING)
			|| eIsSet(UML2Package.INTERACTION_OPERAND__GUARD);
	}


} //InteractionOperandImpl
