/*
 * Copyright (c) 2006, 2016 IBM Corporation, CEA, and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *   Kenn Hussey (CEA) - 327039, 418466, 451350, 485756
 *   Christian W. Damus (CEA) - 251963
 *
 */
package org.eclipse.uml2.uml;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Pseudostate Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * PseudostateKind is an Enumeration type that is used to differentiate various kinds of Pseudostates.
 * <p>From package UML::StateMachines.</p>
 * <!-- end-model-doc -->
 * @see org.eclipse.uml2.uml.UMLPackage#getPseudostateKind()
 * @model
 * @generated
 */
public enum PseudostateKind
	implements Enumerator {
	/**
	 * The '<em><b>Initial</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INITIAL
	 * @generated
	 * @ordered
	 */
	INITIAL_LITERAL(0, "initial", "initial"), //$NON-NLS-1$ //$NON-NLS-2$

	/**
	 * The '<em><b>Deep History</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DEEP_HISTORY
	 * @generated
	 * @ordered
	 */
	DEEP_HISTORY_LITERAL(1, "deepHistory", "deepHistory"), //$NON-NLS-1$ //$NON-NLS-2$

	/**
	 * The '<em><b>Shallow History</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SHALLOW_HISTORY
	 * @generated
	 * @ordered
	 */
	SHALLOW_HISTORY_LITERAL(2, "shallowHistory", "shallowHistory"), //$NON-NLS-1$ //$NON-NLS-2$

	/**
	 * The '<em><b>Join</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #JOIN
	 * @generated
	 * @ordered
	 */
	JOIN_LITERAL(3, "join", "join"), //$NON-NLS-1$ //$NON-NLS-2$

	/**
	 * The '<em><b>Fork</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FORK
	 * @generated
	 * @ordered
	 */
	FORK_LITERAL(4, "fork", "fork"), //$NON-NLS-1$ //$NON-NLS-2$

	/**
	 * The '<em><b>Junction</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #JUNCTION
	 * @generated
	 * @ordered
	 */
	JUNCTION_LITERAL(5, "junction", "junction"), //$NON-NLS-1$ //$NON-NLS-2$

	/**
	 * The '<em><b>Choice</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CHOICE
	 * @generated
	 * @ordered
	 */
	CHOICE_LITERAL(6, "choice", "choice"), //$NON-NLS-1$ //$NON-NLS-2$

	/**
	 * The '<em><b>Entry Point</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENTRY_POINT
	 * @generated
	 * @ordered
	 */
	ENTRY_POINT_LITERAL(7, "entryPoint", "entryPoint"), //$NON-NLS-1$ //$NON-NLS-2$

	/**
	 * The '<em><b>Exit Point</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EXIT_POINT
	 * @generated
	 * @ordered
	 */
	EXIT_POINT_LITERAL(8, "exitPoint", "exitPoint"), //$NON-NLS-1$ //$NON-NLS-2$

	/**
	 * The '<em><b>Terminate</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TERMINATE
	 * @generated
	 * @ordered
	 */
	TERMINATE_LITERAL(9, "terminate", "terminate"); //$NON-NLS-1$ //$NON-NLS-2$

	/**
	 * The '<em><b>Initial</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An initial pseudostate represents a default vertex that is the source for a single transition to the default state of a composite state. There can be at most one initial vertex in a region. The outgoing transition from the initial vertex may have a behavior, but not a trigger or guard.
	 * <!-- end-model-doc -->
	 * @see #INITIAL_LITERAL
	 * @model name="initial"
	 * @generated
	 * @ordered
	 */
	public static final int INITIAL = 0;

	/**
	 * The '<em><b>Deep History</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * DeepHistory represents the most recent active configuration of the composite state that directly contains this pseudostate; e.g. the state configuration that was active when the composite state was last exited. A composite state can have at most one deep history vertex. At most one transition may originate from the history connector to the default deep history state. This transition is taken in case the composite state had never been active before. Entry actions of states entered on the path to the state represented by a deep history are performed.
	 * <!-- end-model-doc -->
	 * @see #DEEP_HISTORY_LITERAL
	 * @model name="deepHistory"
	 * @generated
	 * @ordered
	 */
	public static final int DEEP_HISTORY = 1;

	/**
	 * The '<em><b>Shallow History</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ShallowHistory represents the most recent active substate of its containing state (but not the substates of that substate). A composite state can have at most one shallow history vertex. A transition coming into the shallow history vertex is equivalent to a transition coming into the most recent active substate of a state. At most one transition may originate from the history connector to the default shallow history state. This transition is taken in case the composite state had never been active before. Entry actions of states entered on the path to the state represented by a shallow history are performed.
	 * <!-- end-model-doc -->
	 * @see #SHALLOW_HISTORY_LITERAL
	 * @model name="shallowHistory"
	 * @generated
	 * @ordered
	 */
	public static final int SHALLOW_HISTORY = 2;

	/**
	 * The '<em><b>Join</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Join vertices serve to merge several transitions emanating from source vertices in different orthogonal regions. The transitions entering a join vertex cannot have guards or triggers.
	 * <!-- end-model-doc -->
	 * @see #JOIN_LITERAL
	 * @model name="join"
	 * @generated
	 * @ordered
	 */
	public static final int JOIN = 3;

	/**
	 * The '<em><b>Fork</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Fork vertices serve to split an incoming transition into two or more transitions terminating on orthogonal target vertices (i.e. vertices in different regions of a composite state). The segments outgoing from a fork vertex must not have guards or triggers.
	 * <!-- end-model-doc -->
	 * @see #FORK_LITERAL
	 * @model name="fork"
	 * @generated
	 * @ordered
	 */
	public static final int FORK = 4;

	/**
	 * The '<em><b>Junction</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Junction vertices are semantic-free vertices that are used to chain together multiple transitions. They are used to construct compound transition paths between states. For example, a junction can be used to converge multiple incoming transitions into a single outgoing transition representing a shared transition path (this is known as an merge). Conversely, they can be used to split an incoming transition into multiple outgoing transition segments with different guard conditions. This realizes a static conditional branch. (In the latter case, outgoing transitions whose guard conditions evaluate to false are disabled. A predefined guard denoted 'else' may be defined for at most one outgoing transition. This transition is enabled if all the guards labeling the other transitions are false.) Static conditional branches are distinct from dynamic conditional branches that are realized by choice vertices (described below).
	 * <!-- end-model-doc -->
	 * @see #JUNCTION_LITERAL
	 * @model name="junction"
	 * @generated
	 * @ordered
	 */
	public static final int JUNCTION = 5;

	/**
	 * The '<em><b>Choice</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Choice vertices which, when reached, result in the dynamic evaluation of the guards of the triggers of its outgoing transitions. This realizes a dynamic conditional branch. It allows splitting of transitions into multiple outgoing paths such that the decision on which path to take may be a function of the results of prior actions performed in the same run-tocompletion step. If more than one of the guards evaluates to true, an arbitrary one is selected. If none of the guards evaluates to true, then the model is considered ill-formed. (To avoid this, it is recommended to define one outgoing transition with the predefined else guard for every choice vertex.) Choice vertices should be distinguished from static branch points that are based on junction points (described above).
	 * <!-- end-model-doc -->
	 * @see #CHOICE_LITERAL
	 * @model name="choice"
	 * @generated
	 * @ordered
	 */
	public static final int CHOICE = 6;

	/**
	 * The '<em><b>Entry Point</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An entry point pseudostate is an entry point of a state machine or composite state. In each region of the state machine or composite state it has a single transition to a vertex within the same region.
	 * <!-- end-model-doc -->
	 * @see #ENTRY_POINT_LITERAL
	 * @model name="entryPoint"
	 * @generated
	 * @ordered
	 */
	public static final int ENTRY_POINT = 7;

	/**
	 * The '<em><b>Exit Point</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An exit point pseudostate is an exit point of a state machine or composite state. Entering an exit point within any region of the composite state or state machine referenced by a submachine state implies the exit of this composite state or submachine state and the triggering of the transition that has this exit point as source in the state machine enclosing the submachine or composite state.
	 * <!-- end-model-doc -->
	 * @see #EXIT_POINT_LITERAL
	 * @model name="exitPoint"
	 * @generated
	 * @ordered
	 */
	public static final int EXIT_POINT = 8;

	/**
	 * The '<em><b>Terminate</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Entering a terminate pseudostate implies that the execution of this state machine by means of its context object is terminated. The state machine does not exit any states nor does it perform any exit actions other than those associated with the transition leading to the terminate pseudostate. Entering a terminate pseudostate is equivalent to invoking a DestroyObjectAction.
	 * <!-- end-model-doc -->
	 * @see #TERMINATE_LITERAL
	 * @model name="terminate"
	 * @generated
	 * @ordered
	 */
	public static final int TERMINATE = 9;

	/**
	 * An array of all the '<em><b>Pseudostate Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final PseudostateKind[] VALUES_ARRAY = new PseudostateKind[]{
		INITIAL_LITERAL, DEEP_HISTORY_LITERAL, SHALLOW_HISTORY_LITERAL,
		JOIN_LITERAL, FORK_LITERAL, JUNCTION_LITERAL, CHOICE_LITERAL,
		ENTRY_POINT_LITERAL, EXIT_POINT_LITERAL, TERMINATE_LITERAL,};

	/**
	 * A public read-only list of all the '<em><b>Pseudostate Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<PseudostateKind> VALUES = Collections
		.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Pseudostate Kind</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static PseudostateKind get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PseudostateKind result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Pseudostate Kind</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static PseudostateKind getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PseudostateKind result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Pseudostate Kind</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static PseudostateKind get(int value) {
		switch (value) {
			case INITIAL :
				return INITIAL_LITERAL;
			case DEEP_HISTORY :
				return DEEP_HISTORY_LITERAL;
			case SHALLOW_HISTORY :
				return SHALLOW_HISTORY_LITERAL;
			case JOIN :
				return JOIN_LITERAL;
			case FORK :
				return FORK_LITERAL;
			case JUNCTION :
				return JUNCTION_LITERAL;
			case CHOICE :
				return CHOICE_LITERAL;
			case ENTRY_POINT :
				return ENTRY_POINT_LITERAL;
			case EXIT_POINT :
				return EXIT_POINT_LITERAL;
			case TERMINATE :
				return TERMINATE_LITERAL;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private PseudostateKind(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
		return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}

} //PseudostateKind
