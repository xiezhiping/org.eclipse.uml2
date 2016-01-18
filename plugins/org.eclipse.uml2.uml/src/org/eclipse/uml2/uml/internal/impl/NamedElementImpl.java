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
 *   Sergey Boyko (Borland) - 282440
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
import org.eclipse.emf.common.util.URI;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.uml2.common.util.CacheAdapter;
import org.eclipse.uml2.common.util.DerivedUnionEObjectEList;
import org.eclipse.uml2.uml.Comment;
import org.eclipse.uml2.common.util.UML2Util;

import org.eclipse.uml2.uml.Dependency;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Namespace;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.StringExpression;
import org.eclipse.uml2.uml.Type;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.Usage;
import org.eclipse.uml2.uml.VisibilityKind;

import org.eclipse.uml2.uml.internal.operations.NamedElementOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Named Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.NamedElementImpl#getOwnedElements <em>Owned Element</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.NamedElementImpl#getNamespace <em>Namespace</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.NamedElementImpl#getOwner <em>Owner</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.NamedElementImpl#getClientDependencies <em>Client Dependency</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.NamedElementImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.NamedElementImpl#getNameExpression <em>Name Expression</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.NamedElementImpl#getQualifiedName <em>Qualified Name</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.NamedElementImpl#getVisibility <em>Visibility</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class NamedElementImpl
		extends ElementImpl
		implements NamedElement {

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The flag representing whether the Name attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected static final int NAME_ESETFLAG = 1 << 8;

	/**
	 * The cached value of the '{@link #getNameExpression() <em>Name Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNameExpression()
	 * @generated
	 * @ordered
	 */
	protected StringExpression nameExpression;

	/**
	 * The default value of the '{@link #getQualifiedName() <em>Qualified Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQualifiedName()
	 * @generated
	 * @ordered
	 */
	protected static final String QUALIFIED_NAME_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getVisibility() <em>Visibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVisibility()
	 * @generated
	 * @ordered
	 */
	protected static final VisibilityKind VISIBILITY_EDEFAULT = VisibilityKind.PUBLIC_LITERAL;

	/**
	 * The offset of the flags representing the value of the '{@link #getVisibility() <em>Visibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected static final int VISIBILITY_EFLAG_OFFSET = 9;

	/**
	 * The flags representing the default value of the '{@link #getVisibility() <em>Visibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected static final int VISIBILITY_EFLAG_DEFAULT = VISIBILITY_EDEFAULT
		.ordinal() << VISIBILITY_EFLAG_OFFSET;

	/**
	 * The array of enumeration values for '{@link VisibilityKind Visibility Kind}'
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 * @ordered
	 */
	protected static final VisibilityKind[] VISIBILITY_EFLAG_VALUES = VisibilityKind
		.values();

	/**
	 * The flags representing the value of the '{@link #getVisibility() <em>Visibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVisibility()
	 * @generated
	 * @ordered
	 */
	protected static final int VISIBILITY_EFLAG = 0x3 << VISIBILITY_EFLAG_OFFSET;

	/**
	 * The flag representing whether the Visibility attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected static final int VISIBILITY_ESETFLAG = 1 << 11;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NamedElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UMLPackage.Literals.NAMED_ELEMENT;
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
						UMLPackage.NAMED_ELEMENT__OWNED_ELEMENT,
						OWNED_ELEMENT_ESUBSETS));
			}
			return ownedElements;
		}
		return new DerivedUnionEObjectEList<Element>(Element.class, this,
			UMLPackage.NAMED_ELEMENT__OWNED_ELEMENT, OWNED_ELEMENT_ESUBSETS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		boolean oldNameESet = (eFlags & NAME_ESETFLAG) != 0;
		eFlags |= NAME_ESETFLAG;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.NAMED_ELEMENT__NAME, oldName, name, !oldNameESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetName() {
		String oldName = name;
		boolean oldNameESet = (eFlags & NAME_ESETFLAG) != 0;
		name = NAME_EDEFAULT;
		eFlags &= ~NAME_ESETFLAG;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET,
				UMLPackage.NAMED_ELEMENT__NAME, oldName, NAME_EDEFAULT,
				oldNameESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetName() {
		return (eFlags & NAME_ESETFLAG) != 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VisibilityKind getVisibility() {
		return VISIBILITY_EFLAG_VALUES[(eFlags
			& VISIBILITY_EFLAG) >>> VISIBILITY_EFLAG_OFFSET];
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVisibility(VisibilityKind newVisibility) {
		VisibilityKind oldVisibility = VISIBILITY_EFLAG_VALUES[(eFlags
			& VISIBILITY_EFLAG) >>> VISIBILITY_EFLAG_OFFSET];
		if (newVisibility == null)
			newVisibility = VISIBILITY_EDEFAULT;
		eFlags = eFlags & ~VISIBILITY_EFLAG
			| newVisibility.ordinal() << VISIBILITY_EFLAG_OFFSET;
		boolean oldVisibilityESet = (eFlags & VISIBILITY_ESETFLAG) != 0;
		eFlags |= VISIBILITY_ESETFLAG;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.NAMED_ELEMENT__VISIBILITY, oldVisibility,
				newVisibility, !oldVisibilityESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetVisibility() {
		VisibilityKind oldVisibility = VISIBILITY_EFLAG_VALUES[(eFlags
			& VISIBILITY_EFLAG) >>> VISIBILITY_EFLAG_OFFSET];
		boolean oldVisibilityESet = (eFlags & VISIBILITY_ESETFLAG) != 0;
		eFlags = eFlags & ~VISIBILITY_EFLAG | VISIBILITY_EFLAG_DEFAULT;
		eFlags &= ~VISIBILITY_ESETFLAG;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET,
				UMLPackage.NAMED_ELEMENT__VISIBILITY, oldVisibility,
				VISIBILITY_EDEFAULT, oldVisibilityESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetVisibility() {
		return (eFlags & VISIBILITY_ESETFLAG) != 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getQualifiedName() {
		return NamedElementOperations.getQualifiedName(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Dependency> getClientDependencies() {
		CacheAdapter cache = getCacheAdapter();
		if (cache != null) {
			@SuppressWarnings("unchecked")
			EList<Dependency> result = (EList<Dependency>) cache.get(this,
				UMLPackage.Literals.NAMED_ELEMENT__CLIENT_DEPENDENCY);
			if (result == null) {
				cache.put(this,
					UMLPackage.Literals.NAMED_ELEMENT__CLIENT_DEPENDENCY,
					result = NamedElementOperations
						.getClientDependencies(this));
			}
			return result;
		}
		return NamedElementOperations.getClientDependencies(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Dependency getClientDependency(String name) {
		return getClientDependency(name, false, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Dependency getClientDependency(String name, boolean ignoreCase,
			EClass eClass) {
		clientDependencyLoop : for (Dependency clientDependency : getClientDependencies()) {
			if (eClass != null && !eClass.isInstance(clientDependency))
				continue clientDependencyLoop;
			if (name != null && !(ignoreCase
				? name.equalsIgnoreCase(clientDependency.getName())
				: name.equals(clientDependency.getName())))
				continue clientDependencyLoop;
			return clientDependency;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StringExpression getNameExpression() {
		if (nameExpression != null && nameExpression.eIsProxy()) {
			InternalEObject oldNameExpression = (InternalEObject) nameExpression;
			nameExpression = (StringExpression) eResolveProxy(
				oldNameExpression);
			if (nameExpression != oldNameExpression) {
				InternalEObject newNameExpression = (InternalEObject) nameExpression;
				NotificationChain msgs = oldNameExpression.eInverseRemove(this,
					EOPPOSITE_FEATURE_BASE
						- UMLPackage.NAMED_ELEMENT__NAME_EXPRESSION,
					null, null);
				if (newNameExpression.eInternalContainer() == null) {
					msgs = newNameExpression.eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE
							- UMLPackage.NAMED_ELEMENT__NAME_EXPRESSION,
						null, msgs);
				}
				if (msgs != null)
					msgs.dispatch();
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
						UMLPackage.NAMED_ELEMENT__NAME_EXPRESSION,
						oldNameExpression, nameExpression));
			}
		}
		return nameExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StringExpression basicGetNameExpression() {
		return nameExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNameExpression(
			StringExpression newNameExpression, NotificationChain msgs) {
		StringExpression oldNameExpression = nameExpression;
		nameExpression = newNameExpression;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
				Notification.SET, UMLPackage.NAMED_ELEMENT__NAME_EXPRESSION,
				oldNameExpression, newNameExpression);
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
	public void setNameExpression(StringExpression newNameExpression) {
		if (newNameExpression != nameExpression) {
			NotificationChain msgs = null;
			if (nameExpression != null)
				msgs = ((InternalEObject) nameExpression).eInverseRemove(this,
					EOPPOSITE_FEATURE_BASE
						- UMLPackage.NAMED_ELEMENT__NAME_EXPRESSION,
					null, msgs);
			if (newNameExpression != null)
				msgs = ((InternalEObject) newNameExpression).eInverseAdd(this,
					EOPPOSITE_FEATURE_BASE
						- UMLPackage.NAMED_ELEMENT__NAME_EXPRESSION,
					null, msgs);
			msgs = basicSetNameExpression(newNameExpression, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.NAMED_ELEMENT__NAME_EXPRESSION, newNameExpression,
				newNameExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StringExpression createNameExpression(String name, Type type) {
		StringExpression newNameExpression = (StringExpression) create(
			UMLPackage.Literals.STRING_EXPRESSION);
		setNameExpression(newNameExpression);
		if (name != null)
			newNameExpression.setName(name);
		if (type != null)
			newNameExpression.setType(type);
		return newNameExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHasNoQualifiedName(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return NamedElementOperations.validateHasNoQualifiedName(this,
			diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHasQualifiedName(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return NamedElementOperations.validateHasQualifiedName(this,
			diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVisibilityNeedsOwnership(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return NamedElementOperations.validateVisibilityNeedsOwnership(this,
			diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Dependency createDependency(NamedElement supplier) {
		return NamedElementOperations.createDependency(this, supplier);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLabel() {
		return NamedElementOperations.getLabel(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLabel(boolean localize) {
		return NamedElementOperations.getLabel(this, localize);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public Usage createUsage(NamedElement supplier) {
		return NamedElementOperations.createUsage(this, supplier);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Namespace> allNamespaces() {
		CacheAdapter cache = getCacheAdapter();
		if (cache != null) {
			@SuppressWarnings("unchecked")
			EList<Namespace> result = (EList<Namespace>) cache.get(this,
				UMLPackage.Literals.NAMED_ELEMENT___ALL_NAMESPACES);
			if (result == null) {
				cache.put(this,
					UMLPackage.Literals.NAMED_ELEMENT___ALL_NAMESPACES,
					result = NamedElementOperations.allNamespaces(this));
			}
			return result;
		}
		return NamedElementOperations.allNamespaces(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isDistinguishableFrom(NamedElement n, Namespace ns) {
		return NamedElementOperations.isDistinguishableFrom(this, n, ns);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String separator() {
		return NamedElementOperations.separator(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<org.eclipse.uml2.uml.Package> allOwningPackages() {
		CacheAdapter cache = getCacheAdapter();
		if (cache != null) {
			@SuppressWarnings("unchecked")
			EList<org.eclipse.uml2.uml.Package> result = (EList<org.eclipse.uml2.uml.Package>) cache
				.get(this,
					UMLPackage.Literals.NAMED_ELEMENT___ALL_OWNING_PACKAGES);
			if (result == null) {
				cache.put(this,
					UMLPackage.Literals.NAMED_ELEMENT___ALL_OWNING_PACKAGES,
					result = NamedElementOperations.allOwningPackages(this));
			}
			return result;
		}
		return NamedElementOperations.allOwningPackages(this);
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
			case UMLPackage.NAMED_ELEMENT__EANNOTATIONS :
				return ((InternalEList<?>) getEAnnotations())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.NAMED_ELEMENT__OWNED_COMMENT :
				return ((InternalEList<?>) getOwnedComments())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.NAMED_ELEMENT__NAME_EXPRESSION :
				return basicSetNameExpression(null, msgs);
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
			case UMLPackage.NAMED_ELEMENT__EANNOTATIONS :
				return getEAnnotations();
			case UMLPackage.NAMED_ELEMENT__OWNED_COMMENT :
				return getOwnedComments();
			case UMLPackage.NAMED_ELEMENT__OWNED_ELEMENT :
				return getOwnedElements();
			case UMLPackage.NAMED_ELEMENT__OWNER :
				if (resolve)
					return getOwner();
				return basicGetOwner();
			case UMLPackage.NAMED_ELEMENT__CLIENT_DEPENDENCY :
				return getClientDependencies();
			case UMLPackage.NAMED_ELEMENT__NAME :
				return getName();
			case UMLPackage.NAMED_ELEMENT__NAME_EXPRESSION :
				if (resolve)
					return getNameExpression();
				return basicGetNameExpression();
			case UMLPackage.NAMED_ELEMENT__NAMESPACE :
				if (resolve)
					return getNamespace();
				return basicGetNamespace();
			case UMLPackage.NAMED_ELEMENT__QUALIFIED_NAME :
				return getQualifiedName();
			case UMLPackage.NAMED_ELEMENT__VISIBILITY :
				return getVisibility();
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
			case UMLPackage.NAMED_ELEMENT__EANNOTATIONS :
				getEAnnotations().clear();
				getEAnnotations()
					.addAll((Collection<? extends EAnnotation>) newValue);
				return;
			case UMLPackage.NAMED_ELEMENT__OWNED_COMMENT :
				getOwnedComments().clear();
				getOwnedComments()
					.addAll((Collection<? extends Comment>) newValue);
				return;
			case UMLPackage.NAMED_ELEMENT__NAME :
				setName((String) newValue);
				return;
			case UMLPackage.NAMED_ELEMENT__NAME_EXPRESSION :
				setNameExpression((StringExpression) newValue);
				return;
			case UMLPackage.NAMED_ELEMENT__VISIBILITY :
				setVisibility((VisibilityKind) newValue);
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
			case UMLPackage.NAMED_ELEMENT__EANNOTATIONS :
				getEAnnotations().clear();
				return;
			case UMLPackage.NAMED_ELEMENT__OWNED_COMMENT :
				getOwnedComments().clear();
				return;
			case UMLPackage.NAMED_ELEMENT__NAME :
				unsetName();
				return;
			case UMLPackage.NAMED_ELEMENT__NAME_EXPRESSION :
				setNameExpression((StringExpression) null);
				return;
			case UMLPackage.NAMED_ELEMENT__VISIBILITY :
				unsetVisibility();
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
			case UMLPackage.NAMED_ELEMENT__EANNOTATIONS :
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UMLPackage.NAMED_ELEMENT__OWNED_COMMENT :
				return ownedComments != null && !ownedComments.isEmpty();
			case UMLPackage.NAMED_ELEMENT__OWNED_ELEMENT :
				return isSetOwnedElements();
			case UMLPackage.NAMED_ELEMENT__OWNER :
				return isSetOwner();
			case UMLPackage.NAMED_ELEMENT__CLIENT_DEPENDENCY :
				return !getClientDependencies().isEmpty();
			case UMLPackage.NAMED_ELEMENT__NAME :
				return isSetName();
			case UMLPackage.NAMED_ELEMENT__NAME_EXPRESSION :
				return nameExpression != null;
			case UMLPackage.NAMED_ELEMENT__NAMESPACE :
				return isSetNamespace();
			case UMLPackage.NAMED_ELEMENT__QUALIFIED_NAME :
				return QUALIFIED_NAME_EDEFAULT == null
					? getQualifiedName() != null
					: !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case UMLPackage.NAMED_ELEMENT__VISIBILITY :
				return isSetVisibility();
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
			case UMLPackage.NAMED_ELEMENT___GET_EANNOTATION__STRING :
				return getEAnnotation((String) arguments.get(0));
			case UMLPackage.NAMED_ELEMENT___VALIDATE_HAS_OWNER__DIAGNOSTICCHAIN_MAP :
				return validateHasOwner((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.NAMED_ELEMENT___VALIDATE_NOT_OWN_SELF__DIAGNOSTICCHAIN_MAP :
				return validateNotOwnSelf((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.NAMED_ELEMENT___ADD_KEYWORD__STRING :
				return addKeyword((String) arguments.get(0));
			case UMLPackage.NAMED_ELEMENT___APPLY_STEREOTYPE__STEREOTYPE :
				return applyStereotype((Stereotype) arguments.get(0));
			case UMLPackage.NAMED_ELEMENT___CREATE_EANNOTATION__STRING :
				return createEAnnotation((String) arguments.get(0));
			case UMLPackage.NAMED_ELEMENT___DESTROY :
				destroy();
				return null;
			case UMLPackage.NAMED_ELEMENT___GET_KEYWORDS :
				return getKeywords();
			case UMLPackage.NAMED_ELEMENT___GET_APPLICABLE_STEREOTYPE__STRING :
				return getApplicableStereotype((String) arguments.get(0));
			case UMLPackage.NAMED_ELEMENT___GET_APPLICABLE_STEREOTYPES :
				return getApplicableStereotypes();
			case UMLPackage.NAMED_ELEMENT___GET_APPLIED_STEREOTYPE__STRING :
				return getAppliedStereotype((String) arguments.get(0));
			case UMLPackage.NAMED_ELEMENT___GET_APPLIED_STEREOTYPES :
				return getAppliedStereotypes();
			case UMLPackage.NAMED_ELEMENT___GET_APPLIED_SUBSTEREOTYPE__STEREOTYPE_STRING :
				return getAppliedSubstereotype((Stereotype) arguments.get(0),
					(String) arguments.get(1));
			case UMLPackage.NAMED_ELEMENT___GET_APPLIED_SUBSTEREOTYPES__STEREOTYPE :
				return getAppliedSubstereotypes((Stereotype) arguments.get(0));
			case UMLPackage.NAMED_ELEMENT___GET_MODEL :
				return getModel();
			case UMLPackage.NAMED_ELEMENT___GET_NEAREST_PACKAGE :
				return getNearestPackage();
			case UMLPackage.NAMED_ELEMENT___GET_RELATIONSHIPS :
				return getRelationships();
			case UMLPackage.NAMED_ELEMENT___GET_RELATIONSHIPS__ECLASS :
				return getRelationships((EClass) arguments.get(0));
			case UMLPackage.NAMED_ELEMENT___GET_REQUIRED_STEREOTYPE__STRING :
				return getRequiredStereotype((String) arguments.get(0));
			case UMLPackage.NAMED_ELEMENT___GET_REQUIRED_STEREOTYPES :
				return getRequiredStereotypes();
			case UMLPackage.NAMED_ELEMENT___GET_SOURCE_DIRECTED_RELATIONSHIPS :
				return getSourceDirectedRelationships();
			case UMLPackage.NAMED_ELEMENT___GET_SOURCE_DIRECTED_RELATIONSHIPS__ECLASS :
				return getSourceDirectedRelationships(
					(EClass) arguments.get(0));
			case UMLPackage.NAMED_ELEMENT___GET_STEREOTYPE_APPLICATION__STEREOTYPE :
				return getStereotypeApplication((Stereotype) arguments.get(0));
			case UMLPackage.NAMED_ELEMENT___GET_STEREOTYPE_APPLICATIONS :
				return getStereotypeApplications();
			case UMLPackage.NAMED_ELEMENT___GET_TARGET_DIRECTED_RELATIONSHIPS :
				return getTargetDirectedRelationships();
			case UMLPackage.NAMED_ELEMENT___GET_TARGET_DIRECTED_RELATIONSHIPS__ECLASS :
				return getTargetDirectedRelationships(
					(EClass) arguments.get(0));
			case UMLPackage.NAMED_ELEMENT___GET_VALUE__STEREOTYPE_STRING :
				return getValue((Stereotype) arguments.get(0),
					(String) arguments.get(1));
			case UMLPackage.NAMED_ELEMENT___HAS_KEYWORD__STRING :
				return hasKeyword((String) arguments.get(0));
			case UMLPackage.NAMED_ELEMENT___HAS_VALUE__STEREOTYPE_STRING :
				return hasValue((Stereotype) arguments.get(0),
					(String) arguments.get(1));
			case UMLPackage.NAMED_ELEMENT___IS_STEREOTYPE_APPLICABLE__STEREOTYPE :
				return isStereotypeApplicable((Stereotype) arguments.get(0));
			case UMLPackage.NAMED_ELEMENT___IS_STEREOTYPE_APPLIED__STEREOTYPE :
				return isStereotypeApplied((Stereotype) arguments.get(0));
			case UMLPackage.NAMED_ELEMENT___IS_STEREOTYPE_REQUIRED__STEREOTYPE :
				return isStereotypeRequired((Stereotype) arguments.get(0));
			case UMLPackage.NAMED_ELEMENT___REMOVE_KEYWORD__STRING :
				return removeKeyword((String) arguments.get(0));
			case UMLPackage.NAMED_ELEMENT___SET_VALUE__STEREOTYPE_STRING_OBJECT :
				setValue((Stereotype) arguments.get(0),
					(String) arguments.get(1), arguments.get(2));
				return null;
			case UMLPackage.NAMED_ELEMENT___UNAPPLY_STEREOTYPE__STEREOTYPE :
				return unapplyStereotype((Stereotype) arguments.get(0));
			case UMLPackage.NAMED_ELEMENT___ALL_OWNED_ELEMENTS :
				return allOwnedElements();
			case UMLPackage.NAMED_ELEMENT___MUST_BE_OWNED :
				return mustBeOwned();
			case UMLPackage.NAMED_ELEMENT___VALIDATE_VISIBILITY_NEEDS_OWNERSHIP__DIAGNOSTICCHAIN_MAP :
				return validateVisibilityNeedsOwnership(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.NAMED_ELEMENT___VALIDATE_HAS_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP :
				return validateHasQualifiedName(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.NAMED_ELEMENT___VALIDATE_HAS_NO_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP :
				return validateHasNoQualifiedName(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.NAMED_ELEMENT___CREATE_DEPENDENCY__NAMEDELEMENT :
				return createDependency((NamedElement) arguments.get(0));
			case UMLPackage.NAMED_ELEMENT___CREATE_USAGE__NAMEDELEMENT :
				return createUsage((NamedElement) arguments.get(0));
			case UMLPackage.NAMED_ELEMENT___GET_LABEL :
				return getLabel();
			case UMLPackage.NAMED_ELEMENT___GET_LABEL__BOOLEAN :
				return getLabel((Boolean) arguments.get(0));
			case UMLPackage.NAMED_ELEMENT___GET_NAMESPACE :
				return getNamespace();
			case UMLPackage.NAMED_ELEMENT___ALL_NAMESPACES :
				return allNamespaces();
			case UMLPackage.NAMED_ELEMENT___ALL_OWNING_PACKAGES :
				return allOwningPackages();
			case UMLPackage.NAMED_ELEMENT___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE :
				return isDistinguishableFrom((NamedElement) arguments.get(0),
					(Namespace) arguments.get(1));
			case UMLPackage.NAMED_ELEMENT___GET_QUALIFIED_NAME :
				return getQualifiedName();
			case UMLPackage.NAMED_ELEMENT___SEPARATOR :
				return separator();
			case UMLPackage.NAMED_ELEMENT___GET_CLIENT_DEPENDENCIES :
				return getClientDependencies();
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
		result.append(" (name: "); //$NON-NLS-1$
		if ((eFlags & NAME_ESETFLAG) != 0)
			result.append(name);
		else
			result.append("<unset>"); //$NON-NLS-1$
		result.append(", visibility: "); //$NON-NLS-1$
		if ((eFlags & VISIBILITY_ESETFLAG) != 0)
			result.append(VISIBILITY_EFLAG_VALUES[(eFlags
				& VISIBILITY_EFLAG) >>> VISIBILITY_EFLAG_OFFSET]);
		else
			result.append("<unset>"); //$NON-NLS-1$
		result.append(')');
		return result.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Namespace basicGetNamespace() {
		return NamedElementOperations.getNamespace(this);
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
	public boolean isSetNamespaceGen() {
		return false;
	}

	public boolean isSetNamespace() {
		return basicGetNamespace() != null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Element basicGetOwner() {
		if (isSetNamespace()) {
			return basicGetNamespace();
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
		return super.isSetOwner() || isSetNamespace();
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
		UMLPackage.NAMED_ELEMENT__OWNED_COMMENT,
		UMLPackage.NAMED_ELEMENT__NAME_EXPRESSION};

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetOwnedElements() {
		return super.isSetOwnedElements()
			|| eIsSet(UMLPackage.NAMED_ELEMENT__NAME_EXPRESSION);
	}

	@Override
	public String eURIFragmentSegment(EStructuralFeature eStructuralFeature,
			EObject eObject) {

		if (eObject instanceof NamedElement) {
			String name = ((NamedElement) eObject).getName();

			if (!UML2Util.isEmpty(name)) {
				int count = 0;

				for (EObject otherEObject : eContents()) {

					if (otherEObject == eObject) {
						break;
					} else if (otherEObject instanceof NamedElement) {

						if (name
							.equals(((NamedElement) otherEObject).getName())) {

							count++;
						}
					}
				}

				name = URI.encodeSegment(name, true);
				return count > 0
					? name + '.' + count
					: name;
			}
		}

		return super.eURIFragmentSegment(eStructuralFeature, eObject);
	}

	@Override
	public EObject eObjectForURIFragmentSegment(String uriFragmentSegment) {

		if (uriFragmentSegment.length() > 0) {
			// Is the first character a special character, i.e., something other
			// than '@'?
			//
			char firstCharacter = uriFragmentSegment.charAt(0);

			if (firstCharacter != '@' && firstCharacter != '%') {
				// Look for trailing count.
				//
				int index = uriFragmentSegment.lastIndexOf("."); //$NON-NLS-1$
				String name = index == -1
					? uriFragmentSegment
					: uriFragmentSegment.substring(0, index);
				int count = 0;

				if (index != -1) {
					try {
						count = Integer
							.parseInt(uriFragmentSegment.substring(index + 1));
					} catch (NumberFormatException exception) {
						// Interpret it as part of the name.
						//
						name = uriFragmentSegment;
					}
				}

				name = URI.decode(name);

				// Look for a matching named element.
				//
				for (EObject eObject : eContents()) {

					if (eObject instanceof NamedElement) {
						NamedElement namedElement = (NamedElement) eObject;

						if (name.equals(namedElement.getName())
							&& count-- == 0) {
							return namedElement;
						}
					}
				}

				return null;
			}
		}

		return super.eObjectForURIFragmentSegment(uriFragmentSegment);
	}

} //NamedElementImpl
