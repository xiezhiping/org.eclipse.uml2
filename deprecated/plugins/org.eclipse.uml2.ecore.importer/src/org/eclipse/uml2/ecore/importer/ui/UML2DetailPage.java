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
 * $Id: UML2DetailPage.java,v 1.8 2005/12/14 17:02:49 khussey Exp $
 */
package org.eclipse.uml2.ecore.importer.ui;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.importer.ModelImporter;
import org.eclipse.emf.importer.ui.contribution.base.ModelImporterDetailPage;
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
import org.eclipse.uml2.ecore.importer.UML2Importer;
import org.eclipse.uml2.ecore.importer.UML2ImporterPlugin;
import org.eclipse.uml2.util.UML2Resource;
import org.eclipse.uml2.util.UML2Util;

public class UML2DetailPage
		extends ModelImporterDetailPage {

	protected final Map choiceLabels = new HashMap();

	protected final String discardChoiceLabel;

	protected final String ignoreChoiceLabel;

	protected final String processChoiceLabel;

	protected final String reportChoiceLabel;

	public UML2DetailPage(ModelImporter modelImporter, String pageName) {
		super(modelImporter, pageName);

		setTitle(UML2ImporterPlugin.INSTANCE.getString("_UI_UML2Import_title")); //$NON-NLS-1$
		setDescription(UML2ImporterPlugin.INSTANCE.getString(showGenModel()
			? "_UI_UML2ImportNewProject_description" //$NON-NLS-1$
			: "_UI_UML2ImportFile_description")); //$NON-NLS-1$

		choiceLabels.put(discardChoiceLabel = UML2ImporterPlugin.INSTANCE
			.getString("_UI_Discard_label"), UML2Util.OPTION__DISCARD); //$NON-NLS-1$
		choiceLabels.put(ignoreChoiceLabel = UML2ImporterPlugin.INSTANCE
			.getString("_UI_Ignore_label"), UML2Util.OPTION__IGNORE); //$NON-NLS-1$
		choiceLabels.put(processChoiceLabel = UML2ImporterPlugin.INSTANCE
			.getString("_UI_Process_label"), UML2Util.OPTION__PROCESS); //$NON-NLS-1$
		choiceLabels.put(reportChoiceLabel = UML2ImporterPlugin.INSTANCE
			.getString("_UI_Report_label"), UML2Util.OPTION__REPORT); //$NON-NLS-1$
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
					getUML2Importer().getOptions().put(option,
						choiceLabels.get(combo.getText()));
				}
			});

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

	protected void addDetailControl(Composite parent) {

		final Group group = new Group(parent, SWT.SHADOW_ETCHED_IN);
		{
			GridLayout layout = new GridLayout();
			layout.numColumns = 2;
			group.setLayout(layout);

			GridData data = new GridData(GridData.FILL_BOTH);
			data.horizontalSpan = 2;
			group.setLayoutData(data);

			group.setText(UML2ImporterPlugin.INSTANCE
				.getString("_UI_Options_label")); //$NON-NLS-1$
		}

		addOptionControl(group,
			UML2ImporterPlugin.INSTANCE
				.getString("_UI_EcoreTaggedValues_label"), //$NON-NLS-1$
			UML2Util.UML22EcoreConverter.OPTION__ECORE_TAGGED_VALUES,
			new String[]{ignoreChoiceLabel, reportChoiceLabel,
				processChoiceLabel}, processChoiceLabel);
		addOptionControl(group,
			UML2ImporterPlugin.INSTANCE.getString("_UI_DerivedFeatures_label"), //$NON-NLS-1$
			UML2Util.UML22EcoreConverter.OPTION__DERIVED_FEATURES,
			new String[]{ignoreChoiceLabel, reportChoiceLabel,
				processChoiceLabel}, processChoiceLabel);
		addOptionControl(group,
			UML2ImporterPlugin.INSTANCE
				.getString("_UI_DuplicateFeatureInheritance_label"), //$NON-NLS-1$
			UML2Util.UML22EcoreConverter.OPTION__DUPLICATE_FEATURE_INHERITANCE,
			new String[]{ignoreChoiceLabel, reportChoiceLabel,
				discardChoiceLabel, processChoiceLabel}, discardChoiceLabel);
		addOptionControl(group,
			UML2ImporterPlugin.INSTANCE
				.getString("_UI_DuplicateFeatures_label"), //$NON-NLS-1$
			UML2Util.UML22EcoreConverter.OPTION__DUPLICATE_FEATURES,
			new String[]{ignoreChoiceLabel, reportChoiceLabel,
				discardChoiceLabel, processChoiceLabel}, discardChoiceLabel);
		addOptionControl(
			group,
			UML2ImporterPlugin.INSTANCE
				.getString("_UI_DuplicateOperationInheritance_label"), //$NON-NLS-1$
			UML2Util.UML22EcoreConverter.OPTION__DUPLICATE_OPERATION_INHERITANCE,
			new String[]{ignoreChoiceLabel, reportChoiceLabel,
				discardChoiceLabel, processChoiceLabel}, discardChoiceLabel);
		addOptionControl(group,
			UML2ImporterPlugin.INSTANCE
				.getString("_UI_DuplicateOperations_label"), //$NON-NLS-1$
			UML2Util.UML22EcoreConverter.OPTION__DUPLICATE_OPERATIONS,
			new String[]{ignoreChoiceLabel, reportChoiceLabel,
				discardChoiceLabel, processChoiceLabel}, discardChoiceLabel);
		addOptionControl(group,
			UML2ImporterPlugin.INSTANCE
				.getString("_UI_RedefiningOperations_label"), //$NON-NLS-1$
			UML2Util.UML22EcoreConverter.OPTION__REDEFINING_OPERATIONS,
			new String[]{ignoreChoiceLabel, reportChoiceLabel,
				processChoiceLabel}, reportChoiceLabel);
		addOptionControl(group,
			UML2ImporterPlugin.INSTANCE
				.getString("_UI_RedefiningProperties_label"), //$NON-NLS-1$
			UML2Util.UML22EcoreConverter.OPTION__REDEFINING_PROPERTIES,
			new String[]{ignoreChoiceLabel, reportChoiceLabel,
				processChoiceLabel}, reportChoiceLabel);
		addOptionControl(group,
			UML2ImporterPlugin.INSTANCE
				.getString("_UI_SubsettingProperties_label"), //$NON-NLS-1$
			UML2Util.UML22EcoreConverter.OPTION__SUBSETTING_PROPERTIES,
			new String[]{ignoreChoiceLabel, reportChoiceLabel,
				processChoiceLabel}, reportChoiceLabel);
		addOptionControl(group,
			UML2ImporterPlugin.INSTANCE.getString("_UI_UnionProperties_label"), //$NON-NLS-1$
			UML2Util.UML22EcoreConverter.OPTION__UNION_PROPERTIES,
			new String[]{ignoreChoiceLabel, reportChoiceLabel,
				processChoiceLabel}, reportChoiceLabel);
		addOptionControl(group,
			UML2ImporterPlugin.INSTANCE.getString("_UI_SuperClassOrder_label"), //$NON-NLS-1$
			UML2Util.UML22EcoreConverter.OPTION__SUPER_CLASS_ORDER,
			new String[]{ignoreChoiceLabel, reportChoiceLabel,
				processChoiceLabel}, processChoiceLabel);

		Composite composite = new Composite(group, SWT.NONE);
		{
			composite.setLayout(new RowLayout());

			GridData data = new GridData();
			data.horizontalAlignment = GridData.END;
			data.horizontalSpan = 2;
			composite.setLayoutData(data);
		}

		addOptionButton(group, composite, UML2ImporterPlugin.INSTANCE
			.getString("_UI_IgnoreAll_label"), ignoreChoiceLabel); //$NON-NLS-1$

		addOptionButton(group, composite, UML2ImporterPlugin.INSTANCE
			.getString("_UI_ProcessAll_label"), processChoiceLabel); //$NON-NLS-1$
	}

	protected UML2Importer getUML2Importer() {
		return (UML2Importer) getModelImporter();
	}

	protected String[] getFilterExtensions() {
		return new String[]{"*." + UML2Resource.FILE_EXTENSION}; //$NON-NLS-1$
	}
}