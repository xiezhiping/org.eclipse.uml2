/*
 * Copyright (c) 2003, 2004 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *
 * $Id: UML2OperationsTest.java,v 1.2 2005/03/15 18:51:33 khussey Exp $
 */
package org.eclipse.uml2.internal.operation.tests;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import junit.framework.TestCase;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreSwitch;
import org.eclipse.uml2.Element;
import org.eclipse.uml2.Model;
import org.eclipse.uml2.UML2Factory;
import org.eclipse.uml2.UML2Package;

/**
 * The base class for UML2 Operations test cases.
 */
public abstract class UML2OperationsTest
	extends TestCase {

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
	 * Sets the UML primitive types library for this UML2 Operations test case
	 * to the specified model.
	 * 
	 * @param model
	 *            The UML primitive types library for this UML2 Operations test
	 *            case.
	 */
	protected void setUML2PrimtiveTypesLibrary(Model model) {
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
		setUML2PrimtiveTypesLibrary(null);

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
			final Model metamodel = UML2Factory.eINSTANCE.createModel();
			metamodel.setName(UML2Package.eINSTANCE.getName());

			new EcoreSwitch() {

				public Object caseEClass(EClass object) {
					org.eclipse.uml2.Class metaclass = (org.eclipse.uml2.Class) metamodel
						.createOwnedMember(UML2Package.eINSTANCE.getClass_());
					metaclass.setName(object.getName());

					return metaclass;
				}

				public Object defaultCase(EObject object) {

					for (Iterator eContents = object.eContents().iterator(); eContents
						.hasNext();) {
						doSwitch((EObject) eContents.next());
					}

					return this;
				}
			}.doSwitch(UML2Package.eINSTANCE);

			setUML2Metamodel(metamodel);
		}

		return uml2Metamodel;
	}

	protected Model getUML2PrimitiveTypesLibrary() {

		if (null == uml2PrimitiveTypesLibrary) {
			Model library = UML2Factory.eINSTANCE.createModel();
			library.setName("UML2"); //$NON-NLS-1$

			library.createOwnedMember(UML2Package.eINSTANCE.getPrimitiveType())
				.setName("Boolean"); //$NON-NLS-1$
			library.createOwnedMember(UML2Package.eINSTANCE.getPrimitiveType())
				.setName("Integer"); //$NON-NLS-1$
			library.createOwnedMember(UML2Package.eINSTANCE.getPrimitiveType())
				.setName("String"); //$NON-NLS-1$
			library.createOwnedMember(UML2Package.eINSTANCE.getPrimitiveType())
				.setName("UnlimitedNatural"); //$NON-NLS-1$			

			setUML2PrimtiveTypesLibrary(library);
		}

		return uml2PrimitiveTypesLibrary;
	}

} //UML2OperationsTest
