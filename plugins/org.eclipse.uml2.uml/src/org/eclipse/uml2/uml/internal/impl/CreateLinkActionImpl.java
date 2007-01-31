/*
 * Copyright (c) 2005, 2007 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *
 * $Id: CreateLinkActionImpl.java,v 1.17 2007/01/31 21:21:15 khussey Exp $
 */
package org.eclipse.uml2.uml.internal.impl;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;

import org.eclipse.uml2.uml.CreateLinkAction;
import org.eclipse.uml2.uml.LinkEndCreationData;
import org.eclipse.uml2.uml.LinkEndData;
import org.eclipse.uml2.uml.UMLPackage;

import org.eclipse.uml2.uml.internal.operations.CreateLinkActionOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Create Link Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.CreateLinkActionImpl#getEndData <em>End Data</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CreateLinkActionImpl
		extends WriteLinkActionImpl
		implements CreateLinkAction {

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
	@Override
	protected EClass eStaticClass() {
		return UMLPackage.Literals.CREATE_LINK_ACTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<LinkEndData> getEndData() {
		if (endData == null) {
			endData = new EObjectContainmentEList.Resolving<LinkEndData>(
				LinkEndCreationData.class, this,
				UMLPackage.CREATE_LINK_ACTION__END_DATA);
		}
		return endData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LinkEndData createEndData() {
		LinkEndCreationData newEndData = (LinkEndCreationData) create(UMLPackage.Literals.LINK_END_CREATION_DATA);
		getEndData().add(newEndData);
		return newEndData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetEndData() {
		//genFeature
		return endData != null && !endData.isEmpty();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssociationNotAbstract(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return CreateLinkActionOperations.validateAssociationNotAbstract(this,
			diagnostics, context);
	}

} //CreateLinkActionImpl
