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
 * $Id: ComponentOperations.java,v 1.3 2005/11/30 21:43:10 khussey Exp $
 */
package org.eclipse.uml2.uml.internal.operations;

import java.util.List;

import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.Component;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Component</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.Component#realizedInterfaces() <em>Realized Interfaces</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Component#usedInterfaces() <em>Used Interfaces</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Component#getRequireds() <em>Get Requireds</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Component#getProvideds() <em>Get Provideds</em>}</li>
 * </ul>
 * </p>
 *
 * @generated not
 */
public final class ComponentOperations
		extends UMLOperations {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private ComponentOperations() {
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
	 * @generated
	 */
	public static List realizedInterfaces(Component component,
			Classifier classifier) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
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
	 * @generated
	 */
	public static List usedInterfaces(Component component, Classifier classifier) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
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
	 * @generated
	 */
	public static List getRequireds(Component component) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
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
	 * @generated
	 */
	public static List getProvideds(Component component) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

} // ComponentOperations