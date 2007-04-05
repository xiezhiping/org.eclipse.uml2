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
 * $Id: OptionsDialog.java,v 1.3 2007/04/05 05:04:46 khussey Exp $
 */
package org.eclipse.uml2.uml.editor.dialogs;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.CCombo;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.uml2.uml.editor.UMLEditorPlugin;
import org.eclipse.uml2.uml.util.UMLUtil;

public class OptionsDialog
		extends MessageDialog {

	protected final Map<String, String> options;

	protected final Map<String, String> choiceLabels = new HashMap<String, String>();

	protected final String discardChoiceLabel;

	protected final String ignoreChoiceLabel;

	protected final String processChoiceLabel;

	protected final String reportChoiceLabel;

	public OptionsDialog(Shell parent, String title, String message,
			Map<String, String> options) {

		super(parent, title, null, message, QUESTION, new String[]{
			IDialogConstants.OK_LABEL, IDialogConstants.CANCEL_LABEL}, 0);

		this.options = options;

		choiceLabels.put(discardChoiceLabel = UMLEditorPlugin.INSTANCE
			.getString("_UI_Discard_label"), UMLUtil.OPTION__DISCARD); //$NON-NLS-1$
		choiceLabels.put(ignoreChoiceLabel = UMLEditorPlugin.INSTANCE
			.getString("_UI_Ignore_label"), UMLUtil.OPTION__IGNORE); //$NON-NLS-1$
		choiceLabels.put(processChoiceLabel = UMLEditorPlugin.INSTANCE
			.getString("_UI_Process_label"), UMLUtil.OPTION__PROCESS); //$NON-NLS-1$
		choiceLabels.put(reportChoiceLabel = UMLEditorPlugin.INSTANCE
			.getString("_UI_Report_label"), UMLUtil.OPTION__REPORT); //$NON-NLS-1$
	}

	protected void createOptionArea(Composite parent, String text,
			final String option, String[] choices, String initialChoice) {

		Label label = new Label(parent, SWT.LEFT);
		{
			label.setText(text);

			GridData data = new GridData();
			data.horizontalAlignment = GridData.FILL;
			label.setLayoutData(data);
		}

		final CCombo combo = new CCombo(parent, SWT.BORDER | SWT.READ_ONLY);
		{
			GridData data = new GridData();
			data.horizontalAlignment = GridData.FILL;
			data.grabExcessHorizontalSpace = true;
			combo.setLayoutData(data);

			combo.setItems(choices);

			combo.addModifyListener(new ModifyListener() {

				public void modifyText(ModifyEvent me) {
					options.put(option, choiceLabels.get(combo.getText()));
				}
			});

			combo.setText(initialChoice);
		}
	}

	protected void createOptionAreas(Composite parent) {
		// do nothing
	}

	@Override
	protected Control createCustomArea(Composite parent) {
		Composite composite = new Composite(parent, SWT.NONE);
		{
			GridLayout layout = new GridLayout();
			layout.numColumns = 2;
			composite.setLayout(layout);

			GridData data = new GridData();
			data.verticalAlignment = GridData.FILL;
			data.grabExcessVerticalSpace = true;
			data.horizontalAlignment = GridData.FILL;
			data.grabExcessHorizontalSpace = true;
			composite.setLayoutData(data);
		}

		createOptionAreas(composite);

		return composite;
	}
}
