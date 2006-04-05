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
 * $Id: DestroyLinkAction.java,v 1.2 2006/04/05 13:49:57 khussey Exp $
 */
package org.eclipse.uml2.uml;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Destroy Link Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This action destroys a link or a link object. Link objects can also be destroyed with DestroyObjectAction. The link is specified in the same way as link creation, even for link objects. This allows actions to remain unchanged when their associations are transformed from ordinary ones to association classes and vice versa.
 * 
 * DestroyLinkAction uses a specialization of LinkEndData, called LinkEndDestructionData, to support ordered nonunique associations. The position of the link to be destroyed is specified at runtime by an additional input pin, which is required for ordered nonunique association ends and omitted for other kinds of ends. This is a positive integer giving the position of the link to destroy.
 * 
 * DestroyLinkAction also uses LinkEndDestructionData to support the destruction of duplicate links of the association on ends that are nonunique. This option is available on an end-by-end basis, and causes all duplicate links of the association emanating from the specified ends to be destroyed.
 * 
 * <!-- end-model-doc -->
 *
 *
 * @see org.eclipse.uml2.uml.UMLPackage#getDestroyLinkAction()
 * @model
 * @generated
 */
public interface DestroyLinkAction
		extends WriteLinkAction {
} // DestroyLinkAction
