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
 * $Id: ClassifierItemProviderTest.java,v 1.1 2004/04/29 14:43:45 khussey Exp $
 */
package org.eclipse.uml2.provider.tests;

import java.util.Collections;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.edit.command.CommandParameter;
import org.eclipse.emf.edit.command.RemoveCommand;
import org.eclipse.emf.edit.command.ReplaceCommand;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.uml2.Classifier;
import org.eclipse.uml2.ClassifierTemplateParameter;
import org.eclipse.uml2.CollaborationOccurrence;
import org.eclipse.uml2.Substitution;
import org.eclipse.uml2.UML2Factory;
import org.eclipse.uml2.UML2Package;

/**
 * <!-- begin-user-doc -->
 * A test case for the '<em><b>Classifier</b></em>' item provider adapter.
 * <!-- end-user-doc -->
 * @generated
 */
public abstract class ClassifierItemProviderTest extends NamespaceItemProviderTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2003, 2004 IBM Corporation and others."; //$NON-NLS-1$

	/**
	 * Constructs a new Classifier item provider adapter test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassifierItemProviderTest(String name) {
		super(name);
	}

	/**
	 * Returns the model object for this Classifier item provider adapter test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private Classifier getModelObject() {
		return (Classifier) modelObject;
	}
	/**
	 * Tests the '{@link org.eclipse.uml2.provider.ClassifierItemProvider#createAddCommand(org.eclipse.emf.edit.domain.EditingDomain, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EStructuralFeature, java.util.Collection, int) <em>Create Add Command</em>}' method.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.provider.ClassifierItemProvider#createAddCommand(org.eclipse.emf.edit.domain.EditingDomain, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EStructuralFeature, java.util.Collection, int)
	 * @generated NOT
	 */
	public void testCreateAddCommand() {
		// test CLASSIFIER__SUBTITUTION subset...
		Substitution substitution = UML2Factory.eINSTANCE.createSubstitution();
	
		Command command =
			AddCommand.create(
				getEditingDomain(),
				getModelObject(),
				UML2Package.eINSTANCE.getClassifier_Substitution(),
				Collections.singleton(substitution),
				CommandParameter.NO_INDEX);
	
		getCommandStack().execute(command);
	
		assertTrue(getModelObject().getSubstitutions().contains(substitution));
		assertTrue(getModelObject().getClientDependencies().contains(substitution));
	
		getCommandStack().undo();
	
		assertFalse(getModelObject().getSubstitutions().contains(substitution));
		assertFalse(getModelObject().getClientDependencies().contains(substitution));
	
		getCommandStack().redo();
	
		assertTrue(getModelObject().getSubstitutions().contains(substitution));
		assertTrue(getModelObject().getClientDependencies().contains(substitution));
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.provider.ClassifierItemProvider#createRemoveCommand(org.eclipse.emf.edit.domain.EditingDomain, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EReference, java.util.Collection) <em>Create Remove Command</em>}' method.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.provider.ClassifierItemProvider#createRemoveCommand(org.eclipse.emf.edit.domain.EditingDomain, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EReference, java.util.Collection)
	 * @generated NOT
	 */
	public void testCreateRemoveCommand() {
		
		// test CLASSIFIER__OCCURRENCE superset...
		CollaborationOccurrence collaborationOccurrence = UML2Factory.eINSTANCE.createCollaborationOccurrence();
	
		getModelObject().setRepresentation(collaborationOccurrence);
	
		Command command =
			RemoveCommand.create(
				getEditingDomain(),
				getModelObject(),
				UML2Package.eINSTANCE.getClassifier_Occurrence(),
				Collections.singleton(collaborationOccurrence));
	
		getCommandStack().execute(command);
	
		assertFalse(getModelObject().getOccurrences().contains(collaborationOccurrence));
		assertNotSame(collaborationOccurrence, getModelObject().getRepresentation());
	
		getCommandStack().undo();
	
		assertTrue(getModelObject().getOccurrences().contains(collaborationOccurrence));
		assertSame(collaborationOccurrence, getModelObject().getRepresentation());
	
		getCommandStack().redo();
	
		assertFalse(getModelObject().getOccurrences().contains(collaborationOccurrence));
		assertNotSame(collaborationOccurrence, getModelObject().getRepresentation());
	
		// test CLASSIFIER__CLIENT_DEPENDENCY superset...
		Substitution substitution = UML2Factory.eINSTANCE.createSubstitution();
	
		getModelObject().getSubstitutions().add(substitution);
	
		command =
			RemoveCommand.create(
				getEditingDomain(),
				getModelObject(),
				UML2Package.eINSTANCE.getNamedElement_ClientDependency(),
				Collections.singleton(substitution));
	
		getCommandStack().execute(command);
	
		assertFalse(getModelObject().getClientDependencies().contains(substitution));
		assertFalse(getModelObject().getSubstitutions().contains(substitution));
	
		getCommandStack().undo();
	
		assertTrue(getModelObject().getClientDependencies().contains(substitution));
		assertTrue(getModelObject().getSubstitutions().contains(substitution));
	
		getCommandStack().redo();
	
		assertFalse(getModelObject().getClientDependencies().contains(substitution));
		assertFalse(getModelObject().getSubstitutions().contains(substitution));
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.provider.ClassifierItemProvider#createReplaceCommand(org.eclipse.emf.edit.domain.EditingDomain, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EReference, org.eclipse.emf.ecore.EObject, java.util.Collection) <em>Create Replace Command</em>}' method.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.provider.ClassifierItemProvider#createReplaceCommand(org.eclipse.emf.edit.domain.EditingDomain, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EReference, org.eclipse.emf.ecore.EObject, java.util.Collection)
	 * @generated NOT
	 */
	public void testCreateReplaceCommand() {
		
		// test CLASSIFIER__SUBSTITUTION subset...
		Substitution substitution = UML2Factory.eINSTANCE.createSubstitution();
		Substitution replacementSubstitution = UML2Factory.eINSTANCE.createSubstitution();
	
		getModelObject().getSubstitutions().add(substitution);
	
		Command command =
			ReplaceCommand.create(
				getEditingDomain(),
				getModelObject(),
				UML2Package.eINSTANCE.getClassifier_Substitution(),
				substitution,
				Collections.singleton(replacementSubstitution));
	
		getCommandStack().execute(command);
	
		assertFalse(getModelObject().getSubstitutions().contains(substitution));
		assertTrue(getModelObject().getSubstitutions().contains(replacementSubstitution));
		assertTrue(getModelObject().getClientDependencies().contains(replacementSubstitution));
	
		getCommandStack().undo();
	
		assertTrue(getModelObject().getSubstitutions().contains(substitution));
		assertFalse(getModelObject().getSubstitutions().contains(replacementSubstitution));
		assertFalse(getModelObject().getClientDependencies().contains(replacementSubstitution));
	
		getCommandStack().redo();
	
		assertFalse(getModelObject().getSubstitutions().contains(substitution));
		assertTrue(getModelObject().getSubstitutions().contains(replacementSubstitution));
		assertTrue(getModelObject().getClientDependencies().contains(replacementSubstitution));
	
		// test CLASSIFIER__OCCURRENCE superset...
		CollaborationOccurrence collaborationOccurrence = UML2Factory.eINSTANCE.createCollaborationOccurrence();
		CollaborationOccurrence replacementCollaborationOccurrence = UML2Factory.eINSTANCE.createCollaborationOccurrence();
	
		getModelObject().setRepresentation(collaborationOccurrence);
	
		command =
			ReplaceCommand.create(
				getEditingDomain(),
				getModelObject(),
				UML2Package.eINSTANCE.getClassifier_Occurrence(),
				collaborationOccurrence,
				Collections.singleton(replacementCollaborationOccurrence));
	
		getCommandStack().execute(command);
	
		assertFalse(getModelObject().getOccurrences().contains(collaborationOccurrence));
		assertTrue(getModelObject().getOccurrences().contains(replacementCollaborationOccurrence));
		assertNotSame(collaborationOccurrence, getModelObject().getRepresentation());
	
		getCommandStack().undo();
	
		assertTrue(getModelObject().getOccurrences().contains(collaborationOccurrence));
		assertFalse(getModelObject().getOccurrences().contains(replacementCollaborationOccurrence));
		assertSame(collaborationOccurrence, getModelObject().getRepresentation());
	
		getCommandStack().redo();
	
		assertFalse(getModelObject().getOccurrences().contains(collaborationOccurrence));
		assertTrue(getModelObject().getOccurrences().contains(replacementCollaborationOccurrence));
		assertNotSame(collaborationOccurrence, getModelObject().getRepresentation());
	
		// test CLASSIFIER__CLIENT_DEPENDENCY superset...
		substitution = UML2Factory.eINSTANCE.createSubstitution();
		replacementSubstitution = UML2Factory.eINSTANCE.createSubstitution();
	
		getModelObject().getSubstitutions().add(substitution);
	
		command =
			ReplaceCommand.create(
				getEditingDomain(),
				getModelObject(),
				UML2Package.eINSTANCE.getNamedElement_ClientDependency(),
				substitution,
				Collections.singleton(replacementSubstitution));
	
		getCommandStack().execute(command);
	
		assertFalse(getModelObject().getClientDependencies().contains(substitution));
		assertTrue(getModelObject().getClientDependencies().contains(replacementSubstitution));
		assertFalse(getModelObject().getSubstitutions().contains(substitution));
	
		getCommandStack().undo();
	
		assertTrue(getModelObject().getClientDependencies().contains(substitution));
		assertFalse(getModelObject().getClientDependencies().contains(replacementSubstitution));
		assertTrue(getModelObject().getSubstitutions().contains(substitution));
	
		getCommandStack().redo();
	
		assertFalse(getModelObject().getClientDependencies().contains(substitution));
		assertTrue(getModelObject().getClientDependencies().contains(replacementSubstitution));
		assertFalse(getModelObject().getSubstitutions().contains(substitution));
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.provider.ClassifierItemProvider#createSetCommand(org.eclipse.emf.edit.domain.EditingDomain, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EStructuralFeature, java.lang.Object) <em>Create Set Command</em>}' method.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.provider.ClassifierItemProvider#createSetCommand(org.eclipse.emf.edit.domain.EditingDomain, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EStructuralFeature, java.lang.Object)
	 * @generated NOT
	 */
	public void testCreateSetCommand() {
		
		// test CLASSIFIER__OWNING_PARAMETER subset...
		ClassifierTemplateParameter templateParameter = UML2Factory.eINSTANCE.createClassifierTemplateParameter();
	
		Command command =
			SetCommand.create(getEditingDomain(), getModelObject(), UML2Package.eINSTANCE.getParameterableElement_OwningParameter(), templateParameter);
	
		getCommandStack().execute(command);
	
		assertSame(templateParameter, getModelObject().getOwningParameter());
		assertSame(getModelObject().getOwningParameter(), getModelObject().getTemplateParameter());
	
		getCommandStack().undo();
	
		assertNotSame(templateParameter, getModelObject().getOwningParameter());
		assertSame(getModelObject().getOwningParameter(), getModelObject().getTemplateParameter());
	
		getCommandStack().redo();
	
		assertSame(templateParameter, getModelObject().getOwningParameter());
		assertSame(getModelObject().getOwningParameter(), getModelObject().getTemplateParameter());
	
		// test CLASSIFIER__REPRESENTATION subset...
		CollaborationOccurrence collaborationOccurrence = UML2Factory.eINSTANCE.createCollaborationOccurrence();
	
		command = SetCommand.create(getEditingDomain(), getModelObject(), UML2Package.eINSTANCE.getClassifier_Representation(), collaborationOccurrence);
	
		getCommandStack().execute(command);
	
		assertSame(collaborationOccurrence, getModelObject().getRepresentation());
		assertTrue(getModelObject().getOccurrences().contains(collaborationOccurrence));
	
		getCommandStack().undo();
	
		assertNotSame(collaborationOccurrence, getModelObject().getRepresentation());
		assertFalse(getModelObject().getOccurrences().contains(collaborationOccurrence));
	
		getCommandStack().redo();
	
		assertSame(collaborationOccurrence, getModelObject().getRepresentation());
		assertTrue(getModelObject().getOccurrences().contains(collaborationOccurrence));
	
		// test CLASSIFIER__TEMPLATE_PARAMETER superset...
		ClassifierTemplateParameter oldTemplateParameter = UML2Factory.eINSTANCE.createClassifierTemplateParameter();
		ClassifierTemplateParameter newTemplateParameter = UML2Factory.eINSTANCE.createClassifierTemplateParameter();
	
		getModelObject().setOwningParameter(oldTemplateParameter);
	
		command = SetCommand.create(getEditingDomain(), getModelObject(), UML2Package.eINSTANCE.getParameterableElement_TemplateParameter(), newTemplateParameter);
	
		getCommandStack().execute(command);
	
		assertSame(newTemplateParameter, getModelObject().getTemplateParameter());
		assertSame(null, getModelObject().getOwningParameter());
	
		getCommandStack().undo();
	
		assertSame(oldTemplateParameter, getModelObject().getTemplateParameter());
		assertSame(oldTemplateParameter, getModelObject().getOwningParameter());
	
		getCommandStack().redo();
	
		assertSame(newTemplateParameter, getModelObject().getTemplateParameter());
		assertSame(null, getModelObject().getOwningParameter());
	}

} //ClassifierItemProviderTest
