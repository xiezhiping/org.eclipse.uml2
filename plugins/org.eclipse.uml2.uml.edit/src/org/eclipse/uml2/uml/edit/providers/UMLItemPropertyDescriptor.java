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
 * $Id: UMLItemPropertyDescriptor.java,v 1.1 2006/01/04 16:15:43 khussey Exp $
 */
package org.eclipse.uml2.uml.edit.providers;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.uml2.common.edit.provider.IItemQualifiedTextProvider;

class UMLItemPropertyDescriptor
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

			if (object instanceof EList) {
				StringBuffer text = new StringBuffer();

				for (Iterator i = ((List) object).iterator(); i.hasNext();) {
					Object child = i.next();

					if (text.length() > 0) {
						text.append(", "); //$NON-NLS-1$
					}

					text.append(getQualifiedText(child));
				}

				return text.toString();
			} else {
				IItemQualifiedTextProvider itemQualifiedTextProvider = (IItemQualifiedTextProvider) adapterFactory
					.adapt(object, IItemQualifiedTextProvider.class);

				return itemQualifiedTextProvider != null
					? itemQualifiedTextProvider.getQualifiedText(object)
					: getText(object);
			}
		}
	}

	protected UMLItemPropertyDescriptor(AdapterFactory adapterFactory,
			ResourceLocator resourceLocator, String displayName,
			String description, EStructuralFeature feature, boolean isSettable,
			Object staticImage, String category, String[] filterFlags) {
		super(adapterFactory, resourceLocator, displayName, description,
			feature, isSettable, staticImage, category, filterFlags);

		this.itemDelegator = new UMLItemDelegator(adapterFactory,
			resourceLocator);
	}

	public Collection getChoiceOfValues(Object object) {
		Collection comboBoxObjects = getComboBoxObjects(object);

		if (comboBoxObjects != null) {
			List choiceOfValues = new ArrayList(comboBoxObjects);

			if (choiceOfValues != null) {
				Collections.sort(choiceOfValues, new Comparator() {

					public int compare(Object o1, Object o2) {
						return getQualifiedText(o1).compareTo(
							getQualifiedText(o2));
					}
				});
			}

			return choiceOfValues;
		}

		return null;
	}

	public String getQualifiedText(Object object) {
		return ((IItemQualifiedTextProvider) itemDelegator)
			.getQualifiedText(object);
	}

	public String getId(Object object) {
		return getQualifiedText(feature);
	}

}