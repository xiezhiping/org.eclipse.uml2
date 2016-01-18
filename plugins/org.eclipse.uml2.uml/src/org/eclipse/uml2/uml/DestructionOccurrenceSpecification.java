/*
 * Copyright (c) 2011, 2016 CEA and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Kenn Hussey (CEA) - initial API and implementation
 *   Christian W. Damus (CEA) - 251963
 *   Kenn Hussey (CEA) - 418466, 485756
 *
 */
package org.eclipse.uml2.uml;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Destruction Occurrence Specification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A DestructionOccurenceSpecification models the destruction of an object.
 * <p>From package UML::Interactions.</p>
 * <!-- end-model-doc -->
 *
 *
 * @see org.eclipse.uml2.uml.UMLPackage#getDestructionOccurrenceSpecification()
 * @model
 * @generated
 */
public interface DestructionOccurrenceSpecification
		extends MessageOccurrenceSpecification {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * No other OccurrenceSpecifications on a given Lifeline in an InteractionOperand may appear below a DestructionOccurrenceSpecification.
	 * let o : InteractionOperand = enclosingOperand in o->notEmpty() and 
	 * let peerEvents : OrderedSet(OccurrenceSpecification) = covered.events->select(enclosingOperand = o)
	 * in peerEvents->last() = self
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validateNoOccurrenceSpecificationsBelow(DiagnosticChain diagnostics,
			Map<Object, Object> context);

} // DestructionOccurrenceSpecification
