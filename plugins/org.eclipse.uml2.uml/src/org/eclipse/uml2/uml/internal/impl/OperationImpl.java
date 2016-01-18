/*
 * Copyright (c) 2005, 2016 IBM Corporation, Embarcadero Technologies, CEA, and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *   Kenn Hussey (Embarcadero Technologies) - 204200
 *   Kenn Hussey - 286329, 323181
 *   Kenn Hussey (CEA) - 327039, 351774, 212765, 418466, 451350, 485756
 *
 */
package org.eclipse.uml2.uml.internal.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.uml2.common.util.CacheAdapter;
import org.eclipse.uml2.common.util.DerivedUnionEObjectEList;
import org.eclipse.uml2.common.util.SubsetSupersetEObjectContainmentWithInverseEList;
import org.eclipse.uml2.common.util.SubsetSupersetEObjectResolvingEList;

import org.eclipse.uml2.uml.Behavior;
import org.eclipse.uml2.uml.CallConcurrencyKind;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.Comment;
import org.eclipse.uml2.uml.Constraint;
import org.eclipse.uml2.uml.DataType;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.ElementImport;
import org.eclipse.uml2.uml.Interface;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Namespace;
import org.eclipse.uml2.uml.Operation;
import org.eclipse.uml2.uml.PackageImport;
import org.eclipse.uml2.uml.PackageableElement;
import org.eclipse.uml2.uml.OperationTemplateParameter;
import org.eclipse.uml2.uml.Parameter;
import org.eclipse.uml2.uml.ParameterSet;
import org.eclipse.uml2.uml.ParameterableElement;
import org.eclipse.uml2.uml.RedefinableElement;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.StringExpression;
import org.eclipse.uml2.uml.TemplateBinding;
import org.eclipse.uml2.uml.TemplateParameter;
import org.eclipse.uml2.uml.TemplateSignature;
import org.eclipse.uml2.uml.TemplateableElement;
import org.eclipse.uml2.uml.Type;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.VisibilityKind;

