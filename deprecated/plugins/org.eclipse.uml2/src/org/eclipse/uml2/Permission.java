/*
 * Copyright (c) 2003, 2004 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *
 * $Id: Permission.java,v 1.6 2005/05/18 16:38:30 khussey Exp $
 */
package org.eclipse.uml2;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Permission</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A Permission signifies granting of access rights from the supplier model element to a client model element. Or to put it another way, it signifies that the client requires access to some or all of the constituent elements of the supplier. The supplier element gives the client permission to access some or all of its constituents elements. 
 * <!-- end-model-doc -->
 *
 *
 * @see org.eclipse.uml2.UML2Package#getPermission()
 * @model
 * @generated
 */
public interface Permission extends Dependency{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) IBM Corporation and others."; //$NON-NLS-1$

} // Permission
