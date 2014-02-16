/*
 * Copyright (c) 2002, 2014 IBM Corporation, CEA, and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *   Christian W. Damus (CEA) - 326915, 268444
 *
 */
package org.eclipse.uml2.uml.editor.dialogs;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.ItemProvider;
import org.eclipse.emf.edit.ui.EMFEditUIPlugin;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;
import org.eclipse.emf.edit.ui.provider.ExtendedImageRegistry;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.viewers.AbstractTreeViewer;
import org.eclipse.jface.viewers.CellLabelProvider;
import org.eclipse.jface.viewers.DoubleClickEvent;
import org.eclipse.jface.viewers.IContentProvider;
import org.eclipse.jface.viewers.IDoubleClickListener;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TableViewerColumn;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ControlAdapter;
import org.eclipse.swt.events.ControlEvent;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.dialogs.PatternFilter;
import org.eclipse.uml2.uml.editor.UMLEditorPlugin;

/**
 * A two-pane dialog, adapted from FeatureEditorDialog in EMF, that lets the
 * user choose elements from the left-side list to add to the right-side list.
 * The elements on the right-side list may optionally be ordered by moving them
 * up and down.
 * 
 * The dialog delegates a variety of decisions to a
 * {@linkplain IChoicesDialogDelegate delegate}.
 * 
 * @since 5.0
 * 
 * @see IChoicesDialogDelegate
 */
