/*
 * Copyright (c) 2005, 2014 IBM Corporation, CEA, and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *   Kenn Hussey (CEA) - 327039, 351774, 418466
 *
 */
package org.eclipse.uml2.uml.tests;

import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.UMLPackage;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Classifier</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are tested:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.Type#getPackage() <em>Package</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Classifier#getGenerals() <em>General</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Classifier#getInheritedMembers() <em>Inherited Member</em>}</li>
 * </ul>
 * </p>
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.RedefinableElement#validateRedefinitionConsistent(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Redefinition Consistent</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.RedefinableElement#validateNonLeafRedefinition(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Leaf Redefinition</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.RedefinableElement#validateRedefinitionContextValid(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Redefinition Context Valid</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.RedefinableElement#isConsistentWith(org.eclipse.uml2.uml.RedefinableElement) <em>Is Consistent With</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.RedefinableElement#isRedefinitionContextValid(org.eclipse.uml2.uml.RedefinableElement) <em>Is Redefinition Context Valid</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.ParameterableElement#isCompatibleWith(org.eclipse.uml2.uml.ParameterableElement) <em>Is Compatible With</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.ParameterableElement#isTemplateParameter() <em>Is Template Parameter</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.PackageableElement#validateNamespaceNeedsVisibility(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Namespace Needs Visibility</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Type#createAssociation(boolean, org.eclipse.uml2.uml.AggregationKind, java.lang.String, int, int, org.eclipse.uml2.uml.Type, boolean, org.eclipse.uml2.uml.AggregationKind, java.lang.String, int, int) <em>Create Association</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Type#getAssociations() <em>Get Associations</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Classifier#conformsTo(org.eclipse.uml2.uml.Type) <em>Conforms To</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Classifier#isTemplate() <em>Is Template</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.TemplateableElement#parameterableElements() <em>Parameterable Elements</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Classifier#validateSpecializeType(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Specialize Type</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Classifier#validateMapsToGeneralizationSet(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Maps To Generalization Set</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Classifier#validateNonFinalParents(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Final Parents</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Classifier#validateNoCyclesInGeneralization(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate No Cycles In Generalization</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Classifier#getAllAttributes() <em>Get All Attributes</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Classifier#getAllOperations() <em>Get All Operations</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Classifier#getAllUsedInterfaces() <em>Get All Used Interfaces</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Classifier#getOperation(java.lang.String, org.eclipse.emf.common.util.EList, org.eclipse.emf.common.util.EList) <em>Get Operation</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Classifier#getOperation(java.lang.String, org.eclipse.emf.common.util.EList, org.eclipse.emf.common.util.EList, boolean) <em>Get Operation</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Classifier#getOperations() <em>Get Operations</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Classifier#getUsedInterfaces() <em>Get Used Interfaces</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Classifier#allFeatures() <em>All Features</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Classifier#allParents() <em>All Parents</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Classifier#hasVisibilityOf(org.eclipse.uml2.uml.NamedElement) <em>Has Visibility Of</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Classifier#inherit(org.eclipse.emf.common.util.EList) <em>Inherit</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Classifier#inheritableMembers(org.eclipse.uml2.uml.Classifier) <em>Inheritable Members</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Classifier#maySpecializeType(org.eclipse.uml2.uml.Classifier) <em>May Specialize Type</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Classifier#parents() <em>Parents</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Classifier#directlyRealizedInterfaces() <em>Directly Realized Interfaces</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Classifier#directlyUsedInterfaces() <em>Directly Used Interfaces</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Classifier#allRealizedInterfaces() <em>All Realized Interfaces</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Classifier#allUsedInterfaces() <em>All Used Interfaces</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Classifier#isSubstitutableFor(org.eclipse.uml2.uml.Classifier) <em>Is Substitutable For</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Classifier#allAttributes() <em>All Attributes</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Classifier#allSlottableFeatures() <em>All Slottable Features</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public abstract class ClassifierTest
		extends NamespaceTest {

	/**
	 * Constructs a new Classifier test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassifierTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Classifier test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Classifier getFixture() {
		return (Classifier) fixture;
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.uml.Type#getPackage() <em>Package</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.Type#getPackage()
	 * @generated
	 */
	public void testGetPackage() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.uml.Type#setPackage(org.eclipse.uml2.uml.Package) <em>Package</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.Type#setPackage(org.eclipse.uml2.uml.Package)
	 * @generated
	 */
	public void testSetPackage() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.uml.Classifier#getInheritedMembers() <em>Inherited Member</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.Classifier#getInheritedMembers()
	 * @generated
	 */
	public void testGetInheritedMembers() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.uml.Classifier#getGenerals() <em>General</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.Classifier#getGenerals()
	 * @generated
	 */
	public void testGetGenerals() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.uml.RedefinableElement#validateRedefinitionContextValid(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Redefinition Context Valid</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.RedefinableElement#validateRedefinitionContextValid(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	public void testValidateRedefinitionContextValid__DiagnosticChain_Map() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.uml.RedefinableElement#validateRedefinitionConsistent(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Redefinition Consistent</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.RedefinableElement#validateRedefinitionConsistent(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	public void testValidateRedefinitionConsistent__DiagnosticChain_Map() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.uml.RedefinableElement#validateNonLeafRedefinition(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Leaf Redefinition</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.RedefinableElement#validateNonLeafRedefinition(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	public void testValidateNonLeafRedefinition__DiagnosticChain_Map() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.uml.RedefinableElement#isRedefinitionContextValid(org.eclipse.uml2.uml.RedefinableElement) <em>Is Redefinition Context Valid</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.RedefinableElement#isRedefinitionContextValid(org.eclipse.uml2.uml.RedefinableElement)
	 * @generated
	 */
	public void testIsRedefinitionContextValid__RedefinableElement() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.uml.RedefinableElement#isConsistentWith(org.eclipse.uml2.uml.RedefinableElement) <em>Is Consistent With</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.RedefinableElement#isConsistentWith(org.eclipse.uml2.uml.RedefinableElement)
	 * @generated
	 */
	public void testIsConsistentWith__RedefinableElement() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.uml.ParameterableElement#isCompatibleWith(org.eclipse.uml2.uml.ParameterableElement) <em>Is Compatible With</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.ParameterableElement#isCompatibleWith(org.eclipse.uml2.uml.ParameterableElement)
	 * @generated
	 */
	public void testIsCompatibleWith__ParameterableElement() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.uml.ParameterableElement#isTemplateParameter() <em>Is Template Parameter</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.ParameterableElement#isTemplateParameter()
	 * @generated
	 */
	public void testIsTemplateParameter() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.uml.PackageableElement#validateNamespaceNeedsVisibility(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Namespace Needs Visibility</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.PackageableElement#validateNamespaceNeedsVisibility(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	public void testValidateNamespaceNeedsVisibility__DiagnosticChain_Map() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.uml.Type#createAssociation(boolean, org.eclipse.uml2.uml.AggregationKind, java.lang.String, int, int, org.eclipse.uml2.uml.Type, boolean, org.eclipse.uml2.uml.AggregationKind, java.lang.String, int, int) <em>Create Association</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.Type#createAssociation(boolean, org.eclipse.uml2.uml.AggregationKind, java.lang.String, int, int, org.eclipse.uml2.uml.Type, boolean, org.eclipse.uml2.uml.AggregationKind, java.lang.String, int, int)
	 * @generated
	 */
	public void testCreateAssociation__boolean_AggregationKind_String_int_int_Type_boolean_AggregationKind_String_int_int() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.uml.Type#getAssociations() <em>Get Associations</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.Type#getAssociations()
	 * @generated
	 */
	public void testGetAssociations() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.uml.TemplateableElement#parameterableElements() <em>Parameterable Elements</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.TemplateableElement#parameterableElements()
	 * @generated
	 */
	public void testParameterableElements() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.uml.Classifier#isTemplate() <em>Is Template</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.Classifier#isTemplate()
	 * @generated NOT
	 */
	public void testIsTemplate() {
		assertFalse(getFixture().isTemplate());

		getFixture().createOwnedTemplateSignature(
			UMLPackage.Literals.REDEFINABLE_TEMPLATE_SIGNATURE);

		assertTrue(getFixture().isTemplate());
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.uml.Classifier#validateNoCyclesInGeneralization(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate No Cycles In Generalization</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.Classifier#validateNoCyclesInGeneralization(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	public void testValidateNoCyclesInGeneralization__DiagnosticChain_Map() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.uml.Classifier#validateSpecializeType(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Specialize Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.Classifier#validateSpecializeType(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	public void testValidateSpecializeType__DiagnosticChain_Map() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.uml.Classifier#validateMapsToGeneralizationSet(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Maps To Generalization Set</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.Classifier#validateMapsToGeneralizationSet(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	public void testValidateMapsToGeneralizationSet__DiagnosticChain_Map() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.uml.Classifier#validateNonFinalParents(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Final Parents</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.Classifier#validateNonFinalParents(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	public void testValidateNonFinalParents__DiagnosticChain_Map() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.uml.Classifier#getAllAttributes() <em>Get All Attributes</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.Classifier#getAllAttributes()
	 * @generated
	 */
	public void testGetAllAttributes() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.uml.Classifier#getOperations() <em>Get Operations</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.Classifier#getOperations()
	 * @generated
	 */
	public void testGetOperations() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.uml.Classifier#getAllOperations() <em>Get All Operations</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.Classifier#getAllOperations()
	 * @generated
	 */
	public void testGetAllOperations() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.uml.Classifier#getOperation(java.lang.String, org.eclipse.emf.common.util.EList, org.eclipse.emf.common.util.EList) <em>Get Operation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.Classifier#getOperation(java.lang.String, org.eclipse.emf.common.util.EList, org.eclipse.emf.common.util.EList)
	 * @generated
	 */
	public void testGetOperation__String_EList_EList() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.uml.Classifier#getOperation(java.lang.String, org.eclipse.emf.common.util.EList, org.eclipse.emf.common.util.EList, boolean) <em>Get Operation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.Classifier#getOperation(java.lang.String, org.eclipse.emf.common.util.EList, org.eclipse.emf.common.util.EList, boolean)
	 * @generated
	 */
	public void testGetOperation__String_EList_EList_boolean() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.uml.Classifier#getUsedInterfaces() <em>Get Used Interfaces</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.Classifier#getUsedInterfaces()
	 * @generated
	 */
	public void testGetUsedInterfaces() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.uml.Classifier#getAllUsedInterfaces() <em>Get All Used Interfaces</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.Classifier#getAllUsedInterfaces()
	 * @generated
	 */
	public void testGetAllUsedInterfaces() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.uml.Classifier#maySpecializeType(org.eclipse.uml2.uml.Classifier) <em>May Specialize Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.Classifier#maySpecializeType(org.eclipse.uml2.uml.Classifier)
	 * @generated
	 */
	public void testMaySpecializeType__Classifier() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.uml.Classifier#allFeatures() <em>All Features</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.Classifier#allFeatures()
	 * @generated
	 */
	public void testAllFeatures() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.uml.Classifier#parents() <em>Parents</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.Classifier#parents()
	 * @generated
	 */
	public void testParents() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.uml.Classifier#directlyRealizedInterfaces() <em>Directly Realized Interfaces</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.Classifier#directlyRealizedInterfaces()
	 * @generated
	 */
	public void testDirectlyRealizedInterfaces() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.uml.Classifier#directlyUsedInterfaces() <em>Directly Used Interfaces</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.Classifier#directlyUsedInterfaces()
	 * @generated
	 */
	public void testDirectlyUsedInterfaces() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.uml.Classifier#allRealizedInterfaces() <em>All Realized Interfaces</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.Classifier#allRealizedInterfaces()
	 * @generated
	 */
	public void testAllRealizedInterfaces() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.uml.Classifier#allUsedInterfaces() <em>All Used Interfaces</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.Classifier#allUsedInterfaces()
	 * @generated
	 */
	public void testAllUsedInterfaces() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.uml.Classifier#isSubstitutableFor(org.eclipse.uml2.uml.Classifier) <em>Is Substitutable For</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.Classifier#isSubstitutableFor(org.eclipse.uml2.uml.Classifier)
	 * @generated
	 */
	public void testIsSubstitutableFor__Classifier() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.uml.Classifier#allAttributes() <em>All Attributes</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.Classifier#allAttributes()
	 * @generated
	 */
	public void testAllAttributes() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.uml.Classifier#allSlottableFeatures() <em>All Slottable Features</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.Classifier#allSlottableFeatures()
	 * @generated
	 */
	public void testAllSlottableFeatures() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.uml.Classifier#inheritableMembers(org.eclipse.uml2.uml.Classifier) <em>Inheritable Members</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.Classifier#inheritableMembers(org.eclipse.uml2.uml.Classifier)
	 * @generated
	 */
	public void testInheritableMembers__Classifier() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.uml.Classifier#hasVisibilityOf(org.eclipse.uml2.uml.NamedElement) <em>Has Visibility Of</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.Classifier#hasVisibilityOf(org.eclipse.uml2.uml.NamedElement)
	 * @generated
	 */
	public void testHasVisibilityOf__NamedElement() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.uml.Classifier#inherit(org.eclipse.emf.common.util.EList) <em>Inherit</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.Classifier#inherit(org.eclipse.emf.common.util.EList)
	 * @generated
	 */
	public void testInherit__EList() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.uml.Classifier#allParents() <em>All Parents</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.Classifier#allParents()
	 * @generated
	 */
	public void testAllParents() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.uml.Classifier#conformsTo(org.eclipse.uml2.uml.Type) <em>Conforms To</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.Classifier#conformsTo(org.eclipse.uml2.uml.Type)
	 * @generated
	 */
	public void testConformsTo__Type() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}
} //ClassifierTest
