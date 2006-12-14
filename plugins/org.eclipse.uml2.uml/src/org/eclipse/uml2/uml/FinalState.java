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
 * $Id: FinalState.java,v 1.3 2006/12/14 15:49:28 khussey Exp $
 */
package org.eclipse.uml2.uml;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Final State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A special kind of state signifying that the enclosing region is completed. If the enclosing region is directly contained in a state machine and all other regions in the state machine also are completed, then it means that the entire state machine is completed.
 * <!-- end-model-doc -->
 *
 *
 * @see org.eclipse.uml2.uml.UMLPackage#getFinalState()
 * @model
 * @generated
 */
public interface FinalState
		extends State {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A final state cannot have any outgoing transitions.
	 * self.outgoing->size() = 0
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validateNoOutgoingTransitions(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A final state cannot have regions.
	 * self.region->size() = 0
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validateNoRegions(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A final state cannot reference a submachine.
	 * self.submachine->isEmpty()
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validateCannotReferenceSubmachine(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A final state has no entry behavior.
	 * self.entry->isEmpty()
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validateNoEntryBehavior(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A final state has no exit behavior.
	 * self.exit->isEmpty()
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validateNoExitBehavior(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A final state has no state (doActivity) behavior.
	 * self.doActivity->isEmpty()
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validateNoStateBehavior(DiagnosticChain diagnostics,
			Map<Object, Object> context);

} // FinalState
