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
 * $Id: RegionImpl.java,v 1.2 2004/04/10 04:09:48 khussey Exp $
 */
package org.eclipse.uml2.impl;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.uml2.Region;
import org.eclipse.uml2.StringExpression;
import org.eclipse.uml2.TemplateSignature;
import org.eclipse.uml2.Transition;
import org.eclipse.uml2.UML2Package;
import org.eclipse.uml2.Vertex;
import org.eclipse.uml2.VisibilityKind;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Region</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2.impl.RegionImpl#getSubvertices <em>Subvertex</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.RegionImpl#getTransitions <em>Transition</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.RegionImpl#getExtendedRegion <em>Extended Region</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RegionImpl extends RedefinableElementImpl implements Region {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2003, 2004 IBM Corporation and others."; //$NON-NLS-1$

	/**
	 * The cached value of the '{@link #getSubvertices() <em>Subvertex</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubvertices()
	 * @generated
	 * @ordered
	 */
	protected EList subvertex = null;

	/**
	 * The cached value of the '{@link #getTransitions() <em>Transition</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransitions()
	 * @generated
	 * @ordered
	 */
	protected EList transition = null;

	/**
	 * The cached value of the '{@link #getExtendedRegion() <em>Extended Region</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtendedRegion()
	 * @generated
	 * @ordered
	 */
	protected Region extendedRegion = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RegionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return UML2Package.eINSTANCE.getRegion();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * Returns the value of the '<em><b>Subvertex</b></em>' containment reference list.
	 * <p>
	 * Subsets the following features:
	 * <ul>
	 *   <li>{@link org.eclipse.uml2.Element#getOwnedElements}</li>
	 * </ul>
	 * </p>
	 * @generated
	 */
	public EList getSubverticesGen() {
		if (subvertex == null) {
			subvertex = new EObjectContainmentWithInverseEList(Vertex.class, this, UML2Package.REGION__SUBVERTEX, UML2Package.VERTEX__CONTAINER);
		}
		return subvertex;
	}

	public EList getSubvertices() {
		if (subvertex == null) {
			subvertex = new EObjectContainmentWithInverseEList(Vertex.class, this, UML2Package.REGION__SUBVERTEX, UML2Package.VERTEX__CONTAINER) {
				public boolean contains(Object object) {
					if (isEObject() && size > 4 && isContainment() && object instanceof EObject) {
						InternalEObject eObject = (InternalEObject) object;
						int baseContainerFeatureID = eObject.eBaseStructuralFeatureID(eObject.eContainerFeatureID(), getFeatureType().getInstanceClass());

						return eObject.eContainer() == owner
							&& (hasNavigableInverse()
								? baseContainerFeatureID == getInverseFeatureID()
								: InternalEObject.EOPPOSITE_FEATURE_BASE - baseContainerFeatureID == getFeatureID());
					} else {
						return super.contains(object);
					}
				}
			};
		}
		return subvertex;
	}

    /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
     */
    public Vertex getSubvertex(String unqualifiedName) {
    	for (Iterator i = getSubvertices().iterator(); i.hasNext(); ) {
    		Vertex namedSubvertex = (Vertex) i.next();
    		
    		if (unqualifiedName.equals(namedSubvertex.getName())) {
    			return namedSubvertex;
    		}
    	}
    	
    	return null;
    }
      
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Vertex createSubvertex(EClass eClass) {
		Vertex newSubvertex = (Vertex) eClass.getEPackage().getEFactoryInstance().create(eClass);
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.CREATE, UML2Package.REGION__SUBVERTEX, null, newSubvertex));
		}
		getSubvertices().add(newSubvertex);
		return newSubvertex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * Returns the value of the '<em><b>Transition</b></em>' containment reference list.
	 * <p>
	 * Subsets the following features:
	 * <ul>
	 *   <li>{@link org.eclipse.uml2.Element#getOwnedElements}</li>
	 * </ul>
	 * </p>
	 * @generated
	 */
	public EList getTransitions() {
		if (transition == null) {
			transition = new EObjectContainmentWithInverseEList(Transition.class, this, UML2Package.REGION__TRANSITION, UML2Package.TRANSITION__CONTAINER);
		}
		return transition;
	}

    /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
     */
    public Transition getTransition(String unqualifiedName) {
    	for (Iterator i = getTransitions().iterator(); i.hasNext(); ) {
    		Transition namedTransition = (Transition) i.next();
    		
    		if (unqualifiedName.equals(namedTransition.getName())) {
    			return namedTransition;
    		}
    	}
    	
    	return null;
    }
      
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transition createTransition(EClass eClass) {
		Transition newTransition = (Transition) eClass.getEPackage().getEFactoryInstance().create(eClass);
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.CREATE, UML2Package.REGION__TRANSITION, null, newTransition));
		}
		getTransitions().add(newTransition);
		return newTransition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * Returns the value of the '<em><b>Extended Region</b></em>' reference.
	 * <p>
	 * Redefines the following features:
	 * <ul>
	 *   <li>{@link org.eclipse.uml2.RedefinableElement#getRedefinedElements}</li>
	 * </ul>
	 * </p>
	 * @generated
	 */
	public Region getExtendedRegion() {
		if (extendedRegion != null && extendedRegion.eIsProxy()) {
			Region oldExtendedRegion = extendedRegion;
			extendedRegion = (Region)eResolveProxy((InternalEObject)extendedRegion);
			if (extendedRegion != oldExtendedRegion) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UML2Package.REGION__EXTENDED_REGION, oldExtendedRegion, extendedRegion));
			}
		}
		return extendedRegion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * Returns the value of the '<em><b>Extended Region</b></em>' reference.
	 * <p>
	 * Redefines the following features:
	 * <ul>
	 *   <li>{@link org.eclipse.uml2.RedefinableElement#getRedefinedElements}</li>
	 * </ul>
	 * </p>
	 * @generated
	 */
	public Region basicGetExtendedRegion() {
		return extendedRegion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExtendedRegion(Region newExtendedRegion) {
		Region oldExtendedRegion = extendedRegion;
		extendedRegion = newExtendedRegion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2Package.REGION__EXTENDED_REGION, oldExtendedRegion, extendedRegion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * Returns the derived value of the '<em><b>Redefinition Context</b></em>' reference.
	 * <p>
	 * Redefines the following features:
	 * <ul>
	 *   <li>{@link org.eclipse.uml2.RedefinableElement#getRedefinitionContexts}</li>
	 * </ul>
	 * </p>
	 * @generated
	 */
	public EList getRedefinitionContextsGen() {
		// TODO: implement this derived redefinition getter
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	public EList getRedefinitionContexts() {
		// TODO: implement this derived redefinition getter
		return new EcoreEList.UnmodifiableEList(this, UML2Package.eINSTANCE.getRedefinableElement_RedefinitionContext(), 0, Collections.EMPTY_LIST.toArray());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * Returns the derived value of the '<em><b>Redefined Element</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.RedefinableElement}.
	 * @generated
	 */
	public EList getRedefinedElements() {
		// TODO: test this redefined getter
		return new BasicEList.UnmodifiableEList(0, Collections.EMPTY_LIST.toArray());
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
			union.addAll(getSubvertices());
			union.addAll(getTransitions());
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
				case UML2Package.REGION__EANNOTATIONS:
					return ((InternalEList)getEAnnotations()).basicAdd(otherEnd, msgs);
				case UML2Package.REGION__TEMPLATE_BINDING:
					return ((InternalEList)getTemplateBindings()).basicAdd(otherEnd, msgs);
				case UML2Package.REGION__OWNED_TEMPLATE_SIGNATURE:
					if (ownedTemplateSignature != null)
						msgs = ((InternalEObject)ownedTemplateSignature).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UML2Package.REGION__OWNED_TEMPLATE_SIGNATURE, null, msgs);
					return basicSetOwnedTemplateSignature((TemplateSignature)otherEnd, msgs);
				case UML2Package.REGION__CLIENT_DEPENDENCY:
					return ((InternalEList)getClientDependencies()).basicAdd(otherEnd, msgs);
				case UML2Package.REGION__SUBVERTEX:
					return ((InternalEList)getSubvertices()).basicAdd(otherEnd, msgs);
				case UML2Package.REGION__TRANSITION:
					return ((InternalEList)getTransitions()).basicAdd(otherEnd, msgs);
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
				case UML2Package.REGION__EANNOTATIONS:
					return ((InternalEList)getEAnnotations()).basicRemove(otherEnd, msgs);
				case UML2Package.REGION__OWNED_COMMENT:
					return ((InternalEList)getOwnedComments()).basicRemove(otherEnd, msgs);
				case UML2Package.REGION__TEMPLATE_BINDING:
					return ((InternalEList)getTemplateBindings()).basicRemove(otherEnd, msgs);
				case UML2Package.REGION__OWNED_TEMPLATE_SIGNATURE:
					return basicSetOwnedTemplateSignature(null, msgs);
				case UML2Package.REGION__CLIENT_DEPENDENCY:
					return ((InternalEList)getClientDependencies()).basicRemove(otherEnd, msgs);
				case UML2Package.REGION__NAME_EXPRESSION:
					return basicSetNameExpression(null, msgs);
				case UML2Package.REGION__SUBVERTEX:
					return ((InternalEList)getSubvertices()).basicRemove(otherEnd, msgs);
				case UML2Package.REGION__TRANSITION:
					return ((InternalEList)getTransitions()).basicRemove(otherEnd, msgs);
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
			case UML2Package.REGION__EANNOTATIONS:
				return getEAnnotations();
			case UML2Package.REGION__OWNED_ELEMENT:
				return getOwnedElements();
			case UML2Package.REGION__OWNER:
				if (resolve) return getOwner();
				return basicGetOwner();
			case UML2Package.REGION__OWNED_COMMENT:
				return getOwnedComments();
			case UML2Package.REGION__TEMPLATE_BINDING:
				return getTemplateBindings();
			case UML2Package.REGION__OWNED_TEMPLATE_SIGNATURE:
				return getOwnedTemplateSignature();
			case UML2Package.REGION__NAME:
				return getName();
			case UML2Package.REGION__QUALIFIED_NAME:
				return getQualifiedName();
			case UML2Package.REGION__VISIBILITY:
				return getVisibility();
			case UML2Package.REGION__CLIENT_DEPENDENCY:
				return getClientDependencies();
			case UML2Package.REGION__NAME_EXPRESSION:
				return getNameExpression();
			case UML2Package.REGION__REDEFINITION_CONTEXT:
				return getRedefinitionContexts();
			case UML2Package.REGION__IS_LEAF:
				return isLeaf() ? Boolean.TRUE : Boolean.FALSE;
			case UML2Package.REGION__SUBVERTEX:
				return getSubvertices();
			case UML2Package.REGION__TRANSITION:
				return getTransitions();
			case UML2Package.REGION__EXTENDED_REGION:
				if (resolve) return getExtendedRegion();
				return basicGetExtendedRegion();
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
			case UML2Package.REGION__EANNOTATIONS:
				getEAnnotations().clear();
				getEAnnotations().addAll((Collection)newValue);
				return;
			case UML2Package.REGION__OWNED_COMMENT:
				getOwnedComments().clear();
				getOwnedComments().addAll((Collection)newValue);
				return;
			case UML2Package.REGION__TEMPLATE_BINDING:
				getTemplateBindings().clear();
				getTemplateBindings().addAll((Collection)newValue);
				return;
			case UML2Package.REGION__OWNED_TEMPLATE_SIGNATURE:
				setOwnedTemplateSignature((TemplateSignature)newValue);
				return;
			case UML2Package.REGION__NAME:
				setName((String)newValue);
				return;
			case UML2Package.REGION__VISIBILITY:
				setVisibility((VisibilityKind)newValue);
				return;
			case UML2Package.REGION__CLIENT_DEPENDENCY:
				getClientDependencies().clear();
				getClientDependencies().addAll((Collection)newValue);
				return;
			case UML2Package.REGION__NAME_EXPRESSION:
				setNameExpression((StringExpression)newValue);
				return;
			case UML2Package.REGION__IS_LEAF:
				setIsLeaf(((Boolean)newValue).booleanValue());
				return;
			case UML2Package.REGION__SUBVERTEX:
				getSubvertices().clear();
				getSubvertices().addAll((Collection)newValue);
				return;
			case UML2Package.REGION__TRANSITION:
				getTransitions().clear();
				getTransitions().addAll((Collection)newValue);
				return;
			case UML2Package.REGION__EXTENDED_REGION:
				setExtendedRegion((Region)newValue);
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
			case UML2Package.REGION__EANNOTATIONS:
				getEAnnotations().clear();
				return;
			case UML2Package.REGION__OWNED_COMMENT:
				getOwnedComments().clear();
				return;
			case UML2Package.REGION__TEMPLATE_BINDING:
				getTemplateBindings().clear();
				return;
			case UML2Package.REGION__OWNED_TEMPLATE_SIGNATURE:
				setOwnedTemplateSignature((TemplateSignature)null);
				return;
			case UML2Package.REGION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case UML2Package.REGION__VISIBILITY:
				setVisibility(VISIBILITY_EDEFAULT);
				return;
			case UML2Package.REGION__CLIENT_DEPENDENCY:
				getClientDependencies().clear();
				return;
			case UML2Package.REGION__NAME_EXPRESSION:
				setNameExpression((StringExpression)null);
				return;
			case UML2Package.REGION__IS_LEAF:
				setIsLeaf(IS_LEAF_EDEFAULT);
				return;
			case UML2Package.REGION__SUBVERTEX:
				getSubvertices().clear();
				return;
			case UML2Package.REGION__TRANSITION:
				getTransitions().clear();
				return;
			case UML2Package.REGION__EXTENDED_REGION:
				setExtendedRegion((Region)null);
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
			case UML2Package.REGION__EANNOTATIONS:
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UML2Package.REGION__OWNED_ELEMENT:
				return !getOwnedElements().isEmpty();
			case UML2Package.REGION__OWNER:
				return basicGetOwner() != null;
			case UML2Package.REGION__OWNED_COMMENT:
				return ownedComment != null && !ownedComment.isEmpty();
			case UML2Package.REGION__TEMPLATE_BINDING:
				return templateBinding != null && !templateBinding.isEmpty();
			case UML2Package.REGION__OWNED_TEMPLATE_SIGNATURE:
				return ownedTemplateSignature != null;
			case UML2Package.REGION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case UML2Package.REGION__QUALIFIED_NAME:
				return !"".equals(getQualifiedName()); //$NON-NLS-1$
			case UML2Package.REGION__VISIBILITY:
				return visibility != VISIBILITY_EDEFAULT;
			case UML2Package.REGION__CLIENT_DEPENDENCY:
				return clientDependency != null && !clientDependency.isEmpty();
			case UML2Package.REGION__NAME_EXPRESSION:
				return nameExpression != null;
			case UML2Package.REGION__REDEFINITION_CONTEXT:
				return !getRedefinitionContexts().isEmpty();
			case UML2Package.REGION__IS_LEAF:
				return isLeaf != IS_LEAF_EDEFAULT;
			case UML2Package.REGION__SUBVERTEX:
				return subvertex != null && !subvertex.isEmpty();
			case UML2Package.REGION__TRANSITION:
				return transition != null && !transition.isEmpty();
			case UML2Package.REGION__EXTENDED_REGION:
				return extendedRegion != null;
		}
		return eDynamicIsSet(eFeature);
	}

} //RegionImpl
