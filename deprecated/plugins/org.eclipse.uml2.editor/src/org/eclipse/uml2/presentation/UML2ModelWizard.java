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
 * $Id: UML2ModelWizard.java,v 1.7 2005/03/15 18:50:31 khussey Exp $
 */
package org.eclipse.uml2.presentation;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.MissingResourceException;
import java.util.StringTokenizer;

import java.util.Collections;

import java.util.HashMap;
import org.eclipse.emf.common.util.URI;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;

import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.xmi.XMLResource;

import org.eclipse.emf.edit.ui.provider.ExtendedImageRegistry;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Path;

import org.eclipse.jface.dialogs.MessageDialog;

import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.StructuredSelection;

import org.eclipse.jface.wizard.Wizard;
import org.eclipse.jface.wizard.WizardPage;

import org.eclipse.swt.SWT;

import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;

import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;

import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;

import org.eclipse.swt.widgets.Combo;

import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PartInitException;

import org.eclipse.ui.actions.WorkspaceModifyOperation;

import org.eclipse.ui.dialogs.WizardNewFileCreationPage;

import org.eclipse.ui.part.FileEditorInput;
import org.eclipse.ui.part.ISetSelectionTarget;

import org.eclipse.uml2.UML2Factory;
import org.eclipse.uml2.UML2Package;
import org.eclipse.uml2.provider.UML2EditPlugin;




