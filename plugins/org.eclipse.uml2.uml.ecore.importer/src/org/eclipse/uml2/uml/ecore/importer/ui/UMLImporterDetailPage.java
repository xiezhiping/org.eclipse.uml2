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
 * $Id: UMLImporterDetailPage.java,v 1.1 2006/02/09 01:25:22 khussey Exp $
 */
package org.eclipse.uml2.uml.ecore.importer.ui;

import java.util.HashMap;
import java.util.Iterator;
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
import org.eclipse.uml2.uml.ecore.importer.UMLImporter;
import org.eclipse.uml2.uml.ecore.importer.UMLImporterPlugin;
import org.eclipse.uml2.uml.resource.UMLResource;
import org.eclipse.uml2.uml.util.UMLUtil;

public class UMLImporterDetailPage
		extends ModelImporterDetailPage {

	protected final Map choiceLabels = new HashMap();

	protected final String discardChoiceLabel;

	protected final String ignoreChoiceLabel;

	protected final String processChoiceLabel;

	protected final String reportChoiceLabel;

	public UMLImporterDetailPage(ModelImporter modelImporter, String pageName) {
		super(modelImporter, pageName);

		setTitle(UMLImporterPlugin.INSTANCE.getString("_UI_UMLImport_title")); //$NON-NLS-1$
		setDescription(UMLImporterPlugin.INSTANCE.getString(showGenModel()
			? "_UI_UMLImportNewProject_description" //$NON-NLS-1$
			: "_UI_UMLImportFile_description")); //$NON-NLS-1$

		choiceLabels.put(discardChoiceLabel = UMLImporterPlugin.INSTANCE
			.getString("_UI_Discard_label"), UMLUtil.OPTION__DISCARD); //$NON-NLS-1$
		choiceLabels.put(ignoreChoiceLabel = UMLImporterPlugin.INSTANCE
			.getString("_UI_Ignore_label"), UMLUtil.OPTION__IGNORE); //$NON-NLS-1$
		choiceLabels.put(processChoiceLabel = UMLImporterPlugin.INSTANCE
			.getString("_UI_Process_label"), UMLUtil.OPTION__PROCESS); //$NON-NLS-1$
		choiceLabels.put(reportChoiceLabel = UMLImporterPlugin.INSTANCE
			.getString("_UI_Report_label"), UMLUtil.OPTION__REPORT); //$NON-NLS-1$
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
					getUMLImporter().getOptions().put(option,
						choiceLabels.get(combo.getText()));
				}
			});

			String choice = (String) getUMLImporter().getOptions().get(option);

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

	protected void addDetailControl(Composite parent) {

		final Group group = new Group(parent, SWT.SHADOW_ETCHED_IN);
		{
			GridLayout layout = new GridLayout();
			layout.numColumns = 2;
			group.setLayout(layout);

			GridData data = new GridData(GridData.FILL_BOTH);
			data.horizontalSpan = 2;
			group.setLayoutData(data);

			group.setText(UMLImporterPlugin.INSTANCE
				.getString("_UI_Options_label")); //$NON-NLS-1$
		}

		addOptionControl(
			group,
			UMLImporterPlugin.INSTANCE.getString("_UI_EcoreTaggedValues_label"), //$NON-NLS-1$
			UMLUtil.UML2EcoreConverter.OPTION__ECORE_TAGGED_VALUES,
			new String[]{ignoreChoiceLabel, reportChoiceLabel,
				processChoiceLabel}, processChoiceLabel);
		addOptionControl(group,
			UMLImporterPlugin.INSTANCE.getString("_UI_DerivedFeatures_label"), //$NON-NLS-1$
			UMLUtil.UML2EcoreConverter.OPTION__DERIVED_FEATURES, new String[]{
				ignoreChoiceLabel, reportChoiceLabel, processChoiceLabel},
			processChoiceLabel);
		addOptionControl(group,
			UMLImporterPlugin.INSTANCE
				.getString("_UI_DuplicateFeatureInheritance_label"), //$NON-NLS-1$
			UMLUtil.UML2EcoreConverter.OPTION__DUPLICATE_FEATURE_INHERITANCE,
			new String[]{ignoreChoiceLabel, reportChoiceLabel,
				discardChoiceLabel, processChoiceLabel}, discardChoiceLabel);
		addOptionControl(
			group,
			UMLImporterPlugin.INSTANCE.getString("_UI_DuplicateFeatures_label"), //$NON-NLS-1$
			UMLUtil.UML2EcoreConverter.OPTION__DUPLICATE_FEATURES,
			new String[]{ignoreChoiceLabel, reportChoiceLabel,
				discardChoiceLabel, processChoiceLabel}, discardChoiceLabel);
		addOptionControl(group,
			UMLImporterPlugin.INSTANCE
				.getString("_UI_DuplicateOperationInheritance_label"), //$NON-NLS-1$
			UMLUtil.UML2EcoreConverter.OPTION__DUPLICATE_OPERATION_INHERITANCE,
			new String[]{ignoreChoiceLabel, reportChoiceLabel,
				discardChoiceLabel, processChoiceLabel}, discardChoiceLabel);
		addOptionControl(group,
			UMLImporterPlugin.INSTANCE
				.getString("_UI_DuplicateOperations_label"), //$NON-NLS-1$
			UMLUtil.UML2EcoreConverter.OPTION__DUPLICATE_OPERATIONS,
			new String[]{ignoreChoiceLabel, reportChoiceLabel,
				discardChoiceLabel, processChoiceLabel}, discardChoiceLabel);
		addOptionControl(group,
			UMLImporterPlugin.INSTANCE
				.getString("_UI_RedefiningOperations_label"), //$NON-NLS-1$
			UMLUtil.UML2EcoreConverter.OPTION__REDEFINING_OPERATIONS,
			new String[]{ignoreChoiceLabel, reportChoiceLabel,
				processChoiceLabel}, reportChoiceLabel);
		addOptionControl(group,
			UMLImporterPlugin.INSTANCE
				.getString("_UI_RedefiningProperties_label"), //$NON-NLS-1$
			UMLUtil.UML2EcoreConverter.OPTION__REDEFINING_PROPERTIES,
			new String[]{ignoreChoiceLabel, reportChoiceLabel,
				processChoiceLabel}, reportChoiceLabel);
		addOptionControl(group,
			UMLImporterPlugin.INSTANCE
				.getString("_UI_SubsettingProperties_label"), //$NON-NLS-1$
			UMLUtil.UML2EcoreConverter.OPTION__SUBSETTING_PROPERTIES,
			new String[]{ignoreChoiceLabel, reportChoiceLabel,
				processChoiceLabel}, reportChoiceLabel);
		addOptionControl(group,
			UMLImporterPlugin.INSTANCE.getString("_UI_UnionProperties_label"), //$NON-NLS-1$
			UMLUtil.UML2EcoreConverter.OPTION__UNION_PROPERTIES, new String[]{
				ignoreChoiceLabel, reportChoiceLabel, processChoiceLabel},
			reportChoiceLabel);
		addOptionControl(group,
			UMLImporterPlugin.INSTANCE.getString("_UI_SuperClassOrder_label"), //$NON-NLS-1$
			UMLUtil.UML2EcoreConverter.OPTION__SUPER_CLASS_ORDER, new String[]{
				ignoreChoiceLabel, reportChoiceLabel, processChoiceLabel},
			processChoiceLabel);
		addOptionControl(
			group,
			UMLImporterPlugin.INSTANCE.getString("_UI_AnnotationDetails_label"), //$NON-NLS-1$
			UMLUtil.UML2EcoreConverter.OPTION__ANNOTATION_DETAILS,
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

		addOptionButton(group, composite, UMLImporterPlugin.INSTANCE
			.getString("_UI_IgnoreAll_label"), ignoreChoiceLabel); //$NON-NLS-1$

		addOptionButton(group, composite, UMLImporterPlugin.INSTANCE
			.getString("_UI_ProcessAll_label"), processChoiceLabel); //$NON-NLS-1$
	}

	protected UMLImporter getUMLImporter() {
		return (UMLImporter) getModelImporter();
	}

	protected String[] getFilterExtensions() {
		return new String[]{"*." + UMLResource.FILE_EXTENSION}; //$NON-NLS-1$
	}
}