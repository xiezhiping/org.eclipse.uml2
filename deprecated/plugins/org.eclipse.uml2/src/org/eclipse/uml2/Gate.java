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
 * $Id: Gate.java,v 1.2 2004/04/10 04:09:49 khussey Exp $
 */
package org.eclipse.uml2;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gate</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A gate is a connection point. When the conceptual replacement of InteractionReferences with its referred Sequence Diagram is done, the actual gates of the reference must match the formal gates of the sequence diagram.
 * More implicitly the unnamed gate of the atomic fragment match adjacent fragment gates.
 * Expression gates are found on the border of the expression and they serve both as formal and actual gates. (Details to be explained other place)
 * <!-- end-model-doc -->
 *
 *
 * @see org.eclipse.uml2.UML2Package#getGate()
 * @model 
 * @generated
 */
public interface Gate extends MessageEnd{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) 2003, 2004 IBM Corporation and others."; //$NON-NLS-1$

} // Gate
