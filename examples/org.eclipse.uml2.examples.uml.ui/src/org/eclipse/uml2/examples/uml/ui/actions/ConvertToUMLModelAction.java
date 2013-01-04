/*
 * Copyright (c) 2005, 2013 IBM Corporation, CEA, and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *   Kenn Hussey (CEA) - 316165
 *
 */
package org.eclipse.uml2.examples.uml.ui.actions;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.IdentityCommand;
import org.eclipse.emf.common.command.UnexecutableCommand;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.emf.ecore.presentation.EcoreEditor;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.xmi.XMIResource;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.dialogs.ProgressMonitorDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.PlatformUI;
import org.eclipse.uml2.common.util.UML2Util;
import org.eclipse.uml2.examples.uml.ui.UMLExamplesUIPlugin;
import org.eclipse.uml2.examples.uml.ui.dialogs.Ecore2UMLConverterOptionsDialog;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.UMLPlugin;
import org.eclipse.uml2.uml.editor.actions.DiagnosticAction;
import org.eclipse.uml2.uml.editor.dialogs.OptionsDialog;
import org.eclipse.uml2.uml.resource.UMLResource;
import org.eclipse.uml2.uml.util.UMLUtil;
import org.eclipse.uml2.uml.util.UMLValidator;

public class ConvertToUMLModelAction
		extends DiagnosticAction {

	public ConvertToUMLModelAction() {
		super();
	}

	@Override
	protected AdapterFactory getAdapterFactory() {
		return workbenchPart instanceof EcoreEditor
			? ((EcoreEditor) workbenchPart).getAdapterFactory()
			: null;
	}

	@Override
	protected Command createActionCommand(EditingDomain editingDomain,
			Collection<?> collection) {

		if (collection.size() == 1
			&& collection.iterator().next() instanceof EPackage) {

			return IdentityCommand.INSTANCE;
		}

		return UnexecutableCommand.INSTANCE;
	}

	@Override
	public void run(IAction action) {

		if (command != UnexecutableCommand.INSTANCE) {
			final EPackage ePackage = (EPackage) collection.iterator().next();

			final Shell shell = PlatformUI.getWorkbench()
				.getActiveWorkbenchWindow().getShell();

			final Map<String, String> options = new HashMap<String, String>();

			final String label = UMLExamplesUIPlugin.INSTANCE.getString(
				"_UI_ConvertToUMLActionCommand_label", //$NON-NLS-1$
				new Object[]{getLabelProvider().getText(ePackage)});

			OptionsDialog optionsDialog = new Ecore2UMLConverterOptionsDialog(
				shell, label, UMLExamplesUIPlugin.INSTANCE
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
										.getObjectLabel(ePackage)}),
								new Object[]{ePackage});

							Map<Object, Object> context = new HashMap<Object, Object>();
							context.put(UML2Util.QualifiedTextProvider.class,
								qualifiedTextProvider);

							progressMonitor.beginTask(
								UMLExamplesUIPlugin.INSTANCE.getString(
									"_UI_ConvertingToUML_message", //$NON-NLS-1$
									new Object[]{substitutionLabelProvider
										.getObjectLabel(ePackage)}),
								IProgressMonitor.UNKNOWN);

							Resource resource = ePackage.eResource();
							ResourceSet resourceSet = resource.getResourceSet();
							URI uri = resourceSet.getURIConverter().normalize(
								resource.getURI()).trimFileExtension()
								.trimSegments(1);

							List<Resource> resources = new ArrayList<Resource>();

							for (org.eclipse.uml2.uml.Package package_ : UMLUtil
								.convertFromEcore(ePackage, options,
									diagnostics, context)) {

								resources.add(resource = resourceSet
									.createResource(uri.appendSegment(
										package_.getName())
										.appendFileExtension(
											UMLResource.FILE_EXTENSION)));

								EList<EObject> contents = resource
									.getContents();

								contents.add(package_);

								for (TreeIterator<EObject> allContents = UML2Util
									.getAllContents(package_, true, false); allContents
									.hasNext();) {

									EObject eObject = allContents.next();

									if (eObject instanceof Element) {
										contents.addAll(((Element) eObject)
											.getStereotypeApplications());
									}
								}

								if (UMLUtil.OPTION__PROCESS
									.equals(options
										.get(UMLUtil.Ecore2UMLConverter.OPTION__XMI_IDENTIFIERS))
									&& resource instanceof XMIResource) {

									XMIResource xmiResource = (XMIResource) resource;

									for (TreeIterator<EObject> allContents = xmiResource
										.getAllContents(); allContents
										.hasNext();) {

										EObject eObject = allContents.next();
										String xmiIdentifier = UML2Util
											.getXMIIdentifier((InternalEObject) eObject);

										if (diagnostics != null) {
											diagnostics
												.add(new BasicDiagnostic(
													Diagnostic.INFO,
													UMLValidator.DIAGNOSTIC_SOURCE,
													UMLUtil.Ecore2UMLConverter.XMI_IDENTIFIER,
													UMLPlugin.INSTANCE
														.getString(
															"_UI_Ecore2UMLConverter_ProcessXMIIdentifier_diagnostic", //$NON-NLS-1$
															UML2Util
																.getMessageSubstitutions(
																	context,
																	eObject,
																	xmiIdentifier)),
													new Object[]{eObject}));
										}

										xmiResource.setID(eObject,
											xmiIdentifier);
									}
								}
							}

							for (Resource r : resources) {

								try {
									r.save(null);
								} catch (Exception e) {
									UMLExamplesUIPlugin.INSTANCE.log(e);
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
					UMLExamplesUIPlugin.INSTANCE.log(e);
				}
			}
		}
	}
}
