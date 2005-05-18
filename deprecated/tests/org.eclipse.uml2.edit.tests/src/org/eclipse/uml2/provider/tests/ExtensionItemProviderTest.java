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
 * $Id: ExtensionItemProviderTest.java,v 1.4 2005/05/18 17:04:07 khussey Exp $
 */
package org.eclipse.uml2.provider.tests;

import java.util.Collections;

import junit.textui.TestRunner;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.edit.command.CommandParameter;
import org.eclipse.emf.edit.command.RemoveCommand;
import org.eclipse.emf.edit.command.ReplaceCommand;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.uml2.CollaborationOccurrence;
import org.eclipse.uml2.Extension;
import org.eclipse.uml2.ExtensionEnd;
import org.eclipse.uml2.Substitution;
import org.eclipse.uml2.UML2Factory;
import org.eclipse.uml2.UML2Package;

/**
 * <!-- begin-user-doc -->
 * A test case for the '<em><b>Extension</b></em>' item provider adapter.
 * <!-- end-user-doc -->
 * @generated
 */
public class ExtensionItemProviderTest extends AssociationItemProviderTest {

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
		TestRunner.run(ExtensionItemProviderTest.class);
	}

	/**
	 * Constructs a new Extension item provider adapter test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExtensionItemProviderTest(String name) {
		super(name);
	}

	/**
	 * Returns the model object for this Extension item provider adapter test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private Extension getModelObject() {
		return (Extension) modelObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	protected void setUp() throws Exception {
		super.setUp();

		setModelObject(UML2Factory.eINSTANCE.createExtension());
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.uml2.provider.tests.ClassifierItemProviderTest#testCreateAddCommand()
	 */
	public void testCreateAddCommand() {
		testCreateAddCommandGen();

		// test CLASSIFIER__SUBTITUTION subset...
		Substitution substitution = UML2Factory.eINSTANCE.createSubstitution();

		Command command = AddCommand.create(getEditingDomain(),
			getModelObject(), UML2Package.eINSTANCE
				.getClassifier_Substitution(), Collections
				.singleton(substitution), CommandParameter.NO_INDEX);

		getCommandStack().execute(command);

		assertTrue(getModelObject().getSubstitutions().contains(substitution));
		assertTrue(getModelObject().getClientDependencies().contains(
			substitution));

		getCommandStack().undo();

		assertFalse(getModelObject().getSubstitutions().contains(substitution));
		assertFalse(getModelObject().getClientDependencies().contains(
			substitution));

		getCommandStack().redo();

		assertTrue(getModelObject().getSubstitutions().contains(substitution));
		assertTrue(getModelObject().getClientDependencies().contains(
			substitution));

		// test ASSOCIATION__OWNED_END subset...
		ExtensionEnd extensionEnd = UML2Factory.eINSTANCE.createExtensionEnd();

		command = AddCommand.create(getEditingDomain(), getModelObject(),
			UML2Package.eINSTANCE.getAssociation_OwnedEnd(), Collections
				.singleton(extensionEnd), CommandParameter.NO_INDEX);

		getCommandStack().execute(command);

		assertTrue(getModelObject().getOwnedEnds().contains(extensionEnd));
		assertTrue(getModelObject().getMemberEnds().contains(extensionEnd));

		getCommandStack().undo();

		assertFalse(getModelObject().getOwnedEnds().contains(extensionEnd));
		assertFalse(getModelObject().getMemberEnds().contains(extensionEnd));

		getCommandStack().redo();

		assertTrue(getModelObject().getOwnedEnds().contains(extensionEnd));
		assertTrue(getModelObject().getMemberEnds().contains(extensionEnd));
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.uml2.provider.tests.ClassifierItemProviderTest#testCreateRemoveCommand()
	 */
	public void testCreateRemoveCommand() {
		testCreateRemoveCommandGen();

		// test CLASSIFIER__OCCURRENCE superset...
		CollaborationOccurrence collaborationOccurrence = UML2Factory.eINSTANCE
			.createCollaborationOccurrence();

		getModelObject().setRepresentation(collaborationOccurrence);

		Command command = RemoveCommand.create(getEditingDomain(),
			getModelObject(), UML2Package.eINSTANCE.getClassifier_Occurrence(),
			Collections.singleton(collaborationOccurrence));

		getCommandStack().execute(command);

		assertFalse(getModelObject().getOccurrences().contains(
			collaborationOccurrence));
		assertNotSame(collaborationOccurrence, getModelObject()
			.getRepresentation());

		getCommandStack().undo();

		assertTrue(getModelObject().getOccurrences().contains(
			collaborationOccurrence));
		assertSame(collaborationOccurrence, getModelObject()
			.getRepresentation());

		getCommandStack().redo();

		assertFalse(getModelObject().getOccurrences().contains(
			collaborationOccurrence));
		assertNotSame(collaborationOccurrence, getModelObject()
			.getRepresentation());

		// test CLASSIFIER__CLIENT_DEPENDENCY superset...
		Substitution substitution = UML2Factory.eINSTANCE.createSubstitution();

		getModelObject().getSubstitutions().add(substitution);

		command = RemoveCommand.create(getEditingDomain(), getModelObject(),
			UML2Package.eINSTANCE.getNamedElement_ClientDependency(),
			Collections.singleton(substitution));

		getCommandStack().execute(command);

		assertFalse(getModelObject().getClientDependencies().contains(
			substitution));
		assertFalse(getModelObject().getSubstitutions().contains(substitution));

		getCommandStack().undo();

		assertTrue(getModelObject().getClientDependencies().contains(
			substitution));
		assertTrue(getModelObject().getSubstitutions().contains(substitution));

		getCommandStack().redo();

		assertFalse(getModelObject().getClientDependencies().contains(
			substitution));
		assertFalse(getModelObject().getSubstitutions().contains(substitution));

		// test ASSOCIATION__MEMBER_END superset...
		ExtensionEnd extensionEnd = UML2Factory.eINSTANCE.createExtensionEnd();

		getModelObject().getOwnedEnds().add(extensionEnd);

		command = RemoveCommand.create(getEditingDomain(), getModelObject(),
			UML2Package.eINSTANCE.getAssociation_MemberEnd(), Collections
				.singleton(extensionEnd));

		getCommandStack().execute(command);

		assertFalse(getModelObject().getMemberEnds().contains(extensionEnd));
		assertFalse(getModelObject().getOwnedEnds().contains(extensionEnd));

		getCommandStack().undo();

		assertTrue(getModelObject().getMemberEnds().contains(extensionEnd));
		assertTrue(getModelObject().getOwnedEnds().contains(extensionEnd));

		getCommandStack().redo();

		assertFalse(getModelObject().getMemberEnds().contains(extensionEnd));
		assertFalse(getModelObject().getOwnedEnds().contains(extensionEnd));
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.uml2.provider.tests.ClassifierItemProviderTest#testCreateReplaceCommand()
	 */
	public void testCreateReplaceCommand() {
		testCreateReplaceCommandGen();

		// test CLASSIFIER__SUBSTITUTION subset...
		Substitution substitution = UML2Factory.eINSTANCE.createSubstitution();
		Substitution replacementSubstitution = UML2Factory.eINSTANCE
			.createSubstitution();

		getModelObject().getSubstitutions().add(substitution);

		Command command = ReplaceCommand.create(getEditingDomain(),
			getModelObject(), UML2Package.eINSTANCE
				.getClassifier_Substitution(), substitution, Collections
				.singleton(replacementSubstitution));

		getCommandStack().execute(command);

		assertFalse(getModelObject().getSubstitutions().contains(substitution));
		assertTrue(getModelObject().getSubstitutions().contains(
			replacementSubstitution));
		assertTrue(getModelObject().getClientDependencies().contains(
			replacementSubstitution));

		getCommandStack().undo();

		assertTrue(getModelObject().getSubstitutions().contains(substitution));
		assertFalse(getModelObject().getSubstitutions().contains(
			replacementSubstitution));
		assertFalse(getModelObject().getClientDependencies().contains(
			replacementSubstitution));

		getCommandStack().redo();

		assertFalse(getModelObject().getSubstitutions().contains(substitution));
		assertTrue(getModelObject().getSubstitutions().contains(
			replacementSubstitution));
		assertTrue(getModelObject().getClientDependencies().contains(
			replacementSubstitution));

		// test CLASSIFIER__OCCURRENCE superset...
		CollaborationOccurrence collaborationOccurrence = UML2Factory.eINSTANCE
			.createCollaborationOccurrence();
		CollaborationOccurrence replacementCollaborationOccurrence = UML2Factory.eINSTANCE
			.createCollaborationOccurrence();

		getModelObject().setRepresentation(collaborationOccurrence);

		command = ReplaceCommand.create(getEditingDomain(), getModelObject(),
			UML2Package.eINSTANCE.getClassifier_Occurrence(),
			collaborationOccurrence, Collections
				.singleton(replacementCollaborationOccurrence));

		getCommandStack().execute(command);

		assertFalse(getModelObject().getOccurrences().contains(
			collaborationOccurrence));
		assertTrue(getModelObject().getOccurrences().contains(
			replacementCollaborationOccurrence));
		assertNotSame(collaborationOccurrence, getModelObject()
			.getRepresentation());

		getCommandStack().undo();

		assertTrue(getModelObject().getOccurrences().contains(
			collaborationOccurrence));
		assertFalse(getModelObject().getOccurrences().contains(
			replacementCollaborationOccurrence));
		assertSame(collaborationOccurrence, getModelObject()
			.getRepresentation());

		getCommandStack().redo();

		assertFalse(getModelObject().getOccurrences().contains(
			collaborationOccurrence));
		assertTrue(getModelObject().getOccurrences().contains(
			replacementCollaborationOccurrence));
		assertNotSame(collaborationOccurrence, getModelObject()
			.getRepresentation());

		// test CLASSIFIER__CLIENT_DEPENDENCY superset...
		substitution = UML2Factory.eINSTANCE.createSubstitution();
		replacementSubstitution = UML2Factory.eINSTANCE.createSubstitution();

		getModelObject().getSubstitutions().add(substitution);

		command = ReplaceCommand.create(getEditingDomain(), getModelObject(),
			UML2Package.eINSTANCE.getNamedElement_ClientDependency(),
			substitution, Collections.singleton(replacementSubstitution));

		getCommandStack().execute(command);

		assertFalse(getModelObject().getClientDependencies().contains(
			substitution));
		assertTrue(getModelObject().getClientDependencies().contains(
			replacementSubstitution));
		assertFalse(getModelObject().getSubstitutions().contains(substitution));

		getCommandStack().undo();

		assertTrue(getModelObject().getClientDependencies().contains(
			substitution));
		assertFalse(getModelObject().getClientDependencies().contains(
			replacementSubstitution));
		assertTrue(getModelObject().getSubstitutions().contains(substitution));

		getCommandStack().redo();

		assertFalse(getModelObject().getClientDependencies().contains(
			substitution));
		assertTrue(getModelObject().getClientDependencies().contains(
			replacementSubstitution));
		assertFalse(getModelObject().getSubstitutions().contains(substitution));

		// test ASSOCIATION__OWNED_END subset...
		ExtensionEnd extensionEnd = UML2Factory.eINSTANCE.createExtensionEnd();
		ExtensionEnd replacementExtensionEnd = UML2Factory.eINSTANCE
			.createExtensionEnd();

		getModelObject().getOwnedEnds().add(extensionEnd);

		command = ReplaceCommand.create(getEditingDomain(), getModelObject(),
			UML2Package.eINSTANCE.getAssociation_OwnedEnd(), extensionEnd,
			Collections.singleton(replacementExtensionEnd));

		getCommandStack().execute(command);

		assertFalse(getModelObject().getOwnedEnds().contains(extensionEnd));
		assertTrue(getModelObject().getOwnedEnds().contains(
			replacementExtensionEnd));
		assertTrue(getModelObject().getMemberEnds().contains(
			replacementExtensionEnd));

		getCommandStack().undo();

		assertTrue(getModelObject().getOwnedEnds().contains(extensionEnd));
		assertFalse(getModelObject().getOwnedEnds().contains(
			replacementExtensionEnd));
		assertFalse(getModelObject().getMemberEnds().contains(
			replacementExtensionEnd));

		getCommandStack().redo();

		assertFalse(getModelObject().getOwnedEnds().contains(extensionEnd));
		assertTrue(getModelObject().getOwnedEnds().contains(
			replacementExtensionEnd));
		assertTrue(getModelObject().getMemberEnds().contains(
			replacementExtensionEnd));

		// test ASSOCIATION__MEMBER_END superset...
		extensionEnd = UML2Factory.eINSTANCE.createExtensionEnd();
		replacementExtensionEnd = UML2Factory.eINSTANCE.createExtensionEnd();

		getModelObject().getOwnedEnds().add(extensionEnd);

		command = ReplaceCommand.create(getEditingDomain(), getModelObject(),
			UML2Package.eINSTANCE.getAssociation_MemberEnd(), extensionEnd,
			Collections.singleton(replacementExtensionEnd));

		getCommandStack().execute(command);

		assertFalse(getModelObject().getMemberEnds().contains(extensionEnd));
		assertTrue(getModelObject().getMemberEnds().contains(
			replacementExtensionEnd));
		assertFalse(getModelObject().getOwnedEnds().contains(extensionEnd));

		getCommandStack().undo();

		assertTrue(getModelObject().getMemberEnds().contains(extensionEnd));
		assertFalse(getModelObject().getMemberEnds().contains(
			replacementExtensionEnd));
		assertTrue(getModelObject().getOwnedEnds().contains(extensionEnd));

		getCommandStack().redo();

		assertFalse(getModelObject().getMemberEnds().contains(extensionEnd));
		assertTrue(getModelObject().getMemberEnds().contains(
			replacementExtensionEnd));
		assertFalse(getModelObject().getOwnedEnds().contains(extensionEnd));
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.uml2.provider.tests.ClassifierItemProviderTest#testCreateSetCommand()
	 */
	public void testCreateSetCommand() {
		testCreateSetCommandGen();

		// test CLASSIFIER__REPRESENTATION subset...
		CollaborationOccurrence collaborationOccurrence = UML2Factory.eINSTANCE
			.createCollaborationOccurrence();

		Command command = SetCommand.create(getEditingDomain(),
			getModelObject(), UML2Package.eINSTANCE
				.getClassifier_Representation(), collaborationOccurrence);

		getCommandStack().execute(command);

		assertSame(collaborationOccurrence, getModelObject()
			.getRepresentation());
		assertTrue(getModelObject().getOccurrences().contains(
			collaborationOccurrence));

		getCommandStack().undo();

		assertNotSame(collaborationOccurrence, getModelObject()
			.getRepresentation());
		assertFalse(getModelObject().getOccurrences().contains(
			collaborationOccurrence));

		getCommandStack().redo();

		assertSame(collaborationOccurrence, getModelObject()
			.getRepresentation());
		assertTrue(getModelObject().getOccurrences().contains(
			collaborationOccurrence));
	}

} //ExtensionItemProviderTest
