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
 * $Id: PackageableElementItemProviderTest.java,v 1.3 2005/04/04 20:02:08 khussey Exp $
 */
package org.eclipse.uml2.provider.tests;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.uml2.PackageableElement;
import org.eclipse.uml2.TemplateParameter;
import org.eclipse.uml2.UML2Factory;
import org.eclipse.uml2.UML2Package;

/**
 * <!-- begin-user-doc -->
 * A test case for the '<em><b>Packageable Element</b></em>' item provider adapter.
 * <!-- end-user-doc -->
 * @generated
 */
public abstract class PackageableElementItemProviderTest extends NamedElementItemProviderTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2003, 2005 IBM Corporation and others."; //$NON-NLS-1$

	/**
	 * Constructs a new Packageable Element item provider adapter test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PackageableElementItemProviderTest(String name) {
		super(name);
	}

	/**
	 * Returns the model object for this Packageable Element item provider adapter test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private PackageableElement getModelObject() {
		return (PackageableElement) modelObject;
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.provider.PackageableElementItemProvider#createSetCommand(org.eclipse.emf.edit.domain.EditingDomain, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EStructuralFeature, java.lang.Object) <em>Create Set Command</em>}' method.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.provider.PackageableElementItemProvider#createSetCommand(org.eclipse.emf.edit.domain.EditingDomain, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EStructuralFeature, java.lang.Object)
	 * @generated
	 */
	public void testCreateSetCommandGen() {
		// TODO: implement this set command creation test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	public void testCreateSetCommand() {
		testCreateSetCommandGen();

		// test PACKAGEABLE_ELEMENT__OWNING_PARAMETER subset...
		TemplateParameter templateParameter = UML2Factory.eINSTANCE.createTemplateParameter();

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

		// test PACKAGEABLE_ELEMENT__TEMPLATE_PARAMETER superset...
		TemplateParameter oldTemplateParameter = UML2Factory.eINSTANCE.createTemplateParameter();
		TemplateParameter newTemplateParameter = UML2Factory.eINSTANCE.createTemplateParameter();

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

} //PackageableElementItemProviderTest
