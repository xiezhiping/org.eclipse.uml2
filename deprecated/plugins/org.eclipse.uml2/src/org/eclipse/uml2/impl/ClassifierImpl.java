/*
 * Copyright (c) 2003, 2004 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Common Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/cpl-v10.html
 *
 * Contributors:
 *   IBM - Initial API and implementation
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
 *   <li>{@link org.eclipse.uml2.impl.ClassifierImpl#getPowertypeExtents <em>Powertype Extent</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.ClassifierImpl#getSubstitutions <em>Substitution</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.ClassifierImpl#getOwnedUseCases <em>Owned Use Case</em>}</li>
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
	 * The cached value of the '{@link #getPowertypeExtents() <em>Powertype Extent</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPowertypeExtents()
	 * @generated
	 * @ordered
	 */
	protected EList powertypeExtent = null;

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
	 * The cached value of the '{@link #getOwnedUseCases() <em>Owned Use Case</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedUseCases()
	 * @generated
	 * @ordered
	 */
	protected EList ownedUseCase = null;

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
	 * Returns the value of the '<em><b>Template Parameter</b></em>' reference.
	 * @generated
	 */
	public TemplateParameter getTemplateParameter() {
		TemplateParameter templateParameter = basicGetTemplateParameter();
		return templateParameter == null ? null : (TemplateParameter)eResolveProxy((InternalEObject)templateParameter);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * Returns the value of the '<em><b>Template Parameter</b></em>' reference.
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
		// TODO: test this superset basic setter
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
	 * Returns the value of the '<em><b>Owning Parameter</b></em>' container reference.
	 * <p>
	 * Subsets the following features:
	 * <ul>
	 *   <li>{@link org.eclipse.uml2.ParameterableElement#getTemplateParameter}</li>
	 *   <li>{@link org.eclipse.uml2.Element#getOwner}</li>
	 * </ul>
	 * </p>
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
		// TODO: test this subset setter
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
	 * Returns the value of the '<em><b>Packageable Element visibility</b></em>' attribute.
	 * <p>
	 * Redefines the following features:
	 * <ul>
	 *   <li>{@link org.eclipse.uml2.NamedElement#getVisibility}</li>
	 * </ul>
	 * </p>
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
	 * Returns the derived value of the '<em><b>Package</b></em>' reference.
	 * <p>
	 * Subsets the following features:
	 * <ul>
	 *   <li>{@link org.eclipse.uml2.NamedElement#getNamespace}</li>
	 * </ul>
	 * </p>
	 * @generated
	 */
	public org.eclipse.uml2.Package getPackage() {
		org.eclipse.uml2.Package package_ = basicGetPackage();
		return package_ == null ? null : (org.eclipse.uml2.Package)eResolveProxy((InternalEObject)package_);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * Returns the derived value of the '<em><b>Package</b></em>' reference.
	 * <p>
	 * Subsets the following features:
	 * <ul>
	 *   <li>{@link org.eclipse.uml2.NamedElement#getNamespace}</li>
	 * </ul>
	 * </p>
	 * @generated
	 */
	public org.eclipse.uml2.Package basicGetPackageGen() {
		// TODO: implement this derived basic getter to return the 'Package' reference
		// -> do not perform proxy resolution
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

public org.eclipse.uml2.Package basicGetPackage() {
		// TODO: test this derived basic getter
		return org.eclipse.uml2.Package.class.isInstance(eContainer) ? (org.eclipse.uml2.Package) eContainer : null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPackage(org.eclipse.uml2.Package newPackage, NotificationChain msgs) {
		// TODO: test this derived basic setter
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * Returns the value of the '<em><b>Is Leaf</b></em>' attribute.
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
	 * Returns the value of the '<em><b>Redefinition Context</b></em>' reference list, a derived union.
	 * @generated
	 */
	public EList getRedefinitionContexts() {
		// TODO: test this union getter
		if (!getCacheAdapter().containsKey(this, UML2Package.eINSTANCE.getRedefinableElement_RedefinitionContext())) {
			Set union = new LinkedHashSet();
			getCacheAdapter().put(
				this,
				UML2Package.eINSTANCE.getRedefinableElement_RedefinitionContext(),
				new EcoreEList.UnmodifiableEList(this, 
					UML2Package.eINSTANCE.getRedefinableElement_RedefinitionContext(),
					union.size(),
					union.toArray()));
		}
		return (EList) getCacheAdapter().get(this, UML2Package.eINSTANCE.getRedefinableElement_RedefinitionContext());
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
	 * Returns the value of the '<em><b>Is Abstract</b></em>' attribute.
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
	 * Returns the value of the '<em><b>Feature</b></em>' reference list, a derived union.
	 * <p>
	 * Subsets the following features:
	 * <ul>
	 *   <li>{@link org.eclipse.uml2.Namespace#getMembers}</li>
	 * </ul>
	 * </p>
	 * @generated
	 */
	public EList getFeatures() {
		// TODO: test this union getter
		if (!getCacheAdapter().containsKey(this, UML2Package.eINSTANCE.getClassifier_Feature())) {
			Set union = new LinkedHashSet();
			union.addAll(getAttributes());
			getCacheAdapter().put(
				this,
				UML2Package.eINSTANCE.getClassifier_Feature(),
				new EcoreEList.UnmodifiableEList(this, 
					UML2Package.eINSTANCE.getClassifier_Feature(),
					union.size(),
					union.toArray()));
		}
		return (EList) getCacheAdapter().get(this, UML2Package.eINSTANCE.getClassifier_Feature());
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
	 * Returns the derived value of the '<em><b>Inherited Member</b></em>' reference list.
	 * <p>
	 * Subsets the following features:
	 * <ul>
	 *   <li>{@link org.eclipse.uml2.Namespace#getMembers}</li>
	 * </ul>
	 * </p>
	 * @generated
	 */
	public EList getInheritedMembersGen() {
		// TODO: implement this derived getter to return the 'Inherited Member' reference list
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

public EList getInheritedMembers() {
		// TODO: test this derived getter
        if (!getCacheAdapter().containsKey(this, UML2Package.eINSTANCE.getClassifier_InheritedMember())) {
            Set inheritedMember = inheritedMember();
            getCacheAdapter().put(
                    this,
                    UML2Package.eINSTANCE.getClassifier_InheritedMember(),
                    new EcoreEList.UnmodifiableEList(this, UML2Package.eINSTANCE.getClassifier_InheritedMember(), inheritedMember.size(), inheritedMember
                            .toArray()));
        }

        return (EList) getCacheAdapter().get(this, UML2Package.eINSTANCE.getClassifier_InheritedMember());
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
	 * Returns the derived value of the '<em><b>General</b></em>' reference list.
	 * @generated
	 */
	public EList getGeneralsGen() {
		// TODO: implement this derived getter to return the 'General' reference list
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

public EList getGenerals() {
		// TODO: test this derived getter
        if (!getCacheAdapter().containsKey(this, UML2Package.eINSTANCE.getClassifier_General())) {
    		Set generals = general();
            getCacheAdapter().put(
                    this,
                    UML2Package.eINSTANCE.getClassifier_General(),
                    new EcoreEList.UnmodifiableEList(this, UML2Package.eINSTANCE.getClassifier_General(), generals.size(), generals.toArray()));
        }

        return (EList) getCacheAdapter().get(this, UML2Package.eINSTANCE.getClassifier_General());
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
	 * Returns the value of the '<em><b>Generalization</b></em>' containment reference list.
	 * <p>
	 * Subsets the following features:
	 * <ul>
	 *   <li>{@link org.eclipse.uml2.Element#getOwnedElements}</li>
	 * </ul>
	 * </p>
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
			eNotify(new ENotificationImpl(this, Notification.CREATE, UML2Package.CLASSIFIER__GENERALIZATION, null, newGeneralization));
		}
		getGeneralizations().add(newGeneralization);
		return newGeneralization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * Returns the value of the '<em><b>Attribute</b></em>' reference list, a derived union.
	 * <p>
	 * Subsets the following features:
	 * <ul>
	 *   <li>{@link org.eclipse.uml2.Classifier#getFeatures}</li>
	 * </ul>
	 * </p>
	 * @generated
	 */
	public EList getAttributes() {
		// TODO: test this union getter
		if (!getCacheAdapter().containsKey(this, UML2Package.eINSTANCE.getClassifier_Attribute())) {
			Set union = new LinkedHashSet();
			getCacheAdapter().put(
				this,
				UML2Package.eINSTANCE.getClassifier_Attribute(),
				new EcoreEList.UnmodifiableEList(this, 
					UML2Package.eINSTANCE.getClassifier_Attribute(),
					union.size(),
					union.toArray()));
		}
		return (EList) getCacheAdapter().get(this, UML2Package.eINSTANCE.getClassifier_Attribute());
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
	 * Returns the value of the '<em><b>Redefined Classifier</b></em>' reference list.
	 * <p>
	 * Subsets the following features:
	 * <ul>
	 *   <li>{@link org.eclipse.uml2.RedefinableElement#getRedefinedElements}</li>
	 * </ul>
	 * </p>
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
	 * Returns the value of the '<em><b>Substitution</b></em>' containment reference list.
	 * <p>
	 * Subsets the following features:
	 * <ul>
	 *   <li>{@link org.eclipse.uml2.Element#getOwnedElements}</li>
	 *   <li>{@link org.eclipse.uml2.NamedElement#getClientDependencies}</li>
	 * </ul>
	 * </p>
	 * @generated
	 */
	public EList getSubstitutions() {
		// TODO: test this subset getter
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
			eNotify(new ENotificationImpl(this, Notification.CREATE, UML2Package.CLASSIFIER__SUBSTITUTION, null, newSubstitution));
		}
		getSubstitutions().add(newSubstitution);
		return newSubstitution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * Returns the value of the '<em><b>Powertype Extent</b></em>' reference list.
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
	 * Returns the value of the '<em><b>Owned Use Case</b></em>' containment reference list.
	 * <p>
	 * Subsets the following features:
	 * <ul>
	 *   <li>{@link org.eclipse.uml2.Namespace#getOwnedMembers}</li>
	 * </ul>
	 * </p>
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
			eNotify(new ENotificationImpl(this, Notification.CREATE, UML2Package.CLASSIFIER__OWNED_USE_CASE, null, newOwnedUseCase));
		}
		getOwnedUseCases().add(newOwnedUseCase);
		return newOwnedUseCase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * Returns the value of the '<em><b>Representation</b></em>' reference.
	 * <p>
	 * Subsets the following features:
	 * <ul>
	 *   <li>{@link org.eclipse.uml2.Classifier#getOccurrences}</li>
	 * </ul>
	 * </p>
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
		// TODO: test this subset setter
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
	 * Returns the value of the '<em><b>Occurrence</b></em>' containment reference list.
	 * <p>
	 * Subsets the following features:
	 * <ul>
	 *   <li>{@link org.eclipse.uml2.Element#getOwnedElements}</li>
	 * </ul>
	 * </p>
	 * @generated
	 */
	public EList getOccurrences() {
		// TODO: test this superset getter
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
			eNotify(new ENotificationImpl(this, Notification.CREATE, UML2Package.CLASSIFIER__OCCURRENCE, null, newOccurrence));
		}
		getOccurrences().add(newOccurrence);
		return newOccurrence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * Returns the value of the '<em><b>Owner</b></em>' reference, a derived union.
	 * It is bidirectional and its opposite is '{@link org.eclipse.uml2.Element#getOwnedElements <em>Owned Element</em>}'.
	 * @generated
	 */
	public Element basicGetOwner() {
		// TODO: test this union basic getter
		if (null != getOwningParameter()) {
			return (Element) getOwningParameter();
		}
		return super.basicGetOwner();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * Returns the value of the '<em><b>Visibility</b></em>' attribute.
	 * @generated
	 */
	public VisibilityKind getVisibility() {
		// TODO: test this redefined getter
		return getPackageableElement_visibility();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVisibility(VisibilityKind newVisibility) {
		// TODO: test this redefined setter
		setPackageableElement_visibility(newVisibility);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean conformsToGen(Type other) {
		// TODO: test this OCL operation
		return org.eclipse.uml2.internal.operation.TypeOperations.conformsTo(this, other);
	}

	public boolean conformsTo(Type other) {
		return Classifier.class.isInstance(other)
			? conformsTo((Classifier) other) : conformsToGen(other);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * Returns the value of the '<em><b>Namespace</b></em>' reference, a derived union.
	 * It is bidirectional and its opposite is '{@link org.eclipse.uml2.Namespace#getOwnedMembers <em>Owned Member</em>}'.
	 * @generated
	 */
	public Namespace getNamespace() {
		// TODO: test this union getter
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
	public boolean validateRedefinitionContextValid(DiagnosticChain diagnostics, Map data) {
		// TODO: implement this OCL constraint
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRedefinitionConsistent(DiagnosticChain diagnostics, Map data) {
		// TODO: implement this OCL constraint
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isConsistentWith(RedefinableElement redefinee) {
		// TODO: test this OCL operation
		return org.eclipse.uml2.internal.operation.RedefinableElementOperations.isConsistentWith(this, redefinee);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isRedefinitionContextValid(RedefinableElement redefinable) {
		// TODO: test this OCL operation
		return org.eclipse.uml2.internal.operation.RedefinableElementOperations.isRedefinitionContextValid(this, redefinable);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Set allFeatures() {
		// TODO: test this OCL operation
		try {
			java.lang.reflect.Method method = getClass().getMethod("allFeatures", new Class[] {}); //$NON-NLS-1$
			if (!getCacheAdapter().containsKey(this, method)) {
				getCacheAdapter().put(this,
					method,
					java.util.Collections.unmodifiableSet(org.eclipse.uml2.internal.operation.ClassifierOperations.allFeatures(this)));
			}
			return (Set) getCacheAdapter().get(this, method);
		} catch (Exception e) {
			return org.eclipse.uml2.internal.operation.ClassifierOperations.allFeatures(this);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNoCyclesInGeneralization(DiagnosticChain diagnostics, Map data) {
		// TODO: implement this OCL constraint
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSpecializeType(DiagnosticChain diagnostics, Map data) {
		// TODO: implement this OCL constraint
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInheritedMember(DiagnosticChain diagnostics, Map data) {
		// TODO: implement this OCL constraint
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Set inheritedMember() {
		// TODO: test this OCL operation
		try {
			java.lang.reflect.Method method = getClass().getMethod("inheritedMember", new Class[] {}); //$NON-NLS-1$
			if (!getCacheAdapter().containsKey(this, method)) {
				getCacheAdapter().put(this,
					method,
					java.util.Collections.unmodifiableSet(org.eclipse.uml2.internal.operation.ClassifierOperations.inheritedMember(this)));
			}
			return (Set) getCacheAdapter().get(this, method);
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
		// TODO: test this OCL operation
		try {
			java.lang.reflect.Method method = getClass().getMethod("parents", new Class[] {}); //$NON-NLS-1$
			if (!getCacheAdapter().containsKey(this, method)) {
				getCacheAdapter().put(this,
					method,
					java.util.Collections.unmodifiableSet(org.eclipse.uml2.internal.operation.ClassifierOperations.parents(this)));
			}
			return (Set) getCacheAdapter().get(this, method);
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
		// TODO: test this OCL operation
		try {
			java.lang.reflect.Method method = getClass().getMethod("allParents", new Class[] {}); //$NON-NLS-1$
			if (!getCacheAdapter().containsKey(this, method)) {
				getCacheAdapter().put(this,
					method,
					java.util.Collections.unmodifiableSet(org.eclipse.uml2.internal.operation.ClassifierOperations.allParents(this)));
			}
			return (Set) getCacheAdapter().get(this, method);
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
		// TODO: test this OCL operation
		return org.eclipse.uml2.internal.operation.ClassifierOperations.inheritableMembers(this, c);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean hasVisibilityOf(NamedElement n) {
		// TODO: test this OCL operation
		return org.eclipse.uml2.internal.operation.ClassifierOperations.hasVisibilityOf(this, n);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Set inherit(Set inhs) {
		// TODO: test this OCL operation
		return org.eclipse.uml2.internal.operation.ClassifierOperations.inherit(this, inhs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean maySpecializeType(Classifier c) {
		// TODO: test this OCL operation
		return org.eclipse.uml2.internal.operation.ClassifierOperations.maySpecializeType(this, c);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Set general() {
		// TODO: test this OCL operation
		try {
			java.lang.reflect.Method method = getClass().getMethod("general", new Class[] {}); //$NON-NLS-1$
			if (!getCacheAdapter().containsKey(this, method)) {
				getCacheAdapter().put(this,
					method,
					java.util.Collections.unmodifiableSet(org.eclipse.uml2.internal.operation.ClassifierOperations.general(this)));
			}
			return (Set) getCacheAdapter().get(this, method);
		} catch (Exception e) {
			return org.eclipse.uml2.internal.operation.ClassifierOperations.general(this);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralEqualsParents(DiagnosticChain diagnostics, Map data) {
		// TODO: implement this OCL constraint
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean conformsTo(Classifier other) {
		// TODO: test this OCL operation
		return org.eclipse.uml2.internal.operation.ClassifierOperations.conformsTo(this, other);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * Returns the value of the '<em><b>Member</b></em>' reference list, a derived union.
	 * The list contents are of type {@link org.eclipse.uml2.NamedElement}.
	 * @generated
	 */
	public EList getMembers() {
		// TODO: test this union getter
		if (!getCacheAdapter().containsKey(this, UML2Package.eINSTANCE.getNamespace_Member())) {
			Set union = new LinkedHashSet();
			union.addAll(super.getMembers());
			union.addAll(getFeatures());
			union.addAll(getInheritedMembers());
			getCacheAdapter().put(
				this,
				UML2Package.eINSTANCE.getNamespace_Member(),
				new EcoreEList.UnmodifiableEList(this, 
					UML2Package.eINSTANCE.getNamespace_Member(),
					union.size(),
					union.toArray()));
		}
		return (EList) getCacheAdapter().get(this, UML2Package.eINSTANCE.getNamespace_Member());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * Returns the value of the '<em><b>Owned Element</b></em>' reference list, a derived union.
	 * The list contents are of type {@link org.eclipse.uml2.Element}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.uml2.Element#getOwner <em>Owner</em>}'.
	 * @generated
	 */
	public EList getOwnedElements() {
		// TODO: test this union getter
		if (!getCacheAdapter().containsKey(this, UML2Package.eINSTANCE.getElement_OwnedElement())) {
			Set union = new LinkedHashSet();
			union.addAll(super.getOwnedElements());
			union.addAll(getGeneralizations());
			union.addAll(getSubstitutions());
			union.addAll(getOccurrences());
			getCacheAdapter().put(
				this,
				UML2Package.eINSTANCE.getElement_OwnedElement(),
				new EcoreEList.UnmodifiableEList(this, 
					UML2Package.eINSTANCE.getElement_OwnedElement(),
					union.size(),
					union.toArray()));
		}
		return (EList) getCacheAdapter().get(this, UML2Package.eINSTANCE.getElement_OwnedElement());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * Returns the value of the '<em><b>Redefined Element</b></em>' reference list, a derived union.
	 * The list contents are of type {@link org.eclipse.uml2.RedefinableElement}.
	 * @generated
	 */
	public EList getRedefinedElements() {
		// TODO: test this union getter
		if (!getCacheAdapter().containsKey(this, UML2Package.eINSTANCE.getClassifier().getEAllOperations().get(66))) {
			Set union = new LinkedHashSet();
			union.addAll(getRedefinedClassifiers());
			getCacheAdapter().put(
				this,
				UML2Package.eINSTANCE.getClassifier().getEAllOperations().get(66),
				new BasicEList.UnmodifiableEList(union.size(), union.toArray()));
		}
		return (EList) getCacheAdapter().get(this, UML2Package.eINSTANCE.getClassifier().getEAllOperations().get(66));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * Returns the value of the '<em><b>Client Dependency</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.Dependency}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.uml2.Dependency#getClients <em>Client</em>}'.
	 * @generated
	 */
	public EList getClientDependencies() {
		// TODO: test this superset getter
		if (clientDependency == null) {
			clientDependency = new SupersetEObjectWithInverseResolvingEList.ManyInverse(Dependency.class, this, UML2Package.CLASSIFIER__CLIENT_DEPENDENCY, new int[] {UML2Package.CLASSIFIER__SUBSTITUTION}, UML2Package.DEPENDENCY__CLIENT);
		}
		return clientDependency;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * Returns the value of the '<em><b>Owned Member</b></em>' reference list, a derived union.
	 * The list contents are of type {@link org.eclipse.uml2.NamedElement}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.uml2.NamedElement#getNamespace <em>Namespace</em>}'.
	 * @generated
	 */
	public EList getOwnedMembers() {
		// TODO: test this union getter
		if (!getCacheAdapter().containsKey(this, UML2Package.eINSTANCE.getClassifier().getEAllOperations().get(68))) {
			Set union = new LinkedHashSet();
			union.addAll(super.getOwnedMembers());
			union.addAll(getOwnedUseCases());
			getCacheAdapter().put(
				this,
				UML2Package.eINSTANCE.getClassifier().getEAllOperations().get(68),
				new BasicEList.UnmodifiableEList(union.size(), union.toArray()));
		}
		return (EList) getCacheAdapter().get(this, UML2Package.eINSTANCE.getClassifier().getEAllOperations().get(68));
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
				case UML2Package.CLASSIFIER__POWERTYPE_EXTENT:
					return ((InternalEList)getPowertypeExtents()).basicAdd(otherEnd, msgs);
				case UML2Package.CLASSIFIER__SUBSTITUTION:
					return ((InternalEList)getSubstitutions()).basicAdd(otherEnd, msgs);
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
				case UML2Package.CLASSIFIER__POWERTYPE_EXTENT:
					return ((InternalEList)getPowertypeExtents()).basicRemove(otherEnd, msgs);
				case UML2Package.CLASSIFIER__SUBSTITUTION:
					return ((InternalEList)getSubstitutions()).basicRemove(otherEnd, msgs);
				case UML2Package.CLASSIFIER__OWNED_USE_CASE:
					return ((InternalEList)getOwnedUseCases()).basicRemove(otherEnd, msgs);
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
			case UML2Package.CLASSIFIER__POWERTYPE_EXTENT:
				return getPowertypeExtents();
			case UML2Package.CLASSIFIER__SUBSTITUTION:
				return getSubstitutions();
			case UML2Package.CLASSIFIER__OWNED_USE_CASE:
				return getOwnedUseCases();
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
			case UML2Package.CLASSIFIER__POWERTYPE_EXTENT:
				getPowertypeExtents().clear();
				getPowertypeExtents().addAll((Collection)newValue);
				return;
			case UML2Package.CLASSIFIER__SUBSTITUTION:
				getSubstitutions().clear();
				getSubstitutions().addAll((Collection)newValue);
				return;
			case UML2Package.CLASSIFIER__OWNED_USE_CASE:
				getOwnedUseCases().clear();
				getOwnedUseCases().addAll((Collection)newValue);
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
			case UML2Package.CLASSIFIER__POWERTYPE_EXTENT:
				getPowertypeExtents().clear();
				return;
			case UML2Package.CLASSIFIER__SUBSTITUTION:
				getSubstitutions().clear();
				return;
			case UML2Package.CLASSIFIER__OWNED_USE_CASE:
				getOwnedUseCases().clear();
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
				return visibility != VISIBILITY_EDEFAULT;
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
			case UML2Package.CLASSIFIER__POWERTYPE_EXTENT:
				return powertypeExtent != null && !powertypeExtent.isEmpty();
			case UML2Package.CLASSIFIER__SUBSTITUTION:
				return substitution != null && !substitution.isEmpty();
			case UML2Package.CLASSIFIER__OWNED_USE_CASE:
				return ownedUseCase != null && !ownedUseCase.isEmpty();
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
