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
 * $Id: InteractionImpl.java,v 1.36 2006/04/10 20:40:17 khussey Exp $
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
	 * The cached value of the '{@link #getCovereds() <em>Covered</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCovereds()
	 * @generated
	 * @ordered
	 */
	protected EList covereds = null;

	/**
	 * The cached value of the '{@link #getGeneralOrderings() <em>General Ordering</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneralOrderings()
	 * @generated
	 * @ordered
	 */
	protected EList generalOrderings = null;

	/**
	 * The cached value of the '{@link #getLifelines() <em>Lifeline</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLifelines()
	 * @generated
	 * @ordered
	 */
	protected EList lifelines = null;

	/**
	 * The cached value of the '{@link #getMessages() <em>Message</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessages()
	 * @generated
	 * @ordered
	 */
	protected EList messages = null;

	/**
	 * The cached value of the '{@link #getFragments() <em>Fragment</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFragments()
	 * @generated
	 * @ordered
	 */
	protected EList fragments = null;

	/**
	 * The cached value of the '{@link #getFormalGates() <em>Formal Gate</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFormalGates()
	 * @generated
	 * @ordered
	 */
	protected EList formalGates = null;

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
		return UML2Package.Literals.INTERACTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getCovereds() {
		if (covereds == null) {
			covereds = new EObjectWithInverseResolvingEList.ManyInverse(Lifeline.class, this, UML2Package.INTERACTION__COVERED, UML2Package.LIFELINE__COVERED_BY);
		}
		return covereds;
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
		coveredLoop: for (Iterator i = getCovereds().iterator(); i.hasNext(); ) {
			Lifeline covered = (Lifeline) i.next();
			if (name != null && !(ignoreCase ? name.equalsIgnoreCase(covered.getName()) : name.equals(covered.getName())))
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
		if (generalOrderings == null) {
			generalOrderings = new EObjectContainmentEList(GeneralOrdering.class, this, UML2Package.INTERACTION__GENERAL_ORDERING);
		}
		return generalOrderings;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
    public GeneralOrdering getGeneralOrdering(String name) {
		return getGeneralOrdering(name, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeneralOrdering getGeneralOrdering(String name, boolean ignoreCase) {
		generalOrderingLoop: for (Iterator i = getGeneralOrderings().iterator(); i.hasNext(); ) {
			GeneralOrdering generalOrdering = (GeneralOrdering) i.next();
			if (name != null && !(ignoreCase ? name.equalsIgnoreCase(generalOrdering.getName()) : name.equals(generalOrdering.getName())))
				continue generalOrderingLoop;
			return generalOrdering;
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
	public NotificationChain basicSetEnclosingInteraction(Interaction newEnclosingInteraction, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newEnclosingInteraction, UML2Package.INTERACTION__ENCLOSING_INTERACTION, msgs);

		return msgs;
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
			msgs = basicSetEnclosingInteraction(newEnclosingInteraction, msgs);
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
	public NotificationChain basicSetEnclosingOperand(InteractionOperand newEnclosingOperand, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newEnclosingOperand, UML2Package.INTERACTION__ENCLOSING_OPERAND, msgs);

		return msgs;
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
			msgs = basicSetEnclosingOperand(newEnclosingOperand, msgs);
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
		if (lifelines == null) {
			lifelines = new EObjectContainmentWithInverseEList(Lifeline.class, this, UML2Package.INTERACTION__LIFELINE, UML2Package.LIFELINE__INTERACTION);
		}
		return lifelines;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
    public Lifeline getLifeline(String name) {
		return getLifeline(name, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Lifeline getLifeline(String name, boolean ignoreCase) {
		lifelineLoop: for (Iterator i = getLifelines().iterator(); i.hasNext(); ) {
			Lifeline lifeline = (Lifeline) i.next();
			if (name != null && !(ignoreCase ? name.equalsIgnoreCase(lifeline.getName()) : name.equals(lifeline.getName())))
				continue lifelineLoop;
			return lifeline;
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
		if (messages == null) {
			messages = new EObjectContainmentWithInverseEList(Message.class, this, UML2Package.INTERACTION__MESSAGE, UML2Package.MESSAGE__INTERACTION);
		}
		return messages;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
    public Message getMessage(String name) {
		return getMessage(name, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Message getMessage(String name, boolean ignoreCase) {
		messageLoop: for (Iterator i = getMessages().iterator(); i.hasNext(); ) {
			Message message = (Message) i.next();
			if (name != null && !(ignoreCase ? name.equalsIgnoreCase(message.getName()) : name.equals(message.getName())))
				continue messageLoop;
			return message;
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
		if (fragments == null) {
			fragments = new EObjectContainmentWithInverseEList(InteractionFragment.class, this, UML2Package.INTERACTION__FRAGMENT, UML2Package.INTERACTION_FRAGMENT__ENCLOSING_INTERACTION);
		}
		return fragments;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
    public InteractionFragment getFragment(String name) {
		return getFragment(name, false, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InteractionFragment getFragment(String name, boolean ignoreCase, EClass eClass) {
		fragmentLoop: for (Iterator i = getFragments().iterator(); i.hasNext(); ) {
			InteractionFragment fragment = (InteractionFragment) i.next();
			if (eClass != null && !eClass.isInstance(fragment))
				continue fragmentLoop;
			if (name != null && !(ignoreCase ? name.equalsIgnoreCase(fragment.getName()) : name.equals(fragment.getName())))
				continue fragmentLoop;
			return fragment;
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
		if (formalGates == null) {
			formalGates = new EObjectContainmentEList(Gate.class, this, UML2Package.INTERACTION__FORMAL_GATE);
		}
		return formalGates;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
    public Gate getFormalGate(String name) {
		return getFormalGate(name, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Gate getFormalGate(String name, boolean ignoreCase) {
		formalGateLoop: for (Iterator i = getFormalGates().iterator(); i.hasNext(); ) {
			Gate formalGate = (Gate) i.next();
			if (name != null && !(ignoreCase ? name.equalsIgnoreCase(formalGate.getName()) : name.equals(formalGate.getName())))
				continue formalGateLoop;
			return formalGate;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UML2Package.INTERACTION__EANNOTATIONS:
				return ((InternalEList)getEAnnotations()).basicAdd(otherEnd, msgs);
			case UML2Package.INTERACTION__TEMPLATE_BINDING:
				return ((InternalEList)getTemplateBindings()).basicAdd(otherEnd, msgs);
			case UML2Package.INTERACTION__OWNED_TEMPLATE_SIGNATURE:
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
				if (templateParameter != null)
					msgs = ((InternalEObject)templateParameter).eInverseRemove(this, UML2Package.TEMPLATE_PARAMETER__PARAMETERED_ELEMENT, TemplateParameter.class, msgs);
				return basicSetTemplateParameter((TemplateParameter)otherEnd, msgs);
			case UML2Package.INTERACTION__OWNING_PARAMETER:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOwningParameter((TemplateParameter)otherEnd, msgs);
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
				return basicSetContext((BehavioredClassifier)otherEnd, msgs);
			case UML2Package.INTERACTION__SPECIFICATION:
				if (specification != null)
					msgs = ((InternalEObject)specification).eInverseRemove(this, UML2Package.BEHAVIORAL_FEATURE__METHOD, BehavioralFeature.class, msgs);
				return basicSetSpecification((BehavioralFeature)otherEnd, msgs);
			case UML2Package.INTERACTION__COVERED:
				return ((InternalEList)getCovereds()).basicAdd(otherEnd, msgs);
			case UML2Package.INTERACTION__ENCLOSING_INTERACTION:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetEnclosingInteraction((Interaction)otherEnd, msgs);
			case UML2Package.INTERACTION__ENCLOSING_OPERAND:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetEnclosingOperand((InteractionOperand)otherEnd, msgs);
			case UML2Package.INTERACTION__LIFELINE:
				return ((InternalEList)getLifelines()).basicAdd(otherEnd, msgs);
			case UML2Package.INTERACTION__MESSAGE:
				return ((InternalEList)getMessages()).basicAdd(otherEnd, msgs);
			case UML2Package.INTERACTION__FRAGMENT:
				return ((InternalEList)getFragments()).basicAdd(otherEnd, msgs);
		}
		return eDynamicInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
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
				return basicSetOwningParameter(null, msgs);
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
				return basicSetContext(null, msgs);
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
				return basicSetEnclosingInteraction(null, msgs);
			case UML2Package.INTERACTION__ENCLOSING_OPERAND:
				return basicSetEnclosingOperand(null, msgs);
			case UML2Package.INTERACTION__LIFELINE:
				return ((InternalEList)getLifelines()).basicRemove(otherEnd, msgs);
			case UML2Package.INTERACTION__MESSAGE:
				return ((InternalEList)getMessages()).basicRemove(otherEnd, msgs);
			case UML2Package.INTERACTION__FRAGMENT:
				return ((InternalEList)getFragments()).basicRemove(otherEnd, msgs);
			case UML2Package.INTERACTION__FORMAL_GATE:
				return ((InternalEList)getFormalGates()).basicRemove(otherEnd, msgs);
		}
		return eDynamicInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID) {
			case UML2Package.INTERACTION__OWNING_PARAMETER:
				return eInternalContainer().eInverseRemove(this, UML2Package.TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT, TemplateParameter.class, msgs);
			case UML2Package.INTERACTION__CONTEXT:
				return eInternalContainer().eInverseRemove(this, UML2Package.BEHAVIORED_CLASSIFIER__OWNED_BEHAVIOR, BehavioredClassifier.class, msgs);
			case UML2Package.INTERACTION__ENCLOSING_INTERACTION:
				return eInternalContainer().eInverseRemove(this, UML2Package.INTERACTION__FRAGMENT, Interaction.class, msgs);
			case UML2Package.INTERACTION__ENCLOSING_OPERAND:
				return eInternalContainer().eInverseRemove(this, UML2Package.INTERACTION_OPERAND__FRAGMENT, InteractionOperand.class, msgs);
		}
		return eDynamicBasicRemoveFromContainer(msgs);
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
			|| eIsSet(UML2Package.INTERACTION__ENCLOSING_OPERAND);
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EList getOwnedMembersHelper(EList ownedMembers) {
		super.getOwnedMembersHelper(ownedMembers);
		if (eIsSet(UML2Package.INTERACTION__LIFELINE)) {
			ownedMembers.addAll(getLifelines());
		}
		if (eIsSet(UML2Package.INTERACTION__MESSAGE)) {
			ownedMembers.addAll(getMessages());
		}
		if (eIsSet(UML2Package.INTERACTION__FORMAL_GATE)) {
			ownedMembers.addAll(getFormalGates());
		}
		return ownedMembers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOwnedMembers() {
		return super.isSetOwnedMembers()
			|| eIsSet(UML2Package.INTERACTION__LIFELINE)
			|| eIsSet(UML2Package.INTERACTION__MESSAGE)
			|| eIsSet(UML2Package.INTERACTION__FORMAL_GATE);
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
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
		return eDynamicGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
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
		eDynamicSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eUnset(int featureID) {
		switch (featureID) {
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
		eDynamicUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case UML2Package.INTERACTION__EANNOTATIONS:
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UML2Package.INTERACTION__OWNED_ELEMENT:
				return isSetOwnedElements();
			case UML2Package.INTERACTION__OWNER:
				return isSetOwner();
			case UML2Package.INTERACTION__OWNED_COMMENT:
				return ownedComments != null && !ownedComments.isEmpty();
			case UML2Package.INTERACTION__TEMPLATE_BINDING:
				return templateBindings != null && !templateBindings.isEmpty();
			case UML2Package.INTERACTION__OWNED_TEMPLATE_SIGNATURE:
				return ownedTemplateSignature != null;
			case UML2Package.INTERACTION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case UML2Package.INTERACTION__QUALIFIED_NAME:
				return QUALIFIED_NAME_EDEFAULT == null ? getQualifiedName() != null : !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case UML2Package.INTERACTION__VISIBILITY:
				return isSetVisibility();
			case UML2Package.INTERACTION__CLIENT_DEPENDENCY:
				return clientDependencies != null && !clientDependencies.isEmpty();
			case UML2Package.INTERACTION__NAME_EXPRESSION:
				return nameExpression != null;
			case UML2Package.INTERACTION__MEMBER:
				return isSetMembers();
			case UML2Package.INTERACTION__OWNED_RULE:
				return ownedRules != null && !ownedRules.isEmpty();
			case UML2Package.INTERACTION__IMPORTED_MEMBER:
				return !getImportedMembers().isEmpty();
			case UML2Package.INTERACTION__ELEMENT_IMPORT:
				return elementImports != null && !elementImports.isEmpty();
			case UML2Package.INTERACTION__PACKAGE_IMPORT:
				return packageImports != null && !packageImports.isEmpty();
			case UML2Package.INTERACTION__TEMPLATE_PARAMETER:
				return templateParameter != null;
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
				return isSetIsAbstract();
			case UML2Package.INTERACTION__INHERITED_MEMBER:
				return !getInheritedMembers().isEmpty();
			case UML2Package.INTERACTION__GENERAL:
				return isSetGenerals();
			case UML2Package.INTERACTION__GENERALIZATION:
				return generalizations != null && !generalizations.isEmpty();
			case UML2Package.INTERACTION__ATTRIBUTE:
				return isSetAttributes();
			case UML2Package.INTERACTION__REDEFINED_CLASSIFIER:
				return redefinedClassifiers != null && !redefinedClassifiers.isEmpty();
			case UML2Package.INTERACTION__SUBSTITUTION:
				return substitutions != null && !substitutions.isEmpty();
			case UML2Package.INTERACTION__POWERTYPE_EXTENT:
				return powertypeExtents != null && !powertypeExtents.isEmpty();
			case UML2Package.INTERACTION__OWNED_USE_CASE:
				return ownedUseCases != null && !ownedUseCases.isEmpty();
			case UML2Package.INTERACTION__USE_CASE:
				return useCases != null && !useCases.isEmpty();
			case UML2Package.INTERACTION__REPRESENTATION:
				return representation != null;
			case UML2Package.INTERACTION__OCCURRENCE:
				return occurrences != null && !occurrences.isEmpty();
			case UML2Package.INTERACTION__OWNED_BEHAVIOR:
				return isSetOwnedBehaviors();
			case UML2Package.INTERACTION__CLASSIFIER_BEHAVIOR:
				return classifierBehavior != null;
			case UML2Package.INTERACTION__IMPLEMENTATION:
				return implementations != null && !implementations.isEmpty();
			case UML2Package.INTERACTION__OWNED_TRIGGER:
				return ownedTriggers != null && !ownedTriggers.isEmpty();
			case UML2Package.INTERACTION__OWNED_STATE_MACHINE:
				return isSetOwnedStateMachines();
			case UML2Package.INTERACTION__OWNED_ATTRIBUTE:
				return isSetOwnedAttributes();
			case UML2Package.INTERACTION__PART:
				return !getParts().isEmpty();
			case UML2Package.INTERACTION__ROLE:
				return isSetRoles();
			case UML2Package.INTERACTION__OWNED_CONNECTOR:
				return ownedConnectors != null && !ownedConnectors.isEmpty();
			case UML2Package.INTERACTION__OWNED_PORT:
				return ownedPorts != null && !ownedPorts.isEmpty();
			case UML2Package.INTERACTION__OWNED_OPERATION:
				return ownedOperations != null && !ownedOperations.isEmpty();
			case UML2Package.INTERACTION__SUPER_CLASS:
				return isSetSuperClasses();
			case UML2Package.INTERACTION__EXTENSION:
				return !getExtensions().isEmpty();
			case UML2Package.INTERACTION__NESTED_CLASSIFIER:
				return nestedClassifiers != null && !nestedClassifiers.isEmpty();
			case UML2Package.INTERACTION__IS_ACTIVE:
				return ((eFlags & IS_ACTIVE_EFLAG) != 0) != IS_ACTIVE_EDEFAULT;
			case UML2Package.INTERACTION__OWNED_RECEPTION:
				return ownedReceptions != null && !ownedReceptions.isEmpty();
			case UML2Package.INTERACTION__IS_REENTRANT:
				return ((eFlags & IS_REENTRANT_EFLAG) != 0) != IS_REENTRANT_EDEFAULT;
			case UML2Package.INTERACTION__CONTEXT:
				return getContext() != null;
			case UML2Package.INTERACTION__REDEFINED_BEHAVIOR:
				return redefinedBehaviors != null && !redefinedBehaviors.isEmpty();
			case UML2Package.INTERACTION__SPECIFICATION:
				return specification != null;
			case UML2Package.INTERACTION__PARAMETER:
				return parameters != null && !parameters.isEmpty();
			case UML2Package.INTERACTION__FORMAL_PARAMETER:
				return !getFormalParameters().isEmpty();
			case UML2Package.INTERACTION__RETURN_RESULT:
				return !getReturnResults().isEmpty();
			case UML2Package.INTERACTION__PRECONDITION:
				return preconditions != null && !preconditions.isEmpty();
			case UML2Package.INTERACTION__POSTCONDITION:
				return postconditions != null && !postconditions.isEmpty();
			case UML2Package.INTERACTION__OWNED_PARAMETER_SET:
				return ownedParameterSets != null && !ownedParameterSets.isEmpty();
			case UML2Package.INTERACTION__COVERED:
				return covereds != null && !covereds.isEmpty();
			case UML2Package.INTERACTION__GENERAL_ORDERING:
				return generalOrderings != null && !generalOrderings.isEmpty();
			case UML2Package.INTERACTION__ENCLOSING_INTERACTION:
				return getEnclosingInteraction() != null;
			case UML2Package.INTERACTION__ENCLOSING_OPERAND:
				return getEnclosingOperand() != null;
			case UML2Package.INTERACTION__LIFELINE:
				return lifelines != null && !lifelines.isEmpty();
			case UML2Package.INTERACTION__MESSAGE:
				return messages != null && !messages.isEmpty();
			case UML2Package.INTERACTION__FRAGMENT:
				return fragments != null && !fragments.isEmpty();
			case UML2Package.INTERACTION__FORMAL_GATE:
				return formalGates != null && !formalGates.isEmpty();
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
	protected EList getOwnedElementsHelper(EList ownedElements) {
		super.getOwnedElementsHelper(ownedElements);
		if (eIsSet(UML2Package.INTERACTION__GENERAL_ORDERING)) {
			ownedElements.addAll(getGeneralOrderings());
		}
		return ownedElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOwnedElements() {
		return super.isSetOwnedElements()
			|| eIsSet(UML2Package.INTERACTION__GENERAL_ORDERING);
	}


	/**
	 * The array of subset feature identifiers for the '{@link #getOwnedElements() <em>Owned Element</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedElements()
	 * @generated
	 * @ordered
	 */
	protected static final int[] OWNED_ELEMENT_ESUBSETS = new int[] {UML2Package.INTERACTION__OWNED_COMMENT, UML2Package.INTERACTION__TEMPLATE_BINDING, UML2Package.INTERACTION__OWNED_TEMPLATE_SIGNATURE, UML2Package.INTERACTION__NAME_EXPRESSION, UML2Package.INTERACTION__ELEMENT_IMPORT, UML2Package.INTERACTION__PACKAGE_IMPORT, UML2Package.INTERACTION__GENERALIZATION, UML2Package.INTERACTION__SUBSTITUTION, UML2Package.INTERACTION__OCCURRENCE, UML2Package.INTERACTION__IMPLEMENTATION, UML2Package.INTERACTION__GENERAL_ORDERING};

	/**
	 * The array of subset feature identifiers for the '{@link #getOwnedMembers() <em>Owned Member</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedMembers()
	 * @generated
	 * @ordered
	 */
	protected static final int[] OWNED_MEMBER_ESUBSETS = new int[] {UML2Package.INTERACTION__OWNED_RULE, UML2Package.INTERACTION__OWNED_USE_CASE, UML2Package.INTERACTION__OWNED_BEHAVIOR, UML2Package.INTERACTION__OWNED_TRIGGER, UML2Package.INTERACTION__OWNED_ATTRIBUTE, UML2Package.INTERACTION__OWNED_CONNECTOR, UML2Package.INTERACTION__OWNED_PORT, UML2Package.INTERACTION__OWNED_OPERATION, UML2Package.INTERACTION__NESTED_CLASSIFIER, UML2Package.INTERACTION__OWNED_RECEPTION, UML2Package.INTERACTION__PARAMETER, UML2Package.INTERACTION__LIFELINE, UML2Package.INTERACTION__MESSAGE, UML2Package.INTERACTION__FORMAL_GATE};

} //InteractionImpl
