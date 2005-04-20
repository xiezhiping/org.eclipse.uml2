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
 * $Id: PropertyTest.java,v 1.2 2005/04/20 19:00:46 khussey Exp $
 */
package org.eclipse.uml2.tests;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import junit.textui.TestRunner;

import org.eclipse.uml2.Property;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.uml2.AggregationKind;
import org.eclipse.uml2.Artifact;
import org.eclipse.uml2.Class;
import org.eclipse.uml2.DataType;
import org.eclipse.uml2.Deployment;
import org.eclipse.uml2.Manifestation;
import org.eclipse.uml2.PackageableElement;
import org.eclipse.uml2.UML2Factory;
import org.eclipse.uml2.UML2Package;
import org.eclipse.uml2.ValueSpecification;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Property</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are tested:
 * <ul>
 *   <li>{@link org.eclipse.uml2.ParameterableElement#getTemplateParameter() <em>Template Parameter</em>}</li>
 *   <li>{@link org.eclipse.uml2.ParameterableElement#getOwningParameter() <em>Owning Parameter</em>}</li>
 *   <li>{@link org.eclipse.uml2.DeploymentTarget#getDeployments() <em>Deployment</em>}</li>
 *   <li>{@link org.eclipse.uml2.DeploymentTarget#getDeployedElements() <em>Deployed Element</em>}</li>
 *   <li>{@link org.eclipse.uml2.Property#getDefault() <em>Default</em>}</li>
 *   <li>{@link org.eclipse.uml2.Property#isComposite() <em>Is Composite</em>}</li>
 *   <li>{@link org.eclipse.uml2.Property#getClass_() <em>Class </em>}</li>
 *   <li>{@link org.eclipse.uml2.Property#getOpposite() <em>Opposite</em>}</li>
 *   <li>{@link org.eclipse.uml2.Property#getOwningAssociation() <em>Owning Association</em>}</li>
 *   <li>{@link org.eclipse.uml2.Property#getAssociation() <em>Association</em>}</li>
 * </ul>
 * </p>
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link org.eclipse.uml2.ParameterableElement#getOwner() <em>Get Owner</em>}</li>
 *   <li>{@link org.eclipse.uml2.DeploymentTarget#getOwnedElements() <em>Get Owned Elements</em>}</li>
 *   <li>{@link org.eclipse.uml2.DeploymentTarget#getClientDependencies() <em>Get Client Dependencies</em>}</li>
 *   <li>{@link org.eclipse.uml2.Property#validateOppositeIsOtherEnd(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Opposite Is Other End</em>}</li>
 *   <li>{@link org.eclipse.uml2.Property#opposite() <em>Opposite</em>}</li>
 *   <li>{@link org.eclipse.uml2.Property#validateMultiplicityOfComposite(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Multiplicity Of Composite</em>}</li>
 *   <li>{@link org.eclipse.uml2.Property#validateSubsettingContext(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Subsetting Context</em>}</li>
 *   <li>{@link org.eclipse.uml2.Property#validateNavigablePropertyRedefinition(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Navigable Property Redefinition</em>}</li>
 *   <li>{@link org.eclipse.uml2.Property#validateSubsettingRules(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Subsetting Rules</em>}</li>
 *   <li>{@link org.eclipse.uml2.Property#validateNavigableReadonly(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Navigable Readonly</em>}</li>
 *   <li>{@link org.eclipse.uml2.Property#validateDerivedUnionIsDerived(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Derived Union Is Derived</em>}</li>
 *   <li>{@link org.eclipse.uml2.Property#isConsistentWith(org.eclipse.uml2.RedefinableElement) <em>Is Consistent With</em>}</li>
 *   <li>{@link org.eclipse.uml2.Property#subsettingContext() <em>Subsetting Context</em>}</li>
 *   <li>{@link org.eclipse.uml2.Property#isReadOnly() <em>Is Read Only</em>}</li>
 *   <li>{@link org.eclipse.uml2.Property#setIsReadOnly(boolean) <em>Set Is Read Only</em>}</li>
 *   <li>{@link org.eclipse.uml2.Property#getNamespace() <em>Get Namespace</em>}</li>
 *   <li>{@link org.eclipse.uml2.Property#getFeaturingClassifiers() <em>Get Featuring Classifiers</em>}</li>
 *   <li>{@link org.eclipse.uml2.Property#getRedefinedElements() <em>Get Redefined Elements</em>}</li>
 *   <li>{@link org.eclipse.uml2.Property#getOwnedElements() <em>Get Owned Elements</em>}</li>
 *   <li>{@link org.eclipse.uml2.Property#getOwner() <em>Get Owner</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class PropertyTest extends StructuralFeatureTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2003, 2005 IBM Corporation and others."; //$NON-NLS-1$

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(PropertyTest.class);
	}

	/**
	 * Constructs a new Property test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertyTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Property test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private Property getFixture() {
		return (Property)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	protected void setUp() throws Exception {
		setFixture(UML2Factory.eINSTANCE.createProperty());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	protected void tearDown() throws Exception {
		setFixture(null);
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.ParameterableElement#getTemplateParameter() <em>Template Parameter</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.ParameterableElement#getTemplateParameter()
	 * @generated
	 */
	public void testGetTemplateParameter() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.ParameterableElement#setTemplateParameter(org.eclipse.uml2.TemplateParameter) <em>Template Parameter</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.ParameterableElement#setTemplateParameter(org.eclipse.uml2.TemplateParameter)
	 * @generated
	 */
	public void testSetTemplateParameter() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.ParameterableElement#getOwningParameter() <em>Owning Parameter</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.ParameterableElement#getOwningParameter()
	 * @generated
	 */
	public void testGetOwningParameter() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.ParameterableElement#setOwningParameter(org.eclipse.uml2.TemplateParameter) <em>Owning Parameter</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.ParameterableElement#setOwningParameter(org.eclipse.uml2.TemplateParameter)
	 * @generated
	 */
	public void testSetOwningParameter() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.DeploymentTarget#getDeployments() <em>Deployment</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.DeploymentTarget#getDeployments()
	 * @generated
	 */
	public void testGetDeployments() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.DeploymentTarget#getDeployedElements() <em>Deployed Element</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.DeploymentTarget#getDeployedElements()
	 * @generated
	 */
	public void testGetDeployedElementsGen() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	public void testGetDeployedElements() {
		testGetDeployedElementsGen();
		
		List packageableElements = new ArrayList();

		for (Iterator eAllSubClasses = getEAllSubClasses(UML2Package.eINSTANCE.getPackageableElement()).iterator(); eAllSubClasses.hasNext();) {
			packageableElements.add(UML2Factory.eINSTANCE.create((EClass) eAllSubClasses.next()));
		}

		for (Iterator utilizedElements = packageableElements.iterator(); utilizedElements.hasNext();) {
			PackageableElement utilizedElement = (PackageableElement) utilizedElements.next();

			Deployment deployment = UML2Factory.eINSTANCE.createDeployment();

			Artifact deployedArtifact = UML2Factory.eINSTANCE.createArtifact();

			Manifestation manifestation = UML2Factory.eINSTANCE.createManifestation();
			manifestation.getSuppliers().add(utilizedElement);
			manifestation.setUtilizedElement(utilizedElement);

			deployedArtifact.getManifestations().add(manifestation);

			deployment.getDeployedArtifacts().add(deployedArtifact);

			getFixture().getDeployments().add(deployment);
		}

		assertTrue(getFixture().getDeployedElements().containsAll(packageableElements));
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.Property#getDefault() <em>Default</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.Property#getDefault()
	 * @generated
	 */
	public void testGetDefaultGen() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	public void testGetDefault() {
		testGetDefaultGen();
		
		getFixture().setDefaultValue(null);

		assertEquals("", getFixture().getDefault()); //$NON-NLS-1$

		for (Iterator eAllSubClasses = getEAllSubClasses(UML2Package.eINSTANCE.getValueSpecification()).iterator(); eAllSubClasses.hasNext();) {
			ValueSpecification defaultValue = (ValueSpecification) UML2Factory.eINSTANCE.create((EClass) eAllSubClasses.next());

			getFixture().setDefaultValue(defaultValue);

			assertEquals(defaultValue.stringValue(), getFixture().getDefault());
		}
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.Property#isComposite() <em>Is Composite</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.Property#isComposite()
	 * @generated
	 */
	public void testIsCompositeGen() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	public void testIsComposite() {
		testIsCompositeGen();
		
		getFixture().setAggregation(null);
		assertFalse(getFixture().isComposite());

		getFixture().setAggregation(AggregationKind.COMPOSITE_LITERAL);
		assertTrue(getFixture().isComposite());

		getFixture().setAggregation(AggregationKind.NONE_LITERAL);
		assertFalse(getFixture().isComposite());

		getFixture().setAggregation(AggregationKind.SHARED_LITERAL);
		assertFalse(getFixture().isComposite());
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.Property#getClass_() <em>Class </em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.Property#getClass_()
	 * @generated
	 */
	public void testGetClass_Gen() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	public void testGetClass_() {
		testGetClass_Gen();

		for (Iterator eAllSubClasses = getEAllSubClasses(UML2Package.eINSTANCE.getClass_()).iterator(); eAllSubClasses.hasNext();) {
			Class class_ = (Class) UML2Factory.eINSTANCE.create((EClass) eAllSubClasses.next());
			class_.getOwnedAttributes().add(getFixture());

			assertSame(class_, getFixture().getClass_());
		}
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.Property#getOpposite() <em>Opposite</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.Property#getOpposite()
	 * @generated
	 */
	public void testGetOpposite() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.Property#getOwningAssociation() <em>Owning Association</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.Property#getOwningAssociation()
	 * @generated
	 */
	public void testGetOwningAssociation() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.Property#setOwningAssociation(org.eclipse.uml2.Association) <em>Owning Association</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.Property#setOwningAssociation(org.eclipse.uml2.Association)
	 * @generated
	 */
	public void testSetOwningAssociation() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.Property#getAssociation() <em>Association</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.Property#getAssociation()
	 * @generated
	 */
	public void testGetAssociation() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.Property#setAssociation(org.eclipse.uml2.Association) <em>Association</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.Property#setAssociation(org.eclipse.uml2.Association)
	 * @generated
	 */
	public void testSetAssociation() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.DeploymentTarget#getClientDependencies() <em>Get Client Dependencies</em>}' getter operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.DeploymentTarget#getClientDependencies()
	 * @generated
	 */
	public void testGetClientDependencies() {
		// TODO: implement this getter operation test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.Property#validateOppositeIsOtherEnd(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Opposite Is Other End</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.Property#validateOppositeIsOtherEnd(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	public void testValidateOppositeIsOtherEnd__DiagnosticChain_Map() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.Property#opposite() <em>Opposite</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.Property#opposite()
	 * @generated
	 */
	public void testOpposite() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.Property#validateMultiplicityOfComposite(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Multiplicity Of Composite</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.Property#validateMultiplicityOfComposite(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	public void testValidateMultiplicityOfComposite__DiagnosticChain_Map() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.Property#validateSubsettingContext(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Subsetting Context</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.Property#validateSubsettingContext(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	public void testValidateSubsettingContext__DiagnosticChain_Map() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.Property#validateNavigablePropertyRedefinition(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Navigable Property Redefinition</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.Property#validateNavigablePropertyRedefinition(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	public void testValidateNavigablePropertyRedefinition__DiagnosticChain_Map() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.Property#validateSubsettingRules(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Subsetting Rules</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.Property#validateSubsettingRules(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	public void testValidateSubsettingRules__DiagnosticChain_Map() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.Property#validateNavigableReadonly(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Navigable Readonly</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.Property#validateNavigableReadonly(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	public void testValidateNavigableReadonly__DiagnosticChain_Map() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.Property#validateDerivedUnionIsDerived(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Derived Union Is Derived</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.Property#validateDerivedUnionIsDerived(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	public void testValidateDerivedUnionIsDerived__DiagnosticChain_Map() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.Property#isConsistentWith(org.eclipse.uml2.RedefinableElement) <em>Is Consistent With</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.Property#isConsistentWith(org.eclipse.uml2.RedefinableElement)
	 * @generated
	 */
	public void testIsConsistentWith__RedefinableElement() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.Property#subsettingContext() <em>Subsetting Context</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.Property#subsettingContext()
	 * @generated
	 */
	public void testSubsettingContext() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.Property#isReadOnly() <em>Is Read Only</em>}' getter operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.Property#isReadOnly()
	 * @generated
	 */
	public void testIsReadOnlyGen() {
		// TODO: implement this getter operation test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	public void testIsReadOnly() {
		testIsReadOnlyGen();
		
		getFixture().setIsReadOnly(false);
		assertEquals(false, getFixture().isReadOnly());

		getFixture().setIsReadOnly(true);
		assertEquals(true, getFixture().isReadOnly());
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.Property#setIsReadOnly(boolean) <em>Set Is Read Only</em>}' setter operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.Property#setIsReadOnly(boolean)
	 * @generated
	 */
	public void testSetIsReadOnlyGen() {
		// TODO: implement this setter operation test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	public void testSetIsReadOnly() {
		testSetIsReadOnlyGen();
		
		getFixture().setIsReadOnly(false);
		assertFalse(getFixture().isReadOnly());

		getFixture().setIsReadOnly(true);
		assertTrue(getFixture().isReadOnly());
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.Property#getNamespace() <em>Get Namespace</em>}' getter operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.Property#getNamespace()
	 * @generated
	 */
	public void testGetNamespaceGen() {
		// TODO: implement this getter operation test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	public void testGetNamespace() {
		testGetNamespaceGen();
		
		super.testGetNamespace();

		assertSame(getFixture().getClass_(), getFixture().getNamespace());

		UML2Factory.eINSTANCE.createAssociation().getOwnedEnds().add(getFixture());
		assertSame(getFixture().getOwningAssociation(), getFixture().getNamespace());

		UML2Factory.eINSTANCE.createPrimitiveType().getOwnedAttributes().add(getFixture());
		assertSame(getFixture().getDatatype(), getFixture().getNamespace());
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.Property#getFeaturingClassifiers() <em>Get Featuring Classifiers</em>}' getter operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.Property#getFeaturingClassifiers()
	 * @generated
	 */
	public void testGetFeaturingClassifiersGen() {
		// TODO: implement this getter operation test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	public void testGetFeaturingClassifiers() {
		testGetFeaturingClassifiersGen();
		
		super.testGetFeaturingClassifiers();

		assertTrue(getFixture().getFeaturingClassifiers().contains(getFixture().getClass_()));

		getFixture().setOwningAssociation(UML2Factory.eINSTANCE.createAssociation());

		assertTrue(getFixture().getFeaturingClassifiers().contains(getFixture().getOwningAssociation()));

		for (Iterator eAllSubClasses = getEAllSubClasses(UML2Package.eINSTANCE.getDataType()).iterator(); eAllSubClasses.hasNext();) {
			getFixture().setDatatype((DataType) UML2Factory.eINSTANCE.create((EClass) eAllSubClasses.next()));

			assertTrue(getFixture().getFeaturingClassifiers().contains(getFixture().getDatatype()));
		}
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.Property#getRedefinedElements() <em>Get Redefined Elements</em>}' getter operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.Property#getRedefinedElements()
	 * @generated
	 */
	public void testGetRedefinedElementsGen() {
		// TODO: implement this getter operation test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	public void testGetRedefinedElements() {
		testGetRedefinedElementsGen();
		
		super.testGetRedefinedElements();

		assertTrue(getFixture().getRedefinedElements().containsAll(getFixture().getRedefinedProperties()));
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.Property#getOwnedElements() <em>Get Owned Elements</em>}' getter operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.Property#getOwnedElements()
	 * @generated
	 */
	public void testGetOwnedElementsGen() {
		// TODO: implement this getter operation test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	public void testGetOwnedElements() {
		testGetOwnedElementsGen();
		
		super.testGetOwnedElements();

		assertTrue(getFixture().getOwnedElements().contains(getFixture().getDefaultValue()));
		assertTrue(getFixture().getOwnedElements().containsAll(getFixture().getQualifiers()));
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.Property#getOwner() <em>Get Owner</em>}' getter operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.Property#getOwner()
	 * @generated
	 */
	public void testGetOwnerGen() {
		// TODO: implement this getter operation test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	public void testGetOwner() {
		testGetOwnerGen();
		
		super.testGetOwner();

		assertSame(getFixture().getAssociationEnd(), getFixture().getOwner());
	}

	/* (non-Javadoc)
	 * @see org.eclipse.uml2.impl.tests.NamedElementImplTest#setUpNamespace()
	 */
	protected void setUpNamespace() {
		UML2Factory.eINSTANCE.createClass().getOwnedAttributes().add(getFixture());
	}

	/* (non-Javadoc)
	 * @see org.eclipse.uml2.impl.tests.ElementImplTest#setUpOwner()
	 */
	protected void setUpOwner() {
		UML2Factory.eINSTANCE.createProperty().getQualifiers().add(getFixture());
	}

	/* (non-Javadoc)
	 * @see org.eclipse.uml2.impl.tests.ElementImplTest#setUpOwnedElements()
	 */
	protected void setUpOwnedElements() {
		super.setUpOwnedElements();

		getFixture().setDefaultValue(UML2Factory.eINSTANCE.createLiteralNull());

		getFixture().getQualifiers().add(UML2Factory.eINSTANCE.createProperty());
		getFixture().getQualifiers().add(UML2Factory.eINSTANCE.createProperty());
	}

	/* (non-Javadoc)
	 * @see org.eclipse.uml2.impl.tests.RedefinableElementImplTest#setUpRedefinedElements()
	 */
	protected void setUpRedefinedElements() {
		super.setUpRedefinedElements();

		getFixture().getRedefinedProperties().add(UML2Factory.eINSTANCE.createProperty());
		getFixture().getRedefinedProperties().add(UML2Factory.eINSTANCE.createProperty());
	}

	/* (non-Javadoc)
	 * @see org.eclipse.uml2.impl.tests.FeatureImplTest#setUpFeaturingClassifiers()
	 */
	protected void setUpFeaturingClassifiers() {
		super.setUpFeaturingClassifiers();

		UML2Factory.eINSTANCE.createClass().getOwnedAttributes().add(getFixture());
	}

} //PropertyImplTest
