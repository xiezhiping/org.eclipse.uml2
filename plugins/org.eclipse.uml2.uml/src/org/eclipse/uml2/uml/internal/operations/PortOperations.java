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
 * $Id: PortOperations.java,v 1.6 2005/12/14 22:34:27 khussey Exp $
 */
package org.eclipse.uml2.uml.internal.operations;

import java.util.Iterator;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.common.util.UniqueEList;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.uml2.common.util.UnionEObjectEList;
import org.eclipse.uml2.uml.BehavioredClassifier;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.Dependency;
import org.eclipse.uml2.uml.Interface;
import org.eclipse.uml2.uml.InterfaceRealization;
import org.eclipse.uml2.uml.Port;
import org.eclipse.uml2.uml.Type;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.Usage;

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
 * @generated not
 */
public final class PortOperations
		extends UMLOperations {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private PortOperations() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The required interfaces of a port must be provided by elements to which the port is connected.
	 * true
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateRequiredInterfaces(Port port,
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
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validatePortAggregation(Port port,
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
						UMLValidator.PORT__PORT_AGGREGATION,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE
							.getString(
								"_UI_GenericInvariant_diagnostic", new Object[]{"validatePortAggregation", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(port, context)}), //$NON-NLS-1$ //$NON-NLS-2$
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
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validatePortDestroyed(Port port,
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
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateDefaultValue(Port port,
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
						UMLValidator.PORT__DEFAULT_VALUE,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE
							.getString(
								"_UI_GenericInvariant_diagnostic", new Object[]{"validateDefaultValue", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(port, context)}), //$NON-NLS-1$ //$NON-NLS-2$
						new Object[]{port}));
			}
			return false;
		}
		return true;
	}

	protected static EList getImplementedInterfaces(
			BehavioredClassifier behavioredClassifier,
			EList implementedInterfaces) {

		for (Iterator interfaceRealizations = behavioredClassifier
			.getInterfaceRealizations().iterator(); interfaceRealizations
			.hasNext();) {

			Interface contract = (Interface) ((InterfaceRealization) interfaceRealizations
				.next()).eGet(
				UMLPackage.Literals.INTERFACE_REALIZATION__CONTRACT, false);

			if (contract != null) {
				implementedInterfaces.add(contract);
			}
		}
		return implementedInterfaces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public static EList getProvideds(Port port) {
		EList provideds = new UniqueEList();

		Type type = (Type) port.eGet(UMLPackage.Literals.TYPED_ELEMENT__TYPE,
			false);

		if (type instanceof Interface) {
			provideds.add(type);
		} else if (type instanceof BehavioredClassifier) {
			BehavioredClassifier behavioredClassifier = (BehavioredClassifier) port
				.getType();

			getImplementedInterfaces(behavioredClassifier, provideds);

			for (Iterator allParents = behavioredClassifier.allParents()
				.iterator(); allParents.hasNext();) {

				Classifier parent = (Classifier) allParents.next();

				if (parent instanceof BehavioredClassifier) {
					getImplementedInterfaces((BehavioredClassifier) parent,
						provideds);
				}
			}
		}

		return new UnionEObjectEList((InternalEObject) port,
			UMLPackage.Literals.PORT__PROVIDED, provideds.size(), provideds
				.toArray());
	}

	protected static EList getUsedInterfaces(Classifier classifier,
			EList usedInterfaces) {

		for (Iterator clientDependencies = classifier.getClientDependencies()
			.iterator(); clientDependencies.hasNext();) {

			Dependency dependency = (Dependency) clientDependencies.next();

			if (dependency instanceof Usage) {

				for (Iterator suppliers = ((InternalEList) dependency
					.getSuppliers()).basicIterator(); suppliers.hasNext();) {

					Object supplier = suppliers.next();

					if (supplier instanceof Interface) {
						usedInterfaces.add(supplier);
					}
				}
			}
		}

		return usedInterfaces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public static EList getRequireds(Port port) {
		EList requireds = new UniqueEList();

		Type type = port.getType();

		if (type instanceof Classifier && !(type instanceof Interface)) {
			Classifier classifier = (Classifier) type;

			getUsedInterfaces(classifier, requireds);

			for (Iterator allParents = classifier.allParents().iterator(); allParents
				.hasNext();) {

				getUsedInterfaces((Classifier) allParents.next(), requireds);
			}
		}

		return new UnionEObjectEList((InternalEObject) port,
			UMLPackage.Literals.PORT__REQUIRED, requireds.size(), requireds
				.toArray());
	}

} // PortOperations