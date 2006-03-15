/*
 * Copyright (c) 2005, 2006 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *
 * $Id: LifelineImpl.java,v 1.15 2006/03/15 19:34:15 khussey Exp $
 */
package org.eclipse.uml2.uml.internal.impl;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.uml2.common.util.DerivedUnionEObjectEList;

import org.eclipse.uml2.uml.ConnectableElement;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Interaction;
import org.eclipse.uml2.uml.InteractionFragment;
import org.eclipse.uml2.uml.Lifeline;
import org.eclipse.uml2.uml.Namespace;
import org.eclipse.uml2.uml.PartDecomposition;
import org.eclipse.uml2.uml.StringExpression;
import org.eclipse.uml2.uml.Type;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.ValueSpecification;
import org.eclipse.uml2.uml.VisibilityKind;

import org.eclipse.uml2.uml.internal.operations.LifelineOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Lifeline</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.LifelineImpl#getOwnedElements <em>Owned Element</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.LifelineImpl#getRepresents <em>Represents</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.LifelineImpl#getInteraction <em>Interaction</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.LifelineImpl#getSelector <em>Selector</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.LifelineImpl#getDecomposedAs <em>Decomposed As</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.LifelineImpl#getCoveredBys <em>Covered By</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LifelineImpl
		extends NamedElementImpl
		implements Lifeline {

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
		return UMLPackage.Literals.LIFELINE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getOwnedElements() {
		EList ownedElement = (EList) eVirtualGet(UMLPackage.LIFELINE__OWNED_ELEMENT);
		if (ownedElement == null) {
			eVirtualSet(UMLPackage.LIFELINE__OWNED_ELEMENT,
				ownedElement = new DerivedUnionEObjectEList(Element.class,
					this, UMLPackage.LIFELINE__OWNED_ELEMENT, new int[]{
						UMLPackage.LIFELINE__OWNED_COMMENT,
						UMLPackage.LIFELINE__NAME_EXPRESSION,
						UMLPackage.LIFELINE__SELECTOR}));
		}
		return ownedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectableElement getRepresents() {
		ConnectableElement represents = (ConnectableElement) eVirtualGet(UMLPackage.LIFELINE__REPRESENTS);
		if (represents != null && represents.eIsProxy()) {
			InternalEObject oldRepresents = (InternalEObject) represents;
			represents = (ConnectableElement) eResolveProxy(oldRepresents);
			if (represents != oldRepresents) {
				eVirtualSet(UMLPackage.LIFELINE__REPRESENTS, represents);
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
						UMLPackage.LIFELINE__REPRESENTS, oldRepresents,
						represents));
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
		return (ConnectableElement) eVirtualGet(UMLPackage.LIFELINE__REPRESENTS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRepresents(ConnectableElement newRepresents) {
		ConnectableElement represents = newRepresents;
		Object oldRepresents = eVirtualSet(UMLPackage.LIFELINE__REPRESENTS,
			represents);
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.LIFELINE__REPRESENTS,
				oldRepresents == EVIRTUAL_NO_VALUE
					? null
					: oldRepresents, represents));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Interaction getInteraction() {
		if (eContainerFeatureID != UMLPackage.LIFELINE__INTERACTION)
			return null;
		return (Interaction) eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Interaction basicGetInteraction() {
		if (eContainerFeatureID != UMLPackage.LIFELINE__INTERACTION)
			return null;
		return (Interaction) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInteraction(Interaction newInteraction,
			NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newInteraction,
			UMLPackage.LIFELINE__INTERACTION, msgs);

		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInteraction(Interaction newInteraction) {
		if (newInteraction != eInternalContainer()
			|| (eContainerFeatureID != UMLPackage.LIFELINE__INTERACTION && newInteraction != null)) {
			if (EcoreUtil.isAncestor(this, newInteraction))
				throw new IllegalArgumentException(
					"Recursive containment not allowed for " + toString()); //$NON-NLS-1$
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newInteraction != null)
				msgs = ((InternalEObject) newInteraction).eInverseAdd(this,
					UMLPackage.INTERACTION__LIFELINE, Interaction.class, msgs);
			msgs = basicSetInteraction(newInteraction, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.LIFELINE__INTERACTION, newInteraction,
				newInteraction));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueSpecification getSelector() {
		ValueSpecification selector = (ValueSpecification) eVirtualGet(UMLPackage.LIFELINE__SELECTOR);
		if (selector != null && selector.eIsProxy()) {
			InternalEObject oldSelector = (InternalEObject) selector;
			selector = (ValueSpecification) eResolveProxy(oldSelector);
			if (selector != oldSelector) {
				InternalEObject newSelector = (InternalEObject) selector;
				NotificationChain msgs = oldSelector.eInverseRemove(this,
					EOPPOSITE_FEATURE_BASE - UMLPackage.LIFELINE__SELECTOR,
					null, null);
				if (newSelector.eInternalContainer() == null) {
					msgs = newSelector.eInverseAdd(this, EOPPOSITE_FEATURE_BASE
						- UMLPackage.LIFELINE__SELECTOR, null, msgs);
				}
				if (msgs != null)
					msgs.dispatch();
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
						UMLPackage.LIFELINE__SELECTOR, oldSelector, selector));
			}
		}
		return selector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueSpecification basicGetSelector() {
		return (ValueSpecification) eVirtualGet(UMLPackage.LIFELINE__SELECTOR);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSelector(ValueSpecification newSelector,
			NotificationChain msgs) {
		Object oldSelector = eVirtualSet(UMLPackage.LIFELINE__SELECTOR,
			newSelector);
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
				Notification.SET, UMLPackage.LIFELINE__SELECTOR,
				oldSelector == EVIRTUAL_NO_VALUE
					? null
					: oldSelector, newSelector);
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
	public void setSelector(ValueSpecification newSelector) {
		ValueSpecification selector = (ValueSpecification) eVirtualGet(UMLPackage.LIFELINE__SELECTOR);
		if (newSelector != selector) {
			NotificationChain msgs = null;
			if (selector != null)
				msgs = ((InternalEObject) selector).eInverseRemove(this,
					EOPPOSITE_FEATURE_BASE - UMLPackage.LIFELINE__SELECTOR,
					null, msgs);
			if (newSelector != null)
				msgs = ((InternalEObject) newSelector).eInverseAdd(this,
					EOPPOSITE_FEATURE_BASE - UMLPackage.LIFELINE__SELECTOR,
					null, msgs);
			msgs = basicSetSelector(newSelector, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.LIFELINE__SELECTOR, newSelector, newSelector));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueSpecification createSelector(String name, Type type,
			EClass eClass) {
		ValueSpecification newSelector = (ValueSpecification) create(eClass);
		if (name != null)
			newSelector.setName(name);
		if (type != null)
			newSelector.setType(type);
		setSelector(newSelector);
		return newSelector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PartDecomposition getDecomposedAs() {
		PartDecomposition decomposedAs = (PartDecomposition) eVirtualGet(UMLPackage.LIFELINE__DECOMPOSED_AS);
		if (decomposedAs != null && decomposedAs.eIsProxy()) {
			InternalEObject oldDecomposedAs = (InternalEObject) decomposedAs;
			decomposedAs = (PartDecomposition) eResolveProxy(oldDecomposedAs);
			if (decomposedAs != oldDecomposedAs) {
				eVirtualSet(UMLPackage.LIFELINE__DECOMPOSED_AS, decomposedAs);
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
						UMLPackage.LIFELINE__DECOMPOSED_AS, oldDecomposedAs,
						decomposedAs));
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
		return (PartDecomposition) eVirtualGet(UMLPackage.LIFELINE__DECOMPOSED_AS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDecomposedAs(PartDecomposition newDecomposedAs) {
		PartDecomposition decomposedAs = newDecomposedAs;
		Object oldDecomposedAs = eVirtualSet(
			UMLPackage.LIFELINE__DECOMPOSED_AS, decomposedAs);
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.LIFELINE__DECOMPOSED_AS,
				oldDecomposedAs == EVIRTUAL_NO_VALUE
					? null
					: oldDecomposedAs, decomposedAs));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getCoveredBys() {
		EList coveredBy = (EList) eVirtualGet(UMLPackage.LIFELINE__COVERED_BY);
		if (coveredBy == null) {
			eVirtualSet(UMLPackage.LIFELINE__COVERED_BY,
				coveredBy = new EObjectWithInverseResolvingEList.ManyInverse(
					InteractionFragment.class, this,
					UMLPackage.LIFELINE__COVERED_BY,
					UMLPackage.INTERACTION_FRAGMENT__COVERED));
		}
		return coveredBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InteractionFragment getCoveredBy(String name) {
		return getCoveredBy(name, false, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InteractionFragment getCoveredBy(String name, boolean ignoreCase,
			EClass eClass) {
		coveredByLoop : for (Iterator i = getCoveredBys().iterator(); i
			.hasNext();) {
			InteractionFragment coveredBy = (InteractionFragment) i.next();
			if (eClass != null && !eClass.isInstance(coveredBy))
				continue coveredByLoop;
			if (name != null && !(ignoreCase
				? name.equalsIgnoreCase(coveredBy.getName())
				: name.equals(coveredBy.getName())))
				continue coveredByLoop;
			return coveredBy;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInteractionUsesShareLifeline(
			DiagnosticChain diagnostics, Map context) {
		return LifelineOperations.validateInteractionUsesShareLifeline(this,
			diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSelectorSpecified(DiagnosticChain diagnostics,
			Map context) {
		return LifelineOperations.validateSelectorSpecified(this, diagnostics,
			context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSameClassifier(DiagnosticChain diagnostics,
			Map context) {
		return LifelineOperations.validateSameClassifier(this, diagnostics,
			context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UMLPackage.LIFELINE__EANNOTATIONS :
				return ((InternalEList) getEAnnotations()).basicAdd(otherEnd,
					msgs);
			case UMLPackage.LIFELINE__CLIENT_DEPENDENCY :
				return ((InternalEList) getClientDependencies()).basicAdd(
					otherEnd, msgs);
			case UMLPackage.LIFELINE__INTERACTION :
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetInteraction((Interaction) otherEnd, msgs);
			case UMLPackage.LIFELINE__COVERED_BY :
				return ((InternalEList) getCoveredBys()).basicAdd(otherEnd,
					msgs);
		}
		return eDynamicInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UMLPackage.LIFELINE__EANNOTATIONS :
				return ((InternalEList) getEAnnotations()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.LIFELINE__OWNED_COMMENT :
				return ((InternalEList) getOwnedComments()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.LIFELINE__CLIENT_DEPENDENCY :
				return ((InternalEList) getClientDependencies()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.LIFELINE__NAME_EXPRESSION :
				return basicSetNameExpression(null, msgs);
			case UMLPackage.LIFELINE__INTERACTION :
				return basicSetInteraction(null, msgs);
			case UMLPackage.LIFELINE__SELECTOR :
				return basicSetSelector(null, msgs);
			case UMLPackage.LIFELINE__COVERED_BY :
				return ((InternalEList) getCoveredBys()).basicRemove(otherEnd,
					msgs);
		}
		return eDynamicInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eBasicRemoveFromContainerFeature(
			NotificationChain msgs) {
		switch (eContainerFeatureID) {
			case UMLPackage.LIFELINE__INTERACTION :
				return eInternalContainer().eInverseRemove(this,
					UMLPackage.INTERACTION__LIFELINE, Interaction.class, msgs);
		}
		return eDynamicBasicRemoveFromContainer(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UMLPackage.LIFELINE__EANNOTATIONS :
				return getEAnnotations();
			case UMLPackage.LIFELINE__OWNED_ELEMENT :
				return getOwnedElements();
			case UMLPackage.LIFELINE__OWNER :
				if (resolve)
					return getOwner();
				return basicGetOwner();
			case UMLPackage.LIFELINE__OWNED_COMMENT :
				return getOwnedComments();
			case UMLPackage.LIFELINE__NAME :
				return getName();
			case UMLPackage.LIFELINE__VISIBILITY :
				return getVisibility();
			case UMLPackage.LIFELINE__QUALIFIED_NAME :
				return getQualifiedName();
			case UMLPackage.LIFELINE__CLIENT_DEPENDENCY :
				return getClientDependencies();
			case UMLPackage.LIFELINE__NAMESPACE :
				if (resolve)
					return getNamespace();
				return basicGetNamespace();
			case UMLPackage.LIFELINE__NAME_EXPRESSION :
				if (resolve)
					return getNameExpression();
				return basicGetNameExpression();
			case UMLPackage.LIFELINE__REPRESENTS :
				if (resolve)
					return getRepresents();
				return basicGetRepresents();
			case UMLPackage.LIFELINE__INTERACTION :
				if (resolve)
					return getInteraction();
				return basicGetInteraction();
			case UMLPackage.LIFELINE__SELECTOR :
				if (resolve)
					return getSelector();
				return basicGetSelector();
			case UMLPackage.LIFELINE__DECOMPOSED_AS :
				if (resolve)
					return getDecomposedAs();
				return basicGetDecomposedAs();
			case UMLPackage.LIFELINE__COVERED_BY :
				return getCoveredBys();
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
			case UMLPackage.LIFELINE__EANNOTATIONS :
				getEAnnotations().clear();
				getEAnnotations().addAll((Collection) newValue);
				return;
			case UMLPackage.LIFELINE__OWNED_COMMENT :
				getOwnedComments().clear();
				getOwnedComments().addAll((Collection) newValue);
				return;
			case UMLPackage.LIFELINE__NAME :
				setName((String) newValue);
				return;
			case UMLPackage.LIFELINE__VISIBILITY :
				setVisibility((VisibilityKind) newValue);
				return;
			case UMLPackage.LIFELINE__CLIENT_DEPENDENCY :
				getClientDependencies().clear();
				getClientDependencies().addAll((Collection) newValue);
				return;
			case UMLPackage.LIFELINE__NAME_EXPRESSION :
				setNameExpression((StringExpression) newValue);
				return;
			case UMLPackage.LIFELINE__REPRESENTS :
				setRepresents((ConnectableElement) newValue);
				return;
			case UMLPackage.LIFELINE__INTERACTION :
				setInteraction((Interaction) newValue);
				return;
			case UMLPackage.LIFELINE__SELECTOR :
				setSelector((ValueSpecification) newValue);
				return;
			case UMLPackage.LIFELINE__DECOMPOSED_AS :
				setDecomposedAs((PartDecomposition) newValue);
				return;
			case UMLPackage.LIFELINE__COVERED_BY :
				getCoveredBys().clear();
				getCoveredBys().addAll((Collection) newValue);
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
			case UMLPackage.LIFELINE__EANNOTATIONS :
				getEAnnotations().clear();
				return;
			case UMLPackage.LIFELINE__OWNED_COMMENT :
				getOwnedComments().clear();
				return;
			case UMLPackage.LIFELINE__NAME :
				unsetName();
				return;
			case UMLPackage.LIFELINE__VISIBILITY :
				unsetVisibility();
				return;
			case UMLPackage.LIFELINE__CLIENT_DEPENDENCY :
				getClientDependencies().clear();
				return;
			case UMLPackage.LIFELINE__NAME_EXPRESSION :
				setNameExpression((StringExpression) null);
				return;
			case UMLPackage.LIFELINE__REPRESENTS :
				setRepresents((ConnectableElement) null);
				return;
			case UMLPackage.LIFELINE__INTERACTION :
				setInteraction((Interaction) null);
				return;
			case UMLPackage.LIFELINE__SELECTOR :
				setSelector((ValueSpecification) null);
				return;
			case UMLPackage.LIFELINE__DECOMPOSED_AS :
				setDecomposedAs((PartDecomposition) null);
				return;
			case UMLPackage.LIFELINE__COVERED_BY :
				getCoveredBys().clear();
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
			case UMLPackage.LIFELINE__EANNOTATIONS :
				EList eAnnotations = (EList) eVirtualGet(UMLPackage.LIFELINE__EANNOTATIONS);
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UMLPackage.LIFELINE__OWNED_ELEMENT :
				return isSetOwnedElements();
			case UMLPackage.LIFELINE__OWNER :
				return isSetOwner();
			case UMLPackage.LIFELINE__OWNED_COMMENT :
				EList ownedComment = (EList) eVirtualGet(UMLPackage.LIFELINE__OWNED_COMMENT);
				return ownedComment != null && !ownedComment.isEmpty();
			case UMLPackage.LIFELINE__NAME :
				return isSetName();
			case UMLPackage.LIFELINE__VISIBILITY :
				return isSetVisibility();
			case UMLPackage.LIFELINE__QUALIFIED_NAME :
				return QUALIFIED_NAME_EDEFAULT == null
					? getQualifiedName() != null
					: !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case UMLPackage.LIFELINE__CLIENT_DEPENDENCY :
				EList clientDependency = (EList) eVirtualGet(UMLPackage.LIFELINE__CLIENT_DEPENDENCY);
				return clientDependency != null && !clientDependency.isEmpty();
			case UMLPackage.LIFELINE__NAMESPACE :
				return isSetNamespace();
			case UMLPackage.LIFELINE__NAME_EXPRESSION :
				return eVirtualGet(UMLPackage.LIFELINE__NAME_EXPRESSION) != null;
			case UMLPackage.LIFELINE__REPRESENTS :
				return eVirtualGet(UMLPackage.LIFELINE__REPRESENTS) != null;
			case UMLPackage.LIFELINE__INTERACTION :
				return basicGetInteraction() != null;
			case UMLPackage.LIFELINE__SELECTOR :
				return eVirtualGet(UMLPackage.LIFELINE__SELECTOR) != null;
			case UMLPackage.LIFELINE__DECOMPOSED_AS :
				return eVirtualGet(UMLPackage.LIFELINE__DECOMPOSED_AS) != null;
			case UMLPackage.LIFELINE__COVERED_BY :
				EList coveredBy = (EList) eVirtualGet(UMLPackage.LIFELINE__COVERED_BY);
				return coveredBy != null && !coveredBy.isEmpty();
		}
		return eDynamicIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Namespace basicGetNamespace() {
		Interaction interaction = basicGetInteraction();
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
			|| eIsSet(UMLPackage.LIFELINE__INTERACTION);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOwnedElements() {
		return super.isSetOwnedElements()
			|| eIsSet(UMLPackage.LIFELINE__SELECTOR);
	}

} //LifelineImpl
