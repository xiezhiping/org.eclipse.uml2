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
 * $Id: ComponentImpl.java,v 1.12 2004/06/02 05:02:25 khussey Exp $
 */
package org.eclipse.uml2.impl;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EcoreEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.uml2.Behavior;
import org.eclipse.uml2.BehavioredClassifier;
import org.eclipse.uml2.Classifier;
import org.eclipse.uml2.CollaborationOccurrence;
import org.eclipse.uml2.Component;
import org.eclipse.uml2.Dependency;
import org.eclipse.uml2.Implementation;
import org.eclipse.uml2.Interface;
import org.eclipse.uml2.NamedElement;
import org.eclipse.uml2.PackageableElement;
import org.eclipse.uml2.Port;
import org.eclipse.uml2.Realization;
import org.eclipse.uml2.StringExpression;
import org.eclipse.uml2.TemplateParameter;
import org.eclipse.uml2.TemplateSignature;
import org.eclipse.uml2.UML2Package;
import org.eclipse.uml2.Usage;
import org.eclipse.uml2.VisibilityKind;
import org.eclipse.uml2.internal.util.SubsetEObjectContainmentWithInverseEList;
import org.eclipse.uml2.internal.util.SupersetEObjectWithInverseResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Component</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2.impl.ComponentImpl#isIndirectlyInstantiated <em>Is Indirectly Instantiated</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.ComponentImpl#getRequireds <em>Required</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.ComponentImpl#getProvideds <em>Provided</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.ComponentImpl#getRealizations <em>Realization</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.ComponentImpl#getOwnedMembers <em>Owned Member</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ComponentImpl extends ClassImpl implements Component {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2003, 2004 IBM Corporation and others."; //$NON-NLS-1$

	/**
	 * The default value of the '{@link #isIndirectlyInstantiated() <em>Is Indirectly Instantiated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIndirectlyInstantiated()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_INDIRECTLY_INSTANTIATED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIndirectlyInstantiated() <em>Is Indirectly Instantiated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIndirectlyInstantiated()
	 * @generated
	 * @ordered
	 */
	protected boolean isIndirectlyInstantiated = IS_INDIRECTLY_INSTANTIATED_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRealizations() <em>Realization</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRealizations()
	 * @generated
	 * @ordered
	 */
	protected EList realization = null;

	/**
	 * The cached value of the '{@link #getOwnedMembers() <em>Owned Member</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedMembers()
	 * @generated
	 * @ordered
	 */
	protected EList ownedMember = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return UML2Package.eINSTANCE.getComponent();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIndirectlyInstantiated() {
		return isIndirectlyInstantiated;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsIndirectlyInstantiated(boolean newIsIndirectlyInstantiated) {
		boolean oldIsIndirectlyInstantiated = isIndirectlyInstantiated;
		isIndirectlyInstantiated = newIsIndirectlyInstantiated;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2Package.COMPONENT__IS_INDIRECTLY_INSTANTIATED, oldIsIndirectlyInstantiated, isIndirectlyInstantiated));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList getRequireds() {
		EList requireds = (EList) getCacheAdapter().get(this,
			UML2Package.eINSTANCE.getComponent_Required());

		if (null == requireds) {
			Set required = new HashSet();

			for (Iterator clientDependencies = getClientDependencies()
				.iterator(); clientDependencies.hasNext();) {

				Dependency clientDependency = (Dependency) clientDependencies
					.next();

				if (Usage.class.isInstance(clientDependency)) {

					for (Iterator suppliers = clientDependency.getSuppliers()
						.iterator(); suppliers.hasNext();) {

						NamedElement supplier = (NamedElement) suppliers.next();

						if (Interface.class.isInstance(supplier)) {
							required.add(supplier);
						}
					}
				}
			}

			for (Iterator realizations = getRealizations().iterator(); realizations
				.hasNext();) {

				Realization realization = (Realization) realizations.next();

				if (null != realization.getRealizingClassifier()) {

					for (Iterator clientDependencies = realization
						.getRealizingClassifier().getClientDependencies()
						.iterator(); clientDependencies.hasNext();) {

						Dependency clientDependency = (Dependency) clientDependencies
							.next();

						if (Usage.class.isInstance(clientDependency)) {

							for (Iterator suppliers = clientDependency
								.getSuppliers().iterator(); suppliers.hasNext();) {

								NamedElement supplier = (NamedElement) suppliers
									.next();

								if (Interface.class.isInstance(supplier)) {
									required.add(supplier);
								}
							}
						}
					}
				}
			}

			for (Iterator ownedPorts = getOwnedPorts().iterator(); ownedPorts
				.hasNext();) {

				required.addAll(((Port) ownedPorts.next()).getRequireds());
			}

			requireds = new EcoreEList.UnmodifiableEList(this,
				UML2Package.eINSTANCE.getComponent_Required(), required.size(),
				required.toArray());
			getCacheAdapter().put(this,
				UML2Package.eINSTANCE.getComponent_Required(), requireds);
		}

		return requireds;
	}

    /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
     */
	public Interface getRequired(String unqualifiedName) {
    	for (Iterator i = getRequireds().iterator(); i.hasNext(); ) {
    		Interface namedRequired = (Interface) i.next();
    		
    		if (unqualifiedName.equals(namedRequired.getName())) {
    			return namedRequired;
    		}
    	}
    	
    	return null;
    }
      
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList getProvideds() {
		EList provideds = (EList) getCacheAdapter().get(this,
			UML2Package.eINSTANCE.getComponent_Provided());

		if (null == provideds) {
			Set provided = new HashSet();

			for (Iterator implementations = getImplementations().iterator(); implementations
				.hasNext();) {

				Implementation implementation = (Implementation) implementations
					.next();

				if (null != implementation.getContract()) {
					provided.add(implementation.getContract());
				}
			}

			for (Iterator realizations = getRealizations().iterator(); realizations
				.hasNext();) {

				Classifier realizingClassifier = ((Realization) realizations
					.next()).getRealizingClassifier();

				if (Interface.class.isInstance(realizingClassifier)) {
					provided.add(realizingClassifier);
				} else if (BehavioredClassifier.class
					.isInstance(realizingClassifier)) {

					for (Iterator implementations = ((BehavioredClassifier) realizingClassifier)
						.getImplementations().iterator(); implementations
						.hasNext();) {

						Implementation implementation = (Implementation) implementations
							.next();

						if (null != implementation.getContract()) {
							provided.add(implementation.getContract());
						}
					}
				}
			}

			for (Iterator ownedPorts = getOwnedPorts().iterator(); ownedPorts
				.hasNext();) {

				provided.addAll(((Port) ownedPorts.next()).getProvideds());
			}

			provideds = new EcoreEList.UnmodifiableEList(this,
				UML2Package.eINSTANCE.getComponent_Provided(), provided.size(),
				provided.toArray());
			getCacheAdapter().put(this,
				UML2Package.eINSTANCE.getComponent_Provided(), provideds);
		}

		return provideds;
	}

    /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
     */
	public Interface getProvided(String unqualifiedName) {
    	for (Iterator i = getProvideds().iterator(); i.hasNext(); ) {
    		Interface namedProvided = (Interface) i.next();
    		
    		if (unqualifiedName.equals(namedProvided.getName())) {
    			return namedProvided;
    		}
    	}
    	
    	return null;
    }
      
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getRealizations() {
		if (realization == null) {
			realization = new SubsetEObjectContainmentWithInverseEList(Realization.class, this, UML2Package.COMPONENT__REALIZATION, new int[] {UML2Package.COMPONENT__CLIENT_DEPENDENCY}, UML2Package.REALIZATION__ABSTRACTION);
		}
		return realization;

	}

    /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
     */
	public Realization getRealization(String unqualifiedName) {
    	for (Iterator i = getRealizations().iterator(); i.hasNext(); ) {
    		Realization namedRealization = (Realization) i.next();
    		
    		if (unqualifiedName.equals(namedRealization.getName())) {
    			return namedRealization;
    		}
    	}
    	
    	return null;
    }
      
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Realization createRealization(EClass eClass) {
		Realization newRealization = (Realization) eClass.getEPackage().getEFactoryInstance().create(eClass);
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, 0, UML2Package.COMPONENT__REALIZATION, null, newRealization));
		}
		getRealizations().add(newRealization);
		return newRealization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getOwnedMembers() {
		if (ownedMember == null) {
			ownedMember = new EObjectContainmentEList(PackageableElement.class, this, UML2Package.COMPONENT__OWNED_MEMBER);
		}
		return ownedMember;
	}

    /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
     */
	public PackageableElement getOwnedMember(String unqualifiedName) {
    	for (Iterator i = getOwnedMembers().iterator(); i.hasNext(); ) {
    		PackageableElement namedOwnedMember = (PackageableElement) i.next();
    		
    		if (unqualifiedName.equals(namedOwnedMember.getName())) {
    			return namedOwnedMember;
    		}
    	}
    	
    	return null;
    }
      
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PackageableElement createOwnedMember(EClass eClass) {
		PackageableElement newOwnedMember = (PackageableElement) eClass.getEPackage().getEFactoryInstance().create(eClass);
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, 0, UML2Package.COMPONENT__OWNED_MEMBER, null, newOwnedMember));
		}
		getOwnedMembers().add(newOwnedMember);
		return newOwnedMember;
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
			union.addAll(getRealizations());

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
	public EList getClientDependencies() {
		if (clientDependency == null) {
			clientDependency = new SupersetEObjectWithInverseResolvingEList.ManyInverse(Dependency.class, this, UML2Package.COMPONENT__CLIENT_DEPENDENCY, new int[] {UML2Package.COMPONENT__SUBSTITUTION, UML2Package.COMPONENT__IMPLEMENTATION, UML2Package.COMPONENT__REALIZATION}, UML2Package.DEPENDENCY__CLIENT);
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
				case UML2Package.COMPONENT__EANNOTATIONS:
					return ((InternalEList)getEAnnotations()).basicAdd(otherEnd, msgs);
				case UML2Package.COMPONENT__TEMPLATE_BINDING:
					return ((InternalEList)getTemplateBindings()).basicAdd(otherEnd, msgs);
				case UML2Package.COMPONENT__OWNED_TEMPLATE_SIGNATURE:
					if (ownedTemplateSignature != null)
						msgs = ((InternalEObject)ownedTemplateSignature).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UML2Package.COMPONENT__OWNED_TEMPLATE_SIGNATURE, null, msgs);
					return basicSetOwnedTemplateSignature((TemplateSignature)otherEnd, msgs);
				case UML2Package.COMPONENT__CLIENT_DEPENDENCY:
					return ((InternalEList)getClientDependencies()).basicAdd(otherEnd, msgs);
				case UML2Package.COMPONENT__OWNED_RULE:
					return ((InternalEList)getOwnedRules()).basicAdd(otherEnd, msgs);
				case UML2Package.COMPONENT__ELEMENT_IMPORT:
					return ((InternalEList)getElementImports()).basicAdd(otherEnd, msgs);
				case UML2Package.COMPONENT__PACKAGE_IMPORT:
					return ((InternalEList)getPackageImports()).basicAdd(otherEnd, msgs);
				case UML2Package.COMPONENT__TEMPLATE_PARAMETER:
					if (templateParameter != null)
						msgs = ((InternalEObject)templateParameter).eInverseRemove(this, UML2Package.TEMPLATE_PARAMETER__PARAMETERED_ELEMENT, TemplateParameter.class, msgs);
					return basicSetTemplateParameter((TemplateParameter)otherEnd, msgs);
				case UML2Package.COMPONENT__OWNING_PARAMETER:
					if (eContainer != null)
						msgs = eBasicRemoveFromContainer(msgs);
					return eBasicSetContainer(otherEnd, UML2Package.COMPONENT__OWNING_PARAMETER, msgs);
				case UML2Package.COMPONENT__GENERALIZATION:
					return ((InternalEList)getGeneralizations()).basicAdd(otherEnd, msgs);
				case UML2Package.COMPONENT__POWERTYPE_EXTENT:
					return ((InternalEList)getPowertypeExtents()).basicAdd(otherEnd, msgs);
				case UML2Package.COMPONENT__SUBSTITUTION:
					return ((InternalEList)getSubstitutions()).basicAdd(otherEnd, msgs);
				case UML2Package.COMPONENT__USE_CASE:
					return ((InternalEList)getUseCases()).basicAdd(otherEnd, msgs);
				case UML2Package.COMPONENT__OWNED_BEHAVIOR:
					return ((InternalEList)getOwnedBehaviors()).basicAdd(otherEnd, msgs);
				case UML2Package.COMPONENT__IMPLEMENTATION:
					return ((InternalEList)getImplementations()).basicAdd(otherEnd, msgs);
				case UML2Package.COMPONENT__OWNED_STATE_MACHINE:
					return ((InternalEList)getOwnedStateMachines()).basicAdd(otherEnd, msgs);
				case UML2Package.COMPONENT__OWNED_OPERATION:
					return ((InternalEList)getOwnedOperations()).basicAdd(otherEnd, msgs);
				case UML2Package.COMPONENT__REALIZATION:
					return ((InternalEList)getRealizations()).basicAdd(otherEnd, msgs);
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
				case UML2Package.COMPONENT__EANNOTATIONS:
					return ((InternalEList)getEAnnotations()).basicRemove(otherEnd, msgs);
				case UML2Package.COMPONENT__OWNED_COMMENT:
					return ((InternalEList)getOwnedComments()).basicRemove(otherEnd, msgs);
				case UML2Package.COMPONENT__TEMPLATE_BINDING:
					return ((InternalEList)getTemplateBindings()).basicRemove(otherEnd, msgs);
				case UML2Package.COMPONENT__OWNED_TEMPLATE_SIGNATURE:
					return basicSetOwnedTemplateSignature(null, msgs);
				case UML2Package.COMPONENT__CLIENT_DEPENDENCY:
					return ((InternalEList)getClientDependencies()).basicRemove(otherEnd, msgs);
				case UML2Package.COMPONENT__NAME_EXPRESSION:
					return basicSetNameExpression(null, msgs);
				case UML2Package.COMPONENT__OWNED_RULE:
					return ((InternalEList)getOwnedRules()).basicRemove(otherEnd, msgs);
				case UML2Package.COMPONENT__ELEMENT_IMPORT:
					return ((InternalEList)getElementImports()).basicRemove(otherEnd, msgs);
				case UML2Package.COMPONENT__PACKAGE_IMPORT:
					return ((InternalEList)getPackageImports()).basicRemove(otherEnd, msgs);
				case UML2Package.COMPONENT__TEMPLATE_PARAMETER:
					return basicSetTemplateParameter(null, msgs);
				case UML2Package.COMPONENT__OWNING_PARAMETER:
					return eBasicSetContainer(null, UML2Package.COMPONENT__OWNING_PARAMETER, msgs);
				case UML2Package.COMPONENT__GENERALIZATION:
					return ((InternalEList)getGeneralizations()).basicRemove(otherEnd, msgs);
				case UML2Package.COMPONENT__POWERTYPE_EXTENT:
					return ((InternalEList)getPowertypeExtents()).basicRemove(otherEnd, msgs);
				case UML2Package.COMPONENT__SUBSTITUTION:
					return ((InternalEList)getSubstitutions()).basicRemove(otherEnd, msgs);
				case UML2Package.COMPONENT__OWNED_USE_CASE:
					return ((InternalEList)getOwnedUseCases()).basicRemove(otherEnd, msgs);
				case UML2Package.COMPONENT__USE_CASE:
					return ((InternalEList)getUseCases()).basicRemove(otherEnd, msgs);
				case UML2Package.COMPONENT__OCCURRENCE:
					return ((InternalEList)getOccurrences()).basicRemove(otherEnd, msgs);
				case UML2Package.COMPONENT__OWNED_BEHAVIOR:
					return ((InternalEList)getOwnedBehaviors()).basicRemove(otherEnd, msgs);
				case UML2Package.COMPONENT__IMPLEMENTATION:
					return ((InternalEList)getImplementations()).basicRemove(otherEnd, msgs);
				case UML2Package.COMPONENT__OWNED_TRIGGER:
					return ((InternalEList)getOwnedTriggers()).basicRemove(otherEnd, msgs);
				case UML2Package.COMPONENT__OWNED_STATE_MACHINE:
					return ((InternalEList)getOwnedStateMachines()).basicRemove(otherEnd, msgs);
				case UML2Package.COMPONENT__OWNED_ATTRIBUTE:
					return ((InternalEList)getOwnedAttributes()).basicRemove(otherEnd, msgs);
				case UML2Package.COMPONENT__OWNED_CONNECTOR:
					return ((InternalEList)getOwnedConnectors()).basicRemove(otherEnd, msgs);
				case UML2Package.COMPONENT__OWNED_PORT:
					return ((InternalEList)getOwnedPorts()).basicRemove(otherEnd, msgs);
				case UML2Package.COMPONENT__OWNED_OPERATION:
					return ((InternalEList)getOwnedOperations()).basicRemove(otherEnd, msgs);
				case UML2Package.COMPONENT__NESTED_CLASSIFIER:
					return ((InternalEList)getNestedClassifiers()).basicRemove(otherEnd, msgs);
				case UML2Package.COMPONENT__OWNED_RECEPTION:
					return ((InternalEList)getOwnedReceptions()).basicRemove(otherEnd, msgs);
				case UML2Package.COMPONENT__REALIZATION:
					return ((InternalEList)getRealizations()).basicRemove(otherEnd, msgs);
				case UML2Package.COMPONENT__OWNED_MEMBER:
					return ((InternalEList)getOwnedMembers()).basicRemove(otherEnd, msgs);
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
				case UML2Package.COMPONENT__OWNING_PARAMETER:
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
			case UML2Package.COMPONENT__EANNOTATIONS:
				return getEAnnotations();
			case UML2Package.COMPONENT__OWNED_ELEMENT:
				return getOwnedElements();
			case UML2Package.COMPONENT__OWNER:
				if (resolve) return getOwner();
				return basicGetOwner();
			case UML2Package.COMPONENT__OWNED_COMMENT:
				return getOwnedComments();
			case UML2Package.COMPONENT__TEMPLATE_BINDING:
				return getTemplateBindings();
			case UML2Package.COMPONENT__OWNED_TEMPLATE_SIGNATURE:
				return getOwnedTemplateSignature();
			case UML2Package.COMPONENT__NAME:
				return getName();
			case UML2Package.COMPONENT__QUALIFIED_NAME:
				return getQualifiedName();
			case UML2Package.COMPONENT__VISIBILITY:
				return getVisibility();
			case UML2Package.COMPONENT__CLIENT_DEPENDENCY:
				return getClientDependencies();
			case UML2Package.COMPONENT__NAME_EXPRESSION:
				return getNameExpression();
			case UML2Package.COMPONENT__MEMBER:
				return getMembers();
			case UML2Package.COMPONENT__OWNED_RULE:
				return getOwnedRules();
			case UML2Package.COMPONENT__IMPORTED_MEMBER:
				return getImportedMembers();
			case UML2Package.COMPONENT__ELEMENT_IMPORT:
				return getElementImports();
			case UML2Package.COMPONENT__PACKAGE_IMPORT:
				return getPackageImports();
			case UML2Package.COMPONENT__TEMPLATE_PARAMETER:
				if (resolve) return getTemplateParameter();
				return basicGetTemplateParameter();
			case UML2Package.COMPONENT__OWNING_PARAMETER:
				return getOwningParameter();
			case UML2Package.COMPONENT__PACKAGEABLE_ELEMENT_VISIBILITY:
				return getPackageableElement_visibility();
			case UML2Package.COMPONENT__PACKAGE:
				if (resolve) return getPackage();
				return basicGetPackage();
			case UML2Package.COMPONENT__REDEFINITION_CONTEXT:
				return getRedefinitionContexts();
			case UML2Package.COMPONENT__IS_LEAF:
				return isLeaf() ? Boolean.TRUE : Boolean.FALSE;
			case UML2Package.COMPONENT__FEATURE:
				return getFeatures();
			case UML2Package.COMPONENT__IS_ABSTRACT:
				return isAbstract() ? Boolean.TRUE : Boolean.FALSE;
			case UML2Package.COMPONENT__INHERITED_MEMBER:
				return getInheritedMembers();
			case UML2Package.COMPONENT__GENERAL:
				return getGenerals();
			case UML2Package.COMPONENT__GENERALIZATION:
				return getGeneralizations();
			case UML2Package.COMPONENT__ATTRIBUTE:
				return getAttributes();
			case UML2Package.COMPONENT__REDEFINED_CLASSIFIER:
				return getRedefinedClassifiers();
			case UML2Package.COMPONENT__POWERTYPE_EXTENT:
				return getPowertypeExtents();
			case UML2Package.COMPONENT__SUBSTITUTION:
				return getSubstitutions();
			case UML2Package.COMPONENT__OWNED_USE_CASE:
				return getOwnedUseCases();
			case UML2Package.COMPONENT__USE_CASE:
				return getUseCases();
			case UML2Package.COMPONENT__REPRESENTATION:
				return getRepresentation();
			case UML2Package.COMPONENT__OCCURRENCE:
				return getOccurrences();
			case UML2Package.COMPONENT__OWNED_BEHAVIOR:
				return getOwnedBehaviors();
			case UML2Package.COMPONENT__CLASSIFIER_BEHAVIOR:
				return getClassifierBehavior();
			case UML2Package.COMPONENT__IMPLEMENTATION:
				return getImplementations();
			case UML2Package.COMPONENT__OWNED_TRIGGER:
				return getOwnedTriggers();
			case UML2Package.COMPONENT__OWNED_STATE_MACHINE:
				return getOwnedStateMachines();
			case UML2Package.COMPONENT__OWNED_ATTRIBUTE:
				return getOwnedAttributes();
			case UML2Package.COMPONENT__PART:
				return getParts();
			case UML2Package.COMPONENT__ROLE:
				return getRoles();
			case UML2Package.COMPONENT__OWNED_CONNECTOR:
				return getOwnedConnectors();
			case UML2Package.COMPONENT__OWNED_PORT:
				return getOwnedPorts();
			case UML2Package.COMPONENT__OWNED_OPERATION:
				return getOwnedOperations();
			case UML2Package.COMPONENT__SUPER_CLASS:
				return getSuperClasses();
			case UML2Package.COMPONENT__NESTED_CLASSIFIER:
				return getNestedClassifiers();
			case UML2Package.COMPONENT__EXTENSION:
				return getExtensions();
			case UML2Package.COMPONENT__IS_ACTIVE:
				return isActive() ? Boolean.TRUE : Boolean.FALSE;
			case UML2Package.COMPONENT__OWNED_RECEPTION:
				return getOwnedReceptions();
			case UML2Package.COMPONENT__IS_INDIRECTLY_INSTANTIATED:
				return isIndirectlyInstantiated() ? Boolean.TRUE : Boolean.FALSE;
			case UML2Package.COMPONENT__REQUIRED:
				return getRequireds();
			case UML2Package.COMPONENT__PROVIDED:
				return getProvideds();
			case UML2Package.COMPONENT__REALIZATION:
				return getRealizations();
			case UML2Package.COMPONENT__OWNED_MEMBER:
				return getOwnedMembers();
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
			case UML2Package.COMPONENT__EANNOTATIONS:
				getEAnnotations().clear();
				getEAnnotations().addAll((Collection)newValue);
				return;
			case UML2Package.COMPONENT__OWNED_COMMENT:
				getOwnedComments().clear();
				getOwnedComments().addAll((Collection)newValue);
				return;
			case UML2Package.COMPONENT__TEMPLATE_BINDING:
				getTemplateBindings().clear();
				getTemplateBindings().addAll((Collection)newValue);
				return;
			case UML2Package.COMPONENT__OWNED_TEMPLATE_SIGNATURE:
				setOwnedTemplateSignature((TemplateSignature)newValue);
				return;
			case UML2Package.COMPONENT__NAME:
				setName((String)newValue);
				return;
			case UML2Package.COMPONENT__VISIBILITY:
				setVisibility((VisibilityKind)newValue);
				return;
			case UML2Package.COMPONENT__CLIENT_DEPENDENCY:
				getClientDependencies().clear();
				getClientDependencies().addAll((Collection)newValue);
				return;
			case UML2Package.COMPONENT__NAME_EXPRESSION:
				setNameExpression((StringExpression)newValue);
				return;
			case UML2Package.COMPONENT__OWNED_RULE:
				getOwnedRules().clear();
				getOwnedRules().addAll((Collection)newValue);
				return;
			case UML2Package.COMPONENT__ELEMENT_IMPORT:
				getElementImports().clear();
				getElementImports().addAll((Collection)newValue);
				return;
			case UML2Package.COMPONENT__PACKAGE_IMPORT:
				getPackageImports().clear();
				getPackageImports().addAll((Collection)newValue);
				return;
			case UML2Package.COMPONENT__TEMPLATE_PARAMETER:
				setTemplateParameter((TemplateParameter)newValue);
				return;
			case UML2Package.COMPONENT__OWNING_PARAMETER:
				setOwningParameter((TemplateParameter)newValue);
				return;
			case UML2Package.COMPONENT__PACKAGEABLE_ELEMENT_VISIBILITY:
				setPackageableElement_visibility((VisibilityKind)newValue);
				return;
			case UML2Package.COMPONENT__IS_LEAF:
				setIsLeaf(((Boolean)newValue).booleanValue());
				return;
			case UML2Package.COMPONENT__IS_ABSTRACT:
				setIsAbstract(((Boolean)newValue).booleanValue());
				return;
			case UML2Package.COMPONENT__GENERALIZATION:
				getGeneralizations().clear();
				getGeneralizations().addAll((Collection)newValue);
				return;
			case UML2Package.COMPONENT__REDEFINED_CLASSIFIER:
				getRedefinedClassifiers().clear();
				getRedefinedClassifiers().addAll((Collection)newValue);
				return;
			case UML2Package.COMPONENT__POWERTYPE_EXTENT:
				getPowertypeExtents().clear();
				getPowertypeExtents().addAll((Collection)newValue);
				return;
			case UML2Package.COMPONENT__SUBSTITUTION:
				getSubstitutions().clear();
				getSubstitutions().addAll((Collection)newValue);
				return;
			case UML2Package.COMPONENT__OWNED_USE_CASE:
				getOwnedUseCases().clear();
				getOwnedUseCases().addAll((Collection)newValue);
				return;
			case UML2Package.COMPONENT__USE_CASE:
				getUseCases().clear();
				getUseCases().addAll((Collection)newValue);
				return;
			case UML2Package.COMPONENT__REPRESENTATION:
				setRepresentation((CollaborationOccurrence)newValue);
				return;
			case UML2Package.COMPONENT__OCCURRENCE:
				getOccurrences().clear();
				getOccurrences().addAll((Collection)newValue);
				return;
			case UML2Package.COMPONENT__OWNED_BEHAVIOR:
				getOwnedBehaviors().clear();
				getOwnedBehaviors().addAll((Collection)newValue);
				return;
			case UML2Package.COMPONENT__CLASSIFIER_BEHAVIOR:
				setClassifierBehavior((Behavior)newValue);
				return;
			case UML2Package.COMPONENT__IMPLEMENTATION:
				getImplementations().clear();
				getImplementations().addAll((Collection)newValue);
				return;
			case UML2Package.COMPONENT__OWNED_TRIGGER:
				getOwnedTriggers().clear();
				getOwnedTriggers().addAll((Collection)newValue);
				return;
			case UML2Package.COMPONENT__OWNED_STATE_MACHINE:
				getOwnedStateMachines().clear();
				getOwnedStateMachines().addAll((Collection)newValue);
				return;
			case UML2Package.COMPONENT__OWNED_ATTRIBUTE:
				getOwnedAttributes().clear();
				getOwnedAttributes().addAll((Collection)newValue);
				return;
			case UML2Package.COMPONENT__OWNED_CONNECTOR:
				getOwnedConnectors().clear();
				getOwnedConnectors().addAll((Collection)newValue);
				return;
			case UML2Package.COMPONENT__OWNED_PORT:
				getOwnedPorts().clear();
				getOwnedPorts().addAll((Collection)newValue);
				return;
			case UML2Package.COMPONENT__OWNED_OPERATION:
				getOwnedOperations().clear();
				getOwnedOperations().addAll((Collection)newValue);
				return;
			case UML2Package.COMPONENT__NESTED_CLASSIFIER:
				getNestedClassifiers().clear();
				getNestedClassifiers().addAll((Collection)newValue);
				return;
			case UML2Package.COMPONENT__IS_ACTIVE:
				setIsActive(((Boolean)newValue).booleanValue());
				return;
			case UML2Package.COMPONENT__OWNED_RECEPTION:
				getOwnedReceptions().clear();
				getOwnedReceptions().addAll((Collection)newValue);
				return;
			case UML2Package.COMPONENT__IS_INDIRECTLY_INSTANTIATED:
				setIsIndirectlyInstantiated(((Boolean)newValue).booleanValue());
				return;
			case UML2Package.COMPONENT__REALIZATION:
				getRealizations().clear();
				getRealizations().addAll((Collection)newValue);
				return;
			case UML2Package.COMPONENT__OWNED_MEMBER:
				getOwnedMembers().clear();
				getOwnedMembers().addAll((Collection)newValue);
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
			case UML2Package.COMPONENT__EANNOTATIONS:
				getEAnnotations().clear();
				return;
			case UML2Package.COMPONENT__OWNED_COMMENT:
				getOwnedComments().clear();
				return;
			case UML2Package.COMPONENT__TEMPLATE_BINDING:
				getTemplateBindings().clear();
				return;
			case UML2Package.COMPONENT__OWNED_TEMPLATE_SIGNATURE:
				setOwnedTemplateSignature((TemplateSignature)null);
				return;
			case UML2Package.COMPONENT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case UML2Package.COMPONENT__VISIBILITY:
				setVisibility(VISIBILITY_EDEFAULT);
				return;
			case UML2Package.COMPONENT__CLIENT_DEPENDENCY:
				getClientDependencies().clear();
				return;
			case UML2Package.COMPONENT__NAME_EXPRESSION:
				setNameExpression((StringExpression)null);
				return;
			case UML2Package.COMPONENT__OWNED_RULE:
				getOwnedRules().clear();
				return;
			case UML2Package.COMPONENT__ELEMENT_IMPORT:
				getElementImports().clear();
				return;
			case UML2Package.COMPONENT__PACKAGE_IMPORT:
				getPackageImports().clear();
				return;
			case UML2Package.COMPONENT__TEMPLATE_PARAMETER:
				setTemplateParameter((TemplateParameter)null);
				return;
			case UML2Package.COMPONENT__OWNING_PARAMETER:
				setOwningParameter(null);
				return;
			case UML2Package.COMPONENT__PACKAGEABLE_ELEMENT_VISIBILITY:
				setPackageableElement_visibility(PACKAGEABLE_ELEMENT_VISIBILITY_EDEFAULT);
				return;
			case UML2Package.COMPONENT__IS_LEAF:
				setIsLeaf(IS_LEAF_EDEFAULT);
				return;
			case UML2Package.COMPONENT__IS_ABSTRACT:
				setIsAbstract(IS_ABSTRACT_EDEFAULT);
				return;
			case UML2Package.COMPONENT__GENERALIZATION:
				getGeneralizations().clear();
				return;
			case UML2Package.COMPONENT__REDEFINED_CLASSIFIER:
				getRedefinedClassifiers().clear();
				return;
			case UML2Package.COMPONENT__POWERTYPE_EXTENT:
				getPowertypeExtents().clear();
				return;
			case UML2Package.COMPONENT__SUBSTITUTION:
				getSubstitutions().clear();
				return;
			case UML2Package.COMPONENT__OWNED_USE_CASE:
				getOwnedUseCases().clear();
				return;
			case UML2Package.COMPONENT__USE_CASE:
				getUseCases().clear();
				return;
			case UML2Package.COMPONENT__REPRESENTATION:
				setRepresentation((CollaborationOccurrence)null);
				return;
			case UML2Package.COMPONENT__OCCURRENCE:
				getOccurrences().clear();
				return;
			case UML2Package.COMPONENT__OWNED_BEHAVIOR:
				getOwnedBehaviors().clear();
				return;
			case UML2Package.COMPONENT__CLASSIFIER_BEHAVIOR:
				setClassifierBehavior((Behavior)null);
				return;
			case UML2Package.COMPONENT__IMPLEMENTATION:
				getImplementations().clear();
				return;
			case UML2Package.COMPONENT__OWNED_TRIGGER:
				getOwnedTriggers().clear();
				return;
			case UML2Package.COMPONENT__OWNED_STATE_MACHINE:
				getOwnedStateMachines().clear();
				return;
			case UML2Package.COMPONENT__OWNED_ATTRIBUTE:
				getOwnedAttributes().clear();
				return;
			case UML2Package.COMPONENT__OWNED_CONNECTOR:
				getOwnedConnectors().clear();
				return;
			case UML2Package.COMPONENT__OWNED_PORT:
				getOwnedPorts().clear();
				return;
			case UML2Package.COMPONENT__OWNED_OPERATION:
				getOwnedOperations().clear();
				return;
			case UML2Package.COMPONENT__NESTED_CLASSIFIER:
				getNestedClassifiers().clear();
				return;
			case UML2Package.COMPONENT__IS_ACTIVE:
				setIsActive(IS_ACTIVE_EDEFAULT);
				return;
			case UML2Package.COMPONENT__OWNED_RECEPTION:
				getOwnedReceptions().clear();
				return;
			case UML2Package.COMPONENT__IS_INDIRECTLY_INSTANTIATED:
				setIsIndirectlyInstantiated(IS_INDIRECTLY_INSTANTIATED_EDEFAULT);
				return;
			case UML2Package.COMPONENT__REALIZATION:
				getRealizations().clear();
				return;
			case UML2Package.COMPONENT__OWNED_MEMBER:
				getOwnedMembers().clear();
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
			case UML2Package.COMPONENT__EANNOTATIONS:
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UML2Package.COMPONENT__OWNED_ELEMENT:
				return !getOwnedElements().isEmpty();
			case UML2Package.COMPONENT__OWNER:
				return basicGetOwner() != null;
			case UML2Package.COMPONENT__OWNED_COMMENT:
				return ownedComment != null && !ownedComment.isEmpty();
			case UML2Package.COMPONENT__TEMPLATE_BINDING:
				return templateBinding != null && !templateBinding.isEmpty();
			case UML2Package.COMPONENT__OWNED_TEMPLATE_SIGNATURE:
				return ownedTemplateSignature != null;
			case UML2Package.COMPONENT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case UML2Package.COMPONENT__QUALIFIED_NAME:
				return !"".equals(getQualifiedName()); //$NON-NLS-1$
			case UML2Package.COMPONENT__VISIBILITY:
				return visibility != VISIBILITY_EDEFAULT;
			case UML2Package.COMPONENT__CLIENT_DEPENDENCY:
				return clientDependency != null && !clientDependency.isEmpty();
			case UML2Package.COMPONENT__NAME_EXPRESSION:
				return nameExpression != null;
			case UML2Package.COMPONENT__MEMBER:
				return !getMembers().isEmpty();
			case UML2Package.COMPONENT__OWNED_RULE:
				return ownedRule != null && !ownedRule.isEmpty();
			case UML2Package.COMPONENT__IMPORTED_MEMBER:
				return !getImportedMembers().isEmpty();
			case UML2Package.COMPONENT__ELEMENT_IMPORT:
				return elementImport != null && !elementImport.isEmpty();
			case UML2Package.COMPONENT__PACKAGE_IMPORT:
				return packageImport != null && !packageImport.isEmpty();
			case UML2Package.COMPONENT__TEMPLATE_PARAMETER:
				return templateParameter != null;
			case UML2Package.COMPONENT__OWNING_PARAMETER:
				return getOwningParameter() != null;
			case UML2Package.COMPONENT__PACKAGEABLE_ELEMENT_VISIBILITY:
				return packageableElement_visibility != PACKAGEABLE_ELEMENT_VISIBILITY_EDEFAULT;
			case UML2Package.COMPONENT__PACKAGE:
				return basicGetPackage() != null;
			case UML2Package.COMPONENT__REDEFINITION_CONTEXT:
				return !getRedefinitionContexts().isEmpty();
			case UML2Package.COMPONENT__IS_LEAF:
				return isLeaf != IS_LEAF_EDEFAULT;
			case UML2Package.COMPONENT__FEATURE:
				return !getFeatures().isEmpty();
			case UML2Package.COMPONENT__IS_ABSTRACT:
				return isAbstract != IS_ABSTRACT_EDEFAULT;
			case UML2Package.COMPONENT__INHERITED_MEMBER:
				return !getInheritedMembers().isEmpty();
			case UML2Package.COMPONENT__GENERAL:
				return !getGenerals().isEmpty();
			case UML2Package.COMPONENT__GENERALIZATION:
				return generalization != null && !generalization.isEmpty();
			case UML2Package.COMPONENT__ATTRIBUTE:
				return !getAttributes().isEmpty();
			case UML2Package.COMPONENT__REDEFINED_CLASSIFIER:
				return redefinedClassifier != null && !redefinedClassifier.isEmpty();
			case UML2Package.COMPONENT__POWERTYPE_EXTENT:
				return powertypeExtent != null && !powertypeExtent.isEmpty();
			case UML2Package.COMPONENT__SUBSTITUTION:
				return substitution != null && !substitution.isEmpty();
			case UML2Package.COMPONENT__OWNED_USE_CASE:
				return ownedUseCase != null && !ownedUseCase.isEmpty();
			case UML2Package.COMPONENT__USE_CASE:
				return useCase != null && !useCase.isEmpty();
			case UML2Package.COMPONENT__REPRESENTATION:
				return representation != null;
			case UML2Package.COMPONENT__OCCURRENCE:
				return occurrence != null && !occurrence.isEmpty();
			case UML2Package.COMPONENT__OWNED_BEHAVIOR:
				return ownedBehavior != null && !ownedBehavior.isEmpty();
			case UML2Package.COMPONENT__CLASSIFIER_BEHAVIOR:
				return classifierBehavior != null;
			case UML2Package.COMPONENT__IMPLEMENTATION:
				return implementation != null && !implementation.isEmpty();
			case UML2Package.COMPONENT__OWNED_TRIGGER:
				return ownedTrigger != null && !ownedTrigger.isEmpty();
			case UML2Package.COMPONENT__OWNED_STATE_MACHINE:
				return ownedStateMachine != null && !ownedStateMachine.isEmpty();
			case UML2Package.COMPONENT__OWNED_ATTRIBUTE:
				return !getOwnedAttributes().isEmpty();
			case UML2Package.COMPONENT__PART:
				return !getParts().isEmpty();
			case UML2Package.COMPONENT__ROLE:
				return !getRoles().isEmpty();
			case UML2Package.COMPONENT__OWNED_CONNECTOR:
				return ownedConnector != null && !ownedConnector.isEmpty();
			case UML2Package.COMPONENT__OWNED_PORT:
				return ownedPort != null && !ownedPort.isEmpty();
			case UML2Package.COMPONENT__OWNED_OPERATION:
				return ownedOperation != null && !ownedOperation.isEmpty();
			case UML2Package.COMPONENT__SUPER_CLASS:
				return !getSuperClasses().isEmpty();
			case UML2Package.COMPONENT__NESTED_CLASSIFIER:
				return nestedClassifier != null && !nestedClassifier.isEmpty();
			case UML2Package.COMPONENT__EXTENSION:
				return !getExtensions().isEmpty();
			case UML2Package.COMPONENT__IS_ACTIVE:
				return isActive != IS_ACTIVE_EDEFAULT;
			case UML2Package.COMPONENT__OWNED_RECEPTION:
				return ownedReception != null && !ownedReception.isEmpty();
			case UML2Package.COMPONENT__IS_INDIRECTLY_INSTANTIATED:
				return isIndirectlyInstantiated != IS_INDIRECTLY_INSTANTIATED_EDEFAULT;
			case UML2Package.COMPONENT__REQUIRED:
				return !getRequireds().isEmpty();
			case UML2Package.COMPONENT__PROVIDED:
				return !getProvideds().isEmpty();
			case UML2Package.COMPONENT__REALIZATION:
				return realization != null && !realization.isEmpty();
			case UML2Package.COMPONENT__OWNED_MEMBER:
				return ownedMember != null && !ownedMember.isEmpty();
		}
		return eDynamicIsSet(eFeature);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (isIndirectlyInstantiated: "); //$NON-NLS-1$
		result.append(isIndirectlyInstantiated);
		result.append(')');
		return result.toString();
	}

} //ComponentImpl
