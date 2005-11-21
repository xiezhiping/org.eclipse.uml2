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
 * $Id: VertexImpl.java,v 1.13 2005/11/21 21:48:01 khussey Exp $
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
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.uml2.Element;
import org.eclipse.uml2.Region;
import org.eclipse.uml2.StringExpression;
import org.eclipse.uml2.TemplateSignature;
import org.eclipse.uml2.Transition;
import org.eclipse.uml2.UML2Package;
import org.eclipse.uml2.Vertex;
import org.eclipse.uml2.VisibilityKind;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Vertex</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2.impl.VertexImpl#getContainer <em>Container</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.VertexImpl#getOutgoings <em>Outgoing</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.VertexImpl#getIncomings <em>Incoming</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class VertexImpl extends NamedElementImpl implements Vertex {
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
	protected VertexImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return UML2Package.eINSTANCE.getVertex();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Region getContainer() {
		if (eContainerFeatureID != UML2Package.VERTEX__CONTAINER) return null;
		return (Region)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContainer(Region newContainer) {
		if (newContainer != eInternalContainer() || (eContainerFeatureID != UML2Package.VERTEX__CONTAINER && newContainer != null)) {
			if (EcoreUtil.isAncestor(this, newContainer))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString()); //$NON-NLS-1$
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newContainer != null)
				msgs = ((InternalEObject)newContainer).eInverseAdd(this, UML2Package.REGION__SUBVERTEX, Region.class, msgs);
			msgs = eBasicSetContainer((InternalEObject)newContainer, UML2Package.VERTEX__CONTAINER, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2Package.VERTEX__CONTAINER, newContainer, newContainer));

	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetContainer() {
		return getContainer() != null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getOutgoings() {
		EList outgoing = (EList)eVirtualGet(UML2Package.VERTEX__OUTGOING);
		if (outgoing == null) {
			eVirtualSet(UML2Package.VERTEX__OUTGOING, outgoing = new EObjectWithInverseResolvingEList(Transition.class, this, UML2Package.VERTEX__OUTGOING, UML2Package.TRANSITION__SOURCE));
		}
		return outgoing;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
    public Transition getOutgoing(String name) {
		for (Iterator i = getOutgoings().iterator(); i.hasNext(); ) {
			Transition outgoing = (Transition) i.next();
			if (name.equals(outgoing.getName())) {
				return outgoing;
			}
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getIncomings() {
		EList incoming = (EList)eVirtualGet(UML2Package.VERTEX__INCOMING);
		if (incoming == null) {
			eVirtualSet(UML2Package.VERTEX__INCOMING, incoming = new EObjectWithInverseResolvingEList(Transition.class, this, UML2Package.VERTEX__INCOMING, UML2Package.TRANSITION__TARGET));
		}
		return incoming;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
    public Transition getIncoming(String name) {
		for (Iterator i = getIncomings().iterator(); i.hasNext(); ) {
			Transition incoming = (Transition) i.next();
			if (name.equals(incoming.getName())) {
				return incoming;
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
		return getOwner();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwner(Element newOwner, NotificationChain msgs) {
		if (newOwner != null && !(newOwner instanceof Region)) {
			throw new IllegalArgumentException(String.valueOf(newOwner));
		}
		setContainer((Region) newOwner);
		return msgs;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOwner() {
  		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, Class baseClass, NotificationChain msgs) {
		if (featureID >= 0) {
			switch (eDerivedStructuralFeatureID(featureID, baseClass)) {
				case UML2Package.VERTEX__EANNOTATIONS:
					return ((InternalEList)getEAnnotations()).basicAdd(otherEnd, msgs);
				case UML2Package.VERTEX__TEMPLATE_BINDING:
					return ((InternalEList)getTemplateBindings()).basicAdd(otherEnd, msgs);
				case UML2Package.VERTEX__OWNED_TEMPLATE_SIGNATURE:
					TemplateSignature ownedTemplateSignature = (TemplateSignature)eVirtualGet(UML2Package.VERTEX__OWNED_TEMPLATE_SIGNATURE);
					if (ownedTemplateSignature != null)
						msgs = ((InternalEObject)ownedTemplateSignature).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UML2Package.VERTEX__OWNED_TEMPLATE_SIGNATURE, null, msgs);
					return basicSetOwnedTemplateSignature((TemplateSignature)otherEnd, msgs);
				case UML2Package.VERTEX__CLIENT_DEPENDENCY:
					return ((InternalEList)getClientDependencies()).basicAdd(otherEnd, msgs);
				case UML2Package.VERTEX__CONTAINER:
					if (eInternalContainer() != null)
						msgs = eBasicRemoveFromContainer(msgs);
					return eBasicSetContainer(otherEnd, UML2Package.VERTEX__CONTAINER, msgs);
				case UML2Package.VERTEX__OUTGOING:
					return ((InternalEList)getOutgoings()).basicAdd(otherEnd, msgs);
				case UML2Package.VERTEX__INCOMING:
					return ((InternalEList)getIncomings()).basicAdd(otherEnd, msgs);
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
				case UML2Package.VERTEX__EANNOTATIONS:
					return ((InternalEList)getEAnnotations()).basicRemove(otherEnd, msgs);
				case UML2Package.VERTEX__OWNED_COMMENT:
					return ((InternalEList)getOwnedComments()).basicRemove(otherEnd, msgs);
				case UML2Package.VERTEX__TEMPLATE_BINDING:
					return ((InternalEList)getTemplateBindings()).basicRemove(otherEnd, msgs);
				case UML2Package.VERTEX__OWNED_TEMPLATE_SIGNATURE:
					return basicSetOwnedTemplateSignature(null, msgs);
				case UML2Package.VERTEX__CLIENT_DEPENDENCY:
					return ((InternalEList)getClientDependencies()).basicRemove(otherEnd, msgs);
				case UML2Package.VERTEX__NAME_EXPRESSION:
					return basicSetNameExpression(null, msgs);
				case UML2Package.VERTEX__CONTAINER:
					return eBasicSetContainer(null, UML2Package.VERTEX__CONTAINER, msgs);
				case UML2Package.VERTEX__OUTGOING:
					return ((InternalEList)getOutgoings()).basicRemove(otherEnd, msgs);
				case UML2Package.VERTEX__INCOMING:
					return ((InternalEList)getIncomings()).basicRemove(otherEnd, msgs);
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
				case UML2Package.VERTEX__CONTAINER:
					return eInternalContainer().eInverseRemove(this, UML2Package.REGION__SUBVERTEX, Region.class, msgs);
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
			case UML2Package.VERTEX__EANNOTATIONS:
				return getEAnnotations();
			case UML2Package.VERTEX__OWNED_ELEMENT:
				return getOwnedElements();
			case UML2Package.VERTEX__OWNER:
				if (resolve) return getOwner();
				return basicGetOwner();
			case UML2Package.VERTEX__OWNED_COMMENT:
				return getOwnedComments();
			case UML2Package.VERTEX__TEMPLATE_BINDING:
				return getTemplateBindings();
			case UML2Package.VERTEX__OWNED_TEMPLATE_SIGNATURE:
				return getOwnedTemplateSignature();
			case UML2Package.VERTEX__NAME:
				return getName();
			case UML2Package.VERTEX__QUALIFIED_NAME:
				return getQualifiedName();
			case UML2Package.VERTEX__VISIBILITY:
				return getVisibility();
			case UML2Package.VERTEX__CLIENT_DEPENDENCY:
				return getClientDependencies();
			case UML2Package.VERTEX__NAME_EXPRESSION:
				return getNameExpression();
			case UML2Package.VERTEX__CONTAINER:
				return getContainer();
			case UML2Package.VERTEX__OUTGOING:
				return getOutgoings();
			case UML2Package.VERTEX__INCOMING:
				return getIncomings();
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
			case UML2Package.VERTEX__EANNOTATIONS:
				getEAnnotations().clear();
				getEAnnotations().addAll((Collection)newValue);
				return;
			case UML2Package.VERTEX__OWNED_COMMENT:
				getOwnedComments().clear();
				getOwnedComments().addAll((Collection)newValue);
				return;
			case UML2Package.VERTEX__TEMPLATE_BINDING:
				getTemplateBindings().clear();
				getTemplateBindings().addAll((Collection)newValue);
				return;
			case UML2Package.VERTEX__OWNED_TEMPLATE_SIGNATURE:
				setOwnedTemplateSignature((TemplateSignature)newValue);
				return;
			case UML2Package.VERTEX__NAME:
				setName((String)newValue);
				return;
			case UML2Package.VERTEX__VISIBILITY:
				setVisibility((VisibilityKind)newValue);
				return;
			case UML2Package.VERTEX__CLIENT_DEPENDENCY:
				getClientDependencies().clear();
				getClientDependencies().addAll((Collection)newValue);
				return;
			case UML2Package.VERTEX__NAME_EXPRESSION:
				setNameExpression((StringExpression)newValue);
				return;
			case UML2Package.VERTEX__CONTAINER:
				setContainer((Region)newValue);
				return;
			case UML2Package.VERTEX__OUTGOING:
				getOutgoings().clear();
				getOutgoings().addAll((Collection)newValue);
				return;
			case UML2Package.VERTEX__INCOMING:
				getIncomings().clear();
				getIncomings().addAll((Collection)newValue);
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
			case UML2Package.VERTEX__EANNOTATIONS:
				getEAnnotations().clear();
				return;
			case UML2Package.VERTEX__OWNED_COMMENT:
				getOwnedComments().clear();
				return;
			case UML2Package.VERTEX__TEMPLATE_BINDING:
				getTemplateBindings().clear();
				return;
			case UML2Package.VERTEX__OWNED_TEMPLATE_SIGNATURE:
				setOwnedTemplateSignature((TemplateSignature)null);
				return;
			case UML2Package.VERTEX__NAME:
				setName(NAME_EDEFAULT);
				return;
			case UML2Package.VERTEX__VISIBILITY:
				setVisibility(VISIBILITY_EDEFAULT);
				return;
			case UML2Package.VERTEX__CLIENT_DEPENDENCY:
				getClientDependencies().clear();
				return;
			case UML2Package.VERTEX__NAME_EXPRESSION:
				setNameExpression((StringExpression)null);
				return;
			case UML2Package.VERTEX__CONTAINER:
				setContainer((Region)null);
				return;
			case UML2Package.VERTEX__OUTGOING:
				getOutgoings().clear();
				return;
			case UML2Package.VERTEX__INCOMING:
				getIncomings().clear();
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
			case UML2Package.VERTEX__EANNOTATIONS:
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UML2Package.VERTEX__OWNED_ELEMENT:
				return isSetOwnedElements();
			case UML2Package.VERTEX__OWNER:
				return isSetOwner();
			case UML2Package.VERTEX__OWNED_COMMENT:
				EList ownedComment = (EList)eVirtualGet(UML2Package.VERTEX__OWNED_COMMENT);
				return ownedComment != null && !ownedComment.isEmpty();
			case UML2Package.VERTEX__TEMPLATE_BINDING:
				EList templateBinding = (EList)eVirtualGet(UML2Package.VERTEX__TEMPLATE_BINDING);
				return templateBinding != null && !templateBinding.isEmpty();
			case UML2Package.VERTEX__OWNED_TEMPLATE_SIGNATURE:
				return eVirtualGet(UML2Package.VERTEX__OWNED_TEMPLATE_SIGNATURE) != null;
			case UML2Package.VERTEX__NAME:
				String name = eVirtualIsSet(UML2Package.VERTEX__NAME) ? (String)eVirtualGet(UML2Package.VERTEX__NAME) : NAME_EDEFAULT;
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case UML2Package.VERTEX__QUALIFIED_NAME:
				return QUALIFIED_NAME_EDEFAULT == null ? getQualifiedName() != null : !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case UML2Package.VERTEX__VISIBILITY:
				return eVirtualIsSet(UML2Package.VERTEX__VISIBILITY) && eVirtualGet(UML2Package.VERTEX__VISIBILITY) != VISIBILITY_EDEFAULT;
			case UML2Package.VERTEX__CLIENT_DEPENDENCY:
				EList clientDependency = (EList)eVirtualGet(UML2Package.VERTEX__CLIENT_DEPENDENCY);
				return clientDependency != null && !clientDependency.isEmpty();
			case UML2Package.VERTEX__NAME_EXPRESSION:
				return eVirtualGet(UML2Package.VERTEX__NAME_EXPRESSION) != null;
			case UML2Package.VERTEX__CONTAINER:
				return isSetContainer();
			case UML2Package.VERTEX__OUTGOING:
				EList outgoing = (EList)eVirtualGet(UML2Package.VERTEX__OUTGOING);
				return outgoing != null && !outgoing.isEmpty();
			case UML2Package.VERTEX__INCOMING:
				EList incoming = (EList)eVirtualGet(UML2Package.VERTEX__INCOMING);
				return incoming != null && !incoming.isEmpty();
		}
		return eDynamicIsSet(eFeature);
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Element getOwner() {
		return getContainer();
	}

} //VertexImpl
