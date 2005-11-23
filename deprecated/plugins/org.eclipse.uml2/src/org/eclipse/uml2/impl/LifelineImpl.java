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
 * $Id: LifelineImpl.java,v 1.21 2005/11/23 20:05:08 khussey Exp $
 */
package org.eclipse.uml2.impl;

import java.util.Collection;
import java.util.Iterator;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.uml2.ConnectableElement;
import org.eclipse.uml2.Element;
import org.eclipse.uml2.Interaction;
import org.eclipse.uml2.InteractionFragment;
import org.eclipse.uml2.Lifeline;
import org.eclipse.uml2.Namespace;
import org.eclipse.uml2.OpaqueExpression;
import org.eclipse.uml2.PartDecomposition;
import org.eclipse.uml2.StringExpression;
import org.eclipse.uml2.TemplateSignature;
import org.eclipse.uml2.UML2Factory;
import org.eclipse.uml2.UML2Package;
import org.eclipse.uml2.VisibilityKind;

import org.eclipse.uml2.common.util.DerivedUnionEObjectEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Lifeline</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2.impl.LifelineImpl#getOwnedElements <em>Owned Element</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.LifelineImpl#getCoveredBys <em>Covered By</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.LifelineImpl#getRepresents <em>Represents</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.LifelineImpl#getInteraction <em>Interaction</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.LifelineImpl#getSelector <em>Selector</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.LifelineImpl#getDecomposedAs <em>Decomposed As</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LifelineImpl extends NamedElementImpl implements Lifeline {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) IBM Corporation and others."; //$NON-NLS-1$

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LifelineImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return UML2Package.Literals.LIFELINE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getOwnedElements() {
		EList ownedElement = (EList)eVirtualGet(UML2Package.LIFELINE__OWNED_ELEMENT);
		if (ownedElement == null) {
			eVirtualSet(UML2Package.LIFELINE__OWNED_ELEMENT, ownedElement = new DerivedUnionEObjectEList(Element.class, this, UML2Package.LIFELINE__OWNED_ELEMENT, new int[] {UML2Package.LIFELINE__OWNED_COMMENT, UML2Package.LIFELINE__TEMPLATE_BINDING, UML2Package.LIFELINE__OWNED_TEMPLATE_SIGNATURE, UML2Package.LIFELINE__NAME_EXPRESSION, UML2Package.LIFELINE__SELECTOR}));
		}
		return ownedElement;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOwnedElements() {
		return super.isSetOwnedElements()
			|| eIsSet(UML2Package.LIFELINE__SELECTOR);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getCoveredBys() {
		EList coveredBy = (EList)eVirtualGet(UML2Package.LIFELINE__COVERED_BY);
		if (coveredBy == null) {
			eVirtualSet(UML2Package.LIFELINE__COVERED_BY, coveredBy = new EObjectWithInverseResolvingEList.ManyInverse(InteractionFragment.class, this, UML2Package.LIFELINE__COVERED_BY, UML2Package.INTERACTION_FRAGMENT__COVERED));
		}
		return coveredBy;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
    public InteractionFragment getCoveredBy(String name) {
		for (Iterator i = getCoveredBys().iterator(); i.hasNext(); ) {
			InteractionFragment coveredBy = (InteractionFragment) i.next();
			if (name.equals(coveredBy.getName())) {
				return coveredBy;
			}
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectableElement getRepresents() {
		ConnectableElement represents = (ConnectableElement)eVirtualGet(UML2Package.LIFELINE__REPRESENTS);
		if (represents != null && represents.eIsProxy()) {
			InternalEObject oldRepresents = (InternalEObject)represents;
			represents = (ConnectableElement)eResolveProxy(oldRepresents);
			if (represents != oldRepresents) {
				eVirtualSet(UML2Package.LIFELINE__REPRESENTS, represents);
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UML2Package.LIFELINE__REPRESENTS, oldRepresents, represents));
			}
		}
		return represents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectableElement basicGetRepresents() {
		return (ConnectableElement)eVirtualGet(UML2Package.LIFELINE__REPRESENTS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRepresents(ConnectableElement newRepresents) {
		ConnectableElement represents = newRepresents;
		Object oldRepresents = eVirtualSet(UML2Package.LIFELINE__REPRESENTS, represents);
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2Package.LIFELINE__REPRESENTS, oldRepresents == EVIRTUAL_NO_VALUE ? null : oldRepresents, represents));

	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Interaction getInteraction() {
		if (eContainerFeatureID != UML2Package.LIFELINE__INTERACTION) return null;
		return (Interaction)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInteraction(Interaction newInteraction) {
		if (newInteraction != eInternalContainer() || (eContainerFeatureID != UML2Package.LIFELINE__INTERACTION && newInteraction != null)) {
			if (EcoreUtil.isAncestor(this, newInteraction))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString()); //$NON-NLS-1$
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newInteraction != null)
				msgs = ((InternalEObject)newInteraction).eInverseAdd(this, UML2Package.INTERACTION__LIFELINE, Interaction.class, msgs);
			msgs = eBasicSetContainer((InternalEObject)newInteraction, UML2Package.LIFELINE__INTERACTION, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2Package.LIFELINE__INTERACTION, newInteraction, newInteraction));

	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OpaqueExpression getSelector() {
		return (OpaqueExpression)eVirtualGet(UML2Package.LIFELINE__SELECTOR);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSelector(OpaqueExpression newSelector, NotificationChain msgs) {
		Object oldSelector = eVirtualSet(UML2Package.LIFELINE__SELECTOR, newSelector);
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UML2Package.LIFELINE__SELECTOR, oldSelector == EVIRTUAL_NO_VALUE ? null : oldSelector, newSelector);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}

		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSelector(OpaqueExpression newSelector) {
		OpaqueExpression selector = (OpaqueExpression)eVirtualGet(UML2Package.LIFELINE__SELECTOR);
		if (newSelector != selector) {
			NotificationChain msgs = null;
			if (selector != null)
				msgs = ((InternalEObject)selector).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UML2Package.LIFELINE__SELECTOR, null, msgs);
			if (newSelector != null)
				msgs = ((InternalEObject)newSelector).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UML2Package.LIFELINE__SELECTOR, null, msgs);
			msgs = basicSetSelector(newSelector, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2Package.LIFELINE__SELECTOR, newSelector, newSelector));

	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public OpaqueExpression createSelector(EClass eClass) {
		OpaqueExpression newSelector = (OpaqueExpression) eClass.getEPackage().getEFactoryInstance().create(eClass);
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, 0, UML2Package.LIFELINE__SELECTOR, null, newSelector));
		}
		setSelector(newSelector);
		return newSelector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public OpaqueExpression createSelector() {
		OpaqueExpression newSelector = UML2Factory.eINSTANCE.createOpaqueExpression();
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, 0, UML2Package.LIFELINE__SELECTOR, null, newSelector));
		}
		setSelector(newSelector);
		return newSelector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PartDecomposition getDecomposedAs() {
		PartDecomposition decomposedAs = (PartDecomposition)eVirtualGet(UML2Package.LIFELINE__DECOMPOSED_AS);
		if (decomposedAs != null && decomposedAs.eIsProxy()) {
			InternalEObject oldDecomposedAs = (InternalEObject)decomposedAs;
			decomposedAs = (PartDecomposition)eResolveProxy(oldDecomposedAs);
			if (decomposedAs != oldDecomposedAs) {
				eVirtualSet(UML2Package.LIFELINE__DECOMPOSED_AS, decomposedAs);
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UML2Package.LIFELINE__DECOMPOSED_AS, oldDecomposedAs, decomposedAs));
			}
		}
		return decomposedAs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PartDecomposition basicGetDecomposedAs() {
		return (PartDecomposition)eVirtualGet(UML2Package.LIFELINE__DECOMPOSED_AS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDecomposedAs(PartDecomposition newDecomposedAs) {
		PartDecomposition decomposedAs = newDecomposedAs;
		Object oldDecomposedAs = eVirtualSet(UML2Package.LIFELINE__DECOMPOSED_AS, decomposedAs);
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2Package.LIFELINE__DECOMPOSED_AS, oldDecomposedAs == EVIRTUAL_NO_VALUE ? null : oldDecomposedAs, decomposedAs));

	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Namespace basicGetNamespace() {
		Interaction interaction = getInteraction();			
		if (interaction != null) {
			return interaction;
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
			|| eIsSet(UML2Package.LIFELINE__INTERACTION);
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, Class baseClass, NotificationChain msgs) {
		if (featureID >= 0) {
			switch (eDerivedStructuralFeatureID(featureID, baseClass)) {
				case UML2Package.LIFELINE__EANNOTATIONS:
					return ((InternalEList)getEAnnotations()).basicAdd(otherEnd, msgs);
				case UML2Package.LIFELINE__TEMPLATE_BINDING:
					return ((InternalEList)getTemplateBindings()).basicAdd(otherEnd, msgs);
				case UML2Package.LIFELINE__OWNED_TEMPLATE_SIGNATURE:
					TemplateSignature ownedTemplateSignature = (TemplateSignature)eVirtualGet(UML2Package.LIFELINE__OWNED_TEMPLATE_SIGNATURE);
					if (ownedTemplateSignature != null)
						msgs = ((InternalEObject)ownedTemplateSignature).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UML2Package.LIFELINE__OWNED_TEMPLATE_SIGNATURE, null, msgs);
					return basicSetOwnedTemplateSignature((TemplateSignature)otherEnd, msgs);
				case UML2Package.LIFELINE__CLIENT_DEPENDENCY:
					return ((InternalEList)getClientDependencies()).basicAdd(otherEnd, msgs);
				case UML2Package.LIFELINE__COVERED_BY:
					return ((InternalEList)getCoveredBys()).basicAdd(otherEnd, msgs);
				case UML2Package.LIFELINE__INTERACTION:
					if (eInternalContainer() != null)
						msgs = eBasicRemoveFromContainer(msgs);
					return eBasicSetContainer(otherEnd, UML2Package.LIFELINE__INTERACTION, msgs);
				default:
					return eDynamicInverseAdd(otherEnd, featureID, baseClass, msgs);
			}
		}
		if (eInternalContainer() != null)
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
				case UML2Package.LIFELINE__EANNOTATIONS:
					return ((InternalEList)getEAnnotations()).basicRemove(otherEnd, msgs);
				case UML2Package.LIFELINE__OWNED_COMMENT:
					return ((InternalEList)getOwnedComments()).basicRemove(otherEnd, msgs);
				case UML2Package.LIFELINE__TEMPLATE_BINDING:
					return ((InternalEList)getTemplateBindings()).basicRemove(otherEnd, msgs);
				case UML2Package.LIFELINE__OWNED_TEMPLATE_SIGNATURE:
					return basicSetOwnedTemplateSignature(null, msgs);
				case UML2Package.LIFELINE__CLIENT_DEPENDENCY:
					return ((InternalEList)getClientDependencies()).basicRemove(otherEnd, msgs);
				case UML2Package.LIFELINE__NAME_EXPRESSION:
					return basicSetNameExpression(null, msgs);
				case UML2Package.LIFELINE__COVERED_BY:
					return ((InternalEList)getCoveredBys()).basicRemove(otherEnd, msgs);
				case UML2Package.LIFELINE__INTERACTION:
					return eBasicSetContainer(null, UML2Package.LIFELINE__INTERACTION, msgs);
				case UML2Package.LIFELINE__SELECTOR:
					return basicSetSelector(null, msgs);
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
				case UML2Package.LIFELINE__INTERACTION:
					return eInternalContainer().eInverseRemove(this, UML2Package.INTERACTION__LIFELINE, Interaction.class, msgs);
				default:
					return eDynamicBasicRemoveFromContainer(msgs);
			}
		}
		return eInternalContainer().eInverseRemove(this, EOPPOSITE_FEATURE_BASE - eContainerFeatureID, null, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UML2Package.LIFELINE__EANNOTATIONS:
				return getEAnnotations();
			case UML2Package.LIFELINE__OWNED_ELEMENT:
				return getOwnedElements();
			case UML2Package.LIFELINE__OWNER:
				if (resolve) return getOwner();
				return basicGetOwner();
			case UML2Package.LIFELINE__OWNED_COMMENT:
				return getOwnedComments();
			case UML2Package.LIFELINE__TEMPLATE_BINDING:
				return getTemplateBindings();
			case UML2Package.LIFELINE__OWNED_TEMPLATE_SIGNATURE:
				return getOwnedTemplateSignature();
			case UML2Package.LIFELINE__NAME:
				return getName();
			case UML2Package.LIFELINE__QUALIFIED_NAME:
				return getQualifiedName();
			case UML2Package.LIFELINE__VISIBILITY:
				return getVisibility();
			case UML2Package.LIFELINE__CLIENT_DEPENDENCY:
				return getClientDependencies();
			case UML2Package.LIFELINE__NAME_EXPRESSION:
				return getNameExpression();
			case UML2Package.LIFELINE__COVERED_BY:
				return getCoveredBys();
			case UML2Package.LIFELINE__REPRESENTS:
				if (resolve) return getRepresents();
				return basicGetRepresents();
			case UML2Package.LIFELINE__INTERACTION:
				return getInteraction();
			case UML2Package.LIFELINE__SELECTOR:
				return getSelector();
			case UML2Package.LIFELINE__DECOMPOSED_AS:
				if (resolve) return getDecomposedAs();
				return basicGetDecomposedAs();
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
			case UML2Package.LIFELINE__EANNOTATIONS:
				getEAnnotations().clear();
				getEAnnotations().addAll((Collection)newValue);
				return;
			case UML2Package.LIFELINE__OWNED_COMMENT:
				getOwnedComments().clear();
				getOwnedComments().addAll((Collection)newValue);
				return;
			case UML2Package.LIFELINE__TEMPLATE_BINDING:
				getTemplateBindings().clear();
				getTemplateBindings().addAll((Collection)newValue);
				return;
			case UML2Package.LIFELINE__OWNED_TEMPLATE_SIGNATURE:
				setOwnedTemplateSignature((TemplateSignature)newValue);
				return;
			case UML2Package.LIFELINE__NAME:
				setName((String)newValue);
				return;
			case UML2Package.LIFELINE__VISIBILITY:
				setVisibility((VisibilityKind)newValue);
				return;
			case UML2Package.LIFELINE__CLIENT_DEPENDENCY:
				getClientDependencies().clear();
				getClientDependencies().addAll((Collection)newValue);
				return;
			case UML2Package.LIFELINE__NAME_EXPRESSION:
				setNameExpression((StringExpression)newValue);
				return;
			case UML2Package.LIFELINE__COVERED_BY:
				getCoveredBys().clear();
				getCoveredBys().addAll((Collection)newValue);
				return;
			case UML2Package.LIFELINE__REPRESENTS:
				setRepresents((ConnectableElement)newValue);
				return;
			case UML2Package.LIFELINE__INTERACTION:
				setInteraction((Interaction)newValue);
				return;
			case UML2Package.LIFELINE__SELECTOR:
				setSelector((OpaqueExpression)newValue);
				return;
			case UML2Package.LIFELINE__DECOMPOSED_AS:
				setDecomposedAs((PartDecomposition)newValue);
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
			case UML2Package.LIFELINE__EANNOTATIONS:
				getEAnnotations().clear();
				return;
			case UML2Package.LIFELINE__OWNED_COMMENT:
				getOwnedComments().clear();
				return;
			case UML2Package.LIFELINE__TEMPLATE_BINDING:
				getTemplateBindings().clear();
				return;
			case UML2Package.LIFELINE__OWNED_TEMPLATE_SIGNATURE:
				setOwnedTemplateSignature((TemplateSignature)null);
				return;
			case UML2Package.LIFELINE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case UML2Package.LIFELINE__VISIBILITY:
				setVisibility(VISIBILITY_EDEFAULT);
				return;
			case UML2Package.LIFELINE__CLIENT_DEPENDENCY:
				getClientDependencies().clear();
				return;
			case UML2Package.LIFELINE__NAME_EXPRESSION:
				setNameExpression((StringExpression)null);
				return;
			case UML2Package.LIFELINE__COVERED_BY:
				getCoveredBys().clear();
				return;
			case UML2Package.LIFELINE__REPRESENTS:
				setRepresents((ConnectableElement)null);
				return;
			case UML2Package.LIFELINE__INTERACTION:
				setInteraction((Interaction)null);
				return;
			case UML2Package.LIFELINE__SELECTOR:
				setSelector((OpaqueExpression)null);
				return;
			case UML2Package.LIFELINE__DECOMPOSED_AS:
				setDecomposedAs((PartDecomposition)null);
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
			case UML2Package.LIFELINE__EANNOTATIONS:
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UML2Package.LIFELINE__OWNED_ELEMENT:
				return isSetOwnedElements();
			case UML2Package.LIFELINE__OWNER:
				return isSetOwner();
			case UML2Package.LIFELINE__OWNED_COMMENT:
				EList ownedComment = (EList)eVirtualGet(UML2Package.LIFELINE__OWNED_COMMENT);
				return ownedComment != null && !ownedComment.isEmpty();
			case UML2Package.LIFELINE__TEMPLATE_BINDING:
				EList templateBinding = (EList)eVirtualGet(UML2Package.LIFELINE__TEMPLATE_BINDING);
				return templateBinding != null && !templateBinding.isEmpty();
			case UML2Package.LIFELINE__OWNED_TEMPLATE_SIGNATURE:
				return eVirtualGet(UML2Package.LIFELINE__OWNED_TEMPLATE_SIGNATURE) != null;
			case UML2Package.LIFELINE__NAME:
				String name = (String)eVirtualGet(UML2Package.LIFELINE__NAME, NAME_EDEFAULT);
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case UML2Package.LIFELINE__QUALIFIED_NAME:
				return QUALIFIED_NAME_EDEFAULT == null ? getQualifiedName() != null : !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case UML2Package.LIFELINE__VISIBILITY:
				return eVirtualGet(UML2Package.LIFELINE__VISIBILITY, VISIBILITY_EDEFAULT) != VISIBILITY_EDEFAULT;
			case UML2Package.LIFELINE__CLIENT_DEPENDENCY:
				EList clientDependency = (EList)eVirtualGet(UML2Package.LIFELINE__CLIENT_DEPENDENCY);
				return clientDependency != null && !clientDependency.isEmpty();
			case UML2Package.LIFELINE__NAME_EXPRESSION:
				return eVirtualGet(UML2Package.LIFELINE__NAME_EXPRESSION) != null;
			case UML2Package.LIFELINE__COVERED_BY:
				EList coveredBy = (EList)eVirtualGet(UML2Package.LIFELINE__COVERED_BY);
				return coveredBy != null && !coveredBy.isEmpty();
			case UML2Package.LIFELINE__REPRESENTS:
				return eVirtualGet(UML2Package.LIFELINE__REPRESENTS) != null;
			case UML2Package.LIFELINE__INTERACTION:
				return getInteraction() != null;
			case UML2Package.LIFELINE__SELECTOR:
				return eVirtualGet(UML2Package.LIFELINE__SELECTOR) != null;
			case UML2Package.LIFELINE__DECOMPOSED_AS:
				return eVirtualGet(UML2Package.LIFELINE__DECOMPOSED_AS) != null;
		}
		return eDynamicIsSet(featureID);
	}


} //LifelineImpl
