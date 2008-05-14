/*
 * Copyright (c) 2005, 2008 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *
 * $Id: PortOperations.java,v 1.17 2008/05/14 15:18:40 jbruck Exp $
 */
package org.eclipse.uml2.uml.internal.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.UniqueEList;

import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.uml2.common.util.UnionEObjectEList;

import org.eclipse.uml2.uml.AggregationKind;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.Interface;
import org.eclipse.uml2.uml.Port;
import org.eclipse.uml2.uml.Type;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.UMLPlugin;

import org.eclipse.uml2.uml.util.UMLValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Port</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.Port#validateRequiredInterfaces(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Required Interfaces</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Port#validatePortAggregation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Port Aggregation</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Port#validatePortDestroyed(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Port Destroyed</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Port#validateDefaultValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Default Value</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Port#getProvideds() <em>Get Provideds</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Port#getRequireds() <em>Get Requireds</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PortOperations
		extends PropertyOperations {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PortOperations() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The required interfaces of a port must be provided by elements to which the port is connected.
	 * true
	 * @param port The receiving '<em><b>Port</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateRequiredInterfaces(Port port,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						UMLValidator.PORT__REQUIRED_INTERFACES,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE
							.getString(
								"_UI_GenericInvariant_diagnostic", new Object[]{"validateRequiredInterfaces", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(port, context)}), //$NON-NLS-1$ //$NON-NLS-2$
						new Object[]{port}));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Port.aggregation must be composite.
	 * true
	 * @param port The receiving '<em><b>Port</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static boolean validatePortAggregation(Port port,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (port.getAggregation() != AggregationKind.COMPOSITE_LITERAL) {

			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(Diagnostic.WARNING,
					UMLValidator.DIAGNOSTIC_SOURCE,
					UMLValidator.PORT__PORT_AGGREGATION, UMLPlugin.INSTANCE
						.getString("_UI_Port_PortAggregation_diagnostic", //$NON-NLS-1$
							getMessageSubstitutions(context, port)),
					new Object[]{port}));
			}

			return false;
		}

		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * When a port is destroyed, all connectors attached to this port will be destroyed also.
	 * true
	 * @param port The receiving '<em><b>Port</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validatePortDestroyed(Port port,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						UMLValidator.PORT__PORT_DESTROYED,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE
							.getString(
								"_UI_GenericInvariant_diagnostic", new Object[]{"validatePortDestroyed", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(port, context)}), //$NON-NLS-1$ //$NON-NLS-2$
						new Object[]{port}));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A defaultValue for port cannot be specified when the type of the Port is an Interface
	 * true
	 * @param port The receiving '<em><b>Port</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static boolean validateDefaultValue(Port port,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (port.getType() instanceof Interface
			&& port.getDefaultValue() != null) {

			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(Diagnostic.WARNING,
					UMLValidator.DIAGNOSTIC_SOURCE,
					UMLValidator.PORT__DEFAULT_VALUE, UMLPlugin.INSTANCE
						.getString("_UI_Port_DefaultValue_diagnostic", //$NON-NLS-1$
							getMessageSubstitutions(context, port)),
					new Object[]{port}));
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
	public static EList<Interface> getProvideds(Port port) {
		EList<Interface> provideds = new UniqueEList.FastCompare<Interface>();
		Type type = (Type) port.eGet(UMLPackage.Literals.TYPED_ELEMENT__TYPE,
			false);

		if (type instanceof Interface) {
			provideds.add((Interface) type);
		} else if (type instanceof Classifier) {
			Classifier classifier = (Classifier) port.getType();
			ComponentOperations.realizedInterfaces(null, classifier, false,
				provideds);

			for (Classifier parent : classifier.allParents()) {

				ComponentOperations.realizedInterfaces(null, parent, false,
					provideds);
			}
		}

		return new UnionEObjectEList<Interface>((InternalEObject) port,
			UMLPackage.Literals.PORT__PROVIDED, provideds.size(), provideds
				.toArray());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public static EList<Interface> getRequireds(Port port) {
		EList<Interface> requireds = new UniqueEList.FastCompare<Interface>();
		Type type = (Type) port.eGet(UMLPackage.Literals.TYPED_ELEMENT__TYPE,
			false);

		if (type instanceof Classifier) {
			Classifier classifier = (Classifier) port.getType();
			ComponentOperations.usedInterfaces(null, classifier, false,
				requireds);

			for (Classifier parent : classifier.allParents()) {
				ComponentOperations.usedInterfaces(null, parent, false,
					requireds);
			}
		}

		return new UnionEObjectEList<Interface>((InternalEObject) port,
			UMLPackage.Literals.PORT__REQUIRED, requireds.size(), requireds
				.toArray());
	}

} // PortOperations