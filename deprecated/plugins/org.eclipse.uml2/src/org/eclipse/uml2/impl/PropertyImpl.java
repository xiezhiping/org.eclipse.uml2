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
 * $Id: PropertyImpl.java,v 1.40 2006/05/26 18:16:42 khussey Exp $
 */
package org.eclipse.uml2.impl;

import java.lang.reflect.Method;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.common.util.UniqueEList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.uml2.AggregationKind;
import org.eclipse.uml2.Association;
import org.eclipse.uml2.Classifier;
import org.eclipse.uml2.ConnectableElement;
import org.eclipse.uml2.ConnectorEnd;
import org.eclipse.uml2.DataType;
import org.eclipse.uml2.Dependency;
import org.eclipse.uml2.Deployment;
import org.eclipse.uml2.DeploymentTarget;
import org.eclipse.uml2.Element;
import org.eclipse.uml2.Namespace;
import org.eclipse.uml2.PackageableElement;
import org.eclipse.uml2.ParameterableElement;
import org.eclipse.uml2.Property;
import org.eclipse.uml2.RedefinableElement;
import org.eclipse.uml2.StringExpression;
import org.eclipse.uml2.TemplateParameter;
import org.eclipse.uml2.TemplateSignature;
import org.eclipse.uml2.Type;
import org.eclipse.uml2.UML2Factory;
import org.eclipse.uml2.UML2Package;
import org.eclipse.uml2.ValueSpecification;
import org.eclipse.uml2.VisibilityKind;

import org.eclipse.uml2.common.util.CacheAdapter;
import org.eclipse.uml2.common.util.DerivedUnionEObjectEList;
import org.eclipse.uml2.common.util.SubsetSupersetEObjectContainmentWithInverseEList;
import org.eclipse.uml2.common.util.SubsetSupersetEObjectWithInverseResolvingEList;

import org.eclipse.uml2.common.util.UnionEObjectEList;

