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
 * $Id: UseCaseImpl.java,v 1.5 2004/04/30 17:21:45 khussey Exp $
 */
package org.eclipse.uml2.impl;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
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
	public static final String copyright = "Copyright (c) 2003, 2004 IBM Corporation and others."; //$NON-NLS-1$

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
	 * Returns the value of the '<em><b>Include</b></em>' containment reference list.
	 * <p>
	 * Subsets the following features:
	 * <ul>
	 *   <li>{@link org.eclipse.uml2.Namespace#getOwnedMembers}</li>
	 * </ul>
	 * </p>
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
    public Include getInclude(String unqualifiedName) {
    	for (Iterator i = getIncludes().iterator(); i.hasNext(); ) {
    		Include namedInclude = (Include) i.next();
    		
    		if (unqualifiedName.equals(namedInclude.getName())) {
    			return namedInclude;
    		}
    	}
    	
    	return null;
    }
      
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Include createInclude(EClass eClass) {
		Include newInclude = (Include) eClass.getEPackage().getEFactoryInstance().create(eClass);
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.CREATE, UML2Package.USE_CASE__INCLUDE, null, newInclude));
		}
		getIncludes().add(newInclude);
		return newInclude;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * Returns the value of the '<em><b>Extend</b></em>' containment reference list.
	 * <p>
	 * Subsets the following features:
	 * <ul>
	 *   <li>{@link org.eclipse.uml2.Namespace#getOwnedMembers}</li>
	 * </ul>
	 * </p>
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
    public Extend getExtend(String unqualifiedName) {
    	for (Iterator i = getExtends().iterator(); i.hasNext(); ) {
    		Extend namedExtend = (Extend) i.next();
    		
    		if (unqualifiedName.equals(namedExtend.getName())) {
    			return namedExtend;
    		}
    	}
    	
    	return null;
    }
      
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Extend createExtend(EClass eClass) {
		Extend newExtend = (Extend) eClass.getEPackage().getEFactoryInstance().create(eClass);
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.CREATE, UML2Package.USE_CASE__EXTEND, null, newExtend));
		}
		getExtends().add(newExtend);
		return newExtend;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * Returns the value of the '<em><b>Extension Point</b></em>' containment reference list.
	 * <p>
	 * Subsets the following features:
	 * <ul>
	 *   <li>{@link org.eclipse.uml2.Namespace#getOwnedMembers}</li>
	 * </ul>
	 * </p>
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
    public ExtensionPoint getExtensionPoint(String unqualifiedName) {
    	for (Iterator i = getExtensionPoints().iterator(); i.hasNext(); ) {
    		ExtensionPoint namedExtensionPoint = (ExtensionPoint) i.next();
    		
    		if (unqualifiedName.equals(namedExtensionPoint.getName())) {
    			return namedExtensionPoint;
    		}
    	}
    	
    	return null;
    }
      
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExtensionPoint createExtensionPoint(EClass eClass) {
		ExtensionPoint newExtensionPoint = (ExtensionPoint) eClass.getEPackage().getEFactoryInstance().create(eClass);
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.CREATE, UML2Package.USE_CASE__EXTENSION_POINT, null, newExtensionPoint));
		}
		getExtensionPoints().add(newExtensionPoint);
		return newExtensionPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * Returns the value of the '<em><b>Subject</b></em>' reference list.
	 * @generated
	 */
	public EList getSubjects() {
		if (subject == null) {
			subject = new EObjectResolvingEList(Classifier.class, this, UML2Package.USE_CASE__SUBJECT);
		}
		return subject;
	}

    /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
     */
    public Classifier getSubject(String unqualifiedName) {
    	for (Iterator i = getSubjects().iterator(); i.hasNext(); ) {
    		Classifier namedSubject = (Classifier) i.next();
    		
    		if (unqualifiedName.equals(namedSubject.getName())) {
    			return namedSubject;
    		}
    	}
    	
    	return null;
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
		if (!getCacheAdapter().containsKey(this, UML2Package.eINSTANCE.getUseCase().getEAllOperations().get(72))) {
			Set union = new LinkedHashSet();
			union.addAll(super.getOwnedMembers());
			union.addAll(getIncludes());
			union.addAll(getExtends());
			union.addAll(getExtensionPoints());
			getCacheAdapter().put(
				this,
				UML2Package.eINSTANCE.getUseCase().getEAllOperations().get(72),
				new BasicEList.UnmodifiableEList(union.size(), union.toArray()));
		}
		return (EList) getCacheAdapter().get(this, UML2Package.eINSTANCE.getUseCase().getEAllOperations().get(72));
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
				case UML2Package.USE_CASE__OCCURRENCE:
					return ((InternalEList)getOccurrences()).basicRemove(otherEnd, msgs);
				case UML2Package.USE_CASE__OWNED_BEHAVIOR:
					return ((InternalEList)getOwnedBehaviors()).basicRemove(otherEnd, msgs);
				case UML2Package.USE_CASE__IMPLEMENTATION:
					return ((InternalEList)getImplementations()).basicRemove(otherEnd, msgs);
				case UML2Package.USE_CASE__OWNED_STATE_MACHINE:
					return ((InternalEList)getOwnedStateMachines()).basicRemove(otherEnd, msgs);
				case UML2Package.USE_CASE__INCLUDE:
					return ((InternalEList)getIncludes()).basicRemove(otherEnd, msgs);
				case UML2Package.USE_CASE__EXTEND:
					return ((InternalEList)getExtends()).basicRemove(otherEnd, msgs);
				case UML2Package.USE_CASE__EXTENSION_POINT:
					return ((InternalEList)getExtensionPoints()).basicRemove(otherEnd, msgs);
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
				setOwningParameter(null);
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
	public boolean eIsSet(EStructuralFeature eFeature) {
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
				return !"".equals(getQualifiedName()); //$NON-NLS-1$
			case UML2Package.USE_CASE__VISIBILITY:
				return visibility != VISIBILITY_EDEFAULT;
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
				return packageableElement_visibility != PACKAGEABLE_ELEMENT_VISIBILITY_EDEFAULT;
			case UML2Package.USE_CASE__PACKAGE:
				return basicGetPackage() != null;
			case UML2Package.USE_CASE__REDEFINITION_CONTEXT:
				return !getRedefinitionContexts().isEmpty();
			case UML2Package.USE_CASE__IS_LEAF:
				return isLeaf != IS_LEAF_EDEFAULT;
			case UML2Package.USE_CASE__FEATURE:
				return !getFeatures().isEmpty();
			case UML2Package.USE_CASE__IS_ABSTRACT:
				return isAbstract != IS_ABSTRACT_EDEFAULT;
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
			case UML2Package.USE_CASE__REPRESENTATION:
				return representation != null;
			case UML2Package.USE_CASE__OCCURRENCE:
				return occurrence != null && !occurrence.isEmpty();
			case UML2Package.USE_CASE__OWNED_BEHAVIOR:
				return ownedBehavior != null && !ownedBehavior.isEmpty();
			case UML2Package.USE_CASE__CLASSIFIER_BEHAVIOR:
				return classifierBehavior != null;
			case UML2Package.USE_CASE__IMPLEMENTATION:
				return implementation != null && !implementation.isEmpty();
			case UML2Package.USE_CASE__OWNED_STATE_MACHINE:
				return ownedStateMachine != null && !ownedStateMachine.isEmpty();
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

} //UseCaseImpl
