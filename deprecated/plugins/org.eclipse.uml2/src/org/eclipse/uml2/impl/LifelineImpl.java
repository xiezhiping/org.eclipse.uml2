/*
 * Copyright (c) 2003, 2004 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Common Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/cpl-v10.html
 *
 * Contributors:
 *   IBM - Initial API and implementation
 */
package org.eclipse.uml2.impl;

import java.util.Collection;
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
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.uml2.ConnectableElement;
import org.eclipse.uml2.Interaction;
import org.eclipse.uml2.InteractionFragment;
import org.eclipse.uml2.Lifeline;
import org.eclipse.uml2.Namespace;
import org.eclipse.uml2.OpaqueExpression;
import org.eclipse.uml2.PartDecomposition;
import org.eclipse.uml2.StringExpression;
import org.eclipse.uml2.TemplateSignature;
import org.eclipse.uml2.UML2Package;
import org.eclipse.uml2.VisibilityKind;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Lifeline</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2.impl.LifelineImpl#getCoveredBys <em>Covered By</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.LifelineImpl#getRepresents <em>Represents</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.LifelineImpl#getInteraction <em>Interaction</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.LifelineImpl#getDiscriminator <em>Discriminator</em>}</li>
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
	public static final String copyright = "Copyright (c) 2003, 2004 IBM Corporation and others."; //$NON-NLS-1$

	/**
	 * The cached value of the '{@link #getCoveredBys() <em>Covered By</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoveredBys()
	 * @generated
	 * @ordered
	 */
	protected EList coveredBy = null;

	/**
	 * The cached value of the '{@link #getRepresents() <em>Represents</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepresents()
	 * @generated
	 * @ordered
	 */
	protected ConnectableElement represents = null;

	/**
	 * The cached value of the '{@link #getDiscriminator() <em>Discriminator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiscriminator()
	 * @generated
	 * @ordered
	 */
	protected OpaqueExpression discriminator = null;

	/**
	 * The cached value of the '{@link #getDecomposedAs() <em>Decomposed As</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDecomposedAs()
	 * @generated
	 * @ordered
	 */
	protected PartDecomposition decomposedAs = null;

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
		return UML2Package.eINSTANCE.getLifeline();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * Returns the value of the '<em><b>Covered By</b></em>' reference list.
	 * @generated
	 */
	public EList getCoveredBys() {
		if (null == coveredBy) {
			coveredBy = new EObjectWithInverseResolvingEList.ManyInverse(InteractionFragment.class, this, UML2Package.LIFELINE__COVERED_BY, UML2Package.INTERACTION_FRAGMENT__COVERED);
		}
		return coveredBy;
	}

    /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
     */
    public InteractionFragment getCoveredBy(String unqualifiedName) {
    	for (Iterator i = getCoveredBys().iterator(); i.hasNext(); ) {
    		InteractionFragment namedCoveredBy = (InteractionFragment) i.next();
    		
    		if (unqualifiedName.equals(namedCoveredBy.getName())) {
    			return namedCoveredBy;
    		}
    	}
    	
    	return null;
    }
      
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * Returns the value of the '<em><b>Represents</b></em>' reference.
	 * @generated
	 */
	public ConnectableElement getRepresents() {
		if (represents != null && represents.eIsProxy()) {
			ConnectableElement oldRepresents = represents;
			represents = (ConnectableElement)eResolveProxy((InternalEObject)represents);
			if (represents != oldRepresents) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UML2Package.LIFELINE__REPRESENTS, oldRepresents, represents));
			}
		}
		return represents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * Returns the value of the '<em><b>Represents</b></em>' reference.
	 * @generated
	 */
	public ConnectableElement basicGetRepresents() {
		return represents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRepresents(ConnectableElement newRepresents) {
		ConnectableElement oldRepresents = represents;
		represents = newRepresents;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2Package.LIFELINE__REPRESENTS, oldRepresents, represents));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * Returns the value of the '<em><b>Interaction</b></em>' container reference.
	 * <p>
	 * Subsets the following features:
	 * <ul>
	 *   <li>{@link org.eclipse.uml2.NamedElement#getNamespace}</li>
	 * </ul>
	 * </p>
	 * @generated
	 */
	public Interaction getInteraction() {
		if (eContainerFeatureID != UML2Package.LIFELINE__INTERACTION) return null;
		return (Interaction)eContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInteraction(Interaction newInteraction) {
		if (newInteraction != eContainer || (eContainerFeatureID != UML2Package.LIFELINE__INTERACTION && newInteraction != null)) {
			if (EcoreUtil.isAncestor(this, newInteraction))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString()); //$NON-NLS-1$
			NotificationChain msgs = null;
			if (eContainer != null)
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
	 * Returns the value of the '<em><b>Discriminator</b></em>' containment reference.
	 * <p>
	 * Subsets the following features:
	 * <ul>
	 *   <li>{@link org.eclipse.uml2.Element#getOwnedElements}</li>
	 * </ul>
	 * </p>
	 * @generated
	 */
	public OpaqueExpression getDiscriminator() {
		return discriminator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDiscriminator(OpaqueExpression newDiscriminator, NotificationChain msgs) {
		OpaqueExpression oldDiscriminator = discriminator;
		discriminator = newDiscriminator;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UML2Package.LIFELINE__DISCRIMINATOR, oldDiscriminator, newDiscriminator);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDiscriminator(OpaqueExpression newDiscriminator) {
		if (newDiscriminator != discriminator) {
			NotificationChain msgs = null;
			if (discriminator != null)
				msgs = ((InternalEObject)discriminator).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UML2Package.LIFELINE__DISCRIMINATOR, null, msgs);
			if (newDiscriminator != null)
				msgs = ((InternalEObject)newDiscriminator).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UML2Package.LIFELINE__DISCRIMINATOR, null, msgs);
			msgs = basicSetDiscriminator(newDiscriminator, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2Package.LIFELINE__DISCRIMINATOR, newDiscriminator, newDiscriminator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OpaqueExpression createDiscriminator(EClass eClass) {
		OpaqueExpression newDiscriminator = (OpaqueExpression) eClass.getEPackage().getEFactoryInstance().create(eClass);
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.CREATE, UML2Package.LIFELINE__DISCRIMINATOR, null, newDiscriminator));
		}
        setDiscriminator(newDiscriminator);
		return newDiscriminator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * Returns the value of the '<em><b>Decomposed As</b></em>' reference.
	 * @generated
	 */
	public PartDecomposition getDecomposedAs() {
		if (decomposedAs != null && decomposedAs.eIsProxy()) {
			PartDecomposition oldDecomposedAs = decomposedAs;
			decomposedAs = (PartDecomposition)eResolveProxy((InternalEObject)decomposedAs);
			if (decomposedAs != oldDecomposedAs) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UML2Package.LIFELINE__DECOMPOSED_AS, oldDecomposedAs, decomposedAs));
			}
		}
		return decomposedAs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * Returns the value of the '<em><b>Decomposed As</b></em>' reference.
	 * @generated
	 */
	public PartDecomposition basicGetDecomposedAs() {
		return decomposedAs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDecomposedAs(PartDecomposition newDecomposedAs) {
		PartDecomposition oldDecomposedAs = decomposedAs;
		decomposedAs = newDecomposedAs;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2Package.LIFELINE__DECOMPOSED_AS, oldDecomposedAs, decomposedAs));
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
		if (null != getInteraction()) {
			return (Namespace) getInteraction();
		}
		return super.getNamespace();
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
			if (null != getDiscriminator()) {
				union.add(getDiscriminator());
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
					if (ownedTemplateSignature != null)
						msgs = ((InternalEObject)ownedTemplateSignature).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UML2Package.LIFELINE__OWNED_TEMPLATE_SIGNATURE, null, msgs);
					return basicSetOwnedTemplateSignature((TemplateSignature)otherEnd, msgs);
				case UML2Package.LIFELINE__CLIENT_DEPENDENCY:
					return ((InternalEList)getClientDependencies()).basicAdd(otherEnd, msgs);
				case UML2Package.LIFELINE__COVERED_BY:
					return ((InternalEList)getCoveredBys()).basicAdd(otherEnd, msgs);
				case UML2Package.LIFELINE__INTERACTION:
					if (eContainer != null)
						msgs = eBasicRemoveFromContainer(msgs);
					return eBasicSetContainer(otherEnd, UML2Package.LIFELINE__INTERACTION, msgs);
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
				case UML2Package.LIFELINE__DISCRIMINATOR:
					return basicSetDiscriminator(null, msgs);
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
					return eContainer.eInverseRemove(this, UML2Package.INTERACTION__LIFELINE, Interaction.class, msgs);
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
			case UML2Package.LIFELINE__DISCRIMINATOR:
				return getDiscriminator();
			case UML2Package.LIFELINE__DECOMPOSED_AS:
				if (resolve) return getDecomposedAs();
				return basicGetDecomposedAs();
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
			case UML2Package.LIFELINE__DISCRIMINATOR:
				setDiscriminator((OpaqueExpression)newValue);
				return;
			case UML2Package.LIFELINE__DECOMPOSED_AS:
				setDecomposedAs((PartDecomposition)newValue);
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
			case UML2Package.LIFELINE__DISCRIMINATOR:
				setDiscriminator((OpaqueExpression)null);
				return;
			case UML2Package.LIFELINE__DECOMPOSED_AS:
				setDecomposedAs((PartDecomposition)null);
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
			case UML2Package.LIFELINE__EANNOTATIONS:
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UML2Package.LIFELINE__OWNED_ELEMENT:
				return !getOwnedElements().isEmpty();
			case UML2Package.LIFELINE__OWNER:
				return basicGetOwner() != null;
			case UML2Package.LIFELINE__OWNED_COMMENT:
				return ownedComment != null && !ownedComment.isEmpty();
			case UML2Package.LIFELINE__TEMPLATE_BINDING:
				return templateBinding != null && !templateBinding.isEmpty();
			case UML2Package.LIFELINE__OWNED_TEMPLATE_SIGNATURE:
				return ownedTemplateSignature != null;
			case UML2Package.LIFELINE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case UML2Package.LIFELINE__QUALIFIED_NAME:
				return !"".equals(getQualifiedName()); //$NON-NLS-1$
			case UML2Package.LIFELINE__VISIBILITY:
				return visibility != VISIBILITY_EDEFAULT;
			case UML2Package.LIFELINE__CLIENT_DEPENDENCY:
				return clientDependency != null && !clientDependency.isEmpty();
			case UML2Package.LIFELINE__NAME_EXPRESSION:
				return nameExpression != null;
			case UML2Package.LIFELINE__COVERED_BY:
				return coveredBy != null && !coveredBy.isEmpty();
			case UML2Package.LIFELINE__REPRESENTS:
				return represents != null;
			case UML2Package.LIFELINE__INTERACTION:
				return getInteraction() != null;
			case UML2Package.LIFELINE__DISCRIMINATOR:
				return discriminator != null;
			case UML2Package.LIFELINE__DECOMPOSED_AS:
				return decomposedAs != null;
		}
		return eDynamicIsSet(eFeature);
	}

} //LifelineImpl
