/*
 * Copyright (c) 2006, 2009 IBM Corporation, Embarcadero Technologies, and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *   Kenn Hussey (Embarcadero Technologies) - 247980
 *
 * $Id: UMLItemPropertyDescriptor.java,v 1.9 2009/12/02 18:27:51 jbruck Exp $
 */
package org.eclipse.uml2.uml.edit.providers;

import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.uml2.common.edit.provider.IItemQualifiedTextProvider;

public class UMLItemPropertyDescriptor
		extends ItemPropertyDescriptor
		implements IItemQualifiedTextProvider {

	protected class UMLItemDelegator
			extends ItemDelegator
			implements IItemQualifiedTextProvider {

		protected UMLItemDelegator(AdapterFactory adapterFactory,
				ResourceLocator resourceLocator) {
			super(adapterFactory, resourceLocator);
		}

		public String getQualifiedText(Object object) {

			if (object instanceof List<?>) {
				StringBuffer text = new StringBuffer();

				@SuppressWarnings("unchecked")
				List<Object> children = (List<Object>) object;

				for (Object child : children) {

					if (text.length() > 0) {
						text.append(", "); //$NON-NLS-1$
					}

					text.append(getQualifiedText(child));
				}

				return text.toString();
			}
			IItemQualifiedTextProvider itemQualifiedTextProvider = (IItemQualifiedTextProvider) adapterFactory
				.adapt(object, IItemQualifiedTextProvider.class);

			return itemQualifiedTextProvider != null
				? itemQualifiedTextProvider.getQualifiedText(object)
				: getText(object);
		}
	}

	public UMLItemPropertyDescriptor(AdapterFactory adapterFactory,
			ResourceLocator resourceLocator, String displayName,
			String description, EStructuralFeature feature, boolean isSettable,
			boolean multiLine, boolean sortChoices, Object staticImage,
			String category, String[] filterFlags) {
		super(adapterFactory, resourceLocator, displayName, description,
			feature, isSettable, multiLine, sortChoices, staticImage,
			category == null && resourceLocator != null
				? resourceLocator.getString("_UI_UML_category") //$NON-NLS-1$
				: category, filterFlags);

		this.itemDelegator = new UMLItemDelegator(adapterFactory,
			resourceLocator);
	}

	public String getQualifiedText(Object object) {
		return ((IItemQualifiedTextProvider) itemDelegator)
			.getQualifiedText(object);
	}

	@Override
	public String getId(Object object) {
		String category = getCategory(object);
		return category == null
			? getQualifiedText(feature)
			: category + getQualifiedText(feature);
	}

}