public class ChoicesDialog<T>
		extends Dialog {

	protected IContentProvider contentProvider;

	protected Object object;

	protected String displayName;

	protected ItemProvider values;

	protected List<T> choiceOfValues;

	protected TableViewer choiceTableViewer;

	protected TableViewer valuesTableViewer;

	protected EList<T> result;

	protected final IChoicesDialogDelegate<T> delegate;

	public ChoicesDialog(Shell parent, Object object, String displayName,
			IChoicesDialogDelegate<T> delegate) {

		super(parent);

		setShellStyle(getShellStyle() | SWT.RESIZE | SWT.MAX);
		this.object = object;
		this.displayName = displayName;
		this.delegate = delegate;

		if (delegate instanceof AbstractChoicesDialogDelegate<?>) {
			((AbstractChoicesDialogDelegate<T>) delegate).setDialog(this);
		}

		AdapterFactory adapterFactory = new ComposedAdapterFactory(
			Collections.<AdapterFactory> emptyList());
		values = new ItemProvider(adapterFactory, Collections.EMPTY_LIST);
		contentProvider = new AdapterFactoryContentProvider(adapterFactory);

		updateChoiceOfValues();
	}

	@Override
	protected void configureShell(Shell shell) {
		super.configureShell(shell);

		ILabelProvider labelProvider = delegate.getLabelProvider();
		shell.setText(UMLEditorPlugin.INSTANCE.getString(
			"_UI_ChoicesDialog_title",
			new Object[]{displayName, labelProvider.getText(object)}));
		shell.setImage(labelProvider.getImage(object));
	}

	/**
	 * Updates me to reflect a change in the choice of values provided by my
	 * delegate.
	 */
	public void updateChoiceOfValues() {
		choiceOfValues = new java.util.ArrayList<T>(
			delegate.getChoiceOfValues());
		if (values != null) {
			// anything that's no longer a choice must be removed
			values.getChildren().retainAll(choiceOfValues);
		}

		if (choiceTableViewer != null) {
			choiceTableViewer.setInput(new ItemProvider(choiceOfValues));
		}
		if (valuesTableViewer != null) {
			valuesTableViewer.refresh();
		}
	}

	@Override
	protected Control createDialogArea(Composite parent) {
		Composite contents = (Composite) super.createDialogArea(parent);

		GridLayout contentsGridLayout = (GridLayout) contents.getLayout();
		contentsGridLayout.numColumns = 3;

		GridData contentsGridData = (GridData) contents.getLayoutData();
		contentsGridData.horizontalAlignment = SWT.FILL;
		contentsGridData.verticalAlignment = SWT.FILL;

		Text patternText = null;

		Group filterGroupComposite = new Group(contents, SWT.NONE);
		filterGroupComposite.setText(EMFEditUIPlugin.INSTANCE
			.getString("_UI_Choices_pattern_group"));
		filterGroupComposite.setLayout(new GridLayout(2, false));
		filterGroupComposite.setLayoutData(new GridData(SWT.FILL, SWT.DEFAULT,
			true, false, 3, 1));

		Label label = new Label(filterGroupComposite, SWT.NONE);
		label.setText(EMFEditUIPlugin.INSTANCE
			.getString("_UI_Choices_pattern_label"));

		patternText = new Text(filterGroupComposite, SWT.BORDER | SWT.SEARCH);
		patternText.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));

		Composite choiceComposite = new Composite(contents, SWT.NONE);
		{
			GridData data = new GridData(SWT.FILL, SWT.FILL, true, true);
			data.horizontalAlignment = SWT.END;
			choiceComposite.setLayoutData(data);

			GridLayout layout = new GridLayout();
			data.horizontalAlignment = SWT.FILL;
			layout.marginHeight = 0;
			layout.marginWidth = 0;
			layout.numColumns = 1;
			choiceComposite.setLayout(layout);
		}

		Label choiceLabel = new Label(choiceComposite, SWT.NONE);
		choiceLabel.setText(delegate.getChoicesLabelText());
		GridData choiceLabelGridData = new GridData();
		choiceLabelGridData.verticalAlignment = SWT.FILL;
		choiceLabelGridData.horizontalAlignment = SWT.FILL;
		choiceLabel.setLayoutData(choiceLabelGridData);

		final Table choiceTable = new Table(choiceComposite, SWT.MULTI
			| SWT.BORDER);
		GridData choiceTableGridData = new GridData();
		choiceTableGridData.widthHint = Display.getCurrent().getBounds().width / 5;
		choiceTableGridData.heightHint = Display.getCurrent().getBounds().height / 3;
		choiceTableGridData.verticalAlignment = SWT.FILL;
		choiceTableGridData.horizontalAlignment = SWT.FILL;
		choiceTableGridData.grabExcessHorizontalSpace = true;
		choiceTableGridData.grabExcessVerticalSpace = true;
		choiceTable.setLayoutData(choiceTableGridData);

		choiceTableViewer = new TableViewer(choiceTable);
		choiceTableViewer.setContentProvider(new AdapterFactoryContentProvider(
			new AdapterFactoryImpl()));
		configureLabelProvider(choiceTableViewer);
		final PatternFilter filter = new PatternFilter() {

			@Override
			protected boolean isParentMatch(Viewer viewer, Object element) {
				return viewer instanceof AbstractTreeViewer
					&& super.isParentMatch(viewer, element);
			}
		};
		choiceTableViewer.addFilter(filter);
		if (patternText != null) {
			patternText.addModifyListener(new ModifyListener() {

				public void modifyText(ModifyEvent e) {
					filter.setPattern(((Text) e.widget).getText());
					choiceTableViewer.refresh();
				}
			});
		}

		// enforce uniqueness
		choiceTableViewer.addFilter(new ViewerFilter() {

			@Override
			public boolean select(Viewer viewer, Object parentElement,
					Object element) {
				return !values.getChildren().contains(element);
			}
		});
		choiceTableViewer.setInput(new ItemProvider(choiceOfValues));

		Composite controlButtons = new Composite(contents, SWT.NONE);
		GridData controlButtonsGridData = new GridData();
		controlButtonsGridData.verticalAlignment = SWT.FILL;
		controlButtonsGridData.horizontalAlignment = SWT.FILL;
		controlButtons.setLayoutData(controlButtonsGridData);

		GridLayout controlsButtonGridLayout = new GridLayout();
		controlButtons.setLayout(controlsButtonGridLayout);

		new Label(controlButtons, SWT.NONE);

		final Button addButton = new Button(controlButtons, SWT.PUSH);
		addButton.setText(delegate.getAddButtonText());
		addButton.setImage(ExtendedImageRegistry.getInstance().getImage(
			UMLEditorPlugin.INSTANCE.getImage("full/etool16/ArrowRight.gif"))); //$NON-NLS-1$
		GridData addButtonGridData = new GridData();
		addButtonGridData.verticalAlignment = SWT.FILL;
		addButtonGridData.horizontalAlignment = SWT.FILL;
		addButton.setLayoutData(addButtonGridData);

		final Button removeButton = new Button(controlButtons, SWT.PUSH);
		removeButton.setText(delegate.getRemoveButtonText());
		removeButton.setImage(ExtendedImageRegistry.getInstance().getImage(
			UMLEditorPlugin.INSTANCE.getImage("full/etool16/ArrowLeft.gif"))); //$NON-NLS-1$
		GridData removeButtonGridData = new GridData();
		removeButtonGridData.verticalAlignment = SWT.FILL;
		removeButtonGridData.horizontalAlignment = SWT.FILL;
		removeButton.setLayoutData(removeButtonGridData);

		Label spaceLabel = new Label(controlButtons, SWT.NONE);
		GridData spaceLabelGridData = new GridData();
		spaceLabelGridData.verticalSpan = 2;
		spaceLabel.setLayoutData(spaceLabelGridData);

		final boolean allowReorder = delegate.allowsReordering();
		final Button upButton = allowReorder
			? new Button(controlButtons, SWT.PUSH)
			: null;
		if (allowReorder) {
			upButton
				.setText(EMFEditUIPlugin.INSTANCE.getString("_UI_Up_label"));
			upButton.setImage(ExtendedImageRegistry.getInstance().getImage(
				UMLEditorPlugin.INSTANCE.getImage("full/etool16/ArrowUp.gif"))); //$NON-NLS-1$
			GridData upButtonGridData = new GridData();
			upButtonGridData.verticalAlignment = SWT.FILL;
			upButtonGridData.horizontalAlignment = SWT.FILL;
			upButton.setLayoutData(upButtonGridData);
		}

		final Button downButton = allowReorder
			? new Button(controlButtons, SWT.PUSH)
			: null;
		if (allowReorder) {
			downButton.setText(EMFEditUIPlugin.INSTANCE
				.getString("_UI_Down_label"));
			downButton.setImage(ExtendedImageRegistry.getInstance()
				.getImage(
					UMLEditorPlugin.INSTANCE
						.getImage("full/etool16/ArrowDown.gif"))); //$NON-NLS-1$
			GridData downButtonGridData = new GridData();
			downButtonGridData.verticalAlignment = SWT.FILL;
			downButtonGridData.horizontalAlignment = SWT.FILL;
			downButton.setLayoutData(downButtonGridData);
		}

		Composite valuesComposite = new Composite(contents, SWT.NONE);
		{
			GridData data = new GridData(SWT.FILL, SWT.FILL, true, true);
			data.horizontalAlignment = SWT.END;
			valuesComposite.setLayoutData(data);

			GridLayout layout = new GridLayout();
			data.horizontalAlignment = SWT.FILL;
			layout.marginHeight = 0;
			layout.marginWidth = 0;
			layout.numColumns = 1;
			valuesComposite.setLayout(layout);
		}

		Label valuesLabel = new Label(valuesComposite, SWT.NONE);
		valuesLabel.setText(delegate.getValuesLabelText());
		GridData featureLabelGridData = new GridData();
		featureLabelGridData.horizontalSpan = 2;
		featureLabelGridData.horizontalAlignment = SWT.FILL;
		featureLabelGridData.verticalAlignment = SWT.FILL;
		valuesLabel.setLayoutData(featureLabelGridData);

		final Table valuesTable = new Table(valuesComposite, SWT.MULTI
			| SWT.BORDER);
		GridData featureTableGridData = new GridData();
		featureTableGridData.widthHint = Display.getCurrent().getBounds().width / 5;
		featureTableGridData.heightHint = Display.getCurrent().getBounds().height / 3;
		featureTableGridData.verticalAlignment = SWT.FILL;
		featureTableGridData.horizontalAlignment = SWT.FILL;
		featureTableGridData.grabExcessHorizontalSpace = true;
		featureTableGridData.grabExcessVerticalSpace = true;
		valuesTable.setLayoutData(featureTableGridData);

		valuesTableViewer = new TableViewer(valuesTable);
		valuesTableViewer.setContentProvider(contentProvider);
		configureLabelProvider(valuesTableViewer);
		valuesTableViewer.setInput(values);
		final EList<Object> children = values.getChildren();
		if (!children.isEmpty()) {
			valuesTableViewer.setSelection(new StructuredSelection(children
				.get(0)));
		}

		choiceTableViewer.addDoubleClickListener(new IDoubleClickListener() {

			public void doubleClick(DoubleClickEvent event) {
				if (addButton.isEnabled()) {
					addButton.notifyListeners(SWT.Selection, null);
				}
			}
		});

		valuesTableViewer.addDoubleClickListener(new IDoubleClickListener() {

			public void doubleClick(DoubleClickEvent event) {
				if (removeButton.isEnabled()) {
					removeButton.notifyListeners(SWT.Selection, null);
				}
			}
		});

		if (allowReorder) {
			upButton.addSelectionListener(new SelectionAdapter() {

				@Override
				public void widgetSelected(SelectionEvent event) {
					IStructuredSelection selection = (IStructuredSelection) valuesTableViewer
						.getSelection();
					int minIndex = 0;
					for (Iterator<?> i = selection.iterator(); i.hasNext();) {
						Object value = i.next();
						int index = children.indexOf(value);
						children.move(Math.max(index - 1, minIndex++), value);
					}
				}
			});

			downButton.addSelectionListener(new SelectionAdapter() {

				@Override
				public void widgetSelected(SelectionEvent event) {
					IStructuredSelection selection = (IStructuredSelection) valuesTableViewer
						.getSelection();
					int maxIndex = children.size() - 1;
					List<?> objects = selection.toList();
					for (ListIterator<?> i = objects.listIterator(objects
						.size()); i.hasPrevious();) {
						Object value = i.previous();
						int index = children.indexOf(value);
						children.move(Math.min(index + 1, maxIndex--), value);
					}
				}
			});
		}

		addButton.addSelectionListener(new SelectionAdapter() {

			// event is null when choiceTableViewer is double clicked
			@Override
			public void widgetSelected(SelectionEvent event) {
				IStructuredSelection selection = (IStructuredSelection) choiceTableViewer
					.getSelection();
				for (Iterator<?> i = selection.iterator(); i.hasNext();) {
					Object value = i.next();
					if (!children.contains(value)) {
						children.add(value);
					}
				}
				valuesTableViewer.refresh();
				valuesTableViewer.setSelection(selection);
				choiceTableViewer.refresh();
			}
		});

		removeButton.addSelectionListener(new SelectionAdapter() {

			// event is null when valuesTableViewer is double clicked
			@Override
			public void widgetSelected(SelectionEvent event) {
				IStructuredSelection selection = (IStructuredSelection) valuesTableViewer
					.getSelection();
				Object firstValue = null;
				for (Iterator<?> i = selection.iterator(); i.hasNext();) {
					Object value = i.next();
					if (firstValue == null) {
						firstValue = value;
					}
					children.remove(value);
				}

				if (!children.isEmpty()) {
					valuesTableViewer.setSelection(new StructuredSelection(
						children.get(0)));
				}

				choiceTableViewer.refresh();
				choiceTableViewer.setSelection(selection);
			}
		});

		choiceTableViewer
			.addSelectionChangedListener(new ISelectionChangedListener() {

				public void selectionChanged(SelectionChangedEvent event) {
					addButton.setEnabled(delegate.canAdd(
						(IStructuredSelection) event.getSelection(),
						getValues()));
				}
			});

		valuesTableViewer
			.addSelectionChangedListener(new ISelectionChangedListener() {

				public void selectionChanged(SelectionChangedEvent event) {
					removeButton.setEnabled(delegate.canRemove(
						(IStructuredSelection) event.getSelection(),
						getChoices()));
				}
			});

		if (delegate.hasAdditionalControls()) {
			Composite additional = new Composite(contents, SWT.NONE);
			additional.setLayoutData(new GridData(SWT.FILL, SWT.TOP, true,
				false, 3, 1));
			additional.setLayout(new FillLayout());
			delegate.createAdditionalControls(additional);
		}

		return contents;
	}

	protected void configureLabelProvider(TableViewer viewer) {
		final ILabelProvider labelProvider = delegate
			.createLabelProvider(viewer);
		if (labelProvider instanceof CellLabelProvider) {
			// create a table column to install styling support
			final TableViewerColumn column = new TableViewerColumn(viewer,
				SWT.LEFT);
			column.setLabelProvider((CellLabelProvider) labelProvider);

			// pin the width of the column to the table size (only column)
			viewer.getTable().addControlListener(new ControlAdapter() {

				@Override
				public void controlResized(ControlEvent e) {
					column.getColumn().setWidth(
						((Control) e.widget).getSize().x);
				}
			});
		} else {
			viewer.setLabelProvider(labelProvider);
		}

	}

	protected Collection<T> getChoices() {
		return choiceOfValues;
	}

	protected EList<T> getValues() {
		Class<T> type = delegate.getElementType();

		EList<T> result = new BasicEList<T>(values.getChildren().size());
		for (Object next : values.getChildren()) {
			if (type.isInstance(next)) {
				result.add(type.cast(next));
			}
		}

		return result;
	}

	@Override
	protected void okPressed() {
		EList<T> values = getValues();
		if (delegate.okPressed(values)) {
			result = values;
			super.okPressed();
		}
	}

	@Override
	public boolean close() {
		contentProvider.dispose();
		return super.close();
	}

	public EList<T> getResult() {
		return result;
	}
}
