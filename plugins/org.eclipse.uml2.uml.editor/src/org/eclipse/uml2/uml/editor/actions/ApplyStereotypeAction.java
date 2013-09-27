/*
 * Copyright (c) 2005, 2013 IBM Corporation, CEA, and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *   Kenn Hussey - 286329
 *   Christian W. Damus (CEA) - 326915, 286444
 *
 */
package org.eclipse.uml2.uml.editor.actions;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.IdentityCommand;
import org.eclipse.emf.common.command.UnexecutableCommand;
import org.eclipse.emf.common.ui.dialogs.ResourceDialog;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.ComboViewer;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.editor.UMLEditorPlugin;
import org.eclipse.uml2.uml.editor.dialogs.AbstractChoicesDialogDelegate;
import org.eclipse.uml2.uml.editor.dialogs.ChoicesDialog;
import org.eclipse.uml2.uml.util.UMLUtil.StereotypeApplicationHelper;

public class ApplyStereotypeAction
		extends UMLCommandAction {

	public ApplyStereotypeAction() {
		super();
	}

	@Override
	protected Command createActionCommand(EditingDomain editingDomain,
			Collection<?> collection) {

		if (collection.size() == 1
			&& collection.iterator().next() instanceof Element) {

			return IdentityCommand.INSTANCE;
		}

		return UnexecutableCommand.INSTANCE;
	}

	@Override
	public void run(IAction action) {

		if (command != UnexecutableCommand.INSTANCE) {
			final Element element = (Element) collection.iterator().next();

			final List<Stereotype> choiceOfValues = new ArrayList<Stereotype>();

			for (Stereotype applicableStereotype : element
				.getApplicableStereotypes()) {

				if (!element.isStereotypeApplied(applicableStereotype)) {
					choiceOfValues.add(applicableStereotype);
				}
			}

			Collections.<Stereotype> sort(choiceOfValues,
				new TextComparator<Stereotype>());

			String label = UMLEditorPlugin.INSTANCE
				.getString("_UI_ApplyStereotypeActionCommand_label"); //$NON-NLS-1$

			final ChoicesDelegate chooserDelegate = new ChoicesDelegate(
				element, choiceOfValues);
			final ChoicesDialog<Stereotype> dialog = new ChoicesDialog<Stereotype>(
				workbenchPart.getSite().getShell(), element, label,
				chooserDelegate);
			dialog.open();

			if ((dialog.getReturnCode() == Window.OK)
				&& !dialog.getResult().isEmpty()) {

				editingDomain.getCommandStack().execute(
					new RefreshingChangeCommand(editingDomain, new Runnable() {

						public void run() {
							final StereotypeApplicationHelper helper = chooserDelegate
								.getSelectedResource() == null
								? null
								: new StereotypeApplicationHelper() {

									@Override
									protected EList<EObject> getContainmentList(
											Element element, EClass definition) {
										return chooserDelegate
											.getSelectedResource()
											.getContents();
									}
								};

							for (Stereotype result : dialog.getResult()) {
								EObject newApplication = element
									.applyStereotype(result);
								if (helper != null) {
									helper.addToContainmentList(element,
										newApplication);
								}
							}
						}
					}, label));
			}
		}
	}

	//
	// Nested types
	//

	private final class ChoicesDelegate
			extends AbstractChoicesDialogDelegate<Stereotype> {

		private ComboViewer resourceCombo;

		private EList<Object> resourcesList;

		private final Element element;

		private final Collection<Stereotype> applicableStereotypes;

		private Resource selectedResource;

		ChoicesDelegate(Element element,
				Collection<Stereotype> applicableStereotypes) {
			super(Stereotype.class);

			this.element = element;
			this.applicableStereotypes = applicableStereotypes;
		}

		public Resource getSelectedResource() {
			Resource result = selectedResource;

			// don't return the default resource, so that we won't mess with new
			// stereotype applications
			if (result == element.eResource()) {
				result = null;
			}

			return result;
		}

		@Override
		public String getChoicesLabelText() {
			return UMLEditorPlugin.INSTANCE
				.getString("_UI_ApplicableStereotypes_label"); //$NON-NLS-1$
		}

		@Override
		public String getValuesLabelText() {
			return UMLEditorPlugin.INSTANCE
				.getString("_UI_StereotypesToApply_label"); //$NON-NLS-1$
		}

		@Override
		public String getAddButtonText() {
			return UMLEditorPlugin.INSTANCE.getString("_UI_Apply_label"); //$NON-NLS-1$
		}

		@Override
		public String getRemoveButtonText() {
			return UMLEditorPlugin.INSTANCE.getString("_UI_Unapply_label"); //$NON-NLS-1$
		}

		public ILabelProvider getLabelProvider() {
			return ApplyStereotypeAction.this.getLabelProvider();
		}

		public Collection<Stereotype> getChoiceOfValues() {
			return applicableStereotypes;
		}

		@Override
		public void createAdditionalControls(Composite parent) {
			Composite contents = new Composite(parent, SWT.NONE);
			contents.setLayout(new GridLayout(2, false));
			new Label(contents, SWT.NONE)
				.setText("Create stereotype applications in:");
			resourceCombo = new ComboViewer(contents, SWT.DROP_DOWN
				| SWT.READ_ONLY);
			resourceCombo.setLabelProvider(getLabelProvider());
			resourceCombo.setContentProvider(new ArrayContentProvider());

			final Resource defaultResource = computeDefaultResource();
			final ResourceSet rset = defaultResource.getResourceSet();
			resourcesList = new BasicEList<Object>(
				rset.getResources().size() + 1);
			for (Resource next : rset.getResources()) {
				if (!editingDomain.isReadOnly(next)) {
					resourcesList.add(next);
				}
			}
			resourcesList.move(0, defaultResource);
			resourcesList.add("Other...");
			resourceCombo.setInput(resourcesList);
			resourceCombo
				.setSelection(new StructuredSelection(defaultResource));
			selectedResource = defaultResource;

			resourceCombo
				.addSelectionChangedListener(new ISelectionChangedListener() {

					public void selectionChanged(SelectionChangedEvent event) {
						if (event.getSelection().isEmpty()) {
							selectedResource = defaultResource;
						} else {
							Object selected = ((IStructuredSelection) event
								.getSelection()).getFirstElement();
							if (selected instanceof Resource) {
								selectedResource = (Resource) selected;
							} else {
								// clicked on "Other..."
								URI contextURI = null;
								if ((selectedResource != null)
									&& selectedResource.getURI()
										.isPlatformResource()) {

									contextURI = selectedResource.getURI();
								}

								ResourceDialog dlg = new ResourceDialog(
									resourceCombo.getControl().getShell(),
									"Load Other Resource", SWT.OPEN
										| SWT.SINGLE, contextURI);

								Resource newResource = null;

								if ((dlg.open() == Window.OK)
									&& !dlg.getURIs().isEmpty()) {
									URI newURI = dlg.getURIs().get(0);

									newResource = rset.getResource(newURI,
										false);
									if (newResource == null) {
										// try to load it, then
										newResource = rset.getResource(newURI,
											true);
										if (newResource != null) {
											// add it after the
											// default
											resourcesList.add(1, newResource);
											resourceCombo.refresh();
										}
									}
								}

								if (newResource == null) {
									// revert to the current
									// selection, then
									newResource = selectedResource;
								}

								// select the new resource
								resourceCombo
									.setSelection(new StructuredSelection(
										newResource));
								selectedResource = newResource;

								// the loading of a new resource may have
								// brought in new stereotype applications
								applicableStereotypes.removeAll(element
									.getAppliedStereotypes());
								getDialog().updateChoiceOfValues();
							}
						}
					}
				});
		}

		private Resource computeDefaultResource() {
			Resource result = null;

			// if all of the current stereotype applications are in some other
			// resource, then let that be the default on the assumption that the
			// user will want to continue this pattern
			for (EObject next : element.getStereotypeApplications()) {
				Resource res = next.eResource();
				if (result == null) {
					result = res;
				} else if (res != result) {
					// forget it, we'll use the element's containing resource as
					// the default
					result = null;
					break;
				}
			}

			if (result == null) {
				result = element.eResource();
			}

			return result;
		}
	}
}
