/*
 * Copyright (c) 2003, 2004 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Common Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/cpl-v10.html
 *
 * Contributors:
 *   IBM - Initial API and implementation
 */
package org.eclipse.uml2.presentation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.common.ui.celleditor.ExtendedComboBoxCellEditor;
import org.eclipse.emf.common.ui.celleditor.ExtendedDialogCellEditor;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.ui.celleditor.FeatureEditorDialog;
import org.eclipse.emf.edit.ui.provider.PropertyDescriptor;
import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.uml2.NamedElement;

/**
 *  
 */
public class UML2PropertyDescriptor
		extends PropertyDescriptor {

	public UML2PropertyDescriptor(Object object,
			IItemPropertyDescriptor itemPropertyDescriptor) {
		super(object, itemPropertyDescriptor);
	}

	/*
	 * @see org.eclipse.ui.views.properties.IPropertyDescriptor#createPropertyEditor(org.eclipse.swt.widgets.Composite)
	 */
	public CellEditor createPropertyEditor(Composite composite) {

		if (!itemPropertyDescriptor.canSetProperty(object)) {
			return null;
		}

		CellEditor result = null;

		Object genericFeature = itemPropertyDescriptor.getFeature(object);

		final ILabelProvider labelProvider = new LabelProvider() {

			public String getText(Object object) {

				if (NamedElement.class.isInstance(object)) {
					String qualifiedName = ((NamedElement) object)
							.getQualifiedName();

					if (null != qualifiedName && 0 != qualifiedName.length()) {
						return qualifiedName;
					}
				}

				return getLabelProvider().getText(object);
			}

			public Image getImage(Object object) {
				return getLabelProvider().getImage(object);
			}
		};

		if (genericFeature instanceof EReference[]) {
			List choiceOfValues = new ArrayList(itemPropertyDescriptor
					.getChoiceOfValues(object));

			Collections.sort(choiceOfValues, new Comparator() {

				public int compare(Object o1, Object o2) {
					return labelProvider.getText(o1).compareTo(
							labelProvider.getText(o2));
				}
			});

			result = new ExtendedComboBoxCellEditor(composite, choiceOfValues,
					labelProvider, true);
		} else if (genericFeature instanceof EStructuralFeature) {
			final EStructuralFeature feature = (EStructuralFeature) genericFeature;
			final EClassifier eType = feature.getEType();
			Collection choices = itemPropertyDescriptor
					.getChoiceOfValues(object);

			if (choices != null) {
				final List choiceOfValues = new ArrayList(choices);

				Collections.sort(choiceOfValues, new Comparator() {

					public int compare(Object o1, Object o2) {
						return labelProvider.getText(o1).compareTo(
								labelProvider.getText(o2));
					}
				});

				if (feature.isMany() && object instanceof EObject) {
					boolean valid = true;

					for (Iterator i = choiceOfValues.iterator(); i.hasNext();) {
						Object choice = i.next();

						if (!eType.isInstance(choice)) {
							valid = false;
							break;
						}
					}

					if (valid) {
						result = new ExtendedDialogCellEditor(composite,
								labelProvider) {

							protected Object openDialogBox(
									Control cellEditorWindow) {
								FeatureEditorDialog dialog = new FeatureEditorDialog(
										cellEditorWindow.getShell(),
										labelProvider,
										(EObject) object,
										feature.getEType(),
										(List) ((IItemPropertySource) itemPropertyDescriptor
												.getPropertyValue(object))
												.getEditableValue(object),
										getDisplayName(), new ArrayList(
												choiceOfValues));
								dialog.open();
								return dialog.getResult();
							}
						};
					}
				}

				if (result == null) {
					result = new ExtendedComboBoxCellEditor(composite,
							new ArrayList(choiceOfValues), labelProvider, true);
				}
			} else if (eType instanceof EDataType) {
				EDataType eDataType = (EDataType) eType;

				if (eDataType.isSerializable()) {

					if (feature.isMany() && object instanceof EObject) {
						result = new ExtendedDialogCellEditor(composite,
								labelProvider) {

							protected Object openDialogBox(
									Control cellEditorWindow) {
								FeatureEditorDialog dialog = new FeatureEditorDialog(
										cellEditorWindow.getShell(),
										labelProvider,
										(EObject) object,
										feature.getEType(),
										(List) ((IItemPropertySource) itemPropertyDescriptor
												.getPropertyValue(object))
												.getEditableValue(object),
										getDisplayName(), null);
								dialog.open();
								return dialog.getResult();
							}
						};
					} else if (eDataType == EcorePackage.eINSTANCE
							.getEBoolean()
							|| eDataType == EcorePackage.eINSTANCE
									.getEBooleanObject()) {
						result = new ExtendedComboBoxCellEditor(composite,
								Arrays.asList(new Object[] {new Boolean(false),
										new Boolean(true)}), labelProvider,
								true);
					} else {
						result = new EDataTypeCellEditor(eDataType, composite);
					}
				}
			}
		}

		return result;
	}

}
