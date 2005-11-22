/*
 * Copyright (c) 2005 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *
 * $Id: InteractionImpl.java,v 1.2 2005/11/22 15:32:35 khussey Exp $
 */
package org.eclipse.uml2.uml.internal.impl;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
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
import org.eclipse.uml2.uml.BehavioredClassifier;
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
import org.eclipse.uml2.uml.RedefinableTemplateSignature;
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
		return UMLPackage.eINSTANCE.getInteraction();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List getOwnedElements() {
		List ownedElement = (List) eVirtualGet(UMLPackage.INTERACTION__OWNED_ELEMENT);
		if (ownedElement == null) {
			eVirtualSet(UMLPackage.INTERACTION__OWNED_ELEMENT,
				ownedElement = new DerivedUnionEObjectEList(Element.class,
					this, UMLPackage.INTERACTION__OWNED_ELEMENT,
					new EStructuralFeature[]{
						UMLPackage.eINSTANCE.getElement_OwnedComment(),
						UMLPackage.eINSTANCE.getNamedElement_NameExpression(),
						UMLPackage.eINSTANCE.getNamespace_ElementImport(),
						UMLPackage.eINSTANCE.getNamespace_PackageImport(),
						UMLPackage.eINSTANCE.getNamespace_OwnedMember(),
						UMLPackage.eINSTANCE
							.getTemplateableElement_TemplateBinding(),
						UMLPackage.eINSTANCE
							.getTemplateableElement_OwnedTemplateSignature(),
						UMLPackage.eINSTANCE.getClassifier_Generalization(),
						UMLPackage.eINSTANCE.getClassifier_Substitution(),
						UMLPackage.eINSTANCE.getClassifier_CollaborationUse(),
						UMLPackage.eINSTANCE.getClassifier_OwnedSignature(),
						UMLPackage.eINSTANCE
							.getBehavioredClassifier_InterfaceRealization(),
						UMLPackage.eINSTANCE
							.getInteractionFragment_GeneralOrdering(),
						UMLPackage.eINSTANCE.getInteraction_Action()}));
		}
		return ownedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List getCovereds() {
		List covered = (List) eVirtualGet(UMLPackage.INTERACTION__COVERED);
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
		for (Iterator i = getCovereds().iterator(); i.hasNext();) {
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
	public List getGeneralOrderings() {
		List generalOrdering = (List) eVirtualGet(UMLPackage.INTERACTION__GENERAL_ORDERING);
		if (generalOrdering == null) {
			eVirtualSet(UMLPackage.INTERACTION__GENERAL_ORDERING,
				generalOrdering = new EObjectContainmentEList(
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
	public GeneralOrdering createGeneralOrdering() {
		GeneralOrdering newGeneralOrdering = UMLFactory.eINSTANCE
			.createGeneralOrdering();
		getGeneralOrderings().add(newGeneralOrdering);
		return newGeneralOrdering;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeneralOrdering getGeneralOrdering(String name) {
		for (Iterator i = getGeneralOrderings().iterator(); i.hasNext();) {
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
			if (EcoreUtil.isAncestor(this, (EObject) newEnclosingInteraction))
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
			if (EcoreUtil.isAncestor(this, (EObject) newEnclosingOperand))
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
	public List getOwnedMembers() {
		List ownedMember = (List) eVirtualGet(UMLPackage.INTERACTION__OWNED_MEMBER);
		if (ownedMember == null) {
			eVirtualSet(UMLPackage.INTERACTION__OWNED_MEMBER,
				ownedMember = new DerivedUnionEObjectEList(NamedElement.class,
					this, UMLPackage.INTERACTION__OWNED_MEMBER,
					new EStructuralFeature[]{
						UMLPackage.eINSTANCE.getNamespace_OwnedRule(),
						UMLPackage.eINSTANCE.getClassifier_OwnedUseCase(),
						UMLPackage.eINSTANCE
							.getStructuredClassifier_OwnedAttribute(),
						UMLPackage.eINSTANCE
							.getStructuredClassifier_OwnedConnector(),
						UMLPackage.eINSTANCE
							.getBehavioredClassifier_OwnedBehavior(),
						UMLPackage.eINSTANCE
							.getBehavioredClassifier_OwnedTrigger(),
						UMLPackage.eINSTANCE.getClass_OwnedOperation(),
						UMLPackage.eINSTANCE.getClass_NestedClassifier(),
						UMLPackage.eINSTANCE.getClass_OwnedReception(),
						UMLPackage.eINSTANCE.getBehavior_OwnedParameter(),
						UMLPackage.eINSTANCE.getBehavior_OwnedParameterSet(),
						UMLPackage.eINSTANCE.getInteraction_Lifeline(),
						UMLPackage.eINSTANCE.getInteraction_Fragment(),
						UMLPackage.eINSTANCE.getInteraction_FormalGate(),
						UMLPackage.eINSTANCE.getInteraction_Message()}));
		}
		return ownedMember;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List getLifelines() {
		List lifeline = (List) eVirtualGet(UMLPackage.INTERACTION__LIFELINE);
		if (lifeline == null) {
			eVirtualSet(UMLPackage.INTERACTION__LIFELINE,
				lifeline = new EObjectContainmentWithInverseEList(
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
	public Lifeline createLifeline() {
		Lifeline newLifeline = UMLFactory.eINSTANCE.createLifeline();
		getLifelines().add(newLifeline);
		return newLifeline;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Lifeline getLifeline(String name) {
		for (Iterator i = getLifelines().iterator(); i.hasNext();) {
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
	 * @generated
	 */
	public List getFragments() {
		List fragment = (List) eVirtualGet(UMLPackage.INTERACTION__FRAGMENT);
		if (fragment == null) {
			eVirtualSet(UMLPackage.INTERACTION__FRAGMENT,
				fragment = new EObjectContainmentWithInverseEList(
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
	public InteractionFragment createFragment(EClass eClass) {
		InteractionFragment newFragment = (InteractionFragment) eClass
			.getEPackage().getEFactoryInstance().create(eClass);
		getFragments().add(newFragment);
		return newFragment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InteractionFragment getFragment(String name) {
		for (Iterator i = getFragments().iterator(); i.hasNext();) {
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
	 * @generated
	 */
	public List getActions() {
		List action = (List) eVirtualGet(UMLPackage.INTERACTION__ACTION);
		if (action == null) {
			eVirtualSet(UMLPackage.INTERACTION__ACTION,
				action = new EObjectContainmentEList(Action.class, this,
					UMLPackage.INTERACTION__ACTION));
		}
		return action;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Action createAction(EClass eClass) {
		Action newAction = (Action) eClass.getEPackage().getEFactoryInstance()
			.create(eClass);
		getActions().add(newAction);
		return newAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Action createAction() {
		Action newAction = UMLFactory.eINSTANCE.createAction();
		getActions().add(newAction);
		return newAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Action getAction(String name) {
		for (Iterator i = getActions().iterator(); i.hasNext();) {
			Action action = (Action) i.next();
			if (name.equals(action.getName())) {
				return action;
			}
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List getFormalGates() {
		List formalGate = (List) eVirtualGet(UMLPackage.INTERACTION__FORMAL_GATE);
		if (formalGate == null) {
			eVirtualSet(UMLPackage.INTERACTION__FORMAL_GATE,
				formalGate = new EObjectContainmentEList(Gate.class, this,
					UMLPackage.INTERACTION__FORMAL_GATE));
		}
		return formalGate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Gate createFormalGate() {
		Gate newFormalGate = UMLFactory.eINSTANCE.createGate();
		getFormalGates().add(newFormalGate);
		return newFormalGate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Gate getFormalGate(String name) {
		for (Iterator i = getFormalGates().iterator(); i.hasNext();) {
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
	 * @generated
	 */
	public List getMessages() {
		List message = (List) eVirtualGet(UMLPackage.INTERACTION__MESSAGE);
		if (message == null) {
			eVirtualSet(UMLPackage.INTERACTION__MESSAGE,
				message = new EObjectContainmentWithInverseEList(Message.class,
					this, UMLPackage.INTERACTION__MESSAGE,
					UMLPackage.MESSAGE__INTERACTION));
		}
		return message;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Message createMessage() {
		Message newMessage = UMLFactory.eINSTANCE.createMessage();
		getMessages().add(newMessage);
		return newMessage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Message getMessage(String name) {
		for (Iterator i = getMessages().iterator(); i.hasNext();) {
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
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd,
			int featureID, Class baseClass, NotificationChain msgs) {
		if (featureID >= 0) {
			switch (eDerivedStructuralFeatureID(featureID, baseClass)) {
				case UMLPackage.INTERACTION__EANNOTATIONS :
					return ((InternalEList) getEAnnotations()).basicAdd(
						otherEnd, msgs);
				case UMLPackage.INTERACTION__CLIENT_DEPENDENCY :
					return ((InternalEList) getClientDependencies()).basicAdd(
						otherEnd, msgs);
				case UMLPackage.INTERACTION__ELEMENT_IMPORT :
					return ((InternalEList) getElementImports()).basicAdd(
						otherEnd, msgs);
				case UMLPackage.INTERACTION__PACKAGE_IMPORT :
					return ((InternalEList) getPackageImports()).basicAdd(
						otherEnd, msgs);
				case UMLPackage.INTERACTION__OWNED_RULE :
					return ((InternalEList) getOwnedRules()).basicAdd(otherEnd,
						msgs);
				case UMLPackage.INTERACTION__TEMPLATE_PARAMETER :
					TemplateParameter templateParameter = (TemplateParameter) eVirtualGet(UMLPackage.INTERACTION__TEMPLATE_PARAMETER);
					if (templateParameter != null)
						msgs = ((InternalEObject) templateParameter)
							.eInverseRemove(
								this,
								UMLPackage.TEMPLATE_PARAMETER__PARAMETERED_ELEMENT,
								TemplateParameter.class, msgs);
					return basicSetTemplateParameter(
						(TemplateParameter) otherEnd, msgs);
				case UMLPackage.INTERACTION__OWNING_TEMPLATE_PARAMETER :
					if (eInternalContainer() != null)
						msgs = eBasicRemoveFromContainer(msgs);
					return eBasicSetContainer(otherEnd,
						UMLPackage.INTERACTION__OWNING_TEMPLATE_PARAMETER, msgs);
				case UMLPackage.INTERACTION__TEMPLATE_BINDING :
					return ((InternalEList) getTemplateBindings()).basicAdd(
						otherEnd, msgs);
				case UMLPackage.INTERACTION__OWNED_TEMPLATE_SIGNATURE :
					TemplateSignature ownedTemplateSignature = (TemplateSignature) eVirtualGet(UMLPackage.INTERACTION__OWNED_TEMPLATE_SIGNATURE);
					if (ownedTemplateSignature != null)
						msgs = ((InternalEObject) ownedTemplateSignature)
							.eInverseRemove(
								this,
								EOPPOSITE_FEATURE_BASE
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
				case UMLPackage.INTERACTION__USE_CASE :
					return ((InternalEList) getUseCases()).basicAdd(otherEnd,
						msgs);
				case UMLPackage.INTERACTION__SUBSTITUTION :
					return ((InternalEList) getSubstitutions()).basicAdd(
						otherEnd, msgs);
				case UMLPackage.INTERACTION__OWNED_SIGNATURE :
					RedefinableTemplateSignature ownedSignature = (RedefinableTemplateSignature) eVirtualGet(UMLPackage.INTERACTION__OWNED_SIGNATURE);
					if (ownedSignature != null)
						msgs = ((InternalEObject) ownedSignature)
							.eInverseRemove(this, EOPPOSITE_FEATURE_BASE
								- UMLPackage.INTERACTION__OWNED_SIGNATURE,
								null, msgs);
					return basicSetOwnedSignature(
						(RedefinableTemplateSignature) otherEnd, msgs);
				case UMLPackage.INTERACTION__INTERFACE_REALIZATION :
					return ((InternalEList) getInterfaceRealizations())
						.basicAdd(otherEnd, msgs);
				case UMLPackage.INTERACTION__OWNED_OPERATION :
					return ((InternalEList) getOwnedOperations()).basicAdd(
						otherEnd, msgs);
				case UMLPackage.INTERACTION__SPECIFICATION :
					BehavioralFeature specification = (BehavioralFeature) eVirtualGet(UMLPackage.INTERACTION__SPECIFICATION);
					if (specification != null)
						msgs = ((InternalEObject) specification)
							.eInverseRemove(this,
								UMLPackage.BEHAVIORAL_FEATURE__METHOD,
								BehavioralFeature.class, msgs);
					return basicSetSpecification((BehavioralFeature) otherEnd,
						msgs);
				case UMLPackage.INTERACTION__COVERED :
					return ((InternalEList) getCovereds()).basicAdd(otherEnd,
						msgs);
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
					return ((InternalEList) getLifelines()).basicAdd(otherEnd,
						msgs);
				case UMLPackage.INTERACTION__FRAGMENT :
					return ((InternalEList) getFragments()).basicAdd(otherEnd,
						msgs);
				case UMLPackage.INTERACTION__MESSAGE :
					return ((InternalEList) getMessages()).basicAdd(otherEnd,
						msgs);
				default :
					return eDynamicInverseAdd(otherEnd, featureID, baseClass,
						msgs);
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
	public NotificationChain eInverseRemove(InternalEObject otherEnd,
			int featureID, Class baseClass, NotificationChain msgs) {
		if (featureID >= 0) {
			switch (eDerivedStructuralFeatureID(featureID, baseClass)) {
				case UMLPackage.INTERACTION__EANNOTATIONS :
					return ((InternalEList) getEAnnotations()).basicRemove(
						otherEnd, msgs);
				case UMLPackage.INTERACTION__OWNED_COMMENT :
					return ((InternalEList) getOwnedComments()).basicRemove(
						otherEnd, msgs);
				case UMLPackage.INTERACTION__CLIENT_DEPENDENCY :
					return ((InternalEList) getClientDependencies())
						.basicRemove(otherEnd, msgs);
				case UMLPackage.INTERACTION__NAME_EXPRESSION :
					return basicSetNameExpression(null, msgs);
				case UMLPackage.INTERACTION__ELEMENT_IMPORT :
					return ((InternalEList) getElementImports()).basicRemove(
						otherEnd, msgs);
				case UMLPackage.INTERACTION__PACKAGE_IMPORT :
					return ((InternalEList) getPackageImports()).basicRemove(
						otherEnd, msgs);
				case UMLPackage.INTERACTION__OWNED_RULE :
					return ((InternalEList) getOwnedRules()).basicRemove(
						otherEnd, msgs);
				case UMLPackage.INTERACTION__TEMPLATE_PARAMETER :
					return basicSetTemplateParameter(null, msgs);
				case UMLPackage.INTERACTION__OWNING_TEMPLATE_PARAMETER :
					return eBasicSetContainer(null,
						UMLPackage.INTERACTION__OWNING_TEMPLATE_PARAMETER, msgs);
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
				case UMLPackage.INTERACTION__OWNED_USE_CASE :
					return ((InternalEList) getOwnedUseCases()).basicRemove(
						otherEnd, msgs);
				case UMLPackage.INTERACTION__USE_CASE :
					return ((InternalEList) getUseCases()).basicRemove(
						otherEnd, msgs);
				case UMLPackage.INTERACTION__SUBSTITUTION :
					return ((InternalEList) getSubstitutions()).basicRemove(
						otherEnd, msgs);
				case UMLPackage.INTERACTION__COLLABORATION_USE :
					return ((InternalEList) getCollaborationUses())
						.basicRemove(otherEnd, msgs);
				case UMLPackage.INTERACTION__OWNED_SIGNATURE :
					return basicSetOwnedSignature(null, msgs);
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
				case UMLPackage.INTERACTION__OWNED_OPERATION :
					return ((InternalEList) getOwnedOperations()).basicRemove(
						otherEnd, msgs);
				case UMLPackage.INTERACTION__NESTED_CLASSIFIER :
					return ((InternalEList) getNestedClassifiers())
						.basicRemove(otherEnd, msgs);
				case UMLPackage.INTERACTION__OWNED_RECEPTION :
					return ((InternalEList) getOwnedReceptions()).basicRemove(
						otherEnd, msgs);
				case UMLPackage.INTERACTION__OWNED_PARAMETER :
					return ((InternalEList) getOwnedParameters()).basicRemove(
						otherEnd, msgs);
				case UMLPackage.INTERACTION__OWNED_PARAMETER_SET :
					return ((InternalEList) getOwnedParameterSets())
						.basicRemove(otherEnd, msgs);
				case UMLPackage.INTERACTION__SPECIFICATION :
					return basicSetSpecification(null, msgs);
				case UMLPackage.INTERACTION__COVERED :
					return ((InternalEList) getCovereds()).basicRemove(
						otherEnd, msgs);
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
					return ((InternalEList) getLifelines()).basicRemove(
						otherEnd, msgs);
				case UMLPackage.INTERACTION__FRAGMENT :
					return ((InternalEList) getFragments()).basicRemove(
						otherEnd, msgs);
				case UMLPackage.INTERACTION__ACTION :
					return ((InternalEList) getActions()).basicRemove(otherEnd,
						msgs);
				case UMLPackage.INTERACTION__FORMAL_GATE :
					return ((InternalEList) getFormalGates()).basicRemove(
						otherEnd, msgs);
				case UMLPackage.INTERACTION__MESSAGE :
					return ((InternalEList) getMessages()).basicRemove(
						otherEnd, msgs);
				default :
					return eDynamicInverseRemove(otherEnd, featureID,
						baseClass, msgs);
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
				case UMLPackage.INTERACTION__OWNING_TEMPLATE_PARAMETER :
					return eInternalContainer()
						.eInverseRemove(
							this,
							UMLPackage.TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT,
							TemplateParameter.class, msgs);
				case UMLPackage.INTERACTION__ENCLOSING_INTERACTION :
					return eInternalContainer().eInverseRemove(this,
						UMLPackage.INTERACTION__FRAGMENT, Interaction.class,
						msgs);
				case UMLPackage.INTERACTION__ENCLOSING_OPERAND :
					return eInternalContainer().eInverseRemove(this,
						UMLPackage.INTERACTION_OPERAND__FRAGMENT,
						InteractionOperand.class, msgs);
				default :
					return eDynamicBasicRemoveFromContainer(msgs);
			}
		}
		return eInternalContainer().eInverseRemove(this,
			EOPPOSITE_FEATURE_BASE - eContainerFeatureID, null, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(EStructuralFeature eFeature, boolean resolve) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case UMLPackage.INTERACTION__EANNOTATIONS :
				return getEAnnotations();
			case UMLPackage.INTERACTION__OWNED_ELEMENT :
				return getOwnedElements();
			case UMLPackage.INTERACTION__OWNER :
				return getOwner();
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
				return getNameExpression();
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
			case UMLPackage.INTERACTION__TEMPLATE_PARAMETER :
				if (resolve)
					return getTemplateParameter();
				return basicGetTemplateParameter();
			case UMLPackage.INTERACTION__OWNING_TEMPLATE_PARAMETER :
				if (resolve)
					return getOwningTemplateParameter();
				return basicGetOwningTemplateParameter();
			case UMLPackage.INTERACTION__PACKAGE :
				return getPackage();
			case UMLPackage.INTERACTION__TEMPLATE_BINDING :
				return getTemplateBindings();
			case UMLPackage.INTERACTION__OWNED_TEMPLATE_SIGNATURE :
				return getOwnedTemplateSignature();
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
			case UMLPackage.INTERACTION__OWNED_USE_CASE :
				return getOwnedUseCases();
			case UMLPackage.INTERACTION__USE_CASE :
				return getUseCases();
			case UMLPackage.INTERACTION__SUBSTITUTION :
				return getSubstitutions();
			case UMLPackage.INTERACTION__ATTRIBUTE :
				return getAttributes();
			case UMLPackage.INTERACTION__REPRESENTATION :
				return getRepresentation();
			case UMLPackage.INTERACTION__COLLABORATION_USE :
				return getCollaborationUses();
			case UMLPackage.INTERACTION__OWNED_SIGNATURE :
				return getOwnedSignature();
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
				return getClassifierBehavior();
			case UMLPackage.INTERACTION__INTERFACE_REALIZATION :
				return getInterfaceRealizations();
			case UMLPackage.INTERACTION__OWNED_TRIGGER :
				return getOwnedTriggers();
			case UMLPackage.INTERACTION__OWNED_OPERATION :
				return getOwnedOperations();
			case UMLPackage.INTERACTION__NESTED_CLASSIFIER :
				return getNestedClassifiers();
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
		return eDynamicGet(eFeature, resolve);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eSet(EStructuralFeature eFeature, Object newValue) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
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
			case UMLPackage.INTERACTION__TEMPLATE_PARAMETER :
				setTemplateParameter((TemplateParameter) newValue);
				return;
			case UMLPackage.INTERACTION__OWNING_TEMPLATE_PARAMETER :
				setOwningTemplateParameter((TemplateParameter) newValue);
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
			case UMLPackage.INTERACTION__INHERITED_MEMBER :
				getInheritedMembers().clear();
				getInheritedMembers().addAll((Collection) newValue);
				return;
			case UMLPackage.INTERACTION__REDEFINED_CLASSIFIER :
				getRedefinedClassifiers().clear();
				getRedefinedClassifiers().addAll((Collection) newValue);
				return;
			case UMLPackage.INTERACTION__GENERAL :
				getGenerals().clear();
				getGenerals().addAll((Collection) newValue);
				return;
			case UMLPackage.INTERACTION__OWNED_USE_CASE :
				getOwnedUseCases().clear();
				getOwnedUseCases().addAll((Collection) newValue);
				return;
			case UMLPackage.INTERACTION__USE_CASE :
				getUseCases().clear();
				getUseCases().addAll((Collection) newValue);
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
			case UMLPackage.INTERACTION__OWNED_SIGNATURE :
				setOwnedSignature((RedefinableTemplateSignature) newValue);
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
			case UMLPackage.INTERACTION__OWNED_OPERATION :
				getOwnedOperations().clear();
				getOwnedOperations().addAll((Collection) newValue);
				return;
			case UMLPackage.INTERACTION__NESTED_CLASSIFIER :
				getNestedClassifiers().clear();
				getNestedClassifiers().addAll((Collection) newValue);
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
			case UMLPackage.INTERACTION__CONTEXT :
				setContext((BehavioredClassifier) newValue);
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
		eDynamicSet(eFeature, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eUnset(EStructuralFeature eFeature) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case UMLPackage.INTERACTION__EANNOTATIONS :
				getEAnnotations().clear();
				return;
			case UMLPackage.INTERACTION__OWNED_COMMENT :
				getOwnedComments().clear();
				return;
			case UMLPackage.INTERACTION__NAME :
				setName(NAME_EDEFAULT);
				return;
			case UMLPackage.INTERACTION__VISIBILITY :
				setVisibility(VISIBILITY_EDEFAULT);
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
			case UMLPackage.INTERACTION__TEMPLATE_PARAMETER :
				setTemplateParameter((TemplateParameter) null);
				return;
			case UMLPackage.INTERACTION__OWNING_TEMPLATE_PARAMETER :
				setOwningTemplateParameter((TemplateParameter) null);
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
			case UMLPackage.INTERACTION__INHERITED_MEMBER :
				getInheritedMembers().clear();
				return;
			case UMLPackage.INTERACTION__REDEFINED_CLASSIFIER :
				getRedefinedClassifiers().clear();
				return;
			case UMLPackage.INTERACTION__GENERAL :
				getGenerals().clear();
				return;
			case UMLPackage.INTERACTION__OWNED_USE_CASE :
				getOwnedUseCases().clear();
				return;
			case UMLPackage.INTERACTION__USE_CASE :
				getUseCases().clear();
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
			case UMLPackage.INTERACTION__OWNED_SIGNATURE :
				setOwnedSignature((RedefinableTemplateSignature) null);
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
			case UMLPackage.INTERACTION__OWNED_OPERATION :
				getOwnedOperations().clear();
				return;
			case UMLPackage.INTERACTION__NESTED_CLASSIFIER :
				getNestedClassifiers().clear();
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
			case UMLPackage.INTERACTION__CONTEXT :
				setContext((BehavioredClassifier) null);
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
		eDynamicUnset(eFeature);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean eIsSet(EStructuralFeature eFeature) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case UMLPackage.INTERACTION__EANNOTATIONS :
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UMLPackage.INTERACTION__OWNED_ELEMENT :
				return isSetOwnedElements();
			case UMLPackage.INTERACTION__OWNER :
				return isSetOwner();
			case UMLPackage.INTERACTION__OWNED_COMMENT :
				List ownedComment = (List) eVirtualGet(UMLPackage.INTERACTION__OWNED_COMMENT);
				return ownedComment != null && !ownedComment.isEmpty();
			case UMLPackage.INTERACTION__NAME :
				String name = (String) eVirtualGet(
					UMLPackage.INTERACTION__NAME, NAME_EDEFAULT);
				return NAME_EDEFAULT == null
					? name != null
					: !NAME_EDEFAULT.equals(name);
			case UMLPackage.INTERACTION__VISIBILITY :
				return isSetVisibility();
			case UMLPackage.INTERACTION__QUALIFIED_NAME :
				return QUALIFIED_NAME_EDEFAULT == null
					? getQualifiedName() != null
					: !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case UMLPackage.INTERACTION__CLIENT_DEPENDENCY :
				List clientDependency = (List) eVirtualGet(UMLPackage.INTERACTION__CLIENT_DEPENDENCY);
				return clientDependency != null && !clientDependency.isEmpty();
			case UMLPackage.INTERACTION__NAMESPACE :
				return isSetNamespace();
			case UMLPackage.INTERACTION__NAME_EXPRESSION :
				return eVirtualGet(UMLPackage.INTERACTION__NAME_EXPRESSION) != null;
			case UMLPackage.INTERACTION__ELEMENT_IMPORT :
				List elementImport = (List) eVirtualGet(UMLPackage.INTERACTION__ELEMENT_IMPORT);
				return elementImport != null && !elementImport.isEmpty();
			case UMLPackage.INTERACTION__PACKAGE_IMPORT :
				List packageImport = (List) eVirtualGet(UMLPackage.INTERACTION__PACKAGE_IMPORT);
				return packageImport != null && !packageImport.isEmpty();
			case UMLPackage.INTERACTION__OWNED_RULE :
				List ownedRule = (List) eVirtualGet(UMLPackage.INTERACTION__OWNED_RULE);
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
			case UMLPackage.INTERACTION__TEMPLATE_PARAMETER :
				return isSetTemplateParameter();
			case UMLPackage.INTERACTION__OWNING_TEMPLATE_PARAMETER :
				return basicGetOwningTemplateParameter() != null;
			case UMLPackage.INTERACTION__PACKAGE :
				return getPackage() != null;
			case UMLPackage.INTERACTION__TEMPLATE_BINDING :
				List templateBinding = (List) eVirtualGet(UMLPackage.INTERACTION__TEMPLATE_BINDING);
				return templateBinding != null && !templateBinding.isEmpty();
			case UMLPackage.INTERACTION__OWNED_TEMPLATE_SIGNATURE :
				return eVirtualGet(UMLPackage.INTERACTION__OWNED_TEMPLATE_SIGNATURE) != null;
			case UMLPackage.INTERACTION__IS_ABSTRACT :
				return isSetIsAbstract();
			case UMLPackage.INTERACTION__GENERALIZATION :
				List generalization = (List) eVirtualGet(UMLPackage.INTERACTION__GENERALIZATION);
				return generalization != null && !generalization.isEmpty();
			case UMLPackage.INTERACTION__POWERTYPE_EXTENT :
				List powertypeExtent = (List) eVirtualGet(UMLPackage.INTERACTION__POWERTYPE_EXTENT);
				return powertypeExtent != null && !powertypeExtent.isEmpty();
			case UMLPackage.INTERACTION__FEATURE :
				return isSetFeatures();
			case UMLPackage.INTERACTION__INHERITED_MEMBER :
				return !getInheritedMembers().isEmpty();
			case UMLPackage.INTERACTION__REDEFINED_CLASSIFIER :
				List redefinedClassifier = (List) eVirtualGet(UMLPackage.INTERACTION__REDEFINED_CLASSIFIER);
				return redefinedClassifier != null
					&& !redefinedClassifier.isEmpty();
			case UMLPackage.INTERACTION__GENERAL :
				return isSetGenerals();
			case UMLPackage.INTERACTION__OWNED_USE_CASE :
				List ownedUseCase = (List) eVirtualGet(UMLPackage.INTERACTION__OWNED_USE_CASE);
				return ownedUseCase != null && !ownedUseCase.isEmpty();
			case UMLPackage.INTERACTION__USE_CASE :
				List useCase = (List) eVirtualGet(UMLPackage.INTERACTION__USE_CASE);
				return useCase != null && !useCase.isEmpty();
			case UMLPackage.INTERACTION__SUBSTITUTION :
				List substitution = (List) eVirtualGet(UMLPackage.INTERACTION__SUBSTITUTION);
				return substitution != null && !substitution.isEmpty();
			case UMLPackage.INTERACTION__ATTRIBUTE :
				return isSetAttributes();
			case UMLPackage.INTERACTION__REPRESENTATION :
				return eVirtualGet(UMLPackage.INTERACTION__REPRESENTATION) != null;
			case UMLPackage.INTERACTION__COLLABORATION_USE :
				List collaborationUse = (List) eVirtualGet(UMLPackage.INTERACTION__COLLABORATION_USE);
				return collaborationUse != null && !collaborationUse.isEmpty();
			case UMLPackage.INTERACTION__OWNED_SIGNATURE :
				return eVirtualGet(UMLPackage.INTERACTION__OWNED_SIGNATURE) != null;
			case UMLPackage.INTERACTION__OWNED_ATTRIBUTE :
				return isSetOwnedAttributes();
			case UMLPackage.INTERACTION__PART :
				return !getParts().isEmpty();
			case UMLPackage.INTERACTION__ROLE :
				return isSetRoles();
			case UMLPackage.INTERACTION__OWNED_CONNECTOR :
				List ownedConnector = (List) eVirtualGet(UMLPackage.INTERACTION__OWNED_CONNECTOR);
				return ownedConnector != null && !ownedConnector.isEmpty();
			case UMLPackage.INTERACTION__OWNED_PORT :
				List ownedPort = (List) eVirtualGet(UMLPackage.INTERACTION__OWNED_PORT);
				return ownedPort != null && !ownedPort.isEmpty();
			case UMLPackage.INTERACTION__OWNED_BEHAVIOR :
				List ownedBehavior = (List) eVirtualGet(UMLPackage.INTERACTION__OWNED_BEHAVIOR);
				return ownedBehavior != null && !ownedBehavior.isEmpty();
			case UMLPackage.INTERACTION__CLASSIFIER_BEHAVIOR :
				return eVirtualGet(UMLPackage.INTERACTION__CLASSIFIER_BEHAVIOR) != null;
			case UMLPackage.INTERACTION__INTERFACE_REALIZATION :
				List interfaceRealization = (List) eVirtualGet(UMLPackage.INTERACTION__INTERFACE_REALIZATION);
				return interfaceRealization != null
					&& !interfaceRealization.isEmpty();
			case UMLPackage.INTERACTION__OWNED_TRIGGER :
				List ownedTrigger = (List) eVirtualGet(UMLPackage.INTERACTION__OWNED_TRIGGER);
				return ownedTrigger != null && !ownedTrigger.isEmpty();
			case UMLPackage.INTERACTION__OWNED_OPERATION :
				List ownedOperation = (List) eVirtualGet(UMLPackage.INTERACTION__OWNED_OPERATION);
				return ownedOperation != null && !ownedOperation.isEmpty();
			case UMLPackage.INTERACTION__NESTED_CLASSIFIER :
				List nestedClassifier = (List) eVirtualGet(UMLPackage.INTERACTION__NESTED_CLASSIFIER);
				return nestedClassifier != null && !nestedClassifier.isEmpty();
			case UMLPackage.INTERACTION__SUPER_CLASS :
				return isSetSuperClasses();
			case UMLPackage.INTERACTION__IS_ACTIVE :
				return ((eFlags & IS_ACTIVE_EFLAG) != 0) != IS_ACTIVE_EDEFAULT;
			case UMLPackage.INTERACTION__OWNED_RECEPTION :
				List ownedReception = (List) eVirtualGet(UMLPackage.INTERACTION__OWNED_RECEPTION);
				return ownedReception != null && !ownedReception.isEmpty();
			case UMLPackage.INTERACTION__EXTENSION :
				return !getExtensions().isEmpty();
			case UMLPackage.INTERACTION__IS_REENTRANT :
				return ((eFlags & IS_REENTRANT_EFLAG) != 0) != IS_REENTRANT_EDEFAULT;
			case UMLPackage.INTERACTION__REDEFINED_BEHAVIOR :
				List redefinedBehavior = (List) eVirtualGet(UMLPackage.INTERACTION__REDEFINED_BEHAVIOR);
				return redefinedBehavior != null
					&& !redefinedBehavior.isEmpty();
			case UMLPackage.INTERACTION__OWNED_PARAMETER :
				List ownedParameter = (List) eVirtualGet(UMLPackage.INTERACTION__OWNED_PARAMETER);
				return ownedParameter != null && !ownedParameter.isEmpty();
			case UMLPackage.INTERACTION__CONTEXT :
				return basicGetContext() != null;
			case UMLPackage.INTERACTION__OWNED_PARAMETER_SET :
				List ownedParameterSet = (List) eVirtualGet(UMLPackage.INTERACTION__OWNED_PARAMETER_SET);
				return ownedParameterSet != null
					&& !ownedParameterSet.isEmpty();
			case UMLPackage.INTERACTION__SPECIFICATION :
				return eVirtualGet(UMLPackage.INTERACTION__SPECIFICATION) != null;
			case UMLPackage.INTERACTION__COVERED :
				List covered = (List) eVirtualGet(UMLPackage.INTERACTION__COVERED);
				return covered != null && !covered.isEmpty();
			case UMLPackage.INTERACTION__GENERAL_ORDERING :
				List generalOrdering = (List) eVirtualGet(UMLPackage.INTERACTION__GENERAL_ORDERING);
				return generalOrdering != null && !generalOrdering.isEmpty();
			case UMLPackage.INTERACTION__ENCLOSING_INTERACTION :
				return getEnclosingInteraction() != null;
			case UMLPackage.INTERACTION__ENCLOSING_OPERAND :
				return getEnclosingOperand() != null;
			case UMLPackage.INTERACTION__LIFELINE :
				List lifeline = (List) eVirtualGet(UMLPackage.INTERACTION__LIFELINE);
				return lifeline != null && !lifeline.isEmpty();
			case UMLPackage.INTERACTION__FRAGMENT :
				List fragment = (List) eVirtualGet(UMLPackage.INTERACTION__FRAGMENT);
				return fragment != null && !fragment.isEmpty();
			case UMLPackage.INTERACTION__ACTION :
				List action = (List) eVirtualGet(UMLPackage.INTERACTION__ACTION);
				return action != null && !action.isEmpty();
			case UMLPackage.INTERACTION__FORMAL_GATE :
				List formalGate = (List) eVirtualGet(UMLPackage.INTERACTION__FORMAL_GATE);
				return formalGate != null && !formalGate.isEmpty();
			case UMLPackage.INTERACTION__MESSAGE :
				List message = (List) eVirtualGet(UMLPackage.INTERACTION__MESSAGE);
				return message != null && !message.isEmpty();
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
			|| eIsSet(UMLPackage.eINSTANCE
				.getInteractionFragment_GeneralOrdering())
			|| eIsSet(UMLPackage.eINSTANCE.getInteraction_Action());
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
			|| eIsSet(UMLPackage.eINSTANCE
				.getInteractionFragment_EnclosingOperand());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOwnedMembers() {
		return super.isSetOwnedMembers()
			|| eIsSet(UMLPackage.eINSTANCE.getInteraction_Lifeline())
			|| eIsSet(UMLPackage.eINSTANCE.getInteraction_Fragment())
			|| eIsSet(UMLPackage.eINSTANCE.getInteraction_FormalGate())
			|| eIsSet(UMLPackage.eINSTANCE.getInteraction_Message());
	}

} //InteractionImpl
