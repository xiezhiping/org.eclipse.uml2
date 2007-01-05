/*
 * Copyright (c) 2005, 2007 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *
 * $Id: MergePackageAction.java,v 1.3 2007/01/05 21:48:51 khussey Exp $
 */
package org.eclipse.uml2.uml.editor.actions;

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
import org.eclipse.uml2.common.edit.command.ChangeCommand;
import org.eclipse.uml2.uml.editor.UMLEditorPlugin;
import org.eclipse.uml2.uml.editor.dialogs.OptionsDialog;
import org.eclipse.uml2.uml.editor.dialogs.PackageMergerOptionsDialog;
import org.eclipse.uml2.uml.util.UMLUtil;
import org.eclipse.uml2.uml.util.UMLValidator;

public class MergePackageAction
		extends DiagnosticAction {

	public MergePackageAction() {
		super();
	}

	@Override
	protected Command createActionCommand(EditingDomain editingDomain,
			Collection<?> collection) {

		if (collection.size() == 1
			&& collection.iterator().next() instanceof org.eclipse.uml2.uml.Package) {

			return IdentityCommand.INSTANCE;
		}

		return UnexecutableCommand.INSTANCE;
	}

	@Override
	public void run(IAction action) {

		if (command != UnexecutableCommand.INSTANCE) {
			final org.eclipse.uml2.uml.Package package_ = (org.eclipse.uml2.uml.Package) collection
				.iterator().next();

			final Shell shell = PlatformUI.getWorkbench()
				.getActiveWorkbenchWindow().getShell();

			final Map<String, String> options = new HashMap<String, String>();

			final String label = UMLEditorPlugin.INSTANCE.getString(
				"_UI_MergePackageActionCommand_label", //$NON-NLS-1$
				new Object[]{getLabelProvider().getText(package_)});

			OptionsDialog optionsDialog = new PackageMergerOptionsDialog(shell,
				label, UMLEditorPlugin.INSTANCE
					.getString("_UI_OptionsDialog_message"), options); //$NON-NLS-1$

			if (optionsDialog.open() == Window.OK) {
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
											UMLValidator.DIAGNOSTIC_SOURCE,
											0,
											EcorePlugin.INSTANCE
												.getString(
													"_UI_DiagnosticRoot_diagnostic", //$NON-NLS-1$
													new Object[]{substitutionLabelProvider
														.getObjectLabel(package_)}),
											new Object[]{package_});

										Map<Object, Object> context = new HashMap<Object, Object>();
										context
											.put(
												EValidator.SubstitutionLabelProvider.class,
												substitutionLabelProvider);

										progressMonitor
											.beginTask(
												UMLEditorPlugin.INSTANCE
													.getString(
														"_UI_MergingPackage_message", //$NON-NLS-1$
														new Object[]{substitutionLabelProvider
															.getObjectLabel(package_)}),
												IProgressMonitor.UNKNOWN);

										UMLUtil.merge(package_, options,
											diagnostics, context);

										handleDiagnostic(progressMonitor
											.isCanceled()
											? Diagnostic.CANCEL_INSTANCE
											: diagnostics, label);
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
							} catch (Exception e) {
								UMLEditorPlugin.INSTANCE.log(e);
							}
						}
					}, label));
			}
		}
	}

}
