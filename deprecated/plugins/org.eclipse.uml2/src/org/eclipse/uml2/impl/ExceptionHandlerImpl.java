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
 * $Id: ExceptionHandlerImpl.java,v 1.6 2005/05/18 16:38:29 khussey Exp $
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

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.uml2.Classifier;
import org.eclipse.uml2.Element;
import org.eclipse.uml2.ExceptionHandler;
import org.eclipse.uml2.ExecutableNode;
import org.eclipse.uml2.ObjectNode;
import org.eclipse.uml2.UML2Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Exception Handler</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2.impl.ExceptionHandlerImpl#getProtectedNode <em>Protected Node</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.ExceptionHandlerImpl#getHandlerBody <em>Handler Body</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.ExceptionHandlerImpl#getExceptionInput <em>Exception Input</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.ExceptionHandlerImpl#getExceptionTypes <em>Exception Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExceptionHandlerImpl extends ElementImpl implements ExceptionHandler {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) IBM Corporation and others."; //$NON-NLS-1$

	/**
	 * The cached value of the '{@link #getHandlerBody() <em>Handler Body</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHandlerBody()
	 * @generated
	 * @ordered
	 */
	protected ExecutableNode handlerBody = null;

	/**
	 * The cached value of the '{@link #getExceptionInput() <em>Exception Input</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExceptionInput()
	 * @generated
	 * @ordered
	 */
	protected ObjectNode exceptionInput = null;

	/**
	 * The cached value of the '{@link #getExceptionTypes() <em>Exception Type</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExceptionTypes()
	 * @generated
	 * @ordered
	 */
	protected EList exceptionType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExceptionHandlerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return UML2Package.eINSTANCE.getExceptionHandler();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExecutableNode getProtectedNode() {
		if (eContainerFeatureID != UML2Package.EXCEPTION_HANDLER__PROTECTED_NODE) return null;
		return (ExecutableNode)eContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProtectedNode(ExecutableNode newProtectedNode) {
		if (newProtectedNode != eContainer || (eContainerFeatureID != UML2Package.EXCEPTION_HANDLER__PROTECTED_NODE && newProtectedNode != null)) {
			if (EcoreUtil.isAncestor(this, newProtectedNode))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString()); //$NON-NLS-1$
			NotificationChain msgs = null;
			if (eContainer != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newProtectedNode != null)
				msgs = ((InternalEObject)newProtectedNode).eInverseAdd(this, UML2Package.EXECUTABLE_NODE__HANDLER, ExecutableNode.class, msgs);
			msgs = eBasicSetContainer((InternalEObject)newProtectedNode, UML2Package.EXCEPTION_HANDLER__PROTECTED_NODE, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2Package.EXCEPTION_HANDLER__PROTECTED_NODE, newProtectedNode, newProtectedNode));

	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExecutableNode getHandlerBody() {
		if (handlerBody != null && handlerBody.eIsProxy()) {
			ExecutableNode oldHandlerBody = handlerBody;
			handlerBody = (ExecutableNode)eResolveProxy((InternalEObject)handlerBody);
			if (handlerBody != oldHandlerBody) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UML2Package.EXCEPTION_HANDLER__HANDLER_BODY, oldHandlerBody, handlerBody));
			}
		}
		return handlerBody;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExecutableNode basicGetHandlerBody() {
		return handlerBody;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHandlerBody(ExecutableNode newHandlerBody) {
		ExecutableNode oldHandlerBody = handlerBody;
		handlerBody = newHandlerBody;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2Package.EXCEPTION_HANDLER__HANDLER_BODY, oldHandlerBody, handlerBody));

	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectNode getExceptionInput() {
		if (exceptionInput != null && exceptionInput.eIsProxy()) {
			ObjectNode oldExceptionInput = exceptionInput;
			exceptionInput = (ObjectNode)eResolveProxy((InternalEObject)exceptionInput);
			if (exceptionInput != oldExceptionInput) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UML2Package.EXCEPTION_HANDLER__EXCEPTION_INPUT, oldExceptionInput, exceptionInput));
			}
		}
		return exceptionInput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectNode basicGetExceptionInput() {
		return exceptionInput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExceptionInput(ObjectNode newExceptionInput) {
		ObjectNode oldExceptionInput = exceptionInput;
		exceptionInput = newExceptionInput;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2Package.EXCEPTION_HANDLER__EXCEPTION_INPUT, oldExceptionInput, exceptionInput));

	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getExceptionTypes() {
		if (exceptionType == null) {
			exceptionType = new EObjectResolvingEList(Classifier.class, this, UML2Package.EXCEPTION_HANDLER__EXCEPTION_TYPE);
		}
		return exceptionType;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
    public Classifier getExceptionType(String name) {
		for (Iterator i = getExceptionTypes().iterator(); i.hasNext(); ) {
			Classifier exceptionType = (Classifier) i.next();
			if (name.equals(exceptionType.getName())) {
				return exceptionType;
			}
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Element basicGetOwner() {
		ExecutableNode protectedNode = getProtectedNode();			
		if (protectedNode != null) {
			return protectedNode;
		}
		return super.basicGetOwner();
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, Class baseClass, NotificationChain msgs) {
		if (featureID >= 0) {
			switch (eDerivedStructuralFeatureID(featureID, baseClass)) {
				case UML2Package.EXCEPTION_HANDLER__EANNOTATIONS:
					return ((InternalEList)getEAnnotations()).basicAdd(otherEnd, msgs);
				case UML2Package.EXCEPTION_HANDLER__PROTECTED_NODE:
					if (eContainer != null)
						msgs = eBasicRemoveFromContainer(msgs);
					return eBasicSetContainer(otherEnd, UML2Package.EXCEPTION_HANDLER__PROTECTED_NODE, msgs);
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
				case UML2Package.EXCEPTION_HANDLER__EANNOTATIONS:
					return ((InternalEList)getEAnnotations()).basicRemove(otherEnd, msgs);
				case UML2Package.EXCEPTION_HANDLER__OWNED_COMMENT:
					return ((InternalEList)getOwnedComments()).basicRemove(otherEnd, msgs);
				case UML2Package.EXCEPTION_HANDLER__PROTECTED_NODE:
					return eBasicSetContainer(null, UML2Package.EXCEPTION_HANDLER__PROTECTED_NODE, msgs);
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
				case UML2Package.EXCEPTION_HANDLER__PROTECTED_NODE:
					return eContainer.eInverseRemove(this, UML2Package.EXECUTABLE_NODE__HANDLER, ExecutableNode.class, msgs);
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
			case UML2Package.EXCEPTION_HANDLER__EANNOTATIONS:
				return getEAnnotations();
			case UML2Package.EXCEPTION_HANDLER__OWNED_ELEMENT:
				return getOwnedElements();
			case UML2Package.EXCEPTION_HANDLER__OWNER:
				if (resolve) return getOwner();
				return basicGetOwner();
			case UML2Package.EXCEPTION_HANDLER__OWNED_COMMENT:
				return getOwnedComments();
			case UML2Package.EXCEPTION_HANDLER__PROTECTED_NODE:
				return getProtectedNode();
			case UML2Package.EXCEPTION_HANDLER__HANDLER_BODY:
				if (resolve) return getHandlerBody();
				return basicGetHandlerBody();
			case UML2Package.EXCEPTION_HANDLER__EXCEPTION_INPUT:
				if (resolve) return getExceptionInput();
				return basicGetExceptionInput();
			case UML2Package.EXCEPTION_HANDLER__EXCEPTION_TYPE:
				return getExceptionTypes();
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
			case UML2Package.EXCEPTION_HANDLER__EANNOTATIONS:
				getEAnnotations().clear();
				getEAnnotations().addAll((Collection)newValue);
				return;
			case UML2Package.EXCEPTION_HANDLER__OWNED_COMMENT:
				getOwnedComments().clear();
				getOwnedComments().addAll((Collection)newValue);
				return;
			case UML2Package.EXCEPTION_HANDLER__PROTECTED_NODE:
				setProtectedNode((ExecutableNode)newValue);
				return;
			case UML2Package.EXCEPTION_HANDLER__HANDLER_BODY:
				setHandlerBody((ExecutableNode)newValue);
				return;
			case UML2Package.EXCEPTION_HANDLER__EXCEPTION_INPUT:
				setExceptionInput((ObjectNode)newValue);
				return;
			case UML2Package.EXCEPTION_HANDLER__EXCEPTION_TYPE:
				getExceptionTypes().clear();
				getExceptionTypes().addAll((Collection)newValue);
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
			case UML2Package.EXCEPTION_HANDLER__EANNOTATIONS:
				getEAnnotations().clear();
				return;
			case UML2Package.EXCEPTION_HANDLER__OWNED_COMMENT:
				getOwnedComments().clear();
				return;
			case UML2Package.EXCEPTION_HANDLER__PROTECTED_NODE:
				setProtectedNode((ExecutableNode)null);
				return;
			case UML2Package.EXCEPTION_HANDLER__HANDLER_BODY:
				setHandlerBody((ExecutableNode)null);
				return;
			case UML2Package.EXCEPTION_HANDLER__EXCEPTION_INPUT:
				setExceptionInput((ObjectNode)null);
				return;
			case UML2Package.EXCEPTION_HANDLER__EXCEPTION_TYPE:
				getExceptionTypes().clear();
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
			case UML2Package.EXCEPTION_HANDLER__EANNOTATIONS:
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UML2Package.EXCEPTION_HANDLER__OWNED_ELEMENT:
				return !getOwnedElements().isEmpty();
			case UML2Package.EXCEPTION_HANDLER__OWNER:
				return basicGetOwner() != null;
			case UML2Package.EXCEPTION_HANDLER__OWNED_COMMENT:
				return ownedComment != null && !ownedComment.isEmpty();
			case UML2Package.EXCEPTION_HANDLER__PROTECTED_NODE:
				return getProtectedNode() != null;
			case UML2Package.EXCEPTION_HANDLER__HANDLER_BODY:
				return handlerBody != null;
			case UML2Package.EXCEPTION_HANDLER__EXCEPTION_INPUT:
				return exceptionInput != null;
			case UML2Package.EXCEPTION_HANDLER__EXCEPTION_TYPE:
				return exceptionType != null && !exceptionType.isEmpty();
		}
		return eDynamicIsSet(eFeature);
	}


} //ExceptionHandlerImpl
