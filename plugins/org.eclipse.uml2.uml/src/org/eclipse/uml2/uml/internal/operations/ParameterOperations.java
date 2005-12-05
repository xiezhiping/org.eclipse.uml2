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
 * $Id: ParameterOperations.java,v 1.7 2005/12/05 20:47:30 khussey Exp $
 */
package org.eclipse.uml2.uml.internal.operations;

import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EObject;

import org.eclipse.uml2.uml.Enumeration;
import org.eclipse.uml2.uml.InstanceSpecification;
import org.eclipse.uml2.uml.InstanceValue;
import org.eclipse.uml2.uml.LiteralBoolean;
import org.eclipse.uml2.uml.LiteralInteger;
import org.eclipse.uml2.uml.LiteralString;
import org.eclipse.uml2.uml.LiteralUnlimitedNatural;
import org.eclipse.uml2.uml.OpaqueExpression;
import org.eclipse.uml2.uml.Parameter;
import org.eclipse.uml2.uml.Type;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.ValueSpecification;

import org.eclipse.uml2.uml.internal.impl.ParameterImpl;
import org.eclipse.uml2.uml.util.UMLSwitch;
import org.eclipse.uml2.uml.util.UMLValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Parameter</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.Parameter#validateConnectorEnd(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Connector End</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Parameter#validateStreamAndException(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Stream And Exception</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Parameter#validateNotException(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Not Exception</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Parameter#validateReentrantBehaviors(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reentrant Behaviors</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Parameter#validateInAndOut(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate In And Out</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Parameter#getDefault() <em>Get Default</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Parameter#setDefault(java.lang.String) <em>Set Default</em>}</li>
 * </ul>
 * </p>
 *
 * @generated not
 */
public final class ParameterOperations
		extends UMLOperations {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private ParameterOperations() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A parameter may only be associated with a connector end within the context of a collaboration.
	 * self.end.notEmpty() implies self.collaboration.notEmpty()
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateConnectorEnd(Parameter parameter,
			DiagnosticChain diagnostics, Map context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics
					.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						UMLValidator.DIAGNOSTIC_SOURCE,
						UMLValidator.PARAMETER__CONNECTOR_END,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE
							.getString(
								"_UI_GenericInvariant_diagnostic", new Object[]{"validateConnectorEnd", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(parameter, context)}), //$NON-NLS-1$ //$NON-NLS-2$
						new Object[]{parameter}));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A parameter cannot be a stream and exception at the same time.
	 * true
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateStreamAndException(Parameter parameter,
			DiagnosticChain diagnostics, Map context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics
					.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						UMLValidator.DIAGNOSTIC_SOURCE,
						UMLValidator.PARAMETER__STREAM_AND_EXCEPTION,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE
							.getString(
								"_UI_GenericInvariant_diagnostic", new Object[]{"validateStreamAndException", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(parameter, context)}), //$NON-NLS-1$ //$NON-NLS-2$
						new Object[]{parameter}));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An input parameter cannot be an exception.
	 * true
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateNotException(Parameter parameter,
			DiagnosticChain diagnostics, Map context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics
					.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						UMLValidator.DIAGNOSTIC_SOURCE,
						UMLValidator.PARAMETER__NOT_EXCEPTION,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE
							.getString(
								"_UI_GenericInvariant_diagnostic", new Object[]{"validateNotException", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(parameter, context)}), //$NON-NLS-1$ //$NON-NLS-2$
						new Object[]{parameter}));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Reentrant behaviors cannot have stream parameters.
	 * true
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateReentrantBehaviors(Parameter parameter,
			DiagnosticChain diagnostics, Map context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics
					.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						UMLValidator.DIAGNOSTIC_SOURCE,
						UMLValidator.PARAMETER__REENTRANT_BEHAVIORS,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE
							.getString(
								"_UI_GenericInvariant_diagnostic", new Object[]{"validateReentrantBehaviors", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(parameter, context)}), //$NON-NLS-1$ //$NON-NLS-2$
						new Object[]{parameter}));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Only in and inout parameters may have a delete effect. Only out, inout, and return parameters may have a create effect.
	 * true
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateInAndOut(Parameter parameter,
			DiagnosticChain diagnostics, Map context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics
					.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						UMLValidator.DIAGNOSTIC_SOURCE,
						UMLValidator.PARAMETER__IN_AND_OUT,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE
							.getString(
								"_UI_GenericInvariant_diagnostic", new Object[]{"validateInAndOut", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(parameter, context)}), //$NON-NLS-1$ //$NON-NLS-2$
						new Object[]{parameter}));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public static String getDefault(Parameter parameter) {
		ValueSpecification defaultValue = parameter.getDefaultValue();

		if (defaultValue != null) {
			return defaultValue.stringValue();
		} else {
			ParameterImpl parameterImpl = (ParameterImpl) parameter;
			return (String) parameterImpl
				.eVirtualGet(
					parameterImpl
						.eDerivedStructuralFeatureID(UMLPackage.Literals.PARAMETER__DEFAULT),
					EMPTY_STRING);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public static void setDefault(final Parameter parameter,
			final String newDefault) {
		ValueSpecification defaultValue = parameter.getDefaultValue();

		if (defaultValue != null) {
			new UMLSwitch() {

				public Object caseInstanceValue(InstanceValue instanceValue) {
					Type type = parameter.getType();

					if (type instanceof Enumeration) {
						instanceValue.setInstance(((Enumeration) type)
							.getOwnedLiteral(newDefault));
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

						throw new IllegalArgumentException(newDefault);
					}

					return instanceValue;
				}

				public Object caseLiteralBoolean(LiteralBoolean literalBoolean) {
					literalBoolean.setValue(Boolean.getBoolean(newDefault));
					return literalBoolean;
				}

				public Object caseLiteralInteger(LiteralInteger literalInteger) {
					literalInteger.setValue(Integer.parseInt(newDefault));
					return literalInteger;
				}

				public Object caseLiteralString(LiteralString literalString) {
					literalString.setValue(newDefault);
					return literalString;
				}

				public Object caseLiteralUnlimitedNatural(
						LiteralUnlimitedNatural literalUnlimitedNatural) {
					literalUnlimitedNatural.setValue(Integer
						.parseInt(newDefault));
					return literalUnlimitedNatural;
				}

				public Object caseOpaqueExpression(
						OpaqueExpression opaqueExpression) {
					List bodies = opaqueExpression.getBodies();

					if (bodies.isEmpty()) {
						bodies.add(newDefault);
					} else {
						bodies.set(0, newDefault);
					}

					return opaqueExpression;
				}

				public Object defaultCase(EObject eObject) {
					throw new IllegalArgumentException(newDefault);
				}
			}.doSwitch(defaultValue);
		} else {
			ParameterImpl parameterImpl = (ParameterImpl) parameter;
			parameterImpl
				.eVirtualSet(
					parameterImpl
						.eDerivedStructuralFeatureID(UMLPackage.Literals.PARAMETER__DEFAULT),
					newDefault);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static boolean isSetDefault(Parameter parameter) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void unsetDefault(Parameter parameter) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

} // ParameterOperations