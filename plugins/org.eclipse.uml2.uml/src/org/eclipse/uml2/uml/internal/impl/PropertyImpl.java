/*
 * Copyright (c) 2005, 2016 IBM Corporation, Embarcadero Technologies, CEA, and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *   Kenn Hussey (Embarcadero Technologies) - 208353, 204200
 *   Kenn Hussey - 286329, 323181
 *   Kenn Hussey (CEA) - 327039, 351774, 212765, 418466, 451350, 485756
 *
 */
package org.eclipse.uml2.uml.internal.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.uml2.common.util.CacheAdapter;
import org.eclipse.uml2.common.util.DerivedUnionEObjectEList;

import org.eclipse.uml2.uml.AggregationKind;
import org.eclipse.uml2.uml.Association;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.Comment;
import org.eclipse.uml2.uml.ConnectableElement;
import org.eclipse.uml2.uml.ConnectableElementTemplateParameter;
import org.eclipse.uml2.uml.ConnectorEnd;
import org.eclipse.uml2.uml.DataType;
import org.eclipse.uml2.uml.Deployment;
import org.eclipse.uml2.uml.DeploymentTarget;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Interface;
import org.eclipse.uml2.uml.MultiplicityElement;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Namespace;
import org.eclipse.uml2.uml.PackageableElement;
import org.eclipse.uml2.uml.ParameterableElement;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.RedefinableElement;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.StringExpression;
import org.eclipse.uml2.uml.TemplateParameter;
import org.eclipse.uml2.uml.Type;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.ValueSpecification;
import org.eclipse.uml2.uml.VisibilityKind;