import org.eclipse.uml2.internal.operation.DeploymentTargetOperations;
import org.eclipse.uml2.internal.operation.PropertyOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Property</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2.impl.PropertyImpl#getOwner <em>Owner</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.PropertyImpl#getTemplateParameter <em>Template Parameter</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.PropertyImpl#getOwningParameter <em>Owning Parameter</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.PropertyImpl#getEnds <em>End</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.PropertyImpl#getOwnedElements <em>Owned Element</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.PropertyImpl#getClientDependencies <em>Client Dependency</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.PropertyImpl#getDeployments <em>Deployment</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.PropertyImpl#getDeployedElements <em>Deployed Element</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.PropertyImpl#getNamespace <em>Namespace</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.PropertyImpl#getFeaturingClassifiers <em>Featuring Classifier</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.PropertyImpl#getRedefinedElements <em>Redefined Element</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.PropertyImpl#getAssociation <em>Association</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.PropertyImpl#getDefault <em>Default</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.PropertyImpl#isComposite <em>Is Composite</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.PropertyImpl#isDerived <em>Is Derived</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.PropertyImpl#getClass_ <em>Class </em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.PropertyImpl#getOpposite <em>Opposite</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.PropertyImpl#isDerivedUnion <em>Is Derived Union</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.PropertyImpl#getOwningAssociation <em>Owning Association</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.PropertyImpl#getRedefinedProperties <em>Redefined Property</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.PropertyImpl#getSubsettedProperties <em>Subsetted Property</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.PropertyImpl#getDatatype <em>Datatype</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.PropertyImpl#getAggregation <em>Aggregation</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.PropertyImpl#getDefaultValue <em>Default Value</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.PropertyImpl#getQualifiers <em>Qualifier</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.PropertyImpl#getAssociationEnd <em>Association End</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.PropertyImpl#isReadOnly <em>Is Read Only</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PropertyImpl extends StructuralFeatureImpl implements Property {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) IBM Corporation and others."; //$NON-NLS-1$

	/**
	 * The cached value of the '{@link #getTemplateParameter() <em>Template Parameter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTemplateParameter()
	 * @generated
	 * @ordered
	 */
	protected TemplateParameter templateParameter = null;

	/**
	 * The cached value of the '{@link #getEnds() <em>End</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnds()
	 * @generated
	 * @ordered
	 */
	protected EList ends = null;

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
	 * The cached value of the '{@link #getAssociation() <em>Association</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssociation()
	 * @generated
	 * @ordered
	 */
	protected Association association = null;

	/**
	 * The default value of the '{@link #getDefault() <em>Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefault()
	 * @generated
	 * @ordered
	 */
	protected static final String DEFAULT_EDEFAULT = ""; //$NON-NLS-1$

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
	protected static final int IS_DERIVED_EFLAG = 1 << 13;

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
	protected static final int IS_DERIVED_UNION_EFLAG = 1 << 14;

	/**
	 * The cached value of the '{@link #getRedefinedProperties() <em>Redefined Property</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRedefinedProperties()
	 * @generated
	 * @ordered
	 */
	protected EList redefinedProperties = null;

	/**
	 * The cached value of the '{@link #getSubsettedProperties() <em>Subsetted Property</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubsettedProperties()
	 * @generated
	 * @ordered
	 */
	protected EList subsettedProperties = null;

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
	 * The cached value of the '{@link #getAggregation() <em>Aggregation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAggregation()
	 * @generated
	 * @ordered
	 */
	protected AggregationKind aggregation = AGGREGATION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDefaultValue() <em>Default Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultValue()
	 * @generated
	 * @ordered
	 */
	protected ValueSpecification defaultValue = null;

	/**
	 * The cached value of the '{@link #getQualifiers() <em>Qualifier</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQualifiers()
	 * @generated
	 * @ordered
	 */
	protected EList qualifiers = null;

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
	protected EClass eStaticClass() {
		return UML2Package.Literals.PROPERTY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Element getOwner() {
		Element owner = basicGetOwner();
		return owner != null && owner.eIsProxy() ? (Element)eResolveProxy((InternalEObject)owner) : owner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemplateParameter getTemplateParameter() {
		if (templateParameter != null && templateParameter.eIsProxy()) {
			InternalEObject oldTemplateParameter = (InternalEObject)templateParameter;
			templateParameter = (TemplateParameter)eResolveProxy(oldTemplateParameter);
			if (templateParameter != oldTemplateParameter) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UML2Package.PROPERTY__TEMPLATE_PARAMETER, oldTemplateParameter, templateParameter));
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
	public NotificationChain basicSetTemplateParameter(TemplateParameter newTemplateParameter, NotificationChain msgs) {
		TemplateParameter oldTemplateParameter = templateParameter;
		templateParameter = newTemplateParameter;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UML2Package.PROPERTY__TEMPLATE_PARAMETER, oldTemplateParameter, newTemplateParameter);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}

		Resource.Internal eInternalResource = eInternalResource();
		if (eInternalResource == null || !eInternalResource.isLoading()) {
			TemplateParameter owningParameter = getOwningParameter();
			if (owningParameter != null && owningParameter != newTemplateParameter) {
				setOwningParameter(null);
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
			eNotify(new ENotificationImpl(this, Notification.SET, UML2Package.PROPERTY__TEMPLATE_PARAMETER, newTemplateParameter, newTemplateParameter));

	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemplateParameter getOwningParameter() {
		if (eContainerFeatureID != UML2Package.PROPERTY__OWNING_PARAMETER) return null;
		return (TemplateParameter)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwningParameter(TemplateParameter newOwningParameter, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newOwningParameter, UML2Package.PROPERTY__OWNING_PARAMETER, msgs);

		Resource.Internal eInternalResource = eInternalResource();
		if (eInternalResource == null || !eInternalResource.isLoading()) {
			if (newOwningParameter != null) {
				if (newOwningParameter != templateParameter) {
					setTemplateParameter(newOwningParameter);
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
	public void setOwningParameter(TemplateParameter newOwningParameter) {
		if (newOwningParameter != eInternalContainer() || (eContainerFeatureID != UML2Package.PROPERTY__OWNING_PARAMETER && newOwningParameter != null)) {
			if (EcoreUtil.isAncestor(this, newOwningParameter))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString()); //$NON-NLS-1$
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOwningParameter != null)
				msgs = ((InternalEObject)newOwningParameter).eInverseAdd(this, UML2Package.TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT, TemplateParameter.class, msgs);
			msgs = basicSetOwningParameter(newOwningParameter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2Package.PROPERTY__OWNING_PARAMETER, newOwningParameter, newOwningParameter));

	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getEnds() {
		if (ends == null) {
			ends = new EObjectWithInverseResolvingEList(ConnectorEnd.class, this, UML2Package.PROPERTY__END, UML2Package.CONNECTOR_END__ROLE);
		}
		return ends;
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
				cache.put(eResource, this, UML2Package.Literals.ELEMENT__OWNED_ELEMENT, ownedElements = new DerivedUnionEObjectEList(Element.class, this, UML2Package.PROPERTY__OWNED_ELEMENT, OWNED_ELEMENT_ESUBSETS));
			}
			return ownedElements;
		}
		return new DerivedUnionEObjectEList(Element.class, this, UML2Package.PROPERTY__OWNED_ELEMENT, OWNED_ELEMENT_ESUBSETS);
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOwnedElements() {
		return super.isSetOwnedElements()
			|| eIsSet(UML2Package.PROPERTY__DEPLOYMENT)
			|| eIsSet(UML2Package.PROPERTY__DEFAULT_VALUE)
			|| eIsSet(UML2Package.PROPERTY__QUALIFIER);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getDeployments() {
		if (deployments == null) {
			deployments = new SubsetSupersetEObjectContainmentWithInverseEList(Deployment.class, this, UML2Package.PROPERTY__DEPLOYMENT, DEPLOYMENT_ESUPERSETS, null, UML2Package.DEPLOYMENT__LOCATION);
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
			eNotify(new ENotificationImpl(this, 0, UML2Package.PROPERTY__DEPLOYMENT, null, newDeployment));
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
			eNotify(new ENotificationImpl(this, 0, UML2Package.PROPERTY__DEPLOYMENT, null, newDeployment));
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
	public Namespace getNamespace() {
		Namespace namespace = basicGetNamespace();
		return namespace != null && namespace.eIsProxy() ? (Namespace)eResolveProxy((InternalEObject)namespace) : namespace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getFeaturingClassifiers() {
		CacheAdapter cache = getCacheAdapter();
		if (cache != null) {
			Resource eResource = eResource();
			EList featuringClassifiers = (EList) cache.get(eResource, this, UML2Package.Literals.FEATURE__FEATURING_CLASSIFIER);
			if (featuringClassifiers == null) {
				cache.put(eResource, this, UML2Package.Literals.FEATURE__FEATURING_CLASSIFIER, featuringClassifiers = new DerivedUnionEObjectEList(Classifier.class, this, UML2Package.PROPERTY__FEATURING_CLASSIFIER, FEATURING_CLASSIFIER_ESUBSETS));
			}
			return featuringClassifiers;
		}
		return new DerivedUnionEObjectEList(Classifier.class, this, UML2Package.PROPERTY__FEATURING_CLASSIFIER, FEATURING_CLASSIFIER_ESUBSETS);
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetFeaturingClassifiers() {
		return super.isSetFeaturingClassifiers()
			|| eIsSet(UML2Package.PROPERTY__CLASS_)
			|| eIsSet(UML2Package.PROPERTY__OWNING_ASSOCIATION)
			|| eIsSet(UML2Package.PROPERTY__DATATYPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String getDefault() {
		return org.eclipse.uml2.internal.operation.PropertyOperations.getDefault(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean isComposite() {
		return AggregationKind.COMPOSITE_LITERAL.equals(getAggregation());
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
		if (newIsDerived) eFlags |= IS_DERIVED_EFLAG; else eFlags &= ~IS_DERIVED_EFLAG;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2Package.PROPERTY__IS_DERIVED, oldIsDerived, newIsDerived));


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
		if (newIsDerivedUnion) eFlags |= IS_DERIVED_UNION_EFLAG; else eFlags &= ~IS_DERIVED_UNION_EFLAG;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2Package.PROPERTY__IS_DERIVED_UNION, oldIsDerivedUnion, newIsDerivedUnion));


	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AggregationKind getAggregation() {
		return aggregation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAggregation(AggregationKind newAggregation) {
		AggregationKind oldAggregation = aggregation;
		aggregation = newAggregation == null ? AGGREGATION_EDEFAULT : newAggregation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2Package.PROPERTY__AGGREGATION, oldAggregation, aggregation));


	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public org.eclipse.uml2.Class getClass_() {
		return eInternalContainer() instanceof org.eclipse.uml2.Class	? (org.eclipse.uml2.Class) eContainer() : null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property getOpposite() {
		Property opposite = basicGetOpposite();
		return opposite != null && opposite.eIsProxy() ? (Property)eResolveProxy((InternalEObject)opposite) : opposite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Property basicGetOpposite() {
		return opposite();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Association getOwningAssociation() {
		if (eContainerFeatureID != UML2Package.PROPERTY__OWNING_ASSOCIATION) return null;
		return (Association)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwningAssociation(Association newOwningAssociation, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newOwningAssociation, UML2Package.PROPERTY__OWNING_ASSOCIATION, msgs);

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
		if (newOwningAssociation != eInternalContainer() || (eContainerFeatureID != UML2Package.PROPERTY__OWNING_ASSOCIATION && newOwningAssociation != null)) {
			if (EcoreUtil.isAncestor(this, newOwningAssociation))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString()); //$NON-NLS-1$
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOwningAssociation != null)
				msgs = ((InternalEObject)newOwningAssociation).eInverseAdd(this, UML2Package.ASSOCIATION__OWNED_END, Association.class, msgs);
			msgs = basicSetOwningAssociation(newOwningAssociation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2Package.PROPERTY__OWNING_ASSOCIATION, newOwningAssociation, newOwningAssociation));

	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getRedefinedProperties() {
		if (redefinedProperties == null) {
			redefinedProperties = new EObjectResolvingEList(Property.class, this, UML2Package.PROPERTY__REDEFINED_PROPERTY);
		}
		return redefinedProperties;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
    public Property getRedefinedProperty(String name) {
		return getRedefinedProperty(name, false, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property getRedefinedProperty(String name, boolean ignoreCase, EClass eClass) {
		redefinedPropertyLoop: for (Iterator i = getRedefinedProperties().iterator(); i.hasNext(); ) {
			Property redefinedProperty = (Property) i.next();
			if (eClass != null && !eClass.isInstance(redefinedProperty))
				continue redefinedPropertyLoop;
			if (name != null && !(ignoreCase ? name.equalsIgnoreCase(redefinedProperty.getName()) : name.equals(redefinedProperty.getName())))
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
	public EList getSubsettedProperties() {
		if (subsettedProperties == null) {
			subsettedProperties = new EObjectResolvingEList(Property.class, this, UML2Package.PROPERTY__SUBSETTED_PROPERTY);
		}
		return subsettedProperties;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
    public Property getSubsettedProperty(String name) {
		return getSubsettedProperty(name, false, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property getSubsettedProperty(String name, boolean ignoreCase, EClass eClass) {
		subsettedPropertyLoop: for (Iterator i = getSubsettedProperties().iterator(); i.hasNext(); ) {
			Property subsettedProperty = (Property) i.next();
			if (eClass != null && !eClass.isInstance(subsettedProperty))
				continue subsettedPropertyLoop;
			if (name != null && !(ignoreCase ? name.equalsIgnoreCase(subsettedProperty.getName()) : name.equals(subsettedProperty.getName())))
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
	public DataType getDatatype() {
		if (eContainerFeatureID != UML2Package.PROPERTY__DATATYPE) return null;
		return (DataType)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDatatype(DataType newDatatype, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newDatatype, UML2Package.PROPERTY__DATATYPE, msgs);

		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDatatype(DataType newDatatype) {
		if (newDatatype != eInternalContainer() || (eContainerFeatureID != UML2Package.PROPERTY__DATATYPE && newDatatype != null)) {
			if (EcoreUtil.isAncestor(this, newDatatype))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString()); //$NON-NLS-1$
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newDatatype != null)
				msgs = ((InternalEObject)newDatatype).eInverseAdd(this, UML2Package.DATA_TYPE__OWNED_ATTRIBUTE, DataType.class, msgs);
			msgs = basicSetDatatype(newDatatype, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2Package.PROPERTY__DATATYPE, newDatatype, newDatatype));

	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Association getAssociation() {
		if (association != null && association.eIsProxy()) {
			InternalEObject oldAssociation = (InternalEObject)association;
			association = (Association)eResolveProxy(oldAssociation);
			if (association != oldAssociation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UML2Package.PROPERTY__ASSOCIATION, oldAssociation, association));
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
	public NotificationChain basicSetAssociation(Association newAssociation, NotificationChain msgs) {
		Association oldAssociation = association;
		association = newAssociation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UML2Package.PROPERTY__ASSOCIATION, oldAssociation, newAssociation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}

		Resource.Internal eInternalResource = eInternalResource();
		if (eInternalResource == null || !eInternalResource.isLoading()) {
			Association owningAssociation = getOwningAssociation();
			if (owningAssociation != null && owningAssociation != newAssociation) {
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
				msgs = ((InternalEObject)association).eInverseRemove(this, UML2Package.ASSOCIATION__MEMBER_END, Association.class, msgs);
			if (newAssociation != null)
				msgs = ((InternalEObject)newAssociation).eInverseAdd(this, UML2Package.ASSOCIATION__MEMBER_END, Association.class, msgs);
			msgs = basicSetAssociation(newAssociation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2Package.PROPERTY__ASSOCIATION, newAssociation, newAssociation));

	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueSpecification getDefaultValue() {
		return defaultValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDefaultValue(ValueSpecification newDefaultValue, NotificationChain msgs) {
		ValueSpecification oldDefaultValue = defaultValue;
		defaultValue = newDefaultValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UML2Package.PROPERTY__DEFAULT_VALUE, oldDefaultValue, newDefaultValue);
			if (msgs == null) msgs = notification; else msgs.add(notification);
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
				msgs = ((InternalEObject)defaultValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UML2Package.PROPERTY__DEFAULT_VALUE, null, msgs);
			if (newDefaultValue != null)
				msgs = ((InternalEObject)newDefaultValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UML2Package.PROPERTY__DEFAULT_VALUE, null, msgs);
			msgs = basicSetDefaultValue(newDefaultValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2Package.PROPERTY__DEFAULT_VALUE, newDefaultValue, newDefaultValue));

	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public ValueSpecification createDefaultValue(EClass eClass) {
		ValueSpecification newDefaultValue = (ValueSpecification) eClass.getEPackage().getEFactoryInstance().create(eClass);
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, 0, UML2Package.PROPERTY__DEFAULT_VALUE, null, newDefaultValue));
		}
		setDefaultValue(newDefaultValue);
		return newDefaultValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getQualifiers() {
		if (qualifiers == null) {
			qualifiers = new EObjectContainmentWithInverseEList(Property.class, this, UML2Package.PROPERTY__QUALIFIER, UML2Package.PROPERTY__ASSOCIATION_END);
		}
		return qualifiers;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
    public Property getQualifier(String name) {
		return getQualifier(name, false, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property getQualifier(String name, boolean ignoreCase, EClass eClass) {
		qualifierLoop: for (Iterator i = getQualifiers().iterator(); i.hasNext(); ) {
			Property qualifier = (Property) i.next();
			if (eClass != null && !eClass.isInstance(qualifier))
				continue qualifierLoop;
			if (name != null && !(ignoreCase ? name.equalsIgnoreCase(qualifier.getName()) : name.equals(qualifier.getName())))
				continue qualifierLoop;
			return qualifier;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Property createQualifier(EClass eClass) {
		Property newQualifier = (Property) eClass.getEPackage().getEFactoryInstance().create(eClass);
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, 0, UML2Package.PROPERTY__QUALIFIER, null, newQualifier));
		}
		getQualifiers().add(newQualifier);
		return newQualifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Property createQualifier() {
		Property newQualifier = UML2Factory.eINSTANCE.createProperty();
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, 0, UML2Package.PROPERTY__QUALIFIER, null, newQualifier));
		}
		getQualifiers().add(newQualifier);
		return newQualifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property getAssociationEnd() {
		if (eContainerFeatureID != UML2Package.PROPERTY__ASSOCIATION_END) return null;
		return (Property)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAssociationEnd(Property newAssociationEnd, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newAssociationEnd, UML2Package.PROPERTY__ASSOCIATION_END, msgs);

		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAssociationEnd(Property newAssociationEnd) {
		if (newAssociationEnd != eInternalContainer() || (eContainerFeatureID != UML2Package.PROPERTY__ASSOCIATION_END && newAssociationEnd != null)) {
			if (EcoreUtil.isAncestor(this, newAssociationEnd))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString()); //$NON-NLS-1$
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newAssociationEnd != null)
				msgs = ((InternalEObject)newAssociationEnd).eInverseAdd(this, UML2Package.PROPERTY__QUALIFIER, Property.class, msgs);
			msgs = basicSetAssociationEnd(newAssociationEnd, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2Package.PROPERTY__ASSOCIATION_END, newAssociationEnd, newAssociationEnd));

	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getClientDependencies() {
		if (clientDependencies == null) {
			clientDependencies = new SubsetSupersetEObjectWithInverseResolvingEList.ManyInverse(Dependency.class, this, UML2Package.PROPERTY__CLIENT_DEPENDENCY, null, CLIENT_DEPENDENCY_ESUBSETS, UML2Package.DEPENDENCY__CLIENT);
		}
		return clientDependencies;
	}


	/**
	 * The array of subset feature identifiers for the '{@link #getOwnedElements() <em>Owned Element</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedElements()
	 * @generated
	 * @ordered
	 */
	protected static final int[] OWNED_ELEMENT_ESUBSETS = new int[] {UML2Package.PROPERTY__OWNED_COMMENT, UML2Package.PROPERTY__TEMPLATE_BINDING, UML2Package.PROPERTY__OWNED_TEMPLATE_SIGNATURE, UML2Package.PROPERTY__NAME_EXPRESSION, UML2Package.PROPERTY__UPPER_VALUE, UML2Package.PROPERTY__LOWER_VALUE, UML2Package.PROPERTY__DEPLOYMENT, UML2Package.PROPERTY__DEFAULT_VALUE, UML2Package.PROPERTY__QUALIFIER};

	/**
	 * The array of subset feature identifiers for the '{@link #getClientDependencies() <em>Client Dependency</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClientDependencies()
	 * @generated
	 * @ordered
	 */
	protected static final int[] CLIENT_DEPENDENCY_ESUBSETS = new int[] {UML2Package.PROPERTY__DEPLOYMENT};

	/**
	 * The array of superset feature identifiers for the '{@link #getDeployments() <em>Deployment</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeployments()
	 * @generated
	 * @ordered
	 */
	protected static final int[] DEPLOYMENT_ESUPERSETS = new int[] {UML2Package.PROPERTY__CLIENT_DEPENDENCY};

	/**
	 * The array of subset feature identifiers for the '{@link #getFeaturingClassifiers() <em>Featuring Classifier</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeaturingClassifiers()
	 * @generated
	 * @ordered
	 */
	protected static final int[] FEATURING_CLASSIFIER_ESUBSETS = new int[] {UML2Package.PROPERTY__CLASS_, UML2Package.PROPERTY__OWNING_ASSOCIATION, UML2Package.PROPERTY__DATATYPE};

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getRedefinedElements() {
		CacheAdapter cache = getCacheAdapter();
		if (cache != null) {
			try {
				Method method = getClass().getMethod("getRedefinedElements", null); //$NON-NLS-1$
				EList redefinedElements = (EList) cache.get(eResource(), this, method);
				if (redefinedElements == null) {
					List union = getRedefinedElementsHelper(new UniqueEList.FastCompare());
					cache.put(eResource(), this, method, redefinedElements = new UnionEObjectEList(this, null, union.size(), union.toArray()));
				}
				return redefinedElements;
			}
			catch (NoSuchMethodException nsme) {
				// ignore
			}
		}
		List union = getRedefinedElementsHelper(new UniqueEList.FastCompare());
		return new UnionEObjectEList(this, null, union.size(), union.toArray());
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property opposite() {
		return PropertyOperations.opposite(this);
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMultiplicityOfComposite(DiagnosticChain diagnostics, Map context) {
		return PropertyOperations.validateMultiplicityOfComposite(this, diagnostics, context);
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSubsettingContext(DiagnosticChain diagnostics, Map context) {
		return PropertyOperations.validateSubsettingContext(this, diagnostics, context);
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNavigablePropertyRedefinition(DiagnosticChain diagnostics, Map context) {
		return PropertyOperations.validateNavigablePropertyRedefinition(this, diagnostics, context);
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSubsettingRules(DiagnosticChain diagnostics, Map context) {
		return PropertyOperations.validateSubsettingRules(this, diagnostics, context);
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNavigableReadonly(DiagnosticChain diagnostics, Map context) {
		return PropertyOperations.validateNavigableReadonly(this, diagnostics, context);
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDerivedUnionIsDerived(DiagnosticChain diagnostics, Map context) {
		return PropertyOperations.validateDerivedUnionIsDerived(this, diagnostics, context);
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isConsistentWith(RedefinableElement redefinee) {
		return PropertyOperations.isConsistentWith(this, redefinee);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UML2Package.PROPERTY__EANNOTATIONS:
				return ((InternalEList)getEAnnotations()).basicAdd(otherEnd, msgs);
			case UML2Package.PROPERTY__TEMPLATE_BINDING:
				return ((InternalEList)getTemplateBindings()).basicAdd(otherEnd, msgs);
			case UML2Package.PROPERTY__OWNED_TEMPLATE_SIGNATURE:
				if (ownedTemplateSignature != null)
					msgs = ((InternalEObject)ownedTemplateSignature).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UML2Package.PROPERTY__OWNED_TEMPLATE_SIGNATURE, null, msgs);
				return basicSetOwnedTemplateSignature((TemplateSignature)otherEnd, msgs);
			case UML2Package.PROPERTY__CLIENT_DEPENDENCY:
				return ((InternalEList)getClientDependencies()).basicAdd(otherEnd, msgs);
			case UML2Package.PROPERTY__TEMPLATE_PARAMETER:
				if (templateParameter != null)
					msgs = ((InternalEObject)templateParameter).eInverseRemove(this, UML2Package.TEMPLATE_PARAMETER__PARAMETERED_ELEMENT, TemplateParameter.class, msgs);
				return basicSetTemplateParameter((TemplateParameter)otherEnd, msgs);
			case UML2Package.PROPERTY__OWNING_PARAMETER:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOwningParameter((TemplateParameter)otherEnd, msgs);
			case UML2Package.PROPERTY__END:
				return ((InternalEList)getEnds()).basicAdd(otherEnd, msgs);
			case UML2Package.PROPERTY__DEPLOYMENT:
				return ((InternalEList)getDeployments()).basicAdd(otherEnd, msgs);
			case UML2Package.PROPERTY__OWNING_ASSOCIATION:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOwningAssociation((Association)otherEnd, msgs);
			case UML2Package.PROPERTY__DATATYPE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetDatatype((DataType)otherEnd, msgs);
			case UML2Package.PROPERTY__ASSOCIATION:
				if (association != null)
					msgs = ((InternalEObject)association).eInverseRemove(this, UML2Package.ASSOCIATION__MEMBER_END, Association.class, msgs);
				return basicSetAssociation((Association)otherEnd, msgs);
			case UML2Package.PROPERTY__QUALIFIER:
				return ((InternalEList)getQualifiers()).basicAdd(otherEnd, msgs);
			case UML2Package.PROPERTY__ASSOCIATION_END:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetAssociationEnd((Property)otherEnd, msgs);
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
			case UML2Package.PROPERTY__EANNOTATIONS:
				return ((InternalEList)getEAnnotations()).basicRemove(otherEnd, msgs);
			case UML2Package.PROPERTY__OWNED_COMMENT:
				return ((InternalEList)getOwnedComments()).basicRemove(otherEnd, msgs);
			case UML2Package.PROPERTY__TEMPLATE_BINDING:
				return ((InternalEList)getTemplateBindings()).basicRemove(otherEnd, msgs);
			case UML2Package.PROPERTY__OWNED_TEMPLATE_SIGNATURE:
				return basicSetOwnedTemplateSignature(null, msgs);
			case UML2Package.PROPERTY__CLIENT_DEPENDENCY:
				return ((InternalEList)getClientDependencies()).basicRemove(otherEnd, msgs);
			case UML2Package.PROPERTY__NAME_EXPRESSION:
				return basicSetNameExpression(null, msgs);
			case UML2Package.PROPERTY__UPPER_VALUE:
				return basicSetUpperValue(null, msgs);
			case UML2Package.PROPERTY__LOWER_VALUE:
				return basicSetLowerValue(null, msgs);
			case UML2Package.PROPERTY__TEMPLATE_PARAMETER:
				return basicSetTemplateParameter(null, msgs);
			case UML2Package.PROPERTY__OWNING_PARAMETER:
				return basicSetOwningParameter(null, msgs);
			case UML2Package.PROPERTY__END:
				return ((InternalEList)getEnds()).basicRemove(otherEnd, msgs);
			case UML2Package.PROPERTY__DEPLOYMENT:
				return ((InternalEList)getDeployments()).basicRemove(otherEnd, msgs);
			case UML2Package.PROPERTY__OWNING_ASSOCIATION:
				return basicSetOwningAssociation(null, msgs);
			case UML2Package.PROPERTY__DATATYPE:
				return basicSetDatatype(null, msgs);
			case UML2Package.PROPERTY__ASSOCIATION:
				return basicSetAssociation(null, msgs);
			case UML2Package.PROPERTY__DEFAULT_VALUE:
				return basicSetDefaultValue(null, msgs);
			case UML2Package.PROPERTY__QUALIFIER:
				return ((InternalEList)getQualifiers()).basicRemove(otherEnd, msgs);
			case UML2Package.PROPERTY__ASSOCIATION_END:
				return basicSetAssociationEnd(null, msgs);
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
			case UML2Package.PROPERTY__OWNING_PARAMETER:
				return eInternalContainer().eInverseRemove(this, UML2Package.TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT, TemplateParameter.class, msgs);
			case UML2Package.PROPERTY__OWNING_ASSOCIATION:
				return eInternalContainer().eInverseRemove(this, UML2Package.ASSOCIATION__OWNED_END, Association.class, msgs);
			case UML2Package.PROPERTY__DATATYPE:
				return eInternalContainer().eInverseRemove(this, UML2Package.DATA_TYPE__OWNED_ATTRIBUTE, DataType.class, msgs);
			case UML2Package.PROPERTY__ASSOCIATION_END:
				return eInternalContainer().eInverseRemove(this, UML2Package.PROPERTY__QUALIFIER, Property.class, msgs);
		}
		return eDynamicBasicRemoveFromContainer(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Set subsettingContext() {
		CacheAdapter cache = getCacheAdapter();
		if (cache != null) {
			Set result = (Set) cache.get(this, UML2Package.Literals.PROPERTY.getEOperations().get(8));
			if (result == null) {
				cache.put(this, UML2Package.Literals.PROPERTY.getEOperations().get(8), result = PropertyOperations.subsettingContext(this));
			}
			return result;
		}
		return PropertyOperations.subsettingContext(this);
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean isReadOnly() {
		return super.isReadOnly();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void setIsReadOnly(boolean newIsReadOnly) {
		super.setIsReadOnly(newIsReadOnly);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIsReadOnly() {
		return ((eFlags & IS_READ_ONLY_EFLAG) != 0) != IS_READ_ONLY_EDEFAULT;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOppositeIsOtherEnd(DiagnosticChain diagnostics, Map context) {
		return PropertyOperations.validateOppositeIsOtherEnd(this, diagnostics, context);
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Namespace basicGetNamespace() {
		org.eclipse.uml2.Class class_ = getClass_();			
		if (class_ != null) {
			return class_;
		}
		Association owningAssociation = getOwningAssociation();			
		if (owningAssociation != null) {
			return owningAssociation;
		}
		DataType datatype = getDatatype();			
		if (datatype != null) {
			return datatype;
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
			|| eIsSet(UML2Package.PROPERTY__CLASS_)
			|| eIsSet(UML2Package.PROPERTY__OWNING_ASSOCIATION)
			|| eIsSet(UML2Package.PROPERTY__DATATYPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EList getRedefinedElementsHelper(EList redefinedElements) {
		super.getRedefinedElementsHelper(redefinedElements);
		if (eIsSet(UML2Package.PROPERTY__REDEFINED_PROPERTY)) {
			for (Iterator i = ((InternalEList) getRedefinedProperties()).basicIterator(); i.hasNext(); ) {
				redefinedElements.add(i.next());
			}
		}
		return redefinedElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRedefinedElements() {
		return super.isSetRedefinedElements()
			|| eIsSet(UML2Package.PROPERTY__REDEFINED_PROPERTY);
	}

	/**
	 * The array of subset feature identifiers for the '{@link #getRedefinedElements() <em>Redefined Element</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRedefinedElements()
	 * @generated
	 * @ordered
	 */
	protected static final int[] REDEFINED_ELEMENT_ESUBSETS = new int[] {UML2Package.PROPERTY__REDEFINED_PROPERTY};

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
		Property associationEnd = getAssociationEnd();			
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
	public boolean isSetOwner() {
		return super.isSetOwner()
			|| eIsSet(UML2Package.PROPERTY__OWNING_PARAMETER)
			|| eIsSet(UML2Package.PROPERTY__ASSOCIATION_END);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UML2Package.PROPERTY__EANNOTATIONS:
				return getEAnnotations();
			case UML2Package.PROPERTY__OWNED_ELEMENT:
				return getOwnedElements();
			case UML2Package.PROPERTY__OWNER:
				if (resolve) return getOwner();
				return basicGetOwner();
			case UML2Package.PROPERTY__OWNED_COMMENT:
				return getOwnedComments();
			case UML2Package.PROPERTY__TEMPLATE_BINDING:
				return getTemplateBindings();
			case UML2Package.PROPERTY__OWNED_TEMPLATE_SIGNATURE:
				return getOwnedTemplateSignature();
			case UML2Package.PROPERTY__NAME:
				return getName();
			case UML2Package.PROPERTY__QUALIFIED_NAME:
				return getQualifiedName();
			case UML2Package.PROPERTY__VISIBILITY:
				return getVisibility();
			case UML2Package.PROPERTY__CLIENT_DEPENDENCY:
				return getClientDependencies();
			case UML2Package.PROPERTY__NAME_EXPRESSION:
				return getNameExpression();
			case UML2Package.PROPERTY__REDEFINITION_CONTEXT:
				return getRedefinitionContexts();
			case UML2Package.PROPERTY__IS_LEAF:
				return isLeaf() ? Boolean.TRUE : Boolean.FALSE;
			case UML2Package.PROPERTY__FEATURING_CLASSIFIER:
				return getFeaturingClassifiers();
			case UML2Package.PROPERTY__IS_STATIC:
				return isStatic() ? Boolean.TRUE : Boolean.FALSE;
			case UML2Package.PROPERTY__TYPE:
				if (resolve) return getType();
				return basicGetType();
			case UML2Package.PROPERTY__IS_ORDERED:
				return isOrdered() ? Boolean.TRUE : Boolean.FALSE;
			case UML2Package.PROPERTY__IS_UNIQUE:
				return isUnique() ? Boolean.TRUE : Boolean.FALSE;
			case UML2Package.PROPERTY__LOWER:
				return new Integer(getLower());
			case UML2Package.PROPERTY__UPPER:
				return new Integer(getUpper());
			case UML2Package.PROPERTY__UPPER_VALUE:
				return getUpperValue();
			case UML2Package.PROPERTY__LOWER_VALUE:
				return getLowerValue();
			case UML2Package.PROPERTY__IS_READ_ONLY:
				return isReadOnly() ? Boolean.TRUE : Boolean.FALSE;
			case UML2Package.PROPERTY__TEMPLATE_PARAMETER:
				if (resolve) return getTemplateParameter();
				return basicGetTemplateParameter();
			case UML2Package.PROPERTY__OWNING_PARAMETER:
				return getOwningParameter();
			case UML2Package.PROPERTY__END:
				return getEnds();
			case UML2Package.PROPERTY__DEPLOYMENT:
				return getDeployments();
			case UML2Package.PROPERTY__DEPLOYED_ELEMENT:
				return getDeployedElements();
			case UML2Package.PROPERTY__DEFAULT:
				return getDefault();
			case UML2Package.PROPERTY__IS_COMPOSITE:
				return isComposite() ? Boolean.TRUE : Boolean.FALSE;
			case UML2Package.PROPERTY__IS_DERIVED:
				return isDerived() ? Boolean.TRUE : Boolean.FALSE;
			case UML2Package.PROPERTY__CLASS_:
				return getClass_();
			case UML2Package.PROPERTY__OPPOSITE:
				if (resolve) return getOpposite();
				return basicGetOpposite();
			case UML2Package.PROPERTY__IS_DERIVED_UNION:
				return isDerivedUnion() ? Boolean.TRUE : Boolean.FALSE;
			case UML2Package.PROPERTY__OWNING_ASSOCIATION:
				return getOwningAssociation();
			case UML2Package.PROPERTY__REDEFINED_PROPERTY:
				return getRedefinedProperties();
			case UML2Package.PROPERTY__SUBSETTED_PROPERTY:
				return getSubsettedProperties();
			case UML2Package.PROPERTY__DATATYPE:
				return getDatatype();
			case UML2Package.PROPERTY__ASSOCIATION:
				if (resolve) return getAssociation();
				return basicGetAssociation();
			case UML2Package.PROPERTY__AGGREGATION:
				return getAggregation();
			case UML2Package.PROPERTY__DEFAULT_VALUE:
				return getDefaultValue();
			case UML2Package.PROPERTY__QUALIFIER:
				return getQualifiers();
			case UML2Package.PROPERTY__ASSOCIATION_END:
				return getAssociationEnd();
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
			case UML2Package.PROPERTY__EANNOTATIONS:
				getEAnnotations().clear();
				getEAnnotations().addAll((Collection)newValue);
				return;
			case UML2Package.PROPERTY__OWNED_COMMENT:
				getOwnedComments().clear();
				getOwnedComments().addAll((Collection)newValue);
				return;
			case UML2Package.PROPERTY__TEMPLATE_BINDING:
				getTemplateBindings().clear();
				getTemplateBindings().addAll((Collection)newValue);
				return;
			case UML2Package.PROPERTY__OWNED_TEMPLATE_SIGNATURE:
				setOwnedTemplateSignature((TemplateSignature)newValue);
				return;
			case UML2Package.PROPERTY__NAME:
				setName((String)newValue);
				return;
			case UML2Package.PROPERTY__VISIBILITY:
				setVisibility((VisibilityKind)newValue);
				return;
			case UML2Package.PROPERTY__CLIENT_DEPENDENCY:
				getClientDependencies().clear();
				getClientDependencies().addAll((Collection)newValue);
				return;
			case UML2Package.PROPERTY__NAME_EXPRESSION:
				setNameExpression((StringExpression)newValue);
				return;
			case UML2Package.PROPERTY__IS_LEAF:
				setIsLeaf(((Boolean)newValue).booleanValue());
				return;
			case UML2Package.PROPERTY__IS_STATIC:
				setIsStatic(((Boolean)newValue).booleanValue());
				return;
			case UML2Package.PROPERTY__TYPE:
				setType((Type)newValue);
				return;
			case UML2Package.PROPERTY__IS_ORDERED:
				setIsOrdered(((Boolean)newValue).booleanValue());
				return;
			case UML2Package.PROPERTY__IS_UNIQUE:
				setIsUnique(((Boolean)newValue).booleanValue());
				return;
			case UML2Package.PROPERTY__UPPER_VALUE:
				setUpperValue((ValueSpecification)newValue);
				return;
			case UML2Package.PROPERTY__LOWER_VALUE:
				setLowerValue((ValueSpecification)newValue);
				return;
			case UML2Package.PROPERTY__IS_READ_ONLY:
				setIsReadOnly(((Boolean)newValue).booleanValue());
				return;
			case UML2Package.PROPERTY__TEMPLATE_PARAMETER:
				setTemplateParameter((TemplateParameter)newValue);
				return;
			case UML2Package.PROPERTY__OWNING_PARAMETER:
				setOwningParameter((TemplateParameter)newValue);
				return;
			case UML2Package.PROPERTY__END:
				getEnds().clear();
				getEnds().addAll((Collection)newValue);
				return;
			case UML2Package.PROPERTY__DEPLOYMENT:
				getDeployments().clear();
				getDeployments().addAll((Collection)newValue);
				return;
			case UML2Package.PROPERTY__IS_DERIVED:
				setIsDerived(((Boolean)newValue).booleanValue());
				return;
			case UML2Package.PROPERTY__IS_DERIVED_UNION:
				setIsDerivedUnion(((Boolean)newValue).booleanValue());
				return;
			case UML2Package.PROPERTY__OWNING_ASSOCIATION:
				setOwningAssociation((Association)newValue);
				return;
			case UML2Package.PROPERTY__REDEFINED_PROPERTY:
				getRedefinedProperties().clear();
				getRedefinedProperties().addAll((Collection)newValue);
				return;
			case UML2Package.PROPERTY__SUBSETTED_PROPERTY:
				getSubsettedProperties().clear();
				getSubsettedProperties().addAll((Collection)newValue);
				return;
			case UML2Package.PROPERTY__DATATYPE:
				setDatatype((DataType)newValue);
				return;
			case UML2Package.PROPERTY__ASSOCIATION:
				setAssociation((Association)newValue);
				return;
			case UML2Package.PROPERTY__AGGREGATION:
				setAggregation((AggregationKind)newValue);
				return;
			case UML2Package.PROPERTY__DEFAULT_VALUE:
				setDefaultValue((ValueSpecification)newValue);
				return;
			case UML2Package.PROPERTY__QUALIFIER:
				getQualifiers().clear();
				getQualifiers().addAll((Collection)newValue);
				return;
			case UML2Package.PROPERTY__ASSOCIATION_END:
				setAssociationEnd((Property)newValue);
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
			case UML2Package.PROPERTY__EANNOTATIONS:
				getEAnnotations().clear();
				return;
			case UML2Package.PROPERTY__OWNED_COMMENT:
				getOwnedComments().clear();
				return;
			case UML2Package.PROPERTY__TEMPLATE_BINDING:
				getTemplateBindings().clear();
				return;
			case UML2Package.PROPERTY__OWNED_TEMPLATE_SIGNATURE:
				setOwnedTemplateSignature((TemplateSignature)null);
				return;
			case UML2Package.PROPERTY__NAME:
				setName(NAME_EDEFAULT);
				return;
			case UML2Package.PROPERTY__VISIBILITY:
				setVisibility(VISIBILITY_EDEFAULT);
				return;
			case UML2Package.PROPERTY__CLIENT_DEPENDENCY:
				getClientDependencies().clear();
				return;
			case UML2Package.PROPERTY__NAME_EXPRESSION:
				setNameExpression((StringExpression)null);
				return;
			case UML2Package.PROPERTY__IS_LEAF:
				setIsLeaf(IS_LEAF_EDEFAULT);
				return;
			case UML2Package.PROPERTY__IS_STATIC:
				setIsStatic(IS_STATIC_EDEFAULT);
				return;
			case UML2Package.PROPERTY__TYPE:
				setType((Type)null);
				return;
			case UML2Package.PROPERTY__IS_ORDERED:
				setIsOrdered(IS_ORDERED_EDEFAULT);
				return;
			case UML2Package.PROPERTY__IS_UNIQUE:
				setIsUnique(IS_UNIQUE_EDEFAULT);
				return;
			case UML2Package.PROPERTY__UPPER_VALUE:
				setUpperValue((ValueSpecification)null);
				return;
			case UML2Package.PROPERTY__LOWER_VALUE:
				setLowerValue((ValueSpecification)null);
				return;
			case UML2Package.PROPERTY__IS_READ_ONLY:
				setIsReadOnly(IS_READ_ONLY_EDEFAULT);
				return;
			case UML2Package.PROPERTY__TEMPLATE_PARAMETER:
				setTemplateParameter((TemplateParameter)null);
				return;
			case UML2Package.PROPERTY__OWNING_PARAMETER:
				setOwningParameter((TemplateParameter)null);
				return;
			case UML2Package.PROPERTY__END:
				getEnds().clear();
				return;
			case UML2Package.PROPERTY__DEPLOYMENT:
				getDeployments().clear();
				return;
			case UML2Package.PROPERTY__IS_DERIVED:
				setIsDerived(IS_DERIVED_EDEFAULT);
				return;
			case UML2Package.PROPERTY__IS_DERIVED_UNION:
				setIsDerivedUnion(IS_DERIVED_UNION_EDEFAULT);
				return;
			case UML2Package.PROPERTY__OWNING_ASSOCIATION:
				setOwningAssociation((Association)null);
				return;
			case UML2Package.PROPERTY__REDEFINED_PROPERTY:
				getRedefinedProperties().clear();
				return;
			case UML2Package.PROPERTY__SUBSETTED_PROPERTY:
				getSubsettedProperties().clear();
				return;
			case UML2Package.PROPERTY__DATATYPE:
				setDatatype((DataType)null);
				return;
			case UML2Package.PROPERTY__ASSOCIATION:
				setAssociation((Association)null);
				return;
			case UML2Package.PROPERTY__AGGREGATION:
				setAggregation(AGGREGATION_EDEFAULT);
				return;
			case UML2Package.PROPERTY__DEFAULT_VALUE:
				setDefaultValue((ValueSpecification)null);
				return;
			case UML2Package.PROPERTY__QUALIFIER:
				getQualifiers().clear();
				return;
			case UML2Package.PROPERTY__ASSOCIATION_END:
				setAssociationEnd((Property)null);
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
			case UML2Package.PROPERTY__EANNOTATIONS:
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UML2Package.PROPERTY__OWNED_ELEMENT:
				return isSetOwnedElements();
			case UML2Package.PROPERTY__OWNER:
				return isSetOwner();
			case UML2Package.PROPERTY__OWNED_COMMENT:
				return ownedComments != null && !ownedComments.isEmpty();
			case UML2Package.PROPERTY__TEMPLATE_BINDING:
				return templateBindings != null && !templateBindings.isEmpty();
			case UML2Package.PROPERTY__OWNED_TEMPLATE_SIGNATURE:
				return ownedTemplateSignature != null;
			case UML2Package.PROPERTY__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case UML2Package.PROPERTY__QUALIFIED_NAME:
				return QUALIFIED_NAME_EDEFAULT == null ? getQualifiedName() != null : !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case UML2Package.PROPERTY__VISIBILITY:
				return visibility != VISIBILITY_EDEFAULT;
			case UML2Package.PROPERTY__CLIENT_DEPENDENCY:
				return clientDependencies != null && !clientDependencies.isEmpty();
			case UML2Package.PROPERTY__NAME_EXPRESSION:
				return nameExpression != null;
			case UML2Package.PROPERTY__REDEFINITION_CONTEXT:
				return isSetRedefinitionContexts();
			case UML2Package.PROPERTY__IS_LEAF:
				return ((eFlags & IS_LEAF_EFLAG) != 0) != IS_LEAF_EDEFAULT;
			case UML2Package.PROPERTY__FEATURING_CLASSIFIER:
				return isSetFeaturingClassifiers();
			case UML2Package.PROPERTY__IS_STATIC:
				return ((eFlags & IS_STATIC_EFLAG) != 0) != IS_STATIC_EDEFAULT;
			case UML2Package.PROPERTY__TYPE:
				return type != null;
			case UML2Package.PROPERTY__IS_ORDERED:
				return ((eFlags & IS_ORDERED_EFLAG) != 0) != IS_ORDERED_EDEFAULT;
			case UML2Package.PROPERTY__IS_UNIQUE:
				return ((eFlags & IS_UNIQUE_EFLAG) != 0) != IS_UNIQUE_EDEFAULT;
			case UML2Package.PROPERTY__LOWER:
				return getLower() != LOWER_EDEFAULT;
			case UML2Package.PROPERTY__UPPER:
				return getUpper() != UPPER_EDEFAULT;
			case UML2Package.PROPERTY__UPPER_VALUE:
				return upperValue != null;
			case UML2Package.PROPERTY__LOWER_VALUE:
				return lowerValue != null;
			case UML2Package.PROPERTY__IS_READ_ONLY:
				return isSetIsReadOnly();
			case UML2Package.PROPERTY__TEMPLATE_PARAMETER:
				return templateParameter != null;
			case UML2Package.PROPERTY__OWNING_PARAMETER:
				return getOwningParameter() != null;
			case UML2Package.PROPERTY__END:
				return ends != null && !ends.isEmpty();
			case UML2Package.PROPERTY__DEPLOYMENT:
				return deployments != null && !deployments.isEmpty();
			case UML2Package.PROPERTY__DEPLOYED_ELEMENT:
				return !getDeployedElements().isEmpty();
			case UML2Package.PROPERTY__DEFAULT:
				return DEFAULT_EDEFAULT == null ? getDefault() != null : !DEFAULT_EDEFAULT.equals(getDefault());
			case UML2Package.PROPERTY__IS_COMPOSITE:
				return isComposite() != IS_COMPOSITE_EDEFAULT;
			case UML2Package.PROPERTY__IS_DERIVED:
				return ((eFlags & IS_DERIVED_EFLAG) != 0) != IS_DERIVED_EDEFAULT;
			case UML2Package.PROPERTY__CLASS_:
				return getClass_() != null;
			case UML2Package.PROPERTY__OPPOSITE:
				return basicGetOpposite() != null;
			case UML2Package.PROPERTY__IS_DERIVED_UNION:
				return ((eFlags & IS_DERIVED_UNION_EFLAG) != 0) != IS_DERIVED_UNION_EDEFAULT;
			case UML2Package.PROPERTY__OWNING_ASSOCIATION:
				return getOwningAssociation() != null;
			case UML2Package.PROPERTY__REDEFINED_PROPERTY:
				return redefinedProperties != null && !redefinedProperties.isEmpty();
			case UML2Package.PROPERTY__SUBSETTED_PROPERTY:
				return subsettedProperties != null && !subsettedProperties.isEmpty();
			case UML2Package.PROPERTY__DATATYPE:
				return getDatatype() != null;
			case UML2Package.PROPERTY__ASSOCIATION:
				return association != null;
			case UML2Package.PROPERTY__AGGREGATION:
				return aggregation != AGGREGATION_EDEFAULT;
			case UML2Package.PROPERTY__DEFAULT_VALUE:
				return defaultValue != null;
			case UML2Package.PROPERTY__QUALIFIER:
				return qualifiers != null && !qualifiers.isEmpty();
			case UML2Package.PROPERTY__ASSOCIATION_END:
				return getAssociationEnd() != null;
		}
		return eDynamicIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class baseClass) {
		if (baseClass == ParameterableElement.class) {
			switch (derivedFeatureID) {
				case UML2Package.PROPERTY__TEMPLATE_PARAMETER: return UML2Package.PARAMETERABLE_ELEMENT__TEMPLATE_PARAMETER;
				case UML2Package.PROPERTY__OWNING_PARAMETER: return UML2Package.PARAMETERABLE_ELEMENT__OWNING_PARAMETER;
				default: return -1;
			}
		}
		if (baseClass == ConnectableElement.class) {
			switch (derivedFeatureID) {
				case UML2Package.PROPERTY__END: return UML2Package.CONNECTABLE_ELEMENT__END;
				default: return -1;
			}
		}
		if (baseClass == DeploymentTarget.class) {
			switch (derivedFeatureID) {
				case UML2Package.PROPERTY__DEPLOYMENT: return UML2Package.DEPLOYMENT_TARGET__DEPLOYMENT;
				case UML2Package.PROPERTY__DEPLOYED_ELEMENT: return UML2Package.DEPLOYMENT_TARGET__DEPLOYED_ELEMENT;
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
				case UML2Package.PARAMETERABLE_ELEMENT__TEMPLATE_PARAMETER: return UML2Package.PROPERTY__TEMPLATE_PARAMETER;
				case UML2Package.PARAMETERABLE_ELEMENT__OWNING_PARAMETER: return UML2Package.PROPERTY__OWNING_PARAMETER;
				default: return -1;
			}
		}
		if (baseClass == ConnectableElement.class) {
			switch (baseFeatureID) {
				case UML2Package.CONNECTABLE_ELEMENT__END: return UML2Package.PROPERTY__END;
				default: return -1;
			}
		}
		if (baseClass == DeploymentTarget.class) {
			switch (baseFeatureID) {
				case UML2Package.DEPLOYMENT_TARGET__DEPLOYMENT: return UML2Package.PROPERTY__DEPLOYMENT;
				case UML2Package.DEPLOYMENT_TARGET__DEPLOYED_ELEMENT: return UML2Package.PROPERTY__DEPLOYED_ELEMENT;
				default: return -1;
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
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (isDerived: "); //$NON-NLS-1$
		result.append((eFlags & IS_DERIVED_EFLAG) != 0);
		result.append(", isDerivedUnion: "); //$NON-NLS-1$
		result.append((eFlags & IS_DERIVED_UNION_EFLAG) != 0);
		result.append(", aggregation: "); //$NON-NLS-1$
		result.append(aggregation);
		result.append(", isReadOnly: "); //$NON-NLS-1$
		result.append((eFlags & IS_READ_ONLY_EFLAG) != 0);
		result.append(')');
		return result.toString();
	}


		// <!-- begin-custom-operations -->

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.uml2.Property#isNavigable()
	 */
	public boolean isNavigable() {
		return PropertyOperations.isNavigable(this);
	}
	
	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.uml2.Property#setNavigable(boolean)
	 */
	public void setNavigable(boolean navigable) {
		PropertyOperations.setNavigable(this, navigable);
	}
	
	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.uml2.Property#setBooleanDefault(boolean)
	 */
	public void setBooleanDefault(boolean value) {
		PropertyOperations.setBooleanDefault(this, value);
	}
	
	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.uml2.Property#setIntegerDefault(int)
	 */
	public void setIntegerDefault(int value) {
		PropertyOperations.setIntegerDefault(this, value);
	}
	
	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.uml2.Property#setStringDefault(java.lang.String)
	 */
	public void setStringDefault(String value) {
		PropertyOperations.setStringDefault(this, value);
	}
	
	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.uml2.Property#setUnlimitedNaturalDefault(int)
	 */
	public void setUnlimitedNaturalDefault(int value) {
		PropertyOperations.setUnlimitedNaturalDefault(this, value);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.uml2.Property#getOtherEnd()
	 */
	public Property getOtherEnd() {
		return PropertyOperations.getOtherEnd(this);
	}
	
	// <!-- end-custom-operations -->

} //PropertyImpl
