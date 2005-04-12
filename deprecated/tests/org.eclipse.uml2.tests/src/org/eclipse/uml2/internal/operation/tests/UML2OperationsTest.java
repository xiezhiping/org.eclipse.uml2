/*
 * Copyright (c) 2003, 2005 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *
 * $Id: UML2OperationsTest.java,v 1.3 2005/04/12 17:46:05 khussey Exp $
 */
package org.eclipse.uml2.internal.operation.tests;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import junit.framework.TestCase;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.uml2.Element;
import org.eclipse.uml2.Model;
import org.eclipse.uml2.PrimitiveType;
import org.eclipse.uml2.UML2Package;
import org.eclipse.uml2.util.UML2Resource;
import org.eclipse.uml2.util.UML2Util;

/**
 * The base class for UML2 Operations test cases.
 */
public abstract class UML2OperationsTest
		extends TestCase {

	/**
	 * The resource set for this UML2 Operations test case.
	 */
	private static final ResourceSet RESOURCE_SET = new ResourceSetImpl();

	/**
	 * The UML2 metamodel for this UML2 Operations test case.
	 */
	private Model uml2Metamodel = null;

	/**
	 * The UML primitive types library for this UML2 Operations test case.
	 */
	private Model uml2PrimitiveTypesLibrary = null;

	/**
	 * The element for this UML2 Operations test case.
	 */
	protected Element element = null;

	/**
	 * Constructs a new UML2 Operations test case with the given name.
	 */
	public UML2OperationsTest(String name) {
		super(name);
	}

	/**
	 * Sets the UML2 metamodel for this UML2 Operations test case to the
	 * specified model.
	 * 
	 * @param model
	 *            The UML2 metamodel for this UML2 Operations test case.
	 */
	protected void setUML2Metamodel(Model model) {
		this.uml2Metamodel = model;
	}

	/**
	 * Sets the UML2 primitive types library for this UML2 Operations test case
	 * to the specified model.
	 * 
	 * @param model
	 *            The UML2 primitive types library for this UML2 Operations test
	 *            case.
	 */
	protected void setUML2PrimitiveTypesLibrary(Model model) {
		this.uml2PrimitiveTypesLibrary = model;
	}

	/**
	 * Sets the element for this UML2 Operations test case to the specified
	 * element.
	 * 
	 * @param element
	 *            The element for this UML2 Operations test case.
	 */
	protected void setElement(Element element) {
		this.element = element;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see junit.framework.TestCase#tearDown()
	 */
	protected void tearDown()
			throws Exception {

		setUML2Metamodel(null);
		setUML2PrimitiveTypesLibrary(null);

		setElement(null);
	}

	protected List getEAllSubClasses(EClass eClass) {
		List eAllSubClasses = new ArrayList();

		for (Iterator eClassifiers = UML2Package.eINSTANCE.getEClassifiers()
			.iterator(); eClassifiers.hasNext();) {

			EClassifier eClassifier = (EClassifier) eClassifiers.next();

			if (EClass.class.isInstance(eClassifier)
				&& eClass.isSuperTypeOf((EClass) eClassifier)
				&& !((EClass) eClassifier).isAbstract()) {

				eAllSubClasses.add(eClassifier);
			}
		}

		return eAllSubClasses;
	}

	protected Model getUML2Metamodel() {

		if (null == uml2Metamodel) {
			setUML2Metamodel((Model) UML2Util.load(RESOURCE_SET, URI
				.createURI(UML2Resource.UML2_METAMODEL_URI)));
		}

		return uml2Metamodel;
	}

	protected Model getUML2PrimitiveTypesLibrary() {

		if (null == uml2PrimitiveTypesLibrary) {
			setUML2PrimitiveTypesLibrary((Model) UML2Util.load(RESOURCE_SET,
				URI.createURI(UML2Resource.UML2_PRIMITIVE_TYPES_LIBRARY_URI)));
		}

		return uml2PrimitiveTypesLibrary;
	}

	protected org.eclipse.uml2.Class getUML2Metaclass(EClass eClass) {
		return (org.eclipse.uml2.Class) getUML2Metamodel().getOwnedType(
			eClass.getName());
	}

	protected PrimitiveType getUML2PrimitiveType(String name) {
		return (PrimitiveType) getUML2PrimitiveTypesLibrary()
			.getOwnedType(name);
	}

} // UML2OperationsTest
