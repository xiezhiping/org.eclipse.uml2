/*
 * Copyright (c) 2005, 2006 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *
 * $Id: ComponentOperations.java,v 1.11 2006/10/10 20:41:28 khussey Exp $
 */
package org.eclipse.uml2.uml.internal.operations;

import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.common.util.EList;

import java.util.Iterator;
import org.eclipse.emf.common.util.UniqueEList;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.uml2.common.util.UnionEObjectEList;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.Component;
import org.eclipse.uml2.uml.Enumeration;
import org.eclipse.uml2.uml.ComponentRealization;
import org.eclipse.uml2.uml.Dependency;
import org.eclipse.uml2.uml.Interface;
import org.eclipse.uml2.uml.PrimitiveType;
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
 *   <li>{@link org.eclipse.uml2.uml.Component#createOwnedClass(java.lang.String, boolean) <em>Create Owned Class</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Component#createOwnedEnumeration(java.lang.String) <em>Create Owned Enumeration</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Component#createOwnedPrimitiveType(java.lang.String) <em>Create Owned Primitive Type</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Component#createOwnedInterface(java.lang.String) <em>Create Owned Interface</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Component#realizedInterfaces(org.eclipse.uml2.uml.Classifier) <em>Realized Interfaces</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Component#usedInterfaces(org.eclipse.uml2.uml.Classifier) <em>Used Interfaces</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Component#getRequireds() <em>Get Requireds</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Component#getProvideds() <em>Get Provideds</em>}</li>
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
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static EList realizedInterfaces(Component component,
			Classifier classifier) {
		return realizedInterfaces(component, classifier, true);
	}

	protected static EList realizedInterfaces(Component component,
			Classifier classifier, boolean resolve) {
		EList realizedInterfaces = new UniqueEList.FastCompare();

		for (Iterator clientDependencies = classifier.getClientDependencies()
			.iterator(); clientDependencies.hasNext();) {

			Dependency dependency = (Dependency) clientDependencies.next();

			if (dependency instanceof Realization) {
				Iterator suppliers = resolve
					? dependency.getSuppliers().iterator()
					: ((InternalEList) dependency.getSuppliers())
						.basicIterator();

				while (suppliers.hasNext()) {
					Object supplier = suppliers.next();

					if (supplier instanceof Interface) {
						realizedInterfaces.add(supplier);
					}
				}
			}
		}

		return ECollections.unmodifiableEList(realizedInterfaces);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Utility returning the set of used interfaces of a component:
	 * result = (classifier.supplierDependency->
	 * select(dependency|dependency.oclIsKindOf(Usage) and dependency.supplier.oclIsKindOf(interface)))->
	 * collect(dependency|dependency.supplier)
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static EList usedInterfaces(Component component,
			Classifier classifier) {
		return usedInterfaces(component, classifier, true);
	}

	protected static EList usedInterfaces(Component component,
			Classifier classifier, boolean resolve) {
		EList usedInterfaces = new UniqueEList.FastCompare();

		for (Iterator clientDependencies = classifier.getClientDependencies()
			.iterator(); clientDependencies.hasNext();) {

			Dependency dependency = (Dependency) clientDependencies.next();

			if (dependency instanceof Usage) {
				Iterator suppliers = resolve
					? dependency.getSuppliers().iterator()
					: ((InternalEList) dependency.getSuppliers())
						.basicIterator();

				while (suppliers.hasNext()) {
					Object supplier = suppliers.next();

					if (supplier instanceof Interface) {
						usedInterfaces.add(supplier);
					}
				}
			}
		}

		return ECollections.unmodifiableEList(usedInterfaces);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * result = let usedInterfaces = UsedInterfaces(self) and
	 * 
	 *   let realizingClassifierUsedInterfaces = UsedInterfaces(self.realizingClassifier) and
	 * 
	 *   let typesOfUsedPorts = self.ownedPort.required in
	 * 
	 *     ((usedInterfaces->union(realizingClassifierUsedInterfaces))->
	 * 
	 *       union(typesOfUsedPorts))->asSet()
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static EList getRequireds(Component component) {
		EList requireds = new UniqueEList.FastCompare(usedInterfaces(component,
			component, false));

		for (Iterator realizations = component.getRealizations().iterator(); realizations
			.hasNext();) {

			Classifier realizingClassifier = ((ComponentRealization) realizations
				.next()).getRealizingClassifier();

			if (realizingClassifier != null) {
				requireds.addAll(usedInterfaces(component, realizingClassifier,
					false));

				for (Iterator allParents = realizingClassifier.allParents()
					.iterator(); allParents.hasNext();) {

					requireds.addAll(usedInterfaces(component,
						(Classifier) allParents.next(), false));
				}
			}
		}

		for (Iterator ownedPorts = component.getOwnedPorts().iterator(); ownedPorts
			.hasNext();) {

			requireds.addAll(((InternalEList) ((Port) ownedPorts.next())
				.getRequireds()).basicList());
		}

		return new UnionEObjectEList((InternalEObject) component,
			UMLPackage.Literals.COMPONENT__REQUIRED, requireds.size(),
			requireds.toArray());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * result = let implementedInterfaces = self.implementation->collect(impl|impl.contract) and
	 * 
	 *   let realizedInterfaces = RealizedInterfaces(self) and
	 * 
	 *   let realizingClassifierInterfaces = RealizedInterfaces(self.realizingClassifier) and
	 * 
	 *   let typesOfRequiredPorts = self.ownedPort.provided in
	 * 
	 *     (((implementedInterfaces->union(realizedInterfaces)->union(realizingClassifierInterfaces))->
	 * 
	 *       union(typesOfRequiredPorts))->asSet()
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static EList getProvideds(Component component) {
		EList provideds = new UniqueEList.FastCompare(realizedInterfaces(
			component, component, false));

		for (Iterator realizations = component.getRealizations().iterator(); realizations
			.hasNext();) {

			Classifier realizingClassifier = ((ComponentRealization) realizations
				.next()).getRealizingClassifier();

			if (realizingClassifier != null) {
				provideds.addAll(realizedInterfaces(component,
					realizingClassifier, false));

				for (Iterator allParents = realizingClassifier.allParents()
					.iterator(); allParents.hasNext();) {

					provideds.addAll(realizedInterfaces(component,
						(Classifier) allParents.next(), false));
				}
			}
		}

		for (Iterator ownedPorts = component.getOwnedPorts().iterator(); ownedPorts
			.hasNext();) {

			provideds.addAll(((InternalEList) ((Port) ownedPorts.next())
				.getProvideds()).basicList());
		}

		return new UnionEObjectEList((InternalEObject) component,
			UMLPackage.Literals.COMPONENT__PROVIDED, provideds.size(),
			provideds.toArray());
	}

	protected static EList getAllProvideds(Component component,
			EList allProvideds) {
		allProvideds.addAll(component.getProvideds());

		for (Iterator allParents = component.allParents().iterator(); allParents
			.hasNext();) {

			Object parent = allParents.next();

			if (parent instanceof Component) {
				allProvideds.addAll(((Component) parent).getProvideds());
			} else {
				allProvideds.addAll(realizedInterfaces(component,
					(Classifier) parent));
			}
		}

		return allProvideds;
	}

	protected static EList getAllRequireds(Component component,
			EList allRequireds) {
		allRequireds.addAll(component.getRequireds());

		for (Iterator allParents = component.allParents().iterator(); allParents
			.hasNext();) {

			Object parent = allParents.next();

			if (parent instanceof Component) {
				allRequireds.addAll(((Component) parent).getRequireds());
			} else {
				allRequireds.addAll(usedInterfaces(component,
					(Classifier) parent));
			}
		}

		return allRequireds;
	}

} // ComponentOperations
