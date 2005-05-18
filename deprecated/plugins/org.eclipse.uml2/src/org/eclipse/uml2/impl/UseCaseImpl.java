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
 * $Id: UseCaseImpl.java,v 1.17 2005/05/18 16:38:27 khussey Exp $
 */
package org.eclipse.uml2.impl;

import java.util.Collection;
import java.util.Iterator;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
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

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Use Case</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
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
	protected EList include = null;

	/**
	 * The cached value of the '{@link #getExtends() <em>Extend</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtends()
	 * @generated
	 * @ordered
	 */
	protected EList extend = null;

	/**
	 * The cached value of the '{@link #getExtensionPoints() <em>Extension Point</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtensionPoints()
	 * @generated
	 * @ordered
	 */
	protected EList extensionPoint = null;

	/**
	 * The cached value of the '{@link #getSubjects() <em>Subject</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubjects()
	 * @generated
	 * @ordered
	 */
	protected EList subject = null;

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
		return UML2Package.eINSTANCE.getUseCase();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getIncludes() {
		if (include == null) {
			include = new EObjectContainmentWithInverseEList(Include.class, this, UML2Package.USE_CASE__INCLUDE, UML2Package.INCLUDE__INCLUDING_CASE);
		}
		return include;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
    public Include getInclude(String name) {
		for (Iterator i = getIncludes().iterator(); i.hasNext(); ) {
			Include include = (Include) i.next();
			if (name.equals(include.getName())) {
				return include;
			}
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
	 * @generated
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
		if (extend == null) {
			extend = new EObjectContainmentWithInverseEList(Extend.class, this, UML2Package.USE_CASE__EXTEND, UML2Package.EXTEND__EXTENSION);
		}
		return extend;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
    public Extend getExtend(String name) {
		for (Iterator i = getExtends().iterator(); i.hasNext(); ) {
			Extend extend = (Extend) i.next();
			if (name.equals(extend.getName())) {
				return extend;
			}
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
	 * @generated
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
		if (extensionPoint == null) {
			extensionPoint = new EObjectContainmentWithInverseEList(ExtensionPoint.class, this, UML2Package.USE_CASE__EXTENSION_POINT, UML2Package.EXTENSION_POINT__USE_CASE);
		}
		return extensionPoint;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
    public ExtensionPoint getExtensionPoint(String name) {
		for (Iterator i = getExtensionPoints().iterator(); i.hasNext(); ) {
			ExtensionPoint extensionPoint = (ExtensionPoint) i.next();
			if (name.equals(extensionPoint.getName())) {
				return extensionPoint;
			}
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
	 * @generated
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
		if (subject == null) {
			subject = new EObjectWithInverseResolvingEList.ManyInverse(Classifier.class, this, UML2Package.USE_CASE__SUBJECT, UML2Package.CLASSIFIER__USE_CASE);
		}
		return subject;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
    public Classifier getSubject(String name) {
		for (Iterator i = getSubjects().iterator(); i.hasNext(); ) {
			Classifier subject = (Classifier) i.next();
			if (name.equals(subject.getName())) {
				return subject;
			}
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, Class baseClass, NotificationChain msgs) {
		if (featureID >= 0) {
			switch (eDerivedStructuralFeatureID(featureID, baseClass)) {
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
					if (eContainer != null)
						msgs = eBasicRemoveFromContainer(msgs);
					return eBasicSetContainer(otherEnd, UML2Package.USE_CASE__OWNING_PARAMETER, msgs);
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
				case UML2Package.USE_CASE__INCLUDE:
					return ((InternalEList)getIncludes()).basicAdd(otherEnd, msgs);
				case UML2Package.USE_CASE__EXTEND:
					return ((InternalEList)getExtends()).basicAdd(otherEnd, msgs);
				case UML2Package.USE_CASE__EXTENSION_POINT:
					return ((InternalEList)getExtensionPoints()).basicAdd(otherEnd, msgs);
				case UML2Package.USE_CASE__SUBJECT:
					return ((InternalEList)getSubjects()).basicAdd(otherEnd, msgs);
				default:
					return eDynamicInverseAdd(otherEnd, featureID, baseClass, msgs);
			}
		}
		if (eContainer != null)
			msgs = eBasicRemoveFromContainer(msgs);
		return eBasicSetContainer(otherEnd, featureID, msgs);
	}

	public NotificationChain eDynamicInverseAdd(InternalEObject otherEnd, int featureID, Class inverseClass, NotificationChain msgs) {
		switch (eDerivedStructuralFeatureID(featureID, inverseClass)) {
			case UML2Package.USE_CASE__OWNED_STATE_MACHINE:
				return ((InternalEList)getOwnedStateMachines()).basicAdd(otherEnd, msgs);
			default :
				return super.eDynamicInverseAdd(otherEnd, featureID, inverseClass, msgs);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, Class baseClass, NotificationChain msgs) {
		if (featureID >= 0) {
			switch (eDerivedStructuralFeatureID(featureID, baseClass)) {
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
					return eBasicSetContainer(null, UML2Package.USE_CASE__OWNING_PARAMETER, msgs);
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
				case UML2Package.USE_CASE__OWNING_PARAMETER:
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
				if (resolve) return getPackage();
				return basicGetPackage();
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
		return eDynamicGet(eFeature, resolve);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eSet(EStructuralFeature eFeature, Object newValue) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
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
		eDynamicSet(eFeature, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eUnset(EStructuralFeature eFeature) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
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
		eDynamicUnset(eFeature);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean eIsSetGen(EStructuralFeature eFeature) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case UML2Package.USE_CASE__EANNOTATIONS:
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UML2Package.USE_CASE__OWNED_ELEMENT:
				return !getOwnedElements().isEmpty();
			case UML2Package.USE_CASE__OWNER:
				return basicGetOwner() != null;
			case UML2Package.USE_CASE__OWNED_COMMENT:
				return ownedComment != null && !ownedComment.isEmpty();
			case UML2Package.USE_CASE__TEMPLATE_BINDING:
				return templateBinding != null && !templateBinding.isEmpty();
			case UML2Package.USE_CASE__OWNED_TEMPLATE_SIGNATURE:
				return ownedTemplateSignature != null;
			case UML2Package.USE_CASE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case UML2Package.USE_CASE__QUALIFIED_NAME:
				return QUALIFIED_NAME_EDEFAULT == null ? getQualifiedName() != null : !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case UML2Package.USE_CASE__VISIBILITY:
				return getVisibility() != VISIBILITY_EDEFAULT;
			case UML2Package.USE_CASE__CLIENT_DEPENDENCY:
				return clientDependency != null && !clientDependency.isEmpty();
			case UML2Package.USE_CASE__NAME_EXPRESSION:
				return nameExpression != null;
			case UML2Package.USE_CASE__MEMBER:
				return !getMembers().isEmpty();
			case UML2Package.USE_CASE__OWNED_RULE:
				return ownedRule != null && !ownedRule.isEmpty();
			case UML2Package.USE_CASE__IMPORTED_MEMBER:
				return !getImportedMembers().isEmpty();
			case UML2Package.USE_CASE__ELEMENT_IMPORT:
				return elementImport != null && !elementImport.isEmpty();
			case UML2Package.USE_CASE__PACKAGE_IMPORT:
				return packageImport != null && !packageImport.isEmpty();
			case UML2Package.USE_CASE__TEMPLATE_PARAMETER:
				return templateParameter != null;
			case UML2Package.USE_CASE__OWNING_PARAMETER:
				return getOwningParameter() != null;
			case UML2Package.USE_CASE__PACKAGEABLE_ELEMENT_VISIBILITY:
				return getPackageableElement_visibility() != PACKAGEABLE_ELEMENT_VISIBILITY_EDEFAULT;
			case UML2Package.USE_CASE__PACKAGE:
				return basicGetPackage() != null;
			case UML2Package.USE_CASE__REDEFINITION_CONTEXT:
				return !getRedefinitionContexts().isEmpty();
			case UML2Package.USE_CASE__IS_LEAF:
				return ((eFlags & IS_LEAF_EFLAG) != 0) != IS_LEAF_EDEFAULT;
			case UML2Package.USE_CASE__FEATURE:
				return !getFeatures().isEmpty();
			case UML2Package.USE_CASE__IS_ABSTRACT:
				return ((eFlags & IS_ABSTRACT_EFLAG) != 0) != IS_ABSTRACT_EDEFAULT;
			case UML2Package.USE_CASE__INHERITED_MEMBER:
				return !getInheritedMembers().isEmpty();
			case UML2Package.USE_CASE__GENERAL:
				return !getGenerals().isEmpty();
			case UML2Package.USE_CASE__GENERALIZATION:
				return generalization != null && !generalization.isEmpty();
			case UML2Package.USE_CASE__ATTRIBUTE:
				return !getAttributes().isEmpty();
			case UML2Package.USE_CASE__REDEFINED_CLASSIFIER:
				return redefinedClassifier != null && !redefinedClassifier.isEmpty();
			case UML2Package.USE_CASE__SUBSTITUTION:
				return substitution != null && !substitution.isEmpty();
			case UML2Package.USE_CASE__POWERTYPE_EXTENT:
				return powertypeExtent != null && !powertypeExtent.isEmpty();
			case UML2Package.USE_CASE__OWNED_USE_CASE:
				return ownedUseCase != null && !ownedUseCase.isEmpty();
			case UML2Package.USE_CASE__USE_CASE:
				return useCase != null && !useCase.isEmpty();
			case UML2Package.USE_CASE__REPRESENTATION:
				return representation != null;
			case UML2Package.USE_CASE__OCCURRENCE:
				return occurrence != null && !occurrence.isEmpty();
			case UML2Package.USE_CASE__OWNED_BEHAVIOR:
				return !getOwnedBehaviors().isEmpty();
			case UML2Package.USE_CASE__CLASSIFIER_BEHAVIOR:
				return classifierBehavior != null;
			case UML2Package.USE_CASE__IMPLEMENTATION:
				return implementation != null && !implementation.isEmpty();
			case UML2Package.USE_CASE__OWNED_TRIGGER:
				return ownedTrigger != null && !ownedTrigger.isEmpty();
			case UML2Package.USE_CASE__OWNED_STATE_MACHINE:
				return !getOwnedStateMachines().isEmpty();
			case UML2Package.USE_CASE__INCLUDE:
				return include != null && !include.isEmpty();
			case UML2Package.USE_CASE__EXTEND:
				return extend != null && !extend.isEmpty();
			case UML2Package.USE_CASE__EXTENSION_POINT:
				return extensionPoint != null && !extensionPoint.isEmpty();
			case UML2Package.USE_CASE__SUBJECT:
				return subject != null && !subject.isEmpty();
		}
		return eDynamicIsSet(eFeature);
	}


	public boolean eIsSet(EStructuralFeature eFeature) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case UML2Package.USE_CASE__VISIBILITY:
				return false;
			case UML2Package.USE_CASE__PACKAGEABLE_ELEMENT_VISIBILITY:
				return visibility != PACKAGEABLE_ELEMENT_VISIBILITY_EDEFAULT;
			case UML2Package.USE_CASE__OWNED_BEHAVIOR:
				return ownedBehavior != null && !ownedBehavior.isEmpty();
			case UML2Package.USE_CASE__OWNED_STATE_MACHINE:
				return ownedStateMachine != null && !ownedStateMachine.isEmpty();
		}
		return eIsSetGen(eFeature);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EList getOwnedMembersHelper(EList ownedMember) {
		super.getOwnedMembersHelper(ownedMember);
		if (include != null) {
			ownedMember.addAll(include);
		}
		if (extend != null) {
			ownedMember.addAll(extend);
		}
		if (extensionPoint != null) {
			ownedMember.addAll(extensionPoint);
		}
		return ownedMember;
	}


} //UseCaseImpl
