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
 * $Id: ConnectorImpl.java,v 1.7 2004/10/01 19:36:27 khussey Exp $
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
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EcoreEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.uml2.Association;
import org.eclipse.uml2.Behavior;
import org.eclipse.uml2.Connector;
import org.eclipse.uml2.ConnectorEnd;
import org.eclipse.uml2.ConnectorKind;
import org.eclipse.uml2.StringExpression;
import org.eclipse.uml2.TemplateSignature;
import org.eclipse.uml2.UML2Package;
import org.eclipse.uml2.VisibilityKind;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Connector</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
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
	public static final String copyright = "Copyright (c) 2003, 2004 IBM Corporation and others."; //$NON-NLS-1$

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected Association type = null;

	/**
	 * The cached value of the '{@link #getRedefinedConnectors() <em>Redefined Connector</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRedefinedConnectors()
	 * @generated
	 * @ordered
	 */
	protected EList redefinedConnector = null;

	/**
	 * The cached value of the '{@link #getEnds() <em>End</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnds()
	 * @generated
	 * @ordered
	 */
	protected EList end = null;

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
	 * The cached value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected ConnectorKind kind = KIND_EDEFAULT;

	/**
	 * The cached value of the '{@link #getContracts() <em>Contract</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContracts()
	 * @generated
	 * @ordered
	 */
	protected EList contract = null;

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
	public ConnectorKind getKind() {
		return kind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKind(ConnectorKind newKind) {
		ConnectorKind oldKind = kind;
		kind = newKind == null ? KIND_EDEFAULT : newKind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2Package.CONNECTOR__KIND, oldKind, kind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Association getType() {
		if (type != null && type.eIsProxy()) {
			Association oldType = type;
			type = (Association)eResolveProxy((InternalEObject)type);
			if (type != oldType) {
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
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(Association newType) {
		Association oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2Package.CONNECTOR__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getRedefinedConnectors() {
		if (redefinedConnector == null) {
			redefinedConnector = new EObjectResolvingEList(Connector.class, this, UML2Package.CONNECTOR__REDEFINED_CONNECTOR);
		}
		return redefinedConnector;
	}

    /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
     */
    public Connector getRedefinedConnector(String unqualifiedName) {
    	for (Iterator i = getRedefinedConnectors().iterator(); i.hasNext(); ) {
    		Connector namedRedefinedConnector = (Connector) i.next();
    		
    		if (unqualifiedName.equals(namedRedefinedConnector.getName())) {
    			return namedRedefinedConnector;
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
		if (end == null) {
			end = new EObjectContainmentEList(ConnectorEnd.class, this, UML2Package.CONNECTOR__END);
		}
		return end;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
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
	public EList getContracts() {
		if (contract == null) {
			contract = new EObjectResolvingEList(Behavior.class, this, UML2Package.CONNECTOR__CONTRACT);
		}
		return contract;
	}

    /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
     */
    public Behavior getContract(String unqualifiedName) {
    	for (Iterator i = getContracts().iterator(); i.hasNext(); ) {
    		Behavior namedContract = (Behavior) i.next();
    		
    		if (unqualifiedName.equals(namedContract.getName())) {
    			return namedContract;
    		}
    	}
    	
    	return null;
    }
      
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getRedefinedElements() {
		EList result = (EList) getCacheAdapter().get(this, UML2Package.eINSTANCE.getConnector().getEAllOperations().get(36));

		if (null == result) {
			Set union = new LinkedHashSet();
			union.addAll(super.getRedefinedElements());
			union.addAll(getRedefinedConnectors());

			result = new BasicEList.UnmodifiableEList(union.size(), union.toArray());
			getCacheAdapter().put(this, UML2Package.eINSTANCE.getConnector().getEAllOperations().get(36), result);
		}

		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getOwnedElements() {
		EList ownedElement = (EList) getCacheAdapter().get(this, UML2Package.eINSTANCE.getElement_OwnedElement());

		if (null == ownedElement) {
			Set union = new LinkedHashSet();
			union.addAll(super.getOwnedElements());
			union.addAll(getEnds());

			ownedElement = new EcoreEList.UnmodifiableEList(this, UML2Package.eINSTANCE.getElement_OwnedElement(), union.size(), union.toArray());
			getCacheAdapter().put(this, UML2Package.eINSTANCE.getElement_OwnedElement(), ownedElement);
		}

		return ownedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, Class baseClass, NotificationChain msgs) {
		if (featureID >= 0) {
			switch (eDerivedStructuralFeatureID(featureID, baseClass)) {
				case UML2Package.CONNECTOR__EANNOTATIONS:
					return ((InternalEList)getEAnnotations()).basicAdd(otherEnd, msgs);
				case UML2Package.CONNECTOR__TEMPLATE_BINDING:
					return ((InternalEList)getTemplateBindings()).basicAdd(otherEnd, msgs);
				case UML2Package.CONNECTOR__OWNED_TEMPLATE_SIGNATURE:
					if (ownedTemplateSignature != null)
						msgs = ((InternalEObject)ownedTemplateSignature).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UML2Package.CONNECTOR__OWNED_TEMPLATE_SIGNATURE, null, msgs);
					return basicSetOwnedTemplateSignature((TemplateSignature)otherEnd, msgs);
				case UML2Package.CONNECTOR__CLIENT_DEPENDENCY:
					return ((InternalEList)getClientDependencies()).basicAdd(otherEnd, msgs);
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
				return !getOwnedElements().isEmpty();
			case UML2Package.CONNECTOR__OWNER:
				return basicGetOwner() != null;
			case UML2Package.CONNECTOR__OWNED_COMMENT:
				return ownedComment != null && !ownedComment.isEmpty();
			case UML2Package.CONNECTOR__TEMPLATE_BINDING:
				return templateBinding != null && !templateBinding.isEmpty();
			case UML2Package.CONNECTOR__OWNED_TEMPLATE_SIGNATURE:
				return ownedTemplateSignature != null;
			case UML2Package.CONNECTOR__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case UML2Package.CONNECTOR__QUALIFIED_NAME:
				return QUALIFIED_NAME_EDEFAULT == null ? getQualifiedName() != null : !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case UML2Package.CONNECTOR__VISIBILITY:
				return visibility != VISIBILITY_EDEFAULT;
			case UML2Package.CONNECTOR__CLIENT_DEPENDENCY:
				return clientDependency != null && !clientDependency.isEmpty();
			case UML2Package.CONNECTOR__NAME_EXPRESSION:
				return nameExpression != null;
			case UML2Package.CONNECTOR__REDEFINITION_CONTEXT:
				return !getRedefinitionContexts().isEmpty();
			case UML2Package.CONNECTOR__IS_LEAF:
				return isLeaf() != IS_LEAF_EDEFAULT;
			case UML2Package.CONNECTOR__FEATURING_CLASSIFIER:
				return !getFeaturingClassifiers().isEmpty();
			case UML2Package.CONNECTOR__IS_STATIC:
				return isStatic() != IS_STATIC_EDEFAULT;
			case UML2Package.CONNECTOR__TYPE:
				return type != null;
			case UML2Package.CONNECTOR__REDEFINED_CONNECTOR:
				return redefinedConnector != null && !redefinedConnector.isEmpty();
			case UML2Package.CONNECTOR__END:
				return end != null && !end.isEmpty();
			case UML2Package.CONNECTOR__KIND:
				return kind != KIND_EDEFAULT;
			case UML2Package.CONNECTOR__CONTRACT:
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
		result.append(kind);
		result.append(')');
		return result.toString();
	}

} //ConnectorImpl
