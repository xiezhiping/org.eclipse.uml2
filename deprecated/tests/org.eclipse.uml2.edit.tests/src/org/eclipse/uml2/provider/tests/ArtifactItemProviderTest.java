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
 * $Id: ArtifactItemProviderTest.java,v 1.2 2005/03/15 18:49:59 khussey Exp $
 */
package org.eclipse.uml2.provider.tests;

import java.util.Collections;

import junit.textui.TestRunner;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.edit.command.CommandParameter;
import org.eclipse.emf.edit.command.RemoveCommand;
import org.eclipse.emf.edit.command.ReplaceCommand;
import org.eclipse.uml2.Artifact;
import org.eclipse.uml2.Manifestation;
import org.eclipse.uml2.UML2Factory;
import org.eclipse.uml2.UML2Package;

/**
 * <!-- begin-user-doc -->
 * A test case for the '<em><b>Artifact</b></em>' item provider adapter.
 * <!-- end-user-doc -->
 * @generated
 */
public class ArtifactItemProviderTest extends ClassifierItemProviderTest {

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
		TestRunner.run(ArtifactItemProviderTest.class);
	}

	/**
	 * Constructs a new Artifact item provider adapter test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArtifactItemProviderTest(String name) {
		super(name);
	}

	/**
	 * Returns the model object for this Artifact item provider adapter test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private Artifact getModelObject() {
		return (Artifact) modelObject;
	}

	/* (non-Javadoc)
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	protected void setUp() throws Exception {
		super.setUp();

		setModelObject(UML2Factory.eINSTANCE.createArtifact());
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.provider.ArtifactItemProvider#createAddCommand(org.eclipse.emf.edit.domain.EditingDomain, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EStructuralFeature, java.util.Collection, int) <em>Create Add Command</em>}' method.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.provider.ArtifactItemProvider#createAddCommand(org.eclipse.emf.edit.domain.EditingDomain, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EStructuralFeature, java.util.Collection, int)
	 * @generated NOT
	 */
	public void testCreateAddCommand() {
		super.testCreateAddCommand();
		
		// test ARTIFACT__MANIFESTATION subset...
		Manifestation manifestation = UML2Factory.eINSTANCE.createManifestation();
		
		Command command =
			AddCommand.create(
				getEditingDomain(),
				getModelObject(),
				UML2Package.eINSTANCE.getArtifact_Manifestation(),
				Collections.singleton(manifestation),
				CommandParameter.NO_INDEX);
		
		getCommandStack().execute(command);
		
		assertTrue(getModelObject().getManifestations().contains(manifestation));
		assertTrue(getModelObject().getClientDependencies().contains(manifestation));
		
		getCommandStack().undo();
		
		assertFalse(getModelObject().getManifestations().contains(manifestation));
		assertFalse(getModelObject().getClientDependencies().contains(manifestation));
		
		getCommandStack().redo();
		
		assertTrue(getModelObject().getManifestations().contains(manifestation));
		assertTrue(getModelObject().getClientDependencies().contains(manifestation));
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.provider.ArtifactItemProvider#createRemoveCommand(org.eclipse.emf.edit.domain.EditingDomain, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EReference, java.util.Collection) <em>Create Remove Command</em>}' method.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.provider.ArtifactItemProvider#createRemoveCommand(org.eclipse.emf.edit.domain.EditingDomain, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EReference, java.util.Collection)
	 * @generated NOT
	 */
	public void testCreateRemoveCommand() {
		super.testCreateRemoveCommand();
		
		// test ARTIFACT__CLIENT_DEPENDENCY superset...
		Manifestation manifestation = UML2Factory.eINSTANCE.createManifestation();
		
		getModelObject().getManifestations().add(manifestation);
		
		Command command =
			RemoveCommand.create(
				getEditingDomain(),
				getModelObject(),
				UML2Package.eINSTANCE.getNamedElement_ClientDependency(),
				Collections.singleton(manifestation));
		
		getCommandStack().execute(command);
		
		assertFalse(getModelObject().getClientDependencies().contains(manifestation));
		assertFalse(getModelObject().getManifestations().contains(manifestation));
		
		getCommandStack().undo();
		
		assertTrue(getModelObject().getClientDependencies().contains(manifestation));
		assertTrue(getModelObject().getManifestations().contains(manifestation));
		
		getCommandStack().redo();
		
		assertFalse(getModelObject().getClientDependencies().contains(manifestation));
		assertFalse(getModelObject().getManifestations().contains(manifestation));
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.provider.ArtifactItemProvider#createReplaceCommand(org.eclipse.emf.edit.domain.EditingDomain, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EReference, org.eclipse.emf.ecore.EObject, java.util.Collection) <em>Create Replace Command</em>}' method.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.provider.ArtifactItemProvider#createReplaceCommand(org.eclipse.emf.edit.domain.EditingDomain, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EReference, org.eclipse.emf.ecore.EObject, java.util.Collection)
	 * @generated NOT
	 */
	public void testCreateReplaceCommand() {
		super.testCreateReplaceCommand();
		
		// test ARTIFACT__MANIFESTATION subset...
		Manifestation manifestation = UML2Factory.eINSTANCE.createManifestation();
		Manifestation replacementManifestation = UML2Factory.eINSTANCE.createManifestation();
		
		getModelObject().getManifestations().add(manifestation);
		
		Command command =
			ReplaceCommand.create(
				getEditingDomain(),
				getModelObject(),
				UML2Package.eINSTANCE.getArtifact_Manifestation(),
				manifestation,
				Collections.singleton(replacementManifestation));
		
		getCommandStack().execute(command);
		
		assertFalse(getModelObject().getManifestations().contains(manifestation));
		assertTrue(getModelObject().getManifestations().contains(replacementManifestation));
		assertTrue(getModelObject().getClientDependencies().contains(replacementManifestation));
		
		getCommandStack().undo();
		
		assertTrue(getModelObject().getManifestations().contains(manifestation));
		assertFalse(getModelObject().getManifestations().contains(replacementManifestation));
		assertFalse(getModelObject().getClientDependencies().contains(replacementManifestation));
		
		getCommandStack().redo();
		
		assertFalse(getModelObject().getManifestations().contains(manifestation));
		assertTrue(getModelObject().getManifestations().contains(replacementManifestation));
		assertTrue(getModelObject().getClientDependencies().contains(replacementManifestation));
		
		// test ARTIFACT__CLIENT_DEPENDENCY superset...
		manifestation = UML2Factory.eINSTANCE.createManifestation();
		replacementManifestation = UML2Factory.eINSTANCE.createManifestation();
		
		getModelObject().getManifestations().add(manifestation);
		
		command =
			ReplaceCommand.create(
				getEditingDomain(),
				getModelObject(),
				UML2Package.eINSTANCE.getNamedElement_ClientDependency(),
				manifestation,
				Collections.singleton(replacementManifestation));
		
		getCommandStack().execute(command);
		
		assertFalse(getModelObject().getClientDependencies().contains(manifestation));
		assertTrue(getModelObject().getClientDependencies().contains(replacementManifestation));
		assertFalse(getModelObject().getManifestations().contains(manifestation));
		
		getCommandStack().undo();
		
		assertTrue(getModelObject().getClientDependencies().contains(manifestation));
		assertFalse(getModelObject().getClientDependencies().contains(replacementManifestation));
		assertTrue(getModelObject().getManifestations().contains(manifestation));
		
		getCommandStack().redo();
		
		assertFalse(getModelObject().getClientDependencies().contains(manifestation));
		assertTrue(getModelObject().getClientDependencies().contains(replacementManifestation));
		assertFalse(getModelObject().getManifestations().contains(manifestation));
	}

} //ArtifactItemProviderTest
