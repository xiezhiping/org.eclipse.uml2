/*
 * Copyright (c) 2005, 2016 IBM Corporation, CEA, and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *   Kenn Hussey (CEA) - 327039, 351774, 418466, 451350, 485756
 *
 */
package org.eclipse.uml2.uml.internal.operations;

import java.util.Map;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.common.util.UniqueEList;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.uml2.common.util.UnionEObjectEList;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.Component;
import org.eclipse.uml2.uml.EncapsulatedClassifier;
import org.eclipse.uml2.uml.Enumeration;
import org.eclipse.uml2.uml.ComponentRealization;
import org.eclipse.uml2.uml.Interface;
import org.eclipse.uml2.uml.PrimitiveType;
import org.eclipse.uml2.uml.util.UMLValidator;
import org.eclipse.uml2.uml.Port;
import org.eclipse.uml2.uml.UMLPackage;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Component</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.Component#validateNoNestedClassifiers(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate No Nested Classifiers</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Component#validateNoPackagedElements(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate No Packaged Elements</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Component#createOwnedClass(java.lang.String, boolean) <em>Create Owned Class</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Component#createOwnedEnumeration(java.lang.String) <em>Create Owned Enumeration</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Component#createOwnedInterface(java.lang.String) <em>Create Owned Interface</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Component#createOwnedPrimitiveType(java.lang.String) <em>Create Owned Primitive Type</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Component#getProvideds() <em>Get Provideds</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Component#getRequireds() <em>Get Requireds</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComponentOperations
		extends ClassOperations {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentOperations() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A Component cannot nest Classifiers.
	 * nestedClassifier->isEmpty()
	 * @param component The receiving '<em><b>Component</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateNoNestedClassifiers(Component component,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(Diagnostic.ERROR,
					UMLValidator.DIAGNOSTIC_SOURCE,
					UMLValidator.COMPONENT__NO_NESTED_CLASSIFIERS,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic", //$NON-NLS-1$
						new Object[]{"validateNoNestedClassifiers", //$NON-NLS-1$
							org.eclipse.emf.ecore.util.EObjectValidator
								.getObjectLabel(component, context)}),
					new Object[]{component}));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A Component nested in a Class cannot have any packaged elements.
	 * nestingClass <> null implies packagedElement->isEmpty()
	 * @param component The receiving '<em><b>Component</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateNoPackagedElements(Component component,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(Diagnostic.ERROR,
					UMLValidator.DIAGNOSTIC_SOURCE,
					UMLValidator.COMPONENT__NO_PACKAGED_ELEMENTS,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic", //$NON-NLS-1$
						new Object[]{"validateNoPackagedElements", //$NON-NLS-1$
							org.eclipse.emf.ecore.util.EObjectValidator
								.getObjectLabel(component, context)}),
					new Object[]{component}));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Creates a(n) (abstract) class with the specified name as a packaged element of this component.
	 * @param component The receiving '<em><b>Component</b></em>' model object.
	 * @param name The name for the new class, or null.
	 * @param isAbstract Whether the new class should be abstract.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static org.eclipse.uml2.uml.Class createOwnedClass(
			Component component, String name, boolean isAbstract) {
		org.eclipse.uml2.uml.Class ownedClass = (org.eclipse.uml2.uml.Class) component
			.createPackagedElement(name, UMLPackage.Literals.CLASS);
		ownedClass.setIsAbstract(isAbstract);
		return ownedClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Creates a enumeration with the specified name as a packaged element of this component.
	 * @param component The receiving '<em><b>Component</b></em>' model object.
	 * @param name The name for the new enumeration, or null.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static Enumeration createOwnedEnumeration(Component component,
			String name) {
		return (Enumeration) component.createPackagedElement(name,
			UMLPackage.Literals.ENUMERATION);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Creates a primitive type with the specified name as a packaged element of this component.
	 * @param component The receiving '<em><b>Component</b></em>' model object.
	 * @param name The name for the new primitive type, or null.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static PrimitiveType createOwnedPrimitiveType(Component component,
			String name) {
		return (PrimitiveType) component.createPackagedElement(name,
			UMLPackage.Literals.PRIMITIVE_TYPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Creates an interface with the specified name as a packaged element of this component.
	 * @param component The receiving '<em><b>Component</b></em>' model object.
	 * @param name The name for the new interface, or null.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static Interface createOwnedInterface(Component component,
			String name) {
		return (Interface) component.createPackagedElement(name,
			UMLPackage.Literals.INTERFACE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Derivation for Component::/required
	 * result = (let 	uis : Set(Interface) = allUsedInterfaces(),
	 *         realizingClassifiers : Set(Classifier) = self.realization.realizingClassifier->union(self.allParents()->collect(realization.realizingClassifier))->asSet(),
	 *         allRealizingClassifiers : Set(Classifier) = realizingClassifiers->union(realizingClassifiers.allParents())->asSet(),
	 *         realizingClassifierInterfaces : Set(Interface) = allRealizingClassifiers->iterate(c; rci : Set(Interface) = Set{} | rci->union(c.allUsedInterfaces())),
	 *         ports : Set(Port) = self.ownedPort->union(allParents()->collect(ownedPort))->asSet(),
	 *         usedByPorts : Set(Interface) = ports.required->asSet()
	 *         in	    uis->union(realizingClassifierInterfaces)->union(usedByPorts)->asSet()
	 * )
	 * <p>From package UML::StructuredClassifiers.</p>
	 * @param component The receiving '<em><b>Component</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static EList<Interface> getRequireds(Component component) {
		EList<Interface> requireds = allUsedInterfaces(component, false,
			new UniqueEList.FastCompare<Interface>());

		EList<Component> components = new UniqueEList.FastCompare<Component>();
		components.add(component);

		for (Classifier parent : component.allParents()) {

			if (parent instanceof Component) {
				components.add((Component) parent);
			}
		}

		for (Component c : components) {

			for (ComponentRealization realization : c.getRealizations()) {

				for (Classifier realizingClassifier : realization
					.getRealizingClassifiers()) {

					if (realizingClassifier != null) {
						allUsedInterfaces(realizingClassifier, false,
							requireds);
					}
				}
			}
		}

		EList<EncapsulatedClassifier> classifiers = new UniqueEList.FastCompare<EncapsulatedClassifier>();
		classifiers.add(component);

		for (Classifier parent : component.allParents()) {

			if (parent instanceof EncapsulatedClassifier) {
				classifiers.add((EncapsulatedClassifier) parent);
			}
		}

		for (EncapsulatedClassifier c : classifiers) {

			for (Port ownedPort : c.getOwnedPorts()) {
				requireds.addAll(
					((InternalEList<Interface>) ownedPort.getRequireds())
						.basicList());
			}
		}

		return new UnionEObjectEList<Interface>((InternalEObject) component,
			UMLPackage.Literals.COMPONENT__REQUIRED, requireds.size(),
			requireds.toArray());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Derivation for Component::/provided
	 * result = (let 	ris : Set(Interface) = allRealizedInterfaces(),
	 *         realizingClassifiers : Set(Classifier) =  self.realization.realizingClassifier->union(self.allParents()->collect(realization.realizingClassifier))->asSet(),
	 *         allRealizingClassifiers : Set(Classifier) = realizingClassifiers->union(realizingClassifiers.allParents())->asSet(),
	 *         realizingClassifierInterfaces : Set(Interface) = allRealizingClassifiers->iterate(c; rci : Set(Interface) = Set{} | rci->union(c.allRealizedInterfaces())),
	 *         ports : Set(Port) = self.ownedPort->union(allParents()->collect(ownedPort))->asSet(),
	 *         providedByPorts : Set(Interface) = ports.provided->asSet()
	 * in     ris->union(realizingClassifierInterfaces) ->union(providedByPorts)->asSet())
	 * <p>From package UML::StructuredClassifiers.</p>
	 * @param component The receiving '<em><b>Component</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static EList<Interface> getProvideds(Component component) {
		EList<Interface> provideds = allRealizedInterfaces(component, false,
			new UniqueEList.FastCompare<Interface>());

		EList<Component> components = new UniqueEList.FastCompare<Component>();
		components.add(component);

		for (Classifier parent : component.allParents()) {

			if (parent instanceof Component) {
				components.add((Component) parent);
			}
		}

		for (Component c : components) {

			for (ComponentRealization realization : c.getRealizations()) {

				for (Classifier realizingClassifier : realization
					.getRealizingClassifiers()) {

					if (realizingClassifier != null) {
						allRealizedInterfaces(realizingClassifier, false,
							provideds);
					}
				}
			}
		}

		EList<EncapsulatedClassifier> classifiers = new UniqueEList.FastCompare<EncapsulatedClassifier>();
		classifiers.add(component);

		for (Classifier parent : component.allParents()) {

			if (parent instanceof EncapsulatedClassifier) {
				classifiers.add((EncapsulatedClassifier) parent);
			}
		}

		for (EncapsulatedClassifier c : classifiers) {

			for (Port ownedPort : c.getOwnedPorts()) {
				provideds.addAll(
					((InternalEList<Interface>) ownedPort.getProvideds())
						.basicList());
			}
		}

		return new UnionEObjectEList<Interface>((InternalEObject) component,
			UMLPackage.Literals.COMPONENT__PROVIDED, provideds.size(),
			provideds.toArray());
	}

} // ComponentOperations
