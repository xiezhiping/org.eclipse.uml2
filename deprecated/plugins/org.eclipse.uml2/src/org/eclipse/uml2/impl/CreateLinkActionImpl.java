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
 * $Id: CreateLinkActionImpl.java,v 1.20 2006/04/10 20:40:17 khussey Exp $
 */
package org.eclipse.uml2.impl;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.uml2.CreateLinkAction;
import org.eclipse.uml2.LinkEndCreationData;
import org.eclipse.uml2.LinkEndData;
import org.eclipse.uml2.UML2Factory;
import org.eclipse.uml2.UML2Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Create Link Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2.impl.CreateLinkActionImpl#getEndData <em>End Data</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CreateLinkActionImpl extends WriteLinkActionImpl implements CreateLinkAction {
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
	protected CreateLinkActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return UML2Package.Literals.CREATE_LINK_ACTION;
	}

	public EList getEndData() {
		if (endData == null) {
			endData = new EObjectContainmentEList(LinkEndCreationData.class, this, UML2Package.CREATE_LINK_ACTION__END_DATA);
		}
		return endData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetEndData() {
		return endData != null && !endData.isEmpty();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UML2Package.CREATE_LINK_ACTION__EANNOTATIONS:
				return getEAnnotations();
			case UML2Package.CREATE_LINK_ACTION__OWNED_ELEMENT:
				return getOwnedElements();
			case UML2Package.CREATE_LINK_ACTION__OWNER:
				if (resolve) return getOwner();
				return basicGetOwner();
			case UML2Package.CREATE_LINK_ACTION__OWNED_COMMENT:
				return getOwnedComments();
			case UML2Package.CREATE_LINK_ACTION__TEMPLATE_BINDING:
				return getTemplateBindings();
			case UML2Package.CREATE_LINK_ACTION__OWNED_TEMPLATE_SIGNATURE:
				return getOwnedTemplateSignature();
			case UML2Package.CREATE_LINK_ACTION__NAME:
				return getName();
			case UML2Package.CREATE_LINK_ACTION__QUALIFIED_NAME:
				return getQualifiedName();
			case UML2Package.CREATE_LINK_ACTION__VISIBILITY:
				return getVisibility();
			case UML2Package.CREATE_LINK_ACTION__CLIENT_DEPENDENCY:
				return getClientDependencies();
			case UML2Package.CREATE_LINK_ACTION__NAME_EXPRESSION:
				return getNameExpression();
			case UML2Package.CREATE_LINK_ACTION__REDEFINITION_CONTEXT:
				return getRedefinitionContexts();
			case UML2Package.CREATE_LINK_ACTION__IS_LEAF:
				return isLeaf() ? Boolean.TRUE : Boolean.FALSE;
			case UML2Package.CREATE_LINK_ACTION__OUTGOING:
				return getOutgoings();
			case UML2Package.CREATE_LINK_ACTION__INCOMING:
				return getIncomings();
			case UML2Package.CREATE_LINK_ACTION__IN_GROUP:
				return getInGroups();
			case UML2Package.CREATE_LINK_ACTION__ACTIVITY:
				return getActivity();
			case UML2Package.CREATE_LINK_ACTION__REDEFINED_ELEMENT:
				return getRedefinedElements();
			case UML2Package.CREATE_LINK_ACTION__IN_STRUCTURED_NODE:
				return getInStructuredNode();
			case UML2Package.CREATE_LINK_ACTION__IN_PARTITION:
				return getInPartitions();
			case UML2Package.CREATE_LINK_ACTION__IN_INTERRUPTIBLE_REGION:
				return getInInterruptibleRegions();
			case UML2Package.CREATE_LINK_ACTION__HANDLER:
				return getHandlers();
			case UML2Package.CREATE_LINK_ACTION__EFFECT:
				return getEffect();
			case UML2Package.CREATE_LINK_ACTION__OUTPUT:
				return getOutputs();
			case UML2Package.CREATE_LINK_ACTION__INPUT:
				return getInputs();
			case UML2Package.CREATE_LINK_ACTION__CONTEXT:
				return getContext();
			case UML2Package.CREATE_LINK_ACTION__LOCAL_PRECONDITION:
				return getLocalPreconditions();
			case UML2Package.CREATE_LINK_ACTION__LOCAL_POSTCONDITION:
				return getLocalPostconditions();
			case UML2Package.CREATE_LINK_ACTION__END_DATA:
				return getEndData();
		}
		return eDynamicGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case UML2Package.CREATE_LINK_ACTION__EANNOTATIONS:
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UML2Package.CREATE_LINK_ACTION__OWNED_ELEMENT:
				return isSetOwnedElements();
			case UML2Package.CREATE_LINK_ACTION__OWNER:
				return isSetOwner();
			case UML2Package.CREATE_LINK_ACTION__OWNED_COMMENT:
				return ownedComments != null && !ownedComments.isEmpty();
			case UML2Package.CREATE_LINK_ACTION__TEMPLATE_BINDING:
				return templateBindings != null && !templateBindings.isEmpty();
			case UML2Package.CREATE_LINK_ACTION__OWNED_TEMPLATE_SIGNATURE:
				return ownedTemplateSignature != null;
			case UML2Package.CREATE_LINK_ACTION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case UML2Package.CREATE_LINK_ACTION__QUALIFIED_NAME:
				return QUALIFIED_NAME_EDEFAULT == null ? getQualifiedName() != null : !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case UML2Package.CREATE_LINK_ACTION__VISIBILITY:
				return visibility != VISIBILITY_EDEFAULT;
			case UML2Package.CREATE_LINK_ACTION__CLIENT_DEPENDENCY:
				return clientDependencies != null && !clientDependencies.isEmpty();
			case UML2Package.CREATE_LINK_ACTION__NAME_EXPRESSION:
				return nameExpression != null;
			case UML2Package.CREATE_LINK_ACTION__REDEFINITION_CONTEXT:
				return isSetRedefinitionContexts();
			case UML2Package.CREATE_LINK_ACTION__IS_LEAF:
				return ((eFlags & IS_LEAF_EFLAG) != 0) != IS_LEAF_EDEFAULT;
			case UML2Package.CREATE_LINK_ACTION__OUTGOING:
				return outgoings != null && !outgoings.isEmpty();
			case UML2Package.CREATE_LINK_ACTION__INCOMING:
				return incomings != null && !incomings.isEmpty();
			case UML2Package.CREATE_LINK_ACTION__IN_GROUP:
				return isSetInGroups();
			case UML2Package.CREATE_LINK_ACTION__ACTIVITY:
				return getActivity() != null;
			case UML2Package.CREATE_LINK_ACTION__REDEFINED_ELEMENT:
				return isSetRedefinedElements();
			case UML2Package.CREATE_LINK_ACTION__IN_STRUCTURED_NODE:
				return getInStructuredNode() != null;
			case UML2Package.CREATE_LINK_ACTION__IN_PARTITION:
				return inPartitions != null && !inPartitions.isEmpty();
			case UML2Package.CREATE_LINK_ACTION__IN_INTERRUPTIBLE_REGION:
				return inInterruptibleRegions != null && !inInterruptibleRegions.isEmpty();
			case UML2Package.CREATE_LINK_ACTION__HANDLER:
				return handlers != null && !handlers.isEmpty();
			case UML2Package.CREATE_LINK_ACTION__EFFECT:
				return EFFECT_EDEFAULT == null ? effect != null : !EFFECT_EDEFAULT.equals(effect);
			case UML2Package.CREATE_LINK_ACTION__OUTPUT:
				return isSetOutputs();
			case UML2Package.CREATE_LINK_ACTION__INPUT:
				return isSetInputs();
			case UML2Package.CREATE_LINK_ACTION__CONTEXT:
				return getContext() != null;
			case UML2Package.CREATE_LINK_ACTION__LOCAL_PRECONDITION:
				return localPreconditions != null && !localPreconditions.isEmpty();
			case UML2Package.CREATE_LINK_ACTION__LOCAL_POSTCONDITION:
				return localPostconditions != null && !localPostconditions.isEmpty();
			case UML2Package.CREATE_LINK_ACTION__END_DATA:
				return isSetEndData();
		}
		return eDynamicIsSet(featureID);
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 * @deprecated Use #createEndData() instead.
	 */
	public LinkEndData createEndData(EClass eClass) {
		LinkEndCreationData newEndData = (LinkEndCreationData) eClass.getEPackage().getEFactoryInstance().create(eClass);
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, 0, UML2Package.CREATE_LINK_ACTION__END_DATA, null, newEndData));
		}
		getEndData().add(newEndData);
		return newEndData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public LinkEndData createEndData() {
		LinkEndCreationData newEndData = UML2Factory.eINSTANCE.createLinkEndCreationData();
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, 0, UML2Package.CREATE_LINK_ACTION__END_DATA, null, newEndData));
		}
		getEndData().add(newEndData);
		return newEndData;
	}

} //CreateLinkActionImpl
