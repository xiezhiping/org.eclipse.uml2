/*
 * Copyright (c) 2005, 2007 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *
 * $Id: ValueSpecificationOperations.java,v 1.11 2007/05/03 21:11:52 khussey Exp $
 */
package org.eclipse.uml2.uml.internal.operations;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.uml2.uml.Duration;
import org.eclipse.uml2.uml.Enumeration;
import org.eclipse.uml2.uml.InstanceSpecification;
import org.eclipse.uml2.uml.InstanceValue;
import org.eclipse.uml2.uml.LiteralBoolean;
import org.eclipse.uml2.uml.LiteralInteger;
import org.eclipse.uml2.uml.LiteralString;
import org.eclipse.uml2.uml.LiteralUnlimitedNatural;
import org.eclipse.uml2.uml.OpaqueExpression;
import org.eclipse.uml2.uml.ParameterableElement;
import org.eclipse.uml2.uml.TimeExpression;
import org.eclipse.uml2.uml.Type;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.ValueSpecification;
import org.eclipse.uml2.uml.util.UMLSwitch;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Value Specification</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.ValueSpecification#isComputable() <em>Is Computable</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.ValueSpecification#integerValue() <em>Integer Value</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.ValueSpecification#booleanValue() <em>Boolean Value</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.ValueSpecification#stringValue() <em>String Value</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.ValueSpecification#unlimitedValue() <em>Unlimited Value</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.ValueSpecification#isNull() <em>Is Null</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.ValueSpecification#isCompatibleWith(org.eclipse.uml2.uml.ParameterableElement) <em>Is Compatible With</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ValueSpecificationOperations
		extends NamedElementOperations {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ValueSpecificationOperations() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The query isComputable() determines whether a value specification can be computed in a model. This operation cannot be fully defined in OCL. A conforming implementation is expected to deliver true for this operation for all value specifications that it can compute, and to compute all of those for which the operation is true. A conforming implementation is expected to be able to compute the value of all literals.
	 * result = false
	 * @param valueSpecification The receiving '<em><b>Value Specification</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static boolean isComputable(ValueSpecification valueSpecification) {
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The query integerValue() gives a single Integer value when one can be computed.
	 * result = Set{}
	 * @param valueSpecification The receiving '<em><b>Value Specification</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static int integerValue(ValueSpecification valueSpecification) {
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The query booleanValue() gives a single Boolean value when one can be computed.
	 * result = Set{}
	 * @param valueSpecification The receiving '<em><b>Value Specification</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static boolean booleanValue(ValueSpecification valueSpecification) {
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The query stringValue() gives a single String value when one can be computed.
	 * result = Set{}
	 * @param valueSpecification The receiving '<em><b>Value Specification</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static String stringValue(ValueSpecification valueSpecification) {
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The query unlimitedValue() gives a single UnlimitedNatural value when one can be computed.
	 * result = Set{}
	 * @param valueSpecification The receiving '<em><b>Value Specification</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static int unlimitedValue(ValueSpecification valueSpecification) {
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The query isNull() returns true when it can be computed that the value is null.
	 * result = false
	 * @param valueSpecification The receiving '<em><b>Value Specification</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static boolean isNull(ValueSpecification valueSpecification) {
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The query isCompatibleWith() determines if this parameterable element is compatible with the specified parameterable element. By default parameterable element P is compatible with parameterable element Q if the kind of P is the same or a subtype as the kind of Q. In addition, for ValueSpecification, the type must be conformant with the type of the specified parameterable element.
	 * 
	 * result = p->oclIsKindOf(self.oclType) and self.type.conformsTo(p.oclAsType(TypedElement).type)
	 * @param valueSpecification The receiving '<em><b>Value Specification</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static boolean isCompatibleWith(
			ValueSpecification valueSpecification, ParameterableElement p) {

		if (valueSpecification.eClass().isInstance(p)) {
			Type type = valueSpecification.getType();

			return type == null
				? ((ValueSpecification) p).eGet(
					UMLPackage.Literals.TYPED_ELEMENT__TYPE, false) == null
				: type.conformsTo(((ValueSpecification) p).getType());
		}

		return false;
	}

	protected static void setValue(ValueSpecification valueSpecification,
			final String newValue) {
		new UMLSwitch<Object>() {

			@Override
			public Object caseDuration(Duration duration) {
				ValueSpecification expr = duration.getExpr();
				return expr == null || expr instanceof Duration
					? null
					: doSwitch(expr);
			}

			@Override
			public Object caseInstanceValue(InstanceValue instanceValue) {
				Type type = instanceValue.getType();

				if (type instanceof Enumeration) {
					instanceValue.setInstance(((Enumeration) type)
						.getOwnedLiteral(newValue));
				} else {
					InstanceSpecification instance = instanceValue
						.getInstance();

					if (instance != null) {
						ValueSpecification specification = instance
							.getSpecification();

						if (specification != null) {
							return doSwitch(specification);
						}
					}

					return null;
				}

				return instanceValue;
			}

			@Override
			public Object caseLiteralBoolean(LiteralBoolean literalBoolean) {
				literalBoolean.setValue(Boolean.valueOf(newValue)
					.booleanValue());
				return literalBoolean;
			}

			@Override
			public Object caseLiteralInteger(LiteralInteger literalInteger) {
				literalInteger.setValue(Integer.parseInt(newValue));
				return literalInteger;
			}

			@Override
			public Object caseLiteralString(LiteralString literalString) {
				literalString.setValue(newValue);
				return literalString;
			}

			@Override
			public Object caseLiteralUnlimitedNatural(
					LiteralUnlimitedNatural literalUnlimitedNatural) {
				literalUnlimitedNatural.setValue(Integer.parseInt(newValue));
				return literalUnlimitedNatural;
			}

			@Override
			public Object caseOpaqueExpression(OpaqueExpression opaqueExpression) {
				EList<String> bodies = opaqueExpression.getBodies();

				if (bodies.isEmpty()) {
					bodies.add(newValue);
				} else {
					bodies.set(0, newValue);
				}

				return opaqueExpression;
			}

			@Override
			public Object caseTimeExpression(TimeExpression timeExpression) {
				ValueSpecification expr = timeExpression.getExpr();
				return expr == null || expr instanceof TimeExpression
					? null
					: doSwitch(expr);
			}

			@Override
			public Object defaultCase(EObject eObject) {
				throw new UnsupportedOperationException();
			}
		}.doSwitch(valueSpecification);
	}

} // ValueSpecificationOperations
