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
 * $Id: PackageMergerOptionsDialog.java,v 1.2 2007/01/05 21:48:51 khussey Exp $
 */
package org.eclipse.uml2.uml.editor.dialogs;

import java.util.Map;

import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.uml2.uml.editor.UMLEditorPlugin;
import org.eclipse.uml2.uml.util.UMLUtil;

public class PackageMergerOptionsDialog
		extends OptionsDialog {

	public PackageMergerOptionsDialog(Shell parent, String title,
			String message, Map<String, String> options) {
		super(parent, title, message, options);
	}

	@Override
	protected void createOptionAreas(Composite parent) {
		super.createOptionAreas(parent);

		createOptionArea(
			parent,
			UMLEditorPlugin.INSTANCE
				.getString("_UI_DifferentPropertyStaticity_label"), //$NON-NLS-1$
			UMLUtil.PackageMerger.OPTION__DIFFERENT_PROPERTY_STATICITY,
			new String[]{ignoreChoiceLabel, reportChoiceLabel},
			reportChoiceLabel);

		createOptionArea(
			parent,
			UMLEditorPlugin.INSTANCE
				.getString("_UI_DifferentPropertyUniqueness_label"), //$NON-NLS-1$
			UMLUtil.PackageMerger.OPTION__DIFFERENT_PROPERTY_UNIQUENESS,
			new String[]{ignoreChoiceLabel, reportChoiceLabel},
			reportChoiceLabel);

		createOptionArea(parent,
			UMLEditorPlugin.INSTANCE.getString("_UI_EmptyUnions_label"), //$NON-NLS-1$
			UMLUtil.PackageMerger.OPTION__EMPTY_UNIONS, new String[]{
				ignoreChoiceLabel, reportChoiceLabel, processChoiceLabel},
			processChoiceLabel);

		createOptionArea(parent,
			UMLEditorPlugin.INSTANCE
				.getString("_UI_ImplicitRedefinitions_label"), //$NON-NLS-1$
			UMLUtil.PackageMerger.OPTION__IMPLICIT_REDEFINITIONS, new String[]{
				ignoreChoiceLabel, reportChoiceLabel, processChoiceLabel},
			processChoiceLabel);

		createOptionArea(parent, UMLEditorPlugin.INSTANCE
			.getString("_UI_InvalidRedefinitions_label"), //$NON-NLS-1$
			UMLUtil.PackageMerger.OPTION__INVALID_REDEFINITIONS, new String[]{
				ignoreChoiceLabel, reportChoiceLabel, discardChoiceLabel,
				processChoiceLabel}, processChoiceLabel);

		createOptionArea(parent, UMLEditorPlugin.INSTANCE
			.getString("_UI_InvalidSubsets_label"), //$NON-NLS-1$
			UMLUtil.PackageMerger.OPTION__INVALID_SUBSETS, new String[]{
				ignoreChoiceLabel, reportChoiceLabel, discardChoiceLabel,
				processChoiceLabel}, processChoiceLabel);

		createOptionArea(parent,
			UMLEditorPlugin.INSTANCE
				.getString("_UI_AssociationSpecializations_label"), //$NON-NLS-1$
			UMLUtil.PackageMerger.OPTION__ASSOCIATION_SPECIALIZATIONS,
			new String[]{ignoreChoiceLabel, reportChoiceLabel,
				processChoiceLabel}, processChoiceLabel);

		createOptionArea(parent,
			UMLEditorPlugin.INSTANCE
				.getString("_UI_RedundantGeneralizations_label"), //$NON-NLS-1$
			UMLUtil.PackageMerger.OPTION__REDUNDANT_GENERALIZATIONS,
			new String[]{ignoreChoiceLabel, reportChoiceLabel,
				discardChoiceLabel}, discardChoiceLabel);

		createOptionArea(parent,
			UMLEditorPlugin.INSTANCE.getString("_UI_Capabilities_label"), //$NON-NLS-1$
			UMLUtil.PackageMerger.OPTION__CAPABILITIES, new String[]{
				ignoreChoiceLabel, reportChoiceLabel, processChoiceLabel},
			processChoiceLabel);
	}

}
