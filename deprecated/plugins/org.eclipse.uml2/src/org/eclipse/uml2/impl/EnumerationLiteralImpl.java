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
 * $Id: EnumerationLiteralImpl.java,v 1.21 2006/05/26 18:16:42 khussey Exp $
 */
package org.eclipse.uml2.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.uml2.Enumeration;
import org.eclipse.uml2.EnumerationLiteral;
import org.eclipse.uml2.Namespace;
import org.eclipse.uml2.StringExpression;
import org.eclipse.uml2.TemplateParameter;
import org.eclipse.uml2.TemplateSignature;
import org.eclipse.uml2.UML2Package;
import org.eclipse.uml2.ValueSpecification;
import org.eclipse.uml2.VisibilityKind;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Enumeration Literal</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2.impl.EnumerationLiteralImpl#getNamespace <em>Namespace</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.EnumerationLiteralImpl#getEnumeration <em>Enumeration</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EnumerationLiteralImpl extends InstanceSpecificationImpl implements EnumerationLiteral {
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
	protected EnumerationLiteralImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return UML2Package.Literals.ENUMERATION_LITERAL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Namespace getNamespace() {
		Namespace namespace = basicGetNamespace();
		return namespace != null && namespace.eIsProxy() ? (Namespace)eResolveProxy((InternalEObject)namespace) : namespace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Enumeration getEnumeration() {
		if (eContainerFeatureID != UML2Package.ENUMERATION_LITERAL__ENUMERATION) return null;
		return (Enumeration)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEnumeration(Enumeration newEnumeration, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newEnumeration, UML2Package.ENUMERATION_LITERAL__ENUMERATION, msgs);

		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnumeration(Enumeration newEnumeration) {
		if (newEnumeration != eInternalContainer() || (eContainerFeatureID != UML2Package.ENUMERATION_LITERAL__ENUMERATION && newEnumeration != null)) {
			if (EcoreUtil.isAncestor(this, newEnumeration))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString()); //$NON-NLS-1$
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newEnumeration != null)
				msgs = ((InternalEObject)newEnumeration).eInverseAdd(this, UML2Package.ENUMERATION__OWNED_LITERAL, Enumeration.class, msgs);
			msgs = basicSetEnumeration(newEnumeration, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2Package.ENUMERATION_LITERAL__ENUMERATION, newEnumeration, newEnumeration));

	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UML2Package.ENUMERATION_LITERAL__EANNOTATIONS:
				return ((InternalEList)getEAnnotations()).basicAdd(otherEnd, msgs);
			case UML2Package.ENUMERATION_LITERAL__TEMPLATE_BINDING:
				return ((InternalEList)getTemplateBindings()).basicAdd(otherEnd, msgs);
			case UML2Package.ENUMERATION_LITERAL__OWNED_TEMPLATE_SIGNATURE:
				if (ownedTemplateSignature != null)
					msgs = ((InternalEObject)ownedTemplateSignature).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UML2Package.ENUMERATION_LITERAL__OWNED_TEMPLATE_SIGNATURE, null, msgs);
				return basicSetOwnedTemplateSignature((TemplateSignature)otherEnd, msgs);
			case UML2Package.ENUMERATION_LITERAL__CLIENT_DEPENDENCY:
				return ((InternalEList)getClientDependencies()).basicAdd(otherEnd, msgs);
			case UML2Package.ENUMERATION_LITERAL__TEMPLATE_PARAMETER:
				if (templateParameter != null)
					msgs = ((InternalEObject)templateParameter).eInverseRemove(this, UML2Package.TEMPLATE_PARAMETER__PARAMETERED_ELEMENT, TemplateParameter.class, msgs);
				return basicSetTemplateParameter((TemplateParameter)otherEnd, msgs);
			case UML2Package.ENUMERATION_LITERAL__OWNING_PARAMETER:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOwningParameter((TemplateParameter)otherEnd, msgs);
			case UML2Package.ENUMERATION_LITERAL__DEPLOYMENT:
				return ((InternalEList)getDeployments()).basicAdd(otherEnd, msgs);
			case UML2Package.ENUMERATION_LITERAL__SLOT:
				return ((InternalEList)getSlots()).basicAdd(otherEnd, msgs);
			case UML2Package.ENUMERATION_LITERAL__ENUMERATION:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetEnumeration((Enumeration)otherEnd, msgs);
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
			case UML2Package.ENUMERATION_LITERAL__EANNOTATIONS:
				return ((InternalEList)getEAnnotations()).basicRemove(otherEnd, msgs);
			case UML2Package.ENUMERATION_LITERAL__OWNED_COMMENT:
				return ((InternalEList)getOwnedComments()).basicRemove(otherEnd, msgs);
			case UML2Package.ENUMERATION_LITERAL__TEMPLATE_BINDING:
				return ((InternalEList)getTemplateBindings()).basicRemove(otherEnd, msgs);
			case UML2Package.ENUMERATION_LITERAL__OWNED_TEMPLATE_SIGNATURE:
				return basicSetOwnedTemplateSignature(null, msgs);
			case UML2Package.ENUMERATION_LITERAL__CLIENT_DEPENDENCY:
				return ((InternalEList)getClientDependencies()).basicRemove(otherEnd, msgs);
			case UML2Package.ENUMERATION_LITERAL__NAME_EXPRESSION:
				return basicSetNameExpression(null, msgs);
			case UML2Package.ENUMERATION_LITERAL__TEMPLATE_PARAMETER:
				return basicSetTemplateParameter(null, msgs);
			case UML2Package.ENUMERATION_LITERAL__OWNING_PARAMETER:
				return basicSetOwningParameter(null, msgs);
			case UML2Package.ENUMERATION_LITERAL__DEPLOYMENT:
				return ((InternalEList)getDeployments()).basicRemove(otherEnd, msgs);
			case UML2Package.ENUMERATION_LITERAL__SLOT:
				return ((InternalEList)getSlots()).basicRemove(otherEnd, msgs);
			case UML2Package.ENUMERATION_LITERAL__SPECIFICATION:
				return basicSetSpecification(null, msgs);
			case UML2Package.ENUMERATION_LITERAL__ENUMERATION:
				return basicSetEnumeration(null, msgs);
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
			case UML2Package.ENUMERATION_LITERAL__OWNING_PARAMETER:
				return eInternalContainer().eInverseRemove(this, UML2Package.TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT, TemplateParameter.class, msgs);
			case UML2Package.ENUMERATION_LITERAL__ENUMERATION:
				return eInternalContainer().eInverseRemove(this, UML2Package.ENUMERATION__OWNED_LITERAL, Enumeration.class, msgs);
		}
		return eDynamicBasicRemoveFromContainer(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Namespace basicGetNamespace() {
		Enumeration enumeration = getEnumeration();			
		if (enumeration != null) {
			return enumeration;
		}
		return super.basicGetNamespace();
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNamespace() {
		return super.isSetNamespace()
			|| eIsSet(UML2Package.ENUMERATION_LITERAL__ENUMERATION);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UML2Package.ENUMERATION_LITERAL__EANNOTATIONS:
				return getEAnnotations();
			case UML2Package.ENUMERATION_LITERAL__OWNED_ELEMENT:
				return getOwnedElements();
			case UML2Package.ENUMERATION_LITERAL__OWNER:
				if (resolve) return getOwner();
				return basicGetOwner();
			case UML2Package.ENUMERATION_LITERAL__OWNED_COMMENT:
				return getOwnedComments();
			case UML2Package.ENUMERATION_LITERAL__TEMPLATE_BINDING:
				return getTemplateBindings();
			case UML2Package.ENUMERATION_LITERAL__OWNED_TEMPLATE_SIGNATURE:
				return getOwnedTemplateSignature();
			case UML2Package.ENUMERATION_LITERAL__NAME:
				return getName();
			case UML2Package.ENUMERATION_LITERAL__QUALIFIED_NAME:
				return getQualifiedName();
			case UML2Package.ENUMERATION_LITERAL__VISIBILITY:
				return getVisibility();
			case UML2Package.ENUMERATION_LITERAL__CLIENT_DEPENDENCY:
				return getClientDependencies();
			case UML2Package.ENUMERATION_LITERAL__NAME_EXPRESSION:
				return getNameExpression();
			case UML2Package.ENUMERATION_LITERAL__TEMPLATE_PARAMETER:
				if (resolve) return getTemplateParameter();
				return basicGetTemplateParameter();
			case UML2Package.ENUMERATION_LITERAL__OWNING_PARAMETER:
				return getOwningParameter();
			case UML2Package.ENUMERATION_LITERAL__PACKAGEABLE_ELEMENT_VISIBILITY:
				return getPackageableElement_visibility();
			case UML2Package.ENUMERATION_LITERAL__DEPLOYMENT:
				return getDeployments();
			case UML2Package.ENUMERATION_LITERAL__DEPLOYED_ELEMENT:
				return getDeployedElements();
			case UML2Package.ENUMERATION_LITERAL__SLOT:
				return getSlots();
			case UML2Package.ENUMERATION_LITERAL__CLASSIFIER:
				return getClassifiers();
			case UML2Package.ENUMERATION_LITERAL__SPECIFICATION:
				return getSpecification();
			case UML2Package.ENUMERATION_LITERAL__ENUMERATION:
				return getEnumeration();
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
			case UML2Package.ENUMERATION_LITERAL__EANNOTATIONS:
				getEAnnotations().clear();
				getEAnnotations().addAll((Collection)newValue);
				return;
			case UML2Package.ENUMERATION_LITERAL__OWNED_COMMENT:
				getOwnedComments().clear();
				getOwnedComments().addAll((Collection)newValue);
				return;
			case UML2Package.ENUMERATION_LITERAL__TEMPLATE_BINDING:
				getTemplateBindings().clear();
				getTemplateBindings().addAll((Collection)newValue);
				return;
			case UML2Package.ENUMERATION_LITERAL__OWNED_TEMPLATE_SIGNATURE:
				setOwnedTemplateSignature((TemplateSignature)newValue);
				return;
			case UML2Package.ENUMERATION_LITERAL__NAME:
				setName((String)newValue);
				return;
			case UML2Package.ENUMERATION_LITERAL__VISIBILITY:
				setVisibility((VisibilityKind)newValue);
				return;
			case UML2Package.ENUMERATION_LITERAL__CLIENT_DEPENDENCY:
				getClientDependencies().clear();
				getClientDependencies().addAll((Collection)newValue);
				return;
			case UML2Package.ENUMERATION_LITERAL__NAME_EXPRESSION:
				setNameExpression((StringExpression)newValue);
				return;
			case UML2Package.ENUMERATION_LITERAL__TEMPLATE_PARAMETER:
				setTemplateParameter((TemplateParameter)newValue);
				return;
			case UML2Package.ENUMERATION_LITERAL__OWNING_PARAMETER:
				setOwningParameter((TemplateParameter)newValue);
				return;
			case UML2Package.ENUMERATION_LITERAL__PACKAGEABLE_ELEMENT_VISIBILITY:
				setPackageableElement_visibility((VisibilityKind)newValue);
				return;
			case UML2Package.ENUMERATION_LITERAL__DEPLOYMENT:
				getDeployments().clear();
				getDeployments().addAll((Collection)newValue);
				return;
			case UML2Package.ENUMERATION_LITERAL__SLOT:
				getSlots().clear();
				getSlots().addAll((Collection)newValue);
				return;
			case UML2Package.ENUMERATION_LITERAL__CLASSIFIER:
				getClassifiers().clear();
				getClassifiers().addAll((Collection)newValue);
				return;
			case UML2Package.ENUMERATION_LITERAL__SPECIFICATION:
				setSpecification((ValueSpecification)newValue);
				return;
			case UML2Package.ENUMERATION_LITERAL__ENUMERATION:
				setEnumeration((Enumeration)newValue);
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
			case UML2Package.ENUMERATION_LITERAL__EANNOTATIONS:
				getEAnnotations().clear();
				return;
			case UML2Package.ENUMERATION_LITERAL__OWNED_COMMENT:
				getOwnedComments().clear();
				return;
			case UML2Package.ENUMERATION_LITERAL__TEMPLATE_BINDING:
				getTemplateBindings().clear();
				return;
			case UML2Package.ENUMERATION_LITERAL__OWNED_TEMPLATE_SIGNATURE:
				setOwnedTemplateSignature((TemplateSignature)null);
				return;
			case UML2Package.ENUMERATION_LITERAL__NAME:
				setName(NAME_EDEFAULT);
				return;
			case UML2Package.ENUMERATION_LITERAL__VISIBILITY:
				setVisibility(VISIBILITY_EDEFAULT);
				return;
			case UML2Package.ENUMERATION_LITERAL__CLIENT_DEPENDENCY:
				getClientDependencies().clear();
				return;
			case UML2Package.ENUMERATION_LITERAL__NAME_EXPRESSION:
				setNameExpression((StringExpression)null);
				return;
			case UML2Package.ENUMERATION_LITERAL__TEMPLATE_PARAMETER:
				setTemplateParameter((TemplateParameter)null);
				return;
			case UML2Package.ENUMERATION_LITERAL__OWNING_PARAMETER:
				setOwningParameter((TemplateParameter)null);
				return;
			case UML2Package.ENUMERATION_LITERAL__PACKAGEABLE_ELEMENT_VISIBILITY:
				setPackageableElement_visibility(PACKAGEABLE_ELEMENT_VISIBILITY_EDEFAULT);
				return;
			case UML2Package.ENUMERATION_LITERAL__DEPLOYMENT:
				getDeployments().clear();
				return;
			case UML2Package.ENUMERATION_LITERAL__SLOT:
				getSlots().clear();
				return;
			case UML2Package.ENUMERATION_LITERAL__CLASSIFIER:
				getClassifiers().clear();
				return;
			case UML2Package.ENUMERATION_LITERAL__SPECIFICATION:
				setSpecification((ValueSpecification)null);
				return;
			case UML2Package.ENUMERATION_LITERAL__ENUMERATION:
				setEnumeration((Enumeration)null);
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
			case UML2Package.ENUMERATION_LITERAL__EANNOTATIONS:
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UML2Package.ENUMERATION_LITERAL__OWNED_ELEMENT:
				return isSetOwnedElements();
			case UML2Package.ENUMERATION_LITERAL__OWNER:
				return isSetOwner();
			case UML2Package.ENUMERATION_LITERAL__OWNED_COMMENT:
				return ownedComments != null && !ownedComments.isEmpty();
			case UML2Package.ENUMERATION_LITERAL__TEMPLATE_BINDING:
				return templateBindings != null && !templateBindings.isEmpty();
			case UML2Package.ENUMERATION_LITERAL__OWNED_TEMPLATE_SIGNATURE:
				return ownedTemplateSignature != null;
			case UML2Package.ENUMERATION_LITERAL__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case UML2Package.ENUMERATION_LITERAL__QUALIFIED_NAME:
				return QUALIFIED_NAME_EDEFAULT == null ? getQualifiedName() != null : !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case UML2Package.ENUMERATION_LITERAL__VISIBILITY:
				return isSetVisibility();
			case UML2Package.ENUMERATION_LITERAL__CLIENT_DEPENDENCY:
				return clientDependencies != null && !clientDependencies.isEmpty();
			case UML2Package.ENUMERATION_LITERAL__NAME_EXPRESSION:
				return nameExpression != null;
			case UML2Package.ENUMERATION_LITERAL__TEMPLATE_PARAMETER:
				return templateParameter != null;
			case UML2Package.ENUMERATION_LITERAL__OWNING_PARAMETER:
				return getOwningParameter() != null;
			case UML2Package.ENUMERATION_LITERAL__PACKAGEABLE_ELEMENT_VISIBILITY:
				return isSetPackageableElement_visibility();
			case UML2Package.ENUMERATION_LITERAL__DEPLOYMENT:
				return deployments != null && !deployments.isEmpty();
			case UML2Package.ENUMERATION_LITERAL__DEPLOYED_ELEMENT:
				return !getDeployedElements().isEmpty();
			case UML2Package.ENUMERATION_LITERAL__SLOT:
				return slots != null && !slots.isEmpty();
			case UML2Package.ENUMERATION_LITERAL__CLASSIFIER:
				return classifiers != null && !classifiers.isEmpty();
			case UML2Package.ENUMERATION_LITERAL__SPECIFICATION:
				return specification != null;
			case UML2Package.ENUMERATION_LITERAL__ENUMERATION:
				return getEnumeration() != null;
		}
		return eDynamicIsSet(featureID);
	}


} //EnumerationLiteralImpl
