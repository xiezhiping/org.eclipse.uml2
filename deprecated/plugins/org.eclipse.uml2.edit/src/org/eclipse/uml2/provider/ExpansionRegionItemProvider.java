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
package org.eclipse.uml2.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.eclipse.uml2.ExpansionRegion;
import org.eclipse.uml2.UML2Package;

/**
 * This is the item provider adapter for a {@link org.eclipse.uml2.ExpansionRegion} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ExpansionRegionItemProvider
	extends StructuredActivityNodeItemProvider
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2003, 2004 IBM Corporation and others."; //$NON-NLS-1$

	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpansionRegionItemProvider(AdapterFactory adapterFactory) {
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

			addModePropertyDescriptor(object);
			addOutputElementPropertyDescriptor(object);
			addInputElementPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Mode feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addModePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(new ItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getString("_UI_ExpansionRegion_mode_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_ExpansionRegion_mode_feature", "_UI_ExpansionRegion_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 UML2Package.eINSTANCE.getExpansionRegion_Mode(),
				 true,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE));
	}

	/**
	 * This adds a property descriptor for the Output Element feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOutputElementPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(new ItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getString("_UI_ExpansionRegion_outputElement_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_ExpansionRegion_outputElement_feature", "_UI_ExpansionRegion_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 UML2Package.eINSTANCE.getExpansionRegion_OutputElement(),
				 true));
	}

	/**
	 * This adds a property descriptor for the Input Element feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInputElementPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(new ItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getString("_UI_ExpansionRegion_inputElement_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_ExpansionRegion_inputElement_feature", "_UI_ExpansionRegion_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 UML2Package.eINSTANCE.getExpansionRegion_InputElement(),
				 true));
	}


	/**
	 * This returns ExpansionRegion.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getImage(Object object) {
		return getResourceLocator().getImage("full/obj16/ExpansionRegion"); //$NON-NLS-1$
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getText(Object object) {
		String label = ((ExpansionRegion)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_ExpansionRegion_type") : //$NON-NLS-1$
			getString("_UI_ExpansionRegion_type") + " " + label; //$NON-NLS-1$ //$NON-NLS-2$
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

		switch (notification.getFeatureID(ExpansionRegion.class)) {
			case UML2Package.EXPANSION_REGION__MODE:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
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
	}

	/**
	 * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCreateChildText(Object owner, Object feature, Object child, Collection selection) {
		boolean qualify =
			feature == UML2Package.eINSTANCE.getAction_LocalPrecondition() ||
			feature == UML2Package.eINSTANCE.getAction_LocalPostcondition() ||
			feature == UML2Package.eINSTANCE.getNamespace_OwnedRule();
		return getString(
			qualify ? "_UI_CreateChild_text2" : "_UI_CreateChild_text", //$NON-NLS-1$ //$NON-NLS-2$
			new Object[] { getTypeText(child), getFeatureText(feature), getTypeText(owner) });
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
}
