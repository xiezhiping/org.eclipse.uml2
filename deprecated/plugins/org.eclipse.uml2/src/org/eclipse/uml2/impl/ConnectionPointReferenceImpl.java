/*
 * Copyright (c) 2003, 2004 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *
 * $Id: ConnectionPointReferenceImpl.java,v 1.5 2005/03/15 18:44:37 khussey Exp $
 */
package org.eclipse.uml2.impl;

import java.util.Collection;

import java.util.Iterator;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.uml2.ConnectionPointReference;
import org.eclipse.uml2.Pseudostate;
import org.eclipse.uml2.Region;
import org.eclipse.uml2.StringExpression;
import org.eclipse.uml2.TemplateSignature;
import org.eclipse.uml2.UML2Package;
import org.eclipse.uml2.VisibilityKind;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Connection Point Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2.impl.ConnectionPointReferenceImpl#getEntries <em>Entry</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.ConnectionPointReferenceImpl#getExits <em>Exit</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConnectionPointReferenceImpl extends VertexImpl implements ConnectionPointReference {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2003, 2004 IBM Corporation and others."; //$NON-NLS-1$

	/**
	 * The cached value of the '{@link #getEntries() <em>Entry</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntries()
	 * @generated
	 * @ordered
	 */
	protected EList entry = null;

	/**
	 * The cached value of the '{@link #getExits() <em>Exit</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExits()
	 * @generated
	 * @ordered
	 */
	protected EList exit = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConnectionPointReferenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return UML2Package.eINSTANCE.getConnectionPointReference();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getEntries() {
		if (entry == null) {
			entry = new EObjectResolvingEList(Pseudostate.class, this, UML2Package.CONNECTION_POINT_REFERENCE__ENTRY);
		}
		return entry;
	}

    /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
     */
    public Pseudostate getEntry(String unqualifiedName) {
    	for (Iterator i = getEntries().iterator(); i.hasNext(); ) {
    		Pseudostate namedEntry = (Pseudostate) i.next();
    		
    		if (unqualifiedName.equals(namedEntry.getName())) {
    			return namedEntry;
    		}
    	}
    	
    	return null;
    }
      
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getExits() {
		if (exit == null) {
			exit = new EObjectResolvingEList(Pseudostate.class, this, UML2Package.CONNECTION_POINT_REFERENCE__EXIT);
		}
		return exit;
	}

    /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
     */
    public Pseudostate getExit(String unqualifiedName) {
    	for (Iterator i = getExits().iterator(); i.hasNext(); ) {
    		Pseudostate namedExit = (Pseudostate) i.next();
    		
    		if (unqualifiedName.equals(namedExit.getName())) {
    			return namedExit;
    		}
    	}
    	
    	return null;
    }
      
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, Class baseClass, NotificationChain msgs) {
		if (featureID >= 0) {
			switch (eDerivedStructuralFeatureID(featureID, baseClass)) {
				case UML2Package.CONNECTION_POINT_REFERENCE__EANNOTATIONS:
					return ((InternalEList)getEAnnotations()).basicAdd(otherEnd, msgs);
				case UML2Package.CONNECTION_POINT_REFERENCE__TEMPLATE_BINDING:
					return ((InternalEList)getTemplateBindings()).basicAdd(otherEnd, msgs);
				case UML2Package.CONNECTION_POINT_REFERENCE__OWNED_TEMPLATE_SIGNATURE:
					if (ownedTemplateSignature != null)
						msgs = ((InternalEObject)ownedTemplateSignature).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UML2Package.CONNECTION_POINT_REFERENCE__OWNED_TEMPLATE_SIGNATURE, null, msgs);
					return basicSetOwnedTemplateSignature((TemplateSignature)otherEnd, msgs);
				case UML2Package.CONNECTION_POINT_REFERENCE__CLIENT_DEPENDENCY:
					return ((InternalEList)getClientDependencies()).basicAdd(otherEnd, msgs);
				case UML2Package.CONNECTION_POINT_REFERENCE__CONTAINER:
					if (eContainer != null)
						msgs = eBasicRemoveFromContainer(msgs);
					return eBasicSetContainer(otherEnd, UML2Package.CONNECTION_POINT_REFERENCE__CONTAINER, msgs);
				case UML2Package.CONNECTION_POINT_REFERENCE__OUTGOING:
					return ((InternalEList)getOutgoings()).basicAdd(otherEnd, msgs);
				case UML2Package.CONNECTION_POINT_REFERENCE__INCOMING:
					return ((InternalEList)getIncomings()).basicAdd(otherEnd, msgs);
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
				case UML2Package.CONNECTION_POINT_REFERENCE__EANNOTATIONS:
					return ((InternalEList)getEAnnotations()).basicRemove(otherEnd, msgs);
				case UML2Package.CONNECTION_POINT_REFERENCE__OWNED_COMMENT:
					return ((InternalEList)getOwnedComments()).basicRemove(otherEnd, msgs);
				case UML2Package.CONNECTION_POINT_REFERENCE__TEMPLATE_BINDING:
					return ((InternalEList)getTemplateBindings()).basicRemove(otherEnd, msgs);
				case UML2Package.CONNECTION_POINT_REFERENCE__OWNED_TEMPLATE_SIGNATURE:
					return basicSetOwnedTemplateSignature(null, msgs);
				case UML2Package.CONNECTION_POINT_REFERENCE__CLIENT_DEPENDENCY:
					return ((InternalEList)getClientDependencies()).basicRemove(otherEnd, msgs);
				case UML2Package.CONNECTION_POINT_REFERENCE__NAME_EXPRESSION:
					return basicSetNameExpression(null, msgs);
				case UML2Package.CONNECTION_POINT_REFERENCE__CONTAINER:
					return eBasicSetContainer(null, UML2Package.CONNECTION_POINT_REFERENCE__CONTAINER, msgs);
				case UML2Package.CONNECTION_POINT_REFERENCE__OUTGOING:
					return ((InternalEList)getOutgoings()).basicRemove(otherEnd, msgs);
				case UML2Package.CONNECTION_POINT_REFERENCE__INCOMING:
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
				case UML2Package.CONNECTION_POINT_REFERENCE__CONTAINER:
					return eContainer.eInverseRemove(this, UML2Package.REGION__SUBVERTEX, Region.class, msgs);
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
			case UML2Package.CONNECTION_POINT_REFERENCE__EANNOTATIONS:
				return getEAnnotations();
			case UML2Package.CONNECTION_POINT_REFERENCE__OWNED_ELEMENT:
				return getOwnedElements();
			case UML2Package.CONNECTION_POINT_REFERENCE__OWNER:
				if (resolve) return getOwner();
				return basicGetOwner();
			case UML2Package.CONNECTION_POINT_REFERENCE__OWNED_COMMENT:
				return getOwnedComments();
			case UML2Package.CONNECTION_POINT_REFERENCE__TEMPLATE_BINDING:
				return getTemplateBindings();
			case UML2Package.CONNECTION_POINT_REFERENCE__OWNED_TEMPLATE_SIGNATURE:
				return getOwnedTemplateSignature();
			case UML2Package.CONNECTION_POINT_REFERENCE__NAME:
				return getName();
			case UML2Package.CONNECTION_POINT_REFERENCE__QUALIFIED_NAME:
				return getQualifiedName();
			case UML2Package.CONNECTION_POINT_REFERENCE__VISIBILITY:
				return getVisibility();
			case UML2Package.CONNECTION_POINT_REFERENCE__CLIENT_DEPENDENCY:
				return getClientDependencies();
			case UML2Package.CONNECTION_POINT_REFERENCE__NAME_EXPRESSION:
				return getNameExpression();
			case UML2Package.CONNECTION_POINT_REFERENCE__CONTAINER:
				return getContainer();
			case UML2Package.CONNECTION_POINT_REFERENCE__OUTGOING:
				return getOutgoings();
			case UML2Package.CONNECTION_POINT_REFERENCE__INCOMING:
				return getIncomings();
			case UML2Package.CONNECTION_POINT_REFERENCE__ENTRY:
				return getEntries();
			case UML2Package.CONNECTION_POINT_REFERENCE__EXIT:
				return getExits();
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
			case UML2Package.CONNECTION_POINT_REFERENCE__EANNOTATIONS:
				getEAnnotations().clear();
				getEAnnotations().addAll((Collection)newValue);
				return;
			case UML2Package.CONNECTION_POINT_REFERENCE__OWNED_COMMENT:
				getOwnedComments().clear();
				getOwnedComments().addAll((Collection)newValue);
				return;
			case UML2Package.CONNECTION_POINT_REFERENCE__TEMPLATE_BINDING:
				getTemplateBindings().clear();
				getTemplateBindings().addAll((Collection)newValue);
				return;
			case UML2Package.CONNECTION_POINT_REFERENCE__OWNED_TEMPLATE_SIGNATURE:
				setOwnedTemplateSignature((TemplateSignature)newValue);
				return;
			case UML2Package.CONNECTION_POINT_REFERENCE__NAME:
				setName((String)newValue);
				return;
			case UML2Package.CONNECTION_POINT_REFERENCE__VISIBILITY:
				setVisibility((VisibilityKind)newValue);
				return;
			case UML2Package.CONNECTION_POINT_REFERENCE__CLIENT_DEPENDENCY:
				getClientDependencies().clear();
				getClientDependencies().addAll((Collection)newValue);
				return;
			case UML2Package.CONNECTION_POINT_REFERENCE__NAME_EXPRESSION:
				setNameExpression((StringExpression)newValue);
				return;
			case UML2Package.CONNECTION_POINT_REFERENCE__CONTAINER:
				setContainer((Region)newValue);
				return;
			case UML2Package.CONNECTION_POINT_REFERENCE__OUTGOING:
				getOutgoings().clear();
				getOutgoings().addAll((Collection)newValue);
				return;
			case UML2Package.CONNECTION_POINT_REFERENCE__INCOMING:
				getIncomings().clear();
				getIncomings().addAll((Collection)newValue);
				return;
			case UML2Package.CONNECTION_POINT_REFERENCE__ENTRY:
				getEntries().clear();
				getEntries().addAll((Collection)newValue);
				return;
			case UML2Package.CONNECTION_POINT_REFERENCE__EXIT:
				getExits().clear();
				getExits().addAll((Collection)newValue);
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
			case UML2Package.CONNECTION_POINT_REFERENCE__EANNOTATIONS:
				getEAnnotations().clear();
				return;
			case UML2Package.CONNECTION_POINT_REFERENCE__OWNED_COMMENT:
				getOwnedComments().clear();
				return;
			case UML2Package.CONNECTION_POINT_REFERENCE__TEMPLATE_BINDING:
				getTemplateBindings().clear();
				return;
			case UML2Package.CONNECTION_POINT_REFERENCE__OWNED_TEMPLATE_SIGNATURE:
				setOwnedTemplateSignature((TemplateSignature)null);
				return;
			case UML2Package.CONNECTION_POINT_REFERENCE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case UML2Package.CONNECTION_POINT_REFERENCE__VISIBILITY:
				setVisibility(VISIBILITY_EDEFAULT);
				return;
			case UML2Package.CONNECTION_POINT_REFERENCE__CLIENT_DEPENDENCY:
				getClientDependencies().clear();
				return;
			case UML2Package.CONNECTION_POINT_REFERENCE__NAME_EXPRESSION:
				setNameExpression((StringExpression)null);
				return;
			case UML2Package.CONNECTION_POINT_REFERENCE__CONTAINER:
				setContainer((Region)null);
				return;
			case UML2Package.CONNECTION_POINT_REFERENCE__OUTGOING:
				getOutgoings().clear();
				return;
			case UML2Package.CONNECTION_POINT_REFERENCE__INCOMING:
				getIncomings().clear();
				return;
			case UML2Package.CONNECTION_POINT_REFERENCE__ENTRY:
				getEntries().clear();
				return;
			case UML2Package.CONNECTION_POINT_REFERENCE__EXIT:
				getExits().clear();
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
			case UML2Package.CONNECTION_POINT_REFERENCE__EANNOTATIONS:
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UML2Package.CONNECTION_POINT_REFERENCE__OWNED_ELEMENT:
				return !getOwnedElements().isEmpty();
			case UML2Package.CONNECTION_POINT_REFERENCE__OWNER:
				return basicGetOwner() != null;
			case UML2Package.CONNECTION_POINT_REFERENCE__OWNED_COMMENT:
				return ownedComment != null && !ownedComment.isEmpty();
			case UML2Package.CONNECTION_POINT_REFERENCE__TEMPLATE_BINDING:
				return templateBinding != null && !templateBinding.isEmpty();
			case UML2Package.CONNECTION_POINT_REFERENCE__OWNED_TEMPLATE_SIGNATURE:
				return ownedTemplateSignature != null;
			case UML2Package.CONNECTION_POINT_REFERENCE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case UML2Package.CONNECTION_POINT_REFERENCE__QUALIFIED_NAME:
				return QUALIFIED_NAME_EDEFAULT == null ? getQualifiedName() != null : !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case UML2Package.CONNECTION_POINT_REFERENCE__VISIBILITY:
				return visibility != VISIBILITY_EDEFAULT;
			case UML2Package.CONNECTION_POINT_REFERENCE__CLIENT_DEPENDENCY:
				return clientDependency != null && !clientDependency.isEmpty();
			case UML2Package.CONNECTION_POINT_REFERENCE__NAME_EXPRESSION:
				return nameExpression != null;
			case UML2Package.CONNECTION_POINT_REFERENCE__CONTAINER:
				return getContainer() != null;
			case UML2Package.CONNECTION_POINT_REFERENCE__OUTGOING:
				return outgoing != null && !outgoing.isEmpty();
			case UML2Package.CONNECTION_POINT_REFERENCE__INCOMING:
				return incoming != null && !incoming.isEmpty();
			case UML2Package.CONNECTION_POINT_REFERENCE__ENTRY:
				return entry != null && !entry.isEmpty();
			case UML2Package.CONNECTION_POINT_REFERENCE__EXIT:
				return exit != null && !exit.isEmpty();
		}
		return eDynamicIsSet(eFeature);
	}

} //ConnectionPointReferenceImpl
