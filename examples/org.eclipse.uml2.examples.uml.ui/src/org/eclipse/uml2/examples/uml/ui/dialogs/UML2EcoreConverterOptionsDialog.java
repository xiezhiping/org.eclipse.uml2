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
 * $Id: UML2EcoreConverterOptionsDialog.java,v 1.5 2007/04/04 22:16:25 khussey Exp $
 */
package org.eclipse.uml2.examples.uml.ui.dialogs;

import java.util.Map;

import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.uml2.examples.uml.ui.UMLExamplesUIPlugin;
import org.eclipse.uml2.uml.editor.dialogs.OptionsDialog;
import org.eclipse.uml2.uml.util.UMLUtil;

public class UML2EcoreConverterOptionsDialog
		extends OptionsDialog {

	public UML2EcoreConverterOptionsDialog(Shell parent, String title,
			String message, Map<String, String> options) {
		super(parent, title, message, options);
	}

	@Override
	protected void createOptionAreas(Composite parent) {
		super.createOptionAreas(parent);

		createOptionArea(parent,
			UMLExamplesUIPlugin.INSTANCE
				.getString("_UI_EcoreTaggedValues_label"), //$NON-NLS-1$
			UMLUtil.UML2EcoreConverter.OPTION__ECORE_TAGGED_VALUES,
			new String[]{ignoreChoiceLabel, reportChoiceLabel,
				processChoiceLabel}, processChoiceLabel);

		createOptionArea(
			parent,
			UMLExamplesUIPlugin.INSTANCE.getString("_UI_DerivedFeatures_label"), //$NON-NLS-1$
			UMLUtil.UML2EcoreConverter.OPTION__DERIVED_FEATURES, new String[]{
				ignoreChoiceLabel, reportChoiceLabel, processChoiceLabel},
			processChoiceLabel);

		createOptionArea(parent,
			UMLExamplesUIPlugin.INSTANCE
				.getString("_UI_DuplicateFeatureInheritance_label"), //$NON-NLS-1$
			UMLUtil.UML2EcoreConverter.OPTION__DUPLICATE_FEATURE_INHERITANCE,
			new String[]{ignoreChoiceLabel, reportChoiceLabel,
				discardChoiceLabel, processChoiceLabel}, processChoiceLabel);

		createOptionArea(parent,
			UMLExamplesUIPlugin.INSTANCE
				.getString("_UI_DuplicateFeatures_label"), //$NON-NLS-1$
			UMLUtil.UML2EcoreConverter.OPTION__DUPLICATE_FEATURES,
			new String[]{ignoreChoiceLabel, reportChoiceLabel,
				discardChoiceLabel, processChoiceLabel}, processChoiceLabel);

		createOptionArea(parent,
			UMLExamplesUIPlugin.INSTANCE
				.getString("_UI_DuplicateOperationInheritance_label"), //$NON-NLS-1$
			UMLUtil.UML2EcoreConverter.OPTION__DUPLICATE_OPERATION_INHERITANCE,
			new String[]{ignoreChoiceLabel, reportChoiceLabel,
				discardChoiceLabel, processChoiceLabel}, processChoiceLabel);

		createOptionArea(parent,
			UMLExamplesUIPlugin.INSTANCE
				.getString("_UI_DuplicateOperations_label"), //$NON-NLS-1$
			UMLUtil.UML2EcoreConverter.OPTION__DUPLICATE_OPERATIONS,
			new String[]{ignoreChoiceLabel, reportChoiceLabel,
				discardChoiceLabel, processChoiceLabel}, processChoiceLabel);

		createOptionArea(parent,
			UMLExamplesUIPlugin.INSTANCE
				.getString("_UI_RedefiningOperations_label"), //$NON-NLS-1$
			UMLUtil.UML2EcoreConverter.OPTION__REDEFINING_OPERATIONS,
			new String[]{ignoreChoiceLabel, reportChoiceLabel,
				processChoiceLabel}, processChoiceLabel);

		createOptionArea(parent,
			UMLExamplesUIPlugin.INSTANCE
				.getString("_UI_RedefiningProperties_label"), //$NON-NLS-1$
			UMLUtil.UML2EcoreConverter.OPTION__REDEFINING_PROPERTIES,
			new String[]{ignoreChoiceLabel, reportChoiceLabel,
				processChoiceLabel}, processChoiceLabel);

		createOptionArea(parent,
			UMLExamplesUIPlugin.INSTANCE
				.getString("_UI_SubsettingProperties_label"), //$NON-NLS-1$
			UMLUtil.UML2EcoreConverter.OPTION__SUBSETTING_PROPERTIES,
			new String[]{ignoreChoiceLabel, reportChoiceLabel,
				processChoiceLabel}, processChoiceLabel);

		createOptionArea(
			parent,
			UMLExamplesUIPlugin.INSTANCE.getString("_UI_UnionProperties_label"), //$NON-NLS-1$
			UMLUtil.UML2EcoreConverter.OPTION__UNION_PROPERTIES, new String[]{
				ignoreChoiceLabel, reportChoiceLabel, processChoiceLabel},
			processChoiceLabel);

		createOptionArea(
			parent,
			UMLExamplesUIPlugin.INSTANCE.getString("_UI_SuperClassOrder_label"), //$NON-NLS-1$
			UMLUtil.UML2EcoreConverter.OPTION__SUPER_CLASS_ORDER, new String[]{
				ignoreChoiceLabel, reportChoiceLabel, processChoiceLabel},
			processChoiceLabel);

		createOptionArea(parent,
			UMLExamplesUIPlugin.INSTANCE
				.getString("_UI_AnnotationDetails_label"), //$NON-NLS-1$
			UMLUtil.UML2EcoreConverter.OPTION__ANNOTATION_DETAILS,
			new String[]{ignoreChoiceLabel, reportChoiceLabel,
				processChoiceLabel}, processChoiceLabel);

		createOptionArea(parent,
			UMLExamplesUIPlugin.INSTANCE
				.getString("_UI_InvariantConstraints_label"), //$NON-NLS-1$
			UMLUtil.UML2EcoreConverter.OPTION__INVARIANT_CONSTRAINTS,
			new String[]{ignoreChoiceLabel, reportChoiceLabel,
				processChoiceLabel}, processChoiceLabel);

		createOptionArea(parent,
			UMLExamplesUIPlugin.INSTANCE
				.getString("_UI_OperationBodies_label"), //$NON-NLS-1$
			UMLUtil.UML2EcoreConverter.OPTION__OPERATION_BODIES,
			new String[]{ignoreChoiceLabel, reportChoiceLabel,
				processChoiceLabel}, processChoiceLabel);
	}

}
