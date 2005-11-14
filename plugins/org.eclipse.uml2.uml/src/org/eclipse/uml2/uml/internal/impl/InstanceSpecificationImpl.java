/*
 * Copyright (c) 2005 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *
 * $Id: InstanceSpecificationImpl.java,v 1.1 2005/11/14 22:26:04 khussey Exp $
 */
package org.eclipse.uml2.uml.internal.impl;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.uml2.common.util.DerivedUnionEObjectEList;

import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.DeployedArtifact;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.InstanceSpecification;
import org.eclipse.uml2.uml.PackageableElement;
import org.eclipse.uml2.uml.ParameterableElement;
import org.eclipse.uml2.uml.Slot;
import org.eclipse.uml2.uml.StringExpression;
import org.eclipse.uml2.uml.TemplateParameter;
import org.eclipse.uml2.uml.UMLFactory;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.ValueSpecification;
import org.eclipse.uml2.uml.VisibilityKind;

import org.eclipse.uml2.uml.internal.operations.InstanceSpecificationOperations;
import org.eclipse.uml2.uml.internal.operations.ParameterableElementOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Instance Specification</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.InstanceSpecificationImpl#getTemplateParameter <em>Template Parameter</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.InstanceSpecificationImpl#getOwningTemplateParameter <em>Owning Template Parameter</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.InstanceSpecificationImpl#getVisibility <em>Visibility</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.InstanceSpecificationImpl#getOwnedElements <em>Owned Element</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.InstanceSpecificationImpl#getClassifiers <em>Classifier</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.InstanceSpecificationImpl#getSpecification <em>Specification</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.InstanceSpecificationImpl#getSlots <em>Slot</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InstanceSpecificationImpl
		extends DeploymentTargetImpl
		implements InstanceSpecification {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InstanceSpecificationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return UMLPackage.eINSTANCE.getInstanceSpecification();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemplateParameter getTemplateParameter() {
		TemplateParameter templateParameter = (TemplateParameter) eVirtualGet(UMLPackage.INSTANCE_SPECIFICATION__TEMPLATE_PARAMETER);
		if (templateParameter != null && templateParameter.eIsProxy()) {
			TemplateParameter oldTemplateParameter = templateParameter;
			templateParameter = (TemplateParameter) eResolveProxy((InternalEObject) templateParameter);
			if (templateParameter != oldTemplateParameter) {
				eVirtualSet(
					UMLPackage.INSTANCE_SPECIFICATION__TEMPLATE_PARAMETER,
					templateParameter);
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
						UMLPackage.INSTANCE_SPECIFICATION__TEMPLATE_PARAMETER,
						oldTemplateParameter, templateParameter));
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
		return (TemplateParameter) eVirtualGet(UMLPackage.INSTANCE_SPECIFICATION__TEMPLATE_PARAMETER);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTemplateParameter(
			TemplateParameter newTemplateParameter, NotificationChain msgs) {
		Object oldTemplateParameter = eVirtualSet(
			UMLPackage.INSTANCE_SPECIFICATION__TEMPLATE_PARAMETER,
			newTemplateParameter);
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
				Notification.SET,
				UMLPackage.INSTANCE_SPECIFICATION__TEMPLATE_PARAMETER,
				oldTemplateParameter == EVIRTUAL_NO_VALUE
					? null
					: oldTemplateParameter, newTemplateParameter);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}

		if (getOwningTemplateParameter() != null
			&& getOwningTemplateParameter() != newTemplateParameter) {
			setOwningTemplateParameter(null);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTemplateParameter(TemplateParameter newTemplateParameter) {
		TemplateParameter templateParameter = (TemplateParameter) eVirtualGet(UMLPackage.INSTANCE_SPECIFICATION__TEMPLATE_PARAMETER);
		if (newTemplateParameter != templateParameter) {
			NotificationChain msgs = null;
			if (templateParameter != null)
				msgs = ((InternalEObject) templateParameter).eInverseRemove(
					this, UMLPackage.TEMPLATE_PARAMETER__PARAMETERED_ELEMENT,
					TemplateParameter.class, msgs);
			if (newTemplateParameter != null)
				msgs = ((InternalEObject) newTemplateParameter).eInverseAdd(
					this, UMLPackage.TEMPLATE_PARAMETER__PARAMETERED_ELEMENT,
					TemplateParameter.class, msgs);
			msgs = basicSetTemplateParameter(newTemplateParameter, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.INSTANCE_SPECIFICATION__TEMPLATE_PARAMETER,
				newTemplateParameter, newTemplateParameter));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemplateParameter getOwningTemplateParameter() {
		if (eContainerFeatureID != UMLPackage.INSTANCE_SPECIFICATION__OWNING_TEMPLATE_PARAMETER)
			return null;
		return (TemplateParameter) eContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwningTemplateParameter(
			TemplateParameter newOwningTemplateParameter) {
		EObject oldOwningTemplateParameter = eContainer;
		if (newOwningTemplateParameter != eContainer
			|| (eContainerFeatureID != UMLPackage.INSTANCE_SPECIFICATION__OWNING_TEMPLATE_PARAMETER && newOwningTemplateParameter != null)) {
			if (EcoreUtil
				.isAncestor(this, (EObject) newOwningTemplateParameter))
				throw new IllegalArgumentException(
					"Recursive containment not allowed for " + toString()); //$NON-NLS-1$
			NotificationChain msgs = null;
			if (eContainer != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOwningTemplateParameter != null)
				msgs = ((InternalEObject) newOwningTemplateParameter)
					.eInverseAdd(
						this,
						UMLPackage.TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT,
						TemplateParameter.class, msgs);
			msgs = eBasicSetContainer(
				(InternalEObject) newOwningTemplateParameter,
				UMLPackage.INSTANCE_SPECIFICATION__OWNING_TEMPLATE_PARAMETER,
				msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.INSTANCE_SPECIFICATION__OWNING_TEMPLATE_PARAMETER,
				newOwningTemplateParameter, newOwningTemplateParameter));

		if (newOwningTemplateParameter != null
			|| oldOwningTemplateParameter == eVirtualGet(UMLPackage.INSTANCE_SPECIFICATION__TEMPLATE_PARAMETER)) {
			setTemplateParameter(newOwningTemplateParameter);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VisibilityKind getVisibility() {
		VisibilityKind visibility = (VisibilityKind) eVirtualGet(UMLPackage.INSTANCE_SPECIFICATION__VISIBILITY);
		return visibility == null
			? VISIBILITY_EDEFAULT
			: visibility;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVisibility(VisibilityKind newVisibility) {
		VisibilityKind visibility = newVisibility == null
			? VISIBILITY_EDEFAULT
			: newVisibility;
		Object oldVisibility = eVirtualSet(
			UMLPackage.INSTANCE_SPECIFICATION__VISIBILITY, visibility);
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.INSTANCE_SPECIFICATION__VISIBILITY,
				oldVisibility == EVIRTUAL_NO_VALUE
					? VISIBILITY_EDEFAULT
					: oldVisibility, visibility));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetVisibility() {
		return eVirtualIsSet(UMLPackage.INSTANCE_SPECIFICATION__VISIBILITY)
			&& eVirtualGet(UMLPackage.INSTANCE_SPECIFICATION__VISIBILITY) != VISIBILITY_EDEFAULT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List getOwnedElements() {
		List ownedElement = (List) eVirtualGet(UMLPackage.INSTANCE_SPECIFICATION__OWNED_ELEMENT);
		if (ownedElement == null) {
			eVirtualSet(UMLPackage.INSTANCE_SPECIFICATION__OWNED_ELEMENT,
				ownedElement = new DerivedUnionEObjectEList(Element.class,
					this, UMLPackage.INSTANCE_SPECIFICATION__OWNED_ELEMENT,
					new EStructuralFeature[]{
						UMLPackage.eINSTANCE.getElement_OwnedComment(),
						UMLPackage.eINSTANCE.getNamedElement_NameExpression(),
						UMLPackage.eINSTANCE.getDeploymentTarget_Deployment(),
						UMLPackage.eINSTANCE
							.getInstanceSpecification_Specification(),
						UMLPackage.eINSTANCE.getInstanceSpecification_Slot()}));
		}
		return ownedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List getClassifiers() {
		List classifier = (List) eVirtualGet(UMLPackage.INSTANCE_SPECIFICATION__CLASSIFIER);
		if (classifier == null) {
			eVirtualSet(UMLPackage.INSTANCE_SPECIFICATION__CLASSIFIER,
				classifier = new EObjectResolvingEList(Classifier.class, this,
					UMLPackage.INSTANCE_SPECIFICATION__CLASSIFIER));
		}
		return classifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Classifier getClassifier(String name) {
		for (Iterator i = getClassifiers().iterator(); i.hasNext();) {
			Classifier classifier = (Classifier) i.next();
			if (name.equals(classifier.getName())) {
				return classifier;
			}
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueSpecification getSpecification() {
		ValueSpecification specification = (ValueSpecification) eVirtualGet(UMLPackage.INSTANCE_SPECIFICATION__SPECIFICATION);
		return specification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSpecification(
			ValueSpecification newSpecification, NotificationChain msgs) {
		Object oldSpecification = eVirtualSet(
			UMLPackage.INSTANCE_SPECIFICATION__SPECIFICATION, newSpecification);
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
				Notification.SET,
				UMLPackage.INSTANCE_SPECIFICATION__SPECIFICATION,
				oldSpecification == EVIRTUAL_NO_VALUE
					? null
					: oldSpecification, newSpecification);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}

		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpecification(ValueSpecification newSpecification) {
		ValueSpecification specification = (ValueSpecification) eVirtualGet(UMLPackage.INSTANCE_SPECIFICATION__SPECIFICATION);
		if (newSpecification != specification) {
			NotificationChain msgs = null;
			if (specification != null)
				msgs = ((InternalEObject) specification).eInverseRemove(this,
					EOPPOSITE_FEATURE_BASE
						- UMLPackage.INSTANCE_SPECIFICATION__SPECIFICATION,
					null, msgs);
			if (newSpecification != null)
				msgs = ((InternalEObject) newSpecification).eInverseAdd(this,
					EOPPOSITE_FEATURE_BASE
						- UMLPackage.INSTANCE_SPECIFICATION__SPECIFICATION,
					null, msgs);
			msgs = basicSetSpecification(newSpecification, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.INSTANCE_SPECIFICATION__SPECIFICATION,
				newSpecification, newSpecification));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueSpecification createSpecification(EClass eClass) {
		ValueSpecification newSpecification = (ValueSpecification) eClass
			.getEPackage().getEFactoryInstance().create(eClass);
		setSpecification(newSpecification);
		return newSpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List getSlots() {
		List slot = (List) eVirtualGet(UMLPackage.INSTANCE_SPECIFICATION__SLOT);
		if (slot == null) {
			eVirtualSet(UMLPackage.INSTANCE_SPECIFICATION__SLOT,
				slot = new EObjectContainmentWithInverseEList(Slot.class, this,
					UMLPackage.INSTANCE_SPECIFICATION__SLOT,
					UMLPackage.SLOT__OWNING_INSTANCE));
		}
		return slot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Slot createSlot() {
		Slot newSlot = UMLFactory.eINSTANCE.createSlot();
		getSlots().add(newSlot);
		return newSlot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isCompatibleWith(ParameterableElement p) {
		return ParameterableElementOperations.isCompatibleWith(this, p);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isTemplateParameter() {
		return ParameterableElementOperations.isTemplateParameter(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDefiningFeature(DiagnosticChain diagnostics,
			Map context) {
		return InstanceSpecificationOperations.validateDefiningFeature(this,
			diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStructuralFeature(DiagnosticChain diagnostics,
			Map context) {
		return InstanceSpecificationOperations.validateStructuralFeature(this,
			diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDeploymentTarget(DiagnosticChain diagnostics,
			Map context) {
		return InstanceSpecificationOperations.validateDeploymentTarget(this,
			diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDeploymentArtifact(DiagnosticChain diagnostics,
			Map context) {
		return InstanceSpecificationOperations.validateDeploymentArtifact(this,
			diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd,
			int featureID, Class baseClass, NotificationChain msgs) {
		if (featureID >= 0) {
			switch (eDerivedStructuralFeatureID(featureID, baseClass)) {
				case UMLPackage.INSTANCE_SPECIFICATION__EANNOTATIONS :
					return ((InternalEList) getEAnnotations()).basicAdd(
						otherEnd, msgs);
				case UMLPackage.INSTANCE_SPECIFICATION__CLIENT_DEPENDENCY :
					return ((InternalEList) getClientDependencies()).basicAdd(
						otherEnd, msgs);
				case UMLPackage.INSTANCE_SPECIFICATION__DEPLOYMENT :
					return ((InternalEList) getDeployments()).basicAdd(
						otherEnd, msgs);
				case UMLPackage.INSTANCE_SPECIFICATION__TEMPLATE_PARAMETER :
					TemplateParameter templateParameter = (TemplateParameter) eVirtualGet(UMLPackage.INSTANCE_SPECIFICATION__TEMPLATE_PARAMETER);
					if (templateParameter != null)
						msgs = ((InternalEObject) templateParameter)
							.eInverseRemove(
								this,
								UMLPackage.TEMPLATE_PARAMETER__PARAMETERED_ELEMENT,
								TemplateParameter.class, msgs);
					return basicSetTemplateParameter(
						(TemplateParameter) otherEnd, msgs);
				case UMLPackage.INSTANCE_SPECIFICATION__OWNING_TEMPLATE_PARAMETER :
					if (eContainer != null)
						msgs = eBasicRemoveFromContainer(msgs);
					return eBasicSetContainer(
						otherEnd,
						UMLPackage.INSTANCE_SPECIFICATION__OWNING_TEMPLATE_PARAMETER,
						msgs);
				case UMLPackage.INSTANCE_SPECIFICATION__SLOT :
					return ((InternalEList) getSlots())
						.basicAdd(otherEnd, msgs);
				default :
					return eDynamicInverseAdd(otherEnd, featureID, baseClass,
						msgs);
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
	public NotificationChain eInverseRemove(InternalEObject otherEnd,
			int featureID, Class baseClass, NotificationChain msgs) {
		if (featureID >= 0) {
			switch (eDerivedStructuralFeatureID(featureID, baseClass)) {
				case UMLPackage.INSTANCE_SPECIFICATION__EANNOTATIONS :
					return ((InternalEList) getEAnnotations()).basicRemove(
						otherEnd, msgs);
				case UMLPackage.INSTANCE_SPECIFICATION__OWNED_COMMENT :
					return ((InternalEList) getOwnedComments()).basicRemove(
						otherEnd, msgs);
				case UMLPackage.INSTANCE_SPECIFICATION__CLIENT_DEPENDENCY :
					return ((InternalEList) getClientDependencies())
						.basicRemove(otherEnd, msgs);
				case UMLPackage.INSTANCE_SPECIFICATION__NAME_EXPRESSION :
					return basicSetNameExpression(null, msgs);
				case UMLPackage.INSTANCE_SPECIFICATION__DEPLOYMENT :
					return ((InternalEList) getDeployments()).basicRemove(
						otherEnd, msgs);
				case UMLPackage.INSTANCE_SPECIFICATION__TEMPLATE_PARAMETER :
					return basicSetTemplateParameter(null, msgs);
				case UMLPackage.INSTANCE_SPECIFICATION__OWNING_TEMPLATE_PARAMETER :
					return eBasicSetContainer(
						null,
						UMLPackage.INSTANCE_SPECIFICATION__OWNING_TEMPLATE_PARAMETER,
						msgs);
				case UMLPackage.INSTANCE_SPECIFICATION__SPECIFICATION :
					return basicSetSpecification(null, msgs);
				case UMLPackage.INSTANCE_SPECIFICATION__SLOT :
					return ((InternalEList) getSlots()).basicRemove(otherEnd,
						msgs);
				default :
					return eDynamicInverseRemove(otherEnd, featureID,
						baseClass, msgs);
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
				case UMLPackage.INSTANCE_SPECIFICATION__OWNING_TEMPLATE_PARAMETER :
					return eContainer
						.eInverseRemove(
							this,
							UMLPackage.TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT,
							TemplateParameter.class, msgs);
				default :
					return eDynamicBasicRemoveFromContainer(msgs);
			}
		}
		return eContainer.eInverseRemove(this, EOPPOSITE_FEATURE_BASE
			- eContainerFeatureID, null, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(EStructuralFeature eFeature, boolean resolve) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case UMLPackage.INSTANCE_SPECIFICATION__EANNOTATIONS :
				return getEAnnotations();
			case UMLPackage.INSTANCE_SPECIFICATION__OWNED_ELEMENT :
				return getOwnedElements();
			case UMLPackage.INSTANCE_SPECIFICATION__OWNER :
				if (resolve)
					return getOwner();
				return basicGetOwner();
			case UMLPackage.INSTANCE_SPECIFICATION__OWNED_COMMENT :
				return getOwnedComments();
			case UMLPackage.INSTANCE_SPECIFICATION__NAME :
				return getName();
			case UMLPackage.INSTANCE_SPECIFICATION__VISIBILITY :
				return getVisibility();
			case UMLPackage.INSTANCE_SPECIFICATION__QUALIFIED_NAME :
				return getQualifiedName();
			case UMLPackage.INSTANCE_SPECIFICATION__CLIENT_DEPENDENCY :
				return getClientDependencies();
			case UMLPackage.INSTANCE_SPECIFICATION__NAMESPACE :
				if (resolve)
					return getNamespace();
				return basicGetNamespace();
			case UMLPackage.INSTANCE_SPECIFICATION__NAME_EXPRESSION :
				return getNameExpression();
			case UMLPackage.INSTANCE_SPECIFICATION__DEPLOYMENT :
				return getDeployments();
			case UMLPackage.INSTANCE_SPECIFICATION__DEPLOYED_ELEMENT :
				return getDeployedElements();
			case UMLPackage.INSTANCE_SPECIFICATION__TEMPLATE_PARAMETER :
				if (resolve)
					return getTemplateParameter();
				return basicGetTemplateParameter();
			case UMLPackage.INSTANCE_SPECIFICATION__OWNING_TEMPLATE_PARAMETER :
				return getOwningTemplateParameter();
			case UMLPackage.INSTANCE_SPECIFICATION__CLASSIFIER :
				return getClassifiers();
			case UMLPackage.INSTANCE_SPECIFICATION__SPECIFICATION :
				return getSpecification();
			case UMLPackage.INSTANCE_SPECIFICATION__SLOT :
				return getSlots();
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
			case UMLPackage.INSTANCE_SPECIFICATION__EANNOTATIONS :
				getEAnnotations().clear();
				getEAnnotations().addAll((Collection) newValue);
				return;
			case UMLPackage.INSTANCE_SPECIFICATION__OWNED_COMMENT :
				getOwnedComments().clear();
				getOwnedComments().addAll((Collection) newValue);
				return;
			case UMLPackage.INSTANCE_SPECIFICATION__NAME :
				setName((String) newValue);
				return;
			case UMLPackage.INSTANCE_SPECIFICATION__VISIBILITY :
				setVisibility((VisibilityKind) newValue);
				return;
			case UMLPackage.INSTANCE_SPECIFICATION__CLIENT_DEPENDENCY :
				getClientDependencies().clear();
				getClientDependencies().addAll((Collection) newValue);
				return;
			case UMLPackage.INSTANCE_SPECIFICATION__NAME_EXPRESSION :
				setNameExpression((StringExpression) newValue);
				return;
			case UMLPackage.INSTANCE_SPECIFICATION__DEPLOYMENT :
				getDeployments().clear();
				getDeployments().addAll((Collection) newValue);
				return;
			case UMLPackage.INSTANCE_SPECIFICATION__TEMPLATE_PARAMETER :
				setTemplateParameter((TemplateParameter) newValue);
				return;
			case UMLPackage.INSTANCE_SPECIFICATION__OWNING_TEMPLATE_PARAMETER :
				setOwningTemplateParameter((TemplateParameter) newValue);
				return;
			case UMLPackage.INSTANCE_SPECIFICATION__CLASSIFIER :
				getClassifiers().clear();
				getClassifiers().addAll((Collection) newValue);
				return;
			case UMLPackage.INSTANCE_SPECIFICATION__SPECIFICATION :
				setSpecification((ValueSpecification) newValue);
				return;
			case UMLPackage.INSTANCE_SPECIFICATION__SLOT :
				getSlots().clear();
				getSlots().addAll((Collection) newValue);
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
			case UMLPackage.INSTANCE_SPECIFICATION__EANNOTATIONS :
				getEAnnotations().clear();
				return;
			case UMLPackage.INSTANCE_SPECIFICATION__OWNED_COMMENT :
				getOwnedComments().clear();
				return;
			case UMLPackage.INSTANCE_SPECIFICATION__NAME :
				setName(NAME_EDEFAULT);
				return;
			case UMLPackage.INSTANCE_SPECIFICATION__VISIBILITY :
				setVisibility(VISIBILITY_EDEFAULT);
				return;
			case UMLPackage.INSTANCE_SPECIFICATION__CLIENT_DEPENDENCY :
				getClientDependencies().clear();
				return;
			case UMLPackage.INSTANCE_SPECIFICATION__NAME_EXPRESSION :
				setNameExpression((StringExpression) null);
				return;
			case UMLPackage.INSTANCE_SPECIFICATION__DEPLOYMENT :
				getDeployments().clear();
				return;
			case UMLPackage.INSTANCE_SPECIFICATION__TEMPLATE_PARAMETER :
				setTemplateParameter((TemplateParameter) null);
				return;
			case UMLPackage.INSTANCE_SPECIFICATION__OWNING_TEMPLATE_PARAMETER :
				setOwningTemplateParameter((TemplateParameter) null);
				return;
			case UMLPackage.INSTANCE_SPECIFICATION__CLASSIFIER :
				getClassifiers().clear();
				return;
			case UMLPackage.INSTANCE_SPECIFICATION__SPECIFICATION :
				setSpecification((ValueSpecification) null);
				return;
			case UMLPackage.INSTANCE_SPECIFICATION__SLOT :
				getSlots().clear();
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
			case UMLPackage.INSTANCE_SPECIFICATION__EANNOTATIONS :
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UMLPackage.INSTANCE_SPECIFICATION__OWNED_ELEMENT :
				return isSetOwnedElements();
			case UMLPackage.INSTANCE_SPECIFICATION__OWNER :
				return isSetOwner();
			case UMLPackage.INSTANCE_SPECIFICATION__OWNED_COMMENT :
				List ownedComment = (List) eVirtualGet(UMLPackage.INSTANCE_SPECIFICATION__OWNED_COMMENT);
				return ownedComment != null && !ownedComment.isEmpty();
			case UMLPackage.INSTANCE_SPECIFICATION__NAME :
				String name = eVirtualIsSet(UMLPackage.INSTANCE_SPECIFICATION__NAME)
					? (String) eVirtualGet(UMLPackage.INSTANCE_SPECIFICATION__NAME)
					: NAME_EDEFAULT;
				return NAME_EDEFAULT == null
					? name != null
					: !NAME_EDEFAULT.equals(name);
			case UMLPackage.INSTANCE_SPECIFICATION__VISIBILITY :
				return eVirtualIsSet(UMLPackage.INSTANCE_SPECIFICATION__VISIBILITY)
					&& eVirtualGet(UMLPackage.INSTANCE_SPECIFICATION__VISIBILITY) != VISIBILITY_EDEFAULT;
			case UMLPackage.INSTANCE_SPECIFICATION__QUALIFIED_NAME :
				return QUALIFIED_NAME_EDEFAULT == null
					? getQualifiedName() != null
					: !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case UMLPackage.INSTANCE_SPECIFICATION__CLIENT_DEPENDENCY :
				List clientDependency = (List) eVirtualGet(UMLPackage.INSTANCE_SPECIFICATION__CLIENT_DEPENDENCY);
				return clientDependency != null && !clientDependency.isEmpty();
			case UMLPackage.INSTANCE_SPECIFICATION__NAMESPACE :
				return isSetNamespace();
			case UMLPackage.INSTANCE_SPECIFICATION__NAME_EXPRESSION :
				return eVirtualGet(UMLPackage.INSTANCE_SPECIFICATION__NAME_EXPRESSION) != null;
			case UMLPackage.INSTANCE_SPECIFICATION__DEPLOYMENT :
				List deployment = (List) eVirtualGet(UMLPackage.INSTANCE_SPECIFICATION__DEPLOYMENT);
				return deployment != null && !deployment.isEmpty();
			case UMLPackage.INSTANCE_SPECIFICATION__DEPLOYED_ELEMENT :
				return !getDeployedElements().isEmpty();
			case UMLPackage.INSTANCE_SPECIFICATION__TEMPLATE_PARAMETER :
				return eVirtualGet(UMLPackage.INSTANCE_SPECIFICATION__TEMPLATE_PARAMETER) != null;
			case UMLPackage.INSTANCE_SPECIFICATION__OWNING_TEMPLATE_PARAMETER :
				return getOwningTemplateParameter() != null;
			case UMLPackage.INSTANCE_SPECIFICATION__CLASSIFIER :
				List classifier = (List) eVirtualGet(UMLPackage.INSTANCE_SPECIFICATION__CLASSIFIER);
				return classifier != null && !classifier.isEmpty();
			case UMLPackage.INSTANCE_SPECIFICATION__SPECIFICATION :
				return eVirtualGet(UMLPackage.INSTANCE_SPECIFICATION__SPECIFICATION) != null;
			case UMLPackage.INSTANCE_SPECIFICATION__SLOT :
				List slot = (List) eVirtualGet(UMLPackage.INSTANCE_SPECIFICATION__SLOT);
				return slot != null && !slot.isEmpty();
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
				case UMLPackage.INSTANCE_SPECIFICATION__TEMPLATE_PARAMETER :
					return UMLPackage.PARAMETERABLE_ELEMENT__TEMPLATE_PARAMETER;
				case UMLPackage.INSTANCE_SPECIFICATION__OWNING_TEMPLATE_PARAMETER :
					return UMLPackage.PARAMETERABLE_ELEMENT__OWNING_TEMPLATE_PARAMETER;
				default :
					return -1;
			}
		}
		if (baseClass == PackageableElement.class) {
			switch (derivedFeatureID) {
				default :
					return -1;
			}
		}
		if (baseClass == DeployedArtifact.class) {
			switch (derivedFeatureID) {
				default :
					return -1;
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
				case UMLPackage.PARAMETERABLE_ELEMENT__TEMPLATE_PARAMETER :
					return UMLPackage.INSTANCE_SPECIFICATION__TEMPLATE_PARAMETER;
				case UMLPackage.PARAMETERABLE_ELEMENT__OWNING_TEMPLATE_PARAMETER :
					return UMLPackage.INSTANCE_SPECIFICATION__OWNING_TEMPLATE_PARAMETER;
				default :
					return -1;
			}
		}
		if (baseClass == PackageableElement.class) {
			switch (baseFeatureID) {
				default :
					return -1;
			}
		}
		if (baseClass == DeployedArtifact.class) {
			switch (baseFeatureID) {
				default :
					return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (visibility: "); //$NON-NLS-1$
		result
			.append(eVirtualIsSet(UMLPackage.INSTANCE_SPECIFICATION__VISIBILITY)
				? eVirtualGet(UMLPackage.INSTANCE_SPECIFICATION__VISIBILITY)
				: VISIBILITY_EDEFAULT);
		result.append(')');
		return result.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Element basicGetOwner() {
		TemplateParameter owningTemplateParameter = getOwningTemplateParameter();
		if (owningTemplateParameter != null) {
			return owningTemplateParameter;
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
			|| eIsSet(UMLPackage.eINSTANCE
				.getParameterableElement_OwningTemplateParameter());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOwnedElements() {
		return super.isSetOwnedElements()
			|| eIsSet(UMLPackage.eINSTANCE
				.getInstanceSpecification_Specification())
			|| eIsSet(UMLPackage.eINSTANCE.getInstanceSpecification_Slot());
	}

} //InstanceSpecificationImpl
