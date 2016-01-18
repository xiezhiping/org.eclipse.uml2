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
 *   Kenn Hussey (CEA) - 327039, 351774, 418466, 451350, 485756
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
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.uml2.common.util.CacheAdapter;
import org.eclipse.uml2.common.util.DerivedUnionEObjectEList;

import org.eclipse.uml2.uml.AggregationKind;
import org.eclipse.uml2.uml.Behavior;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.CollaborationUse;
import org.eclipse.uml2.uml.Comment;
import org.eclipse.uml2.uml.Component;
import org.eclipse.uml2.uml.ComponentRealization;
import org.eclipse.uml2.uml.Connector;
import org.eclipse.uml2.uml.Constraint;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.ElementImport;
import org.eclipse.uml2.uml.Enumeration;
import org.eclipse.uml2.uml.Generalization;
import org.eclipse.uml2.uml.GeneralizationSet;
import org.eclipse.uml2.uml.Interface;
import org.eclipse.uml2.uml.InterfaceRealization;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Namespace;
import org.eclipse.uml2.uml.Operation;
import org.eclipse.uml2.uml.PackageImport;
import org.eclipse.uml2.uml.PackageableElement;
import org.eclipse.uml2.uml.ParameterableElement;
import org.eclipse.uml2.uml.PrimitiveType;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.Reception;
import org.eclipse.uml2.uml.RedefinableElement;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.StringExpression;
import org.eclipse.uml2.uml.Substitution;
import org.eclipse.uml2.uml.TemplateBinding;
import org.eclipse.uml2.uml.TemplateParameter;
import org.eclipse.uml2.uml.TemplateSignature;
import org.eclipse.uml2.uml.Type;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.UseCase;
import org.eclipse.uml2.uml.VisibilityKind;

