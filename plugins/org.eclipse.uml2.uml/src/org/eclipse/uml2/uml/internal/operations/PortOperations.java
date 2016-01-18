/*
 * Copyright (c) 2005, 2016 IBM Corporation, CEA, and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *   Kenn Hussey - 323181
 *   Kenn Hussey (CEA) - 327039, 351774, 418466, 451350, 485756
 *
 */
package org.eclipse.uml2.uml.internal.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ECollections;
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
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.Port#validatePortAggregation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Port Aggregation</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Port#validateDefaultValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Default Value</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Port#validateEncapsulatedOwner(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encapsulated Owner</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Port#getProvideds() <em>Get Provideds</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Port#getRequireds() <em>Get Requireds</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Port#basicProvided() <em>Basic Provided</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Port#basicRequired() <em>Basic Required</em>}</li>
 * </ul>
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
	 * Port.aggregation must be composite.
	 * aggregation = AggregationKind::composite
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
					UMLValidator.PORT__PORT_AGGREGATION,
					UMLPlugin.INSTANCE.getString(
						"_UI_Port_PortAggregation_diagnostic", //$NON-NLS-1$
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
	 * A defaultValue for port cannot be specified when the type of the Port is an Interface.
	 * type.oclIsKindOf(Interface) implies defaultValue->isEmpty()
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
					UMLValidator.PORT__DEFAULT_VALUE,
					UMLPlugin.INSTANCE.getString(
						"_UI_Port_DefaultValue_diagnostic", //$NON-NLS-1$
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
	 * All Ports are owned by an EncapsulatedClassifier.
	 * owner = encapsulatedClassifier
	 * @param port The receiving '<em><b>Port</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateEncapsulatedOwner(Port port,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(Diagnostic.ERROR,
					UMLValidator.DIAGNOSTIC_SOURCE,
					UMLValidator.PORT__ENCAPSULATED_OWNER,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic", //$NON-NLS-1$
						new Object[]{"validateEncapsulatedOwner", //$NON-NLS-1$
							org.eclipse.emf.ecore.util.EObjectValidator
								.getObjectLabel(port, context)}),
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
	 * Derivation for Port::/provided
	 * result = (if isConjugated then basicRequired() else basicProvided() endif)
	 * <p>From package UML::StructuredClassifiers.</p>
	 * @param port The receiving '<em><b>Port</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static EList<Interface> getProvideds(Port port) {
		EList<Interface> provideds = port.isConjugated()
			? basicRequired(port, false)
			: basicProvided(port, false);

		return new UnionEObjectEList<Interface>((InternalEObject) port,
			UMLPackage.Literals.PORT__PROVIDED, provideds.size(),
			provideds.toArray());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Derivation for Port::/required
	 * result = (if isConjugated then basicProvided() else basicRequired() endif)
	 * <p>From package UML::StructuredClassifiers.</p>
	 * @param port The receiving '<em><b>Port</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static EList<Interface> getRequireds(Port port) {
		EList<Interface> requireds = port.isConjugated()
			? basicProvided(port, false)
			: basicRequired(port, false);

		return new UnionEObjectEList<Interface>((InternalEObject) port,
			UMLPackage.Literals.PORT__REQUIRED, requireds.size(),
			requireds.toArray());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The union of the sets of Interfaces realized by the type of the Port and its supertypes, or directly the type of the Port if the Port is typed by an Interface.
	 * result = (if type.oclIsKindOf(Interface) 
	 * then type.oclAsType(Interface)->asSet() 
	 * else type.oclAsType(Classifier).allRealizedInterfaces() 
	 * endif)
	 * <p>From package UML::StructuredClassifiers.</p>
	 * @param port The receiving '<em><b>Port</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static EList<Interface> basicProvided(Port port) {
		return ECollections.unmodifiableEList(basicProvided(port, true));
	}

	protected static EList<Interface> basicProvided(Port port,
			boolean resolve) {
		return basicProvided(port, resolve,
			new UniqueEList.FastCompare<Interface>());
	}

	protected static EList<Interface> basicProvided(Port port, boolean resolve,
			EList<Interface> provided) {
		Type type = (Type) port.eGet(UMLPackage.Literals.TYPED_ELEMENT__TYPE,
			resolve);

		if (type instanceof Interface) {
			provided.add((Interface) type);
		} else if (type instanceof Classifier) {
			Classifier classifier = (Classifier) port.getType(); // must resolve
			ClassifierOperations.allRealizedInterfaces(classifier, false,
				provided);
		}

		return provided;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The union of the sets of Interfaces used by the type of the Port and its supertypes.
	 * result = ( type.oclAsType(Classifier).allUsedInterfaces() )
	 * <p>From package UML::StructuredClassifiers.</p>
	 * @param port The receiving '<em><b>Port</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static EList<Interface> basicRequired(Port port) {
		return ECollections.unmodifiableEList(basicRequired(port, true));
	}

	protected static EList<Interface> basicRequired(Port port,
			boolean resolve) {
		return basicRequired(port, resolve,
			new UniqueEList.FastCompare<Interface>());
	}

	protected static EList<Interface> basicRequired(Port port, boolean resolve,
			EList<Interface> required) {
		Type type = (Type) port.eGet(UMLPackage.Literals.TYPED_ELEMENT__TYPE,
			resolve);

		if (type instanceof Classifier) {
			Classifier classifier = (Classifier) port.getType(); // must resolve
			ClassifierOperations.allUsedInterfaces(classifier, resolve,
				required);
		}

		return required;
	}

} // PortOperations