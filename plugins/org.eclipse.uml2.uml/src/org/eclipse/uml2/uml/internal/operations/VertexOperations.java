/*
 * Copyright (c) 2005 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *
 * $Id: VertexOperations.java,v 1.2 2005/12/01 22:16:35 khussey Exp $
 */
package org.eclipse.uml2.uml.internal.operations;

import org.eclipse.uml2.uml.ConnectionPointReference;
import org.eclipse.uml2.uml.Pseudostate;
import org.eclipse.uml2.uml.PseudostateKind;
import org.eclipse.uml2.uml.Region;
import org.eclipse.uml2.uml.State;
import org.eclipse.uml2.uml.StateMachine;
import org.eclipse.uml2.uml.Vertex;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Vertex</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.Vertex#containingStatemachine() <em>Containing Statemachine</em>}</li>
 * </ul>
 * </p>
 *
 * @generated not
 */
public final class VertexOperations extends UMLOperations {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private VertexOperations() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The operation containingStatemachine() returns the state machine in which this Vertex is defined
	 * result = if not container->isEmpty()
	 * then
	 * -- the container is a region
	 * container.containingStateMachine()
	 * else if (oclIsKindOf(Pseudostate)) then
	 * -- entry or exit point?
	 * if (kind = #entryPoint) or (kind = #exitPoint) then
	 * stateMachine
	 * else if (oclIsKindOf(ConnectionPointReference)) then
	 * state.containingStateMachine() -- no other valid cases possible
	 * endif
	 * 
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static StateMachine containingStatemachine(Vertex vertex) {
		Region container = vertex.getContainer();

		if (container != null) {
			return container.containingStateMachine();
		} else if (vertex instanceof Pseudostate) {
			Pseudostate pseudostate = (Pseudostate) vertex;
			PseudostateKind kind = pseudostate.getKind();

			if (kind == PseudostateKind.ENTRY_POINT_LITERAL
				|| kind == PseudostateKind.EXIT_POINT_LITERAL) {

				return pseudostate.getStateMachine();
			}
		} else if (vertex instanceof ConnectionPointReference) {
			State state = ((ConnectionPointReference) vertex).getState();

			if (state != null) {
				return state.containingStatemachine();
			}
		}

		return null;
	}

} // VertexOperations
