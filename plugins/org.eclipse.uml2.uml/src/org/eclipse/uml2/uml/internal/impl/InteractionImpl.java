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
 * $Id: InteractionImpl.java,v 1.18 2006/02/22 20:48:16 khussey Exp $
 */
package org.eclipse.uml2.uml.internal.impl;

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

import org.eclipse.uml2.common.util.DerivedUnionEObjectEList;

import org.eclipse.uml2.uml.Action;
import org.eclipse.uml2.uml.Behavior;
import org.eclipse.uml2.uml.BehavioralFeature;
import org.eclipse.uml2.uml.CollaborationUse;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Gate;
import org.eclipse.uml2.uml.GeneralOrdering;
import org.eclipse.uml2.uml.Interaction;
import org.eclipse.uml2.uml.InteractionFragment;
import org.eclipse.uml2.uml.InteractionOperand;
import org.eclipse.uml2.uml.Lifeline;
import org.eclipse.uml2.uml.Message;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Namespace;
import org.eclipse.uml2.uml.StringExpression;
import org.eclipse.uml2.uml.TemplateParameter;
import org.eclipse.uml2.uml.TemplateSignature;
import org.eclipse.uml2.uml.UMLFactory;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.VisibilityKind;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Interaction</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.InteractionImpl#getOwnedElements <em>Owned Element</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.InteractionImpl#getCovereds <em>Covered</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.InteractionImpl#getGeneralOrderings <em>General Ordering</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.InteractionImpl#getEnclosingInteraction <em>Enclosing Interaction</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.InteractionImpl#getEnclosingOperand <em>Enclosing Operand</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.InteractionImpl#getOwnedMembers <em>Owned Member</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.InteractionImpl#getLifelines <em>Lifeline</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.InteractionImpl#getFragments <em>Fragment</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.InteractionImpl#getActions <em>Action</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.InteractionImpl#getFormalGates <em>Formal Gate</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.InteractionImpl#getMessages <em>Message</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InteractionImpl
		extends BehaviorImpl
		implements Interaction {

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
		return UMLPackage.Literals.INTERACTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getOwnedElements() {
		EList ownedElement = (EList) eVirtualGet(UMLPackage.INTERACTION__OWNED_ELEMENT);
		if (ownedElement == null) {
			eVirtualSet(UMLPackage.INTERACTION__OWNED_ELEMENT,
				ownedElement = new DerivedUnionEObjectEList(Element.class,
					this, UMLPackage.INTERACTION__OWNED_ELEMENT, new int[]{
						UMLPackage.INTERACTION__OWNED_COMMENT,
						UMLPackage.INTERACTION__NAME_EXPRESSION,
						UMLPackage.INTERACTION__ELEMENT_IMPORT,
						UMLPackage.INTERACTION__PACKAGE_IMPORT,
						UMLPackage.INTERACTION__OWNED_MEMBER,
						UMLPackage.INTERACTION__TEMPLATE_BINDING,
						UMLPackage.INTERACTION__OWNED_TEMPLATE_SIGNATURE,
						UMLPackage.INTERACTION__GENERALIZATION,
						UMLPackage.INTERACTION__SUBSTITUTION,
						UMLPackage.INTERACTION__COLLABORATION_USE,
						UMLPackage.INTERACTION__INTERFACE_REALIZATION,
						UMLPackage.INTERACTION__GENERAL_ORDERING,
						UMLPackage.INTERACTION__ACTION}));
		}
		return ownedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getCovereds() {
		EList covered = (EList) eVirtualGet(UMLPackage.INTERACTION__COVERED);
		if (covered == null) {
			eVirtualSet(UMLPackage.INTERACTION__COVERED,
				covered = new EObjectWithInverseResolvingEList.ManyInverse(
					Lifeline.class, this, UMLPackage.INTERACTION__COVERED,
					UMLPackage.LIFELINE__COVERED_BY));
		}
		return covered;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Lifeline getCovered(String name) {
		return getCovered(name, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Lifeline getCovered(String name, boolean ignoreCase) {
		coveredLoop : for (Iterator i = getCovereds().iterator(); i.hasNext();) {
			Lifeline covered = (Lifeline) i.next();
			if (name != null && !(ignoreCase
				? name.equalsIgnoreCase(covered.getName())
				: name.equals(covered.getName())))
				continue coveredLoop;
			return covered;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getGeneralOrderings() {
		EList generalOrdering = (EList) eVirtualGet(UMLPackage.INTERACTION__GENERAL_ORDERING);
		if (generalOrdering == null) {
			eVirtualSet(UMLPackage.INTERACTION__GENERAL_ORDERING,
				generalOrdering = new EObjectContainmentEList.Resolving(
					GeneralOrdering.class, this,
					UMLPackage.INTERACTION__GENERAL_ORDERING));
		}
		return generalOrdering;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeneralOrdering createGeneralOrdering(String name) {
		GeneralOrdering newGeneralOrdering = UMLFactory.eINSTANCE
			.createGeneralOrdering();
		newGeneralOrdering.setName(name);
		getGeneralOrderings().add(newGeneralOrdering);
		return newGeneralOrdering;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeneralOrdering getGeneralOrdering(String name) {
		return getGeneralOrdering(name, false, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeneralOrdering getGeneralOrdering(String name, boolean ignoreCase,
			boolean createOnDemand) {
		generalOrderingLoop : for (Iterator i = getGeneralOrderings()
			.iterator(); i.hasNext();) {
			GeneralOrdering generalOrdering = (GeneralOrdering) i.next();
			if (name != null && !(ignoreCase
				? name.equalsIgnoreCase(generalOrdering.getName())
				: name.equals(generalOrdering.getName())))
				continue generalOrderingLoop;
			return generalOrdering;
		}
		return createOnDemand
			? createGeneralOrdering(name)
			: null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Interaction getEnclosingInteraction() {
		if (eContainerFeatureID != UMLPackage.INTERACTION__ENCLOSING_INTERACTION)
			return null;
		return (Interaction) eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnclosingInteraction(Interaction newEnclosingInteraction) {
		if (newEnclosingInteraction != eInternalContainer()
			|| (eContainerFeatureID != UMLPackage.INTERACTION__ENCLOSING_INTERACTION && newEnclosingInteraction != null)) {
			if (EcoreUtil.isAncestor(this, newEnclosingInteraction))
				throw new IllegalArgumentException(
					"Recursive containment not allowed for " + toString()); //$NON-NLS-1$
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newEnclosingInteraction != null)
				msgs = ((InternalEObject) newEnclosingInteraction).eInverseAdd(
					this, UMLPackage.INTERACTION__FRAGMENT, Interaction.class,
					msgs);
			msgs = eBasicSetContainer(
				(InternalEObject) newEnclosingInteraction,
				UMLPackage.INTERACTION__ENCLOSING_INTERACTION, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.INTERACTION__ENCLOSING_INTERACTION,
				newEnclosingInteraction, newEnclosingInteraction));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InteractionOperand getEnclosingOperand() {
		if (eContainerFeatureID != UMLPackage.INTERACTION__ENCLOSING_OPERAND)
			return null;
		return (InteractionOperand) eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnclosingOperand(InteractionOperand newEnclosingOperand) {
		if (newEnclosingOperand != eInternalContainer()
			|| (eContainerFeatureID != UMLPackage.INTERACTION__ENCLOSING_OPERAND && newEnclosingOperand != null)) {
			if (EcoreUtil.isAncestor(this, newEnclosingOperand))
				throw new IllegalArgumentException(
					"Recursive containment not allowed for " + toString()); //$NON-NLS-1$
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newEnclosingOperand != null)
				msgs = ((InternalEObject) newEnclosingOperand).eInverseAdd(
					this, UMLPackage.INTERACTION_OPERAND__FRAGMENT,
					InteractionOperand.class, msgs);
			msgs = eBasicSetContainer((InternalEObject) newEnclosingOperand,
				UMLPackage.INTERACTION__ENCLOSING_OPERAND, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.INTERACTION__ENCLOSING_OPERAND, newEnclosingOperand,
				newEnclosingOperand));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getOwnedMembers() {
		EList ownedMember = (EList) eVirtualGet(UMLPackage.INTERACTION__OWNED_MEMBER);
		if (ownedMember == null) {
			eVirtualSet(UMLPackage.INTERACTION__OWNED_MEMBER,
				ownedMember = new DerivedUnionEObjectEList(NamedElement.class,
					this, UMLPackage.INTERACTION__OWNED_MEMBER, new int[]{
						UMLPackage.INTERACTION__OWNED_RULE,
						UMLPackage.INTERACTION__OWNED_USE_CASE,
						UMLPackage.INTERACTION__OWNED_ATTRIBUTE,
						UMLPackage.INTERACTION__OWNED_CONNECTOR,
						UMLPackage.INTERACTION__OWNED_BEHAVIOR,
						UMLPackage.INTERACTION__OWNED_TRIGGER,
						UMLPackage.INTERACTION__NESTED_CLASSIFIER,
						UMLPackage.INTERACTION__OWNED_OPERATION,
						UMLPackage.INTERACTION__OWNED_RECEPTION,
						UMLPackage.INTERACTION__OWNED_PARAMETER,
						UMLPackage.INTERACTION__OWNED_PARAMETER_SET,
						UMLPackage.INTERACTION__LIFELINE,
						UMLPackage.INTERACTION__FRAGMENT,
						UMLPackage.INTERACTION__FORMAL_GATE,
						UMLPackage.INTERACTION__MESSAGE}));
		}
		return ownedMember;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getLifelines() {
		EList lifeline = (EList) eVirtualGet(UMLPackage.INTERACTION__LIFELINE);
		if (lifeline == null) {
			eVirtualSet(UMLPackage.INTERACTION__LIFELINE,
				lifeline = new EObjectContainmentWithInverseEList.Resolving(
					Lifeline.class, this, UMLPackage.INTERACTION__LIFELINE,
					UMLPackage.LIFELINE__INTERACTION));
		}
		return lifeline;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Lifeline createLifeline(String name) {
		Lifeline newLifeline = UMLFactory.eINSTANCE.createLifeline();
		newLifeline.setName(name);
		getLifelines().add(newLifeline);
		return newLifeline;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Lifeline getLifeline(String name) {
		return getLifeline(name, false, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Lifeline getLifeline(String name, boolean ignoreCase,
			boolean createOnDemand) {
		lifelineLoop : for (Iterator i = getLifelines().iterator(); i.hasNext();) {
			Lifeline lifeline = (Lifeline) i.next();
			if (name != null && !(ignoreCase
				? name.equalsIgnoreCase(lifeline.getName())
				: name.equals(lifeline.getName())))
				continue lifelineLoop;
			return lifeline;
		}
		return createOnDemand
			? createLifeline(name)
			: null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getFragments() {
		EList fragment = (EList) eVirtualGet(UMLPackage.INTERACTION__FRAGMENT);
		if (fragment == null) {
			eVirtualSet(UMLPackage.INTERACTION__FRAGMENT,
				fragment = new EObjectContainmentWithInverseEList.Resolving(
					InteractionFragment.class, this,
					UMLPackage.INTERACTION__FRAGMENT,
					UMLPackage.INTERACTION_FRAGMENT__ENCLOSING_INTERACTION));
		}
		return fragment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InteractionFragment createFragment(String name, EClass eClass) {
		InteractionFragment newFragment = (InteractionFragment) EcoreUtil
			.create(eClass);
		newFragment.setName(name);
		getFragments().add(newFragment);
		return newFragment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InteractionFragment getFragment(String name) {
		return getFragment(name, false, null, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InteractionFragment getFragment(String name, boolean ignoreCase,
			EClass eClass, boolean createOnDemand) {
		fragmentLoop : for (Iterator i = getFragments().iterator(); i.hasNext();) {
			InteractionFragment fragment = (InteractionFragment) i.next();
			if (eClass != null && !eClass.isInstance(fragment))
				continue fragmentLoop;
			if (name != null && !(ignoreCase
				? name.equalsIgnoreCase(fragment.getName())
				: name.equals(fragment.getName())))
				continue fragmentLoop;
			return fragment;
		}
		return createOnDemand && eClass != null
			? createFragment(name, eClass)
			: null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getActions() {
		EList action = (EList) eVirtualGet(UMLPackage.INTERACTION__ACTION);
		if (action == null) {
			eVirtualSet(UMLPackage.INTERACTION__ACTION,
				action = new EObjectContainmentEList.Resolving(Action.class,
					this, UMLPackage.INTERACTION__ACTION));
		}
		return action;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Action createAction(String name, EClass eClass) {
		Action newAction = (Action) EcoreUtil.create(eClass);
		newAction.setName(name);
		getActions().add(newAction);
		return newAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Action getAction(String name) {
		return getAction(name, false, null, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Action getAction(String name, boolean ignoreCase, EClass eClass,
			boolean createOnDemand) {
		actionLoop : for (Iterator i = getActions().iterator(); i.hasNext();) {
			Action action = (Action) i.next();
			if (eClass != null && !eClass.isInstance(action))
				continue actionLoop;
			if (name != null && !(ignoreCase
				? name.equalsIgnoreCase(action.getName())
				: name.equals(action.getName())))
				continue actionLoop;
			return action;
		}
		return createOnDemand && eClass != null
			? createAction(name, eClass)
			: null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getFormalGates() {
		EList formalGate = (EList) eVirtualGet(UMLPackage.INTERACTION__FORMAL_GATE);
		if (formalGate == null) {
			eVirtualSet(UMLPackage.INTERACTION__FORMAL_GATE,
				formalGate = new EObjectContainmentEList.Resolving(Gate.class,
					this, UMLPackage.INTERACTION__FORMAL_GATE));
		}
		return formalGate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Gate createFormalGate(String name) {
		Gate newFormalGate = UMLFactory.eINSTANCE.createGate();
		newFormalGate.setName(name);
		getFormalGates().add(newFormalGate);
		return newFormalGate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Gate getFormalGate(String name) {
		return getFormalGate(name, false, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Gate getFormalGate(String name, boolean ignoreCase,
			boolean createOnDemand) {
		formalGateLoop : for (Iterator i = getFormalGates().iterator(); i
			.hasNext();) {
			Gate formalGate = (Gate) i.next();
			if (name != null && !(ignoreCase
				? name.equalsIgnoreCase(formalGate.getName())
				: name.equals(formalGate.getName())))
				continue formalGateLoop;
			return formalGate;
		}
		return createOnDemand
			? createFormalGate(name)
			: null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getMessages() {
		EList message = (EList) eVirtualGet(UMLPackage.INTERACTION__MESSAGE);
		if (message == null) {
			eVirtualSet(UMLPackage.INTERACTION__MESSAGE,
				message = new EObjectContainmentWithInverseEList.Resolving(
					Message.class, this, UMLPackage.INTERACTION__MESSAGE,
					UMLPackage.MESSAGE__INTERACTION));
		}
		return message;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Message createMessage(String name) {
		Message newMessage = UMLFactory.eINSTANCE.createMessage();
		newMessage.setName(name);
		getMessages().add(newMessage);
		return newMessage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Message getMessage(String name) {
		return getMessage(name, false, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Message getMessage(String name, boolean ignoreCase,
			boolean createOnDemand) {
		messageLoop : for (Iterator i = getMessages().iterator(); i.hasNext();) {
			Message message = (Message) i.next();
			if (name != null && !(ignoreCase
				? name.equalsIgnoreCase(message.getName())
				: name.equals(message.getName())))
				continue messageLoop;
			return message;
		}
		return createOnDemand
			? createMessage(name)
			: null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UMLPackage.INTERACTION__EANNOTATIONS :
				return ((InternalEList) getEAnnotations()).basicAdd(otherEnd,
					msgs);
			case UMLPackage.INTERACTION__CLIENT_DEPENDENCY :
				return ((InternalEList) getClientDependencies()).basicAdd(
					otherEnd, msgs);
			case UMLPackage.INTERACTION__ELEMENT_IMPORT :
				return ((InternalEList) getElementImports()).basicAdd(otherEnd,
					msgs);
			case UMLPackage.INTERACTION__PACKAGE_IMPORT :
				return ((InternalEList) getPackageImports()).basicAdd(otherEnd,
					msgs);
			case UMLPackage.INTERACTION__OWNED_RULE :
				return ((InternalEList) getOwnedRules()).basicAdd(otherEnd,
					msgs);
			case UMLPackage.INTERACTION__OWNING_TEMPLATE_PARAMETER :
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return eBasicSetContainer(otherEnd,
					UMLPackage.INTERACTION__OWNING_TEMPLATE_PARAMETER, msgs);
			case UMLPackage.INTERACTION__TEMPLATE_PARAMETER :
				TemplateParameter templateParameter = (TemplateParameter) eVirtualGet(UMLPackage.INTERACTION__TEMPLATE_PARAMETER);
				if (templateParameter != null)
					msgs = ((InternalEObject) templateParameter)
						.eInverseRemove(this,
							UMLPackage.TEMPLATE_PARAMETER__PARAMETERED_ELEMENT,
							TemplateParameter.class, msgs);
				return basicSetTemplateParameter((TemplateParameter) otherEnd,
					msgs);
			case UMLPackage.INTERACTION__TEMPLATE_BINDING :
				return ((InternalEList) getTemplateBindings()).basicAdd(
					otherEnd, msgs);
			case UMLPackage.INTERACTION__OWNED_TEMPLATE_SIGNATURE :
				TemplateSignature ownedTemplateSignature = (TemplateSignature) eVirtualGet(UMLPackage.INTERACTION__OWNED_TEMPLATE_SIGNATURE);
				if (ownedTemplateSignature != null)
					msgs = ((InternalEObject) ownedTemplateSignature)
						.eInverseRemove(this, EOPPOSITE_FEATURE_BASE
							- UMLPackage.INTERACTION__OWNED_TEMPLATE_SIGNATURE,
							null, msgs);
				return basicSetOwnedTemplateSignature(
					(TemplateSignature) otherEnd, msgs);
			case UMLPackage.INTERACTION__GENERALIZATION :
				return ((InternalEList) getGeneralizations()).basicAdd(
					otherEnd, msgs);
			case UMLPackage.INTERACTION__POWERTYPE_EXTENT :
				return ((InternalEList) getPowertypeExtents()).basicAdd(
					otherEnd, msgs);
			case UMLPackage.INTERACTION__SUBSTITUTION :
				return ((InternalEList) getSubstitutions()).basicAdd(otherEnd,
					msgs);
			case UMLPackage.INTERACTION__USE_CASE :
				return ((InternalEList) getUseCases()).basicAdd(otherEnd, msgs);
			case UMLPackage.INTERACTION__INTERFACE_REALIZATION :
				return ((InternalEList) getInterfaceRealizations()).basicAdd(
					otherEnd, msgs);
			case UMLPackage.INTERACTION__OWNED_OPERATION :
				return ((InternalEList) getOwnedOperations()).basicAdd(
					otherEnd, msgs);
			case UMLPackage.INTERACTION__SPECIFICATION :
				BehavioralFeature specification = (BehavioralFeature) eVirtualGet(UMLPackage.INTERACTION__SPECIFICATION);
				if (specification != null)
					msgs = ((InternalEObject) specification).eInverseRemove(
						this, UMLPackage.BEHAVIORAL_FEATURE__METHOD,
						BehavioralFeature.class, msgs);
				return basicSetSpecification((BehavioralFeature) otherEnd, msgs);
			case UMLPackage.INTERACTION__COVERED :
				return ((InternalEList) getCovereds()).basicAdd(otherEnd, msgs);
			case UMLPackage.INTERACTION__ENCLOSING_INTERACTION :
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return eBasicSetContainer(otherEnd,
					UMLPackage.INTERACTION__ENCLOSING_INTERACTION, msgs);
			case UMLPackage.INTERACTION__ENCLOSING_OPERAND :
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return eBasicSetContainer(otherEnd,
					UMLPackage.INTERACTION__ENCLOSING_OPERAND, msgs);
			case UMLPackage.INTERACTION__LIFELINE :
				return ((InternalEList) getLifelines())
					.basicAdd(otherEnd, msgs);
			case UMLPackage.INTERACTION__FRAGMENT :
				return ((InternalEList) getFragments())
					.basicAdd(otherEnd, msgs);
			case UMLPackage.INTERACTION__MESSAGE :
				return ((InternalEList) getMessages()).basicAdd(otherEnd, msgs);
		}
		return eDynamicInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UMLPackage.INTERACTION__EANNOTATIONS :
				return ((InternalEList) getEAnnotations()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.INTERACTION__OWNED_COMMENT :
				return ((InternalEList) getOwnedComments()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.INTERACTION__CLIENT_DEPENDENCY :
				return ((InternalEList) getClientDependencies()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.INTERACTION__NAME_EXPRESSION :
				return basicSetNameExpression(null, msgs);
			case UMLPackage.INTERACTION__ELEMENT_IMPORT :
				return ((InternalEList) getElementImports()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.INTERACTION__PACKAGE_IMPORT :
				return ((InternalEList) getPackageImports()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.INTERACTION__OWNED_RULE :
				return ((InternalEList) getOwnedRules()).basicRemove(otherEnd,
					msgs);
			case UMLPackage.INTERACTION__OWNING_TEMPLATE_PARAMETER :
				return eBasicSetContainer(null,
					UMLPackage.INTERACTION__OWNING_TEMPLATE_PARAMETER, msgs);
			case UMLPackage.INTERACTION__TEMPLATE_PARAMETER :
				return basicSetTemplateParameter(null, msgs);
			case UMLPackage.INTERACTION__TEMPLATE_BINDING :
				return ((InternalEList) getTemplateBindings()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.INTERACTION__OWNED_TEMPLATE_SIGNATURE :
				return basicSetOwnedTemplateSignature(null, msgs);
			case UMLPackage.INTERACTION__GENERALIZATION :
				return ((InternalEList) getGeneralizations()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.INTERACTION__POWERTYPE_EXTENT :
				return ((InternalEList) getPowertypeExtents()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.INTERACTION__SUBSTITUTION :
				return ((InternalEList) getSubstitutions()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.INTERACTION__COLLABORATION_USE :
				return ((InternalEList) getCollaborationUses()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.INTERACTION__OWNED_USE_CASE :
				return ((InternalEList) getOwnedUseCases()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.INTERACTION__USE_CASE :
				return ((InternalEList) getUseCases()).basicRemove(otherEnd,
					msgs);
			case UMLPackage.INTERACTION__OWNED_ATTRIBUTE :
				return ((InternalEList) getOwnedAttributes()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.INTERACTION__OWNED_CONNECTOR :
				return ((InternalEList) getOwnedConnectors()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.INTERACTION__OWNED_BEHAVIOR :
				return ((InternalEList) getOwnedBehaviors()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.INTERACTION__INTERFACE_REALIZATION :
				return ((InternalEList) getInterfaceRealizations())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.INTERACTION__OWNED_TRIGGER :
				return ((InternalEList) getOwnedTriggers()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.INTERACTION__NESTED_CLASSIFIER :
				return ((InternalEList) getNestedClassifiers()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.INTERACTION__OWNED_OPERATION :
				return ((InternalEList) getOwnedOperations()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.INTERACTION__OWNED_RECEPTION :
				return ((InternalEList) getOwnedReceptions()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.INTERACTION__OWNED_PARAMETER :
				return ((InternalEList) getOwnedParameters()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.INTERACTION__PRECONDITION :
				return ((InternalEList) getPreconditions()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.INTERACTION__POSTCONDITION :
				return ((InternalEList) getPostconditions()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.INTERACTION__OWNED_PARAMETER_SET :
				return ((InternalEList) getOwnedParameterSets()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.INTERACTION__SPECIFICATION :
				return basicSetSpecification(null, msgs);
			case UMLPackage.INTERACTION__COVERED :
				return ((InternalEList) getCovereds()).basicRemove(otherEnd,
					msgs);
			case UMLPackage.INTERACTION__GENERAL_ORDERING :
				return ((InternalEList) getGeneralOrderings()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.INTERACTION__ENCLOSING_INTERACTION :
				return eBasicSetContainer(null,
					UMLPackage.INTERACTION__ENCLOSING_INTERACTION, msgs);
			case UMLPackage.INTERACTION__ENCLOSING_OPERAND :
				return eBasicSetContainer(null,
					UMLPackage.INTERACTION__ENCLOSING_OPERAND, msgs);
			case UMLPackage.INTERACTION__LIFELINE :
				return ((InternalEList) getLifelines()).basicRemove(otherEnd,
					msgs);
			case UMLPackage.INTERACTION__FRAGMENT :
				return ((InternalEList) getFragments()).basicRemove(otherEnd,
					msgs);
			case UMLPackage.INTERACTION__ACTION :
				return ((InternalEList) getActions()).basicRemove(otherEnd,
					msgs);
			case UMLPackage.INTERACTION__FORMAL_GATE :
				return ((InternalEList) getFormalGates()).basicRemove(otherEnd,
					msgs);
			case UMLPackage.INTERACTION__MESSAGE :
				return ((InternalEList) getMessages()).basicRemove(otherEnd,
					msgs);
		}
		return eDynamicInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eBasicRemoveFromContainerFeature(
			NotificationChain msgs) {
		switch (eContainerFeatureID) {
			case UMLPackage.INTERACTION__OWNING_TEMPLATE_PARAMETER :
				return eInternalContainer().eInverseRemove(this,
					UMLPackage.TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT,
					TemplateParameter.class, msgs);
			case UMLPackage.INTERACTION__ENCLOSING_INTERACTION :
				return eInternalContainer().eInverseRemove(this,
					UMLPackage.INTERACTION__FRAGMENT, Interaction.class, msgs);
			case UMLPackage.INTERACTION__ENCLOSING_OPERAND :
				return eInternalContainer().eInverseRemove(this,
					UMLPackage.INTERACTION_OPERAND__FRAGMENT,
					InteractionOperand.class, msgs);
		}
		return eDynamicBasicRemoveFromContainer(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UMLPackage.INTERACTION__EANNOTATIONS :
				return getEAnnotations();
			case UMLPackage.INTERACTION__OWNED_ELEMENT :
				return getOwnedElements();
			case UMLPackage.INTERACTION__OWNER :
				if (resolve)
					return getOwner();
				return basicGetOwner();
			case UMLPackage.INTERACTION__OWNED_COMMENT :
				return getOwnedComments();
			case UMLPackage.INTERACTION__NAME :
				return getName();
			case UMLPackage.INTERACTION__VISIBILITY :
				return getVisibility();
			case UMLPackage.INTERACTION__QUALIFIED_NAME :
				return getQualifiedName();
			case UMLPackage.INTERACTION__CLIENT_DEPENDENCY :
				return getClientDependencies();
			case UMLPackage.INTERACTION__NAMESPACE :
				if (resolve)
					return getNamespace();
				return basicGetNamespace();
			case UMLPackage.INTERACTION__NAME_EXPRESSION :
				if (resolve)
					return getNameExpression();
				return basicGetNameExpression();
			case UMLPackage.INTERACTION__ELEMENT_IMPORT :
				return getElementImports();
			case UMLPackage.INTERACTION__PACKAGE_IMPORT :
				return getPackageImports();
			case UMLPackage.INTERACTION__OWNED_RULE :
				return getOwnedRules();
			case UMLPackage.INTERACTION__MEMBER :
				return getMembers();
			case UMLPackage.INTERACTION__IMPORTED_MEMBER :
				return getImportedMembers();
			case UMLPackage.INTERACTION__OWNED_MEMBER :
				return getOwnedMembers();
			case UMLPackage.INTERACTION__IS_LEAF :
				return isLeaf()
					? Boolean.TRUE
					: Boolean.FALSE;
			case UMLPackage.INTERACTION__REDEFINED_ELEMENT :
				return getRedefinedElements();
			case UMLPackage.INTERACTION__REDEFINITION_CONTEXT :
				return getRedefinitionContexts();
			case UMLPackage.INTERACTION__OWNING_TEMPLATE_PARAMETER :
				if (resolve)
					return getOwningTemplateParameter();
				return basicGetOwningTemplateParameter();
			case UMLPackage.INTERACTION__TEMPLATE_PARAMETER :
				if (resolve)
					return getTemplateParameter();
				return basicGetTemplateParameter();
			case UMLPackage.INTERACTION__PACKAGE :
				if (resolve)
					return getPackage();
				return basicGetPackage();
			case UMLPackage.INTERACTION__TEMPLATE_BINDING :
				return getTemplateBindings();
			case UMLPackage.INTERACTION__OWNED_TEMPLATE_SIGNATURE :
				if (resolve)
					return getOwnedTemplateSignature();
				return basicGetOwnedTemplateSignature();
			case UMLPackage.INTERACTION__IS_ABSTRACT :
				return isAbstract()
					? Boolean.TRUE
					: Boolean.FALSE;
			case UMLPackage.INTERACTION__GENERALIZATION :
				return getGeneralizations();
			case UMLPackage.INTERACTION__POWERTYPE_EXTENT :
				return getPowertypeExtents();
			case UMLPackage.INTERACTION__FEATURE :
				return getFeatures();
			case UMLPackage.INTERACTION__INHERITED_MEMBER :
				return getInheritedMembers();
			case UMLPackage.INTERACTION__REDEFINED_CLASSIFIER :
				return getRedefinedClassifiers();
			case UMLPackage.INTERACTION__GENERAL :
				return getGenerals();
			case UMLPackage.INTERACTION__SUBSTITUTION :
				return getSubstitutions();
			case UMLPackage.INTERACTION__ATTRIBUTE :
				return getAttributes();
			case UMLPackage.INTERACTION__REPRESENTATION :
				if (resolve)
					return getRepresentation();
				return basicGetRepresentation();
			case UMLPackage.INTERACTION__COLLABORATION_USE :
				return getCollaborationUses();
			case UMLPackage.INTERACTION__OWNED_USE_CASE :
				return getOwnedUseCases();
			case UMLPackage.INTERACTION__USE_CASE :
				return getUseCases();
			case UMLPackage.INTERACTION__OWNED_ATTRIBUTE :
				return getOwnedAttributes();
			case UMLPackage.INTERACTION__PART :
				return getParts();
			case UMLPackage.INTERACTION__ROLE :
				return getRoles();
			case UMLPackage.INTERACTION__OWNED_CONNECTOR :
				return getOwnedConnectors();
			case UMLPackage.INTERACTION__OWNED_PORT :
				return getOwnedPorts();
			case UMLPackage.INTERACTION__OWNED_BEHAVIOR :
				return getOwnedBehaviors();
			case UMLPackage.INTERACTION__CLASSIFIER_BEHAVIOR :
				if (resolve)
					return getClassifierBehavior();
				return basicGetClassifierBehavior();
			case UMLPackage.INTERACTION__INTERFACE_REALIZATION :
				return getInterfaceRealizations();
			case UMLPackage.INTERACTION__OWNED_TRIGGER :
				return getOwnedTriggers();
			case UMLPackage.INTERACTION__NESTED_CLASSIFIER :
				return getNestedClassifiers();
			case UMLPackage.INTERACTION__OWNED_OPERATION :
				return getOwnedOperations();
			case UMLPackage.INTERACTION__SUPER_CLASS :
				return getSuperClasses();
			case UMLPackage.INTERACTION__IS_ACTIVE :
				return isActive()
					? Boolean.TRUE
					: Boolean.FALSE;
			case UMLPackage.INTERACTION__OWNED_RECEPTION :
				return getOwnedReceptions();
			case UMLPackage.INTERACTION__EXTENSION :
				return getExtensions();
			case UMLPackage.INTERACTION__IS_REENTRANT :
				return isReentrant()
					? Boolean.TRUE
					: Boolean.FALSE;
			case UMLPackage.INTERACTION__REDEFINED_BEHAVIOR :
				return getRedefinedBehaviors();
			case UMLPackage.INTERACTION__OWNED_PARAMETER :
				return getOwnedParameters();
			case UMLPackage.INTERACTION__CONTEXT :
				if (resolve)
					return getContext();
				return basicGetContext();
			case UMLPackage.INTERACTION__PRECONDITION :
				return getPreconditions();
			case UMLPackage.INTERACTION__POSTCONDITION :
				return getPostconditions();
			case UMLPackage.INTERACTION__OWNED_PARAMETER_SET :
				return getOwnedParameterSets();
			case UMLPackage.INTERACTION__SPECIFICATION :
				if (resolve)
					return getSpecification();
				return basicGetSpecification();
			case UMLPackage.INTERACTION__COVERED :
				return getCovereds();
			case UMLPackage.INTERACTION__GENERAL_ORDERING :
				return getGeneralOrderings();
			case UMLPackage.INTERACTION__ENCLOSING_INTERACTION :
				return getEnclosingInteraction();
			case UMLPackage.INTERACTION__ENCLOSING_OPERAND :
				return getEnclosingOperand();
			case UMLPackage.INTERACTION__LIFELINE :
				return getLifelines();
			case UMLPackage.INTERACTION__FRAGMENT :
				return getFragments();
			case UMLPackage.INTERACTION__ACTION :
				return getActions();
			case UMLPackage.INTERACTION__FORMAL_GATE :
				return getFormalGates();
			case UMLPackage.INTERACTION__MESSAGE :
				return getMessages();
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
			case UMLPackage.INTERACTION__EANNOTATIONS :
				getEAnnotations().clear();
				getEAnnotations().addAll((Collection) newValue);
				return;
			case UMLPackage.INTERACTION__OWNED_COMMENT :
				getOwnedComments().clear();
				getOwnedComments().addAll((Collection) newValue);
				return;
			case UMLPackage.INTERACTION__NAME :
				setName((String) newValue);
				return;
			case UMLPackage.INTERACTION__VISIBILITY :
				setVisibility((VisibilityKind) newValue);
				return;
			case UMLPackage.INTERACTION__CLIENT_DEPENDENCY :
				getClientDependencies().clear();
				getClientDependencies().addAll((Collection) newValue);
				return;
			case UMLPackage.INTERACTION__NAME_EXPRESSION :
				setNameExpression((StringExpression) newValue);
				return;
			case UMLPackage.INTERACTION__ELEMENT_IMPORT :
				getElementImports().clear();
				getElementImports().addAll((Collection) newValue);
				return;
			case UMLPackage.INTERACTION__PACKAGE_IMPORT :
				getPackageImports().clear();
				getPackageImports().addAll((Collection) newValue);
				return;
			case UMLPackage.INTERACTION__OWNED_RULE :
				getOwnedRules().clear();
				getOwnedRules().addAll((Collection) newValue);
				return;
			case UMLPackage.INTERACTION__IS_LEAF :
				setIsLeaf(((Boolean) newValue).booleanValue());
				return;
			case UMLPackage.INTERACTION__OWNING_TEMPLATE_PARAMETER :
				setOwningTemplateParameter((TemplateParameter) newValue);
				return;
			case UMLPackage.INTERACTION__TEMPLATE_PARAMETER :
				setTemplateParameter((TemplateParameter) newValue);
				return;
			case UMLPackage.INTERACTION__PACKAGE :
				setPackage((org.eclipse.uml2.uml.Package) newValue);
				return;
			case UMLPackage.INTERACTION__TEMPLATE_BINDING :
				getTemplateBindings().clear();
				getTemplateBindings().addAll((Collection) newValue);
				return;
			case UMLPackage.INTERACTION__OWNED_TEMPLATE_SIGNATURE :
				setOwnedTemplateSignature((TemplateSignature) newValue);
				return;
			case UMLPackage.INTERACTION__IS_ABSTRACT :
				setIsAbstract(((Boolean) newValue).booleanValue());
				return;
			case UMLPackage.INTERACTION__GENERALIZATION :
				getGeneralizations().clear();
				getGeneralizations().addAll((Collection) newValue);
				return;
			case UMLPackage.INTERACTION__POWERTYPE_EXTENT :
				getPowertypeExtents().clear();
				getPowertypeExtents().addAll((Collection) newValue);
				return;
			case UMLPackage.INTERACTION__REDEFINED_CLASSIFIER :
				getRedefinedClassifiers().clear();
				getRedefinedClassifiers().addAll((Collection) newValue);
				return;
			case UMLPackage.INTERACTION__GENERAL :
				getGenerals().clear();
				getGenerals().addAll((Collection) newValue);
				return;
			case UMLPackage.INTERACTION__SUBSTITUTION :
				getSubstitutions().clear();
				getSubstitutions().addAll((Collection) newValue);
				return;
			case UMLPackage.INTERACTION__REPRESENTATION :
				setRepresentation((CollaborationUse) newValue);
				return;
			case UMLPackage.INTERACTION__COLLABORATION_USE :
				getCollaborationUses().clear();
				getCollaborationUses().addAll((Collection) newValue);
				return;
			case UMLPackage.INTERACTION__OWNED_USE_CASE :
				getOwnedUseCases().clear();
				getOwnedUseCases().addAll((Collection) newValue);
				return;
			case UMLPackage.INTERACTION__USE_CASE :
				getUseCases().clear();
				getUseCases().addAll((Collection) newValue);
				return;
			case UMLPackage.INTERACTION__OWNED_ATTRIBUTE :
				getOwnedAttributes().clear();
				getOwnedAttributes().addAll((Collection) newValue);
				return;
			case UMLPackage.INTERACTION__OWNED_CONNECTOR :
				getOwnedConnectors().clear();
				getOwnedConnectors().addAll((Collection) newValue);
				return;
			case UMLPackage.INTERACTION__OWNED_PORT :
				getOwnedPorts().clear();
				getOwnedPorts().addAll((Collection) newValue);
				return;
			case UMLPackage.INTERACTION__OWNED_BEHAVIOR :
				getOwnedBehaviors().clear();
				getOwnedBehaviors().addAll((Collection) newValue);
				return;
			case UMLPackage.INTERACTION__CLASSIFIER_BEHAVIOR :
				setClassifierBehavior((Behavior) newValue);
				return;
			case UMLPackage.INTERACTION__INTERFACE_REALIZATION :
				getInterfaceRealizations().clear();
				getInterfaceRealizations().addAll((Collection) newValue);
				return;
			case UMLPackage.INTERACTION__OWNED_TRIGGER :
				getOwnedTriggers().clear();
				getOwnedTriggers().addAll((Collection) newValue);
				return;
			case UMLPackage.INTERACTION__NESTED_CLASSIFIER :
				getNestedClassifiers().clear();
				getNestedClassifiers().addAll((Collection) newValue);
				return;
			case UMLPackage.INTERACTION__OWNED_OPERATION :
				getOwnedOperations().clear();
				getOwnedOperations().addAll((Collection) newValue);
				return;
			case UMLPackage.INTERACTION__SUPER_CLASS :
				getSuperClasses().clear();
				getSuperClasses().addAll((Collection) newValue);
				return;
			case UMLPackage.INTERACTION__IS_ACTIVE :
				setIsActive(((Boolean) newValue).booleanValue());
				return;
			case UMLPackage.INTERACTION__OWNED_RECEPTION :
				getOwnedReceptions().clear();
				getOwnedReceptions().addAll((Collection) newValue);
				return;
			case UMLPackage.INTERACTION__IS_REENTRANT :
				setIsReentrant(((Boolean) newValue).booleanValue());
				return;
			case UMLPackage.INTERACTION__REDEFINED_BEHAVIOR :
				getRedefinedBehaviors().clear();
				getRedefinedBehaviors().addAll((Collection) newValue);
				return;
			case UMLPackage.INTERACTION__OWNED_PARAMETER :
				getOwnedParameters().clear();
				getOwnedParameters().addAll((Collection) newValue);
				return;
			case UMLPackage.INTERACTION__PRECONDITION :
				getPreconditions().clear();
				getPreconditions().addAll((Collection) newValue);
				return;
			case UMLPackage.INTERACTION__POSTCONDITION :
				getPostconditions().clear();
				getPostconditions().addAll((Collection) newValue);
				return;
			case UMLPackage.INTERACTION__OWNED_PARAMETER_SET :
				getOwnedParameterSets().clear();
				getOwnedParameterSets().addAll((Collection) newValue);
				return;
			case UMLPackage.INTERACTION__SPECIFICATION :
				setSpecification((BehavioralFeature) newValue);
				return;
			case UMLPackage.INTERACTION__COVERED :
				getCovereds().clear();
				getCovereds().addAll((Collection) newValue);
				return;
			case UMLPackage.INTERACTION__GENERAL_ORDERING :
				getGeneralOrderings().clear();
				getGeneralOrderings().addAll((Collection) newValue);
				return;
			case UMLPackage.INTERACTION__ENCLOSING_INTERACTION :
				setEnclosingInteraction((Interaction) newValue);
				return;
			case UMLPackage.INTERACTION__ENCLOSING_OPERAND :
				setEnclosingOperand((InteractionOperand) newValue);
				return;
			case UMLPackage.INTERACTION__LIFELINE :
				getLifelines().clear();
				getLifelines().addAll((Collection) newValue);
				return;
			case UMLPackage.INTERACTION__FRAGMENT :
				getFragments().clear();
				getFragments().addAll((Collection) newValue);
				return;
			case UMLPackage.INTERACTION__ACTION :
				getActions().clear();
				getActions().addAll((Collection) newValue);
				return;
			case UMLPackage.INTERACTION__FORMAL_GATE :
				getFormalGates().clear();
				getFormalGates().addAll((Collection) newValue);
				return;
			case UMLPackage.INTERACTION__MESSAGE :
				getMessages().clear();
				getMessages().addAll((Collection) newValue);
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
			case UMLPackage.INTERACTION__EANNOTATIONS :
				getEAnnotations().clear();
				return;
			case UMLPackage.INTERACTION__OWNED_COMMENT :
				getOwnedComments().clear();
				return;
			case UMLPackage.INTERACTION__NAME :
				unsetName();
				return;
			case UMLPackage.INTERACTION__VISIBILITY :
				unsetVisibility();
				return;
			case UMLPackage.INTERACTION__CLIENT_DEPENDENCY :
				getClientDependencies().clear();
				return;
			case UMLPackage.INTERACTION__NAME_EXPRESSION :
				setNameExpression((StringExpression) null);
				return;
			case UMLPackage.INTERACTION__ELEMENT_IMPORT :
				getElementImports().clear();
				return;
			case UMLPackage.INTERACTION__PACKAGE_IMPORT :
				getPackageImports().clear();
				return;
			case UMLPackage.INTERACTION__OWNED_RULE :
				getOwnedRules().clear();
				return;
			case UMLPackage.INTERACTION__IS_LEAF :
				setIsLeaf(IS_LEAF_EDEFAULT);
				return;
			case UMLPackage.INTERACTION__OWNING_TEMPLATE_PARAMETER :
				setOwningTemplateParameter((TemplateParameter) null);
				return;
			case UMLPackage.INTERACTION__TEMPLATE_PARAMETER :
				setTemplateParameter((TemplateParameter) null);
				return;
			case UMLPackage.INTERACTION__PACKAGE :
				setPackage((org.eclipse.uml2.uml.Package) null);
				return;
			case UMLPackage.INTERACTION__TEMPLATE_BINDING :
				getTemplateBindings().clear();
				return;
			case UMLPackage.INTERACTION__OWNED_TEMPLATE_SIGNATURE :
				setOwnedTemplateSignature((TemplateSignature) null);
				return;
			case UMLPackage.INTERACTION__IS_ABSTRACT :
				setIsAbstract(IS_ABSTRACT_EDEFAULT);
				return;
			case UMLPackage.INTERACTION__GENERALIZATION :
				getGeneralizations().clear();
				return;
			case UMLPackage.INTERACTION__POWERTYPE_EXTENT :
				getPowertypeExtents().clear();
				return;
			case UMLPackage.INTERACTION__REDEFINED_CLASSIFIER :
				getRedefinedClassifiers().clear();
				return;
			case UMLPackage.INTERACTION__GENERAL :
				getGenerals().clear();
				return;
			case UMLPackage.INTERACTION__SUBSTITUTION :
				getSubstitutions().clear();
				return;
			case UMLPackage.INTERACTION__REPRESENTATION :
				setRepresentation((CollaborationUse) null);
				return;
			case UMLPackage.INTERACTION__COLLABORATION_USE :
				getCollaborationUses().clear();
				return;
			case UMLPackage.INTERACTION__OWNED_USE_CASE :
				getOwnedUseCases().clear();
				return;
			case UMLPackage.INTERACTION__USE_CASE :
				getUseCases().clear();
				return;
			case UMLPackage.INTERACTION__OWNED_ATTRIBUTE :
				getOwnedAttributes().clear();
				return;
			case UMLPackage.INTERACTION__OWNED_CONNECTOR :
				getOwnedConnectors().clear();
				return;
			case UMLPackage.INTERACTION__OWNED_PORT :
				getOwnedPorts().clear();
				return;
			case UMLPackage.INTERACTION__OWNED_BEHAVIOR :
				getOwnedBehaviors().clear();
				return;
			case UMLPackage.INTERACTION__CLASSIFIER_BEHAVIOR :
				setClassifierBehavior((Behavior) null);
				return;
			case UMLPackage.INTERACTION__INTERFACE_REALIZATION :
				getInterfaceRealizations().clear();
				return;
			case UMLPackage.INTERACTION__OWNED_TRIGGER :
				getOwnedTriggers().clear();
				return;
			case UMLPackage.INTERACTION__NESTED_CLASSIFIER :
				getNestedClassifiers().clear();
				return;
			case UMLPackage.INTERACTION__OWNED_OPERATION :
				getOwnedOperations().clear();
				return;
			case UMLPackage.INTERACTION__SUPER_CLASS :
				getSuperClasses().clear();
				return;
			case UMLPackage.INTERACTION__IS_ACTIVE :
				setIsActive(IS_ACTIVE_EDEFAULT);
				return;
			case UMLPackage.INTERACTION__OWNED_RECEPTION :
				getOwnedReceptions().clear();
				return;
			case UMLPackage.INTERACTION__IS_REENTRANT :
				setIsReentrant(IS_REENTRANT_EDEFAULT);
				return;
			case UMLPackage.INTERACTION__REDEFINED_BEHAVIOR :
				getRedefinedBehaviors().clear();
				return;
			case UMLPackage.INTERACTION__OWNED_PARAMETER :
				getOwnedParameters().clear();
				return;
			case UMLPackage.INTERACTION__PRECONDITION :
				getPreconditions().clear();
				return;
			case UMLPackage.INTERACTION__POSTCONDITION :
				getPostconditions().clear();
				return;
			case UMLPackage.INTERACTION__OWNED_PARAMETER_SET :
				getOwnedParameterSets().clear();
				return;
			case UMLPackage.INTERACTION__SPECIFICATION :
				setSpecification((BehavioralFeature) null);
				return;
			case UMLPackage.INTERACTION__COVERED :
				getCovereds().clear();
				return;
			case UMLPackage.INTERACTION__GENERAL_ORDERING :
				getGeneralOrderings().clear();
				return;
			case UMLPackage.INTERACTION__ENCLOSING_INTERACTION :
				setEnclosingInteraction((Interaction) null);
				return;
			case UMLPackage.INTERACTION__ENCLOSING_OPERAND :
				setEnclosingOperand((InteractionOperand) null);
				return;
			case UMLPackage.INTERACTION__LIFELINE :
				getLifelines().clear();
				return;
			case UMLPackage.INTERACTION__FRAGMENT :
				getFragments().clear();
				return;
			case UMLPackage.INTERACTION__ACTION :
				getActions().clear();
				return;
			case UMLPackage.INTERACTION__FORMAL_GATE :
				getFormalGates().clear();
				return;
			case UMLPackage.INTERACTION__MESSAGE :
				getMessages().clear();
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
			case UMLPackage.INTERACTION__EANNOTATIONS :
				EList eAnnotations = (EList) eVirtualGet(UMLPackage.INTERACTION__EANNOTATIONS);
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UMLPackage.INTERACTION__OWNED_ELEMENT :
				return isSetOwnedElements();
			case UMLPackage.INTERACTION__OWNER :
				return isSetOwner();
			case UMLPackage.INTERACTION__OWNED_COMMENT :
				EList ownedComment = (EList) eVirtualGet(UMLPackage.INTERACTION__OWNED_COMMENT);
				return ownedComment != null && !ownedComment.isEmpty();
			case UMLPackage.INTERACTION__NAME :
				return isSetName();
			case UMLPackage.INTERACTION__VISIBILITY :
				return isSetVisibility();
			case UMLPackage.INTERACTION__QUALIFIED_NAME :
				return QUALIFIED_NAME_EDEFAULT == null
					? getQualifiedName() != null
					: !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case UMLPackage.INTERACTION__CLIENT_DEPENDENCY :
				EList clientDependency = (EList) eVirtualGet(UMLPackage.INTERACTION__CLIENT_DEPENDENCY);
				return clientDependency != null && !clientDependency.isEmpty();
			case UMLPackage.INTERACTION__NAMESPACE :
				return isSetNamespace();
			case UMLPackage.INTERACTION__NAME_EXPRESSION :
				return eVirtualGet(UMLPackage.INTERACTION__NAME_EXPRESSION) != null;
			case UMLPackage.INTERACTION__ELEMENT_IMPORT :
				EList elementImport = (EList) eVirtualGet(UMLPackage.INTERACTION__ELEMENT_IMPORT);
				return elementImport != null && !elementImport.isEmpty();
			case UMLPackage.INTERACTION__PACKAGE_IMPORT :
				EList packageImport = (EList) eVirtualGet(UMLPackage.INTERACTION__PACKAGE_IMPORT);
				return packageImport != null && !packageImport.isEmpty();
			case UMLPackage.INTERACTION__OWNED_RULE :
				EList ownedRule = (EList) eVirtualGet(UMLPackage.INTERACTION__OWNED_RULE);
				return ownedRule != null && !ownedRule.isEmpty();
			case UMLPackage.INTERACTION__MEMBER :
				return isSetMembers();
			case UMLPackage.INTERACTION__IMPORTED_MEMBER :
				return !getImportedMembers().isEmpty();
			case UMLPackage.INTERACTION__OWNED_MEMBER :
				return isSetOwnedMembers();
			case UMLPackage.INTERACTION__IS_LEAF :
				return ((eFlags & IS_LEAF_EFLAG) != 0) != IS_LEAF_EDEFAULT;
			case UMLPackage.INTERACTION__REDEFINED_ELEMENT :
				return isSetRedefinedElements();
			case UMLPackage.INTERACTION__REDEFINITION_CONTEXT :
				return isSetRedefinitionContexts();
			case UMLPackage.INTERACTION__OWNING_TEMPLATE_PARAMETER :
				return basicGetOwningTemplateParameter() != null;
			case UMLPackage.INTERACTION__TEMPLATE_PARAMETER :
				return isSetTemplateParameter();
			case UMLPackage.INTERACTION__PACKAGE :
				return basicGetPackage() != null;
			case UMLPackage.INTERACTION__TEMPLATE_BINDING :
				EList templateBinding = (EList) eVirtualGet(UMLPackage.INTERACTION__TEMPLATE_BINDING);
				return templateBinding != null && !templateBinding.isEmpty();
			case UMLPackage.INTERACTION__OWNED_TEMPLATE_SIGNATURE :
				return isSetOwnedTemplateSignature();
			case UMLPackage.INTERACTION__IS_ABSTRACT :
				return isSetIsAbstract();
			case UMLPackage.INTERACTION__GENERALIZATION :
				EList generalization = (EList) eVirtualGet(UMLPackage.INTERACTION__GENERALIZATION);
				return generalization != null && !generalization.isEmpty();
			case UMLPackage.INTERACTION__POWERTYPE_EXTENT :
				EList powertypeExtent = (EList) eVirtualGet(UMLPackage.INTERACTION__POWERTYPE_EXTENT);
				return powertypeExtent != null && !powertypeExtent.isEmpty();
			case UMLPackage.INTERACTION__FEATURE :
				return isSetFeatures();
			case UMLPackage.INTERACTION__INHERITED_MEMBER :
				return !getInheritedMembers().isEmpty();
			case UMLPackage.INTERACTION__REDEFINED_CLASSIFIER :
				EList redefinedClassifier = (EList) eVirtualGet(UMLPackage.INTERACTION__REDEFINED_CLASSIFIER);
				return redefinedClassifier != null
					&& !redefinedClassifier.isEmpty();
			case UMLPackage.INTERACTION__GENERAL :
				return isSetGenerals();
			case UMLPackage.INTERACTION__SUBSTITUTION :
				EList substitution = (EList) eVirtualGet(UMLPackage.INTERACTION__SUBSTITUTION);
				return substitution != null && !substitution.isEmpty();
			case UMLPackage.INTERACTION__ATTRIBUTE :
				return isSetAttributes();
			case UMLPackage.INTERACTION__REPRESENTATION :
				return eVirtualGet(UMLPackage.INTERACTION__REPRESENTATION) != null;
			case UMLPackage.INTERACTION__COLLABORATION_USE :
				EList collaborationUse = (EList) eVirtualGet(UMLPackage.INTERACTION__COLLABORATION_USE);
				return collaborationUse != null && !collaborationUse.isEmpty();
			case UMLPackage.INTERACTION__OWNED_USE_CASE :
				EList ownedUseCase = (EList) eVirtualGet(UMLPackage.INTERACTION__OWNED_USE_CASE);
				return ownedUseCase != null && !ownedUseCase.isEmpty();
			case UMLPackage.INTERACTION__USE_CASE :
				EList useCase = (EList) eVirtualGet(UMLPackage.INTERACTION__USE_CASE);
				return useCase != null && !useCase.isEmpty();
			case UMLPackage.INTERACTION__OWNED_ATTRIBUTE :
				return isSetOwnedAttributes();
			case UMLPackage.INTERACTION__PART :
				return !getParts().isEmpty();
			case UMLPackage.INTERACTION__ROLE :
				return isSetRoles();
			case UMLPackage.INTERACTION__OWNED_CONNECTOR :
				EList ownedConnector = (EList) eVirtualGet(UMLPackage.INTERACTION__OWNED_CONNECTOR);
				return ownedConnector != null && !ownedConnector.isEmpty();
			case UMLPackage.INTERACTION__OWNED_PORT :
				return !getOwnedPorts().isEmpty();
			case UMLPackage.INTERACTION__OWNED_BEHAVIOR :
				EList ownedBehavior = (EList) eVirtualGet(UMLPackage.INTERACTION__OWNED_BEHAVIOR);
				return ownedBehavior != null && !ownedBehavior.isEmpty();
			case UMLPackage.INTERACTION__CLASSIFIER_BEHAVIOR :
				return eVirtualGet(UMLPackage.INTERACTION__CLASSIFIER_BEHAVIOR) != null;
			case UMLPackage.INTERACTION__INTERFACE_REALIZATION :
				EList interfaceRealization = (EList) eVirtualGet(UMLPackage.INTERACTION__INTERFACE_REALIZATION);
				return interfaceRealization != null
					&& !interfaceRealization.isEmpty();
			case UMLPackage.INTERACTION__OWNED_TRIGGER :
				EList ownedTrigger = (EList) eVirtualGet(UMLPackage.INTERACTION__OWNED_TRIGGER);
				return ownedTrigger != null && !ownedTrigger.isEmpty();
			case UMLPackage.INTERACTION__NESTED_CLASSIFIER :
				EList nestedClassifier = (EList) eVirtualGet(UMLPackage.INTERACTION__NESTED_CLASSIFIER);
				return nestedClassifier != null && !nestedClassifier.isEmpty();
			case UMLPackage.INTERACTION__OWNED_OPERATION :
				EList ownedOperation = (EList) eVirtualGet(UMLPackage.INTERACTION__OWNED_OPERATION);
				return ownedOperation != null && !ownedOperation.isEmpty();
			case UMLPackage.INTERACTION__SUPER_CLASS :
				return isSetSuperClasses();
			case UMLPackage.INTERACTION__IS_ACTIVE :
				return ((eFlags & IS_ACTIVE_EFLAG) != 0) != IS_ACTIVE_EDEFAULT;
			case UMLPackage.INTERACTION__OWNED_RECEPTION :
				EList ownedReception = (EList) eVirtualGet(UMLPackage.INTERACTION__OWNED_RECEPTION);
				return ownedReception != null && !ownedReception.isEmpty();
			case UMLPackage.INTERACTION__EXTENSION :
				return !getExtensions().isEmpty();
			case UMLPackage.INTERACTION__IS_REENTRANT :
				return ((eFlags & IS_REENTRANT_EFLAG) != 0) != IS_REENTRANT_EDEFAULT;
			case UMLPackage.INTERACTION__REDEFINED_BEHAVIOR :
				EList redefinedBehavior = (EList) eVirtualGet(UMLPackage.INTERACTION__REDEFINED_BEHAVIOR);
				return redefinedBehavior != null
					&& !redefinedBehavior.isEmpty();
			case UMLPackage.INTERACTION__OWNED_PARAMETER :
				EList ownedParameter = (EList) eVirtualGet(UMLPackage.INTERACTION__OWNED_PARAMETER);
				return ownedParameter != null && !ownedParameter.isEmpty();
			case UMLPackage.INTERACTION__CONTEXT :
				return basicGetContext() != null;
			case UMLPackage.INTERACTION__PRECONDITION :
				EList precondition = (EList) eVirtualGet(UMLPackage.INTERACTION__PRECONDITION);
				return precondition != null && !precondition.isEmpty();
			case UMLPackage.INTERACTION__POSTCONDITION :
				EList postcondition = (EList) eVirtualGet(UMLPackage.INTERACTION__POSTCONDITION);
				return postcondition != null && !postcondition.isEmpty();
			case UMLPackage.INTERACTION__OWNED_PARAMETER_SET :
				EList ownedParameterSet = (EList) eVirtualGet(UMLPackage.INTERACTION__OWNED_PARAMETER_SET);
				return ownedParameterSet != null
					&& !ownedParameterSet.isEmpty();
			case UMLPackage.INTERACTION__SPECIFICATION :
				return eVirtualGet(UMLPackage.INTERACTION__SPECIFICATION) != null;
			case UMLPackage.INTERACTION__COVERED :
				EList covered = (EList) eVirtualGet(UMLPackage.INTERACTION__COVERED);
				return covered != null && !covered.isEmpty();
			case UMLPackage.INTERACTION__GENERAL_ORDERING :
				EList generalOrdering = (EList) eVirtualGet(UMLPackage.INTERACTION__GENERAL_ORDERING);
				return generalOrdering != null && !generalOrdering.isEmpty();
			case UMLPackage.INTERACTION__ENCLOSING_INTERACTION :
				return getEnclosingInteraction() != null;
			case UMLPackage.INTERACTION__ENCLOSING_OPERAND :
				return getEnclosingOperand() != null;
			case UMLPackage.INTERACTION__LIFELINE :
				EList lifeline = (EList) eVirtualGet(UMLPackage.INTERACTION__LIFELINE);
				return lifeline != null && !lifeline.isEmpty();
			case UMLPackage.INTERACTION__FRAGMENT :
				EList fragment = (EList) eVirtualGet(UMLPackage.INTERACTION__FRAGMENT);
				return fragment != null && !fragment.isEmpty();
			case UMLPackage.INTERACTION__ACTION :
				EList action = (EList) eVirtualGet(UMLPackage.INTERACTION__ACTION);
				return action != null && !action.isEmpty();
			case UMLPackage.INTERACTION__FORMAL_GATE :
				EList formalGate = (EList) eVirtualGet(UMLPackage.INTERACTION__FORMAL_GATE);
				return formalGate != null && !formalGate.isEmpty();
			case UMLPackage.INTERACTION__MESSAGE :
				EList message = (EList) eVirtualGet(UMLPackage.INTERACTION__MESSAGE);
				return message != null && !message.isEmpty();
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
				case UMLPackage.INTERACTION__COVERED :
					return UMLPackage.INTERACTION_FRAGMENT__COVERED;
				case UMLPackage.INTERACTION__GENERAL_ORDERING :
					return UMLPackage.INTERACTION_FRAGMENT__GENERAL_ORDERING;
				case UMLPackage.INTERACTION__ENCLOSING_INTERACTION :
					return UMLPackage.INTERACTION_FRAGMENT__ENCLOSING_INTERACTION;
				case UMLPackage.INTERACTION__ENCLOSING_OPERAND :
					return UMLPackage.INTERACTION_FRAGMENT__ENCLOSING_OPERAND;
				default :
					return -1;
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
				case UMLPackage.INTERACTION_FRAGMENT__COVERED :
					return UMLPackage.INTERACTION__COVERED;
				case UMLPackage.INTERACTION_FRAGMENT__GENERAL_ORDERING :
					return UMLPackage.INTERACTION__GENERAL_ORDERING;
				case UMLPackage.INTERACTION_FRAGMENT__ENCLOSING_INTERACTION :
					return UMLPackage.INTERACTION__ENCLOSING_INTERACTION;
				case UMLPackage.INTERACTION_FRAGMENT__ENCLOSING_OPERAND :
					return UMLPackage.INTERACTION__ENCLOSING_OPERAND;
				default :
					return -1;
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
	public boolean isSetOwnedElements() {
		return super.isSetOwnedElements()
			|| eIsSet(UMLPackage.INTERACTION__GENERAL_ORDERING)
			|| eIsSet(UMLPackage.INTERACTION__ACTION);
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
			|| eIsSet(UMLPackage.INTERACTION__ENCLOSING_OPERAND);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOwnedMembers() {
		return super.isSetOwnedMembers()
			|| eIsSet(UMLPackage.INTERACTION__LIFELINE)
			|| eIsSet(UMLPackage.INTERACTION__FRAGMENT)
			|| eIsSet(UMLPackage.INTERACTION__FORMAL_GATE)
			|| eIsSet(UMLPackage.INTERACTION__MESSAGE);
	}

} //InteractionImpl