import org.eclipse.uml2.uml.internal.operations.ComponentOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Component</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ComponentImpl#getOwnedMembers <em>Owned Member</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ComponentImpl#getOwnedElements <em>Owned Element</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ComponentImpl#isIndirectlyInstantiated <em>Is Indirectly Instantiated</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ComponentImpl#getPackagedElements <em>Packaged Element</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ComponentImpl#getProvideds <em>Provided</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ComponentImpl#getRealizations <em>Realization</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ComponentImpl#getRequireds <em>Required</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComponentImpl
		extends ClassImpl
		implements Component {

	/**
	 * The default value of the '{@link #isIndirectlyInstantiated() <em>Is Indirectly Instantiated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIndirectlyInstantiated()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_INDIRECTLY_INSTANTIATED_EDEFAULT = true;

	/**
	 * The flag representing the value of the '{@link #isIndirectlyInstantiated() <em>Is Indirectly Instantiated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIndirectlyInstantiated()
	 * @generated
	 * @ordered
	 */
	protected static final int IS_INDIRECTLY_INSTANTIATED_EFLAG = 1 << 16;

	/**
	 * The cached value of the '{@link #getPackagedElements() <em>Packaged Element</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPackagedElements()
	 * @generated
	 * @ordered
	 */
	protected EList<PackageableElement> packagedElements;

	/**
	 * The cached value of the '{@link #getRealizations() <em>Realization</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRealizations()
	 * @generated
	 * @ordered
	 */
	protected EList<ComponentRealization> realizations;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentImpl() {
		super();
		eFlags |= IS_INDIRECTLY_INSTANTIATED_EFLAG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UMLPackage.Literals.COMPONENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<NamedElement> getOwnedMembers() {
		CacheAdapter cache = getCacheAdapter();
		if (cache != null) {
			Resource eResource = eResource();
			@SuppressWarnings("unchecked")
			EList<NamedElement> ownedMembers = (EList<NamedElement>) cache.get(
				eResource, this, UMLPackage.Literals.NAMESPACE__OWNED_MEMBER);
			if (ownedMembers == null) {
				cache.put(eResource, this,
					UMLPackage.Literals.NAMESPACE__OWNED_MEMBER,
					ownedMembers = new DerivedUnionEObjectEList<NamedElement>(
						NamedElement.class, this,
						UMLPackage.COMPONENT__OWNED_MEMBER,
						OWNED_MEMBER_ESUBSETS));
			}
			return ownedMembers;
		}
		return new DerivedUnionEObjectEList<NamedElement>(NamedElement.class,
			this, UMLPackage.COMPONENT__OWNED_MEMBER, OWNED_MEMBER_ESUBSETS);
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
						UMLPackage.COMPONENT__OWNED_ELEMENT,
						OWNED_ELEMENT_ESUBSETS));
			}
			return ownedElements;
		}
		return new DerivedUnionEObjectEList<Element>(Element.class, this,
			UMLPackage.COMPONENT__OWNED_ELEMENT, OWNED_ELEMENT_ESUBSETS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIndirectlyInstantiated() {
		return (eFlags & IS_INDIRECTLY_INSTANTIATED_EFLAG) != 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsIndirectlyInstantiated(
			boolean newIsIndirectlyInstantiated) {
		boolean oldIsIndirectlyInstantiated = (eFlags
			& IS_INDIRECTLY_INSTANTIATED_EFLAG) != 0;
		if (newIsIndirectlyInstantiated)
			eFlags |= IS_INDIRECTLY_INSTANTIATED_EFLAG;
		else
			eFlags &= ~IS_INDIRECTLY_INSTANTIATED_EFLAG;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.COMPONENT__IS_INDIRECTLY_INSTANTIATED,
				oldIsIndirectlyInstantiated, newIsIndirectlyInstantiated));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Interface> getRequireds() {
		CacheAdapter cache = getCacheAdapter();
		if (cache != null) {
			@SuppressWarnings("unchecked")
			EList<Interface> result = (EList<Interface>) cache.get(this,
				UMLPackage.Literals.COMPONENT__REQUIRED);
			if (result == null) {
				cache.put(this, UMLPackage.Literals.COMPONENT__REQUIRED,
					result = ComponentOperations.getRequireds(this));
			}
			return result;
		}
		return ComponentOperations.getRequireds(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Interface getRequired(String name) {
		return getRequired(name, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Interface getRequired(String name, boolean ignoreCase) {
		requiredLoop : for (Interface required : getRequireds()) {
			if (name != null && !(ignoreCase
				? name.equalsIgnoreCase(required.getName())
				: name.equals(required.getName())))
				continue requiredLoop;
			return required;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNoNestedClassifiers(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ComponentOperations.validateNoNestedClassifiers(this,
			diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNoPackagedElements(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ComponentOperations.validateNoPackagedElements(this, diagnostics,
			context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Interface> getProvideds() {
		CacheAdapter cache = getCacheAdapter();
		if (cache != null) {
			@SuppressWarnings("unchecked")
			EList<Interface> result = (EList<Interface>) cache.get(this,
				UMLPackage.Literals.COMPONENT__PROVIDED);
			if (result == null) {
				cache.put(this, UMLPackage.Literals.COMPONENT__PROVIDED,
					result = ComponentOperations.getProvideds(this));
			}
			return result;
		}
		return ComponentOperations.getProvideds(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Interface getProvided(String name) {
		return getProvided(name, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Interface getProvided(String name, boolean ignoreCase) {
		providedLoop : for (Interface provided : getProvideds()) {
			if (name != null && !(ignoreCase
				? name.equalsIgnoreCase(provided.getName())
				: name.equals(provided.getName())))
				continue providedLoop;
			return provided;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PackageableElement> getPackagedElements() {
		if (packagedElements == null) {
			packagedElements = new EObjectContainmentEList.Resolving<PackageableElement>(
				PackageableElement.class, this,
				UMLPackage.COMPONENT__PACKAGED_ELEMENT);
		}
		return packagedElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PackageableElement createPackagedElement(String name,
			EClass eClass) {
		PackageableElement newPackagedElement = (PackageableElement) create(
			eClass);
		getPackagedElements().add(newPackagedElement);
		if (name != null)
			newPackagedElement.setName(name);
		return newPackagedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PackageableElement getPackagedElement(String name) {
		return getPackagedElement(name, false, null, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PackageableElement getPackagedElement(String name,
			boolean ignoreCase, EClass eClass, boolean createOnDemand) {
		packagedElementLoop : for (PackageableElement packagedElement : getPackagedElements()) {
			if (eClass != null && !eClass.isInstance(packagedElement))
				continue packagedElementLoop;
			if (name != null && !(ignoreCase
				? name.equalsIgnoreCase(packagedElement.getName())
				: name.equals(packagedElement.getName())))
				continue packagedElementLoop;
			return packagedElement;
		}
		return createOnDemand && eClass != null
			? createPackagedElement(name, eClass)
			: null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ComponentRealization> getRealizations() {
		if (realizations == null) {
			realizations = new EObjectContainmentWithInverseEList.Resolving<ComponentRealization>(
				ComponentRealization.class, this,
				UMLPackage.COMPONENT__REALIZATION,
				UMLPackage.COMPONENT_REALIZATION__ABSTRACTION);
		}
		return realizations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentRealization createRealization(String name) {
		ComponentRealization newRealization = (ComponentRealization) create(
			UMLPackage.Literals.COMPONENT_REALIZATION);
		getRealizations().add(newRealization);
		if (name != null)
			newRealization.setName(name);
		return newRealization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentRealization getRealization(String name) {
		return getRealization(name, false, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentRealization getRealization(String name, boolean ignoreCase,
			boolean createOnDemand) {
		realizationLoop : for (ComponentRealization realization : getRealizations()) {
			if (name != null && !(ignoreCase
				? name.equalsIgnoreCase(realization.getName())
				: name.equals(realization.getName())))
				continue realizationLoop;
			return realization;
		}
		return createOnDemand
			? createRealization(name)
			: null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.uml2.uml.Class createOwnedClass(String name,
			boolean isAbstract) {
		return ComponentOperations.createOwnedClass(this, name, isAbstract);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Enumeration createOwnedEnumeration(String name) {
		return ComponentOperations.createOwnedEnumeration(this, name);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrimitiveType createOwnedPrimitiveType(String name) {
		return ComponentOperations.createOwnedPrimitiveType(this, name);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Interface createOwnedInterface(String name) {
		return ComponentOperations.createOwnedInterface(this, name);
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
			case UMLPackage.COMPONENT__EANNOTATIONS :
				return ((InternalEList<InternalEObject>) (InternalEList<?>) getEAnnotations())
					.basicAdd(otherEnd, msgs);
			case UMLPackage.COMPONENT__OWNED_RULE :
				return ((InternalEList<InternalEObject>) (InternalEList<?>) getOwnedRules())
					.basicAdd(otherEnd, msgs);
			case UMLPackage.COMPONENT__ELEMENT_IMPORT :
				return ((InternalEList<InternalEObject>) (InternalEList<?>) getElementImports())
					.basicAdd(otherEnd, msgs);
			case UMLPackage.COMPONENT__PACKAGE_IMPORT :
				return ((InternalEList<InternalEObject>) (InternalEList<?>) getPackageImports())
					.basicAdd(otherEnd, msgs);
			case UMLPackage.COMPONENT__OWNING_TEMPLATE_PARAMETER :
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOwningTemplateParameter(
					(TemplateParameter) otherEnd, msgs);
			case UMLPackage.COMPONENT__TEMPLATE_PARAMETER :
				if (templateParameter != null)
					msgs = ((InternalEObject) templateParameter).eInverseRemove(
						this,
						UMLPackage.TEMPLATE_PARAMETER__PARAMETERED_ELEMENT,
						TemplateParameter.class, msgs);
				return basicSetTemplateParameter((TemplateParameter) otherEnd,
					msgs);
			case UMLPackage.COMPONENT__TEMPLATE_BINDING :
				return ((InternalEList<InternalEObject>) (InternalEList<?>) getTemplateBindings())
					.basicAdd(otherEnd, msgs);
			case UMLPackage.COMPONENT__OWNED_TEMPLATE_SIGNATURE :
				if (ownedTemplateSignature != null)
					msgs = ((InternalEObject) ownedTemplateSignature)
						.eInverseRemove(this,
							EOPPOSITE_FEATURE_BASE
								- UMLPackage.COMPONENT__OWNED_TEMPLATE_SIGNATURE,
							null, msgs);
				return basicSetOwnedTemplateSignature(
					(TemplateSignature) otherEnd, msgs);
			case UMLPackage.COMPONENT__GENERALIZATION :
				return ((InternalEList<InternalEObject>) (InternalEList<?>) getGeneralizations())
					.basicAdd(otherEnd, msgs);
			case UMLPackage.COMPONENT__POWERTYPE_EXTENT :
				return ((InternalEList<InternalEObject>) (InternalEList<?>) getPowertypeExtents())
					.basicAdd(otherEnd, msgs);
			case UMLPackage.COMPONENT__USE_CASE :
				return ((InternalEList<InternalEObject>) (InternalEList<?>) getUseCases())
					.basicAdd(otherEnd, msgs);
			case UMLPackage.COMPONENT__SUBSTITUTION :
				return ((InternalEList<InternalEObject>) (InternalEList<?>) getSubstitutions())
					.basicAdd(otherEnd, msgs);
			case UMLPackage.COMPONENT__INTERFACE_REALIZATION :
				return ((InternalEList<InternalEObject>) (InternalEList<?>) getInterfaceRealizations())
					.basicAdd(otherEnd, msgs);
			case UMLPackage.COMPONENT__OWNED_OPERATION :
				return ((InternalEList<InternalEObject>) (InternalEList<?>) getOwnedOperations())
					.basicAdd(otherEnd, msgs);
			case UMLPackage.COMPONENT__REALIZATION :
				return ((InternalEList<InternalEObject>) (InternalEList<?>) getRealizations())
					.basicAdd(otherEnd, msgs);
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
			case UMLPackage.COMPONENT__EANNOTATIONS :
				return ((InternalEList<?>) getEAnnotations())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.COMPONENT__OWNED_COMMENT :
				return ((InternalEList<?>) getOwnedComments())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.COMPONENT__NAME_EXPRESSION :
				return basicSetNameExpression(null, msgs);
			case UMLPackage.COMPONENT__OWNED_RULE :
				return ((InternalEList<?>) getOwnedRules())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.COMPONENT__ELEMENT_IMPORT :
				return ((InternalEList<?>) getElementImports())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.COMPONENT__PACKAGE_IMPORT :
				return ((InternalEList<?>) getPackageImports())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.COMPONENT__OWNING_TEMPLATE_PARAMETER :
				return basicSetOwningTemplateParameter(null, msgs);
			case UMLPackage.COMPONENT__TEMPLATE_PARAMETER :
				return basicSetTemplateParameter(null, msgs);
			case UMLPackage.COMPONENT__TEMPLATE_BINDING :
				return ((InternalEList<?>) getTemplateBindings())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.COMPONENT__OWNED_TEMPLATE_SIGNATURE :
				return basicSetOwnedTemplateSignature(null, msgs);
			case UMLPackage.COMPONENT__COLLABORATION_USE :
				return ((InternalEList<?>) getCollaborationUses())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.COMPONENT__GENERALIZATION :
				return ((InternalEList<?>) getGeneralizations())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.COMPONENT__POWERTYPE_EXTENT :
				return ((InternalEList<?>) getPowertypeExtents())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.COMPONENT__OWNED_USE_CASE :
				return ((InternalEList<?>) getOwnedUseCases())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.COMPONENT__USE_CASE :
				return ((InternalEList<?>) getUseCases()).basicRemove(otherEnd,
					msgs);
			case UMLPackage.COMPONENT__SUBSTITUTION :
				return ((InternalEList<?>) getSubstitutions())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.COMPONENT__OWNED_ATTRIBUTE :
				return ((InternalEList<?>) getOwnedAttributes())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.COMPONENT__OWNED_CONNECTOR :
				return ((InternalEList<?>) getOwnedConnectors())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.COMPONENT__INTERFACE_REALIZATION :
				return ((InternalEList<?>) getInterfaceRealizations())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.COMPONENT__OWNED_BEHAVIOR :
				return ((InternalEList<?>) getOwnedBehaviors())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.COMPONENT__OWNED_OPERATION :
				return ((InternalEList<?>) getOwnedOperations())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.COMPONENT__NESTED_CLASSIFIER :
				return ((InternalEList<?>) getNestedClassifiers())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.COMPONENT__OWNED_RECEPTION :
				return ((InternalEList<?>) getOwnedReceptions())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.COMPONENT__PACKAGED_ELEMENT :
				return ((InternalEList<?>) getPackagedElements())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.COMPONENT__REALIZATION :
				return ((InternalEList<?>) getRealizations())
					.basicRemove(otherEnd, msgs);
		}
		return eDynamicInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UMLPackage.COMPONENT__EANNOTATIONS :
				return getEAnnotations();
			case UMLPackage.COMPONENT__OWNED_COMMENT :
				return getOwnedComments();
			case UMLPackage.COMPONENT__OWNED_ELEMENT :
				return getOwnedElements();
			case UMLPackage.COMPONENT__OWNER :
				if (resolve)
					return getOwner();
				return basicGetOwner();
			case UMLPackage.COMPONENT__CLIENT_DEPENDENCY :
				return getClientDependencies();
			case UMLPackage.COMPONENT__NAME :
				return getName();
			case UMLPackage.COMPONENT__NAME_EXPRESSION :
				if (resolve)
					return getNameExpression();
				return basicGetNameExpression();
			case UMLPackage.COMPONENT__NAMESPACE :
				if (resolve)
					return getNamespace();
				return basicGetNamespace();
			case UMLPackage.COMPONENT__QUALIFIED_NAME :
				return getQualifiedName();
			case UMLPackage.COMPONENT__VISIBILITY :
				return getVisibility();
			case UMLPackage.COMPONENT__OWNED_RULE :
				return getOwnedRules();
			case UMLPackage.COMPONENT__ELEMENT_IMPORT :
				return getElementImports();
			case UMLPackage.COMPONENT__PACKAGE_IMPORT :
				return getPackageImports();
			case UMLPackage.COMPONENT__OWNED_MEMBER :
				return getOwnedMembers();
			case UMLPackage.COMPONENT__IMPORTED_MEMBER :
				return getImportedMembers();
			case UMLPackage.COMPONENT__MEMBER :
				return getMembers();
			case UMLPackage.COMPONENT__IS_LEAF :
				return isLeaf();
			case UMLPackage.COMPONENT__REDEFINED_ELEMENT :
				return getRedefinedElements();
			case UMLPackage.COMPONENT__REDEFINITION_CONTEXT :
				return getRedefinitionContexts();
			case UMLPackage.COMPONENT__OWNING_TEMPLATE_PARAMETER :
				if (resolve)
					return getOwningTemplateParameter();
				return basicGetOwningTemplateParameter();
			case UMLPackage.COMPONENT__TEMPLATE_PARAMETER :
				if (resolve)
					return getTemplateParameter();
				return basicGetTemplateParameter();
			case UMLPackage.COMPONENT__PACKAGE :
				if (resolve)
					return getPackage();
				return basicGetPackage();
			case UMLPackage.COMPONENT__TEMPLATE_BINDING :
				return getTemplateBindings();
			case UMLPackage.COMPONENT__OWNED_TEMPLATE_SIGNATURE :
				if (resolve)
					return getOwnedTemplateSignature();
				return basicGetOwnedTemplateSignature();
			case UMLPackage.COMPONENT__FEATURE :
				return getFeatures();
			case UMLPackage.COMPONENT__ATTRIBUTE :
				return getAttributes();
			case UMLPackage.COMPONENT__COLLABORATION_USE :
				return getCollaborationUses();
			case UMLPackage.COMPONENT__GENERAL :
				return getGenerals();
			case UMLPackage.COMPONENT__GENERALIZATION :
				return getGeneralizations();
			case UMLPackage.COMPONENT__POWERTYPE_EXTENT :
				return getPowertypeExtents();
			case UMLPackage.COMPONENT__INHERITED_MEMBER :
				return getInheritedMembers();
			case UMLPackage.COMPONENT__IS_ABSTRACT :
				return isAbstract();
			case UMLPackage.COMPONENT__IS_FINAL_SPECIALIZATION :
				return isFinalSpecialization();
			case UMLPackage.COMPONENT__OWNED_USE_CASE :
				return getOwnedUseCases();
			case UMLPackage.COMPONENT__USE_CASE :
				return getUseCases();
			case UMLPackage.COMPONENT__REDEFINED_CLASSIFIER :
				return getRedefinedClassifiers();
			case UMLPackage.COMPONENT__REPRESENTATION :
				if (resolve)
					return getRepresentation();
				return basicGetRepresentation();
			case UMLPackage.COMPONENT__SUBSTITUTION :
				return getSubstitutions();
			case UMLPackage.COMPONENT__OWNED_ATTRIBUTE :
				return getOwnedAttributes();
			case UMLPackage.COMPONENT__OWNED_CONNECTOR :
				return getOwnedConnectors();
			case UMLPackage.COMPONENT__PART :
				return getParts();
			case UMLPackage.COMPONENT__ROLE :
				return getRoles();
			case UMLPackage.COMPONENT__OWNED_PORT :
				return getOwnedPorts();
			case UMLPackage.COMPONENT__CLASSIFIER_BEHAVIOR :
				if (resolve)
					return getClassifierBehavior();
				return basicGetClassifierBehavior();
			case UMLPackage.COMPONENT__INTERFACE_REALIZATION :
				return getInterfaceRealizations();
			case UMLPackage.COMPONENT__OWNED_BEHAVIOR :
				return getOwnedBehaviors();
			case UMLPackage.COMPONENT__OWNED_OPERATION :
				return getOwnedOperations();
			case UMLPackage.COMPONENT__EXTENSION :
				return getExtensions();
			case UMLPackage.COMPONENT__IS_ACTIVE :
				return isActive();
			case UMLPackage.COMPONENT__NESTED_CLASSIFIER :
				return getNestedClassifiers();
			case UMLPackage.COMPONENT__OWNED_RECEPTION :
				return getOwnedReceptions();
			case UMLPackage.COMPONENT__SUPER_CLASS :
				return getSuperClasses();
			case UMLPackage.COMPONENT__IS_INDIRECTLY_INSTANTIATED :
				return isIndirectlyInstantiated();
			case UMLPackage.COMPONENT__PACKAGED_ELEMENT :
				return getPackagedElements();
			case UMLPackage.COMPONENT__PROVIDED :
				return getProvideds();
			case UMLPackage.COMPONENT__REALIZATION :
				return getRealizations();
			case UMLPackage.COMPONENT__REQUIRED :
				return getRequireds();
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
			case UMLPackage.COMPONENT__EANNOTATIONS :
				getEAnnotations().clear();
				getEAnnotations()
					.addAll((Collection<? extends EAnnotation>) newValue);
				return;
			case UMLPackage.COMPONENT__OWNED_COMMENT :
				getOwnedComments().clear();
				getOwnedComments()
					.addAll((Collection<? extends Comment>) newValue);
				return;
			case UMLPackage.COMPONENT__NAME :
				setName((String) newValue);
				return;
			case UMLPackage.COMPONENT__NAME_EXPRESSION :
				setNameExpression((StringExpression) newValue);
				return;
			case UMLPackage.COMPONENT__VISIBILITY :
				setVisibility((VisibilityKind) newValue);
				return;
			case UMLPackage.COMPONENT__OWNED_RULE :
				getOwnedRules().clear();
				getOwnedRules()
					.addAll((Collection<? extends Constraint>) newValue);
				return;
			case UMLPackage.COMPONENT__ELEMENT_IMPORT :
				getElementImports().clear();
				getElementImports()
					.addAll((Collection<? extends ElementImport>) newValue);
				return;
			case UMLPackage.COMPONENT__PACKAGE_IMPORT :
				getPackageImports().clear();
				getPackageImports()
					.addAll((Collection<? extends PackageImport>) newValue);
				return;
			case UMLPackage.COMPONENT__IS_LEAF :
				setIsLeaf((Boolean) newValue);
				return;
			case UMLPackage.COMPONENT__OWNING_TEMPLATE_PARAMETER :
				setOwningTemplateParameter((TemplateParameter) newValue);
				return;
			case UMLPackage.COMPONENT__TEMPLATE_PARAMETER :
				setTemplateParameter((TemplateParameter) newValue);
				return;
			case UMLPackage.COMPONENT__PACKAGE :
				setPackage((org.eclipse.uml2.uml.Package) newValue);
				return;
			case UMLPackage.COMPONENT__TEMPLATE_BINDING :
				getTemplateBindings().clear();
				getTemplateBindings()
					.addAll((Collection<? extends TemplateBinding>) newValue);
				return;
			case UMLPackage.COMPONENT__OWNED_TEMPLATE_SIGNATURE :
				setOwnedTemplateSignature((TemplateSignature) newValue);
				return;
			case UMLPackage.COMPONENT__COLLABORATION_USE :
				getCollaborationUses().clear();
				getCollaborationUses()
					.addAll((Collection<? extends CollaborationUse>) newValue);
				return;
			case UMLPackage.COMPONENT__GENERAL :
				getGenerals().clear();
				getGenerals()
					.addAll((Collection<? extends Classifier>) newValue);
				return;
			case UMLPackage.COMPONENT__GENERALIZATION :
				getGeneralizations().clear();
				getGeneralizations()
					.addAll((Collection<? extends Generalization>) newValue);
				return;
			case UMLPackage.COMPONENT__POWERTYPE_EXTENT :
				getPowertypeExtents().clear();
				getPowertypeExtents()
					.addAll((Collection<? extends GeneralizationSet>) newValue);
				return;
			case UMLPackage.COMPONENT__IS_ABSTRACT :
				setIsAbstract((Boolean) newValue);
				return;
			case UMLPackage.COMPONENT__IS_FINAL_SPECIALIZATION :
				setIsFinalSpecialization((Boolean) newValue);
				return;
			case UMLPackage.COMPONENT__OWNED_USE_CASE :
				getOwnedUseCases().clear();
				getOwnedUseCases()
					.addAll((Collection<? extends UseCase>) newValue);
				return;
			case UMLPackage.COMPONENT__USE_CASE :
				getUseCases().clear();
				getUseCases().addAll((Collection<? extends UseCase>) newValue);
				return;
			case UMLPackage.COMPONENT__REDEFINED_CLASSIFIER :
				getRedefinedClassifiers().clear();
				getRedefinedClassifiers()
					.addAll((Collection<? extends Classifier>) newValue);
				return;
			case UMLPackage.COMPONENT__REPRESENTATION :
				setRepresentation((CollaborationUse) newValue);
				return;
			case UMLPackage.COMPONENT__SUBSTITUTION :
				getSubstitutions().clear();
				getSubstitutions()
					.addAll((Collection<? extends Substitution>) newValue);
				return;
			case UMLPackage.COMPONENT__OWNED_ATTRIBUTE :
				getOwnedAttributes().clear();
				getOwnedAttributes()
					.addAll((Collection<? extends Property>) newValue);
				return;
			case UMLPackage.COMPONENT__OWNED_CONNECTOR :
				getOwnedConnectors().clear();
				getOwnedConnectors()
					.addAll((Collection<? extends Connector>) newValue);
				return;
			case UMLPackage.COMPONENT__CLASSIFIER_BEHAVIOR :
				setClassifierBehavior((Behavior) newValue);
				return;
			case UMLPackage.COMPONENT__INTERFACE_REALIZATION :
				getInterfaceRealizations().clear();
				getInterfaceRealizations().addAll(
					(Collection<? extends InterfaceRealization>) newValue);
				return;
			case UMLPackage.COMPONENT__OWNED_BEHAVIOR :
				getOwnedBehaviors().clear();
				getOwnedBehaviors()
					.addAll((Collection<? extends Behavior>) newValue);
				return;
			case UMLPackage.COMPONENT__OWNED_OPERATION :
				getOwnedOperations().clear();
				getOwnedOperations()
					.addAll((Collection<? extends Operation>) newValue);
				return;
			case UMLPackage.COMPONENT__IS_ACTIVE :
				setIsActive((Boolean) newValue);
				return;
			case UMLPackage.COMPONENT__NESTED_CLASSIFIER :
				getNestedClassifiers().clear();
				getNestedClassifiers()
					.addAll((Collection<? extends Classifier>) newValue);
				return;
			case UMLPackage.COMPONENT__OWNED_RECEPTION :
				getOwnedReceptions().clear();
				getOwnedReceptions()
					.addAll((Collection<? extends Reception>) newValue);
				return;
			case UMLPackage.COMPONENT__SUPER_CLASS :
				getSuperClasses().clear();
				getSuperClasses().addAll(
					(Collection<? extends org.eclipse.uml2.uml.Class>) newValue);
				return;
			case UMLPackage.COMPONENT__IS_INDIRECTLY_INSTANTIATED :
				setIsIndirectlyInstantiated((Boolean) newValue);
				return;
			case UMLPackage.COMPONENT__PACKAGED_ELEMENT :
				getPackagedElements().clear();
				getPackagedElements().addAll(
					(Collection<? extends PackageableElement>) newValue);
				return;
			case UMLPackage.COMPONENT__REALIZATION :
				getRealizations().clear();
				getRealizations().addAll(
					(Collection<? extends ComponentRealization>) newValue);
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
			case UMLPackage.COMPONENT__EANNOTATIONS :
				getEAnnotations().clear();
				return;
			case UMLPackage.COMPONENT__OWNED_COMMENT :
				getOwnedComments().clear();
				return;
			case UMLPackage.COMPONENT__NAME :
				unsetName();
				return;
			case UMLPackage.COMPONENT__NAME_EXPRESSION :
				setNameExpression((StringExpression) null);
				return;
			case UMLPackage.COMPONENT__VISIBILITY :
				unsetVisibility();
				return;
			case UMLPackage.COMPONENT__OWNED_RULE :
				getOwnedRules().clear();
				return;
			case UMLPackage.COMPONENT__ELEMENT_IMPORT :
				getElementImports().clear();
				return;
			case UMLPackage.COMPONENT__PACKAGE_IMPORT :
				getPackageImports().clear();
				return;
			case UMLPackage.COMPONENT__IS_LEAF :
				setIsLeaf(IS_LEAF_EDEFAULT);
				return;
			case UMLPackage.COMPONENT__OWNING_TEMPLATE_PARAMETER :
				setOwningTemplateParameter((TemplateParameter) null);
				return;
			case UMLPackage.COMPONENT__TEMPLATE_PARAMETER :
				setTemplateParameter((TemplateParameter) null);
				return;
			case UMLPackage.COMPONENT__PACKAGE :
				setPackage((org.eclipse.uml2.uml.Package) null);
				return;
			case UMLPackage.COMPONENT__TEMPLATE_BINDING :
				getTemplateBindings().clear();
				return;
			case UMLPackage.COMPONENT__OWNED_TEMPLATE_SIGNATURE :
				setOwnedTemplateSignature((TemplateSignature) null);
				return;
			case UMLPackage.COMPONENT__COLLABORATION_USE :
				getCollaborationUses().clear();
				return;
			case UMLPackage.COMPONENT__GENERAL :
				getGenerals().clear();
				return;
			case UMLPackage.COMPONENT__GENERALIZATION :
				getGeneralizations().clear();
				return;
			case UMLPackage.COMPONENT__POWERTYPE_EXTENT :
				getPowertypeExtents().clear();
				return;
			case UMLPackage.COMPONENT__IS_ABSTRACT :
				setIsAbstract(IS_ABSTRACT_EDEFAULT);
				return;
			case UMLPackage.COMPONENT__IS_FINAL_SPECIALIZATION :
				setIsFinalSpecialization(IS_FINAL_SPECIALIZATION_EDEFAULT);
				return;
			case UMLPackage.COMPONENT__OWNED_USE_CASE :
				getOwnedUseCases().clear();
				return;
			case UMLPackage.COMPONENT__USE_CASE :
				getUseCases().clear();
				return;
			case UMLPackage.COMPONENT__REDEFINED_CLASSIFIER :
				getRedefinedClassifiers().clear();
				return;
			case UMLPackage.COMPONENT__REPRESENTATION :
				setRepresentation((CollaborationUse) null);
				return;
			case UMLPackage.COMPONENT__SUBSTITUTION :
				getSubstitutions().clear();
				return;
			case UMLPackage.COMPONENT__OWNED_ATTRIBUTE :
				getOwnedAttributes().clear();
				return;
			case UMLPackage.COMPONENT__OWNED_CONNECTOR :
				getOwnedConnectors().clear();
				return;
			case UMLPackage.COMPONENT__CLASSIFIER_BEHAVIOR :
				setClassifierBehavior((Behavior) null);
				return;
			case UMLPackage.COMPONENT__INTERFACE_REALIZATION :
				getInterfaceRealizations().clear();
				return;
			case UMLPackage.COMPONENT__OWNED_BEHAVIOR :
				getOwnedBehaviors().clear();
				return;
			case UMLPackage.COMPONENT__OWNED_OPERATION :
				getOwnedOperations().clear();
				return;
			case UMLPackage.COMPONENT__IS_ACTIVE :
				setIsActive(IS_ACTIVE_EDEFAULT);
				return;
			case UMLPackage.COMPONENT__NESTED_CLASSIFIER :
				getNestedClassifiers().clear();
				return;
			case UMLPackage.COMPONENT__OWNED_RECEPTION :
				getOwnedReceptions().clear();
				return;
			case UMLPackage.COMPONENT__SUPER_CLASS :
				getSuperClasses().clear();
				return;
			case UMLPackage.COMPONENT__IS_INDIRECTLY_INSTANTIATED :
				setIsIndirectlyInstantiated(
					IS_INDIRECTLY_INSTANTIATED_EDEFAULT);
				return;
			case UMLPackage.COMPONENT__PACKAGED_ELEMENT :
				getPackagedElements().clear();
				return;
			case UMLPackage.COMPONENT__REALIZATION :
				getRealizations().clear();
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
			case UMLPackage.COMPONENT__EANNOTATIONS :
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UMLPackage.COMPONENT__OWNED_COMMENT :
				return ownedComments != null && !ownedComments.isEmpty();
			case UMLPackage.COMPONENT__OWNED_ELEMENT :
				return isSetOwnedElements();
			case UMLPackage.COMPONENT__OWNER :
				return isSetOwner();
			case UMLPackage.COMPONENT__CLIENT_DEPENDENCY :
				return !getClientDependencies().isEmpty();
			case UMLPackage.COMPONENT__NAME :
				return isSetName();
			case UMLPackage.COMPONENT__NAME_EXPRESSION :
				return nameExpression != null;
			case UMLPackage.COMPONENT__NAMESPACE :
				return isSetNamespace();
			case UMLPackage.COMPONENT__QUALIFIED_NAME :
				return QUALIFIED_NAME_EDEFAULT == null
					? getQualifiedName() != null
					: !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case UMLPackage.COMPONENT__VISIBILITY :
				return isSetVisibility();
			case UMLPackage.COMPONENT__OWNED_RULE :
				return ownedRules != null && !ownedRules.isEmpty();
			case UMLPackage.COMPONENT__ELEMENT_IMPORT :
				return elementImports != null && !elementImports.isEmpty();
			case UMLPackage.COMPONENT__PACKAGE_IMPORT :
				return packageImports != null && !packageImports.isEmpty();
			case UMLPackage.COMPONENT__OWNED_MEMBER :
				return isSetOwnedMembers();
			case UMLPackage.COMPONENT__IMPORTED_MEMBER :
				return !getImportedMembers().isEmpty();
			case UMLPackage.COMPONENT__MEMBER :
				return isSetMembers();
			case UMLPackage.COMPONENT__IS_LEAF :
				return ((eFlags & IS_LEAF_EFLAG) != 0) != IS_LEAF_EDEFAULT;
			case UMLPackage.COMPONENT__REDEFINED_ELEMENT :
				return isSetRedefinedElements();
			case UMLPackage.COMPONENT__REDEFINITION_CONTEXT :
				return isSetRedefinitionContexts();
			case UMLPackage.COMPONENT__OWNING_TEMPLATE_PARAMETER :
				return basicGetOwningTemplateParameter() != null;
			case UMLPackage.COMPONENT__TEMPLATE_PARAMETER :
				return isSetTemplateParameter();
			case UMLPackage.COMPONENT__PACKAGE :
				return basicGetPackage() != null;
			case UMLPackage.COMPONENT__TEMPLATE_BINDING :
				return templateBindings != null && !templateBindings.isEmpty();
			case UMLPackage.COMPONENT__OWNED_TEMPLATE_SIGNATURE :
				return isSetOwnedTemplateSignature();
			case UMLPackage.COMPONENT__FEATURE :
				return isSetFeatures();
			case UMLPackage.COMPONENT__ATTRIBUTE :
				return isSetAttributes();
			case UMLPackage.COMPONENT__COLLABORATION_USE :
				return collaborationUses != null
					&& !collaborationUses.isEmpty();
			case UMLPackage.COMPONENT__GENERAL :
				return isSetGenerals();
			case UMLPackage.COMPONENT__GENERALIZATION :
				return generalizations != null && !generalizations.isEmpty();
			case UMLPackage.COMPONENT__POWERTYPE_EXTENT :
				return powertypeExtents != null && !powertypeExtents.isEmpty();
			case UMLPackage.COMPONENT__INHERITED_MEMBER :
				return !getInheritedMembers().isEmpty();
			case UMLPackage.COMPONENT__IS_ABSTRACT :
				return isSetIsAbstract();
			case UMLPackage.COMPONENT__IS_FINAL_SPECIALIZATION :
				return ((eFlags
					& IS_FINAL_SPECIALIZATION_EFLAG) != 0) != IS_FINAL_SPECIALIZATION_EDEFAULT;
			case UMLPackage.COMPONENT__OWNED_USE_CASE :
				return ownedUseCases != null && !ownedUseCases.isEmpty();
			case UMLPackage.COMPONENT__USE_CASE :
				return useCases != null && !useCases.isEmpty();
			case UMLPackage.COMPONENT__REDEFINED_CLASSIFIER :
				return redefinedClassifiers != null
					&& !redefinedClassifiers.isEmpty();
			case UMLPackage.COMPONENT__REPRESENTATION :
				return representation != null;
			case UMLPackage.COMPONENT__SUBSTITUTION :
				return substitutions != null && !substitutions.isEmpty();
			case UMLPackage.COMPONENT__OWNED_ATTRIBUTE :
				return isSetOwnedAttributes();
			case UMLPackage.COMPONENT__OWNED_CONNECTOR :
				return ownedConnectors != null && !ownedConnectors.isEmpty();
			case UMLPackage.COMPONENT__PART :
				return !getParts().isEmpty();
			case UMLPackage.COMPONENT__ROLE :
				return isSetRoles();
			case UMLPackage.COMPONENT__OWNED_PORT :
				return !getOwnedPorts().isEmpty();
			case UMLPackage.COMPONENT__CLASSIFIER_BEHAVIOR :
				return classifierBehavior != null;
			case UMLPackage.COMPONENT__INTERFACE_REALIZATION :
				return interfaceRealizations != null
					&& !interfaceRealizations.isEmpty();
			case UMLPackage.COMPONENT__OWNED_BEHAVIOR :
				return ownedBehaviors != null && !ownedBehaviors.isEmpty();
			case UMLPackage.COMPONENT__OWNED_OPERATION :
				return ownedOperations != null && !ownedOperations.isEmpty();
			case UMLPackage.COMPONENT__EXTENSION :
				return !getExtensions().isEmpty();
			case UMLPackage.COMPONENT__IS_ACTIVE :
				return ((eFlags & IS_ACTIVE_EFLAG) != 0) != IS_ACTIVE_EDEFAULT;
			case UMLPackage.COMPONENT__NESTED_CLASSIFIER :
				return nestedClassifiers != null
					&& !nestedClassifiers.isEmpty();
			case UMLPackage.COMPONENT__OWNED_RECEPTION :
				return ownedReceptions != null && !ownedReceptions.isEmpty();
			case UMLPackage.COMPONENT__SUPER_CLASS :
				return isSetSuperClasses();
			case UMLPackage.COMPONENT__IS_INDIRECTLY_INSTANTIATED :
				return ((eFlags
					& IS_INDIRECTLY_INSTANTIATED_EFLAG) != 0) != IS_INDIRECTLY_INSTANTIATED_EDEFAULT;
			case UMLPackage.COMPONENT__PACKAGED_ELEMENT :
				return packagedElements != null && !packagedElements.isEmpty();
			case UMLPackage.COMPONENT__PROVIDED :
				return !getProvideds().isEmpty();
			case UMLPackage.COMPONENT__REALIZATION :
				return realizations != null && !realizations.isEmpty();
			case UMLPackage.COMPONENT__REQUIRED :
				return !getRequireds().isEmpty();
		}
		return eDynamicIsSet(featureID);
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
			case UMLPackage.COMPONENT___GET_EANNOTATION__STRING :
				return getEAnnotation((String) arguments.get(0));
			case UMLPackage.COMPONENT___VALIDATE_HAS_OWNER__DIAGNOSTICCHAIN_MAP :
				return validateHasOwner((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.COMPONENT___VALIDATE_NOT_OWN_SELF__DIAGNOSTICCHAIN_MAP :
				return validateNotOwnSelf((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.COMPONENT___ADD_KEYWORD__STRING :
				return addKeyword((String) arguments.get(0));
			case UMLPackage.COMPONENT___APPLY_STEREOTYPE__STEREOTYPE :
				return applyStereotype((Stereotype) arguments.get(0));
			case UMLPackage.COMPONENT___CREATE_EANNOTATION__STRING :
				return createEAnnotation((String) arguments.get(0));
			case UMLPackage.COMPONENT___DESTROY :
				destroy();
				return null;
			case UMLPackage.COMPONENT___GET_KEYWORDS :
				return getKeywords();
			case UMLPackage.COMPONENT___GET_APPLICABLE_STEREOTYPE__STRING :
				return getApplicableStereotype((String) arguments.get(0));
			case UMLPackage.COMPONENT___GET_APPLICABLE_STEREOTYPES :
				return getApplicableStereotypes();
			case UMLPackage.COMPONENT___GET_APPLIED_STEREOTYPE__STRING :
				return getAppliedStereotype((String) arguments.get(0));
			case UMLPackage.COMPONENT___GET_APPLIED_STEREOTYPES :
				return getAppliedStereotypes();
			case UMLPackage.COMPONENT___GET_APPLIED_SUBSTEREOTYPE__STEREOTYPE_STRING :
				return getAppliedSubstereotype((Stereotype) arguments.get(0),
					(String) arguments.get(1));
			case UMLPackage.COMPONENT___GET_APPLIED_SUBSTEREOTYPES__STEREOTYPE :
				return getAppliedSubstereotypes((Stereotype) arguments.get(0));
			case UMLPackage.COMPONENT___GET_MODEL :
				return getModel();
			case UMLPackage.COMPONENT___GET_NEAREST_PACKAGE :
				return getNearestPackage();
			case UMLPackage.COMPONENT___GET_RELATIONSHIPS :
				return getRelationships();
			case UMLPackage.COMPONENT___GET_RELATIONSHIPS__ECLASS :
				return getRelationships((EClass) arguments.get(0));
			case UMLPackage.COMPONENT___GET_REQUIRED_STEREOTYPE__STRING :
				return getRequiredStereotype((String) arguments.get(0));
			case UMLPackage.COMPONENT___GET_REQUIRED_STEREOTYPES :
				return getRequiredStereotypes();
			case UMLPackage.COMPONENT___GET_SOURCE_DIRECTED_RELATIONSHIPS :
				return getSourceDirectedRelationships();
			case UMLPackage.COMPONENT___GET_SOURCE_DIRECTED_RELATIONSHIPS__ECLASS :
				return getSourceDirectedRelationships(
					(EClass) arguments.get(0));
			case UMLPackage.COMPONENT___GET_STEREOTYPE_APPLICATION__STEREOTYPE :
				return getStereotypeApplication((Stereotype) arguments.get(0));
			case UMLPackage.COMPONENT___GET_STEREOTYPE_APPLICATIONS :
				return getStereotypeApplications();
			case UMLPackage.COMPONENT___GET_TARGET_DIRECTED_RELATIONSHIPS :
				return getTargetDirectedRelationships();
			case UMLPackage.COMPONENT___GET_TARGET_DIRECTED_RELATIONSHIPS__ECLASS :
				return getTargetDirectedRelationships(
					(EClass) arguments.get(0));
			case UMLPackage.COMPONENT___GET_VALUE__STEREOTYPE_STRING :
				return getValue((Stereotype) arguments.get(0),
					(String) arguments.get(1));
			case UMLPackage.COMPONENT___HAS_KEYWORD__STRING :
				return hasKeyword((String) arguments.get(0));
			case UMLPackage.COMPONENT___HAS_VALUE__STEREOTYPE_STRING :
				return hasValue((Stereotype) arguments.get(0),
					(String) arguments.get(1));
			case UMLPackage.COMPONENT___IS_STEREOTYPE_APPLICABLE__STEREOTYPE :
				return isStereotypeApplicable((Stereotype) arguments.get(0));
			case UMLPackage.COMPONENT___IS_STEREOTYPE_APPLIED__STEREOTYPE :
				return isStereotypeApplied((Stereotype) arguments.get(0));
			case UMLPackage.COMPONENT___IS_STEREOTYPE_REQUIRED__STEREOTYPE :
				return isStereotypeRequired((Stereotype) arguments.get(0));
			case UMLPackage.COMPONENT___REMOVE_KEYWORD__STRING :
				return removeKeyword((String) arguments.get(0));
			case UMLPackage.COMPONENT___SET_VALUE__STEREOTYPE_STRING_OBJECT :
				setValue((Stereotype) arguments.get(0),
					(String) arguments.get(1), arguments.get(2));
				return null;
			case UMLPackage.COMPONENT___UNAPPLY_STEREOTYPE__STEREOTYPE :
				return unapplyStereotype((Stereotype) arguments.get(0));
			case UMLPackage.COMPONENT___ALL_OWNED_ELEMENTS :
				return allOwnedElements();
			case UMLPackage.COMPONENT___MUST_BE_OWNED :
				return mustBeOwned();
			case UMLPackage.COMPONENT___VALIDATE_VISIBILITY_NEEDS_OWNERSHIP__DIAGNOSTICCHAIN_MAP :
				return validateVisibilityNeedsOwnership(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.COMPONENT___VALIDATE_HAS_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP :
				return validateHasQualifiedName(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.COMPONENT___VALIDATE_HAS_NO_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP :
				return validateHasNoQualifiedName(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.COMPONENT___CREATE_DEPENDENCY__NAMEDELEMENT :
				return createDependency((NamedElement) arguments.get(0));
			case UMLPackage.COMPONENT___CREATE_USAGE__NAMEDELEMENT :
				return createUsage((NamedElement) arguments.get(0));
			case UMLPackage.COMPONENT___GET_LABEL :
				return getLabel();
			case UMLPackage.COMPONENT___GET_LABEL__BOOLEAN :
				return getLabel((Boolean) arguments.get(0));
			case UMLPackage.COMPONENT___GET_NAMESPACE :
				return getNamespace();
			case UMLPackage.COMPONENT___ALL_NAMESPACES :
				return allNamespaces();
			case UMLPackage.COMPONENT___ALL_OWNING_PACKAGES :
				return allOwningPackages();
			case UMLPackage.COMPONENT___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE :
				return isDistinguishableFrom((NamedElement) arguments.get(0),
					(Namespace) arguments.get(1));
			case UMLPackage.COMPONENT___GET_QUALIFIED_NAME :
				return getQualifiedName();
			case UMLPackage.COMPONENT___SEPARATOR :
				return separator();
			case UMLPackage.COMPONENT___GET_CLIENT_DEPENDENCIES :
				return getClientDependencies();
			case UMLPackage.COMPONENT___VALIDATE_MEMBERS_DISTINGUISHABLE__DIAGNOSTICCHAIN_MAP :
				return validateMembersDistinguishable(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.COMPONENT___VALIDATE_CANNOT_IMPORT_SELF__DIAGNOSTICCHAIN_MAP :
				return validateCannotImportSelf(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.COMPONENT___VALIDATE_CANNOT_IMPORT_OWNED_MEMBERS__DIAGNOSTICCHAIN_MAP :
				return validateCannotImportOwnedMembers(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.COMPONENT___CREATE_ELEMENT_IMPORT__PACKAGEABLEELEMENT_VISIBILITYKIND :
				return createElementImport(
					(PackageableElement) arguments.get(0),
					(VisibilityKind) arguments.get(1));
			case UMLPackage.COMPONENT___CREATE_PACKAGE_IMPORT__PACKAGE_VISIBILITYKIND :
				return createPackageImport(
					(org.eclipse.uml2.uml.Package) arguments.get(0),
					(VisibilityKind) arguments.get(1));
			case UMLPackage.COMPONENT___GET_IMPORTED_ELEMENTS :
				return getImportedElements();
			case UMLPackage.COMPONENT___GET_IMPORTED_PACKAGES :
				return getImportedPackages();
			case UMLPackage.COMPONENT___GET_OWNED_MEMBERS :
				return getOwnedMembers();
			case UMLPackage.COMPONENT___EXCLUDE_COLLISIONS__ELIST :
				return excludeCollisions(
					(EList<PackageableElement>) arguments.get(0));
			case UMLPackage.COMPONENT___GET_NAMES_OF_MEMBER__NAMEDELEMENT :
				return getNamesOfMember((NamedElement) arguments.get(0));
			case UMLPackage.COMPONENT___IMPORT_MEMBERS__ELIST :
				return importMembers(
					(EList<PackageableElement>) arguments.get(0));
			case UMLPackage.COMPONENT___GET_IMPORTED_MEMBERS :
				return getImportedMembers();
			case UMLPackage.COMPONENT___MEMBERS_ARE_DISTINGUISHABLE :
				return membersAreDistinguishable();
			case UMLPackage.COMPONENT___VALIDATE_REDEFINITION_CONSISTENT__DIAGNOSTICCHAIN_MAP :
				return validateRedefinitionConsistent(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.COMPONENT___VALIDATE_NON_LEAF_REDEFINITION__DIAGNOSTICCHAIN_MAP :
				return validateNonLeafRedefinition(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.COMPONENT___VALIDATE_REDEFINITION_CONTEXT_VALID__DIAGNOSTICCHAIN_MAP :
				return validateRedefinitionContextValid(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.COMPONENT___IS_CONSISTENT_WITH__REDEFINABLEELEMENT :
				return isConsistentWith((RedefinableElement) arguments.get(0));
			case UMLPackage.COMPONENT___IS_REDEFINITION_CONTEXT_VALID__REDEFINABLEELEMENT :
				return isRedefinitionContextValid(
					(RedefinableElement) arguments.get(0));
			case UMLPackage.COMPONENT___IS_COMPATIBLE_WITH__PARAMETERABLEELEMENT :
				return isCompatibleWith(
					(ParameterableElement) arguments.get(0));
			case UMLPackage.COMPONENT___IS_TEMPLATE_PARAMETER :
				return isTemplateParameter();
			case UMLPackage.COMPONENT___VALIDATE_NAMESPACE_NEEDS_VISIBILITY__DIAGNOSTICCHAIN_MAP :
				return validateNamespaceNeedsVisibility(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.COMPONENT___CREATE_ASSOCIATION__BOOLEAN_AGGREGATIONKIND_STRING_INT_INT_TYPE_BOOLEAN_AGGREGATIONKIND_STRING_INT_INT :
				return createAssociation((Boolean) arguments.get(0),
					(AggregationKind) arguments.get(1),
					(String) arguments.get(2), (Integer) arguments.get(3),
					(Integer) arguments.get(4), (Type) arguments.get(5),
					(Boolean) arguments.get(6),
					(AggregationKind) arguments.get(7),
					(String) arguments.get(8), (Integer) arguments.get(9),
					(Integer) arguments.get(10));
			case UMLPackage.COMPONENT___GET_ASSOCIATIONS :
				return getAssociations();
			case UMLPackage.COMPONENT___CONFORMS_TO__TYPE :
				return conformsTo((Type) arguments.get(0));
			case UMLPackage.COMPONENT___IS_TEMPLATE :
				return isTemplate();
			case UMLPackage.COMPONENT___PARAMETERABLE_ELEMENTS :
				return parameterableElements();
			case UMLPackage.COMPONENT___VALIDATE_SPECIALIZE_TYPE__DIAGNOSTICCHAIN_MAP :
				return validateSpecializeType(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.COMPONENT___VALIDATE_MAPS_TO_GENERALIZATION_SET__DIAGNOSTICCHAIN_MAP :
				return validateMapsToGeneralizationSet(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.COMPONENT___VALIDATE_NON_FINAL_PARENTS__DIAGNOSTICCHAIN_MAP :
				return validateNonFinalParents(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.COMPONENT___VALIDATE_NO_CYCLES_IN_GENERALIZATION__DIAGNOSTICCHAIN_MAP :
				return validateNoCyclesInGeneralization(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.COMPONENT___GET_ALL_ATTRIBUTES :
				return getAllAttributes();
			case UMLPackage.COMPONENT___GET_ALL_OPERATIONS :
				return getAllOperations();
			case UMLPackage.COMPONENT___GET_ALL_USED_INTERFACES :
				return getAllUsedInterfaces();
			case UMLPackage.COMPONENT___GET_OPERATION__STRING_ELIST_ELIST :
				return getOperation((String) arguments.get(0),
					(EList<String>) arguments.get(1),
					(EList<Type>) arguments.get(2));
			case UMLPackage.COMPONENT___GET_OPERATION__STRING_ELIST_ELIST_BOOLEAN :
				return getOperation((String) arguments.get(0),
					(EList<String>) arguments.get(1),
					(EList<Type>) arguments.get(2), (Boolean) arguments.get(3));
			case UMLPackage.COMPONENT___GET_OPERATIONS :
				return getOperations();
			case UMLPackage.COMPONENT___GET_USED_INTERFACES :
				return getUsedInterfaces();
			case UMLPackage.COMPONENT___ALL_FEATURES :
				return allFeatures();
			case UMLPackage.COMPONENT___ALL_PARENTS :
				return allParents();
			case UMLPackage.COMPONENT___GET_GENERALS :
				return getGenerals();
			case UMLPackage.COMPONENT___HAS_VISIBILITY_OF__NAMEDELEMENT :
				return hasVisibilityOf((NamedElement) arguments.get(0));
			case UMLPackage.COMPONENT___INHERIT__ELIST :
				return inherit((EList<NamedElement>) arguments.get(0));
			case UMLPackage.COMPONENT___INHERITABLE_MEMBERS__CLASSIFIER :
				return inheritableMembers((Classifier) arguments.get(0));
			case UMLPackage.COMPONENT___GET_INHERITED_MEMBERS :
				return getInheritedMembers();
			case UMLPackage.COMPONENT___MAY_SPECIALIZE_TYPE__CLASSIFIER :
				return maySpecializeType((Classifier) arguments.get(0));
			case UMLPackage.COMPONENT___PARENTS :
				return parents();
			case UMLPackage.COMPONENT___DIRECTLY_REALIZED_INTERFACES :
				return directlyRealizedInterfaces();
			case UMLPackage.COMPONENT___DIRECTLY_USED_INTERFACES :
				return directlyUsedInterfaces();
			case UMLPackage.COMPONENT___ALL_REALIZED_INTERFACES :
				return allRealizedInterfaces();
			case UMLPackage.COMPONENT___ALL_USED_INTERFACES :
				return allUsedInterfaces();
			case UMLPackage.COMPONENT___IS_SUBSTITUTABLE_FOR__CLASSIFIER :
				return isSubstitutableFor((Classifier) arguments.get(0));
			case UMLPackage.COMPONENT___ALL_ATTRIBUTES :
				return allAttributes();
			case UMLPackage.COMPONENT___ALL_SLOTTABLE_FEATURES :
				return allSlottableFeatures();
			case UMLPackage.COMPONENT___CREATE_OWNED_ATTRIBUTE__STRING_TYPE_INT_INT :
				return createOwnedAttribute((String) arguments.get(0),
					(Type) arguments.get(1), (Integer) arguments.get(2),
					(Integer) arguments.get(3));
			case UMLPackage.COMPONENT___GET_PARTS :
				return getParts();
			case UMLPackage.COMPONENT___ALL_ROLES :
				return allRoles();
			case UMLPackage.COMPONENT___GET_OWNED_PORTS :
				return getOwnedPorts();
			case UMLPackage.COMPONENT___VALIDATE_CLASS_BEHAVIOR__DIAGNOSTICCHAIN_MAP :
				return validateClassBehavior((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.COMPONENT___GET_ALL_IMPLEMENTED_INTERFACES :
				return getAllImplementedInterfaces();
			case UMLPackage.COMPONENT___GET_IMPLEMENTED_INTERFACES :
				return getImplementedInterfaces();
			case UMLPackage.COMPONENT___VALIDATE_PASSIVE_CLASS__DIAGNOSTICCHAIN_MAP :
				return validatePassiveClass((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.COMPONENT___CREATE_OWNED_OPERATION__STRING_ELIST_ELIST_TYPE :
				return createOwnedOperation((String) arguments.get(0),
					(EList<String>) arguments.get(1),
					(EList<Type>) arguments.get(2), (Type) arguments.get(3));
			case UMLPackage.COMPONENT___IS_METACLASS :
				return isMetaclass();
			case UMLPackage.COMPONENT___GET_EXTENSIONS :
				return getExtensions();
			case UMLPackage.COMPONENT___GET_SUPER_CLASSES :
				return getSuperClasses();
			case UMLPackage.COMPONENT___VALIDATE_NO_NESTED_CLASSIFIERS__DIAGNOSTICCHAIN_MAP :
				return validateNoNestedClassifiers(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.COMPONENT___VALIDATE_NO_PACKAGED_ELEMENTS__DIAGNOSTICCHAIN_MAP :
				return validateNoPackagedElements(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.COMPONENT___CREATE_OWNED_CLASS__STRING_BOOLEAN :
				return createOwnedClass((String) arguments.get(0),
					(Boolean) arguments.get(1));
			case UMLPackage.COMPONENT___CREATE_OWNED_ENUMERATION__STRING :
				return createOwnedEnumeration((String) arguments.get(0));
			case UMLPackage.COMPONENT___CREATE_OWNED_INTERFACE__STRING :
				return createOwnedInterface((String) arguments.get(0));
			case UMLPackage.COMPONENT___CREATE_OWNED_PRIMITIVE_TYPE__STRING :
				return createOwnedPrimitiveType((String) arguments.get(0));
			case UMLPackage.COMPONENT___GET_PROVIDEDS :
				return getProvideds();
			case UMLPackage.COMPONENT___GET_REQUIREDS :
				return getRequireds();
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
		result.append(" (isIndirectlyInstantiated: "); //$NON-NLS-1$
		result.append((eFlags & IS_INDIRECTLY_INSTANTIATED_EFLAG) != 0);
		result.append(')');
		return result.toString();
	}

	/**
	 * The array of subset feature identifiers for the '{@link #getOwnedMembers() <em>Owned Member</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedMembers()
	 * @generated
	 * @ordered
	 */
	protected static final int[] OWNED_MEMBER_ESUBSETS = new int[]{
		UMLPackage.COMPONENT__OWNED_RULE, UMLPackage.COMPONENT__OWNED_USE_CASE,
		UMLPackage.COMPONENT__OWNED_ATTRIBUTE,
		UMLPackage.COMPONENT__OWNED_CONNECTOR,
		UMLPackage.COMPONENT__OWNED_BEHAVIOR,
		UMLPackage.COMPONENT__OWNED_OPERATION,
		UMLPackage.COMPONENT__NESTED_CLASSIFIER,
		UMLPackage.COMPONENT__OWNED_RECEPTION,
		UMLPackage.COMPONENT__PACKAGED_ELEMENT};

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetOwnedMembers() {
		return super.isSetOwnedMembers()
			|| eIsSet(UMLPackage.COMPONENT__PACKAGED_ELEMENT);
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
		UMLPackage.COMPONENT__OWNED_COMMENT,
		UMLPackage.COMPONENT__NAME_EXPRESSION,
		UMLPackage.COMPONENT__ELEMENT_IMPORT,
		UMLPackage.COMPONENT__PACKAGE_IMPORT,
		UMLPackage.COMPONENT__OWNED_MEMBER,
		UMLPackage.COMPONENT__TEMPLATE_BINDING,
		UMLPackage.COMPONENT__OWNED_TEMPLATE_SIGNATURE,
		UMLPackage.COMPONENT__COLLABORATION_USE,
		UMLPackage.COMPONENT__GENERALIZATION,
		UMLPackage.COMPONENT__SUBSTITUTION,
		UMLPackage.COMPONENT__INTERFACE_REALIZATION,
		UMLPackage.COMPONENT__REALIZATION};

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetOwnedElements() {
		return super.isSetOwnedElements()
			|| eIsSet(UMLPackage.COMPONENT__REALIZATION);
	}

} //ComponentImpl
