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
 * $Id: DiagnosticAction.java,v 1.3 2007/01/05 21:48:51 khussey Exp $
 */
package org.eclipse.uml2.uml.editor.actions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.ui.viewer.IViewerProvider;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.edit.ui.action.ValidateAction;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.part.ISetSelectionTarget;
import org.eclipse.uml2.uml.editor.UMLEditorPlugin;
import org.eclipse.uml2.uml.util.UMLUtil;

public class DiagnosticAction
		extends UMLCommandAction {

	protected ValidateAction.EclipseResourcesUtil eclipseResourcesUtil = Platform
		.getBundle("org.eclipse.core.resources") != null //$NON-NLS-1$
		? new ValidateAction.EclipseResourcesUtil() {

			@Override
			protected String getMarkerID() {
				return DiagnosticAction.this.getMarkerID();
			}
		}
		: null;

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

		@Override
		public String getFeatureText(EStructuralFeature eStructuralFeature) {
			return getLabelProvider().getText(eStructuralFeature);
		}

		@Override
		public String getClassText(EObject eObject) {
			return getLabelProvider().getText(eObject.eClass());
		}
	};

	protected DiagnosticAction() {
		super();
	}

	protected String getMarkerID() {
		return "org.eclipse.uml2.uml.editor.diagnostic"; //$NON-NLS-1$
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

		if (eclipseResourcesUtil != null) {
			Map<Resource, List<Diagnostic>> resourceToDiagnosticMap = new HashMap<Resource, List<Diagnostic>>();

			for (Diagnostic child : diagnostic.getChildren()) {
				Resource resource = getResource(child);

				if (resource != null) {
					List<Diagnostic> diagnostics = resourceToDiagnosticMap
						.get(resource);

					if (diagnostics == null) {
						eclipseResourcesUtil.deleteMarkers(resource);

						resourceToDiagnosticMap.put(resource,
							diagnostics = new ArrayList<Diagnostic>());
					}

					diagnostics.add(child);
				}
			}

			if (diagnostic.getSeverity() > Diagnostic.INFO) {

				for (Map.Entry<Resource, List<Diagnostic>> entry : resourceToDiagnosticMap
					.entrySet()) {

					Resource resource = entry.getKey();

					for (Diagnostic d : entry.getValue()) {
						eclipseResourcesUtil.createMarkers(resource, d);
					}
				}

				if (!diagnostic.getChildren().isEmpty()) {
					List<?> data = (diagnostic.getChildren().get(0)).getData();

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
		List<?> data = diagnostic.getData();

		if (!data.isEmpty()) {
			Object datum = data.get(0);

			if (datum instanceof EObject) {
				return ((EObject) datum).eResource();
			}
		}

		return editingDomain.getResourceSet().getResources().get(0);
	}

}
