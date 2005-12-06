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
 * $Id: ConnectionPointReferenceImpl.java,v 1.14 2005/12/06 23:18:02 khussey Exp $
 */
package org.eclipse.uml2.impl;

import java.util.Collection;

import java.util.Iterator;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
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
	public static final String copyright = "Copyright (c) IBM Corporation and others."; //$NON-NLS-1$

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
		return UML2Package.Literals.CONNECTION_POINT_REFERENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getEntries() {
		EList entry = (EList)eVirtualGet(UML2Package.CONNECTION_POINT_REFERENCE__ENTRY);
		if (entry == null) {
			eVirtualSet(UML2Package.CONNECTION_POINT_REFERENCE__ENTRY, entry = new EObjectResolvingEList(Pseudostate.class, this, UML2Package.CONNECTION_POINT_REFERENCE__ENTRY));
		}
		return entry;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
    public Pseudostate getEntry(String name) {
		for (Iterator i = getEntries().iterator(); i.hasNext(); ) {
			Pseudostate entry = (Pseudostate) i.next();
			if (name.equals(entry.getName())) {
				return entry;
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
		EList exit = (EList)eVirtualGet(UML2Package.CONNECTION_POINT_REFERENCE__EXIT);
		if (exit == null) {
			eVirtualSet(UML2Package.CONNECTION_POINT_REFERENCE__EXIT, exit = new EObjectResolvingEList(Pseudostate.class, this, UML2Package.CONNECTION_POINT_REFERENCE__EXIT));
		}
		return exit;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
    public Pseudostate getExit(String name) {
		for (Iterator i = getExits().iterator(); i.hasNext(); ) {
			Pseudostate exit = (Pseudostate) i.next();
			if (name.equals(exit.getName())) {
				return exit;
			}
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
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
		return eDynamicGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
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
		eDynamicSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eUnset(int featureID) {
		switch (featureID) {
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
		eDynamicUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case UML2Package.CONNECTION_POINT_REFERENCE__EANNOTATIONS:
				EList eAnnotations = (EList)eVirtualGet(UML2Package.CONNECTION_POINT_REFERENCE__EANNOTATIONS);
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UML2Package.CONNECTION_POINT_REFERENCE__OWNED_ELEMENT:
				return isSetOwnedElements();
			case UML2Package.CONNECTION_POINT_REFERENCE__OWNER:
				return isSetOwner();
			case UML2Package.CONNECTION_POINT_REFERENCE__OWNED_COMMENT:
				EList ownedComment = (EList)eVirtualGet(UML2Package.CONNECTION_POINT_REFERENCE__OWNED_COMMENT);
				return ownedComment != null && !ownedComment.isEmpty();
			case UML2Package.CONNECTION_POINT_REFERENCE__TEMPLATE_BINDING:
				EList templateBinding = (EList)eVirtualGet(UML2Package.CONNECTION_POINT_REFERENCE__TEMPLATE_BINDING);
				return templateBinding != null && !templateBinding.isEmpty();
			case UML2Package.CONNECTION_POINT_REFERENCE__OWNED_TEMPLATE_SIGNATURE:
				return eVirtualGet(UML2Package.CONNECTION_POINT_REFERENCE__OWNED_TEMPLATE_SIGNATURE) != null;
			case UML2Package.CONNECTION_POINT_REFERENCE__NAME:
				String name = (String)eVirtualGet(UML2Package.CONNECTION_POINT_REFERENCE__NAME, NAME_EDEFAULT);
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case UML2Package.CONNECTION_POINT_REFERENCE__QUALIFIED_NAME:
				return QUALIFIED_NAME_EDEFAULT == null ? getQualifiedName() != null : !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case UML2Package.CONNECTION_POINT_REFERENCE__VISIBILITY:
				return eVirtualGet(UML2Package.CONNECTION_POINT_REFERENCE__VISIBILITY, VISIBILITY_EDEFAULT) != VISIBILITY_EDEFAULT;
			case UML2Package.CONNECTION_POINT_REFERENCE__CLIENT_DEPENDENCY:
				EList clientDependency = (EList)eVirtualGet(UML2Package.CONNECTION_POINT_REFERENCE__CLIENT_DEPENDENCY);
				return clientDependency != null && !clientDependency.isEmpty();
			case UML2Package.CONNECTION_POINT_REFERENCE__NAME_EXPRESSION:
				return eVirtualGet(UML2Package.CONNECTION_POINT_REFERENCE__NAME_EXPRESSION) != null;
			case UML2Package.CONNECTION_POINT_REFERENCE__CONTAINER:
				return isSetContainer();
			case UML2Package.CONNECTION_POINT_REFERENCE__OUTGOING:
				EList outgoing = (EList)eVirtualGet(UML2Package.CONNECTION_POINT_REFERENCE__OUTGOING);
				return outgoing != null && !outgoing.isEmpty();
			case UML2Package.CONNECTION_POINT_REFERENCE__INCOMING:
				EList incoming = (EList)eVirtualGet(UML2Package.CONNECTION_POINT_REFERENCE__INCOMING);
				return incoming != null && !incoming.isEmpty();
			case UML2Package.CONNECTION_POINT_REFERENCE__ENTRY:
				EList entry = (EList)eVirtualGet(UML2Package.CONNECTION_POINT_REFERENCE__ENTRY);
				return entry != null && !entry.isEmpty();
			case UML2Package.CONNECTION_POINT_REFERENCE__EXIT:
				EList exit = (EList)eVirtualGet(UML2Package.CONNECTION_POINT_REFERENCE__EXIT);
				return exit != null && !exit.isEmpty();
		}
		return eDynamicIsSet(featureID);
	}


} //ConnectionPointReferenceImpl
