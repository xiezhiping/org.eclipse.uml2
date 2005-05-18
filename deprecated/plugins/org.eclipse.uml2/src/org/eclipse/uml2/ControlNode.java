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
 * $Id: ControlNode.java,v 1.6 2005/05/18 16:38:30 khussey Exp $
 */
package org.eclipse.uml2;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Control Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A control node is an activity node used to coordinate the flows between other nodes. It covers initial node, final node and its children, fork node, join node, decision node, and merge node. 
 * <!-- end-model-doc -->
 *
 *
 * @see org.eclipse.uml2.UML2Package#getControlNode()
 * @model abstract="true"
 * @generated
 */
public interface ControlNode extends ActivityNode{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) IBM Corporation and others."; //$NON-NLS-1$

} // ControlNode
