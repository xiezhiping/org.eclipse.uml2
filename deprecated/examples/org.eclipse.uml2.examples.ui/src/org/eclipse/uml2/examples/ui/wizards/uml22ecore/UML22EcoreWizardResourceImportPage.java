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
 * $Id: UML22EcoreWizardResourceImportPage.java,v 1.2 2004/05/21 20:20:18 khussey Exp $
 */
package org.eclipse.uml2.examples.ui.wizards.uml22ecore;

import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.widgets.Composite;

import org.eclipse.uml2.examples.ui.wizards.ExampleWizardResourceImportPage;
import org.eclipse.uml2.util.UML2Resource;

/**
 *  
 */
public class UML22EcoreWizardResourceImportPage
	extends ExampleWizardResourceImportPage {

	public UML22EcoreWizardResourceImportPage(String name,
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
			.getWorkspace().getRoot(), UML2Resource.FILE_EXTENSION));
	}

}