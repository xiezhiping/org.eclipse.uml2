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
 * $Id: ClassImpl.java,v 1.6 2004/05/11 15:24:00 khussey Exp $
 */
package org.eclipse.uml2.impl;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
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
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.uml2.Behavior;
import org.eclipse.uml2.BehavioredClassifier;
import org.eclipse.uml2.Classifier;
import org.eclipse.uml2.CollaborationOccurrence;
import org.eclipse.uml2.Dependency;
import org.eclipse.uml2.Extension;
import org.eclipse.uml2.Implementation;
import org.eclipse.uml2.Operation;
import org.eclipse.uml2.Property;
import org.eclipse.uml2.Reception;
import org.eclipse.uml2.StateMachine;
import org.eclipse.uml2.StringExpression;
import org.eclipse.uml2.TemplateParameter;
import org.eclipse.uml2.TemplateSignature;
import org.eclipse.uml2.UML2Package;
import org.eclipse.uml2.VisibilityKind;
import org.eclipse.uml2.internal.util.SubsetEObjectContainmentWithInverseEList;
import org.eclipse.uml2.internal.util.SupersetEObjectContainmentWithInverseEList;
import org.eclipse.uml2.internal.util.SupersetEObjectWithInverseResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Class</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2.impl.ClassImpl#getOwnedBehaviors <em>Owned Behavior</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.ClassImpl#getClassifierBehavior <em>Classifier Behavior</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.ClassImpl#getImplementations <em>Implementation</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.ClassImpl#getOwnedStateMachines <em>Owned State Machine</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.ClassImpl#getOwnedOperations <em>Owned Operation</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.ClassImpl#getSuperClasses <em>Super Class</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.ClassImpl#getExtensions <em>Extension</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.ClassImpl#getNestedClassifiers <em>Nested Classifier</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.ClassImpl#isActive <em>Is Active</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.ClassImpl#getOwnedReceptions <em>Owned Reception</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ClassImpl extends EncapsulatedClassifierImpl implements org.eclipse.uml2.Class {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2003, 2004 IBM Corporation and others."; //$NON-NLS-1$

	/**
	 * The cached value of the '{@link #getOwnedBehaviors() <em>Owned Behavior</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedBehaviors()
	 * @generated
	 * @ordered
	 */
	protected EList ownedBehavior = null;

	/**
	 * The cached value of the '{@link #getClassifierBehavior() <em>Classifier Behavior</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassifierBehavior()
	 * @generated
	 * @ordered
	 */
	protected Behavior classifierBehavior = null;

	/**
	 * The cached value of the '{@link #getImplementations() <em>Implementation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImplementations()
	 * @generated
	 * @ordered
	 */
	protected EList implementation = null;

	/**
	 * The cached value of the '{@link #getOwnedStateMachines() <em>Owned State Machine</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedStateMachines()
	 * @generated
	 * @ordered
	 */
	protected EList ownedStateMachine = null;

	/**
	 * The cached value of the '{@link #getOwnedOperations() <em>Owned Operation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedOperations()
	 * @generated
	 * @ordered
	 */
	protected EList ownedOperation = null;

	/**
	 * The cached value of the '{@link #getNestedClassifiers() <em>Nested Classifier</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNestedClassifiers()
	 * @generated
	 * @ordered
	 */
	protected EList nestedClassifier = null;

	/**
	 * The default value of the '{@link #isActive() <em>Is Active</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isActive()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_ACTIVE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isActive() <em>Is Active</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isActive()
	 * @generated
	 * @ordered
	 */
	protected boolean isActive = IS_ACTIVE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOwnedReceptions() <em>Owned Reception</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedReceptions()
	 * @generated
	 * @ordered
	 */
	protected EList ownedReception = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClassImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return UML2Package.eINSTANCE.getClass_();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * Returns the value of the '<em><b>Owned Behavior</b></em>' containment reference list.
	 * <p>
	 * Subsets the following features:
	 * <ul>
	 *   <li>{@link org.eclipse.uml2.Namespace#getOwnedMembers}</li>
	 * </ul>
	 * </p>
	 * @generated
	 */
	public EList getOwnedBehaviors() {
		// TODO: test this superset getter
		if (ownedBehavior == null) {
			ownedBehavior = new SupersetEObjectContainmentWithInverseEList(Behavior.class, this, UML2Package.CLASS__OWNED_BEHAVIOR, new int[] {UML2Package.CLASS__CLASSIFIER_BEHAVIOR}, UML2Package.BEHAVIOR__CONTEXT);
		}
		return ownedBehavior;

	}

    /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
     */
    public Behavior getOwnedBehavior(String unqualifiedName) {
    	for (Iterator i = getOwnedBehaviors().iterator(); i.hasNext(); ) {
    		Behavior namedOwnedBehavior = (Behavior) i.next();
    		
    		if (unqualifiedName.equals(namedOwnedBehavior.getName())) {
    			return namedOwnedBehavior;
    		}
    	}
    	
    	return null;
    }
      
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Behavior createOwnedBehavior(EClass eClass) {
		Behavior newOwnedBehavior = (Behavior) eClass.getEPackage().getEFactoryInstance().create(eClass);
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.CREATE, UML2Package.CLASS__OWNED_BEHAVIOR, null, newOwnedBehavior));
		}
		getOwnedBehaviors().add(newOwnedBehavior);
		return newOwnedBehavior;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * Returns the value of the '<em><b>Classifier Behavior</b></em>' reference.
	 * <p>
	 * Subsets the following features:
	 * <ul>
	 *   <li>{@link org.eclipse.uml2.BehavioredClassifier#getOwnedBehaviors}</li>
	 * </ul>
	 * </p>
	 * @generated
	 */
	public Behavior getClassifierBehavior() {
		return classifierBehavior;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClassifierBehavior(Behavior newClassifierBehavior) {
		// TODO: test this subset setter
		if (null != newClassifierBehavior && !getOwnedBehaviors().contains(newClassifierBehavior)) {
			getOwnedBehaviors().add(newClassifierBehavior);
		}
		Behavior oldClassifierBehavior = classifierBehavior;
		classifierBehavior = newClassifierBehavior;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, UML2Package.CLASS__CLASSIFIER_BEHAVIOR, oldClassifierBehavior, classifierBehavior));
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * Returns the value of the '<em><b>Implementation</b></em>' containment reference list.
	 * <p>
	 * Subsets the following features:
	 * <ul>
	 *   <li>{@link org.eclipse.uml2.NamedElement#getClientDependencies}</li>
	 *   <li>{@link org.eclipse.uml2.Element#getOwnedElements}</li>
	 * </ul>
	 * </p>
	 * @generated
	 */
	public EList getImplementations() {
		// TODO: test this subset getter
		if (implementation == null) {
			implementation = new SubsetEObjectContainmentWithInverseEList(Implementation.class, this, UML2Package.CLASS__IMPLEMENTATION, new int[] {UML2Package.CLASS__CLIENT_DEPENDENCY}, UML2Package.IMPLEMENTATION__IMPLEMENTING_CLASSIFIER);
		}
		return implementation;

	}

    /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
     */
    public Implementation getImplementation(String unqualifiedName) {
    	for (Iterator i = getImplementations().iterator(); i.hasNext(); ) {
    		Implementation namedImplementation = (Implementation) i.next();
    		
    		if (unqualifiedName.equals(namedImplementation.getName())) {
    			return namedImplementation;
    		}
    	}
    	
    	return null;
    }
      
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Implementation createImplementation(EClass eClass) {
		Implementation newImplementation = (Implementation) eClass.getEPackage().getEFactoryInstance().create(eClass);
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.CREATE, UML2Package.CLASS__IMPLEMENTATION, null, newImplementation));
		}
		getImplementations().add(newImplementation);
		return newImplementation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * Returns the value of the '<em><b>Owned State Machine</b></em>' containment reference list.
	 * <p>
	 * Redefines the following features:
	 * <ul>
	 *   <li>{@link org.eclipse.uml2.BehavioredClassifier#getOwnedBehaviors}</li>
	 * </ul>
	 * </p>
	 * @generated
	 */
	public EList getOwnedStateMachines() {
		if (null == ownedStateMachine) {
			ownedStateMachine = new EObjectContainmentWithInverseEList(StateMachine.class, this, UML2Package.CLASS__OWNED_STATE_MACHINE, UML2Package.STATE_MACHINE__STATE_MACHINE_REDEFINITION_CONTEXT);
		}
		return ownedStateMachine;
	}

    /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
     */
    public StateMachine getOwnedStateMachine(String unqualifiedName) {
    	for (Iterator i = getOwnedStateMachines().iterator(); i.hasNext(); ) {
    		StateMachine namedOwnedStateMachine = (StateMachine) i.next();
    		
    		if (unqualifiedName.equals(namedOwnedStateMachine.getName())) {
    			return namedOwnedStateMachine;
    		}
    	}
    	
    	return null;
    }
      
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StateMachine createOwnedStateMachine(EClass eClass) {
		StateMachine newOwnedStateMachine = (StateMachine) eClass.getEPackage().getEFactoryInstance().create(eClass);
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.CREATE, UML2Package.CLASS__OWNED_STATE_MACHINE, null, newOwnedStateMachine));
		}
		getOwnedStateMachines().add(newOwnedStateMachine);
		return newOwnedStateMachine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * Returns the value of the '<em><b>Is Active</b></em>' attribute.
	 * @generated
	 */
	public boolean isActive() {
		return isActive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsActive(boolean newIsActive) {
		boolean oldIsActive = isActive;
		isActive = newIsActive;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2Package.CLASS__IS_ACTIVE, oldIsActive, isActive));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * Returns the value of the '<em><b>Owned Operation</b></em>' containment reference list.
	 * <p>
	 * Subsets the following features:
	 * <ul>
	 *   <li>{@link org.eclipse.uml2.Namespace#getOwnedMembers}</li>
	 *   <li>{@link org.eclipse.uml2.Classifier#getFeatures}</li>
	 * </ul>
	 * </p>
	 * @generated
	 */
	public EList getOwnedOperations() {
		if (ownedOperation == null) {
			ownedOperation = new EObjectContainmentWithInverseEList(Operation.class, this, UML2Package.CLASS__OWNED_OPERATION, UML2Package.OPERATION__CLASS_);
		}
		return ownedOperation;
	}

    /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
     */
    public Operation getOwnedOperation(String unqualifiedName) {
    	for (Iterator i = getOwnedOperations().iterator(); i.hasNext(); ) {
    		Operation namedOwnedOperation = (Operation) i.next();
    		
    		if (unqualifiedName.equals(namedOwnedOperation.getName())) {
    			return namedOwnedOperation;
    		}
    	}
    	
    	return null;
    }
      
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operation createOwnedOperation(EClass eClass) {
		Operation newOwnedOperation = (Operation) eClass.getEPackage().getEFactoryInstance().create(eClass);
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.CREATE, UML2Package.CLASS__OWNED_OPERATION, null, newOwnedOperation));
		}
		getOwnedOperations().add(newOwnedOperation);
		return newOwnedOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * Returns the derived value of the '<em><b>Super Class</b></em>' reference list.
	 * <p>
	 * Redefines the following features:
	 * <ul>
	 *   <li>{@link org.eclipse.uml2.Classifier#getGenerals}</li>
	 * </ul>
	 * </p>
	 * @generated
	 */
	public EList getSuperClassesGen() {
		// TODO: implement this derived getter to return the 'Super Class' reference list
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	public EList getSuperClasses() {
		// TODO: test this derived getter
		if (!getCacheAdapter().containsKey(this, UML2Package.eINSTANCE.getClass_SuperClass())) {
			Set superClass = new HashSet();
			
			for (Iterator generals = general().iterator(); generals.hasNext();) {
				Classifier general = (Classifier) generals.next();
				
				if (org.eclipse.uml2.Class.class.isInstance(general)) {
					superClass.add(general);
				}
			}
			
			getCacheAdapter().put(this, UML2Package.eINSTANCE.getClass_SuperClass(),
				new EcoreEList.UnmodifiableEList(this, UML2Package.eINSTANCE.getClass_SuperClass(), superClass.size(), superClass.toArray()));
		}
		
		return (EList) getCacheAdapter().get(this, UML2Package.eINSTANCE.getClass_SuperClass());
	}
	
    /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
     */
    public org.eclipse.uml2.Class getSuperClass(String unqualifiedName) {
    	for (Iterator i = getSuperClasses().iterator(); i.hasNext(); ) {
    		org.eclipse.uml2.Class namedSuperClass = (org.eclipse.uml2.Class) i.next();
    		
    		if (unqualifiedName.equals(namedSuperClass.getName())) {
    			return namedSuperClass;
    		}
    	}
    	
    	return null;
    }
      
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * Returns the derived value of the '<em><b>Extension</b></em>' reference list.
	 * @generated
	 */
	public EList getExtensionsGen() {
		// TODO: implement this derived getter to return the 'Extension' reference list
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	public EList getExtensions() {
		// TODO: implement this derived getter to return the 'Extension' reference list
		return new EcoreEList.UnmodifiableEList(this, UML2Package.eINSTANCE.getClass_Extension(), 0, Collections.EMPTY_LIST.toArray());
	}

    /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
     */
    public Extension getExtension(String unqualifiedName) {
    	for (Iterator i = getExtensions().iterator(); i.hasNext(); ) {
    		Extension namedExtension = (Extension) i.next();
    		
    		if (unqualifiedName.equals(namedExtension.getName())) {
    			return namedExtension;
    		}
    	}
    	
    	return null;
    }
      
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * Returns the value of the '<em><b>Nested Classifier</b></em>' containment reference list.
	 * <p>
	 * Subsets the following features:
	 * <ul>
	 *   <li>{@link org.eclipse.uml2.Namespace#getOwnedMembers}</li>
	 * </ul>
	 * </p>
	 * @generated
	 */
	public EList getNestedClassifiers() {
		if (nestedClassifier == null) {
			nestedClassifier = new EObjectContainmentEList(Classifier.class, this, UML2Package.CLASS__NESTED_CLASSIFIER);
		}
		return nestedClassifier;
	}

    /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
     */
    public Classifier getNestedClassifier(String unqualifiedName) {
    	for (Iterator i = getNestedClassifiers().iterator(); i.hasNext(); ) {
    		Classifier namedNestedClassifier = (Classifier) i.next();
    		
    		if (unqualifiedName.equals(namedNestedClassifier.getName())) {
    			return namedNestedClassifier;
    		}
    	}
    	
    	return null;
    }
      
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Classifier createNestedClassifier(EClass eClass) {
		Classifier newNestedClassifier = (Classifier) eClass.getEPackage().getEFactoryInstance().create(eClass);
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.CREATE, UML2Package.CLASS__NESTED_CLASSIFIER, null, newNestedClassifier));
		}
		getNestedClassifiers().add(newNestedClassifier);
		return newNestedClassifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * Returns the value of the '<em><b>Owned Reception</b></em>' containment reference list.
	 * <p>
	 * Subsets the following features:
	 * <ul>
	 *   <li>{@link org.eclipse.uml2.Namespace#getOwnedMembers}</li>
	 *   <li>{@link org.eclipse.uml2.Classifier#getFeatures}</li>
	 * </ul>
	 * </p>
	 * @generated
	 */
	public EList getOwnedReceptions() {
		if (ownedReception == null) {
			ownedReception = new EObjectContainmentEList(Reception.class, this, UML2Package.CLASS__OWNED_RECEPTION);
		}
		return ownedReception;
	}

    /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
     */
    public Reception getOwnedReception(String unqualifiedName) {
    	for (Iterator i = getOwnedReceptions().iterator(); i.hasNext(); ) {
    		Reception namedOwnedReception = (Reception) i.next();
    		
    		if (unqualifiedName.equals(namedOwnedReception.getName())) {
    			return namedOwnedReception;
    		}
    	}
    	
    	return null;
    }
      
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reception createOwnedReception(EClass eClass) {
		Reception newOwnedReception = (Reception) eClass.getEPackage().getEFactoryInstance().create(eClass);
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.CREATE, UML2Package.CLASS__OWNED_RECEPTION, null, newOwnedReception));
		}
		getOwnedReceptions().add(newOwnedReception);
		return newOwnedReception;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * Returns the value of the '<em><b>Owned Element</b></em>' reference list, a derived union.
	 * The list contents are of type {@link org.eclipse.uml2.Element}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.uml2.Element#getOwner <em>Owner</em>}'.
	 * @generated
	 */
	public EList getOwnedElements() {
		// TODO: test this union getter
		if (!getCacheAdapter().containsKey(this, UML2Package.eINSTANCE.getElement_OwnedElement())) {
			Set union = new LinkedHashSet();
			union.addAll(super.getOwnedElements());
			union.addAll(getImplementations());
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
	 * Returns the value of the '<em><b>Client Dependency</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.Dependency}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.uml2.Dependency#getClients <em>Client</em>}'.
	 * @generated
	 */
	public EList getClientDependencies() {
		// TODO: test this superset getter
		if (clientDependency == null) {
			clientDependency = new SupersetEObjectWithInverseResolvingEList.ManyInverse(Dependency.class, this, UML2Package.CLASS__CLIENT_DEPENDENCY, new int[] {UML2Package.CLASS__SUBSTITUTION, UML2Package.CLASS__IMPLEMENTATION}, UML2Package.DEPENDENCY__CLIENT);
		}
		return clientDependency;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Set inherit(Set inhs) {
		// TODO: test this OCL operation
		return org.eclipse.uml2.internal.operation.ClassOperations.inherit(this, inhs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * Returns the value of the '<em><b>Is Abstract</b></em>' attribute.
	 * The default value is <code>false</code>.
	 * <p>
	 * Redefines the following features:
	 * <ul>
	 *   <li>{@link org.eclipse.uml2.Classifier#isAbstract}</li>
	 * </ul>
	 * </p>
	 * @generated
	 */
	public boolean isAbstractGen() {
		// TODO: implement this redefinition getter
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	public boolean isAbstract() {
		// TODO: test this redefinition getter
		return isAbstract;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsAbstractGen(boolean newIsAbstract) {
		// TODO: implement this redefinition setter
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	public void setIsAbstract(boolean newIsAbstract) {
		// TODO: test this redefinition setter
//		boolean oldIsAbstract = isAbstract;
//		isAbstract = newIsAbstract;
//		if (eNotificationRequired()) {
//			eNotify(new ENotificationImpl(this, Notification.SET, UML2Package.CLASS__IS_ABSTRACT, oldIsAbstract, isAbstract));
//		}
		super.setIsAbstract(newIsAbstract);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * Returns the value of the '<em><b>Owned Attribute</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2.Property}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.uml2.Property#getClass_ <em>Class </em>}'.
	 * <p>
	 * Redefines the following features:
	 * <ul>
	 *   <li>{@link org.eclipse.uml2.StructuredClassifier#getOwnedAttributes}</li>
	 * </ul>
	 * </p>
	 * <p>
	 * Subsets the following features:
	 * <ul>
	 *   <li>{@link org.eclipse.uml2.Classifier#getAttributes}</li>
	 *   <li>{@link org.eclipse.uml2.Namespace#getOwnedMembers}</li>
	 * </ul>
	 * </p>
	 * @generated
	 */
	public EList getOwnedAttributesGen() {
		// TODO: implement this redefinition getter
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	public EList getOwnedAttributes() {
		// TODO: test this redefinition getter
		if (ownedAttribute == null) {
			ownedAttribute = new EObjectContainmentEList(Property.class, this, UML2Package.CLASS__OWNED_ATTRIBUTE);
		}
		return ownedAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * Returns the derived value of the '<em><b>General</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.Classifier}.
	 * @generated
	 */
	public EList getGenerals() {
		// TODO: test this redefined getter
		return getSuperClasses();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * Returns the value of the '<em><b>Attribute</b></em>' reference list, a derived union.
	 * The list contents are of type {@link org.eclipse.uml2.Property}.
	 * @generated
	 */
	public EList getAttributes() {
		// TODO: test this union getter
		if (!getCacheAdapter().containsKey(this, UML2Package.eINSTANCE.getClassifier_Attribute())) {
			Set union = new LinkedHashSet();
			union.addAll(super.getAttributes());
			union.addAll(getOwnedAttributes());
			getCacheAdapter().put(
				this,
				UML2Package.eINSTANCE.getClassifier_Attribute(),
				new EcoreEList.UnmodifiableEList(this, 
					UML2Package.eINSTANCE.getClassifier_Attribute(),
					union.size(),
					union.toArray()));
		}
		return (EList) getCacheAdapter().get(this, UML2Package.eINSTANCE.getClassifier_Attribute());
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
		if (!getCacheAdapter().containsKey(this, UML2Package.eINSTANCE.getClass_().getEAllOperations().get(84))) {
			Set union = new LinkedHashSet();
			union.addAll(super.getOwnedMembers());
			union.addAll(getOwnedAttributes());
			union.addAll(getOwnedOperations());
			union.addAll(getNestedClassifiers());
			union.addAll(getOwnedReceptions());
			getCacheAdapter().put(
				this,
				UML2Package.eINSTANCE.getClass_().getEAllOperations().get(84),
				new BasicEList.UnmodifiableEList(union.size(), union.toArray()));
		}
		return (EList) getCacheAdapter().get(this, UML2Package.eINSTANCE.getClass_().getEAllOperations().get(84));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * Returns the value of the '<em><b>Feature</b></em>' reference list, a derived union.
	 * The list contents are of type {@link org.eclipse.uml2.Feature}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.uml2.Feature#getFeaturingClassifiers <em>Featuring Classifier</em>}'.
	 * @generated
	 */
	public EList getFeatures() {
		// TODO: test this union getter
		if (!getCacheAdapter().containsKey(this, UML2Package.eINSTANCE.getClassifier_Feature())) {
			Set union = new LinkedHashSet();
			union.addAll(super.getFeatures());
			union.addAll(getOwnedOperations());
			union.addAll(getOwnedReceptions());
			getCacheAdapter().put(
				this,
				UML2Package.eINSTANCE.getClassifier_Feature(),
				new EcoreEList.UnmodifiableEList(this, 
					UML2Package.eINSTANCE.getClassifier_Feature(),
					union.size(),
					union.toArray()));
		}
		return (EList) getCacheAdapter().get(this, UML2Package.eINSTANCE.getClassifier_Feature());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, Class baseClass, NotificationChain msgs) {
		if (featureID >= 0) {
			switch (eDerivedStructuralFeatureID(featureID, baseClass)) {
				case UML2Package.CLASS__EANNOTATIONS:
					return ((InternalEList)getEAnnotations()).basicAdd(otherEnd, msgs);
				case UML2Package.CLASS__TEMPLATE_BINDING:
					return ((InternalEList)getTemplateBindings()).basicAdd(otherEnd, msgs);
				case UML2Package.CLASS__OWNED_TEMPLATE_SIGNATURE:
					if (ownedTemplateSignature != null)
						msgs = ((InternalEObject)ownedTemplateSignature).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UML2Package.CLASS__OWNED_TEMPLATE_SIGNATURE, null, msgs);
					return basicSetOwnedTemplateSignature((TemplateSignature)otherEnd, msgs);
				case UML2Package.CLASS__CLIENT_DEPENDENCY:
					return ((InternalEList)getClientDependencies()).basicAdd(otherEnd, msgs);
				case UML2Package.CLASS__OWNED_RULE:
					return ((InternalEList)getOwnedRules()).basicAdd(otherEnd, msgs);
				case UML2Package.CLASS__ELEMENT_IMPORT:
					return ((InternalEList)getElementImports()).basicAdd(otherEnd, msgs);
				case UML2Package.CLASS__PACKAGE_IMPORT:
					return ((InternalEList)getPackageImports()).basicAdd(otherEnd, msgs);
				case UML2Package.CLASS__TEMPLATE_PARAMETER:
					if (templateParameter != null)
						msgs = ((InternalEObject)templateParameter).eInverseRemove(this, UML2Package.TEMPLATE_PARAMETER__PARAMETERED_ELEMENT, TemplateParameter.class, msgs);
					return basicSetTemplateParameter((TemplateParameter)otherEnd, msgs);
				case UML2Package.CLASS__OWNING_PARAMETER:
					if (eContainer != null)
						msgs = eBasicRemoveFromContainer(msgs);
					return eBasicSetContainer(otherEnd, UML2Package.CLASS__OWNING_PARAMETER, msgs);
				case UML2Package.CLASS__GENERALIZATION:
					return ((InternalEList)getGeneralizations()).basicAdd(otherEnd, msgs);
				case UML2Package.CLASS__POWERTYPE_EXTENT:
					return ((InternalEList)getPowertypeExtents()).basicAdd(otherEnd, msgs);
				case UML2Package.CLASS__SUBSTITUTION:
					return ((InternalEList)getSubstitutions()).basicAdd(otherEnd, msgs);
				case UML2Package.CLASS__OWNED_BEHAVIOR:
					return ((InternalEList)getOwnedBehaviors()).basicAdd(otherEnd, msgs);
				case UML2Package.CLASS__IMPLEMENTATION:
					return ((InternalEList)getImplementations()).basicAdd(otherEnd, msgs);
				case UML2Package.CLASS__OWNED_STATE_MACHINE:
					return ((InternalEList)getOwnedStateMachines()).basicAdd(otherEnd, msgs);
				case UML2Package.CLASS__OWNED_OPERATION:
					return ((InternalEList)getOwnedOperations()).basicAdd(otherEnd, msgs);
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
				case UML2Package.CLASS__EANNOTATIONS:
					return ((InternalEList)getEAnnotations()).basicRemove(otherEnd, msgs);
				case UML2Package.CLASS__OWNED_COMMENT:
					return ((InternalEList)getOwnedComments()).basicRemove(otherEnd, msgs);
				case UML2Package.CLASS__TEMPLATE_BINDING:
					return ((InternalEList)getTemplateBindings()).basicRemove(otherEnd, msgs);
				case UML2Package.CLASS__OWNED_TEMPLATE_SIGNATURE:
					return basicSetOwnedTemplateSignature(null, msgs);
				case UML2Package.CLASS__CLIENT_DEPENDENCY:
					return ((InternalEList)getClientDependencies()).basicRemove(otherEnd, msgs);
				case UML2Package.CLASS__NAME_EXPRESSION:
					return basicSetNameExpression(null, msgs);
				case UML2Package.CLASS__OWNED_RULE:
					return ((InternalEList)getOwnedRules()).basicRemove(otherEnd, msgs);
				case UML2Package.CLASS__ELEMENT_IMPORT:
					return ((InternalEList)getElementImports()).basicRemove(otherEnd, msgs);
				case UML2Package.CLASS__PACKAGE_IMPORT:
					return ((InternalEList)getPackageImports()).basicRemove(otherEnd, msgs);
				case UML2Package.CLASS__TEMPLATE_PARAMETER:
					return basicSetTemplateParameter(null, msgs);
				case UML2Package.CLASS__OWNING_PARAMETER:
					return eBasicSetContainer(null, UML2Package.CLASS__OWNING_PARAMETER, msgs);
				case UML2Package.CLASS__GENERALIZATION:
					return ((InternalEList)getGeneralizations()).basicRemove(otherEnd, msgs);
				case UML2Package.CLASS__POWERTYPE_EXTENT:
					return ((InternalEList)getPowertypeExtents()).basicRemove(otherEnd, msgs);
				case UML2Package.CLASS__SUBSTITUTION:
					return ((InternalEList)getSubstitutions()).basicRemove(otherEnd, msgs);
				case UML2Package.CLASS__OWNED_USE_CASE:
					return ((InternalEList)getOwnedUseCases()).basicRemove(otherEnd, msgs);
				case UML2Package.CLASS__OCCURRENCE:
					return ((InternalEList)getOccurrences()).basicRemove(otherEnd, msgs);
				case UML2Package.CLASS__OWNED_ATTRIBUTE:
					return ((InternalEList)getOwnedAttributes()).basicRemove(otherEnd, msgs);
				case UML2Package.CLASS__OWNED_CONNECTOR:
					return ((InternalEList)getOwnedConnectors()).basicRemove(otherEnd, msgs);
				case UML2Package.CLASS__OWNED_PORT:
					return ((InternalEList)getOwnedPorts()).basicRemove(otherEnd, msgs);
				case UML2Package.CLASS__OWNED_BEHAVIOR:
					return ((InternalEList)getOwnedBehaviors()).basicRemove(otherEnd, msgs);
				case UML2Package.CLASS__IMPLEMENTATION:
					return ((InternalEList)getImplementations()).basicRemove(otherEnd, msgs);
				case UML2Package.CLASS__OWNED_STATE_MACHINE:
					return ((InternalEList)getOwnedStateMachines()).basicRemove(otherEnd, msgs);
				case UML2Package.CLASS__OWNED_OPERATION:
					return ((InternalEList)getOwnedOperations()).basicRemove(otherEnd, msgs);
				case UML2Package.CLASS__NESTED_CLASSIFIER:
					return ((InternalEList)getNestedClassifiers()).basicRemove(otherEnd, msgs);
				case UML2Package.CLASS__OWNED_RECEPTION:
					return ((InternalEList)getOwnedReceptions()).basicRemove(otherEnd, msgs);
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
				case UML2Package.CLASS__OWNING_PARAMETER:
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
			case UML2Package.CLASS__EANNOTATIONS:
				return getEAnnotations();
			case UML2Package.CLASS__OWNED_ELEMENT:
				return getOwnedElements();
			case UML2Package.CLASS__OWNER:
				if (resolve) return getOwner();
				return basicGetOwner();
			case UML2Package.CLASS__OWNED_COMMENT:
				return getOwnedComments();
			case UML2Package.CLASS__TEMPLATE_BINDING:
				return getTemplateBindings();
			case UML2Package.CLASS__OWNED_TEMPLATE_SIGNATURE:
				return getOwnedTemplateSignature();
			case UML2Package.CLASS__NAME:
				return getName();
			case UML2Package.CLASS__QUALIFIED_NAME:
				return getQualifiedName();
			case UML2Package.CLASS__VISIBILITY:
				return getVisibility();
			case UML2Package.CLASS__CLIENT_DEPENDENCY:
				return getClientDependencies();
			case UML2Package.CLASS__NAME_EXPRESSION:
				return getNameExpression();
			case UML2Package.CLASS__MEMBER:
				return getMembers();
			case UML2Package.CLASS__OWNED_RULE:
				return getOwnedRules();
			case UML2Package.CLASS__IMPORTED_MEMBER:
				return getImportedMembers();
			case UML2Package.CLASS__ELEMENT_IMPORT:
				return getElementImports();
			case UML2Package.CLASS__PACKAGE_IMPORT:
				return getPackageImports();
			case UML2Package.CLASS__TEMPLATE_PARAMETER:
				if (resolve) return getTemplateParameter();
				return basicGetTemplateParameter();
			case UML2Package.CLASS__OWNING_PARAMETER:
				return getOwningParameter();
			case UML2Package.CLASS__PACKAGEABLE_ELEMENT_VISIBILITY:
				return getPackageableElement_visibility();
			case UML2Package.CLASS__PACKAGE:
				if (resolve) return getPackage();
				return basicGetPackage();
			case UML2Package.CLASS__REDEFINITION_CONTEXT:
				return getRedefinitionContexts();
			case UML2Package.CLASS__IS_LEAF:
				return isLeaf() ? Boolean.TRUE : Boolean.FALSE;
			case UML2Package.CLASS__FEATURE:
				return getFeatures();
			case UML2Package.CLASS__IS_ABSTRACT:
				return isAbstract() ? Boolean.TRUE : Boolean.FALSE;
			case UML2Package.CLASS__INHERITED_MEMBER:
				return getInheritedMembers();
			case UML2Package.CLASS__GENERAL:
				return getGenerals();
			case UML2Package.CLASS__GENERALIZATION:
				return getGeneralizations();
			case UML2Package.CLASS__ATTRIBUTE:
				return getAttributes();
			case UML2Package.CLASS__REDEFINED_CLASSIFIER:
				return getRedefinedClassifiers();
			case UML2Package.CLASS__POWERTYPE_EXTENT:
				return getPowertypeExtents();
			case UML2Package.CLASS__SUBSTITUTION:
				return getSubstitutions();
			case UML2Package.CLASS__OWNED_USE_CASE:
				return getOwnedUseCases();
			case UML2Package.CLASS__REPRESENTATION:
				return getRepresentation();
			case UML2Package.CLASS__OCCURRENCE:
				return getOccurrences();
			case UML2Package.CLASS__OWNED_ATTRIBUTE:
				return getOwnedAttributes();
			case UML2Package.CLASS__PART:
				return getParts();
			case UML2Package.CLASS__ROLE:
				return getRoles();
			case UML2Package.CLASS__OWNED_CONNECTOR:
				return getOwnedConnectors();
			case UML2Package.CLASS__OWNED_PORT:
				return getOwnedPorts();
			case UML2Package.CLASS__OWNED_BEHAVIOR:
				return getOwnedBehaviors();
			case UML2Package.CLASS__CLASSIFIER_BEHAVIOR:
				return getClassifierBehavior();
			case UML2Package.CLASS__IMPLEMENTATION:
				return getImplementations();
			case UML2Package.CLASS__OWNED_STATE_MACHINE:
				return getOwnedStateMachines();
			case UML2Package.CLASS__OWNED_OPERATION:
				return getOwnedOperations();
			case UML2Package.CLASS__SUPER_CLASS:
				return getSuperClasses();
			case UML2Package.CLASS__EXTENSION:
				return getExtensions();
			case UML2Package.CLASS__NESTED_CLASSIFIER:
				return getNestedClassifiers();
			case UML2Package.CLASS__IS_ACTIVE:
				return isActive() ? Boolean.TRUE : Boolean.FALSE;
			case UML2Package.CLASS__OWNED_RECEPTION:
				return getOwnedReceptions();
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
			case UML2Package.CLASS__EANNOTATIONS:
				getEAnnotations().clear();
				getEAnnotations().addAll((Collection)newValue);
				return;
			case UML2Package.CLASS__OWNED_COMMENT:
				getOwnedComments().clear();
				getOwnedComments().addAll((Collection)newValue);
				return;
			case UML2Package.CLASS__TEMPLATE_BINDING:
				getTemplateBindings().clear();
				getTemplateBindings().addAll((Collection)newValue);
				return;
			case UML2Package.CLASS__OWNED_TEMPLATE_SIGNATURE:
				setOwnedTemplateSignature((TemplateSignature)newValue);
				return;
			case UML2Package.CLASS__NAME:
				setName((String)newValue);
				return;
			case UML2Package.CLASS__VISIBILITY:
				setVisibility((VisibilityKind)newValue);
				return;
			case UML2Package.CLASS__CLIENT_DEPENDENCY:
				getClientDependencies().clear();
				getClientDependencies().addAll((Collection)newValue);
				return;
			case UML2Package.CLASS__NAME_EXPRESSION:
				setNameExpression((StringExpression)newValue);
				return;
			case UML2Package.CLASS__OWNED_RULE:
				getOwnedRules().clear();
				getOwnedRules().addAll((Collection)newValue);
				return;
			case UML2Package.CLASS__ELEMENT_IMPORT:
				getElementImports().clear();
				getElementImports().addAll((Collection)newValue);
				return;
			case UML2Package.CLASS__PACKAGE_IMPORT:
				getPackageImports().clear();
				getPackageImports().addAll((Collection)newValue);
				return;
			case UML2Package.CLASS__TEMPLATE_PARAMETER:
				setTemplateParameter((TemplateParameter)newValue);
				return;
			case UML2Package.CLASS__OWNING_PARAMETER:
				setOwningParameter((TemplateParameter)newValue);
				return;
			case UML2Package.CLASS__PACKAGEABLE_ELEMENT_VISIBILITY:
				setPackageableElement_visibility((VisibilityKind)newValue);
				return;
			case UML2Package.CLASS__IS_LEAF:
				setIsLeaf(((Boolean)newValue).booleanValue());
				return;
			case UML2Package.CLASS__IS_ABSTRACT:
				setIsAbstract(((Boolean)newValue).booleanValue());
				return;
			case UML2Package.CLASS__GENERALIZATION:
				getGeneralizations().clear();
				getGeneralizations().addAll((Collection)newValue);
				return;
			case UML2Package.CLASS__REDEFINED_CLASSIFIER:
				getRedefinedClassifiers().clear();
				getRedefinedClassifiers().addAll((Collection)newValue);
				return;
			case UML2Package.CLASS__POWERTYPE_EXTENT:
				getPowertypeExtents().clear();
				getPowertypeExtents().addAll((Collection)newValue);
				return;
			case UML2Package.CLASS__SUBSTITUTION:
				getSubstitutions().clear();
				getSubstitutions().addAll((Collection)newValue);
				return;
			case UML2Package.CLASS__OWNED_USE_CASE:
				getOwnedUseCases().clear();
				getOwnedUseCases().addAll((Collection)newValue);
				return;
			case UML2Package.CLASS__REPRESENTATION:
				setRepresentation((CollaborationOccurrence)newValue);
				return;
			case UML2Package.CLASS__OCCURRENCE:
				getOccurrences().clear();
				getOccurrences().addAll((Collection)newValue);
				return;
			case UML2Package.CLASS__OWNED_ATTRIBUTE:
				getOwnedAttributes().clear();
				getOwnedAttributes().addAll((Collection)newValue);
				return;
			case UML2Package.CLASS__OWNED_CONNECTOR:
				getOwnedConnectors().clear();
				getOwnedConnectors().addAll((Collection)newValue);
				return;
			case UML2Package.CLASS__OWNED_PORT:
				getOwnedPorts().clear();
				getOwnedPorts().addAll((Collection)newValue);
				return;
			case UML2Package.CLASS__OWNED_BEHAVIOR:
				getOwnedBehaviors().clear();
				getOwnedBehaviors().addAll((Collection)newValue);
				return;
			case UML2Package.CLASS__CLASSIFIER_BEHAVIOR:
				setClassifierBehavior((Behavior)newValue);
				return;
			case UML2Package.CLASS__IMPLEMENTATION:
				getImplementations().clear();
				getImplementations().addAll((Collection)newValue);
				return;
			case UML2Package.CLASS__OWNED_STATE_MACHINE:
				getOwnedStateMachines().clear();
				getOwnedStateMachines().addAll((Collection)newValue);
				return;
			case UML2Package.CLASS__OWNED_OPERATION:
				getOwnedOperations().clear();
				getOwnedOperations().addAll((Collection)newValue);
				return;
			case UML2Package.CLASS__NESTED_CLASSIFIER:
				getNestedClassifiers().clear();
				getNestedClassifiers().addAll((Collection)newValue);
				return;
			case UML2Package.CLASS__IS_ACTIVE:
				setIsActive(((Boolean)newValue).booleanValue());
				return;
			case UML2Package.CLASS__OWNED_RECEPTION:
				getOwnedReceptions().clear();
				getOwnedReceptions().addAll((Collection)newValue);
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
			case UML2Package.CLASS__EANNOTATIONS:
				getEAnnotations().clear();
				return;
			case UML2Package.CLASS__OWNED_COMMENT:
				getOwnedComments().clear();
				return;
			case UML2Package.CLASS__TEMPLATE_BINDING:
				getTemplateBindings().clear();
				return;
			case UML2Package.CLASS__OWNED_TEMPLATE_SIGNATURE:
				setOwnedTemplateSignature((TemplateSignature)null);
				return;
			case UML2Package.CLASS__NAME:
				setName(NAME_EDEFAULT);
				return;
			case UML2Package.CLASS__VISIBILITY:
				setVisibility(VISIBILITY_EDEFAULT);
				return;
			case UML2Package.CLASS__CLIENT_DEPENDENCY:
				getClientDependencies().clear();
				return;
			case UML2Package.CLASS__NAME_EXPRESSION:
				setNameExpression((StringExpression)null);
				return;
			case UML2Package.CLASS__OWNED_RULE:
				getOwnedRules().clear();
				return;
			case UML2Package.CLASS__ELEMENT_IMPORT:
				getElementImports().clear();
				return;
			case UML2Package.CLASS__PACKAGE_IMPORT:
				getPackageImports().clear();
				return;
			case UML2Package.CLASS__TEMPLATE_PARAMETER:
				setTemplateParameter((TemplateParameter)null);
				return;
			case UML2Package.CLASS__OWNING_PARAMETER:
				setOwningParameter(null);
				return;
			case UML2Package.CLASS__PACKAGEABLE_ELEMENT_VISIBILITY:
				setPackageableElement_visibility(PACKAGEABLE_ELEMENT_VISIBILITY_EDEFAULT);
				return;
			case UML2Package.CLASS__IS_LEAF:
				setIsLeaf(IS_LEAF_EDEFAULT);
				return;
			case UML2Package.CLASS__IS_ABSTRACT:
				setIsAbstract(IS_ABSTRACT_EDEFAULT);
				return;
			case UML2Package.CLASS__GENERALIZATION:
				getGeneralizations().clear();
				return;
			case UML2Package.CLASS__REDEFINED_CLASSIFIER:
				getRedefinedClassifiers().clear();
				return;
			case UML2Package.CLASS__POWERTYPE_EXTENT:
				getPowertypeExtents().clear();
				return;
			case UML2Package.CLASS__SUBSTITUTION:
				getSubstitutions().clear();
				return;
			case UML2Package.CLASS__OWNED_USE_CASE:
				getOwnedUseCases().clear();
				return;
			case UML2Package.CLASS__REPRESENTATION:
				setRepresentation((CollaborationOccurrence)null);
				return;
			case UML2Package.CLASS__OCCURRENCE:
				getOccurrences().clear();
				return;
			case UML2Package.CLASS__OWNED_ATTRIBUTE:
				getOwnedAttributes().clear();
				return;
			case UML2Package.CLASS__OWNED_CONNECTOR:
				getOwnedConnectors().clear();
				return;
			case UML2Package.CLASS__OWNED_PORT:
				getOwnedPorts().clear();
				return;
			case UML2Package.CLASS__OWNED_BEHAVIOR:
				getOwnedBehaviors().clear();
				return;
			case UML2Package.CLASS__CLASSIFIER_BEHAVIOR:
				setClassifierBehavior((Behavior)null);
				return;
			case UML2Package.CLASS__IMPLEMENTATION:
				getImplementations().clear();
				return;
			case UML2Package.CLASS__OWNED_STATE_MACHINE:
				getOwnedStateMachines().clear();
				return;
			case UML2Package.CLASS__OWNED_OPERATION:
				getOwnedOperations().clear();
				return;
			case UML2Package.CLASS__NESTED_CLASSIFIER:
				getNestedClassifiers().clear();
				return;
			case UML2Package.CLASS__IS_ACTIVE:
				setIsActive(IS_ACTIVE_EDEFAULT);
				return;
			case UML2Package.CLASS__OWNED_RECEPTION:
				getOwnedReceptions().clear();
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
			case UML2Package.CLASS__EANNOTATIONS:
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UML2Package.CLASS__OWNED_ELEMENT:
				return !getOwnedElements().isEmpty();
			case UML2Package.CLASS__OWNER:
				return basicGetOwner() != null;
			case UML2Package.CLASS__OWNED_COMMENT:
				return ownedComment != null && !ownedComment.isEmpty();
			case UML2Package.CLASS__TEMPLATE_BINDING:
				return templateBinding != null && !templateBinding.isEmpty();
			case UML2Package.CLASS__OWNED_TEMPLATE_SIGNATURE:
				return ownedTemplateSignature != null;
			case UML2Package.CLASS__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case UML2Package.CLASS__QUALIFIED_NAME:
				return !"".equals(getQualifiedName()); //$NON-NLS-1$
			case UML2Package.CLASS__VISIBILITY:
				return visibility != VISIBILITY_EDEFAULT;
			case UML2Package.CLASS__CLIENT_DEPENDENCY:
				return clientDependency != null && !clientDependency.isEmpty();
			case UML2Package.CLASS__NAME_EXPRESSION:
				return nameExpression != null;
			case UML2Package.CLASS__MEMBER:
				return !getMembers().isEmpty();
			case UML2Package.CLASS__OWNED_RULE:
				return ownedRule != null && !ownedRule.isEmpty();
			case UML2Package.CLASS__IMPORTED_MEMBER:
				return !getImportedMembers().isEmpty();
			case UML2Package.CLASS__ELEMENT_IMPORT:
				return elementImport != null && !elementImport.isEmpty();
			case UML2Package.CLASS__PACKAGE_IMPORT:
				return packageImport != null && !packageImport.isEmpty();
			case UML2Package.CLASS__TEMPLATE_PARAMETER:
				return templateParameter != null;
			case UML2Package.CLASS__OWNING_PARAMETER:
				return getOwningParameter() != null;
			case UML2Package.CLASS__PACKAGEABLE_ELEMENT_VISIBILITY:
				return packageableElement_visibility != PACKAGEABLE_ELEMENT_VISIBILITY_EDEFAULT;
			case UML2Package.CLASS__PACKAGE:
				return basicGetPackage() != null;
			case UML2Package.CLASS__REDEFINITION_CONTEXT:
				return !getRedefinitionContexts().isEmpty();
			case UML2Package.CLASS__IS_LEAF:
				return isLeaf != IS_LEAF_EDEFAULT;
			case UML2Package.CLASS__FEATURE:
				return !getFeatures().isEmpty();
			case UML2Package.CLASS__IS_ABSTRACT:
				return isAbstract != IS_ABSTRACT_EDEFAULT;
			case UML2Package.CLASS__INHERITED_MEMBER:
				return !getInheritedMembers().isEmpty();
			case UML2Package.CLASS__GENERAL:
				return !getGenerals().isEmpty();
			case UML2Package.CLASS__GENERALIZATION:
				return generalization != null && !generalization.isEmpty();
			case UML2Package.CLASS__ATTRIBUTE:
				return !getAttributes().isEmpty();
			case UML2Package.CLASS__REDEFINED_CLASSIFIER:
				return redefinedClassifier != null && !redefinedClassifier.isEmpty();
			case UML2Package.CLASS__POWERTYPE_EXTENT:
				return powertypeExtent != null && !powertypeExtent.isEmpty();
			case UML2Package.CLASS__SUBSTITUTION:
				return substitution != null && !substitution.isEmpty();
			case UML2Package.CLASS__OWNED_USE_CASE:
				return ownedUseCase != null && !ownedUseCase.isEmpty();
			case UML2Package.CLASS__REPRESENTATION:
				return representation != null;
			case UML2Package.CLASS__OCCURRENCE:
				return occurrence != null && !occurrence.isEmpty();
			case UML2Package.CLASS__OWNED_ATTRIBUTE:
				return ownedAttribute != null && !ownedAttribute.isEmpty();
			case UML2Package.CLASS__PART:
				return !getParts().isEmpty();
			case UML2Package.CLASS__ROLE:
				return !getRoles().isEmpty();
			case UML2Package.CLASS__OWNED_CONNECTOR:
				return ownedConnector != null && !ownedConnector.isEmpty();
			case UML2Package.CLASS__OWNED_PORT:
				return ownedPort != null && !ownedPort.isEmpty();
			case UML2Package.CLASS__OWNED_BEHAVIOR:
				return ownedBehavior != null && !ownedBehavior.isEmpty();
			case UML2Package.CLASS__CLASSIFIER_BEHAVIOR:
				return classifierBehavior != null;
			case UML2Package.CLASS__IMPLEMENTATION:
				return implementation != null && !implementation.isEmpty();
			case UML2Package.CLASS__OWNED_STATE_MACHINE:
				return ownedStateMachine != null && !ownedStateMachine.isEmpty();
			case UML2Package.CLASS__OWNED_OPERATION:
				return ownedOperation != null && !ownedOperation.isEmpty();
			case UML2Package.CLASS__SUPER_CLASS:
				return !getSuperClasses().isEmpty();
			case UML2Package.CLASS__EXTENSION:
				return !getExtensions().isEmpty();
			case UML2Package.CLASS__NESTED_CLASSIFIER:
				return nestedClassifier != null && !nestedClassifier.isEmpty();
			case UML2Package.CLASS__IS_ACTIVE:
				return isActive != IS_ACTIVE_EDEFAULT;
			case UML2Package.CLASS__OWNED_RECEPTION:
				return ownedReception != null && !ownedReception.isEmpty();
		}
		return eDynamicIsSet(eFeature);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class baseClass) {
		if (baseClass == BehavioredClassifier.class) {
			switch (derivedFeatureID) {
				case UML2Package.CLASS__OWNED_BEHAVIOR: return UML2Package.BEHAVIORED_CLASSIFIER__OWNED_BEHAVIOR;
				case UML2Package.CLASS__CLASSIFIER_BEHAVIOR: return UML2Package.BEHAVIORED_CLASSIFIER__CLASSIFIER_BEHAVIOR;
				case UML2Package.CLASS__IMPLEMENTATION: return UML2Package.BEHAVIORED_CLASSIFIER__IMPLEMENTATION;
				case UML2Package.CLASS__OWNED_STATE_MACHINE: return UML2Package.BEHAVIORED_CLASSIFIER__OWNED_STATE_MACHINE;
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
		if (baseClass == BehavioredClassifier.class) {
			switch (baseFeatureID) {
				case UML2Package.BEHAVIORED_CLASSIFIER__OWNED_BEHAVIOR: return UML2Package.CLASS__OWNED_BEHAVIOR;
				case UML2Package.BEHAVIORED_CLASSIFIER__CLASSIFIER_BEHAVIOR: return UML2Package.CLASS__CLASSIFIER_BEHAVIOR;
				case UML2Package.BEHAVIORED_CLASSIFIER__IMPLEMENTATION: return UML2Package.CLASS__IMPLEMENTATION;
				case UML2Package.BEHAVIORED_CLASSIFIER__OWNED_STATE_MACHINE: return UML2Package.CLASS__OWNED_STATE_MACHINE;
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
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (isActive: "); //$NON-NLS-1$
		result.append(isActive);
		result.append(')');
		return result.toString();
	}

} //ClassImpl
