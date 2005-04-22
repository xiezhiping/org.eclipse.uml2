/*
 * Copyright (c) 2003, 2005 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *
 * $Id: ElementItemProvider.java,v 1.21 2005/04/22 20:55:48 khussey Exp $
 */
package org.eclipse.uml2.provider;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.provider.EModelElementItemProvider;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.FeatureMapUtil;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.eclipse.uml2.Element;
import org.eclipse.uml2.UML2Factory;
import org.eclipse.uml2.UML2Package;

import org.eclipse.uml2.util.UML2Util;

/**
 * This is the item provider adapter for a {@link org.eclipse.uml2.Element} object.
 * <!-- begin-user-doc -->
 * @extends IItemQualifiedTextProvider
 * <!-- end-user-doc -->
 * @generated
 */
public class ElementItemProvider
	extends EModelElementItemProvider
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource,
		IItemQualifiedTextProvider {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2003, 2005 IBM Corporation and others."; //$NON-NLS-1$

	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElementItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addOwnedElementPropertyDescriptor(object);
			addOwnerPropertyDescriptor(object);
			addOwnedCommentPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Owned Element feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOwnedElementPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Element_ownedElement_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_Element_ownedElement_feature", "_UI_Element_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 UML2Package.eINSTANCE.getElement_OwnedElement(),
				 false,
				 null,
				 null,
				 new String[] {
					"org.eclipse.ui.views.properties.expert" //$NON-NLS-1$
				 }));
	}

	/**
	 * This adds a property descriptor for the Owner feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOwnerPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Element_owner_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_Element_owner_feature", "_UI_Element_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 UML2Package.eINSTANCE.getElement_Owner(),
				 false,
				 null,
				 null,
				 new String[] {
					"org.eclipse.ui.views.properties.expert" //$NON-NLS-1$
				 }));
	}

	/**
	 * This adds a property descriptor for the Owned Comment feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOwnedCommentPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Element_ownedComment_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_Element_ownedComment_feature", "_UI_Element_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 UML2Package.eINSTANCE.getElement_OwnedComment(),
				 true,
				 null,
				 null,
				 new String[] {
					"org.eclipse.ui.views.properties.expert" //$NON-NLS-1$
				 }));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Collection getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(UML2Package.eINSTANCE.getElement_OwnedComment());
		}
		return childrenFeatures;
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getText(Object object) {
		return getString("_UI_Element_type"); //$NON-NLS-1$
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(Element.class)) {
			case UML2Package.ELEMENT__OWNED_COMMENT:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds to the collection of {@link org.eclipse.emf.edit.command.CommandParameter}s
	 * describing all of the children that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void collectNewChildDescriptors(Collection newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(UML2Package.eINSTANCE.getElement_OwnedComment(),
				 UML2Factory.eINSTANCE.createComment()));
	}

	/**
	 * This returns the icon image for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getCreateChildImage(Object owner, Object feature, Object child, Collection selection) {
		if (feature instanceof EStructuralFeature && FeatureMapUtil.isFeatureMap((EStructuralFeature)feature)) {
			FeatureMap.Entry entry = (FeatureMap.Entry)child;
			feature = entry.getEStructuralFeature();
			child = entry.getValue();        
		}

		if (feature instanceof EReference && child instanceof EObject) {
			String name = "full/obj16/" + ((EObject)child).eClass().getName(); //$NON-NLS-1$

			try {
				return getResourceLocator().getImage(name);
			}
			catch (Exception e) {
				UML2EditPlugin.INSTANCE.log(e);
			}
		}

		return super.getCreateChildImage(owner, feature, child, selection);
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceLocator getResourceLocator() {
		return UML2EditPlugin.INSTANCE;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.uml2.edit.util.IItemQualifiedLabelProvider#getQualifiedText(java.lang.Object)
	 */
	public String getQualifiedText(Object object) {
		return UML2Util.getQualifiedText((EObject) object, new UML2Util.QualifiedTextProvider() {

			public String getFeatureText(EStructuralFeature eStructuralFeature) {
				return ElementItemProvider.this.getFeatureText(eStructuralFeature);
			}

			public String getClassText(EObject eObject) {
				return getTypeText(eObject);
			}

		});
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.emf.edit.provider.ItemProviderAdapter#createItemPropertyDescriptor(org.eclipse.emf.common.notify.AdapterFactory,
	 *      org.eclipse.emf.common.util.ResourceLocator, java.lang.String,
	 *      java.lang.String, org.eclipse.emf.ecore.EStructuralFeature, boolean,
	 *      java.lang.Object, java.lang.String, java.lang.String[])
	 */
	protected ItemPropertyDescriptor createItemPropertyDescriptor(
			AdapterFactory adapterFactory, ResourceLocator resourceLocator,
			String displayName, String description, EStructuralFeature feature,
			boolean isSettable, Object staticImage, String category,
			String[] filterFlags) {
		return new UML2ItemPropertyDescriptor(adapterFactory, resourceLocator,
			displayName, description, feature, isSettable, staticImage,
			category, filterFlags);
	}
	
	protected static class UML2ItemPropertyDescriptor
			extends ItemPropertyDescriptor
			implements IItemQualifiedTextProvider {

		protected class UML2ItemDelegator
				extends ItemDelegator
				implements IItemQualifiedTextProvider {

			protected UML2ItemDelegator(AdapterFactory adapterFactory,
					ResourceLocator resourceLocator) {
				super(adapterFactory, resourceLocator);
			}

			public String getQualifiedText(Object object) {

				if (EList.class.isInstance(object)) {
					StringBuffer text = new StringBuffer();

					for (Iterator i = ((List) object).iterator(); i.hasNext();) {
						Object child = i.next();

						if (0 != text.length()) {
							text.append(", "); //$NON-NLS-1$
						}

						text.append(getQualifiedText(child));
					}

					return text.toString();
				} else {
					IItemQualifiedTextProvider itemQualifiedTextProvider = (IItemQualifiedTextProvider) adapterFactory
						.adapt(object, IItemQualifiedTextProvider.class);

					return null != itemQualifiedTextProvider
						? itemQualifiedTextProvider.getQualifiedText(object)
						: getText(object);
				}
			}
		}

		protected UML2ItemPropertyDescriptor(AdapterFactory adapterFactory,
				ResourceLocator resourceLocator, String displayName,
				String description, EStructuralFeature feature,
				boolean isSettable, Object staticImage, String category,
				String[] filterFlags) {
			super(adapterFactory, resourceLocator, displayName, description,
				feature, isSettable, staticImage, category, filterFlags);

			this.itemDelegator = new UML2ItemDelegator(adapterFactory,
				resourceLocator);
		}

		public UML2ItemPropertyDescriptor(AdapterFactory adapterFactory,
				ResourceLocator resourceLocator, String displayName,
				String description, EStructuralFeature feature,
				boolean isSettable) {
			super(adapterFactory, resourceLocator, displayName, description,
				feature, isSettable);

			this.itemDelegator = new UML2ItemDelegator(adapterFactory,
				resourceLocator);
		}

		public UML2ItemPropertyDescriptor(AdapterFactory adapterFactory,
				ResourceLocator resourceLocator, String displayName,
				String description, EStructuralFeature feature,
				boolean isSettable, Object staticImage) {
			super(adapterFactory, resourceLocator, displayName, description,
				feature, isSettable, staticImage);

			this.itemDelegator = new UML2ItemDelegator(adapterFactory,
				resourceLocator);
		}

		public UML2ItemPropertyDescriptor(AdapterFactory adapterFactory,
				ResourceLocator resourceLocator, String displayName,
				String description, EStructuralFeature feature,
				boolean isSettable, String category, String[] filterFlags) {
			super(adapterFactory, resourceLocator, displayName, description,
				feature, isSettable, category, filterFlags);

			this.itemDelegator = new UML2ItemDelegator(adapterFactory,
				resourceLocator);
		}

		public Collection getChoiceOfValues(Object object) {
			Collection comboBoxObjects = getComboBoxObjects(object);

			if (null != comboBoxObjects) {
				List choiceOfValues = new ArrayList(comboBoxObjects);

				if (null != choiceOfValues) {
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
			return ((IItemQualifiedTextProvider) itemDelegator).getQualifiedText(object);
		}
	}



}
