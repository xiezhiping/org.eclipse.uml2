/*
 * Copyright (c) 2005, 2014 IBM Corporation, CEA, and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *   Kenn Hussey (CEA) - 316165
 *   Christian W. Damus (CEA) - 420338
 *
 */
package org.eclipse.uml2.examples.uml.ui.dialogs;

import java.util.Map;

import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.uml2.examples.uml.ui.UMLExamplesUIPlugin;
import org.eclipse.uml2.uml.editor.dialogs.OptionsDialog;
import org.eclipse.uml2.uml.util.UMLUtil;

public class Ecore2UMLConverterOptionsDialog
		extends OptionsDialog {

	public Ecore2UMLConverterOptionsDialog(Shell parent, String title,
			String message, Map<String, String> options) {
		super(parent, title, message, options);
	}

	@Override
	protected void createOptionAreas(Composite parent) {
		super.createOptionAreas(parent);

		createOptionArea(parent,
			UMLExamplesUIPlugin.INSTANCE
				.getString("_UI_EcoreTaggedValues_label"), //$NON-NLS-1$
			UMLUtil.Ecore2UMLConverter.OPTION__ECORE_TAGGED_VALUES,
			new String[]{ignoreChoiceLabel, reportChoiceLabel,
				processChoiceLabel}, processChoiceLabel);

		createOptionArea(parent,
			UMLExamplesUIPlugin.INSTANCE
				.getString("_UI_RedefinesAnnotations_label"), //$NON-NLS-1$
			UMLUtil.Ecore2UMLConverter.OPTION__REDEFINES_ANNOTATIONS,
			new String[]{ignoreChoiceLabel, reportChoiceLabel,
				processChoiceLabel}, processChoiceLabel);

		createOptionArea(parent,
			UMLExamplesUIPlugin.INSTANCE
				.getString("_UI_SubsetsAnnotations_label"), //$NON-NLS-1$
			UMLUtil.Ecore2UMLConverter.OPTION__SUBSETS_ANNOTATIONS,
			new String[]{ignoreChoiceLabel, reportChoiceLabel,
				processChoiceLabel}, processChoiceLabel);

		createOptionArea(parent,
			UMLExamplesUIPlugin.INSTANCE
				.getString("_UI_UnionAnnotations_label"), //$NON-NLS-1$
			UMLUtil.Ecore2UMLConverter.OPTION__UNION_ANNOTATIONS, new String[]{
				ignoreChoiceLabel, reportChoiceLabel, processChoiceLabel},
			processChoiceLabel);

		createOptionArea(parent,
			UMLExamplesUIPlugin.INSTANCE
				.getString("_UI_AnnotationDetails_label"), //$NON-NLS-1$
			UMLUtil.Ecore2UMLConverter.OPTION__ANNOTATION_DETAILS,
			new String[]{ignoreChoiceLabel, reportChoiceLabel,
				processChoiceLabel}, ignoreChoiceLabel);

		createOptionArea(
			parent,
			UMLExamplesUIPlugin.INSTANCE.getString("_UI_BodyAnnotations_label"), //$NON-NLS-1$
			UMLUtil.Ecore2UMLConverter.OPTION__BODY_ANNOTATIONS, new String[]{
				ignoreChoiceLabel, reportChoiceLabel, processChoiceLabel},
			ignoreChoiceLabel);

		createOptionArea(parent,
			UMLExamplesUIPlugin.INSTANCE
				.getString("_UI_DocumentationAnnotations_label"), //$NON-NLS-1$
			UMLUtil.Ecore2UMLConverter.OPTION__DOCUMENTATION_ANNOTATIONS,
			new String[]{ignoreChoiceLabel, reportChoiceLabel,
				processChoiceLabel}, processChoiceLabel);
		
		createOptionArea(parent,
			UMLExamplesUIPlugin.INSTANCE.getString("_UI_XMIIdentifiers_label"), //$NON-NLS-1$
			UMLUtil.Ecore2UMLConverter.OPTION__XMI_IDENTIFIERS, new String[]{
				ignoreChoiceLabel, processChoiceLabel}, ignoreChoiceLabel);

		createOptionArea(
			parent,
			UMLExamplesUIPlugin.INSTANCE
				.getString("_UI_OppositeRoleNames_label"), //$NON-NLS-1$
			UMLUtil.Ecore2UMLConverter.OPTION__OPPOSITE_ROLE_NAMES,
			new String[]{ignoreChoiceLabel, processChoiceLabel},
			ignoreChoiceLabel);
	}
}
