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
 * $Id: StateMachineImpl.java,v 1.16 2004/06/18 17:44:12 khussey Exp $
 */
package org.eclipse.uml2.impl;

import java.util.Collection;
import java.util.Collections;
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
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.uml2.Behavior;
import org.eclipse.uml2.BehavioralFeature;
import org.eclipse.uml2.BehavioredClassifier;
import org.eclipse.uml2.CollaborationOccurrence;
import org.eclipse.uml2.Pseudostate;
import org.eclipse.uml2.Region;
import org.eclipse.uml2.StateMachine;
import org.eclipse.uml2.StringExpression;
import org.eclipse.uml2.TemplateParameter;
import org.eclipse.uml2.TemplateSignature;
import org.eclipse.uml2.UML2Package;
import org.eclipse.uml2.VisibilityKind;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>State Machine</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2.impl.StateMachineImpl#getRegions <em>Region</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.StateMachineImpl#getConnectionPoints <em>Connection Point</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.StateMachineImpl#getExtendedStateMachine <em>Extended State Machine</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.StateMachineImpl#getStateMachine_redefinitionContext <em>State Machine redefinition Context</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StateMachineImpl extends BehaviorImpl implements StateMachine {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2003, 2004 IBM Corporation and others."; //$NON-NLS-1$

	/**
	 * The cached value of the '{@link #getRegions() <em>Region</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegions()
	 * @generated
	 * @ordered
	 */
	protected EList region = null;

	/**
	 * The cached value of the '{@link #getConnectionPoints() <em>Connection Point</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectionPoints()
	 * @generated
	 * @ordered
	 */
	protected EList connectionPoint = null;

	/**
	 * The cached value of the '{@link #getExtendedStateMachine() <em>Extended State Machine</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtendedStateMachine()
	 * @generated
	 * @ordered
	 */
	protected StateMachine extendedStateMachine = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StateMachineImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return UML2Package.eINSTANCE.getStateMachine();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getRegions() {
		if (region == null) {
			region = new EObjectContainmentWithInverseEList(Region.class, this, UML2Package.STATE_MACHINE__REGION, UML2Package.REGION__STATE_MACHINE);
		}
		return region;
	}

    /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
     */
    public Region getRegion(String unqualifiedName) {
    	for (Iterator i = getRegions().iterator(); i.hasNext(); ) {
    		Region namedRegion = (Region) i.next();
    		
    		if (unqualifiedName.equals(namedRegion.getName())) {
    			return namedRegion;
    		}
    	}
    	
    	return null;
    }
      
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Region createRegion(EClass eClass) {
		Region newRegion = (Region) eClass.getEPackage().getEFactoryInstance().create(eClass);
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, 0, UML2Package.STATE_MACHINE__REGION, null, newRegion));
		}
		getRegions().add(newRegion);
		return newRegion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getConnectionPoints() {
		if (connectionPoint == null) {
			connectionPoint = new EObjectContainmentEList(Pseudostate.class, this, UML2Package.STATE_MACHINE__CONNECTION_POINT);
		}
		return connectionPoint;
	}

    /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
     */
    public Pseudostate getConnectionPoint(String unqualifiedName) {
    	for (Iterator i = getConnectionPoints().iterator(); i.hasNext(); ) {
    		Pseudostate namedConnectionPoint = (Pseudostate) i.next();
    		
    		if (unqualifiedName.equals(namedConnectionPoint.getName())) {
    			return namedConnectionPoint;
    		}
    	}
    	
    	return null;
    }
      
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pseudostate createConnectionPoint(EClass eClass) {
		Pseudostate newConnectionPoint = (Pseudostate) eClass.getEPackage().getEFactoryInstance().create(eClass);
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, 0, UML2Package.STATE_MACHINE__CONNECTION_POINT, null, newConnectionPoint));
		}
		getConnectionPoints().add(newConnectionPoint);
		return newConnectionPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StateMachine getExtendedStateMachine() {
		if (extendedStateMachine != null && extendedStateMachine.eIsProxy()) {
			StateMachine oldExtendedStateMachine = extendedStateMachine;
			extendedStateMachine = (StateMachine)eResolveProxy((InternalEObject)extendedStateMachine);
			if (extendedStateMachine != oldExtendedStateMachine) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UML2Package.STATE_MACHINE__EXTENDED_STATE_MACHINE, oldExtendedStateMachine, extendedStateMachine));
			}
		}
		return extendedStateMachine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StateMachine basicGetExtendedStateMachine() {
		return extendedStateMachine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExtendedStateMachine(StateMachine newExtendedStateMachine) {
		StateMachine oldExtendedStateMachine = extendedStateMachine;
		extendedStateMachine = newExtendedStateMachine;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2Package.STATE_MACHINE__EXTENDED_STATE_MACHINE, oldExtendedStateMachine, extendedStateMachine));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BehavioredClassifier getStateMachine_redefinitionContext() {
		if (eContainerFeatureID != UML2Package.STATE_MACHINE__STATE_MACHINE_REDEFINITION_CONTEXT) {
			return null;
		}
		return (BehavioredClassifier) eContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStateMachine_redefinitionContext(BehavioredClassifier newStateMachine_redefinitionContext) {
		if (eContainer != newStateMachine_redefinitionContext || (eContainerFeatureID != UML2Package.STATE_MACHINE__STATE_MACHINE_REDEFINITION_CONTEXT && null != newStateMachine_redefinitionContext)) {
			if (EcoreUtil.isAncestor(this, newStateMachine_redefinitionContext)) {
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString()); //$NON-NLS-1$
			}
			NotificationChain msgs = null;
			if (null != eContainer) {
				msgs = eBasicRemoveFromContainer(msgs);
			}
			if (null != newStateMachine_redefinitionContext) {
				msgs = ((InternalEObject) newStateMachine_redefinitionContext).eInverseAdd(this, UML2Package.BEHAVIORED_CLASSIFIER__OWNED_STATE_MACHINE, BehavioredClassifier.class, msgs);
			}
			msgs = eBasicSetContainer((InternalEObject) newStateMachine_redefinitionContext, UML2Package.STATE_MACHINE__STATE_MACHINE_REDEFINITION_CONTEXT, msgs);
			if (null != msgs) {
				msgs.dispatch();
			}
		} else if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, UML2Package.STATE_MACHINE__STATE_MACHINE_REDEFINITION_CONTEXT, newStateMachine_redefinitionContext, newStateMachine_redefinitionContext));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getRedefinedElements() {
		return new BasicEList.UnmodifiableEList(0, Collections.EMPTY_LIST.toArray());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getRedefinitionContexts() {
		return new EcoreEList.UnmodifiableEList(this, UML2Package.eINSTANCE.getRedefinableElement_RedefinitionContext(), 0, Collections.EMPTY_LIST.toArray());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getOwnedMembers() {
		EList result = (EList) getCacheAdapter().get(this, UML2Package.eINSTANCE.getStateMachine().getEAllOperations().get(91));

		if (null == result) {
			Set union = new LinkedHashSet();
			union.addAll(super.getOwnedMembers());
			union.addAll(getRegions());
			union.addAll(getConnectionPoints());

			result = new BasicEList.UnmodifiableEList(union.size(), union.toArray());
			getCacheAdapter().put(this, UML2Package.eINSTANCE.getStateMachine().getEAllOperations().get(91), result);
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
				case UML2Package.STATE_MACHINE__EANNOTATIONS:
					return ((InternalEList)getEAnnotations()).basicAdd(otherEnd, msgs);
				case UML2Package.STATE_MACHINE__TEMPLATE_BINDING:
					return ((InternalEList)getTemplateBindings()).basicAdd(otherEnd, msgs);
				case UML2Package.STATE_MACHINE__OWNED_TEMPLATE_SIGNATURE:
					if (ownedTemplateSignature != null)
						msgs = ((InternalEObject)ownedTemplateSignature).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UML2Package.STATE_MACHINE__OWNED_TEMPLATE_SIGNATURE, null, msgs);
					return basicSetOwnedTemplateSignature((TemplateSignature)otherEnd, msgs);
				case UML2Package.STATE_MACHINE__CLIENT_DEPENDENCY:
					return ((InternalEList)getClientDependencies()).basicAdd(otherEnd, msgs);
				case UML2Package.STATE_MACHINE__OWNED_RULE:
					return ((InternalEList)getOwnedRules()).basicAdd(otherEnd, msgs);
				case UML2Package.STATE_MACHINE__ELEMENT_IMPORT:
					return ((InternalEList)getElementImports()).basicAdd(otherEnd, msgs);
				case UML2Package.STATE_MACHINE__PACKAGE_IMPORT:
					return ((InternalEList)getPackageImports()).basicAdd(otherEnd, msgs);
				case UML2Package.STATE_MACHINE__TEMPLATE_PARAMETER:
					if (templateParameter != null)
						msgs = ((InternalEObject)templateParameter).eInverseRemove(this, UML2Package.TEMPLATE_PARAMETER__PARAMETERED_ELEMENT, TemplateParameter.class, msgs);
					return basicSetTemplateParameter((TemplateParameter)otherEnd, msgs);
				case UML2Package.STATE_MACHINE__OWNING_PARAMETER:
					if (eContainer != null)
						msgs = eBasicRemoveFromContainer(msgs);
					return eBasicSetContainer(otherEnd, UML2Package.STATE_MACHINE__OWNING_PARAMETER, msgs);
				case UML2Package.STATE_MACHINE__GENERALIZATION:
					return ((InternalEList)getGeneralizations()).basicAdd(otherEnd, msgs);
				case UML2Package.STATE_MACHINE__SUBSTITUTION:
					return ((InternalEList)getSubstitutions()).basicAdd(otherEnd, msgs);
				case UML2Package.STATE_MACHINE__POWERTYPE_EXTENT:
					return ((InternalEList)getPowertypeExtents()).basicAdd(otherEnd, msgs);
				case UML2Package.STATE_MACHINE__USE_CASE:
					return ((InternalEList)getUseCases()).basicAdd(otherEnd, msgs);
				case UML2Package.STATE_MACHINE__OWNED_BEHAVIOR:
					return ((InternalEList)getOwnedBehaviors()).basicAdd(otherEnd, msgs);
				case UML2Package.STATE_MACHINE__IMPLEMENTATION:
					return ((InternalEList)getImplementations()).basicAdd(otherEnd, msgs);
				case UML2Package.STATE_MACHINE__OWNED_STATE_MACHINE:
					return ((InternalEList)getOwnedStateMachines()).basicAdd(otherEnd, msgs);
				case UML2Package.STATE_MACHINE__OWNED_OPERATION:
					return ((InternalEList)getOwnedOperations()).basicAdd(otherEnd, msgs);
				case UML2Package.STATE_MACHINE__CONTEXT:
					if (eContainer != null)
						msgs = eBasicRemoveFromContainer(msgs);
					return eBasicSetContainer(otherEnd, UML2Package.STATE_MACHINE__CONTEXT, msgs);
				case UML2Package.STATE_MACHINE__SPECIFICATION:
					if (specification != null)
						msgs = ((InternalEObject)specification).eInverseRemove(this, UML2Package.BEHAVIORAL_FEATURE__METHOD, BehavioralFeature.class, msgs);
					return basicSetSpecification((BehavioralFeature)otherEnd, msgs);
				case UML2Package.STATE_MACHINE__REGION:
					return ((InternalEList)getRegions()).basicAdd(otherEnd, msgs);
				case UML2Package.STATE_MACHINE__STATE_MACHINE_REDEFINITION_CONTEXT:
					if (eContainer != null)
						msgs = eBasicRemoveFromContainer(msgs);
					return eBasicSetContainer(otherEnd, UML2Package.STATE_MACHINE__STATE_MACHINE_REDEFINITION_CONTEXT, msgs);
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
				case UML2Package.STATE_MACHINE__EANNOTATIONS:
					return ((InternalEList)getEAnnotations()).basicRemove(otherEnd, msgs);
				case UML2Package.STATE_MACHINE__OWNED_COMMENT:
					return ((InternalEList)getOwnedComments()).basicRemove(otherEnd, msgs);
				case UML2Package.STATE_MACHINE__TEMPLATE_BINDING:
					return ((InternalEList)getTemplateBindings()).basicRemove(otherEnd, msgs);
				case UML2Package.STATE_MACHINE__OWNED_TEMPLATE_SIGNATURE:
					return basicSetOwnedTemplateSignature(null, msgs);
				case UML2Package.STATE_MACHINE__CLIENT_DEPENDENCY:
					return ((InternalEList)getClientDependencies()).basicRemove(otherEnd, msgs);
				case UML2Package.STATE_MACHINE__NAME_EXPRESSION:
					return basicSetNameExpression(null, msgs);
				case UML2Package.STATE_MACHINE__OWNED_RULE:
					return ((InternalEList)getOwnedRules()).basicRemove(otherEnd, msgs);
				case UML2Package.STATE_MACHINE__ELEMENT_IMPORT:
					return ((InternalEList)getElementImports()).basicRemove(otherEnd, msgs);
				case UML2Package.STATE_MACHINE__PACKAGE_IMPORT:
					return ((InternalEList)getPackageImports()).basicRemove(otherEnd, msgs);
				case UML2Package.STATE_MACHINE__TEMPLATE_PARAMETER:
					return basicSetTemplateParameter(null, msgs);
				case UML2Package.STATE_MACHINE__OWNING_PARAMETER:
					return eBasicSetContainer(null, UML2Package.STATE_MACHINE__OWNING_PARAMETER, msgs);
				case UML2Package.STATE_MACHINE__GENERALIZATION:
					return ((InternalEList)getGeneralizations()).basicRemove(otherEnd, msgs);
				case UML2Package.STATE_MACHINE__SUBSTITUTION:
					return ((InternalEList)getSubstitutions()).basicRemove(otherEnd, msgs);
				case UML2Package.STATE_MACHINE__POWERTYPE_EXTENT:
					return ((InternalEList)getPowertypeExtents()).basicRemove(otherEnd, msgs);
				case UML2Package.STATE_MACHINE__OWNED_USE_CASE:
					return ((InternalEList)getOwnedUseCases()).basicRemove(otherEnd, msgs);
				case UML2Package.STATE_MACHINE__USE_CASE:
					return ((InternalEList)getUseCases()).basicRemove(otherEnd, msgs);
				case UML2Package.STATE_MACHINE__OCCURRENCE:
					return ((InternalEList)getOccurrences()).basicRemove(otherEnd, msgs);
				case UML2Package.STATE_MACHINE__OWNED_BEHAVIOR:
					return ((InternalEList)getOwnedBehaviors()).basicRemove(otherEnd, msgs);
				case UML2Package.STATE_MACHINE__IMPLEMENTATION:
					return ((InternalEList)getImplementations()).basicRemove(otherEnd, msgs);
				case UML2Package.STATE_MACHINE__OWNED_TRIGGER:
					return ((InternalEList)getOwnedTriggers()).basicRemove(otherEnd, msgs);
				case UML2Package.STATE_MACHINE__OWNED_STATE_MACHINE:
					return ((InternalEList)getOwnedStateMachines()).basicRemove(otherEnd, msgs);
				case UML2Package.STATE_MACHINE__OWNED_ATTRIBUTE:
					return ((InternalEList)getOwnedAttributes()).basicRemove(otherEnd, msgs);
				case UML2Package.STATE_MACHINE__OWNED_CONNECTOR:
					return ((InternalEList)getOwnedConnectors()).basicRemove(otherEnd, msgs);
				case UML2Package.STATE_MACHINE__OWNED_PORT:
					return ((InternalEList)getOwnedPorts()).basicRemove(otherEnd, msgs);
				case UML2Package.STATE_MACHINE__OWNED_OPERATION:
					return ((InternalEList)getOwnedOperations()).basicRemove(otherEnd, msgs);
				case UML2Package.STATE_MACHINE__NESTED_CLASSIFIER:
					return ((InternalEList)getNestedClassifiers()).basicRemove(otherEnd, msgs);
				case UML2Package.STATE_MACHINE__OWNED_RECEPTION:
					return ((InternalEList)getOwnedReceptions()).basicRemove(otherEnd, msgs);
				case UML2Package.STATE_MACHINE__CONTEXT:
					return eBasicSetContainer(null, UML2Package.STATE_MACHINE__CONTEXT, msgs);
				case UML2Package.STATE_MACHINE__SPECIFICATION:
					return basicSetSpecification(null, msgs);
				case UML2Package.STATE_MACHINE__PARAMETER:
					return ((InternalEList)getParameters()).basicRemove(otherEnd, msgs);
				case UML2Package.STATE_MACHINE__OWNED_PARAMETER_SET:
					return ((InternalEList)getOwnedParameterSets()).basicRemove(otherEnd, msgs);
				case UML2Package.STATE_MACHINE__REGION:
					return ((InternalEList)getRegions()).basicRemove(otherEnd, msgs);
				case UML2Package.STATE_MACHINE__CONNECTION_POINT:
					return ((InternalEList)getConnectionPoints()).basicRemove(otherEnd, msgs);
				case UML2Package.STATE_MACHINE__STATE_MACHINE_REDEFINITION_CONTEXT:
					return eBasicSetContainer(null, UML2Package.STATE_MACHINE__STATE_MACHINE_REDEFINITION_CONTEXT, msgs);
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
				case UML2Package.STATE_MACHINE__OWNING_PARAMETER:
					return eContainer.eInverseRemove(this, UML2Package.TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT, TemplateParameter.class, msgs);
				case UML2Package.STATE_MACHINE__CONTEXT:
					return eContainer.eInverseRemove(this, UML2Package.BEHAVIORED_CLASSIFIER__OWNED_BEHAVIOR, BehavioredClassifier.class, msgs);
				case UML2Package.STATE_MACHINE__STATE_MACHINE_REDEFINITION_CONTEXT:
					return eContainer.eInverseRemove(this, UML2Package.BEHAVIORED_CLASSIFIER__OWNED_STATE_MACHINE, BehavioredClassifier.class, msgs);
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
			case UML2Package.STATE_MACHINE__EANNOTATIONS:
				return getEAnnotations();
			case UML2Package.STATE_MACHINE__OWNED_ELEMENT:
				return getOwnedElements();
			case UML2Package.STATE_MACHINE__OWNER:
				if (resolve) return getOwner();
				return basicGetOwner();
			case UML2Package.STATE_MACHINE__OWNED_COMMENT:
				return getOwnedComments();
			case UML2Package.STATE_MACHINE__TEMPLATE_BINDING:
				return getTemplateBindings();
			case UML2Package.STATE_MACHINE__OWNED_TEMPLATE_SIGNATURE:
				return getOwnedTemplateSignature();
			case UML2Package.STATE_MACHINE__NAME:
				return getName();
			case UML2Package.STATE_MACHINE__QUALIFIED_NAME:
				return getQualifiedName();
			case UML2Package.STATE_MACHINE__VISIBILITY:
				return getVisibility();
			case UML2Package.STATE_MACHINE__CLIENT_DEPENDENCY:
				return getClientDependencies();
			case UML2Package.STATE_MACHINE__NAME_EXPRESSION:
				return getNameExpression();
			case UML2Package.STATE_MACHINE__MEMBER:
				return getMembers();
			case UML2Package.STATE_MACHINE__OWNED_RULE:
				return getOwnedRules();
			case UML2Package.STATE_MACHINE__IMPORTED_MEMBER:
				return getImportedMembers();
			case UML2Package.STATE_MACHINE__ELEMENT_IMPORT:
				return getElementImports();
			case UML2Package.STATE_MACHINE__PACKAGE_IMPORT:
				return getPackageImports();
			case UML2Package.STATE_MACHINE__TEMPLATE_PARAMETER:
				if (resolve) return getTemplateParameter();
				return basicGetTemplateParameter();
			case UML2Package.STATE_MACHINE__OWNING_PARAMETER:
				return getOwningParameter();
			case UML2Package.STATE_MACHINE__PACKAGEABLE_ELEMENT_VISIBILITY:
				return getPackageableElement_visibility();
			case UML2Package.STATE_MACHINE__PACKAGE:
				if (resolve) return getPackage();
				return basicGetPackage();
			case UML2Package.STATE_MACHINE__REDEFINITION_CONTEXT:
				return getRedefinitionContexts();
			case UML2Package.STATE_MACHINE__IS_LEAF:
				return isLeaf() ? Boolean.TRUE : Boolean.FALSE;
			case UML2Package.STATE_MACHINE__FEATURE:
				return getFeatures();
			case UML2Package.STATE_MACHINE__IS_ABSTRACT:
				return isAbstract() ? Boolean.TRUE : Boolean.FALSE;
			case UML2Package.STATE_MACHINE__INHERITED_MEMBER:
				return getInheritedMembers();
			case UML2Package.STATE_MACHINE__GENERAL:
				return getGenerals();
			case UML2Package.STATE_MACHINE__GENERALIZATION:
				return getGeneralizations();
			case UML2Package.STATE_MACHINE__ATTRIBUTE:
				return getAttributes();
			case UML2Package.STATE_MACHINE__REDEFINED_CLASSIFIER:
				return getRedefinedClassifiers();
			case UML2Package.STATE_MACHINE__SUBSTITUTION:
				return getSubstitutions();
			case UML2Package.STATE_MACHINE__POWERTYPE_EXTENT:
				return getPowertypeExtents();
			case UML2Package.STATE_MACHINE__OWNED_USE_CASE:
				return getOwnedUseCases();
			case UML2Package.STATE_MACHINE__USE_CASE:
				return getUseCases();
			case UML2Package.STATE_MACHINE__REPRESENTATION:
				return getRepresentation();
			case UML2Package.STATE_MACHINE__OCCURRENCE:
				return getOccurrences();
			case UML2Package.STATE_MACHINE__OWNED_BEHAVIOR:
				return getOwnedBehaviors();
			case UML2Package.STATE_MACHINE__CLASSIFIER_BEHAVIOR:
				return getClassifierBehavior();
			case UML2Package.STATE_MACHINE__IMPLEMENTATION:
				return getImplementations();
			case UML2Package.STATE_MACHINE__OWNED_TRIGGER:
				return getOwnedTriggers();
			case UML2Package.STATE_MACHINE__OWNED_STATE_MACHINE:
				return getOwnedStateMachines();
			case UML2Package.STATE_MACHINE__OWNED_ATTRIBUTE:
				return getOwnedAttributes();
			case UML2Package.STATE_MACHINE__PART:
				return getParts();
			case UML2Package.STATE_MACHINE__ROLE:
				return getRoles();
			case UML2Package.STATE_MACHINE__OWNED_CONNECTOR:
				return getOwnedConnectors();
			case UML2Package.STATE_MACHINE__OWNED_PORT:
				return getOwnedPorts();
			case UML2Package.STATE_MACHINE__OWNED_OPERATION:
				return getOwnedOperations();
			case UML2Package.STATE_MACHINE__SUPER_CLASS:
				return getSuperClasses();
			case UML2Package.STATE_MACHINE__EXTENSION:
				return getExtensions();
			case UML2Package.STATE_MACHINE__NESTED_CLASSIFIER:
				return getNestedClassifiers();
			case UML2Package.STATE_MACHINE__IS_ACTIVE:
				return isActive() ? Boolean.TRUE : Boolean.FALSE;
			case UML2Package.STATE_MACHINE__OWNED_RECEPTION:
				return getOwnedReceptions();
			case UML2Package.STATE_MACHINE__IS_REENTRANT:
				return isReentrant() ? Boolean.TRUE : Boolean.FALSE;
			case UML2Package.STATE_MACHINE__CONTEXT:
				return getContext();
			case UML2Package.STATE_MACHINE__REDEFINED_BEHAVIOR:
				return getRedefinedBehaviors();
			case UML2Package.STATE_MACHINE__SPECIFICATION:
				if (resolve) return getSpecification();
				return basicGetSpecification();
			case UML2Package.STATE_MACHINE__PARAMETER:
				return getParameters();
			case UML2Package.STATE_MACHINE__FORMAL_PARAMETER:
				return getFormalParameters();
			case UML2Package.STATE_MACHINE__RETURN_RESULT:
				return getReturnResults();
			case UML2Package.STATE_MACHINE__PRECONDITION:
				return getPreconditions();
			case UML2Package.STATE_MACHINE__POSTCONDITION:
				return getPostconditions();
			case UML2Package.STATE_MACHINE__OWNED_PARAMETER_SET:
				return getOwnedParameterSets();
			case UML2Package.STATE_MACHINE__REGION:
				return getRegions();
			case UML2Package.STATE_MACHINE__CONNECTION_POINT:
				return getConnectionPoints();
			case UML2Package.STATE_MACHINE__EXTENDED_STATE_MACHINE:
				if (resolve) return getExtendedStateMachine();
				return basicGetExtendedStateMachine();
			case UML2Package.STATE_MACHINE__STATE_MACHINE_REDEFINITION_CONTEXT:
				return getStateMachine_redefinitionContext();
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
			case UML2Package.STATE_MACHINE__EANNOTATIONS:
				getEAnnotations().clear();
				getEAnnotations().addAll((Collection)newValue);
				return;
			case UML2Package.STATE_MACHINE__OWNED_COMMENT:
				getOwnedComments().clear();
				getOwnedComments().addAll((Collection)newValue);
				return;
			case UML2Package.STATE_MACHINE__TEMPLATE_BINDING:
				getTemplateBindings().clear();
				getTemplateBindings().addAll((Collection)newValue);
				return;
			case UML2Package.STATE_MACHINE__OWNED_TEMPLATE_SIGNATURE:
				setOwnedTemplateSignature((TemplateSignature)newValue);
				return;
			case UML2Package.STATE_MACHINE__NAME:
				setName((String)newValue);
				return;
			case UML2Package.STATE_MACHINE__VISIBILITY:
				setVisibility((VisibilityKind)newValue);
				return;
			case UML2Package.STATE_MACHINE__CLIENT_DEPENDENCY:
				getClientDependencies().clear();
				getClientDependencies().addAll((Collection)newValue);
				return;
			case UML2Package.STATE_MACHINE__NAME_EXPRESSION:
				setNameExpression((StringExpression)newValue);
				return;
			case UML2Package.STATE_MACHINE__OWNED_RULE:
				getOwnedRules().clear();
				getOwnedRules().addAll((Collection)newValue);
				return;
			case UML2Package.STATE_MACHINE__ELEMENT_IMPORT:
				getElementImports().clear();
				getElementImports().addAll((Collection)newValue);
				return;
			case UML2Package.STATE_MACHINE__PACKAGE_IMPORT:
				getPackageImports().clear();
				getPackageImports().addAll((Collection)newValue);
				return;
			case UML2Package.STATE_MACHINE__TEMPLATE_PARAMETER:
				setTemplateParameter((TemplateParameter)newValue);
				return;
			case UML2Package.STATE_MACHINE__OWNING_PARAMETER:
				setOwningParameter((TemplateParameter)newValue);
				return;
			case UML2Package.STATE_MACHINE__PACKAGEABLE_ELEMENT_VISIBILITY:
				setPackageableElement_visibility((VisibilityKind)newValue);
				return;
			case UML2Package.STATE_MACHINE__IS_LEAF:
				setIsLeaf(((Boolean)newValue).booleanValue());
				return;
			case UML2Package.STATE_MACHINE__IS_ABSTRACT:
				setIsAbstract(((Boolean)newValue).booleanValue());
				return;
			case UML2Package.STATE_MACHINE__GENERALIZATION:
				getGeneralizations().clear();
				getGeneralizations().addAll((Collection)newValue);
				return;
			case UML2Package.STATE_MACHINE__REDEFINED_CLASSIFIER:
				getRedefinedClassifiers().clear();
				getRedefinedClassifiers().addAll((Collection)newValue);
				return;
			case UML2Package.STATE_MACHINE__SUBSTITUTION:
				getSubstitutions().clear();
				getSubstitutions().addAll((Collection)newValue);
				return;
			case UML2Package.STATE_MACHINE__POWERTYPE_EXTENT:
				getPowertypeExtents().clear();
				getPowertypeExtents().addAll((Collection)newValue);
				return;
			case UML2Package.STATE_MACHINE__OWNED_USE_CASE:
				getOwnedUseCases().clear();
				getOwnedUseCases().addAll((Collection)newValue);
				return;
			case UML2Package.STATE_MACHINE__USE_CASE:
				getUseCases().clear();
				getUseCases().addAll((Collection)newValue);
				return;
			case UML2Package.STATE_MACHINE__REPRESENTATION:
				setRepresentation((CollaborationOccurrence)newValue);
				return;
			case UML2Package.STATE_MACHINE__OCCURRENCE:
				getOccurrences().clear();
				getOccurrences().addAll((Collection)newValue);
				return;
			case UML2Package.STATE_MACHINE__OWNED_BEHAVIOR:
				getOwnedBehaviors().clear();
				getOwnedBehaviors().addAll((Collection)newValue);
				return;
			case UML2Package.STATE_MACHINE__CLASSIFIER_BEHAVIOR:
				setClassifierBehavior((Behavior)newValue);
				return;
			case UML2Package.STATE_MACHINE__IMPLEMENTATION:
				getImplementations().clear();
				getImplementations().addAll((Collection)newValue);
				return;
			case UML2Package.STATE_MACHINE__OWNED_TRIGGER:
				getOwnedTriggers().clear();
				getOwnedTriggers().addAll((Collection)newValue);
				return;
			case UML2Package.STATE_MACHINE__OWNED_STATE_MACHINE:
				getOwnedStateMachines().clear();
				getOwnedStateMachines().addAll((Collection)newValue);
				return;
			case UML2Package.STATE_MACHINE__OWNED_ATTRIBUTE:
				getOwnedAttributes().clear();
				getOwnedAttributes().addAll((Collection)newValue);
				return;
			case UML2Package.STATE_MACHINE__OWNED_CONNECTOR:
				getOwnedConnectors().clear();
				getOwnedConnectors().addAll((Collection)newValue);
				return;
			case UML2Package.STATE_MACHINE__OWNED_PORT:
				getOwnedPorts().clear();
				getOwnedPorts().addAll((Collection)newValue);
				return;
			case UML2Package.STATE_MACHINE__OWNED_OPERATION:
				getOwnedOperations().clear();
				getOwnedOperations().addAll((Collection)newValue);
				return;
			case UML2Package.STATE_MACHINE__NESTED_CLASSIFIER:
				getNestedClassifiers().clear();
				getNestedClassifiers().addAll((Collection)newValue);
				return;
			case UML2Package.STATE_MACHINE__IS_ACTIVE:
				setIsActive(((Boolean)newValue).booleanValue());
				return;
			case UML2Package.STATE_MACHINE__OWNED_RECEPTION:
				getOwnedReceptions().clear();
				getOwnedReceptions().addAll((Collection)newValue);
				return;
			case UML2Package.STATE_MACHINE__IS_REENTRANT:
				setIsReentrant(((Boolean)newValue).booleanValue());
				return;
			case UML2Package.STATE_MACHINE__CONTEXT:
				setContext((BehavioredClassifier)newValue);
				return;
			case UML2Package.STATE_MACHINE__REDEFINED_BEHAVIOR:
				getRedefinedBehaviors().clear();
				getRedefinedBehaviors().addAll((Collection)newValue);
				return;
			case UML2Package.STATE_MACHINE__SPECIFICATION:
				setSpecification((BehavioralFeature)newValue);
				return;
			case UML2Package.STATE_MACHINE__PARAMETER:
				getParameters().clear();
				getParameters().addAll((Collection)newValue);
				return;
			case UML2Package.STATE_MACHINE__PRECONDITION:
				getPreconditions().clear();
				getPreconditions().addAll((Collection)newValue);
				return;
			case UML2Package.STATE_MACHINE__POSTCONDITION:
				getPostconditions().clear();
				getPostconditions().addAll((Collection)newValue);
				return;
			case UML2Package.STATE_MACHINE__OWNED_PARAMETER_SET:
				getOwnedParameterSets().clear();
				getOwnedParameterSets().addAll((Collection)newValue);
				return;
			case UML2Package.STATE_MACHINE__REGION:
				getRegions().clear();
				getRegions().addAll((Collection)newValue);
				return;
			case UML2Package.STATE_MACHINE__CONNECTION_POINT:
				getConnectionPoints().clear();
				getConnectionPoints().addAll((Collection)newValue);
				return;
			case UML2Package.STATE_MACHINE__EXTENDED_STATE_MACHINE:
				setExtendedStateMachine((StateMachine)newValue);
				return;
			case UML2Package.STATE_MACHINE__STATE_MACHINE_REDEFINITION_CONTEXT:
				setStateMachine_redefinitionContext((BehavioredClassifier)newValue);
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
			case UML2Package.STATE_MACHINE__EANNOTATIONS:
				getEAnnotations().clear();
				return;
			case UML2Package.STATE_MACHINE__OWNED_COMMENT:
				getOwnedComments().clear();
				return;
			case UML2Package.STATE_MACHINE__TEMPLATE_BINDING:
				getTemplateBindings().clear();
				return;
			case UML2Package.STATE_MACHINE__OWNED_TEMPLATE_SIGNATURE:
				setOwnedTemplateSignature((TemplateSignature)null);
				return;
			case UML2Package.STATE_MACHINE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case UML2Package.STATE_MACHINE__VISIBILITY:
				setVisibility(VISIBILITY_EDEFAULT);
				return;
			case UML2Package.STATE_MACHINE__CLIENT_DEPENDENCY:
				getClientDependencies().clear();
				return;
			case UML2Package.STATE_MACHINE__NAME_EXPRESSION:
				setNameExpression((StringExpression)null);
				return;
			case UML2Package.STATE_MACHINE__OWNED_RULE:
				getOwnedRules().clear();
				return;
			case UML2Package.STATE_MACHINE__ELEMENT_IMPORT:
				getElementImports().clear();
				return;
			case UML2Package.STATE_MACHINE__PACKAGE_IMPORT:
				getPackageImports().clear();
				return;
			case UML2Package.STATE_MACHINE__TEMPLATE_PARAMETER:
				setTemplateParameter((TemplateParameter)null);
				return;
			case UML2Package.STATE_MACHINE__OWNING_PARAMETER:
				setOwningParameter((TemplateParameter)null);
				return;
			case UML2Package.STATE_MACHINE__PACKAGEABLE_ELEMENT_VISIBILITY:
				setPackageableElement_visibility(PACKAGEABLE_ELEMENT_VISIBILITY_EDEFAULT);
				return;
			case UML2Package.STATE_MACHINE__IS_LEAF:
				setIsLeaf(IS_LEAF_EDEFAULT);
				return;
			case UML2Package.STATE_MACHINE__IS_ABSTRACT:
				setIsAbstract(IS_ABSTRACT_EDEFAULT);
				return;
			case UML2Package.STATE_MACHINE__GENERALIZATION:
				getGeneralizations().clear();
				return;
			case UML2Package.STATE_MACHINE__REDEFINED_CLASSIFIER:
				getRedefinedClassifiers().clear();
				return;
			case UML2Package.STATE_MACHINE__SUBSTITUTION:
				getSubstitutions().clear();
				return;
			case UML2Package.STATE_MACHINE__POWERTYPE_EXTENT:
				getPowertypeExtents().clear();
				return;
			case UML2Package.STATE_MACHINE__OWNED_USE_CASE:
				getOwnedUseCases().clear();
				return;
			case UML2Package.STATE_MACHINE__USE_CASE:
				getUseCases().clear();
				return;
			case UML2Package.STATE_MACHINE__REPRESENTATION:
				setRepresentation((CollaborationOccurrence)null);
				return;
			case UML2Package.STATE_MACHINE__OCCURRENCE:
				getOccurrences().clear();
				return;
			case UML2Package.STATE_MACHINE__OWNED_BEHAVIOR:
				getOwnedBehaviors().clear();
				return;
			case UML2Package.STATE_MACHINE__CLASSIFIER_BEHAVIOR:
				setClassifierBehavior((Behavior)null);
				return;
			case UML2Package.STATE_MACHINE__IMPLEMENTATION:
				getImplementations().clear();
				return;
			case UML2Package.STATE_MACHINE__OWNED_TRIGGER:
				getOwnedTriggers().clear();
				return;
			case UML2Package.STATE_MACHINE__OWNED_STATE_MACHINE:
				getOwnedStateMachines().clear();
				return;
			case UML2Package.STATE_MACHINE__OWNED_ATTRIBUTE:
				getOwnedAttributes().clear();
				return;
			case UML2Package.STATE_MACHINE__OWNED_CONNECTOR:
				getOwnedConnectors().clear();
				return;
			case UML2Package.STATE_MACHINE__OWNED_PORT:
				getOwnedPorts().clear();
				return;
			case UML2Package.STATE_MACHINE__OWNED_OPERATION:
				getOwnedOperations().clear();
				return;
			case UML2Package.STATE_MACHINE__NESTED_CLASSIFIER:
				getNestedClassifiers().clear();
				return;
			case UML2Package.STATE_MACHINE__IS_ACTIVE:
				setIsActive(IS_ACTIVE_EDEFAULT);
				return;
			case UML2Package.STATE_MACHINE__OWNED_RECEPTION:
				getOwnedReceptions().clear();
				return;
			case UML2Package.STATE_MACHINE__IS_REENTRANT:
				setIsReentrant(IS_REENTRANT_EDEFAULT);
				return;
			case UML2Package.STATE_MACHINE__CONTEXT:
				setContext((BehavioredClassifier)null);
				return;
			case UML2Package.STATE_MACHINE__REDEFINED_BEHAVIOR:
				getRedefinedBehaviors().clear();
				return;
			case UML2Package.STATE_MACHINE__SPECIFICATION:
				setSpecification((BehavioralFeature)null);
				return;
			case UML2Package.STATE_MACHINE__PARAMETER:
				getParameters().clear();
				return;
			case UML2Package.STATE_MACHINE__PRECONDITION:
				getPreconditions().clear();
				return;
			case UML2Package.STATE_MACHINE__POSTCONDITION:
				getPostconditions().clear();
				return;
			case UML2Package.STATE_MACHINE__OWNED_PARAMETER_SET:
				getOwnedParameterSets().clear();
				return;
			case UML2Package.STATE_MACHINE__REGION:
				getRegions().clear();
				return;
			case UML2Package.STATE_MACHINE__CONNECTION_POINT:
				getConnectionPoints().clear();
				return;
			case UML2Package.STATE_MACHINE__EXTENDED_STATE_MACHINE:
				setExtendedStateMachine((StateMachine)null);
				return;
			case UML2Package.STATE_MACHINE__STATE_MACHINE_REDEFINITION_CONTEXT:
				setStateMachine_redefinitionContext((BehavioredClassifier)null);
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
			case UML2Package.STATE_MACHINE__EANNOTATIONS:
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UML2Package.STATE_MACHINE__OWNED_ELEMENT:
				return !getOwnedElements().isEmpty();
			case UML2Package.STATE_MACHINE__OWNER:
				return basicGetOwner() != null;
			case UML2Package.STATE_MACHINE__OWNED_COMMENT:
				return ownedComment != null && !ownedComment.isEmpty();
			case UML2Package.STATE_MACHINE__TEMPLATE_BINDING:
				return templateBinding != null && !templateBinding.isEmpty();
			case UML2Package.STATE_MACHINE__OWNED_TEMPLATE_SIGNATURE:
				return ownedTemplateSignature != null;
			case UML2Package.STATE_MACHINE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case UML2Package.STATE_MACHINE__QUALIFIED_NAME:
				return QUALIFIED_NAME_EDEFAULT == null ? getQualifiedName() != null : !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case UML2Package.STATE_MACHINE__VISIBILITY:
				return false;
			case UML2Package.STATE_MACHINE__CLIENT_DEPENDENCY:
				return clientDependency != null && !clientDependency.isEmpty();
			case UML2Package.STATE_MACHINE__NAME_EXPRESSION:
				return nameExpression != null;
			case UML2Package.STATE_MACHINE__MEMBER:
				return !getMembers().isEmpty();
			case UML2Package.STATE_MACHINE__OWNED_RULE:
				return ownedRule != null && !ownedRule.isEmpty();
			case UML2Package.STATE_MACHINE__IMPORTED_MEMBER:
				return !getImportedMembers().isEmpty();
			case UML2Package.STATE_MACHINE__ELEMENT_IMPORT:
				return elementImport != null && !elementImport.isEmpty();
			case UML2Package.STATE_MACHINE__PACKAGE_IMPORT:
				return packageImport != null && !packageImport.isEmpty();
			case UML2Package.STATE_MACHINE__TEMPLATE_PARAMETER:
				return templateParameter != null;
			case UML2Package.STATE_MACHINE__OWNING_PARAMETER:
				return getOwningParameter() != null;
			case UML2Package.STATE_MACHINE__PACKAGEABLE_ELEMENT_VISIBILITY:
				return packageableElement_visibility != PACKAGEABLE_ELEMENT_VISIBILITY_EDEFAULT;
			case UML2Package.STATE_MACHINE__PACKAGE:
				return basicGetPackage() != null;
			case UML2Package.STATE_MACHINE__REDEFINITION_CONTEXT:
				return !getRedefinitionContexts().isEmpty();
			case UML2Package.STATE_MACHINE__IS_LEAF:
				return isLeaf != IS_LEAF_EDEFAULT;
			case UML2Package.STATE_MACHINE__FEATURE:
				return !getFeatures().isEmpty();
			case UML2Package.STATE_MACHINE__IS_ABSTRACT:
				return isAbstract() != IS_ABSTRACT_EDEFAULT;
			case UML2Package.STATE_MACHINE__INHERITED_MEMBER:
				return !getInheritedMembers().isEmpty();
			case UML2Package.STATE_MACHINE__GENERAL:
				return !getGenerals().isEmpty();
			case UML2Package.STATE_MACHINE__GENERALIZATION:
				return generalization != null && !generalization.isEmpty();
			case UML2Package.STATE_MACHINE__ATTRIBUTE:
				return !getAttributes().isEmpty();
			case UML2Package.STATE_MACHINE__REDEFINED_CLASSIFIER:
				return redefinedClassifier != null && !redefinedClassifier.isEmpty();
			case UML2Package.STATE_MACHINE__SUBSTITUTION:
				return substitution != null && !substitution.isEmpty();
			case UML2Package.STATE_MACHINE__POWERTYPE_EXTENT:
				return powertypeExtent != null && !powertypeExtent.isEmpty();
			case UML2Package.STATE_MACHINE__OWNED_USE_CASE:
				return ownedUseCase != null && !ownedUseCase.isEmpty();
			case UML2Package.STATE_MACHINE__USE_CASE:
				return useCase != null && !useCase.isEmpty();
			case UML2Package.STATE_MACHINE__REPRESENTATION:
				return representation != null;
			case UML2Package.STATE_MACHINE__OCCURRENCE:
				return occurrence != null && !occurrence.isEmpty();
			case UML2Package.STATE_MACHINE__OWNED_BEHAVIOR:
				return ownedBehavior != null && !ownedBehavior.isEmpty();
			case UML2Package.STATE_MACHINE__CLASSIFIER_BEHAVIOR:
				return classifierBehavior != null;
			case UML2Package.STATE_MACHINE__IMPLEMENTATION:
				return implementation != null && !implementation.isEmpty();
			case UML2Package.STATE_MACHINE__OWNED_TRIGGER:
				return ownedTrigger != null && !ownedTrigger.isEmpty();
			case UML2Package.STATE_MACHINE__OWNED_STATE_MACHINE:
				return ownedStateMachine != null && !ownedStateMachine.isEmpty();
			case UML2Package.STATE_MACHINE__OWNED_ATTRIBUTE:
				return !getOwnedAttributes().isEmpty();
			case UML2Package.STATE_MACHINE__PART:
				return !getParts().isEmpty();
			case UML2Package.STATE_MACHINE__ROLE:
				return !getRoles().isEmpty();
			case UML2Package.STATE_MACHINE__OWNED_CONNECTOR:
				return ownedConnector != null && !ownedConnector.isEmpty();
			case UML2Package.STATE_MACHINE__OWNED_PORT:
				return ownedPort != null && !ownedPort.isEmpty();
			case UML2Package.STATE_MACHINE__OWNED_OPERATION:
				return ownedOperation != null && !ownedOperation.isEmpty();
			case UML2Package.STATE_MACHINE__SUPER_CLASS:
				return !getSuperClasses().isEmpty();
			case UML2Package.STATE_MACHINE__EXTENSION:
				return !getExtensions().isEmpty();
			case UML2Package.STATE_MACHINE__NESTED_CLASSIFIER:
				return nestedClassifier != null && !nestedClassifier.isEmpty();
			case UML2Package.STATE_MACHINE__IS_ACTIVE:
				return isActive != IS_ACTIVE_EDEFAULT;
			case UML2Package.STATE_MACHINE__OWNED_RECEPTION:
				return ownedReception != null && !ownedReception.isEmpty();
			case UML2Package.STATE_MACHINE__IS_REENTRANT:
				return isReentrant != IS_REENTRANT_EDEFAULT;
			case UML2Package.STATE_MACHINE__CONTEXT:
				return getContext() != null;
			case UML2Package.STATE_MACHINE__REDEFINED_BEHAVIOR:
				return redefinedBehavior != null && !redefinedBehavior.isEmpty();
			case UML2Package.STATE_MACHINE__SPECIFICATION:
				return specification != null;
			case UML2Package.STATE_MACHINE__PARAMETER:
				return parameter != null && !parameter.isEmpty();
			case UML2Package.STATE_MACHINE__FORMAL_PARAMETER:
				return !getFormalParameters().isEmpty();
			case UML2Package.STATE_MACHINE__RETURN_RESULT:
				return !getReturnResults().isEmpty();
			case UML2Package.STATE_MACHINE__PRECONDITION:
				return precondition != null && !precondition.isEmpty();
			case UML2Package.STATE_MACHINE__POSTCONDITION:
				return postcondition != null && !postcondition.isEmpty();
			case UML2Package.STATE_MACHINE__OWNED_PARAMETER_SET:
				return ownedParameterSet != null && !ownedParameterSet.isEmpty();
			case UML2Package.STATE_MACHINE__REGION:
				return region != null && !region.isEmpty();
			case UML2Package.STATE_MACHINE__CONNECTION_POINT:
				return connectionPoint != null && !connectionPoint.isEmpty();
			case UML2Package.STATE_MACHINE__EXTENDED_STATE_MACHINE:
				return extendedStateMachine != null;
			case UML2Package.STATE_MACHINE__STATE_MACHINE_REDEFINITION_CONTEXT:
				return getStateMachine_redefinitionContext() != null;
		}
		return eDynamicIsSet(eFeature);
	}

} //StateMachineImpl
