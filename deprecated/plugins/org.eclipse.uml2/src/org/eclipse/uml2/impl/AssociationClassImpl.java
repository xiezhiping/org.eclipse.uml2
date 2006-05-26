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
 * $Id: AssociationClassImpl.java,v 1.45 2006/05/26 18:16:44 khussey Exp $
 */
package org.eclipse.uml2.impl;

import java.lang.reflect.Method;

import java.util.Collection;
import java.util.Iterator;

import java.util.List;

import java.util.Set;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.common.util.UniqueEList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.util.EcoreEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.uml2.Association;
import org.eclipse.uml2.AssociationClass;
import org.eclipse.uml2.Behavior;
import org.eclipse.uml2.CollaborationOccurrence;
import org.eclipse.uml2.Element;
import org.eclipse.uml2.Feature;
import org.eclipse.uml2.Property;
import org.eclipse.uml2.Relationship;
import org.eclipse.uml2.StringExpression;
import org.eclipse.uml2.TemplateParameter;
import org.eclipse.uml2.TemplateSignature;
import org.eclipse.uml2.Type;
import org.eclipse.uml2.UML2Factory;
import org.eclipse.uml2.UML2Package;
import org.eclipse.uml2.VisibilityKind;

import org.eclipse.uml2.common.util.DerivedUnionEObjectEList;
import org.eclipse.uml2.common.util.SubsetSupersetEObjectContainmentWithInverseEList;
import org.eclipse.uml2.common.util.SubsetSupersetEObjectWithInverseResolvingEList;

import org.eclipse.uml2.common.util.UnionEObjectEList;

