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
 * $Id: InteractionImpl.java,v 1.3 2004/04/23 02:31:48 khussey Exp $
 */
package org.eclipse.uml2.impl;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreEList;
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
	public static final String copyright = "Copyright (c) 2003, 2004 IBM Corporation and others."; //$NON-NLS-1$

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
	 * The cached value of the '{@link #getLifelines() <em>Lifeline</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLifelines()
	 * @generated
	 * @ordered
	 */
	protected EList lifeline = null;

	/**
	 * The cached value of the '{@link #getMessages() <em>Message</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessages()
	 * @generated
	 * @ordered
	 */
	protected EList message = null;

	/**
	 * The cached value of the '{@link #getFragments() <em>Fragment</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFragments()
	 * @generated
	 * @ordered
	 */
	protected EList fragment = null;

	/**
	 * The cached value of the '{@link #getFormalGates() <em>Formal Gate</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFormalGates()
	 * @generated
	 * @ordered
	 */
	protected EList formalGate = null;

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
	 * Returns the value of the '<em><b>Covered</b></em>' reference list.
	 * @generated
	 */
	public EList getCovereds() {
		if (null == covered) {
			covered = new EObjectWithInverseResolvingEList.ManyInverse(Lifeline.class, this, UML2Package.INTERACTION__COVERED, UML2Package.LIFELINE__COVERED_BY);
		}
		return covered;
	}

    /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
     */
    public Lifeline getCovered(String unqualifiedName) {
    	for (Iterator i = getCovereds().iterator(); i.hasNext(); ) {
    		Lifeline namedCovered = (Lifeline) i.next();
    		
    		if (unqualifiedName.equals(namedCovered.getName())) {
    			return namedCovered;
    		}
    	}
    	
    	return null;
    }
      
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * Returns the value of the '<em><b>General Ordering</b></em>' containment reference list.
	 * <p>
	 * Subsets the following features:
	 * <ul>
	 *   <li>{@link org.eclipse.uml2.Element#getOwnedElements}</li>
	 * </ul>
	 * </p>
	 * @generated
	 */
	public EList getGeneralOrderings() {
		if (generalOrdering == null) {
			generalOrdering = new EObjectContainmentEList(GeneralOrdering.class, this, UML2Package.INTERACTION__GENERAL_ORDERING);
		}
		return generalOrdering;
	}

    /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
     */
    public GeneralOrdering getGeneralOrdering(String unqualifiedName) {
    	for (Iterator i = getGeneralOrderings().iterator(); i.hasNext(); ) {
    		GeneralOrdering namedGeneralOrdering = (GeneralOrdering) i.next();
    		
    		if (unqualifiedName.equals(namedGeneralOrdering.getName())) {
    			return namedGeneralOrdering;
    		}
    	}
    	
    	return null;
    }
      
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeneralOrdering createGeneralOrdering(EClass eClass) {
		GeneralOrdering newGeneralOrdering = (GeneralOrdering) eClass.getEPackage().getEFactoryInstance().create(eClass);
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.CREATE, UML2Package.INTERACTION__GENERAL_ORDERING, null, newGeneralOrdering));
		}
		getGeneralOrderings().add(newGeneralOrdering);
		return newGeneralOrdering;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * Returns the value of the '<em><b>Enclosing Interaction</b></em>' container reference.
	 * @generated
	 */
	public Interaction getEnclosingInteraction() {
		if (eContainerFeatureID != UML2Package.INTERACTION__ENCLOSING_INTERACTION) return null;
		return (Interaction)eContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnclosingInteraction(Interaction newEnclosingInteraction) {
		if (newEnclosingInteraction != eContainer || (eContainerFeatureID != UML2Package.INTERACTION__ENCLOSING_INTERACTION && newEnclosingInteraction != null)) {
			if (EcoreUtil.isAncestor(this, newEnclosingInteraction))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString()); //$NON-NLS-1$
			NotificationChain msgs = null;
			if (eContainer != null)
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
	 * Returns the value of the '<em><b>Enclosing Operand</b></em>' container reference.
	 * <p>
	 * Subsets the following features:
	 * <ul>
	 *   <li>{@link org.eclipse.uml2.NamedElement#getNamespace}</li>
	 * </ul>
	 * </p>
	 * @generated
	 */
	public InteractionOperand getEnclosingOperand() {
		if (eContainerFeatureID != UML2Package.INTERACTION__ENCLOSING_OPERAND) return null;
		return (InteractionOperand)eContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnclosingOperand(InteractionOperand newEnclosingOperand) {
		if (newEnclosingOperand != eContainer || (eContainerFeatureID != UML2Package.INTERACTION__ENCLOSING_OPERAND && newEnclosingOperand != null)) {
			if (EcoreUtil.isAncestor(this, newEnclosingOperand))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString()); //$NON-NLS-1$
			NotificationChain msgs = null;
			if (eContainer != null)
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
	 * Returns the value of the '<em><b>Lifeline</b></em>' containment reference list.
	 * <p>
	 * Subsets the following features:
	 * <ul>
	 *   <li>{@link org.eclipse.uml2.Namespace#getOwnedMembers}</li>
	 * </ul>
	 * </p>
	 * @generated
	 */
	public EList getLifelines() {
		if (lifeline == null) {
			lifeline = new EObjectContainmentWithInverseEList(Lifeline.class, this, UML2Package.INTERACTION__LIFELINE, UML2Package.LIFELINE__INTERACTION);
		}
		return lifeline;
	}

    /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
     */
    public Lifeline getLifeline(String unqualifiedName) {
    	for (Iterator i = getLifelines().iterator(); i.hasNext(); ) {
    		Lifeline namedLifeline = (Lifeline) i.next();
    		
    		if (unqualifiedName.equals(namedLifeline.getName())) {
    			return namedLifeline;
    		}
    	}
    	
    	return null;
    }
      
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Lifeline createLifeline(EClass eClass) {
		Lifeline newLifeline = (Lifeline) eClass.getEPackage().getEFactoryInstance().create(eClass);
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.CREATE, UML2Package.INTERACTION__LIFELINE, null, newLifeline));
		}
		getLifelines().add(newLifeline);
		return newLifeline;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * Returns the value of the '<em><b>Message</b></em>' containment reference list.
	 * <p>
	 * Subsets the following features:
	 * <ul>
	 *   <li>{@link org.eclipse.uml2.Namespace#getOwnedMembers}</li>
	 * </ul>
	 * </p>
	 * @generated
	 */
	public EList getMessages() {
		if (message == null) {
			message = new EObjectContainmentWithInverseEList(Message.class, this, UML2Package.INTERACTION__MESSAGE, UML2Package.MESSAGE__INTERACTION);
		}
		return message;
	}

    /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
     */
    public Message getMessage(String unqualifiedName) {
    	for (Iterator i = getMessages().iterator(); i.hasNext(); ) {
    		Message namedMessage = (Message) i.next();
    		
    		if (unqualifiedName.equals(namedMessage.getName())) {
    			return namedMessage;
    		}
    	}
    	
    	return null;
    }
      
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Message createMessage(EClass eClass) {
		Message newMessage = (Message) eClass.getEPackage().getEFactoryInstance().create(eClass);
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.CREATE, UML2Package.INTERACTION__MESSAGE, null, newMessage));
		}
		getMessages().add(newMessage);
		return newMessage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * Returns the value of the '<em><b>Fragment</b></em>' containment reference list.
	 * @generated
	 */
	public EList getFragmentsGen() {
		if (fragment == null) {
			fragment = new EObjectContainmentWithInverseEList(InteractionFragment.class, this, UML2Package.INTERACTION__FRAGMENT, UML2Package.INTERACTION_FRAGMENT__ENCLOSING_INTERACTION);
		}
		return fragment;
	}

	public EList getFragments() {
		if (fragment == null) {
			fragment = new EObjectContainmentWithInverseEList(InteractionFragment.class, this, UML2Package.INTERACTION__FRAGMENT, UML2Package.INTERACTION_FRAGMENT__ENCLOSING_INTERACTION) {
			public boolean contains(Object object) {
				if (isEObject() && size > 4 && isContainment() && object instanceof EObject) {
					InternalEObject eObject = (InternalEObject) object;
					int baseContainerFeatureID = eObject.eBaseStructuralFeatureID(eObject.eContainerFeatureID(), getFeatureType().getInstanceClass());

					return eObject.eContainer() == owner
						&& (hasNavigableInverse()
							? baseContainerFeatureID == getInverseFeatureID()
							: InternalEObject.EOPPOSITE_FEATURE_BASE - baseContainerFeatureID == getFeatureID());
				} else {
					return super.contains(object);
				}
			}
		};
		}
		return fragment;
	}

    /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
     */
    public InteractionFragment getFragment(String unqualifiedName) {
    	for (Iterator i = getFragments().iterator(); i.hasNext(); ) {
    		InteractionFragment namedFragment = (InteractionFragment) i.next();
    		
    		if (unqualifiedName.equals(namedFragment.getName())) {
    			return namedFragment;
    		}
    	}
    	
    	return null;
    }
      
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InteractionFragment createFragment(EClass eClass) {
		InteractionFragment newFragment = (InteractionFragment) eClass.getEPackage().getEFactoryInstance().create(eClass);
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.CREATE, UML2Package.INTERACTION__FRAGMENT, null, newFragment));
		}
		getFragments().add(newFragment);
		return newFragment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * Returns the value of the '<em><b>Formal Gate</b></em>' containment reference list.
	 * <p>
	 * Subsets the following features:
	 * <ul>
	 *   <li>{@link org.eclipse.uml2.Namespace#getOwnedMembers}</li>
	 * </ul>
	 * </p>
	 * @generated
	 */
	public EList getFormalGates() {
		if (formalGate == null) {
			formalGate = new EObjectContainmentEList(Gate.class, this, UML2Package.INTERACTION__FORMAL_GATE);
		}
		return formalGate;
	}

    /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
     */
    public Gate getFormalGate(String unqualifiedName) {
    	for (Iterator i = getFormalGates().iterator(); i.hasNext(); ) {
    		Gate namedFormalGate = (Gate) i.next();
    		
    		if (unqualifiedName.equals(namedFormalGate.getName())) {
    			return namedFormalGate;
    		}
    	}
    	
    	return null;
    }
      
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Gate createFormalGate(EClass eClass) {
		Gate newFormalGate = (Gate) eClass.getEPackage().getEFactoryInstance().create(eClass);
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.CREATE, UML2Package.INTERACTION__FORMAL_GATE, null, newFormalGate));
		}
		getFormalGates().add(newFormalGate);
		return newFormalGate;
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
			union.addAll(getGeneralOrderings());
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
	 * Returns the value of the '<em><b>Namespace</b></em>' reference, a derived union.
	 * It is bidirectional and its opposite is '{@link org.eclipse.uml2.Namespace#getOwnedMembers <em>Owned Member</em>}'.
	 * @generated
	 */
	public Namespace getNamespace() {
		// TODO: test this union getter
		if (null != getEnclosingOperand()) {
			return (Namespace) getEnclosingOperand();
		}
		return super.getNamespace();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * Returns the value of the '<em><b>Owned Member</b></em>' reference list, a derived union.
	 * The list contents are of type {@link org.eclipse.uml2.NamedElement}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.uml2.NamedElement#getNamespace <em>Namespace</em>}'.
	 * @generated
	 */
	public EList getOwnedMembers() {
		// TODO: test this union getter
		if (!getCacheAdapter().containsKey(this, UML2Package.eINSTANCE.getInteraction().getEAllOperations().get(91))) {
			Set union = new LinkedHashSet();
			union.addAll(super.getOwnedMembers());
			union.addAll(getLifelines());
			union.addAll(getMessages());
			union.addAll(getFormalGates());
			getCacheAdapter().put(
				this,
				UML2Package.eINSTANCE.getInteraction().getEAllOperations().get(91),
				new BasicEList.UnmodifiableEList(union.size(), union.toArray()));
		}
		return (EList) getCacheAdapter().get(this, UML2Package.eINSTANCE.getInteraction().getEAllOperations().get(91));
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
					if (eContainer != null)
						msgs = eBasicRemoveFromContainer(msgs);
					return eBasicSetContainer(otherEnd, UML2Package.INTERACTION__OWNING_PARAMETER, msgs);
				case UML2Package.INTERACTION__GENERALIZATION:
					return ((InternalEList)getGeneralizations()).basicAdd(otherEnd, msgs);
				case UML2Package.INTERACTION__SUBSTITUTION:
					return ((InternalEList)getSubstitutions()).basicAdd(otherEnd, msgs);
				case UML2Package.INTERACTION__POWERTYPE_EXTENT:
					return ((InternalEList)getPowertypeExtents()).basicAdd(otherEnd, msgs);
				case UML2Package.INTERACTION__OWNED_BEHAVIOR:
					return ((InternalEList)getOwnedBehaviors()).basicAdd(otherEnd, msgs);
				case UML2Package.INTERACTION__IMPLEMENTATION:
					return ((InternalEList)getImplementations()).basicAdd(otherEnd, msgs);
				case UML2Package.INTERACTION__OWNED_STATE_MACHINE:
					return ((InternalEList)getOwnedStateMachines()).basicAdd(otherEnd, msgs);
				case UML2Package.INTERACTION__OWNED_OPERATION:
					return ((InternalEList)getOwnedOperations()).basicAdd(otherEnd, msgs);
				case UML2Package.INTERACTION__CONTEXT:
					if (eContainer != null)
						msgs = eBasicRemoveFromContainer(msgs);
					return eBasicSetContainer(otherEnd, UML2Package.INTERACTION__CONTEXT, msgs);
				case UML2Package.INTERACTION__SPECIFICATION:
					if (specification != null)
						msgs = ((InternalEObject)specification).eInverseRemove(this, UML2Package.BEHAVIORAL_FEATURE__METHOD, BehavioralFeature.class, msgs);
					return basicSetSpecification((BehavioralFeature)otherEnd, msgs);
				case UML2Package.INTERACTION__COVERED:
					return ((InternalEList)getCovereds()).basicAdd(otherEnd, msgs);
				case UML2Package.INTERACTION__ENCLOSING_INTERACTION:
					if (eContainer != null)
						msgs = eBasicRemoveFromContainer(msgs);
					return eBasicSetContainer(otherEnd, UML2Package.INTERACTION__ENCLOSING_INTERACTION, msgs);
				case UML2Package.INTERACTION__ENCLOSING_OPERAND:
					if (eContainer != null)
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
				case UML2Package.INTERACTION__OCCURRENCE:
					return ((InternalEList)getOccurrences()).basicRemove(otherEnd, msgs);
				case UML2Package.INTERACTION__OWNED_ATTRIBUTE:
					return ((InternalEList)getOwnedAttributes()).basicRemove(otherEnd, msgs);
				case UML2Package.INTERACTION__OWNED_CONNECTOR:
					return ((InternalEList)getOwnedConnectors()).basicRemove(otherEnd, msgs);
				case UML2Package.INTERACTION__OWNED_PORT:
					return ((InternalEList)getOwnedPorts()).basicRemove(otherEnd, msgs);
				case UML2Package.INTERACTION__OWNED_BEHAVIOR:
					return ((InternalEList)getOwnedBehaviors()).basicRemove(otherEnd, msgs);
				case UML2Package.INTERACTION__IMPLEMENTATION:
					return ((InternalEList)getImplementations()).basicRemove(otherEnd, msgs);
				case UML2Package.INTERACTION__OWNED_STATE_MACHINE:
					return ((InternalEList)getOwnedStateMachines()).basicRemove(otherEnd, msgs);
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
					return eContainer.eInverseRemove(this, UML2Package.TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT, TemplateParameter.class, msgs);
				case UML2Package.INTERACTION__CONTEXT:
					return eContainer.eInverseRemove(this, UML2Package.BEHAVIORED_CLASSIFIER__OWNED_BEHAVIOR, BehavioredClassifier.class, msgs);
				case UML2Package.INTERACTION__ENCLOSING_INTERACTION:
					return eContainer.eInverseRemove(this, UML2Package.INTERACTION__FRAGMENT, Interaction.class, msgs);
				case UML2Package.INTERACTION__ENCLOSING_OPERAND:
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
				if (resolve) return getPackage();
				return basicGetPackage();
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
			case UML2Package.INTERACTION__REPRESENTATION:
				return getRepresentation();
			case UML2Package.INTERACTION__OCCURRENCE:
				return getOccurrences();
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
			case UML2Package.INTERACTION__OWNED_BEHAVIOR:
				return getOwnedBehaviors();
			case UML2Package.INTERACTION__CLASSIFIER_BEHAVIOR:
				return getClassifierBehavior();
			case UML2Package.INTERACTION__IMPLEMENTATION:
				return getImplementations();
			case UML2Package.INTERACTION__OWNED_STATE_MACHINE:
				return getOwnedStateMachines();
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
			case UML2Package.INTERACTION__REPRESENTATION:
				setRepresentation((CollaborationOccurrence)newValue);
				return;
			case UML2Package.INTERACTION__OCCURRENCE:
				getOccurrences().clear();
				getOccurrences().addAll((Collection)newValue);
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
			case UML2Package.INTERACTION__OWNED_STATE_MACHINE:
				getOwnedStateMachines().clear();
				getOwnedStateMachines().addAll((Collection)newValue);
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
				setOwningParameter(null);
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
			case UML2Package.INTERACTION__REPRESENTATION:
				setRepresentation((CollaborationOccurrence)null);
				return;
			case UML2Package.INTERACTION__OCCURRENCE:
				getOccurrences().clear();
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
			case UML2Package.INTERACTION__OWNED_BEHAVIOR:
				getOwnedBehaviors().clear();
				return;
			case UML2Package.INTERACTION__CLASSIFIER_BEHAVIOR:
				setClassifierBehavior((Behavior)null);
				return;
			case UML2Package.INTERACTION__IMPLEMENTATION:
				getImplementations().clear();
				return;
			case UML2Package.INTERACTION__OWNED_STATE_MACHINE:
				getOwnedStateMachines().clear();
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
				setContext(null);
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
				return !getOwnedElements().isEmpty();
			case UML2Package.INTERACTION__OWNER:
				return basicGetOwner() != null;
			case UML2Package.INTERACTION__OWNED_COMMENT:
				return ownedComment != null && !ownedComment.isEmpty();
			case UML2Package.INTERACTION__TEMPLATE_BINDING:
				return templateBinding != null && !templateBinding.isEmpty();
			case UML2Package.INTERACTION__OWNED_TEMPLATE_SIGNATURE:
				return ownedTemplateSignature != null;
			case UML2Package.INTERACTION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case UML2Package.INTERACTION__QUALIFIED_NAME:
				return !"".equals(getQualifiedName()); //$NON-NLS-1$
			case UML2Package.INTERACTION__VISIBILITY:
				return visibility != VISIBILITY_EDEFAULT;
			case UML2Package.INTERACTION__CLIENT_DEPENDENCY:
				return clientDependency != null && !clientDependency.isEmpty();
			case UML2Package.INTERACTION__NAME_EXPRESSION:
				return nameExpression != null;
			case UML2Package.INTERACTION__MEMBER:
				return !getMembers().isEmpty();
			case UML2Package.INTERACTION__OWNED_RULE:
				return ownedRule != null && !ownedRule.isEmpty();
			case UML2Package.INTERACTION__IMPORTED_MEMBER:
				return !getImportedMembers().isEmpty();
			case UML2Package.INTERACTION__ELEMENT_IMPORT:
				return elementImport != null && !elementImport.isEmpty();
			case UML2Package.INTERACTION__PACKAGE_IMPORT:
				return packageImport != null && !packageImport.isEmpty();
			case UML2Package.INTERACTION__TEMPLATE_PARAMETER:
				return templateParameter != null;
			case UML2Package.INTERACTION__OWNING_PARAMETER:
				return getOwningParameter() != null;
			case UML2Package.INTERACTION__PACKAGEABLE_ELEMENT_VISIBILITY:
				return packageableElement_visibility != PACKAGEABLE_ELEMENT_VISIBILITY_EDEFAULT;
			case UML2Package.INTERACTION__PACKAGE:
				return basicGetPackage() != null;
			case UML2Package.INTERACTION__REDEFINITION_CONTEXT:
				return !getRedefinitionContexts().isEmpty();
			case UML2Package.INTERACTION__IS_LEAF:
				return isLeaf != IS_LEAF_EDEFAULT;
			case UML2Package.INTERACTION__FEATURE:
				return !getFeatures().isEmpty();
			case UML2Package.INTERACTION__IS_ABSTRACT:
				return isAbstract != IS_ABSTRACT_EDEFAULT;
			case UML2Package.INTERACTION__INHERITED_MEMBER:
				return !getInheritedMembers().isEmpty();
			case UML2Package.INTERACTION__GENERAL:
				return !getGenerals().isEmpty();
			case UML2Package.INTERACTION__GENERALIZATION:
				return generalization != null && !generalization.isEmpty();
			case UML2Package.INTERACTION__ATTRIBUTE:
				return !getAttributes().isEmpty();
			case UML2Package.INTERACTION__REDEFINED_CLASSIFIER:
				return redefinedClassifier != null && !redefinedClassifier.isEmpty();
			case UML2Package.INTERACTION__SUBSTITUTION:
				return substitution != null && !substitution.isEmpty();
			case UML2Package.INTERACTION__POWERTYPE_EXTENT:
				return powertypeExtent != null && !powertypeExtent.isEmpty();
			case UML2Package.INTERACTION__OWNED_USE_CASE:
				return ownedUseCase != null && !ownedUseCase.isEmpty();
			case UML2Package.INTERACTION__REPRESENTATION:
				return representation != null;
			case UML2Package.INTERACTION__OCCURRENCE:
				return occurrence != null && !occurrence.isEmpty();
			case UML2Package.INTERACTION__OWNED_ATTRIBUTE:
				return ownedAttribute != null && !ownedAttribute.isEmpty();
			case UML2Package.INTERACTION__PART:
				return !getParts().isEmpty();
			case UML2Package.INTERACTION__ROLE:
				return !getRoles().isEmpty();
			case UML2Package.INTERACTION__OWNED_CONNECTOR:
				return ownedConnector != null && !ownedConnector.isEmpty();
			case UML2Package.INTERACTION__OWNED_PORT:
				return ownedPort != null && !ownedPort.isEmpty();
			case UML2Package.INTERACTION__OWNED_BEHAVIOR:
				return ownedBehavior != null && !ownedBehavior.isEmpty();
			case UML2Package.INTERACTION__CLASSIFIER_BEHAVIOR:
				return classifierBehavior != null;
			case UML2Package.INTERACTION__IMPLEMENTATION:
				return implementation != null && !implementation.isEmpty();
			case UML2Package.INTERACTION__OWNED_STATE_MACHINE:
				return ownedStateMachine != null && !ownedStateMachine.isEmpty();
			case UML2Package.INTERACTION__OWNED_OPERATION:
				return ownedOperation != null && !ownedOperation.isEmpty();
			case UML2Package.INTERACTION__SUPER_CLASS:
				return !getSuperClasses().isEmpty();
			case UML2Package.INTERACTION__EXTENSION:
				return !getExtensions().isEmpty();
			case UML2Package.INTERACTION__NESTED_CLASSIFIER:
				return nestedClassifier != null && !nestedClassifier.isEmpty();
			case UML2Package.INTERACTION__IS_ACTIVE:
				return isActive != IS_ACTIVE_EDEFAULT;
			case UML2Package.INTERACTION__OWNED_RECEPTION:
				return ownedReception != null && !ownedReception.isEmpty();
			case UML2Package.INTERACTION__IS_REENTRANT:
				return isReentrant != IS_REENTRANT_EDEFAULT;
			case UML2Package.INTERACTION__CONTEXT:
				return getContext() != null;
			case UML2Package.INTERACTION__REDEFINED_BEHAVIOR:
				return redefinedBehavior != null && !redefinedBehavior.isEmpty();
			case UML2Package.INTERACTION__SPECIFICATION:
				return specification != null;
			case UML2Package.INTERACTION__PARAMETER:
				return parameter != null && !parameter.isEmpty();
			case UML2Package.INTERACTION__FORMAL_PARAMETER:
				return !getFormalParameters().isEmpty();
			case UML2Package.INTERACTION__RETURN_RESULT:
				return !getReturnResults().isEmpty();
			case UML2Package.INTERACTION__PRECONDITION:
				return precondition != null && !precondition.isEmpty();
			case UML2Package.INTERACTION__POSTCONDITION:
				return postcondition != null && !postcondition.isEmpty();
			case UML2Package.INTERACTION__COVERED:
				return covered != null && !covered.isEmpty();
			case UML2Package.INTERACTION__GENERAL_ORDERING:
				return generalOrdering != null && !generalOrdering.isEmpty();
			case UML2Package.INTERACTION__ENCLOSING_INTERACTION:
				return getEnclosingInteraction() != null;
			case UML2Package.INTERACTION__ENCLOSING_OPERAND:
				return getEnclosingOperand() != null;
			case UML2Package.INTERACTION__LIFELINE:
				return lifeline != null && !lifeline.isEmpty();
			case UML2Package.INTERACTION__MESSAGE:
				return message != null && !message.isEmpty();
			case UML2Package.INTERACTION__FRAGMENT:
				return fragment != null && !fragment.isEmpty();
			case UML2Package.INTERACTION__FORMAL_GATE:
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

} //InteractionImpl
