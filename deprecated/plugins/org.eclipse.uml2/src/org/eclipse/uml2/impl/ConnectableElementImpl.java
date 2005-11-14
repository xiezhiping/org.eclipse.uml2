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
 * $Id: ConnectableElementImpl.java,v 1.13 2005/11/14 17:31:10 khussey Exp $
 */
package org.eclipse.uml2.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.uml2.ConnectableElement;
import org.eclipse.uml2.ConnectorEnd;
import org.eclipse.uml2.Element;
import org.eclipse.uml2.ParameterableElement;
import org.eclipse.uml2.StringExpression;
import org.eclipse.uml2.TemplateParameter;
import org.eclipse.uml2.TemplateSignature;
import org.eclipse.uml2.UML2Package;
import org.eclipse.uml2.VisibilityKind;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Connectable Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2.impl.ConnectableElementImpl#getTemplateParameter <em>Template Parameter</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.ConnectableElementImpl#getOwningParameter <em>Owning Parameter</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.ConnectableElementImpl#getEnds <em>End</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ConnectableElementImpl extends NamedElementImpl implements ConnectableElement {
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
	protected ConnectableElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return UML2Package.eINSTANCE.getConnectableElement();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemplateParameter getTemplateParameter() {
		TemplateParameter templateParameter = (TemplateParameter)eVirtualGet(UML2Package.CONNECTABLE_ELEMENT__TEMPLATE_PARAMETER);
		if (templateParameter != null && templateParameter.eIsProxy()) {
			TemplateParameter oldTemplateParameter = templateParameter;
			templateParameter = (TemplateParameter)eResolveProxy((InternalEObject)templateParameter);
			if (templateParameter != oldTemplateParameter) {
				eVirtualSet(UML2Package.CONNECTABLE_ELEMENT__TEMPLATE_PARAMETER, templateParameter);
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UML2Package.CONNECTABLE_ELEMENT__TEMPLATE_PARAMETER, oldTemplateParameter, templateParameter));
			}
		}
		return templateParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemplateParameter basicGetTemplateParameter() {
		return (TemplateParameter)eVirtualGet(UML2Package.CONNECTABLE_ELEMENT__TEMPLATE_PARAMETER);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTemplateParameter(TemplateParameter newTemplateParameter, NotificationChain msgs) {
		Object oldTemplateParameter = eVirtualSet(UML2Package.CONNECTABLE_ELEMENT__TEMPLATE_PARAMETER, newTemplateParameter);
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UML2Package.CONNECTABLE_ELEMENT__TEMPLATE_PARAMETER, oldTemplateParameter == EVIRTUAL_NO_VALUE ? null : oldTemplateParameter, newTemplateParameter);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}

		if (getOwningParameter() != null && getOwningParameter() != newTemplateParameter) {
			setOwningParameter(null);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTemplateParameter(TemplateParameter newTemplateParameter) {
		TemplateParameter templateParameter = (TemplateParameter)eVirtualGet(UML2Package.CONNECTABLE_ELEMENT__TEMPLATE_PARAMETER);
		if (newTemplateParameter != templateParameter) {
			NotificationChain msgs = null;
			if (templateParameter != null)
				msgs = ((InternalEObject)templateParameter).eInverseRemove(this, UML2Package.TEMPLATE_PARAMETER__PARAMETERED_ELEMENT, TemplateParameter.class, msgs);
			if (newTemplateParameter != null)
				msgs = ((InternalEObject)newTemplateParameter).eInverseAdd(this, UML2Package.TEMPLATE_PARAMETER__PARAMETERED_ELEMENT, TemplateParameter.class, msgs);
			msgs = basicSetTemplateParameter(newTemplateParameter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2Package.CONNECTABLE_ELEMENT__TEMPLATE_PARAMETER, newTemplateParameter, newTemplateParameter));

	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemplateParameter getOwningParameter() {
		if (eContainerFeatureID != UML2Package.CONNECTABLE_ELEMENT__OWNING_PARAMETER) return null;
		return (TemplateParameter)eContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwningParameter(TemplateParameter newOwningParameter) {
		EObject oldOwningParameter = eContainer;
		if (newOwningParameter != eContainer || (eContainerFeatureID != UML2Package.CONNECTABLE_ELEMENT__OWNING_PARAMETER && newOwningParameter != null)) {
			if (EcoreUtil.isAncestor(this, newOwningParameter))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString()); //$NON-NLS-1$
			NotificationChain msgs = null;
			if (eContainer != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOwningParameter != null)
				msgs = ((InternalEObject)newOwningParameter).eInverseAdd(this, UML2Package.TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT, TemplateParameter.class, msgs);
			msgs = eBasicSetContainer((InternalEObject)newOwningParameter, UML2Package.CONNECTABLE_ELEMENT__OWNING_PARAMETER, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2Package.CONNECTABLE_ELEMENT__OWNING_PARAMETER, newOwningParameter, newOwningParameter));

		if (newOwningParameter != null || oldOwningParameter == eVirtualGet(UML2Package.CONNECTABLE_ELEMENT__TEMPLATE_PARAMETER)) {
			setTemplateParameter(newOwningParameter);
		}
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getEnds() {
		EList end = (EList)eVirtualGet(UML2Package.CONNECTABLE_ELEMENT__END);
		if (end == null) {
			eVirtualSet(UML2Package.CONNECTABLE_ELEMENT__END, end = new EObjectWithInverseResolvingEList(ConnectorEnd.class, this, UML2Package.CONNECTABLE_ELEMENT__END, UML2Package.CONNECTOR_END__ROLE));
		}
		return end;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Element basicGetOwner() {
		TemplateParameter owningParameter = getOwningParameter();			
		if (owningParameter != null) {
			return owningParameter;
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
			|| eIsSet(UML2Package.eINSTANCE.getParameterableElement_OwningParameter());
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, Class baseClass, NotificationChain msgs) {
		if (featureID >= 0) {
			switch (eDerivedStructuralFeatureID(featureID, baseClass)) {
				case UML2Package.CONNECTABLE_ELEMENT__EANNOTATIONS:
					return ((InternalEList)getEAnnotations()).basicAdd(otherEnd, msgs);
				case UML2Package.CONNECTABLE_ELEMENT__TEMPLATE_BINDING:
					return ((InternalEList)getTemplateBindings()).basicAdd(otherEnd, msgs);
				case UML2Package.CONNECTABLE_ELEMENT__OWNED_TEMPLATE_SIGNATURE:
					TemplateSignature ownedTemplateSignature = (TemplateSignature)eVirtualGet(UML2Package.CONNECTABLE_ELEMENT__OWNED_TEMPLATE_SIGNATURE);
					if (ownedTemplateSignature != null)
						msgs = ((InternalEObject)ownedTemplateSignature).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UML2Package.CONNECTABLE_ELEMENT__OWNED_TEMPLATE_SIGNATURE, null, msgs);
					return basicSetOwnedTemplateSignature((TemplateSignature)otherEnd, msgs);
				case UML2Package.CONNECTABLE_ELEMENT__CLIENT_DEPENDENCY:
					return ((InternalEList)getClientDependencies()).basicAdd(otherEnd, msgs);
				case UML2Package.CONNECTABLE_ELEMENT__TEMPLATE_PARAMETER:
					TemplateParameter templateParameter = (TemplateParameter)eVirtualGet(UML2Package.CONNECTABLE_ELEMENT__TEMPLATE_PARAMETER);
					if (templateParameter != null)
						msgs = ((InternalEObject)templateParameter).eInverseRemove(this, UML2Package.TEMPLATE_PARAMETER__PARAMETERED_ELEMENT, TemplateParameter.class, msgs);
					return basicSetTemplateParameter((TemplateParameter)otherEnd, msgs);
				case UML2Package.CONNECTABLE_ELEMENT__OWNING_PARAMETER:
					if (eContainer != null)
						msgs = eBasicRemoveFromContainer(msgs);
					return eBasicSetContainer(otherEnd, UML2Package.CONNECTABLE_ELEMENT__OWNING_PARAMETER, msgs);
				case UML2Package.CONNECTABLE_ELEMENT__END:
					return ((InternalEList)getEnds()).basicAdd(otherEnd, msgs);
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
				case UML2Package.CONNECTABLE_ELEMENT__EANNOTATIONS:
					return ((InternalEList)getEAnnotations()).basicRemove(otherEnd, msgs);
				case UML2Package.CONNECTABLE_ELEMENT__OWNED_COMMENT:
					return ((InternalEList)getOwnedComments()).basicRemove(otherEnd, msgs);
				case UML2Package.CONNECTABLE_ELEMENT__TEMPLATE_BINDING:
					return ((InternalEList)getTemplateBindings()).basicRemove(otherEnd, msgs);
				case UML2Package.CONNECTABLE_ELEMENT__OWNED_TEMPLATE_SIGNATURE:
					return basicSetOwnedTemplateSignature(null, msgs);
				case UML2Package.CONNECTABLE_ELEMENT__CLIENT_DEPENDENCY:
					return ((InternalEList)getClientDependencies()).basicRemove(otherEnd, msgs);
				case UML2Package.CONNECTABLE_ELEMENT__NAME_EXPRESSION:
					return basicSetNameExpression(null, msgs);
				case UML2Package.CONNECTABLE_ELEMENT__TEMPLATE_PARAMETER:
					return basicSetTemplateParameter(null, msgs);
				case UML2Package.CONNECTABLE_ELEMENT__OWNING_PARAMETER:
					return eBasicSetContainer(null, UML2Package.CONNECTABLE_ELEMENT__OWNING_PARAMETER, msgs);
				case UML2Package.CONNECTABLE_ELEMENT__END:
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
	public NotificationChain eBasicRemoveFromContainer(NotificationChain msgs) {
		if (eContainerFeatureID >= 0) {
			switch (eContainerFeatureID) {
				case UML2Package.CONNECTABLE_ELEMENT__OWNING_PARAMETER:
					return eContainer.eInverseRemove(this, UML2Package.TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT, TemplateParameter.class, msgs);
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
			case UML2Package.CONNECTABLE_ELEMENT__EANNOTATIONS:
				return getEAnnotations();
			case UML2Package.CONNECTABLE_ELEMENT__OWNED_ELEMENT:
				return getOwnedElements();
			case UML2Package.CONNECTABLE_ELEMENT__OWNER:
				if (resolve) return getOwner();
				return basicGetOwner();
			case UML2Package.CONNECTABLE_ELEMENT__OWNED_COMMENT:
				return getOwnedComments();
			case UML2Package.CONNECTABLE_ELEMENT__TEMPLATE_BINDING:
				return getTemplateBindings();
			case UML2Package.CONNECTABLE_ELEMENT__OWNED_TEMPLATE_SIGNATURE:
				return getOwnedTemplateSignature();
			case UML2Package.CONNECTABLE_ELEMENT__NAME:
				return getName();
			case UML2Package.CONNECTABLE_ELEMENT__QUALIFIED_NAME:
				return getQualifiedName();
			case UML2Package.CONNECTABLE_ELEMENT__VISIBILITY:
				return getVisibility();
			case UML2Package.CONNECTABLE_ELEMENT__CLIENT_DEPENDENCY:
				return getClientDependencies();
			case UML2Package.CONNECTABLE_ELEMENT__NAME_EXPRESSION:
				return getNameExpression();
			case UML2Package.CONNECTABLE_ELEMENT__TEMPLATE_PARAMETER:
				if (resolve) return getTemplateParameter();
				return basicGetTemplateParameter();
			case UML2Package.CONNECTABLE_ELEMENT__OWNING_PARAMETER:
				return getOwningParameter();
			case UML2Package.CONNECTABLE_ELEMENT__END:
				return getEnds();
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
			case UML2Package.CONNECTABLE_ELEMENT__EANNOTATIONS:
				getEAnnotations().clear();
				getEAnnotations().addAll((Collection)newValue);
				return;
			case UML2Package.CONNECTABLE_ELEMENT__OWNED_COMMENT:
				getOwnedComments().clear();
				getOwnedComments().addAll((Collection)newValue);
				return;
			case UML2Package.CONNECTABLE_ELEMENT__TEMPLATE_BINDING:
				getTemplateBindings().clear();
				getTemplateBindings().addAll((Collection)newValue);
				return;
			case UML2Package.CONNECTABLE_ELEMENT__OWNED_TEMPLATE_SIGNATURE:
				setOwnedTemplateSignature((TemplateSignature)newValue);
				return;
			case UML2Package.CONNECTABLE_ELEMENT__NAME:
				setName((String)newValue);
				return;
			case UML2Package.CONNECTABLE_ELEMENT__VISIBILITY:
				setVisibility((VisibilityKind)newValue);
				return;
			case UML2Package.CONNECTABLE_ELEMENT__CLIENT_DEPENDENCY:
				getClientDependencies().clear();
				getClientDependencies().addAll((Collection)newValue);
				return;
			case UML2Package.CONNECTABLE_ELEMENT__NAME_EXPRESSION:
				setNameExpression((StringExpression)newValue);
				return;
			case UML2Package.CONNECTABLE_ELEMENT__TEMPLATE_PARAMETER:
				setTemplateParameter((TemplateParameter)newValue);
				return;
			case UML2Package.CONNECTABLE_ELEMENT__OWNING_PARAMETER:
				setOwningParameter((TemplateParameter)newValue);
				return;
			case UML2Package.CONNECTABLE_ELEMENT__END:
				getEnds().clear();
				getEnds().addAll((Collection)newValue);
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
			case UML2Package.CONNECTABLE_ELEMENT__EANNOTATIONS:
				getEAnnotations().clear();
				return;
			case UML2Package.CONNECTABLE_ELEMENT__OWNED_COMMENT:
				getOwnedComments().clear();
				return;
			case UML2Package.CONNECTABLE_ELEMENT__TEMPLATE_BINDING:
				getTemplateBindings().clear();
				return;
			case UML2Package.CONNECTABLE_ELEMENT__OWNED_TEMPLATE_SIGNATURE:
				setOwnedTemplateSignature((TemplateSignature)null);
				return;
			case UML2Package.CONNECTABLE_ELEMENT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case UML2Package.CONNECTABLE_ELEMENT__VISIBILITY:
				setVisibility(VISIBILITY_EDEFAULT);
				return;
			case UML2Package.CONNECTABLE_ELEMENT__CLIENT_DEPENDENCY:
				getClientDependencies().clear();
				return;
			case UML2Package.CONNECTABLE_ELEMENT__NAME_EXPRESSION:
				setNameExpression((StringExpression)null);
				return;
			case UML2Package.CONNECTABLE_ELEMENT__TEMPLATE_PARAMETER:
				setTemplateParameter((TemplateParameter)null);
				return;
			case UML2Package.CONNECTABLE_ELEMENT__OWNING_PARAMETER:
				setOwningParameter((TemplateParameter)null);
				return;
			case UML2Package.CONNECTABLE_ELEMENT__END:
				getEnds().clear();
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
			case UML2Package.CONNECTABLE_ELEMENT__EANNOTATIONS:
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UML2Package.CONNECTABLE_ELEMENT__OWNED_ELEMENT:
				return isSetOwnedElements();
			case UML2Package.CONNECTABLE_ELEMENT__OWNER:
				return isSetOwner();
			case UML2Package.CONNECTABLE_ELEMENT__OWNED_COMMENT:
				EList ownedComment = (EList)eVirtualGet(UML2Package.CONNECTABLE_ELEMENT__OWNED_COMMENT);
				return ownedComment != null && !ownedComment.isEmpty();
			case UML2Package.CONNECTABLE_ELEMENT__TEMPLATE_BINDING:
				EList templateBinding = (EList)eVirtualGet(UML2Package.CONNECTABLE_ELEMENT__TEMPLATE_BINDING);
				return templateBinding != null && !templateBinding.isEmpty();
			case UML2Package.CONNECTABLE_ELEMENT__OWNED_TEMPLATE_SIGNATURE:
				return eVirtualGet(UML2Package.CONNECTABLE_ELEMENT__OWNED_TEMPLATE_SIGNATURE) != null;
			case UML2Package.CONNECTABLE_ELEMENT__NAME:
				String name = eVirtualIsSet(UML2Package.CONNECTABLE_ELEMENT__NAME) ? (String)eVirtualGet(UML2Package.CONNECTABLE_ELEMENT__NAME) : NAME_EDEFAULT;
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case UML2Package.CONNECTABLE_ELEMENT__QUALIFIED_NAME:
				return QUALIFIED_NAME_EDEFAULT == null ? getQualifiedName() != null : !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case UML2Package.CONNECTABLE_ELEMENT__VISIBILITY:
				return eVirtualIsSet(UML2Package.CONNECTABLE_ELEMENT__VISIBILITY) && eVirtualGet(UML2Package.CONNECTABLE_ELEMENT__VISIBILITY) != VISIBILITY_EDEFAULT;
			case UML2Package.CONNECTABLE_ELEMENT__CLIENT_DEPENDENCY:
				EList clientDependency = (EList)eVirtualGet(UML2Package.CONNECTABLE_ELEMENT__CLIENT_DEPENDENCY);
				return clientDependency != null && !clientDependency.isEmpty();
			case UML2Package.CONNECTABLE_ELEMENT__NAME_EXPRESSION:
				return eVirtualGet(UML2Package.CONNECTABLE_ELEMENT__NAME_EXPRESSION) != null;
			case UML2Package.CONNECTABLE_ELEMENT__TEMPLATE_PARAMETER:
				return eVirtualGet(UML2Package.CONNECTABLE_ELEMENT__TEMPLATE_PARAMETER) != null;
			case UML2Package.CONNECTABLE_ELEMENT__OWNING_PARAMETER:
				return getOwningParameter() != null;
			case UML2Package.CONNECTABLE_ELEMENT__END:
				EList end = (EList)eVirtualGet(UML2Package.CONNECTABLE_ELEMENT__END);
				return end != null && !end.isEmpty();
		}
		return eDynamicIsSet(eFeature);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class baseClass) {
		if (baseClass == ParameterableElement.class) {
			switch (derivedFeatureID) {
				case UML2Package.CONNECTABLE_ELEMENT__TEMPLATE_PARAMETER: return UML2Package.PARAMETERABLE_ELEMENT__TEMPLATE_PARAMETER;
				case UML2Package.CONNECTABLE_ELEMENT__OWNING_PARAMETER: return UML2Package.PARAMETERABLE_ELEMENT__OWNING_PARAMETER;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class baseClass) {
		if (baseClass == ParameterableElement.class) {
			switch (baseFeatureID) {
				case UML2Package.PARAMETERABLE_ELEMENT__TEMPLATE_PARAMETER: return UML2Package.CONNECTABLE_ELEMENT__TEMPLATE_PARAMETER;
				case UML2Package.PARAMETERABLE_ELEMENT__OWNING_PARAMETER: return UML2Package.CONNECTABLE_ELEMENT__OWNING_PARAMETER;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}


} //ConnectableElementImpl
