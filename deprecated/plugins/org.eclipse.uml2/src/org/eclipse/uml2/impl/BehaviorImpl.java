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
 * $Id: BehaviorImpl.java,v 1.14 2004/06/15 16:13:32 khussey Exp $
 */
package org.eclipse.uml2.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
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
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EcoreEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.uml2.Behavior;
import org.eclipse.uml2.BehavioralFeature;
import org.eclipse.uml2.BehavioredClassifier;
import org.eclipse.uml2.CollaborationOccurrence;
import org.eclipse.uml2.Constraint;
import org.eclipse.uml2.Parameter;
import org.eclipse.uml2.ParameterSet;
import org.eclipse.uml2.ParameterDirectionKind;
import org.eclipse.uml2.StringExpression;
import org.eclipse.uml2.TemplateParameter;
import org.eclipse.uml2.TemplateSignature;
import org.eclipse.uml2.UML2Package;
import org.eclipse.uml2.VisibilityKind;
import org.eclipse.uml2.internal.util.SubsetEObjectEList;
import org.eclipse.uml2.internal.util.SupersetEObjectContainmentWithInverseEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Behavior</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2.impl.BehaviorImpl#isReentrant <em>Is Reentrant</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.BehaviorImpl#getContext <em>Context</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.BehaviorImpl#getRedefinedBehaviors <em>Redefined Behavior</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.BehaviorImpl#getSpecification <em>Specification</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.BehaviorImpl#getParameters <em>Parameter</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.BehaviorImpl#getFormalParameters <em>Formal Parameter</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.BehaviorImpl#getReturnResults <em>Return Result</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.BehaviorImpl#getPreconditions <em>Precondition</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.BehaviorImpl#getPostconditions <em>Postcondition</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.BehaviorImpl#getOwnedParameterSets <em>Owned Parameter Set</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class BehaviorImpl extends ClassImpl implements Behavior {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2003, 2004 IBM Corporation and others."; //$NON-NLS-1$

	/**
	 * The default value of the '{@link #isReentrant() <em>Is Reentrant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isReentrant()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_REENTRANT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isReentrant() <em>Is Reentrant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isReentrant()
	 * @generated
	 * @ordered
	 */
	protected boolean isReentrant = IS_REENTRANT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRedefinedBehaviors() <em>Redefined Behavior</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRedefinedBehaviors()
	 * @generated
	 * @ordered
	 */
	protected EList redefinedBehavior = null;

	/**
	 * The cached value of the '{@link #getSpecification() <em>Specification</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecification()
	 * @generated
	 * @ordered
	 */
	protected BehavioralFeature specification = null;

	/**
	 * The cached value of the '{@link #getParameters() <em>Parameter</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameters()
	 * @generated
	 * @ordered
	 */
	protected EList parameter = null;

	/**
	 * The cached value of the '{@link #getPreconditions() <em>Precondition</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreconditions()
	 * @generated
	 * @ordered
	 */
	protected EList precondition = null;

	/**
	 * The cached value of the '{@link #getPostconditions() <em>Postcondition</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPostconditions()
	 * @generated
	 * @ordered
	 */
	protected EList postcondition = null;

	/**
	 * The cached value of the '{@link #getOwnedParameterSets() <em>Owned Parameter Set</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedParameterSets()
	 * @generated
	 * @ordered
	 */
	protected EList ownedParameterSet = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BehaviorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return UML2Package.eINSTANCE.getBehavior();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isReentrant() {
		return isReentrant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsReentrant(boolean newIsReentrant) {
		boolean oldIsReentrant = isReentrant;
		isReentrant = newIsReentrant;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2Package.BEHAVIOR__IS_REENTRANT, oldIsReentrant, isReentrant));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BehavioredClassifier getContext() {
		if (eContainerFeatureID != UML2Package.BEHAVIOR__CONTEXT) {
			return null;
		}
		return (BehavioredClassifier) eContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContext(BehavioredClassifier newContext) {
		if (eContainer != newContext || (eContainerFeatureID != UML2Package.BEHAVIOR__CONTEXT && null != newContext)) {
			if (EcoreUtil.isAncestor(this, newContext)) {
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString()); //$NON-NLS-1$
			}
			NotificationChain msgs = null;
			if (null != eContainer) {
				msgs = eBasicRemoveFromContainer(msgs);
			}
			if (null != newContext) {
				msgs = ((InternalEObject) newContext).eInverseAdd(this, UML2Package.BEHAVIORED_CLASSIFIER__OWNED_BEHAVIOR, BehavioredClassifier.class, msgs);
			}
			msgs = eBasicSetContainer((InternalEObject) newContext, UML2Package.BEHAVIOR__CONTEXT, msgs);
			if (null != msgs) {
				msgs.dispatch();
			}
		} else if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, UML2Package.BEHAVIOR__CONTEXT, newContext, newContext));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getRedefinedBehaviors() {
		if (redefinedBehavior == null) {
			redefinedBehavior = new EObjectResolvingEList(Behavior.class, this, UML2Package.BEHAVIOR__REDEFINED_BEHAVIOR);
		}
		return redefinedBehavior;
	}

    /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
     */
    public Behavior getRedefinedBehavior(String unqualifiedName) {
    	for (Iterator i = getRedefinedBehaviors().iterator(); i.hasNext(); ) {
    		Behavior namedRedefinedBehavior = (Behavior) i.next();
    		
    		if (unqualifiedName.equals(namedRedefinedBehavior.getName())) {
    			return namedRedefinedBehavior;
    		}
    	}
    	
    	return null;
    }
      
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BehavioralFeature getSpecification() {
		if (specification != null && specification.eIsProxy()) {
			BehavioralFeature oldSpecification = specification;
			specification = (BehavioralFeature)eResolveProxy((InternalEObject)specification);
			if (specification != oldSpecification) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UML2Package.BEHAVIOR__SPECIFICATION, oldSpecification, specification));
			}
		}
		return specification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BehavioralFeature basicGetSpecification() {
		return specification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSpecification(BehavioralFeature newSpecification, NotificationChain msgs) {
		BehavioralFeature oldSpecification = specification;
		specification = newSpecification;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UML2Package.BEHAVIOR__SPECIFICATION, oldSpecification, newSpecification);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpecification(BehavioralFeature newSpecification) {
		if (newSpecification != specification) {
			NotificationChain msgs = null;
			if (specification != null)
				msgs = ((InternalEObject)specification).eInverseRemove(this, UML2Package.BEHAVIORAL_FEATURE__METHOD, BehavioralFeature.class, msgs);
			if (newSpecification != null)
				msgs = ((InternalEObject)newSpecification).eInverseAdd(this, UML2Package.BEHAVIORAL_FEATURE__METHOD, BehavioralFeature.class, msgs);
			msgs = basicSetSpecification(newSpecification, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2Package.BEHAVIOR__SPECIFICATION, newSpecification, newSpecification));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getParameters() {
		if (parameter == null) {
			parameter = new EObjectContainmentEList(Parameter.class, this, UML2Package.BEHAVIOR__PARAMETER);
		}
		return parameter;
	}

    /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
     */
    public Parameter getParameter(String unqualifiedName) {
    	for (Iterator i = getParameters().iterator(); i.hasNext(); ) {
    		Parameter namedParameter = (Parameter) i.next();
    		
    		if (unqualifiedName.equals(namedParameter.getName())) {
    			return namedParameter;
    		}
    	}
    	
    	return null;
    }
      
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parameter createParameter(EClass eClass) {
		Parameter newParameter = (Parameter) eClass.getEPackage().getEFactoryInstance().create(eClass);
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, 0, UML2Package.BEHAVIOR__PARAMETER, null, newParameter));
		}
		getParameters().add(newParameter);
		return newParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList getFormalParameters() {
		EList formalParameters = (EList) getCacheAdapter().get(eResource(),
			this, UML2Package.eINSTANCE.getBehavior_FormalParameter());

		if (null == formalParameters) {
			List formalParameter = new ArrayList();

			for (Iterator parameters = getParameters().iterator(); parameters
				.hasNext();) {

				Parameter parameter = (Parameter) parameters.next();

				if (!ParameterDirectionKind.RETURN_LITERAL.equals(parameter
					.getDirection())) {

					formalParameter.add(parameter);
				}
			}

			formalParameters = new EcoreEList.UnmodifiableEList(this,
				UML2Package.eINSTANCE.getBehavior_FormalParameter(),
				formalParameter.size(), formalParameter.toArray());
			getCacheAdapter().put(this,
				UML2Package.eINSTANCE.getBehavior_FormalParameter(),
				formalParameters);
		}

		return formalParameters;
	}

    /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
     */
    public Parameter getFormalParameter(String unqualifiedName) {
    	for (Iterator i = getFormalParameters().iterator(); i.hasNext(); ) {
    		Parameter namedFormalParameter = (Parameter) i.next();
    		
    		if (unqualifiedName.equals(namedFormalParameter.getName())) {
    			return namedFormalParameter;
    		}
    	}
    	
    	return null;
    }
      
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList getReturnResults() {
		EList returnResults = (EList) getCacheAdapter().get(eResource(), this,
			UML2Package.eINSTANCE.getBehavior_ReturnResult());

		if (null == returnResults) {
			List returnResult = new ArrayList();

			for (Iterator parameters = getParameters().iterator(); parameters
				.hasNext();) {
				
				Parameter parameter = (Parameter) parameters.next();

				if (ParameterDirectionKind.RETURN_LITERAL.equals(parameter
					.getDirection())) {
					
					returnResult.add(parameter);
				}
			}

			returnResults = new EcoreEList.UnmodifiableEList(this,
				UML2Package.eINSTANCE.getBehavior_ReturnResult(), returnResult
					.size(), returnResult.toArray());
			getCacheAdapter()
				.put(eResource(), this,
					UML2Package.eINSTANCE.getBehavior_ReturnResult(),
					returnResults);
		}

		return returnResults;
	}

    /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
     */
    public Parameter getReturnResult(String unqualifiedName) {
    	for (Iterator i = getReturnResults().iterator(); i.hasNext(); ) {
    		Parameter namedReturnResult = (Parameter) i.next();
    		
    		if (unqualifiedName.equals(namedReturnResult.getName())) {
    			return namedReturnResult;
    		}
    	}
    	
    	return null;
    }
      
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getPreconditions() {
		if (precondition == null) {
			precondition = new SubsetEObjectEList(Constraint.class, this, UML2Package.BEHAVIOR__PRECONDITION, new int[] {UML2Package.BEHAVIOR__OWNED_RULE});
		}
		return precondition;

	}

    /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
     */
    public Constraint getPrecondition(String unqualifiedName) {
    	for (Iterator i = getPreconditions().iterator(); i.hasNext(); ) {
    		Constraint namedPrecondition = (Constraint) i.next();
    		
    		if (unqualifiedName.equals(namedPrecondition.getName())) {
    			return namedPrecondition;
    		}
    	}
    	
    	return null;
    }
      
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getPostconditions() {
		if (postcondition == null) {
			postcondition = new SubsetEObjectEList(Constraint.class, this, UML2Package.BEHAVIOR__POSTCONDITION, new int[] {UML2Package.BEHAVIOR__OWNED_RULE});
		}
		return postcondition;

	}

    /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
     */
    public Constraint getPostcondition(String unqualifiedName) {
    	for (Iterator i = getPostconditions().iterator(); i.hasNext(); ) {
    		Constraint namedPostcondition = (Constraint) i.next();
    		
    		if (unqualifiedName.equals(namedPostcondition.getName())) {
    			return namedPostcondition;
    		}
    	}
    	
    	return null;
    }
      
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getOwnedParameterSets() {
		if (ownedParameterSet == null) {
			ownedParameterSet = new EObjectContainmentEList(ParameterSet.class, this, UML2Package.BEHAVIOR__OWNED_PARAMETER_SET);
		}
		return ownedParameterSet;
	}

    /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
     */
    public ParameterSet getOwnedParameterSet(String unqualifiedName) {
    	for (Iterator i = getOwnedParameterSets().iterator(); i.hasNext(); ) {
    		ParameterSet namedOwnedParameterSet = (ParameterSet) i.next();
    		
    		if (unqualifiedName.equals(namedOwnedParameterSet.getName())) {
    			return namedOwnedParameterSet;
    		}
    	}
    	
    	return null;
    }
      
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterSet createOwnedParameterSet(EClass eClass) {
		ParameterSet newOwnedParameterSet = (ParameterSet) eClass.getEPackage().getEFactoryInstance().create(eClass);
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, 0, UML2Package.BEHAVIOR__OWNED_PARAMETER_SET, null, newOwnedParameterSet));
		}
		getOwnedParameterSets().add(newOwnedParameterSet);
		return newOwnedParameterSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getRedefinedElements() {
		EList result = (EList) getCacheAdapter().get(this, UML2Package.eINSTANCE.getBehavior().getEAllOperations().get(86));

		if (null == result) {
			Set union = new LinkedHashSet();
			union.addAll(super.getRedefinedElements());
			union.addAll(getRedefinedBehaviors());

			result = new BasicEList.UnmodifiableEList(union.size(), union.toArray());
			getCacheAdapter().put(this, UML2Package.eINSTANCE.getBehavior().getEAllOperations().get(86), result);
		}

		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getOwnedMembers() {
		EList result = (EList) getCacheAdapter().get(this, UML2Package.eINSTANCE.getBehavior().getEAllOperations().get(87));

		if (null == result) {
			Set union = new LinkedHashSet();
			union.addAll(super.getOwnedMembers());
			union.addAll(getParameters());

			result = new BasicEList.UnmodifiableEList(union.size(), union.toArray());
			getCacheAdapter().put(this, UML2Package.eINSTANCE.getBehavior().getEAllOperations().get(87), result);
		}

		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getOwnedRules() {
		if (ownedRule == null) {
			ownedRule = new SupersetEObjectContainmentWithInverseEList(Constraint.class, this, UML2Package.BEHAVIOR__OWNED_RULE, new int[] {UML2Package.BEHAVIOR__PRECONDITION, UML2Package.BEHAVIOR__POSTCONDITION}, UML2Package.CONSTRAINT__NAMESPACE);
		}
		return ownedRule;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, Class baseClass, NotificationChain msgs) {
		if (featureID >= 0) {
			switch (eDerivedStructuralFeatureID(featureID, baseClass)) {
				case UML2Package.BEHAVIOR__EANNOTATIONS:
					return ((InternalEList)getEAnnotations()).basicAdd(otherEnd, msgs);
				case UML2Package.BEHAVIOR__TEMPLATE_BINDING:
					return ((InternalEList)getTemplateBindings()).basicAdd(otherEnd, msgs);
				case UML2Package.BEHAVIOR__OWNED_TEMPLATE_SIGNATURE:
					if (ownedTemplateSignature != null)
						msgs = ((InternalEObject)ownedTemplateSignature).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UML2Package.BEHAVIOR__OWNED_TEMPLATE_SIGNATURE, null, msgs);
					return basicSetOwnedTemplateSignature((TemplateSignature)otherEnd, msgs);
				case UML2Package.BEHAVIOR__CLIENT_DEPENDENCY:
					return ((InternalEList)getClientDependencies()).basicAdd(otherEnd, msgs);
				case UML2Package.BEHAVIOR__OWNED_RULE:
					return ((InternalEList)getOwnedRules()).basicAdd(otherEnd, msgs);
				case UML2Package.BEHAVIOR__ELEMENT_IMPORT:
					return ((InternalEList)getElementImports()).basicAdd(otherEnd, msgs);
				case UML2Package.BEHAVIOR__PACKAGE_IMPORT:
					return ((InternalEList)getPackageImports()).basicAdd(otherEnd, msgs);
				case UML2Package.BEHAVIOR__TEMPLATE_PARAMETER:
					if (templateParameter != null)
						msgs = ((InternalEObject)templateParameter).eInverseRemove(this, UML2Package.TEMPLATE_PARAMETER__PARAMETERED_ELEMENT, TemplateParameter.class, msgs);
					return basicSetTemplateParameter((TemplateParameter)otherEnd, msgs);
				case UML2Package.BEHAVIOR__OWNING_PARAMETER:
					if (eContainer != null)
						msgs = eBasicRemoveFromContainer(msgs);
					return eBasicSetContainer(otherEnd, UML2Package.BEHAVIOR__OWNING_PARAMETER, msgs);
				case UML2Package.BEHAVIOR__GENERALIZATION:
					return ((InternalEList)getGeneralizations()).basicAdd(otherEnd, msgs);
				case UML2Package.BEHAVIOR__POWERTYPE_EXTENT:
					return ((InternalEList)getPowertypeExtents()).basicAdd(otherEnd, msgs);
				case UML2Package.BEHAVIOR__SUBSTITUTION:
					return ((InternalEList)getSubstitutions()).basicAdd(otherEnd, msgs);
				case UML2Package.BEHAVIOR__USE_CASE:
					return ((InternalEList)getUseCases()).basicAdd(otherEnd, msgs);
				case UML2Package.BEHAVIOR__OWNED_BEHAVIOR:
					return ((InternalEList)getOwnedBehaviors()).basicAdd(otherEnd, msgs);
				case UML2Package.BEHAVIOR__IMPLEMENTATION:
					return ((InternalEList)getImplementations()).basicAdd(otherEnd, msgs);
				case UML2Package.BEHAVIOR__OWNED_STATE_MACHINE:
					return ((InternalEList)getOwnedStateMachines()).basicAdd(otherEnd, msgs);
				case UML2Package.BEHAVIOR__OWNED_OPERATION:
					return ((InternalEList)getOwnedOperations()).basicAdd(otherEnd, msgs);
				case UML2Package.BEHAVIOR__CONTEXT:
					if (eContainer != null)
						msgs = eBasicRemoveFromContainer(msgs);
					return eBasicSetContainer(otherEnd, UML2Package.BEHAVIOR__CONTEXT, msgs);
				case UML2Package.BEHAVIOR__SPECIFICATION:
					if (specification != null)
						msgs = ((InternalEObject)specification).eInverseRemove(this, UML2Package.BEHAVIORAL_FEATURE__METHOD, BehavioralFeature.class, msgs);
					return basicSetSpecification((BehavioralFeature)otherEnd, msgs);
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
				case UML2Package.BEHAVIOR__EANNOTATIONS:
					return ((InternalEList)getEAnnotations()).basicRemove(otherEnd, msgs);
				case UML2Package.BEHAVIOR__OWNED_COMMENT:
					return ((InternalEList)getOwnedComments()).basicRemove(otherEnd, msgs);
				case UML2Package.BEHAVIOR__TEMPLATE_BINDING:
					return ((InternalEList)getTemplateBindings()).basicRemove(otherEnd, msgs);
				case UML2Package.BEHAVIOR__OWNED_TEMPLATE_SIGNATURE:
					return basicSetOwnedTemplateSignature(null, msgs);
				case UML2Package.BEHAVIOR__CLIENT_DEPENDENCY:
					return ((InternalEList)getClientDependencies()).basicRemove(otherEnd, msgs);
				case UML2Package.BEHAVIOR__NAME_EXPRESSION:
					return basicSetNameExpression(null, msgs);
				case UML2Package.BEHAVIOR__OWNED_RULE:
					return ((InternalEList)getOwnedRules()).basicRemove(otherEnd, msgs);
				case UML2Package.BEHAVIOR__ELEMENT_IMPORT:
					return ((InternalEList)getElementImports()).basicRemove(otherEnd, msgs);
				case UML2Package.BEHAVIOR__PACKAGE_IMPORT:
					return ((InternalEList)getPackageImports()).basicRemove(otherEnd, msgs);
				case UML2Package.BEHAVIOR__TEMPLATE_PARAMETER:
					return basicSetTemplateParameter(null, msgs);
				case UML2Package.BEHAVIOR__OWNING_PARAMETER:
					return eBasicSetContainer(null, UML2Package.BEHAVIOR__OWNING_PARAMETER, msgs);
				case UML2Package.BEHAVIOR__GENERALIZATION:
					return ((InternalEList)getGeneralizations()).basicRemove(otherEnd, msgs);
				case UML2Package.BEHAVIOR__POWERTYPE_EXTENT:
					return ((InternalEList)getPowertypeExtents()).basicRemove(otherEnd, msgs);
				case UML2Package.BEHAVIOR__SUBSTITUTION:
					return ((InternalEList)getSubstitutions()).basicRemove(otherEnd, msgs);
				case UML2Package.BEHAVIOR__OWNED_USE_CASE:
					return ((InternalEList)getOwnedUseCases()).basicRemove(otherEnd, msgs);
				case UML2Package.BEHAVIOR__USE_CASE:
					return ((InternalEList)getUseCases()).basicRemove(otherEnd, msgs);
				case UML2Package.BEHAVIOR__OCCURRENCE:
					return ((InternalEList)getOccurrences()).basicRemove(otherEnd, msgs);
				case UML2Package.BEHAVIOR__OWNED_BEHAVIOR:
					return ((InternalEList)getOwnedBehaviors()).basicRemove(otherEnd, msgs);
				case UML2Package.BEHAVIOR__IMPLEMENTATION:
					return ((InternalEList)getImplementations()).basicRemove(otherEnd, msgs);
				case UML2Package.BEHAVIOR__OWNED_TRIGGER:
					return ((InternalEList)getOwnedTriggers()).basicRemove(otherEnd, msgs);
				case UML2Package.BEHAVIOR__OWNED_STATE_MACHINE:
					return ((InternalEList)getOwnedStateMachines()).basicRemove(otherEnd, msgs);
				case UML2Package.BEHAVIOR__OWNED_ATTRIBUTE:
					return ((InternalEList)getOwnedAttributes()).basicRemove(otherEnd, msgs);
				case UML2Package.BEHAVIOR__OWNED_CONNECTOR:
					return ((InternalEList)getOwnedConnectors()).basicRemove(otherEnd, msgs);
				case UML2Package.BEHAVIOR__OWNED_PORT:
					return ((InternalEList)getOwnedPorts()).basicRemove(otherEnd, msgs);
				case UML2Package.BEHAVIOR__OWNED_OPERATION:
					return ((InternalEList)getOwnedOperations()).basicRemove(otherEnd, msgs);
				case UML2Package.BEHAVIOR__NESTED_CLASSIFIER:
					return ((InternalEList)getNestedClassifiers()).basicRemove(otherEnd, msgs);
				case UML2Package.BEHAVIOR__OWNED_RECEPTION:
					return ((InternalEList)getOwnedReceptions()).basicRemove(otherEnd, msgs);
				case UML2Package.BEHAVIOR__CONTEXT:
					return eBasicSetContainer(null, UML2Package.BEHAVIOR__CONTEXT, msgs);
				case UML2Package.BEHAVIOR__SPECIFICATION:
					return basicSetSpecification(null, msgs);
				case UML2Package.BEHAVIOR__PARAMETER:
					return ((InternalEList)getParameters()).basicRemove(otherEnd, msgs);
				case UML2Package.BEHAVIOR__OWNED_PARAMETER_SET:
					return ((InternalEList)getOwnedParameterSets()).basicRemove(otherEnd, msgs);
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
				case UML2Package.BEHAVIOR__OWNING_PARAMETER:
					return eContainer.eInverseRemove(this, UML2Package.TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT, TemplateParameter.class, msgs);
				case UML2Package.BEHAVIOR__CONTEXT:
					return eContainer.eInverseRemove(this, UML2Package.BEHAVIORED_CLASSIFIER__OWNED_BEHAVIOR, BehavioredClassifier.class, msgs);
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
			case UML2Package.BEHAVIOR__EANNOTATIONS:
				return getEAnnotations();
			case UML2Package.BEHAVIOR__OWNED_ELEMENT:
				return getOwnedElements();
			case UML2Package.BEHAVIOR__OWNER:
				if (resolve) return getOwner();
				return basicGetOwner();
			case UML2Package.BEHAVIOR__OWNED_COMMENT:
				return getOwnedComments();
			case UML2Package.BEHAVIOR__TEMPLATE_BINDING:
				return getTemplateBindings();
			case UML2Package.BEHAVIOR__OWNED_TEMPLATE_SIGNATURE:
				return getOwnedTemplateSignature();
			case UML2Package.BEHAVIOR__NAME:
				return getName();
			case UML2Package.BEHAVIOR__QUALIFIED_NAME:
				return getQualifiedName();
			case UML2Package.BEHAVIOR__VISIBILITY:
				return getVisibility();
			case UML2Package.BEHAVIOR__CLIENT_DEPENDENCY:
				return getClientDependencies();
			case UML2Package.BEHAVIOR__NAME_EXPRESSION:
				return getNameExpression();
			case UML2Package.BEHAVIOR__MEMBER:
				return getMembers();
			case UML2Package.BEHAVIOR__OWNED_RULE:
				return getOwnedRules();
			case UML2Package.BEHAVIOR__IMPORTED_MEMBER:
				return getImportedMembers();
			case UML2Package.BEHAVIOR__ELEMENT_IMPORT:
				return getElementImports();
			case UML2Package.BEHAVIOR__PACKAGE_IMPORT:
				return getPackageImports();
			case UML2Package.BEHAVIOR__TEMPLATE_PARAMETER:
				if (resolve) return getTemplateParameter();
				return basicGetTemplateParameter();
			case UML2Package.BEHAVIOR__OWNING_PARAMETER:
				return getOwningParameter();
			case UML2Package.BEHAVIOR__PACKAGEABLE_ELEMENT_VISIBILITY:
				return getPackageableElement_visibility();
			case UML2Package.BEHAVIOR__PACKAGE:
				if (resolve) return getPackage();
				return basicGetPackage();
			case UML2Package.BEHAVIOR__REDEFINITION_CONTEXT:
				return getRedefinitionContexts();
			case UML2Package.BEHAVIOR__IS_LEAF:
				return isLeaf() ? Boolean.TRUE : Boolean.FALSE;
			case UML2Package.BEHAVIOR__FEATURE:
				return getFeatures();
			case UML2Package.BEHAVIOR__IS_ABSTRACT:
				return isAbstract() ? Boolean.TRUE : Boolean.FALSE;
			case UML2Package.BEHAVIOR__INHERITED_MEMBER:
				return getInheritedMembers();
			case UML2Package.BEHAVIOR__GENERAL:
				return getGenerals();
			case UML2Package.BEHAVIOR__GENERALIZATION:
				return getGeneralizations();
			case UML2Package.BEHAVIOR__ATTRIBUTE:
				return getAttributes();
			case UML2Package.BEHAVIOR__REDEFINED_CLASSIFIER:
				return getRedefinedClassifiers();
			case UML2Package.BEHAVIOR__POWERTYPE_EXTENT:
				return getPowertypeExtents();
			case UML2Package.BEHAVIOR__SUBSTITUTION:
				return getSubstitutions();
			case UML2Package.BEHAVIOR__OWNED_USE_CASE:
				return getOwnedUseCases();
			case UML2Package.BEHAVIOR__USE_CASE:
				return getUseCases();
			case UML2Package.BEHAVIOR__REPRESENTATION:
				return getRepresentation();
			case UML2Package.BEHAVIOR__OCCURRENCE:
				return getOccurrences();
			case UML2Package.BEHAVIOR__OWNED_BEHAVIOR:
				return getOwnedBehaviors();
			case UML2Package.BEHAVIOR__CLASSIFIER_BEHAVIOR:
				return getClassifierBehavior();
			case UML2Package.BEHAVIOR__IMPLEMENTATION:
				return getImplementations();
			case UML2Package.BEHAVIOR__OWNED_TRIGGER:
				return getOwnedTriggers();
			case UML2Package.BEHAVIOR__OWNED_STATE_MACHINE:
				return getOwnedStateMachines();
			case UML2Package.BEHAVIOR__OWNED_ATTRIBUTE:
				return getOwnedAttributes();
			case UML2Package.BEHAVIOR__PART:
				return getParts();
			case UML2Package.BEHAVIOR__ROLE:
				return getRoles();
			case UML2Package.BEHAVIOR__OWNED_CONNECTOR:
				return getOwnedConnectors();
			case UML2Package.BEHAVIOR__OWNED_PORT:
				return getOwnedPorts();
			case UML2Package.BEHAVIOR__OWNED_OPERATION:
				return getOwnedOperations();
			case UML2Package.BEHAVIOR__SUPER_CLASS:
				return getSuperClasses();
			case UML2Package.BEHAVIOR__NESTED_CLASSIFIER:
				return getNestedClassifiers();
			case UML2Package.BEHAVIOR__EXTENSION:
				return getExtensions();
			case UML2Package.BEHAVIOR__IS_ACTIVE:
				return isActive() ? Boolean.TRUE : Boolean.FALSE;
			case UML2Package.BEHAVIOR__OWNED_RECEPTION:
				return getOwnedReceptions();
			case UML2Package.BEHAVIOR__IS_REENTRANT:
				return isReentrant() ? Boolean.TRUE : Boolean.FALSE;
			case UML2Package.BEHAVIOR__CONTEXT:
				return getContext();
			case UML2Package.BEHAVIOR__REDEFINED_BEHAVIOR:
				return getRedefinedBehaviors();
			case UML2Package.BEHAVIOR__SPECIFICATION:
				if (resolve) return getSpecification();
				return basicGetSpecification();
			case UML2Package.BEHAVIOR__PARAMETER:
				return getParameters();
			case UML2Package.BEHAVIOR__FORMAL_PARAMETER:
				return getFormalParameters();
			case UML2Package.BEHAVIOR__RETURN_RESULT:
				return getReturnResults();
			case UML2Package.BEHAVIOR__PRECONDITION:
				return getPreconditions();
			case UML2Package.BEHAVIOR__POSTCONDITION:
				return getPostconditions();
			case UML2Package.BEHAVIOR__OWNED_PARAMETER_SET:
				return getOwnedParameterSets();
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
			case UML2Package.BEHAVIOR__EANNOTATIONS:
				getEAnnotations().clear();
				getEAnnotations().addAll((Collection)newValue);
				return;
			case UML2Package.BEHAVIOR__OWNED_COMMENT:
				getOwnedComments().clear();
				getOwnedComments().addAll((Collection)newValue);
				return;
			case UML2Package.BEHAVIOR__TEMPLATE_BINDING:
				getTemplateBindings().clear();
				getTemplateBindings().addAll((Collection)newValue);
				return;
			case UML2Package.BEHAVIOR__OWNED_TEMPLATE_SIGNATURE:
				setOwnedTemplateSignature((TemplateSignature)newValue);
				return;
			case UML2Package.BEHAVIOR__NAME:
				setName((String)newValue);
				return;
			case UML2Package.BEHAVIOR__VISIBILITY:
				setVisibility((VisibilityKind)newValue);
				return;
			case UML2Package.BEHAVIOR__CLIENT_DEPENDENCY:
				getClientDependencies().clear();
				getClientDependencies().addAll((Collection)newValue);
				return;
			case UML2Package.BEHAVIOR__NAME_EXPRESSION:
				setNameExpression((StringExpression)newValue);
				return;
			case UML2Package.BEHAVIOR__OWNED_RULE:
				getOwnedRules().clear();
				getOwnedRules().addAll((Collection)newValue);
				return;
			case UML2Package.BEHAVIOR__ELEMENT_IMPORT:
				getElementImports().clear();
				getElementImports().addAll((Collection)newValue);
				return;
			case UML2Package.BEHAVIOR__PACKAGE_IMPORT:
				getPackageImports().clear();
				getPackageImports().addAll((Collection)newValue);
				return;
			case UML2Package.BEHAVIOR__TEMPLATE_PARAMETER:
				setTemplateParameter((TemplateParameter)newValue);
				return;
			case UML2Package.BEHAVIOR__OWNING_PARAMETER:
				setOwningParameter((TemplateParameter)newValue);
				return;
			case UML2Package.BEHAVIOR__PACKAGEABLE_ELEMENT_VISIBILITY:
				setPackageableElement_visibility((VisibilityKind)newValue);
				return;
			case UML2Package.BEHAVIOR__IS_LEAF:
				setIsLeaf(((Boolean)newValue).booleanValue());
				return;
			case UML2Package.BEHAVIOR__IS_ABSTRACT:
				setIsAbstract(((Boolean)newValue).booleanValue());
				return;
			case UML2Package.BEHAVIOR__GENERALIZATION:
				getGeneralizations().clear();
				getGeneralizations().addAll((Collection)newValue);
				return;
			case UML2Package.BEHAVIOR__REDEFINED_CLASSIFIER:
				getRedefinedClassifiers().clear();
				getRedefinedClassifiers().addAll((Collection)newValue);
				return;
			case UML2Package.BEHAVIOR__POWERTYPE_EXTENT:
				getPowertypeExtents().clear();
				getPowertypeExtents().addAll((Collection)newValue);
				return;
			case UML2Package.BEHAVIOR__SUBSTITUTION:
				getSubstitutions().clear();
				getSubstitutions().addAll((Collection)newValue);
				return;
			case UML2Package.BEHAVIOR__OWNED_USE_CASE:
				getOwnedUseCases().clear();
				getOwnedUseCases().addAll((Collection)newValue);
				return;
			case UML2Package.BEHAVIOR__USE_CASE:
				getUseCases().clear();
				getUseCases().addAll((Collection)newValue);
				return;
			case UML2Package.BEHAVIOR__REPRESENTATION:
				setRepresentation((CollaborationOccurrence)newValue);
				return;
			case UML2Package.BEHAVIOR__OCCURRENCE:
				getOccurrences().clear();
				getOccurrences().addAll((Collection)newValue);
				return;
			case UML2Package.BEHAVIOR__OWNED_BEHAVIOR:
				getOwnedBehaviors().clear();
				getOwnedBehaviors().addAll((Collection)newValue);
				return;
			case UML2Package.BEHAVIOR__CLASSIFIER_BEHAVIOR:
				setClassifierBehavior((Behavior)newValue);
				return;
			case UML2Package.BEHAVIOR__IMPLEMENTATION:
				getImplementations().clear();
				getImplementations().addAll((Collection)newValue);
				return;
			case UML2Package.BEHAVIOR__OWNED_TRIGGER:
				getOwnedTriggers().clear();
				getOwnedTriggers().addAll((Collection)newValue);
				return;
			case UML2Package.BEHAVIOR__OWNED_STATE_MACHINE:
				getOwnedStateMachines().clear();
				getOwnedStateMachines().addAll((Collection)newValue);
				return;
			case UML2Package.BEHAVIOR__OWNED_ATTRIBUTE:
				getOwnedAttributes().clear();
				getOwnedAttributes().addAll((Collection)newValue);
				return;
			case UML2Package.BEHAVIOR__OWNED_CONNECTOR:
				getOwnedConnectors().clear();
				getOwnedConnectors().addAll((Collection)newValue);
				return;
			case UML2Package.BEHAVIOR__OWNED_PORT:
				getOwnedPorts().clear();
				getOwnedPorts().addAll((Collection)newValue);
				return;
			case UML2Package.BEHAVIOR__OWNED_OPERATION:
				getOwnedOperations().clear();
				getOwnedOperations().addAll((Collection)newValue);
				return;
			case UML2Package.BEHAVIOR__NESTED_CLASSIFIER:
				getNestedClassifiers().clear();
				getNestedClassifiers().addAll((Collection)newValue);
				return;
			case UML2Package.BEHAVIOR__IS_ACTIVE:
				setIsActive(((Boolean)newValue).booleanValue());
				return;
			case UML2Package.BEHAVIOR__OWNED_RECEPTION:
				getOwnedReceptions().clear();
				getOwnedReceptions().addAll((Collection)newValue);
				return;
			case UML2Package.BEHAVIOR__IS_REENTRANT:
				setIsReentrant(((Boolean)newValue).booleanValue());
				return;
			case UML2Package.BEHAVIOR__CONTEXT:
				setContext((BehavioredClassifier)newValue);
				return;
			case UML2Package.BEHAVIOR__REDEFINED_BEHAVIOR:
				getRedefinedBehaviors().clear();
				getRedefinedBehaviors().addAll((Collection)newValue);
				return;
			case UML2Package.BEHAVIOR__SPECIFICATION:
				setSpecification((BehavioralFeature)newValue);
				return;
			case UML2Package.BEHAVIOR__PARAMETER:
				getParameters().clear();
				getParameters().addAll((Collection)newValue);
				return;
			case UML2Package.BEHAVIOR__PRECONDITION:
				getPreconditions().clear();
				getPreconditions().addAll((Collection)newValue);
				return;
			case UML2Package.BEHAVIOR__POSTCONDITION:
				getPostconditions().clear();
				getPostconditions().addAll((Collection)newValue);
				return;
			case UML2Package.BEHAVIOR__OWNED_PARAMETER_SET:
				getOwnedParameterSets().clear();
				getOwnedParameterSets().addAll((Collection)newValue);
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
			case UML2Package.BEHAVIOR__EANNOTATIONS:
				getEAnnotations().clear();
				return;
			case UML2Package.BEHAVIOR__OWNED_COMMENT:
				getOwnedComments().clear();
				return;
			case UML2Package.BEHAVIOR__TEMPLATE_BINDING:
				getTemplateBindings().clear();
				return;
			case UML2Package.BEHAVIOR__OWNED_TEMPLATE_SIGNATURE:
				setOwnedTemplateSignature((TemplateSignature)null);
				return;
			case UML2Package.BEHAVIOR__NAME:
				setName(NAME_EDEFAULT);
				return;
			case UML2Package.BEHAVIOR__VISIBILITY:
				setVisibility(VISIBILITY_EDEFAULT);
				return;
			case UML2Package.BEHAVIOR__CLIENT_DEPENDENCY:
				getClientDependencies().clear();
				return;
			case UML2Package.BEHAVIOR__NAME_EXPRESSION:
				setNameExpression((StringExpression)null);
				return;
			case UML2Package.BEHAVIOR__OWNED_RULE:
				getOwnedRules().clear();
				return;
			case UML2Package.BEHAVIOR__ELEMENT_IMPORT:
				getElementImports().clear();
				return;
			case UML2Package.BEHAVIOR__PACKAGE_IMPORT:
				getPackageImports().clear();
				return;
			case UML2Package.BEHAVIOR__TEMPLATE_PARAMETER:
				setTemplateParameter((TemplateParameter)null);
				return;
			case UML2Package.BEHAVIOR__OWNING_PARAMETER:
				setOwningParameter(null);
				return;
			case UML2Package.BEHAVIOR__PACKAGEABLE_ELEMENT_VISIBILITY:
				setPackageableElement_visibility(PACKAGEABLE_ELEMENT_VISIBILITY_EDEFAULT);
				return;
			case UML2Package.BEHAVIOR__IS_LEAF:
				setIsLeaf(IS_LEAF_EDEFAULT);
				return;
			case UML2Package.BEHAVIOR__IS_ABSTRACT:
				setIsAbstract(false);
				return;
			case UML2Package.BEHAVIOR__GENERALIZATION:
				getGeneralizations().clear();
				return;
			case UML2Package.BEHAVIOR__REDEFINED_CLASSIFIER:
				getRedefinedClassifiers().clear();
				return;
			case UML2Package.BEHAVIOR__POWERTYPE_EXTENT:
				getPowertypeExtents().clear();
				return;
			case UML2Package.BEHAVIOR__SUBSTITUTION:
				getSubstitutions().clear();
				return;
			case UML2Package.BEHAVIOR__OWNED_USE_CASE:
				getOwnedUseCases().clear();
				return;
			case UML2Package.BEHAVIOR__USE_CASE:
				getUseCases().clear();
				return;
			case UML2Package.BEHAVIOR__REPRESENTATION:
				setRepresentation((CollaborationOccurrence)null);
				return;
			case UML2Package.BEHAVIOR__OCCURRENCE:
				getOccurrences().clear();
				return;
			case UML2Package.BEHAVIOR__OWNED_BEHAVIOR:
				getOwnedBehaviors().clear();
				return;
			case UML2Package.BEHAVIOR__CLASSIFIER_BEHAVIOR:
				setClassifierBehavior((Behavior)null);
				return;
			case UML2Package.BEHAVIOR__IMPLEMENTATION:
				getImplementations().clear();
				return;
			case UML2Package.BEHAVIOR__OWNED_TRIGGER:
				getOwnedTriggers().clear();
				return;
			case UML2Package.BEHAVIOR__OWNED_STATE_MACHINE:
				getOwnedStateMachines().clear();
				return;
			case UML2Package.BEHAVIOR__OWNED_ATTRIBUTE:
				getOwnedAttributes().clear();
				return;
			case UML2Package.BEHAVIOR__OWNED_CONNECTOR:
				getOwnedConnectors().clear();
				return;
			case UML2Package.BEHAVIOR__OWNED_PORT:
				getOwnedPorts().clear();
				return;
			case UML2Package.BEHAVIOR__OWNED_OPERATION:
				getOwnedOperations().clear();
				return;
			case UML2Package.BEHAVIOR__NESTED_CLASSIFIER:
				getNestedClassifiers().clear();
				return;
			case UML2Package.BEHAVIOR__IS_ACTIVE:
				setIsActive(IS_ACTIVE_EDEFAULT);
				return;
			case UML2Package.BEHAVIOR__OWNED_RECEPTION:
				getOwnedReceptions().clear();
				return;
			case UML2Package.BEHAVIOR__IS_REENTRANT:
				setIsReentrant(IS_REENTRANT_EDEFAULT);
				return;
			case UML2Package.BEHAVIOR__CONTEXT:
				setContext(null);
				return;
			case UML2Package.BEHAVIOR__REDEFINED_BEHAVIOR:
				getRedefinedBehaviors().clear();
				return;
			case UML2Package.BEHAVIOR__SPECIFICATION:
				setSpecification((BehavioralFeature)null);
				return;
			case UML2Package.BEHAVIOR__PARAMETER:
				getParameters().clear();
				return;
			case UML2Package.BEHAVIOR__PRECONDITION:
				getPreconditions().clear();
				return;
			case UML2Package.BEHAVIOR__POSTCONDITION:
				getPostconditions().clear();
				return;
			case UML2Package.BEHAVIOR__OWNED_PARAMETER_SET:
				getOwnedParameterSets().clear();
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
			case UML2Package.BEHAVIOR__EANNOTATIONS:
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UML2Package.BEHAVIOR__OWNED_ELEMENT:
				return !getOwnedElements().isEmpty();
			case UML2Package.BEHAVIOR__OWNER:
				return basicGetOwner() != null;
			case UML2Package.BEHAVIOR__OWNED_COMMENT:
				return ownedComment != null && !ownedComment.isEmpty();
			case UML2Package.BEHAVIOR__TEMPLATE_BINDING:
				return templateBinding != null && !templateBinding.isEmpty();
			case UML2Package.BEHAVIOR__OWNED_TEMPLATE_SIGNATURE:
				return ownedTemplateSignature != null;
			case UML2Package.BEHAVIOR__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case UML2Package.BEHAVIOR__QUALIFIED_NAME:
				return !"".equals(getQualifiedName()); //$NON-NLS-1$
			case UML2Package.BEHAVIOR__VISIBILITY:
				return getVisibility() != VisibilityKind.PUBLIC_LITERAL;
			case UML2Package.BEHAVIOR__CLIENT_DEPENDENCY:
				return clientDependency != null && !clientDependency.isEmpty();
			case UML2Package.BEHAVIOR__NAME_EXPRESSION:
				return nameExpression != null;
			case UML2Package.BEHAVIOR__MEMBER:
				return !getMembers().isEmpty();
			case UML2Package.BEHAVIOR__OWNED_RULE:
				return ownedRule != null && !ownedRule.isEmpty();
			case UML2Package.BEHAVIOR__IMPORTED_MEMBER:
				return !getImportedMembers().isEmpty();
			case UML2Package.BEHAVIOR__ELEMENT_IMPORT:
				return elementImport != null && !elementImport.isEmpty();
			case UML2Package.BEHAVIOR__PACKAGE_IMPORT:
				return packageImport != null && !packageImport.isEmpty();
			case UML2Package.BEHAVIOR__TEMPLATE_PARAMETER:
				return templateParameter != null;
			case UML2Package.BEHAVIOR__OWNING_PARAMETER:
				return getOwningParameter() != null;
			case UML2Package.BEHAVIOR__PACKAGEABLE_ELEMENT_VISIBILITY:
				return packageableElement_visibility != PACKAGEABLE_ELEMENT_VISIBILITY_EDEFAULT;
			case UML2Package.BEHAVIOR__PACKAGE:
				return basicGetPackage() != null;
			case UML2Package.BEHAVIOR__REDEFINITION_CONTEXT:
				return !getRedefinitionContexts().isEmpty();
			case UML2Package.BEHAVIOR__IS_LEAF:
				return isLeaf != IS_LEAF_EDEFAULT;
			case UML2Package.BEHAVIOR__FEATURE:
				return !getFeatures().isEmpty();
			case UML2Package.BEHAVIOR__IS_ABSTRACT:
				return isAbstract() != false;
			case UML2Package.BEHAVIOR__INHERITED_MEMBER:
				return !getInheritedMembers().isEmpty();
			case UML2Package.BEHAVIOR__GENERAL:
				return !getGenerals().isEmpty();
			case UML2Package.BEHAVIOR__GENERALIZATION:
				return generalization != null && !generalization.isEmpty();
			case UML2Package.BEHAVIOR__ATTRIBUTE:
				return !getAttributes().isEmpty();
			case UML2Package.BEHAVIOR__REDEFINED_CLASSIFIER:
				return redefinedClassifier != null && !redefinedClassifier.isEmpty();
			case UML2Package.BEHAVIOR__POWERTYPE_EXTENT:
				return powertypeExtent != null && !powertypeExtent.isEmpty();
			case UML2Package.BEHAVIOR__SUBSTITUTION:
				return substitution != null && !substitution.isEmpty();
			case UML2Package.BEHAVIOR__OWNED_USE_CASE:
				return ownedUseCase != null && !ownedUseCase.isEmpty();
			case UML2Package.BEHAVIOR__USE_CASE:
				return useCase != null && !useCase.isEmpty();
			case UML2Package.BEHAVIOR__REPRESENTATION:
				return representation != null;
			case UML2Package.BEHAVIOR__OCCURRENCE:
				return occurrence != null && !occurrence.isEmpty();
			case UML2Package.BEHAVIOR__OWNED_BEHAVIOR:
				return ownedBehavior != null && !ownedBehavior.isEmpty();
			case UML2Package.BEHAVIOR__CLASSIFIER_BEHAVIOR:
				return classifierBehavior != null;
			case UML2Package.BEHAVIOR__IMPLEMENTATION:
				return implementation != null && !implementation.isEmpty();
			case UML2Package.BEHAVIOR__OWNED_TRIGGER:
				return ownedTrigger != null && !ownedTrigger.isEmpty();
			case UML2Package.BEHAVIOR__OWNED_STATE_MACHINE:
				return ownedStateMachine != null && !ownedStateMachine.isEmpty();
			case UML2Package.BEHAVIOR__OWNED_ATTRIBUTE:
				return !getOwnedAttributes().isEmpty();
			case UML2Package.BEHAVIOR__PART:
				return !getParts().isEmpty();
			case UML2Package.BEHAVIOR__ROLE:
				return !getRoles().isEmpty();
			case UML2Package.BEHAVIOR__OWNED_CONNECTOR:
				return ownedConnector != null && !ownedConnector.isEmpty();
			case UML2Package.BEHAVIOR__OWNED_PORT:
				return ownedPort != null && !ownedPort.isEmpty();
			case UML2Package.BEHAVIOR__OWNED_OPERATION:
				return ownedOperation != null && !ownedOperation.isEmpty();
			case UML2Package.BEHAVIOR__SUPER_CLASS:
				return !getSuperClasses().isEmpty();
			case UML2Package.BEHAVIOR__NESTED_CLASSIFIER:
				return nestedClassifier != null && !nestedClassifier.isEmpty();
			case UML2Package.BEHAVIOR__EXTENSION:
				return !getExtensions().isEmpty();
			case UML2Package.BEHAVIOR__IS_ACTIVE:
				return isActive != IS_ACTIVE_EDEFAULT;
			case UML2Package.BEHAVIOR__OWNED_RECEPTION:
				return ownedReception != null && !ownedReception.isEmpty();
			case UML2Package.BEHAVIOR__IS_REENTRANT:
				return isReentrant != IS_REENTRANT_EDEFAULT;
			case UML2Package.BEHAVIOR__CONTEXT:
				return getContext() != null;
			case UML2Package.BEHAVIOR__REDEFINED_BEHAVIOR:
				return redefinedBehavior != null && !redefinedBehavior.isEmpty();
			case UML2Package.BEHAVIOR__SPECIFICATION:
				return specification != null;
			case UML2Package.BEHAVIOR__PARAMETER:
				return parameter != null && !parameter.isEmpty();
			case UML2Package.BEHAVIOR__FORMAL_PARAMETER:
				return !getFormalParameters().isEmpty();
			case UML2Package.BEHAVIOR__RETURN_RESULT:
				return !getReturnResults().isEmpty();
			case UML2Package.BEHAVIOR__PRECONDITION:
				return precondition != null && !precondition.isEmpty();
			case UML2Package.BEHAVIOR__POSTCONDITION:
				return postcondition != null && !postcondition.isEmpty();
			case UML2Package.BEHAVIOR__OWNED_PARAMETER_SET:
				return ownedParameterSet != null && !ownedParameterSet.isEmpty();
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
		result.append(" (isReentrant: "); //$NON-NLS-1$
		result.append(isReentrant);
		result.append(')');
		return result.toString();
	}

} //BehaviorImpl
