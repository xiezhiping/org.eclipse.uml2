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
 * $Id: UML22EcoreImportWizard.java,v 1.3 2005/04/06 19:59:55 khussey Exp $
 */
package org.eclipse.uml2.examples.ui.wizards.uml22ecore;

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
import org.eclipse.uml2.examples.ui.wizards.ExampleImportWizard;
import org.eclipse.uml2.examples.uml22ecore.UML22Ecore;

/**
 * @deprecated Use ConvertToEcoreAction instead.
 */
public class UML22EcoreImportWizard
	extends ExampleImportWizard {

	public UML22EcoreImportWizard() {
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
							progressMonitor.subTask("Loading UML2 models..."); //$NON-NLS-1$

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

							progressMonitor.subTask("Converting to Ecore..."); //$NON-NLS-1$

							new UML22Ecore().convert(resourceSet, mainPage
								.getSpecifiedContainer(), "ecore"); //$NON-NLS-1$

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

		mainPage = new UML22EcoreWizardResourceImportPage("Main", selection); //$NON-NLS-1$
		addPage(mainPage);
	}

}