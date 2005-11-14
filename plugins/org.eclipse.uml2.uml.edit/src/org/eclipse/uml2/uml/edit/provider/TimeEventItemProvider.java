/*
 * Copyright (c) 2005 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *
 * $Id: TimeEventItemProvider.java,v 1.1 2005/11/14 22:11:34 khussey Exp $
 */
package org.eclipse.uml2.uml.edit.provider;

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

import org.eclipse.uml2.uml.TimeEvent;
import org.eclipse.uml2.uml.UMLFactory;
import org.eclipse.uml2.uml.UMLPackage;

import org.eclipse.uml2.uml.edit.UMLEditPlugin;

/**
 * This is the item provider adapter for a {@link org.eclipse.uml2.uml.TimeEvent} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class TimeEventItemProvider
		extends EventItemProvider
		implements IEditingDomainItemProvider, IStructuredItemContentProvider,
		ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {

	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeEventItemProvider(AdapterFactory adapterFactory) {
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

			addIsRelativePropertyDescriptor(object);
			addWhenPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Is Relative feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIsRelativePropertyDescriptor(Object object) {
		itemPropertyDescriptors
			.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory)
					.getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_TimeEvent_isRelative_feature"), //$NON-NLS-1$
				getString(
					"_UI_PropertyDescriptor_description", "_UI_TimeEvent_isRelative_feature", "_UI_TimeEvent_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				UMLPackage.eINSTANCE.getTimeEvent_IsRelative(), true,
				ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the When feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addWhenPropertyDescriptor(Object object) {
		itemPropertyDescriptors
			.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory)
					.getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_TimeEvent_when_feature"), //$NON-NLS-1$
				getString(
					"_UI_PropertyDescriptor_description", "_UI_TimeEvent_when_feature", "_UI_TimeEvent_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				UMLPackage.eINSTANCE.getTimeEvent_When(), true, null, null,
				new String[]{"org.eclipse.ui.views.properties.expert" //$NON-NLS-1$
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
			childrenFeatures.add(UMLPackage.eINSTANCE.getTimeEvent_When());
		}
		return childrenFeatures;
	}

	/**
	 * This returns TimeEvent.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getImage(Object object) {
		return getResourceLocator().getImage("full/obj16/TimeEvent"); //$NON-NLS-1$
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getText(Object object) {
		String label = ((TimeEvent) object).getName();
		return label == null || label.length() == 0
			? getString("_UI_TimeEvent_type") : //$NON-NLS-1$
			getString("_UI_TimeEvent_type") + " " + label; //$NON-NLS-1$ //$NON-NLS-2$
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

		switch (notification.getFeatureID(TimeEvent.class)) {
			case UMLPackage.TIME_EVENT__IS_RELATIVE :
				fireNotifyChanged(new ViewerNotification(notification,
					notification.getNotifier(), false, true));
				return;
			case UMLPackage.TIME_EVENT__WHEN :
				fireNotifyChanged(new ViewerNotification(notification,
					notification.getNotifier(), true, false));
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
	protected void collectNewChildDescriptors(Collection newChildDescriptors,
			Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors
			.add(createChildParameter(UMLPackage.eINSTANCE.getTimeEvent_When(),
				UMLFactory.eINSTANCE.createOpaqueExpression()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getTimeEvent_When(), UMLFactory.eINSTANCE.createExpression()));

		newChildDescriptors
			.add(createChildParameter(UMLPackage.eINSTANCE.getTimeEvent_When(),
				UMLFactory.eINSTANCE.createStringExpression()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getTimeEvent_When(), UMLFactory.eINSTANCE.createLiteralInteger()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getTimeEvent_When(), UMLFactory.eINSTANCE.createLiteralString()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getTimeEvent_When(), UMLFactory.eINSTANCE.createLiteralBoolean()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getTimeEvent_When(), UMLFactory.eINSTANCE.createLiteralNull()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getTimeEvent_When(), UMLFactory.eINSTANCE.createInstanceValue()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getTimeEvent_When(), UMLFactory.eINSTANCE
			.createLiteralUnlimitedNatural()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getTimeEvent_When(), UMLFactory.eINSTANCE.createTimeExpression()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getTimeEvent_When(), UMLFactory.eINSTANCE.createDuration()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getTimeEvent_When(), UMLFactory.eINSTANCE.createInterval()));

		newChildDescriptors
			.add(createChildParameter(UMLPackage.eINSTANCE.getTimeEvent_When(),
				UMLFactory.eINSTANCE.createDurationInterval()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getTimeEvent_When(), UMLFactory.eINSTANCE.createTimeInterval()));
	}

	/**
	 * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCreateChildText(Object owner, Object feature,
			Object child, Collection selection) {
		Object childFeature = feature;
		Object childObject = child;

		boolean qualify = childFeature == UMLPackage.eINSTANCE
			.getNamedElement_NameExpression()
			|| childFeature == UMLPackage.eINSTANCE.getTimeEvent_When();

		if (qualify) {
			return getString("_UI_CreateChild_text2", //$NON-NLS-1$
				new Object[]{getTypeText(childObject),
					getFeatureText(childFeature), getTypeText(owner)});
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceLocator getResourceLocator() {
		return UMLEditPlugin.INSTANCE;
	}

}
