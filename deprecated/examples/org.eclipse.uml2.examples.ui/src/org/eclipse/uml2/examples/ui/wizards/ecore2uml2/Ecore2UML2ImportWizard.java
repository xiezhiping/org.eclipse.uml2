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
 * $Id: Ecore2UML2ImportWizard.java,v 1.2 2004/05/21 20:20:18 khussey Exp $
 */
package org.eclipse.uml2.examples.ui.wizards.ecore2uml2;

import java.util.Iterator;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.ui.actions.WorkspaceModifyOperation;
import org.eclipse.ui.dialogs.FileSystemElement;
import org.eclipse.uml2.examples.ecore2uml2.Ecore2UML2;
import org.eclipse.uml2.examples.ui.wizards.ExampleImportWizard;
import org.eclipse.uml2.util.UML2Resource;

/**
 *  
 */
public class Ecore2UML2ImportWizard
	extends ExampleImportWizard {

	public Ecore2UML2ImportWizard() {
		super();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.jface.wizard.IWizard#performFinish()
	 */
	public boolean performFinish() {

		try {
			WorkspaceModifyOperation operation = new WorkspaceModifyOperation() {

				protected void execute(IProgressMonitor progressMonitor) {

					try {

						if (null != mainPage.getSpecifiedContainer()) {
							progressMonitor.beginTask("", 2); //$NON-NLS-1$
							progressMonitor.subTask("Loading Ecore models..."); //$NON-NLS-1$

							ResourceSet resourceSet = new ResourceSetImpl();

							for (Iterator selectedResources = mainPage
								.getSelectedResources().iterator(); selectedResources
								.hasNext();) {

								resourceSet
									.getResource(
										URI
											.createPlatformResourceURI(((IFile) ((FileSystemElement) selectedResources
												.next()).getFileSystemObject())
												.getFullPath().toString()),
										true);
							}

							progressMonitor.subTask("Converting to UML2..."); //$NON-NLS-1$

							new Ecore2UML2().convert(resourceSet, mainPage
								.getSpecifiedContainer(),
								UML2Resource.FILE_EXTENSION);

							mainPage.getSpecifiedContainer().refreshLocal(
								IResource.DEPTH_INFINITE,
								new NullProgressMonitor());
						}
					} catch (Throwable t) {
						t.printStackTrace();
					} finally {
						progressMonitor.done();
					}
				}
			};

			getContainer().run(false, false, operation);

			return true;
		} catch (Exception e) {
			return false;
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.jface.wizard.IWizard#addPages()
	 */
	public void addPages() {
		super.addPages();

		mainPage = new Ecore2UML2WizardResourceImportPage("Main", selection); //$NON-NLS-1$
		addPage(mainPage);
	}

}