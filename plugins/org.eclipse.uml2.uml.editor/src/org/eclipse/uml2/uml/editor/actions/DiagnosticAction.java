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
 * $Id: DiagnosticAction.java,v 1.1 2005/12/22 20:21:06 khussey Exp $
 */
package org.eclipse.uml2.uml.editor.actions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

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
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.part.ISetSelectionTarget;
import org.eclipse.uml2.common.util.UML2Util;
import org.eclipse.uml2.uml.editor.UMLEditorPlugin;
import org.eclipse.uml2.uml.util.UMLUtil;
import org.osgi.framework.Bundle;

public class DiagnosticAction
		extends UMLCommandAction {

	protected final Bundle resourcesBundle = Platform
		.getBundle("org.eclipse.core.resources"); //$NON-NLS-1$

	protected final ValidateAction.EclipseResourcesUtil eclipseResourcesUtil = resourcesBundle == null
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

	protected final UMLUtil.QualifiedTextProvider qualifiedTextProvider = new UMLUtil.QualifiedTextProvider() {

		public String getFeatureText(EStructuralFeature eStructuralFeature) {
			return getLabelProvider().getText(eStructuralFeature);
		}

		public String getClassText(EObject eObject) {
			return getLabelProvider().getText(eObject.eClass());
		}
	};

	protected final Map resourceToFileMap = new HashMap();

	protected DiagnosticAction() {
		super();
	}

	protected void handleDiagnostic(Diagnostic diagnostic, String dialogTitle) {

		switch (diagnostic.getSeverity()) {

			case Diagnostic.OK :
				MessageDialog.openInformation(PlatformUI.getWorkbench()
					.getActiveWorkbenchWindow().getShell(), dialogTitle,
					UMLEditorPlugin.INSTANCE
						.getString("_UI_DiagnosticOK_message")); //$NON-NLS-1$
				break;
			case Diagnostic.INFO :
				ErrorDialog.openError(PlatformUI.getWorkbench()
					.getActiveWorkbenchWindow().getShell(), dialogTitle,
					UMLEditorPlugin.INSTANCE
						.getString("_UI_DiagnosticOK_message"), BasicDiagnostic //$NON-NLS-1$
						.toIStatus(diagnostic));
				break;
			default :
				ErrorDialog.openError(PlatformUI.getWorkbench()
					.getActiveWorkbenchWindow().getShell(), dialogTitle,
					UMLEditorPlugin.INSTANCE
						.getString("_UI_DiagnosticProblems_message"), //$NON-NLS-1$
					BasicDiagnostic.toIStatus(diagnostic));
		}

		if (resourcesBundle != null) {
			Map fileToDiagnosticMap = new HashMap();

			for (Iterator children = diagnostic.getChildren().iterator(); children
				.hasNext();) {

				Diagnostic child = (Diagnostic) children.next();
				IFile file = getFile(child);

				if (file != null) {
					List diagnostics = (List) fileToDiagnosticMap.get(file);

					if (diagnostics == null) {
						try {
							file.deleteMarkers(EValidator.MARKER, true,
								IResource.DEPTH_ZERO);
						} catch (CoreException ce) {
							UMLEditorPlugin.INSTANCE.log(ce);
						}

						fileToDiagnosticMap.put(file,
							diagnostics = new ArrayList());
					}

					diagnostics.add(child);
				}
			}

			if (diagnostic.getSeverity() > Diagnostic.INFO) {

				for (Iterator entries = fileToDiagnosticMap.entrySet()
					.iterator(); entries.hasNext();) {

					Map.Entry entry = (Map.Entry) entries.next();
					IFile file = (IFile) entry.getKey();

					for (Iterator diagnostics = ((List) entry.getValue())
						.iterator(); diagnostics.hasNext();) {

						createMarkers(file, (Diagnostic) diagnostics.next());
					}
				}

				if (!diagnostic.getChildren().isEmpty()) {
					List data = ((Diagnostic) diagnostic.getChildren().get(0))
						.getData();

					if (!data.isEmpty()) {
						Object datum = data.get(0);

						if (datum instanceof EObject) {

							if (workbenchPart instanceof ISetSelectionTarget) {
								((ISetSelectionTarget) workbenchPart)
									.selectReveal(new StructuredSelection(datum));
							} else if (workbenchPart instanceof IViewerProvider) {
								Viewer viewer = ((IViewerProvider) workbenchPart)
									.getViewer();

								if (viewer != null) {
									viewer.setSelection(
										new StructuredSelection(datum), true);
								}
							}
						}
					}
				}
			}
		}
	}

	protected Resource getResource(Diagnostic diagnostic) {
		List data = diagnostic.getData();

		if (!data.isEmpty()) {
			Object datum = data.get(0);

			if (datum instanceof EObject) {
				return ((EObject) datum).eResource();
			}
		}

		return (Resource) editingDomain.getResourceSet().getResources().get(0);
	}

	protected void createMarkers(IFile file, Diagnostic diagnostic) {

		if (diagnostic.getSeverity() > Diagnostic.INFO) {
			eclipseResourcesUtil.createMarkers(file, diagnostic);
		}
	}

	protected IFile getFile(Diagnostic diagnostic) {
		Resource resource = getResource(diagnostic);

		if (resource != null) {
			IFile file = (IFile) resourceToFileMap.get(resource);

			if (file == null) {
				ResourceSet resourceSet = resource.getResourceSet();

				if (resourceSet != null) {
					URI uri = resourceSet.getURIConverter().normalize(
						resource.getURI());

					if (UML2Util.URI_SCHEME_PLATFORM.equals(uri.scheme())
						&& uri.segmentCount() > 1
						&& UML2Util.URI_SEGMENT_RESOURCE.equals(uri.segment(0))) {

						StringBuffer platformResourcePath = new StringBuffer();

						for (int i = 1, size = uri.segmentCount(); i < size; i++) {
							platformResourcePath.append('/');
							platformResourcePath.append(uri.segment(i));
						}

						resourceToFileMap.put(resource, file = ResourcesPlugin
							.getWorkspace().getRoot().getFile(
								new Path(platformResourcePath.toString())));
					}
				}
			}

			return file;
		}

		return null;
	}

}
