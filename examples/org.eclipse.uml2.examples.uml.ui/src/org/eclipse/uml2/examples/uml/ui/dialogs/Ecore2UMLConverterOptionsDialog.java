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
 * $Id: Ecore2UMLConverterOptionsDialog.java,v 1.4 2007/01/04 18:47:13 khussey Exp $
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
	}
}
