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
 * $Id: ActivityImpl.java,v 1.8 2004/05/20 03:20:02 khussey Exp $
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
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.uml2.Action;
import org.eclipse.uml2.Activity;
import org.eclipse.uml2.ActivityEdge;
import org.eclipse.uml2.ActivityGroup;
import org.eclipse.uml2.ActivityNode;
import org.eclipse.uml2.Behavior;
import org.eclipse.uml2.BehavioralFeature;
import org.eclipse.uml2.BehavioredClassifier;
import org.eclipse.uml2.CollaborationOccurrence;
import org.eclipse.uml2.StringExpression;
import org.eclipse.uml2.StructuredActivityNode;
import org.eclipse.uml2.TemplateParameter;
import org.eclipse.uml2.TemplateSignature;
import org.eclipse.uml2.UML2Package;
import org.eclipse.uml2.VisibilityKind;
import org.eclipse.uml2.internal.util.SubsetEObjectEList;
import org.eclipse.uml2.internal.util.SupersetEObjectContainmentWithInverseEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Activity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2.impl.ActivityImpl#getBody <em>Body</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.ActivityImpl#getLanguage <em>Language</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.ActivityImpl#getEdges <em>Edge</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.ActivityImpl#getGroups <em>Group</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.ActivityImpl#getNodes <em>Node</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.ActivityImpl#getActions <em>Action</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.ActivityImpl#getStructuredNodes <em>Structured Node</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.ActivityImpl#isSingleExecution <em>Is Single Execution</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.ActivityImpl#isReadOnly <em>Is Read Only</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ActivityImpl extends BehaviorImpl implements Activity {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2003, 2004 IBM Corporation and others."; //$NON-NLS-1$

	/**
	 * The default value of the '{@link #getBody() <em>Body</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBody()
	 * @generated
	 * @ordered
	 */
	protected static final String BODY_EDEFAULT = ""; //$NON-NLS-1$

	/**
	 * The cached value of the '{@link #getBody() <em>Body</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBody()
	 * @generated
	 * @ordered
	 */
	protected String body = BODY_EDEFAULT;

	/**
	 * The default value of the '{@link #getLanguage() <em>Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLanguage()
	 * @generated
	 * @ordered
	 */
	protected static final String LANGUAGE_EDEFAULT = ""; //$NON-NLS-1$

	/**
	 * The cached value of the '{@link #getLanguage() <em>Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLanguage()
	 * @generated
	 * @ordered
	 */
	protected String language = LANGUAGE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getEdges() <em>Edge</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEdges()
	 * @generated
	 * @ordered
	 */
	protected EList edge = null;

	/**
	 * The cached value of the '{@link #getGroups() <em>Group</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroups()
	 * @generated
	 * @ordered
	 */
	protected EList group = null;

	/**
	 * The cached value of the '{@link #getNodes() <em>Node</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNodes()
	 * @generated
	 * @ordered
	 */
	protected EList node = null;

	/**
	 * The cached value of the '{@link #getActions() <em>Action</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActions()
	 * @generated
	 * @ordered
	 */
	protected EList action = null;

	/**
	 * The default value of the '{@link #isSingleExecution() <em>Is Single Execution</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSingleExecution()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_SINGLE_EXECUTION_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isSingleExecution() <em>Is Single Execution</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSingleExecution()
	 * @generated
	 * @ordered
	 */
	protected boolean isSingleExecution = IS_SINGLE_EXECUTION_EDEFAULT;

	/**
	 * The default value of the '{@link #isReadOnly() <em>Is Read Only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isReadOnly()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_READ_ONLY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isReadOnly() <em>Is Read Only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isReadOnly()
	 * @generated
	 * @ordered
	 */
	protected boolean isReadOnly = IS_READ_ONLY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActivityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return UML2Package.eINSTANCE.getActivity();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBody() {
		return body;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBody(String newBody) {
		String oldBody = body;
		body = newBody == null ? BODY_EDEFAULT : newBody;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2Package.ACTIVITY__BODY, oldBody, body));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLanguage() {
		return language;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLanguage(String newLanguage) {
		String oldLanguage = language;
		language = newLanguage == null ? LANGUAGE_EDEFAULT : newLanguage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2Package.ACTIVITY__LANGUAGE, oldLanguage, language));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isReadOnly() {
		return isReadOnly;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsReadOnly(boolean newIsReadOnly) {
		boolean oldIsReadOnly = isReadOnly;
		isReadOnly = newIsReadOnly;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2Package.ACTIVITY__IS_READ_ONLY, oldIsReadOnly, isReadOnly));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSingleExecution() {
		return isSingleExecution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsSingleExecution(boolean newIsSingleExecution) {
		boolean oldIsSingleExecution = isSingleExecution;
		isSingleExecution = newIsSingleExecution;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2Package.ACTIVITY__IS_SINGLE_EXECUTION, oldIsSingleExecution, isSingleExecution));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getEdges() {
		if (edge == null) {
			edge = new EObjectContainmentWithInverseEList(ActivityEdge.class, this, UML2Package.ACTIVITY__EDGE, UML2Package.ACTIVITY_EDGE__ACTIVITY);
		}
		return edge;
	}

    /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
     */
    public ActivityEdge getEdge(String unqualifiedName) {
    	for (Iterator i = getEdges().iterator(); i.hasNext(); ) {
    		ActivityEdge namedEdge = (ActivityEdge) i.next();
    		
    		if (unqualifiedName.equals(namedEdge.getName())) {
    			return namedEdge;
    		}
    	}
    	
    	return null;
    }
      
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityEdge createEdge(EClass eClass) {
		ActivityEdge newEdge = (ActivityEdge) eClass.getEPackage().getEFactoryInstance().create(eClass);
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, 0, UML2Package.ACTIVITY__EDGE, null, newEdge));
		}
		getEdges().add(newEdge);
		return newEdge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getGroups() {
		if (null == group) {
			group = new EObjectContainmentWithInverseEList(ActivityGroup.class, this, UML2Package.ACTIVITY__GROUP, UML2Package.ACTIVITY_GROUP__ACTIVITY_GROUP_ACTIVITY);
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityGroup createGroup(EClass eClass) {
		ActivityGroup newGroup = (ActivityGroup) eClass.getEPackage().getEFactoryInstance().create(eClass);
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, 0, UML2Package.ACTIVITY__GROUP, null, newGroup));
		}
		getGroups().add(newGroup);
		return newGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getNodes() {
		if (node == null) {
			node = new SupersetEObjectContainmentWithInverseEList(ActivityNode.class, this, UML2Package.ACTIVITY__NODE, new int[] {UML2Package.ACTIVITY__ACTION}, UML2Package.ACTIVITY_NODE__ACTIVITY);
		}
		return node;

	}

    /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
     */
    public ActivityNode getNode(String unqualifiedName) {
    	for (Iterator i = getNodes().iterator(); i.hasNext(); ) {
    		ActivityNode namedNode = (ActivityNode) i.next();
    		
    		if (unqualifiedName.equals(namedNode.getName())) {
    			return namedNode;
    		}
    	}
    	
    	return null;
    }
      
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityNode createNode(EClass eClass) {
		ActivityNode newNode = (ActivityNode) eClass.getEPackage().getEFactoryInstance().create(eClass);
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, 0, UML2Package.ACTIVITY__NODE, null, newNode));
		}
		getNodes().add(newNode);
		return newNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getActions() {
		if (action == null) {
			action = new SubsetEObjectEList(Action.class, this, UML2Package.ACTIVITY__ACTION, new int[] {UML2Package.ACTIVITY__NODE});
		}
		return action;

	}

    /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
     */
    public Action getAction(String unqualifiedName) {
    	for (Iterator i = getActions().iterator(); i.hasNext(); ) {
    		Action namedAction = (Action) i.next();
    		
    		if (unqualifiedName.equals(namedAction.getName())) {
    			return namedAction;
    		}
    	}
    	
    	return null;
    }
      
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList getStructuredNodes() {

	    if (!getCacheAdapter().containsKey(this, UML2Package.eINSTANCE.getActivity_StructuredNode())) {
	        Set structuredNode = new HashSet();
	        
	        for (Iterator nodes = getNodes().iterator(); nodes.hasNext();) {
	            ActivityNode node = (ActivityNode) nodes.next();
	            
	            if (StructuredActivityNode.class.isInstance(node)) {
	                structuredNode.add(node);
	            }
	        }
	        
	        for (Iterator groups = getGroups().iterator(); groups.hasNext();) {
	            ActivityGroup group = (ActivityGroup) groups.next();
	            
	            if (StructuredActivityNode.class.isInstance(group)) {
	                structuredNode.add(group);
	            }
	        }
	        
	        getCacheAdapter()
	        .put(
	                this,
	                UML2Package.eINSTANCE.getActivity_StructuredNode(),
	                new EcoreEList.UnmodifiableEList(this, UML2Package.eINSTANCE.getActivity_StructuredNode(), structuredNode.size(), structuredNode
	                        .toArray()));
	    }
	    
	    return (EList) getCacheAdapter().get(this, UML2Package.eINSTANCE.getActivity_StructuredNode());
	}

    /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
     */
    public StructuredActivityNode getStructuredNode(String unqualifiedName) {
    	for (Iterator i = getStructuredNodes().iterator(); i.hasNext(); ) {
    		StructuredActivityNode namedStructuredNode = (StructuredActivityNode) i.next();
    		
    		if (unqualifiedName.equals(namedStructuredNode.getName())) {
    			return namedStructuredNode;
    		}
    	}
    	
    	return null;
    }
      
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getOwnedElements() {
		if (!getCacheAdapter().containsKey(this, UML2Package.eINSTANCE.getElement_OwnedElement())) {
			Set union = new LinkedHashSet();
			union.addAll(super.getOwnedElements());
			union.addAll(getEdges());
			union.addAll(getGroups());
			union.addAll(getNodes());
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
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, Class baseClass, NotificationChain msgs) {
		if (featureID >= 0) {
			switch (eDerivedStructuralFeatureID(featureID, baseClass)) {
				case UML2Package.ACTIVITY__EANNOTATIONS:
					return ((InternalEList)getEAnnotations()).basicAdd(otherEnd, msgs);
				case UML2Package.ACTIVITY__TEMPLATE_BINDING:
					return ((InternalEList)getTemplateBindings()).basicAdd(otherEnd, msgs);
				case UML2Package.ACTIVITY__OWNED_TEMPLATE_SIGNATURE:
					if (ownedTemplateSignature != null)
						msgs = ((InternalEObject)ownedTemplateSignature).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UML2Package.ACTIVITY__OWNED_TEMPLATE_SIGNATURE, null, msgs);
					return basicSetOwnedTemplateSignature((TemplateSignature)otherEnd, msgs);
				case UML2Package.ACTIVITY__CLIENT_DEPENDENCY:
					return ((InternalEList)getClientDependencies()).basicAdd(otherEnd, msgs);
				case UML2Package.ACTIVITY__OWNED_RULE:
					return ((InternalEList)getOwnedRules()).basicAdd(otherEnd, msgs);
				case UML2Package.ACTIVITY__ELEMENT_IMPORT:
					return ((InternalEList)getElementImports()).basicAdd(otherEnd, msgs);
				case UML2Package.ACTIVITY__PACKAGE_IMPORT:
					return ((InternalEList)getPackageImports()).basicAdd(otherEnd, msgs);
				case UML2Package.ACTIVITY__TEMPLATE_PARAMETER:
					if (templateParameter != null)
						msgs = ((InternalEObject)templateParameter).eInverseRemove(this, UML2Package.TEMPLATE_PARAMETER__PARAMETERED_ELEMENT, TemplateParameter.class, msgs);
					return basicSetTemplateParameter((TemplateParameter)otherEnd, msgs);
				case UML2Package.ACTIVITY__OWNING_PARAMETER:
					if (eContainer != null)
						msgs = eBasicRemoveFromContainer(msgs);
					return eBasicSetContainer(otherEnd, UML2Package.ACTIVITY__OWNING_PARAMETER, msgs);
				case UML2Package.ACTIVITY__GENERALIZATION:
					return ((InternalEList)getGeneralizations()).basicAdd(otherEnd, msgs);
				case UML2Package.ACTIVITY__SUBSTITUTION:
					return ((InternalEList)getSubstitutions()).basicAdd(otherEnd, msgs);
				case UML2Package.ACTIVITY__POWERTYPE_EXTENT:
					return ((InternalEList)getPowertypeExtents()).basicAdd(otherEnd, msgs);
				case UML2Package.ACTIVITY__USE_CASE:
					return ((InternalEList)getUseCases()).basicAdd(otherEnd, msgs);
				case UML2Package.ACTIVITY__OWNED_BEHAVIOR:
					return ((InternalEList)getOwnedBehaviors()).basicAdd(otherEnd, msgs);
				case UML2Package.ACTIVITY__IMPLEMENTATION:
					return ((InternalEList)getImplementations()).basicAdd(otherEnd, msgs);
				case UML2Package.ACTIVITY__OWNED_STATE_MACHINE:
					return ((InternalEList)getOwnedStateMachines()).basicAdd(otherEnd, msgs);
				case UML2Package.ACTIVITY__OWNED_OPERATION:
					return ((InternalEList)getOwnedOperations()).basicAdd(otherEnd, msgs);
				case UML2Package.ACTIVITY__CONTEXT:
					if (eContainer != null)
						msgs = eBasicRemoveFromContainer(msgs);
					return eBasicSetContainer(otherEnd, UML2Package.ACTIVITY__CONTEXT, msgs);
				case UML2Package.ACTIVITY__SPECIFICATION:
					if (specification != null)
						msgs = ((InternalEObject)specification).eInverseRemove(this, UML2Package.BEHAVIORAL_FEATURE__METHOD, BehavioralFeature.class, msgs);
					return basicSetSpecification((BehavioralFeature)otherEnd, msgs);
				case UML2Package.ACTIVITY__EDGE:
					return ((InternalEList)getEdges()).basicAdd(otherEnd, msgs);
				case UML2Package.ACTIVITY__GROUP:
					return ((InternalEList)getGroups()).basicAdd(otherEnd, msgs);
				case UML2Package.ACTIVITY__NODE:
					return ((InternalEList)getNodes()).basicAdd(otherEnd, msgs);
				default:
					return eDynamicInverseAdd(otherEnd, featureID, baseClass, msgs);
			}
		}
		if (eContainer != null)
			msgs = eBasicRemoveFromContainer(msgs);
		return eBasicSetContainer(otherEnd, featureID, msgs);
	}

	/**
	 * @see org.eclipse.emf.ecore.impl.EObjectImpl#eDynamicInverseAdd(org.eclipse.emf.ecore.InternalEObject, int, java.lang.Class, org.eclipse.emf.common.notify.NotificationChain)
	 */
	public NotificationChain eDynamicInverseAdd(InternalEObject otherEnd, int featureID, Class inverseClass, NotificationChain msgs) {
		switch (eDerivedStructuralFeatureID(featureID, inverseClass)) {
			case UML2Package.ACTIVITY__STRUCTURED_NODE :
				return ((InternalEList) getStructuredNodes()).basicAdd(otherEnd, msgs);
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
				case UML2Package.ACTIVITY__EANNOTATIONS:
					return ((InternalEList)getEAnnotations()).basicRemove(otherEnd, msgs);
				case UML2Package.ACTIVITY__OWNED_COMMENT:
					return ((InternalEList)getOwnedComments()).basicRemove(otherEnd, msgs);
				case UML2Package.ACTIVITY__TEMPLATE_BINDING:
					return ((InternalEList)getTemplateBindings()).basicRemove(otherEnd, msgs);
				case UML2Package.ACTIVITY__OWNED_TEMPLATE_SIGNATURE:
					return basicSetOwnedTemplateSignature(null, msgs);
				case UML2Package.ACTIVITY__CLIENT_DEPENDENCY:
					return ((InternalEList)getClientDependencies()).basicRemove(otherEnd, msgs);
				case UML2Package.ACTIVITY__NAME_EXPRESSION:
					return basicSetNameExpression(null, msgs);
				case UML2Package.ACTIVITY__OWNED_RULE:
					return ((InternalEList)getOwnedRules()).basicRemove(otherEnd, msgs);
				case UML2Package.ACTIVITY__ELEMENT_IMPORT:
					return ((InternalEList)getElementImports()).basicRemove(otherEnd, msgs);
				case UML2Package.ACTIVITY__PACKAGE_IMPORT:
					return ((InternalEList)getPackageImports()).basicRemove(otherEnd, msgs);
				case UML2Package.ACTIVITY__TEMPLATE_PARAMETER:
					return basicSetTemplateParameter(null, msgs);
				case UML2Package.ACTIVITY__OWNING_PARAMETER:
					return eBasicSetContainer(null, UML2Package.ACTIVITY__OWNING_PARAMETER, msgs);
				case UML2Package.ACTIVITY__GENERALIZATION:
					return ((InternalEList)getGeneralizations()).basicRemove(otherEnd, msgs);
				case UML2Package.ACTIVITY__SUBSTITUTION:
					return ((InternalEList)getSubstitutions()).basicRemove(otherEnd, msgs);
				case UML2Package.ACTIVITY__POWERTYPE_EXTENT:
					return ((InternalEList)getPowertypeExtents()).basicRemove(otherEnd, msgs);
				case UML2Package.ACTIVITY__OWNED_USE_CASE:
					return ((InternalEList)getOwnedUseCases()).basicRemove(otherEnd, msgs);
				case UML2Package.ACTIVITY__USE_CASE:
					return ((InternalEList)getUseCases()).basicRemove(otherEnd, msgs);
				case UML2Package.ACTIVITY__OCCURRENCE:
					return ((InternalEList)getOccurrences()).basicRemove(otherEnd, msgs);
				case UML2Package.ACTIVITY__OWNED_BEHAVIOR:
					return ((InternalEList)getOwnedBehaviors()).basicRemove(otherEnd, msgs);
				case UML2Package.ACTIVITY__IMPLEMENTATION:
					return ((InternalEList)getImplementations()).basicRemove(otherEnd, msgs);
				case UML2Package.ACTIVITY__OWNED_TRIGGER:
					return ((InternalEList)getOwnedTriggers()).basicRemove(otherEnd, msgs);
				case UML2Package.ACTIVITY__OWNED_STATE_MACHINE:
					return ((InternalEList)getOwnedStateMachines()).basicRemove(otherEnd, msgs);
				case UML2Package.ACTIVITY__OWNED_ATTRIBUTE:
					return ((InternalEList)getOwnedAttributes()).basicRemove(otherEnd, msgs);
				case UML2Package.ACTIVITY__OWNED_CONNECTOR:
					return ((InternalEList)getOwnedConnectors()).basicRemove(otherEnd, msgs);
				case UML2Package.ACTIVITY__OWNED_PORT:
					return ((InternalEList)getOwnedPorts()).basicRemove(otherEnd, msgs);
				case UML2Package.ACTIVITY__OWNED_OPERATION:
					return ((InternalEList)getOwnedOperations()).basicRemove(otherEnd, msgs);
				case UML2Package.ACTIVITY__NESTED_CLASSIFIER:
					return ((InternalEList)getNestedClassifiers()).basicRemove(otherEnd, msgs);
				case UML2Package.ACTIVITY__OWNED_RECEPTION:
					return ((InternalEList)getOwnedReceptions()).basicRemove(otherEnd, msgs);
				case UML2Package.ACTIVITY__CONTEXT:
					return eBasicSetContainer(null, UML2Package.ACTIVITY__CONTEXT, msgs);
				case UML2Package.ACTIVITY__SPECIFICATION:
					return basicSetSpecification(null, msgs);
				case UML2Package.ACTIVITY__PARAMETER:
					return ((InternalEList)getParameters()).basicRemove(otherEnd, msgs);
				case UML2Package.ACTIVITY__OWNED_PARAMETER_SET:
					return ((InternalEList)getOwnedParameterSets()).basicRemove(otherEnd, msgs);
				case UML2Package.ACTIVITY__EDGE:
					return ((InternalEList)getEdges()).basicRemove(otherEnd, msgs);
				case UML2Package.ACTIVITY__GROUP:
					return ((InternalEList)getGroups()).basicRemove(otherEnd, msgs);
				case UML2Package.ACTIVITY__NODE:
					return ((InternalEList)getNodes()).basicRemove(otherEnd, msgs);
				default:
					return eDynamicInverseRemove(otherEnd, featureID, baseClass, msgs);
			}
		}
		return eBasicSetContainer(null, featureID, msgs);
	}

	/**
	 * @see org.eclipse.emf.ecore.impl.EObjectImpl#eDynamicInverseRemove(org.eclipse.emf.ecore.InternalEObject, int, java.lang.Class, org.eclipse.emf.common.notify.NotificationChain)
	 */
	public NotificationChain eDynamicInverseRemove(InternalEObject otherEnd, int featureID, Class inverseClass, NotificationChain msgs) {
		switch (eDerivedStructuralFeatureID(featureID, inverseClass)) {
			case UML2Package.ACTIVITY__STRUCTURED_NODE :
				return ((InternalEList) getStructuredNodes()).basicRemove(otherEnd, msgs);
			default :
				return super.eDynamicInverseRemove(otherEnd, featureID, inverseClass, msgs);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eBasicRemoveFromContainer(NotificationChain msgs) {
		if (eContainerFeatureID >= 0) {
			switch (eContainerFeatureID) {
				case UML2Package.ACTIVITY__OWNING_PARAMETER:
					return eContainer.eInverseRemove(this, UML2Package.TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT, TemplateParameter.class, msgs);
				case UML2Package.ACTIVITY__CONTEXT:
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
			case UML2Package.ACTIVITY__EANNOTATIONS:
				return getEAnnotations();
			case UML2Package.ACTIVITY__OWNED_ELEMENT:
				return getOwnedElements();
			case UML2Package.ACTIVITY__OWNER:
				if (resolve) return getOwner();
				return basicGetOwner();
			case UML2Package.ACTIVITY__OWNED_COMMENT:
				return getOwnedComments();
			case UML2Package.ACTIVITY__TEMPLATE_BINDING:
				return getTemplateBindings();
			case UML2Package.ACTIVITY__OWNED_TEMPLATE_SIGNATURE:
				return getOwnedTemplateSignature();
			case UML2Package.ACTIVITY__NAME:
				return getName();
			case UML2Package.ACTIVITY__QUALIFIED_NAME:
				return getQualifiedName();
			case UML2Package.ACTIVITY__VISIBILITY:
				return getVisibility();
			case UML2Package.ACTIVITY__CLIENT_DEPENDENCY:
				return getClientDependencies();
			case UML2Package.ACTIVITY__NAME_EXPRESSION:
				return getNameExpression();
			case UML2Package.ACTIVITY__MEMBER:
				return getMembers();
			case UML2Package.ACTIVITY__OWNED_RULE:
				return getOwnedRules();
			case UML2Package.ACTIVITY__IMPORTED_MEMBER:
				return getImportedMembers();
			case UML2Package.ACTIVITY__ELEMENT_IMPORT:
				return getElementImports();
			case UML2Package.ACTIVITY__PACKAGE_IMPORT:
				return getPackageImports();
			case UML2Package.ACTIVITY__TEMPLATE_PARAMETER:
				if (resolve) return getTemplateParameter();
				return basicGetTemplateParameter();
			case UML2Package.ACTIVITY__OWNING_PARAMETER:
				return getOwningParameter();
			case UML2Package.ACTIVITY__PACKAGEABLE_ELEMENT_VISIBILITY:
				return getPackageableElement_visibility();
			case UML2Package.ACTIVITY__PACKAGE:
				if (resolve) return getPackage();
				return basicGetPackage();
			case UML2Package.ACTIVITY__REDEFINITION_CONTEXT:
				return getRedefinitionContexts();
			case UML2Package.ACTIVITY__IS_LEAF:
				return isLeaf() ? Boolean.TRUE : Boolean.FALSE;
			case UML2Package.ACTIVITY__FEATURE:
				return getFeatures();
			case UML2Package.ACTIVITY__IS_ABSTRACT:
				return isAbstract() ? Boolean.TRUE : Boolean.FALSE;
			case UML2Package.ACTIVITY__INHERITED_MEMBER:
				return getInheritedMembers();
			case UML2Package.ACTIVITY__GENERAL:
				return getGenerals();
			case UML2Package.ACTIVITY__GENERALIZATION:
				return getGeneralizations();
			case UML2Package.ACTIVITY__ATTRIBUTE:
				return getAttributes();
			case UML2Package.ACTIVITY__REDEFINED_CLASSIFIER:
				return getRedefinedClassifiers();
			case UML2Package.ACTIVITY__SUBSTITUTION:
				return getSubstitutions();
			case UML2Package.ACTIVITY__POWERTYPE_EXTENT:
				return getPowertypeExtents();
			case UML2Package.ACTIVITY__OWNED_USE_CASE:
				return getOwnedUseCases();
			case UML2Package.ACTIVITY__USE_CASE:
				return getUseCases();
			case UML2Package.ACTIVITY__REPRESENTATION:
				return getRepresentation();
			case UML2Package.ACTIVITY__OCCURRENCE:
				return getOccurrences();
			case UML2Package.ACTIVITY__OWNED_BEHAVIOR:
				return getOwnedBehaviors();
			case UML2Package.ACTIVITY__CLASSIFIER_BEHAVIOR:
				return getClassifierBehavior();
			case UML2Package.ACTIVITY__IMPLEMENTATION:
				return getImplementations();
			case UML2Package.ACTIVITY__OWNED_TRIGGER:
				return getOwnedTriggers();
			case UML2Package.ACTIVITY__OWNED_STATE_MACHINE:
				return getOwnedStateMachines();
			case UML2Package.ACTIVITY__OWNED_ATTRIBUTE:
				return getOwnedAttributes();
			case UML2Package.ACTIVITY__PART:
				return getParts();
			case UML2Package.ACTIVITY__ROLE:
				return getRoles();
			case UML2Package.ACTIVITY__OWNED_CONNECTOR:
				return getOwnedConnectors();
			case UML2Package.ACTIVITY__OWNED_PORT:
				return getOwnedPorts();
			case UML2Package.ACTIVITY__OWNED_OPERATION:
				return getOwnedOperations();
			case UML2Package.ACTIVITY__SUPER_CLASS:
				return getSuperClasses();
			case UML2Package.ACTIVITY__EXTENSION:
				return getExtensions();
			case UML2Package.ACTIVITY__NESTED_CLASSIFIER:
				return getNestedClassifiers();
			case UML2Package.ACTIVITY__IS_ACTIVE:
				return isActive() ? Boolean.TRUE : Boolean.FALSE;
			case UML2Package.ACTIVITY__OWNED_RECEPTION:
				return getOwnedReceptions();
			case UML2Package.ACTIVITY__IS_REENTRANT:
				return isReentrant() ? Boolean.TRUE : Boolean.FALSE;
			case UML2Package.ACTIVITY__CONTEXT:
				return getContext();
			case UML2Package.ACTIVITY__REDEFINED_BEHAVIOR:
				return getRedefinedBehaviors();
			case UML2Package.ACTIVITY__SPECIFICATION:
				if (resolve) return getSpecification();
				return basicGetSpecification();
			case UML2Package.ACTIVITY__PARAMETER:
				return getParameters();
			case UML2Package.ACTIVITY__FORMAL_PARAMETER:
				return getFormalParameters();
			case UML2Package.ACTIVITY__RETURN_RESULT:
				return getReturnResults();
			case UML2Package.ACTIVITY__PRECONDITION:
				return getPreconditions();
			case UML2Package.ACTIVITY__POSTCONDITION:
				return getPostconditions();
			case UML2Package.ACTIVITY__OWNED_PARAMETER_SET:
				return getOwnedParameterSets();
			case UML2Package.ACTIVITY__BODY:
				return getBody();
			case UML2Package.ACTIVITY__LANGUAGE:
				return getLanguage();
			case UML2Package.ACTIVITY__EDGE:
				return getEdges();
			case UML2Package.ACTIVITY__GROUP:
				return getGroups();
			case UML2Package.ACTIVITY__NODE:
				return getNodes();
			case UML2Package.ACTIVITY__ACTION:
				return getActions();
			case UML2Package.ACTIVITY__STRUCTURED_NODE:
				return getStructuredNodes();
			case UML2Package.ACTIVITY__IS_SINGLE_EXECUTION:
				return isSingleExecution() ? Boolean.TRUE : Boolean.FALSE;
			case UML2Package.ACTIVITY__IS_READ_ONLY:
				return isReadOnly() ? Boolean.TRUE : Boolean.FALSE;
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
			case UML2Package.ACTIVITY__EANNOTATIONS:
				getEAnnotations().clear();
				getEAnnotations().addAll((Collection)newValue);
				return;
			case UML2Package.ACTIVITY__OWNED_COMMENT:
				getOwnedComments().clear();
				getOwnedComments().addAll((Collection)newValue);
				return;
			case UML2Package.ACTIVITY__TEMPLATE_BINDING:
				getTemplateBindings().clear();
				getTemplateBindings().addAll((Collection)newValue);
				return;
			case UML2Package.ACTIVITY__OWNED_TEMPLATE_SIGNATURE:
				setOwnedTemplateSignature((TemplateSignature)newValue);
				return;
			case UML2Package.ACTIVITY__NAME:
				setName((String)newValue);
				return;
			case UML2Package.ACTIVITY__VISIBILITY:
				setVisibility((VisibilityKind)newValue);
				return;
			case UML2Package.ACTIVITY__CLIENT_DEPENDENCY:
				getClientDependencies().clear();
				getClientDependencies().addAll((Collection)newValue);
				return;
			case UML2Package.ACTIVITY__NAME_EXPRESSION:
				setNameExpression((StringExpression)newValue);
				return;
			case UML2Package.ACTIVITY__OWNED_RULE:
				getOwnedRules().clear();
				getOwnedRules().addAll((Collection)newValue);
				return;
			case UML2Package.ACTIVITY__ELEMENT_IMPORT:
				getElementImports().clear();
				getElementImports().addAll((Collection)newValue);
				return;
			case UML2Package.ACTIVITY__PACKAGE_IMPORT:
				getPackageImports().clear();
				getPackageImports().addAll((Collection)newValue);
				return;
			case UML2Package.ACTIVITY__TEMPLATE_PARAMETER:
				setTemplateParameter((TemplateParameter)newValue);
				return;
			case UML2Package.ACTIVITY__OWNING_PARAMETER:
				setOwningParameter((TemplateParameter)newValue);
				return;
			case UML2Package.ACTIVITY__PACKAGEABLE_ELEMENT_VISIBILITY:
				setPackageableElement_visibility((VisibilityKind)newValue);
				return;
			case UML2Package.ACTIVITY__IS_LEAF:
				setIsLeaf(((Boolean)newValue).booleanValue());
				return;
			case UML2Package.ACTIVITY__IS_ABSTRACT:
				setIsAbstract(((Boolean)newValue).booleanValue());
				return;
			case UML2Package.ACTIVITY__GENERALIZATION:
				getGeneralizations().clear();
				getGeneralizations().addAll((Collection)newValue);
				return;
			case UML2Package.ACTIVITY__REDEFINED_CLASSIFIER:
				getRedefinedClassifiers().clear();
				getRedefinedClassifiers().addAll((Collection)newValue);
				return;
			case UML2Package.ACTIVITY__SUBSTITUTION:
				getSubstitutions().clear();
				getSubstitutions().addAll((Collection)newValue);
				return;
			case UML2Package.ACTIVITY__POWERTYPE_EXTENT:
				getPowertypeExtents().clear();
				getPowertypeExtents().addAll((Collection)newValue);
				return;
			case UML2Package.ACTIVITY__OWNED_USE_CASE:
				getOwnedUseCases().clear();
				getOwnedUseCases().addAll((Collection)newValue);
				return;
			case UML2Package.ACTIVITY__USE_CASE:
				getUseCases().clear();
				getUseCases().addAll((Collection)newValue);
				return;
			case UML2Package.ACTIVITY__REPRESENTATION:
				setRepresentation((CollaborationOccurrence)newValue);
				return;
			case UML2Package.ACTIVITY__OCCURRENCE:
				getOccurrences().clear();
				getOccurrences().addAll((Collection)newValue);
				return;
			case UML2Package.ACTIVITY__OWNED_BEHAVIOR:
				getOwnedBehaviors().clear();
				getOwnedBehaviors().addAll((Collection)newValue);
				return;
			case UML2Package.ACTIVITY__CLASSIFIER_BEHAVIOR:
				setClassifierBehavior((Behavior)newValue);
				return;
			case UML2Package.ACTIVITY__IMPLEMENTATION:
				getImplementations().clear();
				getImplementations().addAll((Collection)newValue);
				return;
			case UML2Package.ACTIVITY__OWNED_TRIGGER:
				getOwnedTriggers().clear();
				getOwnedTriggers().addAll((Collection)newValue);
				return;
			case UML2Package.ACTIVITY__OWNED_STATE_MACHINE:
				getOwnedStateMachines().clear();
				getOwnedStateMachines().addAll((Collection)newValue);
				return;
			case UML2Package.ACTIVITY__OWNED_ATTRIBUTE:
				getOwnedAttributes().clear();
				getOwnedAttributes().addAll((Collection)newValue);
				return;
			case UML2Package.ACTIVITY__OWNED_CONNECTOR:
				getOwnedConnectors().clear();
				getOwnedConnectors().addAll((Collection)newValue);
				return;
			case UML2Package.ACTIVITY__OWNED_PORT:
				getOwnedPorts().clear();
				getOwnedPorts().addAll((Collection)newValue);
				return;
			case UML2Package.ACTIVITY__OWNED_OPERATION:
				getOwnedOperations().clear();
				getOwnedOperations().addAll((Collection)newValue);
				return;
			case UML2Package.ACTIVITY__NESTED_CLASSIFIER:
				getNestedClassifiers().clear();
				getNestedClassifiers().addAll((Collection)newValue);
				return;
			case UML2Package.ACTIVITY__IS_ACTIVE:
				setIsActive(((Boolean)newValue).booleanValue());
				return;
			case UML2Package.ACTIVITY__OWNED_RECEPTION:
				getOwnedReceptions().clear();
				getOwnedReceptions().addAll((Collection)newValue);
				return;
			case UML2Package.ACTIVITY__IS_REENTRANT:
				setIsReentrant(((Boolean)newValue).booleanValue());
				return;
			case UML2Package.ACTIVITY__CONTEXT:
				setContext((BehavioredClassifier)newValue);
				return;
			case UML2Package.ACTIVITY__REDEFINED_BEHAVIOR:
				getRedefinedBehaviors().clear();
				getRedefinedBehaviors().addAll((Collection)newValue);
				return;
			case UML2Package.ACTIVITY__SPECIFICATION:
				setSpecification((BehavioralFeature)newValue);
				return;
			case UML2Package.ACTIVITY__PARAMETER:
				getParameters().clear();
				getParameters().addAll((Collection)newValue);
				return;
			case UML2Package.ACTIVITY__PRECONDITION:
				getPreconditions().clear();
				getPreconditions().addAll((Collection)newValue);
				return;
			case UML2Package.ACTIVITY__POSTCONDITION:
				getPostconditions().clear();
				getPostconditions().addAll((Collection)newValue);
				return;
			case UML2Package.ACTIVITY__OWNED_PARAMETER_SET:
				getOwnedParameterSets().clear();
				getOwnedParameterSets().addAll((Collection)newValue);
				return;
			case UML2Package.ACTIVITY__BODY:
				setBody((String)newValue);
				return;
			case UML2Package.ACTIVITY__LANGUAGE:
				setLanguage((String)newValue);
				return;
			case UML2Package.ACTIVITY__EDGE:
				getEdges().clear();
				getEdges().addAll((Collection)newValue);
				return;
			case UML2Package.ACTIVITY__GROUP:
				getGroups().clear();
				getGroups().addAll((Collection)newValue);
				return;
			case UML2Package.ACTIVITY__NODE:
				getNodes().clear();
				getNodes().addAll((Collection)newValue);
				return;
			case UML2Package.ACTIVITY__ACTION:
				getActions().clear();
				getActions().addAll((Collection)newValue);
				return;
			case UML2Package.ACTIVITY__IS_SINGLE_EXECUTION:
				setIsSingleExecution(((Boolean)newValue).booleanValue());
				return;
			case UML2Package.ACTIVITY__IS_READ_ONLY:
				setIsReadOnly(((Boolean)newValue).booleanValue());
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
			case UML2Package.ACTIVITY__EANNOTATIONS:
				getEAnnotations().clear();
				return;
			case UML2Package.ACTIVITY__OWNED_COMMENT:
				getOwnedComments().clear();
				return;
			case UML2Package.ACTIVITY__TEMPLATE_BINDING:
				getTemplateBindings().clear();
				return;
			case UML2Package.ACTIVITY__OWNED_TEMPLATE_SIGNATURE:
				setOwnedTemplateSignature((TemplateSignature)null);
				return;
			case UML2Package.ACTIVITY__NAME:
				setName(NAME_EDEFAULT);
				return;
			case UML2Package.ACTIVITY__VISIBILITY:
				setVisibility(VISIBILITY_EDEFAULT);
				return;
			case UML2Package.ACTIVITY__CLIENT_DEPENDENCY:
				getClientDependencies().clear();
				return;
			case UML2Package.ACTIVITY__NAME_EXPRESSION:
				setNameExpression((StringExpression)null);
				return;
			case UML2Package.ACTIVITY__OWNED_RULE:
				getOwnedRules().clear();
				return;
			case UML2Package.ACTIVITY__ELEMENT_IMPORT:
				getElementImports().clear();
				return;
			case UML2Package.ACTIVITY__PACKAGE_IMPORT:
				getPackageImports().clear();
				return;
			case UML2Package.ACTIVITY__TEMPLATE_PARAMETER:
				setTemplateParameter((TemplateParameter)null);
				return;
			case UML2Package.ACTIVITY__OWNING_PARAMETER:
				setOwningParameter(null);
				return;
			case UML2Package.ACTIVITY__PACKAGEABLE_ELEMENT_VISIBILITY:
				setPackageableElement_visibility(PACKAGEABLE_ELEMENT_VISIBILITY_EDEFAULT);
				return;
			case UML2Package.ACTIVITY__IS_LEAF:
				setIsLeaf(IS_LEAF_EDEFAULT);
				return;
			case UML2Package.ACTIVITY__IS_ABSTRACT:
				setIsAbstract(IS_ABSTRACT_EDEFAULT);
				return;
			case UML2Package.ACTIVITY__GENERALIZATION:
				getGeneralizations().clear();
				return;
			case UML2Package.ACTIVITY__REDEFINED_CLASSIFIER:
				getRedefinedClassifiers().clear();
				return;
			case UML2Package.ACTIVITY__SUBSTITUTION:
				getSubstitutions().clear();
				return;
			case UML2Package.ACTIVITY__POWERTYPE_EXTENT:
				getPowertypeExtents().clear();
				return;
			case UML2Package.ACTIVITY__OWNED_USE_CASE:
				getOwnedUseCases().clear();
				return;
			case UML2Package.ACTIVITY__USE_CASE:
				getUseCases().clear();
				return;
			case UML2Package.ACTIVITY__REPRESENTATION:
				setRepresentation((CollaborationOccurrence)null);
				return;
			case UML2Package.ACTIVITY__OCCURRENCE:
				getOccurrences().clear();
				return;
			case UML2Package.ACTIVITY__OWNED_BEHAVIOR:
				getOwnedBehaviors().clear();
				return;
			case UML2Package.ACTIVITY__CLASSIFIER_BEHAVIOR:
				setClassifierBehavior((Behavior)null);
				return;
			case UML2Package.ACTIVITY__IMPLEMENTATION:
				getImplementations().clear();
				return;
			case UML2Package.ACTIVITY__OWNED_TRIGGER:
				getOwnedTriggers().clear();
				return;
			case UML2Package.ACTIVITY__OWNED_STATE_MACHINE:
				getOwnedStateMachines().clear();
				return;
			case UML2Package.ACTIVITY__OWNED_ATTRIBUTE:
				getOwnedAttributes().clear();
				return;
			case UML2Package.ACTIVITY__OWNED_CONNECTOR:
				getOwnedConnectors().clear();
				return;
			case UML2Package.ACTIVITY__OWNED_PORT:
				getOwnedPorts().clear();
				return;
			case UML2Package.ACTIVITY__OWNED_OPERATION:
				getOwnedOperations().clear();
				return;
			case UML2Package.ACTIVITY__NESTED_CLASSIFIER:
				getNestedClassifiers().clear();
				return;
			case UML2Package.ACTIVITY__IS_ACTIVE:
				setIsActive(IS_ACTIVE_EDEFAULT);
				return;
			case UML2Package.ACTIVITY__OWNED_RECEPTION:
				getOwnedReceptions().clear();
				return;
			case UML2Package.ACTIVITY__IS_REENTRANT:
				setIsReentrant(IS_REENTRANT_EDEFAULT);
				return;
			case UML2Package.ACTIVITY__CONTEXT:
				setContext(null);
				return;
			case UML2Package.ACTIVITY__REDEFINED_BEHAVIOR:
				getRedefinedBehaviors().clear();
				return;
			case UML2Package.ACTIVITY__SPECIFICATION:
				setSpecification((BehavioralFeature)null);
				return;
			case UML2Package.ACTIVITY__PARAMETER:
				getParameters().clear();
				return;
			case UML2Package.ACTIVITY__PRECONDITION:
				getPreconditions().clear();
				return;
			case UML2Package.ACTIVITY__POSTCONDITION:
				getPostconditions().clear();
				return;
			case UML2Package.ACTIVITY__OWNED_PARAMETER_SET:
				getOwnedParameterSets().clear();
				return;
			case UML2Package.ACTIVITY__BODY:
				setBody(BODY_EDEFAULT);
				return;
			case UML2Package.ACTIVITY__LANGUAGE:
				setLanguage(LANGUAGE_EDEFAULT);
				return;
			case UML2Package.ACTIVITY__EDGE:
				getEdges().clear();
				return;
			case UML2Package.ACTIVITY__GROUP:
				getGroups().clear();
				return;
			case UML2Package.ACTIVITY__NODE:
				getNodes().clear();
				return;
			case UML2Package.ACTIVITY__ACTION:
				getActions().clear();
				return;
			case UML2Package.ACTIVITY__IS_SINGLE_EXECUTION:
				setIsSingleExecution(IS_SINGLE_EXECUTION_EDEFAULT);
				return;
			case UML2Package.ACTIVITY__IS_READ_ONLY:
				setIsReadOnly(IS_READ_ONLY_EDEFAULT);
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
			case UML2Package.ACTIVITY__EANNOTATIONS:
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UML2Package.ACTIVITY__OWNED_ELEMENT:
				return !getOwnedElements().isEmpty();
			case UML2Package.ACTIVITY__OWNER:
				return basicGetOwner() != null;
			case UML2Package.ACTIVITY__OWNED_COMMENT:
				return ownedComment != null && !ownedComment.isEmpty();
			case UML2Package.ACTIVITY__TEMPLATE_BINDING:
				return templateBinding != null && !templateBinding.isEmpty();
			case UML2Package.ACTIVITY__OWNED_TEMPLATE_SIGNATURE:
				return ownedTemplateSignature != null;
			case UML2Package.ACTIVITY__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case UML2Package.ACTIVITY__QUALIFIED_NAME:
				return !"".equals(getQualifiedName()); //$NON-NLS-1$
			case UML2Package.ACTIVITY__VISIBILITY:
				return visibility != VISIBILITY_EDEFAULT;
			case UML2Package.ACTIVITY__CLIENT_DEPENDENCY:
				return clientDependency != null && !clientDependency.isEmpty();
			case UML2Package.ACTIVITY__NAME_EXPRESSION:
				return nameExpression != null;
			case UML2Package.ACTIVITY__MEMBER:
				return !getMembers().isEmpty();
			case UML2Package.ACTIVITY__OWNED_RULE:
				return ownedRule != null && !ownedRule.isEmpty();
			case UML2Package.ACTIVITY__IMPORTED_MEMBER:
				return !getImportedMembers().isEmpty();
			case UML2Package.ACTIVITY__ELEMENT_IMPORT:
				return elementImport != null && !elementImport.isEmpty();
			case UML2Package.ACTIVITY__PACKAGE_IMPORT:
				return packageImport != null && !packageImport.isEmpty();
			case UML2Package.ACTIVITY__TEMPLATE_PARAMETER:
				return templateParameter != null;
			case UML2Package.ACTIVITY__OWNING_PARAMETER:
				return getOwningParameter() != null;
			case UML2Package.ACTIVITY__PACKAGEABLE_ELEMENT_VISIBILITY:
				return packageableElement_visibility != PACKAGEABLE_ELEMENT_VISIBILITY_EDEFAULT;
			case UML2Package.ACTIVITY__PACKAGE:
				return basicGetPackage() != null;
			case UML2Package.ACTIVITY__REDEFINITION_CONTEXT:
				return !getRedefinitionContexts().isEmpty();
			case UML2Package.ACTIVITY__IS_LEAF:
				return isLeaf != IS_LEAF_EDEFAULT;
			case UML2Package.ACTIVITY__FEATURE:
				return !getFeatures().isEmpty();
			case UML2Package.ACTIVITY__IS_ABSTRACT:
				return isAbstract != IS_ABSTRACT_EDEFAULT;
			case UML2Package.ACTIVITY__INHERITED_MEMBER:
				return !getInheritedMembers().isEmpty();
			case UML2Package.ACTIVITY__GENERAL:
				return !getGenerals().isEmpty();
			case UML2Package.ACTIVITY__GENERALIZATION:
				return generalization != null && !generalization.isEmpty();
			case UML2Package.ACTIVITY__ATTRIBUTE:
				return !getAttributes().isEmpty();
			case UML2Package.ACTIVITY__REDEFINED_CLASSIFIER:
				return redefinedClassifier != null && !redefinedClassifier.isEmpty();
			case UML2Package.ACTIVITY__SUBSTITUTION:
				return substitution != null && !substitution.isEmpty();
			case UML2Package.ACTIVITY__POWERTYPE_EXTENT:
				return powertypeExtent != null && !powertypeExtent.isEmpty();
			case UML2Package.ACTIVITY__OWNED_USE_CASE:
				return ownedUseCase != null && !ownedUseCase.isEmpty();
			case UML2Package.ACTIVITY__USE_CASE:
				return useCase != null && !useCase.isEmpty();
			case UML2Package.ACTIVITY__REPRESENTATION:
				return representation != null;
			case UML2Package.ACTIVITY__OCCURRENCE:
				return occurrence != null && !occurrence.isEmpty();
			case UML2Package.ACTIVITY__OWNED_BEHAVIOR:
				return ownedBehavior != null && !ownedBehavior.isEmpty();
			case UML2Package.ACTIVITY__CLASSIFIER_BEHAVIOR:
				return classifierBehavior != null;
			case UML2Package.ACTIVITY__IMPLEMENTATION:
				return implementation != null && !implementation.isEmpty();
			case UML2Package.ACTIVITY__OWNED_TRIGGER:
				return ownedTrigger != null && !ownedTrigger.isEmpty();
			case UML2Package.ACTIVITY__OWNED_STATE_MACHINE:
				return ownedStateMachine != null && !ownedStateMachine.isEmpty();
			case UML2Package.ACTIVITY__OWNED_ATTRIBUTE:
				return !getOwnedAttributes().isEmpty();
			case UML2Package.ACTIVITY__PART:
				return !getParts().isEmpty();
			case UML2Package.ACTIVITY__ROLE:
				return !getRoles().isEmpty();
			case UML2Package.ACTIVITY__OWNED_CONNECTOR:
				return ownedConnector != null && !ownedConnector.isEmpty();
			case UML2Package.ACTIVITY__OWNED_PORT:
				return ownedPort != null && !ownedPort.isEmpty();
			case UML2Package.ACTIVITY__OWNED_OPERATION:
				return ownedOperation != null && !ownedOperation.isEmpty();
			case UML2Package.ACTIVITY__SUPER_CLASS:
				return !getSuperClasses().isEmpty();
			case UML2Package.ACTIVITY__EXTENSION:
				return !getExtensions().isEmpty();
			case UML2Package.ACTIVITY__NESTED_CLASSIFIER:
				return nestedClassifier != null && !nestedClassifier.isEmpty();
			case UML2Package.ACTIVITY__IS_ACTIVE:
				return isActive != IS_ACTIVE_EDEFAULT;
			case UML2Package.ACTIVITY__OWNED_RECEPTION:
				return ownedReception != null && !ownedReception.isEmpty();
			case UML2Package.ACTIVITY__IS_REENTRANT:
				return isReentrant != IS_REENTRANT_EDEFAULT;
			case UML2Package.ACTIVITY__CONTEXT:
				return getContext() != null;
			case UML2Package.ACTIVITY__REDEFINED_BEHAVIOR:
				return redefinedBehavior != null && !redefinedBehavior.isEmpty();
			case UML2Package.ACTIVITY__SPECIFICATION:
				return specification != null;
			case UML2Package.ACTIVITY__PARAMETER:
				return parameter != null && !parameter.isEmpty();
			case UML2Package.ACTIVITY__FORMAL_PARAMETER:
				return !getFormalParameters().isEmpty();
			case UML2Package.ACTIVITY__RETURN_RESULT:
				return !getReturnResults().isEmpty();
			case UML2Package.ACTIVITY__PRECONDITION:
				return precondition != null && !precondition.isEmpty();
			case UML2Package.ACTIVITY__POSTCONDITION:
				return postcondition != null && !postcondition.isEmpty();
			case UML2Package.ACTIVITY__OWNED_PARAMETER_SET:
				return ownedParameterSet != null && !ownedParameterSet.isEmpty();
			case UML2Package.ACTIVITY__BODY:
				return BODY_EDEFAULT == null ? body != null : !BODY_EDEFAULT.equals(body);
			case UML2Package.ACTIVITY__LANGUAGE:
				return LANGUAGE_EDEFAULT == null ? language != null : !LANGUAGE_EDEFAULT.equals(language);
			case UML2Package.ACTIVITY__EDGE:
				return edge != null && !edge.isEmpty();
			case UML2Package.ACTIVITY__GROUP:
				return group != null && !group.isEmpty();
			case UML2Package.ACTIVITY__NODE:
				return node != null && !node.isEmpty();
			case UML2Package.ACTIVITY__ACTION:
				return action != null && !action.isEmpty();
			case UML2Package.ACTIVITY__STRUCTURED_NODE:
				return !getStructuredNodes().isEmpty();
			case UML2Package.ACTIVITY__IS_SINGLE_EXECUTION:
				return isSingleExecution != IS_SINGLE_EXECUTION_EDEFAULT;
			case UML2Package.ACTIVITY__IS_READ_ONLY:
				return isReadOnly != IS_READ_ONLY_EDEFAULT;
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
		result.append(" (body: "); //$NON-NLS-1$
		result.append(body);
		result.append(", language: "); //$NON-NLS-1$
		result.append(language);
		result.append(", isSingleExecution: "); //$NON-NLS-1$
		result.append(isSingleExecution);
		result.append(", isReadOnly: "); //$NON-NLS-1$
		result.append(isReadOnly);
		result.append(')');
		return result.toString();
	}

} //ActivityImpl
