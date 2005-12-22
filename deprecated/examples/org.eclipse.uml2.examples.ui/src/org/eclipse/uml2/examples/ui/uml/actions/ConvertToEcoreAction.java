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
 * $Id: ConvertToEcoreAction.java,v 1.1 2005/12/22 20:19:55 khussey Exp $
 */
package org.eclipse.uml2.examples.ui.uml.actions;

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
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
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
import org.eclipse.uml2.examples.ui.uml.dialogs.UML2EcoreConverterOptionsDialog;
import org.eclipse.uml2.uml.editor.actions.DiagnosticAction;
import org.eclipse.uml2.uml.editor.dialogs.OptionsDialog;
import org.eclipse.uml2.uml.util.UMLUtil;
import org.eclipse.uml2.uml.util.UMLValidator;
import org.eclipse.uml2.util.UML2Util;

public class ConvertToEcoreAction
		extends DiagnosticAction {

	protected static final String ECORE_FILE_EXTENSION = "ecore"; //$NON-NLS-1$

	public ConvertToEcoreAction() {
		super();
	}

	protected Command createActionCommand(EditingDomain editingDomain,
			Collection collection) {

		if (collection.size() == 1
			&& collection.toArray()[0] instanceof org.eclipse.uml2.uml.Package) {

			return IdentityCommand.INSTANCE;
		}

		return UnexecutableCommand.INSTANCE;
	}

	public void run(IAction action) {

		if (command != UnexecutableCommand.INSTANCE) {
			final org.eclipse.uml2.uml.Package package_ = (org.eclipse.uml2.uml.Package) collection
				.toArray()[0];

			final Shell shell = PlatformUI.getWorkbench()
				.getActiveWorkbenchWindow().getShell();

			final Map options = new HashMap();

			final String label = ExamplesUIPlugin.INSTANCE.getString(
				"_UI_ConvertToEcoreActionCommand_label", //$NON-NLS-1$
				new Object[]{getLabelProvider().getText(package_)});

			OptionsDialog optionsDialog = new UML2EcoreConverterOptionsDialog(
				shell, label, ExamplesUIPlugin.INSTANCE
					.getString("_UI_OptionsDialog_message"), options); //$NON-NLS-1$

			if (optionsDialog.open() == Window.OK) {
				IRunnableWithProgress runnableWithProgress = new IRunnableWithProgress() {

					public void run(final IProgressMonitor progressMonitor)
							throws InvocationTargetException,
							InterruptedException {

						try {
							final BasicDiagnostic diagnostics = new BasicDiagnostic(
								UMLValidator.DIAGNOSTIC_SOURCE, 0,
								EcorePlugin.INSTANCE.getString(
									"_UI_DiagnosticRoot_diagnostic", //$NON-NLS-1$
									new Object[]{substitutionLabelProvider
										.getObjectLabel(package_)}),
								new Object[]{package_});

							Map context = new HashMap();
							context.put(UML2Util.QualifiedTextProvider.class,
								qualifiedTextProvider);

							progressMonitor.beginTask(ExamplesUIPlugin.INSTANCE
								.getString("_UI_ConvertingToEcore_message", //$NON-NLS-1$
									new Object[]{substitutionLabelProvider
										.getObjectLabel(package_)}),
								IProgressMonitor.UNKNOWN);

							Resource resource = package_.eResource();
							ResourceSet resourceSet = resource.getResourceSet();
							URI uri = resourceSet.getURIConverter().normalize(
								resource.getURI()).trimFileExtension()
								.trimSegments(1);

							List resources = new ArrayList();

							for (Iterator ePackages = UMLUtil.convertToEcore(
								package_, options, diagnostics, context)
								.iterator(); ePackages.hasNext();) {

								EPackage ePackage = (EPackage) ePackages.next();

								resources.add(resource = resourceSet
									.createResource(uri.appendSegment(
										ePackage.getName())
										.appendFileExtension(
											ECORE_FILE_EXTENSION)));

								resource.getContents().add(ePackage);
							}

							for (Iterator i = resources.iterator(); i.hasNext();) {

								try {
									((Resource) i.next()).save(null);
								} catch (Exception e) {
									ExamplesUIPlugin.INSTANCE.log(e);
								}
							}

							handleDiagnostic(progressMonitor.isCanceled()
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
					new ProgressMonitorDialog(shell).run(false, true,
						runnableWithProgress);
				} catch (Exception e) {
					ExamplesUIPlugin.INSTANCE.log(e);
				}
			}
		}
	}

}