import org.eclipse.uml2.uml.internal.operations.ConnectableElementOperations;
import org.eclipse.uml2.uml.internal.operations.DeploymentTargetOperations;
import org.eclipse.uml2.uml.internal.operations.ParameterableElementOperations;
import org.eclipse.uml2.uml.internal.operations.PropertyOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Property</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.PropertyImpl#getOwner <em>Owner</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.PropertyImpl#getTemplateParameter <em>Template Parameter</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.PropertyImpl#getOwningTemplateParameter <em>Owning Template Parameter</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.PropertyImpl#getEnds <em>End</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.PropertyImpl#getOwnedElements <em>Owned Element</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.PropertyImpl#getDeployedElements <em>Deployed Element</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.PropertyImpl#getDeployments <em>Deployment</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.PropertyImpl#getNamespace <em>Namespace</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.PropertyImpl#getFeaturingClassifiers <em>Featuring Classifier</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.PropertyImpl#getRedefinitionContexts <em>Redefinition Context</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.PropertyImpl#getRedefinedElements <em>Redefined Element</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.PropertyImpl#getAssociation <em>Association</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.PropertyImpl#getDatatype <em>Datatype</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.PropertyImpl#getInterface <em>Interface</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.PropertyImpl#getDefault <em>Default</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.PropertyImpl#getAggregation <em>Aggregation</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.PropertyImpl#getAssociationEnd <em>Association End</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.PropertyImpl#getQualifiers <em>Qualifier</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.PropertyImpl#getClass_ <em>Class</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.PropertyImpl#getDefaultValue <em>Default Value</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.PropertyImpl#isComposite <em>Is Composite</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.PropertyImpl#isDerived <em>Is Derived</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.PropertyImpl#isDerivedUnion <em>Is Derived Union</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.PropertyImpl#isID <em>Is ID</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.PropertyImpl#getOpposite <em>Opposite</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.PropertyImpl#getOwningAssociation <em>Owning Association</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.PropertyImpl#getRedefinedProperties <em>Redefined Property</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.PropertyImpl#getSubsettedProperties <em>Subsetted Property</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PropertyImpl
		extends StructuralFeatureImpl
		implements Property {

	/**
	 * The cached value of the '{@link #getTemplateParameter() <em>Template Parameter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTemplateParameter()
	 * @generated
	 * @ordered
	 */
	protected TemplateParameter templateParameter;

	/**
	 * The cached value of the '{@link #getDeployments() <em>Deployment</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeployments()
	 * @generated
	 * @ordered
	 */
	protected EList<Deployment> deployments;

	/**
	 * The cached value of the '{@link #getAssociation() <em>Association</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssociation()
	 * @generated
	 * @ordered
	 */
	protected Association association;

	/**
	 * The default value of the '{@link #getDefault() <em>Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefault()
	 * @generated
	 * @ordered
	 */
	protected static final String DEFAULT_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getAggregation() <em>Aggregation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAggregation()
	 * @generated
	 * @ordered
	 */
	protected static final AggregationKind AGGREGATION_EDEFAULT = AggregationKind.NONE_LITERAL;

	/**
	 * The offset of the flags representing the value of the '{@link #getAggregation() <em>Aggregation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected static final int AGGREGATION_EFLAG_OFFSET = 17;

	/**
	 * The flags representing the default value of the '{@link #getAggregation() <em>Aggregation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected static final int AGGREGATION_EFLAG_DEFAULT = AGGREGATION_EDEFAULT
		.ordinal() << AGGREGATION_EFLAG_OFFSET;

	/**
	 * The array of enumeration values for '{@link AggregationKind Aggregation Kind}'
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	private static final AggregationKind[] AGGREGATION_EFLAG_VALUES = AggregationKind
		.values();

	/**
	 * The flags representing the value of the '{@link #getAggregation() <em>Aggregation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAggregation()
	 * @generated
	 * @ordered
	 */
	protected static final int AGGREGATION_EFLAG = 0x3 << AGGREGATION_EFLAG_OFFSET;

	/**
	 * The cached value of the '{@link #getQualifiers() <em>Qualifier</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQualifiers()
	 * @generated
	 * @ordered
	 */
	protected EList<Property> qualifiers;

	/**
	 * The cached value of the '{@link #getDefaultValue() <em>Default Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultValue()
	 * @generated
	 * @ordered
	 */
	protected ValueSpecification defaultValue;

	/**
	 * The default value of the '{@link #isComposite() <em>Is Composite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isComposite()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_COMPOSITE_EDEFAULT = false;

	/**
	 * The default value of the '{@link #isDerived() <em>Is Derived</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDerived()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_DERIVED_EDEFAULT = false;

	/**
	 * The flag representing the value of the '{@link #isDerived() <em>Is Derived</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDerived()
	 * @generated
	 * @ordered
	 */
	protected static final int IS_DERIVED_EFLAG = 1 << 19;

	/**
	 * The default value of the '{@link #isDerivedUnion() <em>Is Derived Union</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDerivedUnion()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_DERIVED_UNION_EDEFAULT = false;

	/**
	 * The flag representing the value of the '{@link #isDerivedUnion() <em>Is Derived Union</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDerivedUnion()
	 * @generated
	 * @ordered
	 */
	protected static final int IS_DERIVED_UNION_EFLAG = 1 << 20;

	/**
	 * The default value of the '{@link #isID() <em>Is ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isID()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_ID_EDEFAULT = false;

	/**
	 * The flag representing the value of the '{@link #isID() <em>Is ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isID()
	 * @generated
	 * @ordered
	 */
	protected static final int IS_ID_EFLAG = 1 << 21;

	/**
	 * The cached value of the '{@link #getRedefinedProperties() <em>Redefined Property</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRedefinedProperties()
	 * @generated
	 * @ordered
	 */
	protected EList<Property> redefinedProperties;

	/**
	 * The cached value of the '{@link #getSubsettedProperties() <em>Subsetted Property</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubsettedProperties()
	 * @generated
	 * @ordered
	 */
	protected EList<Property> subsettedProperties;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PropertyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UMLPackage.Literals.PROPERTY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Element getOwner() {
		Element owner = basicGetOwner();
		return owner != null && owner.eIsProxy()
			? (Element) eResolveProxy((InternalEObject) owner)
			: owner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemplateParameter getTemplateParameter() {
		if (templateParameter != null && templateParameter.eIsProxy()) {
			InternalEObject oldTemplateParameter = (InternalEObject) templateParameter;
			templateParameter = (TemplateParameter) eResolveProxy(
				oldTemplateParameter);
			if (templateParameter != oldTemplateParameter) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
						UMLPackage.PROPERTY__TEMPLATE_PARAMETER,
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
		return templateParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTemplateParameterGen(
			TemplateParameter newTemplateParameter, NotificationChain msgs) {
		if (newTemplateParameter != null
			&& !(newTemplateParameter instanceof ConnectableElementTemplateParameter)) {
			throw new IllegalArgumentException(
				"newTemplateParameter must be an instance of ConnectableElementTemplateParameter"); //$NON-NLS-1$
		}
		TemplateParameter oldTemplateParameter = templateParameter;
		templateParameter = newTemplateParameter;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
				Notification.SET, UMLPackage.PROPERTY__TEMPLATE_PARAMETER,
				oldTemplateParameter, newTemplateParameter);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	public NotificationChain basicSetTemplateParameter(
			TemplateParameter newTemplateParameter, NotificationChain msgs) {
		msgs = basicSetTemplateParameterGen(newTemplateParameter, msgs);

		Resource.Internal eInternalResource = eInternalResource();

		if (eInternalResource == null || !eInternalResource.isLoading()) {
			TemplateParameter owningTemplateParameter = basicGetOwningTemplateParameter();

			if (owningTemplateParameter != null
				&& owningTemplateParameter != newTemplateParameter) {

				setOwningTemplateParameter(null);
			}
		}

		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTemplateParameter(TemplateParameter newTemplateParameter) {
		if (newTemplateParameter != null
			&& !(newTemplateParameter instanceof ConnectableElementTemplateParameter)) {
			throw new IllegalArgumentException(
				"newTemplateParameter must be an instance of ConnectableElementTemplateParameter"); //$NON-NLS-1$
		}
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
				UMLPackage.PROPERTY__TEMPLATE_PARAMETER, newTemplateParameter,
				newTemplateParameter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTemplateParameter() {
		return templateParameter != null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemplateParameter getOwningTemplateParameter() {
		if (eContainerFeatureID() != UMLPackage.PROPERTY__OWNING_TEMPLATE_PARAMETER)
			return null;
		return (TemplateParameter) eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemplateParameter basicGetOwningTemplateParameter() {
		if (eContainerFeatureID() != UMLPackage.PROPERTY__OWNING_TEMPLATE_PARAMETER)
			return null;
		return (TemplateParameter) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwningTemplateParameter(
			TemplateParameter newOwningTemplateParameter,
			NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newOwningTemplateParameter,
			UMLPackage.PROPERTY__OWNING_TEMPLATE_PARAMETER, msgs);
		Resource.Internal eInternalResource = eInternalResource();
		if (eInternalResource == null || !eInternalResource.isLoading()) {
			if (newOwningTemplateParameter != null) {
				if (newOwningTemplateParameter != templateParameter) {
					setTemplateParameter(newOwningTemplateParameter);
				}
			}
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwningTemplateParameter(
			TemplateParameter newOwningTemplateParameter) {
		if (newOwningTemplateParameter != eInternalContainer()
			|| (eContainerFeatureID() != UMLPackage.PROPERTY__OWNING_TEMPLATE_PARAMETER
				&& newOwningTemplateParameter != null)) {
			if (EcoreUtil.isAncestor(this, newOwningTemplateParameter))
				throw new IllegalArgumentException(
					"Recursive containment not allowed for " + toString()); //$NON-NLS-1$
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOwningTemplateParameter != null)
				msgs = ((InternalEObject) newOwningTemplateParameter)
					.eInverseAdd(this,
						UMLPackage.TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT,
						TemplateParameter.class, msgs);
			msgs = basicSetOwningTemplateParameter(newOwningTemplateParameter,
				msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.PROPERTY__OWNING_TEMPLATE_PARAMETER,
				newOwningTemplateParameter, newOwningTemplateParameter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConnectorEnd> getEnds() {
		return ConnectableElementOperations.getEnds(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Element> getOwnedElements() {
		CacheAdapter cache = getCacheAdapter();
		if (cache != null) {
			Resource eResource = eResource();
			@SuppressWarnings("unchecked")
			EList<Element> ownedElements = (EList<Element>) cache.get(eResource,
				this, UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
			if (ownedElements == null) {
				cache.put(eResource, this,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT,
					ownedElements = new DerivedUnionEObjectEList<Element>(
						Element.class, this, UMLPackage.PROPERTY__OWNED_ELEMENT,
						OWNED_ELEMENT_ESUBSETS));
			}
			return ownedElements;
		}
		return new DerivedUnionEObjectEList<Element>(Element.class, this,
			UMLPackage.PROPERTY__OWNED_ELEMENT, OWNED_ELEMENT_ESUBSETS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Deployment> getDeployments() {
		if (deployments == null) {
			deployments = new EObjectContainmentWithInverseEList.Resolving<Deployment>(
				Deployment.class, this, UMLPackage.PROPERTY__DEPLOYMENT,
				UMLPackage.DEPLOYMENT__LOCATION);
		}
		return deployments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PackageableElement> getDeployedElements() {
		CacheAdapter cache = getCacheAdapter();
		if (cache != null) {
			@SuppressWarnings("unchecked")
			EList<PackageableElement> result = (EList<PackageableElement>) cache
				.get(this,
					UMLPackage.Literals.DEPLOYMENT_TARGET__DEPLOYED_ELEMENT);
			if (result == null) {
				cache.put(this,
					UMLPackage.Literals.DEPLOYMENT_TARGET__DEPLOYED_ELEMENT,
					result = DeploymentTargetOperations
						.getDeployedElements(this));
			}
			return result;
		}
		return DeploymentTargetOperations.getDeployedElements(this);
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
	public PackageableElement getDeployedElement(String name,
			boolean ignoreCase, EClass eClass) {
		deployedElementLoop : for (PackageableElement deployedElement : getDeployedElements()) {
			if (eClass != null && !eClass.isInstance(deployedElement))
				continue deployedElementLoop;
			if (name != null && !(ignoreCase
				? name.equalsIgnoreCase(deployedElement.getName())
				: name.equals(deployedElement.getName())))
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
	@Override
	public Namespace getNamespace() {
		Namespace namespace = basicGetNamespace();
		return namespace != null && namespace.eIsProxy()
			? (Namespace) eResolveProxy((InternalEObject) namespace)
			: namespace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Classifier> getFeaturingClassifiers() {
		CacheAdapter cache = getCacheAdapter();
		if (cache != null) {
			Resource eResource = eResource();
			@SuppressWarnings("unchecked")
			EList<Classifier> featuringClassifiers = (EList<Classifier>) cache
				.get(eResource, this,
					UMLPackage.Literals.FEATURE__FEATURING_CLASSIFIER);
			if (featuringClassifiers == null) {
				cache.put(eResource, this,
					UMLPackage.Literals.FEATURE__FEATURING_CLASSIFIER,
					featuringClassifiers = new DerivedUnionEObjectEList<Classifier>(
						Classifier.class, this,
						UMLPackage.PROPERTY__FEATURING_CLASSIFIER,
						FEATURING_CLASSIFIER_ESUBSETS));
			}
			return featuringClassifiers;
		}
		return new DerivedUnionEObjectEList<Classifier>(Classifier.class, this,
			UMLPackage.PROPERTY__FEATURING_CLASSIFIER,
			FEATURING_CLASSIFIER_ESUBSETS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RedefinableElement> getRedefinedElements() {
		CacheAdapter cache = getCacheAdapter();
		if (cache != null) {
			Resource eResource = eResource();
			@SuppressWarnings("unchecked")
			EList<RedefinableElement> redefinedElements = (EList<RedefinableElement>) cache
				.get(eResource, this,
					UMLPackage.Literals.REDEFINABLE_ELEMENT__REDEFINED_ELEMENT);
			if (redefinedElements == null) {
				cache.put(eResource, this,
					UMLPackage.Literals.REDEFINABLE_ELEMENT__REDEFINED_ELEMENT,
					redefinedElements = new DerivedUnionEObjectEList<RedefinableElement>(
						RedefinableElement.class, this,
						UMLPackage.PROPERTY__REDEFINED_ELEMENT,
						REDEFINED_ELEMENT_ESUBSETS));
			}
			return redefinedElements;
		}
		return new DerivedUnionEObjectEList<RedefinableElement>(
			RedefinableElement.class, this,
			UMLPackage.PROPERTY__REDEFINED_ELEMENT, REDEFINED_ELEMENT_ESUBSETS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Association getAssociation() {
		if (association != null && association.eIsProxy()) {
			InternalEObject oldAssociation = (InternalEObject) association;
			association = (Association) eResolveProxy(oldAssociation);
			if (association != oldAssociation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
						UMLPackage.PROPERTY__ASSOCIATION, oldAssociation,
						association));
			}
		}
		return association;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Association basicGetAssociation() {
		return association;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAssociation(Association newAssociation,
			NotificationChain msgs) {
		Association oldAssociation = association;
		association = newAssociation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
				Notification.SET, UMLPackage.PROPERTY__ASSOCIATION,
				oldAssociation, newAssociation);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		Resource.Internal eInternalResource = eInternalResource();
		if (eInternalResource == null || !eInternalResource.isLoading()) {
			Association owningAssociation = basicGetOwningAssociation();
			if (owningAssociation != null
				&& owningAssociation != newAssociation) {
				setOwningAssociation(null);
			}
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAssociation(Association newAssociation) {
		if (newAssociation != association) {
			NotificationChain msgs = null;
			if (association != null)
				msgs = ((InternalEObject) association).eInverseRemove(this,
					UMLPackage.ASSOCIATION__MEMBER_END, Association.class,
					msgs);
			if (newAssociation != null)
				msgs = ((InternalEObject) newAssociation).eInverseAdd(this,
					UMLPackage.ASSOCIATION__MEMBER_END, Association.class,
					msgs);
			msgs = basicSetAssociation(newAssociation, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.PROPERTY__ASSOCIATION, newAssociation,
				newAssociation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType getDatatype() {
		if (eContainerFeatureID() != UMLPackage.PROPERTY__DATATYPE)
			return null;
		return (DataType) eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType basicGetDatatype() {
		if (eContainerFeatureID() != UMLPackage.PROPERTY__DATATYPE)
			return null;
		return (DataType) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDatatype(DataType newDatatype,
			NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newDatatype,
			UMLPackage.PROPERTY__DATATYPE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDatatype(DataType newDatatype) {
		if (newDatatype != eInternalContainer()
			|| (eContainerFeatureID() != UMLPackage.PROPERTY__DATATYPE
				&& newDatatype != null)) {
			if (EcoreUtil.isAncestor(this, newDatatype))
				throw new IllegalArgumentException(
					"Recursive containment not allowed for " + toString()); //$NON-NLS-1$
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newDatatype != null)
				msgs = ((InternalEObject) newDatatype).eInverseAdd(this,
					UMLPackage.DATA_TYPE__OWNED_ATTRIBUTE, DataType.class,
					msgs);
			msgs = basicSetDatatype(newDatatype, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.PROPERTY__DATATYPE, newDatatype, newDatatype));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Interface getInterface() {
		if (eContainerFeatureID() != UMLPackage.PROPERTY__INTERFACE)
			return null;
		return (Interface) eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Interface basicGetInterface() {
		if (eContainerFeatureID() != UMLPackage.PROPERTY__INTERFACE)
			return null;
		return (Interface) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInterface(Interface newInterface,
			NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newInterface,
			UMLPackage.PROPERTY__INTERFACE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInterface(Interface newInterface) {
		if (newInterface != eInternalContainer()
			|| (eContainerFeatureID() != UMLPackage.PROPERTY__INTERFACE
				&& newInterface != null)) {
			if (EcoreUtil.isAncestor(this, newInterface))
				throw new IllegalArgumentException(
					"Recursive containment not allowed for " + toString()); //$NON-NLS-1$
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newInterface != null)
				msgs = ((InternalEObject) newInterface).eInverseAdd(this,
					UMLPackage.INTERFACE__OWNED_ATTRIBUTE, Interface.class,
					msgs);
			msgs = basicSetInterface(newInterface, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.PROPERTY__INTERFACE, newInterface, newInterface));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isDerived() {
		return (eFlags & IS_DERIVED_EFLAG) != 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsDerived(boolean newIsDerived) {
		boolean oldIsDerived = (eFlags & IS_DERIVED_EFLAG) != 0;
		if (newIsDerived)
			eFlags |= IS_DERIVED_EFLAG;
		else
			eFlags &= ~IS_DERIVED_EFLAG;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.PROPERTY__IS_DERIVED, oldIsDerived, newIsDerived));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isDerivedUnion() {
		return (eFlags & IS_DERIVED_UNION_EFLAG) != 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsDerivedUnion(boolean newIsDerivedUnion) {
		boolean oldIsDerivedUnion = (eFlags & IS_DERIVED_UNION_EFLAG) != 0;
		if (newIsDerivedUnion)
			eFlags |= IS_DERIVED_UNION_EFLAG;
		else
			eFlags &= ~IS_DERIVED_UNION_EFLAG;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.PROPERTY__IS_DERIVED_UNION, oldIsDerivedUnion,
				newIsDerivedUnion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isID() {
		return (eFlags & IS_ID_EFLAG) != 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsID(boolean newIsID) {
		boolean oldIsID = (eFlags & IS_ID_EFLAG) != 0;
		if (newIsID)
			eFlags |= IS_ID_EFLAG;
		else
			eFlags &= ~IS_ID_EFLAG;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.PROPERTY__IS_ID, oldIsID, newIsID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDefault() {
		return PropertyOperations.getDefault(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefault(String newDefault) {
		PropertyOperations.setDefault(this, newDefault);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AggregationKind getAggregation() {
		return AGGREGATION_EFLAG_VALUES[(eFlags
			& AGGREGATION_EFLAG) >>> AGGREGATION_EFLAG_OFFSET];
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAggregation(AggregationKind newAggregation) {
		AggregationKind oldAggregation = AGGREGATION_EFLAG_VALUES[(eFlags
			& AGGREGATION_EFLAG) >>> AGGREGATION_EFLAG_OFFSET];
		if (newAggregation == null)
			newAggregation = AGGREGATION_EDEFAULT;
		eFlags = eFlags & ~AGGREGATION_EFLAG
			| newAggregation.ordinal() << AGGREGATION_EFLAG_OFFSET;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.PROPERTY__AGGREGATION, oldAggregation,
				newAggregation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isComposite() {
		return PropertyOperations.isComposite(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsComposite(boolean newIsComposite) {
		PropertyOperations.setIsComposite(this, newIsComposite);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.uml2.uml.Class getClass_() {
		org.eclipse.uml2.uml.Class class_ = basicGetClass_();
		return class_ != null && class_.eIsProxy()
			? (org.eclipse.uml2.uml.Class) eResolveProxy(
				(InternalEObject) class_)
			: class_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public org.eclipse.uml2.uml.Class basicGetClass_() {
		InternalEObject eInternalContainer = eInternalContainer();
		return eInternalContainer instanceof org.eclipse.uml2.uml.Class
			? (org.eclipse.uml2.uml.Class) eInternalContainer
			: null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void setClass_(org.eclipse.uml2.uml.Class newClass) {
		if (newClass != eInternalContainer()) {
			if (EcoreUtil.isAncestor(this, newClass))
				throw new IllegalArgumentException(
					"Recursive containment not allowed for " + toString()); //$NON-NLS-1$
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newClass != null)
				msgs = ((InternalEList<Property>) newClass.getOwnedAttributes())
					.basicAdd(this, msgs);
			msgs = eBasicSetContainer((InternalEObject) newClass,
				InternalEObject.EOPPOSITE_FEATURE_BASE
					- UMLPackage.CLASS__OWNED_ATTRIBUTE,
				msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.PROPERTY__CLASS, newClass, newClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Property> getRedefinedProperties() {
		if (redefinedProperties == null) {
			redefinedProperties = new EObjectResolvingEList<Property>(
				Property.class, this, UMLPackage.PROPERTY__REDEFINED_PROPERTY);
		}
		return redefinedProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property getRedefinedProperty(String name, Type type) {
		return getRedefinedProperty(name, type, false, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property getRedefinedProperty(String name, Type type,
			boolean ignoreCase, EClass eClass) {
		redefinedPropertyLoop : for (Property redefinedProperty : getRedefinedProperties()) {
			if (eClass != null && !eClass.isInstance(redefinedProperty))
				continue redefinedPropertyLoop;
			if (name != null && !(ignoreCase
				? name.equalsIgnoreCase(redefinedProperty.getName())
				: name.equals(redefinedProperty.getName())))
				continue redefinedPropertyLoop;
			if (type != null && !type.equals(redefinedProperty.getType()))
				continue redefinedPropertyLoop;
			return redefinedProperty;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Association getOwningAssociation() {
		if (eContainerFeatureID() != UMLPackage.PROPERTY__OWNING_ASSOCIATION)
			return null;
		return (Association) eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Association basicGetOwningAssociation() {
		if (eContainerFeatureID() != UMLPackage.PROPERTY__OWNING_ASSOCIATION)
			return null;
		return (Association) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwningAssociation(
			Association newOwningAssociation, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newOwningAssociation,
			UMLPackage.PROPERTY__OWNING_ASSOCIATION, msgs);
		Resource.Internal eInternalResource = eInternalResource();
		if (eInternalResource == null || !eInternalResource.isLoading()) {
			if (newOwningAssociation != null) {
				if (newOwningAssociation != association) {
					setAssociation(newOwningAssociation);
				}
			}
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwningAssociation(Association newOwningAssociation) {
		if (newOwningAssociation != eInternalContainer()
			|| (eContainerFeatureID() != UMLPackage.PROPERTY__OWNING_ASSOCIATION
				&& newOwningAssociation != null)) {
			if (EcoreUtil.isAncestor(this, newOwningAssociation))
				throw new IllegalArgumentException(
					"Recursive containment not allowed for " + toString()); //$NON-NLS-1$
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOwningAssociation != null)
				msgs = ((InternalEObject) newOwningAssociation).eInverseAdd(
					this, UMLPackage.ASSOCIATION__OWNED_END, Association.class,
					msgs);
			msgs = basicSetOwningAssociation(newOwningAssociation, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.PROPERTY__OWNING_ASSOCIATION, newOwningAssociation,
				newOwningAssociation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueSpecification getDefaultValue() {
		if (defaultValue != null && defaultValue.eIsProxy()) {
			InternalEObject oldDefaultValue = (InternalEObject) defaultValue;
			defaultValue = (ValueSpecification) eResolveProxy(oldDefaultValue);
			if (defaultValue != oldDefaultValue) {
				InternalEObject newDefaultValue = (InternalEObject) defaultValue;
				NotificationChain msgs = oldDefaultValue.eInverseRemove(this,
					EOPPOSITE_FEATURE_BASE - UMLPackage.PROPERTY__DEFAULT_VALUE,
					null, null);
				if (newDefaultValue.eInternalContainer() == null) {
					msgs = newDefaultValue
						.eInverseAdd(this,
							EOPPOSITE_FEATURE_BASE
								- UMLPackage.PROPERTY__DEFAULT_VALUE,
							null, msgs);
				}
				if (msgs != null)
					msgs.dispatch();
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
						UMLPackage.PROPERTY__DEFAULT_VALUE, oldDefaultValue,
						defaultValue));
			}
		}
		return defaultValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueSpecification basicGetDefaultValue() {
		return defaultValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDefaultValue(
			ValueSpecification newDefaultValue, NotificationChain msgs) {
		ValueSpecification oldDefaultValue = defaultValue;
		defaultValue = newDefaultValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
				Notification.SET, UMLPackage.PROPERTY__DEFAULT_VALUE,
				oldDefaultValue, newDefaultValue);
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
	public void setDefaultValue(ValueSpecification newDefaultValue) {
		if (newDefaultValue != defaultValue) {
			NotificationChain msgs = null;
			if (defaultValue != null)
				msgs = ((InternalEObject) defaultValue).eInverseRemove(this,
					EOPPOSITE_FEATURE_BASE - UMLPackage.PROPERTY__DEFAULT_VALUE,
					null, msgs);
			if (newDefaultValue != null)
				msgs = ((InternalEObject) newDefaultValue).eInverseAdd(this,
					EOPPOSITE_FEATURE_BASE - UMLPackage.PROPERTY__DEFAULT_VALUE,
					null, msgs);
			msgs = basicSetDefaultValue(newDefaultValue, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.PROPERTY__DEFAULT_VALUE, newDefaultValue,
				newDefaultValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueSpecification createDefaultValue(String name, Type type,
			EClass eClass) {
		ValueSpecification newDefaultValue = (ValueSpecification) create(
			eClass);
		setDefaultValue(newDefaultValue);
		if (name != null)
			newDefaultValue.setName(name);
		if (type != null)
			newDefaultValue.setType(type);
		return newDefaultValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property getOpposite() {
		Property opposite = basicGetOpposite();
		return opposite != null && opposite.eIsProxy()
			? (Property) eResolveProxy((InternalEObject) opposite)
			: opposite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property basicGetOpposite() {
		return PropertyOperations.getOpposite(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOpposite(Property newOpposite) {
		PropertyOperations.setOpposite(this, newOpposite);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Property> getSubsettedProperties() {
		if (subsettedProperties == null) {
			subsettedProperties = new EObjectResolvingEList<Property>(
				Property.class, this, UMLPackage.PROPERTY__SUBSETTED_PROPERTY);
		}
		return subsettedProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property getSubsettedProperty(String name, Type type) {
		return getSubsettedProperty(name, type, false, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property getSubsettedProperty(String name, Type type,
			boolean ignoreCase, EClass eClass) {
		subsettedPropertyLoop : for (Property subsettedProperty : getSubsettedProperties()) {
			if (eClass != null && !eClass.isInstance(subsettedProperty))
				continue subsettedPropertyLoop;
			if (name != null && !(ignoreCase
				? name.equalsIgnoreCase(subsettedProperty.getName())
				: name.equals(subsettedProperty.getName())))
				continue subsettedPropertyLoop;
			if (type != null && !type.equals(subsettedProperty.getType()))
				continue subsettedPropertyLoop;
			return subsettedProperty;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Property> getQualifiers() {
		if (qualifiers == null) {
			qualifiers = new EObjectContainmentWithInverseEList.Resolving<Property>(
				Property.class, this, UMLPackage.PROPERTY__QUALIFIER,
				UMLPackage.PROPERTY__ASSOCIATION_END);
		}
		return qualifiers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property createQualifier(String name, Type type, EClass eClass) {
		Property newQualifier = (Property) create(eClass);
		getQualifiers().add(newQualifier);
		if (name != null)
			newQualifier.setName(name);
		if (type != null)
			newQualifier.setType(type);
		return newQualifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property createQualifier(String name, Type type) {
		return createQualifier(name, type, UMLPackage.Literals.PROPERTY);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property getQualifier(String name, Type type) {
		return getQualifier(name, type, false, null, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property getQualifier(String name, Type type, boolean ignoreCase,
			EClass eClass, boolean createOnDemand) {
		qualifierLoop : for (Property qualifier : getQualifiers()) {
			if (eClass != null && !eClass.isInstance(qualifier))
				continue qualifierLoop;
			if (name != null && !(ignoreCase
				? name.equalsIgnoreCase(qualifier.getName())
				: name.equals(qualifier.getName())))
				continue qualifierLoop;
			if (type != null && !type.equals(qualifier.getType()))
				continue qualifierLoop;
			return qualifier;
		}
		return createOnDemand && eClass != null
			? createQualifier(name, type, eClass)
			: null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property getAssociationEnd() {
		if (eContainerFeatureID() != UMLPackage.PROPERTY__ASSOCIATION_END)
			return null;
		return (Property) eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property basicGetAssociationEnd() {
		if (eContainerFeatureID() != UMLPackage.PROPERTY__ASSOCIATION_END)
			return null;
		return (Property) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAssociationEnd(Property newAssociationEnd,
			NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newAssociationEnd,
			UMLPackage.PROPERTY__ASSOCIATION_END, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAssociationEnd(Property newAssociationEnd) {
		if (newAssociationEnd != eInternalContainer()
			|| (eContainerFeatureID() != UMLPackage.PROPERTY__ASSOCIATION_END
				&& newAssociationEnd != null)) {
			if (EcoreUtil.isAncestor(this, newAssociationEnd))
				throw new IllegalArgumentException(
					"Recursive containment not allowed for " + toString()); //$NON-NLS-1$
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newAssociationEnd != null)
				msgs = ((InternalEObject) newAssociationEnd).eInverseAdd(this,
					UMLPackage.PROPERTY__QUALIFIER, Property.class, msgs);
			msgs = basicSetAssociationEnd(newAssociationEnd, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.PROPERTY__ASSOCIATION_END, newAssociationEnd,
				newAssociationEnd));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isCompatibleWith(ParameterableElement p) {
		return PropertyOperations.isCompatibleWith(this, p);
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
	public boolean validateMultiplicityOfComposite(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PropertyOperations.validateMultiplicityOfComposite(this,
			diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSubsettingContextConforms(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PropertyOperations.validateSubsettingContextConforms(this,
			diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRedefinedPropertyInherited(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PropertyOperations.validateRedefinedPropertyInherited(this,
			diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSubsettingRules(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PropertyOperations.validateSubsettingRules(this, diagnostics,
			context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDerivedUnionIsDerived(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PropertyOperations.validateDerivedUnionIsDerived(this,
			diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDerivedUnionIsReadOnly(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PropertyOperations.validateDerivedUnionIsReadOnly(this,
			diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSubsettedPropertyNames(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PropertyOperations.validateSubsettedPropertyNames(this,
			diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTypeOfOppositeEnd(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PropertyOperations.validateTypeOfOppositeEnd(this, diagnostics,
			context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQualifiedIsAssociationEnd(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PropertyOperations.validateQualifiedIsAssociationEnd(this,
			diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDeploymentTarget(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PropertyOperations.validateDeploymentTarget(this, diagnostics,
			context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBindingToAttribute(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PropertyOperations.validateBindingToAttribute(this, diagnostics,
			context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsNavigable(boolean isNavigable) {
		PropertyOperations.setIsNavigable(this, isNavigable);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property getOtherEnd() {
		return PropertyOperations.getOtherEnd(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDefault() {
		return PropertyOperations.isSetDefault(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBooleanDefaultValue(boolean value) {
		PropertyOperations.setBooleanDefaultValue(this, value);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIntegerDefaultValue(int value) {
		PropertyOperations.setIntegerDefaultValue(this, value);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStringDefaultValue(String value) {
		PropertyOperations.setStringDefaultValue(this, value);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnlimitedNaturalDefaultValue(int value) {
		PropertyOperations.setUnlimitedNaturalDefaultValue(this, value);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDefault() {
		PropertyOperations.unsetDefault(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAttribute() {
		return PropertyOperations.isAttribute(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNullDefaultValue() {
		PropertyOperations.setNullDefaultValue(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRealDefaultValue(double value) {
		PropertyOperations.setRealDefaultValue(this, value);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Type> subsettingContext() {
		CacheAdapter cache = getCacheAdapter();
		if (cache != null) {
			@SuppressWarnings("unchecked")
			EList<Type> result = (EList<Type>) cache.get(this,
				UMLPackage.Literals.PROPERTY___SUBSETTING_CONTEXT);
			if (result == null) {
				cache.put(this,
					UMLPackage.Literals.PROPERTY___SUBSETTING_CONTEXT,
					result = PropertyOperations.subsettingContext(this));
			}
			return result;
		}
		return PropertyOperations.subsettingContext(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isNavigable() {
		return PropertyOperations.isNavigable(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isConsistentWith(RedefinableElement redefiningElement) {
		return PropertyOperations.isConsistentWith(this, redefiningElement);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UMLPackage.PROPERTY__EANNOTATIONS :
				return ((InternalEList<InternalEObject>) (InternalEList<?>) getEAnnotations())
					.basicAdd(otherEnd, msgs);
			case UMLPackage.PROPERTY__OWNING_TEMPLATE_PARAMETER :
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOwningTemplateParameter(
					(TemplateParameter) otherEnd, msgs);
			case UMLPackage.PROPERTY__TEMPLATE_PARAMETER :
				if (templateParameter != null)
					msgs = ((InternalEObject) templateParameter).eInverseRemove(
						this,
						UMLPackage.TEMPLATE_PARAMETER__PARAMETERED_ELEMENT,
						TemplateParameter.class, msgs);
				return basicSetTemplateParameter((TemplateParameter) otherEnd,
					msgs);
			case UMLPackage.PROPERTY__DEPLOYMENT :
				return ((InternalEList<InternalEObject>) (InternalEList<?>) getDeployments())
					.basicAdd(otherEnd, msgs);
			case UMLPackage.PROPERTY__DATATYPE :
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetDatatype((DataType) otherEnd, msgs);
			case UMLPackage.PROPERTY__INTERFACE :
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetInterface((Interface) otherEnd, msgs);
			case UMLPackage.PROPERTY__ASSOCIATION_END :
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetAssociationEnd((Property) otherEnd, msgs);
			case UMLPackage.PROPERTY__QUALIFIER :
				return ((InternalEList<InternalEObject>) (InternalEList<?>) getQualifiers())
					.basicAdd(otherEnd, msgs);
			case UMLPackage.PROPERTY__OWNING_ASSOCIATION :
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOwningAssociation((Association) otherEnd, msgs);
			case UMLPackage.PROPERTY__ASSOCIATION :
				if (association != null)
					msgs = ((InternalEObject) association).eInverseRemove(this,
						UMLPackage.ASSOCIATION__MEMBER_END, Association.class,
						msgs);
				return basicSetAssociation((Association) otherEnd, msgs);
		}
		return eDynamicInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UMLPackage.PROPERTY__EANNOTATIONS :
				return ((InternalEList<?>) getEAnnotations())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.PROPERTY__OWNED_COMMENT :
				return ((InternalEList<?>) getOwnedComments())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.PROPERTY__NAME_EXPRESSION :
				return basicSetNameExpression(null, msgs);
			case UMLPackage.PROPERTY__LOWER_VALUE :
				return basicSetLowerValue(null, msgs);
			case UMLPackage.PROPERTY__UPPER_VALUE :
				return basicSetUpperValue(null, msgs);
			case UMLPackage.PROPERTY__OWNING_TEMPLATE_PARAMETER :
				return basicSetOwningTemplateParameter(null, msgs);
			case UMLPackage.PROPERTY__TEMPLATE_PARAMETER :
				return basicSetTemplateParameter(null, msgs);
			case UMLPackage.PROPERTY__DEPLOYMENT :
				return ((InternalEList<?>) getDeployments())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.PROPERTY__DATATYPE :
				return basicSetDatatype(null, msgs);
			case UMLPackage.PROPERTY__INTERFACE :
				return basicSetInterface(null, msgs);
			case UMLPackage.PROPERTY__ASSOCIATION_END :
				return basicSetAssociationEnd(null, msgs);
			case UMLPackage.PROPERTY__QUALIFIER :
				return ((InternalEList<?>) getQualifiers())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.PROPERTY__DEFAULT_VALUE :
				return basicSetDefaultValue(null, msgs);
			case UMLPackage.PROPERTY__OWNING_ASSOCIATION :
				return basicSetOwningAssociation(null, msgs);
			case UMLPackage.PROPERTY__ASSOCIATION :
				return basicSetAssociation(null, msgs);
		}
		return eDynamicInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(
			NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case UMLPackage.PROPERTY__OWNING_TEMPLATE_PARAMETER :
				return eInternalContainer().eInverseRemove(this,
					UMLPackage.TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT,
					TemplateParameter.class, msgs);
			case UMLPackage.PROPERTY__DATATYPE :
				return eInternalContainer().eInverseRemove(this,
					UMLPackage.DATA_TYPE__OWNED_ATTRIBUTE, DataType.class,
					msgs);
			case UMLPackage.PROPERTY__INTERFACE :
				return eInternalContainer().eInverseRemove(this,
					UMLPackage.INTERFACE__OWNED_ATTRIBUTE, Interface.class,
					msgs);
			case UMLPackage.PROPERTY__ASSOCIATION_END :
				return eInternalContainer().eInverseRemove(this,
					UMLPackage.PROPERTY__QUALIFIER, Property.class, msgs);
			case UMLPackage.PROPERTY__OWNING_ASSOCIATION :
				return eInternalContainer().eInverseRemove(this,
					UMLPackage.ASSOCIATION__OWNED_END, Association.class, msgs);
		}
		return eDynamicBasicRemoveFromContainer(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UMLPackage.PROPERTY__EANNOTATIONS :
				return getEAnnotations();
			case UMLPackage.PROPERTY__OWNED_COMMENT :
				return getOwnedComments();
			case UMLPackage.PROPERTY__OWNED_ELEMENT :
				return getOwnedElements();
			case UMLPackage.PROPERTY__OWNER :
				if (resolve)
					return getOwner();
				return basicGetOwner();
			case UMLPackage.PROPERTY__CLIENT_DEPENDENCY :
				return getClientDependencies();
			case UMLPackage.PROPERTY__NAME :
				return getName();
			case UMLPackage.PROPERTY__NAME_EXPRESSION :
				if (resolve)
					return getNameExpression();
				return basicGetNameExpression();
			case UMLPackage.PROPERTY__NAMESPACE :
				if (resolve)
					return getNamespace();
				return basicGetNamespace();
			case UMLPackage.PROPERTY__QUALIFIED_NAME :
				return getQualifiedName();
			case UMLPackage.PROPERTY__VISIBILITY :
				return getVisibility();
			case UMLPackage.PROPERTY__IS_LEAF :
				return isLeaf();
			case UMLPackage.PROPERTY__REDEFINED_ELEMENT :
				return getRedefinedElements();
			case UMLPackage.PROPERTY__REDEFINITION_CONTEXT :
				return getRedefinitionContexts();
			case UMLPackage.PROPERTY__FEATURING_CLASSIFIER :
				return getFeaturingClassifiers();
			case UMLPackage.PROPERTY__IS_STATIC :
				return isStatic();
			case UMLPackage.PROPERTY__TYPE :
				if (resolve)
					return getType();
				return basicGetType();
			case UMLPackage.PROPERTY__IS_ORDERED :
				return isOrdered();
			case UMLPackage.PROPERTY__IS_UNIQUE :
				return isUnique();
			case UMLPackage.PROPERTY__LOWER :
				return getLower();
			case UMLPackage.PROPERTY__LOWER_VALUE :
				if (resolve)
					return getLowerValue();
				return basicGetLowerValue();
			case UMLPackage.PROPERTY__UPPER :
				return getUpper();
			case UMLPackage.PROPERTY__UPPER_VALUE :
				if (resolve)
					return getUpperValue();
				return basicGetUpperValue();
			case UMLPackage.PROPERTY__IS_READ_ONLY :
				return isReadOnly();
			case UMLPackage.PROPERTY__OWNING_TEMPLATE_PARAMETER :
				if (resolve)
					return getOwningTemplateParameter();
				return basicGetOwningTemplateParameter();
			case UMLPackage.PROPERTY__TEMPLATE_PARAMETER :
				if (resolve)
					return getTemplateParameter();
				return basicGetTemplateParameter();
			case UMLPackage.PROPERTY__END :
				return getEnds();
			case UMLPackage.PROPERTY__DEPLOYED_ELEMENT :
				return getDeployedElements();
			case UMLPackage.PROPERTY__DEPLOYMENT :
				return getDeployments();
			case UMLPackage.PROPERTY__DATATYPE :
				if (resolve)
					return getDatatype();
				return basicGetDatatype();
			case UMLPackage.PROPERTY__INTERFACE :
				if (resolve)
					return getInterface();
				return basicGetInterface();
			case UMLPackage.PROPERTY__DEFAULT :
				return getDefault();
			case UMLPackage.PROPERTY__AGGREGATION :
				return getAggregation();
			case UMLPackage.PROPERTY__ASSOCIATION_END :
				if (resolve)
					return getAssociationEnd();
				return basicGetAssociationEnd();
			case UMLPackage.PROPERTY__QUALIFIER :
				return getQualifiers();
			case UMLPackage.PROPERTY__CLASS :
				if (resolve)
					return getClass_();
				return basicGetClass_();
			case UMLPackage.PROPERTY__DEFAULT_VALUE :
				if (resolve)
					return getDefaultValue();
				return basicGetDefaultValue();
			case UMLPackage.PROPERTY__IS_COMPOSITE :
				return isComposite();
			case UMLPackage.PROPERTY__IS_DERIVED :
				return isDerived();
			case UMLPackage.PROPERTY__IS_DERIVED_UNION :
				return isDerivedUnion();
			case UMLPackage.PROPERTY__IS_ID :
				return isID();
			case UMLPackage.PROPERTY__OPPOSITE :
				if (resolve)
					return getOpposite();
				return basicGetOpposite();
			case UMLPackage.PROPERTY__OWNING_ASSOCIATION :
				if (resolve)
					return getOwningAssociation();
				return basicGetOwningAssociation();
			case UMLPackage.PROPERTY__REDEFINED_PROPERTY :
				return getRedefinedProperties();
			case UMLPackage.PROPERTY__SUBSETTED_PROPERTY :
				return getSubsettedProperties();
			case UMLPackage.PROPERTY__ASSOCIATION :
				if (resolve)
					return getAssociation();
				return basicGetAssociation();
		}
		return eDynamicGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case UMLPackage.PROPERTY__EANNOTATIONS :
				getEAnnotations().clear();
				getEAnnotations()
					.addAll((Collection<? extends EAnnotation>) newValue);
				return;
			case UMLPackage.PROPERTY__OWNED_COMMENT :
				getOwnedComments().clear();
				getOwnedComments()
					.addAll((Collection<? extends Comment>) newValue);
				return;
			case UMLPackage.PROPERTY__NAME :
				setName((String) newValue);
				return;
			case UMLPackage.PROPERTY__NAME_EXPRESSION :
				setNameExpression((StringExpression) newValue);
				return;
			case UMLPackage.PROPERTY__VISIBILITY :
				setVisibility((VisibilityKind) newValue);
				return;
			case UMLPackage.PROPERTY__IS_LEAF :
				setIsLeaf((Boolean) newValue);
				return;
			case UMLPackage.PROPERTY__IS_STATIC :
				setIsStatic((Boolean) newValue);
				return;
			case UMLPackage.PROPERTY__TYPE :
				setType((Type) newValue);
				return;
			case UMLPackage.PROPERTY__IS_ORDERED :
				setIsOrdered((Boolean) newValue);
				return;
			case UMLPackage.PROPERTY__IS_UNIQUE :
				setIsUnique((Boolean) newValue);
				return;
			case UMLPackage.PROPERTY__LOWER :
				setLower((Integer) newValue);
				return;
			case UMLPackage.PROPERTY__LOWER_VALUE :
				setLowerValue((ValueSpecification) newValue);
				return;
			case UMLPackage.PROPERTY__UPPER :
				setUpper((Integer) newValue);
				return;
			case UMLPackage.PROPERTY__UPPER_VALUE :
				setUpperValue((ValueSpecification) newValue);
				return;
			case UMLPackage.PROPERTY__IS_READ_ONLY :
				setIsReadOnly((Boolean) newValue);
				return;
			case UMLPackage.PROPERTY__OWNING_TEMPLATE_PARAMETER :
				setOwningTemplateParameter((TemplateParameter) newValue);
				return;
			case UMLPackage.PROPERTY__TEMPLATE_PARAMETER :
				setTemplateParameter((TemplateParameter) newValue);
				return;
			case UMLPackage.PROPERTY__DEPLOYMENT :
				getDeployments().clear();
				getDeployments()
					.addAll((Collection<? extends Deployment>) newValue);
				return;
			case UMLPackage.PROPERTY__DATATYPE :
				setDatatype((DataType) newValue);
				return;
			case UMLPackage.PROPERTY__INTERFACE :
				setInterface((Interface) newValue);
				return;
			case UMLPackage.PROPERTY__DEFAULT :
				setDefault((String) newValue);
				return;
			case UMLPackage.PROPERTY__AGGREGATION :
				setAggregation((AggregationKind) newValue);
				return;
			case UMLPackage.PROPERTY__ASSOCIATION_END :
				setAssociationEnd((Property) newValue);
				return;
			case UMLPackage.PROPERTY__QUALIFIER :
				getQualifiers().clear();
				getQualifiers()
					.addAll((Collection<? extends Property>) newValue);
				return;
			case UMLPackage.PROPERTY__DEFAULT_VALUE :
				setDefaultValue((ValueSpecification) newValue);
				return;
			case UMLPackage.PROPERTY__IS_COMPOSITE :
				setIsComposite((Boolean) newValue);
				return;
			case UMLPackage.PROPERTY__IS_DERIVED :
				setIsDerived((Boolean) newValue);
				return;
			case UMLPackage.PROPERTY__IS_DERIVED_UNION :
				setIsDerivedUnion((Boolean) newValue);
				return;
			case UMLPackage.PROPERTY__IS_ID :
				setIsID((Boolean) newValue);
				return;
			case UMLPackage.PROPERTY__OPPOSITE :
				setOpposite((Property) newValue);
				return;
			case UMLPackage.PROPERTY__OWNING_ASSOCIATION :
				setOwningAssociation((Association) newValue);
				return;
			case UMLPackage.PROPERTY__REDEFINED_PROPERTY :
				getRedefinedProperties().clear();
				getRedefinedProperties()
					.addAll((Collection<? extends Property>) newValue);
				return;
			case UMLPackage.PROPERTY__SUBSETTED_PROPERTY :
				getSubsettedProperties().clear();
				getSubsettedProperties()
					.addAll((Collection<? extends Property>) newValue);
				return;
			case UMLPackage.PROPERTY__ASSOCIATION :
				setAssociation((Association) newValue);
				return;
		}
		eDynamicSet(featureID, newValue);
	}

	@Override
	public void eDynamicSet(int featureID, Object newValue) {

		if (featureID == UMLPackage.PROPERTY__CLASS) {
			setClass_((org.eclipse.uml2.uml.Class) newValue);
			return;
		}

		super.eDynamicSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case UMLPackage.PROPERTY__EANNOTATIONS :
				getEAnnotations().clear();
				return;
			case UMLPackage.PROPERTY__OWNED_COMMENT :
				getOwnedComments().clear();
				return;
			case UMLPackage.PROPERTY__NAME :
				unsetName();
				return;
			case UMLPackage.PROPERTY__NAME_EXPRESSION :
				setNameExpression((StringExpression) null);
				return;
			case UMLPackage.PROPERTY__VISIBILITY :
				unsetVisibility();
				return;
			case UMLPackage.PROPERTY__IS_LEAF :
				setIsLeaf(IS_LEAF_EDEFAULT);
				return;
			case UMLPackage.PROPERTY__IS_STATIC :
				setIsStatic(IS_STATIC_EDEFAULT);
				return;
			case UMLPackage.PROPERTY__TYPE :
				setType((Type) null);
				return;
			case UMLPackage.PROPERTY__IS_ORDERED :
				setIsOrdered(IS_ORDERED_EDEFAULT);
				return;
			case UMLPackage.PROPERTY__IS_UNIQUE :
				setIsUnique(IS_UNIQUE_EDEFAULT);
				return;
			case UMLPackage.PROPERTY__LOWER :
				setLower(LOWER_EDEFAULT);
				return;
			case UMLPackage.PROPERTY__LOWER_VALUE :
				setLowerValue((ValueSpecification) null);
				return;
			case UMLPackage.PROPERTY__UPPER :
				setUpper(UPPER_EDEFAULT);
				return;
			case UMLPackage.PROPERTY__UPPER_VALUE :
				setUpperValue((ValueSpecification) null);
				return;
			case UMLPackage.PROPERTY__IS_READ_ONLY :
				setIsReadOnly(IS_READ_ONLY_EDEFAULT);
				return;
			case UMLPackage.PROPERTY__OWNING_TEMPLATE_PARAMETER :
				setOwningTemplateParameter((TemplateParameter) null);
				return;
			case UMLPackage.PROPERTY__TEMPLATE_PARAMETER :
				setTemplateParameter((TemplateParameter) null);
				return;
			case UMLPackage.PROPERTY__DEPLOYMENT :
				getDeployments().clear();
				return;
			case UMLPackage.PROPERTY__DATATYPE :
				setDatatype((DataType) null);
				return;
			case UMLPackage.PROPERTY__INTERFACE :
				setInterface((Interface) null);
				return;
			case UMLPackage.PROPERTY__DEFAULT :
				unsetDefault();
				return;
			case UMLPackage.PROPERTY__AGGREGATION :
				setAggregation(AGGREGATION_EDEFAULT);
				return;
			case UMLPackage.PROPERTY__ASSOCIATION_END :
				setAssociationEnd((Property) null);
				return;
			case UMLPackage.PROPERTY__QUALIFIER :
				getQualifiers().clear();
				return;
			case UMLPackage.PROPERTY__DEFAULT_VALUE :
				setDefaultValue((ValueSpecification) null);
				return;
			case UMLPackage.PROPERTY__IS_COMPOSITE :
				setIsComposite(IS_COMPOSITE_EDEFAULT);
				return;
			case UMLPackage.PROPERTY__IS_DERIVED :
				setIsDerived(IS_DERIVED_EDEFAULT);
				return;
			case UMLPackage.PROPERTY__IS_DERIVED_UNION :
				setIsDerivedUnion(IS_DERIVED_UNION_EDEFAULT);
				return;
			case UMLPackage.PROPERTY__IS_ID :
				setIsID(IS_ID_EDEFAULT);
				return;
			case UMLPackage.PROPERTY__OPPOSITE :
				setOpposite((Property) null);
				return;
			case UMLPackage.PROPERTY__OWNING_ASSOCIATION :
				setOwningAssociation((Association) null);
				return;
			case UMLPackage.PROPERTY__REDEFINED_PROPERTY :
				getRedefinedProperties().clear();
				return;
			case UMLPackage.PROPERTY__SUBSETTED_PROPERTY :
				getSubsettedProperties().clear();
				return;
			case UMLPackage.PROPERTY__ASSOCIATION :
				setAssociation((Association) null);
				return;
		}
		eDynamicUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case UMLPackage.PROPERTY__EANNOTATIONS :
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UMLPackage.PROPERTY__OWNED_COMMENT :
				return ownedComments != null && !ownedComments.isEmpty();
			case UMLPackage.PROPERTY__OWNED_ELEMENT :
				return isSetOwnedElements();
			case UMLPackage.PROPERTY__OWNER :
				return isSetOwner();
			case UMLPackage.PROPERTY__CLIENT_DEPENDENCY :
				return !getClientDependencies().isEmpty();
			case UMLPackage.PROPERTY__NAME :
				return isSetName();
			case UMLPackage.PROPERTY__NAME_EXPRESSION :
				return nameExpression != null;
			case UMLPackage.PROPERTY__NAMESPACE :
				return isSetNamespace();
			case UMLPackage.PROPERTY__QUALIFIED_NAME :
				return QUALIFIED_NAME_EDEFAULT == null
					? getQualifiedName() != null
					: !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case UMLPackage.PROPERTY__VISIBILITY :
				return isSetVisibility();
			case UMLPackage.PROPERTY__IS_LEAF :
				return ((eFlags & IS_LEAF_EFLAG) != 0) != IS_LEAF_EDEFAULT;
			case UMLPackage.PROPERTY__REDEFINED_ELEMENT :
				return isSetRedefinedElements();
			case UMLPackage.PROPERTY__REDEFINITION_CONTEXT :
				return isSetRedefinitionContexts();
			case UMLPackage.PROPERTY__FEATURING_CLASSIFIER :
				return isSetFeaturingClassifiers();
			case UMLPackage.PROPERTY__IS_STATIC :
				return ((eFlags & IS_STATIC_EFLAG) != 0) != IS_STATIC_EDEFAULT;
			case UMLPackage.PROPERTY__TYPE :
				return type != null;
			case UMLPackage.PROPERTY__IS_ORDERED :
				return ((eFlags
					& IS_ORDERED_EFLAG) != 0) != IS_ORDERED_EDEFAULT;
			case UMLPackage.PROPERTY__IS_UNIQUE :
				return ((eFlags & IS_UNIQUE_EFLAG) != 0) != IS_UNIQUE_EDEFAULT;
			case UMLPackage.PROPERTY__LOWER :
				return getLower() != LOWER_EDEFAULT;
			case UMLPackage.PROPERTY__LOWER_VALUE :
				return lowerValue != null;
			case UMLPackage.PROPERTY__UPPER :
				return getUpper() != UPPER_EDEFAULT;
			case UMLPackage.PROPERTY__UPPER_VALUE :
				return upperValue != null;
			case UMLPackage.PROPERTY__IS_READ_ONLY :
				return ((eFlags
					& IS_READ_ONLY_EFLAG) != 0) != IS_READ_ONLY_EDEFAULT;
			case UMLPackage.PROPERTY__OWNING_TEMPLATE_PARAMETER :
				return basicGetOwningTemplateParameter() != null;
			case UMLPackage.PROPERTY__TEMPLATE_PARAMETER :
				return isSetTemplateParameter();
			case UMLPackage.PROPERTY__END :
				return !getEnds().isEmpty();
			case UMLPackage.PROPERTY__DEPLOYED_ELEMENT :
				return !getDeployedElements().isEmpty();
			case UMLPackage.PROPERTY__DEPLOYMENT :
				return deployments != null && !deployments.isEmpty();
			case UMLPackage.PROPERTY__DATATYPE :
				return basicGetDatatype() != null;
			case UMLPackage.PROPERTY__INTERFACE :
				return basicGetInterface() != null;
			case UMLPackage.PROPERTY__DEFAULT :
				return isSetDefault();
			case UMLPackage.PROPERTY__AGGREGATION :
				return (eFlags
					& AGGREGATION_EFLAG) != AGGREGATION_EFLAG_DEFAULT;
			case UMLPackage.PROPERTY__ASSOCIATION_END :
				return basicGetAssociationEnd() != null;
			case UMLPackage.PROPERTY__QUALIFIER :
				return qualifiers != null && !qualifiers.isEmpty();
			case UMLPackage.PROPERTY__CLASS :
				return basicGetClass_() != null;
			case UMLPackage.PROPERTY__DEFAULT_VALUE :
				return defaultValue != null;
			case UMLPackage.PROPERTY__IS_COMPOSITE :
				return isComposite() != IS_COMPOSITE_EDEFAULT;
			case UMLPackage.PROPERTY__IS_DERIVED :
				return ((eFlags
					& IS_DERIVED_EFLAG) != 0) != IS_DERIVED_EDEFAULT;
			case UMLPackage.PROPERTY__IS_DERIVED_UNION :
				return ((eFlags
					& IS_DERIVED_UNION_EFLAG) != 0) != IS_DERIVED_UNION_EDEFAULT;
			case UMLPackage.PROPERTY__IS_ID :
				return ((eFlags & IS_ID_EFLAG) != 0) != IS_ID_EDEFAULT;
			case UMLPackage.PROPERTY__OPPOSITE :
				return basicGetOpposite() != null;
			case UMLPackage.PROPERTY__OWNING_ASSOCIATION :
				return basicGetOwningAssociation() != null;
			case UMLPackage.PROPERTY__REDEFINED_PROPERTY :
				return redefinedProperties != null
					&& !redefinedProperties.isEmpty();
			case UMLPackage.PROPERTY__SUBSETTED_PROPERTY :
				return subsettedProperties != null
					&& !subsettedProperties.isEmpty();
			case UMLPackage.PROPERTY__ASSOCIATION :
				return association != null;
		}
		return eDynamicIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID,
			Class<?> baseClass) {
		if (baseClass == ParameterableElement.class) {
			switch (derivedFeatureID) {
				case UMLPackage.PROPERTY__OWNING_TEMPLATE_PARAMETER :
					return UMLPackage.PARAMETERABLE_ELEMENT__OWNING_TEMPLATE_PARAMETER;
				case UMLPackage.PROPERTY__TEMPLATE_PARAMETER :
					return UMLPackage.PARAMETERABLE_ELEMENT__TEMPLATE_PARAMETER;
				default :
					return -1;
			}
		}
		if (baseClass == ConnectableElement.class) {
			switch (derivedFeatureID) {
				case UMLPackage.PROPERTY__END :
					return UMLPackage.CONNECTABLE_ELEMENT__END;
				default :
					return -1;
			}
		}
		if (baseClass == DeploymentTarget.class) {
			switch (derivedFeatureID) {
				case UMLPackage.PROPERTY__DEPLOYED_ELEMENT :
					return UMLPackage.DEPLOYMENT_TARGET__DEPLOYED_ELEMENT;
				case UMLPackage.PROPERTY__DEPLOYMENT :
					return UMLPackage.DEPLOYMENT_TARGET__DEPLOYMENT;
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
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID,
			Class<?> baseClass) {
		if (baseClass == ParameterableElement.class) {
			switch (baseFeatureID) {
				case UMLPackage.PARAMETERABLE_ELEMENT__OWNING_TEMPLATE_PARAMETER :
					return UMLPackage.PROPERTY__OWNING_TEMPLATE_PARAMETER;
				case UMLPackage.PARAMETERABLE_ELEMENT__TEMPLATE_PARAMETER :
					return UMLPackage.PROPERTY__TEMPLATE_PARAMETER;
				default :
					return -1;
			}
		}
		if (baseClass == ConnectableElement.class) {
			switch (baseFeatureID) {
				case UMLPackage.CONNECTABLE_ELEMENT__END :
					return UMLPackage.PROPERTY__END;
				default :
					return -1;
			}
		}
		if (baseClass == DeploymentTarget.class) {
			switch (baseFeatureID) {
				case UMLPackage.DEPLOYMENT_TARGET__DEPLOYED_ELEMENT :
					return UMLPackage.PROPERTY__DEPLOYED_ELEMENT;
				case UMLPackage.DEPLOYMENT_TARGET__DEPLOYMENT :
					return UMLPackage.PROPERTY__DEPLOYMENT;
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
	@Override
	public int eDerivedOperationID(int baseOperationID, Class<?> baseClass) {
		if (baseClass == ParameterableElement.class) {
			switch (baseOperationID) {
				case UMLPackage.PARAMETERABLE_ELEMENT___IS_COMPATIBLE_WITH__PARAMETERABLEELEMENT :
					return UMLPackage.PROPERTY___IS_COMPATIBLE_WITH__PARAMETERABLEELEMENT;
				case UMLPackage.PARAMETERABLE_ELEMENT___IS_TEMPLATE_PARAMETER :
					return UMLPackage.PROPERTY___IS_TEMPLATE_PARAMETER;
				default :
					return -1;
			}
		}
		if (baseClass == ConnectableElement.class) {
			switch (baseOperationID) {
				case UMLPackage.CONNECTABLE_ELEMENT___GET_ENDS :
					return UMLPackage.PROPERTY___GET_ENDS;
				default :
					return -1;
			}
		}
		if (baseClass == DeploymentTarget.class) {
			switch (baseOperationID) {
				case UMLPackage.DEPLOYMENT_TARGET___GET_DEPLOYED_ELEMENTS :
					return UMLPackage.PROPERTY___GET_DEPLOYED_ELEMENTS;
				default :
					return -1;
			}
		}
		return super.eDerivedOperationID(baseOperationID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments)
			throws InvocationTargetException {
		switch (operationID) {
			case UMLPackage.PROPERTY___GET_EANNOTATION__STRING :
				return getEAnnotation((String) arguments.get(0));
			case UMLPackage.PROPERTY___VALIDATE_HAS_OWNER__DIAGNOSTICCHAIN_MAP :
				return validateHasOwner((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.PROPERTY___VALIDATE_NOT_OWN_SELF__DIAGNOSTICCHAIN_MAP :
				return validateNotOwnSelf((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.PROPERTY___ADD_KEYWORD__STRING :
				return addKeyword((String) arguments.get(0));
			case UMLPackage.PROPERTY___APPLY_STEREOTYPE__STEREOTYPE :
				return applyStereotype((Stereotype) arguments.get(0));
			case UMLPackage.PROPERTY___CREATE_EANNOTATION__STRING :
				return createEAnnotation((String) arguments.get(0));
			case UMLPackage.PROPERTY___DESTROY :
				destroy();
				return null;
			case UMLPackage.PROPERTY___GET_KEYWORDS :
				return getKeywords();
			case UMLPackage.PROPERTY___GET_APPLICABLE_STEREOTYPE__STRING :
				return getApplicableStereotype((String) arguments.get(0));
			case UMLPackage.PROPERTY___GET_APPLICABLE_STEREOTYPES :
				return getApplicableStereotypes();
			case UMLPackage.PROPERTY___GET_APPLIED_STEREOTYPE__STRING :
				return getAppliedStereotype((String) arguments.get(0));
			case UMLPackage.PROPERTY___GET_APPLIED_STEREOTYPES :
				return getAppliedStereotypes();
			case UMLPackage.PROPERTY___GET_APPLIED_SUBSTEREOTYPE__STEREOTYPE_STRING :
				return getAppliedSubstereotype((Stereotype) arguments.get(0),
					(String) arguments.get(1));
			case UMLPackage.PROPERTY___GET_APPLIED_SUBSTEREOTYPES__STEREOTYPE :
				return getAppliedSubstereotypes((Stereotype) arguments.get(0));
			case UMLPackage.PROPERTY___GET_MODEL :
				return getModel();
			case UMLPackage.PROPERTY___GET_NEAREST_PACKAGE :
				return getNearestPackage();
			case UMLPackage.PROPERTY___GET_RELATIONSHIPS :
				return getRelationships();
			case UMLPackage.PROPERTY___GET_RELATIONSHIPS__ECLASS :
				return getRelationships((EClass) arguments.get(0));
			case UMLPackage.PROPERTY___GET_REQUIRED_STEREOTYPE__STRING :
				return getRequiredStereotype((String) arguments.get(0));
			case UMLPackage.PROPERTY___GET_REQUIRED_STEREOTYPES :
				return getRequiredStereotypes();
			case UMLPackage.PROPERTY___GET_SOURCE_DIRECTED_RELATIONSHIPS :
				return getSourceDirectedRelationships();
			case UMLPackage.PROPERTY___GET_SOURCE_DIRECTED_RELATIONSHIPS__ECLASS :
				return getSourceDirectedRelationships(
					(EClass) arguments.get(0));
			case UMLPackage.PROPERTY___GET_STEREOTYPE_APPLICATION__STEREOTYPE :
				return getStereotypeApplication((Stereotype) arguments.get(0));
			case UMLPackage.PROPERTY___GET_STEREOTYPE_APPLICATIONS :
				return getStereotypeApplications();
			case UMLPackage.PROPERTY___GET_TARGET_DIRECTED_RELATIONSHIPS :
				return getTargetDirectedRelationships();
			case UMLPackage.PROPERTY___GET_TARGET_DIRECTED_RELATIONSHIPS__ECLASS :
				return getTargetDirectedRelationships(
					(EClass) arguments.get(0));
			case UMLPackage.PROPERTY___GET_VALUE__STEREOTYPE_STRING :
				return getValue((Stereotype) arguments.get(0),
					(String) arguments.get(1));
			case UMLPackage.PROPERTY___HAS_KEYWORD__STRING :
				return hasKeyword((String) arguments.get(0));
			case UMLPackage.PROPERTY___HAS_VALUE__STEREOTYPE_STRING :
				return hasValue((Stereotype) arguments.get(0),
					(String) arguments.get(1));
			case UMLPackage.PROPERTY___IS_STEREOTYPE_APPLICABLE__STEREOTYPE :
				return isStereotypeApplicable((Stereotype) arguments.get(0));
			case UMLPackage.PROPERTY___IS_STEREOTYPE_APPLIED__STEREOTYPE :
				return isStereotypeApplied((Stereotype) arguments.get(0));
			case UMLPackage.PROPERTY___IS_STEREOTYPE_REQUIRED__STEREOTYPE :
				return isStereotypeRequired((Stereotype) arguments.get(0));
			case UMLPackage.PROPERTY___REMOVE_KEYWORD__STRING :
				return removeKeyword((String) arguments.get(0));
			case UMLPackage.PROPERTY___SET_VALUE__STEREOTYPE_STRING_OBJECT :
				setValue((Stereotype) arguments.get(0),
					(String) arguments.get(1), arguments.get(2));
				return null;
			case UMLPackage.PROPERTY___UNAPPLY_STEREOTYPE__STEREOTYPE :
				return unapplyStereotype((Stereotype) arguments.get(0));
			case UMLPackage.PROPERTY___ALL_OWNED_ELEMENTS :
				return allOwnedElements();
			case UMLPackage.PROPERTY___MUST_BE_OWNED :
				return mustBeOwned();
			case UMLPackage.PROPERTY___VALIDATE_VISIBILITY_NEEDS_OWNERSHIP__DIAGNOSTICCHAIN_MAP :
				return validateVisibilityNeedsOwnership(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.PROPERTY___VALIDATE_HAS_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP :
				return validateHasQualifiedName(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.PROPERTY___VALIDATE_HAS_NO_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP :
				return validateHasNoQualifiedName(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.PROPERTY___CREATE_DEPENDENCY__NAMEDELEMENT :
				return createDependency((NamedElement) arguments.get(0));
			case UMLPackage.PROPERTY___CREATE_USAGE__NAMEDELEMENT :
				return createUsage((NamedElement) arguments.get(0));
			case UMLPackage.PROPERTY___GET_LABEL :
				return getLabel();
			case UMLPackage.PROPERTY___GET_LABEL__BOOLEAN :
				return getLabel((Boolean) arguments.get(0));
			case UMLPackage.PROPERTY___GET_NAMESPACE :
				return getNamespace();
			case UMLPackage.PROPERTY___ALL_NAMESPACES :
				return allNamespaces();
			case UMLPackage.PROPERTY___ALL_OWNING_PACKAGES :
				return allOwningPackages();
			case UMLPackage.PROPERTY___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE :
				return isDistinguishableFrom((NamedElement) arguments.get(0),
					(Namespace) arguments.get(1));
			case UMLPackage.PROPERTY___GET_QUALIFIED_NAME :
				return getQualifiedName();
			case UMLPackage.PROPERTY___SEPARATOR :
				return separator();
			case UMLPackage.PROPERTY___GET_CLIENT_DEPENDENCIES :
				return getClientDependencies();
			case UMLPackage.PROPERTY___VALIDATE_REDEFINITION_CONSISTENT__DIAGNOSTICCHAIN_MAP :
				return validateRedefinitionConsistent(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.PROPERTY___VALIDATE_NON_LEAF_REDEFINITION__DIAGNOSTICCHAIN_MAP :
				return validateNonLeafRedefinition(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.PROPERTY___VALIDATE_REDEFINITION_CONTEXT_VALID__DIAGNOSTICCHAIN_MAP :
				return validateRedefinitionContextValid(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.PROPERTY___IS_CONSISTENT_WITH__REDEFINABLEELEMENT :
				return isConsistentWith((RedefinableElement) arguments.get(0));
			case UMLPackage.PROPERTY___IS_REDEFINITION_CONTEXT_VALID__REDEFINABLEELEMENT :
				return isRedefinitionContextValid(
					(RedefinableElement) arguments.get(0));
			case UMLPackage.PROPERTY___VALIDATE_UPPER_GE_LOWER__DIAGNOSTICCHAIN_MAP :
				return validateUpperGeLower((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.PROPERTY___VALIDATE_LOWER_GE0__DIAGNOSTICCHAIN_MAP :
				return validateLowerGe0((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.PROPERTY___VALIDATE_VALUE_SPECIFICATION_NO_SIDE_EFFECTS__DIAGNOSTICCHAIN_MAP :
				return validateValueSpecificationNoSideEffects(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.PROPERTY___VALIDATE_VALUE_SPECIFICATION_CONSTANT__DIAGNOSTICCHAIN_MAP :
				return validateValueSpecificationConstant(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.PROPERTY___VALIDATE_LOWER_IS_INTEGER__DIAGNOSTICCHAIN_MAP :
				return validateLowerIsInteger(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.PROPERTY___VALIDATE_UPPER_IS_UNLIMITED_NATURAL__DIAGNOSTICCHAIN_MAP :
				return validateUpperIsUnlimitedNatural(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.PROPERTY___SET_LOWER__INT :
				setLower((Integer) arguments.get(0));
				return null;
			case UMLPackage.PROPERTY___SET_UPPER__INT :
				setUpper((Integer) arguments.get(0));
				return null;
			case UMLPackage.PROPERTY___COMPATIBLE_WITH__MULTIPLICITYELEMENT :
				return compatibleWith((MultiplicityElement) arguments.get(0));
			case UMLPackage.PROPERTY___INCLUDES_MULTIPLICITY__MULTIPLICITYELEMENT :
				return includesMultiplicity(
					(MultiplicityElement) arguments.get(0));
			case UMLPackage.PROPERTY___IS__INT_INT :
				return is((Integer) arguments.get(0),
					(Integer) arguments.get(1));
			case UMLPackage.PROPERTY___IS_MULTIVALUED :
				return isMultivalued();
			case UMLPackage.PROPERTY___GET_LOWER :
				return getLower();
			case UMLPackage.PROPERTY___LOWER_BOUND :
				return lowerBound();
			case UMLPackage.PROPERTY___GET_UPPER :
				return getUpper();
			case UMLPackage.PROPERTY___UPPER_BOUND :
				return upperBound();
			case UMLPackage.PROPERTY___IS_COMPATIBLE_WITH__PARAMETERABLEELEMENT :
				return isCompatibleWith(
					(ParameterableElement) arguments.get(0));
			case UMLPackage.PROPERTY___IS_TEMPLATE_PARAMETER :
				return isTemplateParameter();
			case UMLPackage.PROPERTY___GET_ENDS :
				return getEnds();
			case UMLPackage.PROPERTY___GET_DEPLOYED_ELEMENTS :
				return getDeployedElements();
			case UMLPackage.PROPERTY___VALIDATE_SUBSETTING_CONTEXT_CONFORMS__DIAGNOSTICCHAIN_MAP :
				return validateSubsettingContextConforms(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.PROPERTY___VALIDATE_DERIVED_UNION_IS_READ_ONLY__DIAGNOSTICCHAIN_MAP :
				return validateDerivedUnionIsReadOnly(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.PROPERTY___VALIDATE_MULTIPLICITY_OF_COMPOSITE__DIAGNOSTICCHAIN_MAP :
				return validateMultiplicityOfComposite(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.PROPERTY___VALIDATE_REDEFINED_PROPERTY_INHERITED__DIAGNOSTICCHAIN_MAP :
				return validateRedefinedPropertyInherited(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.PROPERTY___VALIDATE_SUBSETTING_RULES__DIAGNOSTICCHAIN_MAP :
				return validateSubsettingRules(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.PROPERTY___VALIDATE_BINDING_TO_ATTRIBUTE__DIAGNOSTICCHAIN_MAP :
				return validateBindingToAttribute(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.PROPERTY___VALIDATE_DERIVED_UNION_IS_DERIVED__DIAGNOSTICCHAIN_MAP :
				return validateDerivedUnionIsDerived(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.PROPERTY___VALIDATE_DEPLOYMENT_TARGET__DIAGNOSTICCHAIN_MAP :
				return validateDeploymentTarget(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.PROPERTY___VALIDATE_SUBSETTED_PROPERTY_NAMES__DIAGNOSTICCHAIN_MAP :
				return validateSubsettedPropertyNames(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.PROPERTY___VALIDATE_TYPE_OF_OPPOSITE_END__DIAGNOSTICCHAIN_MAP :
				return validateTypeOfOppositeEnd(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.PROPERTY___VALIDATE_QUALIFIED_IS_ASSOCIATION_END__DIAGNOSTICCHAIN_MAP :
				return validateQualifiedIsAssociationEnd(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.PROPERTY___GET_DEFAULT :
				return getDefault();
			case UMLPackage.PROPERTY___GET_OTHER_END :
				return getOtherEnd();
			case UMLPackage.PROPERTY___IS_SET_DEFAULT :
				return isSetDefault();
			case UMLPackage.PROPERTY___SET_BOOLEAN_DEFAULT_VALUE__BOOLEAN :
				setBooleanDefaultValue((Boolean) arguments.get(0));
				return null;
			case UMLPackage.PROPERTY___SET_DEFAULT__STRING :
				setDefault((String) arguments.get(0));
				return null;
			case UMLPackage.PROPERTY___SET_INTEGER_DEFAULT_VALUE__INT :
				setIntegerDefaultValue((Integer) arguments.get(0));
				return null;
			case UMLPackage.PROPERTY___SET_IS_COMPOSITE__BOOLEAN :
				setIsComposite((Boolean) arguments.get(0));
				return null;
			case UMLPackage.PROPERTY___SET_IS_NAVIGABLE__BOOLEAN :
				setIsNavigable((Boolean) arguments.get(0));
				return null;
			case UMLPackage.PROPERTY___SET_NULL_DEFAULT_VALUE :
				setNullDefaultValue();
				return null;
			case UMLPackage.PROPERTY___SET_OPPOSITE__PROPERTY :
				setOpposite((Property) arguments.get(0));
				return null;
			case UMLPackage.PROPERTY___SET_REAL_DEFAULT_VALUE__DOUBLE :
				setRealDefaultValue((Double) arguments.get(0));
				return null;
			case UMLPackage.PROPERTY___SET_STRING_DEFAULT_VALUE__STRING :
				setStringDefaultValue((String) arguments.get(0));
				return null;
			case UMLPackage.PROPERTY___SET_UNLIMITED_NATURAL_DEFAULT_VALUE__INT :
				setUnlimitedNaturalDefaultValue((Integer) arguments.get(0));
				return null;
			case UMLPackage.PROPERTY___UNSET_DEFAULT :
				unsetDefault();
				return null;
			case UMLPackage.PROPERTY___IS_ATTRIBUTE :
				return isAttribute();
			case UMLPackage.PROPERTY___IS_COMPOSITE :
				return isComposite();
			case UMLPackage.PROPERTY___IS_NAVIGABLE :
				return isNavigable();
			case UMLPackage.PROPERTY___GET_OPPOSITE :
				return getOpposite();
			case UMLPackage.PROPERTY___SUBSETTING_CONTEXT :
				return subsettingContext();
		}
		return eDynamicInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (aggregation: "); //$NON-NLS-1$
		result.append(AGGREGATION_EFLAG_VALUES[(eFlags
			& AGGREGATION_EFLAG) >>> AGGREGATION_EFLAG_OFFSET]);
		result.append(", isDerived: "); //$NON-NLS-1$
		result.append((eFlags & IS_DERIVED_EFLAG) != 0);
		result.append(", isDerivedUnion: "); //$NON-NLS-1$
		result.append((eFlags & IS_DERIVED_UNION_EFLAG) != 0);
		result.append(", isID: "); //$NON-NLS-1$
		result.append((eFlags & IS_ID_EFLAG) != 0);
		result.append(')');
		return result.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Element basicGetOwner() {
		TemplateParameter owningTemplateParameter = basicGetOwningTemplateParameter();
		if (owningTemplateParameter != null) {
			return owningTemplateParameter;
		}
		Property associationEnd = basicGetAssociationEnd();
		if (associationEnd != null) {
			return associationEnd;
		}
		return super.basicGetOwner();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetOwner() {
		return super.isSetOwner()
			|| eIsSet(UMLPackage.PROPERTY__OWNING_TEMPLATE_PARAMETER)
			|| eIsSet(UMLPackage.PROPERTY__ASSOCIATION_END);
	}

	/**
	 * The array of subset feature identifiers for the '{@link #getOwnedElements() <em>Owned Element</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedElements()
	 * @generated
	 * @ordered
	 */
	protected static final int[] OWNED_ELEMENT_ESUBSETS = new int[]{
		UMLPackage.PROPERTY__OWNED_COMMENT,
		UMLPackage.PROPERTY__NAME_EXPRESSION, UMLPackage.PROPERTY__LOWER_VALUE,
		UMLPackage.PROPERTY__UPPER_VALUE, UMLPackage.PROPERTY__DEPLOYMENT,
		UMLPackage.PROPERTY__QUALIFIER, UMLPackage.PROPERTY__DEFAULT_VALUE};

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Deployment createDeployment(String name) {
		Deployment newDeployment = (Deployment) create(
			UMLPackage.Literals.DEPLOYMENT);
		getDeployments().add(newDeployment);
		if (name != null)
			newDeployment.setName(name);
		return newDeployment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Deployment getDeployment(String name) {
		return getDeployment(name, false, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Deployment getDeployment(String name, boolean ignoreCase,
			boolean createOnDemand) {
		deploymentLoop : for (Deployment deployment : getDeployments()) {
			if (name != null && !(ignoreCase
				? name.equalsIgnoreCase(deployment.getName())
				: name.equals(deployment.getName())))
				continue deploymentLoop;
			return deployment;
		}
		return createOnDemand
			? createDeployment(name)
			: null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetOwnedElements() {
		return super.isSetOwnedElements()
			|| eIsSet(UMLPackage.PROPERTY__DEPLOYMENT)
			|| eIsSet(UMLPackage.PROPERTY__QUALIFIER)
			|| eIsSet(UMLPackage.PROPERTY__DEFAULT_VALUE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Namespace basicGetNamespace() {
		DataType datatype = basicGetDatatype();
		if (datatype != null) {
			return datatype;
		}
		Interface interface_ = basicGetInterface();
		if (interface_ != null) {
			return interface_;
		}
		org.eclipse.uml2.uml.Class class_ = basicGetClass_();
		if (class_ != null) {
			return class_;
		}
		Association owningAssociation = basicGetOwningAssociation();
		if (owningAssociation != null) {
			return owningAssociation;
		}
		return super.basicGetNamespace();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetNamespace() {
		return super.isSetNamespace() || eIsSet(UMLPackage.PROPERTY__DATATYPE)
			|| eIsSet(UMLPackage.PROPERTY__INTERFACE)
			|| eIsSet(UMLPackage.PROPERTY__CLASS)
			|| eIsSet(UMLPackage.PROPERTY__OWNING_ASSOCIATION);
	}

	/**
	 * The array of subset feature identifiers for the '{@link #getFeaturingClassifiers() <em>Featuring Classifier</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeaturingClassifiers()
	 * @generated
	 * @ordered
	 */
	protected static final int[] FEATURING_CLASSIFIER_ESUBSETS = new int[]{
		UMLPackage.PROPERTY__DATATYPE, UMLPackage.PROPERTY__INTERFACE,
		UMLPackage.PROPERTY__CLASS, UMLPackage.PROPERTY__OWNING_ASSOCIATION};

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Classifier> getRedefinitionContexts() {
		CacheAdapter cache = getCacheAdapter();
		if (cache != null) {
			Resource eResource = eResource();
			@SuppressWarnings("unchecked")
			EList<Classifier> redefinitionContexts = (EList<Classifier>) cache
				.get(eResource, this,
					UMLPackage.Literals.REDEFINABLE_ELEMENT__REDEFINITION_CONTEXT);
			if (redefinitionContexts == null) {
				cache.put(eResource, this,
					UMLPackage.Literals.REDEFINABLE_ELEMENT__REDEFINITION_CONTEXT,
					redefinitionContexts = new DerivedUnionEObjectEList<Classifier>(
						Classifier.class, this,
						UMLPackage.PROPERTY__REDEFINITION_CONTEXT,
						REDEFINITION_CONTEXT_ESUBSETS));
			}
			return redefinitionContexts;
		}
		return new DerivedUnionEObjectEList<Classifier>(Classifier.class, this,
			UMLPackage.PROPERTY__REDEFINITION_CONTEXT,
			REDEFINITION_CONTEXT_ESUBSETS);
	}

	/**
	 * The array of subset feature identifiers for the '{@link #getRedefinitionContexts() <em>Redefinition Context</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRedefinitionContexts()
	 * @generated
	 * @ordered
	 */
	protected static final int[] REDEFINITION_CONTEXT_ESUBSETS = new int[]{
		UMLPackage.PROPERTY__DATATYPE, UMLPackage.PROPERTY__INTERFACE,
		UMLPackage.PROPERTY__CLASS, UMLPackage.PROPERTY__OWNING_ASSOCIATION};

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetFeaturingClassifiers() {
		return super.isSetFeaturingClassifiers()
			|| eIsSet(UMLPackage.PROPERTY__DATATYPE)
			|| eIsSet(UMLPackage.PROPERTY__INTERFACE)
			|| eIsSet(UMLPackage.PROPERTY__CLASS)
			|| eIsSet(UMLPackage.PROPERTY__OWNING_ASSOCIATION);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetRedefinitionContexts() {
		return super.isSetRedefinitionContexts()
			|| eIsSet(UMLPackage.PROPERTY__DATATYPE)
			|| eIsSet(UMLPackage.PROPERTY__INTERFACE)
			|| eIsSet(UMLPackage.PROPERTY__CLASS)
			|| eIsSet(UMLPackage.PROPERTY__OWNING_ASSOCIATION);
	}

	/**
	 * The array of subset feature identifiers for the '{@link #getRedefinedElements() <em>Redefined Element</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRedefinedElements()
	 * @generated
	 * @ordered
	 */
	protected static final int[] REDEFINED_ELEMENT_ESUBSETS = new int[]{
		UMLPackage.PROPERTY__REDEFINED_PROPERTY};

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetRedefinedElements() {
		return super.isSetRedefinedElements()
			|| eIsSet(UMLPackage.PROPERTY__REDEFINED_PROPERTY);
	}

} //PropertyImpl
