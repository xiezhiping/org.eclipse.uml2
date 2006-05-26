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
 * $Id: UseCaseImpl.java,v 1.32 2006/05/26 18:16:44 khussey Exp $
 */
package org.eclipse.uml2.impl;

import java.lang.reflect.Method;

import java.util.Collection;
import java.util.Iterator;

import java.util.List;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.common.util.UniqueEList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.uml2.Behavior;
import org.eclipse.uml2.Classifier;
import org.eclipse.uml2.CollaborationOccurrence;
import org.eclipse.uml2.Extend;
import org.eclipse.uml2.ExtensionPoint;
import org.eclipse.uml2.Include;
import org.eclipse.uml2.StringExpression;
import org.eclipse.uml2.TemplateParameter;
import org.eclipse.uml2.TemplateSignature;
import org.eclipse.uml2.UML2Factory;
import org.eclipse.uml2.UML2Package;
import org.eclipse.uml2.UseCase;
import org.eclipse.uml2.VisibilityKind;

import org.eclipse.uml2.common.util.CacheAdapter;
import org.eclipse.uml2.common.util.UnionEObjectEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Use Case</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2.impl.UseCaseImpl#getOwnedMembers <em>Owned Member</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.UseCaseImpl#getIncludes <em>Include</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.UseCaseImpl#getExtends <em>Extend</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.UseCaseImpl#getExtensionPoints <em>Extension Point</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.UseCaseImpl#getSubjects <em>Subject</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UseCaseImpl extends BehavioredClassifierImpl implements UseCase {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) IBM Corporation and others."; //$NON-NLS-1$

	/**
	 * The cached value of the '{@link #getIncludes() <em>Include</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncludes()
	 * @generated
	 * @ordered
	 */
	protected EList includes = null;

	/**
	 * The cached value of the '{@link #getExtends() <em>Extend</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtends()
	 * @generated
	 * @ordered
	 */
	protected EList extends_ = null;

	/**
	 * The cached value of the '{@link #getExtensionPoints() <em>Extension Point</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtensionPoints()
	 * @generated
	 * @ordered
	 */
	protected EList extensionPoints = null;

	/**
	 * The cached value of the '{@link #getSubjects() <em>Subject</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubjects()
	 * @generated
	 * @ordered
	 */
	protected EList subjects = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UseCaseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return UML2Package.Literals.USE_CASE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getOwnedMembers() {
		CacheAdapter cache = getCacheAdapter();
		if (cache != null) {
			try {
				Method method = getClass().getMethod("getOwnedMembers", null); //$NON-NLS-1$
				EList ownedMembers = (EList) cache.get(eResource(), this, method);
				if (ownedMembers == null) {
					List union = getOwnedMembersHelper(new UniqueEList.FastCompare());
					cache.put(eResource(), this, method, ownedMembers = new UnionEObjectEList(this, null, union.size(), union.toArray()));
				}
				return ownedMembers;
			}
			catch (NoSuchMethodException nsme) {
				// ignore
			}
		}
		List union = getOwnedMembersHelper(new UniqueEList.FastCompare());
		return new UnionEObjectEList(this, null, union.size(), union.toArray());
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getIncludes() {
		if (includes == null) {
			includes = new EObjectContainmentWithInverseEList(Include.class, this, UML2Package.USE_CASE__INCLUDE, UML2Package.INCLUDE__INCLUDING_CASE);
		}
		return includes;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
    public Include getInclude(String name) {
		return getInclude(name, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Include getInclude(String name, boolean ignoreCase) {
		includeLoop: for (Iterator i = getIncludes().iterator(); i.hasNext(); ) {
			Include include = (Include) i.next();
			if (name != null && !(ignoreCase ? name.equalsIgnoreCase(include.getName()) : name.equals(include.getName())))
				continue includeLoop;
			return include;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 * @deprecated Use #createInclude() instead.
	 */
	public Include createInclude(EClass eClass) {
		Include newInclude = (Include) eClass.getEPackage().getEFactoryInstance().create(eClass);
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, 0, UML2Package.USE_CASE__INCLUDE, null, newInclude));
		}
		getIncludes().add(newInclude);
		return newInclude;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Include createInclude() {
		Include newInclude = UML2Factory.eINSTANCE.createInclude();
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, 0, UML2Package.USE_CASE__INCLUDE, null, newInclude));
		}
		getIncludes().add(newInclude);
		return newInclude;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getExtends() {
		if (extends_ == null) {
			extends_ = new EObjectContainmentWithInverseEList(Extend.class, this, UML2Package.USE_CASE__EXTEND, UML2Package.EXTEND__EXTENSION);
		}
		return extends_;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
    public Extend getExtend(String name) {
		return getExtend(name, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Extend getExtend(String name, boolean ignoreCase) {
		extendLoop: for (Iterator i = getExtends().iterator(); i.hasNext(); ) {
			Extend extend = (Extend) i.next();
			if (name != null && !(ignoreCase ? name.equalsIgnoreCase(extend.getName()) : name.equals(extend.getName())))
				continue extendLoop;
			return extend;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 * @deprecated Use #createExtend() instead.
	 */
	public Extend createExtend(EClass eClass) {
		Extend newExtend = (Extend) eClass.getEPackage().getEFactoryInstance().create(eClass);
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, 0, UML2Package.USE_CASE__EXTEND, null, newExtend));
		}
		getExtends().add(newExtend);
		return newExtend;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Extend createExtend() {
		Extend newExtend = UML2Factory.eINSTANCE.createExtend();
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, 0, UML2Package.USE_CASE__EXTEND, null, newExtend));
		}
		getExtends().add(newExtend);
		return newExtend;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getExtensionPoints() {
		if (extensionPoints == null) {
			extensionPoints = new EObjectContainmentWithInverseEList(ExtensionPoint.class, this, UML2Package.USE_CASE__EXTENSION_POINT, UML2Package.EXTENSION_POINT__USE_CASE);
		}
		return extensionPoints;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
    public ExtensionPoint getExtensionPoint(String name) {
		return getExtensionPoint(name, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExtensionPoint getExtensionPoint(String name, boolean ignoreCase) {
		extensionPointLoop: for (Iterator i = getExtensionPoints().iterator(); i.hasNext(); ) {
			ExtensionPoint extensionPoint = (ExtensionPoint) i.next();
			if (name != null && !(ignoreCase ? name.equalsIgnoreCase(extensionPoint.getName()) : name.equals(extensionPoint.getName())))
				continue extensionPointLoop;
			return extensionPoint;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 * @deprecated Use #createExtensionPoint() instead.
	 */
	public ExtensionPoint createExtensionPoint(EClass eClass) {
		ExtensionPoint newExtensionPoint = (ExtensionPoint) eClass.getEPackage().getEFactoryInstance().create(eClass);
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, 0, UML2Package.USE_CASE__EXTENSION_POINT, null, newExtensionPoint));
		}
		getExtensionPoints().add(newExtensionPoint);
		return newExtensionPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public ExtensionPoint createExtensionPoint() {
		ExtensionPoint newExtensionPoint = UML2Factory.eINSTANCE.createExtensionPoint();
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, 0, UML2Package.USE_CASE__EXTENSION_POINT, null, newExtensionPoint));
		}
		getExtensionPoints().add(newExtensionPoint);
		return newExtensionPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getSubjects() {
		if (subjects == null) {
			subjects = new EObjectWithInverseResolvingEList.ManyInverse(Classifier.class, this, UML2Package.USE_CASE__SUBJECT, UML2Package.CLASSIFIER__USE_CASE);
		}
		return subjects;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
    public Classifier getSubject(String name) {
		return getSubject(name, false, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Classifier getSubject(String name, boolean ignoreCase, EClass eClass) {
		subjectLoop: for (Iterator i = getSubjects().iterator(); i.hasNext(); ) {
			Classifier subject = (Classifier) i.next();
			if (eClass != null && !eClass.isInstance(subject))
				continue subjectLoop;
			if (name != null && !(ignoreCase ? name.equalsIgnoreCase(subject.getName()) : name.equals(subject.getName())))
				continue subjectLoop;
			return subject;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UML2Package.USE_CASE__EANNOTATIONS:
				return ((InternalEList)getEAnnotations()).basicAdd(otherEnd, msgs);
			case UML2Package.USE_CASE__TEMPLATE_BINDING:
				return ((InternalEList)getTemplateBindings()).basicAdd(otherEnd, msgs);
			case UML2Package.USE_CASE__OWNED_TEMPLATE_SIGNATURE:
				if (ownedTemplateSignature != null)
					msgs = ((InternalEObject)ownedTemplateSignature).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UML2Package.USE_CASE__OWNED_TEMPLATE_SIGNATURE, null, msgs);
				return basicSetOwnedTemplateSignature((TemplateSignature)otherEnd, msgs);
			case UML2Package.USE_CASE__CLIENT_DEPENDENCY:
				return ((InternalEList)getClientDependencies()).basicAdd(otherEnd, msgs);
			case UML2Package.USE_CASE__OWNED_RULE:
				return ((InternalEList)getOwnedRules()).basicAdd(otherEnd, msgs);
			case UML2Package.USE_CASE__ELEMENT_IMPORT:
				return ((InternalEList)getElementImports()).basicAdd(otherEnd, msgs);
			case UML2Package.USE_CASE__PACKAGE_IMPORT:
				return ((InternalEList)getPackageImports()).basicAdd(otherEnd, msgs);
			case UML2Package.USE_CASE__TEMPLATE_PARAMETER:
				if (templateParameter != null)
					msgs = ((InternalEObject)templateParameter).eInverseRemove(this, UML2Package.TEMPLATE_PARAMETER__PARAMETERED_ELEMENT, TemplateParameter.class, msgs);
				return basicSetTemplateParameter((TemplateParameter)otherEnd, msgs);
			case UML2Package.USE_CASE__OWNING_PARAMETER:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOwningParameter((TemplateParameter)otherEnd, msgs);
			case UML2Package.USE_CASE__GENERALIZATION:
				return ((InternalEList)getGeneralizations()).basicAdd(otherEnd, msgs);
			case UML2Package.USE_CASE__SUBSTITUTION:
				return ((InternalEList)getSubstitutions()).basicAdd(otherEnd, msgs);
			case UML2Package.USE_CASE__POWERTYPE_EXTENT:
				return ((InternalEList)getPowertypeExtents()).basicAdd(otherEnd, msgs);
			case UML2Package.USE_CASE__USE_CASE:
				return ((InternalEList)getUseCases()).basicAdd(otherEnd, msgs);
			case UML2Package.USE_CASE__OWNED_BEHAVIOR:
				return ((InternalEList)getOwnedBehaviors()).basicAdd(otherEnd, msgs);
			case UML2Package.USE_CASE__IMPLEMENTATION:
				return ((InternalEList)getImplementations()).basicAdd(otherEnd, msgs);
			case UML2Package.USE_CASE__OWNED_STATE_MACHINE:
				return ((InternalEList)getOwnedStateMachines()).basicAdd(otherEnd, msgs);
			case UML2Package.USE_CASE__INCLUDE:
				return ((InternalEList)getIncludes()).basicAdd(otherEnd, msgs);
			case UML2Package.USE_CASE__EXTEND:
				return ((InternalEList)getExtends()).basicAdd(otherEnd, msgs);
			case UML2Package.USE_CASE__EXTENSION_POINT:
				return ((InternalEList)getExtensionPoints()).basicAdd(otherEnd, msgs);
			case UML2Package.USE_CASE__SUBJECT:
				return ((InternalEList)getSubjects()).basicAdd(otherEnd, msgs);
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
			case UML2Package.USE_CASE__EANNOTATIONS:
				return ((InternalEList)getEAnnotations()).basicRemove(otherEnd, msgs);
			case UML2Package.USE_CASE__OWNED_COMMENT:
				return ((InternalEList)getOwnedComments()).basicRemove(otherEnd, msgs);
			case UML2Package.USE_CASE__TEMPLATE_BINDING:
				return ((InternalEList)getTemplateBindings()).basicRemove(otherEnd, msgs);
			case UML2Package.USE_CASE__OWNED_TEMPLATE_SIGNATURE:
				return basicSetOwnedTemplateSignature(null, msgs);
			case UML2Package.USE_CASE__CLIENT_DEPENDENCY:
				return ((InternalEList)getClientDependencies()).basicRemove(otherEnd, msgs);
			case UML2Package.USE_CASE__NAME_EXPRESSION:
				return basicSetNameExpression(null, msgs);
			case UML2Package.USE_CASE__OWNED_RULE:
				return ((InternalEList)getOwnedRules()).basicRemove(otherEnd, msgs);
			case UML2Package.USE_CASE__ELEMENT_IMPORT:
				return ((InternalEList)getElementImports()).basicRemove(otherEnd, msgs);
			case UML2Package.USE_CASE__PACKAGE_IMPORT:
				return ((InternalEList)getPackageImports()).basicRemove(otherEnd, msgs);
			case UML2Package.USE_CASE__TEMPLATE_PARAMETER:
				return basicSetTemplateParameter(null, msgs);
			case UML2Package.USE_CASE__OWNING_PARAMETER:
				return basicSetOwningParameter(null, msgs);
			case UML2Package.USE_CASE__GENERALIZATION:
				return ((InternalEList)getGeneralizations()).basicRemove(otherEnd, msgs);
			case UML2Package.USE_CASE__SUBSTITUTION:
				return ((InternalEList)getSubstitutions()).basicRemove(otherEnd, msgs);
			case UML2Package.USE_CASE__POWERTYPE_EXTENT:
				return ((InternalEList)getPowertypeExtents()).basicRemove(otherEnd, msgs);
			case UML2Package.USE_CASE__OWNED_USE_CASE:
				return ((InternalEList)getOwnedUseCases()).basicRemove(otherEnd, msgs);
			case UML2Package.USE_CASE__USE_CASE:
				return ((InternalEList)getUseCases()).basicRemove(otherEnd, msgs);
			case UML2Package.USE_CASE__OCCURRENCE:
				return ((InternalEList)getOccurrences()).basicRemove(otherEnd, msgs);
			case UML2Package.USE_CASE__OWNED_BEHAVIOR:
				return ((InternalEList)getOwnedBehaviors()).basicRemove(otherEnd, msgs);
			case UML2Package.USE_CASE__IMPLEMENTATION:
				return ((InternalEList)getImplementations()).basicRemove(otherEnd, msgs);
			case UML2Package.USE_CASE__OWNED_TRIGGER:
				return ((InternalEList)getOwnedTriggers()).basicRemove(otherEnd, msgs);
			case UML2Package.USE_CASE__OWNED_STATE_MACHINE:
				return ((InternalEList)getOwnedStateMachines()).basicRemove(otherEnd, msgs);
			case UML2Package.USE_CASE__INCLUDE:
				return ((InternalEList)getIncludes()).basicRemove(otherEnd, msgs);
			case UML2Package.USE_CASE__EXTEND:
				return ((InternalEList)getExtends()).basicRemove(otherEnd, msgs);
			case UML2Package.USE_CASE__EXTENSION_POINT:
				return ((InternalEList)getExtensionPoints()).basicRemove(otherEnd, msgs);
			case UML2Package.USE_CASE__SUBJECT:
				return ((InternalEList)getSubjects()).basicRemove(otherEnd, msgs);
		}
		return eDynamicInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UML2Package.USE_CASE__EANNOTATIONS:
				return getEAnnotations();
			case UML2Package.USE_CASE__OWNED_ELEMENT:
				return getOwnedElements();
			case UML2Package.USE_CASE__OWNER:
				if (resolve) return getOwner();
				return basicGetOwner();
			case UML2Package.USE_CASE__OWNED_COMMENT:
				return getOwnedComments();
			case UML2Package.USE_CASE__TEMPLATE_BINDING:
				return getTemplateBindings();
			case UML2Package.USE_CASE__OWNED_TEMPLATE_SIGNATURE:
				return getOwnedTemplateSignature();
			case UML2Package.USE_CASE__NAME:
				return getName();
			case UML2Package.USE_CASE__QUALIFIED_NAME:
				return getQualifiedName();
			case UML2Package.USE_CASE__VISIBILITY:
				return getVisibility();
			case UML2Package.USE_CASE__CLIENT_DEPENDENCY:
				return getClientDependencies();
			case UML2Package.USE_CASE__NAME_EXPRESSION:
				return getNameExpression();
			case UML2Package.USE_CASE__MEMBER:
				return getMembers();
			case UML2Package.USE_CASE__OWNED_RULE:
				return getOwnedRules();
			case UML2Package.USE_CASE__IMPORTED_MEMBER:
				return getImportedMembers();
			case UML2Package.USE_CASE__ELEMENT_IMPORT:
				return getElementImports();
			case UML2Package.USE_CASE__PACKAGE_IMPORT:
				return getPackageImports();
			case UML2Package.USE_CASE__TEMPLATE_PARAMETER:
				if (resolve) return getTemplateParameter();
				return basicGetTemplateParameter();
			case UML2Package.USE_CASE__OWNING_PARAMETER:
				return getOwningParameter();
			case UML2Package.USE_CASE__PACKAGEABLE_ELEMENT_VISIBILITY:
				return getPackageableElement_visibility();
			case UML2Package.USE_CASE__PACKAGE:
				return getPackage();
			case UML2Package.USE_CASE__REDEFINITION_CONTEXT:
				return getRedefinitionContexts();
			case UML2Package.USE_CASE__IS_LEAF:
				return isLeaf() ? Boolean.TRUE : Boolean.FALSE;
			case UML2Package.USE_CASE__FEATURE:
				return getFeatures();
			case UML2Package.USE_CASE__IS_ABSTRACT:
				return isAbstract() ? Boolean.TRUE : Boolean.FALSE;
			case UML2Package.USE_CASE__INHERITED_MEMBER:
				return getInheritedMembers();
			case UML2Package.USE_CASE__GENERAL:
				return getGenerals();
			case UML2Package.USE_CASE__GENERALIZATION:
				return getGeneralizations();
			case UML2Package.USE_CASE__ATTRIBUTE:
				return getAttributes();
			case UML2Package.USE_CASE__REDEFINED_CLASSIFIER:
				return getRedefinedClassifiers();
			case UML2Package.USE_CASE__SUBSTITUTION:
				return getSubstitutions();
			case UML2Package.USE_CASE__POWERTYPE_EXTENT:
				return getPowertypeExtents();
			case UML2Package.USE_CASE__OWNED_USE_CASE:
				return getOwnedUseCases();
			case UML2Package.USE_CASE__USE_CASE:
				return getUseCases();
			case UML2Package.USE_CASE__REPRESENTATION:
				return getRepresentation();
			case UML2Package.USE_CASE__OCCURRENCE:
				return getOccurrences();
			case UML2Package.USE_CASE__OWNED_BEHAVIOR:
				return getOwnedBehaviors();
			case UML2Package.USE_CASE__CLASSIFIER_BEHAVIOR:
				return getClassifierBehavior();
			case UML2Package.USE_CASE__IMPLEMENTATION:
				return getImplementations();
			case UML2Package.USE_CASE__OWNED_TRIGGER:
				return getOwnedTriggers();
			case UML2Package.USE_CASE__OWNED_STATE_MACHINE:
				return getOwnedStateMachines();
			case UML2Package.USE_CASE__INCLUDE:
				return getIncludes();
			case UML2Package.USE_CASE__EXTEND:
				return getExtends();
			case UML2Package.USE_CASE__EXTENSION_POINT:
				return getExtensionPoints();
			case UML2Package.USE_CASE__SUBJECT:
				return getSubjects();
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
			case UML2Package.USE_CASE__EANNOTATIONS:
				getEAnnotations().clear();
				getEAnnotations().addAll((Collection)newValue);
				return;
			case UML2Package.USE_CASE__OWNED_COMMENT:
				getOwnedComments().clear();
				getOwnedComments().addAll((Collection)newValue);
				return;
			case UML2Package.USE_CASE__TEMPLATE_BINDING:
				getTemplateBindings().clear();
				getTemplateBindings().addAll((Collection)newValue);
				return;
			case UML2Package.USE_CASE__OWNED_TEMPLATE_SIGNATURE:
				setOwnedTemplateSignature((TemplateSignature)newValue);
				return;
			case UML2Package.USE_CASE__NAME:
				setName((String)newValue);
				return;
			case UML2Package.USE_CASE__VISIBILITY:
				setVisibility((VisibilityKind)newValue);
				return;
			case UML2Package.USE_CASE__CLIENT_DEPENDENCY:
				getClientDependencies().clear();
				getClientDependencies().addAll((Collection)newValue);
				return;
			case UML2Package.USE_CASE__NAME_EXPRESSION:
				setNameExpression((StringExpression)newValue);
				return;
			case UML2Package.USE_CASE__OWNED_RULE:
				getOwnedRules().clear();
				getOwnedRules().addAll((Collection)newValue);
				return;
			case UML2Package.USE_CASE__ELEMENT_IMPORT:
				getElementImports().clear();
				getElementImports().addAll((Collection)newValue);
				return;
			case UML2Package.USE_CASE__PACKAGE_IMPORT:
				getPackageImports().clear();
				getPackageImports().addAll((Collection)newValue);
				return;
			case UML2Package.USE_CASE__TEMPLATE_PARAMETER:
				setTemplateParameter((TemplateParameter)newValue);
				return;
			case UML2Package.USE_CASE__OWNING_PARAMETER:
				setOwningParameter((TemplateParameter)newValue);
				return;
			case UML2Package.USE_CASE__PACKAGEABLE_ELEMENT_VISIBILITY:
				setPackageableElement_visibility((VisibilityKind)newValue);
				return;
			case UML2Package.USE_CASE__IS_LEAF:
				setIsLeaf(((Boolean)newValue).booleanValue());
				return;
			case UML2Package.USE_CASE__IS_ABSTRACT:
				setIsAbstract(((Boolean)newValue).booleanValue());
				return;
			case UML2Package.USE_CASE__GENERALIZATION:
				getGeneralizations().clear();
				getGeneralizations().addAll((Collection)newValue);
				return;
			case UML2Package.USE_CASE__REDEFINED_CLASSIFIER:
				getRedefinedClassifiers().clear();
				getRedefinedClassifiers().addAll((Collection)newValue);
				return;
			case UML2Package.USE_CASE__SUBSTITUTION:
				getSubstitutions().clear();
				getSubstitutions().addAll((Collection)newValue);
				return;
			case UML2Package.USE_CASE__POWERTYPE_EXTENT:
				getPowertypeExtents().clear();
				getPowertypeExtents().addAll((Collection)newValue);
				return;
			case UML2Package.USE_CASE__OWNED_USE_CASE:
				getOwnedUseCases().clear();
				getOwnedUseCases().addAll((Collection)newValue);
				return;
			case UML2Package.USE_CASE__USE_CASE:
				getUseCases().clear();
				getUseCases().addAll((Collection)newValue);
				return;
			case UML2Package.USE_CASE__REPRESENTATION:
				setRepresentation((CollaborationOccurrence)newValue);
				return;
			case UML2Package.USE_CASE__OCCURRENCE:
				getOccurrences().clear();
				getOccurrences().addAll((Collection)newValue);
				return;
			case UML2Package.USE_CASE__OWNED_BEHAVIOR:
				getOwnedBehaviors().clear();
				getOwnedBehaviors().addAll((Collection)newValue);
				return;
			case UML2Package.USE_CASE__CLASSIFIER_BEHAVIOR:
				setClassifierBehavior((Behavior)newValue);
				return;
			case UML2Package.USE_CASE__IMPLEMENTATION:
				getImplementations().clear();
				getImplementations().addAll((Collection)newValue);
				return;
			case UML2Package.USE_CASE__OWNED_TRIGGER:
				getOwnedTriggers().clear();
				getOwnedTriggers().addAll((Collection)newValue);
				return;
			case UML2Package.USE_CASE__OWNED_STATE_MACHINE:
				getOwnedStateMachines().clear();
				getOwnedStateMachines().addAll((Collection)newValue);
				return;
			case UML2Package.USE_CASE__INCLUDE:
				getIncludes().clear();
				getIncludes().addAll((Collection)newValue);
				return;
			case UML2Package.USE_CASE__EXTEND:
				getExtends().clear();
				getExtends().addAll((Collection)newValue);
				return;
			case UML2Package.USE_CASE__EXTENSION_POINT:
				getExtensionPoints().clear();
				getExtensionPoints().addAll((Collection)newValue);
				return;
			case UML2Package.USE_CASE__SUBJECT:
				getSubjects().clear();
				getSubjects().addAll((Collection)newValue);
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
			case UML2Package.USE_CASE__EANNOTATIONS:
				getEAnnotations().clear();
				return;
			case UML2Package.USE_CASE__OWNED_COMMENT:
				getOwnedComments().clear();
				return;
			case UML2Package.USE_CASE__TEMPLATE_BINDING:
				getTemplateBindings().clear();
				return;
			case UML2Package.USE_CASE__OWNED_TEMPLATE_SIGNATURE:
				setOwnedTemplateSignature((TemplateSignature)null);
				return;
			case UML2Package.USE_CASE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case UML2Package.USE_CASE__VISIBILITY:
				setVisibility(VISIBILITY_EDEFAULT);
				return;
			case UML2Package.USE_CASE__CLIENT_DEPENDENCY:
				getClientDependencies().clear();
				return;
			case UML2Package.USE_CASE__NAME_EXPRESSION:
				setNameExpression((StringExpression)null);
				return;
			case UML2Package.USE_CASE__OWNED_RULE:
				getOwnedRules().clear();
				return;
			case UML2Package.USE_CASE__ELEMENT_IMPORT:
				getElementImports().clear();
				return;
			case UML2Package.USE_CASE__PACKAGE_IMPORT:
				getPackageImports().clear();
				return;
			case UML2Package.USE_CASE__TEMPLATE_PARAMETER:
				setTemplateParameter((TemplateParameter)null);
				return;
			case UML2Package.USE_CASE__OWNING_PARAMETER:
				setOwningParameter((TemplateParameter)null);
				return;
			case UML2Package.USE_CASE__PACKAGEABLE_ELEMENT_VISIBILITY:
				setPackageableElement_visibility(PACKAGEABLE_ELEMENT_VISIBILITY_EDEFAULT);
				return;
			case UML2Package.USE_CASE__IS_LEAF:
				setIsLeaf(IS_LEAF_EDEFAULT);
				return;
			case UML2Package.USE_CASE__IS_ABSTRACT:
				setIsAbstract(IS_ABSTRACT_EDEFAULT);
				return;
			case UML2Package.USE_CASE__GENERALIZATION:
				getGeneralizations().clear();
				return;
			case UML2Package.USE_CASE__REDEFINED_CLASSIFIER:
				getRedefinedClassifiers().clear();
				return;
			case UML2Package.USE_CASE__SUBSTITUTION:
				getSubstitutions().clear();
				return;
			case UML2Package.USE_CASE__POWERTYPE_EXTENT:
				getPowertypeExtents().clear();
				return;
			case UML2Package.USE_CASE__OWNED_USE_CASE:
				getOwnedUseCases().clear();
				return;
			case UML2Package.USE_CASE__USE_CASE:
				getUseCases().clear();
				return;
			case UML2Package.USE_CASE__REPRESENTATION:
				setRepresentation((CollaborationOccurrence)null);
				return;
			case UML2Package.USE_CASE__OCCURRENCE:
				getOccurrences().clear();
				return;
			case UML2Package.USE_CASE__OWNED_BEHAVIOR:
				getOwnedBehaviors().clear();
				return;
			case UML2Package.USE_CASE__CLASSIFIER_BEHAVIOR:
				setClassifierBehavior((Behavior)null);
				return;
			case UML2Package.USE_CASE__IMPLEMENTATION:
				getImplementations().clear();
				return;
			case UML2Package.USE_CASE__OWNED_TRIGGER:
				getOwnedTriggers().clear();
				return;
			case UML2Package.USE_CASE__OWNED_STATE_MACHINE:
				getOwnedStateMachines().clear();
				return;
			case UML2Package.USE_CASE__INCLUDE:
				getIncludes().clear();
				return;
			case UML2Package.USE_CASE__EXTEND:
				getExtends().clear();
				return;
			case UML2Package.USE_CASE__EXTENSION_POINT:
				getExtensionPoints().clear();
				return;
			case UML2Package.USE_CASE__SUBJECT:
				getSubjects().clear();
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
			case UML2Package.USE_CASE__EANNOTATIONS:
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UML2Package.USE_CASE__OWNED_ELEMENT:
				return isSetOwnedElements();
			case UML2Package.USE_CASE__OWNER:
				return isSetOwner();
			case UML2Package.USE_CASE__OWNED_COMMENT:
				return ownedComments != null && !ownedComments.isEmpty();
			case UML2Package.USE_CASE__TEMPLATE_BINDING:
				return templateBindings != null && !templateBindings.isEmpty();
			case UML2Package.USE_CASE__OWNED_TEMPLATE_SIGNATURE:
				return ownedTemplateSignature != null;
			case UML2Package.USE_CASE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case UML2Package.USE_CASE__QUALIFIED_NAME:
				return QUALIFIED_NAME_EDEFAULT == null ? getQualifiedName() != null : !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case UML2Package.USE_CASE__VISIBILITY:
				return isSetVisibility();
			case UML2Package.USE_CASE__CLIENT_DEPENDENCY:
				return clientDependencies != null && !clientDependencies.isEmpty();
			case UML2Package.USE_CASE__NAME_EXPRESSION:
				return nameExpression != null;
			case UML2Package.USE_CASE__MEMBER:
				return isSetMembers();
			case UML2Package.USE_CASE__OWNED_RULE:
				return ownedRules != null && !ownedRules.isEmpty();
			case UML2Package.USE_CASE__IMPORTED_MEMBER:
				return !getImportedMembers().isEmpty();
			case UML2Package.USE_CASE__ELEMENT_IMPORT:
				return elementImports != null && !elementImports.isEmpty();
			case UML2Package.USE_CASE__PACKAGE_IMPORT:
				return packageImports != null && !packageImports.isEmpty();
			case UML2Package.USE_CASE__TEMPLATE_PARAMETER:
				return templateParameter != null;
			case UML2Package.USE_CASE__OWNING_PARAMETER:
				return getOwningParameter() != null;
			case UML2Package.USE_CASE__PACKAGEABLE_ELEMENT_VISIBILITY:
				return isSetPackageableElement_visibility();
			case UML2Package.USE_CASE__PACKAGE:
				return getPackage() != null;
			case UML2Package.USE_CASE__REDEFINITION_CONTEXT:
				return isSetRedefinitionContexts();
			case UML2Package.USE_CASE__IS_LEAF:
				return ((eFlags & IS_LEAF_EFLAG) != 0) != IS_LEAF_EDEFAULT;
			case UML2Package.USE_CASE__FEATURE:
				return isSetFeatures();
			case UML2Package.USE_CASE__IS_ABSTRACT:
				return ((eFlags & IS_ABSTRACT_EFLAG) != 0) != IS_ABSTRACT_EDEFAULT;
			case UML2Package.USE_CASE__INHERITED_MEMBER:
				return !getInheritedMembers().isEmpty();
			case UML2Package.USE_CASE__GENERAL:
				return !getGenerals().isEmpty();
			case UML2Package.USE_CASE__GENERALIZATION:
				return generalizations != null && !generalizations.isEmpty();
			case UML2Package.USE_CASE__ATTRIBUTE:
				return isSetAttributes();
			case UML2Package.USE_CASE__REDEFINED_CLASSIFIER:
				return redefinedClassifiers != null && !redefinedClassifiers.isEmpty();
			case UML2Package.USE_CASE__SUBSTITUTION:
				return substitutions != null && !substitutions.isEmpty();
			case UML2Package.USE_CASE__POWERTYPE_EXTENT:
				return powertypeExtents != null && !powertypeExtents.isEmpty();
			case UML2Package.USE_CASE__OWNED_USE_CASE:
				return ownedUseCases != null && !ownedUseCases.isEmpty();
			case UML2Package.USE_CASE__USE_CASE:
				return useCases != null && !useCases.isEmpty();
			case UML2Package.USE_CASE__REPRESENTATION:
				return representation != null;
			case UML2Package.USE_CASE__OCCURRENCE:
				return occurrences != null && !occurrences.isEmpty();
			case UML2Package.USE_CASE__OWNED_BEHAVIOR:
				return isSetOwnedBehaviors();
			case UML2Package.USE_CASE__CLASSIFIER_BEHAVIOR:
				return classifierBehavior != null;
			case UML2Package.USE_CASE__IMPLEMENTATION:
				return implementations != null && !implementations.isEmpty();
			case UML2Package.USE_CASE__OWNED_TRIGGER:
				return ownedTriggers != null && !ownedTriggers.isEmpty();
			case UML2Package.USE_CASE__OWNED_STATE_MACHINE:
				return isSetOwnedStateMachines();
			case UML2Package.USE_CASE__INCLUDE:
				return includes != null && !includes.isEmpty();
			case UML2Package.USE_CASE__EXTEND:
				return extends_ != null && !extends_.isEmpty();
			case UML2Package.USE_CASE__EXTENSION_POINT:
				return extensionPoints != null && !extensionPoints.isEmpty();
			case UML2Package.USE_CASE__SUBJECT:
				return subjects != null && !subjects.isEmpty();
		}
		return eDynamicIsSet(featureID);
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EList getOwnedMembersHelper(EList ownedMembers) {
		super.getOwnedMembersHelper(ownedMembers);
		if (eIsSet(UML2Package.USE_CASE__INCLUDE)) {
			ownedMembers.addAll(getIncludes());
		}
		if (eIsSet(UML2Package.USE_CASE__EXTEND)) {
			ownedMembers.addAll(getExtends());
		}
		if (eIsSet(UML2Package.USE_CASE__EXTENSION_POINT)) {
			ownedMembers.addAll(getExtensionPoints());
		}
		return ownedMembers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOwnedMembers() {
		return super.isSetOwnedMembers()
			|| eIsSet(UML2Package.USE_CASE__INCLUDE)
			|| eIsSet(UML2Package.USE_CASE__EXTEND)
			|| eIsSet(UML2Package.USE_CASE__EXTENSION_POINT);
	}

	/**
	 * The array of subset feature identifiers for the '{@link #getOwnedMembers() <em>Owned Member</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedMembers()
	 * @generated
	 * @ordered
	 */
	protected static final int[] OWNED_MEMBER_ESUBSETS = new int[] {UML2Package.USE_CASE__OWNED_RULE, UML2Package.USE_CASE__OWNED_USE_CASE, UML2Package.USE_CASE__OWNED_BEHAVIOR, UML2Package.USE_CASE__OWNED_TRIGGER, UML2Package.USE_CASE__INCLUDE, UML2Package.USE_CASE__EXTEND, UML2Package.USE_CASE__EXTENSION_POINT};

} //UseCaseImpl
