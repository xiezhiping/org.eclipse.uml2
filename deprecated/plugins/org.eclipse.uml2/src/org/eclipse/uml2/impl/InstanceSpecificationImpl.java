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
 * $Id: InstanceSpecificationImpl.java,v 1.33 2006/04/10 20:40:17 khussey Exp $
 */
package org.eclipse.uml2.impl;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EcoreEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.uml2.Classifier;
import org.eclipse.uml2.Dependency;
import org.eclipse.uml2.DeployedArtifact;
import org.eclipse.uml2.Deployment;
import org.eclipse.uml2.DeploymentTarget;
import org.eclipse.uml2.Element;
import org.eclipse.uml2.InstanceSpecification;
import org.eclipse.uml2.PackageableElement;
import org.eclipse.uml2.Slot;
import org.eclipse.uml2.StringExpression;
import org.eclipse.uml2.TemplateParameter;
import org.eclipse.uml2.TemplateSignature;
import org.eclipse.uml2.UML2Factory;
import org.eclipse.uml2.UML2Package;
import org.eclipse.uml2.ValueSpecification;
import org.eclipse.uml2.VisibilityKind;

import org.eclipse.uml2.common.util.DerivedUnionEObjectEList;
import org.eclipse.uml2.common.util.SubsetSupersetEObjectContainmentWithInverseEList;
import org.eclipse.uml2.common.util.SubsetSupersetEObjectWithInverseResolvingEList;

