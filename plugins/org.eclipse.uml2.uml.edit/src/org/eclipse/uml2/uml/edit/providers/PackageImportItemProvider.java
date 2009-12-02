/*
 * Copyright (c) 2005, 2009 IBM Corporation, Embarcadero Technologies, and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *   Kenn Hussey (Embarcadero Technologies) - 215418, 204200
 *
 * $Id: PackageImportItemProvider.java,v 1.13 2009/12/02 18:27:48 jbruck Exp $
 */
package org.eclipse.uml2.uml.edit.providers;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemColorProvider;
import org.eclipse.emf.edit.provider.IItemFontProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.eclipse.uml2.uml.PackageImport;
import org.eclipse.uml2.uml.UMLPackage;

//import org.eclipse.uml2.uml.VisibilityKind;

/**
 * This is the item provider adapter for a {@link org.eclipse.uml2.uml.PackageImport} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class PackageImportItemProvider
		extends DirectedRelationshipItemProvider
		implements IEditingDomainItemProvider, IStructuredItemContentProvider,
		ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource,
		IItemColorProvider, IItemFontProvider {

	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PackageImportItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addVisibilityPropertyDescriptor(object);
			addImportedPackagePropertyDescriptor(object);
			addImportingNamespacePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Visibility feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addVisibilityPropertyDescriptor(Object object) {
		itemPropertyDescriptors
			.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory)
					.getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_PackageImport_visibility_feature"), //$NON-NLS-1$
				getString(
					"_UI_PropertyDescriptor_description", "_UI_PackageImport_visibility_feature", "_UI_PackageImport_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				UMLPackage.Literals.PACKAGE_IMPORT__VISIBILITY, true, false,
				false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Imported Package feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addImportedPackagePropertyDescriptor(Object object) {
		itemPropertyDescriptors
			.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory)
					.getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_PackageImport_importedPackage_feature"), //$NON-NLS-1$
				getString(
					"_UI_PropertyDescriptor_description", "_UI_PackageImport_importedPackage_feature", "_UI_PackageImport_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				UMLPackage.Literals.PACKAGE_IMPORT__IMPORTED_PACKAGE, true,
				false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Importing Namespace feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addImportingNamespacePropertyDescriptor(Object object) {
		itemPropertyDescriptors
			.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory)
					.getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_PackageImport_importingNamespace_feature"), //$NON-NLS-1$
				getString(
					"_UI_PropertyDescriptor_description", "_UI_PackageImport_importingNamespace_feature", "_UI_PackageImport_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				UMLPackage.Literals.PACKAGE_IMPORT__IMPORTING_NAMESPACE, true,
				false, true, null, null,
				new String[]{"org.eclipse.ui.views.properties.expert" //$NON-NLS-1$
				}));
	}

	/**
	 * This returns PackageImport.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage(
			"full/obj16/PackageImport")); //$NON-NLS-1$
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean shouldComposeCreationImage() {
		return true;
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public String getText(Object object) {
		return appendLabel(
			appendType(appendKeywords(new StringBuffer(), object),
				"_UI_PackageImport_type"), ((PackageImport) object).getImportedPackage()).toString(); //$NON-NLS-1$
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(PackageImport.class)) {
			case UMLPackage.PACKAGE_IMPORT__VISIBILITY :
			case UMLPackage.PACKAGE_IMPORT__IMPORTED_PACKAGE :
				fireNotifyChanged(new ViewerNotification(notification,
					notification.getNotifier(), false, true));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(
			Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);
	}

	@Override
	public Object getForeground(Object object) {
		org.eclipse.uml2.uml.Package importedPackage = ((PackageImport) object)
			.getImportedPackage();
		return importedPackage != null && importedPackage.eIsProxy()
			? IItemColorProvider.GRAYED_OUT_COLOR
			: super.getForeground(object);
	}

}