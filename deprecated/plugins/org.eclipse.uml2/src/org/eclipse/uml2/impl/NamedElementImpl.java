/*
 * Copyright (c) 2003, 2005 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *
 * $Id: NamedElementImpl.java,v 1.17 2005/06/07 17:31:26 khussey Exp $
 */
package org.eclipse.uml2.impl;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.uml2.Dependency;
import org.eclipse.uml2.Element;
import org.eclipse.uml2.NamedElement;
import org.eclipse.uml2.Namespace;
import org.eclipse.uml2.StringExpression;
import org.eclipse.uml2.TemplateSignature;
import org.eclipse.uml2.UML2Factory;
import org.eclipse.uml2.UML2Package;
import org.eclipse.uml2.VisibilityKind;

import org.eclipse.uml2.common.util.CacheAdapter;

import org.eclipse.uml2.internal.operation.NamedElementOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Named Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2.impl.NamedElementImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.NamedElementImpl#getQualifiedName <em>Qualified Name</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.NamedElementImpl#getVisibility <em>Visibility</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.NamedElementImpl#getClientDependencies <em>Client Dependency</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.NamedElementImpl#getNameExpression <em>Name Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class NamedElementImpl extends TemplateableElementImpl implements NamedElement {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) IBM Corporation and others."; //$NON-NLS-1$

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = ""; //$NON-NLS-1$

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
	 * The default value of the '{@link #getQualifiedName() <em>Qualified Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQualifiedName()
	 * @generated
	 * @ordered
	 */
	protected static final String QUALIFIED_NAME_EDEFAULT = ""; //$NON-NLS-1$

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
	 * The cached value of the '{@link #getVisibility() <em>Visibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVisibility()
	 * @generated
	 * @ordered
	 */
	protected VisibilityKind visibility = VISIBILITY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getClientDependencies() <em>Client Dependency</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClientDependencies()
	 * @generated
	 * @ordered
	 */
	protected EList clientDependency = null;

	/**
	 * The cached value of the '{@link #getNameExpression() <em>Name Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNameExpression()
	 * @generated
	 * @ordered
	 */
	protected StringExpression nameExpression = null;

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
	protected EClass eStaticClass() {
		return UML2Package.eINSTANCE.getNamedElement();
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
		newName = newName == null ? NAME_EDEFAULT : newName;
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2Package.NAMED_ELEMENT__NAME, oldName, name));

	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String getQualifiedName() {
		CacheAdapter cache = getCacheAdapter();
		
		if (cache != null) {
			String result = (String) cache.get(eResource(), this,
				UML2Package.eINSTANCE.getNamedElement_QualifiedName());

			if (result == null) {
				cache.put(eResource(), this, UML2Package.eINSTANCE
					.getNamedElement_QualifiedName(), result = qualifiedName());
			}

			return result;
		}
		
		return qualifiedName();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VisibilityKind getVisibility() {
		return visibility;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVisibility(VisibilityKind newVisibility) {
		VisibilityKind oldVisibility = visibility;
		visibility = newVisibility == null ? VISIBILITY_EDEFAULT : newVisibility;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2Package.NAMED_ELEMENT__VISIBILITY, oldVisibility, visibility));

	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getClientDependencies() {
		if (clientDependency == null) {
			clientDependency = new EObjectWithInverseResolvingEList.ManyInverse(Dependency.class, this, UML2Package.NAMED_ELEMENT__CLIENT_DEPENDENCY, UML2Package.DEPENDENCY__CLIENT);
		}
		return clientDependency;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
    public Dependency getClientDependency(String name) {
		for (Iterator i = getClientDependencies().iterator(); i.hasNext(); ) {
			Dependency clientDependency = (Dependency) i.next();
			if (name.equals(clientDependency.getName())) {
				return clientDependency;
			}
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StringExpression getNameExpression() {
		return nameExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNameExpression(StringExpression newNameExpression, NotificationChain msgs) {
		StringExpression oldNameExpression = nameExpression;
		nameExpression = newNameExpression;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UML2Package.NAMED_ELEMENT__NAME_EXPRESSION, oldNameExpression, newNameExpression);
			if (msgs == null) msgs = notification; else msgs.add(notification);
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
				msgs = ((InternalEObject)nameExpression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UML2Package.NAMED_ELEMENT__NAME_EXPRESSION, null, msgs);
			if (newNameExpression != null)
				msgs = ((InternalEObject)newNameExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UML2Package.NAMED_ELEMENT__NAME_EXPRESSION, null, msgs);
			msgs = basicSetNameExpression(newNameExpression, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2Package.NAMED_ELEMENT__NAME_EXPRESSION, newNameExpression, newNameExpression));

	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 * @deprecated Use #createNameExpression() instead.
	 */
	public StringExpression createNameExpression(EClass eClass) {
		StringExpression newNameExpression = (StringExpression) eClass.getEPackage().getEFactoryInstance().create(eClass);
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, 0, UML2Package.NAMED_ELEMENT__NAME_EXPRESSION, null, newNameExpression));
		}
		setNameExpression(newNameExpression);
		return newNameExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StringExpression createNameExpression() {
		StringExpression newNameExpression = UML2Factory.eINSTANCE.createStringExpression();
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, 0, UML2Package.NAMED_ELEMENT__NAME_EXPRESSION, null, newNameExpression));
		}
		setNameExpression(newNameExpression);
		return newNameExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNoName(DiagnosticChain diagnostics, Map context) {
		return NamedElementOperations.validateNoName(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQualifiedName(DiagnosticChain diagnostics, Map context) {
		return NamedElementOperations.validateQualifiedName(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List allNamespaces() {
		CacheAdapter cache = getCacheAdapter();
		if (cache != null) {
			List result = (List) cache.get(this, UML2Package.eINSTANCE.getNamedElement().getEOperations().get(2));
			if (result == null) {
				cache.put(this, UML2Package.eINSTANCE.getNamedElement().getEOperations().get(2), result = NamedElementOperations.allNamespaces(this));
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
	public String qualifiedName() {
		return NamedElementOperations.qualifiedName(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVisibilityNeedsOwnership(DiagnosticChain diagnostics, Map context) {
		return NamedElementOperations.validateVisibilityNeedsOwnership(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Namespace getNamespace() {
		Namespace namespace = basicGetNamespace();
		return namespace == null ? null : (Namespace)eResolveProxy((InternalEObject)namespace);
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Element basicGetOwner() {
		Namespace namespace = basicGetNamespace();			
		if (namespace != null) {
			return namespace;
		}
		return super.basicGetOwner();
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Namespace basicGetNamespace() {
		return eContainer instanceof Namespace ? (Namespace) eContainer : null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, Class baseClass, NotificationChain msgs) {
		if (featureID >= 0) {
			switch (eDerivedStructuralFeatureID(featureID, baseClass)) {
				case UML2Package.NAMED_ELEMENT__EANNOTATIONS:
					return ((InternalEList)getEAnnotations()).basicAdd(otherEnd, msgs);
				case UML2Package.NAMED_ELEMENT__TEMPLATE_BINDING:
					return ((InternalEList)getTemplateBindings()).basicAdd(otherEnd, msgs);
				case UML2Package.NAMED_ELEMENT__OWNED_TEMPLATE_SIGNATURE:
					if (ownedTemplateSignature != null)
						msgs = ((InternalEObject)ownedTemplateSignature).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UML2Package.NAMED_ELEMENT__OWNED_TEMPLATE_SIGNATURE, null, msgs);
					return basicSetOwnedTemplateSignature((TemplateSignature)otherEnd, msgs);
				case UML2Package.NAMED_ELEMENT__CLIENT_DEPENDENCY:
					return ((InternalEList)getClientDependencies()).basicAdd(otherEnd, msgs);
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
				case UML2Package.NAMED_ELEMENT__EANNOTATIONS:
					return ((InternalEList)getEAnnotations()).basicRemove(otherEnd, msgs);
				case UML2Package.NAMED_ELEMENT__OWNED_COMMENT:
					return ((InternalEList)getOwnedComments()).basicRemove(otherEnd, msgs);
				case UML2Package.NAMED_ELEMENT__TEMPLATE_BINDING:
					return ((InternalEList)getTemplateBindings()).basicRemove(otherEnd, msgs);
				case UML2Package.NAMED_ELEMENT__OWNED_TEMPLATE_SIGNATURE:
					return basicSetOwnedTemplateSignature(null, msgs);
				case UML2Package.NAMED_ELEMENT__CLIENT_DEPENDENCY:
					return ((InternalEList)getClientDependencies()).basicRemove(otherEnd, msgs);
				case UML2Package.NAMED_ELEMENT__NAME_EXPRESSION:
					return basicSetNameExpression(null, msgs);
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
	public Object eGet(EStructuralFeature eFeature, boolean resolve) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case UML2Package.NAMED_ELEMENT__EANNOTATIONS:
				return getEAnnotations();
			case UML2Package.NAMED_ELEMENT__OWNED_ELEMENT:
				return getOwnedElements();
			case UML2Package.NAMED_ELEMENT__OWNER:
				if (resolve) return getOwner();
				return basicGetOwner();
			case UML2Package.NAMED_ELEMENT__OWNED_COMMENT:
				return getOwnedComments();
			case UML2Package.NAMED_ELEMENT__TEMPLATE_BINDING:
				return getTemplateBindings();
			case UML2Package.NAMED_ELEMENT__OWNED_TEMPLATE_SIGNATURE:
				return getOwnedTemplateSignature();
			case UML2Package.NAMED_ELEMENT__NAME:
				return getName();
			case UML2Package.NAMED_ELEMENT__QUALIFIED_NAME:
				return getQualifiedName();
			case UML2Package.NAMED_ELEMENT__VISIBILITY:
				return getVisibility();
			case UML2Package.NAMED_ELEMENT__CLIENT_DEPENDENCY:
				return getClientDependencies();
			case UML2Package.NAMED_ELEMENT__NAME_EXPRESSION:
				return getNameExpression();
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
			case UML2Package.NAMED_ELEMENT__EANNOTATIONS:
				getEAnnotations().clear();
				getEAnnotations().addAll((Collection)newValue);
				return;
			case UML2Package.NAMED_ELEMENT__OWNED_COMMENT:
				getOwnedComments().clear();
				getOwnedComments().addAll((Collection)newValue);
				return;
			case UML2Package.NAMED_ELEMENT__TEMPLATE_BINDING:
				getTemplateBindings().clear();
				getTemplateBindings().addAll((Collection)newValue);
				return;
			case UML2Package.NAMED_ELEMENT__OWNED_TEMPLATE_SIGNATURE:
				setOwnedTemplateSignature((TemplateSignature)newValue);
				return;
			case UML2Package.NAMED_ELEMENT__NAME:
				setName((String)newValue);
				return;
			case UML2Package.NAMED_ELEMENT__VISIBILITY:
				setVisibility((VisibilityKind)newValue);
				return;
			case UML2Package.NAMED_ELEMENT__CLIENT_DEPENDENCY:
				getClientDependencies().clear();
				getClientDependencies().addAll((Collection)newValue);
				return;
			case UML2Package.NAMED_ELEMENT__NAME_EXPRESSION:
				setNameExpression((StringExpression)newValue);
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
			case UML2Package.NAMED_ELEMENT__EANNOTATIONS:
				getEAnnotations().clear();
				return;
			case UML2Package.NAMED_ELEMENT__OWNED_COMMENT:
				getOwnedComments().clear();
				return;
			case UML2Package.NAMED_ELEMENT__TEMPLATE_BINDING:
				getTemplateBindings().clear();
				return;
			case UML2Package.NAMED_ELEMENT__OWNED_TEMPLATE_SIGNATURE:
				setOwnedTemplateSignature((TemplateSignature)null);
				return;
			case UML2Package.NAMED_ELEMENT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case UML2Package.NAMED_ELEMENT__VISIBILITY:
				setVisibility(VISIBILITY_EDEFAULT);
				return;
			case UML2Package.NAMED_ELEMENT__CLIENT_DEPENDENCY:
				getClientDependencies().clear();
				return;
			case UML2Package.NAMED_ELEMENT__NAME_EXPRESSION:
				setNameExpression((StringExpression)null);
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
			case UML2Package.NAMED_ELEMENT__EANNOTATIONS:
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UML2Package.NAMED_ELEMENT__OWNED_ELEMENT:
				return !getOwnedElements().isEmpty();
			case UML2Package.NAMED_ELEMENT__OWNER:
				return basicGetOwner() != null;
			case UML2Package.NAMED_ELEMENT__OWNED_COMMENT:
				return ownedComment != null && !ownedComment.isEmpty();
			case UML2Package.NAMED_ELEMENT__TEMPLATE_BINDING:
				return templateBinding != null && !templateBinding.isEmpty();
			case UML2Package.NAMED_ELEMENT__OWNED_TEMPLATE_SIGNATURE:
				return ownedTemplateSignature != null;
			case UML2Package.NAMED_ELEMENT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case UML2Package.NAMED_ELEMENT__QUALIFIED_NAME:
				return QUALIFIED_NAME_EDEFAULT == null ? getQualifiedName() != null : !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case UML2Package.NAMED_ELEMENT__VISIBILITY:
				return visibility != VISIBILITY_EDEFAULT;
			case UML2Package.NAMED_ELEMENT__CLIENT_DEPENDENCY:
				return clientDependency != null && !clientDependency.isEmpty();
			case UML2Package.NAMED_ELEMENT__NAME_EXPRESSION:
				return nameExpression != null;
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
		result.append(" (name: "); //$NON-NLS-1$
		result.append(name);
		result.append(", visibility: "); //$NON-NLS-1$
		result.append(visibility);
		result.append(')');
		return result.toString();
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EList getOwnedElementsHelper(EList ownedElement) {
		super.getOwnedElementsHelper(ownedElement);
		if (nameExpression != null) {
			ownedElement.add(nameExpression);
		}
		return ownedElement;
	}


	// <!-- begin-custom-operations -->

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.uml2.NamedElement#getLabel()
	 */
	public String getLabel() {
		return NamedElementOperations.getLabel(this);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.uml2.NamedElement#getLabel(boolean)
	 */
	public String getLabel(boolean localize) {
		return NamedElementOperations.getLabel(this, localize);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.uml2.NamedElement#createDependency(org.eclipse.uml2.NamedElement)
	 */
	public Dependency createDependency(NamedElement supplier) {
		return NamedElementOperations.createDependency(this, supplier);
	}
	
	// <!-- end-custom-operations -->

} //NamedElementImpl
