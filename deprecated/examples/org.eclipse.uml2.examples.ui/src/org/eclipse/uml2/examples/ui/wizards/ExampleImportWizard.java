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
 * $Id: ExampleImportWizard.java,v 1.2 2005/03/15 18:54:23 khussey Exp $
 */
package org.eclipse.uml2.examples.ui.wizards;

import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.IImportWizard;
import org.eclipse.ui.IWorkbench;

/**
 *
 */
public abstract class ExampleImportWizard
	extends Wizard
	implements IImportWizard {

	protected IWorkbench workbench = null;

	protected IStructuredSelection selection = null;

	protected ExampleWizardResourceImportPage mainPage = null;

	protected ExampleImportWizard() {
		super();
	}

	/*
	 * @see org.eclipse.ui.IWorkbenchWizard#init(org.eclipse.ui.IWorkbench, org.eclipse.jface.viewers.IStructuredSelection)
	 */
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		this.workbench = workbench;
		this.selection = selection;
	}

}