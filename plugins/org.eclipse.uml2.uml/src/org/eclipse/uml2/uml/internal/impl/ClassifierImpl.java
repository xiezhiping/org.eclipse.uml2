/*
 * Copyright (c) 2005, 2006 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *
 * $Id: ClassifierImpl.java,v 1.23 2006/01/05 13:54:02 khussey Exp $
 */
package org.eclipse.uml2.uml.internal.impl;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

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
import org.eclipse.uml2.common.util.SubsetSupersetEObjectContainmentWithInverseEList;
import org.eclipse.uml2.common.util.SubsetSupersetEObjectWithInverseResolvingEList;

import org.eclipse.uml2.uml.AggregationKind;
import org.eclipse.uml2.uml.Association;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.ClassifierTemplateParameter;
import org.eclipse.uml2.uml.CollaborationUse;
import org.eclipse.uml2.uml.Dependency;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Feature;
import org.eclipse.uml2.uml.Generalization;
import org.eclipse.uml2.uml.GeneralizationSet;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Namespace;
import org.eclipse.uml2.uml.Operation;
import org.eclipse.uml2.uml.PackageableElement;
import org.eclipse.uml2.uml.ParameterableElement;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.RedefinableElement;
import org.eclipse.uml2.uml.RedefinableTemplateSignature;
import org.eclipse.uml2.uml.StringExpression;
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
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ClassifierImpl#getRedefinedElements <em>Redefined Element</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ClassifierImpl#getRedefinitionContexts <em>Redefinition Context</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ClassifierImpl#isLeaf <em>Is Leaf</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ClassifierImpl#getTemplateParameter <em>Template Parameter</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ClassifierImpl#getOwningTemplateParameter <em>Owning Template Parameter</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ClassifierImpl#getVisibility <em>Visibility</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ClassifierImpl#getPackage <em>Package</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ClassifierImpl#getOwnedElements <em>Owned Element</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ClassifierImpl#getTemplateBindings <em>Template Binding</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ClassifierImpl#getOwnedTemplateSignature <em>Owned Template Signature</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ClassifierImpl#getFeatures <em>Feature</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ClassifierImpl#getMembers <em>Member</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ClassifierImpl#getAttributes <em>Attribute</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ClassifierImpl#getOwnedMembers <em>Owned Member</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ClassifierImpl#getClientDependencies <em>Client Dependency</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ClassifierImpl#getCollaborationUses <em>Collaboration Use</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ClassifierImpl#isAbstract <em>Is Abstract</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ClassifierImpl#getGeneralizations <em>Generalization</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ClassifierImpl#getPowertypeExtents <em>Powertype Extent</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ClassifierImpl#getInheritedMembers <em>Inherited Member</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ClassifierImpl#getRedefinedClassifiers <em>Redefined Classifier</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ClassifierImpl#getGenerals <em>General</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ClassifierImpl#getSubstitutions <em>Substitution</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ClassifierImpl#getRepresentation <em>Representation</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ClassifierImpl#getOwnedUseCases <em>Owned Use Case</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ClassifierImpl#getUseCases <em>Use Case</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ClassifierImpl#getOwnedSignature <em>Owned Signature</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ClassifierImpl
		extends NamespaceImpl
		implements Classifier {

	/**
	 * A bit field representing the indices of non-primitive feature values.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected int eVirtualIndexBits1 = 0;

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
	protected static final int IS_LEAF_EFLAG = 1 << 8;

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
	protected static final int IS_ABSTRACT_EFLAG = 1 << 9;

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
		return UMLPackage.Literals.CLASSIFIER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getRedefinedElements() {
		EList redefinedElement = (EList) eVirtualGet(UMLPackage.CLASSIFIER__REDEFINED_ELEMENT);
		if (redefinedElement == null) {
			eVirtualSet(UMLPackage.CLASSIFIER__REDEFINED_ELEMENT,
				redefinedElement = new DerivedUnionEObjectEList(
					RedefinableElement.class, this,
					UMLPackage.CLASSIFIER__REDEFINED_ELEMENT,
					new int[]{UMLPackage.CLASSIFIER__REDEFINED_CLASSIFIER}));
		}
		return redefinedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RedefinableElement getRedefinedElement(String name) {
		for (Iterator i = getRedefinedElements().iterator(); i.hasNext();) {
			RedefinableElement redefinedElement = (RedefinableElement) i.next();
			if (name.equals(redefinedElement.getName())) {
				return redefinedElement;
			}
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getRedefinitionContextsGen() {
		EList redefinitionContext = (EList) eVirtualGet(UMLPackage.CLASSIFIER__REDEFINITION_CONTEXT);
		if (redefinitionContext == null) {
			eVirtualSet(UMLPackage.CLASSIFIER__REDEFINITION_CONTEXT,
				redefinitionContext = new DerivedUnionEObjectEList(
					Classifier.class, this,
					UMLPackage.CLASSIFIER__REDEFINITION_CONTEXT, null));
		}
		return redefinitionContext;
	}

	public EList getRedefinitionContexts() {
		EList redefinitionContext = (EList) eVirtualGet(UMLPackage.CLASSIFIER__REDEFINITION_CONTEXT);
		if (redefinitionContext == null) {
			eVirtualSet(UMLPackage.CLASSIFIER__REDEFINITION_CONTEXT,
				redefinitionContext = new DerivedEObjectEList(Classifier.class,
					this, UMLPackage.CLASSIFIER__REDEFINITION_CONTEXT,
					new int[]{UMLPackage.CLASSIFIER__NAMESPACE}));
		}
		return redefinitionContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Classifier getRedefinitionContext(String name) {
		for (Iterator i = getRedefinitionContexts().iterator(); i.hasNext();) {
			Classifier redefinitionContext = (Classifier) i.next();
			if (name.equals(redefinitionContext.getName())) {
				return redefinitionContext;
			}
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
	public TemplateParameter getTemplateParameter() {
		TemplateParameter templateParameter = (TemplateParameter) eVirtualGet(UMLPackage.CLASSIFIER__TEMPLATE_PARAMETER);
		if (templateParameter != null && templateParameter.eIsProxy()) {
			InternalEObject oldTemplateParameter = (InternalEObject) templateParameter;
			templateParameter = (TemplateParameter) eResolveProxy(oldTemplateParameter);
			if (templateParameter != oldTemplateParameter) {
				eVirtualSet(UMLPackage.CLASSIFIER__TEMPLATE_PARAMETER,
					templateParameter);
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
		return (TemplateParameter) eVirtualGet(UMLPackage.CLASSIFIER__TEMPLATE_PARAMETER);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTemplateParameter(
			TemplateParameter newTemplateParameter, NotificationChain msgs) {
		Object oldTemplateParameter = eVirtualSet(
			UMLPackage.CLASSIFIER__TEMPLATE_PARAMETER, newTemplateParameter);
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
				Notification.SET, UMLPackage.CLASSIFIER__TEMPLATE_PARAMETER,
				oldTemplateParameter == EVIRTUAL_NO_VALUE
					? null
					: oldTemplateParameter, newTemplateParameter);
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
	public void setTemplateParameter(TemplateParameter newTemplateParameter) {
		TemplateParameter templateParameter = (TemplateParameter) eVirtualGet(UMLPackage.CLASSIFIER__TEMPLATE_PARAMETER);
		if (newTemplateParameter != templateParameter) {
			NotificationChain msgs = null;
			if (templateParameter != null)
				msgs = ((InternalEObject) templateParameter)
					.eInverseRemove(
						this,
						UMLPackage.CLASSIFIER_TEMPLATE_PARAMETER__PARAMETERED_ELEMENT,
						ClassifierTemplateParameter.class, msgs);
			if (newTemplateParameter != null)
				msgs = ((InternalEObject) newTemplateParameter)
					.eInverseAdd(
						this,
						UMLPackage.CLASSIFIER_TEMPLATE_PARAMETER__PARAMETERED_ELEMENT,
						ClassifierTemplateParameter.class, msgs);
			msgs = basicSetTemplateParameter(newTemplateParameter, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.CLASSIFIER__TEMPLATE_PARAMETER,
				newTemplateParameter, newTemplateParameter));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTemplateParameter() {
		return eVirtualGet(UMLPackage.CLASSIFIER__TEMPLATE_PARAMETER) != null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemplateParameter getOwningTemplateParameter() {
		if (eContainerFeatureID != UMLPackage.CLASSIFIER__OWNING_TEMPLATE_PARAMETER)
			return null;
		return (TemplateParameter) eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemplateParameter basicGetOwningTemplateParameter() {
		if (eContainerFeatureID != UMLPackage.CLASSIFIER__OWNING_TEMPLATE_PARAMETER)
			return null;
		return (TemplateParameter) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwningTemplateParameter(
			TemplateParameter newOwningTemplateParameter) {
		EObject oldOwningTemplateParameter = eContainer();
		if (newOwningTemplateParameter != eInternalContainer()
			|| (eContainerFeatureID != UMLPackage.CLASSIFIER__OWNING_TEMPLATE_PARAMETER && newOwningTemplateParameter != null)) {
			if (EcoreUtil.isAncestor(this, newOwningTemplateParameter))
				throw new IllegalArgumentException(
					"Recursive containment not allowed for " + toString()); //$NON-NLS-1$
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOwningTemplateParameter != null)
				msgs = ((InternalEObject) newOwningTemplateParameter)
					.eInverseAdd(
						this,
						UMLPackage.TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT,
						TemplateParameter.class, msgs);
			msgs = eBasicSetContainer(
				(InternalEObject) newOwningTemplateParameter,
				UMLPackage.CLASSIFIER__OWNING_TEMPLATE_PARAMETER, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.CLASSIFIER__OWNING_TEMPLATE_PARAMETER,
				newOwningTemplateParameter, newOwningTemplateParameter));

		if (newOwningTemplateParameter != null
			|| oldOwningTemplateParameter == eVirtualGet(UMLPackage.CLASSIFIER__TEMPLATE_PARAMETER)) {
			setTemplateParameter(newOwningTemplateParameter);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VisibilityKind getVisibility() {
		return (VisibilityKind) eVirtualGet(UMLPackage.CLASSIFIER__VISIBILITY,
			VISIBILITY_EDEFAULT);
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
		Object oldVisibility = eVirtualSet(UMLPackage.CLASSIFIER__VISIBILITY,
			visibility);
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.CLASSIFIER__VISIBILITY,
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
		return eVirtualGet(UMLPackage.CLASSIFIER__VISIBILITY,
			VISIBILITY_EDEFAULT) != VISIBILITY_EDEFAULT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.uml2.uml.Package getPackage() {
		org.eclipse.uml2.uml.Package package_ = basicGetPackage();
		return package_ != null && package_.eIsProxy()
			? (org.eclipse.uml2.uml.Package) eResolveProxy((InternalEObject) package_)
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
		if (newPackage != eInternalContainer()
			|| (eContainerFeatureID != UMLPackage.CLASSIFIER__PACKAGE && newPackage != null)) {
			if (EcoreUtil.isAncestor(this, newPackage))
				throw new IllegalArgumentException(
					"Recursive containment not allowed for " + toString()); //$NON-NLS-1$
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newPackage != null)
				msgs = ((InternalEList) newPackage.getOwnedTypes()).basicAdd(
					this, msgs);
			msgs = eBasicSetContainer((InternalEObject) newPackage,
				UMLPackage.CLASSIFIER__PACKAGE, msgs);
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
	public EList getOwnedElements() {
		EList ownedElement = (EList) eVirtualGet(UMLPackage.CLASSIFIER__OWNED_ELEMENT);
		if (ownedElement == null) {
			eVirtualSet(UMLPackage.CLASSIFIER__OWNED_ELEMENT,
				ownedElement = new DerivedUnionEObjectEList(Element.class,
					this, UMLPackage.CLASSIFIER__OWNED_ELEMENT, new int[]{
						UMLPackage.CLASSIFIER__OWNED_COMMENT,
						UMLPackage.CLASSIFIER__NAME_EXPRESSION,
						UMLPackage.CLASSIFIER__ELEMENT_IMPORT,
						UMLPackage.CLASSIFIER__PACKAGE_IMPORT,
						UMLPackage.CLASSIFIER__OWNED_MEMBER,
						UMLPackage.CLASSIFIER__TEMPLATE_BINDING,
						UMLPackage.CLASSIFIER__OWNED_TEMPLATE_SIGNATURE,
						UMLPackage.CLASSIFIER__GENERALIZATION,
						UMLPackage.CLASSIFIER__SUBSTITUTION,
						UMLPackage.CLASSIFIER__COLLABORATION_USE,
						UMLPackage.CLASSIFIER__OWNED_SIGNATURE}));
		}
		return ownedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getTemplateBindings() {
		EList templateBinding = (EList) eVirtualGet(UMLPackage.CLASSIFIER__TEMPLATE_BINDING);
		if (templateBinding == null) {
			eVirtualSet(UMLPackage.CLASSIFIER__TEMPLATE_BINDING,
				templateBinding = new EObjectContainmentWithInverseEList(
					TemplateBinding.class, this,
					UMLPackage.CLASSIFIER__TEMPLATE_BINDING,
					UMLPackage.TEMPLATE_BINDING__BOUND_ELEMENT));
		}
		return templateBinding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemplateBinding createTemplateBinding() {
		TemplateBinding newTemplateBinding = UMLFactory.eINSTANCE
			.createTemplateBinding();
		getTemplateBindings().add(newTemplateBinding);
		return newTemplateBinding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemplateSignature getOwnedTemplateSignature() {
		return (TemplateSignature) eVirtualGet(UMLPackage.CLASSIFIER__OWNED_TEMPLATE_SIGNATURE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnedTemplateSignature(
			TemplateSignature newOwnedTemplateSignature, NotificationChain msgs) {
		Object oldOwnedTemplateSignature = eVirtualSet(
			UMLPackage.CLASSIFIER__OWNED_TEMPLATE_SIGNATURE,
			newOwnedTemplateSignature);
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
				Notification.SET,
				UMLPackage.CLASSIFIER__OWNED_TEMPLATE_SIGNATURE,
				oldOwnedTemplateSignature == EVIRTUAL_NO_VALUE
					? null
					: oldOwnedTemplateSignature, newOwnedTemplateSignature);
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
		TemplateSignature ownedTemplateSignature = (TemplateSignature) eVirtualGet(UMLPackage.CLASSIFIER__OWNED_TEMPLATE_SIGNATURE);
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
		TemplateSignature newOwnedTemplateSignature = (TemplateSignature) eClass
			.getEPackage().getEFactoryInstance().create(eClass);
		setOwnedTemplateSignature(newOwnedTemplateSignature);
		return newOwnedTemplateSignature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemplateSignature createOwnedTemplateSignature() {
		TemplateSignature newOwnedTemplateSignature = UMLFactory.eINSTANCE
			.createTemplateSignature();
		setOwnedTemplateSignature(newOwnedTemplateSignature);
		return newOwnedTemplateSignature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getFeatures() {
		EList feature = (EList) eVirtualGet(UMLPackage.CLASSIFIER__FEATURE);
		if (feature == null) {
			eVirtualSet(UMLPackage.CLASSIFIER__FEATURE,
				feature = new DerivedUnionEObjectEList(Feature.class, this,
					UMLPackage.CLASSIFIER__FEATURE,
					new int[]{UMLPackage.CLASSIFIER__ATTRIBUTE}));
		}
		return feature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Feature getFeature(String name) {
		for (Iterator i = getFeatures().iterator(); i.hasNext();) {
			Feature feature = (Feature) i.next();
			if (name.equals(feature.getName())) {
				return feature;
			}
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getMembers() {
		EList member = (EList) eVirtualGet(UMLPackage.CLASSIFIER__MEMBER);
		if (member == null) {
			eVirtualSet(UMLPackage.CLASSIFIER__MEMBER,
				member = new DerivedUnionEObjectEList(NamedElement.class, this,
					UMLPackage.CLASSIFIER__MEMBER, new int[]{
						UMLPackage.CLASSIFIER__IMPORTED_MEMBER,
						UMLPackage.CLASSIFIER__OWNED_MEMBER,
						UMLPackage.CLASSIFIER__FEATURE,
						UMLPackage.CLASSIFIER__INHERITED_MEMBER}));
		}
		return member;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getOwnedMembers() {
		EList ownedMember = (EList) eVirtualGet(UMLPackage.CLASSIFIER__OWNED_MEMBER);
		if (ownedMember == null) {
			eVirtualSet(UMLPackage.CLASSIFIER__OWNED_MEMBER,
				ownedMember = new DerivedUnionEObjectEList(NamedElement.class,
					this, UMLPackage.CLASSIFIER__OWNED_MEMBER, new int[]{
						UMLPackage.CLASSIFIER__OWNED_RULE,
						UMLPackage.CLASSIFIER__OWNED_USE_CASE}));
		}
		return ownedMember;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getAttributes() {
		EList attribute = (EList) eVirtualGet(UMLPackage.CLASSIFIER__ATTRIBUTE);
		if (attribute == null) {
			eVirtualSet(UMLPackage.CLASSIFIER__ATTRIBUTE,
				attribute = new DerivedUnionEObjectEList(Property.class, this,
					UMLPackage.CLASSIFIER__ATTRIBUTE, null));
		}
		return attribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property getAttribute(String name) {
		for (Iterator i = getAttributes().iterator(); i.hasNext();) {
			Property attribute = (Property) i.next();
			if (name.equals(attribute.getName())) {
				return attribute;
			}
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getClientDependencies() {
		EList clientDependency = (EList) eVirtualGet(UMLPackage.CLASSIFIER__CLIENT_DEPENDENCY);
		if (clientDependency == null) {
			eVirtualSet(
				UMLPackage.CLASSIFIER__CLIENT_DEPENDENCY,
				clientDependency = new SubsetSupersetEObjectWithInverseResolvingEList.ManyInverse(
					Dependency.class, this,
					UMLPackage.CLASSIFIER__CLIENT_DEPENDENCY, null,
					new int[]{UMLPackage.CLASSIFIER__SUBSTITUTION},
					UMLPackage.DEPENDENCY__CLIENT));
		}
		return clientDependency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getCollaborationUses() {
		EList collaborationUse = (EList) eVirtualGet(UMLPackage.CLASSIFIER__COLLABORATION_USE);
		if (collaborationUse == null) {
			eVirtualSet(UMLPackage.CLASSIFIER__COLLABORATION_USE,
				collaborationUse = new SubsetSupersetEObjectContainmentEList(
					CollaborationUse.class, this,
					UMLPackage.CLASSIFIER__COLLABORATION_USE, null,
					new int[]{UMLPackage.CLASSIFIER__REPRESENTATION}));
		}
		return collaborationUse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CollaborationUse createCollaborationUse() {
		CollaborationUse newCollaborationUse = UMLFactory.eINSTANCE
			.createCollaborationUse();
		getCollaborationUses().add(newCollaborationUse);
		return newCollaborationUse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CollaborationUse getCollaborationUse(String name) {
		for (Iterator i = getCollaborationUses().iterator(); i.hasNext();) {
			CollaborationUse collaborationUse = (CollaborationUse) i.next();
			if (name.equals(collaborationUse.getName())) {
				return collaborationUse;
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
	public EList getGeneralizations() {
		EList generalization = (EList) eVirtualGet(UMLPackage.CLASSIFIER__GENERALIZATION);
		if (generalization == null) {
			eVirtualSet(UMLPackage.CLASSIFIER__GENERALIZATION,
				generalization = new EObjectContainmentWithInverseEList(
					Generalization.class, this,
					UMLPackage.CLASSIFIER__GENERALIZATION,
					UMLPackage.GENERALIZATION__SPECIFIC));
		}
		return generalization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Generalization createGeneralization() {
		Generalization newGeneralization = UMLFactory.eINSTANCE
			.createGeneralization();
		getGeneralizations().add(newGeneralization);
		return newGeneralization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getPowertypeExtents() {
		EList powertypeExtent = (EList) eVirtualGet(UMLPackage.CLASSIFIER__POWERTYPE_EXTENT);
		if (powertypeExtent == null) {
			eVirtualSet(UMLPackage.CLASSIFIER__POWERTYPE_EXTENT,
				powertypeExtent = new EObjectWithInverseResolvingEList(
					GeneralizationSet.class, this,
					UMLPackage.CLASSIFIER__POWERTYPE_EXTENT,
					UMLPackage.GENERALIZATION_SET__POWERTYPE));
		}
		return powertypeExtent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeneralizationSet getPowertypeExtent(String name) {
		for (Iterator i = getPowertypeExtents().iterator(); i.hasNext();) {
			GeneralizationSet powertypeExtent = (GeneralizationSet) i.next();
			if (name.equals(powertypeExtent.getName())) {
				return powertypeExtent;
			}
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getInheritedMembers() {
		CacheAdapter cache = getCacheAdapter();
		if (cache != null) {
			EList result = (EList) cache.get(this,
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
		for (Iterator i = getInheritedMembers().iterator(); i.hasNext();) {
			NamedElement inheritedMember = (NamedElement) i.next();
			if (name.equals(inheritedMember.getName())) {
				return inheritedMember;
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
		EList redefinedClassifier = (EList) eVirtualGet(UMLPackage.CLASSIFIER__REDEFINED_CLASSIFIER);
		if (redefinedClassifier == null) {
			eVirtualSet(UMLPackage.CLASSIFIER__REDEFINED_CLASSIFIER,
				redefinedClassifier = new EObjectResolvingEList(
					Classifier.class, this,
					UMLPackage.CLASSIFIER__REDEFINED_CLASSIFIER));
		}
		return redefinedClassifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Classifier getRedefinedClassifier(String name) {
		for (Iterator i = getRedefinedClassifiers().iterator(); i.hasNext();) {
			Classifier redefinedClassifier = (Classifier) i.next();
			if (name.equals(redefinedClassifier.getName())) {
				return redefinedClassifier;
			}
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getGenerals() {
		CacheAdapter cache = getCacheAdapter();
		if (cache != null) {
			EList result = (EList) cache.get(eResource(), this,
				UMLPackage.Literals.CLASSIFIER__GENERAL);
			if (result == null) {
				cache.put(eResource(), this,
					UMLPackage.Literals.CLASSIFIER__GENERAL,
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
		for (Iterator i = getGenerals().iterator(); i.hasNext();) {
			Classifier general = (Classifier) i.next();
			if (name.equals(general.getName())) {
				return general;
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
		EList ownedUseCase = (EList) eVirtualGet(UMLPackage.CLASSIFIER__OWNED_USE_CASE);
		if (ownedUseCase == null) {
			eVirtualSet(UMLPackage.CLASSIFIER__OWNED_USE_CASE,
				ownedUseCase = new EObjectContainmentEList(UseCase.class, this,
					UMLPackage.CLASSIFIER__OWNED_USE_CASE));
		}
		return ownedUseCase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UseCase createOwnedUseCase() {
		UseCase newOwnedUseCase = UMLFactory.eINSTANCE.createUseCase();
		getOwnedUseCases().add(newOwnedUseCase);
		return newOwnedUseCase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UseCase getOwnedUseCase(String name) {
		for (Iterator i = getOwnedUseCases().iterator(); i.hasNext();) {
			UseCase ownedUseCase = (UseCase) i.next();
			if (name.equals(ownedUseCase.getName())) {
				return ownedUseCase;
			}
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getUseCases() {
		EList useCase = (EList) eVirtualGet(UMLPackage.CLASSIFIER__USE_CASE);
		if (useCase == null) {
			eVirtualSet(UMLPackage.CLASSIFIER__USE_CASE,
				useCase = new EObjectWithInverseResolvingEList.ManyInverse(
					UseCase.class, this, UMLPackage.CLASSIFIER__USE_CASE,
					UMLPackage.USE_CASE__SUBJECT));
		}
		return useCase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UseCase getUseCase(String name) {
		for (Iterator i = getUseCases().iterator(); i.hasNext();) {
			UseCase useCase = (UseCase) i.next();
			if (name.equals(useCase.getName())) {
				return useCase;
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
		EList substitution = (EList) eVirtualGet(UMLPackage.CLASSIFIER__SUBSTITUTION);
		if (substitution == null) {
			eVirtualSet(
				UMLPackage.CLASSIFIER__SUBSTITUTION,
				substitution = new SubsetSupersetEObjectContainmentWithInverseEList(
					Substitution.class, this,
					UMLPackage.CLASSIFIER__SUBSTITUTION,
					new int[]{UMLPackage.CLASSIFIER__CLIENT_DEPENDENCY}, null,
					UMLPackage.SUBSTITUTION__SUBSTITUTING_CLASSIFIER));
		}
		return substitution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Substitution createSubstitution() {
		Substitution newSubstitution = UMLFactory.eINSTANCE
			.createSubstitution();
		getSubstitutions().add(newSubstitution);
		return newSubstitution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Substitution getSubstitution(String name) {
		for (Iterator i = getSubstitutions().iterator(); i.hasNext();) {
			Substitution substitution = (Substitution) i.next();
			if (name.equals(substitution.getName())) {
				return substitution;
			}
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CollaborationUse getRepresentation() {
		return (CollaborationUse) eVirtualGet(UMLPackage.CLASSIFIER__REPRESENTATION);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRepresentation(CollaborationUse newRepresentation) {
		if (newRepresentation != null
			&& !getCollaborationUses().contains(newRepresentation)) {
			getCollaborationUses().add(newRepresentation);
		}
		CollaborationUse representation = newRepresentation;
		Object oldRepresentation = eVirtualSet(
			UMLPackage.CLASSIFIER__REPRESENTATION, representation);
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.CLASSIFIER__REPRESENTATION,
				oldRepresentation == EVIRTUAL_NO_VALUE
					? null
					: oldRepresentation, representation));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RedefinableTemplateSignature getOwnedSignature() {
		return (RedefinableTemplateSignature) eVirtualGet(UMLPackage.CLASSIFIER__OWNED_SIGNATURE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnedSignature(
			RedefinableTemplateSignature newOwnedSignature,
			NotificationChain msgs) {
		Object oldOwnedSignature = eVirtualSet(
			UMLPackage.CLASSIFIER__OWNED_SIGNATURE, newOwnedSignature);
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
				Notification.SET, UMLPackage.CLASSIFIER__OWNED_SIGNATURE,
				oldOwnedSignature == EVIRTUAL_NO_VALUE
					? null
					: oldOwnedSignature, newOwnedSignature);
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
	public void setOwnedSignature(RedefinableTemplateSignature newOwnedSignature) {
		RedefinableTemplateSignature ownedSignature = (RedefinableTemplateSignature) eVirtualGet(UMLPackage.CLASSIFIER__OWNED_SIGNATURE);
		if (newOwnedSignature != ownedSignature) {
			NotificationChain msgs = null;
			if (ownedSignature != null)
				msgs = ((InternalEObject) ownedSignature).eInverseRemove(this,
					UMLPackage.REDEFINABLE_TEMPLATE_SIGNATURE__CLASSIFIER,
					RedefinableTemplateSignature.class, msgs);
			if (newOwnedSignature != null)
				msgs = ((InternalEObject) newOwnedSignature).eInverseAdd(this,
					UMLPackage.REDEFINABLE_TEMPLATE_SIGNATURE__CLASSIFIER,
					RedefinableTemplateSignature.class, msgs);
			msgs = basicSetOwnedSignature(newOwnedSignature, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.CLASSIFIER__OWNED_SIGNATURE, newOwnedSignature,
				newOwnedSignature));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RedefinableTemplateSignature createOwnedSignature() {
		RedefinableTemplateSignature newOwnedSignature = UMLFactory.eINSTANCE
			.createRedefinableTemplateSignature();
		setOwnedSignature(newOwnedSignature);
		return newOwnedSignature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRedefinitionContextValid(
			DiagnosticChain diagnostics, Map context) {
		return RedefinableElementOperations.validateRedefinitionContextValid(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRedefinitionConsistent(DiagnosticChain diagnostics,
			Map context) {
		return RedefinableElementOperations.validateRedefinitionConsistent(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isRedefinitionContextValid(RedefinableElement redefined) {
		return RedefinableElementOperations.isRedefinitionContextValid(this,
			redefined);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isConsistentWith(RedefinableElement redefinee) {
		return RedefinableElementOperations.isConsistentWith(this, redefinee);
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
	public EList parameterableElements() {
		CacheAdapter cache = getCacheAdapter();
		if (cache != null) {
			EList result = (EList) cache.get(eResource(), this,
				UMLPackage.Literals.TEMPLATEABLE_ELEMENT.getEOperations()
					.get(0));
			if (result == null) {
				cache.put(eResource(), this,
					UMLPackage.Literals.TEMPLATEABLE_ELEMENT.getEOperations()
						.get(0), result = TemplateableElementOperations
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
	public boolean validateNoCyclesInGeneralization(
			DiagnosticChain diagnostics, Map context) {
		return ClassifierOperations.validateNoCyclesInGeneralization(this,
			diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSpecializeType(DiagnosticChain diagnostics,
			Map context) {
		return ClassifierOperations.validateSpecializeType(this, diagnostics,
			context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralizationHierarchies(
			DiagnosticChain diagnostics, Map context) {
		return ClassifierOperations.validateGeneralizationHierarchies(this,
			diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMapsToGeneralizationSet(DiagnosticChain diagnostics,
			Map context) {
		return ClassifierOperations.validateMapsToGeneralizationSet(this,
			diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Generalization createGeneralization(Classifier general) {
		return ClassifierOperations.createGeneralization(this, general);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getAllAttributes() {
		CacheAdapter cache = getCacheAdapter();
		if (cache != null) {
			EList result = (EList) cache.get(this,
				UMLPackage.Literals.CLASSIFIER.getEOperations().get(5));
			if (result == null) {
				cache.put(this, UMLPackage.Literals.CLASSIFIER.getEOperations()
					.get(5), result = ClassifierOperations
					.getAllAttributes(this));
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
	public EList getOperations() {
		CacheAdapter cache = getCacheAdapter();
		if (cache != null) {
			EList result = (EList) cache.get(eResource(), this,
				UMLPackage.Literals.CLASSIFIER.getEOperations().get(6));
			if (result == null) {
				cache.put(eResource(), this, UMLPackage.Literals.CLASSIFIER
					.getEOperations().get(6), result = ClassifierOperations
					.getOperations(this));
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
	public EList getAllOperations() {
		CacheAdapter cache = getCacheAdapter();
		if (cache != null) {
			EList result = (EList) cache.get(this,
				UMLPackage.Literals.CLASSIFIER.getEOperations().get(7));
			if (result == null) {
				cache.put(this, UMLPackage.Literals.CLASSIFIER.getEOperations()
					.get(7), result = ClassifierOperations
					.getAllOperations(this));
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
	public Operation getOperation(String name) {
		return ClassifierOperations.getOperation(this, name);
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
	public EList allFeatures() {
		CacheAdapter cache = getCacheAdapter();
		if (cache != null) {
			EList result = (EList) cache.get(this,
				UMLPackage.Literals.CLASSIFIER.getEOperations().get(11));
			if (result == null) {
				cache.put(this, UMLPackage.Literals.CLASSIFIER.getEOperations()
					.get(11), result = ClassifierOperations.allFeatures(this));
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
	public EList parents() {
		CacheAdapter cache = getCacheAdapter();
		if (cache != null) {
			EList result = (EList) cache.get(eResource(), this,
				UMLPackage.Literals.CLASSIFIER.getEOperations().get(12));
			if (result == null) {
				cache.put(eResource(), this, UMLPackage.Literals.CLASSIFIER
					.getEOperations().get(12), result = ClassifierOperations
					.parents(this));
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
	public EList inheritableMembers(Classifier c) {
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
	public boolean conformsTo(Classifier other) {
		return ClassifierOperations.conformsTo(this, other);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList inherit(EList inhs) {
		return ClassifierOperations.inherit(this, inhs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList allParents() {
		CacheAdapter cache = getCacheAdapter();
		if (cache != null) {
			EList result = (EList) cache.get(this,
				UMLPackage.Literals.CLASSIFIER.getEOperations().get(18));
			if (result == null) {
				cache.put(this, UMLPackage.Literals.CLASSIFIER.getEOperations()
					.get(18), result = ClassifierOperations.allParents(this));
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
	public NotificationChain eInverseAdd(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UMLPackage.CLASSIFIER__EANNOTATIONS :
				return ((InternalEList) getEAnnotations()).basicAdd(otherEnd,
					msgs);
			case UMLPackage.CLASSIFIER__CLIENT_DEPENDENCY :
				return ((InternalEList) getClientDependencies()).basicAdd(
					otherEnd, msgs);
			case UMLPackage.CLASSIFIER__ELEMENT_IMPORT :
				return ((InternalEList) getElementImports()).basicAdd(otherEnd,
					msgs);
			case UMLPackage.CLASSIFIER__PACKAGE_IMPORT :
				return ((InternalEList) getPackageImports()).basicAdd(otherEnd,
					msgs);
			case UMLPackage.CLASSIFIER__OWNED_RULE :
				return ((InternalEList) getOwnedRules()).basicAdd(otherEnd,
					msgs);
			case UMLPackage.CLASSIFIER__OWNING_TEMPLATE_PARAMETER :
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return eBasicSetContainer(otherEnd,
					UMLPackage.CLASSIFIER__OWNING_TEMPLATE_PARAMETER, msgs);
			case UMLPackage.CLASSIFIER__TEMPLATE_PARAMETER :
				TemplateParameter templateParameter = (TemplateParameter) eVirtualGet(UMLPackage.CLASSIFIER__TEMPLATE_PARAMETER);
				if (templateParameter != null)
					msgs = ((InternalEObject) templateParameter)
						.eInverseRemove(this,
							UMLPackage.TEMPLATE_PARAMETER__PARAMETERED_ELEMENT,
							TemplateParameter.class, msgs);
				return basicSetTemplateParameter((TemplateParameter) otherEnd,
					msgs);
			case UMLPackage.CLASSIFIER__TEMPLATE_BINDING :
				return ((InternalEList) getTemplateBindings()).basicAdd(
					otherEnd, msgs);
			case UMLPackage.CLASSIFIER__OWNED_TEMPLATE_SIGNATURE :
				TemplateSignature ownedTemplateSignature = (TemplateSignature) eVirtualGet(UMLPackage.CLASSIFIER__OWNED_TEMPLATE_SIGNATURE);
				if (ownedTemplateSignature != null)
					msgs = ((InternalEObject) ownedTemplateSignature)
						.eInverseRemove(this, EOPPOSITE_FEATURE_BASE
							- UMLPackage.CLASSIFIER__OWNED_TEMPLATE_SIGNATURE,
							null, msgs);
				return basicSetOwnedTemplateSignature(
					(TemplateSignature) otherEnd, msgs);
			case UMLPackage.CLASSIFIER__GENERALIZATION :
				return ((InternalEList) getGeneralizations()).basicAdd(
					otherEnd, msgs);
			case UMLPackage.CLASSIFIER__POWERTYPE_EXTENT :
				return ((InternalEList) getPowertypeExtents()).basicAdd(
					otherEnd, msgs);
			case UMLPackage.CLASSIFIER__SUBSTITUTION :
				return ((InternalEList) getSubstitutions()).basicAdd(otherEnd,
					msgs);
			case UMLPackage.CLASSIFIER__USE_CASE :
				return ((InternalEList) getUseCases()).basicAdd(otherEnd, msgs);
			case UMLPackage.CLASSIFIER__OWNED_SIGNATURE :
				RedefinableTemplateSignature ownedSignature = (RedefinableTemplateSignature) eVirtualGet(UMLPackage.CLASSIFIER__OWNED_SIGNATURE);
				if (ownedSignature != null)
					msgs = ((InternalEObject) ownedSignature).eInverseRemove(
						this, EOPPOSITE_FEATURE_BASE
							- UMLPackage.CLASSIFIER__OWNED_SIGNATURE, null,
						msgs);
				return basicSetOwnedSignature(
					(RedefinableTemplateSignature) otherEnd, msgs);
		}
		return eDynamicInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UMLPackage.CLASSIFIER__EANNOTATIONS :
				return ((InternalEList) getEAnnotations()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.CLASSIFIER__OWNED_COMMENT :
				return ((InternalEList) getOwnedComments()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.CLASSIFIER__CLIENT_DEPENDENCY :
				return ((InternalEList) getClientDependencies()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.CLASSIFIER__NAME_EXPRESSION :
				return basicSetNameExpression(null, msgs);
			case UMLPackage.CLASSIFIER__ELEMENT_IMPORT :
				return ((InternalEList) getElementImports()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.CLASSIFIER__PACKAGE_IMPORT :
				return ((InternalEList) getPackageImports()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.CLASSIFIER__OWNED_RULE :
				return ((InternalEList) getOwnedRules()).basicRemove(otherEnd,
					msgs);
			case UMLPackage.CLASSIFIER__OWNING_TEMPLATE_PARAMETER :
				return eBasicSetContainer(null,
					UMLPackage.CLASSIFIER__OWNING_TEMPLATE_PARAMETER, msgs);
			case UMLPackage.CLASSIFIER__TEMPLATE_PARAMETER :
				return basicSetTemplateParameter(null, msgs);
			case UMLPackage.CLASSIFIER__TEMPLATE_BINDING :
				return ((InternalEList) getTemplateBindings()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.CLASSIFIER__OWNED_TEMPLATE_SIGNATURE :
				return basicSetOwnedTemplateSignature(null, msgs);
			case UMLPackage.CLASSIFIER__GENERALIZATION :
				return ((InternalEList) getGeneralizations()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.CLASSIFIER__POWERTYPE_EXTENT :
				return ((InternalEList) getPowertypeExtents()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.CLASSIFIER__SUBSTITUTION :
				return ((InternalEList) getSubstitutions()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.CLASSIFIER__COLLABORATION_USE :
				return ((InternalEList) getCollaborationUses()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.CLASSIFIER__OWNED_USE_CASE :
				return ((InternalEList) getOwnedUseCases()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.CLASSIFIER__USE_CASE :
				return ((InternalEList) getUseCases()).basicRemove(otherEnd,
					msgs);
			case UMLPackage.CLASSIFIER__OWNED_SIGNATURE :
				return basicSetOwnedSignature(null, msgs);
		}
		return eDynamicInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eBasicRemoveFromContainerFeature(
			NotificationChain msgs) {
		switch (eContainerFeatureID) {
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
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UMLPackage.CLASSIFIER__EANNOTATIONS :
				return getEAnnotations();
			case UMLPackage.CLASSIFIER__OWNED_ELEMENT :
				return getOwnedElements();
			case UMLPackage.CLASSIFIER__OWNER :
				if (resolve)
					return getOwner();
				return basicGetOwner();
			case UMLPackage.CLASSIFIER__OWNED_COMMENT :
				return getOwnedComments();
			case UMLPackage.CLASSIFIER__NAME :
				return getName();
			case UMLPackage.CLASSIFIER__VISIBILITY :
				return getVisibility();
			case UMLPackage.CLASSIFIER__QUALIFIED_NAME :
				return getQualifiedName();
			case UMLPackage.CLASSIFIER__CLIENT_DEPENDENCY :
				return getClientDependencies();
			case UMLPackage.CLASSIFIER__NAMESPACE :
				if (resolve)
					return getNamespace();
				return basicGetNamespace();
			case UMLPackage.CLASSIFIER__NAME_EXPRESSION :
				return getNameExpression();
			case UMLPackage.CLASSIFIER__ELEMENT_IMPORT :
				return getElementImports();
			case UMLPackage.CLASSIFIER__PACKAGE_IMPORT :
				return getPackageImports();
			case UMLPackage.CLASSIFIER__OWNED_RULE :
				return getOwnedRules();
			case UMLPackage.CLASSIFIER__MEMBER :
				return getMembers();
			case UMLPackage.CLASSIFIER__IMPORTED_MEMBER :
				return getImportedMembers();
			case UMLPackage.CLASSIFIER__OWNED_MEMBER :
				return getOwnedMembers();
			case UMLPackage.CLASSIFIER__IS_LEAF :
				return isLeaf()
					? Boolean.TRUE
					: Boolean.FALSE;
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
				return getOwnedTemplateSignature();
			case UMLPackage.CLASSIFIER__IS_ABSTRACT :
				return isAbstract()
					? Boolean.TRUE
					: Boolean.FALSE;
			case UMLPackage.CLASSIFIER__GENERALIZATION :
				return getGeneralizations();
			case UMLPackage.CLASSIFIER__POWERTYPE_EXTENT :
				return getPowertypeExtents();
			case UMLPackage.CLASSIFIER__FEATURE :
				return getFeatures();
			case UMLPackage.CLASSIFIER__INHERITED_MEMBER :
				return getInheritedMembers();
			case UMLPackage.CLASSIFIER__REDEFINED_CLASSIFIER :
				return getRedefinedClassifiers();
			case UMLPackage.CLASSIFIER__GENERAL :
				return getGenerals();
			case UMLPackage.CLASSIFIER__SUBSTITUTION :
				return getSubstitutions();
			case UMLPackage.CLASSIFIER__ATTRIBUTE :
				return getAttributes();
			case UMLPackage.CLASSIFIER__REPRESENTATION :
				return getRepresentation();
			case UMLPackage.CLASSIFIER__COLLABORATION_USE :
				return getCollaborationUses();
			case UMLPackage.CLASSIFIER__OWNED_USE_CASE :
				return getOwnedUseCases();
			case UMLPackage.CLASSIFIER__USE_CASE :
				return getUseCases();
			case UMLPackage.CLASSIFIER__OWNED_SIGNATURE :
				return getOwnedSignature();
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
			case UMLPackage.CLASSIFIER__EANNOTATIONS :
				getEAnnotations().clear();
				getEAnnotations().addAll((Collection) newValue);
				return;
			case UMLPackage.CLASSIFIER__OWNED_COMMENT :
				getOwnedComments().clear();
				getOwnedComments().addAll((Collection) newValue);
				return;
			case UMLPackage.CLASSIFIER__NAME :
				setName((String) newValue);
				return;
			case UMLPackage.CLASSIFIER__VISIBILITY :
				setVisibility((VisibilityKind) newValue);
				return;
			case UMLPackage.CLASSIFIER__CLIENT_DEPENDENCY :
				getClientDependencies().clear();
				getClientDependencies().addAll((Collection) newValue);
				return;
			case UMLPackage.CLASSIFIER__NAME_EXPRESSION :
				setNameExpression((StringExpression) newValue);
				return;
			case UMLPackage.CLASSIFIER__ELEMENT_IMPORT :
				getElementImports().clear();
				getElementImports().addAll((Collection) newValue);
				return;
			case UMLPackage.CLASSIFIER__PACKAGE_IMPORT :
				getPackageImports().clear();
				getPackageImports().addAll((Collection) newValue);
				return;
			case UMLPackage.CLASSIFIER__OWNED_RULE :
				getOwnedRules().clear();
				getOwnedRules().addAll((Collection) newValue);
				return;
			case UMLPackage.CLASSIFIER__IS_LEAF :
				setIsLeaf(((Boolean) newValue).booleanValue());
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
				getTemplateBindings().addAll((Collection) newValue);
				return;
			case UMLPackage.CLASSIFIER__OWNED_TEMPLATE_SIGNATURE :
				setOwnedTemplateSignature((TemplateSignature) newValue);
				return;
			case UMLPackage.CLASSIFIER__IS_ABSTRACT :
				setIsAbstract(((Boolean) newValue).booleanValue());
				return;
			case UMLPackage.CLASSIFIER__GENERALIZATION :
				getGeneralizations().clear();
				getGeneralizations().addAll((Collection) newValue);
				return;
			case UMLPackage.CLASSIFIER__POWERTYPE_EXTENT :
				getPowertypeExtents().clear();
				getPowertypeExtents().addAll((Collection) newValue);
				return;
			case UMLPackage.CLASSIFIER__REDEFINED_CLASSIFIER :
				getRedefinedClassifiers().clear();
				getRedefinedClassifiers().addAll((Collection) newValue);
				return;
			case UMLPackage.CLASSIFIER__GENERAL :
				getGenerals().clear();
				getGenerals().addAll((Collection) newValue);
				return;
			case UMLPackage.CLASSIFIER__SUBSTITUTION :
				getSubstitutions().clear();
				getSubstitutions().addAll((Collection) newValue);
				return;
			case UMLPackage.CLASSIFIER__REPRESENTATION :
				setRepresentation((CollaborationUse) newValue);
				return;
			case UMLPackage.CLASSIFIER__COLLABORATION_USE :
				getCollaborationUses().clear();
				getCollaborationUses().addAll((Collection) newValue);
				return;
			case UMLPackage.CLASSIFIER__OWNED_USE_CASE :
				getOwnedUseCases().clear();
				getOwnedUseCases().addAll((Collection) newValue);
				return;
			case UMLPackage.CLASSIFIER__USE_CASE :
				getUseCases().clear();
				getUseCases().addAll((Collection) newValue);
				return;
			case UMLPackage.CLASSIFIER__OWNED_SIGNATURE :
				setOwnedSignature((RedefinableTemplateSignature) newValue);
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
			case UMLPackage.CLASSIFIER__EANNOTATIONS :
				getEAnnotations().clear();
				return;
			case UMLPackage.CLASSIFIER__OWNED_COMMENT :
				getOwnedComments().clear();
				return;
			case UMLPackage.CLASSIFIER__NAME :
				unsetName();
				return;
			case UMLPackage.CLASSIFIER__VISIBILITY :
				unsetVisibility();
				return;
			case UMLPackage.CLASSIFIER__CLIENT_DEPENDENCY :
				getClientDependencies().clear();
				return;
			case UMLPackage.CLASSIFIER__NAME_EXPRESSION :
				setNameExpression((StringExpression) null);
				return;
			case UMLPackage.CLASSIFIER__ELEMENT_IMPORT :
				getElementImports().clear();
				return;
			case UMLPackage.CLASSIFIER__PACKAGE_IMPORT :
				getPackageImports().clear();
				return;
			case UMLPackage.CLASSIFIER__OWNED_RULE :
				getOwnedRules().clear();
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
			case UMLPackage.CLASSIFIER__IS_ABSTRACT :
				setIsAbstract(IS_ABSTRACT_EDEFAULT);
				return;
			case UMLPackage.CLASSIFIER__GENERALIZATION :
				getGeneralizations().clear();
				return;
			case UMLPackage.CLASSIFIER__POWERTYPE_EXTENT :
				getPowertypeExtents().clear();
				return;
			case UMLPackage.CLASSIFIER__REDEFINED_CLASSIFIER :
				getRedefinedClassifiers().clear();
				return;
			case UMLPackage.CLASSIFIER__GENERAL :
				getGenerals().clear();
				return;
			case UMLPackage.CLASSIFIER__SUBSTITUTION :
				getSubstitutions().clear();
				return;
			case UMLPackage.CLASSIFIER__REPRESENTATION :
				setRepresentation((CollaborationUse) null);
				return;
			case UMLPackage.CLASSIFIER__COLLABORATION_USE :
				getCollaborationUses().clear();
				return;
			case UMLPackage.CLASSIFIER__OWNED_USE_CASE :
				getOwnedUseCases().clear();
				return;
			case UMLPackage.CLASSIFIER__USE_CASE :
				getUseCases().clear();
				return;
			case UMLPackage.CLASSIFIER__OWNED_SIGNATURE :
				setOwnedSignature((RedefinableTemplateSignature) null);
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
			case UMLPackage.CLASSIFIER__EANNOTATIONS :
				EList eAnnotations = (EList) eVirtualGet(UMLPackage.CLASSIFIER__EANNOTATIONS);
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UMLPackage.CLASSIFIER__OWNED_ELEMENT :
				return isSetOwnedElements();
			case UMLPackage.CLASSIFIER__OWNER :
				return isSetOwner();
			case UMLPackage.CLASSIFIER__OWNED_COMMENT :
				EList ownedComment = (EList) eVirtualGet(UMLPackage.CLASSIFIER__OWNED_COMMENT);
				return ownedComment != null && !ownedComment.isEmpty();
			case UMLPackage.CLASSIFIER__NAME :
				return isSetName();
			case UMLPackage.CLASSIFIER__VISIBILITY :
				return isSetVisibility();
			case UMLPackage.CLASSIFIER__QUALIFIED_NAME :
				return QUALIFIED_NAME_EDEFAULT == null
					? getQualifiedName() != null
					: !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case UMLPackage.CLASSIFIER__CLIENT_DEPENDENCY :
				EList clientDependency = (EList) eVirtualGet(UMLPackage.CLASSIFIER__CLIENT_DEPENDENCY);
				return clientDependency != null && !clientDependency.isEmpty();
			case UMLPackage.CLASSIFIER__NAMESPACE :
				return isSetNamespace();
			case UMLPackage.CLASSIFIER__NAME_EXPRESSION :
				return eVirtualGet(UMLPackage.CLASSIFIER__NAME_EXPRESSION) != null;
			case UMLPackage.CLASSIFIER__ELEMENT_IMPORT :
				EList elementImport = (EList) eVirtualGet(UMLPackage.CLASSIFIER__ELEMENT_IMPORT);
				return elementImport != null && !elementImport.isEmpty();
			case UMLPackage.CLASSIFIER__PACKAGE_IMPORT :
				EList packageImport = (EList) eVirtualGet(UMLPackage.CLASSIFIER__PACKAGE_IMPORT);
				return packageImport != null && !packageImport.isEmpty();
			case UMLPackage.CLASSIFIER__OWNED_RULE :
				EList ownedRule = (EList) eVirtualGet(UMLPackage.CLASSIFIER__OWNED_RULE);
				return ownedRule != null && !ownedRule.isEmpty();
			case UMLPackage.CLASSIFIER__MEMBER :
				return isSetMembers();
			case UMLPackage.CLASSIFIER__IMPORTED_MEMBER :
				return !getImportedMembers().isEmpty();
			case UMLPackage.CLASSIFIER__OWNED_MEMBER :
				return isSetOwnedMembers();
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
				EList templateBinding = (EList) eVirtualGet(UMLPackage.CLASSIFIER__TEMPLATE_BINDING);
				return templateBinding != null && !templateBinding.isEmpty();
			case UMLPackage.CLASSIFIER__OWNED_TEMPLATE_SIGNATURE :
				return eVirtualGet(UMLPackage.CLASSIFIER__OWNED_TEMPLATE_SIGNATURE) != null;
			case UMLPackage.CLASSIFIER__IS_ABSTRACT :
				return ((eFlags & IS_ABSTRACT_EFLAG) != 0) != IS_ABSTRACT_EDEFAULT;
			case UMLPackage.CLASSIFIER__GENERALIZATION :
				EList generalization = (EList) eVirtualGet(UMLPackage.CLASSIFIER__GENERALIZATION);
				return generalization != null && !generalization.isEmpty();
			case UMLPackage.CLASSIFIER__POWERTYPE_EXTENT :
				EList powertypeExtent = (EList) eVirtualGet(UMLPackage.CLASSIFIER__POWERTYPE_EXTENT);
				return powertypeExtent != null && !powertypeExtent.isEmpty();
			case UMLPackage.CLASSIFIER__FEATURE :
				return isSetFeatures();
			case UMLPackage.CLASSIFIER__INHERITED_MEMBER :
				return !getInheritedMembers().isEmpty();
			case UMLPackage.CLASSIFIER__REDEFINED_CLASSIFIER :
				EList redefinedClassifier = (EList) eVirtualGet(UMLPackage.CLASSIFIER__REDEFINED_CLASSIFIER);
				return redefinedClassifier != null
					&& !redefinedClassifier.isEmpty();
			case UMLPackage.CLASSIFIER__GENERAL :
				return !getGenerals().isEmpty();
			case UMLPackage.CLASSIFIER__SUBSTITUTION :
				EList substitution = (EList) eVirtualGet(UMLPackage.CLASSIFIER__SUBSTITUTION);
				return substitution != null && !substitution.isEmpty();
			case UMLPackage.CLASSIFIER__ATTRIBUTE :
				return isSetAttributes();
			case UMLPackage.CLASSIFIER__REPRESENTATION :
				return eVirtualGet(UMLPackage.CLASSIFIER__REPRESENTATION) != null;
			case UMLPackage.CLASSIFIER__COLLABORATION_USE :
				EList collaborationUse = (EList) eVirtualGet(UMLPackage.CLASSIFIER__COLLABORATION_USE);
				return collaborationUse != null && !collaborationUse.isEmpty();
			case UMLPackage.CLASSIFIER__OWNED_USE_CASE :
				EList ownedUseCase = (EList) eVirtualGet(UMLPackage.CLASSIFIER__OWNED_USE_CASE);
				return ownedUseCase != null && !ownedUseCase.isEmpty();
			case UMLPackage.CLASSIFIER__USE_CASE :
				EList useCase = (EList) eVirtualGet(UMLPackage.CLASSIFIER__USE_CASE);
				return useCase != null && !useCase.isEmpty();
			case UMLPackage.CLASSIFIER__OWNED_SIGNATURE :
				return eVirtualGet(UMLPackage.CLASSIFIER__OWNED_SIGNATURE) != null;
		}
		return eDynamicIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class baseClass) {
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
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class baseClass) {
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
	protected int eVirtualIndexBits(int offset) {
		switch (offset) {
			case 0 :
				return eVirtualIndexBits0;
			case 1 :
				return eVirtualIndexBits1;
			default :
				throw new IndexOutOfBoundsException();
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void eSetVirtualIndexBits(int offset, int newIndexBits) {
		switch (offset) {
			case 0 :
				eVirtualIndexBits0 = newIndexBits;
				break;
			case 1 :
				eVirtualIndexBits1 = newIndexBits;
				break;
			default :
				throw new IndexOutOfBoundsException();
		}
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
		result.append(" (isLeaf: "); //$NON-NLS-1$
		result.append((eFlags & IS_LEAF_EFLAG) != 0);
		result.append(", visibility: "); //$NON-NLS-1$
		result.append(eVirtualGet(UMLPackage.CLASSIFIER__VISIBILITY,
			VISIBILITY_EDEFAULT));
		result.append(", isAbstract: "); //$NON-NLS-1$
		result.append((eFlags & IS_ABSTRACT_EFLAG) != 0);
		result.append(')');
		return result.toString();
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
	public boolean isSetOwner() {
		return super.isSetOwner()
			|| eIsSet(UMLPackage.CLASSIFIER__OWNING_TEMPLATE_PARAMETER);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
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
	public boolean isSetNamespace() {
		return super.isSetNamespace() || eIsSet(UMLPackage.CLASSIFIER__PACKAGE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOwnedElements() {
		return super.isSetOwnedElements()
			|| eIsSet(UMLPackage.CLASSIFIER__TEMPLATE_BINDING)
			|| eIsSet(UMLPackage.CLASSIFIER__OWNED_TEMPLATE_SIGNATURE)
			|| eIsSet(UMLPackage.CLASSIFIER__GENERALIZATION)
			|| eIsSet(UMLPackage.CLASSIFIER__SUBSTITUTION)
			|| eIsSet(UMLPackage.CLASSIFIER__COLLABORATION_USE)
			|| eIsSet(UMLPackage.CLASSIFIER__OWNED_SIGNATURE);
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
	public boolean isSetMembers() {
		return super.isSetMembers() || isSetFeatures()
			|| eIsSet(UMLPackage.CLASSIFIER__INHERITED_MEMBER);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
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
	public boolean conformsToGen(Type other) {
		return conformsTo(other);
	}

	public boolean conformsTo(Type other) {
		return other instanceof Classifier && conformsTo((Classifier) other);
	}

} //ClassifierImpl
