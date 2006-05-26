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
 * $Id: OperationImpl.java,v 1.42 2006/05/26 18:16:42 khussey Exp $
 */
package org.eclipse.uml2.impl;

import java.lang.reflect.Method;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.common.util.UniqueEList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

//import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
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
import org.eclipse.uml2.UML2Factory;
import org.eclipse.uml2.UML2Package;
import org.eclipse.uml2.ValueSpecification;
import org.eclipse.uml2.VisibilityKind;

import org.eclipse.uml2.common.util.CacheAdapter;
import org.eclipse.uml2.common.util.DerivedUnionEObjectEList;
import org.eclipse.uml2.common.util.SubsetSupersetEObjectContainmentWithInverseEList;
import org.eclipse.uml2.common.util.SubsetSupersetEObjectEList;

import org.eclipse.uml2.common.util.UnionEObjectEList;

import org.eclipse.uml2.internal.operation.MultiplicityElementOperations;
import org.eclipse.uml2.internal.operation.OperationOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Operation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2.impl.OperationImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.OperationImpl#getOwnedElements <em>Owned Element</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.OperationImpl#isOrdered <em>Is Ordered</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.OperationImpl#isUnique <em>Is Unique</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.OperationImpl#getLower <em>Lower</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.OperationImpl#getUpper <em>Upper</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.OperationImpl#getUpperValue <em>Upper Value</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.OperationImpl#getLowerValue <em>Lower Value</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.OperationImpl#getOwner <em>Owner</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.OperationImpl#getTemplateParameter <em>Template Parameter</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.OperationImpl#getOwningParameter <em>Owning Parameter</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.OperationImpl#getRedefinitionContexts <em>Redefinition Context</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.OperationImpl#getNamespace <em>Namespace</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.OperationImpl#getFeaturingClassifiers <em>Featuring Classifier</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.OperationImpl#getOwnedMembers <em>Owned Member</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.OperationImpl#getRedefinedElements <em>Redefined Element</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.OperationImpl#getOwnedRules <em>Owned Rule</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.OperationImpl#getClass_ <em>Class </em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.OperationImpl#isQuery <em>Is Query</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.OperationImpl#getDatatype <em>Datatype</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.OperationImpl#getPreconditions <em>Precondition</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.OperationImpl#getPostconditions <em>Postcondition</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.OperationImpl#getRedefinedOperations <em>Redefined Operation</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.OperationImpl#getBodyCondition <em>Body Condition</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.OperationImpl#getFormalParameters <em>Formal Parameter</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.OperationImpl#getRaisedExceptions <em>Raised Exception</em>}</li>
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
	public static final String copyright = "Copyright (c) IBM Corporation and others."; //$NON-NLS-1$

	/**
	 * The default value of the '{@link #isOrdered() <em>Is Ordered</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOrdered()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_ORDERED_EDEFAULT = false;

	/**
	 * The default value of the '{@link #isUnique() <em>Is Unique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUnique()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_UNIQUE_EDEFAULT = true;

	/**
	 * The default value of the '{@link #getLower() <em>Lower</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLower()
	 * @generated
	 * @ordered
	 */
	protected static final int LOWER_EDEFAULT = 1;

	/**
	 * The default value of the '{@link #getUpper() <em>Upper</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpper()
	 * @generated
	 * @ordered
	 */
	protected static final int UPPER_EDEFAULT = 1;

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
	 * The default value of the '{@link #isQuery() <em>Is Query</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isQuery()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_QUERY_EDEFAULT = false;

	/**
	 * The flag representing the value of the '{@link #isQuery() <em>Is Query</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isQuery()
	 * @generated
	 * @ordered
	 */
	protected static final int IS_QUERY_EFLAG = 1 << 13;

	/**
	 * The cached value of the '{@link #getPreconditions() <em>Precondition</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreconditions()
	 * @generated
	 * @ordered
	 */
	protected EList preconditions = null;

	/**
	 * The cached value of the '{@link #getPostconditions() <em>Postcondition</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPostconditions()
	 * @generated
	 * @ordered
	 */
	protected EList postconditions = null;

	/**
	 * The cached value of the '{@link #getRedefinedOperations() <em>Redefined Operation</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRedefinedOperations()
	 * @generated
	 * @ordered
	 */
	protected EList redefinedOperations = null;

	/**
	 * The cached value of the '{@link #getBodyCondition() <em>Body Condition</em>}' reference.
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
		return UML2Package.Literals.OPERATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
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
	 * @generated NOT
	 */
	public ValueSpecification createUpperValue(EClass eClass) {
		ValueSpecification newUpperValue = (ValueSpecification) eClass.getEPackage().getEFactoryInstance().create(eClass);
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, 0, UML2Package.OPERATION__UPPER_VALUE, null, newUpperValue));
		}
		setUpperValue(newUpperValue);
		return newUpperValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
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
	public Element getOwner() {
		Element owner = basicGetOwner();
		return owner != null && owner.eIsProxy() ? (Element)eResolveProxy((InternalEObject)owner) : owner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public ValueSpecification createLowerValue(EClass eClass) {
		ValueSpecification newLowerValue = (ValueSpecification) eClass.getEPackage().getEFactoryInstance().create(eClass);
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, 0, UML2Package.OPERATION__LOWER_VALUE, null, newLowerValue));
		}
		setLowerValue(newLowerValue);
		return newLowerValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemplateParameter getTemplateParameter() {
		if (templateParameter != null && templateParameter.eIsProxy()) {
			InternalEObject oldTemplateParameter = (InternalEObject)templateParameter;
			templateParameter = (TemplateParameter)eResolveProxy(oldTemplateParameter);
			if (templateParameter != oldTemplateParameter) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UML2Package.OPERATION__TEMPLATE_PARAMETER, oldTemplateParameter, templateParameter));
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
		return templateParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTemplateParameter(TemplateParameter newTemplateParameter, NotificationChain msgs) {
		TemplateParameter oldTemplateParameter = templateParameter;
		templateParameter = newTemplateParameter;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UML2Package.OPERATION__TEMPLATE_PARAMETER, oldTemplateParameter, newTemplateParameter);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}

		Resource.Internal eInternalResource = eInternalResource();
		if (eInternalResource == null || !eInternalResource.isLoading()) {
			TemplateParameter owningParameter = getOwningParameter();
			if (owningParameter != null && owningParameter != newTemplateParameter) {
				setOwningParameter(null);
			}
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
			if (templateParameter != null)
				msgs = ((InternalEObject)templateParameter).eInverseRemove(this, UML2Package.TEMPLATE_PARAMETER__PARAMETERED_ELEMENT, TemplateParameter.class, msgs);
			if (newTemplateParameter != null)
				msgs = ((InternalEObject)newTemplateParameter).eInverseAdd(this, UML2Package.TEMPLATE_PARAMETER__PARAMETERED_ELEMENT, TemplateParameter.class, msgs);
			msgs = basicSetTemplateParameter(newTemplateParameter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2Package.OPERATION__TEMPLATE_PARAMETER, newTemplateParameter, newTemplateParameter));

	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemplateParameter getOwningParameter() {
		if (eContainerFeatureID != UML2Package.OPERATION__OWNING_PARAMETER) return null;
		return (TemplateParameter)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwningParameter(TemplateParameter newOwningParameter, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newOwningParameter, UML2Package.OPERATION__OWNING_PARAMETER, msgs);

		Resource.Internal eInternalResource = eInternalResource();
		if (eInternalResource == null || !eInternalResource.isLoading()) {
			if (newOwningParameter != null) {
				if (newOwningParameter != templateParameter) {
					setTemplateParameter(newOwningParameter);
				}
			}
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwningParameter(TemplateParameter newOwningParameter) {
		if (newOwningParameter != eInternalContainer() || (eContainerFeatureID != UML2Package.OPERATION__OWNING_PARAMETER && newOwningParameter != null)) {
			if (EcoreUtil.isAncestor(this, newOwningParameter))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString()); //$NON-NLS-1$
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOwningParameter != null)
				msgs = ((InternalEObject)newOwningParameter).eInverseAdd(this, UML2Package.TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT, TemplateParameter.class, msgs);
			msgs = basicSetOwningParameter(newOwningParameter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2Package.OPERATION__OWNING_PARAMETER, newOwningParameter, newOwningParameter));

	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getRedefinitionContexts() {
		CacheAdapter cache = getCacheAdapter();
		if (cache != null) {
			Resource eResource = eResource();
			EList redefinitionContexts = (EList) cache.get(eResource, this, UML2Package.Literals.REDEFINABLE_ELEMENT__REDEFINITION_CONTEXT);
			if (redefinitionContexts == null) {
				cache.put(eResource, this, UML2Package.Literals.REDEFINABLE_ELEMENT__REDEFINITION_CONTEXT, redefinitionContexts = new DerivedUnionEObjectEList(Classifier.class, this, UML2Package.OPERATION__REDEFINITION_CONTEXT, REDEFINITION_CONTEXT_ESUBSETS));
			}
			return redefinitionContexts;
		}
		return new DerivedUnionEObjectEList(Classifier.class, this, UML2Package.OPERATION__REDEFINITION_CONTEXT, REDEFINITION_CONTEXT_ESUBSETS);
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRedefinitionContexts() {
		return super.isSetRedefinitionContexts()
			|| eIsSet(UML2Package.OPERATION__CLASS_)
			|| eIsSet(UML2Package.OPERATION__DATATYPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getFeaturingClassifiers() {
		CacheAdapter cache = getCacheAdapter();
		if (cache != null) {
			Resource eResource = eResource();
			EList featuringClassifiers = (EList) cache.get(eResource, this, UML2Package.Literals.FEATURE__FEATURING_CLASSIFIER);
			if (featuringClassifiers == null) {
				cache.put(eResource, this, UML2Package.Literals.FEATURE__FEATURING_CLASSIFIER, featuringClassifiers = new DerivedUnionEObjectEList(Classifier.class, this, UML2Package.OPERATION__FEATURING_CLASSIFIER, FEATURING_CLASSIFIER_ESUBSETS));
			}
			return featuringClassifiers;
		}
		return new DerivedUnionEObjectEList(Classifier.class, this, UML2Package.OPERATION__FEATURING_CLASSIFIER, FEATURING_CLASSIFIER_ESUBSETS);
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetFeaturingClassifiers() {
		return super.isSetFeaturingClassifiers()
			|| eIsSet(UML2Package.OPERATION__CLASS_)
			|| eIsSet(UML2Package.OPERATION__DATATYPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isQuery() {
		return (eFlags & IS_QUERY_EFLAG) != 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsQuery(boolean newIsQuery) {
		boolean oldIsQuery = (eFlags & IS_QUERY_EFLAG) != 0;
		if (newIsQuery) eFlags |= IS_QUERY_EFLAG; else eFlags &= ~IS_QUERY_EFLAG;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2Package.OPERATION__IS_QUERY, oldIsQuery, newIsQuery));


	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList getOwnedParameters() {
		if (formalParameters == null) {
			formalParameters = new EObjectContainmentWithInverseEList(Parameter.class, this, UML2Package.OPERATION__OWNED_PARAMETER, UML2Package.PARAMETER__OPERATION);
		}
		return formalParameters;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean isSetOwnedParameters() {
		return formalParameters != null && !formalParameters.isEmpty();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
    public Parameter getOwnedParameter(String name) {
		return getOwnedParameter(name, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parameter getOwnedParameter(String name, boolean ignoreCase) {
		ownedParameterLoop: for (Iterator i = getOwnedParameters().iterator(); i.hasNext(); ) {
			Parameter ownedParameter = (Parameter) i.next();
			if (name != null && !(ignoreCase ? name.equalsIgnoreCase(ownedParameter.getName()) : name.equals(ownedParameter.getName())))
				continue ownedParameterLoop;
			return ownedParameter;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 * @deprecated Use #createOwnedParameter() instead.
	 */
	public Parameter createOwnedParameter(EClass eClass) {
		Parameter newOwnedParameter = (Parameter) eClass.getEPackage().getEFactoryInstance().create(eClass);
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, 0, UML2Package.OPERATION__OWNED_PARAMETER, null, newOwnedParameter));
		}
		getOwnedParameters().add(newOwnedParameter);
		return newOwnedParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Parameter createOwnedParameter() {
		Parameter newOwnedParameter = UML2Factory.eINSTANCE.createParameter();
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, 0, UML2Package.OPERATION__OWNED_PARAMETER, null, newOwnedParameter));
		}
		getOwnedParameters().add(newOwnedParameter);
		return newOwnedParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.uml2.Class getClass_() {
		if (eContainerFeatureID != UML2Package.OPERATION__CLASS_) return null;
		return (org.eclipse.uml2.Class)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetClass_(org.eclipse.uml2.Class newClass_, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newClass_, UML2Package.OPERATION__CLASS_, msgs);

		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClass_(org.eclipse.uml2.Class newClass_) {
		if (newClass_ != eInternalContainer() || (eContainerFeatureID != UML2Package.OPERATION__CLASS_ && newClass_ != null)) {
			if (EcoreUtil.isAncestor(this, newClass_))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString()); //$NON-NLS-1$
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newClass_ != null)
				msgs = ((InternalEObject)newClass_).eInverseAdd(this, UML2Package.CLASS__OWNED_OPERATION, org.eclipse.uml2.Class.class, msgs);
			msgs = basicSetClass_(newClass_, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2Package.OPERATION__CLASS_, newClass_, newClass_));

	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType getDatatype() {
		if (eContainerFeatureID != UML2Package.OPERATION__DATATYPE) return null;
		return (DataType)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDatatype(DataType newDatatype, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newDatatype, UML2Package.OPERATION__DATATYPE, msgs);

		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDatatype(DataType newDatatype) {
		if (newDatatype != eInternalContainer() || (eContainerFeatureID != UML2Package.OPERATION__DATATYPE && newDatatype != null)) {
			if (EcoreUtil.isAncestor(this, newDatatype))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString()); //$NON-NLS-1$
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newDatatype != null)
				msgs = ((InternalEObject)newDatatype).eInverseAdd(this, UML2Package.DATA_TYPE__OWNED_OPERATION, DataType.class, msgs);
			msgs = basicSetDatatype(newDatatype, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2Package.OPERATION__DATATYPE, newDatatype, newDatatype));

	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getPreconditions() {
		if (preconditions == null) {
			preconditions = new SubsetSupersetEObjectEList(Constraint.class, this, UML2Package.OPERATION__PRECONDITION, PRECONDITION_ESUPERSETS, null);
		}
		return preconditions;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
    public Constraint getPrecondition(String name) {
		return getPrecondition(name, false, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Constraint getPrecondition(String name, boolean ignoreCase, EClass eClass) {
		preconditionLoop: for (Iterator i = getPreconditions().iterator(); i.hasNext(); ) {
			Constraint precondition = (Constraint) i.next();
			if (eClass != null && !eClass.isInstance(precondition))
				continue preconditionLoop;
			if (name != null && !(ignoreCase ? name.equalsIgnoreCase(precondition.getName()) : name.equals(precondition.getName())))
				continue preconditionLoop;
			return precondition;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getPostconditions() {
		if (postconditions == null) {
			postconditions = new SubsetSupersetEObjectEList(Constraint.class, this, UML2Package.OPERATION__POSTCONDITION, POSTCONDITION_ESUPERSETS, null);
		}
		return postconditions;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
    public Constraint getPostcondition(String name) {
		return getPostcondition(name, false, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Constraint getPostcondition(String name, boolean ignoreCase, EClass eClass) {
		postconditionLoop: for (Iterator i = getPostconditions().iterator(); i.hasNext(); ) {
			Constraint postcondition = (Constraint) i.next();
			if (eClass != null && !eClass.isInstance(postcondition))
				continue postconditionLoop;
			if (name != null && !(ignoreCase ? name.equalsIgnoreCase(postcondition.getName()) : name.equals(postcondition.getName())))
				continue postconditionLoop;
			return postcondition;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getRedefinedOperations() {
		if (redefinedOperations == null) {
			redefinedOperations = new EObjectResolvingEList(Operation.class, this, UML2Package.OPERATION__REDEFINED_OPERATION);
		}
		return redefinedOperations;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
    public Operation getRedefinedOperation(String name) {
		return getRedefinedOperation(name, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operation getRedefinedOperation(String name, boolean ignoreCase) {
		redefinedOperationLoop: for (Iterator i = getRedefinedOperations().iterator(); i.hasNext(); ) {
			Operation redefinedOperation = (Operation) i.next();
			if (name != null && !(ignoreCase ? name.equalsIgnoreCase(redefinedOperation.getName()) : name.equals(redefinedOperation.getName())))
				continue redefinedOperationLoop;
			return redefinedOperation;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
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
	public void setBodyCondition(Constraint newBodyCondition) {
		Constraint oldBodyCondition = bodyCondition;
		bodyCondition = newBodyCondition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2Package.OPERATION__BODY_CONDITION, oldBodyCondition, bodyCondition));


		Resource.Internal eInternalResource = eInternalResource();
		if (eInternalResource == null || !eInternalResource.isLoading()) {
			if (newBodyCondition != null) {
				EList ownedRules = getOwnedRules();
				if (!ownedRules.contains(newBodyCondition)) {
					ownedRules.add(newBodyCondition);
				}
			}
		}
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public int lowerBound() {
		EList returnResults = getReturnResults();
		return 1 == returnResults.size()
			? ((Parameter) returnResults.get(0)).lowerBound()
			: 1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public int upperBound() {
		EList returnResults = getReturnResults();
		return 1 == returnResults.size()
			? ((Parameter) returnResults.get(0)).upperBound()
			: 1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isMultivalued() {
		return MultiplicityElementOperations.isMultivalued(this);
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean includesCardinality(int C) {
		return MultiplicityElementOperations.includesCardinality(this, C);
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean includesMultiplicity(MultiplicityElement M) {
		return MultiplicityElementOperations.includesMultiplicity(this, M);
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUpperGt0(DiagnosticChain diagnostics, Map context) {
		return MultiplicityElementOperations.validateUpperGt0(this, diagnostics, context);
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLowerGe0(DiagnosticChain diagnostics, Map context) {
		return MultiplicityElementOperations.validateLowerGe0(this, diagnostics, context);
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUpperGeLower(DiagnosticChain diagnostics, Map context) {
		return MultiplicityElementOperations.validateUpperGeLower(this, diagnostics, context);
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLowerEqLowerbound(DiagnosticChain diagnostics, Map context) {
		return MultiplicityElementOperations.validateLowerEqLowerbound(this, diagnostics, context);
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUpperEqUpperbound(DiagnosticChain diagnostics, Map context) {
		return MultiplicityElementOperations.validateUpperEqUpperbound(this, diagnostics, context);
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
			|| eIsSet(UML2Package.OPERATION__OWNING_PARAMETER);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean isOrdered() {
		return OperationOperations.isOrdered(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIsOrdered() {
		return isOrdered() != IS_ORDERED_EDEFAULT;
	}

		public void setIsOrdered(boolean newIsOrdered) {
		EList returnResults = getReturnResults();

		if (1 == returnResults.size()) {
			((Parameter) returnResults.get(0)).setIsOrdered(newIsOrdered);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean isUnique() {
		return OperationOperations.isUnique(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIsUnique() {
		return isUnique() != IS_UNIQUE_EDEFAULT;
	}

		public void setIsUnique(boolean newIsUnique) {
		EList returnResults = getReturnResults();

		if (1 == returnResults.size()) {
			((Parameter) returnResults.get(0)).setIsUnique(newIsUnique);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int lower() {
		return OperationOperations.lower(this);
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int upper() {
		return OperationOperations.upper(this);
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTypeOfResult(DiagnosticChain diagnostics, Map context) {
		return OperationOperations.validateTypeOfResult(this, diagnostics, context);
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Classifier type() {
		return OperationOperations.type(this);
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOnlyBodyForQuery(DiagnosticChain diagnostics, Map context) {
		return OperationOperations.validateOnlyBodyForQuery(this, diagnostics, context);
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isConsistentWith(RedefinableElement redefinee) {
		return OperationOperations.isConsistentWith(this, redefinee);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
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
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOwningParameter((TemplateParameter)otherEnd, msgs);
			case UML2Package.OPERATION__OWNED_PARAMETER:
				return ((InternalEList)getOwnedParameters()).basicAdd(otherEnd, msgs);
			case UML2Package.OPERATION__CLASS_:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetClass_((org.eclipse.uml2.Class)otherEnd, msgs);
			case UML2Package.OPERATION__DATATYPE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetDatatype((DataType)otherEnd, msgs);
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
				return basicSetOwningParameter(null, msgs);
			case UML2Package.OPERATION__OWNED_PARAMETER:
				return ((InternalEList)getOwnedParameters()).basicRemove(otherEnd, msgs);
			case UML2Package.OPERATION__CLASS_:
				return basicSetClass_(null, msgs);
			case UML2Package.OPERATION__DATATYPE:
				return basicSetDatatype(null, msgs);
		}
		return eDynamicInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID) {
			case UML2Package.OPERATION__OWNING_PARAMETER:
				return eInternalContainer().eInverseRemove(this, UML2Package.TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT, TemplateParameter.class, msgs);
			case UML2Package.OPERATION__CLASS_:
				return eInternalContainer().eInverseRemove(this, UML2Package.CLASS__OWNED_OPERATION, org.eclipse.uml2.Class.class, msgs);
			case UML2Package.OPERATION__DATATYPE:
				return eInternalContainer().eInverseRemove(this, UML2Package.DATA_TYPE__OWNED_OPERATION, DataType.class, msgs);
		}
		return eDynamicBasicRemoveFromContainer(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public int getLower() {
		return lower();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetLower() {
		return getLower() != LOWER_EDEFAULT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public int getUpper() {
		return upper();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetUpper() {
		return getUpper() != UPPER_EDEFAULT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList getRaisedExceptions() {
		if (raisedExceptions == null) {
			raisedExceptions = new EObjectResolvingEList(Type.class, this, UML2Package.OPERATION__RAISED_EXCEPTION);
		}
		return raisedExceptions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRaisedExceptions() {
		return raisedExceptions != null && !raisedExceptions.isEmpty();
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
    public Type getRaisedException(String name) {
		return getRaisedException(name, false, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type getRaisedException(String name, boolean ignoreCase, EClass eClass) {
		raisedExceptionLoop: for (Iterator i = getRaisedExceptions().iterator(); i.hasNext(); ) {
			Type raisedException = (Type) i.next();
			if (eClass != null && !eClass.isInstance(raisedException))
				continue raisedExceptionLoop;
			if (name != null && !(ignoreCase ? name.equalsIgnoreCase(raisedException.getName()) : name.equals(raisedException.getName())))
				continue raisedExceptionLoop;
			return raisedException;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList getFormalParameters() {
		return getOwnedParameters();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean isSetFormalParameters() {
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Parameter createFormalParameter() {
		return createOwnedParameter();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
    public Parameter getFormalParameter(String name) {
		return getFormalParameter(name, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parameter getFormalParameter(String name, boolean ignoreCase) {
		formalParameterLoop: for (Iterator i = getFormalParameters().iterator(); i.hasNext(); ) {
			Parameter formalParameter = (Parameter) i.next();
			if (name != null && !(ignoreCase ? name.equalsIgnoreCase(formalParameter.getName()) : name.equals(formalParameter.getName())))
				continue formalParameterLoop;
			return formalParameter;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Type basicGetType() {
		return type();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean isSetType() {
		return null != returnResults
			&& 1 == returnResults.size()
			&& ((Parameter) returnResults.get(0))
				.eIsSet(UML2Package.Literals.TYPED_ELEMENT__TYPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getOwnedElements() {
		CacheAdapter cache = getCacheAdapter();
		if (cache != null) {
			EList ownedElements = (EList) cache.get(eResource(), this, UML2Package.Literals.ELEMENT__OWNED_ELEMENT);
			if (ownedElements == null) {
				List union = getOwnedElementsHelper(new UniqueEList.FastCompare());
				cache.put(eResource(), this, UML2Package.Literals.ELEMENT__OWNED_ELEMENT, ownedElements = new UnionEObjectEList(this, UML2Package.Literals.ELEMENT__OWNED_ELEMENT, union.size(), union.toArray()));
			}
			return ownedElements;
		}
		List union = getOwnedElementsHelper(new UniqueEList.FastCompare());
		return new UnionEObjectEList(this, UML2Package.Literals.ELEMENT__OWNED_ELEMENT, union.size(), union.toArray());
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Type getType() {
		return type();
	}

	public void setType(Type newType) {
		EList returnResults = getReturnResults();

		if (1 == returnResults.size()) {
			((Parameter) returnResults.get(0)).setType(newType);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Namespace basicGetNamespace() {
		org.eclipse.uml2.Class class_ = getClass_();			
		if (class_ != null) {
			return class_;
		}
		DataType datatype = getDatatype();			
		if (datatype != null) {
			return datatype;
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
			|| eIsSet(UML2Package.OPERATION__CLASS_)
			|| eIsSet(UML2Package.OPERATION__DATATYPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected EList getOwnedMembersHelper(EList ownedMembers) {
		super.getOwnedMembersHelper(ownedMembers);
		if (eIsSet(UML2Package.Literals.OPERATION__PRECONDITION)) {
			ownedMembers.addAll(getPreconditions());
		}
		if (eIsSet(UML2Package.Literals.OPERATION__POSTCONDITION)) {
			ownedMembers.addAll(getPostconditions());
		}
		if (eIsSet(UML2Package.Literals.OPERATION__BODY_CONDITION)) {
			ownedMembers.add(getBodyCondition());
		}
		if (eIsSet(UML2Package.Literals.OPERATION__OWNED_PARAMETER)) {
			ownedMembers.addAll(getOwnedParameters());
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
			|| eIsSet(UML2Package.OPERATION__PRECONDITION)
			|| eIsSet(UML2Package.OPERATION__POSTCONDITION)
			|| eIsSet(UML2Package.OPERATION__BODY_CONDITION);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EList getRedefinedElementsHelper(EList redefinedElements) {
		super.getRedefinedElementsHelper(redefinedElements);
		if (eIsSet(UML2Package.OPERATION__REDEFINED_OPERATION)) {
			for (Iterator i = ((InternalEList) getRedefinedOperations()).basicIterator(); i.hasNext(); ) {
				redefinedElements.add(i.next());
			}
		}
		return redefinedElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRedefinedElements() {
		return super.isSetRedefinedElements()
			|| eIsSet(UML2Package.OPERATION__REDEFINED_OPERATION);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getOwnedRules() {
		if (ownedRules == null) {
			ownedRules = new SubsetSupersetEObjectContainmentWithInverseEList(Constraint.class, this, UML2Package.OPERATION__OWNED_RULE, null, OWNED_RULE_ESUBSETS, UML2Package.CONSTRAINT__NAMESPACE);
		}
		return ownedRules;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
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
		return eDynamicGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
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
		eDynamicSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eUnset(int featureID) {
		switch (featureID) {
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
				setType((Type)null);
				return;
			case UML2Package.OPERATION__IS_ORDERED:
				setIsOrdered(IS_ORDERED_EDEFAULT);
				return;
			case UML2Package.OPERATION__IS_UNIQUE:
				setIsUnique(IS_UNIQUE_EDEFAULT);
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
				setOwningParameter((TemplateParameter)null);
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
		eDynamicUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case UML2Package.OPERATION__EANNOTATIONS:
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UML2Package.OPERATION__OWNED_ELEMENT:
				return isSetOwnedElements();
			case UML2Package.OPERATION__OWNER:
				return isSetOwner();
			case UML2Package.OPERATION__OWNED_COMMENT:
				return ownedComments != null && !ownedComments.isEmpty();
			case UML2Package.OPERATION__TEMPLATE_BINDING:
				return templateBindings != null && !templateBindings.isEmpty();
			case UML2Package.OPERATION__OWNED_TEMPLATE_SIGNATURE:
				return ownedTemplateSignature != null;
			case UML2Package.OPERATION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case UML2Package.OPERATION__QUALIFIED_NAME:
				return QUALIFIED_NAME_EDEFAULT == null ? getQualifiedName() != null : !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case UML2Package.OPERATION__VISIBILITY:
				return visibility != VISIBILITY_EDEFAULT;
			case UML2Package.OPERATION__CLIENT_DEPENDENCY:
				return clientDependencies != null && !clientDependencies.isEmpty();
			case UML2Package.OPERATION__NAME_EXPRESSION:
				return nameExpression != null;
			case UML2Package.OPERATION__MEMBER:
				return isSetMembers();
			case UML2Package.OPERATION__OWNED_RULE:
				return ownedRules != null && !ownedRules.isEmpty();
			case UML2Package.OPERATION__IMPORTED_MEMBER:
				return !getImportedMembers().isEmpty();
			case UML2Package.OPERATION__ELEMENT_IMPORT:
				return elementImports != null && !elementImports.isEmpty();
			case UML2Package.OPERATION__PACKAGE_IMPORT:
				return packageImports != null && !packageImports.isEmpty();
			case UML2Package.OPERATION__REDEFINITION_CONTEXT:
				return isSetRedefinitionContexts();
			case UML2Package.OPERATION__IS_LEAF:
				return ((eFlags & IS_LEAF_EFLAG) != 0) != IS_LEAF_EDEFAULT;
			case UML2Package.OPERATION__FEATURING_CLASSIFIER:
				return isSetFeaturingClassifiers();
			case UML2Package.OPERATION__IS_STATIC:
				return ((eFlags & IS_STATIC_EFLAG) != 0) != IS_STATIC_EDEFAULT;
			case UML2Package.OPERATION__PARAMETER:
				return isSetParameters();
			case UML2Package.OPERATION__FORMAL_PARAMETER:
				return isSetFormalParameters();
			case UML2Package.OPERATION__RETURN_RESULT:
				return returnResults != null && !returnResults.isEmpty();
			case UML2Package.OPERATION__RAISED_EXCEPTION:
				return isSetRaisedExceptions();
			case UML2Package.OPERATION__IS_ABSTRACT:
				return ((eFlags & IS_ABSTRACT_EFLAG) != 0) != IS_ABSTRACT_EDEFAULT;
			case UML2Package.OPERATION__METHOD:
				return methods != null && !methods.isEmpty();
			case UML2Package.OPERATION__CONCURRENCY:
				return concurrency != CONCURRENCY_EDEFAULT;
			case UML2Package.OPERATION__TYPE:
				return isSetType();
			case UML2Package.OPERATION__IS_ORDERED:
				return isSetIsOrdered();
			case UML2Package.OPERATION__IS_UNIQUE:
				return isSetIsUnique();
			case UML2Package.OPERATION__LOWER:
				return isSetLower();
			case UML2Package.OPERATION__UPPER:
				return isSetUpper();
			case UML2Package.OPERATION__UPPER_VALUE:
				return upperValue != null;
			case UML2Package.OPERATION__LOWER_VALUE:
				return lowerValue != null;
			case UML2Package.OPERATION__TEMPLATE_PARAMETER:
				return templateParameter != null;
			case UML2Package.OPERATION__OWNING_PARAMETER:
				return getOwningParameter() != null;
			case UML2Package.OPERATION__OWNED_PARAMETER:
				return isSetOwnedParameters();
			case UML2Package.OPERATION__CLASS_:
				return getClass_() != null;
			case UML2Package.OPERATION__IS_QUERY:
				return ((eFlags & IS_QUERY_EFLAG) != 0) != IS_QUERY_EDEFAULT;
			case UML2Package.OPERATION__DATATYPE:
				return getDatatype() != null;
			case UML2Package.OPERATION__PRECONDITION:
				return preconditions != null && !preconditions.isEmpty();
			case UML2Package.OPERATION__POSTCONDITION:
				return postconditions != null && !postconditions.isEmpty();
			case UML2Package.OPERATION__REDEFINED_OPERATION:
				return redefinedOperations != null && !redefinedOperations.isEmpty();
			case UML2Package.OPERATION__BODY_CONDITION:
				return bodyCondition != null;
		}
		return eDynamicIsSet(featureID);
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
		result.append((eFlags & IS_QUERY_EFLAG) != 0);
		result.append(')');
		return result.toString();
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EList getOwnedElementsHelper(EList ownedElements) {
		super.getOwnedElementsHelper(ownedElements);
		ValueSpecification upperValue = getUpperValue();
		if (upperValue != null) {
			ownedElements.add(upperValue);
		}
		ValueSpecification lowerValue = getLowerValue();
		if (lowerValue != null) {
			ownedElements.add(lowerValue);
		}
		return ownedElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOwnedElements() {
		return super.isSetOwnedElements()
			|| eIsSet(UML2Package.OPERATION__UPPER_VALUE)
			|| eIsSet(UML2Package.OPERATION__LOWER_VALUE);
	}

	/**
	 * The array of subset feature identifiers for the '{@link #getOwnedElements() <em>Owned Element</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedElements()
	 * @generated
	 * @ordered
	 */
	protected static final int[] OWNED_ELEMENT_ESUBSETS = new int[] {UML2Package.OPERATION__OWNED_COMMENT, UML2Package.OPERATION__TEMPLATE_BINDING, UML2Package.OPERATION__OWNED_TEMPLATE_SIGNATURE, UML2Package.OPERATION__NAME_EXPRESSION, UML2Package.OPERATION__ELEMENT_IMPORT, UML2Package.OPERATION__PACKAGE_IMPORT, UML2Package.OPERATION__UPPER_VALUE, UML2Package.OPERATION__LOWER_VALUE};

	/**
	 * The array of subset feature identifiers for the '{@link #getRedefinitionContexts() <em>Redefinition Context</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRedefinitionContexts()
	 * @generated
	 * @ordered
	 */
	protected static final int[] REDEFINITION_CONTEXT_ESUBSETS = new int[] {UML2Package.OPERATION__CLASS_, UML2Package.OPERATION__DATATYPE};

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Namespace getNamespace() {
		Namespace namespace = basicGetNamespace();
		return namespace != null && namespace.eIsProxy() ? (Namespace)eResolveProxy((InternalEObject)namespace) : namespace;
	}

	/**
	 * The array of subset feature identifiers for the '{@link #getFeaturingClassifiers() <em>Featuring Classifier</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeaturingClassifiers()
	 * @generated
	 * @ordered
	 */
	protected static final int[] FEATURING_CLASSIFIER_ESUBSETS = new int[] {UML2Package.OPERATION__CLASS_, UML2Package.OPERATION__DATATYPE};

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
	 * The array of subset feature identifiers for the '{@link #getOwnedMembers() <em>Owned Member</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedMembers()
	 * @generated
	 * @ordered
	 */
	protected static final int[] OWNED_MEMBER_ESUBSETS = new int[] {UML2Package.OPERATION__OWNED_RULE, UML2Package.OPERATION__FORMAL_PARAMETER, UML2Package.OPERATION__RETURN_RESULT, UML2Package.OPERATION__PRECONDITION, UML2Package.OPERATION__POSTCONDITION, UML2Package.OPERATION__BODY_CONDITION};

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
				EList redefinedElements = (EList) cache.get(eResource(), this, method);
				if (redefinedElements == null) {
					List union = getRedefinedElementsHelper(new UniqueEList.FastCompare());
					cache.put(eResource(), this, method, redefinedElements = new UnionEObjectEList(this, null, union.size(), union.toArray()));
				}
				return redefinedElements;
			}
			catch (NoSuchMethodException nsme) {
				// ignore
			}
		}
		List union = getRedefinedElementsHelper(new UniqueEList.FastCompare());
		return new UnionEObjectEList(this, null, union.size(), union.toArray());
	}


	/**
	 * The array of subset feature identifiers for the '{@link #getRedefinedElements() <em>Redefined Element</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRedefinedElements()
	 * @generated
	 * @ordered
	 */
	protected static final int[] REDEFINED_ELEMENT_ESUBSETS = new int[] {UML2Package.OPERATION__REDEFINED_OPERATION};

	/**
	 * The array of subset feature identifiers for the '{@link #getOwnedRules() <em>Owned Rule</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedRules()
	 * @generated
	 * @ordered
	 */
	protected static final int[] OWNED_RULE_ESUBSETS = new int[] {UML2Package.OPERATION__PRECONDITION, UML2Package.OPERATION__POSTCONDITION, UML2Package.OPERATION__BODY_CONDITION};

	/**
	 * The array of superset feature identifiers for the '{@link #getPreconditions() <em>Precondition</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreconditions()
	 * @generated
	 * @ordered
	 */
	protected static final int[] PRECONDITION_ESUPERSETS = new int[] {UML2Package.OPERATION__OWNED_RULE};

	/**
	 * The array of superset feature identifiers for the '{@link #getPostconditions() <em>Postcondition</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPostconditions()
	 * @generated
	 * @ordered
	 */
	protected static final int[] POSTCONDITION_ESUPERSETS = new int[] {UML2Package.OPERATION__OWNED_RULE};

		// <!-- begin-custom-operations -->

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.uml2.MultiplicityElement#setLowerBound(int)
	 */
	public void setLowerBound(int value) {
		EList returnResults = getReturnResults();

		if (1 == returnResults.size()) {
			((Parameter) returnResults.get(0)).setLowerBound(value);
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.uml2.MultiplicityElement#setUpperBound(int)
	 */
	public void setUpperBound(int value) {
		EList returnResults = getReturnResults();

		if (1 == returnResults.size()) {
			((Parameter) returnResults.get(0)).setUpperBound(value);
		}
	}

	/**
	 * The array of subset feature identifiers for the '{@link #getParameters() <em>Parameter</em>}' reference list.
	 * @see #getParameters()
	 */
	protected static final int[] PARAMETER_ESUBSETS = new int[] {UML2Package.OPERATION__OWNED_PARAMETER, UML2Package.OPERATION__RETURN_RESULT};

	public EList getParameters() {
		CacheAdapter cache = getCacheAdapter();
		if (cache != null) {
			Resource eResource = eResource();
			EList parameter = (EList) cache.get(eResource, this,
				UML2Package.Literals.BEHAVIORAL_FEATURE__PARAMETER);
			if (parameter == null) {
				cache.put(eResource, this,
					UML2Package.Literals.BEHAVIORAL_FEATURE__PARAMETER,
					parameter = new DerivedUnionEObjectEList(Parameter.class,
						this, UML2Package.OPERATION__PARAMETER,
						PARAMETER_ESUBSETS));
			}
			return parameter;
		}
		return new DerivedUnionEObjectEList(Parameter.class, this,
			UML2Package.OPERATION__PARAMETER, PARAMETER_ESUBSETS);
	}

	// <!-- end-custom-operations -->

} //OperationImpl
