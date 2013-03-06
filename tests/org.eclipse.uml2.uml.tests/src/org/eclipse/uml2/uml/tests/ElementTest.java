/*
 * Copyright (c) 2005, 2013 IBM Corporation, CEA, and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *   Kenn Hussey - 323181
 *   Kenn Hussey (CEA) - 327039, 399544
 *
 */
package org.eclipse.uml2.uml.tests;

import java.util.Date;

import junit.framework.TestCase;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.common.util.UniqueEList;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.resource.ResourceSet;

import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

import org.eclipse.uml2.common.util.UML2Util;

import org.eclipse.uml2.uml.Comment;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.PackageableElement;
import org.eclipse.uml2.uml.UMLFactory;
import org.eclipse.uml2.uml.UMLPackage;

import org.eclipse.uml2.uml.resource.UMLResource;

import org.eclipse.uml2.uml.util.UMLSwitch;
import org.eclipse.uml2.uml.util.UMLUtil;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.Element#validateHasOwner(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Has Owner</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Element#validateNotOwnSelf(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Not Own Self</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Element#addKeyword(java.lang.String) <em>Add Keyword</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Element#applyStereotype(org.eclipse.uml2.uml.Stereotype) <em>Apply Stereotype</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Element#createEAnnotation(java.lang.String) <em>Create EAnnotation</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Element#destroy() <em>Destroy</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Element#getKeywords() <em>Get Keywords</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Element#getApplicableStereotype(java.lang.String) <em>Get Applicable Stereotype</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Element#getApplicableStereotypes() <em>Get Applicable Stereotypes</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Element#getAppliedStereotype(java.lang.String) <em>Get Applied Stereotype</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Element#getAppliedStereotypes() <em>Get Applied Stereotypes</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Element#getAppliedSubstereotype(org.eclipse.uml2.uml.Stereotype, java.lang.String) <em>Get Applied Substereotype</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Element#getAppliedSubstereotypes(org.eclipse.uml2.uml.Stereotype) <em>Get Applied Substereotypes</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Element#getModel() <em>Get Model</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Element#getNearestPackage() <em>Get Nearest Package</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Element#getRelationships() <em>Get Relationships</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Element#getRelationships(org.eclipse.emf.ecore.EClass) <em>Get Relationships</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Element#getRequiredStereotype(java.lang.String) <em>Get Required Stereotype</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Element#getRequiredStereotypes() <em>Get Required Stereotypes</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Element#getSourceDirectedRelationships() <em>Get Source Directed Relationships</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Element#getSourceDirectedRelationships(org.eclipse.emf.ecore.EClass) <em>Get Source Directed Relationships</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Element#getStereotypeApplication(org.eclipse.uml2.uml.Stereotype) <em>Get Stereotype Application</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Element#getStereotypeApplications() <em>Get Stereotype Applications</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Element#getTargetDirectedRelationships() <em>Get Target Directed Relationships</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Element#getTargetDirectedRelationships(org.eclipse.emf.ecore.EClass) <em>Get Target Directed Relationships</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Element#getValue(org.eclipse.uml2.uml.Stereotype, java.lang.String) <em>Get Value</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Element#hasKeyword(java.lang.String) <em>Has Keyword</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Element#hasValue(org.eclipse.uml2.uml.Stereotype, java.lang.String) <em>Has Value</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Element#isStereotypeApplicable(org.eclipse.uml2.uml.Stereotype) <em>Is Stereotype Applicable</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Element#isStereotypeApplied(org.eclipse.uml2.uml.Stereotype) <em>Is Stereotype Applied</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Element#isStereotypeRequired(org.eclipse.uml2.uml.Stereotype) <em>Is Stereotype Required</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Element#removeKeyword(java.lang.String) <em>Remove Keyword</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Element#setValue(org.eclipse.uml2.uml.Stereotype, java.lang.String, java.lang.Object) <em>Set Value</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Element#unapplyStereotype(org.eclipse.uml2.uml.Stereotype) <em>Unapply Stereotype</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Element#allOwnedElements() <em>All Owned Elements</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Element#mustBeOwned() <em>Must Be Owned</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public abstract class ElementTest
		extends TestCase {

	/**
	 * The fixture for this Element test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Element fixture = null;

	/**
	 * Constructs a new Element test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElementTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Element test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Element fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Element test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Element getFixture() {
		return fixture;
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.uml.Element#validateNotOwnSelf(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Not Own Self</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.Element#validateNotOwnSelf(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated NOT
	 */
	public void testValidateNotOwnSelf__DiagnosticChain_Map() {

		new UMLSwitch<Object>() {

			@Override
			public Object caseComment(Comment comment) {
				caseElement(comment);

				try {
					comment.createOwnedComment().getOwnedComments()
						.add(comment);
				} catch (IllegalStateException ise) {
					// ignore
				}

				assertFalse(comment.validateNotOwnSelf(null, null));

				return comment;
			}

			@Override
			public Object caseElement(Element element) {
				assertTrue(element.validateNotOwnSelf(null, null));

				return element;
			}
		}.doSwitch(getFixture());
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.uml.Element#validateHasOwner(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Has Owner</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.Element#validateHasOwner(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated NOT
	 */
	public void testValidateHasOwner__DiagnosticChain_Map() {

		new UMLSwitch<Object>() {

			@Override
			public Object caseElement(Element element) {
				assertFalse(getFixture().validateHasOwner(null, null));

				return element;
			}

			@Override
			public Object casePackage(org.eclipse.uml2.uml.Package package_) {
				assertTrue(getFixture().validateHasOwner(null, null));

				return package_;
			}

			@Override
			public Object casePackageableElement(
					PackageableElement packageableElement) {
				caseElement(packageableElement);

				UMLFactory.eINSTANCE.createPackage().getPackagedElements()
					.add(packageableElement);

				assertTrue(getFixture().validateHasOwner(null, null));

				return packageableElement;
			}
		}.doSwitch(getFixture());
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.uml.Element#destroy() <em>Destroy</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.Element#destroy()
	 * @generated NOT
	 */
	public void testDestroy() {
		final Comment comment1 = UMLFactory.eINSTANCE.createComment();
		new ResourceSetImpl()
			.createResource(
				URI.createFileURI(String.valueOf(new Date().getTime()))
					.appendFileExtension(UMLResource.FILE_EXTENSION))
			.getContents().add(comment1);

		ResourceSet resourceSet = new ResourceSetImpl();

		Comment comment2 = UMLFactory.eINSTANCE.createComment();
		resourceSet
			.createResource(
				URI.createFileURI(String.valueOf(new Date().getTime()))
					.appendFileExtension(UMLResource.FILE_EXTENSION))
			.getContents().add(comment2);

		EList<EObject> contents = resourceSet.createResource(
			URI.createFileURI(String.valueOf(new Date().getTime()))
				.appendFileExtension(UMLResource.FILE_EXTENSION)).getContents();

		Model model = UMLFactory.eINSTANCE.createModel();
		contents.add(model);

		contents.add(getFixture());

		assertTrue(contents.contains(getFixture()));

		getFixture().destroy();

		assertFalse(contents.contains(getFixture()));

		final EList<Element> annotatedElements1 = comment1
			.getAnnotatedElements();
		final EList<Element> annotatedElements2 = comment2
			.getAnnotatedElements();

		annotatedElements1.add(getFixture());
		annotatedElements2.add(getFixture());

		final EList<PackageableElement> packagedElements = model
			.getPackagedElements();

		new UMLSwitch<Object>() {

			@Override
			public Object caseElement(Element element) {
				assertTrue(annotatedElements1.contains(element));
				assertTrue(annotatedElements2.contains(element));

				element.destroy();

				assertFalse(annotatedElements1.contains(element));
				assertFalse(annotatedElements2.contains(element));

				return element;
			}

			@Override
			public Object casePackageableElement(
					PackageableElement packageableElement) {
				caseElement(packageableElement);

				packagedElements.add(packageableElement);

				assertTrue(packagedElements.contains(packageableElement));

				packageableElement.destroy();

				assertFalse(packagedElements.contains(packageableElement));

				return packageableElement;
			}
		}.doSwitch(getFixture());
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.uml.Element#hasKeyword(java.lang.String) <em>Has Keyword</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.Element#hasKeyword(java.lang.String)
	 * @generated NOT
	 */
	public void testHasKeyword__String() {
		assertFalse(getFixture().hasKeyword(getName()));

		UML2Util
			.createEAnnotation(getFixture(),
				UMLUtil.UML2_UML_PACKAGE_2_0_NS_URI).getDetails()
			.put(getName(), null);

		assertTrue(getFixture().hasKeyword(getName()));
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.uml.Element#getKeywords() <em>Get Keywords</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.Element#getKeywords()
	 * @generated NOT
	 */
	public void testGetKeywords() {
		assertTrue(getFixture().getKeywords().isEmpty());

		UML2Util
			.createEAnnotation(getFixture(),
				UMLUtil.UML2_UML_PACKAGE_2_0_NS_URI).getDetails()
			.put(getName(), null);

		assertTrue(getFixture().getKeywords().contains(getName()));
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.uml.Element#addKeyword(java.lang.String) <em>Add Keyword</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.Element#addKeyword(java.lang.String)
	 * @generated NOT
	 */
	public void testAddKeyword__String() {
		assertNull(getFixture().getEAnnotation(
			UMLUtil.UML2_UML_PACKAGE_2_0_NS_URI));

		assertTrue(getFixture().addKeyword(getName()));

		EAnnotation eAnnotation = getFixture().getEAnnotation(
			UMLUtil.UML2_UML_PACKAGE_2_0_NS_URI);
		assertNotNull(eAnnotation);
		assertTrue(eAnnotation.getDetails().containsKey(getName()));

		assertFalse(getFixture().addKeyword(getName()));

		assertEquals(1, eAnnotation.getDetails().size());
		assertTrue(eAnnotation.getDetails().containsKey(getName()));
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.uml.Element#removeKeyword(java.lang.String) <em>Remove Keyword</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.Element#removeKeyword(java.lang.String)
	 * @generated NOT
	 */
	public void testRemoveKeyword__String() {
		assertFalse(getFixture().removeKeyword(getName()));

		EAnnotation eAnnotation = UML2Util.createEAnnotation(getFixture(),
			UMLUtil.UML2_UML_PACKAGE_2_0_NS_URI);
		eAnnotation.getDetails().put(getName(), null);

		assertTrue(getFixture().removeKeyword(getName()));

		assertFalse(eAnnotation.getDetails().containsKey(getName()));

		assertFalse(getFixture().removeKeyword(getName()));
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.uml.Element#getNearestPackage() <em>Get Nearest Package</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.Element#getNearestPackage()
	 * @generated NOT
	 */
	public void testGetNearestPackage() {

		new UMLSwitch<Object>() {

			@Override
			public Object caseElement(Element element) {
				assertNull(element.getNearestPackage());

				return element;
			}

			@Override
			public Object casePackage(org.eclipse.uml2.uml.Package package_) {
				assertSame(package_, package_.getNearestPackage());

				return package_;
			}

			@Override
			public Object casePackageableElement(
					PackageableElement packageableElement) {
				caseElement(packageableElement);

				org.eclipse.uml2.uml.Package nestingPackage = UMLFactory.eINSTANCE
					.createPackage();
				org.eclipse.uml2.uml.Package nestedPackage = nestingPackage
					.createNestedPackage(null);

				nestedPackage.getPackagedElements().add(packageableElement);

				assertSame(nestedPackage,
					packageableElement.getNearestPackage());

				return packageableElement;
			}
		}.doSwitch(getFixture());
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.uml.Element#getModel() <em>Get Model</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.Element#getModel()
	 * @generated NOT
	 */
	public void testGetModel() {

		new UMLSwitch<Object>() {

			@Override
			public Object caseElement(Element element) {
				assertNull(element.getModel());

				return element;
			}

			@Override
			public Object caseModel(Model model) {
				assertSame(model, model.getModel());

				return model;
			}

			@Override
			public Object casePackageableElement(
					PackageableElement packageableElement) {
				caseElement(packageableElement);

				Model model = UMLFactory.eINSTANCE.createModel();
				org.eclipse.uml2.uml.Package nestedPackage = model
					.createNestedPackage(null);

				nestedPackage.getPackagedElements().add(packageableElement);

				assertSame(model, packageableElement.getModel());

				return packageableElement;
			}
		}.doSwitch(getFixture());
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.uml.Element#isStereotypeApplicable(org.eclipse.uml2.uml.Stereotype) <em>Is Stereotype Applicable</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.Element#isStereotypeApplicable(org.eclipse.uml2.uml.Stereotype)
	 * @generated
	 */
	public void testIsStereotypeApplicable__Stereotype() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.uml.Element#isStereotypeRequired(org.eclipse.uml2.uml.Stereotype) <em>Is Stereotype Required</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.Element#isStereotypeRequired(org.eclipse.uml2.uml.Stereotype)
	 * @generated
	 */
	public void testIsStereotypeRequired__Stereotype() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.uml.Element#isStereotypeApplied(org.eclipse.uml2.uml.Stereotype) <em>Is Stereotype Applied</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.Element#isStereotypeApplied(org.eclipse.uml2.uml.Stereotype)
	 * @generated
	 */
	public void testIsStereotypeApplied__Stereotype() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.uml.Element#applyStereotype(org.eclipse.uml2.uml.Stereotype) <em>Apply Stereotype</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.Element#applyStereotype(org.eclipse.uml2.uml.Stereotype)
	 * @generated
	 */
	public void testApplyStereotype__Stereotype() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.uml.Element#unapplyStereotype(org.eclipse.uml2.uml.Stereotype) <em>Unapply Stereotype</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.Element#unapplyStereotype(org.eclipse.uml2.uml.Stereotype)
	 * @generated
	 */
	public void testUnapplyStereotype__Stereotype() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.uml.Element#getApplicableStereotypes() <em>Get Applicable Stereotypes</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.Element#getApplicableStereotypes()
	 * @generated
	 */
	public void testGetApplicableStereotypes() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.uml.Element#getApplicableStereotype(java.lang.String) <em>Get Applicable Stereotype</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.Element#getApplicableStereotype(java.lang.String)
	 * @generated
	 */
	public void testGetApplicableStereotype__String() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.uml.Element#getStereotypeApplications() <em>Get Stereotype Applications</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.Element#getStereotypeApplications()
	 * @generated
	 */
	public void testGetStereotypeApplications() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.uml.Element#getStereotypeApplication(org.eclipse.uml2.uml.Stereotype) <em>Get Stereotype Application</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.Element#getStereotypeApplication(org.eclipse.uml2.uml.Stereotype)
	 * @generated
	 */
	public void testGetStereotypeApplication__Stereotype() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.uml.Element#getRequiredStereotypes() <em>Get Required Stereotypes</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.Element#getRequiredStereotypes()
	 * @generated
	 */
	public void testGetRequiredStereotypes() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.uml.Element#getRequiredStereotype(java.lang.String) <em>Get Required Stereotype</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.Element#getRequiredStereotype(java.lang.String)
	 * @generated
	 */
	public void testGetRequiredStereotype__String() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.uml.Element#getAppliedStereotypes() <em>Get Applied Stereotypes</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.Element#getAppliedStereotypes()
	 * @generated
	 */
	public void testGetAppliedStereotypes() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.uml.Element#getAppliedStereotype(java.lang.String) <em>Get Applied Stereotype</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.Element#getAppliedStereotype(java.lang.String)
	 * @generated
	 */
	public void testGetAppliedStereotype__String() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.uml.Element#getAppliedSubstereotypes(org.eclipse.uml2.uml.Stereotype) <em>Get Applied Substereotypes</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.Element#getAppliedSubstereotypes(org.eclipse.uml2.uml.Stereotype)
	 * @generated
	 */
	public void testGetAppliedSubstereotypes__Stereotype() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.uml.Element#getAppliedSubstereotype(org.eclipse.uml2.uml.Stereotype, java.lang.String) <em>Get Applied Substereotype</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.Element#getAppliedSubstereotype(org.eclipse.uml2.uml.Stereotype, java.lang.String)
	 * @generated
	 */
	public void testGetAppliedSubstereotype__Stereotype_String() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.uml.Element#hasValue(org.eclipse.uml2.uml.Stereotype, java.lang.String) <em>Has Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.Element#hasValue(org.eclipse.uml2.uml.Stereotype, java.lang.String)
	 * @generated
	 */
	public void testHasValue__Stereotype_String() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.uml.Element#getValue(org.eclipse.uml2.uml.Stereotype, java.lang.String) <em>Get Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.Element#getValue(org.eclipse.uml2.uml.Stereotype, java.lang.String)
	 * @generated
	 */
	public void testGetValue__Stereotype_String() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.uml.Element#setValue(org.eclipse.uml2.uml.Stereotype, java.lang.String, java.lang.Object) <em>Set Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.Element#setValue(org.eclipse.uml2.uml.Stereotype, java.lang.String, java.lang.Object)
	 * @generated
	 */
	public void testSetValue__Stereotype_String_Object() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.uml.Element#createEAnnotation(java.lang.String) <em>Create EAnnotation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.Element#createEAnnotation(java.lang.String)
	 * @generated NOT
	 */
	public void testCreateEAnnotation__String() {
		EAnnotation eAnnotation = getFixture().createEAnnotation(null);

		assertSame(getFixture(), eAnnotation.getEModelElement());
		assertNull(eAnnotation.getSource());

		eAnnotation = getFixture().createEAnnotation(getName());

		assertSame(getFixture(), eAnnotation.getEModelElement());
		assertSame(getName(), eAnnotation.getSource());
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.uml.Element#getRelationships() <em>Get Relationships</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.Element#getRelationships()
	 * @generated
	 */
	public void testGetRelationships() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.uml.Element#getRelationships(org.eclipse.emf.ecore.EClass) <em>Get Relationships</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.Element#getRelationships(org.eclipse.emf.ecore.EClass)
	 * @generated
	 */
	public void testGetRelationships__EClass() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.uml.Element#getSourceDirectedRelationships() <em>Get Source Directed Relationships</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.Element#getSourceDirectedRelationships()
	 * @generated
	 */
	public void testGetSourceDirectedRelationships() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.uml.Element#getSourceDirectedRelationships(org.eclipse.emf.ecore.EClass) <em>Get Source Directed Relationships</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.Element#getSourceDirectedRelationships(org.eclipse.emf.ecore.EClass)
	 * @generated
	 */
	public void testGetSourceDirectedRelationships__EClass() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.uml.Element#getTargetDirectedRelationships() <em>Get Target Directed Relationships</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.Element#getTargetDirectedRelationships()
	 * @generated
	 */
	public void testGetTargetDirectedRelationships() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.uml.Element#getTargetDirectedRelationships(org.eclipse.emf.ecore.EClass) <em>Get Target Directed Relationships</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.Element#getTargetDirectedRelationships(org.eclipse.emf.ecore.EClass)
	 * @generated
	 */
	public void testGetTargetDirectedRelationships__EClass() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.uml.Element#allOwnedElements() <em>All Owned Elements</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.Element#allOwnedElements()
	 * @generated NOT
	 */
	public void testAllOwnedElements() {
		EList<Element> allOwnedElements = getFixture().allOwnedElements();

		assertTrue(allOwnedElements
			.containsAll(getFixture().getOwnedElements()));

		for (Element ownedElement : allOwnedElements) {
			assertTrue(allOwnedElements.containsAll(ownedElement
				.allOwnedElements()));
		}
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.uml.Element#mustBeOwned() <em>Must Be Owned</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.Element#mustBeOwned()
	 * @generated NOT
	 */
	public void testMustBeOwned() {
		assertTrue(getFixture().mustBeOwned());
	}

	protected EList<EClass> getEAllSubClasses(EClass eClass) {
		EList<EClass> eAllSubClasses = new UniqueEList.FastCompare<EClass>();

		for (EClassifier eClassifier : UMLPackage.eINSTANCE.getEClassifiers()) {

			if (eClassifier instanceof EClass) {
				EClass umlEClass = (EClass) eClassifier;

				if (eClass.isSuperTypeOf(umlEClass) && !umlEClass.isAbstract()) {
					eAllSubClasses.add(umlEClass);
				}
			}
		}

		return eAllSubClasses;
	}

} //ElementTest
