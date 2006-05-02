/*
 * Copyright (c) 2005, 2006 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *
 * $Id: DiagnosticAction.java,v 1.6 2006/05/02 21:42:23 khussey Exp $
 */
package org.eclipse.uml2.examples.ui.actions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
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
import org.eclipse.uml2.examples.ui.ExamplesUIPlugin;
import org.eclipse.uml2.util.UML2Util;

/**
 * 
 */
public class DiagnosticAction
		extends UML2CommandAction {

	protected ValidateAction.EclipseResourcesUtil eclipseResourcesUtil = Platform
		.getBundle("org.eclipse.core.resources") != null //$NON-NLS-1$
		? new ValidateAction.EclipseResourcesUtil()
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

	protected final UML2Util.QualifiedTextProvider qualifiedTextProvider = new UML2Util.QualifiedTextProvider() {

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
					ExamplesUIPlugin.INSTANCE
						.getString("_UI_DiagnosticOK_message")); //$NON-NLS-1$
				break;
			case Diagnostic.INFO :
				ErrorDialog.openError(PlatformUI.getWorkbench()
					.getActiveWorkbenchWindow().getShell(), dialogTitle,
					ExamplesUIPlugin.INSTANCE
						.getString("_UI_DiagnosticOK_message"), BasicDiagnostic //$NON-NLS-1$
						.toIStatus(diagnostic));
				break;
			default :
				ErrorDialog.openError(PlatformUI.getWorkbench()
					.getActiveWorkbenchWindow().getShell(), dialogTitle,
					ExamplesUIPlugin.INSTANCE
						.getString("_UI_DiagnosticProblems_message"), //$NON-NLS-1$
					BasicDiagnostic.toIStatus(diagnostic));
		}

		if (null != eclipseResourcesUtil) {
			Map resourceToDiagnosticMap = new HashMap();

			for (Iterator children = diagnostic.getChildren().iterator(); children
				.hasNext();) {

				Diagnostic child = (Diagnostic) children.next();
				Resource resource = getResource(child);

				if (null != resource) {
					List diagnostics = (List) resourceToDiagnosticMap
						.get(resource);

					if (null == diagnostics) {
						eclipseResourcesUtil.deleteMarkers(resource);

						resourceToDiagnosticMap.put(resource,
							diagnostics = new ArrayList());
					}

					diagnostics.add(child);
				}
			}

			if (Diagnostic.INFO < diagnostic.getSeverity()) {

				for (Iterator entries = resourceToDiagnosticMap.entrySet()
					.iterator(); entries.hasNext();) {

					Map.Entry entry = (Map.Entry) entries.next();
					Resource resource = (Resource) entry.getKey();

					for (Iterator diagnostics = ((List) entry.getValue())
						.iterator(); diagnostics.hasNext();) {

						eclipseResourcesUtil.createMarkers(resource,
							(Diagnostic) diagnostics.next());
					}
				}

				if (!diagnostic.getChildren().isEmpty()) {
					List data = ((Diagnostic) diagnostic.getChildren().get(0))
						.getData();

					if (!data.isEmpty() && data.get(0) instanceof EObject) {

						if (workbenchPart instanceof ISetSelectionTarget) {
							((ISetSelectionTarget) workbenchPart)
								.selectReveal(new StructuredSelection(data
									.get(0)));
						} else if (workbenchPart instanceof IViewerProvider) {
							Viewer viewer = ((IViewerProvider) workbenchPart)
								.getViewer();

							if (null != viewer) {
								viewer.setSelection(new StructuredSelection(
									data.get(0)), true);
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

}