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
 * $Id: DiagnosticAction.java,v 1.1 2005/01/12 22:04:08 khussey Exp $
 */
package org.eclipse.uml2.examples.ui.actions;

import java.util.Iterator;
import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.ui.viewer.IViewerProvider;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.edit.ui.action.ValidateAction;
import org.eclipse.emf.edit.ui.action.ValidateAction.EclipseResourcesUtil;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.part.ISetSelectionTarget;
import org.eclipse.uml2.examples.ui.ExamplesUIPlugin;
import org.osgi.framework.Bundle;

/**
 * 
 */
public class DiagnosticAction
		extends UML2CommandAction {

	protected static final String URI_SCHEME_PLATFORM = "platform";

	protected static final String URI_SEGMENT_RESOURCE = "resource";

	protected final Bundle resourcesBundle = Platform
		.getBundle("org.eclipse.core.resources");

	protected final ValidateAction.EclipseResourcesUtil eclipseResourcesUtil = null == resourcesBundle
		? null
		: new EclipseResourcesUtil();

	protected final EValidator.SubstitutionLabelProvider substitutionLabelProvider = new EValidator.SubstitutionLabelProvider() {

		public String getObjectLabel(EObject eObject) {
			return getLabelProvider().getText(eObject);
		}

		public String getFeatureLabel(EStructuralFeature eStructuralFeature) {
			return getLabelProvider().getText(eStructuralFeature);
		}

		public String getValueLabel(EDataType eDataType, Object value) {
			return EcoreUtil.convertToString(eDataType, value);
		}

	};

	protected DiagnosticAction() {
		super();
	}

	protected void handleDiagnostic(Diagnostic diagnostic, String dialogTitle) {

		switch (diagnostic.getSeverity()) {

			case Diagnostic.OK :
				MessageDialog.openInformation(PlatformUI.getWorkbench()
					.getActiveWorkbenchWindow().getShell(), dialogTitle,
					ExamplesUIPlugin.getDefault().getString(
						"_UI_DiagnosticOK_message"));
				break;
			case Diagnostic.INFO :
				ErrorDialog.openError(PlatformUI.getWorkbench()
					.getActiveWorkbenchWindow().getShell(), dialogTitle,
					ExamplesUIPlugin.getDefault().getString(
						"_UI_DiagnosticOK_message"), BasicDiagnostic
						.toIStatus(diagnostic));
				break;
			default :
				final int result = ErrorDialog.openError(PlatformUI
					.getWorkbench().getActiveWorkbenchWindow().getShell(),
					dialogTitle, ExamplesUIPlugin.getDefault().getString(
						"_UI_DiagnosticProblems_message"), BasicDiagnostic
						.toIStatus(diagnostic));

				if (null != resourcesBundle) {
					IFile file = getFile();

					try {
						file.deleteMarkers(EValidator.MARKER, true,
							IResource.DEPTH_ZERO);
					} catch (CoreException exception) {
						ExamplesUIPlugin.getDefault().log(exception);
					}

					if (result == Dialog.OK) {

						if (!diagnostic.getChildren().isEmpty()) {

							List data = ((Diagnostic) diagnostic.getChildren()
								.get(0)).getData();

							if (!data.isEmpty()
								&& data.get(0) instanceof EObject) {
								IWorkbenchPart activePart = PlatformUI
									.getWorkbench().getActiveWorkbenchWindow()
									.getActivePage().getActivePart();

								if (activePart instanceof ISetSelectionTarget) {
									((ISetSelectionTarget) activePart)
										.selectReveal(new StructuredSelection(
											data.get(0)));
								} else if (activePart instanceof IViewerProvider) {
									Viewer viewer = ((IViewerProvider) activePart)
										.getViewer();

									if (null != viewer) {
										viewer
											.setSelection(
												new StructuredSelection(data
													.get(0)), true);
									}
								}
							}
						}

						for (Iterator i = diagnostic.getChildren().iterator(); i
							.hasNext();) {

							createMarkers(file, (Diagnostic) i.next());
						}
					}
				}

		}
	}

	protected void createMarkers(IFile file, Diagnostic diagnostic) {
		eclipseResourcesUtil.createMarkers(file, diagnostic);
	}

	protected IFile getFile() {
		ResourceSet resourceSet = editingDomain.getResourceSet();
		Resource resource = (Resource) resourceSet.getResources().get(0);

		if (null != resource) {
			URI uri = resourceSet.getURIConverter()
				.normalize(resource.getURI());

			if (URI_SCHEME_PLATFORM.equals(uri.scheme())
				&& uri.segmentCount() > 1
				&& URI_SEGMENT_RESOURCE.equals(uri.segment(0))) {

				StringBuffer platformResourcePath = new StringBuffer();

				for (int i = 1, size = uri.segmentCount(); i < size; i++) {
					platformResourcePath.append('/');
					platformResourcePath.append(uri.segment(i));
				}

				return ResourcesPlugin.getWorkspace().getRoot().getFile(
					new Path(platformResourcePath.toString()));
			}
		}

		return null;
	}
}