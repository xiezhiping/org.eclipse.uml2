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
 * $Id: CreateLinkAction.java,v 1.4 2006/12/14 15:49:27 khussey Exp $
 */
package org.eclipse.uml2.uml;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Create Link Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A create link action is a write link action for creating links.
 * <!-- end-model-doc -->
 *
 *
 * @see org.eclipse.uml2.uml.UMLPackage#getCreateLinkAction()
 * @model
 * @generated
 */
public interface CreateLinkAction
		extends WriteLinkAction {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The association cannot be an abstract classifier.
	 * self.association().isAbstract = #false
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validateAssociationNotAbstract(DiagnosticChain diagnostics,
			Map<Object, Object> context);

} // CreateLinkAction
