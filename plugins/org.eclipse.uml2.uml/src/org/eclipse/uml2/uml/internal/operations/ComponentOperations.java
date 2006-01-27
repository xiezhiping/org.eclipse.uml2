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
 * $Id: ComponentOperations.java,v 1.9 2006/01/27 04:55:56 khussey Exp $
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
import org.eclipse.uml2.uml.ComponentRealization;
import org.eclipse.uml2.uml.Dependency;
import org.eclipse.uml2.uml.Interface;
import org.eclipse.uml2.uml.InterfaceRealization;
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

		EList realizedInterfaces = new UniqueEList.FastCompare();

		for (Iterator clientDependencies = classifier.getClientDependencies()
			.iterator(); clientDependencies.hasNext();) {

			Dependency dependency = (Dependency) clientDependencies.next();

			if (dependency instanceof ComponentRealization) {

				for (Iterator suppliers = ((InternalEList) dependency
					.getSuppliers()).basicIterator(); suppliers.hasNext();) {

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
		EList usedInterfaces = new UniqueEList.FastCompare();

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
		EList requireds = new UniqueEList.FastCompare(component
			.usedInterfaces(component));

		for (Iterator realizations = component.getRealizations().iterator(); realizations
			.hasNext();) {

			Classifier realizingClassifier = ((ComponentRealization) realizations
				.next()).getRealizingClassifier();

			if (realizingClassifier != null) {
				requireds.addAll(component.usedInterfaces(realizingClassifier));
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
		EList provideds = new UniqueEList.FastCompare();

		for (Iterator interfaceRealizations = component
			.getInterfaceRealizations().iterator(); interfaceRealizations
			.hasNext();) {

			Interface contract = (Interface) ((InterfaceRealization) interfaceRealizations
				.next()).eGet(
				UMLPackage.Literals.INTERFACE_REALIZATION__CONTRACT, false);

			if (contract != null) {
				provideds.add(contract);
			}
		}

		provideds.addAll(component.realizedInterfaces(component));

		for (Iterator realizations = component.getRealizations().iterator(); realizations
			.hasNext();) {

			Classifier realizingClassifier = ((ComponentRealization) realizations
				.next()).getRealizingClassifier();

			if (realizingClassifier != null) {
				provideds.addAll(component
					.realizedInterfaces(realizingClassifier));
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

} // ComponentOperations