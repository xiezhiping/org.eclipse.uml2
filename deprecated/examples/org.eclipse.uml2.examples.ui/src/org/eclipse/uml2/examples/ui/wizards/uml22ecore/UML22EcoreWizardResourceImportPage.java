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
 * $Id: UML22EcoreWizardResourceImportPage.java,v 1.4 2005/04/06 19:59:55 khussey Exp $
 */
package org.eclipse.uml2.examples.ui.wizards.uml22ecore;

import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.widgets.Composite;

import org.eclipse.uml2.examples.ui.wizards.ExampleWizardResourceImportPage;
import org.eclipse.uml2.util.UML2Resource;

/**
 * @deprecated Use UML22EcoreConverterOptionsDialog instead.
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