/*
 * Copyright (c) 2003, 2004 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Common Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/cpl-v10.html
 *
 * Contributors:
 *   IBM - Initial API and implementation
 *
 * $Id: PropertyImplTest.java,v 1.3 2004/05/20 03:03:32 khussey Exp $
 */
package org.eclipse.uml2.impl.tests;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import junit.textui.TestRunner;

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
import org.eclipse.uml2.impl.PropertyImpl;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Property</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are tested:
 * <ul>
 *   <li>{@link org.eclipse.uml2.impl.PropertyImpl#getTemplateParameter() <em>Template Parameter</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.PropertyImpl#getOwningParameter() <em>Owning Parameter</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.PropertyImpl#getDeployments() <em>Deployment</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.PropertyImpl#getDeployedElements() <em>Deployed Element</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.PropertyImpl#getDefault() <em>Default</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.PropertyImpl#isComposite() <em>Is Composite</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.PropertyImpl#getClass_() <em>Class </em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.PropertyImpl#getOpposite() <em>Opposite</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.PropertyImpl#getOwningAssociation() <em>Owning Association</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.PropertyImpl#getAssociation() <em>Association</em>}</li>
 * </ul>
 * </p>
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link org.eclipse.uml2.impl.PropertyImpl#getOwner() <em>Get Owner</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.PropertyImpl#getOwnedElements() <em>Get Owned Elements</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.PropertyImpl#getClientDependencies() <em>Get Client Dependencies</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.PropertyImpl#validateOppositeIsOtherEnd(EDiagnosticChain, EMap) <em>Validate Opposite Is Other End</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.PropertyImpl#opposite() <em>Opposite</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.PropertyImpl#validateMultiplicityOfComposite(EDiagnosticChain, EMap) <em>Validate Multiplicity Of Composite</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.PropertyImpl#validateSubsettingContext(EDiagnosticChain, EMap) <em>Validate Subsetting Context</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.PropertyImpl#validateNavigablePropertyRedefinition(EDiagnosticChain, EMap) <em>Validate Navigable Property Redefinition</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.PropertyImpl#validateSubsettingRules(EDiagnosticChain, EMap) <em>Validate Subsetting Rules</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.PropertyImpl#validateNavigableReadonly(EDiagnosticChain, EMap) <em>Validate Navigable Readonly</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.PropertyImpl#validateDerivedUnionIsDerived(EDiagnosticChain, EMap) <em>Validate Derived Union Is Derived</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.PropertyImpl#isConsistentWith(RedefinableElement) <em>Is Consistent With</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.PropertyImpl#subsettingContext() <em>Subsetting Context</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.PropertyImpl#isReadOnly() <em>Is Read Only</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.PropertyImpl#setIsReadOnly(Boolean) <em>Set Is Read Only</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.PropertyImpl#getNamespace() <em>Get Namespace</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.PropertyImpl#getFeaturingClassifiers() <em>Get Featuring Classifiers</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.PropertyImpl#getRedefinedElements() <em>Get Redefined Elements</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.PropertyImpl#getOwnedElements() <em>Get Owned Elements</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.PropertyImpl#getOwner() <em>Get Owner</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class PropertyImplTest extends StructuralFeatureImplTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2003, 2004 IBM Corporation and others."; //$NON-NLS-1$

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(PropertyImplTest.class);
	}

	/**
	 * Constructs a new Property test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertyImplTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Property test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private PropertyImpl getFixture() {
		return (PropertyImpl) fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	protected void setUp() throws Exception {
		setFixture((PropertyImpl) UML2Factory.eINSTANCE.createProperty());
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
	 * Tests the '{@link org.eclipse.uml2.impl.PropertyImpl#getTemplateParameter() <em>Template Parameter</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.PropertyImpl#getTemplateParameter()
	 * @generated
	 */
	public void testGetTemplateParameter() {
		// TODO: implement this feature getter test method
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.impl.PropertyImpl#setTemplateParameter() <em>Template Parameter</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.PropertyImpl#setTemplateParameter()
	 * @generated
	 */
	public void testSetTemplateParameter() {
		// TODO: implement this feature setter test method
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.impl.PropertyImpl#getOwningParameter() <em>Owning Parameter</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.PropertyImpl#getOwningParameter()
	 * @generated
	 */
	public void testGetOwningParameter() {
		// TODO: implement this feature getter test method
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.impl.PropertyImpl#setOwningParameter() <em>Owning Parameter</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.PropertyImpl#setOwningParameter()
	 * @generated
	 */
	public void testSetOwningParameter() {
		// TODO: implement this feature setter test method
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.impl.PropertyImpl#getDeployments() <em>Deployment</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.PropertyImpl#getDeployments()
	 * @generated
	 */
	public void testGetDeployments() {
		// TODO: implement this feature getter test method
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.impl.PropertyImpl#getDeployedElements() <em>Deployed Element</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.PropertyImpl#getDeployedElements()
	 * @generated
	 */
	public void testGetDeployedElementsGen() {
		// TODO: implement this feature getter test method
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
	 * Tests the '{@link org.eclipse.uml2.impl.PropertyImpl#getDefault() <em>Default</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.PropertyImpl#getDefault()
	 * @generated
	 */
	public void testGetDefaultGen() {
		// TODO: implement this feature getter test method
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
	 * Tests the '{@link org.eclipse.uml2.impl.PropertyImpl#isComposite() <em>Is Composite</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.PropertyImpl#isComposite()
	 * @generated
	 */
	public void testIsCompositeGen() {
		// TODO: implement this feature getter test method
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
	 * Tests the '{@link org.eclipse.uml2.impl.PropertyImpl#getClass_() <em>Class </em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.PropertyImpl#getClass_()
	 * @generated
	 */
	public void testGetClass_Gen() {
		// TODO: implement this feature getter test method
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
	 * Tests the '{@link org.eclipse.uml2.impl.PropertyImpl#getOpposite() <em>Opposite</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.PropertyImpl#getOpposite()
	 * @generated
	 */
	public void testGetOpposite() {
		// TODO: implement this feature getter test method
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.impl.PropertyImpl#getOwningAssociation() <em>Owning Association</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.PropertyImpl#getOwningAssociation()
	 * @generated
	 */
	public void testGetOwningAssociation() {
		// TODO: implement this feature getter test method
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.impl.PropertyImpl#setOwningAssociation() <em>Owning Association</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.PropertyImpl#setOwningAssociation()
	 * @generated
	 */
	public void testSetOwningAssociation() {
		// TODO: implement this feature setter test method
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.impl.PropertyImpl#getAssociation() <em>Association</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.PropertyImpl#getAssociation()
	 * @generated
	 */
	public void testGetAssociation() {
		// TODO: implement this feature getter test method
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.impl.PropertyImpl#setAssociation() <em>Association</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.PropertyImpl#setAssociation()
	 * @generated
	 */
	public void testSetAssociation() {
		// TODO: implement this feature setter test method
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.impl.PropertyImpl#getClientDependencies() <em>Get Client Dependencies</em>}' getter operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.PropertyImpl#getClientDependencies()
	 * @generated
	 */
	public void testGetClientDependencies() {
		// TODO: implement this getter operation test method
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.impl.PropertyImpl#validateOppositeIsOtherEnd(EDiagnosticChain, EMap) <em>Validate Opposite Is Other End</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.PropertyImpl#validateOppositeIsOtherEnd(EDiagnosticChain, EMap)
	 * @generated
	 */
	public void testValidateOppositeIsOtherEnd__EDiagnosticChain_EMap() {
		// TODO: implement this operation test method
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.impl.PropertyImpl#opposite() <em>Opposite</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.PropertyImpl#opposite()
	 * @generated
	 */
	public void testOpposite() {
		// TODO: implement this operation test method
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.impl.PropertyImpl#validateMultiplicityOfComposite(EDiagnosticChain, EMap) <em>Validate Multiplicity Of Composite</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.PropertyImpl#validateMultiplicityOfComposite(EDiagnosticChain, EMap)
	 * @generated
	 */
	public void testValidateMultiplicityOfComposite__EDiagnosticChain_EMap() {
		// TODO: implement this operation test method
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.impl.PropertyImpl#validateSubsettingContext(EDiagnosticChain, EMap) <em>Validate Subsetting Context</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.PropertyImpl#validateSubsettingContext(EDiagnosticChain, EMap)
	 * @generated
	 */
	public void testValidateSubsettingContext__EDiagnosticChain_EMap() {
		// TODO: implement this operation test method
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.impl.PropertyImpl#validateNavigablePropertyRedefinition(EDiagnosticChain, EMap) <em>Validate Navigable Property Redefinition</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.PropertyImpl#validateNavigablePropertyRedefinition(EDiagnosticChain, EMap)
	 * @generated
	 */
	public void testValidateNavigablePropertyRedefinition__EDiagnosticChain_EMap() {
		// TODO: implement this operation test method
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.impl.PropertyImpl#validateSubsettingRules(EDiagnosticChain, EMap) <em>Validate Subsetting Rules</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.PropertyImpl#validateSubsettingRules(EDiagnosticChain, EMap)
	 * @generated
	 */
	public void testValidateSubsettingRules__EDiagnosticChain_EMap() {
		// TODO: implement this operation test method
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.impl.PropertyImpl#validateNavigableReadonly(EDiagnosticChain, EMap) <em>Validate Navigable Readonly</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.PropertyImpl#validateNavigableReadonly(EDiagnosticChain, EMap)
	 * @generated
	 */
	public void testValidateNavigableReadonly__EDiagnosticChain_EMap() {
		// TODO: implement this operation test method
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.impl.PropertyImpl#validateDerivedUnionIsDerived(EDiagnosticChain, EMap) <em>Validate Derived Union Is Derived</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.PropertyImpl#validateDerivedUnionIsDerived(EDiagnosticChain, EMap)
	 * @generated
	 */
	public void testValidateDerivedUnionIsDerived__EDiagnosticChain_EMap() {
		// TODO: implement this operation test method
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.impl.PropertyImpl#isConsistentWith(RedefinableElement) <em>Is Consistent With</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.PropertyImpl#isConsistentWith(RedefinableElement)
	 * @generated
	 */
	public void testIsConsistentWith__RedefinableElement() {
		// TODO: implement this operation test method
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.impl.PropertyImpl#subsettingContext() <em>Subsetting Context</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.PropertyImpl#subsettingContext()
	 * @generated
	 */
	public void testSubsettingContext() {
		// TODO: implement this operation test method
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.impl.PropertyImpl#isReadOnly() <em>Is Read Only</em>}' getter operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.PropertyImpl#isReadOnly()
	 * @generated
	 */
	public void testIsReadOnlyGen() {
		// TODO: implement this getter operation test method
	}

	public void testIsReadOnly() {
		testIsReadOnlyGen();
		
		getFixture().setIsReadOnly(false);
		assertEquals(false, getFixture().isReadOnly());

		getFixture().setIsReadOnly(true);
		assertEquals(true, getFixture().isReadOnly());
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.impl.PropertyImpl#setIsReadOnly(Boolean) <em>Set Is Read Only</em>}' setter operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.PropertyImpl#setIsReadOnly(Boolean)
	 * @generated
	 */
	public void testSetIsReadOnly__BooleanGen() {
		// TODO: implement this setter operation test method
	}

	public void testSetIsReadOnly__Boolean() {
		testSetIsReadOnly__BooleanGen();
		
		getFixture().setIsReadOnly(false);
		assertFalse(getFixture().isReadOnly());

		getFixture().setIsReadOnly(true);
		assertTrue(getFixture().isReadOnly());
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.impl.PropertyImpl#getNamespace() <em>Get Namespace</em>}' getter operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.PropertyImpl#getNamespace()
	 * @generated
	 */
	public void testGetNamespaceGen() {
		// TODO: implement this getter operation test method
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
	 * Tests the '{@link org.eclipse.uml2.impl.PropertyImpl#getFeaturingClassifiers() <em>Get Featuring Classifiers</em>}' getter operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.PropertyImpl#getFeaturingClassifiers()
	 * @generated
	 */
	public void testGetFeaturingClassifiersGen() {
		// TODO: implement this getter operation test method
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
	 * Tests the '{@link org.eclipse.uml2.impl.PropertyImpl#getRedefinedElements() <em>Get Redefined Elements</em>}' getter operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.PropertyImpl#getRedefinedElements()
	 * @generated
	 */
	public void testGetRedefinedElementsGen() {
		// TODO: implement this getter operation test method
	}

	public void testGetRedefinedElements() {
		testGetRedefinedElementsGen();
		
		super.testGetRedefinedElements();

		assertTrue(getFixture().getRedefinedElements().containsAll(getFixture().getRedefinedProperties()));
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.impl.PropertyImpl#getOwnedElements() <em>Get Owned Elements</em>}' getter operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.PropertyImpl#getOwnedElements()
	 * @generated
	 */
	public void testGetOwnedElementsGen() {
		// TODO: implement this getter operation test method
	}

	public void testGetOwnedElements() {
		testGetOwnedElementsGen();
		
		super.testGetOwnedElements();

		assertTrue(getFixture().getOwnedElements().contains(getFixture().getDefaultValue()));
		assertTrue(getFixture().getOwnedElements().containsAll(getFixture().getQualifiers()));
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.impl.PropertyImpl#getOwner() <em>Get Owner</em>}' getter operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.PropertyImpl#getOwner()
	 * @generated
	 */
	public void testGetOwnerGen() {
		// TODO: implement this getter operation test method
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
