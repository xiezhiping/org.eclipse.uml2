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
 * $Id: OperationImpl.java,v 1.5 2004/05/11 15:23:59 khussey Exp $
 */
package org.eclipse.uml2.impl;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EcoreEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.uml2.CallConcurrencyKind;
import org.eclipse.uml2.Classifier;
import org.eclipse.uml2.Constraint;
import org.eclipse.uml2.DataType;
import org.eclipse.uml2.Element;
import org.eclipse.uml2.MultiplicityElement;
import org.eclipse.uml2.Namespace;
import org.eclipse.uml2.Operation;
import org.eclipse.uml2.Parameter;
import org.eclipse.uml2.ParameterableElement;
import org.eclipse.uml2.RedefinableElement;
import org.eclipse.uml2.StringExpression;
import org.eclipse.uml2.TemplateParameter;
import org.eclipse.uml2.TemplateSignature;
import org.eclipse.uml2.Type;
import org.eclipse.uml2.TypedElement;
import org.eclipse.uml2.UML2Package;
import org.eclipse.uml2.ValueSpecification;
import org.eclipse.uml2.VisibilityKind;
import org.eclipse.uml2.internal.operation.MultiplicityElementOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Operation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2.impl.OperationImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.OperationImpl#isOrdered <em>Is Ordered</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.OperationImpl#isUnique <em>Is Unique</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.OperationImpl#getLower <em>Lower</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.OperationImpl#getUpper <em>Upper</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.OperationImpl#getUpperValue <em>Upper Value</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.OperationImpl#getLowerValue <em>Lower Value</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.OperationImpl#getTemplateParameter <em>Template Parameter</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.OperationImpl#getOwningParameter <em>Owning Parameter</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.OperationImpl#getOwnedParameters <em>Owned Parameter</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.OperationImpl#getClass_ <em>Class </em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.OperationImpl#isQuery <em>Is Query</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.OperationImpl#getDatatype <em>Datatype</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.OperationImpl#getPreconditions <em>Precondition</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.OperationImpl#getPostconditions <em>Postcondition</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.OperationImpl#getRedefinedOperations <em>Redefined Operation</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.OperationImpl#getBodyCondition <em>Body Condition</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OperationImpl extends BehavioralFeatureImpl implements Operation {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2003, 2004 IBM Corporation and others."; //$NON-NLS-1$

	/**
	 * The cached value of the '{@link #getUpperValue() <em>Upper Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpperValue()
	 * @generated
	 * @ordered
	 */
	protected ValueSpecification upperValue = null;

	/**
	 * The cached value of the '{@link #getLowerValue() <em>Lower Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLowerValue()
	 * @generated
	 * @ordered
	 */
	protected ValueSpecification lowerValue = null;

	/**
	 * The cached value of the '{@link #getTemplateParameter() <em>Template Parameter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTemplateParameter()
	 * @generated
	 * @ordered
	 */
	protected TemplateParameter templateParameter = null;

	/**
	 * The cached value of the '{@link #getOwnedParameters() <em>Owned Parameter</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedParameters()
	 * @generated
	 * @ordered
	 */
	protected EList ownedParameter = null;

	/**
	 * The default value of the '{@link #isQuery() <em>Is Query</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isQuery()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_QUERY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isQuery() <em>Is Query</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isQuery()
	 * @generated
	 * @ordered
	 */
	protected boolean isQuery = IS_QUERY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPreconditions() <em>Precondition</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreconditions()
	 * @generated
	 * @ordered
	 */
	protected EList precondition = null;

	/**
	 * The cached value of the '{@link #getPostconditions() <em>Postcondition</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPostconditions()
	 * @generated
	 * @ordered
	 */
	protected EList postcondition = null;

	/**
	 * The cached value of the '{@link #getRedefinedOperations() <em>Redefined Operation</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRedefinedOperations()
	 * @generated
	 * @ordered
	 */
	protected EList redefinedOperation = null;

	/**
	 * The cached value of the '{@link #getBodyCondition() <em>Body Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBodyCondition()
	 * @generated
	 * @ordered
	 */
	protected Constraint bodyCondition = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OperationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return UML2Package.eINSTANCE.getOperation();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * Returns the value of the '<em><b>Upper Value</b></em>' containment reference.
	 * <p>
	 * Subsets the following features:
	 * <ul>
	 *   <li>{@link org.eclipse.uml2.Element#getOwnedElements}</li>
	 * </ul>
	 * </p>
	 * @generated
	 */
	public ValueSpecification getUpperValue() {
		return upperValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUpperValue(ValueSpecification newUpperValue, NotificationChain msgs) {
		ValueSpecification oldUpperValue = upperValue;
		upperValue = newUpperValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UML2Package.OPERATION__UPPER_VALUE, oldUpperValue, newUpperValue);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUpperValue(ValueSpecification newUpperValue) {
		if (newUpperValue != upperValue) {
			NotificationChain msgs = null;
			if (upperValue != null)
				msgs = ((InternalEObject)upperValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UML2Package.OPERATION__UPPER_VALUE, null, msgs);
			if (newUpperValue != null)
				msgs = ((InternalEObject)newUpperValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UML2Package.OPERATION__UPPER_VALUE, null, msgs);
			msgs = basicSetUpperValue(newUpperValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2Package.OPERATION__UPPER_VALUE, newUpperValue, newUpperValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueSpecification createUpperValue(EClass eClass) {
		ValueSpecification newUpperValue = (ValueSpecification) eClass.getEPackage().getEFactoryInstance().create(eClass);
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.CREATE, UML2Package.OPERATION__UPPER_VALUE, null, newUpperValue));
		}
        setUpperValue(newUpperValue);
		return newUpperValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * Returns the value of the '<em><b>Lower Value</b></em>' containment reference.
	 * <p>
	 * Subsets the following features:
	 * <ul>
	 *   <li>{@link org.eclipse.uml2.Element#getOwnedElements}</li>
	 * </ul>
	 * </p>
	 * @generated
	 */
	public ValueSpecification getLowerValue() {
		return lowerValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLowerValue(ValueSpecification newLowerValue, NotificationChain msgs) {
		ValueSpecification oldLowerValue = lowerValue;
		lowerValue = newLowerValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UML2Package.OPERATION__LOWER_VALUE, oldLowerValue, newLowerValue);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLowerValue(ValueSpecification newLowerValue) {
		if (newLowerValue != lowerValue) {
			NotificationChain msgs = null;
			if (lowerValue != null)
				msgs = ((InternalEObject)lowerValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UML2Package.OPERATION__LOWER_VALUE, null, msgs);
			if (newLowerValue != null)
				msgs = ((InternalEObject)newLowerValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UML2Package.OPERATION__LOWER_VALUE, null, msgs);
			msgs = basicSetLowerValue(newLowerValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2Package.OPERATION__LOWER_VALUE, newLowerValue, newLowerValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueSpecification createLowerValue(EClass eClass) {
		ValueSpecification newLowerValue = (ValueSpecification) eClass.getEPackage().getEFactoryInstance().create(eClass);
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.CREATE, UML2Package.OPERATION__LOWER_VALUE, null, newLowerValue));
		}
        setLowerValue(newLowerValue);
		return newLowerValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * Returns the value of the '<em><b>Template Parameter</b></em>' reference.
	 * @generated
	 */
	public TemplateParameter getTemplateParameter() {
		TemplateParameter templateParameter = basicGetTemplateParameter();
		return templateParameter == null ? null : (TemplateParameter)eResolveProxy((InternalEObject)templateParameter);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * Returns the value of the '<em><b>Template Parameter</b></em>' reference.
	 * @generated
	 */
	public TemplateParameter basicGetTemplateParameter() {
		return templateParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTemplateParameter(TemplateParameter newTemplateParameter, NotificationChain msgs) {
		// TODO: test this superset basic setter
		TemplateParameter oldTemplateParameter = templateParameter;
		templateParameter = newTemplateParameter;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UML2Package.OPERATION__TEMPLATE_PARAMETER, oldTemplateParameter, newTemplateParameter);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		if (null != getOwningParameter() && newTemplateParameter != getOwningParameter()) {
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
		if (newTemplateParameter != templateParameter) {
			NotificationChain msgs = null;
			if (null != templateParameter) {
				msgs = ((InternalEObject) templateParameter).eInverseRemove(this, UML2Package.TEMPLATE_PARAMETER__PARAMETERED_ELEMENT, TemplateParameter.class, msgs);
			}
			if (null != newTemplateParameter) {
				msgs = ((InternalEObject) newTemplateParameter).eInverseAdd(this, UML2Package.TEMPLATE_PARAMETER__PARAMETERED_ELEMENT, TemplateParameter.class, msgs);
			}
			msgs = basicSetTemplateParameter(newTemplateParameter, msgs);
			if (null != msgs) {
				msgs.dispatch();
			}
		} else if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, UML2Package.OPERATION__TEMPLATE_PARAMETER, newTemplateParameter, newTemplateParameter));
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * Returns the value of the '<em><b>Owning Parameter</b></em>' container reference.
	 * <p>
	 * Subsets the following features:
	 * <ul>
	 *   <li>{@link org.eclipse.uml2.ParameterableElement#getTemplateParameter}</li>
	 *   <li>{@link org.eclipse.uml2.Element#getOwner}</li>
	 * </ul>
	 * </p>
	 * @generated
	 */
	public TemplateParameter getOwningParameter() {
		if (eContainerFeatureID != UML2Package.OPERATION__OWNING_PARAMETER) {
			return null;
		}
		return (TemplateParameter) eContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwningParameter(TemplateParameter newOwningParameter) {
		// TODO: test this subset setter
		EObject oldOwningParameter = eContainer;
		if (eContainer != newOwningParameter || (eContainerFeatureID != UML2Package.OPERATION__OWNING_PARAMETER && null != newOwningParameter)) {
			if (EcoreUtil.isAncestor(this, newOwningParameter)) {
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString()); //$NON-NLS-1$
			}
			NotificationChain msgs = null;
			if (null != eContainer) {
				msgs = eBasicRemoveFromContainer(msgs);
			}
			if (null != newOwningParameter) {
				msgs = ((InternalEObject) newOwningParameter).eInverseAdd(this, UML2Package.TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT, TemplateParameter.class, msgs);
			}
			msgs = eBasicSetContainer((InternalEObject) newOwningParameter, UML2Package.OPERATION__OWNING_PARAMETER, msgs);
			if (null != msgs) {
				msgs.dispatch();
			}
		} else if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, UML2Package.OPERATION__OWNING_PARAMETER, newOwningParameter, newOwningParameter));
		}
		if (null != newOwningParameter || oldOwningParameter == basicGetTemplateParameter()) {
			setTemplateParameter(newOwningParameter);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * Returns the value of the '<em><b>Is Query</b></em>' attribute.
	 * @generated
	 */
	public boolean isQuery() {
		return isQuery;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsQuery(boolean newIsQuery) {
		boolean oldIsQuery = isQuery;
		isQuery = newIsQuery;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2Package.OPERATION__IS_QUERY, oldIsQuery, isQuery));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * Returns the value of the '<em><b>Owned Parameter</b></em>' containment reference list.
	 * @generated
	 */
	public EList getOwnedParameters() {
		if (ownedParameter == null) {
			ownedParameter = new EObjectContainmentWithInverseEList(Parameter.class, this, UML2Package.OPERATION__OWNED_PARAMETER, UML2Package.PARAMETER__OPERATION);
		}
		return ownedParameter;
	}

    /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
     */
    public Parameter getOwnedParameter(String unqualifiedName) {
    	for (Iterator i = getOwnedParameters().iterator(); i.hasNext(); ) {
    		Parameter namedOwnedParameter = (Parameter) i.next();
    		
    		if (unqualifiedName.equals(namedOwnedParameter.getName())) {
    			return namedOwnedParameter;
    		}
    	}
    	
    	return null;
    }
      
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parameter createOwnedParameter(EClass eClass) {
		Parameter newOwnedParameter = (Parameter) eClass.getEPackage().getEFactoryInstance().create(eClass);
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.CREATE, UML2Package.OPERATION__OWNED_PARAMETER, null, newOwnedParameter));
		}
		getOwnedParameters().add(newOwnedParameter);
		return newOwnedParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * Returns the value of the '<em><b>Class </b></em>' container reference.
	 * <p>
	 * Subsets the following features:
	 * <ul>
	 *   <li>{@link org.eclipse.uml2.NamedElement#getNamespace}</li>
	 *   <li>{@link org.eclipse.uml2.Feature#getFeaturingClassifiers}</li>
	 *   <li>{@link org.eclipse.uml2.RedefinableElement#getRedefinitionContexts}</li>
	 * </ul>
	 * </p>
	 * @generated
	 */
	public org.eclipse.uml2.Class getClass_() {
		if (eContainerFeatureID != UML2Package.OPERATION__CLASS_) return null;
		return (org.eclipse.uml2.Class)eContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClass_(org.eclipse.uml2.Class newClass_) {
		if (newClass_ != eContainer || (eContainerFeatureID != UML2Package.OPERATION__CLASS_ && newClass_ != null)) {
			if (EcoreUtil.isAncestor(this, newClass_))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString()); //$NON-NLS-1$
			NotificationChain msgs = null;
			if (eContainer != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newClass_ != null)
				msgs = ((InternalEObject)newClass_).eInverseAdd(this, UML2Package.CLASS__OWNED_OPERATION, org.eclipse.uml2.Class.class, msgs);
			msgs = eBasicSetContainer((InternalEObject)newClass_, UML2Package.OPERATION__CLASS_, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2Package.OPERATION__CLASS_, newClass_, newClass_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * Returns the value of the '<em><b>Datatype</b></em>' container reference.
	 * <p>
	 * Subsets the following features:
	 * <ul>
	 *   <li>{@link org.eclipse.uml2.NamedElement#getNamespace}</li>
	 *   <li>{@link org.eclipse.uml2.Feature#getFeaturingClassifiers}</li>
	 *   <li>{@link org.eclipse.uml2.RedefinableElement#getRedefinitionContexts}</li>
	 * </ul>
	 * </p>
	 * @generated
	 */
	public DataType getDatatype() {
		if (eContainerFeatureID != UML2Package.OPERATION__DATATYPE) return null;
		return (DataType)eContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDatatype(DataType newDatatype) {
		if (newDatatype != eContainer || (eContainerFeatureID != UML2Package.OPERATION__DATATYPE && newDatatype != null)) {
			if (EcoreUtil.isAncestor(this, newDatatype))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString()); //$NON-NLS-1$
			NotificationChain msgs = null;
			if (eContainer != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newDatatype != null)
				msgs = ((InternalEObject)newDatatype).eInverseAdd(this, UML2Package.DATA_TYPE__OWNED_OPERATION, DataType.class, msgs);
			msgs = eBasicSetContainer((InternalEObject)newDatatype, UML2Package.OPERATION__DATATYPE, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2Package.OPERATION__DATATYPE, newDatatype, newDatatype));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * Returns the value of the '<em><b>Precondition</b></em>' containment reference list.
	 * <p>
	 * Subsets the following features:
	 * <ul>
	 *   <li>{@link org.eclipse.uml2.Namespace#getOwnedMembers}</li>
	 * </ul>
	 * </p>
	 * @generated
	 */
	public EList getPreconditions() {
		if (precondition == null) {
			precondition = new EObjectContainmentEList(Constraint.class, this, UML2Package.OPERATION__PRECONDITION);
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
	public Constraint createPrecondition(EClass eClass) {
		Constraint newPrecondition = (Constraint) eClass.getEPackage().getEFactoryInstance().create(eClass);
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.CREATE, UML2Package.OPERATION__PRECONDITION, null, newPrecondition));
		}
		getPreconditions().add(newPrecondition);
		return newPrecondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * Returns the value of the '<em><b>Postcondition</b></em>' containment reference list.
	 * <p>
	 * Subsets the following features:
	 * <ul>
	 *   <li>{@link org.eclipse.uml2.Namespace#getOwnedMembers}</li>
	 * </ul>
	 * </p>
	 * @generated
	 */
	public EList getPostconditions() {
		if (postcondition == null) {
			postcondition = new EObjectContainmentEList(Constraint.class, this, UML2Package.OPERATION__POSTCONDITION);
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
	public Constraint createPostcondition(EClass eClass) {
		Constraint newPostcondition = (Constraint) eClass.getEPackage().getEFactoryInstance().create(eClass);
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.CREATE, UML2Package.OPERATION__POSTCONDITION, null, newPostcondition));
		}
		getPostconditions().add(newPostcondition);
		return newPostcondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * Returns the value of the '<em><b>Redefined Operation</b></em>' reference list.
	 * <p>
	 * Subsets the following features:
	 * <ul>
	 *   <li>{@link org.eclipse.uml2.RedefinableElement#getRedefinedElements}</li>
	 * </ul>
	 * </p>
	 * @generated
	 */
	public EList getRedefinedOperations() {
		if (redefinedOperation == null) {
			redefinedOperation = new EObjectResolvingEList(Operation.class, this, UML2Package.OPERATION__REDEFINED_OPERATION);
		}
		return redefinedOperation;
	}

    /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
     */
    public Operation getRedefinedOperation(String unqualifiedName) {
    	for (Iterator i = getRedefinedOperations().iterator(); i.hasNext(); ) {
    		Operation namedRedefinedOperation = (Operation) i.next();
    		
    		if (unqualifiedName.equals(namedRedefinedOperation.getName())) {
    			return namedRedefinedOperation;
    		}
    	}
    	
    	return null;
    }
      
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * Returns the value of the '<em><b>Body Condition</b></em>' containment reference.
	 * <p>
	 * Subsets the following features:
	 * <ul>
	 *   <li>{@link org.eclipse.uml2.Namespace#getOwnedMembers}</li>
	 * </ul>
	 * </p>
	 * @generated
	 */
	public Constraint getBodyCondition() {
		return bodyCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBodyCondition(Constraint newBodyCondition, NotificationChain msgs) {
		Constraint oldBodyCondition = bodyCondition;
		bodyCondition = newBodyCondition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UML2Package.OPERATION__BODY_CONDITION, oldBodyCondition, newBodyCondition);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBodyCondition(Constraint newBodyCondition) {
		if (newBodyCondition != bodyCondition) {
			NotificationChain msgs = null;
			if (bodyCondition != null)
				msgs = ((InternalEObject)bodyCondition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UML2Package.OPERATION__BODY_CONDITION, null, msgs);
			if (newBodyCondition != null)
				msgs = ((InternalEObject)newBodyCondition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UML2Package.OPERATION__BODY_CONDITION, null, msgs);
			msgs = basicSetBodyCondition(newBodyCondition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2Package.OPERATION__BODY_CONDITION, newBodyCondition, newBodyCondition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Constraint createBodyCondition(EClass eClass) {
		Constraint newBodyCondition = (Constraint) eClass.getEPackage().getEFactoryInstance().create(eClass);
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.CREATE, UML2Package.OPERATION__BODY_CONDITION, null, newBodyCondition));
		}
        setBodyCondition(newBodyCondition);
		return newBodyCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int lowerBound() {
		// TODO: test this OCL operation
		return org.eclipse.uml2.internal.operation.MultiplicityElementOperations.lowerBound(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int upperBound() {
		// TODO: test this OCL operation
		return org.eclipse.uml2.internal.operation.MultiplicityElementOperations.upperBound(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isMultivalued() {
		// TODO: test this OCL operation
		return org.eclipse.uml2.internal.operation.MultiplicityElementOperations.isMultivalued(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean includesCardinality(int C) {
		// TODO: test this OCL operation
		return org.eclipse.uml2.internal.operation.MultiplicityElementOperations.includesCardinality(this, C);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean includesMultiplicity(MultiplicityElement M) {
		// TODO: test this OCL operation
		return org.eclipse.uml2.internal.operation.MultiplicityElementOperations.includesMultiplicity(this, M);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUpperGt0(DiagnosticChain diagnostics, Map context) {
		// TODO: test this OCL constraint
		return org.eclipse.uml2.internal.operation.MultiplicityElementOperations.validateUpperGt0(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLowerGe0(DiagnosticChain diagnostics, Map context) {
		// TODO: test this OCL constraint
		return org.eclipse.uml2.internal.operation.MultiplicityElementOperations.validateLowerGe0(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUpperGeLower(DiagnosticChain diagnostics, Map context) {
		// TODO: test this OCL constraint
		return org.eclipse.uml2.internal.operation.MultiplicityElementOperations.validateUpperGeLower(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLowerEqLowerbound(DiagnosticChain diagnostics, Map context) {
		// TODO: test this OCL constraint
		return org.eclipse.uml2.internal.operation.MultiplicityElementOperations.validateLowerEqLowerbound(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUpperEqUpperbound(DiagnosticChain diagnostics, Map context) {
		// TODO: test this OCL constraint
		return org.eclipse.uml2.internal.operation.MultiplicityElementOperations.validateUpperEqUpperbound(this, diagnostics, context);
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
			if (null != getUpperValue()) {
				union.add(getUpperValue());
			}
			if (null != getLowerValue()) {
				union.add(getLowerValue());
			}
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
	 * Returns the value of the '<em><b>Owner</b></em>' reference, a derived union.
	 * It is bidirectional and its opposite is '{@link org.eclipse.uml2.Element#getOwnedElements <em>Owned Element</em>}'.
	 * @generated
	 */
	public Element basicGetOwner() {
		// TODO: test this union basic getter
		if (null != getOwningParameter()) {
			return (Element) getOwningParameter();
		}
		return super.basicGetOwner();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTypeOfResult(DiagnosticChain diagnostics, Map context) {
		// TODO: test this OCL constraint
		return org.eclipse.uml2.internal.operation.OperationOperations.validateTypeOfResult(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isOrdered() {
		// TODO: test this OCL operation
		return org.eclipse.uml2.internal.operation.OperationOperations.isOrdered(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isUnique() {
		// TODO: test this OCL operation
		return org.eclipse.uml2.internal.operation.OperationOperations.isUnique(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int lower() {
		// TODO: test this OCL operation
		return org.eclipse.uml2.internal.operation.OperationOperations.lower(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int upper() {
		// TODO: test this OCL operation
		return org.eclipse.uml2.internal.operation.OperationOperations.upper(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Classifier type() {
		// TODO: test this OCL operation
		return org.eclipse.uml2.internal.operation.OperationOperations.type(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOnlyBodyForQuery(DiagnosticChain diagnostics, Map context) {
		// TODO: test this OCL constraint
		return org.eclipse.uml2.internal.operation.OperationOperations.validateOnlyBodyForQuery(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isConsistentWith(RedefinableElement redefinee) {
		// TODO: test this OCL operation
		return org.eclipse.uml2.internal.operation.OperationOperations.isConsistentWith(this, redefinee);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsOrderedGen(boolean newIsOrdered) {
		// TODO: test this derived redefinition setter
	}

	public void setIsOrdered(boolean newIsOrdered) {

		if (1 == getReturnResults().size()) {
			((Parameter) getReturnResults().get(0)).setIsOrdered(newIsOrdered);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsUniqueGen(boolean newIsUnique) {
		// TODO: test this derived redefinition setter
	}

	public void setIsUnique(boolean newIsUnique) {

		if (1 == getReturnResults().size()) {
			((Parameter) getReturnResults().get(0)).setIsUnique(newIsUnique);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * Returns the derived value of the '<em><b>Lower</b></em>' attribute.
	 * <p>
	 * Redefines the following features:
	 * <ul>
	 *   <li>{@link org.eclipse.uml2.MultiplicityElement#getLower}</li>
	 * </ul>
	 * </p>
	 * @generated
	 */
	public int getLowerGen() {
		// TODO: implement this derived redefinition getter
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	public int getLower() {
		// TODO: test this derived redefinition getter
		return lower();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * Returns the derived value of the '<em><b>Upper</b></em>' attribute.
	 * <p>
	 * Redefines the following features:
	 * <ul>
	 *   <li>{@link org.eclipse.uml2.MultiplicityElement#getUpper}</li>
	 * </ul>
	 * </p>
	 * @generated
	 */
	public int getUpperGen() {
		// TODO: implement this derived redefinition getter
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	public int getUpper() {
		// TODO: test this derived redefinition getter
		return upper();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * Returns the value of the '<em><b>Raised Exception</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.Type}.
	 * <p>
	 * Redefines the following features:
	 * <ul>
	 *   <li>{@link org.eclipse.uml2.BehavioralFeature#getRaisedExceptions}</li>
	 * </ul>
	 * </p>
	 * @generated
	 */
	public EList getRaisedExceptionsGen() {
		// TODO: implement this redefinition getter
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	public EList getRaisedExceptions() {
		// TODO: test this redefinition getter
		if (raisedException == null) {
			raisedException = new EObjectResolvingEList(Type.class, this, UML2Package.OPERATION__RAISED_EXCEPTION);
		}
		return raisedException;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * Returns the value of the '<em><b>Formal Parameter</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2.Parameter}.
	 * <p>
	 * Redefines the following features:
	 * <ul>
	 *   <li>{@link org.eclipse.uml2.Operation#getOwnedParameters}</li>
	 *   <li>{@link org.eclipse.uml2.BehavioralFeature#getFormalParameters}</li>
	 * </ul>
	 * </p>
	 * @generated
	 */
	public EList getFormalParametersGen() {
		// TODO: implement this redefinition getter
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	public EList getFormalParameters() {
		// TODO: test this redefinition getter
		return getOwnedParameters();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * Returns the derived value of the '<em><b>Type</b></em>' reference.
	 * <p>
	 * Redefines the following features:
	 * <ul>
	 *   <li>{@link org.eclipse.uml2.TypedElement#getType}</li>
	 * </ul>
	 * </p>
	 * @generated
	 */
	public Type basicGetTypeGen() {
		// TODO: implement this derived redefinition basic getter
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	public Type basicGetType() {
		// TODO: test this derived redefinition basic getter
		return type();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * Returns the derived value of the '<em><b>Type</b></em>' reference.
	 * <p>
	 * Redefines the following features:
	 * <ul>
	 *   <li>{@link org.eclipse.uml2.TypedElement#getType}</li>
	 * </ul>
	 * </p>
	 * @generated
	 */
	public Type getTypeGen() {
		// TODO: implement this derived redefinition getter
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	public Type getType() {
		// TODO: test this derived redefinition getter
		return type();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeGen(Type newType) {
		// TODO: test this derived redefinition setter
	}

	public void setType(Type newType) {
		
		if (1 == getReturnResults().size()) {
			((Parameter) getReturnResults().get(0)).setType(newType);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * Returns the value of the '<em><b>Redefinition Context</b></em>' reference list, a derived union.
	 * The list contents are of type {@link org.eclipse.uml2.Classifier}.
	 * @generated
	 */
	public EList getRedefinitionContexts() {
		// TODO: test this union getter
		if (!getCacheAdapter().containsKey(this, UML2Package.eINSTANCE.getRedefinableElement_RedefinitionContext())) {
			Set union = new LinkedHashSet();
			union.addAll(super.getRedefinitionContexts());
			if (null != getClass_()) {
				union.add(getClass_());
			}
			if (null != getDatatype()) {
				union.add(getDatatype());
			}
			getCacheAdapter().put(
				this,
				UML2Package.eINSTANCE.getRedefinableElement_RedefinitionContext(),
				new EcoreEList.UnmodifiableEList(this, 
					UML2Package.eINSTANCE.getRedefinableElement_RedefinitionContext(),
					union.size(),
					union.toArray()));
		}
		return (EList) getCacheAdapter().get(this, UML2Package.eINSTANCE.getRedefinableElement_RedefinitionContext());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * Returns the value of the '<em><b>Namespace</b></em>' reference, a derived union.
	 * It is bidirectional and its opposite is '{@link org.eclipse.uml2.Namespace#getOwnedMembers <em>Owned Member</em>}'.
	 * @generated
	 */
	public Namespace getNamespace() {
		// TODO: test this union getter
		if (null != getClass_()) {
			return (Namespace) getClass_();
		}
		if (null != getDatatype()) {
			return (Namespace) getDatatype();
		}
		return super.getNamespace();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * Returns the value of the '<em><b>Featuring Classifier</b></em>' reference list, a derived union.
	 * The list contents are of type {@link org.eclipse.uml2.Classifier}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.uml2.Classifier#getFeatures <em>Feature</em>}'.
	 * @generated
	 */
	public EList getFeaturingClassifiers() {
		// TODO: test this union getter
		if (!getCacheAdapter().containsKey(this, UML2Package.eINSTANCE.getFeature_FeaturingClassifier())) {
			Set union = new LinkedHashSet();
			union.addAll(super.getFeaturingClassifiers());
			if (null != getClass_()) {
				union.add(getClass_());
			}
			if (null != getDatatype()) {
				union.add(getDatatype());
			}
			getCacheAdapter().put(
				this,
				UML2Package.eINSTANCE.getFeature_FeaturingClassifier(),
				new EcoreEList.UnmodifiableEList(this, 
					UML2Package.eINSTANCE.getFeature_FeaturingClassifier(),
					union.size(),
					union.toArray()));
		}
		return (EList) getCacheAdapter().get(this, UML2Package.eINSTANCE.getFeature_FeaturingClassifier());
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
		if (!getCacheAdapter().containsKey(this, UML2Package.eINSTANCE.getOperation().getEAllOperations().get(81))) {
			Set union = new LinkedHashSet();
			union.addAll(super.getOwnedMembers());
			union.addAll(getPreconditions());
			union.addAll(getPostconditions());
			if (null != getBodyCondition()) {
				union.add(getBodyCondition());
			}
			getCacheAdapter().put(
				this,
				UML2Package.eINSTANCE.getOperation().getEAllOperations().get(81),
				new BasicEList.UnmodifiableEList(union.size(), union.toArray()));
		}
		return (EList) getCacheAdapter().get(this, UML2Package.eINSTANCE.getOperation().getEAllOperations().get(81));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * Returns the value of the '<em><b>Redefined Element</b></em>' reference list, a derived union.
	 * The list contents are of type {@link org.eclipse.uml2.RedefinableElement}.
	 * @generated
	 */
	public EList getRedefinedElements() {
		// TODO: test this union getter
		if (!getCacheAdapter().containsKey(this, UML2Package.eINSTANCE.getOperation().getEAllOperations().get(82))) {
			Set union = new LinkedHashSet();
			union.addAll(super.getRedefinedElements());
			union.addAll(getRedefinedOperations());
			getCacheAdapter().put(
				this,
				UML2Package.eINSTANCE.getOperation().getEAllOperations().get(82),
				new BasicEList.UnmodifiableEList(union.size(), union.toArray()));
		}
		return (EList) getCacheAdapter().get(this, UML2Package.eINSTANCE.getOperation().getEAllOperations().get(82));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, Class baseClass, NotificationChain msgs) {
		if (featureID >= 0) {
			switch (eDerivedStructuralFeatureID(featureID, baseClass)) {
				case UML2Package.OPERATION__EANNOTATIONS:
					return ((InternalEList)getEAnnotations()).basicAdd(otherEnd, msgs);
				case UML2Package.OPERATION__TEMPLATE_BINDING:
					return ((InternalEList)getTemplateBindings()).basicAdd(otherEnd, msgs);
				case UML2Package.OPERATION__OWNED_TEMPLATE_SIGNATURE:
					if (ownedTemplateSignature != null)
						msgs = ((InternalEObject)ownedTemplateSignature).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UML2Package.OPERATION__OWNED_TEMPLATE_SIGNATURE, null, msgs);
					return basicSetOwnedTemplateSignature((TemplateSignature)otherEnd, msgs);
				case UML2Package.OPERATION__CLIENT_DEPENDENCY:
					return ((InternalEList)getClientDependencies()).basicAdd(otherEnd, msgs);
				case UML2Package.OPERATION__OWNED_RULE:
					return ((InternalEList)getOwnedRules()).basicAdd(otherEnd, msgs);
				case UML2Package.OPERATION__ELEMENT_IMPORT:
					return ((InternalEList)getElementImports()).basicAdd(otherEnd, msgs);
				case UML2Package.OPERATION__PACKAGE_IMPORT:
					return ((InternalEList)getPackageImports()).basicAdd(otherEnd, msgs);
				case UML2Package.OPERATION__METHOD:
					return ((InternalEList)getMethods()).basicAdd(otherEnd, msgs);
				case UML2Package.OPERATION__TEMPLATE_PARAMETER:
					if (templateParameter != null)
						msgs = ((InternalEObject)templateParameter).eInverseRemove(this, UML2Package.TEMPLATE_PARAMETER__PARAMETERED_ELEMENT, TemplateParameter.class, msgs);
					return basicSetTemplateParameter((TemplateParameter)otherEnd, msgs);
				case UML2Package.OPERATION__OWNING_PARAMETER:
					if (eContainer != null)
						msgs = eBasicRemoveFromContainer(msgs);
					return eBasicSetContainer(otherEnd, UML2Package.OPERATION__OWNING_PARAMETER, msgs);
				case UML2Package.OPERATION__OWNED_PARAMETER:
					return ((InternalEList)getOwnedParameters()).basicAdd(otherEnd, msgs);
				case UML2Package.OPERATION__CLASS_:
					if (eContainer != null)
						msgs = eBasicRemoveFromContainer(msgs);
					return eBasicSetContainer(otherEnd, UML2Package.OPERATION__CLASS_, msgs);
				case UML2Package.OPERATION__DATATYPE:
					if (eContainer != null)
						msgs = eBasicRemoveFromContainer(msgs);
					return eBasicSetContainer(otherEnd, UML2Package.OPERATION__DATATYPE, msgs);
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
				case UML2Package.OPERATION__EANNOTATIONS:
					return ((InternalEList)getEAnnotations()).basicRemove(otherEnd, msgs);
				case UML2Package.OPERATION__OWNED_COMMENT:
					return ((InternalEList)getOwnedComments()).basicRemove(otherEnd, msgs);
				case UML2Package.OPERATION__TEMPLATE_BINDING:
					return ((InternalEList)getTemplateBindings()).basicRemove(otherEnd, msgs);
				case UML2Package.OPERATION__OWNED_TEMPLATE_SIGNATURE:
					return basicSetOwnedTemplateSignature(null, msgs);
				case UML2Package.OPERATION__CLIENT_DEPENDENCY:
					return ((InternalEList)getClientDependencies()).basicRemove(otherEnd, msgs);
				case UML2Package.OPERATION__NAME_EXPRESSION:
					return basicSetNameExpression(null, msgs);
				case UML2Package.OPERATION__OWNED_RULE:
					return ((InternalEList)getOwnedRules()).basicRemove(otherEnd, msgs);
				case UML2Package.OPERATION__ELEMENT_IMPORT:
					return ((InternalEList)getElementImports()).basicRemove(otherEnd, msgs);
				case UML2Package.OPERATION__PACKAGE_IMPORT:
					return ((InternalEList)getPackageImports()).basicRemove(otherEnd, msgs);
				case UML2Package.OPERATION__FORMAL_PARAMETER:
					return ((InternalEList)getFormalParameters()).basicRemove(otherEnd, msgs);
				case UML2Package.OPERATION__RETURN_RESULT:
					return ((InternalEList)getReturnResults()).basicRemove(otherEnd, msgs);
				case UML2Package.OPERATION__METHOD:
					return ((InternalEList)getMethods()).basicRemove(otherEnd, msgs);
				case UML2Package.OPERATION__UPPER_VALUE:
					return basicSetUpperValue(null, msgs);
				case UML2Package.OPERATION__LOWER_VALUE:
					return basicSetLowerValue(null, msgs);
				case UML2Package.OPERATION__TEMPLATE_PARAMETER:
					return basicSetTemplateParameter(null, msgs);
				case UML2Package.OPERATION__OWNING_PARAMETER:
					return eBasicSetContainer(null, UML2Package.OPERATION__OWNING_PARAMETER, msgs);
				case UML2Package.OPERATION__OWNED_PARAMETER:
					return ((InternalEList)getOwnedParameters()).basicRemove(otherEnd, msgs);
				case UML2Package.OPERATION__CLASS_:
					return eBasicSetContainer(null, UML2Package.OPERATION__CLASS_, msgs);
				case UML2Package.OPERATION__DATATYPE:
					return eBasicSetContainer(null, UML2Package.OPERATION__DATATYPE, msgs);
				case UML2Package.OPERATION__PRECONDITION:
					return ((InternalEList)getPreconditions()).basicRemove(otherEnd, msgs);
				case UML2Package.OPERATION__POSTCONDITION:
					return ((InternalEList)getPostconditions()).basicRemove(otherEnd, msgs);
				case UML2Package.OPERATION__BODY_CONDITION:
					return basicSetBodyCondition(null, msgs);
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
				case UML2Package.OPERATION__OWNING_PARAMETER:
					return eContainer.eInverseRemove(this, UML2Package.TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT, TemplateParameter.class, msgs);
				case UML2Package.OPERATION__CLASS_:
					return eContainer.eInverseRemove(this, UML2Package.CLASS__OWNED_OPERATION, org.eclipse.uml2.Class.class, msgs);
				case UML2Package.OPERATION__DATATYPE:
					return eContainer.eInverseRemove(this, UML2Package.DATA_TYPE__OWNED_OPERATION, DataType.class, msgs);
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
			case UML2Package.OPERATION__EANNOTATIONS:
				return getEAnnotations();
			case UML2Package.OPERATION__OWNED_ELEMENT:
				return getOwnedElements();
			case UML2Package.OPERATION__OWNER:
				if (resolve) return getOwner();
				return basicGetOwner();
			case UML2Package.OPERATION__OWNED_COMMENT:
				return getOwnedComments();
			case UML2Package.OPERATION__TEMPLATE_BINDING:
				return getTemplateBindings();
			case UML2Package.OPERATION__OWNED_TEMPLATE_SIGNATURE:
				return getOwnedTemplateSignature();
			case UML2Package.OPERATION__NAME:
				return getName();
			case UML2Package.OPERATION__QUALIFIED_NAME:
				return getQualifiedName();
			case UML2Package.OPERATION__VISIBILITY:
				return getVisibility();
			case UML2Package.OPERATION__CLIENT_DEPENDENCY:
				return getClientDependencies();
			case UML2Package.OPERATION__NAME_EXPRESSION:
				return getNameExpression();
			case UML2Package.OPERATION__MEMBER:
				return getMembers();
			case UML2Package.OPERATION__OWNED_RULE:
				return getOwnedRules();
			case UML2Package.OPERATION__IMPORTED_MEMBER:
				return getImportedMembers();
			case UML2Package.OPERATION__ELEMENT_IMPORT:
				return getElementImports();
			case UML2Package.OPERATION__PACKAGE_IMPORT:
				return getPackageImports();
			case UML2Package.OPERATION__REDEFINITION_CONTEXT:
				return getRedefinitionContexts();
			case UML2Package.OPERATION__IS_LEAF:
				return isLeaf() ? Boolean.TRUE : Boolean.FALSE;
			case UML2Package.OPERATION__FEATURING_CLASSIFIER:
				return getFeaturingClassifiers();
			case UML2Package.OPERATION__IS_STATIC:
				return isStatic() ? Boolean.TRUE : Boolean.FALSE;
			case UML2Package.OPERATION__PARAMETER:
				return getParameters();
			case UML2Package.OPERATION__FORMAL_PARAMETER:
				return getFormalParameters();
			case UML2Package.OPERATION__RETURN_RESULT:
				return getReturnResults();
			case UML2Package.OPERATION__RAISED_EXCEPTION:
				return getRaisedExceptions();
			case UML2Package.OPERATION__IS_ABSTRACT:
				return isAbstract() ? Boolean.TRUE : Boolean.FALSE;
			case UML2Package.OPERATION__METHOD:
				return getMethods();
			case UML2Package.OPERATION__CONCURRENCY:
				return getConcurrency();
			case UML2Package.OPERATION__TYPE:
				if (resolve) return getType();
				return basicGetType();
			case UML2Package.OPERATION__IS_ORDERED:
				return isOrdered() ? Boolean.TRUE : Boolean.FALSE;
			case UML2Package.OPERATION__IS_UNIQUE:
				return isUnique() ? Boolean.TRUE : Boolean.FALSE;
			case UML2Package.OPERATION__LOWER:
				return new Integer(getLower());
			case UML2Package.OPERATION__UPPER:
				return new Integer(getUpper());
			case UML2Package.OPERATION__UPPER_VALUE:
				return getUpperValue();
			case UML2Package.OPERATION__LOWER_VALUE:
				return getLowerValue();
			case UML2Package.OPERATION__TEMPLATE_PARAMETER:
				if (resolve) return getTemplateParameter();
				return basicGetTemplateParameter();
			case UML2Package.OPERATION__OWNING_PARAMETER:
				return getOwningParameter();
			case UML2Package.OPERATION__OWNED_PARAMETER:
				return getOwnedParameters();
			case UML2Package.OPERATION__CLASS_:
				return getClass_();
			case UML2Package.OPERATION__IS_QUERY:
				return isQuery() ? Boolean.TRUE : Boolean.FALSE;
			case UML2Package.OPERATION__DATATYPE:
				return getDatatype();
			case UML2Package.OPERATION__PRECONDITION:
				return getPreconditions();
			case UML2Package.OPERATION__POSTCONDITION:
				return getPostconditions();
			case UML2Package.OPERATION__REDEFINED_OPERATION:
				return getRedefinedOperations();
			case UML2Package.OPERATION__BODY_CONDITION:
				return getBodyCondition();
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
			case UML2Package.OPERATION__EANNOTATIONS:
				getEAnnotations().clear();
				getEAnnotations().addAll((Collection)newValue);
				return;
			case UML2Package.OPERATION__OWNED_COMMENT:
				getOwnedComments().clear();
				getOwnedComments().addAll((Collection)newValue);
				return;
			case UML2Package.OPERATION__TEMPLATE_BINDING:
				getTemplateBindings().clear();
				getTemplateBindings().addAll((Collection)newValue);
				return;
			case UML2Package.OPERATION__OWNED_TEMPLATE_SIGNATURE:
				setOwnedTemplateSignature((TemplateSignature)newValue);
				return;
			case UML2Package.OPERATION__NAME:
				setName((String)newValue);
				return;
			case UML2Package.OPERATION__VISIBILITY:
				setVisibility((VisibilityKind)newValue);
				return;
			case UML2Package.OPERATION__CLIENT_DEPENDENCY:
				getClientDependencies().clear();
				getClientDependencies().addAll((Collection)newValue);
				return;
			case UML2Package.OPERATION__NAME_EXPRESSION:
				setNameExpression((StringExpression)newValue);
				return;
			case UML2Package.OPERATION__OWNED_RULE:
				getOwnedRules().clear();
				getOwnedRules().addAll((Collection)newValue);
				return;
			case UML2Package.OPERATION__ELEMENT_IMPORT:
				getElementImports().clear();
				getElementImports().addAll((Collection)newValue);
				return;
			case UML2Package.OPERATION__PACKAGE_IMPORT:
				getPackageImports().clear();
				getPackageImports().addAll((Collection)newValue);
				return;
			case UML2Package.OPERATION__IS_LEAF:
				setIsLeaf(((Boolean)newValue).booleanValue());
				return;
			case UML2Package.OPERATION__IS_STATIC:
				setIsStatic(((Boolean)newValue).booleanValue());
				return;
			case UML2Package.OPERATION__FORMAL_PARAMETER:
				getFormalParameters().clear();
				getFormalParameters().addAll((Collection)newValue);
				return;
			case UML2Package.OPERATION__RETURN_RESULT:
				getReturnResults().clear();
				getReturnResults().addAll((Collection)newValue);
				return;
			case UML2Package.OPERATION__RAISED_EXCEPTION:
				getRaisedExceptions().clear();
				getRaisedExceptions().addAll((Collection)newValue);
				return;
			case UML2Package.OPERATION__IS_ABSTRACT:
				setIsAbstract(((Boolean)newValue).booleanValue());
				return;
			case UML2Package.OPERATION__METHOD:
				getMethods().clear();
				getMethods().addAll((Collection)newValue);
				return;
			case UML2Package.OPERATION__CONCURRENCY:
				setConcurrency((CallConcurrencyKind)newValue);
				return;
			case UML2Package.OPERATION__TYPE:
				setType((Type)newValue);
				return;
			case UML2Package.OPERATION__IS_ORDERED:
				setIsOrdered(((Boolean)newValue).booleanValue());
				return;
			case UML2Package.OPERATION__IS_UNIQUE:
				setIsUnique(((Boolean)newValue).booleanValue());
				return;
			case UML2Package.OPERATION__UPPER_VALUE:
				setUpperValue((ValueSpecification)newValue);
				return;
			case UML2Package.OPERATION__LOWER_VALUE:
				setLowerValue((ValueSpecification)newValue);
				return;
			case UML2Package.OPERATION__TEMPLATE_PARAMETER:
				setTemplateParameter((TemplateParameter)newValue);
				return;
			case UML2Package.OPERATION__OWNING_PARAMETER:
				setOwningParameter((TemplateParameter)newValue);
				return;
			case UML2Package.OPERATION__OWNED_PARAMETER:
				getOwnedParameters().clear();
				getOwnedParameters().addAll((Collection)newValue);
				return;
			case UML2Package.OPERATION__CLASS_:
				setClass_((org.eclipse.uml2.Class)newValue);
				return;
			case UML2Package.OPERATION__IS_QUERY:
				setIsQuery(((Boolean)newValue).booleanValue());
				return;
			case UML2Package.OPERATION__DATATYPE:
				setDatatype((DataType)newValue);
				return;
			case UML2Package.OPERATION__PRECONDITION:
				getPreconditions().clear();
				getPreconditions().addAll((Collection)newValue);
				return;
			case UML2Package.OPERATION__POSTCONDITION:
				getPostconditions().clear();
				getPostconditions().addAll((Collection)newValue);
				return;
			case UML2Package.OPERATION__REDEFINED_OPERATION:
				getRedefinedOperations().clear();
				getRedefinedOperations().addAll((Collection)newValue);
				return;
			case UML2Package.OPERATION__BODY_CONDITION:
				setBodyCondition((Constraint)newValue);
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
			case UML2Package.OPERATION__EANNOTATIONS:
				getEAnnotations().clear();
				return;
			case UML2Package.OPERATION__OWNED_COMMENT:
				getOwnedComments().clear();
				return;
			case UML2Package.OPERATION__TEMPLATE_BINDING:
				getTemplateBindings().clear();
				return;
			case UML2Package.OPERATION__OWNED_TEMPLATE_SIGNATURE:
				setOwnedTemplateSignature((TemplateSignature)null);
				return;
			case UML2Package.OPERATION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case UML2Package.OPERATION__VISIBILITY:
				setVisibility(VISIBILITY_EDEFAULT);
				return;
			case UML2Package.OPERATION__CLIENT_DEPENDENCY:
				getClientDependencies().clear();
				return;
			case UML2Package.OPERATION__NAME_EXPRESSION:
				setNameExpression((StringExpression)null);
				return;
			case UML2Package.OPERATION__OWNED_RULE:
				getOwnedRules().clear();
				return;
			case UML2Package.OPERATION__ELEMENT_IMPORT:
				getElementImports().clear();
				return;
			case UML2Package.OPERATION__PACKAGE_IMPORT:
				getPackageImports().clear();
				return;
			case UML2Package.OPERATION__IS_LEAF:
				setIsLeaf(IS_LEAF_EDEFAULT);
				return;
			case UML2Package.OPERATION__IS_STATIC:
				setIsStatic(IS_STATIC_EDEFAULT);
				return;
			case UML2Package.OPERATION__FORMAL_PARAMETER:
				getFormalParameters().clear();
				return;
			case UML2Package.OPERATION__RETURN_RESULT:
				getReturnResults().clear();
				return;
			case UML2Package.OPERATION__RAISED_EXCEPTION:
				getRaisedExceptions().clear();
				return;
			case UML2Package.OPERATION__IS_ABSTRACT:
				setIsAbstract(IS_ABSTRACT_EDEFAULT);
				return;
			case UML2Package.OPERATION__METHOD:
				getMethods().clear();
				return;
			case UML2Package.OPERATION__CONCURRENCY:
				setConcurrency(CONCURRENCY_EDEFAULT);
				return;
			case UML2Package.OPERATION__TYPE:
				setType(null);
				return;
			case UML2Package.OPERATION__IS_ORDERED:
				setIsOrdered(false);
				return;
			case UML2Package.OPERATION__IS_UNIQUE:
				setIsUnique(true);
				return;
			case UML2Package.OPERATION__UPPER_VALUE:
				setUpperValue((ValueSpecification)null);
				return;
			case UML2Package.OPERATION__LOWER_VALUE:
				setLowerValue((ValueSpecification)null);
				return;
			case UML2Package.OPERATION__TEMPLATE_PARAMETER:
				setTemplateParameter((TemplateParameter)null);
				return;
			case UML2Package.OPERATION__OWNING_PARAMETER:
				setOwningParameter(null);
				return;
			case UML2Package.OPERATION__OWNED_PARAMETER:
				getOwnedParameters().clear();
				return;
			case UML2Package.OPERATION__CLASS_:
				setClass_((org.eclipse.uml2.Class)null);
				return;
			case UML2Package.OPERATION__IS_QUERY:
				setIsQuery(IS_QUERY_EDEFAULT);
				return;
			case UML2Package.OPERATION__DATATYPE:
				setDatatype((DataType)null);
				return;
			case UML2Package.OPERATION__PRECONDITION:
				getPreconditions().clear();
				return;
			case UML2Package.OPERATION__POSTCONDITION:
				getPostconditions().clear();
				return;
			case UML2Package.OPERATION__REDEFINED_OPERATION:
				getRedefinedOperations().clear();
				return;
			case UML2Package.OPERATION__BODY_CONDITION:
				setBodyCondition((Constraint)null);
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
			case UML2Package.OPERATION__EANNOTATIONS:
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UML2Package.OPERATION__OWNED_ELEMENT:
				return !getOwnedElements().isEmpty();
			case UML2Package.OPERATION__OWNER:
				return basicGetOwner() != null;
			case UML2Package.OPERATION__OWNED_COMMENT:
				return ownedComment != null && !ownedComment.isEmpty();
			case UML2Package.OPERATION__TEMPLATE_BINDING:
				return templateBinding != null && !templateBinding.isEmpty();
			case UML2Package.OPERATION__OWNED_TEMPLATE_SIGNATURE:
				return ownedTemplateSignature != null;
			case UML2Package.OPERATION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case UML2Package.OPERATION__QUALIFIED_NAME:
				return !"".equals(getQualifiedName()); //$NON-NLS-1$
			case UML2Package.OPERATION__VISIBILITY:
				return visibility != VISIBILITY_EDEFAULT;
			case UML2Package.OPERATION__CLIENT_DEPENDENCY:
				return clientDependency != null && !clientDependency.isEmpty();
			case UML2Package.OPERATION__NAME_EXPRESSION:
				return nameExpression != null;
			case UML2Package.OPERATION__MEMBER:
				return !getMembers().isEmpty();
			case UML2Package.OPERATION__OWNED_RULE:
				return ownedRule != null && !ownedRule.isEmpty();
			case UML2Package.OPERATION__IMPORTED_MEMBER:
				return !getImportedMembers().isEmpty();
			case UML2Package.OPERATION__ELEMENT_IMPORT:
				return elementImport != null && !elementImport.isEmpty();
			case UML2Package.OPERATION__PACKAGE_IMPORT:
				return packageImport != null && !packageImport.isEmpty();
			case UML2Package.OPERATION__REDEFINITION_CONTEXT:
				return !getRedefinitionContexts().isEmpty();
			case UML2Package.OPERATION__IS_LEAF:
				return isLeaf != IS_LEAF_EDEFAULT;
			case UML2Package.OPERATION__FEATURING_CLASSIFIER:
				return !getFeaturingClassifiers().isEmpty();
			case UML2Package.OPERATION__IS_STATIC:
				return isStatic != IS_STATIC_EDEFAULT;
			case UML2Package.OPERATION__PARAMETER:
				return !getParameters().isEmpty();
			case UML2Package.OPERATION__FORMAL_PARAMETER:
				return formalParameter != null && !formalParameter.isEmpty();
			case UML2Package.OPERATION__RETURN_RESULT:
				return returnResult != null && !returnResult.isEmpty();
			case UML2Package.OPERATION__RAISED_EXCEPTION:
				return raisedException != null && !raisedException.isEmpty();
			case UML2Package.OPERATION__IS_ABSTRACT:
				return isAbstract != IS_ABSTRACT_EDEFAULT;
			case UML2Package.OPERATION__METHOD:
				return method != null && !method.isEmpty();
			case UML2Package.OPERATION__CONCURRENCY:
				return concurrency != CONCURRENCY_EDEFAULT;
			case UML2Package.OPERATION__TYPE:
				return basicGetType() != null;
			case UML2Package.OPERATION__IS_ORDERED:
				return isOrdered() != false;
			case UML2Package.OPERATION__IS_UNIQUE:
				return isUnique() != true;
			case UML2Package.OPERATION__LOWER:
				return getLower() != 1;
			case UML2Package.OPERATION__UPPER:
				return getUpper() != 1;
			case UML2Package.OPERATION__UPPER_VALUE:
				return upperValue != null;
			case UML2Package.OPERATION__LOWER_VALUE:
				return lowerValue != null;
			case UML2Package.OPERATION__TEMPLATE_PARAMETER:
				return templateParameter != null;
			case UML2Package.OPERATION__OWNING_PARAMETER:
				return getOwningParameter() != null;
			case UML2Package.OPERATION__OWNED_PARAMETER:
				return ownedParameter != null && !ownedParameter.isEmpty();
			case UML2Package.OPERATION__CLASS_:
				return getClass_() != null;
			case UML2Package.OPERATION__IS_QUERY:
				return isQuery != IS_QUERY_EDEFAULT;
			case UML2Package.OPERATION__DATATYPE:
				return getDatatype() != null;
			case UML2Package.OPERATION__PRECONDITION:
				return precondition != null && !precondition.isEmpty();
			case UML2Package.OPERATION__POSTCONDITION:
				return postcondition != null && !postcondition.isEmpty();
			case UML2Package.OPERATION__REDEFINED_OPERATION:
				return redefinedOperation != null && !redefinedOperation.isEmpty();
			case UML2Package.OPERATION__BODY_CONDITION:
				return bodyCondition != null;
		}
		return eDynamicIsSet(eFeature);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class baseClass) {
		if (baseClass == TypedElement.class) {
			switch (derivedFeatureID) {
				case UML2Package.OPERATION__TYPE: return UML2Package.TYPED_ELEMENT__TYPE;
				default: return -1;
			}
		}
		if (baseClass == MultiplicityElement.class) {
			switch (derivedFeatureID) {
				case UML2Package.OPERATION__IS_ORDERED: return UML2Package.MULTIPLICITY_ELEMENT__IS_ORDERED;
				case UML2Package.OPERATION__IS_UNIQUE: return UML2Package.MULTIPLICITY_ELEMENT__IS_UNIQUE;
				case UML2Package.OPERATION__LOWER: return UML2Package.MULTIPLICITY_ELEMENT__LOWER;
				case UML2Package.OPERATION__UPPER: return UML2Package.MULTIPLICITY_ELEMENT__UPPER;
				case UML2Package.OPERATION__UPPER_VALUE: return UML2Package.MULTIPLICITY_ELEMENT__UPPER_VALUE;
				case UML2Package.OPERATION__LOWER_VALUE: return UML2Package.MULTIPLICITY_ELEMENT__LOWER_VALUE;
				default: return -1;
			}
		}
		if (baseClass == ParameterableElement.class) {
			switch (derivedFeatureID) {
				case UML2Package.OPERATION__TEMPLATE_PARAMETER: return UML2Package.PARAMETERABLE_ELEMENT__TEMPLATE_PARAMETER;
				case UML2Package.OPERATION__OWNING_PARAMETER: return UML2Package.PARAMETERABLE_ELEMENT__OWNING_PARAMETER;
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
		if (baseClass == TypedElement.class) {
			switch (baseFeatureID) {
				case UML2Package.TYPED_ELEMENT__TYPE: return UML2Package.OPERATION__TYPE;
				default: return -1;
			}
		}
		if (baseClass == MultiplicityElement.class) {
			switch (baseFeatureID) {
				case UML2Package.MULTIPLICITY_ELEMENT__IS_ORDERED: return UML2Package.OPERATION__IS_ORDERED;
				case UML2Package.MULTIPLICITY_ELEMENT__IS_UNIQUE: return UML2Package.OPERATION__IS_UNIQUE;
				case UML2Package.MULTIPLICITY_ELEMENT__LOWER: return UML2Package.OPERATION__LOWER;
				case UML2Package.MULTIPLICITY_ELEMENT__UPPER: return UML2Package.OPERATION__UPPER;
				case UML2Package.MULTIPLICITY_ELEMENT__UPPER_VALUE: return UML2Package.OPERATION__UPPER_VALUE;
				case UML2Package.MULTIPLICITY_ELEMENT__LOWER_VALUE: return UML2Package.OPERATION__LOWER_VALUE;
				default: return -1;
			}
		}
		if (baseClass == ParameterableElement.class) {
			switch (baseFeatureID) {
				case UML2Package.PARAMETERABLE_ELEMENT__TEMPLATE_PARAMETER: return UML2Package.OPERATION__TEMPLATE_PARAMETER;
				case UML2Package.PARAMETERABLE_ELEMENT__OWNING_PARAMETER: return UML2Package.OPERATION__OWNING_PARAMETER;
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
		result.append(" (isQuery: "); //$NON-NLS-1$
		result.append(isQuery);
		result.append(')');
		return result.toString();
	}

	// <!-- begin-custom-operations -->

	/* (non-Javadoc)
	 * @see org.eclipse.uml2.MultiplicityElement#setLowerBound(int)
	 */
	public void setLowerBound(int value) {
		MultiplicityElementOperations.setLowerBound(this, value);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.uml2.MultiplicityElement#setUpperBound(int)
	 */
	public void setUpperBound(int value) {
		MultiplicityElementOperations.setUpperBound(this, value);
	}

	// <!-- end-custom-operations -->

} //OperationImpl