/**
 * This is a simple wizard for creating a new model file.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class UML2ModelWizard extends Wizard implements INewWizard {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2003, 2004 IBM Corporation and others."; //$NON-NLS-1$

	/**
	 * This caches an instance of the model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UML2Package umL2Package = UML2Package.eINSTANCE;

	/**
	 * This caches an instance of the model factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UML2Factory umL2Factory = umL2Package.getUML2Factory();

	/**
	 * This is the file creation page.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UML2ModelWizardNewFileCreationPage newFileCreationPage;

	/**
	 * This is the file creation page.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UML2ModelWizardInitialObjectCreationPage initialObjectCreationPage;

	/**
	 * Remember the selection during initialization for populating the default container.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IStructuredSelection selection;

	/**
	 * Remember the workbench during initialization.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IWorkbench workbench;

	/**
	 * This just records the information.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		this.workbench = workbench;
		this.selection = selection;
		setWindowTitle(UML2EditorPlugin.INSTANCE.getString("_UI_Wizard_label")); //$NON-NLS-1$
		setDefaultPageImageDescriptor(ExtendedImageRegistry.INSTANCE.getImageDescriptor(UML2EditorPlugin.INSTANCE.getImage("full/wizban/NewUML2"))); //$NON-NLS-1$
	}

	/**
	 * Create a new model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EObject createInitialModel() {
		EClass eClass = (EClass)umL2Package.getEClassifier(initialObjectCreationPage.getInitialObjectName());
		EObject rootObject = umL2Factory.create(eClass);
		return rootObject;
	}

	/**
	 * Do the work after everything is specified.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean performFinish() {
		try {
			// Remember the file.
			//
			final IFile modelFile = getModelFile();

			// Do the work within an operation.
			//
			WorkspaceModifyOperation operation =
				new WorkspaceModifyOperation() {
					protected void execute(IProgressMonitor progressMonitor) {
						try {
							// Create a resource set
							//
							ResourceSet resourceSet = new ResourceSetImpl();

							// Get the URI of the model file.
							//
							URI fileURI = URI.createPlatformResourceURI(modelFile.getFullPath().toString());

							// Create a resource for this file.
							//
							Resource resource = resourceSet.createResource(fileURI);

							// Add the initial model object to the contents.
							//
							EObject rootObject = createInitialModel();
							if (rootObject != null) {
								resource.getContents().add(rootObject);
							}

							// Save the contents of the resource to the file system.
							//
							Map options = new HashMap();
							options.put(XMLResource.OPTION_ENCODING, initialObjectCreationPage.getEncoding());
							resource.save(options);
						}
						catch (Exception exception) {
							UML2EditorPlugin.INSTANCE.log(exception);
						}
						finally {
							progressMonitor.done();
						}
					}
				};

			getContainer().run(false, false, operation);

			// Select the new file resource in the current view.
			//
			IWorkbenchWindow workbenchWindow = workbench.getActiveWorkbenchWindow();
			IWorkbenchPage page = workbenchWindow.getActivePage();
			final IWorkbenchPart activePart = page.getActivePart();
			if (activePart instanceof ISetSelectionTarget) {
				final ISelection targetSelection = new StructuredSelection(modelFile);
				getShell().getDisplay().asyncExec
					(new Runnable() {
						 public void run() {
							 ((ISetSelectionTarget)activePart).selectReveal(targetSelection);
						 }
					 });
			}

			// Open an editor on the new file.
			//
			try {
				page.openEditor
					(new FileEditorInput(modelFile),
					 workbench.getEditorRegistry().getDefaultEditor(modelFile.getFullPath().toString()).getId());
			}
			catch (PartInitException exception) {
				MessageDialog.openError(workbenchWindow.getShell(), UML2EditorPlugin.INSTANCE.getString("_UI_OpenEditorError_label"), exception.getMessage()); //$NON-NLS-1$
				return false;
			}

			return true;
		}
		catch (Exception exception) {
			UML2EditorPlugin.INSTANCE.log(exception);
			return false;
		}
	}

	/**
	 * This is the one page of the wizard.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public class UML2ModelWizardNewFileCreationPage extends WizardNewFileCreationPage {
		/**
		 * Remember the model file.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		protected IFile modelFile;

		/**
		 * Pass in the selection.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public UML2ModelWizardNewFileCreationPage(String pageId, IStructuredSelection selection) {
			super(pageId, selection);
		}

		/**
		 * The framework calls this to see if the file is correct.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		protected boolean validatePage() {
			if (super.validatePage()) {
				// Make sure the file ends in ".uml2".
				//
				String requiredExt = UML2EditorPlugin.INSTANCE.getString("_UI_UML2EditorFilenameExtension"); //$NON-NLS-1$
				String enteredExt = new Path(getFileName()).getFileExtension();
				if (enteredExt == null || !enteredExt.equals(requiredExt)) {
					setErrorMessage(UML2EditorPlugin.INSTANCE.getString("_WARN_FilenameExtension", new Object [] { requiredExt })); //$NON-NLS-1$
					return false;
				}
				else {
					return true;
				}
			}
			else {
				return false;
			}
		}

		/**
		 * Store the dialog field settings upon completion.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public boolean performFinish() {
			modelFile = getModelFile();
			return true;
		}

		/**
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public IFile getModelFile() {
			return
				modelFile == null ?
					ResourcesPlugin.getWorkspace().getRoot().getFile(getContainerFullPath().append(getFileName())) :
					modelFile;
		}
	}

	/**
	 * This is the page where the type of object to create is selected.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public class UML2ModelWizardInitialObjectCreationPage extends WizardPage {
		/**
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		protected String initialObjectName;

		/**
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		protected Combo initialObjectField;

		/**
		 * @generated
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 */
		protected String encoding;

		/**
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		protected Combo encodingField;

		/**
		 * Pass in the selection.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public UML2ModelWizardInitialObjectCreationPage(String pageId) {
			super(pageId);
		}

		/**
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public void createControlGen(Composite parent) {
			Composite composite = new Composite(parent, SWT.NONE);
			{
				GridLayout layout = new GridLayout();
				layout.numColumns = 1;
				layout.verticalSpacing = 12;
				composite.setLayout(layout);

				GridData data = new GridData();
				data.verticalAlignment = GridData.FILL;
				data.grabExcessVerticalSpace = true;
				data.horizontalAlignment = GridData.FILL;
				composite.setLayoutData(data);
			}

			Label containerLabel = new Label(composite, SWT.LEFT);
			{
				containerLabel.setText(UML2EditorPlugin.INSTANCE.getString("_UI_ModelObject")); //$NON-NLS-1$

				GridData data = new GridData();
				data.horizontalAlignment = GridData.FILL;
				containerLabel.setLayoutData(data);
			}

			initialObjectField = new Combo(composite, SWT.BORDER);
			{
				GridData data = new GridData();
				data.horizontalAlignment = GridData.FILL;
				data.grabExcessHorizontalSpace = true;
				initialObjectField.setLayoutData(data);
			}

			List objectNames = new ArrayList();
			for (Iterator classifier = umL2Package.getEClassifiers().iterator(); classifier.hasNext(); ) {
				EClassifier eClassifier = (EClassifier)classifier.next();
				if (eClassifier instanceof EClass) {
					EClass eClass = (EClass)eClassifier;
					if (!eClass.isAbstract()) {
						objectNames.add(getLabel(eClass));
					}
				}
			}

			Collections.sort(objectNames, java.text.Collator.getInstance());
			for (Iterator i = objectNames.iterator(); i.hasNext(); ) {
				String objectName = (String)i.next();
				initialObjectField.add(objectName);
			}

			initialObjectField.addSelectionListener
				(new SelectionAdapter() {
					 public void widgetSelected(SelectionEvent e) {
						 setPageComplete(isPageComplete());
					 }
				 });

			Label encodingLabel = new Label(composite, SWT.LEFT);
			{
				encodingLabel.setText(UML2EditorPlugin.INSTANCE.getString("_UI_XMLEncoding")); //$NON-NLS-1$

				GridData data = new GridData();
				data.horizontalAlignment = GridData.FILL;
				encodingLabel.setLayoutData(data);
			}
			encodingField = new Combo(composite, SWT.BORDER);
			{
				GridData data = new GridData();
				data.horizontalAlignment = GridData.FILL;
				data.grabExcessHorizontalSpace = true;
				encodingField.setLayoutData(data);
			}

			for (StringTokenizer stringTokenizer = new StringTokenizer(UML2EditorPlugin.INSTANCE.getString("_UI_XMLEncodingChoices")); stringTokenizer.hasMoreTokens(); ) //$NON-NLS-1$
			{
				encodingField.add(stringTokenizer.nextToken());
			}
			encodingField.select(0);

			setControl(composite);
		}

		public void createControl(Composite parent) {
			Composite composite = new Composite(parent, SWT.NONE);
			{
				GridLayout layout = new GridLayout();
				layout.numColumns = 1;
				layout.verticalSpacing = 12;
				composite.setLayout(layout);

				GridData data = new GridData();
				data.verticalAlignment = GridData.FILL;
				data.grabExcessVerticalSpace = true;
				data.horizontalAlignment = GridData.FILL;
				composite.setLayoutData(data);
			}

			Label containerLabel = new Label(composite, SWT.LEFT);
			{
				containerLabel.setText(UML2EditorPlugin.INSTANCE.getString("_UI_ModelObject")); //$NON-NLS-1$

				GridData data = new GridData();
				data.horizontalAlignment = GridData.FILL;
				containerLabel.setLayoutData(data);
			}

			initialObjectField = new Combo(composite, SWT.BORDER);
			{
				GridData data = new GridData();
				data.horizontalAlignment = GridData.FILL;
				data.grabExcessHorizontalSpace = true;
				initialObjectField.setLayoutData(data);
			}

			initialObjectField.add(getLabel(umL2Package.getModel()));
			initialObjectField.add(getLabel(umL2Package.getProfile()));

			initialObjectField.addSelectionListener
				(new SelectionAdapter() {
					 public void widgetSelected(SelectionEvent e) {
						 setPageComplete(isPageComplete());
					 }
				 });

			Label encodingLabel = new Label(composite, SWT.LEFT);
			{
				encodingLabel.setText(UML2EditorPlugin.INSTANCE.getString("_UI_XMLEncoding")); //$NON-NLS-1$

				GridData data = new GridData();
				data.horizontalAlignment = GridData.FILL;
				encodingLabel.setLayoutData(data);
			}
			encodingField = new Combo(composite, SWT.BORDER);
			{
				GridData data = new GridData();
				data.horizontalAlignment = GridData.FILL;
				data.grabExcessHorizontalSpace = true;
				encodingField.setLayoutData(data);
			}

			for (StringTokenizer stringTokenizer = new StringTokenizer(UML2EditorPlugin.INSTANCE.getString("_UI_XMLEncodingChoices")); stringTokenizer.hasMoreTokens(); ) //$NON-NLS-1$
			{
				encodingField.add(stringTokenizer.nextToken());
			}
			encodingField.select(0);

			setControl(composite);
		}

		/**
		 * The framework calls this to see if the file is correct.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public boolean isPageComplete() {
			if (super.isPageComplete()) {
				return initialObjectField.getSelectionIndex() != -1;
			}
			else {
				return false;
			}
		}

		/**
		 * Store the dialog field settings upon completion.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public boolean performFinish() {
			initialObjectName = getInitialObjectName();
			encoding = getEncoding();
			return true;
		}

		/**
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public String getInitialObjectName() {
			if (initialObjectName != null) {
				return initialObjectName;
			}
			else {
				String label = initialObjectField.getText();
				for (Iterator classifier = umL2Package.getEClassifiers().iterator(); classifier.hasNext(); ) {
					EClassifier eClassifier = (EClassifier)classifier.next();
					if (eClassifier instanceof EClass) {
						EClass eClass = (EClass)eClassifier;
						if (!eClass.isAbstract() && getLabel(eClass).equals(label)) {
							return eClass.getName();
						}
					}
				}
				return label;
			}
		}

		/**
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public String getEncoding() {
			return
				encoding == null ?
					encodingField.getText() :
					encoding;
		}
		/**
		 * Returns the label of the specified element.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		protected String getLabel(EClass eClass) {
			String name = eClass.getName();
			try {
				return UML2EditPlugin.INSTANCE.getString("_UI_" + name + "_type");
			}
			catch(MissingResourceException mre) {
			}
			return name;
		}
	}

	/**
	 * The framework calls this to create the contents of the wizard.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addPages() {
		// Create a page, set the title, and the initial model file name.
		//
		newFileCreationPage = new UML2ModelWizardNewFileCreationPage("Whatever", selection); //$NON-NLS-1$
		newFileCreationPage.setTitle(UML2EditorPlugin.INSTANCE.getString("_UI_UML2ModelWizard_label")); //$NON-NLS-1$
		newFileCreationPage.setDescription(UML2EditorPlugin.INSTANCE.getString("_UI_UML2ModelWizard_description")); //$NON-NLS-1$
		newFileCreationPage.setFileName(UML2EditorPlugin.INSTANCE.getString("_UI_UML2EditorFilenameDefaultBase") + "." + UML2EditorPlugin.INSTANCE.getString("_UI_UML2EditorFilenameExtension")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
		addPage(newFileCreationPage);

		// Try and get the resource selection to determine a current directory for the file dialog.
		//
		if (selection != null && !selection.isEmpty()) {
			// Get the resource...
			//
			Object selectedElement = selection.iterator().next();
			if (selectedElement instanceof IResource) {
				// Get the resource parent, if its a file.
				//
				IResource selectedResource = (IResource)selectedElement;
				if (selectedResource.getType() == IResource.FILE) {
					selectedResource = selectedResource.getParent();
				}

				// This gives us a directory...
				//
				if (selectedResource instanceof IFolder || selectedResource instanceof IProject) {
					// Set this for the container.
					//
					newFileCreationPage.setContainerFullPath(selectedResource.getFullPath());

					// Make up a unique new name here.
					//
					String defaultModelBaseFilename = UML2EditorPlugin.INSTANCE.getString("_UI_UML2EditorFilenameDefaultBase"); //$NON-NLS-1$
					String defaultModelFilenameExtension = UML2EditorPlugin.INSTANCE.getString("_UI_UML2EditorFilenameExtension"); //$NON-NLS-1$
					String modelFilename = defaultModelBaseFilename + "." + defaultModelFilenameExtension; //$NON-NLS-1$
					for (int i = 1; ((IContainer)selectedResource).findMember(modelFilename) != null; ++i) {
						modelFilename = defaultModelBaseFilename + i + "." + defaultModelFilenameExtension; //$NON-NLS-1$
					}
					newFileCreationPage.setFileName(modelFilename);
				}
			}
		}
		initialObjectCreationPage = new UML2ModelWizardInitialObjectCreationPage("Whatever2"); //$NON-NLS-1$
		initialObjectCreationPage.setTitle(UML2EditorPlugin.INSTANCE.getString("_UI_UML2ModelWizard_label")); //$NON-NLS-1$
		initialObjectCreationPage.setDescription(UML2EditorPlugin.INSTANCE.getString("_UI_Wizard_initial_object_description")); //$NON-NLS-1$
		addPage(initialObjectCreationPage);
	}

	/**
	 * Get the file from the page.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IFile getModelFile() {
		return newFileCreationPage.getModelFile();
	}

}