import org.eclipse.uml2.common.util.CacheAdapter;
import org.eclipse.uml2.internal.operation.DeploymentTargetOperations;
import org.eclipse.uml2.internal.operation.InstanceSpecificationOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Instance Specification</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2.impl.InstanceSpecificationImpl#getClientDependencies <em>Client Dependency</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.InstanceSpecificationImpl#getDeployments <em>Deployment</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.InstanceSpecificationImpl#getDeployedElements <em>Deployed Element</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.InstanceSpecificationImpl#getSlots <em>Slot</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.InstanceSpecificationImpl#getClassifiers <em>Classifier</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.InstanceSpecificationImpl#getSpecification <em>Specification</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InstanceSpecificationImpl extends PackageableElementImpl implements InstanceSpecification {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) IBM Corporation and others."; //$NON-NLS-1$

	/**
	 * The cached value of the '{@link #getDeployments() <em>Deployment</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeployments()
	 * @generated
	 * @ordered
	 */
	protected EList deployments = null;

	/**
	 * The cached value of the '{@link #getSlots() <em>Slot</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSlots()
	 * @generated
	 * @ordered
	 */
	protected EList slots = null;

	/**
	 * The cached value of the '{@link #getClassifiers() <em>Classifier</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassifiers()
	 * @generated
	 * @ordered
	 */
	protected EList classifiers = null;

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
		return UML2Package.Literals.INSTANCE_SPECIFICATION;
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
				cache.put(eResource, this, UML2Package.Literals.ELEMENT__OWNED_ELEMENT, ownedElements = new DerivedUnionEObjectEList(Element.class, this, UML2Package.INSTANCE_SPECIFICATION__OWNED_ELEMENT, OWNED_ELEMENT_ESUBSETS));
			}
			return ownedElements;
		}
		return new DerivedUnionEObjectEList(Element.class, this, UML2Package.INSTANCE_SPECIFICATION__OWNED_ELEMENT, OWNED_ELEMENT_ESUBSETS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOwnedElements() {
		return super.isSetOwnedElements()
			|| eIsSet(UML2Package.INSTANCE_SPECIFICATION__DEPLOYMENT)
			|| eIsSet(UML2Package.INSTANCE_SPECIFICATION__SLOT)
			|| eIsSet(UML2Package.INSTANCE_SPECIFICATION__SPECIFICATION);
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getDeployments() {
		if (deployments == null) {
			deployments = new SubsetSupersetEObjectContainmentWithInverseEList(Deployment.class, this, UML2Package.INSTANCE_SPECIFICATION__DEPLOYMENT, DEPLOYMENT_ESUPERSETS, null, UML2Package.DEPLOYMENT__LOCATION);
		}
		return deployments;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
    public Deployment getDeployment(String name) {
		return getDeployment(name, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Deployment getDeployment(String name, boolean ignoreCase) {
		deploymentLoop: for (Iterator i = getDeployments().iterator(); i.hasNext(); ) {
			Deployment deployment = (Deployment) i.next();
			if (name != null && !(ignoreCase ? name.equalsIgnoreCase(deployment.getName()) : name.equals(deployment.getName())))
				continue deploymentLoop;
			return deployment;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 * @deprecated Use #createDeployment() instead.
	 */
	public Deployment createDeployment(EClass eClass) {
		Deployment newDeployment = (Deployment) eClass.getEPackage().getEFactoryInstance().create(eClass);
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, 0, UML2Package.INSTANCE_SPECIFICATION__DEPLOYMENT, null, newDeployment));
		}
		getDeployments().add(newDeployment);
		return newDeployment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Deployment createDeployment() {
		Deployment newDeployment = UML2Factory.eINSTANCE.createDeployment();
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, 0, UML2Package.INSTANCE_SPECIFICATION__DEPLOYMENT, null, newDeployment));
		}
		getDeployments().add(newDeployment);
		return newDeployment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList getDeployedElements() {
		CacheAdapter cache = getCacheAdapter();

		if (cache != null) {
			EList result = (EList) cache.get(this,
				UML2Package.Literals.DEPLOYMENT_TARGET__DEPLOYED_ELEMENT);

			if (result == null) {
				EList deployedElements = DeploymentTargetOperations
					.getDeployedElements(this);
				cache
					.put(
						this,
						UML2Package.Literals.DEPLOYMENT_TARGET__DEPLOYED_ELEMENT,
						result = new EcoreEList.UnmodifiableEList(
							this,
							UML2Package.Literals.DEPLOYMENT_TARGET__DEPLOYED_ELEMENT,
							deployedElements.size(), deployedElements.toArray()));
			}

			return result;
		}

		EList deployedElements = DeploymentTargetOperations
			.getDeployedElements(this);
		return new EcoreEList.UnmodifiableEList(this,
			UML2Package.Literals.DEPLOYMENT_TARGET__DEPLOYED_ELEMENT,
			deployedElements.size(), deployedElements.toArray());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
    public PackageableElement getDeployedElement(String name) {
		return getDeployedElement(name, false, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PackageableElement getDeployedElement(String name, boolean ignoreCase, EClass eClass) {
		deployedElementLoop: for (Iterator i = getDeployedElements().iterator(); i.hasNext(); ) {
			PackageableElement deployedElement = (PackageableElement) i.next();
			if (eClass != null && !eClass.isInstance(deployedElement))
				continue deployedElementLoop;
			if (name != null && !(ignoreCase ? name.equalsIgnoreCase(deployedElement.getName()) : name.equals(deployedElement.getName())))
				continue deployedElementLoop;
			return deployedElement;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getSlots() {
		if (slots == null) {
			slots = new EObjectContainmentWithInverseEList(Slot.class, this, UML2Package.INSTANCE_SPECIFICATION__SLOT, UML2Package.SLOT__OWNING_INSTANCE);
		}
		return slots;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 * @deprecated Use #createSlot() instead.
	 */
	public Slot createSlot(EClass eClass) {
		Slot newSlot = (Slot) eClass.getEPackage().getEFactoryInstance().create(eClass);
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, 0, UML2Package.INSTANCE_SPECIFICATION__SLOT, null, newSlot));
		}
		getSlots().add(newSlot);
		return newSlot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Slot createSlot() {
		Slot newSlot = UML2Factory.eINSTANCE.createSlot();
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, 0, UML2Package.INSTANCE_SPECIFICATION__SLOT, null, newSlot));
		}
		getSlots().add(newSlot);
		return newSlot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getClassifiers() {
		if (classifiers == null) {
			classifiers = new EObjectResolvingEList(Classifier.class, this, UML2Package.INSTANCE_SPECIFICATION__CLASSIFIER);
		}
		return classifiers;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
    public Classifier getClassifier(String name) {
		return getClassifier(name, false, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Classifier getClassifier(String name, boolean ignoreCase, EClass eClass) {
		classifierLoop: for (Iterator i = getClassifiers().iterator(); i.hasNext(); ) {
			Classifier classifier = (Classifier) i.next();
			if (eClass != null && !eClass.isInstance(classifier))
				continue classifierLoop;
			if (name != null && !(ignoreCase ? name.equalsIgnoreCase(classifier.getName()) : name.equals(classifier.getName())))
				continue classifierLoop;
			return classifier;
		}
		return null;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UML2Package.INSTANCE_SPECIFICATION__SPECIFICATION, oldSpecification, newSpecification);
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
				msgs = ((InternalEObject)specification).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UML2Package.INSTANCE_SPECIFICATION__SPECIFICATION, null, msgs);
			if (newSpecification != null)
				msgs = ((InternalEObject)newSpecification).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UML2Package.INSTANCE_SPECIFICATION__SPECIFICATION, null, msgs);
			msgs = basicSetSpecification(newSpecification, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2Package.INSTANCE_SPECIFICATION__SPECIFICATION, newSpecification, newSpecification));

	}



	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public ValueSpecification createSpecification(EClass eClass) {
		ValueSpecification newSpecification = (ValueSpecification) eClass.getEPackage().getEFactoryInstance().create(eClass);
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, 0, UML2Package.INSTANCE_SPECIFICATION__SPECIFICATION, null, newSpecification));
		}
		setSpecification(newSpecification);
		return newSpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSlotsAreDefined(DiagnosticChain diagnostics, Map context) {
		return InstanceSpecificationOperations.validateSlotsAreDefined(this, diagnostics, context);
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNoDuplicateSlots(DiagnosticChain diagnostics, Map context) {
		return InstanceSpecificationOperations.validateNoDuplicateSlots(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UML2Package.INSTANCE_SPECIFICATION__EANNOTATIONS:
				return ((InternalEList)getEAnnotations()).basicAdd(otherEnd, msgs);
			case UML2Package.INSTANCE_SPECIFICATION__TEMPLATE_BINDING:
				return ((InternalEList)getTemplateBindings()).basicAdd(otherEnd, msgs);
			case UML2Package.INSTANCE_SPECIFICATION__OWNED_TEMPLATE_SIGNATURE:
				if (ownedTemplateSignature != null)
					msgs = ((InternalEObject)ownedTemplateSignature).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UML2Package.INSTANCE_SPECIFICATION__OWNED_TEMPLATE_SIGNATURE, null, msgs);
				return basicSetOwnedTemplateSignature((TemplateSignature)otherEnd, msgs);
			case UML2Package.INSTANCE_SPECIFICATION__CLIENT_DEPENDENCY:
				return ((InternalEList)getClientDependencies()).basicAdd(otherEnd, msgs);
			case UML2Package.INSTANCE_SPECIFICATION__TEMPLATE_PARAMETER:
				if (templateParameter != null)
					msgs = ((InternalEObject)templateParameter).eInverseRemove(this, UML2Package.TEMPLATE_PARAMETER__PARAMETERED_ELEMENT, TemplateParameter.class, msgs);
				return basicSetTemplateParameter((TemplateParameter)otherEnd, msgs);
			case UML2Package.INSTANCE_SPECIFICATION__OWNING_PARAMETER:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOwningParameter((TemplateParameter)otherEnd, msgs);
			case UML2Package.INSTANCE_SPECIFICATION__DEPLOYMENT:
				return ((InternalEList)getDeployments()).basicAdd(otherEnd, msgs);
			case UML2Package.INSTANCE_SPECIFICATION__SLOT:
				return ((InternalEList)getSlots()).basicAdd(otherEnd, msgs);
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
			case UML2Package.INSTANCE_SPECIFICATION__EANNOTATIONS:
				return ((InternalEList)getEAnnotations()).basicRemove(otherEnd, msgs);
			case UML2Package.INSTANCE_SPECIFICATION__OWNED_COMMENT:
				return ((InternalEList)getOwnedComments()).basicRemove(otherEnd, msgs);
			case UML2Package.INSTANCE_SPECIFICATION__TEMPLATE_BINDING:
				return ((InternalEList)getTemplateBindings()).basicRemove(otherEnd, msgs);
			case UML2Package.INSTANCE_SPECIFICATION__OWNED_TEMPLATE_SIGNATURE:
				return basicSetOwnedTemplateSignature(null, msgs);
			case UML2Package.INSTANCE_SPECIFICATION__CLIENT_DEPENDENCY:
				return ((InternalEList)getClientDependencies()).basicRemove(otherEnd, msgs);
			case UML2Package.INSTANCE_SPECIFICATION__NAME_EXPRESSION:
				return basicSetNameExpression(null, msgs);
			case UML2Package.INSTANCE_SPECIFICATION__TEMPLATE_PARAMETER:
				return basicSetTemplateParameter(null, msgs);
			case UML2Package.INSTANCE_SPECIFICATION__OWNING_PARAMETER:
				return basicSetOwningParameter(null, msgs);
			case UML2Package.INSTANCE_SPECIFICATION__DEPLOYMENT:
				return ((InternalEList)getDeployments()).basicRemove(otherEnd, msgs);
			case UML2Package.INSTANCE_SPECIFICATION__SLOT:
				return ((InternalEList)getSlots()).basicRemove(otherEnd, msgs);
			case UML2Package.INSTANCE_SPECIFICATION__SPECIFICATION:
				return basicSetSpecification(null, msgs);
		}
		return eDynamicInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getClientDependencies() {
		if (clientDependencies == null) {
			clientDependencies = new SubsetSupersetEObjectWithInverseResolvingEList.ManyInverse(Dependency.class, this, UML2Package.INSTANCE_SPECIFICATION__CLIENT_DEPENDENCY, null, CLIENT_DEPENDENCY_ESUBSETS, UML2Package.DEPENDENCY__CLIENT);
		}
		return clientDependencies;
	}


	/**
	 * The array of subset feature identifiers for the '{@link #getClientDependencies() <em>Client Dependency</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClientDependencies()
	 * @generated
	 * @ordered
	 */
	protected static final int[] CLIENT_DEPENDENCY_ESUBSETS = new int[] {UML2Package.INSTANCE_SPECIFICATION__DEPLOYMENT};

	/**
	 * The array of superset feature identifiers for the '{@link #getDeployments() <em>Deployment</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeployments()
	 * @generated
	 * @ordered
	 */
	protected static final int[] DEPLOYMENT_ESUPERSETS = new int[] {UML2Package.INSTANCE_SPECIFICATION__CLIENT_DEPENDENCY};

	/**
	 * The array of subset feature identifiers for the '{@link #getOwnedElements() <em>Owned Element</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedElements()
	 * @generated
	 * @ordered
	 */
	protected static final int[] OWNED_ELEMENT_ESUBSETS = new int[] {UML2Package.INSTANCE_SPECIFICATION__OWNED_COMMENT, UML2Package.INSTANCE_SPECIFICATION__TEMPLATE_BINDING, UML2Package.INSTANCE_SPECIFICATION__OWNED_TEMPLATE_SIGNATURE, UML2Package.INSTANCE_SPECIFICATION__NAME_EXPRESSION, UML2Package.INSTANCE_SPECIFICATION__DEPLOYMENT, UML2Package.INSTANCE_SPECIFICATION__SLOT, UML2Package.INSTANCE_SPECIFICATION__SPECIFICATION};

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UML2Package.INSTANCE_SPECIFICATION__EANNOTATIONS:
				return getEAnnotations();
			case UML2Package.INSTANCE_SPECIFICATION__OWNED_ELEMENT:
				return getOwnedElements();
			case UML2Package.INSTANCE_SPECIFICATION__OWNER:
				if (resolve) return getOwner();
				return basicGetOwner();
			case UML2Package.INSTANCE_SPECIFICATION__OWNED_COMMENT:
				return getOwnedComments();
			case UML2Package.INSTANCE_SPECIFICATION__TEMPLATE_BINDING:
				return getTemplateBindings();
			case UML2Package.INSTANCE_SPECIFICATION__OWNED_TEMPLATE_SIGNATURE:
				return getOwnedTemplateSignature();
			case UML2Package.INSTANCE_SPECIFICATION__NAME:
				return getName();
			case UML2Package.INSTANCE_SPECIFICATION__QUALIFIED_NAME:
				return getQualifiedName();
			case UML2Package.INSTANCE_SPECIFICATION__VISIBILITY:
				return getVisibility();
			case UML2Package.INSTANCE_SPECIFICATION__CLIENT_DEPENDENCY:
				return getClientDependencies();
			case UML2Package.INSTANCE_SPECIFICATION__NAME_EXPRESSION:
				return getNameExpression();
			case UML2Package.INSTANCE_SPECIFICATION__TEMPLATE_PARAMETER:
				if (resolve) return getTemplateParameter();
				return basicGetTemplateParameter();
			case UML2Package.INSTANCE_SPECIFICATION__OWNING_PARAMETER:
				return getOwningParameter();
			case UML2Package.INSTANCE_SPECIFICATION__PACKAGEABLE_ELEMENT_VISIBILITY:
				return getPackageableElement_visibility();
			case UML2Package.INSTANCE_SPECIFICATION__DEPLOYMENT:
				return getDeployments();
			case UML2Package.INSTANCE_SPECIFICATION__DEPLOYED_ELEMENT:
				return getDeployedElements();
			case UML2Package.INSTANCE_SPECIFICATION__SLOT:
				return getSlots();
			case UML2Package.INSTANCE_SPECIFICATION__CLASSIFIER:
				return getClassifiers();
			case UML2Package.INSTANCE_SPECIFICATION__SPECIFICATION:
				return getSpecification();
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
			case UML2Package.INSTANCE_SPECIFICATION__EANNOTATIONS:
				getEAnnotations().clear();
				getEAnnotations().addAll((Collection)newValue);
				return;
			case UML2Package.INSTANCE_SPECIFICATION__OWNED_COMMENT:
				getOwnedComments().clear();
				getOwnedComments().addAll((Collection)newValue);
				return;
			case UML2Package.INSTANCE_SPECIFICATION__TEMPLATE_BINDING:
				getTemplateBindings().clear();
				getTemplateBindings().addAll((Collection)newValue);
				return;
			case UML2Package.INSTANCE_SPECIFICATION__OWNED_TEMPLATE_SIGNATURE:
				setOwnedTemplateSignature((TemplateSignature)newValue);
				return;
			case UML2Package.INSTANCE_SPECIFICATION__NAME:
				setName((String)newValue);
				return;
			case UML2Package.INSTANCE_SPECIFICATION__VISIBILITY:
				setVisibility((VisibilityKind)newValue);
				return;
			case UML2Package.INSTANCE_SPECIFICATION__CLIENT_DEPENDENCY:
				getClientDependencies().clear();
				getClientDependencies().addAll((Collection)newValue);
				return;
			case UML2Package.INSTANCE_SPECIFICATION__NAME_EXPRESSION:
				setNameExpression((StringExpression)newValue);
				return;
			case UML2Package.INSTANCE_SPECIFICATION__TEMPLATE_PARAMETER:
				setTemplateParameter((TemplateParameter)newValue);
				return;
			case UML2Package.INSTANCE_SPECIFICATION__OWNING_PARAMETER:
				setOwningParameter((TemplateParameter)newValue);
				return;
			case UML2Package.INSTANCE_SPECIFICATION__PACKAGEABLE_ELEMENT_VISIBILITY:
				setPackageableElement_visibility((VisibilityKind)newValue);
				return;
			case UML2Package.INSTANCE_SPECIFICATION__DEPLOYMENT:
				getDeployments().clear();
				getDeployments().addAll((Collection)newValue);
				return;
			case UML2Package.INSTANCE_SPECIFICATION__SLOT:
				getSlots().clear();
				getSlots().addAll((Collection)newValue);
				return;
			case UML2Package.INSTANCE_SPECIFICATION__CLASSIFIER:
				getClassifiers().clear();
				getClassifiers().addAll((Collection)newValue);
				return;
			case UML2Package.INSTANCE_SPECIFICATION__SPECIFICATION:
				setSpecification((ValueSpecification)newValue);
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
			case UML2Package.INSTANCE_SPECIFICATION__EANNOTATIONS:
				getEAnnotations().clear();
				return;
			case UML2Package.INSTANCE_SPECIFICATION__OWNED_COMMENT:
				getOwnedComments().clear();
				return;
			case UML2Package.INSTANCE_SPECIFICATION__TEMPLATE_BINDING:
				getTemplateBindings().clear();
				return;
			case UML2Package.INSTANCE_SPECIFICATION__OWNED_TEMPLATE_SIGNATURE:
				setOwnedTemplateSignature((TemplateSignature)null);
				return;
			case UML2Package.INSTANCE_SPECIFICATION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case UML2Package.INSTANCE_SPECIFICATION__VISIBILITY:
				setVisibility(VISIBILITY_EDEFAULT);
				return;
			case UML2Package.INSTANCE_SPECIFICATION__CLIENT_DEPENDENCY:
				getClientDependencies().clear();
				return;
			case UML2Package.INSTANCE_SPECIFICATION__NAME_EXPRESSION:
				setNameExpression((StringExpression)null);
				return;
			case UML2Package.INSTANCE_SPECIFICATION__TEMPLATE_PARAMETER:
				setTemplateParameter((TemplateParameter)null);
				return;
			case UML2Package.INSTANCE_SPECIFICATION__OWNING_PARAMETER:
				setOwningParameter((TemplateParameter)null);
				return;
			case UML2Package.INSTANCE_SPECIFICATION__PACKAGEABLE_ELEMENT_VISIBILITY:
				setPackageableElement_visibility(PACKAGEABLE_ELEMENT_VISIBILITY_EDEFAULT);
				return;
			case UML2Package.INSTANCE_SPECIFICATION__DEPLOYMENT:
				getDeployments().clear();
				return;
			case UML2Package.INSTANCE_SPECIFICATION__SLOT:
				getSlots().clear();
				return;
			case UML2Package.INSTANCE_SPECIFICATION__CLASSIFIER:
				getClassifiers().clear();
				return;
			case UML2Package.INSTANCE_SPECIFICATION__SPECIFICATION:
				setSpecification((ValueSpecification)null);
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
			case UML2Package.INSTANCE_SPECIFICATION__EANNOTATIONS:
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UML2Package.INSTANCE_SPECIFICATION__OWNED_ELEMENT:
				return isSetOwnedElements();
			case UML2Package.INSTANCE_SPECIFICATION__OWNER:
				return isSetOwner();
			case UML2Package.INSTANCE_SPECIFICATION__OWNED_COMMENT:
				return ownedComments != null && !ownedComments.isEmpty();
			case UML2Package.INSTANCE_SPECIFICATION__TEMPLATE_BINDING:
				return templateBindings != null && !templateBindings.isEmpty();
			case UML2Package.INSTANCE_SPECIFICATION__OWNED_TEMPLATE_SIGNATURE:
				return ownedTemplateSignature != null;
			case UML2Package.INSTANCE_SPECIFICATION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case UML2Package.INSTANCE_SPECIFICATION__QUALIFIED_NAME:
				return QUALIFIED_NAME_EDEFAULT == null ? getQualifiedName() != null : !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case UML2Package.INSTANCE_SPECIFICATION__VISIBILITY:
				return isSetVisibility();
			case UML2Package.INSTANCE_SPECIFICATION__CLIENT_DEPENDENCY:
				return clientDependencies != null && !clientDependencies.isEmpty();
			case UML2Package.INSTANCE_SPECIFICATION__NAME_EXPRESSION:
				return nameExpression != null;
			case UML2Package.INSTANCE_SPECIFICATION__TEMPLATE_PARAMETER:
				return templateParameter != null;
			case UML2Package.INSTANCE_SPECIFICATION__OWNING_PARAMETER:
				return getOwningParameter() != null;
			case UML2Package.INSTANCE_SPECIFICATION__PACKAGEABLE_ELEMENT_VISIBILITY:
				return isSetPackageableElement_visibility();
			case UML2Package.INSTANCE_SPECIFICATION__DEPLOYMENT:
				return deployments != null && !deployments.isEmpty();
			case UML2Package.INSTANCE_SPECIFICATION__DEPLOYED_ELEMENT:
				return !getDeployedElements().isEmpty();
			case UML2Package.INSTANCE_SPECIFICATION__SLOT:
				return slots != null && !slots.isEmpty();
			case UML2Package.INSTANCE_SPECIFICATION__CLASSIFIER:
				return classifiers != null && !classifiers.isEmpty();
			case UML2Package.INSTANCE_SPECIFICATION__SPECIFICATION:
				return specification != null;
		}
		return eDynamicIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class baseClass) {
		if (baseClass == DeploymentTarget.class) {
			switch (derivedFeatureID) {
				case UML2Package.INSTANCE_SPECIFICATION__DEPLOYMENT: return UML2Package.DEPLOYMENT_TARGET__DEPLOYMENT;
				case UML2Package.INSTANCE_SPECIFICATION__DEPLOYED_ELEMENT: return UML2Package.DEPLOYMENT_TARGET__DEPLOYED_ELEMENT;
				default: return -1;
			}
		}
		if (baseClass == DeployedArtifact.class) {
			switch (derivedFeatureID) {
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
		if (baseClass == DeploymentTarget.class) {
			switch (baseFeatureID) {
				case UML2Package.DEPLOYMENT_TARGET__DEPLOYMENT: return UML2Package.INSTANCE_SPECIFICATION__DEPLOYMENT;
				case UML2Package.DEPLOYMENT_TARGET__DEPLOYED_ELEMENT: return UML2Package.INSTANCE_SPECIFICATION__DEPLOYED_ELEMENT;
				default: return -1;
			}
		}
		if (baseClass == DeployedArtifact.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}


} //InstanceSpecificationImpl
