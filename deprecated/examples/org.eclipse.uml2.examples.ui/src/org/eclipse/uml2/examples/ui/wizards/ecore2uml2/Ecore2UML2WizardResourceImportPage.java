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
 * $Id: Ecore2UML2WizardResourceImportPage.java,v 1.1 2004/04/29 15:31:14 khussey Exp $
 */
package org.eclipse.uml2.examples.ui.wizards.ecore2uml2;

import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.widgets.Composite;

import org.eclipse.uml2.examples.ui.wizards.ExampleWizardResourceImportPage;

/**
 *  
 */
public class Ecore2UML2WizardResourceImportPage
	extends ExampleWizardResourceImportPage {

	public Ecore2UML2WizardResourceImportPage(String name,
			IStructuredSelection selection) {
		super(name, selection);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.ui.dialogs.WizardResourceImportPage#createSourceGroup(org.eclipse.swt.widgets.Composite)
	 */
	protected void createSourceGroup(Composite parent) {
		createFileSelectionGroup(parent);

		selectionGroup.setRoot(createFileSystemElement(null, ResourcesPlugin
			.getWorkspace().getRoot(), "ecore")); //$NON-NLS-1$
	}

}