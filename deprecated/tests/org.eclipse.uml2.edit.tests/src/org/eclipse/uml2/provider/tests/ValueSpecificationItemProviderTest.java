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
 * $Id: ValueSpecificationItemProviderTest.java,v 1.1 2004/04/29 14:43:45 khussey Exp $
 */
package org.eclipse.uml2.provider.tests;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.uml2.TemplateParameter;
import org.eclipse.uml2.UML2Factory;
import org.eclipse.uml2.UML2Package;
import org.eclipse.uml2.ValueSpecification;

/**
 * <!-- begin-user-doc -->
 * A test case for the '<em><b>Value Specification</b></em>' item provider adapter.
 * <!-- end-user-doc -->
 * @generated
 */
public abstract class ValueSpecificationItemProviderTest extends TypedElementItemProviderTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2003, 2004 IBM Corporation and others."; //$NON-NLS-1$

	/**
	 * Constructs a new Value Specification item provider adapter test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueSpecificationItemProviderTest(String name) {
		super(name);
	}

	/**
	 * Returns the model object for this Value Specification item provider adapter test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private ValueSpecification getModelObject() {
		return (ValueSpecification) modelObject;
	}
	/**
	 * Tests the '{@link org.eclipse.uml2.provider.ValueSpecificationItemProvider#createSetCommand(org.eclipse.emf.edit.domain.EditingDomain, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EStructuralFeature, java.lang.Object) <em>Create Set Command</em>}' method.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.provider.ValueSpecificationItemProvider#createSetCommand(org.eclipse.emf.edit.domain.EditingDomain, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EStructuralFeature, java.lang.Object)
	 * @generated NOT
	 */
	public void testCreateSetCommand() {

		// test VALUE_SPECIFICATION__OWNING_PARAMETER subset...
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

		// test VALUE_SPECIFICATION__TEMPLATE_PARAMETER superset...
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

} //ValueSpecificationItemProviderTest
