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
 * $Id: StereotypeApplicationItemProvider.java,v 1.1 2006/03/23 18:42:45 khussey Exp $
 */
package org.eclipse.uml2.uml.edit.providers;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.edit.command.CommandParameter;
import org.eclipse.emf.edit.command.MoveCommand;
import org.eclipse.emf.edit.command.RemoveCommand;
import org.eclipse.emf.edit.command.ReplaceCommand;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ReflectiveItemProvider;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.eclipse.uml2.uml.Extension;
import org.eclipse.uml2.uml.util.UMLUtil;

class StereotypeApplicationItemProvider
		extends ReflectiveItemProvider {

	public StereotypeApplicationItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	protected Command createAddCommand(EditingDomain domain, EObject owner,
			EStructuralFeature feature, Collection collection, int index) {
		return new AddCommand(domain, owner, feature, collection, index) {

			public Collection doGetAffectedObjects() {
				return Collections.singleton(UMLUtil
					.getBaseElement((EObject) owner));
			}
		};
	}

	protected Command createMoveCommand(EditingDomain domain, EObject owner,
			EStructuralFeature feature, Object value, int index) {
		return new MoveCommand(domain, owner, feature, value, index) {

			public Collection doGetAffectedObjects() {
				return Collections.singleton(UMLUtil
					.getBaseElement((EObject) owner));
			}
		};
	}

	protected Command createRemoveCommand(EditingDomain domain, EObject owner,
			EStructuralFeature feature, Collection collection) {
		return new RemoveCommand(domain, owner, feature, collection) {

			public Collection doGetAffectedObjects() {
				return Collections.singleton(UMLUtil
					.getBaseElement((EObject) owner));
			}
		};
	}

	protected Command createReplaceCommand(EditingDomain domain, EObject owner,
			EStructuralFeature feature, EObject value, Collection collection) {
		return new ReplaceCommand(domain, owner, feature, value, collection) {

			public Collection doGetAffectedObjects() {
				return Collections.singleton(UMLUtil
					.getBaseElement((EObject) owner));
			}
		};
	}

	protected Command createSetCommand(EditingDomain domain, EObject owner,
			EStructuralFeature feature, Object value, int index) {

		if (index == CommandParameter.NO_INDEX) {
			return createSetCommand(domain, owner, feature, value);
		}

		return new SetCommand(domain, owner, feature, value, index) {

			public Collection doGetAffectedObjects() {
				return Collections.singleton(UMLUtil
					.getBaseElement((EObject) owner));
			}
		};
	}

	public List getPropertyDescriptors(Object object) {
		itemPropertyDescriptors = new ArrayList();

		for (Iterator eAllStructuralFeatures = ((EObject) object).eClass()
			.getEAllStructuralFeatures().iterator(); eAllStructuralFeatures
			.hasNext();) {

			EStructuralFeature.Internal eStructuralFeature = (EStructuralFeature.Internal) eAllStructuralFeatures
				.next();
			boolean isBaseReference = eStructuralFeature.getName().startsWith(
				Extension.METACLASS_ROLE_PREFIX);
			String[] filterFlags = isBaseReference
				|| eStructuralFeature.isContainment()
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
					&& eStructuralFeature.isChangeable(),
				ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				getTypeText(object), filterFlags));
		}

		return itemPropertyDescriptors;
	}

	public void notifyChanged(Notification notification) {
		fireNotifyChanged(new ViewerNotification(notification, UMLUtil
			.getBaseElement((EObject) notification.getNotifier()), true, false));
	}

}
