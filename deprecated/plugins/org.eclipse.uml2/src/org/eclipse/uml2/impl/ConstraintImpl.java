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
 * $Id: ConstraintImpl.java,v 1.19 2005/11/14 17:31:07 khussey Exp $
 */
package org.eclipse.uml2.impl;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.uml2.Constraint;
import org.eclipse.uml2.Element;
import org.eclipse.uml2.Namespace;
import org.eclipse.uml2.StringExpression;
import org.eclipse.uml2.TemplateParameter;
import org.eclipse.uml2.TemplateSignature;
import org.eclipse.uml2.UML2Package;
import org.eclipse.uml2.ValueSpecification;
import org.eclipse.uml2.VisibilityKind;

import org.eclipse.uml2.common.util.DerivedUnionEObjectEList;

import org.eclipse.uml2.internal.operation.ConstraintOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Constraint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2.impl.ConstraintImpl#getOwnedElements <em>Owned Element</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.ConstraintImpl#getNamespace <em>Namespace</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.ConstraintImpl#getSpecification <em>Specification</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.ConstraintImpl#getConstrainedElements <em>Constrained Element</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConstraintImpl extends PackageableElementImpl implements Constraint {
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
	protected ConstraintImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return UML2Package.eINSTANCE.getConstraint();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getOwnedElements() {
		EList ownedElement = (EList)eVirtualGet(UML2Package.CONSTRAINT__OWNED_ELEMENT);
		if (ownedElement == null) {
			eVirtualSet(UML2Package.CONSTRAINT__OWNED_ELEMENT, ownedElement = new DerivedUnionEObjectEList(Element.class, this, UML2Package.CONSTRAINT__OWNED_ELEMENT, new EStructuralFeature[] {UML2Package.eINSTANCE.getElement_OwnedComment(), UML2Package.eINSTANCE.getTemplateableElement_TemplateBinding(), UML2Package.eINSTANCE.getTemplateableElement_OwnedTemplateSignature(), UML2Package.eINSTANCE.getNamedElement_NameExpression(), UML2Package.eINSTANCE.getConstraint_Specification()}));
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
			|| eIsSet(UML2Package.eINSTANCE.getConstraint_Specification());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Namespace getContext() {
		Namespace context = basicGetContext();
		return context == null ? null : (Namespace)eResolveProxy((InternalEObject)context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetContext() {
		return isSetNamespace();
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Namespace basicGetContext() {
		if (isSetNamespace()) {
			return getNamespace();
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Namespace getNamespace() {
		if (eContainerFeatureID != UML2Package.CONSTRAINT__NAMESPACE) return null;
		return (Namespace)eContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNamespace(Namespace newNamespace) {
		if (newNamespace != eContainer || (eContainerFeatureID != UML2Package.CONSTRAINT__NAMESPACE && newNamespace != null)) {
			if (EcoreUtil.isAncestor(this, newNamespace))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString()); //$NON-NLS-1$
			NotificationChain msgs = null;
			if (eContainer != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newNamespace != null)
				msgs = ((InternalEObject)newNamespace).eInverseAdd(this, UML2Package.NAMESPACE__OWNED_RULE, Namespace.class, msgs);
			msgs = eBasicSetContainer((InternalEObject)newNamespace, UML2Package.CONSTRAINT__NAMESPACE, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2Package.CONSTRAINT__NAMESPACE, newNamespace, newNamespace));

	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNamespace() {
		return getNamespace() != null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueSpecification getSpecification() {
		ValueSpecification specification = (ValueSpecification)eVirtualGet(UML2Package.CONSTRAINT__SPECIFICATION);
		return specification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSpecification(ValueSpecification newSpecification, NotificationChain msgs) {
		Object oldSpecification = eVirtualSet(UML2Package.CONSTRAINT__SPECIFICATION, newSpecification);
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UML2Package.CONSTRAINT__SPECIFICATION, oldSpecification == EVIRTUAL_NO_VALUE ? null : oldSpecification, newSpecification);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}

		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpecification(ValueSpecification newSpecification) {
		ValueSpecification specification = (ValueSpecification)eVirtualGet(UML2Package.CONSTRAINT__SPECIFICATION);
		if (newSpecification != specification) {
			NotificationChain msgs = null;
			if (specification != null)
				msgs = ((InternalEObject)specification).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UML2Package.CONSTRAINT__SPECIFICATION, null, msgs);
			if (newSpecification != null)
				msgs = ((InternalEObject)newSpecification).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UML2Package.CONSTRAINT__SPECIFICATION, null, msgs);
			msgs = basicSetSpecification(newSpecification, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2Package.CONSTRAINT__SPECIFICATION, newSpecification, newSpecification));

	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueSpecification createSpecification(EClass eClass) {
		ValueSpecification newSpecification = (ValueSpecification) eClass.getEPackage().getEFactoryInstance().create(eClass);
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, 0, UML2Package.CONSTRAINT__SPECIFICATION, null, newSpecification));
		}
		setSpecification(newSpecification);
		return newSpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getConstrainedElements() {
		EList constrainedElement = (EList)eVirtualGet(UML2Package.CONSTRAINT__CONSTRAINED_ELEMENT);
		if (constrainedElement == null) {
			eVirtualSet(UML2Package.CONSTRAINT__CONSTRAINED_ELEMENT, constrainedElement = new EObjectResolvingEList(Element.class, this, UML2Package.CONSTRAINT__CONSTRAINED_ELEMENT));
		}
		return constrainedElement;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNotApplyToSelf(DiagnosticChain diagnostics, Map context) {
		return ConstraintOperations.validateNotApplyToSelf(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, Class baseClass, NotificationChain msgs) {
		if (featureID >= 0) {
			switch (eDerivedStructuralFeatureID(featureID, baseClass)) {
				case UML2Package.CONSTRAINT__EANNOTATIONS:
					return ((InternalEList)getEAnnotations()).basicAdd(otherEnd, msgs);
				case UML2Package.CONSTRAINT__TEMPLATE_BINDING:
					return ((InternalEList)getTemplateBindings()).basicAdd(otherEnd, msgs);
				case UML2Package.CONSTRAINT__OWNED_TEMPLATE_SIGNATURE:
					TemplateSignature ownedTemplateSignature = (TemplateSignature)eVirtualGet(UML2Package.CONSTRAINT__OWNED_TEMPLATE_SIGNATURE);
					if (ownedTemplateSignature != null)
						msgs = ((InternalEObject)ownedTemplateSignature).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UML2Package.CONSTRAINT__OWNED_TEMPLATE_SIGNATURE, null, msgs);
					return basicSetOwnedTemplateSignature((TemplateSignature)otherEnd, msgs);
				case UML2Package.CONSTRAINT__CLIENT_DEPENDENCY:
					return ((InternalEList)getClientDependencies()).basicAdd(otherEnd, msgs);
				case UML2Package.CONSTRAINT__TEMPLATE_PARAMETER:
					TemplateParameter templateParameter = (TemplateParameter)eVirtualGet(UML2Package.CONSTRAINT__TEMPLATE_PARAMETER);
					if (templateParameter != null)
						msgs = ((InternalEObject)templateParameter).eInverseRemove(this, UML2Package.TEMPLATE_PARAMETER__PARAMETERED_ELEMENT, TemplateParameter.class, msgs);
					return basicSetTemplateParameter((TemplateParameter)otherEnd, msgs);
				case UML2Package.CONSTRAINT__OWNING_PARAMETER:
					if (eContainer != null)
						msgs = eBasicRemoveFromContainer(msgs);
					return eBasicSetContainer(otherEnd, UML2Package.CONSTRAINT__OWNING_PARAMETER, msgs);
				case UML2Package.CONSTRAINT__NAMESPACE:
					if (eContainer != null)
						msgs = eBasicRemoveFromContainer(msgs);
					return eBasicSetContainer(otherEnd, UML2Package.CONSTRAINT__NAMESPACE, msgs);
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
				case UML2Package.CONSTRAINT__EANNOTATIONS:
					return ((InternalEList)getEAnnotations()).basicRemove(otherEnd, msgs);
				case UML2Package.CONSTRAINT__OWNED_COMMENT:
					return ((InternalEList)getOwnedComments()).basicRemove(otherEnd, msgs);
				case UML2Package.CONSTRAINT__TEMPLATE_BINDING:
					return ((InternalEList)getTemplateBindings()).basicRemove(otherEnd, msgs);
				case UML2Package.CONSTRAINT__OWNED_TEMPLATE_SIGNATURE:
					return basicSetOwnedTemplateSignature(null, msgs);
				case UML2Package.CONSTRAINT__CLIENT_DEPENDENCY:
					return ((InternalEList)getClientDependencies()).basicRemove(otherEnd, msgs);
				case UML2Package.CONSTRAINT__NAME_EXPRESSION:
					return basicSetNameExpression(null, msgs);
				case UML2Package.CONSTRAINT__TEMPLATE_PARAMETER:
					return basicSetTemplateParameter(null, msgs);
				case UML2Package.CONSTRAINT__OWNING_PARAMETER:
					return eBasicSetContainer(null, UML2Package.CONSTRAINT__OWNING_PARAMETER, msgs);
				case UML2Package.CONSTRAINT__NAMESPACE:
					return eBasicSetContainer(null, UML2Package.CONSTRAINT__NAMESPACE, msgs);
				case UML2Package.CONSTRAINT__SPECIFICATION:
					return basicSetSpecification(null, msgs);
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
				case UML2Package.CONSTRAINT__OWNING_PARAMETER:
					return eContainer.eInverseRemove(this, UML2Package.TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT, TemplateParameter.class, msgs);
				case UML2Package.CONSTRAINT__NAMESPACE:
					return eContainer.eInverseRemove(this, UML2Package.NAMESPACE__OWNED_RULE, Namespace.class, msgs);
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
			case UML2Package.CONSTRAINT__EANNOTATIONS:
				return getEAnnotations();
			case UML2Package.CONSTRAINT__OWNED_ELEMENT:
				return getOwnedElements();
			case UML2Package.CONSTRAINT__OWNER:
				if (resolve) return getOwner();
				return basicGetOwner();
			case UML2Package.CONSTRAINT__OWNED_COMMENT:
				return getOwnedComments();
			case UML2Package.CONSTRAINT__TEMPLATE_BINDING:
				return getTemplateBindings();
			case UML2Package.CONSTRAINT__OWNED_TEMPLATE_SIGNATURE:
				return getOwnedTemplateSignature();
			case UML2Package.CONSTRAINT__NAME:
				return getName();
			case UML2Package.CONSTRAINT__QUALIFIED_NAME:
				return getQualifiedName();
			case UML2Package.CONSTRAINT__VISIBILITY:
				return getVisibility();
			case UML2Package.CONSTRAINT__CLIENT_DEPENDENCY:
				return getClientDependencies();
			case UML2Package.CONSTRAINT__NAME_EXPRESSION:
				return getNameExpression();
			case UML2Package.CONSTRAINT__TEMPLATE_PARAMETER:
				if (resolve) return getTemplateParameter();
				return basicGetTemplateParameter();
			case UML2Package.CONSTRAINT__OWNING_PARAMETER:
				return getOwningParameter();
			case UML2Package.CONSTRAINT__PACKAGEABLE_ELEMENT_VISIBILITY:
				return getPackageableElement_visibility();
			case UML2Package.CONSTRAINT__CONTEXT:
				if (resolve) return getContext();
				return basicGetContext();
			case UML2Package.CONSTRAINT__NAMESPACE:
				return getNamespace();
			case UML2Package.CONSTRAINT__SPECIFICATION:
				return getSpecification();
			case UML2Package.CONSTRAINT__CONSTRAINED_ELEMENT:
				return getConstrainedElements();
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
			case UML2Package.CONSTRAINT__EANNOTATIONS:
				getEAnnotations().clear();
				getEAnnotations().addAll((Collection)newValue);
				return;
			case UML2Package.CONSTRAINT__OWNED_COMMENT:
				getOwnedComments().clear();
				getOwnedComments().addAll((Collection)newValue);
				return;
			case UML2Package.CONSTRAINT__TEMPLATE_BINDING:
				getTemplateBindings().clear();
				getTemplateBindings().addAll((Collection)newValue);
				return;
			case UML2Package.CONSTRAINT__OWNED_TEMPLATE_SIGNATURE:
				setOwnedTemplateSignature((TemplateSignature)newValue);
				return;
			case UML2Package.CONSTRAINT__NAME:
				setName((String)newValue);
				return;
			case UML2Package.CONSTRAINT__VISIBILITY:
				setVisibility((VisibilityKind)newValue);
				return;
			case UML2Package.CONSTRAINT__CLIENT_DEPENDENCY:
				getClientDependencies().clear();
				getClientDependencies().addAll((Collection)newValue);
				return;
			case UML2Package.CONSTRAINT__NAME_EXPRESSION:
				setNameExpression((StringExpression)newValue);
				return;
			case UML2Package.CONSTRAINT__TEMPLATE_PARAMETER:
				setTemplateParameter((TemplateParameter)newValue);
				return;
			case UML2Package.CONSTRAINT__OWNING_PARAMETER:
				setOwningParameter((TemplateParameter)newValue);
				return;
			case UML2Package.CONSTRAINT__PACKAGEABLE_ELEMENT_VISIBILITY:
				setPackageableElement_visibility((VisibilityKind)newValue);
				return;
			case UML2Package.CONSTRAINT__NAMESPACE:
				setNamespace((Namespace)newValue);
				return;
			case UML2Package.CONSTRAINT__SPECIFICATION:
				setSpecification((ValueSpecification)newValue);
				return;
			case UML2Package.CONSTRAINT__CONSTRAINED_ELEMENT:
				getConstrainedElements().clear();
				getConstrainedElements().addAll((Collection)newValue);
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
			case UML2Package.CONSTRAINT__EANNOTATIONS:
				getEAnnotations().clear();
				return;
			case UML2Package.CONSTRAINT__OWNED_COMMENT:
				getOwnedComments().clear();
				return;
			case UML2Package.CONSTRAINT__TEMPLATE_BINDING:
				getTemplateBindings().clear();
				return;
			case UML2Package.CONSTRAINT__OWNED_TEMPLATE_SIGNATURE:
				setOwnedTemplateSignature((TemplateSignature)null);
				return;
			case UML2Package.CONSTRAINT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case UML2Package.CONSTRAINT__VISIBILITY:
				setVisibility(VISIBILITY_EDEFAULT);
				return;
			case UML2Package.CONSTRAINT__CLIENT_DEPENDENCY:
				getClientDependencies().clear();
				return;
			case UML2Package.CONSTRAINT__NAME_EXPRESSION:
				setNameExpression((StringExpression)null);
				return;
			case UML2Package.CONSTRAINT__TEMPLATE_PARAMETER:
				setTemplateParameter((TemplateParameter)null);
				return;
			case UML2Package.CONSTRAINT__OWNING_PARAMETER:
				setOwningParameter((TemplateParameter)null);
				return;
			case UML2Package.CONSTRAINT__PACKAGEABLE_ELEMENT_VISIBILITY:
				setPackageableElement_visibility(PACKAGEABLE_ELEMENT_VISIBILITY_EDEFAULT);
				return;
			case UML2Package.CONSTRAINT__NAMESPACE:
				setNamespace((Namespace)null);
				return;
			case UML2Package.CONSTRAINT__SPECIFICATION:
				setSpecification((ValueSpecification)null);
				return;
			case UML2Package.CONSTRAINT__CONSTRAINED_ELEMENT:
				getConstrainedElements().clear();
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
			case UML2Package.CONSTRAINT__EANNOTATIONS:
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UML2Package.CONSTRAINT__OWNED_ELEMENT:
				return isSetOwnedElements();
			case UML2Package.CONSTRAINT__OWNER:
				return isSetOwner();
			case UML2Package.CONSTRAINT__OWNED_COMMENT:
				EList ownedComment = (EList)eVirtualGet(UML2Package.CONSTRAINT__OWNED_COMMENT);
				return ownedComment != null && !ownedComment.isEmpty();
			case UML2Package.CONSTRAINT__TEMPLATE_BINDING:
				EList templateBinding = (EList)eVirtualGet(UML2Package.CONSTRAINT__TEMPLATE_BINDING);
				return templateBinding != null && !templateBinding.isEmpty();
			case UML2Package.CONSTRAINT__OWNED_TEMPLATE_SIGNATURE:
				return eVirtualGet(UML2Package.CONSTRAINT__OWNED_TEMPLATE_SIGNATURE) != null;
			case UML2Package.CONSTRAINT__NAME:
				String name = eVirtualIsSet(UML2Package.CONSTRAINT__NAME) ? (String)eVirtualGet(UML2Package.CONSTRAINT__NAME) : NAME_EDEFAULT;
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case UML2Package.CONSTRAINT__QUALIFIED_NAME:
				return QUALIFIED_NAME_EDEFAULT == null ? getQualifiedName() != null : !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case UML2Package.CONSTRAINT__VISIBILITY:
				return eVirtualIsSet(UML2Package.CONSTRAINT__VISIBILITY) && eVirtualGet(UML2Package.CONSTRAINT__VISIBILITY) != VISIBILITY_EDEFAULT;
			case UML2Package.CONSTRAINT__CLIENT_DEPENDENCY:
				EList clientDependency = (EList)eVirtualGet(UML2Package.CONSTRAINT__CLIENT_DEPENDENCY);
				return clientDependency != null && !clientDependency.isEmpty();
			case UML2Package.CONSTRAINT__NAME_EXPRESSION:
				return eVirtualGet(UML2Package.CONSTRAINT__NAME_EXPRESSION) != null;
			case UML2Package.CONSTRAINT__TEMPLATE_PARAMETER:
				return eVirtualGet(UML2Package.CONSTRAINT__TEMPLATE_PARAMETER) != null;
			case UML2Package.CONSTRAINT__OWNING_PARAMETER:
				return getOwningParameter() != null;
			case UML2Package.CONSTRAINT__PACKAGEABLE_ELEMENT_VISIBILITY:
				return isSetPackageableElement_visibility();
			case UML2Package.CONSTRAINT__CONTEXT:
				return isSetContext();
			case UML2Package.CONSTRAINT__NAMESPACE:
				return isSetNamespace();
			case UML2Package.CONSTRAINT__SPECIFICATION:
				return eVirtualGet(UML2Package.CONSTRAINT__SPECIFICATION) != null;
			case UML2Package.CONSTRAINT__CONSTRAINED_ELEMENT:
				EList constrainedElement = (EList)eVirtualGet(UML2Package.CONSTRAINT__CONSTRAINED_ELEMENT);
				return constrainedElement != null && !constrainedElement.isEmpty();
		}
		return eDynamicIsSet(eFeature);
	}


} //ConstraintImpl
