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
 * $Id: Gate.java,v 1.6 2005/05/18 16:38:29 khussey Exp $
 */
package org.eclipse.uml2;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gate</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A Gate is a connection point for relating a Message outside an InteractionFragment with a Message inside the InteractionFragment. Gate is a specialization of MessageEnd. Gates are connected through Messages. A Gate is actually a representative of an EventOccurrence that is not in the same scope as the Gate. Gates play different roles: we have formal gates on Interactions, actual gates on InteractionOccurrences, expression gates on CombinedFragments. 
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
	String copyright = "Copyright (c) IBM Corporation and others."; //$NON-NLS-1$

} // Gate
