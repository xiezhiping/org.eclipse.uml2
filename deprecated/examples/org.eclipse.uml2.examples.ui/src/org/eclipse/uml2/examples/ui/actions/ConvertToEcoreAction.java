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
 * $Id: ConvertToEcoreAction.java,v 1.2 2005/01/19 22:57:35 khussey Exp $
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
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.PlatformUI;
import org.eclipse.uml2.edit.util.ChangeCommand;
import org.eclipse.uml2.examples.ui.ExamplesUIPlugin;
import org.eclipse.uml2.util.UML2Util;
import org.eclipse.uml2.util.UML2Validator;

/**
 * 
 */
public class ConvertToEcoreAction
		extends DiagnosticAction {

	protected static final String ECORE_FILE_EXTENSION = "ecore";

	public ConvertToEcoreAction() {
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

			editingDomain.getCommandStack().execute(
				new ChangeCommand(editingDomain, new Runnable() {

					public void run() {

						final Shell shell = PlatformUI.getWorkbench()
							.getActiveWorkbenchWindow().getShell();

						IRunnableWithProgress runnableWithProgress = new IRunnableWithProgress() {

							public void run(
									final IProgressMonitor progressMonitor)
									throws InvocationTargetException,
									InterruptedException {

								try {
									Map options = new HashMap();

									options
										.put(
											UML2Util.UML22EcoreConverter.OPTION__DERIVED_FEATURES,
											UML2Util.OPTION__PROCESS);
									options
										.put(
											UML2Util.UML22EcoreConverter.OPTION__DERIVED_UNION_PROPERTIES,
											UML2Util.OPTION__PROCESS);
									options
										.put(
											UML2Util.UML22EcoreConverter.OPTION__REDEFINING_PROPERTIES,
											UML2Util.OPTION__PROCESS);
									options
										.put(
											UML2Util.UML22EcoreConverter.OPTION__SUBSETTING_PROPERTIES,
											UML2Util.OPTION__PROCESS);
									options
										.put(
											UML2Util.UML22EcoreConverter.OPTION__DUPLICATE_OPERATIONS,
											UML2Util.OPTION__PROCESS);
									options
										.put(
											UML2Util.UML22EcoreConverter.OPTION__DUPLICATE_OPERATION_INHERITANCE,
											UML2Util.OPTION__PROCESS);
									options
										.put(
											UML2Util.UML22EcoreConverter.OPTION__DUPLICATE_FEATURES,
											UML2Util.OPTION__PROCESS);
									options
										.put(
											UML2Util.UML22EcoreConverter.OPTION__DUPLICATE_FEATURE_INHERITANCE,
											UML2Util.OPTION__PROCESS);
									options
										.put(
											UML2Util.UML22EcoreConverter.OPTION__OBSOLETE_FEATURES,
											UML2Util.OPTION__PROCESS);

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
									context.put(
										UML2Util.QualifiedTextProvider.class,
										qualifiedTextProvider);

									progressMonitor
										.beginTask(
											ExamplesUIPlugin
												.getDefault()
												.getString(
													"_UI_ConvertingToEcore_message",
													new Object[]{substitutionLabelProvider
														.getObjectLabel(package_)}),
											IProgressMonitor.UNKNOWN);

									Resource resource = package_.eResource();
									ResourceSet resourceSet = resource
										.getResourceSet();
									URI uri = resourceSet.getURIConverter()
										.normalize(resource.getURI())
										.trimFileExtension().trimSegments(1);

									List resources = new ArrayList();

									for (Iterator ePackages = UML2Util
										.convertToEcore(package_, options,
											diagnostics, context).iterator(); ePackages
										.hasNext();) {

										EPackage ePackage = (EPackage) ePackages
											.next();

										resources.add(resource = resourceSet
											.createResource(uri.appendSegment(
												ePackage.getName())
												.appendFileExtension(
													ECORE_FILE_EXTENSION)));

										resource.getContents().add(ePackage);

									}

									for (Iterator i = resources.iterator(); i
										.hasNext();) {

										try {
											((Resource) i.next()).save(null);
										} catch (Exception e) {
											ExamplesUIPlugin.getDefault()
												.log(e);
										}
									}

									handleDiagnostic(
										progressMonitor.isCanceled()
											? Diagnostic.CANCEL_INSTANCE
											: diagnostics,
										ExamplesUIPlugin
											.getDefault()
											.getString(
												"_UI_ConvertToEcoreActionCommand_label",
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
							new ProgressMonitorDialog(shell).run(false, true,
								runnableWithProgress);
						} catch (Exception exception) {
							ExamplesUIPlugin.getDefault().log(exception);
						}
					}
				}, ExamplesUIPlugin.getDefault().getString(
					"_UI_ConvertToEcoreActionCommand_label", //$NON-NLS-1$
					new Object[]{getLabelProvider().getText(package_)})));
		}
	}
}