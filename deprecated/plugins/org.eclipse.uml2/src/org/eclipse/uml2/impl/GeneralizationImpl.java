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
import org.eclipse.uml2.Classifier;
import org.eclipse.uml2.Element;
import org.eclipse.uml2.Generalization;
import org.eclipse.uml2.GeneralizationSet;
import org.eclipse.uml2.UML2Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Generalization</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2.impl.GeneralizationImpl#getSpecific <em>Specific</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.GeneralizationImpl#getGeneral <em>General</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.GeneralizationImpl#isSubstitutable <em>Is Substitutable</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.GeneralizationImpl#getGeneralizationSets <em>Generalization Set</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GeneralizationImpl extends DirectedRelationshipImpl implements Generalization {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2003, 2004 IBM Corporation and others."; //$NON-NLS-1$

	/**
	 * The cached value of the '{@link #getGeneral() <em>General</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneral()
	 * @generated
	 * @ordered
	 */
	protected Classifier general = null;

	/**
	 * The default value of the '{@link #isSubstitutable() <em>Is Substitutable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSubstitutable()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_SUBSTITUTABLE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isSubstitutable() <em>Is Substitutable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSubstitutable()
	 * @generated
	 * @ordered
	 */
	protected boolean isSubstitutable = IS_SUBSTITUTABLE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getGeneralizationSets() <em>Generalization Set</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneralizationSets()
	 * @generated
	 * @ordered
	 */
	protected EList generalizationSet = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GeneralizationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return UML2Package.eINSTANCE.getGeneralization();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * Returns the value of the '<em><b>Is Substitutable</b></em>' attribute.
	 * @generated
	 */
	public boolean isSubstitutable() {
		return isSubstitutable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsSubstitutable(boolean newIsSubstitutable) {
		boolean oldIsSubstitutable = isSubstitutable;
		isSubstitutable = newIsSubstitutable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2Package.GENERALIZATION__IS_SUBSTITUTABLE, oldIsSubstitutable, isSubstitutable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * Returns the value of the '<em><b>Specific</b></em>' container reference.
	 * <p>
	 * Subsets the following features:
	 * <ul>
	 *   <li>{@link org.eclipse.uml2.DirectedRelationship#getSources}</li>
	 *   <li>{@link org.eclipse.uml2.Element#getOwner}</li>
	 * </ul>
	 * </p>
	 * @generated
	 */
	public Classifier getSpecific() {
		if (eContainerFeatureID != UML2Package.GENERALIZATION__SPECIFIC) return null;
		return (Classifier)eContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpecific(Classifier newSpecific) {
		if (newSpecific != eContainer || (eContainerFeatureID != UML2Package.GENERALIZATION__SPECIFIC && newSpecific != null)) {
			if (EcoreUtil.isAncestor(this, newSpecific))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString()); //$NON-NLS-1$
			NotificationChain msgs = null;
			if (eContainer != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newSpecific != null)
				msgs = ((InternalEObject)newSpecific).eInverseAdd(this, UML2Package.CLASSIFIER__GENERALIZATION, Classifier.class, msgs);
			msgs = eBasicSetContainer((InternalEObject)newSpecific, UML2Package.GENERALIZATION__SPECIFIC, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2Package.GENERALIZATION__SPECIFIC, newSpecific, newSpecific));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * Returns the value of the '<em><b>General</b></em>' reference.
	 * <p>
	 * Subsets the following features:
	 * <ul>
	 *   <li>{@link org.eclipse.uml2.DirectedRelationship#getTargets}</li>
	 * </ul>
	 * </p>
	 * @generated
	 */
	public Classifier getGeneral() {
		if (general != null && general.eIsProxy()) {
			Classifier oldGeneral = general;
			general = (Classifier)eResolveProxy((InternalEObject)general);
			if (general != oldGeneral) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UML2Package.GENERALIZATION__GENERAL, oldGeneral, general));
			}
		}
		return general;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * Returns the value of the '<em><b>General</b></em>' reference.
	 * <p>
	 * Subsets the following features:
	 * <ul>
	 *   <li>{@link org.eclipse.uml2.DirectedRelationship#getTargets}</li>
	 * </ul>
	 * </p>
	 * @generated
	 */
	public Classifier basicGetGeneral() {
		return general;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGeneral(Classifier newGeneral) {
		Classifier oldGeneral = general;
		general = newGeneral;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2Package.GENERALIZATION__GENERAL, oldGeneral, general));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * Returns the value of the '<em><b>Generalization Set</b></em>' reference list.
	 * @generated
	 */
	public EList getGeneralizationSets() {
		if (generalizationSet == null) {
			generalizationSet = new EObjectWithInverseResolvingEList.ManyInverse(GeneralizationSet.class, this, UML2Package.GENERALIZATION__GENERALIZATION_SET, UML2Package.GENERALIZATION_SET__GENERALIZATION);
		}
		return generalizationSet;
	}

    /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
     */
    public GeneralizationSet getGeneralizationSet(String unqualifiedName) {
    	for (Iterator i = getGeneralizationSets().iterator(); i.hasNext(); ) {
    		GeneralizationSet namedGeneralizationSet = (GeneralizationSet) i.next();
    		
    		if (unqualifiedName.equals(namedGeneralizationSet.getName())) {
    			return namedGeneralizationSet;
    		}
    	}
    	
    	return null;
    }
      
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * Returns the value of the '<em><b>Source</b></em>' reference list, a derived union.
	 * The list contents are of type {@link org.eclipse.uml2.Element}.
	 * @generated
	 */
	public EList getSources() {
		// TODO: test this union getter
		if (!getCacheAdapter().containsKey(this, UML2Package.eINSTANCE.getDirectedRelationship_Source())) {
			Set union = new LinkedHashSet();
			union.addAll(super.getSources());
			if (null != getSpecific()) {
				union.add(getSpecific());
			}
			getCacheAdapter().put(
				this,
				UML2Package.eINSTANCE.getDirectedRelationship_Source(),
				new EcoreEList.UnmodifiableEList(this, 
					UML2Package.eINSTANCE.getDirectedRelationship_Source(),
					union.size(),
					union.toArray()));
		}
		return (EList) getCacheAdapter().get(this, UML2Package.eINSTANCE.getDirectedRelationship_Source());
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
		if (null != getSpecific()) {
			return (Element) getSpecific();
		}
		return super.basicGetOwner();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * Returns the value of the '<em><b>Target</b></em>' reference list, a derived union.
	 * The list contents are of type {@link org.eclipse.uml2.Element}.
	 * @generated
	 */
	public EList getTargets() {
		// TODO: test this union getter
		if (!getCacheAdapter().containsKey(this, UML2Package.eINSTANCE.getDirectedRelationship_Target())) {
			Set union = new LinkedHashSet();
			union.addAll(super.getTargets());
			if (null != getGeneral()) {
				union.add(getGeneral());
			}
			getCacheAdapter().put(
				this,
				UML2Package.eINSTANCE.getDirectedRelationship_Target(),
				new EcoreEList.UnmodifiableEList(this, 
					UML2Package.eINSTANCE.getDirectedRelationship_Target(),
					union.size(),
					union.toArray()));
		}
		return (EList) getCacheAdapter().get(this, UML2Package.eINSTANCE.getDirectedRelationship_Target());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, Class baseClass, NotificationChain msgs) {
		if (featureID >= 0) {
			switch (eDerivedStructuralFeatureID(featureID, baseClass)) {
				case UML2Package.GENERALIZATION__EANNOTATIONS:
					return ((InternalEList)getEAnnotations()).basicAdd(otherEnd, msgs);
				case UML2Package.GENERALIZATION__SPECIFIC:
					if (eContainer != null)
						msgs = eBasicRemoveFromContainer(msgs);
					return eBasicSetContainer(otherEnd, UML2Package.GENERALIZATION__SPECIFIC, msgs);
				case UML2Package.GENERALIZATION__GENERALIZATION_SET:
					return ((InternalEList)getGeneralizationSets()).basicAdd(otherEnd, msgs);
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
				case UML2Package.GENERALIZATION__EANNOTATIONS:
					return ((InternalEList)getEAnnotations()).basicRemove(otherEnd, msgs);
				case UML2Package.GENERALIZATION__OWNED_COMMENT:
					return ((InternalEList)getOwnedComments()).basicRemove(otherEnd, msgs);
				case UML2Package.GENERALIZATION__SPECIFIC:
					return eBasicSetContainer(null, UML2Package.GENERALIZATION__SPECIFIC, msgs);
				case UML2Package.GENERALIZATION__GENERALIZATION_SET:
					return ((InternalEList)getGeneralizationSets()).basicRemove(otherEnd, msgs);
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
				case UML2Package.GENERALIZATION__SPECIFIC:
					return eContainer.eInverseRemove(this, UML2Package.CLASSIFIER__GENERALIZATION, Classifier.class, msgs);
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
			case UML2Package.GENERALIZATION__EANNOTATIONS:
				return getEAnnotations();
			case UML2Package.GENERALIZATION__OWNED_ELEMENT:
				return getOwnedElements();
			case UML2Package.GENERALIZATION__OWNER:
				if (resolve) return getOwner();
				return basicGetOwner();
			case UML2Package.GENERALIZATION__OWNED_COMMENT:
				return getOwnedComments();
			case UML2Package.GENERALIZATION__RELATED_ELEMENT:
				return getRelatedElements();
			case UML2Package.GENERALIZATION__SOURCE:
				return getSources();
			case UML2Package.GENERALIZATION__TARGET:
				return getTargets();
			case UML2Package.GENERALIZATION__SPECIFIC:
				return getSpecific();
			case UML2Package.GENERALIZATION__GENERAL:
				if (resolve) return getGeneral();
				return basicGetGeneral();
			case UML2Package.GENERALIZATION__IS_SUBSTITUTABLE:
				return isSubstitutable() ? Boolean.TRUE : Boolean.FALSE;
			case UML2Package.GENERALIZATION__GENERALIZATION_SET:
				return getGeneralizationSets();
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
			case UML2Package.GENERALIZATION__EANNOTATIONS:
				getEAnnotations().clear();
				getEAnnotations().addAll((Collection)newValue);
				return;
			case UML2Package.GENERALIZATION__OWNED_COMMENT:
				getOwnedComments().clear();
				getOwnedComments().addAll((Collection)newValue);
				return;
			case UML2Package.GENERALIZATION__SPECIFIC:
				setSpecific((Classifier)newValue);
				return;
			case UML2Package.GENERALIZATION__GENERAL:
				setGeneral((Classifier)newValue);
				return;
			case UML2Package.GENERALIZATION__IS_SUBSTITUTABLE:
				setIsSubstitutable(((Boolean)newValue).booleanValue());
				return;
			case UML2Package.GENERALIZATION__GENERALIZATION_SET:
				getGeneralizationSets().clear();
				getGeneralizationSets().addAll((Collection)newValue);
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
			case UML2Package.GENERALIZATION__EANNOTATIONS:
				getEAnnotations().clear();
				return;
			case UML2Package.GENERALIZATION__OWNED_COMMENT:
				getOwnedComments().clear();
				return;
			case UML2Package.GENERALIZATION__SPECIFIC:
				setSpecific((Classifier)null);
				return;
			case UML2Package.GENERALIZATION__GENERAL:
				setGeneral((Classifier)null);
				return;
			case UML2Package.GENERALIZATION__IS_SUBSTITUTABLE:
				setIsSubstitutable(IS_SUBSTITUTABLE_EDEFAULT);
				return;
			case UML2Package.GENERALIZATION__GENERALIZATION_SET:
				getGeneralizationSets().clear();
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
			case UML2Package.GENERALIZATION__EANNOTATIONS:
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UML2Package.GENERALIZATION__OWNED_ELEMENT:
				return !getOwnedElements().isEmpty();
			case UML2Package.GENERALIZATION__OWNER:
				return basicGetOwner() != null;
			case UML2Package.GENERALIZATION__OWNED_COMMENT:
				return ownedComment != null && !ownedComment.isEmpty();
			case UML2Package.GENERALIZATION__RELATED_ELEMENT:
				return !getRelatedElements().isEmpty();
			case UML2Package.GENERALIZATION__SOURCE:
				return !getSources().isEmpty();
			case UML2Package.GENERALIZATION__TARGET:
				return !getTargets().isEmpty();
			case UML2Package.GENERALIZATION__SPECIFIC:
				return getSpecific() != null;
			case UML2Package.GENERALIZATION__GENERAL:
				return general != null;
			case UML2Package.GENERALIZATION__IS_SUBSTITUTABLE:
				return isSubstitutable != IS_SUBSTITUTABLE_EDEFAULT;
			case UML2Package.GENERALIZATION__GENERALIZATION_SET:
				return generalizationSet != null && !generalizationSet.isEmpty();
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
		result.append(" (isSubstitutable: "); //$NON-NLS-1$
		result.append(isSubstitutable);
		result.append(')');
		return result.toString();
	}

} //GeneralizationImpl
