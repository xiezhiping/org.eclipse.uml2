/*
 * Copyright (c) 2006, 2014 IBM Corporation, Embarcadero Technologies, CEA, and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *   Kenn Hussey (Embarcadero Technologies) - 213218
 *   Kenn Hussey (CEA) - 322715
 *   Christian W. Damus (CEA) - 409396, 403374, 420338, 405065
 *
 */
package org.eclipse.uml2.uml.ecore.importer.ui;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.importer.ModelImporter;
import org.eclipse.emf.importer.ui.contribution.base.ModelImporterDetailPage;
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
import org.eclipse.uml2.uml.ecore.importer.UMLImporter;
import org.eclipse.uml2.uml.ecore.importer.UMLImporterPlugin;
import org.eclipse.uml2.uml.util.UMLUtil;

public class UMLImporterDetailPage
		extends ModelImporterDetailPage {

	protected final Map<String, String> choiceLabels = new HashMap<String, String>();

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
		label.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false));
		label.setText(text);

		final CCombo combo = new CCombo(parent, SWT.BORDER | SWT.READ_ONLY);
		combo.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false));
		combo.setItems(choices);

		combo.addModifyListener(new ModifyListener() {

			public void modifyText(ModifyEvent me) {
				getUMLImporter().getOptions().put(option,
					choiceLabels.get(combo.getText()));
			}
		});

		String choice = getUMLImporter().getOptions().get(option);

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

	@Override
	protected void addDetailControl(Composite parent) {
		Group group = new Group(parent, SWT.SHADOW_ETCHED_IN);
		group.setLayout(new GridLayout());
		group.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
		group
			.setText(UMLImporterPlugin.INSTANCE.getString("_UI_Options_label")); //$NON-NLS-1$

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
			UMLImporterPlugin.INSTANCE.getString("_UI_EcoreTaggedValues_label"), //$NON-NLS-1$
			UMLUtil.UML2EcoreConverter.OPTION__ECORE_TAGGED_VALUES,
			new String[]{ignoreChoiceLabel, reportChoiceLabel,
				processChoiceLabel}, processChoiceLabel);
		addOptionControl(
			optionsComposite,
			UMLImporterPlugin.INSTANCE.getString("_UI_DerivedFeatures_label"), //$NON-NLS-1$
			UMLUtil.UML2EcoreConverter.OPTION__DERIVED_FEATURES, new String[]{
				ignoreChoiceLabel, reportChoiceLabel, processChoiceLabel},
			processChoiceLabel);
		addOptionControl(
			optionsComposite,
			UMLImporterPlugin.INSTANCE
				.getString("_UI_DuplicateFeatureInheritance_label"), //$NON-NLS-1$
			UMLUtil.UML2EcoreConverter.OPTION__DUPLICATE_FEATURE_INHERITANCE,
			new String[]{ignoreChoiceLabel, reportChoiceLabel,
				discardChoiceLabel, processChoiceLabel}, discardChoiceLabel);
		addOptionControl(
			optionsComposite,
			UMLImporterPlugin.INSTANCE.getString("_UI_DuplicateFeatures_label"), //$NON-NLS-1$
			UMLUtil.UML2EcoreConverter.OPTION__DUPLICATE_FEATURES,
			new String[]{ignoreChoiceLabel, reportChoiceLabel,
				discardChoiceLabel, processChoiceLabel}, discardChoiceLabel);
		addOptionControl(
			optionsComposite,
			UMLImporterPlugin.INSTANCE
				.getString("_UI_DuplicateOperationInheritance_label"), //$NON-NLS-1$
			UMLUtil.UML2EcoreConverter.OPTION__DUPLICATE_OPERATION_INHERITANCE,
			new String[]{ignoreChoiceLabel, reportChoiceLabel,
				discardChoiceLabel, processChoiceLabel}, discardChoiceLabel);
		addOptionControl(
			optionsComposite,
			UMLImporterPlugin.INSTANCE
				.getString("_UI_DuplicateOperations_label"), //$NON-NLS-1$
			UMLUtil.UML2EcoreConverter.OPTION__DUPLICATE_OPERATIONS,
			new String[]{ignoreChoiceLabel, reportChoiceLabel,
				discardChoiceLabel, processChoiceLabel}, discardChoiceLabel);
		addOptionControl(
			optionsComposite,
			UMLImporterPlugin.INSTANCE
				.getString("_UI_RedefiningOperations_label"), //$NON-NLS-1$
			UMLUtil.UML2EcoreConverter.OPTION__REDEFINING_OPERATIONS,
			new String[]{ignoreChoiceLabel, reportChoiceLabel,
				processChoiceLabel}, reportChoiceLabel);
		addOptionControl(
			optionsComposite,
			UMLImporterPlugin.INSTANCE
				.getString("_UI_RedefiningProperties_label"), //$NON-NLS-1$
			UMLUtil.UML2EcoreConverter.OPTION__REDEFINING_PROPERTIES,
			new String[]{ignoreChoiceLabel, reportChoiceLabel,
				processChoiceLabel}, reportChoiceLabel);
		addOptionControl(
			optionsComposite,
			UMLImporterPlugin.INSTANCE
				.getString("_UI_SubsettingProperties_label"), //$NON-NLS-1$
			UMLUtil.UML2EcoreConverter.OPTION__SUBSETTING_PROPERTIES,
			new String[]{ignoreChoiceLabel, reportChoiceLabel,
				processChoiceLabel}, reportChoiceLabel);
		addOptionControl(
			optionsComposite,
			UMLImporterPlugin.INSTANCE.getString("_UI_UnionProperties_label"), //$NON-NLS-1$
			UMLUtil.UML2EcoreConverter.OPTION__UNION_PROPERTIES, new String[]{
				ignoreChoiceLabel, reportChoiceLabel, processChoiceLabel},
			reportChoiceLabel);
		addOptionControl(
			optionsComposite,
			UMLImporterPlugin.INSTANCE.getString("_UI_SuperClassOrder_label"), //$NON-NLS-1$
			UMLUtil.UML2EcoreConverter.OPTION__SUPER_CLASS_ORDER, new String[]{
				ignoreChoiceLabel, reportChoiceLabel, processChoiceLabel},
			processChoiceLabel);
		addOptionControl(
			optionsComposite,
			UMLImporterPlugin.INSTANCE.getString("_UI_AnnotationDetails_label"), //$NON-NLS-1$
			UMLUtil.UML2EcoreConverter.OPTION__ANNOTATION_DETAILS,
			new String[]{ignoreChoiceLabel, reportChoiceLabel,
				processChoiceLabel}, processChoiceLabel);
		addOptionControl(
			optionsComposite,
			UMLImporterPlugin.INSTANCE
				.getString("_UI_InvariantConstraints_label"), //$NON-NLS-1$
			UMLUtil.UML2EcoreConverter.OPTION__INVARIANT_CONSTRAINTS,
			new String[]{ignoreChoiceLabel, reportChoiceLabel,
				processChoiceLabel}, processChoiceLabel);
		addOptionControl(
			optionsComposite,
			UMLImporterPlugin.INSTANCE
				.getString("_UI_ValidationDelegates_label"), //$NON-NLS-1$
			UMLUtil.UML2EcoreConverter.OPTION__VALIDATION_DELEGATES,
			new String[]{ignoreChoiceLabel, processChoiceLabel},
			ignoreChoiceLabel);
		addOptionControl(
			optionsComposite,
			UMLImporterPlugin.INSTANCE.getString("_UI_NonAPIInvariants_label"), //$NON-NLS-1$
			UMLUtil.UML2EcoreConverter.OPTION__NON_API_INVARIANTS,
			new String[]{ignoreChoiceLabel, processChoiceLabel},
			ignoreChoiceLabel);
		addOptionControl(
			optionsComposite,
			UMLImporterPlugin.INSTANCE.getString("_UI_OperationBodies_label"), //$NON-NLS-1$
			UMLUtil.UML2EcoreConverter.OPTION__OPERATION_BODIES, new String[]{
				ignoreChoiceLabel, reportChoiceLabel, processChoiceLabel},
			ignoreChoiceLabel);
		addOptionControl(
			optionsComposite,
			UMLImporterPlugin.INSTANCE
				.getString("_UI_InvocationDelegates_label"), //$NON-NLS-1$
			UMLUtil.UML2EcoreConverter.OPTION__INVOCATION_DELEGATES,
			new String[]{ignoreChoiceLabel, processChoiceLabel},
			ignoreChoiceLabel);
		addOptionControl(
			optionsComposite,
			UMLImporterPlugin.INSTANCE
				.getString("_UI_PropertyDefaultExpressions_label"), //$NON-NLS-1$
			UMLUtil.UML2EcoreConverter.OPTION__PROPERTY_DEFAULT_EXPRESSIONS,
			new String[]{ignoreChoiceLabel, reportChoiceLabel,
				processChoiceLabel}, ignoreChoiceLabel);
		addOptionControl(
			optionsComposite,
			UMLImporterPlugin.INSTANCE.getString("_UI_Comments_label"), //$NON-NLS-1$
			UMLUtil.UML2EcoreConverter.OPTION__COMMENTS, new String[]{
				ignoreChoiceLabel, reportChoiceLabel, processChoiceLabel},
			processChoiceLabel);
		addOptionControl(
			optionsComposite,
			UMLImporterPlugin.INSTANCE.getString("_UI_CamelCaseNames_label"), //$NON-NLS-1$
			UMLUtil.UML2EcoreConverter.OPTION__CAMEL_CASE_NAMES, new String[]{
				ignoreChoiceLabel, reportChoiceLabel, processChoiceLabel},
			ignoreChoiceLabel);
		addOptionControl(
			optionsComposite,
			UMLImporterPlugin.INSTANCE.getString("_UI_UntypedProperties_label"), //$NON-NLS-1$
			UMLUtil.UML2EcoreConverter.OPTION__UNTYPED_PROPERTIES,
			new String[]{ignoreChoiceLabel, reportChoiceLabel,
				discardChoiceLabel, processChoiceLabel}, reportChoiceLabel);
		addOptionControl(
			optionsComposite,
			UMLImporterPlugin.INSTANCE.getString("_UI_OppositeRoleNames_label"), //$NON-NLS-1$
			UMLUtil.UML2EcoreConverter.OPTION__OPPOSITE_ROLE_NAMES,
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
			UMLImporterPlugin.INSTANCE.getString("_UI_IgnoreAll_label"), ignoreChoiceLabel); //$NON-NLS-1$
		addOptionButton(
			optionsComposite,
			buttonsComposite,
			UMLImporterPlugin.INSTANCE.getString("_UI_ProcessAll_label"), processChoiceLabel); //$NON-NLS-1$
	}

	protected UMLImporter getUMLImporter() {
		return (UMLImporter) getModelImporter();
	}

}