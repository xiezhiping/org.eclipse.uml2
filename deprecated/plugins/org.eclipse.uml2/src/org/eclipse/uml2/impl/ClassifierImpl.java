/*
 * Copyright (c) 2003, 2005 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *
 * $Id: ClassifierImpl.java,v 1.37 2005/11/21 21:48:01 khussey Exp $
 */
package org.eclipse.uml2.impl;

import java.lang.reflect.Method;

import java.util.Collection;
import java.util.Collections;
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
import org.eclipse.uml2.UML2Factory;
import org.eclipse.uml2.UML2Package;
import org.eclipse.uml2.UseCase;
import org.eclipse.uml2.VisibilityKind;

import org.eclipse.uml2.common.util.CacheAdapter;
import org.eclipse.uml2.common.util.DerivedEObjectEList;
import org.eclipse.uml2.common.util.DerivedUnionEObjectEList;
import org.eclipse.uml2.common.util.SubsetEObjectContainmentWithInverseEList;
import org.eclipse.uml2.common.util.SupersetEObjectContainmentEList;
import org.eclipse.uml2.common.util.SupersetEObjectWithInverseResolvingEList;
import org.eclipse.uml2.common.util.UnionEObjectEList;

import org.eclipse.uml2.internal.operation.ClassifierOperations;
import org.eclipse.uml2.internal.operation.RedefinableElementOperations;
import org.eclipse.uml2.internal.operation.TypeOperations;

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
 *   <li>{@link org.eclipse.uml2.impl.ClassifierImpl#getAttributes <em>Attribute</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.ClassifierImpl#getClientDependencies <em>Client Dependency</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.ClassifierImpl#getOccurrences <em>Occurrence</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.ClassifierImpl#isAbstract <em>Is Abstract</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.ClassifierImpl#getInheritedMembers <em>Inherited Member</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.ClassifierImpl#getGenerals <em>General</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.ClassifierImpl#getGeneralizations <em>Generalization</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.ClassifierImpl#getRedefinedClassifiers <em>Redefined Classifier</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.ClassifierImpl#getSubstitutions <em>Substitution</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.ClassifierImpl#getPowertypeExtents <em>Powertype Extent</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.ClassifierImpl#getOwnedUseCases <em>Owned Use Case</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.ClassifierImpl#getUseCases <em>Use Case</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.ClassifierImpl#getRepresentation <em>Representation</em>}</li>
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
	public static final String copyright = "Copyright (c) IBM Corporation and others."; //$NON-NLS-1$

	/**
	 * A bit field representing the indices of non-primitive feature values.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected int eVirtualIndexBits1 = 0;

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
		return UML2Package.eINSTANCE.getClassifier();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemplateParameter getTemplateParameter() {
		TemplateParameter templateParameter = (TemplateParameter)eVirtualGet(UML2Package.CLASSIFIER__TEMPLATE_PARAMETER);
		if (templateParameter != null && templateParameter.eIsProxy()) {
			InternalEObject oldTemplateParameter = (InternalEObject)templateParameter;
			templateParameter = (TemplateParameter)eResolveProxy(oldTemplateParameter);
			if (templateParameter != oldTemplateParameter) {
				eVirtualSet(UML2Package.CLASSIFIER__TEMPLATE_PARAMETER, templateParameter);
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
		return (TemplateParameter)eVirtualGet(UML2Package.CLASSIFIER__TEMPLATE_PARAMETER);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTemplateParameter(TemplateParameter newTemplateParameter, NotificationChain msgs) {
		Object oldTemplateParameter = eVirtualSet(UML2Package.CLASSIFIER__TEMPLATE_PARAMETER, newTemplateParameter);
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UML2Package.CLASSIFIER__TEMPLATE_PARAMETER, oldTemplateParameter == EVIRTUAL_NO_VALUE ? null : oldTemplateParameter, newTemplateParameter);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}

		if (getOwningParameter() != null && getOwningParameter() != newTemplateParameter) {
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
		TemplateParameter templateParameter = (TemplateParameter)eVirtualGet(UML2Package.CLASSIFIER__TEMPLATE_PARAMETER);
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
			eNotify(new ENotificationImpl(this, Notification.SET, UML2Package.CLASSIFIER__TEMPLATE_PARAMETER, newTemplateParameter, newTemplateParameter));

	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemplateParameter getOwningParameter() {
		if (eContainerFeatureID != UML2Package.CLASSIFIER__OWNING_PARAMETER) return null;
		return (TemplateParameter)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwningParameter(TemplateParameter newOwningParameter) {
		EObject oldOwningParameter = eContainer();
		if (newOwningParameter != eInternalContainer() || (eContainerFeatureID != UML2Package.CLASSIFIER__OWNING_PARAMETER && newOwningParameter != null)) {
			if (EcoreUtil.isAncestor(this, newOwningParameter))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString()); //$NON-NLS-1$
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOwningParameter != null)
				msgs = ((InternalEObject)newOwningParameter).eInverseAdd(this, UML2Package.TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT, TemplateParameter.class, msgs);
			msgs = eBasicSetContainer((InternalEObject)newOwningParameter, UML2Package.CLASSIFIER__OWNING_PARAMETER, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2Package.CLASSIFIER__OWNING_PARAMETER, newOwningParameter, newOwningParameter));

		if (newOwningParameter != null || oldOwningParameter == eVirtualGet(UML2Package.CLASSIFIER__TEMPLATE_PARAMETER)) {
			setTemplateParameter(newOwningParameter);
		}
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public VisibilityKind getPackageableElement_visibility() {
		VisibilityKind packageableElement_visibility = (VisibilityKind)eVirtualGet(UML2Package.CLASSIFIER__PACKAGEABLE_ELEMENT_VISIBILITY);
		return packageableElement_visibility == null ? PACKAGEABLE_ELEMENT_VISIBILITY_EDEFAULT : packageableElement_visibility;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void setPackageableElement_visibility(VisibilityKind newPackageableElement_visibility) {
		VisibilityKind packageableElement_visibility = newPackageableElement_visibility == null ? PACKAGEABLE_ELEMENT_VISIBILITY_EDEFAULT : newPackageableElement_visibility;
		Object oldPackageableElement_visibility = eVirtualSet(UML2Package.CLASSIFIER__PACKAGEABLE_ELEMENT_VISIBILITY, packageableElement_visibility);
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2Package.CLASSIFIER__PACKAGEABLE_ELEMENT_VISIBILITY, oldPackageableElement_visibility == EVIRTUAL_NO_VALUE ? PACKAGEABLE_ELEMENT_VISIBILITY_EDEFAULT : oldPackageableElement_visibility, packageableElement_visibility));
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean isSetPackageableElement_visibility() {
		return eVirtualIsSet(UML2Package.PACKAGEABLE_ELEMENT__PACKAGEABLE_ELEMENT_VISIBILITY) && eVirtualGet(UML2Package.PACKAGEABLE_ELEMENT__PACKAGEABLE_ELEMENT_VISIBILITY) != PACKAGEABLE_ELEMENT_VISIBILITY_EDEFAULT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public org.eclipse.uml2.Package getPackage() {
		return eContainer instanceof org.eclipse.uml2.Package ? (org.eclipse.uml2.Package) eContainer() : null;
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
		if (newIsLeaf) eFlags |= IS_LEAF_EFLAG; else eFlags &= ~IS_LEAF_EFLAG;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2Package.CLASSIFIER__IS_LEAF, oldIsLeaf, newIsLeaf));

	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList getRedefinitionContexts() {
		EList redefinitionContext = (EList)eVirtualGet(UML2Package.CLASSIFIER__REDEFINITION_CONTEXT);
		if (redefinitionContext == null) {
			eVirtualSet(UML2Package.CLASSIFIER__REDEFINITION_CONTEXT, redefinitionContext = new DerivedEObjectEList(Classifier.class, this, UML2Package.CLASSIFIER__REDEFINITION_CONTEXT, new EStructuralFeature[] {UML2Package.eINSTANCE.getElement_Owner()}));
		}
		return redefinitionContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean isSetRedefinitionContexts() {
		return basicGetOwner() instanceof Classifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
    public Classifier getRedefinitionContext(String name) {
		for (Iterator i = getRedefinitionContexts().iterator(); i.hasNext(); ) {
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
	protected EList getRedefinedElementsHelper(EList redefinedElement) {
		EList redefinedClassifier = getRedefinedClassifiers();
		if (!redefinedClassifier.isEmpty()) {
			for (Iterator i = ((InternalEList) redefinedClassifier).basicIterator(); i.hasNext(); ) {
				redefinedElement.add(i.next());
			}
		}
		return redefinedElement;
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
		if (newIsAbstract) eFlags |= IS_ABSTRACT_EFLAG; else eFlags &= ~IS_ABSTRACT_EFLAG;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2Package.CLASSIFIER__IS_ABSTRACT, oldIsAbstract, newIsAbstract));

	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getFeatures() {
		EList feature = (EList)eVirtualGet(UML2Package.CLASSIFIER__FEATURE);
		if (feature == null) {
			eVirtualSet(UML2Package.CLASSIFIER__FEATURE, feature = new DerivedUnionEObjectEList(Feature.class, this, UML2Package.CLASSIFIER__FEATURE, new EStructuralFeature[] {UML2Package.eINSTANCE.getClassifier_Attribute()}));
		}
		return feature;
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
    public Feature getFeature(String name) {
		for (Iterator i = getFeatures().iterator(); i.hasNext(); ) {
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
	protected EList getMembersHelper(EList member) {
		super.getMembersHelper(member);
		if (isSetFeatures()) {
			for (Iterator i = ((InternalEList) getFeatures()).basicIterator(); i.hasNext(); ) {
				member.add(i.next());
			}
		}
		EList inheritedMember = getInheritedMembers();
		if (!inheritedMember.isEmpty()) {
			for (Iterator i = ((InternalEList) inheritedMember).basicIterator(); i.hasNext(); ) {
				member.add(i.next());
			}
		}
		return member;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMembers() {
		return super.isSetMembers()
			|| isSetFeatures()
			|| eIsSet(UML2Package.eINSTANCE.getClassifier_InheritedMember());
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EList getOwnedElementsHelper(EList ownedElement) {
		super.getOwnedElementsHelper(ownedElement);
		EList generalization = getGeneralizations();
		if (!generalization.isEmpty()) {
			ownedElement.addAll(generalization);
		}
		EList substitution = getSubstitutions();
		if (!substitution.isEmpty()) {
			ownedElement.addAll(substitution);
		}
		EList occurrence = getOccurrences();
		if (!occurrence.isEmpty()) {
			ownedElement.addAll(occurrence);
		}
		return ownedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOwnedElements() {
		return super.isSetOwnedElements()
			|| eIsSet(UML2Package.eINSTANCE.getClassifier_Generalization())
			|| eIsSet(UML2Package.eINSTANCE.getClassifier_Substitution())
			|| eIsSet(UML2Package.eINSTANCE.getClassifier_Occurrence());
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList getInheritedMembers() {
		CacheAdapter cache = getCacheAdapter();

		if (cache != null) {
			EList result = (EList) cache.get(this, UML2Package.eINSTANCE
				.getClassifier_InheritedMember());

			if (result == null) {
				Set inheritedMember = inheritedMember();
				cache.put(this, UML2Package.eINSTANCE
					.getClassifier_InheritedMember(),
					result = new EcoreEList.UnmodifiableEList(this,
						UML2Package.eINSTANCE.getClassifier_InheritedMember(),
						inheritedMember.size(), inheritedMember.toArray()));
			}

			return result;
		}

		Set inheritedMember = inheritedMember();
		return new EcoreEList.UnmodifiableEList(this, UML2Package.eINSTANCE
			.getClassifier_InheritedMember(), inheritedMember.size(),
			inheritedMember.toArray());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
    public NamedElement getInheritedMember(String name) {
		for (Iterator i = getInheritedMembers().iterator(); i.hasNext(); ) {
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
	 * @generated NOT
	 */
	public EList getGenerals() {
		CacheAdapter cache = getCacheAdapter();

		if (cache != null) {
			EList result = (EList) cache.get(eResource(), this,
				UML2Package.eINSTANCE.getClassifier_General());

			if (result == null) {
				Set general = general();
				cache.put(eResource(), this, UML2Package.eINSTANCE
					.getClassifier_General(),
					result = new EcoreEList.UnmodifiableEList(this,
						UML2Package.eINSTANCE.getClassifier_General(), general
							.size(), general.toArray()));
			}

			return result;
		}

		Set general = general();
		return new EcoreEList.UnmodifiableEList(this, UML2Package.eINSTANCE
			.getClassifier_General(), general.size(), general.toArray());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
    public Classifier getGeneral(String name) {
		for (Iterator i = getGenerals().iterator(); i.hasNext(); ) {
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
	public EList getGeneralizations() {
		EList generalization = (EList)eVirtualGet(UML2Package.CLASSIFIER__GENERALIZATION);
		if (generalization == null) {
			eVirtualSet(UML2Package.CLASSIFIER__GENERALIZATION, generalization = new EObjectContainmentWithInverseEList(Generalization.class, this, UML2Package.CLASSIFIER__GENERALIZATION, UML2Package.GENERALIZATION__SPECIFIC));
		}
		return generalization;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 * @deprecated Use #createGeneralization() instead.
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
	 * @generated NOT
	 */
	public Generalization createGeneralization() {
		Generalization newGeneralization = UML2Factory.eINSTANCE.createGeneralization();
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
		EList attribute = (EList)eVirtualGet(UML2Package.CLASSIFIER__ATTRIBUTE);
		if (attribute == null) {
			eVirtualSet(UML2Package.CLASSIFIER__ATTRIBUTE, attribute = new DerivedUnionEObjectEList(Property.class, this, UML2Package.CLASSIFIER__ATTRIBUTE, new EStructuralFeature[] {}));
		}
		return attribute;
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
    public Property getAttribute(String name) {
		for (Iterator i = getAttributes().iterator(); i.hasNext(); ) {
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
	protected EList getOwnedMembersHelper(EList ownedMember) {
		super.getOwnedMembersHelper(ownedMember);
		EList ownedUseCase = getOwnedUseCases();
		if (!ownedUseCase.isEmpty()) {
			ownedMember.addAll(ownedUseCase);
		}
		return ownedMember;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOwnedMembers() {
		return super.isSetOwnedMembers()
			|| eIsSet(UML2Package.eINSTANCE.getClassifier_OwnedUseCase());
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getRedefinedClassifiers() {
		EList redefinedClassifier = (EList)eVirtualGet(UML2Package.CLASSIFIER__REDEFINED_CLASSIFIER);
		if (redefinedClassifier == null) {
			eVirtualSet(UML2Package.CLASSIFIER__REDEFINED_CLASSIFIER, redefinedClassifier = new EObjectResolvingEList(Classifier.class, this, UML2Package.CLASSIFIER__REDEFINED_CLASSIFIER));
		}
		return redefinedClassifier;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
    public Classifier getRedefinedClassifier(String name) {
		for (Iterator i = getRedefinedClassifiers().iterator(); i.hasNext(); ) {
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
	public EList getSubstitutions() {
		EList substitution = (EList)eVirtualGet(UML2Package.CLASSIFIER__SUBSTITUTION);
		if (substitution == null) {
			eVirtualSet(UML2Package.CLASSIFIER__SUBSTITUTION, substitution = new SubsetEObjectContainmentWithInverseEList(Substitution.class, this, UML2Package.CLASSIFIER__SUBSTITUTION, new int[] {UML2Package.CLASSIFIER__CLIENT_DEPENDENCY}, UML2Package.SUBSTITUTION__SUBSTITUTING_CLASSIFIER));
		}
		return substitution;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
    public Substitution getSubstitution(String name) {
		for (Iterator i = getSubstitutions().iterator(); i.hasNext(); ) {
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
	 * @generated NOT
	 * @deprecated Use #createSubstitution() instead.
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
	 * @generated NOT
	 */
	public Substitution createSubstitution() {
		Substitution newSubstitution = UML2Factory.eINSTANCE.createSubstitution();
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
		EList powertypeExtent = (EList)eVirtualGet(UML2Package.CLASSIFIER__POWERTYPE_EXTENT);
		if (powertypeExtent == null) {
			eVirtualSet(UML2Package.CLASSIFIER__POWERTYPE_EXTENT, powertypeExtent = new EObjectWithInverseResolvingEList(GeneralizationSet.class, this, UML2Package.CLASSIFIER__POWERTYPE_EXTENT, UML2Package.GENERALIZATION_SET__POWERTYPE));
		}
		return powertypeExtent;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
    public GeneralizationSet getPowertypeExtent(String name) {
		for (Iterator i = getPowertypeExtents().iterator(); i.hasNext(); ) {
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
	public EList getOwnedUseCases() {
		EList ownedUseCase = (EList)eVirtualGet(UML2Package.CLASSIFIER__OWNED_USE_CASE);
		if (ownedUseCase == null) {
			eVirtualSet(UML2Package.CLASSIFIER__OWNED_USE_CASE, ownedUseCase = new EObjectContainmentEList(UseCase.class, this, UML2Package.CLASSIFIER__OWNED_USE_CASE));
		}
		return ownedUseCase;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
    public UseCase getOwnedUseCase(String name) {
		for (Iterator i = getOwnedUseCases().iterator(); i.hasNext(); ) {
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
	 * @generated NOT
	 * @deprecated Use #createOwnedUseCase() instead.
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
	 * @generated NOT
	 */
	public UseCase createOwnedUseCase() {
		UseCase newOwnedUseCase = UML2Factory.eINSTANCE.createUseCase();
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
		EList useCase = (EList)eVirtualGet(UML2Package.CLASSIFIER__USE_CASE);
		if (useCase == null) {
			eVirtualSet(UML2Package.CLASSIFIER__USE_CASE, useCase = new EObjectWithInverseResolvingEList.ManyInverse(UseCase.class, this, UML2Package.CLASSIFIER__USE_CASE, UML2Package.USE_CASE__SUBJECT));
		}
		return useCase;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
    public UseCase getUseCase(String name) {
		for (Iterator i = getUseCases().iterator(); i.hasNext(); ) {
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
	public CollaborationOccurrence getRepresentation() {
		CollaborationOccurrence representation = (CollaborationOccurrence)eVirtualGet(UML2Package.CLASSIFIER__REPRESENTATION);
		return representation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRepresentation(CollaborationOccurrence newRepresentation) {
		if (newRepresentation != null && !getOccurrences().contains(newRepresentation)) {
			getOccurrences().add(newRepresentation);
		}
		CollaborationOccurrence representation = newRepresentation;
		Object oldRepresentation = eVirtualSet(UML2Package.CLASSIFIER__REPRESENTATION, representation);
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2Package.CLASSIFIER__REPRESENTATION, oldRepresentation == EVIRTUAL_NO_VALUE ? null : oldRepresentation, representation));

	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getOccurrences() {
		EList occurrence = (EList)eVirtualGet(UML2Package.CLASSIFIER__OCCURRENCE);
		if (occurrence == null) {
			eVirtualSet(UML2Package.CLASSIFIER__OCCURRENCE, occurrence = new SupersetEObjectContainmentEList(CollaborationOccurrence.class, this, UML2Package.CLASSIFIER__OCCURRENCE, new int[] {UML2Package.CLASSIFIER__REPRESENTATION}));
		}
		return occurrence;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
    public CollaborationOccurrence getOccurrence(String name) {
		for (Iterator i = getOccurrences().iterator(); i.hasNext(); ) {
			CollaborationOccurrence occurrence = (CollaborationOccurrence) i.next();
			if (name.equals(occurrence.getName())) {
				return occurrence;
			}
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 * @deprecated Use #createOccurrence() instead.
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
	 * @generated NOT
	 */
	public CollaborationOccurrence createOccurrence() {
		CollaborationOccurrence newOccurrence = UML2Factory.eINSTANCE.createCollaborationOccurrence();
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
		TemplateParameter owningParameter = getOwningParameter();			
		if (owningParameter != null) {
			return owningParameter;
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
			|| eIsSet(UML2Package.eINSTANCE.getParameterableElement_OwningParameter());
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
	public boolean isSetVisibility() {
  		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean conformsTo(Type other) {
		return conformsTo((Classifier) other);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRedefinitionContextValid(DiagnosticChain diagnostics, Map context) {
		return RedefinableElementOperations.validateRedefinitionContextValid(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRedefinitionConsistent(DiagnosticChain diagnostics, Map context) {
		return RedefinableElementOperations.validateRedefinitionConsistent(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Namespace basicGetNamespace() {
		org.eclipse.uml2.Package package_ = getPackage();			
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
		return super.isSetNamespace()
			|| eIsSet(UML2Package.eINSTANCE.getType_Package());
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
	public boolean isRedefinitionContextValid(RedefinableElement redefinable) {
		return RedefinableElementOperations.isRedefinitionContextValid(this, redefinable);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Set allFeatures() {
		CacheAdapter cache = getCacheAdapter();
		if (cache != null) {
			Set result = (Set) cache.get(this, UML2Package.eINSTANCE.getClassifier().getEOperations().get(0));
			if (result == null) {
				cache.put(this, UML2Package.eINSTANCE.getClassifier().getEOperations().get(0), result = ClassifierOperations.allFeatures(this));
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
	public boolean validateNoCyclesInGeneralization(DiagnosticChain diagnostics, Map context) {
		return ClassifierOperations.validateNoCyclesInGeneralization(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSpecializeType(DiagnosticChain diagnostics, Map context) {
		return ClassifierOperations.validateSpecializeType(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInheritedMember(DiagnosticChain diagnostics, Map context) {
		return ClassifierOperations.validateInheritedMember(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Set inheritedMember() {
		CacheAdapter cache = getCacheAdapter();
		if (cache != null) {
			Set result = (Set) cache.get(this, UML2Package.eINSTANCE.getClassifier().getEOperations().get(4));
			if (result == null) {
				cache.put(this, UML2Package.eINSTANCE.getClassifier().getEOperations().get(4), result = ClassifierOperations.inheritedMember(this));
			}
			return result;
		}
		return ClassifierOperations.inheritedMember(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Set parents() {
		CacheAdapter cache = getCacheAdapter();
		if (cache != null) {
			Set result = (Set) cache.get(eResource(), this, UML2Package.eINSTANCE.getClassifier().getEOperations().get(5));
			if (result == null) {
				cache.put(eResource(), this, UML2Package.eINSTANCE.getClassifier().getEOperations().get(5), result = ClassifierOperations.parents(this));
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
	public Set allParents() {
		CacheAdapter cache = getCacheAdapter();
		if (cache != null) {
			Set result = (Set) cache.get(this, UML2Package.eINSTANCE.getClassifier().getEOperations().get(6));
			if (result == null) {
				cache.put(this, UML2Package.eINSTANCE.getClassifier().getEOperations().get(6), result = ClassifierOperations.allParents(this));
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
	public Set inheritableMembers(Classifier c) {
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
	public Set inherit(Set inhs) {
		return ClassifierOperations.inherit(this, inhs);
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
	public Set general() {
		CacheAdapter cache = getCacheAdapter();
		if (cache != null) {
			Set result = (Set) cache.get(eResource(), this, UML2Package.eINSTANCE.getClassifier().getEOperations().get(11));
			if (result == null) {
				cache.put(eResource(), this, UML2Package.eINSTANCE.getClassifier().getEOperations().get(11), result = ClassifierOperations.general(this));
			}
			return result;
		}
		return ClassifierOperations.general(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralEqualsParents(DiagnosticChain diagnostics, Map context) {
		return ClassifierOperations.validateGeneralEqualsParents(this, diagnostics, context);
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
	public EList getRedefinedElements() {
		CacheAdapter cache = getCacheAdapter();
		if (cache != null) {
			try {
				Method method = getClass().getMethod("getRedefinedElements", null); //$NON-NLS-1$
				EList redefinedElement = (EList) cache.get(eResource(), this, method);
				if (redefinedElement == null) {
					List union = getRedefinedElementsHelper(new UniqueEList());
					cache.put(eResource(), this, method, redefinedElement = new UnionEObjectEList(this, null, union.size(), union.toArray()));
				}
				return redefinedElement;
			} catch (NoSuchMethodException nsme) {
				// ignore
			}
		}
		List union = getRedefinedElementsHelper(new UniqueEList());
		return new UnionEObjectEList(this, null, union.size(), union.toArray());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRedefinedElements() {
		return eIsSet(UML2Package.eINSTANCE.getClassifier_RedefinedClassifier());
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
    public RedefinableElement getRedefinedElement(String name) {
		for (Iterator i = getRedefinedElements().iterator(); i.hasNext(); ) {
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
	public EList getClientDependencies() {
		EList clientDependency = (EList)eVirtualGet(UML2Package.CLASSIFIER__CLIENT_DEPENDENCY);
		if (clientDependency == null) {
			eVirtualSet(UML2Package.CLASSIFIER__CLIENT_DEPENDENCY, clientDependency = new SupersetEObjectWithInverseResolvingEList.ManyInverse(Dependency.class, this, UML2Package.CLASSIFIER__CLIENT_DEPENDENCY, new int[] {UML2Package.CLASSIFIER__SUBSTITUTION}, UML2Package.DEPENDENCY__CLIENT));
		}
		return clientDependency;
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
					TemplateSignature ownedTemplateSignature = (TemplateSignature)eVirtualGet(UML2Package.CLASSIFIER__OWNED_TEMPLATE_SIGNATURE);
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
					TemplateParameter templateParameter = (TemplateParameter)eVirtualGet(UML2Package.CLASSIFIER__TEMPLATE_PARAMETER);
					if (templateParameter != null)
						msgs = ((InternalEObject)templateParameter).eInverseRemove(this, UML2Package.TEMPLATE_PARAMETER__PARAMETERED_ELEMENT, TemplateParameter.class, msgs);
					return basicSetTemplateParameter((TemplateParameter)otherEnd, msgs);
				case UML2Package.CLASSIFIER__OWNING_PARAMETER:
					if (eInternalContainer() != null)
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
		if (eInternalContainer() != null)
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
					return eInternalContainer().eInverseRemove(this, UML2Package.TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT, TemplateParameter.class, msgs);
				default:
					return eDynamicBasicRemoveFromContainer(msgs);
			}
		}
		return eInternalContainer().eInverseRemove(this, EOPPOSITE_FEATURE_BASE - eContainerFeatureID, null, msgs);
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
				return getPackage();
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
				setOwningParameter((TemplateParameter)null);
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
				return isSetOwnedElements();
			case UML2Package.CLASSIFIER__OWNER:
				return isSetOwner();
			case UML2Package.CLASSIFIER__OWNED_COMMENT:
				EList ownedComment = (EList)eVirtualGet(UML2Package.CLASSIFIER__OWNED_COMMENT);
				return ownedComment != null && !ownedComment.isEmpty();
			case UML2Package.CLASSIFIER__TEMPLATE_BINDING:
				EList templateBinding = (EList)eVirtualGet(UML2Package.CLASSIFIER__TEMPLATE_BINDING);
				return templateBinding != null && !templateBinding.isEmpty();
			case UML2Package.CLASSIFIER__OWNED_TEMPLATE_SIGNATURE:
				return eVirtualGet(UML2Package.CLASSIFIER__OWNED_TEMPLATE_SIGNATURE) != null;
			case UML2Package.CLASSIFIER__NAME:
				String name = eVirtualIsSet(UML2Package.CLASSIFIER__NAME) ? (String)eVirtualGet(UML2Package.CLASSIFIER__NAME) : NAME_EDEFAULT;
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case UML2Package.CLASSIFIER__QUALIFIED_NAME:
				return QUALIFIED_NAME_EDEFAULT == null ? getQualifiedName() != null : !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case UML2Package.CLASSIFIER__VISIBILITY:
				return eVirtualIsSet(UML2Package.CLASSIFIER__VISIBILITY) && eVirtualGet(UML2Package.CLASSIFIER__VISIBILITY) != VISIBILITY_EDEFAULT;
			case UML2Package.CLASSIFIER__CLIENT_DEPENDENCY:
				EList clientDependency = (EList)eVirtualGet(UML2Package.CLASSIFIER__CLIENT_DEPENDENCY);
				return clientDependency != null && !clientDependency.isEmpty();
			case UML2Package.CLASSIFIER__NAME_EXPRESSION:
				return eVirtualGet(UML2Package.CLASSIFIER__NAME_EXPRESSION) != null;
			case UML2Package.CLASSIFIER__MEMBER:
				return isSetMembers();
			case UML2Package.CLASSIFIER__OWNED_RULE:
				EList ownedRule = (EList)eVirtualGet(UML2Package.CLASSIFIER__OWNED_RULE);
				return ownedRule != null && !ownedRule.isEmpty();
			case UML2Package.CLASSIFIER__IMPORTED_MEMBER:
				return !getImportedMembers().isEmpty();
			case UML2Package.CLASSIFIER__ELEMENT_IMPORT:
				EList elementImport = (EList)eVirtualGet(UML2Package.CLASSIFIER__ELEMENT_IMPORT);
				return elementImport != null && !elementImport.isEmpty();
			case UML2Package.CLASSIFIER__PACKAGE_IMPORT:
				EList packageImport = (EList)eVirtualGet(UML2Package.CLASSIFIER__PACKAGE_IMPORT);
				return packageImport != null && !packageImport.isEmpty();
			case UML2Package.CLASSIFIER__TEMPLATE_PARAMETER:
				return eVirtualGet(UML2Package.CLASSIFIER__TEMPLATE_PARAMETER) != null;
			case UML2Package.CLASSIFIER__OWNING_PARAMETER:
				return getOwningParameter() != null;
			case UML2Package.CLASSIFIER__PACKAGEABLE_ELEMENT_VISIBILITY:
				return isSetPackageableElement_visibility();
			case UML2Package.CLASSIFIER__PACKAGE:
				return getPackage() != null;
			case UML2Package.CLASSIFIER__REDEFINITION_CONTEXT:
				return isSetRedefinitionContexts();
			case UML2Package.CLASSIFIER__IS_LEAF:
				return ((eFlags & IS_LEAF_EFLAG) != 0) != IS_LEAF_EDEFAULT;
			case UML2Package.CLASSIFIER__FEATURE:
				return isSetFeatures();
			case UML2Package.CLASSIFIER__IS_ABSTRACT:
				return ((eFlags & IS_ABSTRACT_EFLAG) != 0) != IS_ABSTRACT_EDEFAULT;
			case UML2Package.CLASSIFIER__INHERITED_MEMBER:
				return !getInheritedMembers().isEmpty();
			case UML2Package.CLASSIFIER__GENERAL:
				return !getGenerals().isEmpty();
			case UML2Package.CLASSIFIER__GENERALIZATION:
				EList generalization = (EList)eVirtualGet(UML2Package.CLASSIFIER__GENERALIZATION);
				return generalization != null && !generalization.isEmpty();
			case UML2Package.CLASSIFIER__ATTRIBUTE:
				return isSetAttributes();
			case UML2Package.CLASSIFIER__REDEFINED_CLASSIFIER:
				EList redefinedClassifier = (EList)eVirtualGet(UML2Package.CLASSIFIER__REDEFINED_CLASSIFIER);
				return redefinedClassifier != null && !redefinedClassifier.isEmpty();
			case UML2Package.CLASSIFIER__SUBSTITUTION:
				EList substitution = (EList)eVirtualGet(UML2Package.CLASSIFIER__SUBSTITUTION);
				return substitution != null && !substitution.isEmpty();
			case UML2Package.CLASSIFIER__POWERTYPE_EXTENT:
				EList powertypeExtent = (EList)eVirtualGet(UML2Package.CLASSIFIER__POWERTYPE_EXTENT);
				return powertypeExtent != null && !powertypeExtent.isEmpty();
			case UML2Package.CLASSIFIER__OWNED_USE_CASE:
				EList ownedUseCase = (EList)eVirtualGet(UML2Package.CLASSIFIER__OWNED_USE_CASE);
				return ownedUseCase != null && !ownedUseCase.isEmpty();
			case UML2Package.CLASSIFIER__USE_CASE:
				EList useCase = (EList)eVirtualGet(UML2Package.CLASSIFIER__USE_CASE);
				return useCase != null && !useCase.isEmpty();
			case UML2Package.CLASSIFIER__REPRESENTATION:
				return eVirtualGet(UML2Package.CLASSIFIER__REPRESENTATION) != null;
			case UML2Package.CLASSIFIER__OCCURRENCE:
				EList occurrence = (EList)eVirtualGet(UML2Package.CLASSIFIER__OCCURRENCE);
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
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (isLeaf: "); //$NON-NLS-1$
		result.append((eFlags & IS_LEAF_EFLAG) != 0);
		result.append(", isAbstract: "); //$NON-NLS-1$
		result.append((eFlags & IS_ABSTRACT_EFLAG) != 0);
		result.append(')');
		return result.toString();
	}


	// <!-- begin-custom-operations -->

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.uml2.Type#createAssociation(boolean,
	 *      org.eclipse.uml2.AggregationKind, java.lang.String, int, int,
	 *      org.eclipse.uml2.Type, boolean,
	 *      org.eclipse.uml2.AggregationKind, java.lang.String, int, int)
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

	private static Method GET_USED_INTERFACES = null;

	static {
		try {
			GET_USED_INTERFACES = ClassifierImpl.class.getMethod(
				"getUsedInterfaces", null); //$NON-NLS-1$
		} catch (Exception e) {
			// ignore
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.uml2.Classifier#getUsedInterfaces()
	 */
	public Set getUsedInterfaces() {
		CacheAdapter cache = getCacheAdapter();

		if (cache != null) {
			Set result = (Set) cache.get(this, GET_USED_INTERFACES);

			if (result == null) {
				cache.put(this, GET_USED_INTERFACES, result = Collections
					.unmodifiableSet(ClassifierOperations
						.getUsedInterfaces(this)));
			}

			return result;
		}

		return Collections.unmodifiableSet(ClassifierOperations
			.getUsedInterfaces(this));
	}

	private static Method GET_ALL_ATTRIBUTES = null;

	static {
		try {
			GET_ALL_ATTRIBUTES = ClassifierImpl.class.getMethod(
				"getAllAttributes", null); //$NON-NLS-1$
		} catch (Exception e) {
			// ignore
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.uml2.Classifier#getAllAttributes()
	 */
	public Set getAllAttributes() {
		CacheAdapter cache = getCacheAdapter();

		if (cache != null) {
			Set result = (Set) cache.get(this, GET_ALL_ATTRIBUTES);

			if (result == null) {
				cache.put(this, GET_ALL_ATTRIBUTES, result = Collections
					.unmodifiableSet(ClassifierOperations
						.getAllAttributes(this)));
			}

			return result;
		}

		return Collections.unmodifiableSet(ClassifierOperations
			.getAllAttributes(this));
	}

	// <!-- end-custom-operations -->

} //ClassifierImpl
