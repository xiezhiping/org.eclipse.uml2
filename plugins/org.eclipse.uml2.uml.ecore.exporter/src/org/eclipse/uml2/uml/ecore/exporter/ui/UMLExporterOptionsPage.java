/*
 * Copyright (c) 2006 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *
 * $Id: UMLExporterOptionsPage.java,v 1.1 2006/04/06 04:21:53 khussey Exp $
 */
package org.eclipse.uml2.uml.ecore.exporter.ui;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.eclipse.emf.exporter.ModelExporter;
import org.eclipse.emf.exporter.ui.contribution.base.ModelExporterOptionsPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.CCombo;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.uml2.uml.ecore.exporter.UMLExporter;
import org.eclipse.uml2.uml.ecore.exporter.UMLExporterPlugin;
import org.eclipse.uml2.uml.util.UMLUtil;

public class UMLExporterOptionsPage
		extends ModelExporterOptionsPage {

	protected final Map choiceLabels = new HashMap();

	protected final String discardChoiceLabel;

	protected final String ignoreChoiceLabel;

	protected final String processChoiceLabel;

	protected final String reportChoiceLabel;

	public UMLExporterOptionsPage(ModelExporter modelExporter, String pageName) {
		super(modelExporter, pageName);

		choiceLabels.put(discardChoiceLabel = UMLExporterPlugin.INSTANCE
			.getString("_UI_Discard_label"), UMLUtil.OPTION__DISCARD); //$NON-NLS-1$
		choiceLabels.put(ignoreChoiceLabel = UMLExporterPlugin.INSTANCE
			.getString("_UI_Ignore_label"), UMLUtil.OPTION__IGNORE); //$NON-NLS-1$
		choiceLabels.put(processChoiceLabel = UMLExporterPlugin.INSTANCE
			.getString("_UI_Process_label"), UMLUtil.OPTION__PROCESS); //$NON-NLS-1$
		choiceLabels.put(reportChoiceLabel = UMLExporterPlugin.INSTANCE
			.getString("_UI_Report_label"), UMLUtil.OPTION__REPORT); //$NON-NLS-1$
	}

	protected UMLExporter getUMLExporter() {
		return (UMLExporter) getModelExporter();
	}

	protected void addOptionControl(Composite parent, String text,
			final String option, String[] choices, String initialChoice) {

		Label label = new Label(parent, SWT.LEFT);
		{
			GridData data = new GridData();
			data.horizontalAlignment = GridData.FILL;
			label.setLayoutData(data);

			label.setText(text);
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
					getUMLExporter().getOptions().put(option,
						choiceLabels.get(combo.getText()));
				}
			});

			String choice = (String) getUMLExporter().getOptions().get(option);

			for (Iterator entries = choiceLabels.entrySet().iterator(); entries
				.hasNext();) {

				Map.Entry entry = (Map.Entry) entries.next();

				if (entry.getValue().equals(choice)) {
					initialChoice = (String) entry.getKey();
					break;
				}
			}

			combo.setText(initialChoice);
		}
	}

	protected void addOptionButton(final Group group, Composite parent,
			String text, final String choiceLabel) {
		Button button = new Button(parent, SWT.PUSH);
		button.setText(text);
		button.addSelectionListener(new SelectionAdapter() {

			public void widgetSelected(SelectionEvent se) {
				Control[] children = group.getChildren();
				for (int i = 0; i < children.length; i++) {
					if (children[i] instanceof CCombo) {
						((CCombo) children[i]).setText(choiceLabel);
					}
				}
			}
		});
	}

	protected void addOptionControl(Composite parent) {

		final Group group = new Group(parent, SWT.SHADOW_ETCHED_IN);
		{
			GridLayout layout = new GridLayout();
			layout.numColumns = 2;
			group.setLayout(layout);

			GridData data = new GridData(GridData.FILL_BOTH);
			data.horizontalSpan = 2;
			group.setLayoutData(data);

			group.setText(UMLExporterPlugin.INSTANCE
				.getString("_UI_Options_label")); //$NON-NLS-1$
		}

		addOptionControl(
			group,
			UMLExporterPlugin.INSTANCE.getString("_UI_EcoreTaggedValues_label"), //$NON-NLS-1$
			UMLUtil.Ecore2UMLConverter.OPTION__ECORE_TAGGED_VALUES,
			new String[]{ignoreChoiceLabel, reportChoiceLabel,
				processChoiceLabel}, processChoiceLabel);
		addOptionControl(group,
			UMLExporterPlugin.INSTANCE
				.getString("_UI_RedefinesAnnotations_label"), //$NON-NLS-1$
			UMLUtil.Ecore2UMLConverter.OPTION__REDEFINES_ANNOTATIONS,
			new String[]{ignoreChoiceLabel, reportChoiceLabel,
				processChoiceLabel}, processChoiceLabel);
		addOptionControl(group,
			UMLExporterPlugin.INSTANCE
				.getString("_UI_SubsetsAnnotations_label"), //$NON-NLS-1$
			UMLUtil.Ecore2UMLConverter.OPTION__SUBSETS_ANNOTATIONS,
			new String[]{ignoreChoiceLabel, reportChoiceLabel,
				processChoiceLabel}, processChoiceLabel);
		addOptionControl(group,
			UMLExporterPlugin.INSTANCE.getString("_UI_UnionAnnotations_label"), //$NON-NLS-1$
			UMLUtil.Ecore2UMLConverter.OPTION__UNION_ANNOTATIONS, new String[]{
				ignoreChoiceLabel, reportChoiceLabel, processChoiceLabel},
			processChoiceLabel);
		addOptionControl(
			group,
			UMLExporterPlugin.INSTANCE.getString("_UI_AnnotationDetails_label"), //$NON-NLS-1$
			UMLUtil.UML2EcoreConverter.OPTION__ANNOTATION_DETAILS,
			new String[]{ignoreChoiceLabel, reportChoiceLabel,
				processChoiceLabel}, ignoreChoiceLabel);

		Composite composite = new Composite(group, SWT.NONE);
		{
			composite.setLayout(new RowLayout());

			GridData data = new GridData();
			data.horizontalAlignment = GridData.END;
			data.horizontalSpan = 2;
			composite.setLayoutData(data);
		}

		addOptionButton(group, composite, UMLExporterPlugin.INSTANCE
			.getString("_UI_IgnoreAll_label"), ignoreChoiceLabel); //$NON-NLS-1$

		addOptionButton(group, composite, UMLExporterPlugin.INSTANCE
			.getString("_UI_ProcessAll_label"), processChoiceLabel); //$NON-NLS-1$
	}

	protected void createSaveSettingsControl(Composite parent) {
		super.createSaveSettingsControl(parent);

		addOptionControl(parent);
	}

}
