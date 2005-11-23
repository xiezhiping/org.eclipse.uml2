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
 * $Id: InstanceValueImpl.java,v 1.14 2005/11/23 13:25:34 khussey Exp $
 */
package org.eclipse.uml2.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.uml2.EnumerationLiteral;
import org.eclipse.uml2.InstanceSpecification;
import org.eclipse.uml2.InstanceValue;
import org.eclipse.uml2.StringExpression;
import org.eclipse.uml2.TemplateParameter;
import org.eclipse.uml2.TemplateSignature;
import org.eclipse.uml2.Type;
import org.eclipse.uml2.UML2Package;
import org.eclipse.uml2.ValueSpecification;
import org.eclipse.uml2.VisibilityKind;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Instance Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2.impl.InstanceValueImpl#getInstance <em>Instance</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InstanceValueImpl extends ValueSpecificationImpl implements InstanceValue {
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
	protected InstanceValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return UML2Package.eINSTANCE.getInstanceValue();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InstanceSpecification getInstance() {
		InstanceSpecification instance = (InstanceSpecification)eVirtualGet(UML2Package.INSTANCE_VALUE__INSTANCE);
		if (instance != null && instance.eIsProxy()) {
			InternalEObject oldInstance = (InternalEObject)instance;
			instance = (InstanceSpecification)eResolveProxy(oldInstance);
			if (instance != oldInstance) {
				eVirtualSet(UML2Package.INSTANCE_VALUE__INSTANCE, instance);
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UML2Package.INSTANCE_VALUE__INSTANCE, oldInstance, instance));
			}
		}
		return instance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InstanceSpecification basicGetInstance() {
		return (InstanceSpecification)eVirtualGet(UML2Package.INSTANCE_VALUE__INSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInstance(InstanceSpecification newInstance) {
		InstanceSpecification instance = newInstance;
		Object oldInstance = eVirtualSet(UML2Package.INSTANCE_VALUE__INSTANCE, instance);
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2Package.INSTANCE_VALUE__INSTANCE, oldInstance == EVIRTUAL_NO_VALUE ? null : oldInstance, instance));

	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UML2Package.INSTANCE_VALUE__EANNOTATIONS:
				return getEAnnotations();
			case UML2Package.INSTANCE_VALUE__OWNED_ELEMENT:
				return getOwnedElements();
			case UML2Package.INSTANCE_VALUE__OWNER:
				if (resolve) return getOwner();
				return basicGetOwner();
			case UML2Package.INSTANCE_VALUE__OWNED_COMMENT:
				return getOwnedComments();
			case UML2Package.INSTANCE_VALUE__TEMPLATE_BINDING:
				return getTemplateBindings();
			case UML2Package.INSTANCE_VALUE__OWNED_TEMPLATE_SIGNATURE:
				return getOwnedTemplateSignature();
			case UML2Package.INSTANCE_VALUE__NAME:
				return getName();
			case UML2Package.INSTANCE_VALUE__QUALIFIED_NAME:
				return getQualifiedName();
			case UML2Package.INSTANCE_VALUE__VISIBILITY:
				return getVisibility();
			case UML2Package.INSTANCE_VALUE__CLIENT_DEPENDENCY:
				return getClientDependencies();
			case UML2Package.INSTANCE_VALUE__NAME_EXPRESSION:
				return getNameExpression();
			case UML2Package.INSTANCE_VALUE__TYPE:
				if (resolve) return getType();
				return basicGetType();
			case UML2Package.INSTANCE_VALUE__TEMPLATE_PARAMETER:
				if (resolve) return getTemplateParameter();
				return basicGetTemplateParameter();
			case UML2Package.INSTANCE_VALUE__OWNING_PARAMETER:
				return getOwningParameter();
			case UML2Package.INSTANCE_VALUE__INSTANCE:
				if (resolve) return getInstance();
				return basicGetInstance();
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
			case UML2Package.INSTANCE_VALUE__EANNOTATIONS:
				getEAnnotations().clear();
				getEAnnotations().addAll((Collection)newValue);
				return;
			case UML2Package.INSTANCE_VALUE__OWNED_COMMENT:
				getOwnedComments().clear();
				getOwnedComments().addAll((Collection)newValue);
				return;
			case UML2Package.INSTANCE_VALUE__TEMPLATE_BINDING:
				getTemplateBindings().clear();
				getTemplateBindings().addAll((Collection)newValue);
				return;
			case UML2Package.INSTANCE_VALUE__OWNED_TEMPLATE_SIGNATURE:
				setOwnedTemplateSignature((TemplateSignature)newValue);
				return;
			case UML2Package.INSTANCE_VALUE__NAME:
				setName((String)newValue);
				return;
			case UML2Package.INSTANCE_VALUE__VISIBILITY:
				setVisibility((VisibilityKind)newValue);
				return;
			case UML2Package.INSTANCE_VALUE__CLIENT_DEPENDENCY:
				getClientDependencies().clear();
				getClientDependencies().addAll((Collection)newValue);
				return;
			case UML2Package.INSTANCE_VALUE__NAME_EXPRESSION:
				setNameExpression((StringExpression)newValue);
				return;
			case UML2Package.INSTANCE_VALUE__TYPE:
				setType((Type)newValue);
				return;
			case UML2Package.INSTANCE_VALUE__TEMPLATE_PARAMETER:
				setTemplateParameter((TemplateParameter)newValue);
				return;
			case UML2Package.INSTANCE_VALUE__OWNING_PARAMETER:
				setOwningParameter((TemplateParameter)newValue);
				return;
			case UML2Package.INSTANCE_VALUE__INSTANCE:
				setInstance((InstanceSpecification)newValue);
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
			case UML2Package.INSTANCE_VALUE__EANNOTATIONS:
				getEAnnotations().clear();
				return;
			case UML2Package.INSTANCE_VALUE__OWNED_COMMENT:
				getOwnedComments().clear();
				return;
			case UML2Package.INSTANCE_VALUE__TEMPLATE_BINDING:
				getTemplateBindings().clear();
				return;
			case UML2Package.INSTANCE_VALUE__OWNED_TEMPLATE_SIGNATURE:
				setOwnedTemplateSignature((TemplateSignature)null);
				return;
			case UML2Package.INSTANCE_VALUE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case UML2Package.INSTANCE_VALUE__VISIBILITY:
				setVisibility(VISIBILITY_EDEFAULT);
				return;
			case UML2Package.INSTANCE_VALUE__CLIENT_DEPENDENCY:
				getClientDependencies().clear();
				return;
			case UML2Package.INSTANCE_VALUE__NAME_EXPRESSION:
				setNameExpression((StringExpression)null);
				return;
			case UML2Package.INSTANCE_VALUE__TYPE:
				setType((Type)null);
				return;
			case UML2Package.INSTANCE_VALUE__TEMPLATE_PARAMETER:
				setTemplateParameter((TemplateParameter)null);
				return;
			case UML2Package.INSTANCE_VALUE__OWNING_PARAMETER:
				setOwningParameter((TemplateParameter)null);
				return;
			case UML2Package.INSTANCE_VALUE__INSTANCE:
				setInstance((InstanceSpecification)null);
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
			case UML2Package.INSTANCE_VALUE__EANNOTATIONS:
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UML2Package.INSTANCE_VALUE__OWNED_ELEMENT:
				return isSetOwnedElements();
			case UML2Package.INSTANCE_VALUE__OWNER:
				return isSetOwner();
			case UML2Package.INSTANCE_VALUE__OWNED_COMMENT:
				EList ownedComment = (EList)eVirtualGet(UML2Package.INSTANCE_VALUE__OWNED_COMMENT);
				return ownedComment != null && !ownedComment.isEmpty();
			case UML2Package.INSTANCE_VALUE__TEMPLATE_BINDING:
				EList templateBinding = (EList)eVirtualGet(UML2Package.INSTANCE_VALUE__TEMPLATE_BINDING);
				return templateBinding != null && !templateBinding.isEmpty();
			case UML2Package.INSTANCE_VALUE__OWNED_TEMPLATE_SIGNATURE:
				return eVirtualGet(UML2Package.INSTANCE_VALUE__OWNED_TEMPLATE_SIGNATURE) != null;
			case UML2Package.INSTANCE_VALUE__NAME:
				String name = (String)eVirtualGet(UML2Package.INSTANCE_VALUE__NAME, NAME_EDEFAULT);
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case UML2Package.INSTANCE_VALUE__QUALIFIED_NAME:
				return QUALIFIED_NAME_EDEFAULT == null ? getQualifiedName() != null : !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case UML2Package.INSTANCE_VALUE__VISIBILITY:
				return eVirtualGet(UML2Package.INSTANCE_VALUE__VISIBILITY, VISIBILITY_EDEFAULT) != VISIBILITY_EDEFAULT;
			case UML2Package.INSTANCE_VALUE__CLIENT_DEPENDENCY:
				EList clientDependency = (EList)eVirtualGet(UML2Package.INSTANCE_VALUE__CLIENT_DEPENDENCY);
				return clientDependency != null && !clientDependency.isEmpty();
			case UML2Package.INSTANCE_VALUE__NAME_EXPRESSION:
				return eVirtualGet(UML2Package.INSTANCE_VALUE__NAME_EXPRESSION) != null;
			case UML2Package.INSTANCE_VALUE__TYPE:
				return eVirtualGet(UML2Package.INSTANCE_VALUE__TYPE) != null;
			case UML2Package.INSTANCE_VALUE__TEMPLATE_PARAMETER:
				return eVirtualGet(UML2Package.INSTANCE_VALUE__TEMPLATE_PARAMETER) != null;
			case UML2Package.INSTANCE_VALUE__OWNING_PARAMETER:
				return getOwningParameter() != null;
			case UML2Package.INSTANCE_VALUE__INSTANCE:
				return eVirtualGet(UML2Package.INSTANCE_VALUE__INSTANCE) != null;
		}
		return eDynamicIsSet(featureID);
	}


	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.uml2.ValueSpecification#stringValue()
	 */
	public String stringValue() {
		InstanceSpecification instance = getInstance();

		if (EnumerationLiteral.class.isInstance(instance)) {
			return ((EnumerationLiteral) instance).getName();
		} else if (null != instance) {
			ValueSpecification specification = instance.getSpecification();

			if (null != specification) {
				return specification.stringValue();
			}
		}

		return super.stringValue();
	}

} // InstanceValueImpl
