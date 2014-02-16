/*
 * Copyright (c) 2013, 2014 CEA and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Christian W. Damus (CEA) - initial API and implementation
 *   Christian W. Damus (CEA) - 180744
 *
 */
package org.eclipse.uml2.uml.editor.dialogs;

import java.util.Map;

import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.uml2.uml.editor.UMLEditorPlugin;
import org.eclipse.uml2.uml.util.UMLUtil;

/**
 * Options dialog for template expansion.
 * 
 * @since 5.0
 */
public class TemplateExpanderOptionsDialog
		extends OptionsDialog {

	public TemplateExpanderOptionsDialog(Shell parent, String title,
			String message, Map<String, String> options) {

		super(parent, title, message, options);
	}

	@Override
	protected void createOptionAreas(Composite parent) {
		super.createOptionAreas(parent);

		createOptionArea(
			parent,
			UMLEditorPlugin.INSTANCE
				.getString("_UI_MissingParameterSubstitutions_label"), //$NON-NLS-1$
			UMLUtil.TemplateExpander.OPTION__MISSING_PARAMETER_SUBSTITUTIONS,
			new String[]{ignoreChoiceLabel, reportChoiceLabel},
			reportChoiceLabel);

		createOptionArea(
			parent,
			UMLEditorPlugin.INSTANCE
				.getString("_UI_RedundantGeneralizations_label"), //$NON-NLS-1$
			UMLUtil.PackageMerger.OPTION__REDUNDANT_GENERALIZATIONS,
			new String[]{ignoreChoiceLabel, reportChoiceLabel,
				discardChoiceLabel}, discardChoiceLabel);

		createOptionArea(
			parent,
			UMLEditorPlugin.INSTANCE.getString("_UI_Capabilities_label"), //$NON-NLS-1$
			UMLUtil.PackageMerger.OPTION__CAPABILITIES, new String[]{
				ignoreChoiceLabel, reportChoiceLabel, processChoiceLabel},
			processChoiceLabel);
	}

}
