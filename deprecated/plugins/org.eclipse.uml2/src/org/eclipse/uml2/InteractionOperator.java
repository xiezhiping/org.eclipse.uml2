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
 * $Id: InteractionOperator.java,v 1.5 2005/04/04 20:11:15 khussey Exp $
 */
package org.eclipse.uml2;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.AbstractEnumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Interaction Operator</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * Interaction Operator is an enumeration designating the different kinds of operators of CombinedFragments. The InteractionOperand defines the type of operator of a CombinedFragment. 
 * <!-- end-model-doc -->
 * @see org.eclipse.uml2.UML2Package#getInteractionOperator()
 * @model
 * @generated
 */
public final class InteractionOperator extends AbstractEnumerator {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2003, 2005 IBM Corporation and others."; //$NON-NLS-1$

	/**
	 * The '<em><b>Seq</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
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
	 * @see #CONSIDER_LITERAL
	 * @model name="consider"
	 * @generated
	 * @ordered
	 */
	public static final int CONSIDER = 11;

	/**
	 * The '<em><b>Seq</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Seq</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SEQ
	 * @generated
	 * @ordered
	 */
	public static final InteractionOperator SEQ_LITERAL = new InteractionOperator(SEQ, "seq"); //$NON-NLS-1$

	/**
	 * The '<em><b>Alt</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Alt</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ALT
	 * @generated
	 * @ordered
	 */
	public static final InteractionOperator ALT_LITERAL = new InteractionOperator(ALT, "alt"); //$NON-NLS-1$

	/**
	 * The '<em><b>Opt</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Opt</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OPT
	 * @generated
	 * @ordered
	 */
	public static final InteractionOperator OPT_LITERAL = new InteractionOperator(OPT, "opt"); //$NON-NLS-1$

	/**
	 * The '<em><b>Break</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Break</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BREAK
	 * @generated
	 * @ordered
	 */
	public static final InteractionOperator BREAK_LITERAL = new InteractionOperator(BREAK, "break"); //$NON-NLS-1$

	/**
	 * The '<em><b>Par</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Par</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PAR
	 * @generated
	 * @ordered
	 */
	public static final InteractionOperator PAR_LITERAL = new InteractionOperator(PAR, "par"); //$NON-NLS-1$

	/**
	 * The '<em><b>Strict</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Strict</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #STRICT
	 * @generated
	 * @ordered
	 */
	public static final InteractionOperator STRICT_LITERAL = new InteractionOperator(STRICT, "strict"); //$NON-NLS-1$

	/**
	 * The '<em><b>Loop</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Loop</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LOOP
	 * @generated
	 * @ordered
	 */
	public static final InteractionOperator LOOP_LITERAL = new InteractionOperator(LOOP, "loop"); //$NON-NLS-1$

	/**
	 * The '<em><b>Critical</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Critical</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CRITICAL
	 * @generated
	 * @ordered
	 */
	public static final InteractionOperator CRITICAL_LITERAL = new InteractionOperator(CRITICAL, "critical"); //$NON-NLS-1$

	/**
	 * The '<em><b>Neg</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Neg</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NEG
	 * @generated
	 * @ordered
	 */
	public static final InteractionOperator NEG_LITERAL = new InteractionOperator(NEG, "neg"); //$NON-NLS-1$

	/**
	 * The '<em><b>Assert</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Assert</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ASSERT
	 * @generated
	 * @ordered
	 */
	public static final InteractionOperator ASSERT_LITERAL = new InteractionOperator(ASSERT, "assert"); //$NON-NLS-1$

	/**
	 * The '<em><b>Ignore</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Ignore</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #IGNORE
	 * @generated
	 * @ordered
	 */
	public static final InteractionOperator IGNORE_LITERAL = new InteractionOperator(IGNORE, "ignore"); //$NON-NLS-1$

	/**
	 * The '<em><b>Consider</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Consider</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CONSIDER
	 * @generated
	 * @ordered
	 */
	public static final InteractionOperator CONSIDER_LITERAL = new InteractionOperator(CONSIDER, "consider"); //$NON-NLS-1$

	/**
	 * An array of all the '<em><b>Interaction Operator</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final InteractionOperator[] VALUES_ARRAY =
		new InteractionOperator[] {
			SEQ_LITERAL,
			ALT_LITERAL,
			OPT_LITERAL,
			BREAK_LITERAL,
			PAR_LITERAL,
			STRICT_LITERAL,
			LOOP_LITERAL,
			CRITICAL_LITERAL,
			NEG_LITERAL,
			ASSERT_LITERAL,
			IGNORE_LITERAL,
			CONSIDER_LITERAL,
		};

	/**
	 * A public read-only list of all the '<em><b>Interaction Operator</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Interaction Operator</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static InteractionOperator get(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			InteractionOperator result = VALUES_ARRAY[i];
			if (result.toString().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Interaction Operator</b></em>' literal with the specified value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static InteractionOperator get(int value) {
		switch (value) {
			case SEQ: return SEQ_LITERAL;
			case ALT: return ALT_LITERAL;
			case OPT: return OPT_LITERAL;
			case BREAK: return BREAK_LITERAL;
			case PAR: return PAR_LITERAL;
			case STRICT: return STRICT_LITERAL;
			case LOOP: return LOOP_LITERAL;
			case CRITICAL: return CRITICAL_LITERAL;
			case NEG: return NEG_LITERAL;
			case ASSERT: return ASSERT_LITERAL;
			case IGNORE: return IGNORE_LITERAL;
			case CONSIDER: return CONSIDER_LITERAL;
		}
		return null;	
	}

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private InteractionOperator(int value, String name) {
		super(value, name);
	}

} //InteractionOperator
