/*
 * Copyright (c) 2003, 2004 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *
 * $Id: PropertyImpl.java,v 1.16 2005/03/15 18:44:36 khussey Exp $
 */
package org.eclipse.uml2.impl;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.uml2.AggregationKind;
import org.eclipse.uml2.Artifact;
import org.eclipse.uml2.Association;
import org.eclipse.uml2.ConnectableElement;
import org.eclipse.uml2.ConnectorEnd;
import org.eclipse.uml2.DataType;
import org.eclipse.uml2.Dependency;
import org.eclipse.uml2.DeployedArtifact;
import org.eclipse.uml2.Deployment;
import org.eclipse.uml2.DeploymentTarget;
import org.eclipse.uml2.Element;
import org.eclipse.uml2.Manifestation;
import org.eclipse.uml2.Namespace;
import org.eclipse.uml2.PackageableElement;
import org.eclipse.uml2.ParameterableElement;
import org.eclipse.uml2.Property;
import org.eclipse.uml2.RedefinableElement;
import org.eclipse.uml2.StringExpression;
import org.eclipse.uml2.TemplateParameter;
import org.eclipse.uml2.TemplateSignature;
import org.eclipse.uml2.Type;
import org.eclipse.uml2.UML2Package;
import org.eclipse.uml2.ValueSpecification;
import org.eclipse.uml2.VisibilityKind;
import org.eclipse.uml2.internal.operation.PropertyOperations;
import org.eclipse.uml2.internal.util.SubsetEObjectContainmentWithInverseEList;
import org.eclipse.uml2.internal.util.SupersetEObjectWithInverseResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Property</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2.impl.PropertyImpl#getTemplateParameter <em>Template Parameter</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.PropertyImpl#getOwningParameter <em>Owning Parameter</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.PropertyImpl#getEnds <em>End</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.PropertyImpl#getDeployments <em>Deployment</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.PropertyImpl#getDeployedElements <em>Deployed Element</em>}</li>
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
 *   <li>{@link org.eclipse.uml2.impl.PropertyImpl#getAssociation <em>Association</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.PropertyImpl#getAggregation <em>Aggregation</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.PropertyImpl#getDefaultValue <em>Default Value</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.PropertyImpl#getQualifiers <em>Qualifier</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.PropertyImpl#getAssociationEnd <em>Association End</em>}</li>
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
	public static final String copyright = "Copyright (c) 2003, 2004 IBM Corporation and others."; //$NON-NLS-1$

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
	protected EList end = null;

	/**
	 * The cached value of the '{@link #getDeployments() <em>Deployment</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeployments()
	 * @generated
	 * @ordered
	 */
	protected EList deployment = null;

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
	 * The flag for the '{@link #isDerived() <em>Is Derived</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDerived()
	 * @generated
	 * @ordered
	 */
	protected static final int IS_DERIVED_EFLAG = Integer.MIN_VALUE >>> 6;

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
	 * The flag for the '{@link #isDerivedUnion() <em>Is Derived Union</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDerivedUnion()
	 * @generated
	 * @ordered
	 */
	protected static final int IS_DERIVED_UNION_EFLAG = Integer.MIN_VALUE >>> 7;

	/**
	 * The cached value of the '{@link #getRedefinedProperties() <em>Redefined Property</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRedefinedProperties()
	 * @generated
	 * @ordered
	 */
	protected EList redefinedProperty = null;

	/**
	 * The cached value of the '{@link #getSubsettedProperties() <em>Subsetted Property</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubsettedProperties()
	 * @generated
	 * @ordered
	 */
	protected EList subsettedProperty = null;

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
	protected EList qualifier = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PropertyImpl() {
		super();
		eFlags &= ~IS_DERIVED_EFLAG;
		eFlags &= ~IS_DERIVED_UNION_EFLAG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return UML2Package.eINSTANCE.getProperty();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemplateParameter getTemplateParameter() {
		if (templateParameter != null && templateParameter.eIsProxy()) {
			TemplateParameter oldTemplateParameter = templateParameter;
			templateParameter = (TemplateParameter)eResolveProxy((InternalEObject)templateParameter);
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
		if (null != getOwningParameter() && newTemplateParameter != getOwningParameter()) {
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
		if (newTemplateParameter != templateParameter) {
			NotificationChain msgs = null;
			if (null != templateParameter) {
				msgs = ((InternalEObject) templateParameter).eInverseRemove(this, UML2Package.TEMPLATE_PARAMETER__PARAMETERED_ELEMENT, TemplateParameter.class, msgs);
			}
			if (null != newTemplateParameter) {
				msgs = ((InternalEObject) newTemplateParameter).eInverseAdd(this, UML2Package.TEMPLATE_PARAMETER__PARAMETERED_ELEMENT, TemplateParameter.class, msgs);
			}
			msgs = basicSetTemplateParameter(newTemplateParameter, msgs);
			if (null != msgs) {
				msgs.dispatch();
			}
		} else if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, UML2Package.PROPERTY__TEMPLATE_PARAMETER, newTemplateParameter, newTemplateParameter));
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemplateParameter getOwningParameter() {
		if (eContainerFeatureID != UML2Package.PROPERTY__OWNING_PARAMETER) {
			return null;
		}
		return (TemplateParameter) eContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwningParameter(TemplateParameter newOwningParameter) {
		EObject oldOwningParameter = eContainer;
		if (eContainer != newOwningParameter || (eContainerFeatureID != UML2Package.PROPERTY__OWNING_PARAMETER && null != newOwningParameter)) {
			if (EcoreUtil.isAncestor(this, newOwningParameter)) {
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString()); //$NON-NLS-1$
			}
			NotificationChain msgs = null;
			if (null != eContainer) {
				msgs = eBasicRemoveFromContainer(msgs);
			}
			if (null != newOwningParameter) {
				msgs = ((InternalEObject) newOwningParameter).eInverseAdd(this, UML2Package.TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT, TemplateParameter.class, msgs);
			}
			msgs = eBasicSetContainer((InternalEObject) newOwningParameter, UML2Package.PROPERTY__OWNING_PARAMETER, msgs);
			if (null != msgs) {
				msgs.dispatch();
			}
		} else if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, UML2Package.PROPERTY__OWNING_PARAMETER, newOwningParameter, newOwningParameter));
		}
		if (null != newOwningParameter || oldOwningParameter == templateParameter) {
			setTemplateParameter(newOwningParameter);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getEnds() {
		if (end == null) {
			end = new EObjectWithInverseResolvingEList(ConnectorEnd.class, this, UML2Package.PROPERTY__END, UML2Package.CONNECTOR_END__ROLE);
		}
		return end;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getDeployments() {
		if (deployment == null) {
			deployment = new SubsetEObjectContainmentWithInverseEList(Deployment.class, this, UML2Package.PROPERTY__DEPLOYMENT, new int[] {UML2Package.PROPERTY__CLIENT_DEPENDENCY}, UML2Package.DEPLOYMENT__LOCATION);
		}
		return deployment;

	}

    /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
     */
    public Deployment getDeployment(String unqualifiedName) {
    	for (Iterator i = getDeployments().iterator(); i.hasNext(); ) {
    		Deployment namedDeployment = (Deployment) i.next();
    		
    		if (unqualifiedName.equals(namedDeployment.getName())) {
    			return namedDeployment;
    		}
    	}
    	
    	return null;
    }
      
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
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
	public EList getDeployedElements() {

		EList deployedElements = (EList) getCacheAdapter().get(this,
			UML2Package.eINSTANCE.getDeploymentTarget_DeployedElement());

		if (null == deployedElements) {
			Set deployedElement = new HashSet();

			for (Iterator deployments = getDeployments().iterator(); deployments
				.hasNext();) {

				for (Iterator deployedArtifacts = ((Deployment) deployments
					.next()).getDeployedArtifacts().iterator(); deployedArtifacts
					.hasNext();) {

					DeployedArtifact deployedArtifact = (DeployedArtifact) deployedArtifacts
						.next();

					if (Artifact.class.isInstance(deployedArtifact)) {

						for (Iterator manifestations = ((Artifact) deployedArtifact)
							.getManifestations().iterator(); manifestations
							.hasNext();) {

							deployedElement.add(((Manifestation) manifestations
								.next()).getUtilizedElement());
						}
					}
				}
			}

			deployedElements = new EcoreEList.UnmodifiableEList(this,
				UML2Package.eINSTANCE.getDeploymentTarget_DeployedElement(),
				deployedElement.size(), deployedElement.toArray());
			getCacheAdapter().put(this,
				UML2Package.eINSTANCE.getDeploymentTarget_DeployedElement(),
				deployedElements);
		}

		return deployedElements;
	}

    /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
     */
    public PackageableElement getDeployedElement(String unqualifiedName) {
    	for (Iterator i = getDeployedElements().iterator(); i.hasNext(); ) {
    		PackageableElement namedDeployedElement = (PackageableElement) i.next();
    		
    		if (unqualifiedName.equals(namedDeployedElement.getName())) {
    			return namedDeployedElement;
    		}
    	}
    	
    	return null;
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
		return 0 != (eFlags & IS_DERIVED_EFLAG);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsDerived(boolean newIsDerived) {
		boolean oldIsDerived = 0 != (eFlags & IS_DERIVED_EFLAG);
		if (newIsDerived) {
			eFlags |= IS_DERIVED_EFLAG;
		} else {
			eFlags &= ~IS_DERIVED_EFLAG;
		}
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, UML2Package.PROPERTY__IS_DERIVED, oldIsDerived, newIsDerived));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isDerivedUnion() {
		return 0 != (eFlags & IS_DERIVED_UNION_EFLAG);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsDerivedUnion(boolean newIsDerivedUnion) {
		boolean oldIsDerivedUnion = 0 != (eFlags & IS_DERIVED_UNION_EFLAG);
		if (newIsDerivedUnion) {
			eFlags |= IS_DERIVED_UNION_EFLAG;
		} else {
			eFlags &= ~IS_DERIVED_UNION_EFLAG;
		}
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, UML2Package.PROPERTY__IS_DERIVED_UNION, oldIsDerivedUnion, newIsDerivedUnion));
		}
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
	 * @generated
	 */
	public org.eclipse.uml2.Class getClass_() {
		org.eclipse.uml2.Class class_ = basicGetClass_();
		return class_ == null ? null : (org.eclipse.uml2.Class)eResolveProxy((InternalEObject)class_);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public org.eclipse.uml2.Class basicGetClass_() {
		return org.eclipse.uml2.Class.class.isInstance(eContainer) ? (org.eclipse.uml2.Class) eContainer : null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property getOpposite() {
		Property opposite = basicGetOpposite();
		return opposite == null ? null : (Property)eResolveProxy((InternalEObject)opposite);
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
		if (eContainerFeatureID != UML2Package.PROPERTY__OWNING_ASSOCIATION) {
			return null;
		}
		return (Association) eContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwningAssociation(Association newOwningAssociation) {
		EObject oldOwningAssociation = eContainer;
		if (eContainer != newOwningAssociation || (eContainerFeatureID != UML2Package.PROPERTY__OWNING_ASSOCIATION && null != newOwningAssociation)) {
			if (EcoreUtil.isAncestor(this, newOwningAssociation)) {
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString()); //$NON-NLS-1$
			}
			NotificationChain msgs = null;
			if (null != eContainer) {
				msgs = eBasicRemoveFromContainer(msgs);
			}
			if (null != newOwningAssociation) {
				msgs = ((InternalEObject) newOwningAssociation).eInverseAdd(this, UML2Package.ASSOCIATION__OWNED_END, Association.class, msgs);
			}
			msgs = eBasicSetContainer((InternalEObject) newOwningAssociation, UML2Package.PROPERTY__OWNING_ASSOCIATION, msgs);
			if (null != msgs) {
				msgs.dispatch();
			}
		} else if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, UML2Package.PROPERTY__OWNING_ASSOCIATION, newOwningAssociation, newOwningAssociation));
		}
		if (null != newOwningAssociation || oldOwningAssociation == association) {
			setAssociation(newOwningAssociation);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getRedefinedProperties() {
		if (redefinedProperty == null) {
			redefinedProperty = new EObjectResolvingEList(Property.class, this, UML2Package.PROPERTY__REDEFINED_PROPERTY);
		}
		return redefinedProperty;
	}

    /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
     */
    public Property getRedefinedProperty(String unqualifiedName) {
    	for (Iterator i = getRedefinedProperties().iterator(); i.hasNext(); ) {
    		Property namedRedefinedProperty = (Property) i.next();
    		
    		if (unqualifiedName.equals(namedRedefinedProperty.getName())) {
    			return namedRedefinedProperty;
    		}
    	}
    	
    	return null;
    }
      
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getSubsettedProperties() {
		if (subsettedProperty == null) {
			subsettedProperty = new EObjectResolvingEList(Property.class, this, UML2Package.PROPERTY__SUBSETTED_PROPERTY);
		}
		return subsettedProperty;
	}

    /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
     */
    public Property getSubsettedProperty(String unqualifiedName) {
    	for (Iterator i = getSubsettedProperties().iterator(); i.hasNext(); ) {
    		Property namedSubsettedProperty = (Property) i.next();
    		
    		if (unqualifiedName.equals(namedSubsettedProperty.getName())) {
    			return namedSubsettedProperty;
    		}
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
		return (DataType)eContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDatatype(DataType newDatatype) {
		if (newDatatype != eContainer || (eContainerFeatureID != UML2Package.PROPERTY__DATATYPE && newDatatype != null)) {
			if (EcoreUtil.isAncestor(this, newDatatype))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString()); //$NON-NLS-1$
			NotificationChain msgs = null;
			if (eContainer != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newDatatype != null)
				msgs = ((InternalEObject)newDatatype).eInverseAdd(this, UML2Package.DATA_TYPE__OWNED_ATTRIBUTE, DataType.class, msgs);
			msgs = eBasicSetContainer((InternalEObject)newDatatype, UML2Package.PROPERTY__DATATYPE, msgs);
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
			Association oldAssociation = association;
			association = (Association)eResolveProxy((InternalEObject)association);
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
		if (null != getOwningAssociation() && newAssociation != getOwningAssociation()) {
			setOwningAssociation(null);
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
			if (null != association) {
				msgs = ((InternalEObject) association).eInverseRemove(this, UML2Package.ASSOCIATION__MEMBER_END, Association.class, msgs);
			}
			if (null != newAssociation) {
				msgs = ((InternalEObject) newAssociation).eInverseAdd(this, UML2Package.ASSOCIATION__MEMBER_END, Association.class, msgs);
			}
			msgs = basicSetAssociation(newAssociation, msgs);
			if (null != msgs) {
				msgs.dispatch();
			}
		} else if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, UML2Package.PROPERTY__ASSOCIATION, newAssociation, newAssociation));
		}

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
	 * @generated
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
		if (qualifier == null) {
			qualifier = new EObjectContainmentWithInverseEList(Property.class, this, UML2Package.PROPERTY__QUALIFIER, UML2Package.PROPERTY__ASSOCIATION_END);
		}
		return qualifier;
	}

    /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
     */
    public Property getQualifier(String unqualifiedName) {
    	for (Iterator i = getQualifiers().iterator(); i.hasNext(); ) {
    		Property namedQualifier = (Property) i.next();
    		
    		if (unqualifiedName.equals(namedQualifier.getName())) {
    			return namedQualifier;
    		}
    	}
    	
    	return null;
    }
      
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
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
	 * @generated
	 */
	public Property getAssociationEnd() {
		if (eContainerFeatureID != UML2Package.PROPERTY__ASSOCIATION_END) return null;
		return (Property)eContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAssociationEnd(Property newAssociationEnd) {
		if (newAssociationEnd != eContainer || (eContainerFeatureID != UML2Package.PROPERTY__ASSOCIATION_END && newAssociationEnd != null)) {
			if (EcoreUtil.isAncestor(this, newAssociationEnd))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString()); //$NON-NLS-1$
			NotificationChain msgs = null;
			if (eContainer != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newAssociationEnd != null)
				msgs = ((InternalEObject)newAssociationEnd).eInverseAdd(this, UML2Package.PROPERTY__QUALIFIER, Property.class, msgs);
			msgs = eBasicSetContainer((InternalEObject)newAssociationEnd, UML2Package.PROPERTY__ASSOCIATION_END, msgs);
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
		if (clientDependency == null) {
			clientDependency = new SupersetEObjectWithInverseResolvingEList.ManyInverse(Dependency.class, this, UML2Package.PROPERTY__CLIENT_DEPENDENCY, new int[] {UML2Package.PROPERTY__DEPLOYMENT}, UML2Package.DEPENDENCY__CLIENT);
		}
		return clientDependency;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOppositeIsOtherEnd(DiagnosticChain diagnostics, Map context) {
		return org.eclipse.uml2.internal.operation.PropertyOperations.validateOppositeIsOtherEnd(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property opposite() {
		return org.eclipse.uml2.internal.operation.PropertyOperations.opposite(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMultiplicityOfComposite(DiagnosticChain diagnostics, Map context) {
		return org.eclipse.uml2.internal.operation.PropertyOperations.validateMultiplicityOfComposite(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSubsettingContext(DiagnosticChain diagnostics, Map context) {
		return org.eclipse.uml2.internal.operation.PropertyOperations.validateSubsettingContext(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNavigablePropertyRedefinition(DiagnosticChain diagnostics, Map context) {
		return org.eclipse.uml2.internal.operation.PropertyOperations.validateNavigablePropertyRedefinition(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSubsettingRules(DiagnosticChain diagnostics, Map context) {
		return org.eclipse.uml2.internal.operation.PropertyOperations.validateSubsettingRules(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNavigableReadonly(DiagnosticChain diagnostics, Map context) {
		return org.eclipse.uml2.internal.operation.PropertyOperations.validateNavigableReadonly(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDerivedUnionIsDerived(DiagnosticChain diagnostics, Map context) {
		return org.eclipse.uml2.internal.operation.PropertyOperations.validateDerivedUnionIsDerived(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isConsistentWith(RedefinableElement redefinee) {
		return org.eclipse.uml2.internal.operation.PropertyOperations.isConsistentWith(this, redefinee);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Set subsettingContext() {
		try {
			java.lang.reflect.Method method = getClass().getMethod("subsettingContext", null); //$NON-NLS-1$
			Set result = (Set) getCacheAdapter().get(this, method);
		
			if (null == result) {
				result = java.util.Collections.unmodifiableSet(org.eclipse.uml2.internal.operation.PropertyOperations.subsettingContext(this));
				getCacheAdapter().put(this, method, result);
			}
		
			return result;
		} catch (Exception e) {
			return org.eclipse.uml2.internal.operation.PropertyOperations.subsettingContext(this);
		}
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
	public Namespace getNamespace() {
		if (null != getClass_()) {
			return (Namespace) getClass_();
		}
		if (null != getOwningAssociation()) {
			return (Namespace) getOwningAssociation();
		}
		if (null != getDatatype()) {
			return (Namespace) getDatatype();
		}
		return super.getNamespace();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getFeaturingClassifiers() {
		EList featuringClassifier = (EList) getCacheAdapter().get(this, UML2Package.eINSTANCE.getFeature_FeaturingClassifier());

		if (null == featuringClassifier) {
			Set union = new LinkedHashSet();
			union.addAll(super.getFeaturingClassifiers());
			if (null != getClass_()) {
				union.add(getClass_());
			}
			if (null != getOwningAssociation()) {
				union.add(getOwningAssociation());
			}
			if (null != getDatatype()) {
				union.add(getDatatype());
			}

			featuringClassifier = new EcoreEList.UnmodifiableEList(this, UML2Package.eINSTANCE.getFeature_FeaturingClassifier(), union.size(), union.toArray());
			getCacheAdapter().put(this, UML2Package.eINSTANCE.getFeature_FeaturingClassifier(), featuringClassifier);
		}

		return featuringClassifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getRedefinedElements() {
		EList result = (EList) getCacheAdapter().get(this, UML2Package.eINSTANCE.getProperty().getEAllOperations().get(66));

		if (null == result) {
			Set union = new LinkedHashSet();
			union.addAll(super.getRedefinedElements());
			union.addAll(getRedefinedProperties());

			result = new BasicEList.UnmodifiableEList(union.size(), union.toArray());
			getCacheAdapter().put(this, UML2Package.eINSTANCE.getProperty().getEAllOperations().get(66), result);
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
			if (null != getDefaultValue()) {
				union.add(getDefaultValue());
			}
			union.addAll(getQualifiers());
			union.addAll(getDeployments());

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
	public Element basicGetOwner() {
		if (null != getAssociationEnd()) {
			return (Element) getAssociationEnd();
		}
		if (null != getOwningParameter()) {
			return (Element) getOwningParameter();
		}
		return super.basicGetOwner();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, Class baseClass, NotificationChain msgs) {
		if (featureID >= 0) {
			switch (eDerivedStructuralFeatureID(featureID, baseClass)) {
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
					if (eContainer != null)
						msgs = eBasicRemoveFromContainer(msgs);
					return eBasicSetContainer(otherEnd, UML2Package.PROPERTY__OWNING_PARAMETER, msgs);
				case UML2Package.PROPERTY__END:
					return ((InternalEList)getEnds()).basicAdd(otherEnd, msgs);
				case UML2Package.PROPERTY__DEPLOYMENT:
					return ((InternalEList)getDeployments()).basicAdd(otherEnd, msgs);
				case UML2Package.PROPERTY__OWNING_ASSOCIATION:
					if (eContainer != null)
						msgs = eBasicRemoveFromContainer(msgs);
					return eBasicSetContainer(otherEnd, UML2Package.PROPERTY__OWNING_ASSOCIATION, msgs);
				case UML2Package.PROPERTY__DATATYPE:
					if (eContainer != null)
						msgs = eBasicRemoveFromContainer(msgs);
					return eBasicSetContainer(otherEnd, UML2Package.PROPERTY__DATATYPE, msgs);
				case UML2Package.PROPERTY__ASSOCIATION:
					if (association != null)
						msgs = ((InternalEObject)association).eInverseRemove(this, UML2Package.ASSOCIATION__MEMBER_END, Association.class, msgs);
					return basicSetAssociation((Association)otherEnd, msgs);
				case UML2Package.PROPERTY__QUALIFIER:
					return ((InternalEList)getQualifiers()).basicAdd(otherEnd, msgs);
				case UML2Package.PROPERTY__ASSOCIATION_END:
					if (eContainer != null)
						msgs = eBasicRemoveFromContainer(msgs);
					return eBasicSetContainer(otherEnd, UML2Package.PROPERTY__ASSOCIATION_END, msgs);
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
					return eBasicSetContainer(null, UML2Package.PROPERTY__OWNING_PARAMETER, msgs);
				case UML2Package.PROPERTY__END:
					return ((InternalEList)getEnds()).basicRemove(otherEnd, msgs);
				case UML2Package.PROPERTY__DEPLOYMENT:
					return ((InternalEList)getDeployments()).basicRemove(otherEnd, msgs);
				case UML2Package.PROPERTY__OWNING_ASSOCIATION:
					return eBasicSetContainer(null, UML2Package.PROPERTY__OWNING_ASSOCIATION, msgs);
				case UML2Package.PROPERTY__DATATYPE:
					return eBasicSetContainer(null, UML2Package.PROPERTY__DATATYPE, msgs);
				case UML2Package.PROPERTY__ASSOCIATION:
					return basicSetAssociation(null, msgs);
				case UML2Package.PROPERTY__DEFAULT_VALUE:
					return basicSetDefaultValue(null, msgs);
				case UML2Package.PROPERTY__QUALIFIER:
					return ((InternalEList)getQualifiers()).basicRemove(otherEnd, msgs);
				case UML2Package.PROPERTY__ASSOCIATION_END:
					return eBasicSetContainer(null, UML2Package.PROPERTY__ASSOCIATION_END, msgs);
				default:
					return eDynamicInverseRemove(otherEnd, featureID, baseClass, msgs);
			}
		}
		return eBasicSetContainer(null, featureID, msgs);
	}

	/**
	 * @see org.eclipse.emf.ecore.impl.EObjectImpl#eDynamicInverseRemove(org.eclipse.emf.ecore.InternalEObject, int, java.lang.Class, org.eclipse.emf.common.notify.NotificationChain)
	 */
	public NotificationChain eDynamicInverseRemove(InternalEObject otherEnd, int featureID, Class inverseClass, NotificationChain msgs) {
		switch (eDerivedStructuralFeatureID(featureID, inverseClass)) {
			case UML2Package.PROPERTY__CLASS_ :
				return eBasicSetContainer(null, UML2Package.PROPERTY__CLASS_, msgs);
			default :
				return super.eDynamicInverseRemove(otherEnd, featureID, inverseClass, msgs);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eBasicRemoveFromContainer(NotificationChain msgs) {
		if (eContainerFeatureID >= 0) {
			switch (eContainerFeatureID) {
				case UML2Package.PROPERTY__OWNING_PARAMETER:
					return eContainer.eInverseRemove(this, UML2Package.TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT, TemplateParameter.class, msgs);
				case UML2Package.PROPERTY__OWNING_ASSOCIATION:
					return eContainer.eInverseRemove(this, UML2Package.ASSOCIATION__OWNED_END, Association.class, msgs);
				case UML2Package.PROPERTY__DATATYPE:
					return eContainer.eInverseRemove(this, UML2Package.DATA_TYPE__OWNED_ATTRIBUTE, DataType.class, msgs);
				case UML2Package.PROPERTY__ASSOCIATION_END:
					return eContainer.eInverseRemove(this, UML2Package.PROPERTY__QUALIFIER, Property.class, msgs);
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
				if (resolve) return getClass_();
				return basicGetClass_();
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
		return eDynamicGet(eFeature, resolve);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eSet(EStructuralFeature eFeature, Object newValue) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
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
		eDynamicSet(eFeature, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eUnset(EStructuralFeature eFeature) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
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
		eDynamicUnset(eFeature);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean eIsSet(EStructuralFeature eFeature) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case UML2Package.PROPERTY__EANNOTATIONS:
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UML2Package.PROPERTY__OWNED_ELEMENT:
				return !getOwnedElements().isEmpty();
			case UML2Package.PROPERTY__OWNER:
				return basicGetOwner() != null;
			case UML2Package.PROPERTY__OWNED_COMMENT:
				return ownedComment != null && !ownedComment.isEmpty();
			case UML2Package.PROPERTY__TEMPLATE_BINDING:
				return templateBinding != null && !templateBinding.isEmpty();
			case UML2Package.PROPERTY__OWNED_TEMPLATE_SIGNATURE:
				return ownedTemplateSignature != null;
			case UML2Package.PROPERTY__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case UML2Package.PROPERTY__QUALIFIED_NAME:
				return QUALIFIED_NAME_EDEFAULT == null ? getQualifiedName() != null : !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case UML2Package.PROPERTY__VISIBILITY:
				return visibility != VISIBILITY_EDEFAULT;
			case UML2Package.PROPERTY__CLIENT_DEPENDENCY:
				return clientDependency != null && !clientDependency.isEmpty();
			case UML2Package.PROPERTY__NAME_EXPRESSION:
				return nameExpression != null;
			case UML2Package.PROPERTY__REDEFINITION_CONTEXT:
				return !getRedefinitionContexts().isEmpty();
			case UML2Package.PROPERTY__IS_LEAF:
				return isLeaf() != IS_LEAF_EDEFAULT;
			case UML2Package.PROPERTY__FEATURING_CLASSIFIER:
				return !getFeaturingClassifiers().isEmpty();
			case UML2Package.PROPERTY__IS_STATIC:
				return isStatic() != IS_STATIC_EDEFAULT;
			case UML2Package.PROPERTY__TYPE:
				return type != null;
			case UML2Package.PROPERTY__IS_ORDERED:
				return isOrdered() != IS_ORDERED_EDEFAULT;
			case UML2Package.PROPERTY__IS_UNIQUE:
				return isUnique() != IS_UNIQUE_EDEFAULT;
			case UML2Package.PROPERTY__LOWER:
				return getLower() != LOWER_EDEFAULT;
			case UML2Package.PROPERTY__UPPER:
				return getUpper() != UPPER_EDEFAULT;
			case UML2Package.PROPERTY__UPPER_VALUE:
				return upperValue != null;
			case UML2Package.PROPERTY__LOWER_VALUE:
				return lowerValue != null;
			case UML2Package.PROPERTY__IS_READ_ONLY:
				return isReadOnly() != IS_READ_ONLY_EDEFAULT;
			case UML2Package.PROPERTY__TEMPLATE_PARAMETER:
				return templateParameter != null;
			case UML2Package.PROPERTY__OWNING_PARAMETER:
				return getOwningParameter() != null;
			case UML2Package.PROPERTY__END:
				return end != null && !end.isEmpty();
			case UML2Package.PROPERTY__DEPLOYMENT:
				return deployment != null && !deployment.isEmpty();
			case UML2Package.PROPERTY__DEPLOYED_ELEMENT:
				return !getDeployedElements().isEmpty();
			case UML2Package.PROPERTY__DEFAULT:
				return DEFAULT_EDEFAULT == null ? getDefault() != null : !DEFAULT_EDEFAULT.equals(getDefault());
			case UML2Package.PROPERTY__IS_COMPOSITE:
				return isComposite() != IS_COMPOSITE_EDEFAULT;
			case UML2Package.PROPERTY__IS_DERIVED:
				return isDerived() != IS_DERIVED_EDEFAULT;
			case UML2Package.PROPERTY__CLASS_:
				return basicGetClass_() != null;
			case UML2Package.PROPERTY__OPPOSITE:
				return basicGetOpposite() != null;
			case UML2Package.PROPERTY__IS_DERIVED_UNION:
				return isDerivedUnion() != IS_DERIVED_UNION_EDEFAULT;
			case UML2Package.PROPERTY__OWNING_ASSOCIATION:
				return getOwningAssociation() != null;
			case UML2Package.PROPERTY__REDEFINED_PROPERTY:
				return redefinedProperty != null && !redefinedProperty.isEmpty();
			case UML2Package.PROPERTY__SUBSETTED_PROPERTY:
				return subsettedProperty != null && !subsettedProperty.isEmpty();
			case UML2Package.PROPERTY__DATATYPE:
				return getDatatype() != null;
			case UML2Package.PROPERTY__ASSOCIATION:
				return association != null;
			case UML2Package.PROPERTY__AGGREGATION:
				return aggregation != AGGREGATION_EDEFAULT;
			case UML2Package.PROPERTY__DEFAULT_VALUE:
				return defaultValue != null;
			case UML2Package.PROPERTY__QUALIFIER:
				return qualifier != null && !qualifier.isEmpty();
			case UML2Package.PROPERTY__ASSOCIATION_END:
				return getAssociationEnd() != null;
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
		result.append(" (aggregation: "); //$NON-NLS-1$
		result.append(aggregation);
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
	
	// <!-- end-custom-operations -->

} //PropertyImpl
