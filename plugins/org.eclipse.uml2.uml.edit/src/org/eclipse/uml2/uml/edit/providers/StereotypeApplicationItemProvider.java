/*
 * Copyright (c) 2006, 2013 IBM Corporation, CEA, and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *   Kenn Hussey (CEA) - 251038
 *
 */
package org.eclipse.uml2.uml.edit.providers;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.edit.command.CommandParameter;
import org.eclipse.emf.edit.command.MoveCommand;
import org.eclipse.emf.edit.command.RemoveCommand;
import org.eclipse.emf.edit.command.ReplaceCommand;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ReflectiveItemProvider;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.eclipse.uml2.common.edit.provider.IItemQualifiedTextProvider;
import org.eclipse.uml2.common.util.UML2Util;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Extension;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.edit.UMLEditPlugin;
import org.eclipse.uml2.uml.util.UMLUtil;

public class StereotypeApplicationItemProvider
		extends ReflectiveItemProvider
		implements IItemQualifiedTextProvider {

	public StereotypeApplicationItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	@Override
	protected Command createAddCommand(EditingDomain domain, EObject owner,
			EStructuralFeature feature, Collection<?> collection, int index) {
		return new AddCommand(domain, owner, feature, collection, index) {

			@Override
			public Collection<?> doGetAffectedObjects() {
				return Collections.singleton(UMLUtil.getBaseElement(owner));
			}
		};
	}

	@Override
	protected Command createMoveCommand(EditingDomain domain, EObject owner,
			EStructuralFeature feature, Object value, int index) {
		return new MoveCommand(domain, owner, feature, value, index) {

			@Override
			public Collection<?> doGetAffectedObjects() {
				return Collections.singleton(UMLUtil.getBaseElement(owner));
			}
		};
	}

	@Override
	protected Command createRemoveCommand(EditingDomain domain, EObject owner,
			EStructuralFeature feature, Collection<?> collection) {
		return new RemoveCommand(domain, owner, feature, collection) {

			@Override
			public Collection<?> doGetAffectedObjects() {
				return Collections.singleton(UMLUtil.getBaseElement(owner));
			}
		};
	}

	@Override
	protected Command createReplaceCommand(EditingDomain domain, EObject owner,
			EStructuralFeature feature, EObject value, Collection<?> collection) {
		return new ReplaceCommand(domain, owner, feature, value, collection) {

			@Override
			public Collection<?> doGetAffectedObjects() {
				return Collections.singleton(UMLUtil.getBaseElement(owner));
			}
		};
	}

	@Override
	protected Command createSetCommand(EditingDomain domain, EObject owner,
			EStructuralFeature feature, Object value, int index) {

		if (index == CommandParameter.NO_INDEX) {
			return createSetCommand(domain, owner, feature, value);
		}

		return new SetCommand(domain, owner, feature, value, index) {

			@Override
			public Collection<?> doGetAffectedObjects() {
				return Collections.singleton(UMLUtil.getBaseElement(owner));
			}
		};
	}

	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		itemPropertyDescriptors = new ArrayList<IItemPropertyDescriptor>();

		for (EStructuralFeature eStructuralFeature : ((EObject) object)
			.eClass().getEAllStructuralFeatures()) {

			boolean isBaseReference = eStructuralFeature.getName().startsWith(
				Extension.METACLASS_ROLE_PREFIX);
			String[] filterFlags = isBaseReference
				|| ((EStructuralFeature.Internal) eStructuralFeature)
					.isContainment()
				? new String[]{"org.eclipse.ui.views.properties.expert"} //$NON-NLS-1$
				: null;

			itemPropertyDescriptors.add(new UMLItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory)
					.getRootAdapterFactory(), null,
				getFeatureText(eStructuralFeature), getResourceLocator()
					.getString(
						"_UI_Property_description", //$NON-NLS-1$
						new Object[]{getFeatureText(eStructuralFeature),
							eStructuralFeature.getEType().getName()}),
				eStructuralFeature, !isBaseReference
					&& eStructuralFeature.isChangeable(), false,
				eStructuralFeature instanceof EReference,
				ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				getTypeText(object), filterFlags));
		}

		return itemPropertyDescriptors;
	}

	@Override
	public void notifyChanged(Notification notification) {
		fireNotifyChanged(new ViewerNotification(notification,
			UMLUtil.getBaseElement((EObject) notification.getNotifier()), true,
			false));
	}

	@Override
	public String getText(Object object) {
		String text = super.getText(object);

		Element baseElement = UMLUtil.getBaseElement((EObject) object);

		if (baseElement != null) {
			IItemLabelProvider itemLabelProvider = (IItemLabelProvider) adapterFactory
				.adapt(baseElement, IItemLabelProvider.class);

			if (itemLabelProvider != null) {
				text += " -> " + itemLabelProvider.getText(baseElement); //$NON-NLS-1$
			}
		}

		return text;
	}

	public String getQualifiedText(Object object) {
		EObject eObject = (EObject) object;

		String qualifiedText = UML2Util.getQualifiedText(eObject,
			new UMLUtil.QualifiedTextProvider() {

				@Override
				public String getFeatureText(
						EStructuralFeature eStructuralFeature) {
					return StereotypeApplicationItemProvider.this
						.getFeatureText(eStructuralFeature);
				}

				@Override
				public String getClassText(EObject eObject) {
					Stereotype stereotype = UMLUtil.getStereotype(eObject);

					if (stereotype != null) {
						IItemLabelProvider itemLabelProvider = (IItemLabelProvider) adapterFactory
							.adapt(stereotype, IItemLabelProvider.class);

						if (itemLabelProvider instanceof IItemQualifiedTextProvider) {
							return ((IItemQualifiedTextProvider) itemLabelProvider)
								.getQualifiedText(stereotype);
						}
					}

					return UMLUtil.getQualifiedText(eObject.eClass());
				}

			});

		Element baseElement = UMLUtil.getBaseElement(eObject);

		if (baseElement != null) {
			IItemLabelProvider itemLabelProvider = (IItemLabelProvider) adapterFactory
				.adapt(baseElement, IItemLabelProvider.class);

			if (itemLabelProvider != null) {
				qualifiedText += " -> " //$NON-NLS-1$
					+ (itemLabelProvider instanceof IItemQualifiedTextProvider
						? ((IItemQualifiedTextProvider) itemLabelProvider)
							.getQualifiedText(baseElement)
						: itemLabelProvider.getText(baseElement));
			}
		}

		return qualifiedText;
	}

	@Override
	public ResourceLocator getResourceLocator() {
		return UMLEditPlugin.INSTANCE;
	}

}
