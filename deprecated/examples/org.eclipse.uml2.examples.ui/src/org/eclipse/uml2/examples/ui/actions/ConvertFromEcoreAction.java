/*
 * Copyright (c) 2005 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *
 * $Id: ConvertFromEcoreAction.java,v 1.1 2005/04/06 19:59:55 khussey Exp $
 */
package org.eclipse.uml2.examples.ui.actions;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.IdentityCommand;
import org.eclipse.emf.common.command.UnexecutableCommand;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.emf.ecore.presentation.EcoreEditor;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.dialogs.ProgressMonitorDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.PlatformUI;
import org.eclipse.uml2.examples.ui.ExamplesUIPlugin;
import org.eclipse.uml2.examples.ui.dialogs.Ecore2UML2ConverterOptionsDialog;
import org.eclipse.uml2.examples.ui.dialogs.OptionsDialog;
import org.eclipse.uml2.util.UML2Resource;
import org.eclipse.uml2.util.UML2Util;
import org.eclipse.uml2.util.UML2Validator;

/**
 * 
 */
public class ConvertFromEcoreAction
		extends DiagnosticAction {

	public ConvertFromEcoreAction() {
		super();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.uml2.examples.ui.actions.UML2CommandAction#getAdapterFactory()
	 */
	protected AdapterFactory getAdapterFactory() {
		return null == editorPart
			? null
			: ((EcoreEditor) editorPart).getAdapterFactory();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.emf.edit.ui.action.CommandAction#createActionCommand(org.eclipse.emf.edit.domain.EditingDomain,
	 *      java.util.Collection)
	 */
	protected Command createActionCommand(EditingDomain editingDomain,
			Collection collection) {

		if (1 == collection.size()
			&& EPackage.class.isInstance(collection.toArray()[0])) {

			return IdentityCommand.INSTANCE;
		}

		return UnexecutableCommand.INSTANCE;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.ui.IActionDelegate#run(org.eclipse.jface.action.IAction)
	 */
	public void run(IAction action) {

		if (UnexecutableCommand.INSTANCE != command) {
			final EPackage ePackage = (EPackage) collection.toArray()[0];

			final Shell shell = PlatformUI.getWorkbench()
				.getActiveWorkbenchWindow().getShell();

			final Map options = new HashMap();

			OptionsDialog optionsDialog = new Ecore2UML2ConverterOptionsDialog(
				shell, ExamplesUIPlugin.getDefault().getString(
					"_UI_ConvertFromEcoreActionCommand_label",
					new Object[]{getLabelProvider().getText(ePackage)}),
				ExamplesUIPlugin.getDefault().getString(
					"_UI_OptionsDialog_message"), options);

			if (Window.OK == optionsDialog.open()) {
				IRunnableWithProgress runnableWithProgress = new IRunnableWithProgress() {

					public void run(final IProgressMonitor progressMonitor)
							throws InvocationTargetException,
							InterruptedException {

						try {
							final BasicDiagnostic diagnostics = new BasicDiagnostic(
								UML2Validator.DIAGNOSTIC_SOURCE, 0,
								EcorePlugin.INSTANCE.getString(
									"_UI_DiagnosticRoot_diagnostic",
									new Object[]{substitutionLabelProvider
										.getObjectLabel(ePackage)}),
								new Object[]{ePackage});

							Map context = new HashMap();
							context.put(UML2Util.QualifiedTextProvider.class,
								qualifiedTextProvider);

							progressMonitor.beginTask(ExamplesUIPlugin
								.getDefault().getString(
									"_UI_ConvertingFromEcore_message",
									new Object[]{substitutionLabelProvider
										.getObjectLabel(ePackage)}),
								IProgressMonitor.UNKNOWN);

							Resource resource = ePackage.eResource();
							ResourceSet resourceSet = resource.getResourceSet();
							URI uri = resourceSet.getURIConverter().normalize(
								resource.getURI()).trimFileExtension()
								.trimSegments(1);

							List resources = new ArrayList();

							for (Iterator packages = UML2Util.convertFromEcore(
								ePackage, options, diagnostics, context)
								.iterator(); packages.hasNext();) {

								org.eclipse.uml2.Package package_ = (org.eclipse.uml2.Package) packages
									.next();

								resources.add(resource = resourceSet
									.createResource(uri.appendSegment(
										package_.getName())
										.appendFileExtension(
											UML2Resource.FILE_EXTENSION)));

								resource.getContents().add(package_);

							}

							for (Iterator i = resources.iterator(); i.hasNext();) {

								try {
									((Resource) i.next()).save(null);
								} catch (Exception e) {
									ExamplesUIPlugin.getDefault().log(e);
								}
							}

							handleDiagnostic(progressMonitor.isCanceled()
								? Diagnostic.CANCEL_INSTANCE
								: diagnostics, ExamplesUIPlugin.getDefault()
								.getString(
									"_UI_ConvertFromEcoreActionCommand_label",
									new Object[]{getLabelProvider().getText(
										ePackage)}));

						} finally {
							progressMonitor.done();
						}
					}
				};

				if (eclipseResourcesUtil != null) {
					runnableWithProgress = eclipseResourcesUtil
						.getWorkspaceModifyOperation(runnableWithProgress);
				}

				try {
					new ProgressMonitorDialog(shell).run(false, true,
						runnableWithProgress);
				} catch (Exception exception) {
					ExamplesUIPlugin.getDefault().log(exception);
				}
			}
		}
	}
}