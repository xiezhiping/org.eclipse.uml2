/*
 * Copyright (c) 2003, 2006 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *
 * $Id: PropertyTest.java,v 1.4 2006/05/29 17:27:34 khussey Exp $
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
 *   <li>{@link org.eclipse.uml2.DeploymentTarget#getDeployedElements() <em>Deployed Element</em>}</li>
 *   <li>{@link org.eclipse.uml2.Property#getDefault() <em>Default</em>}</li>
 *   <li>{@link org.eclipse.uml2.Property#isComposite() <em>Is Composite</em>}</li>
 *   <li>{@link org.eclipse.uml2.Property#getClass_() <em>Class </em>}</li>
 *   <li>{@link org.eclipse.uml2.Property#getOpposite() <em>Opposite</em>}</li>
 * </ul>
 * </p>
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link org.eclipse.uml2.Property#validateOppositeIsOtherEnd(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Opposite Is Other End</em>}</li>
 *   <li>{@link org.eclipse.uml2.Property#opposite() <em>Opposite</em>}</li>
 *   <li>{@link org.eclipse.uml2.Property#validateMultiplicityOfComposite(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Multiplicity Of Composite</em>}</li>
 *   <li>{@link org.eclipse.uml2.Property#validateSubsettingContext(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Subsetting Context</em>}</li>
 *   <li>{@link org.eclipse.uml2.Property#validateNavigablePropertyRedefinition(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Navigable Property Redefinition</em>}</li>
 *   <li>{@link org.eclipse.uml2.Property#validateSubsettingRules(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Subsetting Rules</em>}</li>
 *   <li>{@link org.eclipse.uml2.Property#validateNavigableReadonly(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Navigable Readonly</em>}</li>
 *   <li>{@link org.eclipse.uml2.Property#validateDerivedUnionIsDerived(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Derived Union Is Derived</em>}</li>
 *   <li>{@link org.eclipse.uml2.Property#subsettingContext() <em>Subsetting Context</em>}</li>
 *   <li>{@link org.eclipse.uml2.Property#isConsistentWith(org.eclipse.uml2.RedefinableElement) <em>Is Consistent With</em>}</li>
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
	public static final String copyright = "Copyright (c) IBM Corporation and others."; //$NON-NLS-1$

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
	 * Tests the '{@link org.eclipse.uml2.Property#validateOppositeIsOtherEnd(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Opposite Is Other End</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.Property#validateOppositeIsOtherEnd(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	public void testValidateOppositeIsOtherEnd__DiagnosticChain_Map() {
		// TODO: implement this feature getter test method
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
		// TODO: implement this feature getter test method
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
		// TODO: implement this feature getter test method
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
		// TODO: implement this feature getter test method
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
		// TODO: implement this feature getter test method
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
		// TODO: implement this feature getter test method
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
		// TODO: implement this feature getter test method
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
		// TODO: implement this feature getter test method
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
		// TODO: implement this feature getter test method
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
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	public void testGetNamespace() {
		super.testGetNamespace();

		assertSame(getFixture().getClass_(), getFixture().getNamespace());

		UML2Factory.eINSTANCE.createAssociation().getOwnedEnds().add(getFixture());
		assertSame(getFixture().getOwningAssociation(), getFixture().getNamespace());

		UML2Factory.eINSTANCE.createPrimitiveType().getOwnedAttributes().add(getFixture());
		assertSame(getFixture().getDatatype(), getFixture().getNamespace());
	}

	public void testGetFeaturingClassifiers() {
		super.testGetFeaturingClassifiers();

		assertTrue(getFixture().getFeaturingClassifiers().contains(getFixture().getClass_()));

		getFixture().setOwningAssociation(UML2Factory.eINSTANCE.createAssociation());

		assertTrue(getFixture().getFeaturingClassifiers().contains(getFixture().getOwningAssociation()));

		for (Iterator eAllSubClasses = getEAllSubClasses(UML2Package.eINSTANCE.getDataType()).iterator(); eAllSubClasses.hasNext();) {
			getFixture().setDatatype((DataType) UML2Factory.eINSTANCE.create((EClass) eAllSubClasses.next()));

			assertTrue(getFixture().getFeaturingClassifiers().contains(getFixture().getDatatype()));
		}
	}

	public void testGetRedefinedElements() {
		super.testGetRedefinedElements();

		assertTrue(getFixture().getRedefinedElements().containsAll(getFixture().getRedefinedProperties()));
	}

	public void testGetOwnedElements() {
		super.testGetOwnedElements();

		assertTrue(getFixture().getOwnedElements().contains(getFixture().getDefaultValue()));
		assertTrue(getFixture().getOwnedElements().containsAll(getFixture().getQualifiers()));
	}

	public void testGetOwner() {
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
