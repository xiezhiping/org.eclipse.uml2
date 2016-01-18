/*
 * Copyright (c) 2006, 2016 IBM Corporation, CEA, and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *   Christian W. Damus (CEA) - 251963
 *   Kenn Hussey (CEA) - 418466, 451350, 485756
 *
 */
package org.eclipse.uml2.uml;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Interaction Operator Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * InteractionOperatorKind is an enumeration designating the different kinds of operators of CombinedFragments. The InteractionOperand defines the type of operator of a CombinedFragment.
 * <p>From package UML::Interactions.</p>
 * <!-- end-model-doc -->
 * @see org.eclipse.uml2.uml.UMLPackage#getInteractionOperatorKind()
 * @model
 * @generated
 */
public enum InteractionOperatorKind
	implements Enumerator {
	/**
	 * The '<em><b>Seq</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SEQ
	 * @generated
	 * @ordered
	 */
	SEQ_LITERAL(0, "seq", "seq"), //$NON-NLS-1$ //$NON-NLS-2$

	/**
	 * The '<em><b>Alt</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ALT
	 * @generated
	 * @ordered
	 */
	ALT_LITERAL(1, "alt", "alt"), //$NON-NLS-1$ //$NON-NLS-2$

	/**
	 * The '<em><b>Opt</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OPT
	 * @generated
	 * @ordered
	 */
	OPT_LITERAL(2, "opt", "opt"), //$NON-NLS-1$ //$NON-NLS-2$

	/**
	 * The '<em><b>Break</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BREAK
	 * @generated
	 * @ordered
	 */
	BREAK_LITERAL(3, "break", "break"), //$NON-NLS-1$ //$NON-NLS-2$

	/**
	 * The '<em><b>Par</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PAR
	 * @generated
	 * @ordered
	 */
	PAR_LITERAL(4, "par", "par"), //$NON-NLS-1$ //$NON-NLS-2$

	/**
	 * The '<em><b>Strict</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STRICT
	 * @generated
	 * @ordered
	 */
	STRICT_LITERAL(5, "strict", "strict"), //$NON-NLS-1$ //$NON-NLS-2$

	/**
	 * The '<em><b>Loop</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LOOP
	 * @generated
	 * @ordered
	 */
	LOOP_LITERAL(6, "loop", "loop"), //$NON-NLS-1$ //$NON-NLS-2$

	/**
	 * The '<em><b>Critical</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CRITICAL
	 * @generated
	 * @ordered
	 */
	CRITICAL_LITERAL(7, "critical", "critical"), //$NON-NLS-1$ //$NON-NLS-2$

	/**
	 * The '<em><b>Neg</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NEG
	 * @generated
	 * @ordered
	 */
	NEG_LITERAL(8, "neg", "neg"), //$NON-NLS-1$ //$NON-NLS-2$

	/**
	 * The '<em><b>Assert</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ASSERT
	 * @generated
	 * @ordered
	 */
	ASSERT_LITERAL(9, "assert", "assert"), //$NON-NLS-1$ //$NON-NLS-2$

	/**
	 * The '<em><b>Ignore</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IGNORE
	 * @generated
	 * @ordered
	 */
	IGNORE_LITERAL(10, "ignore", "ignore"), //$NON-NLS-1$ //$NON-NLS-2$

	/**
	 * The '<em><b>Consider</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONSIDER
	 * @generated
	 * @ordered
	 */
	CONSIDER_LITERAL(11, "consider", "consider"); //$NON-NLS-1$ //$NON-NLS-2$

	/**
	 * The '<em><b>Seq</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The InteractionOperatorKind seq designates that the CombinedFragment represents a weak sequencing between the behaviors of the operands.
	 * <!-- end-model-doc -->
	 * @see #SEQ_LITERAL
	 * @model name="seq"
	 * @generated
	 * @ordered
	 */
	public static final int SEQ = 0;

	/**
	 * The '<em><b>Alt</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The InteractionOperatorKind alt designates that the CombinedFragment represents a choice of behavior. At most one of the operands will be chosen. The chosen operand must have an explicit or implicit guard expression that evaluates to true at this point in the interaction. An implicit true guard is implied if the operand has no guard.
	 * <!-- end-model-doc -->
	 * @see #ALT_LITERAL
	 * @model name="alt"
	 * @generated
	 * @ordered
	 */
	public static final int ALT = 1;

	/**
	 * The '<em><b>Opt</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The InteractionOperatorKind opt designates that the CombinedFragment represents a choice of behavior where either the (sole) operand happens or nothing happens. An option is semantically equivalent to an alternative CombinedFragment where there is one operand with non-empty content and the second operand is empty.
	 * <!-- end-model-doc -->
	 * @see #OPT_LITERAL
	 * @model name="opt"
	 * @generated
	 * @ordered
	 */
	public static final int OPT = 2;

	/**
	 * The '<em><b>Break</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The InteractionOperatorKind break designates that the CombinedFragment represents a breaking scenario in the sense that the operand is a scenario that is performed instead of the remainder of the enclosing InteractionFragment. A break operator with a guard is chosen when the guard is true and the rest of the enclosing Interaction Fragment is ignored. When the guard of the break operand is false, the break operand is ignored and the rest of the enclosing InteractionFragment is chosen. The choice between a break operand without a guard and the rest of the enclosing InteractionFragment is done non-deterministically.
	 * <!-- end-model-doc -->
	 * @see #BREAK_LITERAL
	 * @model name="break"
	 * @generated
	 * @ordered
	 */
	public static final int BREAK = 3;

	/**
	 * The '<em><b>Par</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The InteractionOperatorKind par designates that the CombinedFragment represents a parallel merge between the behaviors of the operands. The OccurrenceSpecifications of the different operands can be interleaved in any way as long as the ordering imposed by each operand as such is preserved.
	 * <!-- end-model-doc -->
	 * @see #PAR_LITERAL
	 * @model name="par"
	 * @generated
	 * @ordered
	 */
	public static final int PAR = 4;

	/**
	 * The '<em><b>Strict</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The InteractionOperatorKind strict designates that the CombinedFragment represents a strict sequencing between the behaviors of the operands. The semantics of strict sequencing defines a strict ordering of the operands on the first level within the CombinedFragment with interactionOperator strict. Therefore OccurrenceSpecifications within contained CombinedFragment will not directly be compared with other OccurrenceSpecifications of the enclosing CombinedFragment.
	 * <!-- end-model-doc -->
	 * @see #STRICT_LITERAL
	 * @model name="strict"
	 * @generated
	 * @ordered
	 */
	public static final int STRICT = 5;

	/**
	 * The '<em><b>Loop</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The InteractionOperatorKind loop designates that the CombinedFragment represents a loop. The loop operand will be repeated a number of times.
	 * <!-- end-model-doc -->
	 * @see #LOOP_LITERAL
	 * @model name="loop"
	 * @generated
	 * @ordered
	 */
	public static final int LOOP = 6;

	/**
	 * The '<em><b>Critical</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The InteractionOperatorKind critical designates that the CombinedFragment represents a critical region. A critical region means that the traces of the region cannot be interleaved by other OccurrenceSpecifications (on those Lifelines covered by the region). This means that the region is treated atomically by the enclosing fragment when determining the set of valid traces. Even though enclosing CombinedFragments may imply that some OccurrenceSpecifications may interleave into the region, such as with par-operator, this is prevented by defining a region.
	 * <!-- end-model-doc -->
	 * @see #CRITICAL_LITERAL
	 * @model name="critical"
	 * @generated
	 * @ordered
	 */
	public static final int CRITICAL = 7;

	/**
	 * The '<em><b>Neg</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The InteractionOperatorKind neg designates that the CombinedFragment represents traces that are defined to be invalid.
	 * <!-- end-model-doc -->
	 * @see #NEG_LITERAL
	 * @model name="neg"
	 * @generated
	 * @ordered
	 */
	public static final int NEG = 8;

	/**
	 * The '<em><b>Assert</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The InteractionOperatorKind assert designates that the CombinedFragment represents an assertion. The sequences of the operand of the assertion are the only valid continuations. All other continuations result in an invalid trace.
	 * <!-- end-model-doc -->
	 * @see #ASSERT_LITERAL
	 * @model name="assert"
	 * @generated
	 * @ordered
	 */
	public static final int ASSERT = 9;

	/**
	 * The '<em><b>Ignore</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The InteractionOperatorKind ignore designates that there are some message types that are not shown within this combined fragment. These message types can be considered insignificant and are implicitly ignored if they appear in a corresponding execution. Alternatively, one can understand ignore to mean that the message types that are ignored can appear anywhere in the traces.
	 * <!-- end-model-doc -->
	 * @see #IGNORE_LITERAL
	 * @model name="ignore"
	 * @generated
	 * @ordered
	 */
	public static final int IGNORE = 10;

	/**
	 * The '<em><b>Consider</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The InteractionOperatorKind consider designates which messages should be considered within this combined fragment. This is equivalent to defining every other message to be ignored.
	 * <!-- end-model-doc -->
	 * @see #CONSIDER_LITERAL
	 * @model name="consider"
	 * @generated
	 * @ordered
	 */
	public static final int CONSIDER = 11;

	/**
	 * An array of all the '<em><b>Interaction Operator Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final InteractionOperatorKind[] VALUES_ARRAY = new InteractionOperatorKind[]{
		SEQ_LITERAL, ALT_LITERAL, OPT_LITERAL, BREAK_LITERAL, PAR_LITERAL,
		STRICT_LITERAL, LOOP_LITERAL, CRITICAL_LITERAL, NEG_LITERAL,
		ASSERT_LITERAL, IGNORE_LITERAL, CONSIDER_LITERAL,};

	/**
	 * A public read-only list of all the '<em><b>Interaction Operator Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<InteractionOperatorKind> VALUES = Collections
		.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Interaction Operator Kind</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static InteractionOperatorKind get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			InteractionOperatorKind result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Interaction Operator Kind</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static InteractionOperatorKind getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			InteractionOperatorKind result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Interaction Operator Kind</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static InteractionOperatorKind get(int value) {
		switch (value) {
			case SEQ :
				return SEQ_LITERAL;
			case ALT :
				return ALT_LITERAL;
			case OPT :
				return OPT_LITERAL;
			case BREAK :
				return BREAK_LITERAL;
			case PAR :
				return PAR_LITERAL;
			case STRICT :
				return STRICT_LITERAL;
			case LOOP :
				return LOOP_LITERAL;
			case CRITICAL :
				return CRITICAL_LITERAL;
			case NEG :
				return NEG_LITERAL;
			case ASSERT :
				return ASSERT_LITERAL;
			case IGNORE :
				return IGNORE_LITERAL;
			case CONSIDER :
				return CONSIDER_LITERAL;
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
	private InteractionOperatorKind(int value, String name, String literal) {
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

} //InteractionOperatorKind
