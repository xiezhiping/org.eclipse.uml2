/*
 * Copyright (c) 2003, 2004 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Common Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/cpl-v10.html
 *
 * Contributors:
 *   IBM - Initial API and implementation
 *
 * $Id: ClassifierImpl.java,v 1.17 2004/06/17 03:20:09 khussey Exp $
 */
package org.eclipse.uml2.impl;

import java.util.Collection;
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
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.uml2.AggregationKind;
import org.eclipse.uml2.Association;
import org.eclipse.uml2.Classifier;
import org.eclipse.uml2.CollaborationOccurrence;
import org.eclipse.uml2.Dependency;
import org.eclipse.uml2.Element;
import org.eclipse.uml2.Feature;
import org.eclipse.uml2.Generalization;
import org.eclipse.uml2.GeneralizationSet;
import org.eclipse.uml2.NamedElement;
import org.eclipse.uml2.Namespace;
import org.eclipse.uml2.PackageableElement;
import org.eclipse.uml2.ParameterableElement;
import org.eclipse.uml2.Property;
import org.eclipse.uml2.RedefinableElement;
import org.eclipse.uml2.StringExpression;
import org.eclipse.uml2.Substitution;
import org.eclipse.uml2.TemplateParameter;
import org.eclipse.uml2.TemplateSignature;
import org.eclipse.uml2.Type;
import org.eclipse.uml2.UML2Package;
import org.eclipse.uml2.UseCase;
import org.eclipse.uml2.VisibilityKind;
import org.eclipse.uml2.internal.operation.ClassifierOperations;
import org.eclipse.uml2.internal.operation.TypeOperations;
import org.eclipse.uml2.internal.util.SubsetEObjectContainmentWithInverseEList;
import org.eclipse.uml2.internal.util.SupersetEObjectContainmentEList;
import org.eclipse.uml2.internal.util.SupersetEObjectWithInverseResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Classifier</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2.impl.ClassifierImpl#getTemplateParameter <em>Template Parameter</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.ClassifierImpl#getOwningParameter <em>Owning Parameter</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.ClassifierImpl#getPackageableElement_visibility <em>Packageable Element visibility</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.ClassifierImpl#getPackage <em>Package</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.ClassifierImpl#getRedefinitionContexts <em>Redefinition Context</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.ClassifierImpl#isLeaf <em>Is Leaf</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.ClassifierImpl#getFeatures <em>Feature</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.ClassifierImpl#isAbstract <em>Is Abstract</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.ClassifierImpl#getInheritedMembers <em>Inherited Member</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.ClassifierImpl#getGenerals <em>General</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.ClassifierImpl#getGeneralizations <em>Generalization</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.ClassifierImpl#getAttributes <em>Attribute</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.ClassifierImpl#getRedefinedClassifiers <em>Redefined Classifier</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.ClassifierImpl#getSubstitutions <em>Substitution</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.ClassifierImpl#getPowertypeExtents <em>Powertype Extent</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.ClassifierImpl#getOwnedUseCases <em>Owned Use Case</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.ClassifierImpl#getUseCases <em>Use Case</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.ClassifierImpl#getRepresentation <em>Representation</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.ClassifierImpl#getOccurrences <em>Occurrence</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ClassifierImpl extends NamespaceImpl implements Classifier {
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
	 * The default value of the '{@link #getPackageableElement_visibility() <em>Packageable Element visibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPackageableElement_visibility()
	 * @generated
	 * @ordered
	 */
	protected static final VisibilityKind PACKAGEABLE_ELEMENT_VISIBILITY_EDEFAULT = VisibilityKind.PUBLIC_LITERAL;

	/**
	 * The cached value of the '{@link #getPackageableElement_visibility() <em>Packageable Element visibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPackageableElement_visibility()
	 * @generated
	 * @ordered
	 */
	protected VisibilityKind packageableElement_visibility = PACKAGEABLE_ELEMENT_VISIBILITY_EDEFAULT;

	/**
	 * The default value of the '{@link #isLeaf() <em>Is Leaf</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isLeaf()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_LEAF_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isLeaf() <em>Is Leaf</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isLeaf()
	 * @generated
	 * @ordered
	 */
	protected boolean isLeaf = IS_LEAF_EDEFAULT;

	/**
	 * The default value of the '{@link #isAbstract() <em>Is Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAbstract()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_ABSTRACT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAbstract() <em>Is Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAbstract()
	 * @generated
	 * @ordered
	 */
	protected boolean isAbstract = IS_ABSTRACT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getGeneralizations() <em>Generalization</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneralizations()
	 * @generated
	 * @ordered
	 */
	protected EList generalization = null;

	/**
	 * The cached value of the '{@link #getRedefinedClassifiers() <em>Redefined Classifier</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRedefinedClassifiers()
	 * @generated
	 * @ordered
	 */
	protected EList redefinedClassifier = null;

	/**
	 * The cached value of the '{@link #getSubstitutions() <em>Substitution</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubstitutions()
	 * @generated
	 * @ordered
	 */
	protected EList substitution = null;

	/**
	 * The cached value of the '{@link #getPowertypeExtents() <em>Powertype Extent</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPowertypeExtents()
	 * @generated
	 * @ordered
	 */
	protected EList powertypeExtent = null;

	/**
	 * The cached value of the '{@link #getOwnedUseCases() <em>Owned Use Case</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedUseCases()
	 * @generated
	 * @ordered
	 */
	protected EList ownedUseCase = null;

	/**
	 * The cached value of the '{@link #getUseCases() <em>Use Case</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUseCases()
	 * @generated
	 * @ordered
	 */
	protected EList useCase = null;

	/**
	 * The cached value of the '{@link #getRepresentation() <em>Representation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepresentation()
	 * @generated
	 * @ordered
	 */
	protected CollaborationOccurrence representation = null;

	/**
	 * The cached value of the '{@link #getOccurrences() <em>Occurrence</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOccurrences()
	 * @generated
	 * @ordered
	 */
	protected EList occurrence = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClassifierImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return UML2Package.eINSTANCE.getClassifier();
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UML2Package.CLASSIFIER__TEMPLATE_PARAMETER, oldTemplateParameter, templateParameter));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UML2Package.CLASSIFIER__TEMPLATE_PARAMETER, oldTemplateParameter, newTemplateParameter);
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
			eNotify(new ENotificationImpl(this, Notification.SET, UML2Package.CLASSIFIER__TEMPLATE_PARAMETER, newTemplateParameter, newTemplateParameter));
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemplateParameter getOwningParameter() {
		if (eContainerFeatureID != UML2Package.CLASSIFIER__OWNING_PARAMETER) {
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
		if (eContainer != newOwningParameter || (eContainerFeatureID != UML2Package.CLASSIFIER__OWNING_PARAMETER && null != newOwningParameter)) {
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
			msgs = eBasicSetContainer((InternalEObject) newOwningParameter, UML2Package.CLASSIFIER__OWNING_PARAMETER, msgs);
			if (null != msgs) {
				msgs.dispatch();
			}
		} else if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, UML2Package.CLASSIFIER__OWNING_PARAMETER, newOwningParameter, newOwningParameter));
		}
		if (null != newOwningParameter || oldOwningParameter == basicGetTemplateParameter()) {
			setTemplateParameter(newOwningParameter);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VisibilityKind getPackageableElement_visibility() {
		return packageableElement_visibility;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPackageableElement_visibility(VisibilityKind newPackageableElement_visibility) {
		VisibilityKind oldPackageableElement_visibility = packageableElement_visibility;
		packageableElement_visibility = null == newPackageableElement_visibility ? PACKAGEABLE_ELEMENT_VISIBILITY_EDEFAULT : newPackageableElement_visibility;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, UML2Package.CLASSIFIER__PACKAGEABLE_ELEMENT_VISIBILITY, oldPackageableElement_visibility, packageableElement_visibility));
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.uml2.Package getPackage() {
		org.eclipse.uml2.Package package_ = basicGetPackage();
		return package_ == null ? null : (org.eclipse.uml2.Package)eResolveProxy((InternalEObject)package_);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public org.eclipse.uml2.Package basicGetPackage() {
		return org.eclipse.uml2.Package.class.isInstance(eContainer) ? (org.eclipse.uml2.Package) eContainer : null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPackage(org.eclipse.uml2.Package newPackage, NotificationChain msgs) {
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isLeaf() {
		return isLeaf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsLeaf(boolean newIsLeaf) {
		boolean oldIsLeaf = isLeaf;
		isLeaf = newIsLeaf;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2Package.CLASSIFIER__IS_LEAF, oldIsLeaf, isLeaf));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getRedefinitionContextsGen() {
		EList redefinitionContext = (EList) getCacheAdapter().get(this, UML2Package.eINSTANCE.getRedefinableElement_RedefinitionContext());

		if (null == redefinitionContext) {
			Set union = new LinkedHashSet();

			redefinitionContext = new EcoreEList.UnmodifiableEList(this, UML2Package.eINSTANCE.getRedefinableElement_RedefinitionContext(), union.size(), union.toArray());
			getCacheAdapter().put(this, UML2Package.eINSTANCE.getRedefinableElement_RedefinitionContext(), redefinitionContext);
		}

		return redefinitionContext;
	}

	public EList getRedefinitionContexts() {
		EList redefinitionContext = (EList) getCacheAdapter().get(this, UML2Package.eINSTANCE.getRedefinableElement_RedefinitionContext());

		if (null == redefinitionContext) {
			Set union = new LinkedHashSet();

			if (Classifier.class.isInstance(eContainer)) {
				union.add(eContainer);
			}

			redefinitionContext = new EcoreEList.UnmodifiableEList(this, UML2Package.eINSTANCE.getRedefinableElement_RedefinitionContext(), union.size(), union.toArray());
			getCacheAdapter().put(this, UML2Package.eINSTANCE.getRedefinableElement_RedefinitionContext(), redefinitionContext);
		}

		return redefinitionContext;
	}

    /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
     */
    public Classifier getRedefinitionContext(String unqualifiedName) {
    	for (Iterator i = getRedefinitionContexts().iterator(); i.hasNext(); ) {
    		Classifier namedRedefinitionContext = (Classifier) i.next();
    		
    		if (unqualifiedName.equals(namedRedefinitionContext.getName())) {
    			return namedRedefinitionContext;
    		}
    	}
    	
    	return null;
    }
      
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAbstract() {
		return isAbstract;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsAbstract(boolean newIsAbstract) {
		boolean oldIsAbstract = isAbstract;
		isAbstract = newIsAbstract;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, UML2Package.CLASSIFIER__IS_ABSTRACT, oldIsAbstract, isAbstract));
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getFeatures() {
		EList feature = (EList) getCacheAdapter().get(this, UML2Package.eINSTANCE.getClassifier_Feature());

		if (null == feature) {
			Set union = new LinkedHashSet();
			union.addAll(getAttributes());

			feature = new EcoreEList.UnmodifiableEList(this, UML2Package.eINSTANCE.getClassifier_Feature(), union.size(), union.toArray());
			getCacheAdapter().put(this, UML2Package.eINSTANCE.getClassifier_Feature(), feature);
		}

		return feature;
	}

    /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
     */
    public Feature getFeature(String unqualifiedName) {
    	for (Iterator i = getFeatures().iterator(); i.hasNext(); ) {
    		Feature namedFeature = (Feature) i.next();
    		
    		if (unqualifiedName.equals(namedFeature.getName())) {
    			return namedFeature;
    		}
    	}
    	
    	return null;
    }
      
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList getInheritedMembers() {
		EList inheritedMembers = (EList) getCacheAdapter().get(this,
			UML2Package.eINSTANCE.getClassifier_InheritedMember());

		if (null == inheritedMembers) {
			Set inheritedMember = inheritedMember();

			inheritedMembers = new EcoreEList.UnmodifiableEList(this,
				UML2Package.eINSTANCE.getClassifier_InheritedMember(),
				inheritedMember.size(), inheritedMember.toArray());
			getCacheAdapter().put(this,
				UML2Package.eINSTANCE.getClassifier_InheritedMember(),
				inheritedMembers);
		}

		return inheritedMembers;
	}

    /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
     */
    public NamedElement getInheritedMember(String unqualifiedName) {
    	for (Iterator i = getInheritedMembers().iterator(); i.hasNext(); ) {
    		NamedElement namedInheritedMember = (NamedElement) i.next();
    		
    		if (unqualifiedName.equals(namedInheritedMember.getName())) {
    			return namedInheritedMember;
    		}
    	}
    	
    	return null;
    }
      
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList getGenerals() {
		EList generals = (EList) getCacheAdapter().get(eResource(), this,
			UML2Package.eINSTANCE.getClassifier_General());

		if (null == generals) {
			Set general = general();

			generals = new EcoreEList.UnmodifiableEList(this,
				UML2Package.eINSTANCE.getClassifier_General(), general.size(),
				general.toArray());
			getCacheAdapter().put(eResource(), this,
				UML2Package.eINSTANCE.getClassifier_General(), generals);
		}

		return generals;
	}

    /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
     */
    public Classifier getGeneral(String unqualifiedName) {
    	for (Iterator i = getGenerals().iterator(); i.hasNext(); ) {
    		Classifier namedGeneral = (Classifier) i.next();
    		
    		if (unqualifiedName.equals(namedGeneral.getName())) {
    			return namedGeneral;
    		}
    	}
    	
    	return null;
    }
      
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getGeneralizations() {
		if (generalization == null) {
			generalization = new EObjectContainmentWithInverseEList(Generalization.class, this, UML2Package.CLASSIFIER__GENERALIZATION, UML2Package.GENERALIZATION__SPECIFIC);
		}
		return generalization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Generalization createGeneralization(EClass eClass) {
		Generalization newGeneralization = (Generalization) eClass.getEPackage().getEFactoryInstance().create(eClass);
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, 0, UML2Package.CLASSIFIER__GENERALIZATION, null, newGeneralization));
		}
		getGeneralizations().add(newGeneralization);
		return newGeneralization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getAttributes() {
		EList attribute = (EList) getCacheAdapter().get(this, UML2Package.eINSTANCE.getClassifier_Attribute());

		if (null == attribute) {
			Set union = new LinkedHashSet();

			attribute = new EcoreEList.UnmodifiableEList(this, UML2Package.eINSTANCE.getClassifier_Attribute(), union.size(), union.toArray());
			getCacheAdapter().put(this, UML2Package.eINSTANCE.getClassifier_Attribute(), attribute);
		}

		return attribute;
	}

    /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
     */
    public Property getAttribute(String unqualifiedName) {
    	for (Iterator i = getAttributes().iterator(); i.hasNext(); ) {
    		Property namedAttribute = (Property) i.next();
    		
    		if (unqualifiedName.equals(namedAttribute.getName())) {
    			return namedAttribute;
    		}
    	}
    	
    	return null;
    }
      
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getRedefinedClassifiers() {
		if (redefinedClassifier == null) {
			redefinedClassifier = new EObjectResolvingEList(Classifier.class, this, UML2Package.CLASSIFIER__REDEFINED_CLASSIFIER);
		}
		return redefinedClassifier;
	}

    /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
     */
    public Classifier getRedefinedClassifier(String unqualifiedName) {
    	for (Iterator i = getRedefinedClassifiers().iterator(); i.hasNext(); ) {
    		Classifier namedRedefinedClassifier = (Classifier) i.next();
    		
    		if (unqualifiedName.equals(namedRedefinedClassifier.getName())) {
    			return namedRedefinedClassifier;
    		}
    	}
    	
    	return null;
    }
      
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getSubstitutions() {
		if (substitution == null) {
			substitution = new SubsetEObjectContainmentWithInverseEList(Substitution.class, this, UML2Package.CLASSIFIER__SUBSTITUTION, new int[] {UML2Package.CLASSIFIER__CLIENT_DEPENDENCY}, UML2Package.SUBSTITUTION__SUBSTITUTING_CLASSIFIER);
		}
		return substitution;

	}

    /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
     */
    public Substitution getSubstitution(String unqualifiedName) {
    	for (Iterator i = getSubstitutions().iterator(); i.hasNext(); ) {
    		Substitution namedSubstitution = (Substitution) i.next();
    		
    		if (unqualifiedName.equals(namedSubstitution.getName())) {
    			return namedSubstitution;
    		}
    	}
    	
    	return null;
    }
      
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Substitution createSubstitution(EClass eClass) {
		Substitution newSubstitution = (Substitution) eClass.getEPackage().getEFactoryInstance().create(eClass);
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, 0, UML2Package.CLASSIFIER__SUBSTITUTION, null, newSubstitution));
		}
		getSubstitutions().add(newSubstitution);
		return newSubstitution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getPowertypeExtents() {
		if (powertypeExtent == null) {
			powertypeExtent = new EObjectWithInverseResolvingEList(GeneralizationSet.class, this, UML2Package.CLASSIFIER__POWERTYPE_EXTENT, UML2Package.GENERALIZATION_SET__POWERTYPE);
		}
		return powertypeExtent;
	}

    /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
     */
    public GeneralizationSet getPowertypeExtent(String unqualifiedName) {
    	for (Iterator i = getPowertypeExtents().iterator(); i.hasNext(); ) {
    		GeneralizationSet namedPowertypeExtent = (GeneralizationSet) i.next();
    		
    		if (unqualifiedName.equals(namedPowertypeExtent.getName())) {
    			return namedPowertypeExtent;
    		}
    	}
    	
    	return null;
    }
      
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getOwnedUseCases() {
		if (ownedUseCase == null) {
			ownedUseCase = new EObjectContainmentEList(UseCase.class, this, UML2Package.CLASSIFIER__OWNED_USE_CASE);
		}
		return ownedUseCase;
	}

    /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
     */
    public UseCase getOwnedUseCase(String unqualifiedName) {
    	for (Iterator i = getOwnedUseCases().iterator(); i.hasNext(); ) {
    		UseCase namedOwnedUseCase = (UseCase) i.next();
    		
    		if (unqualifiedName.equals(namedOwnedUseCase.getName())) {
    			return namedOwnedUseCase;
    		}
    	}
    	
    	return null;
    }
      
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UseCase createOwnedUseCase(EClass eClass) {
		UseCase newOwnedUseCase = (UseCase) eClass.getEPackage().getEFactoryInstance().create(eClass);
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, 0, UML2Package.CLASSIFIER__OWNED_USE_CASE, null, newOwnedUseCase));
		}
		getOwnedUseCases().add(newOwnedUseCase);
		return newOwnedUseCase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getUseCases() {
		if (useCase == null) {
			useCase = new EObjectWithInverseResolvingEList.ManyInverse(UseCase.class, this, UML2Package.CLASSIFIER__USE_CASE, UML2Package.USE_CASE__SUBJECT);
		}
		return useCase;
	}

    /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
     */
    public UseCase getUseCase(String unqualifiedName) {
    	for (Iterator i = getUseCases().iterator(); i.hasNext(); ) {
    		UseCase namedUseCase = (UseCase) i.next();
    		
    		if (unqualifiedName.equals(namedUseCase.getName())) {
    			return namedUseCase;
    		}
    	}
    	
    	return null;
    }
      
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CollaborationOccurrence getRepresentation() {
		return representation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRepresentation(CollaborationOccurrence newRepresentation) {
		if (null != newRepresentation && !getOccurrences().contains(newRepresentation)) {
			getOccurrences().add(newRepresentation);
		}
		CollaborationOccurrence oldRepresentation = representation;
		representation = newRepresentation;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, UML2Package.CLASSIFIER__REPRESENTATION, oldRepresentation, representation));
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getOccurrences() {
		if (occurrence == null) {
			occurrence = new SupersetEObjectContainmentEList(CollaborationOccurrence.class, this, UML2Package.CLASSIFIER__OCCURRENCE, new int[] {UML2Package.CLASSIFIER__REPRESENTATION});
		}
		return occurrence;

	}

    /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
     */
    public CollaborationOccurrence getOccurrence(String unqualifiedName) {
    	for (Iterator i = getOccurrences().iterator(); i.hasNext(); ) {
    		CollaborationOccurrence namedOccurrence = (CollaborationOccurrence) i.next();
    		
    		if (unqualifiedName.equals(namedOccurrence.getName())) {
    			return namedOccurrence;
    		}
    	}
    	
    	return null;
    }
      
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CollaborationOccurrence createOccurrence(EClass eClass) {
		CollaborationOccurrence newOccurrence = (CollaborationOccurrence) eClass.getEPackage().getEFactoryInstance().create(eClass);
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, 0, UML2Package.CLASSIFIER__OCCURRENCE, null, newOccurrence));
		}
		getOccurrences().add(newOccurrence);
		return newOccurrence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Element basicGetOwner() {
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
	public VisibilityKind getVisibility() {
		return getPackageableElement_visibility();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVisibility(VisibilityKind newVisibility) {
		setPackageableElement_visibility(newVisibility);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean conformsToGen(Type other) {
		return org.eclipse.uml2.internal.operation.TypeOperations.conformsTo(this, other);
	}

	public boolean conformsTo(Type other) {
		return Classifier.class.isInstance(other)
			? conformsTo((Classifier) other) : conformsToGen(other);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Namespace getNamespace() {
		if (null != getPackage()) {
			return (Namespace) getPackage();
		}
		return super.getNamespace();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRedefinitionContextValid(DiagnosticChain diagnostics, Map context) {
		return org.eclipse.uml2.internal.operation.RedefinableElementOperations.validateRedefinitionContextValid(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRedefinitionConsistent(DiagnosticChain diagnostics, Map context) {
		return org.eclipse.uml2.internal.operation.RedefinableElementOperations.validateRedefinitionConsistent(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isConsistentWith(RedefinableElement redefinee) {
		return org.eclipse.uml2.internal.operation.RedefinableElementOperations.isConsistentWith(this, redefinee);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isRedefinitionContextValid(RedefinableElement redefinable) {
		return org.eclipse.uml2.internal.operation.RedefinableElementOperations.isRedefinitionContextValid(this, redefinable);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Set allFeatures() {
		try {
			java.lang.reflect.Method method = getClass().getMethod("allFeatures", null); //$NON-NLS-1$
			Set result = (Set) getCacheAdapter().get(this, method);
		
			if (null == result) {
				result = java.util.Collections.unmodifiableSet(org.eclipse.uml2.internal.operation.ClassifierOperations.allFeatures(this));
				getCacheAdapter().put(this, method, result);
			}
		
			return result;
		} catch (Exception e) {
			return org.eclipse.uml2.internal.operation.ClassifierOperations.allFeatures(this);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNoCyclesInGeneralization(DiagnosticChain diagnostics, Map context) {
		return org.eclipse.uml2.internal.operation.ClassifierOperations.validateNoCyclesInGeneralization(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSpecializeType(DiagnosticChain diagnostics, Map context) {
		return org.eclipse.uml2.internal.operation.ClassifierOperations.validateSpecializeType(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInheritedMember(DiagnosticChain diagnostics, Map context) {
		return org.eclipse.uml2.internal.operation.ClassifierOperations.validateInheritedMember(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Set inheritedMember() {
		try {
			java.lang.reflect.Method method = getClass().getMethod("inheritedMember", null); //$NON-NLS-1$
			Set result = (Set) getCacheAdapter().get(this, method);
		
			if (null == result) {
				result = java.util.Collections.unmodifiableSet(org.eclipse.uml2.internal.operation.ClassifierOperations.inheritedMember(this));
				getCacheAdapter().put(this, method, result);
			}
		
			return result;
		} catch (Exception e) {
			return org.eclipse.uml2.internal.operation.ClassifierOperations.inheritedMember(this);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Set parents() {
		try {
			java.lang.reflect.Method method = getClass().getMethod("parents", null); //$NON-NLS-1$
			Set result = (Set) getCacheAdapter().get(this, method);
		
			if (null == result) {
				result = java.util.Collections.unmodifiableSet(org.eclipse.uml2.internal.operation.ClassifierOperations.parents(this));
				getCacheAdapter().put(this, method, result);
			}
		
			return result;
		} catch (Exception e) {
			return org.eclipse.uml2.internal.operation.ClassifierOperations.parents(this);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Set allParents() {
		try {
			java.lang.reflect.Method method = getClass().getMethod("allParents", null); //$NON-NLS-1$
			Set result = (Set) getCacheAdapter().get(this, method);
		
			if (null == result) {
				result = java.util.Collections.unmodifiableSet(org.eclipse.uml2.internal.operation.ClassifierOperations.allParents(this));
				getCacheAdapter().put(this, method, result);
			}
		
			return result;
		} catch (Exception e) {
			return org.eclipse.uml2.internal.operation.ClassifierOperations.allParents(this);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Set inheritableMembers(Classifier c) {
		return org.eclipse.uml2.internal.operation.ClassifierOperations.inheritableMembers(this, c);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean hasVisibilityOf(NamedElement n) {
		return org.eclipse.uml2.internal.operation.ClassifierOperations.hasVisibilityOf(this, n);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Set inherit(Set inhs) {
		return org.eclipse.uml2.internal.operation.ClassifierOperations.inherit(this, inhs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean maySpecializeType(Classifier c) {
		return org.eclipse.uml2.internal.operation.ClassifierOperations.maySpecializeType(this, c);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Set general() {
		try {
			java.lang.reflect.Method method = getClass().getMethod("general", null); //$NON-NLS-1$
			Set result = (Set) getCacheAdapter().get(this, method);
		
			if (null == result) {
				result = java.util.Collections.unmodifiableSet(org.eclipse.uml2.internal.operation.ClassifierOperations.general(this));
				getCacheAdapter().put(this, method, result);
			}
		
			return result;
		} catch (Exception e) {
			return org.eclipse.uml2.internal.operation.ClassifierOperations.general(this);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralEqualsParents(DiagnosticChain diagnostics, Map context) {
		return org.eclipse.uml2.internal.operation.ClassifierOperations.validateGeneralEqualsParents(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean conformsTo(Classifier other) {
		return org.eclipse.uml2.internal.operation.ClassifierOperations.conformsTo(this, other);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getMembers() {
		EList member = (EList) getCacheAdapter().get(this, UML2Package.eINSTANCE.getNamespace_Member());

		if (null == member) {
			Set union = new LinkedHashSet();
			union.addAll(super.getMembers());
			union.addAll(getFeatures());
			union.addAll(getInheritedMembers());

			member = new EcoreEList.UnmodifiableEList(this, UML2Package.eINSTANCE.getNamespace_Member(), union.size(), union.toArray());
			getCacheAdapter().put(this, UML2Package.eINSTANCE.getNamespace_Member(), member);
		}

		return member;
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
			union.addAll(getGeneralizations());
			union.addAll(getSubstitutions());
			union.addAll(getOccurrences());

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
	public EList getRedefinedElements() {
		EList result = (EList) getCacheAdapter().get(this, UML2Package.eINSTANCE.getClassifier().getEAllOperations().get(66));

		if (null == result) {
			Set union = new LinkedHashSet();
			union.addAll(getRedefinedClassifiers());

			result = new BasicEList.UnmodifiableEList(union.size(), union.toArray());
			getCacheAdapter().put(this, UML2Package.eINSTANCE.getClassifier().getEAllOperations().get(66), result);
		}

		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getClientDependencies() {
		if (clientDependency == null) {
			clientDependency = new SupersetEObjectWithInverseResolvingEList.ManyInverse(Dependency.class, this, UML2Package.CLASSIFIER__CLIENT_DEPENDENCY, new int[] {UML2Package.CLASSIFIER__SUBSTITUTION}, UML2Package.DEPENDENCY__CLIENT);
		}
		return clientDependency;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getOwnedMembers() {
		EList result = (EList) getCacheAdapter().get(this, UML2Package.eINSTANCE.getClassifier().getEAllOperations().get(68));

		if (null == result) {
			Set union = new LinkedHashSet();
			union.addAll(super.getOwnedMembers());
			union.addAll(getOwnedUseCases());

			result = new BasicEList.UnmodifiableEList(union.size(), union.toArray());
			getCacheAdapter().put(this, UML2Package.eINSTANCE.getClassifier().getEAllOperations().get(68), result);
		}

		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, Class baseClass, NotificationChain msgs) {
		if (featureID >= 0) {
			switch (eDerivedStructuralFeatureID(featureID, baseClass)) {
				case UML2Package.CLASSIFIER__EANNOTATIONS:
					return ((InternalEList)getEAnnotations()).basicAdd(otherEnd, msgs);
				case UML2Package.CLASSIFIER__TEMPLATE_BINDING:
					return ((InternalEList)getTemplateBindings()).basicAdd(otherEnd, msgs);
				case UML2Package.CLASSIFIER__OWNED_TEMPLATE_SIGNATURE:
					if (ownedTemplateSignature != null)
						msgs = ((InternalEObject)ownedTemplateSignature).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UML2Package.CLASSIFIER__OWNED_TEMPLATE_SIGNATURE, null, msgs);
					return basicSetOwnedTemplateSignature((TemplateSignature)otherEnd, msgs);
				case UML2Package.CLASSIFIER__CLIENT_DEPENDENCY:
					return ((InternalEList)getClientDependencies()).basicAdd(otherEnd, msgs);
				case UML2Package.CLASSIFIER__OWNED_RULE:
					return ((InternalEList)getOwnedRules()).basicAdd(otherEnd, msgs);
				case UML2Package.CLASSIFIER__ELEMENT_IMPORT:
					return ((InternalEList)getElementImports()).basicAdd(otherEnd, msgs);
				case UML2Package.CLASSIFIER__PACKAGE_IMPORT:
					return ((InternalEList)getPackageImports()).basicAdd(otherEnd, msgs);
				case UML2Package.CLASSIFIER__TEMPLATE_PARAMETER:
					if (templateParameter != null)
						msgs = ((InternalEObject)templateParameter).eInverseRemove(this, UML2Package.TEMPLATE_PARAMETER__PARAMETERED_ELEMENT, TemplateParameter.class, msgs);
					return basicSetTemplateParameter((TemplateParameter)otherEnd, msgs);
				case UML2Package.CLASSIFIER__OWNING_PARAMETER:
					if (eContainer != null)
						msgs = eBasicRemoveFromContainer(msgs);
					return eBasicSetContainer(otherEnd, UML2Package.CLASSIFIER__OWNING_PARAMETER, msgs);
				case UML2Package.CLASSIFIER__GENERALIZATION:
					return ((InternalEList)getGeneralizations()).basicAdd(otherEnd, msgs);
				case UML2Package.CLASSIFIER__SUBSTITUTION:
					return ((InternalEList)getSubstitutions()).basicAdd(otherEnd, msgs);
				case UML2Package.CLASSIFIER__POWERTYPE_EXTENT:
					return ((InternalEList)getPowertypeExtents()).basicAdd(otherEnd, msgs);
				case UML2Package.CLASSIFIER__USE_CASE:
					return ((InternalEList)getUseCases()).basicAdd(otherEnd, msgs);
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
				case UML2Package.CLASSIFIER__EANNOTATIONS:
					return ((InternalEList)getEAnnotations()).basicRemove(otherEnd, msgs);
				case UML2Package.CLASSIFIER__OWNED_COMMENT:
					return ((InternalEList)getOwnedComments()).basicRemove(otherEnd, msgs);
				case UML2Package.CLASSIFIER__TEMPLATE_BINDING:
					return ((InternalEList)getTemplateBindings()).basicRemove(otherEnd, msgs);
				case UML2Package.CLASSIFIER__OWNED_TEMPLATE_SIGNATURE:
					return basicSetOwnedTemplateSignature(null, msgs);
				case UML2Package.CLASSIFIER__CLIENT_DEPENDENCY:
					return ((InternalEList)getClientDependencies()).basicRemove(otherEnd, msgs);
				case UML2Package.CLASSIFIER__NAME_EXPRESSION:
					return basicSetNameExpression(null, msgs);
				case UML2Package.CLASSIFIER__OWNED_RULE:
					return ((InternalEList)getOwnedRules()).basicRemove(otherEnd, msgs);
				case UML2Package.CLASSIFIER__ELEMENT_IMPORT:
					return ((InternalEList)getElementImports()).basicRemove(otherEnd, msgs);
				case UML2Package.CLASSIFIER__PACKAGE_IMPORT:
					return ((InternalEList)getPackageImports()).basicRemove(otherEnd, msgs);
				case UML2Package.CLASSIFIER__TEMPLATE_PARAMETER:
					return basicSetTemplateParameter(null, msgs);
				case UML2Package.CLASSIFIER__OWNING_PARAMETER:
					return eBasicSetContainer(null, UML2Package.CLASSIFIER__OWNING_PARAMETER, msgs);
				case UML2Package.CLASSIFIER__GENERALIZATION:
					return ((InternalEList)getGeneralizations()).basicRemove(otherEnd, msgs);
				case UML2Package.CLASSIFIER__SUBSTITUTION:
					return ((InternalEList)getSubstitutions()).basicRemove(otherEnd, msgs);
				case UML2Package.CLASSIFIER__POWERTYPE_EXTENT:
					return ((InternalEList)getPowertypeExtents()).basicRemove(otherEnd, msgs);
				case UML2Package.CLASSIFIER__OWNED_USE_CASE:
					return ((InternalEList)getOwnedUseCases()).basicRemove(otherEnd, msgs);
				case UML2Package.CLASSIFIER__USE_CASE:
					return ((InternalEList)getUseCases()).basicRemove(otherEnd, msgs);
				case UML2Package.CLASSIFIER__OCCURRENCE:
					return ((InternalEList)getOccurrences()).basicRemove(otherEnd, msgs);
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
				case UML2Package.CLASSIFIER__OWNING_PARAMETER:
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
			case UML2Package.CLASSIFIER__EANNOTATIONS:
				return getEAnnotations();
			case UML2Package.CLASSIFIER__OWNED_ELEMENT:
				return getOwnedElements();
			case UML2Package.CLASSIFIER__OWNER:
				if (resolve) return getOwner();
				return basicGetOwner();
			case UML2Package.CLASSIFIER__OWNED_COMMENT:
				return getOwnedComments();
			case UML2Package.CLASSIFIER__TEMPLATE_BINDING:
				return getTemplateBindings();
			case UML2Package.CLASSIFIER__OWNED_TEMPLATE_SIGNATURE:
				return getOwnedTemplateSignature();
			case UML2Package.CLASSIFIER__NAME:
				return getName();
			case UML2Package.CLASSIFIER__QUALIFIED_NAME:
				return getQualifiedName();
			case UML2Package.CLASSIFIER__VISIBILITY:
				return getVisibility();
			case UML2Package.CLASSIFIER__CLIENT_DEPENDENCY:
				return getClientDependencies();
			case UML2Package.CLASSIFIER__NAME_EXPRESSION:
				return getNameExpression();
			case UML2Package.CLASSIFIER__MEMBER:
				return getMembers();
			case UML2Package.CLASSIFIER__OWNED_RULE:
				return getOwnedRules();
			case UML2Package.CLASSIFIER__IMPORTED_MEMBER:
				return getImportedMembers();
			case UML2Package.CLASSIFIER__ELEMENT_IMPORT:
				return getElementImports();
			case UML2Package.CLASSIFIER__PACKAGE_IMPORT:
				return getPackageImports();
			case UML2Package.CLASSIFIER__TEMPLATE_PARAMETER:
				if (resolve) return getTemplateParameter();
				return basicGetTemplateParameter();
			case UML2Package.CLASSIFIER__OWNING_PARAMETER:
				return getOwningParameter();
			case UML2Package.CLASSIFIER__PACKAGEABLE_ELEMENT_VISIBILITY:
				return getPackageableElement_visibility();
			case UML2Package.CLASSIFIER__PACKAGE:
				if (resolve) return getPackage();
				return basicGetPackage();
			case UML2Package.CLASSIFIER__REDEFINITION_CONTEXT:
				return getRedefinitionContexts();
			case UML2Package.CLASSIFIER__IS_LEAF:
				return isLeaf() ? Boolean.TRUE : Boolean.FALSE;
			case UML2Package.CLASSIFIER__FEATURE:
				return getFeatures();
			case UML2Package.CLASSIFIER__IS_ABSTRACT:
				return isAbstract() ? Boolean.TRUE : Boolean.FALSE;
			case UML2Package.CLASSIFIER__INHERITED_MEMBER:
				return getInheritedMembers();
			case UML2Package.CLASSIFIER__GENERAL:
				return getGenerals();
			case UML2Package.CLASSIFIER__GENERALIZATION:
				return getGeneralizations();
			case UML2Package.CLASSIFIER__ATTRIBUTE:
				return getAttributes();
			case UML2Package.CLASSIFIER__REDEFINED_CLASSIFIER:
				return getRedefinedClassifiers();
			case UML2Package.CLASSIFIER__SUBSTITUTION:
				return getSubstitutions();
			case UML2Package.CLASSIFIER__POWERTYPE_EXTENT:
				return getPowertypeExtents();
			case UML2Package.CLASSIFIER__OWNED_USE_CASE:
				return getOwnedUseCases();
			case UML2Package.CLASSIFIER__USE_CASE:
				return getUseCases();
			case UML2Package.CLASSIFIER__REPRESENTATION:
				return getRepresentation();
			case UML2Package.CLASSIFIER__OCCURRENCE:
				return getOccurrences();
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
			case UML2Package.CLASSIFIER__EANNOTATIONS:
				getEAnnotations().clear();
				getEAnnotations().addAll((Collection)newValue);
				return;
			case UML2Package.CLASSIFIER__OWNED_COMMENT:
				getOwnedComments().clear();
				getOwnedComments().addAll((Collection)newValue);
				return;
			case UML2Package.CLASSIFIER__TEMPLATE_BINDING:
				getTemplateBindings().clear();
				getTemplateBindings().addAll((Collection)newValue);
				return;
			case UML2Package.CLASSIFIER__OWNED_TEMPLATE_SIGNATURE:
				setOwnedTemplateSignature((TemplateSignature)newValue);
				return;
			case UML2Package.CLASSIFIER__NAME:
				setName((String)newValue);
				return;
			case UML2Package.CLASSIFIER__VISIBILITY:
				setVisibility((VisibilityKind)newValue);
				return;
			case UML2Package.CLASSIFIER__CLIENT_DEPENDENCY:
				getClientDependencies().clear();
				getClientDependencies().addAll((Collection)newValue);
				return;
			case UML2Package.CLASSIFIER__NAME_EXPRESSION:
				setNameExpression((StringExpression)newValue);
				return;
			case UML2Package.CLASSIFIER__OWNED_RULE:
				getOwnedRules().clear();
				getOwnedRules().addAll((Collection)newValue);
				return;
			case UML2Package.CLASSIFIER__ELEMENT_IMPORT:
				getElementImports().clear();
				getElementImports().addAll((Collection)newValue);
				return;
			case UML2Package.CLASSIFIER__PACKAGE_IMPORT:
				getPackageImports().clear();
				getPackageImports().addAll((Collection)newValue);
				return;
			case UML2Package.CLASSIFIER__TEMPLATE_PARAMETER:
				setTemplateParameter((TemplateParameter)newValue);
				return;
			case UML2Package.CLASSIFIER__OWNING_PARAMETER:
				setOwningParameter((TemplateParameter)newValue);
				return;
			case UML2Package.CLASSIFIER__PACKAGEABLE_ELEMENT_VISIBILITY:
				setPackageableElement_visibility((VisibilityKind)newValue);
				return;
			case UML2Package.CLASSIFIER__IS_LEAF:
				setIsLeaf(((Boolean)newValue).booleanValue());
				return;
			case UML2Package.CLASSIFIER__IS_ABSTRACT:
				setIsAbstract(((Boolean)newValue).booleanValue());
				return;
			case UML2Package.CLASSIFIER__GENERALIZATION:
				getGeneralizations().clear();
				getGeneralizations().addAll((Collection)newValue);
				return;
			case UML2Package.CLASSIFIER__REDEFINED_CLASSIFIER:
				getRedefinedClassifiers().clear();
				getRedefinedClassifiers().addAll((Collection)newValue);
				return;
			case UML2Package.CLASSIFIER__SUBSTITUTION:
				getSubstitutions().clear();
				getSubstitutions().addAll((Collection)newValue);
				return;
			case UML2Package.CLASSIFIER__POWERTYPE_EXTENT:
				getPowertypeExtents().clear();
				getPowertypeExtents().addAll((Collection)newValue);
				return;
			case UML2Package.CLASSIFIER__OWNED_USE_CASE:
				getOwnedUseCases().clear();
				getOwnedUseCases().addAll((Collection)newValue);
				return;
			case UML2Package.CLASSIFIER__USE_CASE:
				getUseCases().clear();
				getUseCases().addAll((Collection)newValue);
				return;
			case UML2Package.CLASSIFIER__REPRESENTATION:
				setRepresentation((CollaborationOccurrence)newValue);
				return;
			case UML2Package.CLASSIFIER__OCCURRENCE:
				getOccurrences().clear();
				getOccurrences().addAll((Collection)newValue);
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
			case UML2Package.CLASSIFIER__EANNOTATIONS:
				getEAnnotations().clear();
				return;
			case UML2Package.CLASSIFIER__OWNED_COMMENT:
				getOwnedComments().clear();
				return;
			case UML2Package.CLASSIFIER__TEMPLATE_BINDING:
				getTemplateBindings().clear();
				return;
			case UML2Package.CLASSIFIER__OWNED_TEMPLATE_SIGNATURE:
				setOwnedTemplateSignature((TemplateSignature)null);
				return;
			case UML2Package.CLASSIFIER__NAME:
				setName(NAME_EDEFAULT);
				return;
			case UML2Package.CLASSIFIER__VISIBILITY:
				setVisibility(VISIBILITY_EDEFAULT);
				return;
			case UML2Package.CLASSIFIER__CLIENT_DEPENDENCY:
				getClientDependencies().clear();
				return;
			case UML2Package.CLASSIFIER__NAME_EXPRESSION:
				setNameExpression((StringExpression)null);
				return;
			case UML2Package.CLASSIFIER__OWNED_RULE:
				getOwnedRules().clear();
				return;
			case UML2Package.CLASSIFIER__ELEMENT_IMPORT:
				getElementImports().clear();
				return;
			case UML2Package.CLASSIFIER__PACKAGE_IMPORT:
				getPackageImports().clear();
				return;
			case UML2Package.CLASSIFIER__TEMPLATE_PARAMETER:
				setTemplateParameter((TemplateParameter)null);
				return;
			case UML2Package.CLASSIFIER__OWNING_PARAMETER:
				setOwningParameter(null);
				return;
			case UML2Package.CLASSIFIER__PACKAGEABLE_ELEMENT_VISIBILITY:
				setPackageableElement_visibility(PACKAGEABLE_ELEMENT_VISIBILITY_EDEFAULT);
				return;
			case UML2Package.CLASSIFIER__IS_LEAF:
				setIsLeaf(IS_LEAF_EDEFAULT);
				return;
			case UML2Package.CLASSIFIER__IS_ABSTRACT:
				setIsAbstract(IS_ABSTRACT_EDEFAULT);
				return;
			case UML2Package.CLASSIFIER__GENERALIZATION:
				getGeneralizations().clear();
				return;
			case UML2Package.CLASSIFIER__REDEFINED_CLASSIFIER:
				getRedefinedClassifiers().clear();
				return;
			case UML2Package.CLASSIFIER__SUBSTITUTION:
				getSubstitutions().clear();
				return;
			case UML2Package.CLASSIFIER__POWERTYPE_EXTENT:
				getPowertypeExtents().clear();
				return;
			case UML2Package.CLASSIFIER__OWNED_USE_CASE:
				getOwnedUseCases().clear();
				return;
			case UML2Package.CLASSIFIER__USE_CASE:
				getUseCases().clear();
				return;
			case UML2Package.CLASSIFIER__REPRESENTATION:
				setRepresentation((CollaborationOccurrence)null);
				return;
			case UML2Package.CLASSIFIER__OCCURRENCE:
				getOccurrences().clear();
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
			case UML2Package.CLASSIFIER__EANNOTATIONS:
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UML2Package.CLASSIFIER__OWNED_ELEMENT:
				return !getOwnedElements().isEmpty();
			case UML2Package.CLASSIFIER__OWNER:
				return basicGetOwner() != null;
			case UML2Package.CLASSIFIER__OWNED_COMMENT:
				return ownedComment != null && !ownedComment.isEmpty();
			case UML2Package.CLASSIFIER__TEMPLATE_BINDING:
				return templateBinding != null && !templateBinding.isEmpty();
			case UML2Package.CLASSIFIER__OWNED_TEMPLATE_SIGNATURE:
				return ownedTemplateSignature != null;
			case UML2Package.CLASSIFIER__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case UML2Package.CLASSIFIER__QUALIFIED_NAME:
				return !"".equals(getQualifiedName()); //$NON-NLS-1$
			case UML2Package.CLASSIFIER__VISIBILITY:
				return getVisibility() != VisibilityKind.PUBLIC_LITERAL;
			case UML2Package.CLASSIFIER__CLIENT_DEPENDENCY:
				return clientDependency != null && !clientDependency.isEmpty();
			case UML2Package.CLASSIFIER__NAME_EXPRESSION:
				return nameExpression != null;
			case UML2Package.CLASSIFIER__MEMBER:
				return !getMembers().isEmpty();
			case UML2Package.CLASSIFIER__OWNED_RULE:
				return ownedRule != null && !ownedRule.isEmpty();
			case UML2Package.CLASSIFIER__IMPORTED_MEMBER:
				return !getImportedMembers().isEmpty();
			case UML2Package.CLASSIFIER__ELEMENT_IMPORT:
				return elementImport != null && !elementImport.isEmpty();
			case UML2Package.CLASSIFIER__PACKAGE_IMPORT:
				return packageImport != null && !packageImport.isEmpty();
			case UML2Package.CLASSIFIER__TEMPLATE_PARAMETER:
				return templateParameter != null;
			case UML2Package.CLASSIFIER__OWNING_PARAMETER:
				return getOwningParameter() != null;
			case UML2Package.CLASSIFIER__PACKAGEABLE_ELEMENT_VISIBILITY:
				return packageableElement_visibility != PACKAGEABLE_ELEMENT_VISIBILITY_EDEFAULT;
			case UML2Package.CLASSIFIER__PACKAGE:
				return basicGetPackage() != null;
			case UML2Package.CLASSIFIER__REDEFINITION_CONTEXT:
				return !getRedefinitionContexts().isEmpty();
			case UML2Package.CLASSIFIER__IS_LEAF:
				return isLeaf != IS_LEAF_EDEFAULT;
			case UML2Package.CLASSIFIER__FEATURE:
				return !getFeatures().isEmpty();
			case UML2Package.CLASSIFIER__IS_ABSTRACT:
				return isAbstract != IS_ABSTRACT_EDEFAULT;
			case UML2Package.CLASSIFIER__INHERITED_MEMBER:
				return !getInheritedMembers().isEmpty();
			case UML2Package.CLASSIFIER__GENERAL:
				return !getGenerals().isEmpty();
			case UML2Package.CLASSIFIER__GENERALIZATION:
				return generalization != null && !generalization.isEmpty();
			case UML2Package.CLASSIFIER__ATTRIBUTE:
				return !getAttributes().isEmpty();
			case UML2Package.CLASSIFIER__REDEFINED_CLASSIFIER:
				return redefinedClassifier != null && !redefinedClassifier.isEmpty();
			case UML2Package.CLASSIFIER__SUBSTITUTION:
				return substitution != null && !substitution.isEmpty();
			case UML2Package.CLASSIFIER__POWERTYPE_EXTENT:
				return powertypeExtent != null && !powertypeExtent.isEmpty();
			case UML2Package.CLASSIFIER__OWNED_USE_CASE:
				return ownedUseCase != null && !ownedUseCase.isEmpty();
			case UML2Package.CLASSIFIER__USE_CASE:
				return useCase != null && !useCase.isEmpty();
			case UML2Package.CLASSIFIER__REPRESENTATION:
				return representation != null;
			case UML2Package.CLASSIFIER__OCCURRENCE:
				return occurrence != null && !occurrence.isEmpty();
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
				case UML2Package.CLASSIFIER__TEMPLATE_PARAMETER: return UML2Package.PARAMETERABLE_ELEMENT__TEMPLATE_PARAMETER;
				case UML2Package.CLASSIFIER__OWNING_PARAMETER: return UML2Package.PARAMETERABLE_ELEMENT__OWNING_PARAMETER;
				default: return -1;
			}
		}
		if (baseClass == PackageableElement.class) {
			switch (derivedFeatureID) {
				case UML2Package.CLASSIFIER__PACKAGEABLE_ELEMENT_VISIBILITY: return UML2Package.PACKAGEABLE_ELEMENT__PACKAGEABLE_ELEMENT_VISIBILITY;
				default: return -1;
			}
		}
		if (baseClass == Type.class) {
			switch (derivedFeatureID) {
				case UML2Package.CLASSIFIER__PACKAGE: return UML2Package.TYPE__PACKAGE;
				default: return -1;
			}
		}
		if (baseClass == RedefinableElement.class) {
			switch (derivedFeatureID) {
				case UML2Package.CLASSIFIER__REDEFINITION_CONTEXT: return UML2Package.REDEFINABLE_ELEMENT__REDEFINITION_CONTEXT;
				case UML2Package.CLASSIFIER__IS_LEAF: return UML2Package.REDEFINABLE_ELEMENT__IS_LEAF;
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
				case UML2Package.PARAMETERABLE_ELEMENT__TEMPLATE_PARAMETER: return UML2Package.CLASSIFIER__TEMPLATE_PARAMETER;
				case UML2Package.PARAMETERABLE_ELEMENT__OWNING_PARAMETER: return UML2Package.CLASSIFIER__OWNING_PARAMETER;
				default: return -1;
			}
		}
		if (baseClass == PackageableElement.class) {
			switch (baseFeatureID) {
				case UML2Package.PACKAGEABLE_ELEMENT__PACKAGEABLE_ELEMENT_VISIBILITY: return UML2Package.CLASSIFIER__PACKAGEABLE_ELEMENT_VISIBILITY;
				default: return -1;
			}
		}
		if (baseClass == Type.class) {
			switch (baseFeatureID) {
				case UML2Package.TYPE__PACKAGE: return UML2Package.CLASSIFIER__PACKAGE;
				default: return -1;
			}
		}
		if (baseClass == RedefinableElement.class) {
			switch (baseFeatureID) {
				case UML2Package.REDEFINABLE_ELEMENT__REDEFINITION_CONTEXT: return UML2Package.CLASSIFIER__REDEFINITION_CONTEXT;
				case UML2Package.REDEFINABLE_ELEMENT__IS_LEAF: return UML2Package.CLASSIFIER__IS_LEAF;
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
		result.append(" (isLeaf: "); //$NON-NLS-1$
		result.append(isLeaf);
		result.append(')');
		return result.toString();
	}

	// <!-- begin-custom-operations -->
	 /*
	  * (non-Javadoc)
	  * 
	  * @see org.eclipse.uml2.Type#createAssociation(boolean,
	  *      org.eclipse.uml2.AggregationKind, java.lang.String, int, int,
	  *      org.eclipse.uml2.Type, boolean, org.eclipse.uml2.AggregationKind,
	  *      java.lang.String, int, int)
	  */
	public Association createAssociation(boolean thisEndIsNavigable,
			AggregationKind thisEndAggregation, String thisEndName,
			int thisEndLowerBound, int thisEndUpperBound, Type otherType,
			boolean otherEndIsNavigable, AggregationKind otherEndAggregation,
			String otherEndName, int otherEndLowerBound, int otherEndUpperBound) {
		
		return TypeOperations.createAssociation(this, thisEndIsNavigable,
				thisEndAggregation, thisEndName, thisEndLowerBound,
				thisEndUpperBound, otherType, otherEndIsNavigable,
				otherEndAggregation, otherEndName, otherEndLowerBound,
				otherEndUpperBound);
	}
	
	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.uml2.Classifier#createGeneralization(org.eclipse.uml2.Classifier)
	 */
	public Generalization createGeneralization(Classifier generalClassifier) {
		return ClassifierOperations.createGeneralization(this,
				generalClassifier);
	}
	// <!-- end-custom-operations -->

} //ClassifierImpl
