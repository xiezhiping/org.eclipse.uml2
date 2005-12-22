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
 * $Id: UML2EcoreConverterOptionsDialog.java,v 1.1 2005/12/22 20:19:56 khussey Exp $
 */
package org.eclipse.uml2.examples.ui.uml.dialogs;

import java.util.Map;

import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.uml2.uml.editor.dialogs.OptionsDialog;
import org.eclipse.uml2.uml.util.UMLUtil;

public class UML2EcoreConverterOptionsDialog
		extends OptionsDialog {

	public UML2EcoreConverterOptionsDialog(Shell parent, String title,
			String message, Map options) {
		super(parent, title, message, options);
	}

	protected void createOptionAreas(Composite parent) {
		super.createOptionAreas(parent);

		createOptionArea(parent,
			UMLUtil.UML2EcoreConverter.OPTION__ECORE_TAGGED_VALUES,
			UMLUtil.UML2EcoreConverter.OPTION__ECORE_TAGGED_VALUES,
			new String[]{ignoreChoiceLabel, reportChoiceLabel,
				processChoiceLabel}, processChoiceLabel);

		createOptionArea(parent,
			UMLUtil.UML2EcoreConverter.OPTION__DERIVED_FEATURES,
			UMLUtil.UML2EcoreConverter.OPTION__DERIVED_FEATURES, new String[]{
				ignoreChoiceLabel, reportChoiceLabel,
				processChoiceLabel}, processChoiceLabel);

		createOptionArea(parent,
			UMLUtil.UML2EcoreConverter.OPTION__DUPLICATE_FEATURE_INHERITANCE,
			UMLUtil.UML2EcoreConverter.OPTION__DUPLICATE_FEATURE_INHERITANCE,
			new String[]{ignoreChoiceLabel, reportChoiceLabel,
				discardChoiceLabel, processChoiceLabel},
			processChoiceLabel);

		createOptionArea(parent,
			UMLUtil.UML2EcoreConverter.OPTION__DUPLICATE_FEATURES,
			UMLUtil.UML2EcoreConverter.OPTION__DUPLICATE_FEATURES,
			new String[]{ignoreChoiceLabel, reportChoiceLabel,
				discardChoiceLabel, processChoiceLabel},
			processChoiceLabel);

		createOptionArea(parent,
			UMLUtil.UML2EcoreConverter.OPTION__DUPLICATE_OPERATION_INHERITANCE,
			UMLUtil.UML2EcoreConverter.OPTION__DUPLICATE_OPERATION_INHERITANCE,
			new String[]{ignoreChoiceLabel, reportChoiceLabel,
				discardChoiceLabel, processChoiceLabel},
			processChoiceLabel);

		createOptionArea(parent,
			UMLUtil.UML2EcoreConverter.OPTION__DUPLICATE_OPERATIONS,
			UMLUtil.UML2EcoreConverter.OPTION__DUPLICATE_OPERATIONS,
			new String[]{ignoreChoiceLabel, reportChoiceLabel,
				discardChoiceLabel, processChoiceLabel},
			processChoiceLabel);

		createOptionArea(parent,
			UMLUtil.UML2EcoreConverter.OPTION__REDEFINING_OPERATIONS,
			UMLUtil.UML2EcoreConverter.OPTION__REDEFINING_OPERATIONS,
			new String[]{ignoreChoiceLabel, reportChoiceLabel,
				processChoiceLabel}, processChoiceLabel);

		createOptionArea(parent,
			UMLUtil.UML2EcoreConverter.OPTION__REDEFINING_PROPERTIES,
			UMLUtil.UML2EcoreConverter.OPTION__REDEFINING_PROPERTIES,
			new String[]{ignoreChoiceLabel, reportChoiceLabel,
				processChoiceLabel}, processChoiceLabel);

		createOptionArea(parent,
			UMLUtil.UML2EcoreConverter.OPTION__SUBSETTING_PROPERTIES,
			UMLUtil.UML2EcoreConverter.OPTION__SUBSETTING_PROPERTIES,
			new String[]{ignoreChoiceLabel, reportChoiceLabel,
				processChoiceLabel}, processChoiceLabel);

		createOptionArea(parent,
			UMLUtil.UML2EcoreConverter.OPTION__UNION_PROPERTIES,
			UMLUtil.UML2EcoreConverter.OPTION__UNION_PROPERTIES, new String[]{
				ignoreChoiceLabel, reportChoiceLabel,
				processChoiceLabel}, processChoiceLabel);

		createOptionArea(parent,
			UMLUtil.UML2EcoreConverter.OPTION__SUPER_CLASS_ORDER,
			UMLUtil.UML2EcoreConverter.OPTION__SUPER_CLASS_ORDER, new String[]{
				ignoreChoiceLabel, reportChoiceLabel,
				processChoiceLabel}, processChoiceLabel);

		createOptionArea(parent,
			UMLUtil.UML2EcoreConverter.OPTION__ANNOTATION_DETAILS,
			UMLUtil.UML2EcoreConverter.OPTION__ANNOTATION_DETAILS,
			new String[]{ignoreChoiceLabel, reportChoiceLabel,
				processChoiceLabel}, processChoiceLabel);
	}

}
