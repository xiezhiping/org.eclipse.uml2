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
 * $Id: ExampleWizardResourceImportPage.java,v 1.1 2004/04/29 15:31:14 khussey Exp $
 */
package org.eclipse.uml2.examples.ui.wizards;

import java.util.List;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.ui.dialogs.FileSystemElement;
import org.eclipse.ui.dialogs.WizardResourceImportPage;
import org.eclipse.ui.model.WorkbenchContentProvider;

/**
 *  
 */
public abstract class ExampleWizardResourceImportPage
	extends WizardResourceImportPage {

	protected static FileSystemElement createFileSystemElement(
			FileSystemElement parent, IResource resource, String extension) {
		FileSystemElement result = null;
		String label = resource.getName();

		switch (resource.getType()) {
			case IResource.FILE:
				if (resource.getName().endsWith("." + extension)) { //$NON-NLS-1$
					IProject project = resource.getProject();
					IJavaProject javaProject = JavaCore.create(project);

					try {
						if (!javaProject.exists()
							|| project == project.getWorkspace().getRoot()
								.findMember(javaProject.getOutputLocation())
							|| !javaProject.getOutputLocation().isPrefixOf(
								resource.getFullPath())) {

							result = new FileSystemElement(label, parent, false);
							result.setFileSystemObject(resource);
						}
					} catch (JavaModelException jme) {
						// ignore
					}
				}
				break;
			case IResource.ROOT:
				label = "workspace"; //$NON-NLS-1$
			default:
				result = new FileSystemElement(label, parent, true);
				result.setFileSystemObject(resource);

				try {
					IResource[] members = ((IContainer) resource).members();

					for (int index = 0; index < members.length; ++index) {
						createFileSystemElement(result, members[index],
							extension);
					}
				} catch (CoreException ce) {
					// ignore
				}

				if (result.getFolders().size() == 0
					&& result.getFiles().size() == 0) {

					if (parent != null) {
						parent.removeFolder(result);
						result = null;
					}
				}

				break;
		}

		return result;
	}

	protected ExampleWizardResourceImportPage(String name,
			IStructuredSelection selection) {
		super(name, selection);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.ui.dialogs.WizardResourceImportPage#getFileProvider()
	 */
	protected ITreeContentProvider getFileProvider() {
		return new WorkbenchContentProvider() {

			public Object[] getChildren(Object element) {
				if (element instanceof FileSystemElement) {
					return ((FileSystemElement) element).getFiles()
						.getChildren(element);
				}
				return new Object[0];
			}
		};
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.ui.dialogs.WizardResourceImportPage#getFolderProvider()
	 */
	protected ITreeContentProvider getFolderProvider() {
		return new WorkbenchContentProvider() {

			public Object[] getChildren(Object element) {
				if (element instanceof FileSystemElement) {
					return ((FileSystemElement) element).getFolders()
						.getChildren(element);
				}
				return new Object[0];
			}
		};
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.ui.dialogs.WizardResourceImportPage#getSelectedResources()
	 */
	public List getSelectedResources() {
		return super.getSelectedResources();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.ui.dialogs.WizardResourceImportPage#getSpecifiedContainer()
	 */
	public IContainer getSpecifiedContainer() {
		return super.getSpecifiedContainer();
	}

}