import org.eclipse.uml2.common.util.CacheAdapter;
import org.eclipse.uml2.internal.operation.AssociationOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Association Class</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2.impl.AssociationClassImpl#getRelatedElements <em>Related Element</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.AssociationClassImpl#getFeatures <em>Feature</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.AssociationClassImpl#getOwnedMembers <em>Owned Member</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.AssociationClassImpl#getMembers <em>Member</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.AssociationClassImpl#getMemberEnds <em>Member End</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.AssociationClassImpl#isDerived <em>Is Derived</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.AssociationClassImpl#getOwnedEnds <em>Owned End</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.AssociationClassImpl#getEndTypes <em>End Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AssociationClassImpl extends ClassImpl implements AssociationClass {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) IBM Corporation and others."; //$NON-NLS-1$

	/**
	 * The cached value of the '{@link #getMemberEnds() <em>Member End</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemberEnds()
	 * @generated
	 * @ordered
	 */
	protected EList memberEnds = null;

	/**
	 * The default value of the '{@link #isDerived() <em>Is Derived</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDerived()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_DERIVED_EDEFAULT = false;

	/**
	 * The flag representing the value of the '{@link #isDerived() <em>Is Derived</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDerived()
	 * @generated
	 * @ordered
	 */
	protected static final int IS_DERIVED_EFLAG = 1 << 11;

	/**
	 * The cached value of the '{@link #getOwnedEnds() <em>Owned End</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedEnds()
	 * @generated
	 * @ordered
	 */
	protected EList ownedEnds = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssociationClassImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return UML2Package.Literals.ASSOCIATION_CLASS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getRelatedElements() {
		CacheAdapter cache = getCacheAdapter();
		if (cache != null) {
			Resource eResource = eResource();
			EList relatedElements = (EList) cache.get(eResource, this, UML2Package.Literals.RELATIONSHIP__RELATED_ELEMENT);
			if (relatedElements == null) {
				cache.put(eResource, this, UML2Package.Literals.RELATIONSHIP__RELATED_ELEMENT, relatedElements = new DerivedUnionEObjectEList(Element.class, this, UML2Package.ASSOCIATION_CLASS__RELATED_ELEMENT, RELATED_ELEMENT_ESUBSETS));
			}
			return relatedElements;
		}
		return new DerivedUnionEObjectEList(Element.class, this, UML2Package.ASSOCIATION_CLASS__RELATED_ELEMENT, RELATED_ELEMENT_ESUBSETS);
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRelatedElements() {
		return eIsSet(UML2Package.ASSOCIATION_CLASS__END_TYPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getFeatures() {
		CacheAdapter cache = getCacheAdapter();
		if (cache != null) {
			Resource eResource = eResource();
			EList features = (EList) cache.get(eResource, this, UML2Package.Literals.CLASSIFIER__FEATURE);
			if (features == null) {
				cache.put(eResource, this, UML2Package.Literals.CLASSIFIER__FEATURE, features = new DerivedUnionEObjectEList(Feature.class, this, UML2Package.ASSOCIATION_CLASS__FEATURE, FEATURE_ESUBSETS));
			}
			return features;
		}
		return new DerivedUnionEObjectEList(Feature.class, this, UML2Package.ASSOCIATION_CLASS__FEATURE, FEATURE_ESUBSETS);
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetFeatures() {
		return super.isSetFeatures()
			|| eIsSet(UML2Package.ASSOCIATION_CLASS__OWNED_END);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EList getOwnedMembersHelper(EList ownedMembers) {
		super.getOwnedMembersHelper(ownedMembers);
		if (eIsSet(UML2Package.ASSOCIATION_CLASS__OWNED_END)) {
			ownedMembers.addAll(getOwnedEnds());
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
			|| eIsSet(UML2Package.ASSOCIATION_CLASS__OWNED_END);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EList getMembersHelper(EList members) {
		super.getMembersHelper(members);
		if (eIsSet(UML2Package.ASSOCIATION_CLASS__MEMBER_END)) {
			for (Iterator i = ((InternalEList) getMemberEnds()).basicIterator(); i.hasNext(); ) {
				members.add(i.next());
			}
		}
		return members;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMembers() {
		return super.isSetMembers()
			|| eIsSet(UML2Package.ASSOCIATION_CLASS__MEMBER_END);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isDerived() {
		return (eFlags & IS_DERIVED_EFLAG) != 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsDerived(boolean newIsDerived) {
		boolean oldIsDerived = (eFlags & IS_DERIVED_EFLAG) != 0;
		if (newIsDerived) eFlags |= IS_DERIVED_EFLAG; else eFlags &= ~IS_DERIVED_EFLAG;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2Package.ASSOCIATION_CLASS__IS_DERIVED, oldIsDerived, newIsDerived));


	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getOwnedEnds() {
		if (ownedEnds == null) {
			ownedEnds = new SubsetSupersetEObjectContainmentWithInverseEList(Property.class, this, UML2Package.ASSOCIATION_CLASS__OWNED_END, OWNED_END_ESUPERSETS, null, UML2Package.PROPERTY__OWNING_ASSOCIATION);
		}
		return ownedEnds;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
    public Property getOwnedEnd(String name) {
		return getOwnedEnd(name, false, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property getOwnedEnd(String name, boolean ignoreCase, EClass eClass) {
		ownedEndLoop: for (Iterator i = getOwnedEnds().iterator(); i.hasNext(); ) {
			Property ownedEnd = (Property) i.next();
			if (eClass != null && !eClass.isInstance(ownedEnd))
				continue ownedEndLoop;
			if (name != null && !(ignoreCase ? name.equalsIgnoreCase(ownedEnd.getName()) : name.equals(ownedEnd.getName())))
				continue ownedEndLoop;
			return ownedEnd;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Property createOwnedEnd(EClass eClass) {
		Property newOwnedEnd = (Property) eClass.getEPackage().getEFactoryInstance().create(eClass);
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, 0, UML2Package.ASSOCIATION_CLASS__OWNED_END, null, newOwnedEnd));
		}
		getOwnedEnds().add(newOwnedEnd);
		return newOwnedEnd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Property createOwnedEnd() {
		Property newOwnedEnd = UML2Factory.eINSTANCE.createProperty();
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, 0, UML2Package.ASSOCIATION_CLASS__OWNED_END, null, newOwnedEnd));
		}
		getOwnedEnds().add(newOwnedEnd);
		return newOwnedEnd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList getEndTypes() {
		CacheAdapter cache = getCacheAdapter();

		if (cache != null) {
			EList result = (EList) cache.get(this,
				UML2Package.Literals.ASSOCIATION__END_TYPE);

			if (result == null) {
				Set endType = AssociationOperations.endType(this);
				cache.put(this, UML2Package.Literals.ASSOCIATION__END_TYPE,
					result = new EcoreEList.UnmodifiableEList(this,
						UML2Package.Literals.ASSOCIATION__END_TYPE, endType
							.size(), endType.toArray()));
			}

			return result;
		}

		Set endType = AssociationOperations.endType(this);
		return new EcoreEList.UnmodifiableEList(this,
			UML2Package.Literals.ASSOCIATION__END_TYPE, endType.size(), endType
				.toArray());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
    public Type getEndType(String name) {
		return getEndType(name, false, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type getEndType(String name, boolean ignoreCase, EClass eClass) {
		endTypeLoop: for (Iterator i = getEndTypes().iterator(); i.hasNext(); ) {
			Type endType = (Type) i.next();
			if (eClass != null && !eClass.isInstance(endType))
				continue endTypeLoop;
			if (name != null && !(ignoreCase ? name.equalsIgnoreCase(endType.getName()) : name.equals(endType.getName())))
				continue endTypeLoop;
			return endType;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UML2Package.ASSOCIATION_CLASS__EANNOTATIONS:
				return ((InternalEList)getEAnnotations()).basicAdd(otherEnd, msgs);
			case UML2Package.ASSOCIATION_CLASS__TEMPLATE_BINDING:
				return ((InternalEList)getTemplateBindings()).basicAdd(otherEnd, msgs);
			case UML2Package.ASSOCIATION_CLASS__OWNED_TEMPLATE_SIGNATURE:
				if (ownedTemplateSignature != null)
					msgs = ((InternalEObject)ownedTemplateSignature).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UML2Package.ASSOCIATION_CLASS__OWNED_TEMPLATE_SIGNATURE, null, msgs);
				return basicSetOwnedTemplateSignature((TemplateSignature)otherEnd, msgs);
			case UML2Package.ASSOCIATION_CLASS__CLIENT_DEPENDENCY:
				return ((InternalEList)getClientDependencies()).basicAdd(otherEnd, msgs);
			case UML2Package.ASSOCIATION_CLASS__OWNED_RULE:
				return ((InternalEList)getOwnedRules()).basicAdd(otherEnd, msgs);
			case UML2Package.ASSOCIATION_CLASS__ELEMENT_IMPORT:
				return ((InternalEList)getElementImports()).basicAdd(otherEnd, msgs);
			case UML2Package.ASSOCIATION_CLASS__PACKAGE_IMPORT:
				return ((InternalEList)getPackageImports()).basicAdd(otherEnd, msgs);
			case UML2Package.ASSOCIATION_CLASS__TEMPLATE_PARAMETER:
				if (templateParameter != null)
					msgs = ((InternalEObject)templateParameter).eInverseRemove(this, UML2Package.TEMPLATE_PARAMETER__PARAMETERED_ELEMENT, TemplateParameter.class, msgs);
				return basicSetTemplateParameter((TemplateParameter)otherEnd, msgs);
			case UML2Package.ASSOCIATION_CLASS__OWNING_PARAMETER:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOwningParameter((TemplateParameter)otherEnd, msgs);
			case UML2Package.ASSOCIATION_CLASS__GENERALIZATION:
				return ((InternalEList)getGeneralizations()).basicAdd(otherEnd, msgs);
			case UML2Package.ASSOCIATION_CLASS__SUBSTITUTION:
				return ((InternalEList)getSubstitutions()).basicAdd(otherEnd, msgs);
			case UML2Package.ASSOCIATION_CLASS__POWERTYPE_EXTENT:
				return ((InternalEList)getPowertypeExtents()).basicAdd(otherEnd, msgs);
			case UML2Package.ASSOCIATION_CLASS__USE_CASE:
				return ((InternalEList)getUseCases()).basicAdd(otherEnd, msgs);
			case UML2Package.ASSOCIATION_CLASS__OWNED_BEHAVIOR:
				return ((InternalEList)getOwnedBehaviors()).basicAdd(otherEnd, msgs);
			case UML2Package.ASSOCIATION_CLASS__IMPLEMENTATION:
				return ((InternalEList)getImplementations()).basicAdd(otherEnd, msgs);
			case UML2Package.ASSOCIATION_CLASS__OWNED_STATE_MACHINE:
				return ((InternalEList)getOwnedStateMachines()).basicAdd(otherEnd, msgs);
			case UML2Package.ASSOCIATION_CLASS__OWNED_OPERATION:
				return ((InternalEList)getOwnedOperations()).basicAdd(otherEnd, msgs);
			case UML2Package.ASSOCIATION_CLASS__OWNED_END:
				return ((InternalEList)getOwnedEnds()).basicAdd(otherEnd, msgs);
			case UML2Package.ASSOCIATION_CLASS__MEMBER_END:
				return ((InternalEList)getMemberEnds()).basicAdd(otherEnd, msgs);
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
			case UML2Package.ASSOCIATION_CLASS__EANNOTATIONS:
				return ((InternalEList)getEAnnotations()).basicRemove(otherEnd, msgs);
			case UML2Package.ASSOCIATION_CLASS__OWNED_COMMENT:
				return ((InternalEList)getOwnedComments()).basicRemove(otherEnd, msgs);
			case UML2Package.ASSOCIATION_CLASS__TEMPLATE_BINDING:
				return ((InternalEList)getTemplateBindings()).basicRemove(otherEnd, msgs);
			case UML2Package.ASSOCIATION_CLASS__OWNED_TEMPLATE_SIGNATURE:
				return basicSetOwnedTemplateSignature(null, msgs);
			case UML2Package.ASSOCIATION_CLASS__CLIENT_DEPENDENCY:
				return ((InternalEList)getClientDependencies()).basicRemove(otherEnd, msgs);
			case UML2Package.ASSOCIATION_CLASS__NAME_EXPRESSION:
				return basicSetNameExpression(null, msgs);
			case UML2Package.ASSOCIATION_CLASS__OWNED_RULE:
				return ((InternalEList)getOwnedRules()).basicRemove(otherEnd, msgs);
			case UML2Package.ASSOCIATION_CLASS__ELEMENT_IMPORT:
				return ((InternalEList)getElementImports()).basicRemove(otherEnd, msgs);
			case UML2Package.ASSOCIATION_CLASS__PACKAGE_IMPORT:
				return ((InternalEList)getPackageImports()).basicRemove(otherEnd, msgs);
			case UML2Package.ASSOCIATION_CLASS__TEMPLATE_PARAMETER:
				return basicSetTemplateParameter(null, msgs);
			case UML2Package.ASSOCIATION_CLASS__OWNING_PARAMETER:
				return basicSetOwningParameter(null, msgs);
			case UML2Package.ASSOCIATION_CLASS__GENERALIZATION:
				return ((InternalEList)getGeneralizations()).basicRemove(otherEnd, msgs);
			case UML2Package.ASSOCIATION_CLASS__SUBSTITUTION:
				return ((InternalEList)getSubstitutions()).basicRemove(otherEnd, msgs);
			case UML2Package.ASSOCIATION_CLASS__POWERTYPE_EXTENT:
				return ((InternalEList)getPowertypeExtents()).basicRemove(otherEnd, msgs);
			case UML2Package.ASSOCIATION_CLASS__OWNED_USE_CASE:
				return ((InternalEList)getOwnedUseCases()).basicRemove(otherEnd, msgs);
			case UML2Package.ASSOCIATION_CLASS__USE_CASE:
				return ((InternalEList)getUseCases()).basicRemove(otherEnd, msgs);
			case UML2Package.ASSOCIATION_CLASS__OCCURRENCE:
				return ((InternalEList)getOccurrences()).basicRemove(otherEnd, msgs);
			case UML2Package.ASSOCIATION_CLASS__OWNED_BEHAVIOR:
				return ((InternalEList)getOwnedBehaviors()).basicRemove(otherEnd, msgs);
			case UML2Package.ASSOCIATION_CLASS__IMPLEMENTATION:
				return ((InternalEList)getImplementations()).basicRemove(otherEnd, msgs);
			case UML2Package.ASSOCIATION_CLASS__OWNED_TRIGGER:
				return ((InternalEList)getOwnedTriggers()).basicRemove(otherEnd, msgs);
			case UML2Package.ASSOCIATION_CLASS__OWNED_STATE_MACHINE:
				return ((InternalEList)getOwnedStateMachines()).basicRemove(otherEnd, msgs);
			case UML2Package.ASSOCIATION_CLASS__OWNED_ATTRIBUTE:
				return ((InternalEList)getOwnedAttributes()).basicRemove(otherEnd, msgs);
			case UML2Package.ASSOCIATION_CLASS__OWNED_CONNECTOR:
				return ((InternalEList)getOwnedConnectors()).basicRemove(otherEnd, msgs);
			case UML2Package.ASSOCIATION_CLASS__OWNED_PORT:
				return ((InternalEList)getOwnedPorts()).basicRemove(otherEnd, msgs);
			case UML2Package.ASSOCIATION_CLASS__OWNED_OPERATION:
				return ((InternalEList)getOwnedOperations()).basicRemove(otherEnd, msgs);
			case UML2Package.ASSOCIATION_CLASS__NESTED_CLASSIFIER:
				return ((InternalEList)getNestedClassifiers()).basicRemove(otherEnd, msgs);
			case UML2Package.ASSOCIATION_CLASS__OWNED_RECEPTION:
				return ((InternalEList)getOwnedReceptions()).basicRemove(otherEnd, msgs);
			case UML2Package.ASSOCIATION_CLASS__OWNED_END:
				return ((InternalEList)getOwnedEnds()).basicRemove(otherEnd, msgs);
			case UML2Package.ASSOCIATION_CLASS__MEMBER_END:
				return ((InternalEList)getMemberEnds()).basicRemove(otherEnd, msgs);
		}
		return eDynamicInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getMemberEnds() {
		if (memberEnds == null) {
			memberEnds = new SubsetSupersetEObjectWithInverseResolvingEList(Property.class, this, UML2Package.ASSOCIATION_CLASS__MEMBER_END, null, MEMBER_END_ESUBSETS, UML2Package.PROPERTY__ASSOCIATION);
		}
		return memberEnds;
	}


	/**
	 * The array of subset feature identifiers for the '{@link #getRelatedElements() <em>Related Element</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelatedElements()
	 * @generated
	 * @ordered
	 */
	protected static final int[] RELATED_ELEMENT_ESUBSETS = new int[] {UML2Package.ASSOCIATION_CLASS__END_TYPE};

	/**
	 * The array of subset feature identifiers for the '{@link #getFeatures() <em>Feature</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeatures()
	 * @generated
	 * @ordered
	 */
	protected static final int[] FEATURE_ESUBSETS = new int[] {UML2Package.ASSOCIATION_CLASS__ATTRIBUTE, UML2Package.ASSOCIATION_CLASS__OWNED_CONNECTOR, UML2Package.ASSOCIATION_CLASS__OWNED_PORT, UML2Package.ASSOCIATION_CLASS__OWNED_OPERATION, UML2Package.ASSOCIATION_CLASS__OWNED_RECEPTION, UML2Package.ASSOCIATION_CLASS__OWNED_END};

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
	protected static final int[] OWNED_MEMBER_ESUBSETS = new int[] {UML2Package.ASSOCIATION_CLASS__OWNED_RULE, UML2Package.ASSOCIATION_CLASS__OWNED_USE_CASE, UML2Package.ASSOCIATION_CLASS__OWNED_BEHAVIOR, UML2Package.ASSOCIATION_CLASS__OWNED_TRIGGER, UML2Package.ASSOCIATION_CLASS__OWNED_ATTRIBUTE, UML2Package.ASSOCIATION_CLASS__OWNED_CONNECTOR, UML2Package.ASSOCIATION_CLASS__OWNED_PORT, UML2Package.ASSOCIATION_CLASS__OWNED_OPERATION, UML2Package.ASSOCIATION_CLASS__NESTED_CLASSIFIER, UML2Package.ASSOCIATION_CLASS__OWNED_RECEPTION, UML2Package.ASSOCIATION_CLASS__OWNED_END};

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getMembers() {
		CacheAdapter cache = getCacheAdapter();
		if (cache != null) {
			EList members = (EList) cache.get(eResource(), this, UML2Package.Literals.NAMESPACE__MEMBER);
			if (members == null) {
				List union = getMembersHelper(new UniqueEList.FastCompare());
				cache.put(eResource(), this, UML2Package.Literals.NAMESPACE__MEMBER, members = new UnionEObjectEList(this, UML2Package.Literals.NAMESPACE__MEMBER, union.size(), union.toArray()));
			}
			return members;
		}
		List union = getMembersHelper(new UniqueEList.FastCompare());
		return new UnionEObjectEList(this, UML2Package.Literals.NAMESPACE__MEMBER, union.size(), union.toArray());
	}


	/**
	 * The array of subset feature identifiers for the '{@link #getMembers() <em>Member</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMembers()
	 * @generated
	 * @ordered
	 */
	protected static final int[] MEMBER_ESUBSETS = new int[] {UML2Package.ASSOCIATION_CLASS__MEMBER_END};

	/**
	 * The array of subset feature identifiers for the '{@link #getMemberEnds() <em>Member End</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemberEnds()
	 * @generated
	 * @ordered
	 */
	protected static final int[] MEMBER_END_ESUBSETS = new int[] {UML2Package.ASSOCIATION_CLASS__OWNED_END};

	/**
	 * The array of superset feature identifiers for the '{@link #getOwnedEnds() <em>Owned End</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedEnds()
	 * @generated
	 * @ordered
	 */
	protected static final int[] OWNED_END_ESUPERSETS = new int[] {UML2Package.ASSOCIATION_CLASS__MEMBER_END};

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
    public Property getMemberEnd(String name) {
		return getMemberEnd(name, false, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property getMemberEnd(String name, boolean ignoreCase, EClass eClass) {
		memberEndLoop: for (Iterator i = getMemberEnds().iterator(); i.hasNext(); ) {
			Property memberEnd = (Property) i.next();
			if (eClass != null && !eClass.isInstance(memberEnd))
				continue memberEndLoop;
			if (name != null && !(ignoreCase ? name.equalsIgnoreCase(memberEnd.getName()) : name.equals(memberEnd.getName())))
				continue memberEndLoop;
			return memberEnd;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UML2Package.ASSOCIATION_CLASS__EANNOTATIONS:
				return getEAnnotations();
			case UML2Package.ASSOCIATION_CLASS__OWNED_ELEMENT:
				return getOwnedElements();
			case UML2Package.ASSOCIATION_CLASS__OWNER:
				if (resolve) return getOwner();
				return basicGetOwner();
			case UML2Package.ASSOCIATION_CLASS__OWNED_COMMENT:
				return getOwnedComments();
			case UML2Package.ASSOCIATION_CLASS__TEMPLATE_BINDING:
				return getTemplateBindings();
			case UML2Package.ASSOCIATION_CLASS__OWNED_TEMPLATE_SIGNATURE:
				return getOwnedTemplateSignature();
			case UML2Package.ASSOCIATION_CLASS__NAME:
				return getName();
			case UML2Package.ASSOCIATION_CLASS__QUALIFIED_NAME:
				return getQualifiedName();
			case UML2Package.ASSOCIATION_CLASS__VISIBILITY:
				return getVisibility();
			case UML2Package.ASSOCIATION_CLASS__CLIENT_DEPENDENCY:
				return getClientDependencies();
			case UML2Package.ASSOCIATION_CLASS__NAME_EXPRESSION:
				return getNameExpression();
			case UML2Package.ASSOCIATION_CLASS__MEMBER:
				return getMembers();
			case UML2Package.ASSOCIATION_CLASS__OWNED_RULE:
				return getOwnedRules();
			case UML2Package.ASSOCIATION_CLASS__IMPORTED_MEMBER:
				return getImportedMembers();
			case UML2Package.ASSOCIATION_CLASS__ELEMENT_IMPORT:
				return getElementImports();
			case UML2Package.ASSOCIATION_CLASS__PACKAGE_IMPORT:
				return getPackageImports();
			case UML2Package.ASSOCIATION_CLASS__TEMPLATE_PARAMETER:
				if (resolve) return getTemplateParameter();
				return basicGetTemplateParameter();
			case UML2Package.ASSOCIATION_CLASS__OWNING_PARAMETER:
				return getOwningParameter();
			case UML2Package.ASSOCIATION_CLASS__PACKAGEABLE_ELEMENT_VISIBILITY:
				return getPackageableElement_visibility();
			case UML2Package.ASSOCIATION_CLASS__PACKAGE:
				return getPackage();
			case UML2Package.ASSOCIATION_CLASS__REDEFINITION_CONTEXT:
				return getRedefinitionContexts();
			case UML2Package.ASSOCIATION_CLASS__IS_LEAF:
				return isLeaf() ? Boolean.TRUE : Boolean.FALSE;
			case UML2Package.ASSOCIATION_CLASS__FEATURE:
				return getFeatures();
			case UML2Package.ASSOCIATION_CLASS__IS_ABSTRACT:
				return isAbstract() ? Boolean.TRUE : Boolean.FALSE;
			case UML2Package.ASSOCIATION_CLASS__INHERITED_MEMBER:
				return getInheritedMembers();
			case UML2Package.ASSOCIATION_CLASS__GENERAL:
				return getGenerals();
			case UML2Package.ASSOCIATION_CLASS__GENERALIZATION:
				return getGeneralizations();
			case UML2Package.ASSOCIATION_CLASS__ATTRIBUTE:
				return getAttributes();
			case UML2Package.ASSOCIATION_CLASS__REDEFINED_CLASSIFIER:
				return getRedefinedClassifiers();
			case UML2Package.ASSOCIATION_CLASS__SUBSTITUTION:
				return getSubstitutions();
			case UML2Package.ASSOCIATION_CLASS__POWERTYPE_EXTENT:
				return getPowertypeExtents();
			case UML2Package.ASSOCIATION_CLASS__OWNED_USE_CASE:
				return getOwnedUseCases();
			case UML2Package.ASSOCIATION_CLASS__USE_CASE:
				return getUseCases();
			case UML2Package.ASSOCIATION_CLASS__REPRESENTATION:
				return getRepresentation();
			case UML2Package.ASSOCIATION_CLASS__OCCURRENCE:
				return getOccurrences();
			case UML2Package.ASSOCIATION_CLASS__OWNED_BEHAVIOR:
				return getOwnedBehaviors();
			case UML2Package.ASSOCIATION_CLASS__CLASSIFIER_BEHAVIOR:
				return getClassifierBehavior();
			case UML2Package.ASSOCIATION_CLASS__IMPLEMENTATION:
				return getImplementations();
			case UML2Package.ASSOCIATION_CLASS__OWNED_TRIGGER:
				return getOwnedTriggers();
			case UML2Package.ASSOCIATION_CLASS__OWNED_STATE_MACHINE:
				return getOwnedStateMachines();
			case UML2Package.ASSOCIATION_CLASS__OWNED_ATTRIBUTE:
				return getOwnedAttributes();
			case UML2Package.ASSOCIATION_CLASS__PART:
				return getParts();
			case UML2Package.ASSOCIATION_CLASS__ROLE:
				return getRoles();
			case UML2Package.ASSOCIATION_CLASS__OWNED_CONNECTOR:
				return getOwnedConnectors();
			case UML2Package.ASSOCIATION_CLASS__OWNED_PORT:
				return getOwnedPorts();
			case UML2Package.ASSOCIATION_CLASS__OWNED_OPERATION:
				return getOwnedOperations();
			case UML2Package.ASSOCIATION_CLASS__SUPER_CLASS:
				return getSuperClasses();
			case UML2Package.ASSOCIATION_CLASS__EXTENSION:
				return getExtensions();
			case UML2Package.ASSOCIATION_CLASS__NESTED_CLASSIFIER:
				return getNestedClassifiers();
			case UML2Package.ASSOCIATION_CLASS__IS_ACTIVE:
				return isActive() ? Boolean.TRUE : Boolean.FALSE;
			case UML2Package.ASSOCIATION_CLASS__OWNED_RECEPTION:
				return getOwnedReceptions();
			case UML2Package.ASSOCIATION_CLASS__RELATED_ELEMENT:
				return getRelatedElements();
			case UML2Package.ASSOCIATION_CLASS__IS_DERIVED:
				return isDerived() ? Boolean.TRUE : Boolean.FALSE;
			case UML2Package.ASSOCIATION_CLASS__OWNED_END:
				return getOwnedEnds();
			case UML2Package.ASSOCIATION_CLASS__END_TYPE:
				return getEndTypes();
			case UML2Package.ASSOCIATION_CLASS__MEMBER_END:
				return getMemberEnds();
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
			case UML2Package.ASSOCIATION_CLASS__EANNOTATIONS:
				getEAnnotations().clear();
				getEAnnotations().addAll((Collection)newValue);
				return;
			case UML2Package.ASSOCIATION_CLASS__OWNED_COMMENT:
				getOwnedComments().clear();
				getOwnedComments().addAll((Collection)newValue);
				return;
			case UML2Package.ASSOCIATION_CLASS__TEMPLATE_BINDING:
				getTemplateBindings().clear();
				getTemplateBindings().addAll((Collection)newValue);
				return;
			case UML2Package.ASSOCIATION_CLASS__OWNED_TEMPLATE_SIGNATURE:
				setOwnedTemplateSignature((TemplateSignature)newValue);
				return;
			case UML2Package.ASSOCIATION_CLASS__NAME:
				setName((String)newValue);
				return;
			case UML2Package.ASSOCIATION_CLASS__VISIBILITY:
				setVisibility((VisibilityKind)newValue);
				return;
			case UML2Package.ASSOCIATION_CLASS__CLIENT_DEPENDENCY:
				getClientDependencies().clear();
				getClientDependencies().addAll((Collection)newValue);
				return;
			case UML2Package.ASSOCIATION_CLASS__NAME_EXPRESSION:
				setNameExpression((StringExpression)newValue);
				return;
			case UML2Package.ASSOCIATION_CLASS__OWNED_RULE:
				getOwnedRules().clear();
				getOwnedRules().addAll((Collection)newValue);
				return;
			case UML2Package.ASSOCIATION_CLASS__ELEMENT_IMPORT:
				getElementImports().clear();
				getElementImports().addAll((Collection)newValue);
				return;
			case UML2Package.ASSOCIATION_CLASS__PACKAGE_IMPORT:
				getPackageImports().clear();
				getPackageImports().addAll((Collection)newValue);
				return;
			case UML2Package.ASSOCIATION_CLASS__TEMPLATE_PARAMETER:
				setTemplateParameter((TemplateParameter)newValue);
				return;
			case UML2Package.ASSOCIATION_CLASS__OWNING_PARAMETER:
				setOwningParameter((TemplateParameter)newValue);
				return;
			case UML2Package.ASSOCIATION_CLASS__PACKAGEABLE_ELEMENT_VISIBILITY:
				setPackageableElement_visibility((VisibilityKind)newValue);
				return;
			case UML2Package.ASSOCIATION_CLASS__IS_LEAF:
				setIsLeaf(((Boolean)newValue).booleanValue());
				return;
			case UML2Package.ASSOCIATION_CLASS__IS_ABSTRACT:
				setIsAbstract(((Boolean)newValue).booleanValue());
				return;
			case UML2Package.ASSOCIATION_CLASS__GENERALIZATION:
				getGeneralizations().clear();
				getGeneralizations().addAll((Collection)newValue);
				return;
			case UML2Package.ASSOCIATION_CLASS__REDEFINED_CLASSIFIER:
				getRedefinedClassifiers().clear();
				getRedefinedClassifiers().addAll((Collection)newValue);
				return;
			case UML2Package.ASSOCIATION_CLASS__SUBSTITUTION:
				getSubstitutions().clear();
				getSubstitutions().addAll((Collection)newValue);
				return;
			case UML2Package.ASSOCIATION_CLASS__POWERTYPE_EXTENT:
				getPowertypeExtents().clear();
				getPowertypeExtents().addAll((Collection)newValue);
				return;
			case UML2Package.ASSOCIATION_CLASS__OWNED_USE_CASE:
				getOwnedUseCases().clear();
				getOwnedUseCases().addAll((Collection)newValue);
				return;
			case UML2Package.ASSOCIATION_CLASS__USE_CASE:
				getUseCases().clear();
				getUseCases().addAll((Collection)newValue);
				return;
			case UML2Package.ASSOCIATION_CLASS__REPRESENTATION:
				setRepresentation((CollaborationOccurrence)newValue);
				return;
			case UML2Package.ASSOCIATION_CLASS__OCCURRENCE:
				getOccurrences().clear();
				getOccurrences().addAll((Collection)newValue);
				return;
			case UML2Package.ASSOCIATION_CLASS__OWNED_BEHAVIOR:
				getOwnedBehaviors().clear();
				getOwnedBehaviors().addAll((Collection)newValue);
				return;
			case UML2Package.ASSOCIATION_CLASS__CLASSIFIER_BEHAVIOR:
				setClassifierBehavior((Behavior)newValue);
				return;
			case UML2Package.ASSOCIATION_CLASS__IMPLEMENTATION:
				getImplementations().clear();
				getImplementations().addAll((Collection)newValue);
				return;
			case UML2Package.ASSOCIATION_CLASS__OWNED_TRIGGER:
				getOwnedTriggers().clear();
				getOwnedTriggers().addAll((Collection)newValue);
				return;
			case UML2Package.ASSOCIATION_CLASS__OWNED_STATE_MACHINE:
				getOwnedStateMachines().clear();
				getOwnedStateMachines().addAll((Collection)newValue);
				return;
			case UML2Package.ASSOCIATION_CLASS__OWNED_ATTRIBUTE:
				getOwnedAttributes().clear();
				getOwnedAttributes().addAll((Collection)newValue);
				return;
			case UML2Package.ASSOCIATION_CLASS__OWNED_CONNECTOR:
				getOwnedConnectors().clear();
				getOwnedConnectors().addAll((Collection)newValue);
				return;
			case UML2Package.ASSOCIATION_CLASS__OWNED_PORT:
				getOwnedPorts().clear();
				getOwnedPorts().addAll((Collection)newValue);
				return;
			case UML2Package.ASSOCIATION_CLASS__OWNED_OPERATION:
				getOwnedOperations().clear();
				getOwnedOperations().addAll((Collection)newValue);
				return;
			case UML2Package.ASSOCIATION_CLASS__NESTED_CLASSIFIER:
				getNestedClassifiers().clear();
				getNestedClassifiers().addAll((Collection)newValue);
				return;
			case UML2Package.ASSOCIATION_CLASS__IS_ACTIVE:
				setIsActive(((Boolean)newValue).booleanValue());
				return;
			case UML2Package.ASSOCIATION_CLASS__OWNED_RECEPTION:
				getOwnedReceptions().clear();
				getOwnedReceptions().addAll((Collection)newValue);
				return;
			case UML2Package.ASSOCIATION_CLASS__IS_DERIVED:
				setIsDerived(((Boolean)newValue).booleanValue());
				return;
			case UML2Package.ASSOCIATION_CLASS__OWNED_END:
				getOwnedEnds().clear();
				getOwnedEnds().addAll((Collection)newValue);
				return;
			case UML2Package.ASSOCIATION_CLASS__MEMBER_END:
				getMemberEnds().clear();
				getMemberEnds().addAll((Collection)newValue);
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
			case UML2Package.ASSOCIATION_CLASS__EANNOTATIONS:
				getEAnnotations().clear();
				return;
			case UML2Package.ASSOCIATION_CLASS__OWNED_COMMENT:
				getOwnedComments().clear();
				return;
			case UML2Package.ASSOCIATION_CLASS__TEMPLATE_BINDING:
				getTemplateBindings().clear();
				return;
			case UML2Package.ASSOCIATION_CLASS__OWNED_TEMPLATE_SIGNATURE:
				setOwnedTemplateSignature((TemplateSignature)null);
				return;
			case UML2Package.ASSOCIATION_CLASS__NAME:
				setName(NAME_EDEFAULT);
				return;
			case UML2Package.ASSOCIATION_CLASS__VISIBILITY:
				setVisibility(VISIBILITY_EDEFAULT);
				return;
			case UML2Package.ASSOCIATION_CLASS__CLIENT_DEPENDENCY:
				getClientDependencies().clear();
				return;
			case UML2Package.ASSOCIATION_CLASS__NAME_EXPRESSION:
				setNameExpression((StringExpression)null);
				return;
			case UML2Package.ASSOCIATION_CLASS__OWNED_RULE:
				getOwnedRules().clear();
				return;
			case UML2Package.ASSOCIATION_CLASS__ELEMENT_IMPORT:
				getElementImports().clear();
				return;
			case UML2Package.ASSOCIATION_CLASS__PACKAGE_IMPORT:
				getPackageImports().clear();
				return;
			case UML2Package.ASSOCIATION_CLASS__TEMPLATE_PARAMETER:
				setTemplateParameter((TemplateParameter)null);
				return;
			case UML2Package.ASSOCIATION_CLASS__OWNING_PARAMETER:
				setOwningParameter((TemplateParameter)null);
				return;
			case UML2Package.ASSOCIATION_CLASS__PACKAGEABLE_ELEMENT_VISIBILITY:
				setPackageableElement_visibility(PACKAGEABLE_ELEMENT_VISIBILITY_EDEFAULT);
				return;
			case UML2Package.ASSOCIATION_CLASS__IS_LEAF:
				setIsLeaf(IS_LEAF_EDEFAULT);
				return;
			case UML2Package.ASSOCIATION_CLASS__IS_ABSTRACT:
				setIsAbstract(IS_ABSTRACT_EDEFAULT);
				return;
			case UML2Package.ASSOCIATION_CLASS__GENERALIZATION:
				getGeneralizations().clear();
				return;
			case UML2Package.ASSOCIATION_CLASS__REDEFINED_CLASSIFIER:
				getRedefinedClassifiers().clear();
				return;
			case UML2Package.ASSOCIATION_CLASS__SUBSTITUTION:
				getSubstitutions().clear();
				return;
			case UML2Package.ASSOCIATION_CLASS__POWERTYPE_EXTENT:
				getPowertypeExtents().clear();
				return;
			case UML2Package.ASSOCIATION_CLASS__OWNED_USE_CASE:
				getOwnedUseCases().clear();
				return;
			case UML2Package.ASSOCIATION_CLASS__USE_CASE:
				getUseCases().clear();
				return;
			case UML2Package.ASSOCIATION_CLASS__REPRESENTATION:
				setRepresentation((CollaborationOccurrence)null);
				return;
			case UML2Package.ASSOCIATION_CLASS__OCCURRENCE:
				getOccurrences().clear();
				return;
			case UML2Package.ASSOCIATION_CLASS__OWNED_BEHAVIOR:
				getOwnedBehaviors().clear();
				return;
			case UML2Package.ASSOCIATION_CLASS__CLASSIFIER_BEHAVIOR:
				setClassifierBehavior((Behavior)null);
				return;
			case UML2Package.ASSOCIATION_CLASS__IMPLEMENTATION:
				getImplementations().clear();
				return;
			case UML2Package.ASSOCIATION_CLASS__OWNED_TRIGGER:
				getOwnedTriggers().clear();
				return;
			case UML2Package.ASSOCIATION_CLASS__OWNED_STATE_MACHINE:
				getOwnedStateMachines().clear();
				return;
			case UML2Package.ASSOCIATION_CLASS__OWNED_ATTRIBUTE:
				getOwnedAttributes().clear();
				return;
			case UML2Package.ASSOCIATION_CLASS__OWNED_CONNECTOR:
				getOwnedConnectors().clear();
				return;
			case UML2Package.ASSOCIATION_CLASS__OWNED_PORT:
				getOwnedPorts().clear();
				return;
			case UML2Package.ASSOCIATION_CLASS__OWNED_OPERATION:
				getOwnedOperations().clear();
				return;
			case UML2Package.ASSOCIATION_CLASS__NESTED_CLASSIFIER:
				getNestedClassifiers().clear();
				return;
			case UML2Package.ASSOCIATION_CLASS__IS_ACTIVE:
				setIsActive(IS_ACTIVE_EDEFAULT);
				return;
			case UML2Package.ASSOCIATION_CLASS__OWNED_RECEPTION:
				getOwnedReceptions().clear();
				return;
			case UML2Package.ASSOCIATION_CLASS__IS_DERIVED:
				setIsDerived(IS_DERIVED_EDEFAULT);
				return;
			case UML2Package.ASSOCIATION_CLASS__OWNED_END:
				getOwnedEnds().clear();
				return;
			case UML2Package.ASSOCIATION_CLASS__MEMBER_END:
				getMemberEnds().clear();
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
			case UML2Package.ASSOCIATION_CLASS__EANNOTATIONS:
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UML2Package.ASSOCIATION_CLASS__OWNED_ELEMENT:
				return isSetOwnedElements();
			case UML2Package.ASSOCIATION_CLASS__OWNER:
				return isSetOwner();
			case UML2Package.ASSOCIATION_CLASS__OWNED_COMMENT:
				return ownedComments != null && !ownedComments.isEmpty();
			case UML2Package.ASSOCIATION_CLASS__TEMPLATE_BINDING:
				return templateBindings != null && !templateBindings.isEmpty();
			case UML2Package.ASSOCIATION_CLASS__OWNED_TEMPLATE_SIGNATURE:
				return ownedTemplateSignature != null;
			case UML2Package.ASSOCIATION_CLASS__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case UML2Package.ASSOCIATION_CLASS__QUALIFIED_NAME:
				return QUALIFIED_NAME_EDEFAULT == null ? getQualifiedName() != null : !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case UML2Package.ASSOCIATION_CLASS__VISIBILITY:
				return isSetVisibility();
			case UML2Package.ASSOCIATION_CLASS__CLIENT_DEPENDENCY:
				return clientDependencies != null && !clientDependencies.isEmpty();
			case UML2Package.ASSOCIATION_CLASS__NAME_EXPRESSION:
				return nameExpression != null;
			case UML2Package.ASSOCIATION_CLASS__MEMBER:
				return isSetMembers();
			case UML2Package.ASSOCIATION_CLASS__OWNED_RULE:
				return ownedRules != null && !ownedRules.isEmpty();
			case UML2Package.ASSOCIATION_CLASS__IMPORTED_MEMBER:
				return !getImportedMembers().isEmpty();
			case UML2Package.ASSOCIATION_CLASS__ELEMENT_IMPORT:
				return elementImports != null && !elementImports.isEmpty();
			case UML2Package.ASSOCIATION_CLASS__PACKAGE_IMPORT:
				return packageImports != null && !packageImports.isEmpty();
			case UML2Package.ASSOCIATION_CLASS__TEMPLATE_PARAMETER:
				return templateParameter != null;
			case UML2Package.ASSOCIATION_CLASS__OWNING_PARAMETER:
				return getOwningParameter() != null;
			case UML2Package.ASSOCIATION_CLASS__PACKAGEABLE_ELEMENT_VISIBILITY:
				return isSetPackageableElement_visibility();
			case UML2Package.ASSOCIATION_CLASS__PACKAGE:
				return getPackage() != null;
			case UML2Package.ASSOCIATION_CLASS__REDEFINITION_CONTEXT:
				return isSetRedefinitionContexts();
			case UML2Package.ASSOCIATION_CLASS__IS_LEAF:
				return ((eFlags & IS_LEAF_EFLAG) != 0) != IS_LEAF_EDEFAULT;
			case UML2Package.ASSOCIATION_CLASS__FEATURE:
				return isSetFeatures();
			case UML2Package.ASSOCIATION_CLASS__IS_ABSTRACT:
				return isSetIsAbstract();
			case UML2Package.ASSOCIATION_CLASS__INHERITED_MEMBER:
				return !getInheritedMembers().isEmpty();
			case UML2Package.ASSOCIATION_CLASS__GENERAL:
				return isSetGenerals();
			case UML2Package.ASSOCIATION_CLASS__GENERALIZATION:
				return generalizations != null && !generalizations.isEmpty();
			case UML2Package.ASSOCIATION_CLASS__ATTRIBUTE:
				return isSetAttributes();
			case UML2Package.ASSOCIATION_CLASS__REDEFINED_CLASSIFIER:
				return redefinedClassifiers != null && !redefinedClassifiers.isEmpty();
			case UML2Package.ASSOCIATION_CLASS__SUBSTITUTION:
				return substitutions != null && !substitutions.isEmpty();
			case UML2Package.ASSOCIATION_CLASS__POWERTYPE_EXTENT:
				return powertypeExtents != null && !powertypeExtents.isEmpty();
			case UML2Package.ASSOCIATION_CLASS__OWNED_USE_CASE:
				return ownedUseCases != null && !ownedUseCases.isEmpty();
			case UML2Package.ASSOCIATION_CLASS__USE_CASE:
				return useCases != null && !useCases.isEmpty();
			case UML2Package.ASSOCIATION_CLASS__REPRESENTATION:
				return representation != null;
			case UML2Package.ASSOCIATION_CLASS__OCCURRENCE:
				return occurrences != null && !occurrences.isEmpty();
			case UML2Package.ASSOCIATION_CLASS__OWNED_BEHAVIOR:
				return isSetOwnedBehaviors();
			case UML2Package.ASSOCIATION_CLASS__CLASSIFIER_BEHAVIOR:
				return classifierBehavior != null;
			case UML2Package.ASSOCIATION_CLASS__IMPLEMENTATION:
				return implementations != null && !implementations.isEmpty();
			case UML2Package.ASSOCIATION_CLASS__OWNED_TRIGGER:
				return ownedTriggers != null && !ownedTriggers.isEmpty();
			case UML2Package.ASSOCIATION_CLASS__OWNED_STATE_MACHINE:
				return isSetOwnedStateMachines();
			case UML2Package.ASSOCIATION_CLASS__OWNED_ATTRIBUTE:
				return isSetOwnedAttributes();
			case UML2Package.ASSOCIATION_CLASS__PART:
				return !getParts().isEmpty();
			case UML2Package.ASSOCIATION_CLASS__ROLE:
				return isSetRoles();
			case UML2Package.ASSOCIATION_CLASS__OWNED_CONNECTOR:
				return ownedConnectors != null && !ownedConnectors.isEmpty();
			case UML2Package.ASSOCIATION_CLASS__OWNED_PORT:
				return ownedPorts != null && !ownedPorts.isEmpty();
			case UML2Package.ASSOCIATION_CLASS__OWNED_OPERATION:
				return ownedOperations != null && !ownedOperations.isEmpty();
			case UML2Package.ASSOCIATION_CLASS__SUPER_CLASS:
				return isSetSuperClasses();
			case UML2Package.ASSOCIATION_CLASS__EXTENSION:
				return !getExtensions().isEmpty();
			case UML2Package.ASSOCIATION_CLASS__NESTED_CLASSIFIER:
				return nestedClassifiers != null && !nestedClassifiers.isEmpty();
			case UML2Package.ASSOCIATION_CLASS__IS_ACTIVE:
				return ((eFlags & IS_ACTIVE_EFLAG) != 0) != IS_ACTIVE_EDEFAULT;
			case UML2Package.ASSOCIATION_CLASS__OWNED_RECEPTION:
				return ownedReceptions != null && !ownedReceptions.isEmpty();
			case UML2Package.ASSOCIATION_CLASS__RELATED_ELEMENT:
				return isSetRelatedElements();
			case UML2Package.ASSOCIATION_CLASS__IS_DERIVED:
				return ((eFlags & IS_DERIVED_EFLAG) != 0) != IS_DERIVED_EDEFAULT;
			case UML2Package.ASSOCIATION_CLASS__OWNED_END:
				return ownedEnds != null && !ownedEnds.isEmpty();
			case UML2Package.ASSOCIATION_CLASS__END_TYPE:
				return !getEndTypes().isEmpty();
			case UML2Package.ASSOCIATION_CLASS__MEMBER_END:
				return memberEnds != null && !memberEnds.isEmpty();
		}
		return eDynamicIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class baseClass) {
		if (baseClass == Relationship.class) {
			switch (derivedFeatureID) {
				case UML2Package.ASSOCIATION_CLASS__RELATED_ELEMENT: return UML2Package.RELATIONSHIP__RELATED_ELEMENT;
				default: return -1;
			}
		}
		if (baseClass == Association.class) {
			switch (derivedFeatureID) {
				case UML2Package.ASSOCIATION_CLASS__IS_DERIVED: return UML2Package.ASSOCIATION__IS_DERIVED;
				case UML2Package.ASSOCIATION_CLASS__OWNED_END: return UML2Package.ASSOCIATION__OWNED_END;
				case UML2Package.ASSOCIATION_CLASS__END_TYPE: return UML2Package.ASSOCIATION__END_TYPE;
				case UML2Package.ASSOCIATION_CLASS__MEMBER_END: return UML2Package.ASSOCIATION__MEMBER_END;
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
		if (baseClass == Relationship.class) {
			switch (baseFeatureID) {
				case UML2Package.RELATIONSHIP__RELATED_ELEMENT: return UML2Package.ASSOCIATION_CLASS__RELATED_ELEMENT;
				default: return -1;
			}
		}
		if (baseClass == Association.class) {
			switch (baseFeatureID) {
				case UML2Package.ASSOCIATION__IS_DERIVED: return UML2Package.ASSOCIATION_CLASS__IS_DERIVED;
				case UML2Package.ASSOCIATION__OWNED_END: return UML2Package.ASSOCIATION_CLASS__OWNED_END;
				case UML2Package.ASSOCIATION__END_TYPE: return UML2Package.ASSOCIATION_CLASS__END_TYPE;
				case UML2Package.ASSOCIATION__MEMBER_END: return UML2Package.ASSOCIATION_CLASS__MEMBER_END;
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
		result.append(" (isDerived: "); //$NON-NLS-1$
		result.append((eFlags & IS_DERIVED_EFLAG) != 0);
		result.append(')');
		return result.toString();
	}


	// <!-- begin-custom-operations -->

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.uml2.Association#isBinary()
	 */
	public boolean isBinary() {
		return AssociationOperations.isBinary(this);
	}
	
	// <!-- end-custom-operations -->

} //AssociationClassImpl
