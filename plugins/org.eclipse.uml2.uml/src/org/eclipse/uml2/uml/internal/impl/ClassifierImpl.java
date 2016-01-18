/*
 * Copyright (c) 2005, 2016 IBM Corporation, Embarcadero Technologies, CEA, and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *   Kenn Hussey (Embarcadero Technologies) - 204200
 *   Kenn Hussey - 286329, 323181
 *   Kenn Hussey (CEA) - 327039, 351774, 212765, 418466, 454400, 451350, 485756
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

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.uml2.common.util.CacheAdapter;
import org.eclipse.uml2.common.util.DerivedEObjectEList;
import org.eclipse.uml2.common.util.DerivedUnionEObjectEList;
import org.eclipse.uml2.common.util.SubsetSupersetEObjectContainmentEList;

import org.eclipse.uml2.uml.AggregationKind;
import org.eclipse.uml2.uml.Association;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.ClassifierTemplateParameter;
import org.eclipse.uml2.uml.CollaborationUse;
import org.eclipse.uml2.uml.Comment;
import org.eclipse.uml2.uml.Constraint;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.ElementImport;
import org.eclipse.uml2.uml.Feature;
import org.eclipse.uml2.uml.Generalization;
import org.eclipse.uml2.uml.GeneralizationSet;
import org.eclipse.uml2.uml.Interface;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Namespace;
import org.eclipse.uml2.uml.Operation;
import org.eclipse.uml2.uml.PackageImport;
import org.eclipse.uml2.uml.PackageableElement;
import org.eclipse.uml2.uml.ParameterableElement;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.RedefinableElement;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.RedefinableTemplateSignature;
import org.eclipse.uml2.uml.StringExpression;
import org.eclipse.uml2.uml.StructuralFeature;
import org.eclipse.uml2.uml.Substitution;
import org.eclipse.uml2.uml.TemplateBinding;
import org.eclipse.uml2.uml.TemplateParameter;
import org.eclipse.uml2.uml.TemplateSignature;
import org.eclipse.uml2.uml.TemplateableElement;
import org.eclipse.uml2.uml.Type;
import org.eclipse.uml2.uml.UMLFactory;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.UseCase;
import org.eclipse.uml2.uml.VisibilityKind;

import org.eclipse.uml2.uml.internal.operations.ClassifierOperations;
import org.eclipse.uml2.uml.internal.operations.PackageableElementOperations;
import org.eclipse.uml2.uml.internal.operations.ParameterableElementOperations;
import org.eclipse.uml2.uml.internal.operations.RedefinableElementOperations;
import org.eclipse.uml2.uml.internal.operations.TemplateableElementOperations;

import org.eclipse.uml2.uml.internal.operations.TypeOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Classifier</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ClassifierImpl#getRedefinedElements <em>Redefined Element</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ClassifierImpl#getRedefinitionContexts <em>Redefinition Context</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ClassifierImpl#isLeaf <em>Is Leaf</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ClassifierImpl#getOwner <em>Owner</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ClassifierImpl#getTemplateParameter <em>Template Parameter</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ClassifierImpl#getOwningTemplateParameter <em>Owning Template Parameter</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ClassifierImpl#getVisibility <em>Visibility</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ClassifierImpl#getNamespace <em>Namespace</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ClassifierImpl#getPackage <em>Package</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ClassifierImpl#getOwnedElements <em>Owned Element</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ClassifierImpl#getTemplateBindings <em>Template Binding</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ClassifierImpl#getOwnedTemplateSignature <em>Owned Template Signature</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ClassifierImpl#getFeatures <em>Feature</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ClassifierImpl#getMembers <em>Member</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ClassifierImpl#getAttributes <em>Attribute</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ClassifierImpl#getOwnedMembers <em>Owned Member</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ClassifierImpl#getCollaborationUses <em>Collaboration Use</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ClassifierImpl#getGenerals <em>General</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ClassifierImpl#getGeneralizations <em>Generalization</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ClassifierImpl#getPowertypeExtents <em>Powertype Extent</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ClassifierImpl#getInheritedMembers <em>Inherited Member</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ClassifierImpl#isAbstract <em>Is Abstract</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ClassifierImpl#isFinalSpecialization <em>Is Final Specialization</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ClassifierImpl#getOwnedUseCases <em>Owned Use Case</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ClassifierImpl#getUseCases <em>Use Case</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ClassifierImpl#getRedefinedClassifiers <em>Redefined Classifier</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ClassifierImpl#getRepresentation <em>Representation</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ClassifierImpl#getSubstitutions <em>Substitution</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ClassifierImpl
		extends NamespaceImpl
		implements Classifier {

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
	 * The flag representing the value of the '{@link #isLeaf() <em>Is Leaf</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isLeaf()
	 * @generated
	 * @ordered
	 */
	protected static final int IS_LEAF_EFLAG = 1 << 12;

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
	 * The cached value of the '{@link #getTemplateBindings() <em>Template Binding</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTemplateBindings()
	 * @generated
	 * @ordered
	 */
	protected EList<TemplateBinding> templateBindings;

	/**
	 * The cached value of the '{@link #getOwnedTemplateSignature() <em>Owned Template Signature</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedTemplateSignature()
	 * @generated
	 * @ordered
	 */
	protected TemplateSignature ownedTemplateSignature;

	/**
	 * The cached value of the '{@link #getCollaborationUses() <em>Collaboration Use</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCollaborationUses()
	 * @generated
	 * @ordered
	 */
	protected EList<CollaborationUse> collaborationUses;

	/**
	 * The cached value of the '{@link #getGeneralizations() <em>Generalization</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneralizations()
	 * @generated
	 * @ordered
	 */
	protected EList<Generalization> generalizations;

	/**
	 * The cached value of the '{@link #getPowertypeExtents() <em>Powertype Extent</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPowertypeExtents()
	 * @generated
	 * @ordered
	 */
	protected EList<GeneralizationSet> powertypeExtents;

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
	 * The flag representing the value of the '{@link #isAbstract() <em>Is Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAbstract()
	 * @generated
	 * @ordered
	 */
	protected static final int IS_ABSTRACT_EFLAG = 1 << 13;

	/**
	 * The default value of the '{@link #isFinalSpecialization() <em>Is Final Specialization</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFinalSpecialization()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_FINAL_SPECIALIZATION_EDEFAULT = false;

	/**
	 * The flag representing the value of the '{@link #isFinalSpecialization() <em>Is Final Specialization</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFinalSpecialization()
	 * @generated
	 * @ordered
	 */
	protected static final int IS_FINAL_SPECIALIZATION_EFLAG = 1 << 14;

	/**
	 * The cached value of the '{@link #getOwnedUseCases() <em>Owned Use Case</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedUseCases()
	 * @generated
	 * @ordered
	 */
	protected EList<UseCase> ownedUseCases;

	/**
	 * The cached value of the '{@link #getUseCases() <em>Use Case</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUseCases()
	 * @generated
	 * @ordered
	 */
	protected EList<UseCase> useCases;

	/**
	 * The cached value of the '{@link #getRedefinedClassifiers() <em>Redefined Classifier</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRedefinedClassifiers()
	 * @generated
	 * @ordered
	 */
	protected EList<Classifier> redefinedClassifiers;

	/**
	 * The cached value of the '{@link #getRepresentation() <em>Representation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepresentation()
	 * @generated
	 * @ordered
	 */
	protected CollaborationUse representation;

	/**
	 * The cached value of the '{@link #getSubstitutions() <em>Substitution</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubstitutions()
	 * @generated
	 * @ordered
	 */
	protected EList<Substitution> substitutions;

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
	@Override
	protected EClass eStaticClass() {
		return UMLPackage.Literals.CLASSIFIER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
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
						UMLPackage.CLASSIFIER__REDEFINED_ELEMENT,
						REDEFINED_ELEMENT_ESUBSETS));
			}
			return redefinedElements;
		}
		return new DerivedUnionEObjectEList<RedefinableElement>(
			RedefinableElement.class, this,
			UMLPackage.CLASSIFIER__REDEFINED_ELEMENT,
			REDEFINED_ELEMENT_ESUBSETS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Classifier> getRedefinitionContextsGen() {
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
						UMLPackage.CLASSIFIER__REDEFINITION_CONTEXT, null));
			}
			return redefinitionContexts;
		}
		return new DerivedUnionEObjectEList<Classifier>(Classifier.class, this,
			UMLPackage.CLASSIFIER__REDEFINITION_CONTEXT, null);
	}

	/**
	 * The array of subset feature identifiers for the '{@link #getRedefinitionContexts() <em>Redefinition Context</em>}' reference list.
	 * @see #getRedefinitionContexts()
	 */
	protected static final int[] REDEFINITION_CONTEXT_ESUBSETS = new int[]{
		UMLPackage.CLASSIFIER__NAMESPACE};

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
					redefinitionContexts = new DerivedEObjectEList<Classifier>(
						Classifier.class, this,
						UMLPackage.CLASSIFIER__REDEFINITION_CONTEXT,
						REDEFINITION_CONTEXT_ESUBSETS));
			}
			return redefinitionContexts;
		}
		return new DerivedEObjectEList<Classifier>(Classifier.class, this,
			UMLPackage.CLASSIFIER__REDEFINITION_CONTEXT,
			REDEFINITION_CONTEXT_ESUBSETS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Classifier getRedefinitionContext(String name) {
		return getRedefinitionContext(name, false, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Classifier getRedefinitionContext(String name, boolean ignoreCase,
			EClass eClass) {
		redefinitionContextLoop : for (Classifier redefinitionContext : getRedefinitionContexts()) {
			if (eClass != null && !eClass.isInstance(redefinitionContext))
				continue redefinitionContextLoop;
			if (name != null && !(ignoreCase
				? name.equalsIgnoreCase(redefinitionContext.getName())
				: name.equals(redefinitionContext.getName())))
				continue redefinitionContextLoop;
			return redefinitionContext;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isLeaf() {
		return (eFlags & IS_LEAF_EFLAG) != 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsLeaf(boolean newIsLeaf) {
		boolean oldIsLeaf = (eFlags & IS_LEAF_EFLAG) != 0;
		if (newIsLeaf)
			eFlags |= IS_LEAF_EFLAG;
		else
			eFlags &= ~IS_LEAF_EFLAG;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.CLASSIFIER__IS_LEAF, oldIsLeaf, newIsLeaf));
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
						UMLPackage.CLASSIFIER__TEMPLATE_PARAMETER,
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
			&& !(newTemplateParameter instanceof ClassifierTemplateParameter)) {
			throw new IllegalArgumentException(
				"newTemplateParameter must be an instance of ClassifierTemplateParameter"); //$NON-NLS-1$
		}
		TemplateParameter oldTemplateParameter = templateParameter;
		templateParameter = newTemplateParameter;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
				Notification.SET, UMLPackage.CLASSIFIER__TEMPLATE_PARAMETER,
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
			&& !(newTemplateParameter instanceof ClassifierTemplateParameter)) {
			throw new IllegalArgumentException(
				"newTemplateParameter must be an instance of ClassifierTemplateParameter"); //$NON-NLS-1$
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
				UMLPackage.CLASSIFIER__TEMPLATE_PARAMETER, newTemplateParameter,
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
		if (eContainerFeatureID() != UMLPackage.CLASSIFIER__OWNING_TEMPLATE_PARAMETER)
			return null;
		return (TemplateParameter) eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemplateParameter basicGetOwningTemplateParameter() {
		if (eContainerFeatureID() != UMLPackage.CLASSIFIER__OWNING_TEMPLATE_PARAMETER)
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
			UMLPackage.CLASSIFIER__OWNING_TEMPLATE_PARAMETER, msgs);
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
			|| (eContainerFeatureID() != UMLPackage.CLASSIFIER__OWNING_TEMPLATE_PARAMETER
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
				UMLPackage.CLASSIFIER__OWNING_TEMPLATE_PARAMETER,
				newOwningTemplateParameter, newOwningTemplateParameter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VisibilityKind getVisibility() {
		return VISIBILITY_EFLAG_VALUES[(eFlags
			& VISIBILITY_EFLAG) >>> VISIBILITY_EFLAG_OFFSET];
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVisibility(VisibilityKind newVisibility) {
		VisibilityKind oldVisibility = VISIBILITY_EFLAG_VALUES[(eFlags
			& VISIBILITY_EFLAG) >>> VISIBILITY_EFLAG_OFFSET];
		if (newVisibility == null)
			newVisibility = VISIBILITY_EDEFAULT;
		eFlags = eFlags & ~VISIBILITY_EFLAG
			| newVisibility.ordinal() << VISIBILITY_EFLAG_OFFSET;
		boolean oldVisibilityESet = (eFlags & VISIBILITY_ESETFLAG) != 0;
		eFlags |= VISIBILITY_ESETFLAG;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.CLASSIFIER__VISIBILITY, oldVisibility, newVisibility,
				!oldVisibilityESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetVisibility() {
		VisibilityKind oldVisibility = VISIBILITY_EFLAG_VALUES[(eFlags
			& VISIBILITY_EFLAG) >>> VISIBILITY_EFLAG_OFFSET];
		boolean oldVisibilityESet = (eFlags & VISIBILITY_ESETFLAG) != 0;
		eFlags = eFlags & ~VISIBILITY_EFLAG | VISIBILITY_EFLAG_DEFAULT;
		eFlags &= ~VISIBILITY_ESETFLAG;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET,
				UMLPackage.CLASSIFIER__VISIBILITY, oldVisibility,
				VISIBILITY_EDEFAULT, oldVisibilityESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetVisibility() {
		return (eFlags & VISIBILITY_ESETFLAG) != 0;
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
	public Namespace basicGetNamespace() {
		org.eclipse.uml2.uml.Package package_ = basicGetPackage();
		if (package_ != null) {
			return package_;
		}
		return super.basicGetNamespace();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.uml2.uml.Package getPackage() {
		org.eclipse.uml2.uml.Package package_ = basicGetPackage();
		return package_ != null && package_.eIsProxy()
			? (org.eclipse.uml2.uml.Package) eResolveProxy(
				(InternalEObject) package_)
			: package_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public org.eclipse.uml2.uml.Package basicGetPackage() {
		InternalEObject eInternalContainer = eInternalContainer();
		return eInternalContainer instanceof org.eclipse.uml2.uml.Package
			? (org.eclipse.uml2.uml.Package) eInternalContainer
			: null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void setPackage(org.eclipse.uml2.uml.Package newPackage) {
		if (newPackage != eInternalContainer()) {
			if (EcoreUtil.isAncestor(this, newPackage))
				throw new IllegalArgumentException(
					"Recursive containment not allowed for " + toString()); //$NON-NLS-1$
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newPackage != null)
				msgs = ((InternalEList<Type>) newPackage.getOwnedTypes())
					.basicAdd(this, msgs);
			msgs = eBasicSetContainer((InternalEObject) newPackage,
				InternalEObject.EOPPOSITE_FEATURE_BASE
					- UMLPackage.PACKAGE__PACKAGED_ELEMENT,
				msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.CLASSIFIER__PACKAGE, newPackage, newPackage));
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
						Element.class, this,
						UMLPackage.CLASSIFIER__OWNED_ELEMENT,
						OWNED_ELEMENT_ESUBSETS));
			}
			return ownedElements;
		}
		return new DerivedUnionEObjectEList<Element>(Element.class, this,
			UMLPackage.CLASSIFIER__OWNED_ELEMENT, OWNED_ELEMENT_ESUBSETS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TemplateBinding> getTemplateBindings() {
		if (templateBindings == null) {
			templateBindings = new EObjectContainmentWithInverseEList.Resolving<TemplateBinding>(
				TemplateBinding.class, this,
				UMLPackage.CLASSIFIER__TEMPLATE_BINDING,
				UMLPackage.TEMPLATE_BINDING__BOUND_ELEMENT);
		}
		return templateBindings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemplateBinding createTemplateBinding(TemplateSignature signature) {
		TemplateBinding newTemplateBinding = (TemplateBinding) create(
			UMLPackage.Literals.TEMPLATE_BINDING);
		getTemplateBindings().add(newTemplateBinding);
		if (signature != null)
			newTemplateBinding.setSignature(signature);
		return newTemplateBinding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemplateBinding getTemplateBinding(TemplateSignature signature) {
		return getTemplateBinding(signature, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemplateBinding getTemplateBinding(TemplateSignature signature,
			boolean createOnDemand) {
		templateBindingLoop : for (TemplateBinding templateBinding : getTemplateBindings()) {
			if (signature != null
				&& !signature.equals(templateBinding.getSignature()))
				continue templateBindingLoop;
			return templateBinding;
		}
		return createOnDemand
			? createTemplateBinding(signature)
			: null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemplateSignature getOwnedTemplateSignature() {
		if (ownedTemplateSignature != null
			&& ownedTemplateSignature.eIsProxy()) {
			InternalEObject oldOwnedTemplateSignature = (InternalEObject) ownedTemplateSignature;
			ownedTemplateSignature = (TemplateSignature) eResolveProxy(
				oldOwnedTemplateSignature);
			if (ownedTemplateSignature != oldOwnedTemplateSignature) {
				InternalEObject newOwnedTemplateSignature = (InternalEObject) ownedTemplateSignature;
				NotificationChain msgs = oldOwnedTemplateSignature
					.eInverseRemove(this,
						UMLPackage.TEMPLATE_SIGNATURE__TEMPLATE,
						TemplateSignature.class, null);
				if (newOwnedTemplateSignature.eInternalContainer() == null) {
					msgs = newOwnedTemplateSignature.eInverseAdd(this,
						UMLPackage.TEMPLATE_SIGNATURE__TEMPLATE,
						TemplateSignature.class, msgs);
				}
				if (msgs != null)
					msgs.dispatch();
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
						UMLPackage.CLASSIFIER__OWNED_TEMPLATE_SIGNATURE,
						oldOwnedTemplateSignature, ownedTemplateSignature));
			}
		}
		return ownedTemplateSignature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemplateSignature basicGetOwnedTemplateSignature() {
		return ownedTemplateSignature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnedTemplateSignature(
			TemplateSignature newOwnedTemplateSignature,
			NotificationChain msgs) {
		if (newOwnedTemplateSignature != null
			&& !(newOwnedTemplateSignature instanceof RedefinableTemplateSignature)) {
			throw new IllegalArgumentException(
				"newOwnedTemplateSignature must be an instance of RedefinableTemplateSignature"); //$NON-NLS-1$
		}
		TemplateSignature oldOwnedTemplateSignature = ownedTemplateSignature;
		ownedTemplateSignature = newOwnedTemplateSignature;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
				Notification.SET,
				UMLPackage.CLASSIFIER__OWNED_TEMPLATE_SIGNATURE,
				oldOwnedTemplateSignature, newOwnedTemplateSignature);
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
	public void setOwnedTemplateSignature(
			TemplateSignature newOwnedTemplateSignature) {
		if (newOwnedTemplateSignature != null
			&& !(newOwnedTemplateSignature instanceof RedefinableTemplateSignature)) {
			throw new IllegalArgumentException(
				"newOwnedTemplateSignature must be an instance of RedefinableTemplateSignature"); //$NON-NLS-1$
		}
		if (newOwnedTemplateSignature != ownedTemplateSignature) {
			NotificationChain msgs = null;
			if (ownedTemplateSignature != null)
				msgs = ((InternalEObject) ownedTemplateSignature)
					.eInverseRemove(this,
						UMLPackage.TEMPLATE_SIGNATURE__TEMPLATE,
						TemplateSignature.class, msgs);
			if (newOwnedTemplateSignature != null)
				msgs = ((InternalEObject) newOwnedTemplateSignature)
					.eInverseAdd(this, UMLPackage.TEMPLATE_SIGNATURE__TEMPLATE,
						TemplateSignature.class, msgs);
			msgs = basicSetOwnedTemplateSignature(newOwnedTemplateSignature,
				msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.CLASSIFIER__OWNED_TEMPLATE_SIGNATURE,
				newOwnedTemplateSignature, newOwnedTemplateSignature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemplateSignature createOwnedTemplateSignature(EClass eClass) {
		TemplateSignature newOwnedTemplateSignature = (TemplateSignature) create(
			eClass);
		setOwnedTemplateSignature(newOwnedTemplateSignature);
		return newOwnedTemplateSignature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public TemplateSignature createOwnedTemplateSignature() {
		TemplateSignature newOwnedTemplateSignature = UMLFactory.eINSTANCE
			.createRedefinableTemplateSignature();
		setOwnedTemplateSignature(newOwnedTemplateSignature);
		return newOwnedTemplateSignature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOwnedTemplateSignature() {
		return ownedTemplateSignature != null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Feature> getFeatures() {
		CacheAdapter cache = getCacheAdapter();
		if (cache != null) {
			Resource eResource = eResource();
			@SuppressWarnings("unchecked")
			EList<Feature> features = (EList<Feature>) cache.get(eResource,
				this, UMLPackage.Literals.CLASSIFIER__FEATURE);
			if (features == null) {
				cache.put(eResource, this,
					UMLPackage.Literals.CLASSIFIER__FEATURE,
					features = new DerivedUnionEObjectEList<Feature>(
						Feature.class, this, UMLPackage.CLASSIFIER__FEATURE,
						FEATURE_ESUBSETS));
			}
			return features;
		}
		return new DerivedUnionEObjectEList<Feature>(Feature.class, this,
			UMLPackage.CLASSIFIER__FEATURE, FEATURE_ESUBSETS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<NamedElement> getMembers() {
		CacheAdapter cache = getCacheAdapter();
		if (cache != null) {
			Resource eResource = eResource();
			@SuppressWarnings("unchecked")
			EList<NamedElement> members = (EList<NamedElement>) cache
				.get(eResource, this, UMLPackage.Literals.NAMESPACE__MEMBER);
			if (members == null) {
				cache.put(eResource, this,
					UMLPackage.Literals.NAMESPACE__MEMBER,
					members = new DerivedUnionEObjectEList<NamedElement>(
						NamedElement.class, this, UMLPackage.CLASSIFIER__MEMBER,
						MEMBER_ESUBSETS));
			}
			return members;
		}
		return new DerivedUnionEObjectEList<NamedElement>(NamedElement.class,
			this, UMLPackage.CLASSIFIER__MEMBER, MEMBER_ESUBSETS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<NamedElement> getOwnedMembers() {
		CacheAdapter cache = getCacheAdapter();
		if (cache != null) {
			Resource eResource = eResource();
			@SuppressWarnings("unchecked")
			EList<NamedElement> ownedMembers = (EList<NamedElement>) cache.get(
				eResource, this, UMLPackage.Literals.NAMESPACE__OWNED_MEMBER);
			if (ownedMembers == null) {
				cache.put(eResource, this,
					UMLPackage.Literals.NAMESPACE__OWNED_MEMBER,
					ownedMembers = new DerivedUnionEObjectEList<NamedElement>(
						NamedElement.class, this,
						UMLPackage.CLASSIFIER__OWNED_MEMBER,
						OWNED_MEMBER_ESUBSETS));
			}
			return ownedMembers;
		}
		return new DerivedUnionEObjectEList<NamedElement>(NamedElement.class,
			this, UMLPackage.CLASSIFIER__OWNED_MEMBER, OWNED_MEMBER_ESUBSETS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Property> getAttributes() {
		CacheAdapter cache = getCacheAdapter();
		if (cache != null) {
			Resource eResource = eResource();
			@SuppressWarnings("unchecked")
			EList<Property> attributes = (EList<Property>) cache.get(eResource,
				this, UMLPackage.Literals.CLASSIFIER__ATTRIBUTE);
			if (attributes == null) {
				cache.put(eResource, this,
					UMLPackage.Literals.CLASSIFIER__ATTRIBUTE,
					attributes = new DerivedUnionEObjectEList<Property>(
						Property.class, this, UMLPackage.CLASSIFIER__ATTRIBUTE,
						null));
			}
			return attributes;
		}
		return new DerivedUnionEObjectEList<Property>(Property.class, this,
			UMLPackage.CLASSIFIER__ATTRIBUTE, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property getAttribute(String name, Type type) {
		return getAttribute(name, type, false, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property getAttribute(String name, Type type, boolean ignoreCase,
			EClass eClass) {
		attributeLoop : for (Property attribute : getAttributes()) {
			if (eClass != null && !eClass.isInstance(attribute))
				continue attributeLoop;
			if (name != null && !(ignoreCase
				? name.equalsIgnoreCase(attribute.getName())
				: name.equals(attribute.getName())))
				continue attributeLoop;
			if (type != null && !type.equals(attribute.getType()))
				continue attributeLoop;
			return attribute;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CollaborationUse> getCollaborationUses() {
		if (collaborationUses == null) {
			collaborationUses = new SubsetSupersetEObjectContainmentEList.Resolving<CollaborationUse>(
				CollaborationUse.class, this,
				UMLPackage.CLASSIFIER__COLLABORATION_USE, null,
				COLLABORATION_USE_ESUBSETS);
		}
		return collaborationUses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAbstract() {
		return (eFlags & IS_ABSTRACT_EFLAG) != 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsAbstract(boolean newIsAbstract) {
		boolean oldIsAbstract = (eFlags & IS_ABSTRACT_EFLAG) != 0;
		if (newIsAbstract)
			eFlags |= IS_ABSTRACT_EFLAG;
		else
			eFlags &= ~IS_ABSTRACT_EFLAG;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.CLASSIFIER__IS_ABSTRACT, oldIsAbstract,
				newIsAbstract));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isFinalSpecialization() {
		return (eFlags & IS_FINAL_SPECIALIZATION_EFLAG) != 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsFinalSpecialization(boolean newIsFinalSpecialization) {
		boolean oldIsFinalSpecialization = (eFlags
			& IS_FINAL_SPECIALIZATION_EFLAG) != 0;
		if (newIsFinalSpecialization)
			eFlags |= IS_FINAL_SPECIALIZATION_EFLAG;
		else
			eFlags &= ~IS_FINAL_SPECIALIZATION_EFLAG;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.CLASSIFIER__IS_FINAL_SPECIALIZATION,
				oldIsFinalSpecialization, newIsFinalSpecialization));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Generalization> getGeneralizations() {
		if (generalizations == null) {
			generalizations = new EObjectContainmentWithInverseEList.Resolving<Generalization>(
				Generalization.class, this,
				UMLPackage.CLASSIFIER__GENERALIZATION,
				UMLPackage.GENERALIZATION__SPECIFIC);
		}
		return generalizations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GeneralizationSet> getPowertypeExtents() {
		if (powertypeExtents == null) {
			powertypeExtents = new EObjectWithInverseResolvingEList<GeneralizationSet>(
				GeneralizationSet.class, this,
				UMLPackage.CLASSIFIER__POWERTYPE_EXTENT,
				UMLPackage.GENERALIZATION_SET__POWERTYPE);
		}
		return powertypeExtents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeneralizationSet getPowertypeExtent(String name) {
		return getPowertypeExtent(name, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeneralizationSet getPowertypeExtent(String name,
			boolean ignoreCase) {
		powertypeExtentLoop : for (GeneralizationSet powertypeExtent : getPowertypeExtents()) {
			if (name != null && !(ignoreCase
				? name.equalsIgnoreCase(powertypeExtent.getName())
				: name.equals(powertypeExtent.getName())))
				continue powertypeExtentLoop;
			return powertypeExtent;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NamedElement> getInheritedMembers() {
		CacheAdapter cache = getCacheAdapter();
		if (cache != null) {
			@SuppressWarnings("unchecked")
			EList<NamedElement> result = (EList<NamedElement>) cache.get(this,
				UMLPackage.Literals.CLASSIFIER__INHERITED_MEMBER);
			if (result == null) {
				cache.put(this,
					UMLPackage.Literals.CLASSIFIER__INHERITED_MEMBER,
					result = ClassifierOperations.getInheritedMembers(this));
			}
			return result;
		}
		return ClassifierOperations.getInheritedMembers(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamedElement getInheritedMember(String name) {
		return getInheritedMember(name, false, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamedElement getInheritedMember(String name, boolean ignoreCase,
			EClass eClass) {
		inheritedMemberLoop : for (NamedElement inheritedMember : getInheritedMembers()) {
			if (eClass != null && !eClass.isInstance(inheritedMember))
				continue inheritedMemberLoop;
			if (name != null && !(ignoreCase
				? name.equalsIgnoreCase(inheritedMember.getName())
				: name.equals(inheritedMember.getName())))
				continue inheritedMemberLoop;
			return inheritedMember;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Classifier> getRedefinedClassifiers() {
		if (redefinedClassifiers == null) {
			redefinedClassifiers = new EObjectResolvingEList<Classifier>(
				Classifier.class, this,
				UMLPackage.CLASSIFIER__REDEFINED_CLASSIFIER);
		}
		return redefinedClassifiers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Classifier getRedefinedClassifier(String name) {
		return getRedefinedClassifier(name, false, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Classifier getRedefinedClassifier(String name, boolean ignoreCase,
			EClass eClass) {
		redefinedClassifierLoop : for (Classifier redefinedClassifier : getRedefinedClassifiers()) {
			if (eClass != null && !eClass.isInstance(redefinedClassifier))
				continue redefinedClassifierLoop;
			if (name != null && !(ignoreCase
				? name.equalsIgnoreCase(redefinedClassifier.getName())
				: name.equals(redefinedClassifier.getName())))
				continue redefinedClassifierLoop;
			return redefinedClassifier;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Classifier> getGenerals() {
		CacheAdapter cache = getCacheAdapter();
		if (cache != null) {
			@SuppressWarnings("unchecked")
			EList<Classifier> result = (EList<Classifier>) cache.get(this,
				UMLPackage.Literals.CLASSIFIER__GENERAL);
			if (result == null) {
				cache.put(this, UMLPackage.Literals.CLASSIFIER__GENERAL,
					result = ClassifierOperations.getGenerals(this));
			}
			return result;
		}
		return ClassifierOperations.getGenerals(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Classifier getGeneral(String name) {
		return getGeneral(name, false, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Classifier getGeneral(String name, boolean ignoreCase,
			EClass eClass) {
		generalLoop : for (Classifier general : getGenerals()) {
			if (eClass != null && !eClass.isInstance(general))
				continue generalLoop;
			if (name != null && !(ignoreCase
				? name.equalsIgnoreCase(general.getName())
				: name.equals(general.getName())))
				continue generalLoop;
			return general;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UseCase> getOwnedUseCases() {
		if (ownedUseCases == null) {
			ownedUseCases = new EObjectContainmentEList.Resolving<UseCase>(
				UseCase.class, this, UMLPackage.CLASSIFIER__OWNED_USE_CASE);
		}
		return ownedUseCases;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UseCase createOwnedUseCase(String name) {
		UseCase newOwnedUseCase = (UseCase) create(
			UMLPackage.Literals.USE_CASE);
		getOwnedUseCases().add(newOwnedUseCase);
		if (name != null)
			newOwnedUseCase.setName(name);
		return newOwnedUseCase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UseCase getOwnedUseCase(String name) {
		return getOwnedUseCase(name, false, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UseCase getOwnedUseCase(String name, boolean ignoreCase,
			boolean createOnDemand) {
		ownedUseCaseLoop : for (UseCase ownedUseCase : getOwnedUseCases()) {
			if (name != null && !(ignoreCase
				? name.equalsIgnoreCase(ownedUseCase.getName())
				: name.equals(ownedUseCase.getName())))
				continue ownedUseCaseLoop;
			return ownedUseCase;
		}
		return createOnDemand
			? createOwnedUseCase(name)
			: null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UseCase> getUseCases() {
		if (useCases == null) {
			useCases = new EObjectWithInverseResolvingEList.ManyInverse<UseCase>(
				UseCase.class, this, UMLPackage.CLASSIFIER__USE_CASE,
				UMLPackage.USE_CASE__SUBJECT);
		}
		return useCases;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UseCase getUseCase(String name) {
		return getUseCase(name, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UseCase getUseCase(String name, boolean ignoreCase) {
		useCaseLoop : for (UseCase useCase : getUseCases()) {
			if (name != null && !(ignoreCase
				? name.equalsIgnoreCase(useCase.getName())
				: name.equals(useCase.getName())))
				continue useCaseLoop;
			return useCase;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Substitution> getSubstitutions() {
		if (substitutions == null) {
			substitutions = new EObjectContainmentWithInverseEList.Resolving<Substitution>(
				Substitution.class, this, UMLPackage.CLASSIFIER__SUBSTITUTION,
				UMLPackage.SUBSTITUTION__SUBSTITUTING_CLASSIFIER);
		}
		return substitutions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CollaborationUse getRepresentation() {
		if (representation != null && representation.eIsProxy()) {
			InternalEObject oldRepresentation = (InternalEObject) representation;
			representation = (CollaborationUse) eResolveProxy(
				oldRepresentation);
			if (representation != oldRepresentation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
						UMLPackage.CLASSIFIER__REPRESENTATION,
						oldRepresentation, representation));
			}
		}
		return representation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CollaborationUse basicGetRepresentation() {
		return representation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRepresentation(CollaborationUse newRepresentation) {
		CollaborationUse oldRepresentation = representation;
		representation = newRepresentation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.CLASSIFIER__REPRESENTATION, oldRepresentation,
				representation));
		Resource.Internal eInternalResource = eInternalResource();
		if (eInternalResource == null || !eInternalResource.isLoading()) {
			if (newRepresentation != null) {
				EList<CollaborationUse> collaborationUses = getCollaborationUses();
				if (!collaborationUses.contains(newRepresentation)) {
					collaborationUses.add(newRepresentation);
				}
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CollaborationUse createRepresentation(String name) {
		CollaborationUse newRepresentation = (CollaborationUse) create(
			UMLPackage.Literals.COLLABORATION_USE);
		setRepresentation(newRepresentation);
		if (name != null)
			newRepresentation.setName(name);
		return newRepresentation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRedefinitionContextValid(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return RedefinableElementOperations
			.validateRedefinitionContextValid(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRedefinitionConsistent(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return RedefinableElementOperations.validateRedefinitionConsistent(this,
			diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNonLeafRedefinition(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return RedefinableElementOperations.validateNonLeafRedefinition(this,
			diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isRedefinitionContextValid(
			RedefinableElement redefinedElement) {
		return RedefinableElementOperations.isRedefinitionContextValid(this,
			redefinedElement);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isConsistentWith(RedefinableElement redefiningElement) {
		return RedefinableElementOperations.isConsistentWith(this,
			redefiningElement);
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
	public boolean validateNamespaceNeedsVisibility(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PackageableElementOperations
			.validateNamespaceNeedsVisibility(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Association createAssociation(boolean end1IsNavigable,
			AggregationKind end1Aggregation, String end1Name, int end1Lower,
			int end1Upper, Type end1Type, boolean end2IsNavigable,
			AggregationKind end2Aggregation, String end2Name, int end2Lower,
			int end2Upper) {
		return TypeOperations.createAssociation(this, end1IsNavigable,
			end1Aggregation, end1Name, end1Lower, end1Upper, end1Type,
			end2IsNavigable, end2Aggregation, end2Name, end2Lower, end2Upper);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Association> getAssociations() {
		CacheAdapter cache = getCacheAdapter();
		if (cache != null) {
			@SuppressWarnings("unchecked")
			EList<Association> result = (EList<Association>) cache.get(this,
				UMLPackage.Literals.TYPE___GET_ASSOCIATIONS);
			if (result == null) {
				cache.put(this, UMLPackage.Literals.TYPE___GET_ASSOCIATIONS,
					result = TypeOperations.getAssociations(this));
			}
			return result;
		}
		return TypeOperations.getAssociations(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ParameterableElement> parameterableElements() {
		CacheAdapter cache = getCacheAdapter();
		if (cache != null) {
			@SuppressWarnings("unchecked")
			EList<ParameterableElement> result = (EList<ParameterableElement>) cache
				.get(this,
					UMLPackage.Literals.TEMPLATEABLE_ELEMENT___PARAMETERABLE_ELEMENTS);
			if (result == null) {
				cache.put(this,
					UMLPackage.Literals.TEMPLATEABLE_ELEMENT___PARAMETERABLE_ELEMENTS,
					result = TemplateableElementOperations
						.parameterableElements(this));
			}
			return result;
		}
		return TemplateableElementOperations.parameterableElements(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isTemplate() {
		return ClassifierOperations.isTemplate(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNoCyclesInGeneralization(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ClassifierOperations.validateNoCyclesInGeneralization(this,
			diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSpecializeType(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ClassifierOperations.validateSpecializeType(this, diagnostics,
			context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMapsToGeneralizationSet(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ClassifierOperations.validateMapsToGeneralizationSet(this,
			diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNonFinalParents(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ClassifierOperations.validateNonFinalParents(this, diagnostics,
			context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Generalization createGeneralization(Classifier general) {
		Generalization newGeneralization = (Generalization) create(
			UMLPackage.Literals.GENERALIZATION);
		getGeneralizations().add(newGeneralization);
		if (general != null)
			newGeneralization.setGeneral(general);
		return newGeneralization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Generalization getGeneralization(Classifier general) {
		return getGeneralization(general, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Generalization getGeneralization(Classifier general,
			boolean createOnDemand) {
		generalizationLoop : for (Generalization generalization : getGeneralizations()) {
			if (general != null && !general.equals(generalization.getGeneral()))
				continue generalizationLoop;
			return generalization;
		}
		return createOnDemand
			? createGeneralization(general)
			: null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Property> getAllAttributes() {
		CacheAdapter cache = getCacheAdapter();
		if (cache != null) {
			@SuppressWarnings("unchecked")
			EList<Property> result = (EList<Property>) cache.get(this,
				UMLPackage.Literals.CLASSIFIER___GET_ALL_ATTRIBUTES);
			if (result == null) {
				cache.put(this,
					UMLPackage.Literals.CLASSIFIER___GET_ALL_ATTRIBUTES,
					result = ClassifierOperations.getAllAttributes(this));
			}
			return result;
		}
		return ClassifierOperations.getAllAttributes(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Operation> getOperations() {
		CacheAdapter cache = getCacheAdapter();
		if (cache != null) {
			@SuppressWarnings("unchecked")
			EList<Operation> result = (EList<Operation>) cache.get(this,
				UMLPackage.Literals.CLASSIFIER___GET_OPERATIONS);
			if (result == null) {
				cache.put(this, UMLPackage.Literals.CLASSIFIER___GET_OPERATIONS,
					result = ClassifierOperations.getOperations(this));
			}
			return result;
		}
		return ClassifierOperations.getOperations(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Operation> getAllOperations() {
		CacheAdapter cache = getCacheAdapter();
		if (cache != null) {
			@SuppressWarnings("unchecked")
			EList<Operation> result = (EList<Operation>) cache.get(this,
				UMLPackage.Literals.CLASSIFIER___GET_ALL_OPERATIONS);
			if (result == null) {
				cache.put(this,
					UMLPackage.Literals.CLASSIFIER___GET_ALL_OPERATIONS,
					result = ClassifierOperations.getAllOperations(this));
			}
			return result;
		}
		return ClassifierOperations.getAllOperations(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operation getOperation(String name, EList<String> parameterNames,
			EList<Type> parameterTypes) {
		return ClassifierOperations.getOperation(this, name, parameterNames,
			parameterTypes);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operation getOperation(String name, EList<String> parameterNames,
			EList<Type> parameterTypes, boolean ignoreCase) {
		return ClassifierOperations.getOperation(this, name, parameterNames,
			parameterTypes, ignoreCase);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Interface> getUsedInterfaces() {
		CacheAdapter cache = getCacheAdapter();
		if (cache != null) {
			@SuppressWarnings("unchecked")
			EList<Interface> result = (EList<Interface>) cache.get(this,
				UMLPackage.Literals.CLASSIFIER___GET_USED_INTERFACES);
			if (result == null) {
				cache.put(this,
					UMLPackage.Literals.CLASSIFIER___GET_USED_INTERFACES,
					result = ClassifierOperations.getUsedInterfaces(this));
			}
			return result;
		}
		return ClassifierOperations.getUsedInterfaces(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Interface> getAllUsedInterfaces() {
		CacheAdapter cache = getCacheAdapter();
		if (cache != null) {
			@SuppressWarnings("unchecked")
			EList<Interface> result = (EList<Interface>) cache.get(this,
				UMLPackage.Literals.CLASSIFIER___GET_ALL_USED_INTERFACES);
			if (result == null) {
				cache.put(this,
					UMLPackage.Literals.CLASSIFIER___GET_ALL_USED_INTERFACES,
					result = ClassifierOperations.getAllUsedInterfaces(this));
			}
			return result;
		}
		return ClassifierOperations.getAllUsedInterfaces(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean maySpecializeType(Classifier c) {
		return ClassifierOperations.maySpecializeType(this, c);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Feature> allFeatures() {
		CacheAdapter cache = getCacheAdapter();
		if (cache != null) {
			@SuppressWarnings("unchecked")
			EList<Feature> result = (EList<Feature>) cache.get(this,
				UMLPackage.Literals.CLASSIFIER___ALL_FEATURES);
			if (result == null) {
				cache.put(this, UMLPackage.Literals.CLASSIFIER___ALL_FEATURES,
					result = ClassifierOperations.allFeatures(this));
			}
			return result;
		}
		return ClassifierOperations.allFeatures(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Classifier> parents() {
		CacheAdapter cache = getCacheAdapter();
		if (cache != null) {
			@SuppressWarnings("unchecked")
			EList<Classifier> result = (EList<Classifier>) cache.get(this,
				UMLPackage.Literals.CLASSIFIER___PARENTS);
			if (result == null) {
				cache.put(this, UMLPackage.Literals.CLASSIFIER___PARENTS,
					result = ClassifierOperations.parents(this));
			}
			return result;
		}
		return ClassifierOperations.parents(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Interface> directlyRealizedInterfaces() {
		CacheAdapter cache = getCacheAdapter();
		if (cache != null) {
			@SuppressWarnings("unchecked")
			EList<Interface> result = (EList<Interface>) cache.get(this,
				UMLPackage.Literals.CLASSIFIER___DIRECTLY_REALIZED_INTERFACES);
			if (result == null) {
				cache.put(this,
					UMLPackage.Literals.CLASSIFIER___DIRECTLY_REALIZED_INTERFACES,
					result = ClassifierOperations
						.directlyRealizedInterfaces(this));
			}
			return result;
		}
		return ClassifierOperations.directlyRealizedInterfaces(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Interface> directlyUsedInterfaces() {
		CacheAdapter cache = getCacheAdapter();
		if (cache != null) {
			@SuppressWarnings("unchecked")
			EList<Interface> result = (EList<Interface>) cache.get(this,
				UMLPackage.Literals.CLASSIFIER___DIRECTLY_USED_INTERFACES);
			if (result == null) {
				cache.put(this,
					UMLPackage.Literals.CLASSIFIER___DIRECTLY_USED_INTERFACES,
					result = ClassifierOperations.directlyUsedInterfaces(this));
			}
			return result;
		}
		return ClassifierOperations.directlyUsedInterfaces(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Interface> allRealizedInterfaces() {
		CacheAdapter cache = getCacheAdapter();
		if (cache != null) {
			@SuppressWarnings("unchecked")
			EList<Interface> result = (EList<Interface>) cache.get(this,
				UMLPackage.Literals.CLASSIFIER___ALL_REALIZED_INTERFACES);
			if (result == null) {
				cache.put(this,
					UMLPackage.Literals.CLASSIFIER___ALL_REALIZED_INTERFACES,
					result = ClassifierOperations.allRealizedInterfaces(this));
			}
			return result;
		}
		return ClassifierOperations.allRealizedInterfaces(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Interface> allUsedInterfaces() {
		CacheAdapter cache = getCacheAdapter();
		if (cache != null) {
			@SuppressWarnings("unchecked")
			EList<Interface> result = (EList<Interface>) cache.get(this,
				UMLPackage.Literals.CLASSIFIER___ALL_USED_INTERFACES);
			if (result == null) {
				cache.put(this,
					UMLPackage.Literals.CLASSIFIER___ALL_USED_INTERFACES,
					result = ClassifierOperations.allUsedInterfaces(this));
			}
			return result;
		}
		return ClassifierOperations.allUsedInterfaces(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSubstitutableFor(Classifier contract) {
		return ClassifierOperations.isSubstitutableFor(this, contract);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Property> allAttributes() {
		CacheAdapter cache = getCacheAdapter();
		if (cache != null) {
			@SuppressWarnings("unchecked")
			EList<Property> result = (EList<Property>) cache.get(this,
				UMLPackage.Literals.CLASSIFIER___ALL_ATTRIBUTES);
			if (result == null) {
				cache.put(this, UMLPackage.Literals.CLASSIFIER___ALL_ATTRIBUTES,
					result = ClassifierOperations.allAttributes(this));
			}
			return result;
		}
		return ClassifierOperations.allAttributes(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<StructuralFeature> allSlottableFeatures() {
		CacheAdapter cache = getCacheAdapter();
		if (cache != null) {
			@SuppressWarnings("unchecked")
			EList<StructuralFeature> result = (EList<StructuralFeature>) cache
				.get(this,
					UMLPackage.Literals.CLASSIFIER___ALL_SLOTTABLE_FEATURES);
			if (result == null) {
				cache.put(this,
					UMLPackage.Literals.CLASSIFIER___ALL_SLOTTABLE_FEATURES,
					result = ClassifierOperations.allSlottableFeatures(this));
			}
			return result;
		}
		return ClassifierOperations.allSlottableFeatures(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NamedElement> inheritableMembers(Classifier c) {
		return ClassifierOperations.inheritableMembers(this, c);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean hasVisibilityOf(NamedElement n) {
		return ClassifierOperations.hasVisibilityOf(this, n);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NamedElement> inherit(EList<NamedElement> inhs) {
		return ClassifierOperations.inherit(this, inhs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Classifier> allParents() {
		CacheAdapter cache = getCacheAdapter();
		if (cache != null) {
			@SuppressWarnings("unchecked")
			EList<Classifier> result = (EList<Classifier>) cache.get(this,
				UMLPackage.Literals.CLASSIFIER___ALL_PARENTS);
			if (result == null) {
				cache.put(this, UMLPackage.Literals.CLASSIFIER___ALL_PARENTS,
					result = ClassifierOperations.allParents(this));
			}
			return result;
		}
		return ClassifierOperations.allParents(this);
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
			case UMLPackage.CLASSIFIER__EANNOTATIONS :
				return ((InternalEList<InternalEObject>) (InternalEList<?>) getEAnnotations())
					.basicAdd(otherEnd, msgs);
			case UMLPackage.CLASSIFIER__OWNED_RULE :
				return ((InternalEList<InternalEObject>) (InternalEList<?>) getOwnedRules())
					.basicAdd(otherEnd, msgs);
			case UMLPackage.CLASSIFIER__ELEMENT_IMPORT :
				return ((InternalEList<InternalEObject>) (InternalEList<?>) getElementImports())
					.basicAdd(otherEnd, msgs);
			case UMLPackage.CLASSIFIER__PACKAGE_IMPORT :
				return ((InternalEList<InternalEObject>) (InternalEList<?>) getPackageImports())
					.basicAdd(otherEnd, msgs);
			case UMLPackage.CLASSIFIER__OWNING_TEMPLATE_PARAMETER :
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOwningTemplateParameter(
					(TemplateParameter) otherEnd, msgs);
			case UMLPackage.CLASSIFIER__TEMPLATE_PARAMETER :
				if (templateParameter != null)
					msgs = ((InternalEObject) templateParameter).eInverseRemove(
						this,
						UMLPackage.TEMPLATE_PARAMETER__PARAMETERED_ELEMENT,
						TemplateParameter.class, msgs);
				return basicSetTemplateParameter((TemplateParameter) otherEnd,
					msgs);
			case UMLPackage.CLASSIFIER__TEMPLATE_BINDING :
				return ((InternalEList<InternalEObject>) (InternalEList<?>) getTemplateBindings())
					.basicAdd(otherEnd, msgs);
			case UMLPackage.CLASSIFIER__OWNED_TEMPLATE_SIGNATURE :
				if (ownedTemplateSignature != null)
					msgs = ((InternalEObject) ownedTemplateSignature)
						.eInverseRemove(this,
							EOPPOSITE_FEATURE_BASE
								- UMLPackage.CLASSIFIER__OWNED_TEMPLATE_SIGNATURE,
							null, msgs);
				return basicSetOwnedTemplateSignature(
					(TemplateSignature) otherEnd, msgs);
			case UMLPackage.CLASSIFIER__GENERALIZATION :
				return ((InternalEList<InternalEObject>) (InternalEList<?>) getGeneralizations())
					.basicAdd(otherEnd, msgs);
			case UMLPackage.CLASSIFIER__POWERTYPE_EXTENT :
				return ((InternalEList<InternalEObject>) (InternalEList<?>) getPowertypeExtents())
					.basicAdd(otherEnd, msgs);
			case UMLPackage.CLASSIFIER__USE_CASE :
				return ((InternalEList<InternalEObject>) (InternalEList<?>) getUseCases())
					.basicAdd(otherEnd, msgs);
			case UMLPackage.CLASSIFIER__SUBSTITUTION :
				return ((InternalEList<InternalEObject>) (InternalEList<?>) getSubstitutions())
					.basicAdd(otherEnd, msgs);
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
			case UMLPackage.CLASSIFIER__EANNOTATIONS :
				return ((InternalEList<?>) getEAnnotations())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.CLASSIFIER__OWNED_COMMENT :
				return ((InternalEList<?>) getOwnedComments())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.CLASSIFIER__NAME_EXPRESSION :
				return basicSetNameExpression(null, msgs);
			case UMLPackage.CLASSIFIER__OWNED_RULE :
				return ((InternalEList<?>) getOwnedRules())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.CLASSIFIER__ELEMENT_IMPORT :
				return ((InternalEList<?>) getElementImports())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.CLASSIFIER__PACKAGE_IMPORT :
				return ((InternalEList<?>) getPackageImports())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.CLASSIFIER__OWNING_TEMPLATE_PARAMETER :
				return basicSetOwningTemplateParameter(null, msgs);
			case UMLPackage.CLASSIFIER__TEMPLATE_PARAMETER :
				return basicSetTemplateParameter(null, msgs);
			case UMLPackage.CLASSIFIER__TEMPLATE_BINDING :
				return ((InternalEList<?>) getTemplateBindings())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.CLASSIFIER__OWNED_TEMPLATE_SIGNATURE :
				return basicSetOwnedTemplateSignature(null, msgs);
			case UMLPackage.CLASSIFIER__COLLABORATION_USE :
				return ((InternalEList<?>) getCollaborationUses())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.CLASSIFIER__GENERALIZATION :
				return ((InternalEList<?>) getGeneralizations())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.CLASSIFIER__POWERTYPE_EXTENT :
				return ((InternalEList<?>) getPowertypeExtents())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.CLASSIFIER__OWNED_USE_CASE :
				return ((InternalEList<?>) getOwnedUseCases())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.CLASSIFIER__USE_CASE :
				return ((InternalEList<?>) getUseCases()).basicRemove(otherEnd,
					msgs);
			case UMLPackage.CLASSIFIER__SUBSTITUTION :
				return ((InternalEList<?>) getSubstitutions())
					.basicRemove(otherEnd, msgs);
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
			case UMLPackage.CLASSIFIER__OWNING_TEMPLATE_PARAMETER :
				return eInternalContainer().eInverseRemove(this,
					UMLPackage.TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT,
					TemplateParameter.class, msgs);
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
			case UMLPackage.CLASSIFIER__EANNOTATIONS :
				return getEAnnotations();
			case UMLPackage.CLASSIFIER__OWNED_COMMENT :
				return getOwnedComments();
			case UMLPackage.CLASSIFIER__OWNED_ELEMENT :
				return getOwnedElements();
			case UMLPackage.CLASSIFIER__OWNER :
				if (resolve)
					return getOwner();
				return basicGetOwner();
			case UMLPackage.CLASSIFIER__CLIENT_DEPENDENCY :
				return getClientDependencies();
			case UMLPackage.CLASSIFIER__NAME :
				return getName();
			case UMLPackage.CLASSIFIER__NAME_EXPRESSION :
				if (resolve)
					return getNameExpression();
				return basicGetNameExpression();
			case UMLPackage.CLASSIFIER__NAMESPACE :
				if (resolve)
					return getNamespace();
				return basicGetNamespace();
			case UMLPackage.CLASSIFIER__QUALIFIED_NAME :
				return getQualifiedName();
			case UMLPackage.CLASSIFIER__VISIBILITY :
				return getVisibility();
			case UMLPackage.CLASSIFIER__OWNED_RULE :
				return getOwnedRules();
			case UMLPackage.CLASSIFIER__ELEMENT_IMPORT :
				return getElementImports();
			case UMLPackage.CLASSIFIER__PACKAGE_IMPORT :
				return getPackageImports();
			case UMLPackage.CLASSIFIER__OWNED_MEMBER :
				return getOwnedMembers();
			case UMLPackage.CLASSIFIER__IMPORTED_MEMBER :
				return getImportedMembers();
			case UMLPackage.CLASSIFIER__MEMBER :
				return getMembers();
			case UMLPackage.CLASSIFIER__IS_LEAF :
				return isLeaf();
			case UMLPackage.CLASSIFIER__REDEFINED_ELEMENT :
				return getRedefinedElements();
			case UMLPackage.CLASSIFIER__REDEFINITION_CONTEXT :
				return getRedefinitionContexts();
			case UMLPackage.CLASSIFIER__OWNING_TEMPLATE_PARAMETER :
				if (resolve)
					return getOwningTemplateParameter();
				return basicGetOwningTemplateParameter();
			case UMLPackage.CLASSIFIER__TEMPLATE_PARAMETER :
				if (resolve)
					return getTemplateParameter();
				return basicGetTemplateParameter();
			case UMLPackage.CLASSIFIER__PACKAGE :
				if (resolve)
					return getPackage();
				return basicGetPackage();
			case UMLPackage.CLASSIFIER__TEMPLATE_BINDING :
				return getTemplateBindings();
			case UMLPackage.CLASSIFIER__OWNED_TEMPLATE_SIGNATURE :
				if (resolve)
					return getOwnedTemplateSignature();
				return basicGetOwnedTemplateSignature();
			case UMLPackage.CLASSIFIER__FEATURE :
				return getFeatures();
			case UMLPackage.CLASSIFIER__ATTRIBUTE :
				return getAttributes();
			case UMLPackage.CLASSIFIER__COLLABORATION_USE :
				return getCollaborationUses();
			case UMLPackage.CLASSIFIER__GENERAL :
				return getGenerals();
			case UMLPackage.CLASSIFIER__GENERALIZATION :
				return getGeneralizations();
			case UMLPackage.CLASSIFIER__POWERTYPE_EXTENT :
				return getPowertypeExtents();
			case UMLPackage.CLASSIFIER__INHERITED_MEMBER :
				return getInheritedMembers();
			case UMLPackage.CLASSIFIER__IS_ABSTRACT :
				return isAbstract();
			case UMLPackage.CLASSIFIER__IS_FINAL_SPECIALIZATION :
				return isFinalSpecialization();
			case UMLPackage.CLASSIFIER__OWNED_USE_CASE :
				return getOwnedUseCases();
			case UMLPackage.CLASSIFIER__USE_CASE :
				return getUseCases();
			case UMLPackage.CLASSIFIER__REDEFINED_CLASSIFIER :
				return getRedefinedClassifiers();
			case UMLPackage.CLASSIFIER__REPRESENTATION :
				if (resolve)
					return getRepresentation();
				return basicGetRepresentation();
			case UMLPackage.CLASSIFIER__SUBSTITUTION :
				return getSubstitutions();
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
			case UMLPackage.CLASSIFIER__EANNOTATIONS :
				getEAnnotations().clear();
				getEAnnotations()
					.addAll((Collection<? extends EAnnotation>) newValue);
				return;
			case UMLPackage.CLASSIFIER__OWNED_COMMENT :
				getOwnedComments().clear();
				getOwnedComments()
					.addAll((Collection<? extends Comment>) newValue);
				return;
			case UMLPackage.CLASSIFIER__NAME :
				setName((String) newValue);
				return;
			case UMLPackage.CLASSIFIER__NAME_EXPRESSION :
				setNameExpression((StringExpression) newValue);
				return;
			case UMLPackage.CLASSIFIER__VISIBILITY :
				setVisibility((VisibilityKind) newValue);
				return;
			case UMLPackage.CLASSIFIER__OWNED_RULE :
				getOwnedRules().clear();
				getOwnedRules()
					.addAll((Collection<? extends Constraint>) newValue);
				return;
			case UMLPackage.CLASSIFIER__ELEMENT_IMPORT :
				getElementImports().clear();
				getElementImports()
					.addAll((Collection<? extends ElementImport>) newValue);
				return;
			case UMLPackage.CLASSIFIER__PACKAGE_IMPORT :
				getPackageImports().clear();
				getPackageImports()
					.addAll((Collection<? extends PackageImport>) newValue);
				return;
			case UMLPackage.CLASSIFIER__IS_LEAF :
				setIsLeaf((Boolean) newValue);
				return;
			case UMLPackage.CLASSIFIER__OWNING_TEMPLATE_PARAMETER :
				setOwningTemplateParameter((TemplateParameter) newValue);
				return;
			case UMLPackage.CLASSIFIER__TEMPLATE_PARAMETER :
				setTemplateParameter((TemplateParameter) newValue);
				return;
			case UMLPackage.CLASSIFIER__PACKAGE :
				setPackage((org.eclipse.uml2.uml.Package) newValue);
				return;
			case UMLPackage.CLASSIFIER__TEMPLATE_BINDING :
				getTemplateBindings().clear();
				getTemplateBindings()
					.addAll((Collection<? extends TemplateBinding>) newValue);
				return;
			case UMLPackage.CLASSIFIER__OWNED_TEMPLATE_SIGNATURE :
				setOwnedTemplateSignature((TemplateSignature) newValue);
				return;
			case UMLPackage.CLASSIFIER__COLLABORATION_USE :
				getCollaborationUses().clear();
				getCollaborationUses()
					.addAll((Collection<? extends CollaborationUse>) newValue);
				return;
			case UMLPackage.CLASSIFIER__GENERAL :
				getGenerals().clear();
				getGenerals()
					.addAll((Collection<? extends Classifier>) newValue);
				return;
			case UMLPackage.CLASSIFIER__GENERALIZATION :
				getGeneralizations().clear();
				getGeneralizations()
					.addAll((Collection<? extends Generalization>) newValue);
				return;
			case UMLPackage.CLASSIFIER__POWERTYPE_EXTENT :
				getPowertypeExtents().clear();
				getPowertypeExtents()
					.addAll((Collection<? extends GeneralizationSet>) newValue);
				return;
			case UMLPackage.CLASSIFIER__IS_ABSTRACT :
				setIsAbstract((Boolean) newValue);
				return;
			case UMLPackage.CLASSIFIER__IS_FINAL_SPECIALIZATION :
				setIsFinalSpecialization((Boolean) newValue);
				return;
			case UMLPackage.CLASSIFIER__OWNED_USE_CASE :
				getOwnedUseCases().clear();
				getOwnedUseCases()
					.addAll((Collection<? extends UseCase>) newValue);
				return;
			case UMLPackage.CLASSIFIER__USE_CASE :
				getUseCases().clear();
				getUseCases().addAll((Collection<? extends UseCase>) newValue);
				return;
			case UMLPackage.CLASSIFIER__REDEFINED_CLASSIFIER :
				getRedefinedClassifiers().clear();
				getRedefinedClassifiers()
					.addAll((Collection<? extends Classifier>) newValue);
				return;
			case UMLPackage.CLASSIFIER__REPRESENTATION :
				setRepresentation((CollaborationUse) newValue);
				return;
			case UMLPackage.CLASSIFIER__SUBSTITUTION :
				getSubstitutions().clear();
				getSubstitutions()
					.addAll((Collection<? extends Substitution>) newValue);
				return;
		}
		eDynamicSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case UMLPackage.CLASSIFIER__EANNOTATIONS :
				getEAnnotations().clear();
				return;
			case UMLPackage.CLASSIFIER__OWNED_COMMENT :
				getOwnedComments().clear();
				return;
			case UMLPackage.CLASSIFIER__NAME :
				unsetName();
				return;
			case UMLPackage.CLASSIFIER__NAME_EXPRESSION :
				setNameExpression((StringExpression) null);
				return;
			case UMLPackage.CLASSIFIER__VISIBILITY :
				unsetVisibility();
				return;
			case UMLPackage.CLASSIFIER__OWNED_RULE :
				getOwnedRules().clear();
				return;
			case UMLPackage.CLASSIFIER__ELEMENT_IMPORT :
				getElementImports().clear();
				return;
			case UMLPackage.CLASSIFIER__PACKAGE_IMPORT :
				getPackageImports().clear();
				return;
			case UMLPackage.CLASSIFIER__IS_LEAF :
				setIsLeaf(IS_LEAF_EDEFAULT);
				return;
			case UMLPackage.CLASSIFIER__OWNING_TEMPLATE_PARAMETER :
				setOwningTemplateParameter((TemplateParameter) null);
				return;
			case UMLPackage.CLASSIFIER__TEMPLATE_PARAMETER :
				setTemplateParameter((TemplateParameter) null);
				return;
			case UMLPackage.CLASSIFIER__PACKAGE :
				setPackage((org.eclipse.uml2.uml.Package) null);
				return;
			case UMLPackage.CLASSIFIER__TEMPLATE_BINDING :
				getTemplateBindings().clear();
				return;
			case UMLPackage.CLASSIFIER__OWNED_TEMPLATE_SIGNATURE :
				setOwnedTemplateSignature((TemplateSignature) null);
				return;
			case UMLPackage.CLASSIFIER__COLLABORATION_USE :
				getCollaborationUses().clear();
				return;
			case UMLPackage.CLASSIFIER__GENERAL :
				getGenerals().clear();
				return;
			case UMLPackage.CLASSIFIER__GENERALIZATION :
				getGeneralizations().clear();
				return;
			case UMLPackage.CLASSIFIER__POWERTYPE_EXTENT :
				getPowertypeExtents().clear();
				return;
			case UMLPackage.CLASSIFIER__IS_ABSTRACT :
				setIsAbstract(IS_ABSTRACT_EDEFAULT);
				return;
			case UMLPackage.CLASSIFIER__IS_FINAL_SPECIALIZATION :
				setIsFinalSpecialization(IS_FINAL_SPECIALIZATION_EDEFAULT);
				return;
			case UMLPackage.CLASSIFIER__OWNED_USE_CASE :
				getOwnedUseCases().clear();
				return;
			case UMLPackage.CLASSIFIER__USE_CASE :
				getUseCases().clear();
				return;
			case UMLPackage.CLASSIFIER__REDEFINED_CLASSIFIER :
				getRedefinedClassifiers().clear();
				return;
			case UMLPackage.CLASSIFIER__REPRESENTATION :
				setRepresentation((CollaborationUse) null);
				return;
			case UMLPackage.CLASSIFIER__SUBSTITUTION :
				getSubstitutions().clear();
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
			case UMLPackage.CLASSIFIER__EANNOTATIONS :
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UMLPackage.CLASSIFIER__OWNED_COMMENT :
				return ownedComments != null && !ownedComments.isEmpty();
			case UMLPackage.CLASSIFIER__OWNED_ELEMENT :
				return isSetOwnedElements();
			case UMLPackage.CLASSIFIER__OWNER :
				return isSetOwner();
			case UMLPackage.CLASSIFIER__CLIENT_DEPENDENCY :
				return !getClientDependencies().isEmpty();
			case UMLPackage.CLASSIFIER__NAME :
				return isSetName();
			case UMLPackage.CLASSIFIER__NAME_EXPRESSION :
				return nameExpression != null;
			case UMLPackage.CLASSIFIER__NAMESPACE :
				return isSetNamespace();
			case UMLPackage.CLASSIFIER__QUALIFIED_NAME :
				return QUALIFIED_NAME_EDEFAULT == null
					? getQualifiedName() != null
					: !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case UMLPackage.CLASSIFIER__VISIBILITY :
				return isSetVisibility();
			case UMLPackage.CLASSIFIER__OWNED_RULE :
				return ownedRules != null && !ownedRules.isEmpty();
			case UMLPackage.CLASSIFIER__ELEMENT_IMPORT :
				return elementImports != null && !elementImports.isEmpty();
			case UMLPackage.CLASSIFIER__PACKAGE_IMPORT :
				return packageImports != null && !packageImports.isEmpty();
			case UMLPackage.CLASSIFIER__OWNED_MEMBER :
				return isSetOwnedMembers();
			case UMLPackage.CLASSIFIER__IMPORTED_MEMBER :
				return !getImportedMembers().isEmpty();
			case UMLPackage.CLASSIFIER__MEMBER :
				return isSetMembers();
			case UMLPackage.CLASSIFIER__IS_LEAF :
				return ((eFlags & IS_LEAF_EFLAG) != 0) != IS_LEAF_EDEFAULT;
			case UMLPackage.CLASSIFIER__REDEFINED_ELEMENT :
				return isSetRedefinedElements();
			case UMLPackage.CLASSIFIER__REDEFINITION_CONTEXT :
				return isSetRedefinitionContexts();
			case UMLPackage.CLASSIFIER__OWNING_TEMPLATE_PARAMETER :
				return basicGetOwningTemplateParameter() != null;
			case UMLPackage.CLASSIFIER__TEMPLATE_PARAMETER :
				return isSetTemplateParameter();
			case UMLPackage.CLASSIFIER__PACKAGE :
				return basicGetPackage() != null;
			case UMLPackage.CLASSIFIER__TEMPLATE_BINDING :
				return templateBindings != null && !templateBindings.isEmpty();
			case UMLPackage.CLASSIFIER__OWNED_TEMPLATE_SIGNATURE :
				return isSetOwnedTemplateSignature();
			case UMLPackage.CLASSIFIER__FEATURE :
				return isSetFeatures();
			case UMLPackage.CLASSIFIER__ATTRIBUTE :
				return isSetAttributes();
			case UMLPackage.CLASSIFIER__COLLABORATION_USE :
				return collaborationUses != null
					&& !collaborationUses.isEmpty();
			case UMLPackage.CLASSIFIER__GENERAL :
				return !getGenerals().isEmpty();
			case UMLPackage.CLASSIFIER__GENERALIZATION :
				return generalizations != null && !generalizations.isEmpty();
			case UMLPackage.CLASSIFIER__POWERTYPE_EXTENT :
				return powertypeExtents != null && !powertypeExtents.isEmpty();
			case UMLPackage.CLASSIFIER__INHERITED_MEMBER :
				return !getInheritedMembers().isEmpty();
			case UMLPackage.CLASSIFIER__IS_ABSTRACT :
				return ((eFlags
					& IS_ABSTRACT_EFLAG) != 0) != IS_ABSTRACT_EDEFAULT;
			case UMLPackage.CLASSIFIER__IS_FINAL_SPECIALIZATION :
				return ((eFlags
					& IS_FINAL_SPECIALIZATION_EFLAG) != 0) != IS_FINAL_SPECIALIZATION_EDEFAULT;
			case UMLPackage.CLASSIFIER__OWNED_USE_CASE :
				return ownedUseCases != null && !ownedUseCases.isEmpty();
			case UMLPackage.CLASSIFIER__USE_CASE :
				return useCases != null && !useCases.isEmpty();
			case UMLPackage.CLASSIFIER__REDEFINED_CLASSIFIER :
				return redefinedClassifiers != null
					&& !redefinedClassifiers.isEmpty();
			case UMLPackage.CLASSIFIER__REPRESENTATION :
				return representation != null;
			case UMLPackage.CLASSIFIER__SUBSTITUTION :
				return substitutions != null && !substitutions.isEmpty();
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
		if (baseClass == RedefinableElement.class) {
			switch (derivedFeatureID) {
				case UMLPackage.CLASSIFIER__IS_LEAF :
					return UMLPackage.REDEFINABLE_ELEMENT__IS_LEAF;
				case UMLPackage.CLASSIFIER__REDEFINED_ELEMENT :
					return UMLPackage.REDEFINABLE_ELEMENT__REDEFINED_ELEMENT;
				case UMLPackage.CLASSIFIER__REDEFINITION_CONTEXT :
					return UMLPackage.REDEFINABLE_ELEMENT__REDEFINITION_CONTEXT;
				default :
					return -1;
			}
		}
		if (baseClass == ParameterableElement.class) {
			switch (derivedFeatureID) {
				case UMLPackage.CLASSIFIER__OWNING_TEMPLATE_PARAMETER :
					return UMLPackage.PARAMETERABLE_ELEMENT__OWNING_TEMPLATE_PARAMETER;
				case UMLPackage.CLASSIFIER__TEMPLATE_PARAMETER :
					return UMLPackage.PARAMETERABLE_ELEMENT__TEMPLATE_PARAMETER;
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
		if (baseClass == Type.class) {
			switch (derivedFeatureID) {
				case UMLPackage.CLASSIFIER__PACKAGE :
					return UMLPackage.TYPE__PACKAGE;
				default :
					return -1;
			}
		}
		if (baseClass == TemplateableElement.class) {
			switch (derivedFeatureID) {
				case UMLPackage.CLASSIFIER__TEMPLATE_BINDING :
					return UMLPackage.TEMPLATEABLE_ELEMENT__TEMPLATE_BINDING;
				case UMLPackage.CLASSIFIER__OWNED_TEMPLATE_SIGNATURE :
					return UMLPackage.TEMPLATEABLE_ELEMENT__OWNED_TEMPLATE_SIGNATURE;
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
		if (baseClass == RedefinableElement.class) {
			switch (baseFeatureID) {
				case UMLPackage.REDEFINABLE_ELEMENT__IS_LEAF :
					return UMLPackage.CLASSIFIER__IS_LEAF;
				case UMLPackage.REDEFINABLE_ELEMENT__REDEFINED_ELEMENT :
					return UMLPackage.CLASSIFIER__REDEFINED_ELEMENT;
				case UMLPackage.REDEFINABLE_ELEMENT__REDEFINITION_CONTEXT :
					return UMLPackage.CLASSIFIER__REDEFINITION_CONTEXT;
				default :
					return -1;
			}
		}
		if (baseClass == ParameterableElement.class) {
			switch (baseFeatureID) {
				case UMLPackage.PARAMETERABLE_ELEMENT__OWNING_TEMPLATE_PARAMETER :
					return UMLPackage.CLASSIFIER__OWNING_TEMPLATE_PARAMETER;
				case UMLPackage.PARAMETERABLE_ELEMENT__TEMPLATE_PARAMETER :
					return UMLPackage.CLASSIFIER__TEMPLATE_PARAMETER;
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
		if (baseClass == Type.class) {
			switch (baseFeatureID) {
				case UMLPackage.TYPE__PACKAGE :
					return UMLPackage.CLASSIFIER__PACKAGE;
				default :
					return -1;
			}
		}
		if (baseClass == TemplateableElement.class) {
			switch (baseFeatureID) {
				case UMLPackage.TEMPLATEABLE_ELEMENT__TEMPLATE_BINDING :
					return UMLPackage.CLASSIFIER__TEMPLATE_BINDING;
				case UMLPackage.TEMPLATEABLE_ELEMENT__OWNED_TEMPLATE_SIGNATURE :
					return UMLPackage.CLASSIFIER__OWNED_TEMPLATE_SIGNATURE;
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
		if (baseClass == RedefinableElement.class) {
			switch (baseOperationID) {
				case UMLPackage.REDEFINABLE_ELEMENT___VALIDATE_REDEFINITION_CONSISTENT__DIAGNOSTICCHAIN_MAP :
					return UMLPackage.CLASSIFIER___VALIDATE_REDEFINITION_CONSISTENT__DIAGNOSTICCHAIN_MAP;
				case UMLPackage.REDEFINABLE_ELEMENT___VALIDATE_NON_LEAF_REDEFINITION__DIAGNOSTICCHAIN_MAP :
					return UMLPackage.CLASSIFIER___VALIDATE_NON_LEAF_REDEFINITION__DIAGNOSTICCHAIN_MAP;
				case UMLPackage.REDEFINABLE_ELEMENT___VALIDATE_REDEFINITION_CONTEXT_VALID__DIAGNOSTICCHAIN_MAP :
					return UMLPackage.CLASSIFIER___VALIDATE_REDEFINITION_CONTEXT_VALID__DIAGNOSTICCHAIN_MAP;
				case UMLPackage.REDEFINABLE_ELEMENT___IS_CONSISTENT_WITH__REDEFINABLEELEMENT :
					return UMLPackage.CLASSIFIER___IS_CONSISTENT_WITH__REDEFINABLEELEMENT;
				case UMLPackage.REDEFINABLE_ELEMENT___IS_REDEFINITION_CONTEXT_VALID__REDEFINABLEELEMENT :
					return UMLPackage.CLASSIFIER___IS_REDEFINITION_CONTEXT_VALID__REDEFINABLEELEMENT;
				default :
					return -1;
			}
		}
		if (baseClass == ParameterableElement.class) {
			switch (baseOperationID) {
				case UMLPackage.PARAMETERABLE_ELEMENT___IS_COMPATIBLE_WITH__PARAMETERABLEELEMENT :
					return UMLPackage.CLASSIFIER___IS_COMPATIBLE_WITH__PARAMETERABLEELEMENT;
				case UMLPackage.PARAMETERABLE_ELEMENT___IS_TEMPLATE_PARAMETER :
					return UMLPackage.CLASSIFIER___IS_TEMPLATE_PARAMETER;
				default :
					return -1;
			}
		}
		if (baseClass == PackageableElement.class) {
			switch (baseOperationID) {
				case UMLPackage.PACKAGEABLE_ELEMENT___VALIDATE_NAMESPACE_NEEDS_VISIBILITY__DIAGNOSTICCHAIN_MAP :
					return UMLPackage.CLASSIFIER___VALIDATE_NAMESPACE_NEEDS_VISIBILITY__DIAGNOSTICCHAIN_MAP;
				default :
					return -1;
			}
		}
		if (baseClass == Type.class) {
			switch (baseOperationID) {
				case UMLPackage.TYPE___CREATE_ASSOCIATION__BOOLEAN_AGGREGATIONKIND_STRING_INT_INT_TYPE_BOOLEAN_AGGREGATIONKIND_STRING_INT_INT :
					return UMLPackage.CLASSIFIER___CREATE_ASSOCIATION__BOOLEAN_AGGREGATIONKIND_STRING_INT_INT_TYPE_BOOLEAN_AGGREGATIONKIND_STRING_INT_INT;
				case UMLPackage.TYPE___GET_ASSOCIATIONS :
					return UMLPackage.CLASSIFIER___GET_ASSOCIATIONS;
				case UMLPackage.TYPE___CONFORMS_TO__TYPE :
					return UMLPackage.CLASSIFIER___CONFORMS_TO__TYPE;
				default :
					return -1;
			}
		}
		if (baseClass == TemplateableElement.class) {
			switch (baseOperationID) {
				case UMLPackage.TEMPLATEABLE_ELEMENT___IS_TEMPLATE :
					return UMLPackage.CLASSIFIER___IS_TEMPLATE;
				case UMLPackage.TEMPLATEABLE_ELEMENT___PARAMETERABLE_ELEMENTS :
					return UMLPackage.CLASSIFIER___PARAMETERABLE_ELEMENTS;
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
			case UMLPackage.CLASSIFIER___GET_EANNOTATION__STRING :
				return getEAnnotation((String) arguments.get(0));
			case UMLPackage.CLASSIFIER___VALIDATE_HAS_OWNER__DIAGNOSTICCHAIN_MAP :
				return validateHasOwner((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.CLASSIFIER___VALIDATE_NOT_OWN_SELF__DIAGNOSTICCHAIN_MAP :
				return validateNotOwnSelf((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.CLASSIFIER___ADD_KEYWORD__STRING :
				return addKeyword((String) arguments.get(0));
			case UMLPackage.CLASSIFIER___APPLY_STEREOTYPE__STEREOTYPE :
				return applyStereotype((Stereotype) arguments.get(0));
			case UMLPackage.CLASSIFIER___CREATE_EANNOTATION__STRING :
				return createEAnnotation((String) arguments.get(0));
			case UMLPackage.CLASSIFIER___DESTROY :
				destroy();
				return null;
			case UMLPackage.CLASSIFIER___GET_KEYWORDS :
				return getKeywords();
			case UMLPackage.CLASSIFIER___GET_APPLICABLE_STEREOTYPE__STRING :
				return getApplicableStereotype((String) arguments.get(0));
			case UMLPackage.CLASSIFIER___GET_APPLICABLE_STEREOTYPES :
				return getApplicableStereotypes();
			case UMLPackage.CLASSIFIER___GET_APPLIED_STEREOTYPE__STRING :
				return getAppliedStereotype((String) arguments.get(0));
			case UMLPackage.CLASSIFIER___GET_APPLIED_STEREOTYPES :
				return getAppliedStereotypes();
			case UMLPackage.CLASSIFIER___GET_APPLIED_SUBSTEREOTYPE__STEREOTYPE_STRING :
				return getAppliedSubstereotype((Stereotype) arguments.get(0),
					(String) arguments.get(1));
			case UMLPackage.CLASSIFIER___GET_APPLIED_SUBSTEREOTYPES__STEREOTYPE :
				return getAppliedSubstereotypes((Stereotype) arguments.get(0));
			case UMLPackage.CLASSIFIER___GET_MODEL :
				return getModel();
			case UMLPackage.CLASSIFIER___GET_NEAREST_PACKAGE :
				return getNearestPackage();
			case UMLPackage.CLASSIFIER___GET_RELATIONSHIPS :
				return getRelationships();
			case UMLPackage.CLASSIFIER___GET_RELATIONSHIPS__ECLASS :
				return getRelationships((EClass) arguments.get(0));
			case UMLPackage.CLASSIFIER___GET_REQUIRED_STEREOTYPE__STRING :
				return getRequiredStereotype((String) arguments.get(0));
			case UMLPackage.CLASSIFIER___GET_REQUIRED_STEREOTYPES :
				return getRequiredStereotypes();
			case UMLPackage.CLASSIFIER___GET_SOURCE_DIRECTED_RELATIONSHIPS :
				return getSourceDirectedRelationships();
			case UMLPackage.CLASSIFIER___GET_SOURCE_DIRECTED_RELATIONSHIPS__ECLASS :
				return getSourceDirectedRelationships(
					(EClass) arguments.get(0));
			case UMLPackage.CLASSIFIER___GET_STEREOTYPE_APPLICATION__STEREOTYPE :
				return getStereotypeApplication((Stereotype) arguments.get(0));
			case UMLPackage.CLASSIFIER___GET_STEREOTYPE_APPLICATIONS :
				return getStereotypeApplications();
			case UMLPackage.CLASSIFIER___GET_TARGET_DIRECTED_RELATIONSHIPS :
				return getTargetDirectedRelationships();
			case UMLPackage.CLASSIFIER___GET_TARGET_DIRECTED_RELATIONSHIPS__ECLASS :
				return getTargetDirectedRelationships(
					(EClass) arguments.get(0));
			case UMLPackage.CLASSIFIER___GET_VALUE__STEREOTYPE_STRING :
				return getValue((Stereotype) arguments.get(0),
					(String) arguments.get(1));
			case UMLPackage.CLASSIFIER___HAS_KEYWORD__STRING :
				return hasKeyword((String) arguments.get(0));
			case UMLPackage.CLASSIFIER___HAS_VALUE__STEREOTYPE_STRING :
				return hasValue((Stereotype) arguments.get(0),
					(String) arguments.get(1));
			case UMLPackage.CLASSIFIER___IS_STEREOTYPE_APPLICABLE__STEREOTYPE :
				return isStereotypeApplicable((Stereotype) arguments.get(0));
			case UMLPackage.CLASSIFIER___IS_STEREOTYPE_APPLIED__STEREOTYPE :
				return isStereotypeApplied((Stereotype) arguments.get(0));
			case UMLPackage.CLASSIFIER___IS_STEREOTYPE_REQUIRED__STEREOTYPE :
				return isStereotypeRequired((Stereotype) arguments.get(0));
			case UMLPackage.CLASSIFIER___REMOVE_KEYWORD__STRING :
				return removeKeyword((String) arguments.get(0));
			case UMLPackage.CLASSIFIER___SET_VALUE__STEREOTYPE_STRING_OBJECT :
				setValue((Stereotype) arguments.get(0),
					(String) arguments.get(1), arguments.get(2));
				return null;
			case UMLPackage.CLASSIFIER___UNAPPLY_STEREOTYPE__STEREOTYPE :
				return unapplyStereotype((Stereotype) arguments.get(0));
			case UMLPackage.CLASSIFIER___ALL_OWNED_ELEMENTS :
				return allOwnedElements();
			case UMLPackage.CLASSIFIER___MUST_BE_OWNED :
				return mustBeOwned();
			case UMLPackage.CLASSIFIER___VALIDATE_VISIBILITY_NEEDS_OWNERSHIP__DIAGNOSTICCHAIN_MAP :
				return validateVisibilityNeedsOwnership(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.CLASSIFIER___VALIDATE_HAS_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP :
				return validateHasQualifiedName(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.CLASSIFIER___VALIDATE_HAS_NO_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP :
				return validateHasNoQualifiedName(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.CLASSIFIER___CREATE_DEPENDENCY__NAMEDELEMENT :
				return createDependency((NamedElement) arguments.get(0));
			case UMLPackage.CLASSIFIER___CREATE_USAGE__NAMEDELEMENT :
				return createUsage((NamedElement) arguments.get(0));
			case UMLPackage.CLASSIFIER___GET_LABEL :
				return getLabel();
			case UMLPackage.CLASSIFIER___GET_LABEL__BOOLEAN :
				return getLabel((Boolean) arguments.get(0));
			case UMLPackage.CLASSIFIER___GET_NAMESPACE :
				return getNamespace();
			case UMLPackage.CLASSIFIER___ALL_NAMESPACES :
				return allNamespaces();
			case UMLPackage.CLASSIFIER___ALL_OWNING_PACKAGES :
				return allOwningPackages();
			case UMLPackage.CLASSIFIER___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE :
				return isDistinguishableFrom((NamedElement) arguments.get(0),
					(Namespace) arguments.get(1));
			case UMLPackage.CLASSIFIER___GET_QUALIFIED_NAME :
				return getQualifiedName();
			case UMLPackage.CLASSIFIER___SEPARATOR :
				return separator();
			case UMLPackage.CLASSIFIER___GET_CLIENT_DEPENDENCIES :
				return getClientDependencies();
			case UMLPackage.CLASSIFIER___VALIDATE_MEMBERS_DISTINGUISHABLE__DIAGNOSTICCHAIN_MAP :
				return validateMembersDistinguishable(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.CLASSIFIER___VALIDATE_CANNOT_IMPORT_SELF__DIAGNOSTICCHAIN_MAP :
				return validateCannotImportSelf(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.CLASSIFIER___VALIDATE_CANNOT_IMPORT_OWNED_MEMBERS__DIAGNOSTICCHAIN_MAP :
				return validateCannotImportOwnedMembers(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.CLASSIFIER___CREATE_ELEMENT_IMPORT__PACKAGEABLEELEMENT_VISIBILITYKIND :
				return createElementImport(
					(PackageableElement) arguments.get(0),
					(VisibilityKind) arguments.get(1));
			case UMLPackage.CLASSIFIER___CREATE_PACKAGE_IMPORT__PACKAGE_VISIBILITYKIND :
				return createPackageImport(
					(org.eclipse.uml2.uml.Package) arguments.get(0),
					(VisibilityKind) arguments.get(1));
			case UMLPackage.CLASSIFIER___GET_IMPORTED_ELEMENTS :
				return getImportedElements();
			case UMLPackage.CLASSIFIER___GET_IMPORTED_PACKAGES :
				return getImportedPackages();
			case UMLPackage.CLASSIFIER___GET_OWNED_MEMBERS :
				return getOwnedMembers();
			case UMLPackage.CLASSIFIER___EXCLUDE_COLLISIONS__ELIST :
				return excludeCollisions(
					(EList<PackageableElement>) arguments.get(0));
			case UMLPackage.CLASSIFIER___GET_NAMES_OF_MEMBER__NAMEDELEMENT :
				return getNamesOfMember((NamedElement) arguments.get(0));
			case UMLPackage.CLASSIFIER___IMPORT_MEMBERS__ELIST :
				return importMembers(
					(EList<PackageableElement>) arguments.get(0));
			case UMLPackage.CLASSIFIER___GET_IMPORTED_MEMBERS :
				return getImportedMembers();
			case UMLPackage.CLASSIFIER___MEMBERS_ARE_DISTINGUISHABLE :
				return membersAreDistinguishable();
			case UMLPackage.CLASSIFIER___VALIDATE_REDEFINITION_CONSISTENT__DIAGNOSTICCHAIN_MAP :
				return validateRedefinitionConsistent(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.CLASSIFIER___VALIDATE_NON_LEAF_REDEFINITION__DIAGNOSTICCHAIN_MAP :
				return validateNonLeafRedefinition(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.CLASSIFIER___VALIDATE_REDEFINITION_CONTEXT_VALID__DIAGNOSTICCHAIN_MAP :
				return validateRedefinitionContextValid(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.CLASSIFIER___IS_CONSISTENT_WITH__REDEFINABLEELEMENT :
				return isConsistentWith((RedefinableElement) arguments.get(0));
			case UMLPackage.CLASSIFIER___IS_REDEFINITION_CONTEXT_VALID__REDEFINABLEELEMENT :
				return isRedefinitionContextValid(
					(RedefinableElement) arguments.get(0));
			case UMLPackage.CLASSIFIER___IS_COMPATIBLE_WITH__PARAMETERABLEELEMENT :
				return isCompatibleWith(
					(ParameterableElement) arguments.get(0));
			case UMLPackage.CLASSIFIER___IS_TEMPLATE_PARAMETER :
				return isTemplateParameter();
			case UMLPackage.CLASSIFIER___VALIDATE_NAMESPACE_NEEDS_VISIBILITY__DIAGNOSTICCHAIN_MAP :
				return validateNamespaceNeedsVisibility(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.CLASSIFIER___CREATE_ASSOCIATION__BOOLEAN_AGGREGATIONKIND_STRING_INT_INT_TYPE_BOOLEAN_AGGREGATIONKIND_STRING_INT_INT :
				return createAssociation((Boolean) arguments.get(0),
					(AggregationKind) arguments.get(1),
					(String) arguments.get(2), (Integer) arguments.get(3),
					(Integer) arguments.get(4), (Type) arguments.get(5),
					(Boolean) arguments.get(6),
					(AggregationKind) arguments.get(7),
					(String) arguments.get(8), (Integer) arguments.get(9),
					(Integer) arguments.get(10));
			case UMLPackage.CLASSIFIER___GET_ASSOCIATIONS :
				return getAssociations();
			case UMLPackage.CLASSIFIER___CONFORMS_TO__TYPE :
				return conformsTo((Type) arguments.get(0));
			case UMLPackage.CLASSIFIER___IS_TEMPLATE :
				return isTemplate();
			case UMLPackage.CLASSIFIER___PARAMETERABLE_ELEMENTS :
				return parameterableElements();
			case UMLPackage.CLASSIFIER___VALIDATE_SPECIALIZE_TYPE__DIAGNOSTICCHAIN_MAP :
				return validateSpecializeType(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.CLASSIFIER___VALIDATE_MAPS_TO_GENERALIZATION_SET__DIAGNOSTICCHAIN_MAP :
				return validateMapsToGeneralizationSet(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.CLASSIFIER___VALIDATE_NON_FINAL_PARENTS__DIAGNOSTICCHAIN_MAP :
				return validateNonFinalParents(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.CLASSIFIER___VALIDATE_NO_CYCLES_IN_GENERALIZATION__DIAGNOSTICCHAIN_MAP :
				return validateNoCyclesInGeneralization(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.CLASSIFIER___GET_ALL_ATTRIBUTES :
				return getAllAttributes();
			case UMLPackage.CLASSIFIER___GET_ALL_OPERATIONS :
				return getAllOperations();
			case UMLPackage.CLASSIFIER___GET_ALL_USED_INTERFACES :
				return getAllUsedInterfaces();
			case UMLPackage.CLASSIFIER___GET_OPERATION__STRING_ELIST_ELIST :
				return getOperation((String) arguments.get(0),
					(EList<String>) arguments.get(1),
					(EList<Type>) arguments.get(2));
			case UMLPackage.CLASSIFIER___GET_OPERATION__STRING_ELIST_ELIST_BOOLEAN :
				return getOperation((String) arguments.get(0),
					(EList<String>) arguments.get(1),
					(EList<Type>) arguments.get(2), (Boolean) arguments.get(3));
			case UMLPackage.CLASSIFIER___GET_OPERATIONS :
				return getOperations();
			case UMLPackage.CLASSIFIER___GET_USED_INTERFACES :
				return getUsedInterfaces();
			case UMLPackage.CLASSIFIER___ALL_FEATURES :
				return allFeatures();
			case UMLPackage.CLASSIFIER___ALL_PARENTS :
				return allParents();
			case UMLPackage.CLASSIFIER___GET_GENERALS :
				return getGenerals();
			case UMLPackage.CLASSIFIER___HAS_VISIBILITY_OF__NAMEDELEMENT :
				return hasVisibilityOf((NamedElement) arguments.get(0));
			case UMLPackage.CLASSIFIER___INHERIT__ELIST :
				return inherit((EList<NamedElement>) arguments.get(0));
			case UMLPackage.CLASSIFIER___INHERITABLE_MEMBERS__CLASSIFIER :
				return inheritableMembers((Classifier) arguments.get(0));
			case UMLPackage.CLASSIFIER___GET_INHERITED_MEMBERS :
				return getInheritedMembers();
			case UMLPackage.CLASSIFIER___MAY_SPECIALIZE_TYPE__CLASSIFIER :
				return maySpecializeType((Classifier) arguments.get(0));
			case UMLPackage.CLASSIFIER___PARENTS :
				return parents();
			case UMLPackage.CLASSIFIER___DIRECTLY_REALIZED_INTERFACES :
				return directlyRealizedInterfaces();
			case UMLPackage.CLASSIFIER___DIRECTLY_USED_INTERFACES :
				return directlyUsedInterfaces();
			case UMLPackage.CLASSIFIER___ALL_REALIZED_INTERFACES :
				return allRealizedInterfaces();
			case UMLPackage.CLASSIFIER___ALL_USED_INTERFACES :
				return allUsedInterfaces();
			case UMLPackage.CLASSIFIER___IS_SUBSTITUTABLE_FOR__CLASSIFIER :
				return isSubstitutableFor((Classifier) arguments.get(0));
			case UMLPackage.CLASSIFIER___ALL_ATTRIBUTES :
				return allAttributes();
			case UMLPackage.CLASSIFIER___ALL_SLOTTABLE_FEATURES :
				return allSlottableFeatures();
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
		result.append(" (isLeaf: "); //$NON-NLS-1$
		result.append((eFlags & IS_LEAF_EFLAG) != 0);
		result.append(", isAbstract: "); //$NON-NLS-1$
		result.append((eFlags & IS_ABSTRACT_EFLAG) != 0);
		result.append(", isFinalSpecialization: "); //$NON-NLS-1$
		result.append((eFlags & IS_FINAL_SPECIALIZATION_EFLAG) != 0);
		result.append(')');
		return result.toString();
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
		UMLPackage.CLASSIFIER__REDEFINED_CLASSIFIER};

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RedefinableElement getRedefinedElement(String name) {
		return getRedefinedElement(name, false, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RedefinableElement getRedefinedElement(String name,
			boolean ignoreCase, EClass eClass) {
		redefinedElementLoop : for (RedefinableElement redefinedElement : getRedefinedElements()) {
			if (eClass != null && !eClass.isInstance(redefinedElement))
				continue redefinedElementLoop;
			if (name != null && !(ignoreCase
				? name.equalsIgnoreCase(redefinedElement.getName())
				: name.equals(redefinedElement.getName())))
				continue redefinedElementLoop;
			return redefinedElement;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRedefinedElements() {
		return eIsSet(UMLPackage.CLASSIFIER__REDEFINED_CLASSIFIER);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRedefinitionContextsGen() {
		return false;
	}

	public boolean isSetRedefinitionContexts() {
		return basicGetNamespace() instanceof Classifier;
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
			|| eIsSet(UMLPackage.CLASSIFIER__OWNING_TEMPLATE_PARAMETER);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetNamespace() {
		return super.isSetNamespace() || eIsSet(UMLPackage.CLASSIFIER__PACKAGE);
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
		UMLPackage.CLASSIFIER__OWNED_COMMENT,
		UMLPackage.CLASSIFIER__NAME_EXPRESSION,
		UMLPackage.CLASSIFIER__ELEMENT_IMPORT,
		UMLPackage.CLASSIFIER__PACKAGE_IMPORT,
		UMLPackage.CLASSIFIER__OWNED_MEMBER,
		UMLPackage.CLASSIFIER__TEMPLATE_BINDING,
		UMLPackage.CLASSIFIER__OWNED_TEMPLATE_SIGNATURE,
		UMLPackage.CLASSIFIER__COLLABORATION_USE,
		UMLPackage.CLASSIFIER__GENERALIZATION,
		UMLPackage.CLASSIFIER__SUBSTITUTION};

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetOwnedElements() {
		return super.isSetOwnedElements()
			|| eIsSet(UMLPackage.CLASSIFIER__TEMPLATE_BINDING)
			|| isSetOwnedTemplateSignature()
			|| eIsSet(UMLPackage.CLASSIFIER__COLLABORATION_USE)
			|| eIsSet(UMLPackage.CLASSIFIER__GENERALIZATION)
			|| eIsSet(UMLPackage.CLASSIFIER__SUBSTITUTION);
	}

	/**
	 * The array of subset feature identifiers for the '{@link #getFeatures() <em>Feature</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeatures()
	 * @generated
	 * @ordered
	 */
	protected static final int[] FEATURE_ESUBSETS = new int[]{
		UMLPackage.CLASSIFIER__ATTRIBUTE};

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Feature getFeature(String name) {
		return getFeature(name, false, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Feature getFeature(String name, boolean ignoreCase, EClass eClass) {
		featureLoop : for (Feature feature : getFeatures()) {
			if (eClass != null && !eClass.isInstance(feature))
				continue featureLoop;
			if (name != null && !(ignoreCase
				? name.equalsIgnoreCase(feature.getName())
				: name.equals(feature.getName())))
				continue featureLoop;
			return feature;
		}
		return null;
	}

	/**
	 * The array of subset feature identifiers for the '{@link #getMembers() <em>Member</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMembers()
	 * @generated
	 * @ordered
	 */
	protected static final int[] MEMBER_ESUBSETS = new int[]{
		UMLPackage.CLASSIFIER__OWNED_MEMBER,
		UMLPackage.CLASSIFIER__IMPORTED_MEMBER, UMLPackage.CLASSIFIER__FEATURE,
		UMLPackage.CLASSIFIER__INHERITED_MEMBER};

	/**
	 * The array of subset feature identifiers for the '{@link #getOwnedMembers() <em>Owned Member</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedMembers()
	 * @generated
	 * @ordered
	 */
	protected static final int[] OWNED_MEMBER_ESUBSETS = new int[]{
		UMLPackage.CLASSIFIER__OWNED_RULE,
		UMLPackage.CLASSIFIER__OWNED_USE_CASE};

	/**
	 * The array of subset feature identifiers for the '{@link #getCollaborationUses() <em>Collaboration Use</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCollaborationUses()
	 * @generated
	 * @ordered
	 */
	protected static final int[] COLLABORATION_USE_ESUBSETS = new int[]{
		UMLPackage.CLASSIFIER__REPRESENTATION};

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CollaborationUse createCollaborationUse(String name) {
		CollaborationUse newCollaborationUse = (CollaborationUse) create(
			UMLPackage.Literals.COLLABORATION_USE);
		getCollaborationUses().add(newCollaborationUse);
		if (name != null)
			newCollaborationUse.setName(name);
		return newCollaborationUse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CollaborationUse getCollaborationUse(String name) {
		return getCollaborationUse(name, false, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CollaborationUse getCollaborationUse(String name, boolean ignoreCase,
			boolean createOnDemand) {
		collaborationUseLoop : for (CollaborationUse collaborationUse : getCollaborationUses()) {
			if (name != null && !(ignoreCase
				? name.equalsIgnoreCase(collaborationUse.getName())
				: name.equals(collaborationUse.getName())))
				continue collaborationUseLoop;
			return collaborationUse;
		}
		return createOnDemand
			? createCollaborationUse(name)
			: null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Substitution createSubstitution(String name, Classifier contract) {
		Substitution newSubstitution = (Substitution) create(
			UMLPackage.Literals.SUBSTITUTION);
		getSubstitutions().add(newSubstitution);
		if (name != null)
			newSubstitution.setName(name);
		if (contract != null)
			newSubstitution.setContract(contract);
		return newSubstitution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Substitution getSubstitution(String name, Classifier contract) {
		return getSubstitution(name, contract, false, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Substitution getSubstitution(String name, Classifier contract,
			boolean ignoreCase, boolean createOnDemand) {
		substitutionLoop : for (Substitution substitution : getSubstitutions()) {
			if (name != null && !(ignoreCase
				? name.equalsIgnoreCase(substitution.getName())
				: name.equals(substitution.getName())))
				continue substitutionLoop;
			if (contract != null
				&& !contract.equals(substitution.getContract()))
				continue substitutionLoop;
			return substitution;
		}
		return createOnDemand
			? createSubstitution(name, contract)
			: null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetFeatures() {
		return isSetAttributes();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetMembers() {
		return super.isSetMembers() || isSetFeatures()
			|| eIsSet(UMLPackage.CLASSIFIER__INHERITED_MEMBER);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetOwnedMembers() {
		return super.isSetOwnedMembers()
			|| eIsSet(UMLPackage.CLASSIFIER__OWNED_USE_CASE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetAttributes() {
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean conformsTo(Type other) {
		return ClassifierOperations.conformsTo(this, other);
	}

} //ClassifierImpl
