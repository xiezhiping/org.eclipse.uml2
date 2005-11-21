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
 * $Id: InteractionImpl.java,v 1.30 2005/11/21 21:48:01 khussey Exp $
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
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.uml2.Behavior;
import org.eclipse.uml2.BehavioralFeature;
import org.eclipse.uml2.BehavioredClassifier;
import org.eclipse.uml2.CollaborationOccurrence;
import org.eclipse.uml2.Gate;
import org.eclipse.uml2.GeneralOrdering;
import org.eclipse.uml2.Interaction;
import org.eclipse.uml2.InteractionFragment;
import org.eclipse.uml2.InteractionOperand;
import org.eclipse.uml2.Lifeline;
import org.eclipse.uml2.Message;
import org.eclipse.uml2.Namespace;
import org.eclipse.uml2.StringExpression;
import org.eclipse.uml2.TemplateParameter;
import org.eclipse.uml2.TemplateSignature;
import org.eclipse.uml2.UML2Factory;
import org.eclipse.uml2.UML2Package;
import org.eclipse.uml2.VisibilityKind;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Interaction</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2.impl.InteractionImpl#getCovereds <em>Covered</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.InteractionImpl#getGeneralOrderings <em>General Ordering</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.InteractionImpl#getEnclosingInteraction <em>Enclosing Interaction</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.InteractionImpl#getEnclosingOperand <em>Enclosing Operand</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.InteractionImpl#getLifelines <em>Lifeline</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.InteractionImpl#getMessages <em>Message</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.InteractionImpl#getFragments <em>Fragment</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.InteractionImpl#getFormalGates <em>Formal Gate</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InteractionImpl extends BehaviorImpl implements Interaction {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) IBM Corporation and others."; //$NON-NLS-1$

	/**
	 * A bit field representing the indices of non-primitive feature values.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected int eVirtualIndexBits2 = 0;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InteractionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return UML2Package.eINSTANCE.getInteraction();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getCovereds() {
		EList covered = (EList)eVirtualGet(UML2Package.INTERACTION__COVERED);
		if (covered == null) {
			eVirtualSet(UML2Package.INTERACTION__COVERED, covered = new EObjectWithInverseResolvingEList.ManyInverse(Lifeline.class, this, UML2Package.INTERACTION__COVERED, UML2Package.LIFELINE__COVERED_BY));
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
		EList generalOrdering = (EList)eVirtualGet(UML2Package.INTERACTION__GENERAL_ORDERING);
		if (generalOrdering == null) {
			eVirtualSet(UML2Package.INTERACTION__GENERAL_ORDERING, generalOrdering = new EObjectContainmentEList(GeneralOrdering.class, this, UML2Package.INTERACTION__GENERAL_ORDERING));
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
			eNotify(new ENotificationImpl(this, 0, UML2Package.INTERACTION__GENERAL_ORDERING, null, newGeneralOrdering));
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
			eNotify(new ENotificationImpl(this, 0, UML2Package.INTERACTION__GENERAL_ORDERING, null, newGeneralOrdering));
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
		if (eContainerFeatureID != UML2Package.INTERACTION__ENCLOSING_INTERACTION) return null;
		return (Interaction)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnclosingInteraction(Interaction newEnclosingInteraction) {
		if (newEnclosingInteraction != eInternalContainer() || (eContainerFeatureID != UML2Package.INTERACTION__ENCLOSING_INTERACTION && newEnclosingInteraction != null)) {
			if (EcoreUtil.isAncestor(this, newEnclosingInteraction))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString()); //$NON-NLS-1$
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newEnclosingInteraction != null)
				msgs = ((InternalEObject)newEnclosingInteraction).eInverseAdd(this, UML2Package.INTERACTION__FRAGMENT, Interaction.class, msgs);
			msgs = eBasicSetContainer((InternalEObject)newEnclosingInteraction, UML2Package.INTERACTION__ENCLOSING_INTERACTION, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2Package.INTERACTION__ENCLOSING_INTERACTION, newEnclosingInteraction, newEnclosingInteraction));

	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InteractionOperand getEnclosingOperand() {
		if (eContainerFeatureID != UML2Package.INTERACTION__ENCLOSING_OPERAND) return null;
		return (InteractionOperand)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnclosingOperand(InteractionOperand newEnclosingOperand) {
		if (newEnclosingOperand != eInternalContainer() || (eContainerFeatureID != UML2Package.INTERACTION__ENCLOSING_OPERAND && newEnclosingOperand != null)) {
			if (EcoreUtil.isAncestor(this, newEnclosingOperand))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString()); //$NON-NLS-1$
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newEnclosingOperand != null)
				msgs = ((InternalEObject)newEnclosingOperand).eInverseAdd(this, UML2Package.INTERACTION_OPERAND__FRAGMENT, InteractionOperand.class, msgs);
			msgs = eBasicSetContainer((InternalEObject)newEnclosingOperand, UML2Package.INTERACTION__ENCLOSING_OPERAND, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2Package.INTERACTION__ENCLOSING_OPERAND, newEnclosingOperand, newEnclosingOperand));

	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getLifelines() {
		EList lifeline = (EList)eVirtualGet(UML2Package.INTERACTION__LIFELINE);
		if (lifeline == null) {
			eVirtualSet(UML2Package.INTERACTION__LIFELINE, lifeline = new EObjectContainmentWithInverseEList(Lifeline.class, this, UML2Package.INTERACTION__LIFELINE, UML2Package.LIFELINE__INTERACTION));
		}
		return lifeline;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
    public Lifeline getLifeline(String name) {
		for (Iterator i = getLifelines().iterator(); i.hasNext(); ) {
			Lifeline lifeline = (Lifeline) i.next();
			if (name.equals(lifeline.getName())) {
				return lifeline;
			}
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 * @deprecated Use #createLifeline() instead.
	 */
	public Lifeline createLifeline(EClass eClass) {
		Lifeline newLifeline = (Lifeline) eClass.getEPackage().getEFactoryInstance().create(eClass);
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, 0, UML2Package.INTERACTION__LIFELINE, null, newLifeline));
		}
		getLifelines().add(newLifeline);
		return newLifeline;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Lifeline createLifeline() {
		Lifeline newLifeline = UML2Factory.eINSTANCE.createLifeline();
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, 0, UML2Package.INTERACTION__LIFELINE, null, newLifeline));
		}
		getLifelines().add(newLifeline);
		return newLifeline;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getMessages() {
		EList message = (EList)eVirtualGet(UML2Package.INTERACTION__MESSAGE);
		if (message == null) {
			eVirtualSet(UML2Package.INTERACTION__MESSAGE, message = new EObjectContainmentWithInverseEList(Message.class, this, UML2Package.INTERACTION__MESSAGE, UML2Package.MESSAGE__INTERACTION));
		}
		return message;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
    public Message getMessage(String name) {
		for (Iterator i = getMessages().iterator(); i.hasNext(); ) {
			Message message = (Message) i.next();
			if (name.equals(message.getName())) {
				return message;
			}
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 * @deprecated Use #createMessage() instead.
	 */
	public Message createMessage(EClass eClass) {
		Message newMessage = (Message) eClass.getEPackage().getEFactoryInstance().create(eClass);
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, 0, UML2Package.INTERACTION__MESSAGE, null, newMessage));
		}
		getMessages().add(newMessage);
		return newMessage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Message createMessage() {
		Message newMessage = UML2Factory.eINSTANCE.createMessage();
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, 0, UML2Package.INTERACTION__MESSAGE, null, newMessage));
		}
		getMessages().add(newMessage);
		return newMessage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getFragments() {
		EList fragment = (EList)eVirtualGet(UML2Package.INTERACTION__FRAGMENT);
		if (fragment == null) {
			eVirtualSet(UML2Package.INTERACTION__FRAGMENT, fragment = new EObjectContainmentWithInverseEList(InteractionFragment.class, this, UML2Package.INTERACTION__FRAGMENT, UML2Package.INTERACTION_FRAGMENT__ENCLOSING_INTERACTION));
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
			eNotify(new ENotificationImpl(this, 0, UML2Package.INTERACTION__FRAGMENT, null, newFragment));
		}
		getFragments().add(newFragment);
		return newFragment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getFormalGates() {
		EList formalGate = (EList)eVirtualGet(UML2Package.INTERACTION__FORMAL_GATE);
		if (formalGate == null) {
			eVirtualSet(UML2Package.INTERACTION__FORMAL_GATE, formalGate = new EObjectContainmentEList(Gate.class, this, UML2Package.INTERACTION__FORMAL_GATE));
		}
		return formalGate;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
    public Gate getFormalGate(String name) {
		for (Iterator i = getFormalGates().iterator(); i.hasNext(); ) {
			Gate formalGate = (Gate) i.next();
			if (name.equals(formalGate.getName())) {
				return formalGate;
			}
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 * @deprecated Use #createFormalGate() instead.
	 */
	public Gate createFormalGate(EClass eClass) {
		Gate newFormalGate = (Gate) eClass.getEPackage().getEFactoryInstance().create(eClass);
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, 0, UML2Package.INTERACTION__FORMAL_GATE, null, newFormalGate));
		}
		getFormalGates().add(newFormalGate);
		return newFormalGate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Gate createFormalGate() {
		Gate newFormalGate = UML2Factory.eINSTANCE.createGate();
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, 0, UML2Package.INTERACTION__FORMAL_GATE, null, newFormalGate));
		}
		getFormalGates().add(newFormalGate);
		return newFormalGate;
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
			|| eIsSet(UML2Package.eINSTANCE.getInteractionFragment_EnclosingOperand());
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EList getOwnedMembersHelper(EList ownedMember) {
		super.getOwnedMembersHelper(ownedMember);
		EList lifeline = getLifelines();
		if (!lifeline.isEmpty()) {
			ownedMember.addAll(lifeline);
		}
		EList message = getMessages();
		if (!message.isEmpty()) {
			ownedMember.addAll(message);
		}
		EList formalGate = getFormalGates();
		if (!formalGate.isEmpty()) {
			ownedMember.addAll(formalGate);
		}
		return ownedMember;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOwnedMembers() {
		return super.isSetOwnedMembers()
			|| eIsSet(UML2Package.eINSTANCE.getInteraction_Lifeline())
			|| eIsSet(UML2Package.eINSTANCE.getInteraction_Message())
			|| eIsSet(UML2Package.eINSTANCE.getInteraction_FormalGate());
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, Class baseClass, NotificationChain msgs) {
		if (featureID >= 0) {
			switch (eDerivedStructuralFeatureID(featureID, baseClass)) {
				case UML2Package.INTERACTION__EANNOTATIONS:
					return ((InternalEList)getEAnnotations()).basicAdd(otherEnd, msgs);
				case UML2Package.INTERACTION__TEMPLATE_BINDING:
					return ((InternalEList)getTemplateBindings()).basicAdd(otherEnd, msgs);
				case UML2Package.INTERACTION__OWNED_TEMPLATE_SIGNATURE:
					TemplateSignature ownedTemplateSignature = (TemplateSignature)eVirtualGet(UML2Package.INTERACTION__OWNED_TEMPLATE_SIGNATURE);
					if (ownedTemplateSignature != null)
						msgs = ((InternalEObject)ownedTemplateSignature).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UML2Package.INTERACTION__OWNED_TEMPLATE_SIGNATURE, null, msgs);
					return basicSetOwnedTemplateSignature((TemplateSignature)otherEnd, msgs);
				case UML2Package.INTERACTION__CLIENT_DEPENDENCY:
					return ((InternalEList)getClientDependencies()).basicAdd(otherEnd, msgs);
				case UML2Package.INTERACTION__OWNED_RULE:
					return ((InternalEList)getOwnedRules()).basicAdd(otherEnd, msgs);
				case UML2Package.INTERACTION__ELEMENT_IMPORT:
					return ((InternalEList)getElementImports()).basicAdd(otherEnd, msgs);
				case UML2Package.INTERACTION__PACKAGE_IMPORT:
					return ((InternalEList)getPackageImports()).basicAdd(otherEnd, msgs);
				case UML2Package.INTERACTION__TEMPLATE_PARAMETER:
					TemplateParameter templateParameter = (TemplateParameter)eVirtualGet(UML2Package.INTERACTION__TEMPLATE_PARAMETER);
					if (templateParameter != null)
						msgs = ((InternalEObject)templateParameter).eInverseRemove(this, UML2Package.TEMPLATE_PARAMETER__PARAMETERED_ELEMENT, TemplateParameter.class, msgs);
					return basicSetTemplateParameter((TemplateParameter)otherEnd, msgs);
				case UML2Package.INTERACTION__OWNING_PARAMETER:
					if (eInternalContainer() != null)
						msgs = eBasicRemoveFromContainer(msgs);
					return eBasicSetContainer(otherEnd, UML2Package.INTERACTION__OWNING_PARAMETER, msgs);
				case UML2Package.INTERACTION__GENERALIZATION:
					return ((InternalEList)getGeneralizations()).basicAdd(otherEnd, msgs);
				case UML2Package.INTERACTION__SUBSTITUTION:
					return ((InternalEList)getSubstitutions()).basicAdd(otherEnd, msgs);
				case UML2Package.INTERACTION__POWERTYPE_EXTENT:
					return ((InternalEList)getPowertypeExtents()).basicAdd(otherEnd, msgs);
				case UML2Package.INTERACTION__USE_CASE:
					return ((InternalEList)getUseCases()).basicAdd(otherEnd, msgs);
				case UML2Package.INTERACTION__OWNED_BEHAVIOR:
					return ((InternalEList)getOwnedBehaviors()).basicAdd(otherEnd, msgs);
				case UML2Package.INTERACTION__IMPLEMENTATION:
					return ((InternalEList)getImplementations()).basicAdd(otherEnd, msgs);
				case UML2Package.INTERACTION__OWNED_STATE_MACHINE:
					return ((InternalEList)getOwnedStateMachines()).basicAdd(otherEnd, msgs);
				case UML2Package.INTERACTION__OWNED_OPERATION:
					return ((InternalEList)getOwnedOperations()).basicAdd(otherEnd, msgs);
				case UML2Package.INTERACTION__CONTEXT:
					if (eInternalContainer() != null)
						msgs = eBasicRemoveFromContainer(msgs);
					return eBasicSetContainer(otherEnd, UML2Package.INTERACTION__CONTEXT, msgs);
				case UML2Package.INTERACTION__SPECIFICATION:
					BehavioralFeature specification = (BehavioralFeature)eVirtualGet(UML2Package.INTERACTION__SPECIFICATION);
					if (specification != null)
						msgs = ((InternalEObject)specification).eInverseRemove(this, UML2Package.BEHAVIORAL_FEATURE__METHOD, BehavioralFeature.class, msgs);
					return basicSetSpecification((BehavioralFeature)otherEnd, msgs);
				case UML2Package.INTERACTION__COVERED:
					return ((InternalEList)getCovereds()).basicAdd(otherEnd, msgs);
				case UML2Package.INTERACTION__ENCLOSING_INTERACTION:
					if (eInternalContainer() != null)
						msgs = eBasicRemoveFromContainer(msgs);
					return eBasicSetContainer(otherEnd, UML2Package.INTERACTION__ENCLOSING_INTERACTION, msgs);
				case UML2Package.INTERACTION__ENCLOSING_OPERAND:
					if (eInternalContainer() != null)
						msgs = eBasicRemoveFromContainer(msgs);
					return eBasicSetContainer(otherEnd, UML2Package.INTERACTION__ENCLOSING_OPERAND, msgs);
				case UML2Package.INTERACTION__LIFELINE:
					return ((InternalEList)getLifelines()).basicAdd(otherEnd, msgs);
				case UML2Package.INTERACTION__MESSAGE:
					return ((InternalEList)getMessages()).basicAdd(otherEnd, msgs);
				case UML2Package.INTERACTION__FRAGMENT:
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
				case UML2Package.INTERACTION__EANNOTATIONS:
					return ((InternalEList)getEAnnotations()).basicRemove(otherEnd, msgs);
				case UML2Package.INTERACTION__OWNED_COMMENT:
					return ((InternalEList)getOwnedComments()).basicRemove(otherEnd, msgs);
				case UML2Package.INTERACTION__TEMPLATE_BINDING:
					return ((InternalEList)getTemplateBindings()).basicRemove(otherEnd, msgs);
				case UML2Package.INTERACTION__OWNED_TEMPLATE_SIGNATURE:
					return basicSetOwnedTemplateSignature(null, msgs);
				case UML2Package.INTERACTION__CLIENT_DEPENDENCY:
					return ((InternalEList)getClientDependencies()).basicRemove(otherEnd, msgs);
				case UML2Package.INTERACTION__NAME_EXPRESSION:
					return basicSetNameExpression(null, msgs);
				case UML2Package.INTERACTION__OWNED_RULE:
					return ((InternalEList)getOwnedRules()).basicRemove(otherEnd, msgs);
				case UML2Package.INTERACTION__ELEMENT_IMPORT:
					return ((InternalEList)getElementImports()).basicRemove(otherEnd, msgs);
				case UML2Package.INTERACTION__PACKAGE_IMPORT:
					return ((InternalEList)getPackageImports()).basicRemove(otherEnd, msgs);
				case UML2Package.INTERACTION__TEMPLATE_PARAMETER:
					return basicSetTemplateParameter(null, msgs);
				case UML2Package.INTERACTION__OWNING_PARAMETER:
					return eBasicSetContainer(null, UML2Package.INTERACTION__OWNING_PARAMETER, msgs);
				case UML2Package.INTERACTION__GENERALIZATION:
					return ((InternalEList)getGeneralizations()).basicRemove(otherEnd, msgs);
				case UML2Package.INTERACTION__SUBSTITUTION:
					return ((InternalEList)getSubstitutions()).basicRemove(otherEnd, msgs);
				case UML2Package.INTERACTION__POWERTYPE_EXTENT:
					return ((InternalEList)getPowertypeExtents()).basicRemove(otherEnd, msgs);
				case UML2Package.INTERACTION__OWNED_USE_CASE:
					return ((InternalEList)getOwnedUseCases()).basicRemove(otherEnd, msgs);
				case UML2Package.INTERACTION__USE_CASE:
					return ((InternalEList)getUseCases()).basicRemove(otherEnd, msgs);
				case UML2Package.INTERACTION__OCCURRENCE:
					return ((InternalEList)getOccurrences()).basicRemove(otherEnd, msgs);
				case UML2Package.INTERACTION__OWNED_BEHAVIOR:
					return ((InternalEList)getOwnedBehaviors()).basicRemove(otherEnd, msgs);
				case UML2Package.INTERACTION__IMPLEMENTATION:
					return ((InternalEList)getImplementations()).basicRemove(otherEnd, msgs);
				case UML2Package.INTERACTION__OWNED_TRIGGER:
					return ((InternalEList)getOwnedTriggers()).basicRemove(otherEnd, msgs);
				case UML2Package.INTERACTION__OWNED_STATE_MACHINE:
					return ((InternalEList)getOwnedStateMachines()).basicRemove(otherEnd, msgs);
				case UML2Package.INTERACTION__OWNED_ATTRIBUTE:
					return ((InternalEList)getOwnedAttributes()).basicRemove(otherEnd, msgs);
				case UML2Package.INTERACTION__OWNED_CONNECTOR:
					return ((InternalEList)getOwnedConnectors()).basicRemove(otherEnd, msgs);
				case UML2Package.INTERACTION__OWNED_PORT:
					return ((InternalEList)getOwnedPorts()).basicRemove(otherEnd, msgs);
				case UML2Package.INTERACTION__OWNED_OPERATION:
					return ((InternalEList)getOwnedOperations()).basicRemove(otherEnd, msgs);
				case UML2Package.INTERACTION__NESTED_CLASSIFIER:
					return ((InternalEList)getNestedClassifiers()).basicRemove(otherEnd, msgs);
				case UML2Package.INTERACTION__OWNED_RECEPTION:
					return ((InternalEList)getOwnedReceptions()).basicRemove(otherEnd, msgs);
				case UML2Package.INTERACTION__CONTEXT:
					return eBasicSetContainer(null, UML2Package.INTERACTION__CONTEXT, msgs);
				case UML2Package.INTERACTION__SPECIFICATION:
					return basicSetSpecification(null, msgs);
				case UML2Package.INTERACTION__PARAMETER:
					return ((InternalEList)getParameters()).basicRemove(otherEnd, msgs);
				case UML2Package.INTERACTION__OWNED_PARAMETER_SET:
					return ((InternalEList)getOwnedParameterSets()).basicRemove(otherEnd, msgs);
				case UML2Package.INTERACTION__COVERED:
					return ((InternalEList)getCovereds()).basicRemove(otherEnd, msgs);
				case UML2Package.INTERACTION__GENERAL_ORDERING:
					return ((InternalEList)getGeneralOrderings()).basicRemove(otherEnd, msgs);
				case UML2Package.INTERACTION__ENCLOSING_INTERACTION:
					return eBasicSetContainer(null, UML2Package.INTERACTION__ENCLOSING_INTERACTION, msgs);
				case UML2Package.INTERACTION__ENCLOSING_OPERAND:
					return eBasicSetContainer(null, UML2Package.INTERACTION__ENCLOSING_OPERAND, msgs);
				case UML2Package.INTERACTION__LIFELINE:
					return ((InternalEList)getLifelines()).basicRemove(otherEnd, msgs);
				case UML2Package.INTERACTION__MESSAGE:
					return ((InternalEList)getMessages()).basicRemove(otherEnd, msgs);
				case UML2Package.INTERACTION__FRAGMENT:
					return ((InternalEList)getFragments()).basicRemove(otherEnd, msgs);
				case UML2Package.INTERACTION__FORMAL_GATE:
					return ((InternalEList)getFormalGates()).basicRemove(otherEnd, msgs);
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
				case UML2Package.INTERACTION__OWNING_PARAMETER:
					return eInternalContainer().eInverseRemove(this, UML2Package.TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT, TemplateParameter.class, msgs);
				case UML2Package.INTERACTION__CONTEXT:
					return eInternalContainer().eInverseRemove(this, UML2Package.BEHAVIORED_CLASSIFIER__OWNED_BEHAVIOR, BehavioredClassifier.class, msgs);
				case UML2Package.INTERACTION__ENCLOSING_INTERACTION:
					return eInternalContainer().eInverseRemove(this, UML2Package.INTERACTION__FRAGMENT, Interaction.class, msgs);
				case UML2Package.INTERACTION__ENCLOSING_OPERAND:
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
	public Object eGet(EStructuralFeature eFeature, boolean resolve) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case UML2Package.INTERACTION__EANNOTATIONS:
				return getEAnnotations();
			case UML2Package.INTERACTION__OWNED_ELEMENT:
				return getOwnedElements();
			case UML2Package.INTERACTION__OWNER:
				if (resolve) return getOwner();
				return basicGetOwner();
			case UML2Package.INTERACTION__OWNED_COMMENT:
				return getOwnedComments();
			case UML2Package.INTERACTION__TEMPLATE_BINDING:
				return getTemplateBindings();
			case UML2Package.INTERACTION__OWNED_TEMPLATE_SIGNATURE:
				return getOwnedTemplateSignature();
			case UML2Package.INTERACTION__NAME:
				return getName();
			case UML2Package.INTERACTION__QUALIFIED_NAME:
				return getQualifiedName();
			case UML2Package.INTERACTION__VISIBILITY:
				return getVisibility();
			case UML2Package.INTERACTION__CLIENT_DEPENDENCY:
				return getClientDependencies();
			case UML2Package.INTERACTION__NAME_EXPRESSION:
				return getNameExpression();
			case UML2Package.INTERACTION__MEMBER:
				return getMembers();
			case UML2Package.INTERACTION__OWNED_RULE:
				return getOwnedRules();
			case UML2Package.INTERACTION__IMPORTED_MEMBER:
				return getImportedMembers();
			case UML2Package.INTERACTION__ELEMENT_IMPORT:
				return getElementImports();
			case UML2Package.INTERACTION__PACKAGE_IMPORT:
				return getPackageImports();
			case UML2Package.INTERACTION__TEMPLATE_PARAMETER:
				if (resolve) return getTemplateParameter();
				return basicGetTemplateParameter();
			case UML2Package.INTERACTION__OWNING_PARAMETER:
				return getOwningParameter();
			case UML2Package.INTERACTION__PACKAGEABLE_ELEMENT_VISIBILITY:
				return getPackageableElement_visibility();
			case UML2Package.INTERACTION__PACKAGE:
				return getPackage();
			case UML2Package.INTERACTION__REDEFINITION_CONTEXT:
				return getRedefinitionContexts();
			case UML2Package.INTERACTION__IS_LEAF:
				return isLeaf() ? Boolean.TRUE : Boolean.FALSE;
			case UML2Package.INTERACTION__FEATURE:
				return getFeatures();
			case UML2Package.INTERACTION__IS_ABSTRACT:
				return isAbstract() ? Boolean.TRUE : Boolean.FALSE;
			case UML2Package.INTERACTION__INHERITED_MEMBER:
				return getInheritedMembers();
			case UML2Package.INTERACTION__GENERAL:
				return getGenerals();
			case UML2Package.INTERACTION__GENERALIZATION:
				return getGeneralizations();
			case UML2Package.INTERACTION__ATTRIBUTE:
				return getAttributes();
			case UML2Package.INTERACTION__REDEFINED_CLASSIFIER:
				return getRedefinedClassifiers();
			case UML2Package.INTERACTION__SUBSTITUTION:
				return getSubstitutions();
			case UML2Package.INTERACTION__POWERTYPE_EXTENT:
				return getPowertypeExtents();
			case UML2Package.INTERACTION__OWNED_USE_CASE:
				return getOwnedUseCases();
			case UML2Package.INTERACTION__USE_CASE:
				return getUseCases();
			case UML2Package.INTERACTION__REPRESENTATION:
				return getRepresentation();
			case UML2Package.INTERACTION__OCCURRENCE:
				return getOccurrences();
			case UML2Package.INTERACTION__OWNED_BEHAVIOR:
				return getOwnedBehaviors();
			case UML2Package.INTERACTION__CLASSIFIER_BEHAVIOR:
				return getClassifierBehavior();
			case UML2Package.INTERACTION__IMPLEMENTATION:
				return getImplementations();
			case UML2Package.INTERACTION__OWNED_TRIGGER:
				return getOwnedTriggers();
			case UML2Package.INTERACTION__OWNED_STATE_MACHINE:
				return getOwnedStateMachines();
			case UML2Package.INTERACTION__OWNED_ATTRIBUTE:
				return getOwnedAttributes();
			case UML2Package.INTERACTION__PART:
				return getParts();
			case UML2Package.INTERACTION__ROLE:
				return getRoles();
			case UML2Package.INTERACTION__OWNED_CONNECTOR:
				return getOwnedConnectors();
			case UML2Package.INTERACTION__OWNED_PORT:
				return getOwnedPorts();
			case UML2Package.INTERACTION__OWNED_OPERATION:
				return getOwnedOperations();
			case UML2Package.INTERACTION__SUPER_CLASS:
				return getSuperClasses();
			case UML2Package.INTERACTION__EXTENSION:
				return getExtensions();
			case UML2Package.INTERACTION__NESTED_CLASSIFIER:
				return getNestedClassifiers();
			case UML2Package.INTERACTION__IS_ACTIVE:
				return isActive() ? Boolean.TRUE : Boolean.FALSE;
			case UML2Package.INTERACTION__OWNED_RECEPTION:
				return getOwnedReceptions();
			case UML2Package.INTERACTION__IS_REENTRANT:
				return isReentrant() ? Boolean.TRUE : Boolean.FALSE;
			case UML2Package.INTERACTION__CONTEXT:
				return getContext();
			case UML2Package.INTERACTION__REDEFINED_BEHAVIOR:
				return getRedefinedBehaviors();
			case UML2Package.INTERACTION__SPECIFICATION:
				if (resolve) return getSpecification();
				return basicGetSpecification();
			case UML2Package.INTERACTION__PARAMETER:
				return getParameters();
			case UML2Package.INTERACTION__FORMAL_PARAMETER:
				return getFormalParameters();
			case UML2Package.INTERACTION__RETURN_RESULT:
				return getReturnResults();
			case UML2Package.INTERACTION__PRECONDITION:
				return getPreconditions();
			case UML2Package.INTERACTION__POSTCONDITION:
				return getPostconditions();
			case UML2Package.INTERACTION__OWNED_PARAMETER_SET:
				return getOwnedParameterSets();
			case UML2Package.INTERACTION__COVERED:
				return getCovereds();
			case UML2Package.INTERACTION__GENERAL_ORDERING:
				return getGeneralOrderings();
			case UML2Package.INTERACTION__ENCLOSING_INTERACTION:
				return getEnclosingInteraction();
			case UML2Package.INTERACTION__ENCLOSING_OPERAND:
				return getEnclosingOperand();
			case UML2Package.INTERACTION__LIFELINE:
				return getLifelines();
			case UML2Package.INTERACTION__MESSAGE:
				return getMessages();
			case UML2Package.INTERACTION__FRAGMENT:
				return getFragments();
			case UML2Package.INTERACTION__FORMAL_GATE:
				return getFormalGates();
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
			case UML2Package.INTERACTION__EANNOTATIONS:
				getEAnnotations().clear();
				getEAnnotations().addAll((Collection)newValue);
				return;
			case UML2Package.INTERACTION__OWNED_COMMENT:
				getOwnedComments().clear();
				getOwnedComments().addAll((Collection)newValue);
				return;
			case UML2Package.INTERACTION__TEMPLATE_BINDING:
				getTemplateBindings().clear();
				getTemplateBindings().addAll((Collection)newValue);
				return;
			case UML2Package.INTERACTION__OWNED_TEMPLATE_SIGNATURE:
				setOwnedTemplateSignature((TemplateSignature)newValue);
				return;
			case UML2Package.INTERACTION__NAME:
				setName((String)newValue);
				return;
			case UML2Package.INTERACTION__VISIBILITY:
				setVisibility((VisibilityKind)newValue);
				return;
			case UML2Package.INTERACTION__CLIENT_DEPENDENCY:
				getClientDependencies().clear();
				getClientDependencies().addAll((Collection)newValue);
				return;
			case UML2Package.INTERACTION__NAME_EXPRESSION:
				setNameExpression((StringExpression)newValue);
				return;
			case UML2Package.INTERACTION__OWNED_RULE:
				getOwnedRules().clear();
				getOwnedRules().addAll((Collection)newValue);
				return;
			case UML2Package.INTERACTION__ELEMENT_IMPORT:
				getElementImports().clear();
				getElementImports().addAll((Collection)newValue);
				return;
			case UML2Package.INTERACTION__PACKAGE_IMPORT:
				getPackageImports().clear();
				getPackageImports().addAll((Collection)newValue);
				return;
			case UML2Package.INTERACTION__TEMPLATE_PARAMETER:
				setTemplateParameter((TemplateParameter)newValue);
				return;
			case UML2Package.INTERACTION__OWNING_PARAMETER:
				setOwningParameter((TemplateParameter)newValue);
				return;
			case UML2Package.INTERACTION__PACKAGEABLE_ELEMENT_VISIBILITY:
				setPackageableElement_visibility((VisibilityKind)newValue);
				return;
			case UML2Package.INTERACTION__IS_LEAF:
				setIsLeaf(((Boolean)newValue).booleanValue());
				return;
			case UML2Package.INTERACTION__IS_ABSTRACT:
				setIsAbstract(((Boolean)newValue).booleanValue());
				return;
			case UML2Package.INTERACTION__GENERALIZATION:
				getGeneralizations().clear();
				getGeneralizations().addAll((Collection)newValue);
				return;
			case UML2Package.INTERACTION__REDEFINED_CLASSIFIER:
				getRedefinedClassifiers().clear();
				getRedefinedClassifiers().addAll((Collection)newValue);
				return;
			case UML2Package.INTERACTION__SUBSTITUTION:
				getSubstitutions().clear();
				getSubstitutions().addAll((Collection)newValue);
				return;
			case UML2Package.INTERACTION__POWERTYPE_EXTENT:
				getPowertypeExtents().clear();
				getPowertypeExtents().addAll((Collection)newValue);
				return;
			case UML2Package.INTERACTION__OWNED_USE_CASE:
				getOwnedUseCases().clear();
				getOwnedUseCases().addAll((Collection)newValue);
				return;
			case UML2Package.INTERACTION__USE_CASE:
				getUseCases().clear();
				getUseCases().addAll((Collection)newValue);
				return;
			case UML2Package.INTERACTION__REPRESENTATION:
				setRepresentation((CollaborationOccurrence)newValue);
				return;
			case UML2Package.INTERACTION__OCCURRENCE:
				getOccurrences().clear();
				getOccurrences().addAll((Collection)newValue);
				return;
			case UML2Package.INTERACTION__OWNED_BEHAVIOR:
				getOwnedBehaviors().clear();
				getOwnedBehaviors().addAll((Collection)newValue);
				return;
			case UML2Package.INTERACTION__CLASSIFIER_BEHAVIOR:
				setClassifierBehavior((Behavior)newValue);
				return;
			case UML2Package.INTERACTION__IMPLEMENTATION:
				getImplementations().clear();
				getImplementations().addAll((Collection)newValue);
				return;
			case UML2Package.INTERACTION__OWNED_TRIGGER:
				getOwnedTriggers().clear();
				getOwnedTriggers().addAll((Collection)newValue);
				return;
			case UML2Package.INTERACTION__OWNED_STATE_MACHINE:
				getOwnedStateMachines().clear();
				getOwnedStateMachines().addAll((Collection)newValue);
				return;
			case UML2Package.INTERACTION__OWNED_ATTRIBUTE:
				getOwnedAttributes().clear();
				getOwnedAttributes().addAll((Collection)newValue);
				return;
			case UML2Package.INTERACTION__OWNED_CONNECTOR:
				getOwnedConnectors().clear();
				getOwnedConnectors().addAll((Collection)newValue);
				return;
			case UML2Package.INTERACTION__OWNED_PORT:
				getOwnedPorts().clear();
				getOwnedPorts().addAll((Collection)newValue);
				return;
			case UML2Package.INTERACTION__OWNED_OPERATION:
				getOwnedOperations().clear();
				getOwnedOperations().addAll((Collection)newValue);
				return;
			case UML2Package.INTERACTION__NESTED_CLASSIFIER:
				getNestedClassifiers().clear();
				getNestedClassifiers().addAll((Collection)newValue);
				return;
			case UML2Package.INTERACTION__IS_ACTIVE:
				setIsActive(((Boolean)newValue).booleanValue());
				return;
			case UML2Package.INTERACTION__OWNED_RECEPTION:
				getOwnedReceptions().clear();
				getOwnedReceptions().addAll((Collection)newValue);
				return;
			case UML2Package.INTERACTION__IS_REENTRANT:
				setIsReentrant(((Boolean)newValue).booleanValue());
				return;
			case UML2Package.INTERACTION__CONTEXT:
				setContext((BehavioredClassifier)newValue);
				return;
			case UML2Package.INTERACTION__REDEFINED_BEHAVIOR:
				getRedefinedBehaviors().clear();
				getRedefinedBehaviors().addAll((Collection)newValue);
				return;
			case UML2Package.INTERACTION__SPECIFICATION:
				setSpecification((BehavioralFeature)newValue);
				return;
			case UML2Package.INTERACTION__PARAMETER:
				getParameters().clear();
				getParameters().addAll((Collection)newValue);
				return;
			case UML2Package.INTERACTION__PRECONDITION:
				getPreconditions().clear();
				getPreconditions().addAll((Collection)newValue);
				return;
			case UML2Package.INTERACTION__POSTCONDITION:
				getPostconditions().clear();
				getPostconditions().addAll((Collection)newValue);
				return;
			case UML2Package.INTERACTION__OWNED_PARAMETER_SET:
				getOwnedParameterSets().clear();
				getOwnedParameterSets().addAll((Collection)newValue);
				return;
			case UML2Package.INTERACTION__COVERED:
				getCovereds().clear();
				getCovereds().addAll((Collection)newValue);
				return;
			case UML2Package.INTERACTION__GENERAL_ORDERING:
				getGeneralOrderings().clear();
				getGeneralOrderings().addAll((Collection)newValue);
				return;
			case UML2Package.INTERACTION__ENCLOSING_INTERACTION:
				setEnclosingInteraction((Interaction)newValue);
				return;
			case UML2Package.INTERACTION__ENCLOSING_OPERAND:
				setEnclosingOperand((InteractionOperand)newValue);
				return;
			case UML2Package.INTERACTION__LIFELINE:
				getLifelines().clear();
				getLifelines().addAll((Collection)newValue);
				return;
			case UML2Package.INTERACTION__MESSAGE:
				getMessages().clear();
				getMessages().addAll((Collection)newValue);
				return;
			case UML2Package.INTERACTION__FRAGMENT:
				getFragments().clear();
				getFragments().addAll((Collection)newValue);
				return;
			case UML2Package.INTERACTION__FORMAL_GATE:
				getFormalGates().clear();
				getFormalGates().addAll((Collection)newValue);
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
			case UML2Package.INTERACTION__EANNOTATIONS:
				getEAnnotations().clear();
				return;
			case UML2Package.INTERACTION__OWNED_COMMENT:
				getOwnedComments().clear();
				return;
			case UML2Package.INTERACTION__TEMPLATE_BINDING:
				getTemplateBindings().clear();
				return;
			case UML2Package.INTERACTION__OWNED_TEMPLATE_SIGNATURE:
				setOwnedTemplateSignature((TemplateSignature)null);
				return;
			case UML2Package.INTERACTION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case UML2Package.INTERACTION__VISIBILITY:
				setVisibility(VISIBILITY_EDEFAULT);
				return;
			case UML2Package.INTERACTION__CLIENT_DEPENDENCY:
				getClientDependencies().clear();
				return;
			case UML2Package.INTERACTION__NAME_EXPRESSION:
				setNameExpression((StringExpression)null);
				return;
			case UML2Package.INTERACTION__OWNED_RULE:
				getOwnedRules().clear();
				return;
			case UML2Package.INTERACTION__ELEMENT_IMPORT:
				getElementImports().clear();
				return;
			case UML2Package.INTERACTION__PACKAGE_IMPORT:
				getPackageImports().clear();
				return;
			case UML2Package.INTERACTION__TEMPLATE_PARAMETER:
				setTemplateParameter((TemplateParameter)null);
				return;
			case UML2Package.INTERACTION__OWNING_PARAMETER:
				setOwningParameter((TemplateParameter)null);
				return;
			case UML2Package.INTERACTION__PACKAGEABLE_ELEMENT_VISIBILITY:
				setPackageableElement_visibility(PACKAGEABLE_ELEMENT_VISIBILITY_EDEFAULT);
				return;
			case UML2Package.INTERACTION__IS_LEAF:
				setIsLeaf(IS_LEAF_EDEFAULT);
				return;
			case UML2Package.INTERACTION__IS_ABSTRACT:
				setIsAbstract(IS_ABSTRACT_EDEFAULT);
				return;
			case UML2Package.INTERACTION__GENERALIZATION:
				getGeneralizations().clear();
				return;
			case UML2Package.INTERACTION__REDEFINED_CLASSIFIER:
				getRedefinedClassifiers().clear();
				return;
			case UML2Package.INTERACTION__SUBSTITUTION:
				getSubstitutions().clear();
				return;
			case UML2Package.INTERACTION__POWERTYPE_EXTENT:
				getPowertypeExtents().clear();
				return;
			case UML2Package.INTERACTION__OWNED_USE_CASE:
				getOwnedUseCases().clear();
				return;
			case UML2Package.INTERACTION__USE_CASE:
				getUseCases().clear();
				return;
			case UML2Package.INTERACTION__REPRESENTATION:
				setRepresentation((CollaborationOccurrence)null);
				return;
			case UML2Package.INTERACTION__OCCURRENCE:
				getOccurrences().clear();
				return;
			case UML2Package.INTERACTION__OWNED_BEHAVIOR:
				getOwnedBehaviors().clear();
				return;
			case UML2Package.INTERACTION__CLASSIFIER_BEHAVIOR:
				setClassifierBehavior((Behavior)null);
				return;
			case UML2Package.INTERACTION__IMPLEMENTATION:
				getImplementations().clear();
				return;
			case UML2Package.INTERACTION__OWNED_TRIGGER:
				getOwnedTriggers().clear();
				return;
			case UML2Package.INTERACTION__OWNED_STATE_MACHINE:
				getOwnedStateMachines().clear();
				return;
			case UML2Package.INTERACTION__OWNED_ATTRIBUTE:
				getOwnedAttributes().clear();
				return;
			case UML2Package.INTERACTION__OWNED_CONNECTOR:
				getOwnedConnectors().clear();
				return;
			case UML2Package.INTERACTION__OWNED_PORT:
				getOwnedPorts().clear();
				return;
			case UML2Package.INTERACTION__OWNED_OPERATION:
				getOwnedOperations().clear();
				return;
			case UML2Package.INTERACTION__NESTED_CLASSIFIER:
				getNestedClassifiers().clear();
				return;
			case UML2Package.INTERACTION__IS_ACTIVE:
				setIsActive(IS_ACTIVE_EDEFAULT);
				return;
			case UML2Package.INTERACTION__OWNED_RECEPTION:
				getOwnedReceptions().clear();
				return;
			case UML2Package.INTERACTION__IS_REENTRANT:
				setIsReentrant(IS_REENTRANT_EDEFAULT);
				return;
			case UML2Package.INTERACTION__CONTEXT:
				setContext((BehavioredClassifier)null);
				return;
			case UML2Package.INTERACTION__REDEFINED_BEHAVIOR:
				getRedefinedBehaviors().clear();
				return;
			case UML2Package.INTERACTION__SPECIFICATION:
				setSpecification((BehavioralFeature)null);
				return;
			case UML2Package.INTERACTION__PARAMETER:
				getParameters().clear();
				return;
			case UML2Package.INTERACTION__PRECONDITION:
				getPreconditions().clear();
				return;
			case UML2Package.INTERACTION__POSTCONDITION:
				getPostconditions().clear();
				return;
			case UML2Package.INTERACTION__OWNED_PARAMETER_SET:
				getOwnedParameterSets().clear();
				return;
			case UML2Package.INTERACTION__COVERED:
				getCovereds().clear();
				return;
			case UML2Package.INTERACTION__GENERAL_ORDERING:
				getGeneralOrderings().clear();
				return;
			case UML2Package.INTERACTION__ENCLOSING_INTERACTION:
				setEnclosingInteraction((Interaction)null);
				return;
			case UML2Package.INTERACTION__ENCLOSING_OPERAND:
				setEnclosingOperand((InteractionOperand)null);
				return;
			case UML2Package.INTERACTION__LIFELINE:
				getLifelines().clear();
				return;
			case UML2Package.INTERACTION__MESSAGE:
				getMessages().clear();
				return;
			case UML2Package.INTERACTION__FRAGMENT:
				getFragments().clear();
				return;
			case UML2Package.INTERACTION__FORMAL_GATE:
				getFormalGates().clear();
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
			case UML2Package.INTERACTION__EANNOTATIONS:
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UML2Package.INTERACTION__OWNED_ELEMENT:
				return isSetOwnedElements();
			case UML2Package.INTERACTION__OWNER:
				return isSetOwner();
			case UML2Package.INTERACTION__OWNED_COMMENT:
				EList ownedComment = (EList)eVirtualGet(UML2Package.INTERACTION__OWNED_COMMENT);
				return ownedComment != null && !ownedComment.isEmpty();
			case UML2Package.INTERACTION__TEMPLATE_BINDING:
				EList templateBinding = (EList)eVirtualGet(UML2Package.INTERACTION__TEMPLATE_BINDING);
				return templateBinding != null && !templateBinding.isEmpty();
			case UML2Package.INTERACTION__OWNED_TEMPLATE_SIGNATURE:
				return eVirtualGet(UML2Package.INTERACTION__OWNED_TEMPLATE_SIGNATURE) != null;
			case UML2Package.INTERACTION__NAME:
				String name = eVirtualIsSet(UML2Package.INTERACTION__NAME) ? (String)eVirtualGet(UML2Package.INTERACTION__NAME) : NAME_EDEFAULT;
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case UML2Package.INTERACTION__QUALIFIED_NAME:
				return QUALIFIED_NAME_EDEFAULT == null ? getQualifiedName() != null : !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case UML2Package.INTERACTION__VISIBILITY:
				return eVirtualIsSet(UML2Package.INTERACTION__VISIBILITY) && eVirtualGet(UML2Package.INTERACTION__VISIBILITY) != VISIBILITY_EDEFAULT;
			case UML2Package.INTERACTION__CLIENT_DEPENDENCY:
				EList clientDependency = (EList)eVirtualGet(UML2Package.INTERACTION__CLIENT_DEPENDENCY);
				return clientDependency != null && !clientDependency.isEmpty();
			case UML2Package.INTERACTION__NAME_EXPRESSION:
				return eVirtualGet(UML2Package.INTERACTION__NAME_EXPRESSION) != null;
			case UML2Package.INTERACTION__MEMBER:
				return isSetMembers();
			case UML2Package.INTERACTION__OWNED_RULE:
				EList ownedRule = (EList)eVirtualGet(UML2Package.INTERACTION__OWNED_RULE);
				return ownedRule != null && !ownedRule.isEmpty();
			case UML2Package.INTERACTION__IMPORTED_MEMBER:
				return !getImportedMembers().isEmpty();
			case UML2Package.INTERACTION__ELEMENT_IMPORT:
				EList elementImport = (EList)eVirtualGet(UML2Package.INTERACTION__ELEMENT_IMPORT);
				return elementImport != null && !elementImport.isEmpty();
			case UML2Package.INTERACTION__PACKAGE_IMPORT:
				EList packageImport = (EList)eVirtualGet(UML2Package.INTERACTION__PACKAGE_IMPORT);
				return packageImport != null && !packageImport.isEmpty();
			case UML2Package.INTERACTION__TEMPLATE_PARAMETER:
				return eVirtualGet(UML2Package.INTERACTION__TEMPLATE_PARAMETER) != null;
			case UML2Package.INTERACTION__OWNING_PARAMETER:
				return getOwningParameter() != null;
			case UML2Package.INTERACTION__PACKAGEABLE_ELEMENT_VISIBILITY:
				return isSetPackageableElement_visibility();
			case UML2Package.INTERACTION__PACKAGE:
				return getPackage() != null;
			case UML2Package.INTERACTION__REDEFINITION_CONTEXT:
				return isSetRedefinitionContexts();
			case UML2Package.INTERACTION__IS_LEAF:
				return ((eFlags & IS_LEAF_EFLAG) != 0) != IS_LEAF_EDEFAULT;
			case UML2Package.INTERACTION__FEATURE:
				return isSetFeatures();
			case UML2Package.INTERACTION__IS_ABSTRACT:
				return isAbstract() != IS_ABSTRACT_EDEFAULT;
			case UML2Package.INTERACTION__INHERITED_MEMBER:
				return !getInheritedMembers().isEmpty();
			case UML2Package.INTERACTION__GENERAL:
				return !getGenerals().isEmpty();
			case UML2Package.INTERACTION__GENERALIZATION:
				EList generalization = (EList)eVirtualGet(UML2Package.INTERACTION__GENERALIZATION);
				return generalization != null && !generalization.isEmpty();
			case UML2Package.INTERACTION__ATTRIBUTE:
				return isSetAttributes();
			case UML2Package.INTERACTION__REDEFINED_CLASSIFIER:
				EList redefinedClassifier = (EList)eVirtualGet(UML2Package.INTERACTION__REDEFINED_CLASSIFIER);
				return redefinedClassifier != null && !redefinedClassifier.isEmpty();
			case UML2Package.INTERACTION__SUBSTITUTION:
				EList substitution = (EList)eVirtualGet(UML2Package.INTERACTION__SUBSTITUTION);
				return substitution != null && !substitution.isEmpty();
			case UML2Package.INTERACTION__POWERTYPE_EXTENT:
				EList powertypeExtent = (EList)eVirtualGet(UML2Package.INTERACTION__POWERTYPE_EXTENT);
				return powertypeExtent != null && !powertypeExtent.isEmpty();
			case UML2Package.INTERACTION__OWNED_USE_CASE:
				EList ownedUseCase = (EList)eVirtualGet(UML2Package.INTERACTION__OWNED_USE_CASE);
				return ownedUseCase != null && !ownedUseCase.isEmpty();
			case UML2Package.INTERACTION__USE_CASE:
				EList useCase = (EList)eVirtualGet(UML2Package.INTERACTION__USE_CASE);
				return useCase != null && !useCase.isEmpty();
			case UML2Package.INTERACTION__REPRESENTATION:
				return eVirtualGet(UML2Package.INTERACTION__REPRESENTATION) != null;
			case UML2Package.INTERACTION__OCCURRENCE:
				EList occurrence = (EList)eVirtualGet(UML2Package.INTERACTION__OCCURRENCE);
				return occurrence != null && !occurrence.isEmpty();
			case UML2Package.INTERACTION__OWNED_BEHAVIOR:
				EList ownedBehavior = (EList)eVirtualGet(UML2Package.INTERACTION__OWNED_BEHAVIOR);
				return ownedBehavior != null && !ownedBehavior.isEmpty();
			case UML2Package.INTERACTION__CLASSIFIER_BEHAVIOR:
				return eVirtualGet(UML2Package.INTERACTION__CLASSIFIER_BEHAVIOR) != null;
			case UML2Package.INTERACTION__IMPLEMENTATION:
				EList implementation = (EList)eVirtualGet(UML2Package.INTERACTION__IMPLEMENTATION);
				return implementation != null && !implementation.isEmpty();
			case UML2Package.INTERACTION__OWNED_TRIGGER:
				EList ownedTrigger = (EList)eVirtualGet(UML2Package.INTERACTION__OWNED_TRIGGER);
				return ownedTrigger != null && !ownedTrigger.isEmpty();
			case UML2Package.INTERACTION__OWNED_STATE_MACHINE:
				return isSetOwnedStateMachines();
			case UML2Package.INTERACTION__OWNED_ATTRIBUTE:
				EList ownedAttribute = (EList)eVirtualGet(UML2Package.INTERACTION__OWNED_ATTRIBUTE);
				return ownedAttribute != null && !ownedAttribute.isEmpty();
			case UML2Package.INTERACTION__PART:
				return !getParts().isEmpty();
			case UML2Package.INTERACTION__ROLE:
				return isSetRoles();
			case UML2Package.INTERACTION__OWNED_CONNECTOR:
				EList ownedConnector = (EList)eVirtualGet(UML2Package.INTERACTION__OWNED_CONNECTOR);
				return ownedConnector != null && !ownedConnector.isEmpty();
			case UML2Package.INTERACTION__OWNED_PORT:
				EList ownedPort = (EList)eVirtualGet(UML2Package.INTERACTION__OWNED_PORT);
				return ownedPort != null && !ownedPort.isEmpty();
			case UML2Package.INTERACTION__OWNED_OPERATION:
				EList ownedOperation = (EList)eVirtualGet(UML2Package.INTERACTION__OWNED_OPERATION);
				return ownedOperation != null && !ownedOperation.isEmpty();
			case UML2Package.INTERACTION__SUPER_CLASS:
				return isSetSuperClasses();
			case UML2Package.INTERACTION__EXTENSION:
				return !getExtensions().isEmpty();
			case UML2Package.INTERACTION__NESTED_CLASSIFIER:
				EList nestedClassifier = (EList)eVirtualGet(UML2Package.INTERACTION__NESTED_CLASSIFIER);
				return nestedClassifier != null && !nestedClassifier.isEmpty();
			case UML2Package.INTERACTION__IS_ACTIVE:
				return ((eFlags & IS_ACTIVE_EFLAG) != 0) != IS_ACTIVE_EDEFAULT;
			case UML2Package.INTERACTION__OWNED_RECEPTION:
				EList ownedReception = (EList)eVirtualGet(UML2Package.INTERACTION__OWNED_RECEPTION);
				return ownedReception != null && !ownedReception.isEmpty();
			case UML2Package.INTERACTION__IS_REENTRANT:
				return ((eFlags & IS_REENTRANT_EFLAG) != 0) != IS_REENTRANT_EDEFAULT;
			case UML2Package.INTERACTION__CONTEXT:
				return getContext() != null;
			case UML2Package.INTERACTION__REDEFINED_BEHAVIOR:
				EList redefinedBehavior = (EList)eVirtualGet(UML2Package.INTERACTION__REDEFINED_BEHAVIOR);
				return redefinedBehavior != null && !redefinedBehavior.isEmpty();
			case UML2Package.INTERACTION__SPECIFICATION:
				return eVirtualGet(UML2Package.INTERACTION__SPECIFICATION) != null;
			case UML2Package.INTERACTION__PARAMETER:
				EList parameter = (EList)eVirtualGet(UML2Package.INTERACTION__PARAMETER);
				return parameter != null && !parameter.isEmpty();
			case UML2Package.INTERACTION__FORMAL_PARAMETER:
				return !getFormalParameters().isEmpty();
			case UML2Package.INTERACTION__RETURN_RESULT:
				return !getReturnResults().isEmpty();
			case UML2Package.INTERACTION__PRECONDITION:
				EList precondition = (EList)eVirtualGet(UML2Package.INTERACTION__PRECONDITION);
				return precondition != null && !precondition.isEmpty();
			case UML2Package.INTERACTION__POSTCONDITION:
				EList postcondition = (EList)eVirtualGet(UML2Package.INTERACTION__POSTCONDITION);
				return postcondition != null && !postcondition.isEmpty();
			case UML2Package.INTERACTION__OWNED_PARAMETER_SET:
				EList ownedParameterSet = (EList)eVirtualGet(UML2Package.INTERACTION__OWNED_PARAMETER_SET);
				return ownedParameterSet != null && !ownedParameterSet.isEmpty();
			case UML2Package.INTERACTION__COVERED:
				EList covered = (EList)eVirtualGet(UML2Package.INTERACTION__COVERED);
				return covered != null && !covered.isEmpty();
			case UML2Package.INTERACTION__GENERAL_ORDERING:
				EList generalOrdering = (EList)eVirtualGet(UML2Package.INTERACTION__GENERAL_ORDERING);
				return generalOrdering != null && !generalOrdering.isEmpty();
			case UML2Package.INTERACTION__ENCLOSING_INTERACTION:
				return getEnclosingInteraction() != null;
			case UML2Package.INTERACTION__ENCLOSING_OPERAND:
				return getEnclosingOperand() != null;
			case UML2Package.INTERACTION__LIFELINE:
				EList lifeline = (EList)eVirtualGet(UML2Package.INTERACTION__LIFELINE);
				return lifeline != null && !lifeline.isEmpty();
			case UML2Package.INTERACTION__MESSAGE:
				EList message = (EList)eVirtualGet(UML2Package.INTERACTION__MESSAGE);
				return message != null && !message.isEmpty();
			case UML2Package.INTERACTION__FRAGMENT:
				EList fragment = (EList)eVirtualGet(UML2Package.INTERACTION__FRAGMENT);
				return fragment != null && !fragment.isEmpty();
			case UML2Package.INTERACTION__FORMAL_GATE:
				EList formalGate = (EList)eVirtualGet(UML2Package.INTERACTION__FORMAL_GATE);
				return formalGate != null && !formalGate.isEmpty();
		}
		return eDynamicIsSet(eFeature);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class baseClass) {
		if (baseClass == InteractionFragment.class) {
			switch (derivedFeatureID) {
				case UML2Package.INTERACTION__COVERED: return UML2Package.INTERACTION_FRAGMENT__COVERED;
				case UML2Package.INTERACTION__GENERAL_ORDERING: return UML2Package.INTERACTION_FRAGMENT__GENERAL_ORDERING;
				case UML2Package.INTERACTION__ENCLOSING_INTERACTION: return UML2Package.INTERACTION_FRAGMENT__ENCLOSING_INTERACTION;
				case UML2Package.INTERACTION__ENCLOSING_OPERAND: return UML2Package.INTERACTION_FRAGMENT__ENCLOSING_OPERAND;
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
				case UML2Package.INTERACTION_FRAGMENT__COVERED: return UML2Package.INTERACTION__COVERED;
				case UML2Package.INTERACTION_FRAGMENT__GENERAL_ORDERING: return UML2Package.INTERACTION__GENERAL_ORDERING;
				case UML2Package.INTERACTION_FRAGMENT__ENCLOSING_INTERACTION: return UML2Package.INTERACTION__ENCLOSING_INTERACTION;
				case UML2Package.INTERACTION_FRAGMENT__ENCLOSING_OPERAND: return UML2Package.INTERACTION__ENCLOSING_OPERAND;
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
	protected int eVirtualIndexBits(int offset) {
		switch (offset) {
			case 0 :
				return eVirtualIndexBits0;
			case 1 :
				return eVirtualIndexBits1;
			case 2 :
				return eVirtualIndexBits2;
			default :
				throw new IndexOutOfBoundsException();
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void eSetVirtualIndexBits(int offset, int newIndexBits) {
		switch (offset) {
			case 0 :
				eVirtualIndexBits0 = newIndexBits;
				break;
			case 1 :
				eVirtualIndexBits1 = newIndexBits;
				break;
			case 2 :
				eVirtualIndexBits2 = newIndexBits;
				break;
			default :
				throw new IndexOutOfBoundsException();
		}
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
		return ownedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOwnedElements() {
		return super.isSetOwnedElements()
			|| eIsSet(UML2Package.eINSTANCE.getInteractionFragment_GeneralOrdering());
	}


} //InteractionImpl
