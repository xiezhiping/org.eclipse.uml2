/*
 * Copyright (c) 2006, 2014 IBM Corporation, CEA, and others.
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
package org.eclipse.uml2.uml.ecore.exporter.ui;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.exporter.ModelExporter;
import org.eclipse.emf.exporter.ui.contribution.base.ModelExporterOptionsPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.CCombo;
import org.eclipse.swt.custom.ScrolledComposite;
import org.eclipse.swt.events.ControlAdapter;
import org.eclipse.swt.events.ControlEvent;
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

	protected final Map<String, String> choiceLabels = new HashMap<String, String>();

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
		label.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false));
		label.setText(text);

		final CCombo combo = new CCombo(parent, SWT.BORDER | SWT.READ_ONLY);
		combo.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false));
		combo.setItems(choices);

		combo.addModifyListener(new ModifyListener() {

			public void modifyText(ModifyEvent me) {
				getUMLExporter().getOptions().put(option,
					choiceLabels.get(combo.getText()));
			}
		});

		String choice = getUMLExporter().getOptions().get(option);

		for (Map.Entry<String, String> entry : choiceLabels.entrySet()) {

			if (entry.getValue().equals(choice)) {
				initialChoice = entry.getKey();
				break;
			}
		}

		combo.setText(initialChoice);
	}

	protected void addOptionButton(final Composite optionsParent,
			Composite parent, String text, final String choiceLabel) {
		Button button = new Button(parent, SWT.PUSH);
		button.setText(text);
		button.addSelectionListener(new SelectionAdapter() {

			@Override
			public void widgetSelected(SelectionEvent se) {
				Control[] children = optionsParent.getChildren();
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
		group.setLayout(new GridLayout());
		group.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
		group
			.setText(UMLExporterPlugin.INSTANCE.getString("_UI_Options_label")); //$NON-NLS-1$

		final ScrolledComposite scrolledComposite = new ScrolledComposite(
			group, SWT.V_SCROLL);
		scrolledComposite.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true,
			true));

		final Composite optionsComposite = new Composite(scrolledComposite,
			SWT.NONE);
		optionsComposite.setLayout(new GridLayout(2, false));
		optionsComposite.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true,
			true));

		addOptionControl(
			optionsComposite,
			UMLExporterPlugin.INSTANCE.getString("_UI_EcoreTaggedValues_label"), //$NON-NLS-1$
			UMLUtil.Ecore2UMLConverter.OPTION__ECORE_TAGGED_VALUES,
			new String[]{ignoreChoiceLabel, reportChoiceLabel,
				processChoiceLabel}, processChoiceLabel);
		addOptionControl(optionsComposite,
			UMLExporterPlugin.INSTANCE
				.getString("_UI_RedefinesAnnotations_label"), //$NON-NLS-1$
			UMLUtil.Ecore2UMLConverter.OPTION__REDEFINES_ANNOTATIONS,
			new String[]{ignoreChoiceLabel, reportChoiceLabel,
				processChoiceLabel}, processChoiceLabel);
		addOptionControl(optionsComposite,
			UMLExporterPlugin.INSTANCE
				.getString("_UI_SubsetsAnnotations_label"), //$NON-NLS-1$
			UMLUtil.Ecore2UMLConverter.OPTION__SUBSETS_ANNOTATIONS,
			new String[]{ignoreChoiceLabel, reportChoiceLabel,
				processChoiceLabel}, processChoiceLabel);
		addOptionControl(optionsComposite,
			UMLExporterPlugin.INSTANCE.getString("_UI_UnionAnnotations_label"), //$NON-NLS-1$
			UMLUtil.Ecore2UMLConverter.OPTION__UNION_ANNOTATIONS, new String[]{
				ignoreChoiceLabel, reportChoiceLabel, processChoiceLabel},
			processChoiceLabel);
		addOptionControl(
			optionsComposite,
			UMLExporterPlugin.INSTANCE.getString("_UI_AnnotationDetails_label"), //$NON-NLS-1$
			UMLUtil.UML2EcoreConverter.OPTION__ANNOTATION_DETAILS,
			new String[]{ignoreChoiceLabel, reportChoiceLabel,
				processChoiceLabel}, ignoreChoiceLabel);
		addOptionControl(optionsComposite,
			UMLExporterPlugin.INSTANCE.getString("_UI_BodyAnnotations_label"), //$NON-NLS-1$
			UMLUtil.Ecore2UMLConverter.OPTION__BODY_ANNOTATIONS, new String[]{
				ignoreChoiceLabel, reportChoiceLabel, processChoiceLabel},
			ignoreChoiceLabel);
		addOptionControl(optionsComposite,
			UMLExporterPlugin.INSTANCE
				.getString("_UI_DocumentationAnnotations_label"), //$NON-NLS-1$
			UMLUtil.Ecore2UMLConverter.OPTION__DOCUMENTATION_ANNOTATIONS,
			new String[]{ignoreChoiceLabel, reportChoiceLabel,
				processChoiceLabel}, processChoiceLabel);
		addOptionControl(optionsComposite,
			UMLExporterPlugin.INSTANCE.getString("_UI_XMIIdentifiers_label"), //$NON-NLS-1$
			UMLUtil.Ecore2UMLConverter.OPTION__XMI_IDENTIFIERS, new String[]{
				ignoreChoiceLabel, processChoiceLabel}, ignoreChoiceLabel);
		addOptionControl(
			optionsComposite,
			UMLExporterPlugin.INSTANCE.getString("_UI_OppositeRoleNames_label"), //$NON-NLS-1$
			UMLUtil.Ecore2UMLConverter.OPTION__OPPOSITE_ROLE_NAMES,
			new String[]{ignoreChoiceLabel, processChoiceLabel},
			ignoreChoiceLabel);

		scrolledComposite.setContent(optionsComposite);
		scrolledComposite.setExpandHorizontal(true);
		scrolledComposite.setExpandVertical(true);

		scrolledComposite.addControlListener(new ControlAdapter() {

			@Override
			public void controlResized(ControlEvent ce) {
				scrolledComposite.setMinHeight(optionsComposite.computeSize(
					SWT.DEFAULT, SWT.DEFAULT).y);
			}
		});

		Composite buttonsComposite = new Composite(group, SWT.NONE);
		buttonsComposite.setLayout(new RowLayout());
		buttonsComposite.setLayoutData(new GridData(SWT.END, SWT.BOTTOM, false,
			false));

		addOptionButton(
			optionsComposite,
			buttonsComposite,
			UMLExporterPlugin.INSTANCE.getString("_UI_IgnoreAll_label"), ignoreChoiceLabel); //$NON-NLS-1$
		addOptionButton(
			optionsComposite,
			buttonsComposite,
			UMLExporterPlugin.INSTANCE.getString("_UI_ProcessAll_label"), processChoiceLabel); //$NON-NLS-1$
	}

	@Override
	protected void createSaveSettingsControl(Composite parent) {
		super.createSaveSettingsControl(parent);

		addOptionControl(parent);
	}

}
