/*
 * Copyright (c) 2005 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Common Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/cpl-v10.html
 *
 * Contributors:
 *   IBM - Initial API and implementation
 *
 * $Id: MergePackageAction.java,v 1.4 2005/02/11 23:08:10 khussey Exp $
 */
package org.eclipse.uml2.examples.ui.actions;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.IdentityCommand;
import org.eclipse.emf.common.command.UnexecutableCommand;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.dialogs.ProgressMonitorDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.PlatformUI;
import org.eclipse.uml2.edit.util.ChangeCommand;
import org.eclipse.uml2.examples.ui.ExamplesUIPlugin;
import org.eclipse.uml2.examples.ui.dialogs.OptionsDialog;
import org.eclipse.uml2.examples.ui.dialogs.PackageMergerOptionsDialog;
import org.eclipse.uml2.util.UML2Util;
import org.eclipse.uml2.util.UML2Validator;

/**
 * 
 */
public class MergePackageAction
		extends DiagnosticAction {

	public MergePackageAction() {
		super();
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
			&& org.eclipse.uml2.Package.class
				.isInstance(collection.toArray()[0])) {

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
			final org.eclipse.uml2.Package package_ = (org.eclipse.uml2.Package) collection
				.toArray()[0];

			final Shell shell = PlatformUI.getWorkbench()
				.getActiveWorkbenchWindow().getShell();

			final Map options = new HashMap();

			OptionsDialog optionsDialog = new PackageMergerOptionsDialog(shell,
				ExamplesUIPlugin.getDefault().getString(
					"_UI_MergePackageActionCommand_label",
					new Object[]{getLabelProvider().getText(package_)}),
				ExamplesUIPlugin.getDefault().getString(
					"_UI_OptionsDialog_message"), options);

			if (Window.OK == optionsDialog.open()) {
				editingDomain.getCommandStack().execute(
					new ChangeCommand(editingDomain, new Runnable() {

						public void run() {

							IRunnableWithProgress runnableWithProgress = new IRunnableWithProgress() {

								public void run(
										final IProgressMonitor progressMonitor)
										throws InvocationTargetException,
										InterruptedException {

									try {
										final BasicDiagnostic diagnostics = new BasicDiagnostic(
											UML2Validator.DIAGNOSTIC_SOURCE,
											0,
											EcorePlugin.INSTANCE
												.getString(
													"_UI_DiagnosticRoot_diagnostic",
													new Object[]{substitutionLabelProvider
														.getObjectLabel(package_)}),
											new Object[]{package_});

										Map context = new HashMap();
										context
											.put(
												EValidator.SubstitutionLabelProvider.class,
												substitutionLabelProvider);

										progressMonitor
											.beginTask(
												ExamplesUIPlugin
													.getDefault()
													.getString(
														"_UI_MergingPackage_message",
														new Object[]{substitutionLabelProvider
															.getObjectLabel(package_)}),
												IProgressMonitor.UNKNOWN);

										UML2Util.merge(package_, options,
											diagnostics, context);

										handleDiagnostic(
											progressMonitor.isCanceled()
												? Diagnostic.CANCEL_INSTANCE
												: diagnostics,
											ExamplesUIPlugin
												.getDefault()
												.getString(
													"_UI_MergePackageActionCommand_label",
													new Object[]{getLabelProvider()
														.getText(package_)}));
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
								new ProgressMonitorDialog(shell).run(false,
									true, runnableWithProgress);
							} catch (Exception exception) {
								ExamplesUIPlugin.getDefault().log(exception);
							}
						}
					}, ExamplesUIPlugin.getDefault().getString(
						"_UI_MergePackageActionCommand_label", //$NON-NLS-1$
						new Object[]{getLabelProvider().getText(package_)})));
			}
		}
	}

}