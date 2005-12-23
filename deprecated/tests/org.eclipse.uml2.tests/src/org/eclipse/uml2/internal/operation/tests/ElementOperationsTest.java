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
 * $Id: ElementOperationsTest.java,v 1.7 2005/12/23 06:49:32 khussey Exp $
 */
package org.eclipse.uml2.internal.operation.tests;

import java.util.Date;
import java.util.Iterator;

import junit.textui.TestRunner;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.uml2.Comment;
import org.eclipse.uml2.Element;
import org.eclipse.uml2.Model;
import org.eclipse.uml2.PackageableElement;
import org.eclipse.uml2.UML2Factory;
import org.eclipse.uml2.UML2Package;
import org.eclipse.uml2.internal.operation.ElementOperations;
import org.eclipse.uml2.util.UML2Resource;
import org.eclipse.uml2.util.UML2Switch;

/**
 * A test case for the '<em><b>Element Operations</b></em>' utility.
 */
public class ElementOperationsTest
		extends UML2OperationsTest {

	public static void main(String[] args) {
		TestRunner.run(ElementOperationsTest.class);
	}

	/**
	 * Constructs a new Element Operations test case with the given name.
	 */
	public ElementOperationsTest(String name) {
		super(name);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see junit.framework.TestCase#setUp()
	 */
	protected void setUp()
			throws Exception {

		super.setUp();

		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put(
			UML2Resource.FILE_EXTENSION, UML2Resource.Factory.INSTANCE);
	}

	/**
	 * Returns the element for this Element Operations test case.
	 */
	protected Element getElement() {
		return element;
	}

	/**
	 * Tests the '
	 * {@link org.eclipse.uml2.internal.operation.ElementOperations#getModel() <em>Get Model</em>}'
	 * method.
	 * 
	 * @see org.eclipse.uml2.internal.operation.ElementOperations#getModel()
	 */
	public void testGetModel() {

		assertNull(ElementOperations.getModel(null));

		final Model model = UML2Factory.eINSTANCE.createModel();

		for (Iterator eAllSubClasses = getEAllSubClasses(
			UML2Package.eINSTANCE.getElement()).iterator(); eAllSubClasses
			.hasNext();) {

			setElement((Element) UML2Factory.eINSTANCE
				.create((EClass) eAllSubClasses.next()));

			new UML2Switch() {

				public Object caseElement(Element object) {
					assertNull(ElementOperations.getModel(null));

					return this;
				}

				public Object caseModel(Model object) {
					assertSame(getElement(), ElementOperations
						.getModel(getElement()));

					return this;
				}

				public Object casePackageableElement(PackageableElement object) {
					assertNull(ElementOperations.getModel(getElement()));

					model.getOwnedMembers().add(getElement());

					assertSame(model, ElementOperations.getModel(getElement()));

					return this;
				}
			}.doSwitch(getElement());
		}
	}

	/**
	 * Tests the '
	 * {@link org.eclipse.uml2.internal.operation.ElementOperations#getNearestPackage() <em>Get Nearest Package</em>}'
	 * method.
	 * 
	 * @see org.eclipse.uml2.internal.operation.ElementOperations#getNearestPackage()
	 */
	public void testGetNearestPackage() {

		assertNull(ElementOperations.getNearestPackage(null));

		final org.eclipse.uml2.Package package_ = UML2Factory.eINSTANCE
			.createPackage();

		for (Iterator eAllSubClasses = getEAllSubClasses(
			UML2Package.eINSTANCE.getElement()).iterator(); eAllSubClasses
			.hasNext();) {

			setElement((Element) UML2Factory.eINSTANCE
				.create((EClass) eAllSubClasses.next()));

			new UML2Switch() {

				public Object caseElement(Element object) {
					assertNull(ElementOperations.getNearestPackage(null));

					return this;
				}

				public Object casePackage(org.eclipse.uml2.Package object) {
					assertSame(getElement(), ElementOperations
						.getNearestPackage(getElement()));

					return this;
				}

				public Object casePackageableElement(PackageableElement object) {
					assertNull(ElementOperations
						.getNearestPackage(getElement()));

					package_.getOwnedMembers().add(getElement());

					assertSame(package_, ElementOperations
						.getNearestPackage(getElement()));

					return this;
				}
			}.doSwitch(getElement());
		}
	}

	/**
	 * Tests the '
	 * {@link org.eclipse.uml2.internal.operation.ElementOperations#destroy(Element) <em>Destroy</em>}'
	 * method.
	 * 
	 * @see org.eclipse.uml2.internal.operation.ElementOperations#destroy(Element)
	 */
	public void testDestroy() {

		try {
			ElementOperations.destroy(null);
			fail();
		} catch (IllegalArgumentException iae) {
			// pass
		}

		final Comment comment1 = UML2Factory.eINSTANCE.createComment();
		new ResourceSetImpl().createResource(
			URI.createFileURI(String.valueOf(new Date().getTime()))
				.appendFileExtension(UML2Resource.FILE_EXTENSION))
			.getContents().add(comment1);

		ResourceSet resourceSet = new ResourceSetImpl();

		final Comment comment2 = UML2Factory.eINSTANCE.createComment();
		resourceSet.createResource(
			URI.createFileURI(String.valueOf(new Date().getTime()))
				.appendFileExtension(UML2Resource.FILE_EXTENSION))
			.getContents().add(comment2);

		final Model model = UML2Factory.eINSTANCE.createModel();
		resourceSet.createResource(
			URI.createFileURI(String.valueOf(new Date().getTime()))
				.appendFileExtension(UML2Resource.FILE_EXTENSION))
			.getContents().add(model);

		for (Iterator eAllSubClasses = getEAllSubClasses(
			UML2Package.eINSTANCE.getElement()).iterator(); eAllSubClasses
			.hasNext();) {

			setElement((Element) UML2Factory.eINSTANCE
				.create((EClass) eAllSubClasses.next()));

			model.eResource().getContents().add(getElement());

			assertTrue(model.eResource().getContents().contains(getElement()));

			ElementOperations.destroy(getElement());

			assertFalse(model.eResource().getContents().contains(getElement()));

			comment1.getAnnotatedElements().add(getElement());
			comment2.getAnnotatedElements().add(getElement());

			new UML2Switch() {

				public Object caseElement(Element object) {
					assertTrue(comment1.getAnnotatedElements().contains(
						getElement()));
					assertTrue(comment2.getAnnotatedElements().contains(
						getElement()));

					ElementOperations.destroy(getElement());

					assertFalse(comment1.getAnnotatedElements().contains(
						getElement()));
					assertFalse(comment2.getAnnotatedElements().contains(
						getElement()));

					return this;
				}

				public Object casePackageableElement(PackageableElement object) {
					caseElement(object);

					model.getOwnedMembers().add(getElement());

					assertTrue(model.getOwnedMembers().contains(getElement()));

					ElementOperations.destroy(getElement());

					assertFalse(model.getOwnedMembers().contains(getElement()));

					return this;
				}
			}.doSwitch(getElement());
		}

	}

}