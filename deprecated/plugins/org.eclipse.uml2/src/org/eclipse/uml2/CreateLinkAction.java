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
 * $Id: CreateLinkAction.java,v 1.6 2005/05/18 16:38:29 khussey Exp $
 */
package org.eclipse.uml2;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Create Link Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This action can be used to create links and link objects. There is no return value in either case. This is so that no change of the action is required if the association is changed to an association class or vice versa. CreateLinkAction uses a specialization of LinkEndData called LinkEndCreationData, to support ordered associations. The insertion point is specified at runtime by an additional input pin, which is required for ordered association ends and omitted for unordered ends. The insertion point is a positive integer giving the position to insert the link, or infinity, to insert at the end. Reinserting an existing end at a new position moves the end to that position. CreateLinkAction also uses LinkEndCreationData to support the destruction of existing links of the association that connect any of the objects of the new link. When the link is created, this option is available on an end-by-end basis, and causes all links of the association emanating from the specified ends to be destroyed before the new link is created. 
 * <!-- end-model-doc -->
 *
 *
 * @see org.eclipse.uml2.UML2Package#getCreateLinkAction()
 * @model
 * @generated
 */
public interface CreateLinkAction extends WriteLinkAction{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) IBM Corporation and others."; //$NON-NLS-1$

} // CreateLinkAction
