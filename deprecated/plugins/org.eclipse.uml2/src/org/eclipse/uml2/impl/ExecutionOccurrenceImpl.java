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
 * $Id: ExecutionOccurrenceImpl.java,v 1.17 2006/04/10 20:40:17 khussey Exp $
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
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.uml2.Behavior;
import org.eclipse.uml2.EventOccurrence;
import org.eclipse.uml2.ExecutionOccurrence;
import org.eclipse.uml2.Interaction;
import org.eclipse.uml2.InteractionOperand;
import org.eclipse.uml2.StringExpression;
import org.eclipse.uml2.TemplateSignature;
import org.eclipse.uml2.UML2Package;
import org.eclipse.uml2.VisibilityKind;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Execution Occurrence</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2.impl.ExecutionOccurrenceImpl#getStart <em>Start</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.ExecutionOccurrenceImpl#getFinish <em>Finish</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.ExecutionOccurrenceImpl#getBehaviors <em>Behavior</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExecutionOccurrenceImpl extends InteractionFragmentImpl implements ExecutionOccurrence {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) IBM Corporation and others."; //$NON-NLS-1$

	/**
	 * The cached value of the '{@link #getStart() <em>Start</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStart()
	 * @generated
	 * @ordered
	 */
	protected EventOccurrence start = null;

	/**
	 * The cached value of the '{@link #getFinish() <em>Finish</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFinish()
	 * @generated
	 * @ordered
	 */
	protected EventOccurrence finish = null;

	/**
	 * The cached value of the '{@link #getBehaviors() <em>Behavior</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBehaviors()
	 * @generated
	 * @ordered
	 */
	protected EList behaviors = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExecutionOccurrenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return UML2Package.Literals.EXECUTION_OCCURRENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventOccurrence getStart() {
		if (start != null && start.eIsProxy()) {
			InternalEObject oldStart = (InternalEObject)start;
			start = (EventOccurrence)eResolveProxy(oldStart);
			if (start != oldStart) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UML2Package.EXECUTION_OCCURRENCE__START, oldStart, start));
			}
		}
		return start;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventOccurrence basicGetStart() {
		return start;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStart(EventOccurrence newStart, NotificationChain msgs) {
		EventOccurrence oldStart = start;
		start = newStart;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UML2Package.EXECUTION_OCCURRENCE__START, oldStart, newStart);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}

		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStart(EventOccurrence newStart) {
		if (newStart != start) {
			NotificationChain msgs = null;
			if (start != null)
				msgs = ((InternalEObject)start).eInverseRemove(this, UML2Package.EVENT_OCCURRENCE__START_EXEC, EventOccurrence.class, msgs);
			if (newStart != null)
				msgs = ((InternalEObject)newStart).eInverseAdd(this, UML2Package.EVENT_OCCURRENCE__START_EXEC, EventOccurrence.class, msgs);
			msgs = basicSetStart(newStart, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2Package.EXECUTION_OCCURRENCE__START, newStart, newStart));

	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventOccurrence getFinish() {
		if (finish != null && finish.eIsProxy()) {
			InternalEObject oldFinish = (InternalEObject)finish;
			finish = (EventOccurrence)eResolveProxy(oldFinish);
			if (finish != oldFinish) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UML2Package.EXECUTION_OCCURRENCE__FINISH, oldFinish, finish));
			}
		}
		return finish;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventOccurrence basicGetFinish() {
		return finish;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFinish(EventOccurrence newFinish, NotificationChain msgs) {
		EventOccurrence oldFinish = finish;
		finish = newFinish;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UML2Package.EXECUTION_OCCURRENCE__FINISH, oldFinish, newFinish);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}

		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFinish(EventOccurrence newFinish) {
		if (newFinish != finish) {
			NotificationChain msgs = null;
			if (finish != null)
				msgs = ((InternalEObject)finish).eInverseRemove(this, UML2Package.EVENT_OCCURRENCE__FINISH_EXEC, EventOccurrence.class, msgs);
			if (newFinish != null)
				msgs = ((InternalEObject)newFinish).eInverseAdd(this, UML2Package.EVENT_OCCURRENCE__FINISH_EXEC, EventOccurrence.class, msgs);
			msgs = basicSetFinish(newFinish, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2Package.EXECUTION_OCCURRENCE__FINISH, newFinish, newFinish));

	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getBehaviors() {
		if (behaviors == null) {
			behaviors = new EObjectResolvingEList(Behavior.class, this, UML2Package.EXECUTION_OCCURRENCE__BEHAVIOR);
		}
		return behaviors;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
    public Behavior getBehavior(String name) {
		return getBehavior(name, false, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Behavior getBehavior(String name, boolean ignoreCase, EClass eClass) {
		behaviorLoop: for (Iterator i = getBehaviors().iterator(); i.hasNext(); ) {
			Behavior behavior = (Behavior) i.next();
			if (eClass != null && !eClass.isInstance(behavior))
				continue behaviorLoop;
			if (name != null && !(ignoreCase ? name.equalsIgnoreCase(behavior.getName()) : name.equals(behavior.getName())))
				continue behaviorLoop;
			return behavior;
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
			case UML2Package.EXECUTION_OCCURRENCE__EANNOTATIONS:
				return ((InternalEList)getEAnnotations()).basicAdd(otherEnd, msgs);
			case UML2Package.EXECUTION_OCCURRENCE__TEMPLATE_BINDING:
				return ((InternalEList)getTemplateBindings()).basicAdd(otherEnd, msgs);
			case UML2Package.EXECUTION_OCCURRENCE__OWNED_TEMPLATE_SIGNATURE:
				if (ownedTemplateSignature != null)
					msgs = ((InternalEObject)ownedTemplateSignature).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UML2Package.EXECUTION_OCCURRENCE__OWNED_TEMPLATE_SIGNATURE, null, msgs);
				return basicSetOwnedTemplateSignature((TemplateSignature)otherEnd, msgs);
			case UML2Package.EXECUTION_OCCURRENCE__CLIENT_DEPENDENCY:
				return ((InternalEList)getClientDependencies()).basicAdd(otherEnd, msgs);
			case UML2Package.EXECUTION_OCCURRENCE__COVERED:
				return ((InternalEList)getCovereds()).basicAdd(otherEnd, msgs);
			case UML2Package.EXECUTION_OCCURRENCE__ENCLOSING_INTERACTION:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetEnclosingInteraction((Interaction)otherEnd, msgs);
			case UML2Package.EXECUTION_OCCURRENCE__ENCLOSING_OPERAND:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetEnclosingOperand((InteractionOperand)otherEnd, msgs);
			case UML2Package.EXECUTION_OCCURRENCE__START:
				if (start != null)
					msgs = ((InternalEObject)start).eInverseRemove(this, UML2Package.EVENT_OCCURRENCE__START_EXEC, EventOccurrence.class, msgs);
				return basicSetStart((EventOccurrence)otherEnd, msgs);
			case UML2Package.EXECUTION_OCCURRENCE__FINISH:
				if (finish != null)
					msgs = ((InternalEObject)finish).eInverseRemove(this, UML2Package.EVENT_OCCURRENCE__FINISH_EXEC, EventOccurrence.class, msgs);
				return basicSetFinish((EventOccurrence)otherEnd, msgs);
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
			case UML2Package.EXECUTION_OCCURRENCE__EANNOTATIONS:
				return ((InternalEList)getEAnnotations()).basicRemove(otherEnd, msgs);
			case UML2Package.EXECUTION_OCCURRENCE__OWNED_COMMENT:
				return ((InternalEList)getOwnedComments()).basicRemove(otherEnd, msgs);
			case UML2Package.EXECUTION_OCCURRENCE__TEMPLATE_BINDING:
				return ((InternalEList)getTemplateBindings()).basicRemove(otherEnd, msgs);
			case UML2Package.EXECUTION_OCCURRENCE__OWNED_TEMPLATE_SIGNATURE:
				return basicSetOwnedTemplateSignature(null, msgs);
			case UML2Package.EXECUTION_OCCURRENCE__CLIENT_DEPENDENCY:
				return ((InternalEList)getClientDependencies()).basicRemove(otherEnd, msgs);
			case UML2Package.EXECUTION_OCCURRENCE__NAME_EXPRESSION:
				return basicSetNameExpression(null, msgs);
			case UML2Package.EXECUTION_OCCURRENCE__COVERED:
				return ((InternalEList)getCovereds()).basicRemove(otherEnd, msgs);
			case UML2Package.EXECUTION_OCCURRENCE__GENERAL_ORDERING:
				return ((InternalEList)getGeneralOrderings()).basicRemove(otherEnd, msgs);
			case UML2Package.EXECUTION_OCCURRENCE__ENCLOSING_INTERACTION:
				return basicSetEnclosingInteraction(null, msgs);
			case UML2Package.EXECUTION_OCCURRENCE__ENCLOSING_OPERAND:
				return basicSetEnclosingOperand(null, msgs);
			case UML2Package.EXECUTION_OCCURRENCE__START:
				return basicSetStart(null, msgs);
			case UML2Package.EXECUTION_OCCURRENCE__FINISH:
				return basicSetFinish(null, msgs);
		}
		return eDynamicInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UML2Package.EXECUTION_OCCURRENCE__EANNOTATIONS:
				return getEAnnotations();
			case UML2Package.EXECUTION_OCCURRENCE__OWNED_ELEMENT:
				return getOwnedElements();
			case UML2Package.EXECUTION_OCCURRENCE__OWNER:
				if (resolve) return getOwner();
				return basicGetOwner();
			case UML2Package.EXECUTION_OCCURRENCE__OWNED_COMMENT:
				return getOwnedComments();
			case UML2Package.EXECUTION_OCCURRENCE__TEMPLATE_BINDING:
				return getTemplateBindings();
			case UML2Package.EXECUTION_OCCURRENCE__OWNED_TEMPLATE_SIGNATURE:
				return getOwnedTemplateSignature();
			case UML2Package.EXECUTION_OCCURRENCE__NAME:
				return getName();
			case UML2Package.EXECUTION_OCCURRENCE__QUALIFIED_NAME:
				return getQualifiedName();
			case UML2Package.EXECUTION_OCCURRENCE__VISIBILITY:
				return getVisibility();
			case UML2Package.EXECUTION_OCCURRENCE__CLIENT_DEPENDENCY:
				return getClientDependencies();
			case UML2Package.EXECUTION_OCCURRENCE__NAME_EXPRESSION:
				return getNameExpression();
			case UML2Package.EXECUTION_OCCURRENCE__COVERED:
				return getCovereds();
			case UML2Package.EXECUTION_OCCURRENCE__GENERAL_ORDERING:
				return getGeneralOrderings();
			case UML2Package.EXECUTION_OCCURRENCE__ENCLOSING_INTERACTION:
				return getEnclosingInteraction();
			case UML2Package.EXECUTION_OCCURRENCE__ENCLOSING_OPERAND:
				return getEnclosingOperand();
			case UML2Package.EXECUTION_OCCURRENCE__START:
				if (resolve) return getStart();
				return basicGetStart();
			case UML2Package.EXECUTION_OCCURRENCE__FINISH:
				if (resolve) return getFinish();
				return basicGetFinish();
			case UML2Package.EXECUTION_OCCURRENCE__BEHAVIOR:
				return getBehaviors();
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
			case UML2Package.EXECUTION_OCCURRENCE__EANNOTATIONS:
				getEAnnotations().clear();
				getEAnnotations().addAll((Collection)newValue);
				return;
			case UML2Package.EXECUTION_OCCURRENCE__OWNED_COMMENT:
				getOwnedComments().clear();
				getOwnedComments().addAll((Collection)newValue);
				return;
			case UML2Package.EXECUTION_OCCURRENCE__TEMPLATE_BINDING:
				getTemplateBindings().clear();
				getTemplateBindings().addAll((Collection)newValue);
				return;
			case UML2Package.EXECUTION_OCCURRENCE__OWNED_TEMPLATE_SIGNATURE:
				setOwnedTemplateSignature((TemplateSignature)newValue);
				return;
			case UML2Package.EXECUTION_OCCURRENCE__NAME:
				setName((String)newValue);
				return;
			case UML2Package.EXECUTION_OCCURRENCE__VISIBILITY:
				setVisibility((VisibilityKind)newValue);
				return;
			case UML2Package.EXECUTION_OCCURRENCE__CLIENT_DEPENDENCY:
				getClientDependencies().clear();
				getClientDependencies().addAll((Collection)newValue);
				return;
			case UML2Package.EXECUTION_OCCURRENCE__NAME_EXPRESSION:
				setNameExpression((StringExpression)newValue);
				return;
			case UML2Package.EXECUTION_OCCURRENCE__COVERED:
				getCovereds().clear();
				getCovereds().addAll((Collection)newValue);
				return;
			case UML2Package.EXECUTION_OCCURRENCE__GENERAL_ORDERING:
				getGeneralOrderings().clear();
				getGeneralOrderings().addAll((Collection)newValue);
				return;
			case UML2Package.EXECUTION_OCCURRENCE__ENCLOSING_INTERACTION:
				setEnclosingInteraction((Interaction)newValue);
				return;
			case UML2Package.EXECUTION_OCCURRENCE__ENCLOSING_OPERAND:
				setEnclosingOperand((InteractionOperand)newValue);
				return;
			case UML2Package.EXECUTION_OCCURRENCE__START:
				setStart((EventOccurrence)newValue);
				return;
			case UML2Package.EXECUTION_OCCURRENCE__FINISH:
				setFinish((EventOccurrence)newValue);
				return;
			case UML2Package.EXECUTION_OCCURRENCE__BEHAVIOR:
				getBehaviors().clear();
				getBehaviors().addAll((Collection)newValue);
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
			case UML2Package.EXECUTION_OCCURRENCE__EANNOTATIONS:
				getEAnnotations().clear();
				return;
			case UML2Package.EXECUTION_OCCURRENCE__OWNED_COMMENT:
				getOwnedComments().clear();
				return;
			case UML2Package.EXECUTION_OCCURRENCE__TEMPLATE_BINDING:
				getTemplateBindings().clear();
				return;
			case UML2Package.EXECUTION_OCCURRENCE__OWNED_TEMPLATE_SIGNATURE:
				setOwnedTemplateSignature((TemplateSignature)null);
				return;
			case UML2Package.EXECUTION_OCCURRENCE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case UML2Package.EXECUTION_OCCURRENCE__VISIBILITY:
				setVisibility(VISIBILITY_EDEFAULT);
				return;
			case UML2Package.EXECUTION_OCCURRENCE__CLIENT_DEPENDENCY:
				getClientDependencies().clear();
				return;
			case UML2Package.EXECUTION_OCCURRENCE__NAME_EXPRESSION:
				setNameExpression((StringExpression)null);
				return;
			case UML2Package.EXECUTION_OCCURRENCE__COVERED:
				getCovereds().clear();
				return;
			case UML2Package.EXECUTION_OCCURRENCE__GENERAL_ORDERING:
				getGeneralOrderings().clear();
				return;
			case UML2Package.EXECUTION_OCCURRENCE__ENCLOSING_INTERACTION:
				setEnclosingInteraction((Interaction)null);
				return;
			case UML2Package.EXECUTION_OCCURRENCE__ENCLOSING_OPERAND:
				setEnclosingOperand((InteractionOperand)null);
				return;
			case UML2Package.EXECUTION_OCCURRENCE__START:
				setStart((EventOccurrence)null);
				return;
			case UML2Package.EXECUTION_OCCURRENCE__FINISH:
				setFinish((EventOccurrence)null);
				return;
			case UML2Package.EXECUTION_OCCURRENCE__BEHAVIOR:
				getBehaviors().clear();
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
			case UML2Package.EXECUTION_OCCURRENCE__EANNOTATIONS:
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UML2Package.EXECUTION_OCCURRENCE__OWNED_ELEMENT:
				return isSetOwnedElements();
			case UML2Package.EXECUTION_OCCURRENCE__OWNER:
				return isSetOwner();
			case UML2Package.EXECUTION_OCCURRENCE__OWNED_COMMENT:
				return ownedComments != null && !ownedComments.isEmpty();
			case UML2Package.EXECUTION_OCCURRENCE__TEMPLATE_BINDING:
				return templateBindings != null && !templateBindings.isEmpty();
			case UML2Package.EXECUTION_OCCURRENCE__OWNED_TEMPLATE_SIGNATURE:
				return ownedTemplateSignature != null;
			case UML2Package.EXECUTION_OCCURRENCE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case UML2Package.EXECUTION_OCCURRENCE__QUALIFIED_NAME:
				return QUALIFIED_NAME_EDEFAULT == null ? getQualifiedName() != null : !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case UML2Package.EXECUTION_OCCURRENCE__VISIBILITY:
				return visibility != VISIBILITY_EDEFAULT;
			case UML2Package.EXECUTION_OCCURRENCE__CLIENT_DEPENDENCY:
				return clientDependencies != null && !clientDependencies.isEmpty();
			case UML2Package.EXECUTION_OCCURRENCE__NAME_EXPRESSION:
				return nameExpression != null;
			case UML2Package.EXECUTION_OCCURRENCE__COVERED:
				return covereds != null && !covereds.isEmpty();
			case UML2Package.EXECUTION_OCCURRENCE__GENERAL_ORDERING:
				return generalOrderings != null && !generalOrderings.isEmpty();
			case UML2Package.EXECUTION_OCCURRENCE__ENCLOSING_INTERACTION:
				return getEnclosingInteraction() != null;
			case UML2Package.EXECUTION_OCCURRENCE__ENCLOSING_OPERAND:
				return getEnclosingOperand() != null;
			case UML2Package.EXECUTION_OCCURRENCE__START:
				return start != null;
			case UML2Package.EXECUTION_OCCURRENCE__FINISH:
				return finish != null;
			case UML2Package.EXECUTION_OCCURRENCE__BEHAVIOR:
				return behaviors != null && !behaviors.isEmpty();
		}
		return eDynamicIsSet(featureID);
	}


} //ExecutionOccurrenceImpl
