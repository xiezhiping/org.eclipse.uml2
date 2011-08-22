/*
 * Copyright (c) 2005, 2011 IBM Corporation, CEA, and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *   Kenn Hussey (CEA) - 327039
 *
 * $Id: ComponentOperations.java,v 1.15 2008/10/02 20:56:22 jbruck Exp $
 */
package org.eclipse.uml2.uml.internal.operations;

import java.util.Map;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.common.util.EList;

import java.util.Iterator;
import org.eclipse.emf.common.util.UniqueEList;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.uml2.common.util.UnionEObjectEList;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.Component;
import org.eclipse.uml2.uml.EncapsulatedClassifier;
import org.eclipse.uml2.uml.Enumeration;
import org.eclipse.uml2.uml.ComponentRealization;
import org.eclipse.uml2.uml.Dependency;
import org.eclipse.uml2.uml.Interface;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.PrimitiveType;
import org.eclipse.uml2.uml.util.UMLValidator;
import org.eclipse.uml2.uml.Realization;
import org.eclipse.uml2.uml.Port;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.Usage;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Component</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.Component#validateNoNestedClassifiers(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate No Nested Classifiers</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Component#validateNoPackagedElements(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate No Packaged Elements</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Component#createOwnedClass(java.lang.String, boolean) <em>Create Owned Class</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Component#createOwnedEnumeration(java.lang.String) <em>Create Owned Enumeration</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Component#createOwnedInterface(java.lang.String) <em>Create Owned Interface</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Component#createOwnedPrimitiveType(java.lang.String) <em>Create Owned Primitive Type</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Component#getProvideds() <em>Get Provideds</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Component#realizedInterfaces(org.eclipse.uml2.uml.Classifier) <em>Realized Interfaces</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Component#getRequireds() <em>Get Requireds</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Component#usedInterfaces(org.eclipse.uml2.uml.Classifier) <em>Used Interfaces</em>}</li>
 * </ul>
 * </p>
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
	 * A component cannot nest classifiers.
	 * self.nestedClassifier->isEmpty()
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
				diagnostics
					.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						UMLValidator.DIAGNOSTIC_SOURCE,
						UMLValidator.COMPONENT__NO_NESTED_CLASSIFIERS,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE
							.getString(
								"_UI_GenericInvariant_diagnostic", new Object[]{"validateNoNestedClassifiers", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(component, context)}), //$NON-NLS-1$ //$NON-NLS-2$
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
	 * component nested in a Class cannot have any packaged elements.
	 * (not self.class->isEmpty()) implies self.packagedElement->isEmpty()
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
				diagnostics
					.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						UMLValidator.DIAGNOSTIC_SOURCE,
						UMLValidator.COMPONENT__NO_PACKAGED_ELEMENTS,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE
							.getString(
								"_UI_GenericInvariant_diagnostic", new Object[]{"validateNoPackagedElements", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(component, context)}), //$NON-NLS-1$ //$NON-NLS-2$
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
	 * Utility returning the set of realized interfaces of a component:
	 * result = (classifier.clientDependency->
	 * select(dependency|dependency.oclIsKindOf(Realization) and dependency.supplier.oclIsKindOf(Interface)))->
	 * collect(dependency|dependency.client)
	 * @param component The receiving '<em><b>Component</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static EList<Interface> realizedInterfaces(Component component,
			Classifier classifier) {
		return ECollections.unmodifiableEList(realizedInterfaces(component,
			classifier, true));
	}

	protected static EList<Interface> realizedInterfaces(Component component,
			Classifier classifier, boolean resolve) {
		return realizedInterfaces(component, classifier, resolve,
			new UniqueEList.FastCompare<Interface>());
	}

	protected static EList<Interface> realizedInterfaces(Component component,
			Classifier classifier, boolean resolve,
			EList<Interface> realizedInterfaces) {

		for (Dependency clientDependency : classifier.getClientDependencies()) {

			if (clientDependency instanceof Realization) {
				Iterator<NamedElement> suppliers = resolve
					? clientDependency.getSuppliers().iterator()
					: ((InternalEList<NamedElement>) clientDependency
						.getSuppliers()).basicIterator();

				while (suppliers.hasNext()) {
					NamedElement supplier = suppliers.next();

					if (supplier instanceof Interface) {
						realizedInterfaces.add((Interface) supplier);
					}
				}
			}
		}

		return realizedInterfaces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Utility returning the set of used interfaces of a component:
	 * result = (classifier.supplierDependency->
	 * select(dependency|dependency.oclIsKindOf(Usage) and dependency.supplier.oclIsKindOf(interface)))->
	 * collect(dependency|dependency.supplier)
	 * @param component The receiving '<em><b>Component</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static EList<Interface> usedInterfaces(Component component,
			Classifier classifier) {
		return ECollections.unmodifiableEList(usedInterfaces(component,
			classifier, true));
	}

	protected static EList<Interface> usedInterfaces(Component component,
			Classifier classifier, boolean resolve) {
		return usedInterfaces(component, classifier, resolve,
			new UniqueEList.FastCompare<Interface>());
	}

	protected static EList<Interface> usedInterfaces(Component component,
			Classifier classifier, boolean resolve,
			EList<Interface> usedInterfaces) {

		for (Dependency clientDependency : classifier.getClientDependencies()) {

			if (clientDependency instanceof Usage) {
				Iterator<NamedElement> suppliers = resolve
					? clientDependency.getSuppliers().iterator()
					: ((InternalEList<NamedElement>) clientDependency
						.getSuppliers()).basicIterator();

				while (suppliers.hasNext()) {
					NamedElement supplier = suppliers.next();

					if (supplier instanceof Interface) {
						usedInterfaces.add((Interface) supplier);
					}
				}
			}
		}

		return usedInterfaces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Missing derivation for Component::/required : Interface
	 * result = 
	 * let 	usedInterfaces : Set(Interface) = UsedInterfaces(self),
	 * 		realizingClassifiers : Set(Classifier) = Set{self.realizingClassifier}->union(self.allParents().realizingClassifier),
	 * 		allRealizingClassifiers : Set(Classifier) = realizingClassifiers->union(realizingClassifiers.allParents()),
	 * 		realizingClassifierInterfaces : Set(Interface) = allRealizingClassifiers->iterate(c; rci : Set(Interface) = Set{} | rci->union(UsedInterfaces(c))),
	 * 		ports : Set(Port) = self.ownedPort->union(allParents.oclAsType(Set(EncapsulatedClassifier)).ownedPort),
	 * 		usedByPorts : Set(Interface) = ports.required
	 * in		usedInterfaces->union(realizingClassifierInterfaces) ->union(usedByPorts)->asSet()
	 * 
	 * @param component The receiving '<em><b>Component</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static EList<Interface> getRequireds(Component component) {
		EList<Interface> requireds = usedInterfaces(component, component,
			false, new UniqueEList.FastCompare<Interface>());

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
						usedInterfaces(c, realizingClassifier, false, requireds);

						for (Classifier parent : realizingClassifier
							.allParents()) {
							usedInterfaces(c, parent, false, requireds);
						}
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
				requireds.addAll(((InternalEList<Interface>) ownedPort
					.getRequireds()).basicList());
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
	 * Missing derivation for Component::/provided : Interface
	 * result =
	 * let 	realizedInterfaces : Set(Interface) = RealizedInterfaces(self) ,
	 * 		realizingClassifiers : Set(Classifier) = Set{self.realizingClassifier}->union(self.allParents().realizingClassifier),
	 * 		allRealizingClassifiers : Set(Classifier) = realizingClassifiers->union(realizingClassifiers.allParents()) ,
	 * 		realizingClassifierInterfaces : Set(Interface) = allRealizingClassifiers->iterate(c; rci : Set(Interface) = Set{} | rci->union(RealizedInterfaces(c))) ,
	 * 		ports : Set(Port) = self.ownedPort->union(allParents.oclAsType(Set(EncapsulatedClassifier)).ownedPort) ,
	 * 		providedByPorts : Set(Interface) = ports.provided 
	 * in 	realizedInterfaces->union(realizingClassifierInterfaces) ->union(providedByPorts)->asSet()
	 * 
	 * @param component The receiving '<em><b>Component</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static EList<Interface> getProvideds(Component component) {
		EList<Interface> provideds = realizedInterfaces(component, component,
			false, new UniqueEList.FastCompare<Interface>());

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
						realizedInterfaces(c, realizingClassifier, false,
							provideds);

						for (Classifier parent : realizingClassifier
							.allParents()) {
							realizedInterfaces(c, parent, false, provideds);
						}
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
				provideds.addAll(((InternalEList<Interface>) ownedPort
					.getProvideds()).basicList());
			}
		}

		return new UnionEObjectEList<Interface>((InternalEObject) component,
			UMLPackage.Literals.COMPONENT__PROVIDED, provideds.size(),
			provideds.toArray());
	}

	protected static EList<Interface> getAllProvideds(Component component,
			EList<Interface> allProvideds) {
		allProvideds.addAll(component.getProvideds());

		for (Classifier parent : component.allParents()) {

			if (parent instanceof Component) {
				allProvideds.addAll(((Component) parent).getProvideds());
			} else {
				realizedInterfaces(component, parent, true, allProvideds);
			}
		}

		return allProvideds;
	}

	protected static EList<Interface> getAllRequireds(Component component,
			EList<Interface> allRequireds) {
		allRequireds.addAll(component.getRequireds());

		for (Classifier parent : component.allParents()) {

			if (parent instanceof Component) {
				allRequireds.addAll(((Component) parent).getRequireds());
			} else {
				usedInterfaces(component, parent, true, allRequireds);
			}
		}

		return allRequireds;
	}

} // ComponentOperations
