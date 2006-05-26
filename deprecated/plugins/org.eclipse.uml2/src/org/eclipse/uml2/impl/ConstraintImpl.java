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
 * $Id: ConstraintImpl.java,v 1.29 2006/05/26 18:16:42 khussey Exp $
 */
package org.eclipse.uml2.impl;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.resource.Resource;

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

import org.eclipse.uml2.common.util.CacheAdapter;
import org.eclipse.uml2.common.util.DerivedUnionEObjectEList;

import org.eclipse.uml2.internal.operation.ConstraintOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Constraint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2.impl.ConstraintImpl#getContext <em>Context</em>}</li>
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
	 * The cached value of the '{@link #getSpecification() <em>Specification</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecification()
	 * @generated
	 * @ordered
	 */
	protected ValueSpecification specification = null;

	/**
	 * The cached value of the '{@link #getConstrainedElements() <em>Constrained Element</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstrainedElements()
	 * @generated
	 * @ordered
	 */
	protected EList constrainedElements = null;

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
		return UML2Package.Literals.CONSTRAINT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getOwnedElements() {
		CacheAdapter cache = getCacheAdapter();
		if (cache != null) {
			Resource eResource = eResource();
			EList ownedElements = (EList) cache.get(eResource, this, UML2Package.Literals.ELEMENT__OWNED_ELEMENT);
			if (ownedElements == null) {
				cache.put(eResource, this, UML2Package.Literals.ELEMENT__OWNED_ELEMENT, ownedElements = new DerivedUnionEObjectEList(Element.class, this, UML2Package.CONSTRAINT__OWNED_ELEMENT, OWNED_ELEMENT_ESUBSETS));
			}
			return ownedElements;
		}
		return new DerivedUnionEObjectEList(Element.class, this, UML2Package.CONSTRAINT__OWNED_ELEMENT, OWNED_ELEMENT_ESUBSETS);
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOwnedElements() {
		return super.isSetOwnedElements()
			|| eIsSet(UML2Package.CONSTRAINT__SPECIFICATION);
	}

	/**
	 * The array of subset feature identifiers for the '{@link #getOwnedElements() <em>Owned Element</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedElements()
	 * @generated
	 * @ordered
	 */
	protected static final int[] OWNED_ELEMENT_ESUBSETS = new int[] {UML2Package.CONSTRAINT__OWNED_COMMENT, UML2Package.CONSTRAINT__TEMPLATE_BINDING, UML2Package.CONSTRAINT__OWNED_TEMPLATE_SIGNATURE, UML2Package.CONSTRAINT__NAME_EXPRESSION, UML2Package.CONSTRAINT__SPECIFICATION};

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Namespace getContext() {
		Namespace context = basicGetContext();
		return context != null && context.eIsProxy() ? (Namespace)eResolveProxy((InternalEObject)context) : context;
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
		return (Namespace)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNamespace(Namespace newNamespace, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newNamespace, UML2Package.CONSTRAINT__NAMESPACE, msgs);

		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNamespace(Namespace newNamespace) {
		if (newNamespace != eInternalContainer() || (eContainerFeatureID != UML2Package.CONSTRAINT__NAMESPACE && newNamespace != null)) {
			if (EcoreUtil.isAncestor(this, newNamespace))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString()); //$NON-NLS-1$
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newNamespace != null)
				msgs = ((InternalEObject)newNamespace).eInverseAdd(this, UML2Package.NAMESPACE__OWNED_RULE, Namespace.class, msgs);
			msgs = basicSetNamespace(newNamespace, msgs);
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
		return specification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSpecification(ValueSpecification newSpecification, NotificationChain msgs) {
		ValueSpecification oldSpecification = specification;
		specification = newSpecification;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UML2Package.CONSTRAINT__SPECIFICATION, oldSpecification, newSpecification);
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
	 * @generated NOT
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
		if (constrainedElements == null) {
			constrainedElements = new EObjectResolvingEList(Element.class, this, UML2Package.CONSTRAINT__CONSTRAINED_ELEMENT);
		}
		return constrainedElements;
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
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UML2Package.CONSTRAINT__EANNOTATIONS:
				return ((InternalEList)getEAnnotations()).basicAdd(otherEnd, msgs);
			case UML2Package.CONSTRAINT__TEMPLATE_BINDING:
				return ((InternalEList)getTemplateBindings()).basicAdd(otherEnd, msgs);
			case UML2Package.CONSTRAINT__OWNED_TEMPLATE_SIGNATURE:
				if (ownedTemplateSignature != null)
					msgs = ((InternalEObject)ownedTemplateSignature).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UML2Package.CONSTRAINT__OWNED_TEMPLATE_SIGNATURE, null, msgs);
				return basicSetOwnedTemplateSignature((TemplateSignature)otherEnd, msgs);
			case UML2Package.CONSTRAINT__CLIENT_DEPENDENCY:
				return ((InternalEList)getClientDependencies()).basicAdd(otherEnd, msgs);
			case UML2Package.CONSTRAINT__TEMPLATE_PARAMETER:
				if (templateParameter != null)
					msgs = ((InternalEObject)templateParameter).eInverseRemove(this, UML2Package.TEMPLATE_PARAMETER__PARAMETERED_ELEMENT, TemplateParameter.class, msgs);
				return basicSetTemplateParameter((TemplateParameter)otherEnd, msgs);
			case UML2Package.CONSTRAINT__OWNING_PARAMETER:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOwningParameter((TemplateParameter)otherEnd, msgs);
			case UML2Package.CONSTRAINT__NAMESPACE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetNamespace((Namespace)otherEnd, msgs);
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
				return basicSetOwningParameter(null, msgs);
			case UML2Package.CONSTRAINT__NAMESPACE:
				return basicSetNamespace(null, msgs);
			case UML2Package.CONSTRAINT__SPECIFICATION:
				return basicSetSpecification(null, msgs);
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
			case UML2Package.CONSTRAINT__OWNING_PARAMETER:
				return eInternalContainer().eInverseRemove(this, UML2Package.TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT, TemplateParameter.class, msgs);
			case UML2Package.CONSTRAINT__NAMESPACE:
				return eInternalContainer().eInverseRemove(this, UML2Package.NAMESPACE__OWNED_RULE, Namespace.class, msgs);
		}
		return eDynamicBasicRemoveFromContainer(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
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
		return eDynamicGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
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
		eDynamicSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eUnset(int featureID) {
		switch (featureID) {
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
		eDynamicUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case UML2Package.CONSTRAINT__EANNOTATIONS:
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UML2Package.CONSTRAINT__OWNED_ELEMENT:
				return isSetOwnedElements();
			case UML2Package.CONSTRAINT__OWNER:
				return isSetOwner();
			case UML2Package.CONSTRAINT__OWNED_COMMENT:
				return ownedComments != null && !ownedComments.isEmpty();
			case UML2Package.CONSTRAINT__TEMPLATE_BINDING:
				return templateBindings != null && !templateBindings.isEmpty();
			case UML2Package.CONSTRAINT__OWNED_TEMPLATE_SIGNATURE:
				return ownedTemplateSignature != null;
			case UML2Package.CONSTRAINT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case UML2Package.CONSTRAINT__QUALIFIED_NAME:
				return QUALIFIED_NAME_EDEFAULT == null ? getQualifiedName() != null : !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case UML2Package.CONSTRAINT__VISIBILITY:
				return isSetVisibility();
			case UML2Package.CONSTRAINT__CLIENT_DEPENDENCY:
				return clientDependencies != null && !clientDependencies.isEmpty();
			case UML2Package.CONSTRAINT__NAME_EXPRESSION:
				return nameExpression != null;
			case UML2Package.CONSTRAINT__TEMPLATE_PARAMETER:
				return templateParameter != null;
			case UML2Package.CONSTRAINT__OWNING_PARAMETER:
				return getOwningParameter() != null;
			case UML2Package.CONSTRAINT__PACKAGEABLE_ELEMENT_VISIBILITY:
				return isSetPackageableElement_visibility();
			case UML2Package.CONSTRAINT__CONTEXT:
				return isSetContext();
			case UML2Package.CONSTRAINT__NAMESPACE:
				return isSetNamespace();
			case UML2Package.CONSTRAINT__SPECIFICATION:
				return specification != null;
			case UML2Package.CONSTRAINT__CONSTRAINED_ELEMENT:
				return constrainedElements != null && !constrainedElements.isEmpty();
		}
		return eDynamicIsSet(featureID);
	}


} //ConstraintImpl
