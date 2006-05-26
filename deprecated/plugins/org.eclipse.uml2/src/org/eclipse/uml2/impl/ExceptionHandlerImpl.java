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
 * $Id: ExceptionHandlerImpl.java,v 1.17 2006/05/26 18:16:44 khussey Exp $
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
 *   <li>{@link org.eclipse.uml2.impl.ExceptionHandlerImpl#getOwner <em>Owner</em>}</li>
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
	protected EList exceptionTypes = null;

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
		return UML2Package.Literals.EXCEPTION_HANDLER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Element getOwner() {
		Element owner = basicGetOwner();
		return owner != null && owner.eIsProxy() ? (Element)eResolveProxy((InternalEObject)owner) : owner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExecutableNode getProtectedNode() {
		if (eContainerFeatureID != UML2Package.EXCEPTION_HANDLER__PROTECTED_NODE) return null;
		return (ExecutableNode)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProtectedNode(ExecutableNode newProtectedNode, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newProtectedNode, UML2Package.EXCEPTION_HANDLER__PROTECTED_NODE, msgs);

		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProtectedNode(ExecutableNode newProtectedNode) {
		if (newProtectedNode != eInternalContainer() || (eContainerFeatureID != UML2Package.EXCEPTION_HANDLER__PROTECTED_NODE && newProtectedNode != null)) {
			if (EcoreUtil.isAncestor(this, newProtectedNode))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString()); //$NON-NLS-1$
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newProtectedNode != null)
				msgs = ((InternalEObject)newProtectedNode).eInverseAdd(this, UML2Package.EXECUTABLE_NODE__HANDLER, ExecutableNode.class, msgs);
			msgs = basicSetProtectedNode(newProtectedNode, msgs);
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
			InternalEObject oldHandlerBody = (InternalEObject)handlerBody;
			handlerBody = (ExecutableNode)eResolveProxy(oldHandlerBody);
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
			InternalEObject oldExceptionInput = (InternalEObject)exceptionInput;
			exceptionInput = (ObjectNode)eResolveProxy(oldExceptionInput);
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
		if (exceptionTypes == null) {
			exceptionTypes = new EObjectResolvingEList(Classifier.class, this, UML2Package.EXCEPTION_HANDLER__EXCEPTION_TYPE);
		}
		return exceptionTypes;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
    public Classifier getExceptionType(String name) {
		return getExceptionType(name, false, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Classifier getExceptionType(String name, boolean ignoreCase, EClass eClass) {
		exceptionTypeLoop: for (Iterator i = getExceptionTypes().iterator(); i.hasNext(); ) {
			Classifier exceptionType = (Classifier) i.next();
			if (eClass != null && !eClass.isInstance(exceptionType))
				continue exceptionTypeLoop;
			if (name != null && !(ignoreCase ? name.equalsIgnoreCase(exceptionType.getName()) : name.equals(exceptionType.getName())))
				continue exceptionTypeLoop;
			return exceptionType;
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
			case UML2Package.EXCEPTION_HANDLER__EANNOTATIONS:
				return ((InternalEList)getEAnnotations()).basicAdd(otherEnd, msgs);
			case UML2Package.EXCEPTION_HANDLER__PROTECTED_NODE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetProtectedNode((ExecutableNode)otherEnd, msgs);
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
			case UML2Package.EXCEPTION_HANDLER__EANNOTATIONS:
				return ((InternalEList)getEAnnotations()).basicRemove(otherEnd, msgs);
			case UML2Package.EXCEPTION_HANDLER__OWNED_COMMENT:
				return ((InternalEList)getOwnedComments()).basicRemove(otherEnd, msgs);
			case UML2Package.EXCEPTION_HANDLER__PROTECTED_NODE:
				return basicSetProtectedNode(null, msgs);
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
			case UML2Package.EXCEPTION_HANDLER__PROTECTED_NODE:
				return eInternalContainer().eInverseRemove(this, UML2Package.EXECUTABLE_NODE__HANDLER, ExecutableNode.class, msgs);
		}
		return eDynamicBasicRemoveFromContainer(msgs);
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
	public boolean isSetOwner() {
		return super.isSetOwner()
			|| eIsSet(UML2Package.EXCEPTION_HANDLER__PROTECTED_NODE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
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
		return eDynamicGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
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
		eDynamicSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eUnset(int featureID) {
		switch (featureID) {
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
		eDynamicUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case UML2Package.EXCEPTION_HANDLER__EANNOTATIONS:
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UML2Package.EXCEPTION_HANDLER__OWNED_ELEMENT:
				return isSetOwnedElements();
			case UML2Package.EXCEPTION_HANDLER__OWNER:
				return isSetOwner();
			case UML2Package.EXCEPTION_HANDLER__OWNED_COMMENT:
				return ownedComments != null && !ownedComments.isEmpty();
			case UML2Package.EXCEPTION_HANDLER__PROTECTED_NODE:
				return getProtectedNode() != null;
			case UML2Package.EXCEPTION_HANDLER__HANDLER_BODY:
				return handlerBody != null;
			case UML2Package.EXCEPTION_HANDLER__EXCEPTION_INPUT:
				return exceptionInput != null;
			case UML2Package.EXCEPTION_HANDLER__EXCEPTION_TYPE:
				return exceptionTypes != null && !exceptionTypes.isEmpty();
		}
		return eDynamicIsSet(featureID);
	}


} //ExceptionHandlerImpl