import org.eclipse.uml2.uml.internal.operations.OperationOperations;
import org.eclipse.uml2.uml.internal.operations.ParameterableElementOperations;
import org.eclipse.uml2.uml.internal.operations.TemplateableElementOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Operation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.OperationImpl#getOwner <em>Owner</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.OperationImpl#getTemplateParameter <em>Template Parameter</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.OperationImpl#getOwningTemplateParameter <em>Owning Template Parameter</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.OperationImpl#getOwnedElements <em>Owned Element</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.OperationImpl#getTemplateBindings <em>Template Binding</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.OperationImpl#getOwnedTemplateSignature <em>Owned Template Signature</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.OperationImpl#getFeaturingClassifiers <em>Featuring Classifier</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.OperationImpl#getNamespace <em>Namespace</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.OperationImpl#getRedefinitionContexts <em>Redefinition Context</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.OperationImpl#getRedefinedElements <em>Redefined Element</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.OperationImpl#getOwnedRules <em>Owned Rule</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.OperationImpl#getBodyCondition <em>Body Condition</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.OperationImpl#getClass_ <em>Class</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.OperationImpl#getDatatype <em>Datatype</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.OperationImpl#getInterface <em>Interface</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.OperationImpl#isOrdered <em>Is Ordered</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.OperationImpl#isQuery <em>Is Query</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.OperationImpl#isUnique <em>Is Unique</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.OperationImpl#getLower <em>Lower</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.OperationImpl#getPostconditions <em>Postcondition</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.OperationImpl#getPreconditions <em>Precondition</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.OperationImpl#getRedefinedOperations <em>Redefined Operation</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.OperationImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.OperationImpl#getUpper <em>Upper</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.OperationImpl#getRaisedExceptions <em>Raised Exception</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.OperationImpl#getOwnedParameters <em>Owned Parameter</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OperationImpl
		extends BehavioralFeatureImpl
		implements Operation {

	/**
	 * The cached value of the '{@link #getTemplateParameter() <em>Template Parameter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTemplateParameter()
	 * @generated
	 * @ordered
	 */
	protected TemplateParameter templateParameter;

	/**
	 * The cached value of the '{@link #getTemplateBindings() <em>Template Binding</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTemplateBindings()
	 * @generated
	 * @ordered
	 */
	protected EList<TemplateBinding> templateBindings;

	/**
	 * The cached value of the '{@link #getOwnedTemplateSignature() <em>Owned Template Signature</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedTemplateSignature()
	 * @generated
	 * @ordered
	 */
	protected TemplateSignature ownedTemplateSignature;

	/**
	 * The cached value of the '{@link #getBodyCondition() <em>Body Condition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBodyCondition()
	 * @generated
	 * @ordered
	 */
	protected Constraint bodyCondition;

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
	protected static final int IS_QUERY_EFLAG = 1 << 17;

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
	 * The cached value of the '{@link #getPostconditions() <em>Postcondition</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPostconditions()
	 * @generated
	 * @ordered
	 */
	protected EList<Constraint> postconditions;

	/**
	 * The cached value of the '{@link #getPreconditions() <em>Precondition</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreconditions()
	 * @generated
	 * @ordered
	 */
	protected EList<Constraint> preconditions;

	/**
	 * The cached value of the '{@link #getRedefinedOperations() <em>Redefined Operation</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRedefinedOperations()
	 * @generated
	 * @ordered
	 */
	protected EList<Operation> redefinedOperations;

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
	@Override
	protected EClass eStaticClass() {
		return UMLPackage.Literals.OPERATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Element getOwner() {
		Element owner = basicGetOwner();
		return owner != null && owner.eIsProxy()
			? (Element) eResolveProxy((InternalEObject) owner)
			: owner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemplateParameter getTemplateParameter() {
		if (templateParameter != null && templateParameter.eIsProxy()) {
			InternalEObject oldTemplateParameter = (InternalEObject) templateParameter;
			templateParameter = (TemplateParameter) eResolveProxy(
				oldTemplateParameter);
			if (templateParameter != oldTemplateParameter) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
						UMLPackage.OPERATION__TEMPLATE_PARAMETER,
						oldTemplateParameter, templateParameter));
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
	public NotificationChain basicSetTemplateParameterGen(
			TemplateParameter newTemplateParameter, NotificationChain msgs) {
		if (newTemplateParameter != null
			&& !(newTemplateParameter instanceof OperationTemplateParameter)) {
			throw new IllegalArgumentException(
				"newTemplateParameter must be an instance of OperationTemplateParameter"); //$NON-NLS-1$
		}
		TemplateParameter oldTemplateParameter = templateParameter;
		templateParameter = newTemplateParameter;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
				Notification.SET, UMLPackage.OPERATION__TEMPLATE_PARAMETER,
				oldTemplateParameter, newTemplateParameter);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	public NotificationChain basicSetTemplateParameter(
			TemplateParameter newTemplateParameter, NotificationChain msgs) {
		msgs = basicSetTemplateParameterGen(newTemplateParameter, msgs);

		Resource.Internal eInternalResource = eInternalResource();

		if (eInternalResource == null || !eInternalResource.isLoading()) {
			TemplateParameter owningTemplateParameter = basicGetOwningTemplateParameter();

			if (owningTemplateParameter != null
				&& owningTemplateParameter != newTemplateParameter) {

				setOwningTemplateParameter(null);
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
		if (newTemplateParameter != null
			&& !(newTemplateParameter instanceof OperationTemplateParameter)) {
			throw new IllegalArgumentException(
				"newTemplateParameter must be an instance of OperationTemplateParameter"); //$NON-NLS-1$
		}
		if (newTemplateParameter != templateParameter) {
			NotificationChain msgs = null;
			if (templateParameter != null)
				msgs = ((InternalEObject) templateParameter).eInverseRemove(
					this, UMLPackage.TEMPLATE_PARAMETER__PARAMETERED_ELEMENT,
					TemplateParameter.class, msgs);
			if (newTemplateParameter != null)
				msgs = ((InternalEObject) newTemplateParameter).eInverseAdd(
					this, UMLPackage.TEMPLATE_PARAMETER__PARAMETERED_ELEMENT,
					TemplateParameter.class, msgs);
			msgs = basicSetTemplateParameter(newTemplateParameter, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.OPERATION__TEMPLATE_PARAMETER, newTemplateParameter,
				newTemplateParameter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTemplateParameter() {
		return templateParameter != null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemplateParameter getOwningTemplateParameter() {
		if (eContainerFeatureID() != UMLPackage.OPERATION__OWNING_TEMPLATE_PARAMETER)
			return null;
		return (TemplateParameter) eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemplateParameter basicGetOwningTemplateParameter() {
		if (eContainerFeatureID() != UMLPackage.OPERATION__OWNING_TEMPLATE_PARAMETER)
			return null;
		return (TemplateParameter) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwningTemplateParameter(
			TemplateParameter newOwningTemplateParameter,
			NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newOwningTemplateParameter,
			UMLPackage.OPERATION__OWNING_TEMPLATE_PARAMETER, msgs);
		Resource.Internal eInternalResource = eInternalResource();
		if (eInternalResource == null || !eInternalResource.isLoading()) {
			if (newOwningTemplateParameter != null) {
				if (newOwningTemplateParameter != templateParameter) {
					setTemplateParameter(newOwningTemplateParameter);
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
	public void setOwningTemplateParameter(
			TemplateParameter newOwningTemplateParameter) {
		if (newOwningTemplateParameter != eInternalContainer()
			|| (eContainerFeatureID() != UMLPackage.OPERATION__OWNING_TEMPLATE_PARAMETER
				&& newOwningTemplateParameter != null)) {
			if (EcoreUtil.isAncestor(this, newOwningTemplateParameter))
				throw new IllegalArgumentException(
					"Recursive containment not allowed for " + toString()); //$NON-NLS-1$
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOwningTemplateParameter != null)
				msgs = ((InternalEObject) newOwningTemplateParameter)
					.eInverseAdd(this,
						UMLPackage.TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT,
						TemplateParameter.class, msgs);
			msgs = basicSetOwningTemplateParameter(newOwningTemplateParameter,
				msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.OPERATION__OWNING_TEMPLATE_PARAMETER,
				newOwningTemplateParameter, newOwningTemplateParameter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Element> getOwnedElements() {
		CacheAdapter cache = getCacheAdapter();
		if (cache != null) {
			Resource eResource = eResource();
			@SuppressWarnings("unchecked")
			EList<Element> ownedElements = (EList<Element>) cache.get(eResource,
				this, UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
			if (ownedElements == null) {
				cache.put(eResource, this,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT,
					ownedElements = new DerivedUnionEObjectEList<Element>(
						Element.class, this,
						UMLPackage.OPERATION__OWNED_ELEMENT,
						OWNED_ELEMENT_ESUBSETS));
			}
			return ownedElements;
		}
		return new DerivedUnionEObjectEList<Element>(Element.class, this,
			UMLPackage.OPERATION__OWNED_ELEMENT, OWNED_ELEMENT_ESUBSETS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TemplateBinding> getTemplateBindings() {
		if (templateBindings == null) {
			templateBindings = new EObjectContainmentWithInverseEList.Resolving<TemplateBinding>(
				TemplateBinding.class, this,
				UMLPackage.OPERATION__TEMPLATE_BINDING,
				UMLPackage.TEMPLATE_BINDING__BOUND_ELEMENT);
		}
		return templateBindings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemplateBinding createTemplateBinding(TemplateSignature signature) {
		TemplateBinding newTemplateBinding = (TemplateBinding) create(
			UMLPackage.Literals.TEMPLATE_BINDING);
		getTemplateBindings().add(newTemplateBinding);
		if (signature != null)
			newTemplateBinding.setSignature(signature);
		return newTemplateBinding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemplateBinding getTemplateBinding(TemplateSignature signature) {
		return getTemplateBinding(signature, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemplateBinding getTemplateBinding(TemplateSignature signature,
			boolean createOnDemand) {
		templateBindingLoop : for (TemplateBinding templateBinding : getTemplateBindings()) {
			if (signature != null
				&& !signature.equals(templateBinding.getSignature()))
				continue templateBindingLoop;
			return templateBinding;
		}
		return createOnDemand
			? createTemplateBinding(signature)
			: null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemplateSignature getOwnedTemplateSignature() {
		if (ownedTemplateSignature != null
			&& ownedTemplateSignature.eIsProxy()) {
			InternalEObject oldOwnedTemplateSignature = (InternalEObject) ownedTemplateSignature;
			ownedTemplateSignature = (TemplateSignature) eResolveProxy(
				oldOwnedTemplateSignature);
			if (ownedTemplateSignature != oldOwnedTemplateSignature) {
				InternalEObject newOwnedTemplateSignature = (InternalEObject) ownedTemplateSignature;
				NotificationChain msgs = oldOwnedTemplateSignature
					.eInverseRemove(this,
						UMLPackage.TEMPLATE_SIGNATURE__TEMPLATE,
						TemplateSignature.class, null);
				if (newOwnedTemplateSignature.eInternalContainer() == null) {
					msgs = newOwnedTemplateSignature.eInverseAdd(this,
						UMLPackage.TEMPLATE_SIGNATURE__TEMPLATE,
						TemplateSignature.class, msgs);
				}
				if (msgs != null)
					msgs.dispatch();
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
						UMLPackage.OPERATION__OWNED_TEMPLATE_SIGNATURE,
						oldOwnedTemplateSignature, ownedTemplateSignature));
			}
		}
		return ownedTemplateSignature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemplateSignature basicGetOwnedTemplateSignature() {
		return ownedTemplateSignature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnedTemplateSignature(
			TemplateSignature newOwnedTemplateSignature,
			NotificationChain msgs) {
		TemplateSignature oldOwnedTemplateSignature = ownedTemplateSignature;
		ownedTemplateSignature = newOwnedTemplateSignature;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
				Notification.SET,
				UMLPackage.OPERATION__OWNED_TEMPLATE_SIGNATURE,
				oldOwnedTemplateSignature, newOwnedTemplateSignature);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwnedTemplateSignature(
			TemplateSignature newOwnedTemplateSignature) {
		if (newOwnedTemplateSignature != ownedTemplateSignature) {
			NotificationChain msgs = null;
			if (ownedTemplateSignature != null)
				msgs = ((InternalEObject) ownedTemplateSignature)
					.eInverseRemove(this,
						UMLPackage.TEMPLATE_SIGNATURE__TEMPLATE,
						TemplateSignature.class, msgs);
			if (newOwnedTemplateSignature != null)
				msgs = ((InternalEObject) newOwnedTemplateSignature)
					.eInverseAdd(this, UMLPackage.TEMPLATE_SIGNATURE__TEMPLATE,
						TemplateSignature.class, msgs);
			msgs = basicSetOwnedTemplateSignature(newOwnedTemplateSignature,
				msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.OPERATION__OWNED_TEMPLATE_SIGNATURE,
				newOwnedTemplateSignature, newOwnedTemplateSignature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemplateSignature createOwnedTemplateSignature(EClass eClass) {
		TemplateSignature newOwnedTemplateSignature = (TemplateSignature) create(
			eClass);
		setOwnedTemplateSignature(newOwnedTemplateSignature);
		return newOwnedTemplateSignature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemplateSignature createOwnedTemplateSignature() {
		return createOwnedTemplateSignature(
			UMLPackage.Literals.TEMPLATE_SIGNATURE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Classifier> getRedefinitionContexts() {
		CacheAdapter cache = getCacheAdapter();
		if (cache != null) {
			Resource eResource = eResource();
			@SuppressWarnings("unchecked")
			EList<Classifier> redefinitionContexts = (EList<Classifier>) cache
				.get(eResource, this,
					UMLPackage.Literals.REDEFINABLE_ELEMENT__REDEFINITION_CONTEXT);
			if (redefinitionContexts == null) {
				cache.put(eResource, this,
					UMLPackage.Literals.REDEFINABLE_ELEMENT__REDEFINITION_CONTEXT,
					redefinitionContexts = new DerivedUnionEObjectEList<Classifier>(
						Classifier.class, this,
						UMLPackage.OPERATION__REDEFINITION_CONTEXT,
						REDEFINITION_CONTEXT_ESUBSETS));
			}
			return redefinitionContexts;
		}
		return new DerivedUnionEObjectEList<Classifier>(Classifier.class, this,
			UMLPackage.OPERATION__REDEFINITION_CONTEXT,
			REDEFINITION_CONTEXT_ESUBSETS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Classifier> getFeaturingClassifiers() {
		CacheAdapter cache = getCacheAdapter();
		if (cache != null) {
			Resource eResource = eResource();
			@SuppressWarnings("unchecked")
			EList<Classifier> featuringClassifiers = (EList<Classifier>) cache
				.get(eResource, this,
					UMLPackage.Literals.FEATURE__FEATURING_CLASSIFIER);
			if (featuringClassifiers == null) {
				cache.put(eResource, this,
					UMLPackage.Literals.FEATURE__FEATURING_CLASSIFIER,
					featuringClassifiers = new DerivedUnionEObjectEList<Classifier>(
						Classifier.class, this,
						UMLPackage.OPERATION__FEATURING_CLASSIFIER,
						FEATURING_CLASSIFIER_ESUBSETS));
			}
			return featuringClassifiers;
		}
		return new DerivedUnionEObjectEList<Classifier>(Classifier.class, this,
			UMLPackage.OPERATION__FEATURING_CLASSIFIER,
			FEATURING_CLASSIFIER_ESUBSETS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RedefinableElement> getRedefinedElements() {
		CacheAdapter cache = getCacheAdapter();
		if (cache != null) {
			Resource eResource = eResource();
			@SuppressWarnings("unchecked")
			EList<RedefinableElement> redefinedElements = (EList<RedefinableElement>) cache
				.get(eResource, this,
					UMLPackage.Literals.REDEFINABLE_ELEMENT__REDEFINED_ELEMENT);
			if (redefinedElements == null) {
				cache.put(eResource, this,
					UMLPackage.Literals.REDEFINABLE_ELEMENT__REDEFINED_ELEMENT,
					redefinedElements = new DerivedUnionEObjectEList<RedefinableElement>(
						RedefinableElement.class, this,
						UMLPackage.OPERATION__REDEFINED_ELEMENT,
						REDEFINED_ELEMENT_ESUBSETS));
			}
			return redefinedElements;
		}
		return new DerivedUnionEObjectEList<RedefinableElement>(
			RedefinableElement.class, this,
			UMLPackage.OPERATION__REDEFINED_ELEMENT,
			REDEFINED_ELEMENT_ESUBSETS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Constraint> getOwnedRules() {
		if (ownedRules == null) {
			ownedRules = new SubsetSupersetEObjectContainmentWithInverseEList.Resolving<Constraint>(
				Constraint.class, this, UMLPackage.OPERATION__OWNED_RULE, null,
				OWNED_RULE_ESUBSETS, UMLPackage.CONSTRAINT__CONTEXT);
		}
		return ownedRules;
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
		if (newIsQuery)
			eFlags |= IS_QUERY_EFLAG;
		else
			eFlags &= ~IS_QUERY_EFLAG;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.OPERATION__IS_QUERY, oldIsQuery, newIsQuery));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isOrdered() {
		return OperationOperations.isOrdered(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isUnique() {
		return OperationOperations.isUnique(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getLower() {
		return OperationOperations.getLower(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getUpper() {
		return OperationOperations.getUpper(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.uml2.uml.Class getClass_() {
		if (eContainerFeatureID() != UMLPackage.OPERATION__CLASS)
			return null;
		return (org.eclipse.uml2.uml.Class) eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.uml2.uml.Class basicGetClass_() {
		if (eContainerFeatureID() != UMLPackage.OPERATION__CLASS)
			return null;
		return (org.eclipse.uml2.uml.Class) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetClass_(org.eclipse.uml2.uml.Class newClass,
			NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newClass,
			UMLPackage.OPERATION__CLASS, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClass_(org.eclipse.uml2.uml.Class newClass) {
		if (newClass != eInternalContainer()
			|| (eContainerFeatureID() != UMLPackage.OPERATION__CLASS
				&& newClass != null)) {
			if (EcoreUtil.isAncestor(this, newClass))
				throw new IllegalArgumentException(
					"Recursive containment not allowed for " + toString()); //$NON-NLS-1$
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newClass != null)
				msgs = ((InternalEObject) newClass).eInverseAdd(this,
					UMLPackage.CLASS__OWNED_OPERATION,
					org.eclipse.uml2.uml.Class.class, msgs);
			msgs = basicSetClass_(newClass, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.OPERATION__CLASS, newClass, newClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Constraint> getPreconditions() {
		if (preconditions == null) {
			preconditions = new SubsetSupersetEObjectResolvingEList<Constraint>(
				Constraint.class, this, UMLPackage.OPERATION__PRECONDITION,
				PRECONDITION_ESUPERSETS, null);
		}
		return preconditions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Constraint> getPostconditions() {
		if (postconditions == null) {
			postconditions = new SubsetSupersetEObjectResolvingEList<Constraint>(
				Constraint.class, this, UMLPackage.OPERATION__POSTCONDITION,
				POSTCONDITION_ESUPERSETS, null);
		}
		return postconditions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Operation> getRedefinedOperations() {
		if (redefinedOperations == null) {
			redefinedOperations = new EObjectResolvingEList<Operation>(
				Operation.class, this,
				UMLPackage.OPERATION__REDEFINED_OPERATION);
		}
		return redefinedOperations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operation getRedefinedOperation(String name,
			EList<String> ownedParameterNames,
			EList<Type> ownedParameterTypes) {
		return getRedefinedOperation(name, ownedParameterNames,
			ownedParameterTypes, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operation getRedefinedOperation(String name,
			EList<String> ownedParameterNames, EList<Type> ownedParameterTypes,
			boolean ignoreCase) {
		redefinedOperationLoop : for (Operation redefinedOperation : getRedefinedOperations()) {
			if (name != null && !(ignoreCase
				? name.equalsIgnoreCase(redefinedOperation.getName())
				: name.equals(redefinedOperation.getName())))
				continue redefinedOperationLoop;
			EList<Parameter> ownedParameterList = redefinedOperation
				.getOwnedParameters();
			int ownedParameterListSize = ownedParameterList.size();
			if (ownedParameterNames != null
				&& ownedParameterNames.size() != ownedParameterListSize
				|| (ownedParameterTypes != null
					&& ownedParameterTypes.size() != ownedParameterListSize))
				continue redefinedOperationLoop;
			for (int j = 0; j < ownedParameterListSize; j++) {
				Parameter ownedParameter = ownedParameterList.get(j);
				if (ownedParameterNames != null && !(ignoreCase
					? (ownedParameterNames.get(j))
						.equalsIgnoreCase(ownedParameter.getName())
					: ownedParameterNames.get(j)
						.equals(ownedParameter.getName())))
					continue redefinedOperationLoop;
				if (ownedParameterTypes != null && !ownedParameterTypes.get(j)
					.equals(ownedParameter.getType()))
					continue redefinedOperationLoop;
			}
			return redefinedOperation;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType getDatatype() {
		if (eContainerFeatureID() != UMLPackage.OPERATION__DATATYPE)
			return null;
		return (DataType) eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType basicGetDatatype() {
		if (eContainerFeatureID() != UMLPackage.OPERATION__DATATYPE)
			return null;
		return (DataType) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDatatype(DataType newDatatype,
			NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newDatatype,
			UMLPackage.OPERATION__DATATYPE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDatatype(DataType newDatatype) {
		if (newDatatype != eInternalContainer()
			|| (eContainerFeatureID() != UMLPackage.OPERATION__DATATYPE
				&& newDatatype != null)) {
			if (EcoreUtil.isAncestor(this, newDatatype))
				throw new IllegalArgumentException(
					"Recursive containment not allowed for " + toString()); //$NON-NLS-1$
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newDatatype != null)
				msgs = ((InternalEObject) newDatatype).eInverseAdd(this,
					UMLPackage.DATA_TYPE__OWNED_OPERATION, DataType.class,
					msgs);
			msgs = basicSetDatatype(newDatatype, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.OPERATION__DATATYPE, newDatatype, newDatatype));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Constraint getBodyCondition() {
		if (bodyCondition != null && bodyCondition.eIsProxy()) {
			InternalEObject oldBodyCondition = (InternalEObject) bodyCondition;
			bodyCondition = (Constraint) eResolveProxy(oldBodyCondition);
			if (bodyCondition != oldBodyCondition) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
						UMLPackage.OPERATION__BODY_CONDITION, oldBodyCondition,
						bodyCondition));
			}
		}
		return bodyCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Constraint basicGetBodyCondition() {
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
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.OPERATION__BODY_CONDITION, oldBodyCondition,
				bodyCondition));
		Resource.Internal eInternalResource = eInternalResource();
		if (eInternalResource == null || !eInternalResource.isLoading()) {
			if (newBodyCondition != null) {
				EList<Constraint> ownedRules = getOwnedRules();
				if (!ownedRules.contains(newBodyCondition)) {
					ownedRules.add(newBodyCondition);
				}
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Constraint createBodyCondition(String name, EClass eClass) {
		Constraint newBodyCondition = (Constraint) create(eClass);
		setBodyCondition(newBodyCondition);
		if (name != null)
			newBodyCondition.setName(name);
		return newBodyCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Constraint createBodyCondition(String name) {
		return createBodyCondition(name, UMLPackage.Literals.CONSTRAINT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type getType() {
		Type type = basicGetType();
		return type != null && type.eIsProxy()
			? (Type) eResolveProxy((InternalEObject) type)
			: type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type basicGetType() {
		return OperationOperations.getType(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Interface getInterface() {
		if (eContainerFeatureID() != UMLPackage.OPERATION__INTERFACE)
			return null;
		return (Interface) eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Interface basicGetInterface() {
		if (eContainerFeatureID() != UMLPackage.OPERATION__INTERFACE)
			return null;
		return (Interface) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInterface(Interface newInterface,
			NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newInterface,
			UMLPackage.OPERATION__INTERFACE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInterface(Interface newInterface) {
		if (newInterface != eInternalContainer()
			|| (eContainerFeatureID() != UMLPackage.OPERATION__INTERFACE
				&& newInterface != null)) {
			if (EcoreUtil.isAncestor(this, newInterface))
				throw new IllegalArgumentException(
					"Recursive containment not allowed for " + toString()); //$NON-NLS-1$
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newInterface != null)
				msgs = ((InternalEObject) newInterface).eInverseAdd(this,
					UMLPackage.INTERFACE__OWNED_OPERATION, Interface.class,
					msgs);
			msgs = basicSetInterface(newInterface, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.OPERATION__INTERFACE, newInterface, newInterface));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Parameter> getOwnedParameters() {
		if (ownedParameters == null) {
			ownedParameters = new EObjectContainmentEList.Resolving<Parameter>(
				Parameter.class, this, UMLPackage.OPERATION__OWNED_PARAMETER);
		}
		return ownedParameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parameter createOwnedParameter(String name, Type type) {
		Parameter newOwnedParameter = (Parameter) create(
			UMLPackage.Literals.PARAMETER);
		getOwnedParameters().add(newOwnedParameter);
		if (name != null)
			newOwnedParameter.setName(name);
		if (type != null)
			newOwnedParameter.setType(type);
		return newOwnedParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parameter getOwnedParameter(String name, Type type) {
		return getOwnedParameter(name, type, false, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parameter getOwnedParameter(String name, Type type,
			boolean ignoreCase, boolean createOnDemand) {
		ownedParameterLoop : for (Parameter ownedParameter : getOwnedParameters()) {
			if (name != null && !(ignoreCase
				? name.equalsIgnoreCase(ownedParameter.getName())
				: name.equals(ownedParameter.getName())))
				continue ownedParameterLoop;
			if (type != null && !type.equals(ownedParameter.getType()))
				continue ownedParameterLoop;
			return ownedParameter;
		}
		return createOnDemand
			? createOwnedParameter(name, type)
			: null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOwnedParameters() {
		return ownedParameters != null && !ownedParameters.isEmpty();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Type> getRaisedExceptions() {
		if (raisedExceptions == null) {
			raisedExceptions = new EObjectResolvingEList<Type>(Type.class, this,
				UMLPackage.OPERATION__RAISED_EXCEPTION);
		}
		return raisedExceptions;
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
	public Type getRaisedException(String name, boolean ignoreCase,
			EClass eClass) {
		raisedExceptionLoop : for (Type raisedException : getRaisedExceptions()) {
			if (eClass != null && !eClass.isInstance(raisedException))
				continue raisedExceptionLoop;
			if (name != null && !(ignoreCase
				? name.equalsIgnoreCase(raisedException.getName())
				: name.equals(raisedException.getName())))
				continue raisedExceptionLoop;
			return raisedException;
		}
		return null;
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
	public boolean isCompatibleWith(ParameterableElement p) {
		return ParameterableElementOperations.isCompatibleWith(this, p);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isTemplateParameter() {
		return ParameterableElementOperations.isTemplateParameter(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ParameterableElement> parameterableElements() {
		CacheAdapter cache = getCacheAdapter();
		if (cache != null) {
			@SuppressWarnings("unchecked")
			EList<ParameterableElement> result = (EList<ParameterableElement>) cache
				.get(this,
					UMLPackage.Literals.TEMPLATEABLE_ELEMENT___PARAMETERABLE_ELEMENTS);
			if (result == null) {
				cache.put(this,
					UMLPackage.Literals.TEMPLATEABLE_ELEMENT___PARAMETERABLE_ELEMENTS,
					result = TemplateableElementOperations
						.parameterableElements(this));
			}
			return result;
		}
		return TemplateableElementOperations.parameterableElements(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isTemplate() {
		return TemplateableElementOperations.isTemplate(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAtMostOneReturn(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return OperationOperations.validateAtMostOneReturn(this, diagnostics,
			context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOnlyBodyForQuery(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return OperationOperations.validateOnlyBodyForQuery(this, diagnostics,
			context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parameter getReturnResult() {
		return OperationOperations.getReturnResult(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsOrdered(boolean newIsOrdered) {
		OperationOperations.setIsOrdered(this, newIsOrdered);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsUnique(boolean newIsUnique) {
		OperationOperations.setIsUnique(this, newIsUnique);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLower(int newLower) {
		OperationOperations.setLower(this, newLower);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(Type newType) {
		OperationOperations.setType(this, newType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUpper(int newUpper) {
		OperationOperations.setUpper(this, newUpper);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Parameter> returnResult() {
		CacheAdapter cache = getCacheAdapter();
		if (cache != null) {
			@SuppressWarnings("unchecked")
			EList<Parameter> result = (EList<Parameter>) cache.get(this,
				UMLPackage.Literals.OPERATION___RETURN_RESULT);
			if (result == null) {
				cache.put(this, UMLPackage.Literals.OPERATION___RETURN_RESULT,
					result = OperationOperations.returnResult(this));
			}
			return result;
		}
		return OperationOperations.returnResult(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isConsistentWith(RedefinableElement redefiningElement) {
		return OperationOperations.isConsistentWith(this, redefiningElement);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UMLPackage.OPERATION__EANNOTATIONS :
				return ((InternalEList<InternalEObject>) (InternalEList<?>) getEAnnotations())
					.basicAdd(otherEnd, msgs);
			case UMLPackage.OPERATION__OWNED_RULE :
				return ((InternalEList<InternalEObject>) (InternalEList<?>) getOwnedRules())
					.basicAdd(otherEnd, msgs);
			case UMLPackage.OPERATION__ELEMENT_IMPORT :
				return ((InternalEList<InternalEObject>) (InternalEList<?>) getElementImports())
					.basicAdd(otherEnd, msgs);
			case UMLPackage.OPERATION__PACKAGE_IMPORT :
				return ((InternalEList<InternalEObject>) (InternalEList<?>) getPackageImports())
					.basicAdd(otherEnd, msgs);
			case UMLPackage.OPERATION__METHOD :
				return ((InternalEList<InternalEObject>) (InternalEList<?>) getMethods())
					.basicAdd(otherEnd, msgs);
			case UMLPackage.OPERATION__OWNING_TEMPLATE_PARAMETER :
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOwningTemplateParameter(
					(TemplateParameter) otherEnd, msgs);
			case UMLPackage.OPERATION__TEMPLATE_PARAMETER :
				if (templateParameter != null)
					msgs = ((InternalEObject) templateParameter).eInverseRemove(
						this,
						UMLPackage.TEMPLATE_PARAMETER__PARAMETERED_ELEMENT,
						TemplateParameter.class, msgs);
				return basicSetTemplateParameter((TemplateParameter) otherEnd,
					msgs);
			case UMLPackage.OPERATION__TEMPLATE_BINDING :
				return ((InternalEList<InternalEObject>) (InternalEList<?>) getTemplateBindings())
					.basicAdd(otherEnd, msgs);
			case UMLPackage.OPERATION__OWNED_TEMPLATE_SIGNATURE :
				if (ownedTemplateSignature != null)
					msgs = ((InternalEObject) ownedTemplateSignature)
						.eInverseRemove(this,
							EOPPOSITE_FEATURE_BASE
								- UMLPackage.OPERATION__OWNED_TEMPLATE_SIGNATURE,
							null, msgs);
				return basicSetOwnedTemplateSignature(
					(TemplateSignature) otherEnd, msgs);
			case UMLPackage.OPERATION__CLASS :
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetClass_((org.eclipse.uml2.uml.Class) otherEnd,
					msgs);
			case UMLPackage.OPERATION__DATATYPE :
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetDatatype((DataType) otherEnd, msgs);
			case UMLPackage.OPERATION__INTERFACE :
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetInterface((Interface) otherEnd, msgs);
		}
		return eDynamicInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UMLPackage.OPERATION__EANNOTATIONS :
				return ((InternalEList<?>) getEAnnotations())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.OPERATION__OWNED_COMMENT :
				return ((InternalEList<?>) getOwnedComments())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.OPERATION__NAME_EXPRESSION :
				return basicSetNameExpression(null, msgs);
			case UMLPackage.OPERATION__OWNED_RULE :
				return ((InternalEList<?>) getOwnedRules())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.OPERATION__ELEMENT_IMPORT :
				return ((InternalEList<?>) getElementImports())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.OPERATION__PACKAGE_IMPORT :
				return ((InternalEList<?>) getPackageImports())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.OPERATION__METHOD :
				return ((InternalEList<?>) getMethods()).basicRemove(otherEnd,
					msgs);
			case UMLPackage.OPERATION__OWNED_PARAMETER :
				return ((InternalEList<?>) getOwnedParameters())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.OPERATION__OWNED_PARAMETER_SET :
				return ((InternalEList<?>) getOwnedParameterSets())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.OPERATION__OWNING_TEMPLATE_PARAMETER :
				return basicSetOwningTemplateParameter(null, msgs);
			case UMLPackage.OPERATION__TEMPLATE_PARAMETER :
				return basicSetTemplateParameter(null, msgs);
			case UMLPackage.OPERATION__TEMPLATE_BINDING :
				return ((InternalEList<?>) getTemplateBindings())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.OPERATION__OWNED_TEMPLATE_SIGNATURE :
				return basicSetOwnedTemplateSignature(null, msgs);
			case UMLPackage.OPERATION__CLASS :
				return basicSetClass_(null, msgs);
			case UMLPackage.OPERATION__DATATYPE :
				return basicSetDatatype(null, msgs);
			case UMLPackage.OPERATION__INTERFACE :
				return basicSetInterface(null, msgs);
		}
		return eDynamicInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(
			NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case UMLPackage.OPERATION__OWNING_TEMPLATE_PARAMETER :
				return eInternalContainer().eInverseRemove(this,
					UMLPackage.TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT,
					TemplateParameter.class, msgs);
			case UMLPackage.OPERATION__CLASS :
				return eInternalContainer().eInverseRemove(this,
					UMLPackage.CLASS__OWNED_OPERATION,
					org.eclipse.uml2.uml.Class.class, msgs);
			case UMLPackage.OPERATION__DATATYPE :
				return eInternalContainer().eInverseRemove(this,
					UMLPackage.DATA_TYPE__OWNED_OPERATION, DataType.class,
					msgs);
			case UMLPackage.OPERATION__INTERFACE :
				return eInternalContainer().eInverseRemove(this,
					UMLPackage.INTERFACE__OWNED_OPERATION, Interface.class,
					msgs);
		}
		return eDynamicBasicRemoveFromContainer(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UMLPackage.OPERATION__EANNOTATIONS :
				return getEAnnotations();
			case UMLPackage.OPERATION__OWNED_COMMENT :
				return getOwnedComments();
			case UMLPackage.OPERATION__OWNED_ELEMENT :
				return getOwnedElements();
			case UMLPackage.OPERATION__OWNER :
				if (resolve)
					return getOwner();
				return basicGetOwner();
			case UMLPackage.OPERATION__CLIENT_DEPENDENCY :
				return getClientDependencies();
			case UMLPackage.OPERATION__NAME :
				return getName();
			case UMLPackage.OPERATION__NAME_EXPRESSION :
				if (resolve)
					return getNameExpression();
				return basicGetNameExpression();
			case UMLPackage.OPERATION__NAMESPACE :
				if (resolve)
					return getNamespace();
				return basicGetNamespace();
			case UMLPackage.OPERATION__QUALIFIED_NAME :
				return getQualifiedName();
			case UMLPackage.OPERATION__VISIBILITY :
				return getVisibility();
			case UMLPackage.OPERATION__OWNED_RULE :
				return getOwnedRules();
			case UMLPackage.OPERATION__ELEMENT_IMPORT :
				return getElementImports();
			case UMLPackage.OPERATION__PACKAGE_IMPORT :
				return getPackageImports();
			case UMLPackage.OPERATION__OWNED_MEMBER :
				return getOwnedMembers();
			case UMLPackage.OPERATION__IMPORTED_MEMBER :
				return getImportedMembers();
			case UMLPackage.OPERATION__MEMBER :
				return getMembers();
			case UMLPackage.OPERATION__IS_LEAF :
				return isLeaf();
			case UMLPackage.OPERATION__REDEFINED_ELEMENT :
				return getRedefinedElements();
			case UMLPackage.OPERATION__REDEFINITION_CONTEXT :
				return getRedefinitionContexts();
			case UMLPackage.OPERATION__FEATURING_CLASSIFIER :
				return getFeaturingClassifiers();
			case UMLPackage.OPERATION__IS_STATIC :
				return isStatic();
			case UMLPackage.OPERATION__CONCURRENCY :
				return getConcurrency();
			case UMLPackage.OPERATION__IS_ABSTRACT :
				return isAbstract();
			case UMLPackage.OPERATION__METHOD :
				return getMethods();
			case UMLPackage.OPERATION__OWNED_PARAMETER :
				return getOwnedParameters();
			case UMLPackage.OPERATION__OWNED_PARAMETER_SET :
				return getOwnedParameterSets();
			case UMLPackage.OPERATION__RAISED_EXCEPTION :
				return getRaisedExceptions();
			case UMLPackage.OPERATION__OWNING_TEMPLATE_PARAMETER :
				if (resolve)
					return getOwningTemplateParameter();
				return basicGetOwningTemplateParameter();
			case UMLPackage.OPERATION__TEMPLATE_PARAMETER :
				if (resolve)
					return getTemplateParameter();
				return basicGetTemplateParameter();
			case UMLPackage.OPERATION__TEMPLATE_BINDING :
				return getTemplateBindings();
			case UMLPackage.OPERATION__OWNED_TEMPLATE_SIGNATURE :
				if (resolve)
					return getOwnedTemplateSignature();
				return basicGetOwnedTemplateSignature();
			case UMLPackage.OPERATION__BODY_CONDITION :
				if (resolve)
					return getBodyCondition();
				return basicGetBodyCondition();
			case UMLPackage.OPERATION__CLASS :
				if (resolve)
					return getClass_();
				return basicGetClass_();
			case UMLPackage.OPERATION__DATATYPE :
				if (resolve)
					return getDatatype();
				return basicGetDatatype();
			case UMLPackage.OPERATION__INTERFACE :
				if (resolve)
					return getInterface();
				return basicGetInterface();
			case UMLPackage.OPERATION__IS_ORDERED :
				return isOrdered();
			case UMLPackage.OPERATION__IS_QUERY :
				return isQuery();
			case UMLPackage.OPERATION__IS_UNIQUE :
				return isUnique();
			case UMLPackage.OPERATION__LOWER :
				return getLower();
			case UMLPackage.OPERATION__POSTCONDITION :
				return getPostconditions();
			case UMLPackage.OPERATION__PRECONDITION :
				return getPreconditions();
			case UMLPackage.OPERATION__REDEFINED_OPERATION :
				return getRedefinedOperations();
			case UMLPackage.OPERATION__TYPE :
				if (resolve)
					return getType();
				return basicGetType();
			case UMLPackage.OPERATION__UPPER :
				return getUpper();
		}
		return eDynamicGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case UMLPackage.OPERATION__EANNOTATIONS :
				getEAnnotations().clear();
				getEAnnotations()
					.addAll((Collection<? extends EAnnotation>) newValue);
				return;
			case UMLPackage.OPERATION__OWNED_COMMENT :
				getOwnedComments().clear();
				getOwnedComments()
					.addAll((Collection<? extends Comment>) newValue);
				return;
			case UMLPackage.OPERATION__NAME :
				setName((String) newValue);
				return;
			case UMLPackage.OPERATION__NAME_EXPRESSION :
				setNameExpression((StringExpression) newValue);
				return;
			case UMLPackage.OPERATION__VISIBILITY :
				setVisibility((VisibilityKind) newValue);
				return;
			case UMLPackage.OPERATION__OWNED_RULE :
				getOwnedRules().clear();
				getOwnedRules()
					.addAll((Collection<? extends Constraint>) newValue);
				return;
			case UMLPackage.OPERATION__ELEMENT_IMPORT :
				getElementImports().clear();
				getElementImports()
					.addAll((Collection<? extends ElementImport>) newValue);
				return;
			case UMLPackage.OPERATION__PACKAGE_IMPORT :
				getPackageImports().clear();
				getPackageImports()
					.addAll((Collection<? extends PackageImport>) newValue);
				return;
			case UMLPackage.OPERATION__IS_LEAF :
				setIsLeaf((Boolean) newValue);
				return;
			case UMLPackage.OPERATION__IS_STATIC :
				setIsStatic((Boolean) newValue);
				return;
			case UMLPackage.OPERATION__CONCURRENCY :
				setConcurrency((CallConcurrencyKind) newValue);
				return;
			case UMLPackage.OPERATION__IS_ABSTRACT :
				setIsAbstract((Boolean) newValue);
				return;
			case UMLPackage.OPERATION__METHOD :
				getMethods().clear();
				getMethods().addAll((Collection<? extends Behavior>) newValue);
				return;
			case UMLPackage.OPERATION__OWNED_PARAMETER :
				getOwnedParameters().clear();
				getOwnedParameters()
					.addAll((Collection<? extends Parameter>) newValue);
				return;
			case UMLPackage.OPERATION__OWNED_PARAMETER_SET :
				getOwnedParameterSets().clear();
				getOwnedParameterSets()
					.addAll((Collection<? extends ParameterSet>) newValue);
				return;
			case UMLPackage.OPERATION__RAISED_EXCEPTION :
				getRaisedExceptions().clear();
				getRaisedExceptions()
					.addAll((Collection<? extends Type>) newValue);
				return;
			case UMLPackage.OPERATION__OWNING_TEMPLATE_PARAMETER :
				setOwningTemplateParameter((TemplateParameter) newValue);
				return;
			case UMLPackage.OPERATION__TEMPLATE_PARAMETER :
				setTemplateParameter((TemplateParameter) newValue);
				return;
			case UMLPackage.OPERATION__TEMPLATE_BINDING :
				getTemplateBindings().clear();
				getTemplateBindings()
					.addAll((Collection<? extends TemplateBinding>) newValue);
				return;
			case UMLPackage.OPERATION__OWNED_TEMPLATE_SIGNATURE :
				setOwnedTemplateSignature((TemplateSignature) newValue);
				return;
			case UMLPackage.OPERATION__BODY_CONDITION :
				setBodyCondition((Constraint) newValue);
				return;
			case UMLPackage.OPERATION__CLASS :
				setClass_((org.eclipse.uml2.uml.Class) newValue);
				return;
			case UMLPackage.OPERATION__DATATYPE :
				setDatatype((DataType) newValue);
				return;
			case UMLPackage.OPERATION__INTERFACE :
				setInterface((Interface) newValue);
				return;
			case UMLPackage.OPERATION__IS_QUERY :
				setIsQuery((Boolean) newValue);
				return;
			case UMLPackage.OPERATION__POSTCONDITION :
				getPostconditions().clear();
				getPostconditions()
					.addAll((Collection<? extends Constraint>) newValue);
				return;
			case UMLPackage.OPERATION__PRECONDITION :
				getPreconditions().clear();
				getPreconditions()
					.addAll((Collection<? extends Constraint>) newValue);
				return;
			case UMLPackage.OPERATION__REDEFINED_OPERATION :
				getRedefinedOperations().clear();
				getRedefinedOperations()
					.addAll((Collection<? extends Operation>) newValue);
				return;
		}
		eDynamicSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case UMLPackage.OPERATION__EANNOTATIONS :
				getEAnnotations().clear();
				return;
			case UMLPackage.OPERATION__OWNED_COMMENT :
				getOwnedComments().clear();
				return;
			case UMLPackage.OPERATION__NAME :
				unsetName();
				return;
			case UMLPackage.OPERATION__NAME_EXPRESSION :
				setNameExpression((StringExpression) null);
				return;
			case UMLPackage.OPERATION__VISIBILITY :
				unsetVisibility();
				return;
			case UMLPackage.OPERATION__OWNED_RULE :
				getOwnedRules().clear();
				return;
			case UMLPackage.OPERATION__ELEMENT_IMPORT :
				getElementImports().clear();
				return;
			case UMLPackage.OPERATION__PACKAGE_IMPORT :
				getPackageImports().clear();
				return;
			case UMLPackage.OPERATION__IS_LEAF :
				setIsLeaf(IS_LEAF_EDEFAULT);
				return;
			case UMLPackage.OPERATION__IS_STATIC :
				setIsStatic(IS_STATIC_EDEFAULT);
				return;
			case UMLPackage.OPERATION__CONCURRENCY :
				setConcurrency(CONCURRENCY_EDEFAULT);
				return;
			case UMLPackage.OPERATION__IS_ABSTRACT :
				setIsAbstract(IS_ABSTRACT_EDEFAULT);
				return;
			case UMLPackage.OPERATION__METHOD :
				getMethods().clear();
				return;
			case UMLPackage.OPERATION__OWNED_PARAMETER :
				getOwnedParameters().clear();
				return;
			case UMLPackage.OPERATION__OWNED_PARAMETER_SET :
				getOwnedParameterSets().clear();
				return;
			case UMLPackage.OPERATION__RAISED_EXCEPTION :
				getRaisedExceptions().clear();
				return;
			case UMLPackage.OPERATION__OWNING_TEMPLATE_PARAMETER :
				setOwningTemplateParameter((TemplateParameter) null);
				return;
			case UMLPackage.OPERATION__TEMPLATE_PARAMETER :
				setTemplateParameter((TemplateParameter) null);
				return;
			case UMLPackage.OPERATION__TEMPLATE_BINDING :
				getTemplateBindings().clear();
				return;
			case UMLPackage.OPERATION__OWNED_TEMPLATE_SIGNATURE :
				setOwnedTemplateSignature((TemplateSignature) null);
				return;
			case UMLPackage.OPERATION__BODY_CONDITION :
				setBodyCondition((Constraint) null);
				return;
			case UMLPackage.OPERATION__CLASS :
				setClass_((org.eclipse.uml2.uml.Class) null);
				return;
			case UMLPackage.OPERATION__DATATYPE :
				setDatatype((DataType) null);
				return;
			case UMLPackage.OPERATION__INTERFACE :
				setInterface((Interface) null);
				return;
			case UMLPackage.OPERATION__IS_QUERY :
				setIsQuery(IS_QUERY_EDEFAULT);
				return;
			case UMLPackage.OPERATION__POSTCONDITION :
				getPostconditions().clear();
				return;
			case UMLPackage.OPERATION__PRECONDITION :
				getPreconditions().clear();
				return;
			case UMLPackage.OPERATION__REDEFINED_OPERATION :
				getRedefinedOperations().clear();
				return;
		}
		eDynamicUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case UMLPackage.OPERATION__EANNOTATIONS :
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UMLPackage.OPERATION__OWNED_COMMENT :
				return ownedComments != null && !ownedComments.isEmpty();
			case UMLPackage.OPERATION__OWNED_ELEMENT :
				return isSetOwnedElements();
			case UMLPackage.OPERATION__OWNER :
				return isSetOwner();
			case UMLPackage.OPERATION__CLIENT_DEPENDENCY :
				return !getClientDependencies().isEmpty();
			case UMLPackage.OPERATION__NAME :
				return isSetName();
			case UMLPackage.OPERATION__NAME_EXPRESSION :
				return nameExpression != null;
			case UMLPackage.OPERATION__NAMESPACE :
				return isSetNamespace();
			case UMLPackage.OPERATION__QUALIFIED_NAME :
				return QUALIFIED_NAME_EDEFAULT == null
					? getQualifiedName() != null
					: !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case UMLPackage.OPERATION__VISIBILITY :
				return isSetVisibility();
			case UMLPackage.OPERATION__OWNED_RULE :
				return ownedRules != null && !ownedRules.isEmpty();
			case UMLPackage.OPERATION__ELEMENT_IMPORT :
				return elementImports != null && !elementImports.isEmpty();
			case UMLPackage.OPERATION__PACKAGE_IMPORT :
				return packageImports != null && !packageImports.isEmpty();
			case UMLPackage.OPERATION__OWNED_MEMBER :
				return isSetOwnedMembers();
			case UMLPackage.OPERATION__IMPORTED_MEMBER :
				return !getImportedMembers().isEmpty();
			case UMLPackage.OPERATION__MEMBER :
				return isSetMembers();
			case UMLPackage.OPERATION__IS_LEAF :
				return ((eFlags & IS_LEAF_EFLAG) != 0) != IS_LEAF_EDEFAULT;
			case UMLPackage.OPERATION__REDEFINED_ELEMENT :
				return isSetRedefinedElements();
			case UMLPackage.OPERATION__REDEFINITION_CONTEXT :
				return isSetRedefinitionContexts();
			case UMLPackage.OPERATION__FEATURING_CLASSIFIER :
				return isSetFeaturingClassifiers();
			case UMLPackage.OPERATION__IS_STATIC :
				return ((eFlags & IS_STATIC_EFLAG) != 0) != IS_STATIC_EDEFAULT;
			case UMLPackage.OPERATION__CONCURRENCY :
				return (eFlags
					& CONCURRENCY_EFLAG) != CONCURRENCY_EFLAG_DEFAULT;
			case UMLPackage.OPERATION__IS_ABSTRACT :
				return ((eFlags
					& IS_ABSTRACT_EFLAG) != 0) != IS_ABSTRACT_EDEFAULT;
			case UMLPackage.OPERATION__METHOD :
				return methods != null && !methods.isEmpty();
			case UMLPackage.OPERATION__OWNED_PARAMETER :
				return isSetOwnedParameters();
			case UMLPackage.OPERATION__OWNED_PARAMETER_SET :
				return ownedParameterSets != null
					&& !ownedParameterSets.isEmpty();
			case UMLPackage.OPERATION__RAISED_EXCEPTION :
				return isSetRaisedExceptions();
			case UMLPackage.OPERATION__OWNING_TEMPLATE_PARAMETER :
				return basicGetOwningTemplateParameter() != null;
			case UMLPackage.OPERATION__TEMPLATE_PARAMETER :
				return isSetTemplateParameter();
			case UMLPackage.OPERATION__TEMPLATE_BINDING :
				return templateBindings != null && !templateBindings.isEmpty();
			case UMLPackage.OPERATION__OWNED_TEMPLATE_SIGNATURE :
				return ownedTemplateSignature != null;
			case UMLPackage.OPERATION__BODY_CONDITION :
				return bodyCondition != null;
			case UMLPackage.OPERATION__CLASS :
				return basicGetClass_() != null;
			case UMLPackage.OPERATION__DATATYPE :
				return basicGetDatatype() != null;
			case UMLPackage.OPERATION__INTERFACE :
				return basicGetInterface() != null;
			case UMLPackage.OPERATION__IS_ORDERED :
				return isOrdered() != IS_ORDERED_EDEFAULT;
			case UMLPackage.OPERATION__IS_QUERY :
				return ((eFlags & IS_QUERY_EFLAG) != 0) != IS_QUERY_EDEFAULT;
			case UMLPackage.OPERATION__IS_UNIQUE :
				return isUnique() != IS_UNIQUE_EDEFAULT;
			case UMLPackage.OPERATION__LOWER :
				return getLower() != LOWER_EDEFAULT;
			case UMLPackage.OPERATION__POSTCONDITION :
				return postconditions != null && !postconditions.isEmpty();
			case UMLPackage.OPERATION__PRECONDITION :
				return preconditions != null && !preconditions.isEmpty();
			case UMLPackage.OPERATION__REDEFINED_OPERATION :
				return redefinedOperations != null
					&& !redefinedOperations.isEmpty();
			case UMLPackage.OPERATION__TYPE :
				return basicGetType() != null;
			case UMLPackage.OPERATION__UPPER :
				return getUpper() != UPPER_EDEFAULT;
		}
		return eDynamicIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID,
			Class<?> baseClass) {
		if (baseClass == ParameterableElement.class) {
			switch (derivedFeatureID) {
				case UMLPackage.OPERATION__OWNING_TEMPLATE_PARAMETER :
					return UMLPackage.PARAMETERABLE_ELEMENT__OWNING_TEMPLATE_PARAMETER;
				case UMLPackage.OPERATION__TEMPLATE_PARAMETER :
					return UMLPackage.PARAMETERABLE_ELEMENT__TEMPLATE_PARAMETER;
				default :
					return -1;
			}
		}
		if (baseClass == TemplateableElement.class) {
			switch (derivedFeatureID) {
				case UMLPackage.OPERATION__TEMPLATE_BINDING :
					return UMLPackage.TEMPLATEABLE_ELEMENT__TEMPLATE_BINDING;
				case UMLPackage.OPERATION__OWNED_TEMPLATE_SIGNATURE :
					return UMLPackage.TEMPLATEABLE_ELEMENT__OWNED_TEMPLATE_SIGNATURE;
				default :
					return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID,
			Class<?> baseClass) {
		if (baseClass == ParameterableElement.class) {
			switch (baseFeatureID) {
				case UMLPackage.PARAMETERABLE_ELEMENT__OWNING_TEMPLATE_PARAMETER :
					return UMLPackage.OPERATION__OWNING_TEMPLATE_PARAMETER;
				case UMLPackage.PARAMETERABLE_ELEMENT__TEMPLATE_PARAMETER :
					return UMLPackage.OPERATION__TEMPLATE_PARAMETER;
				default :
					return -1;
			}
		}
		if (baseClass == TemplateableElement.class) {
			switch (baseFeatureID) {
				case UMLPackage.TEMPLATEABLE_ELEMENT__TEMPLATE_BINDING :
					return UMLPackage.OPERATION__TEMPLATE_BINDING;
				case UMLPackage.TEMPLATEABLE_ELEMENT__OWNED_TEMPLATE_SIGNATURE :
					return UMLPackage.OPERATION__OWNED_TEMPLATE_SIGNATURE;
				default :
					return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedOperationID(int baseOperationID, Class<?> baseClass) {
		if (baseClass == ParameterableElement.class) {
			switch (baseOperationID) {
				case UMLPackage.PARAMETERABLE_ELEMENT___IS_COMPATIBLE_WITH__PARAMETERABLEELEMENT :
					return UMLPackage.OPERATION___IS_COMPATIBLE_WITH__PARAMETERABLEELEMENT;
				case UMLPackage.PARAMETERABLE_ELEMENT___IS_TEMPLATE_PARAMETER :
					return UMLPackage.OPERATION___IS_TEMPLATE_PARAMETER;
				default :
					return -1;
			}
		}
		if (baseClass == TemplateableElement.class) {
			switch (baseOperationID) {
				case UMLPackage.TEMPLATEABLE_ELEMENT___IS_TEMPLATE :
					return UMLPackage.OPERATION___IS_TEMPLATE;
				case UMLPackage.TEMPLATEABLE_ELEMENT___PARAMETERABLE_ELEMENTS :
					return UMLPackage.OPERATION___PARAMETERABLE_ELEMENTS;
				default :
					return -1;
			}
		}
		return super.eDerivedOperationID(baseOperationID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments)
			throws InvocationTargetException {
		switch (operationID) {
			case UMLPackage.OPERATION___GET_EANNOTATION__STRING :
				return getEAnnotation((String) arguments.get(0));
			case UMLPackage.OPERATION___VALIDATE_HAS_OWNER__DIAGNOSTICCHAIN_MAP :
				return validateHasOwner((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.OPERATION___VALIDATE_NOT_OWN_SELF__DIAGNOSTICCHAIN_MAP :
				return validateNotOwnSelf((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.OPERATION___ADD_KEYWORD__STRING :
				return addKeyword((String) arguments.get(0));
			case UMLPackage.OPERATION___APPLY_STEREOTYPE__STEREOTYPE :
				return applyStereotype((Stereotype) arguments.get(0));
			case UMLPackage.OPERATION___CREATE_EANNOTATION__STRING :
				return createEAnnotation((String) arguments.get(0));
			case UMLPackage.OPERATION___DESTROY :
				destroy();
				return null;
			case UMLPackage.OPERATION___GET_KEYWORDS :
				return getKeywords();
			case UMLPackage.OPERATION___GET_APPLICABLE_STEREOTYPE__STRING :
				return getApplicableStereotype((String) arguments.get(0));
			case UMLPackage.OPERATION___GET_APPLICABLE_STEREOTYPES :
				return getApplicableStereotypes();
			case UMLPackage.OPERATION___GET_APPLIED_STEREOTYPE__STRING :
				return getAppliedStereotype((String) arguments.get(0));
			case UMLPackage.OPERATION___GET_APPLIED_STEREOTYPES :
				return getAppliedStereotypes();
			case UMLPackage.OPERATION___GET_APPLIED_SUBSTEREOTYPE__STEREOTYPE_STRING :
				return getAppliedSubstereotype((Stereotype) arguments.get(0),
					(String) arguments.get(1));
			case UMLPackage.OPERATION___GET_APPLIED_SUBSTEREOTYPES__STEREOTYPE :
				return getAppliedSubstereotypes((Stereotype) arguments.get(0));
			case UMLPackage.OPERATION___GET_MODEL :
				return getModel();
			case UMLPackage.OPERATION___GET_NEAREST_PACKAGE :
				return getNearestPackage();
			case UMLPackage.OPERATION___GET_RELATIONSHIPS :
				return getRelationships();
			case UMLPackage.OPERATION___GET_RELATIONSHIPS__ECLASS :
				return getRelationships((EClass) arguments.get(0));
			case UMLPackage.OPERATION___GET_REQUIRED_STEREOTYPE__STRING :
				return getRequiredStereotype((String) arguments.get(0));
			case UMLPackage.OPERATION___GET_REQUIRED_STEREOTYPES :
				return getRequiredStereotypes();
			case UMLPackage.OPERATION___GET_SOURCE_DIRECTED_RELATIONSHIPS :
				return getSourceDirectedRelationships();
			case UMLPackage.OPERATION___GET_SOURCE_DIRECTED_RELATIONSHIPS__ECLASS :
				return getSourceDirectedRelationships(
					(EClass) arguments.get(0));
			case UMLPackage.OPERATION___GET_STEREOTYPE_APPLICATION__STEREOTYPE :
				return getStereotypeApplication((Stereotype) arguments.get(0));
			case UMLPackage.OPERATION___GET_STEREOTYPE_APPLICATIONS :
				return getStereotypeApplications();
			case UMLPackage.OPERATION___GET_TARGET_DIRECTED_RELATIONSHIPS :
				return getTargetDirectedRelationships();
			case UMLPackage.OPERATION___GET_TARGET_DIRECTED_RELATIONSHIPS__ECLASS :
				return getTargetDirectedRelationships(
					(EClass) arguments.get(0));
			case UMLPackage.OPERATION___GET_VALUE__STEREOTYPE_STRING :
				return getValue((Stereotype) arguments.get(0),
					(String) arguments.get(1));
			case UMLPackage.OPERATION___HAS_KEYWORD__STRING :
				return hasKeyword((String) arguments.get(0));
			case UMLPackage.OPERATION___HAS_VALUE__STEREOTYPE_STRING :
				return hasValue((Stereotype) arguments.get(0),
					(String) arguments.get(1));
			case UMLPackage.OPERATION___IS_STEREOTYPE_APPLICABLE__STEREOTYPE :
				return isStereotypeApplicable((Stereotype) arguments.get(0));
			case UMLPackage.OPERATION___IS_STEREOTYPE_APPLIED__STEREOTYPE :
				return isStereotypeApplied((Stereotype) arguments.get(0));
			case UMLPackage.OPERATION___IS_STEREOTYPE_REQUIRED__STEREOTYPE :
				return isStereotypeRequired((Stereotype) arguments.get(0));
			case UMLPackage.OPERATION___REMOVE_KEYWORD__STRING :
				return removeKeyword((String) arguments.get(0));
			case UMLPackage.OPERATION___SET_VALUE__STEREOTYPE_STRING_OBJECT :
				setValue((Stereotype) arguments.get(0),
					(String) arguments.get(1), arguments.get(2));
				return null;
			case UMLPackage.OPERATION___UNAPPLY_STEREOTYPE__STEREOTYPE :
				return unapplyStereotype((Stereotype) arguments.get(0));
			case UMLPackage.OPERATION___ALL_OWNED_ELEMENTS :
				return allOwnedElements();
			case UMLPackage.OPERATION___MUST_BE_OWNED :
				return mustBeOwned();
			case UMLPackage.OPERATION___VALIDATE_VISIBILITY_NEEDS_OWNERSHIP__DIAGNOSTICCHAIN_MAP :
				return validateVisibilityNeedsOwnership(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.OPERATION___VALIDATE_HAS_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP :
				return validateHasQualifiedName(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.OPERATION___VALIDATE_HAS_NO_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP :
				return validateHasNoQualifiedName(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.OPERATION___CREATE_DEPENDENCY__NAMEDELEMENT :
				return createDependency((NamedElement) arguments.get(0));
			case UMLPackage.OPERATION___CREATE_USAGE__NAMEDELEMENT :
				return createUsage((NamedElement) arguments.get(0));
			case UMLPackage.OPERATION___GET_LABEL :
				return getLabel();
			case UMLPackage.OPERATION___GET_LABEL__BOOLEAN :
				return getLabel((Boolean) arguments.get(0));
			case UMLPackage.OPERATION___GET_NAMESPACE :
				return getNamespace();
			case UMLPackage.OPERATION___ALL_NAMESPACES :
				return allNamespaces();
			case UMLPackage.OPERATION___ALL_OWNING_PACKAGES :
				return allOwningPackages();
			case UMLPackage.OPERATION___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE :
				return isDistinguishableFrom((NamedElement) arguments.get(0),
					(Namespace) arguments.get(1));
			case UMLPackage.OPERATION___GET_QUALIFIED_NAME :
				return getQualifiedName();
			case UMLPackage.OPERATION___SEPARATOR :
				return separator();
			case UMLPackage.OPERATION___GET_CLIENT_DEPENDENCIES :
				return getClientDependencies();
			case UMLPackage.OPERATION___VALIDATE_MEMBERS_DISTINGUISHABLE__DIAGNOSTICCHAIN_MAP :
				return validateMembersDistinguishable(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.OPERATION___VALIDATE_CANNOT_IMPORT_SELF__DIAGNOSTICCHAIN_MAP :
				return validateCannotImportSelf(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.OPERATION___VALIDATE_CANNOT_IMPORT_OWNED_MEMBERS__DIAGNOSTICCHAIN_MAP :
				return validateCannotImportOwnedMembers(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.OPERATION___CREATE_ELEMENT_IMPORT__PACKAGEABLEELEMENT_VISIBILITYKIND :
				return createElementImport(
					(PackageableElement) arguments.get(0),
					(VisibilityKind) arguments.get(1));
			case UMLPackage.OPERATION___CREATE_PACKAGE_IMPORT__PACKAGE_VISIBILITYKIND :
				return createPackageImport(
					(org.eclipse.uml2.uml.Package) arguments.get(0),
					(VisibilityKind) arguments.get(1));
			case UMLPackage.OPERATION___GET_IMPORTED_ELEMENTS :
				return getImportedElements();
			case UMLPackage.OPERATION___GET_IMPORTED_PACKAGES :
				return getImportedPackages();
			case UMLPackage.OPERATION___GET_OWNED_MEMBERS :
				return getOwnedMembers();
			case UMLPackage.OPERATION___EXCLUDE_COLLISIONS__ELIST :
				return excludeCollisions(
					(EList<PackageableElement>) arguments.get(0));
			case UMLPackage.OPERATION___GET_NAMES_OF_MEMBER__NAMEDELEMENT :
				return getNamesOfMember((NamedElement) arguments.get(0));
			case UMLPackage.OPERATION___IMPORT_MEMBERS__ELIST :
				return importMembers(
					(EList<PackageableElement>) arguments.get(0));
			case UMLPackage.OPERATION___GET_IMPORTED_MEMBERS :
				return getImportedMembers();
			case UMLPackage.OPERATION___MEMBERS_ARE_DISTINGUISHABLE :
				return membersAreDistinguishable();
			case UMLPackage.OPERATION___VALIDATE_REDEFINITION_CONSISTENT__DIAGNOSTICCHAIN_MAP :
				return validateRedefinitionConsistent(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.OPERATION___VALIDATE_NON_LEAF_REDEFINITION__DIAGNOSTICCHAIN_MAP :
				return validateNonLeafRedefinition(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.OPERATION___VALIDATE_REDEFINITION_CONTEXT_VALID__DIAGNOSTICCHAIN_MAP :
				return validateRedefinitionContextValid(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.OPERATION___IS_CONSISTENT_WITH__REDEFINABLEELEMENT :
				return isConsistentWith((RedefinableElement) arguments.get(0));
			case UMLPackage.OPERATION___IS_REDEFINITION_CONTEXT_VALID__REDEFINABLEELEMENT :
				return isRedefinitionContextValid(
					(RedefinableElement) arguments.get(0));
			case UMLPackage.OPERATION___VALIDATE_ABSTRACT_NO_METHOD__DIAGNOSTICCHAIN_MAP :
				return validateAbstractNoMethod(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.OPERATION___CREATE_RETURN_RESULT__STRING_TYPE :
				return createReturnResult((String) arguments.get(0),
					(Type) arguments.get(1));
			case UMLPackage.OPERATION___INPUT_PARAMETERS :
				return inputParameters();
			case UMLPackage.OPERATION___OUTPUT_PARAMETERS :
				return outputParameters();
			case UMLPackage.OPERATION___IS_COMPATIBLE_WITH__PARAMETERABLEELEMENT :
				return isCompatibleWith(
					(ParameterableElement) arguments.get(0));
			case UMLPackage.OPERATION___IS_TEMPLATE_PARAMETER :
				return isTemplateParameter();
			case UMLPackage.OPERATION___IS_TEMPLATE :
				return isTemplate();
			case UMLPackage.OPERATION___PARAMETERABLE_ELEMENTS :
				return parameterableElements();
			case UMLPackage.OPERATION___VALIDATE_AT_MOST_ONE_RETURN__DIAGNOSTICCHAIN_MAP :
				return validateAtMostOneReturn(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.OPERATION___VALIDATE_ONLY_BODY_FOR_QUERY__DIAGNOSTICCHAIN_MAP :
				return validateOnlyBodyForQuery(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.OPERATION___GET_RETURN_RESULT :
				return getReturnResult();
			case UMLPackage.OPERATION___SET_IS_ORDERED__BOOLEAN :
				setIsOrdered((Boolean) arguments.get(0));
				return null;
			case UMLPackage.OPERATION___SET_IS_UNIQUE__BOOLEAN :
				setIsUnique((Boolean) arguments.get(0));
				return null;
			case UMLPackage.OPERATION___SET_LOWER__INT :
				setLower((Integer) arguments.get(0));
				return null;
			case UMLPackage.OPERATION___SET_TYPE__TYPE :
				setType((Type) arguments.get(0));
				return null;
			case UMLPackage.OPERATION___SET_UPPER__INT :
				setUpper((Integer) arguments.get(0));
				return null;
			case UMLPackage.OPERATION___IS_ORDERED :
				return isOrdered();
			case UMLPackage.OPERATION___IS_UNIQUE :
				return isUnique();
			case UMLPackage.OPERATION___GET_LOWER :
				return getLower();
			case UMLPackage.OPERATION___RETURN_RESULT :
				return returnResult();
			case UMLPackage.OPERATION___GET_TYPE :
				return getType();
			case UMLPackage.OPERATION___GET_UPPER :
				return getUpper();
		}
		return eDynamicInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

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
	@Override
	public Element basicGetOwner() {
		TemplateParameter owningTemplateParameter = basicGetOwningTemplateParameter();
		if (owningTemplateParameter != null) {
			return owningTemplateParameter;
		}
		return super.basicGetOwner();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetOwner() {
		return super.isSetOwner()
			|| eIsSet(UMLPackage.OPERATION__OWNING_TEMPLATE_PARAMETER);
	}

	/**
	 * The array of subset feature identifiers for the '{@link #getOwnedElements() <em>Owned Element</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedElements()
	 * @generated
	 * @ordered
	 */
	protected static final int[] OWNED_ELEMENT_ESUBSETS = new int[]{
		UMLPackage.OPERATION__OWNED_COMMENT,
		UMLPackage.OPERATION__NAME_EXPRESSION,
		UMLPackage.OPERATION__ELEMENT_IMPORT,
		UMLPackage.OPERATION__PACKAGE_IMPORT,
		UMLPackage.OPERATION__OWNED_MEMBER,
		UMLPackage.OPERATION__TEMPLATE_BINDING,
		UMLPackage.OPERATION__OWNED_TEMPLATE_SIGNATURE};

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetOwnedElements() {
		return super.isSetOwnedElements()
			|| eIsSet(UMLPackage.OPERATION__TEMPLATE_BINDING)
			|| eIsSet(UMLPackage.OPERATION__OWNED_TEMPLATE_SIGNATURE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Namespace getNamespace() {
		Namespace namespace = basicGetNamespace();
		return namespace != null && namespace.eIsProxy()
			? (Namespace) eResolveProxy((InternalEObject) namespace)
			: namespace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetRedefinitionContexts() {
		return super.isSetRedefinitionContexts()
			|| eIsSet(UMLPackage.OPERATION__CLASS)
			|| eIsSet(UMLPackage.OPERATION__DATATYPE)
			|| eIsSet(UMLPackage.OPERATION__INTERFACE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Namespace basicGetNamespace() {
		org.eclipse.uml2.uml.Class class_ = basicGetClass_();
		if (class_ != null) {
			return class_;
		}
		DataType datatype = basicGetDatatype();
		if (datatype != null) {
			return datatype;
		}
		Interface interface_ = basicGetInterface();
		if (interface_ != null) {
			return interface_;
		}
		return super.basicGetNamespace();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetNamespace() {
		return super.isSetNamespace() || eIsSet(UMLPackage.OPERATION__CLASS)
			|| eIsSet(UMLPackage.OPERATION__DATATYPE)
			|| eIsSet(UMLPackage.OPERATION__INTERFACE);
	}

	/**
	 * The array of subset feature identifiers for the '{@link #getFeaturingClassifiers() <em>Featuring Classifier</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeaturingClassifiers()
	 * @generated
	 * @ordered
	 */
	protected static final int[] FEATURING_CLASSIFIER_ESUBSETS = new int[]{
		UMLPackage.OPERATION__CLASS, UMLPackage.OPERATION__DATATYPE,
		UMLPackage.OPERATION__INTERFACE};

	/**
	 * The array of subset feature identifiers for the '{@link #getRedefinitionContexts() <em>Redefinition Context</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRedefinitionContexts()
	 * @generated
	 * @ordered
	 */
	protected static final int[] REDEFINITION_CONTEXT_ESUBSETS = new int[]{
		UMLPackage.OPERATION__CLASS, UMLPackage.OPERATION__DATATYPE,
		UMLPackage.OPERATION__INTERFACE};

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetFeaturingClassifiers() {
		return super.isSetFeaturingClassifiers()
			|| eIsSet(UMLPackage.OPERATION__CLASS)
			|| eIsSet(UMLPackage.OPERATION__DATATYPE)
			|| eIsSet(UMLPackage.OPERATION__INTERFACE);
	}

	/**
	 * The array of subset feature identifiers for the '{@link #getRedefinedElements() <em>Redefined Element</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRedefinedElements()
	 * @generated
	 * @ordered
	 */
	protected static final int[] REDEFINED_ELEMENT_ESUBSETS = new int[]{
		UMLPackage.OPERATION__REDEFINED_OPERATION};

	/**
	 * The array of subset feature identifiers for the '{@link #getOwnedRules() <em>Owned Rule</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedRules()
	 * @generated
	 * @ordered
	 */
	protected static final int[] OWNED_RULE_ESUBSETS = new int[]{
		UMLPackage.OPERATION__BODY_CONDITION,
		UMLPackage.OPERATION__POSTCONDITION,
		UMLPackage.OPERATION__PRECONDITION};

	/**
	 * The array of superset feature identifiers for the '{@link #getPostconditions() <em>Postcondition</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPostconditions()
	 * @generated
	 * @ordered
	 */
	protected static final int[] POSTCONDITION_ESUPERSETS = new int[]{
		UMLPackage.OPERATION__OWNED_RULE};

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Constraint createPostcondition(String name, EClass eClass) {
		Constraint newPostcondition = (Constraint) create(eClass);
		getPostconditions().add(newPostcondition);
		if (name != null)
			newPostcondition.setName(name);
		return newPostcondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Constraint createPostcondition(String name) {
		return createPostcondition(name, UMLPackage.Literals.CONSTRAINT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Constraint getPostcondition(String name) {
		return getPostcondition(name, false, null, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Constraint getPostcondition(String name, boolean ignoreCase,
			EClass eClass, boolean createOnDemand) {
		postconditionLoop : for (Constraint postcondition : getPostconditions()) {
			if (eClass != null && !eClass.isInstance(postcondition))
				continue postconditionLoop;
			if (name != null && !(ignoreCase
				? name.equalsIgnoreCase(postcondition.getName())
				: name.equals(postcondition.getName())))
				continue postconditionLoop;
			return postcondition;
		}
		return createOnDemand && eClass != null
			? createPostcondition(name, eClass)
			: null;
	}

	/**
	 * The array of superset feature identifiers for the '{@link #getPreconditions() <em>Precondition</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreconditions()
	 * @generated
	 * @ordered
	 */
	protected static final int[] PRECONDITION_ESUPERSETS = new int[]{
		UMLPackage.OPERATION__OWNED_RULE};

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Constraint createPrecondition(String name, EClass eClass) {
		Constraint newPrecondition = (Constraint) create(eClass);
		getPreconditions().add(newPrecondition);
		if (name != null)
			newPrecondition.setName(name);
		return newPrecondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Constraint createPrecondition(String name) {
		return createPrecondition(name, UMLPackage.Literals.CONSTRAINT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Constraint getPrecondition(String name) {
		return getPrecondition(name, false, null, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Constraint getPrecondition(String name, boolean ignoreCase,
			EClass eClass, boolean createOnDemand) {
		preconditionLoop : for (Constraint precondition : getPreconditions()) {
			if (eClass != null && !eClass.isInstance(precondition))
				continue preconditionLoop;
			if (name != null && !(ignoreCase
				? name.equalsIgnoreCase(precondition.getName())
				: name.equals(precondition.getName())))
				continue preconditionLoop;
			return precondition;
		}
		return createOnDemand && eClass != null
			? createPrecondition(name, eClass)
			: null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetRedefinedElements() {
		return super.isSetRedefinedElements()
			|| eIsSet(UMLPackage.OPERATION__REDEFINED_OPERATION);
	}

} //OperationImpl
