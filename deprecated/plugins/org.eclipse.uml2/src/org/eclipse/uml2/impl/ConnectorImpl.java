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
 * $Id: ConnectorImpl.java,v 1.15 2005/11/14 17:31:08 khussey Exp $
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

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.uml2.Association;
import org.eclipse.uml2.Behavior;
import org.eclipse.uml2.Connector;
import org.eclipse.uml2.ConnectorEnd;
import org.eclipse.uml2.ConnectorKind;
import org.eclipse.uml2.Element;
import org.eclipse.uml2.StringExpression;
import org.eclipse.uml2.TemplateSignature;
import org.eclipse.uml2.UML2Factory;
import org.eclipse.uml2.UML2Package;
import org.eclipse.uml2.VisibilityKind;

import org.eclipse.uml2.common.util.DerivedUnionEObjectEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Connector</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2.impl.ConnectorImpl#getOwnedElements <em>Owned Element</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.ConnectorImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.ConnectorImpl#getRedefinedConnectors <em>Redefined Connector</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.ConnectorImpl#getEnds <em>End</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.ConnectorImpl#getKind <em>Kind</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.ConnectorImpl#getContracts <em>Contract</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConnectorImpl extends FeatureImpl implements Connector {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) IBM Corporation and others."; //$NON-NLS-1$

	/**
	 * The default value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected static final ConnectorKind KIND_EDEFAULT = ConnectorKind.ASSEMBLY_LITERAL;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConnectorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return UML2Package.eINSTANCE.getConnector();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getOwnedElements() {
		EList ownedElement = (EList)eVirtualGet(UML2Package.CONNECTOR__OWNED_ELEMENT);
		if (ownedElement == null) {
			eVirtualSet(UML2Package.CONNECTOR__OWNED_ELEMENT, ownedElement = new DerivedUnionEObjectEList(Element.class, this, UML2Package.CONNECTOR__OWNED_ELEMENT, new EStructuralFeature[] {UML2Package.eINSTANCE.getElement_OwnedComment(), UML2Package.eINSTANCE.getTemplateableElement_TemplateBinding(), UML2Package.eINSTANCE.getTemplateableElement_OwnedTemplateSignature(), UML2Package.eINSTANCE.getNamedElement_NameExpression(), UML2Package.eINSTANCE.getConnector_End()}));
		}
		return ownedElement;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOwnedElements() {
		return super.isSetOwnedElements()
			|| eIsSet(UML2Package.eINSTANCE.getConnector_End());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectorKind getKind() {
		ConnectorKind kind = (ConnectorKind)eVirtualGet(UML2Package.CONNECTOR__KIND);
		return kind == null ? KIND_EDEFAULT : kind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKind(ConnectorKind newKind) {
		ConnectorKind kind = newKind == null ? KIND_EDEFAULT : newKind;
		Object oldKind = eVirtualSet(UML2Package.CONNECTOR__KIND, kind);
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2Package.CONNECTOR__KIND, oldKind == EVIRTUAL_NO_VALUE ? KIND_EDEFAULT : oldKind, kind));

	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Association getType() {
		Association type = (Association)eVirtualGet(UML2Package.CONNECTOR__TYPE);
		if (type != null && type.eIsProxy()) {
			Association oldType = type;
			type = (Association)eResolveProxy((InternalEObject)type);
			if (type != oldType) {
				eVirtualSet(UML2Package.CONNECTOR__TYPE, type);
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UML2Package.CONNECTOR__TYPE, oldType, type));
			}
		}
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Association basicGetType() {
		return (Association)eVirtualGet(UML2Package.CONNECTOR__TYPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(Association newType) {
		Association type = newType;
		Object oldType = eVirtualSet(UML2Package.CONNECTOR__TYPE, type);
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2Package.CONNECTOR__TYPE, oldType == EVIRTUAL_NO_VALUE ? null : oldType, type));

	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getRedefinedConnectors() {
		EList redefinedConnector = (EList)eVirtualGet(UML2Package.CONNECTOR__REDEFINED_CONNECTOR);
		if (redefinedConnector == null) {
			eVirtualSet(UML2Package.CONNECTOR__REDEFINED_CONNECTOR, redefinedConnector = new EObjectResolvingEList(Connector.class, this, UML2Package.CONNECTOR__REDEFINED_CONNECTOR));
		}
		return redefinedConnector;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
    public Connector getRedefinedConnector(String name) {
		for (Iterator i = getRedefinedConnectors().iterator(); i.hasNext(); ) {
			Connector redefinedConnector = (Connector) i.next();
			if (name.equals(redefinedConnector.getName())) {
				return redefinedConnector;
			}
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getEnds() {
		EList end = (EList)eVirtualGet(UML2Package.CONNECTOR__END);
		if (end == null) {
			eVirtualSet(UML2Package.CONNECTOR__END, end = new EObjectContainmentEList(ConnectorEnd.class, this, UML2Package.CONNECTOR__END));
		}
		return end;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 * @deprecated Use #createEnd() instead.
	 */
	public ConnectorEnd createEnd(EClass eClass) {
		ConnectorEnd newEnd = (ConnectorEnd) eClass.getEPackage().getEFactoryInstance().create(eClass);
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, 0, UML2Package.CONNECTOR__END, null, newEnd));
		}
		getEnds().add(newEnd);
		return newEnd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectorEnd createEnd() {
		ConnectorEnd newEnd = UML2Factory.eINSTANCE.createConnectorEnd();
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, 0, UML2Package.CONNECTOR__END, null, newEnd));
		}
		getEnds().add(newEnd);
		return newEnd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getContracts() {
		EList contract = (EList)eVirtualGet(UML2Package.CONNECTOR__CONTRACT);
		if (contract == null) {
			eVirtualSet(UML2Package.CONNECTOR__CONTRACT, contract = new EObjectResolvingEList(Behavior.class, this, UML2Package.CONNECTOR__CONTRACT));
		}
		return contract;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
    public Behavior getContract(String name) {
		for (Iterator i = getContracts().iterator(); i.hasNext(); ) {
			Behavior contract = (Behavior) i.next();
			if (name.equals(contract.getName())) {
				return contract;
			}
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, Class baseClass, NotificationChain msgs) {
		if (featureID >= 0) {
			switch (eDerivedStructuralFeatureID(featureID, baseClass)) {
				case UML2Package.CONNECTOR__EANNOTATIONS:
					return ((InternalEList)getEAnnotations()).basicRemove(otherEnd, msgs);
				case UML2Package.CONNECTOR__OWNED_COMMENT:
					return ((InternalEList)getOwnedComments()).basicRemove(otherEnd, msgs);
				case UML2Package.CONNECTOR__TEMPLATE_BINDING:
					return ((InternalEList)getTemplateBindings()).basicRemove(otherEnd, msgs);
				case UML2Package.CONNECTOR__OWNED_TEMPLATE_SIGNATURE:
					return basicSetOwnedTemplateSignature(null, msgs);
				case UML2Package.CONNECTOR__CLIENT_DEPENDENCY:
					return ((InternalEList)getClientDependencies()).basicRemove(otherEnd, msgs);
				case UML2Package.CONNECTOR__NAME_EXPRESSION:
					return basicSetNameExpression(null, msgs);
				case UML2Package.CONNECTOR__END:
					return ((InternalEList)getEnds()).basicRemove(otherEnd, msgs);
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
	public Object eGet(EStructuralFeature eFeature, boolean resolve) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case UML2Package.CONNECTOR__EANNOTATIONS:
				return getEAnnotations();
			case UML2Package.CONNECTOR__OWNED_ELEMENT:
				return getOwnedElements();
			case UML2Package.CONNECTOR__OWNER:
				if (resolve) return getOwner();
				return basicGetOwner();
			case UML2Package.CONNECTOR__OWNED_COMMENT:
				return getOwnedComments();
			case UML2Package.CONNECTOR__TEMPLATE_BINDING:
				return getTemplateBindings();
			case UML2Package.CONNECTOR__OWNED_TEMPLATE_SIGNATURE:
				return getOwnedTemplateSignature();
			case UML2Package.CONNECTOR__NAME:
				return getName();
			case UML2Package.CONNECTOR__QUALIFIED_NAME:
				return getQualifiedName();
			case UML2Package.CONNECTOR__VISIBILITY:
				return getVisibility();
			case UML2Package.CONNECTOR__CLIENT_DEPENDENCY:
				return getClientDependencies();
			case UML2Package.CONNECTOR__NAME_EXPRESSION:
				return getNameExpression();
			case UML2Package.CONNECTOR__REDEFINITION_CONTEXT:
				return getRedefinitionContexts();
			case UML2Package.CONNECTOR__IS_LEAF:
				return isLeaf() ? Boolean.TRUE : Boolean.FALSE;
			case UML2Package.CONNECTOR__FEATURING_CLASSIFIER:
				return getFeaturingClassifiers();
			case UML2Package.CONNECTOR__IS_STATIC:
				return isStatic() ? Boolean.TRUE : Boolean.FALSE;
			case UML2Package.CONNECTOR__TYPE:
				if (resolve) return getType();
				return basicGetType();
			case UML2Package.CONNECTOR__REDEFINED_CONNECTOR:
				return getRedefinedConnectors();
			case UML2Package.CONNECTOR__END:
				return getEnds();
			case UML2Package.CONNECTOR__KIND:
				return getKind();
			case UML2Package.CONNECTOR__CONTRACT:
				return getContracts();
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
			case UML2Package.CONNECTOR__EANNOTATIONS:
				getEAnnotations().clear();
				getEAnnotations().addAll((Collection)newValue);
				return;
			case UML2Package.CONNECTOR__OWNED_COMMENT:
				getOwnedComments().clear();
				getOwnedComments().addAll((Collection)newValue);
				return;
			case UML2Package.CONNECTOR__TEMPLATE_BINDING:
				getTemplateBindings().clear();
				getTemplateBindings().addAll((Collection)newValue);
				return;
			case UML2Package.CONNECTOR__OWNED_TEMPLATE_SIGNATURE:
				setOwnedTemplateSignature((TemplateSignature)newValue);
				return;
			case UML2Package.CONNECTOR__NAME:
				setName((String)newValue);
				return;
			case UML2Package.CONNECTOR__VISIBILITY:
				setVisibility((VisibilityKind)newValue);
				return;
			case UML2Package.CONNECTOR__CLIENT_DEPENDENCY:
				getClientDependencies().clear();
				getClientDependencies().addAll((Collection)newValue);
				return;
			case UML2Package.CONNECTOR__NAME_EXPRESSION:
				setNameExpression((StringExpression)newValue);
				return;
			case UML2Package.CONNECTOR__IS_LEAF:
				setIsLeaf(((Boolean)newValue).booleanValue());
				return;
			case UML2Package.CONNECTOR__IS_STATIC:
				setIsStatic(((Boolean)newValue).booleanValue());
				return;
			case UML2Package.CONNECTOR__TYPE:
				setType((Association)newValue);
				return;
			case UML2Package.CONNECTOR__REDEFINED_CONNECTOR:
				getRedefinedConnectors().clear();
				getRedefinedConnectors().addAll((Collection)newValue);
				return;
			case UML2Package.CONNECTOR__END:
				getEnds().clear();
				getEnds().addAll((Collection)newValue);
				return;
			case UML2Package.CONNECTOR__KIND:
				setKind((ConnectorKind)newValue);
				return;
			case UML2Package.CONNECTOR__CONTRACT:
				getContracts().clear();
				getContracts().addAll((Collection)newValue);
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
			case UML2Package.CONNECTOR__EANNOTATIONS:
				getEAnnotations().clear();
				return;
			case UML2Package.CONNECTOR__OWNED_COMMENT:
				getOwnedComments().clear();
				return;
			case UML2Package.CONNECTOR__TEMPLATE_BINDING:
				getTemplateBindings().clear();
				return;
			case UML2Package.CONNECTOR__OWNED_TEMPLATE_SIGNATURE:
				setOwnedTemplateSignature((TemplateSignature)null);
				return;
			case UML2Package.CONNECTOR__NAME:
				setName(NAME_EDEFAULT);
				return;
			case UML2Package.CONNECTOR__VISIBILITY:
				setVisibility(VISIBILITY_EDEFAULT);
				return;
			case UML2Package.CONNECTOR__CLIENT_DEPENDENCY:
				getClientDependencies().clear();
				return;
			case UML2Package.CONNECTOR__NAME_EXPRESSION:
				setNameExpression((StringExpression)null);
				return;
			case UML2Package.CONNECTOR__IS_LEAF:
				setIsLeaf(IS_LEAF_EDEFAULT);
				return;
			case UML2Package.CONNECTOR__IS_STATIC:
				setIsStatic(IS_STATIC_EDEFAULT);
				return;
			case UML2Package.CONNECTOR__TYPE:
				setType((Association)null);
				return;
			case UML2Package.CONNECTOR__REDEFINED_CONNECTOR:
				getRedefinedConnectors().clear();
				return;
			case UML2Package.CONNECTOR__END:
				getEnds().clear();
				return;
			case UML2Package.CONNECTOR__KIND:
				setKind(KIND_EDEFAULT);
				return;
			case UML2Package.CONNECTOR__CONTRACT:
				getContracts().clear();
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
			case UML2Package.CONNECTOR__EANNOTATIONS:
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UML2Package.CONNECTOR__OWNED_ELEMENT:
				return isSetOwnedElements();
			case UML2Package.CONNECTOR__OWNER:
				return isSetOwner();
			case UML2Package.CONNECTOR__OWNED_COMMENT:
				EList ownedComment = (EList)eVirtualGet(UML2Package.CONNECTOR__OWNED_COMMENT);
				return ownedComment != null && !ownedComment.isEmpty();
			case UML2Package.CONNECTOR__TEMPLATE_BINDING:
				EList templateBinding = (EList)eVirtualGet(UML2Package.CONNECTOR__TEMPLATE_BINDING);
				return templateBinding != null && !templateBinding.isEmpty();
			case UML2Package.CONNECTOR__OWNED_TEMPLATE_SIGNATURE:
				return eVirtualGet(UML2Package.CONNECTOR__OWNED_TEMPLATE_SIGNATURE) != null;
			case UML2Package.CONNECTOR__NAME:
				String name = eVirtualIsSet(UML2Package.CONNECTOR__NAME) ? (String)eVirtualGet(UML2Package.CONNECTOR__NAME) : NAME_EDEFAULT;
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case UML2Package.CONNECTOR__QUALIFIED_NAME:
				return QUALIFIED_NAME_EDEFAULT == null ? getQualifiedName() != null : !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case UML2Package.CONNECTOR__VISIBILITY:
				return eVirtualIsSet(UML2Package.CONNECTOR__VISIBILITY) && eVirtualGet(UML2Package.CONNECTOR__VISIBILITY) != VISIBILITY_EDEFAULT;
			case UML2Package.CONNECTOR__CLIENT_DEPENDENCY:
				EList clientDependency = (EList)eVirtualGet(UML2Package.CONNECTOR__CLIENT_DEPENDENCY);
				return clientDependency != null && !clientDependency.isEmpty();
			case UML2Package.CONNECTOR__NAME_EXPRESSION:
				return eVirtualGet(UML2Package.CONNECTOR__NAME_EXPRESSION) != null;
			case UML2Package.CONNECTOR__REDEFINITION_CONTEXT:
				return isSetRedefinitionContexts();
			case UML2Package.CONNECTOR__IS_LEAF:
				return ((eFlags & IS_LEAF_EFLAG) != 0) != IS_LEAF_EDEFAULT;
			case UML2Package.CONNECTOR__FEATURING_CLASSIFIER:
				return isSetFeaturingClassifiers();
			case UML2Package.CONNECTOR__IS_STATIC:
				return ((eFlags & IS_STATIC_EFLAG) != 0) != IS_STATIC_EDEFAULT;
			case UML2Package.CONNECTOR__TYPE:
				return eVirtualGet(UML2Package.CONNECTOR__TYPE) != null;
			case UML2Package.CONNECTOR__REDEFINED_CONNECTOR:
				EList redefinedConnector = (EList)eVirtualGet(UML2Package.CONNECTOR__REDEFINED_CONNECTOR);
				return redefinedConnector != null && !redefinedConnector.isEmpty();
			case UML2Package.CONNECTOR__END:
				EList end = (EList)eVirtualGet(UML2Package.CONNECTOR__END);
				return end != null && !end.isEmpty();
			case UML2Package.CONNECTOR__KIND:
				return eVirtualIsSet(UML2Package.CONNECTOR__KIND) && eVirtualGet(UML2Package.CONNECTOR__KIND) != KIND_EDEFAULT;
			case UML2Package.CONNECTOR__CONTRACT:
				EList contract = (EList)eVirtualGet(UML2Package.CONNECTOR__CONTRACT);
				return contract != null && !contract.isEmpty();
		}
		return eDynamicIsSet(eFeature);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (kind: "); //$NON-NLS-1$
		result.append(eVirtualIsSet(UML2Package.CONNECTOR__KIND) ? eVirtualGet(UML2Package.CONNECTOR__KIND) : KIND_EDEFAULT);
		result.append(')');
		return result.toString();
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EList getRedefinedElementsHelper(EList redefinedElement) {
		super.getRedefinedElementsHelper(redefinedElement);
		EList redefinedConnector = getRedefinedConnectors();
		if (!redefinedConnector.isEmpty()) {
			for (Iterator i = ((InternalEList) redefinedConnector).basicIterator(); i.hasNext(); ) {
				redefinedElement.add(i.next());
			}
		}
		return redefinedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRedefinedElements() {
		return super.isSetRedefinedElements()
			|| eIsSet(UML2Package.eINSTANCE.getConnector_RedefinedConnector());
	}


} //ConnectorImpl
